package com.paypal.oslo.core.webview.ui.callback;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/WebViewActionBundle;", "", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewActions;", "webViewActions", "Lcom/paypal/oslo/core/webview/ui/callback/NavigationWebViewActions;", "navigationActions", "<init>", "(Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewActions;Lcom/paypal/oslo/core/webview/ui/callback/NavigationWebViewActions;)V", "component1", "()Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewActions;", "component2", "()Lcom/paypal/oslo/core/webview/ui/callback/NavigationWebViewActions;", "copy", "(Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewActions;Lcom/paypal/oslo/core/webview/ui/callback/NavigationWebViewActions;)Lcom/paypal/oslo/core/webview/ui/callback/WebViewActionBundle;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewActions;", "getWebViewActions", "Lcom/paypal/oslo/core/webview/ui/callback/NavigationWebViewActions;", "getNavigationActions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class WebViewActionBundle {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions navigationActions;
    private final com.paypal.oslo.core.webview.ui.callback.SecureWebViewActions webViewActions;

    public WebViewActionBundle(com.paypal.oslo.core.webview.ui.callback.SecureWebViewActions secureWebViewActions, com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions navigationWebViewActions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewActions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationWebViewActions, "");
        this.webViewActions = secureWebViewActions;
        this.navigationActions = navigationWebViewActions;
    }

    public final com.paypal.oslo.core.webview.ui.callback.SecureWebViewActions getWebViewActions() {
        return this.webViewActions;
    }

    public final com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions getNavigationActions() {
        return this.navigationActions;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.webview.ui.callback.SecureWebViewActions secureWebViewActions = this.webViewActions;
        com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions navigationWebViewActions = this.navigationActions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebViewActionBundle(webViewActions=");
        sb.append(secureWebViewActions);
        sb.append(", navigationActions=");
        sb.append(navigationWebViewActions);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.webViewActions.hashCode() * 31) + this.navigationActions.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle)) {
            return false;
        }
        com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle webViewActionBundle = (com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.webViewActions, webViewActionBundle.webViewActions) && kotlin.jvm.internal.Intrinsics.areEqual(this.navigationActions, webViewActionBundle.navigationActions);
    }

    public final com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle copy(com.paypal.oslo.core.webview.ui.callback.SecureWebViewActions webViewActions, com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions navigationActions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewActions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationActions, "");
        return new com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle(webViewActions, navigationActions);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions getNavigationActions() {
        return this.navigationActions;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.webview.ui.callback.SecureWebViewActions getWebViewActions() {
        return this.webViewActions;
    }

    public static /* synthetic */ com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle copy$default(com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle webViewActionBundle, com.paypal.oslo.core.webview.ui.callback.SecureWebViewActions secureWebViewActions, com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions navigationWebViewActions, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            secureWebViewActions = webViewActionBundle.webViewActions;
        }
        if ((i & 2) != 0) {
            navigationWebViewActions = webViewActionBundle.navigationActions;
        }
        return webViewActionBundle.copy(secureWebViewActions, navigationWebViewActions);
    }
}
