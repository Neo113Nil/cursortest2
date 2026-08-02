package com.gemalto.mfs.mwsdk.payment;

/* loaded from: classes8.dex */
public final class PaymentSettings {
    private static int Camera2StreamConfigurationMap = 0;
    private static boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static byte getHighSpeedVideoFpsRangesFor;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m10182(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i;
        if ((i * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL) + (i2 * (-520)) + (((~(i4 | i2)) | i) * (-1042)) + ((i2 | i3) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(i | i4 | i2)) | (~((~i2) | i5)) | (~(i3 | i5))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) != 1) {
            long longValue = ((java.lang.Number) objArr[0]).longValue();
            int i6 = Camera2StreamConfigurationMap + 77;
            getHighSpeedVideoFpsRanges = i6 % 128;
            if (i6 % 2 == 0) {
                util.h.xy.bu.rb.m25674(longValue);
                throw null;
            }
            util.h.xy.bu.rb.m25674(longValue);
            int i7 = Camera2StreamConfigurationMap;
            int i8 = ((i7 | 9) << 1) - (i7 ^ 9);
            getHighSpeedVideoFpsRanges = i8 % 128;
            if (i8 % 2 != 0) {
                return null;
            }
            throw null;
        }
        long longValue2 = ((java.lang.Number) objArr[0]).longValue();
        int i9 = getHighSpeedVideoFpsRanges;
        int i10 = (i9 ^ 37) + ((i9 & 37) << 1);
        Camera2StreamConfigurationMap = i10 % 128;
        if (i10 % 2 != 0) {
            util.h.xy.bu.rb.m25677(longValue2);
            throw null;
        }
        util.h.xy.bu.rb.m25677(longValue2);
        int i11 = Camera2StreamConfigurationMap;
        int i12 = (i11 ^ 9) + ((i11 & 9) << 1);
        getHighSpeedVideoFpsRanges = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static {
        int i = Camera2StreamConfigurationMap + 89;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @java.lang.Deprecated
    public static void setDisableDeactivationOnPosDisconnect(boolean z) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f605);
        sb.append(util.h.xy.al.ra.f816);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i & 71) + (i | 71)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (z) {
            Camera2StreamConfigurationMap = ((i2 ^ 103) + ((i2 & 103) << 1)) % 128;
            getHighSpeedVideoFpsRangesFor = (byte) 1;
        } else {
            getHighSpeedVideoFpsRangesFor = (byte) 0;
        }
        int i3 = (i2 & 71) + (i2 | 71);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            Camera2StreamConfigurationMap = (i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            return;
        }
        throw null;
    }

    @java.lang.Deprecated
    public static byte getDisableDeactivationOnPosDisconnect() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f605);
        sb.append(util.h.xy.al.ra.f730);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = ((~((currentTimeMillis ^ 505245445) | (currentTimeMillis & 505245445))) | 737577650) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
        int i2 = (i & 951140286) + (i | 951140286);
        int i3 = ~currentTimeMillis;
        int i4 = ~((i3 ^ 505245445) | (i3 & 505245445));
        int i5 = -(-(((i4 ^ 169085440) | (i4 & 169085440) | 568492210) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
        int i6 = ~((int) java.lang.System.currentTimeMillis());
        int i7 = ~((i6 ^ (-2112118109)) | (i6 & (-2112118109)));
        int i8 = (((1146912 ^ i7) | (i7 & 1146912)) * (-970)) - 695853760;
        if (((((i2 | (-158278276)) << 1) - ((-158278276) ^ i2)) - (~i5)) - 1 > (i8 & 28080608) + (28080608 | i8) + ((((-2113265021) ^ i7) | (i7 & (-2113265021))) * 970)) {
            throw null;
        }
        byte b = getHighSpeedVideoFpsRangesFor;
        int i9 = getHighSpeedVideoFpsRanges;
        int i10 = (i9 & 9) + (i9 | 9);
        int i11 = i10 % 128;
        Camera2StreamConfigurationMap = i11;
        if (i10 % 2 == 0) {
            getHighSpeedVideoFpsRanges = (i11 + 99) % 128;
            return b;
        }
        throw null;
    }

    public static void setPURERefundTransactionCompletionWithoutGenAC(boolean z) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f605);
        sb.append(util.h.xy.al.ra.f766);
        util.h.xy.am.ma.m25027(str, sb.toString());
        getHighResolutionOutputSizeshNQ4ISI = z;
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i ^ 21) + ((i & 21) << 1)) % 128;
    }

    public static boolean isPURERefundTransactionCompletionWithoutGenAC() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (((i | 3) << 1) - (i ^ 3)) % 128;
        Camera2StreamConfigurationMap = i2;
        boolean z = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i2 & 9) + (i2 | 9);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    public static void setTransactionRetryLimit(int i) {
        int i2 = Camera2StreamConfigurationMap + 103;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            Camera2StreamConfigurationMap(i);
        } else {
            Camera2StreamConfigurationMap(i);
            throw null;
        }
    }

    public static void setTransactionRetryTimeout(long j) {
        int i = Camera2StreamConfigurationMap + 59;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            m10182(new java.lang.Object[]{java.lang.Long.valueOf(j)}, 1767737082, -1767737082, (int) java.lang.System.currentTimeMillis());
        } else {
            m10182(new java.lang.Object[]{java.lang.Long.valueOf(j)}, 1767737082, -1767737082, (int) java.lang.System.currentTimeMillis());
            throw null;
        }
    }

    public static void setApduSuspendTimeout(long j) {
        int i = getHighSpeedVideoFpsRanges + 63;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            m10182(new java.lang.Object[]{java.lang.Long.valueOf(j)}, -1402064795, 1402064796, (int) java.lang.System.currentTimeMillis());
            int i2 = getHighSpeedVideoFpsRanges;
            int i3 = ((i2 | 45) << 1) - (i2 ^ 45);
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        m10182(new java.lang.Object[]{java.lang.Long.valueOf(j)}, -1402064795, 1402064796, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    private static void Camera2StreamConfigurationMap(int i) {
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i2 ^ 85) + ((i2 & 85) << 1)) % 128;
        util.h.xy.bu.rb.m25673(i);
        int i3 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i3 ^ 45) + ((i3 & 45) << 1)) % 128;
    }
}
