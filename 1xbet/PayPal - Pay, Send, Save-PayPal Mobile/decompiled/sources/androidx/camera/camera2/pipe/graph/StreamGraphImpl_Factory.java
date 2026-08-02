package androidx.camera.camera2.pipe.graph;

/* loaded from: classes6.dex */
public final class StreamGraphImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.graph.StreamGraphImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.media.ImageSources> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraController> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> getHighSpeedVideoSizes;

    private StreamGraphImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.media.ImageSources> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraController> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.graph.StreamGraphImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static androidx.camera.camera2.pipe.graph.StreamGraphImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.media.ImageSources> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraController> provider4) {
        return new androidx.camera.camera2.pipe.graph.StreamGraphImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static androidx.camera.camera2.pipe.graph.StreamGraphImpl newInstance(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.media.ImageSources imageSources, javax.inject.Provider<androidx.camera.camera2.pipe.CameraController> provider) {
        return new androidx.camera.camera2.pipe.graph.StreamGraphImpl(cameraMetadata, config, imageSources, provider);
    }
}
