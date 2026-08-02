package com.google.android.material.transition;

/* loaded from: classes8.dex */
public final class MaterialElevationScale extends com.google.android.material.transition.MaterialVisibility<com.google.android.material.transition.ScaleProvider> {
    private static final float DEFAULT_SCALE = 0.85f;
    private final boolean growing;

    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(com.google.android.material.transition.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.transition.ScaleProvider, com.google.android.material.transition.VisibilityAnimatorProvider] */
    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ com.google.android.material.transition.ScaleProvider getPrimaryAnimatorProvider() {
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

    public MaterialElevationScale(boolean z) {
        super(createPrimaryAnimatorProvider(z), createSecondaryAnimatorProvider());
        this.growing = z;
    }

    public final boolean isGrowing() {
        return this.growing;
    }

    private static com.google.android.material.transition.ScaleProvider createPrimaryAnimatorProvider(boolean z) {
        com.google.android.material.transition.ScaleProvider scaleProvider = new com.google.android.material.transition.ScaleProvider(z);
        scaleProvider.setOutgoingEndScale(0.85f);
        scaleProvider.setIncomingStartScale(0.85f);
        return scaleProvider;
    }

    private static com.google.android.material.transition.VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        return new com.google.android.material.transition.FadeProvider();
    }
}
