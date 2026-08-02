package util.h.xy.du;

/* loaded from: classes5.dex */
public final class d extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.dh.f f1579;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.ed.a f1580;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.ed.a f1581;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.dh.f f1582;
    private util.h.xy.dh.f getHighResolutionOutputSizeshNQ4ISI;
    private util.h.xy.ed.a getHighSpeedVideoFpsRanges;
    private util.h.xy.ed.a getHighSpeedVideoFpsRangesFor;
    private util.h.xy.dh.f getInputFormats;

    static {
        util.h.xy.ed.a aVar = new util.h.xy.ed.a(util.h.xy.dr.mb.f1521, util.h.xy.dh.ry.f1213);
        f1580 = aVar;
        f1581 = new util.h.xy.ed.a(util.h.xy.du.ra.f1623, aVar);
        f1579 = new util.h.xy.dh.f(20L);
        f1582 = new util.h.xy.dh.f(1L);
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 1) + ((i & 1) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(4);
        if (!this.getHighSpeedVideoFpsRanges.equals(f1580)) {
            dVar.m26290(new util.h.xy.dh.ag(true, 0, this.getHighSpeedVideoFpsRanges));
            int i = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = (((i | 87) << 1) - (i ^ 87)) % 128;
        }
        if (!this.getHighSpeedVideoFpsRangesFor.equals(f1581)) {
            dVar.m26290(new util.h.xy.dh.ag(true, 1, this.getHighSpeedVideoFpsRangesFor));
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI.m26325(f1579)) {
            dVar.m26290(new util.h.xy.dh.ag(true, 2, this.getHighResolutionOutputSizeshNQ4ISI));
        }
        if (!this.getInputFormats.m26325(f1582)) {
            dVar.m26290(new util.h.xy.dh.ag(true, 3, this.getInputFormats));
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i2 ^ 25) + ((i2 & 25) << 1)) % 128;
        }
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i3 = getHighSpeedVideoSizes;
        int i4 = (i3 ^ 57) + ((i3 & 57) << 1);
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return aaVar;
        }
        throw null;
    }

    public d(util.h.xy.ed.a aVar, util.h.xy.ed.a aVar2, util.h.xy.dh.f fVar, util.h.xy.dh.f fVar2) {
        this.getHighSpeedVideoFpsRanges = aVar;
        this.getHighSpeedVideoFpsRangesFor = aVar2;
        this.getHighResolutionOutputSizeshNQ4ISI = fVar;
        this.getInputFormats = fVar2;
    }

    public d() {
        this.getHighSpeedVideoFpsRanges = f1580;
        this.getHighSpeedVideoFpsRangesFor = f1581;
        this.getHighResolutionOutputSizeshNQ4ISI = f1579;
        this.getInputFormats = f1582;
    }
}
