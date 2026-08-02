package com.google.zxing.datamatrix.decoder;

/* loaded from: classes9.dex */
public final class Version {
    private static final com.google.zxing.datamatrix.decoder.Version[] VERSIONS = buildVersions();
    private final int dataRegionSizeColumns;
    private final int dataRegionSizeRows;
    private final com.google.zxing.datamatrix.decoder.Version.ECBlocks ecBlocks;
    private final int symbolSizeColumns;
    private final int symbolSizeRows;
    private final int totalCodewords;
    private final int versionNumber;

    private Version(int i, int i2, int i3, int i4, int i5, com.google.zxing.datamatrix.decoder.Version.ECBlocks eCBlocks) {
        this.versionNumber = i;
        this.symbolSizeRows = i2;
        this.symbolSizeColumns = i3;
        this.dataRegionSizeRows = i4;
        this.dataRegionSizeColumns = i5;
        this.ecBlocks = eCBlocks;
        int eCCodewords = eCBlocks.getECCodewords();
        int i6 = 0;
        for (com.google.zxing.datamatrix.decoder.Version.ECB ecb : eCBlocks.getECBlocks()) {
            i6 += ecb.getCount() * (ecb.getDataCodewords() + eCCodewords);
        }
        this.totalCodewords = i6;
    }

    public final int getVersionNumber() {
        return this.versionNumber;
    }

    public final int getSymbolSizeRows() {
        return this.symbolSizeRows;
    }

    public final int getSymbolSizeColumns() {
        return this.symbolSizeColumns;
    }

    public final int getDataRegionSizeRows() {
        return this.dataRegionSizeRows;
    }

    public final int getDataRegionSizeColumns() {
        return this.dataRegionSizeColumns;
    }

    public final int getTotalCodewords() {
        return this.totalCodewords;
    }

    final com.google.zxing.datamatrix.decoder.Version.ECBlocks getECBlocks() {
        return this.ecBlocks;
    }

    public static com.google.zxing.datamatrix.decoder.Version getVersionForDimensions(int i, int i2) throws com.google.zxing.FormatException {
        if ((i & 1) != 0 || (i2 & 1) != 0) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        for (com.google.zxing.datamatrix.decoder.Version version : VERSIONS) {
            if (version.symbolSizeRows == i && version.symbolSizeColumns == i2) {
                return version;
            }
        }
        throw com.google.zxing.FormatException.getFormatInstance();
    }

    static final class ECBlocks {
        private final com.google.zxing.datamatrix.decoder.Version.ECB[] ecBlocks;
        private final int ecCodewords;

        private ECBlocks(int i, com.google.zxing.datamatrix.decoder.Version.ECB ecb) {
            this.ecCodewords = i;
            this.ecBlocks = new com.google.zxing.datamatrix.decoder.Version.ECB[]{ecb};
        }

        private ECBlocks(int i, com.google.zxing.datamatrix.decoder.Version.ECB ecb, com.google.zxing.datamatrix.decoder.Version.ECB ecb2) {
            this.ecCodewords = i;
            this.ecBlocks = new com.google.zxing.datamatrix.decoder.Version.ECB[]{ecb, ecb2};
        }

        final int getECCodewords() {
            return this.ecCodewords;
        }

        final com.google.zxing.datamatrix.decoder.Version.ECB[] getECBlocks() {
            return this.ecBlocks;
        }
    }

    static final class ECB {
        private final int count;
        private final int dataCodewords;

        private ECB(int i, int i2) {
            this.count = i;
            this.dataCodewords = i2;
        }

        final int getCount() {
            return this.count;
        }

