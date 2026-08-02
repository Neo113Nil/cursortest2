package androidx.camera.extensions;

/* loaded from: classes6.dex */
class CameraExtensionsControls {
    static androidx.camera.extensions.CameraExtensionsControl getHighSpeedVideoSizes(androidx.camera.core.CameraControl cameraControl) {
        androidx.core.util.Preconditions.checkArgument(cameraControl instanceof androidx.camera.core.impl.AdapterCameraControl, "The input camera control must be an instance retrieved from the camera that is returned by invoking CameraProvider#bindToLifecycle() with an extension enabled camera selector.");
        androidx.camera.core.impl.SessionProcessor sessionProcessor = ((androidx.camera.core.impl.AdapterCameraControl) cameraControl).getSessionProcessor();
        if (sessionProcessor instanceof androidx.camera.extensions.CameraExtensionsControl) {
            return (androidx.camera.extensions.CameraExtensionsControl) sessionProcessor;
        }
        return null;
    }

    private CameraExtensionsControls() {
    }
}
