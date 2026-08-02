package com.paypal.oslo.feature.inappcheckout.ui.econsent.screen;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a)\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0011\u001a!\u0010\u0012\u001a\u00020\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"EConsentScreen", "", "inAppCheckoutCoordinator", "Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;", "viewModel", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/viewmodel/EConsentViewModel;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "(Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;Lcom/paypal/oslo/feature/inappcheckout/domain/model/EConsentData;Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/viewmodel/EConsentViewModel;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Landroidx/compose/runtime/Composer;I)V", "EConsentScreenContent", "state", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$State;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event;", "(Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$State;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ESignConsentText", "onLinkClick", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EConsentScreenKt {
    public static final void EConsentScreen(final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, final com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData eConsentData, final com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel eConsentViewModel, final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eConsentData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eConsentViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1230893842);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(inAppCheckoutCoordinator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(eConsentData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(eConsentViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? startRestartGroup.changed(checkoutLogger) : startRestartGroup.changedInstance(checkoutLogger) ? 2048 : 1024;
        }
        boolean z = true;
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1230893842, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreen (EConsentScreen.kt:58)");
            }
            if (eConsentData.getBuyerInfoEntity() == null) {
                com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.navigateToError$default(inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.BUYER_RESTRICTION, checkoutLogger, null, null, 12, null);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt.$r8$lambda$loYAmOlpSIqPvl7vaFo8sr4vqeU(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, eConsentData, eConsentViewModel, checkoutLogger, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                }
                return;
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(eConsentViewModel.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            boolean changedInstance = startRestartGroup.changedInstance(eConsentViewModel);
            boolean changedInstance2 = startRestartGroup.changedInstance(eConsentData);
            com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$2$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$2$1(eConsentViewModel, eConsentData, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(eConsentData, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, (i2 >> 3) & 14);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance3 = startRestartGroup.changedInstance(eConsentViewModel);
            com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$3$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$3$1(eConsentViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance4 = startRestartGroup.changedInstance(eConsentViewModel);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt.$r8$lambda$nNjeMvb0REa8nw7acSAjmnxj04E(com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(unit2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, startRestartGroup, 6);
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            boolean changedInstance5 = startRestartGroup.changedInstance(eConsentViewModel);
            boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
            boolean z2 = (i2 & 14) == 4;
            if ((i2 & 7168) != 2048 && ((i2 & 4096) == 0 || !startRestartGroup.changedInstance(checkoutLogger))) {
                z = false;
            }
            com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$5$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (((changedInstance5 | changed | z2) || z) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                composer2 = startRestartGroup;
                rememberedValue4 = new com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$5$1(eConsentViewModel, inAppCheckoutCoordinator, checkoutLogger, collectAsStateWithLifecycle, null);
                composer2.updateRememberedValue(rememberedValue4);
            } else {
                composer2 = startRestartGroup;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, 6);
            com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State state = (com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State) collectAsStateWithLifecycle.getValue();
            boolean changedInstance6 = composer2.changedInstance(eConsentViewModel);
            com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$6$1 rememberedValue5 = composer2.rememberedValue();
            if (changedInstance6 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$6$1(eConsentViewModel);
                composer2.updateRememberedValue(rememberedValue5);
            }
            EConsentScreenContent(state, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue5), composer2, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt.$r8$lambda$ByEvlBzrzP2eiXw2g50Flf8YqkM(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, eConsentData, eConsentViewModel, checkoutLogger, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    public static final void EConsentScreenContent(final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State state, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1560670711);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1560670711, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenContent (EConsentScreen.kt:125)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.statusBarHeight(startRestartGroup, 0), 0.0f, 0.0f, 13, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = state.buyerInfoEntity();
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt.$r8$lambda$GZhb_SXK8CvtlNbnv7gRtCvz2H8(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.inappcheckout.ui.common.HeaderKt.Header(buyerInfoEntity, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
            androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 48);
            int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_econsent_title, new java.lang.Object[0], startRestartGroup, 0), null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleLarge.INSTANCE, startRestartGroup, 0, 6, 1006);
            boolean z2 = i4 == 32;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt.$r8$lambda$K3kHXGQFuyluMOcfnHXJAzFMf7s(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink) obj);
                    }
                };
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(rememberedValue2);
            } else {
                composer2 = startRestartGroup;
            }
            getHighResolutionOutputSizeshNQ4ISI((kotlin.jvm.functions.Function1) rememberedValue2, composer2, 0);
            composer2.endNode();
            composer2.endNode();
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1706padding3ABfNKs);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.lang.String rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_agree_and_continue, new java.lang.Object[0], composer2, 0);
            com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize.Large large = com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize.Large.INSTANCE;
            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean isButtonLoading = state.isButtonLoading();
            boolean isButtonLoading2 = state.isButtonLoading();
            boolean z3 = i4 == 32;
            java.lang.Object rememberedValue3 = composer2.rememberedValue();
            if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt.m15514$r8$lambda$PXGmOKJeuAGD808dLrLu7sA_m4(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCTAButtonKt.InAppCheckoutCTAButton(rememberStringValue, (kotlin.jvm.functions.Function0) rememberedValue3, fillMaxWidth$default2, null, large, true ^ isButtonLoading2, isButtonLoading, composer2, 24960, 8);
            composer2.endNode();
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt.m15515$r8$lambda$QADtDbLhKgVd4K4hRgriv5TEo(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2080774811);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2080774811, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.ESignConsentText (EConsentScreen.kt:189)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            com.paypal.oslo.feature.inappcheckout.ui.common.LinkableTextKt.LinkableText(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_econsent_description, new java.lang.Object[0], startRestartGroup, 0), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_econsent_link_label, new java.lang.Object[0], startRestartGroup, 0), com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink.E_SIGN_CONSENT)), function1, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Typography.BodyMedium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, ((i2 << 6) & 896) | 224256, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt.m15516$r8$lambda$jf5r2whBWTym6vUAmzoyMZZVPQ(kotlin.jvm.functions.Function1.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ByEvlBzrzP2eiXw2g50Flf8YqkM(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData eConsentData, com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel eConsentViewModel, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, int i, androidx.compose.runtime.Composer composer, int i2) {
        EConsentScreen(inAppCheckoutCoordinator, eConsentData, eConsentViewModel, checkoutLogger, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GZhb_SXK8CvtlNbnv7gRtCvz2H8(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnProfileClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$K3kHXGQFuyluMOcfnHXJAzFMf7s(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutLink, "");
        function1.invoke(new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnLinkClick(inAppCheckoutLink));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PXGmOKJ-euAGD808dLrLu7sA_m4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15514$r8$lambda$PXGmOKJeuAGD808dLrLu7sA_m4(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnAgreeAndContinue.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QADtDbLhKgVd4K4h-Rgriv5T-Eo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15515$r8$lambda$QADtDbLhKgVd4K4hRgriv5TEo(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State state, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        EConsentScreenContent(state, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jf5r2whBWTym6vUAmzoyMZZVP-Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15516$r8$lambda$jf5r2whBWTym6vUAmzoyMZZVPQ(kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$loYAmOlpSIqPvl7vaFo8sr4vqeU(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData eConsentData, com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel eConsentViewModel, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, int i, androidx.compose.runtime.Composer composer, int i2) {
        EConsentScreen(inAppCheckoutCoordinator, eConsentData, eConsentViewModel, checkoutLogger, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$nNjeMvb0REa8nw7acSAjmnxj04E(final com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel eConsentViewModel, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt$EConsentScreen$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel.this.onEvent(new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.TrackAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ScreenDismissed.INSTANCE));
            }
        };
    }

    public static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State access$EConsentScreen$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State) state.getValue();
    }
}
