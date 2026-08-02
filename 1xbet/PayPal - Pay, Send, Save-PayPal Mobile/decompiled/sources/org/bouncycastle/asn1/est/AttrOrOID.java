package org.bouncycastle.asn1.est;

/* loaded from: classes17.dex */
public class AttrOrOID extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.pkcs.Attribute getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = this.Camera2StreamConfigurationMap;
        return aSN1ObjectIdentifier != null ? aSN1ObjectIdentifier : this.getHighSpeedVideoFpsRangesFor.toASN1Primitive();
    }

    public boolean isOid() {
        return this.Camera2StreamConfigurationMap != null;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getOid() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.pkcs.Attribute getAttribute() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.est.AttrOrOID getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.est.AttrOrOID) {
            return (org.bouncycastle.asn1.est.AttrOrOID) obj;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) {
                return new org.bouncycastle.asn1.est.AttrOrOID(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Primitive));
            }
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) {
                return new org.bouncycastle.asn1.est.AttrOrOID(org.bouncycastle.asn1.pkcs.Attribute.getInstance(aSN1Primitive));
            }
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("unknown encoding in getInstance()");
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in getInstance(): ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public AttrOrOID(org.bouncycastle.asn1.pkcs.Attribute attribute) {
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor = attribute;
    }

    public AttrOrOID(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = null;
    }
}
