package net.zetetic.database;

/* loaded from: classes5.dex */
public abstract class AbstractCursor implements android.database.Cursor {
    private static final java.lang.String TAG = "Cursor";
    protected boolean mClosed;
    protected android.content.ContentResolver mContentResolver;
    private android.net.Uri mNotifyUri;
    private android.database.ContentObserver mSelfObserver;
    private boolean mSelfObserverRegistered;
    private final java.lang.Object mSelfObserverLock = new java.lang.Object();
    private final android.database.DataSetObservable mDataSetObservable = new android.database.DataSetObservable();
    private final android.database.ContentObservable mContentObservable = new android.database.ContentObservable();
    private android.os.Bundle mExtras = android.os.Bundle.EMPTY;
    protected int mPos = -1;

    @Override // android.database.Cursor
    public abstract java.lang.String[] getColumnNames();

    @Override // android.database.Cursor
    public abstract int getCount();

    @Override // android.database.Cursor
    public abstract double getDouble(int i);

    @Override // android.database.Cursor
    public abstract float getFloat(int i);

    @Override // android.database.Cursor
    public abstract int getInt(int i);

    @Override // android.database.Cursor
    public abstract long getLong(int i);

    @Override // android.database.Cursor
    public abstract short getShort(int i);

    @Override // android.database.Cursor
    public abstract java.lang.String getString(int i);

    @Override // android.database.Cursor
    public abstract int getType(int i);

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public abstract boolean isNull(int i);

    public abstract boolean onMove(int i, int i2);

    public void fillWindow(int i, net.zetetic.database.CursorWindow cursorWindow) {
        net.zetetic.database.DatabaseUtils.cursorFillWindow(this, i, cursorWindow);
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i) {
        throw new java.lang.UnsupportedOperationException("getBlob is not supported");
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // android.database.Cursor
    public void deactivate() {
        onDeactivateOrClose();
    }

    protected void onDeactivateOrClose() {
        android.database.ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null) {
            this.mContentResolver.unregisterContentObserver(contentObserver);
            this.mSelfObserverRegistered = false;
        }
        this.mDataSetObservable.notifyInvalidated();
    }

    @Override // android.database.Cursor
    public boolean requery() {
        android.database.ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null && !this.mSelfObserverRegistered) {
            this.mContentResolver.registerContentObserver(this.mNotifyUri, true, contentObserver);
            this.mSelfObserverRegistered = true;
        }
        this.mDataSetObservable.notifyChanged();
        return true;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return this.mClosed;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mClosed = true;
        this.mContentObservable.unregisterAll();
        onDeactivateOrClose();
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i, android.database.CharArrayBuffer charArrayBuffer) {
        java.lang.String string = getString(i);
        if (string != null) {
            char[] cArr = charArrayBuffer.data;
            if (cArr == null || cArr.length < string.length()) {
                charArrayBuffer.data = string.toCharArray();
            } else {
                string.getChars(0, string.length(), cArr, 0);
            }
            charArrayBuffer.sizeCopied = string.length();
            return;
        }
        charArrayBuffer.sizeCopied = 0;
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.mPos;
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        int count = getCount();
        if (i >= count) {
            this.mPos = count;
            return false;
        }
        if (i < 0) {
            this.mPos = -1;
            return false;
        }
        int i2 = this.mPos;
        if (i == i2) {
            return true;
        }
        boolean onMove = onMove(i2, i);
        if (!onMove) {
            this.mPos = -1;
            return onMove;
        }
        this.mPos = i;
        return onMove;
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        return moveToPosition(this.mPos + i);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return moveToPosition(this.mPos + 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return moveToPosition(this.mPos - 1);
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.mPos == 0 && getCount() != 0;
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        int count = getCount();
        return this.mPos == count + (-1) && count != 0;
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return getCount() == 0 || this.mPos == -1;
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return getCount() == 0 || this.mPos == getCount();
    }

    @Override // android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            net.zetetic.database.Logger.e(TAG, "requesting column name with table name -- ".concat(java.lang.String.valueOf(str)), new java.lang.Exception());
            str = str.substring(lastIndexOf + 1);
        }
        java.lang.String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (columnNames[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("column '");
        sb.append(str);
        sb.append("' does not exist");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.database.Cursor
    public java.lang.String getColumnName(int i) {
        return getColumnNames()[i];
    }

    @Override // android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        this.mContentObservable.registerObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        if (this.mClosed) {
            return;
        }
        this.mContentObservable.unregisterObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.mDataSetObservable.registerObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.mDataSetObservable.unregisterObserver(dataSetObserver);
    }

    protected void onChange(boolean z) {
        synchronized (this.mSelfObserverLock) {
            this.mContentObservable.dispatchChange(z, null);
            android.net.Uri uri = this.mNotifyUri;
            if (uri != null && z) {
                this.mContentResolver.notifyChange(uri, this.mSelfObserver);
            }
        }
    }

    @Override // android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        synchronized (this.mSelfObserverLock) {
            this.mNotifyUri = uri;
            this.mContentResolver = contentResolver;
            android.database.ContentObserver contentObserver = this.mSelfObserver;
            if (contentObserver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
            net.zetetic.database.AbstractCursor.SelfContentObserver selfContentObserver = new net.zetetic.database.AbstractCursor.SelfContentObserver(this);
            this.mSelfObserver = selfContentObserver;
            this.mContentResolver.registerContentObserver(this.mNotifyUri, true, selfContentObserver);
            this.mSelfObserverRegistered = true;
        }
    }

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        android.net.Uri uri;
        synchronized (this.mSelfObserverLock) {
            uri = this.mNotifyUri;
        }
        return uri;
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = android.os.Bundle.EMPTY;
        }
        this.mExtras = bundle;
    }

    @Override // android.database.Cursor
    public android.os.Bundle getExtras() {
        return this.mExtras;
    }

    @Override // android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        return android.os.Bundle.EMPTY;
    }

    protected void checkPosition() {
        if (-1 == this.mPos || getCount() == this.mPos) {
            throw new android.database.CursorIndexOutOfBoundsException(this.mPos, getCount());
        }
    }

    public void finalize() {
        android.database.ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null && this.mSelfObserverRegistered) {
            this.mContentResolver.unregisterContentObserver(contentObserver);
        }
        try {
            if (this.mClosed) {
                return;
            }
            close();
        } catch (java.lang.Exception unused) {
        }
    }

    protected static class SelfContentObserver extends android.database.ContentObserver {
        java.lang.ref.WeakReference<net.zetetic.database.AbstractCursor> mCursor;

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        public SelfContentObserver(net.zetetic.database.AbstractCursor abstractCursor) {
            super(null);
            this.mCursor = new java.lang.ref.WeakReference<>(abstractCursor);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            net.zetetic.database.AbstractCursor abstractCursor = this.mCursor.get();
            if (abstractCursor != null) {
                abstractCursor.onChange(false);
            }
        }
    }
}
