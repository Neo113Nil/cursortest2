package com.paypal.oslo.feature.inappcheckout.ui.entry.screen;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"AppSwitchEntryScreen", "", "inAppCheckoutCoordinator", "Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;", "inAppCheckoutWebViewCoordinator", "Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutWebViewCoordinator;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "viewModel", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/viewmodel/AppSwitchEntryViewModel;", "navResultManager", "Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "(Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutWebViewCoordinator;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lcom/paypal/oslo/feature/inappcheckout/ui/entry/viewmodel/AppSwitchEntryViewModel;Lcom/paypal/oslo/core/navigation/result/NavResultManager;Landroidx/compose/runtime/Composer;I)V", "inappcheckout_prodRelease", "state", "Lcom/paypal/oslo/feature/inappcheckout/ui/entry/contract/AppSwitchEntryContract$State;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AppSwitchEntryScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:88:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppSwitchEntryScreen(final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator inAppCheckoutWebViewCoordinator, final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, final com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel, final com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        android.content.Context context;
        kotlin.coroutines.Continuation continuation;
        int i3;
        kotlin.Unit unit;
        androidx.view.ComponentActivity componentActivity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutWebViewCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchEntryViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1432807890);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(inAppCheckoutCoordinator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(inAppCheckoutWebViewCoordinator) : startRestartGroup.changedInstance(inAppCheckoutWebViewCoordinator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(checkoutLogger) : startRestartGroup.changedInstance(checkoutLogger) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(appSwitchEntryViewModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? startRestartGroup.changed(navResultManager) : startRestartGroup.changedInstance(navResultManager) ? 16384 : 8192;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1432807890, i4, -1, "com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreen (AppSwitchEntryScreen.kt:53)");
            }
            java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
            kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
            androidx.view.ComponentActivity componentActivity2 = (androidx.view.ComponentActivity) consume;
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(appSwitchEntryViewModel.getState(), null, startRestartGroup, 0, 1);
            android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(appSwitchEntryViewModel);
            boolean changedInstance2 = startRestartGroup.changedInstance(context2);
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            boolean z2 = (i4 & 112) == 32 || ((i4 & 64) != 0 && startRestartGroup.changedInstance(inAppCheckoutWebViewCoordinator));
            com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 || (changedInstance | changedInstance2 | z)) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                context = context2;
                continuation = null;
                i3 = i4;
                unit = unit2;
                componentActivity = componentActivity2;
                rememberedValue = new com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$1$1(appSwitchEntryViewModel, context, inAppCheckoutCoordinator, inAppCheckoutWebViewCoordinator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                unit = unit2;
                context = context2;
                i3 = i4;
                componentActivity = componentActivity2;
                continuation = null;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State state = (com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State) collectAsState.getValue();
            boolean changedInstance3 = startRestartGroup.changedInstance(state);
            android.content.Context context3 = context;
            boolean changedInstance4 = startRestartGroup.changedInstance(context3);
            com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance3 | changedInstance4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$2$1(state, context3, continuation);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(state, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            int i6 = i3;
            int i7 = i6 & 896;
            boolean z3 = i7 == 256 || ((i6 & 512) != 0 && startRestartGroup.changedInstance(checkoutLogger));
            boolean changedInstance5 = startRestartGroup.changedInstance(appSwitchEntryViewModel);
            final androidx.view.ComponentActivity componentActivity3 = componentActivity;
            boolean changedInstance6 = startRestartGroup.changedInstance(componentActivity3);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((z3 | changedInstance5 | changedInstance6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt.m15522$r8$lambda$7F6_EJacIWJH1GZgFKYKHmXY(com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.this, componentActivity3, appSwitchEntryViewModel, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(unit3, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, startRestartGroup, 6);
            if (state instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Idle) {
                startRestartGroup.startReplaceGroup(-1756045994);
                startRestartGroup.endReplaceGroup();
            } else if (state instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Loading) {
                startRestartGroup.startReplaceGroup(1397217918);
                com.paypal.oslo.feature.inappcheckout.features.loader.screen.LoadingScreenKt.LoadingScreen(((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Loading) state).getLoadingSettings(), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{checkoutLogger.provideBusinessFlowContext(), checkoutLogger.provideUserIntentContext(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.FETCHING_AUTH_CODE_AND_PREFERENCES)}), startRestartGroup, com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext.$stable << 3, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (state instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Fallback) {
                    startRestartGroup.startReplaceGroup(1397700340);
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(checkoutLogger, "Navigation transition initiated", com.paypal.android.logger.categories.UI.NavigationTransition.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("from_screen", "AppSwitchEntry"), kotlin.TuplesKt.to("to_screen", "Fallback")), null, 8, null);
                    inAppCheckoutCoordinator.navigateToFallbackFlow((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()), ((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Fallback) state).getUri());
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else if (state instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.RequiresAuthentication) {
                    startRestartGroup.startReplaceGroup(1398272042);
                    com.paypal.oslo.core.navigation.result.NavResultRequestId m11587boximpl = com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.RequiresAuthentication) state).m15520getRequestIdQDVFmTU());
                    boolean z4 = i5 == 4;
                    boolean changedInstance7 = startRestartGroup.changedInstance(state);
                    boolean z5 = (57344 & i6) == 16384 || ((i6 & 32768) != 0 && startRestartGroup.changedInstance(navResultManager));
                    boolean changedInstance8 = startRestartGroup.changedInstance(appSwitchEntryViewModel);
                    com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$4$1 rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((changedInstance8 || (z4 | changedInstance7 | z5)) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        composer2 = startRestartGroup;
                        rememberedValue4 = new com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$4$1(inAppCheckoutCoordinator, state, navResultManager, appSwitchEntryViewModel, null);
                        composer2.updateRememberedValue(rememberedValue4);
                    } else {
                        composer2 = startRestartGroup;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(m11587boximpl, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = startRestartGroup;
                    if (state instanceof com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Error) {
                        composer2.startReplaceGroup(1399136043);
                        boolean canGoBackToMerchant = ((com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.State.Error) state).getCanGoBackToMerchant();
                        boolean z6 = i7 == 256 || ((i6 & 512) != 0 && composer2.changedInstance(checkoutLogger));
                        boolean changedInstance9 = composer2.changedInstance(appSwitchEntryViewModel);
                        java.lang.Object rememberedValue5 = composer2.rememberedValue();
                        if ((changedInstance9 | z6) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt.m15523$r8$lambda$bGkMW850IkSdco7doikUbeT3vY(com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.this, appSwitchEntryViewModel);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
                        boolean z7 = i7 == 256 || ((i6 & 512) != 0 && composer2.changedInstance(checkoutLogger));
                        boolean changedInstance10 = composer2.changedInstance(appSwitchEntryViewModel);
                        java.lang.Object rememberedValue6 = composer2.rememberedValue();
                        if ((changedInstance10 | z7) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt.m15521$r8$lambda$1b7CJZaNPwsvj6yLssmIk62dA(com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.this, appSwitchEntryViewModel);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt.NonRecoverableWebViewErrorScreen(canGoBackToMerchant, new com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions(function0, (kotlin.jvm.functions.Function0) rememberedValue6), null, null, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{checkoutLogger.provideMerchantContext(), checkoutLogger.provideBusinessFlowContext()})), com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.AppSwitchWebView.Components.INSTANCE.getReturnToMerchantButtonItem()), composer2, 384, 8);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1756045038);
                        composer2.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            composer2 = startRestartGroup;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt.$r8$lambda$JxXosZ6Sf8LhMK5vfaHcp_rICPE(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, inAppCheckoutWebViewCoordinator, checkoutLogger, appSwitchEntryViewModel, navResultManager, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$1b7CJZaNPwsvj6yLssmI-k-62dA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15521$r8$lambda$1b7CJZaNPwsvj6yLssmIk62dA(com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel) {
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger, "Back pressed on entry screen error", null, null, 6, null);
        appSwitchEntryViewModel.onErrorBackPress();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7F6_EJac-IWJH1G-Zg-FKYKHmXY, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m15522$r8$lambda$7F6_EJacIWJH1GZgFKYKHmXY(com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, final androidx.view.ComponentActivity componentActivity, final com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(checkoutLogger, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.APP_SWITCH_STARTED_MSG, com.paypal.android.logger.categories.UI.Loaded.INSTANCE, null, null, 12, null);
        final androidx.core.util.Consumer<android.content.Intent> consumer = new androidx.core.util.Consumer() { // from class: com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$$ExternalSyntheticLambda4
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt.$r8$lambda$lTqGPPu0GxYQ3w9A03mkt4lETJg(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel.this, componentActivity, (android.content.Intent) obj);
            }
        };
        android.content.Intent intent = componentActivity.getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "");
        consumer.accept(intent);
        componentActivity.addOnNewIntentListener(consumer);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt$AppSwitchEntryScreen$lambda$3$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.ComponentActivity.this.removeOnNewIntentListener(consumer);
                appSwitchEntryViewModel.onDisposeInAppCheckoutUI();
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JxXosZ6Sf8LhMK5vfaHcp_rICPE(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator inAppCheckoutWebViewCoordinator, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, int i, androidx.compose.runtime.Composer composer, int i2) {
        AppSwitchEntryScreen(inAppCheckoutCoordinator, inAppCheckoutWebViewCoordinator, checkoutLogger, appSwitchEntryViewModel, navResultManager, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bGkMW850IkSdc-o7doikUbeT3vY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15523$r8$lambda$bGkMW850IkSdco7doikUbeT3vY(com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel) {
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger, "Return to merchant clicked from entry screen error", null, null, 6, null);
        appSwitchEntryViewModel.onReturnToMerchantClick();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$lTqGPPu0GxYQ3w9A03mkt4lETJg(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel, androidx.view.ComponentActivity componentActivity, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        appSwitchEntryViewModel.onNewDeeplinkReceived(componentActivity.getIntent());
    }
}
