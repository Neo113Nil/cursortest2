package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/core/auth/PaymentInfoImpl;", "Lcom/zettle/sdk/core/auth/User$PaymentInfo;", "Lcom/zettle/sdk/core/payment/GratuityPercentageConfiguration;", "p0", "<init>", "(Lcom/zettle/sdk/core/payment/GratuityPercentageConfiguration;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/core/payment/GratuityPercentageConfiguration;", "getGratuityPercentageConfiguration", "()Lcom/zettle/sdk/core/payment/GratuityPercentageConfiguration;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class PaymentInfoImpl implements com.zettle.sdk.core.auth.User.PaymentInfo {
    private final com.zettle.sdk.core.payment.GratuityPercentageConfiguration getHighSpeedVideoFpsRanges;

    public PaymentInfoImpl(com.zettle.sdk.core.payment.GratuityPercentageConfiguration gratuityPercentageConfiguration) {
        this.getHighSpeedVideoFpsRanges = gratuityPercentageConfiguration;
    }

    @Override // com.zettle.sdk.core.auth.User.PaymentInfo
    /* renamed from: getGratuityPercentageConfiguration, reason: from getter */
    public final com.zettle.sdk.core.payment.GratuityPercentageConfiguration getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        com.zettle.sdk.core.payment.GratuityPercentageConfiguration getHighSpeedVideoFpsRanges = getGetHighSpeedVideoFpsRanges();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentInfoImpl(getHighSpeedVideoFpsRanges=");
        sb.append(getHighSpeedVideoFpsRanges);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        if (getGetHighSpeedVideoFpsRanges() == null) {
            return 0;
        }
        return getGetHighSpeedVideoFpsRanges().hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof com.zettle.sdk.core.auth.PaymentInfoImpl) && kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoFpsRanges(), ((com.zettle.sdk.core.auth.PaymentInfoImpl) p0).getGetHighSpeedVideoFpsRanges());
    }
}
