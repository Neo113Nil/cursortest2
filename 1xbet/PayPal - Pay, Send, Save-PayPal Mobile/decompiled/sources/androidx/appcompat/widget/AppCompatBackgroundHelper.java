package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class AppCompatBackgroundHelper {
    private androidx.appcompat.widget.TintInfo Camera2StreamConfigurationMap;
    private androidx.appcompat.widget.TintInfo getHighSpeedVideoFpsRangesFor;
    private androidx.appcompat.widget.TintInfo getHighSpeedVideoSizes;
    private final android.view.View getInputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges = -1;
    private final androidx.appcompat.widget.AppCompatDrawableManager getHighResolutionOutputSizeshNQ4ISI = androidx.appcompat.widget.AppCompatDrawableManager.get();

    AppCompatBackgroundHelper(android.view.View view) {
        this.getInputSizeshNQ4ISI = view;
    }

    void getHighResolutionOutputSizeshNQ4ISI(android.util.AttributeSet attributeSet, int i) {
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.getInputSizeshNQ4ISI.getContext(), attributeSet, androidx.appcompat.R.styleable.ViewBackgroundHelper, i, 0);
        android.view.View view = this.getInputSizeshNQ4ISI;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(view, view.getContext(), androidx.appcompat.R.styleable.ViewBackgroundHelper, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.ViewBackgroundHelper_android_background)) {
                this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ViewBackgroundHelper_android_background, -1);
                android.content.res.ColorStateList highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(this.getInputSizeshNQ4ISI.getContext(), this.getHighSpeedVideoFpsRanges);
                if (highSpeedVideoFpsRangesFor != null) {
                    Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
                }
            }
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint)) {
                androidx.core.view.ViewCompat.setBackgroundTintList(this.getInputSizeshNQ4ISI, obtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode)) {
                androidx.core.view.ViewCompat.setBackgroundTintMode(this.getInputSizeshNQ4ISI, androidx.appcompat.widget.DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    void Camera2StreamConfigurationMap(int i) {
        this.getHighSpeedVideoFpsRanges = i;
        androidx.appcompat.widget.AppCompatDrawableManager appCompatDrawableManager = this.getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap(appCompatDrawableManager != null ? appCompatDrawableManager.getHighSpeedVideoFpsRangesFor(this.getInputSizeshNQ4ISI.getContext(), i) : null);
        getHighSpeedVideoFpsRanges();
    }

    void Camera2StreamConfigurationMap(android.graphics.drawable.Drawable drawable) {
        this.getHighSpeedVideoFpsRanges = -1;
        Camera2StreamConfigurationMap((android.content.res.ColorStateList) null);
        getHighSpeedVideoFpsRanges();
    }

    void getHighSpeedVideoFpsRanges(android.content.res.ColorStateList colorStateList) {
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new androidx.appcompat.widget.TintInfo();
        }
        this.Camera2StreamConfigurationMap.mTintList = colorStateList;
        this.Camera2StreamConfigurationMap.mHasTintList = true;
        getHighSpeedVideoFpsRanges();
    }

    android.content.res.ColorStateList Camera2StreamConfigurationMap() {
        androidx.appcompat.widget.TintInfo tintInfo = this.Camera2StreamConfigurationMap;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    void getHighSpeedVideoSizes(android.graphics.PorterDuff.Mode mode) {
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new androidx.appcompat.widget.TintInfo();
        }
        this.Camera2StreamConfigurationMap.mTintMode = mode;
        this.Camera2StreamConfigurationMap.mHasTintMode = true;
        getHighSpeedVideoFpsRanges();
    }

    android.graphics.PorterDuff.Mode getHighResolutionOutputSizeshNQ4ISI() {
        androidx.appcompat.widget.TintInfo tintInfo = this.Camera2StreamConfigurationMap;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    void getHighSpeedVideoFpsRanges() {
        android.graphics.drawable.Drawable background = this.getInputSizeshNQ4ISI.getBackground();
        if (background != null) {
            if (getHighSpeedVideoSizes() && getHighSpeedVideoFpsRanges(background)) {
                return;
            }
            androidx.appcompat.widget.TintInfo tintInfo = this.Camera2StreamConfigurationMap;
            if (tintInfo != null) {
                androidx.appcompat.widget.AppCompatDrawableManager.getHighResolutionOutputSizeshNQ4ISI(background, tintInfo, this.getInputSizeshNQ4ISI.getDrawableState());
                return;
            }
            androidx.appcompat.widget.TintInfo tintInfo2 = this.getHighSpeedVideoFpsRangesFor;
            if (tintInfo2 != null) {
                androidx.appcompat.widget.AppCompatDrawableManager.getHighResolutionOutputSizeshNQ4ISI(background, tintInfo2, this.getInputSizeshNQ4ISI.getDrawableState());
            }
        }
    }

    void Camera2StreamConfigurationMap(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = new androidx.appcompat.widget.TintInfo();
            }
            this.getHighSpeedVideoFpsRangesFor.mTintList = colorStateList;
            this.getHighSpeedVideoFpsRangesFor.mHasTintList = true;
        } else {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
        getHighSpeedVideoFpsRanges();
    }

    private boolean getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRangesFor != null;
    }

    private boolean getHighSpeedVideoFpsRanges(android.graphics.drawable.Drawable drawable) {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = new androidx.appcompat.widget.TintInfo();
        }
        androidx.appcompat.widget.TintInfo tintInfo = this.getHighSpeedVideoSizes;
        tintInfo.mTintList = null;
        tintInfo.mHasTintList = false;
        tintInfo.mTintMode = null;
        tintInfo.mHasTintMode = false;
        android.content.res.ColorStateList backgroundTintList = androidx.core.view.ViewCompat.getBackgroundTintList(this.getInputSizeshNQ4ISI);
        if (backgroundTintList != null) {
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = backgroundTintList;
        }
        android.graphics.PorterDuff.Mode backgroundTintMode = androidx.core.view.ViewCompat.getBackgroundTintMode(this.getInputSizeshNQ4ISI);
        if (backgroundTintMode != null) {
            tintInfo.mHasTintMode = true;
            tintInfo.mTintMode = backgroundTintMode;
        }
        if (!tintInfo.mHasTintList && !tintInfo.mHasTintMode) {
            return false;
        }
        androidx.appcompat.widget.AppCompatDrawableManager.getHighResolutionOutputSizeshNQ4ISI(drawable, tintInfo, this.getInputSizeshNQ4ISI.getDrawableState());
        return true;
    }
}
