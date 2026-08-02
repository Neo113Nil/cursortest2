package com.payair.hce;

/* loaded from: classes4.dex */
public final class VisaReperso extends java.lang.Exception {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char[] valueOf;
    private static int values;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = b + 4;
        byte[] bArr = $$a;
        int i5 = 111 - (i * 2);
        int i6 = i2 * 2;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            int i9 = i4;
            int i10 = (-i4) + i7;
            i3 = i8;
            int i11 = i9;
            i5 = i10;
            i4 = i11;
            int i12 = i4 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = i5;
            i9 = i12;
            i4 = bArr[i12];
            i8 = i3 + 1;
            i7 = i13;
            int i102 = (-i4) + i7;
            i3 = i8;
            int i112 = i9;
            i5 = i102;
            i4 = i112;
            int i122 = i4 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            int i1222 = i4 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VisaReperso(java.lang.String str, java.lang.String str2) {
        super(r0.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 3, 0, 3}, "\u0000\u0000\u0000", false, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(str);
        this.DigitizedCardProfile = str2;
        this.writeReplace = str;
    }

    public final java.lang.String writeReplace() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i + 77;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.DigitizedCardProfile;
        values = (i + 25) % 128;
        return str;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        int i = (AlternateContactlessPaymentDataJson + 57) % 128;
        values = i;
        java.lang.String str = this.writeReplace;
        AlternateContactlessPaymentDataJson = (i + 79) % 128;
        return str;
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            int i2 = $10 + 21;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = valueOf;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            $10 = ($11 + 103) % 128;
            int i9 = 0;
            while (i9 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i5];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr2[i9]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.RS, 2807 - android.view.View.MeasureSpec.getMode(i3), (char) ((-1) - android.text.TextUtils.lastIndexOf("", c, i3, i3)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        cArr = cArr2;
                        b((byte) -1, 1, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr = cArr2;
                    }
                    cArr3[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i9++;
                    cArr2 = cArr;
                    i3 = 0;
                    i5 = 1;
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
        char[] cArr4 = new char[i6];
        java.lang.System.arraycopy(cArr2, i4, cArr4, 0, i6);
        if (bArr2 != null) {
            $10 = ($11 + 13) % 128;
            char[] cArr5 = new char[i6];
            getaccounttype.writeReplace = 0;
            $10 = ($11 + 9) % 128;
            char c2 = 0;
            while (getaccounttype.writeReplace < i6) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2788, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) -1, 2, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr5[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2880 - android.text.TextUtils.indexOf("", "", 0, 0), (char) android.graphics.Color.green(0));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((byte) -1, 0, 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr5[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 34, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr4 = cArr5;
        }
        if (i8 > 0) {
            char[] cArr6 = new char[i6];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i6);
            int i12 = i6 - i8;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i12, i8);
            java.lang.System.arraycopy(cArr6, i8, cArr4, 0, i12);
        } else {
            i = 0;
        }
        if (z) {
            $10 = ($11 + 91) % 128;
            char[] cArr7 = new char[i6];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                $11 = ($10 + 57) % 128;
                cArr7[getaccounttype.writeReplace] = cArr4[(i6 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr4 = cArr7;
        }
        if (i7 > 0) {
            int i13 = 0;
            while (true) {
                getaccounttype.writeReplace = i13;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i13 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        values = 1;
        valueOf = new char[]{16862, 16867, 16867};
    }

    static void init$0() {
        $$a = new byte[]{68, 85, -28, -99};
        $$b = 75;
    }
}
