package com.google.android.exoplayer2.util;

/* loaded from: classes3.dex */
public final class Size {
    public static final com.google.android.exoplayer2.util.Size UNKNOWN = new com.google.android.exoplayer2.util.Size(-1, -1);
    private final int height;
    private final int width;

    public Size(int i, int i2) {
        com.google.android.exoplayer2.util.Assertions.checkArgument((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.width = i;
        this.height = i2;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.exoplayer2.util.Size)) {
            return false;
        }
        com.google.android.exoplayer2.util.Size size = (com.google.android.exoplayer2.util.Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public java.lang.String toString() {
        return this.width + "x" + this.height;
    }

    public int hashCode() {
        int i = this.height;
        int i2 = this.width;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }
}
