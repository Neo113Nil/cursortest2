package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class AppCompatCheckedTextViewHelper {
    private boolean getHighSpeedVideoSizes;
    private final android.widget.CheckedTextView getInputSizeshNQ4ISI;
    private android.content.res.ColorStateList getHighSpeedVideoFpsRanges = null;
    private android.graphics.PorterDuff.Mode Camera2StreamConfigurationMap = null;
    private boolean getHighSpeedVideoFpsRangesFor = false;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;

    AppCompatCheckedTextViewHelper(android.widget.CheckedTextView checkedTextView) {
        this.getInputSizeshNQ4ISI = checkedTextView;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005a, B:11:0x0062, B:12:0x006d, B:14:0x0075, B:21:0x003d, B:23:0x0045, B:25:0x004d), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #1 {all -> 0x008a, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005a, B:11:0x0062, B:12:0x006d, B:14:0x0075, B:21:0x003d, B:23:0x0045, B:25:0x004d), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void getHighSpeedVideoFpsRangesFor(android.util.AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.getInputSizeshNQ4ISI.getContext(), attributeSet, androidx.appcompat.R.styleable.CheckedTextView, i, 0);
        android.widget.CheckedTextView checkedTextView = this.getInputSizeshNQ4ISI;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(checkedTextView, checkedTextView.getContext(), androidx.appcompat.R.styleable.CheckedTextView, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat) && (resourceId2 = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    android.widget.CheckedTextView checkedTextView2 = this.getInputSizeshNQ4ISI;
                    checkedTextView2.setCheckMarkDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(checkedTextView2.getContext(), resourceId2));
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
                if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint)) {
                    androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintList(this.getInputSizeshNQ4ISI, obtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint));
                }
                if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode)) {
                    androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintMode(this.getInputSizeshNQ4ISI, androidx.appcompat.widget.DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode, -1), null));
                }
            }
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_android_checkMark) && (resourceId = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CheckedTextView_android_checkMark, 0)) != 0) {
                android.widget.CheckedTextView checkedTextView3 = this.getInputSizeshNQ4ISI;
                checkedTextView3.setCheckMarkDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(checkedTextView3.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint)) {
            }
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode)) {
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    void getHighSpeedVideoFpsRangesFor(android.content.res.ColorStateList colorStateList) {
        this.getHighSpeedVideoFpsRanges = colorStateList;
        this.getHighSpeedVideoFpsRangesFor = true;
        Camera2StreamConfigurationMap();
    }

    android.content.res.ColorStateList getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    void getHighSpeedVideoSizes(android.graphics.PorterDuff.Mode mode) {
        this.Camera2StreamConfigurationMap = mode;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        Camera2StreamConfigurationMap();
    }

    android.graphics.PorterDuff.Mode getHighSpeedVideoFpsRangesFor() {
        return this.Camera2StreamConfigurationMap;
    }

    void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoSizes = false;
        } else {
            this.getHighSpeedVideoSizes = true;
            Camera2StreamConfigurationMap();
        }
    }

    void Camera2StreamConfigurationMap() {
        android.graphics.drawable.Drawable checkMarkDrawable = androidx.core.widget.CheckedTextViewCompat.getCheckMarkDrawable(this.getInputSizeshNQ4ISI);
        if (checkMarkDrawable != null) {
            if (this.getHighSpeedVideoFpsRangesFor || this.getHighResolutionOutputSizeshNQ4ISI) {
                android.graphics.drawable.Drawable mutate = androidx.core.graphics.drawable.DrawableCompat.wrap(checkMarkDrawable).mutate();
                if (this.getHighSpeedVideoFpsRangesFor) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(mutate, this.getHighSpeedVideoFpsRanges);
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(mutate, this.Camera2StreamConfigurationMap);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.getInputSizeshNQ4ISI.getDrawableState());
                }
                this.getInputSizeshNQ4ISI.setCheckMarkDrawable(mutate);
            }
        }
    }
}
