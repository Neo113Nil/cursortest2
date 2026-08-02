package org.bouncycastle.util.test;

/* loaded from: classes17.dex */
public class FixedSecureRandom extends java.security.SecureRandom {
    private static final boolean Camera2StreamConfigurationMap;
    private static final boolean getHighSpeedVideoSizes;
    private static final boolean getInputFormats;
    private int getInputSizeshNQ4ISI;
    private byte[] getOutputMinFrameDuration;
    private static java.math.BigInteger getHighSpeedVideoFpsRangesFor = new java.math.BigInteger("01020304ffffffff0506070811111111", 16);
    private static java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI = new java.math.BigInteger("1111111105060708ffffffff01020304", 16);
    private static java.math.BigInteger getHighSpeedVideoFpsRanges = new java.math.BigInteger("3020104ffffffff05060708111111", 16);

    static /* synthetic */ byte[] getHighSpeedVideoFpsRangesFor(int i, byte[] bArr) {
        int i2;
        int i3;
        int i4 = (i + 7) / 8;
        if (i4 <= bArr.length) {
            if (Camera2StreamConfigurationMap && i < bArr.length * 8 && (i2 = i % 8) != 0) {
                org.bouncycastle.util.Pack.intToBigEndian(org.bouncycastle.util.Pack.bigEndianToInt(bArr, 0) << (8 - i2), bArr, 0);
            }
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        java.lang.System.arraycopy(bArr, 0, bArr2, i4 - bArr.length, bArr.length);
        if (Camera2StreamConfigurationMap && (i3 = i % 8) != 0) {
            org.bouncycastle.util.Pack.intToBigEndian(org.bouncycastle.util.Pack.bigEndianToInt(bArr2, 0) << (8 - i3), bArr2, 0);
        }
        return bArr2;
    }

    @Override // java.util.Random
    public int nextInt() {
        byte[] bArr = this.getOutputMinFrameDuration;
        int i = this.getInputSizeshNQ4ISI;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 8);
        this.getInputSizeshNQ4ISI = i + 4;
        return (bArr[i3] & 255) | i4;
    }

    @Override // java.util.Random
    public long nextLong() {
        byte[] bArr = this.getOutputMinFrameDuration;
        int i = this.getInputSizeshNQ4ISI;
        int i2 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        this.getInputSizeshNQ4ISI = i + 8;
        return (bArr[i2] & 255) | j;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        java.lang.System.arraycopy(this.getOutputMinFrameDuration, this.getInputSizeshNQ4ISI, bArr, 0, bArr.length);
        this.getInputSizeshNQ4ISI += bArr.length;
    }

    public boolean isExhausted() {
        return this.getInputSizeshNQ4ISI == this.getOutputMinFrameDuration.length;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        nextBytes(bArr);
        return bArr;
    }

    public static class BigInteger extends org.bouncycastle.util.test.FixedSecureRandom.Source {
        public BigInteger(byte[] bArr) {
            super(bArr);
        }

        public BigInteger(java.lang.String str) {
            this(org.bouncycastle.util.encoders.Hex.decode(str));
        }

        public BigInteger(int i, byte[] bArr) {
            super(org.bouncycastle.util.test.FixedSecureRandom.getHighSpeedVideoFpsRangesFor(i, bArr));
        }

        public BigInteger(int i, java.lang.String str) {
            super(org.bouncycastle.util.test.FixedSecureRandom.getHighSpeedVideoFpsRangesFor(i, org.bouncycastle.util.encoders.Hex.decode(str)));
        }
    }

    private static org.bouncycastle.util.test.FixedSecureRandom.Data[] getHighResolutionOutputSizeshNQ4ISI(byte[][] bArr) {
        org.bouncycastle.util.test.FixedSecureRandom.Data[] dataArr = new org.bouncycastle.util.test.FixedSecureRandom.Data[bArr.length];
        for (int i = 0; i != bArr.length; i++) {
            dataArr[i] = new org.bouncycastle.util.test.FixedSecureRandom.Data(bArr[i]);
        }
        return dataArr;
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(getHighResolutionOutputSizeshNQ4ISI(bArr));
    }

    static class RandomChecker extends java.security.SecureRandom {
        byte[] getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;

        @Override // java.security.SecureRandom, java.util.Random
        public void nextBytes(byte[] bArr) {
            java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, bArr, 0, bArr.length);
            this.getHighSpeedVideoSizes += bArr.length;
        }

