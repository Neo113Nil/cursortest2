package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class CertReqMsg extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.crmf.CertRequest getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.crmf.ProofOfPossession getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.crmf.ProofOfPossession proofOfPossession = this.getHighSpeedVideoSizes;
        if (proofOfPossession != null) {
            aSN1EncodableVector.add(proofOfPossession);
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.Camera2StreamConfigurationMap;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.crmf.AttributeTypeAndValue[] getRegInfo() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.Camera2StreamConfigurationMap;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.crmf.AttributeTypeAndValue[] attributeTypeAndValueArr = new org.bouncycastle.asn1.crmf.AttributeTypeAndValue[size];
        for (int i = 0; i != size; i++) {
            attributeTypeAndValueArr[i] = org.bouncycastle.asn1.crmf.AttributeTypeAndValue.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        return attributeTypeAndValueArr;
    }

    public org.bouncycastle.asn1.crmf.ProofOfPossession getPopo() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.crmf.ProofOfPossession getPop() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.crmf.CertRequest getCertReq() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.crmf.CertReqMsg getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.crmf.CertReqMsg getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.CertReqMsg) {
            return (org.bouncycastle.asn1.crmf.CertReqMsg) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.CertReqMsg(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertReqMsg(org.bouncycastle.asn1.crmf.CertRequest certRequest, org.bouncycastle.asn1.crmf.ProofOfPossession proofOfPossession, org.bouncycastle.asn1.crmf.AttributeTypeAndValue[] attributeTypeAndValueArr) {
        if (certRequest == null) {
            throw new java.lang.IllegalArgumentException("'certReq' cannot be null");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = certRequest;
        this.getHighSpeedVideoSizes = proofOfPossession;
        if (attributeTypeAndValueArr != null) {
            this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(attributeTypeAndValueArr);
        }
    }

    private CertReqMsg(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.crmf.CertRequest.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            java.lang.Object nextElement = objects.nextElement();
            if ((nextElement instanceof org.bouncycastle.asn1.ASN1TaggedObject) || (nextElement instanceof org.bouncycastle.asn1.crmf.ProofOfPossession)) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.crmf.ProofOfPossession.getInstance(nextElement);
            } else {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Sequence.getInstance(nextElement);
            }
        }
    }
}
