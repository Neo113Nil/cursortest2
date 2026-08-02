package util.h.xy.bf;

/* loaded from: classes18.dex */
public class e extends util.h.xy.bf.rb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    static {
        int i = getHighSpeedVideoFpsRangesFor + 85;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.bf.b
    /* renamed from: ˋ */
    public java.lang.String mo25411() {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 67) % 128;
        java.lang.String name2 = util.h.xy.bf.e.class.getName();
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 43) << 1) - (i ^ 43)) % 128;
        return name2;
    }

    @Override // util.h.xy.bf.rb, util.h.xy.bf.b
    @util.h.xy.a.a
    public byte[] H_(byte[] bArr, android.os.Bundle bundle) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 15;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRangesFor(bArr, bundle);
            throw null;
        }
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr, bundle);
        int i2 = getHighSpeedVideoFpsRangesFor + 69;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f7, code lost:
    
        if ((r3 instanceof util.h.xy.bq.mb) != false) goto L52;
     */
    @Override // util.h.xy.bf.rb, util.h.xy.bf.b
    @util.h.xy.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] G_(byte[] bArr, android.os.Bundle bundle) {
        byte[] m25444;
        synchronized (this) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 71) % 128;
            byte[] G_ = super.G_(bArr, bundle);
            if (G_ != null) {
                int i = getHighSpeedVideoFpsRangesFor + 113;
                int i2 = i % 128;
                getHighResolutionOutputSizeshNQ4ISI = i2;
                if (i % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                int i3 = i2 + 67;
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 == 0) {
                    return G_;
                }
                throw new java.lang.NullPointerException();
            }
            int i4 = getHighSpeedVideoFpsRangesFor;
            int i5 = (i4 ^ 113) + ((i4 & 113) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 == 0) {
                util.h.xy.bf.mc.Camera2StreamConfigurationMap();
                throw new java.lang.ArithmeticException();
            }
            byte[] bArr2 = null;
            if (util.h.xy.bf.mc.Camera2StreamConfigurationMap() || (m25444 = util.h.xy.bf.ra.m25448(util.h.xy.bf.c.f934.m25413())) == null) {
                com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService().getActivatedPaymentService();
                if (activatedPaymentService == null) {
                    int i6 = getHighResolutionOutputSizeshNQ4ISI;
                    int i7 = (i6 & 27) + (i6 | 27);
                    getHighSpeedVideoFpsRangesFor = i7 % 128;
                    if (i7 % 2 != 0) {
                        util.h.xy.bf.ra.m25445();
                        util.h.xy.bf.ra.m25444(util.h.xy.bf.c.f934.m25413(), this.f942.m25406());
                        throw new java.lang.ArithmeticException();
                    }
                    util.h.xy.bf.ra.m25445();
                    m25444 = util.h.xy.bf.ra.m25444(util.h.xy.bf.c.f934.m25413(), this.f942.m25406());
                    if (m25444 != null) {
                        int i8 = getHighSpeedVideoFpsRangesFor + 15;
                        getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                        if (i8 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        m25444 = util.h.xy.bf.ra.m25443(util.h.xy.bf.c.f934.m25413());
                        if (m25444 != null) {
                            int i9 = getHighResolutionOutputSizeshNQ4ISI;
                            getHighSpeedVideoFpsRangesFor = ((i9 ^ 67) + ((i9 & 67) << 1)) % 128;
                        }
                    }
                } else {
                    if (!(activatedPaymentService instanceof util.h.xy.bq.rd)) {
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 73) % 128;
                    }
                    ((util.h.xy.bq.a) activatedPaymentService).m25552();
                }
                this.f943 = null;
                int i10 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRangesFor = ((i10 & 113) + (i10 | 113)) % 128;
                return bArr2;
            }
            int i11 = getHighResolutionOutputSizeshNQ4ISI;
            int i12 = (i11 ^ 75) + ((i11 & 75) << 1);
            int i13 = i12 % 128;
            getHighSpeedVideoFpsRangesFor = i13;
            if (i12 % 2 != 0) {
                throw null;
            }
            getHighResolutionOutputSizeshNQ4ISI = (((i13 | 99) << 1) - (i13 ^ 99)) % 128;
            bArr2 = m25444;
            int i102 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i102 & 113) + (i102 | 113)) % 128;
            return bArr2;
        }
    }

    @Override // util.h.xy.bf.rb, util.h.xy.bf.b
    @util.h.xy.a.a
    public byte[] I_(byte[] bArr, android.os.Bundle bundle, byte[] bArr2) {
        byte[] I_;
        synchronized (this) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            I_ = super.I_(bArr, bundle, bArr2);
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = ((i | 79) << 1) - (i ^ 79);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
        return I_;
    }

    private byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, android.os.Bundle bundle) {
        synchronized (this) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = (i & 57) + (i | 57);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                super.H_(bArr, bundle);
                throw new java.lang.ArithmeticException();
            }
            byte[] H_ = super.H_(bArr, bundle);
            if (H_ == null) {
                return null;
            }
            if (H_.length != 0) {
                int i3 = getHighSpeedVideoFpsRangesFor;
                int i4 = (i3 ^ 95) + ((i3 & 95) << 1);
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 != 0) {
                    return H_;
                }
                throw new java.lang.NullPointerException();
            }
            int i5 = getHighSpeedVideoFpsRangesFor;
            int i6 = i5 + 97;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 5;
            }
            getHighResolutionOutputSizeshNQ4ISI = (i5 + 47) % 128;
            if (this.f942.m25404()) {
                int i8 = getHighResolutionOutputSizeshNQ4ISI + 99;
                getHighSpeedVideoFpsRangesFor = i8 % 128;
                if (i8 % 2 == 0) {
                    return this.f941.H_(bArr, bundle);
                }
                this.f941.H_(bArr, bundle);
                throw null;
            }
            try {
                byte[] m27624 = util.h.xy.v.b.f2439.m27624(bArr);
                int i9 = getHighResolutionOutputSizeshNQ4ISI + 77;
                getHighSpeedVideoFpsRangesFor = i9 % 128;
                if (i9 % 2 == 0) {
                    return m27624;
                }
                throw new java.lang.ArithmeticException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                return util.h.xy.bf.ra.m25447(e, util.h.xy.bf.c.f934.m25413());
            }
        }
    }
}
