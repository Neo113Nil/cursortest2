package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

/* loaded from: classes17.dex */
public class ECGOST2012SignatureSpi256 extends java.security.SignatureSpi implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, org.bouncycastle.asn1.x509.X509ObjectIdentifiers {
    private int getHighSpeedVideoFpsRanges = 64;
    private int getHighSpeedVideoFpsRangesFor = 32;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoSizes = new org.bouncycastle.crypto.digests.GOST3411_2012_256Digest();
    private org.bouncycastle.crypto.DSAExt getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.signers.ECGOST3410_2012Signer();

    @Override // java.security.SignatureSpi
    protected java.security.AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        org.bouncycastle.crypto.params.ECKeyParameters eCKeyParameters;
        if (publicKey instanceof org.bouncycastle.jce.interfaces.ECPublicKey) {
            eCKeyParameters = (org.bouncycastle.crypto.params.ECKeyParameters) (publicKey instanceof org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey ? ((org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey) publicKey).getHighSpeedVideoSizes : org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePublicKeyParameter(publicKey));
        } else {
            try {
                eCKeyParameters = (org.bouncycastle.crypto.params.ECKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePublicKeyParameter(org.bouncycastle.jce.provider.BouncyCastleProvider.getPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())));
            } catch (java.lang.Exception unused) {
                throw new java.security.InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
            }
        }
        if (eCKeyParameters.getParameters().getN().bitLength() > 256) {
            throw new java.security.InvalidKeyException("key out of range for ECGOST-2012-256");
        }
        this.getHighSpeedVideoSizes.reset();
        this.getHighResolutionOutputSizeshNQ4ISI.init(false, eCKeyParameters);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        byte[] bArr2 = new byte[this.getHighSpeedVideoSizes.getDigestSize()];
        this.getHighSpeedVideoSizes.doFinal(bArr2, 0);
        try {
            int i = this.getHighSpeedVideoFpsRangesFor;
            byte[] bArr3 = new byte[i];
            byte[] bArr4 = new byte[i];
            java.lang.System.arraycopy(bArr, 0, bArr4, 0, i);
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.System.arraycopy(bArr, i2, bArr3, 0, i2);
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr4);
            return this.getHighResolutionOutputSizeshNQ4ISI.verifySignature(bArr2, new java.math.BigInteger[]{new java.math.BigInteger(1, bArr3), bigInteger}[0], bigInteger);
        } catch (java.lang.Exception unused) {
            throw new java.security.SignatureException("error decoding signature bytes.");
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) throws java.security.SignatureException {
        this.getHighSpeedVideoSizes.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws java.security.SignatureException {
        this.getHighSpeedVideoSizes.update(b);
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws java.security.SignatureException {
        byte[] bArr = new byte[this.getHighSpeedVideoSizes.getDigestSize()];
        this.getHighSpeedVideoSizes.doFinal(bArr, 0);
        try {
            byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRanges];
            java.math.BigInteger[] generateSignature = this.getHighResolutionOutputSizeshNQ4ISI.generateSignature(bArr);
            byte[] byteArray = generateSignature[0].toByteArray();
            byte[] byteArray2 = generateSignature[1].toByteArray();
            if (byteArray2[0] != 0) {
                java.lang.System.arraycopy(byteArray2, 0, bArr2, this.getHighSpeedVideoFpsRangesFor - byteArray2.length, byteArray2.length);
            } else {
                java.lang.System.arraycopy(byteArray2, 1, bArr2, this.getHighSpeedVideoFpsRangesFor - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                java.lang.System.arraycopy(byteArray, 0, bArr2, this.getHighSpeedVideoFpsRanges - byteArray.length, byteArray.length);
                return bArr2;
            }
            java.lang.System.arraycopy(byteArray, 1, bArr2, this.getHighSpeedVideoFpsRanges - (byteArray.length - 1), byteArray.length - 1);
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
        if (!(privateKey instanceof org.bouncycastle.jce.interfaces.ECKey)) {
            throw new java.security.InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
        }
        org.bouncycastle.crypto.params.ECKeyParameters eCKeyParameters = (org.bouncycastle.crypto.params.ECKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(privateKey);
        if (eCKeyParameters.getParameters().getN().bitLength() > 256) {
            throw new java.security.InvalidKeyException("key out of range for ECGOST-2012-256");
        }
        this.getHighSpeedVideoSizes.reset();
        if (this.appRandom != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.init(true, new org.bouncycastle.crypto.params.ParametersWithRandom(eCKeyParameters, this.appRandom));
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.init(true, eCKeyParameters);
        }
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }
}
