package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u0002BC\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0015\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010&R\u001a\u0010\t\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\f\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u0010\u001dR\u0014\u00101\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010*"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Interpolatable;", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "Landroidx/compose/ui/geometry/Offset;", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "radius", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "t", "lerp", "(Ljava/lang/Object;F)Ljava/lang/Object;", "Ljava/util/List;", "getColors$ui_graphics", "()Ljava/util/List;", "getStops$ui_graphics", "J", "getCenter-F1C5BW0$ui_graphics", "()J", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getRadius$ui_graphics", "()F", com.visa.cbp.getEncExpo.warmup, "getTileMode-3opZhB0$ui_graphics", "getIntrinsicSize-NH-jbRc", "intrinsicSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadialGradient extends androidx.compose.ui.graphics.ShaderBrush implements androidx.compose.ui.graphics.Interpolatable {
    public static final int $stable = 0;
    private final long center;
    private final java.util.List<androidx.compose.ui.graphics.Color> colors;
    private final float radius;
    private final java.util.List<java.lang.Float> stops;
    private final int tileMode;

    private RadialGradient(java.util.List<androidx.compose.ui.graphics.Color> list, java.util.List<java.lang.Float> list2, long j, float f, int i) {
        this.colors = list;
        this.stops = list2;
        this.center = j;
        this.radius = f;
        this.tileMode = i;
    }

    public final java.util.List<androidx.compose.ui.graphics.Color> getColors$ui_graphics() {
        return this.colors;
    }

    public final java.util.List<java.lang.Float> getStops$ui_graphics() {
        return this.stops;
    }

    /* renamed from: getCenter-F1C5BW0$ui_graphics, reason: not valid java name and from getter */
    public final long getCenter() {
        return this.center;
    }

    /* renamed from: getRadius$ui_graphics, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    public /* synthetic */ RadialGradient(java.util.List list, java.util.List list2, long j, float f, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, f, (i2 & 16) != 0 ? androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0() : i, null);
    }

    /* renamed from: getTileMode-3opZhB0$ui_graphics, reason: not valid java name and from getter */
    public final int getTileMode() {
        return this.tileMode;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        if ((java.lang.Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) < 2139095040) {
            float f = this.radius * 2.0f;
            return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
        }
        return androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public final android.graphics.Shader mo5965createShaderuvyYCjk(long size) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j = this.center;
        if ((9223372034707292159L & j) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            long m5831getCenteruvyYCjk = androidx.compose.ui.geometry.SizeKt.m5831getCenteruvyYCjk(size);
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m5831getCenteruvyYCjk >> 32));
            intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (m5831getCenteruvyYCjk & 4294967295L));
        } else {
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (java.lang.Float.intBitsToFloat((int) (j >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.center >> 32));
            intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (java.lang.Float.intBitsToFloat((int) (this.center & 4294967295L)) == Float.POSITIVE_INFINITY ? size & 4294967295L : this.center & 4294967295L));
        }
        java.util.List<androidx.compose.ui.graphics.Color> list = this.colors;
        java.util.List<java.lang.Float> list2 = this.stops;
        long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(intBitsToFloat2)));
        float f = this.radius;
        return androidx.compose.ui.graphics.ShaderKt.m6312RadialGradientShader8uybcMk(m5744constructorimpl, f == Float.POSITIVE_INFINITY ? androidx.compose.ui.geometry.Size.m5820getMinDimensionimpl(size) / 2.0f : f, list, list2, this.tileMode);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.RadialGradient)) {
            return false;
        }
        androidx.compose.ui.graphics.RadialGradient radialGradient = (androidx.compose.ui.graphics.RadialGradient) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.colors, radialGradient.colors) && kotlin.jvm.internal.Intrinsics.areEqual(this.stops, radialGradient.stops) && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.center, radialGradient.center) && this.radius == radialGradient.radius && androidx.compose.ui.graphics.TileMode.m6357equalsimpl0(this.tileMode, radialGradient.tileMode);
    }

    public final int hashCode() {
        int hashCode = this.colors.hashCode();
        java.util.List<java.lang.Float> list = this.stops;
        return (((((((hashCode * 31) + (list != null ? list.hashCode() : 0)) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.center)) * 31) + java.lang.Float.hashCode(this.radius)) * 31) + androidx.compose.ui.graphics.TileMode.m6358hashCodeimpl(this.tileMode);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = "";
        if ((this.center & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("center=");
            sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.center));
            sb.append(", ");
            str = sb.toString();
        } else {
            str = "";
        }
        if ((java.lang.Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) < 2139095040) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("radius=");
            sb2.append(this.radius);
            sb2.append(", ");
            str2 = sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("RadialGradient(colors=");
        sb3.append(this.colors);
        sb3.append(", stops=");
        sb3.append(this.stops);
        sb3.append(", ");
        sb3.append(str);
        sb3.append(str2);
        sb3.append("tileMode=");
        sb3.append((java.lang.Object) androidx.compose.ui.graphics.TileMode.m6359toStringimpl(this.tileMode));
        sb3.append(')');
        return sb3.toString();
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public final java.lang.Object lerp(java.lang.Object other, float t) {
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (other == null) {
            other = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), defaultConstructorMarker);
        }
        if (other instanceof androidx.compose.ui.graphics.SolidColor) {
            java.util.List<androidx.compose.ui.graphics.Color> list = this.colors;
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).m6006unboximpl();
                arrayList.add(androidx.compose.ui.graphics.Color.m5986boximpl(((androidx.compose.ui.graphics.SolidColor) other).getValue()));
            }
            other = new androidx.compose.ui.graphics.RadialGradient(arrayList, this.stops, this.center, this.radius, this.tileMode, null);
        }
        if (!(other instanceof androidx.compose.ui.graphics.RadialGradient)) {
            return null;
        }
        androidx.compose.ui.graphics.RadialGradient radialGradient = (androidx.compose.ui.graphics.RadialGradient) other;
        return new androidx.compose.ui.graphics.RadialGradient(androidx.compose.ui.graphics.BrushKt.lerpColorList(this.colors, radialGradient.colors, t), androidx.compose.ui.graphics.BrushKt.lerpNullableFloatList(this.stops, radialGradient.stops, t), androidx.compose.ui.geometry.OffsetKt.m5775lerpWko1d7g(this.center, radialGradient.center, t), androidx.compose.ui.util.MathHelpersKt.lerp(this.radius, radialGradient.radius, t), t < 0.5f ? this.tileMode : radialGradient.tileMode, null);
    }

    public /* synthetic */ RadialGradient(java.util.List list, java.util.List list2, long j, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, f, i);
    }
}
