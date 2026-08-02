package org.bouncycastle.jcajce.provider.asymmetric.x509;

/* loaded from: classes17.dex */
abstract class X509CRLImpl extends java.security.cert.X509CRL {
    protected byte[] Camera2StreamConfigurationMap;
    protected org.bouncycastle.jcajce.util.JcaJceHelper getHighResolutionOutputSizeshNQ4ISI;
    protected org.bouncycastle.asn1.x509.CertificateList getHighSpeedVideoFpsRanges;
    protected java.lang.String getHighSpeedVideoFpsRangesFor;
    protected boolean getHighSpeedVideoSizes;

    @Override // java.security.cert.X509CRL
    public java.util.Set getRevokedCertificates() {
        org.bouncycastle.asn1.x509.Extension extension;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Enumeration revokedCertificateEnumeration = this.getHighSpeedVideoFpsRanges.getRevokedCertificateEnumeration();
        org.bouncycastle.asn1.x500.X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            org.bouncycastle.asn1.x509.TBSCertList.CRLEntry cRLEntry = (org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            hashSet.add(new org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLEntryObject(cRLEntry, this.getHighSpeedVideoSizes, x500Name));
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
    public void verify(java.security.PublicKey publicKey, final java.security.Provider provider) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {
        try {
            getHighResolutionOutputSizeshNQ4ISI(publicKey, new org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.3
                @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
                public final java.security.Signature getHighSpeedVideoFpsRanges(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
                    return provider != null ? java.security.Signature.getInstance(org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.this.getSigAlgName(), provider) : java.security.Signature.getInstance(org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.this.getSigAlgName());
                }
            });
        } catch (java.security.NoSuchProviderException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("provider issue: ");
            sb.append(e.getMessage());
            throw new java.security.NoSuchAlgorithmException(sb.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public void verify(java.security.PublicKey publicKey, final java.lang.String str) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
        getHighResolutionOutputSizeshNQ4ISI(publicKey, new org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.2
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public final java.security.Signature getHighSpeedVideoFpsRanges(java.lang.String str2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
                java.lang.String str3 = str;
                return str3 != null ? java.security.Signature.getInstance(str2, str3) : java.security.Signature.getInstance(str2);
            }
        });
    }

    @Override // java.security.cert.X509CRL
    public void verify(java.security.PublicKey publicKey) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
        getHighResolutionOutputSizeshNQ4ISI(publicKey, new org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.1
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public final java.security.Signature getHighSpeedVideoFpsRanges(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
                try {
                    return org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.this.getHighResolutionOutputSizeshNQ4ISI.createSignature(str);
                } catch (java.lang.Exception unused) {
                    return java.security.Signature.getInstance(str);
                }
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:40:0x0150
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // java.security.cert.CRL
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.toString():java.lang.String");
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(java.security.cert.Certificate certificate) {
        org.bouncycastle.asn1.x500.X500Name issuer;
        org.bouncycastle.asn1.x509.Extension extension;
        if (!certificate.getType().equals("X.509")) {
            throw new java.lang.IllegalArgumentException("X.509 CRL used with non X.509 Cert");
        }
        java.util.Enumeration revokedCertificateEnumeration = this.getHighSpeedVideoFpsRanges.getRevokedCertificateEnumeration();
        org.bouncycastle.asn1.x500.X500Name issuer2 = this.getHighSpeedVideoFpsRanges.getIssuer();
        if (revokedCertificateEnumeration.hasMoreElements()) {
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
                        } catch (java.security.cert.CertificateEncodingException e) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot process certificate: ");
                            sb.append(e.getMessage());
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                    }
                    return issuer2.equals(issuer);
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        java.util.Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint.getId());
        criticalExtensionOIDs.remove(org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator.getId());
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.getHighSpeedVideoFpsRanges.getVersionNumber();
    }

    @Override // java.security.cert.X509CRL
    public java.util.Date getThisUpdate() {
        return this.getHighSpeedVideoFpsRanges.getThisUpdate().getDate();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws java.security.cert.CRLException {
        try {
            return this.getHighSpeedVideoFpsRanges.getTBSCertList().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            throw new java.security.cert.CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.getHighSpeedVideoFpsRanges.getSignature().getOctets();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    @Override // java.security.cert.X509CRL
    public java.lang.String getSigAlgOID() {
        return this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509CRL
    public java.lang.String getSigAlgName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.security.cert.X509CRL
    public java.security.cert.X509CRLEntry getRevokedCertificate(java.math.BigInteger bigInteger) {
        org.bouncycastle.asn1.x509.Extension extension;
        java.util.Enumeration revokedCertificateEnumeration = this.getHighSpeedVideoFpsRanges.getRevokedCertificateEnumeration();
        org.bouncycastle.asn1.x500.X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            org.bouncycastle.asn1.x509.TBSCertList.CRLEntry cRLEntry = (org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            if (cRLEntry.getUserCertificate().hasValue(bigInteger)) {
                return new org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLEntryObject(cRLEntry, this.getHighSpeedVideoSizes, x500Name);
            }
            if (this.getHighSpeedVideoSizes && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(org.bouncycastle.asn1.x509.Extension.certificateIssuer)) != null) {
                x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(org.bouncycastle.asn1.x509.GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set getNonCriticalExtensionOIDs() {
        return getHighSpeedVideoFpsRanges(false);
    }

    @Override // java.security.cert.X509CRL
    public java.util.Date getNextUpdate() {
        org.bouncycastle.asn1.x509.Time nextUpdate = this.getHighSpeedVideoFpsRanges.getNextUpdate();
        if (nextUpdate == null) {
            return null;
        }
        return nextUpdate.getDate();
    }

    @Override // java.security.cert.X509CRL
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() {
        try {
            return new javax.security.auth.x500.X500Principal(this.getHighSpeedVideoFpsRanges.getIssuer().getEncoded());
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public java.security.Principal getIssuerDN() {
        return new org.bouncycastle.jce.X509Principal(org.bouncycastle.asn1.x500.X500Name.getInstance(this.getHighSpeedVideoFpsRanges.getIssuer().toASN1Primitive()));
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(java.lang.String str) {
        org.bouncycastle.asn1.ASN1OctetString highSpeedVideoSizes = getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, str);
        if (highSpeedVideoSizes == null) {
            return null;
        }
        try {
            return highSpeedVideoSizes.getEncoded();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("error parsing ");
            sb.append(e.toString());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set getCriticalExtensionOIDs() {
        return getHighSpeedVideoFpsRanges(true);
    }

    private static org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.CertificateList certificateList, java.lang.String str) {
        org.bouncycastle.asn1.x509.Extension extension;
        org.bouncycastle.asn1.x509.Extensions extensions = certificateList.getTBSCertList().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        return extension.getExtnValue();
    }

    protected static byte[] Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.CertificateList certificateList, java.lang.String str) {
        org.bouncycastle.asn1.ASN1OctetString highSpeedVideoSizes = getHighSpeedVideoSizes(certificateList, str);
        if (highSpeedVideoSizes != null) {
            return highSpeedVideoSizes.getOctets();
        }
        return null;
    }

    private java.util.Set getHighSpeedVideoFpsRanges(boolean z) {
        org.bouncycastle.asn1.x509.Extensions extensions;
        if (getVersion() != 2 || (extensions = this.getHighSpeedVideoFpsRanges.getTBSCertList().getExtensions()) == null) {
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

    private void getHighResolutionOutputSizeshNQ4ISI(java.security.PublicKey publicKey, org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator signatureCreator) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException {
        if (!this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm().equals(this.getHighSpeedVideoFpsRanges.getTBSCertList().getSignature())) {
            throw new java.security.cert.CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        int i = 0;
        if ((publicKey instanceof org.bouncycastle.jcajce.CompositePublicKey) && org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm())) {
            java.util.List<java.security.PublicKey> publicKeys = ((org.bouncycastle.jcajce.CompositePublicKey) publicKey).getPublicKeys();
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm().getParameters());
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) this.getHighSpeedVideoFpsRanges.getSignature()).getBytes());
            boolean z = false;
            while (i != publicKeys.size()) {
                if (publicKeys.get(i) != null) {
                    org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i));
                    try {
                        Camera2StreamConfigurationMap(publicKeys.get(i), signatureCreator.getHighSpeedVideoFpsRanges(org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.Camera2StreamConfigurationMap(algorithmIdentifier)), algorithmIdentifier.getParameters(), org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence2.getObjectAt(i)).getBytes());
                        z = true;
                        e = null;
                    } catch (java.security.SignatureException e) {
                        e = e;
                    }
                    if (e != null) {
                        throw e;
                    }
                }
                i++;
            }
            if (!z) {
                throw new java.security.InvalidKeyException("no matching key found");
            }
            return;
        }
        if (!org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm())) {
            java.security.Signature highSpeedVideoFpsRanges = signatureCreator.getHighSpeedVideoFpsRanges(getSigAlgName());
            byte[] bArr = this.Camera2StreamConfigurationMap;
            if (bArr == null) {
                Camera2StreamConfigurationMap(publicKey, highSpeedVideoFpsRanges, null, getSignature());
                return;
            }
            try {
                Camera2StreamConfigurationMap(publicKey, highSpeedVideoFpsRanges, org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr), getSignature());
                return;
            } catch (java.io.IOException e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot decode signature parameters: ");
                sb.append(e2.getMessage());
                throw new java.security.SignatureException(sb.toString());
            }
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence3 = org.bouncycastle.asn1.ASN1Sequence.getInstance(this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm().getParameters());
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence4 = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) this.getHighSpeedVideoFpsRanges.getSignature()).getBytes());
        boolean z2 = false;
        while (i != aSN1Sequence4.size()) {
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2 = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence3.getObjectAt(i));
            try {
                Camera2StreamConfigurationMap(publicKey, signatureCreator.getHighSpeedVideoFpsRanges(org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.Camera2StreamConfigurationMap(algorithmIdentifier2)), algorithmIdentifier2.getParameters(), org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence4.getObjectAt(i)).getBytes());
                z2 = true;
            } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException unused) {
            } catch (java.security.SignatureException e3) {
                e = e3;
            }
            e = null;
            if (e != null) {
                throw e;
            }
            i++;
        }
        if (!z2) {
            throw new java.security.InvalidKeyException("no matching key found");
        }
    }

    private void Camera2StreamConfigurationMap(java.security.PublicKey publicKey, java.security.Signature signature, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable, byte[] bArr) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException, java.security.cert.CRLException {
        if (aSN1Encodable != null) {
            org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.getHighSpeedVideoFpsRanges(signature, aSN1Encodable);
        }
        signature.initVerify(publicKey);
        try {
            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(org.bouncycastle.jcajce.io.OutputStreamFactory.createStream(signature), 512);
            this.getHighSpeedVideoFpsRanges.getTBSCertList().encodeTo(bufferedOutputStream, org.bouncycastle.asn1.ASN1Encoding.DER);
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new java.security.SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (java.io.IOException e) {
            throw new java.security.cert.CRLException(e.toString());
        }
    }

    X509CRLImpl(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, org.bouncycastle.asn1.x509.CertificateList certificateList, java.lang.String str, byte[] bArr, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = jcaJceHelper;
        this.getHighSpeedVideoFpsRanges = certificateList;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = bArr;
        this.getHighSpeedVideoSizes = z;
    }
}
