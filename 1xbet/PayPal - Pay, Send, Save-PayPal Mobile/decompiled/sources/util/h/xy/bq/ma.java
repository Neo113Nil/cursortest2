package util.h.xy.bq;

/* loaded from: classes18.dex */
public class ma extends util.h.xy.bq.b {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;

    public ma(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, boolean z) {
        super(paymentServiceListener, z);
    }

    @Override // util.h.xy.bq.b
    /* renamed from: ˎ */
    public boolean mo25562(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, util.h.xy.d.md mdVar) {
        int i = getHighSpeedVideoFpsRangesFor + 53;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            this.f993 = mdVar;
            boolean mo25562 = super.mo25562(paymentType, mdVar);
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            int i3 = (i2 ^ 47) + ((i2 & 47) << 1);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                return mo25562;
            }
            throw null;
        }
        this.f993 = mdVar;
        super.mo25562(paymentType, mdVar);
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public java.lang.Object getCHVerifier(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod) {
        throw new java.lang.RuntimeException(util.h.xy.al.ra.f278);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public void setCVMResetTimeoutListener(com.gemalto.mfs.mwsdk.payment.CVMResetTimeoutListener cVMResetTimeoutListener) {
        throw new java.lang.RuntimeException(util.h.xy.al.ra.f278);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public void setData(java.lang.String str, byte[] bArr) {
        throw new java.lang.RuntimeException(util.h.xy.al.ra.f278);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public java.util.Map<java.lang.String, java.lang.String> getAdditionalData() {
        throw new java.lang.RuntimeException(util.h.xy.al.ra.f278);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public boolean setPPSEFci(byte[] bArr) {
        throw new java.lang.RuntimeException(util.h.xy.al.ra.f278);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData getRemotePaymentData() {
        int i = getHighSpeedVideoFpsRangesFor + 73;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.PaymentService
    public com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData getQRCodeData() {
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~((identityHashCode ^ (-1832816460)) | (identityHashCode & (-1832816460)));
        int i2 = ((i ^ 3464544) | (i & 3464544)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
        int i3 = (i2 ^ (-371705217)) + ((i2 & (-371705217)) << 1);
        int i4 = ~((~identityHashCode) | (-1832816460));
        int i5 = -(-(((i4 ^ 3444032) | (i4 & 3444032)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i6 = ~identityHashCode2;
        int i7 = ((~((i6 ^ 6449876) | (i6 & 6449876))) | (-339840208)) * (-235);
        int i8 = ((i7 | 1621848308) << 1) - (i7 ^ 1621848308);
        int i9 = ~((identityHashCode2 ^ 6449876) | (6449876 & identityHashCode2));
        int i10 = ((i9 ^ (-339840208)) | (i9 & (-339840208))) * (-470);
        int i11 = (i8 & i10) + (i10 | i8);
        int i12 = ~((identityHashCode2 ^ (-335643660)) | (identityHashCode2 & (-335643660)));
        int i13 = -(-(((i12 ^ 2253328) | (i12 & 2253328)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE));
        if ((i3 & i5) + (i5 | i3) <= (i11 ^ i13) + ((i13 & i11) << 1)) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }
}
