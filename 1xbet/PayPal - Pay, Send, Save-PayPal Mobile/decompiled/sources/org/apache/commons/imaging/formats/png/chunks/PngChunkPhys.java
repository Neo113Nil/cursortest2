package org.apache.commons.imaging.formats.png.chunks;

/* loaded from: classes17.dex */
public class PngChunkPhys extends org.apache.commons.imaging.formats.png.chunks.PngChunk {
    public final int pixelsPerUnitXAxis;
    public final int pixelsPerUnitYAxis;
    public final int unitSpecifier;

    public PngChunkPhys(int i, int i2, int i3, byte[] bArr) throws java.io.IOException {
        super(i, i2, i3, bArr);
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        this.pixelsPerUnitXAxis = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("PixelsPerUnitXAxis", byteArrayInputStream, "Not a Valid Png File: pHYs Corrupt", getByteOrder());
        this.pixelsPerUnitYAxis = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("PixelsPerUnitYAxis", byteArrayInputStream, "Not a Valid Png File: pHYs Corrupt", getByteOrder());
        this.unitSpecifier = org.apache.commons.imaging.common.BinaryFunctions.readByte("Unit specifier", byteArrayInputStream, "Not a Valid Png File: pHYs Corrupt");
    }
}
