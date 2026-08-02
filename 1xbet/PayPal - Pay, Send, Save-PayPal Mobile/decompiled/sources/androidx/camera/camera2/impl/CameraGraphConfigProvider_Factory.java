package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class CameraGraphConfigProvider_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.CameraGraphConfigProvider> {
    private final dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraInteropStateCallbackRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraCallbackMap> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.core.CameraXConfig> getInputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.adapter.ZslControl> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.workaround.TemplateParamsOverride> getOutputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> getOutputMinFrameDuration;

    private CameraGraphConfigProvider_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.CameraCallbackMap> provider, dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> provider2, dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider3, dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider4, dagger.internal.Provider<androidx.camera.camera2.adapter.ZslControl> provider5, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.TemplateParamsOverride> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider7, dagger.internal.Provider<androidx.camera.core.CameraXConfig> provider8, dagger.internal.Provider<androidx.camera.camera2.impl.CameraInteropStateCallbackRepository> provider9) {
        this.getHighSpeedVideoSizes = provider;
        this.getOutputMinFrameDuration = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getInputSizeshNQ4ISI = provider5;
        this.getOutputFormats = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
        this.getInputFormats = provider8;
        this.getHighSpeedVideoFpsRanges = provider9;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.CameraGraphConfigProvider get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getOutputMinFrameDuration.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputFormats.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.impl.CameraGraphConfigProvider_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.CameraCallbackMap> provider, dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> provider2, dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider3, dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider4, dagger.internal.Provider<androidx.camera.camera2.adapter.ZslControl> provider5, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.TemplateParamsOverride> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider7, dagger.internal.Provider<androidx.camera.core.CameraXConfig> provider8, dagger.internal.Provider<androidx.camera.camera2.impl.CameraInteropStateCallbackRepository> provider9) {
        return new androidx.camera.camera2.impl.CameraGraphConfigProvider_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static androidx.camera.camera2.impl.CameraGraphConfigProvider newInstance(androidx.camera.camera2.impl.CameraCallbackMap cameraCallbackMap, androidx.camera.camera2.impl.ComboRequestListener comboRequestListener, androidx.camera.camera2.config.CameraConfig cameraConfig, androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks, androidx.camera.camera2.adapter.ZslControl zslControl, androidx.camera.camera2.compat.workaround.TemplateParamsOverride templateParamsOverride, androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.core.CameraXConfig cameraXConfig, androidx.camera.camera2.impl.CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository) {
        return new androidx.camera.camera2.impl.CameraGraphConfigProvider(cameraCallbackMap, comboRequestListener, cameraConfig, cameraQuirks, zslControl, templateParamsOverride, cameraMetadata, cameraXConfig, cameraInteropStateCallbackRepository);
    }
}
