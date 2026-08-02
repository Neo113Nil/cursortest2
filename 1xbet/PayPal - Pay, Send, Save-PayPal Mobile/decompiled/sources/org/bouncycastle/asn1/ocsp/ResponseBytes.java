package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class ResponseBytes extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getResponseType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1OctetString getResponse() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.ocsp.ResponseBytes getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.ocsp.ResponseBytes getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.ResponseBytes) {
            return (org.bouncycastle.asn1.ocsp.ResponseBytes) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ocsp.ResponseBytes(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private ResponseBytes(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(1);
    }

    public ResponseBytes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = aSN1OctetString;
    }
}
