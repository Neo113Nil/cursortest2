package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/iab/ui/ShoppingWebViewClientDelegate;", "Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingWebViewState;", "", "onStateChange", "", "", "overrideLoadingUrl", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "url", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "shouldOverrideUrlLoading", "(Landroid/webkit/WebResourceRequest;)Z", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShoppingWebViewClientDelegate implements com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingWebViewClientDelegate(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRangesFor = function12;
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
    public final /* bridge */ boolean onPdfDetected(java.lang.String str) {
        return super.onPdfDetected(str);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
    public final /* bridge */ void onReceivedHttpError(android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webResourceRequest, webResourceResponse);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
    public final void onPageStarted(java.lang.String url, android.graphics.Bitmap favicon) {
        com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.logV$default(com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.INSTANCE, "WebView page started loading", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url == null ? "" : url)), 2, null);
        if (url != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState(true, 0.0f, url, false, false, null, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null));
        }
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
    public final void onPageFinished(java.lang.String url) {
        com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.logV$default(com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.INSTANCE, "WebView page finished loading", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url == null ? "" : url)), 2, null);
        if (url != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState(false, 1.0f, url, false, false, null, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null));
        }
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
    public final boolean shouldOverrideUrlLoading(android.webkit.WebResourceRequest request) {
        android.net.Uri url;
        java.lang.String obj;
        if (request == null || (url = request.getUrl()) == null || (obj = url.toString()) == null) {
            return false;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "WebView navigation requested", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", obj)), 2, null);
        return !this.getHighSpeedVideoFpsRangesFor.invoke(obj).booleanValue();
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
    public final void onReceivedError(android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
        java.lang.String str;
        java.lang.CharSequence description;
        java.lang.String obj;
        java.lang.CharSequence description2;
        if (request != null && request.isForMainFrame()) {
            com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger logger = com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.INSTANCE;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("errorCode", java.lang.Integer.valueOf(error != null ? error.getErrorCode() : -1));
            java.lang.String str2 = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
            if (error == null || (description2 = error.getDescription()) == null || (str = description2.toString()) == null) {
                str = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
            }
            pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, str);
            com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.logW$default(logger, "WebView error loading page", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
            android.net.Uri url = request.getUrl();
            java.lang.String obj2 = url != null ? url.toString() : null;
            if (obj2 == null) {
                obj2 = "";
            }
            java.lang.String str3 = obj2;
            int errorCode = error != null ? error.getErrorCode() : -1;
            if (error != null && (description = error.getDescription()) != null && (obj = description.toString()) != null) {
                str2 = obj;
            }
            function1.invoke(new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState(false, 0.0f, str3, false, false, new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABError.LoadingError(errorCode, str2), false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, null));
        }
    }
}
