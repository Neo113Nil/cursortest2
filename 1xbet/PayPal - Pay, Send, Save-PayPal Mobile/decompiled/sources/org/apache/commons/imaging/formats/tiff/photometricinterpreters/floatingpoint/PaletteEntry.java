package org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint;

/* loaded from: classes17.dex */
public interface PaletteEntry {
    boolean coversSingleEntry();

    int getARGB(float f);

    java.awt.Color getColor(float f);

    float getLowerBound();

    float getUpperBound();

    boolean isCovered(float f);
}
