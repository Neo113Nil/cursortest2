package androidx.work.impl.utils;

/* compiled from: WakeLocks.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001c\u0010\u0004\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"TAG", "", "checkWakeLocks", "", "newWakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "context", "Landroid/content/Context;", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "work-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class WakeLocks {
    private static final java.lang.String TAG;

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("WakeLocks");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"WakeLocks\")");
        TAG = tagWithPrefix;
    }

    public static final android.os.PowerManager.WakeLock newWakeLock(android.content.Context context, java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        java.lang.Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        java.lang.String str = "WorkManager: " + tag;
        android.os.PowerManager.WakeLock wakeLock = ((android.os.PowerManager) systemService).newWakeLock(1, str);
        synchronized (androidx.work.impl.utils.WakeLocksHolder.INSTANCE) {
            androidx.work.impl.utils.WakeLocksHolder.INSTANCE.getWakeLocks().put(wakeLock, str);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wakeLock, "wakeLock");
        return wakeLock;
    }

    public static final void checkWakeLocks() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        synchronized (androidx.work.impl.utils.WakeLocksHolder.INSTANCE) {
            linkedHashMap.putAll(androidx.work.impl.utils.WakeLocksHolder.INSTANCE.getWakeLocks());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            android.os.PowerManager.WakeLock wakeLock = (android.os.PowerManager.WakeLock) entry.getKey();
            java.lang.String str = (java.lang.String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.Logger.get().warning(TAG, "WakeLock held for " + str);
            }
        }
    }
}
