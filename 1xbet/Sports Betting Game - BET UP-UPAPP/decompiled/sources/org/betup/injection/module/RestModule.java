package org.betup.injection.module;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import org.betup.model.remote.api.rest.betslip.V7CreateBetlistInteractor;
import org.betup.model.remote.api.rest.betslip.V7GrabbedBetsInteractor;
import org.betup.model.remote.api.rest.bonus.V7DailyBonusInteractor;
import org.betup.model.remote.api.rest.casino.V7CasinoAuthInteractor;
import org.betup.model.remote.api.rest.competitions.NewActiveCompetitionsInteractor;
import org.betup.model.remote.api.rest.competitions.NewCompetitionsHistoryInteractor;
import org.betup.model.remote.api.rest.competitions.PlaceBetInteractor;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetCategoriesInteractor;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetSessionInteractor;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetSportsInteractor;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetStatsInteractor;
import org.betup.model.remote.api.rest.flashbet.GetPendingFlashBetSessionInteractor;
import org.betup.model.remote.api.rest.flashbet.LeaveFlashBetSessionInteractor;
import org.betup.model.remote.api.rest.flashbet.StartFlashBetGameInteractor;
import org.betup.model.remote.api.rest.flashbet.SubmitFlashBetAnswerInteractor;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteTeamsInteractor;
import org.betup.model.remote.api.rest.matches.GetFavoriteTeamIdsInteractor;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.api.rest.matches.MatchInfoInteractor;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteTeamsBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteTeamsInteractor;
import org.betup.model.remote.api.rest.matches.V7MatchHistoryInteractor;
import org.betup.model.remote.api.rest.matches.V7MatchStatisticsInteractor;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;
import org.betup.model.remote.api.rest.server.V7GetServerInfoInteractor;
import org.betup.model.remote.api.rest.shop.CancelBetInteractor;
import org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractor;
import org.betup.model.remote.api.rest.shop.GetCancelBetInfoInteractor;
import org.betup.model.remote.api.rest.shop.GetSellBetInfoInteractor;
import org.betup.model.remote.api.rest.shop.NewShopItemsInteractor;
import org.betup.model.remote.api.rest.shop.SellBetInteractor;
import org.betup.model.remote.api.rest.shop.ShopEntitlementClaimInteractor;
import org.betup.model.remote.api.rest.shop.ShopLayoutInteractor;
import org.betup.model.remote.api.rest.shop.V7MakeSubscriptionPurchaseInteractor;
import org.betup.model.remote.api.rest.subscription.DeleteAllV7SubscriptionsInteractor;
import org.betup.model.remote.api.rest.subscription.DeleteV7AllMatchSubscriptionsInteractor;
import org.betup.model.remote.api.rest.subscription.DeleteV7MatchSubscriptionInteractor;
import org.betup.model.remote.api.rest.subscription.GetAllV7SubscriptionsInteractor;
import org.betup.model.remote.api.rest.user.UpdateV7PushPreferencesInteractor;
import org.betup.model.remote.api.rest.user.UpgradeLoginInteractor;
import org.betup.model.remote.api.rest.user.V7GetCustomTokenInteractor;
import org.betup.model.remote.api.rest.user.V7OneClickBetSettingsInteractor;
import org.betup.model.remote.api.rest.user.V7ReferralInteractor;
import org.betup.model.remote.api.rest.user.V7TourMarketingRewardsInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateAppVersionInteractor;
import org.betup.model.remote.api.rest.user.V7UpdatePushTokenAndLangInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateTimezoneInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateTutorialCompleteInteractor;
import org.betup.model.remote.api.rest.user.V7VarietyBetRestrictionsInteractor;
import org.betup.model.remote.api.rest.user.V7VarietyVersionGatesInteractor;
import org.betup.model.remote.api.rest.user.balance.V7BalanceHistoryInteractor;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.tour.controller.TourFavoriteSportsController;

