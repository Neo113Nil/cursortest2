package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!Jb\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0018R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u0010!R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b\u000e\u0010\u001fR\u001a\u0010\f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b:\u0010\u001c"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentConfiguration;", "", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/MerchantInfo;", "merchantInfo", "Ljava/util/Currency;", "currency", "Lcom/zettle/sdk/core/user/CurrencyCode;", "currencyId", "Lcom/zettle/sdk/core/user/CountryCode;", "countryId", "", "minAmountAllowed", "maxAmountAllowed", "", "isPinSupported", "Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimits;", "cvmLimits", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/MerchantInfo;Ljava/util/Currency;Lcom/zettle/sdk/core/user/CurrencyCode;Lcom/zettle/sdk/core/user/CountryCode;JJZLcom/zettle/sdk/feature/taptopay/core/models/CvmLimits;)V", "component1", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/MerchantInfo;", "component2", "()Ljava/util/Currency;", "component3", "()Lcom/zettle/sdk/core/user/CurrencyCode;", "component4", "()Lcom/zettle/sdk/core/user/CountryCode;", "component5", "()J", "component6", "component7", "()Z", "component8", "()Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimits;", "copy", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/MerchantInfo;Ljava/util/Currency;Lcom/zettle/sdk/core/user/CurrencyCode;Lcom/zettle/sdk/core/user/CountryCode;JJZLcom/zettle/sdk/feature/taptopay/core/models/CvmLimits;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentConfiguration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/core/user/CountryCode;", "getCountryId", "Ljava/util/Currency;", "getCurrency", "Lcom/zettle/sdk/core/user/CurrencyCode;", "getCurrencyId", "Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimits;", "getCvmLimits", "Z", "J", "getMaxAmountAllowed", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/MerchantInfo;", "getMerchantInfo", "getMinAmountAllowed"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PaymentConfiguration {
    private final com.zettle.sdk.core.user.CountryCode countryId;
    private final java.util.Currency currency;
    private final com.zettle.sdk.core.user.CurrencyCode currencyId;
    private final com.zettle.sdk.feature.taptopay.core.models.CvmLimits cvmLimits;
    private final boolean isPinSupported;
    private final long maxAmountAllowed;
    private final com.zettle.sdk.feature.taptopay.core.transaction.models.MerchantInfo merchantInfo;
    private final long minAmountAllowed;

    public PaymentConfiguration(com.zettle.sdk.feature.taptopay.core.transaction.models.MerchantInfo merchantInfo, java.util.Currency currency, com.zettle.sdk.core.user.CurrencyCode currencyCode, com.zettle.sdk.core.user.CountryCode countryCode, long j, long j2, boolean z, com.zettle.sdk.feature.taptopay.core.models.CvmLimits cvmLimits) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        this.merchantInfo = merchantInfo;
        this.currency = currency;
        this.currencyId = currencyCode;
        this.countryId = countryCode;
        this.minAmountAllowed = j;
        this.maxAmountAllowed = j2;
        this.isPinSupported = z;
        this.cvmLimits = cvmLimits;
    }

    public /* synthetic */ PaymentConfiguration(com.zettle.sdk.feature.taptopay.core.transaction.models.MerchantInfo merchantInfo, java.util.Currency currency, com.zettle.sdk.core.user.CurrencyCode currencyCode, com.zettle.sdk.core.user.CountryCode countryCode, long j, long j2, boolean z, com.zettle.sdk.feature.taptopay.core.models.CvmLimits cvmLimits, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(merchantInfo, currency, currencyCode, countryCode, j, j2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : cvmLimits);
    }

    public final com.zettle.sdk.feature.taptopay.core.transaction.models.MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    public final java.util.Currency getCurrency() {
        return this.currency;
    }

    public final com.zettle.sdk.core.user.CurrencyCode getCurrencyId() {
        return this.currencyId;
    }

    public final com.zettle.sdk.core.user.CountryCode getCountryId() {
        return this.countryId;
    }

    public final long getMinAmountAllowed() {
        return this.minAmountAllowed;
    }

    public final long getMaxAmountAllowed() {
        return this.maxAmountAllowed;
    }

    public final boolean isPinSupported() {
        return this.isPinSupported;
    }

    public final com.zettle.sdk.feature.taptopay.core.models.CvmLimits getCvmLimits() {
        return this.cvmLimits;
    }

    public final java.lang.String toString() {
        com.zettle.sdk.feature.taptopay.core.transaction.models.MerchantInfo merchantInfo = this.merchantInfo;
        java.util.Currency currency = this.currency;
        com.zettle.sdk.core.user.CurrencyCode currencyCode = this.currencyId;
        com.zettle.sdk.core.user.CountryCode countryCode = this.countryId;
        long j = this.minAmountAllowed;
        long j2 = this.maxAmountAllowed;
        boolean z = this.isPinSupported;
        com.zettle.sdk.feature.taptopay.core.models.CvmLimits cvmLimits = this.cvmLimits;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentConfiguration(merchantInfo=");
        sb.append(merchantInfo);
        sb.append(", currency=");
        sb.append(currency);
        sb.append(", currencyId=");
        sb.append(currencyCode);
        sb.append(", countryId=");
        sb.append(countryCode);
        sb.append(", minAmountAllowed=");
        sb.append(j);
        sb.append(", maxAmountAllowed=");
        sb.append(j2);
        sb.append(", isPinSupported=");
        sb.append(z);
        sb.append(", cvmLimits=");
        sb.append(cvmLimits);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.merchantInfo.hashCode();
        int hashCode2 = this.currency.hashCode();
        int hashCode3 = this.currencyId.hashCode();
        int hashCode4 = this.countryId.hashCode();
        int hashCode5 = java.lang.Long.hashCode(this.minAmountAllowed);
        int hashCode6 = java.lang.Long.hashCode(this.maxAmountAllowed);
        boolean z = this.isPinSupported;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        com.zettle.sdk.feature.taptopay.core.models.CvmLimits cvmLimits = this.cvmLimits;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i) * 31) + (cvmLimits == null ? 0 : cvmLimits.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentConfiguration)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentConfiguration paymentConfiguration = (com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantInfo, paymentConfiguration.merchantInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, paymentConfiguration.currency) && this.currencyId == paymentConfiguration.currencyId && this.countryId == paymentConfiguration.countryId && this.minAmountAllowed == paymentConfiguration.minAmountAllowed && this.maxAmountAllowed == paymentConfiguration.maxAmountAllowed && this.isPinSupported == paymentConfiguration.isPinSupported && kotlin.jvm.internal.Intrinsics.areEqual(this.cvmLimits, paymentConfiguration.cvmLimits);
    }

    public final com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentConfiguration copy(com.zettle.sdk.feature.taptopay.core.transaction.models.MerchantInfo merchantInfo, java.util.Currency currency, com.zettle.sdk.core.user.CurrencyCode currencyId, com.zettle.sdk.core.user.CountryCode countryId, long minAmountAllowed, long maxAmountAllowed, boolean isPinSupported, com.zettle.sdk.feature.taptopay.core.models.CvmLimits cvmLimits) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryId, "");
        return new com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentConfiguration(merchantInfo, currency, currencyId, countryId, minAmountAllowed, maxAmountAllowed, isPinSupported, cvmLimits);
    }

    /* renamed from: component8, reason: from getter */
    public final com.zettle.sdk.feature.taptopay.core.models.CvmLimits getCvmLimits() {
        return this.cvmLimits;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsPinSupported() {
        return this.isPinSupported;
    }

    /* renamed from: component6, reason: from getter */
    public final long getMaxAmountAllowed() {
        return this.maxAmountAllowed;
    }

    /* renamed from: component5, reason: from getter */
    public final long getMinAmountAllowed() {
        return this.minAmountAllowed;
    }

    /* renamed from: component4, reason: from getter */
    public final com.zettle.sdk.core.user.CountryCode getCountryId() {
        return this.countryId;
    }

    /* renamed from: component3, reason: from getter */
    public final com.zettle.sdk.core.user.CurrencyCode getCurrencyId() {
        return this.currencyId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.util.Currency getCurrency() {
        return this.currency;
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }
}
