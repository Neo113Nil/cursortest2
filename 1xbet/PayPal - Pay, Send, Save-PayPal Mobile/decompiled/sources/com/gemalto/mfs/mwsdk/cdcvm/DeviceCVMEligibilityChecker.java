package com.gemalto.mfs.mwsdk.cdcvm;

/* loaded from: classes3.dex */
public final class DeviceCVMEligibilityChecker {
    public static com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMEligibilityResult checkDeviceEligibility(android.content.Context context) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f655);
        sb.append(util.h.xy.al.ra.f853);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMEligibilityResult deviceCVMEligibilityResult = new com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMEligibilityResult(context);
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = ~currentTimeMillis;
        int i2 = (~((1378449380 ^ currentTimeMillis) | (currentTimeMillis & 1378449380))) | (~(((-1057633123) ^ i) | (i & (-1057633123))));
        int i3 = ~((i ^ (-1378449381)) | (i & (-1378449381)));
        int i4 = ~((currentTimeMillis ^ 2133555174) | (currentTimeMillis & 2133555174));
        int i5 = (1057633122 ^ i) | (i & 1057633122);
        int i6 = ~((i5 ^ (-1378449381)) | (i5 & (-1378449381)));
        int i7 = ~(i | (-1378449381));
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i8 = ~currentTimeMillis2;
        int i9 = ((~(i8 | 66177072)) * 979) + 432580686;
        int i10 = -(-(((currentTimeMillis2 ^ 1744421323) | (currentTimeMillis2 & 1744421323)) * (-979)));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        int i12 = ~((currentTimeMillis2 ^ 66177072) | (currentTimeMillis2 & 66177072));
        int i13 = ~(i8 | 1744421323);
        int i14 = ((i12 ^ i13) | (i13 & i12)) * 979;
        if (((-473547089) - (~(((i2 ^ i3) | (i2 & i3)) * (-516)))) + (((i4 ^ i6) | (i4 & i6)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((1075922052 ^ i7) | (i7 & 1075922052)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) > (i11 & i14) + (i14 | i11)) {
            return deviceCVMEligibilityResult;
        }
        throw new java.lang.ArithmeticException();
    }
}
