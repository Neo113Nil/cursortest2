package org.bouncycastle.pqc.jcajce.provider.xmss;

/* loaded from: classes17.dex */
public class XMSSMTSignatureSpi extends java.security.Signature implements org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature {
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner getHighSpeedVideoSizes;

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (!(privateKey instanceof org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPrivateKey)) {
            throw new java.security.InvalidKeyException("unknown private key passed to XMSSMT");
        }
        org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPrivateKey bCXMSSMTPrivateKey = (org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPrivateKey) privateKey;
        org.bouncycastle.crypto.CipherParameters cipherParameters = bCXMSSMTPrivateKey.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = bCXMSSMTPrivateKey.getHighSpeedVideoFpsRangesFor;
        java.security.SecureRandom secureRandom = this.getHighResolutionOutputSizeshNQ4ISI;
        if (secureRandom != null) {
            cipherParameters = new org.bouncycastle.crypto.params.ParametersWithRandom(cipherParameters, secureRandom);
        }
        this.getHighSpeedVideoFpsRanges.reset();
        this.getHighSpeedVideoSizes.init(true, cipherParameters);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (!(publicKey instanceof org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPublicKey)) {
            throw new java.security.InvalidKeyException("unknown public key passed to XMSSMT");
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = ((org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPublicKey) publicKey).getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges.reset();
        this.getHighSpeedVideoSizes.init(false, xMSSMTPublicKeyParameters);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature
    public boolean isSigningCapable() {
        return (this.getHighSpeedVideoFpsRangesFor == null || this.getHighSpeedVideoSizes.getUsagesRemaining() == 0) ? false : true;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature
    public java.security.PrivateKey getUpdatedPrivateKey() {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1ObjectIdentifier == null) {
            throw new java.lang.IllegalStateException("signature object not in a signing state");
        }
        org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPrivateKey bCXMSSMTPrivateKey = new org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPrivateKey(aSN1ObjectIdentifier, (org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters) this.getHighSpeedVideoSizes.getUpdatedPrivateKey());
        this.getHighSpeedVideoFpsRangesFor = null;
        return bCXMSSMTPrivateKey;
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        return this.getHighSpeedVideoSizes.verifySignature(org.bouncycastle.pqc.jcajce.provider.xmss.DigestUtil.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges), bArr);
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
            return this.getHighSpeedVideoSizes.generateSignature(org.bouncycastle.pqc.jcajce.provider.xmss.DigestUtil.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges));
        } catch (java.lang.Exception e) {
            if (e instanceof java.lang.IllegalStateException) {
                throw new java.security.SignatureException(e.getMessage(), e);
            }
            throw new java.security.SignatureException(e.toString());
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
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    public static class generic extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi {
        public generic() {
            super("XMSSMT", new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner());
        }
    }

    public static class withSha256 extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi {
        public withSha256() {
            super("XMSSMT-SHA256", new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner());
        }
    }

    public static class withSha256andPrehash extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi {
        public withSha256andPrehash() {
            super("SHA256withXMSSMT-SHA256", new org.bouncycastle.crypto.digests.SHA256Digest(), new org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner());
        }
    }

    public static class withSha512 extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi {
        public withSha512() {
            super("XMSSMT-SHA512", new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner());
        }
    }

    public static class withSha512andPrehash extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi {
        public withSha512andPrehash() {
            super("SHA512withXMSSMT-SHA512", new org.bouncycastle.crypto.digests.SHA512Digest(), new org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner());
        }
    }

    public static class withShake128 extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi {
        public withShake128() {
            super("XMSSMT-SHAKE128", new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner());
        }
    }

    public static class withShake128andPrehash extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi {
        public withShake128andPrehash() {
            super("SHAKE128withXMSSMT-SHAKE128", new org.bouncycastle.crypto.digests.SHAKEDigest(128), new org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner());
        }
    }

    public static class withShake256 extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi {
        public withShake256() {
            super("XMSSMT-SHAKE256", new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner());
        }
    }

    public static class withShake256andPrehash extends org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi {
        public withShake256andPrehash() {
            super("SHAKE256withXMSSMT-SHAKE256", new org.bouncycastle.crypto.digests.SHAKEDigest(256), new org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner());
        }
    }

    protected XMSSMTSignatureSpi(java.lang.String str, org.bouncycastle.crypto.Digest digest, org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner xMSSMTSigner) {
        super(str);
        this.getHighSpeedVideoFpsRanges = digest;
        this.getHighSpeedVideoSizes = xMSSMTSigner;
    }

    protected XMSSMTSignatureSpi(java.lang.String str) {
        super(str);
    }
}
