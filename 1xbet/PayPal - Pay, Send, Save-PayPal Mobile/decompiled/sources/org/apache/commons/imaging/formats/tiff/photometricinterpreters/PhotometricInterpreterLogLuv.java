package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

/* loaded from: classes17.dex */
public class PhotometricInterpreterLogLuv extends org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter {

    static class TristimulusValues {
        public float x;
        public float y;
        public float z;

        TristimulusValues() {
        }
    }

    static class RgbValues {
        public int b;
        public int g;
        public int r;

        RgbValues() {
        }
    }

    public PhotometricInterpreterLogLuv(int i, int[] iArr, int i2, int i3, int i4) {
        super(i, iArr, i2, i3, i4);
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter
    public void interpretPixel(org.apache.commons.imaging.common.ImageBuilder imageBuilder, int[] iArr, int i, int i2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (iArr == null || iArr.length != 3) {
            throw new org.apache.commons.imaging.ImageReadException("Invalid length of bits per sample (expected 3).");
        }
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv.RgbValues rgbValues = getRgbValues(getTristimulusValues(iArr[0], (byte) iArr[1], (byte) iArr[2]));
        imageBuilder.setRGB(i, i2, java.lang.Math.min(255, java.lang.Math.max(0, rgbValues.b)) | (java.lang.Math.min(255, java.lang.Math.max(0, rgbValues.r)) << 16) | (-16777216) | (java.lang.Math.min(255, java.lang.Math.max(0, rgbValues.g)) << 8));
    }

    org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv.TristimulusValues getTristimulusValues(int i, int i2, int i3) {
        float f = (((i * 100.0f) / 255.0f) + 16.0f) / 116.0f;
        float f2 = (i2 / 500.0f) + f;
        float f3 = f - (i3 / 200.0f);
        float pow = (float) java.lang.Math.pow(f2, 3.0d);
        float pow2 = (float) java.lang.Math.pow(f, 3.0d);
        float pow3 = (float) java.lang.Math.pow(f3, 3.0d);
        if (pow2 <= 0.008856f) {
            pow2 = (f - 0.13793103f) / 7.787f;
        }
        if (pow <= 0.008856f) {
            pow = (f2 - 0.13793103f) / 7.787f;
        }
        if (pow3 <= 0.008856f) {
            pow3 = (f3 - 0.13793103f) / 7.787f;
        }
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv.TristimulusValues tristimulusValues = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv.TristimulusValues();
        tristimulusValues.x = pow * 95.047f;
        tristimulusValues.y = pow2 * 100.0f;
        tristimulusValues.z = pow3 * 108.883f;
        return tristimulusValues;
    }

    org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv.RgbValues getRgbValues(org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv.TristimulusValues tristimulusValues) {
        float f = tristimulusValues.x / 100.0f;
        float f2 = tristimulusValues.y / 100.0f;
        float f3 = tristimulusValues.z / 100.0f;
        float f4 = (3.2406f * f) + ((-1.5372f) * f2) + ((-0.4986f) * f3);
        float f5 = ((-0.9689f) * f) + (1.8758f * f2) + (0.0415f * f3);
        float f6 = (f * 0.0557f) + (f2 * (-0.204f)) + (f3 * 1.057f);
        double d = f4;
        float pow = d > 0.0031308d ? (((float) java.lang.Math.pow(d, 0.4166666666666667d)) * 1.055f) - 0.055f : f4 * 12.92f;
        double d2 = f5;
        float pow2 = d2 > 0.0031308d ? (((float) java.lang.Math.pow(d2, 0.4166666666666667d)) * 1.055f) - 0.055f : f5 * 12.92f;
        double d3 = f6;
        float pow3 = d3 > 0.0031308d ? (((float) java.lang.Math.pow(d3, 0.4166666666666667d)) * 1.055f) - 0.055f : f6 * 12.92f;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv.RgbValues rgbValues = new org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv.RgbValues();
        rgbValues.r = (int) (pow * 255.0f);
        rgbValues.g = (int) (pow2 * 255.0f);
        rgbValues.b = (int) (pow3 * 255.0f);
        return rgbValues;
    }
}
