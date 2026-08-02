package androidx.camera.camera2.compat;

/* loaded from: classes6.dex */
public final class StreamConfigurationMapCompat_Factory implements dagger.internal.Factory<androidx.camera.camera2.compat.StreamConfigurationMapCompat> {
    private final dagger.internal.Provider<android.hardware.camera2.params.StreamConfigurationMap> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.workaround.OutputSizesCorrector> getHighSpeedVideoSizes;

    private StreamConfigurationMapCompat_Factory(dagger.internal.Provider<android.hardware.camera2.params.StreamConfigurationMap> provider, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.OutputSizesCorrector> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.compat.StreamConfigurationMapCompat get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static androidx.camera.camera2.compat.StreamConfigurationMapCompat_Factory create(dagger.internal.Provider<android.hardware.camera2.params.StreamConfigurationMap> provider, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.OutputSizesCorrector> provider2) {
        return new androidx.camera.camera2.compat.StreamConfigurationMapCompat_Factory(provider, provider2);
    }

    public static androidx.camera.camera2.compat.StreamConfigurationMapCompat newInstance(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap, androidx.camera.camera2.compat.workaround.OutputSizesCorrector outputSizesCorrector) {
        return new androidx.camera.camera2.compat.StreamConfigurationMapCompat(streamConfigurationMap, outputSizesCorrector);
    }
}
