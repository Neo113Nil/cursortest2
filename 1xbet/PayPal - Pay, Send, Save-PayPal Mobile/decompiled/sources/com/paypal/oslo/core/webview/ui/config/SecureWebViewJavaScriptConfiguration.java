package com.paypal.oslo.core.webview.ui.config;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\fR*\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewJavaScriptConfiguration;", "", "", "", "jsInterfaces", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewJavaScriptBridge;", "", "jsBridgeCallback", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "component1", "()Ljava/util/Map;", "component2", "()Lkotlin/jvm/functions/Function1;", "copy", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewJavaScriptConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getJsInterfaces", "Lkotlin/jvm/functions/Function1;", "getJsBridgeCallback"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SecureWebViewJavaScriptConfiguration {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> jsBridgeCallback;
    private final java.util.Map<java.lang.String, java.lang.Object> jsInterfaces;

    /* JADX WARN: Multi-variable type inference failed */
    public SecureWebViewJavaScriptConfiguration(java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.jsInterfaces = map;
        this.jsBridgeCallback = function1;
    }

    public /* synthetic */ SecureWebViewJavaScriptConfiguration(java.util.Map map, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 2) != 0 ? null : function1);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getJsInterfaces() {
        return this.jsInterfaces;
    }

    public final kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> getJsBridgeCallback() {
        return this.jsBridgeCallback;
    }

    public final java.lang.String toString() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.jsInterfaces;
        kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> function1 = this.jsBridgeCallback;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SecureWebViewJavaScriptConfiguration(jsInterfaces=");
        sb.append(map);
        sb.append(", jsBridgeCallback=");
        sb.append(function1);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.jsInterfaces.hashCode();
        kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> function1 = this.jsBridgeCallback;
        return (hashCode * 31) + (function1 == null ? 0 : function1.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration)) {
            return false;
        }
        com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration secureWebViewJavaScriptConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.jsInterfaces, secureWebViewJavaScriptConfiguration.jsInterfaces) && kotlin.jvm.internal.Intrinsics.areEqual(this.jsBridgeCallback, secureWebViewJavaScriptConfiguration.jsBridgeCallback);
    }

    public final com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration copy(java.util.Map<java.lang.String, ? extends java.lang.Object> jsInterfaces, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> jsBridgeCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsInterfaces, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration(jsInterfaces, jsBridgeCallback);
    }

    public final kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> component2() {
        return this.jsBridgeCallback;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component1() {
        return this.jsInterfaces;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration copy$default(com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration secureWebViewJavaScriptConfiguration, java.util.Map map, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = secureWebViewJavaScriptConfiguration.jsInterfaces;
        }
        if ((i & 2) != 0) {
            function1 = secureWebViewJavaScriptConfiguration.jsBridgeCallback;
        }
        return secureWebViewJavaScriptConfiguration.copy(map, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SecureWebViewJavaScriptConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
