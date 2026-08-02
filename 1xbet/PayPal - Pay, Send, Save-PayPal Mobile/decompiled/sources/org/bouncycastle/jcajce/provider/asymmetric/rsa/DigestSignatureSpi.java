package org.bouncycastle.jcajce.provider.asymmetric.rsa;

/* loaded from: classes17.dex */
public class DigestSignatureSpi extends java.security.SignatureSpi {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.AsymmetricBlockCipher getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor;

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected java.security.AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (privateKey instanceof java.security.interfaces.RSAPrivateKey) {
            org.bouncycastle.crypto.params.RSAKeyParameters highSpeedVideoSizes = org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighSpeedVideoSizes((java.security.interfaces.RSAPrivateKey) privateKey);
            this.getHighSpeedVideoFpsRangesFor.reset();
            this.getHighSpeedVideoFpsRanges.init(true, highSpeedVideoSizes);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Supplied key (");
            sb.append(privateKey == null ? null : privateKey.getClass().getName());
            sb.append(") is not a RSAPrivateKey instance");
            throw new java.security.InvalidKeyException(sb.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (publicKey instanceof java.security.interfaces.RSAPublicKey) {
            org.bouncycastle.crypto.params.RSAKeyParameters highSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighSpeedVideoFpsRangesFor((java.security.interfaces.RSAPublicKey) publicKey);
            this.getHighSpeedVideoFpsRangesFor.reset();
            this.getHighSpeedVideoFpsRanges.init(false, highSpeedVideoFpsRangesFor);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Supplied key (");
            sb.append(publicKey == null ? null : publicKey.getClass().getName());
            sb.append(") is not a RSAPublicKey instance");
            throw new java.security.InvalidKeyException(sb.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws java.security.SignatureException {
        byte[] bArr = new byte[this.getHighSpeedVideoFpsRangesFor.getDigestSize()];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, 0);
        try {
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.Camera2StreamConfigurationMap;
            if (algorithmIdentifier != null) {
                bArr = new org.bouncycastle.asn1.x509.DigestInfo(algorithmIdentifier, bArr).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
            }
            return this.getHighSpeedVideoFpsRanges.processBlock(bArr, 0, bArr.length);
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.security.SignatureException("key too small for signature type");
        } catch (java.lang.Exception e) {
            throw new java.security.SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        byte[] processBlock;
        byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRangesFor.getDigestSize()];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr2, 0);
        try {
            processBlock = this.getHighSpeedVideoFpsRanges.processBlock(bArr, 0, bArr.length);
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.Camera2StreamConfigurationMap;
            if (algorithmIdentifier != null) {
                bArr2 = new org.bouncycastle.asn1.x509.DigestInfo(algorithmIdentifier, bArr2).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
            }
        } catch (java.lang.Exception unused) {
        }
        if (processBlock.length == bArr2.length) {
            return org.bouncycastle.util.Arrays.constantTimeAreEqual(processBlock, bArr2);
        }
        if (processBlock.length != bArr2.length - 2) {
            org.bouncycastle.util.Arrays.constantTimeAreEqual(bArr2, bArr2);
            return false;
        }
        bArr2[1] = (byte) (bArr2[1] - 2);
        byte b = (byte) (bArr2[3] - 2);
        bArr2[3] = b;
        int i = b + 4;
        int i2 = b + 6;
        int i3 = 0;
        for (int i4 = 0; i4 < bArr2.length - i2; i4++) {
            i3 |= processBlock[i + i4] ^ bArr2[i2 + i4];
        }
        for (int i5 = 0; i5 < i; i5++) {
            i3 |= processBlock[i5] ^ bArr2[i5];
        }
        return i3 == 0;
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
    protected void engineSetParameter(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    public static class MD2 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public MD2() {
            super(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2, new org.bouncycastle.crypto.digests.MD2Digest(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class MD4 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public MD4() {
            super(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4, new org.bouncycastle.crypto.digests.MD4Digest(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class MD5 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public MD5() {
            super(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5, org.bouncycastle.crypto.util.DigestFactory.createMD5(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class RIPEMD128 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public RIPEMD128() {
            super(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128, new org.bouncycastle.crypto.digests.RIPEMD128Digest(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class RIPEMD160 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public RIPEMD160() {
            super(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160, new org.bouncycastle.crypto.digests.RIPEMD160Digest(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class RIPEMD256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public RIPEMD256() {
            super(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256, new org.bouncycastle.crypto.digests.RIPEMD256Digest(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class SHA1 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA1() {
            super(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, org.bouncycastle.crypto.util.DigestFactory.createSHA1(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class SHA224 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA224() {
            super(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224, org.bouncycastle.crypto.util.DigestFactory.createSHA224(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class SHA256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA256() {
            super(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, org.bouncycastle.crypto.util.DigestFactory.createSHA256(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class SHA384 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA384() {
            super(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384, org.bouncycastle.crypto.util.DigestFactory.createSHA384(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class SHA3_224 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA3_224() {
            super(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224, org.bouncycastle.crypto.util.DigestFactory.createSHA3_224(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class SHA3_256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA3_256() {
            super(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256, org.bouncycastle.crypto.util.DigestFactory.createSHA3_256(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class SHA3_384 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA3_384() {
            super(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384, org.bouncycastle.crypto.util.DigestFactory.createSHA3_384(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class SHA3_512 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA3_512() {
            super(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512, org.bouncycastle.crypto.util.DigestFactory.createSHA3_512(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class SHA512 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA512() {
            super(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, org.bouncycastle.crypto.util.DigestFactory.createSHA512(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class SHA512_224 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA512_224() {
            super(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224, org.bouncycastle.crypto.util.DigestFactory.createSHA512_224(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class SHA512_256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public SHA512_256() {
            super(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256, org.bouncycastle.crypto.util.DigestFactory.createSHA512_256(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class noneRSA extends org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi {
        public noneRSA() {
            super(new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    protected DigestSignatureSpi(org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher) {
        this.getHighSpeedVideoFpsRangesFor = digest;
        this.getHighSpeedVideoFpsRanges = asymmetricBlockCipher;
        this.Camera2StreamConfigurationMap = null;
    }

    protected DigestSignatureSpi(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher) {
        this.getHighSpeedVideoFpsRangesFor = digest;
        this.getHighSpeedVideoFpsRanges = asymmetricBlockCipher;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, org.bouncycastle.asn1.DERNull.INSTANCE);
    }
}
