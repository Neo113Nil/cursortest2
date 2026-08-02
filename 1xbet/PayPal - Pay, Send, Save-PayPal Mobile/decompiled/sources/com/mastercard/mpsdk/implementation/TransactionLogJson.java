package com.mastercard.mpsdk.implementation;

/* loaded from: classes4.dex */
public class TransactionLogJson {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int valueOf = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "amount")
    private long mAmount;

    @com.payair.hce.setSelectionFromTop(valueOf = "cryptogramFormat")
    private byte mCryptogramFormat;

    @com.payair.hce.setSelectionFromTop(valueOf = "currencyCode")
    private int mCurrencyCode;

    @com.payair.hce.setSelectionFromTop(valueOf = "date")
    private long mDate;

    @com.payair.hce.setSelectionFromTop(valueOf = com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY)
    private java.lang.String mTokenUniqueReference;

    @com.payair.hce.setSelectionFromTop(valueOf = "transactionId")
    private java.lang.String mTransactionId;

    @com.payair.hce.setSelectionFromTop(valueOf = "unpredictableNumber")
    private java.lang.String mUnpredictableNumber;

    public TransactionLogJson() {
    }

    public TransactionLogJson(java.lang.String str, byte[] bArr, long j, long j2, int i, byte b, byte[] bArr2) {
        this.mTokenUniqueReference = str;
        if (bArr != null) {
            this.mUnpredictableNumber = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.payair.hce.startService.writeReplace(bArr)).writeReplace();
        }
        this.mDate = j;
        this.mAmount = j2;
        this.mCurrencyCode = i;
        this.mCryptogramFormat = b;
        this.mTransactionId = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.payair.hce.startService.writeReplace(bArr2)).writeReplace();
    }

    public java.lang.String getTokenUniqueReference() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i ^ 101;
        int i3 = -(-((i & 101) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return this.mTokenUniqueReference;
        }
        throw null;
    }

    public java.lang.String getUnpredictableNumber() {
        int i = valueOf;
        int i2 = ((i ^ 77) | (i & 77)) << 1;
        int i3 = -((i & (-78)) | ((~i) & 77));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        AlternateContactlessPaymentDataJson = i4;
        java.lang.String str = this.mUnpredictableNumber;
        int i5 = i4 & 73;
        valueOf = (i5 + ((i4 ^ 73) | i5)) % 128;
        return str;
    }

    public byte getCryptogramFormat() {
        int i = valueOf;
        int i2 = i ^ 93;
        int i3 = -(-((i & 93) << 1));
        AlternateContactlessPaymentDataJson = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        byte b = this.mCryptogramFormat;
        int i4 = i & 29;
        int i5 = -(-((i ^ 29) | i4));
        AlternateContactlessPaymentDataJson = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
        return b;
    }

    public java.lang.String getTransactionId() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 3;
        int i3 = -(-((i ^ 3) | i2));
        valueOf = ((i2 & i3) + (i2 | i3)) % 128;
        java.lang.String str = this.mTransactionId;
        int i4 = i + 63;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public long getDate() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i | 91) << 1) - (i ^ 91);
        valueOf = i2 % 128;
        long j = this.mDate;
        if (i2 % 2 != 0) {
            return j;
        }
        throw new java.lang.ArithmeticException();
    }

    public long getAmount() {
        int i = valueOf;
        int i2 = (i | 55) << 1;
        int i3 = -((i & (-56)) | ((~i) & 55));
        int i4 = (i2 & i3) + (i3 | i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 == 0) {
            return this.mAmount;
        }
        throw null;
    }

    public int getCurrencyCode() {
        int i = valueOf;
        int i2 = i & 71;
        int i3 = (~i2) & (i | 71);
        int i4 = -(-(i2 << 1));
        AlternateContactlessPaymentDataJson = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        int i5 = this.mCurrencyCode;
        AlternateContactlessPaymentDataJson = ((-2) - (~(((i | 2) << 1) - (i ^ 2)))) % 128;
        return i5;
    }

    public void setTokenUniqueReference(java.lang.String str) {
        int i = valueOf;
        int i2 = i & 101;
        int i3 = (i | 101) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 == 0) {
            this.mTokenUniqueReference = str;
        } else {
            this.mTokenUniqueReference = str;
            throw null;
        }
    }

    public void setUnpredictableNumber(java.lang.String str) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i & (-126)) | ((~i) & 125);
        int i3 = (i & 125) << 1;
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        valueOf = i4;
        this.mUnpredictableNumber = str;
        int i5 = i4 & 35;
        AlternateContactlessPaymentDataJson = (((((i4 ^ 35) | i5) << 1) - (~(-((~i5) & (i4 | 35))))) - 1) % 128;
    }

    public void setCryptogramFormat(byte b) {
        int i = valueOf;
        int i2 = (i | 63) << 1;
        int i3 = -(i ^ 63);
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 == 0) {
            this.mCryptogramFormat = b;
        } else {
            this.mCryptogramFormat = b;
            throw null;
        }
    }

    public void setTransactionId(java.lang.String str) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i ^ 119) | (i & 119)) << 1;
        int i3 = -((i & (-120)) | ((~i) & 119));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            this.mTransactionId = str;
        } else {
            this.mTransactionId = str;
            throw null;
        }
    }

    public void setDate(long j) {
        int i = valueOf;
        int i2 = i & 9;
        int i3 = (~i2) & (i | 9);
        int i4 = -(-(i2 << 1));
        AlternateContactlessPaymentDataJson = ((i3 & i4) + (i4 | i3)) % 128;
        this.mDate = j;
        int i5 = ((i ^ 92) + ((i & 92) << 1)) - 1;
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void setAmount(long j) {
        int i = AlternateContactlessPaymentDataJson;
        valueOf = ((i ^ 79) + ((i & 79) << 1)) % 128;
        this.mAmount = j;
        int i2 = (((i & (-114)) | ((~i) & 113)) - (~((i & 113) << 1))) - 1;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void setCurrencyCode(int i) {
        int i2 = valueOf;
        int i3 = (i2 | 47) << 1;
        int i4 = ~i2;
        int i5 = -((i2 & (-48)) | (i4 & 47));
        int i6 = (i3 & i5) + (i3 | i5);
        AlternateContactlessPaymentDataJson = i6 % 128;
        if (i6 % 2 == 0) {
            this.mCurrencyCode = i;
            int i7 = (i2 & (-52)) | (i4 & 51);
            int i8 = -(-((i2 & 51) << 1));
            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
            AlternateContactlessPaymentDataJson = i9 % 128;
            if (i9 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.mCurrencyCode = i;
        throw null;
    }
}