        RandomChecker() {
            super(null, new org.bouncycastle.util.test.FixedSecureRandom.DummyProvider());
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.encoders.Hex.decode("01020304ffffffff0506070811111111");
            this.getHighSpeedVideoSizes = 0;
        }
    }

    public FixedSecureRandom(org.bouncycastle.util.test.FixedSecureRandom.Source[] sourceArr) {
        super(null, new org.bouncycastle.util.test.FixedSecureRandom.DummyProvider());
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 0;
        if (!getInputFormats) {
            if (!Camera2StreamConfigurationMap) {
                throw new java.lang.IllegalStateException("Unrecognized BigInteger implementation");
            }
            for (int i2 = 0; i2 != sourceArr.length; i2++) {
                try {
                    org.bouncycastle.util.test.FixedSecureRandom.Source source = sourceArr[i2];
                    if (source instanceof org.bouncycastle.util.test.FixedSecureRandom.BigInteger) {
                        byte[] bArr = source.getHighSpeedVideoFpsRanges;
                        int length = bArr.length - (bArr.length % 4);
                        int i3 = 0;
                        while (i3 < length) {
                            i3 += 4;
                            byteArrayOutputStream.write(bArr, bArr.length - i3, 4);
                        }
                        if (bArr.length - length != 0) {
                            for (int i4 = 0; i4 != 4 - (bArr.length - length); i4++) {
                                byteArrayOutputStream.write(0);
                            }
                        }
                        for (int i5 = 0; i5 != bArr.length - length; i5++) {
                            byteArrayOutputStream.write(bArr[length + i5]);
                        }
                    } else {
                        byteArrayOutputStream.write(source.getHighSpeedVideoFpsRanges);
                    }
                } catch (java.io.IOException unused) {
                    throw new java.lang.IllegalArgumentException("can't save value source.");
                }
            }
        } else if (getHighSpeedVideoSizes) {
            while (i != sourceArr.length) {
                try {
                    org.bouncycastle.util.test.FixedSecureRandom.Source source2 = sourceArr[i];
                    if (source2 instanceof org.bouncycastle.util.test.FixedSecureRandom.BigInteger) {
                        byte[] bArr2 = source2.getHighSpeedVideoFpsRanges;
                        int length2 = bArr2.length - (bArr2.length % 4);
                        for (int length3 = (bArr2.length - length2) - 1; length3 >= 0; length3--) {
                            byteArrayOutputStream.write(bArr2[length3]);
                        }
                        for (int length4 = bArr2.length - length2; length4 < bArr2.length; length4 += 4) {
                            byteArrayOutputStream.write(bArr2, length4, 4);
                        }
                    } else {
                        byteArrayOutputStream.write(source2.getHighSpeedVideoFpsRanges);
                    }
                    i++;
                } catch (java.io.IOException unused2) {
                    throw new java.lang.IllegalArgumentException("can't save value source.");
                }
            }
        } else {
            while (i != sourceArr.length) {
                try {
                    byteArrayOutputStream.write(sourceArr[i].getHighSpeedVideoFpsRanges);
                    i++;
                } catch (java.io.IOException unused3) {
                    throw new java.lang.IllegalArgumentException("can't save value source.");
                }
            }
        }
        this.getOutputMinFrameDuration = byteArrayOutputStream.toByteArray();
    }

    public static class Data extends org.bouncycastle.util.test.FixedSecureRandom.Source {
        public Data(byte[] bArr) {
            super(bArr);
        }
    }

    static class DummyProvider extends java.security.Provider {
        DummyProvider() {
            super("BCFIPS_FIXED_RNG", 1.0d, "BCFIPS Fixed Secure Random Provider");
        }
    }

    public static class Source {
        byte[] getHighSpeedVideoFpsRanges;

        Source(byte[] bArr) {
            this.getHighSpeedVideoFpsRanges = bArr;
        }
    }

    public FixedSecureRandom(byte[] bArr) {
        this(new org.bouncycastle.util.test.FixedSecureRandom.Source[]{new org.bouncycastle.util.test.FixedSecureRandom.Data(bArr)});
    }

    static {
        java.math.BigInteger bigInteger = new java.math.BigInteger(128, new org.bouncycastle.util.test.FixedSecureRandom.RandomChecker());
        java.math.BigInteger bigInteger2 = new java.math.BigInteger(120, new org.bouncycastle.util.test.FixedSecureRandom.RandomChecker());
        Camera2StreamConfigurationMap = bigInteger.equals(getHighResolutionOutputSizeshNQ4ISI);
        getInputFormats = bigInteger.equals(getHighSpeedVideoFpsRangesFor);
        getHighSpeedVideoSizes = bigInteger2.equals(getHighSpeedVideoFpsRanges);
    }
}
