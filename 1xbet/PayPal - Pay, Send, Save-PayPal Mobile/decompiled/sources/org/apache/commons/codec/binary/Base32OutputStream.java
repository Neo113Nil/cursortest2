package org.apache.commons.codec.binary;

/* loaded from: classes17.dex */
public class Base32OutputStream extends org.apache.commons.codec.binary.BaseNCodecOutputStream {
    public Base32OutputStream(java.io.OutputStream outputStream) {
        this(outputStream, true);
    }

    public Base32OutputStream(java.io.OutputStream outputStream, boolean z) {
        super(outputStream, new org.apache.commons.codec.binary.Base32(false), z);
    }

    public Base32OutputStream(java.io.OutputStream outputStream, boolean z, int i, byte[] bArr) {
        super(outputStream, new org.apache.commons.codec.binary.Base32(i, bArr), z);
    }

    public Base32OutputStream(java.io.OutputStream outputStream, boolean z, int i, byte[] bArr, org.apache.commons.codec.CodecPolicy codecPolicy) {
        super(outputStream, new org.apache.commons.codec.binary.Base32(i, bArr, false, kotlin.io.encoding.Base64.padSymbol, codecPolicy), z);
    }
}
