package com.payair.hce;

/* loaded from: classes4.dex */
public class setStateDescription implements com.payair.hce.enforceUriPermission, java.io.Serializable {
    private static int DigitizedCardProfile = 0;
    private static int writeReplace = 1;
    private com.payair.hce.revokeSelfPermissionOnKill AlternateContactlessPaymentDataJson;
    private com.payair.hce.checkCallingUriPermission valueOf;
    private com.payair.hce.checkCallingUriPermissions values;

    public setStateDescription(com.payair.hce.enforceUriPermission enforceuripermission) {
        this.values = new com.payair.hce.setOnKeyListener(enforceuripermission.getCardRiskManagementData());
        this.valueOf = new com.payair.hce.setAutofillId(enforceuripermission.getContactlessPaymentData());
        if (enforceuripermission.getRemotePaymentData() != null) {
            this.AlternateContactlessPaymentDataJson = new com.payair.hce.setRevealOnFocusHint(enforceuripermission.getRemotePaymentData());
        }
    }

    @Override // com.payair.hce.enforceUriPermission
    public com.payair.hce.checkCallingUriPermissions getCardRiskManagementData() {
        int i = DigitizedCardProfile;
        int i2 = ((i | 22) << 1) - (i ^ 22);
        int i3 = (~i2) + (i2 << 1);
        int i4 = i3 % 128;
        writeReplace = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        com.payair.hce.checkCallingUriPermissions checkcallinguripermissions = this.values;
        int i5 = i4 & 105;
        DigitizedCardProfile = ((i5 - (~(-(-((i4 ^ 105) | i5))))) - 1) % 128;
        return checkcallinguripermissions;
    }

    @Override // com.payair.hce.enforceUriPermission
    public com.payair.hce.checkCallingUriPermission getContactlessPaymentData() {
        int i = writeReplace;
        int i2 = (((i & 28) + (i | 28)) - 1) % 128;
        DigitizedCardProfile = i2;
        com.payair.hce.checkCallingUriPermission checkcallinguripermission = this.valueOf;
        int i3 = (i2 ^ 85) + ((i2 & 85) << 1);
        writeReplace = i3 % 128;
        if (i3 % 2 != 0) {
            return checkcallinguripermission;
        }
        throw null;
    }

    @Override // com.payair.hce.enforceUriPermission
    public com.payair.hce.revokeSelfPermissionOnKill getRemotePaymentData() {
        int i = DigitizedCardProfile;
        writeReplace = ((i & 97) + (i | 97)) % 128;
        com.payair.hce.revokeSelfPermissionOnKill revokeselfpermissiononkill = this.AlternateContactlessPaymentDataJson;
        int i2 = i ^ 59;
        int i3 = -(-((i & 59) << 1));
        writeReplace = ((i2 & i3) + (i3 | i2)) % 128;
        return revokeselfpermissiononkill;
    }
}
