package org.betup.ui.fragment.bets.sheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.R;
import org.betup.bus.QuestionDialogMessage;
import org.betup.model.local.entity.OddType;
import org.betup.ui.MainActivity;
import org.betup.ui.fragment.bets.BattleCreateResult;
import org.betup.ui.fragment.bets.BattleOpponent;
import org.betup.ui.fragment.bets.PlaceBetResult;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.ui.tour.compose.TourState;
import org.betup.ui.tour.compose.TourStep;
import org.greenrobot.eventbus.EventBus;

/* compiled from: BettingSheetDialog.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BettingSheetDialog$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BettingSheetDialog this$0;

    BettingSheetDialog$onCreateView$1$1(BettingSheetDialog bettingSheetDialog) {
        this.this$0 = bettingSheetDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$4$lambda$3$lambda$2() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        TourComposeHelper tourComposeHelper;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2042577907, i, -1, "org.betup.ui.fragment.bets.sheet.BettingSheetDialog.onCreateView.<anonymous>.<anonymous> (BettingSheetDialog.kt:66)");
        }
        FragmentActivity requireActivity = this.this$0.requireActivity();
        MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
        TourState tourState = (mainActivity == null || (tourComposeHelper = mainActivity.tourComposeHelper) == null) ? null : tourComposeHelper.getTourState();
        boolean z = false;
        boolean isTourActive = tourState != null ? tourState.isTourActive() : false;
        TourStep currentStep = tourState != null ? tourState.getCurrentStep() : null;
        if (isTourActive && currentStep == TourStep.PLACE_BET) {
            z = true;
        }
        boolean z2 = z;
        Boolean valueOf = Boolean.valueOf(isTourActive);
        Boolean valueOf2 = Boolean.valueOf(z2);
        composer.startReplaceGroup(-1746271574);
        boolean changed = composer.changed(currentStep != null ? currentStep.ordinal() : -1) | composer.changed(isTourActive) | composer.changed(z2);
        BettingSheetDialog$onCreateView$1$1$1$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new BettingSheetDialog$onCreateView$1$1$1$1(isTourActive, currentStep, z2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf, currentStep, valueOf2, (Function2) rememberedValue, composer, 0);
        StateFlow<BattleOpponent> battleOpponent = this.this$0.getBetsSlipController().getBattleOpponent();
        StateFlow<PlaceBetResult> placeBetResult = this.this$0.getBetsSlipController().getPlaceBetResult();
        StateFlow<BattleCreateResult> battleCreateResult = this.this$0.getBetsSlipController().getBattleCreateResult();
        StateFlow<Long> amount = this.this$0.getBetsSlipController().getAmount();
        StateFlow<Boolean> isLoadingQickBetInfo = this.this$0.getBetsSlipController().isLoadingQickBetInfo();
        StateFlow<List<BetModel>> betsModel = this.this$0.getBetsSlipController().getBetsModel();
        StateFlow<Long> userAmountFlow = this.this$0.getBetsSlipController().getUserAmountFlow();
        StateFlow<OddType> oddType = this.this$0.getBetsSlipController().getOddType();
        StateFlow<Long> highScore = this.this$0.getBetsSlipController().getHighScore();
        StateFlow<Boolean> isFirstBetAvailable = this.this$0.getBetsSlipController().isFirstBetAvailable();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final BettingSheetDialog bettingSheetDialog = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = BettingSheetDialog$onCreateView$1$1.invoke$lambda$4$lambda$3(BettingSheetDialog.this);
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function0 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final BettingSheetDialog bettingSheetDialog2 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$6$lambda$5;
                    invoke$lambda$6$lambda$5 = BettingSheetDialog$onCreateView$1$1.invoke$lambda$6$lambda$5(BettingSheetDialog.this);
                    return invoke$lambda$6$lambda$5;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function0 function02 = (Function0) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final BettingSheetDialog bettingSheetDialog3 = this.this$0;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = BettingSheetDialog$onCreateView$1$1.invoke$lambda$8$lambda$7(BettingSheetDialog.this);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function0 function03 = (Function0) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(this.this$0);
        final BettingSheetDialog bettingSheetDialog4 = this.this$0;
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$9;
                    invoke$lambda$10$lambda$9 = BettingSheetDialog$onCreateView$1$1.invoke$lambda$10$lambda$9(BettingSheetDialog.this);
                    return invoke$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        Function0 function04 = (Function0) rememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance5 = composer.changedInstance(this.this$0);
        final BettingSheetDialog bettingSheetDialog5 = this.this$0;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance5 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$12$lambda$11;
                    invoke$lambda$12$lambda$11 = BettingSheetDialog$onCreateView$1$1.invoke$lambda$12$lambda$11(BettingSheetDialog.this);
                    return invoke$lambda$12$lambda$11;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        Function0 function05 = (Function0) rememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance6 = composer.changedInstance(this.this$0);
        final BettingSheetDialog bettingSheetDialog6 = this.this$0;
        Object rememberedValue7 = composer.rememberedValue();
        if (changedInstance6 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$14$lambda$13;
                    invoke$lambda$14$lambda$13 = BettingSheetDialog$onCreateView$1$1.invoke$lambda$14$lambda$13(BettingSheetDialog.this, ((Long) obj).longValue());
                    return invoke$lambda$14$lambda$13;
                }
            };
            composer.updateRememberedValue(rememberedValue7);
        }
        Function1 function1 = (Function1) rememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance7 = composer.changedInstance(this.this$0);
        final BettingSheetDialog bettingSheetDialog7 = this.this$0;
        Object rememberedValue8 = composer.rememberedValue();
        if (changedInstance7 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$16$lambda$15;
                    invoke$lambda$16$lambda$15 = BettingSheetDialog$onCreateView$1$1.invoke$lambda$16$lambda$15(BettingSheetDialog.this);
                    return invoke$lambda$16$lambda$15;
                }
            };
            composer.updateRememberedValue(rememberedValue8);
        }
        Function0 function06 = (Function0) rememberedValue8;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance8 = composer.changedInstance(this.this$0);
        final BettingSheetDialog bettingSheetDialog8 = this.this$0;
        Object rememberedValue9 = composer.rememberedValue();
        if (changedInstance8 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            rememberedValue9 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$18$lambda$17;
                    invoke$lambda$18$lambda$17 = BettingSheetDialog$onCreateView$1$1.invoke$lambda$18$lambda$17(BettingSheetDialog.this);
                    return invoke$lambda$18$lambda$17;
                }
            };
            composer.updateRememberedValue(rememberedValue9);
        }
        Function0 function07 = (Function0) rememberedValue9;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance9 = composer.changedInstance(this.this$0);
        final BettingSheetDialog bettingSheetDialog9 = this.this$0;
        Object rememberedValue10 = composer.rememberedValue();
        if (changedInstance9 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
            rememberedValue10 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    long invoke$lambda$20$lambda$19;
                    invoke$lambda$20$lambda$19 = BettingSheetDialog$onCreateView$1$1.invoke$lambda$20$lambda$19(BettingSheetDialog.this);
                    return Long.valueOf(invoke$lambda$20$lambda$19);
                }
            };
            composer.updateRememberedValue(rememberedValue10);
        }
        Function0 function08 = (Function0) rememberedValue10;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance10 = composer.changedInstance(this.this$0);
        final BettingSheetDialog bettingSheetDialog10 = this.this$0;
        Object rememberedValue11 = composer.rememberedValue();
        if (changedInstance10 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
            rememberedValue11 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$22$lambda$21;
                    invoke$lambda$22$lambda$21 = BettingSheetDialog$onCreateView$1$1.invoke$lambda$22$lambda$21(BettingSheetDialog.this);
                    return invoke$lambda$22$lambda$21;
                }
            };
            composer.updateRememberedValue(rememberedValue11);
        }
        Function0 function09 = (Function0) rememberedValue11;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance11 = composer.changedInstance(this.this$0);
        final BettingSheetDialog bettingSheetDialog11 = this.this$0;
        Object rememberedValue12 = composer.rememberedValue();
        if (changedInstance11 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
            rememberedValue12 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$24$lambda$23;
                    invoke$lambda$24$lambda$23 = BettingSheetDialog$onCreateView$1$1.invoke$lambda$24$lambda$23(BettingSheetDialog.this);
                    return invoke$lambda$24$lambda$23;
                }
            };
            composer.updateRememberedValue(rememberedValue12);
        }
        Function0 function010 = (Function0) rememberedValue12;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance12 = composer.changedInstance(this.this$0);
        final BettingSheetDialog bettingSheetDialog12 = this.this$0;
        Object rememberedValue13 = composer.rememberedValue();
        if (changedInstance12 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
            rememberedValue13 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$26$lambda$25;
                    invoke$lambda$26$lambda$25 = BettingSheetDialog$onCreateView$1$1.invoke$lambda$26$lambda$25(BettingSheetDialog.this);
                    return invoke$lambda$26$lambda$25;
                }
            };
            composer.updateRememberedValue(rememberedValue13);
        }
        composer.endReplaceGroup();
        BettingSheetScreenKt.BettingSheetScreen(null, function0, function02, function03, function04, function05, function1, function06, function07, amount, userAmountFlow, isLoadingQickBetInfo, betsModel, oddType, highScore, isFirstBetAvailable, function08, function09, battleOpponent, placeBetResult, function010, battleCreateResult, (Function0) rememberedValue13, z2, tourState, composer, 0, 0, 0, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17(BettingSheetDialog bettingSheetDialog) {
        bettingSheetDialog.getBetsSlipController().forceRefreshBetDataSilent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(final BettingSheetDialog bettingSheetDialog) {
        EventBus.getDefault().post(new QuestionDialogMessage(bettingSheetDialog.getString(R.string.close_bet_confirmation), new Runnable() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BettingSheetDialog$onCreateView$1$1.invoke$lambda$4$lambda$3$lambda$1(BettingSheetDialog.this);
            }
        }, new Runnable() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$onCreateView$1$1$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                BettingSheetDialog$onCreateView$1$1.invoke$lambda$4$lambda$3$lambda$2();
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$4$lambda$3$lambda$1(BettingSheetDialog bettingSheetDialog) {
        bettingSheetDialog.getBetsSlipController().removeAllBetsFromSlip();
        bettingSheetDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(BettingSheetDialog bettingSheetDialog) {
        bettingSheetDialog.getBetsSlipController().onSettingsClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(BettingSheetDialog bettingSheetDialog) {
        bettingSheetDialog.getBetsSlipController().challengeClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$22$lambda$21(BettingSheetDialog bettingSheetDialog) {
        bettingSheetDialog.getBetsSlipController().inviteUserToBattleClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9(BettingSheetDialog bettingSheetDialog) {
        bettingSheetDialog.getBetsSlipController().onPlaceClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$23(BettingSheetDialog bettingSheetDialog) {
        bettingSheetDialog.getBetsSlipController().clearPlaceBetResult();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$26$lambda$25(BettingSheetDialog bettingSheetDialog) {
        bettingSheetDialog.getBetsSlipController().clearBattleCreateResult();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(BettingSheetDialog bettingSheetDialog) {
        bettingSheetDialog.getBetsSlipController().buyBetcoinsInternal();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13(BettingSheetDialog bettingSheetDialog, long j) {
        bettingSheetDialog.getBetsSlipController().onAmountChange(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$15(BettingSheetDialog bettingSheetDialog) {
        bettingSheetDialog.getBetsSlipController().removeAllBetsClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$20$lambda$19(BettingSheetDialog bettingSheetDialog) {
        return bettingSheetDialog.getBetsSlipController().getEffectiveMinBetSize();
    }
}
