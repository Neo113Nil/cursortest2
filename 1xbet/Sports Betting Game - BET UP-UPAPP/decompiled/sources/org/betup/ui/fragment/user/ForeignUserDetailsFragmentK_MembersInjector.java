package org.betup.ui.fragment.user;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.bets.BetsController;

/* loaded from: classes4.dex */
public final class ForeignUserDetailsFragmentK_MembersInjector implements MembersInjector<ForeignUserDetailsFragmentK> {
    private final Provider<BetsController> betListControllerProvider;
    private final Provider<ForeignUserDetailsController> controllerProvider;
    private final Provider<UserService> userServiceProvider;

    public ForeignUserDetailsFragmentK_MembersInjector(Provider<ForeignUserDetailsController> controllerProvider, Provider<BetsController> betListControllerProvider, Provider<UserService> userServiceProvider) {
        this.controllerProvider = controllerProvider;
        this.betListControllerProvider = betListControllerProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<ForeignUserDetailsFragmentK> create(Provider<ForeignUserDetailsController> controllerProvider, Provider<BetsController> betListControllerProvider, Provider<UserService> userServiceProvider) {
        return new ForeignUserDetailsFragmentK_MembersInjector(controllerProvider, betListControllerProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ForeignUserDetailsFragmentK instance) {
        injectController(instance, this.controllerProvider.get());
        injectBetListController(instance, this.betListControllerProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectController(ForeignUserDetailsFragmentK instance, ForeignUserDetailsController controller) {
        instance.controller = controller;
    }

    public static void injectBetListController(ForeignUserDetailsFragmentK instance, BetsController betListController) {
        instance.betListController = betListController;
    }

    public static void injectUserService(ForeignUserDetailsFragmentK instance, UserService userService) {
        instance.userService = userService;
    }
}
