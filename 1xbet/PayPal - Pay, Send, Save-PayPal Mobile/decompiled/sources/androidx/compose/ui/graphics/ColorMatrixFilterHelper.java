package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrixFilterHelper;", "", "<init>", "()V", "Landroid/graphics/ColorMatrixColorFilter;", "p0", "Landroidx/compose/ui/graphics/ColorMatrix;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/graphics/ColorMatrixColorFilter;)[F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ColorMatrixFilterHelper {
    public static final androidx.compose.ui.graphics.ColorMatrixFilterHelper INSTANCE = new androidx.compose.ui.graphics.ColorMatrixFilterHelper();

    private ColorMatrixFilterHelper() {
    }

    public static float[] getHighResolutionOutputSizeshNQ4ISI(android.graphics.ColorMatrixColorFilter p0) {
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        p0.getColorMatrix(colorMatrix);
        return androidx.compose.ui.graphics.ColorMatrix.m6051constructorimpl(colorMatrix.getArray());
    }
}
