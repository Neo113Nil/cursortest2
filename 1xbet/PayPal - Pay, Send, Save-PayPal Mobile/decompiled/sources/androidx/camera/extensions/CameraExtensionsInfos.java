package androidx.camera.extensions;

/* loaded from: classes6.dex */
class CameraExtensionsInfos {
    private static final androidx.camera.extensions.CameraExtensionsInfo Camera2StreamConfigurationMap = new androidx.camera.extensions.CameraExtensionsInfo() { // from class: androidx.camera.extensions.CameraExtensionsInfos.1
    };

    static androidx.camera.extensions.CameraExtensionsInfo getHighSpeedVideoFpsRanges(androidx.camera.core.CameraInfo cameraInfo) {
        androidx.core.util.Preconditions.checkArgument(cameraInfo instanceof androidx.camera.core.impl.AdapterCameraInfo, "The input camera info must be an instance retrieved from the camera that is returned by invoking CameraProvider#bindToLifecycle() with an extension enabled camera selector.");
        androidx.camera.core.impl.SessionProcessor sessionProcessor = ((androidx.camera.core.impl.AdapterCameraInfo) cameraInfo).getSessionProcessor();
        if (sessionProcessor instanceof androidx.camera.extensions.CameraExtensionsInfo) {
            return (androidx.camera.extensions.CameraExtensionsInfo) sessionProcessor;
        }
        return Camera2StreamConfigurationMap;
    }

    private CameraExtensionsInfos() {
    }
}
