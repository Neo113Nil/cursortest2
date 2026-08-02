package org.betup.ui.tour.compose;

import android.content.Context;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.api.rest.user.V7TourMarketingRewardsInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateTutorialCompleteInteractor;
import org.betup.services.user.UserService;
import org.betup.ui.TabMenuItem;
import org.betup.ui.tour.TourHelper;
import org.betup.ui.tour.controller.TourFavoriteSportsController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TourComposeHelper.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010A\u001a\u00020\u0016J\u0006\u0010B\u001a\u00020\u0018J\u0006\u0010C\u001a\u00020\u0018J\u000e\u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u00020 J\u000e\u0010F\u001a\u00020\u00182\u0006\u0010G\u001a\u00020 J\u000e\u0010H\u001a\u00020\u00182\u0006\u0010I\u001a\u00020 J\u000e\u0010J\u001a\u00020\u00182\u0006\u0010K\u001a\u00020 J\u0006\u0010L\u001a\u00020\u0018J\u0017\u0010M\u001a\u00020\u00182\n\b\u0002\u0010K\u001a\u0004\u0018\u00010N¢\u0006\u0002\u0010OJ\u0006\u0010P\u001a\u00020\u0018J\u0006\u0010Q\u001a\u00020\u0016J\u0006\u0010R\u001a\u00020\u0011J\u0006\u0010S\u001a\u00020\rJ\u0006\u0010T\u001a\u00020\u0013J\u0006\u0010U\u001a\u00020\u0005J\u0006\u0010V\u001a\u00020\u0016J\u0006\u0010W\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R \u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R \u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R \u0010%\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R \u0010&\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u0010(\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R \u0010)\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R \u0010*\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u0010,\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u0010.\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R \u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u00100\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u00101\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u00102\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u00103\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u00104\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u00105\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u00106\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u00107\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u00108\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u00109\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u0010:\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u0010;\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u0010<\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u0010=\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u0010>\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u0010?\u001a\u0012\u0012\u0004\u0012\u00020@\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lorg/betup/ui/tour/compose/TourComposeHelper;", "", "context", "Landroid/content/Context;", "userService", "Lorg/betup/services/user/UserService;", "updateTutorialCompleteInteractor", "Lorg/betup/model/remote/api/rest/user/V7UpdateTutorialCompleteInteractor;", "tourMarketingRewardsInteractor", "Lorg/betup/model/remote/api/rest/user/V7TourMarketingRewardsInteractor;", "tourHelper", "Lorg/betup/ui/tour/TourHelper;", "tourFavoriteSportsController", "Lorg/betup/ui/tour/controller/TourFavoriteSportsController;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Lorg/betup/services/user/UserService;Lorg/betup/model/remote/api/rest/user/V7UpdateTutorialCompleteInteractor;Lorg/betup/model/remote/api/rest/user/V7TourMarketingRewardsInteractor;Lorg/betup/ui/tour/TourHelper;Lorg/betup/ui/tour/controller/TourFavoriteSportsController;)V", "tourState", "Lorg/betup/ui/tour/compose/TourState;", "tourManager", "Lorg/betup/ui/tour/compose/TourManager;", "isOnHomePage", "Lkotlin/Function0;", "", "dimMenuTabs", "", "restoreMenuTabs", "getSportsButtonBounds", "Landroid/graphics/Rect;", "getSportItemBounds", "setSportItemBounds", "Lkotlin/Function1;", "setSportItemId", "", "clickSportsButton", "clickSportItem", "getLeagueItemBounds", "setLeagueItemBounds", "setLeagueItemId", "clickLeagueItem", "getMatchItemBounds", "setMatchItemBounds", "setMatchItemId", "clickMatchItem", "getBetSectionBounds", "setBetSectionBounds", "onBetSectionReady", "setBaseMatchItemBounds", "onOverlayVisibilityChanged", "setHomeWinRateBounds", "setHomeGlobalRankBounds", "setHomeBestStreakBounds", "setSpecialOfferBounds", "setVideoRewardBounds", "setDailyQuestsBounds", "setBattlesButtonBounds", "setCompetitionsButtonBounds", "setTopMatchesButtonBounds", "setMinigamesButtonBounds", "setRankingButtonBounds", "setTvBetButtonBounds", "setFlashBetButtonBounds", "setLiveArenaSectionBounds", "setMoreMatchesSectionBounds", "getTabBounds", "Lorg/betup/ui/TabMenuItem;", "shouldShowTour", "startTour", "onSportButtonClicked", "onSportSelected", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "onLeagueSelected", "leagueId", "onMatchSelected", "matchId", "onBetSelected", "betId", "onBettingSheetShown", "onBetPlaced", "", "(Ljava/lang/Integer;)V", "skipTour", "isTourActive", "getTourState", "getTourFavoriteSportsController", "getTourManager", "getUserService", "onBackPressed", "resetTour", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourComposeHelper {
    public static final int $stable = 8;
    public Function1<? super Long, Unit> clickLeagueItem;
    public Function1<? super Long, Unit> clickMatchItem;
    public Function1<? super Long, Unit> clickSportItem;
    public Function0<Unit> clickSportsButton;
    private final Context context;
    public Function0<Unit> dimMenuTabs;
    public Function0<Rect> getBetSectionBounds;
    public Function0<Rect> getLeagueItemBounds;
    public Function0<Rect> getMatchItemBounds;
    public Function0<Rect> getSportItemBounds;
    public Function0<Rect> getSportsButtonBounds;
    public Function1<? super TabMenuItem, Rect> getTabBounds;
    public Function0<Boolean> isOnHomePage;
    public Function0<Unit> onBetSectionReady;
    public Function1<? super Boolean, Unit> onOverlayVisibilityChanged;
    public Function0<Unit> restoreMenuTabs;
    public Function1<? super Rect, Unit> setBaseMatchItemBounds;
    public Function1<? super Rect, Unit> setBattlesButtonBounds;
    public Function1<? super Rect, Unit> setBetSectionBounds;
    public Function1<? super Rect, Unit> setCompetitionsButtonBounds;
    public Function1<? super Rect, Unit> setDailyQuestsBounds;
    public Function1<? super Rect, Unit> setFlashBetButtonBounds;
    public Function1<? super Rect, Unit> setHomeBestStreakBounds;
    public Function1<? super Rect, Unit> setHomeGlobalRankBounds;
    public Function1<? super Rect, Unit> setHomeWinRateBounds;
    public Function1<? super Rect, Unit> setLeagueItemBounds;
    public Function1<? super Long, Unit> setLeagueItemId;
    public Function1<? super Rect, Unit> setLiveArenaSectionBounds;
    public Function1<? super Rect, Unit> setMatchItemBounds;
    public Function1<? super Long, Unit> setMatchItemId;
    public Function1<? super Rect, Unit> setMinigamesButtonBounds;
    public Function1<? super Rect, Unit> setMoreMatchesSectionBounds;
    public Function1<? super Rect, Unit> setRankingButtonBounds;
    public Function1<? super Rect, Unit> setSpecialOfferBounds;
    public Function1<? super Rect, Unit> setSportItemBounds;
    public Function1<? super Long, Unit> setSportItemId;
    public Function1<? super Rect, Unit> setTopMatchesButtonBounds;
    public Function1<? super Rect, Unit> setTvBetButtonBounds;
    public Function1<? super Rect, Unit> setVideoRewardBounds;
    private final TourFavoriteSportsController tourFavoriteSportsController;
    private final TourHelper tourHelper;
    private final TourManager tourManager;
    private final V7TourMarketingRewardsInteractor tourMarketingRewardsInteractor;
    private final TourState tourState;
    private final V7UpdateTutorialCompleteInteractor updateTutorialCompleteInteractor;
    private final UserService userService;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isOnHomePage$lambda$0() {
        return false;
    }

    public TourComposeHelper(Context context, UserService userService, V7UpdateTutorialCompleteInteractor updateTutorialCompleteInteractor, V7TourMarketingRewardsInteractor tourMarketingRewardsInteractor, TourHelper tourHelper, TourFavoriteSportsController tourFavoriteSportsController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(updateTutorialCompleteInteractor, "updateTutorialCompleteInteractor");
        Intrinsics.checkNotNullParameter(tourMarketingRewardsInteractor, "tourMarketingRewardsInteractor");
        Intrinsics.checkNotNullParameter(tourFavoriteSportsController, "tourFavoriteSportsController");
        this.context = context;
        this.userService = userService;
        this.updateTutorialCompleteInteractor = updateTutorialCompleteInteractor;
        this.tourMarketingRewardsInteractor = tourMarketingRewardsInteractor;
        this.tourHelper = tourHelper;
        this.tourFavoriteSportsController = tourFavoriteSportsController;
        TourState tourState = new TourState();
        this.tourState = tourState;
        this.tourManager = new TourManager(context, tourState, userService, updateTutorialCompleteInteractor, tourMarketingRewardsInteractor, tourHelper);
        this.isOnHomePage = new Function0() { // from class: org.betup.ui.tour.compose.TourComposeHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean isOnHomePage$lambda$0;
                isOnHomePage$lambda$0 = TourComposeHelper.isOnHomePage$lambda$0();
                return Boolean.valueOf(isOnHomePage$lambda$0);
            }
        };
    }

    public final boolean shouldShowTour() {
        return this.tourManager.shouldShowTour();
    }

    public final void startTour() {
        this.tourManager.startTour();
    }

    public final void onSportButtonClicked() {
        this.tourManager.onSportButtonClicked();
    }

    public final void onSportSelected(long sportId) {
        this.tourManager.onSportSelected(sportId);
    }

    public final void onLeagueSelected(long leagueId) {
        this.tourManager.onLeagueSelected(leagueId);
    }

    public final void onMatchSelected(long matchId) {
        this.tourManager.onMatchSelected(matchId);
    }

    public final void onBetSelected(long betId) {
        this.tourManager.onBetSelected(betId);
    }

    public final void onBettingSheetShown() {
        this.tourManager.onBettingSheetShown();
    }

    public static /* synthetic */ void onBetPlaced$default(TourComposeHelper tourComposeHelper, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        tourComposeHelper.onBetPlaced(num);
    }

    public final void onBetPlaced(Integer betId) {
        this.tourManager.onBetPlaced(betId);
    }

    public final void skipTour() {
        this.tourManager.skipTour();
    }

    public final boolean isTourActive() {
        return this.tourState.isTourActive();
    }

    public final TourState getTourState() {
        return this.tourState;
    }

    public final TourFavoriteSportsController getTourFavoriteSportsController() {
        return this.tourFavoriteSportsController;
    }

    public final TourManager getTourManager() {
        return this.tourManager;
    }

    public final UserService getUserService() {
        return this.userService;
    }

    public final boolean onBackPressed() {
        if (!this.tourState.isOverlayVisible()) {
            return true;
        }
        if (this.tourState.previousStep()) {
            return false;
        }
        this.tourState.setRequestShowSkipDialog(true);
        return false;
    }

    public final void resetTour() {
        this.tourState.resetTour();
    }
}
