package com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.webview;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\u008d\u0001\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2V\u0010\u000b\u001aR\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0014"}, d2 = {"TermsWebViewScreen", "", "url", "", "title", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TermsWebViewScreenContent", "webViewContent", "Lkotlin/Function3;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/ParameterName;", "name", "config", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;II)V", "createTermsWebViewConfiguration", "shopping-rewards_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TermsWebViewScreenKt {
    public static final void TermsWebViewScreen(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(285669100);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(285669100, i3, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.webview.TermsWebViewScreen (TermsWebViewScreen.kt:41)");
            }
            TermsWebViewScreenContent(str, str2, function0, modifier, com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.webview.ComposableSingletons$TermsWebViewScreenKt.INSTANCE.m19436getLambda$1835106843$shopping_rewards_prodRelease(), startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.webview.TermsWebViewScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.webview.TermsWebViewScreenKt.m19437$r8$lambda$dJKoOqRfx_tvPkkZcufffoUbA(str, str2, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TermsWebViewScreenContent(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function5, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1296640243);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function5) ? 16384 : 8192;
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1296640243, i3, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.webview.TermsWebViewScreenContent (TermsWebViewScreen.kt:82)");
                }
                boolean z = (i3 & 14) == 4;
                boolean z2 = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = createTermsWebViewConfiguration(str, str2);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                int i5 = i3 >> 3;
                function5.invoke((com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue, function0, modifier4, startRestartGroup, java.lang.Integer.valueOf(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | (i5 & 112) | (i5 & 896) | (i5 & 7168)));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.webview.TermsWebViewScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.webview.TermsWebViewScreenKt.$r8$lambda$gbRI1rCLyix8jQfGU_SoUMC1UKI(str, str2, function0, modifier3, function5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration createTermsWebViewConfiguration(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(str, "rewards-terms-webview", false, true, null, 16, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(str2, null, false, false, false, 30, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(new com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.webview.TermsWebViewScreenKt$createTermsWebViewConfiguration$1
            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final /* bridge */ void onPageFinished(java.lang.String str3) {
                super.onPageFinished(str3);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final /* bridge */ void onPageStarted(java.lang.String str3, android.graphics.Bitmap bitmap) {
                super.onPageStarted(str3, bitmap);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final /* bridge */ boolean onPdfDetected(java.lang.String str3) {
                return super.onPdfDetected(str3);
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
        }, new com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.webview.TermsWebViewScreenKt$createTermsWebViewConfiguration$2
            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ void onGeolocationPermissionsShowPrompt(java.lang.String str3, android.webkit.GeolocationPermissions.Callback callback) {
                super.onGeolocationPermissionsShowPrompt(str3, callback);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onJsAlert(java.lang.String str3, java.lang.String str4, android.webkit.JsResult jsResult) {
                return super.onJsAlert(str3, str4, jsResult);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onJsConfirm(java.lang.String str3, java.lang.String str4, android.webkit.JsResult jsResult) {
                return super.onJsConfirm(str3, str4, jsResult);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onJsPrompt(java.lang.String str3, java.lang.String str4, java.lang.String str5, android.webkit.JsPromptResult jsPromptResult) {
                return super.onJsPrompt(str3, str4, str5, jsPromptResult);
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
            public final /* bridge */ void onReceivedTitle(java.lang.String str3) {
                super.onReceivedTitle(str3);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
            public final /* bridge */ boolean onShowFileChooser(android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
                return super.onShowFileChooser(valueCallback, fileChooserParams);
            }
        }), 37, null);
    }

    /* renamed from: $r8$lambda$dJKoOqRfx_tvPkkZc-ufffoUb-A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19437$r8$lambda$dJKoOqRfx_tvPkkZcufffoUbA(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TermsWebViewScreen(str, str2, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gbRI1rCLyix8jQfGU_SoUMC1UKI(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function5 function5, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TermsWebViewScreenContent(str, str2, function0, modifier, function5, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
