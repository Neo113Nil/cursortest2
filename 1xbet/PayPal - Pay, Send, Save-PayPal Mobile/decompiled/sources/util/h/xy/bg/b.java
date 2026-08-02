package util.h.xy.bg;

/* loaded from: classes5.dex */
public class b extends util.h.xy.bf.rb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 77;

    public b(util.h.xy.bf.a aVar) {
        super(aVar);
    }

    @Override // util.h.xy.bf.b
    /* renamed from: ˋ */
    public java.lang.String mo25411() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
        Camera2StreamConfigurationMap = i;
        getHighResolutionOutputSizeshNQ4ISI = (i + 7) % 128;
        return util.h.xy.cb.b.f1091;
    }

    @Override // util.h.xy.bf.rb, util.h.xy.bf.b
    public byte[] G_(byte[] bArr, android.os.Bundle bundle) {
        synchronized (this) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 87) % 128;
            byte[] G_ = super.G_(bArr, bundle);
            if (G_ != null) {
                int i = getHighResolutionOutputSizeshNQ4ISI;
                int i2 = ((i | 45) << 1) - (i ^ 45);
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 == 0) {
                    return G_;
                }
                throw new java.lang.ArithmeticException();
            }
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            int i4 = (i3 ^ 15) + ((i3 & 15) << 1);
            Camera2StreamConfigurationMap = i4 % 128;
            byte[] bArr2 = null;
            if (i4 % 2 != 0) {
                util.h.xy.bg.ra.f945.m25460(this.f942);
                throw null;
            }
            byte[] m25460 = util.h.xy.bg.ra.f945.m25460(this.f942);
            if (m25460 != null) {
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 109) % 128;
                bArr2 = m25460;
            } else {
                this.f943 = null;
                int i5 = Camera2StreamConfigurationMap;
                getHighResolutionOutputSizeshNQ4ISI = ((i5 ^ 97) + ((i5 & 97) << 1)) % 128;
            }
            int i6 = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = (((i6 | 11) << 1) - (i6 ^ 11)) % 128;
            return bArr2;
        }
    }

    @Override // util.h.xy.bf.rb, util.h.xy.bf.b
    @util.h.xy.a.a
    public byte[] H_(byte[] bArr, android.os.Bundle bundle) {
        byte[] mo25372;
        int i;
        util.h.xy.ar.b.m25074(bArr);
        this.f942.m25403(false);
        this.f942.m25402();
        if (this.f942.m25397()) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = ((i2 ^ 81) + ((i2 & 81) << 1)) % 128;
            this.f942.m25390(false);
            util.h.xy.bg.ra.f945.m25463(this.f942);
            util.h.xy.bg.ra.f945.m25462();
        }
        byte[] m25446 = util.h.xy.bf.ra.m25446(util.h.xy.bf.c.f934.m25413());
        if (m25446 != null) {
            return m25446;
        }
        if (util.h.xy.bu.b.f1050.m25639() != null) {
            ((util.h.xy.bq.b) util.h.xy.bu.b.f1050.m25639()).m25564((com.gemalto.mfs.mwsdk.payment.engine.TransactionContext) null);
            int i3 = Camera2StreamConfigurationMap + 79;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            int i4 = i3 % 2;
        }
        try {
            int i5 = Camera2StreamConfigurationMap;
            int i6 = (i5 ^ 35) + ((i5 & 35) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 == 0) {
                this.f942.m25404();
                throw new java.lang.ArithmeticException();
            }
            if (this.f942.m25404()) {
                mo25372 = this.f941.H_(bArr, bundle);
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 121) % 128;
            } else {
                mo25372 = util.h.xy.bd.ra.m25373(bArr).mo25372(bArr);
                int i7 = Camera2StreamConfigurationMap;
                getHighResolutionOutputSizeshNQ4ISI = ((i7 & 13) + (i7 | 13)) % 128;
            }
            int i8 = getHighResolutionOutputSizeshNQ4ISI;
            int i9 = (i8 ^ 53) + ((i8 & 53) << 1);
            int i10 = i9 % 128;
            Camera2StreamConfigurationMap = i10;
            int i11 = i9 % 2;
            getHighResolutionOutputSizeshNQ4ISI = ((i10 & 53) + (i10 | 53)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = ((i10 & 101) + (i10 | 101)) % 128;
            if (java.util.Arrays.equals(mo25372, f927)) {
                int i12 = Camera2StreamConfigurationMap;
                getHighResolutionOutputSizeshNQ4ISI = (((i12 | 17) << 1) - (i12 ^ 17)) % 128;
                getHighResolutionOutputSizeshNQ4ISI = (i12 + 101) % 128;
                getHighResolutionOutputSizeshNQ4ISI = (i12 + 79) % 128;
                util.h.xy.bf.ma.m25415(util.h.xy.bf.c.f934.m25413(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.ERROR_FUNCTION_NOT_SUPPORTED, util.h.xy.al.ra.f276);
                int i13 = getHighResolutionOutputSizeshNQ4ISI + 11;
                Camera2StreamConfigurationMap = i13 % 128;
                if (i13 % 2 == 0) {
                    return mo25372;
                }
                throw null;
            }
            int i14 = getHighResolutionOutputSizeshNQ4ISI + 29;
            Camera2StreamConfigurationMap = i14 % 128;
            if (i14 % 2 != 0) {
                java.util.Arrays.equals(mo25372, util.h.xy.bf.b.f924);
                throw null;
            }
            if (java.util.Arrays.equals(mo25372, util.h.xy.bf.b.f924)) {
                int i15 = getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap = ((i15 ^ 61) + ((i15 & 61) << 1)) % 128;
                i = com.visa.cbp.sdk.facade.data.Constants.HOOK_DETECTED;
            } else if (java.util.Arrays.equals(mo25372, util.h.xy.bf.b.f923)) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
                i = com.visa.cbp.sdk.facade.data.Constants.SUPER_USER_PERMISSION_DETECTED;
            } else if (java.util.Arrays.equals(mo25372, util.h.xy.bf.b.f922)) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
                i = 801;
            } else if (java.util.Arrays.equals(mo25372, util.h.xy.bf.b.f931)) {
                int i16 = getHighResolutionOutputSizeshNQ4ISI;
                int i17 = (i16 ^ 13) + ((i16 & 13) << 1);
                Camera2StreamConfigurationMap = i17 % 128;
                int i18 = i17 % 2 != 0 ? 25099 : 803;
                Camera2StreamConfigurationMap = ((i16 & 63) + (i16 | 63)) % 128;
                i = i18;
            } else {
                int i19 = getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap = ((i19 & 83) + (i19 | 83)) % 128;
                i = -91;
            }
            if (-91 != i) {
                int i20 = Camera2StreamConfigurationMap;
                getHighResolutionOutputSizeshNQ4ISI = ((i20 & 119) + (i20 | 119)) % 128;
                util.h.xy.bf.ma.m25425(util.h.xy.bf.c.f934.m25413(), i);
                return new byte[]{105, -123};
            }
            if (this.f942.m25397()) {
                int i21 = Camera2StreamConfigurationMap;
                int i22 = ((i21 | 63) << 1) - (i21 ^ 63);
                getHighResolutionOutputSizeshNQ4ISI = i22 % 128;
                if (i22 % 2 == 0) {
                    getHighSpeedVideoFpsRanges(mo25372);
                    throw null;
                }
                if (!getHighSpeedVideoFpsRanges(mo25372)) {
                    util.h.xy.bg.ra.f945.m25461();
                    int i23 = Camera2StreamConfigurationMap;
                    getHighResolutionOutputSizeshNQ4ISI = ((i23 ^ 97) + ((i23 & 97) << 1)) % 128;
                }
            }
            util.h.xy.ar.b.m25074(bArr);
            int i24 = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = ((i24 ^ 53) + ((i24 & 53) << 1)) % 128;
            return mo25372;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            util.h.xy.bf.ma.m25415(util.h.xy.bf.c.f934.m25413(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.INTERNAL_ERROR, e.getMessage());
            return f925;
        }
    }

    @Override // util.h.xy.bf.rb, util.h.xy.bf.b
    public byte[] I_(byte[] bArr, android.os.Bundle bundle, byte[] bArr2) {
        byte[] I_;
        synchronized (this) {
            int i = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = ((i & 19) + (i | 19)) % 128;
            I_ = super.I_(bArr, bundle, bArr2);
        }
        return I_;
    }

    @Override // util.h.xy.bf.rb
    /* renamed from: ˎ */
    public com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25449(int i) {
        int i2 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i2 & 23) + (i2 | 23)) % 128;
        com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25449 = super.mo25449(i);
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (((i3 | 125) << 1) - (i3 ^ 125)) % 128;
        return mo25449;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (java.util.Arrays.equals(r2, util.h.xy.bg.b.f932) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean getHighSpeedVideoFpsRanges(byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 117) + (i | 117);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        boolean z = true;
        if (i2 % 2 != 0) {
            if (!java.util.Arrays.equals(bArr, f932)) {
                z = false;
            }
            int i3 = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = ((i3 ^ 103) + ((i3 & 103) << 1)) % 128;
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 33) % 128;
        return z;
    }
}
