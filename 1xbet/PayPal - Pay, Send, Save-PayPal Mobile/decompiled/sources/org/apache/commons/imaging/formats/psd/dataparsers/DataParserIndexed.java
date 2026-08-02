package org.apache.commons.imaging.formats.psd.dataparsers;

/* loaded from: classes17.dex */
public class DataParserIndexed extends org.apache.commons.imaging.formats.psd.dataparsers.DataParser {
    private final int[] colorTable = new int[256];

    @Override // org.apache.commons.imaging.formats.psd.dataparsers.DataParser
    public int getBasicChannelsCount() {
        return 1;
    }

    public DataParserIndexed(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.colorTable[i] = ((bArr[i] & 255) << 16) | (-16777216) | ((bArr[i + 256] & 255) << 8) | (bArr[i + 512] & 255);
        }
    }

    @Override // org.apache.commons.imaging.formats.psd.dataparsers.DataParser
    protected int getRGB(int[][][] iArr, int i, int i2, org.apache.commons.imaging.formats.psd.PsdImageContents psdImageContents) {
        return this.colorTable[iArr[0][i2][i] & 255];
    }
}
