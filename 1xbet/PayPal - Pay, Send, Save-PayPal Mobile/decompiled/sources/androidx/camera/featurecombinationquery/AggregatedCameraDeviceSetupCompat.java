package androidx.camera.featurecombinationquery;

/* loaded from: classes6.dex */
final class AggregatedCameraDeviceSetupCompat implements androidx.camera.featurecombinationquery.CameraDeviceSetupCompat {
    private final java.util.List<androidx.camera.featurecombinationquery.CameraDeviceSetupCompat> getHighSpeedVideoFpsRangesFor;

    AggregatedCameraDeviceSetupCompat(java.util.List<androidx.camera.featurecombinationquery.CameraDeviceSetupCompat> list) {
        this.getHighSpeedVideoFpsRangesFor = list;
    }

    @Override // androidx.camera.featurecombinationquery.CameraDeviceSetupCompat
    public final androidx.camera.featurecombinationquery.CameraDeviceSetupCompat.SupportQueryResult isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration sessionConfiguration) throws android.hardware.camera2.CameraAccessException {
        java.util.Iterator<androidx.camera.featurecombinationquery.CameraDeviceSetupCompat> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            androidx.camera.featurecombinationquery.CameraDeviceSetupCompat.SupportQueryResult isSessionConfigurationSupported = it.next().isSessionConfigurationSupported(sessionConfiguration);
            if (isSessionConfigurationSupported.getSupported() != 0) {
                return isSessionConfigurationSupported;
            }
        }
        return new androidx.camera.featurecombinationquery.CameraDeviceSetupCompat.SupportQueryResult(0, 0, 0L);
    }

    @Override // androidx.camera.featurecombinationquery.CameraDeviceSetupCompat
    public final androidx.camera.featurecombinationquery.CameraDeviceSetupCompat.SupportQueryResult isSessionConfigurationSupportedLegacy(androidx.camera.featurecombinationquery.SessionConfigurationLegacy sessionConfigurationLegacy) {
        java.util.Iterator<androidx.camera.featurecombinationquery.CameraDeviceSetupCompat> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof androidx.camera.featurecombinationquery.Camera2CameraDeviceSetupCompat) {
                throw new java.lang.IllegalStateException("This device supports CameraDeviceSetup. Please use Camera2 SessionConfiguration for querying instead.");
            }
        }
        java.util.Iterator<androidx.camera.featurecombinationquery.CameraDeviceSetupCompat> it2 = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it2.hasNext()) {
            androidx.camera.featurecombinationquery.CameraDeviceSetupCompat.SupportQueryResult isSessionConfigurationSupportedLegacy = it2.next().isSessionConfigurationSupportedLegacy(sessionConfigurationLegacy);
            if (isSessionConfigurationSupportedLegacy.getSupported() != 0) {
                return isSessionConfigurationSupportedLegacy;
            }
        }
        return new androidx.camera.featurecombinationquery.CameraDeviceSetupCompat.SupportQueryResult(0, 0, 0L);
    }
}
