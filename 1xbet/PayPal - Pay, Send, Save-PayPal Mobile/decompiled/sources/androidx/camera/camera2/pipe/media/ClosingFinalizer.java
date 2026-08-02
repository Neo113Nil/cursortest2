package androidx.camera.camera2.pipe.media;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\u0016¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/pipe/media/ClosingFinalizer;", "Landroidx/camera/camera2/pipe/media/Finalizer;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "finalize", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClosingFinalizer implements androidx.camera.camera2.pipe.media.Finalizer<java.lang.AutoCloseable> {
    public static final androidx.camera.camera2.pipe.media.ClosingFinalizer INSTANCE = new androidx.camera.camera2.pipe.media.ClosingFinalizer();

    private ClosingFinalizer() {
    }

    @Override // androidx.camera.camera2.pipe.media.Finalizer
    public final void finalize(java.lang.AutoCloseable value) {
        if (value != null) {
            androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) value);
        }
    }
}
