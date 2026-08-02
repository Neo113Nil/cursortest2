package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/graphics/RenderEffectVerificationHelper;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/RenderEffect;", "p0", "", "p1", "p2", "Landroidx/compose/ui/graphics/TileMode;", "p3", "Landroid/graphics/RenderEffect;", "aI_", "(Landroidx/compose/ui/graphics/RenderEffect;FFI)Landroid/graphics/RenderEffect;", "Landroidx/compose/ui/geometry/Offset;", "aJ_", "(Landroidx/compose/ui/graphics/RenderEffect;J)Landroid/graphics/RenderEffect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RenderEffectVerificationHelper {
    public static final androidx.compose.ui.graphics.RenderEffectVerificationHelper INSTANCE = new androidx.compose.ui.graphics.RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    public static android.graphics.RenderEffect aI_(androidx.compose.ui.graphics.RenderEffect p0, float p1, float p2, int p3) {
        if (p1 == 0.0f && p2 == 0.0f) {
            return android.graphics.RenderEffect.createOffsetEffect(0.0f, 0.0f);
        }
        if (p0 == null) {
            return android.graphics.RenderEffect.createBlurEffect(p1, p2, androidx.compose.ui.graphics.AndroidTileMode_androidKt.m5900toAndroidTileMode0vamqd0(p3));
        }
        return android.graphics.RenderEffect.createBlurEffect(p1, p2, p0.asAndroidRenderEffect(), androidx.compose.ui.graphics.AndroidTileMode_androidKt.m5900toAndroidTileMode0vamqd0(p3));
    }

    public static android.graphics.RenderEffect aJ_(androidx.compose.ui.graphics.RenderEffect p0, long p1) {
        if (p0 == null) {
            return android.graphics.RenderEffect.createOffsetEffect(java.lang.Float.intBitsToFloat((int) (p1 >> 32)), java.lang.Float.intBitsToFloat((int) (p1 & 4294967295L)));
        }
        return android.graphics.RenderEffect.createOffsetEffect(java.lang.Float.intBitsToFloat((int) (p1 >> 32)), java.lang.Float.intBitsToFloat((int) (p1 & 4294967295L)), p0.asAndroidRenderEffect());
    }
}
