package androidx.camera.camera2.pipe.graph;

/* loaded from: classes6.dex */
public final class GraphProcessorImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.graph.GraphProcessorImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Listener3A> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<java.util.List<androidx.camera.camera2.pipe.Request.Listener>> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraphId> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getInputSizeshNQ4ISI;

    private GraphProcessorImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraphId> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Listener3A> provider4, dagger.internal.Provider<java.util.List<androidx.camera.camera2.pipe.Request.Listener>> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> provider6) {
        this.getInputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.graph.GraphProcessorImpl get() {
        return newInstance(this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.pipe.graph.GraphProcessorImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraphId> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Listener3A> provider4, dagger.internal.Provider<java.util.List<androidx.camera.camera2.pipe.Request.Listener>> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> provider6) {
        return new androidx.camera.camera2.pipe.graph.GraphProcessorImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static androidx.camera.camera2.pipe.graph.GraphProcessorImpl newInstance(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraGraphId cameraGraphId, androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.graph.Listener3A listener3A, java.util.List<androidx.camera.camera2.pipe.Request.Listener> list, androidx.camera.camera2.pipe.compat.Camera2Quirks camera2Quirks) {
        return new androidx.camera.camera2.pipe.graph.GraphProcessorImpl(threads, cameraGraphId, config, listener3A, list, camera2Quirks);
    }
}
