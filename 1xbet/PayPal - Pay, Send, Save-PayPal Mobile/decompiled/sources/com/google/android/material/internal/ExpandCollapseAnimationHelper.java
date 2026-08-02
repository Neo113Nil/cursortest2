package com.google.android.material.internal;

/* loaded from: classes8.dex */
public class ExpandCollapseAnimationHelper {
    private android.animation.ValueAnimator.AnimatorUpdateListener additionalUpdateListener;
    private final android.view.View collapsedView;
    private int collapsedViewOffsetY;
    private long duration;
    private final android.view.View expandedView;
    private int expandedViewOffsetY;
    private final java.util.List<android.animation.AnimatorListenerAdapter> listeners = new java.util.ArrayList();
    private final java.util.List<android.view.View> endAnchoredViews = new java.util.ArrayList();

    public ExpandCollapseAnimationHelper(android.view.View view, android.view.View view2) {
        this.collapsedView = view;
        this.expandedView = view2;
    }

    public android.animation.Animator getExpandAnimator() {
        android.animation.AnimatorSet animatorSet = getAnimatorSet(true);
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.material.internal.ExpandCollapseAnimationHelper.this.expandedView.setVisibility(0);
            }
        });
        addListeners(animatorSet, this.listeners);
        return animatorSet;
    }

    public android.animation.Animator getCollapseAnimator() {
        android.animation.AnimatorSet animatorSet = getAnimatorSet(false);
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.internal.ExpandCollapseAnimationHelper.this.expandedView.setVisibility(8);
            }
        });
        addListeners(animatorSet, this.listeners);
        return animatorSet;
    }

    public com.google.android.material.internal.ExpandCollapseAnimationHelper setDuration(long j) {
        this.duration = j;
        return this;
    }

    public com.google.android.material.internal.ExpandCollapseAnimationHelper addListener(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.listeners.add(animatorListenerAdapter);
        return this;
    }

    public com.google.android.material.internal.ExpandCollapseAnimationHelper addEndAnchoredViews(android.view.View... viewArr) {
        java.util.Collections.addAll(this.endAnchoredViews, viewArr);
        return this;
    }

    public com.google.android.material.internal.ExpandCollapseAnimationHelper addEndAnchoredViews(java.util.Collection<android.view.View> collection) {
        this.endAnchoredViews.addAll(collection);
        return this;
    }

    public com.google.android.material.internal.ExpandCollapseAnimationHelper setAdditionalUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.additionalUpdateListener = animatorUpdateListener;
        return this;
    }

    public com.google.android.material.internal.ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int i) {
        this.collapsedViewOffsetY = i;
        return this;
    }

    public com.google.android.material.internal.ExpandCollapseAnimationHelper setExpandedViewOffsetY(int i) {
        this.expandedViewOffsetY = i;
        return this;
    }

    private android.animation.AnimatorSet getAnimatorSet(boolean z) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(getExpandCollapseAnimator(z), getExpandedViewChildrenAlphaAnimator(z), getEndAnchoredViewsTranslateAnimator(z));
        return animatorSet;
    }

    private android.animation.Animator getExpandCollapseAnimator(boolean z) {
        android.graphics.Rect calculateRectFromBounds = com.google.android.material.internal.ViewUtils.calculateRectFromBounds(this.collapsedView, this.collapsedViewOffsetY);
        android.graphics.Rect calculateRectFromBounds2 = com.google.android.material.internal.ViewUtils.calculateRectFromBounds(this.expandedView, this.expandedViewOffsetY);
        final android.graphics.Rect rect = new android.graphics.Rect(calculateRectFromBounds);
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new com.google.android.material.internal.RectEvaluator(rect), calculateRectFromBounds, calculateRectFromBounds2);
        ofObject.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.ExpandCollapseAnimationHelper$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.internal.ExpandCollapseAnimationHelper.this.m10267xeb41e2ac(rect, valueAnimator);
            }
        });
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.additionalUpdateListener;
        if (animatorUpdateListener != null) {
            ofObject.addUpdateListener(animatorUpdateListener);
        }
        ofObject.setDuration(this.duration);
        ofObject.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return ofObject;
    }

    /* renamed from: lambda$getExpandCollapseAnimator$0$com-google-android-material-internal-ExpandCollapseAnimationHelper, reason: not valid java name */
    /* synthetic */ void m10267xeb41e2ac(android.graphics.Rect rect, android.animation.ValueAnimator valueAnimator) {
        com.google.android.material.internal.ViewUtils.setBoundsFromRect(this.expandedView, rect);
    }

    private android.animation.Animator getExpandedViewChildrenAlphaAnimator(boolean z) {
        java.util.List<android.view.View> children = com.google.android.material.internal.ViewUtils.getChildren(this.expandedView);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.alphaListener(children));
        ofFloat.setDuration(this.duration);
        ofFloat.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR));
        return ofFloat;
    }

    private android.animation.Animator getEndAnchoredViewsTranslateAnimator(boolean z) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat((this.expandedView.getLeft() - this.collapsedView.getLeft()) + (this.collapsedView.getRight() - this.expandedView.getRight()), 0.0f);
        ofFloat.addUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.translationXListener(this.endAnchoredViews));
        ofFloat.setDuration(this.duration);
        ofFloat.setInterpolator(com.google.android.material.internal.ReversableAnimatedValueInterpolator.of(z, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return ofFloat;
    }

    private void addListeners(android.animation.Animator animator, java.util.List<android.animation.AnimatorListenerAdapter> list) {
        java.util.Iterator<android.animation.AnimatorListenerAdapter> it = list.iterator();
        while (it.hasNext()) {
            animator.addListener(it.next());
        }
    }
}
