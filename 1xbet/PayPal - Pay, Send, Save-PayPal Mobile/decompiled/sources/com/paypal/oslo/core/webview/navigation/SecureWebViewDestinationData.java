package com.paypal.oslo.core.webview.navigation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JN\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\u0007\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/webview/navigation/SecureWebViewDestinationData;", "", "", "url", "source", "title", "", "isAuthRequired", "bypassUrlValidation", "isJavaScriptEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/paypal/oslo/core/webview/navigation/SecureWebViewDestinationData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getSource", "getTitle", "Z", "getBypassUrlValidation"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes10.dex */
public final /* data */ class SecureWebViewDestinationData {
    public static final int $stable = 0;
    private final boolean bypassUrlValidation;
    private final boolean isAuthRequired;
    private final boolean isJavaScriptEnabled;
    private final java.lang.String source;
    private final java.lang.String title;
    private final java.lang.String url;

    public SecureWebViewDestinationData(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.url = str;
        this.source = str2;
        this.title = str3;
        this.isAuthRequired = z;
        this.bypassUrlValidation = z2;
        this.isJavaScriptEnabled = z3;
        if (kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("URL must not be blank".toString());
        }
        if (kotlin.text.StringsKt.isBlank(str2)) {
            throw new java.lang.IllegalArgumentException("Source must not be blank".toString());
        }
    }

    public /* synthetic */ SecureWebViewDestinationData(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final boolean isAuthRequired() {
        return this.isAuthRequired;
    }

    public final boolean getBypassUrlValidation() {
        return this.bypassUrlValidation;
    }

    public final boolean isJavaScriptEnabled() {
        return this.isJavaScriptEnabled;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.url;
        java.lang.String str2 = this.source;
        java.lang.String str3 = this.title;
        boolean z = this.isAuthRequired;
        boolean z2 = this.bypassUrlValidation;
        boolean z3 = this.isJavaScriptEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SecureWebViewDestinationData(url=");
        sb.append(str);
        sb.append(", source=");
        sb.append(str2);
        sb.append(", title=");
        sb.append(str3);
        sb.append(", isAuthRequired=");
        sb.append(z);
        sb.append(", bypassUrlValidation=");
        sb.append(z2);
        sb.append(", isJavaScriptEnabled=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode();
        int hashCode2 = this.source.hashCode();
        java.lang.String str = this.title;
        return (((((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isAuthRequired)) * 31) + java.lang.Boolean.hashCode(this.bypassUrlValidation)) * 31) + java.lang.Boolean.hashCode(this.isJavaScriptEnabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData)) {
            return false;
        }
        com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData secureWebViewDestinationData = (com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, secureWebViewDestinationData.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, secureWebViewDestinationData.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, secureWebViewDestinationData.title) && this.isAuthRequired == secureWebViewDestinationData.isAuthRequired && this.bypassUrlValidation == secureWebViewDestinationData.bypassUrlValidation && this.isJavaScriptEnabled == secureWebViewDestinationData.isJavaScriptEnabled;
    }

    public final com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData copy(java.lang.String url, java.lang.String source, java.lang.String title, boolean isAuthRequired, boolean bypassUrlValidation, boolean isJavaScriptEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData(url, source, title, isAuthRequired, bypassUrlValidation, isJavaScriptEnabled);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsJavaScriptEnabled() {
        return this.isJavaScriptEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getBypassUrlValidation() {
        return this.bypassUrlValidation;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAuthRequired() {
        return this.isAuthRequired;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public static /* synthetic */ com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData copy$default(com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData secureWebViewDestinationData, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = secureWebViewDestinationData.url;
        }
        if ((i & 2) != 0) {
            str2 = secureWebViewDestinationData.source;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = secureWebViewDestinationData.title;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            z = secureWebViewDestinationData.isAuthRequired;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = secureWebViewDestinationData.bypassUrlValidation;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = secureWebViewDestinationData.isJavaScriptEnabled;
        }
        return secureWebViewDestinationData.copy(str, str4, str5, z4, z5, z3);
    }
}
