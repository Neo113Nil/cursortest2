package org.apache.commons.imaging.formats.psd.datareaders;

/* loaded from: classes17.dex */
public class CompressedDataReader implements org.apache.commons.imaging.formats.psd.datareaders.DataReader {
    private final org.apache.commons.imaging.formats.psd.dataparsers.DataParser dataParser;

    public CompressedDataReader(org.apache.commons.imaging.formats.psd.dataparsers.DataParser dataParser) {
        this.dataParser = dataParser;
    }

    @Override // org.apache.commons.imaging.formats.psd.datareaders.DataReader
    public void readData(java.io.InputStream inputStream, java.awt.image.BufferedImage bufferedImage, org.apache.commons.imaging.formats.psd.PsdImageContents psdImageContents, org.apache.commons.imaging.common.BinaryFileParser binaryFileParser) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        org.apache.commons.imaging.formats.psd.PsdHeaderInfo psdHeaderInfo = psdImageContents.header;
        int i = psdHeaderInfo.columns;
        int i2 = psdHeaderInfo.rows;
        int i3 = psdHeaderInfo.channels * i2;
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("scanline_bytecount[");
            sb.append(i4);
            sb.append("]");
            iArr[i4] = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes(sb.toString(), inputStream, "PSD: bad Image Data", binaryFileParser.getByteOrder());
        }
        int i5 = psdHeaderInfo.depth;
        int basicChannelsCount = this.dataParser.getBasicChannelsCount();
        int[][][] iArr2 = (int[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) int[].class, basicChannelsCount, i2);
        for (int i6 = 0; i6 < basicChannelsCount; i6++) {
            for (int i7 = 0; i7 < i2; i7++) {
                org.apache.commons.imaging.common.mylzw.BitsToByteInputStream bitsToByteInputStream = new org.apache.commons.imaging.common.mylzw.BitsToByteInputStream(new org.apache.commons.imaging.common.mylzw.MyBitInputStream(new java.io.ByteArrayInputStream(new org.apache.commons.imaging.common.PackBits().decompress(org.apache.commons.imaging.common.BinaryFunctions.readBytes("scanline", inputStream, iArr[(i6 * i2) + i7], "PSD: Missing Image Data"), i)), java.nio.ByteOrder.BIG_ENDIAN), 8);
                try {
                    iArr2[i6][i7] = bitsToByteInputStream.readBitsArray(i5, i);
                    bitsToByteInputStream.close();
                } finally {
                }
            }
        }
        this.dataParser.parseData(iArr2, bufferedImage, psdImageContents);
    }
}
