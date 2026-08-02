package org.betup.ui.fragment.login;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.NewLoginInteractor;
import org.betup.model.remote.api.rest.user.UpgradeLoginInteractor;
import org.betup.model.remote.api.rest.user.V7GetCustomTokenInteractor;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.login.controller.AuthController;

/* loaded from: classes4.dex */
public final class AuthFragment_MembersInjector implements MembersInjector<AuthFragment> {
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<AuthController> authControllerProvider;
    private final Provider<NewLoginInteractor> newLoginInteractorProvider;
    private final Provider<UpgradeLoginInteractor> upgradeLoginInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7GetCustomTokenInteractor> v7GetCustomTokenInteractorProvider;

    public AuthFragment_MembersInjector(Provider<AuthController> authControllerProvider, Provider<NewLoginInteractor> newLoginInteractorProvider, Provider<UpgradeLoginInteractor> upgradeLoginInteractorProvider, Provider<UserService> userServiceProvider, Provider<V7GetCustomTokenInteractor> v7GetCustomTokenInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider) {
        this.authControllerProvider = authControllerProvider;
        this.newLoginInteractorProvider = newLoginInteractorProvider;
        this.upgradeLoginInteractorProvider = upgradeLoginInteractorProvider;
        this.userServiceProvider = userServiceProvider;
        this.v7GetCustomTokenInteractorProvider = v7GetCustomTokenInteractorProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
    }

    public static MembersInjector<AuthFragment> create(Provider<AuthController> authControllerProvider, Provider<NewLoginInteractor> newLoginInteractorProvider, Provider<UpgradeLoginInteractor> upgradeLoginInteractorProvider, Provider<UserService> userServiceProvider, Provider<V7GetCustomTokenInteractor> v7GetCustomTokenInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider) {
        return new AuthFragment_MembersInjector(authControllerProvider, newLoginInteractorProvider, upgradeLoginInteractorProvider, userServiceProvider, v7GetCustomTokenInteractorProvider, analyticsServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AuthFragment instance) {
        injectAuthController(instance, this.authControllerProvider.get());
        injectNewLoginInteractor(instance, this.newLoginInteractorProvider.get());
        injectUpgradeLoginInteractor(instance, this.upgradeLoginInteractorProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectV7GetCustomTokenInteractor(instance, this.v7GetCustomTokenInteractorProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
    }

    public static void injectAuthController(AuthFragment instance, AuthController authController) {
        instance.authController = authController;
    }

    public static void injectNewLoginInteractor(AuthFragment instance, NewLoginInteractor newLoginInteractor) {
        instance.newLoginInteractor = newLoginInteractor;
    }

    public static void injectUpgradeLoginInteractor(AuthFragment instance, UpgradeLoginInteractor upgradeLoginInteractor) {
        instance.upgradeLoginInteractor = upgradeLoginInteractor;
    }

    public static void injectUserService(AuthFragment instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectV7GetCustomTokenInteractor(AuthFragment instance, V7GetCustomTokenInteractor v7GetCustomTokenInteractor) {
        instance.v7GetCustomTokenInteractor = v7GetCustomTokenInteractor;
    }

    public static void injectAnalyticsService(AuthFragment instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }
}
