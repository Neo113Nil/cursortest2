package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setNavigationOnClickListener extends java.io.InputStream {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static char IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static int getProfileVersion;
    private static char valueOf;
    protected final java.io.InputStream values;
    private int writeReplace;

    private static void d(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2 = s2 + 65;
        int i3 = i + 4;
        byte[] bArr = $$a;
        int i4 = s * 2;
        char[] cArr = new char[35 - i4];
        int i5 = -1;
        if (bArr == null) {
            i2 = (i3 + (-i2)) - 2;
            i3 = i3;
        }
        while (true) {
            int i6 = i3 + 1;
            i5++;
            cArr[i5] = (char) i2;
            if (i5 == 34 - i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            } else {
                i2 = (i2 + (-bArr[i6])) - 2;
                i3 = i6;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (b * 3) + 1;
        byte[] bArr = $$g;
        int i6 = (i * 2) + 4;
        int i7 = 110 - i2;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i7 += i8;
            i6++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i6];
            i7 += i8;
            i6++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
            }
        }
    }

    setNavigationOnClickListener(java.io.InputStream inputStream, int i) {
        this.values = inputStream;
        this.writeReplace = i;
    }

    int values() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        getProfileVersion = (i + 55) % 128;
        int i2 = this.writeReplace;
        getProfileVersion = (i + 13) % 128;
        return i2;
    }

    protected final void AlternateContactlessPaymentDataJson() {
        int i = (SdkCoreAlternateContactlessPaymentDataImpl + 23) % 128;
        getProfileVersion = i;
        java.io.InputStream inputStream = this.values;
        if (inputStream instanceof com.payair.hce.setTitleTextColor) {
            int i2 = i + 15;
            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
            if (i2 % 2 == 0) {
                com.payair.hce.setTitleTextColor settitletextcolor = (com.payair.hce.setTitleTextColor) inputStream;
                com.payair.hce.setTitleTextColor.DigitizedCardProfile(new java.lang.Object[]{settitletextcolor, java.lang.Boolean.FALSE}, -2016885196, 2016885197, java.lang.System.identityHashCode(settitletextcolor));
            } else {
                com.payair.hce.setTitleTextColor settitletextcolor2 = (com.payair.hce.setTitleTextColor) inputStream;
                com.payair.hce.setTitleTextColor.DigitizedCardProfile(new java.lang.Object[]{settitletextcolor2, java.lang.Boolean.TRUE}, -2016885196, 2016885197, java.lang.System.identityHashCode(settitletextcolor2));
            }
        }
    }

    private static void f(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            int i3 = 0;
            while (i3 < 16) {
                $10 = ($11 + 105) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (getAid ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(RecordsJson)};
                    int i4 = c2 + i2;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.os.Process.myPid() >> 22), 1335 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        g(0, (byte) 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
                    int i5 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 62, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1336, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        g(0, (byte) 0, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                    i3++;
                    $11 = ($10 + 97) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 54, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 3543, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static void e(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = $11 + 91;
        $10 = i3 % 128;
        int i4 = 2;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = DigitizedCardProfile;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 77;
                $10 = i6 % 128;
                if (i6 % i4 != 0) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49, 2508 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 6802));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            g(0, (byte) 0, 45, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                        }
                        cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i5 <<= 1;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 49, 2508 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (6802 - android.text.TextUtils.getOffsetBefore("", 0)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        g(0, (byte) 0, 45, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i5++;
                }
                i4 = 2;
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(valueOf)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        long j = 0;
        if (obj3 == null) {
            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 49, 2509 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 6802));
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            g(0, (byte) 0, 45, objArr7);
            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            $10 = ($11 + 23) % 128;
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            $10 = ($11 + 65) % 128;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                } else {
                    java.lang.Object[] objArr8 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 30, 3596 - android.view.View.MeasureSpec.getMode(0), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(j)))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj4);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $11 = ($10 + 39) % 128;
                        java.lang.Object[] objArr9 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj5 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 47, 2665 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 18889));
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            g(0, (byte) 0, 37, objArr10);
                            obj5 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj5);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr9)).intValue();
                        int i7 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i8 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i7 * charValue) + i8];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i9 = digitizedCardJson12.DigitizedCardProfile;
                        int i10 = digitizedCardJson12.RecordsJson;
                        int i11 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[(i9 * charValue) + i10];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i11 * charValue) + i12];
                    } else {
                        int i13 = digitizedCardJson12.DigitizedCardProfile;
                        int i14 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i15 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i16 = digitizedCardJson12.RecordsJson;
                        cArr3[digitizedCardJson12.values] = cArr[(i13 * charValue) + i14];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i15 * charValue) + i16];
                    }
                }
                digitizedCardJson12.values += 2;
                j = 0;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr3[i17] = (char) (cArr3[i17] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void init$1() {
        $$g = new byte[]{68, 85, -28, -99};
        $$h = 211;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getProfileVersion = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        DigitizedCardProfile = new char[]{1493, 12391, 1498, 12318, 1490, 12320, 12389, 12322, 12311, 12305, 1492, 12345, 12334, 12385, 12409, 12335, 1491, 12331, 12326, 12348, 12325, 12388, 12403, 12346, 1494, 12336, 12349, 12339, 12410, 12323, 12328, 12324, 1496, 12347, 12309, 1495, 1497, 12333, 12338, 12327, 12329, 12351, 12344, 12350, 1499, 1500, 12321, 12332, 1489};
        valueOf = (char) 1495;
        AlternateContactlessPaymentDataJson = (char) 59804;
        IccPrivateKeyCrtComponentsJson = (char) 33862;
        getAid = (char) 39952;
        RecordsJson = (char) 39781;
    }

    static void init$0() {
        $$a = new byte[]{59, 86, -115, -69, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
        $$b = 231;
    }

    public static int c(int i) {
        try {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 27, 28 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getMethod("z", java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
            }
            return ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr)).intValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x11fe, code lost:
    
        if (((r1 & ((((((~((-69477377) | r6)) | r2) * 590) + 710916570) + (r2 * (-1180))) + (((~(r31 | (-82263234))) | (~(r31 | 1354963177))) * 590))) | (((int) r9) & ((((((~(1019317109 | r6)) | 415271476) * (-502)) + 1598731487) + ((~(r31 | (-2637825))) * (-502))) + (((~(417909300 | r6)) | 1019317109) * 502)))) == 477111747) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x09ea, code lost:
    
        if (r2.equals(((java.lang.String) r9[0]).intern()) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x06f2, code lost:
    
        if (((((int) (r4 >> 32)) & ((((((~((-518341538) | r63)) | 382009857) | r6) * (-470)) + 593232768) + ((r6 | (~((-136331681) | r63))) * 470))) | (((int) r4) & ((((((~((-1112951457) | r63)) | (~(1744789429 | r63))) * 69) - 1461206100) + ((((~((-1677680289) | r63)) | 564728832) | (~(1180060597 | r63))) * (-69))) + 335563433))) != (-1032769152)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x07fc, code lost:
    
        if (((((int) (r13 >> 32)) & ((((((~(r31 | 259349318)) | (-1870658552)) | (~(r31 | 1696575729))) * (-397)) + 1946165866) + (((-1785392056) | r63) * 397))) | (((int) r13) & (((((~(847160211 | r63)) | 16846852) * (-283)) - 964534591) + ((~(864007063 | r63)) * 283)))) == 542074309) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x1469 A[Catch: all -> 0x4066, TryCatch #1 {all -> 0x4066, blocks: (B:3:0x0004, B:6:0x001e, B:7:0x005e, B:11:0x0128, B:13:0x0167, B:14:0x01b4, B:19:0x01e7, B:21:0x01fa, B:22:0x0244, B:32:0x02c8, B:34:0x02db, B:35:0x0326, B:37:0x034b, B:39:0x035e, B:40:0x03aa, B:42:0x03b3, B:44:0x03d1, B:45:0x042f, B:49:0x04c5, B:51:0x04e3, B:52:0x0536, B:56:0x05f5, B:58:0x0613, B:59:0x0668, B:62:0x06f6, B:64:0x0714, B:65:0x076b, B:70:0x0df3, B:72:0x0e06, B:73:0x0e50, B:82:0x0ece, B:84:0x0ee1, B:85:0x0f2c, B:87:0x0f55, B:89:0x0f68, B:90:0x0fb4, B:92:0x0fbd, B:94:0x0fdb, B:95:0x1031, B:99:0x10f0, B:101:0x110e, B:102:0x1163, B:107:0x1456, B:109:0x1469, B:110:0x14b7, B:112:0x1560, B:114:0x1573, B:115:0x15c2, B:123:0x1682, B:125:0x16d8, B:126:0x172f, B:130:0x1766, B:132:0x1779, B:133:0x17c3, B:135:0x188e, B:137:0x18a1, B:138:0x18f1, B:146:0x19bc, B:148:0x1a0b, B:149:0x1a60, B:157:0x1b34, B:159:0x1b47, B:160:0x1b97, B:168:0x1c6a, B:170:0x1cb2, B:171:0x1d08, B:196:0x2054, B:198:0x2098, B:199:0x20f0, B:203:0x2126, B:205:0x2139, B:206:0x2185, B:209:0x21ad, B:211:0x21c0, B:212:0x2212, B:219:0x2419, B:221:0x242c, B:222:0x247d, B:230:0x2531, B:232:0x2573, B:233:0x25ca, B:237:0x25ff, B:239:0x2628, B:240:0x2681, B:247:0x273a, B:249:0x2780, B:250:0x27d6, B:254:0x280a, B:256:0x2833, B:257:0x288c, B:261:0x2948, B:263:0x299d, B:264:0x29f4, B:267:0x2a0a, B:269:0x2a19, B:270:0x2a62, B:274:0x2b0e, B:276:0x2b5c, B:277:0x2bb8, B:281:0x2bd1, B:283:0x2bea, B:284:0x2c36, B:288:0x2ce3, B:290:0x2d38, B:291:0x2d8f, B:294:0x2da5, B:296:0x2db4, B:297:0x2dfc, B:301:0x2eb5, B:303:0x2f0d, B:304:0x2f5d, B:307:0x2f73, B:309:0x2f82, B:310:0x2fcb, B:314:0x306e, B:316:0x30b2, B:317:0x3104, B:320:0x311a, B:322:0x3129, B:323:0x3176, B:327:0x3212, B:329:0x325a, B:330:0x32ab, B:334:0x32e5, B:336:0x330f, B:337:0x3369, B:341:0x341c, B:343:0x3471, B:344:0x34c4, B:348:0x34fa, B:350:0x350d, B:351:0x3560, B:355:0x362f, B:357:0x368e, B:358:0x36e6, B:361:0x36fc, B:363:0x370b, B:364:0x3757, B:368:0x381c, B:370:0x385e, B:371:0x38b9, B:374:0x38cf, B:376:0x38de, B:377:0x3925, B:381:0x39d9, B:383:0x3a2a, B:384:0x3a81, B:387:0x3a97, B:389:0x3aa6, B:390:0x3aef, B:394:0x3bc3, B:396:0x3c0f, B:397:0x3c66, B:400:0x3c7c, B:402:0x3c8b, B:403:0x3cd7, B:411:0x3da4, B:413:0x3df0, B:414:0x3e42, B:416:0x3e57, B:418:0x3e6a, B:419:0x3eb4, B:421:0x3ebc, B:423:0x3eec, B:424:0x3f4a, B:428:0x3fad, B:430:0x3ff2, B:431:0x4046, B:498:0x1227, B:500:0x123a, B:501:0x128e, B:513:0x1366, B:515:0x13aa, B:516:0x1403, B:525:0x0822, B:527:0x0835, B:528:0x088b, B:533:0x0a04, B:535:0x0a54, B:536:0x0aaa, B:541:0x095d, B:543:0x0970, B:544:0x09c5), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x1573 A[Catch: all -> 0x4066, TryCatch #1 {all -> 0x4066, blocks: (B:3:0x0004, B:6:0x001e, B:7:0x005e, B:11:0x0128, B:13:0x0167, B:14:0x01b4, B:19:0x01e7, B:21:0x01fa, B:22:0x0244, B:32:0x02c8, B:34:0x02db, B:35:0x0326, B:37:0x034b, B:39:0x035e, B:40:0x03aa, B:42:0x03b3, B:44:0x03d1, B:45:0x042f, B:49:0x04c5, B:51:0x04e3, B:52:0x0536, B:56:0x05f5, B:58:0x0613, B:59:0x0668, B:62:0x06f6, B:64:0x0714, B:65:0x076b, B:70:0x0df3, B:72:0x0e06, B:73:0x0e50, B:82:0x0ece, B:84:0x0ee1, B:85:0x0f2c, B:87:0x0f55, B:89:0x0f68, B:90:0x0fb4, B:92:0x0fbd, B:94:0x0fdb, B:95:0x1031, B:99:0x10f0, B:101:0x110e, B:102:0x1163, B:107:0x1456, B:109:0x1469, B:110:0x14b7, B:112:0x1560, B:114:0x1573, B:115:0x15c2, B:123:0x1682, B:125:0x16d8, B:126:0x172f, B:130:0x1766, B:132:0x1779, B:133:0x17c3, B:135:0x188e, B:137:0x18a1, B:138:0x18f1, B:146:0x19bc, B:148:0x1a0b, B:149:0x1a60, B:157:0x1b34, B:159:0x1b47, B:160:0x1b97, B:168:0x1c6a, B:170:0x1cb2, B:171:0x1d08, B:196:0x2054, B:198:0x2098, B:199:0x20f0, B:203:0x2126, B:205:0x2139, B:206:0x2185, B:209:0x21ad, B:211:0x21c0, B:212:0x2212, B:219:0x2419, B:221:0x242c, B:222:0x247d, B:230:0x2531, B:232:0x2573, B:233:0x25ca, B:237:0x25ff, B:239:0x2628, B:240:0x2681, B:247:0x273a, B:249:0x2780, B:250:0x27d6, B:254:0x280a, B:256:0x2833, B:257:0x288c, B:261:0x2948, B:263:0x299d, B:264:0x29f4, B:267:0x2a0a, B:269:0x2a19, B:270:0x2a62, B:274:0x2b0e, B:276:0x2b5c, B:277:0x2bb8, B:281:0x2bd1, B:283:0x2bea, B:284:0x2c36, B:288:0x2ce3, B:290:0x2d38, B:291:0x2d8f, B:294:0x2da5, B:296:0x2db4, B:297:0x2dfc, B:301:0x2eb5, B:303:0x2f0d, B:304:0x2f5d, B:307:0x2f73, B:309:0x2f82, B:310:0x2fcb, B:314:0x306e, B:316:0x30b2, B:317:0x3104, B:320:0x311a, B:322:0x3129, B:323:0x3176, B:327:0x3212, B:329:0x325a, B:330:0x32ab, B:334:0x32e5, B:336:0x330f, B:337:0x3369, B:341:0x341c, B:343:0x3471, B:344:0x34c4, B:348:0x34fa, B:350:0x350d, B:351:0x3560, B:355:0x362f, B:357:0x368e, B:358:0x36e6, B:361:0x36fc, B:363:0x370b, B:364:0x3757, B:368:0x381c, B:370:0x385e, B:371:0x38b9, B:374:0x38cf, B:376:0x38de, B:377:0x3925, B:381:0x39d9, B:383:0x3a2a, B:384:0x3a81, B:387:0x3a97, B:389:0x3aa6, B:390:0x3aef, B:394:0x3bc3, B:396:0x3c0f, B:397:0x3c66, B:400:0x3c7c, B:402:0x3c8b, B:403:0x3cd7, B:411:0x3da4, B:413:0x3df0, B:414:0x3e42, B:416:0x3e57, B:418:0x3e6a, B:419:0x3eb4, B:421:0x3ebc, B:423:0x3eec, B:424:0x3f4a, B:428:0x3fad, B:430:0x3ff2, B:431:0x4046, B:498:0x1227, B:500:0x123a, B:501:0x128e, B:513:0x1366, B:515:0x13aa, B:516:0x1403, B:525:0x0822, B:527:0x0835, B:528:0x088b, B:533:0x0a04, B:535:0x0a54, B:536:0x0aaa, B:541:0x095d, B:543:0x0970, B:544:0x09c5), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x165d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x1779 A[Catch: all -> 0x4066, TryCatch #1 {all -> 0x4066, blocks: (B:3:0x0004, B:6:0x001e, B:7:0x005e, B:11:0x0128, B:13:0x0167, B:14:0x01b4, B:19:0x01e7, B:21:0x01fa, B:22:0x0244, B:32:0x02c8, B:34:0x02db, B:35:0x0326, B:37:0x034b, B:39:0x035e, B:40:0x03aa, B:42:0x03b3, B:44:0x03d1, B:45:0x042f, B:49:0x04c5, B:51:0x04e3, B:52:0x0536, B:56:0x05f5, B:58:0x0613, B:59:0x0668, B:62:0x06f6, B:64:0x0714, B:65:0x076b, B:70:0x0df3, B:72:0x0e06, B:73:0x0e50, B:82:0x0ece, B:84:0x0ee1, B:85:0x0f2c, B:87:0x0f55, B:89:0x0f68, B:90:0x0fb4, B:92:0x0fbd, B:94:0x0fdb, B:95:0x1031, B:99:0x10f0, B:101:0x110e, B:102:0x1163, B:107:0x1456, B:109:0x1469, B:110:0x14b7, B:112:0x1560, B:114:0x1573, B:115:0x15c2, B:123:0x1682, B:125:0x16d8, B:126:0x172f, B:130:0x1766, B:132:0x1779, B:133:0x17c3, B:135:0x188e, B:137:0x18a1, B:138:0x18f1, B:146:0x19bc, B:148:0x1a0b, B:149:0x1a60, B:157:0x1b34, B:159:0x1b47, B:160:0x1b97, B:168:0x1c6a, B:170:0x1cb2, B:171:0x1d08, B:196:0x2054, B:198:0x2098, B:199:0x20f0, B:203:0x2126, B:205:0x2139, B:206:0x2185, B:209:0x21ad, B:211:0x21c0, B:212:0x2212, B:219:0x2419, B:221:0x242c, B:222:0x247d, B:230:0x2531, B:232:0x2573, B:233:0x25ca, B:237:0x25ff, B:239:0x2628, B:240:0x2681, B:247:0x273a, B:249:0x2780, B:250:0x27d6, B:254:0x280a, B:256:0x2833, B:257:0x288c, B:261:0x2948, B:263:0x299d, B:264:0x29f4, B:267:0x2a0a, B:269:0x2a19, B:270:0x2a62, B:274:0x2b0e, B:276:0x2b5c, B:277:0x2bb8, B:281:0x2bd1, B:283:0x2bea, B:284:0x2c36, B:288:0x2ce3, B:290:0x2d38, B:291:0x2d8f, B:294:0x2da5, B:296:0x2db4, B:297:0x2dfc, B:301:0x2eb5, B:303:0x2f0d, B:304:0x2f5d, B:307:0x2f73, B:309:0x2f82, B:310:0x2fcb, B:314:0x306e, B:316:0x30b2, B:317:0x3104, B:320:0x311a, B:322:0x3129, B:323:0x3176, B:327:0x3212, B:329:0x325a, B:330:0x32ab, B:334:0x32e5, B:336:0x330f, B:337:0x3369, B:341:0x341c, B:343:0x3471, B:344:0x34c4, B:348:0x34fa, B:350:0x350d, B:351:0x3560, B:355:0x362f, B:357:0x368e, B:358:0x36e6, B:361:0x36fc, B:363:0x370b, B:364:0x3757, B:368:0x381c, B:370:0x385e, B:371:0x38b9, B:374:0x38cf, B:376:0x38de, B:377:0x3925, B:381:0x39d9, B:383:0x3a2a, B:384:0x3a81, B:387:0x3a97, B:389:0x3aa6, B:390:0x3aef, B:394:0x3bc3, B:396:0x3c0f, B:397:0x3c66, B:400:0x3c7c, B:402:0x3c8b, B:403:0x3cd7, B:411:0x3da4, B:413:0x3df0, B:414:0x3e42, B:416:0x3e57, B:418:0x3e6a, B:419:0x3eb4, B:421:0x3ebc, B:423:0x3eec, B:424:0x3f4a, B:428:0x3fad, B:430:0x3ff2, B:431:0x4046, B:498:0x1227, B:500:0x123a, B:501:0x128e, B:513:0x1366, B:515:0x13aa, B:516:0x1403, B:525:0x0822, B:527:0x0835, B:528:0x088b, B:533:0x0a04, B:535:0x0a54, B:536:0x0aaa, B:541:0x095d, B:543:0x0970, B:544:0x09c5), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x18a1 A[Catch: all -> 0x4066, TryCatch #1 {all -> 0x4066, blocks: (B:3:0x0004, B:6:0x001e, B:7:0x005e, B:11:0x0128, B:13:0x0167, B:14:0x01b4, B:19:0x01e7, B:21:0x01fa, B:22:0x0244, B:32:0x02c8, B:34:0x02db, B:35:0x0326, B:37:0x034b, B:39:0x035e, B:40:0x03aa, B:42:0x03b3, B:44:0x03d1, B:45:0x042f, B:49:0x04c5, B:51:0x04e3, B:52:0x0536, B:56:0x05f5, B:58:0x0613, B:59:0x0668, B:62:0x06f6, B:64:0x0714, B:65:0x076b, B:70:0x0df3, B:72:0x0e06, B:73:0x0e50, B:82:0x0ece, B:84:0x0ee1, B:85:0x0f2c, B:87:0x0f55, B:89:0x0f68, B:90:0x0fb4, B:92:0x0fbd, B:94:0x0fdb, B:95:0x1031, B:99:0x10f0, B:101:0x110e, B:102:0x1163, B:107:0x1456, B:109:0x1469, B:110:0x14b7, B:112:0x1560, B:114:0x1573, B:115:0x15c2, B:123:0x1682, B:125:0x16d8, B:126:0x172f, B:130:0x1766, B:132:0x1779, B:133:0x17c3, B:135:0x188e, B:137:0x18a1, B:138:0x18f1, B:146:0x19bc, B:148:0x1a0b, B:149:0x1a60, B:157:0x1b34, B:159:0x1b47, B:160:0x1b97, B:168:0x1c6a, B:170:0x1cb2, B:171:0x1d08, B:196:0x2054, B:198:0x2098, B:199:0x20f0, B:203:0x2126, B:205:0x2139, B:206:0x2185, B:209:0x21ad, B:211:0x21c0, B:212:0x2212, B:219:0x2419, B:221:0x242c, B:222:0x247d, B:230:0x2531, B:232:0x2573, B:233:0x25ca, B:237:0x25ff, B:239:0x2628, B:240:0x2681, B:247:0x273a, B:249:0x2780, B:250:0x27d6, B:254:0x280a, B:256:0x2833, B:257:0x288c, B:261:0x2948, B:263:0x299d, B:264:0x29f4, B:267:0x2a0a, B:269:0x2a19, B:270:0x2a62, B:274:0x2b0e, B:276:0x2b5c, B:277:0x2bb8, B:281:0x2bd1, B:283:0x2bea, B:284:0x2c36, B:288:0x2ce3, B:290:0x2d38, B:291:0x2d8f, B:294:0x2da5, B:296:0x2db4, B:297:0x2dfc, B:301:0x2eb5, B:303:0x2f0d, B:304:0x2f5d, B:307:0x2f73, B:309:0x2f82, B:310:0x2fcb, B:314:0x306e, B:316:0x30b2, B:317:0x3104, B:320:0x311a, B:322:0x3129, B:323:0x3176, B:327:0x3212, B:329:0x325a, B:330:0x32ab, B:334:0x32e5, B:336:0x330f, B:337:0x3369, B:341:0x341c, B:343:0x3471, B:344:0x34c4, B:348:0x34fa, B:350:0x350d, B:351:0x3560, B:355:0x362f, B:357:0x368e, B:358:0x36e6, B:361:0x36fc, B:363:0x370b, B:364:0x3757, B:368:0x381c, B:370:0x385e, B:371:0x38b9, B:374:0x38cf, B:376:0x38de, B:377:0x3925, B:381:0x39d9, B:383:0x3a2a, B:384:0x3a81, B:387:0x3a97, B:389:0x3aa6, B:390:0x3aef, B:394:0x3bc3, B:396:0x3c0f, B:397:0x3c66, B:400:0x3c7c, B:402:0x3c8b, B:403:0x3cd7, B:411:0x3da4, B:413:0x3df0, B:414:0x3e42, B:416:0x3e57, B:418:0x3e6a, B:419:0x3eb4, B:421:0x3ebc, B:423:0x3eec, B:424:0x3f4a, B:428:0x3fad, B:430:0x3ff2, B:431:0x4046, B:498:0x1227, B:500:0x123a, B:501:0x128e, B:513:0x1366, B:515:0x13aa, B:516:0x1403, B:525:0x0822, B:527:0x0835, B:528:0x088b, B:533:0x0a04, B:535:0x0a54, B:536:0x0aaa, B:541:0x095d, B:543:0x0970, B:544:0x09c5), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x198f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x1b32  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x1c4c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x1d1e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x2035  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x2106  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x1c49 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x1a79  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0e06 A[Catch: all -> 0x4066, TryCatch #1 {all -> 0x4066, blocks: (B:3:0x0004, B:6:0x001e, B:7:0x005e, B:11:0x0128, B:13:0x0167, B:14:0x01b4, B:19:0x01e7, B:21:0x01fa, B:22:0x0244, B:32:0x02c8, B:34:0x02db, B:35:0x0326, B:37:0x034b, B:39:0x035e, B:40:0x03aa, B:42:0x03b3, B:44:0x03d1, B:45:0x042f, B:49:0x04c5, B:51:0x04e3, B:52:0x0536, B:56:0x05f5, B:58:0x0613, B:59:0x0668, B:62:0x06f6, B:64:0x0714, B:65:0x076b, B:70:0x0df3, B:72:0x0e06, B:73:0x0e50, B:82:0x0ece, B:84:0x0ee1, B:85:0x0f2c, B:87:0x0f55, B:89:0x0f68, B:90:0x0fb4, B:92:0x0fbd, B:94:0x0fdb, B:95:0x1031, B:99:0x10f0, B:101:0x110e, B:102:0x1163, B:107:0x1456, B:109:0x1469, B:110:0x14b7, B:112:0x1560, B:114:0x1573, B:115:0x15c2, B:123:0x1682, B:125:0x16d8, B:126:0x172f, B:130:0x1766, B:132:0x1779, B:133:0x17c3, B:135:0x188e, B:137:0x18a1, B:138:0x18f1, B:146:0x19bc, B:148:0x1a0b, B:149:0x1a60, B:157:0x1b34, B:159:0x1b47, B:160:0x1b97, B:168:0x1c6a, B:170:0x1cb2, B:171:0x1d08, B:196:0x2054, B:198:0x2098, B:199:0x20f0, B:203:0x2126, B:205:0x2139, B:206:0x2185, B:209:0x21ad, B:211:0x21c0, B:212:0x2212, B:219:0x2419, B:221:0x242c, B:222:0x247d, B:230:0x2531, B:232:0x2573, B:233:0x25ca, B:237:0x25ff, B:239:0x2628, B:240:0x2681, B:247:0x273a, B:249:0x2780, B:250:0x27d6, B:254:0x280a, B:256:0x2833, B:257:0x288c, B:261:0x2948, B:263:0x299d, B:264:0x29f4, B:267:0x2a0a, B:269:0x2a19, B:270:0x2a62, B:274:0x2b0e, B:276:0x2b5c, B:277:0x2bb8, B:281:0x2bd1, B:283:0x2bea, B:284:0x2c36, B:288:0x2ce3, B:290:0x2d38, B:291:0x2d8f, B:294:0x2da5, B:296:0x2db4, B:297:0x2dfc, B:301:0x2eb5, B:303:0x2f0d, B:304:0x2f5d, B:307:0x2f73, B:309:0x2f82, B:310:0x2fcb, B:314:0x306e, B:316:0x30b2, B:317:0x3104, B:320:0x311a, B:322:0x3129, B:323:0x3176, B:327:0x3212, B:329:0x325a, B:330:0x32ab, B:334:0x32e5, B:336:0x330f, B:337:0x3369, B:341:0x341c, B:343:0x3471, B:344:0x34c4, B:348:0x34fa, B:350:0x350d, B:351:0x3560, B:355:0x362f, B:357:0x368e, B:358:0x36e6, B:361:0x36fc, B:363:0x370b, B:364:0x3757, B:368:0x381c, B:370:0x385e, B:371:0x38b9, B:374:0x38cf, B:376:0x38de, B:377:0x3925, B:381:0x39d9, B:383:0x3a2a, B:384:0x3a81, B:387:0x3a97, B:389:0x3aa6, B:390:0x3aef, B:394:0x3bc3, B:396:0x3c0f, B:397:0x3c66, B:400:0x3c7c, B:402:0x3c8b, B:403:0x3cd7, B:411:0x3da4, B:413:0x3df0, B:414:0x3e42, B:416:0x3e57, B:418:0x3e6a, B:419:0x3eb4, B:421:0x3ebc, B:423:0x3eec, B:424:0x3f4a, B:428:0x3fad, B:430:0x3ff2, B:431:0x4046, B:498:0x1227, B:500:0x123a, B:501:0x128e, B:513:0x1366, B:515:0x13aa, B:516:0x1403, B:525:0x0822, B:527:0x0835, B:528:0x088b, B:533:0x0a04, B:535:0x0a54, B:536:0x0aaa, B:541:0x095d, B:543:0x0970, B:544:0x09c5), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0e5b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values$4956fc2a(int i, java.lang.Object obj) {
        int i2;
        long j;
        java.lang.Object obj2;
        java.lang.String str;
        java.lang.String str2;
        long j2;
        int i3;
        java.lang.String str3;
        java.lang.Object obj3;
        long j3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        long j4;
        java.lang.Object obj6;
        long j5;
        java.lang.String[] strArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.Object invoke;
        java.lang.Object[] objArr;
        int parseInt;
        java.lang.String[] strArr2;
        int i9;
        java.lang.String[] strArr3;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.String str4;
        java.lang.Object obj9;
        char c;
        int i10;
        java.lang.Object obj10;
        try {
            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
            java.lang.String str5 = "";
            if (obj11 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 27, 1838 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                byte[] bArr = $$a;
                byte b = bArr[16];
                byte b2 = bArr[14];
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                d(b, b2, (short) (b2 & 653), objArr2);
                obj11 = cls.getMethod((java.lang.String) objArr2[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj11);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, null)).longValue();
            long j6 = i;
            long j7 = ~longValue;
            long j8 = ~j6;
            long j9 = (((-675) * longValue) - 51065635423L) + ((j6 | (-75429299) | j7) * (-676)) + (((~(j8 | (-75429299))) | (~(j7 | (-75429299)))) * 676) + (((~(j7 | 75429298)) | (~(j7 | j8)) | (~((-75429299) | longValue | j6))) * 676) + 915508244;
            int i11 = ~i;
            if (((((int) j9) & (((((~(674313387 | i11)) | 1439337044) * 529) - 1520785380) + (((~(674313387 | i)) | 2111539797) * 529))) | (((int) (j9 >> 32)) & (((((~(758602390 | i11)) | 1342702888) * 98) - 1307721751) + (((~((-2099138495) | i)) | (~(i11 | 2099138494)) | 758602390) * (-49)) + (((~(758602390 | i)) | 756435606) * 49)))) != 0) {
                java.lang.Object[] objArr3 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                java.lang.Object[] objArr4 = {783712867, 16, java.lang.Integer.valueOf(((((~((-416638866) | i)) | 273679120) * 1504) - 127520065) + ((~(i | (-142959746))) * (-1504)) + 1540309520)};
                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj12 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2713 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.os.Process.myPid() >> 22));
                    byte b3 = $$a[14];
                    byte b4 = (byte) (b3 + 1);
                    byte b5 = b3;
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d(b4, b5, (short) (b5 + 1), objArr5);
                    obj12 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                }
                ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr4)).intValue();
                return objArr3;
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            e("0\u000e\u001c\u000e\u000e-\u0013!\u000e-㙓", 11 - android.graphics.Color.red(0), (byte) (android.view.Gravity.getAbsoluteGravity(0, 0) + 84), objArr6);
            java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj13 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 40, 1921 - android.text.TextUtils.getTrimmedLength(""), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                byte[] bArr2 = $$a;
                byte b6 = bArr2[16];
                byte b7 = bArr2[14];
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                d(b6, b7, (short) (b7 & 653), objArr8);
                obj13 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
            }
            java.lang.String str6 = (java.lang.String) ((java.lang.reflect.Method) obj13).invoke(null, objArr7);
            if (str6 != null) {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                e("-\u000e!&\r#", 7 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) ((android.os.Process.myTid() >> 22) + 55), objArr9);
                java.lang.String intern = ((java.lang.String) objArr9[0]).intern();
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                f("\u0019\ue628ញ泮\u0d53麦橕⢚", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 8, objArr10);
                java.lang.String[] strArr4 = {intern, ((java.lang.String) objArr10[0]).intern()};
                int i12 = 0;
                for (int i13 = 2; i12 < i13; i13 = 2) {
                    getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                    if (str6.contains(strArr4[i12])) {
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        e("0\u000e\u0016\u00180\u000e\r($/\u0019#\u0018&(0\u0013&0$+\u000e㙘", 24 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) (android.graphics.Color.rgb(0, 0, 0) + 16777328), objArr11);
                        java.lang.Object[] objArr12 = {((java.lang.String) objArr11[0]).intern()};
                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj14 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 40, 1921 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.Color.blue(0));
                            byte[] bArr3 = $$a;
                            byte b8 = bArr3[16];
                            byte b9 = bArr3[14];
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            d(b8, b9, (short) (b9 & 653), objArr13);
                            obj14 = cls4.getMethod((java.lang.String) objArr13[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
                        }
                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj14).invoke(null, objArr12);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        e("0\u000e\u0016\u00180\u000e\r($/\u0019\u0007\u0019\r\u0001\u0016#\u0019&\u0012\"&-\u0013$/#0\u000e+", android.graphics.Color.argb(0, 0, 0, 0) + 30, (byte) (81 - android.view.KeyEvent.keyCodeFromString("")), objArr14);
                        java.lang.Object[] objArr15 = {((java.lang.String) objArr14[0]).intern()};
                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj15 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.resolveSize(0, 0), android.view.View.MeasureSpec.getMode(0) + 1921, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                            byte[] bArr4 = $$a;
                            byte b10 = bArr4[16];
                            byte b11 = bArr4[14];
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            d(b10, b11, (short) (b11 & 653), objArr16);
                            obj15 = cls5.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj15);
                        }
                        java.lang.Object invoke3 = ((java.lang.reflect.Method) obj15).invoke(null, objArr15);
                        if (invoke2 != null) {
                            java.lang.Object[] objArr17 = {invoke2, 42};
                            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj16 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2594 - (android.os.Process.myTid() >> 22), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                byte[] bArr5 = $$a;
                                byte b12 = bArr5[16];
                                byte b13 = bArr5[14];
                                str4 = "";
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                d(b12, b13, (short) (b13 & 653), objArr18);
                                obj16 = cls6.getMethod((java.lang.String) objArr18[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj16);
                            } else {
                                str4 = "";
                            }
                            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr17)).longValue();
                            obj9 = invoke2;
                            obj8 = invoke3;
                            long j10 = (628 * longValue2) + 24076041060L + ((longValue2 | j6 | (-38337646)) * (-627)) + (((~((~longValue2) | j6)) | 38337645) * (-627)) + (((~(longValue2 | j8)) | (~(38337645 | j6))) * 627) + 1218762879;
                            int i14 = (int) (j10 >> 32);
                            int i15 = (int) j10;
                            int i16 = ~((-567311683) | i11);
                            if (((i14 & ((((~((-705250583) | i)) | (-2142476994)) * (-465)) + 370883239 + (((~((-2142476994) | i)) | (-705250583)) * 930) + (((-704708609) | i) * 465))) | (i15 & (((302612517 | i16) * (-970)) + 2052022935 + ((i16 | (-869924200)) * 970)))) == 477111747) {
                                i2 = i11;
                                j = j6;
                                if (android.os.Build.VERSION.SDK_INT <= 33) {
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    e("\u0001\u0014/$\u0001\" \u001e0\u0001㙌㙌/\u000b\u0005\b\u0010\u001d#&&\u0010 \u0010\u000e\u0016/#", 27 - android.os.Process.getGidForName(str4), (byte) (android.text.TextUtils.getTrimmedLength(str4) + 86), objArr19);
                                    java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                    if (obj17 == null) {
                                        str5 = str4;
                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 3161 - android.text.TextUtils.getOffsetBefore(str5, 0), (char) (android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33100));
                                        byte[] bArr6 = $$a;
                                        byte b14 = bArr6[16];
                                        byte b15 = bArr6[14];
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        d(b14, b15, (short) (b15 & 653), objArr21);
                                        obj17 = cls7.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj17);
                                    } else {
                                        str5 = str4;
                                    }
                                    long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr20)).longValue();
                                    long j11 = ~longValue3;
                                    long j12 = 963365726 | j11;
                                    long j13 = ((((((-764) * longValue3) + 1472986196583L) + ((((~(j12 | j8)) | (~((longValue3 | 963365726) | j))) | (~(((-963365727) | j11) | j))) * 765)) + (((~j12) | (~(963365726 | j8))) * 1530)) + (((~(j | 963365726)) | (~((j11 | j8) | (-963365727)))) * 765)) - 374302381;
                                    if (((((int) (j13 >> 32)) & (((((i2 | (-38574129)) * (-490)) - 2140452346) + (((~((-1112317051) | i)) | 1073742922) * 490)) - 291796938)) | (((int) j13) & ((((~(448912402 | i)) | 539500933 | (~((-988314008) | i))) * (-754)) + 1544657935 + (((~((-539500934) | i)) | (~(i2 | (-448813075)))) * (-754)) + ((i2 | 448912402) * 754)))) == 1) {
                                        i10 = 1;
                                        c = 0;
                                        int[] iArr = new int[i10];
                                        int[] iArr2 = new int[i10];
                                        iArr[c] = i;
                                        iArr2[c] = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                        java.lang.Object[] objArr22 = {iArr, iArr2, null, new int[i10]};
                                        java.lang.Object[] objArr23 = {783712867, 16, java.lang.Integer.valueOf((((~(998216702 | i)) * 623) - 1321450542) + ((i2 | 287703214) * (-623)) + (((~(i | 288297198)) | (-998216703) | (~(997622718 | i))) * 623))};
                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj18 == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) android.text.TextUtils.getOffsetAfter(str5, 0));
                                            byte b16 = $$a[14];
                                            byte b17 = (byte) (b16 + 1);
                                            byte b18 = b16;
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            d(b17, b18, (short) (b18 + 1), objArr24);
                                            obj18 = cls8.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj18);
                                        }
                                        ((int[]) objArr22[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr23)).intValue();
                                        return objArr22;
                                    }
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    f("ﲡ\udcd3\udec7껶귫鷂峟瑴", 8 - android.text.TextUtils.indexOf(str5, str5), objArr25);
                                    java.lang.String intern2 = ((java.lang.String) objArr25[0]).intern();
                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                    f("丈\ue8eb䋀쟣｀㣍", android.view.View.combineMeasuredStates(0, 0) + 6, objArr26);
                                    java.lang.String intern3 = ((java.lang.String) objArr26[0]).intern();
                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                    f("䣺柶뎳ᵡ䮮\ue37f穐㜠", 6 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr27);
                                    java.lang.String intern4 = ((java.lang.String) objArr27[0]).intern();
                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                    e("(\t \t\u000e+\u0014\u0010㙘", 9 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (byte) (111 - android.view.MotionEvent.axisFromString(str5)), objArr28);
                                    java.lang.String intern5 = ((java.lang.String) objArr28[0]).intern();
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    e("!\b\u0013'\u000f ", (android.os.Process.myTid() >> 22) + 6, (byte) (53 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr29);
                                    java.lang.String intern6 = ((java.lang.String) objArr29[0]).intern();
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    f("싈걊ᜃǄ⌲⨸\uf61a貈\ue509\ue007⏶\ud7c9騾骿", 13 - android.graphics.Color.alpha(0), objArr30);
                                    java.lang.String intern7 = ((java.lang.String) objArr30[0]).intern();
                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                    f("똞騂殗┟ʿ㻭", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '+', objArr31);
                                    java.lang.String intern8 = ((java.lang.String) objArr31[0]).intern();
                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                    f("勸觤䮮\ue37f瑙鰔", '6' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr32);
                                    java.lang.String intern9 = ((java.lang.String) objArr32[0]).intern();
                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                    e("!\u0016", android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3, (byte) (2 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr33);
                                    java.lang.String intern10 = ((java.lang.String) objArr33[0]).intern();
                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                    e("\u0013\u000e,\u001e\u000e+\b \b.\u0019\u0007-\u000f+,", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 16, (byte) (6 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr34);
                                    java.lang.String intern11 = ((java.lang.String) objArr34[0]).intern();
                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                    f("嶽\ue95f鬖짪ᤫ噶숵\uf165䄘좉", 10 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr35);
                                    java.lang.String intern12 = ((java.lang.String) objArr35[0]).intern();
                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                    e("\u0015,\u0013)-\u000e -", 8 - (android.os.Process.myTid() >> 22), (byte) (71 - android.text.TextUtils.getOffsetBefore(str5, 0)), objArr36);
                                    java.lang.String intern13 = ((java.lang.String) objArr36[0]).intern();
                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                    f("炁㩤誻衺狰\ude33鯲乏㸻쮅⼮퐲", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, objArr37);
                                    java.lang.String intern14 = ((java.lang.String) objArr37[0]).intern();
                                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                                    f("炁㩤誻衺狰\ude33鯲乏㸻쮅瘢㼕謣膓", 14 - android.text.TextUtils.getTrimmedLength(str5), objArr38);
                                    java.lang.String intern15 = ((java.lang.String) objArr38[0]).intern();
                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                    e("+\u000e)\u0012&\"㙖", android.view.View.resolveSizeAndState(0, 0, 0) + 7, (byte) (104 - (android.os.Process.myTid() >> 22)), objArr39);
                                    java.lang.String intern16 = ((java.lang.String) objArr39[0]).intern();
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    e("\f\b\u0013\u001b&\u0012㗽", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, (byte) (android.text.TextUtils.indexOf(str5, str5, 0) + 19), objArr40);
                                    java.lang.String intern17 = ((java.lang.String) objArr40[0]).intern();
                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                    e("\f \u000f \u0001\u0016㗎", android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 8, (byte) (37 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr41);
                                    java.lang.String intern18 = ((java.lang.String) objArr41[0]).intern();
                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                    e("㘖㘖", 2 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (byte) (44 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr42);
                                    java.lang.String intern19 = ((java.lang.String) objArr42[0]).intern();
                                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                                    e("\b.\u000e-0\u001d\u0016!*\b \u0014\u0013)-\u0012$\u0010\u001d-", 20 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) (97 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr43);
                                    java.lang.String intern20 = ((java.lang.String) objArr43[0]).intern();
                                    java.lang.Object[] objArr44 = new java.lang.Object[1];
                                    f("\uef37求턤\udd69渜䘜", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '*', objArr44);
                                    java.lang.String intern21 = ((java.lang.String) objArr44[0]).intern();
                                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                                    f("숮䁕", android.graphics.Color.blue(0) + 2, objArr45);
                                    java.lang.String intern22 = ((java.lang.String) objArr45[0]).intern();
                                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                                    e("\n\u0012 \u001e\u0001$\u0016\u0012+\u0000\b.\u000f-'\r", android.text.TextUtils.getTrimmedLength(str5) + 16, (byte) (79 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr46);
                                    java.lang.String intern23 = ((java.lang.String) objArr46[0]).intern();
                                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                                    f("㟱䠵嗝䔾䈱쾉拗ퟍꀺ㢲", 9 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr47);
                                    java.lang.String intern24 = ((java.lang.String) objArr47[0]).intern();
                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                    f("㟱䠵嗝䔾䈱쾉拗ퟍ쇊낲", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, objArr48);
                                    java.lang.String intern25 = ((java.lang.String) objArr48[0]).intern();
                                    java.lang.Object[] objArr49 = new java.lang.Object[1];
                                    f("㟱䠵嗝䔾䮮\ue37f흇믒\ue5c0Ć뮅瞋", android.text.TextUtils.getOffsetAfter(str5, 0) + 11, objArr49);
                                    java.lang.String intern26 = ((java.lang.String) objArr49[0]).intern();
                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                    e("&\"\u0016!!\n\u001c\u001e!-㙤", 11 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (111 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr50);
                                    java.lang.String intern27 = ((java.lang.String) objArr50[0]).intern();
                                    java.lang.Object[] objArr51 = new java.lang.Object[1];
                                    f("㤞\uf405Ⳍ\ue703䤂졅㎶う\u193d⬧諾婟❰膝꺥䮧", android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, objArr51);
                                    java.lang.String intern28 = ((java.lang.String) objArr51[0]).intern();
                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                    e("&\"\u0016!!\n \r\u0019)\"\u0010\u0019\u0012", 13 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 108), objArr52);
                                    java.lang.String[] strArr5 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr52[0]).intern()};
                                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                                    e("0\u000e\u001c\u000e\u000e-\u0013!\u000e-㙓", android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 12, (byte) (android.view.View.resolveSize(0, 0) + 84), objArr53);
                                    java.lang.Object[] objArr54 = {((java.lang.String) objArr53[0]).intern()};
                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj2 == null) {
                                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41, 1921 - android.text.TextUtils.indexOf(str5, str5, 0, 0), (char) android.view.View.resolveSize(0, 0));
                                        byte[] bArr7 = $$a;
                                        byte b19 = bArr7[16];
                                        byte b20 = bArr7[14];
                                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                                        d(b19, b20, (short) (b20 & 653), objArr55);
                                        obj2 = cls9.getMethod((java.lang.String) objArr55[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                    }
                                    str = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr54);
                                    if (str != null) {
                                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 69) % 128;
                                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                                        e("-\u000e!&\r#", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 5, (byte) (55 - (android.os.Process.myPid() >> 22)), objArr56);
                                        int i17 = 0;
                                        java.lang.String intern29 = ((java.lang.String) objArr56[0]).intern();
                                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                                        f("\u0019\ue628ញ泮\u0d53麦橕⢚", 8 - android.graphics.Color.red(0), objArr57);
                                        java.lang.String[] strArr6 = {intern29, ((java.lang.String) objArr57[0]).intern()};
                                        int i18 = 0;
                                        int i19 = 2;
                                        while (i18 < i19) {
                                            if (str.contains(strArr6[i18])) {
                                                java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                e("0\u000e\u0016\u00180\u000e\r($/\u0019#\u0018&(0\u0013&0$+\u000e㙘", 22 - android.graphics.ImageFormat.getBitsPerPixel(i17), (byte) (112 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr58);
                                                java.lang.Object[] objArr59 = {((java.lang.String) objArr58[i17]).intern()};
                                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj19 == null) {
                                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('X' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.View.MeasureSpec.getSize(0) + 1921, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                    byte[] bArr8 = $$a;
                                                    byte b21 = bArr8[16];
                                                    byte b22 = bArr8[14];
                                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                    d(b21, b22, (short) (b22 & 653), objArr60);
                                                    obj19 = cls10.getMethod((java.lang.String) objArr60[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj19);
                                                }
                                                java.lang.Object invoke4 = ((java.lang.reflect.Method) obj19).invoke(null, objArr59);
                                                java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                e("0\u000e\u0016\u00180\u000e\r($/\u0019\u0007\u0019\r\u0001\u0016#\u0019&\u0012\"&-\u0013$/#0\u000e+", 30 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (byte) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 81), objArr61);
                                                java.lang.Object[] objArr62 = {((java.lang.String) objArr61[0]).intern()};
                                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj20 == null) {
                                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1921, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                    byte[] bArr9 = $$a;
                                                    byte b23 = bArr9[16];
                                                    byte b24 = bArr9[14];
                                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                    d(b23, b24, (short) (b24 & 653), objArr63);
                                                    obj20 = cls11.getMethod((java.lang.String) objArr63[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj20);
                                                }
                                                java.lang.Object invoke5 = ((java.lang.reflect.Method) obj20).invoke(null, objArr62);
                                                if (invoke4 != null) {
                                                    java.lang.Object[] objArr64 = {invoke4, 42};
                                                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj21 == null) {
                                                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 28, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2593, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                        byte[] bArr10 = $$a;
                                                        byte b25 = bArr10[16];
                                                        byte b26 = bArr10[14];
                                                        java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                        d(b25, b26, (short) (b26 & 653), objArr65);
                                                        obj21 = cls12.getMethod((java.lang.String) objArr65[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj21);
                                                    }
                                                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr64)).longValue();
                                                    long j14 = ~longValue4;
                                                    long j15 = 515536971 | j14;
                                                    strArr3 = strArr5;
                                                    long j16 = j8 | (-515536972);
                                                    str2 = str5;
                                                    obj7 = invoke5;
                                                    long j17 = ((569 * longValue4) - 293340537068L) + (((~(j8 | 515536971)) | (~j15) | (~(j14 | j8))) * (-1136)) + (((~(j | 515536971)) | (~(j14 | j)) | (~(j16 | longValue4))) * (-568)) + (((~(j8 | longValue4)) | (~j16) | (~(j15 | j))) * 568) + 1772637496;
                                                    i3 = i;
                                                    if (((((int) j17) & ((((~(i2 | 811407205)) | 625819204) * (-865)) + 1237909972 + ((~((-811407206) | i3)) * 865) + (((~(i2 | (-811407206))) | (~(i2 | 625819204))) * 865))) | (((int) (j17 >> 32)) & ((((i2 | 1489655360) * 1324) - 818884594) + (((~(1557847880 | i3)) | (~((-120621470) | i3))) * (-1324)) + 1342403228))) != 477111747) {
                                                    }
                                                    int i20 = 0;
                                                    int i21 = 0;
                                                    while (i20 < 28) {
                                                        java.lang.String str7 = strArr3[i20];
                                                        java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                        f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e\ueca1Ỵ鍈귲", android.view.View.MeasureSpec.getMode(0) + 12, objArr66);
                                                        java.lang.Object[] objArr67 = {((java.lang.String) objArr66[0]).intern().concat(java.lang.String.valueOf(str7))};
                                                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                                        if (obj22 == null) {
                                                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3161, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33098));
                                                            byte[] bArr11 = $$a;
                                                            byte b27 = bArr11[16];
                                                            byte b28 = bArr11[23];
                                                            java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                            d(b27, b28, (short) (b28 + 2), objArr68);
                                                            obj22 = cls13.getMethod((java.lang.String) objArr68[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj22);
                                                        }
                                                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr67)).longValue();
                                                        long j18 = ~longValue5;
                                                        long j19 = (-856688355) | longValue5;
                                                        long j20 = j8;
                                                        long j21 = ((longValue5 * (-751)) - 643372953854L) + (((~(j | (-856688355))) | (~((-856688355) | j18))) * 1504) + ((~(j19 | j)) * (-1504)) + (((~j19) | (~(j18 | 856688354))) * 752) + 50782384;
                                                        i21 += ((((int) j21) & ((((((~(i2 | 552011032)) | (-1989237443)) * (-328)) + (-1590148599)) + (((-1989237443) | i3) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE)) + ((((~((-552011033) | i3)) | 6685976) | (~(i2 | (-1443912387)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))) | (((((((~(i2 | (-1649779964))) | (-1207960922)) * (-1042)) + (-303286692)) + (((-1649779964) | i3) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)) + ((((~(1207960921 | i3)) | (-1783997948)) | (~(i2 | (-1073742938)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)) & ((int) (j21 >> 32)))) == 0 ? 0 : 1;
                                                        i20++;
                                                        j8 = j20;
                                                    }
                                                    j2 = j8;
                                                    if (i21 >= 25.2d) {
                                                        java.lang.Object[] objArr69 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
                                                        int i22 = ~(i2 | (-874899585));
                                                        java.lang.Object[] objArr70 = {783712867, 16, java.lang.Integer.valueOf((((-1040186801) | i22 | (~(874899584 | i3))) * (-338)) + 1313505053 + ((i22 | (~((-165287217) | i3))) * 338))};
                                                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj23 == null) {
                                                            java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2713, (char) (android.os.Process.myTid() >> 22));
                                                            byte b29 = $$a[14];
                                                            byte b30 = (byte) (b29 + 1);
                                                            byte b31 = b29;
                                                            java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                            d(b30, b31, (short) (b31 + 1), objArr71);
                                                            obj23 = cls14.getMethod((java.lang.String) objArr71[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                                                        }
                                                        ((int[]) objArr69[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr70)).intValue();
                                                        return objArr69;
                                                    }
                                                    str3 = str2;
                                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                    e("\u0004\r\u0019\r\u00050\r\u0004\b\u0012\u000f \"&)\u0003\u0011\u001d0\u0013/#㘎", android.view.View.MeasureSpec.getSize(0) + 23, (byte) (android.text.TextUtils.indexOf(str3, str3) + 15), objArr72);
                                                    java.lang.Object[] objArr73 = {((java.lang.String) objArr72[0]).intern()};
                                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                    if (obj3 == null) {
                                                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2807, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                                        byte[] bArr12 = $$a;
                                                        byte b32 = bArr12[16];
                                                        byte b33 = bArr12[14];
                                                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                        d(b32, b33, (short) (b33 & 653), objArr74);
                                                        obj3 = cls15.getMethod((java.lang.String) objArr74[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                                                    }
                                                    long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr73)).longValue();
                                                    long j22 = ~longValue6;
                                                    long j23 = ((-163) * longValue6) + 192384838635L + (((~(j2 | longValue6)) | 1165968719) * (-328)) + ((j | 1165968719) * 164) + (((~(longValue6 | j2 | 1165968719)) | (~(j22 | j)) | (~((-1165968720) | j22))) * 164) + 124571348;
                                                    j3 = (((int) (j23 >> 32)) & ((((~((-273940545) | i3)) | 82452) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1590658886 + ((~(i2 | (-273940545))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))) | (((int) j23) & (((((-67635282) | i3) * (-627)) - 635053948) + (((~((-2075578627) | i3)) | 782162259) * (-627)) + (((~(i2 | 2075578626)) | (~(782162259 | i3))) * 627)));
                                                    java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                    e("\u0002\u001b0\u000e)\u0005\b\u0012\u0013.\u0004\r-\u000f0$㙣", android.graphics.Color.green(0) + 17, (byte) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE), objArr75);
                                                    java.lang.Object[] objArr76 = {((java.lang.String) objArr75[0]).intern()};
                                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                    if (obj4 == null) {
                                                        java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 2807 - android.text.TextUtils.indexOf(str3, str3, 0, 0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                                        byte[] bArr13 = $$a;
                                                        byte b34 = bArr13[16];
                                                        byte b35 = bArr13[14];
                                                        java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                        d(b34, b35, (short) (b35 & 653), objArr77);
                                                        obj4 = cls16.getMethod((java.lang.String) objArr77[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                                                    }
                                                    long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr76)).longValue();
                                                    long j24 = ~longValue7;
                                                    long j25 = (407 * longValue7) + 194041071990L + (((~(j2 | (-479113758) | longValue7)) | (~(j24 | j))) * (-406)) + ((~(j24 | j2 | (-479113758))) * (-406)) + (((~(j2 | longValue7)) | (~(j | 479113757))) * 406) + 1769653825;
                                                    int i23 = ~(i2 | 1868490271);
                                                    long j26 = (((int) (j25 >> 32)) & (((152338452 | i23) * (-970)) + 661715908 + ((i23 | 1716151819) * 970))) | (((int) j25) & (((((~(i2 | 1058909500)) | (-378316910)) * (-90)) - 1687905466) + (((~(1058909500 | i3)) | 369928236) * (-45)) + (((~(378316909 | i3)) | 1058909500 | (~(i2 | (-378316910)))) * 45)));
                                                    if (j3 <= 0 && j26 > 0 && j26 - 3 < j3) {
                                                        java.lang.Object[] objArr78 = {new int[]{i3}, new int[]{i3 ^ 247}, null, new int[1]};
                                                        java.lang.Object[] objArr79 = {783712867, 16, java.lang.Integer.valueOf((((~(i2 | (-612952969))) | 96372551) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1936568614 + (((~(i2 | (-536897673))) | (~(633270223 | i3))) * (-519)) + (((~(96372551 | i3)) | 612952968) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                                                        java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj24 == null) {
                                                            java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myTid() >> 22), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                                            byte b36 = $$a[14];
                                                            byte b37 = (byte) (b36 + 1);
                                                            byte b38 = b36;
                                                            java.lang.Object[] objArr80 = new java.lang.Object[1];
                                                            d(b37, b38, (short) (b38 + 1), objArr80);
                                                            obj24 = cls17.getMethod((java.lang.String) objArr80[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj24);
                                                        }
                                                        ((int[]) objArr78[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr79)).intValue();
                                                        return objArr78;
                                                    }
                                                    java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                    e("\u0004\r\u0019\r\u00050\r\u0004\b\u0012\u000f \"&)\u0003\u0011\u001d0\u0013/#㘎", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, (byte) (android.view.Gravity.getAbsoluteGravity(0, 0) + 15), objArr81);
                                                    java.lang.Object[] objArr82 = {((java.lang.String) objArr81[0]).intern()};
                                                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                    if (obj5 == null) {
                                                        java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.KeyEvent.normalizeMetaState(0), android.text.TextUtils.indexOf(str3, str3, 0, 0) + 2807, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                        byte[] bArr14 = $$a;
                                                        byte b39 = bArr14[16];
                                                        byte b40 = bArr14[14];
                                                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                        d(b39, b40, (short) (b40 & 653), objArr83);
                                                        obj5 = cls18.getMethod((java.lang.String) objArr83[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                                                    }
                                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr82)).longValue();
                                                    long j27 = ~longValue8;
                                                    long j28 = j27 | j2;
                                                    long j29 = (longValue8 * (-49)) + 38226201768L + ((j | 749533368) * (-50)) + (((~((-749533369) | j27 | j)) | (~(749533368 | j28))) * 50) + (((~(j27 | 749533368)) | (~j28) | (~(j2 | 749533368))) * 50) + 541006699;
                                                    j4 = (((int) j29) & ((((~((-562044993) | i3)) * 623) - 51193424) + ((i2 | 136841237) * (-623)) + (((~(506011327 | i3)) | 562044992 | (~((-931215083) | i3))) * 623))) | (((int) (j29 >> 32)) & ((((~(i2 | 1127853317)) | (~(i2 | 1729887567))) * (-867)) + 1972008040 + (((~(1729887567 | i3)) | (-1731984720) | (~(1127853317 | i3))) * (-1734)) + (((~(i2 | 1731984719)) | (~((-2097153) | i3)) | (~((-604131403) | i3))) * 867)));
                                                    java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                    f("\ue148둛⃕\ueba0", android.graphics.Color.rgb(0, 0, 0) + 16777220, objArr84);
                                                    java.lang.Object[] objArr85 = {((java.lang.String) objArr84[0]).intern()};
                                                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                    if (obj6 == null) {
                                                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28, android.view.View.resolveSize(0, 0) + 2807, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                                        byte[] bArr15 = $$a;
                                                        byte b41 = bArr15[16];
                                                        byte b42 = bArr15[14];
                                                        java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                        d(b41, b42, (short) (b42 & 653), objArr86);
                                                        obj6 = cls19.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj6);
                                                    }
                                                    long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr85)).longValue();
                                                    long j30 = ~((-199176677) | (~longValue9));
                                                    long j31 = 199176676 | longValue9;
                                                    long j32 = ((longValue9 * (-755)) - 150378390380L) + (1512 * j30) + ((j30 | (~(j31 | j))) * (-756)) + ((j31 | j2) * 756) + 1091363391;
                                                    long j33 = (((int) j32) & (((((~(i2 | (-1777281024))) | (~((-1080459863) | i3))) * 1900) - 1871736089) + (((~(i2 | 1080459862)) | (~(1777281023 | i3))) * (-950)) + (((~(1080459862 | i3)) | (~(i2 | 1777281023))) * 950))) | (((int) (j32 >> 32)) & ((((~(1252969697 | i3)) | (-1605295604)) * 336) + 501358106 + (((~((-1604771188) | i3)) | 1252445281) * (-168)) + (((~(i2 | (-1604771188))) | 1252969697) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)));
                                                    if (j4 <= 0) {
                                                        j5 = 0;
                                                    } else {
                                                        if (j33 > 0 && j33 + 100 < j4) {
                                                            SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 21) % 128;
                                                            java.lang.Object[] objArr87 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                                                            java.lang.Object[] objArr88 = {783712867, 16, java.lang.Integer.valueOf(((((~(i2 | 624913103)) | 84412416) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 1165863029) + (((~(i2 | 622479363)) | 86846156) * (-440)) + ((624913103 | i3) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))};
                                                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj25 == null) {
                                                                java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.view.KeyEvent.normalizeMetaState(0) + 2713, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                byte b43 = $$a[14];
                                                                byte b44 = (byte) (b43 + 1);
                                                                byte b45 = b43;
                                                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                                d(b44, b45, (short) (b45 + 1), objArr89);
                                                                obj25 = cls20.getMethod((java.lang.String) objArr89[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj25);
                                                            }
                                                            ((int[]) objArr87[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr88)).intValue();
                                                            return objArr87;
                                                        }
                                                        j5 = 0;
                                                    }
                                                    java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                    f("䤱\udf18峟瑴\ue5c0Ć쓷훦", 7 - android.widget.ExpandableListView.getPackedPositionGroup(j5), objArr90);
                                                    java.lang.String intern30 = ((java.lang.String) objArr90[0]).intern();
                                                    java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                    f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e\ueca1Ỵ裇᭯", android.graphics.Color.argb(0, 0, 0, 0) + 11, objArr91);
                                                    java.lang.String intern31 = ((java.lang.String) objArr91[0]).intern();
                                                    java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                    e("\u0004\r\u0019\r\u0001\u0016)\u0004\t \u001e ", 12 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11), objArr92);
                                                    java.lang.String intern32 = ((java.lang.String) objArr92[0]).intern();
                                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                    f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e쟠ᵁ싈걊", 12 - android.text.TextUtils.getOffsetBefore(str3, 0), objArr93);
                                                    java.lang.String intern33 = ((java.lang.String) objArr93[0]).intern();
                                                    java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                    f("ꊽ뒲\uf4b0媳꯸㲶닉⃙\ueca1Ỵ裇᭯", 11 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr94);
                                                    java.lang.String intern34 = ((java.lang.String) objArr94[0]).intern();
                                                    java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                    e("\u0004\r\u001f\u001e㘄", android.text.TextUtils.getOffsetAfter(str3, 0) + 5, (byte) (16 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr95);
                                                    java.lang.String intern35 = ((java.lang.String) objArr95[0]).intern();
                                                    java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                    f("\uda71㋦瘢㼕", 4 - android.view.View.MeasureSpec.getMode(0), objArr96);
                                                    strArr = new java.lang.String[]{intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr96[0]).intern()};
                                                    i4 = 0;
                                                    while (true) {
                                                        if (i4 >= 7) {
                                                            i5 = 0;
                                                            break;
                                                        }
                                                        java.lang.Object[] objArr97 = {strArr[i4]};
                                                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                                        if (obj26 == null) {
                                                            java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str3, str3) + 27, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1671, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 47940));
                                                            byte[] bArr16 = $$a;
                                                            byte b46 = bArr16[16];
                                                            byte b47 = bArr16[14];
                                                            java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                            d(b46, b47, (short) (b47 & 653), objArr98);
                                                            obj26 = cls21.getMethod((java.lang.String) objArr98[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj26);
                                                        }
                                                        long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr97)).longValue();
                                                        long j34 = ~((-170458151) | longValue10);
                                                        long j35 = ~longValue10;
                                                        long j36 = ~(170458150 | j35);
                                                        strArr2 = strArr;
                                                        i9 = i4;
                                                        long j37 = (((((longValue10 * 263) - 89149612450L) + (((~(j35 | j)) | (j34 | j36)) * 262)) + ((-786) * j36)) + ((((~(j35 | j2)) | j34) | j36) * 262)) - 1795988332;
                                                        int i24 = ~(1964190274 | i3);
                                                        int i25 = ~(1845886775 | i3);
                                                        if (((((int) (j37 >> 32)) & ((((-2138832600) | i24) * (-814)) + 588249638 + ((i24 | (~(i2 | 526963863)) | 352321538) * 407) + (((~((-1964190275) | i3)) | 352321538 | (~((-526963864) | i3))) * 407))) | ((((((~(i2 | (-738568983))) | (~(1011854110 | i3))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 1342515315) + (((~(i2 | (-1011854111))) | i25) * (-1040)) + ((i25 | (~(i2 | (-1845886776))) | 273285128) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL)) & ((int) j37))) != 0) {
                                                            i5 = i9 + 90;
                                                            break;
                                                        }
                                                        i4 = i9 + 1;
                                                        strArr = strArr2;
                                                    }
                                                    if (i5 != 0) {
                                                        java.lang.Object[] objArr99 = {new int[]{i3}, new int[]{i5 ^ i3}, null, new int[1]};
                                                        java.lang.Object[] objArr100 = {783712867, 16, java.lang.Integer.valueOf((((((~(i2 | (-64733131))) | 26217674) | r1) * (-713)) - 413465732) + ((~((-606076934) | i3)) * 1426) + ((~(i2 | (-644592390))) * 713))};
                                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj27 == null) {
                                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50, 2713 - android.view.View.MeasureSpec.getSize(0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                            byte b48 = $$a[14];
                                                            byte b49 = (byte) (b48 + 1);
                                                            byte b50 = b48;
                                                            java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                            d(b49, b50, (short) (b50 + 1), objArr101);
                                                            obj27 = cls22.getMethod((java.lang.String) objArr101[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj27);
                                                        }
                                                        ((int[]) objArr99[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr100)).intValue();
                                                        return objArr99;
                                                    }
                                                    try {
                                                        java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                        e("0\u000e\u0017\u001c$\"\u0013\u000b\u001c\u000e\u0012\r㘪", 12 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 61), objArr102);
                                                        try {
                                                            java.lang.Object[] objArr103 = {((java.lang.String) objArr102[0]).intern()};
                                                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                            if (obj28 == null) {
                                                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 1921 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((-1) - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                                                byte[] bArr17 = $$a;
                                                                byte b51 = bArr17[16];
                                                                byte b52 = bArr17[14];
                                                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                                d(b51, b52, (short) (b52 & 653), objArr104);
                                                                obj28 = cls23.getMethod((java.lang.String) objArr104[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj28);
                                                            }
                                                            invoke = ((java.lang.reflect.Method) obj28).invoke(null, objArr103);
                                                        } catch (java.lang.Throwable th) {
                                                            java.lang.Throwable cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (java.lang.Exception unused) {
                                                    }
                                                    try {
                                                        if (invoke != null) {
                                                            java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                            f("쮟⊃濢벆\uf3ff\ud97c\uf4b0媳\u0b7e鸤穐㜠", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 11, objArr105);
                                                            try {
                                                                java.lang.Object[] objArr106 = {invoke, new java.lang.String[]{((java.lang.String) objArr105[0]).intern()}};
                                                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                                if (obj29 == null) {
                                                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2880 - android.text.TextUtils.getOffsetAfter(str3, 0), (char) android.view.View.getDefaultSize(0, 0));
                                                                    byte[] bArr18 = $$a;
                                                                    byte b53 = bArr18[16];
                                                                    byte b54 = bArr18[14];
                                                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                    d(b53, b54, (short) (b54 & 653), objArr107);
                                                                    obj29 = cls24.getMethod((java.lang.String) objArr107[0], java.lang.String.class, java.lang.String[].class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj29);
                                                                }
                                                                long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr106)).longValue();
                                                                long j38 = (((((421 * longValue11) + 40779402936L) + ((~(longValue11 | j)) * 420)) + ((97325543 | longValue11) * (-420))) + (((~(j2 | longValue11)) | (~((~longValue11) | 97325543))) * 420)) - 1931386235;
                                                                int i26 = (int) (j38 >> 32);
                                                                int i27 = (int) j38;
                                                                int i28 = (~(i2 | (-135600214))) | 135596117 | (~(i2 | (-1572826624)));
                                                                if (((i26 & (((((~((-739658706) | i3)) | 2118082179) * (-465)) - 809208750) + (((~(2118082179 | i3)) | (-739658706)) * 930) + ((i3 | (-337)) * 465))) | (i27 & ((((~(1572830719 | i3)) | i28) * 590) + 1512260155 + (i28 * (-1180)) + (((~(i2 | 1572826623)) | (~(i2 | 135600213))) * 590)))) == 0) {
                                                                    SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 53) % 128;
                                                                    i6 = 0;
                                                                    if (i6 != 0) {
                                                                        java.lang.Object[] objArr108 = {new int[]{i3}, new int[]{i6 ^ i3}, null, new int[1]};
                                                                        int i29 = ~(i2 | 423586511);
                                                                        java.lang.Object[] objArr109 = {783712867, 16, java.lang.Integer.valueOf((((~((-421029897) | i3)) | 285739008 | i29) * (-470)) + 1862673103 + ((i29 | (~((-135290889) | i3))) * 470))};
                                                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj30 == null) {
                                                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49, 2713 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.view.View.MeasureSpec.getMode(0));
                                                                            byte b55 = $$a[14];
                                                                            byte b56 = (byte) (b55 + 1);
                                                                            byte b57 = b55;
                                                                            java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                            d(b56, b57, (short) (b57 + 1), objArr110);
                                                                            obj30 = cls25.getMethod((java.lang.String) objArr110[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                                                        }
                                                                        ((int[]) objArr108[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr109)).intValue();
                                                                        return objArr108;
                                                                    }
                                                                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                    e("0\u000e\u0017\u001c$\"\u0013\u000b\u001c\u000e\u0012\r㘪", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 14, (byte) (60 - android.graphics.Color.green(0)), objArr111);
                                                                    java.lang.Object[] objArr112 = {((java.lang.String) objArr111[0]).intern()};
                                                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                                    if (obj31 == null) {
                                                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 40, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1920, (char) android.view.View.getDefaultSize(0, 0));
                                                                        byte[] bArr19 = $$a;
                                                                        byte b58 = bArr19[16];
                                                                        byte b59 = bArr19[14];
                                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                        d(b58, b59, (short) (b59 & 653), objArr113);
                                                                        obj31 = cls26.getMethod((java.lang.String) objArr113[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj31);
                                                                    }
                                                                    java.lang.Object invoke6 = ((java.lang.reflect.Method) obj31).invoke(null, objArr112);
                                                                    if (invoke6 != null) {
                                                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                        f("쮟⊃濢벆\uf3ff\ud97c\uf4b0媳\u0b7e鸤穐㜠", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, objArr114);
                                                                        java.lang.Object[] objArr115 = {invoke6, new java.lang.String[]{((java.lang.String) objArr114[0]).intern()}};
                                                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                                        if (obj32 == null) {
                                                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43, android.view.View.resolveSizeAndState(0, 0, 0) + 2880, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                                            byte[] bArr20 = $$a;
                                                                            byte b60 = bArr20[16];
                                                                            byte b61 = bArr20[14];
                                                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                            d(b60, b61, (short) (b61 & 653), objArr116);
                                                                            obj32 = cls27.getMethod((java.lang.String) objArr116[0], java.lang.String.class, java.lang.String[].class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj32);
                                                                        }
                                                                        long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr115)).longValue();
                                                                        long j39 = ~longValue12;
                                                                        long j40 = (((((46 * longValue12) - 41185718568L) + (((~(j39 | j2)) | (-895341708)) * (-90))) + (((~(longValue12 | (-895341708))) | (~(j39 | j))) * (-45))) + (((~(j2 | (-895341708))) | (j39 | (~(j | 895341707)))) * 45)) - 1133370071;
                                                                        if (((((int) (j40 >> 32)) & (((((~(1356056958 | i3)) | (~(i2 | (-1501683927)))) * (-1808)) - 59980694) + (((~(1507060222 | i3)) | (~(i2 | (-1350680663)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(1501683926 | i3)) | 151003264 | (~(i2 | (-1356056959)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) | (((int) j40) & (((((~(i2 | 566978540)) | (-870247870)) * (-90)) - 1687905466) + (((~(566978540 | i3)) | 566912428) * (-45)) + (((~(870247869 | i3)) | 566978540 | (~(i2 | (-870247870)))) * 45)))) != 1) {
                                                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                            e("\u0005\r\u000f-\u0014\u0003\u0013\u000e&\u0013\u0014\u0004", 12 - android.text.TextUtils.getOffsetAfter(str3, 0), (byte) (72 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr117);
                                                                            java.lang.String intern36 = ((java.lang.String) objArr117[0]).intern();
                                                                            java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                            f("\ue148둛拗ퟍ땬颓嶽\ue95fﾇ躖\u000bꡊ\ueca1Ỵ鍈귲", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 16, objArr118);
                                                                            java.lang.String intern37 = ((java.lang.String) objArr118[0]).intern();
                                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                            f("\ue148둛拗ퟍ땬颓嶽\ue95fﾇ躖\u000bꡊ쟠ᵁ싈걊∺ഥ", 16 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr119);
                                                                            java.lang.String intern38 = ((java.lang.String) objArr119[0]).intern();
                                                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                            f("䤱\udf18\ueca1Ỵ鍈귲", 6 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr120);
                                                                            java.lang.String intern39 = ((java.lang.String) objArr120[0]).intern();
                                                                            java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                            f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e\ueca1Ỵ鍈귲", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, objArr121);
                                                                            java.lang.String intern40 = ((java.lang.String) objArr121[0]).intern();
                                                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                            f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e\ueca1Ỵ鍈귲ϳ볨ᕴꌽ∺ഥ", android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 18, objArr122);
                                                                            java.lang.String intern41 = ((java.lang.String) objArr122[0]).intern();
                                                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                            f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e\ueca1Ỵ鍈귲諍뇆咆ﴂ盧켶悹依∺ഥ", 21 - android.view.View.getDefaultSize(0, 0), objArr123);
                                                                            java.lang.String intern42 = ((java.lang.String) objArr123[0]).intern();
                                                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                            f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e\uf3fd\u12c7⍉夺\ueca1Ỵ鍈귲", android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 17, objArr124);
                                                                            java.lang.String intern43 = ((java.lang.String) objArr124[0]).intern();
                                                                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                            f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e뎳ᵡ닉⃙\uf642醞㛘閜ႜ磙夯\ue9f5\uf75e\ue145✑\ue1eb∺ഥ", 25 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr125);
                                                                            java.lang.String intern44 = ((java.lang.String) objArr125[0]).intern();
                                                                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                            f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e쟠ᵁ싈걊∺ഥ", android.view.Gravity.getAbsoluteGravity(0, 0) + 13, objArr126);
                                                                            java.lang.String intern45 = ((java.lang.String) objArr126[0]).intern();
                                                                            java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                            f("嚣ㅶ욚譇巏䧒싈걊∺ഥ", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 9, objArr127);
                                                                            java.lang.String intern46 = ((java.lang.String) objArr127[0]).intern();
                                                                            java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                            f("䤱\udf18侍㋼\ueca1Ỵ鍈귲", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 8, objArr128);
                                                                            java.lang.String[] strArr7 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr128[0]).intern()};
                                                                            for (int i30 = 0; i30 < 12; i30++) {
                                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                                sb.append(strArr7[i30]);
                                                                                java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                                f("숮䁕", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2, objArr129);
                                                                                sb.append(((java.lang.String) objArr129[0]).intern());
                                                                                java.lang.Object[] objArr130 = {sb.toString()};
                                                                                java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                                                if (obj33 == null) {
                                                                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.View.resolveSizeAndState(0, 0, 0) + 3161, (char) (33099 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                                                                                    byte[] bArr21 = $$a;
                                                                                    byte b62 = bArr21[16];
                                                                                    byte b63 = bArr21[14];
                                                                                    java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                                                    d(b62, b63, (short) (b63 & 653), objArr131);
                                                                                    obj33 = cls28.getMethod((java.lang.String) objArr131[0], java.lang.String.class);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj33);
                                                                                }
                                                                                long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr130)).longValue();
                                                                                long j41 = (((((382 * longValue13) - 116934202680L) + (((longValue13 | j) | (-307721587)) * (-381))) + ((((~((-307721587) | (~longValue13))) | (~(j2 | longValue13))) | (~(307721586 | longValue13))) * 381)) + ((~(longValue13 | (-307721587))) * 381)) - 1645389694;
                                                                                if (((((int) (j41 >> 32)) & ((((~(i2 | (-1518466643))) | (~((-81240232) | i3))) * 959) + 621659875 + (((~((-1518466643) | i3)) | (~(i2 | (-81240232)))) * 959))) | (((int) j41) & ((((~(1394400130 | i3)) | (-1402862504)) * 345) + 484646344 + (((~(i2 | 1394400130)) | 1360036224) * 345) + ((~(1402862503 | i3)) * 345)))) != 0) {
                                                                                    i7 = i30 + 110;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    i7 = 0;
                                                                    if (i7 != 0) {
                                                                        java.lang.Object[] objArr132 = {new int[]{i3}, new int[]{i7 ^ i3}, null, new int[1]};
                                                                        java.lang.Object[] objArr133 = {783712867, 16, java.lang.Integer.valueOf(((((~r1) | 4749312) * (-828)) - 379664301) + ((i2 | 704576207) * (-828)) + 726452032)};
                                                                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj34 == null) {
                                                                            java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2713, (char) (android.os.Process.myPid() >> 22));
                                                                            byte b64 = $$a[14];
                                                                            byte b65 = (byte) (b64 + 1);
                                                                            byte b66 = b64;
                                                                            java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                                            d(b65, b66, (short) (b66 + 1), objArr134);
                                                                            obj34 = cls29.getMethod((java.lang.String) objArr134[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                                                        }
                                                                        ((int[]) objArr132[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr133)).intValue();
                                                                        return objArr132;
                                                                    }
                                                                    long[] jArr = {472001035};
                                                                    java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                                    f("㋪滑\uf75e\ue145扔샗鳶틢렭䁏홀᷒흇믒횓\ud873砣᪈", 17 - android.view.KeyEvent.keyCodeFromString(str3), objArr135);
                                                                    java.lang.Object[] objArr136 = {((java.lang.String) objArr135[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                                                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                                    if (obj35 == null) {
                                                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - android.graphics.Color.green(0), 3096 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                                        byte[] bArr22 = $$a;
                                                                        byte b67 = bArr22[16];
                                                                        byte b68 = bArr22[14];
                                                                        java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                                        d(b67, b68, (short) (b68 & 653), objArr137);
                                                                        obj35 = cls30.getMethod((java.lang.String) objArr137[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj35);
                                                                    }
                                                                    long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr136)).longValue();
                                                                    long j42 = ((((((-219) * longValue14) - 94897746749L) + (((~(429401568 | (~longValue14))) | (~((j2 | (-429401569)) | longValue14))) * 220)) + (((~(j2 | longValue14)) | (-429401569)) * (-440))) + (((longValue14 | (-429401569)) | j) * 220)) - 1481246341;
                                                                    int i31 = ((((int) (j42 >> 32)) & (((((i2 | (-1627504652)) * (-757)) + 1352744704) + ((~((-536870915) | i3)) * 1514)) + ((((~(i2 | 1230236233)) | (-1767107148)) | (~((-1090633738) | i3))) * 757))) | (((int) j42) & ((((((~(i2 | (-983600771))) | 1874140115) * (-235)) + (-1841721075)) + (((~((-983600771) | i3)) | 1874140115) * (-470))) + (((~((-268469249) | i3)) | 1159008593) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE)))) != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE : 0;
                                                                    if (i31 != 0) {
                                                                        java.lang.Object[] objArr138 = {new int[]{i3}, new int[]{i31 ^ i3}, null, new int[1]};
                                                                        java.lang.Object[] objArr139 = {783712867, 16, java.lang.Integer.valueOf(((i2 | (-218593281)) * (-490)) + 398990993 + (((~((-219118218) | i3)) | 524937) * 490) + 316590106)};
                                                                        java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj36 == null) {
                                                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2713, (char) android.text.TextUtils.indexOf(str3, str3, 0, 0));
                                                                            byte b69 = $$a[14];
                                                                            byte b70 = (byte) (b69 + 1);
                                                                            byte b71 = b69;
                                                                            java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                                            d(b70, b71, (short) (b71 + 1), objArr140);
                                                                            obj36 = cls31.getMethod((java.lang.String) objArr140[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                                                        }
                                                                        ((int[]) objArr138[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr139)).intValue();
                                                                        return objArr138;
                                                                    }
                                                                    long[] jArr2 = {472001035};
                                                                    java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                                    f("䤱\udf18峟瑴ⶆ\uf4f5怽瞁鳶틢蠓ဣ什⽒䨨ꭔᖂ矚蠓ဣ쮟⊃", 22 - android.view.View.getDefaultSize(0, 0), objArr141);
                                                                    java.lang.Object[] objArr142 = {((java.lang.String) objArr141[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr2};
                                                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                                    if (obj37 == null) {
                                                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 37, android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3097, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                        byte[] bArr23 = $$a;
                                                                        byte b72 = bArr23[16];
                                                                        byte b73 = bArr23[14];
                                                                        java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                                        d(b72, b73, (short) (b73 & 653), objArr143);
                                                                        obj37 = cls32.getMethod((java.lang.String) objArr143[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj37);
                                                                    }
                                                                    long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj37).invoke(null, objArr142)).longValue();
                                                                    long j43 = ~((-1187817733) | longValue15);
                                                                    long j44 = 1187817732 | (~longValue15);
                                                                    long j45 = (((((1435 * longValue15) + 850477496828L) + ((longValue15 | 1187817732) * (-1434))) + ((((~(j2 | longValue15)) | j43) | (~(j44 | j))) * 717)) + ((((~(j44 | j2)) | j43) | (~(longValue15 | j))) * 717)) - 722830177;
                                                                    if (((((int) (j45 >> 32)) & ((((~(i2 | (-1510609698))) | 73383286) * (-865)) + 1496590146 + ((~(1510609697 | i3)) * 865) + (((~(i2 | 1510609697)) | (~(i2 | 73383286))) * 865))) | (((int) j45) & (((((~((-287310097) | i3)) | (-2146850687)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1815293552) + ((~(i2 | (-287310097))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING)))) != 0) {
                                                                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 95) % 128;
                                                                        java.lang.Object[] objArr144 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                                        java.lang.Object[] objArr145 = {783712867, 16, java.lang.Integer.valueOf(((((-1056831485) | r1) * (-814)) - 2138053652) + (((~(1023194572 | i3)) | (~(i2 | 313869052)) | 280232140) * 407) + (((~((-313869053) | i3)) | (~((-1023194573) | i3)) | 280232140) * 407))};
                                                                        java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj38 == null) {
                                                                            java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 50, 2714 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                            byte b74 = $$a[14];
                                                                            byte b75 = (byte) (b74 + 1);
                                                                            byte b76 = b74;
                                                                            java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                                            d(b75, b76, (short) (b76 + 1), objArr146);
                                                                            obj38 = cls33.getMethod((java.lang.String) objArr146[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                                                        }
                                                                        ((int[]) objArr144[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr145)).intValue();
                                                                        return objArr144;
                                                                    }
                                                                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                                                    if (obj39 == null) {
                                                                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 32, 1889 - android.view.MotionEvent.axisFromString(str3), (char) (3600 - (android.os.Process.myTid() >> 22)));
                                                                        byte[] bArr24 = $$a;
                                                                        byte b77 = bArr24[16];
                                                                        byte b78 = bArr24[14];
                                                                        java.lang.Object[] objArr147 = new java.lang.Object[1];
                                                                        d(b77, b78, (short) (b78 & 653), objArr147);
                                                                        obj39 = cls34.getMethod((java.lang.String) objArr147[0], null);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj39);
                                                                    }
                                                                    long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, null)).longValue();
                                                                    long j46 = ~longValue16;
                                                                    long j47 = ~((-1250597852) | longValue16);
                                                                    long j48 = (((((longValue16 * 371) - 463971803092L) + (((~(j46 | j2)) | (~(j | 1250597851))) * (-370))) + ((((~(j46 | j)) | (~(j2 | 1250597851))) | j47) * (-370))) + (j47 * 370)) - 628650528;
                                                                    if (((((int) j48) & (((((~(50795170 | i3)) | 1369723301) * 398) - 578036615) + (((~(i2 | 50795170)) | 1369723301) * 398))) | (((((~((-1987687269) | i3)) | (~(i2 | (-8801434)))) * (-406)) + 1133214526 + ((~(i2 | (-541659425))) * (-406)) + (((~(550460857 | i3)) | (~(i2 | 1987687268))) * 406)) & ((int) (j48 >> 32)))) != 0) {
                                                                        java.lang.Object[] objArr148 = {new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i31}, null, new int[1]};
                                                                        java.lang.Object[] objArr149 = {783712867, 16, java.lang.Integer.valueOf((((~(328288485 | i3)) | 69607690) * (-140)) + 106756653 + ((~(397896175 | i3)) * 70) + (((~(381037034 | i3)) | 86466831) * 70))};
                                                                        java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj40 == null) {
                                                                            java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2713 - android.text.TextUtils.indexOf(str3, str3, 0, 0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                                                                            byte b79 = $$a[14];
                                                                            byte b80 = (byte) (b79 + 1);
                                                                            byte b81 = b79;
                                                                            java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                                            d(b80, b81, (short) (b81 + 1), objArr150);
                                                                            obj40 = cls35.getMethod((java.lang.String) objArr150[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                                                                        }
                                                                        ((int[]) objArr148[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr149)).intValue();
                                                                        return objArr148;
                                                                    }
                                                                    java.lang.Object[] objArr151 = {2};
                                                                    java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                                    if (obj41 == null) {
                                                                        java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 26, android.graphics.Color.blue(0) + 2364, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                                                        byte[] bArr25 = $$a;
                                                                        byte b82 = bArr25[16];
                                                                        byte b83 = bArr25[14];
                                                                        java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                                        d(b82, b83, (short) (b83 & 653), objArr152);
                                                                        obj41 = cls36.getMethod((java.lang.String) objArr152[0], java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj41);
                                                                    }
                                                                    long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, objArr151)).longValue();
                                                                    long j49 = ~longValue17;
                                                                    long j50 = j2 | 330076455;
                                                                    long j51 = ((-885) * longValue17) + 585225554715L + (((~(j49 | j)) | (~((-330076456) | j49)) | (~(j50 | longValue17))) * 886) + (((~(j2 | longValue17)) | 330076455) * (-1772)) + ((~j50) * 886) + 1077833744;
                                                                    int i32 = ~(768638993 | i3);
                                                                    int i33 = ~(i2 | (-1299539391));
                                                                    if (((((int) (j51 >> 32)) & ((((134217728 | i32) * (-196)) - 2113386330) + ((i32 | 634421265) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))) | (((((~(i2 | (-137687020))) | 35393) * (-1188)) + 93911127 + (((~(137687019 | i3)) | 35393 | i33) * 594) + ((i33 | (~(i2 | 137687019)) | 1161887764) * 594)) & ((int) j51))) == 2) {
                                                                        java.lang.Object[] objArr153 = {new int[]{i3}, new int[]{i3 ^ 270}, null, new int[1]};
                                                                        java.lang.Object[] objArr154 = {783712867, 16, java.lang.Integer.valueOf((((~((-206079009) | i3)) | (~(i2 | 503246511))) * (-318)) + 203878949 + (((~(477013165 | i3)) | 26233346) * (-318)) + (((~((-477013166) | i3)) | (-232312355)) * 318))};
                                                                        java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj42 == null) {
                                                                            java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 2713 - (android.os.Process.myTid() >> 22), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                                            byte b84 = $$a[14];
                                                                            byte b85 = (byte) (b84 + 1);
                                                                            byte b86 = b84;
                                                                            java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                                            d(b85, b86, (short) (b86 + 1), objArr155);
                                                                            obj42 = cls37.getMethod((java.lang.String) objArr155[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj42);
                                                                        }
                                                                        ((int[]) objArr153[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr154)).intValue();
                                                                        return objArr153;
                                                                    }
                                                                    java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                                                    if (obj43 == null) {
                                                                        java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 40, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3197, (char) android.graphics.Color.green(0));
                                                                        byte[] bArr26 = $$a;
                                                                        byte b87 = (byte) (-bArr26[21]);
                                                                        byte b88 = bArr26[23];
                                                                        java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                                        d(b87, b88, (short) (b88 | 8), objArr156);
                                                                        obj43 = cls38.getMethod((java.lang.String) objArr156[0], null);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj43);
                                                                    }
                                                                    long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj43).invoke(null, null)).longValue();
                                                                    long j52 = ~longValue18;
                                                                    long j53 = (((-590) * longValue18) - 270425678144L) + ((~(456800131 | longValue18)) * (-1182)) + (((~(longValue18 | (-456800132))) | (~(456800131 | j52 | j2))) * (-591)) + ((j | 456800131 | j52) * 591) + 553045493;
                                                                    int i34 = (int) (j53 >> 32);
                                                                    int i35 = ~((-1507474394) | i3);
                                                                    if (((i34 & (((((~(153794368 | i3)) | (-1283432043)) * (-668)) - 507731182) + (((~((-1283432043) | i3)) | 153794368) * 1336) + (((-1146423339) | i3) * 668))) | (((int) j53) & ((((~(i2 | (-1350266493))) | i35) * 1150) + 334239082 + ((i35 | (~(i2 | 1507474393))) * (-575)) + (((~((-1350266493) | i3)) | (~(i2 | 1350266492))) * 575)))) != 0) {
                                                                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 53) % 128;
                                                                        java.lang.Object[] objArr157 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                                                        java.lang.Object[] objArr158 = {783712867, 16, java.lang.Integer.valueOf(((~(i2 | (-29430065))) * 52) + 1415907123 + (((~(i2 | 1008632905)) | (~(i2 | 299307385)) | (-1038062970)) * (-52)) + (((~(i2 | (-1008632906))) | 269877321) * 52))};
                                                                        java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj44 == null) {
                                                                            java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str3, str3, 0) + 50, android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) android.view.View.MeasureSpec.getSize(0));
                                                                            byte b89 = $$a[14];
                                                                            byte b90 = (byte) (b89 + 1);
                                                                            byte b91 = b89;
                                                                            java.lang.Object[] objArr159 = new java.lang.Object[1];
                                                                            d(b90, b91, (short) (b91 + 1), objArr159);
                                                                            obj44 = cls39.getMethod((java.lang.String) objArr159[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj44);
                                                                        }
                                                                        ((int[]) objArr157[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr158)).intValue();
                                                                        return objArr157;
                                                                    }
                                                                    java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                                                    if (obj45 == null) {
                                                                        java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 40, 3196 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((-1) - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                        byte[] bArr27 = $$a;
                                                                        byte b92 = bArr27[16];
                                                                        byte b93 = bArr27[14];
                                                                        java.lang.Object[] objArr160 = new java.lang.Object[1];
                                                                        d(b92, b93, (short) (b93 & 653), objArr160);
                                                                        obj45 = cls40.getMethod((java.lang.String) objArr160[0], null);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj45);
                                                                    }
                                                                    long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj45).invoke(null, null)).longValue();
                                                                    long j54 = (~((-464979488) | (~longValue19))) | (~(j | (-464979488)));
                                                                    long j55 = (((-495) * longValue19) - 230164846065L) + (992 * j54) + ((j54 | (~(j2 | 464979487 | longValue19))) * (-496)) + ((longValue19 | j) * 496) + 487890403;
                                                                    int i36 = ~(i2 | 1109386539);
                                                                    if (((((int) (j55 >> 32)) & (((34217986 | i36 | (~((-1109386540) | i3))) * (-338)) + 118003790 + ((i36 | (~((-1075168554) | i3))) * 338))) | (((int) j55) & (((((~(1719312898 | i3)) | (-1990913627)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 1394120055) + (((~(i2 | 1719312898)) | (-1990913627)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE)))) != 0) {
                                                                        java.lang.Object[] objArr161 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                                                        int i37 = ~(i2 | (-967927151));
                                                                        java.lang.Object[] objArr162 = {783712867, 16, java.lang.Integer.valueOf((((((-1073346559) | i37) | (~(967927150 | i3))) * (-338)) - 1304558559) + ((i37 | (~(i3 | (-105419409)))) * 338))};
                                                                        java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj46 == null) {
                                                                            java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetAfter(str3, 0), 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                                            byte b94 = $$a[14];
                                                                            byte b95 = (byte) (b94 + 1);
                                                                            byte b96 = b94;
                                                                            java.lang.Object[] objArr163 = new java.lang.Object[1];
                                                                            d(b95, b96, (short) (b96 + 1), objArr163);
                                                                            obj46 = cls41.getMethod((java.lang.String) objArr163[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj46);
                                                                        }
                                                                        ((int[]) objArr161[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj46).invoke(null, objArr162)).intValue();
                                                                        return objArr161;
                                                                    }
                                                                    java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                                                    if (obj47 == null) {
                                                                        java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45, 2836 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                                        byte[] bArr28 = $$a;
                                                                        byte b97 = bArr28[16];
                                                                        byte b98 = bArr28[14];
                                                                        java.lang.Object[] objArr164 = new java.lang.Object[1];
                                                                        d(b97, b98, (short) (b98 & 653), objArr164);
                                                                        obj47 = cls42.getMethod((java.lang.String) objArr164[0], null);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj47);
                                                                    }
                                                                    long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj47).invoke(null, null)).longValue();
                                                                    long j56 = ~longValue20;
                                                                    long j57 = (((((302 * longValue20) - 401931142800L) + ((~((longValue20 | 1339770476) | j)) * (-301))) + (((~(j56 | j)) | (~(j2 | 1339770476))) * (-301))) + (((~(j | (-1339770477))) | j56) * 301)) - 2146065231;
                                                                    if (((((int) (j57 >> 32)) & ((((~((-1146615632) | i3)) | (-290610780)) * (-948)) + 1181007162 + ((~(i2 | (-5396044))) * (-948)) + 455588220)) | (((int) j57) & (((((~(i2 | 68617198)) | 1505777680) * 529) - 1520785380) + (((~(68617198 | i3)) | 1505843608) * 529)))) != 0) {
                                                                        java.lang.Object[] objArr165 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                                        java.lang.Object[] objArr166 = {783712867, 16, java.lang.Integer.valueOf((((i2 | 71832592) * 1324) - 712732795) + (((~(72294078 | i3)) | (~(i3 | 637031441))) * (-1324)) + 804987018)};
                                                                        java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj48 == null) {
                                                                            java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName(str3) + 51, android.text.TextUtils.getOffsetBefore(str3, 0) + 2713, (char) android.text.TextUtils.getTrimmedLength(str3));
                                                                            byte b99 = $$a[14];
                                                                            byte b100 = (byte) (b99 + 1);
                                                                            byte b101 = b99;
                                                                            java.lang.Object[] objArr167 = new java.lang.Object[1];
                                                                            d(b100, b101, (short) (b101 + 1), objArr167);
                                                                            obj48 = cls43.getMethod((java.lang.String) objArr167[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj48);
                                                                        }
                                                                        ((int[]) objArr165[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj48).invoke(null, objArr166)).intValue();
                                                                        return objArr165;
                                                                    }
                                                                    long[] jArr3 = {624887784092251L};
                                                                    java.lang.Object[] objArr168 = new java.lang.Object[1];
                                                                    f("㋪滑\uf75e\ue145扔샗鳶틢렭䁏홀᷒흇믒횓\ud873砣᪈", 17 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr168);
                                                                    java.lang.Object[] objArr169 = {((java.lang.String) objArr168[0]).intern(), 3, 2251799813685247L, jArr3};
                                                                    java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                                    if (obj49 == null) {
                                                                        java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 3096 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                                        byte[] bArr29 = $$a;
                                                                        byte b102 = bArr29[16];
                                                                        byte b103 = bArr29[14];
                                                                        java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                                        d(b102, b103, (short) (b103 & 653), objArr170);
                                                                        obj49 = cls44.getMethod((java.lang.String) objArr170[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj49);
                                                                    }
                                                                    long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj49).invoke(null, objArr169)).longValue();
                                                                    long j58 = ~((~longValue21) | j);
                                                                    long j59 = ((((((-574) * longValue21) + 1041461192254L) + (((~(j2 | 1814392320)) | j58) * 1150)) + (((~(j2 | longValue21)) | j58) * (-575))) + (((~(j2 | (-1814392321))) | (~(j | 1814392320))) * 575)) - 96255589;
                                                                    if (((((int) (j59 >> 32)) & (((((~(i2 | (-2027828104))) | (~((-52546649) | i3))) * (-831)) - 196032186) + ((~((-538055045) | i3)) * (-1662)) + (((~(i2 | 590601692)) | (~((-590601693) | i3)) | (~(2027828103 | i3))) * 831))) | (((int) j59) & ((((i2 | (-562040897)) * 494) - 532216193) + (((~(i2 | 1215516179)) | (-697373266)) * 494)))) != 0) {
                                                                        java.lang.Object[] objArr171 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                                                        int i38 = ~(264286156 | i3);
                                                                        java.lang.Object[] objArr172 = {783712867, 16, java.lang.Integer.valueOf((((~(i2 | (-176194305))) | (~(i3 | 445039363))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 211712647 + (((~(i2 | (-445039364))) | i38) * (-1040)) + ((i38 | (~(i2 | (-264286157))) | 268845059) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
                                                                        java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj50 == null) {
                                                                            java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, android.view.View.MeasureSpec.getSize(0) + 2713, (char) android.view.KeyEvent.keyCodeFromString(str3));
                                                                            byte b104 = $$a[14];
                                                                            byte b105 = (byte) (b104 + 1);
                                                                            byte b106 = b104;
                                                                            java.lang.Object[] objArr173 = new java.lang.Object[1];
                                                                            d(b105, b106, (short) (b106 + 1), objArr173);
                                                                            obj50 = cls45.getMethod((java.lang.String) objArr173[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj50);
                                                                        }
                                                                        ((int[]) objArr171[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr172)).intValue();
                                                                        return objArr171;
                                                                    }
                                                                    java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                                    e("\u0005\r\u0010\u0014\u0004\u001b\u0017) \b㘄", 11 - android.view.View.MeasureSpec.getMode(0), (byte) (19 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr174);
                                                                    java.lang.Object[] objArr175 = {((java.lang.String) objArr174[0]).intern()};
                                                                    java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                    if (obj51 == null) {
                                                                        java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str3) + 36, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 3161, (char) (33100 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                                                        byte[] bArr30 = $$a;
                                                                        byte b107 = (byte) (-bArr30[21]);
                                                                        byte b108 = bArr30[23];
                                                                        java.lang.Object[] objArr176 = new java.lang.Object[1];
                                                                        d(b107, b108, (short) (b108 | 8), objArr176);
                                                                        obj51 = cls46.getMethod((java.lang.String) objArr176[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj51);
                                                                    }
                                                                    long j60 = ~((java.lang.Long) ((java.lang.reflect.Method) obj51).invoke(null, objArr175)).longValue();
                                                                    long j61 = j60 | j2;
                                                                    long j62 = ((r1 * (-49)) - 47540588043L) + ((j | (-932168393)) * (-50)) + (((~(932168392 | j60 | j)) | (~((-932168393) | j61))) * 50) + (((~(j60 | (-932168393))) | (~j61) | (~(j2 | (-932168393)))) * 50) + 1927603296;
                                                                    if (((((int) j62) & (((((~(i2 | 833747392)) | (-603479018)) * (-90)) - 1687905466) + (((~(833747392 | i3)) | 565205440) * (-45)) + (((~(603479017 | i3)) | 833747392 | (~(i2 | (-603479018)))) * 45))) | (((int) (j62 >> 32)) & (((((~(i2 | (-85330598))) | 1522557008) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 127062318) + (((~(i2 | 1522594130)) | (-85367720)) * (-440)) + (((-85330598) | i3) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)))) != 0) {
                                                                        int i39 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                                        getProfileVersion = (i39 + 107) % 128;
                                                                        getProfileVersion = (i39 + 11) % 128;
                                                                        java.lang.Object[] objArr177 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                        java.lang.Object[] objArr178 = {783712867, 16, java.lang.Integer.valueOf((((~((-995765255) | i3)) | (~(i2 | (-286439735)))) * (-1808)) + 181465655 + (((~((-709362689) | i3)) | (~(i2 | (-37169)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(286439734 | i3)) | 286402566 | (~(i2 | 995765254))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                                                                        java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj52 == null) {
                                                                            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49, android.graphics.Color.green(0) + 2713, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                                            byte b109 = $$a[14];
                                                                            byte b110 = (byte) (b109 + 1);
                                                                            byte b111 = b109;
                                                                            java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                                            d(b110, b111, (short) (b111 + 1), objArr179);
                                                                            obj52 = cls47.getMethod((java.lang.String) objArr179[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj52);
                                                                        }
                                                                        ((int[]) objArr177[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj52).invoke(null, objArr178)).intValue();
                                                                        return objArr177;
                                                                    }
                                                                    java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                                                    if (obj53 == null) {
                                                                        java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2185, (char) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 59514));
                                                                        byte[] bArr31 = $$a;
                                                                        byte b112 = bArr31[16];
                                                                        byte b113 = bArr31[14];
                                                                        java.lang.Object[] objArr180 = new java.lang.Object[1];
                                                                        d(b112, b113, (short) (b113 & 653), objArr180);
                                                                        obj53 = cls48.getMethod((java.lang.String) objArr180[0], null);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj53);
                                                                    }
                                                                    long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj53).invoke(null, null)).longValue();
                                                                    long j63 = ~(j | (-1224192281));
                                                                    long j64 = ~longValue22;
                                                                    long j65 = ((((((-139) * longValue22) + 172611111480L) + (((~((-1224192281) | longValue22)) | j63) * (-280))) + ((j63 | (~(j64 | j))) * 140)) + ((((~(longValue22 | (j2 | (-1224192281)))) | (~(((-1224192281) | j64) | j))) | (~((j64 | j2) | 1224192280))) * 140)) - 2096282866;
                                                                    if (((((int) (j65 >> 32)) & (((291408948 | i3) * (-859)) + 1939720500 + (((~(i2 | 291408948)) | (~((-4884533) | i3))) * 859) + (((~(i2 | (-1145817463))) | 1140932930) * 859))) | (((int) j65) & (((i2 | (-97556523)) * (-369)) + 802172634 + (((~(i2 | 231782458)) | (-1205443952)) * (-369)) + (((~((-231782459) | i3)) | 134225936 | (~(i2 | (-1107887430)))) * 369)))) != 0) {
                                                                        java.lang.Object[] objArr181 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                                        java.lang.Object[] objArr182 = {783712867, 16, java.lang.Integer.valueOf(((((~(i2 | (-843612945))) | 134287424) * (-591)) - 1172141362) + ((i3 | (-843612945)) * 591))};
                                                                        java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj54 == null) {
                                                                            java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2712 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                                                            byte b114 = $$a[14];
                                                                            byte b115 = (byte) (b114 + 1);
                                                                            byte b116 = b114;
                                                                            java.lang.Object[] objArr183 = new java.lang.Object[1];
                                                                            d(b115, b116, (short) (b116 + 1), objArr183);
                                                                            obj54 = cls49.getMethod((java.lang.String) objArr183[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj54);
                                                                        }
                                                                        ((int[]) objArr181[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj54).invoke(null, objArr182)).intValue();
                                                                        return objArr181;
                                                                    }
                                                                    java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                                                    if (obj55 == null) {
                                                                        java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.graphics.Color.green(0) + 2972, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                                        byte[] bArr32 = $$a;
                                                                        byte b117 = bArr32[16];
                                                                        byte b118 = bArr32[14];
                                                                        java.lang.Object[] objArr184 = new java.lang.Object[1];
                                                                        d(b117, b118, (short) (b118 & 653), objArr184);
                                                                        obj55 = cls50.getMethod((java.lang.String) objArr184[0], null);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj55);
                                                                    }
                                                                    long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj55).invoke(null, null)).longValue();
                                                                    long j66 = ((((((-949) * longValue23) + 664263879162L) + (((~((~longValue23) | j2)) | (~(j | 699961937))) * 1900)) + (((~(j2 | (-699961938))) | (~(longValue23 | j))) * (-950))) + (((~(j2 | longValue23)) | (~(j | (-699961938)))) * 950)) - 1152739826;
                                                                    if (((((int) (j66 >> 32)) & ((((((~(i2 | (-722903466))) | (~((-714322946) | i3))) * (-370)) + 635053406) + ((((~((-722903466) | i3)) | (~(i2 | (-714322946)))) | (-731362730)) * (-370))) - 21270452)) | (((int) j66) & (((((i2 | (-1225108050)) * 1444) + 1153123995) + ((((~((-1331126205) | i3)) | 106059180) | (~((-106100206) | i3))) * (-1444))) - 235251598))) != 0) {
                                                                        java.lang.Object[] objArr185 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                        java.lang.Object[] objArr186 = {783712867, 16, java.lang.Integer.valueOf(((756753905 | i3) * (-859)) + 12178832 + (((~(i3 | (-755500241))) | (~(i2 | 756753905))) * 859) + (((~(i2 | 47428385)) | (-802928626)) * 859))};
                                                                        java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj56 == null) {
                                                                            java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myTid() >> 22), 2713 - android.graphics.Color.argb(0, 0, 0, 0), (char) ((-1) - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                                            byte b119 = $$a[14];
                                                                            byte b120 = (byte) (b119 + 1);
                                                                            byte b121 = b119;
                                                                            java.lang.Object[] objArr187 = new java.lang.Object[1];
                                                                            d(b120, b121, (short) (b121 + 1), objArr187);
                                                                            obj56 = cls51.getMethod((java.lang.String) objArr187[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj56);
                                                                        }
                                                                        ((int[]) objArr185[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr186)).intValue();
                                                                        return objArr185;
                                                                    }
                                                                    java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                                                    if (obj57 == null) {
                                                                        java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 22, 2159 - android.graphics.Color.blue(0), (char) (56400 - android.text.TextUtils.getOffsetBefore(str3, 0)));
                                                                        byte[] bArr33 = $$a;
                                                                        byte b122 = bArr33[16];
                                                                        byte b123 = bArr33[14];
                                                                        java.lang.Object[] objArr188 = new java.lang.Object[1];
                                                                        d(b122, b123, (short) (b123 & 653), objArr188);
                                                                        obj57 = cls52.getMethod((java.lang.String) objArr188[0], null);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj57);
                                                                    }
                                                                    long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj57).invoke(null, null)).longValue();
                                                                    long j67 = ~longValue24;
                                                                    long j68 = (((((407 * longValue24) - 149295333465L) + (((~(j67 | j)) | (~((j2 | 368630453) | longValue24))) * (-406))) + ((~((j67 | j2) | 368630453)) * (-406))) + (((~(j2 | longValue24)) | (~(j | (-368630454)))) * 406)) - 934448473;
                                                                    if (((((int) (j68 >> 32)) & (((((~(i2 | 417189844)) | 603979778) * (-108)) - 1422204066) + (((~((-1020036567) | i3)) | 1133056 | (~(i2 | 1020036566))) * 54) + ((1133056 | i3) * 54))) | (((int) j68) & ((((((~(i2 | 613159566)) | (-899568544)) | (~(i2 | 824066843))) * (-1136)) - 1738041619) + (((~(613159566 | i3)) | (~(824066843 | i3)) | (~(i2 | (-537657867)))) * (-568)) + (((~(i2 | (-613159567))) | (~(i2 | (-824066844))) | (~(899568543 | i3))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION)))) != 0) {
                                                                        java.lang.Object[] objArr189 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                        java.lang.Object[] objArr190 = {783712867, 16, java.lang.Integer.valueOf(((((~(i2 | (-641601405))) | (~((-67724116) | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 901907295) + (((~((-573967405) | i3)) | (~(i2 | (-90116)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                                                                        java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj58 == null) {
                                                                            java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2713 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.graphics.Color.red(0));
                                                                            byte b124 = $$a[14];
                                                                            byte b125 = (byte) (b124 + 1);
                                                                            byte b126 = b124;
                                                                            java.lang.Object[] objArr191 = new java.lang.Object[1];
                                                                            d(b125, b126, (short) (b126 + 1), objArr191);
                                                                            obj58 = cls53.getMethod((java.lang.String) objArr191[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj58);
                                                                        }
                                                                        ((int[]) objArr189[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj58).invoke(null, objArr190)).intValue();
                                                                        return objArr189;
                                                                    }
                                                                    java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                                                    if (obj59 == null) {
                                                                        java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 837, (char) ((-1) - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                                        byte[] bArr34 = $$a;
                                                                        byte b127 = bArr34[16];
                                                                        byte b128 = bArr34[14];
                                                                        java.lang.Object[] objArr192 = new java.lang.Object[1];
                                                                        d(b127, b128, (short) (b128 & 653), objArr192);
                                                                        obj59 = cls54.getMethod((java.lang.String) objArr192[0], null);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj59);
                                                                    }
                                                                    long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj59).invoke(null, null)).longValue();
                                                                    long j69 = ~((-565274535) | longValue25);
                                                                    long j70 = ~longValue25;
                                                                    long j71 = ~(565274534 | j70);
                                                                    long j72 = (399 * longValue25) + 225544539066L + ((j69 | j71 | (~(j70 | j))) * 398) + ((longValue25 | 565274534) * (-1194)) + (((~(j70 | j2)) | j69 | j71) * 398) + 1395478368;
                                                                    if (((((int) (j72 >> 32)) & (((((~(i2 | (-615088453))) | (~(822137958 | i3))) * 959) - 1865759289) + (((~((-615088453) | i3)) | (~(i2 | 822137958))) * 959))) | (((int) j72) & (((((~(i2 | 1401427751)) | (~(35798658 | i3))) * 1900) - 1871736089) + (((~(i2 | (-35798659))) | (~((-1401427752) | i3))) * (-950)) + (((~((-35798659) | i3)) | (~(i2 | (-1401427752)))) * 950)))) != 0) {
                                                                        int i40 = SdkCoreAlternateContactlessPaymentDataImpl + 109;
                                                                        getProfileVersion = i40 % 128;
                                                                        i8 = i40 % 2 != 0 ? i3 ^ 20505 : i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE;
                                                                    } else {
                                                                        i8 = i3;
                                                                    }
                                                                    if (i8 != i3) {
                                                                        java.lang.Object[] objArr193 = {new int[]{i3}, new int[]{i8}, null, new int[1]};
                                                                        java.lang.Object[] objArr194 = {783712867, 16, java.lang.Integer.valueOf(((((~(i2 | (-93305308))) | (~(616020212 | i3))) * com.visa.cbp.getCertUsage.getODAData) - 1320269919) + (((~((-93305308) | i3)) | (~(i2 | 616020212))) * com.visa.cbp.getCertUsage.getODAData))};
                                                                        java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj60 == null) {
                                                                            java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 50, android.text.TextUtils.indexOf(str3, str3, 0, 0) + 2713, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                                                            byte b129 = $$a[14];
                                                                            byte b130 = (byte) (b129 + 1);
                                                                            byte b131 = b129;
                                                                            java.lang.Object[] objArr195 = new java.lang.Object[1];
                                                                            d(b130, b131, (short) (b131 + 1), objArr195);
                                                                            obj60 = cls55.getMethod((java.lang.String) objArr195[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj60);
                                                                        }
                                                                        ((int[]) objArr193[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj60).invoke(null, objArr194)).intValue();
                                                                        java.lang.Object[] objArr196 = {objArr193};
                                                                        java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                                                        if (obj61 == null) {
                                                                            java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 52, 3237 - android.text.TextUtils.getTrimmedLength(str3), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                            byte b132 = $$a[14];
                                                                            byte b133 = (byte) (b132 + 1);
                                                                            byte b134 = b132;
                                                                            java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                                            d(b133, b134, (short) (b134 + 1), objArr197);
                                                                            obj61 = cls56.getMethod((java.lang.String) objArr197[0], java.lang.Object[].class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj61);
                                                                        }
                                                                        ((java.lang.reflect.Method) obj61).invoke(obj, objArr196);
                                                                        return objArr193;
                                                                    }
                                                                    java.lang.Object[] objArr198 = {java.lang.Integer.valueOf(i), obj, 783712867, 0};
                                                                    java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                                                    if (obj62 == null) {
                                                                        obj62 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3289, (char) android.text.TextUtils.indexOf(str3, str3))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('d' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 3237 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.widget.ExpandableListView.getPackedPositionType(0L)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj62);
                                                                    }
                                                                    java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj62).newInstance(objArr198);
                                                                    try {
                                                                        java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                                        e("\u0003\u0013\u0014\u0012\u0019\u000e\u0018&#\u0017\u0000\n+\u000e\u0013\n", 16 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (38 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr199);
                                                                        java.lang.Class<?> cls57 = java.lang.Class.forName(((java.lang.String) objArr199[0]).intern());
                                                                        java.lang.Object[] objArr200 = new java.lang.Object[1];
                                                                        f("\uef37求丈\ue8eb昡∡", 5 - android.view.View.resolveSize(0, 0), objArr200);
                                                                        cls57.getMethod(((java.lang.String) objArr200[0]).intern(), null).invoke(newInstance, null);
                                                                        java.lang.Object[] objArr201 = {new int[]{i3}, new int[]{i3}, null, new int[1]};
                                                                        java.lang.Object[] objArr202 = {783712867, 0, java.lang.Integer.valueOf((((~(252553395 | i3)) | 456772124) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 358254135 + (((~(i2 | 252553395)) | 271598092) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))};
                                                                        java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj63 == null) {
                                                                            java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.argb(0, 0, 0, 0), 2714 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.text.TextUtils.getCapsMode(str3, 0, 0));
                                                                            byte b135 = $$a[14];
                                                                            byte b136 = (byte) (b135 + 1);
                                                                            byte b137 = b135;
                                                                            java.lang.Object[] objArr203 = new java.lang.Object[1];
                                                                            d(b136, b137, (short) (b137 + 1), objArr203);
                                                                            obj63 = cls58.getMethod((java.lang.String) objArr203[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj63);
                                                                        }
                                                                        ((int[]) objArr201[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj63).invoke(null, objArr202)).intValue();
                                                                        return objArr201;
                                                                    } catch (java.lang.Throwable th2) {
                                                                        java.lang.Throwable cause2 = th2.getCause();
                                                                        if (cause2 != null) {
                                                                            throw cause2;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                }
                                                            } catch (java.lang.Throwable th3) {
                                                                java.lang.Throwable cause3 = th3.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th3;
                                                            }
                                                        }
                                                        java.lang.Object[] objArr204 = {((java.lang.String) objArr[0]).intern()};
                                                        java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                        if (obj64 == null) {
                                                            java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.blue(0), android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1922, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                            byte[] bArr35 = $$a;
                                                            byte b138 = bArr35[16];
                                                            byte b139 = bArr35[14];
                                                            java.lang.Object[] objArr205 = new java.lang.Object[1];
                                                            d(b138, b139, (short) (b139 & 653), objArr205);
                                                            obj64 = cls59.getMethod((java.lang.String) objArr205[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj64);
                                                        }
                                                        java.lang.Object invoke7 = ((java.lang.reflect.Method) obj64).invoke(null, objArr204);
                                                        if (invoke7 != null) {
                                                            java.lang.Object[] objArr206 = new java.lang.Object[1];
                                                            e("0#㙞㙞\u001e 㙧", android.view.MotionEvent.axisFromString(str3) + 8, (byte) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 106), objArr206);
                                                            if (invoke7.equals(((java.lang.String) objArr206[0]).intern())) {
                                                                java.lang.Object[] objArr207 = new java.lang.Object[1];
                                                                f("난ᘽ㞕膜\uf6dd䀺\ue7d7憝묵潬盇挙\uf75e\ue145✑\ue1eb쯉쒀쩻졮ᥡ챃砣᪈", 22 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr207);
                                                                try {
                                                                    java.lang.Object[] objArr208 = {((java.lang.String) objArr207[0]).intern()};
                                                                    java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                                    if (obj65 == null) {
                                                                        java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 40, 1921 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getOffsetBefore(str3, 0));
                                                                        byte[] bArr36 = $$a;
                                                                        byte b140 = bArr36[16];
                                                                        byte b141 = bArr36[14];
                                                                        java.lang.Object[] objArr209 = new java.lang.Object[1];
                                                                        d(b140, b141, (short) (b141 & 653), objArr209);
                                                                        obj65 = cls60.getMethod((java.lang.String) objArr209[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj65);
                                                                    }
                                                                    java.lang.String str8 = (java.lang.String) ((java.lang.reflect.Method) obj65).invoke(null, objArr208);
                                                                    if (str8 != null && (parseInt = java.lang.Integer.parseInt(str8)) != 0) {
                                                                        i6 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                                        if (i6 != 0) {
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th4) {
                                                                    java.lang.Throwable cause4 = th4.getCause();
                                                                    if (cause4 != null) {
                                                                        throw cause4;
                                                                    }
                                                                    throw th4;
                                                                }
                                                            }
                                                        }
                                                        i6 = 0;
                                                        if (i6 != 0) {
                                                        }
                                                    } catch (java.lang.Throwable th5) {
                                                        java.lang.Throwable cause5 = th5.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th5;
                                                    }
                                                    objArr = new java.lang.Object[1];
                                                    e("\u001e $\u0001\u0019\u0007\u001a/\u0019\u00070)\n\u0013\u0012$\u0011\"", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 18, (byte) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 33), objArr);
                                                } else {
                                                    strArr3 = strArr5;
                                                    obj7 = invoke5;
                                                    str2 = str5;
                                                    i3 = i;
                                                }
                                                if (obj7 != null) {
                                                    java.lang.Object[] objArr210 = {obj7, 42};
                                                    java.lang.Object obj66 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj66 == null) {
                                                        java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 28, 2594 - android.view.View.MeasureSpec.getMode(0), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                        byte[] bArr37 = $$a;
                                                        byte b142 = bArr37[16];
                                                        byte b143 = bArr37[14];
                                                        java.lang.Object[] objArr211 = new java.lang.Object[1];
                                                        d(b142, b143, (short) (b143 & 653), objArr211);
                                                        obj66 = cls61.getMethod((java.lang.String) objArr211[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj66);
                                                    }
                                                    long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj66).invoke(null, objArr210)).longValue();
                                                    long j73 = ~longValue26;
                                                    long j74 = ((-103) * longValue26) + 34699935740L + (((~(j73 | j)) | (~(336892579 | j73))) * 104) + ((~(longValue26 | (-336892580) | j8)) * (-104)) + ((j | (-336892580)) * 104) + 1593993104;
                                                    int i41 = (int) (j74 >> 32);
                                                    int i42 = (~(i2 | (-1354963178))) | 1342177320 | (~(i2 | 82263233));
                                                }
                                                j2 = j8;
                                                str3 = str2;
                                                java.lang.Object[] objArr722 = new java.lang.Object[1];
                                                e("\u0004\r\u0019\r\u00050\r\u0004\b\u0012\u000f \"&)\u0003\u0011\u001d0\u0013/#㘎", android.view.View.MeasureSpec.getSize(0) + 23, (byte) (android.text.TextUtils.indexOf(str3, str3) + 15), objArr722);
                                                java.lang.Object[] objArr732 = {((java.lang.String) objArr722[0]).intern()};
                                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj3 == null) {
                                                }
                                                long longValue62 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr732)).longValue();
                                                long j222 = ~longValue62;
                                                long j232 = ((-163) * longValue62) + 192384838635L + (((~(j2 | longValue62)) | 1165968719) * (-328)) + ((j | 1165968719) * 164) + (((~(longValue62 | j2 | 1165968719)) | (~(j222 | j)) | (~((-1165968720) | j222))) * 164) + 124571348;
                                                j3 = (((int) (j232 >> 32)) & ((((~((-273940545) | i3)) | 82452) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1590658886 + ((~(i2 | (-273940545))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))) | (((int) j232) & (((((-67635282) | i3) * (-627)) - 635053948) + (((~((-2075578627) | i3)) | 782162259) * (-627)) + (((~(i2 | 2075578626)) | (~(782162259 | i3))) * 627)));
                                                java.lang.Object[] objArr752 = new java.lang.Object[1];
                                                e("\u0002\u001b0\u000e)\u0005\b\u0012\u0013.\u0004\r-\u000f0$㙣", android.graphics.Color.green(0) + 17, (byte) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE), objArr752);
                                                java.lang.Object[] objArr762 = {((java.lang.String) objArr752[0]).intern()};
                                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj4 == null) {
                                                }
                                                long longValue72 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr762)).longValue();
                                                long j242 = ~longValue72;
                                                long j252 = (407 * longValue72) + 194041071990L + (((~(j2 | (-479113758) | longValue72)) | (~(j242 | j))) * (-406)) + ((~(j242 | j2 | (-479113758))) * (-406)) + (((~(j2 | longValue72)) | (~(j | 479113757))) * 406) + 1769653825;
                                                int i232 = ~(i2 | 1868490271);
                                                long j262 = (((int) (j252 >> 32)) & (((152338452 | i232) * (-970)) + 661715908 + ((i232 | 1716151819) * 970))) | (((int) j252) & (((((~(i2 | 1058909500)) | (-378316910)) * (-90)) - 1687905466) + (((~(1058909500 | i3)) | 369928236) * (-45)) + (((~(378316909 | i3)) | 1058909500 | (~(i2 | (-378316910)))) * 45)));
                                                if (j3 <= 0) {
                                                }
                                                java.lang.Object[] objArr812 = new java.lang.Object[1];
                                                e("\u0004\r\u0019\r\u00050\r\u0004\b\u0012\u000f \"&)\u0003\u0011\u001d0\u0013/#㘎", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, (byte) (android.view.Gravity.getAbsoluteGravity(0, 0) + 15), objArr812);
                                                java.lang.Object[] objArr822 = {((java.lang.String) objArr812[0]).intern()};
                                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj5 == null) {
                                                }
                                                long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr822)).longValue();
                                                long j272 = ~longValue82;
                                                long j282 = j272 | j2;
                                                long j292 = (longValue82 * (-49)) + 38226201768L + ((j | 749533368) * (-50)) + (((~((-749533369) | j272 | j)) | (~(749533368 | j282))) * 50) + (((~(j272 | 749533368)) | (~j282) | (~(j2 | 749533368))) * 50) + 541006699;
                                                j4 = (((int) j292) & ((((~((-562044993) | i3)) * 623) - 51193424) + ((i2 | 136841237) * (-623)) + (((~(506011327 | i3)) | 562044992 | (~((-931215083) | i3))) * 623))) | (((int) (j292 >> 32)) & ((((~(i2 | 1127853317)) | (~(i2 | 1729887567))) * (-867)) + 1972008040 + (((~(1729887567 | i3)) | (-1731984720) | (~(1127853317 | i3))) * (-1734)) + (((~(i2 | 1731984719)) | (~((-2097153) | i3)) | (~((-604131403) | i3))) * 867)));
                                                java.lang.Object[] objArr842 = new java.lang.Object[1];
                                                f("\ue148둛⃕\ueba0", android.graphics.Color.rgb(0, 0, 0) + 16777220, objArr842);
                                                java.lang.Object[] objArr852 = {((java.lang.String) objArr842[0]).intern()};
                                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj6 == null) {
                                                }
                                                long longValue92 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr852)).longValue();
                                                long j302 = ~((-199176677) | (~longValue92));
                                                long j312 = 199176676 | longValue92;
                                                long j322 = ((longValue92 * (-755)) - 150378390380L) + (1512 * j302) + ((j302 | (~(j312 | j))) * (-756)) + ((j312 | j2) * 756) + 1091363391;
                                                long j332 = (((int) j322) & (((((~(i2 | (-1777281024))) | (~((-1080459863) | i3))) * 1900) - 1871736089) + (((~(i2 | 1080459862)) | (~(1777281023 | i3))) * (-950)) + (((~(1080459862 | i3)) | (~(i2 | 1777281023))) * 950))) | (((int) (j322 >> 32)) & ((((~(1252969697 | i3)) | (-1605295604)) * 336) + 501358106 + (((~((-1604771188) | i3)) | 1252445281) * (-168)) + (((~(i2 | (-1604771188))) | 1252969697) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)));
                                                if (j4 <= 0) {
                                                }
                                                java.lang.Object[] objArr902 = new java.lang.Object[1];
                                                f("䤱\udf18峟瑴\ue5c0Ć쓷훦", 7 - android.widget.ExpandableListView.getPackedPositionGroup(j5), objArr902);
                                                java.lang.String intern302 = ((java.lang.String) objArr902[0]).intern();
                                                java.lang.Object[] objArr912 = new java.lang.Object[1];
                                                f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e\ueca1Ỵ裇᭯", android.graphics.Color.argb(0, 0, 0, 0) + 11, objArr912);
                                                java.lang.String intern312 = ((java.lang.String) objArr912[0]).intern();
                                                java.lang.Object[] objArr922 = new java.lang.Object[1];
                                                e("\u0004\r\u0019\r\u0001\u0016)\u0004\t \u001e ", 12 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11), objArr922);
                                                java.lang.String intern322 = ((java.lang.String) objArr922[0]).intern();
                                                java.lang.Object[] objArr932 = new java.lang.Object[1];
                                                f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e쟠ᵁ싈걊", 12 - android.text.TextUtils.getOffsetBefore(str3, 0), objArr932);
                                                java.lang.String intern332 = ((java.lang.String) objArr932[0]).intern();
                                                java.lang.Object[] objArr942 = new java.lang.Object[1];
                                                f("ꊽ뒲\uf4b0媳꯸㲶닉⃙\ueca1Ỵ裇᭯", 11 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr942);
                                                java.lang.String intern342 = ((java.lang.String) objArr942[0]).intern();
                                                java.lang.Object[] objArr952 = new java.lang.Object[1];
                                                e("\u0004\r\u001f\u001e㘄", android.text.TextUtils.getOffsetAfter(str3, 0) + 5, (byte) (16 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr952);
                                                java.lang.String intern352 = ((java.lang.String) objArr952[0]).intern();
                                                java.lang.Object[] objArr962 = new java.lang.Object[1];
                                                f("\uda71㋦瘢㼕", 4 - android.view.View.MeasureSpec.getMode(0), objArr962);
                                                strArr = new java.lang.String[]{intern302, intern312, intern322, intern332, intern342, intern352, ((java.lang.String) objArr962[0]).intern()};
                                                i4 = 0;
                                                while (true) {
                                                    if (i4 >= 7) {
                                                    }
                                                    i4 = i9 + 1;
                                                    strArr = strArr2;
                                                }
                                                if (i5 != 0) {
                                                }
                                            } else {
                                                i18++;
                                                strArr5 = strArr5;
                                                str5 = str5;
                                                i19 = 2;
                                                i17 = 0;
                                            }
                                        }
                                    }
                                    str2 = str5;
                                    j2 = j8;
                                    i3 = i;
                                    str3 = str2;
                                    java.lang.Object[] objArr7222 = new java.lang.Object[1];
                                    e("\u0004\r\u0019\r\u00050\r\u0004\b\u0012\u000f \"&)\u0003\u0011\u001d0\u0013/#㘎", android.view.View.MeasureSpec.getSize(0) + 23, (byte) (android.text.TextUtils.indexOf(str3, str3) + 15), objArr7222);
                                    java.lang.Object[] objArr7322 = {((java.lang.String) objArr7222[0]).intern()};
                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj3 == null) {
                                    }
                                    long longValue622 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7322)).longValue();
                                    long j2222 = ~longValue622;
                                    long j2322 = ((-163) * longValue622) + 192384838635L + (((~(j2 | longValue622)) | 1165968719) * (-328)) + ((j | 1165968719) * 164) + (((~(longValue622 | j2 | 1165968719)) | (~(j2222 | j)) | (~((-1165968720) | j2222))) * 164) + 124571348;
                                    j3 = (((int) (j2322 >> 32)) & ((((~((-273940545) | i3)) | 82452) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1590658886 + ((~(i2 | (-273940545))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))) | (((int) j2322) & (((((-67635282) | i3) * (-627)) - 635053948) + (((~((-2075578627) | i3)) | 782162259) * (-627)) + (((~(i2 | 2075578626)) | (~(782162259 | i3))) * 627)));
                                    java.lang.Object[] objArr7522 = new java.lang.Object[1];
                                    e("\u0002\u001b0\u000e)\u0005\b\u0012\u0013.\u0004\r-\u000f0$㙣", android.graphics.Color.green(0) + 17, (byte) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE), objArr7522);
                                    java.lang.Object[] objArr7622 = {((java.lang.String) objArr7522[0]).intern()};
                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj4 == null) {
                                    }
                                    long longValue722 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr7622)).longValue();
                                    long j2422 = ~longValue722;
                                    long j2522 = (407 * longValue722) + 194041071990L + (((~(j2 | (-479113758) | longValue722)) | (~(j2422 | j))) * (-406)) + ((~(j2422 | j2 | (-479113758))) * (-406)) + (((~(j2 | longValue722)) | (~(j | 479113757))) * 406) + 1769653825;
                                    int i2322 = ~(i2 | 1868490271);
                                    long j2622 = (((int) (j2522 >> 32)) & (((152338452 | i2322) * (-970)) + 661715908 + ((i2322 | 1716151819) * 970))) | (((int) j2522) & (((((~(i2 | 1058909500)) | (-378316910)) * (-90)) - 1687905466) + (((~(1058909500 | i3)) | 369928236) * (-45)) + (((~(378316909 | i3)) | 1058909500 | (~(i2 | (-378316910)))) * 45)));
                                    if (j3 <= 0) {
                                    }
                                    java.lang.Object[] objArr8122 = new java.lang.Object[1];
                                    e("\u0004\r\u0019\r\u00050\r\u0004\b\u0012\u000f \"&)\u0003\u0011\u001d0\u0013/#㘎", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, (byte) (android.view.Gravity.getAbsoluteGravity(0, 0) + 15), objArr8122);
                                    java.lang.Object[] objArr8222 = {((java.lang.String) objArr8122[0]).intern()};
                                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj5 == null) {
                                    }
                                    long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8222)).longValue();
                                    long j2722 = ~longValue822;
                                    long j2822 = j2722 | j2;
                                    long j2922 = (longValue822 * (-49)) + 38226201768L + ((j | 749533368) * (-50)) + (((~((-749533369) | j2722 | j)) | (~(749533368 | j2822))) * 50) + (((~(j2722 | 749533368)) | (~j2822) | (~(j2 | 749533368))) * 50) + 541006699;
                                    j4 = (((int) j2922) & ((((~((-562044993) | i3)) * 623) - 51193424) + ((i2 | 136841237) * (-623)) + (((~(506011327 | i3)) | 562044992 | (~((-931215083) | i3))) * 623))) | (((int) (j2922 >> 32)) & ((((~(i2 | 1127853317)) | (~(i2 | 1729887567))) * (-867)) + 1972008040 + (((~(1729887567 | i3)) | (-1731984720) | (~(1127853317 | i3))) * (-1734)) + (((~(i2 | 1731984719)) | (~((-2097153) | i3)) | (~((-604131403) | i3))) * 867)));
                                    java.lang.Object[] objArr8422 = new java.lang.Object[1];
                                    f("\ue148둛⃕\ueba0", android.graphics.Color.rgb(0, 0, 0) + 16777220, objArr8422);
                                    java.lang.Object[] objArr8522 = {((java.lang.String) objArr8422[0]).intern()};
                                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj6 == null) {
                                    }
                                    long longValue922 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8522)).longValue();
                                    long j3022 = ~((-199176677) | (~longValue922));
                                    long j3122 = 199176676 | longValue922;
                                    long j3222 = ((longValue922 * (-755)) - 150378390380L) + (1512 * j3022) + ((j3022 | (~(j3122 | j))) * (-756)) + ((j3122 | j2) * 756) + 1091363391;
                                    long j3322 = (((int) j3222) & (((((~(i2 | (-1777281024))) | (~((-1080459863) | i3))) * 1900) - 1871736089) + (((~(i2 | 1080459862)) | (~(1777281023 | i3))) * (-950)) + (((~(1080459862 | i3)) | (~(i2 | 1777281023))) * 950))) | (((int) (j3222 >> 32)) & ((((~(1252969697 | i3)) | (-1605295604)) * 336) + 501358106 + (((~((-1604771188) | i3)) | 1252445281) * (-168)) + (((~(i2 | (-1604771188))) | 1252969697) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)));
                                    if (j4 <= 0) {
                                    }
                                    java.lang.Object[] objArr9022 = new java.lang.Object[1];
                                    f("䤱\udf18峟瑴\ue5c0Ć쓷훦", 7 - android.widget.ExpandableListView.getPackedPositionGroup(j5), objArr9022);
                                    java.lang.String intern3022 = ((java.lang.String) objArr9022[0]).intern();
                                    java.lang.Object[] objArr9122 = new java.lang.Object[1];
                                    f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e\ueca1Ỵ裇᭯", android.graphics.Color.argb(0, 0, 0, 0) + 11, objArr9122);
                                    java.lang.String intern3122 = ((java.lang.String) objArr9122[0]).intern();
                                    java.lang.Object[] objArr9222 = new java.lang.Object[1];
                                    e("\u0004\r\u0019\r\u0001\u0016)\u0004\t \u001e ", 12 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11), objArr9222);
                                    java.lang.String intern3222 = ((java.lang.String) objArr9222[0]).intern();
                                    java.lang.Object[] objArr9322 = new java.lang.Object[1];
                                    f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e쟠ᵁ싈걊", 12 - android.text.TextUtils.getOffsetBefore(str3, 0), objArr9322);
                                    java.lang.String intern3322 = ((java.lang.String) objArr9322[0]).intern();
                                    java.lang.Object[] objArr9422 = new java.lang.Object[1];
                                    f("ꊽ뒲\uf4b0媳꯸㲶닉⃙\ueca1Ỵ裇᭯", 11 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr9422);
                                    java.lang.String intern3422 = ((java.lang.String) objArr9422[0]).intern();
                                    java.lang.Object[] objArr9522 = new java.lang.Object[1];
                                    e("\u0004\r\u001f\u001e㘄", android.text.TextUtils.getOffsetAfter(str3, 0) + 5, (byte) (16 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr9522);
                                    java.lang.String intern3522 = ((java.lang.String) objArr9522[0]).intern();
                                    java.lang.Object[] objArr9622 = new java.lang.Object[1];
                                    f("\uda71㋦瘢㼕", 4 - android.view.View.MeasureSpec.getMode(0), objArr9622);
                                    strArr = new java.lang.String[]{intern3022, intern3122, intern3222, intern3322, intern3422, intern3522, ((java.lang.String) objArr9622[0]).intern()};
                                    i4 = 0;
                                    while (true) {
                                        if (i4 >= 7) {
                                        }
                                        i4 = i9 + 1;
                                        strArr = strArr2;
                                    }
                                    if (i5 != 0) {
                                    }
                                } else {
                                    str5 = str4;
                                    java.lang.Object[] objArr212 = new java.lang.Object[1];
                                    e("0\u000e\u001a\u0007\u0010\u001d#&&\u0010 \u0010㘚", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, (byte) (android.graphics.Color.red(0) + 27), objArr212);
                                    java.lang.Object[] objArr213 = {((java.lang.String) objArr212[0]).intern()};
                                    java.lang.Object obj67 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj67 == null) {
                                        java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1920, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                        byte[] bArr38 = $$a;
                                        byte b144 = bArr38[16];
                                        byte b145 = bArr38[14];
                                        java.lang.Object[] objArr214 = new java.lang.Object[1];
                                        d(b144, b145, (short) (b145 & 653), objArr214);
                                        obj67 = cls62.getMethod((java.lang.String) objArr214[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj67);
                                    }
                                    java.lang.Object invoke8 = ((java.lang.reflect.Method) obj67).invoke(null, objArr213);
                                    c = 0;
                                    i10 = 1;
                                    java.lang.Object[] objArr215 = new java.lang.Object[1];
                                    f("泦༂", -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr215);
                                }
                            }
                        } else {
                            obj8 = invoke3;
                            str4 = "";
                            obj9 = invoke2;
                        }
                        if (obj8 != null) {
                            java.lang.Object[] objArr216 = {obj8, 42};
                            java.lang.Object obj68 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj68 == null) {
                                java.lang.Class cls63 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.View.resolveSize(0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2593, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                byte[] bArr39 = $$a;
                                byte b146 = bArr39[16];
                                byte b147 = bArr39[14];
                                java.lang.Object[] objArr217 = new java.lang.Object[1];
                                d(b146, b147, (short) (b147 & 653), objArr217);
                                obj68 = cls63.getMethod((java.lang.String) objArr217[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj68);
                            }
                            long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj68).invoke(null, objArr216)).longValue();
                            long j75 = ~longValue27;
                            long j76 = j75 | j8;
                            obj10 = obj8;
                            i2 = i11;
                            j = j6;
                            long j77 = (longValue27 * (-49)) + 24593046804L + ((j6 | 482216604) * (-50)) + (((~(j75 | (-482216605) | j6)) | (~(j76 | 482216604))) * 50) + (((~(j75 | 482216604)) | (~j76) | (~(482216604 | j8))) * 50) + 774883920;
                            if (((((int) j77) & ((((((~(1065350503 | i)) | (~((-371875907) | i))) * 69) + 431796892) + ((((~(1047422023 | i)) | 17928480) | (~((-389804387) | i))) * (-69))) - 631958183)) | (((int) (j77 >> 32)) & ((((~(i2 | 888663290)) * 52) - 748710942) + (((~(i2 | 615738546)) | (~(i2 | (-821487865))) | 272924744) * (-52)) + (((~(i2 | (-615738547))) | 67175426) * 52)))) != 477111747) {
                            }
                            if (android.os.Build.VERSION.SDK_INT <= 33) {
                            }
                        } else {
                            obj10 = obj8;
                            i2 = i11;
                            j = j6;
                        }
                        if (obj9 != null) {
                            java.lang.Object[] objArr218 = {obj9, 42};
                            java.lang.Object obj69 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj69 == null) {
                                java.lang.Class cls64 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('L' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2594 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                byte[] bArr40 = $$a;
                                byte b148 = bArr40[16];
                                byte b149 = bArr40[14];
                                java.lang.Object[] objArr219 = new java.lang.Object[1];
                                d(b148, b149, (short) (b149 & 653), objArr219);
                                obj69 = cls64.getMethod((java.lang.String) objArr219[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj69);
                            }
                            long longValue28 = ((java.lang.Long) ((java.lang.reflect.Method) obj69).invoke(null, objArr218)).longValue();
                            long j78 = ~longValue28;
                            long j79 = ~(j78 | j);
                            long j80 = (longValue28 * 246) + 157423267788L + (((~(j78 | (-645177327))) | (~(j78 | j8))) * (-245)) + ((-245) * j79) + (((-645177327) | j79) * 245) + 1902277851;
                            int i43 = ~(i2 | 1055216553);
                        }
                        if (obj10 != null) {
                            java.lang.Object[] objArr220 = {obj10, 42};
                            java.lang.Object obj70 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj70 == null) {
                                java.lang.Class cls65 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 2595 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                byte[] bArr41 = $$a;
                                byte b150 = bArr41[16];
                                byte b151 = bArr41[14];
                                java.lang.Object[] objArr221 = new java.lang.Object[1];
                                d(b150, b151, (short) (b151 & 653), objArr221);
                                obj70 = cls65.getMethod((java.lang.String) objArr221[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj70);
                            }
                            long longValue29 = ((java.lang.Long) ((java.lang.reflect.Method) obj70).invoke(null, objArr220)).longValue();
                            long j81 = ~(j | (-492805229));
                            long j82 = ~longValue29;
                            long j83 = ((-139) * longValue29) + 69485537148L + (((~(longValue29 | (-492805229))) | j81) * (-280)) + (((~(j82 | j)) | j81) * 140) + (((~((-492805229) | j82 | j)) | (~(longValue29 | (-492805229) | j8)) | (~(j82 | j8 | 492805228))) * 140) + 764295296;
                        }
                        str5 = str4;
                        java.lang.Object[] objArr252 = new java.lang.Object[1];
                        f("ﲡ\udcd3\udec7껶귫鷂峟瑴", 8 - android.text.TextUtils.indexOf(str5, str5), objArr252);
                        java.lang.String intern210 = ((java.lang.String) objArr252[0]).intern();
                        java.lang.Object[] objArr262 = new java.lang.Object[1];
                        f("丈\ue8eb䋀쟣｀㣍", android.view.View.combineMeasuredStates(0, 0) + 6, objArr262);
                        java.lang.String intern310 = ((java.lang.String) objArr262[0]).intern();
                        java.lang.Object[] objArr272 = new java.lang.Object[1];
                        f("䣺柶뎳ᵡ䮮\ue37f穐㜠", 6 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr272);
                        java.lang.String intern47 = ((java.lang.String) objArr272[0]).intern();
                        java.lang.Object[] objArr282 = new java.lang.Object[1];
                        e("(\t \t\u000e+\u0014\u0010㙘", 9 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (byte) (111 - android.view.MotionEvent.axisFromString(str5)), objArr282);
                        java.lang.String intern52 = ((java.lang.String) objArr282[0]).intern();
                        java.lang.Object[] objArr292 = new java.lang.Object[1];
                        e("!\b\u0013'\u000f ", (android.os.Process.myTid() >> 22) + 6, (byte) (53 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr292);
                        java.lang.String intern62 = ((java.lang.String) objArr292[0]).intern();
                        java.lang.Object[] objArr302 = new java.lang.Object[1];
                        f("싈걊ᜃǄ⌲⨸\uf61a貈\ue509\ue007⏶\ud7c9騾骿", 13 - android.graphics.Color.alpha(0), objArr302);
                        java.lang.String intern72 = ((java.lang.String) objArr302[0]).intern();
                        java.lang.Object[] objArr312 = new java.lang.Object[1];
                        f("똞騂殗┟ʿ㻭", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '+', objArr312);
                        java.lang.String intern82 = ((java.lang.String) objArr312[0]).intern();
                        java.lang.Object[] objArr322 = new java.lang.Object[1];
                        f("勸觤䮮\ue37f瑙鰔", '6' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr322);
                        java.lang.String intern92 = ((java.lang.String) objArr322[0]).intern();
                        java.lang.Object[] objArr332 = new java.lang.Object[1];
                        e("!\u0016", android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3, (byte) (2 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr332);
                        java.lang.String intern102 = ((java.lang.String) objArr332[0]).intern();
                        java.lang.Object[] objArr342 = new java.lang.Object[1];
                        e("\u0013\u000e,\u001e\u000e+\b \b.\u0019\u0007-\u000f+,", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 16, (byte) (6 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr342);
                        java.lang.String intern112 = ((java.lang.String) objArr342[0]).intern();
                        java.lang.Object[] objArr352 = new java.lang.Object[1];
                        f("嶽\ue95f鬖짪ᤫ噶숵\uf165䄘좉", 10 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr352);
                        java.lang.String intern122 = ((java.lang.String) objArr352[0]).intern();
                        java.lang.Object[] objArr362 = new java.lang.Object[1];
                        e("\u0015,\u0013)-\u000e -", 8 - (android.os.Process.myTid() >> 22), (byte) (71 - android.text.TextUtils.getOffsetBefore(str5, 0)), objArr362);
                        java.lang.String intern132 = ((java.lang.String) objArr362[0]).intern();
                        java.lang.Object[] objArr372 = new java.lang.Object[1];
                        f("炁㩤誻衺狰\ude33鯲乏㸻쮅⼮퐲", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, objArr372);
                        java.lang.String intern142 = ((java.lang.String) objArr372[0]).intern();
                        java.lang.Object[] objArr382 = new java.lang.Object[1];
                        f("炁㩤誻衺狰\ude33鯲乏㸻쮅瘢㼕謣膓", 14 - android.text.TextUtils.getTrimmedLength(str5), objArr382);
                        java.lang.String intern152 = ((java.lang.String) objArr382[0]).intern();
                        java.lang.Object[] objArr392 = new java.lang.Object[1];
                        e("+\u000e)\u0012&\"㙖", android.view.View.resolveSizeAndState(0, 0, 0) + 7, (byte) (104 - (android.os.Process.myTid() >> 22)), objArr392);
                        java.lang.String intern162 = ((java.lang.String) objArr392[0]).intern();
                        java.lang.Object[] objArr402 = new java.lang.Object[1];
                        e("\f\b\u0013\u001b&\u0012㗽", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, (byte) (android.text.TextUtils.indexOf(str5, str5, 0) + 19), objArr402);
                        java.lang.String intern172 = ((java.lang.String) objArr402[0]).intern();
                        java.lang.Object[] objArr412 = new java.lang.Object[1];
                        e("\f \u000f \u0001\u0016㗎", android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 8, (byte) (37 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr412);
                        java.lang.String intern182 = ((java.lang.String) objArr412[0]).intern();
                        java.lang.Object[] objArr422 = new java.lang.Object[1];
                        e("㘖㘖", 2 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (byte) (44 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr422);
                        java.lang.String intern192 = ((java.lang.String) objArr422[0]).intern();
                        java.lang.Object[] objArr432 = new java.lang.Object[1];
                        e("\b.\u000e-0\u001d\u0016!*\b \u0014\u0013)-\u0012$\u0010\u001d-", 20 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) (97 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr432);
                        java.lang.String intern202 = ((java.lang.String) objArr432[0]).intern();
                        java.lang.Object[] objArr442 = new java.lang.Object[1];
                        f("\uef37求턤\udd69渜䘜", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '*', objArr442);
                        java.lang.String intern212 = ((java.lang.String) objArr442[0]).intern();
                        java.lang.Object[] objArr452 = new java.lang.Object[1];
                        f("숮䁕", android.graphics.Color.blue(0) + 2, objArr452);
                        java.lang.String intern222 = ((java.lang.String) objArr452[0]).intern();
                        java.lang.Object[] objArr462 = new java.lang.Object[1];
                        e("\n\u0012 \u001e\u0001$\u0016\u0012+\u0000\b.\u000f-'\r", android.text.TextUtils.getTrimmedLength(str5) + 16, (byte) (79 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr462);
                        java.lang.String intern232 = ((java.lang.String) objArr462[0]).intern();
                        java.lang.Object[] objArr472 = new java.lang.Object[1];
                        f("㟱䠵嗝䔾䈱쾉拗ퟍꀺ㢲", 9 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr472);
                        java.lang.String intern242 = ((java.lang.String) objArr472[0]).intern();
                        java.lang.Object[] objArr482 = new java.lang.Object[1];
                        f("㟱䠵嗝䔾䈱쾉拗ퟍ쇊낲", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, objArr482);
                        java.lang.String intern252 = ((java.lang.String) objArr482[0]).intern();
                        java.lang.Object[] objArr492 = new java.lang.Object[1];
                        f("㟱䠵嗝䔾䮮\ue37f흇믒\ue5c0Ć뮅瞋", android.text.TextUtils.getOffsetAfter(str5, 0) + 11, objArr492);
                        java.lang.String intern262 = ((java.lang.String) objArr492[0]).intern();
                        java.lang.Object[] objArr502 = new java.lang.Object[1];
                        e("&\"\u0016!!\n\u001c\u001e!-㙤", 11 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (111 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr502);
                        java.lang.String intern272 = ((java.lang.String) objArr502[0]).intern();
                        java.lang.Object[] objArr512 = new java.lang.Object[1];
                        f("㤞\uf405Ⳍ\ue703䤂졅㎶う\u193d⬧諾婟❰膝꺥䮧", android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, objArr512);
                        java.lang.String intern282 = ((java.lang.String) objArr512[0]).intern();
                        java.lang.Object[] objArr522 = new java.lang.Object[1];
                        e("&\"\u0016!!\n \r\u0019)\"\u0010\u0019\u0012", 13 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 108), objArr522);
                        java.lang.String[] strArr52 = {intern210, intern310, intern47, intern52, intern62, intern72, intern82, intern92, intern102, intern112, intern122, intern132, intern142, intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, ((java.lang.String) objArr522[0]).intern()};
                        java.lang.Object[] objArr532 = new java.lang.Object[1];
                        e("0\u000e\u001c\u000e\u000e-\u0013!\u000e-㙓", android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 12, (byte) (android.view.View.resolveSize(0, 0) + 84), objArr532);
                        java.lang.Object[] objArr542 = {((java.lang.String) objArr532[0]).intern()};
                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj2 == null) {
                        }
                        str = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr542);
                        if (str != null) {
                        }
                        str2 = str5;
                        j2 = j8;
                        i3 = i;
                        str3 = str2;
                        java.lang.Object[] objArr72222 = new java.lang.Object[1];
                        e("\u0004\r\u0019\r\u00050\r\u0004\b\u0012\u000f \"&)\u0003\u0011\u001d0\u0013/#㘎", android.view.View.MeasureSpec.getSize(0) + 23, (byte) (android.text.TextUtils.indexOf(str3, str3) + 15), objArr72222);
                        java.lang.Object[] objArr73222 = {((java.lang.String) objArr72222[0]).intern()};
                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj3 == null) {
                        }
                        long longValue6222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr73222)).longValue();
                        long j22222 = ~longValue6222;
                        long j23222 = ((-163) * longValue6222) + 192384838635L + (((~(j2 | longValue6222)) | 1165968719) * (-328)) + ((j | 1165968719) * 164) + (((~(longValue6222 | j2 | 1165968719)) | (~(j22222 | j)) | (~((-1165968720) | j22222))) * 164) + 124571348;
                        j3 = (((int) (j23222 >> 32)) & ((((~((-273940545) | i3)) | 82452) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1590658886 + ((~(i2 | (-273940545))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))) | (((int) j23222) & (((((-67635282) | i3) * (-627)) - 635053948) + (((~((-2075578627) | i3)) | 782162259) * (-627)) + (((~(i2 | 2075578626)) | (~(782162259 | i3))) * 627)));
                        java.lang.Object[] objArr75222 = new java.lang.Object[1];
                        e("\u0002\u001b0\u000e)\u0005\b\u0012\u0013.\u0004\r-\u000f0$㙣", android.graphics.Color.green(0) + 17, (byte) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE), objArr75222);
                        java.lang.Object[] objArr76222 = {((java.lang.String) objArr75222[0]).intern()};
                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj4 == null) {
                        }
                        long longValue7222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr76222)).longValue();
                        long j24222 = ~longValue7222;
                        long j25222 = (407 * longValue7222) + 194041071990L + (((~(j2 | (-479113758) | longValue7222)) | (~(j24222 | j))) * (-406)) + ((~(j24222 | j2 | (-479113758))) * (-406)) + (((~(j2 | longValue7222)) | (~(j | 479113757))) * 406) + 1769653825;
                        int i23222 = ~(i2 | 1868490271);
                        long j26222 = (((int) (j25222 >> 32)) & (((152338452 | i23222) * (-970)) + 661715908 + ((i23222 | 1716151819) * 970))) | (((int) j25222) & (((((~(i2 | 1058909500)) | (-378316910)) * (-90)) - 1687905466) + (((~(1058909500 | i3)) | 369928236) * (-45)) + (((~(378316909 | i3)) | 1058909500 | (~(i2 | (-378316910)))) * 45)));
                        if (j3 <= 0) {
                        }
                        java.lang.Object[] objArr81222 = new java.lang.Object[1];
                        e("\u0004\r\u0019\r\u00050\r\u0004\b\u0012\u000f \"&)\u0003\u0011\u001d0\u0013/#㘎", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, (byte) (android.view.Gravity.getAbsoluteGravity(0, 0) + 15), objArr81222);
                        java.lang.Object[] objArr82222 = {((java.lang.String) objArr81222[0]).intern()};
                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj5 == null) {
                        }
                        long longValue8222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr82222)).longValue();
                        long j27222 = ~longValue8222;
                        long j28222 = j27222 | j2;
                        long j29222 = (longValue8222 * (-49)) + 38226201768L + ((j | 749533368) * (-50)) + (((~((-749533369) | j27222 | j)) | (~(749533368 | j28222))) * 50) + (((~(j27222 | 749533368)) | (~j28222) | (~(j2 | 749533368))) * 50) + 541006699;
                        j4 = (((int) j29222) & ((((~((-562044993) | i3)) * 623) - 51193424) + ((i2 | 136841237) * (-623)) + (((~(506011327 | i3)) | 562044992 | (~((-931215083) | i3))) * 623))) | (((int) (j29222 >> 32)) & ((((~(i2 | 1127853317)) | (~(i2 | 1729887567))) * (-867)) + 1972008040 + (((~(1729887567 | i3)) | (-1731984720) | (~(1127853317 | i3))) * (-1734)) + (((~(i2 | 1731984719)) | (~((-2097153) | i3)) | (~((-604131403) | i3))) * 867)));
                        java.lang.Object[] objArr84222 = new java.lang.Object[1];
                        f("\ue148둛⃕\ueba0", android.graphics.Color.rgb(0, 0, 0) + 16777220, objArr84222);
                        java.lang.Object[] objArr85222 = {((java.lang.String) objArr84222[0]).intern()};
                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj6 == null) {
                        }
                        long longValue9222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr85222)).longValue();
                        long j30222 = ~((-199176677) | (~longValue9222));
                        long j31222 = 199176676 | longValue9222;
                        long j32222 = ((longValue9222 * (-755)) - 150378390380L) + (1512 * j30222) + ((j30222 | (~(j31222 | j))) * (-756)) + ((j31222 | j2) * 756) + 1091363391;
                        long j33222 = (((int) j32222) & (((((~(i2 | (-1777281024))) | (~((-1080459863) | i3))) * 1900) - 1871736089) + (((~(i2 | 1080459862)) | (~(1777281023 | i3))) * (-950)) + (((~(1080459862 | i3)) | (~(i2 | 1777281023))) * 950))) | (((int) (j32222 >> 32)) & ((((~(1252969697 | i3)) | (-1605295604)) * 336) + 501358106 + (((~((-1604771188) | i3)) | 1252445281) * (-168)) + (((~(i2 | (-1604771188))) | 1252969697) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)));
                        if (j4 <= 0) {
                        }
                        java.lang.Object[] objArr90222 = new java.lang.Object[1];
                        f("䤱\udf18峟瑴\ue5c0Ć쓷훦", 7 - android.widget.ExpandableListView.getPackedPositionGroup(j5), objArr90222);
                        java.lang.String intern30222 = ((java.lang.String) objArr90222[0]).intern();
                        java.lang.Object[] objArr91222 = new java.lang.Object[1];
                        f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e\ueca1Ỵ裇᭯", android.graphics.Color.argb(0, 0, 0, 0) + 11, objArr91222);
                        java.lang.String intern31222 = ((java.lang.String) objArr91222[0]).intern();
                        java.lang.Object[] objArr92222 = new java.lang.Object[1];
                        e("\u0004\r\u0019\r\u0001\u0016)\u0004\t \u001e ", 12 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11), objArr92222);
                        java.lang.String intern32222 = ((java.lang.String) objArr92222[0]).intern();
                        java.lang.Object[] objArr93222 = new java.lang.Object[1];
                        f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e쟠ᵁ싈걊", 12 - android.text.TextUtils.getOffsetBefore(str3, 0), objArr93222);
                        java.lang.String intern33222 = ((java.lang.String) objArr93222[0]).intern();
                        java.lang.Object[] objArr94222 = new java.lang.Object[1];
                        f("ꊽ뒲\uf4b0媳꯸㲶닉⃙\ueca1Ỵ裇᭯", 11 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr94222);
                        java.lang.String intern34222 = ((java.lang.String) objArr94222[0]).intern();
                        java.lang.Object[] objArr95222 = new java.lang.Object[1];
                        e("\u0004\r\u001f\u001e㘄", android.text.TextUtils.getOffsetAfter(str3, 0) + 5, (byte) (16 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr95222);
                        java.lang.String intern35222 = ((java.lang.String) objArr95222[0]).intern();
                        java.lang.Object[] objArr96222 = new java.lang.Object[1];
                        f("\uda71㋦瘢㼕", 4 - android.view.View.MeasureSpec.getMode(0), objArr96222);
                        strArr = new java.lang.String[]{intern30222, intern31222, intern32222, intern33222, intern34222, intern35222, ((java.lang.String) objArr96222[0]).intern()};
                        i4 = 0;
                        while (true) {
                            if (i4 >= 7) {
                            }
                            i4 = i9 + 1;
                            strArr = strArr2;
                        }
                        if (i5 != 0) {
                        }
                    } else {
                        i12++;
                    }
                }
            }
            i2 = i11;
            j = j6;
            java.lang.Object[] objArr2522 = new java.lang.Object[1];
            f("ﲡ\udcd3\udec7껶귫鷂峟瑴", 8 - android.text.TextUtils.indexOf(str5, str5), objArr2522);
            java.lang.String intern2102 = ((java.lang.String) objArr2522[0]).intern();
            java.lang.Object[] objArr2622 = new java.lang.Object[1];
            f("丈\ue8eb䋀쟣｀㣍", android.view.View.combineMeasuredStates(0, 0) + 6, objArr2622);
            java.lang.String intern3102 = ((java.lang.String) objArr2622[0]).intern();
            java.lang.Object[] objArr2722 = new java.lang.Object[1];
            f("䣺柶뎳ᵡ䮮\ue37f穐㜠", 6 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2722);
            java.lang.String intern472 = ((java.lang.String) objArr2722[0]).intern();
            java.lang.Object[] objArr2822 = new java.lang.Object[1];
            e("(\t \t\u000e+\u0014\u0010㙘", 9 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (byte) (111 - android.view.MotionEvent.axisFromString(str5)), objArr2822);
            java.lang.String intern522 = ((java.lang.String) objArr2822[0]).intern();
            java.lang.Object[] objArr2922 = new java.lang.Object[1];
            e("!\b\u0013'\u000f ", (android.os.Process.myTid() >> 22) + 6, (byte) (53 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr2922);
            java.lang.String intern622 = ((java.lang.String) objArr2922[0]).intern();
            java.lang.Object[] objArr3022 = new java.lang.Object[1];
            f("싈걊ᜃǄ⌲⨸\uf61a貈\ue509\ue007⏶\ud7c9騾骿", 13 - android.graphics.Color.alpha(0), objArr3022);
            java.lang.String intern722 = ((java.lang.String) objArr3022[0]).intern();
            java.lang.Object[] objArr3122 = new java.lang.Object[1];
            f("똞騂殗┟ʿ㻭", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '+', objArr3122);
            java.lang.String intern822 = ((java.lang.String) objArr3122[0]).intern();
            java.lang.Object[] objArr3222 = new java.lang.Object[1];
            f("勸觤䮮\ue37f瑙鰔", '6' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr3222);
            java.lang.String intern922 = ((java.lang.String) objArr3222[0]).intern();
            java.lang.Object[] objArr3322 = new java.lang.Object[1];
            e("!\u0016", android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3, (byte) (2 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr3322);
            java.lang.String intern1022 = ((java.lang.String) objArr3322[0]).intern();
            java.lang.Object[] objArr3422 = new java.lang.Object[1];
            e("\u0013\u000e,\u001e\u000e+\b \b.\u0019\u0007-\u000f+,", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 16, (byte) (6 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr3422);
            java.lang.String intern1122 = ((java.lang.String) objArr3422[0]).intern();
            java.lang.Object[] objArr3522 = new java.lang.Object[1];
            f("嶽\ue95f鬖짪ᤫ噶숵\uf165䄘좉", 10 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3522);
            java.lang.String intern1222 = ((java.lang.String) objArr3522[0]).intern();
            java.lang.Object[] objArr3622 = new java.lang.Object[1];
            e("\u0015,\u0013)-\u000e -", 8 - (android.os.Process.myTid() >> 22), (byte) (71 - android.text.TextUtils.getOffsetBefore(str5, 0)), objArr3622);
            java.lang.String intern1322 = ((java.lang.String) objArr3622[0]).intern();
            java.lang.Object[] objArr3722 = new java.lang.Object[1];
            f("炁㩤誻衺狰\ude33鯲乏㸻쮅⼮퐲", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, objArr3722);
            java.lang.String intern1422 = ((java.lang.String) objArr3722[0]).intern();
            java.lang.Object[] objArr3822 = new java.lang.Object[1];
            f("炁㩤誻衺狰\ude33鯲乏㸻쮅瘢㼕謣膓", 14 - android.text.TextUtils.getTrimmedLength(str5), objArr3822);
            java.lang.String intern1522 = ((java.lang.String) objArr3822[0]).intern();
            java.lang.Object[] objArr3922 = new java.lang.Object[1];
            e("+\u000e)\u0012&\"㙖", android.view.View.resolveSizeAndState(0, 0, 0) + 7, (byte) (104 - (android.os.Process.myTid() >> 22)), objArr3922);
            java.lang.String intern1622 = ((java.lang.String) objArr3922[0]).intern();
            java.lang.Object[] objArr4022 = new java.lang.Object[1];
            e("\f\b\u0013\u001b&\u0012㗽", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, (byte) (android.text.TextUtils.indexOf(str5, str5, 0) + 19), objArr4022);
            java.lang.String intern1722 = ((java.lang.String) objArr4022[0]).intern();
            java.lang.Object[] objArr4122 = new java.lang.Object[1];
            e("\f \u000f \u0001\u0016㗎", android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 8, (byte) (37 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr4122);
            java.lang.String intern1822 = ((java.lang.String) objArr4122[0]).intern();
            java.lang.Object[] objArr4222 = new java.lang.Object[1];
            e("㘖㘖", 2 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (byte) (44 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr4222);
            java.lang.String intern1922 = ((java.lang.String) objArr4222[0]).intern();
            java.lang.Object[] objArr4322 = new java.lang.Object[1];
            e("\b.\u000e-0\u001d\u0016!*\b \u0014\u0013)-\u0012$\u0010\u001d-", 20 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) (97 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr4322);
            java.lang.String intern2022 = ((java.lang.String) objArr4322[0]).intern();
            java.lang.Object[] objArr4422 = new java.lang.Object[1];
            f("\uef37求턤\udd69渜䘜", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '*', objArr4422);
            java.lang.String intern2122 = ((java.lang.String) objArr4422[0]).intern();
            java.lang.Object[] objArr4522 = new java.lang.Object[1];
            f("숮䁕", android.graphics.Color.blue(0) + 2, objArr4522);
            java.lang.String intern2222 = ((java.lang.String) objArr4522[0]).intern();
            java.lang.Object[] objArr4622 = new java.lang.Object[1];
            e("\n\u0012 \u001e\u0001$\u0016\u0012+\u0000\b.\u000f-'\r", android.text.TextUtils.getTrimmedLength(str5) + 16, (byte) (79 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr4622);
            java.lang.String intern2322 = ((java.lang.String) objArr4622[0]).intern();
            java.lang.Object[] objArr4722 = new java.lang.Object[1];
            f("㟱䠵嗝䔾䈱쾉拗ퟍꀺ㢲", 9 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr4722);
            java.lang.String intern2422 = ((java.lang.String) objArr4722[0]).intern();
            java.lang.Object[] objArr4822 = new java.lang.Object[1];
            f("㟱䠵嗝䔾䈱쾉拗ퟍ쇊낲", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, objArr4822);
            java.lang.String intern2522 = ((java.lang.String) objArr4822[0]).intern();
            java.lang.Object[] objArr4922 = new java.lang.Object[1];
            f("㟱䠵嗝䔾䮮\ue37f흇믒\ue5c0Ć뮅瞋", android.text.TextUtils.getOffsetAfter(str5, 0) + 11, objArr4922);
            java.lang.String intern2622 = ((java.lang.String) objArr4922[0]).intern();
            java.lang.Object[] objArr5022 = new java.lang.Object[1];
            e("&\"\u0016!!\n\u001c\u001e!-㙤", 11 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (111 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr5022);
            java.lang.String intern2722 = ((java.lang.String) objArr5022[0]).intern();
            java.lang.Object[] objArr5122 = new java.lang.Object[1];
            f("㤞\uf405Ⳍ\ue703䤂졅㎶う\u193d⬧諾婟❰膝꺥䮧", android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, objArr5122);
            java.lang.String intern2822 = ((java.lang.String) objArr5122[0]).intern();
            java.lang.Object[] objArr5222 = new java.lang.Object[1];
            e("&\"\u0016!!\n \r\u0019)\"\u0010\u0019\u0012", 13 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 108), objArr5222);
            java.lang.String[] strArr522 = {intern2102, intern3102, intern472, intern522, intern622, intern722, intern822, intern922, intern1022, intern1122, intern1222, intern1322, intern1422, intern1522, intern1622, intern1722, intern1822, intern1922, intern2022, intern2122, intern2222, intern2322, intern2422, intern2522, intern2622, intern2722, intern2822, ((java.lang.String) objArr5222[0]).intern()};
            java.lang.Object[] objArr5322 = new java.lang.Object[1];
            e("0\u000e\u001c\u000e\u000e-\u0013!\u000e-㙓", android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 12, (byte) (android.view.View.resolveSize(0, 0) + 84), objArr5322);
            java.lang.Object[] objArr5422 = {((java.lang.String) objArr5322[0]).intern()};
            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj2 == null) {
            }
            str = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr5422);
            if (str != null) {
            }
            str2 = str5;
            j2 = j8;
            i3 = i;
            str3 = str2;
            java.lang.Object[] objArr722222 = new java.lang.Object[1];
            e("\u0004\r\u0019\r\u00050\r\u0004\b\u0012\u000f \"&)\u0003\u0011\u001d0\u0013/#㘎", android.view.View.MeasureSpec.getSize(0) + 23, (byte) (android.text.TextUtils.indexOf(str3, str3) + 15), objArr722222);
            java.lang.Object[] objArr732222 = {((java.lang.String) objArr722222[0]).intern()};
            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj3 == null) {
            }
            long longValue62222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr732222)).longValue();
            long j222222 = ~longValue62222;
            long j232222 = ((-163) * longValue62222) + 192384838635L + (((~(j2 | longValue62222)) | 1165968719) * (-328)) + ((j | 1165968719) * 164) + (((~(longValue62222 | j2 | 1165968719)) | (~(j222222 | j)) | (~((-1165968720) | j222222))) * 164) + 124571348;
            j3 = (((int) (j232222 >> 32)) & ((((~((-273940545) | i3)) | 82452) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1590658886 + ((~(i2 | (-273940545))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))) | (((int) j232222) & (((((-67635282) | i3) * (-627)) - 635053948) + (((~((-2075578627) | i3)) | 782162259) * (-627)) + (((~(i2 | 2075578626)) | (~(782162259 | i3))) * 627)));
            java.lang.Object[] objArr752222 = new java.lang.Object[1];
            e("\u0002\u001b0\u000e)\u0005\b\u0012\u0013.\u0004\r-\u000f0$㙣", android.graphics.Color.green(0) + 17, (byte) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE), objArr752222);
            java.lang.Object[] objArr762222 = {((java.lang.String) objArr752222[0]).intern()};
            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj4 == null) {
            }
            long longValue72222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr762222)).longValue();
            long j242222 = ~longValue72222;
            long j252222 = (407 * longValue72222) + 194041071990L + (((~(j2 | (-479113758) | longValue72222)) | (~(j242222 | j))) * (-406)) + ((~(j242222 | j2 | (-479113758))) * (-406)) + (((~(j2 | longValue72222)) | (~(j | 479113757))) * 406) + 1769653825;
            int i232222 = ~(i2 | 1868490271);
            long j262222 = (((int) (j252222 >> 32)) & (((152338452 | i232222) * (-970)) + 661715908 + ((i232222 | 1716151819) * 970))) | (((int) j252222) & (((((~(i2 | 1058909500)) | (-378316910)) * (-90)) - 1687905466) + (((~(1058909500 | i3)) | 369928236) * (-45)) + (((~(378316909 | i3)) | 1058909500 | (~(i2 | (-378316910)))) * 45)));
            if (j3 <= 0) {
            }
            java.lang.Object[] objArr812222 = new java.lang.Object[1];
            e("\u0004\r\u0019\r\u00050\r\u0004\b\u0012\u000f \"&)\u0003\u0011\u001d0\u0013/#㘎", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, (byte) (android.view.Gravity.getAbsoluteGravity(0, 0) + 15), objArr812222);
            java.lang.Object[] objArr822222 = {((java.lang.String) objArr812222[0]).intern()};
            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj5 == null) {
            }
            long longValue82222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr822222)).longValue();
            long j272222 = ~longValue82222;
            long j282222 = j272222 | j2;
            long j292222 = (longValue82222 * (-49)) + 38226201768L + ((j | 749533368) * (-50)) + (((~((-749533369) | j272222 | j)) | (~(749533368 | j282222))) * 50) + (((~(j272222 | 749533368)) | (~j282222) | (~(j2 | 749533368))) * 50) + 541006699;
            j4 = (((int) j292222) & ((((~((-562044993) | i3)) * 623) - 51193424) + ((i2 | 136841237) * (-623)) + (((~(506011327 | i3)) | 562044992 | (~((-931215083) | i3))) * 623))) | (((int) (j292222 >> 32)) & ((((~(i2 | 1127853317)) | (~(i2 | 1729887567))) * (-867)) + 1972008040 + (((~(1729887567 | i3)) | (-1731984720) | (~(1127853317 | i3))) * (-1734)) + (((~(i2 | 1731984719)) | (~((-2097153) | i3)) | (~((-604131403) | i3))) * 867)));
            java.lang.Object[] objArr842222 = new java.lang.Object[1];
            f("\ue148둛⃕\ueba0", android.graphics.Color.rgb(0, 0, 0) + 16777220, objArr842222);
            java.lang.Object[] objArr852222 = {((java.lang.String) objArr842222[0]).intern()};
            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj6 == null) {
            }
            long longValue92222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr852222)).longValue();
            long j302222 = ~((-199176677) | (~longValue92222));
            long j312222 = 199176676 | longValue92222;
            long j322222 = ((longValue92222 * (-755)) - 150378390380L) + (1512 * j302222) + ((j302222 | (~(j312222 | j))) * (-756)) + ((j312222 | j2) * 756) + 1091363391;
            long j332222 = (((int) j322222) & (((((~(i2 | (-1777281024))) | (~((-1080459863) | i3))) * 1900) - 1871736089) + (((~(i2 | 1080459862)) | (~(1777281023 | i3))) * (-950)) + (((~(1080459862 | i3)) | (~(i2 | 1777281023))) * 950))) | (((int) (j322222 >> 32)) & ((((~(1252969697 | i3)) | (-1605295604)) * 336) + 501358106 + (((~((-1604771188) | i3)) | 1252445281) * (-168)) + (((~(i2 | (-1604771188))) | 1252969697) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)));
            if (j4 <= 0) {
            }
            java.lang.Object[] objArr902222 = new java.lang.Object[1];
            f("䤱\udf18峟瑴\ue5c0Ć쓷훦", 7 - android.widget.ExpandableListView.getPackedPositionGroup(j5), objArr902222);
            java.lang.String intern302222 = ((java.lang.String) objArr902222[0]).intern();
            java.lang.Object[] objArr912222 = new java.lang.Object[1];
            f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e\ueca1Ỵ裇᭯", android.graphics.Color.argb(0, 0, 0, 0) + 11, objArr912222);
            java.lang.String intern312222 = ((java.lang.String) objArr912222[0]).intern();
            java.lang.Object[] objArr922222 = new java.lang.Object[1];
            e("\u0004\r\u0019\r\u0001\u0016)\u0004\t \u001e ", 12 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11), objArr922222);
            java.lang.String intern322222 = ((java.lang.String) objArr922222[0]).intern();
            java.lang.Object[] objArr932222 = new java.lang.Object[1];
            f("䤱\udf18峟瑴\ue5c0Ć臼\uf59e쟠ᵁ싈걊", 12 - android.text.TextUtils.getOffsetBefore(str3, 0), objArr932222);
            java.lang.String intern332222 = ((java.lang.String) objArr932222[0]).intern();
            java.lang.Object[] objArr942222 = new java.lang.Object[1];
            f("ꊽ뒲\uf4b0媳꯸㲶닉⃙\ueca1Ỵ裇᭯", 11 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr942222);
            java.lang.String intern342222 = ((java.lang.String) objArr942222[0]).intern();
            java.lang.Object[] objArr952222 = new java.lang.Object[1];
            e("\u0004\r\u001f\u001e㘄", android.text.TextUtils.getOffsetAfter(str3, 0) + 5, (byte) (16 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr952222);
            java.lang.String intern352222 = ((java.lang.String) objArr952222[0]).intern();
            java.lang.Object[] objArr962222 = new java.lang.Object[1];
            f("\uda71㋦瘢㼕", 4 - android.view.View.MeasureSpec.getMode(0), objArr962222);
            strArr = new java.lang.String[]{intern302222, intern312222, intern322222, intern332222, intern342222, intern352222, ((java.lang.String) objArr962222[0]).intern()};
            i4 = 0;
            while (true) {
                if (i4 >= 7) {
                }
                i4 = i9 + 1;
                strArr = strArr2;
            }
            if (i5 != 0) {
            }
        } catch (java.lang.Throwable th6) {
            java.lang.Throwable cause6 = th6.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th6;
        }
    }
}
