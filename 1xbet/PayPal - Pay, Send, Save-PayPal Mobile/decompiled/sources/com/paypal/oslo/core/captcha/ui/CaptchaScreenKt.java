package com.paypal.oslo.core.captcha.ui;

@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001al\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072C\b\u0002\u0010\b\u001a=\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a.\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019H\u0000¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u0013X\u008a\u008e\u0002"}, d2 = {"CaptchaScreen", "", "destination", "Lcom/paypal/oslo/core/captcha/ui/CaptchaDestination;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/core/captcha/ui/CaptchaViewModel;", "secureWebViewContent", "Lkotlin/Function2;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/ParameterName;", "name", "config", "Lkotlin/Function0;", "onBackClick", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/core/captcha/ui/CaptchaDestination;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/captcha/ui/CaptchaViewModel;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "handleUrlLoading", "", "request", "Landroid/webkit/WebResourceRequest;", "parameters", "Lcom/paypal/oslo/core/captcha/CaptchaChallengeInput;", "onResult", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/captcha/CaptchaChallengeResult;", "captcha_release", "resultReported"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CaptchaScreenKt {
    public static /* synthetic */ java.lang.String $r8$lambda$DziCTvSE4Tn9ZvjgQ6LQSxsu1fQ(java.lang.String str, java.lang.String str2) {
        return str;
    }

    public static final void CaptchaScreen(final com.paypal.oslo.core.captcha.ui.CaptchaDestination captchaDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.captcha.ui.CaptchaViewModel captchaViewModel, kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.core.captcha.ui.CaptchaViewModel captchaViewModel2;
        kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function42;
        final kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function43;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captchaDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(876182773);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(captchaDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                captchaViewModel2 = captchaViewModel;
                if (startRestartGroup.changedInstance(captchaViewModel2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                captchaViewModel2 = captchaViewModel;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            captchaViewModel2 = captchaViewModel;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
            function42 = function4;
        } else {
            function42 = function4;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function42) ? 2048 : 1024;
            }
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else {
                if ((i2 & 4) != 0) {
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
                    captchaViewModel2 = (com.paypal.oslo.core.captcha.ui.CaptchaViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.captcha.ui.CaptchaViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i3 &= -897;
                }
                function42 = i5 != 0 ? com.paypal.oslo.core.captcha.ui.ComposableSingletons$CaptchaScreenKt.INSTANCE.getLambda$338448410$captcha_release() : function4;
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(876182773, i3, -1, "com.paypal.oslo.core.captcha.ui.CaptchaScreen (CaptchaScreen.kt:68)");
            }
            boolean z = (i3 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.captcha.R.string.core_captcha_captcha_screen_title, startRestartGroup, 0);
            boolean changed = startRestartGroup.changed(captchaDestination.getParameters());
            boolean changed2 = startRestartGroup.changed(stringResource);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(captchaDestination.getParameters().getChallengeUri(), "captcha", false, false, captchaViewModel2.buildCaptchaHeaders(captchaDestination.getParameters().getCorrelationId()), 8, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(stringResource, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.captcha.ui.CaptchaScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.captcha.ui.CaptchaScreenKt.$r8$lambda$DziCTvSE4Tn9ZvjgQ6LQSxsu1fQ(stringResource, (java.lang.String) obj);
                    }
                }, true, true, false, 16, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(new com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate() { // from class: com.paypal.oslo.core.captcha.ui.CaptchaScreenKt$CaptchaScreen$config$1$2
                    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                    public final /* bridge */ void onPageFinished(java.lang.String str) {
                        super.onPageFinished(str);
                    }

                    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                    public final /* bridge */ void onPageStarted(java.lang.String str, android.graphics.Bitmap bitmap) {
                        super.onPageStarted(str, bitmap);
                    }

                    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                    public final /* bridge */ boolean onPdfDetected(java.lang.String str) {
                        return super.onPdfDetected(str);
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
                        return com.paypal.oslo.core.captcha.ui.CaptchaScreenKt.handleUrlLoading(request, com.paypal.oslo.core.captcha.ui.CaptchaDestination.this.getParameters(), new com.paypal.oslo.core.captcha.ui.CaptchaScreenKt$CaptchaScreen$config$1$2$shouldOverrideUrlLoading$1(appNavigator, mutableState));
                    }
                }, null, 2, null), 37, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.captcha.ui.CaptchaScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.captcha.ui.CaptchaScreenKt.$r8$lambda$K3H4zVwDiSxVT9UnXf61n80Ylqg(com.paypal.oslo.core.navigation.AppNavigator.this, mutableState);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            function42.invoke(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, java.lang.Integer.valueOf(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | 48 | ((i3 >> 3) & 896)));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            function43 = function42;
        } else {
            startRestartGroup.skipToGroupEnd();
            function43 = function4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.core.captcha.ui.CaptchaViewModel captchaViewModel3 = captchaViewModel2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.captcha.ui.CaptchaScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.captcha.ui.CaptchaScreenKt.m11082$r8$lambda$8z2CPfRWEyTPfy1oxMYlGqEdAo(com.paypal.oslo.core.captcha.ui.CaptchaDestination.this, appNavigator, captchaViewModel3, function43, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final boolean handleUrlLoading(android.webkit.WebResourceRequest webResourceRequest, com.paypal.oslo.core.captcha.CaptchaChallengeInput captchaChallengeInput, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.captcha.CaptchaChallengeResult, kotlin.Unit> function1) {
        android.net.Uri url;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captchaChallengeInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        boolean z = false;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            return false;
        }
        android.net.Uri parse = android.net.Uri.parse(captchaChallengeInput.getChallengeUri());
        java.lang.String returnUri = captchaChallengeInput.getReturnUri();
        if (kotlin.jvm.internal.Intrinsics.areEqual(url.getScheme(), parse.getScheme()) && kotlin.jvm.internal.Intrinsics.areEqual(url.getHost(), parse.getHost()) && kotlin.jvm.internal.Intrinsics.areEqual(url.getEncodedPath(), returnUri)) {
            z = true;
        }
        if (!z) {
            return z;
        }
        java.lang.String queryParameter = url.getQueryParameter(captchaChallengeInput.getReturnUriParam());
        if (queryParameter == null) {
            obj = (com.paypal.oslo.core.captcha.CaptchaChallengeResult) com.paypal.oslo.core.captcha.CaptchaChallengeResult.Success.INSTANCE;
        } else {
            obj = (com.paypal.oslo.core.captcha.CaptchaChallengeResult) new com.paypal.oslo.core.captcha.CaptchaChallengeResult.Failure(queryParameter);
        }
        function1.invoke(obj);
        return true;
    }

    /* renamed from: $r8$lambda$8z2CPfRW-EyTPfy1oxMYlGqEdAo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11082$r8$lambda$8z2CPfRWEyTPfy1oxMYlGqEdAo(com.paypal.oslo.core.captcha.ui.CaptchaDestination captchaDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.captcha.ui.CaptchaViewModel captchaViewModel, kotlin.jvm.functions.Function4 function4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CaptchaScreen(captchaDestination, appNavigator, captchaViewModel, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HriM9vRdxyK5rALgLYYzTCek7nQ(com.paypal.oslo.core.captcha.CaptchaChallengeResult captchaChallengeResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.core.captcha.ui.navigation.result.CaptchaNavResult(captchaChallengeResult));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$K3H4zVwDiSxVT9UnXf61n80Ylqg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.MutableState mutableState) {
        com.paypal.oslo.core.captcha.CaptchaChallengeResult.Cancelled cancelled = com.paypal.oslo.core.captcha.CaptchaChallengeResult.Cancelled.INSTANCE;
        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            mutableState.setValue(java.lang.Boolean.TRUE);
            appNavigator.navigate(new com.paypal.oslo.core.captcha.ui.CaptchaScreenKt$$ExternalSyntheticLambda0(cancelled));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void access$CaptchaScreen$reportResult(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.core.captcha.CaptchaChallengeResult captchaChallengeResult) {
        if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            return;
        }
        mutableState.setValue(java.lang.Boolean.TRUE);
        appNavigator.navigate(new com.paypal.oslo.core.captcha.ui.CaptchaScreenKt$$ExternalSyntheticLambda0(captchaChallengeResult));
    }
}
