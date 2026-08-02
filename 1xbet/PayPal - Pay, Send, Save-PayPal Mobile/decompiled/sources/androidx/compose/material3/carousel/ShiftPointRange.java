package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/material3/carousel/ShiftPointRange;", "", "", "p0", "p1", "", "p2", "<init>", "(IIF)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class ShiftPointRange {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    public ShiftPointRange(int i, int i2, float f) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighSpeedVideoFpsRanges = f;
    }

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
    public final int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    public final int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final float getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShiftPointRange(getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.getHighSpeedVideoSizes) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + java.lang.Float.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.material3.carousel.ShiftPointRange)) {
            return false;
        }
        androidx.compose.material3.carousel.ShiftPointRange shiftPointRange = (androidx.compose.material3.carousel.ShiftPointRange) p0;
        return this.getHighSpeedVideoSizes == shiftPointRange.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRangesFor == shiftPointRange.getHighSpeedVideoFpsRangesFor && java.lang.Float.compare(this.getHighSpeedVideoFpsRanges, shiftPointRange.getHighSpeedVideoFpsRanges) == 0;
    }
}
