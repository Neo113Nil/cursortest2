package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b'\u0010&"}, d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Interpolatable;", "Landroidx/compose/ui/geometry/Offset;", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "t", "lerp", "(Ljava/lang/Object;F)Ljava/lang/Object;", "J", "getCenter-F1C5BW0$ui_graphics", "()J", "Ljava/util/List;", "getColors$ui_graphics", "()Ljava/util/List;", "getStops$ui_graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SweepGradient extends androidx.compose.ui.graphics.ShaderBrush implements androidx.compose.ui.graphics.Interpolatable {
    public static final int $stable = 0;
    private final long center;
    private final java.util.List<androidx.compose.ui.graphics.Color> colors;
    private final java.util.List<java.lang.Float> stops;

    private SweepGradient(long j, java.util.List<androidx.compose.ui.graphics.Color> list, java.util.List<java.lang.Float> list2) {
        this.center = j;
        this.colors = list;
        this.stops = list2;
    }

    public /* synthetic */ SweepGradient(long j, java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i & 4) != 0 ? null : list2, null);
    }

    /* renamed from: getCenter-F1C5BW0$ui_graphics, reason: not valid java name and from getter */
    public final long getCenter() {
        return this.center;
    }

    public final java.util.List<androidx.compose.ui.graphics.Color> getColors$ui_graphics() {
        return this.colors;
    }

    public final java.util.List<java.lang.Float> getStops$ui_graphics() {
        return this.stops;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public final android.graphics.Shader mo5965createShaderuvyYCjk(long size) {
        long m5744constructorimpl;
        long j = this.center;
        if ((9223372034707292159L & j) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            m5744constructorimpl = androidx.compose.ui.geometry.SizeKt.m5831getCenteruvyYCjk(size);
        } else {
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (java.lang.Float.intBitsToFloat((int) (j >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.center >> 32));
            if (java.lang.Float.intBitsToFloat((int) (this.center & 4294967295L)) != Float.POSITIVE_INFINITY) {
                size = this.center;
            }
            m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (size & 4294967295L))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32));
        }
        return androidx.compose.ui.graphics.ShaderKt.m6314SweepGradientShader9KIMszo(m5744constructorimpl, this.colors, this.stops);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.SweepGradient)) {
            return false;
        }
        androidx.compose.ui.graphics.SweepGradient sweepGradient = (androidx.compose.ui.graphics.SweepGradient) other;
        return androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.center, sweepGradient.center) && kotlin.jvm.internal.Intrinsics.areEqual(this.colors, sweepGradient.colors) && kotlin.jvm.internal.Intrinsics.areEqual(this.stops, sweepGradient.stops);
    }

    public final int hashCode() {
        int m5754hashCodeimpl = androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.center);
        int hashCode = this.colors.hashCode();
        java.util.List<java.lang.Float> list = this.stops;
        return (((m5754hashCodeimpl * 31) + hashCode) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        if ((this.center & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("center=");
            sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.center));
            sb.append(", ");
            str = sb.toString();
        } else {
            str = "";
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("SweepGradient(");
        sb2.append(str);
        sb2.append("colors=");
        sb2.append(this.colors);
        sb2.append(", stops=");
        sb2.append(this.stops);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public final java.lang.Object lerp(java.lang.Object other, float t) {
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (other == null) {
            other = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), defaultConstructorMarker);
        }
        if (other instanceof androidx.compose.ui.graphics.SolidColor) {
            long j = this.center;
            java.util.List<androidx.compose.ui.graphics.Color> list = this.colors;
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).m6006unboximpl();
                arrayList.add(androidx.compose.ui.graphics.Color.m5986boximpl(((androidx.compose.ui.graphics.SolidColor) other).getValue()));
            }
            other = new androidx.compose.ui.graphics.SweepGradient(j, arrayList, this.stops, null);
        }
        if (!(other instanceof androidx.compose.ui.graphics.SweepGradient)) {
            return null;
        }
        androidx.compose.ui.graphics.SweepGradient sweepGradient = (androidx.compose.ui.graphics.SweepGradient) other;
        return new androidx.compose.ui.graphics.SweepGradient(androidx.compose.ui.geometry.OffsetKt.m5775lerpWko1d7g(this.center, sweepGradient.center, t), androidx.compose.ui.graphics.BrushKt.lerpColorList(this.colors, sweepGradient.colors, t), androidx.compose.ui.graphics.BrushKt.lerpNullableFloatList(this.stops, sweepGradient.stops, t), null);
    }

    public /* synthetic */ SweepGradient(long j, java.util.List list, java.util.List list2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, list2);
    }
}
