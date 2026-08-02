package util.h.xy.eh;

/* loaded from: classes5.dex */
public abstract class a implements util.h.xy.ef.e, util.h.xy.fb.c {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private byte[] Camera2StreamConfigurationMap;
    private long[] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizesFor;
    private long getInputFormats;
    private long getOutputFormats;
    private int getOutputMinFrameDuration;

    /* renamed from: ʻ, reason: contains not printable characters */
    protected long f2155;

    /* renamed from: ʽ, reason: contains not printable characters */
    protected long f2156;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected long f2157;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected long f2158;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected long f2159;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected long f2160;

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected long f2161;

    /* renamed from: ι, reason: contains not printable characters */
    protected long f2162;
    static final long[] getHighSpeedVideoSizes = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    private static int getHighSpeedVideoFpsRanges = 31;

    static {
        int i = 31 % 2;
    }

    private static long getHighSpeedVideoFpsRangesFor(long j) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (((i | 95) << 1) - (i ^ 95)) % 128;
        getHighSpeedVideoFpsRanges = (((i | 97) << 1) - (i ^ 97)) % 128;
        return (((j >>> 18) | (j << 46)) ^ ((j << 50) | (j >>> 14))) ^ ((j >>> 41) | (j << 23));
    }

    private static long Camera2StreamConfigurationMap(long j) {
        long j2;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 75) << 1) - (i ^ 75);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            j2 = (((j >>> 119) / (j << 27)) - ((j << 104) - (j << 85))) & ((j << 107) - (j << 103));
        } else {
            j2 = (((j >>> 34) | (j << 30)) ^ ((j << 36) | (j >>> 28))) ^ ((j >>> 39) | (j << 25));
        }
        int i3 = ((i | 45) << 1) - (i ^ 45);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    private static long Camera2StreamConfigurationMap(long j, long j2, long j3) {
        int i = getHighSpeedVideoFpsRanges + 9;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return ((j * j2) / (j / j3)) & (j2 * j3);
        }
        return ((j & j2) ^ (j & j3)) ^ (j2 & j3);
    }

    private static long getHighResolutionOutputSizeshNQ4ISI(long j, long j2, long j3) {
        int i = getHighSpeedVideoFpsRanges + 73;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        long j4 = j2 & j;
        return i % 2 != 0 ? j4 / ((j % (-1)) * j3) : ((~j) & j3) ^ j4;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    protected void m26580() {
        getHighSpeedVideoFpsRangesFor();
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i ^ 85) + ((i & 85) << 1)) % 128;
        int i2 = 16;
        while (i2 <= 79) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
            long[] jArr = this.getHighSpeedVideoFpsRangesFor;
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i3 = ~identityHashCode;
            int i4 = ~((i3 ^ 1) | (i3 & 1));
            int i5 = (((i2 * 603) - 604) - (~(((i4 ^ i2) | (i4 & i2)) * (-602)))) - 1;
            int i6 = ~i2;
            int i7 = (~((identityHashCode ^ 1) | (identityHashCode & 1))) | (~((i6 ^ 1) | (i6 & 1)));
            int i8 = (i3 ^ (-2)) | (i3 & (-2));
            int i9 = ~((i8 ^ i2) | (i8 & i2));
            int i10 = ((i7 ^ i9) | (i7 & i9)) * (-301);
            long j = jArr[(i5 ^ i10) + ((i10 & i5) << 1) + ((~((i3 ^ i2) | (i3 & i2))) * 301)];
            int i11 = getHighResolutionOutputSizeshNQ4ISI;
            int i12 = ((i11 ^ 67) + ((i11 & 67) << 1)) % 128;
            getHighSpeedVideoFpsRanges = i12;
            getHighResolutionOutputSizeshNQ4ISI = ((i12 & 1) + (i12 | 1)) % 128;
            long j2 = (((j >>> 61) | (j << 3)) ^ ((j << 45) | (j >>> 19))) ^ (j >>> 6);
            long[] jArr2 = this.getHighSpeedVideoFpsRangesFor;
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i13 = -(-(i2 * (-112)));
            int i14 = (i13 ^ 784) + ((i13 & 784) << 1);
            int i15 = ~identityHashCode2;
            int i16 = ~((i15 & i6) | (i6 ^ i15));
            int i17 = ((i16 & (-7)) | (i16 ^ (-7))) * 226;
            int i18 = ((i14 | i17) << 1) - (i14 ^ i17);
            int i19 = ~((i2 ^ 6) | (i2 & 6));
            int i20 = ~((identityHashCode2 & 6) | (identityHashCode2 ^ 6));
            int i21 = i15 | i6;
            int i22 = -(-(((~((i21 ^ (-7)) | (i21 & (-7)))) | (i19 ^ i20) | (i20 & i19)) * (-113)));
            int i23 = (i18 & i22) + (i22 | i18);
            int i24 = -(-((~(identityHashCode2 | i6)) * 113));
            long j3 = jArr2[(i23 ^ i24) + ((i24 & i23) << 1)];
            long[] jArr3 = this.getHighSpeedVideoFpsRangesFor;
            long j4 = jArr3[i2 - 15];
            int i25 = getHighResolutionOutputSizeshNQ4ISI;
            int i26 = i25 + 17;
            getHighSpeedVideoFpsRanges = i26 % 128;
            long j5 = i26 % 2 == 0 ? (((j4 >>> 41) % (j4 << 1)) - ((j4 << 6) | (j4 << 126))) % (j4 << 43) : (((j4 << 63) | (j4 >>> 1)) ^ ((j4 << 56) | (j4 >>> 8))) ^ (j4 >>> 7);
            getHighSpeedVideoFpsRanges = ((i25 ^ 45) + ((i25 & 45) << 1)) % 128;
            int identityHashCode3 = java.lang.System.identityHashCode(this);
            int i27 = (i2 * (-657)) - 10544;
            int i28 = ~((i2 & 15) | (i2 ^ 15));
            int i29 = ~((i6 & (-16)) | (i6 ^ (-16)));
            int i30 = (i28 ^ i29) | (i28 & i29);
            int i31 = ~((identityHashCode3 ^ (-16)) | (identityHashCode3 & (-16)));
            int i32 = -(-(((i30 ^ i31) | (i30 & i31)) * (-658)));
            int i33 = ((i27 | i32) << 1) - (i27 ^ i32);
            int i34 = i29 * 658;
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            int i36 = ((~(identityHashCode3 | (-16))) | i29) * 658;
            jArr[i2] = j2 + j3 + j5 + jArr3[((i35 | i36) << 1) - (i36 ^ i35)];
            int i37 = (i2 ^ (-125)) + ((i2 & (-125)) << 1);
            i2 = ((i37 | 126) << 1) - (126 ^ i37);
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 39) % 128;
        }
        long j6 = this.f2160;
        long j7 = this.f2158;
        long j8 = this.f2157;
        long j9 = this.f2161;
        long j10 = this.f2159;
        long j11 = this.f2155;
        long j12 = j7;
        long j13 = this.f2162;
        long j14 = this.f2156;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 83) % 128;
        int i38 = 0;
        int i39 = 0;
        long j15 = j9;
        long j16 = j10;
        long j17 = j11;
        int i40 = 0;
        long j18 = j8;
        while (i40 < 10) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
            long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(j16);
            long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(j16, j17, j13);
            long[] jArr4 = getHighSpeedVideoSizes;
            int i41 = i39 + 1;
            long j19 = j14 + highSpeedVideoFpsRangesFor + highResolutionOutputSizeshNQ4ISI + jArr4[i39] + this.getHighSpeedVideoFpsRangesFor[i39];
            long j20 = j15 + j19;
            long Camera2StreamConfigurationMap = j19 + Camera2StreamConfigurationMap(j6) + Camera2StreamConfigurationMap(j6, j12, j18);
            int i42 = i39 + 2;
            long highSpeedVideoFpsRangesFor2 = j13 + getHighSpeedVideoFpsRangesFor(j20) + getHighResolutionOutputSizeshNQ4ISI(j20, j16, j17) + jArr4[i41] + this.getHighSpeedVideoFpsRangesFor[i41];
            long j21 = j18 + highSpeedVideoFpsRangesFor2;
            long Camera2StreamConfigurationMap2 = highSpeedVideoFpsRangesFor2 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap) + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, j6, j12);
            int i43 = ((i42 | 120) << 1) - (i42 ^ 120);
            int i44 = ((i43 | (-119)) << 1) - (i43 ^ (-119));
            long highSpeedVideoFpsRangesFor3 = j17 + getHighSpeedVideoFpsRangesFor(j21) + getHighResolutionOutputSizeshNQ4ISI(j21, j20, j16) + jArr4[i42] + this.getHighSpeedVideoFpsRangesFor[i42];
            long j22 = j12 + highSpeedVideoFpsRangesFor3;
            long Camera2StreamConfigurationMap3 = highSpeedVideoFpsRangesFor3 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2) + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap, j6);
            int i45 = ((i44 | (-5)) << 1) - (i44 ^ (-5));
            int i46 = (i45 ^ 6) + ((i45 & 6) << 1);
            long highSpeedVideoFpsRangesFor4 = j16 + getHighSpeedVideoFpsRangesFor(j22) + getHighResolutionOutputSizeshNQ4ISI(j22, j21, j20) + jArr4[i44] + this.getHighSpeedVideoFpsRangesFor[i44];
            long j23 = j6 + highSpeedVideoFpsRangesFor4;
            long Camera2StreamConfigurationMap4 = highSpeedVideoFpsRangesFor4 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap3) + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap3, Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap);
            int i47 = (i46 ^ 1) + ((i46 & 1) << 1);
            long highSpeedVideoFpsRangesFor5 = j20 + getHighSpeedVideoFpsRangesFor(j23) + getHighResolutionOutputSizeshNQ4ISI(j23, j22, j21) + jArr4[i46] + this.getHighSpeedVideoFpsRangesFor[i46];
            j14 = Camera2StreamConfigurationMap + highSpeedVideoFpsRangesFor5;
            long Camera2StreamConfigurationMap5 = highSpeedVideoFpsRangesFor5 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap4) + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap4, Camera2StreamConfigurationMap3, Camera2StreamConfigurationMap2);
            int i48 = (i47 ^ 1) + ((i47 & 1) << 1);
            long highSpeedVideoFpsRangesFor6 = j21 + getHighSpeedVideoFpsRangesFor(j14) + getHighResolutionOutputSizeshNQ4ISI(j14, j23, j22) + jArr4[i47] + this.getHighSpeedVideoFpsRangesFor[i47];
            j13 = Camera2StreamConfigurationMap2 + highSpeedVideoFpsRangesFor6;
            j18 = highSpeedVideoFpsRangesFor6 + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap5) + Camera2StreamConfigurationMap(Camera2StreamConfigurationMap5, Camera2StreamConfigurationMap4, Camera2StreamConfigurationMap3);
            int i49 = i48 + 1;
            long highSpeedVideoFpsRangesFor7 = j22 + getHighSpeedVideoFpsRangesFor(j13) + getHighResolutionOutputSizeshNQ4ISI(j13, j14, j23) + jArr4[i48] + this.getHighSpeedVideoFpsRangesFor[i48];
            j17 = Camera2StreamConfigurationMap3 + highSpeedVideoFpsRangesFor7;
            j12 = highSpeedVideoFpsRangesFor7 + Camera2StreamConfigurationMap(j18) + Camera2StreamConfigurationMap(j18, Camera2StreamConfigurationMap5, Camera2StreamConfigurationMap4);
            int i50 = (i49 & 115) + (i49 | 115);
            i39 = (i50 & (-114)) + (i50 | (-114));
            long highSpeedVideoFpsRangesFor8 = j23 + getHighSpeedVideoFpsRangesFor(j17) + getHighResolutionOutputSizeshNQ4ISI(j17, j13, j14) + jArr4[i49] + this.getHighSpeedVideoFpsRangesFor[i49];
            i40++;
            j16 = Camera2StreamConfigurationMap4 + highSpeedVideoFpsRangesFor8;
            j6 = Camera2StreamConfigurationMap(j12) + Camera2StreamConfigurationMap(j12, j18, Camera2StreamConfigurationMap5) + highSpeedVideoFpsRangesFor8;
            j15 = Camera2StreamConfigurationMap5;
        }
        this.f2160 += j6;
        this.f2158 += j12;
        this.f2157 += j18;
        this.f2161 += j15;
        this.f2159 += j16;
        this.f2155 += j17;
        this.f2162 += j13;
        this.f2156 += j14;
        this.getOutputMinFrameDuration = 0;
        while (i38 < 16) {
            int i51 = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
            getHighSpeedVideoFpsRanges = i51;
            this.getHighSpeedVideoFpsRangesFor[i38] = 0;
            i38 = (((i38 | 34) << 1) - (i38 ^ 34)) - 33;
            getHighResolutionOutputSizeshNQ4ISI = (i51 + 105) % 128;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected void m26579(long j, long j2) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 39) << 1) - (i ^ 39);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 != 0 ? this.getOutputMinFrameDuration > 14 : this.getOutputMinFrameDuration > 101) {
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 75) % 128;
            m26580();
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
        }
        long[] jArr = this.getHighSpeedVideoFpsRangesFor;
        jArr[14] = j2;
        jArr[15] = j;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 23) + ((i & 23) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.getInputFormats;
        if (j > 2305843009213693951L) {
            int i3 = ((i & 51) + (i | 51)) % 128;
            getHighSpeedVideoFpsRanges = i3;
            this.getOutputFormats += j >>> 61;
            this.getInputFormats = j & 2305843009213693951L;
            getHighResolutionOutputSizeshNQ4ISI = (i3 + 27) % 128;
        }
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 9;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected void m26577(byte[] bArr, int i) {
        int i2 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (((i2 | 43) << 1) - (i2 ^ 43)) % 128;
        this.getHighSpeedVideoFpsRangesFor[this.getOutputMinFrameDuration] = util.h.xy.fb.rb.m26844(bArr, i);
        int i3 = this.getOutputMinFrameDuration;
        int i4 = -(-(i3 * (-675)));
        int i5 = (i ^ 1) | (i & 1);
        int i6 = ~i3;
        int i7 = ((((i4 | 677) << 1) - (i4 ^ 677)) - (~(((i5 & i6) | (i5 ^ i6)) * (-676)))) - 1;
        int i8 = ~i;
        int i9 = ((~((i6 ^ 1) | (i6 & 1))) | (~((i8 ^ 1) | (i8 & 1)))) * 676;
        int i10 = ~((i6 & (-2)) | (i6 ^ (-2)));
        int i11 = ~((i8 ^ i6) | (i6 & i8));
        int i12 = ((((i7 | i9) << 1) - (i9 ^ i7)) - (~(-(-(((~(((i3 ^ 1) | (i3 & 1)) | i)) | ((i11 & i10) | (i11 ^ i10))) * 676))))) - 1;
        this.getOutputMinFrameDuration = i12;
        if (i12 == 16) {
            int i13 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i13 & 57) + (i13 | 57)) % 128;
            m26580();
            int i14 = getHighResolutionOutputSizeshNQ4ISI + 65;
            getHighSpeedVideoFpsRanges = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 5 / 5;
            }
        }
        int i16 = getHighSpeedVideoFpsRanges;
        int i17 = ((i16 | 117) << 1) - (i16 ^ 117);
        getHighResolutionOutputSizeshNQ4ISI = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.ef.e
    /* renamed from: ˋ */
    public int mo26541() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 57;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        int i3 = i2 % 2 != 0 ? 16564 : 128;
        getHighResolutionOutputSizeshNQ4ISI = (i + 45) % 128;
        return i3;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˏ */
    public void mo26564() {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
        this.getInputFormats = 0L;
        this.getOutputFormats = 0L;
        int i = 0;
        this.getHighSpeedVideoSizesFor = 0;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i2 = ~(identityHashCode | (-944964958));
        int i3 = 85158051 - (~(-(-(((i2 ^ 135398469) | (i2 & 135398469)) * 576))));
        int i4 = (~identityHashCode) | (-944964958);
        int i5 = -(-(((~((i4 ^ (-1975905209)) | (i4 & (-1975905209)))) | (-2111303678)) * 576));
        int i6 = (i3 ^ i5) + ((i5 & i3) << 1);
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i7 = ~identityHashCode2;
        int i8 = ~(((-558221609) ^ i7) | (i7 & (-558221609)));
        int i9 = (-496551921) - (~(-(-(((i8 ^ 1786236225) | (i8 & 1786236225)) * (-865)))));
        int i10 = -(-((~((identityHashCode2 & 558221608) | (identityHashCode2 ^ 558221608))) * 865));
        int i11 = (i9 & i10) + (i10 | i9);
        int i12 = ~((i7 & 1786236225) | (1786236225 ^ i7));
        int i13 = ~((i7 ^ 558221608) | (i7 & 558221608));
        int i14 = -(-(((i12 ^ i13) | (i12 & i13)) * 865));
        if ((i6 ^ 680106816) + ((i6 & 680106816) << 1) <= ((i11 | i14) << 1) - (i14 ^ i11)) {
            int i15 = 2 / 3;
        }
        int i16 = 0;
        while (true) {
            byte[] bArr = this.Camera2StreamConfigurationMap;
            if (i16 >= bArr.length) {
                break;
            }
            int i17 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = (((i17 | 21) << 1) - (i17 ^ 21)) % 128;
            bArr[i16] = 0;
            i16 = ((i16 & 19) + (i16 | 19)) - 18;
            getHighSpeedVideoFpsRanges = (((i17 | 17) << 1) - (i17 ^ 17)) % 128;
        }
        this.getOutputMinFrameDuration = 0;
        while (true) {
            long[] jArr = this.getHighSpeedVideoFpsRangesFor;
            if (i == jArr.length) {
                return;
            }
            int i18 = getHighResolutionOutputSizeshNQ4ISI + 27;
            getHighSpeedVideoFpsRanges = i18 % 128;
            if (i18 % 2 == 0) {
                jArr[i] = 0;
                int i19 = (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) << 1);
                i = (i19 ^ (-120)) + ((i19 & (-120)) << 1);
            } else {
                jArr[i] = 0;
                i++;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m26576() {
        long j;
        long j2;
        byte b;
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 39) + ((i & 39) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        getHighSpeedVideoFpsRangesFor();
        if (i2 % 2 != 0) {
            j = this.getInputFormats >>> 4;
            j2 = this.getOutputFormats;
            b = 69;
        } else {
            j = this.getInputFormats << 3;
            j2 = this.getOutputFormats;
            b = Byte.MIN_VALUE;
        }
        mo26560(b);
        while (this.getHighSpeedVideoSizesFor != 0) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 113) % 128;
            mo26560((byte) 0);
            int i3 = getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = (((i3 | 49) << 1) - (i3 ^ 49)) % 128;
        }
        m26579(j, j2);
        m26580();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 51) % 128;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˎ */
    public void mo26562(byte[] bArr, int i, int i2) {
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = ((i3 | 9) << 1) - (i3 ^ 9);
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i5 = i;
        while (this.getHighSpeedVideoSizesFor != 0 && i2 > 0) {
            mo26560(bArr[i5]);
            i5++;
            i2--;
        }
        while (i2 > this.Camera2StreamConfigurationMap.length) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 69) % 128;
            m26577(bArr, i5);
            byte[] bArr2 = this.Camera2StreamConfigurationMap;
            int length = bArr2.length;
            int i6 = ~i5;
            int i7 = (i6 ^ length) | (i6 & length);
            int i8 = (length * 624) + (i5 * (-622)) + ((~(i7 | i)) * 623);
            int i9 = ~i;
            int i10 = ~length;
            int i11 = ~((i5 ^ i10) | (i5 & i10));
            int i12 = -(-(((i11 ^ i9) | (i11 & i9)) * (-623)));
            int i13 = (i8 & i12) + (i12 | i8);
            int i14 = ~i7;
            int i15 = ~((i6 & i) | (i6 ^ i));
            int i16 = (i14 ^ i15) | (i14 & i15);
            int i17 = ~((length ^ i) | (length & i));
            int i18 = ((i16 ^ i17) | (i16 & i17)) * 623;
            i5 = ((i13 | i18) << 1) - (i18 ^ i13);
            int i19 = -bArr2.length;
            int i20 = i19 * (-519);
            int i21 = i2 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
            int i22 = ~i19;
            int i23 = ~i2;
            int i24 = (i22 & i23) | (i22 ^ i23);
            int i25 = ~((i24 ^ i9) | (i24 & i9));
            int i26 = ~(i2 | i);
            int i27 = ~(i23 | i9);
            int i28 = ~((i19 ^ i) | (i19 & i));
            int i29 = (i20 ^ i21) + ((i20 & i21) << 1) + (((i26 ^ i25) | (i25 & i26)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + (((i27 & i28) | (i27 ^ i28)) * (-1040));
            int i30 = ~((i22 & i9) | (i22 ^ i9));
            int i31 = ~(i19 | i23);
            int i32 = ((i30 ^ i31) | (i31 & i30) | i28) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL;
            i2 = (i32 ^ i29) + ((i32 & i29) << 1);
            this.getInputFormats += bArr2.length;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 3) % 128;
        }
        while (i2 > 0) {
            mo26560(bArr[i5]);
            int i33 = (i5 & 106) + (i5 | 106);
            i5 = (i33 ^ (-105)) + ((i33 & (-105)) << 1);
            i2--;
        }
        int i34 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i34 ^ 47) + ((i34 & 47) << 1)) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        util.h.xy.eh.a.getHighSpeedVideoFpsRanges = ((r0 ^ 65) + ((r0 & 65) << 1)) % 128;
        m26577(r5.Camera2StreamConfigurationMap, 0);
        r5.getHighSpeedVideoSizesFor = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r3 == r1.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r2 == r1.length) goto L9;
     */
    @Override // util.h.xy.ef.rd
    /* renamed from: ˋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo26560(byte b) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 55) + (i | 55);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            byte[] bArr = this.Camera2StreamConfigurationMap;
            int i4 = this.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizesFor = i4;
            bArr[i4] = b;
        } else {
            byte[] bArr2 = this.Camera2StreamConfigurationMap;
            int i5 = this.getHighSpeedVideoSizesFor;
            int i6 = (i5 & 1) + (i5 | 1);
            this.getHighSpeedVideoSizesFor = i6;
            bArr2[i5] = b;
        }
        this.getInputFormats++;
        int i7 = getHighSpeedVideoFpsRanges;
        int i8 = (i7 & 83) + (i7 | 83);
        getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected void m26578(util.h.xy.eh.a aVar) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 109) % 128;
        byte[] bArr = aVar.Camera2StreamConfigurationMap;
        java.lang.System.arraycopy(bArr, 0, this.Camera2StreamConfigurationMap, 0, bArr.length);
        this.getHighSpeedVideoSizesFor = aVar.getHighSpeedVideoSizesFor;
        this.getInputFormats = aVar.getInputFormats;
        this.getOutputFormats = aVar.getOutputFormats;
        this.f2160 = aVar.f2160;
        this.f2158 = aVar.f2158;
        this.f2157 = aVar.f2157;
        this.f2161 = aVar.f2161;
        this.f2159 = aVar.f2159;
        this.f2155 = aVar.f2155;
        this.f2162 = aVar.f2162;
        this.f2156 = aVar.f2156;
        long[] jArr = aVar.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(jArr, 0, this.getHighSpeedVideoFpsRangesFor, 0, jArr.length);
        this.getOutputMinFrameDuration = aVar.getOutputMinFrameDuration;
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 19) + ((i & 19) << 1)) % 128;
    }

    protected a(util.h.xy.eh.a aVar) {
        this.Camera2StreamConfigurationMap = new byte[8];
        this.getHighSpeedVideoFpsRangesFor = new long[80];
        m26578(aVar);
    }

    protected a() {
        this.Camera2StreamConfigurationMap = new byte[8];
        this.getHighSpeedVideoFpsRangesFor = new long[80];
        this.getHighSpeedVideoSizesFor = 0;
        mo26564();
    }
}
