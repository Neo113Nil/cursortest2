package org.bouncycastle.asn1.cryptlib;

/* loaded from: classes17.dex */
public class CryptlibObjectIdentifiers {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier cryptlib;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier curvey25519;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier ecc;

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.4.1.3029");
        cryptlib = aSN1ObjectIdentifier;
        org.bouncycastle.asn1.ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch("1").branch("5");
        ecc = branch;
        curvey25519 = branch.branch("1");
    }
}
