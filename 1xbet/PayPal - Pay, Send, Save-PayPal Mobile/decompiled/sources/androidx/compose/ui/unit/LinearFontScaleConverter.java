package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/unit/LinearFontScaleConverter;", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "", "p0", "<init>", "(F)V", "convertSpToDp", "(F)F", "convertDpToSp", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class LinearFontScaleConverter implements androidx.compose.ui.unit.fontscaling.FontScaleConverter {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    public LinearFontScaleConverter(float f) {
        this.Camera2StreamConfigurationMap = f;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float convertSpToDp(float p0) {
        return p0 * this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public final float convertDpToSp(float p0) {
        return p0 / this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinearFontScaleConverter(Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.ui.unit.LinearFontScaleConverter) && java.lang.Float.compare(this.Camera2StreamConfigurationMap, ((androidx.compose.ui.unit.LinearFontScaleConverter) p0).Camera2StreamConfigurationMap) == 0;
    }
}
