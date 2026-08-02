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
public final class getSelectedCard {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.getSelectedCard AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    public static final com.payair.hce.getSelectedCard valueOf;
    private static final /* synthetic */ com.payair.hce.getSelectedCard[] values;
    private static long writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5 = (i3 * 2) + 4;
        int i6 = i * 4;
        byte[] bArr = $$a;
        int i7 = 119 - (i2 * 2);
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            i7 = i6;
            int i8 = i5;
            int i9 = 0;
            i7 += -i5;
            i5 = i8 + 1;
            i4 = i9;
            bArr2[i4] = (byte) i7;
            i9 = i4 + 1;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = i5;
            i5 = bArr[i5];
            i7 += -i5;
            i5 = i8 + 1;
            i4 = i9;
            bArr2[i4] = (byte) i7;
            i9 = i4 + 1;
            if (i4 == i6) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i7;
            i9 = i4 + 1;
            if (i4 == i6) {
            }
        }
    }

    private getSelectedCard(java.lang.String str, int i) {
    }

    public static com.payair.hce.getSelectedCard valueOf(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson + 29;
        DigitizedCardProfile = i % 128;
        com.payair.hce.getSelectedCard getselectedcard = (com.payair.hce.getSelectedCard) java.lang.Enum.valueOf(com.payair.hce.getSelectedCard.class, str);
        if (i % 2 != 0) {
            throw null;
        }
        IccPrivateKeyCrtComponentsJson = (DigitizedCardProfile + 57) % 128;
        return getselectedcard;
    }

    public static com.payair.hce.getSelectedCard[] values() {
        IccPrivateKeyCrtComponentsJson = (DigitizedCardProfile + 55) % 128;
        com.payair.hce.getSelectedCard[] getselectedcardArr = (com.payair.hce.getSelectedCard[]) values.clone();
        IccPrivateKeyCrtComponentsJson = (DigitizedCardProfile + 25) % 128;
        return getselectedcardArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("꿵熆꾣箌넂櫩", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr);
        com.payair.hce.getSelectedCard getselectedcard = new com.payair.hce.getSelectedCard(((java.lang.String) objArr[0]).intern(), 0);
        AlternateContactlessPaymentDataJson = getselectedcard;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("ﰵ靑ﱣ䛾埕쟉줳譿ﺩ咀슕", android.graphics.Color.blue(0), objArr2);
        com.payair.hce.getSelectedCard getselectedcard2 = new com.payair.hce.getSelectedCard(((java.lang.String) objArr2[0]).intern(), 1);
        valueOf = getselectedcard2;
        values = new com.payair.hce.getSelectedCard[]{getselectedcard, getselectedcard2};
        IccPrivateKeyCrtComponentsJson = (DigitizedCardProfile + 69) % 128;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        $10 = ($11 + 95) % 128;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 95) % 128;
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(writeReplace ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $10 = ($11 + 47) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(writeReplace)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 1921, (char) (android.os.Process.myPid() >> 22));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, 1, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.indexOf("", "", 0, 0) + 429, (char) (31610 - (android.view.KeyEvent.getMaxKeyCode() >> 16)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, 0, 0, objArr5);
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
        $$a = new byte[]{70, 56, kotlin.io.encoding.Base64.padSymbol, 63};
        $$b = 45;
    }

    static void writeReplace() {
        writeReplace = -2124117005461375881L;
    }
}
