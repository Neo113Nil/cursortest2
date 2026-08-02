package com.google.android.material.transition.platform;

/* loaded from: classes9.dex */
public final class ScaleProvider implements com.google.android.material.transition.platform.VisibilityAnimatorProvider {
    private boolean growing;
    private float incomingEndScale;
    private float incomingStartScale;
    private float outgoingEndScale;
    private float outgoingStartScale;
    private boolean scaleOnDisappear;

    public ScaleProvider() {
        this(true);
    }

    public ScaleProvider(boolean z) {
        this.outgoingStartScale = 1.0f;
        this.outgoingEndScale = 1.1f;
        this.incomingStartScale = 0.8f;
        this.incomingEndScale = 1.0f;
        this.scaleOnDisappear = true;
        this.growing = z;
    }

    public final boolean isGrowing() {
        return this.growing;
    }

    public final void setGrowing(boolean z) {
        this.growing = z;
    }

    public final boolean isScaleOnDisappear() {
        return this.scaleOnDisappear;
    }

    public final void setScaleOnDisappear(boolean z) {
        this.scaleOnDisappear = z;
    }

    public final float getOutgoingStartScale() {
        return this.outgoingStartScale;
    }

    public final void setOutgoingStartScale(float f) {
        this.outgoingStartScale = f;
    }

    public final float getOutgoingEndScale() {
        return this.outgoingEndScale;
    }

    public final void setOutgoingEndScale(float f) {
        this.outgoingEndScale = f;
    }

    public final float getIncomingStartScale() {
        return this.incomingStartScale;
    }

    public final void setIncomingStartScale(float f) {
        this.incomingStartScale = f;
    }

    public final float getIncomingEndScale() {
        return this.incomingEndScale;
    }

    public final void setIncomingEndScale(float f) {
        this.incomingEndScale = f;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public final android.animation.Animator createAppear(android.view.ViewGroup viewGroup, android.view.View view) {
        if (this.growing) {
            return createScaleAnimator(view, this.incomingStartScale, this.incomingEndScale);
        }
        return createScaleAnimator(view, this.outgoingEndScale, this.outgoingStartScale);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public final android.animation.Animator createDisappear(android.view.ViewGroup viewGroup, android.view.View view) {
        if (!this.scaleOnDisappear) {
            return null;
        }
        if (this.growing) {
            return createScaleAnimator(view, this.outgoingStartScale, this.outgoingEndScale);
        }
        return createScaleAnimator(view, this.incomingEndScale, this.incomingStartScale);
    }

    private static android.animation.Animator createScaleAnimator(final android.view.View view, float f, float f2) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        android.animation.ObjectAnimator ofPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(view, android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_X, scaleX * f, scaleX * f2), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_Y, f * scaleY, f2 * scaleY));
        ofPropertyValuesHolder.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.ScaleProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
            }
        });
        return ofPropertyValuesHolder;
    }
}
