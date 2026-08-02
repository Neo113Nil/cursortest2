package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.services.challenge.ChallengeTourInfoProvider;

/* loaded from: classes2.dex */
public final class AppModule_ProvideChallengeTourInfoProviderFactory implements Factory<ChallengeTourInfoProvider> {
    private final AppModule module;

    public AppModule_ProvideChallengeTourInfoProviderFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public ChallengeTourInfoProvider get() {
        return (ChallengeTourInfoProvider) Preconditions.checkNotNull(this.module.provideChallengeTourInfoProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideChallengeTourInfoProviderFactory create(AppModule module) {
        return new AppModule_ProvideChallengeTourInfoProviderFactory(module);
    }

    public static ChallengeTourInfoProvider proxyProvideChallengeTourInfoProvider(AppModule instance) {
        return (ChallengeTourInfoProvider) Preconditions.checkNotNull(instance.provideChallengeTourInfoProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
