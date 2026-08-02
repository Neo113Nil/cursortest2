package org.apache.commons.codec.binary;

/* loaded from: classes17.dex */
public class Base16InputStream extends org.apache.commons.codec.binary.BaseNCodecInputStream {
    public Base16InputStream(java.io.InputStream inputStream) {
        this(inputStream, false);
    }

    public Base16InputStream(java.io.InputStream inputStream, boolean z) {
        this(inputStream, z, false);
    }

    public Base16InputStream(java.io.InputStream inputStream, boolean z, boolean z2) {
        this(inputStream, z, z2, org.apache.commons.codec.CodecPolicy.LENIENT);
    }

    public Base16InputStream(java.io.InputStream inputStream, boolean z, boolean z2, org.apache.commons.codec.CodecPolicy codecPolicy) {
        super(inputStream, new org.apache.commons.codec.binary.Base16(z2, codecPolicy), z);
    }
}