        final int getDataCodewords() {
            return this.dataCodewords;
        }
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.versionNumber);
    }

    private static com.google.zxing.datamatrix.decoder.Version[] buildVersions() {
        int i = 1;
        int i2 = 5;
        com.google.zxing.datamatrix.decoder.Version version = new com.google.zxing.datamatrix.decoder.Version(1, 10, 10, 8, 8, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(i2, new com.google.zxing.datamatrix.decoder.Version.ECB(i, 3)));
        com.google.zxing.datamatrix.decoder.Version version2 = new com.google.zxing.datamatrix.decoder.Version(2, 12, 12, 10, 10, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(7, new com.google.zxing.datamatrix.decoder.Version.ECB(i, i2)));
        com.google.zxing.datamatrix.decoder.Version version3 = new com.google.zxing.datamatrix.decoder.Version(3, 14, 14, 12, 12, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(10, new com.google.zxing.datamatrix.decoder.Version.ECB(i, 8)));
        int i3 = 12;
        com.google.zxing.datamatrix.decoder.Version version4 = new com.google.zxing.datamatrix.decoder.Version(4, 16, 16, 14, 14, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(i3, new com.google.zxing.datamatrix.decoder.Version.ECB(i, i3)));
        int i4 = 18;
        com.google.zxing.datamatrix.decoder.Version version5 = new com.google.zxing.datamatrix.decoder.Version(5, 18, 18, 16, 16, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(14, new com.google.zxing.datamatrix.decoder.Version.ECB(i, i4)));
        com.google.zxing.datamatrix.decoder.Version version6 = new com.google.zxing.datamatrix.decoder.Version(6, 20, 20, 18, 18, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(i4, new com.google.zxing.datamatrix.decoder.Version.ECB(i, 22)));
        com.google.zxing.datamatrix.decoder.Version version7 = new com.google.zxing.datamatrix.decoder.Version(7, 22, 22, 20, 20, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(20, new com.google.zxing.datamatrix.decoder.Version.ECB(i, 30)));
        int i5 = 36;
        com.google.zxing.datamatrix.decoder.Version version8 = new com.google.zxing.datamatrix.decoder.Version(8, 24, 24, 22, 22, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(24, new com.google.zxing.datamatrix.decoder.Version.ECB(i, i5)));
        com.google.zxing.datamatrix.decoder.Version version9 = new com.google.zxing.datamatrix.decoder.Version(9, 26, 26, 24, 24, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(28, new com.google.zxing.datamatrix.decoder.Version.ECB(i, 44)));
        com.google.zxing.datamatrix.decoder.Version version10 = new com.google.zxing.datamatrix.decoder.Version(10, 32, 32, 14, 14, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(i5, new com.google.zxing.datamatrix.decoder.Version.ECB(i, 62)));
        int i6 = 42;
        com.google.zxing.datamatrix.decoder.Version version11 = new com.google.zxing.datamatrix.decoder.Version(11, 36, 36, 16, 16, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(i6, new com.google.zxing.datamatrix.decoder.Version.ECB(i, 86)));
        com.google.zxing.datamatrix.decoder.Version version12 = new com.google.zxing.datamatrix.decoder.Version(12, 40, 40, 18, 18, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(48, new com.google.zxing.datamatrix.decoder.Version.ECB(i, 114)));
        int i7 = 56;
        com.google.zxing.datamatrix.decoder.Version version13 = new com.google.zxing.datamatrix.decoder.Version(13, 44, 44, 20, 20, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(i7, new com.google.zxing.datamatrix.decoder.Version.ECB(i, 144)));
        com.google.zxing.datamatrix.decoder.Version version14 = new com.google.zxing.datamatrix.decoder.Version(14, 48, 48, 22, 22, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(68, new com.google.zxing.datamatrix.decoder.Version.ECB(i, 174)));
        int i8 = 2;
        com.google.zxing.datamatrix.decoder.Version version15 = new com.google.zxing.datamatrix.decoder.Version(15, 52, 52, 24, 24, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(i6, new com.google.zxing.datamatrix.decoder.Version.ECB(i8, 102)));
        com.google.zxing.datamatrix.decoder.Version version16 = new com.google.zxing.datamatrix.decoder.Version(16, 64, 64, 14, 14, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(i7, new com.google.zxing.datamatrix.decoder.Version.ECB(i8, 140)));
        int i9 = 4;
        com.google.zxing.datamatrix.decoder.Version version17 = new com.google.zxing.datamatrix.decoder.Version(17, 72, 72, 16, 16, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(36, new com.google.zxing.datamatrix.decoder.Version.ECB(i9, 92)));
        com.google.zxing.datamatrix.decoder.Version version18 = new com.google.zxing.datamatrix.decoder.Version(18, 80, 80, 18, 18, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(48, new com.google.zxing.datamatrix.decoder.Version.ECB(i9, 114)));
        com.google.zxing.datamatrix.decoder.Version version19 = new com.google.zxing.datamatrix.decoder.Version(19, 88, 88, 20, 20, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(i7, new com.google.zxing.datamatrix.decoder.Version.ECB(i9, 144)));
        com.google.zxing.datamatrix.decoder.Version version20 = new com.google.zxing.datamatrix.decoder.Version(20, 96, 96, 22, 22, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(68, new com.google.zxing.datamatrix.decoder.Version.ECB(i9, 174)));
        int i10 = 6;
        com.google.zxing.datamatrix.decoder.Version version21 = new com.google.zxing.datamatrix.decoder.Version(21, 104, 104, 24, 24, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(i7, new com.google.zxing.datamatrix.decoder.Version.ECB(i10, 136)));
        com.google.zxing.datamatrix.decoder.Version version22 = new com.google.zxing.datamatrix.decoder.Version(22, 120, 120, 18, 18, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(68, new com.google.zxing.datamatrix.decoder.Version.ECB(i10, 175)));
        int i11 = 32;
        return new com.google.zxing.datamatrix.decoder.Version[]{version, version2, version3, version4, version5, version6, version7, version8, version9, version10, version11, version12, version13, version14, version15, version16, version17, version18, version19, version20, version21, version22, new com.google.zxing.datamatrix.decoder.Version(23, 132, 132, 20, 20, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(62, new com.google.zxing.datamatrix.decoder.Version.ECB(8, 163))), new com.google.zxing.datamatrix.decoder.Version(24, 144, 144, 22, 22, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(62, new com.google.zxing.datamatrix.decoder.Version.ECB(8, 156), new com.google.zxing.datamatrix.decoder.Version.ECB(i8, 155))), new com.google.zxing.datamatrix.decoder.Version(25, 8, 18, 6, 16, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(7, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 5))), new com.google.zxing.datamatrix.decoder.Version(26, 8, 32, 6, 14, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(11, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 10))), new com.google.zxing.datamatrix.decoder.Version(27, 12, 26, 10, 24, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(14, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 16))), new com.google.zxing.datamatrix.decoder.Version(28, 12, 36, 10, 16, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(18, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 22))), new com.google.zxing.datamatrix.decoder.Version(29, 16, 36, 14, 16, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(24, new com.google.zxing.datamatrix.decoder.Version.ECB(1, i11))), new com.google.zxing.datamatrix.decoder.Version(30, 16, 48, 14, 22, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(28, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 49))), new com.google.zxing.datamatrix.decoder.Version(31, 8, 48, 6, 22, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(15, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 18))), new com.google.zxing.datamatrix.decoder.Version(32, 8, 64, 6, 14, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(18, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 24))), new com.google.zxing.datamatrix.decoder.Version(33, 8, 80, 6, 18, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(22, new com.google.zxing.datamatrix.decoder.Version.ECB(1, i11))), new com.google.zxing.datamatrix.decoder.Version(34, 8, 96, 6, 22, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(28, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 38))), new com.google.zxing.datamatrix.decoder.Version(35, 8, 120, 6, 18, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(i11, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 49))), new com.google.zxing.datamatrix.decoder.Version(36, 8, 144, 6, 22, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(36, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 63))), new com.google.zxing.datamatrix.decoder.Version(37, 12, 64, 10, 14, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(27, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 43))), new com.google.zxing.datamatrix.decoder.Version(38, 12, 88, 10, 20, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(36, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 64))), new com.google.zxing.datamatrix.decoder.Version(39, 16, 64, 14, 14, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(36, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 62))), new com.google.zxing.datamatrix.decoder.Version(40, 20, 36, 18, 16, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(28, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 44))), new com.google.zxing.datamatrix.decoder.Version(41, 20, 44, 18, 20, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(34, new com.google.zxing.datamatrix.decoder.Version.ECB(1, i7))), new com.google.zxing.datamatrix.decoder.Version(42, 20, 64, 18, 14, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(42, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 84))), new com.google.zxing.datamatrix.decoder.Version(43, 22, 48, 20, 22, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(38, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 72))), new com.google.zxing.datamatrix.decoder.Version(44, 24, 48, 22, 22, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(41, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 80))), new com.google.zxing.datamatrix.decoder.Version(45, 24, 64, 22, 14, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(46, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 108))), new com.google.zxing.datamatrix.decoder.Version(46, 26, 40, 24, 18, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(38, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 70))), new com.google.zxing.datamatrix.decoder.Version(47, 26, 48, 24, 22, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(42, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 90))), new com.google.zxing.datamatrix.decoder.Version(48, 26, 64, 24, 14, new com.google.zxing.datamatrix.decoder.Version.ECBlocks(50, new com.google.zxing.datamatrix.decoder.Version.ECB(1, 118)))};
    }
}
