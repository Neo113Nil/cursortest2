package org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint;

/* loaded from: classes17.dex */
public class PaletteEntryForValue implements org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry {
    private final java.awt.Color color;
    private final int iColor;
    private boolean isNull;
    private final float value;

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public boolean coversSingleEntry() {
        return true;
    }

    public PaletteEntryForValue(float f, java.awt.Color color) {
        if (color == null) {
            throw new java.lang.IllegalArgumentException("Null colors not allowed");
        }
        this.value = f;
        this.color = color;
        this.iColor = color.getRGB();
        this.isNull = java.lang.Float.isNaN(f);
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public boolean isCovered(float f) {
        if (this.isNull) {
            return java.lang.Float.isNaN(f);
        }
        return f == this.value;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public int getARGB(float f) {
        if (this.isNull && java.lang.Float.isNaN(f)) {
            return this.iColor;
        }
        if (f == this.value) {
            return this.iColor;
        }
        return 0;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public java.awt.Color getColor(float f) {
        if (this.isNull && java.lang.Float.isNaN(f)) {
            return this.color;
        }
        if (f == this.value) {
            return this.color;
        }
        return null;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public float getLowerBound() {
        return this.value;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public float getUpperBound() {
        return this.value;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaletteEntry for single value");
        sb.append(this.value);
        return sb.toString();
    }
}
