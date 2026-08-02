package androidx.camera.featurecombinationquery;

/* loaded from: classes6.dex */
class Camera2CameraDeviceSetupCompatProvider implements androidx.camera.featurecombinationquery.CameraDeviceSetupCompatProvider {
    private final android.hardware.camera2.CameraManager getHighResolutionOutputSizeshNQ4ISI;

    Camera2CameraDeviceSetupCompatProvider(android.content.Context context) {
        this.getHighResolutionOutputSizeshNQ4ISI = (android.hardware.camera2.CameraManager) context.getSystemService(android.hardware.camera2.CameraManager.class);
    }

    @Override // androidx.camera.featurecombinationquery.CameraDeviceSetupCompatProvider
    public androidx.camera.featurecombinationquery.CameraDeviceSetupCompat getCameraDeviceSetupCompat(java.lang.String str) throws android.hardware.camera2.CameraAccessException {
        return new androidx.camera.featurecombinationquery.Camera2CameraDeviceSetupCompat(this.getHighResolutionOutputSizeshNQ4ISI, str);
    }
}
