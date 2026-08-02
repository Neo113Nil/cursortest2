package com.google.crypto.tink.util;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class Bytes {
    private final byte[] data;

    public static com.google.crypto.tink.util.Bytes copyFrom(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("data must be non-null");
        }
        return copyFrom(bArr, 0, bArr.length);
    }

    public static com.google.crypto.tink.util.Bytes copyFrom(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("data must be non-null");
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        return new com.google.crypto.tink.util.Bytes(bArr, i, i2);
    }

    public final byte[] toByteArray() {
        byte[] bArr = this.data;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final int size() {
        return this.data.length;
    }

    private Bytes(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.data = bArr2;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.crypto.tink.util.Bytes) {
            return java.util.Arrays.equals(((com.google.crypto.tink.util.Bytes) obj).data, this.data);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.data);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Bytes(");
        sb.append(com.google.crypto.tink.subtle.Hex.encode(this.data));
        sb.append(")");
        return sb.toString();
    }
}
