package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/compat/VirtualCamera;", "", "Landroidx/camera/camera2/pipe/CameraError;", "lastCameraError", "", "disconnect-TPqeGZw", "(Landroidx/camera/camera2/pipe/CameraError;)V", "disconnect", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/camera/camera2/pipe/compat/CameraState;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "state", "getValue", "()Landroidx/camera/camera2/pipe/compat/CameraState;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface VirtualCamera {
    /* renamed from: disconnect-TPqeGZw, reason: not valid java name */
    void mo858disconnectTPqeGZw(androidx.camera.camera2.pipe.CameraError lastCameraError);

    kotlinx.coroutines.flow.Flow<androidx.camera.camera2.pipe.compat.CameraState> getState();

    androidx.camera.camera2.pipe.compat.CameraState getValue();

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: disconnect-TPqeGZw$default, reason: not valid java name */
    static /* synthetic */ void m857disconnectTPqeGZw$default(androidx.camera.camera2.pipe.compat.VirtualCamera virtualCamera, androidx.camera.camera2.pipe.CameraError cameraError, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disconnect-TPqeGZw");
        }
        if ((i & 1) != 0) {
            cameraError = null;
        }
        virtualCamera.mo858disconnectTPqeGZw(cameraError);
    }
}
