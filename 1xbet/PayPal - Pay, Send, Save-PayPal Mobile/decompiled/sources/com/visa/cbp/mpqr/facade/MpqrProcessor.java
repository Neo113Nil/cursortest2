package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public interface MpqrProcessor {
    com.visa.cbp.mpqr.facade.MpqrAmounts calculateAmountAndTip(java.lang.String str, java.lang.String str2, java.lang.String str3) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException;

    com.visa.cbp.mpqr.facade.TokenPaymentRequest constructTokenPaymentRequest(com.visa.cbp.mpqr.facade.MerchantQR[] merchantQRArr) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException;

    com.visa.cbp.mpqr.facade.MerchantQR[] decodeMpqrCode(java.lang.String str) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException;

    java.lang.String findMerchantTagValue(com.visa.cbp.mpqr.facade.MerchantQR[] merchantQRArr, java.lang.String str) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException;
}
