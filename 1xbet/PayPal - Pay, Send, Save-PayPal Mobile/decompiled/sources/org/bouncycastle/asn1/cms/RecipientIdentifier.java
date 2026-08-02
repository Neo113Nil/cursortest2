package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class RecipientIdentifier extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive();
    }

    public boolean isTagged() {
        return this.getHighResolutionOutputSizeshNQ4ISI instanceof org.bouncycastle.asn1.ASN1TaggedObject;
    }

    public org.bouncycastle.asn1.ASN1Encodable getId() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighResolutionOutputSizeshNQ4ISI;
        return aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObject ? org.bouncycastle.asn1.ASN1OctetString.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable, false) : org.bouncycastle.asn1.cms.IssuerAndSerialNumber.getInstance(aSN1Encodable);
    }

    public static org.bouncycastle.asn1.cms.RecipientIdentifier getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.cms.RecipientIdentifier)) {
            return (org.bouncycastle.asn1.cms.RecipientIdentifier) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.cms.IssuerAndSerialNumber) {
            return new org.bouncycastle.asn1.cms.RecipientIdentifier((org.bouncycastle.asn1.cms.IssuerAndSerialNumber) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1OctetString) {
            return new org.bouncycastle.asn1.cms.RecipientIdentifier((org.bouncycastle.asn1.ASN1OctetString) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Primitive) {
            return new org.bouncycastle.asn1.cms.RecipientIdentifier((org.bouncycastle.asn1.ASN1Primitive) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal object in RecipientIdentifier: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public RecipientIdentifier(org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber) {
        this.getHighResolutionOutputSizeshNQ4ISI = issuerAndSerialNumber;
    }

    public RecipientIdentifier(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Primitive;
    }

    public RecipientIdentifier(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString);
    }
}
