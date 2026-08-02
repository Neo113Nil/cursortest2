package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeModule_Companion_ProvideCameraContextFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraContext> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackends> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private CameraPipeModule_Companion_ProvideCameraContextFactory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackends> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraContext get() {
        return provideCameraContext(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraContextFactory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackends> provider3) {
        return new androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraContextFactory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.pipe.CameraContext provideCameraContext(android.content.Context context, androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraBackends cameraBackends) {
        return (androidx.camera.camera2.pipe.CameraContext) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.CameraPipeModule.INSTANCE.provideCameraContext(context, threads, cameraBackends));
    }
}
