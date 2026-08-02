package org.bouncycastle.crypto.prng.drbg;

/* loaded from: classes17.dex */
public class DualECSP800DRBG implements org.bouncycastle.crypto.prng.drbg.SP80090DRBG {
    private static final java.math.BigInteger Camera2StreamConfigurationMap;
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges;
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private static final org.bouncycastle.crypto.prng.drbg.DualECPoints[] getHighSpeedVideoSizes;
    private static final java.math.BigInteger getHighSpeedVideoSizesFor;
    private static final java.math.BigInteger getInputFormats;
    private static final java.math.BigInteger getInputSizeshNQ4ISI;
    private static final java.math.BigInteger getOutputFormats;
    private static final java.math.BigInteger getOutputMinFrameDuration;
    private static final java.math.BigInteger getOutputMinFrameDurationlomOqCM;
    private static final java.math.BigInteger getOutputSizeshNQ4ISI;
    private static final java.math.BigInteger getOutputStallDurationlomOqCM;
    private int ArtificialStackFrames;
    private int accessartificialFrame;
    private int coroutineBoundary;
    private byte[] coroutineCreation;
    private org.bouncycastle.math.ec.ECPoint getOutputSizes;
    private org.bouncycastle.math.ec.ECPoint getOutputStallDuration;
    private org.bouncycastle.crypto.Digest getValidOutputFormatsForInputhNQ4ISI;
    private long isOutputSupportedFor;
    private int isOutputSupportedForhNQ4ISI;
    private org.bouncycastle.math.ec.ECMultiplier toString;
    private org.bouncycastle.crypto.prng.EntropySource unwrapAs;

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z) {
        int length;
        int length2 = bArr.length;
        int length3 = bArr.length / this.isOutputSupportedForhNQ4ISI;
        if (org.bouncycastle.crypto.prng.drbg.Utils.getHighSpeedVideoSizes(bArr2, 512)) {
            throw new java.lang.IllegalArgumentException("Additional input too large");
        }
        if (this.isOutputSupportedFor + length3 > 2147483648L) {
            return -1;
        }
        if (z) {
            reseed(bArr2);
            bArr2 = null;
        }
        java.math.BigInteger bigInteger = bArr2 != null ? new java.math.BigInteger(1, getHighSpeedVideoFpsRangesFor(this.coroutineCreation, org.bouncycastle.crypto.prng.drbg.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, bArr2, this.ArtificialStackFrames))) : new java.math.BigInteger(1, this.coroutineCreation);
        int i = 0;
        org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
        int i2 = 0;
        for (int i3 = 0; i3 < length3; i3++) {
            bigInteger = this.toString.multiply(this.getOutputSizes, bigInteger).normalize().getAffineXCoord().toBigInteger();
            byte[] byteArray = this.toString.multiply(this.getOutputStallDuration, bigInteger).normalize().getAffineXCoord().toBigInteger().toByteArray();
            int length4 = byteArray.length;
            int i4 = this.isOutputSupportedForhNQ4ISI;
            if (length4 > i4) {
                java.lang.System.arraycopy(byteArray, byteArray.length - i4, bArr, i2, i4);
            } else {
                java.lang.System.arraycopy(byteArray, 0, bArr, (i4 - byteArray.length) + i2, byteArray.length);
            }
            i2 += this.isOutputSupportedForhNQ4ISI;
            this.isOutputSupportedFor++;
        }
        if (i2 < bArr.length) {
            bigInteger = this.toString.multiply(this.getOutputSizes, bigInteger).normalize().getAffineXCoord().toBigInteger();
            byte[] byteArray2 = this.toString.multiply(this.getOutputStallDuration, bigInteger).normalize().getAffineXCoord().toBigInteger().toByteArray();
            int length5 = bArr.length;
            int length6 = byteArray2.length;
            int i5 = this.isOutputSupportedForhNQ4ISI;
            if (length6 > i5) {
                i = byteArray2.length - i5;
                length = i2;
            } else {
                length = (i5 - byteArray2.length) + i2;
            }
            java.lang.System.arraycopy(byteArray2, i, bArr, length, length5 - i2);
            this.isOutputSupportedFor++;
        }
        this.coroutineCreation = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(this.accessartificialFrame, this.toString.multiply(this.getOutputSizes, bigInteger).normalize().getAffineXCoord().toBigInteger());
        return length2 * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        if (org.bouncycastle.crypto.prng.drbg.Utils.getHighSpeedVideoSizes(bArr, 512)) {
            throw new java.lang.IllegalArgumentException("Additional input string too large");
        }
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        byte[] bArr2 = this.coroutineCreation;
        int i = this.ArtificialStackFrames % 8;
        if (i != 0) {
            int i2 = 8 - i;
            int length = bArr2.length - 1;
            int i3 = 0;
            while (length >= 0) {
                int i4 = bArr2[length] & 255;
                bArr2[length] = (byte) ((i3 >> (8 - i2)) | (i4 << i2));
                length--;
                i3 = i4;
            }
        }
        this.coroutineCreation = org.bouncycastle.crypto.prng.drbg.Utils.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI, org.bouncycastle.util.Arrays.concatenate(bArr2, highResolutionOutputSizeshNQ4ISI, bArr), this.ArtificialStackFrames);
        this.isOutputSupportedFor = 0L;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this.isOutputSupportedForhNQ4ISI * 8;
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            return bArr;
        }
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI() {
        byte[] entropy = this.unwrapAs.getEntropy();
        if (entropy.length >= (this.coroutineBoundary + 7) / 8) {
            return entropy;
        }
        throw new java.lang.IllegalStateException("Insufficient entropy provided by entropy source");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r1.getOutputSizes == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        r2 = org.bouncycastle.crypto.prng.drbg.Utils.getHighSpeedVideoSizes(r1.getValidOutputFormatsForInputhNQ4ISI, r5, r1.ArtificialStackFrames);
        r1.coroutineCreation = r2;
        r1.accessartificialFrame = r2.length;
        r1.isOutputSupportedFor = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        throw new java.lang.IllegalArgumentException("security strength cannot be greater than 256 bits");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DualECSP800DRBG(org.bouncycastle.crypto.prng.drbg.DualECPoints[] dualECPointsArr, org.bouncycastle.crypto.Digest digest, int i, org.bouncycastle.crypto.prng.EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this.toString = new org.bouncycastle.math.ec.FixedPointCombMultiplier();
        this.getValidOutputFormatsForInputhNQ4ISI = digest;
        this.unwrapAs = entropySource;
        this.coroutineBoundary = i;
        if (org.bouncycastle.crypto.prng.drbg.Utils.getHighSpeedVideoSizes(bArr, 512)) {
            throw new java.lang.IllegalArgumentException("Personalization string too large");
        }
        if (entropySource.entropySize() < i || entropySource.entropySize() > 4096) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EntropySource must provide between ");
            sb.append(i);
            sb.append(" and 4096 bits");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(getHighResolutionOutputSizeshNQ4ISI(), bArr2, bArr);
        int i2 = 0;
        while (true) {
            if (i2 == dualECPointsArr.length) {
                break;
            }
            if (i > dualECPointsArr[i2].getSecurityStrength()) {
                i2++;
            } else {
                if (org.bouncycastle.crypto.prng.drbg.Utils.Camera2StreamConfigurationMap(digest) < dualECPointsArr[i2].getSecurityStrength()) {
                    throw new java.lang.IllegalArgumentException("Requested security strength is not supported by digest");
                }
                this.ArtificialStackFrames = dualECPointsArr[i2].getSeedLen();
                this.isOutputSupportedForhNQ4ISI = dualECPointsArr[i2].getMaxOutlen() / 8;
                this.getOutputSizes = dualECPointsArr[i2].getP();
                this.getOutputStallDuration = dualECPointsArr[i2].getQ();
            }
        }
    }

    public DualECSP800DRBG(org.bouncycastle.crypto.Digest digest, int i, org.bouncycastle.crypto.prng.EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this(getHighSpeedVideoSizes, digest, i, entropySource, bArr, bArr2);
    }

    static {
        java.math.BigInteger bigInteger = new java.math.BigInteger("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16);
        getHighResolutionOutputSizeshNQ4ISI = bigInteger;
        java.math.BigInteger bigInteger2 = new java.math.BigInteger("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16);
        getHighSpeedVideoFpsRangesFor = bigInteger2;
        java.math.BigInteger bigInteger3 = new java.math.BigInteger("c97445f45cdef9f0d3e05e1e585fc297235b82b5be8ff3efca67c59852018192", 16);
        getHighSpeedVideoFpsRanges = bigInteger3;
        java.math.BigInteger bigInteger4 = new java.math.BigInteger("b28ef557ba31dfcbdd21ac46e2a91e3c304f44cb87058ada2cb815151e610046", 16);
        Camera2StreamConfigurationMap = bigInteger4;
        java.math.BigInteger bigInteger5 = new java.math.BigInteger("aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", 16);
        getInputSizeshNQ4ISI = bigInteger5;
        java.math.BigInteger bigInteger6 = new java.math.BigInteger("3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f", 16);
        getHighSpeedVideoSizesFor = bigInteger6;
        java.math.BigInteger bigInteger7 = new java.math.BigInteger("8e722de3125bddb05580164bfe20b8b432216a62926c57502ceede31c47816edd1e89769124179d0b695106428815065", 16);
        getOutputMinFrameDuration = bigInteger7;
        java.math.BigInteger bigInteger8 = new java.math.BigInteger("023b1660dd701d0839fd45eec36f9ee7b32e13b315dc02610aa1b636e346df671f790f84c5e09b05674dbb7e45c803dd", 16);
        getInputFormats = bigInteger8;
        java.math.BigInteger bigInteger9 = new java.math.BigInteger("c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", 16);
        getOutputFormats = bigInteger9;
        java.math.BigInteger bigInteger10 = new java.math.BigInteger("11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650", 16);
        getOutputSizeshNQ4ISI = bigInteger10;
        java.math.BigInteger bigInteger11 = new java.math.BigInteger("1b9fa3e518d683c6b65763694ac8efbaec6fab44f2276171a42726507dd08add4c3b3f4c1ebc5b1222ddba077f722943b24c3edfa0f85fe24d0c8c01591f0be6f63", 16);
        getOutputStallDurationlomOqCM = bigInteger11;
        java.math.BigInteger bigInteger12 = new java.math.BigInteger("1f3bdba585295d9a1110d1df1f9430ef8442c5018976ff3437ef91b81dc0b8132c8d5c39c32d0e004a3092b7d327c0e7a4d26d2c7b69b58f9066652911e457779de", 16);
        getOutputMinFrameDurationlomOqCM = bigInteger12;
        getHighSpeedVideoSizes = new org.bouncycastle.crypto.prng.drbg.DualECPoints[]{new org.bouncycastle.crypto.prng.drbg.DualECPoints(128, r13.createPoint(bigInteger, bigInteger2), r13.createPoint(bigInteger3, bigInteger4), 1), new org.bouncycastle.crypto.prng.drbg.DualECPoints(192, r0.createPoint(bigInteger5, bigInteger6), r0.createPoint(bigInteger7, bigInteger8), 1), new org.bouncycastle.crypto.prng.drbg.DualECPoints(256, r0.createPoint(bigInteger9, bigInteger10), r0.createPoint(bigInteger11, bigInteger12), 1)};
        org.bouncycastle.math.ec.ECCurve.Fp fp = (org.bouncycastle.math.ec.ECCurve.Fp) org.bouncycastle.asn1.nist.NISTNamedCurves.getByName(org.jose4j.keys.EllipticCurves.P_256).getCurve();
        org.bouncycastle.math.ec.ECCurve.Fp fp2 = (org.bouncycastle.math.ec.ECCurve.Fp) org.bouncycastle.asn1.nist.NISTNamedCurves.getByName(org.jose4j.keys.EllipticCurves.P_384).getCurve();
        org.bouncycastle.math.ec.ECCurve.Fp fp3 = (org.bouncycastle.math.ec.ECCurve.Fp) org.bouncycastle.asn1.nist.NISTNamedCurves.getByName(org.jose4j.keys.EllipticCurves.P_521).getCurve();
    }
}
