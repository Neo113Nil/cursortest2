package androidx.legacy.content;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public abstract class WakefulBroadcastReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String EXTRA_WAKE_LOCK_ID = "androidx.contentpager.content.wakelockid";
    private static final android.util.SparseArray<android.os.PowerManager.WakeLock> sActiveWakeLocks = new android.util.SparseArray<>();
    private static int mNextId = 1;

    public static android.content.ComponentName startWakefulService(android.content.Context context, android.content.Intent intent) {
        android.util.SparseArray<android.os.PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            int i = mNextId;
            int i2 = i + 1;
            mNextId = i2;
            if (i2 <= 0) {
                mNextId = 1;
            }
            intent.putExtra(EXTRA_WAKE_LOCK_ID, i);
            android.content.ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            android.os.PowerManager powerManager = (android.os.PowerManager) context.getSystemService("power");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("androidx.core:wake:");
            sb.append(startService.flattenToShortString());
            android.os.PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000L);
            sparseArray.put(i, newWakeLock);
            return startService;
        }
    }

    public static boolean completeWakefulIntent(android.content.Intent intent) {
        int intExtra = intent.getIntExtra(EXTRA_WAKE_LOCK_ID, 0);
        if (intExtra == 0) {
            return false;
        }
        android.util.SparseArray<android.os.PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            android.os.PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock == null) {
                return true;
            }
            wakeLock.release();
            sparseArray.remove(intExtra);
            return true;
        }
    }
}
