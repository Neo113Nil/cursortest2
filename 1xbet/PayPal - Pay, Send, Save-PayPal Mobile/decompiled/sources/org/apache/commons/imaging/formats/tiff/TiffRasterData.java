package org.apache.commons.imaging.formats.tiff;

/* loaded from: classes17.dex */
public class TiffRasterData {
    private final float[] data;
    private final int height;
    private final int width;

    public TiffRasterData(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new java.lang.IllegalArgumentException("Raster dimensions less than or equal to zero are not supported");
        }
        this.data = new float[i * i2];
        this.width = i;
        this.height = i2;
    }

    public TiffRasterData(int i, int i2, float[] fArr) {
        if (i <= 0 || i2 <= 0) {
            throw new java.lang.IllegalArgumentException("Raster dimensions less than or equal to zero are not supported");
        }
        if (fArr == null || fArr.length < i * i2) {
            throw new java.lang.IllegalArgumentException("Specified data does not contain sufficient elements");
        }
        this.width = i;
        this.height = i2;
        this.data = fArr;
    }

    public void setValue(int i, int i2, float f) {
        int i3;
        if (i < 0 || i >= (i3 = this.width) || i2 < 0 || i2 >= this.height) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Coordinates out of range (");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.data[(i2 * i3) + i] = f;
    }

    public float getValue(int i, int i2) {
        int i3;
        if (i < 0 || i >= (i3 = this.width) || i2 < 0 || i2 >= this.height) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Coordinates out of range (");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return this.data[(i2 * i3) + i];
    }

    public org.apache.commons.imaging.formats.tiff.TiffRasterStatistics getSimpleStatistics() {
        return new org.apache.commons.imaging.formats.tiff.TiffRasterStatistics(this, Float.NaN);
    }

    public org.apache.commons.imaging.formats.tiff.TiffRasterStatistics getSimpleStatistics(float f) {
        return new org.apache.commons.imaging.formats.tiff.TiffRasterStatistics(this, f);
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public float[] getData() {
        return this.data;
    }
}
