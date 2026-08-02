package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public class SQLiteCursor extends net.zetetic.database.AbstractWindowedCursor {
    private static boolean CURSOR_WINDOW_NEEDS_RECREATED = false;
    private static final int DEFAULT_CURSOR_WINDOW_SIZE = -1;
    static final int NO_COUNT = -1;
    public static int PREFERRED_CURSOR_WINDOW_SIZE = -1;
    static final java.lang.String TAG = "SQLiteCursor";
    private java.util.Map<java.lang.String, java.lang.Integer> mColumnNameMap;
    private final java.lang.String[] mColumns;
    private int mCount;
    private int mCursorWindowCapacity;
    private final net.zetetic.database.sqlcipher.SQLiteCursorDriver mDriver;
    private final java.lang.String mEditTable;
    private final net.zetetic.database.sqlcipher.SQLiteQuery mQuery;

    @java.lang.Deprecated
    public SQLiteCursor(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, net.zetetic.database.sqlcipher.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, net.zetetic.database.sqlcipher.SQLiteQuery sQLiteQuery) {
        this(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public SQLiteCursor(net.zetetic.database.sqlcipher.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, net.zetetic.database.sqlcipher.SQLiteQuery sQLiteQuery) {
        this.mCount = -1;
        if (sQLiteQuery == null) {
            throw new java.lang.IllegalArgumentException("query object cannot be null");
        }
        this.mDriver = sQLiteCursorDriver;
        this.mEditTable = str;
        this.mColumnNameMap = null;
        this.mQuery = sQLiteQuery;
        this.mColumns = sQLiteQuery.getColumnNames();
    }

    public net.zetetic.database.sqlcipher.SQLiteDatabase getDatabase() {
        return this.mQuery.getDatabase();
    }

    @Override // net.zetetic.database.AbstractCursor
    public boolean onMove(int i, int i2) {
        if (this.mWindow != null && i2 >= this.mWindow.getStartPosition() && i2 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            return true;
        }
        fillWindow(i2);
        return true;
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    public static void setCursorWindowSize(int i) {
        net.zetetic.database.CursorWindow.PREFERRED_CURSOR_WINDOW_SIZE = i;
        CURSOR_WINDOW_NEEDS_RECREATED = true;
    }

    public static void resetCursorWindowSize() {
        net.zetetic.database.CursorWindow.PREFERRED_CURSOR_WINDOW_SIZE = 16384;
        CURSOR_WINDOW_NEEDS_RECREATED = true;
    }

    private void awc_clearOrCreateWindow(java.lang.String str) {
        int i = net.zetetic.database.CursorWindow.PREFERRED_CURSOR_WINDOW_SIZE;
        if (CURSOR_WINDOW_NEEDS_RECREATED) {
            awc_closeWindow();
            CURSOR_WINDOW_NEEDS_RECREATED = false;
        }
        net.zetetic.database.CursorWindow window = getWindow();
        if (window == null) {
            setWindow(new net.zetetic.database.CursorWindow(str, i));
        } else {
            window.clear();
        }
    }

    private void awc_closeWindow() {
        setWindow(null);
    }

    private void fillWindow(int i) {
        awc_clearOrCreateWindow(getDatabase().getPath());
        try {
            if (this.mCount == -1) {
                this.mCount = this.mQuery.fillWindow(this.mWindow, net.zetetic.database.DatabaseUtils.cursorPickFillWindowStartPosition(i, 0), i, true);
                this.mCursorWindowCapacity = this.mWindow.getNumRows();
                if (net.zetetic.database.Logger.isLoggable(TAG, 3)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("received count(*) from native_fill_window: ");
                    sb.append(this.mCount);
                    net.zetetic.database.Logger.d(TAG, sb.toString());
                    return;
                }
                return;
            }
            this.mQuery.fillWindow(this.mWindow, net.zetetic.database.DatabaseUtils.cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity), i, false);
        } catch (java.lang.RuntimeException e) {
            awc_closeWindow();
            throw e;
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        if (this.mColumnNameMap == null) {
            java.lang.String[] strArr = this.mColumns;
            int length = strArr.length;
            java.util.HashMap hashMap = new java.util.HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], java.lang.Integer.valueOf(i));
            }
            this.mColumnNameMap = hashMap;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            net.zetetic.database.Logger.e(TAG, "requesting column name with table name -- ".concat(java.lang.String.valueOf(str)), new java.lang.Exception());
            str = str.substring(lastIndexOf + 1);
        }
        java.lang.Integer num = this.mColumnNameMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.mDriver.cursorDeactivated();
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this) {
            this.mQuery.close();
            this.mDriver.cursorClosed();
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            if (!this.mQuery.getDatabase().isOpen()) {
                return false;
            }
            if (this.mWindow != null) {
                this.mWindow.clear();
            }
            this.mPos = -1;
            this.mCount = -1;
            this.mDriver.cursorRequeried(this);
            try {
                return super.requery();
            } catch (java.lang.IllegalStateException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("requery() failed ");
                sb.append(e.getMessage());
                net.zetetic.database.Logger.w(TAG, sb.toString(), e);
                return false;
            }
        }
    }

    @Override // net.zetetic.database.AbstractWindowedCursor
    public void setWindow(net.zetetic.database.CursorWindow cursorWindow) {
        super.setWindow(cursorWindow);
        this.mCount = -1;
    }

    public void setSelectionArguments(java.lang.String[] strArr) {
        this.mDriver.setBindArguments(strArr);
    }

    @Override // net.zetetic.database.AbstractCursor
    public void finalize() {
        try {
            if (this.mWindow != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }
}
