package com.payair.hce;

/* loaded from: classes4.dex */
public final class setLogoDescription extends com.payair.hce.setMaxLines {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static long valueOf;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (b * 3) + 4;
        int i4 = (s * 4) + 1;
        int i5 = s2 + 102;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i5 = i4;
            i3++;
            i5 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i3++;
            i5 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    public setLogoDescription(java.io.OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.payair.hce.setMaxLines
    public final void DigitizedCardProfile(com.payair.hce.setShadowLayer setshadowlayer) throws java.io.IOException {
        int i = values;
        AlternateContactlessPaymentDataJson = (i + 39) % 128;
        if (setshadowlayer == null) {
            int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
            java.lang.Object[] objArr = new java.lang.Object[1];
            c("䈐⼀ꇬ팄\u1c89航\udcebꭺ\uf2db㞾略쮠ꞔ۞睭걥폀烁Ꮎ積", "ꇘ⎽缾薈", scrollBarSize >> 8, "\u0000\u0000\u0000\u0000", (char) android.graphics.Color.alpha(0), objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int i2 = i + 83;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            setshadowlayer.getAid().IccPrivateKeyCrtComponentsJson().values(this);
            int i3 = AlternateContactlessPaymentDataJson + 9;
            values = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        setshadowlayer.getAid().IccPrivateKeyCrtComponentsJson().values(this);
        throw null;
    }

    private static void c(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        int i2 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        $10 = i2;
        if (str3 != null) {
            $11 = (i2 + 43) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr4 = cArr;
        if (str2 != null) {
            int i3 = $11 + 105;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr5 = cArr2;
        java.lang.Object obj = null;
        if (str != null) {
            int i4 = $10 + 109;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            cArr3 = str.toCharArray();
        } else {
            cArr3 = str;
        }
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr5.length;
        char[] cArr6 = new char[length];
        int length2 = cArr4.length;
        char[] cArr7 = new char[length2];
        java.lang.System.arraycopy(cArr5, 0, cArr6, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr7, 0, length2);
        cArr6[0] = (char) (cArr6[0] ^ c);
        cArr7[2] = (char) (cArr7[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr8 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(70 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 1179 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.view.View.resolveSize(0, 0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) 0, (short) 0, (short) 0, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 31, 3442 - android.os.Process.getGidForName(""), (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 3831))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr6[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr7[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 26, 1864 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41776));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d((byte) 0, (short) 0, (short) 3, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr6[intValue2] * 32718), java.lang.Integer.valueOf(cArr7[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 3133 - (android.os.Process.myPid() >> 22), (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d((byte) 0, (short) 0, (byte) $$d.length, objArr8);
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                }
                cArr7[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr6[intValue2] = getwalletdata.values;
                cArr8[getwalletdata.writeReplace] = (char) ((((cArr6[intValue2] ^ r4[getwalletdata.writeReplace]) ^ (valueOf ^ 1263759066225628708L)) ^ ((int) (writeReplace ^ 1263759066225628708L))) ^ ((char) (DigitizedCardProfile ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                cArr6 = cArr6;
                obj = null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr8);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        values = 1;
        valueOf = 1263759066225628708L;
        writeReplace = -804334044;
        DigitizedCardProfile = (char) 8390;
    }

    static void init$0() {
        $$d = new byte[]{120, 91, -87, 14};
        $$e = 23;
    }
}
