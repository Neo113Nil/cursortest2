package com.google.android.material.shape;

/* loaded from: classes8.dex */
public final class RelativeCornerSize implements com.google.android.material.shape.CornerSize {
    private final float percent;

    public static com.google.android.material.shape.RelativeCornerSize createFromCornerSize(android.graphics.RectF rectF, com.google.android.material.shape.CornerSize cornerSize) {
        if (cornerSize instanceof com.google.android.material.shape.RelativeCornerSize) {
            return (com.google.android.material.shape.RelativeCornerSize) cornerSize;
        }
        return new com.google.android.material.shape.RelativeCornerSize(cornerSize.getCornerSize(rectF) / getMaxCornerSize(rectF));
    }

    private static float getMaxCornerSize(android.graphics.RectF rectF) {
        return java.lang.Math.min(rectF.width(), rectF.height());
    }

    public RelativeCornerSize(float f) {
        this.percent = f;
    }

    public final float getRelativePercent() {
        return this.percent;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float getCornerSize(android.graphics.RectF rectF) {
        return this.percent * getMaxCornerSize(rectF);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.material.shape.RelativeCornerSize) && this.percent == ((com.google.android.material.shape.RelativeCornerSize) obj).percent;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.percent)});
    }
}
