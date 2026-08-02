package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\bF\"\u0017\u0010\u0001\u001a\u00020\u00008\u0007¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u001a\u0010\r\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0004\"\u001a\u0010\u000f\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0004\"\u001a\u0010\u0013\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0004\"\u001a\u0010\u0015\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u001a\u0010\u0017\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0004\"\u001a\u0010\u0019\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0004\"\u001a\u0010\u001b\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0004\"\u001a\u0010\u001d\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u0004\"\u001a\u0010\u001f\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0004\"\u001a\u0010!\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0004\"\u001a\u0010#\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010\u0004\"\u001a\u0010%\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0004\"\u001a\u0010'\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0004\"\u001a\u0010)\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0002\u001a\u0004\b*\u0010\u0004\"\u001a\u0010+\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0004\"\u001a\u0010-\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0004\"\u001a\u0010/\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0002\u001a\u0004\b0\u0010\u0004\"\u001a\u00101\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0002\u001a\u0004\b2\u0010\u0004\"\u001a\u00103\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0004\"\u001a\u00105\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0002\u001a\u0004\b6\u0010\u0004\"\u001a\u00107\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0002\u001a\u0004\b8\u0010\u0004\"\u001a\u00109\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0004\"\u001a\u0010;\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0002\u001a\u0004\b<\u0010\u0004\"\u001a\u0010=\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0002\u001a\u0004\b>\u0010\u0004\"\u001a\u0010?\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0004\"\u001a\u0010A\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\u0002\u001a\u0004\bB\u0010\u0004\"\u001a\u0010C\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010\u0002\u001a\u0004\bD\u0010\u0004\"\u001a\u0010E\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u0002\u001a\u0004\bF\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/Easing;", "Ease", "Landroidx/compose/animation/core/Easing;", "getEase", "()Landroidx/compose/animation/core/Easing;", "EaseOut", "getEaseOut", "EaseIn", "getEaseIn", "EaseInOut", "getEaseInOut", "EaseInSine", "getEaseInSine", "EaseOutSine", "getEaseOutSine", "EaseInOutSine", "getEaseInOutSine", "EaseInCubic", "getEaseInCubic", "EaseOutCubic", "getEaseOutCubic", "EaseInOutCubic", "getEaseInOutCubic", "EaseInQuint", "getEaseInQuint", "EaseOutQuint", "getEaseOutQuint", "EaseInOutQuint", "getEaseInOutQuint", "EaseInCirc", "getEaseInCirc", "EaseOutCirc", "getEaseOutCirc", "EaseInOutCirc", "getEaseInOutCirc", "EaseInQuad", "getEaseInQuad", "EaseOutQuad", "getEaseOutQuad", "EaseInOutQuad", "getEaseInOutQuad", "EaseInQuart", "getEaseInQuart", "EaseOutQuart", "getEaseOutQuart", "EaseInOutQuart", "getEaseInOutQuart", "EaseInExpo", "getEaseInExpo", "EaseOutExpo", "getEaseOutExpo", "EaseInOutExpo", "getEaseInOutExpo", "EaseInBack", "getEaseInBack", "EaseOutBack", "getEaseOutBack", "EaseInOutBack", "getEaseInOutBack", "EaseInElastic", "getEaseInElastic", "EaseOutElastic", "getEaseOutElastic", "EaseInOutElastic", "getEaseInOutElastic", "EaseOutBounce", "getEaseOutBounce", "EaseInBounce", "getEaseInBounce", "EaseInOutBounce", "getEaseInOutBounce"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EasingFunctionsKt {
    private static final androidx.compose.animation.core.Easing Ease = new androidx.compose.animation.core.CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseOut = new androidx.compose.animation.core.CubicBezierEasing(0.0f, 0.0f, 0.58f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseIn = new androidx.compose.animation.core.CubicBezierEasing(0.42f, 0.0f, 1.0f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInOut = new androidx.compose.animation.core.CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInSine = new androidx.compose.animation.core.CubicBezierEasing(0.12f, 0.0f, 0.39f, 0.0f);
    private static final androidx.compose.animation.core.Easing EaseOutSine = new androidx.compose.animation.core.CubicBezierEasing(0.61f, 1.0f, 0.88f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInOutSine = new androidx.compose.animation.core.CubicBezierEasing(0.37f, 0.0f, 0.63f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInCubic = new androidx.compose.animation.core.CubicBezierEasing(0.32f, 0.0f, 0.67f, 0.0f);
    private static final androidx.compose.animation.core.Easing EaseOutCubic = new androidx.compose.animation.core.CubicBezierEasing(0.33f, 1.0f, 0.68f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInOutCubic = new androidx.compose.animation.core.CubicBezierEasing(0.65f, 0.0f, 0.35f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInQuint = new androidx.compose.animation.core.CubicBezierEasing(0.64f, 0.0f, 0.78f, 0.0f);
    private static final androidx.compose.animation.core.Easing EaseOutQuint = new androidx.compose.animation.core.CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInOutQuint = new androidx.compose.animation.core.CubicBezierEasing(0.83f, 0.0f, 0.17f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInCirc = new androidx.compose.animation.core.CubicBezierEasing(0.55f, 0.0f, 1.0f, 0.45f);
    private static final androidx.compose.animation.core.Easing EaseOutCirc = new androidx.compose.animation.core.CubicBezierEasing(0.0f, 0.55f, 0.45f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInOutCirc = new androidx.compose.animation.core.CubicBezierEasing(0.85f, 0.0f, 0.15f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInQuad = new androidx.compose.animation.core.CubicBezierEasing(0.11f, 0.0f, 0.5f, 0.0f);
    private static final androidx.compose.animation.core.Easing EaseOutQuad = new androidx.compose.animation.core.CubicBezierEasing(0.5f, 1.0f, 0.89f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInOutQuad = new androidx.compose.animation.core.CubicBezierEasing(0.45f, 0.0f, 0.55f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInQuart = new androidx.compose.animation.core.CubicBezierEasing(0.5f, 0.0f, 0.75f, 0.0f);
    private static final androidx.compose.animation.core.Easing EaseOutQuart = new androidx.compose.animation.core.CubicBezierEasing(0.25f, 1.0f, 0.5f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInOutQuart = new androidx.compose.animation.core.CubicBezierEasing(0.76f, 0.0f, 0.24f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInExpo = new androidx.compose.animation.core.CubicBezierEasing(0.7f, 0.0f, 0.84f, 0.0f);
    private static final androidx.compose.animation.core.Easing EaseOutExpo = new androidx.compose.animation.core.CubicBezierEasing(0.16f, 1.0f, 0.3f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInOutExpo = new androidx.compose.animation.core.CubicBezierEasing(0.87f, 0.0f, 0.13f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInBack = new androidx.compose.animation.core.CubicBezierEasing(0.36f, 0.0f, 0.66f, -0.56f);
    private static final androidx.compose.animation.core.Easing EaseOutBack = new androidx.compose.animation.core.CubicBezierEasing(0.34f, 1.56f, 0.64f, 1.0f);
    private static final androidx.compose.animation.core.Easing EaseInOutBack = new androidx.compose.animation.core.CubicBezierEasing(0.68f, -0.6f, 0.32f, 1.6f);
    private static final androidx.compose.animation.core.Easing EaseInElastic = new androidx.compose.animation.core.Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda0
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.EasingFunctionsKt.getHighResolutionOutputSizeshNQ4ISI(f);
            return highResolutionOutputSizeshNQ4ISI;
        }
    };
    private static final androidx.compose.animation.core.Easing EaseOutElastic = new androidx.compose.animation.core.Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda1
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float inputFormats;
            inputFormats = androidx.compose.animation.core.EasingFunctionsKt.getInputFormats(f);
            return inputFormats;
        }
    };
    private static final androidx.compose.animation.core.Easing EaseInOutElastic = new androidx.compose.animation.core.Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda2
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.animation.core.EasingFunctionsKt.getHighSpeedVideoFpsRangesFor(f);
            return highSpeedVideoFpsRangesFor;
        }
    };
    private static final androidx.compose.animation.core.Easing EaseOutBounce = new androidx.compose.animation.core.Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda3
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float Camera2StreamConfigurationMap;
            Camera2StreamConfigurationMap = androidx.compose.animation.core.EasingFunctionsKt.Camera2StreamConfigurationMap(f);
            return Camera2StreamConfigurationMap;
        }
    };
    private static final androidx.compose.animation.core.Easing EaseInBounce = new androidx.compose.animation.core.Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda4
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.animation.core.EasingFunctionsKt.getHighSpeedVideoFpsRanges(f);
            return highSpeedVideoFpsRanges;
        }
    };
    private static final androidx.compose.animation.core.Easing EaseInOutBounce = new androidx.compose.animation.core.Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda5
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.animation.core.EasingFunctionsKt.getHighSpeedVideoSizes(f);
            return highSpeedVideoSizes;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Camera2StreamConfigurationMap(float f) {
        if (f < 0.36363637f) {
            return 7.5625f * f * f;
        }
        if (f < 0.72727275f) {
            float f2 = f - 0.54545456f;
            return (7.5625f * f2 * f2) + 0.75f;
        }
        if (f < 0.90909094f) {
            float f3 = f - 0.8181818f;
            return (7.5625f * f3 * f3) + 0.9375f;
        }
        float f4 = f - 0.95454544f;
        return (7.5625f * f4 * f4) + 0.984375f;
    }

    public static final androidx.compose.animation.core.Easing getEase() {
        return Ease;
    }

    public static final androidx.compose.animation.core.Easing getEaseOut() {
        return EaseOut;
    }

    public static final androidx.compose.animation.core.Easing getEaseIn() {
        return EaseIn;
    }

    public static final androidx.compose.animation.core.Easing getEaseInOut() {
        return EaseInOut;
    }

    public static final androidx.compose.animation.core.Easing getEaseInSine() {
        return EaseInSine;
    }

    public static final androidx.compose.animation.core.Easing getEaseOutSine() {
        return EaseOutSine;
    }

    public static final androidx.compose.animation.core.Easing getEaseInOutSine() {
        return EaseInOutSine;
    }

    public static final androidx.compose.animation.core.Easing getEaseInCubic() {
        return EaseInCubic;
    }

    public static final androidx.compose.animation.core.Easing getEaseOutCubic() {
        return EaseOutCubic;
    }

    public static final androidx.compose.animation.core.Easing getEaseInOutCubic() {
        return EaseInOutCubic;
    }

    public static final androidx.compose.animation.core.Easing getEaseInQuint() {
        return EaseInQuint;
    }

    public static final androidx.compose.animation.core.Easing getEaseOutQuint() {
        return EaseOutQuint;
    }

    public static final androidx.compose.animation.core.Easing getEaseInOutQuint() {
        return EaseInOutQuint;
    }

    public static final androidx.compose.animation.core.Easing getEaseInCirc() {
        return EaseInCirc;
    }

    public static final androidx.compose.animation.core.Easing getEaseOutCirc() {
        return EaseOutCirc;
    }

    public static final androidx.compose.animation.core.Easing getEaseInOutCirc() {
        return EaseInOutCirc;
    }

    public static final androidx.compose.animation.core.Easing getEaseInQuad() {
        return EaseInQuad;
    }

    public static final androidx.compose.animation.core.Easing getEaseOutQuad() {
        return EaseOutQuad;
    }

    public static final androidx.compose.animation.core.Easing getEaseInOutQuad() {
        return EaseInOutQuad;
    }

    public static final androidx.compose.animation.core.Easing getEaseInQuart() {
        return EaseInQuart;
    }

    public static final androidx.compose.animation.core.Easing getEaseOutQuart() {
        return EaseOutQuart;
    }

    public static final androidx.compose.animation.core.Easing getEaseInOutQuart() {
        return EaseInOutQuart;
    }

    public static final androidx.compose.animation.core.Easing getEaseInExpo() {
        return EaseInExpo;
    }

    public static final androidx.compose.animation.core.Easing getEaseOutExpo() {
        return EaseOutExpo;
    }

    public static final androidx.compose.animation.core.Easing getEaseInOutExpo() {
        return EaseInOutExpo;
    }

    public static final androidx.compose.animation.core.Easing getEaseInBack() {
        return EaseInBack;
    }

    public static final androidx.compose.animation.core.Easing getEaseOutBack() {
        return EaseOutBack;
    }

    public static final androidx.compose.animation.core.Easing getEaseInOutBack() {
        return EaseInOutBack;
    }

    public static final androidx.compose.animation.core.Easing getEaseInElastic() {
        return EaseInElastic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighResolutionOutputSizeshNQ4ISI(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        float f2 = f * 10.0f;
        return (float) ((-((float) java.lang.Math.pow(2.0d, f2 - 10.0f))) * java.lang.Math.sin((f2 - 10.75f) * 2.0943951023931953d));
    }

    public static final androidx.compose.animation.core.Easing getEaseOutElastic() {
        return EaseOutElastic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getInputFormats(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        return (float) ((((float) java.lang.Math.pow(2.0d, (-10.0f) * f)) * java.lang.Math.sin(((f * 10.0f) - 0.75f) * 2.0943951023931953d)) + 1.0d);
    }

    public static final androidx.compose.animation.core.Easing getEaseInOutElastic() {
        return EaseInOutElastic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRangesFor(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        if (0.0f <= f && f <= 0.5f) {
            float f2 = f * 20.0f;
            return (float) ((-(((float) java.lang.Math.pow(2.0d, f2 - 10.0f)) * java.lang.Math.sin((f2 - 11.125f) * 1.3962634015954636d))) / 2.0d);
        }
        return ((float) ((((float) java.lang.Math.pow(2.0d, ((-20.0f) * f) + 10.0f)) * java.lang.Math.sin(((f * 20.0f) - 11.125f) * 1.3962634015954636d)) / 2.0d)) + 1.0f;
    }

    public static final androidx.compose.animation.core.Easing getEaseOutBounce() {
        return EaseOutBounce;
    }

    public static final androidx.compose.animation.core.Easing getEaseInBounce() {
        return EaseInBounce;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRanges(float f) {
        return 1.0f - EaseOutBounce.transform(1.0f - f);
    }

    public static final androidx.compose.animation.core.Easing getEaseInOutBounce() {
        return EaseInOutBounce;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoSizes(float f) {
        float transform;
        if (f < 0.5d) {
            transform = 1.0f - EaseOutBounce.transform(1.0f - (f * 2.0f));
        } else {
            transform = 1.0f + EaseOutBounce.transform((f * 2.0f) - 1.0f);
        }
        return transform / 2.0f;
    }
}
