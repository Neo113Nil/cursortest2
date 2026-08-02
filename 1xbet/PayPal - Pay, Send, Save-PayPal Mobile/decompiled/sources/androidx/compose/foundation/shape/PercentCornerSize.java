package androidx.compose.foundation.shape;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/shape/PercentCornerSize;", "Landroidx/compose/foundation/shape/CornerSize;", "Landroidx/compose/ui/platform/InspectableValue;", "", "p0", "<init>", "(F)V", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/Density;", "p1", "toPx-TmRCtEA", "(JLandroidx/compose/ui/unit/Density;)F", "toPx", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class PercentCornerSize implements androidx.compose.foundation.shape.CornerSize, androidx.compose.ui.platform.InspectableValue {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    public PercentCornerSize(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
        if (f < 0.0f || f > 100.0f) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public final float mo1966toPxTmRCtEA(long p0, androidx.compose.ui.unit.Density p1) {
        return androidx.compose.ui.geometry.Size.m5820getMinDimensionimpl(p0) * (this.getHighSpeedVideoFpsRangesFor / 100.0f);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CornerSize(size = ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("%)");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.platform.InspectableValue
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public java.lang.String getValueOverride() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append('%');
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.foundation.shape.PercentCornerSize) && java.lang.Float.compare(this.getHighSpeedVideoFpsRangesFor, ((androidx.compose.foundation.shape.PercentCornerSize) p0).getHighSpeedVideoFpsRangesFor) == 0;
    }
}
