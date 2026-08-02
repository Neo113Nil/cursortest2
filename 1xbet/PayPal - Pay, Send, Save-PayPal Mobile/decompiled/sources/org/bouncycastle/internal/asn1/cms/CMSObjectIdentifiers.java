package org.bouncycastle.internal.asn1.cms;

/* loaded from: classes17.dex */
public interface CMSObjectIdentifiers {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_RSASSA_PSS_SHAKE128;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_RSASSA_PSS_SHAKE256;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_alg;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ecdsa_with_shake128;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ecdsa_with_shake256;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ri;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ri_ocsp_response;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ri_scvp;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier data = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.data;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier signedData = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.signedData;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier envelopedData = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.envelopedData;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier signedAndEnvelopedData = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.signedAndEnvelopedData;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier digestedData = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.digestedData;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier encryptedData = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.encryptedData;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier authenticatedData = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_ct_authData;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier compressedData = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_ct_compressedData;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier authEnvelopedData = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_ct_authEnvelopedData;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier timestampedData = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_ct_timestampedData;

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.16");
        id_ri = aSN1ObjectIdentifier;
        id_ri_ocsp_response = aSN1ObjectIdentifier.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
        id_ri_scvp = aSN1ObjectIdentifier.branch("4");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.6");
        id_alg = aSN1ObjectIdentifier2;
        id_RSASSA_PSS_SHAKE128 = aSN1ObjectIdentifier2.branch("30");
        id_RSASSA_PSS_SHAKE256 = aSN1ObjectIdentifier2.branch("31");
        id_ecdsa_with_shake128 = aSN1ObjectIdentifier2.branch("32");
        id_ecdsa_with_shake256 = aSN1ObjectIdentifier2.branch("33");
    }
}
