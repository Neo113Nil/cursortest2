package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class Camera2DeviceCloserImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighSpeedVideoSizes;

    private Camera2DeviceCloserImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.Camera2Quirks> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener> provider3) {
        return new androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl_Factory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl newInstance(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.compat.Camera2Quirks camera2Quirks, androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener retryingCameraStateOpener) {
        return new androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl(threads, camera2Quirks, retryingCameraStateOpener);
    }
}
