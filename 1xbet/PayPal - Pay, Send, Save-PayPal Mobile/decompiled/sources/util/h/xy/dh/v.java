package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class v extends util.h.xy.dh.b {
    private static int getInputFormats = 0;
    private static int getOutputFormats = 1;

    @Override // util.h.xy.dh.b, util.h.xy.dh.mm, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = getOutputFormats;
        int i2 = ((i | 9) << 1) - (i ^ 9);
        int i3 = i2 % 128;
        getInputFormats = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getOutputFormats = (i3 + 53) % 128;
        return this;
    }

    @Override // util.h.xy.dh.b, util.h.xy.dh.mm, util.h.xy.dh.mi
    final util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        int i = getOutputFormats;
        int i2 = (((i | 35) << 1) - (i ^ 35)) % 128;
        getInputFormats = i2;
        int i3 = i2 + 49;
        getOutputFormats = i3 % 128;
        if (i3 % 2 != 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    v(util.h.xy.dh.mm mmVar) {
        super(mmVar);
    }
}
