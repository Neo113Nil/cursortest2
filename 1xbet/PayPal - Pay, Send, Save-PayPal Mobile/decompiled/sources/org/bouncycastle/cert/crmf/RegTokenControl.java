package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public class RegTokenControl implements org.bouncycastle.cert.crmf.Control {
    private static final org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap = org.bouncycastle.asn1.crmf.CRMFObjectIdentifiers.id_regCtrl_regToken;
    private final org.bouncycastle.asn1.ASN1UTF8String getHighSpeedVideoSizes;

    @Override // org.bouncycastle.cert.crmf.Control
    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.cert.crmf.Control
    public org.bouncycastle.asn1.ASN1ObjectIdentifier getType() {
        return Camera2StreamConfigurationMap;
    }

    public RegTokenControl(org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String) {
        this.getHighSpeedVideoSizes = aSN1UTF8String;
    }

    public RegTokenControl(java.lang.String str) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERUTF8String(str);
    }
}
