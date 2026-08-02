package util.h.xy.au;

/* loaded from: classes5.dex */
class b implements com.gemalto.mfs.mwsdk.mobilegateway.MGCardManager {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "b";

    b() {
    }

    static /* synthetic */ java.lang.String Camera2StreamConfigurationMap() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i ^ 89) + ((i & 89) << 1)) % 128;
        Camera2StreamConfigurationMap = i2;
        java.lang.String str = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i2 ^ 77) + ((i2 & 77) << 1)) % 128;
        return str;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardManager
    public void getCardList(final com.gemalto.mfs.mwsdk.mobilegateway.listener.CardListFetchListener cardListFetchListener) {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 47) << 1) - (i ^ 47);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.am.ma.m25027(util.h.xy.al.ra.f281, util.h.xy.al.ra.f506);
            if (cardListFetchListener == null) {
                throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f347);
            }
            new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.au.b.1
                private static int Camera2StreamConfigurationMap = 1;
                private static int getHighSpeedVideoFpsRangesFor;

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        final java.util.Collection<com.gemalto.mfs.mwsdk.mobilegateway.MGCardLiteEntry> highSpeedVideoSizes = util.h.xy.au.mc.getHighSpeedVideoSizes();
                        util.h.xy.au.b.Camera2StreamConfigurationMap();
                        util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.b.1.3
                            private static int Camera2StreamConfigurationMap = 0;
                            private static int getHighSpeedVideoSizes = 1;

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = Camera2StreamConfigurationMap;
                                int i4 = ((i3 | 15) << 1) - (i3 ^ 15);
                                getHighSpeedVideoSizes = i4 % 128;
                                if (i4 % 2 != 0) {
                                    util.h.xy.am.ma.m25027(util.h.xy.al.ra.f860, util.h.xy.al.ra.f614);
                                    cardListFetchListener.onSuccess(highSpeedVideoSizes);
                                    int i5 = Camera2StreamConfigurationMap;
                                    getHighSpeedVideoSizes = ((i5 & 61) + (i5 | 61)) % 128;
                                    return;
                                }
                                util.h.xy.am.ma.m25027(util.h.xy.al.ra.f860, util.h.xy.al.ra.f614);
                                cardListFetchListener.onSuccess(highSpeedVideoSizes);
                                throw null;
                            }
                        });
                        int i3 = Camera2StreamConfigurationMap;
                        getHighSpeedVideoFpsRangesFor = ((i3 & 39) + (i3 | 39)) % 128;
                    } catch (java.lang.Exception e) {
                        util.h.xy.au.b.Camera2StreamConfigurationMap();
                        final util.h.xy.au.mb mbVar = new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.UNEXPECTED_INTERNAL_ERROR, e.getMessage());
                        util.h.xy.au.b.Camera2StreamConfigurationMap();
                        util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.b.1.5
                            private static int Camera2StreamConfigurationMap = 1;
                            private static int getHighSpeedVideoFpsRangesFor;

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i4 = getHighSpeedVideoFpsRangesFor;
                                int i5 = ((i4 | 5) << 1) - (i4 ^ 5);
                                Camera2StreamConfigurationMap = i5 % 128;
                                if (i5 % 2 != 0) {
                                    util.h.xy.am.ma.m25027(util.h.xy.al.ra.f860, util.h.xy.al.ra.f591);
                                    cardListFetchListener.onError(mbVar);
                                    int i6 = Camera2StreamConfigurationMap + 67;
                                    getHighSpeedVideoFpsRangesFor = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                util.h.xy.am.ma.m25027(util.h.xy.al.ra.f860, util.h.xy.al.ra.f591);
                                cardListFetchListener.onError(mbVar);
                                throw null;
                            }
                        });
                    }
                }
            }).start();
            int i3 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i3 & 125) + (i3 | 125)) % 128;
            return;
        }
        util.h.xy.am.ma.m25027(util.h.xy.al.ra.f281, util.h.xy.al.ra.f506);
        throw null;
    }
}
