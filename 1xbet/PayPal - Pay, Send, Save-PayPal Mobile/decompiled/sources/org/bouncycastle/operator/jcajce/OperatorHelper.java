package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
class OperatorHelper {
    private static final java.util.Map Camera2StreamConfigurationMap;
    private static final java.util.Map getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map getHighSpeedVideoFpsRanges;
    private static org.bouncycastle.operator.DefaultSignatureNameFinder getHighSpeedVideoFpsRangesFor;
    private static final java.util.Map getHighSpeedVideoSizes;
    private static final java.util.Map getInputFormats;
    private org.bouncycastle.jcajce.util.JcaJceHelper getOutputMinFrameDuration;

    final java.security.Signature Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        try {
            java.lang.String algorithmName = getHighSpeedVideoFpsRangesFor.getAlgorithmName(algorithmIdentifier);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NONE");
            sb.append(algorithmName.substring(algorithmName.indexOf("WITH")));
            java.lang.String obj = sb.toString();
            java.security.Signature createSignature = this.getOutputMinFrameDuration.createSignature(obj);
            if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                java.security.AlgorithmParameters createAlgorithmParameters = this.getOutputMinFrameDuration.createAlgorithmParameters(obj);
                org.bouncycastle.jcajce.util.AlgorithmParametersUtils.loadParameters(createAlgorithmParameters, algorithmIdentifier.getParameters());
                createSignature.setParameter((java.security.spec.PSSParameterSpec) createAlgorithmParameters.getParameterSpec(java.security.spec.PSSParameterSpec.class));
            }
            return createSignature;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
    
