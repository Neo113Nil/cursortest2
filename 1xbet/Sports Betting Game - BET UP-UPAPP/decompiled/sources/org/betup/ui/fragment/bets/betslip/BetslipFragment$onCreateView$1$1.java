package org.betup.ui.fragment.bets.betslip;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.bus.NavigateMessage;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.ui.fragment.bets.betslip.compose.BetSlipUiModel;
import org.betup.ui.fragment.bets.betslip.compose.BetSlipUiScreenKt;
import org.greenrobot.eventbus.EventBus;

/* compiled from: BetslipFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BetslipFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BetslipFragment this$0;

    BetslipFragment$onCreateView$1$1(BetslipFragment betslipFragment) {
        this.this$0 = betslipFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$5$lambda$4(BetslipFragment betslipFragment, long j) {
        betslipFragment.getBetsController().onAmountChange(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$7$lambda$6(BetslipFragment betslipFragment) {
        betslipFragment.getBetsController().onSettingsClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$1$lambda$0(BetslipFragment betslipFragment) {
        betslipFragment.getBetsController().onPlaceClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$3$lambda$2(BetslipFragment betslipFragment) {
        betslipFragment.getBetsController().buyBetcoinsInternal();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$9$lambda$8(BetslipFragment betslipFragment, int i, MatchState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        betslipFragment.getBetsController().goToMatch(i, state);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$11$lambda$10(BetslipFragment betslipFragment, long j) {
        betslipFragment.getBetsController().singleBetRemoved(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13$lambda$12() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.TOP_MATCHES, null));
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1910804333, i, -1, "org.betup.ui.fragment.bets.betslip.BetslipFragment.onCreateView.<anonymous>.<anonymous> (BetslipFragment.kt:47)");
        }
        Alignment center = Alignment.INSTANCE.getCenter();
        final BetslipFragment betslipFragment = this.this$0;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        StateFlow<Long> amount = betslipFragment.getBetsController().getAmount();
        StateFlow<Boolean> isLoadingBetSlip = betslipFragment.getBetsController().isLoadingBetSlip();
        StateFlow<List<BetSlipUiModel>> betsUiModel = betslipFragment.getBetsController().getBetsUiModel();
        StateFlow<Long> userAmountFlow = betslipFragment.getBetsController().getUserAmountFlow();
        StateFlow<OddType> oddType = betslipFragment.getBetsController().getOddType();
        StateFlow<Long> highScore = betslipFragment.getBetsController().getHighScore();
        StateFlow<Double> totalCoefficientFlow = betslipFragment.getBetsController().getTotalCoefficientFlow();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(betslipFragment);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.BetslipFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$14$lambda$1$lambda$0;
                    invoke$lambda$14$lambda$1$lambda$0 = BetslipFragment$onCreateView$1$1.invoke$lambda$14$lambda$1$lambda$0(BetslipFragment.this);
                    return invoke$lambda$14$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(betslipFragment);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.BetslipFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$14$lambda$3$lambda$2;
                    invoke$lambda$14$lambda$3$lambda$2 = BetslipFragment$onCreateView$1$1.invoke$lambda$14$lambda$3$lambda$2(BetslipFragment.this);
                    return invoke$lambda$14$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(betslipFragment);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.bets.betslip.BetslipFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$14$lambda$5$lambda$4;
                    invoke$lambda$14$lambda$5$lambda$4 = BetslipFragment$onCreateView$1$1.invoke$lambda$14$lambda$5$lambda$4(BetslipFragment.this, ((Long) obj).longValue());
                    return invoke$lambda$14$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function1 function1 = (Function1) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(betslipFragment);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.BetslipFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$14$lambda$7$lambda$6;
                    invoke$lambda$14$lambda$7$lambda$6 = BetslipFragment$onCreateView$1$1.invoke$lambda$14$lambda$7$lambda$6(BetslipFragment.this);
                    return invoke$lambda$14$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function0 function03 = (Function0) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance5 = composer.changedInstance(betslipFragment);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function2() { // from class: org.betup.ui.fragment.bets.betslip.BetslipFragment$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$14$lambda$9$lambda$8;
                    invoke$lambda$14$lambda$9$lambda$8 = BetslipFragment$onCreateView$1$1.invoke$lambda$14$lambda$9$lambda$8(BetslipFragment.this, ((Integer) obj).intValue(), (MatchState) obj2);
                    return invoke$lambda$14$lambda$9$lambda$8;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        Function2 function2 = (Function2) rememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance6 = composer.changedInstance(betslipFragment);
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.bets.betslip.BetslipFragment$onCreateView$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$14$lambda$11$lambda$10;
                    invoke$lambda$14$lambda$11$lambda$10 = BetslipFragment$onCreateView$1$1.invoke$lambda$14$lambda$11$lambda$10(BetslipFragment.this, ((Long) obj).longValue());
                    return invoke$lambda$14$lambda$11$lambda$10;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        Function1 function12 = (Function1) rememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue7 = composer.rememberedValue();
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.BetslipFragment$onCreateView$1$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$14$lambda$13$lambda$12;
                    invoke$lambda$14$lambda$13$lambda$12 = BetslipFragment$onCreateView$1$1.invoke$lambda$14$lambda$13$lambda$12();
                    return invoke$lambda$14$lambda$13$lambda$12;
                }
            };
            composer.updateRememberedValue(rememberedValue7);
        }
        composer.endReplaceGroup();
        BetSlipUiScreenKt.BetSlipUiScreen(function0, function02, function1, function03, function2, function12, (Function0) rememberedValue7, amount, userAmountFlow, isLoadingBetSlip, betsUiModel, oddType, highScore, totalCoefficientFlow, composer, 1572864, 0, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
