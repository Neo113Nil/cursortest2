package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class X931Signer implements org.bouncycastle.crypto.Signer {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA224 = 14540;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private byte[] Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.AsymmetricBlockCipher getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.RSAKeyParameters getHighSpeedVideoSizes;
    private int getInputFormats;

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws org.bouncycastle.crypto.CryptoException {
        getHighSpeedVideoSizes(this.getInputFormats);
        org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher = this.getHighResolutionOutputSizeshNQ4ISI;
        byte[] bArr = this.Camera2StreamConfigurationMap;
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, asymmetricBlockCipher.processBlock(bArr, 0, bArr.length));
        byte[] bArr2 = this.Camera2StreamConfigurationMap;
        for (int i = 0; i != bArr2.length; i++) {
            bArr2[i] = 0;
        }
        return org.bouncycastle.util.BigIntegers.asUnsignedByteArray(org.bouncycastle.util.BigIntegers.getUnsignedByteLength(this.getHighSpeedVideoSizes.getModulus()), bigInteger.min(this.getHighSpeedVideoSizes.getModulus().subtract(bigInteger)));
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        try {
            this.Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.processBlock(bArr, 0, bArr.length);
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, this.Camera2StreamConfigurationMap);
            if ((bigInteger.intValue() & 15) != 12) {
                bigInteger = this.getHighSpeedVideoSizes.getModulus().subtract(bigInteger);
                if ((bigInteger.intValue() & 15) != 12) {
                    return false;
                }
            }
            getHighSpeedVideoSizes(this.getInputFormats);
            byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(this.Camera2StreamConfigurationMap.length, bigInteger);
            boolean constantTimeAreEqual = org.bouncycastle.util.Arrays.constantTimeAreEqual(this.Camera2StreamConfigurationMap, asUnsignedByteArray);
            if (this.getInputFormats == 15052 && !constantTimeAreEqual) {
                byte[] bArr2 = this.Camera2StreamConfigurationMap;
                bArr2[bArr2.length - 2] = 64;
                constantTimeAreEqual = org.bouncycastle.util.Arrays.constantTimeAreEqual(bArr2, asUnsignedByteArray);
            }
            byte[] bArr3 = this.Camera2StreamConfigurationMap;
            for (int i = 0; i != bArr3.length; i++) {
                bArr3[i] = 0;
            }
            for (int i2 = 0; i2 != asUnsignedByteArray.length; i2++) {
                asUnsignedByteArray[i2] = 0;
            }
            return constantTimeAreEqual;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoFpsRanges.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.getHighSpeedVideoFpsRanges.update(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.getHighSpeedVideoFpsRanges.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters = (org.bouncycastle.crypto.params.RSAKeyParameters) cipherParameters;
        this.getHighSpeedVideoSizes = rSAKeyParameters;
        this.getHighResolutionOutputSizeshNQ4ISI.init(z, rSAKeyParameters);
        int bitLength = this.getHighSpeedVideoSizes.getModulus().bitLength();
        this.getHighSpeedVideoFpsRangesFor = bitLength;
        this.Camera2StreamConfigurationMap = new byte[(bitLength + 7) / 8];
        reset();
    }

    private void getHighSpeedVideoSizes(int i) {
        int i2;
        int digestSize = this.getHighSpeedVideoFpsRanges.getDigestSize();
        if (i == 188) {
            byte[] bArr = this.Camera2StreamConfigurationMap;
            i2 = (bArr.length - digestSize) - 1;
            this.getHighSpeedVideoFpsRanges.doFinal(bArr, i2);
            this.Camera2StreamConfigurationMap[r5.length - 1] = org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT;
        } else {
            byte[] bArr2 = this.Camera2StreamConfigurationMap;
            int length = (bArr2.length - digestSize) - 2;
            this.getHighSpeedVideoFpsRanges.doFinal(bArr2, length);
            byte[] bArr3 = this.Camera2StreamConfigurationMap;
            bArr3[bArr3.length - 2] = (byte) (i >>> 8);
            bArr3[bArr3.length - 1] = (byte) i;
            i2 = length;
        }
        this.Camera2StreamConfigurationMap[0] = 107;
        for (int i3 = i2 - 2; i3 != 0; i3--) {
            this.Camera2StreamConfigurationMap[i3] = -69;
        }
        this.Camera2StreamConfigurationMap[i2 - 1] = -70;
    }

    public X931Signer(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest, boolean z) {
        int intValue;
        this.getHighResolutionOutputSizeshNQ4ISI = asymmetricBlockCipher;
        this.getHighSpeedVideoFpsRanges = digest;
        if (z) {
            intValue = 188;
        } else {
            java.lang.Integer trailer = org.bouncycastle.crypto.signers.ISOTrailers.getTrailer(digest);
            if (trailer == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("no valid trailer for digest: ");
                sb.append(digest.getAlgorithmName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            intValue = trailer.intValue();
        }
        this.getInputFormats = intValue;
    }

    public X931Signer(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, org.bouncycastle.crypto.Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }
}
