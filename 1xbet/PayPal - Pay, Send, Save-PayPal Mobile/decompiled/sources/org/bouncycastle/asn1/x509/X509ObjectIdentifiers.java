package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public interface X509ObjectIdentifiers {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier crlAccessMethod;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ad;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ad_caIssuers;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ad_ocsp;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ce;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ecdsa_with_shake128;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ecdsa_with_shake256;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pe;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkix;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_rsassa_pss_shake128;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_rsassa_pss_shake256;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier ocspAccessMethod;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier commonName = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.3").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier countryName = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.6").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier localityName = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.7").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier stateOrProvinceName = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.8").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier organization = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.10").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier organizationalUnitName = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.11").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_at_telephoneNumber = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.20").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_at_name = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.41").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_at_organizationIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.97").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_SHA1 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.14.3.2.26").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier ripemd160 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.36.3.2.1").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier ripemd160WithRSAEncryption = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.36.3.3.1.2").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ea_rsa = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.8.1.1").intern();

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7");
        id_pkix = aSN1ObjectIdentifier;
        id_rsassa_pss_shake128 = aSN1ObjectIdentifier.branch("6.30");
        id_rsassa_pss_shake256 = aSN1ObjectIdentifier.branch("6.31");
        id_ecdsa_with_shake128 = aSN1ObjectIdentifier.branch("6.32");
        id_ecdsa_with_shake256 = aSN1ObjectIdentifier.branch("6.33");
        id_pe = aSN1ObjectIdentifier.branch("1");
        id_ce = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29");
        org.bouncycastle.asn1.ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch("48");
        id_ad = branch;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern = branch.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D).intern();
        id_ad_caIssuers = intern;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern2 = branch.branch("1").intern();
        id_ad_ocsp = intern2;
        ocspAccessMethod = intern2;
        crlAccessMethod = intern;
    }
}
