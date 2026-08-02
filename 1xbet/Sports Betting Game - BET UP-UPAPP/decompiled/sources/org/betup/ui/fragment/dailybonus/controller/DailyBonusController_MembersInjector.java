package org.betup.ui.fragment.dailybonus.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.bonus.V7DailyBonusInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class DailyBonusController_MembersInjector implements MembersInjector<DailyBonusController> {
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7DailyBonusInteractor> v7DailyBonusInteractorProvider;

    public DailyBonusController_MembersInjector(Provider<V7DailyBonusInteractor> v7DailyBonusInteractorProvider, Provider<UserService> userServiceProvider) {
        this.v7DailyBonusInteractorProvider = v7DailyBonusInteractorProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<DailyBonusController> create(Provider<V7DailyBonusInteractor> v7DailyBonusInteractorProvider, Provider<UserService> userServiceProvider) {
        return new DailyBonusController_MembersInjector(v7DailyBonusInteractorProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DailyBonusController instance) {
        injectV7DailyBonusInteractor(instance, this.v7DailyBonusInteractorProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectV7DailyBonusInteractor(DailyBonusController instance, V7DailyBonusInteractor v7DailyBonusInteractor) {
        instance.v7DailyBonusInteractor = v7DailyBonusInteractor;
    }

    public static void injectUserService(DailyBonusController instance, UserService userService) {
        instance.userService = userService;
    }
}
