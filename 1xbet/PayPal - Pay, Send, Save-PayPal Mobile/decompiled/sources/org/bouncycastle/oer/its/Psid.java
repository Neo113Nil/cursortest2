package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class Psid extends org.bouncycastle.asn1.ASN1Integer {
    public Psid(long j) {
        super(j);
        if (java.math.BigInteger.ZERO.compareTo(getValue()) >= 0) {
            throw new java.lang.IllegalStateException("psid must be greater than zero");
        }
    }

    public Psid(java.math.BigInteger bigInteger) {
        super(bigInteger);
        if (java.math.BigInteger.ZERO.compareTo(getValue()) >= 0) {
            throw new java.lang.IllegalStateException("psid must be greater than zero");
        }
    }

    public Psid(byte[] bArr) {
        super(bArr);
        if (java.math.BigInteger.ZERO.compareTo(getValue()) >= 0) {
            throw new java.lang.IllegalStateException("psid must be greater than zero");
        }
    }

    public static org.bouncycastle.oer.its.Psid getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.Psid ? (org.bouncycastle.oer.its.Psid) obj : new org.bouncycastle.oer.its.Psid(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).getValue());
    }
}
