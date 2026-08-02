package org.apache.commons.imaging.formats.png.chunks;

/* loaded from: classes17.dex */
public class PngChunkItxt extends org.apache.commons.imaging.formats.png.chunks.PngTextChunk {
    public final java.lang.String keyword;
    public final java.lang.String languageTag;
    public final java.lang.String text;
    public final java.lang.String translatedKeyword;

    public PngChunkItxt(int i, int i2, int i3, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        super(i, i2, i3, bArr);
        int findNull = org.apache.commons.imaging.common.BinaryFunctions.findNull(bArr);
        if (findNull < 0) {
            throw new org.apache.commons.imaging.ImageReadException("PNG iTXt chunk keyword is not terminated.");
        }
        this.keyword = new java.lang.String(bArr, 0, findNull, java.nio.charset.StandardCharsets.ISO_8859_1);
        byte b = bArr[findNull + 1];
        if (b != 0 && b != 1) {
            throw new org.apache.commons.imaging.ImageReadException("PNG iTXt chunk has invalid compression flag: ".concat(java.lang.String.valueOf((int) b)));
        }
        boolean z = b == 1;
        int i4 = findNull + 3;
        byte b2 = bArr[findNull + 2];
        if (z && b2 != 0) {
            throw new org.apache.commons.imaging.ImageReadException("PNG iTXt chunk has unexpected compression method: ".concat(java.lang.String.valueOf((int) b2)));
        }
        int findNull2 = org.apache.commons.imaging.common.BinaryFunctions.findNull(bArr, i4);
        if (findNull2 < 0) {
            throw new org.apache.commons.imaging.ImageReadException("PNG iTXt chunk language tag is not terminated.");
        }
        this.languageTag = new java.lang.String(bArr, i4, findNull2 - i4, java.nio.charset.StandardCharsets.ISO_8859_1);
        int i5 = findNull2 + 1;
        int findNull3 = org.apache.commons.imaging.common.BinaryFunctions.findNull(bArr, i5);
        if (findNull3 < 0) {
            throw new org.apache.commons.imaging.ImageReadException("PNG iTXt chunk translated keyword is not terminated.");
        }
        this.translatedKeyword = new java.lang.String(bArr, i5, findNull3 - i5, java.nio.charset.StandardCharsets.UTF_8);
        int i6 = findNull3 + 1;
        if (z) {
            int length = bArr.length - i6;
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(bArr, i6, bArr2, 0, length);
            this.text = new java.lang.String(org.apache.commons.imaging.common.BinaryFunctions.getStreamBytes(new java.util.zip.InflaterInputStream(new java.io.ByteArrayInputStream(bArr2))), java.nio.charset.StandardCharsets.UTF_8);
            return;
        }
        this.text = new java.lang.String(bArr, i6, bArr.length - i6, java.nio.charset.StandardCharsets.UTF_8);
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
        return new org.apache.commons.imaging.formats.png.PngText.Itxt(this.keyword, this.text, this.languageTag, this.translatedKeyword);
    }
}
