package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SymmAlgorithm extends org.bouncycastle.asn1.ASN1Enumerated {
    public static org.bouncycastle.oer.its.SymmAlgorithm aes128Ccm = new org.bouncycastle.oer.its.SymmAlgorithm(0);

    public static org.bouncycastle.oer.its.SymmAlgorithm getInstance(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof org.bouncycastle.oer.its.SymmAlgorithm) {
            return (org.bouncycastle.oer.its.SymmAlgorithm) obj;
        }
        java.math.BigInteger value = org.bouncycastle.asn1.ASN1Enumerated.getInstance(obj).getValue();
        if (value.intValue() == 0) {
            return aes128Ccm;
        }
        throw new java.lang.IllegalArgumentException("unaccounted enum value ".concat(java.lang.String.valueOf(value)));
    }

    public SymmAlgorithm(int i) {
        super(i);
        if (i != 0) {
            throw new java.lang.IllegalArgumentException("ordinal can only be zero");
        }
    }
}
