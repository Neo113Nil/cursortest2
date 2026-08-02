package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class ry extends util.h.xy.dh.g {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizes = 1;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.dh.ry f1213 = new util.h.xy.dh.ry();
    private static final byte[] Camera2StreamConfigurationMap = new byte[0];

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (((i | 25) << 1) - (i ^ 25)) % 128;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 35) % 128;
        rjVar.getHighSpeedVideoSizes(z, 5, Camera2StreamConfigurationMap);
        int i = getHighSpeedVideoSizes + 39;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i & 119) + (i | 119)) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, 0);
        int i2 = getHighSpeedVideoSizes + 51;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 23) + ((i & 23) << 1)) % 128;
        return false;
    }

    private ry() {
    }
}
