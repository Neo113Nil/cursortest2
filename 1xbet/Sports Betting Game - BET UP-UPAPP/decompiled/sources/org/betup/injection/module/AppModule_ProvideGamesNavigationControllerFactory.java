package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.bus.NavigateMessage;
import org.betup.services.navigate.NavigationService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class AppModule_ProvideGamesNavigationControllerFactory implements Factory<NavigationService<NavigateMessage.TargetGame>> {
    private final AppModule module;
    private final Provider<UserService> userServiceProvider;

    public AppModule_ProvideGamesNavigationControllerFactory(AppModule module, Provider<UserService> userServiceProvider) {
        this.module = module;
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public NavigationService<NavigateMessage.TargetGame> get() {
        return (NavigationService) Preconditions.checkNotNull(this.module.provideGamesNavigationController(this.userServiceProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideGamesNavigationControllerFactory create(AppModule module, Provider<UserService> userServiceProvider) {
        return new AppModule_ProvideGamesNavigationControllerFactory(module, userServiceProvider);
    }

    public static NavigationService<NavigateMessage.TargetGame> proxyProvideGamesNavigationController(AppModule instance, UserService userService) {
        return (NavigationService) Preconditions.checkNotNull(instance.provideGamesNavigationController(userService), "Cannot return null from a non-@Nullable @Provides method");
    }
}
