package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class BodyPartList extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.cmc.BodyPartID[] getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.cmc.BodyPartID[] getBodyPartIDs() {
        return org.bouncycastle.asn1.cmc.Utils.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static org.bouncycastle.asn1.cmc.BodyPartList getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cmc.BodyPartList getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.BodyPartList) {
            return (org.bouncycastle.asn1.cmc.BodyPartList) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.BodyPartList(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartList(org.bouncycastle.asn1.cmc.BodyPartID[] bodyPartIDArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cmc.Utils.getHighResolutionOutputSizeshNQ4ISI(bodyPartIDArr);
    }

    public BodyPartList(org.bouncycastle.asn1.cmc.BodyPartID bodyPartID) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.cmc.BodyPartID[]{bodyPartID};
    }

    private BodyPartList(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cmc.Utils.getHighSpeedVideoSizes(aSN1Sequence);
    }
}
