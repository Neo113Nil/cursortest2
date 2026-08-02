package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public final class AspectRatioUtil {
    public static final android.util.Rational ASPECT_RATIO_4_3 = new android.util.Rational(4, 3);
    public static final android.util.Rational ASPECT_RATIO_3_4 = new android.util.Rational(3, 4);
    public static final android.util.Rational ASPECT_RATIO_16_9 = new android.util.Rational(16, 9);
    public static final android.util.Rational ASPECT_RATIO_9_16 = new android.util.Rational(9, 16);

    private AspectRatioUtil() {
    }

    public static boolean hasMatchingAspectRatio(android.util.Size size, android.util.Rational rational) {
        return hasMatchingAspectRatio(size, rational, androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA);
    }

    public static boolean hasMatchingAspectRatio(android.util.Size size, android.util.Rational rational, android.util.Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new android.util.Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (androidx.camera.core.internal.utils.SizeUtil.getArea(size) >= androidx.camera.core.internal.utils.SizeUtil.getArea(size2)) {
            int width = size.getWidth();
            int height = size.getHeight();
            android.util.Rational rational2 = new android.util.Rational(rational.getDenominator(), rational.getNumerator());
            int i = width % 16;
            if (i == 0 && height % 16 == 0) {
                return getHighResolutionOutputSizeshNQ4ISI(java.lang.Math.max(0, height + (-16)), width, rational) || getHighResolutionOutputSizeshNQ4ISI(java.lang.Math.max(0, width + (-16)), height, rational2);
            }
            if (i == 0) {
                return getHighResolutionOutputSizeshNQ4ISI(height, width, rational);
            }
            if (height % 16 == 0) {
                return getHighResolutionOutputSizeshNQ4ISI(width, height, rational2);
            }
        }
        return false;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(int i, int i2, android.util.Rational rational) {
        androidx.core.util.Preconditions.checkArgument(i2 % 16 == 0);
        double numerator = (i * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) java.lang.Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }

    public static final class CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace implements java.util.Comparator<android.util.Rational> {
        private final android.util.Rational Camera2StreamConfigurationMap;
        private final android.graphics.RectF getHighSpeedVideoFpsRanges;
        private final android.util.Rational getHighSpeedVideoFpsRangesFor;

        public CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(android.util.Rational rational, android.util.Rational rational2) {
            this.getHighSpeedVideoFpsRangesFor = rational;
            this.Camera2StreamConfigurationMap = rational2 == null ? new android.util.Rational(4, 3) : rational2;
            this.getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap(rational);
        }

        @Override // java.util.Comparator
        public final int compare(android.util.Rational rational, android.util.Rational rational2) {
            boolean z = false;
            if (rational.equals(rational2)) {
                return 0;
            }
            android.graphics.RectF Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(rational);
            android.graphics.RectF Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(rational2);
            android.graphics.RectF rectF = this.getHighSpeedVideoFpsRanges;
            boolean z2 = Camera2StreamConfigurationMap.width() >= rectF.width() && Camera2StreamConfigurationMap.height() >= rectF.height();
            android.graphics.RectF rectF2 = this.getHighSpeedVideoFpsRanges;
            if (Camera2StreamConfigurationMap2.width() >= rectF2.width() && Camera2StreamConfigurationMap2.height() >= rectF2.height()) {
                z = true;
            }
            if (z2 && z) {
                return (int) java.lang.Math.signum((Camera2StreamConfigurationMap.width() * Camera2StreamConfigurationMap.height()) - (Camera2StreamConfigurationMap2.width() * Camera2StreamConfigurationMap2.height()));
            }
            if (z2) {
                return -1;
            }
            if (z) {
                return 1;
            }
            return -((int) java.lang.Math.signum(getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges) - getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap2, this.getHighSpeedVideoFpsRanges)));
        }

        private android.graphics.RectF Camera2StreamConfigurationMap(android.util.Rational rational) {
            if (rational.floatValue() == this.Camera2StreamConfigurationMap.floatValue()) {
                return new android.graphics.RectF(0.0f, 0.0f, this.Camera2StreamConfigurationMap.getNumerator(), this.Camera2StreamConfigurationMap.getDenominator());
            }
            if (rational.floatValue() > this.Camera2StreamConfigurationMap.floatValue()) {
                return new android.graphics.RectF(0.0f, 0.0f, this.Camera2StreamConfigurationMap.getNumerator(), (rational.getDenominator() * this.Camera2StreamConfigurationMap.getNumerator()) / rational.getNumerator());
            }
            return new android.graphics.RectF(0.0f, 0.0f, (rational.getNumerator() * this.Camera2StreamConfigurationMap.getDenominator()) / rational.getDenominator(), this.Camera2StreamConfigurationMap.getDenominator());
        }

        private static float getHighResolutionOutputSizeshNQ4ISI(android.graphics.RectF rectF, android.graphics.RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }
    }
}
