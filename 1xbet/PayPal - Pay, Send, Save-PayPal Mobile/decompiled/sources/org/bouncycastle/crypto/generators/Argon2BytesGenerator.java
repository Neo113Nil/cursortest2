package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class Argon2BytesGenerator {
    private static final byte[] getHighSpeedVideoFpsRangesFor = new byte[4];
    private int Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.params.Argon2Parameters getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block[] getHighSpeedVideoSizes;

    static class Block {
        final long[] getHighResolutionOutputSizeshNQ4ISI;

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block2, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block3) {
            long[] jArr = block.getHighResolutionOutputSizeshNQ4ISI;
            long[] jArr2 = block2.getHighResolutionOutputSizeshNQ4ISI;
            long[] jArr3 = block3.getHighResolutionOutputSizeshNQ4ISI;
            for (int i = 0; i < 128; i++) {
                jArr[i] = jArr[i] ^ (jArr2[i] ^ jArr3[i]);
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block2) {
            long[] jArr = block.getHighResolutionOutputSizeshNQ4ISI;
            long[] jArr2 = block2.getHighResolutionOutputSizeshNQ4ISI;
            for (int i = 0; i < 128; i++) {
                jArr[i] = jArr[i] ^ jArr2[i];
            }
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block2) {
            java.lang.System.arraycopy(block2.getHighResolutionOutputSizeshNQ4ISI, 0, block.getHighResolutionOutputSizeshNQ4ISI, 0, 128);
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block2, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block3) {
            long[] jArr = block.getHighResolutionOutputSizeshNQ4ISI;
            long[] jArr2 = block2.getHighResolutionOutputSizeshNQ4ISI;
            long[] jArr3 = block3.getHighResolutionOutputSizeshNQ4ISI;
            for (int i = 0; i < 128; i++) {
                jArr[i] = jArr2[i] ^ jArr3[i];
            }
        }

        /* synthetic */ Block(byte b) {
            this();
        }

        private Block() {
            this.getHighResolutionOutputSizeshNQ4ISI = new long[128];
        }
    }

    static class FillBlock {
        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block Camera2StreamConfigurationMap;
        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block getHighResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block getHighSpeedVideoSizes;

        static /* synthetic */ void Camera2StreamConfigurationMap(org.bouncycastle.crypto.generators.Argon2BytesGenerator.FillBlock fillBlock, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block2, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block3) {
            org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block.getHighSpeedVideoFpsRanges(fillBlock.getHighResolutionOutputSizeshNQ4ISI, block, block2);
            org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block.getHighResolutionOutputSizeshNQ4ISI(fillBlock.getHighSpeedVideoSizes, fillBlock.getHighResolutionOutputSizeshNQ4ISI);
            fillBlock.Camera2StreamConfigurationMap();
            org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block.getHighResolutionOutputSizeshNQ4ISI(block3, fillBlock.getHighResolutionOutputSizeshNQ4ISI, fillBlock.getHighSpeedVideoSizes);
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.generators.Argon2BytesGenerator.FillBlock fillBlock, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block2, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block3) {
            org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block.getHighSpeedVideoFpsRanges(fillBlock.getHighResolutionOutputSizeshNQ4ISI, block, block2);
            org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block.getHighResolutionOutputSizeshNQ4ISI(fillBlock.getHighSpeedVideoSizes, fillBlock.getHighResolutionOutputSizeshNQ4ISI);
            fillBlock.Camera2StreamConfigurationMap();
            org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block.getHighSpeedVideoFpsRanges(block3, fillBlock.getHighResolutionOutputSizeshNQ4ISI, fillBlock.getHighSpeedVideoSizes);
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.generators.Argon2BytesGenerator.FillBlock fillBlock, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block, org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block2) {
            org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block.getHighResolutionOutputSizeshNQ4ISI(fillBlock.getHighSpeedVideoSizes, block);
            fillBlock.Camera2StreamConfigurationMap();
            org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block.getHighSpeedVideoFpsRanges(block2, block, fillBlock.getHighSpeedVideoSizes);
        }

        private void Camera2StreamConfigurationMap() {
            for (int i = 0; i < 8; i++) {
                int i2 = i * 16;
                org.bouncycastle.crypto.generators.Argon2BytesGenerator.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, i2, i2 + 1, i2 + 2, i2 + 3, i2 + 4, i2 + 5, i2 + 6, i2 + 7, i2 + 8, i2 + 9, i2 + 10, i2 + 11, i2 + 12, i2 + 13, i2 + 14, i2 + 15);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i3 * 2;
                org.bouncycastle.crypto.generators.Argon2BytesGenerator.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, i4, i4 + 1, i4 + 16, i4 + 17, i4 + 32, i4 + 33, i4 + 48, i4 + 49, i4 + 64, i4 + 65, i4 + 80, i4 + 81, i4 + 96, i4 + 97, i4 + 112, i4 + 113);
            }
        }

        /* synthetic */ FillBlock(byte b) {
            this();
        }

        private FillBlock() {
            byte b = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block(b);
            this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block(b);
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block(b);
            this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block(b);
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long[] jArr = block.getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges(jArr, i, i5, i9, i13);
        getHighSpeedVideoFpsRanges(jArr, i2, i6, i10, i14);
        getHighSpeedVideoFpsRanges(jArr, i3, i7, i11, i15);
        getHighSpeedVideoFpsRanges(jArr, i4, i8, i12, i16);
        getHighSpeedVideoFpsRanges(jArr, i, i6, i11, i16);
        getHighSpeedVideoFpsRanges(jArr, i2, i7, i12, i13);
        getHighSpeedVideoFpsRanges(jArr, i3, i8, i9, i14);
        getHighSpeedVideoFpsRanges(jArr, i4, i5, i10, i15);
    }

    public int generateBytes(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3;
        int i4;
        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block;
        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block2;
        long j;
        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Position position;
        int i5;
        int i6;
        int i7 = 4;
        if (i2 < 4) {
            throw new java.lang.IllegalStateException("output length less than 4");
        }
        byte[] bArr3 = new byte[1024];
        org.bouncycastle.crypto.digests.Blake2bDigest blake2bDigest = new org.bouncycastle.crypto.digests.Blake2bDigest(512);
        byte b = 0;
        org.bouncycastle.util.Pack.intToLittleEndian(new int[]{this.getHighResolutionOutputSizeshNQ4ISI.getLanes(), i2, this.getHighResolutionOutputSizeshNQ4ISI.getMemory(), this.getHighResolutionOutputSizeshNQ4ISI.getIterations(), this.getHighResolutionOutputSizeshNQ4ISI.getVersion(), this.getHighResolutionOutputSizeshNQ4ISI.getType()}, bArr3, 0);
        blake2bDigest.update(bArr3, 0, 24);
        getHighSpeedVideoFpsRangesFor(bArr3, blake2bDigest, bArr);
        getHighSpeedVideoFpsRangesFor(bArr3, blake2bDigest, this.getHighResolutionOutputSizeshNQ4ISI.getSalt());
        getHighSpeedVideoFpsRangesFor(bArr3, blake2bDigest, this.getHighResolutionOutputSizeshNQ4ISI.getSecret());
        getHighSpeedVideoFpsRangesFor(bArr3, blake2bDigest, this.getHighResolutionOutputSizeshNQ4ISI.getAdditional());
        byte[] bArr4 = new byte[72];
        blake2bDigest.doFinal(bArr4, 0);
        byte[] bArr5 = new byte[72];
        java.lang.System.arraycopy(bArr4, 0, bArr5, 0, 64);
        byte b2 = 1;
        bArr5[64] = 1;
        for (int i8 = 0; i8 < this.getHighResolutionOutputSizeshNQ4ISI.getLanes(); i8++) {
            org.bouncycastle.util.Pack.intToLittleEndian(i8, bArr4, 68);
            org.bouncycastle.util.Pack.intToLittleEndian(i8, bArr5, 68);
            getHighResolutionOutputSizeshNQ4ISI(bArr4, bArr3, 0, 1024);
            org.bouncycastle.util.Pack.littleEndianToLong(bArr3, 0, this.getHighSpeedVideoSizes[this.Camera2StreamConfigurationMap * i8].getHighResolutionOutputSizeshNQ4ISI);
            getHighResolutionOutputSizeshNQ4ISI(bArr5, bArr3, 0, 1024);
            org.bouncycastle.util.Pack.littleEndianToLong(bArr3, 0, this.getHighSpeedVideoSizes[(this.Camera2StreamConfigurationMap * i8) + 1].getHighResolutionOutputSizeshNQ4ISI);
        }
        org.bouncycastle.crypto.generators.Argon2BytesGenerator.FillBlock fillBlock = new org.bouncycastle.crypto.generators.Argon2BytesGenerator.FillBlock(b);
        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Position position2 = new org.bouncycastle.crypto.generators.Argon2BytesGenerator.Position();
        int i9 = 0;
        while (true) {
            long j2 = 0;
            if (i9 >= this.getHighResolutionOutputSizeshNQ4ISI.getIterations()) {
                break;
            }
            position2.getHighResolutionOutputSizeshNQ4ISI = i9;
            int i10 = b;
            while (i10 < i7) {
                position2.getHighSpeedVideoFpsRanges = i10;
                int i11 = b;
                while (i11 < this.getHighResolutionOutputSizeshNQ4ISI.getLanes()) {
                    position2.getHighSpeedVideoSizes = i11;
                    byte b3 = (this.getHighResolutionOutputSizeshNQ4ISI.getType() == b2 || (this.getHighResolutionOutputSizeshNQ4ISI.getType() == 2 && position2.getHighResolutionOutputSizeshNQ4ISI == 0 && position2.getHighSpeedVideoFpsRanges < 2)) ? b2 : b;
                    int i12 = (position2.getHighResolutionOutputSizeshNQ4ISI == 0 && position2.getHighSpeedVideoFpsRanges == 0) ? 2 : b;
                    int i13 = (position2.getHighSpeedVideoSizes * this.Camera2StreamConfigurationMap) + (position2.getHighSpeedVideoFpsRanges * this.getHighSpeedVideoFpsRanges) + i12;
                    int i14 = this.Camera2StreamConfigurationMap;
                    int i15 = i13 % i14 == 0 ? (i14 + i13) - b2 : i13 - 1;
                    if (b3 != 0) {
                        block = fillBlock.getHighSpeedVideoFpsRangesFor;
                        org.bouncycastle.util.Arrays.fill(block.getHighResolutionOutputSizeshNQ4ISI, j2);
                        block2 = fillBlock.Camera2StreamConfigurationMap;
                        i3 = i15;
                        org.bouncycastle.util.Arrays.fill(block2.getHighResolutionOutputSizeshNQ4ISI, j2);
                        block2.getHighResolutionOutputSizeshNQ4ISI[0] = position2.getHighResolutionOutputSizeshNQ4ISI & 4294967295L;
                        block2.getHighResolutionOutputSizeshNQ4ISI[1] = position2.getHighSpeedVideoSizes & 4294967295L;
                        block2.getHighResolutionOutputSizeshNQ4ISI[2] = position2.getHighSpeedVideoFpsRanges & 4294967295L;
                        block2.getHighResolutionOutputSizeshNQ4ISI[3] = this.getHighSpeedVideoSizes.length & 4294967295L;
                        i4 = 4;
                        block2.getHighResolutionOutputSizeshNQ4ISI[4] = this.getHighResolutionOutputSizeshNQ4ISI.getIterations() & 4294967295L;
                        block2.getHighResolutionOutputSizeshNQ4ISI[5] = this.getHighResolutionOutputSizeshNQ4ISI.getType() & 4294967295L;
                        if (position2.getHighResolutionOutputSizeshNQ4ISI == 0 && position2.getHighSpeedVideoFpsRanges == 0) {
                            long[] jArr = block2.getHighResolutionOutputSizeshNQ4ISI;
                            jArr[6] = jArr[6] + 1;
                            org.bouncycastle.crypto.generators.Argon2BytesGenerator.FillBlock.getHighResolutionOutputSizeshNQ4ISI(fillBlock, block2, block);
                            org.bouncycastle.crypto.generators.Argon2BytesGenerator.FillBlock.getHighResolutionOutputSizeshNQ4ISI(fillBlock, block, block);
                        }
                    } else {
                        i3 = i15;
                        i4 = 4;
                        block = null;
                        block2 = null;
                    }
                    boolean z = (position2.getHighResolutionOutputSizeshNQ4ISI == 0 || this.getHighResolutionOutputSizeshNQ4ISI.getVersion() == 16) ? false : true;
                    while (i12 < this.getHighSpeedVideoFpsRanges) {
                        if (b3 != 0) {
                            int i16 = i12 % 128;
                            if (i16 == 0) {
                                long[] jArr2 = block2.getHighResolutionOutputSizeshNQ4ISI;
                                jArr2[6] = jArr2[6] + 1;
                                org.bouncycastle.crypto.generators.Argon2BytesGenerator.FillBlock.getHighResolutionOutputSizeshNQ4ISI(fillBlock, block2, block);
                                org.bouncycastle.crypto.generators.Argon2BytesGenerator.FillBlock.getHighResolutionOutputSizeshNQ4ISI(fillBlock, block, block);
                            }
                            j = block.getHighResolutionOutputSizeshNQ4ISI[i16];
                        } else {
                            j = this.getHighSpeedVideoSizes[i3].getHighResolutionOutputSizeshNQ4ISI[0];
                        }
                        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block3 = block2;
                        byte b4 = b3;
                        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block4 = block;
                        int lanes = (int) ((j >>> 32) % this.getHighResolutionOutputSizeshNQ4ISI.getLanes());
                        if (position2.getHighResolutionOutputSizeshNQ4ISI == 0 && position2.getHighSpeedVideoFpsRanges == 0) {
                            lanes = position2.getHighSpeedVideoSizes;
                        }
                        boolean z2 = lanes == position2.getHighSpeedVideoSizes;
                        int i17 = position2.getHighResolutionOutputSizeshNQ4ISI;
                        int i18 = position2.getHighSpeedVideoFpsRanges;
                        if (i17 == 0) {
                            i6 = z2 ? ((i18 * this.getHighSpeedVideoFpsRanges) + i12) - 1 : (i18 * this.getHighSpeedVideoFpsRanges) + (i12 != 0 ? 0 : -1);
                            position = position2;
                            i5 = 0;
                        } else {
                            int i19 = this.getHighSpeedVideoFpsRanges;
                            position = position2;
                            int i20 = this.Camera2StreamConfigurationMap;
                            int i21 = i20 - i19;
                            i5 = ((i18 + 1) * i19) % i20;
                            i6 = z2 ? (i21 + i12) - 1 : i21 + (i12 != 0 ? 0 : -1);
                        }
                        long j3 = j & 4294967295L;
                        int i22 = i10;
                        int i23 = i9;
                        int i24 = this.Camera2StreamConfigurationMap;
                        int i25 = ((int) (i5 + ((i6 - 1) - ((i6 * ((j3 * j3) >>> 32)) >>> 32)))) % i24;
                        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block[] blockArr = this.getHighSpeedVideoSizes;
                        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block5 = blockArr[i3];
                        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block6 = blockArr[(i24 * lanes) + i25];
                        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block7 = blockArr[i13];
                        if (z) {
                            org.bouncycastle.crypto.generators.Argon2BytesGenerator.FillBlock.Camera2StreamConfigurationMap(fillBlock, block5, block6, block7);
                        } else {
                            org.bouncycastle.crypto.generators.Argon2BytesGenerator.FillBlock.getHighSpeedVideoFpsRangesFor(fillBlock, block5, block6, block7);
                        }
                        i12++;
                        block2 = block3;
                        i3 = i13;
                        i10 = i22;
                        b3 = b4;
                        block = block4;
                        i9 = i23;
                        i13++;
                        position2 = position;
                    }
                    i11++;
                    i7 = i4;
                    b = 0;
                    b2 = 1;
                    j2 = 0;
                }
                i10++;
                b = 0;
                b2 = 1;
                j2 = 0;
            }
            i9++;
            b = 0;
            b2 = 1;
        }
        org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block8 = this.getHighSpeedVideoSizes[this.Camera2StreamConfigurationMap - 1];
        for (int i26 = 1; i26 < this.getHighResolutionOutputSizeshNQ4ISI.getLanes(); i26++) {
            int i27 = this.Camera2StreamConfigurationMap;
            org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block.getHighSpeedVideoFpsRanges(block8, this.getHighSpeedVideoSizes[(i26 * i27) + (i27 - 1)]);
        }
        int i28 = 0;
        org.bouncycastle.util.Pack.longToLittleEndian(block8.getHighResolutionOutputSizeshNQ4ISI, bArr3, 0);
        getHighResolutionOutputSizeshNQ4ISI(bArr3, bArr2, i, i2);
        if (this.getHighSpeedVideoSizes != null) {
            while (true) {
                org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block[] blockArr2 = this.getHighSpeedVideoSizes;
                if (i28 >= blockArr2.length) {
                    break;
                }
                org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block block9 = blockArr2[i28];
                if (block9 != null) {
                    org.bouncycastle.util.Arrays.fill(block9.getHighResolutionOutputSizeshNQ4ISI, 0L);
                }
                i28++;
            }
        }
        return i2;
    }

    public void init(org.bouncycastle.crypto.params.Argon2Parameters argon2Parameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = argon2Parameters;
        if (argon2Parameters.getLanes() <= 0) {
            throw new java.lang.IllegalStateException("lanes must be greater than 1");
        }
        if (argon2Parameters.getLanes() > 16777216) {
            throw new java.lang.IllegalStateException("lanes must be less than 16777216");
        }
        if (argon2Parameters.getMemory() < argon2Parameters.getLanes() * 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("memory is less than: ");
            sb.append(argon2Parameters.getLanes() * 2);
            sb.append(" expected ");
            sb.append(argon2Parameters.getLanes() * 2);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (argon2Parameters.getIterations() <= 0) {
            throw new java.lang.IllegalStateException("iterations is less than: 1");
        }
        int memory = argon2Parameters.getMemory();
        if (memory < argon2Parameters.getLanes() * 8) {
            memory = argon2Parameters.getLanes() * 8;
        }
        int lanes = memory / (argon2Parameters.getLanes() * 4);
        this.getHighSpeedVideoFpsRanges = lanes;
        this.Camera2StreamConfigurationMap = lanes * 4;
        this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block[lanes * argon2Parameters.getLanes() * 4];
        byte b = 0;
        int i = 0;
        while (true) {
            org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block[] blockArr = this.getHighSpeedVideoSizes;
            if (i >= blockArr.length) {
                return;
            }
            blockArr[i] = new org.bouncycastle.crypto.generators.Argon2BytesGenerator.Block(b);
            i++;
        }
    }

    public int generateBytes(char[] cArr, byte[] bArr, int i, int i2) {
        return generateBytes(this.getHighResolutionOutputSizeshNQ4ISI.getCharToByteConverter().convert(cArr), bArr, i, i2);
    }

    public int generateBytes(char[] cArr, byte[] bArr) {
        return generateBytes(this.getHighResolutionOutputSizeshNQ4ISI.getCharToByteConverter().convert(cArr), bArr);
    }

    public int generateBytes(byte[] bArr, byte[] bArr2) {
        return generateBytes(bArr, bArr2, 0, bArr2.length);
    }

    private static void getHighSpeedVideoSizes(long[] jArr, int i, int i2, int i3, int i4) {
        long j = jArr[i];
        long j2 = jArr[i2];
        long j3 = j + j2 + ((j & 4294967295L) * 2 * (4294967295L & j2));
        long rotateRight = org.bouncycastle.util.Longs.rotateRight(jArr[i3] ^ j3, i4);
        jArr[i] = j3;
        jArr[i3] = rotateRight;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2, int i, int i2) {
        byte[] bArr3 = new byte[4];
        org.bouncycastle.util.Pack.intToLittleEndian(i2, bArr3, 0);
        if (i2 <= 64) {
            org.bouncycastle.crypto.digests.Blake2bDigest blake2bDigest = new org.bouncycastle.crypto.digests.Blake2bDigest(i2 * 8);
            blake2bDigest.update(bArr3, 0, 4);
            blake2bDigest.update(bArr, 0, bArr.length);
            blake2bDigest.doFinal(bArr2, i);
            return;
        }
        org.bouncycastle.crypto.digests.Blake2bDigest blake2bDigest2 = new org.bouncycastle.crypto.digests.Blake2bDigest(512);
        byte[] bArr4 = new byte[64];
        blake2bDigest2.update(bArr3, 0, 4);
        blake2bDigest2.update(bArr, 0, bArr.length);
        blake2bDigest2.doFinal(bArr4, 0);
        java.lang.System.arraycopy(bArr4, 0, bArr2, i, 32);
        int i3 = i + 32;
        int i4 = ((i2 + 31) / 32) - 2;
        int i5 = 2;
        while (i5 <= i4) {
            blake2bDigest2.update(bArr4, 0, 64);
            blake2bDigest2.doFinal(bArr4, 0);
            java.lang.System.arraycopy(bArr4, 0, bArr2, i3, 32);
            i5++;
            i3 += 32;
        }
        org.bouncycastle.crypto.digests.Blake2bDigest blake2bDigest3 = new org.bouncycastle.crypto.digests.Blake2bDigest((i2 - (i4 * 32)) * 8);
        blake2bDigest3.update(bArr4, 0, 64);
        blake2bDigest3.doFinal(bArr2, i3);
    }

    private static void getHighSpeedVideoFpsRangesFor(byte[] bArr, org.bouncycastle.crypto.Digest digest, byte[] bArr2) {
        if (bArr2 == null) {
            digest.update(getHighSpeedVideoFpsRangesFor, 0, 4);
            return;
        }
        org.bouncycastle.util.Pack.intToLittleEndian(bArr2.length, bArr, 0);
        digest.update(bArr, 0, 4);
        digest.update(bArr2, 0, bArr2.length);
    }

    private static void getHighSpeedVideoFpsRanges(long[] jArr, int i, int i2, int i3, int i4) {
        getHighSpeedVideoSizes(jArr, i, i2, i4, 32);
        getHighSpeedVideoSizes(jArr, i3, i4, i2, 24);
        getHighSpeedVideoSizes(jArr, i, i2, i4, 16);
        getHighSpeedVideoSizes(jArr, i3, i4, i2, 63);
    }

    static class Position {
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;

        Position() {
        }
    }
}
