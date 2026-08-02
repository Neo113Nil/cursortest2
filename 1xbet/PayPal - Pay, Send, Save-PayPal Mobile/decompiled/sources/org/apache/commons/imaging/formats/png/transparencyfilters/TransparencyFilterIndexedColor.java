package org.apache.commons.imaging.formats.png.transparencyfilters;

/* loaded from: classes17.dex */
public class TransparencyFilterIndexedColor extends org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter {
    public TransparencyFilterIndexedColor(byte[] bArr) {
        super(bArr);
    }

    @Override // org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter
    public int filter(int i, int i2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int length = getLength();
        if (i2 >= length) {
            return i;
        }
        if (i2 < 0 || i2 > length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransparencyFilterIndexedColor index: ");
            sb.append(i2);
            sb.append(", bytes.length: ");
            sb.append(length);
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        return (i & 16777215) | ((getByte(i2) & 255) << 24);
    }
}
