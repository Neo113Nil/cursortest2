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
public final class setjSONObject {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.setjSONObject AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.setjSONObject DigitizedCardProfile;
    private static final /* synthetic */ com.payair.hce.setjSONObject[] IccPrivateKeyCrtComponentsJson;
    private static long RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getProfileVersion;
    public static final com.payair.hce.setjSONObject valueOf;
    public static final com.payair.hce.setjSONObject values;
    public static final com.payair.hce.setjSONObject writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2 = b * 2;
        byte[] bArr = $$a;
        int i3 = 3 - (b2 * 2);
        int i4 = 119 - (s * 2);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i5;
            int i7 = i3;
            i = 0;
            int i8 = i7;
            i4 = i3 + (-i6);
            i3 = i8;
            int i9 = i3 + 1;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i9];
            int i10 = i4;
            i7 = i9;
            i3 = i10;
            int i82 = i7;
            i4 = i3 + (-i6);
            i3 = i82;
            int i92 = i3 + 1;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            int i922 = i3 + 1;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    private setjSONObject(java.lang.String str, int i) {
    }

    public static com.payair.hce.setjSONObject valueOf(java.lang.String str) {
        int i = getProfileVersion + 83;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        com.payair.hce.setjSONObject setjsonobject = (com.payair.hce.setjSONObject) java.lang.Enum.valueOf(com.payair.hce.setjSONObject.class, str);
        if (i % 2 != 0) {
            return setjsonobject;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.setjSONObject[] values() {
        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 119) % 128;
        com.payair.hce.setjSONObject[] setjsonobjectArr = (com.payair.hce.setjSONObject[]) IccPrivateKeyCrtComponentsJson.clone();
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 107;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            return setjsonobjectArr;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("ⶠ⊼ⷣ撶⓺䚂棛哺㖹㲌", android.view.View.getDefaultSize(0, 0), objArr);
        com.payair.hce.setjSONObject setjsonobject = new com.payair.hce.setjSONObject(((java.lang.String) objArr[0]).intern(), 0);
        writeReplace = setjsonobject;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("뛱㝖뚵ꊜㄇ\uf87d껶\uea08껵", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr2);
        com.payair.hce.setjSONObject setjsonobject2 = new com.payair.hce.setjSONObject(((java.lang.String) objArr2[0]).intern(), 1);
        DigitizedCardProfile = setjsonobject2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("ᬋꨐᭈ쌱걋䗸코垉̞됦\ue70a漽⯪鳨", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, objArr3);
        com.payair.hce.setjSONObject setjsonobject3 = new com.payair.hce.setjSONObject(((java.lang.String) objArr3[0]).intern(), 2);
        valueOf = setjsonobject3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a("ᵾ쳶ᴮ瓈쪰が碥∠կ틛僴", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr4);
        com.payair.hce.setjSONObject setjsonobject4 = new com.payair.hce.setjSONObject(((java.lang.String) objArr4[0]).intern(), 3);
        AlternateContactlessPaymentDataJson = setjsonobject4;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a("\uf1e0䜍\uf1b5욬䅗⊏쫏ヽ\ue9ff夾\ue29a", (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr5);
        com.payair.hce.setjSONObject setjsonobject5 = new com.payair.hce.setjSONObject(((java.lang.String) objArr5[0]).intern(), 4);
        values = setjsonobject5;
        IccPrivateKeyCrtComponentsJson = new com.payair.hce.setjSONObject[]{setjsonobject, setjsonobject2, setjsonobject3, setjsonobject4, setjsonobject5};
        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 25) % 128;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        $11 = ($10 + 27) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(RecordsJson ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        $11 = ($10 + 7) % 128;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(RecordsJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 40, (-16775295) - android.graphics.Color.rgb(0, 0, 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, (short) 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 27, 429 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 31610));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, (short) 0, objArr5);
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
        java.lang.String str2 = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
        int i3 = $11 + 65;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static void init$0() {
        $$a = new byte[]{3, -108, -39, 38};
        $$b = 167;
    }

    static void valueOf() {
        RecordsJson = -3150355914908273961L;
    }
}
