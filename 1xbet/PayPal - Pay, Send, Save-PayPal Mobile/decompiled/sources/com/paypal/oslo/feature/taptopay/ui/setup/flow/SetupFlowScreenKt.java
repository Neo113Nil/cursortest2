package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a@\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\u0001¢\u0006\u0002\u0010\u000e\u001a9\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"SetupFlowScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "destination", "Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination;", "coordinator", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination;Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator;Landroidx/compose/runtime/Composer;II)V", "SetupFlowStepHost", "Lcom/paypal/oslo/feature/taptopay/navigation/SetupDestination;", "screen", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/taptopay/navigation/SetupDestination;Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SetupFlowHostEffects", "targetStep", "Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;", "launcherDestination", "activeDestination", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator;Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/SetupFlowNavStep;Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination;Lcom/paypal/oslo/feature/taptopay/navigation/SetupDestination;Landroidx/compose/runtime/Composer;I)V", "taptopay_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetupFlowScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if ((r14 & 4) != 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SetupFlowScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination setupFlowDestination, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setupFlowDestination, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1516565794);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(setupFlowDestination) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changedInstance(setupFlowCoordinator)) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    setupFlowCoordinator = com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorViewModelStoreKt.rememberSetupFlowCoordinator(startRestartGroup, 0);
                    i3 &= -897;
                }
                int i4 = i3;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1516565794, i4, -1, "com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreen (SetupFlowScreen.kt:40)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(setupFlowCoordinator.getCurrentNavStep(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                boolean changedInstance = startRestartGroup.changedInstance(setupFlowCoordinator);
                boolean changedInstance2 = startRestartGroup.changedInstance(setupFlowDestination);
                boolean changedInstance3 = startRestartGroup.changedInstance(context);
                com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2 | changedInstance3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowScreen$1$1(setupFlowCoordinator, setupFlowDestination, context, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                int i5 = i4 >> 3;
                androidx.compose.runtime.EffectsKt.LaunchedEffect(setupFlowDestination, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i5 & 14);
                getHighSpeedVideoFpsRanges(appNavigator, setupFlowCoordinator, (com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep) collectAsStateWithLifecycle.getValue(), setupFlowDestination, null, startRestartGroup, (i5 & 112) | (i4 & 14) | 24576 | ((i4 << 6) & 7168));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator2 = setupFlowCoordinator;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt.$r8$lambda$T7CcnA_owUDKz4Y04DCVcU9KxrA(com.paypal.oslo.core.navigation.AppNavigator.this, setupFlowDestination, setupFlowCoordinator2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
    
        if ((r25 & 4) != 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SetupFlowStepHost(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.taptopay.navigation.SetupDestination setupDestination, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, final kotlin.jvm.functions.Function3<? super com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setupDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(324407660);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changed(appNavigator) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? startRestartGroup.changed(setupDestination) : startRestartGroup.changedInstance(setupDestination) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                setupFlowCoordinator2 = setupFlowCoordinator;
                if (startRestartGroup.changedInstance(setupFlowCoordinator2)) {
                    i3 = 256;
                    i4 |= i3;
                }
            } else {
                setupFlowCoordinator2 = setupFlowCoordinator;
            }
            i3 = 128;
            i4 |= i3;
        } else {
            setupFlowCoordinator2 = setupFlowCoordinator;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    setupFlowCoordinator2 = com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorViewModelStoreKt.rememberSetupFlowCoordinator(startRestartGroup, 0);
                    i4 &= -897;
                }
                int i5 = i4;
                final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator3 = setupFlowCoordinator2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(324407660, i5, -1, "com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowStepHost (SetupFlowScreen.kt:75)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(setupFlowCoordinator3.getCurrentNavStep(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                boolean shouldRestartFlow$taptopay_prodRelease = setupFlowCoordinator3.shouldRestartFlow$taptopay_prodRelease(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowDestinationMapperKt.getNavStep(setupDestination));
                boolean changed = startRestartGroup.changed(shouldRestartFlow$taptopay_prodRelease);
                boolean changedInstance = startRestartGroup.changedInstance(setupFlowCoordinator3);
                int i6 = i5 & 14;
                boolean z = i6 == 4;
                com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowStepHost$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowStepHost$1$1(shouldRestartFlow$taptopay_prodRelease, setupFlowCoordinator3, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(shouldRestartFlow$taptopay_prodRelease), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                if (shouldRestartFlow$taptopay_prodRelease) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt.$r8$lambda$bOfieoBI9u0DEo_PqO_lNzOxLGA(com.paypal.oslo.core.navigation.AppNavigator.this, setupDestination, setupFlowCoordinator3, function3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep setupFlowNavStep = (com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep) collectAsStateWithLifecycle.getValue();
                java.util.List<androidx.navigation3.runtime.NavKey> backStack = appNavigator.getBackStack();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : backStack) {
                    if (obj instanceof com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination) {
                        arrayList.add(obj);
                    }
                }
                composer2 = startRestartGroup;
                getHighSpeedVideoFpsRanges(appNavigator, setupFlowCoordinator3, setupFlowNavStep, (com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) arrayList), setupDestination, startRestartGroup, ((i5 >> 3) & 112) | i6 | ((i5 << 9) & 57344));
                function3.invoke(setupFlowCoordinator3, composer2, java.lang.Integer.valueOf((i5 >> 6) & 126));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                setupFlowCoordinator2 = setupFlowCoordinator3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt.$r8$lambda$eVXZ7NPN09P5mueGpdEdZAyj7Uw(com.paypal.oslo.core.navigation.AppNavigator.this, setupDestination, setupFlowCoordinator2, function3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep setupFlowNavStep, final com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination setupFlowDestination, final com.paypal.oslo.feature.taptopay.navigation.SetupDestination setupDestination, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(674403737);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(setupFlowCoordinator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(setupFlowNavStep) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(setupFlowDestination) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? startRestartGroup.changed(setupDestination) : startRestartGroup.changedInstance(setupDestination) ? 16384 : 8192;
        }
        int i3 = i2;
        boolean z = true;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(674403737, i3, -1, "com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowHostEffects (SetupFlowScreen.kt:122)");
            }
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            boolean changedInstance = startRestartGroup.changedInstance(setupFlowCoordinator);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt.$r8$lambda$PzFseRpAx5pv6DDgxIG3v5r52CA(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.this, setupFlowCoordinator);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 0);
            int i5 = i3 & 14;
            boolean z3 = i5 == 4;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt.$r8$lambda$YFWo5_zOhiVnLYxnhqnaiteuM_s(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(appNavigator, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, i5);
            boolean z4 = i4 == 256;
            boolean z5 = i5 == 4;
            if ((57344 & i3) != 16384 && ((32768 & i3) == 0 || !startRestartGroup.changedInstance(setupDestination))) {
                z = false;
            }
            boolean changedInstance2 = startRestartGroup.changedInstance(setupFlowDestination);
            boolean changedInstance3 = startRestartGroup.changedInstance(setupFlowCoordinator);
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if ((z4 | z5 | z | changedInstance2 | changedInstance3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$3$1(setupFlowNavStep, appNavigator, setupFlowCoordinator, setupDestination, setupFlowDestination, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(setupFlowNavStep, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, (i3 >> 6) & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt.$r8$lambda$C7tkS7lVXSkDOmyCTOoVTMm7e9E(com.paypal.oslo.core.navigation.AppNavigator.this, setupFlowCoordinator, setupFlowNavStep, setupFlowDestination, setupDestination, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$C7tkS7lVXSkDOmyCTOoVTMm7e9E(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep setupFlowNavStep, com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination setupFlowDestination, com.paypal.oslo.feature.taptopay.navigation.SetupDestination setupDestination, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(appNavigator, setupFlowCoordinator, setupFlowNavStep, setupFlowDestination, setupDestination, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PzFseRpAx5pv6DDgxIG3v5r52CA(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep setupFlowNavStep, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator) {
        if (setupFlowNavStep.getSystemBackEnabled()) {
            setupFlowCoordinator.onIntent(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowIntent.GoBack.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T7CcnA_owUDKz4Y04DCVcU9KxrA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination setupFlowDestination, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SetupFlowScreen(appNavigator, setupFlowDestination, setupFlowCoordinator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$YFWo5_zOhiVnLYxnhqnaiteuM_s(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowHostEffects$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                java.util.List<androidx.navigation3.runtime.NavKey> backStack = com.paypal.oslo.core.navigation.AppNavigator.this.getBackStack();
                if (!(backStack instanceof java.util.Collection) || !backStack.isEmpty()) {
                    for (androidx.navigation3.runtime.NavKey navKey : backStack) {
                        if ((navKey instanceof com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination) || (navKey instanceof com.paypal.oslo.feature.taptopay.navigation.SetupDestination)) {
                            return;
                        }
                    }
                }
                com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorViewModelStoreKt.clearSetupFlowCoordinatorViewModelStore();
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bOfieoBI9u0DEo_PqO_lNzOxLGA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taptopay.navigation.SetupDestination setupDestination, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SetupFlowStepHost(appNavigator, setupDestination, setupFlowCoordinator, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eVXZ7NPN09P5mueGpdEdZAyj7Uw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taptopay.navigation.SetupDestination setupDestination, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SetupFlowStepHost(appNavigator, setupDestination, setupFlowCoordinator, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
