package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/CurrencyExchangeRate;", "", "", "titleDisplayTextResId", "", "", "currencyExchangeRateValues", "<init>", "(ILjava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/paypal/oslo/feature/activity/domain/detail/models/CurrencyExchangeRate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleDisplayTextResId", "Ljava/util/List;", "getCurrencyExchangeRateValues"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CurrencyExchangeRate {
    public static final int $stable = 8;
    private final java.util.List<java.lang.String> currencyExchangeRateValues;
    private final int titleDisplayTextResId;

    public CurrencyExchangeRate(int i, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.titleDisplayTextResId = i;
        this.currencyExchangeRateValues = list;
    }

    public final int getTitleDisplayTextResId() {
        return this.titleDisplayTextResId;
    }

    public final java.util.List<java.lang.String> getCurrencyExchangeRateValues() {
        return this.currencyExchangeRateValues;
    }

    public final java.lang.String toString() {
        int i = this.titleDisplayTextResId;
        java.util.List<java.lang.String> list = this.currencyExchangeRateValues;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyExchangeRate(titleDisplayTextResId=");
        sb.append(i);
        sb.append(", currencyExchangeRateValues=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.titleDisplayTextResId) * 31) + this.currencyExchangeRateValues.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.CurrencyExchangeRate)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.CurrencyExchangeRate currencyExchangeRate = (com.paypal.oslo.feature.activity.domain.detail.models.CurrencyExchangeRate) other;
        return this.titleDisplayTextResId == currencyExchangeRate.titleDisplayTextResId && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyExchangeRateValues, currencyExchangeRate.currencyExchangeRateValues);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.CurrencyExchangeRate copy(int titleDisplayTextResId, java.util.List<java.lang.String> currencyExchangeRateValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyExchangeRateValues, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.CurrencyExchangeRate(titleDisplayTextResId, currencyExchangeRateValues);
    }

    public final java.util.List<java.lang.String> component2() {
        return this.currencyExchangeRateValues;
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitleDisplayTextResId() {
        return this.titleDisplayTextResId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.CurrencyExchangeRate copy$default(com.paypal.oslo.feature.activity.domain.detail.models.CurrencyExchangeRate currencyExchangeRate, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = currencyExchangeRate.titleDisplayTextResId;
        }
        if ((i2 & 2) != 0) {
            list = currencyExchangeRate.currencyExchangeRateValues;
        }
        return currencyExchangeRate.copy(i, list);
    }
}
