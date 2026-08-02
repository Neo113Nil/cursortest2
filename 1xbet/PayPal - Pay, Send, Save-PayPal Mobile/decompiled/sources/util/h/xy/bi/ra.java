package util.h.xy.bi;

/* loaded from: classes5.dex */
public abstract class ra extends util.h.xy.bf.rb implements java.util.Observer {
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "ra";
    private static int getHighSpeedVideoFpsRangesFor = 43;
    private static int getHighSpeedVideoSizes;
    private final byte Camera2StreamConfigurationMap;
    byte[] getHighSpeedVideoFpsRanges;
    private final byte getHighSpeedVideoSizesFor;
    private final byte getInputFormats;
    private final byte getInputSizeshNQ4ISI;
    private final byte getOutputFormats;

    /* renamed from: ʹ, reason: contains not printable characters */
    protected final byte[] f960;

    /* renamed from: ˍ, reason: contains not printable characters */
    protected final byte[] f961;

    /* renamed from: ˑ, reason: contains not printable characters */
    protected final byte[] f962;

    /* renamed from: י, reason: contains not printable characters */
    protected final byte[] f963;

    /* renamed from: ـ, reason: contains not printable characters */
    protected final byte[] f964;

    /* renamed from: ᐧ, reason: contains not printable characters */
    protected final byte[] f965;

    /* renamed from: ᐨ, reason: contains not printable characters */
    protected final byte[] f966;

    /* renamed from: ᵎ, reason: contains not printable characters */
    protected util.h.xy.g.ra f967;

    /* renamed from: ﹳ, reason: contains not printable characters */
    protected util.h.xy.g.b f968;

    /* renamed from: ﾞ, reason: contains not printable characters */
    protected final byte[] f969;

    /* renamed from: ˋ */
    protected abstract com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25489(byte[] bArr, byte[] bArr2);

    /* renamed from: ˎ */
    protected abstract byte[] mo25490(byte[] bArr);

    /* renamed from: ˏ */
    protected abstract byte[] mo25491(byte[] bArr);

