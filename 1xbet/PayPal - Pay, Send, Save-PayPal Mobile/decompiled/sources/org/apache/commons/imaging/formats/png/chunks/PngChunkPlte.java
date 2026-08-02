package org.apache.commons.imaging.formats.png.chunks;

/* loaded from: classes17.dex */
public class PngChunkPlte extends org.apache.commons.imaging.formats.png.chunks.PngChunk {
    private final int[] rgb;

    public PngChunkPlte(int i, int i2, int i3, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        super(i, i2, i3, bArr);
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        if (i % 3 != 0) {
            throw new org.apache.commons.imaging.ImageReadException("PLTE: wrong length: ".concat(java.lang.String.valueOf(i)));
        }
        int i4 = i / 3;
        this.rgb = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("red[");
            sb.append(i5);
            sb.append("]");
            byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte(sb.toString(), byteArrayInputStream, "Not a Valid Png File: PLTE Corrupt");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("green[");
            sb2.append(i5);
            sb2.append("]");
            byte readByte2 = org.apache.commons.imaging.common.BinaryFunctions.readByte(sb2.toString(), byteArrayInputStream, "Not a Valid Png File: PLTE Corrupt");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("blue[");
            sb3.append(i5);
            sb3.append("]");
            this.rgb[i5] = ((readByte & 255) << 16) | (-16777216) | ((readByte2 & 255) << 8) | (org.apache.commons.imaging.common.BinaryFunctions.readByte(sb3.toString(), byteArrayInputStream, "Not a Valid Png File: PLTE Corrupt") & 255);
        }
    }

    public int[] getRgb() {
        return (int[]) this.rgb.clone();
    }

    public int getRGB(int i) throws org.apache.commons.imaging.ImageReadException {
        if (i >= 0) {
            int[] iArr = this.rgb;
            if (i < iArr.length) {
                return iArr[i];
            }
        }
        throw new org.apache.commons.imaging.ImageReadException("PNG: unknown Palette reference: ".concat(java.lang.String.valueOf(i)));
    }

    public void correct(org.apache.commons.imaging.formats.png.GammaCorrection gammaCorrection) {
        int i = 0;
        while (true) {
            int[] iArr = this.rgb;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = gammaCorrection.correctARGB(iArr[i]);
            i++;
        }
    }
}
