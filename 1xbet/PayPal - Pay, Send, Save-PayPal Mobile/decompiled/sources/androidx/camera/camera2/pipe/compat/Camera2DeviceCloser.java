package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001JK\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;", "", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "cameraDeviceWrapper", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Landroidx/camera/camera2/pipe/compat/AndroidCameraState;", "androidCameraState", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "audioRestrictionController", "", "shouldReopenCamera", "shouldCreateEmptyCaptureSession", "", "closeCamera", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/pipe/compat/AndroidCameraState;Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;ZZ)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Camera2DeviceCloser {
    void closeCamera(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDeviceWrapper, android.hardware.camera2.CameraDevice cameraDevice, androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState, androidx.camera.camera2.pipe.compat.AudioRestrictionController audioRestrictionController, boolean shouldReopenCamera, boolean shouldCreateEmptyCaptureSession);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void closeCamera$default(androidx.camera.camera2.pipe.compat.Camera2DeviceCloser camera2DeviceCloser, androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDeviceWrapper, android.hardware.camera2.CameraDevice cameraDevice, androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState, androidx.camera.camera2.pipe.compat.AudioRestrictionController audioRestrictionController, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeCamera");
        }
        camera2DeviceCloser.closeCamera((i & 1) != 0 ? null : cameraDeviceWrapper, (i & 2) != 0 ? null : cameraDevice, androidCameraState, audioRestrictionController, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }
}
