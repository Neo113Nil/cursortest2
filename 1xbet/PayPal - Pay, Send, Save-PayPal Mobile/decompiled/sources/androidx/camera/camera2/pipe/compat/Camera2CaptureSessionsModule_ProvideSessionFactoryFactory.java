package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class Camera2CaptureSessionsModule_ProvideSessionFactoryFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.CaptureSessionFactory> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidMSessionFactory> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidNSessionFactory> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidPSessionFactory> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> getInputFormats;

    private Camera2CaptureSessionsModule_ProvideSessionFactoryFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidMSessionFactory> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidNSessionFactory> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidPSessionFactory> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider6) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.getInputFormats = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.CaptureSessionFactory get() {
        return provideSessionFactory(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getInputFormats.get());
    }

    public static androidx.camera.camera2.pipe.compat.Camera2CaptureSessionsModule_ProvideSessionFactoryFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidMSessionFactory> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidNSessionFactory> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidPSessionFactory> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider6) {
        return new androidx.camera.camera2.pipe.compat.Camera2CaptureSessionsModule_ProvideSessionFactoryFactory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static androidx.camera.camera2.pipe.compat.CaptureSessionFactory provideSessionFactory(javax.inject.Provider<androidx.camera.camera2.pipe.compat.AndroidMSessionFactory> provider, javax.inject.Provider<androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory> provider2, javax.inject.Provider<androidx.camera.camera2.pipe.compat.AndroidNSessionFactory> provider3, javax.inject.Provider<androidx.camera.camera2.pipe.compat.AndroidPSessionFactory> provider4, javax.inject.Provider<androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory> provider5, androidx.camera.camera2.pipe.CameraGraph.Config config) {
        return (androidx.camera.camera2.pipe.compat.CaptureSessionFactory) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.compat.Camera2CaptureSessionsModule.INSTANCE.provideSessionFactory(provider, provider2, provider3, provider4, provider5, config));
    }
}
