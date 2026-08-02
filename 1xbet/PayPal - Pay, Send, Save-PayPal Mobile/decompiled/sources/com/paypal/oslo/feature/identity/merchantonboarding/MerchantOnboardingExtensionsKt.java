package com.paypal.oslo.feature.identity.merchantonboarding;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/MerchantOnboardingDestination;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "onAuthSuccess", "onAuthFailure", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "toWebViewConfiguration", "(Lcom/paypal/oslo/feature/identity/api/navigation/MerchantOnboardingDestination;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Landroid/net/Uri;", "uri", "", "handleMerchantOnboardingRedirect", "(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Z", "urlPath", "hasExactUrlPath", "(Landroid/net/Uri;Ljava/lang/String;)Z", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "createMerchantOnboardingAuthContext", "()Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "KeyAuthCodeParam", "Ljava/lang/String;", "KeyFailedParam"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MerchantOnboardingExtensionsKt {
    public static final java.lang.String KeyAuthCodeParam = "authCode";
    public static final java.lang.String KeyFailedParam = "failedBecause";

    public static /* synthetic */ com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration toWebViewConfiguration$default(com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination merchantOnboardingDestination, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt.$r8$lambda$PYrM6rxyNIC92C2HzJw1nbJ16qs((java.lang.String) obj2);
                }
            };
        }
        if ((i & 2) != 0) {
            function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt.$r8$lambda$pqVpJRgYRpY1mfGtZAtCorngYcU((java.lang.String) obj2);
                }
            };
        }
        return toWebViewConfiguration(merchantOnboardingDestination, function1, function12);
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration toWebViewConfiguration(com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination merchantOnboardingDestination, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantOnboardingDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(merchantOnboardingDestination.getUrl(), merchantOnboardingDestination.getSource(), true, false, null, 24, null), null, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(new com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate() { // from class: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt$toWebViewConfiguration$3
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
                android.net.Uri url;
                if (request == null || (url = request.getUrl()) == null) {
                    return false;
                }
                return com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt.handleMerchantOnboardingRedirect(url, function1, function12);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final void onPageFinished(java.lang.String url) {
                if (url != null) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Merchant onboarding page finished loading", null, null, 6, null);
                }
            }
        }, null, 2, null), 45, null);
    }

    public static final boolean handleMerchantOnboardingRedirect(android.net.Uri uri, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        if (!hasExactUrlPath(uri, "/nativeReturnUri")) {
            return false;
        }
        java.lang.String queryParameter = uri.getQueryParameter(KeyAuthCodeParam);
        java.lang.String queryParameter2 = uri.getQueryParameter("failedBecause");
        java.lang.String str = queryParameter;
        if (str != null && str.length() != 0) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Authorization code received from merchant onboarding", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("authCodeLength", java.lang.String.valueOf(queryParameter.length()))), null, 4, null);
            function1.invoke(queryParameter);
            return true;
        }
        java.lang.String str2 = queryParameter2;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Merchant onboarding failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("failureReason", queryParameter2)), null, 4, null);
        function12.invoke(queryParameter2);
        return true;
    }

    public static final boolean hasExactUrlPath(android.net.Uri uri, java.lang.String str) {
        java.lang.String path;
        java.lang.String str2 = str;
        if (str2 == null || str2.length() == 0 || uri == null || (path = uri.getPath()) == null) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.trimEnd(path, kotlinx.io.files.FileSystemKt.UnixPathSeparator), kotlin.text.StringsKt.trimEnd(str, kotlinx.io.files.FileSystemKt.UnixPathSeparator));
    }

    public static final com.paypal.oslo.core.identity.domain.model.AuthenticationContext createMerchantOnboardingAuthContext() {
        return new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("merchant_onboarding", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PYrM6rxyNIC92C2HzJw1nbJ16qs(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pqVpJRgYRpY1mfGtZAtCorngYcU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
