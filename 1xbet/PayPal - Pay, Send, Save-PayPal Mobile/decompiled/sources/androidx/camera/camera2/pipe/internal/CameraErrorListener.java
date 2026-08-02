package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/CameraError;", "cameraError", "", "willAttemptRetry", "", "onCameraError-3M5Xam4", "(Ljava/lang/String;IZ)V", "onCameraError"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraErrorListener {
    /* renamed from: onCameraError-3M5Xam4 */
    void mo790onCameraError3M5Xam4(java.lang.String cameraId, int cameraError, boolean willAttemptRetry);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: onCameraError-3M5Xam4$default, reason: not valid java name */
    static /* synthetic */ void m953onCameraError3M5Xam4$default(androidx.camera.camera2.pipe.internal.CameraErrorListener cameraErrorListener, java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCameraError-3M5Xam4");
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        cameraErrorListener.mo790onCameraError3M5Xam4(str, i, z);
    }
}
