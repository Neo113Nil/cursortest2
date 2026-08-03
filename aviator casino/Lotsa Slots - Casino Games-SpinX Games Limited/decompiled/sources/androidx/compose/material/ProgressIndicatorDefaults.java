package androidx.compose.material;

/* compiled from: ProgressIndicator.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/ProgressIndicatorDefaults;", "", "()V", "IndicatorBackgroundOpacity", "", "ProgressAnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "getProgressAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "StrokeWidth", "Landroidx/compose/ui/unit/Dp;", "getStrokeWidth-D9Ej5fM", "()F", "F", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorDefaults {
    public static final int $stable = 0;
    public static final float IndicatorBackgroundOpacity = 0.24f;
    public static final androidx.compose.material.ProgressIndicatorDefaults INSTANCE = new androidx.compose.material.ProgressIndicatorDefaults();
    private static final float StrokeWidth = androidx.compose.ui.unit.Dp.m4478constructorimpl(4);
    private static final androidx.compose.animation.core.SpringSpec<java.lang.Float> ProgressAnimationSpec = new androidx.compose.animation.core.SpringSpec<>(1.0f, 50.0f, java.lang.Float.valueOf(0.001f));

    private ProgressIndicatorDefaults() {
    }

    /* renamed from: getStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m1451getStrokeWidthD9Ej5fM() {
        return StrokeWidth;
    }

    public final androidx.compose.animation.core.SpringSpec<java.lang.Float> getProgressAnimationSpec() {
        return ProgressAnimationSpec;
    }
}
