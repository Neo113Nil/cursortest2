package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DigitizedCardProfile' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class checkDeviceUnlockKeys {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.checkDeviceUnlockKeys AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.checkDeviceUnlockKeys DigitizedCardProfile;
    private static final /* synthetic */ com.payair.hce.checkDeviceUnlockKeys[] IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static int getCiacDecline;
    private static int getPaymentFci;
    private static char getProfileVersion;
    public static final com.payair.hce.checkDeviceUnlockKeys valueOf;
    public static final com.payair.hce.checkDeviceUnlockKeys values;
    public static final com.payair.hce.checkDeviceUnlockKeys writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = s * 3;
        int i4 = (b * 2) + 110;
        byte[] bArr = $$a;
        int i5 = 3 - (i * 2);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            int i7 = i5;
            int i8 = i7;
            i4 = i5 + (-i6);
            i5 = i8;
            bArr2[i2] = (byte) i4;
            int i9 = i5 + 1;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i9];
            int i10 = i4;
            i7 = i9;
            i5 = i10;
            int i82 = i7;
            i4 = i5 + (-i6);
            i5 = i82;
            bArr2[i2] = (byte) i4;
            int i92 = i5 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            int i922 = i5 + 1;
            if (i2 == i3) {
            }
        }
    }

    private checkDeviceUnlockKeys(java.lang.String str, int i) {
    }

    public static com.payair.hce.checkDeviceUnlockKeys valueOf(java.lang.String str) {
        getPaymentFci = (getCiacDecline + 17) % 128;
        com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys = (com.payair.hce.checkDeviceUnlockKeys) java.lang.Enum.valueOf(com.payair.hce.checkDeviceUnlockKeys.class, str);
        int i = getCiacDecline + 21;
        getPaymentFci = i % 128;
        if (i % 2 == 0) {
            return checkdeviceunlockkeys;
        }
        throw null;
    }

    public static com.payair.hce.checkDeviceUnlockKeys[] values() {
        getCiacDecline = (getPaymentFci + 53) % 128;
        com.payair.hce.checkDeviceUnlockKeys[] checkdeviceunlockkeysArr = (com.payair.hce.checkDeviceUnlockKeys[]) IccPrivateKeyCrtComponentsJson.clone();
        getCiacDecline = (getPaymentFci + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return checkdeviceunlockkeysArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getPaymentFci = 0;
        getCiacDecline = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("쮖枭狏\uf19a뛽ꓶ", 5 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr);
        com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys = new com.payair.hce.checkDeviceUnlockKeys(((java.lang.String) objArr[0]).intern(), 0);
        DigitizedCardProfile = checkdeviceunlockkeys;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("酚樶櫢굧롏㬙", 5 - android.text.TextUtils.indexOf("", "", 0), objArr2);
        com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys2 = new com.payair.hce.checkDeviceUnlockKeys(((java.lang.String) objArr2[0]).intern(), 1);
        writeReplace = checkdeviceunlockkeys2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("\ue92d\uf1d2Ⳟ䤟蝭ꮳ\ue7dd瞃給좴", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 10, objArr3);
        com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys3 = new com.payair.hce.checkDeviceUnlockKeys(((java.lang.String) objArr3[0]).intern(), 2);
        valueOf = checkdeviceunlockkeys3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a("皗鬐\udcae籬훛娽搨溊", 6 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr4);
        com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys4 = new com.payair.hce.checkDeviceUnlockKeys(((java.lang.String) objArr4[0]).intern(), 3);
        AlternateContactlessPaymentDataJson = checkdeviceunlockkeys4;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a("苚嘫高窌\ue452﹉偗㚫", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7, objArr5);
        com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys5 = new com.payair.hce.checkDeviceUnlockKeys(((java.lang.String) objArr5[0]).intern(), 4);
        values = checkdeviceunlockkeys5;
        IccPrivateKeyCrtComponentsJson = new com.payair.hce.checkDeviceUnlockKeys[]{checkdeviceunlockkeys, checkdeviceunlockkeys2, checkdeviceunlockkeys3, checkdeviceunlockkeys4, checkdeviceunlockkeys5};
        int i = getPaymentFci + 57;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10;
        $11 = (i2 + 3) % 128;
        if (str != null) {
            int i3 = i2 + 77;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
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
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i4 = 58224;
            for (int i5 = 0; i5 < 16; i5++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (getAid ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getProfileVersion)};
                    int i6 = c2 + i4;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 1335 - android.view.View.getDefaultSize(0, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (SdkCoreAlternateContactlessPaymentDataImpl ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(RecordsJson)};
                    int i7 = charValue + i4;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.view.View.combineMeasuredStates(0, 0) + 1335, (char) android.view.KeyEvent.getDeadChar(0, 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((short) 0, 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i4 -= 40503;
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
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777269, 3543 - android.view.View.getDefaultSize(0, 0), (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            $10 = ($11 + 53) % 128;
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    static void init$0() {
        $$a = new byte[]{106, 94, -55, -52};
        $$b = 86;
    }

    static void writeReplace() {
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 27997;
        RecordsJson = (char) 4736;
        getAid = (char) 35807;
        getProfileVersion = (char) 38741;
    }
}
