package org.bouncycastle.jcajce.provider.asymmetric.ec;

/* loaded from: classes17.dex */
public class KeyFactorySpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi implements org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter {
    org.bouncycastle.jcajce.provider.config.ProviderConfiguration getHighSpeedVideoFpsRanges;
    java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PublicKey generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey)) {
            return new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey(this.getHighSpeedVideoFpsRangesFor, subjectPublicKeyInfo, this.getHighSpeedVideoFpsRanges);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
        sb.append(algorithm);
        sb.append(" in key not recognised");
        throw new java.io.IOException(sb.toString());
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PrivateKey generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey)) {
            return new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey(this.getHighSpeedVideoFpsRangesFor, privateKeyInfo, this.getHighSpeedVideoFpsRanges);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
        sb.append(algorithm);
        sb.append(" in key not recognised");
        throw new java.io.IOException(sb.toString());
    }

    @Override // java.security.KeyFactorySpi
    protected java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException {
        if (key instanceof java.security.interfaces.ECPublicKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey((java.security.interfaces.ECPublicKey) key, this.getHighSpeedVideoFpsRanges);
        }
        if (key instanceof java.security.interfaces.ECPrivateKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey((java.security.interfaces.ECPrivateKey) key, this.getHighSpeedVideoFpsRanges);
        }
        throw new java.security.InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.spec.KeySpec engineGetKeySpec(java.security.Key key, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
        if ((cls.isAssignableFrom(java.security.spec.KeySpec.class) || cls.isAssignableFrom(java.security.spec.ECPublicKeySpec.class)) && (key instanceof java.security.interfaces.ECPublicKey)) {
            java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new java.security.spec.ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            org.bouncycastle.jce.spec.ECParameterSpec ecImplicitlyCa = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new java.security.spec.ECPublicKeySpec(eCPublicKey.getW(), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getSeed()), ecImplicitlyCa));
        }
        if ((cls.isAssignableFrom(java.security.spec.KeySpec.class) || cls.isAssignableFrom(java.security.spec.ECPrivateKeySpec.class)) && (key instanceof java.security.interfaces.ECPrivateKey)) {
            java.security.interfaces.ECPrivateKey eCPrivateKey = (java.security.interfaces.ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new java.security.spec.ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            org.bouncycastle.jce.spec.ECParameterSpec ecImplicitlyCa2 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new java.security.spec.ECPrivateKeySpec(eCPrivateKey.getS(), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(ecImplicitlyCa2.getCurve(), ecImplicitlyCa2.getSeed()), ecImplicitlyCa2));
        }
        if (cls.isAssignableFrom(org.bouncycastle.jce.spec.ECPublicKeySpec.class) && (key instanceof java.security.interfaces.ECPublicKey)) {
            java.security.interfaces.ECPublicKey eCPublicKey2 = (java.security.interfaces.ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new org.bouncycastle.jce.spec.ECPublicKeySpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCPublicKey2.getParams()));
            }
            return new org.bouncycastle.jce.spec.ECPublicKeySpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        }
        if (cls.isAssignableFrom(org.bouncycastle.jce.spec.ECPrivateKeySpec.class) && (key instanceof java.security.interfaces.ECPrivateKey)) {
            java.security.interfaces.ECPrivateKey eCPrivateKey2 = (java.security.interfaces.ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new org.bouncycastle.jce.spec.ECPrivateKeySpec(eCPrivateKey2.getS(), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCPrivateKey2.getParams()));
            }
            return new org.bouncycastle.jce.spec.ECPrivateKeySpec(eCPrivateKey2.getS(), org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        }
        if (cls.isAssignableFrom(org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec.class) && (key instanceof java.security.interfaces.ECPublicKey)) {
            if (!(key instanceof org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid key type: ");
                sb.append(key.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey bCECPublicKey = (org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey) key;
            org.bouncycastle.jce.spec.ECParameterSpec parameters = bCECPublicKey.getParameters();
            try {
                return new org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec(org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil.encodePublicKey(new org.bouncycastle.crypto.params.ECPublicKeyParameters(bCECPublicKey.getQ(), new org.bouncycastle.crypto.params.ECDomainParameters(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed()))));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to produce encoding: ");
                sb2.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
        }
        if (!cls.isAssignableFrom(org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec.class) || !(key instanceof java.security.interfaces.ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        if (!(key instanceof org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey)) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("invalid key type: ");
            sb3.append(key.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        try {
            return new org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(key.getEncoded()).parsePrivateKey().toASN1Primitive().getEncoded());
        } catch (java.io.IOException e2) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("cannot encoded key: ");
            sb4.append(e2.getMessage());
            throw new java.lang.IllegalArgumentException(sb4.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        try {
            if (keySpec instanceof org.bouncycastle.jce.spec.ECPublicKeySpec) {
                return new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey(this.getHighSpeedVideoFpsRangesFor, (org.bouncycastle.jce.spec.ECPublicKeySpec) keySpec, this.getHighSpeedVideoFpsRanges);
            }
            if (keySpec instanceof java.security.spec.ECPublicKeySpec) {
                return new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey(this.getHighSpeedVideoFpsRangesFor, (java.security.spec.ECPublicKeySpec) keySpec, this.getHighSpeedVideoFpsRanges);
            }
            if (!(keySpec instanceof org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec)) {
                return super.engineGeneratePublic(keySpec);
            }
            org.bouncycastle.crypto.params.AsymmetricKeyParameter parsePublicKey = org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil.parsePublicKey(((org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec) keySpec).getEncoded());
            if (!(parsePublicKey instanceof org.bouncycastle.crypto.params.ECPublicKeyParameters)) {
                throw new java.lang.IllegalArgumentException("openssh key is not ec public key");
            }
            org.bouncycastle.crypto.params.ECDomainParameters parameters = ((org.bouncycastle.crypto.params.ECPublicKeyParameters) parsePublicKey).getParameters();
            return engineGeneratePublic(new org.bouncycastle.jce.spec.ECPublicKeySpec(((org.bouncycastle.crypto.params.ECPublicKeyParameters) parsePublicKey).getQ(), new org.bouncycastle.jce.spec.ECParameterSpec(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed())));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid KeySpec: ");
            sb.append(e.getMessage());
            throw new java.security.spec.InvalidKeySpecException(sb.toString(), e);
        }
    }

    public static class EC extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi {
        public EC() {
            super("EC", org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDH extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi {
        public ECDH() {
            super("ECDH", org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDHC extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi {
        public ECDHC() {
            super("ECDHC", org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDSA extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi {
        public ECDSA() {
            super("ECDSA", org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECGOST3410 extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi {
        public ECGOST3410() {
            super("ECGOST3410", org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECGOST3410_2012 extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi {
        public ECGOST3410_2012() {
            super("ECGOST3410-2012", org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECMQV extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi {
        public ECMQV() {
            super("ECMQV", org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (keySpec instanceof org.bouncycastle.jce.spec.ECPrivateKeySpec) {
            return new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey(this.getHighSpeedVideoFpsRangesFor, (org.bouncycastle.jce.spec.ECPrivateKeySpec) keySpec, this.getHighSpeedVideoFpsRanges);
        }
        if (keySpec instanceof java.security.spec.ECPrivateKeySpec) {
            return new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey(this.getHighSpeedVideoFpsRangesFor, (java.security.spec.ECPrivateKeySpec) keySpec, this.getHighSpeedVideoFpsRanges);
        }
        if (!(keySpec instanceof org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec)) {
            return super.engineGeneratePrivate(keySpec);
        }
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(((org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec) keySpec).getEncoded());
        try {
            return new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey(this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, eCPrivateKey.getParametersObject()), eCPrivateKey), this.getHighSpeedVideoFpsRanges);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("bad encoding: ");
            sb.append(e.getMessage());
            throw new java.security.spec.InvalidKeySpecException(sb.toString());
        }
    }

    KeyFactorySpi(java.lang.String str, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = providerConfiguration;
    }
}