@Module
/* loaded from: classes2.dex */
public class RestModule {
    @Provides
    @Singleton
    MatchShortInfoInteractor provideMatchShortInfoInteractor(Context context) {
        return new MatchShortInfoInteractor(context);
    }

    @Provides
    @Singleton
    MatchVarietiesInteractor provideMatchVarietiesInteractor(Context context) {
        return new MatchVarietiesInteractor(context);
    }

    @Provides
    @Singleton
    MatchInfoInteractor provideMatchInfoInteractor(Context context) {
        return new MatchInfoInteractor(context);
    }

    @Provides
    @Singleton
    NewSportsInteractor provideNewSportsInteractor(Context context) {
        return new NewSportsInteractor(context);
    }

    @Provides
    @Singleton
    PutFavoriteSportsInteractor providePutFavoriteSportsInteractor(Context context) {
        return new PutFavoriteSportsInteractor(context);
    }

    @Provides
    @Singleton
    DeleteFavoriteSportsInteractor provideDeleteFavoriteSportsInteractor(Context context) {
        return new DeleteFavoriteSportsInteractor(context);
    }

    @Provides
    @Singleton
    PutFavoriteLeaguesInteractor providePutFavoriteLeaguesInteractor(Context context) {
        return new PutFavoriteLeaguesInteractor(context);
    }

    @Provides
    @Singleton
    DeleteFavoriteLeaguesInteractor provideDeleteFavoriteLeaguesInteractor(Context context) {
        return new DeleteFavoriteLeaguesInteractor(context);
    }

    @Provides
    @Singleton
    GetFavoriteTeamIdsInteractor provideGetFavoriteTeamIdsInteractor(Context context) {
        return new GetFavoriteTeamIdsInteractor(context);
    }

    @Provides
    @Singleton
    GetRandomTeamImagesInteractor provideGetRandomTeamImagesInteractor(Context context) {
        return new GetRandomTeamImagesInteractor(context);
    }

    @Provides
    @Singleton
    PutFavoriteTeamsInteractor providePutFavoriteTeamsInteractor(Context context) {
        return new PutFavoriteTeamsInteractor(context);
    }

    @Provides
    @Singleton
    DeleteFavoriteTeamsInteractor provideDeleteFavoriteTeamsInteractor(Context context) {
        return new DeleteFavoriteTeamsInteractor(context);
    }

    @Provides
    @Singleton
    PutFavoriteTeamsBulkInteractor providePutFavoriteTeamsBulkInteractor(Context context) {
        return new PutFavoriteTeamsBulkInteractor(context);
    }

    @Provides
    @Singleton
    PutFavoriteLeaguesBulkInteractor providePutFavoriteLeaguesBulkInteractor(Context context) {
        return new PutFavoriteLeaguesBulkInteractor(context);
    }

    @Provides
    @Singleton
    PutFavoriteSportsBulkInteractor providePutFavoriteSportsBulkInteractor(Context context) {
        return new PutFavoriteSportsBulkInteractor(context);
    }

    @Provides
    @Singleton
    TourFavoriteSportsController provideTourFavoriteSportsController(NewSportsInteractor newSportsInteractor, PutFavoriteSportsInteractor putFavoriteSportsInteractor, DeleteFavoriteSportsInteractor deleteFavoriteSportsInteractor, MatchFilterState matchFilterState) {
        return new TourFavoriteSportsController(newSportsInteractor, putFavoriteSportsInteractor, deleteFavoriteSportsInteractor, matchFilterState);
    }

    @Provides
    @Singleton
    V7MatchStatisticsInteractor provideV7MatchStatisticsInteractor(Context context) {
        return new V7MatchStatisticsInteractor(context);
    }

    @Provides
    @Singleton
    V7MatchHistoryInteractor provideV7MatchHistoryInteractor(Context context) {
        return new V7MatchHistoryInteractor(context);
    }

    @Provides
    @Singleton
    NewShopItemsInteractor provideNewShopItemsInteractor(Context context) {
        return new NewShopItemsInteractor(context);
    }

