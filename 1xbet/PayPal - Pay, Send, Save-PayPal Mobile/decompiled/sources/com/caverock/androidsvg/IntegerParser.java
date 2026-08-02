package com.caverock.androidsvg;

/* loaded from: classes7.dex */
class IntegerParser {
    int Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;

    IntegerParser(long j, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.Camera2StreamConfigurationMap = i;
    }

    static com.caverock.androidsvg.IntegerParser getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j = (j * 10) + (charAt - '0');
            if (j > androidx.collection.SieveCacheKt.NodeLinkMask) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new com.caverock.androidsvg.IntegerParser(j, i3);
    }

    static com.caverock.androidsvg.IntegerParser getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i) {
        long j;
        int i2;
        long j2;
        long j3;
        if (1 >= i) {
            return null;
        }
        long j4 = 0;
        int i3 = 1;
        while (i3 < i) {
            char charAt = str.charAt(i3);
            if (charAt < '0' || charAt > '9') {
                if (charAt >= 'A' && charAt <= 'F') {
                    j = j4 * 16;
                    i2 = charAt - 'A';
                } else {
                    if (charAt < 'a' || charAt > 'f') {
                        break;
                    }
                    j = j4 * 16;
                    i2 = charAt - 'a';
                }
                j2 = j + i2;
                j3 = 10;
            } else {
                j2 = j4 * 16;
                j3 = charAt - '0';
            }
            j4 = j2 + j3;
            if (j4 > 4294967295L) {
                return null;
            }
            i3++;
        }
        if (i3 == 1) {
            return null;
        }
        return new com.caverock.androidsvg.IntegerParser(j4, i3);
    }
}
