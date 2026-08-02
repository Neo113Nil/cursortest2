package androidx.constraintlayout.utils.widget;

/* loaded from: classes7.dex */
public class ImageFilterButton extends androidx.appcompat.widget.AppCompatImageButton {
    android.graphics.drawable.Drawable[] Camera2StreamConfigurationMap;
    android.graphics.drawable.LayerDrawable getHighResolutionOutputSizeshNQ4ISI;
    android.graphics.RectF getHighSpeedVideoFpsRanges;
    android.view.ViewOutlineProvider getHighSpeedVideoFpsRangesFor;
    private android.graphics.drawable.Drawable getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private android.graphics.drawable.Drawable getInputFormats;
    private float getInputSizeshNQ4ISI;
    private androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix getOutputFormats;
    private float getOutputMinFrameDuration;
    private android.graphics.Path getOutputMinFrameDurationlomOqCM;
    private float getOutputSizes;
    private float getOutputSizeshNQ4ISI;
    private float getOutputStallDuration;
    private float getOutputStallDurationlomOqCM;
    private float toString;

    public ImageFilterButton(android.content.Context context) {
        super(context);
        this.getOutputFormats = new androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix();
        this.getInputSizeshNQ4ISI = 0.0f;
        this.getOutputStallDuration = 0.0f;
        this.getOutputSizes = Float.NaN;
        this.Camera2StreamConfigurationMap = new android.graphics.drawable.Drawable[2];
        this.getHighSpeedVideoSizesFor = true;
        this.getHighSpeedVideoSizes = null;
        this.getInputFormats = null;
        this.getOutputMinFrameDuration = Float.NaN;
        this.getOutputStallDurationlomOqCM = Float.NaN;
        this.toString = Float.NaN;
        this.getOutputSizeshNQ4ISI = Float.NaN;
        getHighSpeedVideoFpsRangesFor(context, null);
    }

