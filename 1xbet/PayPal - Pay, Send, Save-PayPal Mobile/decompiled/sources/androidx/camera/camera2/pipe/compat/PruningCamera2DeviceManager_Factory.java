package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class PruningCamera2DeviceManager_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceCloser> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Permissions> getHighSpeedVideoSizes;

    private PruningCamera2DeviceManager_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Permissions> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceCloser> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Permissions> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2DeviceCloser> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider5) {
        return new androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager newInstance(androidx.camera.camera2.pipe.core.Permissions permissions, androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener retryingCameraStateOpener, androidx.camera.camera2.pipe.compat.Camera2DeviceCloser camera2DeviceCloser, androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor camera2ErrorProcessor, androidx.camera.camera2.pipe.core.Threads threads) {
        return new androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager(permissions, retryingCameraStateOpener, camera2DeviceCloser, camera2ErrorProcessor, threads);
    }
}
