package org.bouncycastle.jcajce.provider.asymmetric.x509;

/* loaded from: classes17.dex */
abstract class X509CertificateImpl extends java.security.cert.X509Certificate implements org.bouncycastle.jcajce.interfaces.BCX509Certificate {
    protected org.bouncycastle.asn1.x509.Certificate Camera2StreamConfigurationMap;
    protected org.bouncycastle.asn1.x509.BasicConstraints getHighResolutionOutputSizeshNQ4ISI;
    protected boolean[] getHighSpeedVideoFpsRanges;
    protected java.lang.String getHighSpeedVideoFpsRangesFor;
    protected org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes;
    protected byte[] getHighSpeedVideoSizesFor;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r1.getParameters().equals(org.bouncycastle.asn1.DERNull.INSTANCE) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r0.getParameters().equals(org.bouncycastle.asn1.DERNull.INSTANCE) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRangesFor(java.security.PublicKey publicKey, java.security.Signature signature, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable, byte[] bArr) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        boolean equals;
        org.bouncycastle.asn1.x509.AlgorithmIdentifier signatureAlgorithm = this.Camera2StreamConfigurationMap.getSignatureAlgorithm();
        org.bouncycastle.asn1.x509.AlgorithmIdentifier signature2 = this.Camera2StreamConfigurationMap.getTBSCertificate().getSignature();
        if (signatureAlgorithm.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) signature2.getAlgorithm())) {
            if (org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.x509.allow_absent_equiv_NULL")) {
                if (signatureAlgorithm.getParameters() == null) {
                    if (signature2.getParameters() != null) {
                    }
                    org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.getHighSpeedVideoFpsRanges(signature, aSN1Encodable);
                    signature.initVerify(publicKey);
                    try {
                        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(org.bouncycastle.jcajce.io.OutputStreamFactory.createStream(signature), 512);
                        this.Camera2StreamConfigurationMap.getTBSCertificate().encodeTo(bufferedOutputStream, org.bouncycastle.asn1.ASN1Encoding.DER);
                        bufferedOutputStream.close();
                        if (!signature.verify(bArr)) {
                            throw new java.security.SignatureException("certificate does not verify with supplied key");
                        }
                        return;
                    } catch (java.io.IOException e) {
                        throw new java.security.cert.CertificateEncodingException(e.toString());
                    }
                }
                if (signature2.getParameters() == null) {
                    if (signatureAlgorithm.getParameters() != null) {
                    }
                    org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.getHighSpeedVideoFpsRanges(signature, aSN1Encodable);
                    signature.initVerify(publicKey);
                    java.io.BufferedOutputStream bufferedOutputStream2 = new java.io.BufferedOutputStream(org.bouncycastle.jcajce.io.OutputStreamFactory.createStream(signature), 512);
                    this.Camera2StreamConfigurationMap.getTBSCertificate().encodeTo(bufferedOutputStream2, org.bouncycastle.asn1.ASN1Encoding.DER);
                    bufferedOutputStream2.close();
                    if (!signature.verify(bArr)) {
                    }
                }
            }
            if (signatureAlgorithm.getParameters() != null) {
                equals = signatureAlgorithm.getParameters().equals(signature2.getParameters());
            } else {
                if (signature2.getParameters() != null) {
                    equals = signature2.getParameters().equals(signatureAlgorithm.getParameters());
                }
                org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.getHighSpeedVideoFpsRanges(signature, aSN1Encodable);
                signature.initVerify(publicKey);
                java.io.BufferedOutputStream bufferedOutputStream22 = new java.io.BufferedOutputStream(org.bouncycastle.jcajce.io.OutputStreamFactory.createStream(signature), 512);
                this.Camera2StreamConfigurationMap.getTBSCertificate().encodeTo(bufferedOutputStream22, org.bouncycastle.asn1.ASN1Encoding.DER);
                bufferedOutputStream22.close();
                if (!signature.verify(bArr)) {
                }
            }
        }
        throw new java.security.cert.CertificateException("signature algorithm in TBS cert not same as outer cert");
    }

    private static java.util.Collection getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.Certificate certificate, java.lang.String str) throws java.security.cert.CertificateParsingException {
        java.lang.Object encoded;
        org.bouncycastle.asn1.ASN1OctetString highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(certificate, str);
        byte[] octets = highResolutionOutputSizeshNQ4ISI != null ? highResolutionOutputSizeshNQ4ISI.getOctets() : null;
        if (octets == null) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Enumeration objects = org.bouncycastle.asn1.ASN1Sequence.getInstance(octets).getObjects();
            while (objects.hasMoreElements()) {
                org.bouncycastle.asn1.x509.GeneralName generalName = org.bouncycastle.asn1.x509.GeneralName.getInstance(objects.nextElement());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(org.bouncycastle.util.Integers.valueOf(generalName.getTagNo()));
                switch (generalName.getTagNo()) {
                    case 0:
                    case 3:
                    case 5:
                        encoded = generalName.getEncoded();
                        arrayList2.add(encoded);
                        arrayList.add(java.util.Collections.unmodifiableList(arrayList2));
                    case 1:
                    case 2:
                    case 6:
                        encoded = ((org.bouncycastle.asn1.ASN1String) generalName.getName()).getString();
                        arrayList2.add(encoded);
                        arrayList.add(java.util.Collections.unmodifiableList(arrayList2));
                    case 4:
                        encoded = org.bouncycastle.asn1.x500.X500Name.getInstance(org.bouncycastle.asn1.x500.style.RFC4519Style.INSTANCE, generalName.getName()).toString();
                        arrayList2.add(encoded);
                        arrayList.add(java.util.Collections.unmodifiableList(arrayList2));
                    case 7:
                        try {
                            encoded = java.net.InetAddress.getByAddress(org.bouncycastle.asn1.DEROctetString.getInstance(generalName.getName()).getOctets()).getHostAddress();
                            arrayList2.add(encoded);
                            arrayList.add(java.util.Collections.unmodifiableList(arrayList2));
                        } catch (java.net.UnknownHostException unused) {
                        }
                    case 8:
                        encoded = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(generalName.getName()).getId();
                        arrayList2.add(encoded);
                        arrayList.add(java.util.Collections.unmodifiableList(arrayList2));
                    default:
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Bad tag number: ");
                        sb.append(generalName.getTagNo());
                        throw new java.io.IOException(sb.toString());
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return java.util.Collections.unmodifiableCollection(arrayList);
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CertificateParsingException(e.getMessage());
        }
    }

    @Override // java.security.cert.X509Certificate
    public java.util.List getExtendedKeyUsage() throws java.security.cert.CertificateParsingException {
        org.bouncycastle.asn1.ASN1OctetString highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, "2.5.29.37");
        byte[] octets = highResolutionOutputSizeshNQ4ISI != null ? highResolutionOutputSizeshNQ4ISI.getOctets() : null;
        if (octets == null) {
            return null;
        }
        try {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(octets));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i != aSN1Sequence.size(); i++) {
                arrayList.add(((org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(i)).getId());
            }
            return java.util.Collections.unmodifiableList(arrayList);
        } catch (java.lang.Exception unused) {
            throw new java.security.cert.CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(java.security.PublicKey publicKey, final java.security.Provider provider) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {
        try {
            getHighResolutionOutputSizeshNQ4ISI(publicKey, new org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.3
                @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
                public final java.security.Signature getHighSpeedVideoFpsRanges(java.lang.String str) throws java.security.NoSuchAlgorithmException {
                    java.security.Provider provider2 = provider;
                    return provider2 != null ? java.security.Signature.getInstance(str, provider2) : java.security.Signature.getInstance(str);
                }
            });
        } catch (java.security.NoSuchProviderException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("provider issue: ");
            sb.append(e.getMessage());
            throw new java.security.NoSuchAlgorithmException(sb.toString());
        }
    }

    @Override // java.security.cert.Certificate
    public final void verify(java.security.PublicKey publicKey, final java.lang.String str) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
        getHighResolutionOutputSizeshNQ4ISI(publicKey, new org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.2
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public final java.security.Signature getHighSpeedVideoFpsRanges(java.lang.String str2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
                java.lang.String str3 = str;
                return str3 != null ? java.security.Signature.getInstance(str2, str3) : java.security.Signature.getInstance(str2);
            }
        });
    }

    @Override // java.security.cert.Certificate
    public final void verify(java.security.PublicKey publicKey) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
        getHighResolutionOutputSizeshNQ4ISI(publicKey, new org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.1
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public final java.security.Signature getHighSpeedVideoFpsRanges(java.lang.String str) throws java.security.NoSuchAlgorithmException {
                try {
                    return org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.this.getHighSpeedVideoSizes.createSignature(str);
                } catch (java.lang.Exception unused) {
                    return java.security.Signature.getInstance(str);
                }
            }
        });
    }

    @Override // java.security.cert.Certificate
    public java.lang.String toString() {
        java.lang.StringBuffer append;
        java.lang.Object verisignCzagExtension;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append("  [0]         Version: ").append(getVersion()).append(lineSeparator);
        stringBuffer.append("         SerialNumber: ").append(getSerialNumber()).append(lineSeparator);
        stringBuffer.append("             IssuerDN: ").append(getIssuerDN()).append(lineSeparator);
        stringBuffer.append("           Start Date: ").append(getNotBefore()).append(lineSeparator);
        stringBuffer.append("           Final Date: ").append(getNotAfter()).append(lineSeparator);
        stringBuffer.append("            SubjectDN: ").append(getSubjectDN()).append(lineSeparator);
        stringBuffer.append("           Public Key: ").append(getPublicKey()).append(lineSeparator);
        stringBuffer.append("  Signature Algorithm: ").append(getSigAlgName()).append(lineSeparator);
        org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.getHighSpeedVideoFpsRangesFor(getSignature(), stringBuffer, lineSeparator);
        org.bouncycastle.asn1.x509.Extensions extensions = this.Camera2StreamConfigurationMap.getTBSCertificate().getExtensions();
        if (extensions != null) {
            java.util.Enumeration oids = extensions.oids();
            if (oids.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (oids.hasMoreElements()) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement();
                org.bouncycastle.asn1.x509.Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
                if (extension.getExtnValue() != null) {
                    org.bouncycastle.asn1.ASN1InputStream aSN1InputStream = new org.bouncycastle.asn1.ASN1InputStream(extension.getExtnValue().getOctets());
                    stringBuffer.append("                       critical(").append(extension.isCritical()).append(") ");
                    try {
                        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.basicConstraints)) {
                            verisignCzagExtension = org.bouncycastle.asn1.x509.BasicConstraints.getInstance(aSN1InputStream.readObject());
                        } else if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.keyUsage)) {
                            verisignCzagExtension = org.bouncycastle.asn1.x509.KeyUsage.getInstance(aSN1InputStream.readObject());
                        } else if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.misc.MiscObjectIdentifiers.netscapeCertType)) {
                            verisignCzagExtension = new org.bouncycastle.asn1.misc.NetscapeCertType(org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1InputStream.readObject()));
                        } else if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.misc.MiscObjectIdentifiers.netscapeRevocationURL)) {
                            verisignCzagExtension = new org.bouncycastle.asn1.misc.NetscapeRevocationURL(org.bouncycastle.asn1.ASN1IA5String.getInstance(aSN1InputStream.readObject()));
                        } else if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.misc.MiscObjectIdentifiers.verisignCzagExtension)) {
                            verisignCzagExtension = new org.bouncycastle.asn1.misc.VerisignCzagExtension(org.bouncycastle.asn1.ASN1IA5String.getInstance(aSN1InputStream.readObject()));
                        } else {
                            stringBuffer.append(aSN1ObjectIdentifier.getId());
                            append = stringBuffer.append(" value = ").append(org.bouncycastle.asn1.util.ASN1Dump.dumpAsString(aSN1InputStream.readObject()));
                            append.append(lineSeparator);
                        }
                        append = stringBuffer.append(verisignCzagExtension);
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
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        org.bouncycastle.asn1.x509.Extensions extensions;
        if (getVersion() != 3 || (extensions = this.Camera2StreamConfigurationMap.getTBSCertificate().getExtensions()) == null) {
            return false;
        }
        java.util.Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement();
            if (!aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.keyUsage) && !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.certificatePolicies) && !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.policyMappings) && !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.inhibitAnyPolicy) && !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.cRLDistributionPoints) && !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint) && !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator) && !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.policyConstraints) && !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.basicConstraints) && !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.subjectAlternativeName) && !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.Extension.nameConstraints) && extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.Camera2StreamConfigurationMap.getVersionNumber();
    }

    @Override // org.bouncycastle.jcajce.interfaces.BCX509Certificate
    public org.bouncycastle.asn1.x509.TBSCertificate getTBSCertificateNative() {
        return this.Camera2StreamConfigurationMap.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws java.security.cert.CertificateEncodingException {
        try {
            return this.Camera2StreamConfigurationMap.getTBSCertificate().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            throw new java.security.cert.CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public javax.security.auth.x500.X500Principal getSubjectX500Principal() {
        try {
            return new javax.security.auth.x500.X500Principal(this.Camera2StreamConfigurationMap.getSubject().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("can't encode subject DN");
        }
    }

    @Override // org.bouncycastle.jcajce.interfaces.BCX509Certificate
    public org.bouncycastle.asn1.x500.X500Name getSubjectX500Name() {
        return this.Camera2StreamConfigurationMap.getSubject();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        org.bouncycastle.asn1.ASN1BitString subjectUniqueId = this.Camera2StreamConfigurationMap.getTBSCertificate().getSubjectUniqueId();
        if (subjectUniqueId == null) {
            return null;
        }
        byte[] bytes = subjectUniqueId.getBytes();
        int length = (bytes.length * 8) - subjectUniqueId.getPadBits();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bytes[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public java.security.Principal getSubjectDN() {
        return new org.bouncycastle.jce.X509Principal(this.Camera2StreamConfigurationMap.getSubject());
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Collection getSubjectAlternativeNames() throws java.security.cert.CertificateParsingException {
        return getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, org.bouncycastle.asn1.x509.Extension.subjectAlternativeName.getId());
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.Camera2StreamConfigurationMap.getSignature().getOctets();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizesFor);
    }

    @Override // java.security.cert.X509Certificate
    public java.lang.String getSigAlgOID() {
        return this.Camera2StreamConfigurationMap.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509Certificate
    public java.lang.String getSigAlgName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.security.cert.X509Certificate
    public java.math.BigInteger getSerialNumber() {
        return this.Camera2StreamConfigurationMap.getSerialNumber().getValue();
    }

    @Override // java.security.cert.Certificate
    public java.security.PublicKey getPublicKey() {
        try {
            return org.bouncycastle.jce.provider.BouncyCastleProvider.getPublicKey(this.Camera2StreamConfigurationMap.getSubjectPublicKeyInfo());
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Date getNotBefore() {
        return this.Camera2StreamConfigurationMap.getStartDate().getDate();
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Date getNotAfter() {
        return this.Camera2StreamConfigurationMap.getEndDate().getDate();
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        org.bouncycastle.asn1.x509.Extensions extensions = this.Camera2StreamConfigurationMap.getTBSCertificate().getExtensions();
        if (extensions == null) {
            return null;
        }
        java.util.Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement();
            if (!extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    @Override // java.security.cert.X509Certificate
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() {
        try {
            return new javax.security.auth.x500.X500Principal(this.Camera2StreamConfigurationMap.getIssuer().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // org.bouncycastle.jcajce.interfaces.BCX509Certificate
    public org.bouncycastle.asn1.x500.X500Name getIssuerX500Name() {
        return this.Camera2StreamConfigurationMap.getIssuer();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        org.bouncycastle.asn1.ASN1BitString issuerUniqueId = this.Camera2StreamConfigurationMap.getTBSCertificate().getIssuerUniqueId();
        if (issuerUniqueId == null) {
            return null;
        }
        byte[] bytes = issuerUniqueId.getBytes();
        int length = (bytes.length * 8) - issuerUniqueId.getPadBits();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bytes[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public java.security.Principal getIssuerDN() {
        return new org.bouncycastle.jce.X509Principal(this.Camera2StreamConfigurationMap.getIssuer());
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Collection getIssuerAlternativeNames() throws java.security.cert.CertificateParsingException {
        return getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, org.bouncycastle.asn1.x509.Extension.issuerAlternativeName.getId());
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(java.lang.String str) {
        org.bouncycastle.asn1.ASN1OctetString highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, str);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return null;
        }
        try {
            return highResolutionOutputSizeshNQ4ISI.getEncoded();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("error parsing ");
            sb.append(e.toString());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        org.bouncycastle.asn1.x509.Extensions extensions = this.Camera2StreamConfigurationMap.getTBSCertificate().getExtensions();
        if (extensions == null) {
            return null;
        }
        java.util.Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement();
            if (extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        org.bouncycastle.asn1.x509.BasicConstraints basicConstraints = this.getHighResolutionOutputSizeshNQ4ISI;
        if (basicConstraints == null || !basicConstraints.isCA()) {
            return -1;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.getPathLenConstraint() == null) {
            return Integer.MAX_VALUE;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.getPathLenConstraint().intValue();
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(java.util.Date date) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {
        if (date.getTime() > getNotAfter().getTime()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("certificate expired on ");
            sb.append(this.Camera2StreamConfigurationMap.getEndDate().getTime());
            throw new java.security.cert.CertificateExpiredException(sb.toString());
        }
        if (date.getTime() >= getNotBefore().getTime()) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("certificate not valid till ");
        sb2.append(this.Camera2StreamConfigurationMap.getStartDate().getTime());
        throw new java.security.cert.CertificateNotYetValidException(sb2.toString());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {
        checkValidity(new java.util.Date());
    }

    private static org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.Certificate certificate, java.lang.String str) {
        org.bouncycastle.asn1.x509.Extension extension;
        org.bouncycastle.asn1.x509.Extensions extensions = certificate.getTBSCertificate().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        return extension.getExtnValue();
    }

    protected static byte[] Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.Certificate certificate, java.lang.String str) {
        org.bouncycastle.asn1.ASN1OctetString highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(certificate, str);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return highResolutionOutputSizeshNQ4ISI.getOctets();
        }
        return null;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.security.PublicKey publicKey, org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator signatureCreator) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException {
        boolean z = publicKey instanceof org.bouncycastle.jcajce.CompositePublicKey;
        int i = 0;
        if (z && org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap.getSignatureAlgorithm())) {
            java.util.List<java.security.PublicKey> publicKeys = ((org.bouncycastle.jcajce.CompositePublicKey) publicKey).getPublicKeys();
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(this.Camera2StreamConfigurationMap.getSignatureAlgorithm().getParameters());
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) this.Camera2StreamConfigurationMap.getSignature()).getBytes());
            boolean z2 = false;
            while (i != publicKeys.size()) {
                if (publicKeys.get(i) != null) {
                    org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i));
                    try {
                        getHighSpeedVideoFpsRangesFor(publicKeys.get(i), signatureCreator.getHighSpeedVideoFpsRanges(org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.Camera2StreamConfigurationMap(algorithmIdentifier)), algorithmIdentifier.getParameters(), org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence2.getObjectAt(i)).getBytes());
                        e = null;
                        z2 = true;
                    } catch (java.security.SignatureException e) {
                        e = e;
                    }
                    if (e != null) {
                        throw e;
                    }
                }
                i++;
            }
            if (!z2) {
                throw new java.security.InvalidKeyException("no matching key found");
            }
            return;
        }
        if (!org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap.getSignatureAlgorithm())) {
            java.security.Signature highSpeedVideoFpsRanges = signatureCreator.getHighSpeedVideoFpsRanges(org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap.getSignatureAlgorithm()));
            if (!z) {
                getHighSpeedVideoFpsRangesFor(publicKey, highSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap.getSignatureAlgorithm().getParameters(), getSignature());
                return;
            }
            java.util.List<java.security.PublicKey> publicKeys2 = ((org.bouncycastle.jcajce.CompositePublicKey) publicKey).getPublicKeys();
            while (i != publicKeys2.size()) {
                try {
                    getHighSpeedVideoFpsRangesFor(publicKeys2.get(i), highSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap.getSignatureAlgorithm().getParameters(), getSignature());
                    return;
                } catch (java.security.InvalidKeyException unused) {
                    i++;
                }
            }
            throw new java.security.InvalidKeyException("no matching signature found");
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence3 = org.bouncycastle.asn1.ASN1Sequence.getInstance(this.Camera2StreamConfigurationMap.getSignatureAlgorithm().getParameters());
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence4 = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) this.Camera2StreamConfigurationMap.getSignature()).getBytes());
        boolean z3 = false;
        while (i != aSN1Sequence4.size()) {
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2 = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence3.getObjectAt(i));
            try {
                getHighSpeedVideoFpsRangesFor(publicKey, signatureCreator.getHighSpeedVideoFpsRanges(org.bouncycastle.jcajce.provider.asymmetric.x509.X509SignatureUtil.Camera2StreamConfigurationMap(algorithmIdentifier2)), algorithmIdentifier2.getParameters(), org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence4.getObjectAt(i)).getBytes());
                e = null;
                z3 = true;
            } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException unused2) {
                e = null;
            } catch (java.security.SignatureException e2) {
                e = e2;
            }
            if (e != null) {
                throw e;
            }
            i++;
        }
        if (!z3) {
            throw new java.security.InvalidKeyException("no matching key found");
        }
    }

    X509CertificateImpl(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, org.bouncycastle.asn1.x509.Certificate certificate, org.bouncycastle.asn1.x509.BasicConstraints basicConstraints, boolean[] zArr, java.lang.String str, byte[] bArr) {
        this.getHighSpeedVideoSizes = jcaJceHelper;
        this.Camera2StreamConfigurationMap = certificate;
        this.getHighResolutionOutputSizeshNQ4ISI = basicConstraints;
        this.getHighSpeedVideoFpsRanges = zArr;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizesFor = bArr;
    }
}
