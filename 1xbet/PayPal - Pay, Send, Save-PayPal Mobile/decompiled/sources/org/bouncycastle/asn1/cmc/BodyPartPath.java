package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class BodyPartPath extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.cmc.BodyPartID[] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoFpsRangesFor);
    }

    public org.bouncycastle.asn1.cmc.BodyPartID[] getBodyPartIDs() {
        return org.bouncycastle.asn1.cmc.Utils.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
    }

    public static org.bouncycastle.asn1.cmc.BodyPartPath getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cmc.BodyPartPath getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.BodyPartPath) {
            return (org.bouncycastle.asn1.cmc.BodyPartPath) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.BodyPartPath(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartPath(org.bouncycastle.asn1.cmc.BodyPartID[] bodyPartIDArr) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cmc.Utils.getHighResolutionOutputSizeshNQ4ISI(bodyPartIDArr);
    }

    public BodyPartPath(org.bouncycastle.asn1.cmc.BodyPartID bodyPartID) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.cmc.BodyPartID[]{bodyPartID};
    }

    private BodyPartPath(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cmc.Utils.getHighSpeedVideoSizes(aSN1Sequence);
    }
}
