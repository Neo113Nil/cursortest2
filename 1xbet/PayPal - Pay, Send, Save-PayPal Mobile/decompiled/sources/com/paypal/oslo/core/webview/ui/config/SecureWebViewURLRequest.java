package com.paypal.oslo.core.webview.ui.config;

@kotlin.Deprecated(message = "Use SecureWebViewContent.Url instead for new implementations", replaceWith = @kotlin.ReplaceWith(expression = "SecureWebViewContent.Url(url, source, isAuthRequired, bypassUrlValidation, additionalHttpHeaders)", imports = {"com.paypal.oslo.core.webview.ui.config.SecureWebViewContent"}))
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JN\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\u0006\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewURLRequest;", "", "", "url", "source", "", "isAuthRequired", "bypassUrlValidation", "", "additionalHttpHeaders", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewURLRequest;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getSource", "Z", "getBypassUrlValidation", "Ljava/util/Map;", "getAdditionalHttpHeaders"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SecureWebViewURLRequest {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.String> additionalHttpHeaders;
    private final boolean bypassUrlValidation;
    private final boolean isAuthRequired;
    private final java.lang.String source;
    private final java.lang.String url;

    public SecureWebViewURLRequest(java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.url = str;
        this.source = str2;
        this.isAuthRequired = z;
        this.bypassUrlValidation = z2;
        this.additionalHttpHeaders = map;
        java.util.Set<java.lang.String> keySet = map.keySet();
        if ((keySet instanceof java.util.Collection) && keySet.isEmpty()) {
            return;
        }
        java.util.Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            if (kotlin.text.StringsKt.isBlank((java.lang.String) it.next())) {
                throw new java.lang.IllegalArgumentException("HTTP header keys must not be empty or blank (RFC 7230)".toString());
            }
        }
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final boolean isAuthRequired() {
        return this.isAuthRequired;
    }

    public final boolean getBypassUrlValidation() {
        return this.bypassUrlValidation;
    }

    public /* synthetic */ SecureWebViewURLRequest(java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getAdditionalHttpHeaders() {
        return this.additionalHttpHeaders;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.url;
        java.lang.String str2 = this.source;
        boolean z = this.isAuthRequired;
        boolean z2 = this.bypassUrlValidation;
        java.util.Map<java.lang.String, java.lang.String> map = this.additionalHttpHeaders;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SecureWebViewURLRequest(url=");
        sb.append(str);
        sb.append(", source=");
        sb.append(str2);
        sb.append(", isAuthRequired=");
        sb.append(z);
        sb.append(", bypassUrlValidation=");
        sb.append(z2);
        sb.append(", additionalHttpHeaders=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.url.hashCode() * 31) + this.source.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isAuthRequired)) * 31) + java.lang.Boolean.hashCode(this.bypassUrlValidation)) * 31) + this.additionalHttpHeaders.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest)) {
            return false;
        }
        com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest secureWebViewURLRequest = (com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, secureWebViewURLRequest.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, secureWebViewURLRequest.source) && this.isAuthRequired == secureWebViewURLRequest.isAuthRequired && this.bypassUrlValidation == secureWebViewURLRequest.bypassUrlValidation && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalHttpHeaders, secureWebViewURLRequest.additionalHttpHeaders);
    }

    public final com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest copy(java.lang.String url, java.lang.String source, boolean isAuthRequired, boolean bypassUrlValidation, java.util.Map<java.lang.String, java.lang.String> additionalHttpHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalHttpHeaders, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(url, source, isAuthRequired, bypassUrlValidation, additionalHttpHeaders);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component5() {
        return this.additionalHttpHeaders;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getBypassUrlValidation() {
        return this.bypassUrlValidation;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAuthRequired() {
        return this.isAuthRequired;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public static /* synthetic */ com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest copy$default(com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest secureWebViewURLRequest, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = secureWebViewURLRequest.url;
        }
        if ((i & 2) != 0) {
            str2 = secureWebViewURLRequest.source;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            z = secureWebViewURLRequest.isAuthRequired;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = secureWebViewURLRequest.bypassUrlValidation;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            map = secureWebViewURLRequest.additionalHttpHeaders;
        }
        return secureWebViewURLRequest.copy(str, str3, z3, z4, map);
    }
}
