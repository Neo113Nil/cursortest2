package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class UseCaseCameraImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.UseCaseCameraImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.adapter.SessionConfigAdapter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraRequestControl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipeline> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.core.impl.SessionProcessor> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseSurfaceManager> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> getInputFormats;

    private UseCaseCameraImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider2, dagger.internal.Provider<androidx.camera.core.impl.SessionProcessor> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraRequestControl> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseSurfaceManager> provider5, dagger.internal.Provider<androidx.camera.camera2.adapter.SessionConfigAdapter> provider6, dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipeline> provider7) {
        this.getInputFormats = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoSizesFor = provider5;
        this.Camera2StreamConfigurationMap = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.UseCaseCameraImpl get() {
        return newInstance(this.getInputFormats.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
    }

    public static androidx.camera.camera2.impl.UseCaseCameraImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider2, dagger.internal.Provider<androidx.camera.core.impl.SessionProcessor> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseCameraRequestControl> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseSurfaceManager> provider5, dagger.internal.Provider<androidx.camera.camera2.adapter.SessionConfigAdapter> provider6, dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipeline> provider7) {
        return new androidx.camera.camera2.impl.UseCaseCameraImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static androidx.camera.camera2.impl.UseCaseCameraImpl newInstance(androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.core.impl.SessionProcessor sessionProcessor, androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl, javax.inject.Provider<androidx.camera.camera2.impl.UseCaseSurfaceManager> provider, javax.inject.Provider<androidx.camera.camera2.adapter.SessionConfigAdapter> provider2, javax.inject.Provider<androidx.camera.camera2.impl.CapturePipeline> provider3) {
        return new androidx.camera.camera2.impl.UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, sessionProcessor, useCaseCameraRequestControl, provider, provider2, provider3);
    }
}
