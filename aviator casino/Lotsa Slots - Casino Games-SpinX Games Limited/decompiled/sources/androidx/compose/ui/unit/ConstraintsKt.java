package androidx.compose.ui.unit;

/* compiled from: Constraints.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u000b\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u001a\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001e\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u001e\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Constraints", "Landroidx/compose/ui/unit/Constraints;", com.helpshift.proactive.InAppViewConstants.MIN_WIDTH, "", com.helpshift.proactive.InAppViewConstants.MAX_WIDTH, com.helpshift.proactive.InAppViewConstants.MIN_HEIGHT, com.helpshift.proactive.InAppViewConstants.MAX_HEIGHT, "(IIII)J", "addMaxWithMinimum", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "value", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "offset", com.helpshift.proactive.InAppViewConstants.ORIENTATION_HORIZONTAL, com.helpshift.proactive.InAppViewConstants.ORIENTATION_VERTICAL, "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConstraintsKt {
    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    public static final long Constraints(int i, int i2, int i3, int i4) {
        if (i2 < i) {
            throw new java.lang.IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        }
        if (i4 < i3) {
            throw new java.lang.IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        if (i < 0 || i3 < 0) {
            throw new java.lang.IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
        }
        return androidx.compose.ui.unit.Constraints.INSTANCE.m4431createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m4436constrainN9IONVI(long j, long j2) {
        return Constraints(kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j2), androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j)), kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j2), androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j)), kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j2), androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j)), kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j2), androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j)));
    }

    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m4435constrain4WqzIAM(long j, long j2) {
        return androidx.compose.ui.unit.IntSizeKt.IntSize(kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j2), androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j)), kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j2), androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j)));
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m4438constrainWidthK40F9xA(long j, int i) {
        return kotlin.ranges.RangesKt.coerceIn(i, androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j));
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m4437constrainHeightK40F9xA(long j, int i) {
        return kotlin.ranges.RangesKt.coerceIn(i, androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j));
    }

    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m4439isSatisfiedBy4WqzIAM(long j, long j2) {
        int m4426getMinWidthimpl = androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j);
        int m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j);
        int m4652getWidthimpl = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j2);
        if (m4426getMinWidthimpl <= m4652getWidthimpl && m4652getWidthimpl <= m4424getMaxWidthimpl) {
            int m4425getMinHeightimpl = androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j);
            int m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j);
            int m4651getHeightimpl = androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j2);
            if (m4425getMinHeightimpl <= m4651getHeightimpl && m4651getHeightimpl <= m4423getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m4441offsetNN6EwU$default(long j, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m4440offsetNN6EwU(j, i, i2);
    }

    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m4440offsetNN6EwU(long j, int i, int i2) {
        return Constraints(kotlin.ranges.RangesKt.coerceAtLeast(androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j) + i, 0), addMaxWithMinimum(androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j), i), kotlin.ranges.RangesKt.coerceAtLeast(androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j) + i2, 0), addMaxWithMinimum(androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j), i2));
    }

    private static final int addMaxWithMinimum(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : kotlin.ranges.RangesKt.coerceAtLeast(i + i2, 0);
    }
}
