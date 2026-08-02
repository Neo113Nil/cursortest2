package org.bouncycastle.tsp;

/* loaded from: classes17.dex */
public interface TSPAlgorithms {
    public static final java.util.Set ALLOWED;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier GOST3411;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier GOST3411_2012_256;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier GOST3411_2012_512;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier MD5;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier RIPEMD128;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier RIPEMD160;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier RIPEMD256;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SHA1;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SHA224;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SHA256;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SHA384;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SHA512;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SM3;

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5;
        MD5 = aSN1ObjectIdentifier;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1;
        SHA1 = aSN1ObjectIdentifier2;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224;
        SHA224 = aSN1ObjectIdentifier3;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier4 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256;
        SHA256 = aSN1ObjectIdentifier4;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier5 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384;
        SHA384 = aSN1ObjectIdentifier5;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier6 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512;
        SHA512 = aSN1ObjectIdentifier6;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier7 = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128;
        RIPEMD128 = aSN1ObjectIdentifier7;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier8 = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160;
        RIPEMD160 = aSN1ObjectIdentifier8;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier9 = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256;
        RIPEMD256 = aSN1ObjectIdentifier9;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier10 = org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411;
        GOST3411 = aSN1ObjectIdentifier10;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier11 = org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256;
        GOST3411_2012_256 = aSN1ObjectIdentifier11;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier12 = org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512;
        GOST3411_2012_512 = aSN1ObjectIdentifier12;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier13 = org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm3;
        SM3 = aSN1ObjectIdentifier13;
        ALLOWED = new java.util.HashSet(java.util.Arrays.asList(aSN1ObjectIdentifier13, aSN1ObjectIdentifier10, aSN1ObjectIdentifier11, aSN1ObjectIdentifier12, aSN1ObjectIdentifier, aSN1ObjectIdentifier2, aSN1ObjectIdentifier3, aSN1ObjectIdentifier4, aSN1ObjectIdentifier5, aSN1ObjectIdentifier6, aSN1ObjectIdentifier7, aSN1ObjectIdentifier8, aSN1ObjectIdentifier9));
    }
}
