package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class AppCompatSeekBarHelper extends androidx.appcompat.widget.AppCompatProgressBarHelper {
    private android.graphics.drawable.Drawable Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private android.graphics.PorterDuff.Mode getHighSpeedVideoFpsRangesFor;
    private android.content.res.ColorStateList getHighSpeedVideoSizes;
    private final android.widget.SeekBar getInputSizeshNQ4ISI;

    AppCompatSeekBarHelper(android.widget.SeekBar seekBar) {
        super(seekBar);
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRanges = false;
        this.getInputSizeshNQ4ISI = seekBar;
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    void Camera2StreamConfigurationMap(android.util.AttributeSet attributeSet, int i) {
        super.Camera2StreamConfigurationMap(attributeSet, i);
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.getInputSizeshNQ4ISI.getContext(), attributeSet, androidx.appcompat.R.styleable.AppCompatSeekBar, i, 0);
        android.widget.SeekBar seekBar = this.getInputSizeshNQ4ISI;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(seekBar, seekBar.getContext(), androidx.appcompat.R.styleable.AppCompatSeekBar, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        android.graphics.drawable.Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(androidx.appcompat.R.styleable.AppCompatSeekBar_android_thumb);
        if (drawableIfKnown != null) {
            this.getInputSizeshNQ4ISI.setThumb(drawableIfKnown);
        }
        Camera2StreamConfigurationMap(obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.AppCompatSeekBar_tickMark));
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.getHighSpeedVideoFpsRangesFor = androidx.appcompat.widget.DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.getHighSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoFpsRanges = true;
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTint)) {
            this.getHighSpeedVideoSizes = obtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTint);
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }
        obtainStyledAttributes.recycle();
        getHighSpeedVideoFpsRangesFor();
    }

    void Camera2StreamConfigurationMap(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.Camera2StreamConfigurationMap;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.Camera2StreamConfigurationMap = drawable;
        if (drawable != null) {
            drawable.setCallback(this.getInputSizeshNQ4ISI);
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(drawable, this.getInputSizeshNQ4ISI.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.getInputSizeshNQ4ISI.getDrawableState());
            }
            getHighSpeedVideoFpsRangesFor();
        }
        this.getInputSizeshNQ4ISI.invalidate();
    }

    private void getHighSpeedVideoFpsRangesFor() {
        android.graphics.drawable.Drawable drawable = this.Camera2StreamConfigurationMap;
        if (drawable != null) {
            if (this.getHighResolutionOutputSizeshNQ4ISI || this.getHighSpeedVideoFpsRanges) {
                android.graphics.drawable.Drawable wrap = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable.mutate());
                this.Camera2StreamConfigurationMap = wrap;
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(wrap, this.getHighSpeedVideoSizes);
                }
                if (this.getHighSpeedVideoFpsRanges) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
                }
                if (this.Camera2StreamConfigurationMap.isStateful()) {
                    this.Camera2StreamConfigurationMap.setState(this.getInputSizeshNQ4ISI.getDrawableState());
                }
            }
        }
    }

    void getHighResolutionOutputSizeshNQ4ISI() {
        android.graphics.drawable.Drawable drawable = this.Camera2StreamConfigurationMap;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void getHighSpeedVideoSizes() {
        android.graphics.drawable.Drawable drawable = this.Camera2StreamConfigurationMap;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.getInputSizeshNQ4ISI.getDrawableState())) {
            this.getInputSizeshNQ4ISI.invalidateDrawable(drawable);
        }
    }

    void getHighResolutionOutputSizeshNQ4ISI(android.graphics.Canvas canvas) {
        if (this.Camera2StreamConfigurationMap != null) {
            int max = this.getInputSizeshNQ4ISI.getMax();
            if (max > 1) {
                int intrinsicWidth = this.Camera2StreamConfigurationMap.getIntrinsicWidth();
                int intrinsicHeight = this.Camera2StreamConfigurationMap.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.Camera2StreamConfigurationMap.setBounds(-i, -i2, i, i2);
                float width = ((this.getInputSizeshNQ4ISI.getWidth() - this.getInputSizeshNQ4ISI.getPaddingLeft()) - this.getInputSizeshNQ4ISI.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.getInputSizeshNQ4ISI.getPaddingLeft(), this.getInputSizeshNQ4ISI.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.Camera2StreamConfigurationMap.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
