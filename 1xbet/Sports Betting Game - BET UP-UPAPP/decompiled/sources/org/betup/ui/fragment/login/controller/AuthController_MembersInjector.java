package org.betup.ui.fragment.login.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.user.SocialConnectionService;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class AuthController_MembersInjector implements MembersInjector<AuthController> {
    private final Provider<SocialConnectionService> socialConnectionServiceProvider;
    private final Provider<UserService> userServiceProvider;

    public AuthController_MembersInjector(Provider<UserService> userServiceProvider, Provider<SocialConnectionService> socialConnectionServiceProvider) {
        this.userServiceProvider = userServiceProvider;
        this.socialConnectionServiceProvider = socialConnectionServiceProvider;
    }

    public static MembersInjector<AuthController> create(Provider<UserService> userServiceProvider, Provider<SocialConnectionService> socialConnectionServiceProvider) {
        return new AuthController_MembersInjector(userServiceProvider, socialConnectionServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AuthController instance) {
        injectUserService(instance, this.userServiceProvider.get());
        injectSocialConnectionService(instance, this.socialConnectionServiceProvider.get());
    }

    public static void injectUserService(AuthController instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectSocialConnectionService(AuthController instance, SocialConnectionService socialConnectionService) {
        instance.socialConnectionService = socialConnectionService;
    }
}
