package org.betup.ui.fragment.user;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.challenges.NewUserAvailableChallengesInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserBattleCountsInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserChallengesHistoryInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserPrivateChallengesInteractor;
import org.betup.model.remote.api.rest.messaging.GetChatsInteractor;
import org.betup.model.remote.api.rest.messaging.GetPrivateMessagesInteractor;
import org.betup.model.remote.api.rest.messaging.SendPrivateMessasgesInteractor;
import org.betup.model.remote.api.rest.user.UserProfileStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserAchievementsInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserFavouritesInteractor;
import org.betup.model.remote.api.rest.user.V7UserFollowersInteractor;
import org.betup.model.remote.api.rest.user.V7UserInfoInteractor;
import org.betup.model.remote.api.rest.user.V7UserRankingStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserRanksInteractor;
import org.betup.model.remote.api.rest.user.bets.BetsListInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class UserDetailsController_MembersInjector implements MembersInjector<UserDetailsController> {
    private final Provider<BetsListInteractor> betsListInteractorProvider;
    private final Provider<GetChatsInteractor> getChatsInteractorProvider;
    private final Provider<GetPrivateMessagesInteractor> getPrivateMessagesInteractorProvider;
    private final Provider<NewUserAvailableChallengesInteractor> newUserAvailableChallengesInteractorProvider;
    private final Provider<NewUserBattleCountsInteractor> newUserBattleCountsInteractorProvider;
    private final Provider<NewUserChallengesHistoryInteractor> newUserChallengesHistoryInteractorProvider;
    private final Provider<NewUserPrivateChallengesInteractor> newUserPrivateChallengesInteractorProvider;
    private final Provider<SendPrivateMessasgesInteractor> sendPrivateMessagesInteractorProvider;
    private final Provider<UserProfileStatisticsInteractor> userProfileStatisticsInteractorProvider;
    private final Provider<UserService> userServicePProvider;
    private final Provider<V7UserAchievementsInteractor> v7UserAchievementsInteractorProvider;
    private final Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider;
    private final Provider<V7UserFavouritesInteractor> v7UserFavouritesInteractorProvider;
    private final Provider<V7UserFollowersInteractor> v7UserFollowersInteractorProvider;
    private final Provider<V7UserInfoInteractor> v7UserInfoInteractorProvider;
    private final Provider<V7UserRankingStatisticsInteractor> v7UserRankingStatisticsInteractorProvider;
    private final Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider;

    public UserDetailsController_MembersInjector(Provider<V7UserInfoInteractor> v7UserInfoInteractorProvider, Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider, Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider, Provider<V7UserFollowersInteractor> v7UserFollowersInteractorProvider, Provider<V7UserAchievementsInteractor> v7UserAchievementsInteractorProvider, Provider<V7UserFavouritesInteractor> v7UserFavouritesInteractorProvider, Provider<V7UserRankingStatisticsInteractor> v7UserRankingStatisticsInteractorProvider, Provider<BetsListInteractor> betsListInteractorProvider, Provider<UserService> userServicePProvider, Provider<GetChatsInteractor> getChatsInteractorProvider, Provider<GetPrivateMessagesInteractor> getPrivateMessagesInteractorProvider, Provider<SendPrivateMessasgesInteractor> sendPrivateMessagesInteractorProvider, Provider<NewUserAvailableChallengesInteractor> newUserAvailableChallengesInteractorProvider, Provider<NewUserPrivateChallengesInteractor> newUserPrivateChallengesInteractorProvider, Provider<NewUserChallengesHistoryInteractor> newUserChallengesHistoryInteractorProvider, Provider<NewUserBattleCountsInteractor> newUserBattleCountsInteractorProvider, Provider<UserProfileStatisticsInteractor> userProfileStatisticsInteractorProvider) {
        this.v7UserInfoInteractorProvider = v7UserInfoInteractorProvider;
        this.v7UserRanksInteractorProvider = v7UserRanksInteractorProvider;
        this.v7UserBetStatisticsInteractorProvider = v7UserBetStatisticsInteractorProvider;
        this.v7UserFollowersInteractorProvider = v7UserFollowersInteractorProvider;
        this.v7UserAchievementsInteractorProvider = v7UserAchievementsInteractorProvider;
        this.v7UserFavouritesInteractorProvider = v7UserFavouritesInteractorProvider;
        this.v7UserRankingStatisticsInteractorProvider = v7UserRankingStatisticsInteractorProvider;
        this.betsListInteractorProvider = betsListInteractorProvider;
        this.userServicePProvider = userServicePProvider;
        this.getChatsInteractorProvider = getChatsInteractorProvider;
        this.getPrivateMessagesInteractorProvider = getPrivateMessagesInteractorProvider;
        this.sendPrivateMessagesInteractorProvider = sendPrivateMessagesInteractorProvider;
        this.newUserAvailableChallengesInteractorProvider = newUserAvailableChallengesInteractorProvider;
        this.newUserPrivateChallengesInteractorProvider = newUserPrivateChallengesInteractorProvider;
        this.newUserChallengesHistoryInteractorProvider = newUserChallengesHistoryInteractorProvider;
        this.newUserBattleCountsInteractorProvider = newUserBattleCountsInteractorProvider;
        this.userProfileStatisticsInteractorProvider = userProfileStatisticsInteractorProvider;
    }

    public static MembersInjector<UserDetailsController> create(Provider<V7UserInfoInteractor> v7UserInfoInteractorProvider, Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider, Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider, Provider<V7UserFollowersInteractor> v7UserFollowersInteractorProvider, Provider<V7UserAchievementsInteractor> v7UserAchievementsInteractorProvider, Provider<V7UserFavouritesInteractor> v7UserFavouritesInteractorProvider, Provider<V7UserRankingStatisticsInteractor> v7UserRankingStatisticsInteractorProvider, Provider<BetsListInteractor> betsListInteractorProvider, Provider<UserService> userServicePProvider, Provider<GetChatsInteractor> getChatsInteractorProvider, Provider<GetPrivateMessagesInteractor> getPrivateMessagesInteractorProvider, Provider<SendPrivateMessasgesInteractor> sendPrivateMessagesInteractorProvider, Provider<NewUserAvailableChallengesInteractor> newUserAvailableChallengesInteractorProvider, Provider<NewUserPrivateChallengesInteractor> newUserPrivateChallengesInteractorProvider, Provider<NewUserChallengesHistoryInteractor> newUserChallengesHistoryInteractorProvider, Provider<NewUserBattleCountsInteractor> newUserBattleCountsInteractorProvider, Provider<UserProfileStatisticsInteractor> userProfileStatisticsInteractorProvider) {
        return new UserDetailsController_MembersInjector(v7UserInfoInteractorProvider, v7UserRanksInteractorProvider, v7UserBetStatisticsInteractorProvider, v7UserFollowersInteractorProvider, v7UserAchievementsInteractorProvider, v7UserFavouritesInteractorProvider, v7UserRankingStatisticsInteractorProvider, betsListInteractorProvider, userServicePProvider, getChatsInteractorProvider, getPrivateMessagesInteractorProvider, sendPrivateMessagesInteractorProvider, newUserAvailableChallengesInteractorProvider, newUserPrivateChallengesInteractorProvider, newUserChallengesHistoryInteractorProvider, newUserBattleCountsInteractorProvider, userProfileStatisticsInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UserDetailsController instance) {
        injectV7UserInfoInteractor(instance, this.v7UserInfoInteractorProvider.get());
        injectV7UserRanksInteractor(instance, this.v7UserRanksInteractorProvider.get());
        injectV7UserBetStatisticsInteractor(instance, this.v7UserBetStatisticsInteractorProvider.get());
        injectV7UserFollowersInteractor(instance, this.v7UserFollowersInteractorProvider.get());
        injectV7UserAchievementsInteractor(instance, this.v7UserAchievementsInteractorProvider.get());
        injectV7UserFavouritesInteractor(instance, this.v7UserFavouritesInteractorProvider.get());
        injectV7UserRankingStatisticsInteractor(instance, this.v7UserRankingStatisticsInteractorProvider.get());
        injectBetsListInteractor(instance, this.betsListInteractorProvider.get());
        injectUserServiceP(instance, this.userServicePProvider.get());
        injectGetChatsInteractor(instance, this.getChatsInteractorProvider.get());
        injectGetPrivateMessagesInteractor(instance, this.getPrivateMessagesInteractorProvider.get());
        injectSendPrivateMessagesInteractor(instance, this.sendPrivateMessagesInteractorProvider.get());
        injectNewUserAvailableChallengesInteractor(instance, this.newUserAvailableChallengesInteractorProvider.get());
        injectNewUserPrivateChallengesInteractor(instance, this.newUserPrivateChallengesInteractorProvider.get());
        injectNewUserChallengesHistoryInteractor(instance, this.newUserChallengesHistoryInteractorProvider.get());
        injectNewUserBattleCountsInteractor(instance, this.newUserBattleCountsInteractorProvider.get());
        injectUserProfileStatisticsInteractor(instance, this.userProfileStatisticsInteractorProvider.get());
    }

    public static void injectV7UserInfoInteractor(UserDetailsController instance, V7UserInfoInteractor v7UserInfoInteractor) {
        instance.v7UserInfoInteractor = v7UserInfoInteractor;
    }

    public static void injectV7UserRanksInteractor(UserDetailsController instance, V7UserRanksInteractor v7UserRanksInteractor) {
        instance.v7UserRanksInteractor = v7UserRanksInteractor;
    }

    public static void injectV7UserBetStatisticsInteractor(UserDetailsController instance, V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor) {
        instance.v7UserBetStatisticsInteractor = v7UserBetStatisticsInteractor;
    }

    public static void injectV7UserFollowersInteractor(UserDetailsController instance, V7UserFollowersInteractor v7UserFollowersInteractor) {
        instance.v7UserFollowersInteractor = v7UserFollowersInteractor;
    }

    public static void injectV7UserAchievementsInteractor(UserDetailsController instance, V7UserAchievementsInteractor v7UserAchievementsInteractor) {
        instance.v7UserAchievementsInteractor = v7UserAchievementsInteractor;
    }

    public static void injectV7UserFavouritesInteractor(UserDetailsController instance, V7UserFavouritesInteractor v7UserFavouritesInteractor) {
        instance.v7UserFavouritesInteractor = v7UserFavouritesInteractor;
    }

    public static void injectV7UserRankingStatisticsInteractor(UserDetailsController instance, V7UserRankingStatisticsInteractor v7UserRankingStatisticsInteractor) {
        instance.v7UserRankingStatisticsInteractor = v7UserRankingStatisticsInteractor;
    }

    public static void injectBetsListInteractor(UserDetailsController instance, BetsListInteractor betsListInteractor) {
        instance.betsListInteractor = betsListInteractor;
    }

    public static void injectUserServiceP(UserDetailsController instance, UserService userServiceP) {
        instance.userServiceP = userServiceP;
    }

    public static void injectGetChatsInteractor(UserDetailsController instance, GetChatsInteractor getChatsInteractor) {
        instance.getChatsInteractor = getChatsInteractor;
    }

    public static void injectGetPrivateMessagesInteractor(UserDetailsController instance, GetPrivateMessagesInteractor getPrivateMessagesInteractor) {
        instance.getPrivateMessagesInteractor = getPrivateMessagesInteractor;
    }

    public static void injectSendPrivateMessagesInteractor(UserDetailsController instance, SendPrivateMessasgesInteractor sendPrivateMessagesInteractor) {
        instance.sendPrivateMessagesInteractor = sendPrivateMessagesInteractor;
    }

    public static void injectNewUserAvailableChallengesInteractor(UserDetailsController instance, NewUserAvailableChallengesInteractor newUserAvailableChallengesInteractor) {
        instance.newUserAvailableChallengesInteractor = newUserAvailableChallengesInteractor;
    }

    public static void injectNewUserPrivateChallengesInteractor(UserDetailsController instance, NewUserPrivateChallengesInteractor newUserPrivateChallengesInteractor) {
        instance.newUserPrivateChallengesInteractor = newUserPrivateChallengesInteractor;
    }

    public static void injectNewUserChallengesHistoryInteractor(UserDetailsController instance, NewUserChallengesHistoryInteractor newUserChallengesHistoryInteractor) {
        instance.newUserChallengesHistoryInteractor = newUserChallengesHistoryInteractor;
    }

    public static void injectNewUserBattleCountsInteractor(UserDetailsController instance, NewUserBattleCountsInteractor newUserBattleCountsInteractor) {
        instance.newUserBattleCountsInteractor = newUserBattleCountsInteractor;
    }

    public static void injectUserProfileStatisticsInteractor(UserDetailsController instance, UserProfileStatisticsInteractor userProfileStatisticsInteractor) {
        instance.userProfileStatisticsInteractor = userProfileStatisticsInteractor;
    }
}
