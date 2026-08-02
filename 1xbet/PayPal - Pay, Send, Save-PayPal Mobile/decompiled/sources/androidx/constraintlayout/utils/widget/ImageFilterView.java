package androidx.constraintlayout.utils.widget;

/* loaded from: classes7.dex */
public class ImageFilterView extends androidx.appcompat.widget.AppCompatImageView {
    float Camera2StreamConfigurationMap;
    android.graphics.RectF getHighResolutionOutputSizeshNQ4ISI;
    android.graphics.drawable.Drawable[] getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    android.graphics.drawable.LayerDrawable getHighSpeedVideoSizes;
    float getHighSpeedVideoSizesFor;
    private float getInputFormats;
    float getInputSizeshNQ4ISI;
    private android.graphics.drawable.Drawable getOutputFormats;
    android.view.ViewOutlineProvider getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix getOutputSizes;
    private android.graphics.drawable.Drawable getOutputSizeshNQ4ISI;
    private android.graphics.Path getOutputStallDuration;
    private float getOutputStallDurationlomOqCM;
    private float toString;

    static class ImageMatrix {
        float[] getHighResolutionOutputSizeshNQ4ISI = new float[20];
        android.graphics.ColorMatrix Camera2StreamConfigurationMap = new android.graphics.ColorMatrix();
        android.graphics.ColorMatrix getInputFormats = new android.graphics.ColorMatrix();
        float getHighSpeedVideoFpsRanges = 1.0f;
        float getHighSpeedVideoFpsRangesFor = 1.0f;
        float getHighSpeedVideoSizes = 1.0f;
        float getOutputMinFrameDuration = 1.0f;

        ImageMatrix() {
        }

