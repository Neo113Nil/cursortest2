package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/ActivateCardRequestData;", "", "", "creditAccountId", "securityCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cardactivation/ActivateCardRequestData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "getSecurityCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ActivateCardRequestData {
    public static final int $stable = 0;
    private final java.lang.String creditAccountId;
    private final java.lang.String securityCode;

    public ActivateCardRequestData(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.creditAccountId = str;
        this.securityCode = str2;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.String getSecurityCode() {
        return this.securityCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditAccountId;
        java.lang.String str2 = this.securityCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivateCardRequestData(creditAccountId=");
        sb.append(str);
        sb.append(", securityCode=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.creditAccountId.hashCode() * 31) + this.securityCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.ActivateCardRequestData)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.ActivateCardRequestData activateCardRequestData = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.ActivateCardRequestData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, activateCardRequestData.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.securityCode, activateCardRequestData.securityCode);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.ActivateCardRequestData copy(java.lang.String creditAccountId, java.lang.String securityCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityCode, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.ActivateCardRequestData(creditAccountId, securityCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSecurityCode() {
        return this.securityCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.ActivateCardRequestData copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.ActivateCardRequestData activateCardRequestData, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activateCardRequestData.creditAccountId;
        }
        if ((i & 2) != 0) {
            str2 = activateCardRequestData.securityCode;
        }
        return activateCardRequestData.copy(str, str2);
    }
}
