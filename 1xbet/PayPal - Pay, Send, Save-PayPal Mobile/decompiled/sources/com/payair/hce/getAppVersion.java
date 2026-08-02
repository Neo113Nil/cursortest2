package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'writeReplace' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class getAppVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.getAppVersion AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.getAppVersion DigitizedCardProfile;
    private static char IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static char getProfileVersion;
    private static final /* synthetic */ com.payair.hce.getAppVersion[] valueOf;
    private static char values;
    public static final com.payair.hce.getAppVersion writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = (b2 * 4) + 110;
        byte[] bArr = $$a;
        int i4 = i * 4;
        int i5 = (b * 4) + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            i2 = 0;
            i3 = i6;
            i5++;
            i3 += i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i5];
            i5++;
            i3 += i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    private getAppVersion(java.lang.String str, int i) {
    }

    public static com.payair.hce.getAppVersion valueOf(java.lang.String str) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 3;
        getAid = i % 128;
        com.payair.hce.getAppVersion getappversion = (com.payair.hce.getAppVersion) java.lang.Enum.valueOf(com.payair.hce.getAppVersion.class, str);
        if (i % 2 != 0) {
            return getappversion;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.getAppVersion[] values() {
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 9) % 128;
        com.payair.hce.getAppVersion[] getappversionArr = (com.payair.hce.getAppVersion[]) valueOf.clone();
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 17) % 128;
        return getappversionArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getAid = 1;
        DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("⃔씫\ue677燈", 3 - android.text.TextUtils.getOffsetAfter("", 0), objArr);
        com.payair.hce.getAppVersion getappversion = new com.payair.hce.getAppVersion(((java.lang.String) objArr[0]).intern(), 0);
        writeReplace = getappversion;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("빬빜", 3 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
        com.payair.hce.getAppVersion getappversion2 = new com.payair.hce.getAppVersion(((java.lang.String) objArr2[0]).intern(), 1);
        DigitizedCardProfile = getappversion2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("㼴쨌쿵勃\udcd6쳓猲㕱", 7 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
        com.payair.hce.getAppVersion getappversion3 = new com.payair.hce.getAppVersion(((java.lang.String) objArr3[0]).intern(), 2);
        AlternateContactlessPaymentDataJson = getappversion3;
        valueOf = new com.payair.hce.getAppVersion[]{getappversion, getappversion2, getappversion3};
        int i = getAid + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $11;
        $10 = (i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        if (str != null) {
            int i3 = i2 + 85;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (true) {
            java.lang.Object obj = null;
            if (getproducttype.AlternateContactlessPaymentDataJson >= cArr2.length) {
                break;
            }
            $10 = ($11 + 91) % 128;
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (RecordsJson ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
                    int i6 = c2 + i4;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.view.KeyEvent.getDeadChar(0, 0) + 1335, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, 0, (byte) 0, objArr3);
                        obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).charValue();
                    cArr4[1] = charValue;
                    int i7 = i5;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf((charValue + i4) ^ ((charValue << 4) + ((char) (values ^ 2144259807102049818L)))), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getProfileVersion)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj3 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(61 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.graphics.Color.rgb(0, 0, 0) + 16778551, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, 0, (byte) 0, objArr5);
                        obj3 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj3);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).charValue();
                    i4 -= 40503;
                    i5 = i7 + 1;
                    obj = null;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(54 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3543, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr3, 0, i);
        int i8 = $10 + 63;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static void DigitizedCardProfile() {
        values = (char) 22577;
        getProfileVersion = (char) 20785;
        RecordsJson = (char) 12988;
        IccPrivateKeyCrtComponentsJson = (char) 22792;
    }

    static void init$0() {
        $$a = new byte[]{16, 76, 17, 34};
        $$b = 119;
    }
}
