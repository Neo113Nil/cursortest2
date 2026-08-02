package com.github.mikephil.charting.animation;

/* loaded from: classes8.dex */
public class Easing {
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction Linear = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.1
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return f;
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInQuad = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.2
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return f * f;
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutQuad = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.3
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (-f) * (f - 2.0f);
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutQuad = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.4
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return 0.5f * f2 * f2;
            }
            float f3 = f2 - 1.0f;
            return ((f3 * (f3 - 2.0f)) - 1.0f) * (-0.5f);
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInCubic = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.5
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (float) java.lang.Math.pow(f, 3.0d);
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutCubic = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.6
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return ((float) java.lang.Math.pow(f - 1.0f, 3.0d)) + 1.0f;
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutCubic = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.7
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float pow;
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                pow = (float) java.lang.Math.pow(f2, 3.0d);
            } else {
                pow = ((float) java.lang.Math.pow(f2 - 2.0f, 3.0d)) + 2.0f;
            }
            return pow * 0.5f;
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInQuart = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.8
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (float) java.lang.Math.pow(f, 4.0d);
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutQuart = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.9
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return -(((float) java.lang.Math.pow(f - 1.0f, 4.0d)) - 1.0f);
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutQuart = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.10
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float pow;
            float f2;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                pow = (float) java.lang.Math.pow(f3, 4.0d);
                f2 = 0.5f;
            } else {
                pow = ((float) java.lang.Math.pow(f3 - 2.0f, 4.0d)) - 2.0f;
                f2 = -0.5f;
            }
            return pow * f2;
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInSine = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.11
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (-((float) java.lang.Math.cos(f * 1.5707963267948966d))) + 1.0f;
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutSine = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.12
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (float) java.lang.Math.sin(f * 1.5707963267948966d);
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutSine = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.13
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (((float) java.lang.Math.cos(f * 3.141592653589793d)) - 1.0f) * (-0.5f);
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInExpo = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.14
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            return (float) java.lang.Math.pow(2.0d, (f - 1.0f) * 10.0f);
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutExpo = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.15
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (f == 1.0f) {
                return 1.0f;
            }
            return -((float) java.lang.Math.pow(2.0d, (f + 1.0f) * (-10.0f)));
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutExpo = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.16
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2;
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            if (f * 2.0f < 1.0f) {
                f2 = (float) java.lang.Math.pow(2.0d, (r8 - 1.0f) * 10.0f);
            } else {
                f2 = (-((float) java.lang.Math.pow(2.0d, (r8 - 1.0f) * (-10.0f)))) + 2.0f;
            }
            return f2 * 0.5f;
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInCirc = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.17
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return -(((float) java.lang.Math.sqrt(1.0f - (f * f))) - 1.0f);
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutCirc = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.18
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (float) java.lang.Math.sqrt(1.0f - (f2 * f2));
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutCirc = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.19
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float sqrt;
            float f2;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                sqrt = ((float) java.lang.Math.sqrt(1.0f - (f3 * f3))) - 1.0f;
                f2 = -0.5f;
            } else {
                float f4 = f3 - 2.0f;
                sqrt = ((float) java.lang.Math.sqrt(1.0f - (f4 * f4))) + 1.0f;
                f2 = 0.5f;
            }
            return sqrt * f2;
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInElastic = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.20
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f2 = f - 1.0f;
            return -(((float) java.lang.Math.pow(2.0d, 10.0f * f2)) * ((float) java.lang.Math.sin(((f2 - (((float) java.lang.Math.asin(1.0d)) * 0.047746483f)) * 6.2831855f) / 0.3f)));
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutElastic = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.21
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            return (((float) java.lang.Math.pow(2.0d, (-10.0f) * f)) * ((float) java.lang.Math.sin(((f - (((float) java.lang.Math.asin(1.0d)) * 0.047746483f)) * 6.2831855f) / 0.3f))) + 1.0f;
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutElastic = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.22
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            float f2 = f * 2.0f;
            if (f2 == 2.0f) {
                return 1.0f;
            }
            float asin = ((float) java.lang.Math.asin(1.0d)) * 0.07161972f;
            if (f2 < 1.0f) {
                float f3 = f2 - 1.0f;
                return ((float) java.lang.Math.pow(2.0d, 10.0f * f3)) * ((float) java.lang.Math.sin(((f3 * 1.0f) - asin) * 6.2831855f * 2.2222223f)) * (-0.5f);
            }
            float f4 = f2 - 1.0f;
            return (((float) java.lang.Math.pow(2.0d, (-10.0f) * f4)) * 0.5f * ((float) java.lang.Math.sin(((f4 * 1.0f) - asin) * 6.2831855f * 2.2222223f))) + 1.0f;
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInBack = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.23
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return f * f * ((f * 2.70158f) - 1.70158f);
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutBack = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.24
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * ((f2 * 2.70158f) + 1.70158f)) + 1.0f;
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutBack = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.25
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return f2 * f2 * ((f2 * 3.5949094f) - 2.5949094f) * 0.5f;
            }
            float f3 = f2 - 2.0f;
            return ((f3 * f3 * ((f3 * 3.5949094f) + 2.5949094f)) + 2.0f) * 0.5f;
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInBounce = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.26
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return 1.0f - com.github.mikephil.charting.animation.Easing.EaseOutBounce.getInterpolation(1.0f - f);
        }
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseOutBounce = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.27
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
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
    };
    public static final com.github.mikephil.charting.animation.Easing.EasingFunction EaseInOutBounce = new com.github.mikephil.charting.animation.Easing.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.28
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (f < 0.5f) {
                return com.github.mikephil.charting.animation.Easing.EaseInBounce.getInterpolation(f * 2.0f) * 0.5f;
            }
            return (com.github.mikephil.charting.animation.Easing.EaseOutBounce.getInterpolation((f * 2.0f) - 1.0f) * 0.5f) + 0.5f;
        }
    };

    public interface EasingFunction extends android.animation.TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        float getInterpolation(float f);
    }
}
