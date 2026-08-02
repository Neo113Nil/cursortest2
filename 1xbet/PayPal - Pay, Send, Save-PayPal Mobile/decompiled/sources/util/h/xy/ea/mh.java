package util.h.xy.ea;

/* loaded from: classes18.dex */
public final class mh extends util.h.xy.ea.mi {
    private util.h.xy.dj.rd getHighSpeedVideoFpsRangesFor;

    mh(util.h.xy.dj.rd rdVar, util.h.xy.ed.a aVar, util.h.xy.ea.me meVar, util.h.xy.ea.ma maVar) {
        super(rdVar.m26404(), aVar, meVar, null);
        util.h.xy.ea.rf rfVar;
        this.getHighSpeedVideoFpsRangesFor = rdVar;
        util.h.xy.dj.g m26405 = rdVar.m26405();
        boolean m26375 = m26405.m26375();
        util.h.xy.dh.c m26374 = m26405.m26374();
        if (m26375) {
            rfVar = new util.h.xy.ea.rf(util.h.xy.dh.rh.m26335(m26374).m26337());
        } else {
            util.h.xy.dj.rc m26400 = util.h.xy.dj.rc.m26400(m26374);
            rfVar = new util.h.xy.ea.rf(m26400.m26402(), m26400.m26401().m26295());
        }
        this.f1971 = rfVar;
    }
}
