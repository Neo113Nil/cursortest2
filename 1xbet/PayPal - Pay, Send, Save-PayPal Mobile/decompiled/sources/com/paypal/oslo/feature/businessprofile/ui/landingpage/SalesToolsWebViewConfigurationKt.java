package com.paypal.oslo.feature.businessprofile.ui.landingpage;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "url", "source", "", "javascriptEnabled", "isAuthRequired", "bypassUrlValidation", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "createSalesToolsWebViewConfiguration", "(Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SalesToolsWebViewConfigurationKt {
    public static /* synthetic */ com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration createSalesToolsWebViewConfiguration$default(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        return createSalesToolsWebViewConfiguration(str, str2, z, z2, z3);
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration createSalesToolsWebViewConfiguration(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(str, str2, z2, z3, null, 16, null), null, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, z, 1, null), null, null, 109, null);
    }
}
