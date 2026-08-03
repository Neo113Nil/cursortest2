package androidx.room;

/* compiled from: RoomTrackingLiveData.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\b\u0010+\u001a\u00020,H\u0014J\b\u0010-\u001a\u00020,H\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010)\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0014¨\u0006."}, d2 = {"Landroidx/room/RoomTrackingLiveData;", "T", "Landroidx/lifecycle/LiveData;", "database", "Landroidx/room/RoomDatabase;", "container", "Landroidx/room/InvalidationLiveDataContainer;", "inTransaction", "", "computeFunction", "Ljava/util/concurrent/Callable;", "tableNames", "", "", "(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationLiveDataContainer;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V", "getComputeFunction", "()Ljava/util/concurrent/Callable;", "computing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getComputing", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "getDatabase", "()Landroidx/room/RoomDatabase;", "getInTransaction", "()Z", "invalid", "getInvalid", "invalidationRunnable", "Ljava/lang/Runnable;", "getInvalidationRunnable", "()Ljava/lang/Runnable;", "observer", "Landroidx/room/InvalidationTracker$Observer;", "getObserver", "()Landroidx/room/InvalidationTracker$Observer;", "queryExecutor", "Ljava/util/concurrent/Executor;", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "refreshRunnable", "getRefreshRunnable", "registeredObserver", "getRegisteredObserver", "onActive", "", "onInactive", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class RoomTrackingLiveData<T> extends androidx.lifecycle.LiveData<T> {
    private final java.util.concurrent.Callable<T> computeFunction;
    private final java.util.concurrent.atomic.AtomicBoolean computing;
    private final androidx.room.InvalidationLiveDataContainer container;
    private final androidx.room.RoomDatabase database;
    private final boolean inTransaction;
    private final java.util.concurrent.atomic.AtomicBoolean invalid;
    private final java.lang.Runnable invalidationRunnable;
    private final androidx.room.InvalidationTracker.Observer observer;
    private final java.lang.Runnable refreshRunnable;
    private final java.util.concurrent.atomic.AtomicBoolean registeredObserver;

    public final androidx.room.RoomDatabase getDatabase() {
        return this.database;
    }

    public final boolean getInTransaction() {
        return this.inTransaction;
    }

    public final java.util.concurrent.Callable<T> getComputeFunction() {
        return this.computeFunction;
    }

    public RoomTrackingLiveData(androidx.room.RoomDatabase database, androidx.room.InvalidationLiveDataContainer container, boolean z, java.util.concurrent.Callable<T> computeFunction, final java.lang.String[] tableNames) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.database = database;
        this.container = container;
        this.inTransaction = z;
        this.computeFunction = computeFunction;
        this.observer = new androidx.room.InvalidationTracker.Observer(tableNames) { // from class: androidx.room.RoomTrackingLiveData$observer$1
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(java.util.Set<java.lang.String> tables) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tables, "tables");
                androidx.arch.core.executor.ArchTaskExecutor.getInstance().executeOnMainThread(this.getInvalidationRunnable());
            }
        };
        this.invalid = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.computing = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.registeredObserver = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.refreshRunnable = new java.lang.Runnable() { // from class: androidx.room.RoomTrackingLiveData$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.RoomTrackingLiveData.refreshRunnable$lambda$0(androidx.room.RoomTrackingLiveData.this);
            }
        };
        this.invalidationRunnable = new java.lang.Runnable() { // from class: androidx.room.RoomTrackingLiveData$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.RoomTrackingLiveData.invalidationRunnable$lambda$1(androidx.room.RoomTrackingLiveData.this);
            }
        };
    }

    public final androidx.room.InvalidationTracker.Observer getObserver() {
        return this.observer;
    }

    public final java.util.concurrent.atomic.AtomicBoolean getInvalid() {
        return this.invalid;
    }

    public final java.util.concurrent.atomic.AtomicBoolean getComputing() {
        return this.computing;
    }

    public final java.util.concurrent.atomic.AtomicBoolean getRegisteredObserver() {
        return this.registeredObserver;
    }

    public final java.lang.Runnable getRefreshRunnable() {
        return this.refreshRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshRunnable$lambda$0(androidx.room.RoomTrackingLiveData this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.registeredObserver.compareAndSet(false, true)) {
            this$0.database.getInvalidationTracker().addWeakObserver(this$0.observer);
        }
        while (this$0.computing.compareAndSet(false, true)) {
            T t = null;
            boolean z = false;
            while (this$0.invalid.compareAndSet(true, false)) {
                try {
                    try {
                        t = this$0.computeFunction.call();
                        z = true;
                    } catch (java.lang.Exception e) {
                        throw new java.lang.RuntimeException("Exception while computing database live data.", e);
                    }
                } finally {
                    this$0.computing.set(false);
                }
            }
            if (z) {
                this$0.postValue(t);
            }
            if (!z || !this$0.invalid.get()) {
                return;
            }
        }
    }

    public final java.lang.Runnable getInvalidationRunnable() {
        return this.invalidationRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(androidx.room.RoomTrackingLiveData this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean hasActiveObservers = this$0.hasActiveObservers();
        if (this$0.invalid.compareAndSet(false, true) && hasActiveObservers) {
            this$0.getQueryExecutor().execute(this$0.refreshRunnable);
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
        super.onActive();
        androidx.room.InvalidationLiveDataContainer invalidationLiveDataContainer = this.container;
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onActive(this);
        getQueryExecutor().execute(this.refreshRunnable);
    }

    @Override // androidx.lifecycle.LiveData
    protected void onInactive() {
        super.onInactive();
        androidx.room.InvalidationLiveDataContainer invalidationLiveDataContainer = this.container;
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onInactive(this);
    }

    public final java.util.concurrent.Executor getQueryExecutor() {
        if (this.inTransaction) {
            return this.database.getTransactionExecutor();
        }
        return this.database.getQueryExecutor();
    }
}
