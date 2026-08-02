package org.apache.commons.imaging.formats.png.chunks;

/* loaded from: classes17.dex */
public abstract class PngTextChunk extends org.apache.commons.imaging.formats.png.chunks.PngChunk {
    public abstract org.apache.commons.imaging.formats.png.PngText getContents();

    public abstract java.lang.String getKeyword();

    public abstract java.lang.String getText();

    public PngTextChunk(int i, int i2, int i3, byte[] bArr) {
        super(i, i2, i3, bArr);
    }
}
