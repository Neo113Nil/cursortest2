package com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\"\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "activeCurrencyType", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PRIMARY_CURRENCY, "", "primaryCurrencyCountryCode", "secondaryCurrency", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "getActiveCurrencyType", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getPrimaryCurrency", "Ljava/lang/String;", "getPrimaryCurrencyCountryCode", "getSecondaryCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurrencyPickerData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType activeCurrencyType;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount primaryCurrency;
    private final java.lang.String primaryCurrencyCountryCode;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount secondaryCurrency;

    public CurrencyPickerData(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, java.lang.String str, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyType, "");
        this.activeCurrencyType = currencyType;
        this.primaryCurrency = moneyAmount;
        this.primaryCurrencyCountryCode = str;
        this.secondaryCurrency = moneyAmount2;
    }

    public /* synthetic */ CurrencyPickerData(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, java.lang.String str, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH : currencyType, (i & 2) != 0 ? null : moneyAmount, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : moneyAmount2);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType getActiveCurrencyType() {
        return this.activeCurrencyType;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getPrimaryCurrency() {
        return this.primaryCurrency;
    }

    public final java.lang.String getPrimaryCurrencyCountryCode() {
        return this.primaryCurrencyCountryCode;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getSecondaryCurrency() {
        return this.secondaryCurrency;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType = this.activeCurrencyType;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.primaryCurrency;
        java.lang.String str = this.primaryCurrencyCountryCode;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = this.secondaryCurrency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyPickerData(activeCurrencyType=");
        sb.append(currencyType);
        sb.append(", primaryCurrency=");
        sb.append(moneyAmount);
        sb.append(", primaryCurrencyCountryCode=");
        sb.append(str);
        sb.append(", secondaryCurrency=");
        sb.append(moneyAmount2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.activeCurrencyType.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.primaryCurrency;
        int hashCode2 = moneyAmount == null ? 0 : moneyAmount.hashCode();
        java.lang.String str = this.primaryCurrencyCountryCode;
        int hashCode3 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = this.secondaryCurrency;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (moneyAmount2 != null ? moneyAmount2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData currencyPickerData = (com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData) other;
        return this.activeCurrencyType == currencyPickerData.activeCurrencyType && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrency, currencyPickerData.primaryCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyCountryCode, currencyPickerData.primaryCurrencyCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryCurrency, currencyPickerData.secondaryCurrency);
    }

    public final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData copy(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType activeCurrencyType, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount primaryCurrency, java.lang.String primaryCurrencyCountryCode, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount secondaryCurrency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeCurrencyType, "");
        return new com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData(activeCurrencyType, primaryCurrency, primaryCurrencyCountryCode, secondaryCurrency);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getSecondaryCurrency() {
        return this.secondaryCurrency;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPrimaryCurrencyCountryCode() {
        return this.primaryCurrencyCountryCode;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getPrimaryCurrency() {
        return this.primaryCurrency;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType getActiveCurrencyType() {
        return this.activeCurrencyType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData copy$default(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData currencyPickerData, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, java.lang.String str, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            currencyType = currencyPickerData.activeCurrencyType;
        }
        if ((i & 2) != 0) {
            moneyAmount = currencyPickerData.primaryCurrency;
        }
        if ((i & 4) != 0) {
            str = currencyPickerData.primaryCurrencyCountryCode;
        }
        if ((i & 8) != 0) {
            moneyAmount2 = currencyPickerData.secondaryCurrency;
        }
        return currencyPickerData.copy(currencyType, moneyAmount, str, moneyAmount2);
    }

    public CurrencyPickerData() {
        this(null, null, null, null, 15, null);
    }
}
