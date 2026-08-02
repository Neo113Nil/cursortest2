package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeModule_Companion_ConfigureImageSourcesFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.media.ImageSources> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.media.ImageReaderImageSources> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> getHighSpeedVideoSizes;

    private CameraPipeModule_Companion_ConfigureImageSourcesFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.media.ImageReaderImageSources> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.media.ImageSources get() {
        return configureImageSources(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ConfigureImageSourcesFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.media.ImageReaderImageSources> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> provider2) {
        return new androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ConfigureImageSourcesFactory(provider, provider2);
    }

    public static androidx.camera.camera2.pipe.media.ImageSources configureImageSources(androidx.camera.camera2.pipe.media.ImageReaderImageSources imageReaderImageSources, androidx.camera.camera2.pipe.CameraPipe.Config config) {
        return (androidx.camera.camera2.pipe.media.ImageSources) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.CameraPipeModule.INSTANCE.configureImageSources(imageReaderImageSources, config));
    }
}
