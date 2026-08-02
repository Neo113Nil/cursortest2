package com.payair.hce;

/* loaded from: classes10.dex */
public class AddCardFromLocalStorage {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final java.lang.String AlternateContactlessPaymentDataJson;
    private static short[] IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static byte[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getProfileVersion;
    private static int valueOf;
    private static int values;
    private static final java.lang.String writeReplace;
    private android.app.Activity DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i3;
        int i6 = ~i2;
        int i7 = ~(i5 | i);
        int i8 = (i * 595) + (i2 * (-1187)) + (((~(i2 | i5)) | i4) * (-1188)) + (((~(i3 | i6)) | i4 | i7) * 594) + (((~(i | i6)) | (~(i6 | i5)) | i7) * 594);
        if (i8 == 1) {
            return valueOf(objArr);
        }
        if (i8 != 2) {
            return i8 != 3 ? i8 != 4 ? DigitizedCardProfile(objArr) : values(objArr) : writeReplace(objArr);
        }
        java.lang.String str = (java.lang.String) objArr[0];
        int i9 = RecordsJson;
        int i10 = ((i9 | 104) << 1) - (i9 ^ 104);
        getProfileVersion = ((~i10) + (i10 << 1)) % 128;
        int intValue = ((java.lang.Integer) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1848767035, 1848767068, (int) java.lang.System.currentTimeMillis())).intValue();
        com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(intValue)}, -57265609, 57265639, intValue);
        ((com.payair.hce.DemoRemoteCommunicationManager) ((com.payair.hce.setTheme) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1016779127, 1016779151, (int) java.lang.System.currentTimeMillis())).valueOf()).provisionFromLocalStorage(str, (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{str}, -718043680, 718043684, (int) java.lang.System.currentTimeMillis()));
        int i11 = getProfileVersion;
        int i12 = i11 & 23;
        RecordsJson = (((((i11 ^ 23) | i12) << 1) - (~(-((i11 | 23) & (~i12))))) - 1) % 128;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i2 * 2) + 1;
        int i6 = 104 - (b * 4);
        int i7 = 3 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i7;
            int i9 = i5;
            i4 = 0;
            int i10 = i7 + (-i9);
            i3 = i4;
            int i11 = i8;
            i6 = i10;
            i7 = i11;
            int i12 = i7 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i9 = bArr[i12];
            int i13 = i6;
            i8 = i12;
            i7 = i13;
            int i102 = i7 + (-i9);
            i3 = i4;
            int i112 = i8;
            i6 = i102;
            i7 = i112;
            int i122 = i7 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            int i1222 = i7 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    static {
        init$0();
        RecordsJson = 0;
        getProfileVersion = 1;
        AlternateContactlessPaymentDataJson();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(android.os.Environment.getExternalStorageDirectory().getAbsolutePath());
        sb.append(java.io.File.separator);
        sb.append("mpsdk-input-data");
        sb.append(java.io.File.separator);
        writeReplace = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("mobile_keys");
        sb2.append(java.io.File.separator);
        AlternateContactlessPaymentDataJson = sb2.toString();
        int i = RecordsJson;
        int i2 = i & 87;
        int i3 = (i ^ 87) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        getProfileVersion = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.AddCardFromLocalStorage addCardFromLocalStorage = (com.payair.hce.AddCardFromLocalStorage) objArr[0];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(writeReplace);
        sb.append(AlternateContactlessPaymentDataJson);
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(new java.io.File(sb.toString(), "keys.json")));
            try {
                com.payair.hce.setAnimationMatrix.AlternateContactlessPaymentDataJson((java.util.HashMap<java.lang.String, java.lang.String>) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace((java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{bufferedReader}, -1117752980, 1117752980, (int) java.lang.System.currentTimeMillis()), java.util.HashMap.class));
                bufferedReader.close();
                int i = getProfileVersion;
                int i2 = (i & (-48)) | ((~i) & 47);
                int i3 = -(-((i & 47) << 1));
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                RecordsJson = i4 % 128;
                if (i4 % 2 == 0) {
                    return null;
                }
                throw null;
            } finally {
            }
        } catch (java.io.FileNotFoundException unused) {
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{addCardFromLocalStorage, "Required file(s) not found in Local storage."}, -1803749864, 1803749867, java.lang.System.identityHashCode(addCardFromLocalStorage));
            return null;
        } catch (java.lang.Exception unused2) {
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{addCardFromLocalStorage, "Internal error"}, -1803749864, 1803749867, java.lang.System.identityHashCode(addCardFromLocalStorage));
            return null;
        }
    }

    public void addCardAndSuk(java.util.ArrayList<java.lang.String> arrayList, int i) {
        int i2 = getProfileVersion;
        int i3 = i2 & 97;
        int i4 = (i2 ^ 97) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        RecordsJson = i5 % 128;
        if (i5 % 2 == 0) {
            java.lang.String str = arrayList.get(i);
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1184206473, -1184206472, java.lang.System.identityHashCode(this));
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1125842521, 1125842534, (int) java.lang.System.currentTimeMillis());
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{str}, -1172632154, 1172632156, (int) java.lang.System.currentTimeMillis());
            int i6 = getProfileVersion;
            int i7 = i6 & 13;
            int i8 = (i7 - (~(-(-((i6 ^ 13) | i7))))) - 1;
            RecordsJson = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            return;
        }
        java.lang.String str2 = arrayList.get(i);
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1184206473, -1184206472, java.lang.System.identityHashCode(this));
        com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1125842521, 1125842534, (int) java.lang.System.currentTimeMillis());
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{str2}, -1172632154, 1172632156, (int) java.lang.System.currentTimeMillis());
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.AddCardFromLocalStorage addCardFromLocalStorage = (com.payair.hce.AddCardFromLocalStorage) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        android.app.Activity activity = addCardFromLocalStorage.DigitizedCardProfile;
        int i = RecordsJson;
        int i2 = i ^ 41;
        getProfileVersion = ((((i & 41) | i2) << 1) - i2) % 128;
        int i3 = i & 115;
        int i4 = -(-((i ^ 115) | i3));
        getProfileVersion = ((i3 & i4) + (i4 | i3)) % 128;
        try {
            java.lang.Object[] objArr2 = {activity, str, 1};
            int gidForName = android.os.Process.getGidForName("");
            int identityHashCode = java.lang.System.identityHashCode(addCardFromLocalStorage);
            int i5 = gidForName * (-103);
            int i6 = ((i5 ^ 3606) + ((i5 & 3606) << 1)) - 1;
            int i7 = ~gidForName;
            int i8 = (i7 & (-35)) | ((~i7) & 34);
            int i9 = i7 & 34;
            int i10 = (i8 ^ i9) | (i8 & i9);
            int i11 = ~i10;
            int i12 = (i10 | i11) & i11;
            int i13 = identityHashCode & 34;
            int i14 = (~i13) & (identityHashCode | 34);
            int i15 = ~identityHashCode;
            int i16 = ~((i13 & i14) | (i14 ^ i13));
            int i17 = i12 & i16;
            int i18 = (i12 | i16) & (~i17);
            int i19 = ((i18 ^ i17) | (i18 & i17)) * 104;
            int i20 = (i6 & i19) + (i6 | i19);
            int i21 = (i7 & i15) | ((~i15) & gidForName);
            int i22 = i15 & gidForName;
            int i23 = (i21 ^ i22) | (i21 & i22);
            int i24 = i23 & (-35);
            int i25 = (i23 | (-35)) & (~i24);
            int i26 = -(-((~((i25 ^ i24) | (i25 & i24))) * (-104)));
            int i27 = i20 & i26;
            int i28 = (((i26 | i20) & (~i27)) - (~(i27 << 1))) - 1;
            int i29 = gidForName ^ identityHashCode;
            int i30 = gidForName & identityHashCode;
            int i31 = -(~(((i30 ^ i29) | (i30 & i29)) * 104));
            short keyRepeatTimeout = (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i32 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int identityHashCode2 = java.lang.System.identityHashCode(addCardFromLocalStorage);
            int i33 = i32 * 141;
            int i34 = (-723554879) & i33;
            int i35 = (((i33 | (-723554879)) & (~i34)) - (~(i34 << 1))) - 1;
            int i36 = -(-(((identityHashCode2 ^ (-1783127783)) | (identityHashCode2 & (-1783127783))) * 140));
            int i37 = i35 & i36;
            int i38 = i35 | i36;
            int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
            int i40 = ~i32;
            int i41 = (i40 & 1783127782) | ((~i40) & (-1783127783));
            int i42 = i40 & (-1783127783);
            int i43 = (i41 ^ i42) | (i41 & i42);
            int i44 = ~identityHashCode2;
            int i45 = i44 & (-1783127783);
            int i46 = ((~i45) & (i44 | (-1783127783))) | i45;
            int i47 = ~i46;
            int i48 = (i46 | i47) & i47;
            int i49 = ~i43;
            int i50 = -(-((i48 | ((i43 | i49) & i49)) * (-280)));
            int i51 = (i39 ^ i50) + ((i50 & i39) << 1);
            int i52 = ~((i32 ^ 1783127782) | (i32 & 1783127782));
            int i53 = ~((i44 & i32) | (i44 ^ i32));
            int i54 = i52 & i53;
            int i55 = (i52 | i53) & (~i54);
            int i56 = (i55 ^ i54) | (i55 & i54);
            int i57 = (i32 | i40) & i40;
            int i58 = (i57 ^ (-1783127783)) | (i57 & (-1783127783));
            int i59 = i58 & identityHashCode2;
            int i60 = (i58 | identityHashCode2) & (~i59);
            int i61 = (i60 ^ i59) | (i60 & i59);
            int i62 = ~i61;
            int i63 = (i61 | i62) & i62;
            int i64 = ((~i63) & i56) | ((~i56) & i63);
            int i65 = i56 & i63;
            int i66 = ((i65 ^ i64) | (i65 & i64)) * 140;
            int i67 = i51 & i66;
            int threadPriority = android.os.Process.getThreadPriority(0);
            int i68 = -((((threadPriority ^ 21) + ((threadPriority & 21) << 1)) - 1) >> 6);
            int i69 = i68 | 1293544283;
            int i70 = i69 << 1;
            int i71 = -((~(i68 & 1293544283)) & i69);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b(((i28 & i31) + (i31 | i28)) - 1, keyRepeatTimeout, ((i66 ^ i51) | i67) + i67, (i70 & i71) + (i71 | i70), (byte) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
            int i72 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int identityHashCode3 = java.lang.System.identityHashCode(addCardFromLocalStorage);
            int i73 = (i72 * 868) - 30379;
            int i74 = (~i73) + (i73 << 1);
            int i75 = ~i72;
            int i76 = ~identityHashCode3;
            int i77 = i75 ^ i76;
            int i78 = i75 & i76;
            int i79 = (i77 ^ i78) | (i77 & i78);
            int i80 = ~i79;
            int i81 = (i79 | i80) & i80;
            int i82 = (i76 | identityHashCode3) & i76;
            int i83 = i82 & 34;
            int i84 = (~i83) & (i82 | 34);
            int i85 = ~((i84 ^ i83) | (i83 & i84));
            int i86 = ((~i81) & i85) | ((~i85) & i81);
            int i87 = i81 & i85;
            int i88 = ((i87 ^ i86) | (i87 & i86)) * (-867);
            int i89 = i74 & i88;
            int i90 = -(-((i74 ^ i88) | i89));
            int i91 = (i89 ^ i90) + ((i90 & i89) << 1);
            int i92 = i75 & 34;
            int i93 = (~i92) & (i75 | 34);
            int i94 = ~((i92 ^ i93) | (i92 & i93));
            int i95 = i75 & identityHashCode3;
            int i96 = i95 | ((~i95) & (i75 | identityHashCode3));
            int i97 = ~i96;
            int i98 = (i96 | i97) & i97;
            int i99 = ((~i98) & i94) | ((~i94) & i98);
            int i100 = i94 & i98;
            int i101 = (i100 ^ i99) | (i100 & i99);
            int i102 = (i76 & 34) | (identityHashCode3 & (-35));
            int i103 = identityHashCode3 & 34;
            int i104 = ~((i102 ^ i103) | (i102 & i103));
            int i105 = i101 & i104;
            int i106 = (i101 | i104) & (~i105);
            int i107 = -(-(((i106 ^ i105) | (i106 & i105)) * (-1734)));
            int i108 = (i107 ^ i91) | (i91 & i107);
            int i109 = (i75 | i72) & i75;
            int i110 = (i109 ^ 34) | (i109 & 34);
            int i111 = (i110 ^ i82) | (i110 & i82);
            int i112 = ~i111;
            int i113 = (i111 | i112) & i112;
            int i114 = i75 & (-35);
            int i115 = (i75 | (-35)) & (~i114);
            int i116 = (i115 ^ i114) | (i115 & i114);
            int i117 = (i116 & i76) | ((~i116) & identityHashCode3);
            int i118 = i116 & identityHashCode3;
            int i119 = ~((i118 ^ i117) | (i118 & i117));
            int i120 = ((~i119) & i113) | ((~i113) & i119);
            int i121 = i119 & i113;
            int i122 = (i121 ^ i120) | (i121 & i120);
            int i123 = i72 ^ 34;
            int i124 = i72 & 34;
            int i125 = (i124 ^ i123) | (i123 & i124);
            int i126 = (i76 & i125) | ((~i125) & identityHashCode3);
            int i127 = i125 & identityHashCode3;
            int i128 = ~((i127 ^ i126) | (i127 & i126));
            int i129 = ((~i128) & i122) | ((~i122) & i128);
            int i130 = i128 & i122;
            short keyRepeatTimeout2 = (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i131 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int identityHashCode4 = java.lang.System.identityHashCode(addCardFromLocalStorage);
            int i132 = i131 * 860;
            int i133 = (((915262420 ^ i132) | (915262420 & i132)) << 1) - ((i132 & (-915262421)) | ((~i132) & 915262420));
            int i134 = ((i131 ^ identityHashCode4) | (i131 & identityHashCode4)) * (-859);
            int i135 = i133 & i134;
            int i136 = -(-(i134 | i133));
            int i137 = ~identityHashCode4;
            int i138 = i137 ^ i131;
            int i139 = i137 & i131;
            int i140 = ~((i139 & i138) | (i138 ^ i139));
            int i141 = ~i131;
            int i142 = i141 & (i141 | i131);
            int i143 = (i142 & 1783127761) | (i142 ^ 1783127761);
            int i144 = ~((i143 & identityHashCode4) | (i143 ^ identityHashCode4));
            int i145 = ((~i140) & i144) | ((~i144) & i140);
            int i146 = i144 & i140;
            int i147 = (((i135 & i136) + (i136 | i135)) - (~(((i146 ^ i145) | (i146 & i145)) * 859))) - 1;
            int i148 = i137 & 1783127761;
            int i149 = (i137 | 1783127761) & (~i148);
            int i150 = (i148 ^ i149) | (i149 & i148);
            int i151 = i131 & 1783127761;
            int i152 = ~(i151 | ((i131 | 1783127761) & (~i151)));
            int i153 = ~i150;
            int i154 = (((i150 | i153) & i153) | i152) * 859;
            int i155 = i147 & i154;
            int i156 = -(-((i154 ^ i147) | i155));
            int myTid = android.os.Process.myTid() >> 22;
            int identityHashCode5 = java.lang.System.identityHashCode(addCardFromLocalStorage);
            int i157 = myTid * (-300);
            int i158 = (((191646845 & i157) | ((~i157) & (-191646846))) - (~((i157 & (-191646846)) << 1))) - 1;
            int i159 = myTid & 1293544295;
            int i160 = (~i159) & (myTid | 1293544295);
            int i161 = (i159 & i160) | (i159 ^ i160);
            int i162 = ~identityHashCode5;
            int i163 = (i161 & i162) | ((~i161) & identityHashCode5);
            int i164 = i161 & identityHashCode5;
            int i165 = (~((i164 & i163) | (i163 ^ i164))) * (-301);
            int i166 = i158 ^ i165;
            int i167 = -(-((i165 & i158) << 1));
            int i168 = ((i166 | i167) << 1) - (i167 ^ i166);
            int i169 = (i162 & (-1293544296)) | (identityHashCode5 & 1293544295);
            int i170 = identityHashCode5 & (-1293544296);
            int i171 = ~((i170 & i169) | (i169 ^ i170));
            int i172 = i162 | myTid;
            int i173 = ~i172;
            int i174 = (i172 | i173) & i173;
            int i175 = -(-((((~i174) & i171) | ((~i171) & i174) | (i171 & i174)) * (-301)));
            int i176 = i168 & i175;
            int i177 = i176 + ((i175 ^ i168) | i176);
            int i178 = ~myTid;
            int i179 = i178 & identityHashCode5;
            int i180 = (i178 | identityHashCode5) & (~i179);
            int i181 = (i180 ^ i179) | (i180 & i179);
            int i182 = ~i181;
            int i183 = (i181 | i182) & i182;
            int i184 = ((~i183) & (-1293544296)) | (1293544295 & i183);
            int i185 = i183 & (-1293544296);
            int i186 = ((i185 ^ i184) | (i185 & i184)) * 301;
            int i187 = i177 & i186;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b((((r12 ^ i108) + ((i108 & r12) << 1)) - (~(((i130 ^ i129) | (i130 & i129)) * 867))) - 1, keyRepeatTimeout2, (i155 ^ i156) + ((i156 & i155) << 1), (((i177 ^ i186) | i187) << 1) - ((i186 | i177) & (~i187)), (byte) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr4);
            java.lang.String str2 = (java.lang.String) objArr4[0];
            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
            int i188 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
            short s = (short) ((i188 ^ 1) + ((i188 & 1) << 1));
            int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
            int i189 = (((-1783127755) ^ indexOf) | ((-1783127755) & indexOf)) << 1;
            int i190 = -(((~indexOf) & (-1783127755)) | (1783127754 & indexOf));
            int i191 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i192 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int identityHashCode6 = java.lang.System.identityHashCode(addCardFromLocalStorage);
            int i193 = (i192 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE) - 271;
            int i194 = ~i192;
            int i195 = i194 ^ (-2);
            int i196 = i194 & (-2);
            int i197 = (i195 ^ i196) | (i195 & i196);
            int i198 = ~identityHashCode6;
            int i199 = i197 & i198;
            int i200 = (~i199) & (i197 | i198);
            int i201 = (i200 ^ i199) | (i199 & i200);
            int i202 = ~i201;
            int i203 = (i201 | i202) & i202;
            int i204 = (i192 ^ 1) | (i192 & 1);
            int i205 = i204 & identityHashCode6;
            int i206 = ~(((i204 | identityHashCode6) & (~i205)) | i205);
            int i207 = -(-(((i203 ^ i206) | (i203 & i206)) * (-272)));
            int i208 = i193 & i207;
            int i209 = i194 ^ 1;
            int i210 = i194 & 1;
            int i211 = (i209 & i210) | (i209 ^ i210);
            int i212 = ~i211;
            int i213 = (i211 | i212) & i212;
            int i214 = (i194 & identityHashCode6) | (i194 ^ identityHashCode6);
            int i215 = ~i214;
            int i216 = (i214 | i215) & i215;
            int i217 = i213 & i216;
            int i218 = (i216 | i213) & (~i217);
            int i219 = ((i208 + ((i207 ^ i193) | i208)) - (~(((i218 & i217) | (i218 ^ i217)) * (-272)))) - 1;
            int i220 = i192 ^ identityHashCode6;
            int i221 = i192 & identityHashCode6;
            int i222 = (i221 ^ i220) | (i220 & i221);
            int i223 = ~i222;
            int i224 = (i222 | i223) & i223;
            int i225 = i224 & 1;
            int i226 = (~i225) & (i224 | 1);
            int i227 = ((i226 ^ i225) | (i226 & i225)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE;
            byte b = (byte) ((i219 & i227) + (i227 | i219));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(((doubleTapTimeout | (-36)) << 1) - (((~doubleTapTimeout) & (-36)) | (doubleTapTimeout & 35)), s, (i189 ^ i190) + ((i189 & i190) << 1), (((~i191) & 1293544283) | ((-1293544284) & i191)) + ((1293544283 & i191) << 1), b, objArr5);
            java.lang.Object invoke = cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr5[0]), java.lang.CharSequence.class, java.lang.Integer.TYPE).invoke(null, objArr2);
            int i228 = getProfileVersion;
            int i229 = i228 & 21;
            int i230 = ((i228 ^ 21) | i229) << 1;
            int i231 = -((~i229) & (i228 | 21));
            RecordsJson = ((i230 & i231) + (i231 | i230)) % 128;
            RecordsJson = (i228 + 99) % 128;
            int indexOf2 = android.text.TextUtils.indexOf("", "", 0, 0);
            int identityHashCode7 = java.lang.System.identityHashCode(addCardFromLocalStorage);
            int i232 = indexOf2 * 141;
            int i233 = i232 & 10044;
            int i234 = -(-((i232 ^ 10044) | i233));
            int i235 = (i233 & i234) + (i234 | i233);
            int i236 = ~identityHashCode7;
            int i237 = (i236 & (-36)) | (identityHashCode7 & 35);
            int i238 = identityHashCode7 & (-36);
            int i239 = -(-(((i237 ^ i238) | (i237 & i238)) * 140));
            int i240 = i235 & i239;
            int i241 = i239 | i235;
            int i242 = (i240 & i241) + (i241 | i240);
            int i243 = ~indexOf2;
            int i244 = (i243 & 35) | ((~i243) & (-36));
            int i245 = i243 & (-36);
            int i246 = ~((i244 ^ i245) | (i245 & i244));
            int i247 = (i236 | identityHashCode7) & i236;
            int i248 = ~((i247 ^ (-36)) | (i247 & (-36)));
            int i249 = ((i246 ^ i248) | (i246 & i248)) * (-280);
            int i250 = i242 & i249;
            int i251 = i250 + ((i242 ^ i249) | i250);
            int i252 = indexOf2 ^ 35;
            int i253 = indexOf2 & 35;
            int i254 = (i252 ^ i253) | (i253 & i252);
            int i255 = ~i254;
            int i256 = (i254 | i255) & i255;
            int i257 = ~((indexOf2 ^ i236) | (i236 & indexOf2));
            int i258 = ((~i257) & i256) | ((~i256) & i257);
            int i259 = i257 & i256;
            int i260 = (i259 ^ i258) | (i259 & i258);
            int i261 = i243 | (-36);
            int i262 = i261 & identityHashCode7;
            int i263 = (identityHashCode7 | i261) & (~i262);
            int i264 = ~((i263 ^ i262) | (i263 & i262));
            int i265 = -(~(-(-(((i260 ^ i264) | (i264 & i260)) * 140))));
            int i266 = (i251 & i265) + (i265 | i251);
            short s2 = (short) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i267 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
            int identityHashCode8 = java.lang.System.identityHashCode(addCardFromLocalStorage);
            int i268 = i267 * (-958);
            int i269 = (((-1160567694) | i268) << 1) - ((i268 & 1160567693) | ((~i268) & (-1160567694)));
            int i270 = ~identityHashCode8;
            int i271 = i270 & 1783127782;
            int i272 = (~i271) & (i270 | 1783127782);
            int i273 = ~((i271 ^ i272) | (i271 & i272));
            int i274 = ~i267;
            int i275 = ~((i274 & identityHashCode8) | (i274 ^ identityHashCode8));
            int i276 = i273 ^ i275;
            int i277 = i273 & i275;
            int i278 = (i277 ^ i276) | (i277 & i276);
            int i279 = (i270 | identityHashCode8) & i270;
            int i280 = ((~i279) & i267) | (i279 & i274) | (i279 & i267);
            int i281 = ~i280;
            int i282 = (i280 | i281) & i281;
            int i283 = -(-((((~i278) & i282) | ((~i282) & i278) | (i278 & i282)) * 959));
            int i284 = i269 ^ i283;
            int i285 = (i269 & i283) << 1;
            int i286 = (i284 ^ i285) + ((i285 & i284) << 1);
            int i287 = (i267 & 1783127782) | (i274 & (-1783127783)) | ((-1783127783) & i267);
            int i288 = ~i287;
            int i289 = -(~(-(-(((i287 | i288) & i288) * (-959)))));
            int i290 = ((i286 & i289) + (i289 | i286)) - 1;
            int i291 = i274 & i270;
            int i292 = (i270 | i274) & (~i291);
            int i293 = ~((i292 ^ i291) | (i292 & i291));
            int i294 = identityHashCode8 & 1783127782;
            int i295 = ~(i294 | ((~i294) & (identityHashCode8 | 1783127782)));
            int i296 = i293 ^ i295;
            int i297 = i293 & i295;
            int i298 = (i297 ^ i296) | (i297 & i296);
            int i299 = i267 & identityHashCode8;
            int i300 = (i267 | identityHashCode8) & (~i299);
            int i301 = (i300 ^ i299) | (i300 & i299);
            int i302 = ~i301;
            int i303 = (i301 | i302) & i302;
            int i304 = -(-(((i303 & (~i298)) | ((~i303) & i298) | (i303 & i298)) * 959));
            int i305 = i290 ^ i304;
            int i306 = -(~(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b((i266 << 1) + (~i266), s2, (((i304 & i290) | i305) << 1) - i305, ((1293544284 ^ i306) + ((i306 & 1293544284) << 1)) - 1, (byte) android.view.View.combineMeasuredStates(0, 0), objArr6);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
            int i307 = -android.graphics.ImageFormat.getBitsPerPixel(0);
            int i308 = i307 ^ (-37);
            int i309 = ((i307 & (-37)) | i308) << 1;
            int i310 = -i308;
            short s3 = (short) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i311 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int identityHashCode9 = java.lang.System.identityHashCode(addCardFromLocalStorage);
            int i312 = i311 * 69;
            int i313 = (-789526177) & i312;
            int i314 = (i312 | (-789526177)) & (~i313);
            int i315 = i313 << 1;
            int i316 = ((i314 | i315) << 1) - (i314 ^ i315);
            int i317 = ~i311;
            int i318 = (i317 ^ 1783127732) | (i317 & 1783127732);
            int i319 = ~identityHashCode9;
            int i320 = i318 & i319;
            int i321 = (i318 | i319) & (~i320);
            int i322 = ~((i321 ^ i320) | (i321 & i320));
            int i323 = ~((i311 ^ (-1783127733)) | (i311 & (-1783127733)));
            int i324 = ((~i322) & i323) | ((~i323) & i322);
            int i325 = i322 & i323;
            int i326 = (i324 ^ i325) | (i325 & i324);
            int i327 = (i319 & (-1783127733)) | (identityHashCode9 & 1783127732);
            int i328 = identityHashCode9 & (-1783127733);
            int i329 = ~((i328 ^ i327) | (i328 & i327));
            int i330 = i326 ^ i329;
            int i331 = i326 & i329;
            int i332 = -(-(((i331 ^ i330) | (i331 & i330)) * (-68)));
            int i333 = i316 & i332;
            int i334 = i317 ^ i319;
            int i335 = i317 & i319;
            int i336 = (i334 ^ i335) | (i334 & i335);
            int i337 = i333 + ((i332 ^ i316) | i333) + ((~((i336 & (-1783127733)) | (i336 ^ (-1783127733)))) * (-68));
            int i338 = (i311 | i317) & i317;
            int i339 = i319 ^ 1783127732;
            int i340 = i319 & 1783127732;
            int i341 = (i339 ^ i340) | (i339 & i340);
            int i342 = ~i341;
            int i343 = (i341 | i342) & i342;
            int i344 = ((~i343) & i338) | ((~i338) & i343);
            int i345 = i338 & i343;
            int i346 = -(~(-(-(((i345 ^ i344) | (i345 & i344)) * 68))));
            int i347 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int identityHashCode10 = java.lang.System.identityHashCode(addCardFromLocalStorage);
            int i348 = (i347 * (-380)) + 212683942;
            int i349 = (identityHashCode10 ^ 1293544301) | (identityHashCode10 & 1293544301);
            int i350 = ~i347;
            int i351 = (i350 | i347) & i350;
            int i352 = ((~i351) & i349) | ((~i349) & i351);
            int i353 = i349 & i351;
            int i354 = -(-(((i353 ^ i352) | (i353 & i352)) * (-381)));
            int i355 = (((~i354) & i348) | ((~i348) & i354)) + ((i348 & i354) << 1);
            int i356 = (-1293544302) ^ i350;
            int i357 = (-1293544302) & i350;
            int i358 = ~((i356 ^ i357) | (i357 & i356));
            int i359 = ~identityHashCode10;
            int i360 = i359 & 1293544301;
            int i361 = (i359 | 1293544301) & (~i360);
            int i362 = ~((i361 ^ i360) | (i361 & i360));
            int i363 = (i362 ^ i358) | (i362 & i358);
            int i364 = i350 & 1293544301;
            int i365 = ((-1293544302) & i347) | i364;
            int i366 = i347 & 1293544301;
            int i367 = ~((i366 ^ i365) | (i366 & i365));
            int i368 = i363 & i367;
            int i369 = -(-((((i367 | i363) & (~i368)) | i368) * 381));
            int i370 = ((((~i369) & i355) | ((~i355) & i369)) - (~(-(-((i369 & i355) << 1))))) - 1;
            int i371 = ((~i350) & 1293544301) | i357 | i364;
            int i372 = ~i371;
            int i373 = -(~(-(-(((i371 | i372) & i372) * 381))));
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            b(((i309 | i310) << 1) - (i309 ^ i310), s3, ((i337 & i346) + (i346 | i337)) - 1, ((i370 ^ i373) + ((i373 & i370) << 1)) - 1, (byte) android.view.KeyEvent.normalizeMetaState(0), objArr7);
            cls2.getMethod((java.lang.String) objArr7[0], null).invoke(invoke, null);
            int i374 = getProfileVersion + 23;
            RecordsJson = i374 % 128;
            if (i374 % 2 == 0) {
                return null;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.lang.String str;
        java.lang.String str2 = (java.lang.String) objArr[0];
        int i = RecordsJson;
        int i2 = i & 23;
        int i3 = ((i ^ 23) | i2) << 1;
        int i4 = -((i | 23) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        getProfileVersion = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str2.startsWith("profile")) {
            int i6 = getProfileVersion;
            int i7 = ((i6 & 89) - (~(-(-(i6 | 89))))) - 1;
            RecordsJson = i7 % 128;
            if (i7 % 2 != 0) {
                str2.replace("profile", "suk");
                throw null;
            }
            str = str2.replace("profile", "suk");
            int i8 = RecordsJson + 86;
            getProfileVersion = ((~i8) + (i8 << 1)) % 128;
        } else {
            str = "";
        }
        getProfileVersion = (RecordsJson + 39) % 128;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, int i3, byte b, java.lang.Object[] objArr) {
        long j;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(values)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 27, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 30, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            int i4 = intValue == -1 ? 1 : 0;
            if (i4 != 0) {
                byte[] bArr = SdkCoreAlternateContactlessPaymentDataImpl;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i5 = 0;
                    while (i5 < length) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.indexOf("", c), 5088 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i5++;
                        c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = SdkCoreAlternateContactlessPaymentDataImpl;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(valueOf)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 28 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L))));
                } else {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (IccPrivateKeyCrtComponentsJson[i2 + ((int) (valueOf ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (valueOf ^ j)) + i4;
                        java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getAid), sb};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj4 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27, 2365 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            a(0, 0, (byte) 0, objArr6);
                            obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr4 = SdkCoreAlternateContactlessPaymentDataImpl;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i6 = 0; i6 < length2; i6++) {
                                bArr5[i6] = (byte) (bArr4[i6] ^ (-4897270311952305750L));
                            }
                            bArr4 = bArr5;
                        }
                        boolean z = bArr4 != null;
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z) {
                                byte[] bArr6 = SdkCoreAlternateContactlessPaymentDataImpl;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = IccPrivateKeyCrtComponentsJson;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                    objArr[0] = sb.toString();
                }
            }
            j = -4897270311952305750L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.io.BufferedReader bufferedReader = (java.io.BufferedReader) objArr[0];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = getProfileVersion;
        RecordsJson = ((i & 51) + (i | 51)) % 128;
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                java.lang.String str = new java.lang.String(sb);
                int i2 = getProfileVersion;
                int i3 = i2 & 115;
                RecordsJson = (i3 + ((i2 ^ 115) | i3)) % 128;
                return str;
            }
            int i4 = getProfileVersion;
            int i5 = i4 & 43;
            int i6 = (i5 - (~(-(-((i4 ^ 43) | i5))))) - 1;
            RecordsJson = i6 % 128;
            if (i6 % 2 != 0) {
                sb.append(readLine);
                throw new java.lang.ArithmeticException();
            }
            sb.append(readLine);
        }
    }

    static void AlternateContactlessPaymentDataJson() {
        valueOf = 1967943501;
        values = 520368521;
        getAid = -1377688404;
        SdkCoreAlternateContactlessPaymentDataImpl = new byte[]{91, -85, -72, 88, -79, -116, 16, -91, 84, -87, 81, 88, -29, com.visa.cbp.getEncExpo.IResultReceiver2, 81, 80, 87, -92, 92, -89, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 86, -71, -69, 69, 80, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 94, 94, 86, -71, 91, -84, 85, -122, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 16, -84, -93, 91, -84, 85, -90, -97, com.visa.cbp.getEncExpo.IResultReceiver2, 81, 80, 87, -92, 92, -89, 75, -94, -83, com.visa.cbp.getEncExpo.addOnTrimMemoryListener};
    }

    private static java.lang.String writeReplace(java.io.BufferedReader bufferedReader) throws java.io.IOException {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{bufferedReader}, -1117752980, 1117752980, (int) java.lang.System.currentTimeMillis());
    }

    private static java.lang.String valueOf(java.lang.String str) {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{str}, -718043680, 718043684, (int) java.lang.System.currentTimeMillis());
    }

    private void DigitizedCardProfile(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -1803749864, 1803749867, java.lang.System.identityHashCode(this));
    }

    private static void writeReplace(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{str}, -1172632154, 1172632156, (int) java.lang.System.currentTimeMillis());
    }

    private void DigitizedCardProfile() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1184206473, -1184206472, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{89, 43, 98, -67};
        $$b = 106;
    }
}
