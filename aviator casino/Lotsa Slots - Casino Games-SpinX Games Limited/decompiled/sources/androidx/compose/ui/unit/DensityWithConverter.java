package androidx.compose.ui.unit;

/* compiled from: AndroidDensity.android.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÂ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u0018*\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u0019*\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/unit/DensityWithConverter;", "Landroidx/compose/ui/unit/Density;", "density", "", "fontScale", "converter", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "(FFLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V", "getDensity", "()F", "getFontScale", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "toSp", "toSp-0xMU5do", "(F)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DensityWithConverter implements androidx.compose.ui.unit.Density {
    private final androidx.compose.ui.unit.fontscaling.FontScaleConverter converter;
    private final float density;
    private final float fontScale;

    /* renamed from: component3, reason: from getter */
    private final androidx.compose.ui.unit.fontscaling.FontScaleConverter getConverter() {
        return this.converter;
    }

    public static /* synthetic */ androidx.compose.ui.unit.DensityWithConverter copy$default(androidx.compose.ui.unit.DensityWithConverter densityWithConverter, float f, float f2, androidx.compose.ui.unit.fontscaling.FontScaleConverter fontScaleConverter, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = densityWithConverter.density;
        }
        if ((i & 2) != 0) {
            f2 = densityWithConverter.fontScale;
        }
        if ((i & 4) != 0) {
            fontScaleConverter = densityWithConverter.converter;
        }
        return densityWithConverter.copy(f, f2, fontScaleConverter);
    }

    /* renamed from: component1, reason: from getter */
    public final float getDensity() {
        return this.density;
    }

    /* renamed from: component2, reason: from getter */
    public final float getFontScale() {
        return this.fontScale;
    }

    public final androidx.compose.ui.unit.DensityWithConverter copy(float density, float fontScale, androidx.compose.ui.unit.fontscaling.FontScaleConverter converter) {
        return new androidx.compose.ui.unit.DensityWithConverter(density, fontScale, converter);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.unit.DensityWithConverter)) {
            return false;
        }
        androidx.compose.ui.unit.DensityWithConverter densityWithConverter = (androidx.compose.ui.unit.DensityWithConverter) other;
        return java.lang.Float.compare(this.density, densityWithConverter.density) == 0 && java.lang.Float.compare(this.fontScale, densityWithConverter.fontScale) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.converter, densityWithConverter.converter);
    }

    public int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.density) * 31) + java.lang.Float.floatToIntBits(this.fontScale)) * 31) + this.converter.hashCode();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo308roundToPxR2X_6o(long j) {
        return androidx.compose.ui.unit.Density.CC.m4442$default$roundToPxR2X_6o(this, j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo309roundToPx0680j_4(float f) {
        return androidx.compose.ui.unit.Density.CC.m4443$default$roundToPx0680j_4(this, f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo311toDpu2uoSUM(float f) {
        return androidx.compose.ui.unit.Density.CC.m4444$default$toDpu2uoSUM(this, f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo312toDpu2uoSUM(int i) {
        return androidx.compose.ui.unit.Density.CC.m4445$default$toDpu2uoSUM((androidx.compose.ui.unit.Density) this, i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo313toDpSizekrfVVM(long j) {
        return androidx.compose.ui.unit.Density.CC.m4446$default$toDpSizekrfVVM(this, j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo314toPxR2X_6o(long j) {
        return androidx.compose.ui.unit.Density.CC.m4447$default$toPxR2X_6o(this, j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo315toPx0680j_4(float f) {
        return androidx.compose.ui.unit.Density.CC.m4448$default$toPx0680j_4(this, f);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
        return androidx.compose.ui.unit.Density.CC.$default$toRect(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo316toSizeXkaWNTQ(long j) {
        return androidx.compose.ui.unit.Density.CC.m4449$default$toSizeXkaWNTQ(this, j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo318toSpkPz2Gy4(float f) {
        return androidx.compose.ui.unit.Density.CC.m4450$default$toSpkPz2Gy4(this, f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo319toSpkPz2Gy4(int i) {
        return androidx.compose.ui.unit.Density.CC.m4451$default$toSpkPz2Gy4((androidx.compose.ui.unit.Density) this, i);
    }

    public java.lang.String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }

    public DensityWithConverter(float f, float f2, androidx.compose.ui.unit.fontscaling.FontScaleConverter fontScaleConverter) {
        this.density = f;
        this.fontScale = f2;
        this.converter = fontScaleConverter;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo317toSp0xMU5do(float f) {
        return androidx.compose.ui.unit.TextUnitKt.getSp(this.converter.convertDpToSp(f));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo310toDpGaN1DYA(long j) {
        if (!androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(androidx.compose.ui.unit.TextUnit.m4672getTypeUIouoOA(j), androidx.compose.ui.unit.TextUnitType.INSTANCE.m4706getSpUIouoOA())) {
            throw new java.lang.IllegalStateException("Only Sp can convert to Px".toString());
        }
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(this.converter.convertSpToDp(androidx.compose.ui.unit.TextUnit.m4673getValueimpl(j)));
    }
}
