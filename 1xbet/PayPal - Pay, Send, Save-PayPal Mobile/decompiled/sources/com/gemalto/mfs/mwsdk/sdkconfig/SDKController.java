package com.gemalto.mfs.mwsdk.sdkconfig;

/* loaded from: classes3.dex */
public final class SDKController {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    private static com.gemalto.mfs.mwsdk.sdkconfig.SDKController getHighSpeedVideoFpsRangesFor;

    static {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 93) + (i | 93);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private SDKController() {
    }

    public static com.gemalto.mfs.mwsdk.sdkconfig.SDKController getInstance() {
        com.gemalto.mfs.mwsdk.sdkconfig.SDKController sDKController;
        synchronized (com.gemalto.mfs.mwsdk.sdkconfig.SDKController.class) {
            java.lang.String str = util.h.xy.al.ra.f281;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f413);
            sb.append(util.h.xy.al.ra.f668);
            util.h.xy.am.ma.m25027(str, sb.toString());
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = new com.gemalto.mfs.mwsdk.sdkconfig.SDKController();
            }
            sDKController = getHighSpeedVideoFpsRangesFor;
            int i = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = ((i ^ 57) + ((i & 57) << 1)) % 128;
        }
        return sDKController;
    }

    public final com.gemalto.mfs.mwsdk.sdkconfig.BusinessService getService(java.lang.String str) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f413);
        sb.append(util.h.xy.al.ra.f328);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        com.gemalto.mfs.mwsdk.sdkconfig.BusinessService m27660 = util.h.xy.v.c.m27646().m27660(str);
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i & 111) + (i | 111)) % 128;
        return m27660;
    }

    public final boolean addService(java.lang.String str, com.gemalto.mfs.mwsdk.sdkconfig.BusinessService businessService) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f413);
        sb.append(util.h.xy.al.ra.f595);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        int i = Camera2StreamConfigurationMap + 87;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final void forceAddService(java.lang.String str, com.gemalto.mfs.mwsdk.sdkconfig.BusinessService businessService) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f413);
        sb.append(util.h.xy.al.ra.f642);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i & 9) + (i | 9)) % 128;
    }

    public final void shutDown() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f413);
        sb.append(util.h.xy.al.ra.f636);
        util.h.xy.am.ma.m25027(str, sb.toString());
        util.h.xy.v.c.m27646().m27653();
        util.h.xy.v.mb.m27669();
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 89) % 128;
    }

    public final com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState getSDKServiceState() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f413);
        sb.append(util.h.xy.al.ra.f639);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState m27659 = util.h.xy.v.c.m27646().m27659();
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 47) + ((i & 47) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return m27659;
        }
        throw null;
    }
}
