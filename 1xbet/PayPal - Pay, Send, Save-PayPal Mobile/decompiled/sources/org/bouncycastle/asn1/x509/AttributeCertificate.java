package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class AttributeCertificate extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1BitString getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.x509.AttributeCertificateInfo getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1BitString getSignatureValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.AttributeCertificateInfo getAcinfo() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.x509.AttributeCertificate getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.AttributeCertificate) {
            return (org.bouncycastle.asn1.x509.AttributeCertificate) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.AttributeCertificate(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AttributeCertificate(org.bouncycastle.asn1.x509.AttributeCertificateInfo attributeCertificateInfo, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.DERBitString dERBitString) {
        this.getHighSpeedVideoSizes = attributeCertificateInfo;
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = dERBitString;
    }

    private AttributeCertificate(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AttributeCertificateInfo.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(2));
    }
}
