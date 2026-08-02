package com.google.zxing;

/* loaded from: classes9.dex */
public final class Dimension {
    private final int height;
    private final int width;

    public Dimension(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.width = i;
        this.height = i2;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.zxing.Dimension)) {
            return false;
        }
        com.google.zxing.Dimension dimension = (com.google.zxing.Dimension) obj;
        return this.width == dimension.width && this.height == dimension.height;
    }

    public final int hashCode() {
        return (this.width * 32713) + this.height;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.width);
        sb.append("x");
        sb.append(this.height);
        return sb.toString();
    }
}