        if (r1.getSaltLength().intValue() != getHighResolutionOutputSizeshNQ4ISI(r1.getHashAlgorithm()).getDigestLength()) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final java.security.Signature getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws java.security.GeneralSecurityException {
        java.security.Signature createSignature;
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence;
        java.lang.String algorithmName = getHighSpeedVideoFpsRangesFor.getAlgorithmName(algorithmIdentifier);
        try {
            createSignature = this.getOutputMinFrameDuration.createSignature(algorithmName);
        } catch (java.security.NoSuchAlgorithmException e) {
            if (!algorithmName.endsWith("WITHRSAANDMGF1")) {
                throw e;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(algorithmName.substring(0, algorithmName.indexOf(87)));
            sb.append("WITHRSASSA-PSS");
            createSignature = this.getOutputMinFrameDuration.createSignature(sb.toString());
        }
        if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS) && (aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(algorithmIdentifier.getParameters())) != null && aSN1Sequence.size() != 0) {
            org.bouncycastle.asn1.pkcs.RSASSAPSSparams rSASSAPSSparams = org.bouncycastle.asn1.pkcs.RSASSAPSSparams.getInstance(aSN1Sequence);
            if (rSASSAPSSparams.getMaskGenAlgorithm().getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1) && rSASSAPSSparams.getHashAlgorithm().equals(org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(rSASSAPSSparams.getMaskGenAlgorithm().getParameters()))) {
            }
            try {
                java.security.AlgorithmParameters createAlgorithmParameters = this.getOutputMinFrameDuration.createAlgorithmParameters("PSS");
                createAlgorithmParameters.init(aSN1Sequence.getEncoded());
                createSignature.setParameter(createAlgorithmParameters.getParameterSpec(java.security.spec.PSSParameterSpec.class));
            } catch (java.io.IOException e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to process PSS parameters: ");
                sb2.append(e2.getMessage());
                throw new java.security.GeneralSecurityException(sb2.toString());
            }
        }
        return createSignature;
    }

    static java.lang.String getHighSpeedVideoSizesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (java.lang.String) Camera2StreamConfigurationMap.get(aSN1ObjectIdentifier);
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.String str = (java.lang.String) getHighResolutionOutputSizeshNQ4ISI.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    final javax.crypto.Cipher getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
        try {
            java.lang.String str = (java.lang.String) Camera2StreamConfigurationMap.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.getOutputMinFrameDuration.createCipher(str);
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return this.getOutputMinFrameDuration.createCipher(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create cipher: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        }
    }

    final java.security.KeyPairGenerator getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cms.CMSException {
        try {
            return this.getOutputMinFrameDuration.createKeyPairGenerator(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create key agreement: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    final javax.crypto.KeyAgreement Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
        try {
            return this.getOutputMinFrameDuration.createKeyAgreement(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create key agreement: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        }
    }

    final java.security.MessageDigest getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws java.security.GeneralSecurityException {
        org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper;
        java.lang.String digestName;
        try {
            if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256_len)) {
                jcaJceHelper = this.getOutputMinFrameDuration;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SHAKE256-");
                sb.append(org.bouncycastle.asn1.ASN1Integer.getInstance(algorithmIdentifier.getParameters()).getValue());
                digestName = sb.toString();
            } else {
                if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128_len)) {
                    org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper2 = this.getOutputMinFrameDuration;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("SHAKE128-");
                    sb2.append(org.bouncycastle.asn1.ASN1Integer.getInstance(algorithmIdentifier.getParameters()).getValue());
                    return jcaJceHelper2.createMessageDigest(sb2.toString());
                }
                jcaJceHelper = this.getOutputMinFrameDuration;
                digestName = org.bouncycastle.jcajce.util.MessageDigestUtils.getDigestName(algorithmIdentifier.getAlgorithm());
            }
            return jcaJceHelper.createMessageDigest(digestName);
        } catch (java.security.NoSuchAlgorithmException e) {
            java.util.Map map = getHighSpeedVideoSizes;
            if (map.get(algorithmIdentifier.getAlgorithm()) == null) {
                throw e;
            }
            return this.getOutputMinFrameDuration.createMessageDigest((java.lang.String) map.get(algorithmIdentifier.getAlgorithm()));
        }
    }

    final javax.crypto.Cipher getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
        try {
            return this.getOutputMinFrameDuration.createCipher(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create cipher: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        }
    }

    final javax.crypto.Cipher getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.util.Map map) throws org.bouncycastle.operator.OperatorCreationException {
        try {
            java.lang.String str = !map.isEmpty() ? (java.lang.String) map.get(aSN1ObjectIdentifier) : null;
            if (str == null) {
                str = (java.lang.String) getHighSpeedVideoFpsRanges.get(aSN1ObjectIdentifier);
            }
            if (str != null) {
                try {
                    return this.getOutputMinFrameDuration.createCipher(str);
                } catch (java.security.NoSuchAlgorithmException unused) {
                    if (str.equals("RSA/ECB/PKCS1Padding")) {
                        try {
                            return this.getOutputMinFrameDuration.createCipher("RSA/NONE/PKCS1Padding");
                        } catch (java.security.NoSuchAlgorithmException unused2) {
                        }
                    }
                }
            }
            return this.getOutputMinFrameDuration.createCipher(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create cipher: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        }
    }

    final java.security.AlgorithmParameters getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
        if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption)) {
            return null;
        }
        try {
            java.security.AlgorithmParameters createAlgorithmParameters = this.getOutputMinFrameDuration.createAlgorithmParameters(algorithmIdentifier.getAlgorithm().getId());
            try {
                createAlgorithmParameters.init(algorithmIdentifier.getParameters().toASN1Primitive().getEncoded());
                return createAlgorithmParameters;
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot initialise algorithm parameters: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
            }
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        } catch (java.security.NoSuchProviderException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot create algorithm parameters: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb2.toString(), e2);
        }
    }

    public final java.security.PublicKey Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws org.bouncycastle.operator.OperatorCreationException {
        try {
            return this.getOutputMinFrameDuration.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm().getId()).generatePublic(new java.security.spec.X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot get encoded form of key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot create key factory: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb2.toString(), e2);
        } catch (java.security.NoSuchProviderException e3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("cannot find factory provider: ");
            sb3.append(e3.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb3.toString(), e3);
        } catch (java.security.spec.InvalidKeySpecException e4) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("cannot create key factory: ");
            sb4.append(e4.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb4.toString(), e4);
        }
    }

    static class OpCertificateException extends java.security.cert.CertificateException {
        private java.lang.Throwable getHighSpeedVideoFpsRanges;

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public OpCertificateException(java.lang.String str, java.lang.Throwable th) {
            super(str);
            this.getHighSpeedVideoFpsRanges = th;
        }
    }

    public final java.security.cert.X509Certificate getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws java.security.cert.CertificateException {
        try {
            return (java.security.cert.X509Certificate) this.getOutputMinFrameDuration.createCertificateFactory("X.509").generateCertificate(new java.io.ByteArrayInputStream(x509CertificateHolder.getEncoded()));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot get encoded form of certificate: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.jcajce.OperatorHelper.OpCertificateException(sb.toString(), e);
        } catch (java.security.NoSuchProviderException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot find factory provider: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.operator.jcajce.OperatorHelper.OpCertificateException(sb2.toString(), e2);
        }
    }

    OperatorHelper(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        this.getOutputMinFrameDuration = jcaJceHelper;
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoSizes = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap2;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        Camera2StreamConfigurationMap = hashMap3;
        java.util.HashMap hashMap4 = new java.util.HashMap();
        getHighResolutionOutputSizeshNQ4ISI = hashMap4;
        java.util.HashMap hashMap5 = new java.util.HashMap();
        getInputFormats = hashMap5;
        getHighSpeedVideoFpsRangesFor = new org.bouncycastle.operator.DefaultSignatureNameFinder();
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, "SHA1");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224, "SHA224");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, "SHA256");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384, "SHA384");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, "SHA512");
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD128");
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD160");
        hashMap.put(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD256");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, "RSA/ECB/PKCS1Padding");
        hashMap2.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410");
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMS3DESwrap, "DESEDEWrap");
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMSRC2wrap, "RC2Wrap");
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_wrap, "AESWrap");
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_wrap, "AESWrap");
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap, "AESWrap");
        hashMap3.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_wrap, "CamelliaWrap");
        hashMap3.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_wrap, "CamelliaWrap");
        hashMap3.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_wrap, "CamelliaWrap");
        hashMap3.put(org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap, "SEEDWrap");
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC, "DESede");
        hashMap5.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMS3DESwrap, org.bouncycastle.util.Integers.valueOf(192));
        hashMap5.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_wrap, org.bouncycastle.util.Integers.valueOf(128));
        hashMap5.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_wrap, org.bouncycastle.util.Integers.valueOf(192));
        hashMap5.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap, org.bouncycastle.util.Integers.valueOf(256));
        hashMap5.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_wrap, org.bouncycastle.util.Integers.valueOf(128));
        hashMap5.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_wrap, org.bouncycastle.util.Integers.valueOf(192));
        hashMap5.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_wrap, org.bouncycastle.util.Integers.valueOf(256));
        hashMap5.put(org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap, org.bouncycastle.util.Integers.valueOf(128));
        hashMap5.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC, org.bouncycastle.util.Integers.valueOf(192));
        hashMap4.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.aes, org.jose4j.keys.AesKey.ALGORITHM);
        hashMap4.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC, org.jose4j.keys.AesKey.ALGORITHM);
        hashMap4.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC, org.jose4j.keys.AesKey.ALGORITHM);
        hashMap4.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC, org.jose4j.keys.AesKey.ALGORITHM);
        hashMap4.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC, "DESede");
        hashMap4.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.RC2_CBC, "RC2");
    }
}
