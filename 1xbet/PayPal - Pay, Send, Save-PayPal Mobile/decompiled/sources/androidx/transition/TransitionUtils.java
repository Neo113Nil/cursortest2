package androidx.transition;

/* loaded from: classes3.dex */
class TransitionUtils {
    private static final boolean getHighSpeedVideoFpsRanges;

    static {
        getHighSpeedVideoFpsRanges = android.os.Build.VERSION.SDK_INT >= 28;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static android.view.View getHighSpeedVideoFpsRangesFor(android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2) {
        android.view.ViewGroup viewGroup2;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        androidx.transition.ViewUtils.getHighSpeedVideoFpsRangesFor(view, matrix);
        androidx.transition.ViewUtils.Camera2StreamConfigurationMap(viewGroup, matrix);
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = java.lang.Math.round(rectF.left);
        int round2 = java.lang.Math.round(rectF.top);
        int round3 = java.lang.Math.round(rectF.right);
        int round4 = java.lang.Math.round(rectF.bottom);
        android.widget.ImageView imageView = new android.widget.ImageView(view.getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        boolean isAttachedToWindow = view.isAttachedToWindow();
        int i = 0;
        boolean z = viewGroup != null && viewGroup.isAttachedToWindow();
        android.graphics.Bitmap bitmap = null;
        if (!isAttachedToWindow) {
            if (z) {
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) view.getParent();
                int indexOfChild = viewGroup3.indexOfChild(view);
                androidx.core.view.ViewCompat.addOverlayView(viewGroup, view);
                viewGroup2 = viewGroup3;
                i = indexOfChild;
            }
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
            imageView.measure(android.view.View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
            imageView.layout(round, round2, round3, round4);
            return imageView;
        }
        viewGroup2 = null;
        int round5 = java.lang.Math.round(rectF.width());
        int round6 = java.lang.Math.round(rectF.height());
        if (round5 > 0 && round6 > 0) {
            float min = java.lang.Math.min(1.0f, 1048576.0f / (round5 * round6));
            int round7 = java.lang.Math.round(round5 * min);
            int round8 = java.lang.Math.round(round6 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (getHighSpeedVideoFpsRanges) {
                android.graphics.Picture picture = new android.graphics.Picture();
                android.graphics.Canvas beginRecording = picture.beginRecording(round7, round8);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = androidx.transition.TransitionUtils.Api28Impl.getHighSpeedVideoFpsRangesFor(picture);
            } else {
                bitmap = android.graphics.Bitmap.createBitmap(round7, round8, android.graphics.Bitmap.Config.ARGB_8888);
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (!isAttachedToWindow) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i);
        }
        if (bitmap != null) {
        }
        imageView.measure(android.view.View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    static android.animation.Animator getHighResolutionOutputSizeshNQ4ISI(android.animation.Animator animator, android.animation.Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }

    /* loaded from: classes7.dex */
    static class MatrixEvaluator implements android.animation.TypeEvaluator<android.graphics.Matrix> {
        final float[] getHighResolutionOutputSizeshNQ4ISI = new float[9];
        final float[] getHighSpeedVideoFpsRanges = new float[9];
        final android.graphics.Matrix getHighSpeedVideoFpsRangesFor = new android.graphics.Matrix();

        MatrixEvaluator() {
        }

        @Override // android.animation.TypeEvaluator
        public /* synthetic */ android.graphics.Matrix evaluate(float f, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
            matrix.getValues(this.getHighResolutionOutputSizeshNQ4ISI);
            matrix2.getValues(this.getHighSpeedVideoFpsRanges);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.getHighSpeedVideoFpsRanges;
                float f2 = fArr[i];
                float f3 = this.getHighResolutionOutputSizeshNQ4ISI[i];
                fArr[i] = f3 + ((f2 - f3) * f);
            }
            this.getHighSpeedVideoFpsRangesFor.setValues(this.getHighSpeedVideoFpsRanges);
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    private TransitionUtils() {
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.graphics.Bitmap getHighSpeedVideoFpsRangesFor(android.graphics.Picture picture) {
            return android.graphics.Bitmap.createBitmap(picture);
        }
    }
}
