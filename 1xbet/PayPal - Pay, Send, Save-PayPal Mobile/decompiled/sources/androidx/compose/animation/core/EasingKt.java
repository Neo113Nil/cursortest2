package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\n\"\u001a\u0010\u0001\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/Easing;", "FastOutSlowInEasing", "Landroidx/compose/animation/core/Easing;", "getFastOutSlowInEasing", "()Landroidx/compose/animation/core/Easing;", "LinearOutSlowInEasing", "getLinearOutSlowInEasing", "FastOutLinearInEasing", "getFastOutLinearInEasing", "LinearEasing", "getLinearEasing"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EasingKt {
    private static final androidx.compose.animation.core.Easing FastOutSlowInEasing = new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    private static final androidx.compose.animation.core.Easing LinearOutSlowInEasing = new androidx.compose.animation.core.CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);
    private static final androidx.compose.animation.core.Easing FastOutLinearInEasing = new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final androidx.compose.animation.core.Easing LinearEasing = new androidx.compose.animation.core.Easing() { // from class: androidx.compose.animation.core.EasingKt$$ExternalSyntheticLambda0
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float Camera2StreamConfigurationMap;
            Camera2StreamConfigurationMap = androidx.compose.animation.core.EasingKt.Camera2StreamConfigurationMap(f);
            return Camera2StreamConfigurationMap;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Camera2StreamConfigurationMap(float f) {
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
