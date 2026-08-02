package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public interface SurfaceProcessorInternal extends androidx.camera.core.SurfaceProcessor {
    void release();

    default com.google.common.util.concurrent.ListenableFuture<java.lang.Void> snapshot(int i, int i2) {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
    }
}
