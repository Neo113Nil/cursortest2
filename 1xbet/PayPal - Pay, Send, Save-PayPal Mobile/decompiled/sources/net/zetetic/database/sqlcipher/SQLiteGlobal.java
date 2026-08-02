package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public final class SQLiteGlobal {
    private static final java.lang.String TAG = "SQLiteGlobal";
    private static int sDefaultPageSize = 4096;
    private static final java.lang.Object sLock = new java.lang.Object();
    private static int sWALConnectionPoolSize = 10;

    public static int getJournalSizeLimit() {
        return 10000;
    }

    private static native int nativeReleaseMemory();

    private SQLiteGlobal() {
    }

    public static int releaseMemory() {
        return nativeReleaseMemory();
    }

    public static int getDefaultPageSize() {
        synchronized (sLock) {
            if (sDefaultPageSize == 0) {
                sDefaultPageSize = new android.os.StatFs("/data").getBlockSize();
            }
        }
        return 4096;
    }

    public static java.lang.String getDefaultJournalMode() {
        return com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE;
    }

    public static java.lang.String getDefaultSyncMode() {
        return com.adjust.sdk.Constants.NORMAL;
    }

    public static java.lang.String getWALSyncMode() {
        return com.adjust.sdk.Constants.NORMAL;
    }

    public static int getWALAutoCheckpoint() {
        return java.lang.Math.max(1, 1000);
    }

    public static void setWALConnectionPoolSize(int i) {
        sWALConnectionPoolSize = i;
    }

    public static int getWALConnectionPoolSize() {
        return sWALConnectionPoolSize;
    }
}
