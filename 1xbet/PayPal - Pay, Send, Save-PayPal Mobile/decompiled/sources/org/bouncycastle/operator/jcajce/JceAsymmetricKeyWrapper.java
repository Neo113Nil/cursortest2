package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
public class JceAsymmetricKeyWrapper extends org.bouncycastle.operator.AsymmetricKeyWrapper {
    private static final java.util.Set Camera2StreamConfigurationMap;
    private static final java.util.Map getHighSpeedVideoFpsRanges;
    private org.bouncycastle.operator.jcajce.OperatorHelper getHighResolutionOutputSizeshNQ4ISI;
    private java.security.PublicKey getHighSpeedVideoFpsRangesFor;
    private java.util.Map getHighSpeedVideoSizes;
    private java.security.SecureRandom getInputSizeshNQ4ISI;

    @Override // org.bouncycastle.operator.KeyWrapper
    public byte[] generateWrappedKey(org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.operator.OperatorException {
        byte[] bArr;
        if (!Camera2StreamConfigurationMap.contains(getAlgorithmIdentifier().getAlgorithm())) {
            javax.crypto.Cipher highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(getAlgorithmIdentifier().getAlgorithm(), this.getHighSpeedVideoSizes);
            try {
                java.security.AlgorithmParameters highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(getAlgorithmIdentifier());
                if (highSpeedVideoFpsRangesFor != null) {
                    highSpeedVideoSizes.init(3, this.getHighSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI);
                } else {
                    highSpeedVideoSizes.init(3, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI);
                }
                bArr = highSpeedVideoSizes.wrap(org.bouncycastle.operator.jcajce.OperatorUtils.getHighSpeedVideoSizes(genericKey));
            } catch (java.lang.IllegalStateException | java.lang.UnsupportedOperationException | java.security.InvalidKeyException | java.security.GeneralSecurityException | java.security.ProviderException unused) {
                bArr = null;
            }
            if (bArr != null) {
                return bArr;
            }
            try {
                highSpeedVideoSizes.init(1, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI);
                return highSpeedVideoSizes.doFinal(org.bouncycastle.operator.jcajce.OperatorUtils.getHighSpeedVideoSizes(genericKey).getEncoded());
            } catch (java.security.InvalidKeyException e) {
                throw new org.bouncycastle.operator.OperatorException("unable to encrypt contents key", e);
            } catch (java.security.GeneralSecurityException e2) {
                throw new org.bouncycastle.operator.OperatorException("unable to encrypt contents key", e2);
            }
        }
        try {
            this.getInputSizeshNQ4ISI = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(this.getInputSizeshNQ4ISI);
            java.security.KeyPairGenerator highSpeedVideoSizes2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(getAlgorithmIdentifier().getAlgorithm());
            highSpeedVideoSizes2.initialize(((java.security.interfaces.ECPublicKey) this.getHighSpeedVideoFpsRangesFor).getParams(), this.getInputSizeshNQ4ISI);
            java.security.KeyPair generateKeyPair = highSpeedVideoSizes2.generateKeyPair();
            byte[] bArr2 = new byte[8];
            this.getInputSizeshNQ4ISI.nextBytes(bArr2);
            org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(generateKeyPair.getPublic().getEncoded());
            org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters gostR3410TransportParameters = subjectPublicKeyInfo.getAlgorithm().getAlgorithm().on(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26) ? new org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_28147_param_Z, subjectPublicKeyInfo, bArr2) : new org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet, subjectPublicKeyInfo, bArr2);
            javax.crypto.KeyAgreement Camera2StreamConfigurationMap2 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(getAlgorithmIdentifier().getAlgorithm());
            Camera2StreamConfigurationMap2.init(generateKeyPair.getPrivate(), new org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec(gostR3410TransportParameters.getUkm()));
            Camera2StreamConfigurationMap2.doPhase(this.getHighSpeedVideoFpsRangesFor, true);
            javax.crypto.SecretKey generateSecret = Camera2StreamConfigurationMap2.generateSecret(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap.getId());
            byte[] encoded = org.bouncycastle.operator.jcajce.OperatorUtils.getHighSpeedVideoSizes(genericKey).getEncoded();
            javax.crypto.Cipher highResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap);
            highResolutionOutputSizeshNQ4ISI.init(3, generateSecret, new org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec(gostR3410TransportParameters.getEncryptionParamSet(), gostR3410TransportParameters.getUkm()));
            byte[] wrap = highResolutionOutputSizeshNQ4ISI.wrap(new javax.crypto.spec.SecretKeySpec(encoded, "GOST"));
            return new org.bouncycastle.asn1.cryptopro.GostR3410KeyTransport(new org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey(org.bouncycastle.util.Arrays.copyOfRange(wrap, 0, 32), org.bouncycastle.util.Arrays.copyOfRange(wrap, 32, 36)), gostR3410TransportParameters).getEncoded();
        } catch (java.lang.Exception e3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception wrapping key: ");
            sb.append(e3.getMessage());
            throw new org.bouncycastle.operator.OperatorException(sb.toString(), e3);
        }
    }

    public org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getInputSizeshNQ4ISI = secureRandom;
        return this;
    }

    public org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper setProvider(java.security.Provider provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
        return this;
    }

    public org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper setProvider(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
        return this;
    }

    public org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper setAlgorithmMapping(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        this.getHighSpeedVideoSizes.put(aSN1ObjectIdentifier, str);
        return this;
    }

    private static org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges(java.lang.String str) {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = (org.bouncycastle.asn1.x509.AlgorithmIdentifier) getHighSpeedVideoFpsRanges.get(str);
        if (algorithmIdentifier != null) {
            return algorithmIdentifier;
        }
        throw new java.lang.IllegalArgumentException("unknown digest name: ".concat(java.lang.String.valueOf(str)));
    }

    private static org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(algorithmParameterSpec instanceof javax.crypto.spec.OAEPParameterSpec)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown spec: ");
            sb.append(algorithmParameterSpec.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        javax.crypto.spec.OAEPParameterSpec oAEPParameterSpec = (javax.crypto.spec.OAEPParameterSpec) algorithmParameterSpec;
        if (!oAEPParameterSpec.getMGFAlgorithm().equals(javax.crypto.spec.OAEPParameterSpec.DEFAULT.getMGFAlgorithm())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown MGF: ");
            sb2.append(oAEPParameterSpec.getMGFAlgorithm());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (oAEPParameterSpec.getPSource() instanceof javax.crypto.spec.PSource.PSpecified) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSAES_OAEP, new org.bouncycastle.asn1.pkcs.RSAESOAEPparams(getHighSpeedVideoFpsRanges(oAEPParameterSpec.getDigestAlgorithm()), new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1, getHighSpeedVideoFpsRanges(((java.security.spec.MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm())), new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_pSpecified, new org.bouncycastle.asn1.DEROctetString(((javax.crypto.spec.PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue()))));
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("unknown PSource: ");
        sb3.append(oAEPParameterSpec.getPSource().getAlgorithm());
        throw new java.lang.IllegalArgumentException(sb3.toString());
    }

    public JceAsymmetricKeyWrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PublicKey publicKey) {
        super(algorithmIdentifier);
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        this.getHighSpeedVideoSizes = new java.util.HashMap();
        this.getHighSpeedVideoFpsRangesFor = publicKey;
    }

    public JceAsymmetricKeyWrapper(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.PublicKey publicKey) {
        super(getHighSpeedVideoFpsRangesFor(algorithmParameterSpec));
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        this.getHighSpeedVideoSizes = new java.util.HashMap();
        this.getHighSpeedVideoFpsRangesFor = publicKey;
    }

    public JceAsymmetricKeyWrapper(java.security.cert.X509Certificate x509Certificate) {
        this(x509Certificate.getPublicKey());
    }

    public JceAsymmetricKeyWrapper(java.security.PublicKey publicKey) {
        super(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()).getAlgorithm());
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        this.getHighSpeedVideoSizes = new java.util.HashMap();
        this.getHighSpeedVideoFpsRangesFor = publicKey;
    }

    public JceAsymmetricKeyWrapper(java.security.AlgorithmParameters algorithmParameters, java.security.PublicKey publicKey) throws java.security.spec.InvalidParameterSpecException {
        super(getHighSpeedVideoFpsRangesFor(algorithmParameters.getParameterSpec(java.security.spec.AlgorithmParameterSpec.class)));
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        this.getHighSpeedVideoSizes = new java.util.HashMap();
        this.getHighSpeedVideoFpsRangesFor = publicKey;
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        Camera2StreamConfigurationMap = hashSet;
        hashSet.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH);
        hashSet.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001);
        hashSet.add(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_256);
        hashSet.add(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_512);
        hashSet.add(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256);
        hashSet.add(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512);
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap;
        hashMap.put("SHA1", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA-1", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA224", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA-224", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA256", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA-256", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA384", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA-384", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA512", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA-512", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA512/224", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put(org.apache.commons.codec.digest.MessageDigestAlgorithms.SHA_512_224, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA-512(224)", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA512/256", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA-512/256", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256, org.bouncycastle.asn1.DERNull.INSTANCE));
        hashMap.put("SHA-512(256)", new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256, org.bouncycastle.asn1.DERNull.INSTANCE));
    }
}
