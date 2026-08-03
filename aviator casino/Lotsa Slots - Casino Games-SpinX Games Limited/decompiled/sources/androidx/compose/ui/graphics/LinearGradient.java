package androidx.compose.ui.graphics;

/* compiled from: Brush.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LinearGradient extends androidx.compose.ui.graphics.ShaderBrush {
    private final java.util.List<androidx.compose.ui.graphics.Color> colors;
    private final long end;
    private final long start;
    private final java.util.List<java.lang.Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(java.util.List list, java.util.List list2, long j, long j2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, j2, i);
    }

    public /* synthetic */ LinearGradient(java.util.List list, java.util.List list2, long j, long j2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, j2, (i2 & 16) != 0 ? androidx.compose.ui.graphics.TileMode.INSTANCE.m2494getClamp3opZhB0() : i, null);
    }

    private LinearGradient(java.util.List<androidx.compose.ui.graphics.Color> list, java.util.List<java.lang.Float> list2, long j, long j2, int i) {
        this.colors = list;
        this.stops = list2;
        this.start = j;
        this.end = j2;
        this.tileMode = i;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        float f;
        float m1872getYimpl;
        float m1872getYimpl2;
        float m1871getXimpl = androidx.compose.ui.geometry.Offset.m1871getXimpl(this.start);
        float f2 = Float.NaN;
        if (!java.lang.Float.isInfinite(m1871getXimpl) && !java.lang.Float.isNaN(m1871getXimpl)) {
            float m1871getXimpl2 = androidx.compose.ui.geometry.Offset.m1871getXimpl(this.end);
            if (!java.lang.Float.isInfinite(m1871getXimpl2) && !java.lang.Float.isNaN(m1871getXimpl2)) {
                f = java.lang.Math.abs(androidx.compose.ui.geometry.Offset.m1871getXimpl(this.start) - androidx.compose.ui.geometry.Offset.m1871getXimpl(this.end));
                m1872getYimpl = androidx.compose.ui.geometry.Offset.m1872getYimpl(this.start);
                if (!java.lang.Float.isInfinite(m1872getYimpl) && !java.lang.Float.isNaN(m1872getYimpl)) {
                    m1872getYimpl2 = androidx.compose.ui.geometry.Offset.m1872getYimpl(this.end);
                    if (!java.lang.Float.isInfinite(m1872getYimpl2) && !java.lang.Float.isNaN(m1872getYimpl2)) {
                        f2 = java.lang.Math.abs(androidx.compose.ui.geometry.Offset.m1872getYimpl(this.start) - androidx.compose.ui.geometry.Offset.m1872getYimpl(this.end));
                    }
                }
                return androidx.compose.ui.geometry.SizeKt.Size(f, f2);
            }
        }
        f = Float.NaN;
        m1872getYimpl = androidx.compose.ui.geometry.Offset.m1872getYimpl(this.start);
        if (!java.lang.Float.isInfinite(m1872getYimpl)) {
            m1872getYimpl2 = androidx.compose.ui.geometry.Offset.m1872getYimpl(this.end);
            if (!java.lang.Float.isInfinite(m1872getYimpl2)) {
                f2 = java.lang.Math.abs(androidx.compose.ui.geometry.Offset.m1872getYimpl(this.start) - androidx.compose.ui.geometry.Offset.m1872getYimpl(this.end));
            }
        }
        return androidx.compose.ui.geometry.SizeKt.Size(f, f2);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public android.graphics.Shader mo2082createShaderuvyYCjk(long size) {
        return androidx.compose.ui.graphics.ShaderKt.m2436LinearGradientShaderVjE6UOU(androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(this.start) == Float.POSITIVE_INFINITY ? androidx.compose.ui.geometry.Size.m1940getWidthimpl(size) : androidx.compose.ui.geometry.Offset.m1871getXimpl(this.start), androidx.compose.ui.geometry.Offset.m1872getYimpl(this.start) == Float.POSITIVE_INFINITY ? androidx.compose.ui.geometry.Size.m1937getHeightimpl(size) : androidx.compose.ui.geometry.Offset.m1872getYimpl(this.start)), androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(this.end) == Float.POSITIVE_INFINITY ? androidx.compose.ui.geometry.Size.m1940getWidthimpl(size) : androidx.compose.ui.geometry.Offset.m1871getXimpl(this.end), androidx.compose.ui.geometry.Offset.m1872getYimpl(this.end) == Float.POSITIVE_INFINITY ? androidx.compose.ui.geometry.Size.m1937getHeightimpl(size) : androidx.compose.ui.geometry.Offset.m1872getYimpl(this.end)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.LinearGradient)) {
            return false;
        }
        androidx.compose.ui.graphics.LinearGradient linearGradient = (androidx.compose.ui.graphics.LinearGradient) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.colors, linearGradient.colors) && kotlin.jvm.internal.Intrinsics.areEqual(this.stops, linearGradient.stops) && androidx.compose.ui.geometry.Offset.m1868equalsimpl0(this.start, linearGradient.start) && androidx.compose.ui.geometry.Offset.m1868equalsimpl0(this.end, linearGradient.end) && androidx.compose.ui.graphics.TileMode.m2490equalsimpl0(this.tileMode, linearGradient.tileMode);
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        java.util.List<java.lang.Float> list = this.stops;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + androidx.compose.ui.geometry.Offset.m1873hashCodeimpl(this.start)) * 31) + androidx.compose.ui.geometry.Offset.m1873hashCodeimpl(this.end)) * 31) + androidx.compose.ui.graphics.TileMode.m2491hashCodeimpl(this.tileMode);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = "";
        if (androidx.compose.ui.geometry.OffsetKt.m1888isFinitek4lQ0M(this.start)) {
            str = "start=" + ((java.lang.Object) androidx.compose.ui.geometry.Offset.m1879toStringimpl(this.start)) + ", ";
        } else {
            str = "";
        }
        if (androidx.compose.ui.geometry.OffsetKt.m1888isFinitek4lQ0M(this.end)) {
            str2 = "end=" + ((java.lang.Object) androidx.compose.ui.geometry.Offset.m1879toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((java.lang.Object) androidx.compose.ui.graphics.TileMode.m2492toStringimpl(this.tileMode)) + ')';
    }
}
