package org.betup.ui.tour.compose;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.bus.NavigateMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.api.rest.user.V7TourMarketingRewardsInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateTutorialCompleteInteractor;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.model.remote.entity.user.TourMarketingRewardsModel;
import org.betup.model.remote.entity.user.TutorialCompleteResponseModel;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.user.UserService;
import org.betup.ui.TabMenuItem;
import org.betup.ui.tour.TourHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TourManager.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000200H\u0002J\b\u00102\u001a\u000200H\u0002J\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u000200J\b\u00106\u001a\u000200H\u0002J\b\u00107\u001a\u000200H\u0002J\u0006\u00108\u001a\u000200J\u0006\u00109\u001a\u000200J\u000e\u0010:\u001a\u0002002\u0006\u0010;\u001a\u00020-J\u000e\u0010<\u001a\u0002002\u0006\u0010=\u001a\u00020-J\u000e\u0010>\u001a\u0002002\u0006\u0010?\u001a\u00020-J\u000e\u0010@\u001a\u0002002\u0006\u0010A\u001a\u00020-J\u0006\u0010B\u001a\u000200J\u0017\u0010C\u001a\u0002002\n\b\u0002\u0010A\u001a\u0004\u0018\u00010D¢\u0006\u0002\u0010EJ\b\u0010F\u001a\u000200H\u0002J\u0006\u0010G\u001a\u000200R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R$\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R$\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R*\u0010%\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lorg/betup/ui/tour/compose/TourManager;", "", "context", "Landroid/content/Context;", "tourState", "Lorg/betup/ui/tour/compose/TourState;", "userService", "Lorg/betup/services/user/UserService;", "updateTutorialCompleteInteractor", "Lorg/betup/model/remote/api/rest/user/V7UpdateTutorialCompleteInteractor;", "tourMarketingRewardsInteractor", "Lorg/betup/model/remote/api/rest/user/V7TourMarketingRewardsInteractor;", "tourHelper", "Lorg/betup/ui/tour/TourHelper;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Lorg/betup/ui/tour/compose/TourState;Lorg/betup/services/user/UserService;Lorg/betup/model/remote/api/rest/user/V7UpdateTutorialCompleteInteractor;Lorg/betup/model/remote/api/rest/user/V7TourMarketingRewardsInteractor;Lorg/betup/ui/tour/TourHelper;)V", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getSportsButtonBounds", "Lkotlin/Function0;", "Landroid/graphics/Rect;", "getGetSportsButtonBounds", "()Lkotlin/jvm/functions/Function0;", "setGetSportsButtonBounds", "(Lkotlin/jvm/functions/Function0;)V", "getSportItemBounds", "getGetSportItemBounds", "setGetSportItemBounds", "getLeagueItemBounds", "getGetLeagueItemBounds", "setGetLeagueItemBounds", "getMatchItemBounds", "getGetMatchItemBounds", "setGetMatchItemBounds", "getBetSectionBounds", "getGetBetSectionBounds", "setGetBetSectionBounds", "getTabBounds", "Lkotlin/Function1;", "Lorg/betup/ui/TabMenuItem;", "getGetTabBounds", "()Lkotlin/jvm/functions/Function1;", "setGetTabBounds", "(Lkotlin/jvm/functions/Function1;)V", "tutorialStartTime", "", "stepStartTime", "fetchTourMarketingRewards", "", "loadTourConfigurationAsync", "loadTourConfigurationFromRemoteConfig", "shouldShowTour", "", "startTour", "startTourInternal", "advanceStepWithAnalytics", "onStepComplete", "onSportButtonClicked", "onSportSelected", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "onLeagueSelected", "leagueId", "onMatchSelected", "matchId", "onBetSelected", "betId", "onBettingSheetShown", "onBetPlaced", "", "(Ljava/lang/Integer;)V", "completeTour", "skipTour", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourManager {
    public static final int $stable = 8;
    private final Context context;
    private Function0<Rect> getBetSectionBounds;
    private Function0<Rect> getLeagueItemBounds;
    private Function0<Rect> getMatchItemBounds;
    private Function0<Rect> getSportItemBounds;
    private Function0<Rect> getSportsButtonBounds;
    private Function1<? super TabMenuItem, Rect> getTabBounds;
    private final FirebaseRemoteConfig remoteConfig;
    private long stepStartTime;
    private final TourHelper tourHelper;
    private final V7TourMarketingRewardsInteractor tourMarketingRewardsInteractor;
    private final TourState tourState;
    private long tutorialStartTime;
    private final V7UpdateTutorialCompleteInteractor updateTutorialCompleteInteractor;
    private final UserService userService;

    /* compiled from: TourManager.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TourStep.values().length];
            try {
                iArr[TourStep.WELCOME_INTRO_V2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TourStep.CHOOSE_FAVORITE_SPORTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TourStep.CHOOSE_ODDS_FORMAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TourStep.DEMO_MATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TourStep.DEMO_BET_CONFIRM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TourStep.DEMO_MATCH_SIMULATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TourStep.DEMO_MATCH_WON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_SPORTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_MY_BETS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_SHOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_MENU.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TourStep.WELCOME_1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TourStep.WELCOME_2.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TourStep.CLICK_SPORT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TourStep.SELECT_SPORT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TourStep.SELECT_LEAGUE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TourStep.SELECT_MATCH.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TourStep.SELECT_BET.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[TourStep.PLACE_BET.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[TourStep.BET_PLACED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[TourStep.COMPLETED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TourManager(Context context, TourState tourState, UserService userService, V7UpdateTutorialCompleteInteractor updateTutorialCompleteInteractor, V7TourMarketingRewardsInteractor tourMarketingRewardsInteractor, TourHelper tourHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tourState, "tourState");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(updateTutorialCompleteInteractor, "updateTutorialCompleteInteractor");
        Intrinsics.checkNotNullParameter(tourMarketingRewardsInteractor, "tourMarketingRewardsInteractor");
        this.context = context;
        this.tourState = tourState;
        this.userService = userService;
        this.updateTutorialCompleteInteractor = updateTutorialCompleteInteractor;
        this.tourMarketingRewardsInteractor = tourMarketingRewardsInteractor;
        this.tourHelper = tourHelper;
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance(...)");
        this.remoteConfig = firebaseRemoteConfig;
        loadTourConfigurationAsync();
        fetchTourMarketingRewards();
    }

    public final Function0<Rect> getGetSportsButtonBounds() {
        return this.getSportsButtonBounds;
    }

    public final void setGetSportsButtonBounds(Function0<Rect> function0) {
        this.getSportsButtonBounds = function0;
    }

    public final Function0<Rect> getGetSportItemBounds() {
        return this.getSportItemBounds;
    }

    public final void setGetSportItemBounds(Function0<Rect> function0) {
        this.getSportItemBounds = function0;
    }

    public final Function0<Rect> getGetLeagueItemBounds() {
        return this.getLeagueItemBounds;
    }

    public final void setGetLeagueItemBounds(Function0<Rect> function0) {
        this.getLeagueItemBounds = function0;
    }

    public final Function0<Rect> getGetMatchItemBounds() {
        return this.getMatchItemBounds;
    }

    public final void setGetMatchItemBounds(Function0<Rect> function0) {
        this.getMatchItemBounds = function0;
    }

    public final Function0<Rect> getGetBetSectionBounds() {
        return this.getBetSectionBounds;
    }

    public final void setGetBetSectionBounds(Function0<Rect> function0) {
        this.getBetSectionBounds = function0;
    }

    public final Function1<TabMenuItem, Rect> getGetTabBounds() {
        return this.getTabBounds;
    }

    public final void setGetTabBounds(Function1<? super TabMenuItem, Rect> function1) {
        this.getTabBounds = function1;
    }

    private final void fetchTourMarketingRewards() {
        this.tourMarketingRewardsInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<TourMarketingRewardsModel, Void>() { // from class: org.betup.ui.tour.compose.TourManager$fetchTourMarketingRewards$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<TourMarketingRewardsModel, Void> responseMessage) {
                TourState tourState;
                TourState tourState2;
                TourState tourState3;
                TourState tourState4;
                TourState tourState5;
                TourState tourState6;
                TourState tourState7;
                TourState tourState8;
                TourState tourState9;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                if (responseMessage.getStat() != FetchStat.SUCCESS || responseMessage.getModel() == null) {
                    return;
                }
                TourMarketingRewardsModel model = responseMessage.getModel();
                Intrinsics.checkNotNull(model);
                TourMarketingRewardsModel tourMarketingRewardsModel = model;
                tourState = TourManager.this.tourState;
                tourState.setTourSkipRewardBetcoins(RangesKt.coerceAtLeast(tourMarketingRewardsModel.getSkipBetcoins(), 0L));
                tourState2 = TourManager.this.tourState;
                tourState2.setTourCompleteBonusBetcoins(RangesKt.coerceAtLeast(tourMarketingRewardsModel.getCompleteBonusBetcoins(), 0L));
                long demoStakeBetcoins = tourMarketingRewardsModel.getDemoStakeBetcoins();
                tourState3 = TourManager.this.tourState;
                if (demoStakeBetcoins <= 0) {
                    demoStakeBetcoins = 1000;
                }
                tourState3.setTourDemoStakeBetcoins(demoStakeBetcoins);
                tourState4 = TourManager.this.tourState;
                Double valueOf = Double.valueOf(tourMarketingRewardsModel.getCoefficientWin1());
                if (valueOf.doubleValue() <= 0.0d) {
                    valueOf = null;
                }
                tourState4.setTourCoefficientWin1(valueOf != null ? valueOf.doubleValue() : 2.2d);
                tourState5 = TourManager.this.tourState;
                Double valueOf2 = Double.valueOf(tourMarketingRewardsModel.getCoefficientDraw());
                if (valueOf2.doubleValue() <= 0.0d) {
                    valueOf2 = null;
                }
                tourState5.setTourCoefficientDraw(valueOf2 != null ? valueOf2.doubleValue() : 3.5d);
                tourState6 = TourManager.this.tourState;
                Double valueOf3 = Double.valueOf(tourMarketingRewardsModel.getCoefficientWin2());
                Double d = valueOf3.doubleValue() > 0.0d ? valueOf3 : null;
                tourState6.setTourCoefficientWin2(d != null ? d.doubleValue() : 2.5d);
                tourState7 = TourManager.this.tourState;
                long tourSkipRewardBetcoins = tourState7.getTourSkipRewardBetcoins();
                tourState8 = TourManager.this.tourState;
                long tourCompleteBonusBetcoins = tourState8.getTourCompleteBonusBetcoins();
                tourState9 = TourManager.this.tourState;
                Log.d("TourFlow", "Tour rewards loaded: skip=" + tourSkipRewardBetcoins + ", completeBonus=" + tourCompleteBonusBetcoins + ", demoStake=" + tourState9.getTourDemoStakeBetcoins());
            }
        }, null);
    }

    private final void loadTourConfigurationAsync() {
        try {
            Intrinsics.checkNotNull(this.remoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.tour.compose.TourManager$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    TourManager.loadTourConfigurationAsync$lambda$0(TourManager.this, task);
                }
            }));
        } catch (Exception e) {
            Log.e("TourFlow", "TourManager - Error in loadTourConfigurationAsync", e);
            loadTourConfigurationFromRemoteConfig();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadTourConfigurationAsync$lambda$0(TourManager tourManager, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Log.d("TourFlow", "TourManager - Remote Config fetchAndActivate completed: activated=" + ((Boolean) task.getResult()));
            tourManager.loadTourConfigurationFromRemoteConfig();
        } else {
            Log.e("TourFlow", "TourManager - Failed to fetchAndActivate Remote Config", task.getException());
            tourManager.loadTourConfigurationFromRemoteConfig();
        }
    }

    private final void loadTourConfigurationFromRemoteConfig() {
        try {
            long j = this.remoteConfig.getLong("tourSportId");
            long j2 = this.remoteConfig.getLong("tourLeagueId");
            long j3 = this.remoteConfig.getLong("tourMatchId");
            Log.d("TourFlow", "TourManager - Firebase Remote Config - Raw tourSportId: " + j + ", Raw tourLeagueId: " + j2 + ", Raw tourMatchId: " + j3);
            TourState tourState = this.tourState;
            Long valueOf = Long.valueOf(j);
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            tourState.setTourSportId(valueOf);
            TourState tourState2 = this.tourState;
            Long valueOf2 = Long.valueOf(j2);
            if (valueOf2.longValue() <= 0) {
                valueOf2 = null;
            }
            tourState2.setTourLeagueId(valueOf2);
            TourState tourState3 = this.tourState;
            Long valueOf3 = Long.valueOf(j3);
            tourState3.setTourMatchId(valueOf3.longValue() > 0 ? valueOf3 : null);
            this.tourState.setTourVariant(TourConfig.TOUR_VARIANT);
            Log.d("TourFlow", "TourManager - Tour config loaded - SportId: " + this.tourState.getTourSportId() + ", LeagueId: " + this.tourState.getTourLeagueId() + ", MatchId: " + this.tourState.getTourMatchId() + ", tourVariant: " + this.tourState.getTourVariant());
            if (this.tourState.getTourSportId() == null) {
                Log.w("TourManager", "WARNING: tourSportId is null or <= 0. Tour may not work correctly.");
            }
            if (this.tourState.getTourLeagueId() == null) {
                Log.w("TourManager", "WARNING: tourLeagueId is null or <= 0. Tour may not work correctly.");
            }
            if (this.tourState.getTourMatchId() == null) {
                Log.w("TourManager", "WARNING: tourMatchId is null or <= 0. Tour may not work correctly.");
            }
        } catch (Exception e) {
            Log.e("TourManager", "Error loading tour configuration", e);
        }
    }

    public final boolean shouldShowTour() {
        BaseUserModel userModel;
        ShortUserProfileModel shortProfile = this.userService.getShortProfile();
        boolean isTutorialComplete = (shortProfile == null || (userModel = shortProfile.getUserModel()) == null) ? false : userModel.isTutorialComplete();
        boolean z = !isTutorialComplete;
        Log.d("TourFlow", "TourManager - shouldShowTour: tourEnabled=true, isTutorialComplete=" + isTutorialComplete + ", shouldShow=" + z);
        return z;
    }

    public final void startTour() {
        Log.d("TourFlow", "TourManager - startTour() called");
        if (this.tourState.getTourSportId() == null || this.tourState.getTourLeagueId() == null || this.tourState.getTourMatchId() == null) {
            Log.d("TourFlow", "TourManager - Tour config not loaded yet, fetching and activating Remote Config...");
            Intrinsics.checkNotNull(this.remoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener() { // from class: org.betup.ui.tour.compose.TourManager$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    TourManager.startTour$lambda$4(TourManager.this, task);
                }
            }));
        } else {
            startTourInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTour$lambda$4(TourManager tourManager, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Log.d("TourFlow", "TourManager - Remote Config activated in startTour: activated=" + ((Boolean) task.getResult()));
            tourManager.loadTourConfigurationFromRemoteConfig();
            tourManager.startTourInternal();
            return;
        }
        Log.e("TourFlow", "TourManager - Failed to activate Remote Config in startTour", task.getException());
        tourManager.loadTourConfigurationFromRemoteConfig();
        tourManager.startTourInternal();
    }

    private final void startTourInternal() {
        int indexOf;
        boolean shouldShowTour = shouldShowTour();
        Log.d("TourFlow", "TourManager - shouldShowTour() = " + shouldShowTour);
        if (!shouldShowTour) {
            Log.d("TourFlow", "TourManager - Tour should not be shown - conditions not met");
            return;
        }
        this.tourState.startTour();
        long currentTimeMillis = System.currentTimeMillis();
        this.tutorialStartTime = currentTimeMillis;
        this.stepStartTime = currentTimeMillis;
        AnalyticsHelper.INSTANCE.logTutorialBegin();
        TourStep currentStep = this.tourState.getCurrentStep();
        if (currentStep != null && (indexOf = TourStep.getEntries().indexOf(currentStep) + 1) >= 1) {
            AnalyticsHelper.INSTANCE.logTutorialStepViewed(indexOf);
        }
        Log.d("TourFlow", "TourManager - Tour started - isOverlayVisible: " + this.tourState.isOverlayVisible() + ", currentStep: " + this.tourState.getCurrentStep());
    }

    private final void advanceStepWithAnalytics() {
        int indexOf;
        TourStep currentStep = this.tourState.getCurrentStep();
        if (currentStep == null) {
            return;
        }
        int indexOf2 = TourStep.getEntries().indexOf(currentStep);
        if (indexOf2 >= 0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.stepStartTime) / 1000;
            String lowerCase = currentStep.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            AnalyticsHelper.INSTANCE.logTutorialStepComplete(indexOf2 + 1, lowerCase, currentTimeMillis);
        }
        this.tourState.nextStep();
        this.stepStartTime = System.currentTimeMillis();
        TourStep currentStep2 = this.tourState.getCurrentStep();
        if (currentStep2 == null || (indexOf = TourStep.getEntries().indexOf(currentStep2) + 1) < 1) {
            return;
        }
        AnalyticsHelper.INSTANCE.logTutorialStepViewed(indexOf);
    }

    public final void onStepComplete() {
        TourStep currentStep = this.tourState.getCurrentStep();
        if (currentStep == null) {
        }
        switch (WhenMappings.$EnumSwitchMapping$0[currentStep.ordinal()]) {
            case 1:
                advanceStepWithAnalytics();
                break;
            case 2:
                advanceStepWithAnalytics();
                break;
            case 3:
                advanceStepWithAnalytics();
                break;
            case 4:
                advanceStepWithAnalytics();
                break;
            case 5:
                advanceStepWithAnalytics();
                break;
            case 6:
                advanceStepWithAnalytics();
                break;
            case 7:
                advanceStepWithAnalytics();
                if (HomeTourSteps.INSTANCE.isHomeV2HighlightStep(this.tourState.getCurrentStep())) {
                    EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.HOME, null));
                    break;
                }
                break;
            case 8:
                advanceStepWithAnalytics();
                break;
            case 9:
                advanceStepWithAnalytics();
                break;
            case 10:
                advanceStepWithAnalytics();
                break;
            case 11:
                completeTour();
                break;
            case 12:
                advanceStepWithAnalytics();
                break;
            case 13:
                advanceStepWithAnalytics();
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
                break;
            case 20:
                int indexOf = TourStep.getEntries().indexOf(TourStep.BET_PLACED);
                if (indexOf >= 0) {
                    long currentTimeMillis = (System.currentTimeMillis() - this.stepStartTime) / 1000;
                    String lowerCase = "BET_PLACED".toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    AnalyticsHelper.INSTANCE.logTutorialStepComplete(indexOf + 1, lowerCase, currentTimeMillis);
                }
                completeTour();
                break;
            default:
                if (HomeTourSteps.INSTANCE.isHomeV2HighlightStep(currentStep)) {
                    advanceStepWithAnalytics();
                    break;
                }
                break;
        }
    }

    public final void onSportButtonClicked() {
        if (this.tourState.getCurrentStep() == TourStep.CLICK_SPORT) {
            advanceStepWithAnalytics();
        }
    }

    public final void onSportSelected(long sportId) {
        if (this.tourState.getCurrentStep() == TourStep.SELECT_SPORT) {
            this.tourState.setSelectedSportId(Long.valueOf(sportId));
            advanceStepWithAnalytics();
        }
    }

    public final void onLeagueSelected(long leagueId) {
        if (this.tourState.getCurrentStep() == TourStep.SELECT_LEAGUE) {
            this.tourState.setSelectedLeagueId(Long.valueOf(leagueId));
            advanceStepWithAnalytics();
            Log.d("TourFlow", "TourManager - Navigating to LEAGUE_MATCHES for league ID: " + leagueId);
            Bundle bundle = new Bundle();
            bundle.putInt("id", (int) leagueId);
            bundle.putBoolean("isLive", false);
            bundle.putString("filter", "All");
            bundle.putBoolean("isFavorite", false);
            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.LEAGUE_MATCHES, bundle));
        }
    }

    public final void onMatchSelected(long matchId) {
        if (this.tourState.getCurrentStep() == TourStep.SELECT_MATCH) {
            this.tourState.setSelectedMatchId(Long.valueOf(matchId));
            advanceStepWithAnalytics();
            Log.d("TourFlow", "TourManager - Match selected: " + matchId + ", moved to step: " + this.tourState.getCurrentStep());
        }
    }

    public final void onBetSelected(long betId) {
        if (this.tourState.getCurrentStep() == TourStep.SELECT_BET) {
            this.tourState.setSelectedBetId(Long.valueOf(betId));
            Log.d("TourFlow", "TourManager - Bet selected: " + betId + ", waiting for successful addition to betslip before advancing");
        }
    }

    public final void onBettingSheetShown() {
        if (this.tourState.getCurrentStep() != TourStep.SELECT_BET || this.tourState.getSelectedBetId() == null) {
            return;
        }
        Log.d("TourFlow", "TourManager - BettingSheetDialog shown, bet successfully added, advancing to PLACE_BET step");
        advanceStepWithAnalytics();
    }

    public static /* synthetic */ void onBetPlaced$default(TourManager tourManager, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        tourManager.onBetPlaced(num);
    }

    public final void onBetPlaced(Integer betId) {
        if (this.tourState.getCurrentStep() == TourStep.PLACE_BET) {
            this.tourState.setPlacedBetId(betId);
            advanceStepWithAnalytics();
            Log.d("TourFlow", "TourManager - Bet placed with ID: " + betId + ", moved to BET_PLACED step");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private final void completeTour() {
        double d;
        AnalyticsHelper.INSTANCE.logTutorialComplete((System.currentTimeMillis() - this.tutorialStartTime) / 1000, TourStep.getEntries().indexOf(TourStep.BET_PLACED) + 1);
        this.context.getSharedPreferences("analytics", 0).edit().putBoolean("tutorial_completed", true).putLong("tutorial_completion_time", System.currentTimeMillis()).apply();
        this.tourState.completeTour();
        String tourSelectedDemoBet = this.tourState.getTourSelectedDemoBet();
        long j = 0;
        long coerceAtLeast = RangesKt.coerceAtLeast(this.tourState.getTourDemoStakeBetcoins(), 0L);
        if (tourSelectedDemoBet != null) {
            switch (tourSelectedDemoBet.hashCode()) {
                case 3091780:
                    if (tourSelectedDemoBet.equals("draw")) {
                        d = this.tourState.getTourCoefficientDraw();
                        break;
                    }
                    break;
                case 113135758:
                    if (tourSelectedDemoBet.equals("win_1")) {
                        d = this.tourState.getTourCoefficientWin1();
                        break;
                    }
                    break;
                case 113135759:
                    if (tourSelectedDemoBet.equals("win_2")) {
                        d = this.tourState.getTourCoefficientWin2();
                        break;
                    }
                    break;
            }
            if (coerceAtLeast > 0 && d > 0.0d) {
                j = (long) (coerceAtLeast * d);
            }
            int tourCompleteBonusBetcoins = (int) (j + this.tourState.getTourCompleteBonusBetcoins());
            Bundle bundle = new Bundle();
            bundle.putBoolean("tutorialComplete", true);
            bundle.putBoolean("giveReward", true);
            bundle.putString("tourDemoBetType", tourSelectedDemoBet);
            this.updateTutorialCompleteInteractor.load(new TourManager$completeTour$1(tourCompleteBonusBetcoins, tourSelectedDemoBet, this), null, bundle);
        }
        d = 0.0d;
        if (coerceAtLeast > 0) {
            j = (long) (coerceAtLeast * d);
        }
        int tourCompleteBonusBetcoins2 = (int) (j + this.tourState.getTourCompleteBonusBetcoins());
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("tutorialComplete", true);
        bundle2.putBoolean("giveReward", true);
        bundle2.putString("tourDemoBetType", tourSelectedDemoBet);
        this.updateTutorialCompleteInteractor.load(new TourManager$completeTour$1(tourCompleteBonusBetcoins2, tourSelectedDemoBet, this), null, bundle2);
    }

    public final void skipTour() {
        TourStep currentStep = this.tourState.getCurrentStep();
        AnalyticsHelper.INSTANCE.logTutorialAbandoned(currentStep != null ? TourStep.getEntries().indexOf(currentStep) + 1 : 0, (System.currentTimeMillis() - this.tutorialStartTime) / 1000);
        this.tourState.skipTour();
        Bundle bundle = new Bundle();
        bundle.putBoolean("tutorialComplete", true);
        bundle.putBoolean("giveReward", false);
        this.updateTutorialCompleteInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<TutorialCompleteResponseModel, Void>() { // from class: org.betup.ui.tour.compose.TourManager$skipTour$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<TutorialCompleteResponseModel, Void> responseMessage) {
                UserService userService;
                UserService userService2;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                userService = TourManager.this.userService;
                userService.invalidate(UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS);
                userService2 = TourManager.this.userService;
                userService2.syncProfile(UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS);
                Log.d("TourFlow", "TourManager - Tour skipped, balance refreshed");
            }
        }, null, bundle);
    }
}
