package com.mastercard.mpsdk.card.profile;

/* loaded from: classes4.dex */
public class SdkCoreCardRiskManagementDataImpl implements com.payair.hce.checkCallingUriPermissions, java.io.Serializable {
    private static final long serialVersionUID = 7508343498050720052L;
    private static int values = 0;
    private static int writeReplace = 1;
    private byte[] additionalCheckTable;
    private byte[] crmCountryCode;

    public SdkCoreCardRiskManagementDataImpl(com.payair.hce.checkCallingUriPermissions checkcallinguripermissions) {
        this.additionalCheckTable = checkcallinguripermissions.getAdditionalCheckTable();
        this.crmCountryCode = checkcallinguripermissions.getCrmCountryCode();
    }

    @Override // com.payair.hce.checkCallingUriPermissions
    public byte[] getAdditionalCheckTable() {
        int i = values;
        int i2 = i ^ 69;
        int i3 = ((i & 69) | i2) << 1;
        int i4 = -i2;
        int i5 = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        writeReplace = i5;
        byte[] bArr = this.additionalCheckTable;
        int i6 = i5 & 5;
        int i7 = (((i5 | 5) & (~i6)) - (~(i6 << 1))) - 1;
        values = i7 % 128;
        if (i7 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.checkCallingUriPermissions
    public byte[] getCrmCountryCode() {
        values = (writeReplace + 53) % 128;
        byte[] bArr = this.crmCountryCode;
        values = (((r0 & 73) - (~(-(-(r0 | 73))))) - 1) % 128;
        return bArr;
    }
}
