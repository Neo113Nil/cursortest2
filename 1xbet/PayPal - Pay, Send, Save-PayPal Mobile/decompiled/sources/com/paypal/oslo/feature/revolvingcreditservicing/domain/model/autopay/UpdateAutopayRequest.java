package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJX\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0018R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/UpdateAutopayRequest;", "", "", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "enrolled", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "paymentOption", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstruments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "customAmount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;ZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component3", "()Z", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "component5", "()Ljava/util/List;", "component6", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;ZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/UpdateAutopayRequest;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Z", "getEnrolled", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "getPaymentOption", "Ljava/util/List;", "getFundingInstruments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getCustomAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UpdateAutopayRequest {
    public static final int $stable = 8;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount customAmount;
    private final boolean enrolled;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateAutopayRequest(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.creditAccountId = str;
        this.creditProductIdentifier = creditProductIdentifier;
        this.enrolled = z;
        this.paymentOption = paymentOption;
        this.fundingInstruments = list;
        this.customAmount = currencyAmount;
    }

    public /* synthetic */ UpdateAutopayRequest(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, java.util.List list, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, creditProductIdentifier, z, (i & 8) != 0 ? null : paymentOption, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : currencyAmount);
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final boolean getEnrolled() {
        return this.enrolled;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getPaymentOption() {
        return this.paymentOption;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> getFundingInstruments() {
        return this.fundingInstruments;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCustomAmount() {
        return this.customAmount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditAccountId;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        boolean z = this.enrolled;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = this.paymentOption;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list = this.fundingInstruments;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.customAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAutopayRequest(creditAccountId=");
        sb.append(str);
        sb.append(", creditProductIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(", enrolled=");
        sb.append(z);
        sb.append(", paymentOption=");
        sb.append(paymentOption);
        sb.append(", fundingInstruments=");
        sb.append(list);
        sb.append(", customAmount=");
        sb.append(currencyAmount);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditAccountId.hashCode();
        int hashCode2 = this.creditProductIdentifier.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.enrolled);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = this.paymentOption;
        int hashCode4 = paymentOption == null ? 0 : paymentOption.hashCode();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list = this.fundingInstruments;
        int hashCode5 = list == null ? 0 : list.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.customAmount;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (currencyAmount != null ? currencyAmount.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest updateAutopayRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, updateAutopayRequest.creditAccountId) && this.creditProductIdentifier == updateAutopayRequest.creditProductIdentifier && this.enrolled == updateAutopayRequest.enrolled && this.paymentOption == updateAutopayRequest.paymentOption && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, updateAutopayRequest.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.customAmount, updateAutopayRequest.customAmount);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest copy(java.lang.String creditAccountId, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, boolean enrolled, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount customAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest(creditAccountId, creditProductIdentifier, enrolled, paymentOption, fundingInstruments, customAmount);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCustomAmount() {
        return this.customAmount;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> component5() {
        return this.fundingInstruments;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getPaymentOption() {
        return this.paymentOption;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnrolled() {
        return this.enrolled;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest updateAutopayRequest, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, java.util.List list, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = updateAutopayRequest.creditAccountId;
        }
        if ((i & 2) != 0) {
            creditProductIdentifier = updateAutopayRequest.creditProductIdentifier;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = creditProductIdentifier;
        if ((i & 4) != 0) {
            z = updateAutopayRequest.enrolled;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            paymentOption = updateAutopayRequest.paymentOption;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption2 = paymentOption;
        if ((i & 16) != 0) {
            list = updateAutopayRequest.fundingInstruments;
        }
        java.util.List list2 = list;
        if ((i & 32) != 0) {
            currencyAmount = updateAutopayRequest.customAmount;
        }
        return updateAutopayRequest.copy(str, creditProductIdentifier2, z2, paymentOption2, list2, currencyAmount);
    }
}
