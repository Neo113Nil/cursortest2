package org.bouncycastle.asn1.edec;

/* loaded from: classes17.dex */
public interface EdECObjectIdentifiers {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_Ed25519;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_Ed448;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_X25519;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_X448;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_edwards_curve_algs;

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.101");
        id_edwards_curve_algs = aSN1ObjectIdentifier;
        id_X25519 = aSN1ObjectIdentifier.branch("110").intern();
        id_X448 = aSN1ObjectIdentifier.branch("111").intern();
        id_Ed25519 = aSN1ObjectIdentifier.branch("112").intern();
        id_Ed448 = aSN1ObjectIdentifier.branch("113").intern();
    }
}
