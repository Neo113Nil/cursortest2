package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.services.language.AppLanguageObserver;
import org.betup.services.language.DefaultAppLanguageObserver;

/* loaded from: classes2.dex */
public final class AppModule_ProvideAppLanguageObserverFactory implements Factory<AppLanguageObserver> {
    private final Provider<DefaultAppLanguageObserver> implProvider;
    private final AppModule module;

    public AppModule_ProvideAppLanguageObserverFactory(AppModule module, Provider<DefaultAppLanguageObserver> implProvider) {
        this.module = module;
        this.implProvider = implProvider;
    }

    @Override // javax.inject.Provider
    public AppLanguageObserver get() {
        return (AppLanguageObserver) Preconditions.checkNotNull(this.module.provideAppLanguageObserver(this.implProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideAppLanguageObserverFactory create(AppModule module, Provider<DefaultAppLanguageObserver> implProvider) {
        return new AppModule_ProvideAppLanguageObserverFactory(module, implProvider);
    }

    public static AppLanguageObserver proxyProvideAppLanguageObserver(AppModule instance, DefaultAppLanguageObserver impl) {
        return (AppLanguageObserver) Preconditions.checkNotNull(instance.provideAppLanguageObserver(impl), "Cannot return null from a non-@Nullable @Provides method");
    }
}
