package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class DHPublicKey extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getY() {
        return this.getHighSpeedVideoFpsRanges.getPositiveValue();
    }

    public static org.bouncycastle.asn1.x9.DHPublicKey getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x9.DHPublicKey getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x9.DHPublicKey)) {
            return (org.bouncycastle.asn1.x9.DHPublicKey) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Integer) {
            return new org.bouncycastle.asn1.x9.DHPublicKey((org.bouncycastle.asn1.ASN1Integer) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid DHPublicKey: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private DHPublicKey(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        if (aSN1Integer == null) {
            throw new java.lang.IllegalArgumentException("'y' cannot be null");
        }
        this.getHighSpeedVideoFpsRanges = aSN1Integer;
    }

    public DHPublicKey(java.math.BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new java.lang.IllegalArgumentException("'y' cannot be null");
        }
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
    }
}
