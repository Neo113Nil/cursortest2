package com.paypal.oslo.feature.taptopay.ui.router.setasdefault;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001aF\u0010\u000b\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u0084\u0002"}, d2 = {"SetAsDefaultRouterScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "payModeLauncher", "Lcom/paypal/oslo/feature/taptopay/navigation/PayModeLauncher;", "destination", "Lcom/paypal/oslo/feature/taptopay/api/navigation/SetAsDefaultRouterDestination;", "viewModel", "Lcom/paypal/oslo/feature/taptopay/ui/router/setasdefault/SetAsDefaultRouterViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/taptopay/navigation/PayModeLauncher;Lcom/paypal/oslo/feature/taptopay/api/navigation/SetAsDefaultRouterDestination;Lcom/paypal/oslo/feature/taptopay/ui/router/setasdefault/SetAsDefaultRouterViewModel;Landroidx/compose/runtime/Composer;II)V", "SetAsDefaultRouterScreenContent", "routingState", "Lcom/paypal/oslo/feature/taptopay/ui/router/setasdefault/SetAsDefaultRoutingState;", "onNavigateToSetupFlow", "Lkotlin/Function0;", "onLaunchPayMode", "chooseDefaultPaymentContent", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/taptopay/ui/router/setasdefault/SetAsDefaultRoutingState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "taptopay_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetAsDefaultRouterScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SetAsDefaultRouterScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher payModeLauncher, final com.paypal.oslo.feature.taptopay.api.navigation.SetAsDefaultRouterDestination setAsDefaultRouterDestination, com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel setAsDefaultRouterViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel setAsDefaultRouterViewModel2;
        com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel setAsDefaultRouterViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean z;
        com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel setAsDefaultRouterViewModel4;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        boolean z3;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payModeLauncher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setAsDefaultRouterDestination, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-909988634);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(payModeLauncher) : startRestartGroup.changedInstance(payModeLauncher) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(setAsDefaultRouterDestination) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                setAsDefaultRouterViewModel2 = setAsDefaultRouterViewModel;
                if (startRestartGroup.changedInstance(setAsDefaultRouterViewModel2)) {
                    i7 = 2048;
                    i3 |= i7;
                }
            } else {
                setAsDefaultRouterViewModel2 = setAsDefaultRouterViewModel;
            }
            i7 = 1024;
            i3 |= i7;
        } else {
            setAsDefaultRouterViewModel2 = setAsDefaultRouterViewModel;
        }
        int i8 = i3;
        if (startRestartGroup.shouldExecute((i8 & 1171) != 1170, i8 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i5 = i8 & (-7169);
                    setAsDefaultRouterViewModel3 = setAsDefaultRouterViewModel2;
                    z = false;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState setAsDefaultRoutingState = (com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(setAsDefaultRouterViewModel3.getRoutingState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
                    i6 = i5 & 14;
                    if (i6 == 4) {
                    }
                    changedInstance = startRestartGroup.changedInstance(setAsDefaultRouterDestination);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changedInstance | z2)) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$AT5xsXp2biAHe_5mL5rwmEKSEmk(com.paypal.oslo.core.navigation.AppNavigator.this, setAsDefaultRouterDestination);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                    if ((i5 & 112) != 32) {
                    }
                    changedInstance2 = startRestartGroup.changedInstance(setAsDefaultRouterDestination);
                    if (i6 == 4) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!(changedInstance2 | z3 | z)) {
                    }
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$vDqlJqGDukUM1bLS8u6z98FFe4E(com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher.this, setAsDefaultRouterDestination, appNavigator);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    SetAsDefaultRouterScreenContent(setAsDefaultRoutingState, function0, (kotlin.jvm.functions.Function0) rememberedValue2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1545621455, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$oqGhTPUCbEcJZPcBXAwdLMuoaQ0(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 3072);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
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
                z = false;
                setAsDefaultRouterViewModel4 = (com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i4 = i8 & (-7169);
                i5 = i4;
                setAsDefaultRouterViewModel3 = setAsDefaultRouterViewModel4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-909988634, i5, -1, "com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreen (SetAsDefaultRouterScreen.kt:46)");
                }
                com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState setAsDefaultRoutingState2 = (com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(setAsDefaultRouterViewModel3.getRoutingState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
                i6 = i5 & 14;
                z2 = i6 == 4 ? true : z;
                changedInstance = startRestartGroup.changedInstance(setAsDefaultRouterDestination);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$AT5xsXp2biAHe_5mL5rwmEKSEmk(com.paypal.oslo.core.navigation.AppNavigator.this, setAsDefaultRouterDestination);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                z3 = ((i5 & 112) != 32 || ((i5 & 64) != 0 && startRestartGroup.changedInstance(payModeLauncher))) ? true : z;
                changedInstance2 = startRestartGroup.changedInstance(setAsDefaultRouterDestination);
                if (i6 == 4) {
                    z = true;
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changedInstance2 | z3 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$vDqlJqGDukUM1bLS8u6z98FFe4E(com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher.this, setAsDefaultRouterDestination, appNavigator);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                SetAsDefaultRouterScreenContent(setAsDefaultRoutingState2, function02, (kotlin.jvm.functions.Function0) rememberedValue2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1545621455, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$oqGhTPUCbEcJZPcBXAwdLMuoaQ0(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 3072);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            z = false;
            setAsDefaultRouterViewModel4 = setAsDefaultRouterViewModel2;
            i4 = i8;
            i5 = i4;
            setAsDefaultRouterViewModel3 = setAsDefaultRouterViewModel4;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState setAsDefaultRoutingState22 = (com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(setAsDefaultRouterViewModel3.getRoutingState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
            i6 = i5 & 14;
            if (i6 == 4) {
            }
            changedInstance = startRestartGroup.changedInstance(setAsDefaultRouterDestination);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z2)) {
            }
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$AT5xsXp2biAHe_5mL5rwmEKSEmk(com.paypal.oslo.core.navigation.AppNavigator.this, setAsDefaultRouterDestination);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue;
            if ((i5 & 112) != 32) {
            }
            changedInstance2 = startRestartGroup.changedInstance(setAsDefaultRouterDestination);
            if (i6 == 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(changedInstance2 | z3 | z)) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$vDqlJqGDukUM1bLS8u6z98FFe4E(com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher.this, setAsDefaultRouterDestination, appNavigator);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            SetAsDefaultRouterScreenContent(setAsDefaultRoutingState22, function022, (kotlin.jvm.functions.Function0) rememberedValue2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1545621455, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$oqGhTPUCbEcJZPcBXAwdLMuoaQ0(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            setAsDefaultRouterViewModel3 = setAsDefaultRouterViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel setAsDefaultRouterViewModel5 = setAsDefaultRouterViewModel3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$5mePnO_9GfxSKvYUnFbUXp2OKpU(com.paypal.oslo.core.navigation.AppNavigator.this, payModeLauncher, setAsDefaultRouterDestination, setAsDefaultRouterViewModel5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SetAsDefaultRouterScreenContent(final com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState setAsDefaultRoutingState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-402650823);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(setAsDefaultRoutingState) : startRestartGroup.changedInstance(setAsDefaultRoutingState) ? 4 : 2) | i;
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
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-402650823, i2, -1, "com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenContent (SetAsDefaultRouterScreen.kt:103)");
            }
            if (setAsDefaultRoutingState == null) {
                startRestartGroup.startReplaceGroup(473245859);
                startRestartGroup.endReplaceGroup();
            } else if (setAsDefaultRoutingState instanceof com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState.SetupFlow) {
                startRestartGroup.startReplaceGroup(473366821);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                z = (i2 & 112) == 32;
                com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$SetAsDefaultRouterScreenContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$SetAsDefaultRouterScreenContent$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(setAsDefaultRoutingState, com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState.PayMode.INSTANCE)) {
                startRestartGroup.startReplaceGroup(473511467);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                z = (i2 & 896) == 256;
                com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$SetAsDefaultRouterScreenContent$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$SetAsDefaultRouterScreenContent$2$1(function02, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else if (setAsDefaultRoutingState instanceof com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState.ChooseDefaultPayment) {
                startRestartGroup.startReplaceGroup(473664948);
                function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i2 >> 9) & 14));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-400376767);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$eQ2Ih57_dUNYhZOZjs04ixYT3TU(com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState.this, function0, function02, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5mePnO_9GfxSKvYUnFbUXp2OKpU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher payModeLauncher, com.paypal.oslo.feature.taptopay.api.navigation.SetAsDefaultRouterDestination setAsDefaultRouterDestination, com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel setAsDefaultRouterViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SetAsDefaultRouterScreen(appNavigator, payModeLauncher, setAsDefaultRouterDestination, setAsDefaultRouterViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AT5xsXp2biAHe_5mL5rwmEKSEmk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.taptopay.api.navigation.SetAsDefaultRouterDestination setAsDefaultRouterDestination) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$YH0dQMDNklSnPOIXEWivQNuevpc(com.paypal.oslo.feature.taptopay.api.navigation.SetAsDefaultRouterDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Fz5g1qbGvDUMJo0J3uWm1az5n38(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GSRvIdpNmOyTpWBTc9b_p4pl8Zw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult chooseDefaultPaymentAppResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chooseDefaultPaymentAppResult, "");
        if (!(chooseDefaultPaymentAppResult instanceof com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Completed) && !(chooseDefaultPaymentAppResult instanceof com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Skipped) && !(chooseDefaultPaymentAppResult instanceof com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Closed)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$_NFGydDLhvO89rFyvTSnzrcjKnA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YH0dQMDNklSnPOIXEWivQNuevpc(com.paypal.oslo.feature.taptopay.api.navigation.SetAsDefaultRouterDestination setAsDefaultRouterDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination((com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo) null, (com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint) null, setAsDefaultRouterDestination.getSource(), setAsDefaultRouterDestination.getFlow(), 3, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_NFGydDLhvO89rFyvTSnzrcjKnA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eQ2Ih57_dUNYhZOZjs04ixYT3TU(com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState setAsDefaultRoutingState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        SetAsDefaultRouterScreenContent(setAsDefaultRoutingState, function0, function02, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oqGhTPUCbEcJZPcBXAwdLMuoaQ0(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1545621455, i, -1, "com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreen.<anonymous> (SetAsDefaultRouterScreen.kt:66)");
            }
            boolean changed = composer.changed(appNavigator);
            com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$SetAsDefaultRouterScreen$3$1$1 rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$SetAsDefaultRouterScreen$3$1$1(appNavigator);
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$GSRvIdpNmOyTpWBTc9b_p4pl8Zw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt.ChooseDefaultPaymentScreen(function1, (kotlin.jvm.functions.Function1) rememberedValue2, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vDqlJqGDukUM1bLS8u6z98FFe4E(com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher payModeLauncher, com.paypal.oslo.feature.taptopay.api.navigation.SetAsDefaultRouterDestination setAsDefaultRouterDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        java.lang.String source = setAsDefaultRouterDestination.getSource();
        if (source == null) {
            source = "set-as-default";
        }
        payModeLauncher.launch(source, null);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterScreenKt.$r8$lambda$Fz5g1qbGvDUMJo0J3uWm1az5n38((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