    /* renamed from: ᐝ */
    protected abstract byte[] mo25492(byte[] bArr);

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.bi.ra raVar, byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (((i | 27) << 1) - (i ^ 27)) % 128;
        raVar.getHighResolutionOutputSizeshNQ4ISI(bArr);
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (((i2 | 87) << 1) - (i2 ^ 87)) % 128;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 105) + (i | 105);
        getHighSpeedVideoSizes = i2 % 128;
        java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public ra(util.h.xy.g.b bVar, util.h.xy.bf.a aVar) {
        super(aVar);
        this.Camera2StreamConfigurationMap = (byte) -92;
        this.getHighSpeedVideoSizesFor = (byte) -88;
        this.getInputFormats = (byte) -90;
        this.getInputSizeshNQ4ISI = (byte) -82;
        this.getOutputFormats = (byte) -78;
        this.f962 = util.h.xy.ar.b.m25076(util.h.xy.al.ra.f431);
        this.f966 = util.h.xy.ar.b.m25076(util.h.xy.al.ra.f471);
        this.f961 = util.h.xy.ar.b.m25076(util.h.xy.al.ra.f502);
        this.f965 = util.h.xy.ar.b.m25076(util.h.xy.al.ra.f487);
        this.f964 = util.h.xy.ar.b.m25076(util.h.xy.al.ra.f471);
        this.f969 = util.h.xy.ar.b.m25076(util.h.xy.al.ra.f473);
        this.f963 = util.h.xy.ar.b.m25076(util.h.xy.al.ra.f495);
        this.f960 = util.h.xy.ar.b.m25076(util.h.xy.al.ra.f484);
        this.getHighSpeedVideoFpsRanges = new byte[]{0};
        this.f968 = bVar;
        util.h.xy.v.c.m27646().m27657(this);
    }

    @Override // util.h.xy.bf.rb, util.h.xy.bf.b
    @util.h.xy.a.a
    public byte[] G_(byte[] bArr, android.os.Bundle bundle) {
        synchronized (this) {
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i = ~identityHashCode;
            int i2 = ~((i ^ 1634178380) | (i & 1634178380));
            int i3 = ~(i | 2076709727);
            int i4 = 174593387 - (~(-(-(((i2 ^ i3) | (i2 & i3)) * (-867)))));
            int i5 = ~((1634178380 ^ identityHashCode) | (identityHashCode & 1634178380));
            int i6 = (i5 ^ (-2079299424)) | (i5 & (-2079299424));
            int i7 = ~((identityHashCode ^ 2076709727) | (2076709727 & identityHashCode));
            int i8 = -(-(((i6 ^ i7) | (i6 & i7)) * (-1734)));
            int i9 = ~((i ^ 2079299423) | (i & 2079299423));
            int i10 = ~(((-445121044) ^ identityHashCode) | (identityHashCode & (-445121044)));
            int i11 = (i9 ^ i10) | (i9 & i10);
            int i12 = ~(identityHashCode | (-2589697));
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i13 = ~identityHashCode2;
            int i14 = (i13 ^ (-622976548)) | (i13 & (-622976548));
            int i15 = (~i14) | 86084608;
            int i16 = ~((identityHashCode2 ^ (-1343881693)) | (identityHashCode2 & (-1343881693)));
            int i17 = ((i15 ^ i16) | (i15 & i16)) * (-252);
            int i18 = ~((i14 ^ (-1880773632)) | (i14 & (-1880773632)));
            int i19 = (i4 & i8) + (i8 | i4) + (((i12 ^ i11) | (i12 & i11)) * 867);
            byte[] bArr2 = null;
            if (i19 <= ((((i17 ^ (-395082601)) + (((-395082601) & i17) << 1)) - 644229748) - (~(-(-(((i18 & i16) | (i18 ^ i16)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))))) - 1) {
                super.G_(bArr, bundle);
                throw null;
            }
            byte[] G_ = super.G_(bArr, bundle);
            if (G_ != null) {
                int i20 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = (((i20 | 95) << 1) - (i20 ^ 95)) % 128;
                return G_;
            }
            int i21 = getHighSpeedVideoFpsRangesFor;
            int i22 = i21 + 75;
            getHighSpeedVideoSizes = i22 % 128;
            if (this.f968 == null) {
                getHighSpeedVideoSizes = i22 % 128;
                if (i22 % 2 != 0) {
                    util.h.xy.bf.ma.m25422(util.h.xy.al.ra.f693, util.h.xy.bf.c.f934.m25413());
                    byte[] bArr3 = util.h.xy.bf.mc.f940;
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.bf.ma.m25422(util.h.xy.al.ra.f693, util.h.xy.bf.c.f934.m25413());
                bArr2 = util.h.xy.bf.mc.f940;
                int i23 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = ((i23 & 45) + (i23 | 45)) % 128;
            } else {
                int i24 = ((i21 | 81) << 1) - (i21 ^ 81);
                getHighSpeedVideoSizes = i24 % 128;
                if (i24 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
            }
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 115) % 128;
            return bArr2;
        }
    }

    @Override // util.h.xy.bf.rb, util.h.xy.bf.b
    @util.h.xy.a.a
    public byte[] I_(byte[] bArr, android.os.Bundle bundle, byte[] bArr2) {
        int i = getHighSpeedVideoSizes + 107;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return bArr2;
        }
        throw null;
    }

    @Override // util.h.xy.bf.rb, util.h.xy.bf.b
    @util.h.xy.a.a
    public byte[] H_(byte[] bArr, android.os.Bundle bundle) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 107) + (i | 107);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.ar.b.m25074(bArr);
            byte b = bArr[0];
            if (b != -92) {
                if (b != -90) {
                    if (b != -88) {
                        if (b != -82) {
                            if (b != -78) {
                                return null;
                            }
                            byte[] mo25491 = mo25491(bArr);
                            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 111) % 128;
                            return mo25491;
                        }
                        byte[] mo25492 = mo25492(bArr);
                        int i3 = getHighSpeedVideoFpsRangesFor;
                        getHighSpeedVideoSizes = ((i3 ^ 81) + ((i3 & 81) << 1)) % 128;
                        return mo25492;
                    }
                    return mo25490(bArr);
                }
                return mo25488(bArr);
            }
            return m25500(bArr);
        }
        util.h.xy.ar.b.m25074(bArr);
        byte b2 = bArr[1];
        if (b2 != -92) {
            if (b2 != -90) {
                if (b2 != -88) {
                    if (b2 != -82) {
                        if (b2 != -78) {
                            return null;
                        }
                        byte[] mo254912 = mo25491(bArr);
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 111) % 128;
                        return mo254912;
                    }
                    byte[] mo254922 = mo25492(bArr);
                    int i32 = getHighSpeedVideoFpsRangesFor;
                    getHighSpeedVideoSizes = ((i32 ^ 81) + ((i32 & 81) << 1)) % 128;
                    return mo254922;
                }
                return mo25490(bArr);
            }
            return mo25488(bArr);
        }
        return m25500(bArr);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final byte[] m25500(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i & 41) + (i | 41)) % 128;
        try {
            byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(bArr);
            if (this.f942.m25397()) {
                int i2 = getHighSpeedVideoSizes;
                int i3 = ((i2 | 105) << 1) - (i2 ^ 105);
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 == 0) {
                    this.f942.m25396(true);
                } else {
                    this.f942.m25396(false);
                }
                util.h.xy.bf.ma.m25418(util.h.xy.bf.c.f934.m25413());
                int i4 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = ((i4 ^ 65) + ((i4 & 65) << 1)) % 128;
            }
            int i5 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = (((i5 | 121) << 1) - (i5 ^ 121)) % 128;
            return Camera2StreamConfigurationMap;
        } catch (java.lang.Throwable th) {
            if (this.f942.m25397()) {
                this.f942.m25396(false);
                util.h.xy.bf.ma.m25418(util.h.xy.bf.c.f934.m25413());
                int i6 = getHighSpeedVideoSizes + 63;
                getHighSpeedVideoFpsRangesFor = i6 % 128;
                int i7 = i6 % 2;
            }
            throw th;
        }
    }

    private byte[] Camera2StreamConfigurationMap(byte[] bArr) {
        byte[] bArr2;
        com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener m25413;
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (i + 81) % 128;
        try {
            getHighSpeedVideoSizes = ((i ^ 71) + ((i & 71) << 1)) % 128;
            byte b = bArr[4];
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i2 = ~b;
            int i3 = ~((i2 ^ (-6)) | (i2 & (-6)));
            int i4 = (b ^ 5) | (b & 5);
            int i5 = ~((i4 ^ identityHashCode) | (i4 & identityHashCode));
            int i6 = -(-(((i5 ^ i3) | (i3 & i5)) * (-756)));
            int i7 = b | 5;
            int i8 = ~identityHashCode;
            byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, 5, (((((b * (-755)) - 3775) + (i3 * 1512)) - (~i6)) - 1) + (((i8 ^ i7) | (i7 & i8)) * 756));
            this.getHighSpeedVideoFpsRanges = copyOfRange;
            java.lang.String m25074 = util.h.xy.ar.b.m25074(copyOfRange);
            int i9 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = (((i9 | 25) << 1) - (i9 ^ 25)) % 128;
            if (util.h.xy.al.ra.f783.equals(m25074)) {
                this.f968.mo26866();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.f968.mo26866());
                sb.append(util.h.xy.al.ra.f431);
                bArr2 = util.h.xy.ar.b.m25076(sb.toString());
            } else {
                util.h.xy.g.ra m26863 = this.f968.mo26864().m26863(m25074);
                this.f967 = m26863;
                if (m26863 == null) {
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 111) % 128;
                    bArr2 = this.f966;
                } else {
                    m26863.m26879();
                    if (this.f968.mo26865() == util.h.xy.s.a.b.f2296) {
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 101) % 128;
                        if (this.f967.m26879() == com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.LOCKED) {
                            int i10 = getHighSpeedVideoSizes;
                            int i11 = ((i10 | 105) << 1) - (i10 ^ 105);
                            getHighSpeedVideoFpsRangesFor = i11 % 128;
                            if (i11 % 2 == 0) {
                                this.f942.m25403(false);
                                m25413 = util.h.xy.bf.c.f934.m25413();
                            } else {
                                this.f942.m25403(false);
                                m25413 = util.h.xy.bf.c.f934.m25413();
                            }
                            util.h.xy.bf.ma.m25415(m25413, com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.ERROR_FUNCTION_NOT_SUPPORTED, util.h.xy.al.ra.f276);
                            return this.f965;
                        }
                    }
                    this.f967.m26875();
                    if (this.f968 instanceof util.h.xy.g.mb) {
                        this.f967.m26880();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(this.f967.m26880());
                        sb2.append(util.h.xy.al.ra.f431);
                        bArr2 = util.h.xy.ar.b.m25076(sb2.toString());
                    } else {
                        this.f967.m26876();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(this.f967.m26876());
                        sb3.append(util.h.xy.al.ra.f431);
                        bArr2 = util.h.xy.ar.b.m25076(sb3.toString());
                    }
                }
            }
            int i12 = getHighSpeedVideoSizes;
            int i13 = (i12 ^ 101) + ((i12 & 101) << 1);
            getHighSpeedVideoFpsRangesFor = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 4 / 5;
            }
        } catch (java.lang.Exception unused) {
            bArr2 = this.f961;
        }
        int i15 = getHighSpeedVideoFpsRangesFor + 109;
        getHighSpeedVideoSizes = i15 % 128;
        if (i15 % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    /* renamed from: ˊ */
    protected byte[] mo25488(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i & 29) + (i | 29)) % 128;
        getHighSpeedVideoSizes = (i + 89) % 128;
        return null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected void m25499(final byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i ^ 25) + ((i & 25) << 1)) % 128;
        if (com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().getSDKServiceState() == com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZED) {
            int i2 = getHighSpeedVideoSizes;
            int i3 = (i2 & 41) + (i2 | 41);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                getHighResolutionOutputSizeshNQ4ISI(bArr);
                throw null;
            }
            getHighResolutionOutputSizeshNQ4ISI(bArr);
            int i4 = getHighSpeedVideoSizes;
            int i5 = (i4 ^ 109) + ((i4 & 109) << 1);
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            int i6 = i5 % 2;
        } else {
            util.h.xy.v.c.m27646().m27663(new util.h.xy.ag.ma.InterfaceC0255ma() { // from class: util.h.xy.bi.ra.2
                private static int Camera2StreamConfigurationMap = 1;
                private static int getHighSpeedVideoFpsRangesFor;

                @Override // util.h.xy.ag.ma.InterfaceC0255ma
                /* renamed from: ˊ */
                public final void mo24564(final util.h.xy.ag.ma maVar) {
                    new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.bi.ra.2.1
                        private static int Camera2StreamConfigurationMap = 1;
                        private static int getHighSpeedVideoSizes;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i7 = getHighSpeedVideoSizes;
                            int i8 = ((i7 | 97) << 1) - (i7 ^ 97);
                            Camera2StreamConfigurationMap = i8 % 128;
                            try {
                            } catch (java.lang.Throwable th) {
                                util.h.xy.bi.ra.getHighSpeedVideoFpsRangesFor();
                                th.getMessage();
                                util.h.xy.bf.ma.m25415(util.h.xy.bf.c.f934.m25413(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.INTERNAL_ERROR, util.h.xy.al.ra.f379);
                            }
                            if (i8 % 2 != 0) {
                                util.h.xy.bi.ra.Camera2StreamConfigurationMap(util.h.xy.bi.ra.this, bArr);
                                maVar.m24561();
                                int i9 = Camera2StreamConfigurationMap;
                                getHighSpeedVideoSizes = ((i9 ^ 65) + ((i9 & 65) << 1)) % 128;
                                return;
                            }
                            util.h.xy.bi.ra.Camera2StreamConfigurationMap(util.h.xy.bi.ra.this, bArr);
                            maVar.m24561();
                            throw null;
                        }
                    }).start();
                    int i7 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoFpsRangesFor = (((i7 | 47) << 1) - (i7 ^ 47)) % 128;
                }
            });
            int i7 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = (((i7 | 79) << 1) - (i7 ^ 79)) % 128;
        }
        int i8 = getHighSpeedVideoFpsRangesFor;
        int i9 = ((i8 | 9) << 1) - (i8 ^ 9);
        getHighSpeedVideoSizes = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(final byte[] bArr) {
        util.h.xy.v.c.m27646().m27649();
        if (com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().getSDKServiceState() == com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZED) {
            byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
            if (bArr2 != null) {
                int i = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = ((i ^ 43) + ((i & 43) << 1)) % 128;
                if (bArr2.length != 0) {
                    util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bi.ra.5
                        private static int Camera2StreamConfigurationMap = 1;
                        private static int getHighSpeedVideoFpsRangesFor;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = getHighSpeedVideoFpsRangesFor;
                            int i3 = (i2 & 51) + (i2 | 51);
                            Camera2StreamConfigurationMap = i3 % 128;
                            try {
                                if (i3 % 2 == 0) {
                                    util.h.xy.bf.mc mcVar = util.h.xy.bf.mc.f939;
                                    util.h.xy.bi.ra raVar = util.h.xy.bi.ra.this;
                                    mcVar.m25441(raVar.mo25489(raVar.getHighSpeedVideoFpsRanges, bArr));
                                    throw null;
                                }
                                util.h.xy.bf.mc mcVar2 = util.h.xy.bf.mc.f939;
                                util.h.xy.bi.ra raVar2 = util.h.xy.bi.ra.this;
                                mcVar2.m25441(raVar2.mo25489(raVar2.getHighSpeedVideoFpsRanges, bArr));
                                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 65) % 128;
                            } catch (java.lang.Throwable th) {
                                util.h.xy.bi.ra.getHighSpeedVideoFpsRangesFor();
                                th.getMessage();
                                util.h.xy.bf.ma.m25415(util.h.xy.bf.c.f934.m25413(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.INTERNAL_ERROR, util.h.xy.al.ra.f379);
                            }
                        }
                    });
                }
            }
            int i2 = getHighSpeedVideoFpsRangesFor;
            int i3 = (i2 ^ 101) + ((i2 & 101) << 1);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i4 = getHighSpeedVideoSizes + 119;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            util.h.xy.bf.ma.m25415(util.h.xy.bf.c.f934.m25413(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED, util.h.xy.al.ra.f689);
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.bf.ma.m25415(util.h.xy.bf.c.f934.m25413(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED, util.h.xy.al.ra.f689);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 41) % 128;
        int i5 = getHighSpeedVideoFpsRangesFor + 99;
        getHighSpeedVideoSizes = i5 % 128;
        if (i5 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // java.util.Observer
    public void update(java.util.Observable observable, java.lang.Object obj) {
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~(((-1074884609) ^ identityHashCode) | (identityHashCode & (-1074884609)));
        int i2 = ((i ^ (-1339947383)) | (i & (-1339947383))) * 449;
        int i3 = (i2 & (-2075357866)) + (i2 | (-2075357866));
        int i4 = (~identityHashCode) | (-1133639747);
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i5 = ((~(((-1589922743) ^ identityHashCode2) | (identityHashCode2 & (-1589922743)))) | (-892468161)) * (-948);
        int i6 = (i5 & (-2050596242)) + (i5 | (-2050596242));
        int i7 = -(-((~((~identityHashCode2) | (-335563649))) * (-948)));
        if ((((i3 ^ 1022860581) + ((1022860581 & i3) << 1)) - (~(((~((i4 ^ (-1281192245)) | (i4 & (-1281192245)))) | (-1339947383)) * 449))) - 1 <= (i6 ^ i7) + ((i7 & i6) << 1) + 573518932) {
            throw null;
        }
    }
}
