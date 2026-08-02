package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n\"\u0019\u0010\u000e\u001a\u00070\u0002¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroid/content/Context;", "context", "", "tag", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "newWakeLock", "(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "", "checkWakeLocks", "()V", "Lorg/jspecify/annotations/NonNull;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WakeLocks {
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("WakeLocks");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        getHighSpeedVideoFpsRangesFor = tagWithPrefix;
    }

    public static final android.os.PowerManager.WakeLock newWakeLock(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        java.lang.String concat = "WorkManager: ".concat(java.lang.String.valueOf(str));
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) systemService).newWakeLock(1, concat);
        synchronized (androidx.work.impl.utils.WakeLocksHolder.INSTANCE) {
            androidx.work.impl.utils.WakeLocksHolder wakeLocksHolder = androidx.work.impl.utils.WakeLocksHolder.INSTANCE;
            androidx.work.impl.utils.WakeLocksHolder.getHighSpeedVideoFpsRanges().put(newWakeLock, concat);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(newWakeLock);
        return newWakeLock;
    }

    public static final void checkWakeLocks() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        synchronized (androidx.work.impl.utils.WakeLocksHolder.INSTANCE) {
            androidx.work.impl.utils.WakeLocksHolder wakeLocksHolder = androidx.work.impl.utils.WakeLocksHolder.INSTANCE;
            linkedHashMap.putAll(androidx.work.impl.utils.WakeLocksHolder.getHighSpeedVideoFpsRanges());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            android.os.PowerManager.WakeLock wakeLock = (android.os.PowerManager.WakeLock) entry.getKey();
            java.lang.String str = (java.lang.String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.Logger.get().warning(getHighSpeedVideoFpsRangesFor, "WakeLock held for ".concat(java.lang.String.valueOf(str)));
            }
        }
    }
}
