package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeModule_Companion_ProvidePackageManagerFactory implements dagger.internal.Factory<android.content.pm.PackageManager> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private CameraPipeModule_Companion_ProvidePackageManagerFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final android.content.pm.PackageManager get() {
        return providePackageManager(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvidePackageManagerFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvidePackageManagerFactory(provider);
    }

    public static android.content.pm.PackageManager providePackageManager(android.content.Context context) {
        return (android.content.pm.PackageManager) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.CameraPipeModule.INSTANCE.providePackageManager(context));
    }
}
