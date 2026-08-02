package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public interface X509AttributeIdentifiers {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_aca;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_aca_accessIdentity;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_aca_authenticationInfo;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_aca_chargingIdentity;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_aca_encAttrs;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_aca_group;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_at_clearance;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_at_role;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier RoleSyntax = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.72");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pe_ac_auditIdentity = org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_pe.branch("4");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pe_aaControls = org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_pe.branch("6");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_pe_ac_proxying = org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_pe.branch("10");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ce_targetInformation = org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_ce.branch("55");

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier branch = org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_pkix.branch("10");
        id_aca = branch;
        id_aca_authenticationInfo = branch.branch("1");
        id_aca_accessIdentity = branch.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
        id_aca_chargingIdentity = branch.branch(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
        id_aca_group = branch.branch("4");
        id_aca_encAttrs = branch.branch("6");
        id_at_role = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.72");
        id_at_clearance = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.1.5.55");
    }
}
