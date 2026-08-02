package util.h.xy.ea;

/* loaded from: classes18.dex */
public final class g extends util.h.xy.ea.mi {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.dh.rh getHighSpeedVideoFpsRanges;
    private util.h.xy.dj.e getHighSpeedVideoFpsRangesFor;

    private g(util.h.xy.dj.e eVar, util.h.xy.ea.ri riVar, util.h.xy.dh.rh rhVar, util.h.xy.ed.a aVar, util.h.xy.ea.me meVar, util.h.xy.ea.ma maVar) {
        super(eVar.m26370(), aVar, meVar, maVar);
        this.getHighSpeedVideoFpsRangesFor = eVar;
        this.f1971 = riVar;
        this.getHighSpeedVideoFpsRanges = rhVar;
    }

    static void Camera2StreamConfigurationMap(java.util.List list, util.h.xy.dj.e eVar, util.h.xy.ed.a aVar, util.h.xy.ea.me meVar, util.h.xy.ea.ma maVar) {
        util.h.xy.dh.l m26371;
        int i;
        util.h.xy.ea.mf mfVar;
        int i2 = Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            m26371 = eVar.m26371();
            i = 1;
        } else {
            m26371 = eVar.m26371();
            i = 0;
        }
        while (i < m26371.mo26286()) {
            int i3 = Camera2StreamConfigurationMap + 77;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                util.h.xy.dj.mg.m26392(m26371.mo26287(i)).m26394().m26359();
                throw null;
            }
            util.h.xy.dj.mg m26392 = util.h.xy.dj.mg.m26392(m26371.mo26287(i));
            util.h.xy.dj.c m26394 = m26392.m26394();
            util.h.xy.dj.rc m26359 = m26394.m26359();
            if (m26359 != null) {
                util.h.xy.ea.mf mfVar2 = new util.h.xy.ea.mf(m26359.m26402(), m26359.m26401().m26295());
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 125) % 128;
                mfVar = mfVar2;
            } else {
                mfVar = new util.h.xy.ea.mf(m26394.m26360().m26381().m26337());
            }
            list.add(new util.h.xy.ea.g(eVar, mfVar, m26392.m26393(), aVar, meVar, null));
            int i4 = (i ^ (-80)) + ((i & (-80)) << 1);
            i = (i4 & 81) + (i4 | 81);
            int i5 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i5 ^ 103) + ((i5 & 103) << 1)) % 128;
        }
    }
}
