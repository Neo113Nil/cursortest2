package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public final class BouncyCastleProvider extends java.security.Provider implements org.bouncycastle.jcajce.provider.config.ConfigurableProvider {
    private static java.lang.String getOutputMinFrameDuration = "BouncyCastle Security Provider v1.70";
    public static final org.bouncycastle.jcajce.provider.config.ProviderConfiguration CONFIGURATION = new org.bouncycastle.jce.provider.BouncyCastleProviderConfiguration();
    private static final java.util.Map getHighSpeedVideoSizesFor = new java.util.HashMap();
    private static final java.lang.Class getOutputStallDuration = org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil.loadClass(org.bouncycastle.jce.provider.BouncyCastleProvider.class, "java.security.cert.PKIXRevocationChecker");
    private static final java.lang.String[] getOutputFormats = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
    private static final java.lang.String[] getInputFormats = {"SipHash", "SipHash128", "Poly1305"};
    private static final java.lang.String[] getInputSizeshNQ4ISI = {org.jose4j.keys.AesKey.ALGORITHM, "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};
    private static final java.lang.String[] Camera2StreamConfigurationMap = {"X509", "IES", "COMPOSITE"};
    private static final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};
    private static final java.lang.String[] getHighSpeedVideoFpsRanges = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};
    public static final java.lang.String PROVIDER_NAME = "BC";
    private static final java.lang.String[] getHighSpeedVideoFpsRangesFor = {PROVIDER_NAME, "BCFKS", "PKCS12"};
    private static final java.lang.String[] getHighSpeedVideoSizes = {"DRBG"};

    static /* synthetic */ void getHighSpeedVideoSizes(org.bouncycastle.jce.provider.BouncyCastleProvider bouncyCastleProvider) {
        java.lang.String str;
        java.lang.String str2;
        bouncyCastleProvider.getHighSpeedVideoFpsRanges("org.bouncycastle.jcajce.provider.digest.", getHighSpeedVideoFpsRanges);
        bouncyCastleProvider.getHighSpeedVideoFpsRanges("org.bouncycastle.jcajce.provider.symmetric.", getOutputFormats);
        bouncyCastleProvider.getHighSpeedVideoFpsRanges("org.bouncycastle.jcajce.provider.symmetric.", getInputFormats);
        bouncyCastleProvider.getHighSpeedVideoFpsRanges("org.bouncycastle.jcajce.provider.symmetric.", getInputSizeshNQ4ISI);
        bouncyCastleProvider.getHighSpeedVideoFpsRanges("org.bouncycastle.jcajce.provider.asymmetric.", Camera2StreamConfigurationMap);
        bouncyCastleProvider.getHighSpeedVideoFpsRanges("org.bouncycastle.jcajce.provider.asymmetric.", getHighResolutionOutputSizeshNQ4ISI);
        bouncyCastleProvider.getHighSpeedVideoFpsRanges("org.bouncycastle.jcajce.provider.keystore.", getHighSpeedVideoFpsRangesFor);
        bouncyCastleProvider.getHighSpeedVideoFpsRanges("org.bouncycastle.jcajce.provider.drbg.", getHighSpeedVideoSizes);
        bouncyCastleProvider.addKeyInfoConverter(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.sphincs256, new org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyFactorySpi());
        bouncyCastleProvider.addKeyInfoConverter(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.newHope, new org.bouncycastle.pqc.jcajce.provider.newhope.NHKeyFactorySpi());
        bouncyCastleProvider.addKeyInfoConverter(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.xmss, new org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyFactorySpi());
        bouncyCastleProvider.addKeyInfoConverter(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmss, new org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyFactorySpi());
        bouncyCastleProvider.addKeyInfoConverter(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.xmss_mt, new org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyFactorySpi());
        bouncyCastleProvider.addKeyInfoConverter(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmssmt, new org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyFactorySpi());
        bouncyCastleProvider.addKeyInfoConverter(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcEliece, new org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi());
        bouncyCastleProvider.addKeyInfoConverter(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcElieceCca2, new org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi());
        bouncyCastleProvider.addKeyInfoConverter(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.rainbow, new org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyFactorySpi());
        bouncyCastleProvider.addKeyInfoConverter(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.qTESLA_p_I, new org.bouncycastle.pqc.jcajce.provider.qtesla.QTESLAKeyFactorySpi());
        bouncyCastleProvider.addKeyInfoConverter(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.qTESLA_p_III, new org.bouncycastle.pqc.jcajce.provider.qtesla.QTESLAKeyFactorySpi());
        bouncyCastleProvider.addKeyInfoConverter(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_hss_lms_hashsig, new org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyFactorySpi());
        bouncyCastleProvider.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        bouncyCastleProvider.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        bouncyCastleProvider.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        bouncyCastleProvider.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        bouncyCastleProvider.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        bouncyCastleProvider.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        bouncyCastleProvider.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        bouncyCastleProvider.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        bouncyCastleProvider.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        bouncyCastleProvider.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        bouncyCastleProvider.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        bouncyCastleProvider.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        bouncyCastleProvider.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        bouncyCastleProvider.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        bouncyCastleProvider.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        java.lang.Class cls = getOutputStallDuration;
        bouncyCastleProvider.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        bouncyCastleProvider.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        if (cls != null) {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
            bouncyCastleProvider.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
        } else {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
            bouncyCastleProvider.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
        }
        bouncyCastleProvider.put("CertPathBuilder.RFC3280", str2);
        bouncyCastleProvider.put("CertPathValidator.PKIX", str);
        bouncyCastleProvider.put("CertPathBuilder.PKIX", str2);
        bouncyCastleProvider.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        bouncyCastleProvider.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        bouncyCastleProvider.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        bouncyCastleProvider.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public final void setParameter(java.lang.String str, java.lang.Object obj) {
        java.lang.ThreadLocal threadLocal;
        org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration = CONFIGURATION;
        synchronized (providerConfiguration) {
            org.bouncycastle.jce.provider.BouncyCastleProviderConfiguration bouncyCastleProviderConfiguration = (org.bouncycastle.jce.provider.BouncyCastleProviderConfiguration) providerConfiguration;
            java.lang.SecurityManager securityManager = java.lang.System.getSecurityManager();
            if (str.equals(org.bouncycastle.jcajce.provider.config.ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA)) {
                if (securityManager != null) {
                    securityManager.checkPermission(org.bouncycastle.jce.provider.BouncyCastleProviderConfiguration.getHighSpeedVideoFpsRangesFor);
                }
                org.bouncycastle.jce.spec.ECParameterSpec convertSpec = ((obj instanceof org.bouncycastle.jce.spec.ECParameterSpec) || obj == null) ? (org.bouncycastle.jce.spec.ECParameterSpec) obj : org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec((java.security.spec.ECParameterSpec) obj);
                if (convertSpec == null) {
                    threadLocal = bouncyCastleProviderConfiguration.getOutputSizeshNQ4ISI;
                    threadLocal.remove();
                } else {
                    bouncyCastleProviderConfiguration.getOutputSizeshNQ4ISI.set(convertSpec);
                }
            } else if (str.equals(org.bouncycastle.jcajce.provider.config.ConfigurableProvider.EC_IMPLICITLY_CA)) {
                if (securityManager != null) {
                    securityManager.checkPermission(org.bouncycastle.jce.provider.BouncyCastleProviderConfiguration.getInputFormats);
                }
                if ((obj instanceof org.bouncycastle.jce.spec.ECParameterSpec) || obj == null) {
                    bouncyCastleProviderConfiguration.getOutputStallDurationlomOqCM = (org.bouncycastle.jce.spec.ECParameterSpec) obj;
                } else {
                    bouncyCastleProviderConfiguration.getOutputStallDurationlomOqCM = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec((java.security.spec.ECParameterSpec) obj);
                }
            } else if (str.equals(org.bouncycastle.jcajce.provider.config.ConfigurableProvider.THREAD_LOCAL_DH_DEFAULT_PARAMS)) {
                if (securityManager != null) {
                    securityManager.checkPermission(org.bouncycastle.jce.provider.BouncyCastleProviderConfiguration.getHighSpeedVideoSizes);
                }
                if (!(obj instanceof javax.crypto.spec.DHParameterSpec) && !(obj instanceof javax.crypto.spec.DHParameterSpec[]) && obj != null) {
                    throw new java.lang.IllegalArgumentException("not a valid DHParameterSpec");
                }
                threadLocal = bouncyCastleProviderConfiguration.getOutputFormats;
                if (obj == null) {
                    threadLocal.remove();
                } else {
                    threadLocal.set(obj);
                }
            } else if (str.equals(org.bouncycastle.jcajce.provider.config.ConfigurableProvider.DH_DEFAULT_PARAMS)) {
                if (securityManager != null) {
                    securityManager.checkPermission(org.bouncycastle.jce.provider.BouncyCastleProviderConfiguration.getHighResolutionOutputSizeshNQ4ISI);
                }
                if (!(obj instanceof javax.crypto.spec.DHParameterSpec) && !(obj instanceof javax.crypto.spec.DHParameterSpec[]) && obj != null) {
                    throw new java.lang.IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
                }
                bouncyCastleProviderConfiguration.getHighSpeedVideoSizesFor = obj;
            } else if (str.equals(org.bouncycastle.jcajce.provider.config.ConfigurableProvider.ACCEPTABLE_EC_CURVES)) {
                if (securityManager != null) {
                    securityManager.checkPermission(org.bouncycastle.jce.provider.BouncyCastleProviderConfiguration.getHighSpeedVideoFpsRanges);
                }
                bouncyCastleProviderConfiguration.getInputSizeshNQ4ISI = (java.util.Set) obj;
            } else if (str.equals(org.bouncycastle.jcajce.provider.config.ConfigurableProvider.ADDITIONAL_EC_PARAMETERS)) {
                if (securityManager != null) {
                    securityManager.checkPermission(org.bouncycastle.jce.provider.BouncyCastleProviderConfiguration.Camera2StreamConfigurationMap);
                }
                bouncyCastleProviderConfiguration.getOutputMinFrameDuration = (java.util.Map) obj;
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public final boolean hasAlgorithm(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        if (containsKey(sb.toString())) {
            return true;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.");
        sb2.append(str);
        sb2.append(".");
        sb2.append(str2);
        return containsKey(sb2.toString());
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public final org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter getKeyInfoConverter(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) getHighSpeedVideoSizesFor.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public final void addKeyInfoConverter(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        java.util.Map map = getHighSpeedVideoSizesFor;
        synchronized (map) {
            map.put(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public final void addAttributes(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        for (java.lang.String str2 : map.keySet()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            java.lang.String obj = sb.toString();
            if (containsKey(obj)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("duplicate provider attribute key (");
                sb2.append(obj);
                sb2.append(") found");
                throw new java.lang.IllegalStateException(sb2.toString());
            }
            put(obj, map.get(str2));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public final void addAlgorithm(java.lang.String str, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(aSN1ObjectIdentifier);
        addAlgorithm(sb.toString(), str2);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(".OID.");
        sb2.append(aSN1ObjectIdentifier);
        addAlgorithm(sb2.toString(), str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public final void addAlgorithm(java.lang.String str, java.lang.String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("duplicate provider key (");
        sb.append(str);
        sb.append(") found");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private void getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(strArr[i]);
            sb.append("$Mappings");
            java.lang.Class loadClass = org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil.loadClass(org.bouncycastle.jce.provider.BouncyCastleProvider.class, sb.toString());
            if (loadClass != null) {
                try {
                    ((org.bouncycastle.jcajce.provider.util.AlgorithmProvider) loadClass.newInstance()).configure(this);
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot create instance of ");
                    sb2.append(str);
                    sb2.append(strArr[i]);
                    sb2.append("$Mappings : ");
                    sb2.append(e);
                    throw new java.lang.InternalError(sb2.toString());
                }
            }
        }
    }

    public static java.security.PublicKey getPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        if (highSpeedVideoFpsRangesFor == null) {
            return null;
        }
        return highSpeedVideoFpsRangesFor.generatePublic(subjectPublicKeyInfo);
    }

    public static java.security.PrivateKey getPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
        if (highSpeedVideoFpsRangesFor == null) {
            return null;
        }
        return highSpeedVideoFpsRangesFor.generatePrivate(privateKeyInfo);
    }

    private static org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        java.util.Map map = getHighSpeedVideoSizesFor;
        synchronized (map) {
            asymmetricKeyInfoConverter = (org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) map.get(aSN1ObjectIdentifier);
        }
        return asymmetricKeyInfoConverter;
    }

    public BouncyCastleProvider() {
        super(PROVIDER_NAME, 1.7d, getOutputMinFrameDuration);
        java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: org.bouncycastle.jce.provider.BouncyCastleProvider.1
            @Override // java.security.PrivilegedAction
            public java.lang.Object run() {
                org.bouncycastle.jce.provider.BouncyCastleProvider.getHighSpeedVideoSizes(org.bouncycastle.jce.provider.BouncyCastleProvider.this);
                return null;
            }
        });
    }
}
