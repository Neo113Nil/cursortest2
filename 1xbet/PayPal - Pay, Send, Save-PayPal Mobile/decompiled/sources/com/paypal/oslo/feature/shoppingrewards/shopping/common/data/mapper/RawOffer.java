package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/data/mapper/RawOffer;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/Integer;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class RawOffer {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final java.lang.Integer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoSizes;

    public RawOffer(java.lang.Integer num, java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoFpsRangesFor = num;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = str2;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str = this.getHighSpeedVideoSizes;
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RawOffer(getHighSpeedVideoFpsRangesFor=");
        sb.append(num);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(str);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.getHighSpeedVideoFpsRangesFor;
        int hashCode = num == null ? 0 : num.hashCode();
        java.lang.String str = this.getHighSpeedVideoSizes;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.data.mapper.RawOffer)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.shopping.common.data.mapper.RawOffer rawOffer = (com.paypal.oslo.feature.shoppingrewards.shopping.common.data.mapper.RawOffer) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, rawOffer.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, rawOffer.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, rawOffer.getHighSpeedVideoFpsRanges);
    }
}
