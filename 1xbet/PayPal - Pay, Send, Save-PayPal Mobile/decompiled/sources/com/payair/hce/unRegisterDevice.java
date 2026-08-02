package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'values' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class unRegisterDevice {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.unRegisterDevice AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.unRegisterDevice DigitizedCardProfile;
    public static final com.payair.hce.unRegisterDevice IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean SdkCoreBusinessLogicModuleImpl;
    private static char[] getAid;
    private static int getCiacDecline;
    private static int getPaymentFci;
    private static final /* synthetic */ com.payair.hce.unRegisterDevice[] getProfileVersion;
    public static final com.payair.hce.unRegisterDevice valueOf;
    public static final com.payair.hce.unRegisterDevice values;
    public static final com.payair.hce.unRegisterDevice writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = s * 3;
        byte[] bArr = $$a;
        int i4 = (s2 * 2) + 118;
        int i5 = (i * 2) + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i4 = (-i4) + i6;
            i5++;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i2 + 1;
            i6 = i4;
            i4 = bArr[i5];
            i7 = i8;
            i4 = (-i4) + i6;
            i5++;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    private unRegisterDevice(java.lang.String str, int i) {
    }

    public static com.payair.hce.unRegisterDevice valueOf(java.lang.String str) {
        int i = getPaymentFci + 91;
        getCiacDecline = i % 128;
        com.payair.hce.unRegisterDevice unregisterdevice = (com.payair.hce.unRegisterDevice) java.lang.Enum.valueOf(com.payair.hce.unRegisterDevice.class, str);
        if (i % 2 != 0) {
            return unregisterdevice;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.unRegisterDevice[] values() {
        getPaymentFci = (getCiacDecline + 49) % 128;
        com.payair.hce.unRegisterDevice[] unregisterdeviceArr = (com.payair.hce.unRegisterDevice[]) getProfileVersion.clone();
        getPaymentFci = (getCiacDecline + 23) % 128;
        return unregisterdeviceArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getPaymentFci = 0;
        getCiacDecline = 1;
        AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(null, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 127, null, "\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        com.payair.hce.unRegisterDevice unregisterdevice = new com.payair.hce.unRegisterDevice(((java.lang.String) objArr[0]).intern(), 0);
        values = unregisterdevice;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(null, 126 - android.widget.ExpandableListView.getPackedPositionChild(0L), null, "\u008b\u008a\u0082\u0089\u0088\u0083", objArr2);
        com.payair.hce.unRegisterDevice unregisterdevice2 = new com.payair.hce.unRegisterDevice(((java.lang.String) objArr2[0]).intern(), 1);
        writeReplace = unregisterdevice2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(null, 127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), null, "\u0085\u0087\u0086\u0084", objArr3);
        com.payair.hce.unRegisterDevice unregisterdevice3 = new com.payair.hce.unRegisterDevice(((java.lang.String) objArr3[0]).intern(), 2);
        AlternateContactlessPaymentDataJson = unregisterdevice3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(null, android.graphics.Color.alpha(0) + 127, null, "\u008c\u008d\u0087\u008a\u0086\u0083\u008c", objArr4);
        com.payair.hce.unRegisterDevice unregisterdevice4 = new com.payair.hce.unRegisterDevice(((java.lang.String) objArr4[0]).intern(), 3);
        valueOf = unregisterdevice4;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(null, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, "\u0091\u0084\u0086\u0090\u0085\u0087\u0086\u0084\u008e\u0085\u008c\u008d\u008f\u008e\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
        com.payair.hce.unRegisterDevice unregisterdevice5 = new com.payair.hce.unRegisterDevice(((java.lang.String) objArr5[0]).intern(), 4);
        DigitizedCardProfile = unregisterdevice5;
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(null, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, null, "\u008a\u008f\u0092\u008a\u0091\u008a\u0082", objArr6);
        com.payair.hce.unRegisterDevice unregisterdevice6 = new com.payair.hce.unRegisterDevice(((java.lang.String) objArr6[0]).intern(), 5);
        IccPrivateKeyCrtComponentsJson = unregisterdevice6;
        getProfileVersion = new com.payair.hce.unRegisterDevice[]{unregisterdevice, unregisterdevice2, unregisterdevice3, unregisterdevice4, unregisterdevice5, unregisterdevice6};
        int i = getCiacDecline + 15;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(java.lang.String str, int i, int[] iArr, java.lang.String str2, java.lang.Object[] objArr) {
        int i2;
        char[] cArr;
        java.lang.String str3 = str2;
        int i3 = $11 + 71;
        $10 = i3 % 128;
        byte[] bArr = str3;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr2 = getAid;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.text.TextUtils.indexOf("", "", 0), android.view.MotionEvent.axisFromString("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(RecordsJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46, 286 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.graphics.Color.green(0) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (SdkCoreBusinessLogicModuleImpl) {
            $11 = ($10 + 17) % 128;
            getumdgeneration.values = bArr2.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr2[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 43, 1629 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.view.View.MeasureSpec.getSize(0));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, (short) 0, (short) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        if (!SdkCoreAlternateContactlessPaymentDataImpl) {
            getumdgeneration.values = iArr.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                int i5 = $11 + 67;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    cArr5[getumdgeneration.valueOf] = (char) (cArr2[iArr[getumdgeneration.values << getumdgeneration.valueOf] >>> i] >>> intValue);
                    i2 = getumdgeneration.valueOf;
                } else {
                    cArr5[getumdgeneration.valueOf] = (char) (cArr2[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                    i2 = getumdgeneration.valueOf + 1;
                }
                getumdgeneration.valueOf = i2;
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        int i6 = $10 + 33;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            getumdgeneration.values = charArray.length;
            cArr = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 1;
        } else {
            getumdgeneration.values = charArray.length;
            cArr = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
        }
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr[getumdgeneration.valueOf] = (char) (cArr2[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1629, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, (short) 0, (short) 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void AlternateContactlessPaymentDataJson() {
        getAid = new char[]{10910, 10901, 10896, 10883, 10886, 10881, 10899, 10885, 10884, 10908, 10882, 10898, 10905, 11119, 10903, 10880, 10907, 10911};
        RecordsJson = -143185202;
        SdkCoreAlternateContactlessPaymentDataImpl = true;
        SdkCoreBusinessLogicModuleImpl = true;
    }

    static void init$0() {
        $$a = new byte[]{125, com.google.common.base.Ascii.SI, -77, -54};
        $$b = 226;
    }
}
