package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class CertificationRequest extends org.bouncycastle.asn1.ASN1Object {
    protected org.bouncycastle.asn1.pkcs.CertificationRequestInfo reqInfo;
    protected org.bouncycastle.asn1.x509.AlgorithmIdentifier sigAlgId;
    protected org.bouncycastle.asn1.DERBitString sigBits;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.reqInfo);
        aSN1EncodableVector.add(this.sigAlgId);
        aSN1EncodableVector.add(this.sigBits);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() {
        return this.sigAlgId;
    }

    public org.bouncycastle.asn1.DERBitString getSignature() {
        return this.sigBits;
    }

    public org.bouncycastle.asn1.pkcs.CertificationRequestInfo getCertificationRequestInfo() {
        return this.reqInfo;
    }

    public static org.bouncycastle.asn1.pkcs.CertificationRequest getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.CertificationRequest) {
            return (org.bouncycastle.asn1.pkcs.CertificationRequest) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.CertificationRequest(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertificationRequest(org.bouncycastle.asn1.pkcs.CertificationRequestInfo certificationRequestInfo, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.DERBitString dERBitString) {
        this.reqInfo = certificationRequestInfo;
        this.sigAlgId = algorithmIdentifier;
        this.sigBits = dERBitString;
    }

    public CertificationRequest(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.reqInfo = null;
        this.sigAlgId = null;
        this.sigBits = null;
        this.reqInfo = org.bouncycastle.asn1.pkcs.CertificationRequestInfo.getInstance(aSN1Sequence.getObjectAt(0));
        this.sigAlgId = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.sigBits = (org.bouncycastle.asn1.DERBitString) aSN1Sequence.getObjectAt(2);
    }

    public CertificationRequest() {
        this.reqInfo = null;
        this.sigAlgId = null;
        this.sigBits = null;
    }
}
