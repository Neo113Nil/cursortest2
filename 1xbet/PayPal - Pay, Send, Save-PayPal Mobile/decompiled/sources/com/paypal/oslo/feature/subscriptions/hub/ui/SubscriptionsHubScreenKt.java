package com.paypal.oslo.feature.subscriptions.hub.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u001e\u0010\t\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0080@¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"SubscriptionsHubScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/viewmodel/SubscriptionsHubViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/subscriptions/hub/ui/viewmodel/SubscriptionsHubViewModel;Landroidx/compose/runtime/Composer;II)V", "collectUiEffects", "(Lcom/paypal/oslo/feature/subscriptions/hub/ui/viewmodel/SubscriptionsHubViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SubscriptionsHubScreenContent", "uiState", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionsHubEvent;", "(Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionsHubUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionsHubScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubscriptionsHubScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel subscriptionsHubViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel subscriptionsHubViewModel2;
        androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel subscriptionsHubViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean changedInstance;
        boolean z;
        com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$SubscriptionsHubScreen$1$1 rememberedValue;
        boolean changedInstance2;
        com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$SubscriptionsHubScreen$2$1 rememberedValue2;
        com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$SubscriptionsHubScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue3;
        boolean changedInstance3;
        com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$SubscriptionsHubScreen$3$1 rememberedValue4;
        com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$SubscriptionsHubScreen$$inlined$NavResultEffectrtGRyWw$2 rememberedValue5;
        boolean changedInstance4;
        java.lang.Object rememberedValue6;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(56527354);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    subscriptionsHubViewModel2 = subscriptionsHubViewModel;
                    if (startRestartGroup.changedInstance(subscriptionsHubViewModel2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    subscriptionsHubViewModel2 = subscriptionsHubViewModel;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                subscriptionsHubViewModel2 = subscriptionsHubViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                } else {
                    modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
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
                        i4 = i3 & (-897);
                        subscriptionsHubViewModel3 = (com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(56527354, i4, -1, "com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreen (SubscriptionsHubScreen.kt:60)");
                        }
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(subscriptionsHubViewModel3.getUiState$subscriptions_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance = startRestartGroup.changedInstance(subscriptionsHubViewModel3);
                        z = (i4 & 14) == 4;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$SubscriptionsHubScreen$1$1(subscriptionsHubViewModel3, appNavigator, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                        java.lang.String agreementUpdateRequestId = subscriptionsHubViewModel3.getAgreementUpdateRequestId();
                        changedInstance2 = startRestartGroup.changedInstance(subscriptionsHubViewModel3);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$SubscriptionsHubScreen$2$1(subscriptionsHubViewModel3, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$SubscriptionsHubScreen$$inlined$NavResultEffect-rtGRyWw$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m19883invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19883invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(agreementUpdateRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 3072);
                        java.lang.String linkFlowRequestId = subscriptionsHubViewModel3.getLinkFlowRequestId();
                        changedInstance3 = startRestartGroup.changedInstance(subscriptionsHubViewModel3);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$SubscriptionsHubScreen$3$1(subscriptionsHubViewModel3, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue4;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$SubscriptionsHubScreen$$inlined$NavResultEffect-rtGRyWw$2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m19884invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19884invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(linkFlowRequestId, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
                        com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState subscriptionsHubUiState = (com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState) collectAsStateWithLifecycle.getValue();
                        changedInstance4 = startRestartGroup.changedInstance(subscriptionsHubViewModel3);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changedInstance4 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt.m19882$r8$lambda$COpJfC_EQsareiEpyh6j4l67Sw(com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel.this, (com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        SubscriptionsHubScreenContent(subscriptionsHubUiState, (kotlin.jvm.functions.Function1) rememberedValue6, modifier3, startRestartGroup, (i4 << 3) & 896, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        i4 = i3;
                    }
                }
                subscriptionsHubViewModel3 = subscriptionsHubViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(subscriptionsHubViewModel3.getUiState$subscriptions_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(subscriptionsHubViewModel3);
                if ((i4 & 14) == 4) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z)) {
                }
                rememberedValue = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$SubscriptionsHubScreen$1$1(subscriptionsHubViewModel3, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                java.lang.String agreementUpdateRequestId2 = subscriptionsHubViewModel3.getAgreementUpdateRequestId();
                changedInstance2 = startRestartGroup.changedInstance(subscriptionsHubViewModel3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue2 = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$SubscriptionsHubScreen$2$1(subscriptionsHubViewModel3, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) rememberedValue2;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager3 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(agreementUpdateRequestId2, resolveNavResultManager3, function23, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 3072);
                java.lang.String linkFlowRequestId2 = subscriptionsHubViewModel3.getLinkFlowRequestId();
                changedInstance3 = startRestartGroup.changedInstance(subscriptionsHubViewModel3);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue4 = new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$SubscriptionsHubScreen$3$1(subscriptionsHubViewModel3, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                kotlin.jvm.functions.Function2 function222 = (kotlin.jvm.functions.Function2) rememberedValue4;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager22 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(linkFlowRequestId2, resolveNavResultManager22, function222, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
                com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState subscriptionsHubUiState2 = (com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState) collectAsStateWithLifecycle2.getValue();
                changedInstance4 = startRestartGroup.changedInstance(subscriptionsHubViewModel3);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt.m19882$r8$lambda$COpJfC_EQsareiEpyh6j4l67Sw(com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel.this, (com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
                SubscriptionsHubScreenContent(subscriptionsHubUiState2, (kotlin.jvm.functions.Function1) rememberedValue6, modifier3, startRestartGroup, (i4 << 3) & 896, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                subscriptionsHubViewModel3 = subscriptionsHubViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt.m19881$r8$lambda$68laQSy9nPsAxyMhAmFdordY(com.paypal.oslo.core.navigation.AppNavigator.this, modifier4, subscriptionsHubViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.lang.Object collectUiEffects(com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel subscriptionsHubViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = subscriptionsHubViewModel.getUiEffect().collect(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$collectUiEffects$2(appNavigator, subscriptionsHubViewModel), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubscriptionsHubScreenContent(final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState subscriptionsHubUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics meSubscriptionsScreenAnalytics;
        com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.LinkedListModule linkedListModule;
        com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.EmptyStateModule emptyStateModule;
        com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.ErrorStateModule errorStateModule;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsHubUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(488419025);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(subscriptionsHubUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(488419025, i3, -1, "com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenContent (SubscriptionsHubScreen.kt:175)");
                }
                androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                if (startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics()) instanceof com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics) {
                    startRestartGroup.startReplaceGroup(-1572055156);
                    java.lang.Object consume = startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                    if (!(consume instanceof com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics)) {
                        consume = null;
                    }
                    meSubscriptionsScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics) consume;
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1571993001);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
                    com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics commonScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics) startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                    if (commonScreenAnalytics == null || (str = commonScreenAnalytics.getClass().getSimpleName()) == null) {
                        str = "null";
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested analytics of type MeSubscriptionsScreenAnalytics but current analytics is of type ");
                    sb.append(str);
                    sb.append(". Returning null.");
                    com.paypal.android.logger.Logger.w$default(logger, sb.toString(), null, null, 6, null);
                    startRestartGroup.endReplaceGroup();
                    meSubscriptionsScreenAnalytics = null;
                }
                com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics meSubscriptionsScreenAnalytics2 = meSubscriptionsScreenAnalytics;
                int i5 = i3 & 112;
                boolean z = i5 == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt.$r8$lambda$z_5Jpzbc6kQtkw6xu6lchbNs2NI(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt.TabReselectionHandler(rememberLazyListState, (kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue, startRestartGroup, 0, 0);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
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
                if (kotlin.jvm.internal.Intrinsics.areEqual(subscriptionsHubUiState, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Loading.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(subscriptionsHubUiState, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Idle.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(1098011564);
                    com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubShimmerScreenKt.SubscriptionsHubShimmerScreen(null, startRestartGroup, 0, 1);
                    startRestartGroup.endReplaceGroup();
                } else if (subscriptionsHubUiState instanceof com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Error) {
                    startRestartGroup.startReplaceGroup(1098135068);
                    com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubErrorSectionKt.SubscriptionsHubErrorSection(function1, com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsModule(androidx.compose.ui.Modifier.INSTANCE, (meSubscriptionsScreenAnalytics2 == null || (errorStateModule = meSubscriptionsScreenAnalytics2.getErrorStateModule()) == null) ? null : com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule.moduleCtx$default(errorStateModule, kotlin.collections.CollectionsKt.listOf(((com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Error) subscriptionsHubUiState).getErrorContext()), null, 0, null, 10, null), startRestartGroup, 6), startRestartGroup, (i3 >> 3) & 14, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(subscriptionsHubUiState instanceof com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success)) {
                        startRestartGroup.startReplaceGroup(-1904244539);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(1098635749);
                    com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success success = (com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success) subscriptionsHubUiState;
                    if (success.isEmpty()) {
                        startRestartGroup.startReplaceGroup(1098677754);
                        boolean shouldShowLinkEntryPoints = success.getShouldShowLinkEntryPoints();
                        androidx.compose.ui.Modifier subscriptionsAnalyticsModule = com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsModule(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), (meSubscriptionsScreenAnalytics2 == null || (emptyStateModule = meSubscriptionsScreenAnalytics2.getEmptyStateModule()) == null) ? null : com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule.moduleCtx$default(emptyStateModule, null, null, 0, null, 11, null), startRestartGroup, 0);
                        boolean z2 = i5 == 32;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt.$r8$lambda$6JTg4xhzk4yep7ho42XZxvNUyJk(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsZeroStateSectionKt.SubscriptionsZeroStateSection(subscriptionsAnalyticsModule, shouldShowLinkEntryPoints, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1099225369);
                        com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubContentSectionKt.SubscriptionsHubContentSection(success, function1, rememberLazyListState, com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsModule(androidx.compose.ui.Modifier.INSTANCE, (meSubscriptionsScreenAnalytics2 == null || (linkedListModule = meSubscriptionsScreenAnalytics2.getLinkedListModule()) == null) ? null : com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule.moduleCtx$default(linkedListModule, null, null, 0, null, 11, null), startRestartGroup, 6), startRestartGroup, i3 & 126, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubScreenKt.$r8$lambda$eXuoKYZ2DDqNq8JS7YSMb07GXO0(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.this, function1, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$68l-aQSy9nP-sA-xyMhAmFdordY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19881$r8$lambda$68laQSy9nPsAxyMhAmFdordY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel subscriptionsHubViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SubscriptionsHubScreen(appNavigator, modifier, subscriptionsHubViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6JTg4xhzk4yep7ho42XZxvNUyJk(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.LinkSubscriptionsClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$COpJfC_EQsareiE-pyh6j4l67Sw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19882$r8$lambda$COpJfC_EQsareiEpyh6j4l67Sw(com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel subscriptionsHubViewModel, com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent subscriptionsHubEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsHubEvent, "");
        subscriptionsHubViewModel.onEvent(subscriptionsHubEvent);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eXuoKYZ2DDqNq8JS7YSMb07GXO0(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState subscriptionsHubUiState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SubscriptionsHubScreenContent(subscriptionsHubUiState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z_5Jpzbc6kQtkw6xu6lchbNs2NI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionsHubEvent.TabReselected.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
