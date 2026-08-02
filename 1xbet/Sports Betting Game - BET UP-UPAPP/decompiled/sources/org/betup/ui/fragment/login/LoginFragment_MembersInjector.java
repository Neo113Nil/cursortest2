package org.betup.ui.fragment.login;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.NewLoginInteractor;
import org.betup.model.remote.api.rest.user.V7GetCustomTokenInteractor;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class LoginFragment_MembersInjector implements MembersInjector<LoginFragment> {
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<NewLoginInteractor> newLoginInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7GetCustomTokenInteractor> v7GetCustomTokenInteractorProvider;

    public LoginFragment_MembersInjector(Provider<NewLoginInteractor> newLoginInteractorProvider, Provider<UserService> userServiceProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<V7GetCustomTokenInteractor> v7GetCustomTokenInteractorProvider) {
        this.newLoginInteractorProvider = newLoginInteractorProvider;
        this.userServiceProvider = userServiceProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
        this.v7GetCustomTokenInteractorProvider = v7GetCustomTokenInteractorProvider;
    }

    public static MembersInjector<LoginFragment> create(Provider<NewLoginInteractor> newLoginInteractorProvider, Provider<UserService> userServiceProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<V7GetCustomTokenInteractor> v7GetCustomTokenInteractorProvider) {
        return new LoginFragment_MembersInjector(newLoginInteractorProvider, userServiceProvider, analyticsServiceProvider, v7GetCustomTokenInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LoginFragment instance) {
        injectNewLoginInteractor(instance, this.newLoginInteractorProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
        injectV7GetCustomTokenInteractor(instance, this.v7GetCustomTokenInteractorProvider.get());
    }

    public static void injectNewLoginInteractor(LoginFragment instance, NewLoginInteractor newLoginInteractor) {
        instance.newLoginInteractor = newLoginInteractor;
    }

    public static void injectUserService(LoginFragment instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectAnalyticsService(LoginFragment instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }

    public static void injectV7GetCustomTokenInteractor(LoginFragment instance, V7GetCustomTokenInteractor v7GetCustomTokenInteractor) {
        instance.v7GetCustomTokenInteractor = v7GetCustomTokenInteractor;
    }
}
