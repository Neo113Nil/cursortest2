package org.apache.commons.imaging.palette;

/* loaded from: classes17.dex */
public class QuantizedPalette implements org.apache.commons.imaging.palette.Palette {
    private final int precision;
    private final org.apache.commons.imaging.palette.ColorSpaceSubset[] straight;
    private final java.util.List<org.apache.commons.imaging.palette.ColorSpaceSubset> subsets;

    public QuantizedPalette(java.util.List<org.apache.commons.imaging.palette.ColorSpaceSubset> list, int i) {
        this.subsets = list;
        this.precision = i;
        this.straight = new org.apache.commons.imaging.palette.ColorSpaceSubset[1 << (i * 3)];
        for (int i2 = 0; i2 < list.size(); i2++) {
            org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset = list.get(i2);
            colorSpaceSubset.setIndex(i2);
            for (int i3 = colorSpaceSubset.mins[0]; i3 <= colorSpaceSubset.maxs[0]; i3++) {
                for (int i4 = colorSpaceSubset.mins[1]; i4 <= colorSpaceSubset.maxs[1]; i4++) {
                    for (int i5 = colorSpaceSubset.mins[2]; i5 <= colorSpaceSubset.maxs[2]; i5++) {
                        this.straight[(i3 << (i * 2)) | (i4 << i) | i5] = colorSpaceSubset;
                    }
                }
            }
        }
    }

    @Override // org.apache.commons.imaging.palette.Palette
    public int getPaletteIndex(int i) throws org.apache.commons.imaging.ImageWriteException {
        int i2 = this.precision;
        int i3 = (1 << i2) - 1;
        return this.straight[((i >> (16 - (i2 * 2))) & (i3 << i2)) | ((i >> (24 - (i2 * 3))) & (i3 << (i2 << 1))) | ((i >> (8 - i2)) & i3)].getIndex();
    }

    @Override // org.apache.commons.imaging.palette.Palette
    public int getEntry(int i) {
        return this.subsets.get(i).rgb;
    }

    @Override // org.apache.commons.imaging.palette.Palette
    public int length() {
        return this.subsets.size();
    }
}
