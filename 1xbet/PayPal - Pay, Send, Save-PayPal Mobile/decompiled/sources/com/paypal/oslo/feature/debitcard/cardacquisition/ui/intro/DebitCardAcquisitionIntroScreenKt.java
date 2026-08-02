package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro;

@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a=\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0013\u001aO\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0003¢\u0006\u0002\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020 2\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"DebitCardAcquisitionIntroScreen", "", "introViewModel", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/viewmodel/DebitCardAcquisitionIntroViewModel;", "termsViewModel", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/viewmodel/TermsConditionsViewModel;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/viewmodel/DebitCardAcquisitionIntroViewModel;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/viewmodel/TermsConditionsViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "EligibleContent", "uiState", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState$Eligible;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "introBottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState$Eligible;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/viewmodel/DebitCardAcquisitionIntroViewModel;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/viewmodel/TermsConditionsViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/pds/components/BottomSheetController;Landroidx/compose/runtime/Composer;I)V", "IneligibleErrorContent", "viewModel", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/viewmodel/DebitCardAcquisitionIntroViewModel;Landroidx/compose/runtime/Composer;I)V", "DebitCardAcquisitionIntroErrorContent", "errorType", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "onAction", "Lkotlin/Function0;", "onDismiss", "modifier", "Landroidx/compose/ui/Modifier;", "retryCount", "", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "TrackStatesAnalytics", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState;", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Landroidx/compose/runtime/Composer;I)V", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardAcquisitionIntroScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:62:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebitCardAcquisitionIntroScreen(final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel, final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel termsConditionsViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        com.paypal.pds.components.BottomSheetController bottomSheetController;
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardAcquisitionIntroViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsConditionsViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-599624828);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(debitCardAcquisitionIntroViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(termsConditionsViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-599624828, i3, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreen (DebitCardAcquisitionIntroScreen.kt:59)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName = debitCardAcquisitionIntroViewModel.getProductName();
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState debitCardAcquisitionIntroState = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(debitCardAcquisitionIntroViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            boolean changedInstance = startRestartGroup.changedInstance(debitCardAcquisitionIntroViewModel);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$1$1(appNavigator, debitCardAcquisitionIntroViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m14246invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m14246invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 3072);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance2 = startRestartGroup.changedInstance(debitCardAcquisitionIntroViewModel);
            boolean changedInstance3 = startRestartGroup.changedInstance(bottomSheetController2);
            boolean z2 = i4 == 256;
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            boolean changed2 = startRestartGroup.changed(productName.ordinal());
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (((changedInstance2 | changedInstance3 | z2 | changed) || changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                bottomSheetController = bottomSheetController2;
                unit = unit2;
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$2$1(debitCardAcquisitionIntroViewModel, bottomSheetController, appNavigator, rememberNavResultRequestId, productName, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                bottomSheetController = bottomSheetController2;
                unit = unit2;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
            getHighSpeedVideoSizes(debitCardAcquisitionIntroState, productName, startRestartGroup, 0);
            if (debitCardAcquisitionIntroState instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Loading) {
                startRestartGroup.startReplaceGroup(-651643197);
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else if (debitCardAcquisitionIntroState instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Eligible) {
                startRestartGroup.startReplaceGroup(-651243607);
                getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Eligible) debitCardAcquisitionIntroState, productName, debitCardAcquisitionIntroViewModel, termsConditionsViewModel, appNavigator, bottomSheetController, startRestartGroup, ((i3 << 6) & 65408) | (com.paypal.pds.components.BottomSheetController.$stable << 15));
                startRestartGroup.endReplaceGroup();
            } else if (debitCardAcquisitionIntroState instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.EligibleWithCondition) {
                startRestartGroup.startReplaceGroup(-650844327);
                Camera2StreamConfigurationMap(productName, debitCardAcquisitionIntroViewModel, startRestartGroup, (i3 << 3) & 112);
                startRestartGroup.endReplaceGroup();
            } else if (debitCardAcquisitionIntroState instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Ineligible) {
                startRestartGroup.startReplaceGroup(-650670820);
                if (com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponseKt.hasSimilarProductExists(((com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Ineligible) debitCardAcquisitionIntroState).getResponse())) {
                    startRestartGroup.startReplaceGroup(-650516130);
                    androidx.compose.ui.Modifier background2 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background2);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-650199279);
                    Camera2StreamConfigurationMap(productName, debitCardAcquisitionIntroViewModel, startRestartGroup, (i3 << 3) & 112);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endReplaceGroup();
            } else if (debitCardAcquisitionIntroState instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Error) {
                startRestartGroup.startReplaceGroup(-650018270);
                com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Error error = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Error) debitCardAcquisitionIntroState;
                com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType = error.getErrorType();
                boolean changedInstance4 = startRestartGroup.changedInstance(debitCardAcquisitionIntroViewModel);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.$r8$lambda$GCY0RNjqErpKlsH_RGTRnyJiZDs(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
                boolean changedInstance5 = startRestartGroup.changedInstance(debitCardAcquisitionIntroViewModel);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.m14242$r8$lambda$TCO9uoZHuWUP2oNEP4X1MX7TE(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                composer2 = startRestartGroup;
                getHighResolutionOutputSizeshNQ4ISI(errorType, productName, function0, (kotlin.jvm.functions.Function0) rememberedValue6, null, java.lang.Integer.valueOf(error.getRetryCount()), composer2, 0, 16);
                composer2.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.startReplaceGroup(-713757841);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer2 = startRestartGroup;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.$r8$lambda$tPeXOPWK1mpx9bNq9RXnO931uKo(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.this, termsConditionsViewModel, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Eligible eligible, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel, final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel termsConditionsViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String stringResource;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1761162182);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(eligible) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(debitCardAcquisitionIntroViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(termsConditionsViewModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 131072 : 65536;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1761162182, i3, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.EligibleContent (DebitCardAcquisitionIntroScreen.kt:185)");
            }
            java.lang.Object value = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(debitCardAcquisitionIntroViewModel.getUserStore().getUserState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
            com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
            boolean isUSUser = profileLoaded != null ? com.paypal.oslo.feature.debitcard.shared.util.UserStoreExtensionsKt.isUSUser(profileLoaded) : false;
            if (isUSUser) {
                startRestartGroup.startReplaceGroup(259759335);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_bdmc_intro_cta_button, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(259762037);
                int i4 = com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_bdmc_intro_eu_uk_cta_button;
                java.lang.String displayProductName = com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroStateExtensionsKt.getDisplayProductName(eligible);
                if (displayProductName == null) {
                    displayProductName = "";
                }
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i4, new java.lang.Object[]{displayProductName}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            java.lang.String str = stringResource;
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionSection> createDebitCardAcquisitionIntroScreen = com.paypal.oslo.feature.debitcard.cardacquisition.DebitCardAcquisitionScreenDataKt.createDebitCardAcquisitionIntroScreen(eligible, isUSUser, startRestartGroup, i3 & 14, 0);
            boolean changedInstance = startRestartGroup.changedInstance(debitCardAcquisitionIntroViewModel);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.$r8$lambda$yZB61zhzMN9tUvov7Nn4BI4RNnc(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance2 = startRestartGroup.changedInstance(debitCardAcquisitionIntroViewModel);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.m14243$r8$lambda$Wm5NXT8YzMb2ip9t0j77oKw1SE(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            boolean z = isUSUser;
            boolean z2 = false;
            com.paypal.oslo.feature.debitcard.cardacquisition.DebitCardAcquisitionIntroScreenContentKt.DebitCardAcquisitionIntroScreenContent(debitCardProductName, createDebitCardAcquisitionIntroScreen, background, str, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, (i3 >> 3) & 14, 0);
            if (debitCardProductName == com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.BUSINESS_DEBIT_CARD && z) {
                startRestartGroup.startReplaceGroup(-536453146);
                startRestartGroup.startReplaceGroup(259789452);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_terms_sheet_issuer_text, startRestartGroup, 0));
                sb.append("\n\n");
                sb.append(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_terms_sheet_cashback_text, new java.lang.Object[]{com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.BDMC_US_CASHBACK_PERCENTAGE}, startRestartGroup, 0));
                sb.append("\n\n");
                sb.append(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_terms_sheet_agreement_text, startRestartGroup, 0));
                java.lang.String obj = sb.toString();
                startRestartGroup.endReplaceGroup();
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_terms_sheet_title, startRestartGroup, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_agree_and_continue, startRestartGroup, 0);
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_terms_sheet_cardholder_agreement, startRestartGroup, 0), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.BDMC_CARD_HOLDER_AGREEMENT_URL), kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_terms_sheet_cardholder_agreement_full, startRestartGroup, 0), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.BDMC_CARD_HOLDER_AGREEMENT_URL), kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_terms_sheet_privacy_policy, startRestartGroup, 0), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.BDMC_PRIVACY_POLICY_URL)});
                boolean z3 = (i3 & 57344) == 16384;
                if ((i3 & 112) == 32) {
                    z2 = true;
                }
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((z2 | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.$r8$lambda$Ugwf7FIvzZsEL2g9nvnM1yAk20M(com.paypal.oslo.core.navigation.AppNavigator.this, debitCardProductName);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.TermsConditionsBottomSheetKt.TermsConditionsBottomSheet(stringResource2, obj, stringResource3, bottomSheetController, termsConditionsViewModel, (kotlin.jvm.functions.Function0) rememberedValue3, listOf, composer2, (com.paypal.pds.components.BottomSheetController.$stable << 9) | ((i3 >> 6) & 7168) | (57344 & (i3 << 3)), 0);
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-534740644);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.m14245$r8$lambda$jFOqghUiXGxbQl1aCc9cHXCrqk(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Eligible.this, debitCardProductName, debitCardAcquisitionIntroViewModel, termsConditionsViewModel, appNavigator, bottomSheetController, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(620914853);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(debitCardProductName.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(debitCardAcquisitionIntroViewModel) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(620914853, i2, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.IneligibleErrorContent (DebitCardAcquisitionIntroScreen.kt:265)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.INELIGIBLE;
            boolean changedInstance = startRestartGroup.changedInstance(debitCardAcquisitionIntroViewModel);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.$r8$lambda$KNoex8geH9j7oFkwhQ107sjJobE(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance2 = startRestartGroup.changedInstance(debitCardAcquisitionIntroViewModel);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.$r8$lambda$SIJ0OvxjVz2xQx8joSGh2ORIWwY(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighResolutionOutputSizeshNQ4ISI(debitErrorType, debitCardProductName, function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, ((i2 << 3) & 112) | 6, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.$r8$lambda$O1QvKPsnzRO8svJnIi1r3hlwFyc(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.this, debitCardAcquisitionIntroViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, java.lang.Integer num, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.Integer num2;
        final java.lang.Integer num3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1644772609);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(debitErrorType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                num2 = num;
                i3 |= startRestartGroup.changed(num2) ? 131072 : 65536;
                if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    num3 = num2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.Integer num4 = i4 != 0 ? null : num2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1644772609, i3, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroErrorContent (DebitCardAcquisitionIntroScreen.kt:292)");
                    }
                    androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                    int i6 = i3 >> 3;
                    java.lang.Integer num5 = num4;
                    com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.DebitErrorScreen(debitErrorType, function0, function02, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAcquisitionIntroAnalytics.INSTANCE.getUserIntent(debitCardProductName), background, true, num5, null, startRestartGroup, (i6 & 896) | (i3 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i6 & 112) | (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | ((i3 << 3) & 3670016), 128);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    num3 = num4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.$r8$lambda$9XkpgVGFeqVA4atw8aJRBArGLLs(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.this, debitCardProductName, function0, function02, modifier3, num3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            num2 = num;
            if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        num2 = num;
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState debitCardAcquisitionIntroState, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1733879534);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(debitCardAcquisitionIntroState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1733879534, i2, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.TrackStatesAnalytics (DebitCardAcquisitionIntroScreen.kt:310)");
            }
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(debitCardAcquisitionIntroState.getClass());
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$TrackStatesAnalytics$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$TrackStatesAnalytics$1$1(debitCardAcquisitionIntroState, debitCardProductName, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.$r8$lambda$1Wt07QzSSq5ibiMpkpJiYcULIcM(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.this, debitCardProductName, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1Wt07QzSSq5ibiMpkpJiYcULIcM(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState debitCardAcquisitionIntroState, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(debitCardAcquisitionIntroState, debitCardProductName, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9XkpgVGFeqVA4atw8aJRBArGLLs(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, java.lang.Integer num, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(debitErrorType, debitCardProductName, function0, function02, modifier, num, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GCY0RNjqErpKlsH_RGTRnyJiZDs(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel) {
        debitCardAcquisitionIntroViewModel.processEvent(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.ErrorActionCtaClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KNoex8geH9j7oFkwhQ107sjJobE(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel) {
        debitCardAcquisitionIntroViewModel.processEvent(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.ErrorDismissCtaClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O1QvKPsnzRO8svJnIi1r3hlwFyc(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(debitCardProductName, debitCardAcquisitionIntroViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SIJ0OvxjVz2xQx8joSGh2ORIWwY(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel) {
        debitCardAcquisitionIntroViewModel.processEvent(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.ErrorDismissCtaClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TCO9uoZHuWUP2-oNEP4-X1MX7TE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14242$r8$lambda$TCO9uoZHuWUP2oNEP4X1MX7TE(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel) {
        debitCardAcquisitionIntroViewModel.processEvent(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.ErrorDismissCtaClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ugwf7FIvzZsEL2g9nvnM1yAk20M(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt.m14244$r8$lambda$Xdp8b27XxNxqytwvBC4WPfPvIY(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Wm5NXT8YzMb2-ip9t0j77oKw1SE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14243$r8$lambda$Wm5NXT8YzMb2ip9t0j77oKw1SE(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel) {
        debitCardAcquisitionIntroViewModel.processEvent(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.GetDebitCardButtonClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Xdp8b27XxNxqytwvBC4W-PfPvIY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14244$r8$lambda$Xdp8b27XxNxqytwvBC4WPfPvIY(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardApplyAndCreateDestination(debitCardProductName, false));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$j-FOqghUiXGxbQl1aCc9cHXCrqk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14245$r8$lambda$jFOqghUiXGxbQl1aCc9cHXCrqk(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Eligible eligible, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel termsConditionsViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.pds.components.BottomSheetController bottomSheetController, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(eligible, debitCardProductName, debitCardAcquisitionIntroViewModel, termsConditionsViewModel, appNavigator, bottomSheetController, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tPeXOPWK1mpx9bNq9RXnO931uKo(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel termsConditionsViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        DebitCardAcquisitionIntroScreen(debitCardAcquisitionIntroViewModel, termsConditionsViewModel, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yZB61zhzMN9tUvov7Nn4BI4RNnc(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel) {
        debitCardAcquisitionIntroViewModel.processEvent(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.CrossButtonClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