    @Provides
    @Singleton
    ShopLayoutInteractor provideShopLayoutInteractor(Context context) {
        return new ShopLayoutInteractor(context);
    }

    @Provides
    @Singleton
    ShopEntitlementClaimInteractor provideShopEntitlementClaimInteractor(Context context) {
        return new ShopEntitlementClaimInteractor(context);
    }

    @Provides
    @Singleton
    NewActiveCompetitionsInteractor provideNewActiveCompetitionsInteractor(Context context) {
        return new NewActiveCompetitionsInteractor(context);
    }

    @Provides
    @Singleton
    NewCompetitionsHistoryInteractor provideNewCompetitionsHistoryInteractor(Context context) {
        return new NewCompetitionsHistoryInteractor(context);
    }

    @Provides
    @Singleton
    PlaceBetInteractor providePlaceBetInteractor(Context context) {
        return new PlaceBetInteractor(context);
    }

    @Provides
    @Singleton
    V7GrabbedBetsInteractor provideV7GrabbedBetsInteractor(Context context) {
        return new V7GrabbedBetsInteractor(context);
    }

    @Provides
    @Singleton
    V7CreateBetlistInteractor provideV7CreateBetlistInteractor(Context context) {
        return new V7CreateBetlistInteractor(context);
    }

    @Provides
    @Singleton
    V7DailyBonusInteractor provideV7DailyBonusInteractor(Context context) {
        return new V7DailyBonusInteractor(context);
    }

    @Provides
    @Singleton
    GetAllV7SubscriptionsInteractor provideGetAllV7SubscriptionsInteractor(Context context) {
        return new GetAllV7SubscriptionsInteractor(context);
    }

    @Provides
    @Singleton
    DeleteAllV7SubscriptionsInteractor provideDeleteAllV7SubscriptionsInteractor(Context context) {
        return new DeleteAllV7SubscriptionsInteractor(context);
    }

    @Provides
    @Singleton
    DeleteV7MatchSubscriptionInteractor provideDeleteV7MatchSubscriptionInteractor(Context context) {
        return new DeleteV7MatchSubscriptionInteractor(context);
    }

    @Provides
    @Singleton
    DeleteV7AllMatchSubscriptionsInteractor provideDeleteV7AllMatchSubscriptionsInteractor(Context context) {
        return new DeleteV7AllMatchSubscriptionsInteractor(context);
    }

    @Provides
    @Singleton
    V7ReferralInteractor provideV7ReferralInteractor(Context context) {
        return new V7ReferralInteractor(context);
    }

    @Provides
    @Singleton
    V7BalanceHistoryInteractor provideV7BalanceHistoryInteractor(Context context) {
        return new V7BalanceHistoryInteractor(context);
    }

    @Provides
    @Singleton
    UpdateV7PushPreferencesInteractor provideUpdateV7PushPreferencesInteractor(Context context) {
        return new UpdateV7PushPreferencesInteractor(context);
    }

    @Provides
    @Singleton
    V7GetCustomTokenInteractor provideV7GetCustomTokenInteractor(Context context) {
        return new V7GetCustomTokenInteractor(context);
    }

    @Provides
    @Singleton
    UpgradeLoginInteractor provideUpgradeLoginInteractor(Context context) {
        return new UpgradeLoginInteractor(context);
    }

    @Provides
    @Singleton
    V7MakeSubscriptionPurchaseInteractor provideV7MakeSubscriptionPurchaseInteractor(Context context) {
        return new V7MakeSubscriptionPurchaseInteractor(context);
    }

    @Provides
    @Singleton
    V7GetServerInfoInteractor provideV7GetServerInfoInteractor(Context context) {
        return new V7GetServerInfoInteractor(context);
    }

    @Provides
    @Singleton
    V7UpdatePushTokenAndLangInteractor provideV7UpdatePushTokenAndLangInteractor(Context context) {
        return new V7UpdatePushTokenAndLangInteractor(context);
    }

