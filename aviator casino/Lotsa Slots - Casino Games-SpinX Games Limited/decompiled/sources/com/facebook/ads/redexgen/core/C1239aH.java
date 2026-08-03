package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1239aH extends android.animation.Animator {
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC1228a6 A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1241aJ A02;

    public C1239aH(com.facebook.ads.redexgen.core.C1241aJ c1241aJ, int i, com.facebook.ads.redexgen.core.InterfaceC1228a6 interfaceC1228a6) {
        this.A02 = c1241aJ;
        this.A00 = i;
        this.A01 = interfaceC1228a6;
    }

    @Override // android.animation.Animator
    public final void addListener(android.animation.Animator.AnimatorListener animatorListener) {
    }

    @Override // android.animation.Animator
    public final void cancel() {
    }

    @Override // android.animation.Animator
    public final void end() {
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        return this.A00;
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return 0L;
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        boolean z;
        z = this.A02.A04;
        return z;
    }

    @Override // android.animation.Animator
    public final android.animation.Animator setDuration(long j) {
        return null;
    }

    @Override // android.animation.Animator
    public final void setInterpolator(android.animation.TimeInterpolator timeInterpolator) {
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j) {
    }

    @Override // android.animation.Animator
    public final void setTarget(java.lang.Object obj) {
        this.A01.AK7(obj, getDuration());
    }

    @Override // android.animation.Animator
    public final void start() {
    }
}
