package com.payair.hce;

/* loaded from: classes4.dex */
public final class cancelAvailabilityErrorNotifications {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final com.payair.hce.isSidewinderDevice AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static long valueOf;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4 = 106 - i;
        int i5 = i2 * 3;
        byte[] bArr = $$a;
        int i6 = 4 - (b * 4);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i5;
            i4 = i6;
            int i8 = 0;
            i6++;
            i4 += -i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i6++;
            i4 += -i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        valueOf();
        AlternateContactlessPaymentDataJson = new com.payair.hce.enableUsingApkIndependentContext();
        int i = IccPrivateKeyCrtComponentsJson + 117;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static byte[] AlternateContactlessPaymentDataJson(byte[] bArr) {
        int i = IccPrivateKeyCrtComponentsJson + 93;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            DigitizedCardProfile(bArr, bArr.length);
            throw new java.lang.ArithmeticException();
        }
        byte[] DigitizedCardProfile2 = DigitizedCardProfile(bArr, bArr.length);
        writeReplace = (IccPrivateKeyCrtComponentsJson + 11) % 128;
        return DigitizedCardProfile2;
    }

    private static byte[] DigitizedCardProfile(byte[] bArr, int i) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(((i + 2) / 3) << 2);
        try {
            AlternateContactlessPaymentDataJson.valueOf(bArr, 0, i, byteArrayOutputStream);
            int i2 = writeReplace + 21;
            IccPrivateKeyCrtComponentsJson = i2 % 128;
            int i3 = i2 % 2;
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("촯\ude94䵨⻭", "찲ㅸ锋\udd6aҴꎴ鋵涺\ud980꺐\udba6愰䁀囵钊ࣅ眸ꛀ凎匈嫴䃴홳㪴⟷䔻⿈涜\ue823根性ﱲᴀ䙒", "\uea42뇬ᩰ윶", android.graphics.Color.green(0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new com.payair.hce.uidHasPackageName(sb.toString(), e);
        }
    }

    public static byte[] DigitizedCardProfile(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            AlternateContactlessPaymentDataJson.writeReplace(str, byteArrayOutputStream);
            int i = (IccPrivateKeyCrtComponentsJson + 23) % 128;
            writeReplace = i;
            IccPrivateKeyCrtComponentsJson = (i + 119) % 128;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i2 = writeReplace + 25;
            IccPrivateKeyCrtComponentsJson = i2 % 128;
            if (i2 % 2 != 0) {
                return byteArray;
            }
            throw null;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("촯\ude94䵨⻭", "俠オ䙚캢監醁\uf102め巤谓픰\ueb63⪉섩\uf2c7瘹\ue1b2\ue75a訟㑸睐ć╇\uea60줱ꎩ袴햫劎パ⢟煎", "緯阸꧆Ꮓ", 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.text.TextUtils.getOffsetBefore("", 0) + 50089), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new com.payair.hce.isRestrictedUserProfile(sb.toString(), e);
        }
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            $10 = ($11 + 89) % 128;
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        if (str != null) {
            cArr2 = str.toCharArray();
            int i2 = $11 + 115;
            $10 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - android.view.KeyEvent.keyCodeFromString(""), android.view.View.resolveSizeAndState(0, 0, 0) + 1179, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte length4 = (byte) $$a.length;
                    byte b = (byte) (length4 - 4);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(length4, b, b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30, 3442 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (3831 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 27, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1864, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 41776));
                    byte b2 = (byte) ($$b & 1);
                    byte b3 = (byte) (b2 - 1);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b2, b3, b3, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 28, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 3133, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(0, 0, (byte) 0, objArr8);
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((cArr3[getwalletdata.writeReplace] ^ cArr5[intValue2]) ^ (valueOf ^ 1263759066225628708L)) ^ ((int) (values ^ 1263759066225628708L))) ^ ((char) (DigitizedCardProfile ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                int i4 = $10 + 15;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 4;
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str4 = new java.lang.String(cArr7);
        $10 = ($11 + 57) % 128;
        objArr[0] = str4;
    }

    static void init$0() {
        $$a = new byte[]{107, 115, 84, 3};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE;
    }

    static void valueOf() {
        valueOf = 4567929046479543051L;
        values = -804334044;
        DigitizedCardProfile = (char) 54820;
    }
}
