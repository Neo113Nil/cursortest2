package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class AppCompatImageHelper {
    private androidx.appcompat.widget.TintInfo Camera2StreamConfigurationMap;
    private androidx.appcompat.widget.TintInfo getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges = 0;
    private final android.widget.ImageView getHighSpeedVideoFpsRangesFor;
    private androidx.appcompat.widget.TintInfo getHighSpeedVideoSizes;

    public AppCompatImageHelper(android.widget.ImageView imageView) {
        this.getHighSpeedVideoFpsRangesFor = imageView;
    }

    public void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        int resourceId;
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.getHighSpeedVideoFpsRangesFor.getContext(), attributeSet, androidx.appcompat.R.styleable.AppCompatImageView, i, 0);
        android.widget.ImageView imageView = this.getHighSpeedVideoFpsRangesFor;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(imageView, imageView.getContext(), androidx.appcompat.R.styleable.AppCompatImageView, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoFpsRangesFor.getDrawable();
            if (drawable == null && (resourceId = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(this.getHighSpeedVideoFpsRangesFor.getContext(), resourceId)) != null) {
                this.getHighSpeedVideoFpsRangesFor.setImageDrawable(drawable);
            }
            if (drawable != null) {
                androidx.appcompat.widget.DrawableUtils.getHighResolutionOutputSizeshNQ4ISI(drawable);
            }
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatImageView_tint)) {
                androidx.core.widget.ImageViewCompat.setImageTintList(this.getHighSpeedVideoFpsRangesFor, obtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.AppCompatImageView_tint));
            }
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatImageView_tintMode)) {
                androidx.core.widget.ImageViewCompat.setImageTintMode(this.getHighSpeedVideoFpsRangesFor, androidx.appcompat.widget.DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setImageResource(int i) {
        if (i != 0) {
            android.graphics.drawable.Drawable drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(this.getHighSpeedVideoFpsRangesFor.getContext(), i);
            if (drawable != null) {
                androidx.appcompat.widget.DrawableUtils.getHighResolutionOutputSizeshNQ4ISI(drawable);
            }
            this.getHighSpeedVideoFpsRangesFor.setImageDrawable(drawable);
        } else {
            this.getHighSpeedVideoFpsRangesFor.setImageDrawable(null);
        }
        getHighResolutionOutputSizeshNQ4ISI();
    }

    boolean Camera2StreamConfigurationMap() {
        return !(this.getHighSpeedVideoFpsRangesFor.getBackground() instanceof android.graphics.drawable.RippleDrawable);
    }

    void getHighSpeedVideoFpsRangesFor(android.content.res.ColorStateList colorStateList) {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = new androidx.appcompat.widget.TintInfo();
        }
        this.getHighSpeedVideoSizes.mTintList = colorStateList;
        this.getHighSpeedVideoSizes.mHasTintList = true;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    android.content.res.ColorStateList getHighSpeedVideoFpsRanges() {
        androidx.appcompat.widget.TintInfo tintInfo = this.getHighSpeedVideoSizes;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    void getHighSpeedVideoFpsRanges(android.graphics.PorterDuff.Mode mode) {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = new androidx.appcompat.widget.TintInfo();
        }
        this.getHighSpeedVideoSizes.mTintMode = mode;
        this.getHighSpeedVideoSizes.mHasTintMode = true;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    android.graphics.PorterDuff.Mode getHighSpeedVideoFpsRangesFor() {
        androidx.appcompat.widget.TintInfo tintInfo = this.getHighSpeedVideoSizes;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    void getHighResolutionOutputSizeshNQ4ISI() {
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoFpsRangesFor.getDrawable();
        if (drawable != null) {
            androidx.appcompat.widget.DrawableUtils.getHighResolutionOutputSizeshNQ4ISI(drawable);
        }
        if (drawable != null) {
            if (getInputSizeshNQ4ISI() && getHighSpeedVideoFpsRanges(drawable)) {
                return;
            }
            androidx.appcompat.widget.TintInfo tintInfo = this.getHighSpeedVideoSizes;
            if (tintInfo != null) {
                androidx.appcompat.widget.AppCompatDrawableManager.getHighResolutionOutputSizeshNQ4ISI(drawable, tintInfo, this.getHighSpeedVideoFpsRangesFor.getDrawableState());
                return;
            }
            androidx.appcompat.widget.TintInfo tintInfo2 = this.Camera2StreamConfigurationMap;
            if (tintInfo2 != null) {
                androidx.appcompat.widget.AppCompatDrawableManager.getHighResolutionOutputSizeshNQ4ISI(drawable, tintInfo2, this.getHighSpeedVideoFpsRangesFor.getDrawableState());
            }
        }
    }

    private boolean getInputSizeshNQ4ISI() {
        return this.Camera2StreamConfigurationMap != null;
    }

    private boolean getHighSpeedVideoFpsRanges(android.graphics.drawable.Drawable drawable) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.appcompat.widget.TintInfo();
        }
        androidx.appcompat.widget.TintInfo tintInfo = this.getHighResolutionOutputSizeshNQ4ISI;
        tintInfo.mTintList = null;
        tintInfo.mHasTintList = false;
        tintInfo.mTintMode = null;
        tintInfo.mHasTintMode = false;
        android.content.res.ColorStateList imageTintList = androidx.core.widget.ImageViewCompat.getImageTintList(this.getHighSpeedVideoFpsRangesFor);
        if (imageTintList != null) {
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = imageTintList;
        }
        android.graphics.PorterDuff.Mode imageTintMode = androidx.core.widget.ImageViewCompat.getImageTintMode(this.getHighSpeedVideoFpsRangesFor);
        if (imageTintMode != null) {
            tintInfo.mHasTintMode = true;
            tintInfo.mTintMode = imageTintMode;
        }
        if (!tintInfo.mHasTintList && !tintInfo.mHasTintMode) {
            return false;
        }
        androidx.appcompat.widget.AppCompatDrawableManager.getHighResolutionOutputSizeshNQ4ISI(drawable, tintInfo, this.getHighSpeedVideoFpsRangesFor.getDrawableState());
        return true;
    }

    void getHighSpeedVideoFpsRangesFor(android.graphics.drawable.Drawable drawable) {
        this.getHighSpeedVideoFpsRanges = drawable.getLevel();
    }

    void getHighSpeedVideoSizes() {
        if (this.getHighSpeedVideoFpsRangesFor.getDrawable() != null) {
            this.getHighSpeedVideoFpsRangesFor.getDrawable().setLevel(this.getHighSpeedVideoFpsRanges);
        }
    }
}
