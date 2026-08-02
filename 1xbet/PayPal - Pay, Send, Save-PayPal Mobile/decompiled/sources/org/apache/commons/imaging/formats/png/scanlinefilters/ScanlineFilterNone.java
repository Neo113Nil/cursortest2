package org.apache.commons.imaging.formats.png.scanlinefilters;

/* loaded from: classes17.dex */
public class ScanlineFilterNone implements org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilter {
    @Override // org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilter
    public void unfilter(byte[] bArr, byte[] bArr2, byte[] bArr3) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }
}
