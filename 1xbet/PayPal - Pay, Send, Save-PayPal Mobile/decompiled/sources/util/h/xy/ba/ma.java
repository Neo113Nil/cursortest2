package util.h.xy.ba;

/* loaded from: classes18.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "MobileGatewayManager";
    private static util.h.xy.ba.ma getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoSizes = 126;
    private util.h.xy.ba.mb getHighSpeedVideoFpsRangesFor;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.ba.ma m25292() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 77) + (i | 77);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (getHighSpeedVideoFpsRanges == null) {
            getHighSpeedVideoFpsRanges = new util.h.xy.ba.ma();
            int i3 = getHighSpeedVideoSizes;
            int i4 = (i3 & 117) + (i3 | 117);
            Camera2StreamConfigurationMap = i4 % 128;
            int i5 = i4 % 2;
        }
        util.h.xy.ba.ma maVar = getHighSpeedVideoFpsRanges;
        int i6 = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i6 ^ 9) + ((i6 & 9) << 1)) % 128;
        return maVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25294(util.h.xy.ba.mb mbVar) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 53) + ((i & 53) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            if (m25292() != null) {
                this.getHighSpeedVideoFpsRangesFor = mbVar;
                int i3 = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = ((i3 & 7) + (i3 | 7)) % 128;
            }
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i4 = ~(1748451572 | identityHashCode);
            int i5 = ~identityHashCode;
            int i6 = (i5 & 988519818) | (i5 ^ 988519818);
            int i7 = ((i4 ^ 315137290) | (i4 & 315137290) | (~((i6 & (-1748451573)) | (i6 ^ (-1748451573))))) * 886;
            int i8 = (i7 & 1490396091) + (i7 | 1490396091);
            int i9 = ~((i5 & (-1748451573)) | (i5 ^ (-1748451573)));
            int i10 = ((i9 ^ 988519818) | (i9 & 988519818)) * (-1772);
            int i11 = ((i8 | i10) << 1) - (i10 ^ i8);
            int i12 = -(-((~i6) * 886));
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i13 = 1708891277 - (~(((identityHashCode2 ^ 331127400) | (identityHashCode2 & 331127400)) * 988));
            int i14 = ~identityHashCode2;
            int i15 = ~((1476181995 ^ i14) | (i14 & 1476181995));
            int i16 = -(-(((i15 ^ 671105028) | (i15 & 671105028)) * (-1976)));
            int i17 = ~(identityHashCode2 | (-1816159624));
            int i18 = (i17 ^ 331127400) | (i17 & 331127400);
            int i19 = ~((1816159623 ^ i14) | (i14 & 1816159623));
            if ((i11 ^ i12) + ((i12 & i11) << 1) <= (((i13 & i16) + (i13 | i16)) - (~(((i18 & i19) | (i18 ^ i19)) * 988))) - 1) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        m25292();
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m25293() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i & 71) + (i | 71)) % 128;
        getHighSpeedVideoSizes = i2;
        util.h.xy.ba.mb mbVar = this.getHighSpeedVideoFpsRangesFor;
        if (mbVar != null) {
            int i3 = (i ^ 33) + ((i & 33) << 1);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                int mo25295 = mbVar.mo25295();
                int i4 = getHighSpeedVideoSizes + 17;
                Camera2StreamConfigurationMap = i4 % 128;
                if (i4 % 2 != 0) {
                    return mo25295;
                }
                throw null;
            }
            mbVar.mo25295();
            throw null;
        }
        int i5 = i2 + 47;
        Camera2StreamConfigurationMap = i5 % 128;
        if (i5 % 2 != 0) {
            return -91;
        }
        throw null;
    }
}
