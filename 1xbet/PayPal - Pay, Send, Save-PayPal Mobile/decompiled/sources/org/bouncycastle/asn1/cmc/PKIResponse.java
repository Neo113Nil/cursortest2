package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class PKIResponse extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Sequence getOtherMsgSequence() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1Sequence getControlSequence() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1Sequence getCmsSequence() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.cmc.PKIResponse getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cmc.PKIResponse getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.PKIResponse) {
            return (org.bouncycastle.asn1.cmc.PKIResponse) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.PKIResponse(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private PKIResponse(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2));
    }
}
