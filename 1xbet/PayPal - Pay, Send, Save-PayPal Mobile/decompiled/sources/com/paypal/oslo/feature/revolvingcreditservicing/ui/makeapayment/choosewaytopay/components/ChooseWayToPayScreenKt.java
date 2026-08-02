package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a1\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"ChooseWayToPayScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayViewModel;Landroidx/compose/runtime/Composer;II)V", "ChooseWayToPayScreenContent", "state", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayState;", "dontSeeBankBottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayState;Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "revolvingcredit-servicing_prodRelease", "uiState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChooseWayToPayScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChooseWayToPayScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel chooseWayToPayViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel chooseWayToPayViewModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        java.lang.Object rememberedValue;
        com.paypal.pds.components.BottomSheetController bottomSheetController;
        boolean changedInstance;
        int i5;
        boolean changed;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel chooseWayToPayViewModel3;
        int i6;
        com.paypal.pds.components.BottomSheetController bottomSheetController2;
        androidx.compose.runtime.Composer composer3;
        boolean changedInstance3;
        java.lang.Object rememberedValue3;
        java.lang.Object rememberedValue4;
        boolean changedInstance4;
        java.lang.Object rememberedValue5;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1189572833);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                chooseWayToPayViewModel2 = chooseWayToPayViewModel;
                if (startRestartGroup.changedInstance(chooseWayToPayViewModel2)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                chooseWayToPayViewModel2 = chooseWayToPayViewModel;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            chooseWayToPayViewModel2 = chooseWayToPayViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else if ((i2 & 2) != 0) {
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                    empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                }
                i4 = 0;
                chooseWayToPayViewModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i3 &= -113;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1189572833, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreen (ChooseWayToPayScreen.kt:52)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(chooseWayToPayViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(chooseWayToPayViewModel2);
                i5 = (i3 & 14) != 4 ? i4 : 1;
                changed = startRestartGroup.changed(rememberNavResultRequestId);
                changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | i5 | (changed ? 1 : 0) | (changedInstance2 ? 1 : 0)) == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    chooseWayToPayViewModel3 = chooseWayToPayViewModel2;
                    i6 = i4;
                    bottomSheetController2 = bottomSheetController;
                    composer3 = startRestartGroup;
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1(chooseWayToPayViewModel2, appNavigator, rememberNavResultRequestId, bottomSheetController, null);
                    composer3.updateRememberedValue(rememberedValue2);
                } else {
                    chooseWayToPayViewModel3 = chooseWayToPayViewModel2;
                    i6 = i4;
                    bottomSheetController2 = bottomSheetController;
                    composer3 = startRestartGroup;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer3, 6);
                changedInstance3 = composer3.changedInstance(chooseWayToPayViewModel3);
                rememberedValue3 = composer3.rememberedValue();
                if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$2$1(chooseWayToPayViewModel3, null);
                    composer3.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue3;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer3, i6);
                rememberedValue4 = composer3.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m18420invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m18420invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue4);
                }
                chooseWayToPayViewModel2 = chooseWayToPayViewModel3;
                com.paypal.pds.components.BottomSheetController bottomSheetController3 = bottomSheetController2;
                composer2 = composer3;
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue4, composer3, 3072);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState chooseWayToPayState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState) collectAsStateWithLifecycle.getValue();
                changedInstance4 = composer2.changedInstance(chooseWayToPayViewModel2);
                rememberedValue5 = composer2.rememberedValue();
                if (!changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$3$1(chooseWayToPayViewModel2);
                    composer2.updateRememberedValue(rememberedValue5);
                }
                getHighSpeedVideoFpsRangesFor(chooseWayToPayState, bottomSheetController3, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue5), composer2, com.paypal.pds.components.BottomSheetController.$stable << 3);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = 0;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(chooseWayToPayViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(chooseWayToPayViewModel2);
            if ((i3 & 14) != 4) {
            }
            changed = startRestartGroup.changed(rememberNavResultRequestId2);
            changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (((changedInstance ? 1 : 0) | i5 | (changed ? 1 : 0) | (changedInstance2 ? 1 : 0)) == 0) {
            }
            chooseWayToPayViewModel3 = chooseWayToPayViewModel2;
            i6 = i4;
            bottomSheetController2 = bottomSheetController;
            composer3 = startRestartGroup;
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1(chooseWayToPayViewModel2, appNavigator, rememberNavResultRequestId2, bottomSheetController, null);
            composer3.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer3, 6);
            changedInstance3 = composer3.changedInstance(chooseWayToPayViewModel3);
            rememberedValue3 = composer3.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$2$1(chooseWayToPayViewModel3, null);
            composer3.updateRememberedValue(rememberedValue3);
            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue3;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer3, i6);
            rememberedValue4 = composer3.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            chooseWayToPayViewModel2 = chooseWayToPayViewModel3;
            com.paypal.pds.components.BottomSheetController bottomSheetController32 = bottomSheetController2;
            composer2 = composer3;
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue4, composer3, 3072);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState chooseWayToPayState2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState) collectAsStateWithLifecycle2.getValue();
            changedInstance4 = composer2.changedInstance(chooseWayToPayViewModel2);
            rememberedValue5 = composer2.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue5 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$3$1(chooseWayToPayViewModel2);
            composer2.updateRememberedValue(rememberedValue5);
            getHighSpeedVideoFpsRangesFor(chooseWayToPayState2, bottomSheetController32, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue5), composer2, com.paypal.pds.components.BottomSheetController.$stable << 3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt.$r8$lambda$NO4HWYtG0aIfGaWm53RWVNVO28Q(com.paypal.oslo.core.navigation.AppNavigator.this, chooseWayToPayViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState chooseWayToPayState, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1425716636);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(chooseWayToPayState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1425716636, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenContent (ChooseWayToPayScreen.kt:167)");
            }
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt.m18418$r8$lambda$MsWxWPAGCIkoTpW6nrW0_ftDhA(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 1);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo readyInfo = chooseWayToPayState.getReadyInfo();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel> fundingInstrumentUiModels = readyInfo != null ? readyInfo.getFundingInstrumentUiModels() : null;
            if (fundingInstrumentUiModels == null) {
                fundingInstrumentUiModels = kotlin.collections.CollectionsKt.emptyList();
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel fundingInstrumentScreenUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel(fundingInstrumentUiModels, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_choose_way_to_pay_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, chooseWayToPayState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.Error, false, 4, null);
            boolean z2 = i3 == 256;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt.$r8$lambda$sIiNI_2lEipkkrO1PUAEjC4pW_8(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean z3 = i3 == 256;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt.$r8$lambda$X0jDmmkJ0X1JzmgKygOA_aFvdNA(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean z4 = i3 == 256;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt.$r8$lambda$PNujZdyiEBIFpXIjKfMIxXzGg5E(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            boolean z5 = i3 == 256;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt.$r8$lambda$d0XXCpv7Mc3lDJcsI33SSyQ1owk(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.FundingInstrumentSection(fundingInstrumentScreenUiModel, bottomSheetController, function12, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | (i2 & 112));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt.m18419$r8$lambda$gcabGTvZ68rUD2zeZOgSKVoCM(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.this, bottomSheetController, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CZIBXQbrkZCpleac5Axmeg7ww3E(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1210649733);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1210649733, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.Preview (ChooseWayToPayScreen.kt:189)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.ReadyInfo(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank("0", null, "Bank of America", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "8644")), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel("0", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Bank of America"), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString("Checking 8644"), null, null, null, null, null, false, null, null, null, null, 8176, null)), false, "preview-credit-account-id", 4, null));
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt.$r8$lambda$XnZATzPTZZD13pLqy282TPMGNVc((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoFpsRangesFor(ready, bottomSheetController, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt.$r8$lambda$CZIBXQbrkZCpleac5Axmeg7ww3E(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MsWxWPAGCIkoTpW-6nrW0_ftDhA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18418$r8$lambda$MsWxWPAGCIkoTpW6nrW0_ftDhA(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnBackPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NO4HWYtG0aIfGaWm53RWVNVO28Q(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel chooseWayToPayViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ChooseWayToPayScreen(appNavigator, chooseWayToPayViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PNujZdyiEBIFpXIjKfMIxXzGg5E(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnDontSeeBankClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$X0jDmmkJ0X1JzmgKygOA_aFvdNA(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnLinkBankClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XnZATzPTZZD13pLqy282TPMGNVc(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent chooseWayToPayEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chooseWayToPayEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d0XXCpv7Mc3lDJcsI33SSyQ1owk(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnTryAgainClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gcabGTvZ68rUD2zeZOg-SK-VoCM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18419$r8$lambda$gcabGTvZ68rUD2zeZOgSKVoCM(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState chooseWayToPayState, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(chooseWayToPayState, bottomSheetController, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sIiNI_2lEipkkrO1PUAEjC4pW_8(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnFundingInstrumentPressed(fundingInstrumentUiModel));
        return kotlin.Unit.INSTANCE;
    }
}
