package org.apache.commons.imaging.common;

/* loaded from: classes17.dex */
public class BinaryConstant {
    private final byte[] value;

    public BinaryConstant(byte[] bArr) {
        this.value = (byte[]) bArr.clone();
    }

    public org.apache.commons.imaging.common.BinaryConstant clone() throws java.lang.CloneNotSupportedException {
        return (org.apache.commons.imaging.common.BinaryConstant) super.clone();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof org.apache.commons.imaging.common.BinaryConstant)) {
            return equals(((org.apache.commons.imaging.common.BinaryConstant) obj).value);
        }
        return false;
    }

    public boolean equals(byte[] bArr) {
        return java.util.Arrays.equals(this.value, bArr);
    }

    public boolean equals(byte[] bArr, int i, int i2) {
        if (this.value.length != i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.value[i3] != bArr[i + i3]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.value);
    }

    public byte get(int i) {
        return this.value[i];
    }

    public int size() {
        return this.value.length;
    }

    public byte[] toByteArray() {
        return (byte[]) this.value.clone();
    }

    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        for (byte b : this.value) {
            outputStream.write(b);
        }
    }
}
