package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class UseCaseManager_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.UseCaseManager> {
    private final dagger.internal.Provider<androidx.camera.camera2.config.UseCaseCameraComponent.Builder> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraGraphConfigProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.core.impl.CameraInfoInternal> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.interop.Camera2CameraControl> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.core.concurrent.CameraCoordinator> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.core.impl.CameraInternal> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<androidx.camera.core.CameraXConfig> getInputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.adapter.CameraStateAdapter> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe> getOutputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> getOutputMinFrameDuration;
    private final dagger.internal.Provider<java.util.Set<androidx.camera.camera2.impl.UseCaseCameraControl>> getOutputMinFrameDurationlomOqCM;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.LowLightBoostControl> getOutputSizes;
    private final dagger.internal.Provider<androidx.camera.core.impl.EncoderProfilesProvider> getOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.DisplayInfoManager> getOutputStallDuration;
    private final dagger.internal.Provider<android.content.Context> getOutputStallDurationlomOqCM;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> isOutputSupportedForhNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.adapter.ZslControl> unwrapAs;

    private UseCaseManager_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe> provider, dagger.internal.Provider<androidx.camera.core.concurrent.CameraCoordinator> provider2, dagger.internal.Provider<androidx.camera.camera2.config.UseCaseCameraComponent.Builder> provider3, dagger.internal.Provider<androidx.camera.camera2.adapter.ZslControl> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.LowLightBoostControl> provider5, dagger.internal.Provider<java.util.Set<androidx.camera.camera2.impl.UseCaseCameraControl>> provider6, dagger.internal.Provider<androidx.camera.camera2.interop.Camera2CameraControl> provider7, dagger.internal.Provider<androidx.camera.camera2.adapter.CameraStateAdapter> provider8, dagger.internal.Provider<androidx.camera.core.impl.CameraInternal> provider9, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider10, dagger.internal.Provider<androidx.camera.core.impl.CameraInfoInternal> provider11, dagger.internal.Provider<androidx.camera.core.impl.EncoderProfilesProvider> provider12, dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider13, dagger.internal.Provider<androidx.camera.core.CameraXConfig> provider14, dagger.internal.Provider<androidx.camera.camera2.impl.CameraGraphConfigProvider> provider15, dagger.internal.Provider<android.content.Context> provider16, dagger.internal.Provider<androidx.camera.camera2.impl.DisplayInfoManager> provider17) {
        this.getOutputFormats = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.unwrapAs = provider4;
        this.getOutputSizes = provider5;
        this.getOutputMinFrameDurationlomOqCM = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
        this.getInputSizeshNQ4ISI = provider8;
        this.getHighSpeedVideoSizesFor = provider9;
        this.isOutputSupportedForhNQ4ISI = provider10;
        this.getHighSpeedVideoFpsRanges = provider11;
        this.getOutputSizeshNQ4ISI = provider12;
        this.getOutputMinFrameDuration = provider13;
        this.getInputFormats = provider14;
        this.getHighResolutionOutputSizeshNQ4ISI = provider15;
        this.getOutputStallDurationlomOqCM = provider16;
        this.getOutputStallDuration = provider17;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.UseCaseManager get() {
        return newInstance(this.getOutputFormats.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.unwrapAs.get(), this.getOutputSizes.get(), this.getOutputMinFrameDurationlomOqCM.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizesFor, this.isOutputSupportedForhNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get(), this.getInputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputStallDurationlomOqCM.get(), this.getOutputStallDuration.get());
    }

    public static androidx.camera.camera2.impl.UseCaseManager_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe> provider, dagger.internal.Provider<androidx.camera.core.concurrent.CameraCoordinator> provider2, dagger.internal.Provider<androidx.camera.camera2.config.UseCaseCameraComponent.Builder> provider3, dagger.internal.Provider<androidx.camera.camera2.adapter.ZslControl> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.LowLightBoostControl> provider5, dagger.internal.Provider<java.util.Set<androidx.camera.camera2.impl.UseCaseCameraControl>> provider6, dagger.internal.Provider<androidx.camera.camera2.interop.Camera2CameraControl> provider7, dagger.internal.Provider<androidx.camera.camera2.adapter.CameraStateAdapter> provider8, dagger.internal.Provider<androidx.camera.core.impl.CameraInternal> provider9, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider10, dagger.internal.Provider<androidx.camera.core.impl.CameraInfoInternal> provider11, dagger.internal.Provider<androidx.camera.core.impl.EncoderProfilesProvider> provider12, dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider13, dagger.internal.Provider<androidx.camera.core.CameraXConfig> provider14, dagger.internal.Provider<androidx.camera.camera2.impl.CameraGraphConfigProvider> provider15, dagger.internal.Provider<android.content.Context> provider16, dagger.internal.Provider<androidx.camera.camera2.impl.DisplayInfoManager> provider17) {
        return new androidx.camera.camera2.impl.UseCaseManager_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    public static androidx.camera.camera2.impl.UseCaseManager newInstance(androidx.camera.camera2.pipe.CameraPipe cameraPipe, androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator, androidx.camera.camera2.config.UseCaseCameraComponent.Builder builder, androidx.camera.camera2.adapter.ZslControl zslControl, androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl, java.util.Set<androidx.camera.camera2.impl.UseCaseCameraControl> set, androidx.camera.camera2.interop.Camera2CameraControl camera2CameraControl, androidx.camera.camera2.adapter.CameraStateAdapter cameraStateAdapter, javax.inject.Provider<androidx.camera.core.impl.CameraInternal> provider, javax.inject.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider2, javax.inject.Provider<androidx.camera.core.impl.CameraInfoInternal> provider3, androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.core.CameraXConfig cameraXConfig, androidx.camera.camera2.impl.CameraGraphConfigProvider cameraGraphConfigProvider, android.content.Context context, androidx.camera.camera2.impl.DisplayInfoManager displayInfoManager) {
        return new androidx.camera.camera2.impl.UseCaseManager(cameraPipe, cameraCoordinator, builder, zslControl, lowLightBoostControl, set, camera2CameraControl, cameraStateAdapter, provider, provider2, provider3, encoderProfilesProvider, cameraProperties, cameraXConfig, cameraGraphConfigProvider, context, displayInfoManager);
    }
}
