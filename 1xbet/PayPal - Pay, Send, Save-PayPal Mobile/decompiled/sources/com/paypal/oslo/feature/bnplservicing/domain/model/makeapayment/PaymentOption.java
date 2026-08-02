package com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOption;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOptionType;", "type", "", "shouldShowAutopayOnText", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "amount", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOptionType;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOptionType;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOptionType;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOption;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOptionType;", "getType", "Ljava/lang/Boolean;", "getShouldShowAutopayOnText", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentOption {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount;
    private final java.lang.Boolean shouldShowAutopayOnText;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType type;

    public PaymentOption(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType paymentOptionType, java.lang.Boolean bool, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOptionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        this.type = paymentOptionType;
        this.shouldShowAutopayOnText = bool;
        this.amount = money;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType getType() {
        return this.type;
    }

    public final java.lang.Boolean getShouldShowAutopayOnText() {
        return this.shouldShowAutopayOnText;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType paymentOptionType = this.type;
        java.lang.Boolean bool = this.shouldShowAutopayOnText;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentOption(type=");
        sb.append(paymentOptionType);
        sb.append(", shouldShowAutopayOnText=");
        sb.append(bool);
        sb.append(", amount=");
        sb.append(money);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.lang.Boolean bool = this.shouldShowAutopayOnText;
        return (((hashCode * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption paymentOption = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption) other;
        return this.type == paymentOption.type && kotlin.jvm.internal.Intrinsics.areEqual(this.shouldShowAutopayOnText, paymentOption.shouldShowAutopayOnText) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, paymentOption.amount);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption copy(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType type, java.lang.Boolean shouldShowAutopayOnText, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption(type, shouldShowAutopayOnText, amount);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getShouldShowAutopayOnText() {
        return this.shouldShowAutopayOnText;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption paymentOption, com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType paymentOptionType, java.lang.Boolean bool, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            paymentOptionType = paymentOption.type;
        }
        if ((i & 2) != 0) {
            bool = paymentOption.shouldShowAutopayOnText;
        }
        if ((i & 4) != 0) {
            money = paymentOption.amount;
        }
        return paymentOption.copy(paymentOptionType, bool, money);
    }
}
