package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001%J\b\u0010\u0013\u001a\u00020\rH&J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&¢\u0006\u0002\u0010\u001aJ%\u0010\u001b\u001a\u0004\u0018\u00010\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d2\u0006\u0010\u0018\u001a\u00020\u0019H&¢\u0006\u0002\u0010\u001eJ%\u0010\u001f\u001a\u0004\u0018\u00010\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d2\u0006\u0010\u0018\u001a\u00020\u0019H&¢\u0006\u0002\u0010\u001eJ\u001f\u0010 \u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&¢\u0006\u0002\u0010\u001aJ\b\u0010!\u001a\u00020\rH&J\u0016\u0010\"\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001dH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006&À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "id", "Landroidx/camera/camera2/pipe/CameraInterop$CameraCaptureSessionId;", "getId-159jkk4", "()I", "device", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "getDevice", "()Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "isReprocessable", "", "()Z", "inputSurface", "Landroid/view/Surface;", "getInputSurface", "()Landroid/view/Surface;", "abortCaptures", "capture", "", "request", "Landroid/hardware/camera2/CaptureRequest;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;", "captureBurst", "requests", "", "(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;", "setRepeatingBurst", "setRepeatingRequest", "stopRepeating", "finalizeOutputConfigurations", "outputConfigs", "Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "StateCallback", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraCaptureSessionWrapper extends androidx.camera.camera2.pipe.UnsafeWrapper, java.lang.AutoCloseable {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper$StateCallback;", "Landroidx/camera/camera2/pipe/compat/SessionStateCallback;", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;", "session", "", "onActive", "(Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;)V", "onClosed", "onConfigureFailed", "onConfigured", "onReady", "onCaptureQueueEmpty"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface StateCallback extends androidx.camera.camera2.pipe.compat.SessionStateCallback {
        void onActive(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper session);

        void onCaptureQueueEmpty(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper session);

        void onClosed(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper session);

        void onConfigureFailed(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper session);

        void onConfigured(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper session);

        void onReady(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper session);
    }

    boolean abortCaptures();

    java.lang.Integer capture(android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener);

    java.lang.Integer captureBurst(java.util.List<android.hardware.camera2.CaptureRequest> requests, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener);

    boolean finalizeOutputConfigurations(java.util.List<? extends androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> outputConfigs);

    androidx.camera.camera2.pipe.compat.CameraDeviceWrapper getDevice();

    /* renamed from: getId-159jkk4 */
    int mo764getId159jkk4();

    android.view.Surface getInputSurface();

    boolean isReprocessable();

    java.lang.Integer setRepeatingBurst(java.util.List<android.hardware.camera2.CaptureRequest> requests, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener);

    java.lang.Integer setRepeatingRequest(android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener);

    boolean stopRepeating();
}
