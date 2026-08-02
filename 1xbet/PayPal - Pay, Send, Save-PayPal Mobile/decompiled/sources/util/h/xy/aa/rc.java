package util.h.xy.aa;

/* loaded from: classes18.dex */
public class rc extends util.h.xy.aa.mc {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static final boolean getHighSpeedVideoSizes;
    private util.h.xy.aa.mb.ra getHighSpeedVideoFpsRanges;

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        int i = (getHighSpeedVideoFpsRangesFor + 67) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        java.lang.String str = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i + 107) % 128;
        return str;
    }

    static {
        boolean z = false;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 111;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                z = true;
            }
        } else {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
        }
        getHighSpeedVideoSizes = z;
        Camera2StreamConfigurationMap = "rc";
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 & 111) + (i2 | 111);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public rc(util.h.xy.aa.c cVar) {
        super(cVar);
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f674);
        sb.append(util.h.xy.al.ra.f433);
        util.h.xy.am.ma.m25027(str, sb.toString());
        this.f67 = cVar;
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier
    public void startAuthentication(com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifierInput deviceCVMVerifierInput) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f674);
        sb.append(util.h.xy.al.ra.f449);
        util.h.xy.am.ma.m25027(str, sb.toString());
        if (getHighSpeedVideoSizes) {
            this.getHighSpeedVideoFpsRanges = new util.h.xy.aa.mb.ra() { // from class: util.h.xy.aa.rc.5
                private static int Camera2StreamConfigurationMap = 0;
                private static int getHighSpeedVideoFpsRanges = 1;

                @Override // util.h.xy.aa.mb.ra
                /* renamed from: ˊ */
                public final void mo24519(int i, java.lang.CharSequence charSequence) {
                    int i2 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoFpsRanges = ((i2 ^ 17) + ((i2 & 17) << 1)) % 128;
                    util.h.xy.aa.rc.getHighResolutionOutputSizeshNQ4ISI();
                    if (util.h.xy.aa.rc.this.f67 != null) {
                        int i3 = getHighSpeedVideoFpsRanges;
                        Camera2StreamConfigurationMap = ((i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
                        util.h.xy.aa.rc.this.f67.mo24517();
                        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 35) % 128;
                    } else {
                        util.h.xy.aa.rc.getHighResolutionOutputSizeshNQ4ISI();
                    }
                    int i4 = getHighSpeedVideoFpsRanges;
                    int i5 = (i4 & 5) + (i4 | 5);
                    Camera2StreamConfigurationMap = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                }

                @Override // util.h.xy.aa.mb.ra
                /* renamed from: ˎ */
                public final void mo24521(int i, java.lang.CharSequence charSequence) {
                    int i2 = getHighSpeedVideoFpsRanges;
                    int i3 = (i2 & 93) + (i2 | 93);
                    Camera2StreamConfigurationMap = i3 % 128;
                    if (i3 % 2 != 0) {
                        util.h.xy.aa.rc.getHighResolutionOutputSizeshNQ4ISI();
                        util.h.xy.aa.c cVar = util.h.xy.aa.rc.this.f67;
                        throw null;
                    }
                    util.h.xy.aa.rc.getHighResolutionOutputSizeshNQ4ISI();
                    if (util.h.xy.aa.rc.this.f67 != null) {
                        util.h.xy.aa.rc.this.f67.mo24517();
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 111) % 128;
                    } else {
                        util.h.xy.aa.rc.getHighResolutionOutputSizeshNQ4ISI();
                        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 95) % 128;
                    }
                    int i4 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoFpsRanges = ((i4 & 117) + (i4 | 117)) % 128;
                }

                @Override // util.h.xy.aa.mb.ra
                /* renamed from: ᐝ */
                public final void mo24522(boolean z, long j) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 29) % 128;
                    util.h.xy.aa.rc.getHighResolutionOutputSizeshNQ4ISI();
                    if (util.h.xy.aa.rc.this.f67 == null) {
                        util.h.xy.aa.rc.getHighResolutionOutputSizeshNQ4ISI();
                        int i = Camera2StreamConfigurationMap;
                        int i2 = (i & 71) + (i | 71);
                        getHighSpeedVideoFpsRanges = i2 % 128;
                        int i3 = i2 % 2;
                    } else {
                        int identityHashCode = java.lang.System.identityHashCode(this);
                        int i4 = ~((identityHashCode ^ (-219935072)) | (identityHashCode & (-219935072)));
                        int i5 = -(-(((i4 ^ 1329109400) | (i4 & 1329109400)) * (-964)));
                        int i6 = ~identityHashCode;
                        int i7 = ~((i6 ^ (-219935072)) | (i6 & (-219935072)));
                        int identityHashCode2 = java.lang.System.identityHashCode(this);
                        int i8 = (~(((-1342244372) ^ identityHashCode2) | (identityHashCode2 & (-1342244372)))) * 623;
                        int i9 = (i8 ^ 952581726) + ((i8 & 952581726) << 1);
                        int i10 = ~identityHashCode2;
                        int i11 = ((i10 ^ 595890248) | (i10 & 595890248)) * (-623);
                        int i12 = ((i9 | i11) << 1) - (i11 ^ i9);
                        int i13 = ~(((-1410543256) ^ identityHashCode2) | (identityHashCode2 & (-1410543256)));
                        int i14 = -(-(((~((identityHashCode2 ^ 664189132) | (identityHashCode2 & 664189132))) | (i13 ^ 1342244371) | (i13 & 1342244371)) * 623));
                        if ((1816044001 - (~i5)) + (((i7 ^ 219713816) | (i7 & 219713816)) * (-964)) > (i12 ^ i14) + ((i14 & i12) << 1)) {
                            util.h.xy.aa.rc.this.f67.mo24518(z, j);
                            throw new java.lang.ArithmeticException();
                        }
                        util.h.xy.aa.rc.this.f67.mo24518(z, j);
                    }
                    int i15 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoFpsRanges = ((i15 & 33) + (i15 | 33)) % 128;
                }

                @Override // util.h.xy.aa.mb.ra
                /* renamed from: ˋ */
                public final void mo24520() {
                    int i = getHighSpeedVideoFpsRanges + 69;
                    Camera2StreamConfigurationMap = i % 128;
                    if (i % 2 != 0) {
                        util.h.xy.aa.rc.getHighResolutionOutputSizeshNQ4ISI();
                        util.h.xy.aa.c cVar = util.h.xy.aa.rc.this.f67;
                        throw new java.lang.ArithmeticException();
                    }
                    util.h.xy.aa.rc.getHighResolutionOutputSizeshNQ4ISI();
                    if (util.h.xy.aa.rc.this.f67 != null) {
                        util.h.xy.aa.rc.this.f67.mo24517();
                        int i2 = Camera2StreamConfigurationMap;
                        getHighSpeedVideoFpsRanges = ((i2 & 55) + (i2 | 55)) % 128;
                    } else {
                        util.h.xy.aa.rc.getHighResolutionOutputSizeshNQ4ISI();
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 43) % 128;
                    }
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 15) % 128;
                }
            };
            new util.h.xy.aa.mb(util.h.xy.ag.a.m24556().m24558(), deviceCVMVerifierInput).getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges);
        } else if (util.h.xy.ag.a.m24556().m24558() != null) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = (i & 27) + (i | 27);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                android.app.Activity activity = this.f68;
                throw new java.lang.ArithmeticException();
            }
            if (this.f68 != null) {
                int i3 = getHighResolutionOutputSizeshNQ4ISI;
                int i4 = (i3 ^ 109) + ((i3 & 109) << 1);
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 == 0) {
                    confirmCredential(deviceCVMVerifierInput.getTitle(), deviceCVMVerifierInput.getDescription());
                    throw new java.lang.ArithmeticException();
                }
                confirmCredential(deviceCVMVerifierInput.getTitle(), deviceCVMVerifierInput.getDescription());
                int i5 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = ((i5 & 113) + (i5 | 113)) % 128;
            }
        }
        int i6 = getHighSpeedVideoFpsRangesFor;
        int i7 = (i6 & 89) + (i6 | 89);
        getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier
    public void onDelegatedAuthPerformed(long j) {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 45) % 128;
        this.f67.mo24518(true, j);
        int i = getHighResolutionOutputSizeshNQ4ISI + 89;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier
    public void onDelegatedAuthCancelled() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 93;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            this.f67.mo24517();
        } else {
            this.f67.mo24517();
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier
    public void setCVMType(com.gemalto.mfs.mwsdk.payment.CVMType cVMType) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 109) % 128;
        cVMType.getValue();
        util.h.xy.f.b.f2201.m26770(cVMType.getValue());
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i ^ 27) + ((i & 27) << 1)) % 128;
    }
}
