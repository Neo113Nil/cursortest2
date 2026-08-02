package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

/* loaded from: classes17.dex */
public class PhotometricInterpreterBiLevel extends org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter {
    private final boolean invert;

    public PhotometricInterpreterBiLevel(int i, int[] iArr, int i2, int i3, int i4, boolean z) {
        super(i, iArr, i2, i3, i4);
        this.invert = z;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter
    public void interpretPixel(org.apache.commons.imaging.common.ImageBuilder imageBuilder, int[] iArr, int i, int i2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        int i3 = iArr[0];
        if (this.invert) {
            i3 = 255 - i3;
        }
        imageBuilder.setRGB(i, i2, i3 | (i3 << 16) | (-16777216) | (i3 << 8));
    }
}
