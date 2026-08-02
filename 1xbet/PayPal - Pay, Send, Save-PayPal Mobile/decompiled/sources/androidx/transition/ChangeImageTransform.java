package androidx.transition;

/* loaded from: classes7.dex */
public class ChangeImageTransform extends androidx.transition.Transition {
    private static final java.lang.String[] Camera2StreamConfigurationMap = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    private static final android.animation.TypeEvaluator<android.graphics.Matrix> getHighSpeedVideoSizes = new android.animation.TypeEvaluator<android.graphics.Matrix>() { // from class: androidx.transition.ChangeImageTransform.1
        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ android.graphics.Matrix evaluate(float f, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
            return null;
        }
    };
    private static final android.util.Property<android.widget.ImageView, android.graphics.Matrix> getHighResolutionOutputSizeshNQ4ISI = new android.util.Property<android.widget.ImageView, android.graphics.Matrix>(android.graphics.Matrix.class, "animatedTransform") { // from class: androidx.transition.ChangeImageTransform.2
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.Matrix get(android.widget.ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public /* synthetic */ void set(android.widget.ImageView imageView, android.graphics.Matrix matrix) {
            androidx.transition.ImageViewUtils.Camera2StreamConfigurationMap(imageView, matrix);
        }
    };

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void getHighSpeedVideoSizes(androidx.transition.TransitionValues transitionValues, boolean z) {
        android.graphics.Matrix matrix;
        android.view.View view = transitionValues.view;
        if ((view instanceof android.widget.ImageView) && view.getVisibility() == 0) {
            android.widget.ImageView imageView = (android.widget.ImageView) view;
            if (imageView.getDrawable() != null) {
                java.util.Map<java.lang.String, java.lang.Object> map = transitionValues.values;
                map.put("android:changeImageTransform:bounds", new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                android.graphics.Matrix matrix2 = z ? (android.graphics.Matrix) imageView.getTag(androidx.transition.R.id.transition_image_transform) : null;
                if (matrix2 == null) {
                    android.graphics.drawable.Drawable drawable = imageView.getDrawable();
                    if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                        int i = androidx.transition.ChangeImageTransform.AnonymousClass3.getHighSpeedVideoFpsRangesFor[imageView.getScaleType().ordinal()];
                        if (i == 1) {
                            android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
                            matrix = new android.graphics.Matrix();
                            matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                        } else if (i != 2) {
                            matrix2 = new android.graphics.Matrix(imageView.getImageMatrix());
                        } else {
                            android.graphics.drawable.Drawable drawable3 = imageView.getDrawable();
                            int intrinsicWidth = drawable3.getIntrinsicWidth();
                            float width = imageView.getWidth();
                            float f = intrinsicWidth;
                            int intrinsicHeight = drawable3.getIntrinsicHeight();
                            float height = imageView.getHeight();
                            float f2 = intrinsicHeight;
                            float max = java.lang.Math.max(width / f, height / f2);
                            int round = java.lang.Math.round((width - (f * max)) / 2.0f);
                            int round2 = java.lang.Math.round((height - (f2 * max)) / 2.0f);
                            matrix = new android.graphics.Matrix();
                            matrix.postScale(max, max);
                            matrix.postTranslate(round, round2);
                        }
                        matrix2 = matrix;
                    } else {
                        matrix2 = new android.graphics.Matrix(imageView.getImageMatrix());
                    }
                }
                map.put("android:changeImageTransform:matrix", matrix2);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        getHighSpeedVideoSizes(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        getHighSpeedVideoSizes(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
        return Camera2StreamConfigurationMap;
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        android.graphics.Rect rect = (android.graphics.Rect) transitionValues.values.get("android:changeImageTransform:bounds");
        android.graphics.Rect rect2 = (android.graphics.Rect) transitionValues2.values.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        android.graphics.Matrix matrix = (android.graphics.Matrix) transitionValues.values.get("android:changeImageTransform:matrix");
        android.graphics.Matrix matrix2 = (android.graphics.Matrix) transitionValues2.values.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) transitionValues2.view;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            if (matrix == null) {
                matrix = androidx.transition.MatrixUtils.getHighSpeedVideoFpsRanges;
            }
            if (matrix2 == null) {
                matrix2 = androidx.transition.MatrixUtils.getHighSpeedVideoFpsRanges;
            }
            android.util.Property<android.widget.ImageView, android.graphics.Matrix> property = getHighResolutionOutputSizeshNQ4ISI;
            property.set(imageView, matrix);
            android.animation.ObjectAnimator ofObject = android.animation.ObjectAnimator.ofObject(imageView, (android.util.Property<android.widget.ImageView, V>) property, (android.animation.TypeEvaluator) new androidx.transition.TransitionUtils.MatrixEvaluator(), (java.lang.Object[]) new android.graphics.Matrix[]{matrix, matrix2});
            androidx.transition.ChangeImageTransform.Listener listener = new androidx.transition.ChangeImageTransform.Listener(imageView, matrix, matrix2);
            ofObject.addListener(listener);
            ofObject.addPauseListener(listener);
            addListener(listener);
            return ofObject;
        }
        return android.animation.ObjectAnimator.ofObject(imageView, (android.util.Property<android.widget.ImageView, V>) getHighResolutionOutputSizeshNQ4ISI, (android.animation.TypeEvaluator) getHighSpeedVideoSizes, (java.lang.Object[]) new android.graphics.Matrix[]{androidx.transition.MatrixUtils.getHighSpeedVideoFpsRanges, androidx.transition.MatrixUtils.getHighSpeedVideoFpsRanges});
    }

    /* renamed from: androidx.transition.ChangeImageTransform$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[android.widget.ImageView.ScaleType.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static class Listener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private final android.widget.ImageView Camera2StreamConfigurationMap;
        private final android.graphics.Matrix getHighResolutionOutputSizeshNQ4ISI;
        private final android.graphics.Matrix getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor = true;

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition transition) {
        }

        Listener(android.widget.ImageView imageView, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
            this.Camera2StreamConfigurationMap = imageView;
            this.getHighResolutionOutputSizeshNQ4ISI = matrix;
            this.getHighSpeedVideoFpsRanges = matrix2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition transition) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                this.Camera2StreamConfigurationMap.setTag(androidx.transition.R.id.transition_image_transform, this.getHighResolutionOutputSizeshNQ4ISI);
                androidx.transition.ImageViewUtils.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition transition) {
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            this.getHighSpeedVideoFpsRangesFor = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            this.getHighSpeedVideoFpsRangesFor = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(android.animation.Animator animator) {
            this.Camera2StreamConfigurationMap.setTag(androidx.transition.R.id.transition_image_transform, (android.graphics.Matrix) ((android.animation.ObjectAnimator) animator).getAnimatedValue());
            androidx.transition.ImageViewUtils.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(android.animation.Animator animator) {
            getHighResolutionOutputSizeshNQ4ISI();
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            android.graphics.Matrix matrix = (android.graphics.Matrix) this.Camera2StreamConfigurationMap.getTag(androidx.transition.R.id.transition_image_transform);
            if (matrix != null) {
                androidx.transition.ImageViewUtils.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, matrix);
                this.Camera2StreamConfigurationMap.setTag(androidx.transition.R.id.transition_image_transform, null);
            }
        }
    }
}
