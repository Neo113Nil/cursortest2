package util.h.xy.dh;

/* loaded from: classes5.dex */
final class z extends util.h.xy.dh.am {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;

    @Override // util.h.xy.dh.am, util.h.xy.dh.rj
    final void getHighSpeedVideoFpsRanges(util.h.xy.dh.mi[] miVarArr) throws java.io.IOException {
        int i = (getHighSpeedVideoFpsRangesFor + 119) % 128;
        getHighSpeedVideoSizes = i;
        int length = miVarArr.length;
        getHighSpeedVideoFpsRangesFor = ((i ^ 45) + ((i & 45) << 1)) % 128;
        int i2 = 0;
        while (i2 < length) {
            int i3 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i3 & 29) + (i3 | 29)) % 128;
            miVarArr[i2].Camera2StreamConfigurationMap().getHighResolutionOutputSizeshNQ4ISI(this, true);
            i2++;
            int i4 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i4 ^ 69) + ((i4 & 69) << 1)) % 128;
        }
        int i5 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (((i5 | 3) << 1) - (i5 ^ 3)) % 128;
    }

    @Override // util.h.xy.dh.am, util.h.xy.dh.rj
    final void getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mi miVar, boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 87) + ((i & 87) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        miVar.Camera2StreamConfigurationMap().getHighResolutionOutputSizeshNQ4ISI(this, z);
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.dh.am, util.h.xy.dh.rj
    final void getHighSpeedVideoFpsRanges(util.h.xy.dh.c[] cVarArr) throws java.io.IOException {
        int length;
        int i;
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = ((i2 | 117) << 1) - (i2 ^ 117);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            length = cVarArr.length;
            i = 1;
        } else {
            length = cVarArr.length;
            i = 0;
        }
        getHighSpeedVideoSizes = ((i2 & 97) + (i2 | 97)) % 128;
        while (i < length) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 47) % 128;
            cVarArr[i].mo26279().Camera2StreamConfigurationMap().getHighResolutionOutputSizeshNQ4ISI(this, true);
            i++;
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 15) % 128;
        }
    }

    @Override // util.h.xy.dh.rj
    final util.h.xy.dh.z getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 69) + ((i & 69) << 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        int i3 = i2 + 103;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    z(java.io.OutputStream outputStream) {
        super(outputStream);
    }
}
