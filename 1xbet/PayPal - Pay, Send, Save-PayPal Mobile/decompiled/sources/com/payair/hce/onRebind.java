package com.payair.hce;

/* loaded from: classes4.dex */
public class onRebind implements com.payair.hce.obtainStyledAttributes {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int valueOf;
    private static int values;
    private static char writeReplace;

    private static void b(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2 = b + 4;
        int i3 = (s * 2) + 65;
        byte[] bArr = $$a;
        int i4 = i * 3;
        byte[] bArr2 = new byte[i4 + 35];
        int i5 = i4 + 34;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i3 + (-i5)) - 2;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i2++;
                i3 = (i3 + (-bArr[i2])) - 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 1 - (s2 * 3);
        int i5 = s + 102;
        byte[] bArr = $$d;
        int i6 = 4 - (i * 3);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i5 = i6;
            i3 = 0;
            i6++;
            i5 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i6++;
            i5 += i7;
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

    onRebind() {
    }

    @Override // com.payair.hce.obtainStyledAttributes
    public final boolean writeReplace() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 6, 0, 2}, "\u0000\u0001\u0001\u0000\u0000\u0001", true, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.onRebind.class.getName());
        com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        IccPrivateKeyCrtComponentsJson = (values + 109) % 128;
        return true;
    }

    private static void c(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char c2;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            $10 = ($11 + 1) % 128;
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr2 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray.length;
        char[] cArr4 = new char[length2];
        short s = 0;
        java.lang.System.arraycopy(cArr2, 0, cArr3, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $10 = ($11 + 3) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", s, s) + 71, (android.util.TypedValue.complexToFloat(s) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(s) == 0.0f ? 0 : -1)) + 1179, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(s, s, s, objArr3);
                    java.lang.String str4 = (java.lang.String) objArr3[s];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[s] = java.lang.Object.class;
                    obj = cls.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(s) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(s) == 0.0d ? 0 : -1)) + 30, (android.util.TypedValue.complexToFraction(s, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(s, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3443, (char) (android.graphics.drawable.Drawable.resolveOpacity(s, s) + 3831));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[s] = java.lang.Object.class;
                    obj2 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                char c3 = cArr3[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[2] = java.lang.Integer.valueOf(cArr4[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c3 * 32718);
                objArr5[s] = getwalletdata;
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 26, android.text.TextUtils.getOffsetAfter("", s) + 1864, (char) (41775 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)));
                    byte b = (byte) ($$e & 11);
                    byte b2 = (byte) (b - 3);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d(b, b2, b2, objArr6);
                    obj3 = cls3.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 28, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3133, (char) android.view.KeyEvent.getDeadChar(0, 0));
                    byte length4 = (byte) $$d.length;
                    byte b3 = (byte) (length4 - 4);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d(length4, b3, b3, objArr8);
                    c2 = 2;
                    obj4 = cls4.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((charArray2[getwalletdata.writeReplace] ^ cArr3[intValue2]) ^ (DigitizedCardProfile ^ 1263759066225628708L)) ^ ((int) (valueOf ^ 1263759066225628708L))) ^ ((char) (writeReplace ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                s = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str5 = new java.lang.String(cArr5);
        $10 = ($11 + 53) % 128;
        objArr[0] = str5;
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str2 = str;
        int i = $11;
        $10 = (i + 17) % 128;
        byte[] bArr = str2;
        if (str2 != null) {
            int i2 = i + 3;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = AlternateContactlessPaymentDataJson;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                $10 = ($11 + 103) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i5];
                    objArr2[0] = java.lang.Integer.valueOf(cArr2[i9]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.Color.green(0), 2806 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                        cArr = cArr2;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((byte) ($$e & 15), (short) 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr = cArr2;
                    }
                    cArr3[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i9++;
                    cArr2 = cArr;
                    i5 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i6];
        java.lang.System.arraycopy(cArr2, i4, cArr4, 0, i6);
        if (bArr2 != null) {
            char[] cArr5 = new char[i6];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i6) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    char c2 = cArr4[getaccounttype.writeReplace];
                    java.lang.Object[] objArr4 = new java.lang.Object[2];
                    objArr4[1] = java.lang.Integer.valueOf(c);
                    objArr4[i3] = java.lang.Integer.valueOf(c2);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(i3) + 45, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2835, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                        byte b = (byte) ($$e & 13);
                        byte b2 = (byte) (b - 5);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d(b, b2, b2, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr5[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.indexOf("", ""), 2880 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        d((short) 9, (short) 0, 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr5[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 34, 212 - android.view.View.resolveSize(0, 0), (char) android.graphics.Color.red(0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                i3 = 0;
            }
            cArr4 = cArr5;
        }
        if (i8 > 0) {
            char[] cArr6 = new char[i6];
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i6);
            int i12 = i6 - i8;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i12, i8);
            java.lang.System.arraycopy(cArr6, i8, cArr4, 0, i12);
        }
        if (z) {
            int i13 = $10 + 5;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr7 = new char[i6];
            int i15 = 0;
            while (true) {
                getaccounttype.writeReplace = i15;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                $10 = ($11 + 1) % 128;
                cArr7[getaccounttype.writeReplace] = cArr4[(i6 - getaccounttype.writeReplace) - 1];
                i15 = getaccounttype.writeReplace + 1;
            }
            cArr4 = cArr7;
        }
        if (i7 > 0) {
            int i16 = 0;
            while (true) {
                getaccounttype.writeReplace = i16;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i16 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        values = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        AlternateContactlessPaymentDataJson = new char[]{16876, 16773, 16887, 16768, 16768, 16891, 16711, 16596, 16601, 16577, 16590, 16656, 16672, 16604, 16598, 16594, 16601, 16603, 16589, 16677, 16703, 16698, 16685, 16698, 16604, 16598, 16594, 16601, 16603, 16589, 16677, 16700, 16679, 16677, 16590, 16699, 16674, 16889, 16831, 16799, 16886, 16791, 16800, 16831, 16802, 16800, 16824, 16804, 16809, 16807, 16805, 16830, 16802, 16808, 16775, 16774, 16807, 16800, 16831, 16802, 16578, 16580, 16695, 16665, 16600, 16599, 16665, 16595, 16601, 16576, 16595, 16601, 16598, 16578, 16665, 16579, 16604, 16598, 16597, 16579, 16601, 16580, 16598, 16577, 16601, 16700, 16576, 16606, 16580, 16602, 16735, 16599, 16600, 16601, 16605, 16603, 16603, 16597, 16579, 16580, 16593, 16878, 16791, 16828, 16807, 16803, 16824, 16831, 16790, 16787, 16824, 16802, 16799, 16740, 16742, 16750, 16746, 16747, 16747, 16738, 16767, 16743, 16732, 16732, 16740, 16742, 16745, 16743, 16745, 16745, 16746, 16854, 16894, 16782, 16815, 16803, 16805, 16806, 16808, 16802, 16806, 16808, 16807, 16808, 16802, 16813, 16810, 16805, 16808, 16809, 16810, 16805, 16808, 16776};
        DigitizedCardProfile = 7744469709718380663L;
        valueOf = -804334044;
        writeReplace = (char) 54820;
    }

    static void init$1() {
        $$d = new byte[]{123, 115, -118, 86};
        $$e = 215;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.EM, -31, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.DC4, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
    }

    public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2) {
        int i3;
        char c = 0;
        int i4 = 1;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i5 = ~((~i) | 714908617);
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((714384320 | i5) * (-970)) + 1959416638 + ((i5 | 524297) * 970))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 2713 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                    byte b = $$a[14];
                    byte b2 = (byte) (b + 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b2, b2, b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                return objArr;
            }
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                c("㬃딅䷝鄥\uf542㮠䒀䋆錝膮尚络୕\uf1d3\uf564敲侾化ﳞ栗\u2e7a㜠욡蟾\ud995졹黃⊺Ꮒ淭䄬㮲疢뭍맟釐鳉磡", "三\uec2f앤崛", 1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "뙓閇␇竰", (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr4);
                java.lang.Object[] objArr5 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr4[0]).intern()), 2);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                c("ᆼ섕榦Ἦ렡롩㐓ͷ㭷汱콻\ud897鏹楖뤂\udaeb㋫鍻吺틅쳕죱ꔧᬶᣌ㦘翆苜뮟揪ꑀ", "⹚⩏⒍䫌", (-1926607057) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), "뙓閇␇竰", (char) (52259 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr6);
                try {
                    java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    c("㬃딅䷝鄥\uf542㮠䒀䋆錝膮尚络୕\uf1d3\uf564敲侾化ﳞ栗\u2e7a㜠욡蟾\ud995졹黃⊺Ꮒ淭䄬㮲疢뭍맟釐鳉磡", "三\uec2f앤崛", android.text.TextUtils.indexOf("", ""), "뙓閇␇竰", (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr8);
                    objArr5[0] = java.lang.Class.forName(((java.lang.String) objArr8[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(new int[]{6, 31, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 31}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, objArr9);
                    try {
                        java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        c("㬃딅䷝鄥\uf542㮠䒀䋆錝膮尚络୕\uf1d3\uf564敲侾化ﳞ栗\u2e7a㜠욡蟾\ud995졹黃⊺Ꮒ淭䄬㮲疢뭍맟釐鳉磡", "三\uec2f앤崛", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, "뙓閇␇竰", (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr11);
                        objArr5[1] = java.lang.Class.forName(((java.lang.String) objArr11[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                        try {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            a(new int[]{37, 23, 0, 10}, "\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", false, objArr12);
                            java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            c("ɮ痞蹇適飳앟䉿⟸\uf714\ued5b뻨吅괙틂姡狋婒", "\ue68b௮ₓ⓯", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1827934491, "뙓閇␇竰", (char) (61216 - android.view.View.MeasureSpec.getSize(0)), objArr13);
                            java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null);
                            try {
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                a(new int[]{37, 23, 0, 10}, "\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", false, objArr14);
                                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr14[0]).intern());
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                c("╦篆恋稕ﳜ新䙟寊㙎齹폨ᙧ俁뼇", "棎酕㨒큉", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, "뙓閇␇竰", (char) (18746 - android.view.View.resolveSize(0, 0)), objArr15);
                                try {
                                    java.lang.Object[] objArr16 = {cls3.getMethod(((java.lang.String) objArr15[0]).intern(), null).invoke(context, null), 64};
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    c("\ufbd0秒巡\udbad∢㫩輟枮췹誗藤᬴鮓ű郛瀌匱㬶쫿繍ꯙ\ue912㴕䌀䣮᎗瀽䠐䖚ᥣ飘珇꺴", "慢茶鈲䶙", 855244385 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "뙓閇␇竰", (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr17);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr17[0]).intern());
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    c("鶅팍\u0e7f\ue0a2\ueb6a욘䑯鹿풚撮涹퉹\ud928輩", "\uf8d4鋿\ue100ꎌ", android.view.ViewConfiguration.getTouchSlop() >> 8, "뙓閇␇竰", (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 36065), objArr18);
                                    java.lang.Object invoke2 = cls4.getMethod(((java.lang.String) objArr18[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    a(new int[]{60, 30, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 22}, null, true, objArr19);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    c("찒뛅◑櫉ȃ鈺\uf100䐙䒚ⸯ", "쟴\ufbcf쭏掔", android.text.TextUtils.getCapsMode("", 0, 0), "뙓閇␇竰", (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr20);
                                    java.lang.Object[] objArr21 = (java.lang.Object[]) cls5.getField(((java.lang.String) objArr20[0]).intern()).get(invoke2);
                                    int length = objArr21.length;
                                    int i6 = 0;
                                    while (i6 < length) {
                                        java.lang.Object obj2 = objArr21[i6];
                                        java.lang.Object[] objArr22 = new java.lang.Object[i4];
                                        c("鉦ꤋ趡\u20c9\uf5f1", "쑡䎤눩枙", android.view.KeyEvent.keyCodeFromString("") + 692298948, "뙓閇␇竰", (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 39346), objArr22);
                                        try {
                                            java.lang.Object[] objArr23 = {((java.lang.String) objArr22[c]).intern()};
                                            java.lang.Object[] objArr24 = new java.lang.Object[i4];
                                            c("뿇\ue302ᖥ\ue186䌥톽茞囜ᓿ蔗ϖꭓ㽥鉵톭\ufbc7ꄀය즩賄\ue9df\ue5d4䮇舋흛鍻\u2456ᇵ폒埸靫ꐑᱲ༤\ud8cf鋵瓿", "ꊽ賝\udcb8␜", (-1198727774) - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "뙓閇␇竰", (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr24);
                                            java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr24[c]).intern());
                                            java.lang.Object[] objArr25 = new java.lang.Object[i4];
                                            a(new int[]{90, 11, 175, 5}, "\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001", false, objArr25);
                                            java.lang.String intern = ((java.lang.String) objArr25[0]).intern();
                                            java.lang.Class<?>[] clsArr = new java.lang.Class[i4];
                                            clsArr[0] = java.lang.String.class;
                                            java.lang.Object invoke3 = cls6.getMethod(intern, clsArr).invoke(null, objArr23);
                                            try {
                                                java.lang.Object[] objArr26 = new java.lang.Object[i4];
                                                c("킦鼸\ue28b鱽獀曱喐䳑莌殜姷믤ᒼଫ\uf349뾔샚剬䖫ᝬ棐ꍡ赁\ue960ڄ壢⨙쀽", "\uec4b\u001c栢崃", android.view.View.MeasureSpec.getMode(0), "뙓閇␇竰", (char) (872 - android.text.TextUtils.indexOf("", "")), objArr26);
                                                java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr26[0]).intern());
                                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                a(new int[]{101, 11, 0, 5}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr27);
                                                try {
                                                    java.lang.Object[] objArr28 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod(((java.lang.String) objArr27[0]).intern(), null).invoke(obj2, null))};
                                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                    c("뿇\ue302ᖥ\ue186䌥톽茞囜ᓿ蔗ϖꭓ㽥鉵톭\ufbc7ꄀය즩賄\ue9df\ue5d4䮇舋흛鍻\u2456ᇵ폒埸靫ꐑᱲ༤\ud8cf鋵瓿", "ꊽ賝\udcb8␜", android.text.TextUtils.getOffsetBefore("", 0) - 1198727774, "뙓閇␇竰", (char) android.text.TextUtils.indexOf("", "", 0, 0), objArr29);
                                                    java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                    a(new int[]{112, 19, 62, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", true, objArr30);
                                                    java.lang.Object invoke4 = cls8.getMethod(((java.lang.String) objArr30[0]).intern(), java.io.InputStream.class).invoke(invoke3, objArr28);
                                                    int length2 = objArr5.length;
                                                    for (int i7 = 0; i7 < 2; i7++) {
                                                        java.lang.Object obj3 = objArr5[i7];
                                                        try {
                                                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                            c("頉秛\ue14bꀄɖ餙ꩡ挂\udfa1\ue93b栄遐냼跺襀ꪤꚯओℊ娹ꏶ裀\u05f6陒潬淪呜\ue4a0꿼鞵餥䊜騷쑰", "⚕ओ퀓∽", android.graphics.Color.blue(0), "뙓閇␇竰", (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr31);
                                                            java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr31[0]).intern());
                                                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                            a(new int[]{131, 23, 0, 11}, "\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", false, objArr32);
                                                            if (obj3.equals(cls9.getMethod(((java.lang.String) objArr32[0]).intern(), null).invoke(invoke4, null))) {
                                                                java.lang.Object[] objArr33 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                                int i8 = ~i;
                                                                try {
                                                                    java.lang.Object[] objArr34 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-944572786) | i)) | 944048400 | (~(60356199 | i))) * (-754)) + 1984303948 + (((~((-944048401) | i)) | (~(1004404599 | i8))) * (-754)) + ((i8 | (-944572786)) * 754))};
                                                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj4 == null) {
                                                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 50, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2712, (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                                        byte b3 = $$a[14];
                                                                        byte b4 = (byte) (b3 + 1);
                                                                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                        b(b4, b4, b3, objArr35);
                                                                        obj4 = cls10.getMethod((java.lang.String) objArr35[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                    }
                                                                    ((int[]) objArr33[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr34)).intValue();
                                                                    return objArr33;
                                                                } catch (java.lang.Throwable th) {
                                                                    java.lang.Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable th2) {
                                                            java.lang.Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    i6++;
                                                    c = 0;
                                                    i4 = 1;
                                                } catch (java.lang.Throwable th3) {
                                                    java.lang.Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    }
                                    i3 = i4;
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                java.lang.Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (java.lang.Throwable th9) {
                        java.lang.Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (java.lang.Throwable th10) {
                    java.lang.Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (java.lang.Throwable unused) {
                i3 = 1;
            }
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            iArr[0] = i;
            iArr2[0] = i;
            java.lang.Object[] objArr36 = {iArr, iArr2, null, new int[i3]};
            java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-266354410) | i)) | 201326825) * 1504) + 1212577112 + ((~(i | (-65027585))) * (-1504)) + 1939485088)};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj5 == null) {
                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, 2712 - android.os.Process.getGidForName(""), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                byte b5 = $$a[14];
                byte b6 = (byte) (b5 + 1);
                java.lang.Object[] objArr38 = new java.lang.Object[1];
                b(b6, b6, b5, objArr38);
                obj5 = cls11.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
            }
            ((int[]) objArr36[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr37)).intValue();
            return objArr36;
        } catch (java.lang.Throwable th11) {
            java.lang.Throwable cause11 = th11.getCause();
            if (cause11 != null) {
                throw cause11;
            }
            throw th11;
        }
    }
}
