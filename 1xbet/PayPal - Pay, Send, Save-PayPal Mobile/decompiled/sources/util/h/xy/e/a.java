package util.h.xy.e;

/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 104;
    private static int getHighSpeedVideoSizes = 1;
    private final util.h.xy.e.c getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.e.c();

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.lang.Object m26461(android.content.Context context, int i, java.io.InputStream inputStream) throws util.h.xy.c.ma {
        int i2 = getHighSpeedVideoSizes + 7;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getHighSpeedVideoSizes = (i3 + 3) % 128;
        getHighSpeedVideoSizes = (i3 + 121) % 128;
        getHighSpeedVideoSizes = (i3 + 105) % 128;
        int i4 = getHighSpeedVideoFpsRanges;
        int i5 = i4 * (-755);
        int i6 = ~i4;
        int i7 = ~(i6 | (-121));
        int i8 = (i4 ^ 120) | (i4 & 120);
        int i9 = ~((i8 ^ i) | (i8 & i));
        int i10 = (((i5 | (-90600)) << 1) - (i5 ^ (-90600))) + ((~((i6 & (-121)) | (i6 ^ (-121)))) * 1512) + (((i7 & i9) | (i7 ^ i9)) * (-756));
        int i11 = ~i;
        int i12 = -(-((i8 | i11) * 756));
        Camera2StreamConfigurationMap = ((((i10 | i12) << 1) - (i12 ^ i10)) - 1) % 128;
        java.lang.Object Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(context, i, inputStream);
        int i13 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i13 ^ 63) + ((i13 & 63) << 1)) % 128;
        int i14 = getHighSpeedVideoFpsRanges + 94;
        int i15 = ~i14;
        int i16 = ~((i11 & i15) | (i15 ^ i11));
        int i17 = ~((~i15) | i15);
        int i18 = (i16 ^ i17) | (i16 & i17);
        int i19 = ~(i11 | (~i11));
        int i20 = (((-466) - (~(i14 * (-463)))) - (~(-(-(((i19 ^ i18) | (i19 & i18)) * 464))))) - 1;
        int i21 = ((i15 & i) | (i15 ^ i)) * (-464);
        int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
        int i23 = ~(i | (i ^ (-1)));
        int i24 = -(-(((i23 ^ i17) | (i23 & i17)) * 464));
        Camera2StreamConfigurationMap = ((i22 & i24) + (i24 | i22)) % 128;
        getHighSpeedVideoFpsRangesFor = (((i13 | 119) << 1) - (i13 ^ 119)) % 128;
        return Camera2StreamConfigurationMap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x061a, code lost:
    
        if ((r7 % 2) != 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0275, code lost:
    
        if (((r9 ^ r15) | (r15 & r9)) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x025a, code lost:
    
        if ((r13 % 2) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02c6, code lost:
    
        if ((r14 % 2) == 0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0c6f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0b73  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.Object Camera2StreamConfigurationMap(android.content.Context context, int i, java.io.InputStream inputStream) throws util.h.xy.c.ma {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        util.h.xy.c.a<util.h.xy.c.mb> aVar;
        int i3;
        util.h.xy.c.a<util.h.xy.c.mb> aVar2;
        util.h.xy.e.rb highSpeedVideoSizes;
        util.h.xy.c.a<util.h.xy.c.mb> aVar3;
        util.h.xy.c.a<util.h.xy.c.mb> aVar4;
        util.h.xy.c.a<util.h.xy.c.mb> aVar5;
        util.h.xy.c.a<util.h.xy.c.mb> aVar6;
        util.h.xy.c.a<util.h.xy.c.mb> aVar7;
        int i4;
        util.h.xy.c.a<util.h.xy.c.mb> aVar8;
        util.h.xy.c.a<util.h.xy.c.mb> aVar9;
        util.h.xy.c.a<util.h.xy.c.mb> aVar10;
        int i5;
        util.h.xy.c.mb m26472;
        int i6 = getHighSpeedVideoSizes;
        int i7 = (((i6 | 89) << 1) - (i6 ^ 89)) % 128;
        getHighSpeedVideoFpsRangesFor = i7;
        getHighSpeedVideoSizes = ((i7 & 53) + (i7 | 53)) % 128;
        int i8 = getHighSpeedVideoFpsRanges;
        int i9 = i8 * 949;
        int i10 = (i9 & (-18940)) + (i9 | (-18940));
        int i11 = ~i8;
        int i12 = ~((i11 ^ i) | (i11 & i));
        int i13 = -(-(((i12 ^ (-21)) | (i12 & (-21))) * (-948)));
        int i14 = ((i10 | i13) << 1) - (i13 ^ i10);
        int i15 = i11 | (-21);
        int i16 = ~i;
        int i17 = (~((i15 ^ i16) | (i15 & i16))) * (-948);
        int i18 = (((i14 & i17) + (i17 | i14)) - (~(((i11 ^ 20) | (i11 & 20)) * 948))) - 1;
        int i19 = ~i18;
        int i20 = -(-(i18 << 1));
        int i21 = (i19 & i20) + (i19 | i20);
        Camera2StreamConfigurationMap = i21 % 128;
        if (i21 % 2 != 0) {
            throw null;
        }
        if (context == null) {
            throw new util.h.xy.c.ma(103, null);
        }
        util.h.xy.e.mc.m26470(i);
        if ((2031616 & i) == 0) {
            int i22 = getHighSpeedVideoFpsRanges;
            int i23 = ((i22 & 55) - (~(-(~(i22 | 55))))) - 1;
            int i24 = i23 * 984;
            int i25 = ~i23;
            int i26 = -(-((~((i25 & i16) | (i25 ^ i16))) * (-983)));
            int i27 = ~i16;
            int i28 = ((((((i24 | 1965) << 1) - (i24 ^ 1965)) - 983) - (~i26)) - 1) + (((i25 ^ i27) | (i25 & i27)) * 983);
            Camera2StreamConfigurationMap = i28 % 128;
            if (i28 % 2 != 0) {
                z = false;
            } else {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 61) % 128;
                z = true;
            }
            Camera2StreamConfigurationMap = ((((i22 & (-2)) | ((~i22) & 1)) - (~((i22 & 1) << 1))) - 1) % 128;
        } else {
            int i29 = getHighSpeedVideoFpsRanges;
            int i30 = i29 & 83;
            int i31 = (((i29 & (-84)) | ((~i29) & 83)) | i30) << 1;
            int i32 = -((i29 | 83) & (~i30));
            int i33 = i31 & i32;
            Camera2StreamConfigurationMap = ((((i32 | i31) & (~i33)) - (~(-(-(i33 << 1))))) - 1) % 128;
            z = false;
        }
        if (!z) {
            int i34 = getHighSpeedVideoFpsRanges;
            int i35 = i34 & 23;
            int i36 = ((~i35) & ((i34 ^ 23) | i35)) - (~(-(-(i35 << 1))));
            int i37 = -(-(i36 * (-1187)));
            int i38 = ~i36;
            int i39 = ~((i36 & i16) | (i16 ^ i36));
            int i40 = (i37 ^ (-595)) + ((i37 & (-595)) << 1) + (((i38 ^ i39) | (i39 & i38)) * (-1188));
            int i41 = ~((i38 ^ i) | (i38 & i));
            int i42 = (i41 & i38) | (i38 ^ i41);
            int i43 = ~((~i16) | i16);
            int i44 = -(-(((i42 & i43) | (i42 ^ i43)) * 594));
            int i45 = ~((i38 ^ i16) | (i38 & i16));
            int i46 = ~(i38 | (~i38));
            int i47 = (((i40 ^ i44) + ((i44 & i40) << 1)) - (~(((i45 & i46) | (i45 ^ i46)) * 594))) - 1;
            Camera2StreamConfigurationMap = i47 % 128;
            if (i47 % 2 == 0 ? (65536 & i) == 0 : (65536 | i) == 0) {
                int i48 = i34 & 83;
                Camera2StreamConfigurationMap = ((((i34 ^ 83) | i48) & (~i48)) + (i48 << 1)) % 128;
                z2 = false;
                if (!z) {
                    int i49 = getHighSpeedVideoSizes;
                    getHighSpeedVideoFpsRangesFor = (i49 + 13) % 128;
                    int i50 = getHighSpeedVideoFpsRanges;
                    int i51 = (i50 & (-106)) | ((~i50) & 105);
                    int i52 = (i50 & 105) << 1;
                    int i53 = i51 & i52;
                    Camera2StreamConfigurationMap = (i53 + ((i52 ^ i51) | i53)) % 128;
                    if ((524288 & i) != 0) {
                        getHighSpeedVideoFpsRangesFor = (i49 + 117) % 128;
                    } else {
                        z3 = false;
                        if (!z) {
                            int i54 = getHighSpeedVideoFpsRanges;
                            int i55 = i54 ^ 125;
                            int i56 = i54 & 125;
                            int i57 = (((((i56 ^ i55) | (i56 & i55)) << 1) - (~(-i55))) - 1) % 128;
                            Camera2StreamConfigurationMap = i57;
                            if ((131072 & i) == 0) {
                                int i58 = i57 & 29;
                                int i59 = (i57 & (-30)) | ((~i57) & 29);
                                int i60 = (i59 ^ i58) | (i59 & i58);
                                getHighSpeedVideoFpsRanges = (((((i58 ^ i60) | (i58 & i60)) << 1) - (~(-((i60 & (~i58)) | ((~i60) & i58))))) - 1) % 128;
                                z4 = false;
                                if (!z) {
                                    int i61 = Camera2StreamConfigurationMap;
                                    int i62 = i61 & 43;
                                    int i63 = i61 ^ 43;
                                    int i64 = -(-((i63 & i62) | (i63 ^ i62)));
                                    int i65 = ((~i64) & i62) | ((~i62) & i64);
                                    int i66 = -(-((i64 & i62) << 1));
                                    int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                                    getHighSpeedVideoFpsRanges = i67 % 128;
                                    int i68 = 262144 & i;
                                    if (i67 % 2 != 0 ? i68 == 0 : i68 == 0) {
                                        z5 = false;
                                        if (z) {
                                            int i69 = getHighSpeedVideoFpsRangesFor;
                                            int i70 = (i69 & 109) + (i69 | 109);
                                            getHighSpeedVideoSizes = i70 % 128;
                                        }
                                        i2 = getHighSpeedVideoFpsRanges + 17;
                                        int i71 = i2 % 128;
                                        Camera2StreamConfigurationMap = i71;
                                        if (i2 % 2 != 0) {
                                            int i72 = i & 1048576;
                                            int i73 = (~i72) & ((i ^ 1048576) | i72);
                                            int i74 = i73 ^ i72;
                                            int i75 = i72 & i73;
                                        } else {
                                            if ((i & 1048576) == 0) {
                                                int i76 = getHighSpeedVideoSizes;
                                                getHighSpeedVideoFpsRangesFor = ((i76 ^ 51) + ((i76 & 51) << 1)) % 128;
                                                int i77 = i71 ^ 115;
                                                int i78 = i71 & 115;
                                                int i79 = ((i77 ^ i78) | (i77 & i78)) << 1;
                                                int i80 = -((i77 | i78) & (~i78));
                                                getHighSpeedVideoFpsRanges = ((i79 ^ i80) + ((i80 & i79) << 1)) % 128;
                                                z6 = false;
                                            }
                                            z6 = true;
                                        }
                                        if (z2) {
                                            aVar = new util.h.xy.e.b().m26462(context, i);
                                            if (aVar != null) {
                                                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 41) % 128;
                                                if (aVar.m25825() <= 0) {
                                                    int i81 = getHighSpeedVideoFpsRangesFor;
                                                    int i82 = (i81 & 83) + (i81 | 83);
                                                    getHighSpeedVideoSizes = i82 % 128;
                                                }
                                                int i83 = getHighSpeedVideoFpsRanges;
                                                int i84 = (i83 & (-74)) ^ ((~i83) & 73);
                                                int i85 = -(-((i83 & 73) << 1));
                                                int i86 = ((~i85) & i84) | ((~i84) & i85);
                                                int i87 = (i85 & i84) << 1;
                                                Camera2StreamConfigurationMap = ((i86 ^ i87) + ((i86 & i87) << 1)) % 128;
                                                i3 = 2;
                                                if (z6 || (m26472 = new util.h.xy.e.ra().m26472()) == null) {
                                                    aVar2 = null;
                                                } else {
                                                    i3 ^= 64;
                                                    aVar2 = new util.h.xy.c.a<>();
                                                    aVar2.m25826(m26472);
                                                }
                                                if (!z3) {
                                                    int i88 = getHighSpeedVideoFpsRanges;
                                                    int i89 = i88 & 97;
                                                    int i90 = -(-((i88 ^ 97) | i89));
                                                    int i91 = ((i89 | i90) << 1) - (((~i90) & i89) | ((~i89) & i90));
                                                    Camera2StreamConfigurationMap = i91 % 128;
                                                    if (i91 % 2 != 0) {
                                                        throw null;
                                                    }
                                                    if (!z4) {
                                                        int i92 = ((i88 ^ 125) | (i88 & 125)) << 1;
                                                        int i93 = -(((~i88) & 125) ^ (i88 & (-126)));
                                                        int i94 = i92 & i93;
                                                        int i95 = ((i92 ^ i93) | i94) << 1;
                                                        int i96 = -((i92 | i93) & (~i94));
                                                        Camera2StreamConfigurationMap = ((i95 ^ i96) + ((i96 & i95) << 1)) % 128;
                                                        if (!z5) {
                                                            aVar3 = aVar;
                                                            aVar4 = aVar2;
                                                            aVar7 = null;
                                                            aVar5 = null;
                                                            aVar6 = null;
                                                            if (i3 == 0) {
                                                                int i97 = getHighSpeedVideoSizes;
                                                                getHighSpeedVideoFpsRangesFor = ((i97 & 105) + (i97 | 105)) % 128;
                                                                int i98 = Camera2StreamConfigurationMap;
                                                                int i99 = ((i98 ^ 109) | (i98 & 109)) << 1;
                                                                int i100 = -((i98 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i98) & 109));
                                                                int i101 = i99 & i100;
                                                                int i102 = (i100 ^ i99) | i101;
                                                                int i103 = ((i102 * (-919)) - (~(-(-(i101 * (-919)))))) - 1;
                                                                int i104 = ~i102;
                                                                int i105 = ~i101;
                                                                int i106 = (i104 ^ i105) | (i104 & i105);
                                                                int i107 = ~((i106 & i) | (i106 ^ i));
                                                                int i108 = i105 | i16;
                                                                int i109 = ~((i108 ^ i102) | (i108 & i102));
                                                                int i110 = -(-(((i107 ^ i109) | (i107 & i109)) * 920));
                                                                int i111 = ~i106;
                                                                int i112 = ~((i104 & i16) | (i104 ^ i16));
                                                                int i113 = ~((i106 ^ i16) | (i106 & i16));
                                                                int i114 = ~((i101 ^ i104) | (i101 & i104) | i);
                                                                int i115 = (i114 ^ i113) | (i113 & i114);
                                                                int i116 = i102 | i105;
                                                                int i117 = ~((i116 ^ i) | (i116 & i));
                                                                int i118 = (i103 ^ i110) + ((i103 & i110) << 1) + (((i111 & i112) | (i111 ^ i112)) * 920) + (((i117 ^ i115) | (i117 & i115)) * 920);
                                                                getHighSpeedVideoFpsRanges = i118 % 128;
                                                                i3 = i118 % 2 == 0 ? 10555 : 128;
                                                            }
                                                            aVar9 = aVar3;
                                                            aVar10 = aVar4;
                                                            util.h.xy.c.b m25830 = new util.h.xy.c.b.ra().m25829(i3).m25831(65536, aVar9).m25831(524288, aVar5).m25831(131072, aVar6).m25831(262144, aVar7).m25831(1048576, aVar10).m25830();
                                                            if (aVar9 != null) {
                                                                int i119 = getHighSpeedVideoFpsRanges;
                                                                int i120 = i119 & 39;
                                                                int i121 = (~i120) & (i119 | 39);
                                                                int i122 = ((i120 ^ i121) | (i120 & i121)) << 1;
                                                                int i123 = -((i119 & (-40)) | ((~i119) & 39));
                                                                int i124 = i122 & i123;
                                                                int i125 = (i123 | i122) & (~i124);
                                                                int i126 = i124 << 1;
                                                                int i127 = ((i125 | i126) << 1) - (i125 ^ i126);
                                                                Camera2StreamConfigurationMap = i127 % 128;
                                                                if (i127 % 2 != 0) {
                                                                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 13) % 128;
                                                                    aVar9.m25825();
                                                                    throw new java.lang.ArithmeticException();
                                                                }
                                                                if (aVar9.m25825() > 0) {
                                                                    int i128 = getHighSpeedVideoFpsRanges;
                                                                    int i129 = i128 & 111;
                                                                    int i130 = -(-((i128 & (-112)) | ((~i128) & 111) | i129));
                                                                    int i131 = ((i129 ^ i130) | (i129 & i130)) << 1;
                                                                    int i132 = -(((~i130) & i129) | ((~i129) & i130));
                                                                    int i133 = i132 * (-523);
                                                                    int i134 = i131 * 263;
                                                                    int i135 = (i133 ^ i134) + ((i133 & i134) << 1);
                                                                    int i136 = ~i132;
                                                                    int i137 = ~((i136 ^ i131) | (i136 & i131));
                                                                    int i138 = ~i131;
                                                                    int i139 = ~((i132 & i138) | (i138 ^ i132));
                                                                    int i140 = (i137 & i139) | (i137 ^ i139);
                                                                    int i141 = ~((i138 ^ i) | (i138 & i));
                                                                    int i142 = ((i140 & i141) | (i140 ^ i141)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                                                                    int i143 = (i135 & i142) + (i142 | i135);
                                                                    int i144 = -(-(i139 * (-786)));
                                                                    int i145 = ((i143 | i144) << 1) - (i144 ^ i143);
                                                                    int i146 = ~(i16 | i138);
                                                                    int i147 = ~(i136 | i131);
                                                                    int i148 = -(-((i139 | (i147 ^ i146) | (i146 & i147)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                                                                    int i149 = (i145 & i148) + (i148 | i145);
                                                                    Camera2StreamConfigurationMap = i149 % 128;
                                                                    if (i149 % 2 != 0) {
                                                                        aVar9.m25824();
                                                                        throw null;
                                                                    }
                                                                    aVar9.m25824();
                                                                }
                                                            }
                                                            if (aVar5 != null) {
                                                                int i150 = getHighSpeedVideoSizes;
                                                                getHighSpeedVideoFpsRangesFor = ((i150 ^ 101) + ((i150 & 101) << 1)) % 128;
                                                                int i151 = getHighSpeedVideoFpsRanges;
                                                                int i152 = i151 & 105;
                                                                int i153 = (i151 & (-106)) | ((~i151) & 105);
                                                                int i154 = (i153 ^ i152) | (i153 & i152);
                                                                int i155 = i152 & i154;
                                                                int i156 = (i154 | i152) & (~i155);
                                                                int i157 = i155 << 1;
                                                                Camera2StreamConfigurationMap = ((i156 ^ i157) + ((i156 & i157) << 1)) % 128;
                                                                if (aVar5.m25825() > 0) {
                                                                    int i158 = Camera2StreamConfigurationMap;
                                                                    int i159 = i158 & 79;
                                                                    int i160 = ~i159;
                                                                    int i161 = -(-(((i158 | 79) & i160) | i159));
                                                                    int i162 = (i160 & i161) | ((~i161) & i159);
                                                                    int i163 = (i161 & i159) << 1;
                                                                    int i164 = i163 * 371;
                                                                    int i165 = -(-(i162 * 371));
                                                                    int i166 = (i164 & i165) + (i164 | i165);
                                                                    int i167 = ~i163;
                                                                    int i168 = ~i162;
                                                                    int i169 = ((~(i168 | i16)) | (~(i167 | i))) * (-370);
                                                                    int i170 = (i166 ^ i169) + ((i166 & i169) << 1);
                                                                    int i171 = ~(i167 | i16);
                                                                    int i172 = ~((i168 ^ i) | (i168 & i));
                                                                    int i173 = (i171 ^ i172) | (i171 & i172);
                                                                    int i174 = ~((i163 ^ i162) | (i163 & i162));
                                                                    int i175 = -(-(((i173 ^ i174) | (i173 & i174)) * (-370)));
                                                                    getHighSpeedVideoFpsRanges = (((((i170 | i175) << 1) - (i175 ^ i170)) - (~(i174 * com.knotapi.knot.utilities.Constants.ID_KROGER))) - 1) % 128;
                                                                    aVar5.m25824();
                                                                    int i176 = getHighSpeedVideoFpsRanges;
                                                                    int i177 = i176 & 115;
                                                                    i5 = 1;
                                                                    int i178 = (((i176 & (-116)) | ((~i176) & 115)) | i177) << 1;
                                                                    int i179 = -(((i176 ^ 115) | i177) & (~i177));
                                                                    int i180 = ((i178 ^ i179) | (i178 & i179)) << 1;
                                                                    int i181 = -(((~i179) & i178) | ((~i178) & i179));
                                                                    Camera2StreamConfigurationMap = ((i180 ^ i181) + ((i181 & i180) << 1)) % 128;
                                                                    if (aVar6 != null) {
                                                                        int i182 = getHighSpeedVideoFpsRangesFor;
                                                                        getHighSpeedVideoSizes = (((i182 | 23) << i5) - (i182 ^ 23)) % 128;
                                                                        int i183 = Camera2StreamConfigurationMap;
                                                                        int i184 = i183 & 105;
                                                                        int i185 = (i183 | 105) & (~i184);
                                                                        int i186 = -(-((i185 ^ i184) | (i185 & i184)));
                                                                        int i187 = i184 | i186;
                                                                        int i188 = i187 << 1;
                                                                        int i189 = -((~(i186 & i184)) & i187);
                                                                        getHighSpeedVideoFpsRanges = ((i188 & i189) + (i189 | i188)) % 128;
                                                                        if (aVar6.m25825() > 0) {
                                                                            int i190 = getHighSpeedVideoFpsRanges;
                                                                            int i191 = i190 & 125;
                                                                            int i192 = ~i191;
                                                                            int i193 = (((i190 | 125) & i192) | i191) << 1;
                                                                            int i194 = -(~(-(((i190 ^ 125) | i191) & i192)));
                                                                            int i195 = i194 * (-209);
                                                                            int i196 = i193 * (-209);
                                                                            int i197 = (i195 & i196) + (i195 | i196);
                                                                            int i198 = ~i194;
                                                                            int i199 = ~i193;
                                                                            int i200 = (~((i199 & i198) | (i198 ^ i199))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                                                                            int i201 = ~((i199 ^ i16) | (i199 & i16));
                                                                            int i202 = ~((i198 & i) | (i198 ^ i));
                                                                            int i203 = (i197 ^ i200) + ((i197 & i200) << 1) + (((i202 & i201) | (i201 ^ i202)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
                                                                            int i204 = (i198 ^ i16) | (i198 & i16);
                                                                            int i205 = ~((i204 ^ i193) | (i204 & i193));
                                                                            int i206 = (i194 ^ i199) | (i194 & i199);
                                                                            int i207 = ~((i206 ^ i) | (i206 & i));
                                                                            int i208 = ((i207 ^ i205) | (i207 & i205)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                                                                            int i209 = (i203 ^ i208) + ((i208 & i203) << 1);
                                                                            int i210 = (i209 * 306) + 304 + ((~((i209 ^ (-1)) | i209)) * 305);
                                                                            int i211 = ((~i209) | (~((~i16) | i16))) * 305;
                                                                            int i212 = (i210 & i211) + (i210 | i211);
                                                                            Camera2StreamConfigurationMap = i212 % 128;
                                                                            if (i212 % 2 != 0) {
                                                                                aVar6.m25824();
                                                                                throw null;
                                                                            }
                                                                            aVar6.m25824();
                                                                            int i213 = Camera2StreamConfigurationMap;
                                                                            int i214 = i213 & 31;
                                                                            int i215 = (i213 & (-32)) | ((~i213) & 31);
                                                                            int i216 = (i215 ^ i214) | (i215 & i214);
                                                                            int i217 = ((i214 ^ i216) | (i214 & i216)) << 1;
                                                                            int i218 = -(((~i216) & i214) | ((~i214) & i216));
                                                                            getHighSpeedVideoFpsRanges = (((i217 | i218) << 1) - (i218 ^ i217)) % 128;
                                                                        }
                                                                    }
                                                                    if (aVar7 != null) {
                                                                        int i219 = Camera2StreamConfigurationMap;
                                                                        int i220 = i219 & 43;
                                                                        int i221 = ((i219 ^ 43) | i220) & (~i220);
                                                                        int i222 = -(-(i220 << 1));
                                                                        int i223 = i221 ^ i222;
                                                                        int i224 = -(-((i221 & i222) << 1));
                                                                        int i225 = (i223 ^ i224) + ((i224 & i223) << 1);
                                                                        getHighSpeedVideoFpsRanges = i225 % 128;
                                                                        if (i225 % 2 == 0) {
                                                                            aVar7.m25825();
                                                                            throw new java.lang.ArithmeticException();
                                                                        }
                                                                        int i226 = getHighSpeedVideoFpsRangesFor;
                                                                        int i227 = ((i226 | 117) << 1) - (i226 ^ 117);
                                                                        getHighSpeedVideoSizes = i227 % 128;
                                                                        if (i227 % 2 == 0) {
                                                                            aVar7.m25825();
                                                                            throw new java.lang.ArithmeticException();
                                                                        }
                                                                        if (aVar7.m25825() > 0) {
                                                                            aVar7.m25824();
                                                                            int i228 = getHighSpeedVideoFpsRangesFor + 37;
                                                                            getHighSpeedVideoSizes = i228 % 128;
                                                                            if (i228 % 2 == 0) {
                                                                                int i229 = Camera2StreamConfigurationMap;
                                                                                int i230 = i229 & 93;
                                                                                int i231 = (i229 & (-94)) | ((~i229) & 93);
                                                                                int i232 = -(-((i231 ^ i230) | (i231 & i230)));
                                                                                int i233 = i230 & i232;
                                                                                int i234 = ((i232 | i230) & (~i233)) << (i233 << 1);
                                                                                getHighSpeedVideoFpsRanges = i234 * 15621;
                                                                                int i235 = i234 / 3;
                                                                            } else {
                                                                                int i236 = Camera2StreamConfigurationMap;
                                                                                int i237 = i236 & 93;
                                                                                int i238 = (i236 | 93) & (~i237);
                                                                                int i239 = -(-((i238 ^ i237) | (i238 & i237)));
                                                                                int i240 = i237 & i239;
                                                                                int i241 = (i239 | i237) & (~i240);
                                                                                int i242 = i240 << 1;
                                                                                getHighSpeedVideoFpsRanges = (((i241 | i242) << 1) - (i241 ^ i242)) % 128;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (aVar10 != null) {
                                                                        int i243 = Camera2StreamConfigurationMap;
                                                                        int i244 = i243 & 14;
                                                                        int i245 = -(-((i243 ^ 14) | i244));
                                                                        getHighSpeedVideoFpsRanges = (((i244 ^ i245) + ((i245 & i244) << 1)) - 1) % 128;
                                                                        if (aVar10.m25825() > 0) {
                                                                            int i246 = Camera2StreamConfigurationMap;
                                                                            int i247 = i246 ^ 9;
                                                                            getHighSpeedVideoFpsRanges = (((((i246 & 9) | i247) << 1) - (~(-i247))) - 1) % 128;
                                                                            aVar10.m25824();
                                                                            int i248 = Camera2StreamConfigurationMap;
                                                                            int i249 = ((i248 ^ 49) + ((i248 & 49) << 1)) - 1;
                                                                            int i250 = (((i249 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL) + my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - (~((~((i & i249) | (i249 ^ i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) - 1;
                                                                            int i251 = ~i249;
                                                                            int i252 = (~(i251 | (~i251))) * (-1042);
                                                                            int i253 = (i250 & i252) + (i250 | i252);
                                                                            int i254 = -(-((~((i16 ^ i249) | (i249 & i16))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                                                                            getHighSpeedVideoFpsRanges = ((i253 & i254) + (i254 | i253)) % 128;
                                                                        }
                                                                    }
                                                                    return m25830;
                                                                }
                                                            }
                                                            i5 = 1;
                                                            if (aVar6 != null) {
                                                            }
                                                            if (aVar7 != null) {
                                                            }
                                                            if (aVar10 != null) {
                                                            }
                                                            return m25830;
                                                        }
                                                    }
                                                }
                                                highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(inputStream);
                                                if (highSpeedVideoSizes != null) {
                                                    throw new util.h.xy.c.ma(120, null);
                                                }
                                                if (z3) {
                                                    util.h.xy.c.a<util.h.xy.c.mb> m26463 = new util.h.xy.e.d().m26463(context, i, highSpeedVideoSizes.m26474(util.h.xy.e.rb.ma.f1884));
                                                    if (m26463 != null) {
                                                        int i255 = Camera2StreamConfigurationMap;
                                                        int i256 = i255 & 61;
                                                        int i257 = ((i255 ^ 61) | i256) << 1;
                                                        int i258 = -(~(-((i255 | 61) & (~i256))));
                                                        int i259 = i258 * 595;
                                                        int i260 = -(-(i257 * (-1187)));
                                                        int i261 = ~i258;
                                                        int i262 = ~((i261 ^ i257) | (i261 & i257));
                                                        int i263 = ~((i16 ^ i257) | (i16 & i257));
                                                        int i264 = -(-(((i262 ^ i263) | (i263 & i262)) * (-1188)));
                                                        int i265 = ~i257;
                                                        aVar4 = aVar2;
                                                        int i266 = ~((i265 ^ i) | (i265 & i));
                                                        int i267 = (i262 ^ i266) | (i262 & i266);
                                                        int i268 = ~((i16 ^ i258) | (i16 & i258));
                                                        aVar3 = aVar;
                                                        int i269 = ~((i265 & i16) | (i265 ^ i16));
                                                        int i270 = ~((i265 & i258) | (i265 ^ i258));
                                                        int i271 = (i270 ^ i269) | (i269 & i270);
                                                        int i272 = ((((i259 & i260) + (i260 | i259)) - (~i264)) - 1) + (((i267 ^ i268) | (i267 & i268)) * 594) + (((i271 & i268) | (i271 ^ i268)) * 594);
                                                        int i273 = (((i272 * (-500)) + 500) - (~(-(-((~((i272 ^ i) | (i272 & i))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))))) - 1;
                                                        int i274 = -(-((~(~i272)) * 1002));
                                                        int i275 = (i273 & i274) + (i273 | i274);
                                                        int i276 = -(-((~(i272 | i16)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                                        getHighSpeedVideoFpsRanges = ((i275 ^ i276) + ((i276 & i275) << 1)) % 128;
                                                        if (m26463.m25825() > 0) {
                                                            int i277 = getHighSpeedVideoFpsRangesFor;
                                                            int i278 = (i277 ^ 7) + ((i277 & 7) << 1);
                                                            getHighSpeedVideoSizes = i278 % 128;
                                                            if (i278 % 2 != 0) {
                                                                int i279 = Camera2StreamConfigurationMap;
                                                                int i280 = i279 ^ 111;
                                                                int i281 = i279 & 111;
                                                                int i282 = ((i280 ^ i281) | (i280 & i281)) << 1;
                                                                int i283 = -((i280 | i281) & (~i281));
                                                                int i284 = ~i283;
                                                                int i285 = ~i282;
                                                                int i286 = ~((i284 ^ i285) | (i284 & i285));
                                                                int i287 = ~((i284 ^ i) | (i284 & i));
                                                                aVar8 = m26463;
                                                                int i288 = ((((i283 * (-751)) - (~(-(-(i282 * (-751)))))) - 1) - (~(-(-(((i286 ^ i287) | (i286 & i287)) * 1504))))) - 1;
                                                                int i289 = (i284 ^ i282) | (i282 & i284);
                                                                int i290 = -(-((~((i289 & i) | (i289 ^ i))) * (-1504)));
                                                                int i291 = ~i289;
                                                                int i292 = ~(i283 | i285);
                                                                getHighSpeedVideoFpsRanges = (((i288 & i290) + (i290 | i288)) + (((i292 ^ i291) | (i291 & i292)) * 752)) % 128;
                                                                i3 = ((~i3) & 32) ^ (i3 & (-33));
                                                                getHighSpeedVideoFpsRanges = (((i279 | 125) << 1) - (i279 ^ 125)) % 128;
                                                            }
                                                        }
                                                        aVar8 = m26463;
                                                    } else {
                                                        aVar3 = aVar;
                                                        aVar8 = m26463;
                                                        aVar4 = aVar2;
                                                    }
                                                    aVar5 = aVar8;
                                                } else {
                                                    aVar3 = aVar;
                                                    aVar4 = aVar2;
                                                    aVar5 = null;
                                                }
                                                if (z4) {
                                                    aVar6 = new util.h.xy.e.ma().m26464(context, i, highSpeedVideoSizes.m26474(util.h.xy.e.rb.ma.f1882));
                                                    if (aVar6 != null) {
                                                        int i293 = Camera2StreamConfigurationMap;
                                                        int i294 = i293 & 61;
                                                        int i295 = ((i293 ^ 61) | i294) & (~i294);
                                                        int i296 = -(-(i294 << 1));
                                                        int i297 = i295 ^ i296;
                                                        int i298 = ((i295 & i296) | i297) << 1;
                                                        int i299 = -i297;
                                                        int i300 = (i298 ^ i299) + ((i298 & i299) << 1);
                                                        getHighSpeedVideoFpsRanges = i300 % 128;
                                                        if (i300 % 2 == 0) {
                                                            aVar6.m25825();
                                                            throw null;
                                                        }
                                                        if (aVar6.m25825() > 0) {
                                                            int i301 = getHighSpeedVideoSizes;
                                                            int i302 = (i301 & 67) + (i301 | 67);
                                                            getHighSpeedVideoFpsRangesFor = i302 % 128;
                                                            if (i302 % 2 == 0) {
                                                                int i303 = getHighSpeedVideoFpsRanges;
                                                                int i304 = (((i303 & (-96)) | ((~i303) & 95)) - (~(-(-((i303 & 95) << 1))))) - 1;
                                                                Camera2StreamConfigurationMap = i304 % 128;
                                                                i3 = i304 % 2 != 0 ? 0 : ((~i3) & 4) ^ (i3 & (-5));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    aVar6 = null;
                                                }
                                                if (z5) {
                                                    util.h.xy.e.rc rcVar = new util.h.xy.e.rc(context);
                                                    aVar7 = rcVar.m26478(context, i, highSpeedVideoSizes.m26474(util.h.xy.e.rb.ma.f1883));
                                                    if (aVar7 != null) {
                                                        int i305 = getHighSpeedVideoFpsRanges;
                                                        int i306 = -(-(i305 * (-622)));
                                                        int i307 = ((54912 | i306) << 1) - (i306 ^ 54912);
                                                        int i308 = ~i305;
                                                        int i309 = (i308 ^ 88) | (i308 & 88);
                                                        int i310 = -(-((~((i309 ^ i) | (i309 & i))) * 623));
                                                        int i311 = ~(i305 | (-89));
                                                        int i312 = (((i307 | i310) << 1) - (i307 ^ i310)) + (((i311 ^ i16) | (i311 & i16)) * (-623));
                                                        int i313 = ~i309;
                                                        int i314 = ~((i308 ^ i) | (i308 & i));
                                                        int i315 = -(-(((i313 ^ i314) | (i313 & i314) | (~((i & 88) | (i ^ 88)))) * 623));
                                                        int i316 = (i312 & i315) + (i315 | i312);
                                                        int i317 = -(-(i316 * (-112)));
                                                        int i318 = ~i316;
                                                        int i319 = ~((i318 & i16) | (i318 ^ i16));
                                                        int i320 = i319 * 226;
                                                        int i321 = ~(i316 | (i316 ^ (-1)));
                                                        int i322 = ((((i317 ^ i320) + ((i317 & i320) << 1)) + (((i321 & i319) | (i321 ^ i319)) * (-113))) + ((~((i318 ^ i) | (i318 & i))) * 113)) - 1;
                                                        Camera2StreamConfigurationMap = i322 % 128;
                                                        if (i322 % 2 != 0) {
                                                            aVar7.m25825();
                                                            throw null;
                                                        }
                                                        if (aVar7.m25825() > 0) {
                                                            int i323 = getHighSpeedVideoFpsRanges;
                                                            int i324 = i323 & 47;
                                                            int i325 = (i323 | 47) & (~i324);
                                                            int i326 = -(-((i325 ^ i324) | (i325 & i324)));
                                                            int i327 = i324 & i326;
                                                            int i328 = ((((i324 ^ i326) | i327) << 1) - (~(-((i326 | i324) & (~i327))))) - 1;
                                                            Camera2StreamConfigurationMap = i328 % 128;
                                                            if (i328 % 2 != 0) {
                                                                int i329 = i3 & (-91);
                                                                int i330 = ~i3;
                                                                int i331 = i330 & (i3 | i330) & 90;
                                                                i4 = (i329 & (~i331)) | ((~i329) & i331);
                                                            } else {
                                                                i4 = i3 ^ 8;
                                                            }
                                                            i3 = i4;
                                                        }
                                                    }
                                                    if ((i & 256) != 0) {
                                                        int i332 = getHighSpeedVideoFpsRanges;
                                                        int i333 = i332 & 108;
                                                        int i334 = (((~i333) & (i332 | 108)) + (i333 << 1)) - 1;
                                                        Camera2StreamConfigurationMap = i334 % 128;
                                                        if (i334 % 2 == 0) {
                                                            int i335 = (i332 | 65) << 1;
                                                            int i336 = -((i332 & (-66)) | ((~i332) & 65));
                                                            Camera2StreamConfigurationMap = (((i335 | i336) << 1) - (i336 ^ i335)) % 128;
                                                            if ((i3 & 8) != 0) {
                                                                int i337 = getHighSpeedVideoFpsRangesFor;
                                                                int i338 = ((i337 | 73) << 1) - (i337 ^ 73);
                                                                getHighSpeedVideoSizes = i338 % 128;
                                                            }
                                                        }
                                                    } else {
                                                        int i339 = getHighSpeedVideoFpsRanges;
                                                        int i340 = -(-(i339 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL));
                                                        int i341 = ((-47840) ^ i340) + ((i340 & (-47840)) << 1);
                                                        int i342 = (i339 ^ (-93)) | (i339 & (-93));
                                                        int i343 = -(-((~((i342 ^ i) | (i342 & i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                                                        int i344 = (i341 ^ i343) + ((i343 & i341) << 1);
                                                        int i345 = ~i339;
                                                        int i346 = -(-((~((i345 ^ 92) | (i345 & 92))) * (-1042)));
                                                        int i347 = i16 | (-93);
                                                        int i348 = (((i344 ^ i346) + ((i346 & i344) << 1)) - (~(((~((i339 ^ i347) | (i339 & i347))) | (~(i345 | 92))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) - 2;
                                                        Camera2StreamConfigurationMap = i348 % 128;
                                                        if (i348 % 2 == 0) {
                                                            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 115) % 128;
                                                        }
                                                    }
                                                    int i349 = Camera2StreamConfigurationMap;
                                                    int i350 = i349 & 84;
                                                    int i351 = -(-(i349 | 84));
                                                    int i352 = (i350 & i351) + (i351 | i350);
                                                    int i353 = i352 * 185;
                                                    int i354 = (((i353 | 183) << 1) - (i353 ^ 183)) + (i352 * (-368));
                                                    int i355 = ~i352;
                                                    int i356 = (i355 ^ (-1)) | i355;
                                                    int i357 = -(-(((i356 ^ i16) | (i356 & i16)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                                                    int i358 = ~i355;
                                                    int i359 = ~i16;
                                                    int i360 = ~(i359 | i16);
                                                    int i361 = (i358 ^ i360) | (i358 & i360);
                                                    int i362 = ~(i352 | (i352 ^ (-1)));
                                                    getHighSpeedVideoFpsRanges = ((((i354 & i357) + (i354 | i357)) - (~(((i361 ^ i362) | (i361 & i362)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) - 1) % 128;
                                                    util.h.xy.c.a<util.h.xy.c.mb> m26479 = rcVar.m26479();
                                                    if (m26479 != null) {
                                                        int i363 = getHighSpeedVideoFpsRanges;
                                                        int i364 = i363 & 95;
                                                        int i365 = ((i363 ^ 95) | i364) << 1;
                                                        int i366 = -((i363 | 95) & (~i364));
                                                        int i367 = i365 & i366;
                                                        int i368 = (i366 | i365) & (~i367);
                                                        int i369 = i367 << 1;
                                                        int i370 = ((i369 * 624) - (~(-(-(i368 * (-622)))))) - 1;
                                                        int i371 = ~i368;
                                                        int i372 = (i371 ^ i369) | (i371 & i369);
                                                        int i373 = (~((i372 ^ i) | (i372 & i))) * 623;
                                                        int i374 = ((i370 | i373) << 1) - (i370 ^ i373);
                                                        int i375 = ~i369;
                                                        int i376 = -(-(((~((i375 ^ i368) | (i375 & i368))) | i16) * (-623)));
                                                        int i377 = ((i374 | i376) << 1) - (i376 ^ i374);
                                                        int i378 = (~(i371 | i)) | (~i372);
                                                        int i379 = ~((i369 ^ i) | (i369 & i));
                                                        int i380 = ((i378 ^ i379) | (i378 & i379)) * 623;
                                                        Camera2StreamConfigurationMap = ((i377 & i380) + (i380 | i377)) % 128;
                                                        if (m26479.m25825() > 0) {
                                                            int i381 = getHighSpeedVideoFpsRanges;
                                                            int i382 = i381 & 25;
                                                            int i383 = i381 ^ 25;
                                                            int i384 = (i383 ^ i382) | (i383 & i382);
                                                            int i385 = i382 & i384;
                                                            int i386 = -(-((i384 ^ i382) | i385));
                                                            Camera2StreamConfigurationMap = ((i385 ^ i386) + ((i386 & i385) << 1)) % 128;
                                                            int i387 = i3 & 16;
                                                            int i388 = ~i387;
                                                            int i389 = ((i3 ^ 16) | i387) & i388;
                                                            int i390 = (i388 & i389) | ((~i389) & i387);
                                                            int i391 = i387 & i389;
                                                            i3 = (i391 & i390) | (i391 ^ i390);
                                                            if (aVar7 == null) {
                                                                aVar7 = new util.h.xy.c.a<>();
                                                                int i392 = getHighSpeedVideoFpsRanges;
                                                                int i393 = i392 & 57;
                                                                Camera2StreamConfigurationMap = (((((i392 ^ 57) | i393) & (~i393)) - (~(i393 << 1))) - 1) % 128;
                                                            }
                                                            int m25825 = m26479.m25825();
                                                            int i394 = getHighSpeedVideoFpsRanges + 42;
                                                            int i395 = (i394 * (-712)) - 714;
                                                            int i396 = ~i394;
                                                            int i397 = (i359 ^ i396) | (i359 & i396);
                                                            int i398 = (~i396) | i396;
                                                            int i399 = ~((i398 & i) | (i398 ^ i));
                                                            int i400 = -(-(((i397 & i399) | (i397 ^ i399)) * (-713)));
                                                            int i401 = (((i395 ^ i400) + ((i395 & i400) << 1)) - (~(-(-(i399 * 1426))))) - 1;
                                                            int i402 = -(-((~((i396 ^ i16) | (i396 & i16))) * 713));
                                                            Camera2StreamConfigurationMap = (((i401 | i402) << 1) - (i402 ^ i401)) % 128;
                                                            int i403 = 0;
                                                            while (i403 < m25825) {
                                                                int i404 = getHighSpeedVideoFpsRanges;
                                                                int i405 = i404 ^ 28;
                                                                int i406 = (i404 & 28) << 1;
                                                                int i407 = i406 * 51;
                                                                int i408 = -(-(i405 * (-49)));
                                                                int i409 = (i407 ^ i408) + ((i407 & i408) << 1);
                                                                int i410 = -(-(((i406 ^ i) | (i406 & i)) * (-50)));
                                                                int i411 = ~i405;
                                                                int i412 = (~i406) | i411;
                                                                int i413 = ~((i412 & i) | (i412 ^ i));
                                                                int i414 = (i411 ^ i16) | (i411 & i16);
                                                                int i415 = ~(i414 | i406);
                                                                int i416 = (i409 & i410) + (i410 | i409) + (((i413 ^ i415) | (i413 & i415)) * 50);
                                                                int i417 = ~i414;
                                                                int i418 = ~((i411 & i406) | (i411 ^ i406));
                                                                int i419 = (i418 & i417) | (i417 ^ i418);
                                                                int i420 = ~((i406 ^ i16) | (i406 & i16));
                                                                int i421 = -(-(((i420 ^ i419) | (i419 & i420)) * 50));
                                                                int i422 = ((i416 | i421) << 1) - (i421 ^ i416);
                                                                int i423 = (~i422) | i422;
                                                                Camera2StreamConfigurationMap = (((i422 | i423) << 1) - (i423 ^ i422)) % 128;
                                                                aVar7.m25826(m26479.m25827(i403));
                                                                int i424 = (i403 & (-2)) | ((~i403) & 1);
                                                                int i425 = (i403 & 1) << 1;
                                                                int i426 = (i424 | i425) << 1;
                                                                int i427 = -((i424 & (~i425)) | ((~i424) & i425));
                                                                i403 = ((i426 | i427) << 1) - (i427 ^ i426);
                                                                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 27) % 128;
                                                            }
                                                            int i428 = getHighSpeedVideoFpsRangesFor;
                                                            getHighSpeedVideoSizes = (((i428 | 81) << 1) - (i428 ^ 81)) % 128;
                                                            m26479.m25824();
                                                            int i429 = getHighSpeedVideoFpsRangesFor + 11;
                                                            getHighSpeedVideoSizes = i429 % 128;
                                                            if (i429 % 2 == 0) {
                                                                int i430 = getHighSpeedVideoFpsRanges;
                                                                int i431 = i430 & 19;
                                                                Camera2StreamConfigurationMap = (i431 * ((i430 ^ 19) | i431)) >>> 23295;
                                                            } else {
                                                                int i432 = getHighSpeedVideoFpsRanges;
                                                                int i433 = i432 & 103;
                                                                int i434 = i432 | 103;
                                                                Camera2StreamConfigurationMap = ((i433 ^ i434) + ((i434 & i433) << 1)) % 128;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    aVar7 = null;
                                                }
                                                if (i3 == 0) {
                                                }
                                                aVar9 = aVar3;
                                                aVar10 = aVar4;
                                                util.h.xy.c.b m258302 = new util.h.xy.c.b.ra().m25829(i3).m25831(65536, aVar9).m25831(524288, aVar5).m25831(131072, aVar6).m25831(262144, aVar7).m25831(1048576, aVar10).m25830();
                                                if (aVar9 != null) {
                                                }
                                                if (aVar5 != null) {
                                                }
                                                i5 = 1;
                                                if (aVar6 != null) {
                                                }
                                                if (aVar7 != null) {
                                                }
                                                if (aVar10 != null) {
                                                }
                                                return m258302;
                                            }
                                        } else {
                                            aVar = null;
                                        }
                                        i3 = 0;
                                        if (z6) {
                                        }
                                        aVar2 = null;
                                        if (!z3) {
                                        }
                                        highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(inputStream);
                                        if (highSpeedVideoSizes != null) {
                                        }
                                    }
                                }
                                z5 = true;
                                if (z) {
                                }
                                i2 = getHighSpeedVideoFpsRanges + 17;
                                int i712 = i2 % 128;
                                Camera2StreamConfigurationMap = i712;
                                if (i2 % 2 != 0) {
                                }
                                if (z2) {
                                }
                                i3 = 0;
                                if (z6) {
                                }
                                aVar2 = null;
                                if (!z3) {
                                }
                                highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(inputStream);
                                if (highSpeedVideoSizes != null) {
                                }
                            }
                        }
                        int i435 = Camera2StreamConfigurationMap;
                        int i436 = i435 & 41;
                        int i437 = (i435 ^ 41) | i436;
                        int i438 = i436 & i437;
                        int i439 = ((i436 ^ i437) | i438) << 1;
                        int i440 = -((i437 | i436) & (~i438));
                        int i441 = i440 * 829;
                        int i442 = -(-(i439 * 829));
                        int i443 = ~i440;
                        int i444 = ~i439;
                        int i445 = ~((i443 ^ i444) | (i444 & i443));
                        int i446 = (i16 ^ i440) | (i16 & i440);
                        int i447 = ~((i446 ^ i439) | (i446 & i439));
                        int i448 = ((((i441 | i442) << 1) - (i441 ^ i442)) - (~(-(-(((i445 & i447) | (i445 ^ i447)) * (-828)))))) - 1;
                        int i449 = i440 | i439;
                        int i450 = -(-(((i449 ^ i16) | (i449 & i16)) * (-828)));
                        int i451 = (i448 ^ i450) + ((i448 & i450) << 1);
                        int i452 = (~((i440 & i439) | (i440 ^ i439))) * 828;
                        getHighSpeedVideoFpsRanges = ((i451 ^ i452) + ((i452 & i451) << 1)) % 128;
                        z4 = true;
                        if (!z) {
                        }
                        z5 = true;
                        if (z) {
                        }
                        i2 = getHighSpeedVideoFpsRanges + 17;
                        int i7122 = i2 % 128;
                        Camera2StreamConfigurationMap = i7122;
                        if (i2 % 2 != 0) {
                        }
                        if (z2) {
                        }
                        i3 = 0;
                        if (z6) {
                        }
                        aVar2 = null;
                        if (!z3) {
                        }
                        highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(inputStream);
                        if (highSpeedVideoSizes != null) {
                        }
                    }
                }
                z3 = true;
                if (!z) {
                }
                int i4352 = Camera2StreamConfigurationMap;
                int i4362 = i4352 & 41;
                int i4372 = (i4352 ^ 41) | i4362;
                int i4382 = i4362 & i4372;
                int i4392 = ((i4362 ^ i4372) | i4382) << 1;
                int i4402 = -((i4372 | i4362) & (~i4382));
                int i4412 = i4402 * 829;
                int i4422 = -(-(i4392 * 829));
                int i4432 = ~i4402;
                int i4442 = ~i4392;
                int i4452 = ~((i4432 ^ i4442) | (i4442 & i4432));
                int i4462 = (i16 ^ i4402) | (i16 & i4402);
                int i4472 = ~((i4462 ^ i4392) | (i4462 & i4392));
                int i4482 = ((((i4412 | i4422) << 1) - (i4412 ^ i4422)) - (~(-(-(((i4452 & i4472) | (i4452 ^ i4472)) * (-828)))))) - 1;
                int i4492 = i4402 | i4392;
                int i4502 = -(-(((i4492 ^ i16) | (i4492 & i16)) * (-828)));
                int i4512 = (i4482 ^ i4502) + ((i4482 & i4502) << 1);
                int i4522 = (~((i4402 & i4392) | (i4402 ^ i4392))) * 828;
                getHighSpeedVideoFpsRanges = ((i4512 ^ i4522) + ((i4522 & i4512) << 1)) % 128;
                z4 = true;
                if (!z) {
                }
                z5 = true;
                if (z) {
                }
                i2 = getHighSpeedVideoFpsRanges + 17;
                int i71222 = i2 % 128;
                Camera2StreamConfigurationMap = i71222;
                if (i2 % 2 != 0) {
                }
                if (z2) {
                }
                i3 = 0;
                if (z6) {
                }
                aVar2 = null;
                if (!z3) {
                }
                highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(inputStream);
                if (highSpeedVideoSizes != null) {
                }
            }
        }
        int i453 = getHighSpeedVideoFpsRanges;
        int i454 = i453 & 71;
        int i455 = (i454 - (~((i453 ^ 71) | i454))) - 1;
        Camera2StreamConfigurationMap = i455 % 128;
        if (i455 % 2 != 0) {
            int i456 = 2 / 4;
        }
        z2 = true;
        if (!z) {
        }
        z3 = true;
        if (!z) {
        }
        int i43522 = Camera2StreamConfigurationMap;
        int i43622 = i43522 & 41;
        int i43722 = (i43522 ^ 41) | i43622;
        int i43822 = i43622 & i43722;
        int i43922 = ((i43622 ^ i43722) | i43822) << 1;
        int i44022 = -((i43722 | i43622) & (~i43822));
        int i44122 = i44022 * 829;
        int i44222 = -(-(i43922 * 829));
        int i44322 = ~i44022;
        int i44422 = ~i43922;
        int i44522 = ~((i44322 ^ i44422) | (i44422 & i44322));
        int i44622 = (i16 ^ i44022) | (i16 & i44022);
        int i44722 = ~((i44622 ^ i43922) | (i44622 & i43922));
        int i44822 = ((((i44122 | i44222) << 1) - (i44122 ^ i44222)) - (~(-(-(((i44522 & i44722) | (i44522 ^ i44722)) * (-828)))))) - 1;
        int i44922 = i44022 | i43922;
        int i45022 = -(-(((i44922 ^ i16) | (i44922 & i16)) * (-828)));
        int i45122 = (i44822 ^ i45022) + ((i44822 & i45022) << 1);
        int i45222 = (~((i44022 & i43922) | (i44022 ^ i43922))) * 828;
        getHighSpeedVideoFpsRanges = ((i45122 ^ i45222) + ((i45222 & i45122) << 1)) % 128;
        z4 = true;
        if (!z) {
        }
        z5 = true;
        if (z) {
        }
        i2 = getHighSpeedVideoFpsRanges + 17;
        int i712222 = i2 % 128;
        Camera2StreamConfigurationMap = i712222;
        if (i2 % 2 != 0) {
        }
        if (z2) {
        }
        i3 = 0;
        if (z6) {
        }
        aVar2 = null;
        if (!z3) {
        }
        highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(inputStream);
        if (highSpeedVideoSizes != null) {
        }
    }
}
