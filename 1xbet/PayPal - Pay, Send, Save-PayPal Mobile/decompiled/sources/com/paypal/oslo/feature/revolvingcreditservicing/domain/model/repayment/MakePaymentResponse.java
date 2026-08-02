package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "amount", "", "paymentDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstruments", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getAmount", "Ljava/lang/String;", "getPaymentDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;", "getPaymentType", "Ljava/util/List;", "getFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MakePaymentResponse {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments;
    private final java.lang.String paymentDate;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType paymentType;

    /* JADX WARN: Multi-variable type inference failed */
    public MakePaymentResponse(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.amount = currencyAmount;
        this.paymentDate = str;
        this.paymentType = revolvingCreditPaymentType;
        this.fundingInstruments = list;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAmount() {
        return this.amount;
    }

    public final java.lang.String getPaymentDate() {
        return this.paymentDate;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType getPaymentType() {
        return this.paymentType;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> getFundingInstruments() {
        return this.fundingInstruments;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.amount;
        java.lang.String str = this.paymentDate;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType = this.paymentType;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list = this.fundingInstruments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MakePaymentResponse(amount=");
        sb.append(currencyAmount);
        sb.append(", paymentDate=");
        sb.append(str);
        sb.append(", paymentType=");
        sb.append(revolvingCreditPaymentType);
        sb.append(", fundingInstruments=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.amount.hashCode();
        java.lang.String str = this.paymentDate;
        return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.paymentType.hashCode()) * 31) + this.fundingInstruments.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse makePaymentResponse = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, makePaymentResponse.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentDate, makePaymentResponse.paymentDate) && this.paymentType == makePaymentResponse.paymentType && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, makePaymentResponse.fundingInstruments);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount, java.lang.String paymentDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType paymentType, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse(amount, paymentDate, paymentType, fundingInstruments);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> component4() {
        return this.fundingInstruments;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType getPaymentType() {
        return this.paymentType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPaymentDate() {
        return this.paymentDate;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAmount() {
        return this.amount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse makePaymentResponse, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            currencyAmount = makePaymentResponse.amount;
        }
        if ((i & 2) != 0) {
            str = makePaymentResponse.paymentDate;
        }
        if ((i & 4) != 0) {
            revolvingCreditPaymentType = makePaymentResponse.paymentType;
        }
        if ((i & 8) != 0) {
            list = makePaymentResponse.fundingInstruments;
        }
        return makePaymentResponse.copy(currencyAmount, str, revolvingCreditPaymentType, list);
    }
}
