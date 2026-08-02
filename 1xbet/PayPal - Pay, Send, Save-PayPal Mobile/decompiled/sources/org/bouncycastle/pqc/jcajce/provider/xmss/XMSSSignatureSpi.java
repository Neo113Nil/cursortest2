package org.bouncycastle.pqc.jcajce.provider.xmss;

/* loaded from: classes17.dex */
public class XMSSSignatureSpi extends java.security.Signature implements org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature {
    private org.bouncycastle.pqc.crypto.xmss.XMSSSigner Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (!(privateKey instanceof org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPrivateKey)) {
            throw new java.security.InvalidKeyException("unknown private key passed to XMSS");
        }
        org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPrivateKey bCXMSSPrivateKey = (org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPrivateKey) privateKey;
        org.bouncycastle.crypto.CipherParameters cipherParameters = bCXMSSPrivateKey.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = bCXMSSPrivateKey.getHighSpeedVideoSizes;
        java.security.SecureRandom secureRandom = this.getHighSpeedVideoFpsRanges;
        if (secureRandom != null) {
            cipherParameters = new org.bouncycastle.crypto.params.ParametersWithRandom(cipherParameters, secureRandom);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
        this.Camera2StreamConfigurationMap.init(true, cipherParameters);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (!(publicKey instanceof org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPublicKey)) {
            throw new java.security.InvalidKeyException("unknown public key passed to XMSS");
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters xMSSPublicKeyParameters = ((org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPublicKey) publicKey).getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
        this.Camera2StreamConfigurationMap.init(false, xMSSPublicKeyParameters);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature
    public boolean isSigningCapable() {
        return (this.getHighSpeedVideoSizes == null || this.Camera2StreamConfigurationMap.getUsagesRemaining() == 0) ? false : true;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature
    public java.security.PrivateKey getUpdatedPrivateKey() {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = this.getHighSpeedVideoSizes;
        if (aSN1ObjectIdentifier == null) {
            throw new java.lang.IllegalStateException("signature object not in a signing state");
        }
        org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPrivateKey bCXMSSPrivateKey = new org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPrivateKey(aSN1ObjectIdentifier, (org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters) this.Camera2StreamConfigurationMap.getUpdatedPrivateKey());
        this.getHighSpeedVideoSizes = null;
        return bCXMSSPrivateKey;
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        return this.Camera2StreamConfigurationMap.verifySignature(org.bouncycastle.pqc.jcajce.provider.xmss.DigestUtil.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI), bArr);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) throws java.security.SignatureException {
        this.getHighResolutionOutputSizeshNQ4ISI.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws java.security.SignatureException {
        this.getHighResolutionOutputSizeshNQ4ISI.update(b);
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws java.security.SignatureException {
        try {
            return this.Camera2StreamConfigurationMap.generateSignature(org.bouncycastle.pqc.jcajce.provider.xmss.DigestUtil.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI));
        } catch (java.lang.Exception e) {
            if (e instanceof java.lang.IllegalStateException) {
                throw new java.security.SignatureException(e.getMessage(), e);
            }
            throw new java.security.SignatureException(e.toString(), e);
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        this.getHighSpeedVideoFpsRanges = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    public static class generic extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi {
        public generic() {
            super("XMSS", new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.pqc.crypto.xmss.XMSSSigner());
        }
    }

    public static class withSha256 extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi {
        public withSha256() {
            super("XMSS-SHA256", new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.pqc.crypto.xmss.XMSSSigner());
        }
    }

    public static class withSha256andPrehash extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi {
        public withSha256andPrehash() {
            super("SHA256withXMSS-SHA256", new org.bouncycastle.crypto.digests.SHA256Digest(), new org.bouncycastle.pqc.crypto.xmss.XMSSSigner());
        }
    }

    public static class withSha512 extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi {
        public withSha512() {
            super("XMSS-SHA512", new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.pqc.crypto.xmss.XMSSSigner());
        }
    }

    public static class withSha512andPrehash extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi {
        public withSha512andPrehash() {
            super("SHA512withXMSS-SHA512", new org.bouncycastle.crypto.digests.SHA512Digest(), new org.bouncycastle.pqc.crypto.xmss.XMSSSigner());
        }
    }

    public static class withShake128 extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi {
        public withShake128() {
            super("XMSS-SHAKE128", new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.pqc.crypto.xmss.XMSSSigner());
        }
    }

    public static class withShake128andPrehash extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi {
        public withShake128andPrehash() {
            super("SHAKE128withXMSSMT-SHAKE128", new org.bouncycastle.crypto.digests.SHAKEDigest(128), new org.bouncycastle.pqc.crypto.xmss.XMSSSigner());
        }
    }

    public static class withShake256 extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi {
        public withShake256() {
            super("XMSS-SHAKE256", new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.pqc.crypto.xmss.XMSSSigner());
        }
    }

    public static class withShake256andPrehash extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi {
        public withShake256andPrehash() {
            super("SHAKE256withXMSS-SHAKE256", new org.bouncycastle.crypto.digests.SHAKEDigest(256), new org.bouncycastle.pqc.crypto.xmss.XMSSSigner());
        }
    }

    protected XMSSSignatureSpi(java.lang.String str, org.bouncycastle.crypto.Digest digest, org.bouncycastle.pqc.crypto.xmss.XMSSSigner xMSSSigner) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = digest;
        this.Camera2StreamConfigurationMap = xMSSSigner;
    }

    protected XMSSSignatureSpi(java.lang.String str) {
        super(str);
    }
}
