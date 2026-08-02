package org.bouncycastle.jcajce.provider.keystore.bcfks;

/* loaded from: classes17.dex */
class BcFKSKeyStoreSpi extends java.security.KeyStoreSpi {
    private static final java.math.BigInteger Camera2StreamConfigurationMap;
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges;
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private static final java.math.BigInteger getHighSpeedVideoSizes;
    private static final java.util.Map<org.bouncycastle.asn1.ASN1ObjectIdentifier, java.lang.String> getInputFormats;
    private static final java.util.Map<java.lang.String, org.bouncycastle.asn1.ASN1ObjectIdentifier> getOutputFormats;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizesFor;
    private java.util.Date getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.pkcs.KeyDerivationFunc getOutputMinFrameDurationlomOqCM;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getOutputSizes;
    private java.util.Date getOutputStallDuration;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getOutputStallDurationlomOqCM;
    private org.bouncycastle.jcajce.BCFKSLoadStoreParameter.CertChainValidator getValidOutputFormatsForInputhNQ4ISI;
    private java.security.PublicKey isOutputSupportedForhNQ4ISI;
    private final java.util.Map<java.lang.String, org.bouncycastle.asn1.bc.ObjectData> getOutputMinFrameDuration = new java.util.HashMap();
    private final java.util.Map<java.lang.String, java.security.PrivateKey> getOutputSizeshNQ4ISI = new java.util.HashMap();
    private org.bouncycastle.asn1.ASN1ObjectIdentifier unwrapAs = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM;

