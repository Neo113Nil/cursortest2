package org.apache.commons.codec.digest;

/* loaded from: classes17.dex */
public final class Blake3 {
    private static final int[] getHighSpeedVideoFpsRanges = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    private static final byte[][] getHighSpeedVideoSizes = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI}, new byte[]{2, 6, 3, 10, 7, 0, 4, 13, 1, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 5, 9, 14, com.google.common.base.Ascii.SI, 8}, new byte[]{3, 4, 10, com.google.common.base.Ascii.FF, 13, 2, 7, 14, 6, 5, 9, 0, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, 8, 1}, new byte[]{10, 7, com.google.common.base.Ascii.FF, 9, 14, 3, 13, com.google.common.base.Ascii.SI, 4, 0, com.google.common.base.Ascii.VT, 2, 5, 8, 1, 6}, new byte[]{com.google.common.base.Ascii.FF, 13, 9, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, 10, 14, 8, 7, 2, 5, 3, 0, 1, 6, 4}, new byte[]{9, 14, com.google.common.base.Ascii.VT, 5, 8, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 1, 13, 3, 0, 10, 2, 6, 4, 7}, new byte[]{com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, 5, 0, 1, 9, 8, 6, 14, 10, 2, com.google.common.base.Ascii.FF, 3, 4, 7, 13}};
    private final org.apache.commons.codec.digest.Blake3.EngineState getHighResolutionOutputSizeshNQ4ISI;

    static /* synthetic */ int[] getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        return Camera2StreamConfigurationMap(bArr, 16);
    }

    static final class ChunkState {
        private final byte[] Camera2StreamConfigurationMap;
        private final long getHighResolutionOutputSizeshNQ4ISI;
        private int[] getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private final int getInputFormats;

        /* synthetic */ ChunkState(int[] iArr, long j, int i, byte b) {
            this(iArr, j, i);
        }

        private ChunkState(int[] iArr, long j, int i) {
            this.Camera2StreamConfigurationMap = new byte[64];
            this.getHighSpeedVideoFpsRanges = iArr;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.getInputFormats = i;
        }

        static /* synthetic */ int getHighSpeedVideoSizes(org.apache.commons.codec.digest.Blake3.ChunkState chunkState) {
            return (chunkState.getHighSpeedVideoFpsRangesFor * 64) + chunkState.getHighSpeedVideoSizes;
        }

        static /* synthetic */ org.apache.commons.codec.digest.Blake3.Output getHighSpeedVideoFpsRangesFor(org.apache.commons.codec.digest.Blake3.ChunkState chunkState) {
            return new org.apache.commons.codec.digest.Blake3.Output(chunkState.getHighSpeedVideoFpsRanges, org.apache.commons.codec.digest.Blake3.getHighSpeedVideoFpsRangesFor(chunkState.Camera2StreamConfigurationMap), chunkState.getHighResolutionOutputSizeshNQ4ISI, chunkState.getHighSpeedVideoSizes, chunkState.getInputFormats | (chunkState.getHighSpeedVideoFpsRangesFor == 0 ? 1 : 0) | 2, (byte) 0);
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(org.apache.commons.codec.digest.Blake3.ChunkState chunkState, byte[] bArr, int i, int i2) {
            while (i2 > 0) {
                if (chunkState.getHighSpeedVideoSizes == 64) {
                    chunkState.getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(org.apache.commons.codec.digest.Blake3.getHighResolutionOutputSizeshNQ4ISI(chunkState.getHighSpeedVideoFpsRanges, org.apache.commons.codec.digest.Blake3.getHighSpeedVideoFpsRangesFor(chunkState.Camera2StreamConfigurationMap), 64, chunkState.getHighResolutionOutputSizeshNQ4ISI, (chunkState.getHighSpeedVideoFpsRangesFor == 0 ? 1 : 0) | chunkState.getInputFormats), 8);
                    chunkState.getHighSpeedVideoFpsRangesFor++;
                    chunkState.getHighSpeedVideoSizes = 0;
                    java.util.Arrays.fill(chunkState.Camera2StreamConfigurationMap, (byte) 0);
                }
                int min = java.lang.Math.min(64 - chunkState.getHighSpeedVideoSizes, i2);
                java.lang.System.arraycopy(bArr, i, chunkState.Camera2StreamConfigurationMap, chunkState.getHighSpeedVideoSizes, min);
                chunkState.getHighSpeedVideoSizes += min;
                i += min;
                i2 -= min;
            }
        }
    }

    static final class EngineState {
        private final int[] Camera2StreamConfigurationMap;
        private org.apache.commons.codec.digest.Blake3.ChunkState getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRanges;
        private final int[][] getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        /* synthetic */ EngineState(int[] iArr, int i, byte b) {
            this(iArr, i);
        }

        private EngineState(int[] iArr, int i) {
            this.getHighSpeedVideoFpsRangesFor = new int[54][];
            this.Camera2StreamConfigurationMap = iArr;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighResolutionOutputSizeshNQ4ISI = new org.apache.commons.codec.digest.Blake3.ChunkState(iArr, 0L, i, (byte) 0);
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(org.apache.commons.codec.digest.Blake3.EngineState engineState, byte[] bArr, int i, int i2) {
            while (i2 > 0) {
                if (org.apache.commons.codec.digest.Blake3.ChunkState.getHighSpeedVideoSizes(engineState.getHighResolutionOutputSizeshNQ4ISI) == 1024) {
                    int[] highSpeedVideoFpsRanges = org.apache.commons.codec.digest.Blake3.Output.getHighSpeedVideoFpsRanges(org.apache.commons.codec.digest.Blake3.ChunkState.getHighSpeedVideoFpsRangesFor(engineState.getHighResolutionOutputSizeshNQ4ISI));
                    long j = engineState.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI + 1;
                    for (long j2 = j; (j2 & 1) == 0; j2 >>= 1) {
                        int[][] iArr = engineState.getHighSpeedVideoFpsRangesFor;
                        int i3 = engineState.getHighSpeedVideoSizes - 1;
                        engineState.getHighSpeedVideoSizes = i3;
                        highSpeedVideoFpsRanges = org.apache.commons.codec.digest.Blake3.Camera2StreamConfigurationMap(iArr[i3], highSpeedVideoFpsRanges, engineState.Camera2StreamConfigurationMap, engineState.getHighSpeedVideoFpsRanges);
                    }
                    int[][] iArr2 = engineState.getHighSpeedVideoFpsRangesFor;
                    int i4 = engineState.getHighSpeedVideoSizes;
                    engineState.getHighSpeedVideoSizes = i4 + 1;
                    iArr2[i4] = highSpeedVideoFpsRanges;
                    engineState.getHighResolutionOutputSizeshNQ4ISI = new org.apache.commons.codec.digest.Blake3.ChunkState(engineState.Camera2StreamConfigurationMap, j, engineState.getHighSpeedVideoFpsRanges, (byte) 0);
                }
                int min = java.lang.Math.min(1024 - org.apache.commons.codec.digest.Blake3.ChunkState.getHighSpeedVideoSizes(engineState.getHighResolutionOutputSizeshNQ4ISI), i2);
                org.apache.commons.codec.digest.Blake3.ChunkState.Camera2StreamConfigurationMap(engineState.getHighResolutionOutputSizeshNQ4ISI, bArr, i, min);
                i += min;
                i2 -= min;
            }
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(org.apache.commons.codec.digest.Blake3.EngineState engineState, byte[] bArr, int i, int i2) {
            org.apache.commons.codec.digest.Blake3.Output highSpeedVideoFpsRangesFor = org.apache.commons.codec.digest.Blake3.ChunkState.getHighSpeedVideoFpsRangesFor(engineState.getHighResolutionOutputSizeshNQ4ISI);
            int i3 = engineState.getHighSpeedVideoSizes;
            while (true) {
                int i4 = i3 - 1;
                if (i3 > 0) {
                    highSpeedVideoFpsRangesFor = org.apache.commons.codec.digest.Blake3.getHighResolutionOutputSizeshNQ4ISI(engineState.getHighSpeedVideoFpsRangesFor[i4], org.apache.commons.codec.digest.Blake3.Output.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor), engineState.Camera2StreamConfigurationMap, engineState.getHighSpeedVideoFpsRanges);
                    i3 = i4;
                } else {
                    org.apache.commons.codec.digest.Blake3.Output.Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor, bArr, i, i2);
                    return;
                }
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(org.apache.commons.codec.digest.Blake3.EngineState engineState) {
            engineState.getHighSpeedVideoSizes = 0;
            java.util.Arrays.fill(engineState.getHighSpeedVideoFpsRangesFor, (java.lang.Object) null);
            engineState.getHighResolutionOutputSizeshNQ4ISI = new org.apache.commons.codec.digest.Blake3.ChunkState(engineState.Camera2StreamConfigurationMap, 0L, engineState.getHighSpeedVideoFpsRanges, (byte) 0);
        }
    }

    static final class Output {
        private final int Camera2StreamConfigurationMap;
        private final int[] getHighResolutionOutputSizeshNQ4ISI;
        private final long getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;
        private final int[] getHighSpeedVideoSizes;

        /* synthetic */ Output(int[] iArr, int[] iArr2, long j, int i, int i2, byte b) {
            this(iArr, iArr2, j, i, i2);
        }

        private Output(int[] iArr, int[] iArr2, long j, int i, int i2) {
            this.getHighSpeedVideoSizes = iArr;
            this.getHighResolutionOutputSizeshNQ4ISI = iArr2;
            this.getHighSpeedVideoFpsRanges = j;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.Camera2StreamConfigurationMap = i2;
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(org.apache.commons.codec.digest.Blake3.Output output, byte[] bArr, int i, int i2) {
            int i3 = 0;
            while (i2 > 0) {
                int min = java.lang.Math.min(64, i2);
                i2 -= min;
                int[] highResolutionOutputSizeshNQ4ISI = org.apache.commons.codec.digest.Blake3.getHighResolutionOutputSizeshNQ4ISI(output.getHighSpeedVideoSizes, output.getHighResolutionOutputSizeshNQ4ISI, output.getHighSpeedVideoFpsRangesFor, i3, output.Camera2StreamConfigurationMap | 8);
                int i4 = 0;
                while (min > 0) {
                    int min2 = java.lang.Math.min(4, min);
                    org.apache.commons.codec.digest.Blake3.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI[i4], bArr, i, min2);
                    i += min2;
                    min -= min2;
                    i4++;
                }
                i3++;
            }
        }

        static /* synthetic */ int[] getHighSpeedVideoFpsRanges(org.apache.commons.codec.digest.Blake3.Output output) {
            return java.util.Arrays.copyOf(org.apache.commons.codec.digest.Blake3.getHighResolutionOutputSizeshNQ4ISI(output.getHighSpeedVideoSizes, output.getHighResolutionOutputSizeshNQ4ISI, output.getHighSpeedVideoFpsRangesFor, output.getHighSpeedVideoFpsRanges, output.Camera2StreamConfigurationMap), 8);
        }
    }

    private static void getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2) {
        java.util.Objects.requireNonNull(bArr);
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Offset must be non-negative");
        }
        if (i2 < 0) {
            throw new java.lang.IndexOutOfBoundsException("Length must be non-negative");
        }
        int length = bArr.length;
        if (i <= length - i2) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Offset ");
        sb.append(i);
        sb.append(" and length ");
        sb.append(i2);
        sb.append(" out of bounds with buffer length ");
        sb.append(length);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = iArr[i] + iArr[i2] + i5;
        iArr[i] = i7;
        int rotateRight = java.lang.Integer.rotateRight(iArr[i4] ^ i7, 16);
        iArr[i4] = rotateRight;
        int i8 = iArr[i3] + rotateRight;
        iArr[i3] = i8;
        int rotateRight2 = java.lang.Integer.rotateRight(iArr[i2] ^ i8, 12);
        iArr[i2] = rotateRight2;
        int i9 = iArr[i] + rotateRight2 + i6;
        iArr[i] = i9;
        int rotateRight3 = java.lang.Integer.rotateRight(iArr[i4] ^ i9, 8);
        iArr[i4] = rotateRight3;
        int i10 = iArr[i3] + rotateRight3;
        iArr[i3] = i10;
        iArr[i2] = java.lang.Integer.rotateRight(iArr[i2] ^ i10, 7);
    }

    public static byte[] hash(byte[] bArr) {
        return initHash().update(bArr).doFinalize(32);
    }

    public static org.apache.commons.codec.digest.Blake3 initHash() {
        return new org.apache.commons.codec.digest.Blake3(getHighSpeedVideoFpsRanges, 0);
    }

    public static org.apache.commons.codec.digest.Blake3 initKeyDerivationFunction(byte[] bArr) {
        java.util.Objects.requireNonNull(bArr);
        org.apache.commons.codec.digest.Blake3.EngineState engineState = new org.apache.commons.codec.digest.Blake3.EngineState(getHighSpeedVideoFpsRanges, 32, (byte) 0);
        org.apache.commons.codec.digest.Blake3.EngineState.getHighSpeedVideoFpsRangesFor(engineState, bArr, 0, bArr.length);
        byte[] bArr2 = new byte[32];
        org.apache.commons.codec.digest.Blake3.EngineState.getHighResolutionOutputSizeshNQ4ISI(engineState, bArr2, 0, 32);
        return new org.apache.commons.codec.digest.Blake3(Camera2StreamConfigurationMap(bArr2, 8), 64);
    }

    public static org.apache.commons.codec.digest.Blake3 initKeyedHash(byte[] bArr) {
        java.util.Objects.requireNonNull(bArr);
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException("Blake3 keys must be 32 bytes");
        }
        return new org.apache.commons.codec.digest.Blake3(Camera2StreamConfigurationMap(bArr, 8), 16);
    }

    public static byte[] keyedHash(byte[] bArr, byte[] bArr2) {
        return initKeyedHash(bArr).update(bArr2).doFinalize(32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.apache.commons.codec.digest.Blake3.Output getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        int[] copyOf = java.util.Arrays.copyOf(iArr, 16);
        java.lang.System.arraycopy(iArr2, 0, copyOf, 8, 8);
        return new org.apache.commons.codec.digest.Blake3.Output((int[]) iArr3.clone(), copyOf, 0L, 64, i | 4, (byte) 0);
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static int[] Camera2StreamConfigurationMap(byte[] bArr, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            iArr[i2] = getHighResolutionOutputSizeshNQ4ISI(bArr, i3);
            i2++;
            i3 += 4;
        }
        return iArr;
    }

    private Blake3(int[] iArr, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.apache.commons.codec.digest.Blake3.EngineState(iArr, i, (byte) 0);
    }

    public final org.apache.commons.codec.digest.Blake3 doFinalize(byte[] bArr) {
        return doFinalize(bArr, 0, bArr.length);
    }

    public final org.apache.commons.codec.digest.Blake3 doFinalize(byte[] bArr, int i, int i2) {
        getHighSpeedVideoFpsRanges(bArr, i, i2);
        org.apache.commons.codec.digest.Blake3.EngineState.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, bArr, i, i2);
        return this;
    }

    public final byte[] doFinalize(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Requested bytes must be non-negative");
        }
        byte[] bArr = new byte[i];
        doFinalize(bArr);
        return bArr;
    }

    public final org.apache.commons.codec.digest.Blake3 reset() {
        org.apache.commons.codec.digest.Blake3.EngineState.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
        return this;
    }

    public final org.apache.commons.codec.digest.Blake3 update(byte[] bArr) {
        return update(bArr, 0, bArr.length);
    }

    public final org.apache.commons.codec.digest.Blake3 update(byte[] bArr, int i, int i2) {
        getHighSpeedVideoFpsRanges(bArr, i, i2);
        org.apache.commons.codec.digest.Blake3.EngineState.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, bArr, i, i2);
        return this;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i2 + i4] = (byte) (i >>> (i4 * 8));
        }
    }

    static /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int[] iArr2, int i, long j, int i2) {
        int[] copyOf = java.util.Arrays.copyOf(iArr, 16);
        java.lang.System.arraycopy(getHighSpeedVideoFpsRanges, 0, copyOf, 8, 4);
        copyOf[12] = (int) j;
        copyOf[13] = (int) (j >> 32);
        copyOf[14] = i;
        copyOf[15] = i2;
        for (int i3 = 0; i3 < 7; i3++) {
            byte[] bArr = getHighSpeedVideoSizes[i3];
            getHighResolutionOutputSizeshNQ4ISI(copyOf, 0, 4, 8, 12, iArr2[bArr[0]], iArr2[bArr[1]]);
            getHighResolutionOutputSizeshNQ4ISI(copyOf, 1, 5, 9, 13, iArr2[bArr[2]], iArr2[bArr[3]]);
            getHighResolutionOutputSizeshNQ4ISI(copyOf, 2, 6, 10, 14, iArr2[bArr[4]], iArr2[bArr[5]]);
            getHighResolutionOutputSizeshNQ4ISI(copyOf, 3, 7, 11, 15, iArr2[bArr[6]], iArr2[bArr[7]]);
            getHighResolutionOutputSizeshNQ4ISI(copyOf, 0, 5, 10, 15, iArr2[bArr[8]], iArr2[bArr[9]]);
            getHighResolutionOutputSizeshNQ4ISI(copyOf, 1, 6, 11, 12, iArr2[bArr[10]], iArr2[bArr[11]]);
            getHighResolutionOutputSizeshNQ4ISI(copyOf, 2, 7, 8, 13, iArr2[bArr[12]], iArr2[bArr[13]]);
            getHighResolutionOutputSizeshNQ4ISI(copyOf, 3, 4, 9, 14, iArr2[bArr[14]], iArr2[bArr[15]]);
        }
        for (int i4 = 0; i4 < copyOf.length / 2; i4++) {
            int i5 = i4 + 8;
            copyOf[i4] = copyOf[i4] ^ copyOf[i5];
            copyOf[i5] = copyOf[i5] ^ iArr[i4];
        }
        return copyOf;
    }

    static /* synthetic */ int[] Camera2StreamConfigurationMap(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        return org.apache.commons.codec.digest.Blake3.Output.getHighSpeedVideoFpsRanges(getHighResolutionOutputSizeshNQ4ISI(iArr, iArr2, iArr3, i));
    }
}
