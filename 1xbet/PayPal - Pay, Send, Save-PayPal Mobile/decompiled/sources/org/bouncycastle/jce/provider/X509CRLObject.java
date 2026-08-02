package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class X509CRLObject extends java.security.cert.X509CRL {
    private org.bouncycastle.asn1.x509.CertificateList Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges = false;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private byte[] getOutputMinFrameDuration;

    @Override // java.security.cert.X509CRL
    public java.util.Set getRevokedCertificates() {
        org.bouncycastle.asn1.x509.Extension extension;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Enumeration revokedCertificateEnumeration = this.Camera2StreamConfigurationMap.getRevokedCertificateEnumeration();
        org.bouncycastle.asn1.x500.X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            org.bouncycastle.asn1.x509.TBSCertList.CRLEntry cRLEntry = (org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            hashSet.add(new org.bouncycastle.jce.provider.X509CRLEntryObject(cRLEntry, this.getHighSpeedVideoSizes, x500Name));
            if (this.getHighSpeedVideoSizes && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(org.bouncycastle.asn1.x509.Extension.certificateIssuer)) != null) {
                x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(org.bouncycastle.asn1.x509.GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    @Override // java.security.cert.X509CRL
    public void verify(java.security.PublicKey publicKey, java.security.Provider provider) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {
        getHighSpeedVideoFpsRanges(publicKey, provider != null ? java.security.Signature.getInstance(getSigAlgName(), provider) : java.security.Signature.getInstance(getSigAlgName()));
    }

    @Override // java.security.cert.X509CRL
    public void verify(java.security.PublicKey publicKey, java.lang.String str) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
        getHighSpeedVideoFpsRanges(publicKey, str != null ? java.security.Signature.getInstance(getSigAlgName(), str) : java.security.Signature.getInstance(getSigAlgName()));
    }

    @Override // java.security.cert.X509CRL
    public void verify(java.security.PublicKey publicKey) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
        java.security.Signature signature;
        try {
            signature = java.security.Signature.getInstance(getSigAlgName(), org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
        } catch (java.lang.Exception unused) {
            signature = java.security.Signature.getInstance(getSigAlgName());
        }
        getHighSpeedVideoFpsRanges(publicKey, signature);
    }

    @Override // java.security.cert.CRL
    public java.lang.String toString() {
        java.lang.StringBuffer append;
        java.lang.Object cRLDistPoint;
        java.lang.StringBuffer append2;
        java.lang.String str;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("              Version: ");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(getVersion()).append(lineSeparator);
        stringBuffer.append("             IssuerDN: ").append(getIssuerDN()).append(lineSeparator);
        stringBuffer.append("          This update: ").append(getThisUpdate()).append(lineSeparator);
        stringBuffer.append("          Next update: ").append(getNextUpdate()).append(lineSeparator);
        stringBuffer.append("  Signature Algorithm: ").append(getSigAlgName()).append(lineSeparator);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ").append(new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(signature, 0, 20))).append(lineSeparator);
        for (int i = 20; i < signature.length; i += 20) {
            if (i < signature.length - 20) {
                append2 = stringBuffer.append("                       ");
                str = new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(signature, i, 20));
            } else {
                append2 = stringBuffer.append("                       ");
                str = new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(signature, i, signature.length - i));
            }
            append2.append(str).append(lineSeparator);
        }
        org.bouncycastle.asn1.x509.Extensions extensions = this.Camera2StreamConfigurationMap.getTBSCertList().getExtensions();
        if (extensions != null) {
            java.util.Enumeration oids = extensions.oids();
            if (oids.hasMoreElements()) {
                stringBuffer.append("           Extensions: ").append(lineSeparator);
            }
            while (oids.hasMoreElements()) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement();
                org.bouncycastle.asn1.x509.Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
                if (extension.getExtnValue() != null) {
                    org.bouncycastle.asn1.ASN1InputStream aSN1InputStream = new org.bouncycastle.asn1.ASN1InputStream(extension.getExtnValue().getOctets());
                    stringBuffer.append("                       critical(").append(extension.isCritical()).append(") ");
                    try {
                        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.cRLNumber)) {
                            cRLDistPoint = new org.bouncycastle.asn1.x509.CRLNumber(org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1InputStream.readObject()).getPositiveValue());
                        } else {
                            if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator)) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append("Base CRL: ");
                                sb.append(new org.bouncycastle.asn1.x509.CRLNumber(org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1InputStream.readObject()).getPositiveValue()));
                                append = stringBuffer.append(sb.toString());
                            } else if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint)) {
                                cRLDistPoint = org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(aSN1InputStream.readObject());
                            } else {
                                if (!aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.cRLDistributionPoints) && !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.freshestCRL)) {
                                    stringBuffer.append(aSN1ObjectIdentifier.getId());
                                    append = stringBuffer.append(" value = ").append(org.bouncycastle.asn1.util.ASN1Dump.dumpAsString(aSN1InputStream.readObject()));
                                }
                                cRLDistPoint = org.bouncycastle.asn1.x509.CRLDistPoint.getInstance(aSN1InputStream.readObject());
                            }
                            append.append(lineSeparator);
                        }
                        append = stringBuffer.append(cRLDistPoint);
                        append.append(lineSeparator);
                    } catch (java.lang.Exception unused) {
                        stringBuffer.append(aSN1ObjectIdentifier.getId());
                        stringBuffer.append(" value = *****").append(lineSeparator);
                    }
                } else {
                    stringBuffer.append(lineSeparator);
                }
            }
        }
        java.util.Set<? extends java.security.cert.X509CRLEntry> revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            java.util.Iterator<? extends java.security.cert.X509CRLEntry> it = revokedCertificates.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                stringBuffer.append(lineSeparator);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(java.security.cert.Certificate certificate) {
        org.bouncycastle.asn1.x500.X500Name issuer;
        org.bouncycastle.asn1.x509.Extension extension;
        if (!certificate.getType().equals("X.509")) {
            throw new java.lang.RuntimeException("X.509 CRL used with non X.509 Cert");
        }
        java.util.Enumeration revokedCertificateEnumeration = this.Camera2StreamConfigurationMap.getRevokedCertificateEnumeration();
        org.bouncycastle.asn1.x500.X500Name issuer2 = this.Camera2StreamConfigurationMap.getIssuer();
        if (revokedCertificateEnumeration != null) {
            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificate;
            java.math.BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (revokedCertificateEnumeration.hasMoreElements()) {
                org.bouncycastle.asn1.x509.TBSCertList.CRLEntry cRLEntry = org.bouncycastle.asn1.x509.TBSCertList.CRLEntry.getInstance(revokedCertificateEnumeration.nextElement());
                if (this.getHighSpeedVideoSizes && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(org.bouncycastle.asn1.x509.Extension.certificateIssuer)) != null) {
                    issuer2 = org.bouncycastle.asn1.x500.X500Name.getInstance(org.bouncycastle.asn1.x509.GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
                }
                if (cRLEntry.getUserCertificate().hasValue(serialNumber)) {
                    if (certificate instanceof java.security.cert.X509Certificate) {
                        issuer = org.bouncycastle.asn1.x500.X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            issuer = org.bouncycastle.asn1.x509.Certificate.getInstance(certificate.getEncoded()).getIssuer();
                        } catch (java.security.cert.CertificateEncodingException unused) {
                            throw new java.lang.RuntimeException("Cannot process certificate");
                        }
                    }
                    return issuer2.equals(issuer);
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighResolutionOutputSizeshNQ4ISI = super.hashCode();
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        java.util.Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getInputSizeshNQ4ISI);
        criticalExtensionOIDs.remove(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoSizesFor);
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.Camera2StreamConfigurationMap.getVersionNumber();
    }

    @Override // java.security.cert.X509CRL
    public java.util.Date getThisUpdate() {
        return this.Camera2StreamConfigurationMap.getThisUpdate().getDate();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws java.security.cert.CRLException {
        try {
            return this.Camera2StreamConfigurationMap.getTBSCertList().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            throw new java.security.cert.CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.Camera2StreamConfigurationMap.getSignature().getOctets();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        byte[] bArr = this.getOutputMinFrameDuration;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // java.security.cert.X509CRL
    public java.lang.String getSigAlgOID() {
        return this.Camera2StreamConfigurationMap.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509CRL
    public java.lang.String getSigAlgName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.security.cert.X509CRL
    public java.security.cert.X509CRLEntry getRevokedCertificate(java.math.BigInteger bigInteger) {
        org.bouncycastle.asn1.x509.Extension extension;
        java.util.Enumeration revokedCertificateEnumeration = this.Camera2StreamConfigurationMap.getRevokedCertificateEnumeration();
        org.bouncycastle.asn1.x500.X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            org.bouncycastle.asn1.x509.TBSCertList.CRLEntry cRLEntry = (org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            if (cRLEntry.getUserCertificate().hasValue(bigInteger)) {
                return new org.bouncycastle.jce.provider.X509CRLEntryObject(cRLEntry, this.getHighSpeedVideoSizes, x500Name);
            }
            if (this.getHighSpeedVideoSizes && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(org.bouncycastle.asn1.x509.Extension.certificateIssuer)) != null) {
                x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(org.bouncycastle.asn1.x509.GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set getNonCriticalExtensionOIDs() {
        return getHighSpeedVideoFpsRangesFor(false);
    }

    @Override // java.security.cert.X509CRL
    public java.util.Date getNextUpdate() {
        if (this.Camera2StreamConfigurationMap.getNextUpdate() != null) {
            return this.Camera2StreamConfigurationMap.getNextUpdate().getDate();
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() {
        try {
            return new javax.security.auth.x500.X500Principal(this.Camera2StreamConfigurationMap.getIssuer().getEncoded());
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public java.security.Principal getIssuerDN() {
        return new org.bouncycastle.jce.X509Principal(org.bouncycastle.asn1.x500.X500Name.getInstance(this.Camera2StreamConfigurationMap.getIssuer().toASN1Primitive()));
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(java.lang.String str) {
        org.bouncycastle.asn1.x509.Extension extension;
        org.bouncycastle.asn1.x509.Extensions extensions = this.Camera2StreamConfigurationMap.getTBSCertList().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("error parsing ");
            sb.append(e.toString());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    @Override // java.security.cert.X509CRL
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

    @Override // java.security.cert.X509CRL
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.security.cert.X509CRL)) {
            return false;
        }
        if (!(obj instanceof org.bouncycastle.jce.provider.X509CRLObject)) {
            return super.equals(obj);
        }
        org.bouncycastle.jce.provider.X509CRLObject x509CRLObject = (org.bouncycastle.jce.provider.X509CRLObject) obj;
        if (this.getHighSpeedVideoFpsRanges && x509CRLObject.getHighSpeedVideoFpsRanges && x509CRLObject.getHighResolutionOutputSizeshNQ4ISI != this.getHighResolutionOutputSizeshNQ4ISI) {
            return false;
        }
        return this.Camera2StreamConfigurationMap.equals(x509CRLObject.Camera2StreamConfigurationMap);
    }

    public static boolean isIndirectCRL(java.security.cert.X509CRL x509crl) throws java.security.cert.CRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId());
            if (extensionValue != null) {
                return org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(extensionValue).getOctets()).isIndirectCRL();
            }
            return false;
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.jce.provider.ExtCRLException("Exception reading IssuingDistributionPoint", e);
        }
    }

    private java.util.Set getHighSpeedVideoFpsRangesFor(boolean z) {
        org.bouncycastle.asn1.x509.Extensions extensions;
        if (getVersion() != 2 || (extensions = this.Camera2StreamConfigurationMap.getTBSCertList().getExtensions()) == null) {
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

    private void getHighSpeedVideoFpsRanges(java.security.PublicKey publicKey, java.security.Signature signature) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {
        if (!this.Camera2StreamConfigurationMap.getSignatureAlgorithm().equals(this.Camera2StreamConfigurationMap.getTBSCertList().getSignature())) {
            throw new java.security.cert.CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        signature.initVerify(publicKey);
        signature.update(getTBSCertList());
        if (!signature.verify(getSignature())) {
            throw new java.security.SignatureException("CRL does not verify with supplied public key.");
        }
    }

    public X509CRLObject(org.bouncycastle.asn1.x509.CertificateList certificateList) throws java.security.cert.CRLException {
        this.Camera2StreamConfigurationMap = certificateList;
        try {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.jce.provider.X509SignatureUtil.Camera2StreamConfigurationMap(certificateList.getSignatureAlgorithm());
            if (certificateList.getSignatureAlgorithm().getParameters() != null) {
                this.getOutputMinFrameDuration = certificateList.getSignatureAlgorithm().getParameters().toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
            } else {
                this.getOutputMinFrameDuration = null;
            }
            this.getHighSpeedVideoSizes = isIndirectCRL(this);
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CRLException("CRL contents invalid: ".concat(java.lang.String.valueOf(e)));
        }
    }
}
