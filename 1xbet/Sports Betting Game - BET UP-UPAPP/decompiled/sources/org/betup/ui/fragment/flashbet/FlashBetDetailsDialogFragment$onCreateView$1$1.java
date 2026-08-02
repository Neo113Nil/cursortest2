package org.betup.ui.fragment.flashbet;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogKt;
import org.betup.ui.fragment.flashbet.compose.FlashBetDetailsDialogState;
import org.betup.ui.views.ComposeUtils;

/* compiled from: FlashBetDetailsDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlashBetDetailsDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $sessionId;
    final /* synthetic */ FlashBetDetailsDialogFragment this$0;

    /* compiled from: FlashBetDetailsDialogFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlashBetDetailsDialogState.values().length];
            try {
                iArr[FlashBetDetailsDialogState.Preview.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlashBetDetailsDialogState.Results.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlashBetDetailsDialogState.Waiting.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    FlashBetDetailsDialogFragment$onCreateView$1$1(FlashBetDetailsDialogFragment flashBetDetailsDialogFragment, String str) {
        this.this$0 = flashBetDetailsDialogFragment;
        this.$sessionId = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$5$lambda$4(FlashBetDetailsDialogFragment flashBetDetailsDialogFragment) {
        flashBetDetailsDialogFragment.dismissWithResult();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$6(FlashBetDetailsDialogFragment flashBetDetailsDialogFragment, String str, State state) {
        MutableStateFlow mutableStateFlow;
        int i = WhenMappings.$EnumSwitchMapping$0[invoke$lambda$1(state).ordinal()];
        if (i == 1) {
            mutableStateFlow = flashBetDetailsDialogFragment._dialogState;
            mutableStateFlow.setValue(FlashBetDetailsDialogState.Waiting);
            flashBetDetailsDialogFragment.loadSession(str);
        } else if (i == 2) {
            flashBetDetailsDialogFragment.dismissWithResult();
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        StateFlow stateFlow;
        StateFlow stateFlow2;
        StateFlow stateFlow3;
        boolean showCollectForFinishedSession;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1116622329, i, -1, "org.betup.ui.fragment.flashbet.FlashBetDetailsDialogFragment.onCreateView.<anonymous>.<anonymous> (FlashBetDetailsDialogFragment.kt:129)");
        }
        stateFlow = this.this$0.session;
        State collectAsState = SnapshotStateKt.collectAsState(stateFlow, null, composer, 0, 1);
        stateFlow2 = this.this$0.dialogState;
        final State collectAsState2 = SnapshotStateKt.collectAsState(stateFlow2, null, composer, 0, 1);
        stateFlow3 = this.this$0.loading;
        State collectAsState3 = SnapshotStateKt.collectAsState(stateFlow3, null, composer, 0, 1);
        if (invoke$lambda$0(collectAsState) == null && invoke$lambda$2(collectAsState3)) {
            composer.startReplaceGroup(774342357);
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
        } else if (invoke$lambda$0(collectAsState) != null) {
            composer.startReplaceGroup(774715628);
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final FlashBetDetailsDialogFragment flashBetDetailsDialogFragment = this.this$0;
            final String str = this.$sessionId;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            FlashBetGameSessionDto invoke$lambda$0 = invoke$lambda$0(collectAsState);
            Intrinsics.checkNotNull(invoke$lambda$0);
            FlashBetDetailsDialogState invoke$lambda$1 = invoke$lambda$1(collectAsState2);
            composer.startReplaceGroup(5004770);
            boolean changedInstance = composer.changedInstance(flashBetDetailsDialogFragment);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetDetailsDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$8$lambda$5$lambda$4;
                        invoke$lambda$8$lambda$5$lambda$4 = FlashBetDetailsDialogFragment$onCreateView$1$1.invoke$lambda$8$lambda$5$lambda$4(FlashBetDetailsDialogFragment.this);
                        return invoke$lambda$8$lambda$5$lambda$4;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean changed = composer.changed(collectAsState2) | composer.changedInstance(flashBetDetailsDialogFragment) | composer.changed(str);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetDetailsDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$8$lambda$7$lambda$6;
                        invoke$lambda$8$lambda$7$lambda$6 = FlashBetDetailsDialogFragment$onCreateView$1$1.invoke$lambda$8$lambda$7$lambda$6(FlashBetDetailsDialogFragment.this, str, collectAsState2);
                        return invoke$lambda$8$lambda$7$lambda$6;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Function0 function02 = (Function0) rememberedValue2;
            composer.endReplaceGroup();
            boolean z = invoke$lambda$2(collectAsState3) && invoke$lambda$1(collectAsState2) == FlashBetDetailsDialogState.Waiting;
            showCollectForFinishedSession = flashBetDetailsDialogFragment.showCollectForFinishedSession();
            FlashBetDetailsDialogKt.FlashBetDetailsDialog(invoke$lambda$0, invoke$lambda$1, function0, function02, z, showCollectForFinishedSession, composer, 0, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(776065833);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    private static final FlashBetGameSessionDto invoke$lambda$0(State<FlashBetGameSessionDto> state) {
        return state.getValue();
    }

    private static final FlashBetDetailsDialogState invoke$lambda$1(State<? extends FlashBetDetailsDialogState> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
