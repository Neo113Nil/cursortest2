package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/tooling/ThreadSafeException;", "", "<init>", "()V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "set", "(Ljava/lang/Throwable;)V", "throwIfPresent", "getHighSpeedVideoSizes", "Ljava/lang/Throwable;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThreadSafeException {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.Throwable getHighSpeedVideoFpsRanges;

    public final void set(java.lang.Throwable throwable) {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRanges = throwable;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void throwIfPresent() {
        synchronized (this.Camera2StreamConfigurationMap) {
            java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
            if (th != null) {
                this.getHighSpeedVideoFpsRanges = null;
                throw th;
            }
        }
    }
}
