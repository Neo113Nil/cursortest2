package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/material/ProgressIndicatorDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "StrokeWidth", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getStrokeWidth-D9Ej5fM", "()F", "", "IndicatorBackgroundOpacity", "Landroidx/compose/animation/core/SpringSpec;", "ProgressAnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "getProgressAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorDefaults {
    public static final int $stable = 0;
    public static final float IndicatorBackgroundOpacity = 0.24f;
    public static final androidx.compose.material.ProgressIndicatorDefaults INSTANCE = new androidx.compose.material.ProgressIndicatorDefaults();
    private static final float StrokeWidth = androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f);
    private static final androidx.compose.animation.core.SpringSpec<java.lang.Float> ProgressAnimationSpec = new androidx.compose.animation.core.SpringSpec<>(1.0f, 50.0f, java.lang.Float.valueOf(0.001f));

    private ProgressIndicatorDefaults() {
    }

    /* renamed from: getStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m2691getStrokeWidthD9Ej5fM() {
        return StrokeWidth;
    }

    public final androidx.compose.animation.core.SpringSpec<java.lang.Float> getProgressAnimationSpec() {
        return ProgressAnimationSpec;
    }
}
