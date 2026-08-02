package com.gemalto.mfs.mwsdk.mobilegateway;

/* loaded from: classes8.dex */
public class MGConfigurationChangeReceiver extends android.content.BroadcastReceiver {
    private static int getHighSpeedVideoFpsRangesFor = 67;
    private static int getHighSpeedVideoSizes;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f671);
        sb.append(util.h.xy.al.ra.f651);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 95) + ((i & 95) << 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (context != null) {
            getHighSpeedVideoSizes = ((i2 & 33) + (i2 | 33)) % 128;
            if (intent != null) {
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.gemalto.mfs.mwsdk.mobilegateway.MGConfigurationChangeService.class);
                if (intent.getStringExtra(util.h.xy.al.ra.f359) != null) {
                    int i3 = getHighSpeedVideoFpsRangesFor + 49;
                    getHighSpeedVideoSizes = i3 % 128;
                    if (i3 % 2 == 0) {
                        intent2.putExtra(util.h.xy.al.ra.f359, intent.getStringExtra(util.h.xy.al.ra.f359));
                        if (intent.getStringExtra(util.h.xy.al.ra.f359).equalsIgnoreCase(util.h.xy.al.ra.f477) || intent.getStringExtra(util.h.xy.al.ra.f359).equalsIgnoreCase(util.h.xy.al.ra.f522)) {
                            intent2.putExtra(util.h.xy.al.ra.f536, intent.getStringExtra(util.h.xy.al.ra.f536));
                        }
                    } else {
                        intent2.putExtra(util.h.xy.al.ra.f359, intent.getStringExtra(util.h.xy.al.ra.f359));
                        intent.getStringExtra(util.h.xy.al.ra.f359);
                        java.lang.String str2 = util.h.xy.al.ra.f477;
                        throw null;
                    }
                }
                com.gemalto.mfs.mwsdk.mobilegateway.MGConfigurationChangeService.enqueueWork(context, intent2);
            }
        }
        int i4 = getHighSpeedVideoFpsRangesFor + 87;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
