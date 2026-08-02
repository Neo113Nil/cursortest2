package org.apache.commons.imaging.formats.psd.dataparsers;

/* loaded from: classes17.dex */
public class DataParserBitmap extends org.apache.commons.imaging.formats.psd.dataparsers.DataParser {
    @Override // org.apache.commons.imaging.formats.psd.dataparsers.DataParser
    public int getBasicChannelsCount() {
        return 1;
    }

    @Override // org.apache.commons.imaging.formats.psd.dataparsers.DataParser
    protected int getRGB(int[][][] iArr, int i, int i2, org.apache.commons.imaging.formats.psd.PsdImageContents psdImageContents) {
        int i3 = ((iArr[0][i2][i] & 255) == 0 ? 255 : 0) & 255;
        return i3 | (i3 << 16) | (-16777216) | (i3 << 8);
    }
}
