package com.paypal.oslo.feature.bnplacquisition.domain.model.requests;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/CreateCreditApplicationRequestParams;", "", "", "includeAnnualIncome", "includeNationalIdentification", "includePaymentFundingInstruments", "includeSelectedPaymentFundingInstrument", "<init>", "(ZZZZ)V", "component1", "()Z", "component2", "component3", "component4", "copy", "(ZZZZ)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/CreateCreditApplicationRequestParams;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getIncludeAnnualIncome", "getIncludeNationalIdentification", "getIncludePaymentFundingInstruments", "getIncludeSelectedPaymentFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CreateCreditApplicationRequestParams {
    public static final int $stable = 0;
    private final boolean includeAnnualIncome;
    private final boolean includeNationalIdentification;
    private final boolean includePaymentFundingInstruments;
    private final boolean includeSelectedPaymentFundingInstrument;

    public CreateCreditApplicationRequestParams(boolean z, boolean z2, boolean z3, boolean z4) {
        this.includeAnnualIncome = z;
        this.includeNationalIdentification = z2;
        this.includePaymentFundingInstruments = z3;
        this.includeSelectedPaymentFundingInstrument = z4;
    }

    public final boolean getIncludeAnnualIncome() {
        return this.includeAnnualIncome;
    }

    public final boolean getIncludeNationalIdentification() {
        return this.includeNationalIdentification;
    }

    public final boolean getIncludePaymentFundingInstruments() {
        return this.includePaymentFundingInstruments;
    }

    public final boolean getIncludeSelectedPaymentFundingInstrument() {
        return this.includeSelectedPaymentFundingInstrument;
    }

    public final java.lang.String toString() {
        boolean z = this.includeAnnualIncome;
        boolean z2 = this.includeNationalIdentification;
        boolean z3 = this.includePaymentFundingInstruments;
        boolean z4 = this.includeSelectedPaymentFundingInstrument;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateCreditApplicationRequestParams(includeAnnualIncome=");
        sb.append(z);
        sb.append(", includeNationalIdentification=");
        sb.append(z2);
        sb.append(", includePaymentFundingInstruments=");
        sb.append(z3);
        sb.append(", includeSelectedPaymentFundingInstrument=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.includeAnnualIncome) * 31) + java.lang.Boolean.hashCode(this.includeNationalIdentification)) * 31) + java.lang.Boolean.hashCode(this.includePaymentFundingInstruments)) * 31) + java.lang.Boolean.hashCode(this.includeSelectedPaymentFundingInstrument);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequestParams)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequestParams createCreditApplicationRequestParams = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequestParams) other;
        return this.includeAnnualIncome == createCreditApplicationRequestParams.includeAnnualIncome && this.includeNationalIdentification == createCreditApplicationRequestParams.includeNationalIdentification && this.includePaymentFundingInstruments == createCreditApplicationRequestParams.includePaymentFundingInstruments && this.includeSelectedPaymentFundingInstrument == createCreditApplicationRequestParams.includeSelectedPaymentFundingInstrument;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequestParams copy(boolean includeAnnualIncome, boolean includeNationalIdentification, boolean includePaymentFundingInstruments, boolean includeSelectedPaymentFundingInstrument) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequestParams(includeAnnualIncome, includeNationalIdentification, includePaymentFundingInstruments, includeSelectedPaymentFundingInstrument);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIncludeSelectedPaymentFundingInstrument() {
        return this.includeSelectedPaymentFundingInstrument;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIncludePaymentFundingInstruments() {
        return this.includePaymentFundingInstruments;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIncludeNationalIdentification() {
        return this.includeNationalIdentification;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIncludeAnnualIncome() {
        return this.includeAnnualIncome;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequestParams copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequestParams createCreditApplicationRequestParams, boolean z, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = createCreditApplicationRequestParams.includeAnnualIncome;
        }
        if ((i & 2) != 0) {
            z2 = createCreditApplicationRequestParams.includeNationalIdentification;
        }
        if ((i & 4) != 0) {
            z3 = createCreditApplicationRequestParams.includePaymentFundingInstruments;
        }
        if ((i & 8) != 0) {
            z4 = createCreditApplicationRequestParams.includeSelectedPaymentFundingInstrument;
        }
        return createCreditApplicationRequestParams.copy(z, z2, z3, z4);
    }
}
