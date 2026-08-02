package util.h.xy.dh;

/* loaded from: classes5.dex */
class am extends util.h.xy.dh.rj {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;

    @Override // util.h.xy.dh.rj
    void getHighSpeedVideoFpsRanges(util.h.xy.dh.mi[] miVarArr) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (((i | 91) << 1) - (i ^ 91)) % 128;
        int length = miVarArr.length;
        getHighSpeedVideoSizes = ((i ^ 101) + ((i & 101) << 1)) % 128;
        int i2 = 0;
        while (i2 < length) {
            int i3 = getHighSpeedVideoFpsRangesFor;
            int i4 = (i3 & 79) + (i3 | 79);
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 != 0) {
                miVarArr[i2].getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(this, false);
                i2 = ((i2 | 117) << 1) - (i2 ^ 117);
            } else {
                miVarArr[i2].getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(this, true);
                i2++;
            }
            int i5 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = (((i5 | 103) << 1) - (i5 ^ 103)) % 128;
        }
    }

    @Override // util.h.xy.dh.rj
    void getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mi miVar, boolean z) throws java.io.IOException {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 57) % 128;
        miVar.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(this, z);
        int i = getHighSpeedVideoFpsRangesFor + 79;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.dh.rj
    void getHighSpeedVideoFpsRanges(util.h.xy.dh.c[] cVarArr) throws java.io.IOException {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i & 121) + (i | 121)) % 128;
        int length = cVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i3 ^ 119) + ((i3 & 119) << 1)) % 128;
            cVarArr[i2].mo26279().getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(this, true);
            int i4 = (i2 ^ (-86)) + ((i2 & (-86)) << 1);
            i2 = (i4 ^ 87) + ((i4 & 87) << 1);
            int i5 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i5 & 29) + (i5 | 29)) % 128;
        }
        int i6 = getHighSpeedVideoSizes + 107;
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.dh.rj
    final util.h.xy.dh.am getHighSpeedVideoFpsRanges() {
        int i = getHighSpeedVideoSizes + 97;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    am(java.io.OutputStream outputStream) {
        super(outputStream);
    }
}
