package util.h.xy.c;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final util.h.xy.c.a<util.h.xy.c.mb> f1079;

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.c.a<util.h.xy.c.mb> f1080;

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int f1081;

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.c.a<util.h.xy.c.mb> f1082;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.c.a<util.h.xy.c.mb> f1083;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.c.a<util.h.xy.c.mb> f1084;

    /* synthetic */ b(int i, util.h.xy.c.a aVar, util.h.xy.c.a aVar2, util.h.xy.c.a aVar3, util.h.xy.c.a aVar4, util.h.xy.c.a aVar5, byte b) {
        this(i, aVar, aVar2, aVar3, aVar4, aVar5);
    }

    private b(int i, util.h.xy.c.a<util.h.xy.c.mb> aVar, util.h.xy.c.a<util.h.xy.c.mb> aVar2, util.h.xy.c.a<util.h.xy.c.mb> aVar3, util.h.xy.c.a<util.h.xy.c.mb> aVar4, util.h.xy.c.a<util.h.xy.c.mb> aVar5) {
        this.f1081 = i;
        this.f1084 = aVar;
        this.f1082 = aVar2;
        this.f1080 = aVar3;
        this.f1083 = aVar4;
        this.f1079 = aVar5;
    }

    public static final class ra {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 15;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static int getHighSpeedVideoSizes;
        private util.h.xy.c.a<util.h.xy.c.mb> Camera2StreamConfigurationMap;
        private util.h.xy.c.a<util.h.xy.c.mb> getHighSpeedVideoSizesFor;
        private util.h.xy.c.a<util.h.xy.c.mb> getInputFormats;
        private util.h.xy.c.a<util.h.xy.c.mb> getInputSizeshNQ4ISI;
        private util.h.xy.c.a<util.h.xy.c.mb> getOutputFormats;
        private int getOutputMinFrameDuration;

        static {
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i = -(-((~((currentTimeMillis & (-7)) | (currentTimeMillis ^ (-7)))) * 104));
            int i2 = (i & (-618)) + (i | (-618));
            int i3 = ~currentTimeMillis;
            int i4 = -(-((~((i3 ^ 6) | (i3 & 6))) * (-104)));
            int i5 = ((i2 | i4) << 1) - (i4 ^ i2);
            int i6 = currentTimeMillis * 104;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            int i8 = ~i7;
            int i9 = -(-(i7 << 1));
            int i10 = (i8 & i9) + (i8 | i9);
            getHighSpeedVideoFpsRangesFor = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoSizes = (((i11 | 35) << 1) - (i11 ^ 35)) % 128;
            } else {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 25) % 128;
            }
            int i12 = getHighSpeedVideoFpsRanges;
            int i13 = ((i12 | 93) << 1) - (i12 ^ 93);
            getHighSpeedVideoSizes = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0217, code lost:
        
            if ((r2 % 2) == 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0282, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0226, code lost:
        
            if (r13 != 1048576) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0228, code lost:
        
            r0 = util.h.xy.c.b.ra.getHighSpeedVideoSizes + 23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x022d, code lost:
        
            r1 = util.h.xy.c.b.ra.getHighSpeedVideoSizes;
            r2 = ((r1 & 117) + (r1 | 117)) % 128;
            util.h.xy.c.b.ra.getHighSpeedVideoFpsRanges = r2;
            r1 = ((((r0 ^ 11) | (r0 & 11)) << 1) - (~(-(~(-((r0 & (-12)) ^ ((~r0) & 11))))))) - 1;
            r0 = r1 * 949;
            r1 = ~r1;
            r3 = ((((((r0 | 947) << 1) - (r0 ^ 947)) - (~((~((r1 ^ r13) | (r1 & r13))) * (-948)))) - 1) + ((~((r1 & r7) | (r1 ^ r7))) * (-948))) + (((r1 ^ (-1)) | r1) * 948);
            util.h.xy.c.b.ra.getHighResolutionOutputSizeshNQ4ISI = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0273, code lost:
        
            if ((r3 % 2) == 0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0275, code lost:
        
            r2 = r2 + 47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x027a, code lost:
        
            util.h.xy.c.b.ra.getHighSpeedVideoSizes = r2 % 128;
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0278, code lost:
        
            r2 = r2 + 43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0222, code lost:
        
            if ((r1 % 2) == 0) goto L26;
         */
        /* renamed from: ᐝ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final util.h.xy.c.b.ra m25831(int i, util.h.xy.c.a<util.h.xy.c.mb> aVar) throws util.h.xy.c.ma {
            int i2;
            int i3;
            int i4 = (getHighSpeedVideoSizes + 57) % 128;
            getHighSpeedVideoFpsRanges = i4;
            getHighSpeedVideoSizes = ((i4 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i4 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
            int i5 = getHighSpeedVideoFpsRangesFor;
            int i6 = i5 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            int i7 = i5 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            int i8 = (i7 ^ i6) | (i7 & i6);
            int i9 = i8 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION;
            int i10 = i6 * (-903);
            int i11 = ~i8;
            int i12 = ~i;
            int i13 = (i9 ^ i10) + ((i9 & i10) << 1) + (((~(i11 | i)) | (~((i12 ^ i6) | (i12 & i6)))) * (-1808));
            int i14 = ~i6;
            int i15 = (i11 ^ i14) | (i11 & i14);
            int i16 = ~((i15 ^ i) | (i15 & i));
            int i17 = i8 | i12;
            int i18 = ~((i17 & i6) | (i17 ^ i6));
            int i19 = -(-(((i16 ^ i18) | (i16 & i18)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
            int i20 = (i13 ^ i19) + ((i13 & i19) << 1);
            int i21 = ~((i6 ^ i11) | (i6 & i11));
            int i22 = ~((i14 & i) | (i14 ^ i));
            int i23 = (i21 ^ i22) | (i21 & i22);
            int i24 = ~i17;
            int i25 = -(-(((i23 ^ i24) | (i24 & i23)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
            int i26 = (i20 ^ i25) + ((i25 & i20) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i26 % 128;
            if (i26 % 2 == 0) {
                getHighSpeedVideoSizes = (i4 + 85) % 128;
            }
            int i27 = i4 + 31;
            int i28 = i27 % 128;
            getHighSpeedVideoSizes = i28;
            if (i27 % 2 != 0) {
                getHighResolutionOutputSizeshNQ4ISI = (i5 >> 85) * 3221;
            } else {
                getHighResolutionOutputSizeshNQ4ISI = (i5 + 71) % 128;
            }
            if (i != 65536) {
                getHighSpeedVideoFpsRanges = (i28 + 91) % 128;
                getHighSpeedVideoFpsRanges = (i28 + 3) % 128;
                int i29 = getHighResolutionOutputSizeshNQ4ISI;
                int i30 = (i29 & (-31)) | ((~i29) & 30);
                int i31 = (i29 & 30) << 1;
                int i32 = i31 * 592;
                int i33 = i30 * (-590);
                int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                int i35 = ~i31;
                int i36 = (~((i35 ^ i30) | (i35 & i30))) * (-1182);
                int i37 = i35 | (~i30);
                int i38 = ~((i37 ^ i12) | (i37 & i12));
                int i39 = ~((i30 ^ i31) | (i30 & i31));
                getHighSpeedVideoFpsRangesFor = ((((((i34 & i36) + (i36 | i34)) - (~(((i39 ^ i38) | (i39 & i38)) * (-591)))) - 1) - (~(-(-((((i ^ i35) | (i35 & i)) | r9) * 591))))) - 2) % 128;
                if (i != 131072) {
                    int i40 = ((i28 & 5) + (i28 | 5)) % 128;
                    getHighSpeedVideoFpsRanges = i40;
                    int i41 = (i40 + 31) % 128;
                    getHighSpeedVideoSizes = i41;
                    int i42 = i29 ^ 95;
                    int i43 = i29 & 95;
                    int i44 = ((i42 ^ i43) | (i42 & i43)) << 1;
                    int i45 = -((i29 | 95) & (~i43));
                    int i46 = i44 & i45;
                    int i47 = (i45 ^ i44) | i46;
                    int i48 = ~i47;
                    int i49 = (((i47 * 592) - (~(i46 * (-590)))) - 1) + ((~((i48 ^ i46) | (i48 & i46))) * (-1182));
                    int i50 = ~i46;
                    int i51 = ~((i48 ^ i50) | (i48 & i50) | i12);
                    int i52 = ~((i47 ^ i46) | (i47 & i46));
                    int i53 = ((i52 ^ i51) | (i52 & i51)) * (-591);
                    int i54 = (i49 ^ i53) + ((i53 & i49) << 1);
                    int i55 = i | i48;
                    int i56 = ((i55 ^ i50) | (i55 & i50)) * 591;
                    int i57 = (i54 ^ i56) + ((i56 & i54) << 1);
                    int i58 = i57 % 128;
                    getHighSpeedVideoFpsRangesFor = i58;
                    if (i57 % 2 == 0) {
                        getHighSpeedVideoFpsRanges = (((i41 | 47) << 1) - (i41 ^ 47)) % 128;
                        throw new java.lang.ArithmeticException();
                    }
                    int i59 = ((i40 & 31) + (i40 | 31)) % 128;
                    getHighSpeedVideoSizes = i59;
                    if (i != 262144) {
                        int i60 = (i59 + 67) % 128;
                        getHighSpeedVideoFpsRanges = i60;
                        int i61 = i58 & 27;
                        int i62 = i58 ^ 27;
                        int i63 = -(-((i62 ^ i61) | (i62 & i61)));
                        int i64 = ((i61 ^ i63) | (i61 & i63)) << 1;
                        int i65 = -((i61 & (~i63)) | ((~i61) & i63));
                        int i66 = i65 * (-523);
                        int i67 = i64 * 263;
                        int i68 = ((i66 | i67) << 1) - (i66 ^ i67);
                        int i69 = ~i65;
                        int i70 = ~((i69 ^ i64) | (i69 & i64));
                        int i71 = ~i64;
                        int i72 = ~(i71 | i65);
                        int i73 = (i72 ^ i70) | (i70 & i72);
                        int i74 = ~((i71 & i) | (i71 ^ i));
                        int i75 = ((i73 ^ i74) | (i73 & i74)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                        int i76 = (i68 & i75) + (i75 | i68);
                        int i77 = ~((i65 & i71) | (i71 ^ i65));
                        int i78 = -(-(i77 * (-786)));
                        int i79 = ~((i71 ^ i12) | (i71 & i12));
                        int i80 = (i70 ^ i79) | (i70 & i79);
                        getHighResolutionOutputSizeshNQ4ISI = ((((i76 & i78) + (i78 | i76)) - (~(-(-(((i77 ^ i80) | (i80 & i77)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))))) - 1) % 128;
                        if (i != 524288) {
                            int i81 = i58 & 23;
                            int i82 = (~i81) & ((i58 ^ 23) | i81);
                            int i83 = i81 << 1;
                            int i84 = i82 & i83;
                            int i85 = (i83 ^ i82) | i84;
                            int i86 = i85 * (-244);
                            int i87 = i84 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE;
                            int i88 = ~i84;
                            int i89 = (((i86 | i87) << 1) - (i86 ^ i87)) + (((~((i88 ^ i12) | (i88 & i12))) | (~((i88 ^ i85) | (i88 & i85)))) * (-245));
                            int i90 = ~((i88 & i) | (i88 ^ i));
                            int i91 = i90 * (-245);
                            int i92 = ((i89 | i91) << 1) - (i91 ^ i89);
                            int i93 = -(-(((i85 ^ i90) | (i85 & i90)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                            int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
                            getHighResolutionOutputSizeshNQ4ISI = i94 % 128;
                            if (i94 % 2 != 0) {
                                int i95 = i59 + 99;
                                getHighSpeedVideoFpsRanges = i95 % 128;
                            } else {
                                int i96 = i60 + 17;
                                getHighSpeedVideoSizes = i96 % 128;
                            }
                        }
                    } else {
                        i3 = (i59 ^ 111) + ((i59 & 111) << 1);
                    }
                    getHighSpeedVideoFpsRanges = i3 % 128;
                } else {
                    int i97 = (i28 + 87) % 128;
                    getHighSpeedVideoFpsRanges = i97;
                    getHighSpeedVideoSizes = ((i97 & 11) + (i97 | 11)) % 128;
                }
            }
            int i98 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoSizes = ((i98 & 21) + (i98 | 21)) % 128;
            int i99 = getHighSpeedVideoFpsRangesFor;
            int i100 = i99 & 114;
            int i101 = ((i99 ^ 114) | i100) << 1;
            int i102 = -((i99 | 114) & (~i100));
            int i103 = (i101 & i102) + (i102 | i101);
            int i104 = ~i12;
            int i105 = i12 | i104;
            int i106 = ((50 - (~(-(-(i103 * 53))))) - (~(-(-((~((i105 & i103) | (i105 ^ i103))) * 52))))) - 1;
            int i107 = ~i103;
            int i108 = (~((i107 & i12) | (i107 ^ i12))) | (~((~i107) | i107));
            int i109 = ~i105;
            int i110 = -(-(((i109 ^ i108) | (i108 & i109)) * (-52)));
            getHighResolutionOutputSizeshNQ4ISI = ((((i106 & i110) + (i106 | i110)) - (~(((i104 & i107) | (i107 ^ i104)) * 52))) - 1) % 128;
            boolean z = true;
            int i111 = getHighResolutionOutputSizeshNQ4ISI;
            int i112 = i111 ^ 42;
            int i113 = (i111 & 42) << 1;
            int i114 = i113 * 860;
            int i115 = -(-(i112 * (-858)));
            int i116 = (((i114 & i115) + (i114 | i115)) - (~(-(-((i113 | i) * (-859)))))) - 1;
            int i117 = ~((i12 ^ i113) | (i12 & i113));
            int i118 = ~i113;
            int i119 = ~i112;
            int i120 = (i118 ^ i119) | (i118 & i119);
            int i121 = ~((i120 ^ i) | (i120 & i));
            int i122 = ((i117 ^ i121) | (i117 & i121)) * 859;
            int i123 = (i116 & i122) + (i122 | i116);
            int i124 = ~((i119 ^ i12) | (i119 & i12));
            int i125 = ~((i119 ^ i113) | (i113 & i119));
            int i126 = -(-(((i125 ^ i124) | (i125 & i124)) * 859));
            int i127 = ((i123 | i126) << 1) - (i126 ^ i123);
            int i128 = -(-(i127 * com.knotapi.knot.utilities.Constants.ID_KROGER));
            int i129 = -(-(((i12 & i127) | (i127 ^ i12)) * (-369)));
            int i130 = ~((i12 ^ (-1)) | i12);
            int i131 = (((i128 & i129) + (i128 | i129)) - (~(((i130 & i127) | (i127 ^ i130)) * (-369)))) - 1;
            int i132 = ~(~i127);
            int i133 = -(-(((i132 ^ i12) | (i12 & i132)) * 369));
            int i134 = ((i131 & i133) + (i133 | i131)) - 1;
            int i135 = i134 % 128;
            getHighSpeedVideoFpsRangesFor = i135;
            if (i134 % 2 == 0) {
                int i136 = getHighSpeedVideoFpsRanges;
                int i137 = (i136 ^ 87) + ((i136 & 87) << 1);
                getHighSpeedVideoSizes = i137 % 128;
                if (i137 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
            }
            if (!z) {
                throw new util.h.xy.c.ma(119, null);
            }
            if (i == 65536) {
                this.getHighSpeedVideoSizesFor = aVar;
                int i138 = ((~i135) & 11) | (i135 & (-12));
                int i139 = ((i135 & 11) | i138) << 1;
                int i140 = -i138;
                int i141 = i140 * 85;
                int i142 = i139 * 85;
                int i143 = ((i141 | i142) << 1) - (i141 ^ i142);
                int i144 = ~i140;
                int i145 = ~i139;
                int i146 = (~((i144 & i145) | (i144 ^ i145))) | (~((i144 & i12) | (i144 ^ i12)));
                int i147 = ~((i145 ^ i12) | (i145 & i12));
                int i148 = (i146 ^ i147) | (i146 & i147);
                int i149 = (i140 ^ i139) | (i140 & i139);
                int i150 = ~(i149 | i);
                int i151 = ((i148 ^ i150) | (i148 & i150)) * (-84);
                int i152 = ((i143 | i151) << 1) - (i151 ^ i143);
                int i153 = ~((i145 ^ i) | (i145 & i));
                int i154 = (i140 ^ i153) | (i140 & i153);
                int i155 = ~(i12 | i139);
                int i156 = -(-(((i154 ^ i155) | (i154 & i155)) * (-84)));
                int i157 = ~((i139 & i12) | (i12 ^ i139));
                int i158 = ~i149;
                int i159 = (((i152 | i156) << 1) - (i156 ^ i152)) + (((i157 & i158) | (i157 ^ i158)) * 84);
                getHighResolutionOutputSizeshNQ4ISI = i159 % 128;
                if (i159 % 2 != 0) {
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 87) % 128;
                }
            } else if (i == 131072) {
                this.getOutputFormats = aVar;
                int i160 = (~i111) & 95;
                int i161 = i111 & (-96);
                int i162 = (((i111 & 95) | (i161 | i160)) << 1) - (~(-(i160 ^ i161)));
                int i163 = ~((i162 & i12) | (i12 ^ i162));
                getHighSpeedVideoFpsRangesFor = (((((54 - (~(i162 * (-55)))) + (i162 * 56)) - (~((~(i162 | (i162 ^ (-1)))) * (-56)))) - 1) + ((i163 | (i163 ^ (-1))) * 56)) % 128;
            } else if (i != 262144) {
                if (i == 524288) {
                    this.getInputSizeshNQ4ISI = aVar;
                    int i164 = ((i135 ^ 79) | (i135 & 79)) << 1;
                    int i165 = -(~(-(((~i135) & 79) | (i135 & (-80)))));
                    int i166 = i165 * 399;
                    int i167 = i164 * 399;
                    int i168 = ~i165;
                    int i169 = ~(i168 | i164);
                    int i170 = ~i164;
                    int i171 = ~((i170 ^ i165) | (i170 & i165));
                    int i172 = (i169 ^ i171) | (i169 & i171);
                    int i173 = ~(i170 | i);
                    int i174 = ((((i166 ^ i167) + ((i166 & i167) << 1)) - (~(((i172 & i173) | (i172 ^ i173)) * 398))) - 1) + (((i165 ^ i164) | (i165 & i164)) * (-1194));
                    int i175 = ~((i170 ^ i12) | (i170 & i12));
                    int i176 = ~((i164 ^ i168) | (i164 & i168));
                    int i177 = -(-(((i176 ^ i175) | (i175 & i176) | i171) * 398));
                    i2 = ((i174 ^ i177) + ((i177 & i174) << 1)) - 1;
                } else if (i == 1048576) {
                    this.Camera2StreamConfigurationMap = aVar;
                    int i178 = getHighSpeedVideoSizes;
                    getHighSpeedVideoFpsRanges = ((i178 ^ 31) + ((i178 & 31) << 1)) % 128;
                    int i179 = (i178 ^ 61) + ((i178 & 61) << 1);
                    getHighSpeedVideoFpsRanges = i179 % 128;
                    if (i179 % 2 == 0) {
                        int i180 = i135 & 48;
                        int i181 = (~i180) & (i135 | 48);
                        int i182 = (i180 ^ i181) | (i180 & i181);
                        int i183 = -(i135 ^ 48);
                        int i184 = i182 | i183;
                        getHighResolutionOutputSizeshNQ4ISI = ((i184 >> 1) >> ((~(i182 & i183)) & i184)) >>> 30675;
                    } else {
                        int i185 = i135 ^ 37;
                        int i186 = i135 & 37;
                        int i187 = ((i185 ^ i186) | (i185 & i186)) << 1;
                        int i188 = -(((~i135) & 37) | (i135 & (-38)));
                        int i189 = ((i187 ^ i188) | (i187 & i188)) << 1;
                        int i190 = -((i187 & (~i188)) | ((~i187) & i188));
                        i2 = (i189 ^ i190) + ((i190 & i189) << 1);
                    }
                }
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            } else {
                this.getInputFormats = aVar;
                int i191 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoSizes = ((i191 & 5) + (i191 | 5)) % 128;
                int i192 = (-2) - (~((i111 & 117) + (i111 | 117)));
                int i193 = -(-(i192 * 53));
                int i194 = ~i12;
                int i195 = i194 | i12;
                int i196 = (i193 ^ 51) + ((i193 & 51) << 1) + ((~((i195 ^ i192) | (i195 & i192))) * 52);
                int i197 = ~i192;
                int i198 = ~((i197 & i12) | (i197 ^ i12));
                int i199 = ~i195;
                int i200 = ((i198 ^ i199) | (i199 & i198)) * (-52);
                int i201 = (((i196 | i200) << 1) - (i200 ^ i196)) + (((i197 ^ i194) | (i197 & i194)) * 52);
                getHighSpeedVideoFpsRangesFor = i201 % 128;
                if (i201 % 2 != 0) {
                    int i202 = i191 + 115;
                    getHighSpeedVideoSizes = i202 % 128;
                    int i203 = i202 % 2;
                    int i204 = ~(i12 | (-843815581));
                    int i205 = ~((i & (-843815581)) | (i ^ (-843815581)));
                    int i206 = -(-(((i205 ^ 49175535) | (49175535 & i205)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                    int i207 = ~((i ^ (-603996323)) | (i & (-603996323)));
                    int i208 = 448608861 | i12;
                    int i209 = ~((i208 ^ 748180130) | (748180130 & i208));
                    int i210 = -(-(((i207 ^ i209) | (i207 & i209)) * 920));
                    int i211 = (((-428088348) | i210) << 1) - (i210 ^ (-428088348));
                    int i212 = ~(((-748180131) & i12) | ((-748180131) ^ i12));
                    int i213 = -(-(((i212 ^ 603996322) | (603996322 & i212)) * 920));
                    int i214 = (i211 & i213) + (i213 | i211);
                    int i215 = (~((-603996323) | i12)) | (~(((-144183809) & i) | ((-144183809) ^ i)));
                    int i216 = ~((1052605183 & i) | (1052605183 ^ i));
                    int i217 = ((i215 ^ i216) | (i215 & i216)) * 920;
                    if ((((((((i204 ^ 805404688) | (805404688 & i204)) * (-245)) - 1988693476) - (~((~((-843815581) | i)) * (-245)))) - 1) - (~i206)) - 1 > ((i214 | i217) << 1) - (i217 ^ i214)) {
                        getHighSpeedVideoSizes = (((i191 | 107) << 1) - (i191 ^ 107)) % 128;
                    }
                }
                int i218 = 3 / 2;
            }
            int i219 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoSizes = (i219 + 19) % 128;
            int i220 = getHighResolutionOutputSizeshNQ4ISI;
            int i221 = (i220 & (-90)) | ((~i220) & 89);
            int i222 = (i220 & 89) << 1;
            int i223 = i222 * 371;
            int i224 = -(-(i221 * 371));
            int i225 = (i223 & i224) + (i223 | i224);
            int i226 = ~i221;
            int i227 = ~((i226 & i12) | (i226 ^ i12));
            int i228 = ~i222;
            int i229 = ~((i228 & i) | (i228 ^ i));
            int i230 = -(-(((i227 ^ i229) | (i227 & i229)) * (-370)));
            int i231 = ~((i228 ^ i12) | (i228 & i12));
            int i232 = ~(i | i226);
            int i233 = (i232 ^ i231) | (i232 & i231);
            int i234 = ~(i222 | i221);
            int i235 = (((i225 & i230) + (i230 | i225)) - (~(((i233 ^ i234) | (i233 & i234)) * (-370)))) - 1;
            int i236 = -(-((~((i222 ^ i221) | (i222 & i221))) * com.knotapi.knot.utilities.Constants.ID_KROGER));
            int i237 = (i235 & i236) + (i236 | i235);
            getHighSpeedVideoFpsRangesFor = i237 % 128;
            if (i237 % 2 == 0) {
                getHighSpeedVideoSizes = ((i219 ^ 109) + ((i219 & 109) << 1)) % 128;
            }
            return this;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final util.h.xy.c.b.ra m25829(int i) {
            int i2 = getHighSpeedVideoSizes + 111;
            int i3 = i2 % 128;
            getHighSpeedVideoFpsRanges = i3;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            int i4 = (((i3 | 21) << 1) - (i3 ^ 21)) % 128;
            getHighSpeedVideoSizes = i4;
            int i5 = getHighSpeedVideoFpsRangesFor;
            int i6 = (i5 & (-20)) | ((~i5) & 19);
            int i7 = (i5 & 19) << 1;
            int i8 = i6 ^ i7;
            int i9 = -(-((i7 & i6) << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            int i11 = i10 % 128;
            getHighResolutionOutputSizeshNQ4ISI = i11;
            if (i10 % 2 == 0) {
                this.getOutputMinFrameDuration = i;
                int i12 = (i3 + 43) % 128;
                getHighSpeedVideoSizes = i12;
                int i13 = i11 ^ 90;
                int i14 = (((i11 & 90) | i13) << 1) - i13;
                int i15 = ~i14;
                int i16 = -(-(i14 << 1));
                int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                getHighSpeedVideoFpsRangesFor = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = i3 + 93;
                    getHighSpeedVideoSizes = i18 % 128;
                    if (i18 % 2 == 0) {
                        throw null;
                    }
                } else {
                    getHighSpeedVideoFpsRanges = (i12 + 73) % 128;
                }
                return this;
            }
            getHighSpeedVideoFpsRanges = (((i4 | 45) << 1) - (i4 ^ 45)) % 128;
            getHighSpeedVideoFpsRanges = (i4 + 55) % 128;
            this.getOutputMinFrameDuration = i;
            throw new java.lang.ArithmeticException();
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final util.h.xy.c.b m25830() {
            int i = this.getOutputMinFrameDuration;
            util.h.xy.c.a<util.h.xy.c.mb> aVar = this.getHighSpeedVideoSizesFor;
            util.h.xy.c.a<util.h.xy.c.mb> m25828 = aVar != null ? aVar.m25828() : null;
            util.h.xy.c.a<util.h.xy.c.mb> aVar2 = this.getOutputFormats;
            util.h.xy.c.a<util.h.xy.c.mb> m258282 = aVar2 != null ? aVar2.m25828() : null;
            util.h.xy.c.a<util.h.xy.c.mb> aVar3 = this.getInputFormats;
            util.h.xy.c.a<util.h.xy.c.mb> m258283 = aVar3 != null ? aVar3.m25828() : null;
            util.h.xy.c.a<util.h.xy.c.mb> aVar4 = this.getInputSizeshNQ4ISI;
            util.h.xy.c.a<util.h.xy.c.mb> m258284 = aVar4 != null ? aVar4.m25828() : null;
            util.h.xy.c.a<util.h.xy.c.mb> aVar5 = this.Camera2StreamConfigurationMap;
            return new util.h.xy.c.b(i, m25828, m258282, m258283, m258284, aVar5 != null ? aVar5.m25828() : null, (byte) 0);
        }
    }
}
