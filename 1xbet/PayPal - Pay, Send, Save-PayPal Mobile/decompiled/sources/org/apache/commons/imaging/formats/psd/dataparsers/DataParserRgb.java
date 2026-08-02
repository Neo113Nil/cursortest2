package org.apache.commons.imaging.formats.psd.dataparsers;

/* loaded from: classes17.dex */
public class DataParserRgb extends org.apache.commons.imaging.formats.psd.dataparsers.DataParser {
    @Override // org.apache.commons.imaging.formats.psd.dataparsers.DataParser
    public int getBasicChannelsCount() {
        return 3;
    }

    @Override // org.apache.commons.imaging.formats.psd.dataparsers.DataParser
    protected int getRGB(int[][][] iArr, int i, int i2, org.apache.commons.imaging.formats.psd.PsdImageContents psdImageContents) {
        return (iArr[2][i2][i] & 255) | ((iArr[0][i2][i] & 255) << 16) | (-16777216) | ((iArr[1][i2][i] & 255) << 8);
    }
}
