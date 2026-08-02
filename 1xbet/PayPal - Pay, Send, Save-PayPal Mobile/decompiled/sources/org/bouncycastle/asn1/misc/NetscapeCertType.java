package org.bouncycastle.asn1.misc;

/* loaded from: classes17.dex */
public class NetscapeCertType extends org.bouncycastle.asn1.DERBitString {
    public static final int objectSigning = 16;
    public static final int objectSigningCA = 1;
    public static final int reserved = 8;
    public static final int smime = 32;
    public static final int smimeCA = 2;
    public static final int sslCA = 4;
    public static final int sslClient = 128;
    public static final int sslServer = 64;

    @Override // org.bouncycastle.asn1.ASN1BitString
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetscapeCertType: 0x");
        sb.append(java.lang.Integer.toHexString(intValue()));
        return sb.toString();
    }

    public NetscapeCertType(org.bouncycastle.asn1.ASN1BitString aSN1BitString) {
        super(aSN1BitString.getBytes(), aSN1BitString.getPadBits());
    }

    public NetscapeCertType(int i) {
        super(getBytes(i), getPadBits(i));
    }
}
