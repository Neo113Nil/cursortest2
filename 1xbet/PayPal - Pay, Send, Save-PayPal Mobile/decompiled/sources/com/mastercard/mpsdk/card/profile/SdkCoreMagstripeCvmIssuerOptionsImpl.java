package com.mastercard.mpsdk.card.profile;

/* loaded from: classes4.dex */
public class SdkCoreMagstripeCvmIssuerOptionsImpl implements com.payair.hce.enforceCallingUriPermission, java.io.Serializable {
    private static final long serialVersionUID = 4041860063518542073L;
    private static int valueOf = 0;
    private static int writeReplace = 1;
    private boolean ackAlwaysRequiredIfCurrencyNotProvided;
    private boolean ackAlwaysRequiredIfCurrencyProvided;
    private boolean ackAutomaticallyResetByApplication;
    private boolean ackPreEntryAllowed;
    private boolean pinAlwaysRequiredIfCurrencyNotProvided;
    private boolean pinAlwaysRequiredIfCurrencyProvided;
    private boolean pinAutomaticallyResetByApplication;
    private boolean pinPreEntryAllowed;

    public SdkCoreMagstripeCvmIssuerOptionsImpl(com.payair.hce.enforceCallingUriPermission enforcecallinguripermission) {
        this.ackAlwaysRequiredIfCurrencyNotProvided = enforcecallinguripermission.getAckAlwaysRequiredIfCurrencyNotProvided();
        this.ackAlwaysRequiredIfCurrencyProvided = enforcecallinguripermission.getAckAlwaysRequiredIfCurrencyProvided();
        this.ackAutomaticallyResetByApplication = enforcecallinguripermission.getAckAutomaticallyResetByApplication();
        this.ackPreEntryAllowed = enforcecallinguripermission.getAckPreEntryAllowed();
        this.pinAlwaysRequiredIfCurrencyNotProvided = enforcecallinguripermission.getPinAlwaysRequiredIfCurrencyNotProvided();
        this.pinAlwaysRequiredIfCurrencyProvided = enforcecallinguripermission.getPinAlwaysRequiredIfCurrencyProvided();
        this.pinAutomaticallyResetByApplication = enforcecallinguripermission.getPinAutomaticallyResetByApplication();
        this.pinPreEntryAllowed = enforcecallinguripermission.getPinPreEntryAllowed();
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getAckAlwaysRequiredIfCurrencyProvided() {
        int i = valueOf;
        int i2 = i & 23;
        writeReplace = ((((~i2) & (i | 23)) - (~(-(-(i2 << 1))))) - 1) % 128;
        boolean z = this.ackAlwaysRequiredIfCurrencyProvided;
        int i3 = ((i ^ 125) | (i & 125)) << 1;
        int i4 = -((i & (-126)) | ((~i) & 125));
        int i5 = (i3 & i4) + (i4 | i3);
        writeReplace = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getAckAlwaysRequiredIfCurrencyNotProvided() {
        int i = writeReplace;
        int i2 = (i | 33) << 1;
        int i3 = -(i ^ 33);
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        valueOf = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        boolean z = this.ackAlwaysRequiredIfCurrencyNotProvided;
        int i6 = i5 & 27;
        int i7 = -(-(i5 | 27));
        writeReplace = ((i6 & i7) + (i7 | i6)) % 128;
        return z;
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getAckAutomaticallyResetByApplication() {
        int i = valueOf;
        int i2 = i & 99;
        int i3 = (((i | 99) & (~i2)) + (i2 << 1)) % 128;
        writeReplace = i3;
        boolean z = this.ackAutomaticallyResetByApplication;
        valueOf = (((i3 & (-56)) | ((~i3) & 55)) + ((i3 & 55) << 1)) % 128;
        return z;
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getAckPreEntryAllowed() {
        int i = writeReplace;
        int i2 = i & 49;
        int i3 = (i2 + ((i ^ 49) | i2)) % 128;
        valueOf = i3;
        boolean z = this.ackPreEntryAllowed;
        writeReplace = ((i3 & 111) + (i3 | 111)) % 128;
        return z;
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getPinAlwaysRequiredIfCurrencyNotProvided() {
        int i = writeReplace;
        int i2 = (((i | 86) << 1) - (i ^ 86)) - 1;
        valueOf = i2 % 128;
        boolean z = this.pinAlwaysRequiredIfCurrencyNotProvided;
        if (i2 % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getPinAlwaysRequiredIfCurrencyProvided() {
        int i = writeReplace;
        valueOf = (i + 93) % 128;
        boolean z = this.pinAlwaysRequiredIfCurrencyProvided;
        int i2 = ((i & 110) + (i | 110)) - 1;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getPinAutomaticallyResetByApplication() {
        int i = valueOf + 95;
        int i2 = i % 128;
        writeReplace = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        boolean z = this.pinAutomaticallyResetByApplication;
        int i3 = (i2 & 71) + (i2 | 71);
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // com.payair.hce.enforceCallingUriPermission
    public boolean getPinPreEntryAllowed() {
        int i = writeReplace;
        valueOf = (((i | 99) << 1) - (i ^ 99)) % 128;
        boolean z = this.pinPreEntryAllowed;
        writeReplace = (((r1 & 30) + (r1 | 30)) - 1) % 128;
        return z;
    }
}
