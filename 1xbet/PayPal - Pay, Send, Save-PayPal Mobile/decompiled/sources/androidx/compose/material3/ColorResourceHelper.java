package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/material3/ColorResourceHelper;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Landroidx/compose/ui/graphics/Color;", "getHighSpeedVideoFpsRanges", "(Landroid/content/Context;I)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ColorResourceHelper {
    public static final androidx.compose.material3.ColorResourceHelper INSTANCE = new androidx.compose.material3.ColorResourceHelper();

    private ColorResourceHelper() {
    }

    public static long getHighSpeedVideoFpsRanges(android.content.Context p0, int p1) {
        return androidx.compose.ui.graphics.ColorKt.Color(p0.getResources().getColor(p1, p0.getTheme()));
    }
}
