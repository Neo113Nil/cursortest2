package org.bouncycastle.asn1.iana;

/* loaded from: classes17.dex */
public interface IANAObjectIdentifiers {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SNMPv2;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier _private;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier directory;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier experimental;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier hmacMD5;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier hmacRIPEMD160;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier hmacSHA1;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier hmacTIGER;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier internet;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier ipsec;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier isakmpOakley;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier mail;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier mgmt;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier pkix;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier security;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier security_mechanisms;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier security_nametypes;

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1");
        internet = aSN1ObjectIdentifier;
        directory = aSN1ObjectIdentifier.branch("1");
        mgmt = aSN1ObjectIdentifier.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
        experimental = aSN1ObjectIdentifier.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
        _private = aSN1ObjectIdentifier.branch("4");
        org.bouncycastle.asn1.ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch("5");
        security = branch;
        SNMPv2 = aSN1ObjectIdentifier.branch("6");
        mail = aSN1ObjectIdentifier.branch("7");
        org.bouncycastle.asn1.ASN1ObjectIdentifier branch2 = branch.branch("5");
        security_mechanisms = branch2;
        security_nametypes = branch.branch("6");
        pkix = branch2.branch("6");
        org.bouncycastle.asn1.ASN1ObjectIdentifier branch3 = branch2.branch("8");
        ipsec = branch3;
        org.bouncycastle.asn1.ASN1ObjectIdentifier branch4 = branch3.branch("1");
        isakmpOakley = branch4;
        hmacMD5 = branch4.branch("1");
        hmacSHA1 = branch4.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
        hmacTIGER = branch4.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
        hmacRIPEMD160 = branch4.branch("4");
    }
}
