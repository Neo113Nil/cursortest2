package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class LraPopWitness extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.cmc.BodyPartID Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cmc.BodyPartID getPkiDataBodyid() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.cmc.BodyPartID[] getBodyIds() {
        org.bouncycastle.asn1.cmc.BodyPartID[] bodyPartIDArr = new org.bouncycastle.asn1.cmc.BodyPartID[this.getHighSpeedVideoFpsRangesFor.size()];
        for (int i = 0; i != this.getHighSpeedVideoFpsRangesFor.size(); i++) {
            bodyPartIDArr[i] = org.bouncycastle.asn1.cmc.BodyPartID.getInstance(this.getHighSpeedVideoFpsRangesFor.getObjectAt(i));
        }
        return bodyPartIDArr;
    }

    public static org.bouncycastle.asn1.cmc.LraPopWitness getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.LraPopWitness) {
            return (org.bouncycastle.asn1.cmc.LraPopWitness) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.LraPopWitness(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public LraPopWitness(org.bouncycastle.asn1.cmc.BodyPartID bodyPartID, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = bodyPartID;
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence;
    }

    private LraPopWitness(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cmc.BodyPartID.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
