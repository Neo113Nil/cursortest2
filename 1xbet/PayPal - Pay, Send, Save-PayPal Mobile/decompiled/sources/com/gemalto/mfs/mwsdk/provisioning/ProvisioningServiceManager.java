package com.gemalto.mfs.mwsdk.provisioning;

/* loaded from: classes3.dex */
public class ProvisioningServiceManager {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    public static com.gemalto.mfs.mwsdk.provisioning.sdkconfig.EnrollingBusinessService getEnrollingBusinessService() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f599);
        sb.append(util.h.xy.al.ra.f307);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.provisioning.sdkconfig.EnrollingBusinessService enrollingBusinessService = (com.gemalto.mfs.mwsdk.provisioning.sdkconfig.EnrollingBusinessService) m10184(new java.lang.Object[0], -765057851, 765057852, (int) java.lang.System.currentTimeMillis());
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 1) + ((i & 1) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return enrollingBusinessService;
        }
        throw null;
    }

    public static com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService getProvisioningBusinessService() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f599);
        sb.append(util.h.xy.al.ra.f310);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 125) + (i | 125)) % 128;
        util.h.xy.ca.b m25836 = util.h.xy.ca.b.m25836(util.h.xy.ag.a.m24556().m24558());
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = ((i2 | 7) << 1) - (i2 ^ 7);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = i2 + 119;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                return m25836;
            }
            throw null;
        }
        throw null;
    }

    public static com.gemalto.mfs.mwsdk.provisioning.sdkconfig.VasProvisioningBusinessService getVasProvisioningBusinessService() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f599);
        sb.append(util.h.xy.al.ra.f841);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = getHighSpeedVideoFpsRangesFor + 67;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ca.mb m25841 = util.h.xy.ca.mb.m25841(util.h.xy.ag.a.m24556().m24558());
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            int i3 = ((i2 ^ 83) + ((i2 & 83) << 1)) % 128;
            getHighSpeedVideoFpsRangesFor = i3;
            int i4 = (i3 & 113) + (i3 | 113);
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 != 0) {
                return m25841;
            }
            throw null;
        }
        util.h.xy.ca.mb.m25841(util.h.xy.ag.a.m24556().m24558());
        throw null;
    }

    public static com.gemalto.mfs.mwsdk.provisioning.sdkconfig.WalletSecureEnrollmentBusinessService getWalletSecureEnrollmentBusinessService() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f599);
        sb.append(util.h.xy.al.ra.f317);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.provisioning.sdkconfig.WalletSecureEnrollmentBusinessService walletSecureEnrollmentBusinessService = (com.gemalto.mfs.mwsdk.provisioning.sdkconfig.WalletSecureEnrollmentBusinessService) m10184(new java.lang.Object[0], 1216836688, -1216836688, (int) java.lang.System.currentTimeMillis());
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i ^ 49) + ((i & 49) << 1)) % 128;
        return walletSecureEnrollmentBusinessService;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m10184(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        if ((i * 71) + (i2 * (-69)) + (((~(i2 | i3)) | i4) * (-140)) + ((~(i | i2 | i3)) * 70) + ((i4 | (~(i | (~i2))) | (~(i3 | i))) * 70) != 1) {
            int i5 = getHighResolutionOutputSizeshNQ4ISI;
            int i6 = ((i5 | 19) << 1) - (i5 ^ 19);
            getHighSpeedVideoFpsRangesFor = i6 % 128;
            android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
            if (i6 % 2 == 0) {
                return util.h.xy.ca.a.m25835(m24558);
            }
            util.h.xy.ca.a.m25835(m24558);
            throw null;
        }
        int i7 = getHighSpeedVideoFpsRangesFor + 9;
        getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
        android.content.Context m245582 = util.h.xy.ag.a.m24556().m24558();
        if (i7 % 2 != 0) {
            return util.h.xy.ca.ra.m25842(m245582);
        }
        util.h.xy.ca.ra.m25842(m245582);
        throw null;
    }
}
