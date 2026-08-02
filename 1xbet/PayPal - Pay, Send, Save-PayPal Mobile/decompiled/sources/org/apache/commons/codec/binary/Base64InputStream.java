package org.apache.commons.codec.binary;

/* loaded from: classes17.dex */
public class Base64InputStream extends org.apache.commons.codec.binary.BaseNCodecInputStream {
    public Base64InputStream(java.io.InputStream inputStream) {
        this(inputStream, false);
    }

    public Base64InputStream(java.io.InputStream inputStream, boolean z) {
        super(inputStream, new org.apache.commons.codec.binary.Base64(false), z);
    }

    public Base64InputStream(java.io.InputStream inputStream, boolean z, int i, byte[] bArr) {
        super(inputStream, new org.apache.commons.codec.binary.Base64(i, bArr), z);
    }

    public Base64InputStream(java.io.InputStream inputStream, boolean z, int i, byte[] bArr, org.apache.commons.codec.CodecPolicy codecPolicy) {
        super(inputStream, new org.apache.commons.codec.binary.Base64(i, bArr, false, codecPolicy), z);
    }
}
