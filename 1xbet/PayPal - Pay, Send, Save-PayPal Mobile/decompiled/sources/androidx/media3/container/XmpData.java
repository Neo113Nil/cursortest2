package androidx.media3.container;

/* loaded from: classes7.dex */
public final class XmpData implements androidx.media3.common.Metadata.Entry {
    public final byte[] data;

    public XmpData(byte[] bArr) {
        this.data = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.data, ((androidx.media3.container.XmpData) obj).data);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.data);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("XMP: ");
        sb.append(androidx.media3.common.util.Util.toHexString(this.data));
        return sb.toString();
    }
}
