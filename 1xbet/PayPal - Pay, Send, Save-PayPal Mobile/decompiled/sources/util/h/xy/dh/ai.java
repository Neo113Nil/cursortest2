package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class ai extends util.h.xy.dh.ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    static void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, byte b, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i3 & 103) + (i3 | 103)) % 128;
        util.h.xy.dh.rj.Camera2StreamConfigurationMap = (util.h.xy.dh.rj.getHighSpeedVideoFpsRanges + 63) % 128;
        rjVar.getHighSpeedVideoSizes(true, 3);
        rjVar.getHighSpeedVideoFpsRanges(i2 + 1);
        int i4 = util.h.xy.dh.rj.Camera2StreamConfigurationMap + 111;
        util.h.xy.dh.rj.getHighSpeedVideoFpsRanges = i4 % 128;
        rjVar.getHighResolutionOutputSizeshNQ4ISI.write(b);
        if (i4 % 2 != 0) {
            throw null;
        }
        rjVar.Camera2StreamConfigurationMap(bArr, i, i2);
        int i5 = util.h.xy.dh.rj.Camera2StreamConfigurationMap + 35;
        util.h.xy.dh.rj.getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 57) % 128;
    }

    static void getHighSpeedVideoFpsRanges(util.h.xy.dh.rj rjVar, boolean z, byte[] bArr, int i) throws java.io.IOException {
        int i2 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (((i2 | 125) << 1) - (i2 ^ 125)) % 128;
        rjVar.Camera2StreamConfigurationMap(z, 3, bArr, 0, i);
        int i3 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i3 ^ 53) + ((i3 & 53) << 1)) % 128;
    }

    static int getHighResolutionOutputSizeshNQ4ISI(boolean z, int i) {
        int i2 = Camera2StreamConfigurationMap;
        int i3 = ((i2 | 37) << 1) - (i2 ^ 37);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, i);
        }
        util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, i);
        throw null;
    }

    @Override // util.h.xy.dh.ma, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 57) << 1) - (i ^ 57);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = ((i3 | 77) << 1) - (i3 ^ 77);
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (((i | 13) << 1) - (i ^ 13)) % 128;
        rjVar.getHighSpeedVideoSizes(z, 3, this.getHighSpeedVideoSizes);
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 99) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i ^ 9) + ((i & 9) << 1)) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighSpeedVideoSizes.length);
        int i2 = getHighSpeedVideoFpsRangesFor + 89;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = Camera2StreamConfigurationMap + 95;
        getHighSpeedVideoFpsRangesFor = i % 128;
        return i % 2 != 0;
    }

    ai(byte[] bArr) {
        super(bArr, false);
    }
}
