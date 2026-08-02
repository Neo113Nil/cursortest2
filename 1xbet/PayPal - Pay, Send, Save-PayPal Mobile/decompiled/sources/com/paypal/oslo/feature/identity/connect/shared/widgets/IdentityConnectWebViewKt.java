package com.paypal.oslo.feature.identity.connect.shared.widgets;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\n\u001aL\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\fH\u0000\u001a$\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a\u001c\u0010\u0016\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a\u001c\u0010\u0017\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0019"}, d2 = {"IdentityConnectWebView", "", "connectUrl", "", "redirectUri", "isInitialized", "", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/connect/shared/widgets/InboundConnectWebViewEvent;", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "createInboundConnectWebViewDelegate", "Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;", "onPageLoadStart", "onPageLoadFinish", "onRedirectUrlIntercept", "createInboundConnectWebViewConfiguration", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "url", "webViewDelegate", "createInboundConnectWebViewDelegateWithEventHandlers", "eventHandler", "handleBackClick", "handleWebViewInitialized", "isRedirectUriMatch", "identity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IdentityConnectWebViewKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IdentityConnectWebView(final java.lang.String str, final java.lang.String str2, boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(867366698);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
            }
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                boolean z3 = i5 != 0 ? false : z2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(867366698, i4, -1, "com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebView (IdentityConnectWebView.kt:45)");
                }
                final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, (i4 >> 9) & 14);
                boolean z4 = (i4 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = createInboundConnectWebViewDelegateWithEventHandlers(str2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt.$r8$lambda$JKnBM22GFAU2D8QKOhTG5u6NGug(androidx.compose.runtime.State.this, (com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent) obj);
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate = (com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate) rememberedValue;
                boolean z5 = (i4 & 14) == 4;
                boolean changed = startRestartGroup.changed(secureWebViewClientDelegate);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z5 | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = createInboundConnectWebViewConfiguration(str, secureWebViewClientDelegate);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue2;
                boolean changed2 = startRestartGroup.changed(rememberUpdatedState);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt.m15125$r8$lambda$PlALV0tfdErT8wZDslY4WNoRA(androidx.compose.runtime.State.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue3, null, null, startRestartGroup, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable, 12);
                if (!z3) {
                    startRestartGroup.startReplaceGroup(1199157370);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    boolean z6 = (i4 & 7168) == 2048;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (z6 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt$IdentityConnectWebView$2$1(function1, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1199247704);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                z2 = z3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final boolean z7 = z2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt.m15126$r8$lambda$RwlbEgJ2WkHRhEFXHnn1BhPIU(str, str2, z7, function1, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate createInboundConnectWebViewDelegate(final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        return new com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate() { // from class: com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt$createInboundConnectWebViewDelegate$1
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
            public final boolean shouldOverrideUrlLoading(android.webkit.WebResourceRequest request) {
                android.net.Uri url;
                java.lang.String obj;
                if (request == null || (url = request.getUrl()) == null || (obj = url.toString()) == null) {
                    return false;
                }
                if (com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt.isRedirectUriMatch(obj, str)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect WebView intercepting OAuth redirect URL", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", obj)), 2, null);
                    function13.invoke(obj);
                    return true;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect WebView allowing URL to load", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", obj)), 2, null);
                return false;
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final void onPageStarted(java.lang.String url, android.graphics.Bitmap favicon) {
                if (url != null) {
                    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function14 = function1;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect WebView page load started", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), 2, null);
                    function14.invoke(url);
                }
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final void onPageFinished(java.lang.String url) {
                if (url != null) {
                    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function14 = function12;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Inbound Connect WebView page load finished", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url)), 2, null);
                    function14.invoke(url);
                }
            }
        };
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration createInboundConnectWebViewConfiguration(java.lang.String str, com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewClientDelegate, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(new com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url(str, "connect", false, true, null, 16, null), null, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(null, null, false, false, true, 2, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(secureWebViewClientDelegate, null, 2, null), 38, null);
    }

    public static final com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate createInboundConnectWebViewDelegateWithEventHandlers(java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return createInboundConnectWebViewDelegate(str, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt.$r8$lambda$Wnktz7Q7uuPvTfeBelgDS6v33k4(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt.$r8$lambda$Wq0_8cUn9K6bd1KXTIE9tej3X7I(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.connect.shared.widgets.IdentityConnectWebViewKt.$r8$lambda$HNxmYMh0NKvJ5Xu7nyCBdY7OzpQ(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
            }
        });
    }

    public static final void handleBackClick(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.BackClicked.INSTANCE);
    }

    public static final void handleWebViewInitialized(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.WebViewInitialized.INSTANCE);
    }

    public static final boolean isRedirectUriMatch(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        try {
            java.net.URI uri = new java.net.URI(str);
            java.net.URI uri2 = new java.net.URI(str2);
            if (kotlin.jvm.internal.Intrinsics.areEqual(uri.getScheme(), uri2.getScheme()) && kotlin.jvm.internal.Intrinsics.areEqual(uri.getHost(), uri2.getHost()) && uri.getPort() == uri2.getPort()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(uri.getPath(), uri2.getPath())) {
                    return true;
                }
            }
            return false;
        } catch (java.net.URISyntaxException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage()));
            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str), kotlin.TuplesKt.to("redirectUri", str2));
            return false;
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HNxmYMh0NKvJ5Xu7nyCBdY7OzpQ(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.RedirectUrlIntercepted(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JKnBM22GFAU2D8QKOhTG5u6NGug(androidx.compose.runtime.State state, com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent inboundConnectWebViewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboundConnectWebViewEvent, "");
        ((kotlin.jvm.functions.Function1) state.getValue()).invoke(inboundConnectWebViewEvent);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PlALV0tfdErT8wZDsl-Y4-WNoRA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15125$r8$lambda$PlALV0tfdErT8wZDslY4WNoRA(androidx.compose.runtime.State state) {
        handleBackClick((kotlin.jvm.functions.Function1) state.getValue());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Rwlb-EgJ2WkHRh-EFXHnn1BhPIU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15126$r8$lambda$RwlbEgJ2WkHRhEFXHnn1BhPIU(java.lang.String str, java.lang.String str2, boolean z, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        IdentityConnectWebView(str, str2, z, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Wnktz7Q7uuPvTfeBelgDS6v33k4(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadStarted(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Wq0_8cUn9K6bd1KXTIE9tej3X7I(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.identity.connect.shared.widgets.InboundConnectWebViewEvent.PageLoadFinished(str));
        return kotlin.Unit.INSTANCE;
    }
}
