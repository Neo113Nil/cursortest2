package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public interface DVCSObjectIdentifiers {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_aa_dvcs_dvc;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ad_dvcs;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ct_DVCSRequestData;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ct_DVCSResponseData;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_kp_dvcs;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pkix;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_smime;

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7");
        id_pkix = aSN1ObjectIdentifier;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.9.16");
        id_smime = aSN1ObjectIdentifier2;
        id_ad_dvcs = aSN1ObjectIdentifier.branch("48.4");
        id_kp_dvcs = aSN1ObjectIdentifier.branch("3.10");
        id_ct_DVCSRequestData = aSN1ObjectIdentifier2.branch("1.7");
        id_ct_DVCSResponseData = aSN1ObjectIdentifier2.branch("1.8");
        id_aa_dvcs_dvc = aSN1ObjectIdentifier2.branch("2.29");
    }
}
