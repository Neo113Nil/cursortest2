package androidx.compose.animation.core;

/* compiled from: Easing.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005\"\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0005¨\u0006\f"}, d2 = {"CubicErrorBound", "", "FastOutLinearInEasing", "Landroidx/compose/animation/core/Easing;", "getFastOutLinearInEasing", "()Landroidx/compose/animation/core/Easing;", "FastOutSlowInEasing", "getFastOutSlowInEasing", "LinearEasing", "getLinearEasing", "LinearOutSlowInEasing", "getLinearOutSlowInEasing", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EasingKt {
    private static final float CubicErrorBound = 0.001f;
    private static final androidx.compose.animation.core.Easing FastOutSlowInEasing = new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    private static final androidx.compose.animation.core.Easing LinearOutSlowInEasing = new androidx.compose.animation.core.CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);
    private static final androidx.compose.animation.core.Easing FastOutLinearInEasing = new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final androidx.compose.animation.core.Easing LinearEasing = new androidx.compose.animation.core.Easing() { // from class: androidx.compose.animation.core.EasingKt$$ExternalSyntheticLambda0
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float LinearEasing$lambda$0;
            LinearEasing$lambda$0 = androidx.compose.animation.core.EasingKt.LinearEasing$lambda$0(f);
            return LinearEasing$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearEasing$lambda$0(float f) {
        return f;
    }

    public static final androidx.compose.animation.core.Easing getFastOutSlowInEasing() {
        return FastOutSlowInEasing;
    }

    public static final androidx.compose.animation.core.Easing getLinearOutSlowInEasing() {
        return LinearOutSlowInEasing;
    }

    public static final androidx.compose.animation.core.Easing getFastOutLinearInEasing() {
        return FastOutLinearInEasing;
    }

    public static final androidx.compose.animation.core.Easing getLinearEasing() {
        return LinearEasing;
    }
}
