package com.paypal.oslo.feature.mosaic.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u0004\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicEligibility;", "", "", "isSupportedOnMosaic", "isWebSupported", "isNativeSupported", "", "qualifiedIntentId", "<init>", "(ZZZLjava/lang/String;)V", "component1", "()Z", "component2", "component3", "component4", "()Ljava/lang/String;", "copy", "(ZZZLjava/lang/String;)Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicEligibility;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getQualifiedIntentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MosaicEligibility {
    public static final int $stable = 0;
    private final boolean isNativeSupported;
    private final boolean isSupportedOnMosaic;
    private final boolean isWebSupported;
    private final java.lang.String qualifiedIntentId;

    public MosaicEligibility(boolean z, boolean z2, boolean z3, java.lang.String str) {
        this.isSupportedOnMosaic = z;
        this.isWebSupported = z2;
        this.isNativeSupported = z3;
        this.qualifiedIntentId = str;
    }

    public final boolean isSupportedOnMosaic() {
        return this.isSupportedOnMosaic;
    }

    public final boolean isWebSupported() {
        return this.isWebSupported;
    }

    public final boolean isNativeSupported() {
        return this.isNativeSupported;
    }

    public final java.lang.String getQualifiedIntentId() {
        return this.qualifiedIntentId;
    }

    public final java.lang.String toString() {
        boolean z = this.isSupportedOnMosaic;
        boolean z2 = this.isWebSupported;
        boolean z3 = this.isNativeSupported;
        java.lang.String str = this.qualifiedIntentId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicEligibility(isSupportedOnMosaic=");
        sb.append(z);
        sb.append(", isWebSupported=");
        sb.append(z2);
        sb.append(", isNativeSupported=");
        sb.append(z3);
        sb.append(", qualifiedIntentId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isSupportedOnMosaic);
        int hashCode2 = java.lang.Boolean.hashCode(this.isWebSupported);
        int hashCode3 = java.lang.Boolean.hashCode(this.isNativeSupported);
        java.lang.String str = this.qualifiedIntentId;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility)) {
            return false;
        }
        com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility mosaicEligibility = (com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility) other;
        return this.isSupportedOnMosaic == mosaicEligibility.isSupportedOnMosaic && this.isWebSupported == mosaicEligibility.isWebSupported && this.isNativeSupported == mosaicEligibility.isNativeSupported && kotlin.jvm.internal.Intrinsics.areEqual(this.qualifiedIntentId, mosaicEligibility.qualifiedIntentId);
    }

    public final com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility copy(boolean isSupportedOnMosaic, boolean isWebSupported, boolean isNativeSupported, java.lang.String qualifiedIntentId) {
        return new com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility(isSupportedOnMosaic, isWebSupported, isNativeSupported, qualifiedIntentId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getQualifiedIntentId() {
        return this.qualifiedIntentId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsNativeSupported() {
        return this.isNativeSupported;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsWebSupported() {
        return this.isWebSupported;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSupportedOnMosaic() {
        return this.isSupportedOnMosaic;
    }

    public static /* synthetic */ com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility copy$default(com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility mosaicEligibility, boolean z, boolean z2, boolean z3, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = mosaicEligibility.isSupportedOnMosaic;
        }
        if ((i & 2) != 0) {
            z2 = mosaicEligibility.isWebSupported;
        }
        if ((i & 4) != 0) {
            z3 = mosaicEligibility.isNativeSupported;
        }
        if ((i & 8) != 0) {
            str = mosaicEligibility.qualifiedIntentId;
        }
        return mosaicEligibility.copy(z, z2, z3, str);
    }
}
