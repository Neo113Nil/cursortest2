package com.payair.hce;

/* loaded from: classes10.dex */
public class setCiacDecline {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int getAid;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "remotePaymentData")
    public com.payair.hce.setAid DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "contactlessPaymentData")
    public com.payair.hce.setDsrpUmdSingleUseKey valueOf;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardRiskManagementData")
    public com.payair.hce.setDsrpUmdSessionKey values;

    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = i * 34;
        int i4 = (s * 653) + 65;
        int i5 = 38 - (i2 * 34);
        char[] cArr = new char[35 - i3];
        int i6 = 34 - i3;
        int i7 = -1;
        if (bArr == null) {
            i5++;
            i4 = (i4 + (-i6)) - 2;
        }
        while (true) {
            i7++;
            cArr[i7] = (char) i4;
            if (i7 == i6) {
                objArr[0] = new java.lang.String(cArr);
                return;
            } else {
                i5++;
                i4 = (i4 + (-bArr[i5])) - 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 115 - (s * 2);
        int i4 = b * 2;
        int i5 = i + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            i3 = i4;
            int i6 = i5;
            int i7 = 0;
            i3 += i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i5 + 1;
            int i9 = i2 + 1;
            i6 = i8;
            i5 = bArr[i8];
            i7 = i9;
            i3 += i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        $10 = ($11 + 117) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(writeReplace)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.text.TextUtils.indexOf("", "", 0) + 2073, (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((short) 0, (byte) 0, -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 53, 3543 - android.graphics.Color.alpha(0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $11 = ($10 + 125) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
            int i5 = $11 + 9;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 3;
            }
        }
        if (z) {
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                int i7 = $10 + 101;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[i3 << digitizedCardJson11.DigitizedCardProfile];
                    java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 53, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 3544, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } else {
                    cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                    java.lang.Object[] objArr6 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 53, 3543 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                }
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        AlternateContactlessPaymentDataJson = 0;
        getAid = 1;
        writeReplace = 1889207101;
    }

    static void init$1() {
        $$d = new byte[]{73, 117, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 43};
        $$e = 148;
    }

    static void init$0() {
        $$a = new byte[]{125, 17, -56, 0, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:38|39|(2:41|(2:85|86))(4:91|92|93|(10:95|44|45|(1:47)(5:55|56|57|58|(2:60|(1:62)(5:63|64|65|66|(6:69|70|(1:72)|73|74|75))))|48|49|(1:51)|52|53|54)(1:96))|43|44|45|(0)(0)|48|49|(0)|52|53|54) */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0307 A[Catch: all -> 0x08b7, TRY_ENTER, TryCatch #4 {all -> 0x08b7, blocks: (B:23:0x0307, B:25:0x0316, B:26:0x0353, B:30:0x03f4, B:32:0x0443, B:33:0x0497, B:70:0x0731, B:72:0x077b, B:73:0x07ce, B:49:0x0807, B:51:0x0854, B:52:0x08a3, B:103:0x04c7, B:105:0x0501, B:106:0x0555, B:135:0x025d, B:137:0x0294, B:138:0x02e4, B:3:0x0018, B:5:0x0077, B:10:0x00c1, B:17:0x016d, B:111:0x0175, B:113:0x017b, B:114:0x017c, B:7:0x017d, B:116:0x0181, B:122:0x0236, B:125:0x023f, B:127:0x0245, B:128:0x0246), top: B:2:0x0018, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0854 A[Catch: all -> 0x08b7, TryCatch #4 {all -> 0x08b7, blocks: (B:23:0x0307, B:25:0x0316, B:26:0x0353, B:30:0x03f4, B:32:0x0443, B:33:0x0497, B:70:0x0731, B:72:0x077b, B:73:0x07ce, B:49:0x0807, B:51:0x0854, B:52:0x08a3, B:103:0x04c7, B:105:0x0501, B:106:0x0555, B:135:0x025d, B:137:0x0294, B:138:0x02e4, B:3:0x0018, B:5:0x0077, B:10:0x00c1, B:17:0x016d, B:111:0x0175, B:113:0x017b, B:114:0x017c, B:7:0x017d, B:116:0x0181, B:122:0x0236, B:125:0x023f, B:127:0x0245, B:128:0x0246), top: B:2:0x0018, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0654 A[Catch: Exception -> 0x07f2, TRY_LEAVE, TryCatch #8 {Exception -> 0x07f2, blocks: (B:45:0x061a, B:55:0x0654, B:58:0x0690, B:60:0x0698, B:63:0x06d2, B:66:0x0710, B:78:0x07e3, B:79:0x07e9, B:82:0x07eb, B:83:0x07f1, B:65:0x06dc, B:57:0x065e), top: B:44:0x061a, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        java.lang.String str;
        java.lang.Object obj;
        java.io.File file;
        java.io.File file2;
        java.lang.String[] strArr;
        int i3;
        getAid = (AlternateContactlessPaymentDataJson + 109) % 128;
        try {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(false, "\u000e\uffff\ufffe\u0003\r\uffde\uffff￼\u000f\u0001\u0001\uffff\f\uffdd\t\b\b\uffff�", android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 19, objArr3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(true, "\r\u0002\ufffa\u0010\u000b\ufffe\u0000\u0000\u000e\ufffb\ufffe\uffdd\u000b\b\uffdf\u0000\u0007\u0002", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 4 - android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, objArr4);
                strArr = new java.lang.String[]{((java.lang.String) objArr3[0]).intern(), ((java.lang.String) objArr4[0]).intern()};
            } catch (java.lang.Exception unused) {
                objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 2}, null, new int[1]};
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-216515941) | i)) | 115968) * (-566)) + 1070566872 + ((~((-216399973) | i)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                    byte[] bArr = $$a;
                    byte b = bArr[3];
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b, b, (byte) (-bArr[14]), objArr6);
                    obj2 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).intValue();
            }
            try {
                for (i3 = 0; i3 < 2; i3++) {
                    java.lang.String str2 = strArr[i3];
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(true, "\u0001\u0007\u0015\u0002\u0005￤ￎ\u0013\u000fￎ\u0004\t\u000f\u0012\u0004\u000e", android.view.KeyEvent.getDeadChar(0, 0) + 188, android.graphics.Color.red(0) + 1, 16 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr7);
                    java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                    if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                        AlternateContactlessPaymentDataJson = (getAid + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                        objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                        try {
                            java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~(323552883 | r3)) | (-1004404600)) * (-160)) - 1014870792) + (((~((~i) | (-681376102))) | 323552883) * 160))};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 50, android.view.View.combineMeasuredStates(0, 0) + 2713, (char) android.text.TextUtils.getOffsetAfter("", 0));
                                byte[] bArr2 = $$a;
                                byte b2 = bArr2[3];
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                b(b2, b2, (byte) (-bArr2[14]), objArr9);
                                obj3 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr8)).intValue();
                            if (i == ((int[]) objArr[1])[0]) {
                                AlternateContactlessPaymentDataJson = (getAid + 79) % 128;
                                return objArr;
                            }
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                            if (obj4 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 28, android.graphics.Color.alpha(0) + 2391, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 29420));
                                byte b3 = (byte) (-$$a[14]);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                b(b3, b3, r4[3], objArr10);
                                obj4 = cls4.getMethod((java.lang.String) objArr10[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                            long j = ~i;
                            long j2 = ((-782) * longValue) + 134747434752L + ((~longValue) * (-783)) + ((~(j | (-171871729) | longValue)) * (-783)) + (((~(longValue | j)) | (-171871729)) * 783) + 110212368;
                            int i4 = (int) (j2 >> 32);
                            int i5 = ~i;
                            if (((i4 & ((((~((-108804807) | i5)) | 5251074 | (~(1328421604 | i5))) * (-397)) + 495985674 + ((1230118946 | i) * 397))) | (((int) j2) & ((((~((-1342177322) | i5)) | (~(i | (-2892353)))) * 988) + 856640049 + (((~((-2892353) | i5)) | (~(92156736 | i)) | (-1434334058)) * 988)))) == 1) {
                                AlternateContactlessPaymentDataJson = (getAid + 41) % 128;
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                                int i6 = ~(536373611 | i5);
                                java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~(468555373 | i5)) | 68184322) * (-1188)) - 809727926) + (((~((-468555374) | i)) | 68184322 | i6) * 594) + ((i6 | (~((-468555374) | i5)) | 366084) * 594))};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj5 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetAfter("", 0), 2714 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                    byte[] bArr3 = $$a;
                                    byte b4 = bArr3[3];
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    b(b4, b4, (byte) (-bArr3[14]), objArr12);
                                    obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                }
                                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                            } else {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                int i7 = ~(i | (-42247789));
                                java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-42247789) | i5)) | 42247680) * (-245)) - 1162956584) + (i7 * (-245)) + ((i7 | 962681196) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj6 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                    byte[] bArr4 = $$a;
                                    byte b5 = bArr4[3];
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b(b5, b5, (byte) (-bArr4[14]), objArr14);
                                    obj6 = cls6.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                }
                                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr13)).intValue();
                                AlternateContactlessPaymentDataJson = (getAid + 85) % 128;
                            }
                            if (i != ((int[]) objArr2[1])[0]) {
                                return objArr2;
                            }
                            try {
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a(true, "\u0016\u0010ￌ\u000f\u0002\u0000\ufffe\u000f\u0011￼\u0011\u000b\u0002\u000f\u000f\u0012\u0000ￌ\u0004\u000b\u0006\u0000\ufffe\u000f\u0011ￌ\u0004\u0012\uffff\u0002\u0001ￌ\t\u0002\u000b\u000f\u0002\bￌ\u0010", 191 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 3 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, objArr15);
                                file2 = new java.io.File(((java.lang.String) objArr15[0]).intern());
                            } catch (java.lang.Exception unused2) {
                            }
                            if (file2.canRead()) {
                                java.io.FileReader fileReader = new java.io.FileReader(file2);
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                try {
                                    str = bufferedReader.readLine();
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    a(false, "\u0000\u0001\uffff", 203 - android.view.KeyEvent.getDeadChar(0, 0), 1 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 3 - android.graphics.Color.argb(0, 0, 0, 0), objArr16);
                                    if (!str.equals(((java.lang.String) objArr16[0]).intern())) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        a(false, "\t\u0003\u0010\f\u0003\nￍ\u0004\u0012\u0010\uffff\u0001\u0003�\u0003\f\uffff\u0000\n\u0003\u0002ￍ\u000e\u0010\r\u0001ￍ\u0011\u0017\u0011ￍ", 190 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 21, 31 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr17);
                                        file = new java.io.File(((java.lang.String) objArr17[0]).intern());
                                        if (!file.canRead()) {
                                            try {
                                                java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                a(true, "\u0000", 141 - android.text.TextUtils.getOffsetAfter("", 0), android.graphics.Color.green(0) + 1, -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr18);
                                                if (readLine.equals(((java.lang.String) objArr18[0]).intern())) {
                                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                    a(true, "ￍ\u0005\f\u0007\u0001\uffff\u0010\u0012ￍ\u0005\u0013\u0000\u0003\u0002ￍ\n\u0003\f\u0010\u0003\tￍ\u0011\u0017\u0011ￍ\f\r�\u0005\f\u0007\u0001\uffff\u0010\u0012", android.widget.ExpandableListView.getPackedPositionType(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, android.graphics.Color.rgb(0, 0, 0) + 16777242, android.text.TextUtils.getCapsMode("", 0, 0) + 36, objArr19);
                                                    java.io.File file3 = new java.io.File(((java.lang.String) objArr19[0]).intern());
                                                    if (file3.canRead()) {
                                                        try {
                                                            java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                            a(true, "\u0000", 141 - android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1, objArr20);
                                                            if (readLine2.equals(((java.lang.String) objArr20[0]).intern()) && str != null) {
                                                                java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i ^ 20}, str, new int[1]};
                                                                java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((-47822725) | i) * (-627)) - 264790560) + (((~((-956713003) | i)) | 48215982) * (-627)) + (((~(i | 48215982)) | (~(i5 | 956713002))) * 627))};
                                                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj7 == null) {
                                                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 50, 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                                    byte[] bArr5 = $$a;
                                                                    byte b6 = bArr5[3];
                                                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                    b(b6, b6, (byte) (-bArr5[14]), objArr23);
                                                                    obj7 = cls7.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                }
                                                                ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
                                                                return objArr21;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        java.lang.Object[] objArr24 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                        java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~(i | 59408670)) | 1013973217) | (~((-9044233) | i5))) * 886) - 1677881642) + (((~((-59408671) | i5)) | 1064337655) * (-1772)) + ((~(i5 | 1064337655)) * 886))};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('b' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2712 - android.view.MotionEvent.axisFromString(""), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                            byte[] bArr6 = $$a;
                                            byte b7 = bArr6[3];
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            b(b7, b7, (byte) (-bArr6[14]), objArr26);
                                            obj = cls8.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                        }
                                        ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr25)).intValue();
                                        return objArr24;
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                } finally {
                                }
                            } else {
                                int i8 = getAid + 55;
                                AlternateContactlessPaymentDataJson = i8 % 128;
                                if (i8 % 2 != 0) {
                                    throw null;
                                }
                            }
                            str = null;
                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                            a(false, "\t\u0003\u0010\f\u0003\nￍ\u0004\u0012\u0010\uffff\u0001\u0003�\u0003\f\uffff\u0000\n\u0003\u0002ￍ\u000e\u0010\r\u0001ￍ\u0011\u0017\u0011ￍ", 190 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 21, 31 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr172);
                            file = new java.io.File(((java.lang.String) objArr172[0]).intern());
                            if (!file.canRead()) {
                            }
                            java.lang.Object[] objArr242 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr252 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~(i | 59408670)) | 1013973217) | (~((-9044233) | i5))) * 886) - 1677881642) + (((~((-59408671) | i5)) | 1064337655) * (-1772)) + ((~(i5 | 1064337655)) * 886))};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj == null) {
                            }
                            ((int[]) objArr242[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr252)).intValue();
                            return objArr242;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                }
                java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((~((-9565185) | i)) * 623) + 797795810 + (((~i) | 50596758) * (-623)) + (((~((-481948706) | i)) | 9565184 | (~(522980279 | i))) * 623))};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj8 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50, android.text.TextUtils.indexOf("", "") + 2713, (char) (android.os.Process.getGidForName("") + 1));
                    byte[] bArr7 = $$a;
                    byte b8 = bArr7[3];
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    b(b8, b8, (byte) (-bArr7[14]), objArr28);
                    obj8 = cls9.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr27)).intValue();
                if (i == ((int[]) objArr[1])[0]) {
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }
}
