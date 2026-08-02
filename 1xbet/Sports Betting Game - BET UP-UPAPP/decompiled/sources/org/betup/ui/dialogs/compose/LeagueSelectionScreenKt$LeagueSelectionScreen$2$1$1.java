package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.material.internal.ViewUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.dialogs.compose.stepsChallenges.LeaguesStepKt;
import org.betup.ui.dialogs.controller.LeagueSelectionController;
import org.betup.ui.fragment.matches.compose.CustomSearchBarKt;

/* compiled from: LeagueSelectionScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LeagueSelectionScreenKt$LeagueSelectionScreen$2$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ LeagueSelectionController $controller;
    final /* synthetic */ State<String> $leaguesQuery$delegate;

    LeagueSelectionScreenKt$LeagueSelectionScreen$2$1$1(LeagueSelectionController leagueSelectionController, State<String> state) {
        this.$controller = leagueSelectionController;
        this.$leaguesQuery$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$1$lambda$0(LeagueSelectionController leagueSelectionController, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        leagueSelectionController.updateSearchQuery(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$3$lambda$2(LeagueSelectionController leagueSelectionController) {
        leagueSelectionController.clearSearch();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$5$lambda$4(LeagueSelectionController leagueSelectionController, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        leagueSelectionController.executeSearch(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$7$lambda$6(LeagueSelectionController leagueSelectionController) {
        leagueSelectionController.clearSearch();
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String LeagueSelectionScreen$lambda$0;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(518996240, i, -1, "org.betup.ui.dialogs.compose.LeagueSelectionScreen.<anonymous>.<anonymous>.<anonymous> (LeagueSelectionScreen.kt:83)");
        }
        Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null);
        final LeagueSelectionController leagueSelectionController = this.$controller;
        State<String> state = this.$leaguesQuery$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxHeight$default);
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
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13181getSearchBarPaddingHD9Ej5fM(), BattleFlowDimens.INSTANCE.m13182getSearchBarPaddingVD9Ej5fM());
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN4);
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
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        LeagueSelectionScreen$lambda$0 = LeagueSelectionScreenKt.LeagueSelectionScreen$lambda$0(state);
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(leagueSelectionController);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.LeagueSelectionScreenKt$LeagueSelectionScreen$2$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$9$lambda$8$lambda$1$lambda$0;
                    invoke$lambda$9$lambda$8$lambda$1$lambda$0 = LeagueSelectionScreenKt$LeagueSelectionScreen$2$1$1.invoke$lambda$9$lambda$8$lambda$1$lambda$0(LeagueSelectionController.this, (String) obj);
                    return invoke$lambda$9$lambda$8$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(leagueSelectionController);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.LeagueSelectionScreenKt$LeagueSelectionScreen$2$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$9$lambda$8$lambda$3$lambda$2;
                    invoke$lambda$9$lambda$8$lambda$3$lambda$2 = LeagueSelectionScreenKt$LeagueSelectionScreen$2$1$1.invoke$lambda$9$lambda$8$lambda$3$lambda$2(LeagueSelectionController.this);
                    return invoke$lambda$9$lambda$8$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function0 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(leagueSelectionController);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: org.betup.ui.dialogs.compose.LeagueSelectionScreenKt$LeagueSelectionScreen$2$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$9$lambda$8$lambda$5$lambda$4;
                    invoke$lambda$9$lambda$8$lambda$5$lambda$4 = LeagueSelectionScreenKt$LeagueSelectionScreen$2$1$1.invoke$lambda$9$lambda$8$lambda$5$lambda$4(LeagueSelectionController.this, (String) obj);
                    return invoke$lambda$9$lambda$8$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function1 function12 = (Function1) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(leagueSelectionController);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: org.betup.ui.dialogs.compose.LeagueSelectionScreenKt$LeagueSelectionScreen$2$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$9$lambda$8$lambda$7$lambda$6;
                    invoke$lambda$9$lambda$8$lambda$7$lambda$6 = LeagueSelectionScreenKt$LeagueSelectionScreen$2$1$1.invoke$lambda$9$lambda$8$lambda$7$lambda$6(LeagueSelectionController.this);
                    return invoke$lambda$9$lambda$8$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        CustomSearchBarKt.CustomSearchBar(LeagueSelectionScreen$lambda$0, function1, function0, function12, (Function0) rememberedValue4, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, true, null, null, composer, 14352384, ViewUtils.EDGE_TO_EDGE_FLAGS);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        LeaguesStepKt.LeaguesStep(leagueSelectionController, composer, 0);
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
