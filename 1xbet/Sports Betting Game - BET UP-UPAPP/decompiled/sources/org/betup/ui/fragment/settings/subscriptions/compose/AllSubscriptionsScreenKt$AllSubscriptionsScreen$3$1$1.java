package org.betup.ui.fragment.settings.subscriptions.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.ProgressIndicatorKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.subscription.MatchSubscriptionModel;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt;
import org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: AllSubscriptionsScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ State<Boolean> $canRetry$delegate;
    final /* synthetic */ AllSubscriptionsController $controller;
    final /* synthetic */ State<String> $error$delegate;
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Function0<Unit> $onGoToMatches;
    final /* synthetic */ State<List<MatchSubscriptionModel>> $subscriptions$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$1(LazyListState lazyListState, State<? extends List<? extends MatchSubscriptionModel>> state, AllSubscriptionsController allSubscriptionsController, State<Boolean> state2, State<String> state3, State<Boolean> state4, Function0<Unit> function0) {
        this.$listState = lazyListState;
        this.$subscriptions$delegate = state;
        this.$controller = allSubscriptionsController;
        this.$isLoading$delegate = state2;
        this.$error$delegate = state3;
        this.$canRetry$delegate = state4;
        this.$onGoToMatches = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$3$lambda$2$lambda$1(AllSubscriptionsController allSubscriptionsController) {
        allSubscriptionsController.retry();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$7(final State state, final AllSubscriptionsController allSubscriptionsController, State state2, LazyListScope LazyColumn) {
        final List AllSubscriptionsScreen$lambda$4;
        boolean AllSubscriptionsScreen$lambda$5;
        List AllSubscriptionsScreen$lambda$42;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        AllSubscriptionsScreen$lambda$4 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$4(state);
        final AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$1 allSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.settings.subscriptions.compose.AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(MatchSubscriptionModel matchSubscriptionModel) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((MatchSubscriptionModel) obj);
            }
        };
        LazyColumn.items(AllSubscriptionsScreen$lambda$4.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.settings.subscriptions.compose.AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(AllSubscriptionsScreen$lambda$4.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.settings.subscriptions.compose.AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$1$invoke$lambda$9$lambda$8$lambda$7$$inlined$items$default$4
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
                List AllSubscriptionsScreen$lambda$43;
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
                MatchSubscriptionModel matchSubscriptionModel = (MatchSubscriptionModel) AllSubscriptionsScreen$lambda$4.get(i);
                composer.startReplaceGroup(1733861511);
                composer.startReplaceGroup(5004770);
                boolean changedInstance = composer.changedInstance(allSubscriptionsController);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final AllSubscriptionsController allSubscriptionsController2 = allSubscriptionsController;
                    rememberedValue = (Function1) new Function1<Integer, Unit>() { // from class: org.betup.ui.fragment.settings.subscriptions.compose.AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$1$1$4$1$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                            invoke(num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i4) {
                            AllSubscriptionsController.this.deleteAllSubscriptionsForMatch(i4);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                AllSubscriptionsScreenKt.SubscriptionMatchItem(matchSubscriptionModel, (Function1) rememberedValue, composer, 0);
                composer.startReplaceGroup(-359696658);
                AllSubscriptionsScreen$lambda$43 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$4(state);
                if (!Intrinsics.areEqual(matchSubscriptionModel, CollectionsKt.last(AllSubscriptionsScreen$lambda$43))) {
                    BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(1)), Dp.m7774constructorimpl(16), 0.0f, 2, null), ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), null, 2, null), composer, 0);
                }
                composer.endReplaceGroup();
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        AllSubscriptionsScreen$lambda$5 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$5(state2);
        if (AllSubscriptionsScreen$lambda$5) {
            AllSubscriptionsScreen$lambda$42 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$4(state);
            if (!AllSubscriptionsScreen$lambda$42.isEmpty()) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AllSubscriptionsScreenKt.INSTANCE.m14104getLambda$1873091924$app_release(), 3, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        boolean AllSubscriptionsScreen$lambda$5;
        String AllSubscriptionsScreen$lambda$6;
        boolean AllSubscriptionsScreen$lambda$52;
        List AllSubscriptionsScreen$lambda$4;
        List AllSubscriptionsScreen$lambda$42;
        boolean AllSubscriptionsScreen$lambda$7;
        List AllSubscriptionsScreen$lambda$43;
        String AllSubscriptionsScreen$lambda$62;
        List AllSubscriptionsScreen$lambda$44;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-275576189, i, -1, "org.betup.ui.fragment.settings.subscriptions.compose.AllSubscriptionsScreen.<anonymous>.<anonymous>.<anonymous> (AllSubscriptionsScreen.kt:120)");
        }
        Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null);
        LazyListState lazyListState = this.$listState;
        final State<List<MatchSubscriptionModel>> state = this.$subscriptions$delegate;
        final AllSubscriptionsController allSubscriptionsController = this.$controller;
        final State<Boolean> state2 = this.$isLoading$delegate;
        State<String> state3 = this.$error$delegate;
        State<Boolean> state4 = this.$canRetry$delegate;
        Function0<Unit> function0 = this.$onGoToMatches;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
        AllSubscriptionsScreen$lambda$5 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$5(state2);
        if (AllSubscriptionsScreen$lambda$5) {
            AllSubscriptionsScreen$lambda$44 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$4(state);
            if (AllSubscriptionsScreen$lambda$44.isEmpty()) {
                composer.startReplaceGroup(-179618813);
                Modifier align = boxScopeInstance.align(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter());
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, align);
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
                ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(48)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, composer, 6, 28);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), composer, 6);
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.loading, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
        }
        AllSubscriptionsScreen$lambda$6 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$6(state3);
        if (AllSubscriptionsScreen$lambda$6 != null) {
            AllSubscriptionsScreen$lambda$7 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$7(state4);
            if (AllSubscriptionsScreen$lambda$7) {
                AllSubscriptionsScreen$lambda$43 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$4(state);
                if (AllSubscriptionsScreen$lambda$43.isEmpty()) {
                    composer.startReplaceGroup(-178317495);
                    Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(boxScopeInstance.align(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), Dp.m7774constructorimpl(32));
                    Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center2, centerHorizontally2, composer, 54);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m1516padding3ABfNKs);
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
                    AllSubscriptionsScreen$lambda$62 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$6(state3);
                    composer.startReplaceGroup(-1524556587);
                    if (AllSubscriptionsScreen$lambda$62 == null) {
                        AllSubscriptionsScreen$lambda$62 = StringResources_androidKt.stringResource(R.string.error_occured, composer, 6);
                    }
                    composer.endReplaceGroup();
                    TextKt.m2642Text4IGK_g(AllSubscriptionsScreen$lambda$62, (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 130546);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), composer, 6);
                    String stringResource = StringResources_androidKt.stringResource(R.string.retry, composer, 6);
                    Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(16), 0.0f, 2, null);
                    composer.startReplaceGroup(5004770);
                    boolean changedInstance = composer.changedInstance(allSubscriptionsController);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.settings.subscriptions.compose.AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$9$lambda$3$lambda$2$lambda$1;
                                invoke$lambda$9$lambda$3$lambda$2$lambda$1 = AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$1.invoke$lambda$9$lambda$3$lambda$2$lambda$1(AllSubscriptionsController.this);
                                return invoke$lambda$9$lambda$3$lambda$2$lambda$1;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    CommonButtonKt.m12915CommonButtonUPEs2M4(m1518paddingVpY3zN4$default, false, stringResource, false, false, false, (Function0) rememberedValue, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 54, 0, 0, 2097080);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        AllSubscriptionsScreen$lambda$52 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$5(state2);
        if (!AllSubscriptionsScreen$lambda$52) {
            AllSubscriptionsScreen$lambda$42 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$4(state);
            if (AllSubscriptionsScreen$lambda$42.isEmpty()) {
                composer.startReplaceGroup(-176795643);
                Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(boxScopeInstance.align(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), Dp.m7774constructorimpl(32));
                Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical center3 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(center3, centerHorizontally3, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, m1516padding3ABfNKs2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.no_match_subscriptions, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 130546);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), composer, 6);
                CommonButtonKt.m12915CommonButtonUPEs2M4(null, true, StringResources_androidKt.stringResource(R.string.go_to_matches, composer, 6), false, false, false, function0, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 48, 0, 0, 2097081);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        composer.startReplaceGroup(-175395807);
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer.startReplaceGroup(-1746271574);
        boolean changed = composer.changed(state) | composer.changedInstance(allSubscriptionsController) | composer.changed(state2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.settings.subscriptions.compose.AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$9$lambda$8$lambda$7;
                    invoke$lambda$9$lambda$8$lambda$7 = AllSubscriptionsScreenKt$AllSubscriptionsScreen$3$1$1.invoke$lambda$9$lambda$8$lambda$7(State.this, allSubscriptionsController, state2, (LazyListScope) obj);
                    return invoke$lambda$9$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(fillMaxSize$default, lazyListState, null, false, null, null, null, false, null, (Function1) rememberedValue2, composer, 6, 508);
        AllSubscriptionsScreen$lambda$4 = AllSubscriptionsScreenKt.AllSubscriptionsScreen$lambda$4(state);
        if (!AllSubscriptionsScreen$lambda$4.isEmpty()) {
            BetSlipListUiKt.m13488CustomScrollbart6yy7ic(lazyListState, PaddingKt.m1518paddingVpY3zN4$default(boxScopeInstance.align(SizeKt.m1568width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(8)), Alignment.INSTANCE.getCenterEnd()), 0.0f, Dp.m7774constructorimpl(29), 1, null), 0L, 0L, null, composer, 0, 28);
        }
        composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
    }
}
