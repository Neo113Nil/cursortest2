package com.inmobi.ads;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.A1;
import com.inmobi.media.C4256z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b {
    public static final Animation a(InMobiBanner.AnimationType animationType, float f, float f2) {
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        int i = a.f6439a[animationType.ordinal()];
        if (i == 1) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.5f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            return alphaAnimation;
        }
        if (i == 2) {
            C4256z1 c4256z1 = new C4256z1(f / 2.0f, f2 / 2.0f);
            c4256z1.setDuration(500L);
            c4256z1.setFillAfter(false);
            c4256z1.setInterpolator(new AccelerateInterpolator());
            return c4256z1;
        }
        if (i != 3) {
            return null;
        }
        A1 a1 = new A1(f / 2.0f, f2 / 2.0f);
        a1.setDuration(500L);
        a1.setFillAfter(false);
        a1.setInterpolator(new AccelerateInterpolator());
        return a1;
    }
}
