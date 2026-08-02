package org.bouncycastle.pqc.jcajce.provider.sphincs;

/* loaded from: classes17.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.sphincs.SPHINCS256Signer getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (!(privateKey instanceof org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PrivateKey)) {
            throw new java.security.InvalidKeyException("unknown private key passed to SPHINCS-256");
        }
        org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PrivateKey bCSphincs256PrivateKey = (org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PrivateKey) privateKey;
        if (!this.getHighSpeedVideoSizes.equals((org.bouncycastle.asn1.ASN1Primitive) bCSphincs256PrivateKey.getHighSpeedVideoSizes)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SPHINCS-256 signature for tree digest: ");
            sb.append(bCSphincs256PrivateKey.getHighSpeedVideoSizes);
            throw new java.security.InvalidKeyException(sb.toString());
        }
        org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters sPHINCSPrivateKeyParameters = bCSphincs256PrivateKey.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor.reset();
        this.getHighSpeedVideoFpsRanges.init(true, sPHINCSPrivateKeyParameters);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (!(publicKey instanceof org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PublicKey)) {
            throw new java.security.InvalidKeyException("unknown public key passed to SPHINCS-256");
        }
        org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PublicKey bCSphincs256PublicKey = (org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PublicKey) publicKey;
        if (!this.getHighSpeedVideoSizes.equals((org.bouncycastle.asn1.ASN1Primitive) bCSphincs256PublicKey.getHighSpeedVideoSizes)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SPHINCS-256 signature for tree digest: ");
            sb.append(bCSphincs256PublicKey.getHighSpeedVideoSizes);
            throw new java.security.InvalidKeyException(sb.toString());
        }
        org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters sPHINCSPublicKeyParameters = bCSphincs256PublicKey.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor.reset();
        this.getHighSpeedVideoFpsRanges.init(false, sPHINCSPublicKeyParameters);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRangesFor.getDigestSize()];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr2, 0);
        return this.getHighSpeedVideoFpsRanges.verifySignature(bArr2, bArr);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) throws java.security.SignatureException {
        this.getHighSpeedVideoFpsRangesFor.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws java.security.SignatureException {
        this.getHighSpeedVideoFpsRangesFor.update(b);
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws java.security.SignatureException {
        byte[] bArr = new byte[this.getHighSpeedVideoFpsRangesFor.getDigestSize()];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, 0);
        try {
            return this.getHighSpeedVideoFpsRanges.generateSignature(bArr);
        } catch (java.lang.Exception e) {
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

    public static class withSha3_512 extends org.bouncycastle.pqc.jcajce.provider.sphincs.SignatureSpi {
        public withSha3_512() {
            super(new org.bouncycastle.crypto.digests.SHA3Digest(512), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256, new org.bouncycastle.pqc.crypto.sphincs.SPHINCS256Signer(new org.bouncycastle.crypto.digests.SHA3Digest(256), new org.bouncycastle.crypto.digests.SHA3Digest(512)));
        }
    }

    public static class withSha512 extends org.bouncycastle.pqc.jcajce.provider.sphincs.SignatureSpi {
        public withSha512() {
            super(new org.bouncycastle.crypto.digests.SHA512Digest(), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256, new org.bouncycastle.pqc.crypto.sphincs.SPHINCS256Signer(new org.bouncycastle.crypto.digests.SHA512tDigest(256), new org.bouncycastle.crypto.digests.SHA512Digest()));
        }
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected SignatureSpi(org.bouncycastle.crypto.Digest digest, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.pqc.crypto.sphincs.SPHINCS256Signer sPHINCS256Signer) {
        this.getHighSpeedVideoFpsRangesFor = digest;
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = sPHINCS256Signer;
    }
}
