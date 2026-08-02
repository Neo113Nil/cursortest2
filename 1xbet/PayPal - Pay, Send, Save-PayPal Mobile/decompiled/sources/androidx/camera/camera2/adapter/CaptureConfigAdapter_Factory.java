package androidx.camera.camera2.adapter;

/* loaded from: classes6.dex */
public final class CaptureConfigAdapter_Factory implements dagger.internal.Factory<androidx.camera.camera2.adapter.CaptureConfigAdapter> {
    private final dagger.internal.Provider<androidx.camera.camera2.compat.workaround.TemplateParamsOverride> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.adapter.ZslControl> getHighSpeedVideoSizes;

    private CaptureConfigAdapter_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> provider2, dagger.internal.Provider<androidx.camera.camera2.adapter.ZslControl> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider4, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.TemplateParamsOverride> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.adapter.CaptureConfigAdapter get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static androidx.camera.camera2.adapter.CaptureConfigAdapter_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> provider2, dagger.internal.Provider<androidx.camera.camera2.adapter.ZslControl> provider3, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider4, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.TemplateParamsOverride> provider5) {
        return new androidx.camera.camera2.adapter.CaptureConfigAdapter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static androidx.camera.camera2.adapter.CaptureConfigAdapter newInstance(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext, androidx.camera.camera2.adapter.ZslControl zslControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.compat.workaround.TemplateParamsOverride templateParamsOverride) {
        return new androidx.camera.camera2.adapter.CaptureConfigAdapter(cameraProperties, useCaseGraphContext, zslControl, useCaseThreads, templateParamsOverride);
    }
}
