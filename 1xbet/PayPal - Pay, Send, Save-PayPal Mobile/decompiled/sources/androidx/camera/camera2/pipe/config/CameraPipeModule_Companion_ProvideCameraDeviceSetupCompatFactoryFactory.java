package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeModule_Companion_ProvideCameraDeviceSetupCompatFactoryFactory implements dagger.internal.Factory<androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;

    private CameraPipeModule_Companion_ProvideCameraDeviceSetupCompatFactoryFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory get() {
        return provideCameraDeviceSetupCompatFactory(this.Camera2StreamConfigurationMap.get());
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraDeviceSetupCompatFactoryFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraDeviceSetupCompatFactoryFactory(provider);
    }

    public static androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory provideCameraDeviceSetupCompatFactory(android.content.Context context) {
        return (androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.CameraPipeModule.INSTANCE.provideCameraDeviceSetupCompatFactory(context));
    }
}
