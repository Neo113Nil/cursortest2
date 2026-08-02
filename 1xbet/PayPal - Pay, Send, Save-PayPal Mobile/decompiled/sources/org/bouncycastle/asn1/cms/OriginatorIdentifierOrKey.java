package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class OriginatorIdentifierOrKey extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap.toASN1Primitive();
    }

    public org.bouncycastle.asn1.x509.SubjectKeyIdentifier getSubjectKeyIdentifier() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.Camera2StreamConfigurationMap;
        if ((aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObject) && ((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable).getTagNo() == 0) {
            return org.bouncycastle.asn1.x509.SubjectKeyIdentifier.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) this.Camera2StreamConfigurationMap, false);
        }
        return null;
    }

    public org.bouncycastle.asn1.cms.OriginatorPublicKey getOriginatorKey() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.Camera2StreamConfigurationMap;
        if ((aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObject) && ((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable).getTagNo() == 1) {
            return org.bouncycastle.asn1.cms.OriginatorPublicKey.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) this.Camera2StreamConfigurationMap, false);
        }
        return null;
    }

    public org.bouncycastle.asn1.cms.IssuerAndSerialNumber getIssuerAndSerialNumber() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.Camera2StreamConfigurationMap;
        if (aSN1Encodable instanceof org.bouncycastle.asn1.cms.IssuerAndSerialNumber) {
            return (org.bouncycastle.asn1.cms.IssuerAndSerialNumber) aSN1Encodable;
        }
        return null;
    }

    public org.bouncycastle.asn1.ASN1Encodable getId() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (z) {
            return getInstance(aSN1TaggedObject.getObject());
        }
        throw new java.lang.IllegalArgumentException("Can't implicitly tag OriginatorIdentifierOrKey");
    }

    public static org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey)) {
            return (org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey) obj;
        }
        if ((obj instanceof org.bouncycastle.asn1.cms.IssuerAndSerialNumber) || (obj instanceof org.bouncycastle.asn1.ASN1Sequence)) {
            return new org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey(org.bouncycastle.asn1.cms.IssuerAndSerialNumber.getInstance(obj));
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) obj;
            if (aSN1TaggedObject.getTagNo() == 0) {
                return new org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey(org.bouncycastle.asn1.x509.SubjectKeyIdentifier.getInstance(aSN1TaggedObject, false));
            }
            if (aSN1TaggedObject.getTagNo() == 1) {
                return new org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey(org.bouncycastle.asn1.cms.OriginatorPublicKey.getInstance(aSN1TaggedObject, false));
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid OriginatorIdentifierOrKey: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public OriginatorIdentifierOrKey(org.bouncycastle.asn1.x509.SubjectKeyIdentifier subjectKeyIdentifier) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) subjectKeyIdentifier);
    }

    public OriginatorIdentifierOrKey(org.bouncycastle.asn1.cms.OriginatorPublicKey originatorPublicKey) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) originatorPublicKey);
    }

    public OriginatorIdentifierOrKey(org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber) {
        this.Camera2StreamConfigurationMap = issuerAndSerialNumber;
    }

    public OriginatorIdentifierOrKey(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        this.Camera2StreamConfigurationMap = aSN1Primitive;
    }

    public OriginatorIdentifierOrKey(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this(new org.bouncycastle.asn1.x509.SubjectKeyIdentifier(aSN1OctetString.getOctets()));
    }
}
