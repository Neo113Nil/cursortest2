package org.betup.ui.splash;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.down.ServerErrorsProcessor;
import org.betup.services.storage.LocalPreferencesService;

/* loaded from: classes4.dex */
public final class SplashActivity_MembersInjector implements MembersInjector<SplashActivity> {
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<ServerErrorsProcessor> serverErrorsProcessorProvider;

    public SplashActivity_MembersInjector(Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<ServerErrorsProcessor> serverErrorsProcessorProvider) {
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
        this.serverErrorsProcessorProvider = serverErrorsProcessorProvider;
    }

    public static MembersInjector<SplashActivity> create(Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<ServerErrorsProcessor> serverErrorsProcessorProvider) {
        return new SplashActivity_MembersInjector(localPreferencesServiceProvider, serverErrorsProcessorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SplashActivity instance) {
        injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        injectServerErrorsProcessor(instance, this.serverErrorsProcessorProvider.get());
    }

    public static void injectLocalPreferencesService(SplashActivity instance, LocalPreferencesService localPreferencesService) {
        instance.localPreferencesService = localPreferencesService;
    }

    public static void injectServerErrorsProcessor(SplashActivity instance, ServerErrorsProcessor serverErrorsProcessor) {
        instance.serverErrorsProcessor = serverErrorsProcessor;
    }
}
