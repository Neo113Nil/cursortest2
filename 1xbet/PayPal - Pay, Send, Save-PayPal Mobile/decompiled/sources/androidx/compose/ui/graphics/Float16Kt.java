package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\f\"\u0014\u0010\u0012\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"", "f", "", "floatToHalf", "(F)S", "h", "halfToFloat", "(S)F", "Landroidx/compose/ui/graphics/Float16;", "x", "y", "min-AoSsdG0", "(SS)S", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "max-AoSsdG0", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Float16Kt {
    private static final float getHighSpeedVideoFpsRanges = java.lang.Float.intBitsToFloat(1056964608);

    public static final short floatToHalf(float f) {
        int i;
        int floatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        int i2 = floatToRawIntBits >>> 31;
        int i3 = (floatToRawIntBits >>> 23) & 255;
        int i4 = 8388607 & floatToRawIntBits;
        int i5 = 31;
        int i6 = 0;
        if (i3 != 255) {
            int i7 = i3 - 112;
            if (i7 >= 31) {
                i5 = 49;
            } else if (i7 > 0) {
                i6 = i4 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                    return (short) i;
                }
                i5 = i7;
            } else if (i7 >= -10) {
                int i8 = (8388608 | i4) >> (1 - i7);
                if ((i8 & 4096) != 0) {
                    i8 += 8192;
                }
                i5 = 0;
                i6 = i8 >> 13;
            } else {
                i5 = 0;
            }
        } else if (i4 != 0) {
            i6 = 512;
        }
        i = (i2 << 15) | (i5 << 10) | i6;
        return (short) i;
    }

    /* renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m6138minAoSsdG0(short s, short s2) {
        if (androidx.compose.ui.graphics.Float16.m6110isNaNimpl(s) || androidx.compose.ui.graphics.Float16.m6110isNaNimpl(s2)) {
            return androidx.compose.ui.graphics.Float16.Companion.m6132getNaNslo4al4();
        }
        return androidx.compose.ui.graphics.Float16.m6097compareTo41bOqos(s, s2) <= 0 ? s : s2;
    }

    /* renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m6137maxAoSsdG0(short s, short s2) {
        if (androidx.compose.ui.graphics.Float16.m6110isNaNimpl(s) || androidx.compose.ui.graphics.Float16.m6110isNaNimpl(s2)) {
            return androidx.compose.ui.graphics.Float16.Companion.m6132getNaNslo4al4();
        }
        return androidx.compose.ui.graphics.Float16.m6097compareTo41bOqos(s, s2) >= 0 ? s : s2;
    }

    public static final float halfToFloat(short s) {
        int i;
        int i2;
        int i3;
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = java.lang.Float.intBitsToFloat(i6 + 1056964608) - getHighSpeedVideoFpsRanges;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return java.lang.Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }
}