    public ImageFilterButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getOutputFormats = new androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix();
        this.getInputSizeshNQ4ISI = 0.0f;
        this.getOutputStallDuration = 0.0f;
        this.getOutputSizes = Float.NaN;
        this.Camera2StreamConfigurationMap = new android.graphics.drawable.Drawable[2];
        this.getHighSpeedVideoSizesFor = true;
        this.getHighSpeedVideoSizes = null;
        this.getInputFormats = null;
        this.getOutputMinFrameDuration = Float.NaN;
        this.getOutputStallDurationlomOqCM = Float.NaN;
        this.toString = Float.NaN;
        this.getOutputSizeshNQ4ISI = Float.NaN;
        getHighSpeedVideoFpsRangesFor(context, attributeSet);
    }

    public ImageFilterButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getOutputFormats = new androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix();
        this.getInputSizeshNQ4ISI = 0.0f;
        this.getOutputStallDuration = 0.0f;
        this.getOutputSizes = Float.NaN;
        this.Camera2StreamConfigurationMap = new android.graphics.drawable.Drawable[2];
        this.getHighSpeedVideoSizesFor = true;
        this.getHighSpeedVideoSizes = null;
        this.getInputFormats = null;
        this.getOutputMinFrameDuration = Float.NaN;
        this.getOutputStallDurationlomOqCM = Float.NaN;
        this.toString = Float.NaN;
        this.getOutputSizeshNQ4ISI = Float.NaN;
        getHighSpeedVideoFpsRangesFor(context, attributeSet);
    }

    private void getHighSpeedVideoFpsRangesFor(android.content.Context context, android.util.AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.getHighSpeedVideoSizes = obtainStyledAttributes.getDrawable(androidx.constraintlayout.widget.R.styleable.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_crossfade) {
                    this.getInputSizeshNQ4ISI = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index != androidx.constraintlayout.widget.R.styleable.ImageFilterView_overlay) {
                    if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_imagePanX) {
                        setImagePanX(obtainStyledAttributes.getFloat(index, this.getOutputMinFrameDuration));
                    } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_imagePanY) {
                        setImagePanY(obtainStyledAttributes.getFloat(index, this.getOutputStallDurationlomOqCM));
                    } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_imageRotate) {
                        setImageRotate(obtainStyledAttributes.getFloat(index, this.getOutputSizeshNQ4ISI));
                    } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_imageZoom) {
                        setImageZoom(obtainStyledAttributes.getFloat(index, this.toString));
                    }
                } else {
                    this.getHighSpeedVideoSizesFor = obtainStyledAttributes.getBoolean(index, this.getHighSpeedVideoSizesFor);
                }
            }
            obtainStyledAttributes.recycle();
            android.graphics.drawable.Drawable drawable = getDrawable();
            this.getInputFormats = drawable;
            if (this.getHighSpeedVideoSizes != null && drawable != null) {
                android.graphics.drawable.Drawable[] drawableArr = this.Camera2StreamConfigurationMap;
                android.graphics.drawable.Drawable mutate = getDrawable().mutate();
                this.getInputFormats = mutate;
                drawableArr[0] = mutate;
                this.Camera2StreamConfigurationMap[1] = this.getHighSpeedVideoSizes.mutate();
                android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(this.Camera2StreamConfigurationMap);
                this.getHighResolutionOutputSizeshNQ4ISI = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.getInputSizeshNQ4ISI * 255.0f));
                if (!this.getHighSpeedVideoSizesFor) {
                    this.getHighResolutionOutputSizeshNQ4ISI.getDrawable(0).setAlpha((int) ((1.0f - this.getInputSizeshNQ4ISI) * 255.0f));
                }
                super.setImageDrawable(this.getHighResolutionOutputSizeshNQ4ISI);
                return;
            }
            android.graphics.drawable.Drawable drawable2 = getDrawable();
            this.getInputFormats = drawable2;
            if (drawable2 != null) {
                android.graphics.drawable.Drawable[] drawableArr2 = this.Camera2StreamConfigurationMap;
                android.graphics.drawable.Drawable mutate2 = drawable2.mutate();
                this.getInputFormats = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    public float getImagePanX() {
        return this.getOutputMinFrameDuration;
    }

    public float getImagePanY() {
        return this.getOutputStallDurationlomOqCM;
    }

    public float getImageZoom() {
        return this.toString;
    }

    public float getImageRotate() {
        return this.getOutputSizeshNQ4ISI;
    }

    public void setImagePanX(float f) {
        this.getOutputMinFrameDuration = f;
        Camera2StreamConfigurationMap();
    }

    public void setImagePanY(float f) {
        this.getOutputStallDurationlomOqCM = f;
        Camera2StreamConfigurationMap();
    }

    public void setImageZoom(float f) {
        this.toString = f;
        Camera2StreamConfigurationMap();
    }

    public void setImageRotate(float f) {
        this.getOutputSizeshNQ4ISI = f;
        Camera2StreamConfigurationMap();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        if (this.getHighSpeedVideoSizes != null && drawable != null) {
            android.graphics.drawable.Drawable mutate = drawable.mutate();
            this.getInputFormats = mutate;
            android.graphics.drawable.Drawable[] drawableArr = this.Camera2StreamConfigurationMap;
            drawableArr[0] = mutate;
            drawableArr[1] = this.getHighSpeedVideoSizes;
            android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(this.Camera2StreamConfigurationMap);
            this.getHighResolutionOutputSizeshNQ4ISI = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.getInputSizeshNQ4ISI);
            return;
        }
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.getHighSpeedVideoSizes != null) {
            android.graphics.drawable.Drawable mutate = androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i).mutate();
            this.getInputFormats = mutate;
            android.graphics.drawable.Drawable[] drawableArr = this.Camera2StreamConfigurationMap;
            drawableArr[0] = mutate;
            drawableArr[1] = this.getHighSpeedVideoSizes;
            android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(this.Camera2StreamConfigurationMap);
            this.getHighResolutionOutputSizeshNQ4ISI = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.getInputSizeshNQ4ISI);
            return;
        }
        super.setImageResource(i);
    }

    public void setAltImageResource(int i) {
        android.graphics.drawable.Drawable mutate = androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i).mutate();
        this.getHighSpeedVideoSizes = mutate;
        android.graphics.drawable.Drawable[] drawableArr = this.Camera2StreamConfigurationMap;
        drawableArr[0] = this.getInputFormats;
        drawableArr[1] = mutate;
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(this.Camera2StreamConfigurationMap);
        this.getHighResolutionOutputSizeshNQ4ISI = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.getInputSizeshNQ4ISI);
    }

    private void Camera2StreamConfigurationMap() {
        if (java.lang.Float.isNaN(this.getOutputMinFrameDuration) && java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM) && java.lang.Float.isNaN(this.toString) && java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI)) {
            setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        } else {
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        if (java.lang.Float.isNaN(this.getOutputMinFrameDuration) && java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM) && java.lang.Float.isNaN(this.toString) && java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI)) {
            return;
        }
        float f = java.lang.Float.isNaN(this.getOutputMinFrameDuration) ? 0.0f : this.getOutputMinFrameDuration;
        float f2 = java.lang.Float.isNaN(this.getOutputStallDurationlomOqCM) ? 0.0f : this.getOutputStallDurationlomOqCM;
        float f3 = java.lang.Float.isNaN(this.toString) ? 1.0f : this.toString;
        float f4 = java.lang.Float.isNaN(this.getOutputSizeshNQ4ISI) ? 0.0f : this.getOutputSizeshNQ4ISI;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f3 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate((((f * (width - f6)) + width) - f6) * 0.5f, (((f2 * (height - f7)) + height) - f7) * 0.5f);
        matrix.postRotate(f4, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    public void setSaturation(float f) {
        this.getOutputFormats.getHighSpeedVideoFpsRangesFor = f;
        this.getOutputFormats.getHighSpeedVideoSizes(this);
    }

    public float getSaturation() {
        return this.getOutputFormats.getHighSpeedVideoFpsRangesFor;
    }

    public void setContrast(float f) {
        this.getOutputFormats.getHighSpeedVideoSizes = f;
        this.getOutputFormats.getHighSpeedVideoSizes(this);
    }

    public float getContrast() {
        return this.getOutputFormats.getHighSpeedVideoSizes;
    }

    public void setWarmth(float f) {
        this.getOutputFormats.getOutputMinFrameDuration = f;
        this.getOutputFormats.getHighSpeedVideoSizes(this);
    }

    public float getWarmth() {
        return this.getOutputFormats.getOutputMinFrameDuration;
    }

    public void setCrossfade(float f) {
        this.getInputSizeshNQ4ISI = f;
        if (this.Camera2StreamConfigurationMap != null) {
            if (!this.getHighSpeedVideoSizesFor) {
                this.getHighResolutionOutputSizeshNQ4ISI.getDrawable(0).setAlpha((int) ((1.0f - this.getInputSizeshNQ4ISI) * 255.0f));
            }
            this.getHighResolutionOutputSizeshNQ4ISI.getDrawable(1).setAlpha((int) (this.getInputSizeshNQ4ISI * 255.0f));
            super.setImageDrawable(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public float getCrossfade() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setBrightness(float f) {
        this.getOutputFormats.getHighSpeedVideoFpsRanges = f;
        this.getOutputFormats.getHighSpeedVideoSizes(this);
    }

    public void setRoundPercent(float f) {
        boolean z = this.getOutputStallDuration != f;
        this.getOutputStallDuration = f;
        if (f != 0.0f) {
            if (this.getOutputMinFrameDurationlomOqCM == null) {
                this.getOutputMinFrameDurationlomOqCM = new android.graphics.Path();
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = new android.graphics.RectF();
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                android.view.ViewOutlineProvider viewOutlineProvider = new android.view.ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(android.view.View view, android.graphics.Outline outline) {
                        outline.setRoundRect(0, 0, androidx.constraintlayout.utils.widget.ImageFilterButton.this.getWidth(), androidx.constraintlayout.utils.widget.ImageFilterButton.this.getHeight(), (java.lang.Math.min(r3, r4) * androidx.constraintlayout.utils.widget.ImageFilterButton.this.getOutputStallDuration) / 2.0f);
                    }
                };
                this.getHighSpeedVideoFpsRangesFor = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (java.lang.Math.min(width, height) * this.getOutputStallDuration) / 2.0f;
            this.getHighSpeedVideoFpsRanges.set(0.0f, 0.0f, width, height);
            this.getOutputMinFrameDurationlomOqCM.reset();
            this.getOutputMinFrameDurationlomOqCM.addRoundRect(this.getHighSpeedVideoFpsRanges, min, min, android.graphics.Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRound(float f) {
        if (java.lang.Float.isNaN(f)) {
            this.getOutputSizes = f;
            float f2 = this.getOutputStallDuration;
            this.getOutputStallDuration = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.getOutputSizes != f;
        this.getOutputSizes = f;
        if (f != 0.0f) {
            if (this.getOutputMinFrameDurationlomOqCM == null) {
                this.getOutputMinFrameDurationlomOqCM = new android.graphics.Path();
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = new android.graphics.RectF();
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                android.view.ViewOutlineProvider viewOutlineProvider = new android.view.ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(android.view.View view, android.graphics.Outline outline) {
                        outline.setRoundRect(0, 0, androidx.constraintlayout.utils.widget.ImageFilterButton.this.getWidth(), androidx.constraintlayout.utils.widget.ImageFilterButton.this.getHeight(), androidx.constraintlayout.utils.widget.ImageFilterButton.this.getOutputSizes);
                    }
                };
                this.getHighSpeedVideoFpsRangesFor = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.getHighSpeedVideoFpsRanges.set(0.0f, 0.0f, getWidth(), getHeight());
            this.getOutputMinFrameDurationlomOqCM.reset();
            android.graphics.Path path = this.getOutputMinFrameDurationlomOqCM;
            android.graphics.RectF rectF = this.getHighSpeedVideoFpsRanges;
            float f3 = this.getOutputSizes;
            path.addRoundRect(rectF, f3, f3, android.graphics.Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public float getRoundPercent() {
        return this.getOutputStallDuration;
    }

    public float getRound() {
        return this.getOutputSizes;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        getHighResolutionOutputSizeshNQ4ISI();
    }
}
