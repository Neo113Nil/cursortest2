package com.paypal.oslo.feature.moneymovement.api.domain;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u008e\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0017R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u0019R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b2\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b\u000b\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010\"R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b:\u0010\u0019R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b;\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;", "", "", "id", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/FundingSource;", "fundingSources", "backupFundingSources", "Lcom/paypal/oslo/feature/moneymovement/api/domain/AmountsBreakdown;", "amountsBreakdown", "", "isDefault", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentDelivery;", "paymentDelivery", "Lcom/paypal/oslo/feature/moneymovement/api/domain/DisbursementDestination;", "destination", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanContingencyInfo;", "contingencies", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureInfo;", "disclosures", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/domain/AmountsBreakdown;ZLcom/paypal/oslo/feature/moneymovement/api/domain/PaymentDelivery;Lcom/paypal/oslo/feature/moneymovement/api/domain/DisbursementDestination;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/AmountsBreakdown;", "component5", "()Z", "component6", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentDelivery;", "component7", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/DisbursementDestination;", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/domain/AmountsBreakdown;ZLcom/paypal/oslo/feature/moneymovement/api/domain/PaymentDelivery;Lcom/paypal/oslo/feature/moneymovement/api/domain/DisbursementDestination;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getFundingSources", "getBackupFundingSources", "Lcom/paypal/oslo/feature/moneymovement/api/domain/AmountsBreakdown;", "getAmountsBreakdown", "Z", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentDelivery;", "getPaymentDelivery", "Lcom/paypal/oslo/feature/moneymovement/api/domain/DisbursementDestination;", "getDestination", "getContingencies", "getDisclosures"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentPlan {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown amountsBreakdown;
    private final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> backupFundingSources;
    private final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyInfo> contingencies;
    private final com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination destination;
    private final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo> disclosures;
    private final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> fundingSources;
    private final java.lang.String id;
    private final boolean isDefault;
    private final com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery paymentDelivery;

    public PaymentPlan(java.lang.String str, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> list, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> list2, com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown amountsBreakdown, boolean z, com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery paymentDelivery, com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination disbursementDestination, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyInfo> list3, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo> list4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.id = str;
        this.fundingSources = list;
        this.backupFundingSources = list2;
        this.amountsBreakdown = amountsBreakdown;
        this.isDefault = z;
        this.paymentDelivery = paymentDelivery;
        this.destination = disbursementDestination;
        this.contingencies = list3;
        this.disclosures = list4;
    }

    public /* synthetic */ PaymentPlan(java.lang.String str, java.util.List list, java.util.List list2, com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown amountsBreakdown, boolean z, com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery paymentDelivery, com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination disbursementDestination, java.util.List list3, java.util.List list4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : amountsBreakdown, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : paymentDelivery, (i & 64) != 0 ? null : disbursementDestination, (i & 128) != 0 ? null : list3, (i & 256) != 0 ? null : list4);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> getFundingSources() {
        return this.fundingSources;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> getBackupFundingSources() {
        return this.backupFundingSources;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown getAmountsBreakdown() {
        return this.amountsBreakdown;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery getPaymentDelivery() {
        return this.paymentDelivery;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination getDestination() {
        return this.destination;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyInfo> getContingencies() {
        return this.contingencies;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo> getDisclosures() {
        return this.disclosures;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> list = this.fundingSources;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> list2 = this.backupFundingSources;
        com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown amountsBreakdown = this.amountsBreakdown;
        boolean z = this.isDefault;
        com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery paymentDelivery = this.paymentDelivery;
        com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination disbursementDestination = this.destination;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyInfo> list3 = this.contingencies;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo> list4 = this.disclosures;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentPlan(id=");
        sb.append(str);
        sb.append(", fundingSources=");
        sb.append(list);
        sb.append(", backupFundingSources=");
        sb.append(list2);
        sb.append(", amountsBreakdown=");
        sb.append(amountsBreakdown);
        sb.append(", isDefault=");
        sb.append(z);
        sb.append(", paymentDelivery=");
        sb.append(paymentDelivery);
        sb.append(", destination=");
        sb.append(disbursementDestination);
        sb.append(", contingencies=");
        sb.append(list3);
        sb.append(", disclosures=");
        sb.append(list4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.fundingSources.hashCode();
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> list = this.backupFundingSources;
        int hashCode3 = list == null ? 0 : list.hashCode();
        com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown amountsBreakdown = this.amountsBreakdown;
        int hashCode4 = amountsBreakdown == null ? 0 : amountsBreakdown.hashCode();
        int hashCode5 = java.lang.Boolean.hashCode(this.isDefault);
        com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery paymentDelivery = this.paymentDelivery;
        int hashCode6 = paymentDelivery == null ? 0 : paymentDelivery.hashCode();
        com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination disbursementDestination = this.destination;
        int hashCode7 = disbursementDestination == null ? 0 : disbursementDestination.hashCode();
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyInfo> list2 = this.contingencies;
        int hashCode8 = list2 == null ? 0 : list2.hashCode();
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo> list3 = this.disclosures;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan = (com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, paymentPlan.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSources, paymentPlan.fundingSources) && kotlin.jvm.internal.Intrinsics.areEqual(this.backupFundingSources, paymentPlan.backupFundingSources) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountsBreakdown, paymentPlan.amountsBreakdown) && this.isDefault == paymentPlan.isDefault && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentDelivery, paymentPlan.paymentDelivery) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, paymentPlan.destination) && kotlin.jvm.internal.Intrinsics.areEqual(this.contingencies, paymentPlan.contingencies) && kotlin.jvm.internal.Intrinsics.areEqual(this.disclosures, paymentPlan.disclosures);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan copy(java.lang.String id, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> fundingSources, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> backupFundingSources, com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown amountsBreakdown, boolean isDefault, com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery paymentDelivery, com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination destination, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyInfo> contingencies, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo> disclosures) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSources, "");
        return new com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan(id, fundingSources, backupFundingSources, amountsBreakdown, isDefault, paymentDelivery, destination, contingencies, disclosures);
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo> component9() {
        return this.disclosures;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyInfo> component8() {
        return this.contingencies;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination getDestination() {
        return this.destination;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery getPaymentDelivery() {
        return this.paymentDelivery;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown getAmountsBreakdown() {
        return this.amountsBreakdown;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> component3() {
        return this.backupFundingSources;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> component2() {
        return this.fundingSources;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
