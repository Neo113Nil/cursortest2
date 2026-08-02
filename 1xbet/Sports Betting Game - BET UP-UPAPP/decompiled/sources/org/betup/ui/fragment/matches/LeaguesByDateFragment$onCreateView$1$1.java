package org.betup.ui.fragment.matches;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.fragment.matches.compose.DateSelectorElementKt;
import org.betup.ui.fragment.matches.compose.PagingListScreenKt;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;

/* compiled from: LeaguesByDateFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class LeaguesByDateFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ LeaguesByDateFragment this$0;

    LeaguesByDateFragment$onCreateView$1$1(LeaguesByDateFragment leaguesByDateFragment) {
        this.this$0 = leaguesByDateFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$10(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$16$lambda$15(LeaguesByDateFragment leaguesByDateFragment, String newDate) {
        Intrinsics.checkNotNullParameter(newDate, "newDate");
        leaguesByDateFragment.getController().performDateChange(newDate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$18$lambda$17(LeaguesByDateFragment leaguesByDateFragment) {
        boolean z;
        z = leaguesByDateFragment.isSearchExpanded;
        if (z) {
            leaguesByDateFragment.getController().resetSearchState();
            leaguesByDateFragment.isSearchExpanded = false;
        } else {
            leaguesByDateFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$20$lambda$19(LeaguesByDateFragment leaguesByDateFragment, SportListItemUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        leaguesByDateFragment.getController().onAddFavoriteLeague(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$22$lambda$21(LeaguesByDateFragment leaguesByDateFragment, SportListItemUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        leaguesByDateFragment.getController().onDeleteFavoriteLeague(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$24$lambda$23(LeaguesByDateFragment leaguesByDateFragment, boolean z) {
        leaguesByDateFragment.isSearchExpanded = z;
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Object now;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1776939163, i, -1, "org.betup.ui.fragment.matches.LeaguesByDateFragment.onCreateView.<anonymous>.<anonymous> (LeaguesByDateFragment.kt:61)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getDateFilterState().getSelectedDate(), null, composer, 0, 1);
        LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, composer, 0, 3);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.getController().getItems(), null, composer, 0, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(this.this$0.getController().isLoading(), null, composer, 0, 1);
        State collectAsState4 = SnapshotStateKt.collectAsState(this.this$0.getController().isLoadingMore(), null, composer, 0, 1);
        State collectAsState5 = SnapshotStateKt.collectAsState(this.this$0.getController().getError(), null, composer, 0, 1);
        State collectAsState6 = SnapshotStateKt.collectAsState(this.this$0.getController().getQuery(), null, composer, 0, 1);
        State collectAsState7 = SnapshotStateKt.collectAsState(this.this$0.getController().getHasMore(), null, composer, 0, 1);
        Object invoke$lambda$0 = invoke$lambda$0(collectAsState);
        composer.startReplaceGroup(5004770);
        boolean changed = composer.changed(invoke$lambda$0);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            try {
                now = LocalDate.parse(invoke$lambda$0(collectAsState));
            } catch (Exception unused) {
                now = LocalDate.now();
            }
            rememberedValue = now;
            composer.updateRememberedValue(rememberedValue);
        }
        LocalDate localDate = (LocalDate) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) rememberedValue3;
        composer.endReplaceGroup();
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        Unit unit = Unit.INSTANCE;
        composer.startReplaceGroup(-1224400529);
        boolean changedInstance = composer.changedInstance(localDate) | composer.changedInstance(this.this$0);
        LeaguesByDateFragment leaguesByDateFragment = this.this$0;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = (PointerInputEventHandler) new LeaguesByDateFragment$onCreateView$1$1$1$1(mutableState, mutableState2, localDate, leaguesByDateFragment);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(fillMaxSize$default, unit, (PointerInputEventHandler) rememberedValue4);
        final LeaguesByDateFragment leaguesByDateFragment2 = this.this$0;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, pointerInput);
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
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        String invoke$lambda$02 = invoke$lambda$0(collectAsState);
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(leaguesByDateFragment2);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function1() { // from class: org.betup.ui.fragment.matches.LeaguesByDateFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$25$lambda$16$lambda$15;
                    invoke$lambda$25$lambda$16$lambda$15 = LeaguesByDateFragment$onCreateView$1$1.invoke$lambda$25$lambda$16$lambda$15(LeaguesByDateFragment.this, (String) obj);
                    return invoke$lambda$25$lambda$16$lambda$15;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        DateSelectorElementKt.DateSelectorElement(invoke$lambda$02, (Function1) rememberedValue5, PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(8)), rememberLazyListStateWithoutSavedState, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
        LeaguesByDateController controller = leaguesByDateFragment2.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(leaguesByDateFragment2);
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.matches.LeaguesByDateFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$25$lambda$18$lambda$17;
                    invoke$lambda$25$lambda$18$lambda$17 = LeaguesByDateFragment$onCreateView$1$1.invoke$lambda$25$lambda$18$lambda$17(LeaguesByDateFragment.this);
                    return invoke$lambda$25$lambda$18$lambda$17;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        Function0 function0 = (Function0) rememberedValue6;
        composer.endReplaceGroup();
        List<SportListItemUiModel> invoke$lambda$1 = invoke$lambda$1(collectAsState2);
        boolean invoke$lambda$2 = invoke$lambda$2(collectAsState3);
        String invoke$lambda$4 = invoke$lambda$4(collectAsState5);
        boolean invoke$lambda$6 = invoke$lambda$6(collectAsState7);
        boolean invoke$lambda$3 = invoke$lambda$3(collectAsState4);
        String invoke$lambda$5 = invoke$lambda$5(collectAsState6);
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(leaguesByDateFragment2);
        Object rememberedValue7 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.matches.LeaguesByDateFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$25$lambda$20$lambda$19;
                    invoke$lambda$25$lambda$20$lambda$19 = LeaguesByDateFragment$onCreateView$1$1.invoke$lambda$25$lambda$20$lambda$19(LeaguesByDateFragment.this, (SportListItemUiModel) obj);
                    return invoke$lambda$25$lambda$20$lambda$19;
                }
            };
            composer.updateRememberedValue(rememberedValue7);
        }
        Function1 function1 = (Function1) rememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance5 = composer.changedInstance(leaguesByDateFragment2);
        Object rememberedValue8 = composer.rememberedValue();
        if (changedInstance5 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = new Function1() { // from class: org.betup.ui.fragment.matches.LeaguesByDateFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$25$lambda$22$lambda$21;
                    invoke$lambda$25$lambda$22$lambda$21 = LeaguesByDateFragment$onCreateView$1$1.invoke$lambda$25$lambda$22$lambda$21(LeaguesByDateFragment.this, (SportListItemUiModel) obj);
                    return invoke$lambda$25$lambda$22$lambda$21;
                }
            };
            composer.updateRememberedValue(rememberedValue8);
        }
        Function1 function12 = (Function1) rememberedValue8;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance6 = composer.changedInstance(leaguesByDateFragment2);
        Object rememberedValue9 = composer.rememberedValue();
        if (changedInstance6 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.matches.LeaguesByDateFragment$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$25$lambda$24$lambda$23;
                    invoke$lambda$25$lambda$24$lambda$23 = LeaguesByDateFragment$onCreateView$1$1.invoke$lambda$25$lambda$24$lambda$23(LeaguesByDateFragment.this, ((Boolean) obj).booleanValue());
                    return invoke$lambda$25$lambda$24$lambda$23;
                }
            };
            composer.updateRememberedValue(rememberedValue9);
        }
        composer.endReplaceGroup();
        PagingListScreenKt.PagingListScreen(controller, function0, invoke$lambda$1, invoke$lambda$2, invoke$lambda$4, invoke$lambda$6, invoke$lambda$3, invoke$lambda$5, function1, function12, null, null, null, null, null, null, null, null, (Function1) rememberedValue9, true, 0, 0, null, composer, 0, 805306368, 0, 7601152);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    private static final String invoke$lambda$0(State<String> state) {
        return state.getValue();
    }

    private static final List<SportListItemUiModel> invoke$lambda$1(State<? extends List<SportListItemUiModel>> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final String invoke$lambda$4(State<String> state) {
        return state.getValue();
    }

    private static final String invoke$lambda$5(State<String> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$6(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
