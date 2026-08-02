package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lllIlIIIII implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.secured.lIIlllIlll llIIlIlIIl;

    public lllIlIIIII(com.microblink.blinkid.secured.lIIlllIlll liilllilll) {
        this.llIIlIlIIl = liilllilll;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.microblink.blinkid.util.Log.d(this.llIIlIlIIl, "Starting quad animation", new java.lang.Object[0]);
        android.animation.ValueAnimator valueAnimator = this.llIIlIlIIl.llIIlIIIll;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        com.microblink.blinkid.secured.lIIlllIlll liilllilll = this.llIIlIlIIl;
        com.microblink.blinkid.geometry.QuadrangleEvaluator quadrangleEvaluator = new com.microblink.blinkid.geometry.QuadrangleEvaluator();
        com.microblink.blinkid.secured.lIIlllIlll liilllilll2 = this.llIIlIlIIl;
        liilllilll.llIIlIIIll = android.animation.ValueAnimator.ofObject(quadrangleEvaluator, liilllilll2.lllIIIlIlI, liilllilll2.IlIllIlllI);
        com.microblink.blinkid.secured.lIIlllIlll liilllilll3 = this.llIIlIlIIl;
        liilllilll3.llIIlIIIll.setDuration(liilllilll3.lIIIIIllll);
        this.llIIlIlIIl.llIIlIIIll.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        com.microblink.blinkid.secured.lIIlllIlll liilllilll4 = this.llIIlIlIIl;
        liilllilll4.llIIlIIIll.addUpdateListener(liilllilll4);
        com.microblink.blinkid.secured.lIIlllIlll liilllilll5 = this.llIIlIlIIl;
        liilllilll5.llIIlIIIll.addListener(liilllilll5.IlIIlIIIII);
        this.llIIlIlIIl.llIIlIIIll.start();
    }
}
