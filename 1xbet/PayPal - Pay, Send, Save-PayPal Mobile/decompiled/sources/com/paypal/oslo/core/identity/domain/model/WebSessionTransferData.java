package com.paypal.oslo.core.identity.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferData;", "Lcom/paypal/oslo/core/identity/domain/model/SessionTransferData;", "", "redirectUrl", "authorizationCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRedirectUrl", "getAuthorizationCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WebSessionTransferData implements com.paypal.oslo.core.identity.domain.model.SessionTransferData {
    private final java.lang.String authorizationCode;
    private final java.lang.String redirectUrl;

    public WebSessionTransferData(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.redirectUrl = str;
        this.authorizationCode = str2;
    }

    public final java.lang.String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Override // com.paypal.oslo.core.identity.domain.model.SessionTransferData
    public final java.lang.String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.redirectUrl;
        java.lang.String str2 = this.authorizationCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebSessionTransferData(redirectUrl=");
        sb.append(str);
        sb.append(", authorizationCode=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.redirectUrl.hashCode() * 31) + this.authorizationCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferData)) {
            return false;
        }
        com.paypal.oslo.core.identity.domain.model.WebSessionTransferData webSessionTransferData = (com.paypal.oslo.core.identity.domain.model.WebSessionTransferData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.redirectUrl, webSessionTransferData.redirectUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.authorizationCode, webSessionTransferData.authorizationCode);
    }

    public final com.paypal.oslo.core.identity.domain.model.WebSessionTransferData copy(java.lang.String redirectUrl, java.lang.String authorizationCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationCode, "");
        return new com.paypal.oslo.core.identity.domain.model.WebSessionTransferData(redirectUrl, authorizationCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAuthorizationCode() {
        return this.authorizationCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRedirectUrl() {
        return this.redirectUrl;
    }

    public static /* synthetic */ com.paypal.oslo.core.identity.domain.model.WebSessionTransferData copy$default(com.paypal.oslo.core.identity.domain.model.WebSessionTransferData webSessionTransferData, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = webSessionTransferData.redirectUrl;
        }
        if ((i & 2) != 0) {
            str2 = webSessionTransferData.authorizationCode;
        }
        return webSessionTransferData.copy(str, str2);
    }
}
