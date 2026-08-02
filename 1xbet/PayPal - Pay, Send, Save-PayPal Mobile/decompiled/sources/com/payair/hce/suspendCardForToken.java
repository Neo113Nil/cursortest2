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
public final class suspendCardForToken {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.payair.hce.suspendCardForToken[] AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.suspendCardForToken DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    public static final com.payair.hce.suspendCardForToken valueOf;
    private static char[] values;
    public static final com.payair.hce.suspendCardForToken writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = 111 - (b * 2);
        byte[] bArr = $$a;
        int i3 = s2 * 4;
        int i4 = 4 - (s * 2);
        byte[] bArr2 = new byte[1 - i3];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            i2 = (-i2) + i4;
            i4 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i2;
            if (i == 0 - i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i4];
            int i7 = i4;
            i4 = i2;
            i2 = b2;
            i6 = i + 1;
            i5 = i7;
            i2 = (-i2) + i4;
            i4 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i2;
            if (i == 0 - i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == 0 - i3) {
            }
        }
    }

    private suspendCardForToken(java.lang.String str, int i) {
    }

    public static com.payair.hce.suspendCardForToken valueOf(java.lang.String str) {
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 63) % 128;
        com.payair.hce.suspendCardForToken suspendcardfortoken = (com.payair.hce.suspendCardForToken) java.lang.Enum.valueOf(com.payair.hce.suspendCardForToken.class, str);
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 97) % 128;
        return suspendcardfortoken;
    }

    public static com.payair.hce.suspendCardForToken[] values() {
        int i = IccPrivateKeyCrtComponentsJson + 121;
        RecordsJson = i % 128;
        com.payair.hce.suspendCardForToken[] suspendcardfortokenArr = AlternateContactlessPaymentDataJson;
        if (i % 2 == 0) {
            return (com.payair.hce.suspendCardForToken[]) suspendcardfortokenArr.clone();
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(false, new int[]{0, 12, 126, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", objArr);
        com.payair.hce.suspendCardForToken suspendcardfortoken = new com.payair.hce.suspendCardForToken(((java.lang.String) objArr[0]).intern(), 0);
        DigitizedCardProfile = suspendcardfortoken;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(false, new int[]{12, 14, 90, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001", objArr2);
        com.payair.hce.suspendCardForToken suspendcardfortoken2 = new com.payair.hce.suspendCardForToken(((java.lang.String) objArr2[0]).intern(), 1);
        valueOf = suspendcardfortoken2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(true, new int[]{26, 9, 0, 0}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000", objArr3);
        com.payair.hce.suspendCardForToken suspendcardfortoken3 = new com.payair.hce.suspendCardForToken(((java.lang.String) objArr3[0]).intern(), 2);
        writeReplace = suspendcardfortoken3;
        AlternateContactlessPaymentDataJson = new com.payair.hce.suspendCardForToken[]{suspendcardfortoken, suspendcardfortoken2, suspendcardfortoken3};
        int i = RecordsJson + 59;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        int i2;
        char[] cArr;
        int i3;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr2 = values;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i6];
                    objArr2[i4] = java.lang.Integer.valueOf(cArr2[i10]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", c, i4) + 30, (android.widget.ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)) + 2808, (char) android.view.View.resolveSize(i4, i4));
                        byte b = (byte) ($$b & 7);
                        byte b2 = (byte) (b - 1);
                        cArr = cArr2;
                        i3 = length;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr = cArr2;
                        i3 = length;
                    }
                    cArr3[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i10++;
                    cArr2 = cArr;
                    length = i3;
                    i4 = 0;
                    i6 = 1;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
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
        char[] cArr4 = new char[i7];
        java.lang.System.arraycopy(cArr2, i5, cArr4, 0, i7);
        if (bArr2 != null) {
            char[] cArr5 = new char[i7];
            getaccounttype.writeReplace = 0;
            char c2 = 0;
            while (getaccounttype.writeReplace < i7) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.NAK, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 2, (short) 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr5[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i12 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 2880 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((byte) 0, (short) 0, (short) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr5[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 34, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 211, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                $10 = ($11 + 1) % 128;
            }
            cArr4 = cArr5;
        }
        if (i9 > 0) {
            int i13 = $11 + 105;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                char[] cArr6 = new char[i7];
                java.lang.System.arraycopy(cArr4, 1, cArr6, 1, i7);
                i = 0;
                java.lang.System.arraycopy(cArr6, 0, cArr4, i7 % i9, i9);
                java.lang.System.arraycopy(cArr6, i9, cArr4, 1, i7 << i9);
            } else {
                i = 0;
                char[] cArr7 = new char[i7];
                java.lang.System.arraycopy(cArr4, 0, cArr7, 0, i7);
                int i14 = i7 - i9;
                java.lang.System.arraycopy(cArr7, 0, cArr4, i14, i9);
                java.lang.System.arraycopy(cArr7, i9, cArr4, 0, i14);
            }
        } else {
            i = 0;
        }
        if (z) {
            $11 = ($10 + 21) % 128;
            char[] cArr8 = new char[i7];
            getaccounttype.writeReplace = i;
            while (getaccounttype.writeReplace < i7) {
                int i15 = $11 + 11;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr8[getaccounttype.writeReplace] = cArr4[i7 >>> getaccounttype.writeReplace];
                    i2 = getaccounttype.writeReplace;
                } else {
                    cArr8[getaccounttype.writeReplace] = cArr4[(i7 - getaccounttype.writeReplace) - 1];
                    i2 = getaccounttype.writeReplace + 1;
                }
                getaccounttype.writeReplace = i2;
            }
            $11 = ($10 + 25) % 128;
            cArr4 = cArr8;
        }
        if (i8 > 0) {
            int i16 = 0;
            while (true) {
                getaccounttype.writeReplace = i16;
                if (getaccounttype.writeReplace >= i7) {
                    break;
                }
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i16 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static void init$0() {
        $$a = new byte[]{34, -19, 77, -23};
        $$b = 57;
    }

    static void valueOf() {
        values = new char[]{16814, 16655, 16655, 16644, 16641, 16666, 16640, 16650, 16641, 16644, 16645, 16666, 16798, 16749, 16748, 16742, 16740, 16721, 16751, 16748, 16738, 16741, 16723, 16723, 16744, 16741, 16876, 16774, 16772, 16772, 16795, 16799, 16773, 16775, 16780};
    }
}
