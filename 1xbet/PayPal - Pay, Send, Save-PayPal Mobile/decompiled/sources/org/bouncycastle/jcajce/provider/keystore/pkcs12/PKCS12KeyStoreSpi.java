package org.bouncycastle.jcajce.provider.keystore.pkcs12;

/* loaded from: classes17.dex */
public class PKCS12KeyStoreSpi extends java.security.KeyStoreSpi implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, org.bouncycastle.asn1.x509.X509ObjectIdentifiers, org.bouncycastle.jce.interfaces.BCKeyStore {
    private static final org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.DefaultSecretKeyProvider getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.DefaultSecretKeyProvider();
    private java.security.cert.CertificateFactory Camera2StreamConfigurationMap;
    private org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getOutputMinFrameDuration;
    private org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable getOutputMinFrameDurationlomOqCM;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getOutputFormats = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
    private java.util.Hashtable getHighResolutionOutputSizeshNQ4ISI = new java.util.Hashtable();
    private java.util.Hashtable getInputFormats = new java.util.Hashtable();
    protected java.security.SecureRandom random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getOutputSizes = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, org.bouncycastle.asn1.DERNull.INSTANCE);
    private int getInputSizeshNQ4ISI = 102400;
    private int getOutputSizeshNQ4ISI = 20;

    @Override // java.security.KeyStoreSpi
    public boolean engineProbe(java.io.InputStream inputStream) throws java.io.IOException {
        return false;
    }

    private javax.crypto.Cipher getHighSpeedVideoSizes(int i, char[] cArr, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException, java.security.NoSuchProviderException {
        java.security.spec.KeySpec pBKDF2KeySpec;
        java.security.spec.AlgorithmParameterSpec gOST28147ParameterSpec;
        org.bouncycastle.asn1.pkcs.PBES2Parameters pBES2Parameters = org.bouncycastle.asn1.pkcs.PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        org.bouncycastle.asn1.pkcs.PBKDF2Params pBKDF2Params = org.bouncycastle.asn1.pkcs.PBKDF2Params.getInstance(pBES2Parameters.getKeyDerivationFunc().getParameters());
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2 = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
        javax.crypto.SecretKeyFactory createSecretKeyFactory = this.getOutputFormats.createSecretKeyFactory(pBES2Parameters.getKeyDerivationFunc().getAlgorithm().getId());
        if (pBKDF2Params.isDefaultPrf()) {
            byte[] salt = pBKDF2Params.getSalt();
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(pBKDF2Params.getIterationCount());
            java.lang.Integer num = (java.lang.Integer) getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.get(algorithmIdentifier2.getAlgorithm());
            pBKDF2KeySpec = new javax.crypto.spec.PBEKeySpec(cArr, salt, highSpeedVideoFpsRangesFor, num != null ? num.intValue() : -1);
        } else {
            byte[] salt2 = pBKDF2Params.getSalt();
            int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(pBKDF2Params.getIterationCount());
            java.lang.Integer num2 = (java.lang.Integer) getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.get(algorithmIdentifier2.getAlgorithm());
            pBKDF2KeySpec = new org.bouncycastle.jcajce.spec.PBKDF2KeySpec(cArr, salt2, highSpeedVideoFpsRangesFor2, num2 != null ? num2.intValue() : -1, pBKDF2Params.getPrf());
        }
        javax.crypto.SecretKey generateSecret = createSecretKeyFactory.generateSecret(pBKDF2KeySpec);
        javax.crypto.Cipher createCipher = this.getOutputFormats.createCipher(pBES2Parameters.getEncryptionScheme().getAlgorithm().getId());
        org.bouncycastle.asn1.ASN1Encodable parameters = pBES2Parameters.getEncryptionScheme().getParameters();
        if (parameters instanceof org.bouncycastle.asn1.ASN1OctetString) {
            gOST28147ParameterSpec = new javax.crypto.spec.IvParameterSpec(org.bouncycastle.asn1.ASN1OctetString.getInstance(parameters).getOctets());
        } else {
            org.bouncycastle.asn1.cryptopro.GOST28147Parameters gOST28147Parameters = org.bouncycastle.asn1.cryptopro.GOST28147Parameters.getInstance(parameters);
            gOST28147ParameterSpec = new org.bouncycastle.jcajce.spec.GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV());
        }
        createCipher.init(i, generateSecret, gOST28147ParameterSpec);
        return createCipher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.bouncycastle.asn1.x509.SubjectKeyIdentifier Camera2StreamConfigurationMap(java.security.PublicKey publicKey) {
        try {
            org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded());
            org.bouncycastle.crypto.Digest createSHA1 = org.bouncycastle.crypto.util.DigestFactory.createSHA1();
            byte[] bArr = new byte[createSHA1.getDigestSize()];
            byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
            createSHA1.update(bytes, 0, bytes.length);
            createSHA1.doFinal(bArr, 0);
            return new org.bouncycastle.asn1.x509.SubjectKeyIdentifier(bArr);
        } catch (java.lang.Exception unused) {
            throw new java.lang.RuntimeException("error creating key");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.security.cert.Certificate] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Dictionary, java.util.Hashtable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Dictionary] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.security.cert.Certificate] */
    private void getHighSpeedVideoFpsRanges(java.io.OutputStream outputStream, char[] cArr, boolean z) throws java.io.IOException {
        java.lang.String str;
        int size = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges.size();
        java.lang.String str2 = org.bouncycastle.asn1.ASN1Encoding.DER;
        java.lang.String str3 = org.bouncycastle.asn1.ASN1Encoding.BER;
        if (size == 0) {
            if (cArr == null) {
                java.util.Enumeration keys = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.keys();
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
                while (keys.hasMoreElements()) {
                    try {
                        java.lang.String str4 = (java.lang.String) keys.nextElement();
                        aSN1EncodableVector.add(getHighResolutionOutputSizeshNQ4ISI(str4, (java.security.cert.Certificate) this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(str4)));
                    } catch (java.security.cert.CertificateEncodingException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Error encoding certificate: ");
                        sb.append(e.toString());
                        throw new java.io.IOException(sb.toString());
                    }
                }
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.data;
                if (z) {
                    new org.bouncycastle.asn1.pkcs.Pfx(new org.bouncycastle.asn1.pkcs.ContentInfo(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.data, new org.bouncycastle.asn1.DEROctetString(new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.pkcs.ContentInfo(aSN1ObjectIdentifier, new org.bouncycastle.asn1.DEROctetString(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded()))).getEncoded())), null).encodeTo(outputStream, org.bouncycastle.asn1.ASN1Encoding.DER);
                    return;
                } else {
                    new org.bouncycastle.asn1.pkcs.Pfx(new org.bouncycastle.asn1.pkcs.ContentInfo(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.data, new org.bouncycastle.asn1.BEROctetString(new org.bouncycastle.asn1.BERSequence(new org.bouncycastle.asn1.pkcs.ContentInfo(aSN1ObjectIdentifier, new org.bouncycastle.asn1.BEROctetString(new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector).getEncoded()))).getEncoded())), null).encodeTo(outputStream, org.bouncycastle.asn1.ASN1Encoding.BER);
                    return;
                }
            }
        } else if (cArr == null) {
            throw new java.lang.NullPointerException("no password supplied for PKCS#12 KeyStore");
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.util.Enumeration keys2 = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges.keys();
        while (keys2.hasMoreElements()) {
            byte[] bArr = new byte[20];
            this.random.nextBytes(bArr);
            java.lang.String str5 = (java.lang.String) keys2.nextElement();
            java.security.PrivateKey privateKey = (java.security.PrivateKey) this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(str5);
            org.bouncycastle.asn1.pkcs.PKCS12PBEParams pKCS12PBEParams = new org.bouncycastle.asn1.pkcs.PKCS12PBEParams(bArr, 51200);
            org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getOutputMinFrameDuration, pKCS12PBEParams.toASN1Primitive()), wrapKey(this.getOutputMinFrameDuration.getId(), privateKey, pKCS12PBEParams, cArr));
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector3 = new org.bouncycastle.asn1.ASN1EncodableVector();
            if (privateKey instanceof org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) {
                org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) privateKey;
                org.bouncycastle.asn1.ASN1BMPString aSN1BMPString = (org.bouncycastle.asn1.ASN1BMPString) pKCS12BagAttributeCarrier.getBagAttribute(pkcs_9_at_friendlyName);
                if (aSN1BMPString == null || !aSN1BMPString.getString().equals(str5)) {
                    pKCS12BagAttributeCarrier.setBagAttribute(pkcs_9_at_friendlyName, new org.bouncycastle.asn1.DERBMPString(str5));
                }
                if (pKCS12BagAttributeCarrier.getBagAttribute(pkcs_9_at_localKeyId) == null) {
                    pKCS12BagAttributeCarrier.setBagAttribute(pkcs_9_at_localKeyId, Camera2StreamConfigurationMap(engineGetCertificate(str5).getPublicKey()));
                }
                java.util.Enumeration bagAttributeKeys = pKCS12BagAttributeCarrier.getBagAttributeKeys();
                boolean z2 = false;
                while (bagAttributeKeys.hasMoreElements()) {
                    org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) bagAttributeKeys.nextElement();
                    org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector4 = new org.bouncycastle.asn1.ASN1EncodableVector();
                    aSN1EncodableVector4.add(aSN1ObjectIdentifier2);
                    aSN1EncodableVector4.add(new org.bouncycastle.asn1.DERSet(pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier2)));
                    aSN1EncodableVector3.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector4));
                    z2 = true;
                }
                if (z2) {
                    aSN1EncodableVector2.add(new org.bouncycastle.asn1.pkcs.SafeBag(pkcs8ShroudedKeyBag, encryptedPrivateKeyInfo.toASN1Primitive(), new org.bouncycastle.asn1.DERSet(aSN1EncodableVector3)));
                }
            }
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector5 = new org.bouncycastle.asn1.ASN1EncodableVector();
            java.security.cert.Certificate engineGetCertificate = engineGetCertificate(str5);
            aSN1EncodableVector5.add(pkcs_9_at_localKeyId);
            aSN1EncodableVector5.add(new org.bouncycastle.asn1.DERSet(Camera2StreamConfigurationMap(engineGetCertificate.getPublicKey())));
            aSN1EncodableVector3.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector5));
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector6 = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector6.add(pkcs_9_at_friendlyName);
            aSN1EncodableVector6.add(new org.bouncycastle.asn1.DERSet(new org.bouncycastle.asn1.DERBMPString(str5)));
            aSN1EncodableVector3.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector6));
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.pkcs.SafeBag(pkcs8ShroudedKeyBag, encryptedPrivateKeyInfo.toASN1Primitive(), new org.bouncycastle.asn1.DERSet(aSN1EncodableVector3)));
        }
        org.bouncycastle.asn1.BEROctetString bEROctetString = new org.bouncycastle.asn1.BEROctetString(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
        byte[] bArr2 = new byte[20];
        this.random.nextBytes(bArr2);
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector7 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.asn1.pkcs.PKCS12PBEParams(bArr2, 51200).toASN1Primitive());
        java.lang.Object hashtable = new java.util.Hashtable();
        java.util.Enumeration keys3 = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges.keys();
        while (keys3.hasMoreElements()) {
            try {
                java.lang.String str6 = (java.lang.String) keys3.nextElement();
                ?? engineGetCertificate2 = engineGetCertificate(str6);
                java.util.Enumeration enumeration = keys3;
                org.bouncycastle.asn1.pkcs.CertBag certBag = new org.bouncycastle.asn1.pkcs.CertBag(x509Certificate, new org.bouncycastle.asn1.DEROctetString(engineGetCertificate2.getEncoded()));
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector8 = new org.bouncycastle.asn1.ASN1EncodableVector();
                if (engineGetCertificate2 instanceof org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) {
                    org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier2 = (org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) engineGetCertificate2;
                    org.bouncycastle.asn1.ASN1BMPString aSN1BMPString2 = (org.bouncycastle.asn1.ASN1BMPString) pKCS12BagAttributeCarrier2.getBagAttribute(pkcs_9_at_friendlyName);
                    if (aSN1BMPString2 == null || !aSN1BMPString2.getString().equals(str6)) {
                        pKCS12BagAttributeCarrier2.setBagAttribute(pkcs_9_at_friendlyName, new org.bouncycastle.asn1.DERBMPString(str6));
                    }
                    if (pKCS12BagAttributeCarrier2.getBagAttribute(pkcs_9_at_localKeyId) == null) {
                        pKCS12BagAttributeCarrier2.setBagAttribute(pkcs_9_at_localKeyId, Camera2StreamConfigurationMap(engineGetCertificate2.getPublicKey()));
                    }
                    java.util.Enumeration bagAttributeKeys2 = pKCS12BagAttributeCarrier2.getBagAttributeKeys();
                    boolean z3 = false;
                    while (bagAttributeKeys2.hasMoreElements()) {
                        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) bagAttributeKeys2.nextElement();
                        java.util.Enumeration enumeration2 = bagAttributeKeys2;
                        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector9 = new org.bouncycastle.asn1.ASN1EncodableVector();
                        aSN1EncodableVector9.add(aSN1ObjectIdentifier3);
                        aSN1EncodableVector9.add(new org.bouncycastle.asn1.DERSet(pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier3)));
                        aSN1EncodableVector8.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector9));
                        bagAttributeKeys2 = enumeration2;
                        str3 = str3;
                        z3 = true;
                    }
                    str = str3;
                    if (!z3) {
                    }
                    aSN1EncodableVector7.add(new org.bouncycastle.asn1.pkcs.SafeBag(certBag, certBag.toASN1Primitive(), new org.bouncycastle.asn1.DERSet(aSN1EncodableVector8)));
                    hashtable.put(engineGetCertificate2, engineGetCertificate2);
                    keys3 = enumeration;
                    str3 = str;
                } else {
                    str = str3;
                }
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector10 = new org.bouncycastle.asn1.ASN1EncodableVector();
                aSN1EncodableVector10.add(pkcs_9_at_localKeyId);
                aSN1EncodableVector10.add(new org.bouncycastle.asn1.DERSet(Camera2StreamConfigurationMap(engineGetCertificate2.getPublicKey())));
                aSN1EncodableVector8.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector10));
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector11 = new org.bouncycastle.asn1.ASN1EncodableVector();
                aSN1EncodableVector11.add(pkcs_9_at_friendlyName);
                aSN1EncodableVector11.add(new org.bouncycastle.asn1.DERSet(new org.bouncycastle.asn1.DERBMPString(str6)));
                aSN1EncodableVector8.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector11));
                aSN1EncodableVector7.add(new org.bouncycastle.asn1.pkcs.SafeBag(certBag, certBag.toASN1Primitive(), new org.bouncycastle.asn1.DERSet(aSN1EncodableVector8)));
                hashtable.put(engineGetCertificate2, engineGetCertificate2);
                keys3 = enumeration;
                str3 = str;
            } catch (java.security.cert.CertificateEncodingException e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Error encoding certificate: ");
                sb2.append(e2.toString());
                throw new java.io.IOException(sb2.toString());
            }
        }
        java.lang.String str7 = str3;
        java.util.Enumeration keys4 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.keys();
        while (keys4.hasMoreElements()) {
            try {
                java.lang.String str8 = (java.lang.String) keys4.nextElement();
                java.security.cert.Certificate certificate = (java.security.cert.Certificate) this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(str8);
                if (this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(str8) == null) {
                    aSN1EncodableVector7.add(getHighResolutionOutputSizeshNQ4ISI(str8, certificate));
                    hashtable.put(certificate, certificate);
                }
            } catch (java.security.cert.CertificateEncodingException e3) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Error encoding certificate: ");
                sb3.append(e3.toString());
                throw new java.io.IOException(sb3.toString());
            }
        }
        ?? highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        java.util.Enumeration keys5 = this.getHighResolutionOutputSizeshNQ4ISI.keys();
        while (keys5.hasMoreElements()) {
            try {
                ?? r6 = (java.security.cert.Certificate) this.getHighResolutionOutputSizeshNQ4ISI.get((org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.CertId) keys5.nextElement());
                if (highSpeedVideoFpsRanges.contains(r6) && hashtable.get(r6) == null) {
                    org.bouncycastle.asn1.pkcs.CertBag certBag2 = new org.bouncycastle.asn1.pkcs.CertBag(x509Certificate, new org.bouncycastle.asn1.DEROctetString(r6.getEncoded()));
                    org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector12 = new org.bouncycastle.asn1.ASN1EncodableVector();
                    if (r6 instanceof org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) {
                        org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier3 = (org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) r6;
                        java.util.Enumeration bagAttributeKeys3 = pKCS12BagAttributeCarrier3.getBagAttributeKeys();
                        while (bagAttributeKeys3.hasMoreElements()) {
                            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier4 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) bagAttributeKeys3.nextElement();
                            if (!aSN1ObjectIdentifier4.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector13 = new org.bouncycastle.asn1.ASN1EncodableVector();
                                aSN1EncodableVector13.add(aSN1ObjectIdentifier4);
                                aSN1EncodableVector13.add(new org.bouncycastle.asn1.DERSet(pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier4)));
                                aSN1EncodableVector12.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector13));
                                hashtable = hashtable;
                            }
                        }
                    }
                    java.lang.Object obj = hashtable;
                    aSN1EncodableVector7.add(new org.bouncycastle.asn1.pkcs.SafeBag(certBag, certBag2.toASN1Primitive(), new org.bouncycastle.asn1.DERSet(aSN1EncodableVector12)));
                    hashtable = obj;
                }
            } catch (java.security.cert.CertificateEncodingException e4) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Error encoding certificate: ");
                sb4.append(e4.toString());
                throw new java.io.IOException(sb4.toString());
            }
        }
        org.bouncycastle.asn1.pkcs.ContentInfo contentInfo = new org.bouncycastle.asn1.pkcs.ContentInfo(data, new org.bouncycastle.asn1.BEROctetString(new org.bouncycastle.asn1.pkcs.AuthenticatedSafe(new org.bouncycastle.asn1.pkcs.ContentInfo[]{new org.bouncycastle.asn1.pkcs.ContentInfo(data, bEROctetString), new org.bouncycastle.asn1.pkcs.ContentInfo(encryptedData, new org.bouncycastle.asn1.pkcs.EncryptedData(data, algorithmIdentifier, new org.bouncycastle.asn1.BEROctetString(cryptData(true, algorithmIdentifier, cArr, false, new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector7).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER)))).toASN1Primitive())}).getEncoded(z ? org.bouncycastle.asn1.ASN1Encoding.DER : str7)));
        byte[] bArr3 = new byte[this.getOutputSizeshNQ4ISI];
        this.random.nextBytes(bArr3);
        try {
            org.bouncycastle.asn1.pkcs.Pfx pfx = new org.bouncycastle.asn1.pkcs.Pfx(contentInfo, new org.bouncycastle.asn1.pkcs.MacData(new org.bouncycastle.asn1.x509.DigestInfo(this.getOutputSizes, getHighSpeedVideoFpsRanges(this.getOutputSizes.getAlgorithm(), bArr3, this.getInputSizeshNQ4ISI, cArr, false, ((org.bouncycastle.asn1.ASN1OctetString) contentInfo.getContent()).getOctets())), bArr3, this.getInputSizeshNQ4ISI));
            if (!z) {
                str2 = str7;
            }
            pfx.encodeTo(outputStream, str2);
        } catch (java.lang.Exception e5) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("error constructing MAC: ");
            sb5.append(e5.toString());
            throw new java.io.IOException(sb5.toString());
        }
    }

    private java.util.Set getHighSpeedVideoFpsRanges() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Enumeration keys = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges.keys();
        while (keys.hasMoreElements()) {
            java.security.cert.Certificate[] engineGetCertificateChain = engineGetCertificateChain((java.lang.String) keys.nextElement());
            for (int i = 0; i != engineGetCertificateChain.length; i++) {
                hashSet.add(engineGetCertificateChain[i]);
            }
        }
        java.util.Enumeration keys2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.keys();
        while (keys2.hasMoreElements()) {
            hashSet.add(engineGetCertificate((java.lang.String) keys2.nextElement()));
        }
        return hashSet;
    }

    @Override // java.security.KeyStoreSpi
    public java.util.Enumeration engineAliases() {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        java.util.Enumeration keys = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.keys();
        while (keys.hasMoreElements()) {
            hashtable.put(keys.nextElement(), "cert");
        }
        java.util.Enumeration keys2 = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges.keys();
        while (keys2.hasMoreElements()) {
            java.lang.String str = (java.lang.String) keys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate certificate) {
        java.util.Enumeration elements = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.elements();
        java.util.Enumeration keys = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.keys();
        while (elements.hasMoreElements()) {
            java.security.cert.Certificate certificate2 = (java.security.cert.Certificate) elements.nextElement();
            java.lang.String str = (java.lang.String) keys.nextElement();
            if (certificate2.equals(certificate)) {
                return str;
            }
        }
        java.util.Enumeration elements2 = this.getInputFormats.elements();
        java.util.Enumeration keys2 = this.getInputFormats.keys();
        while (elements2.hasMoreElements()) {
            java.security.cert.Certificate certificate3 = (java.security.cert.Certificate) elements2.nextElement();
            java.lang.String str2 = (java.lang.String) keys2.nextElement();
            if (certificate3.equals(certificate)) {
                return str2;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        java.util.Enumeration keys = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.keys();
        while (keys.hasMoreElements()) {
            hashtable.put(keys.nextElement(), "cert");
        }
        java.util.Enumeration keys2 = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges.keys();
        while (keys2.hasMoreElements()) {
            java.lang.String str = (java.lang.String) keys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.size();
    }

    protected byte[] wrapKey(java.lang.String str, java.security.Key key, org.bouncycastle.asn1.pkcs.PKCS12PBEParams pKCS12PBEParams, char[] cArr) throws java.io.IOException {
        javax.crypto.spec.PBEKeySpec pBEKeySpec = new javax.crypto.spec.PBEKeySpec(cArr);
        try {
            javax.crypto.SecretKeyFactory createSecretKeyFactory = this.getOutputFormats.createSecretKeyFactory(str);
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = new javax.crypto.spec.PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
            javax.crypto.Cipher createCipher = this.getOutputFormats.createCipher(str);
            createCipher.init(3, createSecretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return createCipher.wrap(key);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception encrypting data - ");
            sb.append(e.toString());
            throw new java.io.IOException(sb.toString());
        }
    }

    protected java.security.PrivateKey unwrapKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr, char[] cArr, boolean z) throws java.io.IOException {
        javax.crypto.Cipher highSpeedVideoSizes;
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        try {
            if (algorithm.on(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_12PbeIds)) {
                org.bouncycastle.asn1.pkcs.PKCS12PBEParams pKCS12PBEParams = org.bouncycastle.asn1.pkcs.PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
                javax.crypto.spec.PBEParameterSpec pBEParameterSpec = new javax.crypto.spec.PBEParameterSpec(pKCS12PBEParams.getIV(), getHighSpeedVideoFpsRangesFor(pKCS12PBEParams.getIterations()));
                highSpeedVideoSizes = this.getOutputFormats.createCipher(algorithm.getId());
                highSpeedVideoSizes.init(4, new org.bouncycastle.jcajce.PKCS12Key(cArr, z), pBEParameterSpec);
            } else {
                if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2)) {
                    throw new java.io.IOException("exception unwrapping private key - cannot recognise: ".concat(java.lang.String.valueOf(algorithm)));
                }
                highSpeedVideoSizes = getHighSpeedVideoSizes(4, cArr, algorithmIdentifier);
            }
            return (java.security.PrivateKey) highSpeedVideoSizes.unwrap(bArr, "", 2);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception unwrapping private key - ");
            sb.append(e.toString());
            throw new java.io.IOException(sb.toString());
        }
    }

    @Override // org.bouncycastle.jce.interfaces.BCKeyStore
    public void setRandom(java.security.SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
        org.bouncycastle.jcajce.PKCS12StoreParameter pKCS12StoreParameter;
        char[] password;
        if (loadStoreParameter == null) {
            throw new java.lang.IllegalArgumentException("'param' arg cannot be null");
        }
        boolean z = loadStoreParameter instanceof org.bouncycastle.jcajce.PKCS12StoreParameter;
        if (!z && !(loadStoreParameter instanceof org.bouncycastle.jce.provider.JDKPKCS12StoreParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No support for 'param' of type ");
            sb.append(loadStoreParameter.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (z) {
            pKCS12StoreParameter = (org.bouncycastle.jcajce.PKCS12StoreParameter) loadStoreParameter;
        } else {
            org.bouncycastle.jce.provider.JDKPKCS12StoreParameter jDKPKCS12StoreParameter = (org.bouncycastle.jce.provider.JDKPKCS12StoreParameter) loadStoreParameter;
            pKCS12StoreParameter = new org.bouncycastle.jcajce.PKCS12StoreParameter(jDKPKCS12StoreParameter.getOutputStream(), loadStoreParameter.getProtectionParameter(), jDKPKCS12StoreParameter.isUseDEREncoding());
        }
        java.security.KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            password = null;
        } else {
            if (!(protectionParameter instanceof java.security.KeyStore.PasswordProtection)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No support for protection parameter of type ");
                sb2.append(protectionParameter.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            password = ((java.security.KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        getHighSpeedVideoFpsRanges(pKCS12StoreParameter.getOutputStream(), password, pKCS12StoreParameter.isForDEREncoding());
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(java.io.OutputStream outputStream, char[] cArr) throws java.io.IOException {
        getHighSpeedVideoFpsRanges(outputStream, cArr, false);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(java.lang.String str, byte[] bArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
        throw new java.lang.RuntimeException("operation not supported");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(java.lang.String str, java.security.Key key, char[] cArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
        boolean z = key instanceof java.security.PrivateKey;
        if (!z) {
            throw new java.security.KeyStoreException("PKCS12 does not support non-PrivateKeys");
        }
        if (z && certificateArr == null) {
            throw new java.security.KeyStoreException("no certificate chain for private key");
        }
        if (this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(str) != null) {
            engineDeleteEntry(str);
        }
        this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges(str, key);
        if (certificateArr != null) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(str, certificateArr[0]);
            for (int i = 0; i != certificateArr.length; i++) {
                this.getHighResolutionOutputSizeshNQ4ISI.put(new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.CertId(certificateArr[i].getPublicKey()), certificateArr[i]);
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(java.lang.String str, java.security.cert.Certificate certificate) throws java.security.KeyStoreException {
        if (this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(str) == null) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(str, certificate);
            this.getHighResolutionOutputSizeshNQ4ISI.put(new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.CertId(certificate.getPublicKey()), certificate);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("There is a key entry with the name ");
            sb.append(str);
            sb.append(".");
            throw new java.security.KeyStoreException(sb.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else if (loadStoreParameter instanceof org.bouncycastle.jcajce.BCLoadStoreParameter) {
            engineLoad(((org.bouncycastle.jcajce.BCLoadStoreParameter) loadStoreParameter).getInputStream(), org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil.extractPassword(loadStoreParameter));
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("no support for 'param' of type ");
            sb.append(loadStoreParameter.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010c  */
    /* JADX WARN: Type inference failed for: r0v26, types: [org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.security.cert.Certificate] */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void engineLoad(java.io.InputStream inputStream, char[] cArr) throws java.io.IOException {
        boolean z;
        boolean z2;
        int i;
        java.lang.String str;
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString;
        boolean z3;
        int i2;
        boolean z4;
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence;
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive;
        java.lang.String str2;
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString2;
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString3;
        if (inputStream != null) {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
            bufferedInputStream.mark(10);
            int read = bufferedInputStream.read();
            if (read < 0) {
                throw new java.io.EOFException("no data in keystore stream");
            }
            if (read != 48) {
                throw new java.io.IOException("stream does not represent a PKCS12 key store");
            }
            bufferedInputStream.reset();
            try {
                org.bouncycastle.asn1.pkcs.Pfx pfx = org.bouncycastle.asn1.pkcs.Pfx.getInstance(new org.bouncycastle.asn1.ASN1InputStream(bufferedInputStream).readObject());
                org.bouncycastle.asn1.pkcs.ContentInfo authSafe = pfx.getAuthSafe();
                java.util.Vector vector = new java.util.Vector();
                int i3 = 1;
                byte b = 0;
                if (pfx.getMacData() != null) {
                    if (cArr == null) {
                        throw new java.lang.NullPointerException("no password supplied when one expected");
                    }
                    org.bouncycastle.asn1.pkcs.MacData macData = pfx.getMacData();
                    org.bouncycastle.asn1.x509.DigestInfo mac = macData.getMac();
                    this.getOutputSizes = mac.getAlgorithmId();
                    byte[] salt = macData.getSalt();
                    this.getInputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(macData.getIterationCount());
                    this.getOutputSizeshNQ4ISI = salt.length;
                    byte[] octets = ((org.bouncycastle.asn1.ASN1OctetString) authSafe.getContent()).getOctets();
                    try {
                        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getOutputSizes.getAlgorithm(), salt, this.getInputSizeshNQ4ISI, cArr, false, octets);
                        byte[] digest = mac.getDigest();
                        if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(highSpeedVideoFpsRanges, digest)) {
                            if (cArr.length > 0) {
                                throw new java.io.IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                            }
                            if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(getHighSpeedVideoFpsRanges(this.getOutputSizes.getAlgorithm(), salt, this.getInputSizeshNQ4ISI, cArr, true, octets), digest)) {
                                throw new java.io.IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                            }
                            z = true;
                            this.getHighSpeedVideoSizesFor = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable(b);
                            this.getOutputMinFrameDurationlomOqCM = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable(b);
                            if (authSafe.getContentType().equals((org.bouncycastle.asn1.ASN1Primitive) data)) {
                                z2 = false;
                            } else {
                                org.bouncycastle.asn1.pkcs.ContentInfo[] contentInfo = org.bouncycastle.asn1.pkcs.AuthenticatedSafe.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(authSafe.getContent()).getOctets()).getContentInfo();
                                int i4 = 0;
                                z2 = false;
                                while (i4 != contentInfo.length) {
                                    if (contentInfo[i4].getContentType().equals((org.bouncycastle.asn1.ASN1Primitive) data)) {
                                        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(contentInfo[i4].getContent()).getOctets());
                                        int i5 = b;
                                        while (i5 != aSN1Sequence2.size()) {
                                            org.bouncycastle.asn1.pkcs.SafeBag safeBag = org.bouncycastle.asn1.pkcs.SafeBag.getInstance(aSN1Sequence2.getObjectAt(i5));
                                            if (safeBag.getBagId().equals((org.bouncycastle.asn1.ASN1Primitive) pkcs8ShroudedKeyBag)) {
                                                org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo.getInstance(safeBag.getBagValue());
                                                java.security.PrivateKey unwrapKey = unwrapKey(encryptedPrivateKeyInfo.getEncryptionAlgorithm(), encryptedPrivateKeyInfo.getEncryptedData(), cArr, z);
                                                if (safeBag.getBagAttributes() != null) {
                                                    java.util.Enumeration objects = safeBag.getBagAttributes().getObjects();
                                                    str2 = null;
                                                    aSN1OctetString2 = null;
                                                    while (objects.hasMoreElements()) {
                                                        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence3 = (org.bouncycastle.asn1.ASN1Sequence) objects.nextElement();
                                                        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(b);
                                                        org.bouncycastle.asn1.ASN1Set aSN1Set = (org.bouncycastle.asn1.ASN1Set) aSN1Sequence3.getObjectAt(i3);
                                                        if (aSN1Set.size() > 0) {
                                                            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive2 = (org.bouncycastle.asn1.ASN1Primitive) aSN1Set.getObjectAt(0);
                                                            aSN1OctetString3 = aSN1Primitive2;
                                                            if (unwrapKey instanceof org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) {
                                                                org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) unwrapKey;
                                                                org.bouncycastle.asn1.ASN1Encodable bagAttribute = pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
                                                                if (bagAttribute != null) {
                                                                    boolean equals = bagAttribute.toASN1Primitive().equals(aSN1Primitive2);
                                                                    aSN1OctetString3 = aSN1Primitive2;
                                                                    if (!equals) {
                                                                        throw new java.io.IOException("attempt to add existing attribute with different value");
                                                                    }
                                                                } else {
                                                                    pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Primitive2);
                                                                    aSN1OctetString3 = aSN1Primitive2;
                                                                }
                                                            }
                                                        } else {
                                                            aSN1OctetString3 = 0;
                                                        }
                                                        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) pkcs_9_at_friendlyName)) {
                                                            str2 = ((org.bouncycastle.asn1.ASN1BMPString) aSN1OctetString3).getString();
                                                            this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges(str2, unwrapKey);
                                                        } else if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) pkcs_9_at_localKeyId)) {
                                                            aSN1OctetString2 = aSN1OctetString3;
                                                        }
                                                        i3 = 1;
                                                        b = 0;
                                                    }
                                                } else {
                                                    str2 = null;
                                                    aSN1OctetString2 = null;
                                                }
                                                if (aSN1OctetString2 != null) {
                                                    java.lang.String str3 = new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(aSN1OctetString2.getOctets()));
                                                    if (str2 == null) {
                                                        this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges(str3, unwrapKey);
                                                    } else {
                                                        this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges(str2, str3);
                                                    }
                                                } else {
                                                    this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges("unmarked", unwrapKey);
                                                    z2 = true;
                                                }
                                            } else if (safeBag.getBagId().equals((org.bouncycastle.asn1.ASN1Primitive) certBag)) {
                                                vector.addElement(safeBag);
                                            } else {
                                                java.io.PrintStream printStream = java.lang.System.out;
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder("extra in data ");
                                                sb.append(safeBag.getBagId());
                                                printStream.println(sb.toString());
                                                java.lang.System.out.println(org.bouncycastle.asn1.util.ASN1Dump.dumpAsString(safeBag));
                                            }
                                            i5++;
                                            i3 = 1;
                                            b = 0;
                                        }
                                        z3 = z;
                                        i2 = i4;
                                    } else if (contentInfo[i4].getContentType().equals((org.bouncycastle.asn1.ASN1Primitive) encryptedData)) {
                                        org.bouncycastle.asn1.pkcs.EncryptedData encryptedData = org.bouncycastle.asn1.pkcs.EncryptedData.getInstance(contentInfo[i4].getContent());
                                        i2 = i4;
                                        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence4 = org.bouncycastle.asn1.ASN1Sequence.getInstance(cryptData(false, encryptedData.getEncryptionAlgorithm(), cArr, z, encryptedData.getContent().getOctets()));
                                        int i6 = 0;
                                        while (i6 != aSN1Sequence4.size()) {
                                            org.bouncycastle.asn1.pkcs.SafeBag safeBag2 = org.bouncycastle.asn1.pkcs.SafeBag.getInstance(aSN1Sequence4.getObjectAt(i6));
                                            if (safeBag2.getBagId().equals((org.bouncycastle.asn1.ASN1Primitive) certBag)) {
                                                vector.addElement(safeBag2);
                                                z4 = z;
                                                aSN1Sequence = aSN1Sequence4;
                                            } else if (safeBag2.getBagId().equals((org.bouncycastle.asn1.ASN1Primitive) pkcs8ShroudedKeyBag)) {
                                                org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo encryptedPrivateKeyInfo2 = org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo.getInstance(safeBag2.getBagValue());
                                                java.security.PrivateKey unwrapKey2 = unwrapKey(encryptedPrivateKeyInfo2.getEncryptionAlgorithm(), encryptedPrivateKeyInfo2.getEncryptedData(), cArr, z);
                                                org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier2 = (org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) unwrapKey2;
                                                java.util.Enumeration objects2 = safeBag2.getBagAttributes().getObjects();
                                                org.bouncycastle.asn1.ASN1OctetString aSN1OctetString4 = null;
                                                java.lang.String str4 = null;
                                                while (objects2.hasMoreElements()) {
                                                    org.bouncycastle.asn1.ASN1Sequence aSN1Sequence5 = (org.bouncycastle.asn1.ASN1Sequence) objects2.nextElement();
                                                    boolean z5 = z;
                                                    org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence5.getObjectAt(0);
                                                    org.bouncycastle.asn1.ASN1Sequence aSN1Sequence6 = aSN1Sequence4;
                                                    org.bouncycastle.asn1.ASN1Set aSN1Set2 = (org.bouncycastle.asn1.ASN1Set) aSN1Sequence5.getObjectAt(1);
                                                    if (aSN1Set2.size() > 0) {
                                                        aSN1Primitive = (org.bouncycastle.asn1.ASN1Primitive) aSN1Set2.getObjectAt(0);
                                                        org.bouncycastle.asn1.ASN1Encodable bagAttribute2 = pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier2);
                                                        if (bagAttribute2 == null) {
                                                            pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier2, aSN1Primitive);
                                                        } else if (!bagAttribute2.toASN1Primitive().equals(aSN1Primitive)) {
                                                            throw new java.io.IOException("attempt to add existing attribute with different value");
                                                        }
                                                    } else {
                                                        aSN1Primitive = null;
                                                    }
                                                    if (aSN1ObjectIdentifier2.equals((org.bouncycastle.asn1.ASN1Primitive) pkcs_9_at_friendlyName)) {
                                                        str4 = ((org.bouncycastle.asn1.ASN1BMPString) aSN1Primitive).getString();
                                                        this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges(str4, unwrapKey2);
                                                    } else if (aSN1ObjectIdentifier2.equals((org.bouncycastle.asn1.ASN1Primitive) pkcs_9_at_localKeyId)) {
                                                        aSN1OctetString4 = (org.bouncycastle.asn1.ASN1OctetString) aSN1Primitive;
                                                    }
                                                    z = z5;
                                                    aSN1Sequence4 = aSN1Sequence6;
                                                }
                                                z4 = z;
                                                aSN1Sequence = aSN1Sequence4;
                                                java.lang.String str5 = new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(aSN1OctetString4.getOctets()));
                                                if (str4 == null) {
                                                    this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges(str5, unwrapKey2);
                                                } else {
                                                    this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges(str4, str5);
                                                }
                                            } else {
                                                z4 = z;
                                                aSN1Sequence = aSN1Sequence4;
                                                if (safeBag2.getBagId().equals((org.bouncycastle.asn1.ASN1Primitive) keyBag)) {
                                                    java.security.PrivateKey privateKey = org.bouncycastle.jce.provider.BouncyCastleProvider.getPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(safeBag2.getBagValue()));
                                                    org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier3 = (org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) privateKey;
                                                    java.util.Enumeration objects3 = safeBag2.getBagAttributes().getObjects();
                                                    org.bouncycastle.asn1.ASN1OctetString aSN1OctetString5 = null;
                                                    java.lang.String str6 = null;
                                                    while (objects3.hasMoreElements()) {
                                                        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence7 = org.bouncycastle.asn1.ASN1Sequence.getInstance(objects3.nextElement());
                                                        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence7.getObjectAt(0));
                                                        org.bouncycastle.asn1.ASN1Set aSN1Set3 = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1Sequence7.getObjectAt(1));
                                                        if (aSN1Set3.size() > 0) {
                                                            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive3 = (org.bouncycastle.asn1.ASN1Primitive) aSN1Set3.getObjectAt(0);
                                                            org.bouncycastle.asn1.ASN1Encodable bagAttribute3 = pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier3);
                                                            if (bagAttribute3 == null) {
                                                                pKCS12BagAttributeCarrier3.setBagAttribute(aSN1ObjectIdentifier3, aSN1Primitive3);
                                                            } else if (!bagAttribute3.toASN1Primitive().equals(aSN1Primitive3)) {
                                                                throw new java.io.IOException("attempt to add existing attribute with different value");
                                                            }
                                                            if (aSN1ObjectIdentifier3.equals((org.bouncycastle.asn1.ASN1Primitive) pkcs_9_at_friendlyName)) {
                                                                str6 = ((org.bouncycastle.asn1.ASN1BMPString) aSN1Primitive3).getString();
                                                                this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges(str6, privateKey);
                                                            } else if (aSN1ObjectIdentifier3.equals((org.bouncycastle.asn1.ASN1Primitive) pkcs_9_at_localKeyId)) {
                                                                aSN1OctetString5 = (org.bouncycastle.asn1.ASN1OctetString) aSN1Primitive3;
                                                            }
                                                        }
                                                    }
                                                    java.lang.String str7 = new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(aSN1OctetString5.getOctets()));
                                                    if (str6 == null) {
                                                        this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges(str7, privateKey);
                                                    } else {
                                                        this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges(str6, str7);
                                                    }
                                                } else {
                                                    java.io.PrintStream printStream2 = java.lang.System.out;
                                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("extra in encryptedData ");
                                                    sb2.append(safeBag2.getBagId());
                                                    printStream2.println(sb2.toString());
                                                    java.lang.System.out.println(org.bouncycastle.asn1.util.ASN1Dump.dumpAsString(safeBag2));
                                                }
                                            }
                                            i6++;
                                            z = z4;
                                            aSN1Sequence4 = aSN1Sequence;
                                        }
                                        z3 = z;
                                    } else {
                                        z3 = z;
                                        i2 = i4;
                                        java.io.PrintStream printStream3 = java.lang.System.out;
                                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("extra ");
                                        sb3.append(contentInfo[i2].getContentType().getId());
                                        printStream3.println(sb3.toString());
                                        java.io.PrintStream printStream4 = java.lang.System.out;
                                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("extra ");
                                        sb4.append(org.bouncycastle.asn1.util.ASN1Dump.dumpAsString(contentInfo[i2].getContent()));
                                        printStream4.println(sb4.toString());
                                    }
                                    i4 = i2 + 1;
                                    z = z3;
                                    i3 = 1;
                                    b = 0;
                                }
                            }
                            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable((byte) 0);
                            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.Hashtable();
                            this.getInputFormats = new java.util.Hashtable();
                            for (i = 0; i != vector.size(); i++) {
                                org.bouncycastle.asn1.pkcs.SafeBag safeBag3 = (org.bouncycastle.asn1.pkcs.SafeBag) vector.elementAt(i);
                                org.bouncycastle.asn1.pkcs.CertBag certBag = org.bouncycastle.asn1.pkcs.CertBag.getInstance(safeBag3.getBagValue());
                                if (!certBag.getCertId().equals((org.bouncycastle.asn1.ASN1Primitive) x509Certificate)) {
                                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Unsupported certificate type: ");
                                    sb5.append(certBag.getCertId());
                                    throw new java.lang.RuntimeException(sb5.toString());
                                }
                                try {
                                    ?? generateCertificate = this.Camera2StreamConfigurationMap.generateCertificate(new java.io.ByteArrayInputStream(((org.bouncycastle.asn1.ASN1OctetString) certBag.getCertValue()).getOctets()));
                                    if (safeBag3.getBagAttributes() != null) {
                                        java.util.Enumeration objects4 = safeBag3.getBagAttributes().getObjects();
                                        str = null;
                                        aSN1OctetString = null;
                                        while (objects4.hasMoreElements()) {
                                            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence8 = org.bouncycastle.asn1.ASN1Sequence.getInstance(objects4.nextElement());
                                            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier4 = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence8.getObjectAt(0));
                                            org.bouncycastle.asn1.ASN1Set aSN1Set4 = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1Sequence8.getObjectAt(1));
                                            if (aSN1Set4.size() > 0) {
                                                org.bouncycastle.asn1.ASN1Primitive aSN1Primitive4 = (org.bouncycastle.asn1.ASN1Primitive) aSN1Set4.getObjectAt(0);
                                                if (generateCertificate instanceof org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) {
                                                    org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier4 = (org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) generateCertificate;
                                                    org.bouncycastle.asn1.ASN1Encodable bagAttribute4 = pKCS12BagAttributeCarrier4.getBagAttribute(aSN1ObjectIdentifier4);
                                                    if (bagAttribute4 != null) {
                                                        if (aSN1ObjectIdentifier4.equals((org.bouncycastle.asn1.ASN1Primitive) pkcs_9_at_localKeyId)) {
                                                            java.lang.String hexString = org.bouncycastle.util.encoders.Hex.toHexString(((org.bouncycastle.asn1.ASN1OctetString) aSN1Primitive4).getOctets());
                                                            if (!this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor.containsKey(hexString) && !this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRangesFor.containsKey(hexString)) {
                                                            }
                                                        }
                                                        if (!bagAttribute4.toASN1Primitive().equals(aSN1Primitive4)) {
                                                            throw new java.io.IOException("attempt to add existing attribute with different value");
                                                        }
                                                    } else {
                                                        pKCS12BagAttributeCarrier4.setBagAttribute(aSN1ObjectIdentifier4, aSN1Primitive4);
                                                    }
                                                }
                                                if (aSN1ObjectIdentifier4.equals((org.bouncycastle.asn1.ASN1Primitive) pkcs_9_at_friendlyName)) {
                                                    str = ((org.bouncycastle.asn1.ASN1BMPString) aSN1Primitive4).getString();
                                                } else if (aSN1ObjectIdentifier4.equals((org.bouncycastle.asn1.ASN1Primitive) pkcs_9_at_localKeyId)) {
                                                    aSN1OctetString = (org.bouncycastle.asn1.ASN1OctetString) aSN1Primitive4;
                                                }
                                            }
                                        }
                                    } else {
                                        str = null;
                                        aSN1OctetString = null;
                                    }
                                    this.getHighResolutionOutputSizeshNQ4ISI.put(new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.CertId(generateCertificate.getPublicKey()), generateCertificate);
                                    if (!z2) {
                                        if (aSN1OctetString != null) {
                                            this.getInputFormats.put(new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(aSN1OctetString.getOctets())), generateCertificate);
                                        }
                                        if (str != null) {
                                            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(str, generateCertificate);
                                        }
                                    } else if (this.getInputFormats.isEmpty()) {
                                        java.lang.String str8 = new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(Camera2StreamConfigurationMap(generateCertificate.getPublicKey()).getKeyIdentifier()));
                                        this.getInputFormats.put(str8, generateCertificate);
                                        org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable ignoresCaseHashtable = this.getHighSpeedVideoSizesFor;
                                        ignoresCaseHashtable.getHighSpeedVideoFpsRanges(str8, ignoresCaseHashtable.getHighSpeedVideoSizes("unmarked"));
                                    }
                                } catch (java.lang.Exception e) {
                                    throw new java.lang.RuntimeException(e.toString());
                                }
                            }
                        }
                    } catch (java.io.IOException e2) {
                        throw e2;
                    } catch (java.lang.Exception e3) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("error constructing MAC: ");
                        sb6.append(e3.toString());
                        throw new java.io.IOException(sb6.toString());
                    }
                } else if (cArr != null && cArr.length != 0 && !org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.pkcs12.ignore_useless_passwd")) {
                    throw new java.io.IOException("password supplied for keystore that does not require one");
                }
                z = false;
                this.getHighSpeedVideoSizesFor = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable(b);
                this.getOutputMinFrameDurationlomOqCM = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable(b);
                if (authSafe.getContentType().equals((org.bouncycastle.asn1.ASN1Primitive) data)) {
                }
                this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable((byte) 0);
                this.getHighResolutionOutputSizeshNQ4ISI = new java.util.Hashtable();
                this.getInputFormats = new java.util.Hashtable();
                while (i != vector.size()) {
                }
            } catch (java.lang.Exception e4) {
                throw new java.io.IOException(e4.getMessage());
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(java.lang.String str) {
        return this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(str) != null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(java.lang.String str) {
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(str) != null && this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(str) == null;
    }

    @Override // java.security.KeyStoreSpi
    public java.security.Key engineGetKey(java.lang.String str, char[] cArr) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
        if (str != null) {
            return (java.security.Key) this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(str);
        }
        throw new java.lang.IllegalArgumentException("null alias passed to getKey.");
    }

    @Override // java.security.KeyStoreSpi
    public java.util.Date engineGetCreationDate(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("alias == null");
        }
        if (this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(str) == null && this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(str) == null) {
            return null;
        }
        return new java.util.Date();
    }

    @Override // java.security.KeyStoreSpi
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String str) {
        byte[] keyIdentifier;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("null alias passed to getCertificateChain.");
        }
        java.security.cert.Certificate[] certificateArr = null;
        if (!engineIsKeyEntry(str)) {
            return null;
        }
        java.security.cert.Certificate engineGetCertificate = engineGetCertificate(str);
        if (engineGetCertificate != null) {
            java.util.Vector vector = new java.util.Vector();
            while (engineGetCertificate != null) {
                java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) engineGetCertificate;
                byte[] extensionValue = x509Certificate.getExtensionValue(org.bouncycastle.asn1.x509.Extension.authorityKeyIdentifier.getId());
                java.security.cert.Certificate certificate = (extensionValue == null || (keyIdentifier = org.bouncycastle.asn1.x509.AuthorityKeyIdentifier.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(extensionValue).getOctets()).getKeyIdentifier()) == null) ? null : (java.security.cert.Certificate) this.getHighResolutionOutputSizeshNQ4ISI.get(new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.CertId(keyIdentifier));
                if (certificate == null) {
                    java.security.Principal issuerDN = x509Certificate.getIssuerDN();
                    if (!issuerDN.equals(x509Certificate.getSubjectDN())) {
                        java.util.Enumeration keys = this.getHighResolutionOutputSizeshNQ4ISI.keys();
                        while (true) {
                            if (!keys.hasMoreElements()) {
                                break;
                            }
                            java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) this.getHighResolutionOutputSizeshNQ4ISI.get(keys.nextElement());
                            if (x509Certificate2.getSubjectDN().equals(issuerDN)) {
                                try {
                                    x509Certificate.verify(x509Certificate2.getPublicKey());
                                    certificate = x509Certificate2;
                                    break;
                                } catch (java.lang.Exception unused) {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (!vector.contains(engineGetCertificate)) {
                    vector.addElement(engineGetCertificate);
                    if (certificate != engineGetCertificate) {
                        engineGetCertificate = certificate;
                    }
                }
                engineGetCertificate = null;
            }
            int size = vector.size();
            certificateArr = new java.security.cert.Certificate[size];
            for (int i = 0; i != size; i++) {
                certificateArr[i] = (java.security.cert.Certificate) vector.elementAt(i);
            }
        }
        return certificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public java.security.cert.Certificate engineGetCertificate(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("null alias passed to getCertificate.");
        }
        java.security.cert.Certificate certificate = (java.security.cert.Certificate) this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(str);
        if (certificate != null) {
            return certificate;
        }
        java.lang.String str2 = (java.lang.String) this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap(str);
        return (java.security.cert.Certificate) (str2 != null ? this.getInputFormats.get(str2) : this.getInputFormats.get(str));
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(java.lang.String str) throws java.security.KeyStoreException {
        java.security.Key key = (java.security.Key) this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(str);
        java.security.cert.Certificate certificate = (java.security.cert.Certificate) this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(str);
        if (certificate != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.remove(new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.CertId(certificate.getPublicKey()));
        }
        if (key != null) {
            java.lang.String str2 = (java.lang.String) this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes(str);
            if (str2 != null) {
                certificate = (java.security.cert.Certificate) this.getInputFormats.remove(str2);
            }
            if (certificate != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.remove(new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.CertId(certificate.getPublicKey()));
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(java.lang.String str) {
        return (this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(str) == null && this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(str) == null) ? false : true;
    }

    static class IgnoresCaseHashtable {
        java.util.Hashtable getHighSpeedVideoFpsRanges;
        private java.util.Hashtable getHighSpeedVideoFpsRangesFor;

        public final java.lang.Object getHighSpeedVideoSizes(java.lang.String str) {
            java.lang.String str2 = (java.lang.String) this.getHighSpeedVideoFpsRangesFor.remove(str == null ? null : org.bouncycastle.util.Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.getHighSpeedVideoFpsRanges.remove(str2);
        }

        public final void getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.Object obj) {
            java.lang.String lowerCase = str == null ? null : org.bouncycastle.util.Strings.toLowerCase(str);
            java.lang.String str2 = (java.lang.String) this.getHighSpeedVideoFpsRangesFor.get(lowerCase);
            if (str2 != null) {
                this.getHighSpeedVideoFpsRanges.remove(str2);
            }
            this.getHighSpeedVideoFpsRangesFor.put(lowerCase, str);
            this.getHighSpeedVideoFpsRanges.put(str, obj);
        }

        public final java.lang.Object Camera2StreamConfigurationMap(java.lang.String str) {
            java.lang.String str2 = (java.lang.String) this.getHighSpeedVideoFpsRangesFor.get(str == null ? null : org.bouncycastle.util.Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.getHighSpeedVideoFpsRanges.get(str2);
        }

        /* synthetic */ IgnoresCaseHashtable(byte b) {
            this();
        }

        private IgnoresCaseHashtable() {
            this.getHighSpeedVideoFpsRanges = new java.util.Hashtable();
            this.getHighSpeedVideoFpsRangesFor = new java.util.Hashtable();
        }
    }

    protected byte[] cryptData(boolean z, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, char[] cArr, boolean z2, byte[] bArr) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        int i = z ? 1 : 2;
        if (!algorithm.on(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_12PbeIds)) {
            if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2)) {
                throw new java.io.IOException("unknown PBE algorithm: ".concat(java.lang.String.valueOf(algorithm)));
            }
            try {
                return getHighSpeedVideoSizes(i, cArr, algorithmIdentifier).doFinal(bArr);
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception decrypting data - ");
                sb.append(e.toString());
                throw new java.io.IOException(sb.toString());
            }
        }
        org.bouncycastle.asn1.pkcs.PKCS12PBEParams pKCS12PBEParams = org.bouncycastle.asn1.pkcs.PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
        try {
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = new javax.crypto.spec.PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
            org.bouncycastle.jcajce.PKCS12Key pKCS12Key = new org.bouncycastle.jcajce.PKCS12Key(cArr, z2);
            javax.crypto.Cipher createCipher = this.getOutputFormats.createCipher(algorithm.getId());
            createCipher.init(i, pKCS12Key, pBEParameterSpec);
            return createCipher.doFinal(bArr);
        } catch (java.lang.Exception e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("exception decrypting data - ");
            sb2.append(e2.toString());
            throw new java.io.IOException(sb2.toString());
        }
    }

    private static int getHighSpeedVideoFpsRangesFor(java.math.BigInteger bigInteger) {
        int intValue = bigInteger.intValue();
        if (intValue < 0) {
            throw new java.lang.IllegalStateException("negative iteration count found");
        }
        java.math.BigInteger asBigInteger = org.bouncycastle.util.Properties.asBigInteger("org.bouncycastle.pkcs12.max_it_count");
        if (asBigInteger == null || asBigInteger.intValue() >= intValue) {
            return intValue;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("iteration count ");
        sb.append(intValue);
        sb.append(" greater than ");
        sb.append(asBigInteger.intValue());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    class CertId {
        byte[] getHighSpeedVideoFpsRangesFor;

        public int hashCode() {
            return org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor);
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.CertId) {
                return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRangesFor, ((org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.CertId) obj).getHighSpeedVideoFpsRangesFor);
            }
            return false;
        }

        CertId(byte[] bArr) {
            this.getHighSpeedVideoFpsRangesFor = bArr;
        }

        CertId(java.security.PublicKey publicKey) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.Camera2StreamConfigurationMap(publicKey).getKeyIdentifier();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (r3 == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static org.bouncycastle.asn1.pkcs.SafeBag getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.security.cert.Certificate certificate) throws java.security.cert.CertificateEncodingException {
        org.bouncycastle.asn1.pkcs.CertBag certBag = new org.bouncycastle.asn1.pkcs.CertBag(x509Certificate, new org.bouncycastle.asn1.DEROctetString(certificate.getEncoded()));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        if (certificate instanceof org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) {
            org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier) certificate;
            org.bouncycastle.asn1.ASN1BMPString aSN1BMPString = (org.bouncycastle.asn1.ASN1BMPString) pKCS12BagAttributeCarrier.getBagAttribute(pkcs_9_at_friendlyName);
            if ((aSN1BMPString == null || !aSN1BMPString.getString().equals(str)) && str != null) {
                pKCS12BagAttributeCarrier.setBagAttribute(pkcs_9_at_friendlyName, new org.bouncycastle.asn1.DERBMPString(str));
            }
            java.util.Enumeration bagAttributeKeys = pKCS12BagAttributeCarrier.getBagAttributeKeys();
            boolean z = false;
            while (bagAttributeKeys.hasMoreElements()) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) bagAttributeKeys.nextElement();
                if (!aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                    org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
                    aSN1EncodableVector2.add(aSN1ObjectIdentifier);
                    aSN1EncodableVector2.add(new org.bouncycastle.asn1.DERSet(pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier)));
                    aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
                    z = true;
                }
            }
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector3 = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector3.add(pkcs_9_at_friendlyName);
        aSN1EncodableVector3.add(new org.bouncycastle.asn1.DERSet(new org.bouncycastle.asn1.DERBMPString(str)));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector3));
        return new org.bouncycastle.asn1.pkcs.SafeBag(certBag, certBag.toASN1Primitive(), new org.bouncycastle.asn1.DERSet(aSN1EncodableVector));
    }

    private byte[] getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, int i, char[] cArr, boolean z, byte[] bArr2) throws java.lang.Exception {
        javax.crypto.spec.PBEParameterSpec pBEParameterSpec = new javax.crypto.spec.PBEParameterSpec(bArr, i);
        javax.crypto.Mac createMac = this.getOutputFormats.createMac(aSN1ObjectIdentifier.getId());
        createMac.init(new org.bouncycastle.jcajce.PKCS12Key(cArr, z), pBEParameterSpec);
        createMac.update(bArr2);
        return createMac.doFinal();
    }

    public static class BCPKCS12KeyStore extends org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new org.bouncycastle.jcajce.util.BCJcaJceHelper(), new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi(new org.bouncycastle.jcajce.util.BCJcaJceHelper(), org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC));
        }
    }

    public static class BCPKCS12KeyStore3DES extends org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BCPKCS12KeyStore3DES() {
            super(r0, new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi(r2, r3, r3));
            org.bouncycastle.jcajce.util.BCJcaJceHelper bCJcaJceHelper = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
            org.bouncycastle.jcajce.util.BCJcaJceHelper bCJcaJceHelper2 = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
        }
    }

    public static class DefPKCS12KeyStore extends org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper(), new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper(), org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC));
        }
    }

    public static class DefPKCS12KeyStore3DES extends org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DefPKCS12KeyStore3DES() {
            super(r0, new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi(r2, r3, r3));
            org.bouncycastle.jcajce.util.DefaultJcaJceHelper defaultJcaJceHelper = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();
            org.bouncycastle.jcajce.util.DefaultJcaJceHelper defaultJcaJceHelper2 = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
        }
    }

    static class DefaultSecretKeyProvider {
        final java.util.Map getHighSpeedVideoFpsRanges;

        DefaultSecretKeyProvider() {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier(org.bouncycastle.cms.CMSEnvelopedGenerator.CAST5_CBC), org.bouncycastle.util.Integers.valueOf(128));
            hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC, org.bouncycastle.util.Integers.valueOf(192));
            hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC, org.bouncycastle.util.Integers.valueOf(128));
            hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC, org.bouncycastle.util.Integers.valueOf(192));
            hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC, org.bouncycastle.util.Integers.valueOf(256));
            hashMap.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc, org.bouncycastle.util.Integers.valueOf(128));
            hashMap.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc, org.bouncycastle.util.Integers.valueOf(192));
            hashMap.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc, org.bouncycastle.util.Integers.valueOf(256));
            hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR28147_gcfb, org.bouncycastle.util.Integers.valueOf(256));
            this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableMap(hashMap);
        }
    }

    public PKCS12KeyStoreSpi(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        byte b = 0;
        this.getHighSpeedVideoSizesFor = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable(b);
        this.getOutputMinFrameDurationlomOqCM = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable(b);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.IgnoresCaseHashtable(b);
        this.getOutputMinFrameDuration = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier2;
        try {
            this.Camera2StreamConfigurationMap = jcaJceHelper.createCertificateFactory("X.509");
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("can't create cert factory - ");
            sb.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}
