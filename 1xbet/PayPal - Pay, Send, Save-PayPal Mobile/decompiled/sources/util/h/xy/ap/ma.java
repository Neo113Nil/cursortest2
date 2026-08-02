package util.h.xy.ap;

/* loaded from: classes5.dex */
public class ma implements com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier {
    private final util.h.xy.at.mb Camera2StreamConfigurationMap;
    private com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierListener getHighSpeedVideoFpsRanges;
    private com.gemalto.mfs.mwsdk.utils.chcodeverifier.SecureCodeInputer getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 61) % 128;

    public ma(util.h.xy.at.mb mbVar) {
        if (mbVar == null) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f347);
        }
        this.Camera2StreamConfigurationMap = mbVar;
    }

    @Override // com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier
    @util.h.xy.a.a
    public void inputCode(java.lang.String str) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f725);
        sb.append(util.h.xy.al.ra.f569);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        int i = getHighSpeedVideoSizes + 33;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (str == null || str.isEmpty()) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f284);
        }
        byte[] bytes = str.getBytes();
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (((i2 | 55) << 1) - (i2 ^ 55)) % 128;
        byte[] bArr = new byte[bytes.length];
        byte[] m25117 = util.h.xy.at.ma.m25117();
        int i3 = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i3 ^ 93) + ((i3 & 93) << 1)) % 128;
        int i4 = 0;
        for (byte b : bytes) {
            int i5 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = ((i5 & 125) + (i5 | 125)) % 128;
            byte b2 = m25117[i4 % m25117.length];
            bArr[i4] = (byte) ((b & (~b2)) | ((~b) & b2));
            i4++;
        }
        util.h.xy.ar.b.m25098(bArr);
        util.h.xy.am.ma.m25027(util.h.xy.al.ra.f860, util.h.xy.al.ra.f570);
        this.Camera2StreamConfigurationMap.mo25118(bArr);
        int i6 = getHighResolutionOutputSizeshNQ4ISI;
        int i7 = ((i6 | 89) << 1) - (i6 ^ 89);
        getHighSpeedVideoSizes = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        int i8 = (((i6 | 113) << 1) - (i6 ^ 113)) % 128;
        getHighSpeedVideoSizes = i8;
        getHighResolutionOutputSizeshNQ4ISI = (((i8 | 101) << 1) - (i8 ^ 101)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier
    public void setCHCodeVerifierListener(com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierListener cHCodeVerifierListener) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f725);
        sb.append(util.h.xy.al.ra.f666);
        util.h.xy.am.ma.m25027(str, sb.toString());
        this.getHighSpeedVideoFpsRanges = cHCodeVerifierListener;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 85) + (i | 85);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierListener m25036() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i + 77) % 128;
        com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierListener cHCodeVerifierListener = this.getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = (i + 17) % 128;
        return cHCodeVerifierListener;
    }

    @Override // com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier
    public com.gemalto.mfs.mwsdk.utils.chcodeverifier.SecureCodeInputer getSecureCodeInputer() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f725);
        sb.append(util.h.xy.al.ra.f658);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 121) + (i | 121);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = new util.h.xy.ap.ra(this.Camera2StreamConfigurationMap);
            }
            com.gemalto.mfs.mwsdk.utils.chcodeverifier.SecureCodeInputer secureCodeInputer = this.getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 35) % 128;
            return secureCodeInputer;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier
    public void setCVMType(com.gemalto.mfs.mwsdk.payment.CVMType cVMType) {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 53) + ((i & 53) << 1)) % 128;
        cVMType.getValue();
        util.h.xy.f.b.f2201.m26770(cVMType.getValue());
        int i2 = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i2 ^ 73) + ((i2 & 73) << 1)) % 128;
    }
}
