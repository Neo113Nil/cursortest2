package org.betup.ui;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.down.ServerErrorsProcessor;
import org.betup.services.user.SocialConnectionService;

/* loaded from: classes2.dex */
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
    private final Provider<ServerErrorsProcessor> serverErrorsProcessorProvider;
    private final Provider<SocialConnectionService> socialConnectionServiceProvider;

    public LoginActivity_MembersInjector(Provider<ServerErrorsProcessor> serverErrorsProcessorProvider, Provider<SocialConnectionService> socialConnectionServiceProvider) {
        this.serverErrorsProcessorProvider = serverErrorsProcessorProvider;
        this.socialConnectionServiceProvider = socialConnectionServiceProvider;
    }

    public static MembersInjector<LoginActivity> create(Provider<ServerErrorsProcessor> serverErrorsProcessorProvider, Provider<SocialConnectionService> socialConnectionServiceProvider) {
        return new LoginActivity_MembersInjector(serverErrorsProcessorProvider, socialConnectionServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LoginActivity instance) {
        injectServerErrorsProcessor(instance, this.serverErrorsProcessorProvider.get());
        injectSocialConnectionService(instance, this.socialConnectionServiceProvider.get());
    }

    public static void injectServerErrorsProcessor(LoginActivity instance, ServerErrorsProcessor serverErrorsProcessor) {
        instance.serverErrorsProcessor = serverErrorsProcessor;
    }

    public static void injectSocialConnectionService(LoginActivity instance, SocialConnectionService socialConnectionService) {
        instance.socialConnectionService = socialConnectionService;
    }
}
