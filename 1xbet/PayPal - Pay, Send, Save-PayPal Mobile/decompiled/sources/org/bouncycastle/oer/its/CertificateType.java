package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class CertificateType extends org.bouncycastle.asn1.ASN1Enumerated {
    public static final org.bouncycastle.oer.its.CertificateType Explicit = new org.bouncycastle.oer.its.CertificateType(0);
    public static final org.bouncycastle.oer.its.CertificateType Implicit = new org.bouncycastle.oer.its.CertificateType(1);

    public static org.bouncycastle.oer.its.CertificateType getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.CertificateType) {
            return (org.bouncycastle.oer.its.CertificateType) obj;
        }
        java.math.BigInteger value = org.bouncycastle.asn1.ASN1Enumerated.getInstance(obj).getValue();
        int intValue = value.intValue();
        if (intValue == 0) {
            return Explicit;
        }
        if (intValue == 1) {
            return Implicit;
        }
        throw new java.lang.IllegalArgumentException("unaccounted enum value ".concat(java.lang.String.valueOf(value)));
    }

    protected CertificateType(int i) {
        super(i);
    }
}
