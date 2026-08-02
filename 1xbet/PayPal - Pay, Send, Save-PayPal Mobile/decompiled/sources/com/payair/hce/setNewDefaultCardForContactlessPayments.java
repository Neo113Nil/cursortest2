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
public final class setNewDefaultCardForContactlessPayments {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.setNewDefaultCardForContactlessPayments DigitizedCardProfile;
    private static char IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static int getProfileVersion;
    public static final com.payair.hce.setNewDefaultCardForContactlessPayments valueOf;
    public static final com.payair.hce.setNewDefaultCardForContactlessPayments values;
    private static final /* synthetic */ com.payair.hce.setNewDefaultCardForContactlessPayments[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5;
        int i6 = 3 - (i * 2);
        int i7 = (i2 * 3) + 1;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            i4 = i6;
            int i8 = i7;
            i5 = 0;
            i6 += i8;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            i4++;
            if (i5 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i4];
            i6 += i8;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            i4++;
            if (i5 == i7) {
            }
        } else {
            i3 = 0;
            i6 = 110 - (s * 4);
            i4 = i6;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            i4++;
            if (i5 == i7) {
            }
        }
    }

    private setNewDefaultCardForContactlessPayments(java.lang.String str, int i) {
    }

    public static com.payair.hce.setNewDefaultCardForContactlessPayments valueOf(java.lang.String str) {
        int i = RecordsJson + 39;
        getProfileVersion = i % 128;
        com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments = (com.payair.hce.setNewDefaultCardForContactlessPayments) java.lang.Enum.valueOf(com.payair.hce.setNewDefaultCardForContactlessPayments.class, str);
        if (i % 2 != 0) {
            return setnewdefaultcardforcontactlesspayments;
        }
        throw null;
    }

    public static com.payair.hce.setNewDefaultCardForContactlessPayments[] values() {
        int i = getProfileVersion + 67;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        com.payair.hce.setNewDefaultCardForContactlessPayments[] setnewdefaultcardforcontactlesspaymentsArr = (com.payair.hce.setNewDefaultCardForContactlessPayments[]) writeReplace.clone();
        RecordsJson = (getProfileVersion + 61) % 128;
        return setnewdefaultcardforcontactlesspaymentsArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getProfileVersion = 1;
        DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\udf3b낄⣹䥕플屜襊ќ䯎郶", android.text.TextUtils.getOffsetBefore("", 0) + 9, objArr);
        com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments = new com.payair.hce.setNewDefaultCardForContactlessPayments(((java.lang.String) objArr[0]).intern(), 0);
        values = setnewdefaultcardforcontactlesspayments;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("蓟⫈⍊库㗧涜擷諟⟎湑", 10 - android.graphics.Color.alpha(0), objArr2);
        com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments2 = new com.payair.hce.setNewDefaultCardForContactlessPayments(((java.lang.String) objArr2[0]).intern(), 1);
        DigitizedCardProfile = setnewdefaultcardforcontactlesspayments2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("␖발Ϧ戸\uda4dī␗͌", 7 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
        com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments3 = new com.payair.hce.setNewDefaultCardForContactlessPayments(((java.lang.String) objArr3[0]).intern(), 2);
        valueOf = setnewdefaultcardforcontactlesspayments3;
        writeReplace = new com.payair.hce.setNewDefaultCardForContactlessPayments[]{setnewdefaultcardforcontactlesspayments, setnewdefaultcardforcontactlesspayments2, setnewdefaultcardforcontactlesspayments3};
        int i = getProfileVersion + 105;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 99) % 128;
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
            int i2 = $10 + 29;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
                cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            } else {
                cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
                cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            }
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                $11 = ($10 + 15) % 128;
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (getAid ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                    int i5 = c2 + i3;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 62, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1335, (char) android.text.TextUtils.getCapsMode("", 0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L))) ^ r12), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
                    int i6 = charValue + i3;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 63, 1335 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((short) 0, 0, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i3 -= 40503;
                    i4++;
                    $11 = ($10 + 121) % 128;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.os.Process.myPid() >> 22), android.graphics.Color.rgb(0, 0, 0) + 16780759, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    static void DigitizedCardProfile() {
        AlternateContactlessPaymentDataJson = (char) 62346;
        IccPrivateKeyCrtComponentsJson = (char) 131;
        getAid = (char) 12419;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 46074;
    }

    static void init$0() {
        $$a = new byte[]{94, 87, -25, Byte.MAX_VALUE};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
    }
}
