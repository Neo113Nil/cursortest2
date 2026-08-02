package util.h.xy.e;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 82;

    /* JADX WARN: Removed duplicated region for block: B:105:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0548  */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final util.h.xy.c.a<util.h.xy.c.mb> m26464(android.content.Context context, int i, util.h.xy.e.rb.a aVar) throws util.h.xy.c.ma {
        int i2;
        boolean z;
        util.h.xy.c.a<util.h.xy.c.mb> aVar2;
        java.util.Map<java.lang.String, java.lang.String> m26476;
        java.util.Map<java.lang.String, java.lang.String> m264762;
        int i3;
        int i4 = getHighSpeedVideoSizes;
        int i5 = ((i4 ^ 29) + ((i4 & 29) << 1)) % 128;
        Camera2StreamConfigurationMap = i5;
        getHighSpeedVideoSizes = ((i5 ^ 87) + ((i5 & 87) << 1)) % 128;
        int i6 = getHighSpeedVideoFpsRanges;
        int i7 = (~i6) & 49;
        int i8 = i6 & (-50);
        int i9 = ((i6 & 49) | (i8 | i7)) << 1;
        int i10 = -(i7 ^ i8);
        int i11 = i10 * 615;
        int i12 = -(-(i9 * (-613)));
        int i13 = (i11 & i12) + (i11 | i12);
        int i14 = ~i10;
        int i15 = ~(i14 | i9);
        int i16 = (i15 ^ i) | (i15 & i);
        int i17 = ~i9;
        int i18 = ~(i17 | i10);
        int i19 = ((i16 ^ i18) | (i16 & i18)) * 614;
        int i20 = ~i;
        int i21 = ~((i14 ^ i20) | (i14 & i20));
        int i22 = ~((i14 & i9) | (i14 ^ i9));
        int i23 = i10 | i20;
        getHighSpeedVideoFpsRangesFor = ((((i13 & i19) + (i19 | i13)) + ((((i22 & i21) | (i21 ^ i22)) | (~((i20 ^ i9) | (i20 & i9)))) * (-1228))) + (((~((i9 ^ i23) | (i23 & i9))) | (~(((i14 & i17) | (i14 ^ i17)) | i20))) * 614)) % 128;
        if (context == null) {
            throw new util.h.xy.c.ma(103, null);
        }
        util.h.xy.e.mc.m26470(i);
        if ((2031616 & i) == 0) {
            int i24 = (Camera2StreamConfigurationMap + 113) % 128;
            getHighSpeedVideoSizes = i24;
            int i25 = getHighSpeedVideoFpsRangesFor;
            int i26 = i25 & 109;
            int i27 = i25 ^ 109;
            int i28 = (i27 ^ i26) | (i27 & i26);
            int i29 = i26 ^ i28;
            int i30 = ((i28 & i26) | i29) << 1;
            int i31 = -i29;
            int i32 = i31 * 829;
            int i33 = -(-(i30 * 829));
            int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
            int i35 = ~i31;
            int i36 = ~i30;
            int i37 = ~((i35 & i36) | (i35 ^ i36));
            int i38 = (i20 ^ i31) | (i20 & i31);
            int i39 = ~((i38 & i30) | (i38 ^ i30));
            int i40 = -(-(((i37 & i39) | (i37 ^ i39)) * (-828)));
            int i41 = (i34 & i40) + (i40 | i34) + ((i31 | i30 | i20) * (-828));
            int i42 = -(-((~((i30 ^ i31) | (i30 & i31))) * 828));
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            getHighSpeedVideoFpsRanges = i43 % 128;
            if (i43 % 2 == 0) {
                Camera2StreamConfigurationMap = ((i24 & 53) + (i24 | 53)) % 128;
                int i44 = getHighSpeedVideoFpsRangesFor;
                int i45 = (i44 & (-39)) | ((~i44) & 38);
                int i46 = -(-((i44 & 38) << 1));
                int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                int i48 = ~i47;
                int i49 = -(-(i47 << 1));
                i2 = ((i48 | i49) << 1) - (i48 ^ i49);
                int i50 = i2 % 128;
                getHighSpeedVideoFpsRanges = i50;
                if (i2 % 2 != 0) {
                    int i51 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoSizes = ((i51 ^ 19) + ((i51 & 19) << 1)) % 128;
                }
                if (aVar != null) {
                    throw new util.h.xy.c.ma(126, null);
                }
                int i52 = Camera2StreamConfigurationMap;
                int i53 = (i52 ^ 39) + ((i52 & 39) << 1);
                int i54 = i53 % 128;
                getHighSpeedVideoSizes = i54;
                if (i53 % 2 == 0 ? (i & 256) == 0 : (i & 18114) == 0) {
                    Camera2StreamConfigurationMap = ((i54 & 47) + (i54 | 47)) % 128;
                    int i55 = i50 & 79;
                    getHighSpeedVideoFpsRangesFor = ((i55 - (~(-(~((i50 ^ 79) | i55))))) - 2) % 128;
                    z = false;
                } else {
                    int i56 = i50 & 105;
                    int i57 = i56 - (~(-(-((i50 ^ 105) | i56))));
                    int i58 = -(-(i57 * 306));
                    int i59 = (i58 ^ 304) + ((i58 & 304) << 1);
                    int i60 = (i59 << 1) - i59;
                    int i61 = ((~i57) | (~((~i20) | i20))) * 305;
                    int i62 = (((i60 | i61) << 1) - (i60 ^ i61)) % 128;
                    getHighSpeedVideoFpsRangesFor = i62;
                    Camera2StreamConfigurationMap = ((i54 & 41) + (i54 | 41)) % 128;
                    int i63 = (i62 ^ 53) + ((i62 & 53) << 1);
                    int i64 = -(-(i63 * 263));
                    int i65 = ((i64 | 523) << 1) - (i64 ^ 523);
                    int i66 = ~i63;
                    int i67 = ~((~i66) | i66);
                    int i68 = -(-(((~((i66 ^ i) | (i66 & i))) | (i66 ^ i67) | (i66 & i67)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                    int i69 = ((i65 | i68) << 1) - (i65 ^ i68);
                    int i70 = i67 * (-786);
                    int i71 = ~(i66 | i20);
                    int i72 = (i66 ^ i71) | (i71 & i66);
                    int i73 = (i69 & i70) + (i70 | i69) + (((i72 ^ i67) | (i72 & i67)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
                    int i74 = ~i73;
                    int i75 = (i74 | i73) << 1;
                    int i76 = -i74;
                    int i77 = i76 * (-445);
                    int i78 = -(-(i75 * (-445)));
                    int i79 = ~i76;
                    int i80 = ~i75;
                    int i81 = ~((i79 ^ i80) | (i79 & i80));
                    int i82 = ~((i80 ^ i20) | (i80 & i20));
                    int i83 = (i76 & i80) | (i76 ^ i80);
                    int i84 = (((((i77 & i78) + (i77 | i78)) - (~(-(-(((i81 ^ i82) | (i82 & i81)) * 446))))) - 1) - (~(((~((i75 & i79) | (i75 ^ i79))) | (~((i83 ^ i) | (i83 & i)))) * 446))) - 1;
                    int i85 = i81 * 446;
                    getHighSpeedVideoFpsRanges = ((i84 ^ i85) + ((i85 & i84) << 1)) % 128;
                    z = true;
                }
                java.util.Map<java.lang.String, java.lang.String> m264763 = aVar.m26476(util.h.xy.e.rb.b.f1879);
                if (m264763 != null) {
                    int i86 = getHighSpeedVideoFpsRanges;
                    int i87 = i86 & 34;
                    int i88 = (i86 ^ 34) | i87;
                    int i89 = (i88 * (-661)) + (i87 * (-661));
                    int i90 = ~i87;
                    int i91 = ~i88;
                    int i92 = ~(i91 | i90);
                    int i93 = ((i92 & i20) | (i92 ^ i20)) * 1324;
                    int i94 = (i89 ^ i93) + ((i89 & i93) << 1);
                    int i95 = ~((i88 ^ i) | (i88 & i));
                    int i96 = ~((i87 ^ i) | (i87 & i));
                    int i97 = ((i95 ^ i96) | (i95 & i96)) * (-1324);
                    int i98 = ~((i87 ^ i91) | (i87 & i91));
                    int i99 = ~((i88 ^ i90) | (i88 & i90));
                    int i100 = (((i94 & i97) + (i97 | i94)) - (~(((i99 ^ i98) | (i99 & i98)) * 662))) - 1;
                    getHighSpeedVideoFpsRangesFor = (((~i100) - (~(i100 << 1))) - 1) % 128;
                    if (!m264763.isEmpty()) {
                        int i101 = getHighSpeedVideoFpsRangesFor;
                        int i102 = (((i101 | 127) << 1) - (i101 ^ 127)) - 1;
                        int i103 = ~i102;
                        int i104 = (i102 | i103) << 1;
                        int i105 = -i103;
                        getHighSpeedVideoFpsRanges = ((i104 ^ i105) + ((i105 & i104) << 1)) % 128;
                        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = m264763.entrySet().iterator();
                        int i106 = getHighSpeedVideoFpsRangesFor;
                        int i107 = i106 & 17;
                        int i108 = (((i106 & (-18)) | ((~i106) & 17)) | i107) << 1;
                        int i109 = -(((i106 ^ 17) | i107) & (~i107));
                        int i110 = i108 | i109;
                        int i111 = i110 << 1;
                        int i112 = -((~(i109 & i108)) & i110);
                        getHighSpeedVideoFpsRanges = ((i111 ^ i112) + ((i112 & i111) << 1)) % 128;
                        aVar2 = null;
                        while (it.hasNext()) {
                            int i113 = getHighSpeedVideoFpsRangesFor;
                            int i114 = i113 & 73;
                            int i115 = ((i113 ^ 73) | i114) & (~i114);
                            int i116 = -(-(i114 << 1));
                            int i117 = ((i115 ^ i116) | (i115 & i116)) << 1;
                            int i118 = -((i115 & (~i116)) | ((~i115) & i116));
                            int i119 = (i117 & i118) + (i118 | i117);
                            getHighSpeedVideoFpsRanges = i119 % 128;
                            if (i119 % 2 != 0) {
                                it.next();
                                throw new java.lang.ArithmeticException();
                            }
                            java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
                            if (next != null) {
                                int i120 = Camera2StreamConfigurationMap;
                                getHighSpeedVideoSizes = (i120 + 69) % 128;
                                getHighSpeedVideoSizes = ((i120 ^ 73) + ((i120 & 73) << 1)) % 128;
                                if (util.h.xy.e.mc.m26471(context, next.getValue())) {
                                    int i121 = Camera2StreamConfigurationMap;
                                    int i122 = ((i121 & 75) + (i121 | 75)) % 128;
                                    getHighSpeedVideoSizes = i122;
                                    Camera2StreamConfigurationMap = ((i122 ^ 107) + ((i122 & 107) << 1)) % 128;
                                    int i123 = getHighSpeedVideoFpsRanges;
                                    int i124 = i123 & 44;
                                    int i125 = i123 | 44;
                                    int i126 = i125 * (-661);
                                    int i127 = -(-(i124 * (-661)));
                                    int i128 = (i126 & i127) + (i126 | i127);
                                    int i129 = ~i125;
                                    int i130 = ~i124;
                                    int i131 = ~((i129 ^ i130) | (i130 & i129));
                                    int i132 = -(-(((i20 ^ i131) | (i131 & i20)) * 1324));
                                    int i133 = (i128 & i132) + (i128 | i132);
                                    int i134 = ~((i125 ^ i) | (i125 & i));
                                    int i135 = ~((i124 ^ i) | (i124 & i));
                                    int i136 = ((i134 ^ i135) | (i135 & i134)) * (-1324);
                                    int i137 = ~((i129 ^ i124) | (i124 & i129));
                                    int i138 = ~((i125 ^ i130) | (i125 & i130));
                                    int i139 = (((i133 ^ i136) + ((i133 & i136) << 1)) - (~(((i137 & i138) | (i137 ^ i138)) * 662))) - 1;
                                    int i140 = ~i139;
                                    int i141 = i139 << 1;
                                    getHighSpeedVideoFpsRangesFor = ((i140 & i141) + (i140 | i141)) % 128;
                                    if (aVar2 == null) {
                                        util.h.xy.c.a<util.h.xy.c.mb> aVar3 = new util.h.xy.c.a<>();
                                        int i142 = getHighSpeedVideoFpsRangesFor;
                                        int i143 = i142 & 47;
                                        int i144 = (i142 | 47) & (~i143);
                                        int i145 = (i144 ^ i143) | (i144 & i143);
                                        int i146 = i143 & i145;
                                        int i147 = (i145 ^ i143) | i146;
                                        int i148 = i147 * 784;
                                        int i149 = i146 * (-782);
                                        int i150 = ((i148 | i149) << 1) - (i148 ^ i149);
                                        int i151 = (~i146) * (-783);
                                        int i152 = ~i147;
                                        int i153 = (i152 ^ i20) | (i152 & i20);
                                        int i154 = (((i150 ^ i151) + ((i151 & i150) << 1)) - (~(-(-((~((i153 & i146) | (i153 ^ i146))) * (-783)))))) - 1;
                                        int i155 = ~((i20 ^ i146) | (i146 & i20));
                                        int i156 = ((i152 ^ i155) | (i152 & i155)) * 783;
                                        int i157 = ((i154 | i156) << 1) - (i156 ^ i154);
                                        getHighSpeedVideoFpsRanges = i157 % 128;
                                        if (i157 % 2 != 0) {
                                            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 67) % 128;
                                            int i158 = 3 / 4;
                                        }
                                        aVar2 = aVar3;
                                    }
                                    aVar2.m25826(new util.h.xy.c.mb(next.getKey(), next.getValue()));
                                    if (z) {
                                        int i159 = getHighSpeedVideoFpsRangesFor;
                                        int i160 = i159 & (-72);
                                        int i161 = ~i159;
                                        int i162 = i161 & 71;
                                        int i163 = ((i160 | i162) | (i159 & 71)) << 1;
                                        int i164 = -(i160 ^ i162);
                                        int i165 = i163 & i164;
                                        int i166 = (i164 | i163) & (~i165);
                                        int i167 = -(-(i165 << 1));
                                        getHighSpeedVideoFpsRanges = (((i166 | i167) << 1) - (i166 ^ i167)) % 128;
                                        int i168 = (i159 & (-42)) ^ (i161 & 41);
                                        int i169 = (i159 & 41) << 1;
                                        int i170 = (i169 * 980) + (i168 * (-978));
                                        int i171 = ~i168;
                                        int i172 = -(-((~(i171 | i20)) * 979));
                                        int i173 = ((i170 | i172) << 1) - (i170 ^ i172);
                                        int i174 = (i169 | i) * (-979);
                                        int i175 = ((i173 | i174) << 1) - (i174 ^ i173);
                                        int i176 = ~((i ^ i171) | (i & i171));
                                        int i177 = ~((i169 ^ i20) | (i169 & i20));
                                        int i178 = -(-(((i177 ^ i176) | (i177 & i176)) * 979));
                                        int i179 = (i175 & i178) + (i178 | i175);
                                        getHighSpeedVideoFpsRanges = i179 % 128;
                                        if (i179 % 2 != 0) {
                                            throw new java.lang.ArithmeticException();
                                        }
                                        int i180 = Camera2StreamConfigurationMap;
                                        int i181 = (i180 ^ 55) + ((i180 & 55) << 1);
                                        getHighSpeedVideoSizes = i181 % 128;
                                        if (i181 % 2 == 0) {
                                            return aVar2;
                                        }
                                        throw null;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            int i182 = getHighSpeedVideoFpsRanges;
                            int i183 = i182 & 49;
                            int i184 = (i182 | 49) & (~i183);
                            int i185 = ((i183 ^ i184) | (i184 & i183)) << 1;
                            int i186 = -i184;
                            getHighSpeedVideoFpsRangesFor = ((i185 & i186) + (i186 | i185)) % 128;
                        }
                        m26476 = aVar.m26476(util.h.xy.e.rb.b.f1881);
                        if (m26476 != null) {
                            int i187 = getHighSpeedVideoFpsRangesFor;
                            int i188 = ((i187 ^ 57) | (i187 & 57)) << 1;
                            int i189 = -((i187 & (-58)) | ((~i187) & 57));
                            getHighSpeedVideoFpsRanges = (((i188 | i189) << 1) - (i189 ^ i188)) % 128;
                            if (!m26476.isEmpty()) {
                                int i190 = getHighSpeedVideoFpsRanges + 126;
                                int i191 = -(-(i190 * (-494)));
                                int i192 = (i191 & 494) + (i191 | 494);
                                int i193 = -(-((~((i190 ^ (-1)) | i190)) * (-495)));
                                int i194 = (i192 & i193) + (i193 | i192);
                                int i195 = (i20 ^ (-1)) | i20;
                                int i196 = i195 * 495;
                                int i197 = (i194 ^ i196) + ((i196 & i194) << 1);
                                int i198 = -(-(((~(~i190)) | (~i195)) * 495));
                                int i199 = ((i197 | i198) << 1) - (i198 ^ i197);
                                getHighSpeedVideoFpsRangesFor = i199 % 128;
                                if (i199 % 2 == 0) {
                                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 17) % 128;
                                    m26476.entrySet().iterator();
                                    throw null;
                                }
                                java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it2 = m26476.entrySet().iterator();
                                int i200 = getHighSpeedVideoFpsRangesFor;
                                int i201 = ((i200 | 114) << 1) - (i200 ^ 114);
                                int i202 = ~i201;
                                int i203 = i201 << 1;
                                int i204 = i203 * (-751);
                                int i205 = i202 * (-751);
                                int i206 = ~i203;
                                int i207 = ~i202;
                                int i208 = (((i204 & i205) + (i204 | i205)) - (~(-(-(((~((i207 & i206) | (i206 ^ i207))) | (~(i206 | i))) * 1504))))) - 1;
                                int i209 = -(-((~(i206 | i202 | i)) * (-1504)));
                                int i210 = ~((i202 ^ i206) | (i206 & i202));
                                int i211 = ~((i203 ^ i207) | (i207 & i203));
                                getHighSpeedVideoFpsRanges = (((i208 & i209) + (i209 | i208)) + (((i210 ^ i211) | (i211 & i210)) * 752)) % 128;
                                while (it2.hasNext()) {
                                    int i212 = getHighSpeedVideoFpsRanges;
                                    int i213 = i212 & 93;
                                    int i214 = (~i213) & (i212 | 93);
                                    int i215 = ((i213 ^ i214) | (i213 & i214)) << 1;
                                    int i216 = -((i212 & (-94)) | ((~i212) & 93));
                                    int i217 = ((i215 | i216) << 1) - (i216 ^ i215);
                                    getHighSpeedVideoFpsRangesFor = i217 % 128;
                                    if (i217 % 2 != 0) {
                                        int i218 = Camera2StreamConfigurationMap;
                                        int i219 = (i218 & 117) + (i218 | 117);
                                        getHighSpeedVideoSizes = i219 % 128;
                                        if (i219 % 2 == 0) {
                                            java.util.Map.Entry<java.lang.String, java.lang.String> next2 = it2.next();
                                            if (next2 != null) {
                                                int i220 = getHighSpeedVideoFpsRangesFor;
                                                int i221 = i220 & 97;
                                                int i222 = (i220 & (-98)) | ((~i220) & 97);
                                                int i223 = (i222 ^ i221) | (i222 & i221);
                                                int i224 = i221 & i223;
                                                int i225 = (i223 ^ i221) | i224;
                                                getHighSpeedVideoFpsRanges = ((i224 & i225) + (i225 | i224)) % 128;
                                                if (!util.h.xy.e.mc.m26469(next2.getValue())) {
                                                    int i226 = getHighSpeedVideoSizes;
                                                    int i227 = (i226 ^ 39) + ((i226 & 39) << 1);
                                                    Camera2StreamConfigurationMap = i227 % 128;
                                                    if (i227 % 2 != 0) {
                                                        continue;
                                                    }
                                                }
                                                int i228 = getHighSpeedVideoFpsRangesFor;
                                                int i229 = i228 ^ 65;
                                                int i230 = i228 & 65;
                                                int i231 = ((i229 ^ i230) | (i229 & i230)) << 1;
                                                int i232 = -((i228 | 65) & (~i230));
                                                int i233 = ((i231 ^ i232) | (i231 & i232)) << 1;
                                                int i234 = -(((~i232) & i231) | ((~i231) & i232));
                                                int i235 = (i233 & i234) + (i234 | i233);
                                                getHighSpeedVideoFpsRanges = i235 % 128;
                                                if (i235 % 2 != 0) {
                                                    throw new java.lang.ArithmeticException();
                                                }
                                                if (aVar2 == null) {
                                                    aVar2 = new util.h.xy.c.a<>();
                                                    int i236 = getHighSpeedVideoFpsRanges;
                                                    int i237 = i236 & 33;
                                                    int i238 = (~i237) & (i236 | 33);
                                                    int i239 = ((i237 ^ i238) | (i237 & i238)) << 1;
                                                    int i240 = -(~(-(i236 ^ 33)));
                                                    int i241 = ((i239 | i240) << 1) - (i240 ^ i239);
                                                    int i242 = i241 * 984;
                                                    int i243 = ~i241;
                                                    int i244 = (i242 ^ 1965) + ((i242 & 1965) << 1) + (((i243 ^ (-1)) | i243) * 983);
                                                    int i245 = -(-((~((i243 & i20) | (i243 ^ i20))) * (-983)));
                                                    int i246 = (i244 & i245) + (i245 | i244);
                                                    int i247 = ~i20;
                                                    int i248 = -(-(((i247 ^ i243) | (i247 & i243)) * 983));
                                                    getHighSpeedVideoFpsRangesFor = (((i246 | i248) << 1) - (i248 ^ i246)) % 128;
                                                }
                                                aVar2.m25826(new util.h.xy.c.mb(next2.getKey(), next2.getValue()));
                                                if (z) {
                                                    int i249 = getHighSpeedVideoFpsRangesFor;
                                                    int i250 = ((i249 | 97) << 1) - (i249 ^ 97);
                                                    int i251 = (i250 * (-932)) - 934;
                                                    int i252 = ~i250;
                                                    int i253 = ~i20;
                                                    int i254 = -(-(((i253 ^ i252) | (i253 & i252)) * (-933)));
                                                    int i255 = (i251 ^ i254) + ((i251 & i254) << 1);
                                                    int i256 = ~(i252 | i20);
                                                    int i257 = ~(i252 | (~i252));
                                                    int i258 = ((i256 ^ i257) | (i257 & i256)) * 933;
                                                    int i259 = ((i255 | i258) << 1) - (i258 ^ i255);
                                                    int i260 = -(-((~((i250 ^ (-1)) | i250)) * 933));
                                                    int i261 = -(~((i259 & i260) + (i260 | i259)));
                                                    int i262 = i261 * (-337);
                                                    int i263 = ~i261;
                                                    int i264 = ~((i263 ^ i20) | (i263 & i20));
                                                    int i265 = ~((i261 ^ 1) | (i261 & 1));
                                                    int i266 = (i265 ^ i264) | (i264 & i265);
                                                    int i267 = ~((i261 ^ i) | (i261 & i));
                                                    int i268 = (((i262 | (-678)) << 1) - (i262 ^ (-678))) + (((i266 & i267) | (i266 ^ i267)) * (-338));
                                                    int i269 = -(-((~((i263 ^ (-2)) | (i263 & (-2)))) * 338));
                                                    int i270 = ((i268 | i269) << 1) - (i269 ^ i268);
                                                    int i271 = (i261 ^ (-2)) | (i261 & (-2));
                                                    int i272 = ~((i271 ^ i) | (i271 & i));
                                                    int i273 = ((i272 ^ i264) | (i272 & i264)) * 338;
                                                    int i274 = (i270 ^ i273) + ((i273 & i270) << 1);
                                                    getHighSpeedVideoFpsRanges = i274 % 128;
                                                    if (i274 % 2 == 0) {
                                                        return aVar2;
                                                    }
                                                    throw new java.lang.ArithmeticException();
                                                }
                                            }
                                            int i275 = getHighSpeedVideoSizes;
                                            Camera2StreamConfigurationMap = (((i275 | 63) << 1) - (i275 ^ 63)) % 128;
                                            int i276 = getHighSpeedVideoFpsRanges;
                                            int i277 = i276 ^ 103;
                                            int i278 = (i276 & 103) << 1;
                                            int i279 = i277 & i278;
                                            int i280 = i278 | i277;
                                            getHighSpeedVideoFpsRangesFor = ((i279 & i280) + (i280 | i279)) % 128;
                                        }
                                    }
                                    it2.next();
                                    throw null;
                                }
                                int i281 = getHighSpeedVideoSizes;
                                Camera2StreamConfigurationMap = (((i281 | 15) << 1) - (i281 ^ 15)) % 128;
                            }
                        }
                        m264762 = aVar.m26476(util.h.xy.e.rb.b.f1880);
                        if (m264762 != null) {
                            int i282 = getHighSpeedVideoFpsRangesFor;
                            int i283 = i282 ^ 111;
                            int i284 = i282 & 111;
                            int i285 = ((i283 ^ i284) | (i283 & i284)) << 1;
                            int i286 = -((i282 | 111) & (~i284));
                            int i287 = i285 & i286;
                            int i288 = i287 + ((i286 ^ i285) | i287);
                            getHighSpeedVideoFpsRanges = i288 % 128;
                            if (i288 % 2 != 0) {
                                m264762.isEmpty();
                                throw null;
                            }
                            if (!m264762.isEmpty()) {
                                int i289 = getHighSpeedVideoFpsRanges;
                                int i290 = (i289 & (-126)) | ((~i289) & 125);
                                int i291 = i289 & 125;
                                int i292 = ((i290 ^ i291) | (i290 & i291)) << 1;
                                int i293 = -(~(-(((i289 ^ 125) | i291) & (~i291))));
                                int i294 = (i292 & i293) + (i293 | i292);
                                getHighSpeedVideoFpsRangesFor = ((~i294) + (i294 << 1)) % 128;
                                int i295 = getHighSpeedVideoFpsRangesFor;
                                getHighSpeedVideoFpsRanges = ((((i295 & (-78)) ^ ((~i295) & 77)) - (~((i295 & 77) << 1))) - 1) % 128;
                                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : m264762.entrySet()) {
                                    int i296 = getHighSpeedVideoFpsRangesFor;
                                    getHighSpeedVideoFpsRanges = ((((i296 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) ^ ((~i296) & 109)) - (~((i296 & 109) << 1))) - 1) % 128;
                                    if (entry != null) {
                                        int i297 = getHighSpeedVideoSizes;
                                        Camera2StreamConfigurationMap = ((i297 ^ 27) + ((i297 & 27) << 1)) % 128;
                                        int i298 = getHighSpeedVideoFpsRanges;
                                        int i299 = i298 & 1;
                                        int i300 = (~i299) & (i298 | 1);
                                        int i301 = ((((i299 ^ i300) | (i299 & i300)) << 1) - (~(-(~(-((i298 & (-2)) | ((~i298) & 1))))))) - 1;
                                        int i302 = -(-(i301 * (-475)));
                                        int i303 = ((i302 | (-477)) << 1) - (i302 ^ (-477));
                                        int i304 = ~i301;
                                        int i305 = ~((i ^ (-1)) | i);
                                        int i306 = -(-(((i305 ^ i304) | (i304 & i305)) * (-476)));
                                        int i307 = ((i303 | i306) << 1) - (i306 ^ i303);
                                        int i308 = (~i304) | i304;
                                        int i309 = (~((i308 ^ i) | (i308 & i))) * 952;
                                        int i310 = i304 | i20;
                                        getHighSpeedVideoFpsRangesFor = ((((i307 & i309) + (i309 | i307)) - (~(-(-((~(i310 | (~i310))) * 476))))) - 1) % 128;
                                        if (util.h.xy.e.mc.m26468(entry.getValue())) {
                                            int i311 = getHighSpeedVideoFpsRangesFor;
                                            int i312 = i311 ^ 45;
                                            int i313 = i311 & 45;
                                            int i314 = ((i312 ^ i313) | (i312 & i313)) << 1;
                                            int i315 = -((~i313) & (i312 | i313));
                                            int i316 = i314 ^ i315;
                                            int i317 = (i315 & i314) << 1;
                                            int i318 = i317 * (-1939);
                                            int i319 = -(-(i316 * 971));
                                            int i320 = (i318 ^ i319) + ((i318 & i319) << 1);
                                            int i321 = ~i316;
                                            int i322 = ~((i321 & i317) | (i321 ^ i317));
                                            int i323 = ~((i20 ^ i316) | (i20 & i316));
                                            int i324 = -(-(((i322 ^ i323) | (i322 & i323)) * (-970)));
                                            int i325 = (i320 ^ i324) + ((i324 & i320) << 1);
                                            int i326 = ~i317;
                                            int i327 = (~((i326 & i316) | (i326 ^ i316))) * 1940;
                                            int i328 = (i325 ^ i327) + ((i327 & i325) << 1);
                                            int i329 = ~((i326 ^ i321) | (i326 & i321));
                                            int i330 = ~(i316 | i20);
                                            int i331 = -(-(((i329 ^ i330) | (i329 & i330)) * 970));
                                            int i332 = ((i328 | i331) << 1) - (i331 ^ i328);
                                            getHighSpeedVideoFpsRanges = i332 % 128;
                                            if (i332 % 2 != 0) {
                                                throw new java.lang.ArithmeticException();
                                            }
                                            if (aVar2 == null) {
                                                util.h.xy.c.a<util.h.xy.c.mb> aVar4 = new util.h.xy.c.a<>();
                                                int i333 = getHighSpeedVideoFpsRangesFor;
                                                int i334 = i333 & 62;
                                                int i335 = -(-(i333 | 62));
                                                int i336 = (i334 & i335) + (i335 | i334);
                                                int i337 = (~i336) + (i336 << 1);
                                                getHighSpeedVideoFpsRanges = i337 % 128;
                                                if (i337 % 2 != 0) {
                                                    int i338 = getHighSpeedVideoSizes;
                                                    Camera2StreamConfigurationMap = (((i338 | 11) << 1) - (i338 ^ 11)) % 128;
                                                }
                                                aVar2 = aVar4;
                                            }
                                            aVar2.m25826(new util.h.xy.c.mb(entry.getKey(), entry.getValue()));
                                            if (z) {
                                                int i339 = getHighSpeedVideoFpsRanges;
                                                int i340 = ((i339 & 12) + (i339 | 12)) - 1;
                                                int i341 = i340 % 128;
                                                getHighSpeedVideoFpsRangesFor = i341;
                                                if (i340 % 2 == 0) {
                                                    throw null;
                                                }
                                                int i342 = i341 ^ 101;
                                                int i343 = i341 & 101;
                                                int i344 = ((i342 ^ i343) | (i342 & i343)) << 1;
                                                int i345 = -((i341 & (-102)) ^ ((~i341) & 101));
                                                int i346 = i344 & i345;
                                                int i347 = i345 | i344;
                                                int i348 = (i346 ^ i347) + ((i347 & i346) << 1);
                                                getHighSpeedVideoFpsRanges = i348 % 128;
                                                if (i348 % 2 == 0) {
                                                    return aVar2;
                                                }
                                                throw null;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    int i349 = getHighSpeedVideoFpsRangesFor;
                                    int i350 = i349 ^ 29;
                                    getHighSpeedVideoFpsRanges = (((((i349 & 29) | i350) << 1) - (~(-i350))) - 1) % 128;
                                }
                            }
                        }
                        int i351 = getHighSpeedVideoFpsRanges;
                        i3 = (i351 ^ 35) + ((i351 & 35) << 1);
                        getHighSpeedVideoFpsRangesFor = i3 % 128;
                        if (i3 % 2 != 0) {
                            throw null;
                        }
                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 91) % 128;
                        return aVar2;
                    }
                }
                aVar2 = null;
                m26476 = aVar.m26476(util.h.xy.e.rb.b.f1881);
                if (m26476 != null) {
                }
                m264762 = aVar.m26476(util.h.xy.e.rb.b.f1880);
                if (m264762 != null) {
                }
                int i3512 = getHighSpeedVideoFpsRanges;
                i3 = (i3512 ^ 35) + ((i3512 & 35) << 1);
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 != 0) {
                }
            }
        } else {
            int i352 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i352 ^ 3) + ((i352 & 3) << 1)) % 128;
            int i353 = getHighSpeedVideoFpsRangesFor;
            int i354 = (i353 & 84) + (i353 | 84);
            int i355 = -(-(i354 * (-112)));
            int i356 = ~i354;
            int i357 = i356 | i20;
            int i358 = ~i357;
            int i359 = (i356 & i20) | (i356 ^ i20);
            int i360 = ~(i359 | (~i359));
            int i361 = ((((i355 ^ 112) + ((i355 & 112) << 1)) - (~(((i358 ^ (-1)) | i358) * 226))) - 1) + (((i357 & i360) | (i357 ^ i360)) * (-113));
            int i362 = (~((i356 & i) | (i356 ^ i))) * 113;
            getHighSpeedVideoFpsRanges = ((i361 & i362) + (i362 | i361)) % 128;
        }
        int i363 = getHighSpeedVideoFpsRanges;
        int i364 = i363 ^ 91;
        int i365 = i363 & 91;
        int i366 = ((i364 ^ i365) | (i364 & i365)) << 1;
        int i367 = -((i364 | i365) & (~i365));
        int i368 = i366 & i367;
        getHighSpeedVideoFpsRangesFor = (i368 + ((i367 ^ i366) | i368)) % 128;
        if ((131072 & i) == 0) {
            int i369 = ((i363 & 3) + (i363 | 3)) - 1;
            int i370 = -(-(i369 * (-159)));
            int i371 = (((i370 & 159) + (i370 | 159)) - (~(-(-(i369 * 160))))) - 1;
            int i372 = ~((~i20) | i20);
            int i373 = ~((i369 ^ (-1)) | i369);
            int i374 = -(-(((i372 ^ i373) | (i372 & i373)) * (-160)));
            int i375 = ~((~i369) | i20);
            int i376 = (i371 ^ i374) + ((i374 & i371) << 1) + ((i375 | (i375 ^ (-1))) * 160);
            getHighSpeedVideoFpsRangesFor = i376 % 128;
            if (i376 % 2 == 0) {
                int i377 = getHighSpeedVideoSizes;
                Camera2StreamConfigurationMap = (((i377 | 117) << 1) - (i377 ^ 117)) % 128;
            }
            throw new util.h.xy.c.ma(117, null);
        }
        int i442 = getHighSpeedVideoFpsRangesFor;
        int i452 = (i442 & (-39)) | ((~i442) & 38);
        int i462 = -(-((i442 & 38) << 1));
        int i472 = ((i452 | i462) << 1) - (i462 ^ i452);
        int i482 = ~i472;
        int i492 = -(-(i472 << 1));
        i2 = ((i482 | i492) << 1) - (i482 ^ i492);
        int i502 = i2 % 128;
        getHighSpeedVideoFpsRanges = i502;
        if (i2 % 2 != 0) {
        }
        if (aVar != null) {
        }
    }

    static {
        int i = 82 % 2;
    }
}
