package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class SM2Engine {
    private boolean Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.ECDomainParameters getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.ECKeyParameters getHighSpeedVideoSizes;
    private final org.bouncycastle.crypto.engines.SM2Engine.Mode getHighSpeedVideoSizesFor;
    private java.security.SecureRandom getOutputFormats;

    public enum Mode {
        C1C2C3,
        C1C3C2
    }

    private void getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.Digest digest, org.bouncycastle.math.ec.ECPoint eCPoint, byte[] bArr) {
        org.bouncycastle.util.Memoable memoable;
        org.bouncycastle.util.Memoable memoable2;
        int digestSize = digest.getDigestSize();
        byte[] bArr2 = new byte[java.lang.Math.max(4, digestSize)];
        if (digest instanceof org.bouncycastle.util.Memoable) {
            byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(this.getHighResolutionOutputSizeshNQ4ISI, eCPoint.getAffineXCoord().toBigInteger());
            digest.update(asUnsignedByteArray, 0, asUnsignedByteArray.length);
            byte[] asUnsignedByteArray2 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(this.getHighResolutionOutputSizeshNQ4ISI, eCPoint.getAffineYCoord().toBigInteger());
            digest.update(asUnsignedByteArray2, 0, asUnsignedByteArray2.length);
            memoable = (org.bouncycastle.util.Memoable) digest;
            memoable2 = memoable.copy();
        } else {
            memoable = null;
            memoable2 = null;
        }
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            if (memoable != null) {
                memoable.reset(memoable2);
            } else {
                byte[] asUnsignedByteArray3 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(this.getHighResolutionOutputSizeshNQ4ISI, eCPoint.getAffineXCoord().toBigInteger());
                digest.update(asUnsignedByteArray3, 0, asUnsignedByteArray3.length);
                byte[] asUnsignedByteArray4 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(this.getHighResolutionOutputSizeshNQ4ISI, eCPoint.getAffineYCoord().toBigInteger());
                digest.update(asUnsignedByteArray4, 0, asUnsignedByteArray4.length);
            }
            i2++;
            org.bouncycastle.util.Pack.intToBigEndian(i2, bArr2, 0);
            digest.update(bArr2, 0, 4);
            digest.doFinal(bArr2, 0);
            int min = java.lang.Math.min(digestSize, bArr.length - i);
            for (int i3 = 0; i3 != min; i3++) {
                int i4 = i + i3;
                bArr[i4] = (byte) (bArr[i4] ^ bArr2[i3]);
            }
            i += min;
        }
    }

    public byte[] processBlock(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        int i3;
        java.math.BigInteger createRandomBigInteger;
        byte[] encoded;
        org.bouncycastle.math.ec.ECPoint normalize;
        if (this.Camera2StreamConfigurationMap) {
            byte[] bArr2 = new byte[i2];
            java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
            org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
            loop0: while (true) {
                int bitLength = this.getHighSpeedVideoFpsRanges.getN().bitLength();
                while (true) {
                    createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(bitLength, this.getOutputFormats);
                    if (!createRandomBigInteger.equals(org.bouncycastle.util.BigIntegers.ZERO) && createRandomBigInteger.compareTo(this.getHighSpeedVideoFpsRanges.getN()) < 0) {
                        break;
                    }
                }
                encoded = createBasePointMultiplier.multiply(this.getHighSpeedVideoFpsRanges.getG(), createRandomBigInteger).normalize().getEncoded(false);
                normalize = ((org.bouncycastle.crypto.params.ECPublicKeyParameters) this.getHighSpeedVideoSizes).getQ().multiply(createRandomBigInteger).normalize();
                getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, normalize, bArr2);
                for (int i4 = 0; i4 != i2; i4++) {
                    if (bArr2[i4] != bArr[i + i4]) {
                        break loop0;
                    }
                }
            }
            byte[] bArr3 = new byte[this.getHighSpeedVideoFpsRangesFor.getDigestSize()];
            org.bouncycastle.crypto.Digest digest = this.getHighSpeedVideoFpsRangesFor;
            byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(this.getHighResolutionOutputSizeshNQ4ISI, normalize.getAffineXCoord().toBigInteger());
            digest.update(asUnsignedByteArray, 0, asUnsignedByteArray.length);
            this.getHighSpeedVideoFpsRangesFor.update(bArr, i, i2);
            org.bouncycastle.crypto.Digest digest2 = this.getHighSpeedVideoFpsRangesFor;
            byte[] asUnsignedByteArray2 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(this.getHighResolutionOutputSizeshNQ4ISI, normalize.getAffineYCoord().toBigInteger());
            digest2.update(asUnsignedByteArray2, 0, asUnsignedByteArray2.length);
            this.getHighSpeedVideoFpsRangesFor.doFinal(bArr3, 0);
            return org.bouncycastle.crypto.engines.SM2Engine.AnonymousClass1.getHighSpeedVideoSizes[this.getHighSpeedVideoSizesFor.ordinal()] != 1 ? org.bouncycastle.util.Arrays.concatenate(encoded, bArr2, bArr3) : org.bouncycastle.util.Arrays.concatenate(encoded, bArr3, bArr2);
        }
        int i5 = (this.getHighResolutionOutputSizeshNQ4ISI * 2) + 1;
        byte[] bArr4 = new byte[i5];
        java.lang.System.arraycopy(bArr, i, bArr4, 0, i5);
        org.bouncycastle.math.ec.ECPoint decodePoint = this.getHighSpeedVideoFpsRanges.getCurve().decodePoint(bArr4);
        if (decodePoint.multiply(this.getHighSpeedVideoFpsRanges.getH()).isInfinity()) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("[h]C1 at infinity");
        }
        org.bouncycastle.math.ec.ECPoint normalize2 = decodePoint.multiply(((org.bouncycastle.crypto.params.ECPrivateKeyParameters) this.getHighSpeedVideoSizes).getD()).normalize();
        int digestSize = this.getHighSpeedVideoFpsRangesFor.getDigestSize();
        int i6 = (i2 - i5) - digestSize;
        byte[] bArr5 = new byte[i6];
        if (this.getHighSpeedVideoSizesFor == org.bouncycastle.crypto.engines.SM2Engine.Mode.C1C3C2) {
            java.lang.System.arraycopy(bArr, i + i5 + digestSize, bArr5, 0, i6);
        } else {
            java.lang.System.arraycopy(bArr, i + i5, bArr5, 0, i6);
        }
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, normalize2, bArr5);
        int digestSize2 = this.getHighSpeedVideoFpsRangesFor.getDigestSize();
        byte[] bArr6 = new byte[digestSize2];
        org.bouncycastle.crypto.Digest digest3 = this.getHighSpeedVideoFpsRangesFor;
        byte[] asUnsignedByteArray3 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(this.getHighResolutionOutputSizeshNQ4ISI, normalize2.getAffineXCoord().toBigInteger());
        digest3.update(asUnsignedByteArray3, 0, asUnsignedByteArray3.length);
        this.getHighSpeedVideoFpsRangesFor.update(bArr5, 0, i6);
        org.bouncycastle.crypto.Digest digest4 = this.getHighSpeedVideoFpsRangesFor;
        byte[] asUnsignedByteArray4 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(this.getHighResolutionOutputSizeshNQ4ISI, normalize2.getAffineYCoord().toBigInteger());
        digest4.update(asUnsignedByteArray4, 0, asUnsignedByteArray4.length);
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr6, 0);
        if (this.getHighSpeedVideoSizesFor == org.bouncycastle.crypto.engines.SM2Engine.Mode.C1C3C2) {
            i3 = 0;
            for (int i7 = 0; i7 != digestSize2; i7++) {
                i3 |= bArr6[i7] ^ bArr[(i + i5) + i7];
            }
        } else {
            int i8 = 0;
            for (int i9 = 0; i9 != digestSize2; i9++) {
                i8 |= bArr6[i9] ^ bArr[((i + i5) + i6) + i9];
            }
            i3 = i8;
        }
        org.bouncycastle.util.Arrays.fill(bArr4, (byte) 0);
        org.bouncycastle.util.Arrays.fill(bArr6, (byte) 0);
        if (i3 == 0) {
            return bArr5;
        }
        org.bouncycastle.util.Arrays.fill(bArr5, (byte) 0);
        throw new org.bouncycastle.crypto.InvalidCipherTextException("invalid cipher text");
    }

    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.Camera2StreamConfigurationMap = z;
        if (z) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            org.bouncycastle.crypto.params.ECKeyParameters eCKeyParameters = (org.bouncycastle.crypto.params.ECKeyParameters) parametersWithRandom.getParameters();
            this.getHighSpeedVideoSizes = eCKeyParameters;
            this.getHighSpeedVideoFpsRanges = eCKeyParameters.getParameters();
            if (((org.bouncycastle.crypto.params.ECPublicKeyParameters) this.getHighSpeedVideoSizes).getQ().multiply(this.getHighSpeedVideoFpsRanges.getH()).isInfinity()) {
                throw new java.lang.IllegalArgumentException("invalid key: [h]Q at infinity");
            }
            this.getOutputFormats = parametersWithRandom.getRandom();
        } else {
            org.bouncycastle.crypto.params.ECKeyParameters eCKeyParameters2 = (org.bouncycastle.crypto.params.ECKeyParameters) cipherParameters;
            this.getHighSpeedVideoSizes = eCKeyParameters2;
            this.getHighSpeedVideoFpsRanges = eCKeyParameters2.getParameters();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = (this.getHighSpeedVideoFpsRanges.getCurve().getFieldSize() + 7) / 8;
    }

    public int getOutputSize(int i) {
        return (this.getHighResolutionOutputSizeshNQ4ISI * 2) + 1 + i + this.getHighSpeedVideoFpsRangesFor.getDigestSize();
    }

    protected org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier() {
        return new org.bouncycastle.math.ec.FixedPointCombMultiplier();
    }

    public SM2Engine(org.bouncycastle.crypto.engines.SM2Engine.Mode mode) {
        this(new org.bouncycastle.crypto.digests.SM3Digest(), mode);
    }

    public SM2Engine(org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.engines.SM2Engine.Mode mode) {
        if (mode == null) {
            throw new java.lang.IllegalArgumentException("mode cannot be NULL");
        }
        this.getHighSpeedVideoFpsRangesFor = digest;
        this.getHighSpeedVideoSizesFor = mode;
    }

    /* renamed from: org.bouncycastle.crypto.engines.SM2Engine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[org.bouncycastle.crypto.engines.SM2Engine.Mode.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[org.bouncycastle.crypto.engines.SM2Engine.Mode.C1C3C2.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    public SM2Engine(org.bouncycastle.crypto.Digest digest) {
        this(digest, org.bouncycastle.crypto.engines.SM2Engine.Mode.C1C2C3);
    }

    public SM2Engine() {
        this(new org.bouncycastle.crypto.digests.SM3Digest());
    }
}
