package org.apache.commons.imaging.formats.png.chunks;

/* loaded from: classes17.dex */
public class PngChunkIhdr extends org.apache.commons.imaging.formats.png.chunks.PngChunk {
    public final int bitDepth;
    public final int compressionMethod;
    public final int filterMethod;
    public final int height;
    public final org.apache.commons.imaging.formats.png.InterlaceMethod interlaceMethod;
    public final org.apache.commons.imaging.formats.png.PngColorType pngColorType;
    public final int width;

    public PngChunkIhdr(int i, int i2, int i3, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        super(i, i2, i3, bArr);
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        this.width = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(com.google.common.net.HttpHeaders.WIDTH, byteArrayInputStream, "Not a Valid Png File: IHDR Corrupt", getByteOrder());
        this.height = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Height, byteArrayInputStream, "Not a Valid Png File: IHDR Corrupt", getByteOrder());
        this.bitDepth = org.apache.commons.imaging.common.BinaryFunctions.readByte("BitDepth", byteArrayInputStream, "Not a Valid Png File: IHDR Corrupt");
        byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("ColorType", byteArrayInputStream, "Not a Valid Png File: IHDR Corrupt");
        org.apache.commons.imaging.formats.png.PngColorType colorType = org.apache.commons.imaging.formats.png.PngColorType.getColorType(readByte);
        this.pngColorType = colorType;
        if (colorType == null) {
            throw new org.apache.commons.imaging.ImageReadException("PNG: unknown color type: ".concat(java.lang.String.valueOf((int) readByte)));
        }
        this.compressionMethod = org.apache.commons.imaging.common.BinaryFunctions.readByte("CompressionMethod", byteArrayInputStream, "Not a Valid Png File: IHDR Corrupt");
        this.filterMethod = org.apache.commons.imaging.common.BinaryFunctions.readByte("FilterMethod", byteArrayInputStream, "Not a Valid Png File: IHDR Corrupt");
        byte readByte2 = org.apache.commons.imaging.common.BinaryFunctions.readByte("InterlaceMethod", byteArrayInputStream, "Not a Valid Png File: IHDR Corrupt");
        if (readByte2 < 0 || readByte2 >= org.apache.commons.imaging.formats.png.InterlaceMethod.values().length) {
            throw new org.apache.commons.imaging.ImageReadException("PNG: unknown interlace method: ".concat(java.lang.String.valueOf((int) readByte2)));
        }
        this.interlaceMethod = org.apache.commons.imaging.formats.png.InterlaceMethod.values()[readByte2];
    }
}
