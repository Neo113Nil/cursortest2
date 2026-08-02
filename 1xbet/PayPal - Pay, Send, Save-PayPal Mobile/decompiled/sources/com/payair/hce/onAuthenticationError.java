package com.payair.hce;

/* loaded from: classes10.dex */
public final class onAuthenticationError implements com.payair.hce.smallInitialization {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int valueOf;
    private static char[] values;
    private static char writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = i * 3;
        byte[] bArr = $$a;
        int i4 = 65 - (b * 3);
        int i5 = 4 - (b2 * 3);
        byte[] bArr2 = new byte[35 - i3];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i5++;
            i4 = (i6 + i4) - 2;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == 34 - i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i4;
            i4 = bArr[i5];
            i5++;
            i4 = (i6 + i4) - 2;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == 34 - i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == 34 - i3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = (i * 2) + 4;
        int i5 = (i2 * 2) + 65;
        int i6 = s * 2;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i5 = (-i5) + i8;
            i4++;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i3 + 1;
            i8 = i5;
            i5 = bArr[i4];
            i9 = i10;
            i5 = (-i5) + i8;
            i4++;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    @Override // com.payair.hce.smallInitialization
    public final boolean values() {
        int i = valueOf + 113;
        AlternateContactlessPaymentDataJson = i % 128;
        return i % 2 == 0;
    }

