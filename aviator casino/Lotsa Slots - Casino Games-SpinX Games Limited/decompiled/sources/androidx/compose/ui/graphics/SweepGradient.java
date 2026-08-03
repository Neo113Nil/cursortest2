package androidx.compose.ui.graphics;

/* compiled from: Brush.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u001e\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "center", "Landroidx/compose/ui/geometry/Offset;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "Landroidx/compose/ui/geometry/Size;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SweepGradient extends androidx.compose.ui.graphics.ShaderBrush {
    private final long center;
    private final java.util.List<androidx.compose.ui.graphics.Color> colors;
    private final java.util.List<java.lang.Float> stops;

    public /* synthetic */ SweepGradient(long j, java.util.List list, java.util.List list2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, list2);
    }

    public /* synthetic */ SweepGradient(long j, java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i & 4) != 0 ? null : list2, null);
    }

    private SweepGradient(long j, java.util.List<androidx.compose.ui.graphics.Color> list, java.util.List<java.lang.Float> list2) {
        this.center = j;
        this.colors = list;
        this.stops = list2;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public android.graphics.Shader mo2082createShaderuvyYCjk(long size) {
        long Offset;
        if (androidx.compose.ui.geometry.OffsetKt.m1892isUnspecifiedk4lQ0M(this.center)) {
            Offset = androidx.compose.ui.geometry.SizeKt.m1950getCenteruvyYCjk(size);
        } else {
            Offset = androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(this.center) == Float.POSITIVE_INFINITY ? androidx.compose.ui.geometry.Size.m1940getWidthimpl(size) : androidx.compose.ui.geometry.Offset.m1871getXimpl(this.center), androidx.compose.ui.geometry.Offset.m1872getYimpl(this.center) == Float.POSITIVE_INFINITY ? androidx.compose.ui.geometry.Size.m1937getHeightimpl(size) : androidx.compose.ui.geometry.Offset.m1872getYimpl(this.center));
        }
        return androidx.compose.ui.graphics.ShaderKt.m2440SweepGradientShader9KIMszo(Offset, this.colors, this.stops);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.SweepGradient)) {
            return false;
        }
        androidx.compose.ui.graphics.SweepGradient sweepGradient = (androidx.compose.ui.graphics.SweepGradient) other;
        return androidx.compose.ui.geometry.Offset.m1868equalsimpl0(this.center, sweepGradient.center) && kotlin.jvm.internal.Intrinsics.areEqual(this.colors, sweepGradient.colors) && kotlin.jvm.internal.Intrinsics.areEqual(this.stops, sweepGradient.stops);
    }

    public int hashCode() {
        int m1873hashCodeimpl = ((androidx.compose.ui.geometry.Offset.m1873hashCodeimpl(this.center) * 31) + this.colors.hashCode()) * 31;
        java.util.List<java.lang.Float> list = this.stops;
        return m1873hashCodeimpl + (list != null ? list.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.String str;
        if (androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((java.lang.Object) androidx.compose.ui.geometry.Offset.m1879toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }
}
