package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class TaggedCertificationRequest extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.cmc.BodyPartID getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.cmc.CertificationRequest getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public static org.bouncycastle.asn1.cmc.TaggedCertificationRequest getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cmc.TaggedCertificationRequest getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.TaggedCertificationRequest) {
            return (org.bouncycastle.asn1.cmc.TaggedCertificationRequest) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.TaggedCertificationRequest(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public TaggedCertificationRequest(org.bouncycastle.asn1.cmc.BodyPartID bodyPartID, org.bouncycastle.asn1.cmc.CertificationRequest certificationRequest) {
        this.getHighResolutionOutputSizeshNQ4ISI = bodyPartID;
        this.getHighSpeedVideoFpsRangesFor = certificationRequest;
    }

    private TaggedCertificationRequest(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cmc.BodyPartID.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cmc.CertificationRequest.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
