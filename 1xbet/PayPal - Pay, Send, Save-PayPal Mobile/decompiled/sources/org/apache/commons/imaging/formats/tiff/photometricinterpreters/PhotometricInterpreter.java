package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

/* loaded from: classes17.dex */
public abstract class PhotometricInterpreter {
    private final int[] bitsPerSample;
    protected final int height;
    protected final int predictor;
    protected final int samplesPerPixel;
    protected final int width;

    public abstract void interpretPixel(org.apache.commons.imaging.common.ImageBuilder imageBuilder, int[] iArr, int i, int i2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException;

    public PhotometricInterpreter(int i, int[] iArr, int i2, int i3, int i4) {
        this.samplesPerPixel = i;
        this.bitsPerSample = iArr;
        this.predictor = i2;
        this.width = i3;
        this.height = i4;
    }

    protected int getBitsPerSample(int i) {
        return this.bitsPerSample[i];
    }
}
