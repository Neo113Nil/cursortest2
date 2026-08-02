package org.betup.ui.fragment.user;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.messaging.GetPrivateMessagesInteractor;
import org.betup.model.remote.api.rest.messaging.SendPrivateMessasgesInteractor;
import org.betup.model.remote.api.rest.user.V7UserAchievementsInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserFavouritesInteractor;
import org.betup.model.remote.api.rest.user.V7UserFollowActionInteractor;
import org.betup.model.remote.api.rest.user.V7UserInfoInteractor;
import org.betup.model.remote.api.rest.user.V7UserRankingStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserRanksInteractor;
import org.betup.model.remote.api.rest.user.bets.BetsListInteractor;

/* loaded from: classes4.dex */
public final class ForeignUserDetailsController_MembersInjector implements MembersInjector<ForeignUserDetailsController> {
    private final Provider<BetsListInteractor> betsListInteractorProvider;
    private final Provider<GetPrivateMessagesInteractor> getPrivateMessagesInteractorProvider;
    private final Provider<SendPrivateMessasgesInteractor> sendPrivateMessagesInteractorProvider;
    private final Provider<V7UserAchievementsInteractor> v7UserAchievementsInteractorProvider;
    private final Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider;
    private final Provider<V7UserFavouritesInteractor> v7UserFavouritesInteractorProvider;
    private final Provider<V7UserFollowActionInteractor> v7UserFollowActionInteractorProvider;
    private final Provider<V7UserInfoInteractor> v7UserInfoInteractorProvider;
    private final Provider<V7UserRankingStatisticsInteractor> v7UserRankingStatisticsInteractorProvider;
    private final Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider;

    public ForeignUserDetailsController_MembersInjector(Provider<V7UserInfoInteractor> v7UserInfoInteractorProvider, Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider, Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider, Provider<V7UserAchievementsInteractor> v7UserAchievementsInteractorProvider, Provider<V7UserFavouritesInteractor> v7UserFavouritesInteractorProvider, Provider<V7UserRankingStatisticsInteractor> v7UserRankingStatisticsInteractorProvider, Provider<V7UserFollowActionInteractor> v7UserFollowActionInteractorProvider, Provider<GetPrivateMessagesInteractor> getPrivateMessagesInteractorProvider, Provider<SendPrivateMessasgesInteractor> sendPrivateMessagesInteractorProvider, Provider<BetsListInteractor> betsListInteractorProvider) {
        this.v7UserInfoInteractorProvider = v7UserInfoInteractorProvider;
        this.v7UserRanksInteractorProvider = v7UserRanksInteractorProvider;
        this.v7UserBetStatisticsInteractorProvider = v7UserBetStatisticsInteractorProvider;
        this.v7UserAchievementsInteractorProvider = v7UserAchievementsInteractorProvider;
        this.v7UserFavouritesInteractorProvider = v7UserFavouritesInteractorProvider;
        this.v7UserRankingStatisticsInteractorProvider = v7UserRankingStatisticsInteractorProvider;
        this.v7UserFollowActionInteractorProvider = v7UserFollowActionInteractorProvider;
        this.getPrivateMessagesInteractorProvider = getPrivateMessagesInteractorProvider;
        this.sendPrivateMessagesInteractorProvider = sendPrivateMessagesInteractorProvider;
        this.betsListInteractorProvider = betsListInteractorProvider;
    }

