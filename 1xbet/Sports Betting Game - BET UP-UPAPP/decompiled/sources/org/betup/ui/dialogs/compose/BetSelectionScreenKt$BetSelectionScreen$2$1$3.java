package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.HapticFeedbackType;
import org.betup.ui.common.compose.VideoRewardButtonKt;
import org.betup.ui.dialogs.controller.BattleBetSelectionState;
import org.betup.ui.dialogs.controller.BattleUserUi;
import org.betup.ui.dialogs.controller.BetSelectionController;

/* compiled from: BetSelectionScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BetSelectionScreenKt$BetSelectionScreen$2$1$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BattleBetSelectionState $battleState;
    final /* synthetic */ BetSelectionController $controller;

    BetSelectionScreenKt$BetSelectionScreen$2$1$3(BetSelectionController betSelectionController, BattleBetSelectionState battleBetSelectionState) {
        this.$controller = betSelectionController;
        this.$battleState = battleBetSelectionState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$6$lambda$5(BetSelectionController betSelectionController, State state) {
        if (!invoke$lambda$10$lambda$1(state)) {
            betSelectionController.createBattle();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7(BetSelectionController betSelectionController) {
        betSelectionController.onVideoRewardButtonClicked();
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String str;
        long j;
        String amount;
        Long longOrNull;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(99910109, i, -1, "org.betup.ui.dialogs.compose.BetSelectionScreen.<anonymous>.<anonymous>.<anonymous> (BetSelectionScreen.kt:83)");
        }
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), BattleFlowDimens.INSTANCE.m13144getActionPaddingHD9Ej5fM(), BattleFlowDimens.INSTANCE.m13145getActionPaddingVD9Ej5fM());
        Alignment center = Alignment.INSTANCE.getCenter();
        final BetSelectionController betSelectionController = this.$controller;
        BattleBetSelectionState battleBetSelectionState = this.$battleState;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN4);
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
        boolean z = !invoke$lambda$10$lambda$0(SnapshotStateKt.collectAsState(betSelectionController.getSelectedBetIds(), null, composer, 0, 1)).isEmpty();
        final State collectAsState = SnapshotStateKt.collectAsState(betSelectionController.isAcceptingBattle(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(betSelectionController.getBattleInfo(), null, composer, 0, 1);
        long moneyBalance = betSelectionController.getUserService().getShortProfile().getUserProgressModel().getMoneyBalance();
        BattleUserUi invoke$lambda$10$lambda$2 = invoke$lambda$10$lambda$2(collectAsState2);
        long longValue = (invoke$lambda$10$lambda$2 == null || (amount = invoke$lambda$10$lambda$2.getAmount()) == null || (longOrNull = StringsKt.toLongOrNull(amount)) == null) ? 0L : longOrNull.longValue();
        if (longValue > 0) {
            str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            j = longValue + ((long) (longValue * 0.05d));
        } else {
            str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            j = 0;
        }
        boolean z2 = j == 0 || moneyBalance >= j;
        State collectAsState3 = SnapshotStateKt.collectAsState(betSelectionController.isVideoRewardAvailable(), null, composer, 0, 1);
        State collectAsState4 = SnapshotStateKt.collectAsState(betSelectionController.getVideoRewardAmount(), null, composer, 0, 1);
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(BattleFlowDimens.INSTANCE.m13146getActionRowSpacingD9Ej5fM());
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically, composer, 54);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, str);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
        String stringResource = StringResources_androidKt.stringResource(battleBetSelectionState != null ? battleBetSelectionState.getButtonLabelIdP() : R.string.create, composer, 0);
        boolean invoke$lambda$10$lambda$1 = invoke$lambda$10$lambda$1(collectAsState);
        boolean z3 = !invoke$lambda$10$lambda$1(collectAsState);
        HapticFeedbackType hapticFeedbackType = HapticFeedbackType.Confirm;
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(collectAsState) | composer.changedInstance(betSelectionController);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.BetSelectionScreenKt$BetSelectionScreen$2$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$9$lambda$6$lambda$5;
                    invoke$lambda$10$lambda$9$lambda$6$lambda$5 = BetSelectionScreenKt$BetSelectionScreen$2$1$3.invoke$lambda$10$lambda$9$lambda$6$lambda$5(BetSelectionController.this, collectAsState);
                    return invoke$lambda$10$lambda$9$lambda$6$lambda$5;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        CommonButtonKt.m12915CommonButtonUPEs2M4(weight$default, z, stringResource, false, false, z3, (Function0) rememberedValue, false, false, false, invoke$lambda$10$lambda$1, false, null, null, false, false, null, null, null, null, hapticFeedbackType, composer, 3072, 0, 6, 1047440);
        composer.startReplaceGroup(-1759826900);
        if (!z2 && j > 0 && invoke$lambda$10$lambda$3(collectAsState3)) {
            boolean invoke$lambda$10$lambda$3 = invoke$lambda$10$lambda$3(collectAsState3);
            long invoke$lambda$10$lambda$4 = invoke$lambda$10$lambda$4(collectAsState4);
            composer.startReplaceGroup(5004770);
            boolean changedInstance = composer.changedInstance(betSelectionController);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.BetSelectionScreenKt$BetSelectionScreen$2$1$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7;
                        invoke$lambda$10$lambda$9$lambda$8$lambda$7 = BetSelectionScreenKt$BetSelectionScreen$2$1$3.invoke$lambda$10$lambda$9$lambda$8$lambda$7(BetSelectionController.this);
                        return invoke$lambda$10$lambda$9$lambda$8$lambda$7;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            VideoRewardButtonKt.VideoRewardButton(invoke$lambda$10$lambda$3, invoke$lambda$10$lambda$4, (Function0) rememberedValue2, null, composer, 0, 8);
        }
        composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    private static final Set<Long> invoke$lambda$10$lambda$0(State<? extends Set<Long>> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$10$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final BattleUserUi invoke$lambda$10$lambda$2(State<BattleUserUi> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$10$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final long invoke$lambda$10$lambda$4(State<Long> state) {
        return state.getValue().longValue();
    }
}
