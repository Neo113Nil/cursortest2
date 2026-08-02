package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardUpdateInput;", "", "", "fundingInstrumentId", "securityCode", "expiryMonth", "expiryYear", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardUpdateInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFundingInstrumentId", "getSecurityCode", "getExpiryMonth", "getExpiryYear"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExternalCardUpdateInput {
    public static final int $stable = 0;
    private final java.lang.String expiryMonth;
    private final java.lang.String expiryYear;
    private final java.lang.String fundingInstrumentId;
    private final java.lang.String securityCode;

    public ExternalCardUpdateInput(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.fundingInstrumentId = str;
        this.securityCode = str2;
        this.expiryMonth = str3;
        this.expiryYear = str4;
    }

    public final java.lang.String getFundingInstrumentId() {
        return this.fundingInstrumentId;
    }

    public final java.lang.String getSecurityCode() {
        return this.securityCode;
    }

    public final java.lang.String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final java.lang.String getExpiryYear() {
        return this.expiryYear;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fundingInstrumentId;
        java.lang.String str2 = this.securityCode;
        java.lang.String str3 = this.expiryMonth;
        java.lang.String str4 = this.expiryYear;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalCardUpdateInput(fundingInstrumentId=");
        sb.append(str);
        sb.append(", securityCode=");
        sb.append(str2);
        sb.append(", expiryMonth=");
        sb.append(str3);
        sb.append(", expiryYear=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.fundingInstrumentId.hashCode() * 31) + this.securityCode.hashCode()) * 31) + this.expiryMonth.hashCode()) * 31) + this.expiryYear.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput externalCardUpdateInput = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrumentId, externalCardUpdateInput.fundingInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.securityCode, externalCardUpdateInput.securityCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryMonth, externalCardUpdateInput.expiryMonth) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryYear, externalCardUpdateInput.expiryYear);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput copy(java.lang.String fundingInstrumentId, java.lang.String securityCode, java.lang.String expiryMonth, java.lang.String expiryYear) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiryMonth, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiryYear, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput(fundingInstrumentId, securityCode, expiryMonth, expiryYear);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getExpiryYear() {
        return this.expiryYear;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExpiryMonth() {
        return this.expiryMonth;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSecurityCode() {
        return this.securityCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFundingInstrumentId() {
        return this.fundingInstrumentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput externalCardUpdateInput, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = externalCardUpdateInput.fundingInstrumentId;
        }
        if ((i & 2) != 0) {
            str2 = externalCardUpdateInput.securityCode;
        }
        if ((i & 4) != 0) {
            str3 = externalCardUpdateInput.expiryMonth;
        }
        if ((i & 8) != 0) {
            str4 = externalCardUpdateInput.expiryYear;
        }
        return externalCardUpdateInput.copy(str, str2, str3, str4);
    }
}
