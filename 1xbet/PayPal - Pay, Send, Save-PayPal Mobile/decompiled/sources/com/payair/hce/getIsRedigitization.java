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
/* loaded from: classes10.dex */
public final class getIsRedigitization {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int RecordsJson;
    private static com.payair.hce.getIsRedigitization valueOf;
    private static final /* synthetic */ com.payair.hce.getIsRedigitization[] values;
    public static final com.payair.hce.getIsRedigitization writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 4 - (b * 3);
        int i4 = 119 - (s2 * 2);
        int i5 = 1 - (s * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i4 = i5;
            i3++;
            i4 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i3++;
            i4 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    private getIsRedigitization(java.lang.String str, int i) {
    }

    public static com.payair.hce.getIsRedigitization valueOf(java.lang.String str) {
        int i = RecordsJson + 77;
        AlternateContactlessPaymentDataJson = i % 128;
        com.payair.hce.getIsRedigitization getisredigitization = (com.payair.hce.getIsRedigitization) java.lang.Enum.valueOf(com.payair.hce.getIsRedigitization.class, str);
        if (i % 2 == 0) {
            return getisredigitization;
        }
        throw null;
    }

    public static com.payair.hce.getIsRedigitization[] values() {
        RecordsJson = (AlternateContactlessPaymentDataJson + 27) % 128;
        com.payair.hce.getIsRedigitization[] getisredigitizationArr = (com.payair.hce.getIsRedigitization[]) values.clone();
        int i = RecordsJson + 77;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            return getisredigitizationArr;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        RecordsJson = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("륟蕠䎡뤒䳷窵큓❴鹳琝\uf8ee︍\uf7d6鶶", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr);
        com.payair.hce.getIsRedigitization getisredigitization = new com.payair.hce.getIsRedigitization(((java.lang.String) objArr[0]).intern(), 0);
        writeReplace = getisredigitization;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("䤰笂ቀ䥼늕찤膳釭渜詶꤉䢓ަ揟\uf062急㽖䒳ᯕῈ퓯ᰙ⌴㝯趆\uf5f7", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr2);
        com.payair.hce.getIsRedigitization getisredigitization2 = new com.payair.hce.getIsRedigitization(((java.lang.String) objArr2[0]).intern(), 1);
        valueOf = getisredigitization2;
        values = new com.payair.hce.getIsRedigitization[]{getisredigitization, getisredigitization2};
        RecordsJson = (AlternateContactlessPaymentDataJson + 83) % 128;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(DigitizedCardProfile ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        $11 = ($10 + 109) % 128;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $11 = ($10 + 25) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 40, 1921 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.view.View.resolveSize(0, 0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, (short) 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.Color.red(0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 429, (char) (31610 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, (short) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.ESC, -102, com.google.common.base.Ascii.SI, 46};
        $$b = 72;
    }

    static void valueOf() {
        DigitizedCardProfile = 7969851605336964379L;
    }
}
