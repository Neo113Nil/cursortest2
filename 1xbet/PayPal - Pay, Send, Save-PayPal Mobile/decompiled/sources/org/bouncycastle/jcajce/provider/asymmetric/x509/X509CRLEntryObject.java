package org.bouncycastle.jcajce.provider.asymmetric.x509;

/* loaded from: classes17.dex */
class X509CRLEntryObject extends java.security.cert.X509CRLEntry {
    private org.bouncycastle.asn1.x509.TBSCertList.CRLEntry Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRanges;
    private volatile boolean getHighSpeedVideoFpsRangesFor;
    private volatile int getHighSpeedVideoSizes;

    private org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRangesFor(boolean z, org.bouncycastle.asn1.x500.X500Name x500Name) {
        if (!z) {
            return null;
        }
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.x509.Extension.certificateIssuer;
        org.bouncycastle.asn1.x509.Extensions extensions = this.Camera2StreamConfigurationMap.getExtensions();
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
        org.bouncycastle.asn1.x509.Extensions extensions = this.Camera2StreamConfigurationMap.getExtensions();
        org.bouncycastle.asn1.x509.Extension extension = extensions != null ? extensions.getExtension(aSN1ObjectIdentifier) : null;
        if (extension == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception encoding: ");
            sb.append(e.toString());
            throw new java.lang.IllegalStateException(sb.toString());
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
        org.bouncycastle.asn1.x509.Extensions extensions = this.Camera2StreamConfigurationMap.getExtensions();
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
                                if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.reasonCode)) {
                                    append = stringBuffer.append(org.bouncycastle.asn1.x509.CRLReason.getInstance(org.bouncycastle.asn1.ASN1Enumerated.getInstance(aSN1InputStream.readObject())));
                                } else if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.certificateIssuer)) {
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
        if (!this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoSizes = super.hashCode();
            this.getHighSpeedVideoFpsRangesFor = true;
        }
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        java.util.Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return (criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty()) ? false : true;
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return this.Camera2StreamConfigurationMap.getExtensions() != null;
    }

    @Override // java.security.cert.X509CRLEntry
    public java.math.BigInteger getSerialNumber() {
        return this.Camera2StreamConfigurationMap.getUserCertificate().getValue();
    }

    @Override // java.security.cert.X509CRLEntry
    public java.util.Date getRevocationDate() {
        return this.Camera2StreamConfigurationMap.getRevocationDate().getDate();
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set getNonCriticalExtensionOIDs() {
        return getHighSpeedVideoFpsRangesFor(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() throws java.security.cert.CRLException {
        try {
            return this.Camera2StreamConfigurationMap.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            throw new java.security.cert.CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set getCriticalExtensionOIDs() {
        return getHighSpeedVideoFpsRangesFor(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public javax.security.auth.x500.X500Principal getCertificateIssuer() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            return null;
        }
        try {
            return new javax.security.auth.x500.X500Principal(this.getHighSpeedVideoFpsRanges.getEncoded());
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLEntryObject)) {
            return super.equals(this);
        }
        org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLEntryObject x509CRLEntryObject = (org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLEntryObject) obj;
        if (this.getHighSpeedVideoFpsRangesFor && x509CRLEntryObject.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes != x509CRLEntryObject.getHighSpeedVideoSizes) {
            return false;
        }
        return this.Camera2StreamConfigurationMap.equals(x509CRLEntryObject.Camera2StreamConfigurationMap);
    }

    private java.util.Set getHighSpeedVideoFpsRangesFor(boolean z) {
        org.bouncycastle.asn1.x509.Extensions extensions = this.Camera2StreamConfigurationMap.getExtensions();
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

    protected X509CRLEntryObject(org.bouncycastle.asn1.x509.TBSCertList.CRLEntry cRLEntry, boolean z, org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.Camera2StreamConfigurationMap = cRLEntry;
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor(z, x500Name);
    }
}
