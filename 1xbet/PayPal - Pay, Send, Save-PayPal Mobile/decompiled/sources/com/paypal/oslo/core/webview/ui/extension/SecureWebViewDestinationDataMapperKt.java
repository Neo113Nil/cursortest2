package com.paypal.oslo.core.webview.ui.extension;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/webview/navigation/SecureWebViewDestinationData;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "toSecureWebViewConfiguration", "(Lcom/paypal/oslo/core/webview/navigation/SecureWebViewDestinationData;)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecureWebViewDestinationDataMapperKt {
    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration toSecureWebViewConfiguration(com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData secureWebViewDestinationData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewDestinationData, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(new com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url(secureWebViewDestinationData.getUrl(), secureWebViewDestinationData.getSource(), secureWebViewDestinationData.isAuthRequired(), secureWebViewDestinationData.getBypassUrlValidation(), null, 16, null), null, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(secureWebViewDestinationData.getTitle(), null, false, false, false, 30, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, secureWebViewDestinationData.isJavaScriptEnabled(), 1, null), null, null, 102, null);
    }
}
