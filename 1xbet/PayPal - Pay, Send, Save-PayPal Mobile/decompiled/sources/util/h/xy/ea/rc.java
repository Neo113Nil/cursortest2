package util.h.xy.ea;

/* loaded from: classes18.dex */
final class rc {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;

    static final class mb implements util.h.xy.ea.me {
        private util.h.xy.ea.rd Camera2StreamConfigurationMap;
        private util.h.xy.ed.a getHighSpeedVideoFpsRangesFor;
        private final util.h.xy.dh.i getHighSpeedVideoSizes;

        mb(util.h.xy.ed.a aVar, util.h.xy.dh.i iVar, util.h.xy.ea.rd rdVar) {
            this.getHighSpeedVideoFpsRangesFor = aVar;
            this.getHighSpeedVideoSizes = iVar;
            this.Camera2StreamConfigurationMap = rdVar;
        }
    }

    static util.h.xy.ea.rj getHighSpeedVideoFpsRangesFor(util.h.xy.dh.rk rkVar, util.h.xy.ed.a aVar, util.h.xy.ea.me meVar) {
        util.h.xy.ea.mi mgVar;
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 23) + (i | 23)) % 128;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i2 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        int i3 = 0;
        while (i3 != rkVar.m26342()) {
            int i4 = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = ((i4 ^ 105) + ((i4 & 105) << 1)) % 128;
            util.h.xy.dj.h m26376 = util.h.xy.dj.h.m26376(rkVar.m26345(i3));
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 75;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 == 0) {
                m26376.m26377();
                throw null;
            }
            util.h.xy.dh.c m26377 = m26376.m26377();
            if (m26377 instanceof util.h.xy.dj.rd) {
                mgVar = new util.h.xy.ea.mh((util.h.xy.dj.rd) m26377, aVar, meVar, null);
            } else if (m26377 instanceof util.h.xy.dj.rb) {
                mgVar = new util.h.xy.ea.mg((util.h.xy.dj.rb) m26377, aVar, meVar, null);
            } else {
                if (m26377 instanceof util.h.xy.dj.e) {
                    int i6 = Camera2StreamConfigurationMap + 23;
                    getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                    util.h.xy.ea.g.Camera2StreamConfigurationMap(arrayList, (util.h.xy.dj.e) m26377, aVar, meVar, null);
                    if (i6 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                } else if (m26377 instanceof util.h.xy.dj.rf) {
                    arrayList.add(new util.h.xy.ea.rg((util.h.xy.dj.rf) m26377, aVar, meVar, null));
                    int i7 = Camera2StreamConfigurationMap;
                    getHighResolutionOutputSizeshNQ4ISI = ((i7 & 11) + (i7 | 11)) % 128;
                }
                int i8 = Camera2StreamConfigurationMap;
                getHighResolutionOutputSizeshNQ4ISI = (i8 + 19) % 128;
                i3++;
                getHighResolutionOutputSizeshNQ4ISI = (i8 + 47) % 128;
            }
            arrayList.add(mgVar);
            int i82 = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = (i82 + 19) % 128;
            i3++;
            getHighResolutionOutputSizeshNQ4ISI = (i82 + 47) % 128;
        }
        util.h.xy.ea.rj rjVar = new util.h.xy.ea.rj(arrayList);
        int i9 = Camera2StreamConfigurationMap;
        int i10 = ((i9 ^ 101) + ((i9 & 101) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i10;
        Camera2StreamConfigurationMap = (i10 + 95) % 128;
        return rjVar;
    }

    rc() {
    }
}
