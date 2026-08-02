package util.h.xy.bt;

/* loaded from: classes18.dex */
public class ma {
    private static int getHighResolutionOutputSizeshNQ4ISI = 90;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private util.h.xy.d.md Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRanges;
    private com.gemalto.mfs.mwsdk.dcm.PaymentType getHighSpeedVideoSizes;
    private util.h.xy.bt.ra.a getHighSpeedVideoSizesFor;
    private util.h.xy.bt.a getInputSizeshNQ4ISI;

    public ma(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, util.h.xy.bt.ra.a aVar, util.h.xy.bt.a aVar2) {
        this.getHighSpeedVideoSizesFor = util.h.xy.bt.ra.a.f1043;
        com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
        this.Camera2StreamConfigurationMap = null;
        this.getInputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoSizes = paymentType;
        this.Camera2StreamConfigurationMap = (util.h.xy.d.md) digitalizedCard;
        this.getHighSpeedVideoSizesFor = aVar;
        this.getInputSizeshNQ4ISI = aVar2;
        if (digitalizedCard == null) {
            try {
                util.h.xy.d.d m26956 = util.h.xy.k.ra.f2243.m26956();
                this.getHighSpeedVideoFpsRanges = (m26956 == null || m26956.m26179() == null) ? false : true;
                return;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                this.getHighSpeedVideoFpsRanges = false;
                return;
            }
        }
        this.getHighSpeedVideoFpsRanges = digitalizedCard.hasAuxiliaryScheme();
    }

    /* renamed from: util.h.xy.bt.ma$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD.ordinal()] = 2;
                int i = getHighSpeedVideoFpsRanges;
                int i2 = (i & 19) + (i | 19);
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 121) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f5, code lost:
    
        if (r7.getHighSpeedVideoSizesFor == util.h.xy.bt.ra.a.f1045) goto L45;
     */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m25623() {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
        util.h.xy.u.b m25517 = util.h.xy.bm.ma.f984.m25517();
        if (m25517 != util.h.xy.u.b.f2435) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = (i & 89) + (i | 89);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                util.h.xy.u.b bVar = util.h.xy.u.b.f2433;
                throw new java.lang.ArithmeticException();
            }
            if (m25517 != util.h.xy.u.b.f2433) {
                return;
            }
        }
        int i3 = util.h.xy.bt.ma.AnonymousClass2.Camera2StreamConfigurationMap[util.h.xy.bm.ma.f984.m25516().ordinal()];
        if (i3 == 1 || i3 == 2) {
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 23;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                util.h.xy.u.ma maVar = (util.h.xy.u.ma) util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f978).m25508();
                maVar.m27528();
                maVar.m27528();
                util.h.xy.aa.d dVar = util.h.xy.aa.d.f65;
                throw null;
            }
            util.h.xy.u.ma maVar2 = (util.h.xy.u.ma) util.h.xy.bk.ma.m25504().m25506(util.h.xy.bk.b.f978).m25508();
            maVar2.m27528();
            if (maVar2.m27528() == util.h.xy.aa.d.f65) {
                if (this.getHighSpeedVideoSizesFor != util.h.xy.bt.ra.a.f1043) {
                    int i5 = getHighSpeedVideoFpsRangesFor;
                    int i6 = (i5 & 3) + (i5 | 3);
                    getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                    if (i6 % 2 != 0) {
                        util.h.xy.bt.ra.a aVar = util.h.xy.bt.ra.a.f1045;
                        throw new java.lang.ArithmeticException();
                    }
                    if (this.getHighSpeedVideoSizesFor != util.h.xy.bt.ra.a.f1045) {
                        util.h.xy.f.b.f2201.m26754(false);
                        getHighSpeedVideoSizes(true, true);
                        util.h.xy.al.a.m25002(false);
                        util.h.xy.bf.mb.f938.m25426().m25394(true);
                        util.h.xy.bf.mb.f938.m25426().m25400();
                    }
                }
                if (util.h.xy.al.a.m25001()) {
                    int i7 = getHighSpeedVideoFpsRangesFor;
                    getHighResolutionOutputSizeshNQ4ISI = ((i7 ^ 53) + ((i7 & 53) << 1)) % 128;
                    getHighSpeedVideoSizes(false, false);
                } else {
                    getHighSpeedVideoSizes(true, util.h.xy.bf.mc.m25433());
                }
            } else if (maVar2.m27528() == util.h.xy.aa.d.f62) {
                int i8 = getHighResolutionOutputSizeshNQ4ISI;
                int i9 = ((i8 | 57) << 1) - (i8 ^ 57);
                getHighSpeedVideoFpsRangesFor = i9 % 128;
                if (i9 % 2 == 0) {
                    util.h.xy.bt.ra.a aVar2 = util.h.xy.bt.ra.a.f1043;
                    throw null;
                }
                if (this.getHighSpeedVideoSizesFor != util.h.xy.bt.ra.a.f1043) {
                    int i10 = getHighResolutionOutputSizeshNQ4ISI;
                    int i11 = (i10 & 43) + (i10 | 43);
                    getHighSpeedVideoFpsRangesFor = i11 % 128;
                    if (i11 % 2 == 0) {
                        util.h.xy.bt.ra.a aVar3 = util.h.xy.bt.ra.a.f1045;
                        throw null;
                    }
                }
                getHighSpeedVideoSizes(false, false);
            }
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
        }
    }

    private void getHighSpeedVideoSizes(boolean z, boolean z2) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 105) % 128;
        util.h.xy.bm.b.f983.m25512(z, z2, this.getHighSpeedVideoFpsRanges);
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 97) + ((i & 97) << 1)) % 128;
    }
}
