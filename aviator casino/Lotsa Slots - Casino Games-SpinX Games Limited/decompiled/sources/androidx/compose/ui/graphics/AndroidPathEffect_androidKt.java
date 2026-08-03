package androidx.compose.ui.graphics;

/* compiled from: AndroidPathEffect.android.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0000\u001a2\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\n\u0010\u0013\u001a\u00020\u0014*\u00020\u0001\u001a\u0016\u0010\u0015\u001a\u00020\u0016*\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"actualChainPathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "outer", "inner", "actualCornerPathEffect", com.helpshift.proactive.InAppViewConstants.RADIUS, "", "actualDashPathEffect", "intervals", "", "phase", "actualStampedPathEffect", "shape", "Landroidx/compose/ui/graphics/Path;", "advance", "style", "Landroidx/compose/ui/graphics/StampedPathEffectStyle;", "actualStampedPathEffect-7aD1DOk", "(Landroidx/compose/ui/graphics/Path;FFI)Landroidx/compose/ui/graphics/PathEffect;", "asAndroidPathEffect", "Landroid/graphics/PathEffect;", "toAndroidPathDashPathEffectStyle", "Landroid/graphics/PathDashPathEffect$Style;", "toAndroidPathDashPathEffectStyle-oQv6xUo", "(I)Landroid/graphics/PathDashPathEffect$Style;", "toComposePathEffect", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidPathEffect_androidKt {
    public static final android.graphics.PathEffect asAndroidPathEffect(androidx.compose.ui.graphics.PathEffect pathEffect) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((androidx.compose.ui.graphics.AndroidPathEffect) pathEffect).getNativePathEffect();
    }

    public static final androidx.compose.ui.graphics.PathEffect toComposePathEffect(android.graphics.PathEffect pathEffect) {
        return new androidx.compose.ui.graphics.AndroidPathEffect(pathEffect);
    }

    public static final androidx.compose.ui.graphics.PathEffect actualCornerPathEffect(float f) {
        return new androidx.compose.ui.graphics.AndroidPathEffect(new android.graphics.CornerPathEffect(f));
    }

    public static final androidx.compose.ui.graphics.PathEffect actualDashPathEffect(float[] fArr, float f) {
        return new androidx.compose.ui.graphics.AndroidPathEffect(new android.graphics.DashPathEffect(fArr, f));
    }

    public static final androidx.compose.ui.graphics.PathEffect actualChainPathEffect(androidx.compose.ui.graphics.PathEffect pathEffect, androidx.compose.ui.graphics.PathEffect pathEffect2) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        android.graphics.PathEffect nativePathEffect = ((androidx.compose.ui.graphics.AndroidPathEffect) pathEffect).getNativePathEffect();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pathEffect2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return new androidx.compose.ui.graphics.AndroidPathEffect(new android.graphics.ComposePathEffect(nativePathEffect, ((androidx.compose.ui.graphics.AndroidPathEffect) pathEffect2).getNativePathEffect()));
    }

    /* renamed from: actualStampedPathEffect-7aD1DOk, reason: not valid java name */
    public static final androidx.compose.ui.graphics.PathEffect m2009actualStampedPathEffect7aD1DOk(androidx.compose.ui.graphics.Path path, float f, float f2, int i) {
        if (path instanceof androidx.compose.ui.graphics.AndroidPath) {
            return new androidx.compose.ui.graphics.AndroidPathEffect(new android.graphics.PathDashPathEffect(((androidx.compose.ui.graphics.AndroidPath) path).getInternalPath(), f, f2, m2010toAndroidPathDashPathEffectStyleoQv6xUo(i)));
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: toAndroidPathDashPathEffectStyle-oQv6xUo, reason: not valid java name */
    public static final android.graphics.PathDashPathEffect.Style m2010toAndroidPathDashPathEffectStyleoQv6xUo(int i) {
        return androidx.compose.ui.graphics.StampedPathEffectStyle.m2460equalsimpl0(i, androidx.compose.ui.graphics.StampedPathEffectStyle.INSTANCE.m2464getMorphYpspkwk()) ? android.graphics.PathDashPathEffect.Style.MORPH : androidx.compose.ui.graphics.StampedPathEffectStyle.m2460equalsimpl0(i, androidx.compose.ui.graphics.StampedPathEffectStyle.INSTANCE.m2465getRotateYpspkwk()) ? android.graphics.PathDashPathEffect.Style.ROTATE : androidx.compose.ui.graphics.StampedPathEffectStyle.m2460equalsimpl0(i, androidx.compose.ui.graphics.StampedPathEffectStyle.INSTANCE.m2466getTranslateYpspkwk()) ? android.graphics.PathDashPathEffect.Style.TRANSLATE : android.graphics.PathDashPathEffect.Style.TRANSLATE;
    }
}
