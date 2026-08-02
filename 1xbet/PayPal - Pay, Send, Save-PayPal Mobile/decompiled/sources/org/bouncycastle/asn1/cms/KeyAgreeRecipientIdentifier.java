package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class KeyAgreeRecipientIdentifier extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.cms.RecipientKeyIdentifier getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.cms.IssuerAndSerialNumber getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber = this.getHighSpeedVideoSizes;
        return issuerAndSerialNumber != null ? issuerAndSerialNumber.toASN1Primitive() : new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoFpsRangesFor);
    }

    public org.bouncycastle.asn1.cms.RecipientKeyIdentifier getRKeyID() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.cms.IssuerAndSerialNumber getIssuerAndSerialNumber() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier)) {
            return (org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier(org.bouncycastle.asn1.cms.IssuerAndSerialNumber.getInstance(obj));
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) obj;
            if (aSN1TaggedObject.getTagNo() == 0) {
                return new org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier(org.bouncycastle.asn1.cms.RecipientKeyIdentifier.getInstance(aSN1TaggedObject, false));
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid KeyAgreeRecipientIdentifier: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public KeyAgreeRecipientIdentifier(org.bouncycastle.asn1.cms.RecipientKeyIdentifier recipientKeyIdentifier) {
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = recipientKeyIdentifier;
    }

    public KeyAgreeRecipientIdentifier(org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber) {
        this.getHighSpeedVideoSizes = issuerAndSerialNumber;
        this.getHighSpeedVideoFpsRangesFor = null;
    }
}
