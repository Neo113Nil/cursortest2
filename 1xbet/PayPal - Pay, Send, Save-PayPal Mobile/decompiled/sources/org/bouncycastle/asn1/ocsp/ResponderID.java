package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class ResponderID extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRanges;
        return aSN1Encodable instanceof org.bouncycastle.asn1.ASN1OctetString ? new org.bouncycastle.asn1.DERTaggedObject(true, 2, aSN1Encodable) : new org.bouncycastle.asn1.DERTaggedObject(true, 1, aSN1Encodable);
    }

    public org.bouncycastle.asn1.x500.X500Name getName() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRanges;
        if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1OctetString) {
            return null;
        }
        return org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Encodable);
    }

    public byte[] getKeyHash() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRanges;
        if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1OctetString) {
            return ((org.bouncycastle.asn1.ASN1OctetString) aSN1Encodable).getOctets();
        }
        return null;
    }

    public static org.bouncycastle.asn1.ocsp.ResponderID getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }

    public static org.bouncycastle.asn1.ocsp.ResponderID getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.ResponderID) {
            return (org.bouncycastle.asn1.ocsp.ResponderID) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.DEROctetString) {
            return new org.bouncycastle.asn1.ocsp.ResponderID((org.bouncycastle.asn1.DEROctetString) obj);
        }
        if (!(obj instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
            return new org.bouncycastle.asn1.ocsp.ResponderID(org.bouncycastle.asn1.x500.X500Name.getInstance(obj));
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) obj;
        return aSN1TaggedObject.getTagNo() == 1 ? new org.bouncycastle.asn1.ocsp.ResponderID(org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1TaggedObject, true)) : new org.bouncycastle.asn1.ocsp.ResponderID(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, true));
    }

    public ResponderID(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getHighSpeedVideoFpsRanges = x500Name;
    }

    public ResponderID(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoFpsRanges = aSN1OctetString;
    }
}