    static class SharedKeyStoreSpi extends org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, org.bouncycastle.asn1.x509.X509ObjectIdentifiers {
        private final byte[] Camera2StreamConfigurationMap;
        private final java.util.Map<java.lang.String, byte[]> getHighSpeedVideoFpsRanges;

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public java.security.Key engineGetKey(java.lang.String str, char[] cArr) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
            try {
                byte[] generate = org.bouncycastle.crypto.generators.SCrypt.generate(cArr != null ? org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.util.Strings.toUTF8ByteArray(cArr), org.bouncycastle.util.Strings.toUTF8ByteArray(str)) : org.bouncycastle.util.Arrays.concatenate(this.Camera2StreamConfigurationMap, org.bouncycastle.util.Strings.toUTF8ByteArray(str)), this.Camera2StreamConfigurationMap, 16384, 8, 1, 32);
                if (this.getHighSpeedVideoFpsRanges.containsKey(str) && !org.bouncycastle.util.Arrays.constantTimeAreEqual(this.getHighSpeedVideoFpsRanges.get(str), generate)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to recover key (");
                    sb.append(str);
                    sb.append(")");
                    throw new java.security.UnrecoverableKeyException(sb.toString());
                }
                java.security.Key engineGetKey = super.engineGetKey(str, cArr);
                if (engineGetKey != null && !this.getHighSpeedVideoFpsRanges.containsKey(str)) {
                    this.getHighSpeedVideoFpsRanges.put(str, generate);
                }
                return engineGetKey;
            } catch (java.security.InvalidKeyException e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to recover key (");
                sb2.append(str);
                sb2.append("): ");
                sb2.append(e.getMessage());
                throw new java.security.UnrecoverableKeyException(sb2.toString());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(java.lang.String str, byte[] bArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
            throw new java.security.KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(java.lang.String str, java.security.Key key, char[] cArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
            throw new java.security.KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetCertificateEntry(java.lang.String str, java.security.cert.Certificate certificate) throws java.security.KeyStoreException {
            throw new java.security.KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineDeleteEntry(java.lang.String str) throws java.security.KeyStoreException {
            throw new java.security.KeyStoreException("delete operation not supported in shared mode");
        }

        public SharedKeyStoreSpi(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
            super(jcaJceHelper);
            try {
                byte[] bArr = new byte[32];
                this.Camera2StreamConfigurationMap = bArr;
                jcaJceHelper.createSecureRandom("DEFAULT").nextBytes(bArr);
                this.getHighSpeedVideoFpsRanges = new java.util.HashMap();
            } catch (java.security.GeneralSecurityException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("can't create random - ");
                sb.append(e.toString());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
    }

    private static org.bouncycastle.asn1.pkcs.KeyDerivationFunc getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        byte[] bArr = new byte[64];
        org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom().nextBytes(bArr);
        if (org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            return new org.bouncycastle.asn1.pkcs.KeyDerivationFunc(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2, new org.bouncycastle.asn1.pkcs.PBKDF2Params(bArr, 51200, i, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, org.bouncycastle.asn1.DERNull.INSTANCE)));
        }
        throw new java.lang.IllegalStateException("unknown derivation algorithm: ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
    }

    private static org.bouncycastle.asn1.pkcs.KeyDerivationFunc getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.pkcs.KeyDerivationFunc keyDerivationFunc, int i) {
        boolean equals = org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt.equals((org.bouncycastle.asn1.ASN1Primitive) keyDerivationFunc.getAlgorithm());
        org.bouncycastle.asn1.ASN1Encodable parameters = keyDerivationFunc.getParameters();
        if (equals) {
            org.bouncycastle.asn1.misc.ScryptParams scryptParams = org.bouncycastle.asn1.misc.ScryptParams.getInstance(parameters);
            byte[] bArr = new byte[scryptParams.getSalt().length];
            org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom().nextBytes(bArr);
            return new org.bouncycastle.asn1.pkcs.KeyDerivationFunc(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt, new org.bouncycastle.asn1.misc.ScryptParams(bArr, scryptParams.getCostParameter(), scryptParams.getBlockSize(), scryptParams.getParallelizationParameter(), java.math.BigInteger.valueOf(i)));
        }
        org.bouncycastle.asn1.pkcs.PBKDF2Params pBKDF2Params = org.bouncycastle.asn1.pkcs.PBKDF2Params.getInstance(parameters);
        byte[] bArr2 = new byte[pBKDF2Params.getSalt().length];
        org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom().nextBytes(bArr2);
        return new org.bouncycastle.asn1.pkcs.KeyDerivationFunc(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2, new org.bouncycastle.asn1.pkcs.PBKDF2Params(bArr2, pBKDF2Params.getIterationCount().intValue(), i, pBKDF2Params.getPrf()));
    }

    private static org.bouncycastle.asn1.pkcs.KeyDerivationFunc getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.util.PBKDFConfig pBKDFConfig) {
        if (!org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt.equals((org.bouncycastle.asn1.ASN1Primitive) pBKDFConfig.getAlgorithm())) {
            org.bouncycastle.crypto.util.PBKDF2Config pBKDF2Config = (org.bouncycastle.crypto.util.PBKDF2Config) pBKDFConfig;
            byte[] bArr = new byte[pBKDF2Config.getSaltLength()];
            org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom().nextBytes(bArr);
            return new org.bouncycastle.asn1.pkcs.KeyDerivationFunc(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2, new org.bouncycastle.asn1.pkcs.PBKDF2Params(bArr, pBKDF2Config.getIterationCount(), 64, pBKDF2Config.getPRF()));
        }
        org.bouncycastle.crypto.util.ScryptConfig scryptConfig = (org.bouncycastle.crypto.util.ScryptConfig) pBKDFConfig;
        byte[] bArr2 = new byte[scryptConfig.getSaltLength()];
        org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom().nextBytes(bArr2);
        return new org.bouncycastle.asn1.pkcs.KeyDerivationFunc(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt, new org.bouncycastle.asn1.misc.ScryptParams(bArr2, scryptConfig.getCostParameter(), scryptConfig.getBlockSize(), scryptConfig.getParallelizationParameter(), 64));
    }

    private org.bouncycastle.asn1.bc.EncryptedObjectStoreData getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException {
        org.bouncycastle.asn1.bc.ObjectData[] objectDataArr = (org.bouncycastle.asn1.bc.ObjectData[]) this.getOutputMinFrameDuration.values().toArray(new org.bouncycastle.asn1.bc.ObjectData[this.getOutputMinFrameDuration.size()]);
        org.bouncycastle.asn1.pkcs.KeyDerivationFunc highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getOutputMinFrameDurationlomOqCM, 32);
        if (cArr == null) {
            cArr = new char[0];
        }
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(highSpeedVideoFpsRanges, "STORE_ENCRYPTION", cArr, 32);
        org.bouncycastle.asn1.bc.ObjectStoreData objectStoreData = new org.bouncycastle.asn1.bc.ObjectStoreData(algorithmIdentifier, this.getInputSizeshNQ4ISI, this.getOutputStallDuration, new org.bouncycastle.asn1.bc.ObjectDataSequence(objectDataArr), null);
        try {
            if (!this.unwrapAs.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM)) {
                javax.crypto.Cipher createCipher = this.getHighSpeedVideoSizesFor.createCipher("AESKWP");
                createCipher.init(1, new javax.crypto.spec.SecretKeySpec(highSpeedVideoSizes, org.jose4j.keys.AesKey.ALGORITHM));
                return new org.bouncycastle.asn1.bc.EncryptedObjectStoreData(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2, new org.bouncycastle.asn1.pkcs.PBES2Parameters(highSpeedVideoFpsRanges, new org.bouncycastle.asn1.pkcs.EncryptionScheme(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap_pad))), createCipher.doFinal(objectStoreData.getEncoded()));
            }
            javax.crypto.Cipher createCipher2 = this.getHighSpeedVideoSizesFor.createCipher("AES/CCM/NoPadding");
            createCipher2.init(1, new javax.crypto.spec.SecretKeySpec(highSpeedVideoSizes, org.jose4j.keys.AesKey.ALGORITHM));
            return new org.bouncycastle.asn1.bc.EncryptedObjectStoreData(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2, new org.bouncycastle.asn1.pkcs.PBES2Parameters(highSpeedVideoFpsRanges, new org.bouncycastle.asn1.pkcs.EncryptionScheme(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM, org.bouncycastle.internal.asn1.cms.CCMParameters.getInstance(createCipher2.getParameters().getEncoded())))), createCipher2.doFinal(objectStoreData.getEncoded()));
        } catch (java.security.InvalidKeyException e) {
            throw new java.io.IOException(e.toString());
        } catch (java.security.NoSuchProviderException e2) {
            throw new java.io.IOException(e2.toString());
        } catch (javax.crypto.BadPaddingException e3) {
            throw new java.io.IOException(e3.toString());
        } catch (javax.crypto.IllegalBlockSizeException e4) {
            throw new java.io.IOException(e4.toString());
        } catch (javax.crypto.NoSuchPaddingException e5) {
            throw new java.security.NoSuchAlgorithmException(e5.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public java.security.Key engineGetKey(java.lang.String str, char[] cArr) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
        org.bouncycastle.asn1.bc.ObjectData objectData = this.getOutputMinFrameDuration.get(str);
        if (objectData == null) {
            return null;
        }
        if (!objectData.getType().equals(getHighSpeedVideoFpsRangesFor) && !objectData.getType().equals(getHighResolutionOutputSizeshNQ4ISI)) {
            if (!objectData.getType().equals(getHighSpeedVideoSizes) && !objectData.getType().equals(Camera2StreamConfigurationMap)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("BCFKS KeyStore unable to recover secret key (");
                sb.append(str);
                sb.append("): type not recognized");
                throw new java.security.UnrecoverableKeyException(sb.toString());
            }
            org.bouncycastle.asn1.bc.EncryptedSecretKeyData encryptedSecretKeyData = org.bouncycastle.asn1.bc.EncryptedSecretKeyData.getInstance(objectData.getData());
            try {
                org.bouncycastle.asn1.bc.SecretKeyData secretKeyData = org.bouncycastle.asn1.bc.SecretKeyData.getInstance(Camera2StreamConfigurationMap("SECRET_KEY_ENCRYPTION", encryptedSecretKeyData.getKeyEncryptionAlgorithm(), cArr, encryptedSecretKeyData.getEncryptedKeyData()));
                return this.getHighSpeedVideoSizesFor.createSecretKeyFactory(secretKeyData.getKeyAlgorithm().getId()).generateSecret(new javax.crypto.spec.SecretKeySpec(secretKeyData.getKeyBytes(), secretKeyData.getKeyAlgorithm().getId()));
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("BCFKS KeyStore unable to recover secret key (");
                sb2.append(str);
                sb2.append("): ");
                sb2.append(e.getMessage());
                throw new java.security.UnrecoverableKeyException(sb2.toString());
            }
        }
        java.security.PrivateKey privateKey = this.getOutputSizeshNQ4ISI.get(str);
        if (privateKey != null) {
            return privateKey;
        }
        org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo.getInstance(org.bouncycastle.asn1.bc.EncryptedPrivateKeyData.getInstance(objectData.getData()).getEncryptedPrivateKeyInfo());
        try {
            org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo = org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(Camera2StreamConfigurationMap("PRIVATE_KEY_ENCRYPTION", encryptedPrivateKeyInfo.getEncryptionAlgorithm(), cArr, encryptedPrivateKeyInfo.getEncryptedData()));
            org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper = this.getHighSpeedVideoSizesFor;
            org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
            java.lang.String str2 = getInputFormats.get(algorithm);
            if (str2 == null) {
                str2 = algorithm.getId();
            }
            java.security.PrivateKey generatePrivate = jcaJceHelper.createKeyFactory(str2).generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(privateKeyInfo.getEncoded()));
            this.getOutputSizeshNQ4ISI.put(str, generatePrivate);
            return generatePrivate;
        } catch (java.lang.Exception e2) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("BCFKS KeyStore unable to recover private key (");
            sb3.append(str);
            sb3.append("): ");
            sb3.append(e2.getMessage());
            throw new java.security.UnrecoverableKeyException(sb3.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(java.io.InputStream inputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier signatureAlgorithm;
        org.bouncycastle.asn1.ASN1Encodable storeData;
        java.security.PublicKey publicKey;
        org.bouncycastle.asn1.bc.ObjectStoreData objectStoreData;
        this.getOutputMinFrameDuration.clear();
        this.getOutputSizeshNQ4ISI.clear();
        this.getInputSizeshNQ4ISI = null;
        this.getOutputStallDuration = null;
        this.getOutputSizes = null;
        if (inputStream == null) {
            java.util.Date date = new java.util.Date();
            this.getInputSizeshNQ4ISI = date;
            this.getOutputStallDuration = date;
            this.isOutputSupportedForhNQ4ISI = null;
            this.getValidOutputFormatsForInputhNQ4ISI = null;
            this.getOutputSizes = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, org.bouncycastle.asn1.DERNull.INSTANCE);
            this.getOutputMinFrameDurationlomOqCM = getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2, 64);
            return;
        }
        try {
            org.bouncycastle.asn1.bc.ObjectStore objectStore = org.bouncycastle.asn1.bc.ObjectStore.getInstance(new org.bouncycastle.asn1.ASN1InputStream(inputStream).readObject());
            org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck integrityCheck = objectStore.getIntegrityCheck();
            if (integrityCheck.getType() == 0) {
                org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck pbkdMacIntegrityCheck = org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck.getInstance(integrityCheck.getIntegrityCheck());
                this.getOutputSizes = pbkdMacIntegrityCheck.getMacAlgorithm();
                this.getOutputMinFrameDurationlomOqCM = pbkdMacIntegrityCheck.getPbkdAlgorithm();
                signatureAlgorithm = this.getOutputSizes;
                try {
                    if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(getHighSpeedVideoFpsRangesFor(objectStore.getStoreData().toASN1Primitive().getEncoded(), pbkdMacIntegrityCheck.getMacAlgorithm(), pbkdMacIntegrityCheck.getPbkdAlgorithm(), cArr), pbkdMacIntegrityCheck.getMac())) {
                        throw new java.io.IOException("BCFKS KeyStore corrupted: MAC calculation failed");
                    }
                } catch (java.security.NoSuchProviderException e) {
                    throw new java.io.IOException(e.getMessage());
                }
            } else {
                if (integrityCheck.getType() != 1) {
                    throw new java.io.IOException("BCFKS KeyStore unable to recognize integrity check.");
                }
                org.bouncycastle.asn1.bc.SignatureCheck signatureCheck = org.bouncycastle.asn1.bc.SignatureCheck.getInstance(integrityCheck.getIntegrityCheck());
                signatureAlgorithm = signatureCheck.getSignatureAlgorithm();
                try {
                    org.bouncycastle.asn1.x509.Certificate[] certificates = signatureCheck.getCertificates();
                    if (this.getValidOutputFormatsForInputhNQ4ISI == null) {
                        storeData = objectStore.getStoreData();
                        publicKey = this.isOutputSupportedForhNQ4ISI;
                    } else {
                        if (certificates == null) {
                            throw new java.io.IOException("validator specified but no certifcates in store");
                        }
                        java.security.cert.CertificateFactory createCertificateFactory = this.getHighSpeedVideoSizesFor.createCertificateFactory("X.509");
                        int length = certificates.length;
                        java.security.cert.X509Certificate[] x509CertificateArr = new java.security.cert.X509Certificate[length];
                        for (int i = 0; i != length; i++) {
                            x509CertificateArr[i] = (java.security.cert.X509Certificate) createCertificateFactory.generateCertificate(new java.io.ByteArrayInputStream(certificates[i].getEncoded()));
                        }
                        if (!this.getValidOutputFormatsForInputhNQ4ISI.isValid(x509CertificateArr)) {
                            throw new java.io.IOException("certificate chain in key store signature not valid");
                        }
                        storeData = objectStore.getStoreData();
                        publicKey = x509CertificateArr[0].getPublicKey();
                    }
                    java.security.Signature createSignature = this.getHighSpeedVideoSizesFor.createSignature(signatureCheck.getSignatureAlgorithm().getAlgorithm().getId());
                    createSignature.initVerify(publicKey);
                    createSignature.update(storeData.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
                    if (!createSignature.verify(signatureCheck.getSignature().getOctets())) {
                        throw new java.io.IOException("BCFKS KeyStore corrupted: signature calculation failed");
                    }
                } catch (java.security.GeneralSecurityException e2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("error verifying signature: ");
                    sb.append(e2.getMessage());
                    throw new java.io.IOException(sb.toString(), e2);
                }
            }
            org.bouncycastle.asn1.ASN1Encodable storeData2 = objectStore.getStoreData();
            if (storeData2 instanceof org.bouncycastle.asn1.bc.EncryptedObjectStoreData) {
                org.bouncycastle.asn1.bc.EncryptedObjectStoreData encryptedObjectStoreData = (org.bouncycastle.asn1.bc.EncryptedObjectStoreData) storeData2;
                objectStoreData = org.bouncycastle.asn1.bc.ObjectStoreData.getInstance(Camera2StreamConfigurationMap("STORE_ENCRYPTION", encryptedObjectStoreData.getEncryptionAlgorithm(), cArr, encryptedObjectStoreData.getEncryptedContent().getOctets()));
            } else {
                objectStoreData = org.bouncycastle.asn1.bc.ObjectStoreData.getInstance(storeData2);
            }
            try {
                this.getInputSizeshNQ4ISI = objectStoreData.getCreationDate().getDate();
                this.getOutputStallDuration = objectStoreData.getLastModifiedDate().getDate();
                if (!objectStoreData.getIntegrityAlgorithm().equals(signatureAlgorithm)) {
                    throw new java.io.IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
                }
                java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> it = objectStoreData.getObjectDataSequence().iterator();
                while (it.hasNext()) {
                    org.bouncycastle.asn1.bc.ObjectData objectData = org.bouncycastle.asn1.bc.ObjectData.getInstance(it.next());
                    this.getOutputMinFrameDuration.put(objectData.getIdentifier(), objectData);
                }
            } catch (java.text.ParseException unused) {
                throw new java.io.IOException("BCFKS KeyStore unable to parse store data information.");
            }
        } catch (java.lang.Exception e3) {
            throw new java.io.IOException(e3.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cd, code lost:
    
        if (r5.getParallelizationParameter() == r0.getParallelizationParameter().intValue()) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fd, code lost:
    
        if (r1.equals((org.bouncycastle.asn1.ASN1Primitive) r4.unwrapAs) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
    
        if (r5.getIterationCount() == r0.getIterationCount().intValue()) goto L38;
     */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void engineLoad(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
            return;
        }
        if (!(loadStoreParameter instanceof org.bouncycastle.jcajce.BCFKSLoadStoreParameter)) {
            if (loadStoreParameter instanceof org.bouncycastle.jcajce.BCLoadStoreParameter) {
                engineLoad(((org.bouncycastle.jcajce.BCLoadStoreParameter) loadStoreParameter).getInputStream(), org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil.extractPassword(loadStoreParameter));
                return;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("no support for 'parameter' of type ");
                sb.append(loadStoreParameter.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        org.bouncycastle.jcajce.BCFKSLoadStoreParameter bCFKSLoadStoreParameter = (org.bouncycastle.jcajce.BCFKSLoadStoreParameter) loadStoreParameter;
        char[] extractPassword = org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil.extractPassword(bCFKSLoadStoreParameter);
        this.getOutputMinFrameDurationlomOqCM = getHighSpeedVideoFpsRangesFor(bCFKSLoadStoreParameter.getStorePBKDFConfig());
        this.unwrapAs = bCFKSLoadStoreParameter.getStoreEncryptionAlgorithm() == org.bouncycastle.jcajce.BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM ? org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap_pad;
        this.getOutputSizes = bCFKSLoadStoreParameter.getStoreMacAlgorithm() == org.bouncycastle.jcajce.BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512 ? new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, org.bouncycastle.asn1.DERNull.INSTANCE) : new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_512, org.bouncycastle.asn1.DERNull.INSTANCE);
        this.isOutputSupportedForhNQ4ISI = (java.security.PublicKey) bCFKSLoadStoreParameter.getStoreSignatureKey();
        this.getValidOutputFormatsForInputhNQ4ISI = bCFKSLoadStoreParameter.getCertChainValidator();
        this.getOutputStallDurationlomOqCM = Camera2StreamConfigurationMap(this.isOutputSupportedForhNQ4ISI, bCFKSLoadStoreParameter.getStoreSignatureAlgorithm());
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = this.unwrapAs;
        java.io.InputStream inputStream = bCFKSLoadStoreParameter.getInputStream();
        engineLoad(inputStream, extractPassword);
        if (inputStream != null) {
            org.bouncycastle.crypto.util.PBKDFConfig storePBKDFConfig = bCFKSLoadStoreParameter.getStorePBKDFConfig();
            org.bouncycastle.asn1.pkcs.KeyDerivationFunc keyDerivationFunc = this.getOutputMinFrameDurationlomOqCM;
            if (storePBKDFConfig.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) keyDerivationFunc.getAlgorithm())) {
                if (org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt.equals((org.bouncycastle.asn1.ASN1Primitive) keyDerivationFunc.getAlgorithm())) {
                    if (storePBKDFConfig instanceof org.bouncycastle.crypto.util.ScryptConfig) {
                        org.bouncycastle.crypto.util.ScryptConfig scryptConfig = (org.bouncycastle.crypto.util.ScryptConfig) storePBKDFConfig;
                        org.bouncycastle.asn1.misc.ScryptParams scryptParams = org.bouncycastle.asn1.misc.ScryptParams.getInstance(keyDerivationFunc.getParameters());
                        if (scryptConfig.getSaltLength() == scryptParams.getSalt().length) {
                            if (scryptConfig.getBlockSize() == scryptParams.getBlockSize().intValue()) {
                                if (scryptConfig.getCostParameter() == scryptParams.getCostParameter().intValue()) {
                                }
                            }
                        }
                    }
                } else if (storePBKDFConfig instanceof org.bouncycastle.crypto.util.PBKDF2Config) {
                    org.bouncycastle.crypto.util.PBKDF2Config pBKDF2Config = (org.bouncycastle.crypto.util.PBKDF2Config) storePBKDFConfig;
                    org.bouncycastle.asn1.pkcs.PBKDF2Params pBKDF2Params = org.bouncycastle.asn1.pkcs.PBKDF2Params.getInstance(keyDerivationFunc.getParameters());
                    if (pBKDF2Config.getSaltLength() == pBKDF2Params.getSalt().length) {
                    }
                }
            }
            throw new java.io.IOException("configuration parameters do not match existing store");
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(java.lang.String str, java.security.Key key, char[] cArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
        org.bouncycastle.asn1.bc.SecretKeyData secretKeyData;
        org.bouncycastle.asn1.bc.EncryptedSecretKeyData encryptedSecretKeyData;
        org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo encryptedPrivateKeyInfo;
        java.util.Date date = new java.util.Date();
        org.bouncycastle.asn1.bc.ObjectData objectData = this.getOutputMinFrameDuration.get(str);
        java.util.Date highSpeedVideoFpsRangesFor = objectData != null ? getHighSpeedVideoFpsRangesFor(objectData, date) : date;
        this.getOutputSizeshNQ4ISI.remove(str);
        if (key instanceof java.security.PrivateKey) {
            if (certificateArr == null) {
                throw new java.security.KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
            }
            try {
                byte[] encoded = key.getEncoded();
                org.bouncycastle.asn1.pkcs.KeyDerivationFunc highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor2, "PRIVATE_KEY_ENCRYPTION", cArr, 32);
                if (this.unwrapAs.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM)) {
                    javax.crypto.Cipher createCipher = this.getHighSpeedVideoSizesFor.createCipher("AES/CCM/NoPadding");
                    createCipher.init(1, new javax.crypto.spec.SecretKeySpec(highSpeedVideoSizes, org.jose4j.keys.AesKey.ALGORITHM));
                    encryptedPrivateKeyInfo = new org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2, new org.bouncycastle.asn1.pkcs.PBES2Parameters(highSpeedVideoFpsRangesFor2, new org.bouncycastle.asn1.pkcs.EncryptionScheme(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM, org.bouncycastle.internal.asn1.cms.CCMParameters.getInstance(createCipher.getParameters().getEncoded())))), createCipher.doFinal(encoded));
                } else {
                    javax.crypto.Cipher createCipher2 = this.getHighSpeedVideoSizesFor.createCipher("AESKWP");
                    createCipher2.init(1, new javax.crypto.spec.SecretKeySpec(highSpeedVideoSizes, org.jose4j.keys.AesKey.ALGORITHM));
                    encryptedPrivateKeyInfo = new org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2, new org.bouncycastle.asn1.pkcs.PBES2Parameters(highSpeedVideoFpsRangesFor2, new org.bouncycastle.asn1.pkcs.EncryptionScheme(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap_pad))), createCipher2.doFinal(encoded));
                }
                this.getOutputMinFrameDuration.put(str, new org.bouncycastle.asn1.bc.ObjectData(getHighSpeedVideoFpsRangesFor, str, highSpeedVideoFpsRangesFor, date, getHighSpeedVideoFpsRanges(encryptedPrivateKeyInfo, certificateArr).getEncoded(), null));
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("BCFKS KeyStore exception storing private key: ");
                sb.append(e.toString());
                throw new org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.ExtKeyStoreException(sb.toString(), e);
            }
        } else {
            if (!(key instanceof javax.crypto.SecretKey)) {
                throw new java.security.KeyStoreException("BCFKS KeyStore unable to recognize key.");
            }
            if (certificateArr != null) {
                throw new java.security.KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
            }
            try {
                byte[] encoded2 = key.getEncoded();
                org.bouncycastle.asn1.pkcs.KeyDerivationFunc highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] highSpeedVideoSizes2 = getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor3, "SECRET_KEY_ENCRYPTION", cArr, 32);
                java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(key.getAlgorithm());
                if (upperCase.indexOf(org.jose4j.keys.AesKey.ALGORITHM) >= 0) {
                    secretKeyData = new org.bouncycastle.asn1.bc.SecretKeyData(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.aes, encoded2);
                } else {
                    java.util.Map<java.lang.String, org.bouncycastle.asn1.ASN1ObjectIdentifier> map = getOutputFormats;
                    org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = map.get(upperCase);
                    if (aSN1ObjectIdentifier != null) {
                        secretKeyData = new org.bouncycastle.asn1.bc.SecretKeyData(aSN1ObjectIdentifier, encoded2);
                    } else {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(upperCase);
                        sb2.append(".");
                        sb2.append(encoded2.length * 8);
                        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = map.get(sb2.toString());
                        if (aSN1ObjectIdentifier2 == null) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("BCFKS KeyStore cannot recognize secret key (");
                            sb3.append(upperCase);
                            sb3.append(") for storage.");
                            throw new java.security.KeyStoreException(sb3.toString());
                        }
                        secretKeyData = new org.bouncycastle.asn1.bc.SecretKeyData(aSN1ObjectIdentifier2, encoded2);
                    }
                }
                if (this.unwrapAs.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM)) {
                    javax.crypto.Cipher createCipher3 = this.getHighSpeedVideoSizesFor.createCipher("AES/CCM/NoPadding");
                    createCipher3.init(1, new javax.crypto.spec.SecretKeySpec(highSpeedVideoSizes2, org.jose4j.keys.AesKey.ALGORITHM));
                    encryptedSecretKeyData = new org.bouncycastle.asn1.bc.EncryptedSecretKeyData(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2, new org.bouncycastle.asn1.pkcs.PBES2Parameters(highSpeedVideoFpsRangesFor3, new org.bouncycastle.asn1.pkcs.EncryptionScheme(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM, org.bouncycastle.internal.asn1.cms.CCMParameters.getInstance(createCipher3.getParameters().getEncoded())))), createCipher3.doFinal(secretKeyData.getEncoded()));
                } else {
                    javax.crypto.Cipher createCipher4 = this.getHighSpeedVideoSizesFor.createCipher("AESKWP");
                    createCipher4.init(1, new javax.crypto.spec.SecretKeySpec(highSpeedVideoSizes2, org.jose4j.keys.AesKey.ALGORITHM));
                    encryptedSecretKeyData = new org.bouncycastle.asn1.bc.EncryptedSecretKeyData(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2, new org.bouncycastle.asn1.pkcs.PBES2Parameters(highSpeedVideoFpsRangesFor3, new org.bouncycastle.asn1.pkcs.EncryptionScheme(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap_pad))), createCipher4.doFinal(secretKeyData.getEncoded()));
                }
                this.getOutputMinFrameDuration.put(str, new org.bouncycastle.asn1.bc.ObjectData(getHighSpeedVideoSizes, str, highSpeedVideoFpsRangesFor, date, encryptedSecretKeyData.getEncoded(), null));
            } catch (java.lang.Exception e2) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("BCFKS KeyStore exception storing private key: ");
                sb4.append(e2.toString());
                throw new org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.ExtKeyStoreException(sb4.toString(), e2);
            }
        }
        this.getOutputStallDuration = date;
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException {
        org.bouncycastle.asn1.bc.SignatureCheck signatureCheck;
        if (loadStoreParameter == null) {
            throw new java.lang.IllegalArgumentException("'parameter' arg cannot be null");
        }
        if (loadStoreParameter instanceof org.bouncycastle.jcajce.BCFKSStoreParameter) {
            org.bouncycastle.jcajce.BCFKSStoreParameter bCFKSStoreParameter = (org.bouncycastle.jcajce.BCFKSStoreParameter) loadStoreParameter;
            char[] extractPassword = org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil.extractPassword(loadStoreParameter);
            this.getOutputMinFrameDurationlomOqCM = getHighSpeedVideoFpsRangesFor(bCFKSStoreParameter.getStorePBKDFConfig());
            engineStore(bCFKSStoreParameter.getOutputStream(), extractPassword);
            return;
        }
        if (!(loadStoreParameter instanceof org.bouncycastle.jcajce.BCFKSLoadStoreParameter)) {
            if (loadStoreParameter instanceof org.bouncycastle.jcajce.BCLoadStoreParameter) {
                engineStore(((org.bouncycastle.jcajce.BCLoadStoreParameter) loadStoreParameter).getOutputStream(), org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil.extractPassword(loadStoreParameter));
                return;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("no support for 'parameter' of type ");
                sb.append(loadStoreParameter.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        org.bouncycastle.jcajce.BCFKSLoadStoreParameter bCFKSLoadStoreParameter = (org.bouncycastle.jcajce.BCFKSLoadStoreParameter) loadStoreParameter;
        if (bCFKSLoadStoreParameter.getStoreSignatureKey() == null) {
            char[] extractPassword2 = org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil.extractPassword(bCFKSLoadStoreParameter);
            this.getOutputMinFrameDurationlomOqCM = getHighSpeedVideoFpsRangesFor(bCFKSLoadStoreParameter.getStorePBKDFConfig());
            this.unwrapAs = bCFKSLoadStoreParameter.getStoreEncryptionAlgorithm() == org.bouncycastle.jcajce.BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM ? org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap_pad;
            this.getOutputSizes = bCFKSLoadStoreParameter.getStoreMacAlgorithm() == org.bouncycastle.jcajce.BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512 ? new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, org.bouncycastle.asn1.DERNull.INSTANCE) : new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_512, org.bouncycastle.asn1.DERNull.INSTANCE);
            engineStore(bCFKSLoadStoreParameter.getOutputStream(), extractPassword2);
            return;
        }
        this.getOutputStallDurationlomOqCM = Camera2StreamConfigurationMap(bCFKSLoadStoreParameter.getStoreSignatureKey(), bCFKSLoadStoreParameter.getStoreSignatureAlgorithm());
        this.getOutputMinFrameDurationlomOqCM = getHighSpeedVideoFpsRangesFor(bCFKSLoadStoreParameter.getStorePBKDFConfig());
        this.unwrapAs = bCFKSLoadStoreParameter.getStoreEncryptionAlgorithm() == org.bouncycastle.jcajce.BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM ? org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap_pad;
        this.getOutputSizes = bCFKSLoadStoreParameter.getStoreMacAlgorithm() == org.bouncycastle.jcajce.BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512 ? new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, org.bouncycastle.asn1.DERNull.INSTANCE) : new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_512, org.bouncycastle.asn1.DERNull.INSTANCE);
        org.bouncycastle.asn1.bc.EncryptedObjectStoreData highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getOutputStallDurationlomOqCM, org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil.extractPassword(bCFKSLoadStoreParameter));
        try {
            java.security.Signature createSignature = this.getHighSpeedVideoSizesFor.createSignature(this.getOutputStallDurationlomOqCM.getAlgorithm().getId());
            createSignature.initSign((java.security.PrivateKey) bCFKSLoadStoreParameter.getStoreSignatureKey());
            createSignature.update(highSpeedVideoFpsRanges.getEncoded());
            java.security.cert.X509Certificate[] storeCertificates = bCFKSLoadStoreParameter.getStoreCertificates();
            if (storeCertificates != null) {
                int length = storeCertificates.length;
                org.bouncycastle.asn1.x509.Certificate[] certificateArr = new org.bouncycastle.asn1.x509.Certificate[length];
                for (int i = 0; i != length; i++) {
                    certificateArr[i] = org.bouncycastle.asn1.x509.Certificate.getInstance(storeCertificates[i].getEncoded());
                }
                signatureCheck = new org.bouncycastle.asn1.bc.SignatureCheck(this.getOutputStallDurationlomOqCM, certificateArr, createSignature.sign());
            } else {
                signatureCheck = new org.bouncycastle.asn1.bc.SignatureCheck(this.getOutputStallDurationlomOqCM, createSignature.sign());
            }
            bCFKSLoadStoreParameter.getOutputStream().write(new org.bouncycastle.asn1.bc.ObjectStore(highSpeedVideoFpsRanges, new org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck(signatureCheck)).getEncoded());
            bCFKSLoadStoreParameter.getOutputStream().flush();
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("error creating signature: ");
            sb2.append(e.getMessage());
            throw new java.io.IOException(sb2.toString(), e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(java.io.OutputStream outputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
        org.bouncycastle.asn1.pkcs.KeyDerivationFunc keyDerivationFunc;
        java.math.BigInteger keyLength;
        if (this.getInputSizeshNQ4ISI == null) {
            throw new java.io.IOException("KeyStore not initialized");
        }
        org.bouncycastle.asn1.bc.EncryptedObjectStoreData highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getOutputSizes, cArr);
        if (org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt.equals((org.bouncycastle.asn1.ASN1Primitive) this.getOutputMinFrameDurationlomOqCM.getAlgorithm())) {
            org.bouncycastle.asn1.misc.ScryptParams scryptParams = org.bouncycastle.asn1.misc.ScryptParams.getInstance(this.getOutputMinFrameDurationlomOqCM.getParameters());
            keyDerivationFunc = this.getOutputMinFrameDurationlomOqCM;
            keyLength = scryptParams.getKeyLength();
        } else {
            org.bouncycastle.asn1.pkcs.PBKDF2Params pBKDF2Params = org.bouncycastle.asn1.pkcs.PBKDF2Params.getInstance(this.getOutputMinFrameDurationlomOqCM.getParameters());
            keyDerivationFunc = this.getOutputMinFrameDurationlomOqCM;
            keyLength = pBKDF2Params.getKeyLength();
        }
        this.getOutputMinFrameDurationlomOqCM = getHighSpeedVideoFpsRanges(keyDerivationFunc, keyLength.intValue());
        try {
            outputStream.write(new org.bouncycastle.asn1.bc.ObjectStore(highSpeedVideoFpsRanges, new org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck(new org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck(this.getOutputSizes, this.getOutputMinFrameDurationlomOqCM, getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges.getEncoded(), this.getOutputSizes, this.getOutputMinFrameDurationlomOqCM, cArr)))).getEncoded());
            outputStream.flush();
        } catch (java.security.NoSuchProviderException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot calculate mac: ");
            sb.append(e.getMessage());
            throw new java.io.IOException(sb.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.getOutputMinFrameDuration.size();
    }

    public static class Def extends org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi {
        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException {
            super.engineStore(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(java.io.OutputStream outputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(java.lang.String str, byte[] bArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(java.lang.String str, java.security.Key key, char[] cArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(java.lang.String str, java.security.cert.Certificate certificate) throws java.security.KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(java.io.InputStream inputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(java.lang.String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(java.lang.String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.security.Key engineGetKey(java.lang.String str, char[] cArr) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.util.Date engineGetCreationDate(java.lang.String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.lang.String engineGetCertificateAlias(java.security.cert.Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.security.cert.Certificate engineGetCertificate(java.lang.String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(java.lang.String str) throws java.security.KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(java.lang.String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.util.Enumeration engineAliases() {
            return super.engineAliases();
        }

        public Def() {
            super(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        }
    }

    public static class DefShared extends org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi {
        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException {
            super.engineStore(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(java.io.OutputStream outputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(java.lang.String str, byte[] bArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(java.lang.String str, java.security.Key key, char[] cArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(java.lang.String str, java.security.cert.Certificate certificate) throws java.security.KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(java.io.InputStream inputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(java.lang.String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(java.lang.String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.security.Key engineGetKey(java.lang.String str, char[] cArr) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.util.Date engineGetCreationDate(java.lang.String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.lang.String engineGetCertificateAlias(java.security.cert.Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.security.cert.Certificate engineGetCertificate(java.lang.String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(java.lang.String str) throws java.security.KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(java.lang.String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.util.Enumeration engineAliases() {
            return super.engineAliases();
        }

        public DefShared() {
            super(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        }
    }

    public static class Std extends org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi {
        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException {
            super.engineStore(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(java.io.OutputStream outputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(java.lang.String str, byte[] bArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(java.lang.String str, java.security.Key key, char[] cArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(java.lang.String str, java.security.cert.Certificate certificate) throws java.security.KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(java.io.InputStream inputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(java.lang.String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(java.lang.String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.security.Key engineGetKey(java.lang.String str, char[] cArr) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.util.Date engineGetCreationDate(java.lang.String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.lang.String engineGetCertificateAlias(java.security.cert.Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.security.cert.Certificate engineGetCertificate(java.lang.String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(java.lang.String str) throws java.security.KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(java.lang.String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.util.Enumeration engineAliases() {
            return super.engineAliases();
        }

        public Std() {
            super(new org.bouncycastle.jcajce.util.BCJcaJceHelper());
        }
    }

    public static class StdShared extends org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi {
        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException {
            super.engineStore(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(java.io.OutputStream outputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(java.lang.String str, byte[] bArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(java.lang.String str, java.security.Key key, char[] cArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(java.lang.String str, java.security.cert.Certificate certificate) throws java.security.KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(java.io.InputStream inputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(java.lang.String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(java.lang.String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.security.Key engineGetKey(java.lang.String str, char[] cArr) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.util.Date engineGetCreationDate(java.lang.String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.lang.String engineGetCertificateAlias(java.security.cert.Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.security.cert.Certificate engineGetCertificate(java.lang.String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(java.lang.String str) throws java.security.KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(java.lang.String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ java.util.Enumeration engineAliases() {
            return super.engineAliases();
        }

        public StdShared() {
            super(new org.bouncycastle.jcajce.util.BCJcaJceHelper());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(java.lang.String str, byte[] bArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
        java.util.Date date = new java.util.Date();
        org.bouncycastle.asn1.bc.ObjectData objectData = this.getOutputMinFrameDuration.get(str);
        java.util.Date highSpeedVideoFpsRangesFor = objectData != null ? getHighSpeedVideoFpsRangesFor(objectData, date) : date;
        if (certificateArr != null) {
            try {
                org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo.getInstance(bArr);
                try {
                    this.getOutputSizeshNQ4ISI.remove(str);
                    this.getOutputMinFrameDuration.put(str, new org.bouncycastle.asn1.bc.ObjectData(getHighResolutionOutputSizeshNQ4ISI, str, highSpeedVideoFpsRangesFor, date, getHighSpeedVideoFpsRanges(encryptedPrivateKeyInfo, certificateArr).getEncoded(), null));
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("BCFKS KeyStore exception storing protected private key: ");
                    sb.append(e.toString());
                    throw new org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.ExtKeyStoreException(sb.toString(), e);
                }
            } catch (java.lang.Exception e2) {
                throw new org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.ExtKeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e2);
            }
        } else {
            try {
                this.getOutputMinFrameDuration.put(str, new org.bouncycastle.asn1.bc.ObjectData(Camera2StreamConfigurationMap, str, highSpeedVideoFpsRangesFor, date, bArr, null));
            } catch (java.lang.Exception e3) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("BCFKS KeyStore exception storing protected private key: ");
                sb2.append(e3.toString());
                throw new org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.ExtKeyStoreException(sb2.toString(), e3);
            }
        }
        this.getOutputStallDuration = date;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(java.lang.String str, java.security.cert.Certificate certificate) throws java.security.KeyStoreException {
        java.util.Date date;
        org.bouncycastle.asn1.bc.ObjectData objectData = this.getOutputMinFrameDuration.get(str);
        java.util.Date date2 = new java.util.Date();
        if (objectData == null) {
            date = date2;
        } else {
            if (!objectData.getType().equals(getHighSpeedVideoFpsRanges)) {
                throw new java.security.KeyStoreException("BCFKS KeyStore already has a key entry with alias ".concat(java.lang.String.valueOf(str)));
            }
            date = getHighSpeedVideoFpsRangesFor(objectData, date2);
        }
        try {
            this.getOutputMinFrameDuration.put(str, new org.bouncycastle.asn1.bc.ObjectData(getHighSpeedVideoFpsRanges, str, date, date2, certificate.getEncoded(), null));
            this.getOutputStallDuration = date2;
        } catch (java.security.cert.CertificateEncodingException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BCFKS KeyStore unable to handle certificate: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.ExtKeyStoreException(sb.toString(), e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(java.lang.String str) {
        org.bouncycastle.asn1.bc.ObjectData objectData = this.getOutputMinFrameDuration.get(str);
        if (objectData == null) {
            return false;
        }
        java.math.BigInteger type = objectData.getType();
        return type.equals(getHighSpeedVideoFpsRangesFor) || type.equals(getHighSpeedVideoSizes) || type.equals(getHighResolutionOutputSizeshNQ4ISI) || type.equals(Camera2StreamConfigurationMap);
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(java.lang.String str) {
        org.bouncycastle.asn1.bc.ObjectData objectData = this.getOutputMinFrameDuration.get(str);
        if (objectData != null) {
            return objectData.getType().equals(getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public java.util.Date engineGetCreationDate(java.lang.String str) {
        org.bouncycastle.asn1.bc.ObjectData objectData = this.getOutputMinFrameDuration.get(str);
        if (objectData == null) {
            return null;
        }
        try {
            return objectData.getLastModifiedDate().getDate();
        } catch (java.text.ParseException unused) {
            return new java.util.Date();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.KeyStoreSpi
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String str) {
        org.bouncycastle.asn1.bc.ObjectData objectData = this.getOutputMinFrameDuration.get(str);
        if (objectData == null) {
            return null;
        }
        if (!objectData.getType().equals(getHighSpeedVideoFpsRangesFor) && !objectData.getType().equals(getHighResolutionOutputSizeshNQ4ISI)) {
            return null;
        }
        org.bouncycastle.asn1.x509.Certificate[] certificateChain = org.bouncycastle.asn1.bc.EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain();
        int length = certificateChain.length;
        java.security.cert.X509Certificate[] x509CertificateArr = new java.security.cert.X509Certificate[length];
        for (int i = 0; i != length; i++) {
            x509CertificateArr[i] = getHighResolutionOutputSizeshNQ4ISI(certificateChain[i]);
        }
        return x509CertificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate certificate) {
        if (certificate == null) {
            return null;
        }
        try {
            byte[] encoded = certificate.getEncoded();
            for (java.lang.String str : this.getOutputMinFrameDuration.keySet()) {
                org.bouncycastle.asn1.bc.ObjectData objectData = this.getOutputMinFrameDuration.get(str);
                if (objectData.getType().equals(getHighSpeedVideoFpsRanges)) {
                    if (org.bouncycastle.util.Arrays.areEqual(objectData.getData(), encoded)) {
                    }
                } else if (objectData.getType().equals(getHighSpeedVideoFpsRangesFor) || objectData.getType().equals(getHighResolutionOutputSizeshNQ4ISI)) {
                    try {
                        if (org.bouncycastle.util.Arrays.areEqual(org.bouncycastle.asn1.bc.EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain()[0].toASN1Primitive().getEncoded(), encoded)) {
                        }
                    } catch (java.io.IOException unused) {
                        continue;
                    }
                }
                return str;
            }
        } catch (java.security.cert.CertificateEncodingException unused2) {
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public java.security.cert.Certificate engineGetCertificate(java.lang.String str) {
        org.bouncycastle.asn1.bc.ObjectData objectData = this.getOutputMinFrameDuration.get(str);
        if (objectData == null) {
            return null;
        }
        if (objectData.getType().equals(getHighSpeedVideoFpsRangesFor) || objectData.getType().equals(getHighResolutionOutputSizeshNQ4ISI)) {
            return getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.bc.EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain()[0]);
        }
        if (objectData.getType().equals(getHighSpeedVideoFpsRanges)) {
            return getHighResolutionOutputSizeshNQ4ISI(objectData.getData());
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(java.lang.String str) throws java.security.KeyStoreException {
        if (this.getOutputMinFrameDuration.get(str) == null) {
            return;
        }
        this.getOutputSizeshNQ4ISI.remove(str);
        this.getOutputMinFrameDuration.remove(str);
        this.getOutputStallDuration = new java.util.Date();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(java.lang.String str) {
        if (str != null) {
            return this.getOutputMinFrameDuration.containsKey(str);
        }
        throw new java.lang.NullPointerException("alias value is null");
    }

    @Override // java.security.KeyStoreSpi
    public java.util.Enumeration<java.lang.String> engineAliases() {
        final java.util.Iterator it = new java.util.HashSet(this.getOutputMinFrameDuration.keySet()).iterator();
        return new java.util.Enumeration() { // from class: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.1
            @Override // java.util.Enumeration
            public java.lang.Object nextElement() {
                return it.next();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it.hasNext();
            }
        };
    }

    private static org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap(java.security.Key key, org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm signatureAlgorithm) throws java.io.IOException {
        if (key == null) {
            return null;
        }
        if (key instanceof org.bouncycastle.jce.interfaces.ECKey) {
            if (signatureAlgorithm == org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withECDSA) {
                return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA512);
            }
            if (signatureAlgorithm == org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withECDSA) {
                return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_ecdsa_with_sha3_512);
            }
        }
        if (key instanceof java.security.interfaces.DSAKey) {
            if (signatureAlgorithm == org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withDSA) {
                return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha512);
            }
            if (signatureAlgorithm == org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withDSA) {
                return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_dsa_with_sha3_512);
            }
        }
        if (key instanceof java.security.interfaces.RSAKey) {
            if (signatureAlgorithm == org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withRSA) {
                return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption, org.bouncycastle.asn1.DERNull.INSTANCE);
            }
            if (signatureAlgorithm == org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withRSA) {
                return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512, org.bouncycastle.asn1.DERNull.INSTANCE);
            }
        }
        throw new java.io.IOException("unknown signature algorithm");
    }

    private static byte[] getHighSpeedVideoSizes(org.bouncycastle.asn1.pkcs.KeyDerivationFunc keyDerivationFunc, java.lang.String str, char[] cArr, int i) throws java.io.IOException {
        byte[] PKCS12PasswordToBytes = org.bouncycastle.crypto.PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        byte[] PKCS12PasswordToBytes2 = org.bouncycastle.crypto.PBEParametersGenerator.PKCS12PasswordToBytes(str.toCharArray());
        if (org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt.equals((org.bouncycastle.asn1.ASN1Primitive) keyDerivationFunc.getAlgorithm())) {
            org.bouncycastle.asn1.misc.ScryptParams scryptParams = org.bouncycastle.asn1.misc.ScryptParams.getInstance(keyDerivationFunc.getParameters());
            if (scryptParams.getKeyLength() != null) {
                i = scryptParams.getKeyLength().intValue();
            } else if (i == -1) {
                throw new java.io.IOException("no keyLength found in ScryptParams");
            }
            return org.bouncycastle.crypto.generators.SCrypt.generate(org.bouncycastle.util.Arrays.concatenate(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), scryptParams.getSalt(), scryptParams.getCostParameter().intValue(), scryptParams.getBlockSize().intValue(), scryptParams.getBlockSize().intValue(), i);
        }
        if (!keyDerivationFunc.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2)) {
            throw new java.io.IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
        }
        org.bouncycastle.asn1.pkcs.PBKDF2Params pBKDF2Params = org.bouncycastle.asn1.pkcs.PBKDF2Params.getInstance(keyDerivationFunc.getParameters());
        if (pBKDF2Params.getKeyLength() != null) {
            i = pBKDF2Params.getKeyLength().intValue();
        } else if (i == -1) {
            throw new java.io.IOException("no keyLength found in PBKDF2Params");
        }
        if (pBKDF2Params.getPrf().getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512)) {
            org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(new org.bouncycastle.crypto.digests.SHA512Digest());
            pKCS5S2ParametersGenerator.init(org.bouncycastle.util.Arrays.concatenate(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue());
            return ((org.bouncycastle.crypto.params.KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(i * 8)).getKey();
        }
        if (pBKDF2Params.getPrf().getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_512)) {
            org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator2 = new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(new org.bouncycastle.crypto.digests.SHA3Digest(512));
            pKCS5S2ParametersGenerator2.init(org.bouncycastle.util.Arrays.concatenate(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue());
            return ((org.bouncycastle.crypto.params.KeyParameter) pKCS5S2ParametersGenerator2.generateDerivedParameters(i * 8)).getKey();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BCFKS KeyStore: unrecognized MAC PBKD PRF: ");
        sb.append(pBKDF2Params.getPrf().getAlgorithm());
        throw new java.io.IOException(sb.toString());
    }

    private static java.util.Date getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.bc.ObjectData objectData, java.util.Date date) {
        try {
            return objectData.getCreationDate().getDate();
        } catch (java.text.ParseException unused) {
            return date;
        }
    }

    private byte[] Camera2StreamConfigurationMap(java.lang.String str, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, char[] cArr, byte[] bArr) throws java.io.IOException {
        javax.crypto.Cipher createCipher;
        java.security.AlgorithmParameters algorithmParameters;
        if (!algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2)) {
            throw new java.io.IOException("BCFKS KeyStore cannot recognize protection algorithm.");
        }
        org.bouncycastle.asn1.pkcs.PBES2Parameters pBES2Parameters = org.bouncycastle.asn1.pkcs.PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        org.bouncycastle.asn1.pkcs.EncryptionScheme encryptionScheme = pBES2Parameters.getEncryptionScheme();
        try {
            if (encryptionScheme.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM)) {
                createCipher = this.getHighSpeedVideoSizesFor.createCipher("AES/CCM/NoPadding");
                algorithmParameters = this.getHighSpeedVideoSizesFor.createAlgorithmParameters("CCM");
                algorithmParameters.init(org.bouncycastle.internal.asn1.cms.CCMParameters.getInstance(encryptionScheme.getParameters()).getEncoded());
            } else {
                if (!encryptionScheme.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap_pad)) {
                    throw new java.io.IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
                }
                createCipher = this.getHighSpeedVideoSizesFor.createCipher("AESKWP");
                algorithmParameters = null;
            }
            org.bouncycastle.asn1.pkcs.KeyDerivationFunc keyDerivationFunc = pBES2Parameters.getKeyDerivationFunc();
            if (cArr == null) {
                cArr = new char[0];
            }
            createCipher.init(2, new javax.crypto.spec.SecretKeySpec(getHighSpeedVideoSizes(keyDerivationFunc, str, cArr, 32), org.jose4j.keys.AesKey.ALGORITHM), algorithmParameters);
            return createCipher.doFinal(bArr);
        } catch (java.io.IOException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.io.IOException(e2.toString());
        }
    }

    private java.security.cert.Certificate getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper = this.getHighSpeedVideoSizesFor;
        if (jcaJceHelper != null) {
            try {
                return jcaJceHelper.createCertificateFactory("X.509").generateCertificate(new java.io.ByteArrayInputStream(org.bouncycastle.asn1.x509.Certificate.getInstance(obj).getEncoded()));
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        try {
            return java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(org.bouncycastle.asn1.x509.Certificate.getInstance(obj).getEncoded()));
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    private static org.bouncycastle.asn1.bc.EncryptedPrivateKeyData getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo encryptedPrivateKeyInfo, java.security.cert.Certificate[] certificateArr) throws java.security.cert.CertificateEncodingException {
        org.bouncycastle.asn1.x509.Certificate[] certificateArr2 = new org.bouncycastle.asn1.x509.Certificate[certificateArr.length];
        for (int i = 0; i != certificateArr.length; i++) {
            certificateArr2[i] = org.bouncycastle.asn1.x509.Certificate.getInstance(certificateArr[i].getEncoded());
        }
        return new org.bouncycastle.asn1.bc.EncryptedPrivateKeyData(encryptedPrivateKeyInfo, certificateArr2);
    }

    static class ExtKeyStoreException extends java.security.KeyStoreException {
        private final java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        ExtKeyStoreException(java.lang.String str, java.lang.Throwable th) {
            super(str);
            this.getHighResolutionOutputSizeshNQ4ISI = th;
        }
    }

    private byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.pkcs.KeyDerivationFunc keyDerivationFunc, char[] cArr) throws java.security.NoSuchAlgorithmException, java.io.IOException, java.security.NoSuchProviderException {
        java.lang.String id = algorithmIdentifier.getAlgorithm().getId();
        javax.crypto.Mac createMac = this.getHighSpeedVideoSizesFor.createMac(id);
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            createMac.init(new javax.crypto.spec.SecretKeySpec(getHighSpeedVideoSizes(keyDerivationFunc, "INTEGRITY_CHECK", cArr, -1), id));
            return createMac.doFinal(bArr);
        } catch (java.security.InvalidKeyException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot set up MAC calculation: ");
            sb.append(e.getMessage());
            throw new java.io.IOException(sb.toString());
        }
    }

    public static class DefCompat extends org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi {
        public DefCompat() {
            super(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper(), new org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper()));
        }
    }

    public static class DefSharedCompat extends org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi {
        public DefSharedCompat() {
            super(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper(), new org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper()));
        }
    }

    public static class StdCompat extends org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi {
        public StdCompat() {
            super(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper(), new org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi(new org.bouncycastle.jcajce.util.BCJcaJceHelper()));
        }
    }

    public static class StdSharedCompat extends org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi {
        public StdSharedCompat() {
            super(new org.bouncycastle.jcajce.util.BCJcaJceHelper(), new org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi(new org.bouncycastle.jcajce.util.BCJcaJceHelper()));
        }
    }

    BcFKSKeyStoreSpi(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        this.getHighSpeedVideoSizesFor = jcaJceHelper;
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getOutputFormats = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        getInputFormats = hashMap2;
        hashMap.put("DESEDE", org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desEDE);
        hashMap.put("TRIPLEDES", org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desEDE);
        hashMap.put("TDEA", org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desEDE);
        hashMap.put("HMACSHA1", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1);
        hashMap.put("HMACSHA224", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA224);
        hashMap.put("HMACSHA256", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256);
        hashMap.put("HMACSHA384", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384);
        hashMap.put("HMACSHA512", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512);
        hashMap.put("SEED", org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedCBC);
        hashMap.put("CAMELLIA.128", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc);
        hashMap.put("CAMELLIA.192", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc);
        hashMap.put("CAMELLIA.256", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc);
        hashMap.put("ARIA.128", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria128_cbc);
        hashMap.put("ARIA.192", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria192_cbc);
        hashMap.put("ARIA.256", org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers.id_aria256_cbc);
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, "RSA");
        hashMap2.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, "EC");
        hashMap2.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.elGamalAlgorithm, "DH");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.dhKeyAgreement, "DH");
        hashMap2.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, "DSA");
        getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(0L);
        getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(1L);
        getHighSpeedVideoSizes = java.math.BigInteger.valueOf(2L);
        getHighResolutionOutputSizeshNQ4ISI = java.math.BigInteger.valueOf(3L);
        Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(4L);
    }
}
