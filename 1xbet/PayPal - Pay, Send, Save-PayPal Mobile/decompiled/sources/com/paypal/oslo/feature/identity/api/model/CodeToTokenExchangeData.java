package com.paypal.oslo.feature.identity.api.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/CodeToTokenExchangeData;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "expiresInSec", "expiresAtTime", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lcom/paypal/oslo/feature/identity/api/model/CodeToTokenExchangeData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getToken", com.visa.cbp.getEncExpo.warmup, "getExpiresInSec", "getExpiresAtTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CodeToTokenExchangeData {
    private final java.lang.String expiresAtTime;
    private final int expiresInSec;
    private final java.lang.String token;

    public CodeToTokenExchangeData(java.lang.String str, int i, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.token = str;
        this.expiresInSec = i;
        this.expiresAtTime = str2;
    }

    public final java.lang.String getToken() {
        return this.token;
    }

    public final int getExpiresInSec() {
        return this.expiresInSec;
    }

    public final java.lang.String getExpiresAtTime() {
        return this.expiresAtTime;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.token;
        int i = this.expiresInSec;
        java.lang.String str2 = this.expiresAtTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CodeToTokenExchangeData(token=");
        sb.append(str);
        sb.append(", expiresInSec=");
        sb.append(i);
        sb.append(", expiresAtTime=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.token.hashCode() * 31) + java.lang.Integer.hashCode(this.expiresInSec)) * 31) + this.expiresAtTime.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData)) {
            return false;
        }
        com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData codeToTokenExchangeData = (com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.token, codeToTokenExchangeData.token) && this.expiresInSec == codeToTokenExchangeData.expiresInSec && kotlin.jvm.internal.Intrinsics.areEqual(this.expiresAtTime, codeToTokenExchangeData.expiresAtTime);
    }

    public final com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData copy(java.lang.String token, int expiresInSec, java.lang.String expiresAtTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiresAtTime, "");
        return new com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData(token, expiresInSec, expiresAtTime);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExpiresAtTime() {
        return this.expiresAtTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExpiresInSec() {
        return this.expiresInSec;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getToken() {
        return this.token;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData copy$default(com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData codeToTokenExchangeData, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = codeToTokenExchangeData.token;
        }
        if ((i2 & 2) != 0) {
            i = codeToTokenExchangeData.expiresInSec;
        }
        if ((i2 & 4) != 0) {
            str2 = codeToTokenExchangeData.expiresAtTime;
        }
        return codeToTokenExchangeData.copy(str, i, str2);
    }
}
