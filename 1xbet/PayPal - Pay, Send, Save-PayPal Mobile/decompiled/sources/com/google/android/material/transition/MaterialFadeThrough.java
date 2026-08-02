package com.google.android.material.transition;

/* loaded from: classes8.dex */
public final class MaterialFadeThrough extends com.google.android.material.transition.MaterialVisibility<com.google.android.material.transition.FadeThroughProvider> {
    private static final float DEFAULT_START_SCALE = 0.92f;
    private static final int DEFAULT_THEMED_DURATION_ATTR = com.google.android.material.R.attr.motionDurationLong1;
    private static final int DEFAULT_THEMED_EASING_ATTR = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator;

    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(com.google.android.material.transition.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.transition.FadeThroughProvider, com.google.android.material.transition.VisibilityAnimatorProvider] */
    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ com.google.android.material.transition.FadeThroughProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ com.google.android.material.transition.VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Transition
    public final /* bridge */ /* synthetic */ boolean isSeekingSupported() {
        return super.isSeekingSupported();
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public final /* bridge */ /* synthetic */ android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public final /* bridge */ /* synthetic */ android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(com.google.android.material.transition.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(com.google.android.material.transition.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }

    public MaterialFadeThrough() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    private static com.google.android.material.transition.FadeThroughProvider createPrimaryAnimatorProvider() {
        return new com.google.android.material.transition.FadeThroughProvider();
    }

    private static com.google.android.material.transition.VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        com.google.android.material.transition.ScaleProvider scaleProvider = new com.google.android.material.transition.ScaleProvider();
        scaleProvider.setScaleOnDisappear(false);
        scaleProvider.setIncomingStartScale(DEFAULT_START_SCALE);
        return scaleProvider;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    final int getDurationThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    final int getEasingThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_EASING_ATTR;
    }
}
