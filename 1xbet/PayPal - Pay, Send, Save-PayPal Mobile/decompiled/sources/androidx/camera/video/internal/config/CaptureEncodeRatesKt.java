package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "captureRate", "Landroid/util/Rational;", "captureToEncodeRatio", "toEncodeRate", "(ILandroid/util/Rational;)I", "encodeRate", "toCaptureRate", "p0", "", "getHighSpeedVideoFpsRanges", "(Landroid/util/Rational;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CaptureEncodeRatesKt {
    public static final int toEncodeRate(int i, android.util.Rational rational) {
        if (rational == null) {
            return i;
        }
        if (getHighSpeedVideoFpsRanges(rational)) {
            androidx.camera.core.Logger.w("CaptureEncodeRates", "Invalid capture-to-encode ratio: ".concat(java.lang.String.valueOf(rational)));
            return i;
        }
        return kotlin.math.MathKt.roundToInt(i / rational.floatValue());
    }

    public static final int toCaptureRate(int i, android.util.Rational rational) {
        if (rational == null) {
            return i;
        }
        if (getHighSpeedVideoFpsRanges(rational)) {
            androidx.camera.core.Logger.w("CaptureEncodeRates", "Invalid capture-to-encode ratio: ".concat(java.lang.String.valueOf(rational)));
            return i;
        }
        return kotlin.math.MathKt.roundToInt(i * rational.floatValue());
    }

    private static final boolean getHighSpeedVideoFpsRanges(android.util.Rational rational) {
        return kotlin.jvm.internal.Intrinsics.areEqual(rational, android.util.Rational.NaN) || kotlin.jvm.internal.Intrinsics.areEqual(rational, android.util.Rational.ZERO) || kotlin.jvm.internal.Intrinsics.areEqual(rational, android.util.Rational.NEGATIVE_INFINITY) || kotlin.jvm.internal.Intrinsics.areEqual(rational, android.util.Rational.POSITIVE_INFINITY);
    }
}
