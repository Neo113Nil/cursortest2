package org.betup.ui.fragment.user.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.challenges.NewUserAvailableChallengesInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserBattleCountsInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserChallengesHistoryInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserPrivateChallengesInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class UserBattlesController_Factory implements Factory<UserBattlesController> {
    private final Provider<NewUserAvailableChallengesInteractor> newUserAvailableChallengesInteractorProvider;
    private final Provider<NewUserBattleCountsInteractor> newUserBattleCountsInteractorProvider;
    private final Provider<NewUserChallengesHistoryInteractor> newUserChallengesHistoryInteractorProvider;
    private final Provider<NewUserPrivateChallengesInteractor> newUserPrivateChallengesInteractorProvider;
    private final Provider<UserService> userServicePProvider;

    public UserBattlesController_Factory(Provider<NewUserAvailableChallengesInteractor> newUserAvailableChallengesInteractorProvider, Provider<NewUserPrivateChallengesInteractor> newUserPrivateChallengesInteractorProvider, Provider<NewUserChallengesHistoryInteractor> newUserChallengesHistoryInteractorProvider, Provider<NewUserBattleCountsInteractor> newUserBattleCountsInteractorProvider, Provider<UserService> userServicePProvider) {
        this.newUserAvailableChallengesInteractorProvider = newUserAvailableChallengesInteractorProvider;
        this.newUserPrivateChallengesInteractorProvider = newUserPrivateChallengesInteractorProvider;
        this.newUserChallengesHistoryInteractorProvider = newUserChallengesHistoryInteractorProvider;
        this.newUserBattleCountsInteractorProvider = newUserBattleCountsInteractorProvider;
        this.userServicePProvider = userServicePProvider;
    }

    @Override // javax.inject.Provider
    public UserBattlesController get() {
        UserBattlesController userBattlesController = new UserBattlesController();
        UserBattlesController_MembersInjector.injectNewUserAvailableChallengesInteractor(userBattlesController, this.newUserAvailableChallengesInteractorProvider.get());
        UserBattlesController_MembersInjector.injectNewUserPrivateChallengesInteractor(userBattlesController, this.newUserPrivateChallengesInteractorProvider.get());
        UserBattlesController_MembersInjector.injectNewUserChallengesHistoryInteractor(userBattlesController, this.newUserChallengesHistoryInteractorProvider.get());
        UserBattlesController_MembersInjector.injectNewUserBattleCountsInteractor(userBattlesController, this.newUserBattleCountsInteractorProvider.get());
        UserBattlesController_MembersInjector.injectUserServiceP(userBattlesController, this.userServicePProvider.get());
        return userBattlesController;
    }

    public static UserBattlesController_Factory create(Provider<NewUserAvailableChallengesInteractor> newUserAvailableChallengesInteractorProvider, Provider<NewUserPrivateChallengesInteractor> newUserPrivateChallengesInteractorProvider, Provider<NewUserChallengesHistoryInteractor> newUserChallengesHistoryInteractorProvider, Provider<NewUserBattleCountsInteractor> newUserBattleCountsInteractorProvider, Provider<UserService> userServicePProvider) {
        return new UserBattlesController_Factory(newUserAvailableChallengesInteractorProvider, newUserPrivateChallengesInteractorProvider, newUserChallengesHistoryInteractorProvider, newUserBattleCountsInteractorProvider, userServicePProvider);
    }

    public static UserBattlesController newUserBattlesController() {
        return new UserBattlesController();
    }
}
