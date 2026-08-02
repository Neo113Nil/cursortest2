package util.h.xy.bi;

/* loaded from: classes5.dex */
public class rb extends util.h.xy.bi.ra {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor = 74;
    private static final java.lang.String getHighSpeedVideoSizes = "rb";

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        java.lang.String str = getHighSpeedVideoSizes;
        int i2 = i + 47;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // util.h.xy.bf.b
    /* renamed from: ˋ */
    public java.lang.String mo25411() {
        int i = getHighSpeedVideoFpsRangesFor + 51;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return getHighSpeedVideoSizes;
        }
        throw new java.lang.ArithmeticException();
    }

    rb(util.h.xy.g.b bVar, util.h.xy.bf.a aVar) {
        super(bVar, aVar);
    }

    @Override // util.h.xy.bi.ra
    /* renamed from: ˎ */
    protected byte[] mo25490(final byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor + 3;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            if (this.f967 == null) {
                return this.f963;
            }
            this.f967.m26879();
            byte[] m25076 = util.h.xy.ar.b.m25076(util.h.xy.al.ra.f423);
            util.h.xy.ar.b.m25074(m25076);
            this.f942.m25403(true);
            this.f942.m25409();
            util.h.xy.bf.ma.m25424(util.h.xy.bf.c.f934.m25413());
            new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.bi.rb.4
                private static int Camera2StreamConfigurationMap = 1;
                private static int getHighSpeedVideoSizes;

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = Camera2StreamConfigurationMap + 95;
                    getHighSpeedVideoSizes = i2 % 128;
                    try {
                    } catch (java.lang.Throwable th) {
                        util.h.xy.bi.rb.getHighSpeedVideoFpsRanges();
                        th.getMessage();
                        util.h.xy.bf.ma.m25415(util.h.xy.bf.c.f934.m25413(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE, util.h.xy.al.ra.f379);
                    }
                    if (i2 % 2 == 0) {
                        util.h.xy.bi.rb.this.m25499(bArr);
                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 33) % 128;
                        int i3 = Camera2StreamConfigurationMap;
                        int i4 = (i3 ^ 45) + ((i3 & 45) << 1);
                        getHighSpeedVideoSizes = i4 % 128;
                        if (i4 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
                    util.h.xy.bi.rb.this.m25499(bArr);
                    throw new java.lang.NullPointerException();
                }
            }).start();
            int i2 = getHighSpeedVideoFpsRangesFor + 91;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                return m25076;
            }
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.g.ra raVar = this.f967;
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.bi.ra
    /* renamed from: ˏ */
    protected byte[] mo25491(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + 89) % 128;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 121) + ((i & 121) << 1)) % 128;
        return null;
    }

    @Override // util.h.xy.bi.ra
    /* renamed from: ᐝ */
    protected byte[] mo25492(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 59) + (i | 59)) % 128;
        int i2 = i + 103;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.bi.ra
    /* renamed from: ˋ */
    protected com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25489(byte[] bArr, byte[] bArr2) {
        int i = getHighSpeedVideoFpsRangesFor + 15;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            util.h.xy.bi.mb.f959.m25497(bArr, bArr2);
            throw new java.lang.ArithmeticException();
        }
        com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m25497 = util.h.xy.bi.mb.f959.m25497(bArr, bArr2);
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i2 ^ 25) + ((i2 & 25) << 1)) % 128;
        return m25497;
    }
}
