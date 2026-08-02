package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class X509CertificateObject extends java.security.cert.X509Certificate implements org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    private org.bouncycastle.asn1.x509.BasicConstraints Camera2StreamConfigurationMap;
    private org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl();
    private org.bouncycastle.asn1.x509.Certificate getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private boolean[] getHighSpeedVideoSizesFor;

    private void Camera2StreamConfigurationMap(java.security.PublicKey publicKey, java.security.Signature signature) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier signatureAlgorithm = this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm();
        org.bouncycastle.asn1.x509.AlgorithmIdentifier signature2 = this.getHighSpeedVideoFpsRanges.getTBSCertificate().getSignature();
        if (!signatureAlgorithm.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) signature2.getAlgorithm()) || (signatureAlgorithm.getParameters() != null ? signature2.getParameters() != null ? !signatureAlgorithm.getParameters().equals(signature2.getParameters()) : !(signatureAlgorithm.getParameters() == null || signatureAlgorithm.getParameters().equals(org.bouncycastle.asn1.DERNull.INSTANCE)) : !(signature2.getParameters() == null || signature2.getParameters().equals(org.bouncycastle.asn1.DERNull.INSTANCE)))) {
            throw new java.security.cert.CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        org.bouncycastle.jce.provider.X509SignatureUtil.getHighSpeedVideoFpsRanges(signature, this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm().getParameters());
        signature.initVerify(publicKey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature())) {
            throw new java.security.SignatureException("certificate does not verify with supplied key");
        }
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(java.security.PublicKey publicKey, java.security.Provider provider) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {
        java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.jce.provider.X509SignatureUtil.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm());
        Camera2StreamConfigurationMap(publicKey, provider != null ? java.security.Signature.getInstance(Camera2StreamConfigurationMap, provider) : java.security.Signature.getInstance(Camera2StreamConfigurationMap));
    }

    @Override // java.security.cert.Certificate
    public final void verify(java.security.PublicKey publicKey, java.lang.String str) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
        java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.jce.provider.X509SignatureUtil.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm());
        Camera2StreamConfigurationMap(publicKey, str != null ? java.security.Signature.getInstance(Camera2StreamConfigurationMap, str) : java.security.Signature.getInstance(Camera2StreamConfigurationMap));
    }

    @Override // java.security.cert.Certificate
    public final void verify(java.security.PublicKey publicKey) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
        java.security.Signature signature;
        java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.jce.provider.X509SignatureUtil.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm());
        try {
            signature = java.security.Signature.getInstance(Camera2StreamConfigurationMap, org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
        } catch (java.lang.Exception unused) {
            signature = java.security.Signature.getInstance(Camera2StreamConfigurationMap);
        }
        Camera2StreamConfigurationMap(publicKey, signature);
    }

    @Override // java.security.cert.Certificate
    public java.lang.String toString() {
        java.lang.StringBuffer append;
        java.lang.Object verisignCzagExtension;
        java.lang.StringBuffer append2;
        java.lang.String str;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("  [0]         Version: ");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(getVersion()).append(lineSeparator);
        stringBuffer.append("         SerialNumber: ").append(getSerialNumber()).append(lineSeparator);
        stringBuffer.append("             IssuerDN: ").append(getIssuerDN()).append(lineSeparator);
        stringBuffer.append("           Start Date: ").append(getNotBefore()).append(lineSeparator);
        stringBuffer.append("           Final Date: ").append(getNotAfter()).append(lineSeparator);
        stringBuffer.append("            SubjectDN: ").append(getSubjectDN()).append(lineSeparator);
        stringBuffer.append("           Public Key: ").append(getPublicKey()).append(lineSeparator);
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
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRanges.getTBSCertificate().getExtensions();
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
                            verisignCzagExtension = new org.bouncycastle.asn1.misc.NetscapeCertType((org.bouncycastle.asn1.DERBitString) aSN1InputStream.readObject());
                        } else if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.misc.MiscObjectIdentifiers.netscapeRevocationURL)) {
                            verisignCzagExtension = new org.bouncycastle.asn1.misc.NetscapeRevocationURL((org.bouncycastle.asn1.ASN1IA5String) aSN1InputStream.readObject());
                        } else if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.misc.MiscObjectIdentifiers.verisignCzagExtension)) {
                            verisignCzagExtension = new org.bouncycastle.asn1.misc.VerisignCzagExtension((org.bouncycastle.asn1.ASN1IA5String) aSN1InputStream.readObject());
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

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighResolutionOutputSizeshNQ4ISI.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        int i;
        synchronized (this) {
            if (!this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoSizes();
                this.getHighSpeedVideoSizes = true;
            }
            i = this.getHighSpeedVideoFpsRangesFor;
        }
        return i;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        org.bouncycastle.asn1.x509.Extensions extensions;
        if (getVersion() != 3 || (extensions = this.getHighSpeedVideoFpsRanges.getTBSCertificate().getExtensions()) == null) {
            return false;
        }
        java.util.Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement();
            java.lang.String id = aSN1ObjectIdentifier.getId();
            if (!id.equals(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputMinFrameDuration) && !id.equals(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor) && !id.equals(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputSizeshNQ4ISI) && !id.equals(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getInputFormats) && !id.equals(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoFpsRanges) && !id.equals(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getInputSizeshNQ4ISI) && !id.equals(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoSizesFor) && !id.equals(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputMinFrameDurationlomOqCM) && !id.equals(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.Camera2StreamConfigurationMap) && !id.equals(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputStallDurationlomOqCM) && !id.equals(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getOutputSizes) && extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.getHighSpeedVideoFpsRanges.getVersionNumber();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws java.security.cert.CertificateEncodingException {
        try {
            return this.getHighSpeedVideoFpsRanges.getTBSCertificate().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            throw new java.security.cert.CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public javax.security.auth.x500.X500Principal getSubjectX500Principal() {
        try {
            return new javax.security.auth.x500.X500Principal(this.getHighSpeedVideoFpsRanges.getSubject().getEncoded());
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        org.bouncycastle.asn1.ASN1BitString subjectUniqueId = this.getHighSpeedVideoFpsRanges.getTBSCertificate().getSubjectUniqueId();
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
        return new org.bouncycastle.jce.X509Principal(this.getHighSpeedVideoFpsRanges.getSubject());
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Collection getSubjectAlternativeNames() throws java.security.cert.CertificateParsingException {
        return getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.Extension.subjectAlternativeName.getId()));
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.getHighSpeedVideoFpsRanges.getSignature().getOctets();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        if (this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm().getParameters() == null) {
            return null;
        }
        try {
            return this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm().getParameters().toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public java.lang.String getSigAlgOID() {
        return this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509Certificate
    public java.lang.String getSigAlgName() {
        java.security.Provider provider = java.security.Security.getProvider(org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb.append(getSigAlgOID());
            java.lang.String property = provider.getProperty(sb.toString());
            if (property != null) {
                return property;
            }
        }
        java.security.Provider[] providers = java.security.Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            java.security.Provider provider2 = providers[i];
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb2.append(getSigAlgOID());
            java.lang.String property2 = provider2.getProperty(sb2.toString());
            if (property2 != null) {
                return property2;
            }
        }
        return getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public java.math.BigInteger getSerialNumber() {
        return this.getHighSpeedVideoFpsRanges.getSerialNumber().getValue();
    }

    @Override // java.security.cert.Certificate
    public java.security.PublicKey getPublicKey() {
        try {
            return org.bouncycastle.jce.provider.BouncyCastleProvider.getPublicKey(this.getHighSpeedVideoFpsRanges.getSubjectPublicKeyInfo());
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Date getNotBefore() {
        return this.getHighSpeedVideoFpsRanges.getStartDate().getDate();
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Date getNotAfter() {
        return this.getHighSpeedVideoFpsRanges.getEndDate().getDate();
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRanges.getTBSCertificate().getExtensions();
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
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // java.security.cert.X509Certificate
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() {
        try {
            return new javax.security.auth.x500.X500Principal(this.getHighSpeedVideoFpsRanges.getIssuer().getEncoded());
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        org.bouncycastle.asn1.ASN1BitString issuerUniqueId = this.getHighSpeedVideoFpsRanges.getTBSCertificate().getIssuerUniqueId();
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
        return new org.bouncycastle.jce.X509Principal(this.getHighSpeedVideoFpsRanges.getIssuer());
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Collection getIssuerAlternativeNames() throws java.security.cert.CertificateParsingException {
        return getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.Extension.issuerAlternativeName.getId()));
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(java.lang.String str) {
        org.bouncycastle.asn1.x509.Extension extension;
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRanges.getTBSCertificate().getExtensions();
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

    @Override // java.security.cert.X509Certificate
    public java.util.List getExtendedKeyUsage() throws java.security.cert.CertificateParsingException {
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor("2.5.29.37");
        if (highSpeedVideoFpsRangesFor == null) {
            return null;
        }
        try {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) new org.bouncycastle.asn1.ASN1InputStream(highSpeedVideoFpsRangesFor).readObject();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i != aSN1Sequence.size(); i++) {
                arrayList.add(((org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(i)).getId());
            }
            return java.util.Collections.unmodifiableList(arrayList);
        } catch (java.lang.Exception unused) {
            throw new java.security.cert.CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
        try {
            return this.getHighSpeedVideoFpsRanges.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            throw new java.security.cert.CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRanges.getTBSCertificate().getExtensions();
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
        org.bouncycastle.asn1.x509.BasicConstraints basicConstraints = this.Camera2StreamConfigurationMap;
        if (basicConstraints == null || !basicConstraints.isCA()) {
            return -1;
        }
        if (this.Camera2StreamConfigurationMap.getPathLenConstraint() == null) {
            return Integer.MAX_VALUE;
        }
        return this.Camera2StreamConfigurationMap.getPathLenConstraint().intValue();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public java.util.Enumeration getBagAttributeKeys() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // java.security.cert.Certificate
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.security.cert.Certificate)) {
            return false;
        }
        try {
            return org.bouncycastle.util.Arrays.areEqual(getEncoded(), ((java.security.cert.Certificate) obj).getEncoded());
        } catch (java.security.cert.CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(java.util.Date date) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {
        if (date.getTime() > getNotAfter().getTime()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("certificate expired on ");
            sb.append(this.getHighSpeedVideoFpsRanges.getEndDate().getTime());
            throw new java.security.cert.CertificateExpiredException(sb.toString());
        }
        if (date.getTime() >= getNotBefore().getTime()) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("certificate not valid till ");
        sb2.append(this.getHighSpeedVideoFpsRanges.getStartDate().getTime());
        throw new java.security.cert.CertificateNotYetValidException(sb2.toString());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {
        checkValidity(new java.util.Date());
    }

    private byte[] getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        org.bouncycastle.asn1.x509.Extension extension;
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRanges.getTBSCertificate().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        return extension.getExtnValue().getOctets();
    }

    private static java.util.Collection getHighSpeedVideoFpsRanges(byte[] bArr) throws java.security.cert.CertificateParsingException {
        java.lang.Object encoded;
        if (bArr == null) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Enumeration objects = org.bouncycastle.asn1.ASN1Sequence.getInstance(bArr).getObjects();
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

    private int getHighSpeedVideoSizes() {
        try {
            byte[] encoded = getEncoded();
            int i = 0;
            for (int i2 = 1; i2 < encoded.length; i2++) {
                i += encoded[i2] * i2;
            }
            return i;
        } catch (java.security.cert.CertificateEncodingException unused) {
            return 0;
        }
    }

    public X509CertificateObject(org.bouncycastle.asn1.x509.Certificate certificate) throws java.security.cert.CertificateParsingException {
        this.getHighSpeedVideoFpsRanges = certificate;
        try {
            byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor("2.5.29.19");
            if (highSpeedVideoFpsRangesFor != null) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.BasicConstraints.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(highSpeedVideoFpsRangesFor));
            }
            try {
                byte[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor("2.5.29.15");
                if (highSpeedVideoFpsRangesFor2 == null) {
                    this.getHighSpeedVideoSizesFor = null;
                    return;
                }
                org.bouncycastle.asn1.DERBitString dERBitString = org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(highSpeedVideoFpsRangesFor2));
                byte[] bytes = dERBitString.getBytes();
                int length = (bytes.length * 8) - dERBitString.getPadBits();
                this.getHighSpeedVideoSizesFor = new boolean[length >= 9 ? length : 9];
                for (int i = 0; i != length; i++) {
                    this.getHighSpeedVideoSizesFor[i] = (bytes[i / 8] & (128 >>> (i % 8))) != 0;
                }
            } catch (java.lang.Exception e) {
                throw new java.security.cert.CertificateParsingException("cannot construct KeyUsage: ".concat(java.lang.String.valueOf(e)));
            }
        } catch (java.lang.Exception e2) {
            throw new java.security.cert.CertificateParsingException("cannot construct BasicConstraints: ".concat(java.lang.String.valueOf(e2)));
        }
    }
}
