package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeModule_Companion_ProvideDevicePolicyManagerWrapperFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private CameraPipeModule_Companion_ProvideDevicePolicyManagerWrapperFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper get() {
        return provideDevicePolicyManagerWrapper(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideDevicePolicyManagerWrapperFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideDevicePolicyManagerWrapperFactory(provider);
    }

    public static androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper provideDevicePolicyManagerWrapper(android.content.Context context) {
        return (androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.CameraPipeModule.INSTANCE.provideDevicePolicyManagerWrapper(context));
    }
}
