package org.bouncycastle.jcajce.provider.asymmetric.dstu;

/* loaded from: classes17.dex */
public class SignatureSpi extends java.security.SignatureSpi implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, org.bouncycastle.asn1.x509.X509ObjectIdentifiers {
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.DSAExt getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.signers.DSTU4145Signer();

    @Override // java.security.SignatureSpi
    protected java.security.AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        org.bouncycastle.crypto.CipherParameters generatePublicKeyParameter;
        if (publicKey instanceof org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey) {
            org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey bCDSTU4145PublicKey = (org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey) publicKey;
            generatePublicKeyParameter = bCDSTU4145PublicKey.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.digests.GOST3411Digest(getHighSpeedVideoFpsRangesFor(bCDSTU4145PublicKey.getSbox()));
        } else {
            generatePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePublicKeyParameter(publicKey);
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.digests.GOST3411Digest(getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ua.DSTU4145Params.getDefaultDKE()));
        }
        this.getHighSpeedVideoFpsRangesFor.init(false, generatePublicKeyParameter);
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr2[i2] = (byte) ((bArr[i] >> 4) & 15);
            bArr2[i2 + 1] = (byte) (bArr[i] & com.google.common.base.Ascii.SI);
        }
        return bArr2;
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRanges.getDigestSize()];
        this.getHighSpeedVideoFpsRanges.doFinal(bArr2, 0);
        try {
            byte[] octets = ((org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.asn1.ASN1OctetString.fromByteArray(bArr)).getOctets();
            byte[] bArr3 = new byte[octets.length / 2];
            byte[] bArr4 = new byte[octets.length / 2];
            java.lang.System.arraycopy(octets, 0, bArr4, 0, octets.length / 2);
            java.lang.System.arraycopy(octets, octets.length / 2, bArr3, 0, octets.length / 2);
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr4);
            return this.getHighSpeedVideoFpsRangesFor.verifySignature(bArr2, new java.math.BigInteger[]{new java.math.BigInteger(1, bArr3), bigInteger}[0], bigInteger);
        } catch (java.lang.Exception unused) {
            throw new java.security.SignatureException("error decoding signature bytes.");
        }
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
        byte[] bArr = new byte[this.getHighSpeedVideoFpsRanges.getDigestSize()];
        this.getHighSpeedVideoFpsRanges.doFinal(bArr, 0);
        try {
            java.math.BigInteger[] generateSignature = this.getHighSpeedVideoFpsRangesFor.generateSignature(bArr);
            byte[] byteArray = generateSignature[0].toByteArray();
            byte[] byteArray2 = generateSignature[1].toByteArray();
            int length = (byteArray.length > byteArray2.length ? byteArray.length : byteArray2.length) * 2;
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(byteArray2, 0, bArr2, (length / 2) - byteArray2.length, byteArray2.length);
            java.lang.System.arraycopy(byteArray, 0, bArr2, length - byteArray.length, byteArray.length);
            return new org.bouncycastle.asn1.DEROctetString(bArr2).getEncoded();
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    @Override // java.security.SignatureSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter;
        org.bouncycastle.crypto.digests.GOST3411Digest gOST3411Digest;
        if (privateKey instanceof org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey) {
            asymmetricKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(privateKey);
            gOST3411Digest = new org.bouncycastle.crypto.digests.GOST3411Digest(getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ua.DSTU4145Params.getDefaultDKE()));
        } else {
            if (!(privateKey instanceof org.bouncycastle.jce.interfaces.ECKey)) {
                asymmetricKeyParameter = null;
                if (this.appRandom == null) {
                    this.getHighSpeedVideoFpsRangesFor.init(true, new org.bouncycastle.crypto.params.ParametersWithRandom(asymmetricKeyParameter, this.appRandom));
                    return;
                } else {
                    this.getHighSpeedVideoFpsRangesFor.init(true, asymmetricKeyParameter);
                    return;
                }
            }
            asymmetricKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(privateKey);
            gOST3411Digest = new org.bouncycastle.crypto.digests.GOST3411Digest(getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ua.DSTU4145Params.getDefaultDKE()));
        }
        this.getHighSpeedVideoFpsRanges = gOST3411Digest;
        if (this.appRandom == null) {
        }
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }
}
