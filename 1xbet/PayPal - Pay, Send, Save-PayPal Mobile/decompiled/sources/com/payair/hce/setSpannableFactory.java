package com.payair.hce;

/* loaded from: classes4.dex */
public final class setSpannableFactory implements com.payair.hce.setMinEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int valueOf;
    private static char[] writeReplace;
    private com.payair.hce.setHighlights values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = b2 * 3;
        int i4 = 73 - (i * 8);
        int i5 = b + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 += i5;
            i5 = i6;
            i2 = i7;
            int i8 = i5 + 1;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i8];
            i5 = i4;
            i4 = b3;
            i6 = i8;
            i4 += i5;
            i5 = i6;
            i2 = i7;
            int i82 = i5 + 1;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            int i822 = i5 + 1;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        }
    }

    setSpannableFactory(com.payair.hce.setHighlights sethighlights) {
        this.values = sethighlights;
    }

    @Override // com.payair.hce.setMinEms
    public final java.io.InputStream values() {
        com.payair.hce.setPrivateImeOptions setprivateimeoptions = new com.payair.hce.setPrivateImeOptions(this.values);
        int i = valueOf + 37;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            return setprivateimeoptions;
        }
        throw null;
    }

    @Override // com.payair.hce.setTitleTextAppearance
    public final com.payair.hce.setEms RecordsJson() throws java.io.IOException {
        com.payair.hce.setSearchResultHighlightColor setsearchresulthighlightcolor = new com.payair.hce.setSearchResultHighlightColor((byte[]) com.payair.hce.handleIntentOnMainThread.AlternateContactlessPaymentDataJson(new java.lang.Object[]{values()}, -2019374468, 2019374469, (int) java.lang.System.currentTimeMillis()));
        int i = DigitizedCardProfile + 93;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return setsearchresulthighlightcolor;
        }
        throw null;
    }

    @Override // com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        valueOf = (DigitizedCardProfile + 21) % 128;
        try {
            com.payair.hce.setEms RecordsJson = RecordsJson();
            int i = valueOf + 109;
            DigitizedCardProfile = i % 128;
            if (i % 2 != 0) {
                return RecordsJson;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u0003\n\u0018\u0007\u0015\b\u0018\u0013\u0017\t\u0002\r\u0003\r\u0002\b\u0007\u0010\u0013\u0004\u0001\u0017\n\u0007\f\u0013\u0005\u0010\u0007\u0011\r\t\u000b\u0002\t\u0013\u0007\u000b\u0010\u0012\u0012\u0010\u0001\u000e㗙", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 46, (byte) (31 - android.view.View.combineMeasuredStates(0, 0)), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new com.payair.hce.setLines(sb.toString(), e);
        }
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = writeReplace;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(j) + 49, 2508 - (android.os.Process.myPid() >> 22), (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(1, (byte) -1, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 48, 2508 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.indexOf("", "") + 6802));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(1, (byte) -1, (byte) 0, objArr5);
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
        if (i2 > 1) {
            $10 = ($11 + 81) % 128;
            int i4 = 0;
            while (true) {
                digitizedCardJson12.values = i4;
                if (digitizedCardJson12.values >= i2) {
                    break;
                }
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 29, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3596, (char) android.view.Gravity.getAbsoluteGravity(0, 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 48, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2665, (char) (android.view.KeyEvent.keyCodeFromString("") + 18889));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(0, (byte) -1, (byte) 0, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i5 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i6 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i5 * charValue) + i6];
                        $10 = ($11 + 11) % 128;
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
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
                        $10 = ($11 + 43) % 128;
                    }
                }
                i4 = digitizedCardJson12.values + 2;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            int i16 = $10 + 27;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                cArr3[i15] = (char) (cArr3[i15] ^ 15188);
                i15 += 49;
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
        valueOf = 0;
        DigitizedCardProfile = 1;
        writeReplace = new char[]{12291, 12328, 12327, 12324, 12339, 12345, 12335, 12348, 12325, 12338, 12294, 12400, 12394, 12293, 12350, 12331, 12296, 12344, 12292, 12346, 12295, 12333, 12303, 12329, 12323};
        AlternateContactlessPaymentDataJson = (char) 1493;
    }

    static void init$0() {
        $$a = new byte[]{16, 76, 17, 34};
        $$b = 8;
    }
}
