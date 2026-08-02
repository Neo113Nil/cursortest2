package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002BC\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0015\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010&R\u001a\u0010\t\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b+\u0010*R\u001a\u0010\f\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010\u001dR\u0014\u0010/\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*"}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Interpolatable;", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "Landroidx/compose/ui/geometry/Offset;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "t", "lerp", "(Ljava/lang/Object;F)Ljava/lang/Object;", "Ljava/util/List;", "getColors$ui_graphics", "()Ljava/util/List;", "getStops$ui_graphics", "J", "getStart-F1C5BW0$ui_graphics", "()J", "getEnd-F1C5BW0$ui_graphics", com.visa.cbp.getEncExpo.warmup, "getTileMode-3opZhB0$ui_graphics", "getIntrinsicSize-NH-jbRc", "intrinsicSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinearGradient extends androidx.compose.ui.graphics.ShaderBrush implements androidx.compose.ui.graphics.Interpolatable {
    public static final int $stable = 0;
    private final java.util.List<androidx.compose.ui.graphics.Color> colors;
    private final long end;
    private final long start;
    private final java.util.List<java.lang.Float> stops;
    private final int tileMode;

    private LinearGradient(java.util.List<androidx.compose.ui.graphics.Color> list, java.util.List<java.lang.Float> list2, long j, long j2, int i) {
        this.colors = list;
        this.stops = list2;
        this.start = j;
        this.end = j2;
        this.tileMode = i;
    }

    public final java.util.List<androidx.compose.ui.graphics.Color> getColors$ui_graphics() {
        return this.colors;
    }

    public final java.util.List<java.lang.Float> getStops$ui_graphics() {
        return this.stops;
    }

    /* renamed from: getStart-F1C5BW0$ui_graphics, reason: not valid java name and from getter */
    public final long getStart() {
        return this.start;
    }

    /* renamed from: getEnd-F1C5BW0$ui_graphics, reason: not valid java name and from getter */
    public final long getEnd() {
        return this.end;
    }

    public /* synthetic */ LinearGradient(java.util.List list, java.util.List list2, long j, long j2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, j2, (i2 & 16) != 0 ? androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0() : i, null);
    }

    /* renamed from: getTileMode-3opZhB0$ui_graphics, reason: not valid java name and from getter */
    public final int getTileMode() {
        return this.tileMode;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        float f;
        float intBitsToFloat;
        float intBitsToFloat2;
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (this.start >> 32));
        float f2 = Float.NaN;
        if (!java.lang.Float.isInfinite(intBitsToFloat3) && !java.lang.Float.isNaN(intBitsToFloat3)) {
            float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (this.end >> 32));
            if (!java.lang.Float.isInfinite(intBitsToFloat4) && !java.lang.Float.isNaN(intBitsToFloat4)) {
                f = java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (this.start >> 32)) - java.lang.Float.intBitsToFloat((int) (this.end >> 32)));
                intBitsToFloat = java.lang.Float.intBitsToFloat((int) (this.start & 4294967295L));
                if (!java.lang.Float.isInfinite(intBitsToFloat) && !java.lang.Float.isNaN(intBitsToFloat)) {
                    intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (this.end & 4294967295L));
                    if (!java.lang.Float.isInfinite(intBitsToFloat2) && !java.lang.Float.isNaN(intBitsToFloat2)) {
                        f2 = java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (this.start & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (this.end & 4294967295L)));
                    }
                }
                return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
            }
        }
        f = Float.NaN;
        intBitsToFloat = java.lang.Float.intBitsToFloat((int) (this.start & 4294967295L));
        if (!java.lang.Float.isInfinite(intBitsToFloat)) {
            intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (this.end & 4294967295L));
            if (!java.lang.Float.isInfinite(intBitsToFloat2)) {
                f2 = java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (this.start & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (this.end & 4294967295L)));
            }
        }
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public final android.graphics.Shader mo5965createShaderuvyYCjk(long size) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (java.lang.Float.intBitsToFloat((int) (this.start >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.start >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (java.lang.Float.intBitsToFloat((int) (this.start & 4294967295L)) == Float.POSITIVE_INFINITY ? size & 4294967295L : this.start & 4294967295L));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (java.lang.Float.intBitsToFloat((int) (this.end >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.end >> 32));
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (java.lang.Float.intBitsToFloat((int) (this.end & 4294967295L)) == Float.POSITIVE_INFINITY ? size & 4294967295L : this.end & 4294967295L));
        return androidx.compose.ui.graphics.ShaderKt.m6310LinearGradientShaderVjE6UOU(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat3) << 32)), this.colors, this.stops, this.tileMode);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.LinearGradient)) {
            return false;
        }
        androidx.compose.ui.graphics.LinearGradient linearGradient = (androidx.compose.ui.graphics.LinearGradient) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.colors, linearGradient.colors) && kotlin.jvm.internal.Intrinsics.areEqual(this.stops, linearGradient.stops) && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.start, linearGradient.start) && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.end, linearGradient.end) && androidx.compose.ui.graphics.TileMode.m6357equalsimpl0(this.tileMode, linearGradient.tileMode);
    }

    public final int hashCode() {
        int hashCode = this.colors.hashCode();
        java.util.List<java.lang.Float> list = this.stops;
        return (((((((hashCode * 31) + (list != null ? list.hashCode() : 0)) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.start)) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.end)) * 31) + androidx.compose.ui.graphics.TileMode.m6358hashCodeimpl(this.tileMode);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = "";
        if (((((this.start & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("start=");
            sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.start));
            sb.append(", ");
            str = sb.toString();
        } else {
            str = "";
        }
        if ((((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (this.end & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("end=");
            sb2.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.end));
            sb2.append(", ");
            str2 = sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("LinearGradient(colors=");
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
        java.lang.Object solidColor = other == null ? new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), null) : other;
        if (solidColor instanceof androidx.compose.ui.graphics.SolidColor) {
            java.util.List<androidx.compose.ui.graphics.Color> list = this.colors;
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).m6006unboximpl();
                arrayList.add(androidx.compose.ui.graphics.Color.m5986boximpl(((androidx.compose.ui.graphics.SolidColor) solidColor).getValue()));
            }
            solidColor = new androidx.compose.ui.graphics.LinearGradient(arrayList, this.stops, this.start, this.end, this.tileMode, null);
        }
        if (!(solidColor instanceof androidx.compose.ui.graphics.LinearGradient)) {
            return null;
        }
        androidx.compose.ui.graphics.LinearGradient linearGradient = (androidx.compose.ui.graphics.LinearGradient) solidColor;
        return new androidx.compose.ui.graphics.LinearGradient(androidx.compose.ui.graphics.BrushKt.lerpColorList(this.colors, linearGradient.colors, t), androidx.compose.ui.graphics.BrushKt.lerpNullableFloatList(this.stops, linearGradient.stops, t), androidx.compose.ui.graphics.BrushKt.m5964lerpSafeWko1d7g(this.start, linearGradient.start, t), androidx.compose.ui.graphics.BrushKt.m5964lerpSafeWko1d7g(this.end, linearGradient.end, t), t < 0.5f ? this.tileMode : linearGradient.tileMode, null);
    }

    public /* synthetic */ LinearGradient(java.util.List list, java.util.List list2, long j, long j2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, j2, i);
    }
}
