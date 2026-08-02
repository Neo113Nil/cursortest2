package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class Extension extends org.bouncycastle.asn1.ASN1Object {
    private boolean Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier subjectDirectoryAttributes = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.9").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier subjectKeyIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.14").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier keyUsage = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.15").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier privateKeyUsagePeriod = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.16").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier subjectAlternativeName = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.17").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier issuerAlternativeName = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.18").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier basicConstraints = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.19").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier cRLNumber = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.20").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier reasonCode = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.21").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier instructionCode = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.23").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier invalidityDate = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.24").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier deltaCRLIndicator = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.27").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier issuingDistributionPoint = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.28").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier certificateIssuer = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.29").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier nameConstraints = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.30").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier cRLDistributionPoints = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.31").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier certificatePolicies = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.32").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier policyMappings = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.33").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier authorityKeyIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.35").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier policyConstraints = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.36").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier extendedKeyUsage = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.37").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier freshestCRL = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.46").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier inhibitAnyPolicy = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.54").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier authorityInfoAccess = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.1").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier subjectInfoAccess = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.11").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier logoType = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.12").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier biometricInfo = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.2").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier qCStatements = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.3").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier auditIdentity = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.1.4").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier noRevAvail = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.56").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier targetInformation = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.55").intern();
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier expiredCertsOnCRL = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.29.60").intern();

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        if (this.Camera2StreamConfigurationMap) {
            aSN1EncodableVector.add(org.bouncycastle.asn1.ASN1Boolean.getInstance(true));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public boolean isCritical() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return isCritical() ? getExtnValue().hashCode() ^ getExtnId().hashCode() : ~(getExtnValue().hashCode() ^ getExtnId().hashCode());
    }

    public org.bouncycastle.asn1.ASN1Encodable getParsedValue() {
        return getHighResolutionOutputSizeshNQ4ISI(this);
    }

    public org.bouncycastle.asn1.ASN1OctetString getExtnValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getExtnId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.asn1.x509.Extension)) {
            return false;
        }
        org.bouncycastle.asn1.x509.Extension extension = (org.bouncycastle.asn1.x509.Extension) obj;
        return extension.getExtnId().equals((org.bouncycastle.asn1.ASN1Primitive) getExtnId()) && extension.getExtnValue().equals((org.bouncycastle.asn1.ASN1Primitive) getExtnValue()) && extension.isCritical() == isCritical();
    }

    public static org.bouncycastle.asn1.x509.Extension getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.Extension) {
            return (org.bouncycastle.asn1.x509.Extension) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.Extension(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.x509.Extension create(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        return new org.bouncycastle.asn1.x509.Extension(aSN1ObjectIdentifier, z, aSN1Encodable.toASN1Primitive().getEncoded());
    }

    private static org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.Extension extension) throws java.lang.IllegalArgumentException {
        try {
            return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(extension.getExtnValue().getOctets());
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException("can't convert extension: ".concat(java.lang.String.valueOf(e)));
        }
    }

    private Extension(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1Encodable objectAt;
        if (aSN1Sequence.size() == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.Camera2StreamConfigurationMap = false;
            objectAt = aSN1Sequence.getObjectAt(1);
        } else {
            if (aSN1Sequence.size() != 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
                sb.append(aSN1Sequence.size());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(1)).isTrue();
            objectAt = aSN1Sequence.getObjectAt(2);
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1OctetString.getInstance(objectAt);
    }

    public Extension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) {
        this(aSN1ObjectIdentifier, z, new org.bouncycastle.asn1.DEROctetString(bArr));
    }

    public Extension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = aSN1OctetString;
    }

    public Extension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Boolean aSN1Boolean, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this(aSN1ObjectIdentifier, aSN1Boolean.isTrue(), aSN1OctetString);
    }
}
