package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public final class Kangaroo {

    static abstract class KangarooBase implements org.bouncycastle.crypto.ExtendedDigest, org.bouncycastle.crypto.Xof {
        private final byte[] getHighSpeedVideoFpsRangesFor = new byte[1];
        private final int getHighSpeedVideoSizesFor;
        private final org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge getInputFormats;
        private boolean getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private byte[] getOutputMinFrameDuration;
        private final org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge getOutputMinFrameDurationlomOqCM;
        private int getOutputSizeshNQ4ISI;
        private static final byte[] getHighSpeedVideoFpsRanges = {7};
        private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {com.google.common.base.Ascii.VT};
        private static final byte[] Camera2StreamConfigurationMap = {-1, -1, 6};
        private static final byte[] getHighSpeedVideoSizes = {3, 0, 0, 0, 0, 0, 0, 0};

        @Override // org.bouncycastle.crypto.Xof
        public int doOutput(byte[] bArr, int i, int i2) {
            if (!this.getInputSizeshNQ4ISI) {
                byte[] bArr2 = this.getOutputMinFrameDuration;
                getHighResolutionOutputSizeshNQ4ISI(bArr2, 0, bArr2.length);
                if (this.getOutputFormats == 0) {
                    org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.getHighSpeedVideoFpsRangesFor(this.getOutputMinFrameDurationlomOqCM, getHighSpeedVideoFpsRanges, 0, 1);
                    this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRangesFor();
                } else {
                    Camera2StreamConfigurationMap(false);
                    byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.getOutputFormats);
                    org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.getHighSpeedVideoFpsRangesFor(this.getOutputMinFrameDurationlomOqCM, Camera2StreamConfigurationMap2, 0, Camera2StreamConfigurationMap2.length);
                    org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge kangarooSponge = this.getOutputMinFrameDurationlomOqCM;
                    byte[] bArr3 = Camera2StreamConfigurationMap;
                    org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.getHighSpeedVideoFpsRangesFor(kangarooSponge, bArr3, 0, bArr3.length);
                    this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRangesFor();
                }
            }
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException("Invalid output length");
            }
            org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.getHighSpeedVideoFpsRanges(this.getOutputMinFrameDurationlomOqCM, bArr, i, i2);
            return i2;
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i, int i2) {
            getHighResolutionOutputSizeshNQ4ISI(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            bArr[0] = b;
            update(bArr, 0, 1);
        }

        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
            org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.Camera2StreamConfigurationMap(this.getOutputMinFrameDurationlomOqCM);
            org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.Camera2StreamConfigurationMap(this.getInputFormats);
            this.getOutputFormats = 0;
            this.getOutputSizeshNQ4ISI = 0;
            this.getInputSizeshNQ4ISI = false;
        }

        public void init(org.bouncycastle.crypto.digests.Kangaroo.KangarooParameters kangarooParameters) {
            getHighSpeedVideoSizes(kangarooParameters.getPersonalisation());
            reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return this.getHighSpeedVideoSizesFor >> 1;
        }

        @Override // org.bouncycastle.crypto.ExtendedDigest
        public int getByteLength() {
            return this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap;
        }

        @Override // org.bouncycastle.crypto.Xof
        public int doFinal(byte[] bArr, int i, int i2) {
            if (this.getInputSizeshNQ4ISI) {
                throw new java.lang.IllegalStateException("Already outputting");
            }
            int doOutput = doOutput(bArr, i, i2);
            reset();
            return doOutput;
        }

        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i) {
            return doFinal(bArr, i, getDigestSize());
        }

        private void Camera2StreamConfigurationMap(boolean z) {
            if (this.getOutputFormats == 0) {
                org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge kangarooSponge = this.getOutputMinFrameDurationlomOqCM;
                byte[] bArr = getHighSpeedVideoSizes;
                org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.getHighSpeedVideoFpsRangesFor(kangarooSponge, bArr, 0, bArr.length);
            } else {
                org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge kangarooSponge2 = this.getInputFormats;
                byte[] bArr2 = getHighResolutionOutputSizeshNQ4ISI;
                org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.getHighSpeedVideoFpsRangesFor(kangarooSponge2, bArr2, 0, bArr2.length);
                int i = this.getHighSpeedVideoSizesFor;
                byte[] bArr3 = new byte[i];
                org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.getHighSpeedVideoFpsRanges(this.getInputFormats, bArr3, 0, i);
                org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.getHighSpeedVideoFpsRangesFor(this.getOutputMinFrameDurationlomOqCM, bArr3, 0, this.getHighSpeedVideoSizesFor);
                org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.Camera2StreamConfigurationMap(this.getInputFormats);
            }
            if (z) {
                this.getOutputFormats++;
            }
            this.getOutputSizeshNQ4ISI = 0;
        }

        private void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2) {
            if (this.getInputSizeshNQ4ISI) {
                throw new java.lang.IllegalStateException("attempt to absorb while squeezing");
            }
            org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge kangarooSponge = this.getOutputFormats == 0 ? this.getOutputMinFrameDurationlomOqCM : this.getInputFormats;
            int i3 = 8192 - this.getOutputSizeshNQ4ISI;
            if (i3 >= i2) {
                org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.getHighSpeedVideoFpsRangesFor(kangarooSponge, bArr, i, i2);
                this.getOutputSizeshNQ4ISI += i2;
                return;
            }
            if (i3 > 0) {
                org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.getHighSpeedVideoFpsRangesFor(kangarooSponge, bArr, i, i3);
                this.getOutputSizeshNQ4ISI += i3;
            }
            while (i3 < i2) {
                if (this.getOutputSizeshNQ4ISI == 8192) {
                    Camera2StreamConfigurationMap(true);
                }
                int min = java.lang.Math.min(i2 - i3, 8192);
                org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge.getHighSpeedVideoFpsRangesFor(this.getInputFormats, bArr, i + i3, min);
                this.getOutputSizeshNQ4ISI += min;
                i3 += min;
            }
        }

        private static byte[] Camera2StreamConfigurationMap(long j) {
            byte b;
            if (j != 0) {
                long j2 = j;
                b = 1;
                while (true) {
                    j2 >>= 8;
                    if (j2 == 0) {
                        break;
                    }
                    b = (byte) (b + 1);
                }
            } else {
                b = 0;
            }
            byte[] bArr = new byte[b + 1];
            bArr[b] = b;
            for (int i = 0; i < b; i++) {
                bArr[i] = (byte) (j >> (((b - i) - 1) * 8));
            }
            return bArr;
        }

        private void getHighSpeedVideoSizes(byte[] bArr) {
            int length = bArr == null ? 0 : bArr.length;
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(length);
            byte[] copyOf = bArr == null ? new byte[Camera2StreamConfigurationMap2.length + length] : org.bouncycastle.util.Arrays.copyOf(bArr, Camera2StreamConfigurationMap2.length + length);
            this.getOutputMinFrameDuration = copyOf;
            java.lang.System.arraycopy(Camera2StreamConfigurationMap2, 0, copyOf, length, Camera2StreamConfigurationMap2.length);
        }

        KangarooBase(int i, int i2) {
            this.getOutputMinFrameDurationlomOqCM = new org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge(i, i2);
            this.getInputFormats = new org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge(i, i2);
            this.getHighSpeedVideoSizesFor = i >> 2;
            getHighSpeedVideoSizes(null);
        }
    }

    static class KangarooSponge {
        private static long[] getHighResolutionOutputSizeshNQ4ISI = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
        private final int Camera2StreamConfigurationMap;
        private boolean getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private final byte[] getHighSpeedVideoSizes;
        private final long[] getHighSpeedVideoSizesFor;
        private final int getOutputMinFrameDuration;

        KangarooSponge(int i, int i2) {
            long[] jArr = new long[25];
            this.getHighSpeedVideoSizesFor = jArr;
            int i3 = (1600 - (i << 1)) >> 3;
            this.Camera2StreamConfigurationMap = i3;
            this.getOutputMinFrameDuration = i2;
            byte[] bArr = new byte[i3];
            this.getHighSpeedVideoSizes = bArr;
            org.bouncycastle.util.Arrays.fill(jArr, 0L);
            org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighSpeedVideoFpsRanges = false;
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge kangarooSponge, byte[] bArr, int i, int i2) {
            if (!kangarooSponge.getHighSpeedVideoFpsRanges) {
                kangarooSponge.getHighSpeedVideoFpsRangesFor();
            }
            int i3 = 0;
            while (i3 < i2) {
                if (kangarooSponge.getHighSpeedVideoFpsRangesFor == 0) {
                    kangarooSponge.Camera2StreamConfigurationMap();
                    org.bouncycastle.util.Pack.longToLittleEndian(kangarooSponge.getHighSpeedVideoSizesFor, 0, kangarooSponge.Camera2StreamConfigurationMap >> 3, kangarooSponge.getHighSpeedVideoSizes, 0);
                    kangarooSponge.getHighSpeedVideoFpsRangesFor = kangarooSponge.Camera2StreamConfigurationMap;
                }
                int min = java.lang.Math.min(kangarooSponge.getHighSpeedVideoFpsRangesFor, i2 - i3);
                java.lang.System.arraycopy(kangarooSponge.getHighSpeedVideoSizes, kangarooSponge.Camera2StreamConfigurationMap - kangarooSponge.getHighSpeedVideoFpsRangesFor, bArr, i + i3, min);
                kangarooSponge.getHighSpeedVideoFpsRangesFor -= min;
                i3 += min;
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge kangarooSponge, byte[] bArr, int i, int i2) {
            int i3;
            if (kangarooSponge.getHighSpeedVideoFpsRanges) {
                throw new java.lang.IllegalStateException("attempt to absorb while squeezing");
            }
            int i4 = 0;
            while (i4 < i2) {
                int i5 = kangarooSponge.getHighSpeedVideoFpsRangesFor;
                if (i5 != 0 || i4 > i2 - kangarooSponge.Camera2StreamConfigurationMap) {
                    int min = java.lang.Math.min(kangarooSponge.Camera2StreamConfigurationMap - i5, i2 - i4);
                    java.lang.System.arraycopy(bArr, i + i4, kangarooSponge.getHighSpeedVideoSizes, kangarooSponge.getHighSpeedVideoFpsRangesFor, min);
                    int i6 = kangarooSponge.getHighSpeedVideoFpsRangesFor + min;
                    kangarooSponge.getHighSpeedVideoFpsRangesFor = i6;
                    i4 += min;
                    if (i6 == kangarooSponge.Camera2StreamConfigurationMap) {
                        kangarooSponge.getHighSpeedVideoFpsRangesFor(kangarooSponge.getHighSpeedVideoSizes, 0);
                        kangarooSponge.getHighSpeedVideoFpsRangesFor = 0;
                    }
                } else {
                    do {
                        kangarooSponge.getHighSpeedVideoFpsRangesFor(bArr, i + i4);
                        i3 = kangarooSponge.Camera2StreamConfigurationMap;
                        i4 += i3;
                    } while (i4 <= i2 - i3);
                }
            }
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge kangarooSponge) {
            org.bouncycastle.util.Arrays.fill(kangarooSponge.getHighSpeedVideoSizesFor, 0L);
            org.bouncycastle.util.Arrays.fill(kangarooSponge.getHighSpeedVideoSizes, (byte) 0);
            kangarooSponge.getHighSpeedVideoFpsRangesFor = 0;
            kangarooSponge.getHighSpeedVideoFpsRanges = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void getHighSpeedVideoFpsRangesFor() {
            int i = this.getHighSpeedVideoFpsRangesFor;
            while (true) {
                int i2 = this.Camera2StreamConfigurationMap;
                if (i >= i2) {
                    byte[] bArr = this.getHighSpeedVideoSizes;
                    int i3 = i2 - 1;
                    bArr[i3] = (byte) (bArr[i3] ^ 128);
                    getHighSpeedVideoFpsRangesFor(bArr, 0);
                    org.bouncycastle.util.Pack.longToLittleEndian(this.getHighSpeedVideoSizesFor, 0, this.Camera2StreamConfigurationMap >> 3, this.getHighSpeedVideoSizes, 0);
                    this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap;
                    this.getHighSpeedVideoFpsRanges = true;
                    return;
                }
                this.getHighSpeedVideoSizes[i] = 0;
                i++;
            }
        }

        private void Camera2StreamConfigurationMap() {
            org.bouncycastle.crypto.digests.Kangaroo.KangarooSponge kangarooSponge = this;
            long[] jArr = kangarooSponge.getHighSpeedVideoSizesFor;
            long j = jArr[0];
            char c = 1;
            long j2 = jArr[1];
            long j3 = jArr[2];
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
            long j25 = jArr[24];
            int length = getHighResolutionOutputSizeshNQ4ISI.length - kangarooSponge.getOutputMinFrameDuration;
            int i = 0;
            while (i < kangarooSponge.getOutputMinFrameDuration) {
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
                long j64 = (j50 << 61) | (j50 >>> 3);
                long j65 = (j58 << 39) | (j58 >>> 25);
                long j66 = (j40 << 18) | (j40 >>> 46);
                long j67 = (j46 << 62) | (j46 >>> 2);
                long j68 = (j48 << 43) | (j48 >>> 21);
                int i2 = i;
                long j69 = (j53 << 25) | (j53 >>> 39);
                long j70 = (j59 << 8) | (j59 >>> 56);
                long j71 = (j55 << 56) | (j55 >>> 8);
                long j72 = (j39 << 41) | (j39 >>> 23);
                int i3 = length;
                long j73 = (j56 << 27) | (j56 >>> 37);
                long j74 = (j60 << 14) | (j60 >>> 50);
                long j75 = (j45 << 2) | (j45 >>> 62);
                long j76 = (j52 << 55) | (j52 >>> 9);
                long j77 = (j44 << 45) | (j44 >>> 19);
                long j78 = (j37 << 36) | (j37 >>> 28);
                long j79 = (j51 << 28) | (j51 >>> 36);
                long j80 = (j54 << 21) | (j54 >>> 43);
                long j81 = (j49 << 15) | (j49 >>> 49);
                long j82 = (j43 << 10) | (j43 >>> 54);
                long j83 = (j47 << 6) | (j47 >>> 58);
                long j84 = (j38 << 3) | (j38 >>> 61);
                long j85 = ((~j64) & j79) ^ j77;
                long j86 = j61 ^ ((~j83) & j69);
                long j87 = j70 ^ ((~j66) & j61);
                long j88 = j72 ^ ((~j75) & j67);
                long j89 = ((~j67) & j76) ^ j75;
                long j90 = (((~j62) & j68) ^ j36) ^ getHighResolutionOutputSizeshNQ4ISI[i3 + i2];
                long j91 = ((~j70) & j66) ^ j69;
                long j92 = ((~j77) & j64) ^ j84;
                long j93 = (j77 & (~j84)) ^ j63;
                long j94 = j71 ^ ((~j73) & j78);
                long j95 = ((~j82) & j81) ^ j78;
                long j96 = ((~j69) & j70) ^ j83;
                long j97 = j81 ^ ((~j71) & j73);
                long j98 = ((~j61) & j83) ^ j66;
                long j99 = ((~j76) & j65) ^ j67;
                long j100 = ((~j65) & j72) ^ j76;
                long j101 = j65 ^ ((~j72) & j75);
                long j102 = j64 ^ ((~j79) & j63);
                long j103 = ((~j36) & j62) ^ j74;
                long j104 = ((~j81) & j71) ^ j82;
                long j105 = (j82 & (~j78)) ^ j73;
                long j106 = j80 ^ (j36 & (~j74));
                long j107 = j79 ^ ((~j63) & j84);
                long j108 = j68 ^ ((~j80) & j74);
                j23 = j101;
                j2 = ((~j68) & j80) ^ j62;
                j6 = j107;
                j18 = j104;
                j15 = j98;
                j22 = j100;
                j12 = j96;
                j10 = j102;
                j5 = j103;
                j14 = j87;
                j25 = j89;
                j8 = j92;
                j20 = j94;
                j19 = j97;
                j4 = j106;
                j16 = j105;
                j17 = j95;
                i = i2 + 1;
                j9 = j85;
                j7 = j93;
                length = i3;
                j = j90;
                c = 1;
                j3 = j108;
                j21 = j99;
                jArr = jArr;
                kangarooSponge = this;
                j13 = j91;
                j11 = j86;
                j24 = j88;
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

        private void getHighSpeedVideoFpsRangesFor(byte[] bArr, int i) {
            int i2 = this.Camera2StreamConfigurationMap;
            for (int i3 = 0; i3 < (i2 >> 3); i3++) {
                long[] jArr = this.getHighSpeedVideoSizesFor;
                jArr[i3] = jArr[i3] ^ org.bouncycastle.util.Pack.littleEndianToLong(bArr, i);
                i += 8;
            }
            Camera2StreamConfigurationMap();
        }
    }

    public static class KangarooTwelve extends org.bouncycastle.crypto.digests.Kangaroo.KangarooBase {
        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte[] bArr, int i, int i2) {
            super.update(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte b) {
            super.update(b);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase
        public /* bridge */ /* synthetic */ void init(org.bouncycastle.crypto.digests.Kangaroo.KangarooParameters kangarooParameters) {
            super.init(kangarooParameters);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int getDigestSize() {
            return super.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.ExtendedDigest
        public /* bridge */ /* synthetic */ int getByteLength() {
            return super.getByteLength();
        }

        @Override // org.bouncycastle.crypto.Digest
        public java.lang.String getAlgorithmName() {
            return "KangarooTwelve";
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i, int i2) {
            return super.doOutput(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i, int i2) {
            return super.doFinal(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
            return super.doFinal(bArr, i);
        }

        public KangarooTwelve(int i) {
            super(128, 12);
        }

        public KangarooTwelve() {
            this(32);
        }
    }

    public static class MarsupilamiFourteen extends org.bouncycastle.crypto.digests.Kangaroo.KangarooBase {
        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte[] bArr, int i, int i2) {
            super.update(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte b) {
            super.update(b);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase
        public /* bridge */ /* synthetic */ void init(org.bouncycastle.crypto.digests.Kangaroo.KangarooParameters kangarooParameters) {
            super.init(kangarooParameters);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int getDigestSize() {
            return super.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.ExtendedDigest
        public /* bridge */ /* synthetic */ int getByteLength() {
            return super.getByteLength();
        }

        @Override // org.bouncycastle.crypto.Digest
        public java.lang.String getAlgorithmName() {
            return "MarsupilamiFourteen";
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i, int i2) {
            return super.doOutput(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i, int i2) {
            return super.doFinal(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
            return super.doFinal(bArr, i);
        }

        public MarsupilamiFourteen(int i) {
            super(256, 14);
        }

        public MarsupilamiFourteen() {
            this(32);
        }
    }

    public static class KangarooParameters implements org.bouncycastle.crypto.CipherParameters {
        private byte[] getHighSpeedVideoSizes;

        public static class Builder {
            private byte[] getHighSpeedVideoSizes;

            public org.bouncycastle.crypto.digests.Kangaroo.KangarooParameters.Builder setPersonalisation(byte[] bArr) {
                this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr);
                return this;
            }

            public org.bouncycastle.crypto.digests.Kangaroo.KangarooParameters build() {
                org.bouncycastle.crypto.digests.Kangaroo.KangarooParameters kangarooParameters = new org.bouncycastle.crypto.digests.Kangaroo.KangarooParameters();
                byte[] bArr = this.getHighSpeedVideoSizes;
                if (bArr != null) {
                    kangarooParameters.getHighSpeedVideoSizes = bArr;
                }
                return kangarooParameters;
            }
        }

        public byte[] getPersonalisation() {
            return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
        }
    }
}
