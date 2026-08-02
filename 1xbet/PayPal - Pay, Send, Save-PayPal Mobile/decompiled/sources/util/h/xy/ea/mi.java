package util.h.xy.ea;

/* loaded from: classes18.dex */
public abstract class mi {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private util.h.xy.ea.ma Camera2StreamConfigurationMap;

    /* renamed from: ʻ, reason: contains not printable characters */
    protected util.h.xy.ea.me f1970;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected util.h.xy.ea.ri f1971;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected util.h.xy.ed.a f1972;

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected util.h.xy.ed.a f1973;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.ea.ri m26485() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + 67) % 128;
        util.h.xy.ea.ri riVar = this.f1971;
        int i2 = i + 103;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return riVar;
        }
        throw null;
    }

    mi(util.h.xy.ed.a aVar, util.h.xy.ed.a aVar2, util.h.xy.ea.me meVar, util.h.xy.ea.ma maVar) {
        this.f1973 = aVar;
        this.f1972 = aVar2;
        this.f1970 = meVar;
        this.Camera2StreamConfigurationMap = maVar;
    }
}
