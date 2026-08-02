package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0010\u001a\u0019\u0010\u0017\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0017\u001a\u00020\u0018*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u0016\u001a\u0019\u0010\u001d\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010 \u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u001c\u001a\u0019\u0010$\u001a\u00020!*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#\u001a%\u0010)\u001a\u00020\u000e*\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u0000¢\u0006\u0004\b'\u0010(\"\u001a\u0010+\u001a\u00020*8\u0000X\u0080T¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010."}, d2 = {"", "widthVal", "heightVal", "", "throwInvalidConstraintException", "(II)V", io.ktor.http.ContentDisposition.Parameters.Size, "", "throwInvalidConstraintsSizeException", "(I)Ljava/lang/Void;", "minWidth", "maxWidth", "minHeight", "maxHeight", "Landroidx/compose/ui/unit/Constraints;", "createConstraints", "(IIII)J", "bitsNeedForSizeUnchecked", "(I)I", androidx.constraintlayout.widget.Constraints.TAG, "otherConstraints", "constrain-N9IONVI", "(JJ)J", "constrain", "Landroidx/compose/ui/unit/IntSize;", "constrain-4WqzIAM", "width", "constrainWidth-K40F9xA", "(JI)I", "constrainWidth", "height", "constrainHeight-K40F9xA", "constrainHeight", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "isSatisfiedBy", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "offset", "", "MaxDimensionsAndFocusMask", "J", "getMaxDimensionsAndFocusMask$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConstraintsKt {
    public static final long MaxDimensionsAndFocusMask = -8589934589L;

    public static final int bitsNeedForSizeUnchecked(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static /* synthetic */ void getMaxDimensionsAndFocusMask$annotations() {
    }

    public static final void throwInvalidConstraintException(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't represent a width of ");
        sb.append(i);
        sb.append(" and height of ");
        sb.append(i2);
        sb.append(" in Constraints");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final java.lang.Void throwInvalidConstraintsSizeException(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't represent a size of ");
        sb.append(i);
        sb.append(" in Constraints");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final long createConstraints(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int bitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int bitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i6);
        if (bitsNeedForSizeUnchecked + bitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = bitsNeedForSizeUnchecked2 - 13;
        return androidx.compose.ui.unit.Constraints.m8543constructorimpl((((~(i7 >> 31)) & i7) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (bitsNeedForSizeUnchecked2 + 2)) | (((~(i8 >> 31)) & i8) << (bitsNeedForSizeUnchecked2 + 33)));
    }

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

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m8569constrainN9IONVI(long j, long j2) {
        int m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        int m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
        int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
        int m8556getMinWidthimpl2 = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j2);
        if (m8556getMinWidthimpl2 < m8556getMinWidthimpl) {
            m8556getMinWidthimpl2 = m8556getMinWidthimpl;
        }
        if (m8556getMinWidthimpl2 > m8554getMaxWidthimpl) {
            m8556getMinWidthimpl2 = m8554getMaxWidthimpl;
        }
        int m8554getMaxWidthimpl2 = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j2);
        if (m8554getMaxWidthimpl2 >= m8556getMinWidthimpl) {
            m8556getMinWidthimpl = m8554getMaxWidthimpl2;
        }
        if (m8556getMinWidthimpl <= m8554getMaxWidthimpl) {
            m8554getMaxWidthimpl = m8556getMinWidthimpl;
        }
        int m8555getMinHeightimpl2 = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j2);
        if (m8555getMinHeightimpl2 < m8555getMinHeightimpl) {
            m8555getMinHeightimpl2 = m8555getMinHeightimpl;
        }
        if (m8555getMinHeightimpl2 > m8553getMaxHeightimpl) {
            m8555getMinHeightimpl2 = m8553getMaxHeightimpl;
        }
        int m8553getMaxHeightimpl2 = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j2);
        if (m8553getMaxHeightimpl2 >= m8555getMinHeightimpl) {
            m8555getMinHeightimpl = m8553getMaxHeightimpl2;
        }
        if (m8555getMinHeightimpl <= m8553getMaxHeightimpl) {
            m8553getMaxHeightimpl = m8555getMinHeightimpl;
        }
        return Constraints(m8556getMinWidthimpl2, m8554getMaxWidthimpl, m8555getMinHeightimpl2, m8553getMaxHeightimpl);
    }

    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m8568constrain4WqzIAM(long j, long j2) {
        int i = (int) (j2 >> 32);
        int m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        if (i < m8556getMinWidthimpl) {
            i = m8556getMinWidthimpl;
        }
        if (i <= m8554getMaxWidthimpl) {
            m8554getMaxWidthimpl = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
        int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
        if (i2 < m8555getMinHeightimpl) {
            i2 = m8555getMinHeightimpl;
        }
        if (i2 <= m8553getMaxHeightimpl) {
            m8553getMaxHeightimpl = i2;
        }
        return androidx.compose.ui.unit.IntSize.m8767constructorimpl((m8554getMaxWidthimpl << 32) | (m8553getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m8571constrainWidthK40F9xA(long j, int i) {
        int m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        if (i < m8556getMinWidthimpl) {
            i = m8556getMinWidthimpl;
        }
        return i > m8554getMaxWidthimpl ? m8554getMaxWidthimpl : i;
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m8570constrainHeightK40F9xA(long j, int i) {
        int m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
        int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
        if (i < m8555getMinHeightimpl) {
            i = m8555getMinHeightimpl;
        }
        return i > m8553getMaxHeightimpl ? m8553getMaxHeightimpl : i;
    }

    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m8572isSatisfiedBy4WqzIAM(long j, long j2) {
        int m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        int i = (int) (j2 >> 32);
        if (m8556getMinWidthimpl > i || i > m8554getMaxWidthimpl) {
            return false;
        }
        int i2 = (int) (j2 & 4294967295L);
        return androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j) <= i2 && i2 <= androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m8574offsetNN6EwU$default(long j, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m8573offsetNN6EwU(j, i, i2);
    }

    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m8573offsetNN6EwU(long j, int i, int i2) {
        int m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j) + i;
        if (m8556getMinWidthimpl < 0) {
            m8556getMinWidthimpl = 0;
        }
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        if (m8554getMaxWidthimpl != Integer.MAX_VALUE && (m8554getMaxWidthimpl = m8554getMaxWidthimpl + i) < 0) {
            m8554getMaxWidthimpl = 0;
        }
        int m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j) + i2;
        if (m8555getMinHeightimpl < 0) {
            m8555getMinHeightimpl = 0;
        }
        int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
        return Constraints(m8556getMinWidthimpl, m8554getMaxWidthimpl, m8555getMinHeightimpl, (m8553getMaxHeightimpl == Integer.MAX_VALUE || (m8553getMaxHeightimpl = m8553getMaxHeightimpl + i2) >= 0) ? m8553getMaxHeightimpl : 0);
    }

    public static final long Constraints(int i, int i2, int i3, int i4) {
        boolean z = i2 >= i;
        boolean z2 = i4 >= i3;
        if (!((i3 >= 0) & z & z2 & (i >= 0))) {
            androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i, i2, i3, i4);
    }
}
