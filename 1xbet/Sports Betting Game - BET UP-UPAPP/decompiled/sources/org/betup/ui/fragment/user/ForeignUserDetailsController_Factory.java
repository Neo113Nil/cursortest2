package org.betup.ui.fragment.user;

import dagger.internal.Factory;
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
public final class ForeignUserDetailsController_Factory implements Factory<ForeignUserDetailsController> {
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

    public ForeignUserDetailsController_Factory(Provider<V7UserInfoInteractor> v7UserInfoInteractorProvider, Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider, Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider, Provider<V7UserAchievementsInteractor> v7UserAchievementsInteractorProvider, Provider<V7UserFavouritesInteractor> v7UserFavouritesInteractorProvider, Provider<V7UserRankingStatisticsInteractor> v7UserRankingStatisticsInteractorProvider, Provider<V7UserFollowActionInteractor> v7UserFollowActionInteractorProvider, Provider<GetPrivateMessagesInteractor> getPrivateMessagesInteractorProvider, Provider<SendPrivateMessasgesInteractor> sendPrivateMessagesInteractorProvider, Provider<BetsListInteractor> betsListInteractorProvider) {
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

    @Override // javax.inject.Provider
    public ForeignUserDetailsController get() {
        ForeignUserDetailsController foreignUserDetailsController = new ForeignUserDetailsController();
        ForeignUserDetailsController_MembersInjector.injectV7UserInfoInteractor(foreignUserDetailsController, this.v7UserInfoInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectV7UserRanksInteractor(foreignUserDetailsController, this.v7UserRanksInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectV7UserBetStatisticsInteractor(foreignUserDetailsController, this.v7UserBetStatisticsInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectV7UserAchievementsInteractor(foreignUserDetailsController, this.v7UserAchievementsInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectV7UserFavouritesInteractor(foreignUserDetailsController, this.v7UserFavouritesInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectV7UserRankingStatisticsInteractor(foreignUserDetailsController, this.v7UserRankingStatisticsInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectV7UserFollowActionInteractor(foreignUserDetailsController, this.v7UserFollowActionInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectGetPrivateMessagesInteractor(foreignUserDetailsController, this.getPrivateMessagesInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectSendPrivateMessagesInteractor(foreignUserDetailsController, this.sendPrivateMessagesInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectBetsListInteractor(foreignUserDetailsController, this.betsListInteractorProvider.get());
        return foreignUserDetailsController;
    }

    public static ForeignUserDetailsController_Factory create(Provider<V7UserInfoInteractor> v7UserInfoInteractorProvider, Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider, Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider, Provider<V7UserAchievementsInteractor> v7UserAchievementsInteractorProvider, Provider<V7UserFavouritesInteractor> v7UserFavouritesInteractorProvider, Provider<V7UserRankingStatisticsInteractor> v7UserRankingStatisticsInteractorProvider, Provider<V7UserFollowActionInteractor> v7UserFollowActionInteractorProvider, Provider<GetPrivateMessagesInteractor> getPrivateMessagesInteractorProvider, Provider<SendPrivateMessasgesInteractor> sendPrivateMessagesInteractorProvider, Provider<BetsListInteractor> betsListInteractorProvider) {
        return new ForeignUserDetailsController_Factory(v7UserInfoInteractorProvider, v7UserRanksInteractorProvider, v7UserBetStatisticsInteractorProvider, v7UserAchievementsInteractorProvider, v7UserFavouritesInteractorProvider, v7UserRankingStatisticsInteractorProvider, v7UserFollowActionInteractorProvider, getPrivateMessagesInteractorProvider, sendPrivateMessagesInteractorProvider, betsListInteractorProvider);
    }

    public static ForeignUserDetailsController newForeignUserDetailsController() {
        return new ForeignUserDetailsController();
    }
}
