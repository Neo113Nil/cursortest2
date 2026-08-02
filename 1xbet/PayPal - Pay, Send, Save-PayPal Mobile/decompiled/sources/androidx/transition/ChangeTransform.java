package androidx.transition;

/* loaded from: classes7.dex */
public class ChangeTransform extends androidx.transition.Transition {
    boolean getHighSpeedVideoFpsRangesFor;
    private android.graphics.Matrix getHighSpeedVideoSizesFor;
    private boolean getInputSizeshNQ4ISI;
    private static final java.lang.String[] getHighSpeedVideoSizes = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    private static final android.util.Property<androidx.transition.ChangeTransform.PathAnimatorMatrix, float[]> getHighResolutionOutputSizeshNQ4ISI = new android.util.Property<androidx.transition.ChangeTransform.PathAnimatorMatrix, float[]>(float[].class, "nonTranslations") { // from class: androidx.transition.ChangeTransform.1
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ float[] get(androidx.transition.ChangeTransform.PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        public /* synthetic */ void set(androidx.transition.ChangeTransform.PathAnimatorMatrix pathAnimatorMatrix, float[] fArr) {
            androidx.transition.ChangeTransform.PathAnimatorMatrix pathAnimatorMatrix2 = pathAnimatorMatrix;
            float[] fArr2 = fArr;
            java.lang.System.arraycopy(fArr2, 0, pathAnimatorMatrix2.getHighSpeedVideoFpsRangesFor, 0, fArr2.length);
            pathAnimatorMatrix2.getHighSpeedVideoFpsRangesFor();
        }
    };
    private static final android.util.Property<androidx.transition.ChangeTransform.PathAnimatorMatrix, android.graphics.PointF> Camera2StreamConfigurationMap = new android.util.Property<androidx.transition.ChangeTransform.PathAnimatorMatrix, android.graphics.PointF>(android.graphics.PointF.class, "translations") { // from class: androidx.transition.ChangeTransform.2
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.PointF get(androidx.transition.ChangeTransform.PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        public /* synthetic */ void set(androidx.transition.ChangeTransform.PathAnimatorMatrix pathAnimatorMatrix, android.graphics.PointF pointF) {
            androidx.transition.ChangeTransform.PathAnimatorMatrix pathAnimatorMatrix2 = pathAnimatorMatrix;
            android.graphics.PointF pointF2 = pointF;
            pathAnimatorMatrix2.getHighSpeedVideoFpsRanges = pointF2.x;
            pathAnimatorMatrix2.getHighResolutionOutputSizeshNQ4ISI = pointF2.y;
            pathAnimatorMatrix2.getHighSpeedVideoFpsRangesFor();
        }
    };
    private static final boolean getHighSpeedVideoFpsRanges = true;

    public ChangeTransform() {
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getInputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizesFor = new android.graphics.Matrix();
    }

    public ChangeTransform(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getInputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizesFor = new android.graphics.Matrix();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.getHighSpeedVideoFpsRangesFor);
        org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) attributeSet;
        this.getHighSpeedVideoFpsRangesFor = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.getInputSizeshNQ4ISI = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    public boolean getReparentWithOverlay() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setReparentWithOverlay(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public boolean getReparent() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setReparent(boolean z) {
        this.getInputSizeshNQ4ISI = z;
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
        return getHighSpeedVideoSizes;
    }

    private void getHighSpeedVideoSizes(androidx.transition.TransitionValues transitionValues) {
        android.view.View view = transitionValues.view;
        if (view.getVisibility() != 8) {
            transitionValues.values.put("android:changeTransform:parent", view.getParent());
            transitionValues.values.put("android:changeTransform:transforms", new androidx.transition.ChangeTransform.Transforms(view));
            android.graphics.Matrix matrix = view.getMatrix();
            transitionValues.values.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new android.graphics.Matrix(matrix));
            if (this.getInputSizeshNQ4ISI) {
                android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                androidx.transition.ViewUtils.getHighSpeedVideoFpsRangesFor((android.view.ViewGroup) view.getParent(), matrix2);
                matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
                transitionValues.values.put("android:changeTransform:parentMatrix", matrix2);
                transitionValues.values.put("android:changeTransform:intermediateMatrix", view.getTag(androidx.transition.R.id.transition_transform));
                transitionValues.values.put("android:changeTransform:intermediateParentMatrix", view.getTag(androidx.transition.R.id.parent_matrix));
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        getHighSpeedVideoSizes(transitionValues);
        if (getHighSpeedVideoFpsRanges) {
            return;
        }
        ((android.view.ViewGroup) transitionValues.view.getParent()).startViewTransition(transitionValues.view);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        getHighSpeedVideoSizes(transitionValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        boolean z;
        android.graphics.Matrix matrix;
        android.graphics.Matrix matrix2;
        android.graphics.Matrix matrix3;
        android.graphics.Matrix matrix4;
        android.graphics.Matrix matrix5;
        android.view.ViewGroup viewGroup2;
        java.lang.Object obj;
        android.animation.ObjectAnimator objectAnimator = null;
        if (transitionValues != null && transitionValues2 != null && transitionValues.values.containsKey("android:changeTransform:parent") && transitionValues2.values.containsKey("android:changeTransform:parent")) {
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) transitionValues.values.get("android:changeTransform:parent");
            android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) transitionValues2.values.get("android:changeTransform:parent");
            if (this.getInputSizeshNQ4ISI) {
                z = true;
                if (isValidTarget(viewGroup3)) {
                }
                matrix = (android.graphics.Matrix) transitionValues.values.get("android:changeTransform:intermediateMatrix");
                if (matrix != null) {
                    transitionValues.values.put("android:changeTransform:matrix", matrix);
                }
                matrix2 = (android.graphics.Matrix) transitionValues.values.get("android:changeTransform:intermediateParentMatrix");
                if (matrix2 != null) {
                    transitionValues.values.put("android:changeTransform:parentMatrix", matrix2);
                }
                if (z) {
                    android.graphics.Matrix matrix6 = (android.graphics.Matrix) transitionValues2.values.get("android:changeTransform:parentMatrix");
                    transitionValues2.view.setTag(androidx.transition.R.id.parent_matrix, matrix6);
                    android.graphics.Matrix matrix7 = this.getHighSpeedVideoSizesFor;
                    matrix7.reset();
                    matrix6.invert(matrix7);
                    android.graphics.Matrix matrix8 = (android.graphics.Matrix) transitionValues.values.get("android:changeTransform:matrix");
                    if (matrix8 == null) {
                        matrix8 = new android.graphics.Matrix();
                        transitionValues.values.put("android:changeTransform:matrix", matrix8);
                    }
                    matrix8.postConcat((android.graphics.Matrix) transitionValues.values.get("android:changeTransform:parentMatrix"));
                    matrix8.postConcat(matrix7);
                }
                matrix3 = (android.graphics.Matrix) transitionValues.values.get("android:changeTransform:matrix");
                matrix4 = (android.graphics.Matrix) transitionValues2.values.get("android:changeTransform:matrix");
                if (matrix3 == null) {
                    matrix3 = androidx.transition.MatrixUtils.getHighSpeedVideoFpsRanges;
                }
                if (matrix4 == null) {
                    matrix4 = androidx.transition.MatrixUtils.getHighSpeedVideoFpsRanges;
                }
                matrix5 = matrix4;
                if (matrix3.equals(matrix5)) {
                    androidx.transition.ChangeTransform.Transforms transforms = (androidx.transition.ChangeTransform.Transforms) transitionValues2.values.get("android:changeTransform:transforms");
                    android.view.View view = transitionValues2.view;
                    getHighSpeedVideoFpsRanges(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
                    float[] fArr = new float[9];
                    matrix3.getValues(fArr);
                    float[] fArr2 = new float[9];
                    matrix5.getValues(fArr2);
                    androidx.transition.ChangeTransform.PathAnimatorMatrix pathAnimatorMatrix = new androidx.transition.ChangeTransform.PathAnimatorMatrix(view, fArr);
                    viewGroup2 = viewGroup3;
                    objectAnimator = android.animation.ObjectAnimator.ofPropertyValuesHolder(pathAnimatorMatrix, android.animation.PropertyValuesHolder.ofObject(getHighResolutionOutputSizeshNQ4ISI, new androidx.transition.FloatArrayEvaluator(new float[9]), fArr, fArr2), androidx.transition.PropertyValuesHolderUtils.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap, getPathMotion().getPath(fArr[2], fArr[5], fArr2[2], fArr2[5])));
                    obj = "android:changeTransform:parentMatrix";
                    androidx.transition.ChangeTransform.Listener listener = new androidx.transition.ChangeTransform.Listener(view, transforms, pathAnimatorMatrix, matrix5, z, this.getHighSpeedVideoFpsRangesFor);
                    objectAnimator.addListener(listener);
                    objectAnimator.addPauseListener(listener);
                } else {
                    viewGroup2 = viewGroup3;
                    obj = "android:changeTransform:parentMatrix";
                }
                if (z || objectAnimator == null || !this.getHighSpeedVideoFpsRangesFor) {
                    if (!getHighSpeedVideoFpsRanges) {
                        viewGroup2.endViewTransition(transitionValues.view);
                    }
                } else {
                    android.view.View view2 = transitionValues2.view;
                    android.graphics.Matrix matrix9 = new android.graphics.Matrix((android.graphics.Matrix) transitionValues2.values.get(obj));
                    androidx.transition.ViewUtils.Camera2StreamConfigurationMap(viewGroup, matrix9);
                    androidx.transition.GhostView highSpeedVideoFpsRangesFor = androidx.transition.GhostViewUtils.getHighSpeedVideoFpsRangesFor(view2, viewGroup, matrix9);
                    if (highSpeedVideoFpsRangesFor != null) {
                        highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI((android.view.ViewGroup) transitionValues.values.get("android:changeTransform:parent"), transitionValues.view);
                        androidx.transition.Transition transition = this;
                        while (transition.mParent != null) {
                            transition = transition.mParent;
                        }
                        transition.addListener(new androidx.transition.ChangeTransform.GhostListener(view2, highSpeedVideoFpsRangesFor));
                        if (getHighSpeedVideoFpsRanges) {
                            if (transitionValues.view != transitionValues2.view) {
                                androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(transitionValues.view, 0.0f);
                            }
                            androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(view2, 1.0f);
                        }
                    }
                    return objectAnimator;
                }
            }
            z = false;
            matrix = (android.graphics.Matrix) transitionValues.values.get("android:changeTransform:intermediateMatrix");
            if (matrix != null) {
            }
            matrix2 = (android.graphics.Matrix) transitionValues.values.get("android:changeTransform:intermediateParentMatrix");
            if (matrix2 != null) {
            }
            if (z) {
            }
            matrix3 = (android.graphics.Matrix) transitionValues.values.get("android:changeTransform:matrix");
            matrix4 = (android.graphics.Matrix) transitionValues2.values.get("android:changeTransform:matrix");
            if (matrix3 == null) {
            }
            if (matrix4 == null) {
            }
            matrix5 = matrix4;
            if (matrix3.equals(matrix5)) {
            }
            if (z) {
            }
            if (!getHighSpeedVideoFpsRanges) {
            }
        }
        return objectAnimator;
    }

    static void getHighSpeedVideoSizes(android.view.View view) {
        getHighSpeedVideoFpsRanges(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    static void getHighSpeedVideoFpsRanges(android.view.View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        androidx.core.view.ViewCompat.setTranslationZ(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    static class Transforms {
        final float Camera2StreamConfigurationMap;
        final float getHighResolutionOutputSizeshNQ4ISI;
        final float getHighSpeedVideoFpsRanges;
        final float getHighSpeedVideoFpsRangesFor;
        final float getHighSpeedVideoSizes;
        final float getHighSpeedVideoSizesFor;
        final float getInputFormats;
        final float getInputSizeshNQ4ISI;

        Transforms(android.view.View view) {
            this.getInputFormats = view.getTranslationX();
            this.getHighSpeedVideoSizesFor = view.getTranslationY();
            this.getInputSizeshNQ4ISI = androidx.core.view.ViewCompat.getTranslationZ(view);
            this.getHighSpeedVideoSizes = view.getScaleX();
            this.getHighSpeedVideoFpsRangesFor = view.getScaleY();
            this.Camera2StreamConfigurationMap = view.getRotationX();
            this.getHighSpeedVideoFpsRanges = view.getRotationY();
            this.getHighResolutionOutputSizeshNQ4ISI = view.getRotation();
        }

        public final void getHighSpeedVideoSizes(android.view.View view) {
            androidx.transition.ChangeTransform.getHighSpeedVideoFpsRanges(view, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.transition.ChangeTransform.Transforms)) {
                return false;
            }
            androidx.transition.ChangeTransform.Transforms transforms = (androidx.transition.ChangeTransform.Transforms) obj;
            return transforms.getInputFormats == this.getInputFormats && transforms.getHighSpeedVideoSizesFor == this.getHighSpeedVideoSizesFor && transforms.getInputSizeshNQ4ISI == this.getInputSizeshNQ4ISI && transforms.getHighSpeedVideoSizes == this.getHighSpeedVideoSizes && transforms.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoFpsRangesFor && transforms.Camera2StreamConfigurationMap == this.Camera2StreamConfigurationMap && transforms.getHighSpeedVideoFpsRanges == this.getHighSpeedVideoFpsRanges && transforms.getHighResolutionOutputSizeshNQ4ISI == this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public int hashCode() {
            float f = this.getInputFormats;
            int floatToIntBits = f != 0.0f ? java.lang.Float.floatToIntBits(f) : 0;
            float f2 = this.getHighSpeedVideoSizesFor;
            int floatToIntBits2 = f2 != 0.0f ? java.lang.Float.floatToIntBits(f2) : 0;
            float f3 = this.getInputSizeshNQ4ISI;
            int floatToIntBits3 = f3 != 0.0f ? java.lang.Float.floatToIntBits(f3) : 0;
            float f4 = this.getHighSpeedVideoSizes;
            int floatToIntBits4 = f4 != 0.0f ? java.lang.Float.floatToIntBits(f4) : 0;
            float f5 = this.getHighSpeedVideoFpsRangesFor;
            int floatToIntBits5 = f5 != 0.0f ? java.lang.Float.floatToIntBits(f5) : 0;
            float f6 = this.Camera2StreamConfigurationMap;
            int floatToIntBits6 = f6 != 0.0f ? java.lang.Float.floatToIntBits(f6) : 0;
            float f7 = this.getHighSpeedVideoFpsRanges;
            int floatToIntBits7 = f7 != 0.0f ? java.lang.Float.floatToIntBits(f7) : 0;
            float f8 = this.getHighResolutionOutputSizeshNQ4ISI;
            return (((((((((((((floatToIntBits * 31) + floatToIntBits2) * 31) + floatToIntBits3) * 31) + floatToIntBits4) * 31) + floatToIntBits5) * 31) + floatToIntBits6) * 31) + floatToIntBits7) * 31) + (f8 != 0.0f ? java.lang.Float.floatToIntBits(f8) : 0);
        }
    }

    static class GhostListener extends androidx.transition.TransitionListenerAdapter {
        private android.view.View Camera2StreamConfigurationMap;
        private androidx.transition.GhostView getHighSpeedVideoFpsRanges;

        GhostListener(android.view.View view, androidx.transition.GhostView ghostView) {
            this.Camera2StreamConfigurationMap = view;
            this.getHighSpeedVideoFpsRanges = ghostView;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
            transition.removeListener(this);
            androidx.transition.GhostViewUtils.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
            this.Camera2StreamConfigurationMap.setTag(androidx.transition.R.id.transition_transform, null);
            this.Camera2StreamConfigurationMap.setTag(androidx.transition.R.id.parent_matrix, null);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition transition) {
            this.getHighSpeedVideoFpsRanges.setVisibility(4);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition transition) {
            this.getHighSpeedVideoFpsRanges.setVisibility(0);
        }
    }

    static class PathAnimatorMatrix {
        private final android.view.View Camera2StreamConfigurationMap;
        float getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoFpsRanges;
        final float[] getHighSpeedVideoFpsRangesFor;
        final android.graphics.Matrix getHighSpeedVideoSizes = new android.graphics.Matrix();

        PathAnimatorMatrix(android.view.View view, float[] fArr) {
            this.Camera2StreamConfigurationMap = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.getHighSpeedVideoFpsRangesFor = fArr2;
            this.getHighSpeedVideoFpsRanges = fArr2[2];
            this.getHighResolutionOutputSizeshNQ4ISI = fArr2[5];
            getHighSpeedVideoFpsRangesFor();
        }

        final void getHighSpeedVideoFpsRangesFor() {
            float[] fArr = this.getHighSpeedVideoFpsRangesFor;
            fArr[2] = this.getHighSpeedVideoFpsRanges;
            fArr[5] = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes.setValues(fArr);
            androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        }
    }

    static class Listener extends android.animation.AnimatorListenerAdapter {
        private final android.graphics.Matrix Camera2StreamConfigurationMap;
        private final boolean getHighResolutionOutputSizeshNQ4ISI;
        private final android.graphics.Matrix getHighSpeedVideoFpsRanges = new android.graphics.Matrix();
        private final androidx.transition.ChangeTransform.PathAnimatorMatrix getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes;
        private final androidx.transition.ChangeTransform.Transforms getHighSpeedVideoSizesFor;
        private final boolean getInputSizeshNQ4ISI;
        private final android.view.View getOutputFormats;

        Listener(android.view.View view, androidx.transition.ChangeTransform.Transforms transforms, androidx.transition.ChangeTransform.PathAnimatorMatrix pathAnimatorMatrix, android.graphics.Matrix matrix, boolean z, boolean z2) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getInputSizeshNQ4ISI = z2;
            this.getOutputFormats = view;
            this.getHighSpeedVideoSizesFor = transforms;
            this.getHighSpeedVideoFpsRangesFor = pathAnimatorMatrix;
            this.Camera2StreamConfigurationMap = matrix;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            this.getHighSpeedVideoSizes = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            if (!this.getHighSpeedVideoSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI && this.getInputSizeshNQ4ISI) {
                    getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
                } else {
                    this.getOutputFormats.setTag(androidx.transition.R.id.transition_transform, null);
                    this.getOutputFormats.setTag(androidx.transition.R.id.parent_matrix, null);
                }
            }
            androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(this.getOutputFormats, (android.graphics.Matrix) null);
            this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(this.getOutputFormats);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(android.animation.Animator animator) {
            getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(android.animation.Animator animator) {
            androidx.transition.ChangeTransform.getHighSpeedVideoSizes(this.getOutputFormats);
        }

        private void getHighSpeedVideoFpsRangesFor(android.graphics.Matrix matrix) {
            this.getHighSpeedVideoFpsRanges.set(matrix);
            this.getOutputFormats.setTag(androidx.transition.R.id.transition_transform, this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(this.getOutputFormats);
        }
    }
}
