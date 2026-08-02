package com.paypal.oslo.feature.savings.domain.model;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J`\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b)\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/SavingsHubData;", "", "", "annualPercentageYield", "countryCode", "", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsAccountData;", "savingsAccounts", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;", "moneyboxes", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsInterestData;", "savingsInterest", "Lcom/paypal/oslo/feature/savings/domain/model/SmartRoutePreferencesData;", "smartRoutePreferences", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/savings/domain/model/SavingsInterestData;Lcom/paypal/oslo/feature/savings/domain/model/SmartRoutePreferencesData;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/paypal/oslo/feature/savings/domain/model/SavingsInterestData;", "component6", "()Lcom/paypal/oslo/feature/savings/domain/model/SmartRoutePreferencesData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/savings/domain/model/SavingsInterestData;Lcom/paypal/oslo/feature/savings/domain/model/SmartRoutePreferencesData;)Lcom/paypal/oslo/feature/savings/domain/model/SavingsHubData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAnnualPercentageYield", "getCountryCode", "Ljava/util/List;", "getSavingsAccounts", "getMoneyboxes", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsInterestData;", "getSavingsInterest", "Lcom/paypal/oslo/feature/savings/domain/model/SmartRoutePreferencesData;", "getSmartRoutePreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SavingsHubData {
    public static final int $stable = 8;
    private final java.lang.String annualPercentageYield;
    private final java.lang.String countryCode;
    private final java.util.List<com.paypal.oslo.feature.savings.domain.model.MoneyboxData> moneyboxes;
    private final java.util.List<com.paypal.oslo.feature.savings.domain.model.SavingsAccountData> savingsAccounts;
    private final com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterest;
    private final com.paypal.oslo.feature.savings.domain.model.SmartRoutePreferencesData smartRoutePreferences;

    public SavingsHubData(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.savings.domain.model.SavingsAccountData> list, java.util.List<com.paypal.oslo.feature.savings.domain.model.MoneyboxData> list2, com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterestData, com.paypal.oslo.feature.savings.domain.model.SmartRoutePreferencesData smartRoutePreferencesData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.annualPercentageYield = str;
        this.countryCode = str2;
        this.savingsAccounts = list;
        this.moneyboxes = list2;
        this.savingsInterest = savingsInterestData;
        this.smartRoutePreferences = smartRoutePreferencesData;
    }

    public final java.lang.String getAnnualPercentageYield() {
        return this.annualPercentageYield;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.SavingsAccountData> getSavingsAccounts() {
        return this.savingsAccounts;
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.MoneyboxData> getMoneyboxes() {
        return this.moneyboxes;
    }

    public final com.paypal.oslo.feature.savings.domain.model.SavingsInterestData getSavingsInterest() {
        return this.savingsInterest;
    }

    public final com.paypal.oslo.feature.savings.domain.model.SmartRoutePreferencesData getSmartRoutePreferences() {
        return this.smartRoutePreferences;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.annualPercentageYield;
        java.lang.String str2 = this.countryCode;
        java.util.List<com.paypal.oslo.feature.savings.domain.model.SavingsAccountData> list = this.savingsAccounts;
        java.util.List<com.paypal.oslo.feature.savings.domain.model.MoneyboxData> list2 = this.moneyboxes;
        com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterestData = this.savingsInterest;
        com.paypal.oslo.feature.savings.domain.model.SmartRoutePreferencesData smartRoutePreferencesData = this.smartRoutePreferences;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsHubData(annualPercentageYield=");
        sb.append(str);
        sb.append(", countryCode=");
        sb.append(str2);
        sb.append(", savingsAccounts=");
        sb.append(list);
        sb.append(", moneyboxes=");
        sb.append(list2);
        sb.append(", savingsInterest=");
        sb.append(savingsInterestData);
        sb.append(", smartRoutePreferences=");
        sb.append(smartRoutePreferencesData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.annualPercentageYield;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.countryCode;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int hashCode3 = this.savingsAccounts.hashCode();
        int hashCode4 = this.moneyboxes.hashCode();
        com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterestData = this.savingsInterest;
        int hashCode5 = savingsInterestData == null ? 0 : savingsInterestData.hashCode();
        com.paypal.oslo.feature.savings.domain.model.SmartRoutePreferencesData smartRoutePreferencesData = this.smartRoutePreferences;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (smartRoutePreferencesData != null ? smartRoutePreferencesData.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.SavingsHubData)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData = (com.paypal.oslo.feature.savings.domain.model.SavingsHubData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.annualPercentageYield, savingsHubData.annualPercentageYield) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, savingsHubData.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccounts, savingsHubData.savingsAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxes, savingsHubData.moneyboxes) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsInterest, savingsHubData.savingsInterest) && kotlin.jvm.internal.Intrinsics.areEqual(this.smartRoutePreferences, savingsHubData.smartRoutePreferences);
    }

    public final com.paypal.oslo.feature.savings.domain.model.SavingsHubData copy(java.lang.String annualPercentageYield, java.lang.String countryCode, java.util.List<com.paypal.oslo.feature.savings.domain.model.SavingsAccountData> savingsAccounts, java.util.List<com.paypal.oslo.feature.savings.domain.model.MoneyboxData> moneyboxes, com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterest, com.paypal.oslo.feature.savings.domain.model.SmartRoutePreferencesData smartRoutePreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccounts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxes, "");
        return new com.paypal.oslo.feature.savings.domain.model.SavingsHubData(annualPercentageYield, countryCode, savingsAccounts, moneyboxes, savingsInterest, smartRoutePreferences);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.SmartRoutePreferencesData getSmartRoutePreferences() {
        return this.smartRoutePreferences;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.SavingsInterestData getSavingsInterest() {
        return this.savingsInterest;
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.MoneyboxData> component4() {
        return this.moneyboxes;
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.SavingsAccountData> component3() {
        return this.savingsAccounts;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAnnualPercentageYield() {
        return this.annualPercentageYield;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.SavingsHubData copy$default(com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterestData, com.paypal.oslo.feature.savings.domain.model.SmartRoutePreferencesData smartRoutePreferencesData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = savingsHubData.annualPercentageYield;
        }
        if ((i & 2) != 0) {
            str2 = savingsHubData.countryCode;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            list = savingsHubData.savingsAccounts;
        }
        java.util.List list3 = list;
        if ((i & 8) != 0) {
            list2 = savingsHubData.moneyboxes;
        }
        java.util.List list4 = list2;
        if ((i & 16) != 0) {
            savingsInterestData = savingsHubData.savingsInterest;
        }
        com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterestData2 = savingsInterestData;
        if ((i & 32) != 0) {
            smartRoutePreferencesData = savingsHubData.smartRoutePreferences;
        }
        return savingsHubData.copy(str, str3, list3, list4, savingsInterestData2, smartRoutePreferencesData);
    }
}
