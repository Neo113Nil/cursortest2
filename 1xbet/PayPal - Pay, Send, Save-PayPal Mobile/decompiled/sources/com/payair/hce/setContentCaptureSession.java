package com.payair.hce;

/* loaded from: classes4.dex */
public class setContentCaptureSession implements com.payair.hce.createDisplayContext, java.io.Serializable {
    private static int RecordsJson = 0;
    private static int getAid = 1;
    private byte[] AlternateContactlessPaymentDataJson;
    private byte[] DigitizedCardProfile;
    private byte[] valueOf;
    private byte[] values;
    private byte[] writeReplace;

    public setContentCaptureSession(com.payair.hce.createDisplayContext createdisplaycontext) {
        this.valueOf = createdisplaycontext.getP();
        this.writeReplace = createdisplaycontext.getQ();
        this.values = createdisplaycontext.getU();
        this.AlternateContactlessPaymentDataJson = createdisplaycontext.getDp();
        this.DigitizedCardProfile = createdisplaycontext.getDq();
    }

    @Override // com.payair.hce.createDisplayContext
    public byte[] getP() {
        int i = (-2) - (~(RecordsJson + 2));
        getAid = i % 128;
        if (i % 2 != 0) {
            return this.valueOf;
        }
        throw null;
    }

    @Override // com.payair.hce.createDisplayContext
    public byte[] getQ() {
        int i = RecordsJson;
        int i2 = (i | 107) << 1;
        int i3 = -(i ^ 107);
        int i4 = (i2 & i3) + (i2 | i3);
        getAid = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        byte[] bArr = this.writeReplace;
        int i5 = i & 65;
        int i6 = ((i | 65) & (~i5)) + (i5 << 1);
        getAid = i6 % 128;
        if (i6 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.createDisplayContext
    public byte[] getDp() {
        int i = RecordsJson;
        int i2 = ~i;
        int i3 = (i & (-6)) | (i2 & 5);
        int i4 = (i & 5) << 1;
        getAid = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        int i5 = (i2 & 31) | (i & (-32));
        int i6 = -(-((i & 31) << 1));
        getAid = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
        return bArr;
    }

    @Override // com.payair.hce.createDisplayContext
    public byte[] getDq() {
        int i = RecordsJson;
        int i2 = i & 11;
        int i3 = (i2 + ((i ^ 11) | i2)) % 128;
        getAid = i3;
        byte[] bArr = this.DigitizedCardProfile;
        int i4 = ((i3 ^ 49) | (i3 & 49)) << 1;
        int i5 = -((i3 & (-50)) | ((~i3) & 49));
        int i6 = (i4 & i5) + (i5 | i4);
        RecordsJson = i6 % 128;
        if (i6 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @Override // com.payair.hce.createDisplayContext
    public byte[] getU() {
        int i = getAid;
        RecordsJson = ((((i ^ 53) | (i & 53)) << 1) - ((i & (-54)) | ((~i) & 53))) % 128;
        byte[] bArr = this.values;
        int i2 = i + 94;
        int i3 = (~i2) + (i2 << 1);
        RecordsJson = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }
}
