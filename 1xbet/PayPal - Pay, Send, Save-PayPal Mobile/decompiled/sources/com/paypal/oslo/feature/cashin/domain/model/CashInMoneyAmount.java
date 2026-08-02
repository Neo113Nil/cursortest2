package com.paypal.oslo.feature.cashin.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/model/CashInMoneyAmount;", "", "", "currencyCode", "Ljava/math/BigDecimal;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "formatted", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/math/BigDecimal;", "component3", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)Lcom/paypal/oslo/feature/cashin/domain/model/CashInMoneyAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrencyCode", "Ljava/math/BigDecimal;", "getValue", "getFormatted"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CashInMoneyAmount {
    public static final int $stable = 0;
    private final java.lang.String currencyCode;
    private final java.lang.String formatted;
    private final java.math.BigDecimal value;

    public CashInMoneyAmount(java.lang.String str, java.math.BigDecimal bigDecimal, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.currencyCode = str;
        this.value = bigDecimal;
        this.formatted = str2;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.math.BigDecimal getValue() {
        return this.value;
    }

    public final java.lang.String getFormatted() {
        return this.formatted;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.currencyCode;
        java.math.BigDecimal bigDecimal = this.value;
        java.lang.String str2 = this.formatted;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CashInMoneyAmount(currencyCode=");
        sb.append(str);
        sb.append(", value=");
        sb.append(bigDecimal);
        sb.append(", formatted=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.currencyCode.hashCode() * 31) + this.value.hashCode()) * 31) + this.formatted.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cashin.domain.model.CashInMoneyAmount)) {
            return false;
        }
        com.paypal.oslo.feature.cashin.domain.model.CashInMoneyAmount cashInMoneyAmount = (com.paypal.oslo.feature.cashin.domain.model.CashInMoneyAmount) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, cashInMoneyAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, cashInMoneyAmount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.formatted, cashInMoneyAmount.formatted);
    }

    public final com.paypal.oslo.feature.cashin.domain.model.CashInMoneyAmount copy(java.lang.String currencyCode, java.math.BigDecimal value, java.lang.String formatted) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatted, "");
        return new com.paypal.oslo.feature.cashin.domain.model.CashInMoneyAmount(currencyCode, value, formatted);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFormatted() {
        return this.formatted;
    }

    /* renamed from: component2, reason: from getter */
    public final java.math.BigDecimal getValue() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cashin.domain.model.CashInMoneyAmount copy$default(com.paypal.oslo.feature.cashin.domain.model.CashInMoneyAmount cashInMoneyAmount, java.lang.String str, java.math.BigDecimal bigDecimal, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cashInMoneyAmount.currencyCode;
        }
        if ((i & 2) != 0) {
            bigDecimal = cashInMoneyAmount.value;
        }
        if ((i & 4) != 0) {
            str2 = cashInMoneyAmount.formatted;
        }
        return cashInMoneyAmount.copy(str, bigDecimal, str2);
    }
}
