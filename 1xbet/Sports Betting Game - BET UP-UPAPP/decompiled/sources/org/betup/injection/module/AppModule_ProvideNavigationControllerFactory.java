package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.bus.NavigateMessage;
import org.betup.services.casino.CasinoService;
import org.betup.services.navigate.NavigationService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class AppModule_ProvideNavigationControllerFactory implements Factory<NavigationService<NavigateMessage.Target>> {
    private final Provider<CasinoService> casinoServiceProvider;
    private final AppModule module;
    private final Provider<UserService> userServiceProvider;

    public AppModule_ProvideNavigationControllerFactory(AppModule module, Provider<UserService> userServiceProvider, Provider<CasinoService> casinoServiceProvider) {
        this.module = module;
        this.userServiceProvider = userServiceProvider;
        this.casinoServiceProvider = casinoServiceProvider;
    }

    @Override // javax.inject.Provider
    public NavigationService<NavigateMessage.Target> get() {
        return (NavigationService) Preconditions.checkNotNull(this.module.provideNavigationController(this.userServiceProvider.get(), this.casinoServiceProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideNavigationControllerFactory create(AppModule module, Provider<UserService> userServiceProvider, Provider<CasinoService> casinoServiceProvider) {
        return new AppModule_ProvideNavigationControllerFactory(module, userServiceProvider, casinoServiceProvider);
    }

    public static NavigationService<NavigateMessage.Target> proxyProvideNavigationController(AppModule instance, UserService userService, CasinoService casinoService) {
        return (NavigationService) Preconditions.checkNotNull(instance.provideNavigationController(userService, casinoService), "Cannot return null from a non-@Nullable @Provides method");
    }
}
