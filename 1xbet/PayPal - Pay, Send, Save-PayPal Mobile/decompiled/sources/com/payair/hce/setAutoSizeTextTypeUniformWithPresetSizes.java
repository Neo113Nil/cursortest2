package com.payair.hce;

/* loaded from: classes4.dex */
public final class setAutoSizeTextTypeUniformWithPresetSizes implements com.payair.hce.setSelectedGroup {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static char valueOf;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i * 4;
        int i5 = (b * 8) + 65;
        byte[] bArr = $$a;
        int i6 = 3 - (i2 * 2);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i5 += -i6;
            i6 = i7;
            i3 = i8;
            int i9 = i6 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i3 + 1;
            i7 = i9;
            i6 = bArr[i9];
            i8 = i10;
            i5 += -i6;
            i6 = i7;
            i3 = i8;
            int i92 = i6 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            int i922 = i6 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        if (obj instanceof java.lang.String) {
            int i = DigitizedCardProfile + 47;
            values = i % 128;
            if (i % 2 != 0) {
                java.lang.Enum valueOf2 = java.lang.Enum.valueOf((java.lang.Class) type, obj.toString());
                DigitizedCardProfile = (values + 39) % 128;
                return valueOf2;
            }
            throw new java.lang.ArithmeticException();
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0006\u0004\u0011\u0000\u0000\f\u0013\u0016\u0011\u0006\u0004\f\u0016\u0013\u0000\u0003\u0002\u0016\u0000\u0003\f\u0016\u0003\f\u0013\u0016\u0006\u0007\u0002\b\u0004\u0007\u0002\u0003\f\u0016\u0001\u0007\u0017\u0013\u0010\t\b\u0003\b\u0007\u0016\u0001\f\u0012\u0015\u0004\b\u0016\u0016\t\u0007\u0016\u0011\u0007\u0006\u0004", android.view.KeyEvent.normalizeMetaState(0) + 62, (byte) (68 - android.os.Process.getGidForName("")), objArr);
        throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr[0]).intern(), setongroupexpandlistener.AlternateContactlessPaymentDataJson(), obj, type));
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        $10 = ($11 + 83) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = AlternateContactlessPaymentDataJson;
        int i3 = 6;
        int i4 = 11;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                $10 = ($11 + i4) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 49, 2508 - ((android.os.Process.getThreadPriority(0) + 20) >> i3), (char) (6802 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = 6;
                    i4 = 11;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(valueOf)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2509, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6802));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((byte) 0, 0, 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        int i6 = 2;
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    int i7 = $11 + 79;
                    $10 = i7 % 128;
                    if (i7 % i6 != 0) {
                        cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf * b);
                        cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.writeReplace / b);
                    } else {
                        cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                        cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    }
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[13];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[8] = java.lang.Integer.valueOf(charValue);
                    objArr6[7] = digitizedCardJson12;
                    objArr6[6] = digitizedCardJson12;
                    objArr6[5] = java.lang.Integer.valueOf(charValue);
                    objArr6[4] = digitizedCardJson12;
                    objArr6[3] = digitizedCardJson12;
                    objArr6[i6] = java.lang.Integer.valueOf(charValue);
                    objArr6[1] = digitizedCardJson12;
                    objArr6[0] = digitizedCardJson12;
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.KeyEvent.normalizeMetaState(0), android.view.MotionEvent.axisFromString("") + 3597, (char) android.view.KeyEvent.keyCodeFromString(""));
                        java.lang.Class<?>[] clsArr = new java.lang.Class[13];
                        clsArr[0] = java.lang.Object.class;
                        clsArr[1] = java.lang.Object.class;
                        clsArr[i6] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Object.class;
                        clsArr[4] = java.lang.Object.class;
                        clsArr[5] = java.lang.Integer.TYPE;
                        clsArr[6] = java.lang.Object.class;
                        clsArr[7] = java.lang.Object.class;
                        clsArr[8] = java.lang.Integer.TYPE;
                        clsArr[9] = java.lang.Object.class;
                        clsArr[10] = java.lang.Object.class;
                        clsArr[11] = java.lang.Integer.TYPE;
                        clsArr[12] = java.lang.Object.class;
                        obj3 = cls3.getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = new java.lang.Object[11];
                        objArr7[10] = digitizedCardJson12;
                        objArr7[9] = java.lang.Integer.valueOf(charValue);
                        objArr7[8] = digitizedCardJson12;
                        objArr7[7] = java.lang.Integer.valueOf(charValue);
                        objArr7[6] = java.lang.Integer.valueOf(charValue);
                        objArr7[5] = digitizedCardJson12;
                        objArr7[4] = digitizedCardJson12;
                        objArr7[3] = java.lang.Integer.valueOf(charValue);
                        objArr7[i6] = java.lang.Integer.valueOf(charValue);
                        objArr7[1] = digitizedCardJson12;
                        objArr7[0] = digitizedCardJson12;
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 48, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2665, (char) (18889 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                            byte b2 = (byte) ($$b & 7);
                            byte b3 = (byte) (b2 - 1);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(b2, b3, b3, objArr8);
                            obj4 = cls4.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i8 * charValue) + i9];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i10 = digitizedCardJson12.DigitizedCardProfile;
                        int i11 = digitizedCardJson12.RecordsJson;
                        int i12 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[(i10 * charValue) + i11];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i12 * charValue) + i13];
                    } else {
                        int i14 = digitizedCardJson12.DigitizedCardProfile;
                        int i15 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i16 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i17 = digitizedCardJson12.RecordsJson;
                        cArr3[digitizedCardJson12.values] = cArr[(i14 * charValue) + i15];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i16 * charValue) + i17];
                    }
                }
                digitizedCardJson12.values += 2;
                i6 = 2;
            }
        }
        int i18 = 0;
        while (i18 < i) {
            int i19 = $10 + 99;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                cArr3[i18] = (char) (cArr3[i18] ^ 28044);
                i18 += 30;
            } else {
                cArr3[i18] = (char) (cArr3[i18] ^ 13722);
                i18++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        values = 1;
        AlternateContactlessPaymentDataJson = new char[]{1490, 12345, 12394, 12344, 12349, 12348, 12335, 12350, 1489, 12399, 12302, 1491, 12332, 12329, 12321, 12400, 12397, 12325, 12351, 12327, 1492, 12334, 12322, 12331, 12324};
        valueOf = (char) 1493;
    }

    static void init$0() {
        $$a = new byte[]{107, -45, -30, com.google.common.base.Ascii.FS};
        $$b = 129;
    }
}
