package org.betup.ui.fragment.matches;

import android.graphics.Rect;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.MainActivity;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.fragment.matches.compose.DateSelectorElementKt;
import org.betup.ui.fragment.matches.compose.PagingListScreenKt;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.ui.tour.compose.TourState;

/* compiled from: SportsByDateFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SportsByDateFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SportsByDateFragment this$0;

    SportsByDateFragment$onCreateView$1$1(SportsByDateFragment sportsByDateFragment) {
        this.this$0 = sportsByDateFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$8$lambda$7(SportsByDateFragment sportsByDateFragment, String newDate) {
        Intrinsics.checkNotNullParameter(newDate, "newDate");
        sportsByDateFragment.getController().performDateChange(newDate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$10$lambda$9(SportsByDateFragment sportsByDateFragment) {
        boolean z;
        z = sportsByDateFragment.isSearchExpanded;
        if (z) {
            sportsByDateFragment.getController().resetSearchState();
            sportsByDateFragment.getController().refresh();
            sportsByDateFragment.isSearchExpanded = false;
        } else {
            sportsByDateFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$12$lambda$11(SportsByDateFragment sportsByDateFragment, SportListItemUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        sportsByDateFragment.getController().onAddFavoriteSport(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$14$lambda$13(SportsByDateFragment sportsByDateFragment, SportListItemUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        sportsByDateFragment.getController().onDeleteFavoriteSport(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$16$lambda$15(SportsByDateFragment sportsByDateFragment, boolean z) {
        sportsByDateFragment.isSearchExpanded = z;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$18$lambda$17(SportsByDateFragment sportsByDateFragment, int i, int i2) {
        sportsByDateFragment.savedFirstVisibleItemIndex = i;
        sportsByDateFragment.savedFirstVisibleItemScrollOffset = i2;
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int i2;
        int i3;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1821131977, i, -1, "org.betup.ui.fragment.matches.SportsByDateFragment.onCreateView.<anonymous>.<anonymous> (SportsByDateFragment.kt:64)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getDateFilterState().getSelectedDate(), null, composer, 0, 1);
        LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, composer, 0, 3);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.getController().getItems(), null, composer, 0, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(this.this$0.getController().isLoading(), null, composer, 0, 1);
        State collectAsState4 = SnapshotStateKt.collectAsState(this.this$0.getController().isLoadingMore(), null, composer, 0, 1);
        State collectAsState5 = SnapshotStateKt.collectAsState(this.this$0.getController().getError(), null, composer, 0, 1);
        State collectAsState6 = SnapshotStateKt.collectAsState(this.this$0.getController().getQuery(), null, composer, 0, 1);
        State collectAsState7 = SnapshotStateKt.collectAsState(this.this$0.getController().getHasMore(), null, composer, 0, 1);
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        final SportsByDateFragment sportsByDateFragment = this.this$0;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
        String invoke$lambda$0 = invoke$lambda$0(collectAsState);
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(sportsByDateFragment);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.SportsByDateFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$19$lambda$8$lambda$7;
                    invoke$lambda$19$lambda$8$lambda$7 = SportsByDateFragment$onCreateView$1$1.invoke$lambda$19$lambda$8$lambda$7(SportsByDateFragment.this, (String) obj);
                    return invoke$lambda$19$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        DateSelectorElementKt.DateSelectorElement(invoke$lambda$0, (Function1) rememberedValue, PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(8)), rememberLazyListStateWithoutSavedState, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
        FragmentActivity requireActivity = sportsByDateFragment.requireActivity();
        MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
        TourComposeHelper tourComposeHelper = mainActivity != null ? mainActivity.tourComposeHelper : null;
        TourState tourState = tourComposeHelper != null ? tourComposeHelper.getTourState() : null;
        Long tourSportId = tourState != null ? tourState.getTourSportId() : null;
        Function1<? super Rect, Unit> function1 = tourComposeHelper != null ? tourComposeHelper.setSportItemBounds : null;
        SportsByDateController controller = sportsByDateFragment.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(sportsByDateFragment);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.SportsByDateFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$19$lambda$10$lambda$9;
                    invoke$lambda$19$lambda$10$lambda$9 = SportsByDateFragment$onCreateView$1$1.invoke$lambda$19$lambda$10$lambda$9(SportsByDateFragment.this);
                    return invoke$lambda$19$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function0 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        List<SportListItemUiModel> invoke$lambda$1 = invoke$lambda$1(collectAsState2);
        boolean invoke$lambda$2 = invoke$lambda$2(collectAsState3);
        String invoke$lambda$4 = invoke$lambda$4(collectAsState5);
        boolean invoke$lambda$6 = invoke$lambda$6(collectAsState7);
        boolean invoke$lambda$3 = invoke$lambda$3(collectAsState4);
        String invoke$lambda$5 = invoke$lambda$5(collectAsState6);
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(sportsByDateFragment);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.SportsByDateFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$19$lambda$12$lambda$11;
                    invoke$lambda$19$lambda$12$lambda$11 = SportsByDateFragment$onCreateView$1$1.invoke$lambda$19$lambda$12$lambda$11(SportsByDateFragment.this, (SportListItemUiModel) obj);
                    return invoke$lambda$19$lambda$12$lambda$11;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function1 function12 = (Function1) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(sportsByDateFragment);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.matches.SportsByDateFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$19$lambda$14$lambda$13;
                    invoke$lambda$19$lambda$14$lambda$13 = SportsByDateFragment$onCreateView$1$1.invoke$lambda$19$lambda$14$lambda$13(SportsByDateFragment.this, (SportListItemUiModel) obj);
                    return invoke$lambda$19$lambda$14$lambda$13;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function1 function13 = (Function1) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance5 = composer.changedInstance(sportsByDateFragment);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function1() { // from class: org.betup.ui.fragment.matches.SportsByDateFragment$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$19$lambda$16$lambda$15;
                    invoke$lambda$19$lambda$16$lambda$15 = SportsByDateFragment$onCreateView$1$1.invoke$lambda$19$lambda$16$lambda$15(SportsByDateFragment.this, ((Boolean) obj).booleanValue());
                    return invoke$lambda$19$lambda$16$lambda$15;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        Function1 function14 = (Function1) rememberedValue5;
        composer.endReplaceGroup();
        i2 = sportsByDateFragment.savedFirstVisibleItemIndex;
        i3 = sportsByDateFragment.savedFirstVisibleItemScrollOffset;
        composer.startReplaceGroup(5004770);
        boolean changedInstance6 = composer.changedInstance(sportsByDateFragment);
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function2() { // from class: org.betup.ui.fragment.matches.SportsByDateFragment$onCreateView$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$19$lambda$18$lambda$17;
                    invoke$lambda$19$lambda$18$lambda$17 = SportsByDateFragment$onCreateView$1$1.invoke$lambda$19$lambda$18$lambda$17(SportsByDateFragment.this, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    return invoke$lambda$19$lambda$18$lambda$17;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceGroup();
        PagingListScreenKt.PagingListScreen(controller, function0, invoke$lambda$1, invoke$lambda$2, invoke$lambda$4, invoke$lambda$6, invoke$lambda$3, invoke$lambda$5, function12, function13, tourSportId, function1, null, null, null, null, null, null, function14, false, i2, i3, (Function2) rememberedValue6, composer, 0, 805309440, 0, 249856);
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
