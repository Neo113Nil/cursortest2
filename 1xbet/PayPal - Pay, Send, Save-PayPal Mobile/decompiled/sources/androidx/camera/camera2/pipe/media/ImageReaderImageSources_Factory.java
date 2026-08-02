package androidx.camera.camera2.pipe.media;

/* loaded from: classes6.dex */
public final class ImageReaderImageSources_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.media.ImageReaderImageSources> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighSpeedVideoSizes;

    private ImageReaderImageSources_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.media.ImageReaderImageSources get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.media.ImageReaderImageSources_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> provider2) {
        return new androidx.camera.camera2.pipe.media.ImageReaderImageSources_Factory(provider, provider2);
    }

    public static androidx.camera.camera2.pipe.media.ImageReaderImageSources newInstance(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraPipe.Config config) {
        return new androidx.camera.camera2.pipe.media.ImageReaderImageSources(threads, config);
    }
}
