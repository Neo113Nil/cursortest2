package androidx.camera.camera2.pipe.framegraph;

/* loaded from: classes6.dex */
public final class FrameGraphImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.framegraph.FrameGraphImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameDistributor> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Controller3A> getHighSpeedVideoSizes;

    private FrameGraphImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameDistributor> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Controller3A> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.framegraph.FrameGraphImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static androidx.camera.camera2.pipe.framegraph.FrameGraphImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameDistributor> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Controller3A> provider5) {
        return new androidx.camera.camera2.pipe.framegraph.FrameGraphImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static androidx.camera.camera2.pipe.framegraph.FrameGraphImpl newInstance(androidx.camera.camera2.pipe.CameraGraph cameraGraph, androidx.camera.camera2.pipe.internal.FrameDistributor frameDistributor, androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers frameGraphBuffers, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.camera.camera2.pipe.graph.Controller3A controller3A) {
        return new androidx.camera.camera2.pipe.framegraph.FrameGraphImpl(cameraGraph, frameDistributor, frameGraphBuffers, coroutineScope, controller3A);
    }
}
