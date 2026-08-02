package util.h.xy.aa;

/* loaded from: classes18.dex */
public class a extends util.h.xy.aa.mc {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 99;
    private util.h.xy.aa.mb.ra getHighSpeedVideoSizes;

    public a(util.h.xy.aa.mb.ra raVar, util.h.xy.aa.c cVar) {
        super(cVar);
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f796);
        sb.append(util.h.xy.al.ra.f433);
        util.h.xy.am.ma.m25027(str, sb.toString());
        this.getHighSpeedVideoSizes = raVar;
        this.f67 = cVar;
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier
    public void startAuthentication(com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifierInput deviceCVMVerifierInput) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f796);
        sb.append(util.h.xy.al.ra.f449);
        util.h.xy.am.ma.m25027(str, sb.toString());
        new util.h.xy.aa.mb(util.h.xy.ag.a.m24556().m24558(), deviceCVMVerifierInput).getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 19) + ((i & 19) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier
    public void onDelegatedAuthPerformed(long j) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 83) % 128;
        this.getHighSpeedVideoSizes.mo24522(true, j);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 75) + (i | 75);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier
    public void onDelegatedAuthCancelled() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 67) + ((i & 67) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighSpeedVideoSizes.mo24520();
            int i3 = Camera2StreamConfigurationMap;
            int i4 = (i3 ^ 65) + ((i3 & 65) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.getHighSpeedVideoSizes.mo24520();
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier
    public void setCVMType(com.gemalto.mfs.mwsdk.payment.CVMType cVMType) {
        int i = Camera2StreamConfigurationMap + 39;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            cVMType.getValue();
            util.h.xy.f.b.f2201.m26770(cVMType.getValue());
            int i2 = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = ((i2 & 49) + (i2 | 49)) % 128;
            return;
        }
        cVMType.getValue();
        util.h.xy.f.b.f2201.m26770(cVMType.getValue());
        throw null;
    }
}
