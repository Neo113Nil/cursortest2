package com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/ui/DateComponents;", "", "", "p0", "p1", "p2", "<init>", "(III)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class DateComponents {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final int getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final int getHighSpeedVideoFpsRanges;

    public DateComponents(int i, int i2, int i3) {
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoSizes = i3;
    }

    public final java.lang.String toString() {
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.Camera2StreamConfigurationMap;
        int i3 = this.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DateComponents(getHighSpeedVideoFpsRanges=");
        sb.append(i);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(i2);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRanges) * 31) + java.lang.Integer.hashCode(this.Camera2StreamConfigurationMap)) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateComponents)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateComponents dateComponents = (com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateComponents) p0;
        return this.getHighSpeedVideoFpsRanges == dateComponents.getHighSpeedVideoFpsRanges && this.Camera2StreamConfigurationMap == dateComponents.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes == dateComponents.getHighSpeedVideoSizes;
    }
}
