package com.mastercard.mpsdk.card.profile;

/* loaded from: classes4.dex */
public class SdkCoreRemotePaymentDataImpl implements com.payair.hce.revokeSelfPermissionOnKill, java.io.Serializable {
    private static int DigitizedCardProfile = 0;
    private static final long serialVersionUID = -6487383433813719812L;
    private static int valueOf = 1;
    private byte[] aip;
    private byte[] applicationExpiryDate;
    private byte[] ciacDecline;
    private byte[] cvrMaskAnd;
    private byte[] issuerApplicationData;
    private byte[] pan;
    private byte[] panSequenceNumber;
    private byte[] track2Equivalent;

    public SdkCoreRemotePaymentDataImpl(com.payair.hce.revokeSelfPermissionOnKill revokeselfpermissiononkill) {
        this.track2Equivalent = revokeselfpermissiononkill.getTrack2Equivalent();
        this.pan = revokeselfpermissiononkill.getPan();
        this.panSequenceNumber = revokeselfpermissiononkill.getPanSequenceNumber();
        this.applicationExpiryDate = revokeselfpermissiononkill.getApplicationExpiryDate();
        this.aip = revokeselfpermissiononkill.getAip();
        this.ciacDecline = revokeselfpermissiononkill.getCiacDecline();
        this.cvrMaskAnd = revokeselfpermissiononkill.getCvrMaskAnd();
        this.issuerApplicationData = revokeselfpermissiononkill.getIssuerApplicationData();
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getPan() {
        int i = DigitizedCardProfile + 53;
        valueOf = i % 128;
        if (i % 2 != 0) {
            return this.pan;
        }
        throw null;
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getPanSequenceNumber() {
        int i = valueOf;
        int i2 = (i ^ 37) + ((i & 37) << 1);
        DigitizedCardProfile = i2 % 128;
        byte[] bArr = this.panSequenceNumber;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getApplicationExpiryDate() {
        int i = DigitizedCardProfile + 9;
        valueOf = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.applicationExpiryDate;
        valueOf = (((((r0 ^ 57) | (r0 & 57)) << 1) - (~(-((r0 & (-58)) | ((~r0) & 57))))) - 1) % 128;
        return bArr;
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getAip() {
        int i = DigitizedCardProfile;
        int i2 = ((i ^ 48) + ((i & 48) << 1)) - 1;
        valueOf = i2 % 128;
        byte[] bArr = this.aip;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getCiacDecline() {
        int i = DigitizedCardProfile;
        valueOf = (((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)) - 1) % 128;
        byte[] bArr = this.ciacDecline;
        int i2 = ((i ^ 37) | (i & 37)) << 1;
        int i3 = -((i & (-38)) | ((~i) & 37));
        valueOf = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return bArr;
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getCvrMaskAnd() {
        int i = valueOf;
        int i2 = i & 93;
        int i3 = (i | 93) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        int i6 = i5 % 128;
        DigitizedCardProfile = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.cvrMaskAnd;
        int i7 = i6 + 110;
        int i8 = (~i7) + (i7 << 1);
        valueOf = i8 % 128;
        if (i8 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getIssuerApplicationData() {
        int i = DigitizedCardProfile;
        int i2 = i & 91;
        int i3 = (i ^ 91) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return this.issuerApplicationData;
        }
        throw null;
    }

    @Override // com.payair.hce.revokeSelfPermissionOnKill
    public byte[] getTrack2Equivalent() {
        int i = DigitizedCardProfile;
        valueOf = ((i ^ 115) + ((i & 115) << 1)) % 128;
        byte[] bArr = this.track2Equivalent;
        valueOf = (i + 87) % 128;
        return bArr;
    }
}
