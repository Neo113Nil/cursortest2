package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0097\u0001\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002²\u0006\n\u0010!\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"PYUSDRewardsSettingsScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/PYUSDRewardsSettingsViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/PYUSDRewardsSettingsViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PYUSDRewardsSettingsScreenContent", "pyusdRewardsFormattedRate", "", "isRewardsEnabled", "", "isLoading", "toastMessage", "onToastDismiss", "Lkotlin/Function0;", "onRewardsToggleChange", "Lkotlin/Function1;", "onUnEnrollConfirmClick", "onCloseClick", "onCancelClick", "unEnrollBottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "isRewardsPaymentOnHold", "(Ljava/lang/String;ZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/pds/components/BottomSheetController;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;III)V", "PYUSDRewardsSettingsScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "PYUSDRewardsSettingsScreenEnabledPreview", "cryptocurrency_prodRelease", "uiState", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsUiState;", "displayedSwitchState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PYUSDRewardsSettingsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x005e  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PYUSDRewardsSettingsScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        boolean z;
        kotlin.Unit unit;
        androidx.compose.runtime.State state;
        final androidx.compose.runtime.MutableState mutableState;
        ?? r12;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pYUSDRewardsSettingsViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1689985159);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(pYUSDRewardsSettingsViewModel) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1689985159, i4, -1, "com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreen (PYUSDRewardsSettingsScreen.kt:72)");
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(pYUSDRewardsSettingsViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_rewards_settings_toast_disable, startRestartGroup, 0);
                android.content.res.Resources resources = (android.content.res.Resources) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources());
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                boolean changedInstance = startRestartGroup.changedInstance(pYUSDRewardsSettingsViewModel);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$1$1(pYUSDRewardsSettingsViewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue3;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m14016invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m14016invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean changedInstance2 = startRestartGroup.changedInstance(pYUSDRewardsSettingsViewModel);
                boolean changedInstance3 = startRestartGroup.changedInstance(bottomSheetController);
                boolean changedInstance4 = startRestartGroup.changedInstance(resources);
                boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                boolean changed2 = startRestartGroup.changed(stringResource);
                if ((i4 & 14) == 4) {
                    str = rememberNavResultRequestId;
                    z = true;
                } else {
                    str = rememberNavResultRequestId;
                    z = false;
                }
                boolean changed3 = startRestartGroup.changed(str);
                java.lang.String str2 = str;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (((z | changedInstance2 | changedInstance3 | changedInstance4 | changed | changed2) || changed3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    unit = unit2;
                    state = collectAsStateWithLifecycle;
                    mutableState = mutableState2;
                    r12 = 0;
                    rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$2$1(pYUSDRewardsSettingsViewModel, bottomSheetController, mutableState2, resources, stringResource, appNavigator, str2, state, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                } else {
                    mutableState = mutableState2;
                    unit = unit2;
                    r12 = 0;
                    state = collectAsStateWithLifecycle;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
                if (((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) state.getValue()).isLoading()) {
                    startRestartGroup.startReplaceGroup(-739177002);
                    modifier3 = modifier5;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), "PYUSDRewardsSettingsLoadingState");
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), r12);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r12));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                    composer2 = startRestartGroup;
                } else {
                    modifier3 = modifier5;
                    startRestartGroup.startReplaceGroup(-738796973);
                    java.lang.String pyusdRewardsFormattedRate = ((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) state.getValue()).getPyusdRewardsFormattedRate();
                    boolean isRewardsEnabled = ((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) state.getValue()).isRewardsEnabled();
                    boolean isToggleLoading = ((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) state.getValue()).isToggleLoading();
                    boolean isRewardsPaymentOnHold = ((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) state.getValue()).isRewardsPaymentOnHold();
                    java.lang.String str3 = (java.lang.String) mutableState.getValue();
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda26
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.$r8$lambda$M0xswZoGJtrRxQwzxxrBvFEVGDo(androidx.compose.runtime.MutableState.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue6;
                    boolean changedInstance5 = startRestartGroup.changedInstance(pYUSDRewardsSettingsViewModel);
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance5 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda27
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.$r8$lambda$1eSlc9pYJEQx0PZgwM_qtVU_dFY(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel.this, ((java.lang.Boolean) obj).booleanValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue7;
                    boolean changedInstance6 = startRestartGroup.changedInstance(bottomSheetController);
                    boolean changedInstance7 = startRestartGroup.changedInstance(pYUSDRewardsSettingsViewModel);
                    java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if ((changedInstance6 | changedInstance7) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda28
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.m14009$r8$lambda$EszUMns0ftugk21VB_5XptwHLM(com.paypal.pds.components.BottomSheetController.this, pYUSDRewardsSettingsViewModel);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue8;
                    boolean changedInstance8 = startRestartGroup.changedInstance(bottomSheetController);
                    boolean changedInstance9 = startRestartGroup.changedInstance(pYUSDRewardsSettingsViewModel);
                    java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if ((changedInstance8 | changedInstance9) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.$r8$lambda$0U1k2lJyVtQ9MXmM9IU_LTF5bsk(com.paypal.pds.components.BottomSheetController.this, pYUSDRewardsSettingsViewModel);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue9;
                    boolean changedInstance10 = startRestartGroup.changedInstance(bottomSheetController);
                    boolean changedInstance11 = startRestartGroup.changedInstance(pYUSDRewardsSettingsViewModel);
                    java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                    if ((changedInstance10 | changedInstance11) || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.$r8$lambda$d3MB0AJecLFg6kvfQwq2UfZtJ7E(com.paypal.pds.components.BottomSheetController.this, pYUSDRewardsSettingsViewModel);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue10);
                    }
                    composer2 = startRestartGroup;
                    PYUSDRewardsSettingsScreenContent(pyusdRewardsFormattedRate, isRewardsEnabled, isToggleLoading, str3, function0, function1, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue10, bottomSheetController, modifier3, isRewardsPaymentOnHold, composer2, (com.paypal.pds.components.BottomSheetController.$stable << 27) | 24576, (i4 >> 6) & 14, 0);
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.m14013$r8$lambda$mR2jH_l_zZBAUrrVEZSLM7ZTWM(com.paypal.oslo.core.navigation.AppNavigator.this, pYUSDRewardsSettingsViewModel, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ac, code lost:
    
        if (r7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L130;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PYUSDRewardsSettingsScreenContent(final java.lang.String str, final boolean z, final boolean z2, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, final com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.ui.Modifier modifier, boolean z3, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier2;
        final boolean z4;
        int i6;
        final com.paypal.pds.components.BottomSheetController bottomSheetController2;
        boolean z5;
        final androidx.compose.runtime.MutableState mutableState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1603175365);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function04) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= (1073741824 & i) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 536870912 : 268435456;
        }
        int i7 = i4;
        int i8 = i3 & 1024;
        if (i8 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i9 = i3 & 2048;
        if (i9 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(z3) ? 32 : 16;
        }
        int i10 = i5;
        if (!startRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i10 & 19) == 18) ? false : true, i7 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
            z4 = z3;
        } else {
            androidx.compose.ui.Modifier modifier3 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
            boolean z6 = i9 != 0 ? false : z3;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1603175365, i7, i10, "com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenContent (PYUSDRewardsSettingsScreen.kt:170)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController3 = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(z), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
            int i11 = i7 & 112;
            boolean z7 = i11 == 32;
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreenContent$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (z7) {
                i6 = i11;
            } else {
                i6 = i11;
            }
            rememberedValue3 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreenContent$1$1(z, mutableState2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, (i7 >> 3) & 14);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            androidx.compose.ui.Modifier modifier4 = modifier3;
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
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_rewards_settings_accrual_description, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            boolean booleanValue = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
            boolean z8 = (458752 & i7) == 131072;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z8 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.m14005$r8$lambda$4v3Y8SRYuq6KMRPtSZAqD1Db4g(kotlin.jvm.functions.Function1.this, mutableState2, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            int i12 = i6;
            modifier2 = modifier4;
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsToggleCardKt.CryptoPYUSDRewardsToggleCard(str, booleanValue, z2, (kotlin.jvm.functions.Function1) rememberedValue4, null, startRestartGroup, i7 & 910, 16);
            composer2 = startRestartGroup;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_rewards_annual_rate_disclaimer, composer2, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoRichTextUtilsKt.toCryptoRichText$default(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_rewards_legal_paypal_with_terms, new java.lang.Object[]{com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoDeeplinkConstants.PYUSD_REWARDS_TERMS}, composer2, 0), null, 1, null), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, null, composer2, 384, 48, 6138);
            if (z6) {
                composer2.startReplaceGroup(-517553192);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Warning.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_rewards_payment_hold, composer2, 0), null, com.paypal.pds.components.IconSize.XSmall.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE, composer2, 27654, 4);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer2, 0);
                z5 = true;
                com.paypal.pds.core.RichText cryptoRichText$default = com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoRichTextUtilsKt.toCryptoRichText$default(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_rewards_hold_learn_more_message, new java.lang.Object[]{com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoDeeplinkConstants.PYUSD_REWARDS_PAYMENT_HOLD}, composer2, 0), null, 1, null);
                com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "pyusd_settings_payment_hold_label");
                com.paypal.pds.core.Color.ContentMuted contentMuted2 = contentMuted;
                bottomSheetController2 = bottomSheetController3;
                boolean changedInstance = composer2.changedInstance(bottomSheetController2);
                java.lang.Object rememberedValue5 = composer2.rememberedValue();
                if (changedInstance || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.m14003$r8$lambda$1Lxfmyf6cmsB2yNeioJOCNYZiw(com.paypal.pds.components.BottomSheetController.this, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(cryptoRichText$default, testTag, contentMuted2, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue5, bodySmall, null, composer2, 432, 48, 5112);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                bottomSheetController2 = bottomSheetController3;
                z5 = true;
                composer2.startReplaceGroup(-515974269);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            java.lang.Object rememberedValue6 = composer2.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue6;
            boolean z9 = i12 == 32 ? z5 : false;
            boolean z10 = (i7 & 29360128) == 8388608;
            java.lang.Object rememberedValue7 = composer2.rememberedValue();
            if ((z9 || z10) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState2;
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.m14006$r8$lambda$9E_rvv1LqBXc7SS3FvnTJedigo(z, function03, mutableState);
                    }
                };
                composer2.updateRememberedValue(rememberedValue7);
            } else {
                mutableState = mutableState2;
            }
            kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue7;
            boolean z11 = (i7 & 3670016) == 1048576;
            java.lang.Object rememberedValue8 = composer2.rememberedValue();
            if (z11 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.m14014$r8$lambda$piAGYssAPBn5rtHrQZULvEecuA(kotlin.jvm.functions.Function0.this, mutableState);
                    }
                };
                composer2.updateRememberedValue(rememberedValue8);
            }
            kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) rememberedValue8;
            boolean z12 = i12 == 32;
            boolean z13 = (i7 & 234881024) == 67108864;
            java.lang.Object rememberedValue9 = composer2.rememberedValue();
            if ((z12 | z13) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.$r8$lambda$SEOcIC28OoT_1PoOpqXX4udegPQ(z, function04, mutableState);
                    }
                };
                composer2.updateRememberedValue(rememberedValue9);
            }
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsUnEnrollBottomSheetKt.CryptoPYUSDRewardsUnEnrollBottomSheet(bottomSheetController, function05, function06, function07, (kotlin.jvm.functions.Function0) rememberedValue9, composer2, 48 | com.paypal.pds.components.BottomSheetController.$stable | ((i7 >> 27) & 14));
            boolean changedInstance2 = composer2.changedInstance(bottomSheetController2);
            java.lang.Object rememberedValue10 = composer2.rememberedValue();
            if (changedInstance2 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.m14008$r8$lambda$Bc9uKnn6reqYyDaulSCs1nnQiE(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue10);
            }
            kotlin.jvm.functions.Function0 function08 = (kotlin.jvm.functions.Function0) rememberedValue10;
            boolean changedInstance3 = composer2.changedInstance(bottomSheetController2);
            java.lang.Object rememberedValue11 = composer2.rememberedValue();
            if (changedInstance3 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.$r8$lambda$usQJSzSq5E8gs_Q8aPXBJNB0FJE(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue11);
            }
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.components.CryptoPYUSDRewardsCannotPerformPayoutBottomSheetKt.CryptoPYUSDRewardsCannotPerformPayoutBottomSheet(bottomSheetController2, function08, (kotlin.jvm.functions.Function0) rememberedValue11, composer2, com.paypal.pds.components.BottomSheetController.$stable);
            if (str2 == null) {
                composer2.startReplaceGroup(-1177339802);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1177339801);
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), "PYUSDRewardsSettingsToast");
                boolean z14 = (i7 & 57344) == 16384;
                java.lang.Object rememberedValue12 = composer2.rememberedValue();
                if (z14 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.m14012$r8$lambda$kRDkPLeqKnK1KNeaFv5hjKapqs(kotlin.jvm.functions.Function0.this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue12);
                }
                com.paypal.pds.components.ToastKt.Toast(str2, testTag2, null, (kotlin.jvm.functions.Function1) rememberedValue12, composer2, 0, 4);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                composer2.endReplaceGroup();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            z4 = z6;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final androidx.compose.ui.Modifier modifier5 = modifier2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.$r8$lambda$ZawNYl4dbCE5gCklhaSeBFAlpf4(str, z, z2, str2, function0, function1, function02, function03, function04, bottomSheetController, modifier5, z4, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0U1k2lJyVtQ9MXmM9IU_LTF5bsk(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel) {
        bottomSheetController.hideSheet();
        pYUSDRewardsSettingsViewModel.handleEvent$cryptocurrency_prodRelease(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollCloseClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1Lxfmyf6cmsB2yNeioJOC-NYZiw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14003$r8$lambda$1Lxfmyf6cmsB2yNeioJOCNYZiw(final com.paypal.pds.components.BottomSheetController bottomSheetController, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoLinkClickHandler.INSTANCE.handleLinkClick(str2, com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoDeeplinkConstants.PYUSD_REWARDS_PAYMENT_HOLD, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.m14011$r8$lambda$hniCMjzCTqbzYTEb8jKI2oaz2E(com.paypal.pds.components.BottomSheetController.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1eSlc9pYJEQx0PZgwM_qtVU_dFY(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel, boolean z) {
        pYUSDRewardsSettingsViewModel.handleEvent$cryptocurrency_prodRelease(new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.RewardsToggleChange(z));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3kkDDSOH5uW2uJ2kO-mzovkhvaU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14004$r8$lambda$3kkDDSOH5uW2uJ2kOmzovkhvaU(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4-v3Y8SRYuq6KMRPtSZAqD1Db4g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14005$r8$lambda$4v3Y8SRYuq6KMRPtSZAqD1Db4g(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, boolean z) {
        if (!z) {
            function1.invoke(java.lang.Boolean.FALSE);
        } else {
            mutableState.setValue(java.lang.Boolean.TRUE);
            function1.invoke(java.lang.Boolean.TRUE);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9E_rvv1LqBXc7SS3F-vnTJedigo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14006$r8$lambda$9E_rvv1LqBXc7SS3FvnTJedigo(boolean z, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Bc9uKnn-6reqYyDaulSCs1nnQiE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14008$r8$lambda$Bc9uKnn6reqYyDaulSCs1nnQiE(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EszUMns0ftugk21VB_5Xpt-wHLM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14009$r8$lambda$EszUMns0ftugk21VB_5XptwHLM(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel) {
        bottomSheetController.hideSheet();
        pYUSDRewardsSettingsViewModel.handleEvent$cryptocurrency_prodRelease(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollConfirmClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I85NrPNxdB3ncbqnRCFI_6qyB1o(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2107596549);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2107596549, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenEnabledPreview (PYUSDRewardsSettingsScreen.kt:356)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
            boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.m14010$r8$lambda$LLwxWo8BHqUIpAY66foJ01THWs(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            composer2 = startRestartGroup;
            PYUSDRewardsSettingsScreenContent("4", booleanValue, false, null, function0, function1, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue7, bottomSheetController, null, false, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 27) | 115043718, 0, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.$r8$lambda$I85NrPNxdB3ncbqnRCFI_6qyB1o(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LLw-xWo8BHqUIpAY66foJ01THWs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14010$r8$lambda$LLwxWo8BHqUIpAY66foJ01THWs(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M0xswZoGJtrRxQwzxxrBvFEVGDo(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SEOcIC28OoT_1PoOpqXX4udegPQ(boolean z, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VTd08vu0kEoBOydFfgM_PNFR3Y4(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-26280478);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-26280478, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenPreview (PYUSDRewardsSettingsScreen.kt:332)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
            boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.m14004$r8$lambda$3kkDDSOH5uW2uJ2kOmzovkhvaU(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            composer2 = startRestartGroup;
            PYUSDRewardsSettingsScreenContent("4", booleanValue, false, null, function0, function1, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue7, bottomSheetController, null, false, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 27) | 115043718, 0, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.$r8$lambda$VTd08vu0kEoBOydFfgM_PNFR3Y4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZawNYl4dbCE5gCklhaSeBFAlpf4(java.lang.String str, boolean z, boolean z2, java.lang.String str2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.ui.Modifier modifier, boolean z3, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        PYUSDRewardsSettingsScreenContent(str, z, z2, str2, function0, function1, function02, function03, function04, bottomSheetController, modifier, z3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d3MB0AJecLFg6kvfQwq2UfZtJ7E(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel) {
        bottomSheetController.hideSheet();
        pYUSDRewardsSettingsViewModel.handleEvent$cryptocurrency_prodRelease(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollCancelClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hniCMjzCTqbzYTEb8-jKI2oaz2E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14011$r8$lambda$hniCMjzCTqbzYTEb8jKI2oaz2E(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kRDkPL-eqKnK1KNeaFv5hjKapqs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14012$r8$lambda$kRDkPLeqKnK1KNeaFv5hjKapqs(kotlin.jvm.functions.Function0 function0, boolean z) {
        if (!z) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mR2jH_l_zZBA-UrrVEZSLM7ZTWM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14013$r8$lambda$mR2jH_l_zZBAUrrVEZSLM7ZTWM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PYUSDRewardsSettingsScreen(appNavigator, pYUSDRewardsSettingsViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$piAGYssAPBn5rtHrQZU-LvEecuA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14014$r8$lambda$piAGYssAPBn5rtHrQZULvEecuA(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$usQJSzSq5E8gs_Q8aPXBJNB0FJE(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState access$PYUSDRewardsSettingsScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) state.getValue();
    }
}
