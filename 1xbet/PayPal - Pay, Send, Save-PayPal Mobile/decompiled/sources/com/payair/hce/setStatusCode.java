package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AlternateContactlessPaymentDataJson' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class setStatusCode {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.setStatusCode AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.setStatusCode DigitizedCardProfile;
    private static char[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    public static final com.payair.hce.setStatusCode valueOf;
    private static final /* synthetic */ com.payair.hce.setStatusCode[] values;
    public static final com.payair.hce.setStatusCode writeReplace;

    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i = 111 - (s * 2);
        int i2 = (b * 4) + 4;
        int i3 = s2 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = (-i) + i3;
            i2++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i = (-bArr[i2]) + i;
            i2++;
            i4 = i5;
        }
    }

    private setStatusCode(java.lang.String str, int i) {
    }

    public static com.payair.hce.setStatusCode valueOf(java.lang.String str) {
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 125) % 128;
        com.payair.hce.setStatusCode setstatuscode = (com.payair.hce.setStatusCode) java.lang.Enum.valueOf(com.payair.hce.setStatusCode.class, str);
        int i = getAid + 21;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            return setstatuscode;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.setStatusCode[] values() {
        int i = getAid + 41;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        com.payair.hce.setStatusCode[] setstatuscodeArr = (com.payair.hce.setStatusCode[]) values.clone();
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 95) % 128;
        return setstatuscodeArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(false, new int[]{0, 7, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001", objArr);
        com.payair.hce.setStatusCode setstatuscode = new com.payair.hce.setStatusCode(((java.lang.String) objArr[0]).intern(), 0);
        AlternateContactlessPaymentDataJson = setstatuscode;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(false, new int[]{7, 11, 0, 11}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", objArr2);
        com.payair.hce.setStatusCode setstatuscode2 = new com.payair.hce.setStatusCode(((java.lang.String) objArr2[0]).intern(), 1);
        writeReplace = setstatuscode2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(true, new int[]{18, 4, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 2}, "\u0000\u0001\u0000\u0000", objArr3);
        com.payair.hce.setStatusCode setstatuscode3 = new com.payair.hce.setStatusCode(((java.lang.String) objArr3[0]).intern(), 2);
        valueOf = setstatuscode3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(false, new int[]{22, 3, 0, 0}, "\u0001\u0001\u0001", objArr4);
        com.payair.hce.setStatusCode setstatuscode4 = new com.payair.hce.setStatusCode(((java.lang.String) objArr4[0]).intern(), 3);
        DigitizedCardProfile = setstatuscode4;
        values = new com.payair.hce.setStatusCode[]{setstatuscode, setstatuscode2, setstatuscode3, setstatuscode4};
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 63;
        getAid = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        char[] cArr2;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            byte[] bytes = str2.getBytes("ISO-8859-1");
            $10 = ($11 + 95) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr3 = RecordsJson;
        long j = -1;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                $10 = ($11 + 19) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i4];
                    objArr2[i2] = java.lang.Integer.valueOf(cArr3[i8]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.os.SystemClock.currentThreadTimeMillis() > j ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == j ? 0 : -1)), 2807 - android.view.View.resolveSize(i2, i2), (char) (android.graphics.ImageFormat.getBitsPerPixel(i2) + 1));
                        byte b = (byte) ($$b & 1);
                        byte b2 = (byte) (b - 1);
                        cArr2 = cArr3;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr2 = cArr3;
                    }
                    cArr4[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i8++;
                    cArr3 = cArr2;
                    i2 = 0;
                    i4 = 1;
                    j = -1;
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
        char[] cArr5 = new char[i5];
        char c = 0;
        java.lang.System.arraycopy(cArr3, i3, cArr5, 0, i5);
        if (bArr2 != null) {
            int i9 = $10 + 49;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i5];
                getaccounttype.writeReplace = 0;
            } else {
                cArr = new char[i5];
                getaccounttype.writeReplace = 0;
                c = 0;
            }
            while (getaccounttype.writeReplace < i5) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = $11 + 63;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr5[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2836, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                            byte b3 = (byte) ($$b & 10);
                            byte b4 = (byte) (b3 - 2);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b(b3, b4, b4, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                        }
                        cArr[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i12 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr5[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 45, android.text.TextUtils.getOffsetBefore("", 0) + 2836, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte b5 = (byte) ($$b & 10);
                        byte b6 = (byte) (b5 - 2);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b(b5, b6, b6, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i13 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr5[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.getDefaultSize(0, 0), 2880 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b((short) 0, (short) 0, (byte) 0, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr[i13] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 34, 213 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr5 = cArr;
        }
        if (i7 > 0) {
            char[] cArr6 = new char[i5];
            i = 0;
            java.lang.System.arraycopy(cArr5, 0, cArr6, 0, i5);
            int i14 = i5 - i7;
            java.lang.System.arraycopy(cArr6, 0, cArr5, i14, i7);
            java.lang.System.arraycopy(cArr6, i7, cArr5, 0, i14);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i5];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                int i15 = $11 + 17;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr7[getaccounttype.writeReplace] = cArr5[getaccounttype.writeReplace + i5];
                    i = getaccounttype.writeReplace;
                } else {
                    cArr7[getaccounttype.writeReplace] = cArr5[(i5 - getaccounttype.writeReplace) - 1];
                    i = getaccounttype.writeReplace + 1;
                }
            }
            cArr5 = cArr7;
        }
        if (i6 > 0) {
            int i16 = 0;
            while (true) {
                getaccounttype.writeReplace = i16;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                cArr5[getaccounttype.writeReplace] = (char) (cArr5[getaccounttype.writeReplace] - iArr[2]);
                i16 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void AlternateContactlessPaymentDataJson() {
        RecordsJson = new char[]{16868, 16799, 16770, 16770, 16768, 16797, 16796, 16879, 16775, 16768, 16799, 16772, 16780, 16773, 16798, 16774, 16770, 16797, 16710, 16582, 16585, 16576, 16870, 16799, 16772};
    }

    static void init$0() {
        $$a = new byte[]{58, -44, -87, com.visa.cbp.getEncExpo.IResultReceiver2};
        $$b = 215;
    }
}