        private void getHighSpeedVideoSizes(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void getHighSpeedVideoFpsRanges(float f) {
            float log;
            float f2;
            float f3;
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f4 = (5000.0f / f) / 100.0f;
            if (f4 > 66.0f) {
                double d = f4 - 60.0f;
                f2 = ((float) java.lang.Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                log = ((float) java.lang.Math.pow(d, 0.07551485300064087d)) * 288.12216f;
            } else {
                log = (((float) java.lang.Math.log(f4)) * 99.4708f) - 161.11957f;
                f2 = 255.0f;
            }
            if (f4 < 66.0f) {
                f3 = f4 > 19.0f ? (((float) java.lang.Math.log(f4 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f;
            } else {
                f3 = 255.0f;
            }
            float min = java.lang.Math.min(255.0f, java.lang.Math.max(f2, 0.0f));
            float min2 = java.lang.Math.min(255.0f, java.lang.Math.max(log, 0.0f));
            float min3 = java.lang.Math.min(255.0f, java.lang.Math.max(f3, 0.0f));
            float log2 = (float) java.lang.Math.log(50.0d);
            float log3 = (float) java.lang.Math.log(40.0d);
            float min4 = java.lang.Math.min(255.0f, java.lang.Math.max(255.0f, 0.0f));
            float min5 = min2 / java.lang.Math.min(255.0f, java.lang.Math.max((log2 * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / java.lang.Math.min(255.0f, java.lang.Math.max((log3 * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void Camera2StreamConfigurationMap(float f) {
            float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        final void getHighSpeedVideoSizes(android.widget.ImageView imageView) {
            boolean z;
            this.Camera2StreamConfigurationMap.reset();
            float f = this.getHighSpeedVideoFpsRangesFor;
            boolean z2 = true;
            if (f != 1.0f) {
                getHighSpeedVideoSizes(f);
                this.Camera2StreamConfigurationMap.set(this.getHighResolutionOutputSizeshNQ4ISI);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.getHighSpeedVideoSizes;
            if (f2 != 1.0f) {
                this.getInputFormats.setScale(f2, f2, f2, 1.0f);
                this.Camera2StreamConfigurationMap.postConcat(this.getInputFormats);
                z = true;
            }
            float f3 = this.getOutputMinFrameDuration;
            if (f3 != 1.0f) {
                getHighSpeedVideoFpsRanges(f3);
                this.getInputFormats.set(this.getHighResolutionOutputSizeshNQ4ISI);
                this.Camera2StreamConfigurationMap.postConcat(this.getInputFormats);
            } else {
                z2 = z;
            }
            float f4 = this.getHighSpeedVideoFpsRanges;
            if (f4 != 1.0f) {
                Camera2StreamConfigurationMap(f4);
                this.getInputFormats.set(this.getHighResolutionOutputSizeshNQ4ISI);
                this.Camera2StreamConfigurationMap.postConcat(this.getInputFormats);
            } else if (!z2) {
                imageView.clearColorFilter();
                return;
            }
            imageView.setColorFilter(new android.graphics.ColorMatrixColorFilter(this.Camera2StreamConfigurationMap));
        }
    }

    public float getImagePanX() {
        return this.Camera2StreamConfigurationMap;
    }

    public float getImagePanY() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public float getImageZoom() {
        return this.getHighSpeedVideoSizesFor;
    }

    public float getImageRotate() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setImagePanX(float f) {
        this.Camera2StreamConfigurationMap = f;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public void setImagePanY(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public void setImageZoom(float f) {
        this.getHighSpeedVideoSizesFor = f;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public void setImageRotate(float f) {
        this.getInputSizeshNQ4ISI = f;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        if (this.getOutputFormats != null && drawable != null) {
            android.graphics.drawable.Drawable mutate = drawable.mutate();
            this.getOutputSizeshNQ4ISI = mutate;
            android.graphics.drawable.Drawable[] drawableArr = this.getHighSpeedVideoFpsRanges;
            drawableArr[0] = mutate;
            drawableArr[1] = this.getOutputFormats;
            android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoSizes = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.getInputFormats);
            return;
        }
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.getOutputFormats != null) {
            android.graphics.drawable.Drawable mutate = androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i).mutate();
            this.getOutputSizeshNQ4ISI = mutate;
            android.graphics.drawable.Drawable[] drawableArr = this.getHighSpeedVideoFpsRanges;
            drawableArr[0] = mutate;
            drawableArr[1] = this.getOutputFormats;
            android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoSizes = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.getInputFormats);
            return;
        }
        super.setImageResource(i);
    }

    public void setAltImageResource(int i) {
        android.graphics.drawable.Drawable drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i);
        this.getOutputFormats = drawable;
        setAltImageDrawable(drawable);
    }

    public void setAltImageDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable mutate = drawable.mutate();
        this.getOutputFormats = mutate;
        android.graphics.drawable.Drawable[] drawableArr = this.getHighSpeedVideoFpsRanges;
        drawableArr[0] = this.getOutputSizeshNQ4ISI;
        drawableArr[1] = mutate;
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoSizes = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.getInputFormats);
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        if (java.lang.Float.isNaN(this.Camera2StreamConfigurationMap) && java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor) && java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor) && java.lang.Float.isNaN(this.getInputSizeshNQ4ISI)) {
            setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        } else {
            getHighSpeedVideoSizes();
        }
    }

    private void getHighSpeedVideoSizes() {
        if (java.lang.Float.isNaN(this.Camera2StreamConfigurationMap) && java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor) && java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor) && java.lang.Float.isNaN(this.getInputSizeshNQ4ISI)) {
            return;
        }
        float f = java.lang.Float.isNaN(this.Camera2StreamConfigurationMap) ? 0.0f : this.Camera2StreamConfigurationMap;
        float f2 = java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor) ? 0.0f : this.getHighSpeedVideoFpsRangesFor;
        float f3 = java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor) ? 1.0f : this.getHighSpeedVideoSizesFor;
        float f4 = java.lang.Float.isNaN(this.getInputSizeshNQ4ISI) ? 0.0f : this.getInputSizeshNQ4ISI;
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

    public ImageFilterView(android.content.Context context) {
        super(context);
        this.getOutputSizes = new androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix();
        this.getOutputMinFrameDurationlomOqCM = true;
        this.getOutputFormats = null;
        this.getOutputSizeshNQ4ISI = null;
        this.getInputFormats = 0.0f;
        this.toString = 0.0f;
        this.getOutputStallDurationlomOqCM = Float.NaN;
        this.getHighSpeedVideoFpsRanges = new android.graphics.drawable.Drawable[2];
        this.Camera2StreamConfigurationMap = Float.NaN;
        this.getHighSpeedVideoFpsRangesFor = Float.NaN;
        this.getHighSpeedVideoSizesFor = Float.NaN;
        this.getInputSizeshNQ4ISI = Float.NaN;
        Camera2StreamConfigurationMap(context, null);
    }

    public ImageFilterView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getOutputSizes = new androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix();
        this.getOutputMinFrameDurationlomOqCM = true;
        this.getOutputFormats = null;
        this.getOutputSizeshNQ4ISI = null;
        this.getInputFormats = 0.0f;
        this.toString = 0.0f;
        this.getOutputStallDurationlomOqCM = Float.NaN;
        this.getHighSpeedVideoFpsRanges = new android.graphics.drawable.Drawable[2];
        this.Camera2StreamConfigurationMap = Float.NaN;
        this.getHighSpeedVideoFpsRangesFor = Float.NaN;
        this.getHighSpeedVideoSizesFor = Float.NaN;
        this.getInputSizeshNQ4ISI = Float.NaN;
        Camera2StreamConfigurationMap(context, attributeSet);
    }

    public ImageFilterView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getOutputSizes = new androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix();
        this.getOutputMinFrameDurationlomOqCM = true;
        this.getOutputFormats = null;
        this.getOutputSizeshNQ4ISI = null;
        this.getInputFormats = 0.0f;
        this.toString = 0.0f;
        this.getOutputStallDurationlomOqCM = Float.NaN;
        this.getHighSpeedVideoFpsRanges = new android.graphics.drawable.Drawable[2];
        this.Camera2StreamConfigurationMap = Float.NaN;
        this.getHighSpeedVideoFpsRangesFor = Float.NaN;
        this.getHighSpeedVideoSizesFor = Float.NaN;
        this.getInputSizeshNQ4ISI = Float.NaN;
        Camera2StreamConfigurationMap(context, attributeSet);
    }

    private void Camera2StreamConfigurationMap(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.getOutputFormats = obtainStyledAttributes.getDrawable(androidx.constraintlayout.widget.R.styleable.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_crossfade) {
                    this.getInputFormats = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_brightness) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index != androidx.constraintlayout.widget.R.styleable.ImageFilterView_overlay) {
                    if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_imagePanX) {
                        setImagePanX(obtainStyledAttributes.getFloat(index, this.Camera2StreamConfigurationMap));
                    } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_imagePanY) {
                        setImagePanY(obtainStyledAttributes.getFloat(index, this.getHighSpeedVideoFpsRangesFor));
                    } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_imageRotate) {
                        setImageRotate(obtainStyledAttributes.getFloat(index, this.getInputSizeshNQ4ISI));
                    } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_imageZoom) {
                        setImageZoom(obtainStyledAttributes.getFloat(index, this.getHighSpeedVideoSizesFor));
                    }
                } else {
                    this.getOutputMinFrameDurationlomOqCM = obtainStyledAttributes.getBoolean(index, this.getOutputMinFrameDurationlomOqCM);
                }
            }
            obtainStyledAttributes.recycle();
            android.graphics.drawable.Drawable drawable = getDrawable();
            this.getOutputSizeshNQ4ISI = drawable;
            if (this.getOutputFormats != null && drawable != null) {
                android.graphics.drawable.Drawable[] drawableArr = this.getHighSpeedVideoFpsRanges;
                android.graphics.drawable.Drawable mutate = getDrawable().mutate();
                this.getOutputSizeshNQ4ISI = mutate;
                drawableArr[0] = mutate;
                this.getHighSpeedVideoFpsRanges[1] = this.getOutputFormats.mutate();
                android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(this.getHighSpeedVideoFpsRanges);
                this.getHighSpeedVideoSizes = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.getInputFormats * 255.0f));
                if (!this.getOutputMinFrameDurationlomOqCM) {
                    this.getHighSpeedVideoSizes.getDrawable(0).setAlpha((int) ((1.0f - this.getInputFormats) * 255.0f));
                }
                super.setImageDrawable(this.getHighSpeedVideoSizes);
                return;
            }
            android.graphics.drawable.Drawable drawable2 = getDrawable();
            this.getOutputSizeshNQ4ISI = drawable2;
            if (drawable2 != null) {
                android.graphics.drawable.Drawable[] drawableArr2 = this.getHighSpeedVideoFpsRanges;
                android.graphics.drawable.Drawable mutate2 = drawable2.mutate();
                this.getOutputSizeshNQ4ISI = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    public void setSaturation(float f) {
        this.getOutputSizes.getHighSpeedVideoFpsRangesFor = f;
        this.getOutputSizes.getHighSpeedVideoSizes(this);
    }

    public float getSaturation() {
        return this.getOutputSizes.getHighSpeedVideoFpsRangesFor;
    }

    public void setContrast(float f) {
        this.getOutputSizes.getHighSpeedVideoSizes = f;
        this.getOutputSizes.getHighSpeedVideoSizes(this);
    }

    public float getContrast() {
        return this.getOutputSizes.getHighSpeedVideoSizes;
    }

    public void setWarmth(float f) {
        this.getOutputSizes.getOutputMinFrameDuration = f;
        this.getOutputSizes.getHighSpeedVideoSizes(this);
    }

    public float getWarmth() {
        return this.getOutputSizes.getOutputMinFrameDuration;
    }

    public void setCrossfade(float f) {
        this.getInputFormats = f;
        if (this.getHighSpeedVideoFpsRanges != null) {
            if (!this.getOutputMinFrameDurationlomOqCM) {
                this.getHighSpeedVideoSizes.getDrawable(0).setAlpha((int) ((1.0f - this.getInputFormats) * 255.0f));
            }
            this.getHighSpeedVideoSizes.getDrawable(1).setAlpha((int) (this.getInputFormats * 255.0f));
            super.setImageDrawable(this.getHighSpeedVideoSizes);
        }
    }

    public float getCrossfade() {
        return this.getInputFormats;
    }

    public void setBrightness(float f) {
        this.getOutputSizes.getHighSpeedVideoFpsRanges = f;
        this.getOutputSizes.getHighSpeedVideoSizes(this);
    }

    public float getBrightness() {
        return this.getOutputSizes.getHighSpeedVideoFpsRanges;
    }

    public void setRoundPercent(float f) {
        boolean z = this.toString != f;
        this.toString = f;
        if (f != 0.0f) {
            if (this.getOutputStallDuration == null) {
                this.getOutputStallDuration = new android.graphics.Path();
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RectF();
            }
            if (this.getOutputMinFrameDuration == null) {
                android.view.ViewOutlineProvider viewOutlineProvider = new android.view.ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(android.view.View view, android.graphics.Outline outline) {
                        outline.setRoundRect(0, 0, androidx.constraintlayout.utils.widget.ImageFilterView.this.getWidth(), androidx.constraintlayout.utils.widget.ImageFilterView.this.getHeight(), (java.lang.Math.min(r3, r4) * androidx.constraintlayout.utils.widget.ImageFilterView.this.toString) / 2.0f);
                    }
                };
                this.getOutputMinFrameDuration = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (java.lang.Math.min(width, height) * this.toString) / 2.0f;
            this.getHighResolutionOutputSizeshNQ4ISI.set(0.0f, 0.0f, width, height);
            this.getOutputStallDuration.reset();
            this.getOutputStallDuration.addRoundRect(this.getHighResolutionOutputSizeshNQ4ISI, min, min, android.graphics.Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRound(float f) {
        if (java.lang.Float.isNaN(f)) {
            this.getOutputStallDurationlomOqCM = f;
            float f2 = this.toString;
            this.toString = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.getOutputStallDurationlomOqCM != f;
        this.getOutputStallDurationlomOqCM = f;
        if (f != 0.0f) {
            if (this.getOutputStallDuration == null) {
                this.getOutputStallDuration = new android.graphics.Path();
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RectF();
            }
            if (this.getOutputMinFrameDuration == null) {
                android.view.ViewOutlineProvider viewOutlineProvider = new android.view.ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(android.view.View view, android.graphics.Outline outline) {
                        outline.setRoundRect(0, 0, androidx.constraintlayout.utils.widget.ImageFilterView.this.getWidth(), androidx.constraintlayout.utils.widget.ImageFilterView.this.getHeight(), androidx.constraintlayout.utils.widget.ImageFilterView.this.getOutputStallDurationlomOqCM);
                    }
                };
                this.getOutputMinFrameDuration = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.getHighResolutionOutputSizeshNQ4ISI.set(0.0f, 0.0f, getWidth(), getHeight());
            this.getOutputStallDuration.reset();
            android.graphics.Path path = this.getOutputStallDuration;
            android.graphics.RectF rectF = this.getHighResolutionOutputSizeshNQ4ISI;
            float f3 = this.getOutputStallDurationlomOqCM;
            path.addRoundRect(rectF, f3, f3, android.graphics.Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public float getRoundPercent() {
        return this.toString;
    }

    public float getRound() {
        return this.getOutputStallDurationlomOqCM;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        getHighSpeedVideoSizes();
    }
}
