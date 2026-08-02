package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class KeyPurposeId extends org.bouncycastle.asn1.ASN1Object {
    public static final org.bouncycastle.asn1.x509.KeyPurposeId anyExtendedKeyUsage;
    private static final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_OCSPSigning;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_capwapAC;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_capwapWTP;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_clientAuth;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_codeSigning;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_dvcs;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_eapOverLAN;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_eapOverPPP;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_emailProtection;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_ipsecEndSystem;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_ipsecIKE;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_ipsecTunnel;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_ipsecUser;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_macAddress;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_msSGC;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_nsSGC;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_sbgpCertAAServerAuth;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_scvpClient;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_scvpServer;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_scvp_responder;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_serverAuth;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_smartcardlogon;
    public static final org.bouncycastle.asn1.x509.KeyPurposeId id_kp_timeStamping;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;

    public java.lang.String toString() {
        return this.Camera2StreamConfigurationMap.toString();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier toOID() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getId() {
        return this.Camera2StreamConfigurationMap.getId();
    }

    public static org.bouncycastle.asn1.x509.KeyPurposeId getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.KeyPurposeId) {
            return (org.bouncycastle.asn1.x509.KeyPurposeId) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.KeyPurposeId(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(obj));
        }
        return null;
    }

    private KeyPurposeId(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
    }

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.3");
        getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        anyExtendedKeyUsage = new org.bouncycastle.asn1.x509.KeyPurposeId(org.bouncycastle.asn1.x509.Extension.extendedKeyUsage.branch("0"));
        id_kp_serverAuth = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("1"));
        id_kp_clientAuth = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D));
        id_kp_codeSigning = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D));
        id_kp_emailProtection = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("4"));
        id_kp_ipsecEndSystem = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("5"));
        id_kp_ipsecTunnel = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("6"));
        id_kp_ipsecUser = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("7"));
        id_kp_timeStamping = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("8"));
        id_kp_OCSPSigning = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("9"));
        id_kp_dvcs = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("10"));
        id_kp_sbgpCertAAServerAuth = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("11"));
        id_kp_scvp_responder = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("12"));
        id_kp_eapOverPPP = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("13"));
        id_kp_eapOverLAN = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("14"));
        id_kp_scvpServer = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("15"));
        id_kp_scvpClient = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("16"));
        id_kp_ipsecIKE = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("17"));
        id_kp_capwapAC = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("18"));
        id_kp_capwapWTP = new org.bouncycastle.asn1.x509.KeyPurposeId(aSN1ObjectIdentifier.branch("19"));
        id_kp_smartcardlogon = new org.bouncycastle.asn1.x509.KeyPurposeId(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.4.1.311.20.2.2"));
        id_kp_macAddress = new org.bouncycastle.asn1.x509.KeyPurposeId(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.1.1.1.22"));
        id_kp_msSGC = new org.bouncycastle.asn1.x509.KeyPurposeId(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.4.1.311.10.3.3"));
        id_kp_nsSGC = new org.bouncycastle.asn1.x509.KeyPurposeId(new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.16.840.1.113730.4.1"));
    }
}
