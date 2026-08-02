package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class mz extends util.h.xy.dh.rh {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoSizes;

    static int Camera2StreamConfigurationMap(boolean z, int i) {
        int i2 = getHighSpeedVideoSizes + 73;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, i);
            throw null;
        }
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, i);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 83) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    static void getHighSpeedVideoSizes(util.h.xy.dh.rj rjVar, boolean z, byte[] bArr, int i, int i2) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 13) % 128;
        rjVar.Camera2StreamConfigurationMap(z, 4, bArr, i, i2);
        int i3 = getHighSpeedVideoSizes + 101;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.dh.rh, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 87) + ((i & 87) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // util.h.xy.dh.rh, util.h.xy.dh.mi
    final util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 125) + ((i & 125) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoSizes + 11;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            rjVar.getHighSpeedVideoSizes(z, 2, this.getHighSpeedVideoFpsRanges);
        } else {
            rjVar.getHighSpeedVideoSizes(z, 4, this.getHighSpeedVideoFpsRanges);
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 39;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighSpeedVideoFpsRanges.length);
            throw new java.lang.ArithmeticException();
        }
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighSpeedVideoFpsRanges.length);
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (((i2 | 29) << 1) - (i2 ^ 29)) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i & 13) + (i | 13)) % 128;
        int i2 = (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public mz(byte[] bArr) {
        super(bArr);
    }
}
