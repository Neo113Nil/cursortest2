package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class CrlValidatedID extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.esf.OtherHash getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.esf.CrlIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges.toASN1Primitive());
        org.bouncycastle.asn1.esf.CrlIdentifier crlIdentifier = this.getHighSpeedVideoFpsRangesFor;
        if (crlIdentifier != null) {
            aSN1EncodableVector.add(crlIdentifier.toASN1Primitive());
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.esf.CrlIdentifier getCrlIdentifier() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.esf.OtherHash getCrlHash() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.esf.CrlValidatedID getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.CrlValidatedID) {
            return (org.bouncycastle.asn1.esf.CrlValidatedID) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.CrlValidatedID(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CrlValidatedID(org.bouncycastle.asn1.esf.OtherHash otherHash, org.bouncycastle.asn1.esf.CrlIdentifier crlIdentifier) {
        this.getHighSpeedVideoFpsRanges = otherHash;
        this.getHighSpeedVideoFpsRangesFor = crlIdentifier;
    }

    public CrlValidatedID(org.bouncycastle.asn1.esf.OtherHash otherHash) {
        this(otherHash, null);
    }

    private CrlValidatedID(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.esf.OtherHash.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.esf.CrlIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }
}
