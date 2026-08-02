package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

/* loaded from: classes17.dex */
public class PhotometricInterpreterCieLab extends org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter {
    public PhotometricInterpreterCieLab(int i, int[] iArr, int i2, int i3, int i4) {
        super(i, iArr, i2, i3, i4);
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter
    public void interpretPixel(org.apache.commons.imaging.common.ImageBuilder imageBuilder, int[] iArr, int i, int i2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        imageBuilder.setRGB(i, i2, org.apache.commons.imaging.color.ColorConversions.convertCIELabtoARGBTest(iArr[0], (byte) iArr[1], (byte) iArr[2]));
    }
}
