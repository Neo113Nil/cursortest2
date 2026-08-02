package com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u0006\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/Autopay;", "", "", "enabled", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstrument", "isFundingInstrumentValid", "<init>", "(ZLcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;Ljava/lang/Boolean;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "component3", "()Ljava/lang/Boolean;", "copy", "(ZLcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/Autopay;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "getFundingInstrument", "Ljava/lang/Boolean;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Autopay {
    public static final int $stable = 8;
    private final boolean enabled;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument;
    private final java.lang.Boolean isFundingInstrumentValid;

    public Autopay(boolean z, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, java.lang.Boolean bool) {
        this.enabled = z;
        this.fundingInstrument = fundingInstrument;
        this.isFundingInstrumentValid = bool;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
        return this.fundingInstrument;
    }

    public final java.lang.Boolean isFundingInstrumentValid() {
        return this.isFundingInstrumentValid;
    }

    public final java.lang.String toString() {
        boolean z = this.enabled;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.fundingInstrument;
        java.lang.Boolean bool = this.isFundingInstrumentValid;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Autopay(enabled=");
        sb.append(z);
        sb.append(", fundingInstrument=");
        sb.append(fundingInstrument);
        sb.append(", isFundingInstrumentValid=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.enabled);
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.fundingInstrument;
        int hashCode2 = fundingInstrument == null ? 0 : fundingInstrument.hashCode();
        java.lang.Boolean bool = this.isFundingInstrumentValid;
        return (((hashCode * 31) + hashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay autopay = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay) other;
        return this.enabled == autopay.enabled && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, autopay.fundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.isFundingInstrumentValid, autopay.isFundingInstrumentValid);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay copy(boolean enabled, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, java.lang.Boolean isFundingInstrumentValid) {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay(enabled, fundingInstrument, isFundingInstrumentValid);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getIsFundingInstrumentValid() {
        return this.isFundingInstrumentValid;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
        return this.fundingInstrument;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay autopay, boolean z, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = autopay.enabled;
        }
        if ((i & 2) != 0) {
            fundingInstrument = autopay.fundingInstrument;
        }
        if ((i & 4) != 0) {
            bool = autopay.isFundingInstrumentValid;
        }
        return autopay.copy(z, fundingInstrument, bool);
    }
}
