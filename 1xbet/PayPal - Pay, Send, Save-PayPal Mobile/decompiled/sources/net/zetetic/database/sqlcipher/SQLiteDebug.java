package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public final class SQLiteDebug {
    public static final boolean DEBUG_LOG_SLOW_QUERIES = false;
    public static final boolean DEBUG_SQL_LOG = net.zetetic.database.Logger.isLoggable("SQLiteLog", 2);
    public static final boolean DEBUG_SQL_STATEMENTS = net.zetetic.database.Logger.isLoggable("SQLiteStatements", 2);
    public static final boolean DEBUG_SQL_TIME = net.zetetic.database.Logger.isLoggable("SQLiteTime", 2);

    /* loaded from: classes17.dex */
    public static class PagerStats {
        public java.util.ArrayList<net.zetetic.database.sqlcipher.SQLiteDebug.DbStats> dbStats;
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    private static native void nativeGetPagerStats(net.zetetic.database.sqlcipher.SQLiteDebug.PagerStats pagerStats);

    private SQLiteDebug() {
    }

    public static final boolean shouldLogSlowQuery(long j) {
        int parseInt = java.lang.Integer.parseInt(java.lang.System.getProperty("db.log.slow_query_threshold", "10000"));
        return parseInt >= 0 && j >= ((long) parseInt);
    }

    /* loaded from: classes17.dex */
    public static class DbStats {
        public java.lang.String cache;
        public java.lang.String dbName;
        public long dbSize;
        public int lookaside;
        public long pageSize;

        public DbStats(java.lang.String str, long j, long j2, int i, int i2, int i3, int i4) {
            this.dbName = str;
            this.pageSize = j2 / okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
            this.dbSize = (j * j2) / okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
            this.lookaside = i;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i2);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(i3);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(i4);
            this.cache = sb.toString();
        }
    }

    public static net.zetetic.database.sqlcipher.SQLiteDebug.PagerStats getDatabaseInfo() {
        net.zetetic.database.sqlcipher.SQLiteDebug.PagerStats pagerStats = new net.zetetic.database.sqlcipher.SQLiteDebug.PagerStats();
        nativeGetPagerStats(pagerStats);
        pagerStats.dbStats = net.zetetic.database.sqlcipher.SQLiteDatabase.getDbStats();
        return pagerStats;
    }

    public static void dump(android.util.Printer printer, java.lang.String[] strArr) {
        boolean z = false;
        for (java.lang.String str : strArr) {
            if (str.equals("-v")) {
                z = true;
            }
        }
        net.zetetic.database.sqlcipher.SQLiteDatabase.dumpAll(printer, z);
    }
}
