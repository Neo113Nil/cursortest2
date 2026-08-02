package com.paypal.oslo.feature.balance.ui.onholddetails.router;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u008d\u0001\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2(\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000b2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0001¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"OnHoldDetailsRouterScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterViewModel;Landroidx/compose/runtime/Composer;II)V", "OnHoldDetailsRouterContent", "state", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState;", "formatMoney", "Lkotlin/Function3;", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "", "Lkotlin/coroutines/Continuation;", "", "", "formatScaledMoney", "Lkotlin/Function2;", "formatDate", "Lkotlin/Function1;", "onError", "Lkotlin/Function0;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "balance_prodRelease", "uiState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OnHoldDetailsRouterScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if ((r24 & 2) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnHoldDetailsRouterScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel onHoldDetailsRouterViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel onHoldDetailsRouterViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel onHoldDetailsRouterViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1250242615);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                onHoldDetailsRouterViewModel2 = onHoldDetailsRouterViewModel;
                if (startRestartGroup.changedInstance(onHoldDetailsRouterViewModel2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                onHoldDetailsRouterViewModel2 = onHoldDetailsRouterViewModel;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            onHoldDetailsRouterViewModel2 = onHoldDetailsRouterViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
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
                    onHoldDetailsRouterViewModel2 = (com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i3 &= -113;
                }
                int i5 = i3;
                onHoldDetailsRouterViewModel3 = onHoldDetailsRouterViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1250242615, i5, -1, "com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreen (OnHoldDetailsRouterScreen.kt:46)");
                }
                boolean z = false;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(onHoldDetailsRouterViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(onHoldDetailsRouterViewModel3);
                com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt$OnHoldDetailsRouterScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt$OnHoldDetailsRouterScreen$1$1(onHoldDetailsRouterViewModel3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean changedInstance2 = startRestartGroup.changedInstance(onHoldDetailsRouterViewModel3);
                int i6 = i5 & 14;
                if (i6 == 4) {
                    z = true;
                }
                com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt$OnHoldDetailsRouterScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt$OnHoldDetailsRouterScreen$2$1(onHoldDetailsRouterViewModel3, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState onHoldDetailsRouterState = (com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState) collectAsStateWithLifecycle.getValue();
                boolean changedInstance3 = startRestartGroup.changedInstance(onHoldDetailsRouterViewModel3);
                com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt$OnHoldDetailsRouterScreen$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt$OnHoldDetailsRouterScreen$3$1(onHoldDetailsRouterViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) ((kotlin.reflect.KFunction) rememberedValue3);
                boolean changedInstance4 = startRestartGroup.changedInstance(onHoldDetailsRouterViewModel3);
                com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt$OnHoldDetailsRouterScreen$4$1 rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt$OnHoldDetailsRouterScreen$4$1(onHoldDetailsRouterViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) ((kotlin.reflect.KFunction) rememberedValue4);
                boolean changedInstance5 = startRestartGroup.changedInstance(onHoldDetailsRouterViewModel3);
                com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt$OnHoldDetailsRouterScreen$5$1 rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt$OnHoldDetailsRouterScreen$5$1(onHoldDetailsRouterViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue5);
                boolean changedInstance6 = startRestartGroup.changedInstance(onHoldDetailsRouterViewModel3);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt.m12196$r8$lambda$KuMrr_Tvtyf4uTxoQC_g1F8o8c(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                composer2 = startRestartGroup;
                OnHoldDetailsRouterContent(appNavigator, onHoldDetailsRouterState, function3, function2, function1, (kotlin.jvm.functions.Function0) rememberedValue6, composer2, i6);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            onHoldDetailsRouterViewModel3 = onHoldDetailsRouterViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt.$r8$lambda$ACO3N_qJQqwEw_DIhLqcERmX2vA(com.paypal.oslo.core.navigation.AppNavigator.this, onHoldDetailsRouterViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OnHoldDetailsRouterContent(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState onHoldDetailsRouterState, final kotlin.jvm.functions.Function3<? super com.paypal.oslo.feature.balance.domain.model.Money, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> function3, final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.balance.domain.model.Money, ? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> function2, final kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onHoldDetailsRouterState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1829881245);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(onHoldDetailsRouterState) : startRestartGroup.changedInstance(onHoldDetailsRouterState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1829881245, i2, -1, "com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterContent (OnHoldDetailsRouterScreen.kt:93)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.OnHoldDetails.Router.SCREEN);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
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
            if (kotlin.jvm.internal.Intrinsics.areEqual(onHoldDetailsRouterState, com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Idle.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(onHoldDetailsRouterState, com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Loading.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1080884522);
                com.paypal.oslo.feature.balance.common.ui.BalanceLoadingFullscreenKt.BalanceLoadingFullscreen(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.OnHoldDetails.Router.LOADING), startRestartGroup, 6, 0);
                startRestartGroup.endReplaceGroup();
            } else if (onHoldDetailsRouterState instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Success) {
                startRestartGroup.startReplaceGroup(-852015407);
                com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType holdType = ((com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Success) onHoldDetailsRouterState).getHoldType();
                if (holdType instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.TaxOnHold) {
                    startRestartGroup.startReplaceGroup(-851941162);
                    com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.TaxOnHold taxOnHold = (com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.TaxOnHold) holdType;
                    com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldDetailsKt.TaxOnHoldDetails(appNavigator, new com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldState(taxOnHold.isTaxIdProvided(), taxOnHold.getAmount(), taxOnHold.getAmountTaxIdRequired(), taxOnHold.getTaxRate(), taxOnHold.getGracePeriodExpiryDate()), function3, function2, function1, startRestartGroup, i2 & 65422);
                    startRestartGroup.endReplaceGroup();
                } else if (holdType instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.MoneyOnHold) {
                    startRestartGroup.startReplaceGroup(-851133767);
                    com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt.MoneyOnHoldDetails(appNavigator, new com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldState(((com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType.MoneyOnHold) holdType).getAmount()), function3, startRestartGroup, i2 & 910);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1080894289);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(onHoldDetailsRouterState instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Error)) {
                    startRestartGroup.startReplaceGroup(1080882951);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-850706587);
                com.paypal.oslo.feature.balance.common.ui.BalanceErrorScreenKt.BalanceErrorScreen(com.paypal.oslo.feature.balance.common.BalanceErrorType.GENERIC, function0, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.OnHoldDetails.Router.ERROR), startRestartGroup, ((i2 >> 12) & 112) | 390, 0);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt.$r8$lambda$gxZwSEZLkddW93d8IMmWkkoRIac(com.paypal.oslo.core.navigation.AppNavigator.this, onHoldDetailsRouterState, function3, function2, function1, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ACO3N_qJQqwEw_DIhLqcERmX2vA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel onHoldDetailsRouterViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        OnHoldDetailsRouterScreen(appNavigator, onHoldDetailsRouterViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KuMrr_Tvtyf4uT-xoQC_g1F8o8c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12196$r8$lambda$KuMrr_Tvtyf4uTxoQC_g1F8o8c(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel onHoldDetailsRouterViewModel) {
        onHoldDetailsRouterViewModel.processIntent(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterIntent.Initialize.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gxZwSEZLkddW93d8IMmWkkoRIac(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState onHoldDetailsRouterState, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        OnHoldDetailsRouterContent(appNavigator, onHoldDetailsRouterState, function3, function2, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
