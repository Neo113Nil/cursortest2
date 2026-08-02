package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressRestrictions;", "", "", "p0", "p1", "p2", "<init>", "(ZZZ)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class AddressRestrictions {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final boolean Camera2StreamConfigurationMap;

    public AddressRestrictions(boolean z, boolean z2, boolean z3) {
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = z2;
        this.getHighSpeedVideoFpsRanges = z3;
    }

    public final java.lang.String toString() {
        boolean z = this.Camera2StreamConfigurationMap;
        boolean z2 = this.getHighSpeedVideoSizes;
        boolean z3 = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressRestrictions(Camera2StreamConfigurationMap=");
        sb.append(z);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(z2);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes)) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressRestrictions)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressRestrictions addressRestrictions = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressRestrictions) p0;
        return this.Camera2StreamConfigurationMap == addressRestrictions.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes == addressRestrictions.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRanges == addressRestrictions.getHighSpeedVideoFpsRanges;
    }
}
