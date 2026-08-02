package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class UseCaseCameraModule_Companion_ProvideCapturePipelineFactory implements dagger.internal.Factory<androidx.camera.camera2.impl.CapturePipeline> {
    private final dagger.internal.Provider<androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipelineImpl> getHighSpeedVideoFpsRanges;

    private UseCaseCameraModule_Companion_ProvideCapturePipelineFactory(dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipelineImpl> provider, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.CapturePipeline get() {
        return provideCapturePipeline(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
    }

    public static androidx.camera.camera2.config.UseCaseCameraModule_Companion_ProvideCapturePipelineFactory create(dagger.internal.Provider<androidx.camera.camera2.impl.CapturePipelineImpl> provider, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection> provider2) {
        return new androidx.camera.camera2.config.UseCaseCameraModule_Companion_ProvideCapturePipelineFactory(provider, provider2);
    }

    public static androidx.camera.camera2.impl.CapturePipeline provideCapturePipeline(javax.inject.Provider<androidx.camera.camera2.impl.CapturePipelineImpl> provider, javax.inject.Provider<androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection> provider2) {
        return (androidx.camera.camera2.impl.CapturePipeline) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.config.UseCaseCameraModule.INSTANCE.provideCapturePipeline(provider, provider2));
    }
}
