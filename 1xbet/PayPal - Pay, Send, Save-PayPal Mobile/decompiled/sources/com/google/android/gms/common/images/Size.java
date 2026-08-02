package com.google.android.gms.common.images;

/* loaded from: classes8.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    private static java.lang.NumberFormatException zaa(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid Size: \"");
        sb.append(str);
        sb.append("\"");
        throw new java.lang.NumberFormatException(sb.toString());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.images.Size) {
            com.google.android.gms.common.images.Size size = (com.google.android.gms.common.images.Size) obj;
            if (this.zaa == size.zaa && this.zab == size.zab) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.zaa);
        sb.append("x");
        sb.append(this.zab);
        return sb.toString();
    }

    public static com.google.android.gms.common.images.Size parseSize(java.lang.String str) throws java.lang.NumberFormatException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("string must not be null");
        }
        int indexOf = str.indexOf(42);
        if (indexOf < 0) {
            indexOf = str.indexOf(120);
        }
        if (indexOf < 0) {
            throw zaa(str);
        }
        try {
            return new com.google.android.gms.common.images.Size(java.lang.Integer.parseInt(str.substring(0, indexOf)), java.lang.Integer.parseInt(str.substring(indexOf + 1)));
        } catch (java.lang.NumberFormatException unused) {
            throw zaa(str);
        }
    }

    public final int hashCode() {
        int i = this.zaa;
        return ((i << 16) | (i >>> 16)) ^ this.zab;
    }

    public final int getWidth() {
        return this.zaa;
    }

    public final int getHeight() {
        return this.zab;
    }

    public Size(int i, int i2) {
        this.zaa = i;
        this.zab = i2;
    }
}
