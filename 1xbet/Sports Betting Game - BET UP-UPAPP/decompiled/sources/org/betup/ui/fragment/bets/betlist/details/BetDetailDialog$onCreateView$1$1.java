package org.betup.ui.fragment.bets.betlist.details;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.shop.CancelBetInfoModel;
import org.betup.model.remote.entity.shop.SellBetInfoModel;
import org.betup.ui.dialogs.QuestionDialog;
import org.betup.utils.FormatHelper;
import org.greenrobot.eventbus.EventBus;

/* compiled from: BetDetailDialog.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BetDetailDialog$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BetDetailDialog this$0;

    BetDetailDialog$onCreateView$1$1(BetDetailDialog betDetailDialog) {
        this.this$0 = betDetailDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Function0 function0;
        MutableStateFlow betList;
        int i2;
        boolean z;
        Function0 function02;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2120941427, i, -1, "org.betup.ui.fragment.bets.betlist.details.BetDetailDialog.onCreateView.<anonymous>.<anonymous> (BetDetailDialog.kt:66)");
        }
        function0 = this.this$0.customBetListProvider;
        if (function0 != null) {
            function02 = this.this$0.customBetListProvider;
            Intrinsics.checkNotNull(function02);
            betList = StateFlowKt.MutableStateFlow(function02.invoke());
        } else {
            betList = this.this$0.getBetController().getBetList();
        }
        StateFlow<List<BetsListModel>> stateFlow = betList;
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        i2 = this.this$0.selectedBetId;
        StateFlow<OddType> oddType = this.this$0.getBetController().getOddType();
        StateFlow<Boolean> isBonusAvailable = this.this$0.getBetController().isBonusAvailable();
        StateFlow<Long> videoRewardAmount = this.this$0.getBetController().getVideoRewardAmount();
        z = this.this$0.isViewingOtherUserBets;
        StateFlow<CancelBetInfoModel> cancelBetInfo = this.this$0.getBetController().getCancelBetInfo();
        StateFlow<SellBetInfoModel> sellBetInfo = this.this$0.getBetController().getSellBetInfo();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final BetDetailDialog betDetailDialog = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = BetDetailDialog$onCreateView$1$1.invoke$lambda$1$lambda$0(BetDetailDialog.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function03 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final BetDetailDialog betDetailDialog2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = BetDetailDialog$onCreateView$1$1.invoke$lambda$3$lambda$2(BetDetailDialog.this, ((Integer) obj).intValue());
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function1 function1 = (Function1) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final BetDetailDialog betDetailDialog3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$6$lambda$5;
                    invoke$lambda$6$lambda$5 = BetDetailDialog$onCreateView$1$1.invoke$lambda$6$lambda$5(BetDetailDialog.this, ((Integer) obj).intValue(), (MatchState) obj2);
                    return invoke$lambda$6$lambda$5;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function2 function2 = (Function2) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(this.this$0);
        final BetDetailDialog betDetailDialog4 = this.this$0;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = BetDetailDialog$onCreateView$1$1.invoke$lambda$8$lambda$7(BetDetailDialog.this, ((Integer) obj).intValue());
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function1 function12 = (Function1) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance5 = composer.changedInstance(this.this$0);
        final BetDetailDialog betDetailDialog5 = this.this$0;
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$13$lambda$12;
                    invoke$lambda$13$lambda$12 = BetDetailDialog$onCreateView$1$1.invoke$lambda$13$lambda$12(BetDetailDialog.this, ((Long) obj).longValue(), ((Long) obj2).longValue());
                    return invoke$lambda$13$lambda$12;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        Function2 function22 = (Function2) rememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance6 = composer.changedInstance(this.this$0);
        final BetDetailDialog betDetailDialog6 = this.this$0;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function3() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit invoke$lambda$18$lambda$17;
                    invoke$lambda$18$lambda$17 = BetDetailDialog$onCreateView$1$1.invoke$lambda$18$lambda$17(BetDetailDialog.this, ((Long) obj).longValue(), ((Long) obj2).longValue(), ((Double) obj3).doubleValue());
                    return invoke$lambda$18$lambda$17;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        Function3 function3 = (Function3) rememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance7 = composer.changedInstance(this.this$0);
        final BetDetailDialog betDetailDialog7 = this.this$0;
        Object rememberedValue7 = composer.rememberedValue();
        if (changedInstance7 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$20$lambda$19;
                    invoke$lambda$20$lambda$19 = BetDetailDialog$onCreateView$1$1.invoke$lambda$20$lambda$19(BetDetailDialog.this);
                    return invoke$lambda$20$lambda$19;
                }
            };
            composer.updateRememberedValue(rememberedValue7);
        }
        Function0 function04 = (Function0) rememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance8 = composer.changedInstance(this.this$0);
        final BetDetailDialog betDetailDialog8 = this.this$0;
        Object rememberedValue8 = composer.rememberedValue();
        if (changedInstance8 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Window invoke$lambda$22$lambda$21;
                    invoke$lambda$22$lambda$21 = BetDetailDialog$onCreateView$1$1.invoke$lambda$22$lambda$21(BetDetailDialog.this);
                    return invoke$lambda$22$lambda$21;
                }
            };
            composer.updateRememberedValue(rememberedValue8);
        }
        Function0 function05 = (Function0) rememberedValue8;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance9 = composer.changedInstance(this.this$0);
        final BetDetailDialog betDetailDialog9 = this.this$0;
        Object rememberedValue9 = composer.rememberedValue();
        if (changedInstance9 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            rememberedValue9 = new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$24$lambda$23;
                    invoke$lambda$24$lambda$23 = BetDetailDialog$onCreateView$1$1.invoke$lambda$24$lambda$23(BetDetailDialog.this, ((Long) obj).longValue(), (Function1) obj2);
                    return invoke$lambda$24$lambda$23;
                }
            };
            composer.updateRememberedValue(rememberedValue9);
        }
        composer.endReplaceGroup();
        BetListDetailsScreenKt.BetListDetailsScreen(fillMaxSize$default, stateFlow, function03, i2, oddType, function1, isBonusAvailable, videoRewardAmount, z, function2, function12, cancelBetInfo, sellBetInfo, function22, function3, function04, function05, (Function2) rememberedValue9, composer, 6, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Window invoke$lambda$22$lambda$21(BetDetailDialog betDetailDialog) {
        Dialog dialog = betDetailDialog.getDialog();
        if (dialog != null) {
            return dialog.getWindow();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$23(BetDetailDialog betDetailDialog, long j, Function1 cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        betDetailDialog.getBetController().fetchBetShareInstallLink(j, cb);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(BetDetailDialog betDetailDialog) {
        betDetailDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(BetDetailDialog betDetailDialog, int i) {
        betDetailDialog.getBetController().onVideoButtonClicked(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(BetDetailDialog betDetailDialog, int i, MatchState matchState) {
        Intrinsics.checkNotNullParameter(matchState, "matchState");
        Bundle bundle = new Bundle();
        bundle.putInt("matchId", i);
        bundle.putBoolean("isLive", matchState == MatchState.LIVE);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
        betDetailDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(BetDetailDialog betDetailDialog, int i) {
        boolean z;
        betDetailDialog.visibleBetId = i;
        z = betDetailDialog.isViewingOtherUserBets;
        if (!z) {
            betDetailDialog.getBetController().checkVideoRewardForBet(i);
            betDetailDialog.getBetController().fetchCancelSellInfo(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$20$lambda$19(BetDetailDialog betDetailDialog) {
        betDetailDialog.showSnackbar(R.string.sell_bet_not_available);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12(final BetDetailDialog betDetailDialog, final long j, long j2) {
        String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(j2);
        String str = betDetailDialog.getString(R.string.cancel_bet_offer) + "\n\n" + betDetailDialog.getString(R.string.you_will_receive_betcoins, shopBetcoinsFormated);
        QuestionDialog.Companion companion = QuestionDialog.INSTANCE;
        String string = betDetailDialog.getString(R.string.cancel_bet);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        QuestionDialog.Companion.newInstance$default(companion, string, str, new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$13$lambda$12$lambda$11;
                invoke$lambda$13$lambda$12$lambda$11 = BetDetailDialog$onCreateView$1$1.invoke$lambda$13$lambda$12$lambda$11(BetDetailDialog.this, j);
                return invoke$lambda$13$lambda$12$lambda$11;
            }
        }, null, 8, null).show(betDetailDialog.getChildFragmentManager(), "CancelBetConfirm");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$11(final BetDetailDialog betDetailDialog, final long j) {
        betDetailDialog.getBetController().cancelBet(j, new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$13$lambda$12$lambda$11$lambda$9;
                invoke$lambda$13$lambda$12$lambda$11$lambda$9 = BetDetailDialog$onCreateView$1$1.invoke$lambda$13$lambda$12$lambda$11$lambda$9(BetDetailDialog.this);
                return invoke$lambda$13$lambda$12$lambda$11$lambda$9;
            }
        }, new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10;
                invoke$lambda$13$lambda$12$lambda$11$lambda$10 = BetDetailDialog$onCreateView$1$1.invoke$lambda$13$lambda$12$lambda$11$lambda$10(BetDetailDialog.this, j, ((Integer) obj).intValue());
                return invoke$lambda$13$lambda$12$lambda$11$lambda$10;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$11$lambda$9(BetDetailDialog betDetailDialog) {
        betDetailDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10(BetDetailDialog betDetailDialog, long j, int i) {
        betDetailDialog.showSnackbar(i);
        betDetailDialog.getBetController().fetchCancelSellInfo(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17(final BetDetailDialog betDetailDialog, final long j, long j2, final double d) {
        SellBetInfoModel value = betDetailDialog.getBetController().getSellBetInfo().getValue();
        if (value == null || !value.isSellAvailable()) {
            betDetailDialog.showSnackbar(R.string.sell_bet_not_available);
        } else {
            String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(j2);
            String str = betDetailDialog.getString(R.string.sell_bet_offer) + "\n\n" + betDetailDialog.getString(R.string.you_will_receive_betcoins, shopBetcoinsFormated);
            QuestionDialog.Companion companion = QuestionDialog.INSTANCE;
            String string = betDetailDialog.getString(R.string.sell_bet);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            QuestionDialog.Companion.newInstance$default(companion, string, str, new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$18$lambda$17$lambda$16;
                    invoke$lambda$18$lambda$17$lambda$16 = BetDetailDialog$onCreateView$1$1.invoke$lambda$18$lambda$17$lambda$16(BetDetailDialog.this, j, d);
                    return invoke$lambda$18$lambda$17$lambda$16;
                }
            }, null, 8, null).show(betDetailDialog.getChildFragmentManager(), "SellBetConfirm");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17$lambda$16(final BetDetailDialog betDetailDialog, final long j, double d) {
        betDetailDialog.getBetController().sellBet(j, d, new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$18$lambda$17$lambda$16$lambda$14;
                invoke$lambda$18$lambda$17$lambda$16$lambda$14 = BetDetailDialog$onCreateView$1$1.invoke$lambda$18$lambda$17$lambda$16$lambda$14(BetDetailDialog.this);
                return invoke$lambda$18$lambda$17$lambda$16$lambda$14;
            }
        }, new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$onCreateView$1$1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$18$lambda$17$lambda$16$lambda$15;
                invoke$lambda$18$lambda$17$lambda$16$lambda$15 = BetDetailDialog$onCreateView$1$1.invoke$lambda$18$lambda$17$lambda$16$lambda$15(BetDetailDialog.this, j, ((Integer) obj).intValue());
                return invoke$lambda$18$lambda$17$lambda$16$lambda$15;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17$lambda$16$lambda$14(BetDetailDialog betDetailDialog) {
        betDetailDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17$lambda$16$lambda$15(BetDetailDialog betDetailDialog, long j, int i) {
        betDetailDialog.showSnackbar(i);
        betDetailDialog.getBetController().fetchCancelSellInfo(j);
        return Unit.INSTANCE;
    }
}
