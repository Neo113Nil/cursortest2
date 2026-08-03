package com.inmobi.ads;

/* loaded from: classes5.dex */
public abstract class b {
    public static final android.view.animation.Animation a(com.inmobi.ads.InMobiBanner.AnimationType animationType, float f, float f2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationType, "animationType");
        int i = com.inmobi.ads.a.f4585a[animationType.ordinal()];
        if (i == 1) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 0.5f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator());
            return alphaAnimation;
        }
        if (i == 2) {
            com.inmobi.media.C2791u1 c2791u1 = new com.inmobi.media.C2791u1(f / 2.0f, f2 / 2.0f);
            c2791u1.setDuration(500L);
            c2791u1.setFillAfter(false);
            c2791u1.setInterpolator(new android.view.animation.AccelerateInterpolator());
            return c2791u1;
        }
        if (i != 3) {
            return null;
        }
        com.inmobi.media.C2817v1 c2817v1 = new com.inmobi.media.C2817v1(f / 2.0f, f2 / 2.0f);
        c2817v1.setDuration(500L);
        c2817v1.setFillAfter(false);
        c2817v1.setInterpolator(new android.view.animation.AccelerateInterpolator());
        return c2817v1;
    }
}
