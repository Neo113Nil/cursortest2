package androidx.camera.camera2.compat;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/compat/Api24Compat;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", com.sun.jna.Callback.METHOD_NAME, "Landroid/hardware/camera2/CameraCaptureSession;", "session", "Landroid/hardware/camera2/CaptureRequest;", "request", "Landroid/view/Surface;", "surface", "", "frameNumber", "", "onCaptureBufferLost", "(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Api24Compat {
    public static final androidx.camera.camera2.compat.Api24Compat INSTANCE = new androidx.camera.camera2.compat.Api24Compat();

    private Api24Compat() {
    }

    @kotlin.jvm.JvmStatic
    public static final void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession.CaptureCallback callback, android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.view.Surface surface, long frameNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        callback.onCaptureBufferLost(session, request, surface, frameNumber);
    }
}
