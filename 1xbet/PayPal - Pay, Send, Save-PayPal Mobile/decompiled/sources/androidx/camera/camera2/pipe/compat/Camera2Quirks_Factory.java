package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class Camera2Quirks_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.Camera2Quirks> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.StrictMode> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2MetadataProvider> getHighSpeedVideoSizes;

    private Camera2Quirks_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2MetadataProvider> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.StrictMode> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.Camera2Quirks get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.pipe.compat.Camera2Quirks_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2MetadataProvider> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.StrictMode> provider2) {
        return new androidx.camera.camera2.pipe.compat.Camera2Quirks_Factory(provider, provider2);
    }

    public static androidx.camera.camera2.pipe.compat.Camera2Quirks newInstance(androidx.camera.camera2.pipe.compat.Camera2MetadataProvider camera2MetadataProvider, androidx.camera.camera2.pipe.StrictMode strictMode) {
        return new androidx.camera.camera2.pipe.compat.Camera2Quirks(camera2MetadataProvider, strictMode);
    }
}
