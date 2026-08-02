package org.betup.ui.fragment.home.controller;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.bus.CoefficientUpdatedMessage;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.matches.championship.specific.NewBetGroupModel;
import org.betup.model.remote.entity.matches.championship.specific.NewBetModel;
import org.betup.model.remote.entity.matches.championship.specific.NewBetSectionModel;
import org.betup.model.remote.entity.matches.championship.specific.NewListedMatchModel;
import org.betup.model.remote.entity.matches.championship.specific.NewToOldModelConverter;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetGroupModel;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetValidator;
import org.betup.services.billing.BillingService;
import org.betup.services.billing.PurchaseCompletedListener;
import org.betup.services.billing.UnlockBetTypesFlow;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.ProgressDisplay;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.fragment.home.compose.HomeMatchOddUi;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeMatchBetController.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 >2\u00020\u0001:\u0002>?BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0&J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0016J\u000e\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0016J\u000e\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.J\u001e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.J\u0006\u00103\u001a\u00020$J\u001a\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0016H\u0002J \u00107\u001a\u00020$2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00162\u0006\u00108\u001a\u000209H\u0002J!\u0010:\u001a\u00020$2\u0006\u00100\u001a\u0002012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0002\u0010<J\b\u0010=\u001a\u00020$H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\"0!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeMatchBetController;", "", "betListAppender", "Lorg/betup/services/betlist/BetListAppender;", "betValidator", "Lorg/betup/services/betlist/BetValidator;", "billingService", "Lorg/betup/services/billing/BillingService;", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "singleShopInteractor", "Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "userService", "Lorg/betup/services/user/UserService;", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/services/betlist/BetListAppender;Lorg/betup/services/betlist/BetValidator;Lorg/betup/services/billing/BillingService;Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;Lorg/betup/services/analytics/AnalyticsService;Lorg/betup/services/user/UserService;Lorg/betup/services/offer/VideoRewardService;)V", "validatingBetIds", "", "", "<set-?>", "", "betUiRevision", "getBetUiRevision", "()I", "setBetUiRevision", "(I)V", "betUiRevision$delegate", "Landroidx/compose/runtime/MutableIntState;", "listedMatchById", "", "Lorg/betup/model/remote/entity/matches/championship/specific/NewListedMatchModel;", "updateListedMatches", "", "live", "", "more", "isBetSelected", "", "grabbedBetId", "isBetValidating", "isBetLocked", "odd", "Lorg/betup/ui/fragment/home/compose/HomeMatchOddUi;", "onBetClick", "activity", "Lorg/betup/ui/MainActivity;", "matchId", "notifyBetlistChanged", "findBetContext", "Lorg/betup/ui/fragment/home/controller/HomeMatchBetController$BetContext;", "listedMatch", "handleBetClick", "bet", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", "startUnlockFlow", "lockedBetGroupId", "(Lorg/betup/ui/MainActivity;Ljava/lang/Long;)V", "bumpUi", VastTagName.COMPANION, "BetContext", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeMatchBetController {
    private static final String TAG = "HomeMatchBetController";
    private static final long VALIDATION_TIMEOUT_MS = 5000;
    private final AnalyticsService analyticsService;
    private final BetListAppender betListAppender;

    /* renamed from: betUiRevision$delegate, reason: from kotlin metadata */
    private final MutableIntState betUiRevision;
    private final BetValidator betValidator;
    private final BillingService billingService;
    private final FirebaseRemoteConfig firebaseRemoteConfig;
    private Map<Long, NewListedMatchModel> listedMatchById;
    private final NewSingleShopInteractor singleShopInteractor;
    private final UserService userService;
    private final Set<Long> validatingBetIds;
    private final VideoRewardService videoRewardService;
    public static final int $stable = 8;

    public HomeMatchBetController(BetListAppender betListAppender, BetValidator betValidator, BillingService billingService, FirebaseRemoteConfig firebaseRemoteConfig, NewSingleShopInteractor singleShopInteractor, AnalyticsService analyticsService, UserService userService, VideoRewardService videoRewardService) {
        Intrinsics.checkNotNullParameter(betListAppender, "betListAppender");
        Intrinsics.checkNotNullParameter(betValidator, "betValidator");
        Intrinsics.checkNotNullParameter(billingService, "billingService");
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "firebaseRemoteConfig");
        Intrinsics.checkNotNullParameter(singleShopInteractor, "singleShopInteractor");
        Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(videoRewardService, "videoRewardService");
        this.betListAppender = betListAppender;
        this.betValidator = betValidator;
        this.billingService = billingService;
        this.firebaseRemoteConfig = firebaseRemoteConfig;
        this.singleShopInteractor = singleShopInteractor;
        this.analyticsService = analyticsService;
        this.userService = userService;
        this.videoRewardService = videoRewardService;
        this.validatingBetIds = new LinkedHashSet();
        this.betUiRevision = SnapshotIntStateKt.mutableIntStateOf(0);
        this.listedMatchById = MapsKt.emptyMap();
    }

    private final void setBetUiRevision(int i) {
        this.betUiRevision.setIntValue(i);
    }

    public final int getBetUiRevision() {
        return this.betUiRevision.getIntValue();
    }

    public final void updateListedMatches(List<NewListedMatchModel> live, List<NewListedMatchModel> more) {
        Intrinsics.checkNotNullParameter(live, "live");
        Intrinsics.checkNotNullParameter(more, "more");
        List plus = CollectionsKt.plus((Collection) live, (Iterable) more);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(plus, 10)), 16));
        for (Object obj : plus) {
            linkedHashMap.put(Long.valueOf(((NewListedMatchModel) obj).getMatch().getId()), obj);
        }
        this.listedMatchById = linkedHashMap;
    }

    public final boolean isBetSelected(long grabbedBetId) {
        return grabbedBetId > 0 && this.betListAppender.isSelectedBetAlready(grabbedBetId);
    }

    public final boolean isBetValidating(long grabbedBetId) {
        return this.validatingBetIds.contains(Long.valueOf(grabbedBetId));
    }

    public final boolean isBetLocked(HomeMatchOddUi odd) {
        Intrinsics.checkNotNullParameter(odd, "odd");
        return (odd.getGroupUserAvailable() && odd.isAvailable() && (!isBetSelected(odd.getGrabbedBetId()) || this.betListAppender.isBetAvailableInSlip(odd.getGrabbedBetId()))) ? false : true;
    }

    public final void onBetClick(MainActivity activity, long matchId, HomeMatchOddUi odd) {
        BetContext findBetContext;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(odd, "odd");
        NewListedMatchModel newListedMatchModel = this.listedMatchById.get(Long.valueOf(matchId));
        if (newListedMatchModel == null || (findBetContext = findBetContext(newListedMatchModel, odd.getGrabbedBetId())) == null) {
            return;
        }
        handleBetClick(activity, matchId, NewToOldModelConverter.INSTANCE.buildBetModelForClick(newListedMatchModel, findBetContext.getBet(), findBetContext.getGroup().getGroup(), findBetContext.getSection().getVariety()));
    }

    public final void notifyBetlistChanged() {
        this.validatingBetIds.clear();
        setBetUiRevision(getBetUiRevision() + 1);
    }

    /* compiled from: HomeMatchBetController.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeMatchBetController$BetContext;", "", "section", "Lorg/betup/model/remote/entity/matches/championship/specific/NewBetSectionModel;", "group", "Lorg/betup/model/remote/entity/matches/championship/specific/NewBetGroupModel;", "bet", "Lorg/betup/model/remote/entity/matches/championship/specific/NewBetModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/matches/championship/specific/NewBetSectionModel;Lorg/betup/model/remote/entity/matches/championship/specific/NewBetGroupModel;Lorg/betup/model/remote/entity/matches/championship/specific/NewBetModel;)V", "getSection", "()Lorg/betup/model/remote/entity/matches/championship/specific/NewBetSectionModel;", "getGroup", "()Lorg/betup/model/remote/entity/matches/championship/specific/NewBetGroupModel;", "getBet", "()Lorg/betup/model/remote/entity/matches/championship/specific/NewBetModel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class BetContext {
        private final NewBetModel bet;
        private final NewBetGroupModel group;
        private final NewBetSectionModel section;

        public static /* synthetic */ BetContext copy$default(BetContext betContext, NewBetSectionModel newBetSectionModel, NewBetGroupModel newBetGroupModel, NewBetModel newBetModel, int i, Object obj) {
            if ((i & 1) != 0) {
                newBetSectionModel = betContext.section;
            }
            if ((i & 2) != 0) {
                newBetGroupModel = betContext.group;
            }
            if ((i & 4) != 0) {
                newBetModel = betContext.bet;
            }
            return betContext.copy(newBetSectionModel, newBetGroupModel, newBetModel);
        }

        /* renamed from: component1, reason: from getter */
        public final NewBetSectionModel getSection() {
            return this.section;
        }

        /* renamed from: component2, reason: from getter */
        public final NewBetGroupModel getGroup() {
            return this.group;
        }

        /* renamed from: component3, reason: from getter */
        public final NewBetModel getBet() {
            return this.bet;
        }

        public final BetContext copy(NewBetSectionModel section, NewBetGroupModel group, NewBetModel bet) {
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(bet, "bet");
            return new BetContext(section, group, bet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BetContext)) {
                return false;
            }
            BetContext betContext = (BetContext) other;
            return Intrinsics.areEqual(this.section, betContext.section) && Intrinsics.areEqual(this.group, betContext.group) && Intrinsics.areEqual(this.bet, betContext.bet);
        }

        public int hashCode() {
            return (((this.section.hashCode() * 31) + this.group.hashCode()) * 31) + this.bet.hashCode();
        }

        public String toString() {
            return "BetContext(section=" + this.section + ", group=" + this.group + ", bet=" + this.bet + ")";
        }

        public BetContext(NewBetSectionModel section, NewBetGroupModel group, NewBetModel bet) {
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(bet, "bet");
            this.section = section;
            this.group = group;
            this.bet = bet;
        }

        public final NewBetSectionModel getSection() {
            return this.section;
        }

        public final NewBetGroupModel getGroup() {
            return this.group;
        }

        public final NewBetModel getBet() {
            return this.bet;
        }
    }

    private final BetContext findBetContext(NewListedMatchModel listedMatch, long grabbedBetId) {
        if (grabbedBetId <= 0) {
            return null;
        }
        for (NewBetSectionModel newBetSectionModel : listedMatch.getBets()) {
            for (NewBetGroupModel newBetGroupModel : newBetSectionModel.getGroups()) {
                for (NewBetModel newBetModel : newBetGroupModel.getBets()) {
                    if (newBetModel.getGrabbedBetId() == grabbedBetId) {
                        return new BetContext(newBetSectionModel, newBetGroupModel, newBetModel);
                    }
                }
            }
        }
        return null;
    }

    private final void handleBetClick(final MainActivity activity, final long matchId, final BetModel bet) {
        final long grabbedBetId = bet.getGrabbedBetId();
        if (this.betListAppender.isSelectedBetAlready(grabbedBetId)) {
            this.betListAppender.removeBet(grabbedBetId);
            this.validatingBetIds.remove(Long.valueOf(grabbedBetId));
            bumpUi();
            return;
        }
        MatchDetailsBetDataModel bet2 = bet.getBet();
        MatchDetailsBetGroupModel betGroup = bet2 != null ? bet2.getBetGroup() : null;
        if (betGroup != null && !betGroup.isAvailable()) {
            SnackbarHelper.showShortIfForeground(activity, R.string.bet_type_locked);
            startUnlockFlow(activity, Long.valueOf(betGroup.getId().intValue()));
            return;
        }
        MatchDetailsBetDataModel bet3 = bet.getBet();
        if (bet3 != null ? Intrinsics.areEqual((Object) bet3.getIsAvailable(), (Object) false) : false) {
            SnackbarHelper.showShortIfForeground(activity, R.string.bet_not_available);
            return;
        }
        this.validatingBetIds.add(Long.valueOf(grabbedBetId));
        bumpUi();
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() { // from class: org.betup.ui.fragment.home.controller.HomeMatchBetController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                HomeMatchBetController.handleBetClick$lambda$4(HomeMatchBetController.this, grabbedBetId);
            }
        };
        handler.postDelayed(runnable, 5000L);
        MatchDetailsBetDataModel bet4 = bet.getBet();
        final double grabbedCoeficient = bet4 != null ? bet4.getGrabbedCoeficient() : 0.0d;
        this.betValidator.validateBet(bet, new BetValidator.ValidationCallback() { // from class: org.betup.ui.fragment.home.controller.HomeMatchBetController$handleBetClick$1
            @Override // org.betup.services.betlist.BetValidator.ValidationCallback
            public void onValidationSuccess(BetModel validatedBet, boolean coefficientChanged) {
                Set set;
                BetListAppender betListAppender;
                Intrinsics.checkNotNullParameter(validatedBet, "validatedBet");
                handler.removeCallbacks(runnable);
                set = this.validatingBetIds;
                set.remove(Long.valueOf(grabbedBetId));
                betListAppender = this.betListAppender;
                betListAppender.addValidatedBetWithClickCoefficient(validatedBet, grabbedCoeficient);
                if (coefficientChanged) {
                    SnackbarHelper.showShortIfForeground(activity, R.string.bet_coefficient_changed);
                    EventBus.getDefault().post(new CoefficientUpdatedMessage(Long.valueOf(matchId)));
                }
                this.bumpUi();
            }

            @Override // org.betup.services.betlist.BetValidator.ValidationCallback
            public void onValidationFailed(BetValidator.ValidationFailureReason reason, int errorMessageId) {
                Set set;
                MatchDetailsBetGroupModel betGroup2;
                Integer id;
                Intrinsics.checkNotNullParameter(reason, "reason");
                handler.removeCallbacks(runnable);
                set = this.validatingBetIds;
                set.remove(Long.valueOf(grabbedBetId));
                this.bumpUi();
                SnackbarHelper.showShortIfForeground(activity, errorMessageId);
                EventBus.getDefault().post(new CoefficientUpdatedMessage(Long.valueOf(matchId)));
                if (reason == BetValidator.ValidationFailureReason.BET_TYPE_LOCKED) {
                    MatchDetailsBetDataModel bet5 = bet.getBet();
                    this.startUnlockFlow(activity, (bet5 == null || (betGroup2 = bet5.getBetGroup()) == null || (id = betGroup2.getId()) == null) ? null : Long.valueOf(id.intValue()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleBetClick$lambda$4(HomeMatchBetController homeMatchBetController, long j) {
        if (homeMatchBetController.validatingBetIds.remove(Long.valueOf(j))) {
            Log.w(TAG, "Bet validation timeout for betId=" + j);
            homeMatchBetController.bumpUi();
        }
    }

    static /* synthetic */ void startUnlockFlow$default(HomeMatchBetController homeMatchBetController, MainActivity mainActivity, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        homeMatchBetController.startUnlockFlow(mainActivity, l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startUnlockFlow(MainActivity activity, Long lockedBetGroupId) {
        try {
            UnlockBetTypesFlow unlockBetTypesFlow = new UnlockBetTypesFlow(activity, this.billingService, this.firebaseRemoteConfig, this.singleShopInteractor, new ProgressDisplay() { // from class: org.betup.ui.fragment.home.controller.HomeMatchBetController$startUnlockFlow$progressDisplay$1
                @Override // org.betup.ui.ProgressDisplay
                public void displayProgress() {
                }

                @Override // org.betup.ui.ProgressDisplay
                public void hideProgress() {
                }
            }, PurchasePlacement.BETSLIP, this.analyticsService, this.userService, this.videoRewardService);
            String l = lockedBetGroupId != null ? lockedBetGroupId.toString() : null;
            if (l != null) {
                unlockBetTypesFlow.start(new PurchaseCompletedListener() { // from class: org.betup.ui.fragment.home.controller.HomeMatchBetController$$ExternalSyntheticLambda1
                    @Override // org.betup.services.billing.PurchaseCompletedListener
                    public final void purchaseCompleted() {
                        HomeMatchBetController.this.bumpUi();
                    }
                }, l);
            } else {
                unlockBetTypesFlow.start(new PurchaseCompletedListener() { // from class: org.betup.ui.fragment.home.controller.HomeMatchBetController$$ExternalSyntheticLambda2
                    @Override // org.betup.services.billing.PurchaseCompletedListener
                    public final void purchaseCompleted() {
                        HomeMatchBetController.this.bumpUi();
                    }
                }, new String[0]);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error starting unlock flow: " + e.getMessage(), e);
            SnackbarHelper.showShortIfForeground(activity, R.string.error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bumpUi() {
        setBetUiRevision(getBetUiRevision() + 1);
    }
}
