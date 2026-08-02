package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\r\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0010\u001a\u00020\t*\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0014\u0010$\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/ui/unit/DensityWithConverter;", "Landroidx/compose/ui/unit/Density;", "", "p0", "p1", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "p2", "<init>", "(FFLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toSp-0xMU5do", "(F)J", "toSp", "toDp-GaN1DYA", "(J)F", "toDp", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDensity", "()F", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getFontScale", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class DensityWithConverter implements androidx.compose.ui.unit.Density {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.unit.fontscaling.FontScaleConverter getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float getHighResolutionOutputSizeshNQ4ISI;

    public DensityWithConverter(float f, float f2, androidx.compose.ui.unit.fontscaling.FontScaleConverter fontScaleConverter) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighSpeedVideoFpsRanges = fontScaleConverter;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity, reason: from getter */
    public final float getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: getFontScale, reason: from getter */
    public final float getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public final long mo1420toSp0xMU5do(float f) {
        return androidx.compose.ui.unit.TextUnitKt.getSp(this.getHighSpeedVideoFpsRanges.convertDpToSp(f));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public final float mo1413toDpGaN1DYA(long j) {
        if (!androidx.compose.ui.unit.TextUnitType.m8823equalsimpl0(androidx.compose.ui.unit.TextUnit.m8794getTypeUIouoOA(j), androidx.compose.ui.unit.TextUnitType.INSTANCE.m8828getSpUIouoOA())) {
            throw new java.lang.IllegalStateException("Only Sp can convert to Px".toString());
        }
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(this.getHighSpeedVideoFpsRanges.convertSpToDp(androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j)));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DensityWithConverter(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Float.hashCode(this.getHighResolutionOutputSizeshNQ4ISI) * 31) + java.lang.Float.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.ui.unit.DensityWithConverter)) {
            return false;
        }
        androidx.compose.ui.unit.DensityWithConverter densityWithConverter = (androidx.compose.ui.unit.DensityWithConverter) p0;
        return java.lang.Float.compare(this.getHighResolutionOutputSizeshNQ4ISI, densityWithConverter.getHighResolutionOutputSizeshNQ4ISI) == 0 && java.lang.Float.compare(this.getHighSpeedVideoFpsRangesFor, densityWithConverter.getHighSpeedVideoFpsRangesFor) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, densityWithConverter.getHighSpeedVideoFpsRanges);
    }
}
