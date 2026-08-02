package util.h.xy.bl;

/* loaded from: classes18.dex */
public class ra {
    private static int Camera2StreamConfigurationMap = 81;
    private static int getHighSpeedVideoFpsRanges;

    static {
        int i = 81 % 2;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25511(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRanges + 103;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRangesFor();
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i2 ^ 99) + ((i2 & 99) << 1)) % 128;
            return;
        }
        getHighSpeedVideoFpsRangesFor();
        throw new java.lang.ArithmeticException();
    }

    private static void getHighSpeedVideoFpsRangesFor() {
        int i = Camera2StreamConfigurationMap + 33;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558());
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.m.mb m26975 = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558());
        if (m26975 == null) {
            try {
                if (!util.h.xy.bg.a.f944.m25452().await(200L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    util.h.xy.bk.ma.m25504().m25505(util.h.xy.bk.b.f979, new util.h.xy.bk.ra(util.h.xy.bf.mc.m25434(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.KEY_STORE_INACCESSIBLE, util.h.xy.al.ra.f839)));
                    int i2 = getHighSpeedVideoFpsRanges;
                    int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
                    Camera2StreamConfigurationMap = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                int i4 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRanges = (((i4 | 3) << 1) - (i4 ^ 3)) % 128;
                m26975 = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558());
                int i5 = getHighSpeedVideoFpsRanges;
                Camera2StreamConfigurationMap = (((i5 | 101) << 1) - (i5 ^ 101)) % 128;
            } catch (java.lang.InterruptedException unused) {
                util.h.xy.bk.ma.m25504().m25505(util.h.xy.bk.b.f979, new util.h.xy.bk.ra(util.h.xy.bf.mc.m25434(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.KEY_STORE_INACCESSIBLE, util.h.xy.al.ra.f839)));
                return;
            }
        }
        try {
            m26975.mo26173();
            com.gemalto.mfs.mwsdk.payment.engine.PaymentService m25639 = util.h.xy.bu.b.f1050.m25639();
            if (m25639 == null || !(m25639 instanceof util.h.xy.bq.b)) {
                return;
            }
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 81) % 128;
            ((util.h.xy.bq.b) m25639).mo25546(false, false);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
            util.h.xy.bk.ma.m25504().m25505(util.h.xy.bk.b.f979, new util.h.xy.bk.ra(util.h.xy.bf.mc.m25434(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.KEY_STORE_INACCESSIBLE, util.h.xy.al.ra.f839)));
        }
    }
}
