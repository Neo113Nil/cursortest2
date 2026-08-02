package com.mastercard.mpsdk.card.profile;

/* loaded from: classes4.dex */
public class SdkCoreMppLiteModuleImpl implements com.payair.hce.enforceUriPermission, java.io.Serializable {
    private static final long serialVersionUID = 9166967735179708625L;
    private static int valueOf = 1;
    private static int writeReplace;
    private com.payair.hce.checkCallingUriPermissions cardRiskManagementData;
    private com.payair.hce.checkCallingUriPermission contactlessPaymentData;
    private com.payair.hce.revokeSelfPermissionOnKill remotePaymentData;

    public SdkCoreMppLiteModuleImpl(com.payair.hce.enforceUriPermission enforceuripermission) {
        this.cardRiskManagementData = new com.mastercard.mpsdk.card.profile.SdkCoreCardRiskManagementDataImpl(enforceuripermission.getCardRiskManagementData());
        this.contactlessPaymentData = new com.mastercard.mpsdk.card.profile.SdkCoreContactlessPaymentDataImpl(enforceuripermission.getContactlessPaymentData());
        if (enforceuripermission.getRemotePaymentData() != null) {
            this.remotePaymentData = new com.mastercard.mpsdk.card.profile.SdkCoreRemotePaymentDataImpl(enforceuripermission.getRemotePaymentData());
        }
    }

    @Override // com.payair.hce.enforceUriPermission
    public com.payair.hce.checkCallingUriPermissions getCardRiskManagementData() {
        int i = writeReplace;
        int i2 = i & 79;
        int i3 = -(-((i ^ 79) | i2));
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        valueOf = i4;
        com.payair.hce.checkCallingUriPermissions checkcallinguripermissions = this.cardRiskManagementData;
        int i5 = (i4 & (-114)) | ((~i4) & 113);
        int i6 = (i4 & 113) << 1;
        writeReplace = (((i5 | i6) << 1) - (i5 ^ i6)) % 128;
        return checkcallinguripermissions;
    }

    @Override // com.payair.hce.enforceUriPermission
    public com.payair.hce.checkCallingUriPermission getContactlessPaymentData() {
        int i = writeReplace;
        int i2 = (i ^ 11) + ((i & 11) << 1);
        int i3 = i2 % 128;
        valueOf = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        com.payair.hce.checkCallingUriPermission checkcallinguripermission = this.contactlessPaymentData;
        int i4 = i3 + 53;
        writeReplace = i4 % 128;
        if (i4 % 2 == 0) {
            return checkcallinguripermission;
        }
        throw null;
    }

    @Override // com.payair.hce.enforceUriPermission
    public com.payair.hce.revokeSelfPermissionOnKill getRemotePaymentData() {
        int i = valueOf;
        int i2 = ((i ^ 44) + ((i & 44) << 1)) - 1;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return this.remotePaymentData;
        }
        throw null;
    }
}
