package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0092\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\u001bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b6\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b\u000b\u0010 R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b:\u0010\u001bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b;\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010&R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010("}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "", "", "id", "", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;", "fundingSources", "backupFundingSources", "Lcom/paypal/oslo/feature/p2p/domain/model/AmountsBreakdown;", "amountsBreakdown", "", "isDefault", "Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;", "disclosures", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingency;", "contingencies", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "currencyExchange", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentDelivery;", "paymentDelivery", "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionProvider;", "currencyConversionProvider", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/domain/model/AmountsBreakdown;ZLjava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentDelivery;Lcom/paypal/oslo/feature/p2p/domain/model/ConversionProvider;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/paypal/oslo/feature/p2p/domain/model/AmountsBreakdown;", "component5", "()Z", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "component9", "()Lcom/paypal/oslo/feature/p2p/domain/model/PaymentDelivery;", "component10", "()Lcom/paypal/oslo/feature/p2p/domain/model/ConversionProvider;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/domain/model/AmountsBreakdown;ZLjava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentDelivery;Lcom/paypal/oslo/feature/p2p/domain/model/ConversionProvider;)Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getFundingSources", "getBackupFundingSources", "Lcom/paypal/oslo/feature/p2p/domain/model/AmountsBreakdown;", "getAmountsBreakdown", "Z", "getDisclosures", "getContingencies", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "getCurrencyExchange", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentDelivery;", "getPaymentDelivery", "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionProvider;", "getCurrencyConversionProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FundingOption {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.p2p.domain.model.AmountsBreakdown amountsBreakdown;
    private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> backupFundingSources;
    private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanContingency> contingencies;
    private final com.paypal.oslo.feature.p2p.domain.model.ConversionProvider currencyConversionProvider;
    private final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange currencyExchange;
    private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> disclosures;
    private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> fundingSources;
    private final java.lang.String id;
    private final boolean isDefault;
    private final com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery paymentDelivery;

    public FundingOption(java.lang.String str, java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> list, java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> list2, com.paypal.oslo.feature.p2p.domain.model.AmountsBreakdown amountsBreakdown, boolean z, java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> list3, java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanContingency> list4, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange, com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery paymentDelivery, com.paypal.oslo.feature.p2p.domain.model.ConversionProvider conversionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountsBreakdown, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list4, "");
        this.id = str;
        this.fundingSources = list;
        this.backupFundingSources = list2;
        this.amountsBreakdown = amountsBreakdown;
        this.isDefault = z;
        this.disclosures = list3;
        this.contingencies = list4;
        this.currencyExchange = planCurrencyExchange;
        this.paymentDelivery = paymentDelivery;
        this.currencyConversionProvider = conversionProvider;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> getFundingSources() {
        return this.fundingSources;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> getBackupFundingSources() {
        return this.backupFundingSources;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.AmountsBreakdown getAmountsBreakdown() {
        return this.amountsBreakdown;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public /* synthetic */ FundingOption(java.lang.String str, java.util.List list, java.util.List list2, com.paypal.oslo.feature.p2p.domain.model.AmountsBreakdown amountsBreakdown, boolean z, java.util.List list3, java.util.List list4, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange, com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery paymentDelivery, com.paypal.oslo.feature.p2p.domain.model.ConversionProvider conversionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, list2, amountsBreakdown, z, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4, (i & 128) != 0 ? null : planCurrencyExchange, (i & 256) != 0 ? null : paymentDelivery, (i & 512) != 0 ? null : conversionProvider);
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> getDisclosures() {
        return this.disclosures;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanContingency> getContingencies() {
        return this.contingencies;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange getCurrencyExchange() {
        return this.currencyExchange;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery getPaymentDelivery() {
        return this.paymentDelivery;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.ConversionProvider getCurrencyConversionProvider() {
        return this.currencyConversionProvider;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> list = this.fundingSources;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> list2 = this.backupFundingSources;
        com.paypal.oslo.feature.p2p.domain.model.AmountsBreakdown amountsBreakdown = this.amountsBreakdown;
        boolean z = this.isDefault;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> list3 = this.disclosures;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanContingency> list4 = this.contingencies;
        com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange = this.currencyExchange;
        com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery paymentDelivery = this.paymentDelivery;
        com.paypal.oslo.feature.p2p.domain.model.ConversionProvider conversionProvider = this.currencyConversionProvider;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingOption(id=");
        sb.append(str);
        sb.append(", fundingSources=");
        sb.append(list);
        sb.append(", backupFundingSources=");
        sb.append(list2);
        sb.append(", amountsBreakdown=");
        sb.append(amountsBreakdown);
        sb.append(", isDefault=");
        sb.append(z);
        sb.append(", disclosures=");
        sb.append(list3);
        sb.append(", contingencies=");
        sb.append(list4);
        sb.append(", currencyExchange=");
        sb.append(planCurrencyExchange);
        sb.append(", paymentDelivery=");
        sb.append(paymentDelivery);
        sb.append(", currencyConversionProvider=");
        sb.append(conversionProvider);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.fundingSources.hashCode();
        int hashCode3 = this.backupFundingSources.hashCode();
        int hashCode4 = this.amountsBreakdown.hashCode();
        int hashCode5 = java.lang.Boolean.hashCode(this.isDefault);
        int hashCode6 = this.disclosures.hashCode();
        int hashCode7 = this.contingencies.hashCode();
        com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange = this.currencyExchange;
        int hashCode8 = planCurrencyExchange == null ? 0 : planCurrencyExchange.hashCode();
        com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery paymentDelivery = this.paymentDelivery;
        int hashCode9 = paymentDelivery == null ? 0 : paymentDelivery.hashCode();
        com.paypal.oslo.feature.p2p.domain.model.ConversionProvider conversionProvider = this.currencyConversionProvider;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (conversionProvider != null ? conversionProvider.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.FundingOption)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption = (com.paypal.oslo.feature.p2p.domain.model.FundingOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingOption.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSources, fundingOption.fundingSources) && kotlin.jvm.internal.Intrinsics.areEqual(this.backupFundingSources, fundingOption.backupFundingSources) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountsBreakdown, fundingOption.amountsBreakdown) && this.isDefault == fundingOption.isDefault && kotlin.jvm.internal.Intrinsics.areEqual(this.disclosures, fundingOption.disclosures) && kotlin.jvm.internal.Intrinsics.areEqual(this.contingencies, fundingOption.contingencies) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyExchange, fundingOption.currencyExchange) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentDelivery, fundingOption.paymentDelivery) && this.currencyConversionProvider == fundingOption.currencyConversionProvider;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.FundingOption copy(java.lang.String id, java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> fundingSources, java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> backupFundingSources, com.paypal.oslo.feature.p2p.domain.model.AmountsBreakdown amountsBreakdown, boolean isDefault, java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> disclosures, java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanContingency> contingencies, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange currencyExchange, com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery paymentDelivery, com.paypal.oslo.feature.p2p.domain.model.ConversionProvider currencyConversionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSources, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backupFundingSources, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountsBreakdown, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disclosures, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencies, "");
        return new com.paypal.oslo.feature.p2p.domain.model.FundingOption(id, fundingSources, backupFundingSources, amountsBreakdown, isDefault, disclosures, contingencies, currencyExchange, paymentDelivery, currencyConversionProvider);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery getPaymentDelivery() {
        return this.paymentDelivery;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange getCurrencyExchange() {
        return this.currencyExchange;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanContingency> component7() {
        return this.contingencies;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> component6() {
        return this.disclosures;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.AmountsBreakdown getAmountsBreakdown() {
        return this.amountsBreakdown;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> component3() {
        return this.backupFundingSources;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> component2() {
        return this.fundingSources;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.ConversionProvider getCurrencyConversionProvider() {
        return this.currencyConversionProvider;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
