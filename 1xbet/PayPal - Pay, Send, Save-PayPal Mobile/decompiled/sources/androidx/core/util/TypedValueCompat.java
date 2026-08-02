package androidx.core.util;

/* loaded from: classes3.dex */
public class TypedValueCompat {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ComplexDimensionUnit {
    }

    public static int getUnitFromComplexDimension(int i) {
        return i & 15;
    }

    private TypedValueCompat() {
    }

    public static float deriveDimension(int i, float f, android.util.DisplayMetrics displayMetrics) {
        float f2;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.util.TypedValueCompat.Api34Impl.Camera2StreamConfigurationMap(i, f, displayMetrics);
        }
        if (i == 0) {
            return f;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new java.lang.IllegalArgumentException("Invalid unitToConvertTo ".concat(java.lang.String.valueOf(i)));
                        }
                        if (displayMetrics.xdpi == 0.0f) {
                            return 0.0f;
                        }
                        f /= displayMetrics.xdpi;
                        f2 = 0.03937008f;
                    } else {
                        if (displayMetrics.xdpi == 0.0f) {
                            return 0.0f;
                        }
                        f2 = displayMetrics.xdpi;
                    }
                } else {
                    if (displayMetrics.xdpi == 0.0f) {
                        return 0.0f;
                    }
                    f /= displayMetrics.xdpi;
                    f2 = 0.013888889f;
                }
            } else {
                if (displayMetrics.scaledDensity == 0.0f) {
                    return 0.0f;
                }
                f2 = displayMetrics.scaledDensity;
            }
        } else {
            if (displayMetrics.density == 0.0f) {
                return 0.0f;
            }
            f2 = displayMetrics.density;
        }
        return f / f2;
    }

    public static float dpToPx(float f, android.util.DisplayMetrics displayMetrics) {
        return android.util.TypedValue.applyDimension(1, f, displayMetrics);
    }

    public static float pxToDp(float f, android.util.DisplayMetrics displayMetrics) {
        return deriveDimension(1, f, displayMetrics);
    }

    public static float spToPx(float f, android.util.DisplayMetrics displayMetrics) {
        return android.util.TypedValue.applyDimension(2, f, displayMetrics);
    }

    public static float pxToSp(float f, android.util.DisplayMetrics displayMetrics) {
        return deriveDimension(2, f, displayMetrics);
    }

    /* loaded from: classes7.dex */
    static class Api34Impl {
        private Api34Impl() {
        }

        public static float Camera2StreamConfigurationMap(int i, float f, android.util.DisplayMetrics displayMetrics) {
            return android.util.TypedValue.deriveDimension(i, f, displayMetrics);
        }
    }
}
