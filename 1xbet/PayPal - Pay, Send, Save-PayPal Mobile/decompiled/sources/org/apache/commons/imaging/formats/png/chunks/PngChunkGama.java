package org.apache.commons.imaging.formats.png.chunks;

/* loaded from: classes17.dex */
public class PngChunkGama extends org.apache.commons.imaging.formats.png.chunks.PngChunk {
    public final int gamma;

    public PngChunkGama(int i, int i2, int i3, byte[] bArr) throws java.io.IOException {
        super(i, i2, i3, bArr);
        this.gamma = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes(androidx.exifinterface.media.ExifInterface.TAG_GAMMA, new java.io.ByteArrayInputStream(bArr), "Not a Valid Png File: gAMA Corrupt", getByteOrder());
    }

    public double getGamma() {
        return 1.0d / (this.gamma / 100000.0d);
    }
}
