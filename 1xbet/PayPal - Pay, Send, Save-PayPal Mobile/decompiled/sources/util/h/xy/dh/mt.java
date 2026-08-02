package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class mt implements util.h.xy.dh.mk {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dh.rm getHighResolutionOutputSizeshNQ4ISI;

    static util.h.xy.dh.rs Camera2StreamConfigurationMap(util.h.xy.dh.rm rmVar) throws java.io.IOException {
        util.h.xy.dh.rs rsVar = new util.h.xy.dh.rs(rmVar.getHighSpeedVideoFpsRangesFor());
        int i = getHighSpeedVideoSizes + 109;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return rsVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        int i = getHighSpeedVideoSizes + 107;
        Camera2StreamConfigurationMap = i % 128;
        try {
            if (i % 2 == 0) {
                mo26278();
                throw new java.lang.NullPointerException();
            }
            util.h.xy.dh.mi mo26278 = mo26278();
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i2 ^ 71) + ((i2 & 71) << 1)) % 128;
            return mo26278;
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException(e.getMessage());
        }
    }

    @Override // util.h.xy.dh.aw
    /* renamed from: ʼ */
    public final util.h.xy.dh.mi mo26278() throws java.io.IOException {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 119) << 1) - (i ^ 119);
        getHighSpeedVideoSizes = i2 % 128;
        util.h.xy.dh.rs Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = getHighSpeedVideoSizes;
        int i4 = (i3 ^ 53) + ((i3 & 53) << 1);
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    mt(util.h.xy.dh.rm rmVar) {
        this.getHighResolutionOutputSizeshNQ4ISI = rmVar;
    }
}
