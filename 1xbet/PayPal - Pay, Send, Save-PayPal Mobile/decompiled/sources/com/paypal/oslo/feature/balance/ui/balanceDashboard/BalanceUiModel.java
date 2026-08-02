package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0015J\u009a\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b\u0007\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b\b\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b\t\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b3\u0010\u0019R\u001a\u0010\f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b4\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b5\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b8\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b9\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceUiModel;", "", "", "availableAmountValue", "availableAmountCurrencyCode", "formattedAvailableBalance", "", "isEstimated", "isTransferAvailable", "isNegativeBalance", "hasMultipleCurrencies", "hasMoneyOnHold", "hasTaxOnHold", "formattedReservedAmount", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "taxOnHoldAmount", "moneyOnHoldAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PRIMARY_CURRENCY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZLjava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZLjava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAvailableAmountValue", "getAvailableAmountCurrencyCode", "getFormattedAvailableBalance", "Z", "getHasMultipleCurrencies", "getHasMoneyOnHold", "getHasTaxOnHold", "getFormattedReservedAmount", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getTaxOnHoldAmount", "getMoneyOnHoldAmount", "getPrimaryCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BalanceUiModel {
    public static final int $stable = 0;
    private final java.lang.String availableAmountCurrencyCode;
    private final java.lang.String availableAmountValue;
    private final java.lang.String formattedAvailableBalance;
    private final java.lang.String formattedReservedAmount;
    private final boolean hasMoneyOnHold;
    private final boolean hasMultipleCurrencies;
    private final boolean hasTaxOnHold;
    private final boolean isEstimated;
    private final boolean isNegativeBalance;
    private final boolean isTransferAvailable;
    private final com.paypal.oslo.feature.balance.domain.model.Money moneyOnHoldAmount;
    private final java.lang.String primaryCurrency;
    private final com.paypal.oslo.feature.balance.domain.model.Money taxOnHoldAmount;

    public BalanceUiModel(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, java.lang.String str4, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.availableAmountValue = str;
        this.availableAmountCurrencyCode = str2;
        this.formattedAvailableBalance = str3;
        this.isEstimated = z;
        this.isTransferAvailable = z2;
        this.isNegativeBalance = z3;
        this.hasMultipleCurrencies = z4;
        this.hasMoneyOnHold = z5;
        this.hasTaxOnHold = z6;
        this.formattedReservedAmount = str4;
        this.taxOnHoldAmount = money;
        this.moneyOnHoldAmount = money2;
        this.primaryCurrency = str5;
    }

    public final java.lang.String getAvailableAmountValue() {
        return this.availableAmountValue;
    }

    public final java.lang.String getAvailableAmountCurrencyCode() {
        return this.availableAmountCurrencyCode;
    }

    public final java.lang.String getFormattedAvailableBalance() {
        return this.formattedAvailableBalance;
    }

    public final boolean isEstimated() {
        return this.isEstimated;
    }

    public final boolean isTransferAvailable() {
        return this.isTransferAvailable;
    }

    public final boolean isNegativeBalance() {
        return this.isNegativeBalance;
    }

    public final boolean getHasMultipleCurrencies() {
        return this.hasMultipleCurrencies;
    }

    public final boolean getHasMoneyOnHold() {
        return this.hasMoneyOnHold;
    }

    public final boolean getHasTaxOnHold() {
        return this.hasTaxOnHold;
    }

    public final java.lang.String getFormattedReservedAmount() {
        return this.formattedReservedAmount;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getTaxOnHoldAmount() {
        return this.taxOnHoldAmount;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getMoneyOnHoldAmount() {
        return this.moneyOnHoldAmount;
    }

    public final java.lang.String getPrimaryCurrency() {
        return this.primaryCurrency;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.availableAmountValue;
        java.lang.String str2 = this.availableAmountCurrencyCode;
        java.lang.String str3 = this.formattedAvailableBalance;
        boolean z = this.isEstimated;
        boolean z2 = this.isTransferAvailable;
        boolean z3 = this.isNegativeBalance;
        boolean z4 = this.hasMultipleCurrencies;
        boolean z5 = this.hasMoneyOnHold;
        boolean z6 = this.hasTaxOnHold;
        java.lang.String str4 = this.formattedReservedAmount;
        com.paypal.oslo.feature.balance.domain.model.Money money = this.taxOnHoldAmount;
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.moneyOnHoldAmount;
        java.lang.String str5 = this.primaryCurrency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceUiModel(availableAmountValue=");
        sb.append(str);
        sb.append(", availableAmountCurrencyCode=");
        sb.append(str2);
        sb.append(", formattedAvailableBalance=");
        sb.append(str3);
        sb.append(", isEstimated=");
        sb.append(z);
        sb.append(", isTransferAvailable=");
        sb.append(z2);
        sb.append(", isNegativeBalance=");
        sb.append(z3);
        sb.append(", hasMultipleCurrencies=");
        sb.append(z4);
        sb.append(", hasMoneyOnHold=");
        sb.append(z5);
        sb.append(", hasTaxOnHold=");
        sb.append(z6);
        sb.append(", formattedReservedAmount=");
        sb.append(str4);
        sb.append(", taxOnHoldAmount=");
        sb.append(money);
        sb.append(", moneyOnHoldAmount=");
        sb.append(money2);
        sb.append(", primaryCurrency=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.availableAmountValue.hashCode();
        int hashCode2 = this.availableAmountCurrencyCode.hashCode();
        int hashCode3 = this.formattedAvailableBalance.hashCode();
        int hashCode4 = java.lang.Boolean.hashCode(this.isEstimated);
        int hashCode5 = java.lang.Boolean.hashCode(this.isTransferAvailable);
        int hashCode6 = java.lang.Boolean.hashCode(this.isNegativeBalance);
        int hashCode7 = java.lang.Boolean.hashCode(this.hasMultipleCurrencies);
        int hashCode8 = java.lang.Boolean.hashCode(this.hasMoneyOnHold);
        int hashCode9 = java.lang.Boolean.hashCode(this.hasTaxOnHold);
        java.lang.String str = this.formattedReservedAmount;
        int hashCode10 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.balance.domain.model.Money money = this.taxOnHoldAmount;
        int hashCode11 = money == null ? 0 : money.hashCode();
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.moneyOnHoldAmount;
        int hashCode12 = money2 == null ? 0 : money2.hashCode();
        java.lang.String str2 = this.primaryCurrency;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.availableAmountValue, balanceUiModel.availableAmountValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableAmountCurrencyCode, balanceUiModel.availableAmountCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAvailableBalance, balanceUiModel.formattedAvailableBalance) && this.isEstimated == balanceUiModel.isEstimated && this.isTransferAvailable == balanceUiModel.isTransferAvailable && this.isNegativeBalance == balanceUiModel.isNegativeBalance && this.hasMultipleCurrencies == balanceUiModel.hasMultipleCurrencies && this.hasMoneyOnHold == balanceUiModel.hasMoneyOnHold && this.hasTaxOnHold == balanceUiModel.hasTaxOnHold && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedReservedAmount, balanceUiModel.formattedReservedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxOnHoldAmount, balanceUiModel.taxOnHoldAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyOnHoldAmount, balanceUiModel.moneyOnHoldAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrency, balanceUiModel.primaryCurrency);
    }

    public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel copy(java.lang.String availableAmountValue, java.lang.String availableAmountCurrencyCode, java.lang.String formattedAvailableBalance, boolean isEstimated, boolean isTransferAvailable, boolean isNegativeBalance, boolean hasMultipleCurrencies, boolean hasMoneyOnHold, boolean hasTaxOnHold, java.lang.String formattedReservedAmount, com.paypal.oslo.feature.balance.domain.model.Money taxOnHoldAmount, com.paypal.oslo.feature.balance.domain.model.Money moneyOnHoldAmount, java.lang.String primaryCurrency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmountValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmountCurrencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAvailableBalance, "");
        return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel(availableAmountValue, availableAmountCurrencyCode, formattedAvailableBalance, isEstimated, isTransferAvailable, isNegativeBalance, hasMultipleCurrencies, hasMoneyOnHold, hasTaxOnHold, formattedReservedAmount, taxOnHoldAmount, moneyOnHoldAmount, primaryCurrency);
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasTaxOnHold() {
        return this.hasTaxOnHold;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasMoneyOnHold() {
        return this.hasMoneyOnHold;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasMultipleCurrencies() {
        return this.hasMultipleCurrencies;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsNegativeBalance() {
        return this.isNegativeBalance;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsTransferAvailable() {
        return this.isTransferAvailable;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEstimated() {
        return this.isEstimated;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFormattedAvailableBalance() {
        return this.formattedAvailableBalance;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAvailableAmountCurrencyCode() {
        return this.availableAmountCurrencyCode;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getPrimaryCurrency() {
        return this.primaryCurrency;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getMoneyOnHoldAmount() {
        return this.moneyOnHoldAmount;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getTaxOnHoldAmount() {
        return this.taxOnHoldAmount;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getFormattedReservedAmount() {
        return this.formattedReservedAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAvailableAmountValue() {
        return this.availableAmountValue;
    }
}
