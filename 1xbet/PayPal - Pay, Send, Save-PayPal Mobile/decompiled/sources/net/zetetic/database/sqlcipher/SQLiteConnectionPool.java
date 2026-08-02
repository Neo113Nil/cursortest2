package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public final class SQLiteConnectionPool implements java.io.Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONNECTION_FLAG_INTERACTIVE = 4;
    public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
    public static final int CONNECTION_FLAG_READ_ONLY = 1;
    private static final long CONNECTION_POOL_BUSY_MILLIS = 30000;
    private static final java.lang.String TAG = "SQLiteConnectionPool";
    private net.zetetic.database.sqlcipher.SQLiteConnection mAvailablePrimaryConnection;
    private final net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration mConfiguration;
    private net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter mConnectionWaiterPool;
    private net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter mConnectionWaiterQueue;
    private boolean mIsOpen;
    private int mMaxConnectionPoolSize;
    private int mNextConnectionId;
    private final net.zetetic.database.sqlcipher.CloseGuard mCloseGuard = net.zetetic.database.sqlcipher.CloseGuard.get();
    private final java.lang.Object mLock = new java.lang.Object();
    private final java.util.concurrent.atomic.AtomicBoolean mConnectionLeaked = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.ArrayList<net.zetetic.database.sqlcipher.SQLiteConnection> mAvailableNonPrimaryConnections = new java.util.ArrayList<>();
    private final java.util.WeakHashMap<net.zetetic.database.sqlcipher.SQLiteConnection, net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus> mAcquiredConnections = new java.util.WeakHashMap<>();

    enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    private static int getPriority(int i) {
        return (i & 4) != 0 ? 1 : 0;
    }

    private SQLiteConnectionPool(net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.mConfiguration = new net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        setMaxConnectionPoolSizeLocked();
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public static net.zetetic.database.sqlcipher.SQLiteConnectionPool open(net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new java.lang.IllegalArgumentException("configuration must not be null.");
        }
        net.zetetic.database.sqlcipher.SQLiteConnectionPool sQLiteConnectionPool = new net.zetetic.database.sqlcipher.SQLiteConnectionPool(sQLiteDatabaseConfiguration);
        sQLiteConnectionPool.open();
        return sQLiteConnectionPool;
    }

    private void open() {
        this.mAvailablePrimaryConnection = openConnectionLocked(this.mConfiguration, true);
        this.mIsOpen = true;
        this.mCloseGuard.open("close");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dispose(false);
    }

    private void dispose(boolean z) {
        net.zetetic.database.sqlcipher.CloseGuard closeGuard = this.mCloseGuard;
        if (closeGuard != null) {
            if (z) {
                closeGuard.warnIfOpen();
            }
            this.mCloseGuard.close();
        }
        if (z) {
            return;
        }
        synchronized (this.mLock) {
            throwIfClosedLocked();
            this.mIsOpen = false;
            closeAvailableConnectionsAndLogExceptionsLocked();
            int size = this.mAcquiredConnections.size();
            if (size != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The connection pool for ");
                sb.append(this.mConfiguration.label);
                sb.append(" has been closed but there are still ");
                sb.append(size);
                sb.append(" connections in use.  They will be closed as they are released back to the pool.");
                net.zetetic.database.Logger.i(TAG, sb.toString());
            }
            wakeConnectionWaitersLocked();
        }
    }

    public final void reconfigure(net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new java.lang.IllegalArgumentException("configuration must not be null.");
        }
        synchronized (this.mLock) {
            throwIfClosedLocked();
            boolean z = ((sQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags) & 536870912) != 0;
            if (z) {
                if (!this.mAcquiredConnections.isEmpty()) {
                    throw new java.lang.IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                }
                closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
            }
            if (sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != this.mConfiguration.foreignKeyConstraintsEnabled && !this.mAcquiredConnections.isEmpty()) {
                throw new java.lang.IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
            }
            if (!java.util.Arrays.equals(sQLiteDatabaseConfiguration.password, this.mConfiguration.password)) {
                this.mAvailablePrimaryConnection.changePassword(sQLiteDatabaseConfiguration.password);
                this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
                reconfigureAllConnectionsLocked();
            }
            if (this.mConfiguration.openFlags != sQLiteDatabaseConfiguration.openFlags) {
                if (z) {
                    closeAvailableConnectionsAndLogExceptionsLocked();
                }
                net.zetetic.database.sqlcipher.SQLiteConnection openConnectionLocked = openConnectionLocked(sQLiteDatabaseConfiguration, true);
                closeAvailableConnectionsAndLogExceptionsLocked();
                discardAcquiredConnectionsLocked();
                this.mAvailablePrimaryConnection = openConnectionLocked;
                this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                setMaxConnectionPoolSizeLocked();
            } else {
                this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                setMaxConnectionPoolSizeLocked();
                closeExcessConnectionsAndLogExceptionsLocked();
                reconfigureAllConnectionsLocked();
            }
            wakeConnectionWaitersLocked();
        }
    }

    public final net.zetetic.database.sqlcipher.SQLiteConnection acquireConnection(java.lang.String str, int i, android.os.CancellationSignal cancellationSignal) {
        return waitForConnection(str, i, cancellationSignal);
    }

    public final void releaseConnection(net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection) {
        synchronized (this.mLock) {
            net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus remove = this.mAcquiredConnections.remove(sQLiteConnection);
            if (remove == null) {
                throw new java.lang.IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            }
            if (!this.mIsOpen) {
                closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            } else if (sQLiteConnection.isPrimaryConnection()) {
                if (recycleConnectionLocked(sQLiteConnection, remove)) {
                    this.mAvailablePrimaryConnection = sQLiteConnection;
                }
                wakeConnectionWaitersLocked();
            } else if (this.mAvailableNonPrimaryConnections.size() >= this.mMaxConnectionPoolSize - 1) {
                closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            } else {
                if (recycleConnectionLocked(sQLiteConnection, remove)) {
                    this.mAvailableNonPrimaryConnections.add(sQLiteConnection);
                }
                wakeConnectionWaitersLocked();
            }
        }
    }

    private boolean recycleConnectionLocked(net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection, net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus.RECONFIGURE) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (java.lang.RuntimeException e) {
                net.zetetic.database.Logger.e(TAG, "Failed to reconfigure released connection, closing it: ".concat(java.lang.String.valueOf(sQLiteConnection)), e);
                acquiredConnectionStatus = net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        closeConnectionAndLogExceptionsLocked(sQLiteConnection);
        return false;
    }

    public final boolean shouldYieldConnection(net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection, int i) {
        synchronized (this.mLock) {
            if (!this.mAcquiredConnections.containsKey(sQLiteConnection)) {
                throw new java.lang.IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            }
            if (!this.mIsOpen) {
                return false;
            }
            return isSessionBlockingImportantConnectionWaitersLocked(sQLiteConnection.isPrimaryConnection(), i);
        }
    }

    public final void collectDbStats(java.util.ArrayList<net.zetetic.database.sqlcipher.SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
            if (sQLiteConnection != null) {
                sQLiteConnection.collectDbStats(arrayList);
            }
            java.util.Iterator<net.zetetic.database.sqlcipher.SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
            while (it.hasNext()) {
                it.next().collectDbStats(arrayList);
            }
            java.util.Iterator<net.zetetic.database.sqlcipher.SQLiteConnection> it2 = this.mAcquiredConnections.keySet().iterator();
            while (it2.hasNext()) {
                it2.next().collectDbStatsUnsafe(arrayList);
            }
        }
    }

    private net.zetetic.database.sqlcipher.SQLiteConnection openConnectionLocked(net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z) {
        int i = this.mNextConnectionId;
        this.mNextConnectionId = i + 1;
        return net.zetetic.database.sqlcipher.SQLiteConnection.open(this, sQLiteDatabaseConfiguration, i, z);
    }

    final void onConnectionLeaked() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("A SQLiteConnection object for database '");
        sb.append(this.mConfiguration.label);
        sb.append("' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
        net.zetetic.database.Logger.w(TAG, sb.toString());
        this.mConnectionLeaked.set(true);
    }

    private void closeAvailableConnectionsAndLogExceptionsLocked() {
        closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
        net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            this.mAvailablePrimaryConnection = null;
        }
    }

    private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        for (int i = 0; i < size; i++) {
            closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.get(i));
        }
        this.mAvailableNonPrimaryConnections.clear();
    }

    private void closeExcessConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        while (true) {
            int i = size - 1;
            if (size <= this.mMaxConnectionPoolSize - 1) {
                return;
            }
            closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.remove(i));
            size = i;
        }
    }

    private void closeConnectionAndLogExceptionsLocked(net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.close();
        } catch (java.lang.RuntimeException e) {
            net.zetetic.database.Logger.e(TAG, "Failed to close connection, its fate is now in the hands of the merciful GC: ".concat(java.lang.String.valueOf(sQLiteConnection)), e);
        }
    }

    private void discardAcquiredConnectionsLocked() {
        markAcquiredConnectionsLocked(net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD);
    }

    private void reconfigureAllConnectionsLocked() {
        net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (java.lang.RuntimeException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to reconfigure available primary connection, closing it: ");
                sb.append(this.mAvailablePrimaryConnection);
                net.zetetic.database.Logger.e(TAG, sb.toString(), e);
                closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
                this.mAvailablePrimaryConnection = null;
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        int i = 0;
        while (i < size) {
            net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection2 = this.mAvailableNonPrimaryConnections.get(i);
            try {
                sQLiteConnection2.reconfigure(this.mConfiguration);
            } catch (java.lang.RuntimeException e2) {
                net.zetetic.database.Logger.e(TAG, "Failed to reconfigure available non-primary connection, closing it: ".concat(java.lang.String.valueOf(sQLiteConnection2)), e2);
                closeConnectionAndLogExceptionsLocked(sQLiteConnection2);
                this.mAvailableNonPrimaryConnections.remove(i);
                size--;
                i--;
            }
            i++;
        }
        markAcquiredConnectionsLocked(net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus.RECONFIGURE);
    }

    private void markAcquiredConnectionsLocked(net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus acquiredConnectionStatus) {
        if (this.mAcquiredConnections.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.mAcquiredConnections.size());
        for (java.util.Map.Entry<net.zetetic.database.sqlcipher.SQLiteConnection, net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
            net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus value = entry.getValue();
            if (acquiredConnectionStatus != value && value != net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.mAcquiredConnections.put((net.zetetic.database.sqlcipher.SQLiteConnection) arrayList.get(i), acquiredConnectionStatus);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private net.zetetic.database.sqlcipher.SQLiteConnection waitForConnection(java.lang.String str, int i, android.os.CancellationSignal cancellationSignal) {
        net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection;
        java.lang.RuntimeException runtimeException;
        net.zetetic.database.sqlcipher.SQLiteConnection tryAcquireNonPrimaryConnectionLocked;
        net.zetetic.database.sqlcipher.SQLiteConnection tryAcquirePrimaryConnectionLocked;
        boolean z = (i & 2) != 0;
        synchronized (this.mLock) {
            throwIfClosedLocked();
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            if (((this.mAvailablePrimaryConnection != null && this.mAvailableNonPrimaryConnections.isEmpty()) || z) && (tryAcquirePrimaryConnectionLocked = tryAcquirePrimaryConnectionLocked(i)) != null) {
                return tryAcquirePrimaryConnectionLocked;
            }
            if (!z && (tryAcquireNonPrimaryConnectionLocked = tryAcquireNonPrimaryConnectionLocked(str, i)) != null) {
                return tryAcquireNonPrimaryConnectionLocked;
            }
            int priority = getPriority(i);
            final net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter obtainConnectionWaiterLocked = obtainConnectionWaiterLocked(java.lang.Thread.currentThread(), android.os.SystemClock.uptimeMillis(), priority, z, str, i);
            net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
            net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter connectionWaiter2 = null;
            while (true) {
                if (connectionWaiter == null) {
                    break;
                }
                if (priority > connectionWaiter.mPriority) {
                    obtainConnectionWaiterLocked.mNext = connectionWaiter;
                    break;
                }
                connectionWaiter2 = connectionWaiter;
                connectionWaiter = connectionWaiter.mNext;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.mNext = obtainConnectionWaiterLocked;
            } else {
                this.mConnectionWaiterQueue = obtainConnectionWaiterLocked;
            }
            final int i2 = obtainConnectionWaiterLocked.mNonce;
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: net.zetetic.database.sqlcipher.SQLiteConnectionPool.1
                    @Override // android.os.CancellationSignal.OnCancelListener
                    public void onCancel() {
                        synchronized (net.zetetic.database.sqlcipher.SQLiteConnectionPool.this.mLock) {
                            if (obtainConnectionWaiterLocked.mNonce == i2) {
                                net.zetetic.database.sqlcipher.SQLiteConnectionPool.this.cancelConnectionWaiterLocked(obtainConnectionWaiterLocked);
                            }
                        }
                    }
                });
            }
            try {
                long j = obtainConnectionWaiterLocked.mStartTime + 30000;
                long j2 = 30000;
                while (true) {
                    if (this.mConnectionLeaked.compareAndSet(true, false)) {
                        synchronized (this.mLock) {
                            wakeConnectionWaitersLocked();
                        }
                    }
                    java.util.concurrent.locks.LockSupport.parkNanos(this, j2 * 1000000);
                    java.lang.Thread.interrupted();
                    synchronized (this.mLock) {
                        throwIfClosedLocked();
                        sQLiteConnection = obtainConnectionWaiterLocked.mAssignedConnection;
                        runtimeException = obtainConnectionWaiterLocked.mException;
                        if (sQLiteConnection != null || runtimeException != null) {
                            break;
                        }
                        long uptimeMillis = android.os.SystemClock.uptimeMillis();
                        if (uptimeMillis < j) {
                            j2 = uptimeMillis - j;
                        } else {
                            logConnectionPoolBusyLocked(uptimeMillis - obtainConnectionWaiterLocked.mStartTime, i);
                            j = uptimeMillis + 30000;
                            j2 = 30000;
                        }
                    }
                    return sQLiteConnection;
                }
                recycleConnectionWaiterLocked(obtainConnectionWaiterLocked);
                if (sQLiteConnection != null) {
                    return sQLiteConnection;
                }
                throw runtimeException;
            } finally {
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelConnectionWaiterLocked(net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter connectionWaiter) {
        if (connectionWaiter.mAssignedConnection == null && connectionWaiter.mException == null) {
            net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter connectionWaiter2 = null;
            for (net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter connectionWaiter3 = this.mConnectionWaiterQueue; connectionWaiter3 != connectionWaiter; connectionWaiter3 = connectionWaiter3.mNext) {
                connectionWaiter2 = connectionWaiter3;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.mNext = connectionWaiter.mNext;
            } else {
                this.mConnectionWaiterQueue = connectionWaiter.mNext;
            }
            connectionWaiter.mException = new android.os.OperationCanceledException();
            java.util.concurrent.locks.LockSupport.unpark(connectionWaiter.mThread);
            wakeConnectionWaitersLocked();
        }
    }

    private void logConnectionPoolBusyLocked(long j, int i) {
        int i2;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The connection pool for database '");
        sb.append(this.mConfiguration.label);
        sb.append("' has been unable to grant a connection to thread ");
        sb.append(currentThread.getId());
        sb.append(" (");
        sb.append(currentThread.getName());
        sb.append(") with flags 0x");
        sb.append(java.lang.Integer.toHexString(i));
        sb.append(" for ");
        sb.append(j * 0.001f);
        sb.append(" seconds.\n");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = 0;
        if (this.mAcquiredConnections.isEmpty()) {
            i2 = 0;
        } else {
            java.util.Iterator<net.zetetic.database.sqlcipher.SQLiteConnection> it = this.mAcquiredConnections.keySet().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                java.lang.String describeCurrentOperationUnsafe = it.next().describeCurrentOperationUnsafe();
                if (describeCurrentOperationUnsafe != null) {
                    arrayList.add(describeCurrentOperationUnsafe);
                    i4++;
                } else {
                    i3++;
                }
            }
            i2 = i3;
            i3 = i4;
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size++;
        }
        sb.append("Connections: ");
        sb.append(i3);
        sb.append(" active, ");
        sb.append(i2);
        sb.append(" idle, ");
        sb.append(size);
        sb.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb.append("\nRequests in progress:\n");
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                java.lang.String str = (java.lang.String) it2.next();
                sb.append("  ");
                sb.append(str);
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            }
        }
        net.zetetic.database.Logger.w(TAG, sb.toString());
    }

    private void wakeConnectionWaitersLocked() {
        net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection;
        net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter connectionWaiter2 = null;
        boolean z = false;
        boolean z2 = false;
        while (connectionWaiter != null) {
            boolean z3 = true;
            if (this.mIsOpen) {
                try {
                    if (connectionWaiter.mWantPrimaryConnection || z) {
                        sQLiteConnection = null;
                    } else {
                        sQLiteConnection = tryAcquireNonPrimaryConnectionLocked(connectionWaiter.mSql, connectionWaiter.mConnectionFlags);
                        if (sQLiteConnection == null) {
                            z = true;
                        }
                    }
                    if (sQLiteConnection == null && !z2 && (sQLiteConnection = tryAcquirePrimaryConnectionLocked(connectionWaiter.mConnectionFlags)) == null) {
                        z2 = true;
                    }
                    if (sQLiteConnection != null) {
                        connectionWaiter.mAssignedConnection = sQLiteConnection;
                    } else if (z && z2) {
                        return;
                    } else {
                        z3 = false;
                    }
                } catch (java.lang.RuntimeException e) {
                    connectionWaiter.mException = e;
                }
            }
            net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter connectionWaiter3 = connectionWaiter.mNext;
            if (z3) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.mNext = connectionWaiter3;
                } else {
                    this.mConnectionWaiterQueue = connectionWaiter3;
                }
                connectionWaiter.mNext = null;
                java.util.concurrent.locks.LockSupport.unpark(connectionWaiter.mThread);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    private net.zetetic.database.sqlcipher.SQLiteConnection tryAcquirePrimaryConnectionLocked(int i) {
        net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            this.mAvailablePrimaryConnection = null;
            finishAcquireConnectionLocked(sQLiteConnection, i);
            return sQLiteConnection;
        }
        java.util.Iterator<net.zetetic.database.sqlcipher.SQLiteConnection> it = this.mAcquiredConnections.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().isPrimaryConnection()) {
                return null;
            }
        }
        net.zetetic.database.sqlcipher.SQLiteConnection openConnectionLocked = openConnectionLocked(this.mConfiguration, true);
        finishAcquireConnectionLocked(openConnectionLocked, i);
        return openConnectionLocked;
    }

    private net.zetetic.database.sqlcipher.SQLiteConnection tryAcquireNonPrimaryConnectionLocked(java.lang.String str, int i) {
        int size = this.mAvailableNonPrimaryConnections.size();
        if (size > 1 && str != null) {
            for (int i2 = 0; i2 < size; i2++) {
                net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection = this.mAvailableNonPrimaryConnections.get(i2);
                if (sQLiteConnection.isPreparedStatementInCache(str)) {
                    this.mAvailableNonPrimaryConnections.remove(i2);
                    finishAcquireConnectionLocked(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            net.zetetic.database.sqlcipher.SQLiteConnection remove = this.mAvailableNonPrimaryConnections.remove(size - 1);
            finishAcquireConnectionLocked(remove, i);
            return remove;
        }
        int size2 = this.mAcquiredConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size2++;
        }
        if (size2 >= this.mMaxConnectionPoolSize) {
            return null;
        }
        net.zetetic.database.sqlcipher.SQLiteConnection openConnectionLocked = openConnectionLocked(this.mConfiguration, false);
        finishAcquireConnectionLocked(openConnectionLocked, i);
        return openConnectionLocked;
    }

    private void finishAcquireConnectionLocked(net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection, int i) {
        try {
            sQLiteConnection.setOnlyAllowReadOnlyOperations((i & 1) != 0);
            this.mAcquiredConnections.put(sQLiteConnection, net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus.NORMAL);
        } catch (java.lang.RuntimeException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to prepare acquired connection for session, closing it: ");
            sb.append(sQLiteConnection);
            sb.append(", connectionFlags=");
            sb.append(i);
            net.zetetic.database.Logger.e(TAG, sb.toString());
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            throw e;
        }
    }

    private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean z, int i) {
        net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        if (connectionWaiter == null) {
            return false;
        }
        int priority = getPriority(i);
        while (priority <= connectionWaiter.mPriority) {
            if (z || !connectionWaiter.mWantPrimaryConnection) {
                return true;
            }
            connectionWaiter = connectionWaiter.mNext;
            if (connectionWaiter == null) {
                return false;
            }
        }
        return false;
    }

    private void setMaxConnectionPoolSizeLocked() {
        if ((this.mConfiguration.openFlags & 536870912) != 0) {
            this.mMaxConnectionPoolSize = net.zetetic.database.sqlcipher.SQLiteGlobal.getWALConnectionPoolSize();
        } else {
            this.mMaxConnectionPoolSize = 1;
        }
    }

    private void throwIfClosedLocked() {
        if (!this.mIsOpen) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    private net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter obtainConnectionWaiterLocked(java.lang.Thread thread, long j, int i, boolean z, java.lang.String str, int i2) {
        net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter connectionWaiter = this.mConnectionWaiterPool;
        if (connectionWaiter != null) {
            this.mConnectionWaiterPool = connectionWaiter.mNext;
            connectionWaiter.mNext = null;
        } else {
            connectionWaiter = new net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter();
        }
        connectionWaiter.mThread = thread;
        connectionWaiter.mStartTime = j;
        connectionWaiter.mPriority = i;
        connectionWaiter.mWantPrimaryConnection = z;
        connectionWaiter.mSql = str;
        connectionWaiter.mConnectionFlags = i2;
        return connectionWaiter;
    }

    private void recycleConnectionWaiterLocked(net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter connectionWaiter) {
        connectionWaiter.mNext = this.mConnectionWaiterPool;
        connectionWaiter.mThread = null;
        connectionWaiter.mSql = null;
        connectionWaiter.mAssignedConnection = null;
        connectionWaiter.mException = null;
        connectionWaiter.mNonce++;
        this.mConnectionWaiterPool = connectionWaiter;
    }

    public final void enableLocalizedCollators() {
        net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection;
        synchronized (this.mLock) {
            if (!this.mAcquiredConnections.isEmpty() || (sQLiteConnection = this.mAvailablePrimaryConnection) == null) {
                throw new java.lang.IllegalStateException("Cannot enable localized collators while database is in use");
            }
            sQLiteConnection.enableLocalizedCollators();
        }
    }

    public final void dump(android.util.Printer printer, boolean z) {
        synchronized (this.mLock) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Connection pool for ");
            sb.append(this.mConfiguration.path);
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            printer.println(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("  Open: ");
            sb2.append(this.mIsOpen);
            printer.println(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("  Max connections: ");
            sb3.append(this.mMaxConnectionPoolSize);
            printer.println(sb3.toString());
            printer.println("  Available primary connection:");
            net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
            if (sQLiteConnection != null) {
                sQLiteConnection.dump(printer, z);
            } else {
                printer.println("<none>");
            }
            printer.println("  Available non-primary connections:");
            int i = 0;
            if (!this.mAvailableNonPrimaryConnections.isEmpty()) {
                int size = this.mAvailableNonPrimaryConnections.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.mAvailableNonPrimaryConnections.get(i2).dump(printer, z);
                }
            } else {
                printer.println("<none>");
            }
            printer.println("  Acquired connections:");
            if (!this.mAcquiredConnections.isEmpty()) {
                for (java.util.Map.Entry<net.zetetic.database.sqlcipher.SQLiteConnection, net.zetetic.database.sqlcipher.SQLiteConnectionPool.AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
                    entry.getKey().dumpUnsafe(printer, z);
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append("  Status: ");
                    sb4.append(entry.getValue());
                    printer.println(sb4.toString());
                }
            } else {
                printer.println("<none>");
            }
            printer.println("  Connection waiters:");
            if (this.mConnectionWaiterQueue != null) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
                while (connectionWaiter != null) {
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    sb5.append(i);
                    sb5.append(": waited for ");
                    sb5.append((uptimeMillis - connectionWaiter.mStartTime) * 0.001f);
                    sb5.append(" ms - thread=");
                    sb5.append(connectionWaiter.mThread);
                    sb5.append(", priority=");
                    sb5.append(connectionWaiter.mPriority);
                    sb5.append(", sql='");
                    sb5.append(connectionWaiter.mSql);
                    sb5.append("'");
                    printer.println(sb5.toString());
                    connectionWaiter = connectionWaiter.mNext;
                    i++;
                }
            } else {
                printer.println("<none>");
            }
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SQLiteConnectionPool: ");
        sb.append(this.mConfiguration.path);
        return sb.toString();
    }

    static final class ConnectionWaiter {
        public net.zetetic.database.sqlcipher.SQLiteConnection mAssignedConnection;
        public int mConnectionFlags;
        public java.lang.RuntimeException mException;
        public net.zetetic.database.sqlcipher.SQLiteConnectionPool.ConnectionWaiter mNext;
        public int mNonce;
        public int mPriority;
        public java.lang.String mSql;
        public long mStartTime;
        public java.lang.Thread mThread;
        public boolean mWantPrimaryConnection;

        private ConnectionWaiter() {
        }
    }
}
