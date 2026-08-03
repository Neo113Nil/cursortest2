package androidx.compose.foundation.layout;

/* compiled from: RowColumnImpl.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rB\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000fJ;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010 \u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b$\u0010\"J\u0013\u0010%\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u000fJ\u001b\u0010'\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\rJ\u0010\u0010)\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0012\u0010\u0006\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0012\u0010\u0004\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0015\u0088\u0001\u000e\u0092\u0001\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "mainAxisMin", "", "mainAxisMax", "crossAxisMin", "crossAxisMax", "constructor-impl", "(IIII)J", "c", "Landroidx/compose/ui/unit/Constraints;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "value", "(J)J", "getCrossAxisMax-impl", "(J)I", "getCrossAxisMin-impl", "getMainAxisMax-impl", "getMainAxisMin-impl", "J", "copy", "copy-yUG9Ft0", "(JIIII)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", com.helpshift.proactive.InAppViewConstants.MAX_HEIGHT, "maxHeight-impl", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)I", com.helpshift.proactive.InAppViewConstants.MAX_WIDTH, "maxWidth-impl", "stretchCrossAxis", "stretchCrossAxis-q4ezo7Y", "toBoxConstraints", "toBoxConstraints-OenEA2s", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.layout.OrientationIndependentConstraints m534boximpl(long j) {
        return new androidx.compose.foundation.layout.OrientationIndependentConstraints(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m536constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m540equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.layout.OrientationIndependentConstraints) && androidx.compose.ui.unit.Constraints.m4417equalsimpl0(j, ((androidx.compose.foundation.layout.OrientationIndependentConstraints) obj).getValue());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m541equalsimpl0(long j, long j2) {
        return androidx.compose.ui.unit.Constraints.m4417equalsimpl0(j, j2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m546hashCodeimpl(long j) {
        return androidx.compose.ui.unit.Constraints.m4427hashCodeimpl(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m551toStringimpl(long j) {
        return "OrientationIndependentConstraints(value=" + ((java.lang.Object) androidx.compose.ui.unit.Constraints.m4429toStringimpl(j)) + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return m540equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m546hashCodeimpl(this.value);
    }

    public java.lang.String toString() {
        return m551toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    private /* synthetic */ OrientationIndependentConstraints(long j) {
        this.value = j;
    }

    /* renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m545getMainAxisMinimpl(long j) {
        return androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j);
    }

    /* renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m544getMainAxisMaximpl(long j) {
        return androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j);
    }

    /* renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m543getCrossAxisMinimpl(long j) {
        return androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j);
    }

    /* renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m542getCrossAxisMaximpl(long j) {
        return androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m535constructorimpl(int i, int i2, int i3, int i4) {
        return m536constructorimpl(androidx.compose.ui.unit.ConstraintsKt.Constraints(i, i2, i3, i4));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m537constructorimpl(long j, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation) {
        return m535constructorimpl(layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j) : androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) : androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j), layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j) : androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal ? androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) : androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m550toBoxConstraintsOenEA2s(long j, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation) {
        if (layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            return androidx.compose.ui.unit.ConstraintsKt.Constraints(androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j));
        }
        return androidx.compose.ui.unit.ConstraintsKt.Constraints(androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j), androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j));
    }

    /* renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m548maxWidthimpl(long j, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation) {
        if (layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            return androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j);
        }
        return androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j);
    }

    /* renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m547maxHeightimpl(long j, androidx.compose.foundation.layout.LayoutOrientation layoutOrientation) {
        if (layoutOrientation == androidx.compose.foundation.layout.LayoutOrientation.Horizontal) {
            return androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j);
        }
        return androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j);
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m538copyyUG9Ft0(long j, int i, int i2, int i3, int i4) {
        return m535constructorimpl(i, i2, i3, i4);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m549stretchCrossAxisq4ezo7Y(long j) {
        return m535constructorimpl(androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) != Integer.MAX_VALUE ? androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) : androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j));
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m539copyyUG9Ft0$default(long j, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j);
        }
        return m538copyyUG9Ft0(j, i6, i7, i8, i4);
    }
}
