package org.apache.commons.imaging.palette;

/* loaded from: classes17.dex */
class MedianCutPalette extends org.apache.commons.imaging.palette.SimplePalette {
    private final org.apache.commons.imaging.palette.ColorGroup root;

    MedianCutPalette(org.apache.commons.imaging.palette.ColorGroup colorGroup, int[] iArr) {
        super(iArr);
        this.root = colorGroup;
    }

    @Override // org.apache.commons.imaging.palette.SimplePalette, org.apache.commons.imaging.palette.Palette
    public int getPaletteIndex(int i) {
        org.apache.commons.imaging.palette.ColorGroup colorGroup = this.root;
        while (colorGroup.cut != null) {
            colorGroup = colorGroup.cut.getColorGroup(i);
        }
        return colorGroup.paletteIndex;
    }
}
