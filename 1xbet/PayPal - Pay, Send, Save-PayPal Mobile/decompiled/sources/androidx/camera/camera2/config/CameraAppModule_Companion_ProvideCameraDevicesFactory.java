package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraAppModule_Companion_ProvideCameraDevicesFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraDevices> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe> getHighSpeedVideoSizes;

    private CameraAppModule_Companion_ProvideCameraDevicesFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraDevices get() {
        return provideCameraDevices(this.getHighSpeedVideoSizes.get());
    }

    public static androidx.camera.camera2.config.CameraAppModule_Companion_ProvideCameraDevicesFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe> provider) {
        return new androidx.camera.camera2.config.CameraAppModule_Companion_ProvideCameraDevicesFactory(provider);
    }

    public static androidx.camera.camera2.pipe.CameraDevices provideCameraDevices(androidx.camera.camera2.pipe.CameraPipe cameraPipe) {
        return (androidx.camera.camera2.pipe.CameraDevices) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.config.CameraAppModule.INSTANCE.provideCameraDevices(cameraPipe));
    }
}
