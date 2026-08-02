package org.bouncycastle.jcajce.provider.asymmetric.edec;

/* loaded from: classes17.dex */
public class KeyAgreementSpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi {
    private org.bouncycastle.crypto.RawAgreement getHighSpeedVideoFpsRanges;
    private org.bouncycastle.jcajce.spec.DHUParameterSpec getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    @Override // javax.crypto.KeyAgreementSpi
    protected java.security.Key engineDoPhase(java.security.Key key, boolean z) throws java.security.InvalidKeyException, java.lang.IllegalStateException {
        if (this.getHighSpeedVideoFpsRanges == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.kaAlgorithm);
            sb.append(" not initialised.");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (!z) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(this.kaAlgorithm);
            sb2.append(" can only be between two parties.");
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        if (!(key instanceof org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey)) {
            throw new java.security.InvalidKeyException("cannot identify XDH public key");
        }
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = ((org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey) key).getHighResolutionOutputSizeshNQ4ISI;
        byte[] bArr = new byte[this.getHighSpeedVideoFpsRanges.getAgreementSize()];
        this.getHighSpeedVideoSizes = bArr;
        org.bouncycastle.jcajce.spec.DHUParameterSpec dHUParameterSpec = this.getHighSpeedVideoFpsRangesFor;
        if (dHUParameterSpec != null) {
            this.getHighSpeedVideoFpsRanges.calculateAgreement(new org.bouncycastle.crypto.params.XDHUPublicParameters(asymmetricKeyParameter, ((org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey) dHUParameterSpec.getOtherPartyEphemeralKey()).getHighResolutionOutputSizeshNQ4ISI), this.getHighSpeedVideoSizes, 0);
            return null;
        }
        this.getHighSpeedVideoFpsRanges.calculateAgreement(asymmetricKeyParameter, bArr, 0);
        return null;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        java.lang.String str;
        if (!(key instanceof org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPrivateKey)) {
            throw new java.security.InvalidKeyException("cannot identify XDH private key");
        }
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = ((org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPrivateKey) key).getHighSpeedVideoSizes;
        if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X25519PrivateKeyParameters) {
            str = "X25519";
        } else {
            if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X448PrivateKeyParameters)) {
                throw new java.lang.IllegalStateException("unsupported private key type");
            }
            str = "X448";
        }
        org.bouncycastle.crypto.RawAgreement highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRanges;
        highSpeedVideoFpsRanges.init(asymmetricKeyParameter);
        if (this.kdf != null) {
            this.ukmParameters = new byte[0];
        } else {
            this.ukmParameters = null;
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        java.lang.String str;
        if (!(key instanceof org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPrivateKey)) {
            throw new java.security.InvalidKeyException("cannot identify XDH private key");
        }
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = ((org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPrivateKey) key).getHighSpeedVideoSizes;
        if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X25519PrivateKeyParameters) {
            str = "X25519";
        } else {
            if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X448PrivateKeyParameters)) {
                throw new java.lang.IllegalStateException("unsupported private key type");
            }
            str = "X448";
        }
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        this.ukmParameters = null;
        if (!(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.DHUParameterSpec)) {
            this.getHighSpeedVideoFpsRanges.init(asymmetricKeyParameter);
            if (!(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec)) {
                throw new java.security.InvalidAlgorithmParameterException("unknown ParameterSpec");
            }
            if (this.kdf == null) {
                throw new java.security.InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            this.ukmParameters = ((org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial();
        } else {
            if (this.kaAlgorithm.indexOf(85) < 0) {
                throw new java.security.InvalidAlgorithmParameterException("agreement algorithm not DHU based");
            }
            org.bouncycastle.jcajce.spec.DHUParameterSpec dHUParameterSpec = (org.bouncycastle.jcajce.spec.DHUParameterSpec) algorithmParameterSpec;
            this.getHighSpeedVideoFpsRangesFor = dHUParameterSpec;
            this.ukmParameters = dHUParameterSpec.getUserKeyingMaterial();
            this.getHighSpeedVideoFpsRanges.init(new org.bouncycastle.crypto.params.XDHUPrivateParameters(asymmetricKeyParameter, ((org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPrivateKey) this.getHighSpeedVideoFpsRangesFor.getEphemeralPrivateKey()).getHighSpeedVideoSizes, ((org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey) this.getHighSpeedVideoFpsRangesFor.getEphemeralPublicKey()).getHighResolutionOutputSizeshNQ4ISI));
        }
        if (this.kdf == null || this.ukmParameters != null) {
            return;
        }
        this.ukmParameters = new byte[0];
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] calcSecret() {
        return this.getHighSpeedVideoSizes;
    }

    private org.bouncycastle.crypto.RawAgreement getHighSpeedVideoFpsRanges(java.lang.String str) throws java.security.InvalidKeyException {
        if (this.kaAlgorithm.equals("XDH") || this.kaAlgorithm.startsWith(str)) {
            int indexOf = this.kaAlgorithm.indexOf(85);
            boolean startsWith = str.startsWith("X448");
            return indexOf > 0 ? startsWith ? new org.bouncycastle.crypto.agreement.XDHUnifiedAgreement(new org.bouncycastle.crypto.agreement.X448Agreement()) : new org.bouncycastle.crypto.agreement.XDHUnifiedAgreement(new org.bouncycastle.crypto.agreement.X25519Agreement()) : startsWith ? new org.bouncycastle.crypto.agreement.X448Agreement() : new org.bouncycastle.crypto.agreement.X25519Agreement();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("inappropriate key for ");
        sb.append(this.kaAlgorithm);
        throw new java.security.InvalidKeyException(sb.toString());
    }

    public static final class X25519 extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X25519() {
            super("X25519");
        }
    }

    public static class X25519UwithSHA256CKDF extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X25519UwithSHA256CKDF() {
            super("X25519UwithSHA256CKDF", new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class X25519UwithSHA256KDF extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X25519UwithSHA256KDF() {
            super("X25519UwithSHA256KDF", new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static final class X25519withSHA256CKDF extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X25519withSHA256CKDF() {
            super("X25519withSHA256CKDF", new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static final class X25519withSHA256KDF extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X25519withSHA256KDF() {
            super("X25519withSHA256KDF", new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class X25519withSHA384CKDF extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X25519withSHA384CKDF() {
            super("X25519withSHA384CKDF", new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class X25519withSHA512CKDF extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X25519withSHA512CKDF() {
            super("X25519withSHA512CKDF", new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static final class X448 extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X448() {
            super("X448");
        }
    }

    public static class X448UwithSHA512CKDF extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X448UwithSHA512CKDF() {
            super("X448UwithSHA512CKDF", new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class X448UwithSHA512KDF extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X448UwithSHA512KDF() {
            super("X448UwithSHA512KDF", new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static final class X448withSHA256CKDF extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X448withSHA256CKDF() {
            super("X448withSHA256CKDF", new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class X448withSHA384CKDF extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X448withSHA384CKDF() {
            super("X448withSHA384CKDF", new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static final class X448withSHA512CKDF extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X448withSHA512CKDF() {
            super("X448withSHA512CKDF", new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static final class X448withSHA512KDF extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public X448withSHA512KDF() {
            super("X448withSHA512KDF", new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static final class XDH extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi {
        public XDH() {
            super("XDH");
        }
    }

    KeyAgreementSpi(java.lang.String str, org.bouncycastle.crypto.DerivationFunction derivationFunction) {
        super(str, derivationFunction);
    }

    KeyAgreementSpi(java.lang.String str) {
        super(str, null);
    }
}
