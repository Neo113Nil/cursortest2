package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class RSADigestSigner implements org.bouncycastle.crypto.Signer {
    private static final java.util.Hashtable getHighSpeedVideoSizes;
    private boolean Camera2StreamConfigurationMap;
    private final org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.AsymmetricBlockCipher getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] processBlock;
        byte[] highSpeedVideoFpsRanges;
        if (this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException("RSADigestSigner not initialised for verification");
        }
        int digestSize = this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr2, 0);
        try {
            processBlock = this.getHighSpeedVideoFpsRanges.processBlock(bArr, 0, bArr.length);
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr2);
        } catch (java.lang.Exception unused) {
        }
        if (processBlock.length == highSpeedVideoFpsRanges.length) {
            return org.bouncycastle.util.Arrays.constantTimeAreEqual(processBlock, highSpeedVideoFpsRanges);
        }
        if (processBlock.length != highSpeedVideoFpsRanges.length - 2) {
            org.bouncycastle.util.Arrays.constantTimeAreEqual(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges);
            return false;
        }
        int length = (processBlock.length - digestSize) - 2;
        int length2 = highSpeedVideoFpsRanges.length;
        highSpeedVideoFpsRanges[1] = (byte) (highSpeedVideoFpsRanges[1] - 2);
        highSpeedVideoFpsRanges[3] = (byte) (highSpeedVideoFpsRanges[3] - 2);
        int i = 0;
        for (int i2 = 0; i2 < digestSize; i2++) {
            i |= processBlock[length + i2] ^ highSpeedVideoFpsRanges[((length2 - digestSize) - 2) + i2];
        }
        for (int i3 = 0; i3 < length; i3++) {
            i |= processBlock[i3] ^ highSpeedVideoFpsRanges[i3];
        }
        return i == 0;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.getHighResolutionOutputSizeshNQ4ISI.update(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.Camera2StreamConfigurationMap = z;
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom ? (org.bouncycastle.crypto.params.AsymmetricKeyParameter) ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters() : (org.bouncycastle.crypto.params.AsymmetricKeyParameter) cipherParameters;
        if (z && !asymmetricKeyParameter.isPrivate()) {
            throw new java.lang.IllegalArgumentException("signing requires private key");
        }
        if (!z && asymmetricKeyParameter.isPrivate()) {
            throw new java.lang.IllegalArgumentException("verification requires public key");
        }
        reset();
        this.getHighSpeedVideoFpsRanges.init(z, cipherParameters);
    }

    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getAlgorithmName());
        sb.append("withRSA");
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws org.bouncycastle.crypto.CryptoException, org.bouncycastle.crypto.DataLengthException {
        if (!this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException("RSADigestSigner not initialised for signature generation.");
        }
        byte[] bArr = new byte[this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize()];
        this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr, 0);
        try {
            byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr);
            return this.getHighSpeedVideoFpsRanges.processBlock(highSpeedVideoFpsRanges, 0, highSpeedVideoFpsRanges.length);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode signature: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.crypto.CryptoException(sb.toString(), e);
        }
    }

    private byte[] getHighSpeedVideoFpsRanges(byte[] bArr) throws java.io.IOException {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoFpsRangesFor;
        if (algorithmIdentifier != null) {
            return new org.bouncycastle.asn1.x509.DigestInfo(algorithmIdentifier, bArr).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        }
        try {
            org.bouncycastle.asn1.x509.DigestInfo.getInstance(bArr);
            return bArr;
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed DigestInfo for NONEwithRSA hash: ");
            sb.append(e.getMessage());
            throw new java.io.IOException(sb.toString());
        }
    }

    public RSADigestSigner(org.bouncycastle.crypto.Digest digest, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine());
        this.getHighResolutionOutputSizeshNQ4ISI = digest;
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier != null ? new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, org.bouncycastle.asn1.DERNull.INSTANCE) : null;
    }

    public RSADigestSigner(org.bouncycastle.crypto.Digest digest) {
        this(digest, (org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoSizes.get(digest.getAlgorithmName()));
    }

    static {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getHighSpeedVideoSizes = hashtable;
        hashtable.put("RIPEMD128", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128);
        hashtable.put("RIPEMD160", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160);
        hashtable.put("RIPEMD256", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256);
        hashtable.put("SHA-1", org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_SHA1);
        hashtable.put("SHA-224", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224);
        hashtable.put("SHA-256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        hashtable.put("SHA-384", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        hashtable.put("SHA-512", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        hashtable.put(org.apache.commons.codec.digest.MessageDigestAlgorithms.SHA_512_224, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224);
        hashtable.put("SHA-512/256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256);
        hashtable.put("SHA3-224", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224);
        hashtable.put("SHA3-256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256);
        hashtable.put("SHA3-384", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384);
        hashtable.put("SHA3-512", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512);
        hashtable.put("MD2", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2);
        hashtable.put("MD4", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4);
        hashtable.put("MD5", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5);
    }
}
