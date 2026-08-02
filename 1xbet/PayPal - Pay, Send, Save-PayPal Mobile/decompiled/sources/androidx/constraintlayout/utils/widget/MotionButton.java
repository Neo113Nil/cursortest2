package androidx.constraintlayout.utils.widget;

/* loaded from: classes7.dex */
public class MotionButton extends androidx.appcompat.widget.AppCompatButton {
    android.view.ViewOutlineProvider Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private android.graphics.Path getHighSpeedVideoFpsRanges;
    android.graphics.RectF getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;

    public MotionButton(android.content.Context context) {
        super(context);
        this.getHighResolutionOutputSizeshNQ4ISI = 0.0f;
        this.getHighSpeedVideoSizes = Float.NaN;
        getHighSpeedVideoSizes(context, null);
    }

    public MotionButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighResolutionOutputSizeshNQ4ISI = 0.0f;
        this.getHighSpeedVideoSizes = Float.NaN;
        getHighSpeedVideoSizes(context, attributeSet);
    }

    public MotionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighResolutionOutputSizeshNQ4ISI = 0.0f;
        this.getHighSpeedVideoSizes = Float.NaN;
        getHighSpeedVideoSizes(context, attributeSet);
    }

    private void getHighSpeedVideoSizes(android.content.Context context, android.util.AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI != f;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        if (f != 0.0f) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = new android.graphics.Path();
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = new android.graphics.RectF();
            }
            if (this.Camera2StreamConfigurationMap == null) {
                android.view.ViewOutlineProvider viewOutlineProvider = new android.view.ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionButton.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(android.view.View view, android.graphics.Outline outline) {
                        outline.setRoundRect(0, 0, androidx.constraintlayout.utils.widget.MotionButton.this.getWidth(), androidx.constraintlayout.utils.widget.MotionButton.this.getHeight(), (java.lang.Math.min(r3, r4) * androidx.constraintlayout.utils.widget.MotionButton.this.getHighResolutionOutputSizeshNQ4ISI) / 2.0f);
                    }
                };
                this.Camera2StreamConfigurationMap = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (java.lang.Math.min(width, height) * this.getHighResolutionOutputSizeshNQ4ISI) / 2.0f;
            this.getHighSpeedVideoFpsRangesFor.set(0.0f, 0.0f, width, height);
            this.getHighSpeedVideoFpsRanges.reset();
            this.getHighSpeedVideoFpsRanges.addRoundRect(this.getHighSpeedVideoFpsRangesFor, min, min, android.graphics.Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRound(float f) {
        if (java.lang.Float.isNaN(f)) {
            this.getHighSpeedVideoSizes = f;
            float f2 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.getHighSpeedVideoSizes != f;
        this.getHighSpeedVideoSizes = f;
        if (f != 0.0f) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = new android.graphics.Path();
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = new android.graphics.RectF();
            }
            if (this.Camera2StreamConfigurationMap == null) {
                android.view.ViewOutlineProvider viewOutlineProvider = new android.view.ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionButton.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(android.view.View view, android.graphics.Outline outline) {
                        outline.setRoundRect(0, 0, androidx.constraintlayout.utils.widget.MotionButton.this.getWidth(), androidx.constraintlayout.utils.widget.MotionButton.this.getHeight(), androidx.constraintlayout.utils.widget.MotionButton.this.getHighSpeedVideoSizes);
                    }
                };
                this.Camera2StreamConfigurationMap = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.getHighSpeedVideoFpsRangesFor.set(0.0f, 0.0f, getWidth(), getHeight());
            this.getHighSpeedVideoFpsRanges.reset();
            android.graphics.Path path = this.getHighSpeedVideoFpsRanges;
            android.graphics.RectF rectF = this.getHighSpeedVideoFpsRangesFor;
            float f3 = this.getHighSpeedVideoSizes;
            path.addRoundRect(rectF, f3, f3, android.graphics.Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public float getRoundPercent() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public float getRound() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }
}
