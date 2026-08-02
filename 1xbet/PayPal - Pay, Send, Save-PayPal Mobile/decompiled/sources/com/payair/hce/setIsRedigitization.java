package com.payair.hce;

/* loaded from: classes10.dex */
public final class setIsRedigitization {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static char valueOf;
    private static int values;
    private static char[] writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardholderValidators")
    private java.lang.String AlternateContactlessPaymentDataJson;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 73 - (s * 8);
        int i4 = s2 * 2;
        int i5 = 4 - (i * 3);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            int i7 = i5;
            int i8 = i7 + 1;
            i3 = i5 + i6;
            i5 = i8;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i5];
            int i9 = i3;
            i7 = i5;
            i5 = i9;
            int i82 = i7 + 1;
            i3 = i5 + i6;
            i5 = i82;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        int i = values;
        DigitizedCardProfile = (i + 31) % 128;
        java.lang.String str = this.AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = (i + 33) % 128;
        return str;
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        int i = (values + 43) % 128;
        DigitizedCardProfile = i;
        this.AlternateContactlessPaymentDataJson = str;
        int i2 = i + 67;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\t\r\u0013\u0012\u0000\u0004\u0011\u0016\b\u0011\u0018\f\r\u000b\u0013\f\u0003\b\u0013\u0010\u0005\n\u0013\u000b\u0013\u0012\u0000\u0004\u0011\u0016\b\u0011\u0018\f\r\u000b\u0013\f\u0003\b\u0013\u0010㗮", android.view.View.MeasureSpec.getMode(0) + 43, (byte) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 71), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.AlternateContactlessPaymentDataJson);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("㘀", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (57 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        java.lang.String obj = sb.toString();
        values = (DigitizedCardProfile + 7) % 128;
        return obj;
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        java.lang.Object obj;
        int i3 = $11;
        $10 = (i3 + 33) % 128;
        java.lang.Object obj2 = null;
        if (str != null) {
            int i4 = i3 + 97;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = writeReplace;
        if (cArr3 != null) {
            $11 = ($10 + 121) % 128;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj3 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 49, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2507, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6801));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, (short) 1, (short) 0, objArr3);
                        obj3 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
                    }
                    cArr4[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(valueOf)};
        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        char c = '\b';
        if (obj4 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 49, android.view.KeyEvent.getDeadChar(0, 0) + 2508, (char) (6802 - android.view.KeyEvent.normalizeMetaState(0)));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(0, (short) 1, (short) 0, objArr5);
            obj4 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj4);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr4)).charValue();
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
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    $10 = ($11 + 57) % 128;
                    cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    obj = obj2;
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[13];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[c] = java.lang.Integer.valueOf(charValue);
                    objArr6[7] = digitizedCardJson12;
                    objArr6[6] = digitizedCardJson12;
                    objArr6[5] = java.lang.Integer.valueOf(charValue);
                    objArr6[4] = digitizedCardJson12;
                    objArr6[3] = digitizedCardJson12;
                    objArr6[2] = java.lang.Integer.valueOf(charValue);
                    objArr6[1] = digitizedCardJson12;
                    objArr6[0] = digitizedCardJson12;
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj5 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.Color.alpha(0), 3596 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.view.KeyEvent.normalizeMetaState(0));
                        java.lang.Class<?>[] clsArr = new java.lang.Class[13];
                        clsArr[0] = java.lang.Object.class;
                        clsArr[1] = java.lang.Object.class;
                        clsArr[2] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Object.class;
                        clsArr[4] = java.lang.Object.class;
                        clsArr[5] = java.lang.Integer.TYPE;
                        clsArr[6] = java.lang.Object.class;
                        clsArr[7] = java.lang.Object.class;
                        clsArr[c] = java.lang.Integer.TYPE;
                        clsArr[9] = java.lang.Object.class;
                        clsArr[10] = java.lang.Object.class;
                        clsArr[11] = java.lang.Integer.TYPE;
                        clsArr[12] = java.lang.Object.class;
                        obj5 = cls3.getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj5);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = new java.lang.Object[11];
                        objArr7[10] = digitizedCardJson12;
                        objArr7[9] = java.lang.Integer.valueOf(charValue);
                        objArr7[c] = digitizedCardJson12;
                        objArr7[7] = java.lang.Integer.valueOf(charValue);
                        objArr7[6] = java.lang.Integer.valueOf(charValue);
                        objArr7[5] = digitizedCardJson12;
                        objArr7[4] = digitizedCardJson12;
                        objArr7[3] = java.lang.Integer.valueOf(charValue);
                        objArr7[2] = java.lang.Integer.valueOf(charValue);
                        objArr7[1] = digitizedCardJson12;
                        objArr7[0] = digitizedCardJson12;
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj6 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 48, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2665, (char) (18889 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(0, (short) 0, (short) 0, objArr8);
                            java.lang.String str2 = (java.lang.String) objArr8[0];
                            java.lang.Class<?>[] clsArr2 = new java.lang.Class[11];
                            clsArr2[0] = java.lang.Object.class;
                            clsArr2[1] = java.lang.Object.class;
                            clsArr2[2] = java.lang.Integer.TYPE;
                            clsArr2[3] = java.lang.Integer.TYPE;
                            clsArr2[4] = java.lang.Object.class;
                            clsArr2[5] = java.lang.Object.class;
                            clsArr2[6] = java.lang.Integer.TYPE;
                            clsArr2[7] = java.lang.Integer.TYPE;
                            clsArr2[c] = java.lang.Object.class;
                            clsArr2[9] = java.lang.Integer.TYPE;
                            clsArr2[10] = java.lang.Object.class;
                            obj6 = cls4.getMethod(str2, clsArr2);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj6);
                        }
                        obj = null;
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr7)).intValue();
                        int i6 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i7 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i6 * charValue) + i7];
                    } else {
                        obj = null;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i8 = digitizedCardJson12.DigitizedCardProfile;
                            int i9 = digitizedCardJson12.RecordsJson;
                            int i10 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i11 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr5[digitizedCardJson12.values] = cArr3[(i8 * charValue) + i9];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i10 * charValue) + i11];
                        } else {
                            int i12 = digitizedCardJson12.DigitizedCardProfile;
                            int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i14 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i15 = digitizedCardJson12.RecordsJson;
                            cArr5[digitizedCardJson12.values] = cArr3[(i12 * charValue) + i13];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i14 * charValue) + i15];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                obj2 = obj;
                c = '\b';
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr5[i16] = (char) (cArr5[i16] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        DigitizedCardProfile = 1;
        writeReplace = new char[]{12394, 12397, 12395, 12325, 12322, 12305, 12307, 12335, 12297, 12311, 12323, 12407, 12326, 12398, 12331, 12345, 12329, 12334, 12344, 12399, 12396, 12304, 12316, 12350, 12306};
        valueOf = (char) 1493;
    }

    static void init$0() {
        $$a = new byte[]{5, -66, -84, -78};
        $$b = 20;
    }
}
