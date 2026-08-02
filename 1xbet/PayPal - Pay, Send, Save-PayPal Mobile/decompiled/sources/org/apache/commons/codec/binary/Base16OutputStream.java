package org.apache.commons.codec.binary;

/* loaded from: classes17.dex */
public class Base16OutputStream extends org.apache.commons.codec.binary.BaseNCodecOutputStream {
    public Base16OutputStream(java.io.OutputStream outputStream) {
        this(outputStream, true);
    }

    public Base16OutputStream(java.io.OutputStream outputStream, boolean z) {
        this(outputStream, z, false);
    }

    public Base16OutputStream(java.io.OutputStream outputStream, boolean z, boolean z2) {
        this(outputStream, z, z2, org.apache.commons.codec.CodecPolicy.LENIENT);
    }

    public Base16OutputStream(java.io.OutputStream outputStream, boolean z, boolean z2, org.apache.commons.codec.CodecPolicy codecPolicy) {
        super(outputStream, new org.apache.commons.codec.binary.Base16(z2, codecPolicy), z);
    }
}
