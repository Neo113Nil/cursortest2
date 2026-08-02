package util.h.xy.bq;

/* loaded from: classes18.dex */
public abstract class a extends util.h.xy.bq.b {
    private static final java.lang.String Camera2StreamConfigurationMap = "util.h.xy.bq.a";
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    protected static long f986 = 0;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static long f987 = 60000;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected static com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData f988;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected static com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData f989;
    private android.os.CountDownTimer getHighSpeedVideoFpsRanges;
    private java.util.Timer getHighSpeedVideoSizes;
    private util.h.xy.bw.mb getHighSpeedVideoSizesFor;
    private com.gemalto.mfs.mwsdk.payment.CVMResetTimeoutListener getOutputMinFrameDuration;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected com.gemalto.mfs.mwsdk.payment.CHVerificationMethod f990;

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected boolean f991;

    abstract java.lang.Object Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod);

    /* renamed from: ˊ, reason: contains not printable characters */
    public abstract void mo25547();

    static /* synthetic */ android.os.CountDownTimer getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bq.a aVar) {
        int i = (getHighSpeedVideoFpsRangesFor + 85) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        android.os.CountDownTimer countDownTimer = aVar.getHighSpeedVideoFpsRanges;
        int i2 = ((i | 19) << 1) - (i ^ 19);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return countDownTimer;
        }
        throw null;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.payment.CVMResetTimeoutListener getHighSpeedVideoFpsRangesFor(util.h.xy.bq.a aVar) {
        int i = (getHighSpeedVideoFpsRangesFor + 33) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        com.gemalto.mfs.mwsdk.payment.CVMResetTimeoutListener cVMResetTimeoutListener = aVar.getOutputMinFrameDuration;
        int i2 = (i ^ 51) + ((i & 51) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return cVMResetTimeoutListener;
        }
        throw null;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + 63) % 128;
        java.lang.String str = Camera2StreamConfigurationMap;
        int i2 = i + 69;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (((i | 119) << 1) - (i ^ 119)) % 128;
    }

    public a(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, util.h.xy.bw.mb mbVar, boolean z) {
        super(paymentServiceListener, z);
        this.f991 = false;
        this.getHighSpeedVideoSizesFor = mbVar;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public void setCVMResetTimeoutListener(com.gemalto.mfs.mwsdk.payment.CVMResetTimeoutListener cVMResetTimeoutListener) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f537);
        sb.append(util.h.xy.al.ra.f762);
        util.h.xy.am.ma.m25027(str, sb.toString());
        this.getOutputMinFrameDuration = cVMResetTimeoutListener;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i & 121) + (i | 121)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public java.lang.Object getCHVerifier(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f537);
        sb.append(util.h.xy.al.ra.f808);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i & 81) + (i | 81)) % 128;
        java.lang.Object Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(cHVerificationMethod);
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i2 + 93) % 128;
        int i3 = i2 + 111;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public void setData(java.lang.String str, byte[] bArr) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f537);
        sb.append(util.h.xy.al.ra.f636);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        util.h.xy.f.b.f2201.m26761(str, bArr);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public java.util.Map<java.lang.String, java.lang.String> getAdditionalData() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f537);
        sb.append(util.h.xy.al.ra.f815);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.util.Map<java.lang.String, java.lang.String> highSpeedVideoSizes = getHighSpeedVideoSizes();
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 47) + ((i & 47) << 1)) % 128;
        return highSpeedVideoSizes;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    @util.h.xy.a.a
    public com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData getQRCodeData() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f537);
        sb.append(util.h.xy.al.ra.f787);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 89) + ((i & 89) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData m25530 = ((util.h.xy.bo.mb) f989).m25530();
            f989.wipe();
            f989 = null;
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 25) % 128;
            return m25530;
        }
        ((util.h.xy.bo.mb) f989).m25530();
        f989.wipe();
        f989 = null;
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData getRemotePaymentData() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f537);
        sb.append(util.h.xy.al.ra.f791);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i & 83) + (i | 83)) % 128;
        com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData remotePaymentOutputData = f988;
        util.h.xy.ar.b.m25098(remotePaymentOutputData.getDpan().getBytes(java.nio.charset.StandardCharsets.UTF_8));
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (((i2 | 97) << 1) - (i2 ^ 97)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        getHighSpeedVideoFpsRangesFor = (((i3 | 119) << 1) - (i3 ^ 119)) % 128;
        return remotePaymentOutputData;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected util.h.xy.bw.mb m25549() {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
        return this.getHighSpeedVideoSizesFor;
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    protected void m25553(com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData qRCodeData) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + 43) % 128;
        f989 = qRCodeData;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 105) + ((i & 105) << 1)) % 128;
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    protected void m25554(com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData remotePaymentOutputData) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 85;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            f988 = remotePaymentOutputData;
        } else {
            f988 = remotePaymentOutputData;
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected void m25551() {
        int i;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> m26209 = new util.h.xy.d.md(m25559().m26180()).m26209();
        if (m26209.isSuccessful()) {
            int i2 = getHighSpeedVideoFpsRangesFor + 95;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                m26209.getResult();
                throw null;
            }
            if (m26209.getResult() != null) {
                i = m26209.getResult().getCVMResetTimeout();
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
                f987 = i * 1000;
                int i3 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = (((i3 | 65) << 1) - (i3 ^ 65)) % 128;
            }
        }
        i = 45;
        f987 = i * 1000;
        int i32 = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (((i32 | 65) << 1) - (i32 ^ 65)) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected void m25548() {
        int i;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> m26209 = new util.h.xy.d.md(m25559().m26180()).m26209();
        if (m26209.isSuccessful()) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            int i3 = ((i2 | 59) << 1) - (i2 ^ 59);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                m26209.getResult();
                throw null;
            }
            if (m26209.getResult() != null) {
                i = m26209.getResult().getDualTapResetTimeout();
                int i4 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = (((i4 | 63) << 1) - (i4 ^ 63)) % 128;
                f986 = i * 1000;
                getHighSpeedVideoSizesFor();
            }
        }
        i = 30;
        f986 = i * 1000;
        getHighSpeedVideoSizesFor();
    }

    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes() {
        java.util.Map<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        try {
            util.h.xy.k.ra raVar = util.h.xy.k.ra.f2243;
            hashMap = util.h.xy.k.ra.m26932(m25559().m26180());
        } catch (org.json.JSONException unused) {
        }
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 125) + (i | 125);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return hashMap;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.bq.b
    /* renamed from: ˊ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25546(boolean z, boolean z2) {
        com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25546;
        synchronized (this) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = ((i | 5) << 1) - (i ^ 5);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (!z2) {
                this.f991 = false;
                m25552();
                m25555();
                int i3 = getHighResolutionOutputSizeshNQ4ISI;
                int i4 = (i3 & 73) + (i3 | 73);
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                int i5 = i4 % 2;
            }
            mo25546 = super.mo25546(z, z2);
            int i6 = getHighSpeedVideoFpsRangesFor + 119;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return mo25546;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25552() {
        synchronized (this) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = (i & 95) + (i | 95);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                android.os.CountDownTimer countDownTimer = this.getHighSpeedVideoFpsRanges;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                    this.getOutputMinFrameDuration = null;
                    int i3 = getHighSpeedVideoFpsRangesFor;
                    int i4 = (i3 & 27) + (i3 | 27);
                    getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                    int i5 = i4 % 2;
                }
                int i6 = getHighSpeedVideoFpsRangesFor;
                int i7 = (i6 ^ 101) + ((i6 & 101) << 1);
                getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
                if (i7 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
            } else {
                throw null;
            }
        }
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m25555() {
        synchronized (this) {
            java.util.Timer timer = this.getHighSpeedVideoSizes;
            if (timer != null) {
                int i = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = (((i | 105) << 1) - (i ^ 105)) % 128;
                timer.cancel();
                this.getHighSpeedVideoSizes = null;
            }
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected void m25550(final com.gemalto.mfs.mwsdk.payment.engine.PaymentService paymentService, final long j) {
        this.getHighSpeedVideoFpsRanges = new android.os.CountDownTimer(j) { // from class: util.h.xy.bq.a.4
            private static int getHighSpeedVideoFpsRanges = 1;
            private static int getHighSpeedVideoSizes;

            @Override // android.os.CountDownTimer
            public final void onTick(long j2) {
                int i = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRanges = ((i ^ 39) + ((i & 39) << 1)) % 128;
                util.h.xy.bq.a.getHighSpeedVideoFpsRangesFor();
                if (util.h.xy.bq.a.getHighSpeedVideoFpsRangesFor(util.h.xy.bq.a.this) != null) {
                    java.lang.String str = util.h.xy.al.ra.f281;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(util.h.xy.al.ra.f537);
                    sb.append(util.h.xy.al.ra.f285);
                    util.h.xy.am.ma.m25027(str, sb.toString());
                    util.h.xy.bq.a.getHighSpeedVideoFpsRangesFor(util.h.xy.bq.a.this).onCredentialsTimeoutCountDown((int) (j2 / 1000));
                    int i2 = getHighSpeedVideoSizes + 113;
                    getHighSpeedVideoFpsRanges = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 3 / 2;
                    }
                }
                int i4 = getHighSpeedVideoFpsRanges;
                int i5 = (i4 & 9) + (i4 | 9);
                getHighSpeedVideoSizes = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                int i = getHighSpeedVideoFpsRanges;
                int i2 = ((i | 49) << 1) - (i ^ 49);
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 == 0) {
                    if (util.h.xy.bq.a.this.f991) {
                        util.h.xy.bf.mb.f938.m25426().m25400();
                        util.h.xy.bq.a.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bq.a.this).cancel();
                        util.h.xy.bq.a.getHighSpeedVideoFpsRangesFor();
                        if (util.h.xy.bq.a.getHighSpeedVideoFpsRangesFor(util.h.xy.bq.a.this) != null) {
                            java.lang.String str = util.h.xy.al.ra.f281;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(util.h.xy.al.ra.f537);
                            sb.append(util.h.xy.al.ra.f820);
                            util.h.xy.am.ma.m25027(str, sb.toString());
                            util.h.xy.bq.a.getHighSpeedVideoFpsRangesFor(util.h.xy.bq.a.this).onCredentialsTimeout(paymentService, util.h.xy.bq.a.this.f990, j);
                            int i3 = getHighSpeedVideoSizes;
                            getHighSpeedVideoFpsRanges = (((i3 | 21) << 1) - (i3 ^ 21)) % 128;
                        }
                    } else {
                        util.h.xy.bq.a.getHighSpeedVideoFpsRangesFor();
                    }
                    util.h.xy.bf.mb.f938.m25426().m25394(false);
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 91) % 128;
                    return;
                }
                boolean z = util.h.xy.bq.a.this.f991;
                throw null;
            }
        }.start();
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (((i | 61) << 1) - (i ^ 61)) % 128;
    }

    private void getHighSpeedVideoSizesFor() {
        m25555();
        java.util.TimerTask timerTask = new java.util.TimerTask() { // from class: util.h.xy.bq.a.5
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoFpsRangesFor;

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i = ~((identityHashCode ^ (-2076510468)) | (identityHashCode & (-2076510468)));
                int i2 = (((-2145733484) ^ i) | (i & (-2145733484))) * (-196);
                int i3 = (i2 ^ (-1768919514)) + ((i2 & (-1768919514)) << 1);
                int i4 = (i3 & 810169584) + (810169584 | i3);
                int i5 = (i | 69223016) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE;
                int identityHashCode2 = java.lang.System.identityHashCode(this);
                int i6 = ~identityHashCode2;
                int i7 = ~((i6 ^ (-1159131568)) | (i6 & (-1159131568)));
                int i8 = (((i7 ^ 1616265231) | (i7 & 1616265231)) * (-90)) - 1180766172;
                int i9 = ~((identityHashCode2 ^ (-1159131568)) | (identityHashCode2 & (-1159131568)));
                int i10 = -(-(((i9 ^ (-1700196784)) | (i9 & (-1700196784))) * (-45)));
                int i11 = ((i8 | i10) << 1) - (i8 ^ i10);
                int i12 = ~(identityHashCode2 | (-1616265232));
                int i13 = (i12 ^ (-1159131568)) | (i12 & (-1159131568));
                int i14 = ~((i6 ^ 1616265231) | (i6 & 1616265231));
                int i15 = ((i13 ^ i14) | (i13 & i14)) * 45;
                try {
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    util.h.xy.bq.a.getHighSpeedVideoFpsRangesFor();
                    e.getMessage();
                }
                if ((i4 & i5) + (i5 | i4) <= (i11 ^ i15) + ((i15 & i11) << 1)) {
                    util.h.xy.bq.a.this.m25555();
                    util.h.xy.bq.a.getHighSpeedVideoFpsRangesFor();
                    util.h.xy.v.b.f2439.m27618(new byte[]{0});
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.bq.a.this.m25555();
                util.h.xy.bq.a.getHighSpeedVideoFpsRangesFor();
                util.h.xy.v.b.f2439.m27618(new byte[]{0});
                int i16 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = ((i16 ^ 101) + ((i16 & 101) << 1)) % 128;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 67) % 128;
            }
        };
        java.util.Timer timer = new java.util.Timer();
        this.getHighSpeedVideoSizes = timer;
        timer.schedule(timerTask, f986);
        int i = getHighSpeedVideoFpsRangesFor + 91;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public boolean setPPSEFci(byte[] bArr) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f537);
        sb.append(util.h.xy.al.ra.f802);
        util.h.xy.am.ma.m25027(str, sb.toString());
        boolean z = false;
        try {
            if (util.h.xy.v.b.f2439.m27573(bArr)[0] == 1) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 25) % 128;
                z = true;
            }
            int i = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = (((i | 75) << 1) - (i ^ 75)) % 128;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
        }
        int i2 = getHighSpeedVideoFpsRangesFor + 39;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
