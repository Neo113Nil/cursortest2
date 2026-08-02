package com.google.android.datatransport.runtime;

/* loaded from: classes3.dex */
public final class EncodedPayload {
    private final byte[] bytes;
    private final com.google.android.datatransport.Encoding encoding;

    public EncodedPayload(com.google.android.datatransport.Encoding encoding, byte[] bArr) {
        if (encoding == null) {
            throw new java.lang.NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new java.lang.NullPointerException("bytes is null");
        }
        this.encoding = encoding;
        this.bytes = bArr;
    }

    public final com.google.android.datatransport.Encoding getEncoding() {
        return this.encoding;
    }

    public final byte[] getBytes() {
        return this.bytes;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.EncodedPayload)) {
            return false;
        }
        com.google.android.datatransport.runtime.EncodedPayload encodedPayload = (com.google.android.datatransport.runtime.EncodedPayload) obj;
        if (this.encoding.equals(encodedPayload.encoding)) {
            return java.util.Arrays.equals(this.bytes, encodedPayload.bytes);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.encoding.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.bytes);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EncodedPayload{encoding=");
        sb.append(this.encoding);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}
