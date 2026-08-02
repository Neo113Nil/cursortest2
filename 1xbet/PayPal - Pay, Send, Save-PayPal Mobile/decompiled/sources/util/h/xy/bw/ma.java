package util.h.xy.bw;

/* loaded from: classes18.dex */
public class ma implements util.h.xy.bw.mb {
    private static int getHighSpeedVideoFpsRanges = 75;
    private static int getHighSpeedVideoSizes;

    static {
        int i = 75 % 2;
    }

    @Override // util.h.xy.bw.mb
    /* renamed from: ˋ, reason: contains not printable characters */
    public java.lang.Object mo25784(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod, java.lang.Object... objArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 3) << 1) - (i ^ 3);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod2 = com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN;
            throw null;
        }
        if (cHVerificationMethod == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN) {
            util.h.xy.ap.ma maVar = new util.h.xy.ap.ma((util.h.xy.at.mb) objArr[0]);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 7) % 128;
            return maVar;
        }
        if (cHVerificationMethod == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS) {
            util.h.xy.aa.a aVar = new util.h.xy.aa.a((util.h.xy.aa.mb.ra) objArr[0], (util.h.xy.aa.c) objArr[1]);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 95) % 128;
            return aVar;
        }
        if (cHVerificationMethod != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f844);
            sb.append(objArr.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        util.h.xy.aa.rc rcVar = new util.h.xy.aa.rc((util.h.xy.aa.c) objArr[0]);
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = (i3 & 97) + (i3 | 97);
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            return rcVar;
        }
        throw null;
    }
}
