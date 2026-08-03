package androidx.appcompat.widget;

/* loaded from: classes.dex */
class AppCompatCheckedTextViewHelper {
    private android.content.res.ColorStateList mCheckMarkTintList = null;
    private android.graphics.PorterDuff.Mode mCheckMarkTintMode = null;
    private boolean mHasCheckMarkTint = false;
    private boolean mHasCheckMarkTintMode = false;
    private boolean mSkipNextApply;
    private final android.widget.CheckedTextView mView;

    AppCompatCheckedTextViewHelper(android.widget.CheckedTextView checkedTextView) {
        this.mView = checkedTextView;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005a, B:11:0x0062, B:12:0x006d, B:14:0x0075, B:21:0x003d, B:23:0x0045, B:25:0x004d), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #1 {all -> 0x008a, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005a, B:11:0x0062, B:12:0x006d, B:14:0x0075, B:21:0x003d, B:23:0x0045, B:25:0x004d), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, androidx.appcompat.R.styleable.CheckedTextView, i, 0);
        android.widget.CheckedTextView checkedTextView = this.mView;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(checkedTextView, checkedTextView.getContext(), androidx.appcompat.R.styleable.CheckedTextView, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat) && (resourceId2 = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    android.widget.CheckedTextView checkedTextView2 = this.mView;
                    checkedTextView2.setCheckMarkDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(checkedTextView2.getContext(), resourceId2));
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
                if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint)) {
                    androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintList(this.mView, obtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint));
                }
                if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode)) {
                    androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintMode(this.mView, androidx.appcompat.widget.DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode, -1), null));
                }
            }
            if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CheckedTextView_android_checkMark) && (resourceId = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CheckedTextView_android_checkMark, 0)) != 0) {
                android.widget.CheckedTextView checkedTextView3 = this.mView;
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

    void setSupportCheckMarkTintList(android.content.res.ColorStateList colorStateList) {
        this.mCheckMarkTintList = colorStateList;
        this.mHasCheckMarkTint = true;
        applyCheckMarkTint();
    }

    android.content.res.ColorStateList getSupportCheckMarkTintList() {
        return this.mCheckMarkTintList;
    }

    void setSupportCheckMarkTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mCheckMarkTintMode = mode;
        this.mHasCheckMarkTintMode = true;
        applyCheckMarkTint();
    }

    android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
        return this.mCheckMarkTintMode;
    }

    void onSetCheckMarkDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
        } else {
            this.mSkipNextApply = true;
            applyCheckMarkTint();
        }
    }

    void applyCheckMarkTint() {
        android.graphics.drawable.Drawable checkMarkDrawable = androidx.core.widget.CheckedTextViewCompat.getCheckMarkDrawable(this.mView);
        if (checkMarkDrawable != null) {
            if (this.mHasCheckMarkTint || this.mHasCheckMarkTintMode) {
                android.graphics.drawable.Drawable mutate = androidx.core.graphics.drawable.DrawableCompat.wrap(checkMarkDrawable).mutate();
                if (this.mHasCheckMarkTint) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(mutate, this.mCheckMarkTintList);
                }
                if (this.mHasCheckMarkTintMode) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(mutate, this.mCheckMarkTintMode);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.mView.getDrawableState());
                }
                this.mView.setCheckMarkDrawable(mutate);
            }
        }
    }
}
