package util.h.xy.bu;

/* loaded from: classes18.dex */
public final class ma {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private com.gemalto.mfs.mwsdk.payment.engine.PaymentService Camera2StreamConfigurationMap;

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25664(com.gemalto.mfs.mwsdk.payment.engine.PaymentService paymentService) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i & 15) + (i | 15)) % 128;
        this.Camera2StreamConfigurationMap = paymentService;
        int i2 = ((i | 57) << 1) - (i ^ 57);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.engine.PaymentService m25665() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 119;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return this.Camera2StreamConfigurationMap;
        }
        throw null;
    }
}
