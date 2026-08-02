package org.apache.commons.imaging.formats.psd.datareaders;

/* loaded from: classes17.dex */
public class UncompressedDataReader implements org.apache.commons.imaging.formats.psd.datareaders.DataReader {
    private final org.apache.commons.imaging.formats.psd.dataparsers.DataParser dataParser;

    public UncompressedDataReader(org.apache.commons.imaging.formats.psd.dataparsers.DataParser dataParser) {
        this.dataParser = dataParser;
    }

    @Override // org.apache.commons.imaging.formats.psd.datareaders.DataReader
    public void readData(java.io.InputStream inputStream, java.awt.image.BufferedImage bufferedImage, org.apache.commons.imaging.formats.psd.PsdImageContents psdImageContents, org.apache.commons.imaging.common.BinaryFileParser binaryFileParser) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.psd.PsdHeaderInfo psdHeaderInfo = psdImageContents.header;
        int i = psdHeaderInfo.columns;
        int i2 = psdHeaderInfo.rows;
        int basicChannelsCount = this.dataParser.getBasicChannelsCount();
        int i3 = psdHeaderInfo.depth;
        org.apache.commons.imaging.common.mylzw.BitsToByteInputStream bitsToByteInputStream = new org.apache.commons.imaging.common.mylzw.BitsToByteInputStream(new org.apache.commons.imaging.common.mylzw.MyBitInputStream(inputStream, java.nio.ByteOrder.BIG_ENDIAN), 8);
        try {
            int[][][] iArr = (int[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, basicChannelsCount, i2, i);
            for (int i4 = 0; i4 < basicChannelsCount; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i; i6++) {
                        iArr[i4][i5][i6] = (byte) bitsToByteInputStream.readBits(i3);
                    }
                }
            }
            this.dataParser.parseData(iArr, bufferedImage, psdImageContents);
            bitsToByteInputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    bitsToByteInputStream.close();
                } catch (java.lang.Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
