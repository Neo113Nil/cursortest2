package com.google.android.material.shape;

/* loaded from: classes8.dex */
public final class ClampedCornerSize implements com.google.android.material.shape.CornerSize {
    private final float target;

    public static com.google.android.material.shape.ClampedCornerSize createFromCornerSize(com.google.android.material.shape.AbsoluteCornerSize absoluteCornerSize) {
        return new com.google.android.material.shape.ClampedCornerSize(absoluteCornerSize.getCornerSize());
    }

    private static float getMaxCornerSize(android.graphics.RectF rectF) {
        return java.lang.Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    public ClampedCornerSize(float f) {
        this.target = f;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float getCornerSize(android.graphics.RectF rectF) {
        return java.lang.Math.min(this.target, getMaxCornerSize(rectF));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.material.shape.ClampedCornerSize) && this.target == ((com.google.android.material.shape.ClampedCornerSize) obj).target;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.target)});
    }
}
