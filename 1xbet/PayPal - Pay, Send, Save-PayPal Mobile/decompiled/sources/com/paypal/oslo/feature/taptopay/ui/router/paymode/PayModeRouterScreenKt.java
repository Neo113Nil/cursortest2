package com.paypal.oslo.feature.taptopay.ui.router.paymode;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u0084\u0002"}, d2 = {"PayModeRouterScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "payModeLauncher", "Lcom/paypal/oslo/feature/taptopay/navigation/PayModeLauncher;", "destination", "Lcom/paypal/oslo/feature/taptopay/api/navigation/PayModeRouterDestination;", "viewModel", "Lcom/paypal/oslo/feature/taptopay/ui/router/paymode/PayModeRouterViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/taptopay/navigation/PayModeLauncher;Lcom/paypal/oslo/feature/taptopay/api/navigation/PayModeRouterDestination;Lcom/paypal/oslo/feature/taptopay/ui/router/paymode/PayModeRouterViewModel;Landroidx/compose/runtime/Composer;II)V", "PayModeRouterScreenContent", "routingState", "Lcom/paypal/oslo/feature/taptopay/ui/router/paymode/PayModeRoutingState;", "onLaunchPayMode", "Lkotlin/Function0;", "onNavigateToSetupFlow", "(Lcom/paypal/oslo/feature/taptopay/ui/router/paymode/PayModeRoutingState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "taptopay_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayModeRouterScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PayModeRouterScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher payModeLauncher, final com.paypal.oslo.feature.taptopay.api.navigation.PayModeRouterDestination payModeRouterDestination, com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel payModeRouterViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel payModeRouterViewModel2;
        com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel payModeRouterViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        boolean z;
        boolean changedInstance;
        boolean z2;
        java.lang.Object rememberedValue;
        boolean z3;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payModeLauncher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payModeRouterDestination, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-982372982);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(payModeLauncher) : startRestartGroup.changedInstance(payModeLauncher) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(payModeRouterDestination) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                payModeRouterViewModel2 = payModeRouterViewModel;
                if (startRestartGroup.changedInstance(payModeRouterViewModel2)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                payModeRouterViewModel2 = payModeRouterViewModel;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            payModeRouterViewModel2 = payModeRouterViewModel;
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 1171) != 1170, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                }
            } else if ((i2 & 8) != 0) {
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
                i4 = i6 & (-7169);
                payModeRouterViewModel3 = (com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-982372982, i4, -1, "com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreen (PayModeRouterScreen.kt:41)");
                }
                com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState payModeRoutingState = (com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(payModeRouterViewModel3.getRoutingState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
                z = (i4 & 112) != 32 || ((i4 & 64) != 0 && startRestartGroup.changedInstance(payModeLauncher));
                changedInstance = startRestartGroup.changedInstance(payModeRouterDestination);
                int i7 = i4 & 14;
                z2 = i7 != 4;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt.$r8$lambda$NdbXwXVddQhv2lOFpg4m7QPHJYc(com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher.this, payModeRouterDestination, appNavigator);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                z3 = i7 == 4;
                changedInstance2 = startRestartGroup.changedInstance(payModeRouterDestination);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(z3 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt.$r8$lambda$PHPv4U32JFAxAlVRXAeqk4YU8mQ(com.paypal.oslo.core.navigation.AppNavigator.this, payModeRouterDestination);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                PayModeRouterScreenContent(payModeRoutingState, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = i6;
            payModeRouterViewModel3 = payModeRouterViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState payModeRoutingState2 = (com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(payModeRouterViewModel3.getRoutingState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
            if ((i4 & 112) != 32) {
            }
            changedInstance = startRestartGroup.changedInstance(payModeRouterDestination);
            int i72 = i4 & 14;
            if (i72 != 4) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z | z2)) {
            }
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt.$r8$lambda$NdbXwXVddQhv2lOFpg4m7QPHJYc(com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher.this, payModeRouterDestination, appNavigator);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
            if (i72 == 4) {
            }
            changedInstance2 = startRestartGroup.changedInstance(payModeRouterDestination);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(z3 | changedInstance2)) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt.$r8$lambda$PHPv4U32JFAxAlVRXAeqk4YU8mQ(com.paypal.oslo.core.navigation.AppNavigator.this, payModeRouterDestination);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            PayModeRouterScreenContent(payModeRoutingState2, function02, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            payModeRouterViewModel3 = payModeRouterViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel payModeRouterViewModel4 = payModeRouterViewModel3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt.$r8$lambda$ZWMZqCRv3rehSVZAuvCB8zxFeIM(com.paypal.oslo.core.navigation.AppNavigator.this, payModeLauncher, payModeRouterDestination, payModeRouterViewModel4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PayModeRouterScreenContent(final com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState payModeRoutingState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(230336790);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(payModeRoutingState) : startRestartGroup.changedInstance(payModeRoutingState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(230336790, i2, -1, "com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenContent (PayModeRouterScreen.kt:79)");
            }
            if (payModeRoutingState == null) {
                startRestartGroup.startReplaceGroup(-1394237466);
                startRestartGroup.endReplaceGroup();
            } else if (payModeRoutingState instanceof com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState.PayMode) {
                startRestartGroup.startReplaceGroup(-1394123634);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                z = (i2 & 112) == 32;
                com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt$PayModeRouterScreenContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt$PayModeRouterScreenContent$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else if (payModeRoutingState instanceof com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState.SetupFlow) {
                startRestartGroup.startReplaceGroup(-1393984568);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                z = (i2 & 896) == 256;
                com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt$PayModeRouterScreenContent$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt$PayModeRouterScreenContent$2$1(function02, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1984638940);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt.$r8$lambda$TTVEngLfYRkD0NuwX6IJXbUOMfQ(com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState.this, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NdbXwXVddQhv2lOFpg4m7QPHJYc(com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher payModeLauncher, com.paypal.oslo.feature.taptopay.api.navigation.PayModeRouterDestination payModeRouterDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        payModeLauncher.launch(payModeRouterDestination.getSource(), payModeRouterDestination.getCardId());
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt.$r8$lambda$Y2GkrGiI1Pv21VYj6sPE4SFPs1U((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PHPv4U32JFAxAlVRXAeqk4YU8mQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.taptopay.api.navigation.PayModeRouterDestination payModeRouterDestination) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterScreenKt.m20136$r8$lambda$PeMcn6I5wZlwuRq9qHEzRP674(com.paypal.oslo.feature.taptopay.api.navigation.PayModeRouterDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PeMcn-6I-5wZlwuRq9qHEzRP674, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20136$r8$lambda$PeMcn6I5wZlwuRq9qHEzRP674(com.paypal.oslo.feature.taptopay.api.navigation.PayModeRouterDestination payModeRouterDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination((com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo) null, com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint.ORGANIC, payModeRouterDestination.getSource(), payModeRouterDestination.getFlow(), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TTVEngLfYRkD0NuwX6IJXbUOMfQ(com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState payModeRoutingState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        PayModeRouterScreenContent(payModeRoutingState, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y2GkrGiI1Pv21VYj6sPE4SFPs1U(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZWMZqCRv3rehSVZAuvCB8zxFeIM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher payModeLauncher, com.paypal.oslo.feature.taptopay.api.navigation.PayModeRouterDestination payModeRouterDestination, com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel payModeRouterViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PayModeRouterScreen(appNavigator, payModeLauncher, payModeRouterDestination, payModeRouterViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
