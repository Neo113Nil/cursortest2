package com.google.android.material.textfield;

/* loaded from: classes8.dex */
class IconHelper {
    static void setCompatRippleBackgroundIfNeeded(com.google.android.material.internal.CheckableImageButton checkableImageButton) {
    }

    private IconHelper() {
    }

    static void setIconOnClickListener(com.google.android.material.internal.CheckableImageButton checkableImageButton, android.view.View.OnClickListener onClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    static void setIconOnLongClickListener(com.google.android.material.internal.CheckableImageButton checkableImageButton, android.view.View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private static void setIconClickable(com.google.android.material.internal.CheckableImageButton checkableImageButton, android.view.View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = androidx.core.view.ViewCompat.hasOnClickListeners(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        androidx.core.view.ViewCompat.setImportantForAccessibility(checkableImageButton, z2 ? 1 : 2);
    }

    static void applyIconTint(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, android.content.res.ColorStateList.valueOf(colorStateList.getColorForState(mergeIconState(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, colorStateList);
            }
            if (mode != null) {
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    static void refreshIconDrawableState(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton, android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(mergeIconState(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        android.graphics.drawable.Drawable mutate = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
        androidx.core.graphics.drawable.DrawableCompat.setTintList(mutate, android.content.res.ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    private static int[] mergeIconState(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = java.util.Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        java.lang.System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    static void setIconMinSize(com.google.android.material.internal.CheckableImageButton checkableImageButton, int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    static void setIconScaleType(com.google.android.material.internal.CheckableImageButton checkableImageButton, android.widget.ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }

    static android.widget.ImageView.ScaleType convertScaleType(int i) {
        if (i == 0) {
            return android.widget.ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return android.widget.ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return android.widget.ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return android.widget.ImageView.ScaleType.FIT_END;
        }
        if (i == 5) {
            return android.widget.ImageView.ScaleType.CENTER_CROP;
        }
        if (i == 6) {
            return android.widget.ImageView.ScaleType.CENTER_INSIDE;
        }
        return android.widget.ImageView.ScaleType.CENTER;
    }
}
