package androidx.camera.camera2.pipe.graph;

/* loaded from: classes6.dex */
public final class CameraGraphImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.graph.CameraGraphImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AudioRestrictionController> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameDistributor> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraController> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Controller3A> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameCaptureQueue> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraphId> getInputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphListener> getOutputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessor> getOutputMinFrameDuration;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl> getOutputMinFrameDurationlomOqCM;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> getOutputSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl> getOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> getOutputStallDuration;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.GraphSessionLock> getOutputStallDurationlomOqCM;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.graph.SurfaceGraph> getValidOutputFormatsForInputhNQ4ISI;

    private CameraGraphImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessor> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphListener> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.SurfaceGraph> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraController> provider7, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameDistributor> provider8, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameCaptureQueue> provider9, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AudioRestrictionController> provider10, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraphId> provider11, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl> provider12, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl> provider13, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.GraphSessionLock> provider14, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider15, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Controller3A> provider16) {
        this.getInputSizeshNQ4ISI = provider;
        this.getOutputSizes = provider2;
        this.getOutputMinFrameDuration = provider3;
        this.getOutputFormats = provider4;
        this.getOutputStallDuration = provider5;
        this.getValidOutputFormatsForInputhNQ4ISI = provider6;
        this.getHighSpeedVideoFpsRanges = provider7;
        this.getHighResolutionOutputSizeshNQ4ISI = provider8;
        this.getHighSpeedVideoSizes = provider9;
        this.Camera2StreamConfigurationMap = provider10;
        this.getInputFormats = provider11;
        this.getOutputMinFrameDurationlomOqCM = provider12;
        this.getOutputSizeshNQ4ISI = provider13;
        this.getOutputStallDurationlomOqCM = provider14;
        this.getHighSpeedVideoSizesFor = provider15;
        this.getHighSpeedVideoFpsRangesFor = provider16;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.graph.CameraGraphImpl get() {
        return newInstance(this.getInputSizeshNQ4ISI.get(), this.getOutputSizes.get(), this.getOutputMinFrameDuration.get(), this.getOutputFormats.get(), this.getOutputStallDuration.get(), this.getValidOutputFormatsForInputhNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getInputFormats.get(), this.getOutputMinFrameDurationlomOqCM.get(), this.getOutputSizeshNQ4ISI.get(), this.getOutputStallDurationlomOqCM.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.graph.CameraGraphImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphProcessor> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.GraphListener> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.StreamGraphImpl> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.SurfaceGraph> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraController> provider7, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameDistributor> provider8, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.FrameCaptureQueue> provider9, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AudioRestrictionController> provider10, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraphId> provider11, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl> provider12, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl> provider13, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.GraphSessionLock> provider14, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider15, dagger.internal.Provider<androidx.camera.camera2.pipe.graph.Controller3A> provider16) {
        return new androidx.camera.camera2.pipe.graph.CameraGraphImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    public static androidx.camera.camera2.pipe.graph.CameraGraphImpl newInstance(androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.pipe.graph.GraphProcessor graphProcessor, androidx.camera.camera2.pipe.graph.GraphListener graphListener, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.graph.SurfaceGraph surfaceGraph, androidx.camera.camera2.pipe.CameraController cameraController, androidx.camera.camera2.pipe.internal.FrameDistributor frameDistributor, androidx.camera.camera2.pipe.internal.FrameCaptureQueue frameCaptureQueue, androidx.camera.camera2.pipe.compat.AudioRestrictionController audioRestrictionController, androidx.camera.camera2.pipe.CameraGraphId cameraGraphId, androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl cameraGraphParametersImpl, androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl cameraGraphRequestListenersImpl, androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.camera.camera2.pipe.graph.Controller3A controller3A) {
        return new androidx.camera.camera2.pipe.graph.CameraGraphImpl(config, cameraMetadata, graphProcessor, graphListener, streamGraphImpl, surfaceGraph, cameraController, frameDistributor, frameCaptureQueue, audioRestrictionController, cameraGraphId, cameraGraphParametersImpl, cameraGraphRequestListenersImpl, graphSessionLock, coroutineScope, controller3A);
    }
}
