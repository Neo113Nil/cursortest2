package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001a\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "", "<init>", "()V", "", "sourceStart", "sourceEnd", "newLength", "", "recordEditOperation", "(III)V", "offset", "Landroidx/compose/ui/text/TextRange;", "mapFromSource--jx7JFs", "(I)J", "mapFromSource", "mapFromDest--jx7JFs", "mapFromDest", "p0", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(IZ)J", "p2", "p3", "p4", "Camera2StreamConfigurationMap", "(IIIIZ)J", "Landroidx/compose/foundation/text/input/internal/OpArray;", "getHighSpeedVideoSizes", "[I", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OffsetMappingCalculator {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int[] Camera2StreamConfigurationMap = androidx.compose.foundation.text.input.internal.OpArray.getHighSpeedVideoFpsRangesFor();

    public final void recordEditOperation(int sourceStart, int sourceEnd, int newLength) {
        if (newLength < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("Expected newLen to be ≥ 0, was ".concat(java.lang.String.valueOf(newLength)));
        }
        int min = java.lang.Math.min(sourceStart, sourceEnd);
        int max = java.lang.Math.max(min, sourceEnd) - min;
        if (max >= 2 || max != newLength) {
            int i = this.getHighSpeedVideoSizes + 1;
            if (i > androidx.compose.foundation.text.input.internal.OpArray.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap)) {
                this.Camera2StreamConfigurationMap = androidx.compose.foundation.text.input.internal.OpArray.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, java.lang.Math.max(i * 2, androidx.compose.foundation.text.input.internal.OpArray.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap) * 2));
            }
            androidx.compose.foundation.text.input.internal.OpArray.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, min, max, newLength);
            this.getHighSpeedVideoSizes = i;
        }
    }

    /* renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m2239mapFromSourcejx7JFs(int offset) {
        return getHighResolutionOutputSizeshNQ4ISI(offset, true);
    }

    /* renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m2238mapFromDestjx7JFs(int offset) {
        return getHighResolutionOutputSizeshNQ4ISI(offset, false);
    }

    private final long getHighResolutionOutputSizeshNQ4ISI(int p0, boolean p1) {
        int i;
        int[] iArr = this.Camera2StreamConfigurationMap;
        int i2 = this.getHighSpeedVideoSizes;
        if (i2 < 0) {
            i = p0;
        } else if (p1) {
            int i3 = p0;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i4 * 3;
                int i6 = iArr[i5];
                int i7 = iArr[i5 + 1];
                int i8 = iArr[i5 + 2];
                long Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(p0, i6, i7, i8, p1);
                long Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i3, i6, i7, i8, p1);
                p0 = java.lang.Math.min(androidx.compose.ui.text.TextRange.m8039getStartimpl(Camera2StreamConfigurationMap), androidx.compose.ui.text.TextRange.m8039getStartimpl(Camera2StreamConfigurationMap2));
                i3 = java.lang.Math.max(androidx.compose.ui.text.TextRange.m8034getEndimpl(Camera2StreamConfigurationMap), androidx.compose.ui.text.TextRange.m8034getEndimpl(Camera2StreamConfigurationMap2));
            }
            i = i3;
        } else {
            i = p0;
            for (int i9 = i2 - 1; i9 >= 0; i9--) {
                int i10 = i9 * 3;
                int i11 = iArr[i10];
                int i12 = iArr[i10 + 1];
                int i13 = iArr[i10 + 2];
                long Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(p0, i11, i12, i13, p1);
                long Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(i, i11, i12, i13, p1);
                p0 = java.lang.Math.min(androidx.compose.ui.text.TextRange.m8039getStartimpl(Camera2StreamConfigurationMap3), androidx.compose.ui.text.TextRange.m8039getStartimpl(Camera2StreamConfigurationMap4));
                i = java.lang.Math.max(androidx.compose.ui.text.TextRange.m8034getEndimpl(Camera2StreamConfigurationMap3), androidx.compose.ui.text.TextRange.m8034getEndimpl(Camera2StreamConfigurationMap4));
            }
        }
        return androidx.compose.ui.text.TextRangeKt.TextRange(p0, i);
    }

    private static long Camera2StreamConfigurationMap(int p0, int p1, int p2, int p3, boolean p4) {
        int i = p4 ? p2 : p3;
        if (p4) {
            p2 = p3;
        }
        if (p0 < p1) {
            return androidx.compose.ui.text.TextRangeKt.TextRange(p0);
        }
        if (p0 == p1) {
            if (i == 0) {
                return androidx.compose.ui.text.TextRangeKt.TextRange(p1, p2 + p1);
            }
            return androidx.compose.ui.text.TextRangeKt.TextRange(p1);
        }
        if (p0 >= p1 + i) {
            return androidx.compose.ui.text.TextRangeKt.TextRange((p0 - i) + p2);
        }
        if (p2 == 0) {
            return androidx.compose.ui.text.TextRangeKt.TextRange(p1);
        }
        return androidx.compose.ui.text.TextRangeKt.TextRange(p1, p2 + p1);
    }
}
