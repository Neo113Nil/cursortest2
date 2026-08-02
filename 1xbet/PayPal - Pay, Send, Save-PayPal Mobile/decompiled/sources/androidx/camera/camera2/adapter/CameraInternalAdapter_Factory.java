package androidx.camera.camera2.adapter;

/* loaded from: classes6.dex */
public final class CameraInternalAdapter_Factory implements dagger.internal.Factory<androidx.camera.camera2.adapter.CameraInternalAdapter> {
    private final dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.core.impl.CameraInfoInternal> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.core.impl.CameraControlInternal> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.adapter.CameraStateAdapter> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseManager> getInputSizeshNQ4ISI;

    private CameraInternalAdapter_Factory(dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseManager> provider2, dagger.internal.Provider<androidx.camera.core.impl.CameraInfoInternal> provider3, dagger.internal.Provider<androidx.camera.core.impl.CameraControlInternal> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider5, dagger.internal.Provider<androidx.camera.camera2.adapter.CameraStateAdapter> provider6) {
        this.Camera2StreamConfigurationMap = provider;
        this.getInputSizeshNQ4ISI = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.adapter.CameraInternalAdapter get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getInputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.adapter.CameraInternalAdapter_Factory create(dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseManager> provider2, dagger.internal.Provider<androidx.camera.core.impl.CameraInfoInternal> provider3, dagger.internal.Provider<androidx.camera.core.impl.CameraControlInternal> provider4, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider5, dagger.internal.Provider<androidx.camera.camera2.adapter.CameraStateAdapter> provider6) {
        return new androidx.camera.camera2.adapter.CameraInternalAdapter_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static androidx.camera.camera2.adapter.CameraInternalAdapter newInstance(androidx.camera.camera2.config.CameraConfig cameraConfig, androidx.camera.camera2.impl.UseCaseManager useCaseManager, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.CameraControlInternal cameraControlInternal, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.adapter.CameraStateAdapter cameraStateAdapter) {
        return new androidx.camera.camera2.adapter.CameraInternalAdapter(cameraConfig, useCaseManager, cameraInfoInternal, cameraControlInternal, useCaseThreads, cameraStateAdapter);
    }
}
