package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class KeccakDigest implements org.bouncycastle.crypto.ExtendedDigest {
    private static long[] getHighSpeedVideoSizes = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    protected int bitsInQueue;
    protected byte[] dataQueue;
    protected int fixedOutputLength;
    protected int rate;
    protected boolean squeezing;
    protected long[] state;

    protected void squeeze(byte[] bArr, int i, long j) {
        if (!this.squeezing) {
            byte[] bArr2 = this.dataQueue;
            int i2 = this.bitsInQueue;
            int i3 = i2 >>> 3;
            bArr2[i3] = (byte) (bArr2[i3] | ((byte) (1 << (i2 & 7))));
            int i4 = i2 + 1;
            this.bitsInQueue = i4;
            if (i4 == this.rate) {
                getHighResolutionOutputSizeshNQ4ISI(bArr2, 0);
            } else {
                int i5 = i4 >>> 6;
                int i6 = i4 & 63;
                int i7 = 0;
                for (int i8 = 0; i8 < i5; i8++) {
                    long[] jArr = this.state;
                    jArr[i8] = jArr[i8] ^ org.bouncycastle.util.Pack.littleEndianToLong(this.dataQueue, i7);
                    i7 += 8;
                }
                if (i6 > 0) {
                    long[] jArr2 = this.state;
                    jArr2[i5] = (org.bouncycastle.util.Pack.littleEndianToLong(this.dataQueue, i7) & ((1 << i6) - 1)) ^ jArr2[i5];
                }
            }
            long[] jArr3 = this.state;
            int i9 = (this.rate - 1) >>> 6;
            jArr3[i9] = jArr3[i9] ^ Long.MIN_VALUE;
            this.bitsInQueue = 0;
            this.squeezing = true;
        }
        long j2 = 0;
        if (j % 8 != 0) {
            throw new java.lang.IllegalStateException("outputLength not a multiple of 8");
        }
        while (j2 < j) {
            if (this.bitsInQueue == 0) {
                getHighResolutionOutputSizeshNQ4ISI();
                org.bouncycastle.util.Pack.longToLittleEndian(this.state, 0, this.rate >>> 6, this.dataQueue, 0);
                this.bitsInQueue = this.rate;
            }
            int min = (int) java.lang.Math.min(this.bitsInQueue, j - j2);
            java.lang.System.arraycopy(this.dataQueue, (this.rate - this.bitsInQueue) / 8, bArr, ((int) (j2 / 8)) + i, min / 8);
            this.bitsInQueue -= min;
            j2 += min;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        absorb(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        absorb(b);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        getHighSpeedVideoSizes(this.fixedOutputLength);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 8;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.rate / 8;
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Keccak-");
        sb.append(this.fixedOutputLength);
        return sb.toString();
    }

    protected int doFinal(byte[] bArr, int i, byte b, int i2) {
        if (i2 > 0) {
            absorbBits(b, i2);
        }
        squeeze(bArr, i, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        squeeze(bArr, i, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    protected void absorbBits(int i, int i2) {
        if (i2 <= 0 || i2 > 7) {
            throw new java.lang.IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        int i3 = this.bitsInQueue;
        if (i3 % 8 != 0) {
            throw new java.lang.IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new java.lang.IllegalStateException("attempt to absorb while squeezing");
        }
        this.dataQueue[i3 >>> 3] = (byte) (i & ((1 << i2) - 1));
        this.bitsInQueue = i3 + i2;
    }

    protected void absorb(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = this.bitsInQueue;
        if (i5 % 8 != 0) {
            throw new java.lang.IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new java.lang.IllegalStateException("attempt to absorb while squeezing");
        }
        int i6 = i5 >>> 3;
        int i7 = this.rate >>> 3;
        int i8 = i7 - i6;
        if (i2 < i8) {
            java.lang.System.arraycopy(bArr, i, this.dataQueue, i6, i2);
            i4 = this.bitsInQueue + (i2 << 3);
        } else {
            if (i6 > 0) {
                java.lang.System.arraycopy(bArr, i, this.dataQueue, i6, i8);
                getHighResolutionOutputSizeshNQ4ISI(this.dataQueue, 0);
            } else {
                i8 = 0;
            }
            while (true) {
                i3 = i2 - i8;
                if (i3 < i7) {
                    break;
                }
                getHighResolutionOutputSizeshNQ4ISI(bArr, i + i8);
                i8 += i7;
            }
            java.lang.System.arraycopy(bArr, i + i8, this.dataQueue, 0, i3);
            i4 = i3 << 3;
        }
        this.bitsInQueue = i4;
    }

    protected void absorb(byte b) {
        int i = this.bitsInQueue;
        if (i % 8 != 0) {
            throw new java.lang.IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new java.lang.IllegalStateException("attempt to absorb while squeezing");
        }
        byte[] bArr = this.dataQueue;
        bArr[i >>> 3] = b;
        int i2 = i + 8;
        this.bitsInQueue = i2;
        if (i2 == this.rate) {
            getHighResolutionOutputSizeshNQ4ISI(bArr, 0);
            this.bitsInQueue = 0;
        }
    }

    private void Camera2StreamConfigurationMap(int i) {
        if (i <= 0 || i >= 1600 || i % 64 != 0) {
            throw new java.lang.IllegalStateException("invalid rate value");
        }
        this.rate = i;
        int i2 = 0;
        while (true) {
            long[] jArr = this.state;
            if (i2 >= jArr.length) {
                org.bouncycastle.util.Arrays.fill(this.dataQueue, (byte) 0);
                this.bitsInQueue = 0;
                this.squeezing = false;
                this.fixedOutputLength = (1600 - i) / 2;
                return;
            }
            jArr[i2] = 0;
            i2++;
        }
    }

    private void getHighSpeedVideoSizes(int i) {
        if (i != 128 && i != 224 && i != 256 && i != 288 && i != 384 && i != 512) {
            throw new java.lang.IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        Camera2StreamConfigurationMap(1600 - (i << 1));
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        long[] jArr = this.state;
        int i = 0;
        long j = jArr[0];
        char c = 1;
        long j2 = jArr[1];
        long j3 = jArr[2];
        char c2 = 3;
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        long j15 = jArr[14];
        long j16 = jArr[15];
        long j17 = jArr[16];
        long j18 = jArr[17];
        long j19 = jArr[18];
        long j20 = jArr[19];
        long j21 = jArr[20];
        long j22 = jArr[21];
        long j23 = jArr[22];
        long j24 = jArr[23];
        int i2 = 24;
        long j25 = jArr[24];
        while (i < i2) {
            long j26 = (((j ^ j6) ^ j11) ^ j16) ^ j21;
            long j27 = (((j2 ^ j7) ^ j12) ^ j17) ^ j22;
            long j28 = (((j3 ^ j8) ^ j13) ^ j18) ^ j23;
            long j29 = (((j4 ^ j9) ^ j14) ^ j19) ^ j24;
            long j30 = (((j5 ^ j10) ^ j15) ^ j20) ^ j25;
            long j31 = ((j27 << c) | (j27 >>> (-1))) ^ j30;
            long j32 = ((j28 << c) | (j28 >>> (-1))) ^ j26;
            long j33 = ((j29 << c) | (j29 >>> (-1))) ^ j27;
            long j34 = ((j30 << c) | (j30 >>> (-1))) ^ j28;
            long j35 = ((j26 << c) | (j26 >>> (-1))) ^ j29;
            long j36 = j ^ j31;
            long j37 = j6 ^ j31;
            long j38 = j11 ^ j31;
            long j39 = j16 ^ j31;
            long j40 = j21 ^ j31;
            long j41 = j2 ^ j32;
            long j42 = j7 ^ j32;
            long j43 = j12 ^ j32;
            long j44 = j17 ^ j32;
            long j45 = j22 ^ j32;
            long j46 = j3 ^ j33;
            long j47 = j8 ^ j33;
            long j48 = j13 ^ j33;
            long j49 = j18 ^ j33;
            long j50 = j23 ^ j33;
            long j51 = j4 ^ j34;
            long j52 = j9 ^ j34;
            long j53 = j14 ^ j34;
            long j54 = j19 ^ j34;
            long j55 = j24 ^ j34;
            long j56 = j5 ^ j35;
            long j57 = j10 ^ j35;
            long j58 = j15 ^ j35;
            long j59 = j20 ^ j35;
            long j60 = j25 ^ j35;
            long j61 = (j41 << c) | (j41 >>> 63);
            long j62 = (j42 << 44) | (j42 >>> 20);
            long j63 = (j57 << 20) | (j57 >>> 44);
            long j64 = (j50 << 61) | (j50 >>> c2);
            long j65 = (j58 << 39) | (j58 >>> 25);
            long j66 = (j40 << 18) | (j40 >>> 46);
            long j67 = (j46 << 62) | (j46 >>> 2);
            long j68 = (j48 << 43) | (j48 >>> 21);
            long j69 = (j53 << 25) | (j53 >>> 39);
            long j70 = (j59 << 8) | (j59 >>> 56);
            long j71 = (j55 << 56) | (j55 >>> 8);
            long j72 = (j39 << 41) | (j39 >>> 23);
            long j73 = (j56 << 27) | (j56 >>> 37);
            long j74 = (j60 << 14) | (j60 >>> 50);
            long j75 = (j45 << 2) | (j45 >>> 62);
            long j76 = (j52 << 55) | (j52 >>> 9);
            long j77 = (j44 << 45) | (j44 >>> 19);
            long j78 = (j37 << 36) | (j37 >>> 28);
            long j79 = (j51 << 28) | (j51 >>> 36);
            long j80 = (j54 << 21) | (j54 >>> 43);
            int i3 = i;
            long j81 = (j49 << 15) | (j49 >>> 49);
            long j82 = (j43 << 10) | (j43 >>> 54);
            long j83 = (j47 << 6) | (j47 >>> 58);
            long j84 = (j38 << 3) | (j38 >>> 61);
            long j85 = ((~j68) & j80) ^ j62;
            long j86 = j61 ^ ((~j83) & j69);
            long j87 = ((~j61) & j83) ^ j66;
            long j88 = j72 ^ ((~j75) & j67);
            long j89 = getHighSpeedVideoSizes[i3];
            long j90 = j78 ^ ((~j82) & j81);
            long j91 = ((~j77) & j64) ^ j84;
            long j92 = ((~j65) & j72) ^ j76;
            long j93 = j67 ^ ((~j76) & j65);
            long j94 = j65 ^ ((~j72) & j75);
            long j95 = ((~j79) & j63) ^ j64;
            long j96 = ((~j64) & j79) ^ j77;
            long j97 = ((~j81) & j71) ^ j82;
            long j98 = j70 ^ ((~j66) & j61);
            long j99 = ((~j73) & j78) ^ j71;
            long j100 = ((~j63) & j84) ^ j79;
            long j101 = (j66 & (~j70)) ^ j69;
            long j102 = j63 ^ ((~j84) & j77);
            long j103 = j75 ^ ((~j67) & j76);
            long j104 = (j36 ^ ((~j62) & j68)) ^ j89;
            long j105 = j80 ^ ((~j74) & j36);
            long j106 = ((~j36) & j62) ^ j74;
            long j107 = (j70 & (~j69)) ^ j83;
            long j108 = j81 ^ ((~j71) & j73);
            long j109 = ((~j78) & j82) ^ j73;
            long j110 = j68 ^ (j74 & (~j80));
            j13 = j101;
            j7 = j102;
            j11 = j86;
            j15 = j87;
            j24 = j88;
            j8 = j91;
            j22 = j92;
            j21 = j93;
            j20 = j99;
            j25 = j103;
            j12 = j107;
            j23 = j94;
            j9 = j96;
            c = 1;
            c2 = 3;
            j3 = j110;
            j16 = j109;
            i = i3 + 1;
            j = j104;
            j2 = j85;
            j5 = j106;
            j6 = j100;
            j14 = j98;
            j10 = j95;
            jArr = jArr;
            j17 = j90;
            i2 = 24;
            j19 = j108;
            j4 = j105;
            j18 = j97;
        }
        long[] jArr2 = jArr;
        jArr2[0] = j;
        jArr2[1] = j2;
        jArr2[2] = j3;
        jArr2[3] = j4;
        jArr2[4] = j5;
        jArr2[5] = j6;
        jArr2[6] = j7;
        jArr2[7] = j8;
        jArr2[8] = j9;
        jArr2[9] = j10;
        jArr2[10] = j11;
        jArr2[11] = j12;
        jArr2[12] = j13;
        jArr2[13] = j14;
        jArr2[14] = j15;
        jArr2[15] = j16;
        jArr2[16] = j17;
        jArr2[17] = j18;
        jArr2[18] = j19;
        jArr2[19] = j20;
        jArr2[20] = j21;
        jArr2[21] = j22;
        jArr2[22] = j23;
        jArr2[23] = j24;
        jArr2[24] = j25;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i) {
        int i2 = this.rate;
        for (int i3 = 0; i3 < (i2 >>> 6); i3++) {
            long[] jArr = this.state;
            jArr[i3] = jArr[i3] ^ org.bouncycastle.util.Pack.littleEndianToLong(bArr, i);
            i += 8;
        }
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public KeccakDigest(org.bouncycastle.crypto.digests.KeccakDigest keccakDigest) {
        long[] jArr = new long[25];
        this.state = jArr;
        this.dataQueue = new byte[192];
        long[] jArr2 = keccakDigest.state;
        java.lang.System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        byte[] bArr = keccakDigest.dataQueue;
        java.lang.System.arraycopy(bArr, 0, this.dataQueue, 0, bArr.length);
        this.rate = keccakDigest.rate;
        this.bitsInQueue = keccakDigest.bitsInQueue;
        this.fixedOutputLength = keccakDigest.fixedOutputLength;
        this.squeezing = keccakDigest.squeezing;
    }

    public KeccakDigest(int i) {
        this.state = new long[25];
        this.dataQueue = new byte[192];
        getHighSpeedVideoSizes(i);
    }

    public KeccakDigest() {
        this(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE);
    }
}
