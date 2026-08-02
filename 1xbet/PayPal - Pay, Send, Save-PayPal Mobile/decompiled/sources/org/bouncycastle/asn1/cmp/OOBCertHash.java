package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class OOBCertHash extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.crmf.CertId getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.Camera2StreamConfigurationMap;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) algorithmIdentifier));
        }
        org.bouncycastle.asn1.crmf.CertId certId = this.getHighResolutionOutputSizeshNQ4ISI;
        if (certId != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) certId));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1BitString getHashVal() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlg() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.crmf.CertId getCertId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.cmp.OOBCertHash getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.OOBCertHash) {
            return (org.bouncycastle.asn1.cmp.OOBCertHash) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.OOBCertHash(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OOBCertHash(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.crmf.CertId certId, byte[] bArr) {
        this(algorithmIdentifier, certId, new org.bouncycastle.asn1.DERBitString(bArr));
    }

    public OOBCertHash(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.crmf.CertId certId, org.bouncycastle.asn1.DERBitString dERBitString) {
        this.Camera2StreamConfigurationMap = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = certId;
        this.getHighSpeedVideoFpsRangesFor = dERBitString;
    }

    private OOBCertHash(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1Sequence.getObjectAt(size - 1));
        for (int i = size - 2; i >= 0; i--) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i);
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.crmf.CertId.getInstance(aSN1TaggedObject, true);
            }
        }
    }
}