    @Override // com.payair.hce.smallInitialization
    public final boolean writeReplace(com.payair.hce.activateCardForToken activatecardfortoken) {
        int i = valueOf;
        AlternateContactlessPaymentDataJson = (i + 101) % 128;
        int i2 = i + 63;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private static void b(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 95) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        $11 = ($10 + 87) % 128;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.KeyEvent.keyCodeFromString(""), android.text.TextUtils.indexOf("", "", 0, 0) + 2073, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(0, 25, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.KeyEvent.keyCodeFromString("") + 3543, (char) android.graphics.Color.blue(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr4 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr5 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.text.TextUtils.getOffsetAfter("", 0), 3543 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.text.TextUtils.getOffsetBefore("", 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                $11 = ($10 + 49) % 128;
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void c(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        int i3 = $10 + 109;
        int i4 = i3 % 128;
        $11 = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            int i5 = i4 + 71;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = values;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i6])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2508, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(0, 0, (short) 0, objArr3);
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(writeReplace)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.View.resolveSize(0, 0), 2508 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 6802));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            d(0, 0, (short) 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                $11 = ($10 + 15) % 128;
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    int i7 = $10 + 63;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf / b);
                        int i8 = digitizedCardJson12.values;
                        throw new java.lang.ArithmeticException();
                    }
                    cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 3596, (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $11 = ($10 + 75) % 128;
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 2664 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 18889));
                            byte length2 = (byte) $$d.length;
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            d(0, length2, (byte) (length2 - 4), objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i9 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i10 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i9 * charValue) + i10];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        $10 = ($11 + 61) % 128;
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i11 = digitizedCardJson12.DigitizedCardProfile;
                        int i12 = digitizedCardJson12.RecordsJson;
                        int i13 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i14 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[(i11 * charValue) + i12];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i13 * charValue) + i14];
                    } else {
                        int i15 = digitizedCardJson12.DigitizedCardProfile;
                        int i16 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i17 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i18 = digitizedCardJson12.RecordsJson;
                        cArr5[digitizedCardJson12.values] = cArr3[(i15 * charValue) + i16];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i17 * charValue) + i18];
                    }
                }
                digitizedCardJson12.values += 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr5[i19] = (char) (cArr5[i19] ^ 13722);
        }
        java.lang.String str2 = new java.lang.String(cArr5);
        int i20 = $11 + 97;
        $10 = i20 % 128;
        if (i20 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf = 0;
        AlternateContactlessPaymentDataJson = 1;
        DigitizedCardProfile = 1889207083;
        values = new char[]{1492, 12306, 12320, 12323, 12388, 1494, 1490, 12350, 12292, 12327, 12335, 12331, 12346, 1493, 12296, 1498, 12319, 12302, 12321, 12293, 12329, 12291, 12351, 12407, 1495, 12313, 12324, 12334, 12325, 12415, 12403, 1496, 12314, 12299, 12332, 1491, 12333, 12297, 12339, 12348, 1489, 12410, 12390, 1497, 12394, 12338, 12344, 12345, 12328};
        writeReplace = (char) 1495;
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.SI, -9, -99, 67};
        $$e = 41;
    }

    static void init$0() {
        $$a = new byte[]{107, 115, 84, 3, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = 18;
    }

    public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2) {
        int i3 = 0;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i4 = ~i;
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i4 | (-126657905))) | (~(i4 | (-878271081)))) * (-867)) + 399997024 + (((~((-878271081) | i)) | 67633248 | (~(i | (-126657905)))) * (-1734)) + (((~(i | (-810637833))) | (~(i4 | (-67633249))) | (~((-59024657) | i))) * 867))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777266, 2713 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b = (byte) ($$a[14] - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b, b, b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                return objArr;
            }
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(true, "\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015", android.graphics.ImageFormat.getBitsPerPixel(0) + 166, 35 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 38 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
                java.lang.Object[] objArr5 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr4[0]).intern()), 2);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                c("$\t\u001a\u001e\u001b\u0015* \u0006\u0018-\u0010\r-\u001d+/\u000e\u001a\u001e\u001b\u0015* \u0006\u0018,#\u001e\u0017㘐", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31, (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 71), objArr6);
                try {
                    java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(true, "\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015", 165 - android.view.View.getDefaultSize(0, 0), android.widget.ExpandableListView.getPackedPositionChild(0L) + 36, 38 - android.view.View.resolveSize(0, 0), objArr8);
                    objArr5[0] = java.lang.Class.forName(((java.lang.String) objArr8[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    c(",\u001e\u0012\u0017/\u000e\u001a\u001e\u001b\u0015* \u0006\u0018,#\t\u0016(!\u00190\u001f\u0000\u00170\u0018\u0011+\u001b㘴", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 30, (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 56), objArr9);
                    try {
                        java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        b(true, "\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015", android.view.View.combineMeasuredStates(0, 0) + 165, 34 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 38 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr11);
                        objArr5[1] = java.lang.Class.forName(((java.lang.String) objArr11[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                        try {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            c("\f\u0019\u00190\u001f\u0000\u0019\u0006\u000e\"\u0015\f\f\u0018\u000b\u0000#\u001e\u0015\f\u0011\u0003㘸", 23 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (byte) (74 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr12);
                            java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            int i5 = 16;
                            b(false, "\u000e\u0003\u0001\u0010￬�\uffff\u0007�\u0003\u0001￩�\n�\u0003\u0001", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 174, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, 17 - android.text.TextUtils.indexOf("", ""), objArr13);
                            java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null);
                            try {
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                c("\f\u0019\u00190\u001f\u0000\u0019\u0006\u000e\"\u0015\f\f\u0018\u000b\u0000#\u001e\u0015\f\u0011\u0003㘸", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 23, (byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 74), objArr14);
                                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr14[0]).intern());
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                b(false, "\ufffe\u0000\b\ufffe\u0004\u0002￫\ufffe\n\u0002\u0004\u0002\u0011￭", android.graphics.Color.rgb(0, 0, 0) + 16777389, 11 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, objArr15);
                                try {
                                    java.lang.Object[] objArr16 = {cls3.getMethod(((java.lang.String) objArr15[0]).intern(), null).invoke(context, null), 64};
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    b(true, "\uffff\t\u0001\uffff￮ￌ\u000b\u000eￌ\u0012\f\u0003\u0012\f\r\u0001ￌ\u0002\u0007\r\u0010\u0002\f\uffff\u0010\u0003\u0005\uffff\f\uffff￫\u0003\u0005", 172 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.os.Process.getGidForName("") + 25, 33 - android.text.TextUtils.indexOf("", ""), objArr17);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr17[0]).intern());
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    c("&\b\u000b\u001c\r\u0012\u0019\u0012&\b\u0016\u001b\u001c\u001d", android.view.Gravity.getAbsoluteGravity(0, 0) + 14, (byte) (106 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr18);
                                    java.lang.Object invoke2 = cls4.getMethod(((java.lang.String) objArr18[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    c("\f\u0019\u00190\u001f\u0000\u0019\u0006\u000e\"\u0015\f\f\u0018\u000b\u0000\r\n\u000b'\r\u0012\u0019\u0012&\b\u0016\u001b\u001c\u001d", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 30, (byte) (30 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr19);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    c("-\u0005(\u0016\f\b\u0019+\f-", 11 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (7 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr20);
                                    java.lang.Object[] objArr21 = (java.lang.Object[]) cls5.getField(((java.lang.String) objArr20[0]).intern()).get(invoke2);
                                    int length = objArr21.length;
                                    int i6 = 0;
                                    while (i6 < length) {
                                        java.lang.Object obj2 = objArr21[i6];
                                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                                        c("\u0002\u0005\"$㗶", 5 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> i5), (byte) (84 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr22);
                                        try {
                                            java.lang.Object[] objArr23 = {((java.lang.String) objArr22[i3]).intern()};
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            b(false, "\uffff�\u0010\u0001￢�\uffff\u0010\u000b\u000e\u0015\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010\u0015ￊ\uffff\u0001\u000e\u0010ￊ\uffdf\u0001\u000e\u0010\u0005\u0002\u0005", 175 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(i3, i3) + 11, 38 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr24);
                                            java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr24[i3]).intern());
                                            int myTid = android.os.Process.myTid();
                                            int resolveSizeAndState = android.view.View.resolveSizeAndState(i3, i3, i3);
                                            int mode = android.view.View.MeasureSpec.getMode(i3);
                                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                                            b(false, "\ufffe\u0000\ufffe\r￢\u0007\f\r\ufffa\u0007￼", (myTid >> 22) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 1 - resolveSizeAndState, 11 - mode, objArr25);
                                            java.lang.Object invoke3 = cls6.getMethod(((java.lang.String) objArr25[0]).intern(), java.lang.String.class).invoke(null, objArr23);
                                            try {
                                                java.lang.Object[] objArr26 = objArr21;
                                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                b(false, "\n�\u0010\u0011\u000e\u0001�\n\u0000\u000e\u000b\u0005\u0000ￊ\uffff\u000b\n\u0010\u0001\n\u0010ￊ\f\tￊ\uffef\u0005\u0003", 174 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 5, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27, objArr27);
                                                java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr27[0]).intern());
                                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                c("\u000e#\u0011#\b\u000b /\u0004\u0012㗲", android.text.TextUtils.getTrimmedLength("") + 11, (byte) (15 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr28);
                                                try {
                                                    java.lang.Object[] objArr29 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod(((java.lang.String) objArr28[0]).intern(), null).invoke(obj2, null))};
                                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                    b(false, "\uffff�\u0010\u0001￢�\uffff\u0010\u000b\u000e\u0015\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010\u0015ￊ\uffff\u0001\u000e\u0010ￊ\uffdf\u0001\u000e\u0010\u0005\u0002\u0005", android.widget.ExpandableListView.getPackedPositionChild(0L) + 175, 11 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.widget.ExpandableListView.getPackedPositionType(0L) + 37, objArr30);
                                                    java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr30[0]).intern());
                                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                    c("&\b\u0018\f\u0004\u0012\b\u000b&\t*\u000b\u0006\u001f\u0006\u0011\f\b㘏", 19 - (android.os.Process.myTid() >> 22), (byte) (android.view.View.combineMeasuredStates(0, 0) + 16), objArr31);
                                                    java.lang.Object invoke4 = cls8.getMethod(((java.lang.String) objArr31[0]).intern(), java.io.InputStream.class).invoke(invoke3, objArr29);
                                                    int length2 = objArr5.length;
                                                    for (int i7 = 0; i7 < 2; i7++) {
                                                        java.lang.Object obj3 = objArr5[i7];
                                                        try {
                                                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                            c("\u0004\t.\u0012\u0005.\r\u0011\u0019+\u0000\n'\u0003\u0011\r*\u000b\u0005\u0002\"$%,\u000b-\n\u0000\u001f\u0006\u0012\r\b\u000b", 33 - android.view.MotionEvent.axisFromString(""), (byte) (android.text.TextUtils.getTrimmedLength("") + 89), objArr32);
                                                            java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr32[0]).intern());
                                                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                            b(false, "\u0003\u000b\u0006\u0004\u0015\ufff9ￖ\uffd1\uffd1\ufff1\u0013\n\u000f\u0004\n\u0011\u0002\r\b\u0006\u0015\ufff4\u0016", 169 - android.view.View.combineMeasuredStates(0, 0), 18 - android.text.TextUtils.indexOf("", ""), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 25, objArr33);
                                                            if (obj3.equals(cls9.getMethod(((java.lang.String) objArr33[0]).intern(), null).invoke(invoke4, null))) {
                                                                java.lang.Object[] objArr34 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                                int i8 = ~i;
                                                                try {
                                                                    java.lang.Object[] objArr35 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((516557566 | i) * (-50)) - 1880730912) + (((~((-470417627) | i)) | (~((-17953793) | i8))) * 50) + (((~(i8 | (-488371419))) | 17953792 | (~(516557566 | i8))) * 50))};
                                                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj4 == null) {
                                                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 50, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2713, (char) android.view.View.MeasureSpec.getMode(0));
                                                                        byte b2 = (byte) ($$a[14] - 1);
                                                                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                        a(b2, b2, b2, objArr36);
                                                                        obj4 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                    }
                                                                    ((int[]) objArr34[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr35)).intValue();
                                                                    return objArr34;
                                                                } catch (java.lang.Throwable th) {
                                                                    java.lang.Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable th2) {
                                                            java.lang.Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    i6++;
                                                    objArr21 = objArr26;
                                                    i5 = 16;
                                                    i3 = 0;
                                                } catch (java.lang.Throwable th3) {
                                                    java.lang.Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    }
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                java.lang.Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (java.lang.Throwable th9) {
                        java.lang.Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (java.lang.Throwable th10) {
                    java.lang.Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (java.lang.Throwable unused) {
            }
            java.lang.Object[] objArr37 = {new int[]{i}, new int[]{i}, null, new int[1]};
            java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-531754907) | i)) | 472907802) * 1504) + 1212577112 + ((~(i | (-58847105))) * (-1504)) + 1503588800)};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj5 == null) {
                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.widget.ExpandableListView.getPackedPositionChild(0L) + 2714, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                byte b3 = (byte) ($$a[14] - 1);
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                a(b3, b3, b3, objArr39);
                obj5 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
            }
            ((int[]) objArr37[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr38)).intValue();
            return objArr37;
        } catch (java.lang.Throwable th11) {
            java.lang.Throwable cause11 = th11.getCause();
            if (cause11 != null) {
                throw cause11;
            }
            throw th11;
        }
    }
}
