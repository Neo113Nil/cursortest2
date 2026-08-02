package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class CRLNumber extends org.bouncycastle.asn1.ASN1Object {
    private java.math.BigInteger getHighSpeedVideoSizes;

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CRLNumber: ");
        sb.append(getCRLNumber());
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes);
    }

    public java.math.BigInteger getCRLNumber() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.x509.CRLNumber getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.CRLNumber) {
            return (org.bouncycastle.asn1.x509.CRLNumber) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.CRLNumber(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).getValue());
        }
        return null;
    }

    public CRLNumber(java.math.BigInteger bigInteger) {
        if (org.bouncycastle.util.BigIntegers.ZERO.compareTo(bigInteger) > 0) {
            throw new java.lang.IllegalArgumentException("Invalid CRL number : not in (0..MAX)");
        }
        this.getHighSpeedVideoSizes = bigInteger;
    }
}
