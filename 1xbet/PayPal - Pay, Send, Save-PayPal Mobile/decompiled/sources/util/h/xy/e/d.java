package util.h.xy.e;

/* loaded from: classes5.dex */
public final class d {
    private static int Camera2StreamConfigurationMap = 109;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0167, code lost:
    
        if (r6 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x067b, code lost:
    
        if ((r0 % 2) != 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0613 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0199  */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final util.h.xy.c.a<util.h.xy.c.mb> m26463(android.content.Context context, int i, util.h.xy.e.rb.a aVar) throws util.h.xy.c.ma {
        int i2;
        boolean z;
        util.h.xy.c.a<util.h.xy.c.mb> aVar2;
        int i3;
        int i4 = getHighSpeedVideoFpsRanges + 99;
        int i5 = i4 % 128;
        Camera2StreamConfigurationMap = i5;
        int i6 = i4 % 2;
        int i7 = getHighSpeedVideoSizes;
        int i8 = i7 & 85;
        int i9 = (i7 & (-86)) | ((~i7) & 85);
        int i10 = (i9 ^ i8) | (i9 & i8);
        int i11 = i8 & i10;
        int i12 = (i10 ^ i8) | i11;
        int i13 = (i12 * 628) + (i11 * 628);
        int i14 = i11 | i;
        int i15 = ~i12;
        int i16 = -(-(((i14 ^ i15) | (i14 & i15)) * (-627)));
        int i17 = (((i13 | i16) << 1) - (i13 ^ i16)) + (((~((~i11) | i)) | i12) * (-627));
        int i18 = ~i;
        int i19 = ~((i11 ^ i18) | (i11 & i18));
        int i20 = ~((i12 ^ i) | (i12 & i));
        int i21 = ((i20 ^ i19) | (i20 & i19)) * 627;
        int i22 = (i17 & i21) + (i21 | i17);
        getHighSpeedVideoFpsRangesFor = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
        getHighSpeedVideoFpsRanges = ((i5 ^ 11) + ((i5 & 11) << 1)) % 128;
        if (context == null) {
            throw new util.h.xy.c.ma(103, null);
        }
        util.h.xy.e.mc.m26470(i);
        if ((2031616 & i) == 0) {
            int i23 = getHighSpeedVideoSizes;
            int i24 = i23 ^ 100;
            int i25 = (i23 & 100) << 1;
            int i26 = i25 * (-665);
            int i27 = i24 * com.visa.cbp.getCertUsage.setODAData;
            int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
            int i29 = ~i25;
            int i30 = i29 * (-333);
            int i31 = (i28 ^ i30) + ((i30 & i28) << 1);
            int i32 = ~(i29 | i18);
            int i33 = ~((i24 ^ i) | (i24 & i));
            int i34 = ((i32 ^ i33) | (i32 & i33)) * com.visa.cbp.getCertUsage.getODAData;
            int i35 = ~((i29 ^ i) | (i29 & i));
            int i36 = ~(i24 | i18);
            int i37 = ((((i31 | i34) << 1) - (i34 ^ i31)) - (~(-(-(((i35 ^ i36) | (i35 & i36)) * com.visa.cbp.getCertUsage.getODAData))))) - 1;
            int i38 = ~i37;
            int i39 = (i38 | i37) << 1;
            int i40 = -i38;
            int i41 = (i40 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + (i39 * (-215));
            int i42 = -(-((~((i40 ^ i) | (i40 & i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
            int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
            int i44 = ~i39;
            int i45 = -(-(((i44 ^ i40) | (i44 & i40) | i18) * (-216)));
            int i46 = ~((i40 ^ i18) | (i40 & i18));
            int i47 = (((i43 | i45) << 1) - (i45 ^ i43)) + (((i46 ^ i39) | (i46 & i39)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
            getHighSpeedVideoFpsRangesFor = i47 % 128;
            if (i47 % 2 == 0) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 9) % 128;
            }
            int i48 = Camera2StreamConfigurationMap;
            i2 = (i48 ^ 101) + ((i48 & 101) << 1);
            int i49 = i2 % 128;
            getHighSpeedVideoFpsRanges = i49;
            if (i2 % 2 == 0) {
                int i50 = getHighSpeedVideoFpsRangesFor;
                int i51 = i50 & 116;
                int i52 = (i50 ^ 116) | i51;
                int i53 = i51 ^ i52;
                getHighSpeedVideoSizes = (((i52 & i51) | i53) << i53) >>> 22986;
            } else {
                int i54 = getHighSpeedVideoFpsRangesFor;
                int i55 = i54 & 79;
                int i56 = (i54 ^ 79) | i55;
                getHighSpeedVideoSizes = (((((i55 ^ i56) | (i55 & i56)) << 1) - (~(-(((~i56) & i55) | ((~i55) & i56))))) - 1) % 128;
            }
            if (aVar != null) {
                throw new util.h.xy.c.ma(126, null);
            }
            int i57 = i49 + 71;
            int i58 = i57 % 128;
            Camera2StreamConfigurationMap = i58;
            if (i57 % 2 != 0 ? (i & 256) == 0 : (i & 18119) == 0) {
                int i59 = ((i58 & 27) + (i58 | 27)) % 128;
                getHighSpeedVideoFpsRanges = i59;
                Camera2StreamConfigurationMap = ((i59 & 33) + (i59 | 33)) % 128;
                int i60 = getHighSpeedVideoSizes;
                int i61 = i60 & 119;
                int i62 = (i60 ^ 119) | i61;
                int i63 = i62 << 1;
                int i64 = -(i62 & (~i61));
                int i65 = i63 & i64;
                int i66 = i64 | i63;
                int i67 = (i66 * (-755)) + (i65 * (-755));
                int i68 = ~i66;
                int i69 = ~i65;
                int i70 = ~((i68 ^ i69) | (i68 & i69));
                int i71 = -(-(i70 * 1512));
                int i72 = ~((i66 ^ i65) | (i66 & i65) | i);
                int i73 = (i67 & i71) + (i67 | i71) + (((i70 & i72) | (i70 ^ i72)) * (-756));
                int i74 = i66 | i65;
                int i75 = ((i74 ^ i18) | (i74 & i18)) * 756;
                getHighSpeedVideoFpsRangesFor = ((i73 & i75) + (i75 | i73)) % 128;
                z = false;
            } else {
                int i76 = getHighSpeedVideoSizes;
                int i77 = (i76 * 471) + 3068;
                int i78 = -(-(((~((i18 ^ (-14)) | (i18 & (-14)))) | i76) * (-235)));
                int i79 = ~i76;
                int i80 = ~((i79 & 13) | (i79 ^ 13));
                int i81 = i76 | (-14);
                int i82 = ~((i81 ^ i) | (i81 & i));
                int i83 = (((i77 | i78) << 1) - (i77 ^ i78)) + (((~((i & (-14)) | (i ^ (-14)))) | i76) * (-470)) + (((i82 & i80) | (i80 ^ i82)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
                int i84 = ~i83;
                int i85 = ~((i84 & i18) | (i84 ^ i18));
                int i86 = (((-372) - (~(-(-(i83 * 371))))) - (~(-(-(((i85 ^ i18) | (i85 & i18)) * (-370)))))) - 1;
                int i87 = ~i18;
                int i88 = ~(i84 | i);
                int i89 = ((i88 ^ i87) | (i87 & i88)) * (-370);
                int i90 = (i86 ^ i89) + ((i86 & i89) << 1) + ((~((i83 ^ (-1)) | i83)) * com.knotapi.knot.utilities.Constants.ID_KROGER);
                int i91 = ~i90;
                int i92 = i91 | i90;
                int i93 = ((i92 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION) - (~(i90 * (-903)))) - 1;
                int i94 = ~i92;
                int i95 = ~((i94 ^ i) | (i94 & i));
                int i96 = ~(i18 | i90);
                int i97 = ((i95 ^ i96) | (i95 & i96)) * (-1808);
                int i98 = (i91 & i94) | (i94 ^ i91);
                int i99 = ~((i94 ^ i90) | (i94 & i90));
                int i100 = ~((i91 & i) | (i91 ^ i));
                int i101 = (i99 & i100) | (i100 ^ i99);
                int i102 = ~(i92 | i18);
                getHighSpeedVideoFpsRangesFor = ((((((i93 | i97) << 1) - (i93 ^ i97)) - (~(((~(((i92 & i18) | (i18 ^ i92)) | i90)) | (~((i98 & i) | (i98 ^ i)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) - 1) + (((i101 ^ i102) | (i101 & i102)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)) % 128;
                int i103 = i76 & 85;
                int i104 = (i76 & (-86)) | (i79 & 85);
                int i105 = (i104 ^ i103) | (i104 & i103);
                int i106 = i105 * (-830);
                int i107 = i103 * 832;
                int i108 = ~i103;
                int i109 = (i105 ^ i103) | (i105 & i103);
                int i110 = (((i106 ^ i107) + ((i106 & i107) << 1)) - (~(-(-(((~((i108 & i18) | (i108 ^ i18))) | (~((i109 & i) | (i109 ^ i)))) * (-831)))))) - 1;
                int i111 = (i108 & i105) | (i108 ^ i105);
                int i112 = -(-((~((i111 ^ i) | (i111 & i))) * (-1662)));
                int i113 = ~i105;
                int i114 = ~((i113 ^ i18) | (i113 & i18));
                int i115 = ~(i105 | i);
                int i116 = (i115 ^ i114) | (i115 & i114);
                int i117 = ~((i103 ^ i) | (i103 & i));
                int i118 = (i110 ^ i112) + ((i112 & i110) << 1) + (((i116 ^ i117) | (i117 & i116)) * 831);
                getHighSpeedVideoFpsRangesFor = i118 % 128;
                if (i118 % 2 != 0) {
                    Camera2StreamConfigurationMap = (i49 + 1) % 128;
                }
                z = true;
            }
            java.util.Map<java.lang.String, java.lang.String> m26476 = aVar.m26476(util.h.xy.e.rb.b.f1879);
            if (m26476 != null) {
                int i119 = getHighSpeedVideoFpsRanges;
                int i120 = (i119 ^ 95) + ((i119 & 95) << 1);
                Camera2StreamConfigurationMap = i120 % 128;
                int i121 = i120 % 2;
                int i122 = getHighSpeedVideoFpsRangesFor;
                int i123 = ((i122 | 65) << 1) - (i122 ^ 65);
                int i124 = i123 * 1435;
                int i125 = (i124 ^ 716) + ((i124 & 716) << 1);
                int i126 = i123 * (-1434);
                int i127 = (i125 & i126) + (i126 | i125);
                int i128 = ~((i18 ^ i123) | (i18 & i123));
                int i129 = ~i123;
                int i130 = ~(i129 | i);
                int i131 = -(-(((i128 ^ i130) | (i128 & i130)) * 717));
                int i132 = (~((i129 & i18) | (i129 ^ i18))) | (~((i123 ^ (-1)) | i123));
                int i133 = ~((i123 ^ i) | (i123 & i));
                int i134 = (((i127 & i131) + (i131 | i127)) - (~(-(-(((i132 & i133) | (i133 ^ i132)) * 717))))) - 1;
                int i135 = ~i134;
                int i136 = (i135 | i134) << 1;
                int i137 = -i135;
                int i138 = ((i137 * 567) - (~(i136 * (-565)))) - 1;
                int i139 = ~i137;
                int i140 = ~((i139 & i136) | (i139 ^ i136));
                int i141 = ~(i139 | i);
                int i142 = ((i140 & i141) | (i140 ^ i141)) * (-566);
                int i143 = ~i136;
                int i144 = (i138 ^ i142) + ((i138 & i142) << 1) + ((~(i137 | i143)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST);
                int i145 = (i139 ^ i143) | (i143 & i139);
                int i146 = -(-((~((i145 ^ i) | (i145 & i))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST));
                getHighSpeedVideoSizes = ((i144 ^ i146) + ((i146 & i144) << 1)) % 128;
                if (!m26476.isEmpty()) {
                    int i147 = getHighSpeedVideoFpsRanges;
                    int i148 = (i147 & 31) + (i147 | 31);
                    Camera2StreamConfigurationMap = i148 % 128;
                    if (i148 % 2 != 0) {
                        int i149 = getHighSpeedVideoSizes;
                        int i150 = (i149 & (-10)) ^ ((~i149) & 9);
                        int i151 = -(-((i149 & 9) << 1));
                        int i152 = ((((i150 ^ i151) | (i150 & i151)) << 1) - (~(-(((~i151) & i150) | ((~i150) & i151))))) - 1;
                        getHighSpeedVideoFpsRangesFor = i152 % 128;
                        if (i152 % 2 == 0) {
                            m26476.entrySet().iterator();
                            throw null;
                        }
                        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = m26476.entrySet().iterator();
                        aVar2 = null;
                        while (it.hasNext()) {
                            int i153 = Camera2StreamConfigurationMap;
                            getHighSpeedVideoFpsRanges = ((i153 & 57) + (i153 | 57)) % 128;
                            int i154 = getHighSpeedVideoSizes;
                            int i155 = i154 & 109;
                            int i156 = ((i154 ^ 109) | i155) & (~i155);
                            int i157 = i155 << 1;
                            int i158 = i156 & i157;
                            int i159 = (i156 ^ i157) | i158;
                            int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
                            getHighSpeedVideoFpsRangesFor = i160 % 128;
                            if (i160 % 2 == 0) {
                                int i161 = (i153 ^ 75) + ((i153 & 75) << 1);
                                getHighSpeedVideoFpsRanges = i161 % 128;
                                if (i161 % 2 == 0) {
                                    it.next();
                                    throw null;
                                }
                            } else {
                                int i162 = ((i153 & 71) + (i153 | 71)) % 128;
                                getHighSpeedVideoFpsRanges = i162;
                                Camera2StreamConfigurationMap = (((i162 | 13) << 1) - (i162 ^ 13)) % 128;
                            }
                            java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
                            if (next != null) {
                                int i163 = Camera2StreamConfigurationMap;
                                getHighSpeedVideoFpsRanges = (((i163 | 107) << 1) - (i163 ^ 107)) % 128;
                                if (util.h.xy.e.mc.m26471(context, next.getValue())) {
                                    int i164 = getHighSpeedVideoFpsRanges;
                                    Camera2StreamConfigurationMap = (((i164 | 71) << 1) - (i164 ^ 71)) % 128;
                                    int i165 = getHighSpeedVideoFpsRangesFor;
                                    int i166 = i165 & 35;
                                    int i167 = i165 ^ 35;
                                    int i168 = -(-((i167 ^ i166) | (i167 & i166)));
                                    int i169 = i166 & i168;
                                    int i170 = -(-(i168 | i166));
                                    getHighSpeedVideoSizes = (((i169 | i170) << 1) - (i170 ^ i169)) % 128;
                                    if (aVar2 == null) {
                                        aVar2 = new util.h.xy.c.a<>();
                                        int i171 = getHighSpeedVideoSizes;
                                        int i172 = i171 & 91;
                                        int i173 = -(-(i171 | 91));
                                        getHighSpeedVideoFpsRangesFor = ((((i172 ^ i173) | (i172 & i173)) << 1) - (((~i173) & i172) | ((~i172) & i173))) % 128;
                                    }
                                    aVar2.m25826(new util.h.xy.c.mb(next.getKey(), next.getValue()));
                                    if (z) {
                                        int i174 = getHighSpeedVideoSizes;
                                        int i175 = i174 ^ 45;
                                        int i176 = (i174 & 45) << 1;
                                        int i177 = i175 & i176;
                                        int i178 = -(-((i176 ^ i175) | i177));
                                        int i179 = ((i177 | i178) << 1) - (i178 ^ i177);
                                        int i180 = i179 % 128;
                                        getHighSpeedVideoFpsRangesFor = i180;
                                        if (i179 % 2 == 0) {
                                            throw null;
                                        }
                                        int i181 = i180 & 89;
                                        int i182 = (i180 | 89) & (~i181);
                                        int i183 = -(-((i182 ^ i181) | (i182 & i181)));
                                        int i184 = i181 & i183;
                                        int i185 = -(-((i183 ^ i181) | i184));
                                        getHighSpeedVideoSizes = (((i184 | i185) << 1) - (i185 ^ i184)) % 128;
                                        return aVar2;
                                    }
                                } else {
                                    int i186 = Camera2StreamConfigurationMap;
                                    getHighSpeedVideoFpsRanges = ((i186 & 111) + (i186 | 111)) % 128;
                                }
                            }
                            int i187 = getHighSpeedVideoFpsRangesFor;
                            int i188 = i187 & 29;
                            int i189 = ((i187 ^ 29) | i188) & (~i188);
                            int i190 = -(-(i188 << 1));
                            int i191 = i189 & i190;
                            int i192 = i189 | i190;
                            int i193 = i192 * (-721);
                            int i194 = -(-(i191 * (-721)));
                            int i195 = (i193 ^ i194) + ((i193 & i194) << 1);
                            int i196 = ~i192;
                            int i197 = ~i191;
                            int i198 = ~((i196 ^ i197) | (i197 & i196));
                            int i199 = (i198 & i18) | (i18 ^ i198);
                            int i200 = ~((i192 ^ i191) | (i192 & i191));
                            int i201 = -(-(((i199 & i200) | (i199 ^ i200)) * 1444));
                            int i202 = ~(i192 | i191);
                            int i203 = ~(i192 | i);
                            int i204 = (i202 ^ i203) | (i202 & i203);
                            int i205 = ~(i191 | i);
                            int i206 = (((i195 & i201) + (i195 | i201)) - (~(((i204 ^ i205) | (i204 & i205)) * (-1444)))) - 1;
                            int i207 = ((~((i192 ^ i197) | (i192 & i197))) | (~(i196 | i191))) * 722;
                            getHighSpeedVideoSizes = (((i206 | i207) << 1) - (i207 ^ i206)) % 128;
                        }
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 79) % 128;
                        int i208 = getHighSpeedVideoSizes;
                        int i209 = i208 & 48;
                        int i210 = (i208 | 48) & (~i209);
                        int i211 = i209 << 1;
                        int i212 = -(~((i210 & i211) + (i210 | i211)));
                        int i213 = ~((i212 ^ 1) | (i212 & 1));
                        int i214 = ~((i212 ^ i) | (i212 & i));
                        int i215 = -(-(((i213 ^ i214) | (i213 & i214)) * (-814)));
                        int i216 = ~((i18 ^ 1) | (i18 & 1));
                        int i217 = ~i212;
                        int i218 = ~((i217 ^ (-2)) | (i217 & (-2)));
                        int i219 = -(-(((i216 ^ i218) | (i216 & i218) | (~(i212 | i))) * 407));
                        int i220 = ~(i217 | (-2));
                        int i221 = ~((i217 ^ i) | (i217 & i));
                        int i222 = (i221 ^ i220) | (i221 & i220);
                        int i223 = ~((i ^ (-2)) | (i & (-2)));
                        i3 = (((((((i212 * (-813)) - 816) - (~i215)) - 1) - (~i219)) - 1) - (~(-(-(((i223 ^ i222) | (i222 & i223)) * 407))))) - 1;
                        getHighSpeedVideoFpsRangesFor = i3 % 128;
                        if (i3 % 2 == 0) {
                            return aVar2;
                        }
                        throw null;
                    }
                }
            }
            aVar2 = null;
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 79) % 128;
            int i2082 = getHighSpeedVideoSizes;
            int i2092 = i2082 & 48;
            int i2102 = (i2082 | 48) & (~i2092);
            int i2112 = i2092 << 1;
            int i2122 = -(~((i2102 & i2112) + (i2102 | i2112)));
            int i2132 = ~((i2122 ^ 1) | (i2122 & 1));
            int i2142 = ~((i2122 ^ i) | (i2122 & i));
            int i2152 = -(-(((i2132 ^ i2142) | (i2132 & i2142)) * (-814)));
            int i2162 = ~((i18 ^ 1) | (i18 & 1));
            int i2172 = ~i2122;
            int i2182 = ~((i2172 ^ (-2)) | (i2172 & (-2)));
            int i2192 = -(-(((i2162 ^ i2182) | (i2162 & i2182) | (~(i2122 | i))) * 407));
            int i2202 = ~(i2172 | (-2));
            int i2212 = ~((i2172 ^ i) | (i2172 & i));
            int i2222 = (i2212 ^ i2202) | (i2212 & i2202);
            int i2232 = ~((i ^ (-2)) | (i & (-2)));
            i3 = (((((((i2122 * (-813)) - 816) - (~i2152)) - 1) - (~i2192)) - 1) - (~(-(-(((i2232 ^ i2222) | (i2222 & i2232)) * 407))))) - 1;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
            }
        } else {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 121) % 128;
            int i224 = getHighSpeedVideoSizes;
            int i225 = i224 & 25;
            int i226 = i224 ^ 25;
            int i227 = -(-((i226 ^ i225) | (i226 & i225)));
            int i228 = i225 & i227;
            int i229 = i228 + ((i227 ^ i225) | i228);
            getHighSpeedVideoFpsRangesFor = i229 % 128;
            int i230 = i229 % 2;
        }
        int i231 = getHighSpeedVideoFpsRangesFor;
        int i232 = i231 ^ 105;
        int i233 = i231 & 105;
        int i234 = ((i232 ^ i233) | (i232 & i233)) << 1;
        int i235 = -((~i233) & (i232 | i233));
        int i236 = i234 & i235;
        int i237 = i235 | i234;
        int i238 = i237 * (-109);
        int i239 = -(-(i236 * 111));
        int i240 = ~i237;
        int i241 = ~(i236 | i);
        int i242 = (((i238 | i239) << 1) - (i238 ^ i239)) + (((i240 & i241) | (i240 ^ i241)) * (-220));
        int i243 = ~(i237 | i236);
        int i244 = ~((i236 ^ i) | (i236 & i));
        int i245 = -(-(((i243 ^ i244) | (i243 & i244)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
        int i246 = (i242 ^ i245) + ((i245 & i242) << 1) + (((~(i237 | (~i236))) | (~(i236 | i240))) * 110);
        int i247 = i246 % 128;
        getHighSpeedVideoSizes = i247;
        int i248 = 524288 & i;
        if (i246 % 2 == 0) {
            if (i248 != 0) {
                int i249 = getHighSpeedVideoFpsRanges;
                Camera2StreamConfigurationMap = ((i249 & 27) + (i249 | 27)) % 128;
                int i482 = Camera2StreamConfigurationMap;
                i2 = (i482 ^ 101) + ((i482 & 101) << 1);
                int i492 = i2 % 128;
                getHighSpeedVideoFpsRanges = i492;
                if (i2 % 2 == 0) {
                }
                if (aVar != null) {
                }
            }
            int i250 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = (i250 + 105) % 128;
            int i251 = (i247 | 69) << 1;
            int i252 = i247 & 69;
            int i253 = -(((i247 ^ 69) | i252) & (~i252));
            int i254 = ((i251 ^ i253) | (i251 & i253)) << 1;
            int i255 = -((i251 & (~i253)) | ((~i251) & i253));
            int i256 = i255 * (-661);
            int i257 = -(-(i254 * (-661)));
            int i258 = ~i255;
            int i259 = ~i254;
            int i260 = ~(i258 | i259);
            int i261 = ~(i255 | i);
            int i262 = ~(i | i254);
            int i263 = (i256 & i257) + (i256 | i257) + (((i18 ^ i260) | (i18 & i260)) * 1324) + (((i262 & i261) | (i261 ^ i262)) * (-1324)) + (((~(i255 | i259)) | (~((i258 ^ i254) | (i254 & i258)))) * 662);
            getHighSpeedVideoFpsRangesFor = i263 % 128;
            if (i263 % 2 != 0) {
                int i264 = i250 + 13;
                getHighSpeedVideoFpsRanges = i264 % 128;
            }
            int i265 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = (((i265 | 79) << 1) - (i265 ^ 79)) % 128;
            throw new util.h.xy.c.ma(117, null);
        }
    }

    static {
        int i = 109 % 2;
    }
}
