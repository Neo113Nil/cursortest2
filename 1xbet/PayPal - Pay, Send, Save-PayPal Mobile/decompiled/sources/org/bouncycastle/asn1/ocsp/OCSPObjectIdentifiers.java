package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public interface OCSPObjectIdentifiers {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkix_ocsp;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkix_ocsp_archive_cutoff;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkix_ocsp_basic;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkix_ocsp_crl;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkix_ocsp_extended_revoke;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkix_ocsp_nocheck;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkix_ocsp_nonce;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkix_ocsp_pref_sig_algs;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkix_ocsp_response;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkix_ocsp_service_locator;

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1");
        id_pkix_ocsp = aSN1ObjectIdentifier;
        id_pkix_ocsp_basic = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.1");
        id_pkix_ocsp_nonce = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.2");
        id_pkix_ocsp_crl = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.3");
        id_pkix_ocsp_response = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.4");
        id_pkix_ocsp_nocheck = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.5");
        id_pkix_ocsp_archive_cutoff = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.6");
        id_pkix_ocsp_service_locator = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1.7");
        id_pkix_ocsp_pref_sig_algs = aSN1ObjectIdentifier.branch("8");
        id_pkix_ocsp_extended_revoke = aSN1ObjectIdentifier.branch("9");
    }
}
