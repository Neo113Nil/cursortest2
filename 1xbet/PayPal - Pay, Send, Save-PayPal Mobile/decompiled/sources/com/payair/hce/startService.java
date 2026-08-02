package com.payair.hce;

/* loaded from: classes4.dex */
public final class startService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int valueOf;
    private static int values;
    private static char[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = b2 + 65;
        int i3 = 3 - (b * 2);
        int i4 = 1 - (b3 * 2);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i2 += i5;
            i3++;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = bArr[i3];
            i2 += i5;
            i3++;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
            }
        } else {
            i = 0;
            i3++;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
            }
        }
    }

    public static void DigitizedCardProfile(byte[] bArr) {
        int i = valueOf;
        values = (i + 53) % 128;
        if (bArr != null) {
            int length = bArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = valueOf + 115;
                values = i3 % 128;
                if (i3 % 2 != 0) {
                    bArr[i2] = 1;
                    i2 += 118;
                } else {
                    bArr[i2] = 0;
                    i2++;
                }
            }
            return;
        }
        int i4 = i + 9;
        values = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static java.lang.String AlternateContactlessPaymentDataJson(byte[] bArr) {
        java.lang.String upperCase = new java.lang.String(com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr)).toUpperCase(java.util.Locale.ENGLISH);
        valueOf = (values + 21) % 128;
        return upperCase;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        int length;
        int[] iArr3;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = AlternateContactlessPaymentDataJson;
        int i3 = 1;
        int i4 = 0;
        if (iArr4 != null) {
            int i5 = $10 + 117;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = iArr4.length;
                iArr3 = new int[length];
                i2 = 1;
            } else {
                length = iArr4.length;
                iArr3 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                    objArr2[0] = java.lang.Integer.valueOf(iArr4[i2]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777243, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29, (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr3[i2] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i2++;
                    i3 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $11 = ($10 + 29) % 128;
            iArr4 = iArr3;
        }
        int length2 = iArr4.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = AlternateContactlessPaymentDataJson;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr6[i6])};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 27, (-16777187) - android.graphics.Color.rgb(0, 0, 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i6++;
                iArr6 = iArr2;
                i4 = 0;
            }
            iArr6 = iArr7;
        }
        int i7 = i4;
        java.lang.System.arraycopy(iArr6, i7, iArr5, i7, length2);
        istransitsupported.valueOf = i7;
        $10 = ($11 + 73) % 128;
        while (istransitsupported.valueOf < iArr.length) {
            $11 = ($10 + 99) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $11 + 83;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                    java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 5088, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue;
                    i8 += 3;
                } else {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                    java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 31, android.view.MotionEvent.axisFromString("") + 5089, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue2;
                    i8++;
                }
            }
            int i10 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i10;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i11 = istransitsupported.DigitizedCardProfile;
            int i12 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2923 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 3037));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                c((byte) 0, (byte) 1, (byte) 0, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public static byte[] writeReplace(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        int i = (valueOf + 29) % 128;
        values = i;
        int i2 = i + 93;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    public static byte[] DigitizedCardProfile(int i) {
        valueOf = (values + 59) % 128;
        byte[] bArr = new byte[i];
        try {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(new int[]{882691078, -3108935, -1009600433, -1445382329}, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 8, objArr);
                try {
                    java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern()};
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25, (byte) (53 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), "\u0006\u000f\u0001\u0013\r\u000b\u0010\u0007\f\u000e\u0004\u0010\u0011\r\u0016\u0012\u000b\u0010\f\u0012\u0006\u0011\u0000\u0014\u0004\u0003", objArr3);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b((android.view.KeyEvent.getMaxKeyCode() >> 16) + 11, (byte) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 56), "\u0016\u0010\u0018\u0013\u0000\u000f\u000f\u0011\u0015\u0005㘷", objArr4);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
                    try {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 5), "\u0016\u000f\u0018\u0011\r\u0017\u000f\u0012㘞", objArr5);
                        java.util.Random.class.getMethod((java.lang.String) objArr5[0], byte[].class).invoke(invoke, new byte[1]);
                        valueOf = (values + 63) % 128;
                        try {
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            b(android.view.View.MeasureSpec.getSize(0) + 9, (byte) (54 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "\u0016\u000f\u0018\u0011\r\u0017\u000f\u0012㘞", objArr6);
                            java.util.Random.class.getMethod((java.lang.String) objArr6[0], byte[].class).invoke(invoke, bArr);
                            return bArr;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            } catch (java.security.NoSuchAlgorithmException unused) {
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(9 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 53), "\u0016\u000f\u0018\u0011\r\u0017\u000f\u0012㘞", objArr7);
                java.util.Random.class.getMethod((java.lang.String) objArr7[0], byte[].class).invoke(java.util.Random.class.getDeclaredConstructor(null).newInstance(null), bArr);
                values = (valueOf + 75) % 128;
                return bArr;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    private static void b(int i, byte b, java.lang.String str, java.lang.Object[] objArr) {
        int i2;
        java.lang.Object obj;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = writeReplace;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        java.lang.Object obj2 = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj3 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.lastIndexOf("", c, 0, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2508, (char) (android.view.MotionEvent.axisFromString("") + 6803));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((byte) 0, (byte) 0, (byte) 0, objArr3);
                        obj3 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr2)).charValue();
                    i3++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
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
        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        byte b2 = 8;
        if (obj4 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2508, (char) (6802 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            c((byte) 0, (byte) 0, (byte) 0, objArr5);
            obj4 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj4);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    obj = obj2;
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[13];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[b2] = java.lang.Integer.valueOf(charValue);
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
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 29, android.graphics.Color.blue(0) + 3596, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        java.lang.Class<?>[] clsArr = new java.lang.Class[13];
                        clsArr[0] = java.lang.Object.class;
                        clsArr[1] = java.lang.Object.class;
                        clsArr[2] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Object.class;
                        clsArr[4] = java.lang.Object.class;
                        clsArr[5] = java.lang.Integer.TYPE;
                        clsArr[6] = java.lang.Object.class;
                        clsArr[7] = java.lang.Object.class;
                        clsArr[b2] = java.lang.Integer.TYPE;
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
                        objArr7[b2] = digitizedCardJson12;
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
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 48, 2666 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.view.View.MeasureSpec.getSize(0) + 18889));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            c((byte) 0, b2, (byte) 0, objArr8);
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
                            clsArr2[b2] = java.lang.Object.class;
                            clsArr2[9] = java.lang.Integer.TYPE;
                            clsArr2[10] = java.lang.Object.class;
                            obj6 = cls4.getMethod(str2, clsArr2);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj6);
                        }
                        obj = null;
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr7)).intValue();
                        int i4 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i5 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i4 * charValue) + i5];
                    } else {
                        obj = null;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i6 = digitizedCardJson12.DigitizedCardProfile;
                            int i7 = digitizedCardJson12.RecordsJson;
                            int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr3[digitizedCardJson12.values] = cArr[(i6 * charValue) + i7];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i8 * charValue) + i9];
                        } else {
                            int i10 = digitizedCardJson12.DigitizedCardProfile;
                            int i11 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i12 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i13 = digitizedCardJson12.RecordsJson;
                            cArr3[digitizedCardJson12.values] = cArr[(i10 * charValue) + i11];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i12 * charValue) + i13];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                obj2 = obj;
                b2 = 8;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            cArr3[i14] = (char) (cArr3[i14] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void valueOf() {
        writeReplace = new char[]{1491, 12323, 12327, 12325, 12348, 12320, 12329, 12312, 12296, 1490, 12345, 12351, 12388, 12344, 12291, 12334, 12331, 12335, 12339, 12350, 12324, 12333, 12338, 12313, 1489};
        DigitizedCardProfile = (char) 1493;
    }

    static void writeReplace() {
        AlternateContactlessPaymentDataJson = new int[]{-123659560, 914163893, 1674153671, -980086918, 1263259423, 343822975, 485933537, 1120016556, -1454400397, 1405788573, -1606813803, 1568726043, 1985308906, 1084474544, 464299737, 822659977, 1274899215, 1649016210};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        valueOf = 1;
        valueOf();
        writeReplace();
        android.view.ViewConfiguration.getPressedStateDuration();
        valueOf = (values + 79) % 128;
    }

    static void init$0() {
        $$a = new byte[]{6, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -80, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION};
        $$b = 160;
    }
}
