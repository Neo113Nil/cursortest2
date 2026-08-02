package androidx.transition;

/* loaded from: classes3.dex */
public abstract class Visibility extends androidx.transition.Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final java.lang.String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final java.lang.String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final java.lang.String PROPNAME_PARENT = "android:visibility:parent";
    private static final java.lang.String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        return null;
    }

    public android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        return null;
    }

    static class VisibilityInfo {
        android.view.ViewGroup Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        android.view.ViewGroup getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        boolean getHighSpeedVideoSizesFor;

        VisibilityInfo() {
        }
    }

    public Visibility() {
        this.mMode = 3;
    }

    public Visibility(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.getOutputStallDuration);
        int namedInt = androidx.core.content.res.TypedArrayUtils.getNamedInt(obtainStyledAttributes, (android.content.res.XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (namedInt != 0) {
            setMode(namedInt);
        }
    }

    public void setMode(int i) {
        if ((i & (-4)) != 0) {
            throw new java.lang.IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i;
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    private void captureValues(androidx.transition.TransitionValues transitionValues) {
        transitionValues.values.put(PROPNAME_VISIBILITY, java.lang.Integer.valueOf(transitionValues.view.getVisibility()));
        transitionValues.values.put(PROPNAME_PARENT, transitionValues.view.getParent());
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public boolean isVisible(androidx.transition.TransitionValues transitionValues) {
        if (transitionValues == null) {
            return false;
        }
        return ((java.lang.Integer) transitionValues.values.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((android.view.View) transitionValues.values.get(PROPNAME_PARENT)) != null;
    }

    private androidx.transition.Visibility.VisibilityInfo getVisibilityChangeInfo(androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        androidx.transition.Visibility.VisibilityInfo visibilityInfo = new androidx.transition.Visibility.VisibilityInfo();
        visibilityInfo.getHighSpeedVideoSizesFor = false;
        visibilityInfo.getHighResolutionOutputSizeshNQ4ISI = false;
        if (transitionValues != null && transitionValues.values.containsKey(PROPNAME_VISIBILITY)) {
            visibilityInfo.getHighSpeedVideoSizes = ((java.lang.Integer) transitionValues.values.get(PROPNAME_VISIBILITY)).intValue();
            visibilityInfo.getHighSpeedVideoFpsRangesFor = (android.view.ViewGroup) transitionValues.values.get(PROPNAME_PARENT);
        } else {
            visibilityInfo.getHighSpeedVideoSizes = -1;
            visibilityInfo.getHighSpeedVideoFpsRangesFor = null;
        }
        if (transitionValues2 != null && transitionValues2.values.containsKey(PROPNAME_VISIBILITY)) {
            visibilityInfo.getHighSpeedVideoFpsRanges = ((java.lang.Integer) transitionValues2.values.get(PROPNAME_VISIBILITY)).intValue();
            visibilityInfo.Camera2StreamConfigurationMap = (android.view.ViewGroup) transitionValues2.values.get(PROPNAME_PARENT);
        } else {
            visibilityInfo.getHighSpeedVideoFpsRanges = -1;
            visibilityInfo.Camera2StreamConfigurationMap = null;
        }
        if (transitionValues != null && transitionValues2 != null) {
            if (visibilityInfo.getHighSpeedVideoSizes != visibilityInfo.getHighSpeedVideoFpsRanges || visibilityInfo.getHighSpeedVideoFpsRangesFor != visibilityInfo.Camera2StreamConfigurationMap) {
                if (visibilityInfo.getHighSpeedVideoSizes != visibilityInfo.getHighSpeedVideoFpsRanges) {
                    if (visibilityInfo.getHighSpeedVideoSizes == 0) {
                        visibilityInfo.getHighResolutionOutputSizeshNQ4ISI = false;
                        visibilityInfo.getHighSpeedVideoSizesFor = true;
                        return visibilityInfo;
                    }
                    if (visibilityInfo.getHighSpeedVideoFpsRanges == 0) {
                        visibilityInfo.getHighResolutionOutputSizeshNQ4ISI = true;
                        visibilityInfo.getHighSpeedVideoSizesFor = true;
                        return visibilityInfo;
                    }
                } else {
                    if (visibilityInfo.Camera2StreamConfigurationMap == null) {
                        visibilityInfo.getHighResolutionOutputSizeshNQ4ISI = false;
                        visibilityInfo.getHighSpeedVideoSizesFor = true;
                        return visibilityInfo;
                    }
                    if (visibilityInfo.getHighSpeedVideoFpsRangesFor == null) {
                        visibilityInfo.getHighResolutionOutputSizeshNQ4ISI = true;
                        visibilityInfo.getHighSpeedVideoSizesFor = true;
                        return visibilityInfo;
                    }
                }
            }
        } else {
            if (transitionValues == null && visibilityInfo.getHighSpeedVideoFpsRanges == 0) {
                visibilityInfo.getHighResolutionOutputSizeshNQ4ISI = true;
                visibilityInfo.getHighSpeedVideoSizesFor = true;
                return visibilityInfo;
            }
            if (transitionValues2 == null && visibilityInfo.getHighSpeedVideoSizes == 0) {
                visibilityInfo.getHighResolutionOutputSizeshNQ4ISI = false;
                visibilityInfo.getHighSpeedVideoSizesFor = true;
            }
        }
        return visibilityInfo;
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        androidx.transition.Visibility.VisibilityInfo visibilityChangeInfo = getVisibilityChangeInfo(transitionValues, transitionValues2);
        if (!visibilityChangeInfo.getHighSpeedVideoSizesFor) {
            return null;
        }
        if (visibilityChangeInfo.getHighSpeedVideoFpsRangesFor == null && visibilityChangeInfo.Camera2StreamConfigurationMap == null) {
            return null;
        }
        if (visibilityChangeInfo.getHighResolutionOutputSizeshNQ4ISI) {
            return onAppear(viewGroup, transitionValues, visibilityChangeInfo.getHighSpeedVideoSizes, transitionValues2, visibilityChangeInfo.getHighSpeedVideoFpsRanges);
        }
        return onDisappear(viewGroup, transitionValues, visibilityChangeInfo.getHighSpeedVideoSizes, transitionValues2, visibilityChangeInfo.getHighSpeedVideoFpsRanges);
    }

    public android.animation.Animator onAppear(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, int i, androidx.transition.TransitionValues transitionValues2, int i2) {
        if ((this.mMode & 1) != 1 || transitionValues2 == null) {
            return null;
        }
        if (transitionValues == null) {
            android.view.View view = (android.view.View) transitionValues2.view.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).getHighSpeedVideoSizesFor) {
                return null;
            }
        }
        return onAppear(viewGroup, transitionValues2.view, transitionValues, transitionValues2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x007c, code lost:
    
        if (r9.mCanRemoveViews != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, int i, androidx.transition.TransitionValues transitionValues2, int i2) {
        android.view.View view;
        boolean z;
        boolean z2;
        android.view.View view2;
        if ((this.mMode & 2) != 2 || transitionValues == null) {
            return null;
        }
        android.view.View view3 = transitionValues.view;
        android.view.View view4 = transitionValues2 != null ? transitionValues2.view : null;
        android.view.View view5 = (android.view.View) view3.getTag(androidx.transition.R.id.save_overlay_view);
        if (view5 != null) {
            view2 = null;
            z2 = true;
        } else if (view4 == null || view4.getParent() == null) {
            if (view4 != null) {
                view = null;
                z = false;
                if (z) {
                    if (view3.getParent() != null) {
                        if (view3.getParent() instanceof android.view.View) {
                            android.view.View view6 = (android.view.View) view3.getParent();
                            if (!getVisibilityChangeInfo(getTransitionValues(view6, true), getMatchedTransitionValues(view6, true)).getHighSpeedVideoSizesFor) {
                                view4 = androidx.transition.TransitionUtils.getHighSpeedVideoFpsRangesFor(viewGroup, view3, view6);
                            } else {
                                int id = view6.getId();
                                if (view6.getParent() == null) {
                                    if (id != -1) {
                                        if (viewGroup.findViewById(id) != null) {
                                        }
                                    }
                                }
                            }
                        }
                        view4 = null;
                    }
                    view5 = view3;
                    view2 = null;
                    z2 = false;
                }
                z2 = false;
                android.view.View view7 = view;
                view5 = view4;
                view2 = view7;
            }
            view4 = null;
            view = null;
            z = true;
            if (z) {
            }
            z2 = false;
            android.view.View view72 = view;
            view5 = view4;
            view2 = view72;
        } else {
            if (i2 == 4 || view3 == view4) {
                view = view4;
                z = false;
                view4 = null;
                if (z) {
                }
                z2 = false;
                android.view.View view722 = view;
                view5 = view4;
                view2 = view722;
            }
            view4 = null;
            view = null;
            z = true;
            if (z) {
            }
            z2 = false;
            android.view.View view7222 = view;
            view5 = view4;
            view2 = view7222;
        }
        if (view5 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            androidx.transition.ViewUtils.getHighSpeedVideoFpsRanges(view2, 0);
            android.animation.Animator onDisappear = onDisappear(viewGroup, view2, transitionValues, transitionValues2);
            if (onDisappear != null) {
                androidx.transition.Visibility.DisappearListener disappearListener = new androidx.transition.Visibility.DisappearListener(view2, i2);
                onDisappear.addListener(disappearListener);
                getRootTransition().addListener(disappearListener);
                return onDisappear;
            }
            androidx.transition.ViewUtils.getHighSpeedVideoFpsRanges(view2, visibility);
            return onDisappear;
        }
        if (!z2) {
            int[] iArr = (int[]) transitionValues.values.get(PROPNAME_SCREEN_LOCATION);
            int i3 = iArr[0];
            int i4 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view5.offsetLeftAndRight((i3 - iArr2[0]) - view5.getLeft());
            view5.offsetTopAndBottom((i4 - iArr2[1]) - view5.getTop());
            androidx.core.view.ViewCompat.addOverlayView(viewGroup, view5);
        }
        android.animation.Animator onDisappear2 = onDisappear(viewGroup, view5, transitionValues, transitionValues2);
        if (!z2) {
            if (onDisappear2 == null) {
                viewGroup.getOverlay().remove(view5);
                return onDisappear2;
            }
            view3.setTag(androidx.transition.R.id.save_overlay_view, view5);
            androidx.transition.Visibility.OverlayListener overlayListener = new androidx.transition.Visibility.OverlayListener(viewGroup, view5, view3);
            onDisappear2.addListener(overlayListener);
            onDisappear2.addPauseListener(overlayListener);
            getRootTransition().addListener(overlayListener);
        }
        return onDisappear2;
    }

    @Override // androidx.transition.Transition
    public boolean isTransitionRequired(androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.values.containsKey(PROPNAME_VISIBILITY) != transitionValues.values.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        androidx.transition.Visibility.VisibilityInfo visibilityChangeInfo = getVisibilityChangeInfo(transitionValues, transitionValues2);
        return visibilityChangeInfo.getHighSpeedVideoSizesFor && (visibilityChangeInfo.getHighSpeedVideoSizes == 0 || visibilityChangeInfo.getHighSpeedVideoFpsRanges == 0);
    }

    static class DisappearListener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private final int Camera2StreamConfigurationMap;
        private final android.view.ViewGroup getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRangesFor;
        private final android.view.View getHighSpeedVideoSizesFor;
        boolean getHighSpeedVideoFpsRanges = false;
        private final boolean getHighSpeedVideoSizes = true;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition transition) {
        }

        DisappearListener(android.view.View view, int i) {
            this.getHighSpeedVideoSizesFor = view;
            this.Camera2StreamConfigurationMap = i;
            this.getHighResolutionOutputSizeshNQ4ISI = (android.view.ViewGroup) view.getParent();
            getHighSpeedVideoFpsRanges(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            this.getHighSpeedVideoFpsRanges = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator, boolean z) {
            if (z) {
                androidx.transition.ViewUtils.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor, 0);
                android.view.ViewGroup viewGroup = this.getHighResolutionOutputSizeshNQ4ISI;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator, boolean z) {
            if (z) {
                return;
            }
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition transition) {
            getHighSpeedVideoFpsRanges(false);
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            androidx.transition.ViewUtils.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition transition) {
            getHighSpeedVideoFpsRanges(true);
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            androidx.transition.ViewUtils.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor, 0);
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            if (!this.getHighSpeedVideoFpsRanges) {
                androidx.transition.ViewUtils.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap);
                android.view.ViewGroup viewGroup = this.getHighResolutionOutputSizeshNQ4ISI;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            getHighSpeedVideoFpsRanges(false);
        }

        private void getHighSpeedVideoFpsRanges(boolean z) {
            android.view.ViewGroup viewGroup;
            if (!this.getHighSpeedVideoSizes || this.getHighSpeedVideoFpsRangesFor == z || (viewGroup = this.getHighResolutionOutputSizeshNQ4ISI) == null) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = z;
            androidx.transition.ViewGroupUtils.Camera2StreamConfigurationMap(viewGroup, z);
        }
    }

    class OverlayListener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private final android.view.View Camera2StreamConfigurationMap;
        private final android.view.View getHighResolutionOutputSizeshNQ4ISI;
        private final android.view.ViewGroup getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor = true;

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition transition) {
        }

        OverlayListener(android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2) {
            this.getHighSpeedVideoFpsRanges = viewGroup;
            this.Camera2StreamConfigurationMap = view;
            this.getHighResolutionOutputSizeshNQ4ISI = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(android.animation.Animator animator) {
            this.getHighSpeedVideoFpsRanges.getOverlay().remove(this.Camera2StreamConfigurationMap);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(android.animation.Animator animator) {
            if (this.Camera2StreamConfigurationMap.getParent() == null) {
                androidx.core.view.ViewCompat.addOverlayView(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
            } else {
                androidx.transition.Visibility.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator, boolean z) {
            if (z) {
                this.getHighResolutionOutputSizeshNQ4ISI.setTag(androidx.transition.R.id.save_overlay_view, this.Camera2StreamConfigurationMap);
                androidx.core.view.ViewCompat.addOverlayView(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRangesFor = true;
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition transition) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                this.getHighResolutionOutputSizeshNQ4ISI.setTag(androidx.transition.R.id.save_overlay_view, null);
                this.getHighSpeedVideoFpsRanges.getOverlay().remove(this.Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRangesFor = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            this.getHighResolutionOutputSizeshNQ4ISI.setTag(androidx.transition.R.id.save_overlay_view, null);
            this.getHighSpeedVideoFpsRanges.getOverlay().remove(this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRangesFor = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator, boolean z) {
            if (z) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.setTag(androidx.transition.R.id.save_overlay_view, null);
            this.getHighSpeedVideoFpsRanges.getOverlay().remove(this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRangesFor = false;
        }
    }
}
