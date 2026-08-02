package org.betup.ui.fragment.dailybonus.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.bonus.V7DailyBonusInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class DailyBonusController_Factory implements Factory<DailyBonusController> {
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7DailyBonusInteractor> v7DailyBonusInteractorProvider;

    public DailyBonusController_Factory(Provider<V7DailyBonusInteractor> v7DailyBonusInteractorProvider, Provider<UserService> userServiceProvider) {
        this.v7DailyBonusInteractorProvider = v7DailyBonusInteractorProvider;
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public DailyBonusController get() {
        DailyBonusController dailyBonusController = new DailyBonusController();
        DailyBonusController_MembersInjector.injectV7DailyBonusInteractor(dailyBonusController, this.v7DailyBonusInteractorProvider.get());
        DailyBonusController_MembersInjector.injectUserService(dailyBonusController, this.userServiceProvider.get());
        return dailyBonusController;
    }

    public static DailyBonusController_Factory create(Provider<V7DailyBonusInteractor> v7DailyBonusInteractorProvider, Provider<UserService> userServiceProvider) {
        return new DailyBonusController_Factory(v7DailyBonusInteractorProvider, userServiceProvider);
    }

    public static DailyBonusController newDailyBonusController() {
        return new DailyBonusController();
    }
}
