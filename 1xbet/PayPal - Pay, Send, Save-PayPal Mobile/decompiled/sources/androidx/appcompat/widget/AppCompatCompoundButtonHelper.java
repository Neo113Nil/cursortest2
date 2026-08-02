package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class AppCompatCompoundButtonHelper {
    private boolean Camera2StreamConfigurationMap;
    private final android.widget.CompoundButton getInputFormats;
    private android.content.res.ColorStateList getHighSpeedVideoFpsRangesFor = null;
    private android.graphics.PorterDuff.Mode getHighSpeedVideoFpsRanges = null;
    private boolean getHighSpeedVideoSizes = false;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;

    AppCompatCompoundButtonHelper(android.widget.CompoundButton compoundButton) {
        this.getInputFormats = compoundButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005a, B:11:0x0062, B:12:0x006d, B:14:0x0075, B:21:0x003d, B:23:0x0045, B:25:0x004d), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #1 {all -> 0x008a, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005a, B:11:0x0062, B:12:0x006d, B:14:0x0075, B:21:0x003d, B:23:0x0045, B:25:0x004d), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void getHighSpeedVideoFpsRangesFor(android.util.AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.getInputFormats.getContext(), attributeSet, androidx.appcompat.R.styleable.CompoundButton, i, 0);
        android.widget.CompoundButton compoundButton = this.getInputFormats;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(compoundButton, compoundButton.getContext(), androidx.appcompat.R.styleable.CompoundButton, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonCompat) && (resourceId2 = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    android.widget.CompoundButton compoundButton2 = this.getInputFormats;
                    compoundButton2.setButtonDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(compoundButton2.getContext(), resourceId2));
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
                if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonTint)) {
                    androidx.core.widget.CompoundButtonCompat.setButtonTintList(this.getInputFormats, obtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.CompoundButton_buttonTint));
                }
                if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonTintMode)) {
                    androidx.core.widget.CompoundButtonCompat.setButtonTintMode(this.getInputFormats, androidx.appcompat.widget.DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.CompoundButton_buttonTintMode, -1), null));
                }
            }
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CompoundButton_android_button, 0)) != 0) {
                android.widget.CompoundButton compoundButton3 = this.getInputFormats;
                compoundButton3.setButtonDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(compoundButton3.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonTint)) {
            }
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonTintMode)) {
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    void getHighSpeedVideoFpsRangesFor(android.content.res.ColorStateList colorStateList) {
        this.getHighSpeedVideoFpsRangesFor = colorStateList;
        this.getHighSpeedVideoSizes = true;
        Camera2StreamConfigurationMap();
    }

    android.content.res.ColorStateList getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    void getHighResolutionOutputSizeshNQ4ISI(android.graphics.PorterDuff.Mode mode) {
        this.getHighSpeedVideoFpsRanges = mode;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        Camera2StreamConfigurationMap();
    }

    android.graphics.PorterDuff.Mode getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    void getHighSpeedVideoFpsRanges() {
        if (this.Camera2StreamConfigurationMap) {
            this.Camera2StreamConfigurationMap = false;
        } else {
            this.Camera2StreamConfigurationMap = true;
            Camera2StreamConfigurationMap();
        }
    }

    void Camera2StreamConfigurationMap() {
        android.graphics.drawable.Drawable buttonDrawable = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(this.getInputFormats);
        if (buttonDrawable != null) {
            if (this.getHighSpeedVideoSizes || this.getHighResolutionOutputSizeshNQ4ISI) {
                android.graphics.drawable.Drawable mutate = androidx.core.graphics.drawable.DrawableCompat.wrap(buttonDrawable).mutate();
                if (this.getHighSpeedVideoSizes) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(mutate, this.getHighSpeedVideoFpsRangesFor);
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(mutate, this.getHighSpeedVideoFpsRanges);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.getInputFormats.getDrawableState());
                }
                this.getInputFormats.setButtonDrawable(mutate);
            }
        }
    }
}
