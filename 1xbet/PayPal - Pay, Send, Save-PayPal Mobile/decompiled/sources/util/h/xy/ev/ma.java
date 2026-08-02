package util.h.xy.ev;

/* loaded from: classes18.dex */
public final class ma extends util.h.xy.ev.b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    @Override // util.h.xy.ev.b
    /* renamed from: ᐝ */
    protected final util.h.xy.ef.ma mo26722(util.h.xy.dh.i iVar) {
        util.h.xy.ei.ra raVar = new util.h.xy.ei.ra(new util.h.xy.ej.rb());
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 83) % 128;
        return raVar;
    }

    public ma(util.h.xy.ed.a aVar, util.h.xy.ep.mb mbVar) {
        super(aVar, mbVar);
    }
}
