package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'valueOf' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class gotPutData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.gotPutData AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static boolean RecordsJson;
    private static int getAid;
    private static boolean getProfileVersion;
    public static final com.payair.hce.gotPutData valueOf;
    private static int values;
    private static final /* synthetic */ com.payair.hce.gotPutData[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = i + 4;
        int i4 = b * 3;
        byte[] bArr = $$a;
        int i5 = 118 - (s * 4);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i4;
            int i8 = 0;
            int i9 = i3 + i7;
            i2 = i8;
            int i10 = i6;
            i5 = i9;
            i3 = i10;
            int i11 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i5;
            i6 = i11;
            i3 = bArr[i11];
            i8 = i2 + 1;
            i7 = i12;
            int i92 = i3 + i7;
            i2 = i8;
            int i102 = i6;
            i5 = i92;
            i3 = i102;
            int i112 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            int i1122 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    private gotPutData(java.lang.String str, int i) {
    }

    public static com.payair.hce.gotPutData valueOf(java.lang.String str) {
        IccPrivateKeyCrtComponentsJson = (getAid + 45) % 128;
        com.payair.hce.gotPutData gotputdata = (com.payair.hce.gotPutData) java.lang.Enum.valueOf(com.payair.hce.gotPutData.class, str);
        int i = getAid + 65;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return gotputdata;
        }
        throw null;
    }

    public static com.payair.hce.gotPutData[] values() {
        int i = getAid + 13;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        com.payair.hce.gotPutData[] gotputdataArr = (com.payair.hce.gotPutData[]) writeReplace.clone();
        int i2 = IccPrivateKeyCrtComponentsJson + 19;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            return gotputdataArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(null, 127 - android.view.KeyEvent.keyCodeFromString(""), null, "\u0082\u0081", objArr);
        com.payair.hce.gotPutData gotputdata = new com.payair.hce.gotPutData(((java.lang.String) objArr[0]).intern(), 0);
        valueOf = gotputdata;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(null, android.text.TextUtils.getOffsetBefore("", 0) + 127, null, "\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
        com.payair.hce.gotPutData gotputdata2 = new com.payair.hce.gotPutData(((java.lang.String) objArr2[0]).intern(), 1);
        AlternateContactlessPaymentDataJson = gotputdata2;
        writeReplace = new com.payair.hce.gotPutData[]{gotputdata, gotputdata2};
        int i = IccPrivateKeyCrtComponentsJson + 113;
        getAid = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(java.lang.String str, int i, int[] iArr, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            $10 = ($11 + 13) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = DigitizedCardProfile;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i2 = 0;
            while (i2 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 46, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - (android.view.KeyEvent.getMaxKeyCode() >> 16)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr4[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i2++;
                    $11 = ($10 + 95) % 128;
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(values)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.text.TextUtils.getOffsetBefore("", 0), 285 - android.view.MotionEvent.axisFromString(""), (char) (android.text.TextUtils.indexOf("", "", 0) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getProfileVersion) {
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.graphics.Color.blue(0) + 1629, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(-1, (byte) 0, (short) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!RecordsJson) {
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
            cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 43, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1628, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(-1, (byte) 0, (short) 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    static void DigitizedCardProfile() {
        DigitizedCardProfile = new char[]{11044, 11086, 11071, 11054, 11050, 11045, 11043};
        values = -143185250;
        RecordsJson = true;
        getProfileVersion = true;
    }

    static void init$0() {
        $$a = new byte[]{117, -82, -100, com.visa.cbp.getEncExpo.onUnminimized};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE;
    }
}
