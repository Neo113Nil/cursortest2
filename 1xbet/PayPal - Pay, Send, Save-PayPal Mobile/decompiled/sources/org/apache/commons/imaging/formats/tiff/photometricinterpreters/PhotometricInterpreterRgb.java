package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

/* loaded from: classes17.dex */
public class PhotometricInterpreterRgb extends org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter {
    public PhotometricInterpreterRgb(int i, int[] iArr, int i2, int i3, int i4) {
        super(i, iArr, i2, i3, i4);
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter
    public void interpretPixel(org.apache.commons.imaging.common.ImageBuilder imageBuilder, int[] iArr, int i, int i2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        imageBuilder.setRGB(i, i2, iArr[2] | (iArr[0] << 16) | (-16777216) | (iArr[1] << 8));
    }
}
