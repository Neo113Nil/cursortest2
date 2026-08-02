package util.h.xy.bf;

/* loaded from: classes5.dex */
public abstract class rb implements util.h.xy.bf.b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 61) % 128;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "util.h.xy.bf.rb";

    /* renamed from: ʾ, reason: contains not printable characters */
    protected util.h.xy.bj.a f941;

    /* renamed from: ˈ, reason: contains not printable characters */
    protected util.h.xy.bf.a f942;

    /* renamed from: ˌ, reason: contains not printable characters */
    protected byte[] f943;

    static /* synthetic */ java.lang.String Camera2StreamConfigurationMap() {
        int i = Camera2StreamConfigurationMap + 99;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i2 + 99) % 128;
        return str;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.bf.rb rbVar, com.gemalto.mfs.mwsdk.payment.engine.PaymentService paymentService) {
        int i;
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 21) % 128;
        synchronized (rbVar) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 45) % 128;
            rbVar.f942.m25403(false);
            rbVar.f942.m25400();
            util.h.xy.bf.mb.f938.m25426().m25394(false);
            if (paymentService != null) {
                int i2 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRanges = ((i2 & 117) + (i2 | 117)) % 128;
                rbVar.f942.m25390(true);
                util.h.xy.bf.ma.m25417(paymentService.getPaymentServiceListener(), util.h.xy.bf.mb.f938.m25430(100));
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 117) % 128;
            }
            int i3 = getHighSpeedVideoFpsRanges;
            int i4 = ((i3 | 15) << 1) - (i3 ^ 15);
            i = i4 % 128;
            Camera2StreamConfigurationMap = i;
            if (i4 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
        }
        int i5 = i + 111;
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public rb(util.h.xy.bf.a aVar) {
        this.f942 = aVar;
        this.f941 = new util.h.xy.bj.a(this.f942);
    }

    @Override // util.h.xy.bf.b
    @util.h.xy.a.a
    public byte[] G_(byte[] bArr, android.os.Bundle bundle) {
        synchronized (this) {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = (((i | 117) << 1) - (i ^ 117)) % 128;
            if (!this.f942.m25402()) {
                int i2 = getHighSpeedVideoFpsRanges;
                int i3 = (i2 & 71) + (i2 | 71);
                Camera2StreamConfigurationMap = i3 % 128;
                if (i3 % 2 == 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }
            int i4 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i4 & 115) + (i4 | 115)) % 128;
            byte[] bArr2 = util.h.xy.bf.b.f926;
            int i5 = Camera2StreamConfigurationMap + 119;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 != 0) {
                return bArr2;
            }
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.bf.b
    @util.h.xy.a.a
    public byte[] H_(byte[] bArr, android.os.Bundle bundle) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i & 83) + (i | 83)) % 128;
        this.f942.m25403(false);
        util.h.xy.ar.b.m25074(bArr);
        this.f942.m25402();
        com.gemalto.mfs.mwsdk.payment.PaymentBusinessService paymentBusinessService = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService();
        com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService = paymentBusinessService.getActivatedPaymentService();
        if (activatedPaymentService == null) {
            util.h.xy.bf.mb.f938.m25426().m25390(false);
            if (this.f942.m25397()) {
                this.f942.m25396(false);
                util.h.xy.bf.ma.m25418(util.h.xy.bf.c.f934.m25413());
                int i2 = Camera2StreamConfigurationMap + 13;
                getHighSpeedVideoFpsRanges = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 / 5;
                }
            }
            util.h.xy.bf.mc.m25435(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, util.h.xy.bf.c.f934.m25413());
            activatedPaymentService = paymentBusinessService.getActivatedPaymentService();
            if (activatedPaymentService == null) {
                byte[] bArr2 = util.h.xy.bf.b.f932;
                int i4 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRanges = ((i4 & 37) + (i4 | 37)) % 128;
                return bArr2;
            }
        }
        ((util.h.xy.bq.b) activatedPaymentService).m25564((com.gemalto.mfs.mwsdk.payment.engine.TransactionContext) null);
        byte[] bArr3 = new byte[0];
        int i5 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i5 ^ 45) + ((i5 & 45) << 1)) % 128;
        return bArr3;
    }

    @Override // util.h.xy.bf.b
    @util.h.xy.a.a
    public byte[] I_(byte[] bArr, android.os.Bundle bundle, byte[] bArr2) {
        byte[] bArr3;
        int i = getHighSpeedVideoFpsRanges + 57;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRangesFor(bArr, bundle, bArr2);
            throw null;
        }
        getHighSpeedVideoFpsRangesFor(bArr, bundle, bArr2);
        byte[] bArr4 = this.f943;
        if (bArr4 != null) {
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = (((i2 | 33) << 1) - (i2 ^ 33)) % 128;
            bArr2 = bArr4;
        } else if (this.f941.f970 != null) {
            int i3 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i3 & 3) + (i3 | 3)) % 128;
            this.f941.I_(bArr, bundle, bArr2);
        }
        int i4 = getHighSpeedVideoFpsRanges;
        int i5 = (i4 ^ 31) + ((i4 & 31) << 1);
        Camera2StreamConfigurationMap = i5 % 128;
        if (i5 % 2 != 0) {
            int length = bArr2.length % 1;
            bArr3 = new byte[length];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 1, length);
        } else {
            int length2 = bArr2.length - 1;
            bArr3 = new byte[length2];
            java.lang.System.arraycopy(bArr2, 1, bArr3, 0, length2);
        }
        int i6 = getHighSpeedVideoFpsRanges;
        int i7 = ((i6 & 69) + (i6 | 69)) % 128;
        Camera2StreamConfigurationMap = i7;
        getHighSpeedVideoFpsRanges = ((i7 ^ 95) + ((i7 & 95) << 1)) % 128;
        return bArr3;
    }

    private void getHighSpeedVideoFpsRangesFor(byte[] bArr, android.os.Bundle bundle, byte[] bArr2) {
        byte b;
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 81) + (i | 81);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 != 0 ? (b = bArr2[0]) == 1 : (b = bArr2[0]) == 1) {
            this.f942.m25407(true);
            final com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService().getActivatedPaymentService();
            android.os.AsyncTask.execute(new java.lang.Runnable() { // from class: util.h.xy.bf.rb.1
                private static int Camera2StreamConfigurationMap = 1;
                private static int getHighResolutionOutputSizeshNQ4ISI;

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = getHighResolutionOutputSizeshNQ4ISI;
                    Camera2StreamConfigurationMap = ((i4 & 17) + (i4 | 17)) % 128;
                    util.h.xy.bf.rb.Camera2StreamConfigurationMap(util.h.xy.bf.rb.this, activatedPaymentService);
                    util.h.xy.bf.rb.this.f942.m25407(false);
                    util.h.xy.bf.rb.Camera2StreamConfigurationMap();
                    util.h.xy.bf.rb.this.f942.m25402();
                }
            });
            if (activatedPaymentService instanceof util.h.xy.bq.a) {
                int i4 = Camera2StreamConfigurationMap;
                int i5 = (i4 ^ 119) + ((i4 & 119) << 1);
                getHighSpeedVideoFpsRanges = i5 % 128;
                if (i5 % 2 == 0) {
                    ((util.h.xy.bq.a) activatedPaymentService).m25555();
                    throw null;
                }
                ((util.h.xy.bq.a) activatedPaymentService).m25555();
            }
        } else if (b == 2) {
            Camera2StreamConfigurationMap = ((i3 & 43) + (i3 | 43)) % 128;
            this.f942.m25403(true);
            this.f942.m25409();
            final com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService2 = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService().getActivatedPaymentService();
            if (activatedPaymentService2 instanceof util.h.xy.bq.a) {
                util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bf.rb.5
                    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                    private static int getHighSpeedVideoFpsRanges = 1;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = getHighResolutionOutputSizeshNQ4ISI + 105;
                        getHighSpeedVideoFpsRanges = i6 % 128;
                        if (i6 % 2 != 0) {
                            ((util.h.xy.bq.a) activatedPaymentService2).mo25547();
                        } else {
                            ((util.h.xy.bq.a) activatedPaymentService2).mo25547();
                            throw new java.lang.ArithmeticException();
                        }
                    }
                });
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 79) % 128;
            }
        } else if (b == 3) {
            int i6 = (i & 25) + (i | 25);
            getHighSpeedVideoFpsRanges = i6 % 128;
            if (i6 % 2 == 0) {
                this.f941.G_(bArr, bundle);
                byte[] H_ = this.f941.H_(bArr, bundle);
                this.f943 = H_;
                this.f941.m25502(H_);
                throw null;
            }
            this.f941.G_(bArr, bundle);
            byte[] H_2 = this.f941.H_(bArr, bundle);
            this.f943 = H_2;
            this.f941.m25502(H_2);
        } else if (b == 5) {
            this.f942.m25398(true);
            int i7 = Camera2StreamConfigurationMap + 5;
            getHighSpeedVideoFpsRanges = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 3;
            }
        }
        int i9 = getHighSpeedVideoFpsRanges + 7;
        Camera2StreamConfigurationMap = i9 % 128;
        if (i9 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25449(int i) {
        com.gemalto.mfs.mwsdk.payment.engine.TransactionContext highSpeedVideoFpsRangesFor;
        synchronized (this) {
            int i2 = Camera2StreamConfigurationMap + 113;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 == 0) {
                getHighSpeedVideoFpsRangesFor(i);
                throw new java.lang.ArithmeticException();
            }
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i);
        }
        return highSpeedVideoFpsRangesFor;
    }

    private com.gemalto.mfs.mwsdk.payment.engine.TransactionContext getHighSpeedVideoFpsRangesFor(int i) {
        com.gemalto.mfs.mwsdk.payment.engine.TransactionContext transactionContext;
        int i2 = Camera2StreamConfigurationMap + 71;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.am.ma.m25031(util.h.xy.al.ra.f510, java.lang.Integer.toString(i));
            com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().getSDKServiceState();
            com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState sDKServiceState = com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZED;
            throw null;
        }
        util.h.xy.am.ma.m25031(util.h.xy.al.ra.f510, java.lang.Integer.toString(i));
        if (com.gemalto.mfs.mwsdk.sdkconfig.SDKController.getInstance().getSDKServiceState() != com.gemalto.mfs.mwsdk.sdkconfig.SDKServiceState.STATE_INITIALIZED) {
            util.h.xy.bf.ma.m25420(util.h.xy.bf.c.f934.m25413());
            return null;
        }
        this.f942.m25401(false);
        util.h.xy.bj.a aVar = this.f941;
        if (aVar != null) {
            int i3 = getHighSpeedVideoFpsRanges;
            int i4 = (i3 ^ 77) + ((i3 & 77) << 1);
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                aVar.m25501();
                throw new java.lang.ArithmeticException();
            }
            aVar.m25501();
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 65) % 128;
        }
        this.f942.m25408();
        this.f942.m25402();
        if (util.h.xy.bu.b.f1050.m25639() != null) {
            if (i != 0) {
                if (i == 1 && (this.f942.m25408() || this.f942.m25402())) {
                    return null;
                }
                com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m25641 = util.h.xy.bu.b.f1050.m25641(i);
                int i5 = Camera2StreamConfigurationMap;
                int i6 = (i5 ^ 55) + ((i5 & 55) << 1);
                getHighSpeedVideoFpsRanges = i6 % 128;
                int i7 = i6 % 2;
                return m25641;
            }
            if (!this.f942.m25408() && !this.f942.m25402()) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 55) % 128;
                if (com.gemalto.mfs.mwsdk.payment.PaymentSettings.isPURERefundTransactionCompletionWithoutGenAC() && this.f942.m25399()) {
                    this.f942.m25407(true);
                    final com.gemalto.mfs.mwsdk.payment.engine.PaymentService activatedPaymentService = com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService().getActivatedPaymentService();
                    android.os.AsyncTask.execute(new java.lang.Runnable() { // from class: util.h.xy.bf.rb.3
                        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                        private static int getHighSpeedVideoFpsRanges = 1;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i8 = getHighSpeedVideoFpsRanges;
                            getHighResolutionOutputSizeshNQ4ISI = (((i8 | 11) << 1) - (i8 ^ 11)) % 128;
                            util.h.xy.bf.rb.Camera2StreamConfigurationMap(util.h.xy.bf.rb.this, activatedPaymentService);
                            util.h.xy.bf.rb.this.f942.m25407(false);
                            util.h.xy.bf.rb.Camera2StreamConfigurationMap();
                            util.h.xy.bf.rb.this.f942.m25402();
                            int i9 = getHighResolutionOutputSizeshNQ4ISI;
                            getHighSpeedVideoFpsRanges = (((i9 | 79) << 1) - (i9 ^ 79)) % 128;
                        }
                    });
                    if (activatedPaymentService instanceof util.h.xy.bq.a) {
                        ((util.h.xy.bq.a) activatedPaymentService).m25555();
                    }
                    return null;
                }
                if (com.gemalto.mfs.mwsdk.payment.PaymentSettings.getDisableDeactivationOnPosDisconnect() == 0) {
                    int i8 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoFpsRanges = ((i8 & 45) + (i8 | 45)) % 128;
                    transactionContext = util.h.xy.bu.b.f1050.m25641(i);
                } else {
                    transactionContext = null;
                }
                int m25669 = util.h.xy.bu.rb.m25669();
                if (util.h.xy.bu.rb.m25670() > 0) {
                    int i9 = Camera2StreamConfigurationMap;
                    int i10 = ((i9 | 101) << 1) - (i9 ^ 101);
                    getHighSpeedVideoFpsRanges = i10 % 128;
                    if (i10 % 2 == 0) {
                        throw null;
                    }
                    if (m25669 > 0) {
                        util.h.xy.bf.ma.m25421(util.h.xy.bf.c.f934.m25413(), m25669);
                        int i11 = -(-(m25669 * 53));
                        int i12 = ~i;
                        int i13 = (i11 ^ 51) + ((i11 & 51) << 1) + ((~((m25669 ^ (-1)) | m25669)) * 52);
                        int i14 = ~m25669;
                        int i15 = ~(i14 | i12);
                        int i16 = ~((~i14) | i14);
                        int i17 = (i15 ^ i16) | (i15 & i16);
                        int i18 = ~i12;
                        int i19 = ~(i12 | i18);
                        int i20 = -(-(((i17 ^ i19) | (i19 & i17)) * (-52)));
                        int i21 = ((i13 | i20) << 1) - (i20 ^ i13);
                        int i22 = -(-((i14 | i18) * 52));
                        util.h.xy.bu.rb.m25671(((i21 | i22) << 1) - (i22 ^ i21));
                        util.h.xy.bf.mc.f939.m25439(true);
                        util.h.xy.bf.mc.f939.m25438(util.h.xy.bu.rb.m25672(), i);
                        return transactionContext;
                    }
                }
                util.h.xy.bf.ma.m25423(util.h.xy.bf.c.f934.m25413());
                return transactionContext;
            }
        }
        return null;
    }
}
