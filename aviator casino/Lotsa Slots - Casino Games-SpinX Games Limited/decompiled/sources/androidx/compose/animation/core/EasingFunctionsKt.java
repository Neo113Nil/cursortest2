package androidx.compose.animation.core;

/* compiled from: EasingFunctions.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\bE\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\"\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0011\u0010\u000e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0003\"\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0003\"\u0011\u0010\u0012\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0003\"\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0003\"\u0011\u0010\u0016\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0003\"\u0011\u0010\u0018\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0003\"\u0011\u0010\u001a\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0003\"\u0011\u0010\u001c\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0003\"\u0011\u0010\u001e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0003\"\u0011\u0010 \u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0003\"\u0011\u0010\"\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0003\"\u0011\u0010$\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0003\"\u0011\u0010&\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0003\"\u0011\u0010(\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0003\"\u0011\u0010*\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0003\"\u0011\u0010,\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0003\"\u0011\u0010.\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0003\"\u0011\u00100\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0003\"\u0011\u00102\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0003\"\u0011\u00104\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0003\"\u0011\u00106\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0003\"\u0011\u00108\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0003\"\u0011\u0010:\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0003\"\u0011\u0010<\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0003\"\u0011\u0010>\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0003\"\u0011\u0010@\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0003\"\u0011\u0010B\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0003\"\u0011\u0010D\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0003¨\u0006F"}, d2 = {"Ease", "Landroidx/compose/animation/core/Easing;", "getEase", "()Landroidx/compose/animation/core/Easing;", "EaseIn", "getEaseIn", "EaseInBack", "getEaseInBack", "EaseInBounce", "getEaseInBounce", "EaseInCirc", "getEaseInCirc", "EaseInCubic", "getEaseInCubic", "EaseInElastic", "getEaseInElastic", "EaseInExpo", "getEaseInExpo", "EaseInOut", "getEaseInOut", "EaseInOutBack", "getEaseInOutBack", "EaseInOutBounce", "getEaseInOutBounce", "EaseInOutCirc", "getEaseInOutCirc", "EaseInOutCubic", "getEaseInOutCubic", "EaseInOutElastic", "getEaseInOutElastic", "EaseInOutExpo", "getEaseInOutExpo", "EaseInOutQuad", "getEaseInOutQuad", "EaseInOutQuart", "getEaseInOutQuart", "EaseInOutQuint", "getEaseInOutQuint", "EaseInOutSine", "getEaseInOutSine", "EaseInQuad", "getEaseInQuad", "EaseInQuart", "getEaseInQuart", "EaseInQuint", "getEaseInQuint", "EaseInSine", "getEaseInSine", "EaseOut", "getEaseOut", "EaseOutBack", "getEaseOutBack", "EaseOutBounce", "getEaseOutBounce", "EaseOutCirc", "getEaseOutCirc", "EaseOutCubic", "getEaseOutCubic", "EaseOutElastic", "getEaseOutElastic", "EaseOutExpo", "getEaseOutExpo", "EaseOutQuad", "getEaseOutQuad", "EaseOutQuart", "getEaseOutQuart", "EaseOutQuint", "getEaseOutQuint", "EaseOutSine", "getEaseOutSine", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
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
            float EaseInElastic$lambda$0;
            EaseInElastic$lambda$0 = androidx.compose.animation.core.EasingFunctionsKt.EaseInElastic$lambda$0(f);
            return EaseInElastic$lambda$0;
        }
    };
    private static final androidx.compose.animation.core.Easing EaseOutElastic = new androidx.compose.animation.core.Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda1
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float EaseOutElastic$lambda$1;
            EaseOutElastic$lambda$1 = androidx.compose.animation.core.EasingFunctionsKt.EaseOutElastic$lambda$1(f);
            return EaseOutElastic$lambda$1;
        }
    };
    private static final androidx.compose.animation.core.Easing EaseInOutElastic = new androidx.compose.animation.core.Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda2
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float EaseInOutElastic$lambda$2;
            EaseInOutElastic$lambda$2 = androidx.compose.animation.core.EasingFunctionsKt.EaseInOutElastic$lambda$2(f);
            return EaseInOutElastic$lambda$2;
        }
    };
    private static final androidx.compose.animation.core.Easing EaseOutBounce = new androidx.compose.animation.core.Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda3
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float EaseOutBounce$lambda$3;
            EaseOutBounce$lambda$3 = androidx.compose.animation.core.EasingFunctionsKt.EaseOutBounce$lambda$3(f);
            return EaseOutBounce$lambda$3;
        }
    };
    private static final androidx.compose.animation.core.Easing EaseInBounce = new androidx.compose.animation.core.Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda4
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float EaseInBounce$lambda$4;
            EaseInBounce$lambda$4 = androidx.compose.animation.core.EasingFunctionsKt.EaseInBounce$lambda$4(f);
            return EaseInBounce$lambda$4;
        }
    };
    private static final androidx.compose.animation.core.Easing EaseInOutBounce = new androidx.compose.animation.core.Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda5
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float EaseInOutBounce$lambda$5;
            EaseInOutBounce$lambda$5 = androidx.compose.animation.core.EasingFunctionsKt.EaseInOutBounce$lambda$5(f);
            return EaseInOutBounce$lambda$5;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseOutBounce$lambda$3(float f) {
        float f2;
        float f3;
        if (f < 0.36363637f) {
            return 7.5625f * f * f;
        }
        if (f < 0.72727275f) {
            float f4 = f - 0.54545456f;
            f2 = 7.5625f * f4 * f4;
            f3 = 0.75f;
        } else if (f < 0.90909094f) {
            float f5 = f - 0.8181818f;
            f2 = 7.5625f * f5 * f5;
            f3 = 0.9375f;
        } else {
            float f6 = f - 0.95454544f;
            f2 = 7.5625f * f6 * f6;
            f3 = 0.984375f;
        }
        return f2 + f3;
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
    public static final float EaseInElastic$lambda$0(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        float f2 = f * 10.0f;
        return (float) ((-((float) java.lang.Math.pow(2.0f, f2 - 10.0f))) * java.lang.Math.sin((f2 - 10.75f) * 2.0943951023931953d));
    }

    public static final androidx.compose.animation.core.Easing getEaseOutElastic() {
        return EaseOutElastic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseOutElastic$lambda$1(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        return (float) ((((float) java.lang.Math.pow(2.0f, (-10.0f) * f)) * java.lang.Math.sin(((f * 10.0f) - 0.75f) * 2.0943951023931953d)) + 1.0f);
    }

    public static final androidx.compose.animation.core.Easing getEaseInOutElastic() {
        return EaseInOutElastic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInOutElastic$lambda$2(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        if (0.0f <= f && f <= 0.5f) {
            float f2 = f * 20.0f;
            return (float) ((-(((float) java.lang.Math.pow(r0, f2 - 10.0f)) * java.lang.Math.sin((f2 - 11.125f) * 1.3962634015954636d))) / 2.0f);
        }
        return ((float) ((((float) java.lang.Math.pow(r8, ((-20.0f) * f) + 10.0f)) * java.lang.Math.sin(((f * 20.0f) - 11.125f) * 1.3962634015954636d)) / 2.0f)) + 1.0f;
    }

    public static final androidx.compose.animation.core.Easing getEaseOutBounce() {
        return EaseOutBounce;
    }

    public static final androidx.compose.animation.core.Easing getEaseInBounce() {
        return EaseInBounce;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInBounce$lambda$4(float f) {
        return 1 - EaseOutBounce.transform(1.0f - f);
    }

    public static final androidx.compose.animation.core.Easing getEaseInOutBounce() {
        return EaseInOutBounce;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInOutBounce$lambda$5(float f) {
        float transform;
        if (f < 0.5d) {
            transform = 1 - EaseOutBounce.transform(1.0f - (f * 2.0f));
        } else {
            transform = 1 + EaseOutBounce.transform((f * 2.0f) - 1.0f);
        }
        return transform / 2.0f;
    }
}
