package org.apache.commons.imaging.formats.png.chunks;

/* loaded from: classes17.dex */
public class PngChunkText extends org.apache.commons.imaging.formats.png.chunks.PngTextChunk {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.png.chunks.PngChunkText.class.getName());
    public final java.lang.String keyword;
    public final java.lang.String text;

    public PngChunkText(int i, int i2, int i3, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        super(i, i2, i3, bArr);
        int findNull = org.apache.commons.imaging.common.BinaryFunctions.findNull(bArr);
        if (findNull < 0) {
            throw new org.apache.commons.imaging.ImageReadException("PNG tEXt chunk keyword is not terminated.");
        }
        java.lang.String str = new java.lang.String(bArr, 0, findNull, java.nio.charset.StandardCharsets.ISO_8859_1);
        this.keyword = str;
        int i4 = findNull + 1;
        java.lang.String str2 = new java.lang.String(bArr, i4, bArr.length - i4, java.nio.charset.StandardCharsets.ISO_8859_1);
        this.text = str2;
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("Keyword: ".concat(str));
            logger.finest("Text: ".concat(str2));
        }
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
        return new org.apache.commons.imaging.formats.png.PngText.Text(this.keyword, this.text);
    }
}
