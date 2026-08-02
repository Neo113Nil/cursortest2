package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Api24Compat;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "", "Landroid/hardware/camera2/params/OutputConfiguration;", "outputConfig", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "stateCallback", "Landroid/os/Handler;", "handler", "", "createCaptureSessionByOutputConfigurations", "(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V", "Landroid/hardware/camera2/params/InputConfiguration;", "inputConfig", "outputs", "createReprocessableCaptureSessionByConfigurations", "(Landroid/hardware/camera2/CameraDevice;Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V", "outputConfiguration", "", "getSurfaceGroupId", "(Landroid/hardware/camera2/params/OutputConfiguration;)I"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Api24Compat {
    public static final androidx.camera.camera2.pipe.compat.Api24Compat INSTANCE = new androidx.camera.camera2.pipe.compat.Api24Compat();

    private Api24Compat() {
    }

    @kotlin.jvm.JvmStatic
    public static final void createCaptureSessionByOutputConfigurations(android.hardware.camera2.CameraDevice cameraDevice, java.util.List<android.hardware.camera2.params.OutputConfiguration> outputConfig, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateCallback, "");
        cameraDevice.createCaptureSessionByOutputConfigurations(outputConfig, stateCallback, handler);
    }

    @kotlin.jvm.JvmStatic
    public static final void createReprocessableCaptureSessionByConfigurations(android.hardware.camera2.CameraDevice cameraDevice, android.hardware.camera2.params.InputConfiguration inputConfig, java.util.List<android.hardware.camera2.params.OutputConfiguration> outputs, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback, android.os.Handler handler) throws android.hardware.camera2.CameraAccessException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateCallback, "");
        cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfig, outputs, stateCallback, handler);
    }

    @kotlin.jvm.JvmStatic
    public static final int getSurfaceGroupId(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputConfiguration, "");
        return outputConfiguration.getSurfaceGroupId();
    }
}
