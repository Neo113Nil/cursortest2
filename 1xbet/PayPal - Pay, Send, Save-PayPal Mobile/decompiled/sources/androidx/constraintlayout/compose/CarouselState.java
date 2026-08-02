package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0013\u001a\u00020\u00028\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0016\u001a\u00020\u00048\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"Landroidx/constraintlayout/compose/CarouselState;", "", "Landroidx/constraintlayout/compose/MotionCarouselDirection;", "p0", "", "p1", "p2", "", "p3", "p4", "<init>", "(Landroidx/constraintlayout/compose/MotionCarouselDirection;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Z", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroidx/constraintlayout/compose/MotionCarouselDirection;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class CarouselState {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    androidx.constraintlayout.compose.MotionCarouselDirection getHighSpeedVideoFpsRanges;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    int getHighSpeedVideoFpsRangesFor = 0;
    public int getHighSpeedVideoSizes = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public boolean Camera2StreamConfigurationMap = false;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    public boolean getHighResolutionOutputSizeshNQ4ISI = false;

    public CarouselState(androidx.constraintlayout.compose.MotionCarouselDirection motionCarouselDirection) {
        this.getHighSpeedVideoFpsRanges = motionCarouselDirection;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CarouselState(getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.getHighSpeedVideoFpsRanges.hashCode() * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoSizes)) * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap)) * 31) + java.lang.Boolean.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.constraintlayout.compose.CarouselState)) {
            return false;
        }
        androidx.constraintlayout.compose.CarouselState carouselState = (androidx.constraintlayout.compose.CarouselState) p0;
        return this.getHighSpeedVideoFpsRanges == carouselState.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoFpsRangesFor == carouselState.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes == carouselState.getHighSpeedVideoSizes && this.Camera2StreamConfigurationMap == carouselState.Camera2StreamConfigurationMap && this.getHighResolutionOutputSizeshNQ4ISI == carouselState.getHighResolutionOutputSizeshNQ4ISI;
    }
}
