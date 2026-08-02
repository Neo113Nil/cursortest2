package androidx.camera.camera2.compat.quirk;

/* loaded from: classes6.dex */
public final class CameraQuirks_Factory implements dagger.internal.Factory<androidx.camera.camera2.compat.quirk.CameraQuirks> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.StreamConfigurationMapCompat> getHighSpeedVideoFpsRangesFor;

    private CameraQuirks_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider, dagger.internal.Provider<androidx.camera.camera2.compat.StreamConfigurationMapCompat> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.compat.quirk.CameraQuirks get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.compat.quirk.CameraQuirks_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider, dagger.internal.Provider<androidx.camera.camera2.compat.StreamConfigurationMapCompat> provider2) {
        return new androidx.camera.camera2.compat.quirk.CameraQuirks_Factory(provider, provider2);
    }

    public static androidx.camera.camera2.compat.quirk.CameraQuirks newInstance(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.compat.StreamConfigurationMapCompat streamConfigurationMapCompat) {
        return new androidx.camera.camera2.compat.quirk.CameraQuirks(cameraMetadata, streamConfigurationMapCompat);
    }
}
