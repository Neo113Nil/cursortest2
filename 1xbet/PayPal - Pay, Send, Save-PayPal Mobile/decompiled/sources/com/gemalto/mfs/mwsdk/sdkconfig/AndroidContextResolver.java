package com.gemalto.mfs.mwsdk.sdkconfig;

/* loaded from: classes8.dex */
public final class AndroidContextResolver {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    private AndroidContextResolver() {
    }

    public static android.content.Context getApplicationContext() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f593);
        sb.append(util.h.xy.al.ra.f339);
        util.h.xy.am.ma.m25027(str, sb.toString());
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 45) + ((i & 45) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return m24558;
        }
        throw null;
    }
}
