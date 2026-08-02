package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/Money;", "amountFrom", "amountTo", "Lcom/paypal/oslo/feature/p2p/domain/model/ExchangeRate;", "exchangeRate", "", "fxQuoteId", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/Money;Lcom/paypal/oslo/feature/p2p/domain/model/Money;Lcom/paypal/oslo/feature/p2p/domain/model/ExchangeRate;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/Money;", "component2", "component3", "()Lcom/paypal/oslo/feature/p2p/domain/model/ExchangeRate;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/Money;Lcom/paypal/oslo/feature/p2p/domain/model/Money;Lcom/paypal/oslo/feature/p2p/domain/model/ExchangeRate;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/domain/model/Money;", "getAmountFrom", "getAmountTo", "Lcom/paypal/oslo/feature/p2p/domain/model/ExchangeRate;", "getExchangeRate", "Ljava/lang/String;", "getFxQuoteId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlanCurrencyExchange {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.domain.model.Money amountFrom;
    private final com.paypal.oslo.feature.p2p.domain.model.Money amountTo;
    private final com.paypal.oslo.feature.p2p.domain.model.ExchangeRate exchangeRate;
    private final java.lang.String fxQuoteId;

    public PlanCurrencyExchange(com.paypal.oslo.feature.p2p.domain.model.Money money, com.paypal.oslo.feature.p2p.domain.model.Money money2, com.paypal.oslo.feature.p2p.domain.model.ExchangeRate exchangeRate, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRate, "");
        this.amountFrom = money;
        this.amountTo = money2;
        this.exchangeRate = exchangeRate;
        this.fxQuoteId = str;
    }

    public /* synthetic */ PlanCurrencyExchange(com.paypal.oslo.feature.p2p.domain.model.Money money, com.paypal.oslo.feature.p2p.domain.model.Money money2, com.paypal.oslo.feature.p2p.domain.model.ExchangeRate exchangeRate, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(money, money2, exchangeRate, (i & 8) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.Money getAmountFrom() {
        return this.amountFrom;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.Money getAmountTo() {
        return this.amountTo;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.ExchangeRate getExchangeRate() {
        return this.exchangeRate;
    }

    public final java.lang.String getFxQuoteId() {
        return this.fxQuoteId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.domain.model.Money money = this.amountFrom;
        com.paypal.oslo.feature.p2p.domain.model.Money money2 = this.amountTo;
        com.paypal.oslo.feature.p2p.domain.model.ExchangeRate exchangeRate = this.exchangeRate;
        java.lang.String str = this.fxQuoteId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanCurrencyExchange(amountFrom=");
        sb.append(money);
        sb.append(", amountTo=");
        sb.append(money2);
        sb.append(", exchangeRate=");
        sb.append(exchangeRate);
        sb.append(", fxQuoteId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.amountFrom.hashCode();
        int hashCode2 = this.amountTo.hashCode();
        int hashCode3 = this.exchangeRate.hashCode();
        java.lang.String str = this.fxQuoteId;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange = (com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amountFrom, planCurrencyExchange.amountFrom) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountTo, planCurrencyExchange.amountTo) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, planCurrencyExchange.exchangeRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuoteId, planCurrencyExchange.fxQuoteId);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange copy(com.paypal.oslo.feature.p2p.domain.model.Money amountFrom, com.paypal.oslo.feature.p2p.domain.model.Money amountTo, com.paypal.oslo.feature.p2p.domain.model.ExchangeRate exchangeRate, java.lang.String fxQuoteId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountFrom, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountTo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRate, "");
        return new com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange(amountFrom, amountTo, exchangeRate, fxQuoteId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFxQuoteId() {
        return this.fxQuoteId;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.ExchangeRate getExchangeRate() {
        return this.exchangeRate;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.Money getAmountTo() {
        return this.amountTo;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.Money getAmountFrom() {
        return this.amountFrom;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange copy$default(com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange, com.paypal.oslo.feature.p2p.domain.model.Money money, com.paypal.oslo.feature.p2p.domain.model.Money money2, com.paypal.oslo.feature.p2p.domain.model.ExchangeRate exchangeRate, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = planCurrencyExchange.amountFrom;
        }
        if ((i & 2) != 0) {
            money2 = planCurrencyExchange.amountTo;
        }
        if ((i & 4) != 0) {
            exchangeRate = planCurrencyExchange.exchangeRate;
        }
        if ((i & 8) != 0) {
            str = planCurrencyExchange.fxQuoteId;
        }
        return planCurrencyExchange.copy(money, money2, exchangeRate, str);
    }
}
