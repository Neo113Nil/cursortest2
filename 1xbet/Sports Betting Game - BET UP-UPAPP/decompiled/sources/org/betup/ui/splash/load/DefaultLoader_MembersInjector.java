package org.betup.ui.splash.load;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.NewLoginInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class DefaultLoader_MembersInjector implements MembersInjector<DefaultLoader> {
    private final Provider<NewLoginInteractor> newLoginInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public DefaultLoader_MembersInjector(Provider<UserService> userServiceProvider, Provider<NewLoginInteractor> newLoginInteractorProvider) {
        this.userServiceProvider = userServiceProvider;
        this.newLoginInteractorProvider = newLoginInteractorProvider;
    }

    public static MembersInjector<DefaultLoader> create(Provider<UserService> userServiceProvider, Provider<NewLoginInteractor> newLoginInteractorProvider) {
        return new DefaultLoader_MembersInjector(userServiceProvider, newLoginInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DefaultLoader instance) {
        injectUserService(instance, this.userServiceProvider.get());
        injectNewLoginInteractor(instance, this.newLoginInteractorProvider.get());
    }

    public static void injectUserService(DefaultLoader instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectNewLoginInteractor(DefaultLoader instance, NewLoginInteractor newLoginInteractor) {
        instance.newLoginInteractor = newLoginInteractor;
    }
}
