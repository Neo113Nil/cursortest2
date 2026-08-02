package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.services.LocaleService;

/* loaded from: classes2.dex */
public final class AppModule_ProvideLocaleServiceFactory implements Factory<LocaleService> {
    private final AppModule module;

    public AppModule_ProvideLocaleServiceFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public LocaleService get() {
        return (LocaleService) Preconditions.checkNotNull(this.module.provideLocaleService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideLocaleServiceFactory create(AppModule module) {
        return new AppModule_ProvideLocaleServiceFactory(module);
    }

    public static LocaleService proxyProvideLocaleService(AppModule instance) {
        return (LocaleService) Preconditions.checkNotNull(instance.provideLocaleService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
