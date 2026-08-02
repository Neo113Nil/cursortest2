package org.apache.commons.imaging.formats.png.chunks;

/* loaded from: classes17.dex */
public class PngChunkZtxt extends org.apache.commons.imaging.formats.png.chunks.PngTextChunk {
    public final java.lang.String keyword;
    public final java.lang.String text;

    public PngChunkZtxt(int i, int i2, int i3, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        super(i, i2, i3, bArr);
        int findNull = org.apache.commons.imaging.common.BinaryFunctions.findNull(bArr);
        if (findNull < 0) {
            throw new org.apache.commons.imaging.ImageReadException("PNG zTXt chunk keyword is unterminated.");
        }
        this.keyword = new java.lang.String(bArr, 0, findNull, java.nio.charset.StandardCharsets.ISO_8859_1);
        int i4 = findNull + 2;
        byte b = bArr[findNull + 1];
        if (b != 0) {
            throw new org.apache.commons.imaging.ImageReadException("PNG zTXt chunk has unexpected compression method: ".concat(java.lang.String.valueOf((int) b)));
        }
        int length = bArr.length - i4;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, i4, bArr2, 0, length);
        this.text = new java.lang.String(org.apache.commons.imaging.common.BinaryFunctions.getStreamBytes(new java.util.zip.InflaterInputStream(new java.io.ByteArrayInputStream(bArr2))), java.nio.charset.StandardCharsets.ISO_8859_1);
    }

    @Override // org.apache.commons.imaging.formats.png.chunks.PngTextChunk
    public java.lang.String getKeyword() {
        return this.keyword;
    }

    @Override // org.apache.commons.imaging.formats.png.chunks.PngTextChunk
    public java.lang.String getText() {
        return this.text;
    }

    @Override // org.apache.commons.imaging.formats.png.chunks.PngTextChunk
    public org.apache.commons.imaging.formats.png.PngText getContents() {
        return new org.apache.commons.imaging.formats.png.PngText.Ztxt(this.keyword, this.text);
    }
}
