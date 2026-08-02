package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001e\u001a\u00020\u001b*\u00020\u0016H\u0000¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/ui/graphics/PathEffect;", "Landroid/graphics/PathEffect;", "asAndroidPathEffect", "(Landroidx/compose/ui/graphics/PathEffect;)Landroid/graphics/PathEffect;", "toComposePathEffect", "(Landroid/graphics/PathEffect;)Landroidx/compose/ui/graphics/PathEffect;", "", "radius", "actualCornerPathEffect", "(F)Landroidx/compose/ui/graphics/PathEffect;", "", "intervals", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PHASE, "actualDashPathEffect", "([FF)Landroidx/compose/ui/graphics/PathEffect;", "outer", "inner", "actualChainPathEffect", "(Landroidx/compose/ui/graphics/PathEffect;Landroidx/compose/ui/graphics/PathEffect;)Landroidx/compose/ui/graphics/PathEffect;", "Landroidx/compose/ui/graphics/Path;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "advance", "Landroidx/compose/ui/graphics/StampedPathEffectStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "actualStampedPathEffect-7aD1DOk", "(Landroidx/compose/ui/graphics/Path;FFI)Landroidx/compose/ui/graphics/PathEffect;", "actualStampedPathEffect", "Landroid/graphics/PathDashPathEffect$Style;", "toAndroidPathDashPathEffectStyle-oQv6xUo", "(I)Landroid/graphics/PathDashPathEffect$Style;", "toAndroidPathDashPathEffectStyle"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidPathEffect_androidKt {
    public static final android.graphics.PathEffect asAndroidPathEffect(androidx.compose.ui.graphics.PathEffect pathEffect) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(pathEffect, "");
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
        kotlin.jvm.internal.Intrinsics.checkNotNull(pathEffect, "");
        android.graphics.PathEffect nativePathEffect = ((androidx.compose.ui.graphics.AndroidPathEffect) pathEffect).getNativePathEffect();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pathEffect2, "");
        return new androidx.compose.ui.graphics.AndroidPathEffect(new android.graphics.ComposePathEffect(nativePathEffect, ((androidx.compose.ui.graphics.AndroidPathEffect) pathEffect2).getNativePathEffect()));
    }

    /* renamed from: toAndroidPathDashPathEffectStyle-oQv6xUo, reason: not valid java name */
    public static final android.graphics.PathDashPathEffect.Style m5891toAndroidPathDashPathEffectStyleoQv6xUo(int i) {
        return androidx.compose.ui.graphics.StampedPathEffectStyle.m6326equalsimpl0(i, androidx.compose.ui.graphics.StampedPathEffectStyle.INSTANCE.m6330getMorphYpspkwk()) ? android.graphics.PathDashPathEffect.Style.MORPH : androidx.compose.ui.graphics.StampedPathEffectStyle.m6326equalsimpl0(i, androidx.compose.ui.graphics.StampedPathEffectStyle.INSTANCE.m6331getRotateYpspkwk()) ? android.graphics.PathDashPathEffect.Style.ROTATE : androidx.compose.ui.graphics.StampedPathEffectStyle.m6326equalsimpl0(i, androidx.compose.ui.graphics.StampedPathEffectStyle.INSTANCE.m6332getTranslateYpspkwk()) ? android.graphics.PathDashPathEffect.Style.TRANSLATE : android.graphics.PathDashPathEffect.Style.TRANSLATE;
    }

    /* renamed from: actualStampedPathEffect-7aD1DOk, reason: not valid java name */
    public static final androidx.compose.ui.graphics.PathEffect m5890actualStampedPathEffect7aD1DOk(androidx.compose.ui.graphics.Path path, float f, float f2, int i) {
        if (path instanceof androidx.compose.ui.graphics.AndroidPath) {
            return new androidx.compose.ui.graphics.AndroidPathEffect(new android.graphics.PathDashPathEffect(((androidx.compose.ui.graphics.AndroidPath) path).getInternalPath(), f, f2, m5891toAndroidPathDashPathEffectStyleoQv6xUo(i)));
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
