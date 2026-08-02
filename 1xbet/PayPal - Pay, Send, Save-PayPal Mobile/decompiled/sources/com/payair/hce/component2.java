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
/* loaded from: classes10.dex */
public final class component2 implements com.payair.hce.component4 {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.component2 AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.component2 DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static final /* synthetic */ com.payair.hce.component2[] valueOf;
    public static final com.payair.hce.component2 values;
    private static char[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2 = b3 * 3;
        int i3 = 3 - (b2 * 4);
        int i4 = (b * 8) + 65;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i4;
            i4 = i5;
            i = 0;
            i4 += i6;
            bArr2[i] = (byte) i4;
            i3++;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i3];
            i4 += i6;
            bArr2[i] = (byte) i4;
            i3++;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            i3++;
            if (i == i5) {
            }
        }
    }

    private component2(java.lang.String str, int i) {
    }

    public static com.payair.hce.component2 valueOf(java.lang.String str) {
        getAid = (IccPrivateKeyCrtComponentsJson + 87) % 128;
        com.payair.hce.component2 component2Var = (com.payair.hce.component2) java.lang.Enum.valueOf(com.payair.hce.component2.class, str);
        int i = getAid + 45;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return component2Var;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.component2[] values() {
        getAid = (IccPrivateKeyCrtComponentsJson + 73) % 128;
        com.payair.hce.component2[] component2VarArr = (com.payair.hce.component2[]) valueOf.clone();
        IccPrivateKeyCrtComponentsJson = (getAid + 71) % 128;
        return component2VarArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) (android.view.KeyEvent.getDeadChar(0, 0) + 115), "\b\n", 2 - android.text.TextUtils.indexOf("", "", 0, 0), objArr);
        com.payair.hce.component2 component2Var = new com.payair.hce.component2(((java.lang.String) objArr[0]).intern(), 0);
        values = component2Var;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((byte) (72 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\t\u000b\u0006\b\n\u000e\u0003\f\u000b\u0000\u0004\u000f\u0000\n\u0007\u000b\u0003\u000e\u000e\u0004\f\u000b", android.view.MotionEvent.axisFromString("") + 23, objArr2);
        com.payair.hce.component2 component2Var2 = new com.payair.hce.component2(((java.lang.String) objArr2[0]).intern(), 1);
        DigitizedCardProfile = component2Var2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((byte) (122 - android.view.KeyEvent.keyCodeFromString("")), "\t\u000b\u0006\b\n\u000e\u0003\f\u000b\u0000\u0004\u000f\u0000\n\u0001\u0007\f\t\u000e\u0004\f\u000b", 22 - android.view.KeyEvent.getDeadChar(0, 0), objArr3);
        com.payair.hce.component2 component2Var3 = new com.payair.hce.component2(((java.lang.String) objArr3[0]).intern(), 2);
        AlternateContactlessPaymentDataJson = component2Var3;
        valueOf = new com.payair.hce.component2[]{component2Var, component2Var2, component2Var3};
        IccPrivateKeyCrtComponentsJson = (getAid + 9) % 128;
    }

    private static void a(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = $11 + 57;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = writeReplace;
        int i4 = 8;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                $11 = ($10 + 25) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getWindowTouchSlop() >> i4), (android.os.Process.myPid() >> 22) + 2508, (char) (android.os.Process.getGidForName("") + 6803));
                        byte b2 = (byte) ($$b - 1);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b2, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 8;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        long j = 0;
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2507, (char) (android.view.View.MeasureSpec.getMode(0) + 6802));
            byte b3 = (byte) ($$b - 1);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(b3, b3, b3, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i6 = $10 + 33;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                i2 = i + 5;
                cArr3[i2] = (char) (charArray[i2] - b);
            } else {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 29, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3596, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 48, android.view.Gravity.getAbsoluteGravity(0, 0) + 2665, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 18890));
                            byte b4 = (byte) $$b;
                            byte b5 = (byte) (b4 - 1);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(b4, b5, b5, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i7 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i8 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i7 * charValue) + i8];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        $11 = ($10 + 51) % 128;
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i9 = digitizedCardJson12.DigitizedCardProfile;
                        int i10 = digitizedCardJson12.RecordsJson;
                        int i11 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[(i9 * charValue) + i10];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i11 * charValue) + i12];
                    } else {
                        int i13 = digitizedCardJson12.DigitizedCardProfile;
                        int i14 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i15 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i16 = digitizedCardJson12.RecordsJson;
                        cArr3[digitizedCardJson12.values] = cArr[(i13 * charValue) + i14];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i15 * charValue) + i16];
                    }
                }
                digitizedCardJson12.values += 2;
                j = 0;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr3[i17] = (char) (cArr3[i17] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{39, 89, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 10};
        $$b = 1;
    }

    static void valueOf() {
        writeReplace = new char[]{12304, 12306, 12312, 12309, 12301, 12319, 12318, 12297, 12302, 12289, 12291, 12293, 12299, 12314, 12305, 12303};
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 1492;
    }
}
