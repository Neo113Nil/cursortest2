package com.paypal.android.taptopay.domain.repository.payment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\r"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/payment/PPDCFIResponse;", "", "Lcom/paypal/android/taptopay/domain/repository/payment/FundingOption;", "primaryFundingOption", "", "secondaryFundingOptions", "Lcom/paypal/android/taptopay/domain/repository/payment/PPBalance;", "ppBalance", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/payment/FundingOption;Ljava/util/List;Lcom/paypal/android/taptopay/domain/repository/payment/PPBalance;)V", "component1", "()Lcom/paypal/android/taptopay/domain/repository/payment/FundingOption;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/android/taptopay/domain/repository/payment/PPBalance;", "copy", "(Lcom/paypal/android/taptopay/domain/repository/payment/FundingOption;Ljava/util/List;Lcom/paypal/android/taptopay/domain/repository/payment/PPBalance;)Lcom/paypal/android/taptopay/domain/repository/payment/PPDCFIResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/android/taptopay/domain/repository/payment/PPBalance;", "getPpBalance", "Lcom/paypal/android/taptopay/domain/repository/payment/FundingOption;", "getPrimaryFundingOption", "Ljava/util/List;", "getSecondaryFundingOptions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PPDCFIResponse {
    private final com.paypal.android.taptopay.domain.repository.payment.PPBalance ppBalance;
    private final com.paypal.android.taptopay.domain.repository.payment.FundingOption primaryFundingOption;
    private final java.util.List<com.paypal.android.taptopay.domain.repository.payment.FundingOption> secondaryFundingOptions;

    public PPDCFIResponse(com.paypal.android.taptopay.domain.repository.payment.FundingOption fundingOption, java.util.List<com.paypal.android.taptopay.domain.repository.payment.FundingOption> list, com.paypal.android.taptopay.domain.repository.payment.PPBalance pPBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pPBalance, "");
        this.primaryFundingOption = fundingOption;
        this.secondaryFundingOptions = list;
        this.ppBalance = pPBalance;
    }

    public final com.paypal.android.taptopay.domain.repository.payment.FundingOption getPrimaryFundingOption() {
        return this.primaryFundingOption;
    }

    public final java.util.List<com.paypal.android.taptopay.domain.repository.payment.FundingOption> getSecondaryFundingOptions() {
        return this.secondaryFundingOptions;
    }

    public final com.paypal.android.taptopay.domain.repository.payment.PPBalance getPpBalance() {
        return this.ppBalance;
    }

    public final java.lang.String toString() {
        com.paypal.android.taptopay.domain.repository.payment.FundingOption fundingOption = this.primaryFundingOption;
        java.util.List<com.paypal.android.taptopay.domain.repository.payment.FundingOption> list = this.secondaryFundingOptions;
        com.paypal.android.taptopay.domain.repository.payment.PPBalance pPBalance = this.ppBalance;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PPDCFIResponse(primaryFundingOption=");
        sb.append(fundingOption);
        sb.append(", secondaryFundingOptions=");
        sb.append(list);
        sb.append(", ppBalance=");
        sb.append(pPBalance);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.primaryFundingOption.hashCode() * 31) + this.secondaryFundingOptions.hashCode()) * 31) + this.ppBalance.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.taptopay.domain.repository.payment.PPDCFIResponse)) {
            return false;
        }
        com.paypal.android.taptopay.domain.repository.payment.PPDCFIResponse pPDCFIResponse = (com.paypal.android.taptopay.domain.repository.payment.PPDCFIResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.primaryFundingOption, pPDCFIResponse.primaryFundingOption) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryFundingOptions, pPDCFIResponse.secondaryFundingOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.ppBalance, pPDCFIResponse.ppBalance);
    }

    public final com.paypal.android.taptopay.domain.repository.payment.PPDCFIResponse copy(com.paypal.android.taptopay.domain.repository.payment.FundingOption primaryFundingOption, java.util.List<com.paypal.android.taptopay.domain.repository.payment.FundingOption> secondaryFundingOptions, com.paypal.android.taptopay.domain.repository.payment.PPBalance ppBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryFundingOption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryFundingOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ppBalance, "");
        return new com.paypal.android.taptopay.domain.repository.payment.PPDCFIResponse(primaryFundingOption, secondaryFundingOptions, ppBalance);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.android.taptopay.domain.repository.payment.PPBalance getPpBalance() {
        return this.ppBalance;
    }

    public final java.util.List<com.paypal.android.taptopay.domain.repository.payment.FundingOption> component2() {
        return this.secondaryFundingOptions;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.android.taptopay.domain.repository.payment.FundingOption getPrimaryFundingOption() {
        return this.primaryFundingOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.android.taptopay.domain.repository.payment.PPDCFIResponse copy$default(com.paypal.android.taptopay.domain.repository.payment.PPDCFIResponse pPDCFIResponse, com.paypal.android.taptopay.domain.repository.payment.FundingOption fundingOption, java.util.List list, com.paypal.android.taptopay.domain.repository.payment.PPBalance pPBalance, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fundingOption = pPDCFIResponse.primaryFundingOption;
        }
        if ((i & 2) != 0) {
            list = pPDCFIResponse.secondaryFundingOptions;
        }
        if ((i & 4) != 0) {
            pPBalance = pPDCFIResponse.ppBalance;
        }
        return pPDCFIResponse.copy(fundingOption, list, pPBalance);
    }
}
