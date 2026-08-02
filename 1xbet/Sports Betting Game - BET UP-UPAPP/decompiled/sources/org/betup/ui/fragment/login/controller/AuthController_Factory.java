package org.betup.ui.fragment.login.controller;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.user.SocialConnectionService;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class AuthController_Factory implements Factory<AuthController> {
    private final Provider<Context> contextProvider;
    private final Provider<SocialConnectionService> socialConnectionServiceProvider;
    private final Provider<UserService> userServiceProvider;

    public AuthController_Factory(Provider<Context> contextProvider, Provider<UserService> userServiceProvider, Provider<SocialConnectionService> socialConnectionServiceProvider) {
        this.contextProvider = contextProvider;
        this.userServiceProvider = userServiceProvider;
        this.socialConnectionServiceProvider = socialConnectionServiceProvider;
    }

    @Override // javax.inject.Provider
    public AuthController get() {
        AuthController authController = new AuthController(this.contextProvider.get());
        AuthController_MembersInjector.injectUserService(authController, this.userServiceProvider.get());
        AuthController_MembersInjector.injectSocialConnectionService(authController, this.socialConnectionServiceProvider.get());
        return authController;
    }

    public static AuthController_Factory create(Provider<Context> contextProvider, Provider<UserService> userServiceProvider, Provider<SocialConnectionService> socialConnectionServiceProvider) {
        return new AuthController_Factory(contextProvider, userServiceProvider, socialConnectionServiceProvider);
    }

    public static AuthController newAuthController(Context context) {
        return new AuthController(context);
    }
}
