package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.cL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1092cL extends AnimatorListenerAdapter {
    public static String[] A02 = {"XPcb7u", "1EqmHb2eknRLZguZZ09OTS3RJ6PZDacc", "q716qXT4J9ut1OK6cu8TQ8z", "ll75T4DF", "819G9oTFaahwgvqYm0vS8", "2zY5AuZMZiedj3zrg1jXmGR85zyyFWFf", "4jbusEaCntQ", "MMYtKoyK6XiZYZ9RjQwnamveqLTwrKqj"};
    public final /* synthetic */ C4K A00;
    public final /* synthetic */ boolean A01;

    public C1092cL(C4K c4k, boolean z) {
        this.A00 = c4k;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        LJ lj;
        LJ lj2;
        super.onAnimationEnd(animator);
        C4K c4k = this.A00;
        z = this.A00.A0B;
        c4k.A0r(z, true);
        if (this.A01) {
            return;
        }
        C4K c4k2 = this.A00;
        if (A02[1].charAt(10) == 't') {
            throw new RuntimeException();
        }
        A02[4] = "";
        lj = c4k2.A06;
        if (lj != null) {
            lj2 = this.A00.A06;
            lj2.destroy();
        }
    }
}
