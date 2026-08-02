package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class X509Extension {
    boolean Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier subjectDirectoryAttributes = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.9");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier subjectKeyIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.14");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier keyUsage = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.15");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier privateKeyUsagePeriod = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.16");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier subjectAlternativeName = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.17");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier issuerAlternativeName = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.18");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier basicConstraints = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.19");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier cRLNumber = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.20");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier reasonCode = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.21");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier instructionCode = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.23");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier invalidityDate = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.24");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier deltaCRLIndicator = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.27");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier issuingDistributionPoint = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.28");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier certificateIssuer = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.29");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier nameConstraints = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.30");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier cRLDistributionPoints = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.31");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier certificatePolicies = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.32");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier policyMappings = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.33");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier authorityKeyIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.35");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier policyConstraints = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.36");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier extendedKeyUsage = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.37");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier freshestCRL = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.46");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier inhibitAnyPolicy = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.54");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier authorityInfoAccess = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.1");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier subjectInfoAccess = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.11");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier logoType = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.12");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier biometricInfo = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.2");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier qCStatements = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.3");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier auditIdentity = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.4");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier noRevAvail = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.56");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier targetInformation = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.55");

    public boolean isCritical() {
        return this.Camera2StreamConfigurationMap;
    }

    public int hashCode() {
        return isCritical() ? getValue().hashCode() : ~getValue().hashCode();
    }

    public org.bouncycastle.asn1.ASN1OctetString getValue() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1Encodable getParsedValue() {
        return convertValueToObject(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.asn1.x509.X509Extension)) {
            return false;
        }
        org.bouncycastle.asn1.x509.X509Extension x509Extension = (org.bouncycastle.asn1.x509.X509Extension) obj;
        return x509Extension.getValue().equals((org.bouncycastle.asn1.ASN1Primitive) getValue()) && x509Extension.isCritical() == isCritical();
    }

    public static org.bouncycastle.asn1.ASN1Primitive convertValueToObject(org.bouncycastle.asn1.x509.X509Extension x509Extension) throws java.lang.IllegalArgumentException {
        try {
            return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(x509Extension.getValue().getOctets());
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException("can't convert extension: ".concat(java.lang.String.valueOf(e)));
        }
    }

    public X509Extension(boolean z, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = aSN1OctetString;
    }

    public X509Extension(org.bouncycastle.asn1.ASN1Boolean aSN1Boolean, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.Camera2StreamConfigurationMap = aSN1Boolean.isTrue();
        this.getHighSpeedVideoSizes = aSN1OctetString;
    }
}
