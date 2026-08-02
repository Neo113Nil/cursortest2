package dagger.hilt.android.internal.modules;

/* loaded from: classes5.dex */
public final class ApplicationContextModule_ProvideApplicationFactory implements dagger.internal.Factory<android.app.Application> {
    private final dagger.hilt.android.internal.modules.ApplicationContextModule Camera2StreamConfigurationMap;

    private ApplicationContextModule_ProvideApplicationFactory(dagger.hilt.android.internal.modules.ApplicationContextModule applicationContextModule) {
        this.Camera2StreamConfigurationMap = applicationContextModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final android.app.Application get() {
        return provideApplication(this.Camera2StreamConfigurationMap);
    }

    public static dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory create(dagger.hilt.android.internal.modules.ApplicationContextModule applicationContextModule) {
        return new dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory(applicationContextModule);
    }

    public static android.app.Application provideApplication(dagger.hilt.android.internal.modules.ApplicationContextModule applicationContextModule) {
        return (android.app.Application) dagger.internal.Preconditions.checkNotNullFromProvides(applicationContextModule.getHighSpeedVideoFpsRangesFor());
    }
}
