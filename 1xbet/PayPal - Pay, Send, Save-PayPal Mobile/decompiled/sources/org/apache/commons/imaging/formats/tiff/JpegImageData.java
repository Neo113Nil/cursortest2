package org.apache.commons.imaging.formats.tiff;

/* loaded from: classes17.dex */
public class JpegImageData extends org.apache.commons.imaging.formats.tiff.TiffElement.DataElement {
    public JpegImageData(long j, int i, byte[] bArr) {
        super(j, i, bArr);
    }

    @Override // org.apache.commons.imaging.formats.tiff.TiffElement
    public java.lang.String getElementDescription() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Jpeg image data: ");
        sb.append(getDataLength());
        sb.append(" bytes");
        return sb.toString();
    }
}
