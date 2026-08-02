package com.payair.hce;

/* loaded from: classes4.dex */
public class setOnKeyListener implements com.payair.hce.checkCallingUriPermissions, java.io.Serializable {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int valueOf = 1;
    private byte[] DigitizedCardProfile;
    private byte[] values;

    public setOnKeyListener(com.payair.hce.checkCallingUriPermissions checkcallinguripermissions) {
        this.values = checkcallinguripermissions.getAdditionalCheckTable();
        this.DigitizedCardProfile = checkcallinguripermissions.getCrmCountryCode();
    }

    @Override // com.payair.hce.checkCallingUriPermissions
    public byte[] getAdditionalCheckTable() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (-2) - (~(i + 74));
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte[] bArr = this.values;
        valueOf = (i + 99) % 128;
        return bArr;
    }

    @Override // com.payair.hce.checkCallingUriPermissions
    public byte[] getCrmCountryCode() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i & (-12)) | ((~i) & 11);
        int i3 = -(-((i & 11) << 1));
        valueOf = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        byte[] bArr = this.DigitizedCardProfile;
        int i4 = i & 109;
        int i5 = ((i ^ 109) | i4) << 1;
        int i6 = -((i | 109) & (~i4));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        valueOf = i7 % 128;
        if (i7 % 2 != 0) {
            return bArr;
        }
        throw null;
    }
}
