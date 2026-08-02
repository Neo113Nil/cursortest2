package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class rt implements util.h.xy.dh.ml {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dh.rm getHighResolutionOutputSizeshNQ4ISI;

    static util.h.xy.dh.ms getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rm rmVar) throws java.io.IOException {
        util.h.xy.dh.ms msVar = new util.h.xy.dh.ms(rmVar.getHighSpeedVideoFpsRangesFor());
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 13) + ((i & 13) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return msVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 95) % 128;
        try {
            util.h.xy.dh.mi mo26278 = mo26278();
            int i = getHighSpeedVideoSizes + 91;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 != 0) {
                return mo26278;
            }
            throw null;
        } catch (java.io.IOException e) {
            throw new util.h.xy.dh.ri(e.getMessage(), e);
        }
    }

    @Override // util.h.xy.dh.aw
    /* renamed from: ʼ */
    public final util.h.xy.dh.mi mo26278() throws java.io.IOException {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 61) + ((i & 61) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        util.h.xy.dh.ms highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = Camera2StreamConfigurationMap + 59;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    rt(util.h.xy.dh.rm rmVar) {
        this.getHighResolutionOutputSizeshNQ4ISI = rmVar;
    }
}
