package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u0014J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b1\u0010&Jf\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\"2\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b;\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bC\u0010,R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u0010.R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bI\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/MaturedPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetails;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanCore;", "planCore", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "autopayFundingInstrument", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanActivity;", "activities", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PaidOffPlanType;", "type", "", "planCompletedDate", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "refundAmount", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay;", "autopay", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanCore;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PaidOffPlanType;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay;)V", "getFundingInstrument", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentSummary;", "getInstallmentSummary", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentSummary;", "getPlanActivities", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document;", "getPlanDocuments", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy;", "getPlanVariantPolicy", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard;", "getPlanVirtualCard", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard;", "", "isPendingFraud", "()Z", "getPlanAutoPay", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay;", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanCore;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PaidOffPlanType;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "component7", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanCore;Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PaidOffPlanType;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/MaturedPlan;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanCore;", "getPlanCore", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "getAutopayFundingInstrument", "Ljava/util/List;", "getActivities", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PaidOffPlanType;", "getType", "Ljava/lang/String;", "getPlanCompletedDate", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "getRefundAmount", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay;", "getAutopay"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MaturedPlan implements com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity> activities;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay autopay;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument autopayFundingInstrument;
    private final java.lang.String planCompletedDate;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore planCore;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money refundAmount;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType type;

    public MaturedPlan(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore planCore, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity> list, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType paidOffPlanType, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay autopay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paidOffPlanType, "");
        this.planCore = planCore;
        this.autopayFundingInstrument = fundingInstrument;
        this.activities = list;
        this.type = paidOffPlanType;
        this.planCompletedDate = str;
        this.refundAmount = money;
        this.autopay = autopay;
    }

    public /* synthetic */ MaturedPlan(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore planCore, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, java.util.List list, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType paidOffPlanType, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay autopay, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(planCore, (i & 2) != 0 ? null : fundingInstrument, list, paidOffPlanType, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : money, (i & 64) != 0 ? null : autopay);
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanInstallmentsDataProvider
    public final /* bridge */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails getInstallmentDetails() {
        return super.getInstallmentDetails();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider
    public final /* bridge */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaymentSchedule getPlanSchedule() {
        return super.getPlanSchedule();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider
    public final /* bridge */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze getPlanSnooze() {
        return super.getPlanSnooze();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanSummaryDataProvider
    public final /* bridge */ java.lang.Boolean isLastPayment() {
        return super.isLastPayment();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider
    public final /* bridge */ boolean isMiniMirandaRequired() {
        return super.isMiniMirandaRequired();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore getPlanCore() {
        return this.planCore;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getAutopayFundingInstrument() {
        return this.autopayFundingInstrument;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity> getActivities() {
        return this.activities;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType getType() {
        return this.type;
    }

    public final java.lang.String getPlanCompletedDate() {
        return this.planCompletedDate;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getRefundAmount() {
        return this.refundAmount;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay getAutopay() {
        return this.autopay;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider
    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
        return this.autopayFundingInstrument;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanInstallmentsDataProvider
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentSummary getInstallmentSummary() {
        return getPlanCore().getInstallmentSummary();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider
    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity> getPlanActivities() {
        return this.activities;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider
    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.Document> getPlanDocuments() {
        return getPlanCore().getDocuments();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanMetadataProvider
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy getPlanVariantPolicy() {
        return getPlanCore().getVariantPolicy();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanMetadataProvider
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard getPlanVirtualCard() {
        return getPlanCore().getVirtualCard();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider
    public final boolean isPendingFraud() {
        return getPlanCore().getPendingFraud();
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay getPlanAutoPay() {
        return this.autopay;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore planCore = this.planCore;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.autopayFundingInstrument;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity> list = this.activities;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType paidOffPlanType = this.type;
        java.lang.String str = this.planCompletedDate;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.refundAmount;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay autopay = this.autopay;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MaturedPlan(planCore=");
        sb.append(planCore);
        sb.append(", autopayFundingInstrument=");
        sb.append(fundingInstrument);
        sb.append(", activities=");
        sb.append(list);
        sb.append(", type=");
        sb.append(paidOffPlanType);
        sb.append(", planCompletedDate=");
        sb.append(str);
        sb.append(", refundAmount=");
        sb.append(money);
        sb.append(", autopay=");
        sb.append(autopay);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.planCore.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = this.autopayFundingInstrument;
        int hashCode2 = fundingInstrument == null ? 0 : fundingInstrument.hashCode();
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity> list = this.activities;
        int hashCode3 = list == null ? 0 : list.hashCode();
        int hashCode4 = this.type.hashCode();
        java.lang.String str = this.planCompletedDate;
        int hashCode5 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.refundAmount;
        int hashCode6 = money == null ? 0 : money.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay autopay = this.autopay;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (autopay != null ? autopay.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.MaturedPlan)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.MaturedPlan maturedPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.MaturedPlan) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.planCore, maturedPlan.planCore) && kotlin.jvm.internal.Intrinsics.areEqual(this.autopayFundingInstrument, maturedPlan.autopayFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.activities, maturedPlan.activities) && this.type == maturedPlan.type && kotlin.jvm.internal.Intrinsics.areEqual(this.planCompletedDate, maturedPlan.planCompletedDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.refundAmount, maturedPlan.refundAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.autopay, maturedPlan.autopay);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.MaturedPlan copy(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore planCore, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument autopayFundingInstrument, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity> activities, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType type, java.lang.String planCompletedDate, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money refundAmount, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay autopay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.MaturedPlan(planCore, autopayFundingInstrument, activities, type, planCompletedDate, refundAmount, autopay);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay getAutopay() {
        return this.autopay;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getRefundAmount() {
        return this.refundAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getPlanCompletedDate() {
        return this.planCompletedDate;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType getType() {
        return this.type;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity> component3() {
        return this.activities;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getAutopayFundingInstrument() {
        return this.autopayFundingInstrument;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore getPlanCore() {
        return this.planCore;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.MaturedPlan copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.MaturedPlan maturedPlan, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore planCore, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, java.util.List list, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType paidOffPlanType, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay autopay, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planCore = maturedPlan.planCore;
        }
        if ((i & 2) != 0) {
            fundingInstrument = maturedPlan.autopayFundingInstrument;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument2 = fundingInstrument;
        if ((i & 4) != 0) {
            list = maturedPlan.activities;
        }
        java.util.List list2 = list;
        if ((i & 8) != 0) {
            paidOffPlanType = maturedPlan.type;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType paidOffPlanType2 = paidOffPlanType;
        if ((i & 16) != 0) {
            str = maturedPlan.planCompletedDate;
        }
        java.lang.String str2 = str;
        if ((i & 32) != 0) {
            money = maturedPlan.refundAmount;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2 = money;
        if ((i & 64) != 0) {
            autopay = maturedPlan.autopay;
        }
        return maturedPlan.copy(planCore, fundingInstrument2, list2, paidOffPlanType2, str2, money2, autopay);
    }
}
