package org.apache.commons.imaging.palette;

/* loaded from: classes17.dex */
public class MedianCutQuantizer {
    private final boolean ignoreAlpha;

    public MedianCutQuantizer(boolean z) {
        this.ignoreAlpha = z;
    }

    private java.util.Map<java.lang.Integer, org.apache.commons.imaging.palette.ColorCount> groupColors1(java.awt.image.BufferedImage bufferedImage, int i, int i2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        int[] iArr = new int[width];
        for (int i3 = 0; i3 < height; i3++) {
            bufferedImage.getRGB(0, i3, width, 1, iArr, 0, width);
            for (int i4 = 0; i4 < width; i4++) {
                int i5 = iArr[i4];
                if (this.ignoreAlpha) {
                    i5 &= 16777215;
                }
                int i6 = i5 & i2;
                org.apache.commons.imaging.palette.ColorCount colorCount = (org.apache.commons.imaging.palette.ColorCount) hashMap.get(java.lang.Integer.valueOf(i6));
                if (colorCount == null) {
                    colorCount = new org.apache.commons.imaging.palette.ColorCount(i6);
                    hashMap.put(java.lang.Integer.valueOf(i6), colorCount);
                    if (hashMap.keySet().size() > i) {
                        return null;
                    }
                }
                colorCount.count++;
            }
        }
        return hashMap;
    }

    public java.util.Map<java.lang.Integer, org.apache.commons.imaging.palette.ColorCount> groupColors(java.awt.image.BufferedImage bufferedImage, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = 255 & (255 << i2);
            int i4 = (i3 << 16) | (i3 << 8) | i3 | (i3 << 24);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("mask(");
            sb.append(i2);
            sb.append("): ");
            sb.append(i4);
            sb.append(" (");
            sb.append(java.lang.Integer.toHexString(i4));
            sb.append(")");
            org.apache.commons.imaging.internal.Debug.debug(sb.toString());
            java.util.Map<java.lang.Integer, org.apache.commons.imaging.palette.ColorCount> groupColors1 = groupColors1(bufferedImage, Integer.MAX_VALUE, i4);
            if (groupColors1 != null) {
                return groupColors1;
            }
        }
        throw new java.lang.Error("");
    }

    public org.apache.commons.imaging.palette.Palette process(java.awt.image.BufferedImage bufferedImage, int i, org.apache.commons.imaging.palette.MedianCut medianCut) throws org.apache.commons.imaging.ImageWriteException {
        java.util.Map<java.lang.Integer, org.apache.commons.imaging.palette.ColorCount> groupColors = groupColors(bufferedImage, i);
        int size = groupColors.keySet().size();
        int i2 = 0;
        if (size <= i) {
            org.apache.commons.imaging.internal.Debug.debug("lossless palette: ".concat(java.lang.String.valueOf(size)));
            int[] iArr = new int[size];
            java.util.ArrayList arrayList = new java.util.ArrayList(groupColors.values());
            while (i2 < arrayList.size()) {
                int i3 = ((org.apache.commons.imaging.palette.ColorCount) arrayList.get(i2)).argb;
                iArr[i2] = i3;
                if (this.ignoreAlpha) {
                    iArr[i2] = i3 | (-16777216);
                }
                i2++;
            }
            return new org.apache.commons.imaging.palette.SimplePalette(iArr);
        }
        org.apache.commons.imaging.internal.Debug.debug("discrete colors: ".concat(java.lang.String.valueOf(size)));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        org.apache.commons.imaging.palette.ColorGroup colorGroup = new org.apache.commons.imaging.palette.ColorGroup(new java.util.ArrayList(groupColors.values()), this.ignoreAlpha);
        arrayList2.add(colorGroup);
        while (arrayList2.size() < i && medianCut.performNextMedianCut(arrayList2, this.ignoreAlpha)) {
        }
        int size2 = arrayList2.size();
        org.apache.commons.imaging.internal.Debug.debug("palette size: ".concat(java.lang.String.valueOf(size2)));
        int[] iArr2 = new int[size2];
        while (i2 < arrayList2.size()) {
            org.apache.commons.imaging.palette.ColorGroup colorGroup2 = arrayList2.get(i2);
            iArr2[i2] = colorGroup2.getMedianValue();
            colorGroup2.paletteIndex = i2;
            if (colorGroup2.getColorCounts().isEmpty()) {
                throw new org.apache.commons.imaging.ImageWriteException("empty color_group: ".concat(java.lang.String.valueOf(colorGroup2)));
            }
            i2++;
        }
        if (size2 > size) {
            throw new org.apache.commons.imaging.ImageWriteException("palette_size > discrete_colors");
        }
        return new org.apache.commons.imaging.palette.MedianCutPalette(colorGroup, iArr2);
    }
}
