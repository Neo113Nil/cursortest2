package com.google.android.material.drawable;

/* loaded from: classes8.dex */
public class ScaledDrawableWrapper extends androidx.appcompat.graphics.drawable.DrawableWrapperCompat {
    private final int height;
    private final int width;

    public ScaledDrawableWrapper(android.graphics.drawable.Drawable drawable, int i, int i2) {
        super(drawable);
        this.width = i;
        this.height = i2;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.width;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.height;
    }
}
