package org.bouncycastle.jcajce.provider.asymmetric.edec;

/* loaded from: classes17.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private static final byte[] getHighSpeedVideoSizes = new byte[0];
    private final java.lang.String Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.Signer getHighSpeedVideoFpsRanges;

    @Override // java.security.SignatureSpi
    protected java.security.AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        java.lang.String str;
        if (!(privateKey instanceof org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPrivateKey)) {
            throw new java.security.InvalidKeyException("cannot identify EdDSA private key");
        }
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = ((org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPrivateKey) privateKey).getHighSpeedVideoSizes;
        if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters) {
            str = "Ed25519";
        } else {
            if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed448PrivateKeyParameters)) {
                throw new java.lang.IllegalStateException("unsupported private key type");
            }
            str = "Ed448";
        }
        org.bouncycastle.crypto.Signer highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        this.getHighSpeedVideoFpsRanges = highSpeedVideoSizes;
        highSpeedVideoSizes.init(true, asymmetricKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        java.lang.String str;
        if (!(publicKey instanceof org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPublicKey)) {
            throw new java.security.InvalidKeyException("cannot identify EdDSA public key");
        }
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = ((org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPublicKey) publicKey).getHighSpeedVideoFpsRanges;
        if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed25519PublicKeyParameters) {
            str = "Ed25519";
        } else {
            if (!(asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed448PublicKeyParameters)) {
                throw new java.lang.IllegalStateException("unsupported public key type");
            }
            str = "Ed448";
        }
        org.bouncycastle.crypto.Signer highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        this.getHighSpeedVideoFpsRanges = highSpeedVideoSizes;
        highSpeedVideoSizes.init(false, asymmetricKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        return this.getHighSpeedVideoFpsRanges.verifySignature(bArr);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) throws java.security.SignatureException {
        this.getHighSpeedVideoFpsRanges.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws java.security.SignatureException {
        this.getHighSpeedVideoFpsRanges.update(b);
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws java.security.SignatureException {
        try {
            return this.getHighSpeedVideoFpsRanges.generateSignature();
        } catch (org.bouncycastle.crypto.CryptoException e) {
            throw new java.security.SignatureException(e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(java.lang.String str, java.lang.Object obj) throws java.security.InvalidParameterException {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) throws java.security.InvalidParameterException {
        throw new java.lang.UnsupportedOperationException("engineGetParameter unsupported");
    }

    private org.bouncycastle.crypto.Signer getHighSpeedVideoSizes(java.lang.String str) throws java.security.InvalidKeyException {
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        if (str2 == null || str.equals(str2)) {
            return str.equals("Ed448") ? new org.bouncycastle.crypto.signers.Ed448Signer(getHighSpeedVideoSizes) : new org.bouncycastle.crypto.signers.Ed25519Signer();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("inappropriate key for ");
        sb.append(this.Camera2StreamConfigurationMap);
        throw new java.security.InvalidKeyException(sb.toString());
    }

    public static final class Ed25519 extends org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi {
        public Ed25519() {
            super("Ed25519");
        }
    }

    public static final class Ed448 extends org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi {
        public Ed448() {
            super("Ed448");
        }
    }

    public static final class EdDSA extends org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi {
        public EdDSA() {
            super(null);
        }
    }

    SignatureSpi(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }
}
