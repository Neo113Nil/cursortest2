package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McElieceKobaraImaiCipher implements org.bouncycastle.pqc.crypto.MessageEncryptor {
    public static final java.lang.String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.3";
    public static final byte[] PUBLIC_CONSTANT = "a predetermined public constant".getBytes();
    private int Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private java.security.SecureRandom getOutputFormats;

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoFpsRanges = z;
        if (!z) {
            org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters) cipherParameters;
            this.getHighSpeedVideoSizes = mcElieceCCA2PrivateKeyParameters;
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.mceliece.Utils.Camera2StreamConfigurationMap(mcElieceCCA2PrivateKeyParameters.getDigest());
            this.getHighSpeedVideoFpsRangesFor = mcElieceCCA2PrivateKeyParameters.getN();
            this.Camera2StreamConfigurationMap = mcElieceCCA2PrivateKeyParameters.getK();
            this.getHighSpeedVideoSizesFor = mcElieceCCA2PrivateKeyParameters.getT();
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
        if (!this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalStateException("cipher initialised for decryption");
        }
        int digestSize = this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize();
        int i = this.Camera2StreamConfigurationMap >> 3;
        int bitLength = (org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.binomial(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor).bitLength() - 1) >> 3;
        byte[] bArr2 = PUBLIC_CONSTANT;
        int length = ((i + bitLength) - digestSize) - bArr2.length;
        if (bArr.length > length) {
            length = bArr.length;
        }
        int length2 = bArr2.length + length;
        int i2 = ((length2 + digestSize) - i) - bitLength;
        byte[] bArr3 = new byte[length2];
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        java.lang.System.arraycopy(bArr2, 0, bArr3, length, bArr2.length);
        byte[] bArr4 = new byte[digestSize];
        this.getOutputFormats.nextBytes(bArr4);
        org.bouncycastle.crypto.prng.DigestRandomGenerator digestRandomGenerator = new org.bouncycastle.crypto.prng.DigestRandomGenerator(new org.bouncycastle.crypto.digests.SHA1Digest());
        digestRandomGenerator.addSeedMaterial(bArr4);
        byte[] bArr5 = new byte[length2];
        digestRandomGenerator.nextBytes(bArr5);
        for (int i3 = length2 - 1; i3 >= 0; i3--) {
            bArr5[i3] = (byte) (bArr5[i3] ^ bArr3[i3]);
        }
        byte[] bArr6 = new byte[this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize()];
        this.getHighResolutionOutputSizeshNQ4ISI.update(bArr5, 0, length2);
        this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr6, 0);
        for (int i4 = digestSize - 1; i4 >= 0; i4--) {
            bArr6[i4] = (byte) (bArr6[i4] ^ bArr4[i4]);
        }
        byte[] concatenate = org.bouncycastle.pqc.math.linearalgebra.ByteUtils.concatenate(bArr6, bArr5);
        byte[] bArr7 = new byte[0];
        if (i2 > 0) {
            bArr7 = new byte[i2];
            java.lang.System.arraycopy(concatenate, 0, bArr7, 0, i2);
        }
        byte[] bArr8 = new byte[bitLength];
        java.lang.System.arraycopy(concatenate, i2, bArr8, 0, bitLength);
        byte[] bArr9 = new byte[i];
        java.lang.System.arraycopy(concatenate, bitLength + i2, bArr9, 0, i);
        byte[] encoded = org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Primitives.getHighSpeedVideoFpsRanges((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters) this.getHighSpeedVideoSizes, org.bouncycastle.pqc.math.linearalgebra.GF2Vector.OS2VP(this.Camera2StreamConfigurationMap, bArr9), org.bouncycastle.pqc.crypto.mceliece.Conversions.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, bArr8)).getEncoded();
        return i2 > 0 ? org.bouncycastle.pqc.math.linearalgebra.ByteUtils.concatenate(bArr7, encoded) : encoded;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws org.bouncycastle.crypto.InvalidCipherTextException {
        byte[] bArr2;
        if (this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalStateException("cipher initialised for decryption");
        }
        int i = this.getHighSpeedVideoFpsRangesFor >> 3;
        if (bArr.length < i) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("Bad Padding: Ciphertext too short.");
        }
        int digestSize = this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize();
        int i2 = this.Camera2StreamConfigurationMap >> 3;
        int bitLength = (org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.binomial(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor).bitLength() - 1) >> 3;
        int length = bArr.length - i;
        if (length > 0) {
            byte[][] split = org.bouncycastle.pqc.math.linearalgebra.ByteUtils.split(bArr, length);
            bArr2 = split[0];
            bArr = split[1];
        } else {
            bArr2 = new byte[0];
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector[] highSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Primitives.getHighSpeedVideoFpsRangesFor((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters) this.getHighSpeedVideoSizes, org.bouncycastle.pqc.math.linearalgebra.GF2Vector.OS2VP(this.getHighSpeedVideoFpsRangesFor, bArr));
        byte[] encoded = highSpeedVideoFpsRangesFor[0].getEncoded();
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector = highSpeedVideoFpsRangesFor[1];
        if (encoded.length > i2) {
            encoded = org.bouncycastle.pqc.math.linearalgebra.ByteUtils.subArray(encoded, 0, i2);
        }
        byte[] Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.mceliece.Conversions.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, gF2Vector);
        if (Camera2StreamConfigurationMap.length < bitLength) {
            byte[] bArr3 = new byte[bitLength];
            java.lang.System.arraycopy(Camera2StreamConfigurationMap, 0, bArr3, bitLength - Camera2StreamConfigurationMap.length, Camera2StreamConfigurationMap.length);
            Camera2StreamConfigurationMap = bArr3;
        }
        byte[] concatenate = org.bouncycastle.pqc.math.linearalgebra.ByteUtils.concatenate(org.bouncycastle.pqc.math.linearalgebra.ByteUtils.concatenate(bArr2, Camera2StreamConfigurationMap), encoded);
        int length2 = concatenate.length - digestSize;
        byte[][] split2 = org.bouncycastle.pqc.math.linearalgebra.ByteUtils.split(concatenate, digestSize);
        byte[] bArr4 = split2[0];
        byte[] bArr5 = split2[1];
        byte[] bArr6 = new byte[this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize()];
        this.getHighResolutionOutputSizeshNQ4ISI.update(bArr5, 0, bArr5.length);
        this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr6, 0);
        while (true) {
            digestSize--;
            if (digestSize < 0) {
                break;
            }
            bArr6[digestSize] = (byte) (bArr6[digestSize] ^ bArr4[digestSize]);
        }
        org.bouncycastle.crypto.prng.DigestRandomGenerator digestRandomGenerator = new org.bouncycastle.crypto.prng.DigestRandomGenerator(new org.bouncycastle.crypto.digests.SHA1Digest());
        digestRandomGenerator.addSeedMaterial(bArr6);
        byte[] bArr7 = new byte[length2];
        digestRandomGenerator.nextBytes(bArr7);
        for (int i3 = length2 - 1; i3 >= 0; i3--) {
            bArr7[i3] = (byte) (bArr7[i3] ^ bArr5[i3]);
        }
        byte[] bArr8 = PUBLIC_CONSTANT;
        byte[][] split3 = org.bouncycastle.pqc.math.linearalgebra.ByteUtils.split(bArr7, length2 - bArr8.length);
        byte[] bArr9 = split3[0];
        if (org.bouncycastle.pqc.math.linearalgebra.ByteUtils.equals(split3[1], bArr8)) {
            return bArr9;
        }
        throw new org.bouncycastle.crypto.InvalidCipherTextException("Bad Padding: invalid ciphertext");
    }

    public int getKeySize(org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) {
        if (mcElieceCCA2KeyParameters instanceof org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters) {
            return ((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        if (mcElieceCCA2KeyParameters instanceof org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters) {
            return ((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        throw new java.lang.IllegalArgumentException("unsupported type");
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.mceliece.Utils.Camera2StreamConfigurationMap(mcElieceCCA2PublicKeyParameters.getDigest());
        this.getHighSpeedVideoFpsRangesFor = mcElieceCCA2PublicKeyParameters.getN();
        this.Camera2StreamConfigurationMap = mcElieceCCA2PublicKeyParameters.getK();
        this.getHighSpeedVideoSizesFor = mcElieceCCA2PublicKeyParameters.getT();
    }
}
