package util.h.xy.eb;

/* loaded from: classes18.dex */
public final class ma extends util.h.xy.dh.mh {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private static util.h.xy.eb.rc getHighSpeedVideoFpsRangesFor = new util.h.xy.eb.rc();

    /* renamed from: ˏ, reason: contains not printable characters */
    protected util.h.xy.eu.a f2041;

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 81) + (i | 81);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.mz mzVar = new util.h.xy.dh.mz(getHighSpeedVideoFpsRangesFor.m26489(this.f2041.m26711(), getHighSpeedVideoFpsRangesFor.m26490(this.f2041)));
        int i = getHighResolutionOutputSizeshNQ4ISI + 27;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return mzVar;
        }
        throw null;
    }

    public ma(util.h.xy.eu.a aVar) {
        this.f2041 = aVar;
    }
}
