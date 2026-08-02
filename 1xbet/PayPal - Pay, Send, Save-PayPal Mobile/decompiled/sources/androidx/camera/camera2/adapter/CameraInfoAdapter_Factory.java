package androidx.camera.camera2.adapter;

/* loaded from: classes6.dex */
public final class CameraInfoAdapter_Factory implements dagger.internal.Factory<androidx.camera.camera2.adapter.CameraInfoAdapter> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraCallbackMap> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.adapter.CameraControlStateAdapter> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.adapter.CameraStateAdapter> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.internal.IntrinsicZoomCalculator> getInputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.FocusMeteringControl> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.StreamConfigurationMapCompat> getOutputFormats;
    private final dagger.internal.Provider<androidx.camera.core.impl.EncoderProfilesProvider> getOutputMinFrameDuration;
    private final dagger.internal.Provider<androidx.camera.core.internal.StreamSpecsCalculator> getOutputMinFrameDurationlomOqCM;

    private CameraInfoAdapter_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider2, dagger.internal.Provider<androidx.camera.camera2.adapter.CameraStateAdapter> provider3, dagger.internal.Provider<androidx.camera.camera2.adapter.CameraControlStateAdapter> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.CameraCallbackMap> provider5, dagger.internal.Provider<androidx.camera.camera2.impl.FocusMeteringControl> provider6, dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider7, dagger.internal.Provider<androidx.camera.core.impl.EncoderProfilesProvider> provider8, dagger.internal.Provider<androidx.camera.camera2.compat.StreamConfigurationMapCompat> provider9, dagger.internal.Provider<androidx.camera.camera2.internal.IntrinsicZoomCalculator> provider10, dagger.internal.Provider<androidx.camera.core.internal.StreamSpecsCalculator> provider11) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getInputSizeshNQ4ISI = provider6;
        this.getHighSpeedVideoFpsRanges = provider7;
        this.getOutputMinFrameDuration = provider8;
        this.getOutputFormats = provider9;
        this.getInputFormats = provider10;
        this.getOutputMinFrameDurationlomOqCM = provider11;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.adapter.CameraInfoAdapter get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputMinFrameDuration.get(), this.getOutputFormats.get(), this.getInputFormats.get(), this.getOutputMinFrameDurationlomOqCM.get());
    }

    public static androidx.camera.camera2.adapter.CameraInfoAdapter_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider, dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider2, dagger.internal.Provider<androidx.camera.camera2.adapter.CameraStateAdapter> provider3, dagger.internal.Provider<androidx.camera.camera2.adapter.CameraControlStateAdapter> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.CameraCallbackMap> provider5, dagger.internal.Provider<androidx.camera.camera2.impl.FocusMeteringControl> provider6, dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider7, dagger.internal.Provider<androidx.camera.core.impl.EncoderProfilesProvider> provider8, dagger.internal.Provider<androidx.camera.camera2.compat.StreamConfigurationMapCompat> provider9, dagger.internal.Provider<androidx.camera.camera2.internal.IntrinsicZoomCalculator> provider10, dagger.internal.Provider<androidx.camera.core.internal.StreamSpecsCalculator> provider11) {
        return new androidx.camera.camera2.adapter.CameraInfoAdapter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static androidx.camera.camera2.adapter.CameraInfoAdapter newInstance(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.config.CameraConfig cameraConfig, androidx.camera.camera2.adapter.CameraStateAdapter cameraStateAdapter, androidx.camera.camera2.adapter.CameraControlStateAdapter cameraControlStateAdapter, androidx.camera.camera2.impl.CameraCallbackMap cameraCallbackMap, androidx.camera.camera2.impl.FocusMeteringControl focusMeteringControl, androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks, androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, androidx.camera.camera2.compat.StreamConfigurationMapCompat streamConfigurationMapCompat, androidx.camera.camera2.internal.IntrinsicZoomCalculator intrinsicZoomCalculator, androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator) {
        return new androidx.camera.camera2.adapter.CameraInfoAdapter(cameraProperties, cameraConfig, cameraStateAdapter, cameraControlStateAdapter, cameraCallbackMap, focusMeteringControl, cameraQuirks, encoderProfilesProvider, streamConfigurationMapCompat, intrinsicZoomCalculator, streamSpecsCalculator);
    }
}
