package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public abstract class LongDigest implements org.bouncycastle.crypto.ExtendedDigest, org.bouncycastle.util.Memoable, org.bouncycastle.crypto.digests.EncodableDigest {
    static final long[] getHighSpeedVideoFpsRangesFor = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    private long Camera2StreamConfigurationMap;
    protected long H1;
    protected long H2;
    protected long H3;
    protected long H4;
    protected long H5;
    protected long H6;
    protected long H7;
    protected long H8;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private long getHighSpeedVideoFpsRanges;
    private long[] getHighSpeedVideoSizes;
    private byte[] getInputFormats;
    private int getOutputMinFrameDuration;

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    protected void processBlock() {
        org.bouncycastle.crypto.digests.LongDigest longDigest = this;
        getHighSpeedVideoSizes();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = longDigest.getHighSpeedVideoSizes;
            long j = jArr[i - 2];
            long j2 = ((((j >>> 61) | (j << 3)) ^ ((j << 45) | (j >>> 19))) ^ (j >>> 6)) + jArr[i - 7];
            long j3 = jArr[i - 15];
            jArr[i] = j2 + ((((j3 >>> 8) | (j3 << 56)) ^ ((j3 << 63) | (j3 >>> 1))) ^ (j3 >>> 7)) + jArr[i - 16];
        }
        long j4 = longDigest.H1;
        long j5 = longDigest.H2;
        long j6 = longDigest.H3;
        long j7 = longDigest.H4;
        long j8 = longDigest.H5;
        long j9 = longDigest.H6;
        long j10 = j4;
        long j11 = longDigest.H7;
        long j12 = j5;
        long j13 = longDigest.H8;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 10) {
            long j14 = j6;
            long j15 = ((~j8) & j11) ^ (j9 & j8);
            long[] jArr2 = getHighSpeedVideoFpsRangesFor;
            long j16 = jArr2[i3];
            long[] jArr3 = longDigest.getHighSpeedVideoSizes;
            int i4 = i3 + 1;
            long j17 = j13 + (((j8 >>> 41) | (j8 << 23)) ^ (((j8 << 50) | (j8 >>> 14)) ^ ((j8 << 46) | (j8 >>> 18)))) + j15 + j16 + jArr3[i3];
            long j18 = j7 + j17;
            long j19 = j10 & j12;
            long j20 = j17 + (((j10 >>> 39) | (j10 << 25)) ^ (((j10 << 36) | (j10 >>> 28)) ^ ((j10 << 30) | (j10 >>> 34)))) + (((j10 & j14) ^ j19) ^ (j12 & j14));
            int i5 = i3 + 2;
            long j21 = j11 + (((j18 >>> 41) | (j18 << 23)) ^ (((j18 << 50) | (j18 >>> 14)) ^ ((j18 << 46) | (j18 >>> 18)))) + (((~j18) & j9) ^ (j8 & j18)) + jArr2[i4] + jArr3[i4];
            long j22 = j14 + j21;
            long j23 = j20 & j10;
            long j24 = j21 + (((j20 >>> 39) | (j20 << 25)) ^ (((j20 << 36) | (j20 >>> 28)) ^ ((j20 << 30) | (j20 >>> 34)))) + (((j20 & j12) ^ j23) ^ j19);
            int i6 = i2;
            int i7 = i3 + 3;
            long j25 = j9 + (((j22 >>> 41) | (j22 << 23)) ^ (((j22 << 50) | (j22 >>> 14)) ^ ((j22 << 46) | (j22 >>> 18)))) + (((~j22) & j8) ^ (j18 & j22)) + jArr2[i5] + jArr3[i5];
            long j26 = j12 + j25;
            long j27 = j24 & j20;
            long j28 = j25 + (((j24 >>> 39) | (j24 << 25)) ^ (((j24 << 36) | (j24 >>> 28)) ^ ((j24 << 30) | (j24 >>> 34)))) + (((j24 & j10) ^ j27) ^ j23);
            int i8 = i3 + 4;
            long j29 = j8 + (((j26 >>> 41) | (j26 << 23)) ^ (((j26 << 50) | (j26 >>> 14)) ^ ((j26 << 46) | (j26 >>> 18)))) + (((~j26) & j18) ^ (j22 & j26)) + jArr2[i7] + jArr3[i7];
            long j30 = j10 + j29;
            long j31 = j28 & j24;
            long j32 = j29 + (((j28 >>> 39) | (j28 << 25)) ^ (((j28 << 36) | (j28 >>> 28)) ^ ((j28 << 30) | (j28 >>> 34)))) + (((j28 & j20) ^ j31) ^ j27);
            int i9 = i3 + 5;
            long j33 = j18 + (((j30 >>> 41) | (j30 << 23)) ^ (((j30 << 50) | (j30 >>> 14)) ^ ((j30 << 46) | (j30 >>> 18)))) + (((~j30) & j22) ^ (j26 & j30)) + jArr2[i8] + jArr3[i8];
            long j34 = j20 + j33;
            long j35 = j32 & j28;
            long j36 = j33 + (((j32 >>> 39) | (j32 << 25)) ^ (((j32 << 36) | (j32 >>> 28)) ^ ((j32 << 30) | (j32 >>> 34)))) + (((j32 & j24) ^ j35) ^ j31);
            int i10 = i3 + 6;
            long j37 = j22 + (((j34 >>> 41) | (j34 << 23)) ^ (((j34 << 50) | (j34 >>> 14)) ^ ((j34 << 46) | (j34 >>> 18)))) + (((~j34) & j26) ^ (j30 & j34)) + jArr2[i9] + jArr3[i9];
            long j38 = j24 + j37;
            long j39 = j36 & j32;
            long j40 = j37 + (((j36 >>> 39) | (j36 << 25)) ^ (((j36 << 36) | (j36 >>> 28)) ^ ((j36 << 30) | (j36 >>> 34)))) + (((j36 & j28) ^ j39) ^ j35);
            int i11 = i3 + 7;
            long j41 = j26 + (((j38 >>> 41) | (j38 << 23)) ^ (((j38 << 50) | (j38 >>> 14)) ^ ((j38 << 46) | (j38 >>> 18)))) + (((~j38) & j30) ^ (j34 & j38)) + jArr2[i10] + jArr3[i10];
            long j42 = j28 + j41;
            long j43 = j40 & j36;
            j12 = j41 + (((j40 >>> 39) | (j40 << 25)) ^ (((j40 << 36) | (j40 >>> 28)) ^ ((j40 << 30) | (j40 >>> 34)))) + (((j40 & j32) ^ j43) ^ j39);
            i3 += 8;
            long j44 = j30 + (((j42 >>> 41) | (j42 << 23)) ^ (((j42 << 50) | (j42 >>> 14)) ^ ((j42 << 46) | (j42 >>> 18)))) + (((~j42) & j34) ^ (j38 & j42)) + jArr2[i11] + jArr3[i11];
            long j45 = (((j12 >>> 39) | (j12 << 25)) ^ (((j12 << 36) | (j12 >>> 28)) ^ ((j12 << 30) | (j12 >>> 34)))) + (((j12 & j36) ^ (j12 & j40)) ^ j43) + j44;
            long j46 = j32 + j44;
            j6 = j40;
            j10 = j45;
            i2 = i6 + 1;
            j13 = j34;
            j9 = j42;
            j7 = j36;
            longDigest = this;
            j11 = j38;
            j8 = j46;
        }
        longDigest.H1 += j10;
        longDigest.H2 += j12;
        longDigest.H3 += j6;
        longDigest.H4 += j7;
        longDigest.H5 += j8;
        longDigest.H6 += j9;
        longDigest.H7 += j11;
        longDigest.H8 += j13;
        longDigest.getHighResolutionOutputSizeshNQ4ISI = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            longDigest.getHighSpeedVideoSizes[i12] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (this.getOutputMinFrameDuration != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.getInputFormats.length) {
            processWord(bArr, i);
            byte[] bArr2 = this.getInputFormats;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.getHighSpeedVideoFpsRanges += bArr2.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.getInputFormats;
        int i = this.getOutputMinFrameDuration;
        int i2 = i + 1;
        this.getOutputMinFrameDuration = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            processWord(bArr, 0);
            this.getOutputMinFrameDuration = 0;
        }
        this.getHighSpeedVideoFpsRanges++;
    }

    protected void restoreState(byte[] bArr) {
        int bigEndianToInt = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 8);
        this.getOutputMinFrameDuration = bigEndianToInt;
        java.lang.System.arraycopy(bArr, 0, this.getInputFormats, 0, bigEndianToInt);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Pack.bigEndianToLong(bArr, 12);
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Pack.bigEndianToLong(bArr, 20);
        this.H1 = org.bouncycastle.util.Pack.bigEndianToLong(bArr, 28);
        this.H2 = org.bouncycastle.util.Pack.bigEndianToLong(bArr, 36);
        this.H3 = org.bouncycastle.util.Pack.bigEndianToLong(bArr, 44);
        this.H4 = org.bouncycastle.util.Pack.bigEndianToLong(bArr, 52);
        this.H5 = org.bouncycastle.util.Pack.bigEndianToLong(bArr, 60);
        this.H6 = org.bouncycastle.util.Pack.bigEndianToLong(bArr, 68);
        this.H7 = org.bouncycastle.util.Pack.bigEndianToLong(bArr, 76);
        this.H8 = org.bouncycastle.util.Pack.bigEndianToLong(bArr, 84);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 92);
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI; i++) {
            this.getHighSpeedVideoSizes[i] = org.bouncycastle.util.Pack.bigEndianToLong(bArr, (i * 8) + 96);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.getHighSpeedVideoFpsRanges = 0L;
        this.Camera2StreamConfigurationMap = 0L;
        int i = 0;
        this.getOutputMinFrameDuration = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.getInputFormats;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        while (true) {
            long[] jArr = this.getHighSpeedVideoSizes;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    protected void processWord(byte[] bArr, int i) {
        this.getHighSpeedVideoSizes[this.getHighResolutionOutputSizeshNQ4ISI] = org.bouncycastle.util.Pack.bigEndianToLong(bArr, i);
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i2 == 16) {
            processBlock();
        }
    }

    protected void processLength(long j, long j2) {
        if (this.getHighResolutionOutputSizeshNQ4ISI > 14) {
            processBlock();
        }
        long[] jArr = this.getHighSpeedVideoSizes;
        jArr[14] = j2;
        jArr[15] = j;
    }

    protected void populateState(byte[] bArr) {
        java.lang.System.arraycopy(this.getInputFormats, 0, bArr, 0, this.getOutputMinFrameDuration);
        org.bouncycastle.util.Pack.intToBigEndian(this.getOutputMinFrameDuration, bArr, 8);
        org.bouncycastle.util.Pack.longToBigEndian(this.getHighSpeedVideoFpsRanges, bArr, 12);
        org.bouncycastle.util.Pack.longToBigEndian(this.Camera2StreamConfigurationMap, bArr, 20);
        org.bouncycastle.util.Pack.longToBigEndian(this.H1, bArr, 28);
        org.bouncycastle.util.Pack.longToBigEndian(this.H2, bArr, 36);
        org.bouncycastle.util.Pack.longToBigEndian(this.H3, bArr, 44);
        org.bouncycastle.util.Pack.longToBigEndian(this.H4, bArr, 52);
        org.bouncycastle.util.Pack.longToBigEndian(this.H5, bArr, 60);
        org.bouncycastle.util.Pack.longToBigEndian(this.H6, bArr, 68);
        org.bouncycastle.util.Pack.longToBigEndian(this.H7, bArr, 76);
        org.bouncycastle.util.Pack.longToBigEndian(this.H8, bArr, 84);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI, bArr, 92);
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI; i++) {
            org.bouncycastle.util.Pack.longToBigEndian(this.getHighSpeedVideoSizes[i], bArr, (i * 8) + 96);
        }
    }

    protected int getEncodedStateSize() {
        return (this.getHighResolutionOutputSizeshNQ4ISI * 8) + 96;
    }

    public void finish() {
        getHighSpeedVideoSizes();
        long j = this.getHighSpeedVideoFpsRanges;
        long j2 = this.Camera2StreamConfigurationMap;
        byte b = Byte.MIN_VALUE;
        while (true) {
            update(b);
            if (this.getOutputMinFrameDuration == 0) {
                processLength(j << 3, j2);
                processBlock();
                return;
            }
            b = 0;
        }
    }

    protected void copyIn(org.bouncycastle.crypto.digests.LongDigest longDigest) {
        byte[] bArr = longDigest.getInputFormats;
        java.lang.System.arraycopy(bArr, 0, this.getInputFormats, 0, bArr.length);
        this.getOutputMinFrameDuration = longDigest.getOutputMinFrameDuration;
        this.getHighSpeedVideoFpsRanges = longDigest.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = longDigest.Camera2StreamConfigurationMap;
        this.H1 = longDigest.H1;
        this.H2 = longDigest.H2;
        this.H3 = longDigest.H3;
        this.H4 = longDigest.H4;
        this.H5 = longDigest.H5;
        this.H6 = longDigest.H6;
        this.H7 = longDigest.H7;
        this.H8 = longDigest.H8;
        long[] jArr = longDigest.getHighSpeedVideoSizes;
        java.lang.System.arraycopy(jArr, 0, this.getHighSpeedVideoSizes, 0, jArr.length);
        this.getHighResolutionOutputSizeshNQ4ISI = longDigest.getHighResolutionOutputSizeshNQ4ISI;
    }

    private void getHighSpeedVideoSizes() {
        long j = this.getHighSpeedVideoFpsRanges;
        if (j > 2305843009213693951L) {
            this.Camera2StreamConfigurationMap += j >>> 61;
            this.getHighSpeedVideoFpsRanges = j & 2305843009213693951L;
        }
    }

    protected LongDigest(org.bouncycastle.crypto.digests.LongDigest longDigest) {
        this.getInputFormats = new byte[8];
        this.getHighSpeedVideoSizes = new long[80];
        copyIn(longDigest);
    }

    protected LongDigest() {
        this.getInputFormats = new byte[8];
        this.getHighSpeedVideoSizes = new long[80];
        this.getOutputMinFrameDuration = 0;
        reset();
    }
}
