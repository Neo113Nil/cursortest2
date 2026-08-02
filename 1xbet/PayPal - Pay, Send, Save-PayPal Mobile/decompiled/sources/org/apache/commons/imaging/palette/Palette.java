package org.apache.commons.imaging.palette;

/* loaded from: classes17.dex */
public interface Palette {
    int getEntry(int i);

    int getPaletteIndex(int i) throws org.apache.commons.imaging.ImageWriteException;

    int length();
}
