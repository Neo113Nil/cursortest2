package org.betup.ui.fragment.flashbet;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: FlashBetAbandonedSessionDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlashBetAbandonedSessionDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ FlashBetAbandonedSessionDialogFragment this$0;

    FlashBetAbandonedSessionDialogFragment$onCreateView$1$1(FlashBetAbandonedSessionDialogFragment flashBetAbandonedSessionDialogFragment) {
        this.this$0 = flashBetAbandonedSessionDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(FlashBetAbandonedSessionDialogFragment flashBetAbandonedSessionDialogFragment) {
        if (flashBetAbandonedSessionDialogFragment.isAdded()) {
            flashBetAbandonedSessionDialogFragment.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        StateFlow stateFlow;
        StateFlow stateFlow2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-853230555, i, -1, "org.betup.ui.fragment.flashbet.FlashBetAbandonedSessionDialogFragment.onCreateView.<anonymous>.<anonymous> (FlashBetAbandonedSessionDialogFragment.kt:73)");
        }
        stateFlow = this.this$0.session;
        State collectAsState = SnapshotStateKt.collectAsState(stateFlow, null, composer, 0, 1);
        stateFlow2 = this.this$0.loading;
        State collectAsState2 = SnapshotStateKt.collectAsState(stateFlow2, null, composer, 0, 1);
        if (invoke$lambda$0(collectAsState) != null) {
            composer.startReplaceGroup(-974844765);
            FlashBetGameSessionDto invoke$lambda$0 = invoke$lambda$0(collectAsState);
            Intrinsics.checkNotNull(invoke$lambda$0);
            composer.startReplaceGroup(5004770);
            boolean changedInstance = composer.changedInstance(this.this$0);
            final FlashBetAbandonedSessionDialogFragment flashBetAbandonedSessionDialogFragment = this.this$0;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetAbandonedSessionDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$3$lambda$2;
                        invoke$lambda$3$lambda$2 = FlashBetAbandonedSessionDialogFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(FlashBetAbandonedSessionDialogFragment.this);
                        return invoke$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            FlashBetDetailsDialogKt.FlashBetAbandonedSessionContent(invoke$lambda$0, (Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else if (invoke$lambda$1(collectAsState2)) {
            composer.startReplaceGroup(-974575003);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
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
            ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, composer, 0, 29);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-974297770);
            composer.endReplaceGroup();
            if (this.this$0.isAdded()) {
                this.this$0.dismissAllowingStateLoss();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    private static final FlashBetGameSessionDto invoke$lambda$0(State<FlashBetGameSessionDto> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
