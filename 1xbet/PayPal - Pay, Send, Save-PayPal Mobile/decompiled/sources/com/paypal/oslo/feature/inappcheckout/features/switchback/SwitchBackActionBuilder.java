package com.paypal.oslo.feature.inappcheckout.features.switchback;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackActionBuilder;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackUriBuilder;", "uriBuilder", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackUriBuilder;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.CHECKOUT_URLS_KEY, "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "merchantIntegration", "", "buttonSessionId", "bridgeUrl", "Landroid/net/Uri;", "webViewUri", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent$Resume;", "buildSwitchBackActionForResume", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent$Resume;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent$Cancel;", "buildSwitchBackActionForCancel", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent$Cancel;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackUriBuilder;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SwitchBackActionBuilder {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SwitchBackActionBuilder(com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUriBuilder switchBackUriBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(switchBackUriBuilder, "");
        this.getHighResolutionOutputSizeshNQ4ISI = switchBackUriBuilder;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Resume buildSwitchBackActionForResume(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs, com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration merchantIntegration, java.lang.String buttonSessionId, java.lang.String bridgeUrl, android.net.Uri webViewUri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutURLs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantIntegration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewUri, "");
        java.lang.String str = bridgeUrl;
        if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
            return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Resume(this.getHighResolutionOutputSizeshNQ4ISI.buildBridgeUri(bridgeUrl, webViewUri, com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash.Approve, buttonSessionId));
        }
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Resume(this.getHighResolutionOutputSizeshNQ4ISI.buildMerchantReturnUri(merchantIntegration, webViewUri, checkoutURLs.getReturnUri(), com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash.Approve, buttonSessionId));
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel buildSwitchBackActionForCancel(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs, com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration merchantIntegration, java.lang.String buttonSessionId, java.lang.String bridgeUrl, android.net.Uri webViewUri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutURLs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantIntegration, "");
        java.lang.String str = bridgeUrl;
        if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
            return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel(this.getHighResolutionOutputSizeshNQ4ISI.buildBridgeUri(bridgeUrl, webViewUri, com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash.Cancel, buttonSessionId));
        }
        android.net.Uri cancelUri = checkoutURLs.getCancelUri();
        if (kotlin.jvm.internal.Intrinsics.areEqual(cancelUri, android.net.Uri.EMPTY)) {
            return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel(null);
        }
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent.Cancel(this.getHighResolutionOutputSizeshNQ4ISI.buildMerchantReturnUri(merchantIntegration, webViewUri, cancelUri, com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash.Cancel, buttonSessionId));
    }
}
