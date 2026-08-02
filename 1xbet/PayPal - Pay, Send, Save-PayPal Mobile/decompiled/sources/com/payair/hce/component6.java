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
public final class component6 {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.component6 DigitizedCardProfile;
    private static int getAid;
    public static final com.payair.hce.component6 valueOf;
    private static long values;
    private static final /* synthetic */ com.payair.hce.component6[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4 = 3 - (i2 * 4);
        int i5 = b * 2;
        int i6 = (i * 2) + 117;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i6 += i7;
            i3 = i8;
            int i9 = i4;
            int i10 = i6;
            bArr2[i3] = (byte) i10;
            i8 = i3 + 1;
            if (i3 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i9 + 1;
            i4 = i11;
            i6 = bArr[i11];
            i7 = i10;
            i6 += i7;
            i3 = i8;
            int i92 = i4;
            int i102 = i6;
            bArr2[i3] = (byte) i102;
            i8 = i3 + 1;
            if (i3 == 0 - i5) {
            }
        } else {
            i3 = 0;
            int i922 = i4;
            int i1022 = i6;
            bArr2[i3] = (byte) i1022;
            i8 = i3 + 1;
            if (i3 == 0 - i5) {
            }
        }
    }

    private component6(java.lang.String str, int i) {
    }

    public static com.payair.hce.component6 valueOf(java.lang.String str) {
        AlternateContactlessPaymentDataJson = (getAid + 31) % 128;
        com.payair.hce.component6 component6Var = (com.payair.hce.component6) java.lang.Enum.valueOf(com.payair.hce.component6.class, str);
        int i = AlternateContactlessPaymentDataJson + 115;
        getAid = i % 128;
        if (i % 2 != 0) {
            return component6Var;
        }
        throw null;
    }

    public static com.payair.hce.component6[] values() {
        getAid = (AlternateContactlessPaymentDataJson + 33) % 128;
        com.payair.hce.component6[] component6VarArr = (com.payair.hce.component6[]) writeReplace.clone();
        int i = AlternateContactlessPaymentDataJson + 39;
        getAid = i % 128;
        if (i % 2 != 0) {
            return component6VarArr;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        getAid = 1;
        DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("៊រ៵堐鄍ช븷傝", android.view.KeyEvent.getMaxKeyCode() >> 16, objArr);
        com.payair.hce.component6 component6Var = new com.payair.hce.component6(((java.lang.String) objArr[0]).intern(), 0);
        DigitizedCardProfile = component6Var;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("龎爵ຆ䅩Ɡ㢬⭏", android.view.KeyEvent.getDeadChar(0, 0), objArr2);
        com.payair.hce.component6 component6Var2 = new com.payair.hce.component6(((java.lang.String) objArr2[0]).intern(), 1);
        valueOf = component6Var2;
        writeReplace = new com.payair.hce.component6[]{component6Var, component6Var2};
        AlternateContactlessPaymentDataJson = (getAid + 73) % 128;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 1;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(values ^ (-3824242241614154557L), charArray, i);
        int i3 = 4;
        getcardholdervalidator.valueOf = 4;
        $10 = ($11 + 121) % 128;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $11 = ($10 + 1) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - i3;
            int i4 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % i3]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39, 1921 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                    byte b = (byte) ($$a[1] + 1);
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 28, 428 - android.view.MotionEvent.axisFromString(""), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 31610));
                    byte b3 = (byte) (-$$a[1]);
                    byte b4 = (byte) (b3 - 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(b3, b4, b4, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                i3 = 4;
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

    static void DigitizedCardProfile() {
        values = 3164139724417416041L;
    }

    static void init$0() {
        $$a = new byte[]{126, -1, -74, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE;
    }
}
