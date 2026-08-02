package org.betup.ui.fragment.matches;

import android.graphics.Rect;
import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.MainActivity;
import org.betup.ui.fragment.matches.compose.MatchesFilterElementKt;
import org.betup.ui.fragment.matches.compose.PagingListScreenKt;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;
import org.betup.ui.fragment.matches.filter.NewMatchFilter;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.ui.tour.compose.TourState;
import org.betup.ui.tour.compose.TourStep;

/* compiled from: MatchesTabsFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MatchesTabsFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MatchesTabsFragment this$0;

    MatchesTabsFragment$onCreateView$1$1(MatchesTabsFragment matchesTabsFragment) {
        this.this$0 = matchesTabsFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final void invoke$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean invoke$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$27$lambda$23$lambda$12$lambda$11(MatchesTabsFragment matchesTabsFragment, MutableState mutableState) {
        if (invoke$lambda$9(mutableState)) {
            matchesTabsFragment.getController().resetSearchState();
            matchesTabsFragment.getController().refresh();
            invoke$lambda$10(mutableState, false);
        } else {
            matchesTabsFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$27$lambda$23$lambda$14$lambda$13(MatchesTabsFragment matchesTabsFragment, SportListItemUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchesTabsFragment.getController().onAddFavoriteSport(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$27$lambda$23$lambda$16$lambda$15(MatchesTabsFragment matchesTabsFragment, SportListItemUiModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchesTabsFragment.getController().onDeleteFavoriteSport(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$27$lambda$23$lambda$18$lambda$17(TourState tourState) {
        if (tourState != null) {
            tourState.setSportScrollComplete(true);
        }
        Log.d("MatchesTabsFragment", "Sport scroll complete - overlay can now be shown");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$27$lambda$23$lambda$20$lambda$19(MatchesTabsFragment matchesTabsFragment, MutableState mutableState, boolean z) {
        invoke$lambda$10(mutableState, z);
        matchesTabsFragment.isSearchExpanded = z;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$27$lambda$23$lambda$22$lambda$21(MatchesTabsFragment matchesTabsFragment, int i, int i2) {
        matchesTabsFragment.savedFirstVisibleItemIndex = i;
        matchesTabsFragment.savedFirstVisibleItemScrollOffset = i2;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$27$lambda$26$lambda$25$lambda$24(MatchesTabsFragment matchesTabsFragment, NewMatchFilter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchesTabsFragment.getController().performFilterChange(it);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Function0 function0;
        int i2;
        int i3;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-605666149, i, -1, "org.betup.ui.fragment.matches.MatchesTabsFragment.onCreateView.<anonymous>.<anonymous> (MatchesTabsFragment.kt:66)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getController().getMatchFilterState().getFilterList(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.getController().getMatchFilterState().getSelectedFilter(), null, composer, 0, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(this.this$0.getController().getItems(), null, composer, 0, 1);
        State collectAsState4 = SnapshotStateKt.collectAsState(this.this$0.getController().isLoading(), null, composer, 0, 1);
        State collectAsState5 = SnapshotStateKt.collectAsState(this.this$0.getController().isLoadingMore(), null, composer, 0, 1);
        State collectAsState6 = SnapshotStateKt.collectAsState(this.this$0.getController().getError(), null, composer, 0, 1);
        State collectAsState7 = SnapshotStateKt.collectAsState(this.this$0.getController().getQuery(), null, composer, 0, 1);
        State collectAsState8 = SnapshotStateKt.collectAsState(this.this$0.getController().getHasMore(), null, composer, 0, 1);
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceGroup();
        FragmentActivity requireActivity = this.this$0.requireActivity();
        MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
        TourComposeHelper tourComposeHelper = mainActivity != null ? mainActivity.tourComposeHelper : null;
        TourState tourState = tourComposeHelper != null ? tourComposeHelper.getTourState() : null;
        Long tourSportId = tourState != null ? tourState.getTourSportId() : null;
        Function1<? super Rect, Unit> function1 = tourComposeHelper != null ? tourComposeHelper.setSportItemBounds : null;
        if (tourComposeHelper != null) {
            Function1<? super Long, Unit> function12 = tourComposeHelper.setSportItemId;
        }
        boolean z = (tourState != null ? tourState.getCurrentStep() : null) == TourStep.SELECT_SPORT;
        final MatchesTabsFragment matchesTabsFragment = this.this$0;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        Long l = tourSportId;
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
        final TourState tourState2 = tourState;
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        boolean z2 = z;
        TourComposeHelper tourComposeHelper2 = tourComposeHelper;
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
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
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
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), composer, 6);
        MatchesController controller = matchesTabsFragment.getController();
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance = composer.changedInstance(matchesTabsFragment);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.MatchesTabsFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$27$lambda$23$lambda$12$lambda$11;
                    invoke$lambda$27$lambda$23$lambda$12$lambda$11 = MatchesTabsFragment$onCreateView$1$1.invoke$lambda$27$lambda$23$lambda$12$lambda$11(MatchesTabsFragment.this, mutableState);
                    return invoke$lambda$27$lambda$23$lambda$12$lambda$11;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        List<SportListItemUiModel> invoke$lambda$2 = invoke$lambda$2(collectAsState3);
        boolean invoke$lambda$3 = invoke$lambda$3(collectAsState4);
        String invoke$lambda$5 = invoke$lambda$5(collectAsState6);
        boolean invoke$lambda$7 = invoke$lambda$7(collectAsState8);
        boolean invoke$lambda$4 = invoke$lambda$4(collectAsState5);
        String invoke$lambda$6 = invoke$lambda$6(collectAsState7);
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(matchesTabsFragment);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.MatchesTabsFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$27$lambda$23$lambda$14$lambda$13;
                    invoke$lambda$27$lambda$23$lambda$14$lambda$13 = MatchesTabsFragment$onCreateView$1$1.invoke$lambda$27$lambda$23$lambda$14$lambda$13(MatchesTabsFragment.this, (SportListItemUiModel) obj);
                    return invoke$lambda$27$lambda$23$lambda$14$lambda$13;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function1 function13 = (Function1) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(matchesTabsFragment);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.matches.MatchesTabsFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$27$lambda$23$lambda$16$lambda$15;
                    invoke$lambda$27$lambda$23$lambda$16$lambda$15 = MatchesTabsFragment$onCreateView$1$1.invoke$lambda$27$lambda$23$lambda$16$lambda$15(MatchesTabsFragment.this, (SportListItemUiModel) obj);
                    return invoke$lambda$27$lambda$23$lambda$16$lambda$15;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function1 function14 = (Function1) rememberedValue4;
        composer.endReplaceGroup();
        Function1<? super Long, Unit> function15 = tourComposeHelper2 != null ? tourComposeHelper2.setSportItemId : null;
        composer.startReplaceGroup(-161205190);
        if (z2) {
            composer.startReplaceGroup(5004770);
            boolean changed = composer.changed(tourState2);
            Object rememberedValue5 = composer.rememberedValue();
            if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.matches.MatchesTabsFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$27$lambda$23$lambda$18$lambda$17;
                        invoke$lambda$27$lambda$23$lambda$18$lambda$17 = MatchesTabsFragment$onCreateView$1$1.invoke$lambda$27$lambda$23$lambda$18$lambda$17(TourState.this);
                        return invoke$lambda$27$lambda$23$lambda$18$lambda$17;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceGroup();
            function0 = (Function0) rememberedValue5;
        } else {
            function0 = null;
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance4 = composer.changedInstance(matchesTabsFragment);
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.matches.MatchesTabsFragment$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$27$lambda$23$lambda$20$lambda$19;
                    invoke$lambda$27$lambda$23$lambda$20$lambda$19 = MatchesTabsFragment$onCreateView$1$1.invoke$lambda$27$lambda$23$lambda$20$lambda$19(MatchesTabsFragment.this, mutableState, ((Boolean) obj).booleanValue());
                    return invoke$lambda$27$lambda$23$lambda$20$lambda$19;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        Function1 function16 = (Function1) rememberedValue6;
        composer.endReplaceGroup();
        i2 = matchesTabsFragment.savedFirstVisibleItemIndex;
        i3 = matchesTabsFragment.savedFirstVisibleItemScrollOffset;
        composer.startReplaceGroup(5004770);
        boolean changedInstance5 = composer.changedInstance(matchesTabsFragment);
        Object rememberedValue7 = composer.rememberedValue();
        if (changedInstance5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = new Function2() { // from class: org.betup.ui.fragment.matches.MatchesTabsFragment$onCreateView$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$27$lambda$23$lambda$22$lambda$21;
                    invoke$lambda$27$lambda$23$lambda$22$lambda$21 = MatchesTabsFragment$onCreateView$1$1.invoke$lambda$27$lambda$23$lambda$22$lambda$21(MatchesTabsFragment.this, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    return invoke$lambda$27$lambda$23$lambda$22$lambda$21;
                }
            };
            composer.updateRememberedValue(rememberedValue7);
        }
        composer.endReplaceGroup();
        PagingListScreenKt.PagingListScreen(controller, function02, invoke$lambda$2, invoke$lambda$3, invoke$lambda$5, invoke$lambda$7, invoke$lambda$4, invoke$lambda$6, function13, function14, l, function1, function15, function0, null, null, null, null, function16, false, i2, i3, (Function2) rememberedValue7, composer, 0, 805306368, 0, 245760);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier align = boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd());
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, align);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, invoke$lambda$9(mutableState) ? Dp.m7774constructorimpl(56) : Dp.m7774constructorimpl(0)), composer, 0);
        FragmentActivity requireActivity2 = matchesTabsFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
        FragmentActivity fragmentActivity = requireActivity2;
        List<NewMatchFilter> invoke$lambda$0 = invoke$lambda$0(collectAsState);
        NewMatchFilter invoke$lambda$1 = invoke$lambda$1(collectAsState2);
        composer.startReplaceGroup(5004770);
        boolean changedInstance6 = composer.changedInstance(matchesTabsFragment);
        Object rememberedValue8 = composer.rememberedValue();
        if (changedInstance6 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = new Function1() { // from class: org.betup.ui.fragment.matches.MatchesTabsFragment$onCreateView$1$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$27$lambda$26$lambda$25$lambda$24;
                    invoke$lambda$27$lambda$26$lambda$25$lambda$24 = MatchesTabsFragment$onCreateView$1$1.invoke$lambda$27$lambda$26$lambda$25$lambda$24(MatchesTabsFragment.this, (NewMatchFilter) obj);
                    return invoke$lambda$27$lambda$26$lambda$25$lambda$24;
                }
            };
            composer.updateRememberedValue(rememberedValue8);
        }
        composer.endReplaceGroup();
        MatchesFilterElementKt.MatchesFilterElement(fragmentActivity, invoke$lambda$0, invoke$lambda$1, (Function1) rememberedValue8, PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), composer, 24576);
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

    private static final List<NewMatchFilter> invoke$lambda$0(State<? extends List<? extends NewMatchFilter>> state) {
        return (List) state.getValue();
    }

    private static final NewMatchFilter invoke$lambda$1(State<? extends NewMatchFilter> state) {
        return state.getValue();
    }

    private static final List<SportListItemUiModel> invoke$lambda$2(State<? extends List<SportListItemUiModel>> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final String invoke$lambda$5(State<String> state) {
        return state.getValue();
    }

    private static final String invoke$lambda$6(State<String> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
