package com.payair.hce;

/* loaded from: classes4.dex */
public final class updateAtcCount extends com.payair.hce.getAtcCount {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = i * 2;
        int i4 = (b * 8) + 65;
        byte[] bArr = $$a;
        int i5 = b2 + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i4 += -i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5++;
            i6 = bArr[i5];
            i4 += -i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        }
    }

    public updateAtcCount(com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate) {
        super(requesttaskstatusupdate);
    }

    @Override // com.payair.hce.getAtcCount
    public final void DigitizedCardProfile() throws com.payair.hce.removeCardManagerListener {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0003\u0011\u0010\r\u0013\u0010\u0007\n\u000f\u0003\b\u0004\u0014\u0005\u0005\u0004\u0005\u0001\u000e\u0017\u0001\u000f\u000b\b\u0001\n\u0005\u0013\r\u0006\u0011\u0014\u0018\u0012\u0002\u000f\u0011\u0000\b\u0004\u0004\u0005㘋", 43 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (byte) (12 - (android.os.Process.myPid() >> 22)), objArr);
        throw new com.payair.hce.removeCardManagerListener(((java.lang.String) objArr[0]).intern());
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        char c;
        if (str != null) {
            $11 = ($10 + 115) % 128;
            cArr = str.toCharArray();
            $11 = ($10 + 11) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = AlternateContactlessPaymentDataJson;
        char c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i3 = 2;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 103;
                $10 = i5 % 128;
                if (i5 % i3 != 0) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4])};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 49, android.text.TextUtils.indexOf("", c2) + 2509, (char) (6802 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b((byte) 0, 0, (byte) -1, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                        }
                        cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i4 <<= 1;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[i4])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 48, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2508, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 6802));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, 0, (byte) -1, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
                    }
                    cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i4++;
                }
                c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                i3 = 2;
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(DigitizedCardProfile)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        char c3 = '\b';
        if (obj3 == null) {
            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.Color.red(0), 2508 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (6802 - (android.view.ViewConfiguration.getTouchSlop() >> 8)));
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            b((byte) 0, 0, (byte) -1, objArr7);
            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            int i6 = $11 + 45;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                i2 = i + 119;
                cArr5[i2] = (char) (cArr2[i2] + b);
            } else {
                i2 = i - 1;
                cArr5[i2] = (char) (cArr2[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $10 = ($11 + 81) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    int i7 = $11 + 113;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf + b);
                        cArr5[digitizedCardJson12.values >> 1] = (char) (digitizedCardJson12.writeReplace % b);
                    } else {
                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                        cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    }
                    c = c3;
                } else {
                    java.lang.Object[] objArr8 = new java.lang.Object[13];
                    objArr8[12] = digitizedCardJson12;
                    objArr8[11] = java.lang.Integer.valueOf(charValue);
                    objArr8[10] = digitizedCardJson12;
                    objArr8[9] = digitizedCardJson12;
                    objArr8[c3] = java.lang.Integer.valueOf(charValue);
                    objArr8[7] = digitizedCardJson12;
                    objArr8[6] = digitizedCardJson12;
                    objArr8[5] = java.lang.Integer.valueOf(charValue);
                    objArr8[4] = digitizedCardJson12;
                    objArr8[3] = digitizedCardJson12;
                    objArr8[2] = java.lang.Integer.valueOf(charValue);
                    objArr8[1] = digitizedCardJson12;
                    objArr8[0] = digitizedCardJson12;
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3596, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj4);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $11 = ($10 + 107) % 128;
                        java.lang.Object[] objArr9 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj5 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 48, android.text.TextUtils.indexOf("", "", 0, 0) + 2665, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 18889));
                            byte b2 = (byte) ($$b & 5);
                            byte b3 = (byte) (b2 - 1);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b(b2, b3, (byte) (b3 - 1), objArr10);
                            c = '\b';
                            obj5 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj5);
                        } else {
                            c = '\b';
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr9)).intValue();
                        int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i8 * charValue) + i9];
                    } else {
                        c = '\b';
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            $11 = ($10 + 5) % 128;
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
                c3 = c;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr5[i18] = (char) (cArr5[i18] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = new char[]{12323, 13264, 12303, 12333, 12327, 12334, 12350, 12330, 12332, 12324, 13265, 12325, 12351, 12331, 13266, 12394, 12336, 12346, 12344, 12322, 12328, 12335, 12295, 12329, 12326};
        DigitizedCardProfile = (char) 1493;
    }

    static void init$0() {
        $$a = new byte[]{3, -32, -117, 13};
        $$b = 131;
    }
}
