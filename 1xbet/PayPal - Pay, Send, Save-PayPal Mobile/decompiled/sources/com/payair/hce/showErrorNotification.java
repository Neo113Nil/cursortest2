package com.payair.hce;

/* loaded from: classes4.dex */
public class showErrorNotification extends com.payair.hce.accessinternalEndTransaction {
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static final java.math.BigInteger DigitizedCardProfile;
    private static int RecordsJson;
    private static int getProfileVersion;
    private static char valueOf;
    private static char[] values;
    private java.math.BigInteger AlternateContactlessPaymentDataJson;
    private java.math.BigInteger writeReplace;

    private static void e(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3 = s * 2;
        int i4 = 73 - (i * 8);
        int i5 = i2 + 4;
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 += i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            i5++;
            if (i6 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4 += bArr[i5];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        RecordsJson = 1;
        DigitizedCardProfile();
        DigitizedCardProfile = java.math.BigInteger.valueOf(1L);
        int i = RecordsJson + 49;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public showErrorNotification(boolean z, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        super(z);
        if (!z && (bigInteger2.intValue() & 1) == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            d("\u001e\u000f\u001c\t\f\u000b\u0012\u0001 \u0014\u0016\u000e\u000f\u000b\u0017\t\u0014\u0003\b\u001c\u0004\u0007\n#\t\u0017", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26, (byte) (93 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        this.AlternateContactlessPaymentDataJson = writeReplace(bigInteger);
        this.writeReplace = bigInteger2;
    }

    private static java.math.BigInteger writeReplace(java.math.BigInteger bigInteger) {
        getProfileVersion = (RecordsJson + 41) % 128;
        if ((bigInteger.intValue() & 1) == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            d("\u001e\u000f\u001c\t\u001b\u000b\f\u0007\u0006\f\u0004\u0007\u0019\u0002\u000b\u0006#\n㙋", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 20, (byte) (87 - android.text.TextUtils.getCapsMode("", 0, 0)), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        d("\u001a\u001f\u0007\u001a㖴㖴㖿㖿㗁㗁㖿㖿\u0018\"\u0012\u0013\u0015\u0000\u001a\u0007㖽㖽\t\u000e\u001a\"\u001d\u000b\t\u0015\u0015\u0005\u001b\u0004\u0000\u0004\u0002#㖺㖺\u001f\u0018#\u0014\u0015\t\u0015\f!\u000e\f\u0015\u0013\u001d\u0014\u000b\t\u0002\n\u001a\u0000\u0015\u0018\u0013 \u0006\u0013\u0012\u001a\u0007\u001a\u001d\u001b\u0004 \u0006\u0014\u0006 \u0006\u001a\"\u0014\u000b\u0015\u0000\u001b\u0010\u0013\u0018\u0000#\u000e\u0002\u001a\u001f\u0013\u0018\"\u0018\u001f!\u0012\u0013\u0017\u0000!\f#\u0002\u0012#㖵㖵\u001d\u0013\u0002\t㖿㖿\u001a\n\u001a\"㖻㖻\t\u0015\u0013\u001d㖾㖾 \u0006㖽㖽\t\u000e\u0013\u0018\u0002\u000e\u001b\u0004\u001b\u0001\u0006\u0014\u001d\u001a\u0004\u001b#\u0002\u0004\u001d㖾㖾\u0017\u0000\u001a\n\u001b\u0010\u0011\u0003\u0013\u0018\n\u001a\u0006 㖺㖺\u0000\u0015\u0001\u001b㖵㖵\u0011\u0003\u001d\u0001\u0016\u0018\n\u001a\u0006 \u000e\u0002\u001d\u000b\u000b\u001d㗁㗁\u0002!\u0015\u0000#\u0014\u001b\u0001\u001d\u0013\u0000!\u001b\u0001\u0011\u0003\u001d\u0013\u001b\u0001!\u0002\u0015\t\u0015\t\u001b\u0001\u0006 \u000b\u0002\u0013\u0012\u001a\"\f\u0015\u0000#\u0015\u0000\u001a\u001f#\u0002\u0013\u0018\t\u0002\n\u001a\r\u001b\u0018\u0000#\u0012\u001d\u0016\u0002!\u000e\u0002\r\u001b\u0011\u0015\u0006\u0014\"\u001a\u000b\u001d\u0013\u0018\u001f!\u0003\u0011\u000e\t\u001d\u000b\r\u001b\u001d\u001a\u0015\u0005㖺㖺㖵㖵\u0002#㗁㗁\u0006 㖾㖾\u0015\u0005\u001d\u0016\u001d\u001a\u0015\f㗁㗁", 310 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (byte) (17 - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr2);
        if (!bigInteger.gcd(new java.math.BigInteger(((java.lang.String) objArr2[0]).intern())).equals(DigitizedCardProfile)) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            d("\u001e\u000f\u001c\t\u001b\u000b\f\u0007\u0006\f\u0004\u0007\u0001\n\u0004\u0007\b\u000b\u0005\u0019\u0006\u0001\u0004\u0006\u0010\u0017\u001b\u0018\u0006\u000b\u0019\u0006\u0014\b\n\u0015", 36 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (byte) (android.view.View.MeasureSpec.getSize(0) + 21), objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        int i = RecordsJson + 107;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            return bigInteger;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.math.BigInteger valueOf() {
        int i = (getProfileVersion + 7) % 128;
        RecordsJson = i;
        java.math.BigInteger bigInteger = this.AlternateContactlessPaymentDataJson;
        getProfileVersion = (i + 3) % 128;
        return bigInteger;
    }

    public final java.math.BigInteger values() {
        int i = (RecordsJson + 7) % 128;
        getProfileVersion = i;
        java.math.BigInteger bigInteger = this.writeReplace;
        int i2 = i + 111;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    private static void d(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = values;
        int i3 = 3;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 49, 2509 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 6802));
                        byte b2 = (byte) ($$h & i3);
                        byte b3 = (byte) (b2 - 1);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        e(b2, b3, (byte) (b3 - 1), objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 3;
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
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 48, android.view.MotionEvent.axisFromString("") + 2509, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6801));
            byte b4 = (byte) ($$h & 3);
            byte b5 = (byte) (b4 - 1);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            e(b4, b5, (byte) (b5 - 1), objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
            $10 = ($11 + 71) % 128;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $10 = ($11 + 93) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 29, 3596 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $10 = ($11 + 3) % 128;
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2665, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 18890));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            e(0, (short) 0, -1, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i5 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i6 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i5 * charValue) + i6];
                        $11 = ($10 + 29) % 128;
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
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
                digitizedCardJson12.values += 2;
            }
        }
        $11 = ($10 + 89) % 128;
        for (int i15 = 0; i15 < i; i15++) {
            cArr3[i15] = (char) (cArr3[i15] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void DigitizedCardProfile() {
        values = new char[]{12326, 12345, 12350, 12410, 12322, 12408, 12351, 12331, 12415, 12325, 12394, 12335, 12313, 12334, 12329, 12402, 12338, 12346, 12403, 12328, 12303, 12324, 12344, 12409, 12332, 12411, 12323, 12299, 12413, 12327, 12412, 12330, 12414, 12312, 12348, 12333};
        valueOf = (char) 1494;
    }

    static void init$0() {
        $$g = new byte[]{85, 6, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -50};
        $$h = 117;
    }
}
