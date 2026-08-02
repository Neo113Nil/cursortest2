package org.betup.ui.dialogs.offer;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.entity.analytics.OfferModel;
import org.betup.ui.dialogs.offer.bridge.LambdaOfferWebViewBridgeHandler;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;

/* compiled from: SpecialOfferPageFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SpecialOfferPageFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SpecialOfferPageFragment $pageFragment;
    final /* synthetic */ SpecialOfferPageFragment this$0;

    SpecialOfferPageFragment$onCreateView$1$1(SpecialOfferPageFragment specialOfferPageFragment, SpecialOfferPageFragment specialOfferPageFragment2) {
        this.this$0 = specialOfferPageFragment;
        this.$pageFragment = specialOfferPageFragment2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12(SpecialOfferPageFragment specialOfferPageFragment) {
        specialOfferPageFragment.dismissParent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$14(SpecialOfferPageFragment specialOfferPageFragment) {
        specialOfferPageFragment.onPurchaseClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$16(SpecialOfferPageFragment specialOfferPageFragment) {
        specialOfferPageFragment.dismissParent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$18(SpecialOfferPageFragment specialOfferPageFragment) {
        specialOfferPageFragment.onPurchaseClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$21$lambda$20(SpecialOfferPageFragment specialOfferPageFragment) {
        specialOfferPageFragment.onPurchaseClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$23$lambda$22(SpecialOfferPageFragment specialOfferPageFragment) {
        specialOfferPageFragment.dismissParent();
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        MutableStateFlow mutableStateFlow6;
        MutableStateFlow mutableStateFlow7;
        MutableStateFlow mutableStateFlow8;
        MutableStateFlow mutableStateFlow9;
        MutableStateFlow mutableStateFlow10;
        MutableStateFlow mutableStateFlow11;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-582345173, i, -1, "org.betup.ui.dialogs.offer.SpecialOfferPageFragment.onCreateView.<anonymous>.<anonymous> (SpecialOfferPageFragment.kt:234)");
        }
        mutableStateFlow = this.this$0.showContentState;
        State collectAsState = SnapshotStateKt.collectAsState(mutableStateFlow, false, null, composer, 48, 2);
        mutableStateFlow2 = this.this$0.offerWebPresentationModeState;
        State collectAsState2 = SnapshotStateKt.collectAsState(mutableStateFlow2, OfferWebPresentationMode.None, null, composer, 48, 2);
        mutableStateFlow3 = this.this$0.offerState;
        State collectAsState3 = SnapshotStateKt.collectAsState(mutableStateFlow3, null, null, composer, 48, 2);
        mutableStateFlow4 = this.this$0.imageUrlState;
        State collectAsState4 = SnapshotStateKt.collectAsState(mutableStateFlow4, "", null, composer, 48, 2);
        mutableStateFlow5 = this.this$0.formattedOldPriceState;
        State collectAsState5 = SnapshotStateKt.collectAsState(mutableStateFlow5, null, null, composer, 48, 2);
        mutableStateFlow6 = this.this$0.formattedNewPriceState;
        State collectAsState6 = SnapshotStateKt.collectAsState(mutableStateFlow6, "", null, composer, 48, 2);
        mutableStateFlow7 = this.this$0.discountPercentState;
        State collectAsState7 = SnapshotStateKt.collectAsState(mutableStateFlow7, null, null, composer, 48, 2);
        mutableStateFlow8 = this.this$0.timerStringState;
        State collectAsState8 = SnapshotStateKt.collectAsState(mutableStateFlow8, "00:00:00", null, composer, 48, 2);
        mutableStateFlow9 = this.this$0.isLoadingState;
        State collectAsState9 = SnapshotStateKt.collectAsState(mutableStateFlow9, false, null, composer, 48, 2);
        if (invoke$lambda$0(collectAsState) && invoke$lambda$1(collectAsState2) == OfferWebPresentationMode.RemoteUrl && invoke$lambda$2(collectAsState3) != null) {
            composer.startReplaceGroup(-1271261819);
            mutableStateFlow10 = this.$pageFragment.remoteOfferHtmlReadyState;
            State collectAsState10 = SnapshotStateKt.collectAsState(mutableStateFlow10, null, composer, 0, 1);
            mutableStateFlow11 = this.$pageFragment.remoteOfferPrefetchedHtmlState;
            State collectAsState11 = SnapshotStateKt.collectAsState(mutableStateFlow11, null, composer, 0, 1);
            if (invoke$lambda$9(collectAsState10)) {
                composer.startReplaceGroup(-1270499467);
                composer.startReplaceGroup(5004770);
                boolean changedInstance = composer.changedInstance(this.$pageFragment);
                final SpecialOfferPageFragment specialOfferPageFragment = this.$pageFragment;
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.offer.SpecialOfferPageFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$13$lambda$12;
                            invoke$lambda$13$lambda$12 = SpecialOfferPageFragment$onCreateView$1$1.invoke$lambda$13$lambda$12(SpecialOfferPageFragment.this);
                            return invoke$lambda$13$lambda$12;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean changedInstance2 = composer.changedInstance(this.$pageFragment);
                final SpecialOfferPageFragment specialOfferPageFragment2 = this.$pageFragment;
                Object rememberedValue2 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.offer.SpecialOfferPageFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$15$lambda$14;
                            invoke$lambda$15$lambda$14 = SpecialOfferPageFragment$onCreateView$1$1.invoke$lambda$15$lambda$14(SpecialOfferPageFragment.this);
                            return invoke$lambda$15$lambda$14;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                LambdaOfferWebViewBridgeHandler lambdaOfferWebViewBridgeHandler = new LambdaOfferWebViewBridgeHandler(function0, (Function0) rememberedValue2);
                OfferModel invoke$lambda$2 = invoke$lambda$2(collectAsState3);
                Intrinsics.checkNotNull(invoke$lambda$2);
                OfferWebViewScreenKt.OfferWebViewScreen(OfferWebPresentationKt.buildOfferWebLoadSpec(invoke$lambda$2, invoke$lambda$1(collectAsState2), invoke$lambda$4(collectAsState5), invoke$lambda$5(collectAsState6), invoke$lambda$10(collectAsState11)), lambdaOfferWebViewBridgeHandler, null, null, composer, 0, 12);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1271054119);
                Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(32));
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1516padding3ABfNKs);
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
            }
            composer.endReplaceGroup();
        } else if (invoke$lambda$0(collectAsState) && invoke$lambda$1(collectAsState2) == OfferWebPresentationMode.InlineHtml && invoke$lambda$2(collectAsState3) != null) {
            composer.startReplaceGroup(-1269488681);
            composer.startReplaceGroup(5004770);
            boolean changedInstance3 = composer.changedInstance(this.$pageFragment);
            final SpecialOfferPageFragment specialOfferPageFragment3 = this.$pageFragment;
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.offer.SpecialOfferPageFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$17$lambda$16;
                        invoke$lambda$17$lambda$16 = SpecialOfferPageFragment$onCreateView$1$1.invoke$lambda$17$lambda$16(SpecialOfferPageFragment.this);
                        return invoke$lambda$17$lambda$16;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            Function0 function02 = (Function0) rememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changedInstance4 = composer.changedInstance(this.$pageFragment);
            final SpecialOfferPageFragment specialOfferPageFragment4 = this.$pageFragment;
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: org.betup.ui.dialogs.offer.SpecialOfferPageFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$19$lambda$18;
                        invoke$lambda$19$lambda$18 = SpecialOfferPageFragment$onCreateView$1$1.invoke$lambda$19$lambda$18(SpecialOfferPageFragment.this);
                        return invoke$lambda$19$lambda$18;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceGroup();
            LambdaOfferWebViewBridgeHandler lambdaOfferWebViewBridgeHandler2 = new LambdaOfferWebViewBridgeHandler(function02, (Function0) rememberedValue4);
            OfferModel invoke$lambda$22 = invoke$lambda$2(collectAsState3);
            Intrinsics.checkNotNull(invoke$lambda$22);
            OfferWebViewScreenKt.OfferWebViewScreen(OfferWebPresentationKt.buildOfferWebLoadSpec$default(invoke$lambda$22, invoke$lambda$1(collectAsState2), invoke$lambda$4(collectAsState5), invoke$lambda$5(collectAsState6), null, 16, null), lambdaOfferWebViewBridgeHandler2, null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else if (!invoke$lambda$0(collectAsState) || invoke$lambda$2(collectAsState3) == null) {
            composer.startReplaceGroup(-1267917787);
            Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(32));
            Alignment center2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1516padding3ABfNKs2);
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
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, composer, 0, 29);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1287850991);
            OfferModel invoke$lambda$23 = invoke$lambda$2(collectAsState3);
            Intrinsics.checkNotNull(invoke$lambda$23);
            String title = invoke$lambda$23.getTitle();
            String invoke$lambda$3 = invoke$lambda$3(collectAsState4);
            OfferModel invoke$lambda$24 = invoke$lambda$2(collectAsState3);
            Intrinsics.checkNotNull(invoke$lambda$24);
            String subtitle = invoke$lambda$24.getSubtitle();
            Intrinsics.checkNotNull(invoke$lambda$2(collectAsState3));
            String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(r5.getBetcoins());
            Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated, "getShopBetcoinsFormated(...)");
            String invoke$lambda$4 = invoke$lambda$4(collectAsState5);
            String invoke$lambda$5 = invoke$lambda$5(collectAsState6);
            Integer invoke$lambda$6 = invoke$lambda$6(collectAsState7);
            String invoke$lambda$7 = invoke$lambda$7(collectAsState8);
            boolean invoke$lambda$8 = invoke$lambda$8(collectAsState9);
            composer.startReplaceGroup(5004770);
            boolean changedInstance5 = composer.changedInstance(this.$pageFragment);
            final SpecialOfferPageFragment specialOfferPageFragment5 = this.$pageFragment;
            Object rememberedValue5 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: org.betup.ui.dialogs.offer.SpecialOfferPageFragment$onCreateView$1$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$21$lambda$20;
                        invoke$lambda$21$lambda$20 = SpecialOfferPageFragment$onCreateView$1$1.invoke$lambda$21$lambda$20(SpecialOfferPageFragment.this);
                        return invoke$lambda$21$lambda$20;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            Function0 function03 = (Function0) rememberedValue5;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changedInstance6 = composer.changedInstance(this.$pageFragment);
            final SpecialOfferPageFragment specialOfferPageFragment6 = this.$pageFragment;
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: org.betup.ui.dialogs.offer.SpecialOfferPageFragment$onCreateView$1$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$23$lambda$22;
                        invoke$lambda$23$lambda$22 = SpecialOfferPageFragment$onCreateView$1$1.invoke$lambda$23$lambda$22(SpecialOfferPageFragment.this);
                        return invoke$lambda$23$lambda$22;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            composer.endReplaceGroup();
            SpecialOfferDialogScreenKt.SpecialOfferDialogScreen(title, invoke$lambda$3, subtitle, shopBetcoinsFormated, invoke$lambda$4, invoke$lambda$5, invoke$lambda$6, invoke$lambda$7, invoke$lambda$8, function03, (Function0) rememberedValue6, composer, 0, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    private static final boolean invoke$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final OfferWebPresentationMode invoke$lambda$1(State<? extends OfferWebPresentationMode> state) {
        return state.getValue();
    }

    private static final OfferModel invoke$lambda$2(State<OfferModel> state) {
        return state.getValue();
    }

    private static final String invoke$lambda$3(State<String> state) {
        return state.getValue();
    }

    private static final String invoke$lambda$4(State<String> state) {
        return state.getValue();
    }

    private static final String invoke$lambda$5(State<String> state) {
        return state.getValue();
    }

    private static final Integer invoke$lambda$6(State<Integer> state) {
        return state.getValue();
    }

    private static final String invoke$lambda$7(State<String> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final String invoke$lambda$10(State<String> state) {
        return state.getValue();
    }
}
