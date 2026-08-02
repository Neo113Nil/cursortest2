package util.h.xy.du;

/* loaded from: classes18.dex */
public class mb extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected util.h.xy.du.ma f1583 = null;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected util.h.xy.ed.a f1584 = null;

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected util.h.xy.dh.rw f1585 = null;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(3);
        dVar.m26290(this.f1583);
        dVar.m26290(this.f1584);
        dVar.m26290(this.f1585);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 101) << 1) - (i ^ 101)) % 128;
        return aaVar;
    }
}
