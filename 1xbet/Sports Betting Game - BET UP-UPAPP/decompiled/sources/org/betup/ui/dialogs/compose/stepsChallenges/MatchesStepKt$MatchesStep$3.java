package org.betup.ui.dialogs.compose.stepsChallenges;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.matches.NewMatchItemModel;
import org.betup.ui.dialogs.compose.BattleFlowDimens;
import org.betup.ui.dialogs.controller.MatchSelectionController;
import org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: MatchesStep.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MatchesStepKt$MatchesStep$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MatchSelectionController $controller;
    final /* synthetic */ State<String> $error$delegate;
    final /* synthetic */ State<Boolean> $isLoadingMore$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ State<List<NewMatchItemModel>> $matches$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    MatchesStepKt$MatchesStep$3(LazyListState lazyListState, State<? extends List<NewMatchItemModel>> state, MatchSelectionController matchSelectionController, State<Boolean> state2, State<String> state3) {
        this.$listState = lazyListState;
        this.$matches$delegate = state;
        this.$controller = matchSelectionController;
        this.$isLoadingMore$delegate = state2;
        this.$error$delegate = state3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(State state, MatchSelectionController matchSelectionController, State state2, LazyListScope LazyColumn) {
        List MatchesStep$lambda$0;
        boolean MatchesStep$lambda$2;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        MatchesStep$lambda$0 = MatchesStepKt.MatchesStep$lambda$0(state);
        LazyListScope.items$default(LazyColumn, MatchesStep$lambda$0.size(), null, null, ComposableLambdaKt.composableLambdaInstance(261563866, true, new MatchesStepKt$MatchesStep$3$1$2$1$1(matchSelectionController, state)), 6, null);
        MatchesStep$lambda$2 = MatchesStepKt.MatchesStep$lambda$2(state2);
        if (MatchesStep$lambda$2) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$MatchesStepKt.INSTANCE.m13342getLambda$445696888$app_release(), 3, null);
        }
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String MatchesStep$lambda$4;
        State<Boolean> state;
        State<List<NewMatchItemModel>> state2;
        MatchSelectionController matchSelectionController;
        LazyListState lazyListState;
        BoxScopeInstance boxScopeInstance;
        List MatchesStep$lambda$0;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(423107833, i, -1, "org.betup.ui.dialogs.compose.stepsChallenges.MatchesStep.<anonymous> (MatchesStep.kt:81)");
        }
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        LazyListState lazyListState2 = this.$listState;
        State<List<NewMatchItemModel>> state3 = this.$matches$delegate;
        MatchSelectionController matchSelectionController2 = this.$controller;
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
        MatchesStep$lambda$4 = MatchesStepKt.MatchesStep$lambda$4(state5);
        composer.startReplaceGroup(-977492974);
        if (MatchesStep$lambda$4 == null) {
            state = state4;
            state2 = state3;
            matchSelectionController = matchSelectionController2;
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
            matchSelectionController = matchSelectionController2;
            lazyListState = lazyListState2;
            boxScopeInstance = boxScopeInstance2;
            TextKt.m2642Text4IGK_g(MatchesStep$lambda$4, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(-977468687);
        MatchesStep$lambda$0 = MatchesStepKt.MatchesStep$lambda$0(state2);
        if (!MatchesStep$lambda$0.isEmpty()) {
            composer.startReplaceGroup(-1746271574);
            final State<List<NewMatchItemModel>> state6 = state2;
            final MatchSelectionController matchSelectionController3 = matchSelectionController;
            final State<Boolean> state7 = state;
            boolean changed = composer.changed(state6) | composer.changedInstance(matchSelectionController3) | composer.changed(state7);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.MatchesStepKt$MatchesStep$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$4$lambda$3$lambda$2;
                        invoke$lambda$4$lambda$3$lambda$2 = MatchesStepKt$MatchesStep$3.invoke$lambda$4$lambda$3$lambda$2(State.this, matchSelectionController3, state7, (LazyListScope) obj);
                        return invoke$lambda$4$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(null, lazyListState, null, false, null, null, null, false, null, (Function1) rememberedValue, composer, 0, 509);
            BetSlipListUiKt.m13488CustomScrollbart6yy7ic(lazyListState, boxScopeInstance.align(SizeKt.m1568width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), BattleFlowDimens.INSTANCE.m13177getScrollbarWidthD9Ej5fM()), Alignment.INSTANCE.getCenterEnd()), 0L, 0L, null, composer, 0, 28);
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
