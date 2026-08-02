package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class MpqrProcessorImpl implements com.visa.cbp.mpqr.facade.MpqrProcessor {
    private com.visa.cbp.ChannelInfo mpqrManager;
    private com.visa.cbp.mpqr.facade.MerchantQR[] mqrArray;

    public MpqrProcessorImpl() {
        this.mpqrManager = null;
        this.mpqrManager = com.visa.cbp.ChannelInfo.ReplenishAckRequest();
    }

    @Override // com.visa.cbp.mpqr.facade.MpqrProcessor
    public com.visa.cbp.mpqr.facade.MerchantQR[] decodeMpqrCode(java.lang.String str) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException {
        return this.mpqrManager.ConfirmReplenishRequest(str);
    }

    @Override // com.visa.cbp.mpqr.facade.MpqrProcessor
    public com.visa.cbp.mpqr.facade.TokenPaymentRequest constructTokenPaymentRequest(com.visa.cbp.mpqr.facade.MerchantQR[] merchantQRArr) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException {
        return this.mpqrManager.ReplenishAckRequest(merchantQRArr);
    }

    @Override // com.visa.cbp.mpqr.facade.MpqrProcessor
    public com.visa.cbp.mpqr.facade.MpqrAmounts calculateAmountAndTip(java.lang.String str, java.lang.String str2, java.lang.String str3) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException {
        return this.mpqrManager.values(str, str2, str3);
    }

    @Override // com.visa.cbp.mpqr.facade.MpqrProcessor
    public java.lang.String findMerchantTagValue(com.visa.cbp.mpqr.facade.MerchantQR[] merchantQRArr, java.lang.String str) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException {
        return this.mpqrManager.values(merchantQRArr, str);
    }
}
