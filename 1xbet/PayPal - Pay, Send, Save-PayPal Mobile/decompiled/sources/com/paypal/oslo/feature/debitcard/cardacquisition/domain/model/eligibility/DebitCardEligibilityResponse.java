package com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u0000 !2\u00020\u0001:\u0001!B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityResponse;", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus;", "eligibilityStatus", "", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityReason;", "eligibilityReasons", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/EligibleDebitCardDetails;", "eligibleDebitCardDetails", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus;", "component2", "()Ljava/util/List;", "component3", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus;", "getEligibilityStatus", "Ljava/util/List;", "getEligibilityReasons", "getEligibleDebitCardDetails", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitCardEligibilityResponse {
    public static final java.lang.String REASON_SIMILAR_PRODUCT_EXISTS = "SIMILAR_PRODUCT_EXISTS";
    private final java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason> eligibilityReasons;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus;
    private final java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails> eligibleDebitCardDetails;
    public static final int $stable = 8;

    public DebitCardEligibilityResponse(com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus, java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason> list, java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.eligibilityStatus = eligibilityStatus;
        this.eligibilityReasons = list;
        this.eligibleDebitCardDetails = list2;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason> getEligibilityReasons() {
        return this.eligibilityReasons;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails> getEligibleDebitCardDetails() {
        return this.eligibleDebitCardDetails;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus = this.eligibilityStatus;
        java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason> list = this.eligibilityReasons;
        java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails> list2 = this.eligibleDebitCardDetails;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitCardEligibilityResponse(eligibilityStatus=");
        sb.append(eligibilityStatus);
        sb.append(", eligibilityReasons=");
        sb.append(list);
        sb.append(", eligibleDebitCardDetails=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.eligibilityStatus.hashCode() * 31) + this.eligibilityReasons.hashCode()) * 31) + this.eligibleDebitCardDetails.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse debitCardEligibilityResponse = (com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse) other;
        return this.eligibilityStatus == debitCardEligibilityResponse.eligibilityStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibilityReasons, debitCardEligibilityResponse.eligibilityReasons) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleDebitCardDetails, debitCardEligibilityResponse.eligibleDebitCardDetails);
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse copy(com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus, java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason> eligibilityReasons, java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails> eligibleDebitCardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityReasons, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleDebitCardDetails, "");
        return new com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse(eligibilityStatus, eligibilityReasons, eligibleDebitCardDetails);
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails> component3() {
        return this.eligibleDebitCardDetails;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason> component2() {
        return this.eligibilityReasons;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse debitCardEligibilityResponse, com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            eligibilityStatus = debitCardEligibilityResponse.eligibilityStatus;
        }
        if ((i & 2) != 0) {
            list = debitCardEligibilityResponse.eligibilityReasons;
        }
        if ((i & 4) != 0) {
            list2 = debitCardEligibilityResponse.eligibleDebitCardDetails;
        }
        return debitCardEligibilityResponse.copy(eligibilityStatus, list, list2);
    }
}
