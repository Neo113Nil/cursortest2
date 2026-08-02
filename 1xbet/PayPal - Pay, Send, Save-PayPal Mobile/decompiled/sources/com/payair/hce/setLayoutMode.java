package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/payair/hce/setLayoutMode;", "", "<init>", "()V", "", "AlternateContactlessPaymentDataJson", "", "p0", "DigitizedCardProfile", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class setLayoutMode {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    public static final com.payair.hce.setLayoutMode INSTANCE;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static long valueOf;
    private static char writeReplace;

    private static void a(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i = s + 102;
        byte[] bArr = $$g;
        int i2 = b * 4;
        int i3 = 4 - (b2 * 4);
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = i2 + (-i3);
            i3++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i6 = i3;
            i += -bArr[i3];
            i3 = i6 + 1;
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 118 - (i * 50);
        int i4 = 23 - (b2 * 19);
        int i5 = b * 14;
        byte[] bArr2 = new byte[20 - i5];
        int i6 = 19 - i5;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i3 = i3 + (-i7) + 2;
            i4++;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i3 = i3 + (-i7) + 2;
            i4++;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    private static void d(short s, byte b, short s2, java.lang.Object[] objArr) {
        byte[] bArr = $$d;
        int i = 136 - s2;
        int i2 = 99 - s;
        byte[] bArr2 = new byte[60 - b];
        int i3 = -1;
        ?? r5 = i2;
        if (bArr == null) {
            i3 = -1;
            r5 = i2 + i;
        }
        while (true) {
            int i4 = i;
            byte b2 = r5;
            int i5 = i3 + 1;
            bArr2[i5] = b2;
            int i6 = i4 + 1;
            if (i5 == 59 - b) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i = i6;
                r5 = bArr[i6] + b2;
                i3 = i5;
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~((~i2) | i);
        return ((((i * 55) + (i2 * (-107))) + (((~(i2 | i5)) | (~(i4 | i2))) * (-108))) + (((~(i | i5)) | ((~(i4 | i3)) | i6)) * 54)) + ((i3 | i6) * 54) != 1 ? valueOf(objArr) : AlternateContactlessPaymentDataJson(objArr);
    }

    private setLayoutMode() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0a54  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        java.lang.Integer num;
        java.lang.String str;
        java.lang.String str2;
        android.content.Context context;
        int i;
        int i2;
        java.lang.Object[] objArr2;
        java.lang.Integer num2;
        java.lang.CharSequence charSequence;
        java.lang.Object[] objArr3;
        int i3;
        int i4;
        int i5 = 0;
        java.lang.String str3 = (java.lang.String) objArr[0];
        int i6 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i7 = i6 & 93;
        int i8 = -(-((i6 ^ 93) | i7));
        IccPrivateKeyCrtComponentsJson = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
        android.content.SharedPreferences sharedPreferences = ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        com.payair.hce.setLeft.values(new java.lang.Object[]{"encryptedCvv", str3, sharedPreferences}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 584, (char) (android.graphics.Color.blue(0) + 24291));
        byte[] bArr = $$a;
        byte b = bArr[6];
        byte b2 = (byte) (-bArr[20]);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b(b, b2, b2, objArr4);
        long j = cls.getField((java.lang.String) objArr4[0]).getLong(null);
        try {
            if (j != -1) {
                int i9 = SdkCoreAlternateContactlessPaymentDataImpl;
                IccPrivateKeyCrtComponentsJson = (((i9 & (-102)) | ((~i9) & 101)) + ((i9 & 101) << 1)) % 128;
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                int threadPriority = android.os.Process.getThreadPriority(0);
                num = 0;
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i10 = -(-(threadPriority * 263));
                int i11 = i10 & (-10460);
                int i12 = i11 + ((i10 ^ (-10460)) | i11);
                int i13 = threadPriority & (-21);
                int i14 = (~i13) & (threadPriority | (-21));
                int i15 = ~threadPriority;
                int i16 = ~((i14 ^ i13) | (i14 & i13));
                int i17 = (i15 & (-21)) | ((~i15) & 20);
                int i18 = i15 & 20;
                int i19 = ~((i17 ^ i18) | (i17 & i18));
                int i20 = i16 & i19;
                int i21 = (i19 | i16) & (~i20);
                int i22 = (i20 ^ i21) | (i21 & i20);
                int i23 = (i15 | threadPriority) & i15;
                int i24 = (i23 ^ currentTimeMillis) | (i23 & currentTimeMillis);
                str = str3;
                int i25 = ~i24;
                int i26 = i25 & (i24 | i25);
                int i27 = -(-(((i26 ^ i22) | (i22 & i26)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                int i28 = ((i12 ^ i27) | (i12 & i27)) << 1;
                int i29 = -(((~i27) & i12) | ((~i12) & i27));
                int i30 = (((i28 | i29) << 1) - (i29 ^ i28)) + ((~(((~i18) & (i15 | 20)) | i18)) * (-786));
                int i31 = ~currentTimeMillis;
                int i32 = (currentTimeMillis | i31) & i31;
                int i33 = i23 ^ i32;
                int i34 = i32 & i23;
                int i35 = ~((i34 ^ i33) | (i34 & i33));
                int i36 = threadPriority ^ (-21);
                int i37 = (i13 ^ i36) | (i13 & i36);
                int i38 = ~i37;
                int i39 = (i37 | i38) & i38;
                int i40 = ((~i35) & i39) | ((~i39) & i35) | (i35 & i39);
                int i41 = i23 & 20;
                int i42 = (~i41) & (i23 | 20);
                int i43 = ~((i41 ^ i42) | (i42 & i41));
                int i44 = i40 ^ i43;
                int i45 = i40 & i43;
                int i46 = -(-(((i45 ^ i44) | (i45 & i44)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                int i47 = i30 ^ i46;
                int i48 = ((i46 & i30) | i47) << 1;
                int i49 = -i47;
                char c = (char) (((i48 ^ i49) + ((i48 & i49) << 1)) >> 6);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                c("\ue728禜綏뒗둱ജ샧䁵䩹ሜ佉詄娏ꅂ䋔\uf035厳糴弖ꠂ\ue060削", "\u0000\u0000\u0000\u0000", "污艎ࡿ边", makeMeasureSpec, c, objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                int i50 = -android.view.MotionEvent.axisFromString("");
                int i51 = 1278250141 & i50;
                int i52 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int i53 = ((36869 ^ i52) | (36869 & i52)) << 1;
                int i54 = -(((~i52) & 36869) | ((-36870) & i52));
                char c2 = (char) (((i53 | i54) << 1) - (i54 ^ i53));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                c("ꒃ粌ꍱ㸼빳⯉䢯헤⬃뷮壟㪃⣡\u0093䚉", "\u0000\u0000\u0000\u0000", "鹈れٌ\ue790", i51 + ((i50 ^ 1278250141) | i51), c2, objArr6);
                if (j + 1860 >= ((java.lang.Long) cls2.getDeclaredMethod((java.lang.String) objArr6[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                    int i55 = SdkCoreAlternateContactlessPaymentDataImpl;
                    int i56 = i55 & 121;
                    int i57 = (i55 ^ 121) | i56;
                    IccPrivateKeyCrtComponentsJson = (((i56 | i57) << 1) - (i57 ^ i56)) % 128;
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 52, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 584, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24291));
                    byte b3 = (byte) (-bArr[20]);
                    byte b4 = bArr[6];
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(b3, b4, b4, objArr7);
                    try {
                        java.lang.Object[] objArr8 = {cls3.getField((java.lang.String) objArr7[0]).get(null), -1413843862, null};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.getTrimmedLength("") + 4830, (char) android.graphics.Color.green(0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj);
                        }
                        objArr3 = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr8);
                        int i58 = IccPrivateKeyCrtComponentsJson;
                        int i59 = i58 & 119;
                        int i60 = ((i58 ^ 119) | i59) << 1;
                        int i61 = -((i58 | 119) & (~i59));
                        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                        SdkCoreAlternateContactlessPaymentDataImpl = i62 % 128;
                        if (i62 % 2 == 0) {
                            int i63 = 5 / 2;
                        }
                        num2 = 994792440;
                        charSequence = "";
                        str2 = "valueOf";
                        i3 = ((int[]) objArr3[1])[0];
                        i4 = ((int[]) objArr3[0])[0];
                        if (i4 == i3) {
                            java.lang.String str4 = str2;
                            java.lang.Integer num3 = num2;
                            int i64 = (~i4) & i3;
                            int i65 = (~i3) & i4;
                            long j2 = (i64 ^ i65) | (i65 & i64);
                            int i66 = SdkCoreAlternateContactlessPaymentDataImpl;
                            IccPrivateKeyCrtComponentsJson = ((((i66 | 66) << 1) - (i66 ^ 66)) - 1) % 128;
                            int i67 = i66 & 91;
                            int i68 = (i66 | 91) & (~i67);
                            int i69 = -(-(i67 << 1));
                            IccPrivateKeyCrtComponentsJson = (((i68 | i69) << 1) - (i68 ^ i69)) % 128;
                            try {
                                java.lang.Object[] objArr9 = {java.lang.Long.valueOf(j2 ^ (-4976520984593956864L)), -1158686072L};
                                byte[] bArr2 = $$d;
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                d(bArr2[81], bArr2[69], (short) (-bArr2[21]), objArr10);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                d((byte) ($$e - 3), (byte) (-bArr2[21]), bArr2[81], objArr11);
                                cls4.getMethod((java.lang.String) objArr11[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr9);
                                java.lang.Object[] objArr12 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[3])[0]), num};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4829, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod(str4, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj2);
                                }
                                ((java.lang.reflect.Method) obj2).invoke(null, objArr12);
                                int i70 = SdkCoreAlternateContactlessPaymentDataImpl;
                                int i71 = (((i70 | 68) << 1) - (i70 ^ 68)) - 1;
                                IccPrivateKeyCrtComponentsJson = i71 % 128;
                                if (i71 % 2 == 0) {
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
                        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                        int i72 = (-2145503687) ^ currentTimeMillis2;
                        int i73 = ~currentTimeMillis2;
                        int i74 = (-2145503687) & currentTimeMillis2;
                        int i75 = ~((i72 ^ i74) | (i74 & i72));
                        int i76 = i75 & 376356364;
                        int i77 = (i75 | 376356364) & (~i76);
                        int i78 = ((i77 ^ i76) | (i77 & i76)) * (-318);
                        int i79 = 561759187 & i78;
                        int i80 = i78 | 561759187;
                        int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                        int i82 = ~((i73 & 376356364) | ((-376356365) & currentTimeMillis2) | (currentTimeMillis2 & 376356364));
                        int i83 = i73 ^ 2145503686;
                        int i84 = i73 & 2145503686;
                        int i85 = (i83 ^ i84) | (i83 & i84);
                        int i86 = (-376356365) & i85;
                        int i87 = (i85 | (-376356365)) & (~i86);
                        int i88 = ~((i87 ^ i86) | (i87 & i86));
                        int i89 = ((~i88) & i82) | ((~i82) & i88);
                        int i90 = i82 & i88;
                        int i91 = -(-(((i90 ^ i89) | (i90 & i89)) * 318));
                        int i92 = (i81 ^ i91) + ((i91 & i81) << 1);
                        int i93 = (i73 | currentTimeMillis2) & i73;
                        int i94 = i93 & 376356364;
                        int i95 = ((i93 | 376356364) & (~i94)) | i94;
                        int i96 = ((-2145503687) & i95) | ((~i95) & 2145503686);
                        int i97 = i95 & 2145503686;
                        int i98 = ~((i97 ^ i96) | (i97 & i96));
                        int i99 = (i73 & (-931337)) | (931336 & currentTimeMillis2);
                        int i100 = currentTimeMillis2 & (-931337);
                        int i101 = ~((i100 ^ i99) | (i100 & i99));
                        int i102 = ((~i101) & i98) | ((~i98) & i101);
                        int i103 = i101 & i98;
                        int i104 = -(-(((i103 ^ i102) | (i103 & i102)) * 318));
                        int i105 = ((i92 ^ i104) | (i92 & i104)) << 1;
                        int i106 = -(((~i104) & i92) | ((~i92) & i104));
                        int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                        int i107 = ~currentTimeMillis3;
                        int i108 = 1142481134 - (~(-(-(((currentTimeMillis3 ^ (-551081205)) | (currentTimeMillis3 & (-551081205))) * (-50)))));
                        int i109 = ((-167912195) & i107) | (167912194 & currentTimeMillis3);
                        int i110 = (-167912195) & currentTimeMillis3;
                        int i111 = ~((i109 ^ i110) | (i110 & i109));
                        int i112 = (-717895651) ^ i107;
                        int i113 = (-717895651) & i107;
                        int i114 = (i113 & i112) | (i112 ^ i113) | (-551081205);
                        int i115 = ~i114;
                        int i116 = (i114 | i115) & i115;
                        int i117 = i111 & i116;
                        int i118 = (i111 | i116) & (~i117);
                        int i119 = -(-(((i118 ^ i117) | (i118 & i117)) * 50));
                        int i120 = i108 & i119;
                        int i121 = -(-((i119 ^ i108) | i120));
                        int i122 = (i120 & i121) + (i121 | i120);
                        int i123 = ~(i113 | i112);
                        int i124 = 549983456 ^ i123;
                        int i125 = i123 & 549983456;
                        int i126 = (i125 ^ i124) | (i125 & i124);
                        int i127 = (currentTimeMillis3 | i107) & i107;
                        int i128 = ~((i127 ^ (-551081205)) | (i127 & (-551081205)));
                        int i129 = i126 & i128;
                        int i130 = (i128 | i126) & (~i129);
                        int i131 = -(~(-(-(((i130 ^ i129) | (i130 & i129)) * 50))));
                        if (((i105 | i106) << 1) - (i106 ^ i105) <= (-2) - (~(((i122 | i131) << 1) - (i131 ^ i122)))) {
                            java.lang.Object[] objArr13 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[5])[1]), 1};
                            java.lang.Integer num4 = num2;
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                            if (obj3 == null) {
                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(charSequence, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 31, 4830 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod(str2, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj3);
                            }
                            ((java.lang.reflect.Method) obj3).invoke(null, objArr13);
                            return null;
                        }
                        java.lang.String str5 = str2;
                        java.lang.CharSequence charSequence2 = charSequence;
                        java.lang.Integer num5 = num2;
                        java.lang.Object[] objArr14 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[3])[0]), num};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                        if (obj4 == null) {
                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 31, 4830 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod(str5, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj4);
                        }
                        ((java.lang.reflect.Method) obj4).invoke(null, objArr14);
                        return null;
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                i5 = 0;
            } else {
                num = 0;
                str = str3;
            }
            java.lang.Object[] objArr15 = new java.lang.Object[i2];
            objArr15[2] = -1413843862;
            objArr15[1] = java.lang.Integer.valueOf(i);
            objArr15[0] = context;
            byte[] bArr3 = $$d;
            byte b5 = bArr3[81];
            byte b6 = b5;
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            d(b5, b6, (short) (b6 | 133), objArr16);
            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr16[0]);
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            d((byte) $$e, (byte) (bArr3[9] + 1), (short) (bArr3[3] - 1), objArr17);
            java.lang.String str6 = (java.lang.String) objArr17[0];
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            e(new int[]{0, 23, 179, 23}, true, "\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", objArr18);
            java.lang.Object[] objArr19 = (java.lang.Object[]) cls5.getMethod(str6, java.lang.Class.forName((java.lang.String) objArr18[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr15);
            if (context != null) {
                int i132 = IccPrivateKeyCrtComponentsJson;
                SdkCoreAlternateContactlessPaymentDataImpl = ((i132 ^ 31) + ((i132 & 31) << 1)) % 128;
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 51, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 584, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 24291));
                byte b7 = (byte) (-bArr[20]);
                byte b8 = bArr[6];
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                b(b7, b8, b8, objArr20);
                cls6.getField((java.lang.String) objArr20[0]).set(null, objArr19);
                try {
                    try {
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        c("\ue728禜綏뒗둱ജ샧䁵䩹ሜ佉詄娏ꅂ䋔\uf035厳糴弖ꠂ\ue060削", "\u0000\u0000\u0000\u0000", "污艎ࡿ边", android.view.View.combineMeasuredStates(0, 0), (char) android.text.TextUtils.indexOf("", "", 0, 0), objArr21);
                        java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                        int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                        int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                        int i133 = minimumFlingVelocity * 628;
                        int i134 = (-417795176) ^ i133;
                        int i135 = ((i133 & (-417795176)) | i134) << 1;
                        int i136 = -i134;
                        int i137 = ((i135 | i136) << 1) - (i135 ^ i136);
                        int i138 = ~currentTimeMillis4;
                        int i139 = 1278250142 & i138;
                        int i140 = (-1278250143) & currentTimeMillis4;
                        int i141 = i139 | i140;
                        int i142 = 1278250142 & currentTimeMillis4;
                        int i143 = (i141 ^ i142) | (i141 & i142);
                        int i144 = ~minimumFlingVelocity;
                        int i145 = i144 & (i144 | minimumFlingVelocity);
                        int i146 = ((i143 ^ i145) | (i143 & i145)) * (-627);
                        int i147 = ((~i146) & i137) | ((~i137) & i146);
                        int i148 = -(-((i137 & i146) << 1));
                        int i149 = (i147 & i148) + (i148 | i147);
                        int i150 = ((-1278250143) & i138) | i142;
                        int i151 = ~((i140 ^ i150) | (i140 & i150));
                        int i152 = minimumFlingVelocity & i151;
                        int i153 = -(~(-(-((((i151 | minimumFlingVelocity) & (~i152)) | i152) * (-627)))));
                        int i154 = (((i149 | i153) << 1) - (i153 ^ i149)) - 1;
                        int i155 = i138 ^ 1278250142;
                        int i156 = (i155 ^ i139) | (i139 & i155);
                        int i157 = ~i156;
                        int i158 = (i156 | i157) & i157;
                        int i159 = (minimumFlingVelocity ^ currentTimeMillis4) | (minimumFlingVelocity & currentTimeMillis4);
                        int i160 = ~i159;
                        int i161 = (i159 | i160) & i160;
                        int i162 = -(~(-(-(((i161 ^ i158) | (i161 & i158)) * 627))));
                        int threadPriority2 = android.os.Process.getThreadPriority(0);
                        int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                        int i163 = -(-(threadPriority2 * (-919)));
                        int i164 = i163 ^ (-18380);
                        int i165 = ((i163 & (-18380)) | i164) << 1;
                        int i166 = -i164;
                        int i167 = ~threadPriority2;
                        int i168 = i167 ^ (-21);
                        int i169 = i167 & (-21);
                        int i170 = i168 | i169;
                        int i171 = ~currentTimeMillis5;
                        objArr2 = objArr19;
                        int i172 = (i170 & i171) | ((~i170) & currentTimeMillis5);
                        int i173 = i170 & currentTimeMillis5;
                        int i174 = ~((i173 & i172) | (i172 ^ i173));
                        int i175 = (i167 | threadPriority2) & i167;
                        int i176 = (i175 & i171) | (i175 ^ i171);
                        int i177 = (i176 & 20) | (i176 ^ 20);
                        charSequence = "";
                        int i178 = ~i177;
                        int i179 = i178 & (i177 | i178);
                        int i180 = i174 ^ i179;
                        int i181 = i174 & i179;
                        int i182 = (((i165 ^ i166) + ((i165 & i166) << 1)) - (~(-(-(((i181 ^ i180) | (i181 & i180)) * 920))))) - 1;
                        int i183 = (i168 & i169) | (i168 ^ i169);
                        int i184 = ~i183;
                        int i185 = (i171 | currentTimeMillis5) & i171;
                        int i186 = i185 ^ (-21);
                        int i187 = i185 & (-21);
                        int i188 = ~((i186 ^ i187) | (i187 & i186));
                        int i189 = ((~i188) & i184) | ((~i184) & i188);
                        int i190 = i188 & i184;
                        int i191 = -(-(((i190 ^ i189) | (i190 & i189)) * 920));
                        int i192 = i182 ^ i191;
                        int i193 = -(-((i182 & i191) << 1));
                        int i194 = (i192 & i193) + (i193 | i192);
                        int i195 = ((~i185) & i183) | (i184 & i185);
                        int i196 = i183 & i185;
                        int i197 = ~((i196 ^ i195) | (i196 & i195));
                        int i198 = (threadPriority2 & (-21)) | (threadPriority2 & 20) | i169;
                        int i199 = i198 & currentTimeMillis5;
                        int i200 = (i198 | currentTimeMillis5) & (~i199);
                        int i201 = ~((i200 ^ i199) | (i200 & i199));
                        int i202 = i167 & 20;
                        int i203 = (~i202) & (i167 | 20);
                        int i204 = (i202 ^ i203) | (i202 & i203);
                        int i205 = i204 & currentTimeMillis5;
                        int i206 = ((currentTimeMillis5 | i204) & (~i205)) | i205;
                        int i207 = (i197 ^ i201) | (i201 & i197);
                        int i208 = ~i206;
                        int i209 = (i207 | ((i206 | i208) & i208)) * 920;
                        int i210 = ((i194 ^ i209) | (i194 & i209)) << 1;
                        int i211 = -(((~i209) & i194) | ((~i194) & i209));
                        int i212 = ((i210 ^ i211) + ((i211 & i210) << 1)) >> 6;
                        int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                        int i213 = ~currentTimeMillis6;
                        int i214 = (i213 | currentTimeMillis6) & i213;
                        int i215 = i214 ^ (-36871);
                        int i216 = i214 & (-36871);
                        int i217 = (i215 ^ i216) | (i215 & i216);
                        int i218 = ~i217;
                        int i219 = (i217 | i218) & i218;
                        int i220 = i212 & (-36871);
                        int i221 = (~i220) & (i212 | (-36871));
                        int i222 = ~(i220 | i221);
                        int i223 = (i219 ^ i222) | (i219 & i222);
                        int i224 = ~i212;
                        int i225 = ((~i213) & i212) | (i213 & i224);
                        int i226 = i213 & i212;
                        int i227 = ~((i225 ^ i226) | (i225 & i226));
                        num2 = 994792440;
                        int i228 = ((~i227) & i223) | ((~i223) & i227) | (i227 & i223);
                        int i229 = 36870 & i224;
                        int i230 = (~i229) & (36870 | i224);
                        int i231 = (i229 & i230) | (i230 ^ i229);
                        int i232 = i231 & currentTimeMillis6;
                        int i233 = (currentTimeMillis6 | i231) & (~i232);
                        int i234 = ~((i233 ^ i232) | (i233 & i232));
                        int i235 = ((i212 * (-589)) + 21790170) - (~(((i234 ^ i228) | (i234 & i228)) * 590));
                        int i236 = (~i235) + (i235 << 1);
                        int i237 = ~(((-36871) & i213) | (i213 ^ (-36871)));
                        int i238 = ~((i220 & i221) | (i221 ^ i220));
                        int i239 = (i237 ^ i238) | (i237 & i238);
                        int i240 = -(-(((i239 ^ i227) | (i239 & i227)) * (-1180)));
                        int i241 = ((~i240) & i236) | ((~i236) & i240);
                        int i242 = -(-((i236 & i240) << 1));
                        int i243 = (i241 & i242) + (i242 | i241);
                        int i244 = (i212 | i224) & i224;
                        int i245 = i244 & i214;
                        int i246 = ((i244 | i214) & (~i245)) | i245;
                        int i247 = ~i246;
                        int i248 = (i246 | i247) & i247;
                        int i249 = 36870 & i214;
                        int i250 = (36870 | i214) & (~i249);
                        int i251 = (i249 ^ i250) | (i250 & i249);
                        int i252 = ~i251;
                        int i253 = (i251 | i252) & i252;
                        int i254 = i248 & i253;
                        int i255 = (i248 | i253) & (~i254);
                        int i256 = -(~(((i255 ^ i254) | (i255 & i254)) * 590));
                        char c3 = (char) ((((i243 | i256) << 1) - (i256 ^ i243)) - 1);
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        c("ꒃ粌ꍱ㸼빳⯉䢯헤⬃뷮壟㪃⣡\u0093䚉", "\u0000\u0000\u0000\u0000", "鹈れٌ\ue790", (-2) - (~(((i154 | i162) << 1) - (i162 ^ i154))), c3, objArr22);
                        long longValue = ((java.lang.Long) cls7.getDeclaredMethod((java.lang.String) objArr22[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3, 585 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24291));
                        byte b9 = bArr[6];
                        byte b10 = (byte) (-bArr[20]);
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        b(b9, b10, b10, objArr23);
                        cls8.getField((java.lang.String) objArr23[0]).set(null, java.lang.Long.valueOf(longValue));
                        int i257 = IccPrivateKeyCrtComponentsJson;
                        int i258 = i257 ^ 17;
                        int i259 = ((i257 & 17) | i258) << 1;
                        int i260 = -i258;
                        SdkCoreAlternateContactlessPaymentDataImpl = ((i259 ^ i260) + ((i259 & i260) << 1)) % 128;
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                } catch (java.lang.Exception unused) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            } else {
                objArr2 = objArr19;
                num2 = 994792440;
                charSequence = "";
            }
            objArr3 = objArr2;
            i3 = ((int[]) objArr3[1])[0];
            i4 = ((int[]) objArr3[0])[0];
            if (i4 == i3) {
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
        int threadPriority3 = android.os.Process.getThreadPriority(i5);
        int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
        int currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
        int i261 = longPressTimeout * (-574);
        int i262 = (-14567546) & i261;
        int i263 = (((-14567546) ^ i261) | i262) << 1;
        int i264 = -((i261 | (-14567546)) & (~i262));
        int i265 = ((i263 | i264) << 1) - (i264 ^ i263);
        int i266 = ~longPressTimeout;
        int i267 = ~currentTimeMillis7;
        int i268 = (i267 | currentTimeMillis7) & i267;
        int i269 = ~((i268 & i266) | (i266 ^ i268));
        int i270 = currentTimeMillis7 & (-25380);
        int i271 = ~(((~i270) & (currentTimeMillis7 | (-25380))) | i270);
        str2 = "valueOf";
        int i272 = ((~i269) & i271) | ((~i271) & i269);
        int i273 = i269 & i271;
        int i274 = -(-(((i273 ^ i272) | (i273 & i272)) * 1150));
        int i275 = (i265 & i274) + (i265 | i274);
        int i276 = (i267 & (-25380)) | (currentTimeMillis7 & 25379);
        int i277 = ~((i276 ^ i270) | (i270 & i276));
        int i278 = (i267 ^ 25379) | (i267 & 25379);
        int i279 = ~i278;
        int i280 = (i278 | i279) & i279;
        int i281 = i277 & i280;
        int i282 = (i277 | i280) & (~i281);
        int i283 = -(-(((i282 ^ i281) | (i282 & i281)) * (-575)));
        int i284 = ((i275 | i283) << 1) - (i283 ^ i275);
        int i285 = i266 & currentTimeMillis7;
        int i286 = (currentTimeMillis7 | i266) & (~i285);
        int i287 = (i286 ^ i285) | (i286 & i285);
        int i288 = ~i287;
        int i289 = (i287 | i288) & i288;
        int i290 = i268 & longPressTimeout;
        int i291 = ((longPressTimeout | i268) & (~i290)) | i290;
        int i292 = ~i291;
        int i293 = (i291 | i292) & i292;
        int i294 = ((~i293) & i289) | ((~i289) & i293);
        int i295 = i293 & i289;
        int i296 = ((i295 ^ i294) | (i295 & i294)) * 575;
        int i297 = i284 ^ i296;
        int i298 = ((i296 & i284) | i297) << 1;
        int i299 = -i297;
        char c4 = (char) (((i298 | i299) << 1) - (i298 ^ i299));
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        c("谼侷췲\ue26a얅狊\ue982\ue4c5롤\uef31䑰\udcb6ԑ\uf772敵텂ꗷ衉彡វ埀鶗掷\uedf3椼ﮇ", "\u0000\u0000\u0000\u0000", "癷픲⎻멣", (((((~threadPriority3) & 20) | (threadPriority3 & (-21))) - (~(-(-((threadPriority3 & 20) << 1))))) - 1) >> 6, c4, objArr24);
        java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr24[0]);
        float length = android.graphics.PointF.length(0.0f, 0.0f);
        int i300 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
        int currentTimeMillis8 = (int) java.lang.System.currentTimeMillis();
        int i301 = i300 * 450;
        int i302 = ((-16856000) & i301) + (i301 | (-16856000));
        int i303 = ~i300;
        int i304 = ~(37625 | i303);
        int i305 = i300 ^ (-37626);
        int i306 = i300 & (-37626);
        int i307 = (i305 ^ i306) | (i306 & i305);
        int i308 = i307 ^ currentTimeMillis8;
        int i309 = i307 & currentTimeMillis8;
        int i310 = ~((i309 ^ i308) | (i309 & i308));
        int i311 = ((i304 ^ i310) | (i304 & i310)) * 449;
        int i312 = (i302 ^ i311) + ((i302 & i311) << 1);
        int i313 = 37625 ^ i303;
        int i314 = i303 & 37625;
        int i315 = -(-((~(i313 | i314)) * (-1347)));
        int i316 = i312 & i315;
        int i317 = (i315 | i312) & (~i316);
        int i318 = i316 << 1;
        int i319 = ((i317 | i318) << 1) - (i317 ^ i318);
        int i320 = ~currentTimeMillis8;
        int i321 = i320 & (-37626);
        int i322 = (i320 | (-37626)) & (~i321);
        int i323 = (i322 ^ i321) | (i322 & i321);
        int i324 = i323 & i300;
        int i325 = ((~(((i300 | i323) & (~i324)) | i324)) | (~((i314 & i313) | (i314 ^ i313)))) * 449;
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        c("菎瑇诞㑔꒥즗隝쒃쫌ṫ\udb34啣\udd52觗猉︥잓롪", "\u0000\u0000\u0000\u0000", "툀浜異箒", (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)), (char) ((i319 ^ i325) + ((i325 & i319) << 1)), objArr25);
        context = (android.content.Context) cls9.getMethod((java.lang.String) objArr25[0], new java.lang.Class[0]).invoke(null, null);
        if (context != null) {
            int i326 = SdkCoreAlternateContactlessPaymentDataImpl;
            int i327 = (i326 & (-118)) | ((~i326) & 117);
            int i328 = -(-((i326 & 117) << 1));
            int i329 = (i327 & i328) + (i328 | i327);
            IccPrivateKeyCrtComponentsJson = i329 % 128;
            if (i329 % 2 != 0) {
                context.getApplicationContext();
                throw null;
            }
            context = context.getApplicationContext();
            int i330 = IccPrivateKeyCrtComponentsJson;
            SdkCoreAlternateContactlessPaymentDataImpl = ((i330 & 99) + (i330 | 99)) % 128;
        }
        if (str != null) {
            int i331 = IccPrivateKeyCrtComponentsJson;
            int i332 = i331 ^ 53;
            int i333 = (i331 & 53) << 1;
            int i334 = ((i332 | i333) << 1) - (i333 ^ i332);
            SdkCoreAlternateContactlessPaymentDataImpl = i334 % 128;
            if (i334 % 2 == 0) {
                throw null;
            }
            i = str.length();
            int i335 = IccPrivateKeyCrtComponentsJson;
            SdkCoreAlternateContactlessPaymentDataImpl = (((i335 ^ 91) - (~((i335 & 91) << 1))) - 1) % 128;
        } else {
            int i336 = SdkCoreAlternateContactlessPaymentDataImpl;
            int i337 = i336 ^ 77;
            int i338 = -(-((i336 & 77) << 1));
            IccPrivateKeyCrtComponentsJson = ((i337 & i338) + (i338 | i337)) % 128;
            i = 0;
        }
        int i339 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i340 = ((i339 | 113) << 1) - (i339 ^ 113);
        IccPrivateKeyCrtComponentsJson = i340 % 128;
        if (i340 % 2 != 0) {
            i2 = 3;
            int i341 = 2 / 3;
        } else {
            i2 = 3;
        }
    }

    private static void c(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10 + 99;
        $11 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            int i3 = $10 + 3;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr2 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 71, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1180, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a((byte) 0, (short) 0, (byte) 0, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 3443, (char) (3831 - android.graphics.Color.red(0)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(25 - android.view.MotionEvent.axisFromString(""), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1864, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 41775));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a((byte) 0, (short) 3, (byte) 0, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 28, 3133 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                    byte length4 = (byte) $$g.length;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((byte) 0, length4, (byte) (length4 - 4), objArr8);
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((charArray2[getwalletdata.writeReplace] ^ cArr3[intValue2]) ^ (valueOf ^ 1263759066225628708L)) ^ ((int) (DigitizedCardProfile ^ 1263759066225628708L))) ^ ((char) (writeReplace ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                $11 = ($10 + 11) % 128;
                obj = null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 115;
        int i3 = (i | 115) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 != 0) {
            android.content.SharedPreferences sharedPreferences = ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
            com.payair.hce.setLeft.values(new java.lang.Object[]{"encryptedCvv", sharedPreferences}, 589791992, -589791985, (int) java.lang.System.currentTimeMillis());
        } else {
            android.content.SharedPreferences sharedPreferences2 = ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "");
            com.payair.hce.setLeft.values(new java.lang.Object[]{"encryptedCvv", sharedPreferences2}, 589791992, -589791985, (int) java.lang.System.currentTimeMillis());
        }
        int i6 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i7 = i6 & 29;
        int i8 = (((i6 | 29) & (~i7)) - (~(i7 << 1))) - 1;
        IccPrivateKeyCrtComponentsJson = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static void e(int[] iArr, boolean z, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        int length;
        char[] cArr;
        int i2;
        java.lang.String str2 = str;
        int i3 = $11 + 93;
        $10 = i3 % 128;
        byte[] bArr = str2;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        char c = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = AlternateContactlessPaymentDataJson;
        long j = 0;
        if (cArr2 != null) {
            int i8 = $10 + 41;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            int i9 = i2;
            while (i9 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c] = java.lang.Integer.valueOf(cArr2[i9]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.os.SystemClock.elapsedRealtimeNanos() > j ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), 2808 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a((byte) 0, (short) 7, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i9++;
                    c = 0;
                    j = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr2 != null) {
            char[] cArr4 = new char[i5];
            getaccounttype.writeReplace = 0;
            char c2 = 0;
            while (getaccounttype.writeReplace < i5) {
                int i10 = $10 + 85;
                $11 = i10 % 128;
                if (i10 % 2 != 0 ? bArr2[getaccounttype.writeReplace] != 1 : bArr2[getaccounttype.writeReplace] != 0) {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.KeyEvent.getDeadChar(0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2880, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a((byte) 0, (short) 9, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj2);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i12 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.view.KeyEvent.keyCodeFromString("") + 2836, (char) android.view.View.combineMeasuredStates(0, 0));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        a((byte) 0, (short) 5, (byte) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 34, (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            $11 = ($10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            char[] cArr5 = new char[i5];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i13 = i5 - i7;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i13, i7);
            java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i13);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                cArr6[getaccounttype.writeReplace] = cArr3[(i5 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i14 = $11 + 55;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                getaccounttype.writeReplace = 1;
            } else {
                getaccounttype.writeReplace = 0;
            }
            while (getaccounttype.writeReplace < i5) {
                $10 = ($11 + 3) % 128;
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void DigitizedCardProfile() {
        valueOf = 1263759066225628708L;
        DigitizedCardProfile = -804334044;
        writeReplace = (char) 47684;
    }

    static void values() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 107;
        IccPrivateKeyCrtComponentsJson = i % 128;
        int i2 = i % 2;
        AlternateContactlessPaymentDataJson = new char[]{16733, 16615, 16623, 16593, 16618, 16623, 16578, 16677, 16586, 16618, 16594, 16593, 16618, 16623, 16594, 16693, 16690, 16599, 16593, 16621, 16592, 16594, 16596};
        if (i2 != 0) {
            throw null;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        DigitizedCardProfile();
        values();
        INSTANCE = new com.payair.hce.setLayoutMode();
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 51) % 128;
    }

    static void init$2() {
        $$g = new byte[]{63, 105, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.SUB};
        $$h = 49;
    }

    public static void AlternateContactlessPaymentDataJson() {
        values(new java.lang.Object[0], -1111619702, 1111619703, (int) java.lang.System.currentTimeMillis());
    }

    static void init$1() {
        $$d = new byte[]{57, 59, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 75, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, 69, -14, com.google.common.base.Ascii.SI, -40, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, -10, 6, -1, -32, com.google.common.base.Ascii.RS, -17, 13, 5, -10, com.google.common.base.Ascii.VT, -11, 6, -1, -35, -19, -8, 9, -3, -18, 32, 37, -2, 2, com.google.common.base.Ascii.VT, -11, 17, -21, -1, -33, com.google.common.base.Ascii.RS, 17, -14, -20, 34, -3, -9, 3, 3, -7, 43, 8, -15, 13, -4, -13, 19, -15, -34, 44, -1, 6, -19, 2, 17, -8, -7, 14, 0, -35, 17, com.google.common.base.Ascii.CAN, -12, -8, 9, 6, -48, com.google.common.base.Ascii.GS, 19, -19, -23, 41, -4, -1, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.SI, -13, -4, 19, -15, -34, 44, -1, -8, 3, -2, 14, -3, -17, 19, -11, 6, -1, -43, 44, -1, 6, -15, 19, -4, 37, -2, 2, com.google.common.base.Ascii.VT, -11, 17, -21, -1, -33, com.google.common.base.Ascii.RS, 17, -14, -20, 34, -3, -9, 3, 3, -7};
        $$e = 34;
    }

    public static void DigitizedCardProfile(java.lang.String p0) {
        values(new java.lang.Object[]{p0}, 82619533, -82619533, (int) java.lang.System.currentTimeMillis());
    }

    static void init$0() {
        $$a = new byte[]{70, 56, kotlin.io.encoding.Base64.padSymbol, 63, -35, 4, 0, -9, 13, -15, com.google.common.base.Ascii.ETB, 3, 35, -28, -15, 16, com.google.common.base.Ascii.SYN, -32, 5, com.google.common.base.Ascii.VT, -1, -1, 9, com.google.common.base.Ascii.ETB, -9, -7, 18, -12};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE;
    }
}
