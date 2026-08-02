package org.bouncycastle.jcajce.provider.asymmetric.dh;

/* loaded from: classes17.dex */
public class KeyAgreementSpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi {
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(1);
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(2);
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private org.bouncycastle.jcajce.spec.DHUParameterSpec getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.BasicAgreement getHighSpeedVideoSizes;
    private java.math.BigInteger getHighSpeedVideoSizesFor;
    private final org.bouncycastle.crypto.agreement.DHUnifiedAgreement getInputFormats;
    private java.math.BigInteger getInputSizeshNQ4ISI;
    private byte[] getOutputFormats;
    private org.bouncycastle.jcajce.spec.MQVParameterSpec getOutputMinFrameDuration;

    private static org.bouncycastle.crypto.params.DHPrivateKeyParameters getHighResolutionOutputSizeshNQ4ISI(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (!(privateKey instanceof javax.crypto.interfaces.DHPrivateKey)) {
            throw new java.security.InvalidKeyException("private key not a DHPrivateKey");
        }
        if (privateKey instanceof org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPrivateKey) {
            org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPrivateKey bCDHPrivateKey = (org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPrivateKey) privateKey;
            org.bouncycastle.crypto.params.DHPrivateKeyParameters dHPrivateKeyParameters = bCDHPrivateKey.getHighSpeedVideoFpsRangesFor;
            return dHPrivateKeyParameters != null ? dHPrivateKeyParameters : bCDHPrivateKey.getHighSpeedVideoSizes instanceof org.bouncycastle.jcajce.spec.DHDomainParameterSpec ? new org.bouncycastle.crypto.params.DHPrivateKeyParameters(bCDHPrivateKey.getHighResolutionOutputSizeshNQ4ISI, ((org.bouncycastle.jcajce.spec.DHDomainParameterSpec) bCDHPrivateKey.getHighSpeedVideoSizes).getDomainParameters()) : new org.bouncycastle.crypto.params.DHPrivateKeyParameters(bCDHPrivateKey.getHighResolutionOutputSizeshNQ4ISI, new org.bouncycastle.crypto.params.DHParameters(bCDHPrivateKey.getHighSpeedVideoSizes.getP(), bCDHPrivateKey.getHighSpeedVideoSizes.getG(), null, bCDHPrivateKey.getHighSpeedVideoSizes.getL()));
        }
        javax.crypto.interfaces.DHPrivateKey dHPrivateKey = (javax.crypto.interfaces.DHPrivateKey) privateKey;
        javax.crypto.spec.DHParameterSpec params = dHPrivateKey.getParams();
        return new org.bouncycastle.crypto.params.DHPrivateKeyParameters(dHPrivateKey.getX(), new org.bouncycastle.crypto.params.DHParameters(params.getP(), params.getG(), null, params.getL()));
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.BasicAgreement basicAgreement;
        org.bouncycastle.crypto.params.DHMQVPrivateParameters dHMQVPrivateParameters;
        org.bouncycastle.crypto.agreement.DHUnifiedAgreement dHUnifiedAgreement;
        org.bouncycastle.crypto.params.DHUPrivateParameters dHUPrivateParameters;
        if (!(key instanceof javax.crypto.interfaces.DHPrivateKey)) {
            throw new java.security.InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
        }
        javax.crypto.interfaces.DHPrivateKey dHPrivateKey = (javax.crypto.interfaces.DHPrivateKey) key;
        if (algorithmParameterSpec == null) {
            this.getInputSizeshNQ4ISI = dHPrivateKey.getParams().getP();
            this.Camera2StreamConfigurationMap = dHPrivateKey.getParams().getG();
        } else if (algorithmParameterSpec instanceof javax.crypto.spec.DHParameterSpec) {
            javax.crypto.spec.DHParameterSpec dHParameterSpec = (javax.crypto.spec.DHParameterSpec) algorithmParameterSpec;
            this.getInputSizeshNQ4ISI = dHParameterSpec.getP();
            this.Camera2StreamConfigurationMap = dHParameterSpec.getG();
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.ukmParameters = null;
        } else if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.DHUParameterSpec) {
            if (this.getInputFormats == null) {
                throw new java.security.InvalidAlgorithmParameterException("agreement algorithm not DHU based");
            }
            this.getInputSizeshNQ4ISI = dHPrivateKey.getParams().getP();
            this.Camera2StreamConfigurationMap = dHPrivateKey.getParams().getG();
            org.bouncycastle.jcajce.spec.DHUParameterSpec dHUParameterSpec = (org.bouncycastle.jcajce.spec.DHUParameterSpec) algorithmParameterSpec;
            this.getHighResolutionOutputSizeshNQ4ISI = dHUParameterSpec;
            this.ukmParameters = dHUParameterSpec.getUserKeyingMaterial();
            if (this.getHighResolutionOutputSizeshNQ4ISI.getEphemeralPublicKey() != null) {
                dHUnifiedAgreement = this.getInputFormats;
                dHUPrivateParameters = new org.bouncycastle.crypto.params.DHUPrivateParameters(getHighResolutionOutputSizeshNQ4ISI(dHPrivateKey), getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI.getEphemeralPrivateKey()), getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI.getEphemeralPublicKey()));
            } else {
                dHUnifiedAgreement = this.getInputFormats;
                dHUPrivateParameters = new org.bouncycastle.crypto.params.DHUPrivateParameters(getHighResolutionOutputSizeshNQ4ISI(dHPrivateKey), getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI.getEphemeralPrivateKey()));
            }
            dHUnifiedAgreement.init(dHUPrivateParameters);
        } else if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.MQVParameterSpec) {
            if (this.getHighSpeedVideoSizes == null) {
                throw new java.security.InvalidAlgorithmParameterException("agreement algorithm not MQV based");
            }
            this.getInputSizeshNQ4ISI = dHPrivateKey.getParams().getP();
            this.Camera2StreamConfigurationMap = dHPrivateKey.getParams().getG();
            org.bouncycastle.jcajce.spec.MQVParameterSpec mQVParameterSpec = (org.bouncycastle.jcajce.spec.MQVParameterSpec) algorithmParameterSpec;
            this.getOutputMinFrameDuration = mQVParameterSpec;
            this.ukmParameters = mQVParameterSpec.getUserKeyingMaterial();
            if (this.getOutputMinFrameDuration.getEphemeralPublicKey() != null) {
                basicAgreement = this.getHighSpeedVideoSizes;
                dHMQVPrivateParameters = new org.bouncycastle.crypto.params.DHMQVPrivateParameters(getHighResolutionOutputSizeshNQ4ISI(dHPrivateKey), getHighResolutionOutputSizeshNQ4ISI(this.getOutputMinFrameDuration.getEphemeralPrivateKey()), getHighSpeedVideoFpsRangesFor(this.getOutputMinFrameDuration.getEphemeralPublicKey()));
            } else {
                basicAgreement = this.getHighSpeedVideoSizes;
                dHMQVPrivateParameters = new org.bouncycastle.crypto.params.DHMQVPrivateParameters(getHighResolutionOutputSizeshNQ4ISI(dHPrivateKey), getHighResolutionOutputSizeshNQ4ISI(this.getOutputMinFrameDuration.getEphemeralPrivateKey()));
            }
            basicAgreement.init(dHMQVPrivateParameters);
        } else {
            if (!(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec)) {
                throw new java.security.InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
            }
            if (this.kdf == null) {
                throw new java.security.InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            this.getInputSizeshNQ4ISI = dHPrivateKey.getParams().getP();
            this.Camera2StreamConfigurationMap = dHPrivateKey.getParams().getG();
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.ukmParameters = ((org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial();
        }
        java.math.BigInteger x = dHPrivateKey.getX();
        this.getHighSpeedVideoSizesFor = x;
        this.getOutputFormats = bigIntToBytes(x);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        if (!(key instanceof javax.crypto.interfaces.DHPrivateKey)) {
            throw new java.security.InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
        }
        javax.crypto.interfaces.DHPrivateKey dHPrivateKey = (javax.crypto.interfaces.DHPrivateKey) key;
        this.getInputSizeshNQ4ISI = dHPrivateKey.getParams().getP();
        this.Camera2StreamConfigurationMap = dHPrivateKey.getParams().getG();
        java.math.BigInteger x = dHPrivateKey.getX();
        this.getHighSpeedVideoSizesFor = x;
        this.getOutputFormats = bigIntToBytes(x);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws java.lang.IllegalStateException {
        if (this.getHighSpeedVideoSizesFor != null) {
            return super.engineGenerateSecret();
        }
        throw new java.lang.IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public javax.crypto.SecretKey engineGenerateSecret(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        if (this.getHighSpeedVideoSizesFor != null) {
            return str.equals("TlsPremasterSecret") ? new javax.crypto.spec.SecretKeySpec(trimZeroes(this.getOutputFormats), str) : super.engineGenerateSecret(str);
        }
        throw new java.lang.IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException {
        if (this.getHighSpeedVideoSizesFor != null) {
            return super.engineGenerateSecret(bArr, i);
        }
        throw new java.lang.IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected java.security.Key engineDoPhase(java.security.Key key, boolean z) throws java.security.InvalidKeyException, java.lang.IllegalStateException {
        if (this.getHighSpeedVideoSizesFor == null) {
            throw new java.lang.IllegalStateException("Diffie-Hellman not initialised.");
        }
        if (!(key instanceof javax.crypto.interfaces.DHPublicKey)) {
            throw new java.security.InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
        javax.crypto.interfaces.DHPublicKey dHPublicKey = (javax.crypto.interfaces.DHPublicKey) key;
        if (!dHPublicKey.getParams().getG().equals(this.Camera2StreamConfigurationMap) || !dHPublicKey.getParams().getP().equals(this.getInputSizeshNQ4ISI)) {
            throw new java.security.InvalidKeyException("DHPublicKey not for this KeyAgreement!");
        }
        java.math.BigInteger y = dHPublicKey.getY();
        if (y != null && y.compareTo(getHighSpeedVideoFpsRangesFor) >= 0) {
            java.math.BigInteger bigInteger = this.getInputSizeshNQ4ISI;
            java.math.BigInteger bigInteger2 = getHighSpeedVideoFpsRanges;
            if (y.compareTo(bigInteger.subtract(bigInteger2)) < 0) {
                if (this.getInputFormats != null) {
                    if (!z) {
                        throw new java.lang.IllegalStateException("unified Diffie-Hellman can use only two key pairs");
                    }
                    this.getOutputFormats = this.getInputFormats.calculateAgreement(new org.bouncycastle.crypto.params.DHUPublicParameters(getHighSpeedVideoFpsRangesFor((java.security.PublicKey) key), getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI.getOtherPartyEphemeralKey())));
                    return null;
                }
                if (this.getHighSpeedVideoSizes != null) {
                    if (!z) {
                        throw new java.lang.IllegalStateException("MQV Diffie-Hellman can use only two key pairs");
                    }
                    this.getOutputFormats = bigIntToBytes(this.getHighSpeedVideoSizes.calculateAgreement(new org.bouncycastle.crypto.params.DHMQVPublicParameters(getHighSpeedVideoFpsRangesFor((java.security.PublicKey) key), getHighSpeedVideoFpsRangesFor(this.getOutputMinFrameDuration.getOtherPartyEphemeralKey()))));
                    return null;
                }
                java.math.BigInteger modPow = y.modPow(this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI);
                if (modPow.compareTo(bigInteger2) == 0) {
                    throw new java.security.InvalidKeyException("Shared key can't be 1");
                }
                this.getOutputFormats = bigIntToBytes(modPow);
                if (z) {
                    return null;
                }
                return new org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey(modPow, dHPublicKey.getParams());
            }
        }
        throw new java.security.InvalidKeyException("Invalid DH PublicKey");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] calcSecret() {
        return this.getOutputFormats;
    }

    protected byte[] bigIntToBytes(java.math.BigInteger bigInteger) {
        int bitLength = (this.getInputSizeshNQ4ISI.bitLength() + 7) / 8;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == bitLength) {
            return byteArray;
        }
        if (byteArray[0] != 0 || byteArray.length != bitLength + 1) {
            byte[] bArr = new byte[bitLength];
            java.lang.System.arraycopy(byteArray, 0, bArr, bitLength - byteArray.length, byteArray.length);
            return bArr;
        }
        int length = byteArray.length - 1;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(byteArray, 1, bArr2, 0, length);
        return bArr2;
    }

    private static org.bouncycastle.crypto.params.DHPublicKeyParameters getHighSpeedVideoFpsRangesFor(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (!(publicKey instanceof javax.crypto.interfaces.DHPublicKey)) {
            throw new java.security.InvalidKeyException("public key not a DHPublicKey");
        }
        if (publicKey instanceof org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey) {
            return ((org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey) publicKey).engineGetKeyParameters();
        }
        javax.crypto.interfaces.DHPublicKey dHPublicKey = (javax.crypto.interfaces.DHPublicKey) publicKey;
        javax.crypto.spec.DHParameterSpec params = dHPublicKey.getParams();
        return params instanceof org.bouncycastle.jcajce.spec.DHDomainParameterSpec ? new org.bouncycastle.crypto.params.DHPublicKeyParameters(dHPublicKey.getY(), ((org.bouncycastle.jcajce.spec.DHDomainParameterSpec) params).getDomainParameters()) : new org.bouncycastle.crypto.params.DHPublicKeyParameters(dHPublicKey.getY(), new org.bouncycastle.crypto.params.DHParameters(params.getP(), params.getG(), null, params.getL()));
    }

    public KeyAgreementSpi(java.lang.String str, org.bouncycastle.crypto.agreement.DHUnifiedAgreement dHUnifiedAgreement, org.bouncycastle.crypto.DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.getInputFormats = dHUnifiedAgreement;
        this.getHighSpeedVideoSizes = null;
    }

    public KeyAgreementSpi(java.lang.String str, org.bouncycastle.crypto.DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.getInputFormats = null;
        this.getHighSpeedVideoSizes = null;
    }

    public KeyAgreementSpi(java.lang.String str, org.bouncycastle.crypto.BasicAgreement basicAgreement, org.bouncycastle.crypto.DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.getInputFormats = null;
        this.getHighSpeedVideoSizes = basicAgreement;
    }

    public static class DHUwithSHA1CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("DHUwithSHA1CKDF", new org.bouncycastle.crypto.agreement.DHUnifiedAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class DHUwithSHA1KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("DHUwithSHA1KDF", new org.bouncycastle.crypto.agreement.DHUnifiedAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class DHUwithSHA224CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("DHUwithSHA224CKDF", new org.bouncycastle.crypto.agreement.DHUnifiedAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class DHUwithSHA224KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("DHUwithSHA224KDF", new org.bouncycastle.crypto.agreement.DHUnifiedAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class DHUwithSHA256CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("DHUwithSHA256CKDF", new org.bouncycastle.crypto.agreement.DHUnifiedAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class DHUwithSHA256KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("DHUwithSHA256KDF", new org.bouncycastle.crypto.agreement.DHUnifiedAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class DHUwithSHA384CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("DHUwithSHA384CKDF", new org.bouncycastle.crypto.agreement.DHUnifiedAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class DHUwithSHA384KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("DHUwithSHA384KDF", new org.bouncycastle.crypto.agreement.DHUnifiedAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class DHUwithSHA512CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("DHUwithSHA512CKDF", new org.bouncycastle.crypto.agreement.DHUnifiedAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class DHUwithSHA512KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("DHUwithSHA512KDF", new org.bouncycastle.crypto.agreement.DHUnifiedAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class DHwithRFC2631KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHwithRFC2631KDF() {
            super("DHwithRFC2631KDF", new org.bouncycastle.crypto.agreement.kdf.DHKEKGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA1CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("DHwithSHA1CKDF", new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA1KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("DHwithSHA1CKDF", new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA224CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHwithSHA224CKDF() {
            super("DHwithSHA224CKDF", new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class DHwithSHA224KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHwithSHA224KDF() {
            super("DHwithSHA224CKDF", new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class DHwithSHA256CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("DHwithSHA256CKDF", new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class DHwithSHA256KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHwithSHA256KDF() {
            super("DHwithSHA256CKDF", new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class DHwithSHA384CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("DHwithSHA384CKDF", new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class DHwithSHA384KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHwithSHA384KDF() {
            super("DHwithSHA384KDF", new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class DHwithSHA512CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("DHwithSHA512CKDF", new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class DHwithSHA512KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public DHwithSHA512KDF() {
            super("DHwithSHA512KDF", new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class MQVwithSHA1CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("MQVwithSHA1CKDF", new org.bouncycastle.crypto.agreement.MQVBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA1KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("MQVwithSHA1KDF", new org.bouncycastle.crypto.agreement.MQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA224CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("MQVwithSHA224CKDF", new org.bouncycastle.crypto.agreement.MQVBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA224KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("MQVwithSHA224KDF", new org.bouncycastle.crypto.agreement.MQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA256CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("MQVwithSHA256CKDF", new org.bouncycastle.crypto.agreement.MQVBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA256KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("MQVwithSHA256KDF", new org.bouncycastle.crypto.agreement.MQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA384CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("MQVwithSHA384CKDF", new org.bouncycastle.crypto.agreement.MQVBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA384KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("MQVwithSHA384KDF", new org.bouncycastle.crypto.agreement.MQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA512CKDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("MQVwithSHA512CKDF", new org.bouncycastle.crypto.agreement.MQVBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class MQVwithSHA512KDF extends org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("MQVwithSHA512KDF", new org.bouncycastle.crypto.agreement.MQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public KeyAgreementSpi() {
        this("Diffie-Hellman", null);
    }
}
