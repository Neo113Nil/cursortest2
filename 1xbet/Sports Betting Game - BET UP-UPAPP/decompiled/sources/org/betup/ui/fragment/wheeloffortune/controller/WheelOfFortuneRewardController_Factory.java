package org.betup.ui.fragment.wheeloffortune.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.reward.GiveWheelOfFortuneRewardInteractor;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;

/* loaded from: classes4.dex */
public final class WheelOfFortuneRewardController_Factory implements Factory<WheelOfFortuneRewardController> {
    private final Provider<DailyBonusController> dailyBonusControllerProvider;
    private final Provider<GiveWheelOfFortuneRewardInteractor> giveWheelOfFortuneRewardInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public WheelOfFortuneRewardController_Factory(Provider<GiveWheelOfFortuneRewardInteractor> giveWheelOfFortuneRewardInteractorProvider, Provider<UserService> userServiceProvider, Provider<DailyBonusController> dailyBonusControllerProvider) {
        this.giveWheelOfFortuneRewardInteractorProvider = giveWheelOfFortuneRewardInteractorProvider;
        this.userServiceProvider = userServiceProvider;
        this.dailyBonusControllerProvider = dailyBonusControllerProvider;
    }

    @Override // javax.inject.Provider
    public WheelOfFortuneRewardController get() {
        return new WheelOfFortuneRewardController(this.giveWheelOfFortuneRewardInteractorProvider.get(), this.userServiceProvider.get(), this.dailyBonusControllerProvider.get());
    }

    public static WheelOfFortuneRewardController_Factory create(Provider<GiveWheelOfFortuneRewardInteractor> giveWheelOfFortuneRewardInteractorProvider, Provider<UserService> userServiceProvider, Provider<DailyBonusController> dailyBonusControllerProvider) {
        return new WheelOfFortuneRewardController_Factory(giveWheelOfFortuneRewardInteractorProvider, userServiceProvider, dailyBonusControllerProvider);
    }
}
