package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McElieceFujisakiCipher implements org.bouncycastle.pqc.crypto.MessageEncryptor {
    public static final java.lang.String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.1";
    private boolean Camera2StreamConfigurationMap;
    org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getOutputFormats;
    private java.security.SecureRandom getOutputMinFrameDuration;

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.Camera2StreamConfigurationMap = z;
        if (!z) {
            org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters) cipherParameters;
            this.getHighResolutionOutputSizeshNQ4ISI = mcElieceCCA2PrivateKeyParameters;
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.crypto.mceliece.Utils.Camera2StreamConfigurationMap(mcElieceCCA2PrivateKeyParameters.getDigest());
            this.getHighSpeedVideoFpsRangesFor = mcElieceCCA2PrivateKeyParameters.getN();
            this.getOutputFormats = mcElieceCCA2PrivateKeyParameters.getT();
            return;
        }
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom)) {
            this.getOutputMinFrameDuration = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters) cipherParameters;
            this.getHighResolutionOutputSizeshNQ4ISI = mcElieceCCA2PublicKeyParameters;
            getHighSpeedVideoFpsRanges(mcElieceCCA2PublicKeyParameters);
            return;
        }
        org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
        this.getOutputMinFrameDuration = parametersWithRandom.getRandom();
        org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters2 = (org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
        this.getHighResolutionOutputSizeshNQ4ISI = mcElieceCCA2PublicKeyParameters2;
        getHighSpeedVideoFpsRanges(mcElieceCCA2PublicKeyParameters2);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (!this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException("cipher initialised for decryption");
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector = new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration);
        byte[] encoded = gF2Vector.getEncoded();
        byte[] concatenate = org.bouncycastle.pqc.math.linearalgebra.ByteUtils.concatenate(encoded, bArr);
        this.getHighSpeedVideoFpsRanges.update(concatenate, 0, concatenate.length);
        byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRanges.getDigestSize()];
        this.getHighSpeedVideoFpsRanges.doFinal(bArr2, 0);
        byte[] encoded2 = org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Primitives.getHighSpeedVideoFpsRanges((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters) this.getHighResolutionOutputSizeshNQ4ISI, gF2Vector, org.bouncycastle.pqc.crypto.mceliece.Conversions.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, bArr2)).getEncoded();
        org.bouncycastle.crypto.prng.DigestRandomGenerator digestRandomGenerator = new org.bouncycastle.crypto.prng.DigestRandomGenerator(new org.bouncycastle.crypto.digests.SHA1Digest());
        digestRandomGenerator.addSeedMaterial(encoded);
        byte[] bArr3 = new byte[bArr.length];
        digestRandomGenerator.nextBytes(bArr3);
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr3[i] ^ bArr[i]);
        }
        return org.bouncycastle.pqc.math.linearalgebra.ByteUtils.concatenate(encoded2, bArr3);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException {
        if (this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException("cipher initialised for decryption");
        }
        int i = (this.getHighSpeedVideoFpsRangesFor + 7) >> 3;
        int length = bArr.length - i;
        byte[][] split = org.bouncycastle.pqc.math.linearalgebra.ByteUtils.split(bArr, i);
        byte[] bArr2 = split[0];
        byte[] bArr3 = split[1];
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector[] highSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Primitives.getHighSpeedVideoFpsRangesFor((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters) this.getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.pqc.math.linearalgebra.GF2Vector.OS2VP(this.getHighSpeedVideoFpsRangesFor, bArr2));
        byte[] encoded = highSpeedVideoFpsRangesFor[0].getEncoded();
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector = highSpeedVideoFpsRangesFor[1];
        org.bouncycastle.crypto.prng.DigestRandomGenerator digestRandomGenerator = new org.bouncycastle.crypto.prng.DigestRandomGenerator(new org.bouncycastle.crypto.digests.SHA1Digest());
        digestRandomGenerator.addSeedMaterial(encoded);
        byte[] bArr4 = new byte[length];
        digestRandomGenerator.nextBytes(bArr4);
        for (int i2 = 0; i2 < length; i2++) {
            bArr4[i2] = (byte) (bArr4[i2] ^ bArr3[i2]);
        }
        byte[] concatenate = org.bouncycastle.pqc.math.linearalgebra.ByteUtils.concatenate(encoded, bArr4);
        byte[] bArr5 = new byte[this.getHighSpeedVideoFpsRanges.getDigestSize()];
        this.getHighSpeedVideoFpsRanges.update(concatenate, 0, concatenate.length);
        this.getHighSpeedVideoFpsRanges.doFinal(bArr5, 0);
        if (org.bouncycastle.pqc.crypto.mceliece.Conversions.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, bArr5).equals(gF2Vector)) {
            return bArr4;
        }
        throw new org.bouncycastle.crypto.InvalidCipherTextException("Bad Padding: invalid ciphertext");
    }

    public int getKeySize(org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) throws java.lang.IllegalArgumentException {
        if (mcElieceCCA2KeyParameters instanceof org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters) {
            return ((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        if (mcElieceCCA2KeyParameters instanceof org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters) {
            return ((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        throw new java.lang.IllegalArgumentException("unsupported type");
    }

    private void getHighSpeedVideoFpsRanges(org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.crypto.mceliece.Utils.Camera2StreamConfigurationMap(mcElieceCCA2PublicKeyParameters.getDigest());
        this.getHighSpeedVideoFpsRangesFor = mcElieceCCA2PublicKeyParameters.getN();
        this.getHighSpeedVideoSizes = mcElieceCCA2PublicKeyParameters.getK();
        this.getOutputFormats = mcElieceCCA2PublicKeyParameters.getT();
    }
}
