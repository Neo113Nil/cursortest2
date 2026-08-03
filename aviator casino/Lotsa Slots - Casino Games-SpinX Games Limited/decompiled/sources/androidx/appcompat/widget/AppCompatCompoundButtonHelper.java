package androidx.appcompat.widget;

/* loaded from: classes.dex */
class AppCompatCompoundButtonHelper {
    private android.content.res.ColorStateList mButtonTintList = null;
    private android.graphics.PorterDuff.Mode mButtonTintMode = null;
    private boolean mHasButtonTint = false;
    private boolean mHasButtonTintMode = false;
    private boolean mSkipNextApply;
    private final android.widget.CompoundButton mView;

    int getCompoundPaddingLeft(int i) {
        return i;
    }

    AppCompatCompoundButtonHelper(android.widget.CompoundButton compoundButton) {
        this.mView = compoundButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005a, B:11:0x0062, B:12:0x006d, B:14:0x0075, B:21:0x003d, B:23:0x0045, B:25:0x004d), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #1 {all -> 0x008a, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005a, B:11:0x0062, B:12:0x006d, B:14:0x0075, B:21:0x003d, B:23:0x0045, B:25:0x004d), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, androidx.appcompat.R.styleable.CompoundButton, i, 0);
        android.widget.CompoundButton compoundButton = this.mView;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(compoundButton, compoundButton.getContext(), androidx.appcompat.R.styleable.CompoundButton, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonCompat) && (resourceId2 = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    android.widget.CompoundButton compoundButton2 = this.mView;
                    compoundButton2.setButtonDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(compoundButton2.getContext(), resourceId2));
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
                if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonTint)) {
                    androidx.core.widget.CompoundButtonCompat.setButtonTintList(this.mView, obtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.CompoundButton_buttonTint));
                }
                if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonTintMode)) {
                    androidx.core.widget.CompoundButtonCompat.setButtonTintMode(this.mView, androidx.appcompat.widget.DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.CompoundButton_buttonTintMode, -1), null));
                }
            }
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CompoundButton_android_button, 0)) != 0) {
                android.widget.CompoundButton compoundButton3 = this.mView;
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

    void setSupportButtonTintList(android.content.res.ColorStateList colorStateList) {
        this.mButtonTintList = colorStateList;
        this.mHasButtonTint = true;
        applyButtonTint();
    }

    android.content.res.ColorStateList getSupportButtonTintList() {
        return this.mButtonTintList;
    }

    void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mButtonTintMode = mode;
        this.mHasButtonTintMode = true;
        applyButtonTint();
    }

    android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
        return this.mButtonTintMode;
    }

    void onSetButtonDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
        } else {
            this.mSkipNextApply = true;
            applyButtonTint();
        }
    }

    void applyButtonTint() {
        android.graphics.drawable.Drawable buttonDrawable = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(this.mView);
        if (buttonDrawable != null) {
            if (this.mHasButtonTint || this.mHasButtonTintMode) {
                android.graphics.drawable.Drawable mutate = androidx.core.graphics.drawable.DrawableCompat.wrap(buttonDrawable).mutate();
                if (this.mHasButtonTint) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(mutate, this.mButtonTintList);
                }
                if (this.mHasButtonTintMode) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(mutate, this.mButtonTintMode);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.mView.getDrawableState());
                }
                this.mView.setButtonDrawable(mutate);
            }
        }
    }
}