    @Provides
    @Singleton
    V7UpdateTimezoneInteractor provideV7UpdateTimezoneInteractor(Context context) {
        return new V7UpdateTimezoneInteractor(context);
    }

    @Provides
    @Singleton
    V7UpdateAppVersionInteractor provideV7UpdateAppVersionInteractor(Context context) {
        return new V7UpdateAppVersionInteractor(context);
    }

    @Provides
    @Singleton
    V7UpdateTutorialCompleteInteractor provideV7UpdateTutorialCompleteInteractor(Context context) {
        return new V7UpdateTutorialCompleteInteractor(context);
    }

    @Provides
    @Singleton
    V7TourMarketingRewardsInteractor provideV7TourMarketingRewardsInteractor(Context context) {
        return new V7TourMarketingRewardsInteractor(context);
    }

    @Provides
    @Singleton
    V7OneClickBetSettingsInteractor provideV7OneClickBetSettingsInteractor(Context context) {
        return new V7OneClickBetSettingsInteractor(context);
    }

    @Provides
    @Singleton
    V7VarietyBetRestrictionsInteractor provideV7VarietyBetRestrictionsInteractor(Context context) {
        return new V7VarietyBetRestrictionsInteractor(context);
    }

    @Provides
    @Singleton
    V7VarietyVersionGatesInteractor provideV7VarietyVersionGatesInteractor(Context context) {
        return new V7VarietyVersionGatesInteractor(context);
    }

    @Provides
    @Singleton
    V7CasinoAuthInteractor provideV7CasinoAuthInteractor(Context context) {
        return new V7CasinoAuthInteractor(context);
    }

    @Provides
    @Singleton
    GetCancelBetInfoInteractor provideGetCancelBetInfoInteractor(Context context) {
        return new GetCancelBetInfoInteractor(context);
    }

    @Provides
    @Singleton
    GetSellBetInfoInteractor provideGetSellBetInfoInteractor(Context context) {
        return new GetSellBetInfoInteractor(context);
    }

    @Provides
    @Singleton
    GetBetShareInstallLinkInteractor provideGetBetShareInstallLinkInteractor(Context context) {
        return new GetBetShareInstallLinkInteractor(context);
    }

    @Provides
    @Singleton
    CancelBetInteractor provideCancelBetInteractor(Context context) {
        return new CancelBetInteractor(context);
    }

    @Provides
    @Singleton
    SellBetInteractor provideSellBetInteractor(Context context) {
        return new SellBetInteractor(context);
    }

    @Provides
    @Singleton
    GetFlashBetSportsInteractor provideGetFlashBetSportsInteractor(Context context) {
        return new GetFlashBetSportsInteractor(context);
    }

    @Provides
    @Singleton
    GetFlashBetStatsInteractor provideGetFlashBetStatsInteractor(Context context) {
        return new GetFlashBetStatsInteractor(context);
    }

    @Provides
    @Singleton
    GetFlashBetCategoriesInteractor provideGetFlashBetCategoriesInteractor(Context context) {
        return new GetFlashBetCategoriesInteractor(context);
    }

    @Provides
    @Singleton
    StartFlashBetGameInteractor provideStartFlashBetGameInteractor(Context context) {
        return new StartFlashBetGameInteractor(context);
    }

    @Provides
    @Singleton
    GetFlashBetSessionInteractor provideGetFlashBetSessionInteractor(Context context) {
        return new GetFlashBetSessionInteractor(context);
    }

    @Provides
    @Singleton
    GetPendingFlashBetSessionInteractor provideGetPendingFlashBetSessionInteractor(Context context) {
        return new GetPendingFlashBetSessionInteractor(context);
    }

    @Provides
    @Singleton
    SubmitFlashBetAnswerInteractor provideSubmitFlashBetAnswerInteractor(Context context) {
        return new SubmitFlashBetAnswerInteractor(context);
    }

    @Provides
    @Singleton
    LeaveFlashBetSessionInteractor provideLeaveFlashBetSessionInteractor(Context context) {
        return new LeaveFlashBetSessionInteractor(context);
    }
}
