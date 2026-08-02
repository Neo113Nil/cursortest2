package androidx.compose.ui.graphics.shadow;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Landroidx/compose/ui/graphics/shadow/Shadow;", "a", util.h.xy.cb.b.f1091, "", "t", "lerpNonNull", "(Landroidx/compose/ui/graphics/shadow/Shadow;Landroidx/compose/ui/graphics/shadow/Shadow;F)Landroidx/compose/ui/graphics/shadow/Shadow;", "lerp"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShadowKt {
    public static final androidx.compose.ui.graphics.shadow.Shadow lerpNonNull(androidx.compose.ui.graphics.shadow.Shadow shadow, androidx.compose.ui.graphics.shadow.Shadow shadow2, float f) {
        float m8644lerpMdfbLM = androidx.compose.ui.unit.DpKt.m8644lerpMdfbLM(shadow.getRadius(), shadow2.getRadius(), f);
        float m8644lerpMdfbLM2 = androidx.compose.ui.unit.DpKt.m8644lerpMdfbLM(shadow.getSpread(), shadow2.getSpread(), f);
        long m8645lerpxhh869w = androidx.compose.ui.unit.DpKt.m8645lerpxhh869w(shadow.getOffset(), shadow2.getOffset(), f);
        long m6046lerpjxsXWHM = androidx.compose.ui.graphics.ColorKt.m6046lerpjxsXWHM(shadow.getColor(), shadow2.getColor(), f);
        java.lang.Object lerp = androidx.compose.ui.graphics.Interpolatable.INSTANCE.lerp(shadow.getBrush(), shadow2.getBrush(), f);
        return new androidx.compose.ui.graphics.shadow.Shadow(m8644lerpMdfbLM, m8644lerpMdfbLM2, m8645lerpxhh869w, m6046lerpjxsXWHM, lerp instanceof androidx.compose.ui.graphics.Brush ? (androidx.compose.ui.graphics.Brush) lerp : null, androidx.compose.ui.util.MathHelpersKt.lerp(shadow.getAlpha(), shadow2.getAlpha(), f), f < 0.5f ? shadow.getBlendMode() : shadow2.getBlendMode(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final androidx.compose.ui.graphics.shadow.Shadow lerp(androidx.compose.ui.graphics.shadow.Shadow shadow, androidx.compose.ui.graphics.shadow.Shadow shadow2, float f) {
        if (shadow == null && shadow2 == null) {
            return null;
        }
        if (shadow != null) {
            return shadow2 == null ? lerpNonNull(shadow, shadow.transparentCopy$ui_graphics(), f) : lerpNonNull(shadow, shadow2, f);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(shadow2);
        return lerpNonNull(shadow2.transparentCopy$ui_graphics(), shadow2, f);
    }
}
