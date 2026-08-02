package org.apache.commons.imaging.formats.psd.dataparsers;

/* loaded from: classes17.dex */
public abstract class DataParser {
    public abstract int getBasicChannelsCount();

    protected abstract int getRGB(int[][][] iArr, int i, int i2, org.apache.commons.imaging.formats.psd.PsdImageContents psdImageContents);

    public final void parseData(int[][][] iArr, java.awt.image.BufferedImage bufferedImage, org.apache.commons.imaging.formats.psd.PsdImageContents psdImageContents) {
        java.awt.image.DataBuffer dataBuffer = bufferedImage.getRaster().getDataBuffer();
        org.apache.commons.imaging.formats.psd.PsdHeaderInfo psdHeaderInfo = psdImageContents.header;
        int i = psdHeaderInfo.columns;
        int i2 = psdHeaderInfo.rows;
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                dataBuffer.setElem((i3 * i) + i4, getRGB(iArr, i4, i3, psdImageContents));
            }
        }
    }
}
