package util.h.xy.bl;

/* loaded from: classes18.dex */
public class mb {
    private static int getHighSpeedVideoFpsRangesFor = 12;
    private static int getHighSpeedVideoSizes = 1;

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m25510(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 3) + ((i & 3) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            getHighSpeedVideoFpsRangesFor();
            int i3 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = (((i3 | 19) << 1) - (i3 ^ 19)) % 128;
            return;
        }
        getHighSpeedVideoFpsRangesFor();
        throw null;
    }

    private static void getHighSpeedVideoFpsRangesFor() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoSizes + 15;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            boolean m25513 = util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2192);
            util.h.xy.d.d m26956 = util.h.xy.k.ra.f2243.m26956();
            if (m26956 != null && m26956.m26179() != null) {
                if (m25513 && util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2186)) {
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 119) % 128;
                    m25513 = true;
                } else {
                    m25513 = false;
                }
                int i2 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = ((i2 ^ 1) + ((i2 & 1) << 1)) % 128;
            }
            util.h.xy.bk.ma.m25504().m25505(util.h.xy.bk.b.f976, new util.h.xy.bk.ra(java.lang.Boolean.valueOf(m25513)));
            return;
        }
        util.h.xy.bm.b.f983.m25513(util.h.xy.f.a.f2192);
        util.h.xy.k.ra.f2243.m26956();
        throw null;
    }
}
