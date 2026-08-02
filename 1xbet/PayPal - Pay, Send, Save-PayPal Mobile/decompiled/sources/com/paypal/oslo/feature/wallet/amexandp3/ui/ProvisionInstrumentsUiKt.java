package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aM\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u008a\u0084\u0002"}, d2 = {com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.OPERATION_NAME, "", "requestId", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/wallet/amexandp3/ui/ProvisionInstrumentsViewModel;", "(Ljava/lang/String;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/amexandp3/ui/ProvisionInstrumentsViewModel;Landroidx/compose/runtime/Composer;I)V", "ProvisionInstrumentsErrorScreen", "errorState", "Lcom/paypal/oslo/feature/wallet/amexandp3/ui/ProvisionInstrumentsViewModel$UiState$Error;", "onManageCardsClick", "Lkotlin/Function0;", "onBackClick", "onCloseClick", "onTryAgainClick", "(Lcom/paypal/oslo/feature/wallet/amexandp3/ui/ProvisionInstrumentsViewModel$UiState$Error;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease", "uiState", "Lcom/paypal/oslo/feature/wallet/amexandp3/ui/ProvisionInstrumentsViewModel$UiState;", "navigation", "Lcom/paypal/oslo/feature/wallet/amexandp3/ui/ProvisionInstrumentsViewModel$Navigation;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProvisionInstrumentsUiKt {
    public static final void ProvisionInstruments(final java.lang.String str, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel provisionInstrumentsViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        int i4;
        androidx.compose.runtime.Composer composer3;
        int i5;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionInstrumentsViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1548810321);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(provisionInstrumentsViewModel) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1548810321, i2, -1, "com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstruments (ProvisionInstrumentsUi.kt:49)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(provisionInstrumentsViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(provisionInstrumentsViewModel.getNavigation(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11593fromValuekh8nfeM(str));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            java.lang.String m11592unboximpl = ((com.paypal.oslo.core.navigation.result.NavResultRequestId) rememberedValue).m11592unboximpl();
            com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation navigation = (com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation) collectAsStateWithLifecycle2.getValue();
            boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle2);
            boolean changedInstance = startRestartGroup.changedInstance(provisionInstrumentsViewModel);
            boolean z = (i2 & 112) == 32;
            com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (((changed | changedInstance) || z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = 1;
                i4 = 0;
                composer3 = startRestartGroup;
                rememberedValue2 = new com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$1$1(provisionInstrumentsViewModel, appNavigator, m11592unboximpl, collectAsStateWithLifecycle2, null);
                composer3.updateRememberedValue(rememberedValue2);
            } else {
                i3 = 1;
                i4 = 0;
                composer3 = startRestartGroup;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(navigation, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer3, i4);
            final com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState uiState = (com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState) collectAsStateWithLifecycle.getValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(uiState, com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Connecting.INSTANCE)) {
                composer3.startReplaceGroup(-224349949);
                composer2 = composer3;
                i5 = i4;
                com.paypal.oslo.feature.wallet.common.GenericLoaderScreenKt.GenericLoaderScreen(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_connecting_your_account, composer3, i4), null, new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(null, null, null, 7, null), composer2, 0, 2);
                composer2.endReplaceGroup();
            } else {
                composer2 = composer3;
                i5 = i4;
                if (uiState instanceof com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Error) {
                    composer2.startReplaceGroup(-224082264);
                    com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Error error = (com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Error) uiState;
                    java.lang.Object rememberedValue3 = composer2.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    boolean changedInstance2 = composer2.changedInstance(provisionInstrumentsViewModel);
                    boolean changedInstance3 = composer2.changedInstance(uiState);
                    java.lang.Object rememberedValue4 = composer2.rememberedValue();
                    if ((changedInstance2 | changedInstance3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.$r8$lambda$fYSdJIGS9OqgPPG0nR6DSXS54VI(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.this, uiState);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
                    boolean changedInstance4 = composer2.changedInstance(provisionInstrumentsViewModel);
                    boolean changedInstance5 = composer2.changedInstance(uiState);
                    java.lang.Object rememberedValue5 = composer2.rememberedValue();
                    if ((changedInstance4 | changedInstance5) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.$r8$lambda$VrN49ZHiqwr7k7CtZX_I7rCe8HU(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.this, uiState);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue5;
                    boolean changedInstance6 = composer2.changedInstance(provisionInstrumentsViewModel);
                    com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$5$1 rememberedValue6 = composer2.rememberedValue();
                    if (changedInstance6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$5$1(provisionInstrumentsViewModel);
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    ProvisionInstrumentsErrorScreen(error, function0, function02, function03, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue6), composer2, 48);
                    composer2.endReplaceGroup();
                } else if (uiState instanceof com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Success) {
                    composer2.startReplaceGroup(-223631400);
                    com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Success success = (com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Success) uiState;
                    if (success.getResult().getLinkedInstruments().size() == i3) {
                        composer2.startReplaceGroup(-223599904);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_linked_accounts_with_failure_single, composer2, i5);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-223478849);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_linked_accounts_with_failure_multiple, new java.lang.Object[]{java.lang.Integer.valueOf(success.getResult().getLinkedInstruments().size())}, composer2, i5);
                        composer2.endReplaceGroup();
                    }
                    java.lang.String str2 = stringResource;
                    if (success.getResult().getLinkedInstruments().size() == i3) {
                        composer2.startReplaceGroup(-223191758);
                        stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_set_as_preferred, composer2, i5);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-223091163);
                        stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_set_your_preferred_way_to_pay, composer2, i5);
                        composer2.endReplaceGroup();
                    }
                    java.lang.String str3 = stringResource2;
                    java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> linkedInstruments = success.getResult().getLinkedInstruments();
                    java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> nonLinkedInstruments = success.getResult().getNonLinkedInstruments();
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_done, composer2, i5);
                    java.lang.Object rememberedValue7 = composer2.rememberedValue();
                    if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue7);
                    }
                    kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue7;
                    boolean changedInstance7 = composer2.changedInstance(provisionInstrumentsViewModel);
                    boolean changedInstance8 = composer2.changedInstance(uiState);
                    java.lang.Object rememberedValue8 = composer2.rememberedValue();
                    if ((changedInstance7 | changedInstance8) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.$r8$lambda$Y1FxCZGinWcPD03sus95XUbtOHs(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.this, uiState);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue8);
                    }
                    kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue8;
                    java.lang.Object rememberedValue9 = composer2.rememberedValue();
                    if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue9);
                    }
                    kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue9;
                    boolean changedInstance9 = composer2.changedInstance(provisionInstrumentsViewModel);
                    boolean changedInstance10 = composer2.changedInstance(uiState);
                    java.lang.Object rememberedValue10 = composer2.rememberedValue();
                    if ((changedInstance9 | changedInstance10) || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.m20716$r8$lambda$N2xrvs3nngXjWgVcPelpRjRpe8(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.this, uiState);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue10);
                    }
                    com.paypal.oslo.feature.wallet.amexandp3.ui.SuccessScreenUiKt.ProvisionedInstrumentsSuccessScreen(str2, linkedInstruments, nonLinkedInstruments, str3, stringResource3, function04, function05, false, "", function06, (kotlin.jvm.functions.Function0) rememberedValue10, composer2, 918749184, 0, 0);
                    composer2.endReplaceGroup();
                } else {
                    if (uiState != null) {
                        composer2.startReplaceGroup(-1946900595);
                        composer2.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(-1946832587);
                    composer2.endReplaceGroup();
                }
            }
            boolean changedInstance11 = composer2.changedInstance(provisionInstrumentsViewModel);
            com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$10$1 rememberedValue11 = composer2.rememberedValue();
            if (changedInstance11 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$10$1(provisionInstrumentsViewModel, null);
                composer2.updateRememberedValue(rememberedValue11);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue11;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer2, i5);
            com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$$inlined$NavResultEffectrtGRyWw$1 rememberedValue12 = composer2.rememberedValue();
            if (rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$ProvisionInstruments$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m20720invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20720invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str4) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str4);
                    }
                };
                composer2.updateRememberedValue(rememberedValue12);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(m11592unboximpl, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue12, composer2, 3078);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.$r8$lambda$ZrUbIanYG3ADNY9751Mtisyzqdg(str, appNavigator, provisionInstrumentsViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProvisionInstrumentsErrorScreen(final com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Error error, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(112087649);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(error) : startRestartGroup.changedInstance(error) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(112087649, i2, -1, "com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsErrorScreen (ProvisionInstrumentsUi.kt:137)");
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Error.InstrumentCountLimitedExceeded.INSTANCE)) {
                startRestartGroup.startReplaceGroup(2013931114);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_p3_error_instrument_limit_reached_description, startRestartGroup, 0);
                com.paypal.pds.core.Icon.Alert alert = com.paypal.pds.core.Icon.Alert.INSTANCE;
                com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig = new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1575017538, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.$r8$lambda$bJ8JL_sPOR9nN7z1q5sZG1UbLPY(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, null, 6, null);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                composer3 = startRestartGroup;
                com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen("You’ve reached the limit of many cards you can add", stringResource, "Manage Cards", "", function0, (kotlin.jvm.functions.Function0) rememberedValue, walletTopBarConfig, alert, startRestartGroup, ((i2 << 9) & 57344) | 12782982);
                composer3.endReplaceGroup();
            } else if ((error instanceof com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Error.InstrumentLinkingError) || kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Error.TechnicalError.INSTANCE)) {
                startRestartGroup.startReplaceGroup(2014699201);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_error_title, startRestartGroup, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_error_description, startRestartGroup, 0);
                com.paypal.pds.core.Icon.Alert alert2 = com.paypal.pds.core.Icon.Alert.INSTANCE;
                java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_try_again, startRestartGroup, 0);
                com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig2 = new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(960108164, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.m20715$r8$lambda$2EfmSpKoa1aHApyqP70mtT93r0(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), 3, null);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(stringResource2, stringResource3, stringResource4, "", function04, (kotlin.jvm.functions.Function0) rememberedValue2, walletTopBarConfig2, alert2, startRestartGroup, (i2 & 57344) | 12782592);
                composer2.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Error.UserTriggeredError.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(342057967);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(2015430243);
                java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_your_account_was_not_linked, startRestartGroup, 0);
                com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
                java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_exit, startRestartGroup, 0);
                com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig3 = new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-379120442, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.$r8$lambda$GrKvoM4vm8SResQFmvmMeBkw9_o(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), 3, null);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                composer3 = startRestartGroup;
                com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(stringResource5, "", stringResource6, "", function03, (kotlin.jvm.functions.Function0) rememberedValue3, walletTopBarConfig3, warning, startRestartGroup, ((i2 << 3) & 57344) | 12782640);
                composer3.endReplaceGroup();
            }
            composer2 = composer3;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.$r8$lambda$RNvz0K52hr1yDTOqohSJ4ZJCJdM(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Error.this, function0, function02, function03, function04, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-2EfmSpKoa1aHApyqP70mtT93r0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20715$r8$lambda$2EfmSpKoa1aHApyqP70mtT93r0(final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(960108164, i, -1, "com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsErrorScreen.<anonymous> (ProvisionInstrumentsUi.kt:164)");
            }
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.$r8$lambda$gqorvWu9O5HHTt0fHGQdNcOjEq8(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarTrailingElementKt.WalletTopBarClose((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EY8pXYgaLJ7RoXoD4qsWZoe1TXk(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GrKvoM4vm8SResQFmvmMeBkw9_o(final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-379120442, i, -1, "com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsErrorScreen.<anonymous> (ProvisionInstrumentsUi.kt:178)");
            }
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.$r8$lambda$EY8pXYgaLJ7RoXoD4qsWZoe1TXk(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarTrailingElementKt.WalletTopBarClose((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$N2xrvs3nngXj-WgVcPelpRjRpe8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20716$r8$lambda$N2xrvs3nngXjWgVcPelpRjRpe8(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel provisionInstrumentsViewModel, com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState uiState) {
        provisionInstrumentsViewModel.onDone(((com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Success) uiState).getResult());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RNvz0K52hr1yDTOqohSJ4ZJCJdM(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Error error, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, int i, androidx.compose.runtime.Composer composer, int i2) {
        ProvisionInstrumentsErrorScreen(error, function0, function02, function03, function04, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VrN49ZHiqwr7k7CtZX_I7rCe8HU(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel provisionInstrumentsViewModel, com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState uiState) {
        provisionInstrumentsViewModel.onExitFromError(uiState.toString());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y1FxCZGinWcPD03sus95XUbtOHs(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel provisionInstrumentsViewModel, com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState uiState) {
        provisionInstrumentsViewModel.onDone(((com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Success) uiState).getResult());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZrUbIanYG3ADNY9751Mtisyzqdg(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel provisionInstrumentsViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        ProvisionInstruments(str, appNavigator, provisionInstrumentsViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bJ8JL_sPOR9nN7z1q5sZG1UbLPY(final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1575017538, i, -1, "com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsErrorScreen.<anonymous> (ProvisionInstrumentsUi.kt:149)");
            }
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.m20718$r8$lambda$jehrSpyGrTqmgemOGd4bRj8EbU(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarLeadingElementKt.WalletTopBarBack((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fYSdJIGS9OqgPPG0nR6DSXS54VI(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel provisionInstrumentsViewModel, com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState uiState) {
        provisionInstrumentsViewModel.onExitFromError(uiState.toString());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gqorvWu9O5HHTt0fHGQdNcOjEq8(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jehrSpyGrTqmgemOGd4bRj-8EbU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20718$r8$lambda$jehrSpyGrTqmgemOGd4bRj8EbU(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation access$ProvisionInstruments$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Navigation) state.getValue();
    }
}
