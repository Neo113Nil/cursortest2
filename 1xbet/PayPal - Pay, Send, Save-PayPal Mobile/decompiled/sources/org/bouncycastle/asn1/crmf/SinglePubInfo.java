package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class SinglePubInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.GeneralName Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    public static final org.bouncycastle.asn1.ASN1Integer dontCare = new org.bouncycastle.asn1.ASN1Integer(0);
    public static final org.bouncycastle.asn1.ASN1Integer x500 = new org.bouncycastle.asn1.ASN1Integer(1);
    public static final org.bouncycastle.asn1.ASN1Integer web = new org.bouncycastle.asn1.ASN1Integer(2);
    public static final org.bouncycastle.asn1.ASN1Integer ldap = new org.bouncycastle.asn1.ASN1Integer(3);

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.x509.GeneralName generalName = this.Camera2StreamConfigurationMap;
        if (generalName != null) {
            aSN1EncodableVector.add(generalName);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getPubMethod() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.GeneralName getPubLocation() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.crmf.SinglePubInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.SinglePubInfo) {
            return (org.bouncycastle.asn1.crmf.SinglePubInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.SinglePubInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private SinglePubInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }

    public SinglePubInfo(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
        this.Camera2StreamConfigurationMap = generalName;
    }
}
