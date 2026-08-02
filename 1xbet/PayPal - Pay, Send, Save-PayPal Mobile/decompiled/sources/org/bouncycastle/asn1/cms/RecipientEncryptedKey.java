package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class RecipientEncryptedKey extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier getIdentifier() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1OctetString getEncryptedKey() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.cms.RecipientEncryptedKey getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.RecipientEncryptedKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.RecipientEncryptedKey) {
            return (org.bouncycastle.asn1.cms.RecipientEncryptedKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.RecipientEncryptedKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public RecipientEncryptedKey(org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier keyAgreeRecipientIdentifier, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoFpsRanges = keyAgreeRecipientIdentifier;
        this.Camera2StreamConfigurationMap = aSN1OctetString;
    }

    private RecipientEncryptedKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(1);
    }
}
