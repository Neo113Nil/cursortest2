package androidx.camera.camera2.compat.workaround;

/* loaded from: classes6.dex */
public final class OutputSizesCorrector_Factory implements dagger.internal.Factory<androidx.camera.camera2.compat.workaround.OutputSizesCorrector> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<android.hardware.camera2.params.StreamConfigurationMap> getHighSpeedVideoSizes;

    private OutputSizesCorrector_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider, dagger.internal.Provider<android.hardware.camera2.params.StreamConfigurationMap> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.compat.workaround.OutputSizesCorrector get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static androidx.camera.camera2.compat.workaround.OutputSizesCorrector_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider, dagger.internal.Provider<android.hardware.camera2.params.StreamConfigurationMap> provider2) {
        return new androidx.camera.camera2.compat.workaround.OutputSizesCorrector_Factory(provider, provider2);
    }

    public static androidx.camera.camera2.compat.workaround.OutputSizesCorrector newInstance(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap) {
        return new androidx.camera.camera2.compat.workaround.OutputSizesCorrector(cameraMetadata, streamConfigurationMap);
    }
}
