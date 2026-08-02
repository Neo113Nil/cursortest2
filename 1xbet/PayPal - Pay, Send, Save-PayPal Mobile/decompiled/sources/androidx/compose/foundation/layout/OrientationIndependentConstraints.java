package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0005J\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0016J5\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0012\u0010\u0007\u001a\u00020\u00068Ç\u0002¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0012\u0010\b\u001a\u00020\u00068Ç\u0002¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0012\u0010\t\u001a\u00020\u00068Ç\u0002¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0012\u0010\n\u001a\u00020\u00068Ç\u0002¢\u0006\u0006\u001a\u0004\b,\u0010)\u0088\u0001-\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "Landroidx/compose/ui/unit/Constraints;", "p0", "getHighSpeedVideoFpsRangesFor", "(J)J", "", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", "constructor-impl", "(IIII)J", "c", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "stretchCrossAxis-q4ezo7Y", "stretchCrossAxis", "toBoxConstraints-OenEA2s", "toBoxConstraints", "maxWidth-impl", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)I", "maxWidth", "maxHeight-impl", "maxHeight", "copy-yUG9Ft0", "(JIIII)J", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getMainAxisMin-impl", "(J)I", "getMainAxisMax-impl", "getCrossAxisMin-impl", "getCrossAxisMax-impl", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long getHighResolutionOutputSizeshNQ4ISI;

    private static long getHighSpeedVideoFpsRangesFor(long j) {
        return j;
    }

    private /* synthetic */ OrientationIndependentConstraints(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    /* renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m1690getMainAxisMinimpl(long j) {
        return androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
    }

    /* renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m1689getMainAxisMaximpl(long j) {
        return androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
    }

    /* renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m1688getCrossAxisMinimpl(long j) {
        return androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
    }

    /* renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m1687getCrossAxisMaximpl(long j) {
        return androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1681constructorimpl(int i, int i2, int i3, int i4) {
        return getHighSpeedVideoFpsRangesFor(androidx.compose.ui.unit.ConstraintsKt.Constraints(i, i2, i3, i4));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1682constructorimpl(long j, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation) {
        return m1681constructorimpl(layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j) : androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) : androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j), layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j) : androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) : androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m1695toBoxConstraintsOenEA2s(long j, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation) {
        if (layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            return androidx.compose.ui.unit.ConstraintsKt.Constraints(androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j));
        }
        return androidx.compose.ui.unit.ConstraintsKt.Constraints(androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j), androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j));
    }

    /* renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m1693maxWidthimpl(long j, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation) {
        if (layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            return androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        }
        return androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
    }

    /* renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m1692maxHeightimpl(long j, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation) {
        if (layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            return androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
        }
        return androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m1683copyyUG9Ft0(long j, int i, int i2, int i3, int i4) {
        return m1681constructorimpl(i, i2, i3, i4);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m1694stretchCrossAxisq4ezo7Y(long j) {
        return m1681constructorimpl(androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) != Integer.MAX_VALUE ? androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) : androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j));
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m1684copyyUG9Ft0$default(long j, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
        }
        return m1683copyyUG9Ft0(j, i6, i7, i8, i4);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        return m1696toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return m1691hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m1685equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1696toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OrientationIndependentConstraints(value=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Constraints.m8559toStringimpl(j));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1691hashCodeimpl(long j) {
        return androidx.compose.ui.unit.Constraints.m8557hashCodeimpl(j);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1686equalsimpl0(long j, long j2) {
        return androidx.compose.ui.unit.Constraints.m8548equalsimpl0(j, j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1685equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.layout.OrientationIndependentConstraints) && androidx.compose.ui.unit.Constraints.m8548equalsimpl0(j, ((androidx.compose.foundation.layout.OrientationIndependentConstraints) obj).getGetHighResolutionOutputSizeshNQ4ISI());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.layout.OrientationIndependentConstraints m1680boximpl(long j) {
        return new androidx.compose.foundation.layout.OrientationIndependentConstraints(j);
    }
}
