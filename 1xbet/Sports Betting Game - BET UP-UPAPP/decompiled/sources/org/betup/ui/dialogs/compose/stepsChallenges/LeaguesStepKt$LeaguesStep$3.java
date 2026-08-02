package org.betup.ui.dialogs.compose.stepsChallenges;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.leagues.NewLeague;
import org.betup.ui.dialogs.compose.BattleFlowDimens;
import org.betup.ui.dialogs.controller.LeagueSelectionController;
import org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: LeaguesStep.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LeaguesStepKt$LeaguesStep$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ LeagueSelectionController $controller;
    final /* synthetic */ State<String> $error$delegate;
    final /* synthetic */ State<Boolean> $isLoadingMore$delegate;
    final /* synthetic */ State<List<NewLeague>> $leagues$delegate;
    final /* synthetic */ LazyListState $listState;

    /* JADX WARN: Multi-variable type inference failed */
    LeaguesStepKt$LeaguesStep$3(LazyListState lazyListState, State<? extends List<NewLeague>> state, LeagueSelectionController leagueSelectionController, State<Boolean> state2, State<String> state3) {
        this.$listState = lazyListState;
        this.$leagues$delegate = state;
        this.$controller = leagueSelectionController;
        this.$isLoadingMore$delegate = state2;
        this.$error$delegate = state3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4(State state, final LeagueSelectionController leagueSelectionController, State state2, LazyListScope LazyColumn) {
        final List LeaguesStep$lambda$0;
        boolean LeaguesStep$lambda$2;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LeaguesStep$lambda$0 = LeaguesStepKt.LeaguesStep$lambda$0(state);
        final LeaguesStepKt$LeaguesStep$3$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$1 leaguesStepKt$LeaguesStep$3$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.LeaguesStepKt$LeaguesStep$3$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(NewLeague newLeague) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((NewLeague) obj);
            }
        };
        LazyColumn.items(LeaguesStep$lambda$0.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.LeaguesStepKt$LeaguesStep$3$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(LeaguesStep$lambda$0.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.LeaguesStepKt$LeaguesStep$3$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final NewLeague newLeague = (NewLeague) LeaguesStep$lambda$0.get(i);
                composer.startReplaceGroup(-80428844);
                composer.startReplaceGroup(-1633490746);
                boolean changedInstance = composer.changedInstance(leagueSelectionController) | composer.changed(newLeague);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final LeagueSelectionController leagueSelectionController2 = leagueSelectionController;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.LeaguesStepKt$LeaguesStep$3$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            LeagueSelectionController.this.selectLeague(newLeague);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                LeaguesStepKt.NewLeagueItem(newLeague, (Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LeaguesStep$lambda$2 = LeaguesStepKt.LeaguesStep$lambda$2(state2);
        if (LeaguesStep$lambda$2) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$LeaguesStepKt.INSTANCE.m13341getLambda$1758565886$app_release(), 3, null);
        }
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String LeaguesStep$lambda$4;
        State<Boolean> state;
        State<List<NewLeague>> state2;
        LeagueSelectionController leagueSelectionController;
        LazyListState lazyListState;
        BoxScopeInstance boxScopeInstance;
        List LeaguesStep$lambda$0;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-595423311, i, -1, "org.betup.ui.dialogs.compose.stepsChallenges.LeaguesStep.<anonymous> (LeaguesStep.kt:67)");
        }
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        LazyListState lazyListState2 = this.$listState;
        State<List<NewLeague>> state3 = this.$leagues$delegate;
        LeagueSelectionController leagueSelectionController2 = this.$controller;
        State<Boolean> state4 = this.$isLoadingMore$delegate;
        State<String> state5 = this.$error$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        LeaguesStep$lambda$4 = LeaguesStepKt.LeaguesStep$lambda$4(state5);
        composer.startReplaceGroup(-285167978);
        if (LeaguesStep$lambda$4 == null) {
            state = state4;
            state2 = state3;
            leagueSelectionController = leagueSelectionController2;
            lazyListState = lazyListState2;
            boxScopeInstance = boxScopeInstance2;
        } else {
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            long m13159getErrorTextSizeXSAIIZE = BattleFlowDimens.INSTANCE.m13159getErrorTextSizeXSAIIZE();
            FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(composer, 6);
            TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), m13159getErrorTextSizeXSAIIZE, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
            state = state4;
            state2 = state3;
            leagueSelectionController = leagueSelectionController2;
            lazyListState = lazyListState2;
            boxScopeInstance = boxScopeInstance2;
            TextKt.m2642Text4IGK_g(LeaguesStep$lambda$4, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(-285144339);
        LeaguesStep$lambda$0 = LeaguesStepKt.LeaguesStep$lambda$0(state2);
        if (!LeaguesStep$lambda$0.isEmpty()) {
            composer.startReplaceGroup(-1746271574);
            final State<List<NewLeague>> state6 = state2;
            final LeagueSelectionController leagueSelectionController3 = leagueSelectionController;
            final State<Boolean> state7 = state;
            boolean changed = composer.changed(state6) | composer.changedInstance(leagueSelectionController3) | composer.changed(state7);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.LeaguesStepKt$LeaguesStep$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$6$lambda$5$lambda$4;
                        invoke$lambda$6$lambda$5$lambda$4 = LeaguesStepKt$LeaguesStep$3.invoke$lambda$6$lambda$5$lambda$4(State.this, leagueSelectionController3, state7, (LazyListScope) obj);
                        return invoke$lambda$6$lambda$5$lambda$4;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(null, lazyListState, null, false, null, null, null, false, null, (Function1) rememberedValue, composer, 0, 509);
            BetSlipListUiKt.m13488CustomScrollbart6yy7ic(lazyListState, SizeKt.m1568width3ABfNKs(boxScopeInstance.align(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterEnd()), BattleFlowDimens.INSTANCE.m13177getScrollbarWidthD9Ej5fM()), 0L, 0L, null, composer, 0, 28);
        }
        composer.endReplaceGroup();
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
