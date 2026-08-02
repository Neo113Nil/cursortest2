package androidx.transition;

/* loaded from: classes3.dex */
public class ChangeBounds extends androidx.transition.Transition {
    private static final android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF> Camera2StreamConfigurationMap;
    private static final android.util.Property<android.view.View, android.graphics.PointF> getHighResolutionOutputSizeshNQ4ISI;
    private static final android.util.Property<android.view.View, android.graphics.PointF> getHighSpeedVideoFpsRangesFor;
    private static final android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF> getHighSpeedVideoSizes;
    private boolean getInputFormats;
    private static final java.lang.String[] getOutputFormats = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final android.util.Property<android.view.View, android.graphics.PointF> getHighSpeedVideoFpsRanges = new android.util.Property<android.view.View, android.graphics.PointF>(android.graphics.PointF.class, com.daon.sdk.face.license.License.FEATURE_POSITION) { // from class: androidx.transition.ChangeBounds.5
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.PointF get(android.view.View view) {
            return null;
        }

        @Override // android.util.Property
        public /* synthetic */ void set(android.view.View view, android.graphics.PointF pointF) {
            android.view.View view2 = view;
            android.graphics.PointF pointF2 = pointF;
            int round = java.lang.Math.round(pointF2.x);
            int round2 = java.lang.Math.round(pointF2.y);
            androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    };
    private static final androidx.transition.RectEvaluator getHighSpeedVideoSizesFor = new androidx.transition.RectEvaluator();

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    static {
        java.lang.String str = "topLeft";
        Camera2StreamConfigurationMap = new android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF>(android.graphics.PointF.class, str) { // from class: androidx.transition.ChangeBounds.1
            @Override // android.util.Property
            public /* bridge */ /* synthetic */ android.graphics.PointF get(androidx.transition.ChangeBounds.ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public /* synthetic */ void set(androidx.transition.ChangeBounds.ViewBounds viewBounds, android.graphics.PointF pointF) {
                androidx.transition.ChangeBounds.ViewBounds viewBounds2 = viewBounds;
                android.graphics.PointF pointF2 = pointF;
                viewBounds2.getHighSpeedVideoFpsRangesFor = java.lang.Math.round(pointF2.x);
                viewBounds2.getHighSpeedVideoFpsRanges = java.lang.Math.round(pointF2.y);
                int i = viewBounds2.getInputSizeshNQ4ISI + 1;
                viewBounds2.getInputSizeshNQ4ISI = i;
                if (i == viewBounds2.Camera2StreamConfigurationMap) {
                    viewBounds2.getHighSpeedVideoSizes();
                }
            }
        };
        java.lang.String str2 = "bottomRight";
        getHighSpeedVideoSizes = new android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF>(android.graphics.PointF.class, str2) { // from class: androidx.transition.ChangeBounds.2
            @Override // android.util.Property
            public /* bridge */ /* synthetic */ android.graphics.PointF get(androidx.transition.ChangeBounds.ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public /* synthetic */ void set(androidx.transition.ChangeBounds.ViewBounds viewBounds, android.graphics.PointF pointF) {
                androidx.transition.ChangeBounds.ViewBounds viewBounds2 = viewBounds;
                android.graphics.PointF pointF2 = pointF;
                viewBounds2.getHighSpeedVideoSizes = java.lang.Math.round(pointF2.x);
                viewBounds2.getHighResolutionOutputSizeshNQ4ISI = java.lang.Math.round(pointF2.y);
                int i = viewBounds2.Camera2StreamConfigurationMap + 1;
                viewBounds2.Camera2StreamConfigurationMap = i;
                if (viewBounds2.getInputSizeshNQ4ISI == i) {
                    viewBounds2.getHighSpeedVideoSizes();
                }
            }
        };
        getHighResolutionOutputSizeshNQ4ISI = new android.util.Property<android.view.View, android.graphics.PointF>(android.graphics.PointF.class, str2) { // from class: androidx.transition.ChangeBounds.3
            @Override // android.util.Property
            public /* bridge */ /* synthetic */ android.graphics.PointF get(android.view.View view) {
                return null;
            }

            @Override // android.util.Property
            public /* synthetic */ void set(android.view.View view, android.graphics.PointF pointF) {
                android.view.View view2 = view;
                android.graphics.PointF pointF2 = pointF;
                androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(view2, view2.getLeft(), view2.getTop(), java.lang.Math.round(pointF2.x), java.lang.Math.round(pointF2.y));
            }
        };
        getHighSpeedVideoFpsRangesFor = new android.util.Property<android.view.View, android.graphics.PointF>(android.graphics.PointF.class, str) { // from class: androidx.transition.ChangeBounds.4
            @Override // android.util.Property
            public /* bridge */ /* synthetic */ android.graphics.PointF get(android.view.View view) {
                return null;
            }

            @Override // android.util.Property
            public /* synthetic */ void set(android.view.View view, android.graphics.PointF pointF) {
                android.view.View view2 = view;
                android.graphics.PointF pointF2 = pointF;
                androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(view2, java.lang.Math.round(pointF2.x), java.lang.Math.round(pointF2.y), view2.getRight(), view2.getBottom());
            }
        };
    }

    public ChangeBounds() {
        this.getInputFormats = false;
    }

    public ChangeBounds(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getInputFormats = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.Camera2StreamConfigurationMap);
        boolean namedBoolean = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, (android.content.res.XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        setResizeClip(namedBoolean);
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
        return getOutputFormats;
    }

    public void setResizeClip(boolean z) {
        this.getInputFormats = z;
    }

    public boolean getResizeClip() {
        return this.getInputFormats;
    }

    private void Camera2StreamConfigurationMap(androidx.transition.TransitionValues transitionValues) {
        android.view.View view = transitionValues.view;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        transitionValues.values.put("android:changeBounds:bounds", new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        transitionValues.values.put("android:changeBounds:parent", transitionValues.view.getParent());
        if (this.getInputFormats) {
            transitionValues.values.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        android.graphics.Rect rect;
        Camera2StreamConfigurationMap(transitionValues);
        if (!this.getInputFormats || (rect = (android.graphics.Rect) transitionValues.view.getTag(androidx.transition.R.id.transition_clip)) == null) {
            return;
        }
        transitionValues.values.put("android:changeBounds:clip", rect);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        Camera2StreamConfigurationMap(transitionValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        int i;
        int i2;
        int i3;
        int i4;
        android.animation.ObjectAnimator Camera2StreamConfigurationMap2;
        int i5;
        android.view.View view;
        android.animation.ObjectAnimator objectAnimator;
        android.animation.Animator highResolutionOutputSizeshNQ4ISI;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        java.util.Map<java.lang.String, java.lang.Object> map = transitionValues.values;
        java.util.Map<java.lang.String, java.lang.Object> map2 = transitionValues2.values;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) map.get("android:changeBounds:parent");
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        android.view.View view2 = transitionValues2.view;
        android.graphics.Rect rect = (android.graphics.Rect) transitionValues.values.get("android:changeBounds:bounds");
        android.graphics.Rect rect2 = (android.graphics.Rect) transitionValues2.values.get("android:changeBounds:bounds");
        int i6 = rect.left;
        int i7 = rect2.left;
        int i8 = rect.top;
        int i9 = rect2.top;
        int i10 = rect.right;
        int i11 = rect2.right;
        int i12 = rect.bottom;
        int i13 = rect2.bottom;
        int i14 = i10 - i6;
        int i15 = i12 - i8;
        int i16 = i11 - i7;
        int i17 = i13 - i9;
        android.graphics.Rect rect3 = (android.graphics.Rect) transitionValues.values.get("android:changeBounds:clip");
        android.graphics.Rect rect4 = (android.graphics.Rect) transitionValues2.values.get("android:changeBounds:clip");
        if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
            i = 0;
        } else {
            i = (i6 == i7 && i8 == i9) ? 0 : 1;
            if (i10 != i11 || i12 != i13) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i18 = i;
        if (i18 <= 0) {
            return null;
        }
        if (!this.getInputFormats) {
            androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(view2, i6, i8, i10, i12);
            if (i18 == 2) {
                if (i14 == i16 && i15 == i17) {
                    highResolutionOutputSizeshNQ4ISI = androidx.transition.ObjectAnimatorUtils.Camera2StreamConfigurationMap(view2, getHighSpeedVideoFpsRanges, getPathMotion().getPath(i6, i8, i7, i9));
                } else {
                    androidx.transition.ChangeBounds.ViewBounds viewBounds = new androidx.transition.ChangeBounds.ViewBounds(view2);
                    android.animation.ObjectAnimator Camera2StreamConfigurationMap3 = androidx.transition.ObjectAnimatorUtils.Camera2StreamConfigurationMap(viewBounds, Camera2StreamConfigurationMap, getPathMotion().getPath(i6, i8, i7, i9));
                    android.animation.ObjectAnimator Camera2StreamConfigurationMap4 = androidx.transition.ObjectAnimatorUtils.Camera2StreamConfigurationMap(viewBounds, getHighSpeedVideoSizes, getPathMotion().getPath(i10, i12, i11, i13));
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    animatorSet.playTogether(Camera2StreamConfigurationMap3, Camera2StreamConfigurationMap4);
                    animatorSet.addListener(new android.animation.AnimatorListenerAdapter(viewBounds) { // from class: androidx.transition.ChangeBounds.6
                        final /* synthetic */ androidx.transition.ChangeBounds.ViewBounds getHighSpeedVideoFpsRangesFor;
                        private final androidx.transition.ChangeBounds.ViewBounds mViewBounds;

                        {
                            this.getHighSpeedVideoFpsRangesFor = viewBounds;
                            this.mViewBounds = viewBounds;
                        }
                    });
                    view = view2;
                    highResolutionOutputSizeshNQ4ISI = animatorSet;
                }
            } else if (i6 != i7 || i8 != i9) {
                highResolutionOutputSizeshNQ4ISI = androidx.transition.ObjectAnimatorUtils.Camera2StreamConfigurationMap(view2, getHighSpeedVideoFpsRangesFor, getPathMotion().getPath(i6, i8, i7, i9));
            } else {
                highResolutionOutputSizeshNQ4ISI = androidx.transition.ObjectAnimatorUtils.Camera2StreamConfigurationMap(view2, getHighResolutionOutputSizeshNQ4ISI, getPathMotion().getPath(i10, i12, i11, i13));
            }
            view = view2;
        } else {
            androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(view2, i6, i8, java.lang.Math.max(i14, i16) + i6, i8 + java.lang.Math.max(i15, i17));
            if (i6 == i7 && i8 == i9) {
                i2 = i11;
                i3 = i10;
                i4 = i7;
                Camera2StreamConfigurationMap2 = null;
            } else {
                i2 = i11;
                i3 = i10;
                i4 = i7;
                Camera2StreamConfigurationMap2 = androidx.transition.ObjectAnimatorUtils.Camera2StreamConfigurationMap(view2, getHighSpeedVideoFpsRanges, getPathMotion().getPath(i6, i8, i7, i9));
            }
            boolean z = rect3 == null;
            if (z) {
                i5 = 0;
                rect3 = new android.graphics.Rect(0, 0, i14, i15);
            } else {
                i5 = 0;
            }
            boolean z2 = rect4 == null ? 1 : i5;
            android.graphics.Rect rect5 = z2 != 0 ? new android.graphics.Rect(i5, i5, i16, i17) : rect4;
            if (rect3.equals(rect5)) {
                view = view2;
                objectAnimator = null;
            } else {
                view2.setClipBounds(rect3);
                objectAnimator = android.animation.ObjectAnimator.ofObject(view2, "clipBounds", getHighSpeedVideoSizesFor, rect3, rect5);
                int i19 = i4;
                view = view2;
                androidx.transition.ChangeBounds.ClipListener clipListener = new androidx.transition.ChangeBounds.ClipListener(view2, rect3, z, rect5, z2, i6, i8, i3, i12, i19, i9, i2, i13);
                objectAnimator.addListener(clipListener);
                addListener(clipListener);
            }
            highResolutionOutputSizeshNQ4ISI = androidx.transition.TransitionUtils.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap2, objectAnimator);
        }
        if (view.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) view.getParent();
            androidx.transition.ViewGroupUtils.Camera2StreamConfigurationMap(viewGroup4, true);
            getRootTransition().addListener(new androidx.transition.ChangeBounds.SuppressLayoutListener(viewGroup4));
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    static class ViewBounds {
        int Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        private final android.view.View getHighSpeedVideoSizesFor;
        int getInputSizeshNQ4ISI;

        ViewBounds(android.view.View view) {
            this.getHighSpeedVideoSizesFor = view;
        }

        final void getHighSpeedVideoSizes() {
            androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
            this.getInputSizeshNQ4ISI = 0;
            this.Camera2StreamConfigurationMap = 0;
        }
    }

    static class ClipListener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private final int Camera2StreamConfigurationMap;
        private final android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI;
        private final boolean getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;
        private final android.graphics.Rect getHighSpeedVideoSizesFor;
        private final int getInputFormats;
        private final boolean getInputSizeshNQ4ISI;
        private final int getOutputFormats;
        private boolean getOutputMinFrameDuration;
        private final int getOutputMinFrameDurationlomOqCM;
        private final int getOutputSizes;
        private final int getOutputSizeshNQ4ISI;
        private final android.view.View getOutputStallDurationlomOqCM;

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition transition) {
        }

        ClipListener(android.view.View view, android.graphics.Rect rect, boolean z, android.graphics.Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.getOutputStallDurationlomOqCM = view;
            this.getHighSpeedVideoSizesFor = rect;
            this.getInputSizeshNQ4ISI = z;
            this.getHighResolutionOutputSizeshNQ4ISI = rect2;
            this.getHighSpeedVideoFpsRanges = z2;
            this.getOutputMinFrameDurationlomOqCM = i;
            this.getOutputSizes = i2;
            this.getOutputSizeshNQ4ISI = i3;
            this.getInputFormats = i4;
            this.getHighSpeedVideoSizes = i5;
            this.getOutputFormats = i6;
            this.getHighSpeedVideoFpsRangesFor = i7;
            this.Camera2StreamConfigurationMap = i8;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator, boolean z) {
            int max = java.lang.Math.max(this.getOutputSizeshNQ4ISI - this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRangesFor - this.getHighSpeedVideoSizes);
            int max2 = java.lang.Math.max(this.getInputFormats - this.getOutputSizes, this.Camera2StreamConfigurationMap - this.getOutputFormats);
            int i = z ? this.getHighSpeedVideoSizes : this.getOutputMinFrameDurationlomOqCM;
            int i2 = z ? this.getOutputFormats : this.getOutputSizes;
            androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(this.getOutputStallDurationlomOqCM, i, i2, max + i, max2 + i2);
            this.getOutputStallDurationlomOqCM.setClipBounds(z ? this.getHighResolutionOutputSizeshNQ4ISI : this.getHighSpeedVideoSizesFor);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator, boolean z) {
            android.graphics.Rect rect;
            if (this.getOutputMinFrameDuration) {
                return;
            }
            if (z) {
                if (!this.getInputSizeshNQ4ISI) {
                    rect = this.getHighSpeedVideoSizesFor;
                }
                rect = null;
            } else {
                if (!this.getHighSpeedVideoFpsRanges) {
                    rect = this.getHighResolutionOutputSizeshNQ4ISI;
                }
                rect = null;
            }
            this.getOutputStallDurationlomOqCM.setClipBounds(rect);
            if (z) {
                androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(this.getOutputStallDurationlomOqCM, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizes, this.getOutputSizeshNQ4ISI, this.getInputFormats);
            } else {
                androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(this.getOutputStallDurationlomOqCM, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition transition) {
            this.getOutputMinFrameDuration = true;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition transition) {
            this.getOutputStallDurationlomOqCM.setTag(androidx.transition.R.id.transition_clip, this.getOutputStallDurationlomOqCM.getClipBounds());
            this.getOutputStallDurationlomOqCM.setClipBounds(this.getHighSpeedVideoFpsRanges ? null : this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition transition) {
            android.graphics.Rect rect = (android.graphics.Rect) this.getOutputStallDurationlomOqCM.getTag(androidx.transition.R.id.transition_clip);
            this.getOutputStallDurationlomOqCM.setTag(androidx.transition.R.id.transition_clip, null);
            this.getOutputStallDurationlomOqCM.setClipBounds(rect);
        }
    }

    static class SuppressLayoutListener extends androidx.transition.TransitionListenerAdapter {
        final android.view.ViewGroup getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoSizes = false;

        SuppressLayoutListener(android.view.ViewGroup viewGroup) {
            this.getHighSpeedVideoFpsRanges = viewGroup;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition transition) {
            androidx.transition.ViewGroupUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, false);
            this.getHighSpeedVideoSizes = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
            if (!this.getHighSpeedVideoSizes) {
                androidx.transition.ViewGroupUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, false);
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition transition) {
            androidx.transition.ViewGroupUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition transition) {
            androidx.transition.ViewGroupUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, true);
        }
    }
}
