package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087@\u0018\u0000 22\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010\n\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b#\u0010 R\u0011\u0010&\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0017\u0010+\u001a\u00020\u00158G¢\u0006\f\u0012\u0004\b*\u0010\u001d\u001a\u0004\b)\u0010%R\u0017\u0010.\u001a\u00020\u00158G¢\u0006\f\u0012\u0004\b-\u0010\u001d\u001a\u0004\b,\u0010%R\u0017\u00101\u001a\u00020\u00158G¢\u0006\f\u0012\u0004\b0\u0010\u001d\u001a\u0004\b/\u0010%\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(J)J", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "copy-Zbe2FdA", "(JIIII)J", "copy", "copyMaxDimensions-msEJaDk", "copyMaxDimensions", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "J", "getValue$annotations", "()V", "getHighSpeedVideoFpsRangesFor", "getMinWidth-impl", "(J)I", "getMaxWidth-impl", "getMinHeight-impl", "getMaxHeight-impl", "getHasBoundedWidth-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedHeight-impl", "hasBoundedHeight", "getHasFixedWidth-impl", "getHasFixedWidth$annotations", "hasFixedWidth", "getHasFixedHeight-impl", "getHasFixedHeight$annotations", "hasFixedHeight", "isZero-impl", "isZero$annotations", "isZero", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class Constraints {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.unit.Constraints.Companion INSTANCE = new androidx.compose.ui.unit.Constraints.Companion(null);
    public static final int Infinity = Integer.MAX_VALUE;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8543constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8548equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m8549getHasBoundedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m8550getHasBoundedWidthimpl(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m8551getHasFixedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = (int) (j >> (i2 + 15));
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return (i4 & i3) == (i5 == 0 ? Integer.MAX_VALUE : i5 + (-1));
    }

    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m8552getHasFixedWidthimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1;
        int i3 = (int) (j >> 2);
        int i4 = ((int) (j >> 33)) & i2;
        return (i3 & i2) == (i4 == 0 ? Integer.MAX_VALUE : i4 + (-1));
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m8553getMaxHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m8554getMaxWidthimpl(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m8555getMinHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m8556getMinWidthimpl(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m8558isZeroimpl(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return ((((1 << (i2 + 13)) - 1) & ((int) (j >> 33))) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    private /* synthetic */ Constraints(long j) {
        this.getHighSpeedVideoFpsRangesFor = j;
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m8545copyZbe2FdA$default(long j, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = m8556getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = m8554getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = m8555getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m8553getMaxHeightimpl(j);
        }
        return m8544copyZbe2FdA(j, i6, i7, i8, i4);
    }

    /* renamed from: copyMaxDimensions-msEJaDk, reason: not valid java name */
    public static final long m8546copyMaxDimensionsmsEJaDk(long j) {
        return m8543constructorimpl(j & androidx.compose.ui.unit.ConstraintsKt.MaxDimensionsAndFocusMask);
    }

    public final java.lang.String toString() {
        return m8559toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8559toStringimpl(long j) {
        int m8554getMaxWidthimpl = m8554getMaxWidthimpl(j);
        java.lang.String str = "Infinity";
        java.lang.String valueOf = m8554getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : java.lang.String.valueOf(m8554getMaxWidthimpl);
        int m8553getMaxHeightimpl = m8553getMaxHeightimpl(j);
        if (m8553getMaxHeightimpl != Integer.MAX_VALUE) {
            str = java.lang.String.valueOf(m8553getMaxHeightimpl);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Constraints(minWidth = ");
        sb.append(m8556getMinWidthimpl(j));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(m8555getMinHeightimpl(j));
        sb.append(", maxHeight = ");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\fJ9\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "<init>", "()V", "", "width", "height", "Landroidx/compose/ui/unit/Constraints;", "fixed-JhjzzOo", "(II)J", "fixed", "fixedWidth-OenEA2s", "(I)J", "fixedWidth", "fixedHeight-OenEA2s", "fixedHeight", "minWidth", "maxWidth", "minHeight", "maxHeight", "", "prioritizeWidth", "restrictConstraints-xF2OJ5Q", "(IIIIZ)J", "restrictConstraints", "fitPrioritizingWidth-Zbe2FdA", "(IIII)J", "fitPrioritizingWidth", "fitPrioritizingHeight-Zbe2FdA", "fitPrioritizingHeight", "Infinity", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: restrictConstraints-xF2OJ5Q$default, reason: not valid java name */
        public static /* synthetic */ long m8561restrictConstraintsxF2OJ5Q$default(androidx.compose.ui.unit.Constraints.Companion companion, int i, int i2, int i3, int i4, boolean z, int i5, java.lang.Object obj) {
            if ((i5 & 16) != 0) {
                z = true;
            }
            return companion.m8567restrictConstraintsxF2OJ5Q(i, i2, i3, i4, z);
        }

        @kotlin.Deprecated(message = "Replace with fitPrioritizingWidth", replaceWith = @kotlin.ReplaceWith(expression = "Constraints.fitPrioritizingWidth(minWidth, maxWidth, minHeight, maxHeight)", imports = {}))
        /* renamed from: restrictConstraints-xF2OJ5Q, reason: not valid java name */
        public final long m8567restrictConstraintsxF2OJ5Q(int minWidth, int maxWidth, int minHeight, int maxHeight, boolean prioritizeWidth) {
            if (prioritizeWidth) {
                return m8563fitPrioritizingWidthZbe2FdA(minWidth, maxWidth, minHeight, maxHeight);
            }
            return m8562fitPrioritizingHeightZbe2FdA(minWidth, maxWidth, minHeight, maxHeight);
        }

        /* renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
        public final long m8563fitPrioritizingWidthZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int i = 262142;
            int min = java.lang.Math.min(minWidth, 262142);
            int min2 = maxWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.min(maxWidth, 262142);
            int i2 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i2 >= 8191) {
                if (i2 < 32767) {
                    i = org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER;
                } else if (i2 < 65535) {
                    i = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_NEXT;
                } else {
                    if (i2 >= 262143) {
                        androidx.compose.ui.unit.ConstraintsKt.throwInvalidConstraintsSizeException(i2);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    i = 8190;
                }
            }
            return androidx.compose.ui.unit.ConstraintsKt.Constraints(min, min2, java.lang.Math.min(i, minHeight), maxHeight != Integer.MAX_VALUE ? java.lang.Math.min(i, maxHeight) : Integer.MAX_VALUE);
        }

        /* renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
        public final long m8562fitPrioritizingHeightZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int i = 262142;
            int min = java.lang.Math.min(minHeight, 262142);
            int min2 = maxHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.min(maxHeight, 262142);
            int i2 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i2 >= 8191) {
                if (i2 < 32767) {
                    i = org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER;
                } else if (i2 < 65535) {
                    i = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_NEXT;
                } else {
                    if (i2 >= 262143) {
                        androidx.compose.ui.unit.ConstraintsKt.throwInvalidConstraintsSizeException(i2);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    i = 8190;
                }
            }
            return androidx.compose.ui.unit.ConstraintsKt.Constraints(java.lang.Math.min(i, minWidth), maxWidth != Integer.MAX_VALUE ? java.lang.Math.min(i, maxWidth) : Integer.MAX_VALUE, min, min2);
        }

        /* renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m8564fixedJhjzzOo(int width, int height) {
            if (!((height >= 0) & (width >= 0))) {
                androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
            }
            return androidx.compose.ui.unit.ConstraintsKt.createConstraints(width, width, height, height);
        }

        /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m8566fixedWidthOenEA2s(int width) {
            if (width < 0) {
                androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
            }
            return androidx.compose.ui.unit.ConstraintsKt.createConstraints(width, width, 0, Integer.MAX_VALUE);
        }

        /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m8565fixedHeightOenEA2s(int height) {
            if (height < 0) {
                androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalArgumentException("height must be >= 0");
            }
            return androidx.compose.ui.unit.ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, height, height);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m8544copyZbe2FdA(long j, int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return androidx.compose.ui.unit.ConstraintsKt.createConstraints(i, i2, i3, i4);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return m8557hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m8547equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8557hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8547equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.unit.Constraints) && j == ((androidx.compose.ui.unit.Constraints) obj).getGetHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.unit.Constraints m8542boximpl(long j) {
        return new androidx.compose.ui.unit.Constraints(j);
    }
}
