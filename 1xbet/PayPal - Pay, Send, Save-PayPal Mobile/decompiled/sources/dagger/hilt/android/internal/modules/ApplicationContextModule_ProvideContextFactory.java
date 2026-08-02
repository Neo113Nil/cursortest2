package dagger.hilt.android.internal.modules;

/* loaded from: classes5.dex */
public final class ApplicationContextModule_ProvideContextFactory implements dagger.internal.Factory<android.content.Context> {
    private final dagger.hilt.android.internal.modules.ApplicationContextModule getHighSpeedVideoSizes;

    private ApplicationContextModule_ProvideContextFactory(dagger.hilt.android.internal.modules.ApplicationContextModule applicationContextModule) {
        this.getHighSpeedVideoSizes = applicationContextModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final android.content.Context get() {
        return provideContext(this.getHighSpeedVideoSizes);
    }

    public static dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory create(dagger.hilt.android.internal.modules.ApplicationContextModule applicationContextModule) {
        return new dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory(applicationContextModule);
    }

    public static android.content.Context provideContext(dagger.hilt.android.internal.modules.ApplicationContextModule applicationContextModule) {
        return (android.content.Context) dagger.internal.Preconditions.checkNotNullFromProvides(applicationContextModule.getHighSpeedVideoFpsRanges());
    }
}
