package com.paypal.oslo.feature.idassurance.ui;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072X\b\u0002\u0010\b\u001aR\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a2\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\b\u0010\u0016\u001a\u00020\u0017H\u0000¨\u0006\u0018"}, d2 = {"IdAssuranceWebViewScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "url", "", "isAuthRequired", "", "webViewContent", "Lkotlin/Function3;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/ParameterName;", "name", "config", "Lkotlin/Function0;", "onBackClick", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;ZLkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;II)V", "createIdassuranceWebViewConfiguration", "Lkotlin/Pair;", "createChromeDelegate", "Lcom/paypal/oslo/core/webview/ui/client/SecureWebChromeClientDelegate;", "idassurance_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IdAssuranceWebViewScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IdAssuranceWebViewScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final boolean z, kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function52;
        final kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function53;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-469995392);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function52 = function5;
            i3 |= startRestartGroup.changedInstance(function52) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                function53 = function52;
            } else {
                final kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> lambda$1312206171$idassurance_prodRelease = i4 != 0 ? com.paypal.oslo.feature.idassurance.ui.ComposableSingletons$IdAssuranceWebViewScreenKt.INSTANCE.getLambda$1312206171$idassurance_prodRelease() : function52;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-469995392, i3, -1, "com.paypal.oslo.feature.idassurance.ui.IdAssuranceWebViewScreen (IdAssuranceWebViewScreen.kt:66)");
                }
                boolean z2 = (i3 & 112) == 32;
                boolean z3 = (i3 & 896) == 256;
                boolean z4 = (i3 & 14) == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z2 | z3 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = createIdassuranceWebViewConfiguration(appNavigator, str, z);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.Pair pair = (kotlin.Pair) rememberedValue;
                final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) pair.component1();
                final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) pair.component2();
                androidx.compose.ui.Modifier clipToBounds = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null));
                androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2130348842, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.idassurance.ui.IdAssuranceWebViewScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.idassurance.ui.IdAssuranceWebViewScreenKt.$r8$lambda$XwKVbXLqEjnAIcCiNoLjb59lsrQ(kotlin.jvm.functions.Function5.this, secureWebViewConfiguration, function0, (androidx.compose.foundation.layout.BoxWithConstraintsScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54);
                function53 = lambda$1312206171$idassurance_prodRelease;
                androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(clipToBounds, center, false, rememberComposableLambda, startRestartGroup, 3126, 4);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.idassurance.ui.IdAssuranceWebViewScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.idassurance.ui.IdAssuranceWebViewScreenKt.m14990$r8$lambda$yrfgbwL_TTfG7ThUq6tQgtIK9w(com.paypal.oslo.core.navigation.AppNavigator.this, str, z, function53, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function52 = function5;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final kotlin.Pair<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>> createIdassuranceWebViewConfiguration(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.idassurance.LoggerKt.log, "webview url", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str)), null, 4, null);
        com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate createChromeDelegate = createChromeDelegate();
        return kotlin.TuplesKt.to(new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(str, "idassurance", z, false, null, 16, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(null, null, true, true, false, 19, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(null, createChromeDelegate, 1, null), 1, null), new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.idassurance.ui.IdAssuranceWebViewScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.idassurance.ui.IdAssuranceWebViewScreenKt.m14989$r8$lambda$xlsvZD4bhjD0V1hZrt3tzcfBag(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        });
    }

    public static final com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate createChromeDelegate() {
        return new com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate() { // from class: com.paypal.oslo.feature.idassurance.ui.IdAssuranceWebViewScreenKt$createChromeDelegate$1
            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
                super.onGeolocationPermissionsShowPrompt(str, callback);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onJsAlert(java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
                return super.onJsAlert(str, str2, jsResult);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onJsConfirm(java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
                return super.onJsConfirm(str, str2, jsResult);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onJsPrompt(java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
                return super.onJsPrompt(str, str2, str3, jsPromptResult);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
                super.onPermissionRequest(permissionRequest);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ void onProgressChanged(int i) {
                super.onProgressChanged(i);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ void onReceivedIcon(android.graphics.Bitmap bitmap) {
                super.onReceivedIcon(bitmap);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ void onReceivedTitle(java.lang.String str) {
                super.onReceivedTitle(str);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onShowFileChooser(android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
                return super.onShowFileChooser(valueCallback, fileChooserParams);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
                java.lang.String message = consoleMessage != null ? consoleMessage.message() : null;
                java.lang.String str = message;
                if (str == null || str.length() == 0) {
                    return true;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.idassurance.LoggerKt.log, "message from webview", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("console", message)), null, 4, null);
                return true;
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XwKVbXLqEjnAIcCiNoLjb59lsrQ(kotlin.jvm.functions.Function5 function5, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxWithConstraintsScope, "");
        if ((i & 6) == 0) {
            i |= composer.changed(boxWithConstraintsScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2130348842, i, -1, "com.paypal.oslo.feature.idassurance.ui.IdAssuranceWebViewScreen.<anonymous> (IdAssuranceWebViewScreen.kt:82)");
            }
            function5.invoke(secureWebViewConfiguration, function0, androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, boxWithConstraintsScope.mo1624getMaxWidthD9Ej5fM(), boxWithConstraintsScope.mo1623getMaxHeightD9Ej5fM()), composer, java.lang.Integer.valueOf(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xYlDcqIcMCOKzvEyXbzeJ-4tbh4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14988$r8$lambda$xYlDcqIcMCOKzvEyXbzeJ4tbh4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xlsvZD4bhjD0V1hZrt3tz-cfBag, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14989$r8$lambda$xlsvZD4bhjD0V1hZrt3tzcfBag(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.idassurance.ui.IdAssuranceWebViewScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.idassurance.ui.IdAssuranceWebViewScreenKt.m14988$r8$lambda$xYlDcqIcMCOKzvEyXbzeJ4tbh4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yrfgbwL_TTfG7ThUq6-tQgtIK9w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14990$r8$lambda$yrfgbwL_TTfG7ThUq6tQgtIK9w(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, boolean z, kotlin.jvm.functions.Function5 function5, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        IdAssuranceWebViewScreen(appNavigator, str, z, function5, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
