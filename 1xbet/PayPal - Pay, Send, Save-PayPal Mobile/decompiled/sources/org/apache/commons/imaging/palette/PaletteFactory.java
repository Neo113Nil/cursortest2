package org.apache.commons.imaging.palette;

/* loaded from: classes17.dex */
public class PaletteFactory {
    public static final int COMPONENTS = 3;
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.palette.PaletteFactory.class.getName());

    private int pixelToQuantizationTableIndex(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < 3) {
            i4 = (i4 << i2) | (((i & 255) >> (8 - i2)) & ((1 << i2) - 1));
            i3++;
            i >>= 8;
        }
        return i4;
    }

    public org.apache.commons.imaging.palette.Palette makeExactRgbPaletteFancy(java.awt.image.BufferedImage bufferedImage) {
        byte[] bArr = new byte[2097152];
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        for (int i = 0; i < height; i++) {
            for (int i2 = 0; i2 < width; i2++) {
                int rgb = bufferedImage.getRGB(i2, i);
                int i3 = 2097151 & rgb;
                bArr[i3] = (byte) ((1 << ((rgb >> 21) & 7)) | bArr[i3]);
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 2097152; i5++) {
            i4 += java.lang.Integer.bitCount(bArr[i5] & 255);
        }
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("Used colors: ".concat(java.lang.String.valueOf(i4)));
        }
        int[] iArr = new int[i4];
        int i6 = 0;
        for (int i7 = 0; i7 < 2097152; i7++) {
            byte b = bArr[i7];
            int i8 = 128;
            int i9 = 0;
            while (i9 < 8) {
                int i10 = i8 >>> 1;
                if ((i8 & b & 255) > 0) {
                    iArr[i6] = ((7 - i9) << 21) | i7;
                    i6++;
                }
                i9++;
                i8 = i10;
            }
        }
        java.util.Arrays.sort(iArr);
        return new org.apache.commons.imaging.palette.SimplePalette(iArr);
    }

    private int getFrequencyTotal(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        int i2 = 0;
        for (int i3 = iArr2[2]; i3 <= iArr3[2]; i3++) {
            for (int i4 = iArr2[1]; i4 <= iArr3[1]; i4++) {
                for (int i5 = iArr2[0]; i5 <= iArr3[0]; i5++) {
                    i2 += iArr[(i3 << (i * 2)) | (i4 << i) | i5];
                }
            }
        }
        return i2;
    }

    private org.apache.commons.imaging.palette.PaletteFactory.DivisionCandidate finishDivision(org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset, int i, int i2, int i3, int i4) {
        int i5;
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("trying (");
            sb.append(i);
            sb.append("): ");
            colorSpaceSubset.dump(sb.toString());
        }
        int i6 = colorSpaceSubset.total;
        if (i4 < colorSpaceSubset.mins[i] || i4 >= colorSpaceSubset.maxs[i] || i3 <= 0 || i3 >= i6 || (i5 = i6 - i3) <= 0 || i5 >= i6) {
            return null;
        }
        int[] iArr = new int[colorSpaceSubset.mins.length];
        java.lang.System.arraycopy(colorSpaceSubset.mins, 0, iArr, 0, colorSpaceSubset.mins.length);
        int[] iArr2 = new int[colorSpaceSubset.maxs.length];
        java.lang.System.arraycopy(colorSpaceSubset.maxs, 0, iArr2, 0, colorSpaceSubset.maxs.length);
        iArr2[i] = i4;
        iArr[i] = i4 + 1;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("total: ".concat(java.lang.String.valueOf(i6)));
            logger.finest("first total: ".concat(java.lang.String.valueOf(i3)));
            logger.finest("second total: ".concat(java.lang.String.valueOf(i5)));
            logger.finest("slice: ".concat(java.lang.String.valueOf(i4)));
        }
        return new org.apache.commons.imaging.palette.PaletteFactory.DivisionCandidate(new org.apache.commons.imaging.palette.ColorSpaceSubset(i3, i2, colorSpaceSubset.mins, iArr2), new org.apache.commons.imaging.palette.ColorSpaceSubset(i5, i2, iArr, colorSpaceSubset.maxs));
    }

    private java.util.List<org.apache.commons.imaging.palette.PaletteFactory.DivisionCandidate> divideSubset2(int[] iArr, org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset, int i, int i2) {
        if (LOGGER.isLoggable(java.util.logging.Level.FINEST)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("trying (");
            sb.append(i);
            sb.append("): ");
            colorSpaceSubset.dump(sb.toString());
        }
        int i3 = colorSpaceSubset.total;
        int[] iArr2 = new int[colorSpaceSubset.mins.length];
        int i4 = 0;
        java.lang.System.arraycopy(colorSpaceSubset.mins, 0, iArr2, 0, colorSpaceSubset.mins.length);
        int[] iArr3 = new int[colorSpaceSubset.maxs.length];
        java.lang.System.arraycopy(colorSpaceSubset.maxs, 0, iArr3, 0, colorSpaceSubset.maxs.length);
        int i5 = colorSpaceSubset.mins[i];
        int i6 = 0;
        while (i5 != colorSpaceSubset.maxs[i] + 1) {
            iArr2[i] = i5;
            iArr3[i] = i5;
            i6 = getFrequencyTotal(iArr, iArr2, iArr3, i2);
            i4 += i6;
            if (i4 >= i3 / 2) {
                break;
            }
            i5++;
        }
        org.apache.commons.imaging.palette.PaletteFactory.DivisionCandidate finishDivision = finishDivision(colorSpaceSubset, i, i2, i4, i5);
        org.apache.commons.imaging.palette.PaletteFactory.DivisionCandidate finishDivision2 = finishDivision(colorSpaceSubset, i, i2, i4 - i6, i5 - 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (finishDivision != null) {
            arrayList.add(finishDivision);
        }
        if (finishDivision2 != null) {
            arrayList.add(finishDivision2);
        }
        return arrayList;
    }

    private org.apache.commons.imaging.palette.PaletteFactory.DivisionCandidate divideSubset2(int[] iArr, org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset, int i) {
        java.util.ArrayList<org.apache.commons.imaging.palette.PaletteFactory.DivisionCandidate> arrayList = new java.util.ArrayList();
        arrayList.addAll(divideSubset2(iArr, colorSpaceSubset, 0, i));
        arrayList.addAll(divideSubset2(iArr, colorSpaceSubset, 1, i));
        arrayList.addAll(divideSubset2(iArr, colorSpaceSubset, 2, i));
        org.apache.commons.imaging.palette.PaletteFactory.DivisionCandidate divisionCandidate = null;
        double d = Double.MAX_VALUE;
        for (org.apache.commons.imaging.palette.PaletteFactory.DivisionCandidate divisionCandidate2 : arrayList) {
            org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset2 = divisionCandidate2.dst_a;
            org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset3 = divisionCandidate2.dst_b;
            int i2 = colorSpaceSubset2.total;
            int i3 = colorSpaceSubset3.total;
            double abs = java.lang.Math.abs(i2 - i3) / java.lang.Math.max(i2, i3);
            if (divisionCandidate == null || abs < d) {
                divisionCandidate = divisionCandidate2;
                d = abs;
            }
        }
        return divisionCandidate;
    }

    static class DivisionCandidate {
        private final org.apache.commons.imaging.palette.ColorSpaceSubset dst_a;
        private final org.apache.commons.imaging.palette.ColorSpaceSubset dst_b;

        DivisionCandidate(org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset, org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset2) {
            this.dst_a = colorSpaceSubset;
            this.dst_b = colorSpaceSubset2;
        }
    }

    private java.util.List<org.apache.commons.imaging.palette.ColorSpaceSubset> divide(java.util.List<org.apache.commons.imaging.palette.ColorSpaceSubset> list, int i, int[] iArr, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        do {
            int i3 = -1;
            org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset = null;
            for (org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset2 : list) {
                if (!arrayList.contains(colorSpaceSubset2)) {
                    int i4 = colorSpaceSubset2.total;
                    if (colorSpaceSubset == null || i4 > i3) {
                        colorSpaceSubset = colorSpaceSubset2;
                        i3 = i4;
                    }
                }
            }
            if (colorSpaceSubset == null) {
                break;
            }
            java.util.logging.Logger logger = LOGGER;
            if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                logger.finest("\tarea: ".concat(java.lang.String.valueOf(i3)));
            }
            org.apache.commons.imaging.palette.PaletteFactory.DivisionCandidate divideSubset2 = divideSubset2(iArr, colorSpaceSubset, i2);
            if (divideSubset2 != null) {
                list.remove(colorSpaceSubset);
                list.add(divideSubset2.dst_a);
                list.add(divideSubset2.dst_b);
            } else {
                arrayList.add(colorSpaceSubset);
            }
        } while (list.size() != i);
        return list;
    }

    public org.apache.commons.imaging.palette.Palette makeQuantizedRgbPalette(java.awt.image.BufferedImage bufferedImage, int i) {
        int[] iArr = new int[262144];
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = width * height;
        org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset = new org.apache.commons.imaging.palette.ColorSpaceSubset(i2, 6);
        arrayList.add(colorSpaceSubset);
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("pre total: ".concat(java.lang.String.valueOf(getFrequencyTotal(iArr, colorSpaceSubset.mins, colorSpaceSubset.maxs, 6))));
        }
        for (int i3 = 0; i3 < height; i3++) {
            for (int i4 = 0; i4 < width; i4++) {
                int pixelToQuantizationTableIndex = pixelToQuantizationTableIndex(bufferedImage.getRGB(i4, i3), 6);
                iArr[pixelToQuantizationTableIndex] = iArr[pixelToQuantizationTableIndex] + 1;
            }
        }
        java.util.logging.Logger logger2 = LOGGER;
        if (logger2.isLoggable(java.util.logging.Level.FINEST)) {
            logger2.finest("all total: ".concat(java.lang.String.valueOf(getFrequencyTotal(iArr, colorSpaceSubset.mins, colorSpaceSubset.maxs, 6))));
            logger2.finest("width * height: ".concat(java.lang.String.valueOf(i2)));
        }
        java.util.List<org.apache.commons.imaging.palette.ColorSpaceSubset> divide = divide(arrayList, i, iArr, 6);
        if (logger2.isLoggable(java.util.logging.Level.FINEST)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("subsets: ");
            sb.append(divide.size());
            logger2.finest(sb.toString());
            logger2.finest("width*height: ".concat(java.lang.String.valueOf(i2)));
        }
        for (int i5 = 0; i5 < divide.size(); i5++) {
            org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset2 = divide.get(i5);
            colorSpaceSubset2.setAverageRGB(iArr);
            if (LOGGER.isLoggable(java.util.logging.Level.FINEST)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(i5);
                sb2.append(": ");
                colorSpaceSubset2.dump(sb2.toString());
            }
        }
        java.util.Collections.sort(divide, org.apache.commons.imaging.palette.ColorSpaceSubset.RGB_COMPARATOR);
        return new org.apache.commons.imaging.palette.QuantizedPalette(divide, 6);
    }

    public org.apache.commons.imaging.palette.Palette makeQuantizedRgbaPalette(java.awt.image.BufferedImage bufferedImage, boolean z, int i) throws org.apache.commons.imaging.ImageWriteException {
        return new org.apache.commons.imaging.palette.MedianCutQuantizer(!z).process(bufferedImage, i, new org.apache.commons.imaging.palette.LongestAxisMedianCut());
    }

    public org.apache.commons.imaging.palette.SimplePalette makeExactRgbPaletteSimple(java.awt.image.BufferedImage bufferedImage, int i) {
        java.util.HashSet hashSet = new java.util.HashSet();
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        int i2 = 0;
        for (int i3 = 0; i3 < height; i3++) {
            for (int i4 = 0; i4 < width; i4++) {
                if (hashSet.add(java.lang.Integer.valueOf(bufferedImage.getRGB(i4, i3) & 16777215)) && hashSet.size() > i) {
                    return null;
                }
            }
        }
        int[] iArr = new int[hashSet.size()];
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            iArr[i2] = ((java.lang.Integer) it.next()).intValue();
            i2++;
        }
        java.util.Arrays.sort(iArr);
        return new org.apache.commons.imaging.palette.SimplePalette(iArr);
    }

    public boolean isGrayscale(java.awt.image.BufferedImage bufferedImage) {
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        if (6 == bufferedImage.getColorModel().getColorSpace().getType()) {
            return true;
        }
        for (int i = 0; i < height; i++) {
            for (int i2 = 0; i2 < width; i2++) {
                int rgb = bufferedImage.getRGB(i2, i);
                int i3 = (rgb >> 16) & 255;
                if (i3 != ((rgb >> 8) & 255) || i3 != (rgb & 255)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hasTransparency(java.awt.image.BufferedImage bufferedImage) {
        return hasTransparency(bufferedImage, 255);
    }

    public boolean hasTransparency(java.awt.image.BufferedImage bufferedImage, int i) {
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        if (!bufferedImage.getColorModel().hasAlpha()) {
            return false;
        }
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                if (((bufferedImage.getRGB(i3, i2) >> 24) & 255) < i) {
                    return true;
                }
            }
        }
        return false;
    }

    public int countTrasparentColors(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            if (((i2 >> 24) & 255) < 255) {
                if (i < 0) {
                    i = i2;
                } else if (i2 != i) {
                    return 2;
                }
            }
        }
        return i < 0 ? 0 : 1;
    }

    public int countTransparentColors(java.awt.image.BufferedImage bufferedImage) {
        if (!bufferedImage.getColorModel().hasAlpha()) {
            return 0;
        }
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        int i = -1;
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                int rgb = bufferedImage.getRGB(i3, i2);
                if (((rgb >> 24) & 255) < 255) {
                    if (i < 0) {
                        i = rgb;
                    } else if (rgb != i) {
                        return 2;
                    }
                }
            }
        }
        return i < 0 ? 0 : 1;
    }
}
