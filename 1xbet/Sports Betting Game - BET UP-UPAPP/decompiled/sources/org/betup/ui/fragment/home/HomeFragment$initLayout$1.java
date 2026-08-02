package org.betup.ui.fragment.home;

import android.graphics.Rect;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.bus.NavigateMessage;
import org.betup.domain.quest.DailyQuestTask;
import org.betup.model.local.entity.OddType;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.fragment.dailybonus.model.DailyBonusData;
import org.betup.ui.fragment.home.compose.HomeMatchOddUi;
import org.betup.ui.fragment.home.compose.HomeScreenKt;
import org.betup.ui.fragment.home.compose.HomeUiState;
import org.betup.ui.fragment.home.controller.HomeDailyQuestController;
import org.betup.ui.fragment.home.controller.HomeDailyQuestUiState;
import org.betup.ui.fragment.home.controller.HomeMatchBetController;
import org.betup.ui.fragment.home.controller.HomeVideoBonusUiState;
import org.betup.ui.tour.compose.HomeTourScroll;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.ui.tour.compose.TourState;
import org.betup.ui.tour.compose.TourStep;
import org.greenrobot.eventbus.EventBus;

/* compiled from: KHomeFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HomeFragment$initLayout$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ HomeFragment this$0;

    HomeFragment$initLayout$1(HomeFragment homeFragment) {
        this.this$0 = homeFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final HomeUiState invoke$lambda$0(MutableState<HomeUiState> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        MutableState mutableState;
        HomeMatchBetController homeMatchBetController;
        boolean z;
        boolean bonusOfferActive;
        final HomeUiState copy;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        MutableState mutableState2;
        boolean changedInstance;
        Object rememberedValue3;
        boolean changedInstance2;
        Object rememberedValue4;
        boolean changedInstance3;
        Object rememberedValue5;
        boolean changedInstance4;
        Object rememberedValue6;
        boolean changedInstance5;
        Object rememberedValue7;
        boolean changedInstance6;
        Object rememberedValue8;
        boolean changed3;
        Object rememberedValue9;
        boolean changed4;
        Object rememberedValue10;
        boolean changed5;
        Object rememberedValue11;
        boolean changedInstance7;
        Object rememberedValue12;
        boolean changedInstance8;
        Object rememberedValue13;
        boolean changedInstance9;
        Object rememberedValue14;
        boolean changed6;
        Object rememberedValue15;
        boolean changed7;
        Object rememberedValue16;
        boolean changed8;
        Object rememberedValue17;
        boolean changedInstance10;
        Object rememberedValue18;
        boolean changedInstance11;
        Object rememberedValue19;
        boolean changedInstance12;
        Object rememberedValue20;
        boolean changedInstance13;
        Object rememberedValue21;
        boolean changedInstance14;
        Object rememberedValue22;
        boolean changedInstance15;
        Object rememberedValue23;
        boolean changedInstance16;
        Object rememberedValue24;
        boolean changedInstance17;
        Object rememberedValue25;
        boolean changedInstance18;
        Object rememberedValue26;
        boolean changedInstance19;
        Object rememberedValue27;
        boolean changedInstance20;
        Object rememberedValue28;
        boolean changedInstance21;
        Object rememberedValue29;
        boolean changedInstance22;
        Object rememberedValue30;
        boolean changedInstance23;
        Object rememberedValue31;
        boolean changedInstance24;
        Object rememberedValue32;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1187349748, i, -1, "org.betup.ui.fragment.home.HomeFragment.initLayout.<anonymous> (KHomeFragment.kt:335)");
        }
        mutableState = this.this$0.homeUiState;
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getHomeDailyQuestController().getUiState(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.getDailyBonusController().getData(), null, composer, 0, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(this.this$0.getHomeVideoBonusController().getUiState(), null, composer, 0, 1);
        homeMatchBetController = this.this$0.homeMatchBetController;
        if (homeMatchBetController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeMatchBetController");
            homeMatchBetController = null;
        }
        final int betUiRevision = homeMatchBetController.getBetUiRevision();
        FragmentActivity activity = this.this$0.getActivity();
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        final TourComposeHelper tourComposeHelper = mainActivity != null ? mainActivity.tourComposeHelper : null;
        final TourState tourState = tourComposeHelper != null ? tourComposeHelper.getTourState() : null;
        boolean z2 = tourComposeHelper != null && tourComposeHelper.isTourActive();
        boolean z3 = z2 || (tourComposeHelper != null && tourComposeHelper.shouldShowTour());
        LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, composer, 0, 3);
        TourStep currentStep = tourState != null ? tourState.getCurrentStep() : null;
        boolean z4 = (tourState == null || tourState.isHomeTourPresentationAllowed()) ? false : true;
        boolean z5 = !z4;
        boolean z6 = z2 && currentStep != null && tourState != null && tourState.isOverlayVisible() && (tourState == null || !tourState.isHomeScrollComplete()) && HomeTourScroll.INSTANCE.requiresScroll(currentStep) && !z4;
        if (tourState != null) {
            if (HomeTourScroll.INSTANCE.shouldShowTourOverlay(tourState.isOverlayVisible(), currentStep, tourState.isSportScrollComplete(), tourState.isLeagueScrollComplete(), tourState.isMatchScrollComplete(), tourState.isHomeScrollComplete(), tourState.isDemoWinRewardDialogBlockingHomeTour())) {
                z = true;
                HomeUiState invoke$lambda$0 = invoke$lambda$0(mutableState);
                HomeDailyQuestUiState invoke$lambda$1 = invoke$lambda$1(collectAsState);
                HomeVideoBonusUiState invoke$lambda$3 = invoke$lambda$3(collectAsState3);
                bonusOfferActive = this.this$0.getBonusOfferActive();
                copy = invoke$lambda$0.copy((r22 & 1) != 0 ? invoke$lambda$0.stats : null, (r22 & 2) != 0 ? invoke$lambda$0.promo : null, (r22 & 4) != 0 ? invoke$lambda$0.dailyQuests : invoke$lambda$1, (r22 & 8) != 0 ? invoke$lambda$0.videoBonus : invoke$lambda$3, (r22 & 16) != 0 ? invoke$lambda$0.bonusOfferActive : bonusOfferActive, (r22 & 32) != 0 ? invoke$lambda$0.activeOffer : null, (r22 & 64) != 0 ? invoke$lambda$0.offerExpirationMs : null, (r22 & 128) != 0 ? invoke$lambda$0.liveMatches : null, (r22 & 256) != 0 ? invoke$lambda$0.moreMatches : null, (r22 & 512) != 0 ? invoke$lambda$0.battlesBadgeCount : 0);
                Boolean valueOf = Boolean.valueOf(z2);
                composer.startReplaceGroup(-1746271574);
                changed = composer.changed(z2) | composer.changed(tourState) | composer.changedInstance(copy);
                rememberedValue = composer.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (Function2) new HomeFragment$initLayout$1$1$1(z2, tourState, copy, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(copy, valueOf, (Function2) rememberedValue, composer, 0);
                Boolean valueOf2 = Boolean.valueOf(z3);
                composer.startReplaceGroup(-1633490746);
                changed2 = composer.changed(z3) | composer.changedInstance(this.this$0);
                HomeFragment homeFragment = this.this$0;
                rememberedValue2 = composer.rememberedValue();
                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (Function2) new HomeFragment$initLayout$1$2$1(z3, homeFragment, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, composer, 0);
                DailyBonusData invoke$lambda$2 = invoke$lambda$2(collectAsState2);
                mutableState2 = this.this$0.pullRefreshing;
                boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                boolean z7 = !z2;
                OddType oddType = this.this$0.getUserService().getOddType();
                Intrinsics.checkNotNullExpressionValue(oddType, "getOddType(...)");
                composer.startReplaceGroup(5004770);
                changedInstance = composer.changedInstance(this.this$0);
                final HomeFragment homeFragment2 = this.this$0;
                rememberedValue3 = composer.rememberedValue();
                if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$7$lambda$6;
                            invoke$lambda$7$lambda$6 = HomeFragment$initLayout$1.invoke$lambda$7$lambda$6(HomeFragment.this);
                            return invoke$lambda$7$lambda$6;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                Function0 function0 = (Function0) rememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance2 = composer.changedInstance(this.this$0);
                final HomeFragment homeFragment3 = this.this$0;
                rememberedValue4 = composer.rememberedValue();
                if (!changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$9$lambda$8;
                            invoke$lambda$9$lambda$8 = HomeFragment$initLayout$1.invoke$lambda$9$lambda$8(HomeFragment.this, (String) obj);
                            return invoke$lambda$9$lambda$8;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                Function1 function1 = (Function1) rememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance3 = composer.changedInstance(this.this$0);
                final HomeFragment homeFragment4 = this.this$0;
                rememberedValue5 = composer.rememberedValue();
                if (!changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$11$lambda$10;
                            invoke$lambda$11$lambda$10 = HomeFragment$initLayout$1.invoke$lambda$11$lambda$10(HomeFragment.this, (DailyQuestTask) obj);
                            return invoke$lambda$11$lambda$10;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue5);
                }
                Function1 function12 = (Function1) rememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance4 = composer.changedInstance(copy);
                rememberedValue6 = composer.rememberedValue();
                if (!changedInstance4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$13$lambda$12;
                            invoke$lambda$13$lambda$12 = HomeFragment$initLayout$1.invoke$lambda$13$lambda$12(HomeUiState.this);
                            return invoke$lambda$13$lambda$12;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue6);
                }
                Function0 function02 = (Function0) rememberedValue6;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance5 = composer.changedInstance(this.this$0);
                final HomeFragment homeFragment5 = this.this$0;
                rememberedValue7 = composer.rememberedValue();
                if (!changedInstance5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$15$lambda$14;
                            invoke$lambda$15$lambda$14 = HomeFragment$initLayout$1.invoke$lambda$15$lambda$14(HomeFragment.this);
                            return invoke$lambda$15$lambda$14;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue7);
                }
                Function0 function03 = (Function0) rememberedValue7;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance6 = composer.changedInstance(this.this$0);
                final HomeFragment homeFragment6 = this.this$0;
                TourStep tourStep = currentStep;
                rememberedValue8 = composer.rememberedValue();
                if (!changedInstance6 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$17$lambda$16;
                            invoke$lambda$17$lambda$16 = HomeFragment$initLayout$1.invoke$lambda$17$lambda$16(HomeFragment.this);
                            return invoke$lambda$17$lambda$16;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue8);
                }
                Function0 function04 = (Function0) rememberedValue8;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                changed3 = composer.changed(betUiRevision) | composer.changedInstance(this.this$0);
                final HomeFragment homeFragment7 = this.this$0;
                rememberedValue9 = composer.rememberedValue();
                if (!changed3 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean invoke$lambda$19$lambda$18;
                            invoke$lambda$19$lambda$18 = HomeFragment$initLayout$1.invoke$lambda$19$lambda$18(betUiRevision, homeFragment7, ((Long) obj).longValue());
                            return Boolean.valueOf(invoke$lambda$19$lambda$18);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue9);
                }
                Function1 function13 = (Function1) rememberedValue9;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                changed4 = composer.changed(betUiRevision) | composer.changedInstance(this.this$0);
                final HomeFragment homeFragment8 = this.this$0;
                rememberedValue10 = composer.rememberedValue();
                if (!changed4 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean invoke$lambda$21$lambda$20;
                            invoke$lambda$21$lambda$20 = HomeFragment$initLayout$1.invoke$lambda$21$lambda$20(betUiRevision, homeFragment8, ((Long) obj).longValue());
                            return Boolean.valueOf(invoke$lambda$21$lambda$20);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue10);
                }
                Function1 function14 = (Function1) rememberedValue10;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                changed5 = composer.changed(betUiRevision) | composer.changedInstance(this.this$0);
                final HomeFragment homeFragment9 = this.this$0;
                rememberedValue11 = composer.rememberedValue();
                if (!changed5 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean invoke$lambda$23$lambda$22;
                            invoke$lambda$23$lambda$22 = HomeFragment$initLayout$1.invoke$lambda$23$lambda$22(betUiRevision, homeFragment9, (HomeMatchOddUi) obj);
                            return Boolean.valueOf(invoke$lambda$23$lambda$22);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue11);
                }
                Function1 function15 = (Function1) rememberedValue11;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance7 = composer.changedInstance(this.this$0);
                final HomeFragment homeFragment10 = this.this$0;
                rememberedValue12 = composer.rememberedValue();
                if (!changedInstance7 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new Function2() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit invoke$lambda$25$lambda$24;
                            invoke$lambda$25$lambda$24 = HomeFragment$initLayout$1.invoke$lambda$25$lambda$24(HomeFragment.this, ((Long) obj).longValue(), (HomeMatchOddUi) obj2);
                            return invoke$lambda$25$lambda$24;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue12);
                }
                Function2 function2 = (Function2) rememberedValue12;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance8 = composer.changedInstance(this.this$0);
                final HomeFragment homeFragment11 = this.this$0;
                rememberedValue13 = composer.rememberedValue();
                if (!changedInstance8 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue13 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$27$lambda$26;
                            invoke$lambda$27$lambda$26 = HomeFragment$initLayout$1.invoke$lambda$27$lambda$26(HomeFragment.this);
                            return invoke$lambda$27$lambda$26;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue13);
                }
                Function0 function05 = (Function0) rememberedValue13;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance9 = composer.changedInstance(this.this$0);
                final HomeFragment homeFragment12 = this.this$0;
                rememberedValue14 = composer.rememberedValue();
                if (!changedInstance9 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue14 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$29$lambda$28;
                            invoke$lambda$29$lambda$28 = HomeFragment$initLayout$1.invoke$lambda$29$lambda$28(HomeFragment.this);
                            return invoke$lambda$29$lambda$28;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue14);
                }
                Function0 function06 = (Function0) rememberedValue14;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changed6 = composer.changed(tourState);
                rememberedValue15 = composer.rememberedValue();
                if (!changed6 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue15 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean invoke$lambda$31$lambda$30;
                            invoke$lambda$31$lambda$30 = HomeFragment$initLayout$1.invoke$lambda$31$lambda$30(TourState.this);
                            return Boolean.valueOf(invoke$lambda$31$lambda$30);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue15);
                }
                Function0 function07 = (Function0) rememberedValue15;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changed7 = composer.changed(tourState);
                rememberedValue16 = composer.rememberedValue();
                if (!changed7 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue16 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$33$lambda$32;
                            invoke$lambda$33$lambda$32 = HomeFragment$initLayout$1.invoke$lambda$33$lambda$32(TourState.this);
                            return invoke$lambda$33$lambda$32;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue16);
                }
                Function0 function08 = (Function0) rememberedValue16;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changed8 = composer.changed(tourState);
                rememberedValue17 = composer.rememberedValue();
                if (!changed8 || rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue17 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$35$lambda$34;
                            invoke$lambda$35$lambda$34 = HomeFragment$initLayout$1.invoke$lambda$35$lambda$34(TourState.this, ((Boolean) obj).booleanValue());
                            return invoke$lambda$35$lambda$34;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue17);
                }
                Function1 function16 = (Function1) rememberedValue17;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance10 = composer.changedInstance(tourComposeHelper);
                rememberedValue18 = composer.rememberedValue();
                if (!changedInstance10 || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue18 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$37$lambda$36;
                            invoke$lambda$37$lambda$36 = HomeFragment$initLayout$1.invoke$lambda$37$lambda$36(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$37$lambda$36;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue18);
                }
                Function1 function17 = (Function1) rememberedValue18;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance11 = composer.changedInstance(tourComposeHelper);
                rememberedValue19 = composer.rememberedValue();
                if (!changedInstance11 || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue19 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$39$lambda$38;
                            invoke$lambda$39$lambda$38 = HomeFragment$initLayout$1.invoke$lambda$39$lambda$38(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$39$lambda$38;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue19);
                }
                Function1 function18 = (Function1) rememberedValue19;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance12 = composer.changedInstance(tourComposeHelper);
                rememberedValue20 = composer.rememberedValue();
                if (!changedInstance12 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue20 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda28
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$41$lambda$40;
                            invoke$lambda$41$lambda$40 = HomeFragment$initLayout$1.invoke$lambda$41$lambda$40(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$41$lambda$40;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue20);
                }
                Function1 function19 = (Function1) rememberedValue20;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance13 = composer.changedInstance(tourComposeHelper);
                rememberedValue21 = composer.rememberedValue();
                if (!changedInstance13 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue21 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$43$lambda$42;
                            invoke$lambda$43$lambda$42 = HomeFragment$initLayout$1.invoke$lambda$43$lambda$42(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$43$lambda$42;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue21);
                }
                Function1 function110 = (Function1) rememberedValue21;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance14 = composer.changedInstance(tourComposeHelper);
                rememberedValue22 = composer.rememberedValue();
                if (!changedInstance14 || rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue22 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$45$lambda$44;
                            invoke$lambda$45$lambda$44 = HomeFragment$initLayout$1.invoke$lambda$45$lambda$44(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$45$lambda$44;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue22);
                }
                Function1 function111 = (Function1) rememberedValue22;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance15 = composer.changedInstance(tourComposeHelper);
                rememberedValue23 = composer.rememberedValue();
                if (!changedInstance15 || rememberedValue23 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue23 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$47$lambda$46;
                            invoke$lambda$47$lambda$46 = HomeFragment$initLayout$1.invoke$lambda$47$lambda$46(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$47$lambda$46;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue23);
                }
                Function1 function112 = (Function1) rememberedValue23;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance16 = composer.changedInstance(tourComposeHelper);
                rememberedValue24 = composer.rememberedValue();
                if (!changedInstance16 || rememberedValue24 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue24 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$49$lambda$48;
                            invoke$lambda$49$lambda$48 = HomeFragment$initLayout$1.invoke$lambda$49$lambda$48(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$49$lambda$48;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue24);
                }
                Function1 function113 = (Function1) rememberedValue24;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance17 = composer.changedInstance(tourComposeHelper);
                rememberedValue25 = composer.rememberedValue();
                if (!changedInstance17 || rememberedValue25 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue25 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$51$lambda$50;
                            invoke$lambda$51$lambda$50 = HomeFragment$initLayout$1.invoke$lambda$51$lambda$50(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$51$lambda$50;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue25);
                }
                Function1 function114 = (Function1) rememberedValue25;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance18 = composer.changedInstance(tourComposeHelper);
                rememberedValue26 = composer.rememberedValue();
                if (!changedInstance18 || rememberedValue26 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue26 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$53$lambda$52;
                            invoke$lambda$53$lambda$52 = HomeFragment$initLayout$1.invoke$lambda$53$lambda$52(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$53$lambda$52;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue26);
                }
                Function1 function115 = (Function1) rememberedValue26;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance19 = composer.changedInstance(tourComposeHelper);
                rememberedValue27 = composer.rememberedValue();
                if (!changedInstance19 || rememberedValue27 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue27 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$55$lambda$54;
                            invoke$lambda$55$lambda$54 = HomeFragment$initLayout$1.invoke$lambda$55$lambda$54(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$55$lambda$54;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue27);
                }
                Function1 function116 = (Function1) rememberedValue27;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance20 = composer.changedInstance(tourComposeHelper);
                rememberedValue28 = composer.rememberedValue();
                if (!changedInstance20 || rememberedValue28 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue28 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$57$lambda$56;
                            invoke$lambda$57$lambda$56 = HomeFragment$initLayout$1.invoke$lambda$57$lambda$56(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$57$lambda$56;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue28);
                }
                Function1 function117 = (Function1) rememberedValue28;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance21 = composer.changedInstance(tourComposeHelper);
                rememberedValue29 = composer.rememberedValue();
                if (!changedInstance21 || rememberedValue29 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue29 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$59$lambda$58;
                            invoke$lambda$59$lambda$58 = HomeFragment$initLayout$1.invoke$lambda$59$lambda$58(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$59$lambda$58;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue29);
                }
                Function1 function118 = (Function1) rememberedValue29;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance22 = composer.changedInstance(tourComposeHelper);
                rememberedValue30 = composer.rememberedValue();
                if (!changedInstance22 || rememberedValue30 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue30 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$61$lambda$60;
                            invoke$lambda$61$lambda$60 = HomeFragment$initLayout$1.invoke$lambda$61$lambda$60(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$61$lambda$60;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue30);
                }
                Function1 function119 = (Function1) rememberedValue30;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance23 = composer.changedInstance(tourComposeHelper);
                rememberedValue31 = composer.rememberedValue();
                if (!changedInstance23 || rememberedValue31 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue31 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$63$lambda$62;
                            invoke$lambda$63$lambda$62 = HomeFragment$initLayout$1.invoke$lambda$63$lambda$62(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$63$lambda$62;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue31);
                }
                Function1 function120 = (Function1) rememberedValue31;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                changedInstance24 = composer.changedInstance(tourComposeHelper);
                rememberedValue32 = composer.rememberedValue();
                if (!changedInstance24 || rememberedValue32 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue32 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$65$lambda$64;
                            invoke$lambda$65$lambda$64 = HomeFragment$initLayout$1.invoke$lambda$65$lambda$64(TourComposeHelper.this, (Rect) obj);
                            return invoke$lambda$65$lambda$64;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue32);
                }
                composer.endReplaceGroup();
                HomeScreenKt.HomeScreen(copy, booleanValue, function0, function1, function12, function02, function03, function04, oddType, function13, function14, function15, function2, function05, function06, rememberLazyListStateWithoutSavedState, tourStep, z6, z, z5, function07, function08, function16, z7, function17, function18, function19, function110, function111, function112, function113, function114, function115, function116, function117, function118, function119, function120, (Function1) rememberedValue32, invoke$lambda$2, null, composer, 0, 0, 0, 0, 0, 0, 512);
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
        }
        z = false;
        HomeUiState invoke$lambda$02 = invoke$lambda$0(mutableState);
        HomeDailyQuestUiState invoke$lambda$12 = invoke$lambda$1(collectAsState);
        HomeVideoBonusUiState invoke$lambda$32 = invoke$lambda$3(collectAsState3);
        bonusOfferActive = this.this$0.getBonusOfferActive();
        copy = invoke$lambda$02.copy((r22 & 1) != 0 ? invoke$lambda$02.stats : null, (r22 & 2) != 0 ? invoke$lambda$02.promo : null, (r22 & 4) != 0 ? invoke$lambda$02.dailyQuests : invoke$lambda$12, (r22 & 8) != 0 ? invoke$lambda$02.videoBonus : invoke$lambda$32, (r22 & 16) != 0 ? invoke$lambda$02.bonusOfferActive : bonusOfferActive, (r22 & 32) != 0 ? invoke$lambda$02.activeOffer : null, (r22 & 64) != 0 ? invoke$lambda$02.offerExpirationMs : null, (r22 & 128) != 0 ? invoke$lambda$02.liveMatches : null, (r22 & 256) != 0 ? invoke$lambda$02.moreMatches : null, (r22 & 512) != 0 ? invoke$lambda$02.battlesBadgeCount : 0);
        Boolean valueOf3 = Boolean.valueOf(z2);
        composer.startReplaceGroup(-1746271574);
        changed = composer.changed(z2) | composer.changed(tourState) | composer.changedInstance(copy);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (Function2) new HomeFragment$initLayout$1$1$1(z2, tourState, copy, null);
        composer.updateRememberedValue(rememberedValue);
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(copy, valueOf3, (Function2) rememberedValue, composer, 0);
        Boolean valueOf22 = Boolean.valueOf(z3);
        composer.startReplaceGroup(-1633490746);
        changed2 = composer.changed(z3) | composer.changedInstance(this.this$0);
        HomeFragment homeFragment13 = this.this$0;
        rememberedValue2 = composer.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = (Function2) new HomeFragment$initLayout$1$2$1(z3, homeFragment13, null);
        composer.updateRememberedValue(rememberedValue2);
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, composer, 0);
        DailyBonusData invoke$lambda$22 = invoke$lambda$2(collectAsState2);
        mutableState2 = this.this$0.pullRefreshing;
        boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
        boolean z72 = !z2;
        OddType oddType2 = this.this$0.getUserService().getOddType();
        Intrinsics.checkNotNullExpressionValue(oddType2, "getOddType(...)");
        composer.startReplaceGroup(5004770);
        changedInstance = composer.changedInstance(this.this$0);
        final HomeFragment homeFragment22 = this.this$0;
        rememberedValue3 = composer.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$7$lambda$6;
                invoke$lambda$7$lambda$6 = HomeFragment$initLayout$1.invoke$lambda$7$lambda$6(HomeFragment.this);
                return invoke$lambda$7$lambda$6;
            }
        };
        composer.updateRememberedValue(rememberedValue3);
        Function0 function09 = (Function0) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance2 = composer.changedInstance(this.this$0);
        final HomeFragment homeFragment32 = this.this$0;
        rememberedValue4 = composer.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$9$lambda$8;
                invoke$lambda$9$lambda$8 = HomeFragment$initLayout$1.invoke$lambda$9$lambda$8(HomeFragment.this, (String) obj);
                return invoke$lambda$9$lambda$8;
            }
        };
        composer.updateRememberedValue(rememberedValue4);
        Function1 function121 = (Function1) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance3 = composer.changedInstance(this.this$0);
        final HomeFragment homeFragment42 = this.this$0;
        rememberedValue5 = composer.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue5 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$11$lambda$10;
                invoke$lambda$11$lambda$10 = HomeFragment$initLayout$1.invoke$lambda$11$lambda$10(HomeFragment.this, (DailyQuestTask) obj);
                return invoke$lambda$11$lambda$10;
            }
        };
        composer.updateRememberedValue(rememberedValue5);
        Function1 function122 = (Function1) rememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance4 = composer.changedInstance(copy);
        rememberedValue6 = composer.rememberedValue();
        if (!changedInstance4) {
        }
        rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$13$lambda$12;
                invoke$lambda$13$lambda$12 = HomeFragment$initLayout$1.invoke$lambda$13$lambda$12(HomeUiState.this);
                return invoke$lambda$13$lambda$12;
            }
        };
        composer.updateRememberedValue(rememberedValue6);
        Function0 function022 = (Function0) rememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance5 = composer.changedInstance(this.this$0);
        final HomeFragment homeFragment52 = this.this$0;
        rememberedValue7 = composer.rememberedValue();
        if (!changedInstance5) {
        }
        rememberedValue7 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$15$lambda$14;
                invoke$lambda$15$lambda$14 = HomeFragment$initLayout$1.invoke$lambda$15$lambda$14(HomeFragment.this);
                return invoke$lambda$15$lambda$14;
            }
        };
        composer.updateRememberedValue(rememberedValue7);
        Function0 function032 = (Function0) rememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance6 = composer.changedInstance(this.this$0);
        final HomeFragment homeFragment62 = this.this$0;
        TourStep tourStep2 = currentStep;
        rememberedValue8 = composer.rememberedValue();
        if (!changedInstance6) {
        }
        rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$17$lambda$16;
                invoke$lambda$17$lambda$16 = HomeFragment$initLayout$1.invoke$lambda$17$lambda$16(HomeFragment.this);
                return invoke$lambda$17$lambda$16;
            }
        };
        composer.updateRememberedValue(rememberedValue8);
        Function0 function042 = (Function0) rememberedValue8;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        changed3 = composer.changed(betUiRevision) | composer.changedInstance(this.this$0);
        final HomeFragment homeFragment72 = this.this$0;
        rememberedValue9 = composer.rememberedValue();
        if (!changed3) {
        }
        rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean invoke$lambda$19$lambda$18;
                invoke$lambda$19$lambda$18 = HomeFragment$initLayout$1.invoke$lambda$19$lambda$18(betUiRevision, homeFragment72, ((Long) obj).longValue());
                return Boolean.valueOf(invoke$lambda$19$lambda$18);
            }
        };
        composer.updateRememberedValue(rememberedValue9);
        Function1 function132 = (Function1) rememberedValue9;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        changed4 = composer.changed(betUiRevision) | composer.changedInstance(this.this$0);
        final HomeFragment homeFragment82 = this.this$0;
        rememberedValue10 = composer.rememberedValue();
        if (!changed4) {
        }
        rememberedValue10 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean invoke$lambda$21$lambda$20;
                invoke$lambda$21$lambda$20 = HomeFragment$initLayout$1.invoke$lambda$21$lambda$20(betUiRevision, homeFragment82, ((Long) obj).longValue());
                return Boolean.valueOf(invoke$lambda$21$lambda$20);
            }
        };
        composer.updateRememberedValue(rememberedValue10);
        Function1 function142 = (Function1) rememberedValue10;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        changed5 = composer.changed(betUiRevision) | composer.changedInstance(this.this$0);
        final HomeFragment homeFragment92 = this.this$0;
        rememberedValue11 = composer.rememberedValue();
        if (!changed5) {
        }
        rememberedValue11 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean invoke$lambda$23$lambda$22;
                invoke$lambda$23$lambda$22 = HomeFragment$initLayout$1.invoke$lambda$23$lambda$22(betUiRevision, homeFragment92, (HomeMatchOddUi) obj);
                return Boolean.valueOf(invoke$lambda$23$lambda$22);
            }
        };
        composer.updateRememberedValue(rememberedValue11);
        Function1 function152 = (Function1) rememberedValue11;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance7 = composer.changedInstance(this.this$0);
        final HomeFragment homeFragment102 = this.this$0;
        rememberedValue12 = composer.rememberedValue();
        if (!changedInstance7) {
        }
        rememberedValue12 = new Function2() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit invoke$lambda$25$lambda$24;
                invoke$lambda$25$lambda$24 = HomeFragment$initLayout$1.invoke$lambda$25$lambda$24(HomeFragment.this, ((Long) obj).longValue(), (HomeMatchOddUi) obj2);
                return invoke$lambda$25$lambda$24;
            }
        };
        composer.updateRememberedValue(rememberedValue12);
        Function2 function22 = (Function2) rememberedValue12;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance8 = composer.changedInstance(this.this$0);
        final HomeFragment homeFragment112 = this.this$0;
        rememberedValue13 = composer.rememberedValue();
        if (!changedInstance8) {
        }
        rememberedValue13 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$27$lambda$26;
                invoke$lambda$27$lambda$26 = HomeFragment$initLayout$1.invoke$lambda$27$lambda$26(HomeFragment.this);
                return invoke$lambda$27$lambda$26;
            }
        };
        composer.updateRememberedValue(rememberedValue13);
        Function0 function052 = (Function0) rememberedValue13;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance9 = composer.changedInstance(this.this$0);
        final HomeFragment homeFragment122 = this.this$0;
        rememberedValue14 = composer.rememberedValue();
        if (!changedInstance9) {
        }
        rememberedValue14 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$29$lambda$28;
                invoke$lambda$29$lambda$28 = HomeFragment$initLayout$1.invoke$lambda$29$lambda$28(HomeFragment.this);
                return invoke$lambda$29$lambda$28;
            }
        };
        composer.updateRememberedValue(rememberedValue14);
        Function0 function062 = (Function0) rememberedValue14;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changed6 = composer.changed(tourState);
        rememberedValue15 = composer.rememberedValue();
        if (!changed6) {
        }
        rememberedValue15 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean invoke$lambda$31$lambda$30;
                invoke$lambda$31$lambda$30 = HomeFragment$initLayout$1.invoke$lambda$31$lambda$30(TourState.this);
                return Boolean.valueOf(invoke$lambda$31$lambda$30);
            }
        };
        composer.updateRememberedValue(rememberedValue15);
        Function0 function072 = (Function0) rememberedValue15;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changed7 = composer.changed(tourState);
        rememberedValue16 = composer.rememberedValue();
        if (!changed7) {
        }
        rememberedValue16 = new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$33$lambda$32;
                invoke$lambda$33$lambda$32 = HomeFragment$initLayout$1.invoke$lambda$33$lambda$32(TourState.this);
                return invoke$lambda$33$lambda$32;
            }
        };
        composer.updateRememberedValue(rememberedValue16);
        Function0 function082 = (Function0) rememberedValue16;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changed8 = composer.changed(tourState);
        rememberedValue17 = composer.rememberedValue();
        if (!changed8) {
        }
        rememberedValue17 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$35$lambda$34;
                invoke$lambda$35$lambda$34 = HomeFragment$initLayout$1.invoke$lambda$35$lambda$34(TourState.this, ((Boolean) obj).booleanValue());
                return invoke$lambda$35$lambda$34;
            }
        };
        composer.updateRememberedValue(rememberedValue17);
        Function1 function162 = (Function1) rememberedValue17;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance10 = composer.changedInstance(tourComposeHelper);
        rememberedValue18 = composer.rememberedValue();
        if (!changedInstance10) {
        }
        rememberedValue18 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$37$lambda$36;
                invoke$lambda$37$lambda$36 = HomeFragment$initLayout$1.invoke$lambda$37$lambda$36(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$37$lambda$36;
            }
        };
        composer.updateRememberedValue(rememberedValue18);
        Function1 function172 = (Function1) rememberedValue18;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance11 = composer.changedInstance(tourComposeHelper);
        rememberedValue19 = composer.rememberedValue();
        if (!changedInstance11) {
        }
        rememberedValue19 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$39$lambda$38;
                invoke$lambda$39$lambda$38 = HomeFragment$initLayout$1.invoke$lambda$39$lambda$38(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$39$lambda$38;
            }
        };
        composer.updateRememberedValue(rememberedValue19);
        Function1 function182 = (Function1) rememberedValue19;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance12 = composer.changedInstance(tourComposeHelper);
        rememberedValue20 = composer.rememberedValue();
        if (!changedInstance12) {
        }
        rememberedValue20 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$41$lambda$40;
                invoke$lambda$41$lambda$40 = HomeFragment$initLayout$1.invoke$lambda$41$lambda$40(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$41$lambda$40;
            }
        };
        composer.updateRememberedValue(rememberedValue20);
        Function1 function192 = (Function1) rememberedValue20;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance13 = composer.changedInstance(tourComposeHelper);
        rememberedValue21 = composer.rememberedValue();
        if (!changedInstance13) {
        }
        rememberedValue21 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$43$lambda$42;
                invoke$lambda$43$lambda$42 = HomeFragment$initLayout$1.invoke$lambda$43$lambda$42(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$43$lambda$42;
            }
        };
        composer.updateRememberedValue(rememberedValue21);
        Function1 function1102 = (Function1) rememberedValue21;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance14 = composer.changedInstance(tourComposeHelper);
        rememberedValue22 = composer.rememberedValue();
        if (!changedInstance14) {
        }
        rememberedValue22 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$45$lambda$44;
                invoke$lambda$45$lambda$44 = HomeFragment$initLayout$1.invoke$lambda$45$lambda$44(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$45$lambda$44;
            }
        };
        composer.updateRememberedValue(rememberedValue22);
        Function1 function1112 = (Function1) rememberedValue22;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance15 = composer.changedInstance(tourComposeHelper);
        rememberedValue23 = composer.rememberedValue();
        if (!changedInstance15) {
        }
        rememberedValue23 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$47$lambda$46;
                invoke$lambda$47$lambda$46 = HomeFragment$initLayout$1.invoke$lambda$47$lambda$46(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$47$lambda$46;
            }
        };
        composer.updateRememberedValue(rememberedValue23);
        Function1 function1122 = (Function1) rememberedValue23;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance16 = composer.changedInstance(tourComposeHelper);
        rememberedValue24 = composer.rememberedValue();
        if (!changedInstance16) {
        }
        rememberedValue24 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$49$lambda$48;
                invoke$lambda$49$lambda$48 = HomeFragment$initLayout$1.invoke$lambda$49$lambda$48(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$49$lambda$48;
            }
        };
        composer.updateRememberedValue(rememberedValue24);
        Function1 function1132 = (Function1) rememberedValue24;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance17 = composer.changedInstance(tourComposeHelper);
        rememberedValue25 = composer.rememberedValue();
        if (!changedInstance17) {
        }
        rememberedValue25 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$51$lambda$50;
                invoke$lambda$51$lambda$50 = HomeFragment$initLayout$1.invoke$lambda$51$lambda$50(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$51$lambda$50;
            }
        };
        composer.updateRememberedValue(rememberedValue25);
        Function1 function1142 = (Function1) rememberedValue25;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance18 = composer.changedInstance(tourComposeHelper);
        rememberedValue26 = composer.rememberedValue();
        if (!changedInstance18) {
        }
        rememberedValue26 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$53$lambda$52;
                invoke$lambda$53$lambda$52 = HomeFragment$initLayout$1.invoke$lambda$53$lambda$52(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$53$lambda$52;
            }
        };
        composer.updateRememberedValue(rememberedValue26);
        Function1 function1152 = (Function1) rememberedValue26;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance19 = composer.changedInstance(tourComposeHelper);
        rememberedValue27 = composer.rememberedValue();
        if (!changedInstance19) {
        }
        rememberedValue27 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$55$lambda$54;
                invoke$lambda$55$lambda$54 = HomeFragment$initLayout$1.invoke$lambda$55$lambda$54(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$55$lambda$54;
            }
        };
        composer.updateRememberedValue(rememberedValue27);
        Function1 function1162 = (Function1) rememberedValue27;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance20 = composer.changedInstance(tourComposeHelper);
        rememberedValue28 = composer.rememberedValue();
        if (!changedInstance20) {
        }
        rememberedValue28 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$57$lambda$56;
                invoke$lambda$57$lambda$56 = HomeFragment$initLayout$1.invoke$lambda$57$lambda$56(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$57$lambda$56;
            }
        };
        composer.updateRememberedValue(rememberedValue28);
        Function1 function1172 = (Function1) rememberedValue28;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance21 = composer.changedInstance(tourComposeHelper);
        rememberedValue29 = composer.rememberedValue();
        if (!changedInstance21) {
        }
        rememberedValue29 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$59$lambda$58;
                invoke$lambda$59$lambda$58 = HomeFragment$initLayout$1.invoke$lambda$59$lambda$58(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$59$lambda$58;
            }
        };
        composer.updateRememberedValue(rememberedValue29);
        Function1 function1182 = (Function1) rememberedValue29;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance22 = composer.changedInstance(tourComposeHelper);
        rememberedValue30 = composer.rememberedValue();
        if (!changedInstance22) {
        }
        rememberedValue30 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$61$lambda$60;
                invoke$lambda$61$lambda$60 = HomeFragment$initLayout$1.invoke$lambda$61$lambda$60(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$61$lambda$60;
            }
        };
        composer.updateRememberedValue(rememberedValue30);
        Function1 function1192 = (Function1) rememberedValue30;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance23 = composer.changedInstance(tourComposeHelper);
        rememberedValue31 = composer.rememberedValue();
        if (!changedInstance23) {
        }
        rememberedValue31 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$63$lambda$62;
                invoke$lambda$63$lambda$62 = HomeFragment$initLayout$1.invoke$lambda$63$lambda$62(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$63$lambda$62;
            }
        };
        composer.updateRememberedValue(rememberedValue31);
        Function1 function1202 = (Function1) rememberedValue31;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        changedInstance24 = composer.changedInstance(tourComposeHelper);
        rememberedValue32 = composer.rememberedValue();
        if (!changedInstance24) {
        }
        rememberedValue32 = new Function1() { // from class: org.betup.ui.fragment.home.HomeFragment$initLayout$1$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$65$lambda$64;
                invoke$lambda$65$lambda$64 = HomeFragment$initLayout$1.invoke$lambda$65$lambda$64(TourComposeHelper.this, (Rect) obj);
                return invoke$lambda$65$lambda$64;
            }
        };
        composer.updateRememberedValue(rememberedValue32);
        composer.endReplaceGroup();
        HomeScreenKt.HomeScreen(copy, booleanValue2, function09, function121, function122, function022, function032, function042, oddType2, function132, function142, function152, function22, function052, function062, rememberLazyListStateWithoutSavedState, tourStep2, z6, z, z5, function072, function082, function162, z72, function172, function182, function192, function1102, function1112, function1122, function1132, function1142, function1152, function1162, function1172, function1182, function1192, function1202, (Function1) rememberedValue32, invoke$lambda$22, null, composer, 0, 0, 0, 0, 0, 0, 512);
        if (ComposerKt.isTraceInProgress()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$31$lambda$30(TourState tourState) {
        return tourState != null && tourState.skipInvisibleHomeStepIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$33$lambda$32(TourState tourState) {
        if (tourState != null) {
            tourState.setHomeScrollComplete(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$35$lambda$34(TourState tourState, boolean z) {
        if (z) {
            if (tourState != null) {
                tourState.setHomeScrollComplete(true);
            }
        } else if ((tourState == null || !tourState.skipInvisibleHomeStepIfNeeded()) && tourState != null) {
            tourState.setHomeScrollComplete(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$55$lambda$54(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setHomeWinRateBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$57$lambda$56(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setHomeGlobalRankBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$59$lambda$58(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setHomeBestStreakBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$61$lambda$60(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setSpecialOfferBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$63$lambda$62(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setVideoRewardBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$65$lambda$64(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setDailyQuestsBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$37$lambda$36(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setCompetitionsButtonBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$39$lambda$38(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setBattlesButtonBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$41$lambda$40(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setMinigamesButtonBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$43$lambda$42(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setTopMatchesButtonBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$45$lambda$44(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setRankingButtonBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$49$lambda$48(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setFlashBetButtonBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$47$lambda$46(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setTvBetButtonBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$51$lambda$50(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setLiveArenaSectionBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$53$lambda$52(TourComposeHelper tourComposeHelper, Rect bounds) {
        Function1<? super Rect, Unit> function1;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (tourComposeHelper != null && (function1 = tourComposeHelper.setMoreMatchesSectionBounds) != null) {
            function1.invoke(bounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(HomeFragment homeFragment) {
        homeFragment.refreshAll(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(HomeFragment homeFragment, String questId) {
        Intrinsics.checkNotNullParameter(questId, "questId");
        HomeDailyQuestController homeDailyQuestController = homeFragment.getHomeDailyQuestController();
        UserService userService = homeFragment.getUserService();
        Intrinsics.checkNotNullExpressionValue(userService, "getUserService(...)");
        homeDailyQuestController.claim(questId, userService);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(HomeFragment homeFragment, DailyQuestTask task) {
        Intrinsics.checkNotNullParameter(task, "task");
        homeFragment.onDailyQuestTaskClicked(task);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12(HomeUiState homeUiState) {
        if (homeUiState.getBonusOfferActive()) {
            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.OFFERS, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$14(HomeFragment homeFragment) {
        homeFragment.getHomeVideoBonusController().onAdsButtonClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$16(HomeFragment homeFragment) {
        homeFragment.getHomeVideoBonusController().onAdsButtonLongClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$19$lambda$18(int i, HomeFragment homeFragment, long j) {
        HomeMatchBetController homeMatchBetController;
        homeMatchBetController = homeFragment.homeMatchBetController;
        if (homeMatchBetController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeMatchBetController");
            homeMatchBetController = null;
        }
        return homeMatchBetController.isBetSelected(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$21$lambda$20(int i, HomeFragment homeFragment, long j) {
        HomeMatchBetController homeMatchBetController;
        homeMatchBetController = homeFragment.homeMatchBetController;
        if (homeMatchBetController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeMatchBetController");
            homeMatchBetController = null;
        }
        return homeMatchBetController.isBetValidating(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$23$lambda$22(int i, HomeFragment homeFragment, HomeMatchOddUi odd) {
        HomeMatchBetController homeMatchBetController;
        Intrinsics.checkNotNullParameter(odd, "odd");
        homeMatchBetController = homeFragment.homeMatchBetController;
        if (homeMatchBetController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeMatchBetController");
            homeMatchBetController = null;
        }
        return homeMatchBetController.isBetLocked(odd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$24(HomeFragment homeFragment, long j, HomeMatchOddUi odd) {
        HomeMatchBetController homeMatchBetController;
        Intrinsics.checkNotNullParameter(odd, "odd");
        FragmentActivity activity = homeFragment.getActivity();
        HomeMatchBetController homeMatchBetController2 = null;
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        if (mainActivity == null) {
            return Unit.INSTANCE;
        }
        homeMatchBetController = homeFragment.homeMatchBetController;
        if (homeMatchBetController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeMatchBetController");
        } else {
            homeMatchBetController2 = homeMatchBetController;
        }
        homeMatchBetController2.onBetClick(mainActivity, j, odd);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$27$lambda$26(HomeFragment homeFragment) {
        homeFragment.loadMoreHomeMatches(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$29$lambda$28(HomeFragment homeFragment) {
        homeFragment.loadMoreHomeMatches(false);
        return Unit.INSTANCE;
    }

    private static final HomeDailyQuestUiState invoke$lambda$1(State<? extends HomeDailyQuestUiState> state) {
        return state.getValue();
    }

    private static final DailyBonusData invoke$lambda$2(State<DailyBonusData> state) {
        return state.getValue();
    }

    private static final HomeVideoBonusUiState invoke$lambda$3(State<HomeVideoBonusUiState> state) {
        return state.getValue();
    }
}
