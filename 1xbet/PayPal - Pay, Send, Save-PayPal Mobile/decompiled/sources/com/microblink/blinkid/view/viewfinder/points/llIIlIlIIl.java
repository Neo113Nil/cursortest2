package com.microblink.blinkid.view.viewfinder.points;

/* loaded from: classes10.dex */
public final class llIIlIlIIl implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.view.viewfinder.points.PointSetView llIIlIlIIl;

    public llIIlIlIIl(com.microblink.blinkid.view.viewfinder.points.PointSetView pointSetView) {
        this.llIIlIlIIl = pointSetView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.animation.ValueAnimator valueAnimator;
        int i;
        int i2;
        int i3;
        int i4;
        android.animation.ValueAnimator valueAnimator2;
        android.animation.ValueAnimator valueAnimator3;
        android.animation.ValueAnimator valueAnimator4;
        android.animation.ValueAnimator valueAnimator5;
        android.animation.ValueAnimator valueAnimator6;
        valueAnimator = this.llIIlIlIIl.getInputSizeshNQ4ISI;
        if (valueAnimator != null) {
            valueAnimator6 = this.llIIlIlIIl.getInputSizeshNQ4ISI;
            valueAnimator6.cancel();
        }
        com.microblink.blinkid.view.viewfinder.points.PointSetView pointSetView = this.llIIlIlIIl;
        com.microblink.blinkid.secured.lIIIllIlIl liiillilil = new com.microblink.blinkid.secured.lIIIllIlIl(pointSetView);
        i = this.llIIlIlIIl.getOutputStallDuration;
        i2 = this.llIIlIlIIl.getOutputFormats;
        com.microblink.blinkid.secured.IlIllIIIIl ilIllIIIIl = new com.microblink.blinkid.secured.IlIllIIIIl(i, i2);
        i3 = this.llIIlIlIIl.getOutputFormats;
        i4 = this.llIIlIlIIl.getOutputStallDuration;
        pointSetView.getInputSizeshNQ4ISI = android.animation.ValueAnimator.ofObject(liiillilil, ilIllIIIIl, new com.microblink.blinkid.secured.IlIllIIIIl(i3, i4));
        valueAnimator2 = this.llIIlIlIIl.getInputSizeshNQ4ISI;
        valueAnimator2.setDuration(250L);
        valueAnimator3 = this.llIIlIlIIl.getInputSizeshNQ4ISI;
        valueAnimator3.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        valueAnimator4 = this.llIIlIlIIl.getInputSizeshNQ4ISI;
        valueAnimator4.addUpdateListener(this.llIIlIlIIl);
        valueAnimator5 = this.llIIlIlIIl.getInputSizeshNQ4ISI;
        valueAnimator5.start();
    }
}