    public static MembersInjector<ForeignUserDetailsController> create(Provider<V7UserInfoInteractor> v7UserInfoInteractorProvider, Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider, Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider, Provider<V7UserAchievementsInteractor> v7UserAchievementsInteractorProvider, Provider<V7UserFavouritesInteractor> v7UserFavouritesInteractorProvider, Provider<V7UserRankingStatisticsInteractor> v7UserRankingStatisticsInteractorProvider, Provider<V7UserFollowActionInteractor> v7UserFollowActionInteractorProvider, Provider<GetPrivateMessagesInteractor> getPrivateMessagesInteractorProvider, Provider<SendPrivateMessasgesInteractor> sendPrivateMessagesInteractorProvider, Provider<BetsListInteractor> betsListInteractorProvider) {
        return new ForeignUserDetailsController_MembersInjector(v7UserInfoInteractorProvider, v7UserRanksInteractorProvider, v7UserBetStatisticsInteractorProvider, v7UserAchievementsInteractorProvider, v7UserFavouritesInteractorProvider, v7UserRankingStatisticsInteractorProvider, v7UserFollowActionInteractorProvider, getPrivateMessagesInteractorProvider, sendPrivateMessagesInteractorProvider, betsListInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ForeignUserDetailsController instance) {
        injectV7UserInfoInteractor(instance, this.v7UserInfoInteractorProvider.get());
        injectV7UserRanksInteractor(instance, this.v7UserRanksInteractorProvider.get());
        injectV7UserBetStatisticsInteractor(instance, this.v7UserBetStatisticsInteractorProvider.get());
        injectV7UserAchievementsInteractor(instance, this.v7UserAchievementsInteractorProvider.get());
        injectV7UserFavouritesInteractor(instance, this.v7UserFavouritesInteractorProvider.get());
        injectV7UserRankingStatisticsInteractor(instance, this.v7UserRankingStatisticsInteractorProvider.get());
        injectV7UserFollowActionInteractor(instance, this.v7UserFollowActionInteractorProvider.get());
        injectGetPrivateMessagesInteractor(instance, this.getPrivateMessagesInteractorProvider.get());
        injectSendPrivateMessagesInteractor(instance, this.sendPrivateMessagesInteractorProvider.get());
        injectBetsListInteractor(instance, this.betsListInteractorProvider.get());
    }

    public static void injectV7UserInfoInteractor(ForeignUserDetailsController instance, V7UserInfoInteractor v7UserInfoInteractor) {
        instance.v7UserInfoInteractor = v7UserInfoInteractor;
    }

    public static void injectV7UserRanksInteractor(ForeignUserDetailsController instance, V7UserRanksInteractor v7UserRanksInteractor) {
        instance.v7UserRanksInteractor = v7UserRanksInteractor;
    }

    public static void injectV7UserBetStatisticsInteractor(ForeignUserDetailsController instance, V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor) {
        instance.v7UserBetStatisticsInteractor = v7UserBetStatisticsInteractor;
    }

    public static void injectV7UserAchievementsInteractor(ForeignUserDetailsController instance, V7UserAchievementsInteractor v7UserAchievementsInteractor) {
        instance.v7UserAchievementsInteractor = v7UserAchievementsInteractor;
    }

    public static void injectV7UserFavouritesInteractor(ForeignUserDetailsController instance, V7UserFavouritesInteractor v7UserFavouritesInteractor) {
        instance.v7UserFavouritesInteractor = v7UserFavouritesInteractor;
    }

    public static void injectV7UserRankingStatisticsInteractor(ForeignUserDetailsController instance, V7UserRankingStatisticsInteractor v7UserRankingStatisticsInteractor) {
        instance.v7UserRankingStatisticsInteractor = v7UserRankingStatisticsInteractor;
    }

    public static void injectV7UserFollowActionInteractor(ForeignUserDetailsController instance, V7UserFollowActionInteractor v7UserFollowActionInteractor) {
        instance.v7UserFollowActionInteractor = v7UserFollowActionInteractor;
    }

    public static void injectGetPrivateMessagesInteractor(ForeignUserDetailsController instance, GetPrivateMessagesInteractor getPrivateMessagesInteractor) {
        instance.getPrivateMessagesInteractor = getPrivateMessagesInteractor;
    }

    public static void injectSendPrivateMessagesInteractor(ForeignUserDetailsController instance, SendPrivateMessasgesInteractor sendPrivateMessagesInteractor) {
        instance.sendPrivateMessagesInteractor = sendPrivateMessagesInteractor;
    }

    public static void injectBetsListInteractor(ForeignUserDetailsController instance, BetsListInteractor betsListInteractor) {
        instance.betsListInteractor = betsListInteractor;
    }
}
