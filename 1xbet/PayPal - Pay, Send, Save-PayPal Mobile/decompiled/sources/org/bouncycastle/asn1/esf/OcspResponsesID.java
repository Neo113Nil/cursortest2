package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class OcspResponsesID extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.esf.OtherHash Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.esf.OcspIdentifier getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.esf.OtherHash otherHash = this.Camera2StreamConfigurationMap;
        if (otherHash != null) {
            aSN1EncodableVector.add(otherHash);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.esf.OtherHash getOcspRepHash() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.esf.OcspIdentifier getOcspIdentifier() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.esf.OcspResponsesID getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.OcspResponsesID) {
            return (org.bouncycastle.asn1.esf.OcspResponsesID) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.OcspResponsesID(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OcspResponsesID(org.bouncycastle.asn1.esf.OcspIdentifier ocspIdentifier, org.bouncycastle.asn1.esf.OtherHash otherHash) {
        this.getHighSpeedVideoFpsRanges = ocspIdentifier;
        this.Camera2StreamConfigurationMap = otherHash;
    }

    public OcspResponsesID(org.bouncycastle.asn1.esf.OcspIdentifier ocspIdentifier) {
        this(ocspIdentifier, null);
    }

    private OcspResponsesID(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.esf.OcspIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.esf.OtherHash.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }
}
