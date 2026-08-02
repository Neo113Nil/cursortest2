package com.google.android.material.transition;

/* loaded from: classes8.dex */
public final class MaterialSharedAxis extends com.google.android.material.transition.MaterialVisibility<com.google.android.material.transition.VisibilityAnimatorProvider> {
    private static final int DEFAULT_THEMED_DURATION_ATTR = com.google.android.material.R.attr.motionDurationLong1;
    private static final int DEFAULT_THEMED_EASING_ATTR = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    private final int axis;
    private final boolean forward;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Axis {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(com.google.android.material.transition.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public final /* bridge */ /* synthetic */ com.google.android.material.transition.VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
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

    public MaterialSharedAxis(int i, boolean z) {
        super(createPrimaryAnimatorProvider(i, z), createSecondaryAnimatorProvider());
        this.axis = i;
        this.forward = z;
    }

    public final int getAxis() {
        return this.axis;
    }

    public final boolean isForward() {
        return this.forward;
    }

    private static com.google.android.material.transition.VisibilityAnimatorProvider createPrimaryAnimatorProvider(int i, boolean z) {
        if (i == 0) {
            return new com.google.android.material.transition.SlideDistanceProvider(z ? androidx.core.view.GravityCompat.END : androidx.core.view.GravityCompat.START);
        }
        if (i == 1) {
            return new com.google.android.material.transition.SlideDistanceProvider(z ? 80 : 48);
        }
        if (i == 2) {
            return new com.google.android.material.transition.ScaleProvider(z);
        }
        throw new java.lang.IllegalArgumentException("Invalid axis: ".concat(java.lang.String.valueOf(i)));
    }

    private static com.google.android.material.transition.VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        return new com.google.android.material.transition.FadeThroughProvider();
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
