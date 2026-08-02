package com.airbnb.lottie.configurations.reducemotion;

/* loaded from: classes7.dex */
public class SystemReducedMotionOption implements com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption {
    @Override // com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption
    public com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode getCurrentReducedMotionMode(android.content.Context context) {
        if (context == null || com.airbnb.lottie.utils.Utils.getAnimationScale(context) != 0.0f) {
            return com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode.STANDARD_MOTION;
        }
        return com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode.REDUCED_MOTION;
    }
}
