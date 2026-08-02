package com.paypal.oslo.feature.cryptocurrency.ui.details.components;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00068\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/components/PriceDisplayData;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* data */ class PriceDisplayData {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final boolean getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final java.lang.String Camera2StreamConfigurationMap;

    public PriceDisplayData(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoFpsRanges = str3;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str3 = this.getHighSpeedVideoFpsRanges;
        boolean z = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PriceDisplayData(Camera2StreamConfigurationMap=");
        sb.append(str);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(str2);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(str3);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.Camera2StreamConfigurationMap.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.components.PriceDisplayData)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.details.components.PriceDisplayData priceDisplayData = (com.paypal.oslo.feature.cryptocurrency.ui.details.components.PriceDisplayData) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, priceDisplayData.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, priceDisplayData.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, priceDisplayData.getHighSpeedVideoFpsRanges) && this.getHighSpeedVideoFpsRangesFor == priceDisplayData.getHighSpeedVideoFpsRangesFor;
    }
}
