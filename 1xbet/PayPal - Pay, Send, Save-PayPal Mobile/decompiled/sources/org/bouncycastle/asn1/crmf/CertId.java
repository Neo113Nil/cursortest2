package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class CertId extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.GeneralName getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getSerialNumber() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.GeneralName getIssuer() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.crmf.CertId getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.crmf.CertId getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.CertId) {
            return (org.bouncycastle.asn1.crmf.CertId) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.CertId(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertId(org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.getHighResolutionOutputSizeshNQ4ISI = generalName;
        this.getHighSpeedVideoFpsRanges = aSN1Integer;
    }

    public CertId(org.bouncycastle.asn1.x509.GeneralName generalName, java.math.BigInteger bigInteger) {
        this(generalName, new org.bouncycastle.asn1.ASN1Integer(bigInteger));
    }

    private CertId(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
