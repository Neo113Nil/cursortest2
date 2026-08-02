package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class OCSPResponse extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ocsp.ResponseBytes Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ocsp.OCSPResponseStatus getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.ocsp.ResponseBytes responseBytes = this.Camera2StreamConfigurationMap;
        if (responseBytes != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) responseBytes));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ocsp.OCSPResponseStatus getResponseStatus() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ocsp.ResponseBytes getResponseBytes() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.ocsp.OCSPResponse getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.ocsp.OCSPResponse getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.OCSPResponse) {
            return (org.bouncycastle.asn1.ocsp.OCSPResponse) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ocsp.OCSPResponse(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OCSPResponse(org.bouncycastle.asn1.ocsp.OCSPResponseStatus oCSPResponseStatus, org.bouncycastle.asn1.ocsp.ResponseBytes responseBytes) {
        this.getHighSpeedVideoSizes = oCSPResponseStatus;
        this.Camera2StreamConfigurationMap = responseBytes;
    }

    private OCSPResponse(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ocsp.OCSPResponseStatus.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ocsp.ResponseBytes.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true);
        }
    }
}
