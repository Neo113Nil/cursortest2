package com.payair.hce;

/* loaded from: classes10.dex */
public class setDsrpMdSessionKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char getProfileVersion;
    private static char[] valueOf;
    private static long values;

    @com.payair.hce.setSelectionFromTop(valueOf = "recordNumber")
    public java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "recordValue")
    public java.lang.String DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "SFI")
    public java.lang.String writeReplace;

    private static void a(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3 = i * 2;
        int i4 = (i2 * 2) + 65;
        byte[] bArr = $$a;
        int i5 = b + 4;
        byte[] bArr2 = new byte[i3 + 35];
        int i6 = -1;
        if (bArr == null) {
            i4 = (i5 + (-i4)) - 2;
            i5 = i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            int i7 = i5 + 1;
            if (i6 == i3 + 34) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i4 = (i4 + (-bArr[i7])) - 2;
                i5 = i7;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i2 + 4;
        int i5 = i * 2;
        byte[] bArr = $$d;
        int i6 = (b * 2) + 65;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i4;
            int i9 = 0;
            int i10 = i7;
            i6 = (-i6) + i10;
            i4 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i6;
            int i11 = i4 + 1;
            i9 = i3 + 1;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = bArr[i11];
            i10 = i6;
            i6 = i12;
            i8 = i11;
            i6 = (-i6) + i10;
            i4 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i6;
            int i112 = i4 + 1;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            int i1122 = i4 + 1;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10;
        $11 = (i2 + 91) % 128;
        if (str != null) {
            int i3 = i2 + 31;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(values ^ (-3824242241614154557L), cArr, i);
        int i4 = 4;
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $10 = ($11 + 113) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - i4;
            int i5 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % i4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1921 - android.view.KeyEvent.keyCodeFromString(""), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(0, com.google.common.base.Ascii.SUB, -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26, android.view.Gravity.getAbsoluteGravity(0, 0) + 429, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31609));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d(0, com.google.common.base.Ascii.ESC, -1, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                i4 = 4;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    private static void c(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        char c;
        long j;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = valueOf;
        int i3 = 48;
        long j2 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            $11 = ($10 + 91) % 128;
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + i3, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2508, (char) (6803 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(0, (byte) 0, -1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 48;
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getProfileVersion)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        char c2 = '\b';
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 48, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2508, (char) (6803 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            d(0, (byte) 0, -1, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10 + 33;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                i2 = i + 109;
                cArr3[i2] = (char) (charArray[i2] + b);
            } else {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                int i6 = $11 + 7;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    int i7 = digitizedCardJson12.values;
                    throw new java.lang.ArithmeticException();
                }
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    j = j2;
                    c = c2;
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[13];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[c2] = java.lang.Integer.valueOf(charValue);
                    objArr6[7] = digitizedCardJson12;
                    objArr6[6] = digitizedCardJson12;
                    objArr6[5] = java.lang.Integer.valueOf(charValue);
                    objArr6[4] = digitizedCardJson12;
                    objArr6[3] = digitizedCardJson12;
                    objArr6[2] = java.lang.Integer.valueOf(charValue);
                    objArr6[1] = digitizedCardJson12;
                    objArr6[0] = digitizedCardJson12;
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.widget.ExpandableListView.getPackedPositionGroup(j2) + 3596, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            j = 0;
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2666 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18889));
                            byte length2 = (byte) $$d.length;
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            d(0, length2, (byte) (length2 - 5), objArr8);
                            c = '\b';
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        } else {
                            c = '\b';
                            j = 0;
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i8 * charValue) + i9];
                    } else {
                        c = '\b';
                        j = 0;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i10 = digitizedCardJson12.DigitizedCardProfile;
                            int i11 = digitizedCardJson12.RecordsJson;
                            int i12 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr3[digitizedCardJson12.values] = cArr[(i10 * charValue) + i11];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i12 * charValue) + i13];
                            $11 = ($10 + 47) % 128;
                        } else {
                            int i14 = digitizedCardJson12.DigitizedCardProfile;
                            int i15 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i16 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i17 = digitizedCardJson12.RecordsJson;
                            cArr3[digitizedCardJson12.values] = cArr[(i14 * charValue) + i15];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i16 * charValue) + i17];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                int i18 = $10 + 61;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 2 / 3;
                }
                c2 = c;
                j2 = j;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr3[i20] = (char) (cArr3[i20] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        values = 2788142676626097700L;
        valueOf = new char[]{12351, 12344, 12322, 12328, 13268, 12333, 12292, 12330, 13270, 12388, 12335, 13267, 12334, 12329, 12350, 12325, 12291, 12390, 13264, 12306, 12415, 12326, 12345, 12293, 13265, 12339, 12407, 12348, 12324, 12319, 12295, 12320, 12331, 12314, 13266, 12299, 12403, 12323, 12313, 12327, 12394, 12296, 12410, 12297, 12332, 12302, 13269, 12346, 12321};
        getProfileVersion = (char) 1495;
    }

    static void init$1() {
        $$d = new byte[]{57, -61, -44, -120};
        $$e = 72;
    }

    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2) {
        int i3;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        int i4 = 0;
        int i5 = 1;
        try {
            if (context == null) {
                java.lang.Object[] objArr3 = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i6 = ~i;
                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i6 | (-100204414))) | 904724571) * (-602)) + 285031375 + (((~(i | (-100204414))) | 99090521 | (~(905838463 | i6))) * (-301)) + ((~(i6 | 904724571)) * 301))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2712, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                    byte b = $$a[14];
                    byte b2 = (byte) (b + 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(b, b2, b2, objArr5);
                    obj = cls.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr4)).intValue();
                return objArr3;
            }
            try {
                try {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b("㛑쵇ꣁ㚻翁Ϊ쵹᭾ﴵ돪駘\ue79eꆊ蜭喵갮呱\ud885恍硂ᣔⱤ㲗䒡첥憁\uf72bᅛ\uf357떐莂\uddc7ꞥ褼御\uaa3a機싣樆癏Ọᙈ", android.view.View.MeasureSpec.getMode(0) + 1, objArr6);
                    objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr6[0]).intern()), 2);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    c("0\u0001\u0015(!\u0007\b\u0016(\t&/\u0011\n\u0001\u0006\u0010\u0018\u0015(!\u0007\b\u0016(\t\u000f-\u0016!㘝", 31 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (83 - android.view.MotionEvent.axisFromString("")), objArr7);
                    try {
                        java.lang.Object[] objArr8 = {((java.lang.String) objArr7[0]).intern()};
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b("㛑쵇ꣁ㚻翁Ϊ쵹᭾ﴵ돪駘\ue79eꆊ蜭喵갮呱\ud885恍硂ᣔⱤ㲗䒡첥憁\uf72bᅛ\uf357떐莂\uddc7ꞥ褼御\uaa3a機싣樆癏Ọᙈ", '1' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr9);
                        objArr[0] = java.lang.Class.forName(((java.lang.String) objArr9[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr8);
                        objArr2 = new java.lang.Object[1];
                        c("/\u0016\u001f$\u0010\u0018\u0015(!\u0007\b\u0016(\t\u000f-\u0005\u001b*#\b\u0005\u0010$\u0013/\u0003\u0011\u0004\u0001㘄", 31 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6), objArr2);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable unused) {
                    i3 = 1;
                }
            } catch (java.lang.Throwable unused2) {
            }
            try {
                java.lang.Object[] objArr10 = {((java.lang.String) objArr2[0]).intern()};
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b("㛑쵇ꣁ㚻翁Ϊ쵹᭾ﴵ돪駘\ue79eꆊ蜭喵갮呱\ud885恍硂ᣔⱤ㲗䒡첥憁\uf72bᅛ\uf357떐莂\uddc7ꞥ褼御\uaa3a機싣樆癏Ọᙈ", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr11);
                objArr[1] = java.lang.Class.forName(((java.lang.String) objArr11[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                try {
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    b("쉗\uefb1㏹숶崸쁗噓\ud890ত酛˷\u2428唌ꗁ캑濎ꃦ賓אָ믰\uec64ຉꞩ蜆㠾䌺汗", 1 - android.view.View.resolveSizeAndState(0, 0, 0), objArr12);
                    java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    c("\u0003\f\u0013\u001c\"\u000b.\"\u0003\f\u001f!\u001d!\u0003\f㗸", android.graphics.Color.green(0) + 17, (byte) (16 - android.graphics.Color.alpha(0)), objArr13);
                    java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null);
                    try {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        b("쉗\uefb1㏹숶崸쁗噓\ud890ত酛˷\u2428唌ꗁ캑濎ꃦ賓אָ믰\uec64ຉꞩ蜆㠾䌺汗", 1 - android.view.View.resolveSize(0, 0), objArr14);
                        java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr14[0]).intern());
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        b("⬳᪇ﰥ⭔ꠅ又馟䬭\ue0ce摧촤럸뱬僽ŭﱄ䦊ཙ", 1 - android.view.KeyEvent.getDeadChar(0, 0), objArr15);
                        try {
                            java.lang.Object[] objArr16 = {cls3.getMethod(((java.lang.String) objArr15[0]).intern(), null).invoke(context, null), 64};
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            b("奄䍺\ua48e夥\uf1f3ⅰ설㦷銷㶐門씏츟ऊ姦軩㯵嚯汘嫗睄ꉀゞ昅ꌩ\uefea\ufb3f㏐鲋㮐辵ｌ졮ܰ叻裬ז", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1, objArr17);
                            java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr17[0]).intern());
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            c("\u0003\f\u0013\u001c\"\u000b.\"\u0003\f\u000e\u001e+\u0010", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 15, (byte) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15), objArr18);
                            java.lang.Object invoke2 = cls4.getMethod(((java.lang.String) objArr18[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            b("뇇괮ᘹ놦ᾧ詰玓銷稴폄✷渏⚜\ue75e\ueb51◩퍶룻\udeef\uf1d7鿇䰔舩촅䮪ƾ䦈飐琈헄㴆呃⃥\ue96a", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr19);
                            java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            c("\u0017$\u0000!\u001c\u0012\u0001\u0002\b\u0018", 11 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8), objArr20);
                            java.lang.Object[] objArr21 = (java.lang.Object[]) cls5.getField(((java.lang.String) objArr20[0]).intern()).get(invoke2);
                            int length = objArr21.length;
                            int i7 = 0;
                            while (i7 < length) {
                                java.lang.Object obj2 = objArr21[i7];
                                java.lang.Object[] objArr22 = new java.lang.Object[i5];
                                c("\u0010\f\u000e0㗾", 5 - android.view.View.combineMeasuredStates(i4, i4), (byte) (android.view.KeyEvent.normalizeMetaState(i4) + 91), objArr22);
                                try {
                                    java.lang.Object[] objArr23 = {((java.lang.String) objArr22[i4]).intern()};
                                    java.lang.Object[] objArr24 = new java.lang.Object[i5];
                                    b("袸㢻ց裒訽렾怹ꃪ䌊䙋㒎尌\u1ff5狖\uf8eeឧ\uea15\u2d2e쵀쏒ꚺ\ud998醑ｘ狑鐺娯ꪖ䵶䁝⺔昂ᦈ糵\uf2d5ᆦ퐻㜈은췙ꂽ", 1 - ((android.os.Process.getThreadPriority(i4) + 20) >> 6), objArr24);
                                    java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr24[i4]).intern());
                                    java.lang.Object[] objArr25 = new java.lang.Object[i5];
                                    b("击께沺农ᱚ뀋ऀꣷ騉퀨嶤吻욭\ue4a4釙", android.graphics.Color.alpha(i4) + i5, objArr25);
                                    java.lang.String intern = ((java.lang.String) objArr25[i4]).intern();
                                    java.lang.Class<?>[] clsArr = new java.lang.Class[i5];
                                    clsArr[i4] = java.lang.String.class;
                                    java.lang.Object invoke3 = cls6.getMethod(intern, clsArr).invoke(null, objArr23);
                                    try {
                                        java.lang.Object[] objArr26 = new java.lang.Object[i5];
                                        c("!\u001d\b\u0005\u0010$\r\n\b\u0014#\u0015\u0007\u001f\u0010\u0007.(\n%(\u0002\u001d!\u0015\u0007\u0003\b", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27, (byte) (android.view.View.combineMeasuredStates(i4, i4) + 20), objArr26);
                                        java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr26[i4]).intern());
                                        int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                                        byte b3 = (byte) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)) + 102);
                                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                                        c("\u000f\u0010'\u001b\u0011\u0007$\u0000\u0004\u001d㙉", 11 - packedPositionType, b3, objArr27);
                                        try {
                                            java.lang.Object[] objArr28 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod(((java.lang.String) objArr27[0]).intern(), null).invoke(obj2, null))};
                                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                                            b("袸㢻ց裒訽렾怹ꃪ䌊䙋㒎尌\u1ff5狖\uf8eeឧ\uea15\u2d2e쵀쏒ꚺ\ud998醑ｘ狑鐺娯ꪖ䵶䁝⺔昂ᦈ糵\uf2d5ᆦ퐻㜈은췙ꂽ", 1 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr29);
                                            java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                            b("\ue450䷾\ue054\ue437ｼ盋藴減⾾㌜텊鋿猫ބᴠ\ud952蛭堣⢟ഡ쩁곝琏", 1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr30);
                                            java.lang.Object invoke4 = cls8.getMethod(((java.lang.String) objArr30[0]).intern(), java.io.InputStream.class).invoke(invoke3, objArr28);
                                            int length2 = objArr.length;
                                            int i8 = 0;
                                            while (i8 < 2) {
                                                java.lang.Object obj3 = objArr[i8];
                                                try {
                                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                    c(" !\u0019\"\b\u0017\u000b\u0007\u0001\u0002#\u0010\u0017\u000b\u0007\u000b\u0000\u000f\f\u0010\u000e0+\u0001\b\u0003\u0010#\u0002,\u000b\"\u0011\u0007", 34 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (byte) (26 - android.graphics.Color.red(0)), objArr31);
                                                    java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr31[0]).intern());
                                                    java.lang.Object[] objArr32 = objArr21;
                                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                    c("\u0003\f\u0011#\u0001\u0004&\u0011\u0007\u0014\u0014\u000e㗎㗎\u001d\u0005#\u001e\t).!㘚", 24 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) (36 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr33);
                                                    if (obj3.equals(cls9.getMethod(((java.lang.String) objArr33[0]).intern(), null).invoke(invoke4, null))) {
                                                        java.lang.Object[] objArr34 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                        int i9 = ~i;
                                                        try {
                                                            java.lang.Object[] objArr35 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((((~(i9 | (-490757660))) | 20995586) | (~(514171325 | i9))) * 464) - 1016031880) + (((-469762074) | i) * (-464)) + (((~(514171325 | i)) | 20995586) * 464))};
                                                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj4 == null) {
                                                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                byte b4 = $$a[14];
                                                                byte b5 = (byte) (b4 + 1);
                                                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                a(b4, b5, b5, objArr36);
                                                                obj4 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                            }
                                                            ((int[]) objArr34[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr35)).intValue();
                                                            return objArr34;
                                                        } catch (java.lang.Throwable th2) {
                                                            java.lang.Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    i8++;
                                                    objArr21 = objArr32;
                                                } catch (java.lang.Throwable th3) {
                                                    java.lang.Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            }
                                            i7++;
                                            i4 = 0;
                                            i5 = 1;
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
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            }
                            i3 = i5;
                            int[] iArr = new int[i3];
                            int[] iArr2 = new int[i3];
                            iArr[0] = i;
                            iArr2[0] = i;
                            java.lang.Object[] objArr37 = {iArr, iArr2, null, new int[i3]};
                            java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((~((-42006401) | i)) * 623) + 238732056 + (((~i) | 957679680) * (-623)) + (((~(i | (-44627853))) | 42006400 | (~(960301132 | i))) * 623))};
                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj5 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777166) - android.graphics.Color.rgb(0, 0, 0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2713, (char) android.view.View.resolveSize(0, 0));
                                byte b6 = $$a[14];
                                byte b7 = (byte) (b6 + 1);
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                a(b6, b7, b7, objArr39);
                                obj5 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                            }
                            ((int[]) objArr37[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr38)).intValue();
                            return objArr37;
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
        } catch (java.lang.Throwable th11) {
            java.lang.Throwable cause11 = th11.getCause();
            if (cause11 != null) {
                throw cause11;
            }
            throw th11;
        }
    }

    static void init$0() {
        $$a = new byte[]{118, 40, com.google.common.base.Ascii.SYN, 126, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = 100;
    }
}
