package org.bouncycastle.asn1.ess;

/* loaded from: classes17.dex */
public class ESSCertID extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.IssuerSerial getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.x509.IssuerSerial issuerSerial = this.getHighSpeedVideoSizes;
        if (issuerSerial != null) {
            aSN1EncodableVector.add(issuerSerial);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.IssuerSerial getIssuerSerial() {
        return this.getHighSpeedVideoSizes;
    }

    public byte[] getCertHash() {
        return this.getHighSpeedVideoFpsRangesFor.getOctets();
    }

    public static org.bouncycastle.asn1.ess.ESSCertID getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ess.ESSCertID) {
            return (org.bouncycastle.asn1.ess.ESSCertID) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ess.ESSCertID(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ESSCertID(byte[] bArr, org.bouncycastle.asn1.x509.IssuerSerial issuerSerial) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DEROctetString(bArr);
        this.getHighSpeedVideoSizes = issuerSerial;
    }

    public ESSCertID(byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DEROctetString(bArr);
    }

    private ESSCertID(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.IssuerSerial.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }
}
