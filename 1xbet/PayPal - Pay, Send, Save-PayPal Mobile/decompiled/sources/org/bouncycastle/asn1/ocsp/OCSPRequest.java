package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class OCSPRequest extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ocsp.TBSRequest getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ocsp.Signature getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.ocsp.Signature signature = this.getHighSpeedVideoSizes;
        if (signature != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) signature));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ocsp.TBSRequest getTbsRequest() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ocsp.Signature getOptionalSignature() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.ocsp.OCSPRequest getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.ocsp.OCSPRequest getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.OCSPRequest) {
            return (org.bouncycastle.asn1.ocsp.OCSPRequest) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ocsp.OCSPRequest(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OCSPRequest(org.bouncycastle.asn1.ocsp.TBSRequest tBSRequest, org.bouncycastle.asn1.ocsp.Signature signature) {
        this.getHighSpeedVideoFpsRangesFor = tBSRequest;
        this.getHighSpeedVideoSizes = signature;
    }

    private OCSPRequest(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ocsp.TBSRequest.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ocsp.Signature.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true);
        }
    }
}
