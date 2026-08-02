package com.paypal.oslo.feature.savings.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageData;", "", "", "annualPercentageYield", "countryCode", "marketingNationalAverageRateMultiplierText", "marketingNationalAverageReportDate", "marketingRateEffectiveDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAnnualPercentageYield", "getCountryCode", "getMarketingNationalAverageRateMultiplierText", "getMarketingNationalAverageReportDate", "getMarketingRateEffectiveDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SavingsLandingPageData {
    public static final int $stable = 0;
    private final java.lang.String annualPercentageYield;
    private final java.lang.String countryCode;
    private final java.lang.String marketingNationalAverageRateMultiplierText;
    private final java.lang.String marketingNationalAverageReportDate;
    private final java.lang.String marketingRateEffectiveDate;

    public SavingsLandingPageData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.annualPercentageYield = str;
        this.countryCode = str2;
        this.marketingNationalAverageRateMultiplierText = str3;
        this.marketingNationalAverageReportDate = str4;
        this.marketingRateEffectiveDate = str5;
    }

    public final java.lang.String getAnnualPercentageYield() {
        return this.annualPercentageYield;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getMarketingNationalAverageRateMultiplierText() {
        return this.marketingNationalAverageRateMultiplierText;
    }

    public final java.lang.String getMarketingNationalAverageReportDate() {
        return this.marketingNationalAverageReportDate;
    }

    public final java.lang.String getMarketingRateEffectiveDate() {
        return this.marketingRateEffectiveDate;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.annualPercentageYield;
        java.lang.String str2 = this.countryCode;
        java.lang.String str3 = this.marketingNationalAverageRateMultiplierText;
        java.lang.String str4 = this.marketingNationalAverageReportDate;
        java.lang.String str5 = this.marketingRateEffectiveDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsLandingPageData(annualPercentageYield=");
        sb.append(str);
        sb.append(", countryCode=");
        sb.append(str2);
        sb.append(", marketingNationalAverageRateMultiplierText=");
        sb.append(str3);
        sb.append(", marketingNationalAverageReportDate=");
        sb.append(str4);
        sb.append(", marketingRateEffectiveDate=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.annualPercentageYield;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.countryCode;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.marketingNationalAverageRateMultiplierText;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.marketingNationalAverageReportDate;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.marketingRateEffectiveDate;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageData)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageData savingsLandingPageData = (com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.annualPercentageYield, savingsLandingPageData.annualPercentageYield) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, savingsLandingPageData.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.marketingNationalAverageRateMultiplierText, savingsLandingPageData.marketingNationalAverageRateMultiplierText) && kotlin.jvm.internal.Intrinsics.areEqual(this.marketingNationalAverageReportDate, savingsLandingPageData.marketingNationalAverageReportDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.marketingRateEffectiveDate, savingsLandingPageData.marketingRateEffectiveDate);
    }

    public final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageData copy(java.lang.String annualPercentageYield, java.lang.String countryCode, java.lang.String marketingNationalAverageRateMultiplierText, java.lang.String marketingNationalAverageReportDate, java.lang.String marketingRateEffectiveDate) {
        return new com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageData(annualPercentageYield, countryCode, marketingNationalAverageRateMultiplierText, marketingNationalAverageReportDate, marketingRateEffectiveDate);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getMarketingRateEffectiveDate() {
        return this.marketingRateEffectiveDate;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMarketingNationalAverageReportDate() {
        return this.marketingNationalAverageReportDate;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMarketingNationalAverageRateMultiplierText() {
        return this.marketingNationalAverageRateMultiplierText;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAnnualPercentageYield() {
        return this.annualPercentageYield;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageData copy$default(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageData savingsLandingPageData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = savingsLandingPageData.annualPercentageYield;
        }
        if ((i & 2) != 0) {
            str2 = savingsLandingPageData.countryCode;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = savingsLandingPageData.marketingNationalAverageRateMultiplierText;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = savingsLandingPageData.marketingNationalAverageReportDate;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = savingsLandingPageData.marketingRateEffectiveDate;
        }
        return savingsLandingPageData.copy(str, str6, str7, str8, str5);
    }
}
