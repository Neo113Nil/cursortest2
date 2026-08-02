package org.apache.commons.imaging.formats.png.scanlinefilters;

/* loaded from: classes17.dex */
public class ScanlineFilterUp implements org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilter {
    @Override // org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilter
    public void unfilter(byte[] bArr, byte[] bArr2, byte[] bArr3) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr3 != null) {
                bArr2[i] = (byte) ((bArr[i] + bArr3[i]) % 256);
            } else {
                bArr2[i] = bArr[i];
            }
        }
    }
}
