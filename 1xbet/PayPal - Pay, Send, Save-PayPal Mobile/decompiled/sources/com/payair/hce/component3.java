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
public final class component3 {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.payair.hce.component3[] DigitizedCardProfile;
    private static int RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getProfileVersion;
    public static final com.payair.hce.component3 valueOf;
    public static final com.payair.hce.component3 values;
    private static char[] writeReplace;
    final int AlternateContactlessPaymentDataJson;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = i + 4;
        int i5 = b * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            i3 = i4;
            int i7 = i6;
            int i8 = 0;
            i4 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i3];
            i4 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            int i9 = 73 - (s * 8);
            i2 = 0;
            i3 = i4;
            i4 = i9;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public static com.payair.hce.component3 valueOf(java.lang.String str) {
        int i = RecordsJson + 25;
        getProfileVersion = i % 128;
        com.payair.hce.component3 component3Var = (com.payair.hce.component3) java.lang.Enum.valueOf(com.payair.hce.component3.class, str);
        if (i % 2 != 0) {
            return component3Var;
        }
        throw null;
    }

    public static com.payair.hce.component3[] values() {
        getProfileVersion = (RecordsJson + 101) % 128;
        com.payair.hce.component3[] component3VarArr = (com.payair.hce.component3[]) DigitizedCardProfile.clone();
        int i = RecordsJson + 5;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            return component3VarArr;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getProfileVersion = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 83), "\u0007\u0006\u0005\b\u0001\u0006\u0005\u0004\u0002\u0000\u0006\u0001", 11 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
        com.payair.hce.component3 component3Var = new com.payair.hce.component3(((java.lang.String) objArr[0]).intern(), 0, 0);
        values = component3Var;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((byte) (23 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u0001\u0006\u0005\u0004\u0002\u0000\u0006\u0001", 8 - android.graphics.Color.argb(0, 0, 0, 0), objArr2);
        com.payair.hce.component3 component3Var2 = new com.payair.hce.component3(((java.lang.String) objArr2[0]).intern(), 1, 1);
        valueOf = component3Var2;
        DigitizedCardProfile = new com.payair.hce.component3[]{component3Var, component3Var2};
        RecordsJson = (getProfileVersion + 85) % 128;
    }

    private component3(java.lang.String str, int i, int i2) {
        this.AlternateContactlessPaymentDataJson = i2;
    }

    public final int DigitizedCardProfile() {
        int i = (getProfileVersion + 13) % 128;
        RecordsJson = i;
        int i2 = this.AlternateContactlessPaymentDataJson;
        getProfileVersion = (i + 105) % 128;
        return i2;
    }

    public static com.payair.hce.component3 DigitizedCardProfile(int i) {
        if (i == 0) {
            com.payair.hce.component3 component3Var = values;
            getProfileVersion = (RecordsJson + 81) % 128;
            return component3Var;
        }
        if (i == 1) {
            com.payair.hce.component3 component3Var2 = valueOf;
            RecordsJson = (getProfileVersion + 7) % 128;
            return component3Var2;
        }
        return values;
    }

    private static void a(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        char c;
        int i3 = ($11 + 79) % 128;
        $10 = i3;
        if (str != null) {
            $11 = (i3 + 107) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = writeReplace;
        char c2 = 65535;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = $11 + 113;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 5;
            }
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i6])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 2508 - android.text.TextUtils.getOffsetBefore("", 0), (char) (6802 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(-1, (short) 1, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr4[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 50, android.text.TextUtils.indexOf("", "", 0, 0) + 2508, (char) (6803 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(-1, (short) 1, (byte) 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            int i7 = ($11 + 97) % 128;
            $10 = i7;
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
            $11 = (i7 + 73) % 128;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    c = c2;
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.view.View.combineMeasuredStates(0, 0) + 3596, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $10 = ($11 + 87) % 128;
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2666, (char) (18889 - (android.os.Process.myTid() >> 22)));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            c = 65535;
                            b(-1, (short) 0, (byte) 0, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        } else {
                            c = 65535;
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i8 * charValue) + i9];
                    } else {
                        c = 65535;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i10 = digitizedCardJson12.DigitizedCardProfile;
                            int i11 = digitizedCardJson12.RecordsJson;
                            int i12 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr5[digitizedCardJson12.values] = cArr3[(i10 * charValue) + i11];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i12 * charValue) + i13];
                        } else {
                            int i14 = digitizedCardJson12.DigitizedCardProfile;
                            int i15 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i16 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i17 = digitizedCardJson12.RecordsJson;
                            cArr5[digitizedCardJson12.values] = cArr3[(i14 * charValue) + i15];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i16 * charValue) + i17];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                c2 = c;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr5[i18] = (char) (cArr5[i18] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void init$0() {
        $$a = new byte[]{107, 115, 84, 3};
        $$b = 241;
    }

    static void writeReplace() {
        writeReplace = new char[]{12312, 12313, 12318, 12291, 12301, 12309, 12292, 12303, 12293};
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 1491;
    }
}
