package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class CMCUnsignedData extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.cmc.BodyPartPath getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getIdentifier() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Encodable getContent() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.cmc.BodyPartPath getBodyPartPath() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmc.CMCUnsignedData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.CMCUnsignedData) {
            return (org.bouncycastle.asn1.cmc.CMCUnsignedData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.CMCUnsignedData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CMCUnsignedData(org.bouncycastle.asn1.cmc.BodyPartPath bodyPartPath, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoSizes = bodyPartPath;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
    }

    private CMCUnsignedData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cmc.BodyPartPath.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence.getObjectAt(2);
    }
}
