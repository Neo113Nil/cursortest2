package androidx.compose.ui.geometry;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "digits", "", "toStringAsFixed", "(FI)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeometryUtilsKt {
    public static final java.lang.String toStringAsFixed(float f, int i) {
        if (java.lang.Float.isNaN(f)) {
            return "NaN";
        }
        if (java.lang.Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = java.lang.Math.max(i, 0);
        float pow = (float) java.lang.Math.pow(10.0d, max);
        float f2 = f * pow;
        int i2 = (int) f2;
        if (f2 - i2 >= 0.5f) {
            i2++;
        }
        float f3 = i2 / pow;
        if (max > 0) {
            return java.lang.String.valueOf(f3);
        }
        return java.lang.String.valueOf((int) f3);
    }
}
