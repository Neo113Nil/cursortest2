package util.h.xy.en;

/* loaded from: classes5.dex */
public abstract class ra {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    private static long getHighResolutionOutputSizeshNQ4ISI(long j, long j2) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i & 113) + (i | 113)) % 128;
        long j3 = j & 1229782938247303441L;
        long j4 = j & 2459565876494606882L;
        long j5 = j & 4919131752989213764L;
        long j6 = j & (-8608480567731124088L);
        long j7 = j2 & 1229782938247303441L;
        long j8 = j2 & 2459565876494606882L;
        long j9 = j2 & 4919131752989213764L;
        long j10 = j2 & (-8608480567731124088L);
        getHighSpeedVideoFpsRanges = (((i | 117) << 1) - (i ^ 117)) % 128;
        return (((((j3 * j7) ^ (j4 * j10)) ^ (j5 * j9)) ^ (j6 * j8)) & 1229782938247303441L) | (((((j3 * j8) ^ (j4 * j7)) ^ (j5 * j10)) ^ (j6 * j9)) & 2459565876494606882L) | (((((j3 * j9) ^ (j4 * j8)) ^ (j5 * j7)) ^ (j6 * j10)) & 4919131752989213764L) | (((((j3 * j10) ^ (j4 * j9)) ^ (j5 * j8)) ^ (j6 * j7)) & (-8608480567731124088L));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m26619(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 83) + (i | 83);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            long j = jArr[1];
            long j2 = jArr2[0];
            jArr3[1] = j & j2;
            jArr3[1] = jArr[1] / j2;
        } else {
            jArr3[0] = jArr[0] ^ jArr2[0];
            jArr3[1] = jArr2[1] ^ jArr[1];
        }
        getHighSpeedVideoFpsRangesFor = (((i | 119) << 1) - (i ^ 119)) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m26629(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 33) % 128;
        while (true) {
            i3 = (((i3 | (-17)) << 1) - (i3 ^ (-17))) + 16;
            if (i3 < 0) {
                int i4 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = ((i4 ^ 71) + ((i4 & 71) << 1)) % 128;
                return;
            }
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 53) % 128;
            int i5 = i3 * (-300);
            int i6 = -(-(i * 302));
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            int i8 = (i3 ^ i) | (i3 & i);
            int i9 = -(-((~((i8 ^ i) | (i8 & i))) * (-301)));
            int i10 = ~i;
            int i11 = ~i3;
            int i12 = ~((i11 ^ i) | (i11 & i));
            int i13 = (((i7 | i9) << 1) - (i9 ^ i7)) + (((~((i10 & i) | (i10 ^ i))) | (~((i10 ^ i3) | (i10 & i3)))) * (-301)) + (((i12 & i10) | (i10 ^ i12)) * 301);
            byte b = bArr[i13];
            int i14 = i3 * (-344);
            int i15 = -(-(i2 * (-344)));
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            int i17 = ~i2;
            int i18 = (i11 ^ i17) | (i11 & i17);
            int i19 = ~i18;
            int i20 = ~(i11 | i);
            int i21 = ((i19 ^ i20) | (i19 & i20)) * 345;
            int i22 = ~(i10 | i11);
            int i23 = ~((i17 ^ i3) | (i17 & i3));
            byte b2 = bArr2[((((i16 ^ i21) + ((i16 & i21) << 1)) - (~(((i22 ^ i23) | (i22 & i23)) * 345))) - 1) + ((~((i18 & i) | (i18 ^ i))) * 345)];
            bArr[i13] = (byte) ((b & (~b2)) | ((~b) & b2));
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m26622(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i3 | 73) << 1) - (i3 ^ 73)) % 128;
        while (true) {
            i2--;
            if (i2 < 0) {
                int i4 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = (((i4 | 119) << 1) - (i4 ^ 119)) % 128;
                return;
            }
            int i5 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = (((i5 | 35) << 1) - (i5 ^ 35)) % 128;
            byte b = bArr[i2];
            int i6 = i2 * 569;
            int i7 = -(-(i * 569));
            int i8 = ~i2;
            int i9 = ~i;
            int i10 = (i8 ^ i9) | (i8 & i9);
            int i11 = ~i10;
            int i12 = (i11 ^ i11) | (i11 & i11);
            int i13 = ~(i9 & i9);
            int i14 = ~(i8 | i);
            int i15 = ~((i9 ^ i) | (i9 & i));
            int i16 = (i14 ^ i15) | (i14 & i15);
            int i17 = (i9 & i2) | (i9 ^ i2);
            int i18 = ~(i17 | i);
            int i19 = (((((i6 | i7) << 1) - (i6 ^ i7)) + (((i12 & i13) | (i12 ^ i13)) * (-1136))) - (~(-(-(((i16 & i18) | (i16 ^ i18)) * (-568)))))) - 1;
            int i20 = ~i17;
            int i21 = (i20 ^ i15) | (i20 & i15);
            int i22 = ~((i10 & i) | (i10 ^ i));
            int i23 = ((i21 ^ i22) | (i22 & i21)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION;
            byte b2 = bArr2[(i19 & i23) + (i23 | i19)];
            bArr[i2] = (byte) ((~(b & b2)) & (b | b2));
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m26625(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int i4 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i4 + 51) % 128;
        int i5 = (i4 & 41) + (i4 | 41);
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 2;
        }
        int i7 = 0;
        do {
            int i8 = ~i7;
            int i9 = ~i;
            int i10 = (i8 ^ i9) | (i8 & i9);
            int i11 = ~i10;
            int i12 = ~(i9 & i9);
            int i13 = -(-(((i12 ^ i11) | (i11 & i12)) * (-867)));
            int i14 = ~((i10 ^ i9) | (i10 & i9));
            int i15 = (i8 & i) | (i8 ^ i);
            int i16 = ~((i15 & i) | (i15 ^ i));
            int i17 = (i14 ^ i16) | (i16 & i14);
            int i18 = (i9 ^ i7) | (i9 & i7);
            int i19 = ~((i18 ^ i) | (i18 & i));
            byte b = bArr[(((((i7 * 868) - (~(i * 868))) - 1) - (~i13)) - 1) + ((i11 | (~i15) | (~((i9 ^ i) | (i9 & i)))) * (-1734)) + (((i17 ^ i19) | (i17 & i19)) * 867)];
            byte b2 = bArr2[(i2 - i8) - 1];
            bArr3[i3 + i7] = (byte) (((~b2) & b) | ((~b) & b2));
            int i20 = i7 | 1;
            int i21 = (((i20 * 758) + (i3 * (-756))) - (~(-(-(((i20 ^ i9) | (i20 & i9)) * (-757)))))) - 1;
            int i22 = ~i3;
            int i23 = i22 | i20;
            int i24 = (~((i23 ^ i) | (i23 & i))) * 1514;
            int i25 = (i21 & i24) + (i21 | i24);
            int i26 = ~i20;
            int i27 = ~((i26 ^ i22) | (i26 & i22));
            int i28 = ~((i22 & i9) | (i22 ^ i9));
            int i29 = (i27 ^ i28) | (i27 & i28);
            int i30 = ~((i20 ^ i3) | (i20 & i3) | i);
            int i31 = ((i29 ^ i30) | (i29 & i30)) * 757;
            bArr3[(i25 & i31) + (i31 | i25)] = (byte) (bArr2[(i2 - i26) - 1] ^ bArr[i + i20]);
            int i32 = (i20 & 72) + (i7 | 73);
            int i33 = (i32 & (-71)) + (i32 | (-71));
            byte b3 = bArr[(i & i33) + (i | i33)];
            int i34 = i33 * (-575);
            int i35 = i2 * (-575);
            int i36 = ~i33;
            int i37 = ~i2;
            int i38 = ~((i36 ^ i37) | (i36 & i37));
            int i39 = ~((i37 & i) | (i37 ^ i));
            int i40 = ((((i34 | i35) << 1) - (i34 ^ i35)) - (~(((i39 & i38) | (i38 ^ i39)) * 576))) - 1;
            int i41 = ~((i36 ^ i2) | (i36 & i2));
            int i42 = ~((i37 ^ i9) | (i37 & i9) | i33);
            int i43 = -(-(((i41 ^ i42) | (i41 & i42)) * 576));
            int i44 = ((i40 | i43) << 1) - (i43 ^ i40);
            int i45 = -(-(i38 * 576));
            byte b4 = bArr2[(i44 ^ i45) + ((i45 & i44) << 1)];
            bArr3[i3 + i33] = (byte) ((b3 & (~b4)) | ((~b3) & b4));
            int i46 = i33 + 1;
            int i47 = (i46 * 592) + (i3 * (-590));
            int i48 = ~i46;
            int i49 = -(-((~((i48 ^ i3) | (i48 & i3))) * (-1182)));
            int i50 = (i48 ^ i22) | (i48 & i22);
            int i51 = (((i47 | i49) << 1) - (i47 ^ i49)) + (((~((i50 & i9) | (i50 ^ i9))) | (~(i46 | i3))) * (-591));
            int i52 = (i | i48 | i22) * 591;
            int i53 = (i48 & i9) | (i48 ^ i9);
            int i54 = ~((i53 ^ i) | (i53 & i));
            int i55 = (i9 & i46) | (i9 ^ i46);
            int i56 = ~((i55 & i) | (i55 ^ i));
            int i57 = (((i46 * (-317)) + (i * 319)) - (~(-(-(((i54 ^ i56) | (i54 & i56)) * (-318)))))) - 1;
            int i58 = ~i55;
            int i59 = ~(i46 | i);
            int i60 = -(-(((i58 ^ i59) | (i58 & i59)) * (-318)));
            int i61 = ~((i48 & i) | (i48 ^ i));
            byte b5 = bArr[(i57 ^ i60) + ((i60 & i57) << 1) + (((i9 ^ i61) | (i61 & i9)) * 318)];
            int i62 = -(-i46);
            byte b6 = bArr2[((i2 | i62) << 1) - (i62 ^ i2)];
            bArr3[(i51 ^ i52) + ((i52 & i51) << 1)] = (byte) ((~(b6 & b5)) & (b6 | b5));
            i7 = i33 + 2;
        } while (i7 < 16);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m26634(byte[] bArr, byte[] bArr2, int i) {
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = i2 + 113;
        getHighSpeedVideoFpsRanges = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        getHighSpeedVideoFpsRanges = ((i2 & 29) + (i2 | 29)) % 128;
        do {
            byte b = bArr[i4];
            int i5 = ~i;
            int i6 = i5 & i5;
            int i7 = ~i6;
            int i8 = ~((i5 ^ i4) | (i5 & i4));
            int i9 = (((i4 * 50) + (i * (-97))) - (~(((i7 ^ i8) | (i7 & i8)) * 98))) - 1;
            int i10 = ~((~i4) | i5);
            int i11 = (i10 ^ i5) | (i10 & i5);
            int i12 = ~((i4 ^ i) | (i4 & i));
            int i13 = -(-(((i11 ^ i12) | (i11 & i12)) * (-49)));
            int i14 = (i9 & i13) + (i13 | i9);
            int i15 = ~(i5 | i);
            int i16 = ((i15 ^ i12) | (i15 & i12)) * 49;
            byte b2 = bArr2[(i14 ^ i16) + ((i16 & i14) << 1)];
            bArr[i4] = (byte) ((~(b & b2)) & (b | b2));
            int i17 = (i4 & (-90)) + (i4 | (-90));
            int i18 = (i17 ^ 91) + ((i17 & 91) << 1);
            byte b3 = bArr[i18];
            int i19 = i18 * 477;
            int i20 = -(-(i * (-475)));
            int i21 = ~i18;
            int i22 = ~((i21 ^ i) | (i21 & i));
            int i23 = i5 | i18;
            int i24 = ~((i23 ^ i) | (i23 & i));
            int i25 = ((((i19 & i20) + (i19 | i20)) - (~(((i22 & i24) | (i22 ^ i24)) * (-476)))) - 1) + (i24 * 952);
            int i26 = -(-((~((i6 & i18) | (i6 ^ i18))) * 476));
            bArr[i18] = (byte) (b3 ^ bArr2[((i25 | i26) << 1) - (i26 ^ i25)]);
            int i27 = i18 - 15;
            int i28 = (i27 & 16) + (i27 | 16);
            byte b4 = bArr[i28];
            int i29 = -(-i28);
            byte b5 = bArr2[(i ^ i29) + ((i29 & i) << 1)];
            bArr[i28] = (byte) ((b4 & (~b5)) | ((~b4) & b5));
            int i30 = (i28 ^ (-113)) + ((i28 & (-113)) << 1);
            int i31 = (i30 ^ 114) + ((i30 & 114) << 1);
            byte b6 = bArr[i31];
            byte b7 = bArr2[(i & i31) + (i | i31)];
            bArr[i31] = (byte) ((~(b6 & b7)) & (b6 | b7));
            i4 = (i31 ^ (-53)) + ((i31 & (-53)) << 1) + 54;
        } while (i4 < 16);
        int i32 = getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRanges = i32 % 128;
        if (i32 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m26633(byte[] bArr, byte[] bArr2) {
        int i = getHighSpeedVideoFpsRangesFor + 39;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        int i3 = i % 2 != 0 ? 1 : 0;
        getHighSpeedVideoFpsRangesFor = ((i2 & 29) + (i2 | 29)) % 128;
        do {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            bArr[i3] = (byte) ((~(b & b2)) & (b | b2));
            int i4 = (i3 ^ (-113)) + ((i3 & (-113)) << 1);
            int i5 = (i4 ^ 114) + ((i4 & 114) << 1);
            byte b3 = bArr[i5];
            byte b4 = bArr2[i5];
            bArr[i5] = (byte) ((b3 & (~b4)) | ((~b3) & b4));
            int i6 = i5 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
            int i7 = (i6 & (-121)) + (i6 | (-121));
            byte b5 = bArr[i7];
            byte b6 = bArr2[i7];
            bArr[i7] = (byte) ((b5 & (~b6)) | ((~b5) & b6));
            int i8 = (i7 & (-19)) + (i7 | (-19));
            int i9 = ((i8 | 20) << 1) - (i8 ^ 20);
            bArr[i9] = (byte) (bArr[i9] ^ bArr2[i9]);
            i3 = i9 + 1;
        } while (i3 < 16);
        int i10 = getHighSpeedVideoFpsRangesFor;
        int i11 = (i10 & 25) + (i10 | 25);
        getHighSpeedVideoFpsRanges = i11 % 128;
        if (i11 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m26628(long[] jArr, long[] jArr2) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i ^ 3) + ((i & 3) << 1)) % 128;
        long[] jArr3 = new long[4];
        util.h.xy.ex.ma.m26736(jArr[0], jArr3, 0);
        util.h.xy.ex.ma.m26736(jArr[1], jArr3, 2);
        long j = jArr3[0];
        long j2 = jArr3[1];
        long j3 = jArr3[2];
        long j4 = jArr3[3];
        long j5 = j3 ^ ((j4 << 57) ^ ((j4 << 63) ^ (j4 << 62)));
        jArr2[0] = j ^ ((((j5 >>> 1) ^ j5) ^ (j5 >>> 2)) ^ (j5 >>> 7));
        jArr2[1] = ((j5 << 57) ^ ((j5 << 63) ^ (j5 << 62))) ^ (((((j4 >>> 1) ^ j4) ^ (j4 >>> 2)) ^ (j4 >>> 7)) ^ j2);
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (i2 & 105) + (i2 | 105);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m26632(long[] jArr, long[] jArr2) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i | 99) << 1) - (i ^ 99)) % 128;
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = j2 << 57;
        jArr2[0] = ((j3 >>> 2) ^ (((j >>> 7) ^ j3) ^ (j3 >>> 1))) ^ (j3 >>> 7);
        jArr2[1] = (j << 57) | (j2 >>> 7);
        int i2 = ((i | 97) << 1) - (i ^ 97);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m26623(long[] jArr, long[] jArr2) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 117) % 128;
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long m26833 = util.h.xy.fb.ma.m26833(j);
        long m268332 = util.h.xy.fb.ma.m26833(j2);
        long m268333 = util.h.xy.fb.ma.m26833(j3);
        long m268334 = util.h.xy.fb.ma.m26833(j4);
        long m268335 = util.h.xy.fb.ma.m26833(getHighResolutionOutputSizeshNQ4ISI(m26833, m268333));
        long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(j, j3) << 1;
        long m268336 = util.h.xy.fb.ma.m26833(getHighResolutionOutputSizeshNQ4ISI(m268332, m268334));
        long highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(j2, j4);
        long j5 = highResolutionOutputSizeshNQ4ISI2 << 1;
        long m268337 = util.h.xy.fb.ma.m26833(getHighResolutionOutputSizeshNQ4ISI(m26833 ^ m268332, m268333 ^ m268334));
        long highResolutionOutputSizeshNQ4ISI3 = ((getHighResolutionOutputSizeshNQ4ISI(j2 ^ j, j3 ^ j4) << 1) ^ ((m268336 ^ highResolutionOutputSizeshNQ4ISI) ^ j5)) ^ ((highResolutionOutputSizeshNQ4ISI2 << 63) ^ (highResolutionOutputSizeshNQ4ISI2 << 58));
        jArr[0] = m268335 ^ ((highResolutionOutputSizeshNQ4ISI3 >>> 7) ^ (((highResolutionOutputSizeshNQ4ISI3 >>> 1) ^ highResolutionOutputSizeshNQ4ISI3) ^ (highResolutionOutputSizeshNQ4ISI3 >>> 2)));
        jArr[1] = (((highResolutionOutputSizeshNQ4ISI3 << 62) ^ (highResolutionOutputSizeshNQ4ISI3 << 63)) ^ (highResolutionOutputSizeshNQ4ISI3 << 57)) ^ ((m268337 ^ ((highResolutionOutputSizeshNQ4ISI ^ m268335) ^ m268336)) ^ (((j5 ^ (j5 >>> 1)) ^ (j5 >>> 2)) ^ (j5 >>> 7)));
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 61) << 1) - (i ^ 61);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m26626(byte[] bArr, byte[] bArr2) {
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = ~currentTimeMillis;
        int i2 = (((i ^ (-33564673)) | (i & (-33564673))) * (-490)) + 979277117;
        int i3 = ~((currentTimeMillis ^ 2088747617) | (currentTimeMillis & 2088747617));
        int i4 = -(-(((i3 ^ (-2122312290)) | (i3 & (-2122312290))) * 490));
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i5 = ~((currentTimeMillis2 ^ (-1791952224)) | (currentTimeMillis2 & (-1791952224)));
        int i6 = -(-(((1760430467 ^ i5) | (i5 & 1760430467)) * (-658)));
        int i7 = ((i6 | (-2082001651)) << 1) - (i6 ^ (-2082001651));
        int i8 = (i7 ^ 1635686838) + ((1635686838 & i7) << 1);
        int i9 = ((i5 ^ 1758331139) | (i5 & 1758331139)) * 658;
        long[] m26624 = m26624(bArr);
        int i10 = ((i2 & i4) + (i4 | i2)) - 1342906260;
        int i11 = ((i8 | i9) << 1) - (i9 ^ i8);
        m26623(m26624, m26624(bArr2));
        m26631(m26624, bArr);
        if (i10 <= i11) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m26635(long[] jArr, long[] jArr2) {
        int i = (getHighSpeedVideoFpsRanges + 115) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = j >> 63;
        jArr2[0] = ((j ^ ((-2233785415175766016L) & j3)) << 1) | (j2 >>> 63);
        jArr2[1] = (j2 << 1) | (-j3);
        getHighSpeedVideoFpsRanges = ((i & 29) + (i | 29)) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m26618(long[] jArr, long[] jArr2) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (((i | 41) << 1) - (i ^ 41)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        int i3 = ((i2 | 29) << 1) - (i2 ^ 29);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m26630(byte[] bArr, byte[] bArr2) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 97;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2 != 0 ? 1 : 0;
        getHighSpeedVideoFpsRanges = ((i ^ 45) + ((i & 45) << 1)) % 128;
        while (i3 < 16) {
            int i4 = getHighSpeedVideoFpsRanges;
            int i5 = (i4 ^ 67) + ((i4 & 67) << 1);
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            if (i5 % 2 == 0) {
                bArr2[i3] = bArr[i3];
                i3 = ((i3 | 11) << 1) - (i3 ^ 11);
            } else {
                bArr2[i3] = bArr[i3];
                int i6 = i3 + 95;
                i3 = ((i6 & (-94)) << 1) + (i6 ^ (-94));
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m26627(byte[] bArr, long[] jArr) {
        int i = getHighSpeedVideoFpsRangesFor + 21;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            util.h.xy.fb.rb.m26849(bArr, 1, jArr, 0, 4);
        } else {
            util.h.xy.fb.rb.m26849(bArr, 0, jArr, 0, 2);
        }
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (((i2 | 93) << 1) - (i2 ^ 93)) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static long[] m26624(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i ^ 47) + ((i & 47) << 1)) % 128;
        long[] jArr = new long[2];
        util.h.xy.fb.rb.m26849(bArr, 0, jArr, 0, 2);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 15) % 128;
        return jArr;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m26631(long[] jArr, byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i ^ 73) + ((i & 73) << 1)) % 128;
        util.h.xy.fb.rb.m26843(jArr, 0, 2, bArr, 0);
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (i2 & 51) + (i2 | 51);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte m26621(byte[] bArr, byte[] bArr2) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i & 61) + (i | 61)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        getHighSpeedVideoFpsRanges = ((i2 ^ 87) + ((i2 & 87) << 1)) % 128;
        int i3 = 0;
        int i4 = 0;
        while (i3 < 16) {
            int i5 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = ((i5 ^ 23) + ((i5 & 23) << 1)) % 128;
            int i6 = bArr[i3] ^ bArr2[i3];
            i4 = (i4 ^ i6) | (i4 & i6);
            int i7 = (i3 & 87) + (i3 | 87);
            i3 = (i7 & (-86)) + (i7 | (-86));
            getHighSpeedVideoFpsRanges = ((i5 ^ 77) + ((i5 & 77) << 1)) % 128;
        }
        int i8 = i4 >>> 1;
        int i9 = i4 & 1;
        int i10 = (i8 ^ i9) | (i8 & i9);
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i11 = -(-(i10 * (-475)));
        int i12 = ~i10;
        int i13 = (~i12) | i12;
        int i14 = ((((i11 ^ (-477)) + ((i11 & (-477)) << 1)) + (((~(i13 | currentTimeMillis)) | i12) * (-476))) - (~((~((i13 ^ currentTimeMillis) | (i13 & currentTimeMillis))) * 952))) - 1;
        int i15 = i12 | (~currentTimeMillis);
        int i16 = (~(i15 | (~i15))) * 476;
        byte b = (byte) (((i14 ^ i16) + ((i16 & i14) << 1)) >> 31);
        int i17 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i17 & 89) + (i17 | 89)) % 128;
        return b;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static long[] m26620() {
        int i = getHighSpeedVideoFpsRanges + 31;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return new long[]{Long.MIN_VALUE, 0};
        }
        long[] jArr = new long[5];
        jArr[0] = Long.MIN_VALUE;
        return jArr;
    }
}
