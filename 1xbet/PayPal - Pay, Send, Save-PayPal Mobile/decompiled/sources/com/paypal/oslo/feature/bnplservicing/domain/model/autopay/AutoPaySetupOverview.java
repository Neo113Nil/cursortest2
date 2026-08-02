package com.paypal.oslo.feature.bnplservicing.domain.model.autopay;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ<\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/AutoPaySetupOverview;", "", "", "paymentAuthorizationLink", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/SupportedFundingInstrumentTypeForAddition;", "supportedFundingInstrumentsToAdd", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstruments", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/AutoPaySetupOverview;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaymentAuthorizationLink", "Ljava/util/List;", "getSupportedFundingInstrumentsToAdd", "getFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoPaySetupOverview {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments;
    private final java.lang.String paymentAuthorizationLink;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> supportedFundingInstrumentsToAdd;

    /* JADX WARN: Multi-variable type inference failed */
    public AutoPaySetupOverview(java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> list, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.paymentAuthorizationLink = str;
        this.supportedFundingInstrumentsToAdd = list;
        this.fundingInstruments = list2;
    }

    public final java.lang.String getPaymentAuthorizationLink() {
        return this.paymentAuthorizationLink;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> getSupportedFundingInstrumentsToAdd() {
        return this.supportedFundingInstrumentsToAdd;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> getFundingInstruments() {
        return this.fundingInstruments;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.paymentAuthorizationLink;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> list = this.supportedFundingInstrumentsToAdd;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> list2 = this.fundingInstruments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoPaySetupOverview(paymentAuthorizationLink=");
        sb.append(str);
        sb.append(", supportedFundingInstrumentsToAdd=");
        sb.append(list);
        sb.append(", fundingInstruments=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.paymentAuthorizationLink;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.supportedFundingInstrumentsToAdd.hashCode()) * 31) + this.fundingInstruments.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview autoPaySetupOverview = (com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAuthorizationLink, autoPaySetupOverview.paymentAuthorizationLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedFundingInstrumentsToAdd, autoPaySetupOverview.supportedFundingInstrumentsToAdd) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, autoPaySetupOverview.fundingInstruments);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview copy(java.lang.String paymentAuthorizationLink, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> supportedFundingInstrumentsToAdd, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedFundingInstrumentsToAdd, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview(paymentAuthorizationLink, supportedFundingInstrumentsToAdd, fundingInstruments);
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> component3() {
        return this.fundingInstruments;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> component2() {
        return this.supportedFundingInstrumentsToAdd;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPaymentAuthorizationLink() {
        return this.paymentAuthorizationLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview autoPaySetupOverview, java.lang.String str, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = autoPaySetupOverview.paymentAuthorizationLink;
        }
        if ((i & 2) != 0) {
            list = autoPaySetupOverview.supportedFundingInstrumentsToAdd;
        }
        if ((i & 4) != 0) {
            list2 = autoPaySetupOverview.fundingInstruments;
        }
        return autoPaySetupOverview.copy(str, list, list2);
    }
}
