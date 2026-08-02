package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/model/ConversionRateResult;", "", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONVERSION_RATE, "", "exchangeRatePoints", "exchangeRateAmount", "currencyCode", "", "pointsAvailable", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()D", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()I", "copy", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/model/ConversionRateResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "D", "getConversionRate", "Ljava/lang/String;", "getExchangeRatePoints", "getExchangeRateAmount", "getCurrencyCode", com.visa.cbp.getEncExpo.warmup, "getPointsAvailable"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConversionRateResult {
    public static final int $stable = 0;
    private final double conversionRate;
    private final java.lang.String currencyCode;
    private final java.lang.String exchangeRateAmount;
    private final java.lang.String exchangeRatePoints;
    private final int pointsAvailable;

    public ConversionRateResult(double d, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.conversionRate = d;
        this.exchangeRatePoints = str;
        this.exchangeRateAmount = str2;
        this.currencyCode = str3;
        this.pointsAvailable = i;
    }

    public final double getConversionRate() {
        return this.conversionRate;
    }

    public final java.lang.String getExchangeRatePoints() {
        return this.exchangeRatePoints;
    }

    public final java.lang.String getExchangeRateAmount() {
        return this.exchangeRateAmount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final int getPointsAvailable() {
        return this.pointsAvailable;
    }

    public final java.lang.String toString() {
        double d = this.conversionRate;
        java.lang.String str = this.exchangeRatePoints;
        java.lang.String str2 = this.exchangeRateAmount;
        java.lang.String str3 = this.currencyCode;
        int i = this.pointsAvailable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConversionRateResult(conversionRate=");
        sb.append(d);
        sb.append(", exchangeRatePoints=");
        sb.append(str);
        sb.append(", exchangeRateAmount=");
        sb.append(str2);
        sb.append(", currencyCode=");
        sb.append(str3);
        sb.append(", pointsAvailable=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Double.hashCode(this.conversionRate) * 31) + this.exchangeRatePoints.hashCode()) * 31) + this.exchangeRateAmount.hashCode()) * 31) + this.currencyCode.hashCode()) * 31) + java.lang.Integer.hashCode(this.pointsAvailable);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.ConversionRateResult)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.ConversionRateResult conversionRateResult = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.ConversionRateResult) other;
        return java.lang.Double.compare(this.conversionRate, conversionRateResult.conversionRate) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRatePoints, conversionRateResult.exchangeRatePoints) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRateAmount, conversionRateResult.exchangeRateAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, conversionRateResult.currencyCode) && this.pointsAvailable == conversionRateResult.pointsAvailable;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.ConversionRateResult copy(double conversionRate, java.lang.String exchangeRatePoints, java.lang.String exchangeRateAmount, java.lang.String currencyCode, int pointsAvailable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRatePoints, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.ConversionRateResult(conversionRate, exchangeRatePoints, exchangeRateAmount, currencyCode, pointsAvailable);
    }

    /* renamed from: component5, reason: from getter */
    public final int getPointsAvailable() {
        return this.pointsAvailable;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExchangeRateAmount() {
        return this.exchangeRateAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getExchangeRatePoints() {
        return this.exchangeRatePoints;
    }

    /* renamed from: component1, reason: from getter */
    public final double getConversionRate() {
        return this.conversionRate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.ConversionRateResult copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.ConversionRateResult conversionRateResult, double d, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            d = conversionRateResult.conversionRate;
        }
        double d2 = d;
        if ((i2 & 2) != 0) {
            str = conversionRateResult.exchangeRatePoints;
        }
        java.lang.String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = conversionRateResult.exchangeRateAmount;
        }
        java.lang.String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = conversionRateResult.currencyCode;
        }
        java.lang.String str6 = str3;
        if ((i2 & 16) != 0) {
            i = conversionRateResult.pointsAvailable;
        }
        return conversionRateResult.copy(d2, str4, str5, str6, i);
    }
}
