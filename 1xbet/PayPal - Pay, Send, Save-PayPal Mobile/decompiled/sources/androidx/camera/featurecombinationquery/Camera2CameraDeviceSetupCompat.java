package androidx.camera.featurecombinationquery;

/* loaded from: classes6.dex */
class Camera2CameraDeviceSetupCompat implements androidx.camera.featurecombinationquery.CameraDeviceSetupCompat {
    private final android.hardware.camera2.CameraDevice.CameraDeviceSetup Camera2StreamConfigurationMap;

    Camera2CameraDeviceSetupCompat(android.hardware.camera2.CameraManager cameraManager, java.lang.String str) throws android.hardware.camera2.CameraAccessException {
        this.Camera2StreamConfigurationMap = cameraManager.getCameraDeviceSetup(str);
    }

    @Override // androidx.camera.featurecombinationquery.CameraDeviceSetupCompat
    public androidx.camera.featurecombinationquery.CameraDeviceSetupCompat.SupportQueryResult isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration sessionConfiguration) throws android.hardware.camera2.CameraAccessException {
        return new androidx.camera.featurecombinationquery.CameraDeviceSetupCompat.SupportQueryResult(this.Camera2StreamConfigurationMap.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2, 2, getHighResolutionOutputSizeshNQ4ISI());
    }

    @Override // androidx.camera.featurecombinationquery.CameraDeviceSetupCompat
    public androidx.camera.featurecombinationquery.CameraDeviceSetupCompat.SupportQueryResult isSessionConfigurationSupportedLegacy(androidx.camera.featurecombinationquery.SessionConfigurationLegacy sessionConfigurationLegacy) {
        throw new java.lang.IllegalStateException("This device supports CameraDeviceSetup. Please use Camera2 SessionConfiguration for querying instead.");
    }

    public static long getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.String property = java.lang.System.getProperty("ro.build.date.utc");
        if (property == null) {
            return 0L;
        }
        try {
            return java.lang.Long.parseLong(property) * 1000;
        } catch (java.lang.NumberFormatException unused) {
            return 0L;
        }
    }
}
