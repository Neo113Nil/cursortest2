package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class X962Parameters extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isNamedCurve() {
        return this.getHighResolutionOutputSizeshNQ4ISI instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier;
    }

    public boolean isImplicitlyCA() {
        return this.getHighResolutionOutputSizeshNQ4ISI instanceof org.bouncycastle.asn1.ASN1Null;
    }

    public org.bouncycastle.asn1.ASN1Primitive getParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.x9.X962Parameters getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }

    public static org.bouncycastle.asn1.x9.X962Parameters getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x9.X962Parameters)) {
            return (org.bouncycastle.asn1.x9.X962Parameters) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Primitive) {
            return new org.bouncycastle.asn1.x9.X962Parameters((org.bouncycastle.asn1.ASN1Primitive) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new java.lang.IllegalArgumentException("unknown object in getInstance()");
        }
        try {
            return new org.bouncycastle.asn1.x9.X962Parameters(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to parse encoded data: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public X962Parameters(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighResolutionOutputSizeshNQ4ISI = x9ECParameters.toASN1Primitive();
    }

    private X962Parameters(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Primitive;
    }

    public X962Parameters(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
    }

    public X962Parameters(org.bouncycastle.asn1.ASN1Null aSN1Null) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Null;
    }
}
