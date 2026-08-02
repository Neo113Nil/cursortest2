package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class UseCaseCameraRequestControlImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.core.CameraXConfig> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraState> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipeline> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseSurfaceManager> getInputSizeshNQ4ISI;

    private UseCaseCameraRequestControlImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipeline> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraState> provider2, dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseSurfaceManager> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider5, dagger.internal.Provider<androidx.camera.core.CameraXConfig> provider6) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getInputSizeshNQ4ISI = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl get() {
        return newInstance(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.get(), this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipeline> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraState> provider2, dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseSurfaceManager> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider5, dagger.internal.Provider<androidx.camera.core.CameraXConfig> provider6) {
        return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl newInstance(javax.inject.Provider<androidx.camera.camera2.impl.CapturePipeline> provider, javax.inject.Provider<androidx.camera.camera2.impl.UseCaseCameraState> provider2, androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext, javax.inject.Provider<androidx.camera.camera2.impl.UseCaseSurfaceManager> provider3, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.core.CameraXConfig cameraXConfig) {
        return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl(provider, provider2, useCaseGraphContext, provider3, useCaseThreads, cameraXConfig);
    }
}
