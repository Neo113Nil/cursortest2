package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/ReadyToUsePlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetails;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanCore;", "planCore", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard;", "virtualCard", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanCore;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard;)V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentSummary;", "getInstallmentSummary", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentSummary;", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanCore;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanCore;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/ReadyToUsePlan;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanCore;", "getPlanCore", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard;", "getVirtualCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReadyToUsePlan implements com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore planCore;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard virtualCard;

    public ReadyToUsePlan(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore planCore, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard virtualCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualCard, "");
        this.planCore = planCore;
        this.virtualCard = virtualCard;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider
    public final /* bridge */ com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
        return super.getFundingInstrument();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanInstallmentsDataProvider
    public final /* bridge */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails getInstallmentDetails() {
        return super.getInstallmentDetails();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider
    public final /* bridge */ java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity> getPlanActivities() {
        return super.getPlanActivities();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider
    public final /* bridge */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay getPlanAutoPay() {
        return super.getPlanAutoPay();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider
    public final /* bridge */ java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.Document> getPlanDocuments() {
        return super.getPlanDocuments();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider
    public final /* bridge */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaymentSchedule getPlanSchedule() {
        return super.getPlanSchedule();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider
    public final /* bridge */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze getPlanSnooze() {
        return super.getPlanSnooze();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanMetadataProvider
    public final /* bridge */ com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy getPlanVariantPolicy() {
        return super.getPlanVariantPolicy();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanMetadataProvider
    public final /* bridge */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard getPlanVirtualCard() {
        return super.getPlanVirtualCard();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanSummaryDataProvider
    public final /* bridge */ java.lang.Boolean isLastPayment() {
        return super.isLastPayment();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider
    public final /* bridge */ boolean isMiniMirandaRequired() {
        return super.isMiniMirandaRequired();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider
    public final /* bridge */ boolean isPendingFraud() {
        return super.isPendingFraud();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore getPlanCore() {
        return this.planCore;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard getVirtualCard() {
        return this.virtualCard;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanInstallmentsDataProvider
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentSummary getInstallmentSummary() {
        return getPlanCore().getInstallmentSummary();
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore planCore = this.planCore;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard virtualCard = this.virtualCard;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyToUsePlan(planCore=");
        sb.append(planCore);
        sb.append(", virtualCard=");
        sb.append(virtualCard);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.planCore.hashCode() * 31) + this.virtualCard.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.ReadyToUsePlan)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.ReadyToUsePlan readyToUsePlan = (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.ReadyToUsePlan) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.planCore, readyToUsePlan.planCore) && kotlin.jvm.internal.Intrinsics.areEqual(this.virtualCard, readyToUsePlan.virtualCard);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.ReadyToUsePlan copy(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore planCore, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard virtualCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualCard, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.ReadyToUsePlan(planCore, virtualCard);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard getVirtualCard() {
        return this.virtualCard;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore getPlanCore() {
        return this.planCore;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.ReadyToUsePlan copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.ReadyToUsePlan readyToUsePlan, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore planCore, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard virtualCard, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planCore = readyToUsePlan.planCore;
        }
        if ((i & 2) != 0) {
            virtualCard = readyToUsePlan.virtualCard;
        }
        return readyToUsePlan.copy(planCore, virtualCard);
    }
}
