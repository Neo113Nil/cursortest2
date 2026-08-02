package com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJT\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001aR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/makeapayment/MakePaymentRequest;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "amount", "Ljava/time/LocalDate;", "date", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstruments", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/time/LocalDate;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component5", "()Ljava/time/LocalDate;", "component6", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/time/LocalDate;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/makeapayment/MakePaymentRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;", "getPaymentType", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getAmount", "Ljava/time/LocalDate;", "getDate", "Ljava/util/List;", "getFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MakePaymentRequest {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
    private final java.time.LocalDate date;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType paymentType;

    /* JADX WARN: Multi-variable type inference failed */
    public MakePaymentRequest(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.time.LocalDate localDate, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.creditProductIdentifier = creditProductIdentifier;
        this.creditAccountId = str;
        this.paymentType = revolvingCreditPaymentType;
        this.amount = currencyAmount;
        this.date = localDate;
        this.fundingInstruments = list;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType getPaymentType() {
        return this.paymentType;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAmount() {
        return this.amount;
    }

    public final java.time.LocalDate getDate() {
        return this.date;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> getFundingInstruments() {
        return this.fundingInstruments;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        java.lang.String str = this.creditAccountId;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType = this.paymentType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.amount;
        java.time.LocalDate localDate = this.date;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list = this.fundingInstruments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MakePaymentRequest(creditProductIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(", creditAccountId=");
        sb.append(str);
        sb.append(", paymentType=");
        sb.append(revolvingCreditPaymentType);
        sb.append(", amount=");
        sb.append(currencyAmount);
        sb.append(", date=");
        sb.append(localDate);
        sb.append(", fundingInstruments=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditProductIdentifier.hashCode();
        int hashCode2 = this.creditAccountId.hashCode();
        int hashCode3 = this.paymentType.hashCode();
        int hashCode4 = this.amount.hashCode();
        java.time.LocalDate localDate = this.date;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.fundingInstruments.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest makePaymentRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest) other;
        return this.creditProductIdentifier == makePaymentRequest.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, makePaymentRequest.creditAccountId) && this.paymentType == makePaymentRequest.paymentType && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, makePaymentRequest.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.date, makePaymentRequest.date) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, makePaymentRequest.fundingInstruments);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String creditAccountId, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType paymentType, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount, java.time.LocalDate date, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest(creditProductIdentifier, creditAccountId, paymentType, amount, date, fundingInstruments);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> component6() {
        return this.fundingInstruments;
    }

    /* renamed from: component5, reason: from getter */
    public final java.time.LocalDate getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType getPaymentType() {
        return this.paymentType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest makePaymentRequest, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.time.LocalDate localDate, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            creditProductIdentifier = makePaymentRequest.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            str = makePaymentRequest.creditAccountId;
        }
        java.lang.String str2 = str;
        if ((i & 4) != 0) {
            revolvingCreditPaymentType = makePaymentRequest.paymentType;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType2 = revolvingCreditPaymentType;
        if ((i & 8) != 0) {
            currencyAmount = makePaymentRequest.amount;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = currencyAmount;
        if ((i & 16) != 0) {
            localDate = makePaymentRequest.date;
        }
        java.time.LocalDate localDate2 = localDate;
        if ((i & 32) != 0) {
            list = makePaymentRequest.fundingInstruments;
        }
        return makePaymentRequest.copy(creditProductIdentifier, str2, revolvingCreditPaymentType2, currencyAmount2, localDate2, list);
    }
}
