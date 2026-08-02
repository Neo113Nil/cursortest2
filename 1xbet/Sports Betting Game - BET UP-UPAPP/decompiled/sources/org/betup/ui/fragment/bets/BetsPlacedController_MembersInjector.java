package org.betup.ui.fragment.bets;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.bets.SingleBetInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class BetsPlacedController_MembersInjector implements MembersInjector<BetsPlacedController> {
    private final Provider<SingleBetInteractor> betsSingleBetInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public BetsPlacedController_MembersInjector(Provider<UserService> userServiceProvider, Provider<SingleBetInteractor> betsSingleBetInteractorProvider) {
        this.userServiceProvider = userServiceProvider;
        this.betsSingleBetInteractorProvider = betsSingleBetInteractorProvider;
    }

    public static MembersInjector<BetsPlacedController> create(Provider<UserService> userServiceProvider, Provider<SingleBetInteractor> betsSingleBetInteractorProvider) {
        return new BetsPlacedController_MembersInjector(userServiceProvider, betsSingleBetInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BetsPlacedController instance) {
        injectUserService(instance, this.userServiceProvider.get());
        injectBetsSingleBetInteractor(instance, this.betsSingleBetInteractorProvider.get());
    }

    public static void injectUserService(BetsPlacedController instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectBetsSingleBetInteractor(BetsPlacedController instance, SingleBetInteractor betsSingleBetInteractor) {
        instance.betsSingleBetInteractor = betsSingleBetInteractor;
    }
}
