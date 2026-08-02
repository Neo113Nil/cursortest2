package org.betup.ui.fragment.user;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.bets.BetsController;

/* loaded from: classes4.dex */
public final class UserDetailsFragmentK_MembersInjector implements MembersInjector<UserDetailsFragmentK> {
    private final Provider<BetsController> betListControllerProvider;
    private final Provider<UserDetailsController> controllerProvider;
    private final Provider<UserService> userServiceProvider;

    public UserDetailsFragmentK_MembersInjector(Provider<UserDetailsController> controllerProvider, Provider<BetsController> betListControllerProvider, Provider<UserService> userServiceProvider) {
        this.controllerProvider = controllerProvider;
        this.betListControllerProvider = betListControllerProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<UserDetailsFragmentK> create(Provider<UserDetailsController> controllerProvider, Provider<BetsController> betListControllerProvider, Provider<UserService> userServiceProvider) {
        return new UserDetailsFragmentK_MembersInjector(controllerProvider, betListControllerProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UserDetailsFragmentK instance) {
        injectController(instance, this.controllerProvider.get());
        injectBetListController(instance, this.betListControllerProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectController(UserDetailsFragmentK instance, UserDetailsController controller) {
        instance.controller = controller;
    }

    public static void injectBetListController(UserDetailsFragmentK instance, BetsController betListController) {
        instance.betListController = betListController;
    }

    public static void injectUserService(UserDetailsFragmentK instance, UserService userService) {
        instance.userService = userService;
    }
}
