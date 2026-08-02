package com.paypal.oslo.core.webview.ui.config;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewClientConfiguration;", "", "Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;", "webViewClientDelegate", "Lcom/paypal/oslo/core/webview/ui/client/SecureWebChromeClientDelegate;", "webChromeClientDelegate", "<init>", "(Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;Lcom/paypal/oslo/core/webview/ui/client/SecureWebChromeClientDelegate;)V", "component1", "()Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;", "component2", "()Lcom/paypal/oslo/core/webview/ui/client/SecureWebChromeClientDelegate;", "copy", "(Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;Lcom/paypal/oslo/core/webview/ui/client/SecureWebChromeClientDelegate;)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewClientConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;", "getWebViewClientDelegate", "Lcom/paypal/oslo/core/webview/ui/client/SecureWebChromeClientDelegate;", "getWebChromeClientDelegate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SecureWebViewClientConfiguration {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate webChromeClientDelegate;
    private final com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate webViewClientDelegate;

    public SecureWebViewClientConfiguration(com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate, com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate) {
        this.webViewClientDelegate = secureWebViewClientDelegate;
        this.webChromeClientDelegate = secureWebChromeClientDelegate;
    }

    public /* synthetic */ SecureWebViewClientConfiguration(com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate, com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : secureWebViewClientDelegate, (i & 2) != 0 ? null : secureWebChromeClientDelegate);
    }

    public final com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate getWebViewClientDelegate() {
        return this.webViewClientDelegate;
    }

    public final com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate getWebChromeClientDelegate() {
        return this.webChromeClientDelegate;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate = this.webViewClientDelegate;
        com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate = this.webChromeClientDelegate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SecureWebViewClientConfiguration(webViewClientDelegate=");
        sb.append(secureWebViewClientDelegate);
        sb.append(", webChromeClientDelegate=");
        sb.append(secureWebChromeClientDelegate);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate = this.webViewClientDelegate;
        int hashCode = secureWebViewClientDelegate == null ? 0 : secureWebViewClientDelegate.hashCode();
        com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate = this.webChromeClientDelegate;
        return (hashCode * 31) + (secureWebChromeClientDelegate != null ? secureWebChromeClientDelegate.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration)) {
            return false;
        }
        com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration secureWebViewClientConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.webViewClientDelegate, secureWebViewClientConfiguration.webViewClientDelegate) && kotlin.jvm.internal.Intrinsics.areEqual(this.webChromeClientDelegate, secureWebViewClientConfiguration.webChromeClientDelegate);
    }

    public final com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration copy(com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate webViewClientDelegate, com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate webChromeClientDelegate) {
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(webViewClientDelegate, webChromeClientDelegate);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate getWebChromeClientDelegate() {
        return this.webChromeClientDelegate;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate getWebViewClientDelegate() {
        return this.webViewClientDelegate;
    }

    public static /* synthetic */ com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration copy$default(com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration secureWebViewClientConfiguration, com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate, com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate secureWebChromeClientDelegate, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            secureWebViewClientDelegate = secureWebViewClientConfiguration.webViewClientDelegate;
        }
        if ((i & 2) != 0) {
            secureWebChromeClientDelegate = secureWebViewClientConfiguration.webChromeClientDelegate;
        }
        return secureWebViewClientConfiguration.copy(secureWebViewClientDelegate, secureWebChromeClientDelegate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SecureWebViewClientConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
