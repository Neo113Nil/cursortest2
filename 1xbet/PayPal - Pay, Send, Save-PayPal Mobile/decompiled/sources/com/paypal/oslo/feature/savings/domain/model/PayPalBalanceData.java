package com.paypal.oslo.feature.savings.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/PayPalBalanceData;", "", "", "instrumentId", "currencyCode", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "availableBalance", "", "primary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/savings/domain/model/PayPalBalanceData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId", "getCurrencyCode", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "getAvailableBalance", "Ljava/lang/Boolean;", "getPrimary"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PayPalBalanceData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.savings.domain.model.MoneyData availableBalance;
    private final java.lang.String currencyCode;
    private final java.lang.String instrumentId;
    private final java.lang.Boolean primary;

    public PayPalBalanceData(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyData, "");
        this.instrumentId = str;
        this.currencyCode = str2;
        this.availableBalance = moneyData;
        this.primary = bool;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getAvailableBalance() {
        return this.availableBalance;
    }

    public final java.lang.Boolean getPrimary() {
        return this.primary;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentId;
        java.lang.String str2 = this.currencyCode;
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData = this.availableBalance;
        java.lang.Boolean bool = this.primary;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalBalanceData(instrumentId=");
        sb.append(str);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", availableBalance=");
        sb.append(moneyData);
        sb.append(", primary=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.instrumentId.hashCode();
        int hashCode2 = this.currencyCode.hashCode();
        int hashCode3 = this.availableBalance.hashCode();
        java.lang.Boolean bool = this.primary;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.PayPalBalanceData)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.PayPalBalanceData payPalBalanceData = (com.paypal.oslo.feature.savings.domain.model.PayPalBalanceData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, payPalBalanceData.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, payPalBalanceData.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableBalance, payPalBalanceData.availableBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.primary, payPalBalanceData.primary);
    }

    public final com.paypal.oslo.feature.savings.domain.model.PayPalBalanceData copy(java.lang.String instrumentId, java.lang.String currencyCode, com.paypal.oslo.feature.savings.domain.model.MoneyData availableBalance, java.lang.Boolean primary) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableBalance, "");
        return new com.paypal.oslo.feature.savings.domain.model.PayPalBalanceData(instrumentId, currencyCode, availableBalance, primary);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getAvailableBalance() {
        return this.availableBalance;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.PayPalBalanceData copy$default(com.paypal.oslo.feature.savings.domain.model.PayPalBalanceData payPalBalanceData, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = payPalBalanceData.instrumentId;
        }
        if ((i & 2) != 0) {
            str2 = payPalBalanceData.currencyCode;
        }
        if ((i & 4) != 0) {
            moneyData = payPalBalanceData.availableBalance;
        }
        if ((i & 8) != 0) {
            bool = payPalBalanceData.primary;
        }
        return payPalBalanceData.copy(str, str2, moneyData, bool);
    }
}
