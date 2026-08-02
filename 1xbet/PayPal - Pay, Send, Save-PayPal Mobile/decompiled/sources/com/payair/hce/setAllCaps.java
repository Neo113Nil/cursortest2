package com.payair.hce;

/* loaded from: classes4.dex */
public final class setAllCaps extends com.payair.hce.setMaxLines {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char DigitizedCardProfile;
    private static int valueOf;
    private static char[] values;
    private static int writeReplace;

    private static void d(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2 = 4 - (i * 3);
        int i3 = 73 - (s * 8);
        byte[] bArr = $$d;
        int i4 = s2 * 2;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i2;
            i2++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i2;
            i3 += bArr[i2];
            i2 = i8 + 1;
            i6 = i7;
        }
    }

    public setAllCaps(java.io.OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.payair.hce.setMaxLines
    public final void DigitizedCardProfile(com.payair.hce.setShadowLayer setshadowlayer) throws java.io.IOException {
        int i = writeReplace + 9;
        valueOf = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (setshadowlayer != null) {
            setshadowlayer.getAid().DigitizedCardProfile().values(this);
            int i2 = writeReplace + 51;
            valueOf = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        c("\u0002\u0000㙞㙞\u0000\u0006\n\u000f\u0001\u0004\n\u0006\b\u0002\u0004\u0002\u0006\u0007\u0002\b", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19, (byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 104), objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    @Override // com.payair.hce.setMaxLines
    final com.payair.hce.setMaxLines AlternateContactlessPaymentDataJson() {
        int i = valueOf;
        int i2 = i + 5;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        writeReplace = (i + 95) % 128;
        return this;
    }

    @Override // com.payair.hce.setMaxLines
    final com.payair.hce.setMaxLines valueOf() {
        int i = valueOf;
        int i2 = i + 105;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i + 41;
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            return this;
        }
        throw null;
    }

    private static void c(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        long j;
        int i3 = $11 + 43;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = values;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 49, 2508 - android.text.TextUtils.indexOf("", ""), (char) (android.view.View.MeasureSpec.getMode(0) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((short) 1, (short) 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(DigitizedCardProfile)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        long j2 = 0;
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 49, 2507 - android.view.MotionEvent.axisFromString(""), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6801));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            d((short) 1, (short) 0, 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                $10 = ($11 + 1) % 128;
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    j = j2;
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.os.Process.getGidForName(""), 3596 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            j = 0;
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 47, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2617, (char) (18888 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            d((short) 0, (short) 0, 0, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        } else {
                            j = 0;
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i5 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i6 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i5 * charValue) + i6];
                    } else {
                        j = 0;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            $11 = ($10 + 85) % 128;
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i7 = digitizedCardJson12.DigitizedCardProfile;
                            int i8 = digitizedCardJson12.RecordsJson;
                            int i9 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i10 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr3[digitizedCardJson12.values] = cArr[(i7 * charValue) + i8];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i9 * charValue) + i10];
                        } else {
                            int i11 = digitizedCardJson12.DigitizedCardProfile;
                            int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i13 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i14 = digitizedCardJson12.RecordsJson;
                            cArr3[digitizedCardJson12.values] = cArr[(i11 * charValue) + i12];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i13 * charValue) + i14];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                $10 = ($11 + 25) % 128;
                j2 = j;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            int i16 = $10 + 23;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                cArr3[i15] = (char) (cArr3[i15] ^ 29138);
                i15 += 54;
            } else {
                cArr3[i15] = (char) (cArr3[i15] ^ 13722);
                i15++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        valueOf = 1;
        values = new char[]{12335, 12324, 12394, 12351, 12325, 12329, 12350, 13267, 13266, 13264, 12334, 12328, 13268, 12326, 12320, 13265};
        DigitizedCardProfile = (char) 1492;
    }

    static void init$0() {
        $$d = new byte[]{68, 10, 35, com.visa.cbp.getEncExpo.addOnTrimMemoryListener};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE;
    }
}
