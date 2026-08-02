package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public interface CRMFObjectIdentifiers {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_alg;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_alg_dh_pop;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ct_encKeyWithID;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_dh_sig_hmac_sha1;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkip;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkix;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_regCtrl;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_regCtrl_authenticator;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_regCtrl_pkiArchiveOptions;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_regCtrl_pkiPublicationInfo;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_regCtrl_regToken;

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7");
        id_pkix = aSN1ObjectIdentifier;
        org.bouncycastle.asn1.ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch("5");
        id_pkip = branch;
        org.bouncycastle.asn1.ASN1ObjectIdentifier branch2 = branch.branch("1");
        id_regCtrl = branch2;
        id_regCtrl_regToken = branch2.branch("1");
        id_regCtrl_authenticator = branch2.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
        id_regCtrl_pkiPublicationInfo = branch2.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
        id_regCtrl_pkiArchiveOptions = branch2.branch("4");
        id_ct_encKeyWithID = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_ct.branch("21");
        org.bouncycastle.asn1.ASN1ObjectIdentifier branch3 = aSN1ObjectIdentifier.branch("6");
        id_alg = branch3;
        id_dh_sig_hmac_sha1 = branch3.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
        id_alg_dh_pop = branch3.branch("4");
    }
}
