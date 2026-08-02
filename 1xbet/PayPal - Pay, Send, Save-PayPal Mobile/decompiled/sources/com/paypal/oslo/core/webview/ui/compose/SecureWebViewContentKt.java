package com.paypal.oslo.core.webview.ui.compose;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ak\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/webview/ui/state/LoadableContent;", "loadableContent", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "config", "Lcom/paypal/oslo/core/webview/ui/viewmodel/SecureWebViewViewModel;", "viewModel", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallbackManager;", "callbackManager", "", "showProgressIndicator", "", "source", "Lkotlin/Function0;", "", "onBackClick", "Lkotlin/Function1;", "onTitleReceive", "SecureWebViewContentSection", "(Landroid/content/Context;Lcom/paypal/oslo/core/webview/ui/state/LoadableContent;Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;Lcom/paypal/oslo/core/webview/ui/viewmodel/SecureWebViewViewModel;Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallbackManager;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroid/webkit/WebView;", "webView", "onExitWebView", "rememberBackHandler", "(Landroid/webkit/WebView;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecureWebViewContentKt {
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0399, code lost:
    
        if (r9.changedInstance(r35) == false) goto L161;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SecureWebViewContentSection(final android.content.Context context, final com.paypal.oslo.core.webview.ui.state.LoadableContent loadableContent, final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, final com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel secureWebViewViewModel, final com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallbackManager secureWebViewCallbackManager, final boolean z, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridgeImpl secureWebViewJavaScriptBridgeImpl;
        boolean z2;
        boolean z3;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadableContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallbackManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(922436424);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(loadableContent) : startRestartGroup.changedInstance(loadableContent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(secureWebViewConfiguration) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(secureWebViewViewModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? startRestartGroup.changed(secureWebViewCallbackManager) : startRestartGroup.changedInstance(secureWebViewCallbackManager) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(str) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(922436424, i3, -1, "com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentSection (SecureWebViewContent.kt:79)");
            }
            com.paypal.oslo.core.webview.ui.compose.PageProgressState rememberPageProgressState = com.paypal.oslo.core.webview.ui.compose.SecureWebViewProgressKt.rememberPageProgressState(startRestartGroup, 0);
            boolean changed = startRestartGroup.changed(secureWebViewConfiguration);
            int i4 = i3 & 57344;
            boolean z4 = i4 == 16384 || ((i3 & 32768) != 0 && startRestartGroup.changed(secureWebViewCallbackManager));
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed | z4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] content section created", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str)), null, 4, null);
                android.webkit.WebView webView = new android.webkit.WebView(context);
                webView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
                com.paypal.oslo.core.webview.ui.extension.SecureWebViewExtensionsKt.applySecureSettings(webView, secureWebViewConfiguration.getSettings(), str);
                com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration javascript = secureWebViewConfiguration.getJavascript();
                if (javascript != null) {
                    com.paypal.oslo.core.webview.ui.extension.SecureWebViewExtensionsKt.applyJavaScriptInterfaces(webView, javascript, secureWebViewCallbackManager, str);
                }
                com.paypal.oslo.core.webview.ui.extension.SecureWebViewExtensionsKt.applyDownloadListener(webView, secureWebViewCallbackManager, str);
                com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration clients = secureWebViewConfiguration.getClients();
                com.paypal.oslo.core.webview.ui.compose.PageProgressState pageProgressState = rememberPageProgressState;
                webView.setWebChromeClient(new com.paypal.oslo.core.webview.ui.client.SecureWebChromeClient(str, clients != null ? clients.getWebChromeClientDelegate() : null, pageProgressState, function1));
                com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration clients2 = secureWebViewConfiguration.getClients();
                webView.setWebViewClient(new com.paypal.oslo.core.webview.ui.client.SecureWebViewClient(str, secureWebViewViewModel, clients2 != null ? clients2.getWebViewClientDelegate() : null, pageProgressState));
                com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration javascript2 = secureWebViewConfiguration.getJavascript();
                kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> jsBridgeCallback = javascript2 != null ? javascript2.getJsBridgeCallback() : null;
                if (jsBridgeCallback != null) {
                    if (!webView.getSettings().getJavaScriptEnabled()) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] JS bridge creation skipped - JavaScript disabled", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str)), null, null, 12, null);
                        secureWebViewCallbackManager.notifyCallbacks$webview_release(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt.$r8$lambda$51OSW0vU1lZ8Ioz6HxDKfwCucJE((com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback) obj);
                            }
                        });
                    } else {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] JS bridge created", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str)), null, 4, null);
                        com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridgeImpl secureWebViewJavaScriptBridgeImpl2 = new com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridgeImpl(webView, str);
                        jsBridgeCallback.invoke(secureWebViewJavaScriptBridgeImpl2);
                        secureWebViewJavaScriptBridgeImpl = secureWebViewJavaScriptBridgeImpl2;
                        com.paypal.oslo.core.webview.ui.callback.SecureWebViewActionsImpl secureWebViewActionsImpl = new com.paypal.oslo.core.webview.ui.callback.SecureWebViewActionsImpl(webView, str);
                        com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActionsImpl navigationWebViewActionsImpl = new com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActionsImpl(webView, str);
                        final com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle webViewActionBundle = new com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle(secureWebViewActionsImpl, navigationWebViewActionsImpl);
                        secureWebViewCallbackManager.notifyCallbacks$webview_release(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt.$r8$lambda$q85PBP16v9gMToPvTyaXffzeDPw(com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle.this, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback) obj);
                            }
                        });
                        java.lang.Object webViewState = new com.paypal.oslo.core.webview.ui.compose.WebViewState(webView, secureWebViewJavaScriptBridgeImpl, jsBridgeCallback, secureWebViewActionsImpl, navigationWebViewActionsImpl);
                        startRestartGroup.updateRememberedValue(webViewState);
                        rememberedValue2 = webViewState;
                    }
                }
                secureWebViewJavaScriptBridgeImpl = null;
                com.paypal.oslo.core.webview.ui.callback.SecureWebViewActionsImpl secureWebViewActionsImpl2 = new com.paypal.oslo.core.webview.ui.callback.SecureWebViewActionsImpl(webView, str);
                com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActionsImpl navigationWebViewActionsImpl2 = new com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActionsImpl(webView, str);
                final com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle webViewActionBundle2 = new com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle(secureWebViewActionsImpl2, navigationWebViewActionsImpl2);
                secureWebViewCallbackManager.notifyCallbacks$webview_release(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt.$r8$lambda$q85PBP16v9gMToPvTyaXffzeDPw(com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle.this, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback) obj);
                    }
                });
                java.lang.Object webViewState2 = new com.paypal.oslo.core.webview.ui.compose.WebViewState(webView, secureWebViewJavaScriptBridgeImpl, jsBridgeCallback, secureWebViewActionsImpl2, navigationWebViewActionsImpl2);
                startRestartGroup.updateRememberedValue(webViewState2);
                rememberedValue2 = webViewState2;
            }
            final com.paypal.oslo.core.webview.ui.compose.WebViewState webViewState3 = (com.paypal.oslo.core.webview.ui.compose.WebViewState) rememberedValue2;
            int i5 = 3670016 & i3;
            boolean z5 = i5 == 1048576;
            boolean changedInstance2 = startRestartGroup.changedInstance(webViewState3);
            boolean z6 = i4 == 16384 || ((i3 & 32768) != 0 && startRestartGroup.changedInstance(secureWebViewCallbackManager));
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((z5 | changedInstance2 | z6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt.$r8$lambda$RoxYZh6P5auV2q_c2pRuO6xHYg4(str, webViewState3, secureWebViewCallbackManager, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(webViewState3, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, startRestartGroup, 0);
            final kotlin.jvm.functions.Function0<kotlin.Unit> rememberBackHandler = rememberBackHandler(webViewState3.getHighSpeedVideoSizes, function0, str, startRestartGroup, ((i3 >> 18) & 112) | ((i3 >> 12) & 896));
            boolean changed2 = startRestartGroup.changed(rememberBackHandler);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt.$r8$lambda$qr6AMba7d4WMk0zmuQstbLaJFLI(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 0, 1);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            if (z) {
                startRestartGroup.startReplaceGroup(1365806581);
                z2 = false;
                com.paypal.oslo.core.webview.ui.compose.SecureWebViewProgressKt.SecureWebViewProgressBar(rememberPageProgressState, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                z2 = false;
                startRestartGroup.startReplaceGroup(1365882500);
                startRestartGroup.endReplaceGroup();
            }
            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changedInstance3 = startRestartGroup.changedInstance(webViewState3);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt.$r8$lambda$PEYJPIqVdjBxgHLCk9iU25o1jLU(com.paypal.oslo.core.webview.ui.compose.WebViewState.this, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(fillMaxSize$default2, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, 12582918, 382);
            startRestartGroup.endNode();
            if ((i3 & 112) != 32) {
                if ((i3 & 64) != 0) {
                    composer2 = startRestartGroup;
                } else {
                    composer2 = startRestartGroup;
                }
                z3 = z2;
                if (i5 == 1048576) {
                    z2 = true;
                }
                changedInstance = composer2.changedInstance(webViewState3);
                rememberedValue = composer2.rememberedValue();
                if (!(changedInstance | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$SecureWebViewContentSection$4$1(loadableContent, str, webViewState3, null);
                    composer2.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(loadableContent, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, (i3 >> 3) & 14);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                composer2 = startRestartGroup;
            }
            z3 = true;
            if (i5 == 1048576) {
            }
            changedInstance = composer2.changedInstance(webViewState3);
            rememberedValue = composer2.rememberedValue();
            if (!(changedInstance | z2 | z3)) {
            }
            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$SecureWebViewContentSection$4$1(loadableContent, str, webViewState3, null);
            composer2.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(loadableContent, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, (i3 >> 3) & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt.$r8$lambda$2aulM1P_6P4o6d_C1a_se6jJo8M(context, loadableContent, secureWebViewConfiguration, secureWebViewViewModel, secureWebViewCallbackManager, z, str, function0, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> rememberBackHandler(final android.webkit.WebView webView, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(171807140, i, -1, "com.paypal.oslo.core.webview.ui.compose.rememberBackHandler (SecureWebViewContent.kt:224)");
        }
        boolean changed = composer.changed(webView);
        boolean z = true;
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(function0)) || (i & 48) == 32;
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(str)) && (i & 384) != 256) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt.$r8$lambda$e3wlwKZSuE2Lo30bIDdtNBF621w(webView, str, function0);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = (kotlin.jvm.functions.Function0) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return function02;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2aulM1P_6P4o6d_C1a_se6jJo8M(android.content.Context context, com.paypal.oslo.core.webview.ui.state.LoadableContent loadableContent, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel secureWebViewViewModel, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallbackManager secureWebViewCallbackManager, boolean z, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        SecureWebViewContentSection(context, loadableContent, secureWebViewConfiguration, secureWebViewViewModel, secureWebViewCallbackManager, z, str, function0, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$51OSW0vU1lZ8Ioz6HxDKfwCucJE(com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallback, "");
        secureWebViewCallback.onLoadFailed(new com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed("JavaScript bridge configured but JavaScript is disabled. Set javaScriptEnabled = true in SecureWebViewSettings.", null, 2, null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9EFvjgJw--0sN6SsKQBAuyTH-Yw, reason: not valid java name */
    public static /* synthetic */ android.webkit.WebView m11699$r8$lambda$9EFvjgJw0sN6SsKQBAuyTHYw(com.paypal.oslo.core.webview.ui.compose.WebViewState webViewState, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return webViewState.getHighSpeedVideoSizes;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PEYJPIqVdjBxgHLCk9iU25o1jLU(final com.paypal.oslo.core.webview.ui.compose.WebViewState webViewState, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1194960467, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt.m11700$r8$lambda$WE34BbzEgJWNsWFSPTX_KztL28(com.paypal.oslo.core.webview.ui.compose.WebViewState.this, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$RoxYZh6P5auV2q_c2pRuO6xHYg4(final java.lang.String str, final com.paypal.oslo.core.webview.ui.compose.WebViewState webViewState, final com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallbackManager secureWebViewCallbackManager, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$SecureWebViewContentSection$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] content section disposed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str)), null, 4, null);
                com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridgeImpl secureWebViewJavaScriptBridgeImpl = webViewState.getHighSpeedVideoFpsRangesFor;
                if (secureWebViewJavaScriptBridgeImpl != null) {
                    secureWebViewJavaScriptBridgeImpl.dispose$webview_release();
                }
                kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> function1 = webViewState.getHighResolutionOutputSizeshNQ4ISI;
                if (function1 != null) {
                    function1.invoke(null);
                }
                webViewState.Camera2StreamConfigurationMap.dispose$webview_release();
                webViewState.getHighSpeedVideoFpsRanges.dispose$webview_release();
                secureWebViewCallbackManager.notifyCallbacks$webview_release(new kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback, kotlin.Unit>() { // from class: com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$SecureWebViewContentSection$1$1$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback) {
                        com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback2 = secureWebViewCallback;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallback2, "");
                        secureWebViewCallback2.onActionsReady(null);
                        return kotlin.Unit.INSTANCE;
                    }
                });
                com.paypal.oslo.core.webview.ui.extension.SecureWebViewExtensionsKt.dispose(webViewState.getHighSpeedVideoSizes, str);
            }
        };
    }

    /* renamed from: $r8$lambda$W-E34BbzEgJWNsWFSPTX_KztL28, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11700$r8$lambda$WE34BbzEgJWNsWFSPTX_KztL28(final com.paypal.oslo.core.webview.ui.compose.WebViewState webViewState, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i & 6) == 0) {
            i |= composer.changed(lazyItemScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1194960467, i, -1, "com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SecureWebViewContent.kt:173)");
            }
            boolean changedInstance = composer.changedInstance(webViewState);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt.m11699$r8$lambda$9EFvjgJw0sN6SsKQBAuyTHYw(com.paypal.oslo.core.webview.ui.compose.WebViewState.this, (android.content.Context) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView((kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.lazy.LazyItemScope.fillParentMaxSize$default(lazyItemScope, androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "SecureWebView"), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e3wlwKZSuE2Lo30bIDdtNBF621w(android.webkit.WebView webView, java.lang.String str, kotlin.jvm.functions.Function0 function0) {
        if (webView.canGoBack()) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.webview.LoggerKt.log;
            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str));
            java.lang.String url = webView.getUrl();
            if (url == null) {
                url = "unknown";
            }
            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url));
            webView.goBack();
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] back navigation - exiting WebView", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str)), null, 4, null);
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q85PBP16v9gMToPvTyaXffzeDPw(com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle webViewActionBundle, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallback, "");
        secureWebViewCallback.onActionsReady(webViewActionBundle);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qr6AMba7d4WMk0zmuQstbLaJFLI(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
