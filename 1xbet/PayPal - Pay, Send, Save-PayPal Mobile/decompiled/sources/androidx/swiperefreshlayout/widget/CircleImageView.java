package androidx.swiperefreshlayout.widget;

/* loaded from: classes7.dex */
class CircleImageView extends android.widget.ImageView {
    private android.view.animation.Animation.AnimationListener getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    CircleImageView(android.content.Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        this.getHighSpeedVideoFpsRangesFor = (int) (3.5f * f);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(androidx.swiperefreshlayout.R.styleable.SwipeRefreshLayout);
        this.getHighSpeedVideoSizes = obtainStyledAttributes.getColor(androidx.swiperefreshlayout.R.styleable.SwipeRefreshLayout_swipeRefreshLayoutProgressSpinnerBackgroundColor, -328966);
        obtainStyledAttributes.recycle();
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
        androidx.core.view.ViewCompat.setElevation(this, f * 4.0f);
        shapeDrawable.getPaint().setColor(this.getHighSpeedVideoSizes);
        androidx.core.view.ViewCompat.setBackground(this, shapeDrawable);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setAnimationListener(android.view.animation.Animation.AnimationListener animationListener) {
        this.getHighSpeedVideoFpsRanges = animationListener;
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        android.view.animation.Animation.AnimationListener animationListener = this.getHighSpeedVideoFpsRanges;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        android.view.animation.Animation.AnimationListener animationListener = this.getHighSpeedVideoFpsRanges;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof android.graphics.drawable.ShapeDrawable) {
            ((android.graphics.drawable.ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.getHighSpeedVideoSizes = i;
        }
    }

    static class OvalShadow extends android.graphics.drawable.shapes.OvalShape {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private android.graphics.Paint getHighSpeedVideoFpsRanges;
        private androidx.swiperefreshlayout.widget.CircleImageView getHighSpeedVideoFpsRangesFor;

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            float f3 = ((int) f) / 2;
            this.getHighSpeedVideoFpsRanges.setShader(new android.graphics.RadialGradient(f3, f3, this.getHighResolutionOutputSizeshNQ4ISI, new int[]{1023410176, 0}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(android.graphics.Canvas canvas, android.graphics.Paint paint) {
            float width = this.getHighSpeedVideoFpsRangesFor.getWidth() / 2;
            float height = this.getHighSpeedVideoFpsRangesFor.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.getHighSpeedVideoFpsRanges);
            canvas.drawCircle(width, height, r0 - this.getHighResolutionOutputSizeshNQ4ISI, paint);
        }
    }
}
