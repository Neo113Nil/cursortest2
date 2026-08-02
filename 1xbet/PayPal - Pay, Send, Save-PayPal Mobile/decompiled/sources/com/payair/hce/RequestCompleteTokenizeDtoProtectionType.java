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
/* loaded from: classes10.dex */
public final class RequestCompleteTokenizeDtoProtectionType {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.payair.hce.RequestCompleteTokenizeDtoProtectionType[] DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    public static final com.payair.hce.RequestCompleteTokenizeDtoProtectionType valueOf;
    public static final com.payair.hce.RequestCompleteTokenizeDtoProtectionType values;
    private static char[] writeReplace;
    private int AlternateContactlessPaymentDataJson;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = (i * 2) + 107;
        byte[] bArr = $$a;
        int i4 = s2 + 4;
        int i5 = s * 2;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i5;
            i3 = (-i3) + i8;
            i4 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            int i9 = i4 + 1;
            i7 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = bArr[i9];
            i8 = i3;
            i3 = i10;
            i6 = i9;
            i3 = (-i3) + i8;
            i4 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            int i92 = i4 + 1;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i922 = i4 + 1;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    public static com.payair.hce.RequestCompleteTokenizeDtoProtectionType valueOf(java.lang.String str) {
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 85) % 128;
        com.payair.hce.RequestCompleteTokenizeDtoProtectionType requestCompleteTokenizeDtoProtectionType = (com.payair.hce.RequestCompleteTokenizeDtoProtectionType) java.lang.Enum.valueOf(com.payair.hce.RequestCompleteTokenizeDtoProtectionType.class, str);
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 73) % 128;
        return requestCompleteTokenizeDtoProtectionType;
    }

    public static com.payair.hce.RequestCompleteTokenizeDtoProtectionType[] values() {
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 55) % 128;
        com.payair.hce.RequestCompleteTokenizeDtoProtectionType[] requestCompleteTokenizeDtoProtectionTypeArr = (com.payair.hce.RequestCompleteTokenizeDtoProtectionType[]) DigitizedCardProfile.clone();
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 99) % 128;
        return requestCompleteTokenizeDtoProtectionTypeArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(true, new int[]{0, 13, 120, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr);
        com.payair.hce.RequestCompleteTokenizeDtoProtectionType requestCompleteTokenizeDtoProtectionType = new com.payair.hce.RequestCompleteTokenizeDtoProtectionType(((java.lang.String) objArr[0]).intern(), 0, 0);
        values = requestCompleteTokenizeDtoProtectionType;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(true, new int[]{13, 11, 78, 10}, null, objArr2);
        com.payair.hce.RequestCompleteTokenizeDtoProtectionType requestCompleteTokenizeDtoProtectionType2 = new com.payair.hce.RequestCompleteTokenizeDtoProtectionType(((java.lang.String) objArr2[0]).intern(), 1, 1);
        valueOf = requestCompleteTokenizeDtoProtectionType2;
        DigitizedCardProfile = new com.payair.hce.RequestCompleteTokenizeDtoProtectionType[]{requestCompleteTokenizeDtoProtectionType, requestCompleteTokenizeDtoProtectionType2};
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 99) % 128;
    }

    private RequestCompleteTokenizeDtoProtectionType(java.lang.String str, int i, int i2) {
        this.AlternateContactlessPaymentDataJson = i2;
    }

    public final int AlternateContactlessPaymentDataJson() {
        int i = (IccPrivateKeyCrtComponentsJson + 55) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i;
        int i2 = this.AlternateContactlessPaymentDataJson;
        int i3 = i + 75;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.RequestCompleteTokenizeDtoProtectionType values(int i) {
        int i2 = IccPrivateKeyCrtComponentsJson;
        SdkCoreAlternateContactlessPaymentDataImpl = (i2 + 125) % 128;
        if (i == 0) {
            return values;
        }
        if (i == 1) {
            return valueOf;
        }
        com.payair.hce.RequestCompleteTokenizeDtoProtectionType requestCompleteTokenizeDtoProtectionType = values;
        int i3 = i2 + 43;
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        if (i3 % 2 == 0) {
            return requestCompleteTokenizeDtoProtectionType;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        java.lang.String str2 = str;
        $10 = ($11 + 77) % 128;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = writeReplace;
        if (cArr2 != null) {
            $10 = ($11 + 99) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i2] = java.lang.Integer.valueOf(cArr2[i7]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.text.TextUtils.getCapsMode("", i2, i2), 2807 - android.graphics.Color.red(i2), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        cArr = cArr2;
                        b((short) 0, 1, (short) -1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr = cArr2;
                    }
                    cArr3[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    cArr2 = cArr;
                    i2 = 0;
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
        char[] cArr4 = new char[i4];
        java.lang.System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr2 != null) {
            $11 = ($10 + 109) % 128;
            char[] cArr5 = new char[i4];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i4) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i8 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 44, 2836 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((short) 0, 0, (short) -1, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr5[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2881, (char) android.graphics.Color.argb(0, 0, 0, 0));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((short) 0, 2, (short) -1, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr5[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 212 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i10 = i4 - i6;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i10, i6);
            java.lang.System.arraycopy(cArr6, i6, cArr4, 0, i10);
            $10 = ($11 + 11) % 128;
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i4];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr7[getaccounttype.writeReplace] = cArr4[(i4 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr4 = cArr7;
        }
        if (i5 > 0) {
            $10 = ($11 + 21) % 128;
            int i11 = 0;
            while (true) {
                getaccounttype.writeReplace = i11;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i11 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static void DigitizedCardProfile() {
        writeReplace = new char[]{16784, 16754, 16649, 16647, 16652, 16752, 16755, 16648, 16648, 16653, 16653, 16653, 16647, 16733, 16742, 16729, 16724, 16705, 16729, 16748, 16729, 16722, 16729, 16732};
    }

    static void init$0() {
        $$a = new byte[]{46, -52, 83, 98};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
    }
}
