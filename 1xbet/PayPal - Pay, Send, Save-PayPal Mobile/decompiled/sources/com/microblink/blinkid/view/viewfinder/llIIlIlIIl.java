package com.microblink.blinkid.view.viewfinder;

/* loaded from: classes10.dex */
public final class llIIlIlIIl implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ com.microblink.blinkid.view.viewfinder.RectangleViewfinder llIIlIlIIl;

    public llIIlIlIIl(com.microblink.blinkid.view.viewfinder.RectangleViewfinder rectangleViewfinder) {
        this.llIIlIlIIl = rectangleViewfinder;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        android.graphics.Paint paint;
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        paint = this.llIIlIlIIl.getOutputMinFrameDuration;
        paint.setColor(intValue);
    }
}
