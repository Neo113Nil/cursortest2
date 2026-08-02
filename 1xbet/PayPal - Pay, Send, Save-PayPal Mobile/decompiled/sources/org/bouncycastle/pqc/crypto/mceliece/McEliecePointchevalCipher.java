package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McEliecePointchevalCipher implements org.bouncycastle.pqc.crypto.MessageEncryptor {
    public static final java.lang.String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.2";
    private org.bouncycastle.crypto.Digest Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters getHighSpeedVideoSizes;
    private int getInputFormats;
    private java.security.SecureRandom getOutputFormats;

    protected int decryptOutputSize(int i) {
        return 0;
    }

    protected int encryptOutputSize(int i) {
        return 0;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        if (!z) {
            org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters) cipherParameters;
            this.getHighSpeedVideoSizes = mcElieceCCA2PrivateKeyParameters;
            this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.mceliece.Utils.Camera2StreamConfigurationMap(mcElieceCCA2PrivateKeyParameters.getDigest());
            this.getHighSpeedVideoFpsRangesFor = mcElieceCCA2PrivateKeyParameters.getN();
            this.getHighSpeedVideoFpsRanges = mcElieceCCA2PrivateKeyParameters.getK();
            this.getInputFormats = mcElieceCCA2PrivateKeyParameters.getT();
            return;
        }
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom)) {
            this.getOutputFormats = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters) cipherParameters;
            this.getHighSpeedVideoSizes = mcElieceCCA2PublicKeyParameters;
            Camera2StreamConfigurationMap(mcElieceCCA2PublicKeyParameters);
            return;
        }
        org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
        this.getOutputFormats = parametersWithRandom.getRandom();
        org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters2 = (org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
        this.getHighSpeedVideoSizes = mcElieceCCA2PublicKeyParameters2;
        Camera2StreamConfigurationMap(mcElieceCCA2PublicKeyParameters2);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("cipher initialised for decryption");
        }
        int i = this.getHighSpeedVideoFpsRanges >> 3;
        byte[] bArr2 = new byte[i];
        this.getOutputFormats.nextBytes(bArr2);
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector = new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(this.getHighSpeedVideoFpsRanges, this.getOutputFormats);
        byte[] encoded = gF2Vector.getEncoded();
        byte[] concatenate = org.bouncycastle.pqc.math.linearalgebra.ByteUtils.concatenate(bArr, bArr2);
        this.Camera2StreamConfigurationMap.update(concatenate, 0, concatenate.length);
        byte[] bArr3 = new byte[this.Camera2StreamConfigurationMap.getDigestSize()];
        this.Camera2StreamConfigurationMap.doFinal(bArr3, 0);
        byte[] encoded2 = org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Primitives.getHighSpeedVideoFpsRanges((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters) this.getHighSpeedVideoSizes, gF2Vector, org.bouncycastle.pqc.crypto.mceliece.Conversions.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, bArr3)).getEncoded();
        org.bouncycastle.crypto.prng.DigestRandomGenerator digestRandomGenerator = new org.bouncycastle.crypto.prng.DigestRandomGenerator(new org.bouncycastle.crypto.digests.SHA1Digest());
        digestRandomGenerator.addSeedMaterial(encoded);
        byte[] bArr4 = new byte[bArr.length + i];
        digestRandomGenerator.nextBytes(bArr4);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr4[i2] = (byte) (bArr4[i2] ^ bArr[i2]);
        }
        for (int i3 = 0; i3 < i; i3++) {
            int length = bArr.length + i3;
            bArr4[length] = (byte) (bArr4[length] ^ bArr2[i3]);
        }
        return org.bouncycastle.pqc.math.linearalgebra.ByteUtils.concatenate(encoded2, bArr4);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("cipher initialised for decryption");
        }
        int i = (this.getHighSpeedVideoFpsRangesFor + 7) >> 3;
        int length = bArr.length - i;
        byte[][] split = org.bouncycastle.pqc.math.linearalgebra.ByteUtils.split(bArr, i);
        byte[] bArr2 = split[0];
        byte[] bArr3 = split[1];
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector[] highSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Primitives.getHighSpeedVideoFpsRangesFor((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters) this.getHighSpeedVideoSizes, org.bouncycastle.pqc.math.linearalgebra.GF2Vector.OS2VP(this.getHighSpeedVideoFpsRangesFor, bArr2));
        byte[] encoded = highSpeedVideoFpsRangesFor[0].getEncoded();
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector = highSpeedVideoFpsRangesFor[1];
        org.bouncycastle.crypto.prng.DigestRandomGenerator digestRandomGenerator = new org.bouncycastle.crypto.prng.DigestRandomGenerator(new org.bouncycastle.crypto.digests.SHA1Digest());
        digestRandomGenerator.addSeedMaterial(encoded);
        byte[] bArr4 = new byte[length];
        digestRandomGenerator.nextBytes(bArr4);
        for (int i2 = 0; i2 < length; i2++) {
            bArr4[i2] = (byte) (bArr4[i2] ^ bArr3[i2]);
        }
        this.Camera2StreamConfigurationMap.update(bArr4, 0, length);
        byte[] bArr5 = new byte[this.Camera2StreamConfigurationMap.getDigestSize()];
        this.Camera2StreamConfigurationMap.doFinal(bArr5, 0);
        if (org.bouncycastle.pqc.crypto.mceliece.Conversions.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, bArr5).equals(gF2Vector)) {
            return org.bouncycastle.pqc.math.linearalgebra.ByteUtils.split(bArr4, length - (this.getHighSpeedVideoFpsRanges >> 3))[0];
        }
        throw new org.bouncycastle.crypto.InvalidCipherTextException("Bad Padding: Invalid ciphertext.");
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

    private void Camera2StreamConfigurationMap(org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.mceliece.Utils.Camera2StreamConfigurationMap(mcElieceCCA2PublicKeyParameters.getDigest());
        this.getHighSpeedVideoFpsRangesFor = mcElieceCCA2PublicKeyParameters.getN();
        this.getHighSpeedVideoFpsRanges = mcElieceCCA2PublicKeyParameters.getK();
        this.getInputFormats = mcElieceCCA2PublicKeyParameters.getT();
    }
}
