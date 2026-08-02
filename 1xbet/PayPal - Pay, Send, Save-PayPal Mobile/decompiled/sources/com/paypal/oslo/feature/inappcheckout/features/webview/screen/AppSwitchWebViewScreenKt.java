package com.paypal.oslo.feature.inappcheckout.features.webview.screen;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState;", "webViewState", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect;", "webViewEffect", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/screen/actions/WebViewScreenActions;", "webViewScreenActions", "Lcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/NonRecoverableScreenActions;", "nonRecoverableScreenActions", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "analyticsTracer", "", "AppSwitchWebViewScreen", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState;Lkotlinx/coroutines/flow/SharedFlow;Lcom/paypal/oslo/feature/inappcheckout/features/webview/screen/actions/WebViewScreenActions;Lcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/NonRecoverableScreenActions;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/screen/actions/WebViewActions;", "rememberWebViewActions", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/screen/actions/WebViewScreenActions;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/inappcheckout/features/webview/screen/actions/WebViewActions;", "handlePauseOrDispose", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State$ViewState;Lcom/paypal/oslo/feature/inappcheckout/features/webview/screen/actions/WebViewScreenActions;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AppSwitchWebViewScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:86:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppSwitchWebViewScreen(final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState viewState, final kotlinx.coroutines.flow.SharedFlow<? extends com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect> sharedFlow, final com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions webViewScreenActions, final com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions nonRecoverableScreenActions, final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewScreenActions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonRecoverableScreenActions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-585401855);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(sharedFlow) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(webViewScreenActions) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(nonRecoverableScreenActions) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? startRestartGroup.changed(checkoutLogger) : startRestartGroup.changedInstance(checkoutLogger) ? 16384 : 8192;
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i2 |= (i & 262144) == 0 ? startRestartGroup.changed(analyticsTracer) : startRestartGroup.changedInstance(analyticsTracer) ? 131072 : 65536;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-585401855, i3, -1, "com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreen (AppSwitchWebViewScreen.kt:56)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(sharedFlow);
            boolean changedInstance2 = startRestartGroup.changedInstance(context);
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$1$1(sharedFlow, webViewScreenActions, context, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            int i5 = i3 & 14;
            boolean z2 = i5 == 4;
            boolean z3 = i4 == 256;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z2 | z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt.m15448$r8$lambda$HRI6I1hMoZvQD_chhoEDOB0imQ(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.this, webViewScreenActions, (androidx.view.compose.LifecycleResumePauseEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.view.compose.LifecycleEffectKt.LifecycleResumeEffect(viewState, (androidx.view.LifecycleOwner) null, (kotlin.jvm.functions.Function1<? super androidx.view.compose.LifecycleResumePauseEffectScope, ? extends androidx.view.compose.LifecyclePauseOrDisposeEffectResult>) rememberedValue2, startRestartGroup, i5, 2);
            if (viewState instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Idle) {
                startRestartGroup.startReplaceGroup(-2137940329);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean z4 = i4 == 256;
                com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$3$1(webViewScreenActions, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else if (viewState instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Loading) {
                startRestartGroup.startReplaceGroup(-2137801480);
                com.paypal.oslo.feature.inappcheckout.features.loader.screen.LoadingScreenKt.LoadingScreen(((com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Loading) viewState).getSettings(), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{checkoutLogger.provideBusinessFlowContext(), checkoutLogger.provideUserIntentContext(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.WEB_VIEW_CHECKOUT_URL_LOADING)}), startRestartGroup, com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext.$stable << 3, 0);
                startRestartGroup.endReplaceGroup();
            } else if (viewState instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Success) {
                startRestartGroup.startReplaceGroup(-2137348229);
                com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Success success = (com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.Success) viewState;
                com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt.InAppCheckoutWebViewScreen(success.getCheckoutURLs().getApprovalUrl(), success.getAdditionalHttpHeaders(), success.getLoadingSettings(), rememberWebViewActions(webViewScreenActions, analyticsTracer, startRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 12) & 112)), checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.webview.screen.ComposableSingletons$AppSwitchWebViewScreenKt.INSTANCE.getLambda$2084744297$inappcheckout_prodRelease(), startRestartGroup, (i3 & 57344) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                startRestartGroup.endReplaceGroup();
            } else if (viewState instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.NonRecoverableError) {
                startRestartGroup.startReplaceGroup(-2136649117);
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                boolean z5 = (i3 & 458752) == 131072 || ((i3 & 262144) != 0 && startRestartGroup.changedInstance(analyticsTracer));
                com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$4$1 rememberedValue4 = startRestartGroup.rememberedValue();
                if (z5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$4$1(analyticsTracer, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.NonRecoverableError nonRecoverableError = (com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.NonRecoverableError) viewState;
                int i6 = (i3 >> 6) & 112;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt.NonRecoverableWebViewErrorScreen(nonRecoverableError.getCanGoBackToMerchant(), nonRecoverableScreenActions, nonRecoverableError.getMerchantDetails(), null, null, composer2, i6, 24);
                composer2.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.startReplaceGroup(69581819);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer2 = startRestartGroup;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt.$r8$lambda$93b7vSEqRAkakZo6TQ6aDCFVptI(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.this, sharedFlow, webViewScreenActions, nonRecoverableScreenActions, checkoutLogger, analyticsTracer, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions rememberWebViewActions(final com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions webViewScreenActions, final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewScreenActions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(970608923, i, -1, "com.paypal.oslo.feature.inappcheckout.features.webview.screen.rememberWebViewActions (AppSwitchWebViewScreen.kt:147)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(webViewScreenActions)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt.$r8$lambda$nG1CIRk3W7jCuJjytNN7nM761TU(com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions.this, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge) obj, (java.lang.String) obj2);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt.$r8$lambda$wMSugrMIwsMqr2ZLEaRmTNcPqEo(com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer.this, webViewScreenActions, (java.lang.String) obj);
                }
            }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt.m15449$r8$lambda$RiBOU87mCi7LBJVGwcdCLmCwKI(com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer.this, webViewScreenActions);
                }
            }, webViewScreenActions.getOnRypPageRendered(), webViewScreenActions.getOnReturnToMerchantButtonClicked());
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions webViewActions = (com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return webViewActions;
    }

    public static final void handlePauseOrDispose(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState viewState, com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions webViewScreenActions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewScreenActions, "");
        if (viewState instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState.NonRecoverableError) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Navigating to home on app background", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", "NonRecoverableError")), null, 4, null);
            webViewScreenActions.getOnNavigateToHome().invoke();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$93b7vSEqRAkakZo6TQ6aDCFVptI(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState viewState, kotlinx.coroutines.flow.SharedFlow sharedFlow, com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions webViewScreenActions, com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions nonRecoverableScreenActions, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, int i, androidx.compose.runtime.Composer composer, int i2) {
        AppSwitchWebViewScreen(viewState, sharedFlow, webViewScreenActions, nonRecoverableScreenActions, checkoutLogger, analyticsTracer, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HRI6I1hMoZvQD_chhoEDOB0i-mQ, reason: not valid java name */
    public static /* synthetic */ androidx.view.compose.LifecyclePauseOrDisposeEffectResult m15448$r8$lambda$HRI6I1hMoZvQD_chhoEDOB0imQ(final com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State.ViewState viewState, final com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions webViewScreenActions, final androidx.view.compose.LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleResumePauseEffectScope, "");
        return new androidx.view.compose.LifecyclePauseOrDisposeEffectResult() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$lambda$1$0$$inlined$onPauseOrDispose$1
            @Override // androidx.view.compose.LifecyclePauseOrDisposeEffectResult
            public final void runPauseOrOnDisposeEffect() {
                androidx.view.compose.LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope2 = androidx.view.compose.LifecycleResumePauseEffectScope.this;
                com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt.handlePauseOrDispose(viewState, webViewScreenActions);
            }
        };
    }

    /* renamed from: $r8$lambda$RiBOU87mCi7LBJVGw-cdCLmCwKI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15449$r8$lambda$RiBOU87mCi7LBJVGwcdCLmCwKI(com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions webViewScreenActions) {
        com.paypal.android.logger.standardized.LoggerExtensionsKt.i$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, com.paypal.android.logger.categories.UI.Interaction.INSTANCE, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.BACK_BUTTON_PRESSED_MSG, null, null, 12, null);
        analyticsTracer.trackUserClickedBack();
        webViewScreenActions.getOnBackPressIntercept().invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nG1CIRk3W7jCuJjytNN7nM761TU(com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions webViewScreenActions, com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge secureWebViewJavaScriptBridge, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.android.logger.standardized.LoggerExtensionsKt.i$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, com.paypal.android.logger.categories.UI.Loading.INSTANCE, "WebView URL changed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("newUrl", str)), null, 8, null);
        webViewScreenActions.getOnWebViewLoadUri().invoke(secureWebViewJavaScriptBridge, android.net.Uri.parse(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wMSugrMIwsMqr2ZLEaRmTNcPqEo(com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions webViewScreenActions, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, com.paypal.android.logger.categories.UI.Error.INSTANCE, "WebView error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMsg", str)), null, null, 24, null);
        analyticsTracer.trackWebPageNotLoaded(str);
        webViewScreenActions.getOnError().invoke();
        return kotlin.Unit.INSTANCE;
    }
}
