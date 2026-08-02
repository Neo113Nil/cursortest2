package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'values' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes10.dex */
public final class setCardProfile {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static final /* synthetic */ com.payair.hce.setCardProfile[] DigitizedCardProfile;
    private static char IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static char getProfileVersion;
    private static char valueOf;
    private static com.payair.hce.setCardProfile values;
    public static final com.payair.hce.setCardProfile writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = (b * 3) + 4;
        int i4 = (i * 3) + 110;
        int i5 = 1 - (b2 * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3++;
            i4 += i6;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i3++;
            i4 += i6;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        }
    }

    private setCardProfile(java.lang.String str, int i) {
    }

    public static com.payair.hce.setCardProfile valueOf(java.lang.String str) {
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 99) % 128;
        com.payair.hce.setCardProfile setcardprofile = (com.payair.hce.setCardProfile) java.lang.Enum.valueOf(com.payair.hce.setCardProfile.class, str);
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 97) % 128;
        return setcardprofile;
    }

    public static com.payair.hce.setCardProfile[] values() {
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 35) % 128;
        com.payair.hce.setCardProfile[] setcardprofileArr = (com.payair.hce.setCardProfile[]) DigitizedCardProfile.clone();
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 69;
        getAid = i % 128;
        if (i % 2 != 0) {
            return setcardprofileArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getAid = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("審瀜", 2 - android.view.View.combineMeasuredStates(0, 0), objArr);
        values = new com.payair.hce.setCardProfile(((java.lang.String) objArr[0]).intern(), 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("審瀜ហ껦噃璦笾泓", 7 - android.view.View.combineMeasuredStates(0, 0), objArr2);
        com.payair.hce.setCardProfile setcardprofile = new com.payair.hce.setCardProfile(((java.lang.String) objArr2[0]).intern(), 1);
        writeReplace = setcardprofile;
        DigitizedCardProfile = new com.payair.hce.setCardProfile[]{values, setcardprofile};
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 53) % 128;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 83;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        $11 = ($10 + 7) % 128;
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            int i3 = $11 + 107;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            } else {
                cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            }
            int i4 = 58224;
            for (int i5 = 0; i5 < 16; i5++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (getProfileVersion ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
                    int i6 = c2 + i4;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.view.View.MeasureSpec.getMode(0), 1335 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.text.TextUtils.getCapsMode("", 0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                    int i7 = charValue + i4;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 62, 1334 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.text.TextUtils.indexOf("", ""));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i4 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 53, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3544, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    static void init$0() {
        $$a = new byte[]{73, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -116, -114};
        $$b = 82;
    }

    static void valueOf() {
        valueOf = (char) 62324;
        AlternateContactlessPaymentDataJson = (char) 29585;
        getProfileVersion = (char) 48291;
        IccPrivateKeyCrtComponentsJson = (char) 6015;
    }
}
