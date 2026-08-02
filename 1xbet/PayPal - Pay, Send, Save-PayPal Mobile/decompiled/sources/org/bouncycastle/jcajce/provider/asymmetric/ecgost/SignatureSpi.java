package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

/* loaded from: classes17.dex */
public class SignatureSpi extends java.security.SignatureSpi implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, org.bouncycastle.asn1.x509.X509ObjectIdentifiers {
    private org.bouncycastle.crypto.Digest Camera2StreamConfigurationMap = new org.bouncycastle.crypto.digests.GOST3411Digest();
    private org.bouncycastle.crypto.DSAExt getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.signers.ECGOST3410Signer();

    @Override // java.security.SignatureSpi
    protected java.security.AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        org.bouncycastle.crypto.CipherParameters generatePublicKeyParameter;
        if (publicKey instanceof org.bouncycastle.jce.interfaces.ECPublicKey) {
            generatePublicKeyParameter = publicKey instanceof org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey ? ((org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey) publicKey).getHighResolutionOutputSizeshNQ4ISI : org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePublicKeyParameter(publicKey);
        } else if (publicKey instanceof org.bouncycastle.jce.interfaces.GOST3410Key) {
            generatePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util.generatePublicKeyParameter(publicKey);
        } else {
            try {
                generatePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePublicKeyParameter(org.bouncycastle.jce.provider.BouncyCastleProvider.getPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())));
            } catch (java.lang.Exception unused) {
                throw new java.security.InvalidKeyException("can't recognise key type in DSA based signer");
            }
        }
        this.Camera2StreamConfigurationMap.reset();
        this.getHighSpeedVideoFpsRangesFor.init(false, generatePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        byte[] bArr2 = new byte[this.Camera2StreamConfigurationMap.getDigestSize()];
        this.Camera2StreamConfigurationMap.doFinal(bArr2, 0);
        try {
            byte[] bArr3 = new byte[32];
            byte[] bArr4 = new byte[32];
            java.lang.System.arraycopy(bArr, 0, bArr4, 0, 32);
            java.lang.System.arraycopy(bArr, 32, bArr3, 0, 32);
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr4);
            return this.getHighSpeedVideoFpsRangesFor.verifySignature(bArr2, new java.math.BigInteger[]{new java.math.BigInteger(1, bArr3), bigInteger}[0], bigInteger);
        } catch (java.lang.Exception unused) {
            throw new java.security.SignatureException("error decoding signature bytes.");
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) throws java.security.SignatureException {
        this.Camera2StreamConfigurationMap.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws java.security.SignatureException {
        this.Camera2StreamConfigurationMap.update(b);
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws java.security.SignatureException {
        byte[] bArr = new byte[this.Camera2StreamConfigurationMap.getDigestSize()];
        this.Camera2StreamConfigurationMap.doFinal(bArr, 0);
        try {
            byte[] bArr2 = new byte[64];
            java.math.BigInteger[] generateSignature = this.getHighSpeedVideoFpsRangesFor.generateSignature(bArr);
            byte[] byteArray = generateSignature[0].toByteArray();
            byte[] byteArray2 = generateSignature[1].toByteArray();
            if (byteArray2[0] != 0) {
                java.lang.System.arraycopy(byteArray2, 0, bArr2, 32 - byteArray2.length, byteArray2.length);
            } else {
                java.lang.System.arraycopy(byteArray2, 1, bArr2, 32 - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                java.lang.System.arraycopy(byteArray, 0, bArr2, 64 - byteArray.length, byteArray.length);
                return bArr2;
            }
            java.lang.System.arraycopy(byteArray, 1, bArr2, 64 - (byteArray.length - 1), byteArray.length - 1);
            return bArr2;
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
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePrivateKeyParameter = privateKey instanceof org.bouncycastle.jce.interfaces.ECKey ? org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(privateKey) : org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util.generatePrivateKeyParameter(privateKey);
        this.Camera2StreamConfigurationMap.reset();
        if (this.appRandom != null) {
            this.getHighSpeedVideoFpsRangesFor.init(true, new org.bouncycastle.crypto.params.ParametersWithRandom(generatePrivateKeyParameter, this.appRandom));
        } else {
            this.getHighSpeedVideoFpsRangesFor.init(true, generatePrivateKeyParameter);
        }
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }
}
