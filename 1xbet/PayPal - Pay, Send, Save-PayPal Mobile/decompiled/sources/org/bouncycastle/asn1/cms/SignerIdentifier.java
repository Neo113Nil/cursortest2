package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class SignerIdentifier extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRangesFor.toASN1Primitive();
    }

    public boolean isTagged() {
        return this.getHighSpeedVideoFpsRangesFor instanceof org.bouncycastle.asn1.ASN1TaggedObject;
    }

    public org.bouncycastle.asn1.ASN1Encodable getId() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        return aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObject ? org.bouncycastle.asn1.ASN1OctetString.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable, false) : aSN1Encodable;
    }

    public static org.bouncycastle.asn1.cms.SignerIdentifier getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.cms.SignerIdentifier)) {
            return (org.bouncycastle.asn1.cms.SignerIdentifier) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.cms.IssuerAndSerialNumber) {
            return new org.bouncycastle.asn1.cms.SignerIdentifier((org.bouncycastle.asn1.cms.IssuerAndSerialNumber) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1OctetString) {
            return new org.bouncycastle.asn1.cms.SignerIdentifier((org.bouncycastle.asn1.ASN1OctetString) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Primitive) {
            return new org.bouncycastle.asn1.cms.SignerIdentifier((org.bouncycastle.asn1.ASN1Primitive) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal object in SignerIdentifier: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public SignerIdentifier(org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber) {
        this.getHighSpeedVideoFpsRangesFor = issuerAndSerialNumber;
    }

    public SignerIdentifier(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        this.getHighSpeedVideoFpsRangesFor = aSN1Primitive;
    }

    public SignerIdentifier(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString);
    }
}
