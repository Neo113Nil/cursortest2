package com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b\b\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityRequest;", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "bundle", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityEvaluationContext;", "evaluationContext", "isPrivacyPolicyRequired", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityEvaluationContext;Z)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityEvaluationContext;", "component4", "()Z", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityEvaluationContext;Z)Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityRequest;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Ljava/lang/Boolean;", "getBundle", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityEvaluationContext;", "getEvaluationContext", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitCardEligibilityRequest {
    public static final int $stable = 0;
    private final java.lang.Boolean bundle;
    private final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityEvaluationContext evaluationContext;
    private final boolean isPrivacyPolicyRequired;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

    public DebitCardEligibilityRequest(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.Boolean bool, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityEvaluationContext debitCardEligibilityEvaluationContext, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        this.productName = debitCardProductName;
        this.bundle = bool;
        this.evaluationContext = debitCardEligibilityEvaluationContext;
        this.isPrivacyPolicyRequired = z;
    }

    public /* synthetic */ DebitCardEligibilityRequest(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.Boolean bool, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityEvaluationContext debitCardEligibilityEvaluationContext, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(debitCardProductName, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : debitCardEligibilityEvaluationContext, (i & 8) != 0 ? true : z);
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public final java.lang.Boolean getBundle() {
        return this.bundle;
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityEvaluationContext getEvaluationContext() {
        return this.evaluationContext;
    }

    public final boolean isPrivacyPolicyRequired() {
        return this.isPrivacyPolicyRequired;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
        java.lang.Boolean bool = this.bundle;
        com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityEvaluationContext debitCardEligibilityEvaluationContext = this.evaluationContext;
        boolean z = this.isPrivacyPolicyRequired;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitCardEligibilityRequest(productName=");
        sb.append(debitCardProductName);
        sb.append(", bundle=");
        sb.append(bool);
        sb.append(", evaluationContext=");
        sb.append(debitCardEligibilityEvaluationContext);
        sb.append(", isPrivacyPolicyRequired=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.productName.hashCode();
        java.lang.Boolean bool = this.bundle;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityEvaluationContext debitCardEligibilityEvaluationContext = this.evaluationContext;
        return (((((hashCode * 31) + hashCode2) * 31) + (debitCardEligibilityEvaluationContext != null ? debitCardEligibilityEvaluationContext.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isPrivacyPolicyRequired);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest debitCardEligibilityRequest = (com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest) other;
        return this.productName == debitCardEligibilityRequest.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.bundle, debitCardEligibilityRequest.bundle) && kotlin.jvm.internal.Intrinsics.areEqual(this.evaluationContext, debitCardEligibilityRequest.evaluationContext) && this.isPrivacyPolicyRequired == debitCardEligibilityRequest.isPrivacyPolicyRequired;
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.Boolean bundle, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityEvaluationContext evaluationContext, boolean isPrivacyPolicyRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest(productName, bundle, evaluationContext, isPrivacyPolicyRequired);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPrivacyPolicyRequired() {
        return this.isPrivacyPolicyRequired;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityEvaluationContext getEvaluationContext() {
        return this.evaluationContext;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getBundle() {
        return this.bundle;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest debitCardEligibilityRequest, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.Boolean bool, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityEvaluationContext debitCardEligibilityEvaluationContext, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitCardProductName = debitCardEligibilityRequest.productName;
        }
        if ((i & 2) != 0) {
            bool = debitCardEligibilityRequest.bundle;
        }
        if ((i & 4) != 0) {
            debitCardEligibilityEvaluationContext = debitCardEligibilityRequest.evaluationContext;
        }
        if ((i & 8) != 0) {
            z = debitCardEligibilityRequest.isPrivacyPolicyRequired;
        }
        return debitCardEligibilityRequest.copy(debitCardProductName, bool, debitCardEligibilityEvaluationContext, z);
    }
}
