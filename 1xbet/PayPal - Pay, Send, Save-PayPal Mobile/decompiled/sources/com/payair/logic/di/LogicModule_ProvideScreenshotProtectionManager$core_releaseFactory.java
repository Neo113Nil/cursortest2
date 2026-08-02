package com.payair.logic.di;

/* loaded from: classes10.dex */
public final class LogicModule_ProvideScreenshotProtectionManager$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.ScreenshotProtectionManager> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4418a;

    public LogicModule_ProvideScreenshotProtectionManager$core_releaseFactory(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider) {
        this.f4418a = provider;
    }

    public static com.payair.logic.di.LogicModule_ProvideScreenshotProtectionManager$core_releaseFactory create(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider) {
        return new com.payair.logic.di.LogicModule_ProvideScreenshotProtectionManager$core_releaseFactory(provider);
    }

    public static com.payair.logic.managers.ScreenshotProtectionManager provideScreenshotProtectionManager$core_release(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        return (com.payair.logic.managers.ScreenshotProtectionManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideScreenshotProtectionManager$core_release(hceSDKInterface));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.ScreenshotProtectionManager get() {
        return provideScreenshotProtectionManager$core_release((com.payair.logic.implementation.HceSDKInterface) this.f4418a.get());
    }
}
