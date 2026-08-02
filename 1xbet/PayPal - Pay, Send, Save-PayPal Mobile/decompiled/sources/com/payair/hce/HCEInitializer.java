package com.payair.hce;

/* loaded from: classes4.dex */
public class HCEInitializer {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static com.payair.hce.VisaRepersoInitializer AlternateContactlessPaymentDataJson;
    private static boolean DigitizedCardProfile;
    private static boolean IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static char[] getAid;
    private static int getCvrMaskAnd;
    private static int getPaymentFci;
    private static long getProfileVersion;
    private static boolean valueOf;
    private static boolean values;
    private static boolean writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 119 - i;
        int i4 = s + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[b + 6];
        int i5 = b + 5;
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i3 = i5;
            i3 = (i3 + i6) - 2;
            bArr2[i2] = (byte) i3;
            i4++;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i4];
            i3 = (i3 + i6) - 2;
            bArr2[i2] = (byte) i3;
            i4++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i4++;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$d;
        int i4 = b + 6;
        int i5 = i + 65;
        int i6 = 463 - s;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i5 = i4;
            i5 = (i5 + (-i7)) - 2;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6++;
            i7 = bArr[i6];
            i5 = (i5 + (-i7)) - 2;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2 = s2 + 112;
        int i3 = s * 2;
        byte[] bArr = $$g;
        int i4 = s3 + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i5;
            i = 0;
            i2 += -i6;
            i4++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i4];
            i2 += -i6;
            i4++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            i4++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getCvrMaskAnd = 0;
        getPaymentFci = 1;
        writeReplace();
        valueOf();
        values();
        AlternateContactlessPaymentDataJson = null;
        DigitizedCardProfile = false;
        writeReplace = false;
        valueOf = false;
        values = false;
        getPaymentFci = (getCvrMaskAnd + 85) % 128;
    }

    private HCEInitializer() {
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 57) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            $11 = ($10 + 115) % 128;
            int i2 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1890, (char) (3599 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    f((short) 0, (short) 1, (short) -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (getProfileVersion ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 64, android.text.TextUtils.getOffsetAfter("", 0) + 1443, (char) (29681 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    f((short) 0, (short) 0, (short) -1, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr3 = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 64, 1443 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (29682 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                f((short) 0, (short) 0, (short) -1, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        $10 = ($11 + 17) % 128;
        objArr[0] = str2;
    }

    public static void initialize(android.content.Context context, com.payair.hce.HCEEventListener hCEEventListener, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, com.payair.hce.AuthenticationEnum authenticationEnum, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j, java.lang.Integer num, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11) throws com.payair.hce.exceptions.DeviceNotSecureException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str3);
        sb.append("/wallet/rest%s/v");
        sb.append(i);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str2);
        sb2.append(obj);
        java.lang.String obj2 = sb2.toString();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(127 - android.graphics.Color.alpha(0), null, null, "\u0083\u0082\u0081", objArr);
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setMotionEventSplittingEnabled.DigitizedCardProfile(new java.lang.Object[]{obj2, ((java.lang.String) objArr[0]).intern()}, -1924051175, 1924051175, (int) java.lang.System.currentTimeMillis())).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) com.payair.hce.setMotionEventSplittingEnabled.DigitizedCardProfile(new java.lang.Object[]{str4, "CAPITAL_LETTERS"}, -1924051175, 1924051175, (int) java.lang.System.currentTimeMillis())).booleanValue();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str5);
        sb3.append(str6);
        boolean booleanValue3 = ((java.lang.Boolean) com.payair.hce.setMotionEventSplittingEnabled.DigitizedCardProfile(new java.lang.Object[]{sb3.toString(), "VERSION"}, -1924051175, 1924051175, (int) java.lang.System.currentTimeMillis())).booleanValue();
        if (booleanValue && booleanValue2) {
            int i2 = getPaymentFci;
            getCvrMaskAnd = (i2 + 93) % 128;
            if (booleanValue3) {
                getCvrMaskAnd = (i2 + 81) % 128;
                writeReplace = true;
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str9}, 1998615164, -1998615102, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, -880917361, 880917418, i);
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str}, 1088836549, -1088836461, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str3}, -1579837371, 1579837429, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str4}, -1139219779, 1139219848, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Long.valueOf(j)}, 1217778720, -1217778633, (int) java.lang.System.currentTimeMillis());
                initialize(context, hCEEventListener, str2, obj, authenticationEnum, num, str7, str8, false, str9, str10, str11);
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str5}, 828291299, -828291240, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str6}, -2130370011, 2130370063, (int) java.lang.System.currentTimeMillis());
                return;
            }
        }
        if (!booleanValue) {
            throw new java.lang.IllegalArgumentException("Invalid URL (serverUrl, walletString or endPoint)");
        }
        if (!booleanValue2) {
            throw new java.lang.IllegalArgumentException("Invalid BankdApplicationID");
        }
        if (!booleanValue3) {
            throw new java.lang.IllegalArgumentException("Invalid version (appVersion or sdkVersion)");
        }
        int i3 = getPaymentFci + 41;
        getCvrMaskAnd = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static void b(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 119) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i2];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i2) {
            $11 = ($10 + 113) % 128;
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(SdkCoreBusinessLogicModuleImpl)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777173) - android.graphics.Color.rgb(0, 0, 0), 2073 - android.view.KeyEvent.keyCodeFromString(""), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    f((short) 0, (short) 3, (short) -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 54, 3543 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
            char[] cArr4 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i2);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr5 = new char[i2];
            digitizedCardJson11.DigitizedCardProfile = 0;
            $10 = ($11 + 119) % 128;
            while (digitizedCardJson11.DigitizedCardProfile < i2) {
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i2 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 53, 3543 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public static void initialize(android.content.Context context, com.payair.hce.HCEEventListener hCEEventListener, java.lang.String str, java.lang.String str2, com.payair.hce.AuthenticationEnum authenticationEnum, java.lang.Integer num, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, java.lang.String str6, java.lang.String str7) throws com.payair.hce.exceptions.DeviceNotSecureException {
        java.lang.String str8;
        boolean z2;
        try {
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - android.view.KeyEvent.normalizeMetaState(0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 5051, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("AlternateContactlessPaymentDataJson", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
            }
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Long.valueOf(java.lang.System.currentTimeMillis())}, -67669630, 67669715, (int) java.lang.System.currentTimeMillis());
            if (str2 == null) {
                getCvrMaskAnd = (getPaymentFci + 105) % 128;
                str8 = "";
            } else {
                str8 = str2;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(str8);
            java.lang.String obj2 = sb.toString();
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str5}, 1998615164, -1998615102, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{context.getApplicationContext()}, -1230033843, 1230033934, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{"", "", num, str3, str4}, 1100982605, -1100982544, (int) java.lang.System.currentTimeMillis());
            if (authenticationEnum == com.payair.hce.AuthenticationEnum.JWT) {
                getCvrMaskAnd = (getPaymentFci + 77) % 128;
                z2 = true;
            } else {
                z2 = false;
            }
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.valueOf(z2)}, 1641364155, -1641364153, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[]{obj2}, -985119571, 985119574, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[]{str}, -1872524796, 1872524802, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.valueOf(z)}, 1084951758, -1084951665, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str6}, -1514441607, 1514441684, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str7}, -1204110296, 1204110369, (int) java.lang.System.currentTimeMillis());
            if (!((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[0], -1435836338, 1435836351, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                com.payair.hce.setLeft.values(new java.lang.Object[0], -792000361, 792000375, (int) java.lang.System.currentTimeMillis());
            }
            android.content.SharedPreferences sharedPreferences = ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0);
            if (((java.lang.Integer) com.payair.hce.setLeft.values(new java.lang.Object[]{"SHARED_PREFERENCES_VERSION", 0, sharedPreferences}, 654732084, -654732078, 0)).intValue() <= 0) {
                com.payair.hce.setLeft.values(new java.lang.Object[0], 478037310, -478037299, (int) java.lang.System.currentTimeMillis());
            }
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{hCEEventListener}, -1148933970, 1148933995, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setLeft.values(new java.lang.Object[]{"INITIALISATION_VALUES", new com.payair.hce.IccPrivateKeyCrtComponentsJson().values(new com.payair.hce.setFilterTouchesWhenObscured(str, str8, authenticationEnum, num.intValue(), str3, str4, z, str5, str6, str7)), sharedPreferences}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
            if (z) {
                int i = getPaymentFci + 115;
                getCvrMaskAnd = i % 128;
                if (i % 2 == 0) {
                    com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{""}, 828291299, -828291240, (int) java.lang.System.currentTimeMillis());
                    com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{""}, -2130370011, 2130370063, (int) java.lang.System.currentTimeMillis());
                } else {
                    com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{""}, 828291299, -828291240, (int) java.lang.System.currentTimeMillis());
                    com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{""}, -2130370011, 2130370063, (int) java.lang.System.currentTimeMillis());
                    throw new java.lang.ArithmeticException();
                }
            }
            int intValue = num.intValue();
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(intValue)}, -2060111905, 2060111980, intValue);
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str3}, 590213496, -590213490, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str4}, -1833377165, 1833377249, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setDrawingCacheEnabled.values(new java.lang.Object[]{authenticationEnum}, 1471642044, -1471642041, (int) java.lang.System.currentTimeMillis());
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, null, "\u0083\u0082\u0081", objArr);
            if (!((java.lang.Boolean) com.payair.hce.setMotionEventSplittingEnabled.DigitizedCardProfile(new java.lang.Object[]{obj2, ((java.lang.String) objArr[0]).intern()}, -1924051175, 1924051175, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                throw new java.lang.IllegalArgumentException("Invalid URL (serverUrl or endPoint)");
            }
            com.payair.hce.setOnApplyWindowInsetsListener setonapplywindowinsetslistener = new com.payair.hce.setOnApplyWindowInsetsListener(context);
            if (!((java.lang.Boolean) com.payair.hce.setOnApplyWindowInsetsListener.valueOf(new java.lang.Object[]{setonapplywindowinsetslistener}, 806546356, -806546355, java.lang.System.identityHashCode(setonapplywindowinsetslistener))).booleanValue()) {
                throw new com.payair.hce.exceptions.DeviceNotSecureException();
            }
            com.payair.hce.setTranslationX.valueOf(new java.lang.Object[]{0L}, -325243520, 325243521, (int) java.lang.System.currentTimeMillis());
            context.registerReceiver(new com.payair.hce.setStateListAnimator(), new android.content.IntentFilter("android.intent.action.USER_PRESENT"));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            $11 = ($10 + 81) % 128;
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            int i2 = $11 + 29;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = getAid;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > j ? 1 : (android.os.SystemClock.uptimeMillis() == j ? 0 : -1)) + 45, android.graphics.Color.argb(0, 0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr4[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(RecordsJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getTouchSlop() >> 8) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (IccPrivateKeyCrtComponentsJson) {
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 43, 1630 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    f((short) 0, (short) 6, (short) -1, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!SdkCoreAlternateContactlessPaymentDataImpl) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr6[getumdgeneration.valueOf] = (char) (cArr3[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        getumdgeneration.values = cArr2.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            int i4 = $11 + 109;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[getumdgeneration.values >>> getumdgeneration.valueOf] >>> i] * intValue);
                java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('[' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1629 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    f((short) 0, (short) 6, (short) -1, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            } else {
                cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                java.lang.Object[] objArr8 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.KeyEvent.normalizeMetaState(0), 1629 - android.graphics.Color.alpha(0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    f((short) 0, (short) 6, (short) -1, objArr9);
                    obj5 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr8);
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    public static void setUpMCBP(boolean z) throws com.payair.hce.exceptions.DeviceNotSecureException {
        try {
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 38, 5051 - android.view.View.getDefaultSize(0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("AlternateContactlessPaymentDataJson", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
            }
            com.payair.hce.setOnApplyWindowInsetsListener setonapplywindowinsetslistener = new com.payair.hce.setOnApplyWindowInsetsListener((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis()));
            if (!((java.lang.Boolean) com.payair.hce.setOnApplyWindowInsetsListener.valueOf(new java.lang.Object[]{setonapplywindowinsetslistener}, 806546356, -806546355, java.lang.System.identityHashCode(setonapplywindowinsetslistener))).booleanValue()) {
                throw new com.payair.hce.exceptions.DeviceNotSecureException();
            }
            AlternateContactlessPaymentDataJson(z);
            if (((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -815600083, 815600138, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                int i = getCvrMaskAnd + 63;
                getPaymentFci = i % 128;
                if (i % 2 != 0) {
                    com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 2011275265, -2011275228, (int) java.lang.System.currentTimeMillis());
                    ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).sdkTooOldNeedReset();
                } else {
                    com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 2011275265, -2011275228, (int) java.lang.System.currentTimeMillis());
                    ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).sdkTooOldNeedReset();
                    throw null;
                }
            }
            com.payair.hce.HCEPayment.valueOf(new java.lang.Object[]{-1L}, -960893514, 960893514, (int) java.lang.System.currentTimeMillis());
            if (writeReplace) {
                getCvrMaskAnd = (getPaymentFci + 33) % 128;
                com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{((java.lang.String) com.payair.hce.setAutoHandwritingEnabled.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -168115638, 168115638, (int) java.lang.System.currentTimeMillis())).getBytes()}, -1350039527, 1350039535, (int) java.lang.System.currentTimeMillis());
            }
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{((java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1477808687, -1477808679, (int) java.lang.System.currentTimeMillis())).getBytes()}, 2098845371, -2098845360, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setKeyboardNavigationCluster.values(new java.lang.Object[0], -1490299157, 1490299157, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setScreenReaderFocusable.writeReplace(new java.lang.Object[0], 656844064, -656844063, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{((java.lang.String) com.payair.hce.setAutoHandwritingEnabled.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -168115638, 168115638, (int) java.lang.System.currentTimeMillis())).getBytes()}, 1171855214, -1171855197, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{((java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1948978272, 1948978272, (int) java.lang.System.currentTimeMillis())).getBytes()}, 2098845371, -2098845360, (int) java.lang.System.currentTimeMillis());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void AlternateContactlessPaymentDataJson() {
        int i = (getCvrMaskAnd + 87) % 128;
        getPaymentFci = i;
        values = false;
        valueOf = false;
        int i2 = i + 103;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (com.payair.hce.HCEInitializer.values == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void AlternateContactlessPaymentDataJson(boolean z) {
        if (valueOf) {
            getCvrMaskAnd = (getPaymentFci + 19) % 128;
        }
        if (DigitizedCardProfile) {
            AlternateContactlessPaymentDataJson = new com.payair.hce.DemoRemoteCommunicationManager((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis()));
            getPaymentFci = (getCvrMaskAnd + 95) % 128;
        }
        if (z && !values) {
            com.payair.hce.setImportantForAccessibility.values(AlternateContactlessPaymentDataJson);
            valueOf = true;
            values = true;
        } else if (!valueOf) {
            int i = getPaymentFci + 49;
            getCvrMaskAnd = i % 128;
            if (i % 2 != 0) {
                com.payair.hce.setImportantForAccessibility.valueOf();
                valueOf = false;
            } else {
                com.payair.hce.setImportantForAccessibility.valueOf();
                valueOf = true;
            }
        }
        if (DigitizedCardProfile) {
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{((java.lang.String) com.payair.hce.setAutoHandwritingEnabled.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -168115638, 168115638, (int) java.lang.System.currentTimeMillis())).getBytes()}, -1350039527, 1350039535, (int) java.lang.System.currentTimeMillis());
        }
        getCvrMaskAnd = (getPaymentFci + 3) % 128;
    }

    public static void smallInitialization(android.content.Context context, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, com.payair.hce.AuthenticationEnum authenticationEnum, java.lang.String str4) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str3);
        sb.append("/wallet/rest%s/v");
        sb.append(i);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str2);
        sb2.append(obj);
        java.lang.String obj2 = sb2.toString();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, null, "\u0083\u0082\u0081", objArr);
        if (((java.lang.Boolean) com.payair.hce.setMotionEventSplittingEnabled.DigitizedCardProfile(new java.lang.Object[]{obj2, ((java.lang.String) objArr[0]).intern()}, -1924051175, 1924051175, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i2 = getPaymentFci + 63;
            getCvrMaskAnd = i2 % 128;
            if (i2 % 2 == 0) {
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str4}, 1998615164, -1998615102, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, -880917361, 880917418, i);
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str}, 1088836549, -1088836461, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str3}, -1579837371, 1579837429, (int) java.lang.System.currentTimeMillis());
                writeReplace(new java.lang.Object[]{context, str2, obj, authenticationEnum, str4}, 1291547959, -1291547959, (int) java.lang.System.currentTimeMillis());
                return;
            }
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str4}, 1998615164, -1998615102, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, -880917361, 880917418, i);
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str}, 1088836549, -1088836461, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str3}, -1579837371, 1579837429, (int) java.lang.System.currentTimeMillis());
            writeReplace(new java.lang.Object[]{context, str2, obj, authenticationEnum, str4}, 1291547959, -1291547959, (int) java.lang.System.currentTimeMillis());
            throw new java.lang.ArithmeticException();
        }
        throw new java.lang.IllegalArgumentException("Invalid URL (serverUrl, walletString or endPoint)");
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        boolean z = true;
        java.lang.String str = (java.lang.String) objArr[1];
        java.lang.String str2 = (java.lang.String) objArr[2];
        com.payair.hce.AuthenticationEnum authenticationEnum = (com.payair.hce.AuthenticationEnum) objArr[3];
        java.lang.String str3 = (java.lang.String) objArr[4];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        java.lang.String obj = sb.toString();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(127 - android.view.View.MeasureSpec.getMode(0), null, null, "\u0083\u0082\u0081", objArr2);
        if (((java.lang.Boolean) com.payair.hce.setMotionEventSplittingEnabled.DigitizedCardProfile(new java.lang.Object[]{obj, ((java.lang.String) objArr2[0]).intern()}, -1924051175, 1924051175, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i = getCvrMaskAnd + 39;
            getPaymentFci = i % 128;
            if (i % 2 != 0) {
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str3}, 1998615164, -1998615102, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{context}, -1230033843, 1230033934, (int) java.lang.System.currentTimeMillis());
                if (authenticationEnum == com.payair.hce.AuthenticationEnum.JWT) {
                    getCvrMaskAnd = (getPaymentFci + 97) % 128;
                } else {
                    z = false;
                }
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.valueOf(z)}, 1641364155, -1641364153, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[]{str}, -1872524796, 1872524802, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[]{obj}, -985119571, 985119574, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.FALSE}, 1084951758, -1084951665, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setDrawingCacheEnabled.values(new java.lang.Object[]{authenticationEnum}, 1471642044, -1471642041, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1158569000, -1158568967, (int) java.lang.System.currentTimeMillis());
                return null;
            }
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str3}, 1998615164, -1998615102, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{context}, -1230033843, 1230033934, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.AuthenticationEnum authenticationEnum2 = com.payair.hce.AuthenticationEnum.JWT;
            throw null;
        }
        throw new java.lang.IllegalArgumentException("Invalid URL (serverUrl, walletString or endPoint)");
    }

    public static void useDemoMode() {
        int i = (getCvrMaskAnd + 103) % 128;
        getPaymentFci = i;
        DigitizedCardProfile = true;
        getCvrMaskAnd = (i + 99) % 128;
    }

    public static void initContext(android.content.Context context) {
        getPaymentFci = (getCvrMaskAnd + 103) % 128;
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{context.getApplicationContext()}, -1230033843, 1230033934, (int) java.lang.System.currentTimeMillis());
        getCvrMaskAnd = (getPaymentFci + 25) % 128;
    }

    public static void postInitializationCleanup() {
        java.lang.Object[] objArr;
        java.lang.String str;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        java.lang.String str2;
        java.lang.Object[] objArr4;
        java.lang.Long valueOf2;
        java.lang.Class cls;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i;
        java.lang.Object[] objArr5;
        char c;
        java.lang.Object[] objArr6;
        java.lang.Long valueOf3;
        java.lang.Class cls2;
        java.lang.Object obj3;
        java.lang.Object[] objArr7;
        char c2;
        char c3;
        java.lang.Object[] objArr8;
        char c4;
        int i2;
        java.lang.Object[] objArr9;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        b(true, "\u0000\f\t￠\n\u0002\u0011\u0010\u0016\ufff0ￋ\u0010\fￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\b", android.view.KeyEvent.keyCodeFromString("") + 136, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23, 21 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr10);
        java.lang.String str3 = (java.lang.String) objArr10[0];
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        b(false, "\ufffe\ufffe\u0005\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006", 139 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, 1 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr11);
        java.lang.String str4 = (java.lang.String) objArr11[0];
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b(true, "\u0000\uffdeￋ\r\r\ufffeￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\u0001\ufffe\u0002\u000f\u0005\ufff1\u0016\u0011\u0006\u0013\u0006\u0011", android.text.TextUtils.getOffsetAfter("", 0) + 136, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14, objArr12);
        java.lang.String str5 = (java.lang.String) objArr12[0];
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        b(true, "\u0004\u0005\uffff\n\ufff7\ufff9\uffff\u0002\u0006\u0006ￗ\n\u0004\ufffb\b\b\u000b\ufff9", android.view.MotionEvent.axisFromString("") + 144, 18 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 18 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr13);
        java.lang.String str6 = (java.lang.String) objArr13[0];
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        c("郷흇ᾌ䟙踅\uf644㺈暁괍ᕎ嶎藗찇㑋粐ꒉ\ueb25卖鮖쏏ਟ牅몈", 18366 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr14);
        java.lang.String str7 = (java.lang.String) objArr14[0];
        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 667, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 40024));
        byte[] bArr = $$a;
        byte b = bArr[58];
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        d(b, (byte) (b & com.google.common.base.Ascii.GS), 54, objArr15);
        long j = cls3.getField((java.lang.String) objArr15[0]).getLong(null);
        if (j == -1 || j + 1913 < ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
            android.content.Context context = (android.content.Context) java.lang.Class.forName(str5).getMethod(str6, new java.lang.Class[0]).invoke(null, null);
            if (context != null) {
                getCvrMaskAnd = (getPaymentFci + 83) % 128;
                context = context.getApplicationContext();
            }
            try {
                java.lang.Object[] objArr16 = {context, 0, 0, 442106420};
                byte[] bArr2 = $$d;
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                e(bArr2[86], (short) 460, bArr2[236], objArr17);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                e(bArr2[482], (short) 440, bArr2[5], objArr18);
                objArr = (java.lang.Object[]) cls4.getMethod((java.lang.String) objArr18[0], java.lang.Class.forName(str7), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr16);
                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 40, 668 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 40024));
                byte b2 = (byte) (-bArr[23]);
                byte b3 = bArr[14];
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                d(b2, b3, b3, objArr19);
                cls5.getField((java.lang.String) objArr19[0]).set(null, objArr);
                try {
                    try {
                        long longValue = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 666, (char) (android.view.View.combineMeasuredStates(0, 0) + 40024));
                        byte b4 = bArr[58];
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        d(b4, (byte) (b4 & com.google.common.base.Ascii.GS), 54, objArr20);
                        cls6.getField((java.lang.String) objArr20[0]).set(null, java.lang.Long.valueOf(longValue));
                    } catch (java.lang.Exception unused) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        } else {
            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 41, 666 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.graphics.Color.blue(0) + 40024));
            byte b5 = (byte) (-bArr[23]);
            byte b6 = bArr[14];
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            d(b5, b6, b6, objArr21);
            try {
                java.lang.Object[] objArr22 = {cls7.getField((java.lang.String) objArr21[0]).get(null), 442106420, 0};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.KeyEvent.getDeadChar(0, 0) + 4684, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj4);
                }
                objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj4).invoke(null, objArr22);
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        int i3 = ((int[]) objArr[1])[0];
        int i4 = ((int[]) objArr[0])[0];
        if (i4 == i3) {
            java.lang.Object[] objArr23 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[4])[0]), 0};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
            if (obj5 == null) {
                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 33, 4684 - android.view.View.MeasureSpec.getMode(0), (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr23);
            getCvrMaskAnd = (getPaymentFci + 67) % 128;
            str = str7;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.Object[] objArr24 = {objArr};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
            if (obj6 == null) {
                str = str7;
                obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, 4684 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("values", java.lang.Object[].class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj6);
            } else {
                str = str7;
            }
            arrayList.add(((java.lang.reflect.Method) obj6).invoke(null, objArr24));
            java.lang.Object[] objArr25 = {objArr};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.indexOf("", "", 0), android.graphics.Color.red(0) + 4684, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("writeReplace", java.lang.Object[].class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj7);
            }
            arrayList.add(((java.lang.reflect.Method) obj7).invoke(null, objArr25));
            long j2 = i3 ^ i4;
            getCvrMaskAnd = (getPaymentFci + 89) % 128;
            try {
                java.lang.Object[] objArr26 = {java.lang.Long.valueOf(j2 ^ 8593262341250875392L), 2000774810L};
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                e((byte) (-$$d[122]), (short) 406, r3[236], objArr27);
                java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                e(r3[85], (short) 366, r3[17], objArr28);
                cls8.getMethod((java.lang.String) objArr28[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr26);
                java.lang.Object[] objArr29 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[4])[0]), 0};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                if (obj8 == null) {
                    obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.graphics.ImageFormat.getBitsPerPixel(0), 4683 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.indexOf("", ""))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj8);
                }
                ((java.lang.reflect.Method) obj8).invoke(null, objArr29);
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 48, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1581, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
        byte b7 = (byte) (-bArr[23]);
        byte b8 = bArr[14];
        java.lang.Object[] objArr30 = new java.lang.Object[1];
        d(b7, b8, b8, objArr30);
        long j3 = cls9.getField((java.lang.String) objArr30[0]).getLong(null);
        if (j3 == -1 || j3 + 1936 < ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
            android.content.Context context2 = (android.content.Context) java.lang.Class.forName(str5).getMethod(str6, new java.lang.Class[0]).invoke(null, null);
            if (context2 != null) {
                getCvrMaskAnd = (getPaymentFci + 117) % 128;
                context2 = context2.getApplicationContext();
            }
            byte[] bArr3 = $$d;
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            e(bArr3[10], (short) 360, bArr3[236], objArr31);
            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr31[0]);
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            e(bArr3[482], (short) 440, bArr3[5], objArr32);
            java.lang.Object[] objArr33 = (java.lang.Object[]) cls10.getMethod((java.lang.String) objArr32[0], java.lang.Class.forName(str), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context2, 0, 0, -1786018706);
            if (context2 != null) {
                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 47, 1581 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.graphics.Color.blue(0));
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                d(bArr[44], (byte) (-bArr[41]), 51, objArr34);
                cls11.getField((java.lang.String) objArr34[0]).set(null, objArr33);
                try {
                    long longValue2 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1581 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.text.TextUtils.getOffsetBefore("", 0));
                    byte b9 = (byte) (-bArr[23]);
                    byte b10 = bArr[14];
                    objArr2 = objArr33;
                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                    d(b9, b10, b10, objArr35);
                    cls12.getField((java.lang.String) objArr35[0]).set(null, java.lang.Long.valueOf(longValue2));
                } catch (java.lang.Exception unused2) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            } else {
                objArr2 = objArr33;
            }
            objArr3 = objArr2;
        } else {
            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 48, 1629 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.getTrimmedLength(""));
            java.lang.Object[] objArr36 = new java.lang.Object[1];
            d(bArr[44], (byte) (-bArr[41]), 51, objArr36);
            java.lang.Object[] objArr37 = {cls13.getField((java.lang.String) objArr36[0]).get(null), -1786018706, 0};
            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
            if (obj9 == null) {
                obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 4905 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj9);
            }
            objArr3 = (java.lang.Object[]) ((java.lang.reflect.Method) obj9).invoke(null, objArr37);
        }
        if (((int[]) objArr3[0])[0] != ((int[]) objArr3[1])[0]) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add((java.lang.String) objArr3[2]);
            arrayList2.add((java.lang.String) objArr3[3]);
        }
        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 27, android.text.TextUtils.indexOf("", "", 0) + 429, (char) (31610 - android.view.View.getDefaultSize(0, 0)));
        java.lang.Object[] objArr38 = new java.lang.Object[1];
        d(bArr[44], (byte) (-bArr[41]), 51, objArr38);
        long j4 = cls14.getField((java.lang.String) objArr38[0]).getLong(null);
        if (j4 == -1 || j4 + 1965 < ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
            android.content.Context context3 = (android.content.Context) java.lang.Class.forName(str5).getMethod(str6, new java.lang.Class[0]).invoke(null, null);
            if (context3 != null) {
                context3 = context3.getApplicationContext();
            }
            java.lang.Object[] objArr39 = new java.lang.Object[1];
            b(true, "\uffe7\ufff0￩\u001d￩\u001b\u001c￮\u001d\u001a\u001b￪￪￨\u001d\u001b\u001b￩￭\u001c￬\u001a￫\ufff0￫￪\u001d￬￮\u0019￮\ufff0￫￮\u0018\u001c\ufff0￩\ufff0\u001a￫￪\u001c￨￭\u001a\u0019￬\u0019\u0018￫\u001b\u001c\uffe7\uffe7￨\u001c\u001d\ufff0\u001a\u0019\u001c\u0019￩", 110 - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 64, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 47, objArr39);
            java.lang.String str8 = (java.lang.String) objArr39[0];
            java.lang.Object[] objArr40 = new java.lang.Object[1];
            b(false, "\ufff2￬\u001b\ufff2\u001f￪\ufff3 ￫￮\u001f\u001f￬￪\u001c\ufff2￮ ￮\ufff3\u001b￭￫￪\ufff1\uffef ￮\ufff1 \u001e￭\u001b￪\ufff1\ufff3\ufff2￬\u001e\ufff2\u001d\u001b \u001f  \u001e\ufff3\u001c￮\uffef￭\u001e￭\ufff1\u001d\ufff1\ufff2￬\ufff2\uffef\ufff0 \ufff1", 107 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.text.TextUtils.indexOf("", "", 0, 0) + 64, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47, objArr40);
            java.lang.String str9 = (java.lang.String) objArr40[0];
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            b(false, "\u001b\u001e\ufff0\u001b\ufff1￫￮\ufff2\ufff3 \u001e\u001c\u001f\u001f\ufff2￪\u001c\ufff0￪\ufff1￭￬￪ \u001c\ufff2￬￮\u001d\ufff0\u001f\ufff0 \u001b\u001c\u001f\u001e\ufff0\ufff3\ufff1\u001b\ufff1\ufff1\u001f￫\ufff2\u001e\ufff3\ufff0￪￫\u001b￮\ufff2￮￭￭￫￮￪\u001f ￬￬", 106 - android.widget.ExpandableListView.getPackedPositionChild(0L), 64 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.indexOf("", "", 0) + 10, objArr41);
            java.lang.String str10 = (java.lang.String) objArr41[0];
            str2 = str6;
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            b(false, "\ufff1\ufff1\uffef\ufff2\ufff2\ufff6￮\ufff5\ufff0!\ufff5!\ufff4\ufff0#\u001f￮$\ufff4#\ufff0$\ufff4# \u001f\ufff6\ufff5$\ufff7\ufff3\ufff2￮\ufff4\ufff7\ufff6\ufff5\ufff3￮\ufff3\ufff3\ufff1￮#$\ufff0$\ufff3\uffef\ufff4#\ufff5!\"#\ufff3\ufff7\ufff7\uffef\"\ufff5\uffef\ufff2￮", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 103, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 65, android.text.TextUtils.getCapsMode("", 0, 0) + 9, objArr42);
            java.lang.Object[] objArr43 = {context3, new java.lang.String[]{str8, str9, str10, (java.lang.String) objArr42[0]}, 0, 0, 923835037};
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            e((byte) ($$d[322] - 1), (short) 333, r5[236], objArr44);
            java.lang.Class<?> cls15 = java.lang.Class.forName((java.lang.String) objArr44[0]);
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            e(r5[482], (short) 440, r5[5], objArr45);
            java.lang.Object[] objArr46 = (java.lang.Object[]) cls15.getMethod((java.lang.String) objArr45[0], java.lang.Class.forName(str), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr43);
            int i5 = ((int[]) objArr46[1])[0];
            int i6 = ((int[]) objArr46[0])[0];
            if (context3 != null) {
                int i7 = getCvrMaskAnd + 89;
                getPaymentFci = i7 % 128;
                try {
                    if (i7 % 2 == 0) {
                        java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.normalizeMetaState(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 430, (char) (android.text.TextUtils.getOffsetBefore("", 0) + 31610));
                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                        d((short) 58, bArr[45], bArr[14], objArr47);
                        cls16.getField((java.lang.String) objArr47[0]).set(null, objArr46);
                        valueOf2 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[1]).invoke(null, new java.lang.Object[1])).longValue());
                        cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.getOffsetBefore("", 0) + 429, (char) (31609 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                        d(bArr[44], (byte) (-bArr[41]), 51, objArr48);
                        obj = objArr48[0];
                    } else {
                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 28, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 430, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 31610));
                        java.lang.Object[] objArr49 = new java.lang.Object[1];
                        d((short) 58, bArr[45], bArr[14], objArr49);
                        cls17.getField((java.lang.String) objArr49[0]).set(null, objArr46);
                        valueOf2 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                        cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 21, android.graphics.Color.alpha(0) + 429, (char) (android.graphics.Color.red(0) + 31610));
                        java.lang.Object[] objArr50 = new java.lang.Object[1];
                        d(bArr[44], (byte) (-bArr[41]), 51, objArr50);
                        obj = objArr50[0];
                    }
                    cls.getField((java.lang.String) obj).set(null, valueOf2);
                } catch (java.lang.Exception unused3) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            }
            objArr4 = objArr46;
        } else {
            java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.normalizeMetaState(0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 428, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 31610));
            java.lang.Object[] objArr51 = new java.lang.Object[1];
            d((short) 58, bArr[45], bArr[14], objArr51);
            java.lang.Object[] objArr52 = {cls18.getField((java.lang.String) objArr51[0]).get(null), 923835037, 0};
            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
            if (obj10 == null) {
                obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 4618 - android.view.View.resolveSizeAndState(0, 0, 0), (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj10);
            }
            objArr4 = (java.lang.Object[]) ((java.lang.reflect.Method) obj10).invoke(null, objArr52);
            str2 = str6;
        }
        int i8 = ((int[]) objArr4[1])[0];
        if (((int[]) objArr4[0])[0] == i8) {
            java.lang.Object[] objArr53 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[2])[0]), 0};
            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
            if (obj11 == null) {
                obj11 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 34, android.view.View.combineMeasuredStates(0, 0) + 4618, (char) android.view.KeyEvent.normalizeMetaState(0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj11);
            }
            ((java.lang.reflect.Method) obj11).invoke(null, objArr53);
        } else {
            java.lang.Object[] objArr54 = {java.lang.Long.valueOf((i8 ^ r8) ^ 7721720108598427648L), 1797853127L};
            java.lang.Object[] objArr55 = new java.lang.Object[1];
            e((byte) (-$$d[103]), (short) 286, r5[236], objArr55);
            java.lang.Class<?> cls19 = java.lang.Class.forName((java.lang.String) objArr55[0]);
            java.lang.Object[] objArr56 = new java.lang.Object[1];
            e(r5[39], com.visa.cbp.getEncExpo.initializeViewTreeOwners, r5[342], objArr56);
            cls19.getMethod((java.lang.String) objArr56[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr54);
            java.lang.Object[] objArr57 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[2])[0]), 0};
            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
            if (obj12 == null) {
                obj12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 4618, (char) android.view.View.getDefaultSize(0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj12);
            }
            ((java.lang.reflect.Method) obj12).invoke(null, objArr57);
        }
        java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 47, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 754, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 45561));
        byte b11 = bArr[58];
        java.lang.Object[] objArr58 = new java.lang.Object[1];
        d(b11, (byte) (b11 & com.google.common.base.Ascii.GS), 54, objArr58);
        long j5 = cls20.getField((java.lang.String) objArr58[0]).getLong(null);
        if (j5 == -1 || j5 + 1856 < ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
            java.lang.Object[] objArr59 = {0, 71857107};
            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
            if (obj13 == null) {
                java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 754, (char) (android.graphics.Color.argb(0, 0, 0, 0) + 45560));
                java.lang.Object[] objArr60 = new java.lang.Object[1];
                d((short) 63, (byte) (-bArr[19]), bArr[45], objArr60);
                obj13 = cls21.getMethod((java.lang.String) objArr60[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj13);
            }
            java.lang.Object invoke = ((java.lang.reflect.Method) obj13).invoke(null, objArr59);
            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 47, android.graphics.Color.alpha(0) + 754, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 45560));
            java.lang.Object[] objArr61 = new java.lang.Object[1];
            d((short) 63, (byte) (-bArr[19]), bArr[45], objArr61);
            cls22.getField((java.lang.String) objArr61[0]).set(null, invoke);
            try {
                long longValue3 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 47, 754 - android.view.View.resolveSize(0, 0), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 45560));
                byte b12 = bArr[58];
                java.lang.Object[] objArr62 = new java.lang.Object[1];
                d(b12, (byte) (b12 & com.google.common.base.Ascii.GS), 54, objArr62);
                cls23.getField((java.lang.String) objArr62[0]).set(null, java.lang.Long.valueOf(longValue3));
                obj2 = invoke;
            } catch (java.lang.Exception unused4) {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
            }
        } else {
            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.graphics.Color.blue(0), 754 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 45560));
            java.lang.Object[] objArr63 = new java.lang.Object[1];
            d((short) 63, (byte) (-bArr[19]), bArr[45], objArr63);
            java.lang.Object[] objArr64 = {cls24.getField((java.lang.String) objArr63[0]).get(null), 71857107, 0};
            java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
            if (obj14 == null) {
                obj14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 40, 4790 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31151))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getTrimmedLength(""), 4750 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (33702 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj14);
            }
            obj2 = ((java.lang.reflect.Method) obj14).invoke(null, objArr64);
        }
        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
        if (obj15 == null) {
            obj15 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 40, 4750 - android.view.View.MeasureSpec.getSize(0), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33701))).getMethod("values", null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj15);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(obj2, null)).intValue();
        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
        if (obj16 == null) {
            obj16 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 40, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4749, (char) (33700 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("DigitizedCardProfile", null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj16);
        }
        if (((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(obj2, null)).intValue() == intValue) {
            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
            if (obj17 == null) {
                obj17 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 40, android.text.TextUtils.indexOf("", "", 0, 0) + 4750, (char) (33701 - android.text.TextUtils.getOffsetBefore("", 0)))).getMethod("valueOf", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj17);
            }
            java.lang.Object[] objArr65 = {obj2, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(obj2, null)).intValue()), 0};
            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
            if (obj18 == null) {
                obj18 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 40, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 4790, (char) (31151 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetAfter("", 0), 4750 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (33701 - (android.view.KeyEvent.getMaxKeyCode() >> 16))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj18);
            }
            ((java.lang.reflect.Method) obj18).invoke(null, objArr65);
        } else {
            java.lang.Object[] objArr66 = {java.lang.Long.valueOf((intValue ^ r6) ^ (-9010025661049339904L)), -2097808026L};
            byte b13 = $$d[54];
            java.lang.Object[] objArr67 = new java.lang.Object[1];
            e(b13, (short) (b13 | 224), r5[236], objArr67);
            java.lang.Class<?> cls25 = java.lang.Class.forName((java.lang.String) objArr67[0]);
            java.lang.Object[] objArr68 = new java.lang.Object[1];
            e(r5[39], com.visa.cbp.getEncExpo.initializeViewTreeOwners, r5[342], objArr68);
            cls25.getMethod((java.lang.String) objArr68[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr66);
            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
            if (obj19 == null) {
                obj19 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.graphics.Color.alpha(0) + 4750, (char) (33700 - android.graphics.ImageFormat.getBitsPerPixel(0)))).getMethod("valueOf", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj19);
            }
            java.lang.Object[] objArr69 = {obj2, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(obj2, null)).intValue()), 0};
            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
            if (obj20 == null) {
                obj20 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 4790 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.text.TextUtils.indexOf("", "") + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 40, android.view.View.resolveSize(0, 0) + 4750, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj20);
            }
            ((java.lang.reflect.Method) obj20).invoke(null, objArr69);
        }
        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.KeyEvent.normalizeMetaState(0), 923 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) android.view.View.MeasureSpec.getMode(0));
        java.lang.Object[] objArr70 = new java.lang.Object[1];
        d(bArr[44], (byte) (-bArr[41]), 51, objArr70);
        long j6 = cls26.getField((java.lang.String) objArr70[0]).getLong(null);
        if (j6 == -1 || j6 + 2001 < ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
            java.lang.Object[] objArr71 = {-427501900};
            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
            if (obj21 == null) {
                obj21 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 49, 873 - android.view.KeyEvent.normalizeMetaState(0), (char) (15955 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)))).getDeclaredConstructor(java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj21);
            }
            java.lang.Object[] writeReplace$466995e3 = com.payair.hce.getCdol1RelatedDataLength.AlternateContactlessPaymentDataJson.writeReplace$466995e3(((java.lang.reflect.Constructor) obj21).newInstance(objArr71));
            i = 0;
            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 923, (char) android.text.TextUtils.indexOf("", "", 0, 0));
            java.lang.Object[] objArr72 = new java.lang.Object[1];
            d((short) 58, bArr[45], bArr[14], objArr72);
            cls27.getField((java.lang.String) objArr72[0]).set(null, writeReplace$466995e3);
            try {
                long longValue4 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 44, 922 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.view.View.MeasureSpec.getMode(0));
                java.lang.Object[] objArr73 = new java.lang.Object[1];
                d(bArr[44], (byte) (-bArr[41]), 51, objArr73);
                cls28.getField((java.lang.String) objArr73[0]).set(null, java.lang.Long.valueOf(longValue4));
                objArr5 = writeReplace$466995e3;
                c = 1;
            } catch (java.lang.Exception unused5) {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
            }
        } else {
            getCvrMaskAnd = (getPaymentFci + 97) % 128;
            java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.getDefaultSize(0, 0), 922 - android.text.TextUtils.indexOf("", "", 0, 0), (char) android.text.TextUtils.indexOf("", "", 0, 0));
            java.lang.Object[] objArr74 = new java.lang.Object[1];
            d((short) 58, bArr[45], bArr[14], objArr74);
            java.lang.Object[] objArr75 = {cls29.getField((java.lang.String) objArr74[0]).get(null), -2062849474, 0};
            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
            if (obj22 == null) {
                obj22 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 4860 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj22);
            }
            objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) obj22).invoke(null, objArr75);
            c = 1;
            i = 0;
        }
        int i9 = ((int[]) objArr5[c])[i];
        if (((int[]) objArr5[i])[i] == i9) {
            int i10 = ((int[]) objArr5[3])[i];
            java.lang.Object[] objArr76 = new java.lang.Object[3];
            objArr76[2] = 0;
            objArr76[1] = java.lang.Integer.valueOf(i10);
            objArr76[i] = objArr5;
            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
            if (obj23 == null) {
                obj23 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(i) + 45, (android.widget.ExpandableListView.getPackedPositionForGroup(i) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i) == 0L ? 0 : -1)) + 4860, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj23);
            }
            ((java.lang.reflect.Method) obj23).invoke(null, objArr76);
        } else {
            new java.util.ArrayList().add((java.lang.String) objArr5[2]);
            java.lang.Object[] objArr77 = {java.lang.Long.valueOf((i9 ^ r10) ^ (-2128783570846613504L)), -495646051L};
            byte[] bArr4 = $$d;
            java.lang.Object[] objArr78 = new java.lang.Object[1];
            e(bArr4[43], (short) ($$e + 4), bArr4[236], objArr78);
            java.lang.Class<?> cls30 = java.lang.Class.forName((java.lang.String) objArr78[0]);
            java.lang.Object[] objArr79 = new java.lang.Object[1];
            e(bArr4[101], (short) 181, bArr4[15], objArr79);
            cls30.getMethod((java.lang.String) objArr79[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr77);
            java.lang.Object[] objArr80 = {objArr5, java.lang.Integer.valueOf(((int[]) objArr5[3])[0]), 0};
            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
            if (obj24 == null) {
                obj24 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (-16772356) - android.graphics.Color.rgb(0, 0, 0), (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj24);
            }
            ((java.lang.reflect.Method) obj24).invoke(null, objArr80);
        }
        java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 51, (android.os.Process.myPid() >> 22) + 584, (char) (24290 - android.view.MotionEvent.axisFromString("")));
        byte b14 = (byte) (-bArr[23]);
        byte b15 = bArr[14];
        java.lang.Object[] objArr81 = new java.lang.Object[1];
        d(b14, b15, b15, objArr81);
        long j7 = cls31.getField((java.lang.String) objArr81[0]).getLong(null);
        if (j7 == -1 || j7 + 1858 < ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
            java.lang.String str11 = str2;
            android.content.Context context4 = (android.content.Context) java.lang.Class.forName(str5).getMethod(str11, new java.lang.Class[0]).invoke(null, null);
            if (context4 != null) {
                context4 = context4.getApplicationContext();
            }
            byte[] bArr5 = $$d;
            java.lang.Object[] objArr82 = new java.lang.Object[1];
            e(bArr5[50], (short) 162, bArr5[236], objArr82);
            java.lang.Class<?> cls32 = java.lang.Class.forName((java.lang.String) objArr82[0]);
            byte b16 = bArr5[5];
            str2 = str11;
            java.lang.Object[] objArr83 = new java.lang.Object[1];
            e(b16, (short) (b16 | 111), bArr5[17], objArr83);
            java.lang.Object[] objArr84 = (java.lang.Object[]) cls32.getMethod((java.lang.String) objArr83[0], java.lang.Class.forName(str), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context4, 0, 188268507);
            if (context4 != null) {
                int i11 = getCvrMaskAnd + 87;
                getPaymentFci = i11 % 128;
                try {
                    if (i11 % 2 == 0) {
                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) (24292 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr85 = new java.lang.Object[1];
                        d((short) 63, (byte) (-bArr[19]), bArr[45], objArr85);
                        cls33.getField((java.lang.String) objArr85[0]).set(null, objArr84);
                        valueOf3 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[1]).invoke(null, new java.lang.Object[1])).longValue());
                        cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.view.KeyEvent.getDeadChar(0, 0) + 584, (char) (24291 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                        byte b17 = (byte) (-bArr[23]);
                        byte b18 = bArr[14];
                        java.lang.Object[] objArr86 = new java.lang.Object[1];
                        d(b17, b18, b18, objArr86);
                        obj3 = objArr86[0];
                    } else {
                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 584 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.KeyEvent.normalizeMetaState(0) + 24291));
                        java.lang.Object[] objArr87 = new java.lang.Object[1];
                        d((short) 63, (byte) (-bArr[19]), bArr[45], objArr87);
                        cls34.getField((java.lang.String) objArr87[0]).set(null, objArr84);
                        valueOf3 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                        cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 584 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (24291 - android.text.TextUtils.getCapsMode("", 0, 0)));
                        byte b19 = (byte) (-bArr[23]);
                        byte b20 = bArr[14];
                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                        d(b19, b20, b20, objArr88);
                        obj3 = objArr88[0];
                    }
                    cls2.getField((java.lang.String) obj3).set(null, valueOf3);
                } catch (java.lang.Exception unused6) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            }
            objArr6 = objArr84;
        } else {
            java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.getOffsetBefore("", 0), 584 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (24291 - android.graphics.Color.alpha(0)));
            java.lang.Object[] objArr89 = new java.lang.Object[1];
            d((short) 63, (byte) (-bArr[19]), bArr[45], objArr89);
            java.lang.Object[] objArr90 = {cls35.getField((java.lang.String) objArr89[0]).get(null), 188268507, 0};
            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
            if (obj25 == null) {
                obj25 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.view.View.resolveSizeAndState(0, 0, 0) + 4830, (char) android.view.Gravity.getAbsoluteGravity(0, 0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj25);
            }
            objArr6 = (java.lang.Object[]) ((java.lang.reflect.Method) obj25).invoke(null, objArr90);
        }
        int i12 = ((int[]) objArr6[1])[0];
        if (((int[]) objArr6[0])[0] == i12) {
            java.lang.Object[] objArr91 = {objArr6, java.lang.Integer.valueOf(((int[]) objArr6[3])[0]), 0};
            java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
            if (obj26 == null) {
                obj26 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 30, 4830 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj26);
            }
            ((java.lang.reflect.Method) obj26).invoke(null, objArr91);
        } else {
            java.lang.Object[] objArr92 = {java.lang.Long.valueOf((i12 ^ r10) ^ (-9192248504804704256L)), -2140237132L};
            byte[] bArr6 = $$d;
            java.lang.Object[] objArr93 = new java.lang.Object[1];
            e(bArr6[36], (short) 106, bArr6[236], objArr93);
            java.lang.Class<?> cls36 = java.lang.Class.forName((java.lang.String) objArr93[0]);
            java.lang.Object[] objArr94 = new java.lang.Object[1];
            e(bArr6[39], com.visa.cbp.getEncExpo.initializeViewTreeOwners, bArr6[342], objArr94);
            cls36.getMethod((java.lang.String) objArr94[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr92);
            java.lang.Object[] objArr95 = {objArr6, java.lang.Integer.valueOf(((int[]) objArr6[3])[0]), 0};
            java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
            if (obj27 == null) {
                obj27 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.os.Process.myPid() >> 22), 4830 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj27);
            }
            ((java.lang.reflect.Method) obj27).invoke(null, objArr95);
        }
        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 52, android.graphics.Color.rgb(0, 0, 0) + 16777800, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24291));
        byte b21 = bArr[58];
        java.lang.Object[] objArr96 = new java.lang.Object[1];
        d(b21, (byte) (b21 & com.google.common.base.Ascii.GS), 54, objArr96);
        long j8 = cls37.getField((java.lang.String) objArr96[0]).getLong(null);
        if (j8 == -1 || j8 + 2026 < ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
            byte b22 = $$d[54];
            java.lang.Object[] objArr97 = new java.lang.Object[1];
            e(b22, (short) (b22 << 2), r3[236], objArr97);
            java.lang.Class<?> cls38 = java.lang.Class.forName((java.lang.String) objArr97[0]);
            java.lang.Object[] objArr98 = new java.lang.Object[1];
            e(r3[101], (short) 181, r3[15], objArr98);
            objArr7 = (java.lang.Object[]) cls38.getMethod((java.lang.String) objArr98[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, 0, 669910519);
            java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.getOffsetBefore("", 0), 584 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 24291));
            byte b23 = bArr[57];
            java.lang.Object[] objArr99 = new java.lang.Object[1];
            d((short) 74, b23, b23, objArr99);
            cls39.getField((java.lang.String) objArr99[0]).set(null, objArr7);
            try {
                long longValue5 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 632 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 24291));
                byte b24 = bArr[58];
                java.lang.Object[] objArr100 = new java.lang.Object[1];
                d(b24, (byte) (b24 & com.google.common.base.Ascii.GS), 54, objArr100);
                c2 = 0;
                cls40.getField((java.lang.String) objArr100[0]).set(null, java.lang.Long.valueOf(longValue5));
                c3 = 1;
            } catch (java.lang.Exception unused7) {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
            }
        } else {
            getPaymentFci = (getCvrMaskAnd + 125) % 128;
            java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 51, 584 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (24290 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
            byte b25 = bArr[57];
            java.lang.Object[] objArr101 = new java.lang.Object[1];
            d((short) 74, b25, b25, objArr101);
            java.lang.Object[] objArr102 = {cls41.getField((java.lang.String) objArr101[0]).get(null), 669910519, 0};
            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
            if (obj28 == null) {
                obj28 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 30, 4829 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj28);
            }
            objArr7 = (java.lang.Object[]) ((java.lang.reflect.Method) obj28).invoke(null, objArr102);
            c3 = 1;
            c2 = 0;
        }
        int i13 = ((int[]) objArr7[c3])[c2];
        if (((int[]) objArr7[c2])[c2] == i13) {
            int i14 = ((int[]) objArr7[3])[c2];
            java.lang.Object[] objArr103 = new java.lang.Object[3];
            objArr103[2] = 0;
            objArr103[1] = java.lang.Integer.valueOf(i14);
            objArr103[c2] = objArr7;
            java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
            if (obj29 == null) {
                obj29 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4830, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj29);
            }
            ((java.lang.reflect.Method) obj29).invoke(null, objArr103);
        } else {
            new java.util.ArrayList().add((java.lang.String) objArr7[2]);
            java.lang.Object[] objArr104 = {java.lang.Long.valueOf((i13 ^ r10) ^ 5221690001456103424L), 1215769460L};
            java.lang.Object[] objArr105 = new java.lang.Object[1];
            e((byte) (-$$d[122]), (short) 406, r5[236], objArr105);
            java.lang.Class<?> cls42 = java.lang.Class.forName((java.lang.String) objArr105[0]);
            java.lang.Object[] objArr106 = new java.lang.Object[1];
            e(r5[101], (short) 181, r5[15], objArr106);
            cls42.getMethod((java.lang.String) objArr106[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr104);
            java.lang.Object[] objArr107 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[3])[0]), 0};
            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
            if (obj30 == null) {
                obj30 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30, 4829 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj30);
            }
            ((java.lang.reflect.Method) obj30).invoke(null, objArr107);
        }
        java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 584 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 24290));
        java.lang.Object[] objArr108 = new java.lang.Object[1];
        d(bArr[44], (byte) (-bArr[41]), 51, objArr108);
        long j9 = cls43.getField((java.lang.String) objArr108[0]).getLong(null);
        if (j9 == -1 || j9 + 2017 < ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
            android.content.Context context5 = (android.content.Context) java.lang.Class.forName(str5).getMethod(str2, new java.lang.Class[0]).invoke(null, null);
            if (context5 != null) {
                context5 = context5.getApplicationContext();
            }
            byte b26 = $$d[17];
            java.lang.Object[] objArr109 = new java.lang.Object[1];
            e(b26, (short) (b26 + 5), r5[236], objArr109);
            java.lang.Class<?> cls44 = java.lang.Class.forName((java.lang.String) objArr109[0]);
            java.lang.Object[] objArr110 = new java.lang.Object[1];
            e(r5[39], com.visa.cbp.getEncExpo.initializeViewTreeOwners, r5[342], objArr110);
            java.lang.Object[] objArr111 = (java.lang.Object[]) cls44.getMethod((java.lang.String) objArr110[0], java.lang.Class.forName(str), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context5, 0, -268053862);
            if (context5 != null) {
                java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.KeyEvent.normalizeMetaState(0), 583 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (24291 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                java.lang.Object[] objArr112 = new java.lang.Object[1];
                d((short) 58, bArr[45], bArr[14], objArr112);
                cls45.getField((java.lang.String) objArr112[0]).set(null, objArr111);
                try {
                    long longValue6 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 585 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 24243));
                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                    d(bArr[44], (byte) (-bArr[41]), 51, objArr113);
                    cls46.getField((java.lang.String) objArr113[0]).set(null, java.lang.Long.valueOf(longValue6));
                } catch (java.lang.Exception unused8) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            }
            objArr8 = objArr111;
        } else {
            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 51, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) (24291 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)));
            java.lang.Object[] objArr114 = new java.lang.Object[1];
            d((short) 58, bArr[45], bArr[14], objArr114);
            java.lang.Object[] objArr115 = {cls47.getField((java.lang.String) objArr114[0]).get(null), -268053862, 0};
            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
            if (obj31 == null) {
                obj31 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 4831, (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj31);
            }
            objArr8 = (java.lang.Object[]) ((java.lang.reflect.Method) obj31).invoke(null, objArr115);
        }
        int i15 = ((int[]) objArr8[1])[0];
        if (((int[]) objArr8[0])[0] == i15) {
            java.lang.Object[] objArr116 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), 0};
            java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
            if (obj32 == null) {
                obj32 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 30, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4829, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj32);
            }
            ((java.lang.reflect.Method) obj32).invoke(null, objArr116);
        } else {
            java.lang.Object[] objArr117 = {java.lang.Long.valueOf((i15 ^ r9) ^ 6732164647236927488L), 1567454740L};
            byte[] bArr7 = $$d;
            java.lang.Object[] objArr118 = new java.lang.Object[1];
            e(bArr7[482], bArr7[5], bArr7[236], objArr118);
            java.lang.Class<?> cls48 = java.lang.Class.forName((java.lang.String) objArr118[0]);
            java.lang.Object[] objArr119 = new java.lang.Object[1];
            e(bArr7[482], (short) 440, bArr7[5], objArr119);
            cls48.getMethod((java.lang.String) objArr119[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr117);
            java.lang.Object[] objArr120 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), 0};
            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
            if (obj33 == null) {
                obj33 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 30, 4830 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.text.TextUtils.indexOf("", ""))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj33);
            }
            ((java.lang.reflect.Method) obj33).invoke(null, objArr120);
        }
        java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 47, android.graphics.Color.argb(0, 0, 0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - (android.view.KeyEvent.getMaxKeyCode() >> 16)));
        byte b27 = (byte) (-bArr[23]);
        byte b28 = bArr[14];
        java.lang.Object[] objArr121 = new java.lang.Object[1];
        d(b27, b28, b28, objArr121);
        long j10 = cls49.getField((java.lang.String) objArr121[0]).getLong(null);
        if (j10 == -1 || j10 + 2010 < ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
            java.lang.Object[] objArr122 = {0, 0, -1064743945};
            java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
            if (obj34 == null) {
                java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46, 707 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.View.resolveSize(0, 0) + 34284));
                byte b29 = (byte) (-bArr[23]);
                byte b30 = bArr[14];
                java.lang.Object[] objArr123 = new java.lang.Object[1];
                d(b29, b30, b30, objArr123);
                obj34 = cls50.getMethod((java.lang.String) objArr123[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj34);
            }
            java.lang.Object[] objArr124 = (java.lang.Object[]) ((java.lang.reflect.Method) obj34).invoke(null, objArr122);
            java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.View.resolveSize(0, 0), 707 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (34284 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)));
            java.lang.Object[] objArr125 = new java.lang.Object[1];
            d((short) 63, (byte) (-bArr[19]), bArr[45], objArr125);
            cls51.getField((java.lang.String) objArr125[0]).set(null, objArr124);
            try {
                long longValue7 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.getCapsMode("", 0, 0), 708 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (34284 - android.graphics.Color.argb(0, 0, 0, 0)));
                byte b31 = (byte) (-bArr[23]);
                byte b32 = bArr[14];
                c4 = 1;
                java.lang.Object[] objArr126 = new java.lang.Object[1];
                d(b31, b32, b32, objArr126);
                i2 = 0;
                cls52.getField((java.lang.String) objArr126[0]).set(null, java.lang.Long.valueOf(longValue7));
                objArr9 = objArr124;
            } catch (java.lang.Exception unused9) {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
            }
        } else {
            java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 47, 707 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (34284 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
            java.lang.Object[] objArr127 = new java.lang.Object[1];
            d((short) 63, (byte) (-bArr[19]), bArr[45], objArr127);
            java.lang.Object[] objArr128 = {cls53.getField((java.lang.String) objArr127[0]).get(null), -1064743945, 0};
            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
            if (obj35 == null) {
                obj35 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 32, 4717 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj35);
            }
            objArr9 = (java.lang.Object[]) ((java.lang.reflect.Method) obj35).invoke(null, objArr128);
            i2 = 0;
            c4 = 1;
        }
        int i16 = ((int[]) objArr9[c4])[i2];
        if (((int[]) objArr9[i2])[i2] == i16) {
            int i17 = ((int[]) objArr9[9])[i2];
            java.lang.Object[] objArr129 = new java.lang.Object[3];
            objArr129[2] = 0;
            objArr129[1] = java.lang.Integer.valueOf(i17);
            objArr129[i2] = objArr9;
            java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
            if (obj36 == null) {
                java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(i2) + 33, 4716 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.KeyEvent.getDeadChar(i2, i2));
                java.lang.Class<?>[] clsArr = new java.lang.Class[3];
                clsArr[i2] = java.lang.Object[].class;
                clsArr[1] = java.lang.Integer.TYPE;
                clsArr[2] = java.lang.Integer.TYPE;
                obj36 = cls54.getMethod("AlternateContactlessPaymentDataJson", clsArr);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj36);
            }
            ((java.lang.reflect.Method) obj36).invoke(null, objArr129);
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add((java.lang.String) objArr9[2]);
        arrayList3.add((java.lang.String) objArr9[3]);
        arrayList3.add((java.lang.String) objArr9[4]);
        arrayList3.add((java.lang.String) objArr9[5]);
        arrayList3.add((java.lang.String) objArr9[6]);
        arrayList3.add((java.lang.String) objArr9[7]);
        arrayList3.add((java.lang.String) objArr9[8]);
        java.lang.Object[] objArr130 = {java.lang.Long.valueOf((i16 ^ r6) ^ (-2900188314575306752L)), -675252711L};
        byte[] bArr8 = $$d;
        java.lang.Object[] objArr131 = new java.lang.Object[1];
        e(bArr8[50], (short) 162, bArr8[236], objArr131);
        java.lang.Class<?> cls55 = java.lang.Class.forName((java.lang.String) objArr131[0]);
        java.lang.Object[] objArr132 = new java.lang.Object[1];
        e(bArr8[101], (short) 181, bArr8[15], objArr132);
        cls55.getMethod((java.lang.String) objArr132[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr130);
        java.lang.Object[] objArr133 = {objArr9, java.lang.Integer.valueOf(((int[]) objArr9[9])[0]), 0};
        java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
        if (obj37 == null) {
            obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.graphics.ImageFormat.getBitsPerPixel(0), android.view.View.combineMeasuredStates(0, 0) + 4717, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj37);
        }
        ((java.lang.reflect.Method) obj37).invoke(null, objArr133);
    }

    public static boolean reInitialize(android.content.Context context) {
        getCvrMaskAnd = (getPaymentFci + 89) % 128;
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setScreenReaderFocusable.writeReplace(new java.lang.Object[]{context}, -71797868, 71797870, (int) java.lang.System.currentTimeMillis())).booleanValue();
        getPaymentFci = (getCvrMaskAnd + 107) % 128;
        return booleanValue;
    }

    static void writeReplace() {
        SdkCoreBusinessLogicModuleImpl = 1889207108;
    }

    static void init$2() {
        $$g = new byte[]{110, 114, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -114};
        $$h = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE;
    }

    static void valueOf() {
        int i = getCvrMaskAnd;
        int i2 = i + 25;
        getPaymentFci = i2 % 128;
        getProfileVersion = 2040131626385073694L;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i + 17;
        getPaymentFci = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.CAN, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -20, -99, -14, 0, kotlin.io.encoding.Base64.padSymbol, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -26, com.google.common.base.Ascii.SYN, -10, -11, 66, -60, 3, -4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -71, com.google.common.base.Ascii.FF, -17, com.google.common.base.Ascii.RS, -15, -8, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -14, 0, kotlin.io.encoding.Base64.padSymbol, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -26, com.google.common.base.Ascii.SYN, -10, -11, 66, -60, 3, -4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -55, -17, com.google.common.base.Ascii.VT, 2, -21, 13, 32, -46, -1, 6, -5, 0, com.visa.cbp.getEncExpo.onUnminimized, 1, com.google.common.base.Ascii.SI, -21, 9, -8, -1, 41, -46, -1, -8, 13, -21, 2, 19, -13, -11, 14, com.google.common.base.Ascii.DC4, -25, -14, 0, kotlin.io.encoding.Base64.padSymbol, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -26, com.google.common.base.Ascii.SYN, -10, -11, 66, -60, 3, -4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -59, 0, -17, com.google.common.base.Ascii.US, -35, 0, 7, -7, 5, 65, -17, 13, -17, -14, 0, kotlin.io.encoding.Base64.padSymbol, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -26, com.google.common.base.Ascii.SYN, -10, -11, 66, -60, 3, -4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -39, -19, -9, 38, -46, -5, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.US, -39, 0, -4, -13, 9, -19, 19, -1, com.google.common.base.Ascii.US, -32, -19, com.google.common.base.Ascii.FF, 18, -36, 1, 7, -5, -5, 5, com.google.common.base.Ascii.SUB, -38, -5, 2, 70, -15, -14, 0, kotlin.io.encoding.Base64.padSymbol, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -26, com.google.common.base.Ascii.SYN, -10, -11, 66, -60, 3, -4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -71, com.google.common.base.Ascii.FF, -17, 41, -45, 13, -10, -8, 46, -32, -15, 38, -43, 10, -20, 0, 3, 7, -13, 13, 17, -21, -13, 2, 9, -4, -4, -14, 0, kotlin.io.encoding.Base64.padSymbol, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -26, com.google.common.base.Ascii.SYN, -10, -11, 66, -60, 3, -4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -71, com.google.common.base.Ascii.FF, -17, 34, -27, -15, 5, -7, com.google.common.base.Ascii.SUB, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -15, -4, -14, 0, kotlin.io.encoding.Base64.padSymbol, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -26, com.google.common.base.Ascii.SYN, -10, -11, 66, -60, 3, -4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -36, -19, -26, com.google.common.base.Ascii.SYN, -10, -11, com.google.common.base.Ascii.ESC, -32, com.google.common.base.Ascii.FF, -15, 44, -31, -21, 17, com.google.common.base.Ascii.ESC, -31, com.visa.cbp.getEncExpo.onUnminimized, 14, com.google.common.base.Ascii.DC4, -38, -5, 2, 70, -19, -39, 0, -4, -13, 9, -19, 19, -1, com.google.common.base.Ascii.US, -32, -19, com.google.common.base.Ascii.FF, 18, -36, 1, 7, -5, -5, 5, -14, 0, kotlin.io.encoding.Base64.padSymbol, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -26, com.google.common.base.Ascii.SYN, -10, -11, 66, -60, 3, -4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -71, com.google.common.base.Ascii.FF, -17, 34, -27, -7, 43, -54, -1, 3, 0, 10, -21, 9, 4, 0, -13, -2, -15, 37, -21, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.FF, -17, 48, -57, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.visa.cbp.getEncExpo.kernelVersion, -2, 2, 1, 4, 0, -21, 9, -8, -1, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized, -14, 0, kotlin.io.encoding.Base64.padSymbol, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -26, com.google.common.base.Ascii.SYN, -10, -11, 66, -60, 3, -4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -61, 3, -3, -11, -8, 9, 1, -21, -14, 0, kotlin.io.encoding.Base64.padSymbol, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -26, com.google.common.base.Ascii.SYN, -10, -11, 66, -60, 3, -4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -71, com.google.common.base.Ascii.FF, -17, 41, -39, -4, -7, -1, com.google.common.base.Ascii.RS, -39, 7, 9, -14, 0, kotlin.io.encoding.Base64.padSymbol, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 10, -20, -3, 13, -15, 13, 0, -19, com.google.common.base.Ascii.FF, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -5, -5, 13, -9, 59, -55, 0, -19, com.google.common.base.Ascii.FF, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -4, 1, 7, -5, -5, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -71, 13, -9, 59, -24, -39, 0, -4, -13, 9, -19, 19, -1, com.google.common.base.Ascii.US, -32, -19, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CAN, -43, 2, -1, 72, -15, com.google.common.base.Ascii.VT, -17, -14, 0, kotlin.io.encoding.Base64.padSymbol, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -26, com.google.common.base.Ascii.SYN, -10, -11, 66, -60, 3, -4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -67, -3, 9, -11, com.google.common.base.Ascii.GS, -37, 45, com.visa.cbp.getEncExpo.kernelVersion, com.google.common.base.Ascii.VT, 2, -21, 13, com.google.common.base.Ascii.US, -31, -21, 17, -3, -1, -20, com.google.common.base.Ascii.FF};
        $$e = 215;
    }

    static void values() {
        int i = (getPaymentFci + 55) % 128;
        getAid = new char[]{10988, 10987, 10773};
        RecordsJson = -143185319;
        SdkCoreAlternateContactlessPaymentDataImpl = true;
        IccPrivateKeyCrtComponentsJson = true;
        getCvrMaskAnd = i;
    }

    static void init$0() {
        $$a = new byte[]{118, 40, com.google.common.base.Ascii.SYN, 126, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, -20, com.google.common.base.Ascii.EM, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5, -19, 13, com.google.common.base.Ascii.VT, -14, 16, -3, -7, 13, -13, -17, com.google.common.base.Ascii.NAK, 13, -2, -9, 4, 4, 19, 9, -38, 46, 5, -11, -34, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -22, 38, 5, -2};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE;
    }

    private static void writeReplace(android.content.Context context, java.lang.String str, java.lang.String str2, com.payair.hce.AuthenticationEnum authenticationEnum, java.lang.String str3) {
        writeReplace(new java.lang.Object[]{context, str, str2, authenticationEnum, str3}, 1291547959, -1291547959, (int) java.lang.System.currentTimeMillis());
    }
}
