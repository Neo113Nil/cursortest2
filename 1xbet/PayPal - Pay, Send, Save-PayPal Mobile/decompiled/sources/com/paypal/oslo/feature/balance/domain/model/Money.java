package com.paypal.oslo.feature.balance.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/Money;", "", "Ljava/math/BigDecimal;", "amount", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyCode;", "currencyCode", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "isNegative", "()Z", "isZero", "isPositive", "component1", "()Ljava/math/BigDecimal;", "component2-h-kTgrg", "()Ljava/lang/String;", "component2", "copy-NMQ7VMM", "(Ljava/math/BigDecimal;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/domain/model/Money;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/math/BigDecimal;", "getAmount", "Ljava/lang/String;", "getCurrencyCode-h-kTgrg"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Money {
    public static final int $stable = 0;
    private final java.math.BigDecimal amount;
    private final java.lang.String currencyCode;

    private Money(java.math.BigDecimal bigDecimal, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.amount = bigDecimal;
        this.currencyCode = str;
    }

    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: getCurrencyCode-h-kTgrg, reason: not valid java name */
    public final java.lang.String m12029getCurrencyCodehkTgrg() {
        return this.currencyCode;
    }

    public final boolean isNegative() {
        return this.amount.compareTo(java.math.BigDecimal.ZERO) < 0;
    }

    public final boolean isZero() {
        return this.amount.compareTo(java.math.BigDecimal.ZERO) == 0;
    }

    public final boolean isPositive() {
        return this.amount.compareTo(java.math.BigDecimal.ZERO) > 0;
    }

    public final java.lang.String toString() {
        java.math.BigDecimal bigDecimal = this.amount;
        java.lang.String m11388toStringimpl = com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11388toStringimpl(this.currencyCode);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Money(amount=");
        sb.append(bigDecimal);
        sb.append(", currencyCode=");
        sb.append(m11388toStringimpl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.amount.hashCode() * 31) + com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11387hashCodeimpl(this.currencyCode);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.Money)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.Money money = (com.paypal.oslo.feature.balance.domain.model.Money) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, money.amount) && com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11386equalsimpl0(this.currencyCode, money.currencyCode);
    }

    /* renamed from: copy-NMQ7VMM, reason: not valid java name */
    public final com.paypal.oslo.feature.balance.domain.model.Money m12028copyNMQ7VMM(java.math.BigDecimal amount, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.balance.domain.model.Money(amount, currencyCode, null);
    }

    /* renamed from: component2-h-kTgrg, reason: not valid java name and from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: copy-NMQ7VMM$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.balance.domain.model.Money m12026copyNMQ7VMM$default(com.paypal.oslo.feature.balance.domain.model.Money money, java.math.BigDecimal bigDecimal, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = money.amount;
        }
        if ((i & 2) != 0) {
            str = money.currencyCode;
        }
        return money.m12028copyNMQ7VMM(bigDecimal, str);
    }

    public /* synthetic */ Money(java.math.BigDecimal bigDecimal, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str);
    }
}
