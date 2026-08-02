package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilterHelper;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "p0", "Landroidx/compose/ui/graphics/BlendMode;", "p1", "Landroid/graphics/BlendModeColorFilter;", "aG_", "(JI)Landroid/graphics/BlendModeColorFilter;", "Landroidx/compose/ui/graphics/BlendModeColorFilter;", "aH_", "(Landroid/graphics/BlendModeColorFilter;)Landroidx/compose/ui/graphics/BlendModeColorFilter;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BlendModeColorFilterHelper {
    public static final androidx.compose.ui.graphics.BlendModeColorFilterHelper INSTANCE = new androidx.compose.ui.graphics.BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    public static android.graphics.BlendModeColorFilter aG_(long p0, int p1) {
        return new android.graphics.BlendModeColorFilter(androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(p0), androidx.compose.ui.graphics.AndroidBlendMode_androidKt.m5844toAndroidBlendModes9anfk8(p1));
    }

    public static androidx.compose.ui.graphics.BlendModeColorFilter aH_(android.graphics.BlendModeColorFilter p0) {
        return new androidx.compose.ui.graphics.BlendModeColorFilter(androidx.compose.ui.graphics.ColorKt.Color(p0.getColor()), androidx.compose.ui.graphics.AndroidBlendMode_androidKt.toComposeBlendMode(p0.getMode()), p0, null);
    }
}
