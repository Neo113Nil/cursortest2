package com.microblink.blinkid.view.viewfinder;

/* loaded from: classes10.dex */
public final class IlIllIlIIl implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ com.microblink.blinkid.view.viewfinder.RectangleViewfinder llIIlIlIIl;

    public IlIllIlIIl(com.microblink.blinkid.view.viewfinder.RectangleViewfinder rectangleViewfinder) {
        this.llIIlIlIIl = rectangleViewfinder;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i;
        int i2;
        float f;
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.microblink.blinkid.view.viewfinder.RectangleViewfinder rectangleViewfinder = this.llIIlIlIIl;
        i = rectangleViewfinder.getHighResolutionOutputSizeshNQ4ISI;
        rectangleViewfinder.getInputFormats = i + intValue;
        com.microblink.blinkid.view.viewfinder.RectangleViewfinder rectangleViewfinder2 = this.llIIlIlIIl;
        i2 = rectangleViewfinder2.getHighSpeedVideoSizesFor;
        f = this.llIIlIlIIl.getOutputMinFrameDurationlomOqCM;
        rectangleViewfinder2.getOutputStallDurationlomOqCM = (int) ((intValue * f) + i2);
        this.llIIlIlIIl.invalidate();
    }
}
