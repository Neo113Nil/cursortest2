package com.paypal.oslo.feature.inappcheckout.features.webview.screen.components;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0099\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2V\u0010\f\u001aR\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001as\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001a2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u00010\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\u001f¨\u0006 ²\u0006\n\u0010!\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u0004\u0018\u00010\u001dX\u008a\u008e\u0002"}, d2 = {"InAppCheckoutWebViewScreen", "", "url", "", "additionalHttpHeaders", "", "loadingSettings", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "webViewActions", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/screen/actions/WebViewActions;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "secureWebViewContent", "Lkotlin/Function3;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/ParameterName;", "name", "config", "Lkotlin/Function0;", "onBackClick", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Ljava/util/Map;Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;Lcom/paypal/oslo/feature/inappcheckout/features/webview/screen/actions/WebViewActions;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;I)V", "rememberSecureWebViewConfiguration", "onLoadingStateChange", "Lkotlin/Function1;", "", "onJsBridgeReady", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewJavaScriptBridge;", "getJsBridge", "(Ljava/lang/String;Ljava/util/Map;Lcom/paypal/oslo/feature/inappcheckout/features/webview/screen/actions/WebViewActions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "inappcheckout_prodRelease", "isLoading", "jsBridge"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InAppCheckoutWebViewScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void InAppCheckoutWebViewScreen(final java.lang.String str, final java.util.Map<java.lang.String, java.lang.String> map, final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings loadingSettings, final com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions webViewActions, final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, final kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        char c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewActions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function5, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2136966623);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(map) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(loadingSettings) : startRestartGroup.changedInstance(loadingSettings) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(webViewActions) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? startRestartGroup.changed(checkoutLogger) : startRestartGroup.changedInstance(checkoutLogger) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function5) ? 131072 : 65536;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2136966623, i3, -1, "com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreen (InAppCheckoutWebViewScreen.kt:60)");
            }
            androidx.compose.ui.Modifier statusBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt.$r8$lambda$kOC2G7o3MN_27sTXr_VdjvErtZ0((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(statusBarsPadding, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default);
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
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            boolean changed = startRestartGroup.changed(map);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.Object mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default);
                rememberedValue2 = mutableStateOf$default;
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
            boolean z2 = i4 == 4;
            boolean changed2 = startRestartGroup.changed(map);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((z2 || changed2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                c = 2;
                rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                c = 2;
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
            boolean changed3 = startRestartGroup.changed(mutableState);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt.m15457$r8$lambda$Go4FBrBPbYpLS4DKjg2gAHIZQ(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            boolean changed4 = startRestartGroup.changed(mutableState2);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt.m15458$r8$lambda$if_1OU4JvbefrwDk5rA1OALnp4(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            boolean changed5 = startRestartGroup.changed(mutableState2);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed5 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt.$r8$lambda$qeMABOiN2H0ivTDk4PCyiliTxKM(androidx.compose.runtime.MutableState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration rememberSecureWebViewConfiguration = rememberSecureWebViewConfiguration(str, map, webViewActions, function1, function12, (kotlin.jvm.functions.Function0) rememberedValue6, checkoutLogger, startRestartGroup, (i3 & 126) | ((i3 >> 3) & 896) | ((i3 << 6) & 3670016));
            boolean z3 = (i3 & 7168) == 2048;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt.$r8$lambda$YP4UVxgZHvmmTxTbG9h_9K3v5mg(com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions.this);
                    }
                };
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(rememberedValue7);
            } else {
                composer2 = startRestartGroup;
            }
            int i5 = i3 >> 6;
            function5.invoke(rememberSecureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue7, androidx.compose.ui.Modifier.INSTANCE, composer2, java.lang.Integer.valueOf(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | 384 | (i5 & 7168)));
            if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                composer2.startReplaceGroup(914569074);
                com.paypal.oslo.feature.inappcheckout.features.loader.screen.LoadingScreenKt.LoadingScreen(loadingSettings, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{checkoutLogger.provideBusinessFlowContext(), checkoutLogger.provideUserIntentContext(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.WEB_VIEW_CHECKOUT_URL_LOADING)}), composer2, (com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext.$stable << 3) | (i5 & 14), 0);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(915006329);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt.$r8$lambda$UuUbZHUXl6k03eSXE5kKgIY2Y5c(str, map, loadingSettings, webViewActions, checkoutLogger, function5, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (r7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration rememberSecureWebViewConfiguration(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, final com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions webViewActions, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<? extends com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge> function0, final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, androidx.compose.runtime.Composer composer, int i) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewActions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1426592406, i, -1, "com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.rememberSecureWebViewConfiguration (InAppCheckoutWebViewScreen.kt:124)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
        boolean z = (((i & 896) ^ 384) > 256 && composer.changed(webViewActions)) || (i & 384) == 256;
        boolean changed = composer.changed(coroutineScope);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (!(z | changed)) {
            obj = rememberedValue2;
        }
        com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutJsInterface inAppCheckoutJsInterface = new com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutJsInterface(coroutineScope, checkoutLogger);
        inAppCheckoutJsInterface.setOnRypPageRenderedCallback(webViewActions.getOnRypPageRendered());
        inAppCheckoutJsInterface.setOnReturnButtonClickedCallback(webViewActions.getOnReturnToMerchantButtonClicked());
        composer.updateRememberedValue(inAppCheckoutJsInterface);
        obj = inAppCheckoutJsInterface;
        java.lang.Object obj2 = (com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutJsInterface) obj;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4;
        boolean changed2 = composer.changed(map);
        boolean changed3 = composer.changed(obj2);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((changed2 | z2 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            java.lang.Object secureWebViewConfiguration = new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(str, com.paypal.oslo.feature.inappcheckout.Constants.WEB_VIEW_SOURCE, false, false, map, 8, null), new com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt$rememberSecureWebViewConfiguration$1$2
                @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
                public final /* bridge */ void onActionsReady(com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle webViewActionBundle) {
                    super.onActionsReady(webViewActionBundle);
                }

                @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
                public final /* bridge */ void onDownloadRequest(java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j) {
                    super.onDownloadRequest(str2, str3, str4, str5, j);
                }

                @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
                public final /* bridge */ void onLoadingFinished(java.lang.String str2) {
                    super.onLoadingFinished(str2);
                }

                @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
                public final /* bridge */ void onLoadingStarted(java.lang.String str2) {
                    super.onLoadingStarted(str2);
                }

                @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
                public final void onLoadFailed(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                    com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions.this.getOnError().invoke(error.toString());
                }
            }, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(null, null, false, false, true, 15, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(com.paypal.oslo.feature.inappcheckout.Constants.WEB_VIEW_USER_AGENT_SUFFIX, true), new com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.INAPP_CHECKOUT_JS_INTERFACE, obj2)), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt.$r8$lambda$XPiVN5MwzDpoq6TjAqciaMIyyt0(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge) obj3);
                }
            }), new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(new com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.components.InAppCheckoutWebViewScreenKt$rememberSecureWebViewConfiguration$1$3
                private java.lang.String lastFinishedPage;

                @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                public final /* bridge */ boolean onPdfDetected(java.lang.String str2) {
                    return super.onPdfDetected(str2);
                }

                @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                public final /* bridge */ void onReceivedError(android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
                    super.onReceivedError(webResourceRequest, webResourceError);
                }

                @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                public final /* bridge */ void onReceivedHttpError(android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
                    super.onReceivedHttpError(webResourceRequest, webResourceResponse);
                }

                @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                public final /* bridge */ boolean shouldOverrideUrlLoading(android.webkit.WebResourceRequest webResourceRequest) {
                    return super.shouldOverrideUrlLoading(webResourceRequest);
                }

                public final java.lang.String getLastFinishedPage() {
                    return this.lastFinishedPage;
                }

                public final void setLastFinishedPage(java.lang.String str2) {
                    this.lastFinishedPage = str2;
                }

                @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                public final void onPageStarted(java.lang.String url, android.graphics.Bitmap favicon) {
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger2 = com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.this;
                    if (url == null) {
                        url = "null";
                    }
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger2, "WEBVIEW PAGE STARTED", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), null, 4, null);
                }

                @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                public final void onPageFinished(java.lang.String url) {
                    function1.invoke(java.lang.Boolean.FALSE);
                    if (url != null) {
                        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger2 = com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.this;
                        com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions webViewActions2 = webViewActions;
                        kotlin.jvm.functions.Function0<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge> function02 = function0;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.lastFinishedPage, url)) {
                            return;
                        }
                        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger2, "WEBVIEW PAGE FINISHED", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), null, 4, null);
                        this.lastFinishedPage = url;
                        webViewActions2.getOnWebViewUrlChange().invoke(function02.invoke(), url);
                    }
                }
            }, null, 2, null), 1, null);
            composer.updateRememberedValue(secureWebViewConfiguration);
            rememberedValue3 = secureWebViewConfiguration;
        }
        com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration2 = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue3;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return secureWebViewConfiguration2;
    }

    /* renamed from: $r8$lambda$Go4FBr-BPbYpLS4DKjg2g-AHIZQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15457$r8$lambda$Go4FBrBPbYpLS4DKjg2gAHIZQ(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UuUbZHUXl6k03eSXE5kKgIY2Y5c(java.lang.String str, java.util.Map map, com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings loadingSettings, com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions webViewActions, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, kotlin.jvm.functions.Function5 function5, int i, androidx.compose.runtime.Composer composer, int i2) {
        InAppCheckoutWebViewScreen(str, map, loadingSettings, webViewActions, checkoutLogger, function5, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XPiVN5MwzDpoq6TjAqciaMIyyt0(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge secureWebViewJavaScriptBridge) {
        function1.invoke(secureWebViewJavaScriptBridge);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YP4UVxgZHvmmTxTbG9h_9K3v5mg(com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions webViewActions) {
        webViewActions.getOnBackPressed().invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$if_-1OU4JvbefrwDk5rA1OALnp4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15458$r8$lambda$if_1OU4JvbefrwDk5rA1OALnp4(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge secureWebViewJavaScriptBridge) {
        mutableState.setValue(secureWebViewJavaScriptBridge);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kOC2G7o3MN_27sTXr_VdjvErtZ0(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, "WebView screen");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge $r8$lambda$qeMABOiN2H0ivTDk4PCyiliTxKM(androidx.compose.runtime.MutableState mutableState) {
        return (com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge) mutableState.getValue();
    }
}
