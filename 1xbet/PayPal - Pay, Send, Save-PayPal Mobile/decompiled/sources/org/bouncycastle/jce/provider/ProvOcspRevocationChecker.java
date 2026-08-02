package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
class ProvOcspRevocationChecker implements org.bouncycastle.jcajce.PKIXCertRevocationChecker {
    private static final java.util.Map getHighResolutionOutputSizeshNQ4ISI;
    boolean Camera2StreamConfigurationMap;
    org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoFpsRangesFor;
    java.lang.String getHighSpeedVideoSizes;
    private final org.bouncycastle.jce.provider.ProvRevocationChecker getInputSizeshNQ4ISI;

    public static java.util.List<java.security.cert.CertPathValidatorException> getHighSpeedVideoFpsRanges() {
        return null;
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void setParameter(java.lang.String str, java.lang.Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0132, code lost:
    
        r2.initVerify(r14.getPublicKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011e, code lost:
    
        if (r6.equals(org.bouncycastle.asn1.x500.X500Name.getInstance(org.bouncycastle.asn1.x500.style.BCStrictStyle.INSTANCE, r3.getSubjectX500Principal().getEncoded())) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ocsp.BasicOCSPResponse basicOCSPResponse, org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, byte[] bArr, java.security.cert.X509Certificate x509Certificate, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) throws java.security.cert.CertPathValidatorException {
        java.lang.String id;
        try {
            org.bouncycastle.asn1.ASN1Sequence certs = basicOCSPResponse.getCerts();
            org.bouncycastle.asn1.x509.AlgorithmIdentifier signatureAlgorithm = basicOCSPResponse.getSignatureAlgorithm();
            org.bouncycastle.asn1.ASN1Encodable parameters = signatureAlgorithm.getParameters();
            if (parameters == null || org.bouncycastle.asn1.DERNull.INSTANCE.equals(parameters) || !signatureAlgorithm.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                java.util.Map map = getHighResolutionOutputSizeshNQ4ISI;
                boolean containsKey = map.containsKey(signatureAlgorithm.getAlgorithm());
                org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = signatureAlgorithm.getAlgorithm();
                id = containsKey ? (java.lang.String) map.get(algorithm) : algorithm.getId();
            } else {
                org.bouncycastle.asn1.pkcs.RSASSAPSSparams rSASSAPSSparams = org.bouncycastle.asn1.pkcs.RSASSAPSSparams.getInstance(parameters);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String digestName = org.bouncycastle.jcajce.util.MessageDigestUtils.getDigestName(rSASSAPSSparams.getHashAlgorithm().getAlgorithm());
                int indexOf = digestName.indexOf(45);
                if (indexOf > 0 && !digestName.startsWith("SHA3")) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(digestName.substring(0, indexOf));
                    sb2.append(digestName.substring(indexOf + 1));
                    digestName = sb2.toString();
                }
                sb.append(digestName);
                sb.append("WITHRSAANDMGF1");
                id = sb.toString();
            }
            java.security.Signature createSignature = jcaJceHelper.createSignature(id);
            java.security.cert.X509Certificate signingCert = pKIXCertRevocationCheckerParameters.getSigningCert();
            org.bouncycastle.asn1.ocsp.ResponderID responderID = basicOCSPResponse.getTbsResponseData().getResponderID();
            byte[] keyHash = responderID.getKeyHash();
            if (keyHash != null) {
                java.security.MessageDigest createMessageDigest = jcaJceHelper.createMessageDigest("SHA1");
                if (x509Certificate == null || !org.bouncycastle.util.Arrays.areEqual(keyHash, createMessageDigest.digest(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(x509Certificate.getPublicKey().getEncoded()).getPublicKeyData().getBytes()))) {
                    if (signingCert != null && org.bouncycastle.util.Arrays.areEqual(keyHash, createMessageDigest.digest(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(signingCert.getPublicKey().getEncoded()).getPublicKeyData().getBytes()))) {
                        x509Certificate = signingCert;
                    }
                    x509Certificate = null;
                }
            } else {
                org.bouncycastle.asn1.x500.X500Name x500Name = org.bouncycastle.asn1.x500.X500Name.getInstance(org.bouncycastle.asn1.x500.style.BCStrictStyle.INSTANCE, responderID.getName());
                if (x509Certificate == null || !x500Name.equals(org.bouncycastle.asn1.x500.X500Name.getInstance(org.bouncycastle.asn1.x500.style.BCStrictStyle.INSTANCE, x509Certificate.getSubjectX500Principal().getEncoded()))) {
                    if (signingCert != null) {
                    }
                    x509Certificate = null;
                }
            }
            if (x509Certificate == null && certs == null) {
                throw new java.security.cert.CertPathValidatorException("OCSP responder certificate not found");
            }
            java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) jcaJceHelper.createCertificateFactory("X.509").generateCertificate(new java.io.ByteArrayInputStream(certs.getObjectAt(0).toASN1Primitive().getEncoded()));
            x509Certificate2.verify(pKIXCertRevocationCheckerParameters.getSigningCert().getPublicKey());
            x509Certificate2.checkValidity(pKIXCertRevocationCheckerParameters.getValidDate());
            org.bouncycastle.asn1.ocsp.ResponderID responderID2 = basicOCSPResponse.getTbsResponseData().getResponderID();
            byte[] keyHash2 = responderID2.getKeyHash();
            if (!(keyHash2 != null ? org.bouncycastle.util.Arrays.areEqual(keyHash2, jcaJceHelper.createMessageDigest("SHA1").digest(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(x509Certificate2.getPublicKey().getEncoded()).getPublicKeyData().getBytes())) : org.bouncycastle.asn1.x500.X500Name.getInstance(org.bouncycastle.asn1.x500.style.BCStrictStyle.INSTANCE, responderID2.getName()).equals(org.bouncycastle.asn1.x500.X500Name.getInstance(org.bouncycastle.asn1.x500.style.BCStrictStyle.INSTANCE, x509Certificate2.getSubjectX500Principal().getEncoded())))) {
                throw new java.security.cert.CertPathValidatorException("responder certificate does not match responderID", null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
            }
            java.util.List<java.lang.String> extendedKeyUsage = x509Certificate2.getExtendedKeyUsage();
            if (extendedKeyUsage == null || !extendedKeyUsage.contains(org.bouncycastle.asn1.x509.KeyPurposeId.id_kp_OCSPSigning.getId())) {
                throw new java.security.cert.CertPathValidatorException("responder certificate not valid for signing OCSP responses", null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
            }
            createSignature.initVerify(x509Certificate2);
            createSignature.update(basicOCSPResponse.getTbsResponseData().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            if (!createSignature.verify(basicOCSPResponse.getSignature().getBytes())) {
                return false;
            }
            if (bArr != null && !org.bouncycastle.util.Arrays.areEqual(bArr, basicOCSPResponse.getTbsResponseData().getResponseExtensions().getExtension(org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers.id_pkix_ocsp_nonce).getExtnValue().getOctets())) {
                throw new java.security.cert.CertPathValidatorException("nonce mismatch in OCSP response", null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
            }
            return true;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("OCSP response failure: ");
            sb3.append(e.getMessage());
            throw new java.security.cert.CertPathValidatorException(sb3.toString(), e, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
        } catch (java.security.cert.CertPathValidatorException e2) {
            throw e2;
        } catch (java.security.GeneralSecurityException e3) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("OCSP response failure: ");
            sb4.append(e3.getMessage());
            throw new java.security.cert.CertPathValidatorException(sb4.toString(), e3, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x019e, code lost:
    
        if (r0.getHashAlgorithm().equals(r1.getCertID().getHashAlgorithm()) != false) goto L66;
     */
    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void check(java.security.cert.Certificate certificate) throws java.security.cert.CertPathValidatorException {
        byte[] bArr;
        boolean z;
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificate;
        java.util.Map<java.security.cert.X509Certificate, byte[]> ocspResponses = this.getInputSizeshNQ4ISI.getOcspResponses();
        java.net.URI ocspResponder = this.getInputSizeshNQ4ISI.getOcspResponder();
        if (ocspResponder == null) {
            if (this.getHighSpeedVideoSizes != null) {
                try {
                    ocspResponder = new java.net.URI(this.getHighSpeedVideoSizes);
                } catch (java.net.URISyntaxException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("configuration error: ");
                    sb.append(e.getMessage());
                    throw new java.security.cert.CertPathValidatorException(sb.toString(), e, this.getHighSpeedVideoFpsRanges.getCertPath(), this.getHighSpeedVideoFpsRanges.getIndex());
                }
            } else {
                ocspResponder = Camera2StreamConfigurationMap(x509Certificate);
            }
        }
        java.net.URI uri = ocspResponder;
        if (ocspResponses.get(x509Certificate) != null || uri == null) {
            java.util.List<java.security.cert.Extension> ocspExtensions = this.getInputSizeshNQ4ISI.getOcspExtensions();
            bArr = null;
            for (int i = 0; i != ocspExtensions.size(); i++) {
                java.security.cert.Extension extension = ocspExtensions.get(i);
                byte[] value = extension.getValue();
                if (org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers.id_pkix_ocsp_nonce.getId().equals(extension.getId())) {
                    bArr = value;
                }
            }
            z = false;
        } else {
            if (this.getHighSpeedVideoSizes == null && this.getInputSizeshNQ4ISI.getOcspResponder() == null && !this.Camera2StreamConfigurationMap) {
                throw new org.bouncycastle.jce.provider.RecoverableCertPathValidatorException("OCSP disabled by \"ocsp.enable\" setting", this.getHighSpeedVideoFpsRanges.getCertPath(), this.getHighSpeedVideoFpsRanges.getIndex());
            }
            try {
                ocspResponses.put(x509Certificate, org.bouncycastle.jce.provider.OcspCache.getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1), Camera2StreamConfigurationMap(), new org.bouncycastle.asn1.ASN1Integer(x509Certificate.getSerialNumber())), this.getHighSpeedVideoFpsRanges, uri, this.getInputSizeshNQ4ISI.getOcspResponderCert(), this.getInputSizeshNQ4ISI.getOcspExtensions(), this.getHighSpeedVideoFpsRangesFor).getEncoded());
                z = true;
                bArr = null;
            } catch (java.io.IOException e2) {
                throw new java.security.cert.CertPathValidatorException("unable to encode OCSP response", e2, this.getHighSpeedVideoFpsRanges.getCertPath(), this.getHighSpeedVideoFpsRanges.getIndex());
            }
        }
        if (ocspResponses.isEmpty()) {
            throw new org.bouncycastle.jce.provider.RecoverableCertPathValidatorException("no OCSP response found for any certificate", this.getHighSpeedVideoFpsRanges.getCertPath(), this.getHighSpeedVideoFpsRanges.getIndex());
        }
        org.bouncycastle.asn1.ocsp.OCSPResponse oCSPResponse = org.bouncycastle.asn1.ocsp.OCSPResponse.getInstance(ocspResponses.get(x509Certificate));
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = new org.bouncycastle.asn1.ASN1Integer(x509Certificate.getSerialNumber());
        if (oCSPResponse == null) {
            throw new org.bouncycastle.jce.provider.RecoverableCertPathValidatorException("no OCSP response found for certificate", this.getHighSpeedVideoFpsRanges.getCertPath(), this.getHighSpeedVideoFpsRanges.getIndex());
        }
        if (oCSPResponse.getResponseStatus().getIntValue() != 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("OCSP response failed: ");
            sb2.append(oCSPResponse.getResponseStatus().getValue());
            throw new java.security.cert.CertPathValidatorException(sb2.toString(), null, this.getHighSpeedVideoFpsRanges.getCertPath(), this.getHighSpeedVideoFpsRanges.getIndex());
        }
        org.bouncycastle.asn1.ocsp.ResponseBytes responseBytes = org.bouncycastle.asn1.ocsp.ResponseBytes.getInstance(oCSPResponse.getResponseBytes());
        if (responseBytes.getResponseType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers.id_pkix_ocsp_basic)) {
            try {
                org.bouncycastle.asn1.ocsp.BasicOCSPResponse basicOCSPResponse = org.bouncycastle.asn1.ocsp.BasicOCSPResponse.getInstance(responseBytes.getResponse().getOctets());
                if (z || getHighSpeedVideoFpsRanges(basicOCSPResponse, this.getHighSpeedVideoFpsRanges, bArr, this.getInputSizeshNQ4ISI.getOcspResponderCert(), this.getHighSpeedVideoFpsRangesFor)) {
                    org.bouncycastle.asn1.ASN1Sequence responses = org.bouncycastle.asn1.ocsp.ResponseData.getInstance(basicOCSPResponse.getTbsResponseData()).getResponses();
                    org.bouncycastle.asn1.ocsp.CertID certID = null;
                    for (int i2 = 0; i2 != responses.size(); i2++) {
                        org.bouncycastle.asn1.ocsp.SingleResponse singleResponse = org.bouncycastle.asn1.ocsp.SingleResponse.getInstance(responses.getObjectAt(i2));
                        if (aSN1Integer.equals((org.bouncycastle.asn1.ASN1Primitive) singleResponse.getCertID().getSerialNumber())) {
                            org.bouncycastle.asn1.ASN1GeneralizedTime nextUpdate = singleResponse.getNextUpdate();
                            if (nextUpdate != null && this.getHighSpeedVideoFpsRanges.getValidDate().after(nextUpdate.getDate())) {
                                throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException("OCSP response expired");
                            }
                            certID = getHighSpeedVideoFpsRangesFor(singleResponse.getCertID().getHashAlgorithm(), Camera2StreamConfigurationMap(), aSN1Integer);
                            if (certID.equals(singleResponse.getCertID())) {
                                if (singleResponse.getCertStatus().getTagNo() == 0) {
                                    return;
                                }
                                if (singleResponse.getCertStatus().getTagNo() != 1) {
                                    throw new java.security.cert.CertPathValidatorException("certificate revoked, details unknown", null, this.getHighSpeedVideoFpsRanges.getCertPath(), this.getHighSpeedVideoFpsRanges.getIndex());
                                }
                                org.bouncycastle.asn1.ocsp.RevokedInfo revokedInfo = org.bouncycastle.asn1.ocsp.RevokedInfo.getInstance(singleResponse.getCertStatus().getStatus());
                                org.bouncycastle.asn1.x509.CRLReason revocationReason = revokedInfo.getRevocationReason();
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                sb3.append("certificate revoked, reason=(");
                                sb3.append(revocationReason);
                                sb3.append("), date=");
                                sb3.append(revokedInfo.getRevocationTime().getDate());
                                throw new java.security.cert.CertPathValidatorException(sb3.toString(), null, this.getHighSpeedVideoFpsRanges.getCertPath(), this.getHighSpeedVideoFpsRanges.getIndex());
                            }
                        }
                    }
                }
            } catch (java.security.cert.CertPathValidatorException e3) {
                throw e3;
            } catch (java.lang.Exception e4) {
                throw new java.security.cert.CertPathValidatorException("unable to process OCSP response", e4, this.getHighSpeedVideoFpsRanges.getCertPath(), this.getHighSpeedVideoFpsRanges.getIndex());
            }
        }
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void initialize(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters) {
        this.getHighSpeedVideoFpsRanges = pKIXCertRevocationCheckerParameters;
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Properties.isOverrideSet("ocsp.enable");
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Properties.getPropertyValue("ocsp.responderURL");
    }

    private static java.net.URI Camera2StreamConfigurationMap(java.security.cert.X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(org.bouncycastle.asn1.x509.Extension.authorityInfoAccess.getId());
        if (extensionValue == null) {
            return null;
        }
        org.bouncycastle.asn1.x509.AccessDescription[] accessDescriptions = org.bouncycastle.asn1.x509.AuthorityInformationAccess.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(extensionValue).getOctets()).getAccessDescriptions();
        for (int i = 0; i != accessDescriptions.length; i++) {
            org.bouncycastle.asn1.x509.AccessDescription accessDescription = accessDescriptions[i];
            if (org.bouncycastle.asn1.x509.AccessDescription.id_ad_ocsp.equals((org.bouncycastle.asn1.ASN1Primitive) accessDescription.getAccessMethod())) {
                org.bouncycastle.asn1.x509.GeneralName accessLocation = accessDescription.getAccessLocation();
                if (accessLocation.getTagNo() == 6) {
                    try {
                        return new java.net.URI(((org.bouncycastle.asn1.ASN1String) accessLocation.getName()).getString());
                    } catch (java.net.URISyntaxException unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private org.bouncycastle.asn1.x509.Certificate Camera2StreamConfigurationMap() throws java.security.cert.CertPathValidatorException {
        try {
            return org.bouncycastle.asn1.x509.Certificate.getInstance(this.getHighSpeedVideoFpsRanges.getSigningCert().getEncoded());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot process signing cert: ");
            sb.append(e.getMessage());
            throw new java.security.cert.CertPathValidatorException(sb.toString(), e, this.getHighSpeedVideoFpsRanges.getCertPath(), this.getHighSpeedVideoFpsRanges.getIndex());
        }
    }

    private org.bouncycastle.asn1.ocsp.CertID getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.Certificate certificate, org.bouncycastle.asn1.ASN1Integer aSN1Integer) throws java.security.cert.CertPathValidatorException {
        try {
            java.security.MessageDigest createMessageDigest = this.getHighSpeedVideoFpsRangesFor.createMessageDigest(org.bouncycastle.jcajce.util.MessageDigestUtils.getDigestName(algorithmIdentifier.getAlgorithm()));
            return new org.bouncycastle.asn1.ocsp.CertID(algorithmIdentifier, new org.bouncycastle.asn1.DEROctetString(createMessageDigest.digest(certificate.getSubject().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER))), new org.bouncycastle.asn1.DEROctetString(createMessageDigest.digest(certificate.getSubjectPublicKeyInfo().getPublicKeyData().getBytes())), aSN1Integer);
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CertPathValidatorException("problem creating ID: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public ProvOcspRevocationChecker(org.bouncycastle.jce.provider.ProvRevocationChecker provRevocationChecker, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        this.getInputSizeshNQ4ISI = provRevocationChecker;
        this.getHighSpeedVideoFpsRangesFor = jcaJceHelper;
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighResolutionOutputSizeshNQ4ISI = hashMap;
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224WITHRSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256WITHRSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384WITHRSA");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512WITHRSA");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3411WITHGOST3410");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "GOST3411WITHECGOST3410");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, "GOST3411-2012-256WITHECGOST3410-2012-256");
        hashMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, "GOST3411-2012-512WITHECGOST3410-2012-512");
        hashMap.put(org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA1, "SHA1WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA224, "SHA224WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA256, "SHA256WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA384, "SHA384WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_SHA512, "SHA512WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, "RIPEMD160WITHPLAIN-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "SHA1WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "SHA224WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "SHA256WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "SHA384WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.internal.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "SHA512WITHCVC-ECDSA");
        hashMap.put(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmss, "XMSS");
        hashMap.put(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmssmt, "XMSSMT");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.10040.4.3"), "SHA1WITHDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1, "SHA1WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA224, "SHA224WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA256, "SHA256WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA384, "SHA384WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA512, "SHA512WITHECDSA");
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.sha1WithRSA, "SHA1WITHRSA");
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1, "SHA1WITHDSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha224, "SHA224WITHDSA");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha256, "SHA256WITHDSA");
    }
}
