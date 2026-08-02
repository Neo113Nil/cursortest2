package org.betup.ui.fragment.user.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.challenges.NewUserAvailableChallengesInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserBattleCountsInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserChallengesHistoryInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserPrivateChallengesInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class UserBattlesController_MembersInjector implements MembersInjector<UserBattlesController> {
    private final Provider<NewUserAvailableChallengesInteractor> newUserAvailableChallengesInteractorProvider;
    private final Provider<NewUserBattleCountsInteractor> newUserBattleCountsInteractorProvider;
    private final Provider<NewUserChallengesHistoryInteractor> newUserChallengesHistoryInteractorProvider;
    private final Provider<NewUserPrivateChallengesInteractor> newUserPrivateChallengesInteractorProvider;
    private final Provider<UserService> userServicePProvider;

    public UserBattlesController_MembersInjector(Provider<NewUserAvailableChallengesInteractor> newUserAvailableChallengesInteractorProvider, Provider<NewUserPrivateChallengesInteractor> newUserPrivateChallengesInteractorProvider, Provider<NewUserChallengesHistoryInteractor> newUserChallengesHistoryInteractorProvider, Provider<NewUserBattleCountsInteractor> newUserBattleCountsInteractorProvider, Provider<UserService> userServicePProvider) {
        this.newUserAvailableChallengesInteractorProvider = newUserAvailableChallengesInteractorProvider;
        this.newUserPrivateChallengesInteractorProvider = newUserPrivateChallengesInteractorProvider;
        this.newUserChallengesHistoryInteractorProvider = newUserChallengesHistoryInteractorProvider;
        this.newUserBattleCountsInteractorProvider = newUserBattleCountsInteractorProvider;
        this.userServicePProvider = userServicePProvider;
    }

    public static MembersInjector<UserBattlesController> create(Provider<NewUserAvailableChallengesInteractor> newUserAvailableChallengesInteractorProvider, Provider<NewUserPrivateChallengesInteractor> newUserPrivateChallengesInteractorProvider, Provider<NewUserChallengesHistoryInteractor> newUserChallengesHistoryInteractorProvider, Provider<NewUserBattleCountsInteractor> newUserBattleCountsInteractorProvider, Provider<UserService> userServicePProvider) {
        return new UserBattlesController_MembersInjector(newUserAvailableChallengesInteractorProvider, newUserPrivateChallengesInteractorProvider, newUserChallengesHistoryInteractorProvider, newUserBattleCountsInteractorProvider, userServicePProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UserBattlesController instance) {
        injectNewUserAvailableChallengesInteractor(instance, this.newUserAvailableChallengesInteractorProvider.get());
        injectNewUserPrivateChallengesInteractor(instance, this.newUserPrivateChallengesInteractorProvider.get());
        injectNewUserChallengesHistoryInteractor(instance, this.newUserChallengesHistoryInteractorProvider.get());
        injectNewUserBattleCountsInteractor(instance, this.newUserBattleCountsInteractorProvider.get());
        injectUserServiceP(instance, this.userServicePProvider.get());
    }

    public static void injectNewUserAvailableChallengesInteractor(UserBattlesController instance, NewUserAvailableChallengesInteractor newUserAvailableChallengesInteractor) {
        instance.newUserAvailableChallengesInteractor = newUserAvailableChallengesInteractor;
    }

    public static void injectNewUserPrivateChallengesInteractor(UserBattlesController instance, NewUserPrivateChallengesInteractor newUserPrivateChallengesInteractor) {
        instance.newUserPrivateChallengesInteractor = newUserPrivateChallengesInteractor;
    }

    public static void injectNewUserChallengesHistoryInteractor(UserBattlesController instance, NewUserChallengesHistoryInteractor newUserChallengesHistoryInteractor) {
        instance.newUserChallengesHistoryInteractor = newUserChallengesHistoryInteractor;
    }

    public static void injectNewUserBattleCountsInteractor(UserBattlesController instance, NewUserBattleCountsInteractor newUserBattleCountsInteractor) {
        instance.newUserBattleCountsInteractor = newUserBattleCountsInteractor;
    }

    public static void injectUserServiceP(UserBattlesController instance, UserService userServiceP) {
        instance.userServiceP = userServiceP;
    }
}
