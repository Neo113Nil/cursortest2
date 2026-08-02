package com.payair.hce;

/* loaded from: classes4.dex */
public class setOnDragListener implements com.payair.hce.checkCallingOrSelfUriPermissions, java.io.Serializable {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int writeReplace;
    private byte DigitizedCardProfile;
    private byte valueOf;
    private byte[] values;

    public setOnDragListener(com.payair.hce.checkCallingOrSelfUriPermissions checkcallingorselfuripermissions) {
        this.DigitizedCardProfile = checkcallingorselfuripermissions.getRecordNumber();
        this.valueOf = checkcallingorselfuripermissions.getSfi();
        this.values = checkcallingorselfuripermissions.getRecordValue();
    }

    @Override // com.payair.hce.checkCallingOrSelfUriPermissions
    public byte getRecordNumber() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 65;
        int i3 = i | 65;
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        writeReplace = i4;
        byte b = this.DigitizedCardProfile;
        int i5 = (i4 & (-94)) | ((~i4) & 93);
        int i6 = (i4 & 93) << 1;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        AlternateContactlessPaymentDataJson = i7 % 128;
        if (i7 % 2 != 0) {
            return b;
        }
        throw null;
    }

    @Override // com.payair.hce.checkCallingOrSelfUriPermissions
    public byte getSfi() {
        int i = AlternateContactlessPaymentDataJson + 121;
        writeReplace = i % 128;
        byte b = this.valueOf;
        if (i % 2 == 0) {
            return b;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.checkCallingOrSelfUriPermissions
    public byte[] getRecordValue() {
        int i = writeReplace + 81;
        AlternateContactlessPaymentDataJson = i % 128;
        byte[] bArr = this.values;
        if (i % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }
}
