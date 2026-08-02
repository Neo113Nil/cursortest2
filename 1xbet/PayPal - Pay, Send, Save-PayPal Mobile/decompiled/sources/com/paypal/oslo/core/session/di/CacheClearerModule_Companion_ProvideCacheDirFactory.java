package com.paypal.oslo.core.session.di;

/* loaded from: classes5.dex */
public final class CacheClearerModule_Companion_ProvideCacheDirFactory implements dagger.internal.Factory<java.io.File> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private CacheClearerModule_Companion_ProvideCacheDirFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.io.File get() {
        return provideCacheDir(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.session.di.CacheClearerModule_Companion_ProvideCacheDirFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.core.session.di.CacheClearerModule_Companion_ProvideCacheDirFactory(provider);
    }

    public static java.io.File provideCacheDir(android.content.Context context) {
        return (java.io.File) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.session.di.CacheClearerModule.INSTANCE.provideCacheDir(context));
    }
}
