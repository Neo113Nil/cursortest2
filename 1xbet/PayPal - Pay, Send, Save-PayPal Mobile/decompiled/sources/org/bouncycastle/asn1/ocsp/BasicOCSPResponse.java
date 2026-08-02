package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class BasicOCSPResponse extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.DERBitString Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ocsp.ResponseData getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ocsp.ResponseData getTbsResponseData() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.DERBitString getSignature() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Sequence getCerts() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.ocsp.BasicOCSPResponse getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.ocsp.BasicOCSPResponse getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.BasicOCSPResponse) {
            return (org.bouncycastle.asn1.ocsp.BasicOCSPResponse) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ocsp.BasicOCSPResponse(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BasicOCSPResponse(org.bouncycastle.asn1.ocsp.ResponseData responseData, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.DERBitString dERBitString, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = responseData;
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        this.Camera2StreamConfigurationMap = dERBitString;
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence;
    }

    private BasicOCSPResponse(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ocsp.ResponseData.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.DERBitString) aSN1Sequence.getObjectAt(2);
        if (aSN1Sequence.size() > 3) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Sequence.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(3), true);
        }
    }
}
