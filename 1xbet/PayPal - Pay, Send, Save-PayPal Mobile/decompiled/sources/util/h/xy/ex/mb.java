package util.h.xy.ex;

/* loaded from: classes18.dex */
public abstract class mb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    private static void getHighSpeedVideoFpsRangesFor(int i, int[] iArr, int[] iArr2, int i2) {
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i3 + 71) % 128;
        getHighSpeedVideoFpsRangesFor = (i3 + 29) % 128;
        long j = 0;
        int i4 = 0;
        int i5 = 0;
        while (i > 0) {
            int i6 = getHighSpeedVideoFpsRangesFor + 59;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 == 0) {
                if (i4 >= java.lang.Math.min(13, i)) {
                    iArr2[i2] = ((int) j) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                    j >>>= 30;
                    i4 -= 30;
                    i -= 30;
                    int i7 = getHighSpeedVideoFpsRangesFor;
                    getHighResolutionOutputSizeshNQ4ISI = (((i7 | 23) << 1) - (i7 ^ 23)) % 128;
                    i2 = ((i2 | 1) << 1) - (i2 ^ 1);
                }
                int i8 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = (i8 + 95) % 128;
                j |= (iArr[i5] & 4294967295L) << i4;
                i4 += 32;
                getHighResolutionOutputSizeshNQ4ISI = (i8 + 25) % 128;
                i5++;
                iArr2[i2] = ((int) j) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                j >>>= 30;
                i4 -= 30;
                i -= 30;
                int i72 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = (((i72 | 23) << 1) - (i72 ^ 23)) % 128;
                i2 = ((i2 | 1) << 1) - (i2 ^ 1);
            } else {
                if (i4 >= java.lang.Math.min(30, i)) {
                    iArr2[i2] = ((int) j) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                    j >>>= 30;
                    i4 -= 30;
                    i -= 30;
                    int i722 = getHighSpeedVideoFpsRangesFor;
                    getHighResolutionOutputSizeshNQ4ISI = (((i722 | 23) << 1) - (i722 ^ 23)) % 128;
                    i2 = ((i2 | 1) << 1) - (i2 ^ 1);
                }
                int i82 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = (i82 + 95) % 128;
                j |= (iArr[i5] & 4294967295L) << i4;
                i4 += 32;
                getHighResolutionOutputSizeshNQ4ISI = (i82 + 25) % 128;
                i5++;
                iArr2[i2] = ((int) j) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                j >>>= 30;
                i4 -= 30;
                i -= 30;
                int i7222 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = (((i7222 | 23) << 1) - (i7222 ^ 23)) % 128;
                i2 = ((i2 | 1) << 1) - (i2 ^ 1);
            }
        }
    }

    private static void Camera2StreamConfigurationMap(int i, int[] iArr, int[] iArr2, int i2) {
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = (((i3 | 99) << 1) - (i3 ^ 99)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i4;
        getHighSpeedVideoFpsRangesFor = ((i4 & 7) + (i4 | 7)) % 128;
        long j = 0;
        int i5 = 0;
        int i6 = 0;
        while (i > 0) {
            while (i5 < java.lang.Math.min(32, i)) {
                int i7 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRangesFor = ((i7 & 111) + (i7 | 111)) % 128;
                j |= iArr[i6] << i5;
                i5 = (i5 ^ 30) + ((i5 & 30) << 1);
                i6++;
            }
            iArr2[i2] = (int) j;
            j >>>= 32;
            i5 = ((i5 | (-32)) << 1) - (i5 ^ (-32));
            i -= 32;
            i2 = (((i2 | (-87)) << 1) - (i2 ^ (-87))) + 88;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 11) % 128;
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i3 + 63) % 128;
        int i4 = ~i;
        int i5 = (-2) - i4;
        int i6 = iArr[i5] >> 31;
        getHighSpeedVideoFpsRangesFor = (i3 + 13) % 128;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i5) {
            int i10 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i10 ^ 17) + ((i10 & 17) << 1)) % 128;
            int i11 = iArr[i8];
            int i12 = iArr2[i8] & i6;
            int i13 = i12 * (-947);
            int i14 = -(-(i11 * 949));
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            int i16 = ~i12;
            int i17 = ~i11;
            int i18 = ~((i17 ^ i) | (i17 & i));
            int i19 = ((i18 & i16) | (i16 ^ i18)) * (-948);
            int i20 = (i15 & i19) + (i19 | i15) + ((~((i16 ^ i17) | (i16 & i17) | i4)) * (-948));
            int i21 = ((i17 ^ i12) | (i17 & i12)) * 948;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            int i23 = (i9 - (~(-(-((((~(i22 & i2)) & (i22 | i2)) - (~(-i2))) - 1))))) - 1;
            iArr[i8] = 1073741823 & i23;
            i9 = i23 >> 30;
            int i24 = ((i8 | 98) << 1) - (i8 ^ 98);
            i8 = (i24 ^ (-97)) + ((i24 & (-97)) << 1);
            getHighSpeedVideoFpsRangesFor = (i10 + 61) % 128;
        }
        int i25 = iArr[i5];
        int i26 = -(-(i6 & iArr2[i5]));
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        int i28 = i9 + ((((~i2) & i27) | ((~i27) & i2)) - i2);
        iArr[i5] = i28;
        int i29 = i28 >> 31;
        int i30 = 0;
        while (i7 < i5) {
            int i31 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = (((i31 | 25) << 1) - (i31 ^ 25)) % 128;
            int i32 = iArr[i7];
            int i33 = iArr2[i7] & i29;
            int i34 = i33 * (-496);
            int i35 = -(-(i32 * (-496)));
            int i36 = ~i33;
            int i37 = ~i32;
            int i38 = i36 | i37;
            int i39 = ~((i38 ^ i) | (i38 & i));
            int i40 = (i37 ^ i4) | (i37 & i4);
            int i41 = ~((i40 ^ i33) | (i40 & i33));
            int i42 = -(-(((i39 ^ i41) | (i39 & i41)) * 497));
            int i43 = (i33 ^ i37) | (i33 & i37);
            int i44 = i30 + (((((((i34 | i35) << 1) - (i34 ^ i35)) - (~((~((i37 & i36) | (i36 ^ i37))) * 497))) - 1) - (~i42)) - 1) + (((~((i32 ^ i36) | (i32 & i36))) | (~((i36 & i4) | (i36 ^ i4))) | (~((i43 ^ i) | (i43 & i)))) * 497);
            iArr[i7] = i44 & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
            i30 = i44 >> 30;
            int i45 = ((i7 | 58) << 1) - (i7 ^ 58);
            i7 = ((i45 | (-57)) << 1) - (i45 ^ (-57));
            getHighSpeedVideoFpsRangesFor = (i31 + 61) % 128;
        }
        int i46 = iArr[i5];
        int i47 = i29 & iArr2[i5];
        int i48 = (i46 & i47) + (i47 | i46);
        int i49 = i48 * (-300);
        int i50 = i30 * 302;
        int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
        int i52 = (i48 ^ i30) | (i48 & i30);
        int i53 = (~((i52 ^ i) | (i52 & i))) * (-301);
        int i54 = ((i51 | i53) << 1) - (i53 ^ i51);
        int i55 = ~i30;
        int i56 = ~(i55 | i);
        int i57 = ~((i4 ^ i48) | (i4 & i48));
        int i58 = ((i57 ^ i56) | (i56 & i57)) * (-301);
        int i59 = (i54 ^ i58) + ((i54 & i58) << 1);
        int i60 = ~(i | (~i48));
        int i61 = -(-(((i60 ^ i55) | (i60 & i55)) * 301));
        iArr[i5] = (i59 & i61) + (i61 | i59);
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, int[] iArr) {
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 3;
        int i4 = i3 % 128;
        getHighSpeedVideoFpsRangesFor = i4;
        int i5 = i3 % 2 != 0 ? (i << 1) - i : i - 1;
        getHighResolutionOutputSizeshNQ4ISI = ((i4 & 35) + (i4 | 35)) % 128;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int i8 = getHighSpeedVideoFpsRangesFor;
            int i9 = ((i8 ^ 1) + ((i8 & 1) << 1)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i9;
            int i10 = iArr[i6];
            int i11 = (((~(i10 & i2)) & (i10 | i2)) - (~(-i2))) - 1;
            int i12 = (i7 ^ i11) + ((i7 & i11) << 1);
            iArr[i6] = 1073741823 & i12;
            i7 = i12 >> 30;
            i6++;
            getHighSpeedVideoFpsRangesFor = ((i9 & 3) + (i9 | 3)) % 128;
        }
        int i13 = iArr[i5];
        int i14 = (i13 & (~i2)) | ((~i13) & i2);
        int i15 = -i2;
        int i16 = (i14 & i15) + (i15 | i14);
        int i17 = i16 * 69;
        int i18 = i7 * (-67);
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        int i20 = ~i16;
        int i21 = ~i7;
        int i22 = (i20 ^ i21) | (i20 & i21);
        int i23 = ~i;
        int i24 = ~((i22 ^ i23) | (i22 & i23));
        int i25 = ~((i16 & i7) | (i16 ^ i7));
        int i26 = (i25 ^ i24) | (i24 & i25);
        int i27 = ~((i & i7) | (i7 ^ i));
        int i28 = ((i27 ^ i26) | (i26 & i27)) * (-68);
        int i29 = (i20 & i23) | (i20 ^ i23);
        int i30 = (i19 & i28) + (i28 | i19) + ((~((i29 & i7) | (i7 ^ i29))) * (-68));
        int i31 = ~((i23 & i21) | (i21 ^ i23));
        int i32 = -(-(((i31 ^ i20) | (i31 & i20)) * 68));
        iArr[i5] = (i30 ^ i32) + ((i32 & i30) << 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r15 = 80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r3 < 46) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0061, code lost:
    
        if (r3 < 96) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006d, code lost:
    
        util.h.xy.ex.mb.getHighSpeedVideoFpsRangesFor = (r12 + 27) % 128;
        r15 = 47;
     */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m26738(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int[] iArr4;
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i3 & 55) + (i3 | 55)) % 128;
        int length = iArr.length;
        int i4 = length << 5;
        int i5 = -util.h.xy.fb.b.m26829(iArr[(-2) - (~length)]);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = (((i6 | 29) << 1) - (i6 ^ 29)) / 30;
        int[] iArr5 = new int[4];
        int[] iArr6 = new int[i7];
        int[] iArr7 = new int[i7];
        int[] iArr8 = new int[i7];
        int[] iArr9 = new int[i7];
        int[] iArr10 = new int[i7];
        iArr7[0] = 1;
        getHighSpeedVideoFpsRangesFor(i6, iArr2, iArr9, 0);
        getHighSpeedVideoFpsRangesFor(i6, iArr, iArr10, 0);
        java.lang.System.arraycopy(iArr10, 0, iArr8, 0, i7);
        int m26737 = m26737(iArr10[0]);
        int i8 = getHighResolutionOutputSizeshNQ4ISI;
        int i9 = (i8 & 5) + (i8 | 5);
        getHighSpeedVideoFpsRangesFor = i9 % 128;
        if (i9 % 2 != 0) {
            i = ((i6 | 4) << 1) - (i6 ^ 4);
        } else {
            i = i6 * 49;
        }
        int i10 = -(-(i2 * 306));
        int i11 = ((i10 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) << 1) - (i10 ^ androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS);
        int i12 = -(-(i * 306));
        int i13 = ~((i2 ^ i) | (i2 & i));
        int i14 = ~((i2 ^ i6) | (i2 & i6));
        int i15 = (i11 & i12) + (i11 | i12) + (((i14 ^ i13) | (i13 & i14)) * 305);
        int i16 = ~i;
        int i17 = ~((~i6) | i2);
        int i18 = ((i16 ^ i17) | (i17 & i16)) * 305;
        int i19 = (((i15 | i18) << 1) - (i18 ^ i15)) / 17;
        getHighSpeedVideoFpsRangesFor = (((i8 | 85) << 1) - (i8 ^ 85)) % 128;
        int i20 = 0;
        int i21 = 0;
        while (i21 < i19) {
            int i22 = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = ((i22 & 85) + (i22 | 85)) % 128;
            int i23 = iArr8[0];
            int i24 = iArr9[0];
            getHighResolutionOutputSizeshNQ4ISI = (i22 + 67) % 128;
            getHighResolutionOutputSizeshNQ4ISI = (i22 + 45) % 128;
            int i25 = 1073741824;
            int i26 = 1073741824;
            int i27 = i20;
            int i28 = i6;
            int i29 = i19;
            int i30 = i21;
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            while (true) {
                iArr4 = iArr9;
                if (i32 >= 30) {
                    break;
                }
                int i34 = getHighResolutionOutputSizeshNQ4ISI;
                int i35 = ((i34 ^ 79) + ((i34 & 79) << 1)) % 128;
                getHighSpeedVideoFpsRangesFor = i35;
                int[] iArr11 = iArr8;
                int i36 = i27 >> 31;
                int i37 = m26737;
                int i38 = -(i24 & 1);
                int[] iArr12 = iArr10;
                int i39 = ~i36;
                int[] iArr13 = iArr7;
                int i40 = ~i31;
                int[] iArr14 = iArr6;
                int i41 = -(((i23 & i39) | ((~i23) & i36)) & i38);
                int i42 = i7;
                int i43 = i41 * (-563);
                int[] iArr15 = iArr5;
                int i44 = -(-(i24 * 565));
                int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
                int i46 = ~i41;
                int i47 = ~i20;
                int i48 = i23;
                int i49 = ~((~i24) | i47);
                int i50 = (i46 ^ i49) | (i49 & i46);
                int i51 = ~((i24 ^ i20) | (i24 & i20));
                int i52 = ((i50 ^ i51) | (i51 & i50)) * (-564);
                int i53 = ((i45 | i52) << 1) - (i45 ^ i52);
                int i54 = i46 | i24;
                int i55 = -(-((~((i54 ^ i20) | (i54 & i20))) * 1128));
                int i56 = ~((i46 ^ i47) | (i46 & i47));
                int i57 = ~((i41 ^ i24) | (i41 & i24));
                int i58 = ((((i53 | i55) << 1) - (i55 ^ i53)) - (~(-(-(((i56 ^ i57) | (i57 & i56)) * 564))))) - 1;
                int i59 = (i33 - (~(-(((i25 & i39) | ((~i25) & i36)) & i38)))) - 1;
                int i60 = -(((i31 & i39) | (i36 & i40)) & i38);
                int i61 = ~i26;
                int i62 = ~i60;
                int i63 = -(-((~((i60 ^ i20) | (i60 & i20))) * 865));
                int i64 = ~((i61 & i47) | (i61 ^ i47));
                int i65 = i32;
                int i66 = ~((i60 & i47) | (i47 ^ i60));
                int i67 = ((((((i60 * 866) + (i26 * (-864))) + ((i61 | (~((i62 ^ i47) | (i62 & i47)))) * (-865))) - (~i63)) - 1) - (~(-(-(((i66 ^ i64) | (i66 & i64)) * 865))))) - 1;
                int i68 = i38 & i39;
                int i69 = i27 ^ i68;
                int i70 = i68 * (-112);
                int i71 = ~i68;
                int i72 = ~(i71 | i47);
                int i73 = (i71 & i47) | (i71 ^ i47);
                int i74 = ~((~i73) | i73);
                int i75 = -(((((((i70 | 112) << 1) - (i70 ^ 112)) + (((i72 ^ (-1)) | i72) * 226)) + (((i73 & i74) | (i73 ^ i74)) * (-113))) - (~(-(-((~(i71 | i20)) * 113))))) - 1);
                int i76 = i75 * (-575);
                int i77 = -(-(i69 * (-575)));
                int i78 = ~i75;
                int i79 = ~i69;
                int i80 = ((i76 | i77) << 1) - (i76 ^ i77);
                int i81 = ~((i79 ^ i20) | (i79 & i20));
                int i82 = ~((i78 ^ i79) | (i78 & i79));
                int i83 = (i80 - (~(-(-((i81 | i82) * 576))))) - 1;
                int i84 = ~((i69 ^ i78) | (i78 & i69));
                int i85 = (i79 ^ i47) | (i79 & i47);
                int i86 = ~((i85 ^ i75) | (i85 & i75));
                int i87 = ((i84 ^ i86) | (i84 & i86)) * 576;
                int i88 = (i83 ^ i87) + ((i87 & i83) << 1);
                int i89 = -(-(i82 * 576));
                i27 = (i88 & i89) + (i89 | i88);
                int i90 = -(-(i58 & i68));
                int i91 = -(-(i59 & i68));
                i25 = (i25 ^ i91) + ((i91 & i25) << 1);
                int i92 = i68 & i67;
                int i93 = (i92 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL) + (i31 * (-520));
                int i94 = ~((i47 ^ i31) | (i47 & i31));
                int i95 = -(-(((i94 ^ i92) | (i94 & i92)) * (-1042)));
                int i96 = ((i93 | i95) << 1) - (i93 ^ i95);
                int i97 = ((i31 ^ i20) | (i31 & i20)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                int i98 = ~i92;
                int i99 = ~((i40 ^ i98) | (i98 & i40));
                int i100 = ~(i98 | i20);
                int i101 = (i99 ^ i100) | (i99 & i100);
                int i102 = (i92 ^ i47) | (i92 & i47);
                int i103 = ~((i102 ^ i31) | (i102 & i31));
                i31 = (i96 ^ i97) + ((i97 & i96) << 1) + (((i103 ^ i101) | (i103 & i101)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL);
                i24 = i58 >> 1;
                i33 = i59 >> 1;
                i26 = i67 >> 1;
                getHighResolutionOutputSizeshNQ4ISI = (i35 + 45) % 128;
                i23 = ((i48 & i90) << 1) + (i48 ^ i90);
                i32 = i65 + 1;
                iArr9 = iArr4;
                iArr8 = iArr11;
                m26737 = i37;
                iArr10 = iArr12;
                iArr7 = iArr13;
                i7 = i42;
                iArr6 = iArr14;
                iArr5 = iArr15;
            }
            int i104 = m26737;
            int i105 = i7;
            int[] iArr16 = iArr5;
            int[] iArr17 = iArr6;
            int[] iArr18 = iArr7;
            int[] iArr19 = iArr8;
            int[] iArr20 = iArr10;
            iArr16[0] = i25;
            iArr16[1] = i31;
            iArr16[2] = i33;
            iArr16[3] = i26;
            int i106 = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = (((i106 | 11) << 1) - (i106 ^ 11)) % 128;
            int i107 = i105 - 1;
            int i108 = iArr17[i107] >> 31;
            int i109 = iArr18[i107] >> 31;
            int i110 = i25 & i108;
            int i111 = i31 & i109;
            int i112 = i111 * (-575);
            int i113 = i110 * (-575);
            int i114 = ~i111;
            int i115 = ~i110;
            int i116 = ~((i114 & i115) | (i114 ^ i115));
            int i117 = ~(i115 | i105);
            int i118 = (((i112 & i113) + (i112 | i113)) - (~(((i116 ^ i117) | (i117 & i116)) * 576))) - 1;
            int i119 = ~((i110 ^ i114) | (i110 & i114));
            int i120 = ~i105;
            int i121 = ~(i111 | (i115 ^ i120) | (i115 & i120));
            int i122 = -(-(((i119 ^ i121) | (i119 & i121)) * 576));
            int i123 = ((i118 | i122) << 1) - (i122 ^ i118);
            int i124 = -(-(i116 * 576));
            int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
            int i126 = i108 & i33;
            int i127 = -(-(i109 & i26));
            int i128 = (i126 ^ i127) + ((i126 & i127) << 1);
            int i129 = iArr20[0];
            long j = i25;
            long j2 = iArr17[0];
            long j3 = i31;
            long j4 = iArr18[0];
            long j5 = (j * j2) + (j3 * j4);
            long j6 = i33;
            long j7 = i26;
            long j8 = (j2 * j6) + (j4 * j7);
            int i130 = ((int) j5) * i104;
            int i131 = i125 * (-112);
            int i132 = -(-(i130 * (-112)));
            int i133 = ~i130;
            int i134 = (i133 ^ i120) | (i133 & i120);
            int i135 = ~i134;
            int i136 = ~i125;
            int i137 = ~((i130 & i136) | (i136 ^ i130));
            int i138 = ~((i136 & i105) | (i136 ^ i105));
            int i139 = (i137 & i138) | (i137 ^ i138);
            int i140 = ~((i134 ^ i125) | (i134 & i125));
            int i141 = ((((i131 ^ i132) + ((i131 & i132) << 1)) - (~(-(-(((i125 ^ i135) | (i135 & i125)) * 226))))) - 1) + (((i139 & i140) | (i139 ^ i140)) * (-113));
            int i142 = -(-((~((i133 & i105) | (i133 ^ i105))) * 113));
            int i143 = -((((i141 | i142) << 1) - (i142 ^ i141)) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            int i144 = ((int) j8) * i104;
            int i145 = i128 * 881;
            int i146 = i144 * 881;
            int i147 = (i145 ^ i146) + ((i145 & i146) << 1);
            int i148 = ~i128;
            int i149 = ~i144;
            int i150 = ~(i148 | i149);
            int i151 = ~((i148 ^ i105) | (i148 & i105));
            int i152 = ((~((i149 & i105) | (i149 ^ i105))) | (i150 ^ i151) | (i150 & i151)) * (-880);
            int i153 = ~((i148 ^ i120) | (i148 & i120));
            int i154 = (i144 ^ i153) | (i153 & i144);
            int i155 = ~(i128 | i105);
            int i156 = (((i147 & i152) + (i152 | i147)) - (~(-(-(((i154 ^ i155) | (i154 & i155)) * (-880)))))) - 1;
            int i157 = -(-((~((i128 ^ i105) | (i128 & i105))) * 880));
            int i158 = -((((i156 | i157) << 1) - (i157 ^ i156)) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            long j9 = i129;
            long j10 = (i125 & i143) + (i143 | i125);
            long j11 = ((i128 | i158) << 1) - (i158 ^ i128);
            long j12 = (j8 + (j9 * j11)) >> 30;
            long j13 = (j5 + (j9 * j10)) >> 30;
            int i159 = 1;
            while (i159 < i105) {
                int i160 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRangesFor = (i160 + 79) % 128;
                int i161 = iArr20[i159];
                long j14 = j11;
                long j15 = iArr17[i159];
                long j16 = iArr18[i159];
                long j17 = i161;
                long j18 = j13 + (j * j15) + (j3 * j16) + (j17 * j10);
                long j19 = j12 + (j15 * j6) + (j7 * j16) + (j17 * j14);
                iArr17[i159 - 1] = ((int) j18) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                j13 = j18 >> 30;
                int i162 = -(-(i159 * 339));
                int i163 = ~i159;
                int i164 = ~i120;
                int i165 = (i159 ^ (-1)) | i159;
                int i166 = ~((i165 ^ i105) | (i165 & i105));
                iArr18[(((((((i162 | 337) << 1) - (i162 ^ 337)) - (~((((~((~i163) | i163)) | i164) | (~((i105 ^ (-1)) | i105))) * (-338)))) - 1) - (~(i163 * 338))) - 1) + (((i164 & i166) | (i164 ^ i166)) * 338)] = ((int) j19) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                j12 = j19 >> 30;
                int i167 = ((i159 | (-25)) << 1) - (i159 ^ (-25));
                i159 = (i167 ^ 26) + ((i167 & 26) << 1);
                getHighSpeedVideoFpsRangesFor = (i160 + 113) % 128;
                j11 = j14;
            }
            int i168 = -(-(i105 * 367));
            int i169 = (i168 ^ (-367)) + ((i168 & (-367)) << 1);
            int i170 = (i169 & 366) + (i169 | 366);
            int i171 = (i120 ^ i105) | (i120 & i105);
            int i172 = ~i171;
            int i173 = ((i172 ^ (-1)) | i172) * (-366);
            int i174 = (i170 ^ i173) + ((i170 & i173) << 1);
            int i175 = ~i120;
            int i176 = i175 | i120;
            int i177 = -(-(((~((i176 & i105) | (i176 ^ i105))) | i120) * 366));
            iArr17[((i174 | i177) << 1) - (i174 ^ i177)] = (int) j13;
            int i178 = -(-(i105 * 503));
            int i179 = ((i178 | androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) << 1) - (i178 ^ androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING);
            int i180 = -(-(((~((i105 ^ (-1)) | i105)) | i172) * (-502)));
            int i181 = (i179 ^ i180) + ((i180 & i179) << 1);
            int i182 = ~i176;
            int i183 = -(-(i182 * (-502)));
            int i184 = ((i181 | i183) << 1) - (i183 ^ i181);
            int i185 = -(-((i120 & i120) * 502));
            iArr18[(i184 & i185) + (i185 | i184)] = (int) j12;
            int i186 = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = ((i186 & 99) + (i186 | 99)) % 128;
            int i187 = iArr16[0];
            int i188 = iArr16[1];
            int i189 = iArr16[2];
            int i190 = iArr16[3];
            int i191 = i176;
            long j20 = i187;
            long j21 = iArr19[0];
            long j22 = i188;
            long j23 = iArr4[0];
            long j24 = i189;
            long j25 = i190;
            long j26 = ((j21 * j24) + (j23 * j25)) >> 30;
            getHighResolutionOutputSizeshNQ4ISI = (i186 + 97) % 128;
            long j27 = ((j21 * j20) + (j23 * j22)) >> 30;
            long j28 = j26;
            int i192 = 1;
            while (i192 < i105) {
                int i193 = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
                getHighSpeedVideoFpsRangesFor = i193;
                int i194 = i191;
                long j29 = j28;
                long j30 = iArr19[i192];
                int i195 = i192;
                long j31 = iArr4[i192];
                long j32 = j27 + (j20 * j30) + (j22 * j31);
                long j33 = j29 + (j30 * j24) + (j31 * j25);
                iArr19[i195 - 1] = ((int) j32) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                long j34 = j32 >> 30;
                int i196 = (-570) - (~(-(-(i195 * 569))));
                int i197 = ~i195;
                int i198 = ~i197;
                int i199 = (i175 & i198) | (i198 ^ i175);
                int i200 = ~(i197 | i120);
                int i201 = ((i199 ^ i200) | (i199 & i200)) * (-1136);
                int i202 = ~(i197 | i105);
                int i203 = (i120 ^ i202) | (i120 & i202);
                long j35 = j25;
                int i204 = ~((i194 ^ i195) | (i194 & i195));
                int i205 = ~((i120 ^ i195) | (i120 & i195));
                iArr4[(((((i196 | i201) << 1) - (i196 ^ i201)) - (~(((i203 ^ i204) | (i203 & i204)) * (-568)))) - 1) + (((i182 & i205) | (i182 ^ i205) | i202) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION)] = ((int) j33) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                j28 = j33 >> 30;
                int i206 = (i195 & (-98)) + (i195 | (-98)) + 99;
                int i207 = i193 + 75;
                getHighResolutionOutputSizeshNQ4ISI = i207 % 128;
                int i208 = i207 % 2;
                i192 = i206;
                i191 = i194;
                j27 = j34;
                j25 = j35;
            }
            int i209 = i191;
            int i210 = i105 * (-613);
            int i211 = ((i210 | (-615)) << 1) - (i210 ^ (-615));
            int i212 = -(-(((i171 & i182) | (i171 ^ i182)) * 614));
            int i213 = ((i211 | i212) << 1) - (i212 ^ i211);
            int i214 = -(-(((i175 & i120) | (i175 ^ i120) | i172) * (-1228)));
            int i215 = (i213 & i214) + (i214 | i213);
            int i216 = -(-((i175 | (~(i209 | i105))) * 614));
            iArr19[(i215 & i216) + (i216 | i215)] = (int) j27;
            iArr4[i107] = (int) j28;
            int i217 = getHighResolutionOutputSizeshNQ4ISI + 53;
            int i218 = i217 % 128;
            getHighSpeedVideoFpsRangesFor = i218;
            if (i217 % 2 != 0) {
                throw null;
            }
            int i219 = (i30 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE) + (i30 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
            i21 = ((i219 | (-109)) << 1) - (i219 ^ (-109));
            getHighResolutionOutputSizeshNQ4ISI = ((i218 & 39) + (i218 | 39)) % 128;
            i19 = i29;
            i7 = i105;
            i6 = i28;
            i20 = i27;
            iArr9 = iArr4;
            iArr8 = iArr19;
            m26737 = i104;
            iArr10 = iArr20;
            iArr7 = iArr18;
            iArr6 = iArr17;
            iArr5 = iArr16;
        }
        int[] iArr21 = iArr6;
        int[] iArr22 = iArr8;
        int i220 = i7;
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i221 = -(-(i220 * (-55)));
        int i222 = iArr22[(((i221 & 55) + (i221 | 55)) + (((~(currentTimeMillis | (currentTimeMillis ^ (-1)))) | i220) * 56)) - 56] >> 31;
        getHighSpeedVideoFpsRangesFor(i220, i222, iArr22);
        getHighSpeedVideoFpsRangesFor(i220, i222, iArr21, iArr10);
        Camera2StreamConfigurationMap(i6, iArr21, iArr3, 0);
        int m26731 = util.h.xy.ex.b.m26731(i220, iArr22, 1);
        int m26735 = util.h.xy.ex.b.m26735(i220, iArr9);
        int i223 = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (((i223 | 125) << 1) - (i223 ^ 125)) % 128;
        return m26731 & m26735;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static int m26737(int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i2 + 51) % 128;
        int i3 = (2 - (i * i)) * i;
        int i4 = i3 * (1 - (~(-(i * i3))));
        int i5 = i4 * (1 - (~(-(i * i4))));
        getHighSpeedVideoFpsRangesFor = (i2 + 89) % 128;
        return i5 * (2 - (i * i5));
    }
}
