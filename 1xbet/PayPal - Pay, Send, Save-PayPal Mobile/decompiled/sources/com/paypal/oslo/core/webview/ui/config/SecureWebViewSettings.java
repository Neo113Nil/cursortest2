package com.paypal.oslo.core.webview.ui.config;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;", "", "", "customUserAgentSuffix", "", "javaScriptEnabled", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCustomUserAgentSuffix", "Z", "getJavaScriptEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SecureWebViewSettings {
    public static final int $stable = 0;
    private final java.lang.String customUserAgentSuffix;
    private final boolean javaScriptEnabled;

    public SecureWebViewSettings(java.lang.String str, boolean z) {
        this.customUserAgentSuffix = str;
        this.javaScriptEnabled = z;
    }

    public /* synthetic */ SecureWebViewSettings(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }

    public final java.lang.String getCustomUserAgentSuffix() {
        return this.customUserAgentSuffix;
    }

    public final boolean getJavaScriptEnabled() {
        return this.javaScriptEnabled;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.customUserAgentSuffix;
        boolean z = this.javaScriptEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SecureWebViewSettings(customUserAgentSuffix=");
        sb.append(str);
        sb.append(", javaScriptEnabled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.customUserAgentSuffix;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.javaScriptEnabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings)) {
            return false;
        }
        com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings secureWebViewSettings = (com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.customUserAgentSuffix, secureWebViewSettings.customUserAgentSuffix) && this.javaScriptEnabled == secureWebViewSettings.javaScriptEnabled;
    }

    public final com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings copy(java.lang.String customUserAgentSuffix, boolean javaScriptEnabled) {
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(customUserAgentSuffix, javaScriptEnabled);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getJavaScriptEnabled() {
        return this.javaScriptEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCustomUserAgentSuffix() {
        return this.customUserAgentSuffix;
    }

    public static /* synthetic */ com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings copy$default(com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings secureWebViewSettings, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = secureWebViewSettings.customUserAgentSuffix;
        }
        if ((i & 2) != 0) {
            z = secureWebViewSettings.javaScriptEnabled;
        }
        return secureWebViewSettings.copy(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SecureWebViewSettings() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
