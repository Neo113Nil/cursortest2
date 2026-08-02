package org.apache.commons.imaging.formats.tiff;

/* loaded from: classes17.dex */
public class TiffHeader extends org.apache.commons.imaging.formats.tiff.TiffElement {
    public final java.nio.ByteOrder byteOrder;
    public final long offsetToFirstIFD;
    public final int tiffVersion;

    public TiffHeader(java.nio.ByteOrder byteOrder, int i, long j) {
        super(0L, 8);
        this.byteOrder = byteOrder;
        this.tiffVersion = i;
        this.offsetToFirstIFD = j;
    }

    @Override // org.apache.commons.imaging.formats.tiff.TiffElement
    public java.lang.String getElementDescription() {
        return "TIFF Header";
    }
}
