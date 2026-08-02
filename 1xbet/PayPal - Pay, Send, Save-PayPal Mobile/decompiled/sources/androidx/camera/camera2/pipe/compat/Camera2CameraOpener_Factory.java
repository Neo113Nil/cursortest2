package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class Camera2CameraOpener_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.Camera2CameraOpener> {
    private final dagger.internal.Provider<android.hardware.camera2.CameraManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighSpeedVideoFpsRangesFor;

    private Camera2CameraOpener_Factory(dagger.internal.Provider<android.hardware.camera2.CameraManager> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.Camera2CameraOpener get() {
        return newInstance(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.compat.Camera2CameraOpener_Factory create(dagger.internal.Provider<android.hardware.camera2.CameraManager> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2) {
        return new androidx.camera.camera2.pipe.compat.Camera2CameraOpener_Factory(provider, provider2);
    }

    public static androidx.camera.camera2.pipe.compat.Camera2CameraOpener newInstance(javax.inject.Provider<android.hardware.camera2.CameraManager> provider, androidx.camera.camera2.pipe.core.Threads threads) {
        return new androidx.camera.camera2.pipe.compat.Camera2CameraOpener(provider, threads);
    }
}
