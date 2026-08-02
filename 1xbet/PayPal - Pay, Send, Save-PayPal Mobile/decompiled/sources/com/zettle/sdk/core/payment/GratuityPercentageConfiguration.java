package com.zettle.sdk.core.payment;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\f8\u0007X\u0087D¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/core/payment/GratuityPercentageConfiguration;", "", "", "gratuityAmountMaxPercentage", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/core/payment/GratuityPercentageConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "maxPercentage", com.visa.cbp.getEncExpo.warmup, "getMaxPercentage", "minPercentage", "getMinPercentage"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GratuityPercentageConfiguration {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final int maxPercentage;
    private final int minPercentage = 1;

    public GratuityPercentageConfiguration(java.lang.String str) {
        java.lang.Integer intOrNull;
        this.getHighSpeedVideoFpsRanges = str;
        this.maxPercentage = (str == null || (intOrNull = kotlin.text.StringsKt.toIntOrNull(str)) == null) ? 50 : intOrNull.intValue();
    }

    public final int getMinPercentage() {
        return this.minPercentage;
    }

    public final int getMaxPercentage() {
        return this.maxPercentage;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GratuityPercentageConfiguration(getHighSpeedVideoFpsRanges=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.sdk.core.payment.GratuityPercentageConfiguration) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, ((com.zettle.sdk.core.payment.GratuityPercentageConfiguration) other).getHighSpeedVideoFpsRanges);
    }

    public final com.zettle.sdk.core.payment.GratuityPercentageConfiguration copy(java.lang.String gratuityAmountMaxPercentage) {
        return new com.zettle.sdk.core.payment.GratuityPercentageConfiguration(gratuityAmountMaxPercentage);
    }

    public static /* synthetic */ com.zettle.sdk.core.payment.GratuityPercentageConfiguration copy$default(com.zettle.sdk.core.payment.GratuityPercentageConfiguration gratuityPercentageConfiguration, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = gratuityPercentageConfiguration.getHighSpeedVideoFpsRanges;
        }
        return gratuityPercentageConfiguration.copy(str);
    }
}
