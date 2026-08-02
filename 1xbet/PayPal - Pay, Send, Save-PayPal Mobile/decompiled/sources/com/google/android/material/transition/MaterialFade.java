package com.google.android.material.transition;

/* loaded from: classes8.dex */
public final class MaterialFade extends com.google.android.material.transition.MaterialVisibility<com.google.android.material.transition.FadeProvider> {
    private static final float DEFAULT_FADE_END_THRESHOLD_ENTER = 0.3f;
    private static final float DEFAULT_START_SCALE = 0.8f;
    private static final int DEFAULT_THEMED_INCOMING_DURATION_ATTR = com.google.android.material.R.attr.motionDurationMedium4;
    private static final int DEFAULT_THEMED_OUTGOING_DURATION_ATTR = com.google.android.material.R.attr.motionDurationShort3;
    private static final int DEFAULT_THEMED_INCOMING_EASING_ATTR = com.google.android.material.R.attr.motionEasingEmphasizedDecelerateInterpolator;
    private static final int DEFAULT_THEMED_OUTGOING_EASING_ATTR = com.google.android.material.R.attr.motionEasingEmphasizedAccelerateInterpolator;

    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(com.google.android.material.transition.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.transition.FadeProvider, com.google.android.material.transition.VisibilityAnimatorProvider] */
    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ com.google.android.material.transition.FadeProvider getPrimaryAnimatorProvider() {
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

    public MaterialFade() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    private static com.google.android.material.transition.FadeProvider createPrimaryAnimatorProvider() {
        com.google.android.material.transition.FadeProvider fadeProvider = new com.google.android.material.transition.FadeProvider();
        fadeProvider.setIncomingEndThreshold(0.3f);
        return fadeProvider;
    }

    private static com.google.android.material.transition.VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        com.google.android.material.transition.ScaleProvider scaleProvider = new com.google.android.material.transition.ScaleProvider();
        scaleProvider.setScaleOnDisappear(false);
        scaleProvider.setIncomingStartScale(0.8f);
        return scaleProvider;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    final int getDurationThemeAttrResId(boolean z) {
        if (z) {
            return DEFAULT_THEMED_INCOMING_DURATION_ATTR;
        }
        return DEFAULT_THEMED_OUTGOING_DURATION_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    final int getEasingThemeAttrResId(boolean z) {
        if (z) {
            return DEFAULT_THEMED_INCOMING_EASING_ATTR;
        }
        return DEFAULT_THEMED_OUTGOING_EASING_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    final android.animation.TimeInterpolator getDefaultEasingInterpolator(boolean z) {
        return com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR;
    }
}
