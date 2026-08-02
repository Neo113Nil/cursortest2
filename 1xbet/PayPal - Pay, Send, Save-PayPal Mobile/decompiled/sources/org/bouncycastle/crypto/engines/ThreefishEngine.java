package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class ThreefishEngine implements org.bouncycastle.crypto.BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher getInputSizeshNQ4ISI;
    private long[] getOutputFormats;
    private long[] getOutputMinFrameDuration;
    private long[] getOutputStallDuration;
    private static int[] Camera2StreamConfigurationMap = new int[80];
    private static int[] getHighResolutionOutputSizeshNQ4ISI = new int[80];
    private static int[] getHighSpeedVideoSizes = new int[80];
    private static int[] getHighSpeedVideoFpsRangesFor = new int[80];

    static long getHighResolutionOutputSizeshNQ4ISI(long j, int i, long j2) {
        long j3 = j ^ j2;
        return (j3 >>> i) | (j3 << (-i));
    }

    static long getHighSpeedVideoFpsRangesFor(long j, int i, long j2) {
        return ((j << i) | (j >>> (-i))) ^ j2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public void init(boolean z, long[] jArr, long[] jArr2) {
        int i;
        this.getInputFormats = z;
        if (jArr != null) {
            if (jArr.length != this.getHighSpeedVideoSizesFor) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Threefish key must be same size as block (");
                sb.append(this.getHighSpeedVideoSizesFor);
                sb.append(" words)");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            long j = 2004413935125273122L;
            int i2 = 0;
            while (true) {
                i = this.getHighSpeedVideoSizesFor;
                if (i2 >= i) {
                    break;
                }
                long[] jArr3 = this.getOutputFormats;
                long j2 = jArr[i2];
                jArr3[i2] = j2;
                j ^= j2;
                i2++;
            }
            long[] jArr4 = this.getOutputFormats;
            jArr4[i] = j;
            java.lang.System.arraycopy(jArr4, 0, jArr4, i + 1, i);
        }
        if (jArr2 != null) {
            if (jArr2.length != 2) {
                throw new java.lang.IllegalArgumentException("Tweak must be 2 words.");
            }
            long[] jArr5 = this.getOutputStallDuration;
            long j3 = jArr2[0];
            jArr5[0] = j3;
            long j4 = jArr2[1];
            jArr5[1] = j4;
            jArr5[2] = j3 ^ j4;
            jArr5[3] = j3;
            jArr5[4] = j4;
        }
    }

    public int processBlock(long[] jArr, long[] jArr2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        long[] jArr3 = this.getOutputFormats;
        int i = this.getHighSpeedVideoSizesFor;
        if (jArr3[i] == 0) {
            throw new java.lang.IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i) {
            throw new org.bouncycastle.crypto.DataLengthException("Input buffer too short");
        }
        if (jArr2.length != i) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
        }
        if (this.getInputFormats) {
            this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(jArr, jArr2);
        } else {
            this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(jArr, jArr2);
        }
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        int i3 = this.getHighSpeedVideoFpsRanges;
        if (i + i3 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("Input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.getHighSpeedVideoFpsRanges; i5 += 8) {
            this.getOutputMinFrameDuration[i5 >> 3] = bytesToWord(bArr, i + i5);
        }
        long[] jArr = this.getOutputMinFrameDuration;
        processBlock(jArr, jArr);
        while (true) {
            int i6 = this.getHighSpeedVideoFpsRanges;
            if (i4 >= i6) {
                return i6;
            }
            wordToBytes(this.getOutputMinFrameDuration[i4 >> 3], bArr2, i2 + i4);
            i4 += 8;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        byte[] key;
        byte[] bArr;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.TweakableBlockCipherParameters) {
            org.bouncycastle.crypto.params.TweakableBlockCipherParameters tweakableBlockCipherParameters = (org.bouncycastle.crypto.params.TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            bArr = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid parameter passed to Threefish init - ");
                sb.append(cipherParameters.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
            bArr = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.getHighSpeedVideoFpsRanges) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Threefish key must be same size as block (");
                sb2.append(this.getHighSpeedVideoFpsRanges);
                sb2.append(" bytes)");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            int i = this.getHighSpeedVideoSizesFor;
            jArr = new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr[i2] = bytesToWord(key, i2 * 8);
            }
        }
        if (bArr != null) {
            if (bArr.length != 16) {
                throw new java.lang.IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[]{bytesToWord(bArr, 0), bytesToWord(bArr, 8)};
        }
        init(z, jArr, jArr2);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Threefish-");
        sb.append(this.getHighSpeedVideoFpsRanges * 8);
        return sb.toString();
    }

    public static void wordToBytes(long j, byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            throw new java.lang.IllegalArgumentException();
        }
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    public static long bytesToWord(byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            throw new java.lang.IllegalArgumentException();
        }
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    static final class Threefish1024Cipher extends org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher {
        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        final void getHighSpeedVideoFpsRanges(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.getHighSpeedVideoFpsRanges;
            long[] jArr4 = this.getHighSpeedVideoFpsRangesFor;
            int[] iArr = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI;
            int[] iArr2 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor;
            if (jArr3.length != 33) {
                throw new java.lang.IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new java.lang.IllegalArgumentException();
            }
            long j = jArr[0];
            int i = 1;
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
            long j17 = jArr3[0];
            long j18 = j2 + jArr3[1];
            long j19 = j3 + jArr3[2];
            long j20 = jArr3[3];
            long j21 = jArr3[4];
            long j22 = jArr3[5];
            long j23 = j7 + jArr3[6];
            long j24 = jArr3[7];
            long j25 = j9 + jArr3[8];
            long j26 = jArr3[9];
            long j27 = j11 + jArr3[10];
            long j28 = jArr3[11];
            long j29 = j13 + jArr3[12];
            long j30 = jArr3[13];
            long j31 = jArr4[0];
            long j32 = j15 + jArr3[14] + jArr4[1];
            long j33 = j5 + j21;
            long j34 = j + j17;
            long j35 = j4 + j20;
            long j36 = j6 + j22;
            long j37 = j8 + j24;
            long j38 = j10 + j26;
            long j39 = j12 + j28;
            long j40 = j14 + j30 + j31;
            long j41 = j16 + jArr3[15];
            while (i < 20) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j42 = j34 + j18;
                long highSpeedVideoFpsRangesFor = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j18, 24, j42);
                long j43 = j19 + j35;
                long highSpeedVideoFpsRangesFor2 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j35, 13, j43);
                long[] jArr5 = jArr3;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j44 = j36;
                long j45 = j33 + j44;
                long highSpeedVideoFpsRangesFor3 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j44, 8, j45);
                int i4 = i;
                long j46 = j37;
                long j47 = j23 + j46;
                long highSpeedVideoFpsRangesFor4 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j46, 47, j47);
                long[] jArr6 = jArr4;
                long j48 = j38;
                long j49 = j25 + j48;
                long highSpeedVideoFpsRangesFor5 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j48, 8, j49);
                long j50 = j39;
                long j51 = j27 + j50;
                long highSpeedVideoFpsRangesFor6 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j50, 17, j51);
                long j52 = j40;
                long j53 = j29 + j52;
                long highSpeedVideoFpsRangesFor7 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j52, 22, j53);
                long j54 = j41;
                long j55 = j32 + j54;
                long highSpeedVideoFpsRangesFor8 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j54, 37, j55);
                long j56 = j42 + highSpeedVideoFpsRangesFor5;
                long highSpeedVideoFpsRangesFor9 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor5, 38, j56);
                long j57 = j43 + highSpeedVideoFpsRangesFor7;
                long highSpeedVideoFpsRangesFor10 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor7, 19, j57);
                long j58 = j47 + highSpeedVideoFpsRangesFor6;
                long highSpeedVideoFpsRangesFor11 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor6, 10, j58);
                long j59 = j45 + highSpeedVideoFpsRangesFor8;
                long highSpeedVideoFpsRangesFor12 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor8, 55, j59);
                long j60 = j51 + highSpeedVideoFpsRangesFor4;
                long highSpeedVideoFpsRangesFor13 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor4, 49, j60);
                long j61 = j53 + highSpeedVideoFpsRangesFor2;
                long highSpeedVideoFpsRangesFor14 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor2, 18, j61);
                long j62 = j55 + highSpeedVideoFpsRangesFor3;
                long highSpeedVideoFpsRangesFor15 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor3, 23, j62);
                long j63 = j49 + highSpeedVideoFpsRangesFor;
                long highSpeedVideoFpsRangesFor16 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, 52, j63);
                long j64 = j56 + highSpeedVideoFpsRangesFor13;
                long highSpeedVideoFpsRangesFor17 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor13, 33, j64);
                long j65 = j57 + highSpeedVideoFpsRangesFor15;
                long highSpeedVideoFpsRangesFor18 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor15, 4, j65);
                long j66 = j59 + highSpeedVideoFpsRangesFor14;
                long highSpeedVideoFpsRangesFor19 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor14, 51, j66);
                long j67 = j58 + highSpeedVideoFpsRangesFor16;
                long highSpeedVideoFpsRangesFor20 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor16, 13, j67);
                long j68 = j61 + highSpeedVideoFpsRangesFor12;
                long highSpeedVideoFpsRangesFor21 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor12, 34, j68);
                long j69 = j62 + highSpeedVideoFpsRangesFor10;
                long highSpeedVideoFpsRangesFor22 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor10, 41, j69);
                long j70 = j63 + highSpeedVideoFpsRangesFor11;
                long highSpeedVideoFpsRangesFor23 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor11, 59, j70);
                long j71 = j60 + highSpeedVideoFpsRangesFor9;
                long highSpeedVideoFpsRangesFor24 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor9, 17, j71);
                long j72 = j64 + highSpeedVideoFpsRangesFor21;
                long highSpeedVideoFpsRangesFor25 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor21, 5, j72);
                long j73 = j65 + highSpeedVideoFpsRangesFor23;
                long highSpeedVideoFpsRangesFor26 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor23, 20, j73);
                long j74 = j67 + highSpeedVideoFpsRangesFor22;
                long highSpeedVideoFpsRangesFor27 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor22, 48, j74);
                long j75 = j66 + highSpeedVideoFpsRangesFor24;
                long highSpeedVideoFpsRangesFor28 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor24, 41, j75);
                long j76 = j69 + highSpeedVideoFpsRangesFor20;
                long highSpeedVideoFpsRangesFor29 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor20, 47, j76);
                long j77 = j70 + highSpeedVideoFpsRangesFor18;
                long highSpeedVideoFpsRangesFor30 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor18, 28, j77);
                long j78 = j71 + highSpeedVideoFpsRangesFor19;
                long highSpeedVideoFpsRangesFor31 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor19, 16, j78);
                long j79 = j68 + highSpeedVideoFpsRangesFor17;
                long highSpeedVideoFpsRangesFor32 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor17, 25, j79);
                long j80 = jArr5[i2];
                int i5 = i2 + 1;
                long j81 = highSpeedVideoFpsRangesFor29 + jArr5[i5];
                int i6 = i2 + 2;
                long j82 = jArr5[i6];
                int i7 = i2 + 3;
                long j83 = highSpeedVideoFpsRangesFor31 + jArr5[i7];
                int i8 = i2 + 4;
                long j84 = jArr5[i8];
                int i9 = i2 + 5;
                long j85 = highSpeedVideoFpsRangesFor30 + jArr5[i9];
                int i10 = i2 + 6;
                long j86 = jArr5[i10];
                int i11 = i2 + 7;
                long j87 = highSpeedVideoFpsRangesFor32 + jArr5[i11];
                int i12 = i2 + 8;
                long j88 = jArr5[i12];
                int i13 = i2 + 9;
                long j89 = highSpeedVideoFpsRangesFor28 + jArr5[i13];
                int i14 = i2 + 10;
                long j90 = jArr5[i14];
                int i15 = i2 + 11;
                long j91 = highSpeedVideoFpsRangesFor26 + jArr5[i15];
                int i16 = i2 + 12;
                long j92 = jArr5[i16];
                int i17 = i2 + 13;
                long j93 = highSpeedVideoFpsRangesFor27 + jArr5[i17] + jArr6[i3];
                int i18 = i2 + 14;
                long j94 = jArr5[i18];
                int i19 = i3 + 1;
                long j95 = jArr6[i19];
                int i20 = i2 + 15;
                long j96 = i4;
                long j97 = highSpeedVideoFpsRangesFor25 + jArr5[i20] + j96;
                long j98 = j72 + j80 + j81;
                long highSpeedVideoFpsRangesFor33 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j81, 41, j98);
                long j99 = j73 + j82 + j83;
                long highSpeedVideoFpsRangesFor34 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j83, 9, j99);
                long j100 = j75 + j84 + j85;
                long highSpeedVideoFpsRangesFor35 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j85, 37, j100);
                long j101 = j74 + j86 + j87;
                long highSpeedVideoFpsRangesFor36 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j87, 31, j101);
                long j102 = j77 + j88 + j89;
                long highSpeedVideoFpsRangesFor37 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j89, 12, j102);
                long j103 = j78 + j90 + j91;
                long highSpeedVideoFpsRangesFor38 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j91, 47, j103);
                long j104 = j79 + j92 + j93;
                long highSpeedVideoFpsRangesFor39 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j93, 44, j104);
                long j105 = j76 + j94 + j95 + j97;
                long highSpeedVideoFpsRangesFor40 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j97, 30, j105);
                long j106 = j98 + highSpeedVideoFpsRangesFor37;
                long highSpeedVideoFpsRangesFor41 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor37, 16, j106);
                long j107 = j99 + highSpeedVideoFpsRangesFor39;
                long highSpeedVideoFpsRangesFor42 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor39, 34, j107);
                long j108 = j101 + highSpeedVideoFpsRangesFor38;
                long highSpeedVideoFpsRangesFor43 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor38, 56, j108);
                long j109 = j100 + highSpeedVideoFpsRangesFor40;
                long highSpeedVideoFpsRangesFor44 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor40, 51, j109);
                long j110 = j103 + highSpeedVideoFpsRangesFor36;
                long highSpeedVideoFpsRangesFor45 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor36, 4, j110);
                long j111 = j104 + highSpeedVideoFpsRangesFor34;
                long highSpeedVideoFpsRangesFor46 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor34, 53, j111);
                long j112 = j105 + highSpeedVideoFpsRangesFor35;
                long highSpeedVideoFpsRangesFor47 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor35, 42, j112);
                long j113 = j102 + highSpeedVideoFpsRangesFor33;
                long highSpeedVideoFpsRangesFor48 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor33, 41, j113);
                long j114 = j106 + highSpeedVideoFpsRangesFor45;
                long highSpeedVideoFpsRangesFor49 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor45, 31, j114);
                long j115 = j107 + highSpeedVideoFpsRangesFor47;
                long highSpeedVideoFpsRangesFor50 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor47, 44, j115);
                long j116 = j109 + highSpeedVideoFpsRangesFor46;
                long highSpeedVideoFpsRangesFor51 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor46, 47, j116);
                long j117 = j108 + highSpeedVideoFpsRangesFor48;
                long highSpeedVideoFpsRangesFor52 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor48, 46, j117);
                long j118 = j111 + highSpeedVideoFpsRangesFor44;
                long highSpeedVideoFpsRangesFor53 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor44, 19, j118);
                long j119 = j112 + highSpeedVideoFpsRangesFor42;
                long highSpeedVideoFpsRangesFor54 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor42, 42, j119);
                long j120 = j113 + highSpeedVideoFpsRangesFor43;
                long highSpeedVideoFpsRangesFor55 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor43, 44, j120);
                long j121 = j110 + highSpeedVideoFpsRangesFor41;
                long highSpeedVideoFpsRangesFor56 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor41, 25, j121);
                long j122 = j114 + highSpeedVideoFpsRangesFor53;
                long highSpeedVideoFpsRangesFor57 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor53, 9, j122);
                long j123 = j115 + highSpeedVideoFpsRangesFor55;
                long highSpeedVideoFpsRangesFor58 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor55, 48, j123);
                long j124 = j117 + highSpeedVideoFpsRangesFor54;
                long highSpeedVideoFpsRangesFor59 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor54, 35, j124);
                long j125 = j116 + highSpeedVideoFpsRangesFor56;
                long highSpeedVideoFpsRangesFor60 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor56, 52, j125);
                long j126 = j119 + highSpeedVideoFpsRangesFor52;
                long highSpeedVideoFpsRangesFor61 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor52, 23, j126);
                long j127 = j120 + highSpeedVideoFpsRangesFor50;
                long highSpeedVideoFpsRangesFor62 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor50, 31, j127);
                long j128 = j121 + highSpeedVideoFpsRangesFor51;
                long highSpeedVideoFpsRangesFor63 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor51, 37, j128);
                long j129 = j118 + highSpeedVideoFpsRangesFor49;
                long highSpeedVideoFpsRangesFor64 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor49, 20, j129);
                long j130 = jArr5[i5];
                long j131 = jArr5[i6];
                long j132 = jArr5[i7];
                long j133 = jArr5[i8];
                long j134 = jArr5[i9];
                long j135 = jArr5[i10];
                long j136 = jArr5[i11];
                long j137 = jArr5[i12];
                long j138 = jArr5[i13];
                long j139 = highSpeedVideoFpsRangesFor60 + jArr5[i14];
                long j140 = jArr5[i15];
                long j141 = jArr5[i16];
                long j142 = j129 + jArr5[i17];
                long j143 = highSpeedVideoFpsRangesFor59 + jArr5[i18] + jArr6[i19];
                long j144 = jArr5[i20];
                long j145 = jArr6[i3 + 2];
                long j146 = highSpeedVideoFpsRangesFor57 + jArr5[i2 + 16] + j96 + 1;
                j23 = j124 + j136;
                long j147 = j125 + j134;
                long j148 = highSpeedVideoFpsRangesFor63 + j133;
                long j149 = j128 + j140;
                j39 = highSpeedVideoFpsRangesFor58 + j141;
                j36 = highSpeedVideoFpsRangesFor62 + j135;
                j37 = highSpeedVideoFpsRangesFor64 + j137;
                j32 = j126 + j144 + j145;
                j40 = j143;
                j41 = j146;
                j38 = j139;
                j33 = j147;
                j27 = j149;
                i = i4 + 2;
                jArr3 = jArr5;
                j34 = j130 + j122;
                j25 = j127 + j138;
                j18 = highSpeedVideoFpsRangesFor61 + j131;
                j19 = j123 + j132;
                iArr = iArr3;
                jArr4 = jArr6;
                iArr2 = iArr4;
                j35 = j148;
                j29 = j142;
            }
            jArr2[0] = j34;
            jArr2[1] = j18;
            jArr2[2] = j19;
            jArr2[3] = j35;
            jArr2[4] = j33;
            jArr2[5] = j36;
            jArr2[6] = j23;
            jArr2[7] = j37;
            jArr2[8] = j25;
            jArr2[9] = j38;
            jArr2[10] = j27;
            jArr2[11] = j39;
            jArr2[12] = j29;
            jArr2[13] = j40;
            jArr2[14] = j32;
            jArr2[15] = j41;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        final void getHighResolutionOutputSizeshNQ4ISI(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.getHighSpeedVideoFpsRanges;
            long[] jArr4 = this.getHighSpeedVideoFpsRangesFor;
            int[] iArr = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI;
            int[] iArr2 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor;
            if (jArr3.length != 33) {
                throw new java.lang.IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new java.lang.IllegalArgumentException();
            }
            long j = jArr[0];
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
            int i = 19;
            while (i > 0) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                int i4 = i2 + 1;
                long j17 = j - jArr3[i4];
                int i5 = i2 + 2;
                long j18 = jArr3[i5];
                int i6 = i2 + 3;
                long j19 = j3 - jArr3[i6];
                int i7 = i2 + 4;
                long j20 = jArr3[i7];
                int i8 = i2 + 5;
                long j21 = j5 - jArr3[i8];
                int i9 = i2 + 6;
                long j22 = jArr3[i9];
                int i10 = i2 + 7;
                long j23 = j7 - jArr3[i10];
                int i11 = i2 + 8;
                long j24 = jArr3[i11];
                int i12 = i2 + 9;
                int i13 = i;
                long j25 = j9 - jArr3[i12];
                int i14 = i2 + 10;
                long j26 = jArr3[i14];
                int i15 = i2 + 11;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j27 = j11 - jArr3[i15];
                int i16 = i2 + 12;
                long j28 = jArr3[i16];
                int i17 = i2 + 13;
                long j29 = j13 - jArr3[i17];
                int i18 = i2 + 14;
                long j30 = jArr3[i18];
                int i19 = i3 + 1;
                long j31 = jArr4[i19];
                int i20 = i2 + 15;
                long j32 = j15 - (jArr3[i20] + jArr4[i3 + 2]);
                long j33 = jArr3[i2 + 16];
                long[] jArr5 = jArr4;
                long[] jArr6 = jArr3;
                long j34 = i13;
                long highResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j16 - ((j33 + j34) + 1), 9, j17);
                long j35 = j17 - highResolutionOutputSizeshNQ4ISI;
                long highResolutionOutputSizeshNQ4ISI2 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j12 - j28, 48, j19);
                long j36 = j19 - highResolutionOutputSizeshNQ4ISI2;
                long highResolutionOutputSizeshNQ4ISI3 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j14 - (j30 + j31), 35, j23);
                long j37 = j23 - highResolutionOutputSizeshNQ4ISI3;
                long highResolutionOutputSizeshNQ4ISI4 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j10 - j26, 52, j21);
                long j38 = j21 - highResolutionOutputSizeshNQ4ISI4;
                long highResolutionOutputSizeshNQ4ISI5 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j2 - j18, 23, j32);
                long j39 = j32 - highResolutionOutputSizeshNQ4ISI5;
                long highResolutionOutputSizeshNQ4ISI6 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j6 - j22, 31, j25);
                long j40 = j25 - highResolutionOutputSizeshNQ4ISI6;
                long highResolutionOutputSizeshNQ4ISI7 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j4 - j20, 37, j27);
                long j41 = j27 - highResolutionOutputSizeshNQ4ISI7;
                long highResolutionOutputSizeshNQ4ISI8 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j8 - j24, 20, j29);
                long j42 = j29 - highResolutionOutputSizeshNQ4ISI8;
                long highResolutionOutputSizeshNQ4ISI9 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI8, 31, j35);
                long j43 = j35 - highResolutionOutputSizeshNQ4ISI9;
                long highResolutionOutputSizeshNQ4ISI10 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI6, 44, j36);
                long j44 = j36 - highResolutionOutputSizeshNQ4ISI10;
                long highResolutionOutputSizeshNQ4ISI11 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI7, 47, j38);
                long j45 = j38 - highResolutionOutputSizeshNQ4ISI11;
                long highResolutionOutputSizeshNQ4ISI12 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI5, 46, j37);
                long j46 = j37 - highResolutionOutputSizeshNQ4ISI12;
                long highResolutionOutputSizeshNQ4ISI13 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, 19, j42);
                long j47 = j42 - highResolutionOutputSizeshNQ4ISI13;
                long highResolutionOutputSizeshNQ4ISI14 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI3, 42, j39);
                long j48 = j39 - highResolutionOutputSizeshNQ4ISI14;
                long highResolutionOutputSizeshNQ4ISI15 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI2, 44, j40);
                long j49 = j40 - highResolutionOutputSizeshNQ4ISI15;
                long highResolutionOutputSizeshNQ4ISI16 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI4, 25, j41);
                long j50 = j41 - highResolutionOutputSizeshNQ4ISI16;
                long highResolutionOutputSizeshNQ4ISI17 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI16, 16, j43);
                long j51 = j43 - highResolutionOutputSizeshNQ4ISI17;
                long highResolutionOutputSizeshNQ4ISI18 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI14, 34, j44);
                long j52 = j44 - highResolutionOutputSizeshNQ4ISI18;
                long highResolutionOutputSizeshNQ4ISI19 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI15, 56, j46);
                long j53 = j46 - highResolutionOutputSizeshNQ4ISI19;
                long highResolutionOutputSizeshNQ4ISI20 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI13, 51, j45);
                long j54 = j45 - highResolutionOutputSizeshNQ4ISI20;
                long highResolutionOutputSizeshNQ4ISI21 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI9, 4, j50);
                long j55 = j50 - highResolutionOutputSizeshNQ4ISI21;
                long highResolutionOutputSizeshNQ4ISI22 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI11, 53, j47);
                long j56 = j47 - highResolutionOutputSizeshNQ4ISI22;
                long highResolutionOutputSizeshNQ4ISI23 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI10, 42, j48);
                long j57 = j48 - highResolutionOutputSizeshNQ4ISI23;
                long highResolutionOutputSizeshNQ4ISI24 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI12, 41, j49);
                long j58 = j49 - highResolutionOutputSizeshNQ4ISI24;
                long highResolutionOutputSizeshNQ4ISI25 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI24, 41, j51);
                long highResolutionOutputSizeshNQ4ISI26 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI22, 9, j52);
                long highResolutionOutputSizeshNQ4ISI27 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI23, 37, j54);
                long highResolutionOutputSizeshNQ4ISI28 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI21, 31, j53);
                long highResolutionOutputSizeshNQ4ISI29 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI17, 12, j58);
                long highResolutionOutputSizeshNQ4ISI30 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI19, 47, j55);
                long highResolutionOutputSizeshNQ4ISI31 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI18, 44, j56);
                long highResolutionOutputSizeshNQ4ISI32 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI20, 30, j57);
                long j59 = (j51 - highResolutionOutputSizeshNQ4ISI25) - jArr6[i2];
                long j60 = jArr6[i4];
                long j61 = (j52 - highResolutionOutputSizeshNQ4ISI26) - jArr6[i5];
                long j62 = jArr6[i6];
                long j63 = (j54 - highResolutionOutputSizeshNQ4ISI27) - jArr6[i7];
                long j64 = jArr6[i8];
                long j65 = (j53 - highResolutionOutputSizeshNQ4ISI28) - jArr6[i9];
                long j66 = jArr6[i10];
                long j67 = (j58 - highResolutionOutputSizeshNQ4ISI29) - jArr6[i11];
                long j68 = jArr6[i12];
                long j69 = (j55 - highResolutionOutputSizeshNQ4ISI30) - jArr6[i14];
                long j70 = jArr6[i15];
                long j71 = (j56 - highResolutionOutputSizeshNQ4ISI31) - jArr6[i16];
                long j72 = jArr6[i17];
                long j73 = jArr5[i3];
                long j74 = (j57 - highResolutionOutputSizeshNQ4ISI32) - (jArr6[i18] + jArr5[i19]);
                long highResolutionOutputSizeshNQ4ISI33 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI32 - (jArr6[i20] + j34), 5, j59);
                long j75 = j59 - highResolutionOutputSizeshNQ4ISI33;
                long highResolutionOutputSizeshNQ4ISI34 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI30 - j70, 20, j61);
                long j76 = j61 - highResolutionOutputSizeshNQ4ISI34;
                long highResolutionOutputSizeshNQ4ISI35 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI31 - (j72 + j73), 48, j65);
                long j77 = j65 - highResolutionOutputSizeshNQ4ISI35;
                long highResolutionOutputSizeshNQ4ISI36 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI29 - j68, 41, j63);
                long j78 = j63 - highResolutionOutputSizeshNQ4ISI36;
                long highResolutionOutputSizeshNQ4ISI37 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI25 - j60, 47, j74);
                long j79 = j74 - highResolutionOutputSizeshNQ4ISI37;
                long highResolutionOutputSizeshNQ4ISI38 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI27 - j64, 28, j67);
                long j80 = j67 - highResolutionOutputSizeshNQ4ISI38;
                long highResolutionOutputSizeshNQ4ISI39 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI26 - j62, 16, j69);
                long j81 = j69 - highResolutionOutputSizeshNQ4ISI39;
                long highResolutionOutputSizeshNQ4ISI40 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI28 - j66, 25, j71);
                long j82 = j71 - highResolutionOutputSizeshNQ4ISI40;
                long highResolutionOutputSizeshNQ4ISI41 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI40, 33, j75);
                long j83 = j75 - highResolutionOutputSizeshNQ4ISI41;
                long highResolutionOutputSizeshNQ4ISI42 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI38, 4, j76);
                long j84 = j76 - highResolutionOutputSizeshNQ4ISI42;
                long highResolutionOutputSizeshNQ4ISI43 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI39, 51, j78);
                long j85 = j78 - highResolutionOutputSizeshNQ4ISI43;
                long highResolutionOutputSizeshNQ4ISI44 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI37, 13, j77);
                long j86 = j77 - highResolutionOutputSizeshNQ4ISI44;
                long highResolutionOutputSizeshNQ4ISI45 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI33, 34, j82);
                long j87 = j82 - highResolutionOutputSizeshNQ4ISI45;
                long highResolutionOutputSizeshNQ4ISI46 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI35, 41, j79);
                long j88 = j79 - highResolutionOutputSizeshNQ4ISI46;
                long highResolutionOutputSizeshNQ4ISI47 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI34, 59, j80);
                long j89 = j80 - highResolutionOutputSizeshNQ4ISI47;
                long highResolutionOutputSizeshNQ4ISI48 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI36, 17, j81);
                long j90 = j81 - highResolutionOutputSizeshNQ4ISI48;
                long highResolutionOutputSizeshNQ4ISI49 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI48, 38, j83);
                long j91 = j83 - highResolutionOutputSizeshNQ4ISI49;
                long highResolutionOutputSizeshNQ4ISI50 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI46, 19, j84);
                long j92 = j84 - highResolutionOutputSizeshNQ4ISI50;
                long highResolutionOutputSizeshNQ4ISI51 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI47, 10, j86);
                long j93 = j86 - highResolutionOutputSizeshNQ4ISI51;
                long highResolutionOutputSizeshNQ4ISI52 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI45, 55, j85);
                long j94 = j85 - highResolutionOutputSizeshNQ4ISI52;
                long highResolutionOutputSizeshNQ4ISI53 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI41, 49, j90);
                long j95 = j90 - highResolutionOutputSizeshNQ4ISI53;
                long highResolutionOutputSizeshNQ4ISI54 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI43, 18, j87);
                long j96 = j87 - highResolutionOutputSizeshNQ4ISI54;
                long highResolutionOutputSizeshNQ4ISI55 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI42, 23, j88);
                long j97 = j88 - highResolutionOutputSizeshNQ4ISI55;
                long highResolutionOutputSizeshNQ4ISI56 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI44, 52, j89);
                long j98 = j89 - highResolutionOutputSizeshNQ4ISI56;
                long highResolutionOutputSizeshNQ4ISI57 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI56, 24, j91);
                long highResolutionOutputSizeshNQ4ISI58 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI54, 13, j92);
                long j99 = j92 - highResolutionOutputSizeshNQ4ISI58;
                long highResolutionOutputSizeshNQ4ISI59 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI55, 8, j94);
                long highResolutionOutputSizeshNQ4ISI60 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI53, 47, j93);
                long highResolutionOutputSizeshNQ4ISI61 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI49, 8, j98);
                long highResolutionOutputSizeshNQ4ISI62 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI51, 17, j95);
                long highResolutionOutputSizeshNQ4ISI63 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI50, 22, j96);
                j13 = j96 - highResolutionOutputSizeshNQ4ISI63;
                j16 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI52, 37, j97);
                j15 = j97 - j16;
                j11 = j95 - highResolutionOutputSizeshNQ4ISI62;
                long j100 = j94 - highResolutionOutputSizeshNQ4ISI59;
                j9 = j98 - highResolutionOutputSizeshNQ4ISI61;
                j7 = j93 - highResolutionOutputSizeshNQ4ISI60;
                j12 = highResolutionOutputSizeshNQ4ISI62;
                j8 = highResolutionOutputSizeshNQ4ISI60;
                j3 = j99;
                jArr3 = jArr6;
                iArr2 = iArr4;
                j = j91 - highResolutionOutputSizeshNQ4ISI57;
                i = i13 - 2;
                j5 = j100;
                j2 = highResolutionOutputSizeshNQ4ISI57;
                iArr = iArr3;
                jArr4 = jArr5;
                j4 = highResolutionOutputSizeshNQ4ISI58;
                j14 = highResolutionOutputSizeshNQ4ISI63;
                j6 = highResolutionOutputSizeshNQ4ISI59;
                j10 = highResolutionOutputSizeshNQ4ISI61;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            long j101 = jArr7[0];
            long j102 = jArr7[1];
            long j103 = jArr7[2];
            long j104 = jArr7[3];
            long j105 = jArr7[4];
            long j106 = jArr7[5];
            long j107 = jArr7[6];
            long j108 = jArr7[7];
            long j109 = jArr7[8];
            long j110 = jArr7[9];
            long j111 = jArr7[10];
            long j112 = jArr7[11];
            long j113 = jArr7[12];
            long j114 = jArr7[13];
            long j115 = jArr8[0];
            long j116 = jArr7[14];
            long j117 = jArr8[1];
            long j118 = jArr7[15];
            jArr2[0] = j - j101;
            jArr2[1] = j2 - j102;
            jArr2[2] = j3 - j103;
            jArr2[3] = j4 - j104;
            jArr2[4] = j5 - j105;
            jArr2[5] = j6 - j106;
            jArr2[6] = j7 - j107;
            jArr2[7] = j8 - j108;
            jArr2[8] = j9 - j109;
            jArr2[9] = j10 - j110;
            jArr2[10] = j11 - j111;
            jArr2[11] = j12 - j112;
            jArr2[12] = j13 - j113;
            jArr2[13] = j14 - (j114 + j115);
            jArr2[14] = j15 - (j116 + j117);
            jArr2[15] = j16 - j118;
        }

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }
    }

    static final class Threefish256Cipher extends org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher {
        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        final void getHighSpeedVideoFpsRanges(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.getHighSpeedVideoFpsRanges;
            long[] jArr4 = this.getHighSpeedVideoFpsRangesFor;
            int[] iArr = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoSizes;
            int[] iArr2 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor;
            if (jArr3.length != 9) {
                throw new java.lang.IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new java.lang.IllegalArgumentException();
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = j + jArr3[0];
            long j6 = j2 + jArr3[1] + jArr4[0];
            long j7 = j3 + jArr3[2] + jArr4[1];
            int i = 1;
            long j8 = j4 + jArr3[3];
            while (i < 18) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j9 = j5 + j6;
                long highSpeedVideoFpsRangesFor = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j6, 14, j9);
                long j10 = j7 + j8;
                long highSpeedVideoFpsRangesFor2 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j8, 16, j10);
                long j11 = j9 + highSpeedVideoFpsRangesFor2;
                long highSpeedVideoFpsRangesFor3 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor2, 52, j11);
                long j12 = j10 + highSpeedVideoFpsRangesFor;
                long highSpeedVideoFpsRangesFor4 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, 57, j12);
                long j13 = j11 + highSpeedVideoFpsRangesFor4;
                long highSpeedVideoFpsRangesFor5 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor4, 23, j13);
                long j14 = j12 + highSpeedVideoFpsRangesFor3;
                long highSpeedVideoFpsRangesFor6 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor3, 40, j14);
                long j15 = j13 + highSpeedVideoFpsRangesFor6;
                long highSpeedVideoFpsRangesFor7 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor6, 5, j15);
                long j16 = j14 + highSpeedVideoFpsRangesFor5;
                long highSpeedVideoFpsRangesFor8 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor5, 37, j16);
                long j17 = jArr3[i2];
                int i4 = i2 + 1;
                long j18 = highSpeedVideoFpsRangesFor8 + jArr3[i4] + jArr4[i3];
                int i5 = i2 + 2;
                long j19 = jArr3[i5];
                int i6 = i3 + 1;
                long j20 = jArr4[i6];
                int i7 = i2 + 3;
                int[] iArr3 = iArr;
                long j21 = i;
                long j22 = highSpeedVideoFpsRangesFor7 + jArr3[i7] + j21;
                long j23 = j15 + j17 + j18;
                long highSpeedVideoFpsRangesFor9 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j18, 25, j23);
                long j24 = j16 + j19 + j20 + j22;
                long highSpeedVideoFpsRangesFor10 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j22, 33, j24);
                long j25 = j23 + highSpeedVideoFpsRangesFor10;
                long highSpeedVideoFpsRangesFor11 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor10, 46, j25);
                long j26 = j24 + highSpeedVideoFpsRangesFor9;
                long highSpeedVideoFpsRangesFor12 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor9, 12, j26);
                long j27 = j25 + highSpeedVideoFpsRangesFor12;
                long highSpeedVideoFpsRangesFor13 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor12, 58, j27);
                long j28 = j26 + highSpeedVideoFpsRangesFor11;
                long highSpeedVideoFpsRangesFor14 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor11, 22, j28);
                long j29 = j27 + highSpeedVideoFpsRangesFor14;
                long highSpeedVideoFpsRangesFor15 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor14, 32, j29);
                long j30 = j28 + highSpeedVideoFpsRangesFor13;
                long highSpeedVideoFpsRangesFor16 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor13, 32, j30);
                long j31 = jArr3[i4];
                long j32 = jArr3[i5];
                long j33 = jArr4[i6];
                j7 = j30 + jArr3[i7] + jArr4[i3 + 2];
                j8 = highSpeedVideoFpsRangesFor15 + jArr3[i2 + 4] + j21 + 1;
                i += 2;
                j6 = highSpeedVideoFpsRangesFor16 + j32 + j33;
                j5 = j29 + j31;
                iArr = iArr3;
                iArr2 = iArr2;
            }
            jArr2[0] = j5;
            jArr2[1] = j6;
            jArr2[2] = j7;
            jArr2[3] = j8;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        final void getHighResolutionOutputSizeshNQ4ISI(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.getHighSpeedVideoFpsRanges;
            long[] jArr4 = this.getHighSpeedVideoFpsRangesFor;
            int[] iArr = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoSizes;
            int[] iArr2 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor;
            if (jArr3.length != 9) {
                throw new java.lang.IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new java.lang.IllegalArgumentException();
            }
            boolean z = false;
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            int i = 17;
            while (i > 0) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                int i4 = i2 + 1;
                long j5 = j - jArr3[i4];
                int i5 = i2 + 2;
                long j6 = jArr3[i5];
                int i6 = i3 + 1;
                long j7 = jArr4[i6];
                int i7 = i2 + 3;
                long j8 = j3 - (jArr3[i7] + jArr4[i3 + 2]);
                long j9 = i;
                long highResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j4 - ((jArr3[i2 + 4] + j9) + 1), 32, j5);
                long j10 = j5 - highResolutionOutputSizeshNQ4ISI;
                long j11 = j2 - (j6 + j7);
                int[] iArr3 = iArr;
                long highResolutionOutputSizeshNQ4ISI2 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j11, 32, j8);
                long j12 = j8 - highResolutionOutputSizeshNQ4ISI2;
                long highResolutionOutputSizeshNQ4ISI3 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI2, 58, j10);
                long j13 = j10 - highResolutionOutputSizeshNQ4ISI3;
                long highResolutionOutputSizeshNQ4ISI4 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, 22, j12);
                long j14 = j12 - highResolutionOutputSizeshNQ4ISI4;
                long highResolutionOutputSizeshNQ4ISI5 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI4, 46, j13);
                long j15 = j13 - highResolutionOutputSizeshNQ4ISI5;
                long highResolutionOutputSizeshNQ4ISI6 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI3, 12, j14);
                long j16 = j14 - highResolutionOutputSizeshNQ4ISI6;
                long highResolutionOutputSizeshNQ4ISI7 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI6, 25, j15);
                long highResolutionOutputSizeshNQ4ISI8 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI5, 33, j16);
                long j17 = (j15 - highResolutionOutputSizeshNQ4ISI7) - jArr3[i2];
                long j18 = jArr3[i4];
                long j19 = jArr4[i3];
                long j20 = (j16 - highResolutionOutputSizeshNQ4ISI8) - (jArr3[i5] + jArr4[i6]);
                long highResolutionOutputSizeshNQ4ISI9 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI8 - (jArr3[i7] + j9), 5, j17);
                long j21 = j17 - highResolutionOutputSizeshNQ4ISI9;
                long highResolutionOutputSizeshNQ4ISI10 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI7 - (j18 + j19), 37, j20);
                long j22 = j20 - highResolutionOutputSizeshNQ4ISI10;
                long highResolutionOutputSizeshNQ4ISI11 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI10, 23, j21);
                long j23 = j21 - highResolutionOutputSizeshNQ4ISI11;
                long highResolutionOutputSizeshNQ4ISI12 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI9, 40, j22);
                long j24 = j22 - highResolutionOutputSizeshNQ4ISI12;
                long highResolutionOutputSizeshNQ4ISI13 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI12, 52, j23);
                long j25 = j23 - highResolutionOutputSizeshNQ4ISI13;
                long highResolutionOutputSizeshNQ4ISI14 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI11, 57, j24);
                long j26 = j24 - highResolutionOutputSizeshNQ4ISI14;
                j2 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI14, 14, j25);
                j4 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI13, 16, j26);
                j3 = j26 - j4;
                i -= 2;
                j = j25 - j2;
                iArr = iArr3;
                iArr2 = iArr2;
                z = false;
            }
            boolean z2 = z;
            long j27 = jArr3[z2 ? 1 : 0];
            long j28 = jArr3[1];
            long j29 = jArr4[z2 ? 1 : 0];
            long j30 = jArr3[2];
            long j31 = jArr4[1];
            long j32 = jArr3[3];
            jArr2[z2 ? 1 : 0] = j - j27;
            jArr2[1] = j2 - (j28 + j29);
            jArr2[2] = j3 - (j30 + j31);
            jArr2[3] = j4 - j32;
        }

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }
    }

    static final class Threefish512Cipher extends org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher {
        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public final void getHighSpeedVideoFpsRanges(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.getHighSpeedVideoFpsRanges;
            long[] jArr4 = this.getHighSpeedVideoFpsRangesFor;
            int[] iArr = org.bouncycastle.crypto.engines.ThreefishEngine.Camera2StreamConfigurationMap;
            int[] iArr2 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor;
            if (jArr3.length != 17) {
                throw new java.lang.IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new java.lang.IllegalArgumentException();
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr3[0];
            long j10 = j2 + jArr3[1];
            long j11 = jArr3[2];
            long j12 = jArr3[3];
            long j13 = jArr3[4];
            long j14 = jArr3[5];
            long j15 = jArr4[0];
            long j16 = j + j9;
            long j17 = j7 + jArr3[6] + jArr4[1];
            long j18 = j3 + j11;
            long j19 = j5 + j13;
            int i = 1;
            long j20 = j4 + j12;
            long j21 = j6 + j14 + j15;
            long j22 = j8 + jArr3[7];
            while (i < 18) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j23 = j16 + j10;
                long highSpeedVideoFpsRangesFor = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j10, 46, j23);
                long j24 = j18 + j20;
                long highSpeedVideoFpsRangesFor2 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j20, 36, j24);
                long j25 = j21;
                int[] iArr3 = iArr;
                long j26 = j19 + j25;
                long highSpeedVideoFpsRangesFor3 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j25, 19, j26);
                long[] jArr5 = jArr3;
                long j27 = j22;
                long j28 = j17 + j27;
                long highSpeedVideoFpsRangesFor4 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j27, 37, j28);
                int i4 = i;
                long j29 = j24 + highSpeedVideoFpsRangesFor;
                long highSpeedVideoFpsRangesFor5 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, 33, j29);
                long j30 = j26 + highSpeedVideoFpsRangesFor4;
                long highSpeedVideoFpsRangesFor6 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor4, 27, j30);
                long j31 = j28 + highSpeedVideoFpsRangesFor3;
                long highSpeedVideoFpsRangesFor7 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor3, 14, j31);
                long j32 = j23 + highSpeedVideoFpsRangesFor2;
                long highSpeedVideoFpsRangesFor8 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor2, 42, j32);
                long j33 = j30 + highSpeedVideoFpsRangesFor5;
                long highSpeedVideoFpsRangesFor9 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor5, 17, j33);
                long j34 = j31 + highSpeedVideoFpsRangesFor8;
                long highSpeedVideoFpsRangesFor10 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor8, 49, j34);
                long j35 = j32 + highSpeedVideoFpsRangesFor7;
                long highSpeedVideoFpsRangesFor11 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor7, 36, j35);
                long j36 = j29 + highSpeedVideoFpsRangesFor6;
                long highSpeedVideoFpsRangesFor12 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor6, 39, j36);
                long j37 = j34 + highSpeedVideoFpsRangesFor9;
                long highSpeedVideoFpsRangesFor13 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor9, 44, j37);
                long j38 = j35 + highSpeedVideoFpsRangesFor12;
                long highSpeedVideoFpsRangesFor14 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor12, 9, j38);
                long j39 = j36 + highSpeedVideoFpsRangesFor11;
                long highSpeedVideoFpsRangesFor15 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor11, 54, j39);
                long j40 = j33 + highSpeedVideoFpsRangesFor10;
                long highSpeedVideoFpsRangesFor16 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor10, 56, j40);
                long j41 = jArr5[i2];
                int i5 = i2 + 1;
                long j42 = highSpeedVideoFpsRangesFor13 + jArr5[i5];
                int i6 = i2 + 2;
                long j43 = jArr5[i6];
                int i7 = i2 + 3;
                long j44 = highSpeedVideoFpsRangesFor16 + jArr5[i7];
                int i8 = i2 + 4;
                long j45 = jArr5[i8];
                int i9 = i2 + 5;
                long j46 = highSpeedVideoFpsRangesFor15 + jArr5[i9] + jArr4[i3];
                int i10 = i2 + 6;
                long j47 = jArr5[i10];
                int i11 = i3 + 1;
                long j48 = jArr4[i11];
                int i12 = i2 + 7;
                long j49 = i4;
                long j50 = highSpeedVideoFpsRangesFor14 + jArr5[i12] + j49;
                long j51 = j38 + j41 + j42;
                long highSpeedVideoFpsRangesFor17 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j42, 39, j51);
                long j52 = j39 + j43 + j44;
                long highSpeedVideoFpsRangesFor18 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j44, 30, j52);
                long j53 = j40 + j45 + j46;
                long highSpeedVideoFpsRangesFor19 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j46, 34, j53);
                long j54 = j37 + j47 + j48 + j50;
                long highSpeedVideoFpsRangesFor20 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(j50, 24, j54);
                long j55 = j52 + highSpeedVideoFpsRangesFor17;
                long highSpeedVideoFpsRangesFor21 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor17, 13, j55);
                long j56 = j53 + highSpeedVideoFpsRangesFor20;
                long highSpeedVideoFpsRangesFor22 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor20, 50, j56);
                long j57 = j54 + highSpeedVideoFpsRangesFor19;
                long highSpeedVideoFpsRangesFor23 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor19, 10, j57);
                long j58 = j51 + highSpeedVideoFpsRangesFor18;
                long highSpeedVideoFpsRangesFor24 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor18, 17, j58);
                long j59 = j56 + highSpeedVideoFpsRangesFor21;
                long highSpeedVideoFpsRangesFor25 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor21, 25, j59);
                long j60 = j57 + highSpeedVideoFpsRangesFor24;
                long highSpeedVideoFpsRangesFor26 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor24, 29, j60);
                long j61 = j58 + highSpeedVideoFpsRangesFor23;
                long highSpeedVideoFpsRangesFor27 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor23, 39, j61);
                long j62 = j55 + highSpeedVideoFpsRangesFor22;
                long highSpeedVideoFpsRangesFor28 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor22, 43, j62);
                long j63 = j60 + highSpeedVideoFpsRangesFor25;
                long highSpeedVideoFpsRangesFor29 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor25, 8, j63);
                long j64 = j61 + highSpeedVideoFpsRangesFor28;
                long highSpeedVideoFpsRangesFor30 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor28, 35, j64);
                long j65 = j62 + highSpeedVideoFpsRangesFor27;
                long highSpeedVideoFpsRangesFor31 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor27, 56, j65);
                long j66 = j59 + highSpeedVideoFpsRangesFor26;
                long highSpeedVideoFpsRangesFor32 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor26, 22, j66);
                long j67 = jArr5[i5];
                long j68 = jArr5[i6];
                long j69 = jArr5[i7];
                long j70 = jArr5[i8];
                long j71 = jArr5[i9];
                long j72 = jArr5[i10];
                long j73 = jArr4[i11];
                long j74 = j63 + jArr5[i12] + jArr4[i3 + 2];
                long j75 = j66 + j71;
                j10 = highSpeedVideoFpsRangesFor29 + j68;
                j21 = highSpeedVideoFpsRangesFor31 + j72 + j73;
                j22 = jArr5[i2 + 8] + j49 + 1 + highSpeedVideoFpsRangesFor30;
                j19 = j75;
                j17 = j74;
                j18 = j65 + j69;
                j16 = j64 + j67;
                i = i4 + 2;
                iArr2 = iArr2;
                iArr = iArr3;
                j20 = highSpeedVideoFpsRangesFor32 + j70;
                jArr3 = jArr5;
            }
            jArr2[0] = j16;
            jArr2[1] = j10;
            jArr2[2] = j18;
            jArr2[3] = j20;
            jArr2[4] = j19;
            jArr2[5] = j21;
            jArr2[6] = j17;
            jArr2[7] = j22;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public final void getHighResolutionOutputSizeshNQ4ISI(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.getHighSpeedVideoFpsRanges;
            long[] jArr4 = this.getHighSpeedVideoFpsRangesFor;
            int[] iArr = org.bouncycastle.crypto.engines.ThreefishEngine.Camera2StreamConfigurationMap;
            int[] iArr2 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighSpeedVideoFpsRangesFor;
            if (jArr3.length != 17) {
                throw new java.lang.IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new java.lang.IllegalArgumentException();
            }
            boolean z = false;
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            int i = 17;
            while (i > 0) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                int i4 = i2 + 1;
                long j9 = j - jArr3[i4];
                int i5 = i2 + 2;
                long j10 = jArr3[i5];
                int i6 = i2 + 3;
                long j11 = j3 - jArr3[i6];
                int i7 = i2 + 4;
                long j12 = jArr3[i7];
                int i8 = i2 + 5;
                long j13 = j5 - jArr3[i8];
                int i9 = i2 + 6;
                long j14 = jArr3[i9];
                int i10 = i3 + 1;
                long j15 = jArr4[i10];
                int i11 = i2 + 7;
                long j16 = j7 - (jArr3[i11] + jArr4[i3 + 2]);
                long j17 = jArr3[i2 + 8];
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j18 = i;
                long highResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j2 - j10, 8, j16);
                long j19 = j16 - highResolutionOutputSizeshNQ4ISI;
                long highResolutionOutputSizeshNQ4ISI2 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j8 - ((j17 + j18) + 1), 35, j9);
                long j20 = j9 - highResolutionOutputSizeshNQ4ISI2;
                long[] jArr5 = jArr3;
                long highResolutionOutputSizeshNQ4ISI3 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j6 - (j14 + j15), 56, j11);
                long j21 = j11 - highResolutionOutputSizeshNQ4ISI3;
                long highResolutionOutputSizeshNQ4ISI4 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(j4 - j12, 22, j13);
                long j22 = j13 - highResolutionOutputSizeshNQ4ISI4;
                long highResolutionOutputSizeshNQ4ISI5 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, 25, j22);
                long j23 = j22 - highResolutionOutputSizeshNQ4ISI5;
                long highResolutionOutputSizeshNQ4ISI6 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI4, 29, j19);
                long j24 = j19 - highResolutionOutputSizeshNQ4ISI6;
                long highResolutionOutputSizeshNQ4ISI7 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI3, 39, j20);
                long j25 = j20 - highResolutionOutputSizeshNQ4ISI7;
                int i12 = i;
                long highResolutionOutputSizeshNQ4ISI8 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI2, 43, j21);
                long j26 = j21 - highResolutionOutputSizeshNQ4ISI8;
                long highResolutionOutputSizeshNQ4ISI9 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI5, 13, j26);
                long j27 = j26 - highResolutionOutputSizeshNQ4ISI9;
                long highResolutionOutputSizeshNQ4ISI10 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI8, 50, j23);
                long j28 = j23 - highResolutionOutputSizeshNQ4ISI10;
                long highResolutionOutputSizeshNQ4ISI11 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI7, 10, j24);
                long j29 = j24 - highResolutionOutputSizeshNQ4ISI11;
                long highResolutionOutputSizeshNQ4ISI12 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI6, 17, j25);
                long j30 = j25 - highResolutionOutputSizeshNQ4ISI12;
                long highResolutionOutputSizeshNQ4ISI13 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI9, 39, j30);
                long highResolutionOutputSizeshNQ4ISI14 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI12, 30, j27);
                long highResolutionOutputSizeshNQ4ISI15 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI11, 34, j28);
                long[] jArr6 = jArr4;
                long highResolutionOutputSizeshNQ4ISI16 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI10, 24, j29);
                long j31 = (j30 - highResolutionOutputSizeshNQ4ISI13) - jArr5[i2];
                long j32 = jArr5[i4];
                long j33 = (j27 - highResolutionOutputSizeshNQ4ISI14) - jArr5[i5];
                long j34 = jArr5[i6];
                long j35 = (j28 - highResolutionOutputSizeshNQ4ISI15) - jArr5[i7];
                long j36 = jArr5[i8];
                long j37 = jArr6[i3];
                long j38 = (j29 - highResolutionOutputSizeshNQ4ISI16) - (jArr5[i9] + jArr6[i10]);
                long j39 = jArr5[i11];
                long highResolutionOutputSizeshNQ4ISI17 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI13 - j32, 44, j38);
                long j40 = j38 - highResolutionOutputSizeshNQ4ISI17;
                long highResolutionOutputSizeshNQ4ISI18 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI16 - (j39 + j18), 9, j31);
                long j41 = j31 - highResolutionOutputSizeshNQ4ISI18;
                long highResolutionOutputSizeshNQ4ISI19 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI15 - (j36 + j37), 54, j33);
                long j42 = j33 - highResolutionOutputSizeshNQ4ISI19;
                long highResolutionOutputSizeshNQ4ISI20 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI14 - j34, 56, j35);
                long j43 = j35 - highResolutionOutputSizeshNQ4ISI20;
                long highResolutionOutputSizeshNQ4ISI21 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI17, 17, j43);
                long j44 = j43 - highResolutionOutputSizeshNQ4ISI21;
                long highResolutionOutputSizeshNQ4ISI22 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI20, 49, j40);
                long j45 = j40 - highResolutionOutputSizeshNQ4ISI22;
                long highResolutionOutputSizeshNQ4ISI23 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI19, 36, j41);
                long j46 = j41 - highResolutionOutputSizeshNQ4ISI23;
                long highResolutionOutputSizeshNQ4ISI24 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI18, 39, j42);
                long j47 = j42 - highResolutionOutputSizeshNQ4ISI24;
                long highResolutionOutputSizeshNQ4ISI25 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI21, 33, j47);
                long j48 = j47 - highResolutionOutputSizeshNQ4ISI25;
                long highResolutionOutputSizeshNQ4ISI26 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI24, 27, j44);
                long j49 = j44 - highResolutionOutputSizeshNQ4ISI26;
                long highResolutionOutputSizeshNQ4ISI27 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI23, 14, j45);
                long j50 = j45 - highResolutionOutputSizeshNQ4ISI27;
                long highResolutionOutputSizeshNQ4ISI28 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI22, 42, j46);
                long j51 = j46 - highResolutionOutputSizeshNQ4ISI28;
                long highResolutionOutputSizeshNQ4ISI29 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI25, 46, j51);
                long highResolutionOutputSizeshNQ4ISI30 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI28, 36, j48);
                j6 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI27, 19, j49);
                j8 = org.bouncycastle.crypto.engines.ThreefishEngine.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI26, 37, j50);
                j7 = j50 - j8;
                long j52 = j48 - highResolutionOutputSizeshNQ4ISI30;
                i = i12 - 2;
                j = j51 - highResolutionOutputSizeshNQ4ISI29;
                long j53 = j49 - j6;
                j3 = j52;
                j4 = highResolutionOutputSizeshNQ4ISI30;
                j2 = highResolutionOutputSizeshNQ4ISI29;
                jArr4 = jArr6;
                iArr = iArr3;
                iArr2 = iArr4;
                z = false;
                j5 = j53;
                jArr3 = jArr5;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            boolean z2 = z;
            long j54 = jArr7[z2 ? 1 : 0];
            long j55 = jArr7[1];
            long j56 = jArr7[2];
            long j57 = jArr7[3];
            long j58 = jArr7[4];
            long j59 = jArr7[5];
            long j60 = jArr8[z2 ? 1 : 0];
            long j61 = jArr7[6];
            long j62 = jArr8[1];
            long j63 = jArr7[7];
            jArr2[z2 ? 1 : 0] = j - j54;
            jArr2[1] = j2 - j55;
            jArr2[2] = j3 - j56;
            jArr2[3] = j4 - j57;
            jArr2[4] = j5 - j58;
            jArr2[5] = j6 - (j59 + j60);
            jArr2[6] = j7 - (j61 + j62);
            jArr2[7] = j8 - j63;
        }

        protected Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }
    }

    static abstract class ThreefishCipher {
        protected final long[] getHighSpeedVideoFpsRanges;
        protected final long[] getHighSpeedVideoFpsRangesFor;

        abstract void getHighResolutionOutputSizeshNQ4ISI(long[] jArr, long[] jArr2);

        abstract void getHighSpeedVideoFpsRanges(long[] jArr, long[] jArr2);

        protected ThreefishCipher(long[] jArr, long[] jArr2) {
            this.getHighSpeedVideoFpsRanges = jArr;
            this.getHighSpeedVideoFpsRangesFor = jArr2;
        }
    }

    public ThreefishEngine(int i) {
        org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher threefish256Cipher;
        long[] jArr = new long[5];
        this.getOutputStallDuration = jArr;
        int i2 = i / 8;
        this.getHighSpeedVideoFpsRanges = i2;
        int i3 = i2 / 8;
        this.getHighSpeedVideoSizesFor = i3;
        this.getOutputMinFrameDuration = new long[i3];
        long[] jArr2 = new long[(i3 * 2) + 1];
        this.getOutputFormats = jArr2;
        if (i == 256) {
            threefish256Cipher = new org.bouncycastle.crypto.engines.ThreefishEngine.Threefish256Cipher(jArr2, jArr);
        } else if (i == 512) {
            threefish256Cipher = new org.bouncycastle.crypto.engines.ThreefishEngine.Threefish512Cipher(jArr2, jArr);
        } else {
            if (i != 1024) {
                throw new java.lang.IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            threefish256Cipher = new org.bouncycastle.crypto.engines.ThreefishEngine.Threefish1024Cipher(jArr2, jArr);
        }
        this.getInputSizeshNQ4ISI = threefish256Cipher;
    }

    static {
        int i = 0;
        while (true) {
            int[] iArr = Camera2StreamConfigurationMap;
            if (i >= iArr.length) {
                return;
            }
            getHighResolutionOutputSizeshNQ4ISI[i] = i % 17;
            iArr[i] = i % 9;
            getHighSpeedVideoSizes[i] = i % 5;
            getHighSpeedVideoFpsRangesFor[i] = i % 3;
            i++;
        }
    }
}
