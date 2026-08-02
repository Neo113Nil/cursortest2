package org.bouncycastle.asn1.x509.qualified;

/* loaded from: classes17.dex */
public interface ETSIQCObjectIdentifiers {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_etsi_qcs_QcType;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_etsi_qct_eseal;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_etsi_qct_esign;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_etsi_qct_web;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_etsi_qcs_QcCompliance = new org.bouncycastle.asn1.ASN1ObjectIdentifier("0.4.0.1862.1.1");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_etsi_qcs_LimiteValue = new org.bouncycastle.asn1.ASN1ObjectIdentifier("0.4.0.1862.1.2");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_etsi_qcs_RetentionPeriod = new org.bouncycastle.asn1.ASN1ObjectIdentifier("0.4.0.1862.1.3");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_etsi_qcs_QcSSCD = new org.bouncycastle.asn1.ASN1ObjectIdentifier("0.4.0.1862.1.4");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_etsi_qcs_QcPds = new org.bouncycastle.asn1.ASN1ObjectIdentifier("0.4.0.1862.1.5");

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("0.4.0.1862.1.6");
        id_etsi_qcs_QcType = aSN1ObjectIdentifier;
        id_etsi_qct_esign = aSN1ObjectIdentifier.branch("1");
        id_etsi_qct_eseal = aSN1ObjectIdentifier.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
        id_etsi_qct_web = aSN1ObjectIdentifier.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
    }
}
