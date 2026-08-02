package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\f\u001a\u0012\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/work/impl/utils/WakeLocksHolder;", "", "<init>", "()V", "Ljava/util/WeakHashMap;", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/WeakHashMap;", "getHighSpeedVideoFpsRanges", "()Ljava/util/WeakHashMap;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class WakeLocksHolder {
    public static final androidx.work.impl.utils.WakeLocksHolder INSTANCE = new androidx.work.impl.utils.WakeLocksHolder();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.WeakHashMap<android.os.PowerManager.WakeLock, java.lang.String> getHighSpeedVideoSizes = new java.util.WeakHashMap<>();

    private WakeLocksHolder() {
    }

    public static java.util.WeakHashMap<android.os.PowerManager.WakeLock, java.lang.String> getHighSpeedVideoFpsRanges() {
        return getHighSpeedVideoSizes;
    }
}
