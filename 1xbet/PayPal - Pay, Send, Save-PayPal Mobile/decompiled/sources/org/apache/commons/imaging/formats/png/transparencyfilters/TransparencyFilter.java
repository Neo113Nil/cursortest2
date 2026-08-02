package org.apache.commons.imaging.formats.png.transparencyfilters;

/* loaded from: classes17.dex */
public abstract class TransparencyFilter extends org.apache.commons.imaging.common.BinaryFileParser {
    private final byte[] bytes;

    public abstract int filter(int i, int i2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    public TransparencyFilter(byte[] bArr) {
        this.bytes = (byte[]) bArr.clone();
    }

    public byte getByte(int i) {
        return this.bytes[i];
    }

    public int getLength() {
        return this.bytes.length;
    }
}
