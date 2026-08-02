package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/core/navigation/ui/BottomNavAnimationState;", "", "", "p0", "p1", "p2", "<init>", "(FFF)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class BottomNavAnimationState {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final float Camera2StreamConfigurationMap;
    final float getHighSpeedVideoFpsRangesFor;

    public BottomNavAnimationState(float f, float f2, float f3) {
        this.getHighSpeedVideoFpsRangesFor = f;
        this.Camera2StreamConfigurationMap = f2;
        this.getHighSpeedVideoFpsRanges = f3;
    }

    public final java.lang.String toString() {
        float f = this.getHighSpeedVideoFpsRangesFor;
        float f2 = this.Camera2StreamConfigurationMap;
        float f3 = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BottomNavAnimationState(getHighSpeedVideoFpsRangesFor=");
        sb.append(f);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(f2);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(f3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Float.hashCode(this.getHighSpeedVideoFpsRangesFor) * 31) + java.lang.Float.hashCode(this.Camera2StreamConfigurationMap)) * 31) + java.lang.Float.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.core.navigation.ui.BottomNavAnimationState)) {
            return false;
        }
        com.paypal.oslo.core.navigation.ui.BottomNavAnimationState bottomNavAnimationState = (com.paypal.oslo.core.navigation.ui.BottomNavAnimationState) p0;
        return java.lang.Float.compare(this.getHighSpeedVideoFpsRangesFor, bottomNavAnimationState.getHighSpeedVideoFpsRangesFor) == 0 && java.lang.Float.compare(this.Camera2StreamConfigurationMap, bottomNavAnimationState.Camera2StreamConfigurationMap) == 0 && java.lang.Float.compare(this.getHighSpeedVideoFpsRanges, bottomNavAnimationState.getHighSpeedVideoFpsRanges) == 0;
    }
}
