package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class X509CRLEntryObject extends java.security.cert.X509CRLEntry {
    private boolean Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.TBSCertList.CRLEntry getHighSpeedVideoSizes;

    private org.bouncycastle.asn1.x500.X500Name Camera2StreamConfigurationMap(boolean z, org.bouncycastle.asn1.x500.X500Name x500Name) {
        if (!z) {
            return null;
        }
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.x509.Extension.certificateIssuer;
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoSizes.getExtensions();
        org.bouncycastle.asn1.x509.Extension extension = extensions != null ? extensions.getExtension(aSN1ObjectIdentifier) : null;
        if (extension == null) {
            return x500Name;
        }
        try {
            org.bouncycastle.asn1.x509.GeneralName[] names = org.bouncycastle.asn1.x509.GeneralNames.getInstance(extension.getParsedValue()).getNames();
            for (int i = 0; i < names.length; i++) {
                if (names[i].getTagNo() == 4) {
                    return org.bouncycastle.asn1.x500.X500Name.getInstance(names[i].getName());
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(java.lang.String str) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier(str);
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoSizes.getExtensions();
        org.bouncycastle.asn1.x509.Extension extension = extensions != null ? extensions.getExtension(aSN1ObjectIdentifier) : null;
        if (extension == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("error encoding ");
            sb.append(e.toString());
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    @Override // java.security.cert.X509CRLEntry
    public java.lang.String toString() {
        java.lang.StringBuffer append;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("      userCertificate: ");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(getSerialNumber()).append(lineSeparator);
        stringBuffer.append("       revocationDate: ").append(getRevocationDate()).append(lineSeparator);
        stringBuffer.append("       certificateIssuer: ").append(getCertificateIssuer()).append(lineSeparator);
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoSizes.getExtensions();
        if (extensions != null) {
            java.util.Enumeration oids = extensions.oids();
            if (oids.hasMoreElements()) {
                java.lang.String str = "   crlEntryExtensions:";
                loop0: while (true) {
                    stringBuffer.append(str).append(lineSeparator);
                    while (oids.hasMoreElements()) {
                        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement();
                        org.bouncycastle.asn1.x509.Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
                        if (extension.getExtnValue() != null) {
                            org.bouncycastle.asn1.ASN1InputStream aSN1InputStream = new org.bouncycastle.asn1.ASN1InputStream(extension.getExtnValue().getOctets());
                            stringBuffer.append("                       critical(").append(extension.isCritical()).append(") ");
                            try {
                                if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.X509Extension.reasonCode)) {
                                    append = stringBuffer.append(org.bouncycastle.asn1.x509.CRLReason.getInstance(org.bouncycastle.asn1.ASN1Enumerated.getInstance(aSN1InputStream.readObject())));
                                } else if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.X509Extension.certificateIssuer)) {
                                    append = stringBuffer.append("Certificate issuer: ").append(org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1InputStream.readObject()));
                                } else {
                                    stringBuffer.append(aSN1ObjectIdentifier.getId());
                                    append = stringBuffer.append(" value = ").append(org.bouncycastle.asn1.util.ASN1Dump.dumpAsString(aSN1InputStream.readObject()));
                                }
                                append.append(lineSeparator);
                            } catch (java.lang.Exception unused) {
                                stringBuffer.append(aSN1ObjectIdentifier.getId());
                                str = " value = *****";
                            }
                        } else {
                            stringBuffer.append(lineSeparator);
                        }
                    }
                    break loop0;
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRLEntry
    public int hashCode() {
        if (!this.Camera2StreamConfigurationMap) {
            this.getHighResolutionOutputSizeshNQ4ISI = super.hashCode();
            this.Camera2StreamConfigurationMap = true;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        java.util.Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return (criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty()) ? false : true;
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return this.getHighSpeedVideoSizes.getExtensions() != null;
    }

    @Override // java.security.cert.X509CRLEntry
    public java.math.BigInteger getSerialNumber() {
        return this.getHighSpeedVideoSizes.getUserCertificate().getValue();
    }

    @Override // java.security.cert.X509CRLEntry
    public java.util.Date getRevocationDate() {
        return this.getHighSpeedVideoSizes.getRevocationDate().getDate();
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set getNonCriticalExtensionOIDs() {
        return getHighResolutionOutputSizeshNQ4ISI(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() throws java.security.cert.CRLException {
        try {
            return this.getHighSpeedVideoSizes.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            throw new java.security.cert.CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set getCriticalExtensionOIDs() {
        return getHighResolutionOutputSizeshNQ4ISI(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public javax.security.auth.x500.X500Principal getCertificateIssuer() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            return null;
        }
        try {
            return new javax.security.auth.x500.X500Principal(this.getHighSpeedVideoFpsRangesFor.getEncoded());
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof org.bouncycastle.jce.provider.X509CRLEntryObject ? this.getHighSpeedVideoSizes.equals(((org.bouncycastle.jce.provider.X509CRLEntryObject) obj).getHighSpeedVideoSizes) : super.equals(this);
    }

    private java.util.Set getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoSizes.getExtensions();
        if (extensions == null) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement();
            if (z == extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    public X509CRLEntryObject(org.bouncycastle.asn1.x509.TBSCertList.CRLEntry cRLEntry, boolean z, org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getHighSpeedVideoSizes = cRLEntry;
        this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap(z, x500Name);
    }

    public X509CRLEntryObject(org.bouncycastle.asn1.x509.TBSCertList.CRLEntry cRLEntry) {
        this.getHighSpeedVideoSizes = cRLEntry;
        this.getHighSpeedVideoFpsRangesFor = null;
    }
}
