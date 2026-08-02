package androidx.camera.core.internal.compat;

/* loaded from: classes6.dex */
class MediaActionSoundCompatBaseImpl {
    static boolean Camera2StreamConfigurationMap() {
        if (android.hardware.Camera.getNumberOfCameras() <= 0) {
            return false;
        }
        try {
            android.hardware.Camera.getCameraInfo(0, new android.hardware.Camera.CameraInfo());
            return !r0.canDisableShutterSound;
        } catch (java.lang.RuntimeException unused) {
            return false;
        }
    }

    private MediaActionSoundCompatBaseImpl() {
    }
}
