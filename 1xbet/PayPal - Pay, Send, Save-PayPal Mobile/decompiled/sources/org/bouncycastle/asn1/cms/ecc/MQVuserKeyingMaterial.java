package org.bouncycastle.asn1.cms.ecc;

/* loaded from: classes17.dex */
public class MQVuserKeyingMaterial extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cms.OriginatorPublicKey getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cms.OriginatorPublicKey getEphemeralPublicKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1OctetString getAddedukm() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial) {
            return (org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public MQVuserKeyingMaterial(org.bouncycastle.asn1.cms.OriginatorPublicKey originatorPublicKey, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        if (originatorPublicKey == null) {
            throw new java.lang.IllegalArgumentException("Ephemeral public key cannot be null");
        }
        this.getHighSpeedVideoFpsRangesFor = originatorPublicKey;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1OctetString;
    }

    private MQVuserKeyingMaterial(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 1 && aSN1Sequence.size() != 2) {
            throw new java.lang.IllegalArgumentException("Sequence has incorrect number of elements");
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cms.OriginatorPublicKey.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1OctetString.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true);
        }
    }
}
