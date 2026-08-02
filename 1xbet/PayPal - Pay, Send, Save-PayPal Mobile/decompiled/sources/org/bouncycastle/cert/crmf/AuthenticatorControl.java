package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public class AuthenticatorControl implements org.bouncycastle.cert.crmf.Control {
    private static final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.crmf.CRMFObjectIdentifiers.id_regCtrl_authenticator;
    private final org.bouncycastle.asn1.ASN1UTF8String getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.cert.crmf.Control
    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.cert.crmf.Control
    public org.bouncycastle.asn1.ASN1ObjectIdentifier getType() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public AuthenticatorControl(org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String) {
        this.getHighSpeedVideoFpsRanges = aSN1UTF8String;
    }

    public AuthenticatorControl(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERUTF8String(str);
    }
}
