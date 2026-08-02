package com.payair.hce;

/* loaded from: classes4.dex */
public class checkPermission {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static char[] getAid;
    private static char getProfileVersion;
    private static java.util.Map<java.lang.String, com.payair.hce.checkPermission> values;
    private final java.lang.String AlternateContactlessPaymentDataJson;
    private final java.lang.String DigitizedCardProfile;
    private final java.lang.String valueOf;
    private final java.lang.String writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 73 - (b * 8);
        int i5 = 3 - (i * 3);
        int i6 = i2 * 2;
        byte[] bArr2 = new byte[1 - i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i4 += i5;
            i5 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            int i9 = i5 + 1;
            i8 = i3 + 1;
            if (i3 == 0 - i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i9;
            i5 = bArr[i9];
            i4 += i5;
            i5 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            int i92 = i5 + 1;
            i8 = i3 + 1;
            if (i3 == 0 - i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            int i922 = i5 + 1;
            i8 = i3 + 1;
            if (i3 == 0 - i6) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        writeReplace();
        values = new java.util.HashMap();
        int i = RecordsJson + 117;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private checkPermission(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0003\u000e\u000e\f㗠", 5 - android.view.View.resolveSize(0, 0), (byte) (55 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr);
        this.DigitizedCardProfile = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("\u0003\u0004\u000b\u0001\u0004\n\u0003\u000e\u000e\f\u0000\n\u0000\t", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 14, (byte) (android.graphics.ImageFormat.getBitsPerPixel(0) + 23), objArr2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr2[0]).intern());
        sb.append(str);
        int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("\t\u0000\f\u0000\u000f\n\u0006\u0005\t\u0000㘎", resolveSizeAndState + 11, (byte) ((-16777132) - android.graphics.Color.rgb(0, 0, 0)), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        this.valueOf = sb.toString();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a("\u0003\u0004\u000b\u0001\u0004\n\u0003\u000e\u000e\f\u0000\n\u0000\t", 14 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (byte) (android.graphics.Color.argb(0, 0, 0, 0) + 22), objArr4);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(((java.lang.String) objArr4[0]).intern());
        sb2.append(str);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a("\t\u0000\n\f\u0007\u0000\t\u0000㘰", android.view.View.combineMeasuredStates(0, 0) + 9, (byte) (117 - android.view.MotionEvent.axisFromString("")), objArr5);
        sb2.append(((java.lang.String) objArr5[0]).intern());
        this.writeReplace = sb2.toString();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a("\u0003\u0004\u000b\u0001\u0004\n\u0003\u000e\u000e\f\u0000\n\u0000\t", 14 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (22 - android.graphics.Color.argb(0, 0, 0, 0)), objArr6);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(((java.lang.String) objArr6[0]).intern());
        sb3.append(str);
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a("\t\u0000㘢", android.text.TextUtils.getOffsetAfter("", 0) + 3, (byte) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 103), objArr7);
        sb3.append(((java.lang.String) objArr7[0]).intern());
        this.AlternateContactlessPaymentDataJson = sb3.toString();
    }

    public static com.payair.hce.checkPermission DigitizedCardProfile(java.lang.String str) {
        com.payair.hce.checkPermission checkpermission;
        synchronized (com.payair.hce.checkPermission.class) {
            int i = IccPrivateKeyCrtComponentsJson + 73;
            RecordsJson = i % 128;
            if (i % 2 == 0) {
                checkpermission = values.get(str);
                if (checkpermission == null) {
                    checkpermission = new com.payair.hce.checkPermission(str);
                    values.put(str, checkpermission);
                    int i2 = RecordsJson + 95;
                    IccPrivateKeyCrtComponentsJson = i2 % 128;
                    int i3 = i2 % 2;
                }
            } else {
                values.get(str);
                throw new java.lang.NullPointerException();
            }
        }
        return checkpermission;
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        int length;
        char[] cArr2;
        int i3;
        int i4 = $11 + 85;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 55) % 128;
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr4 = getAid;
        if (cArr4 != null) {
            int i5 = $10 + 37;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.Color.blue(0), android.view.View.resolveSizeAndState(0, 0, 0) + 2508, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 1, 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getProfileVersion)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2508, (char) (6802 - android.graphics.Color.green(0)));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((byte) 1, 0, 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            int i6 = $10 + 31;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                i2 = i + 4;
                cArr5[i2] = (char) (cArr3[i2] >> b);
            } else {
                i2 = i - 1;
                cArr5[i2] = (char) (cArr3[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = cArr3[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr3[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    int i7 = $11 + 51;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.writeReplace << b);
                    } else {
                        cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                        cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    }
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 3596, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 48, 2665 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 18890));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b((byte) 0, 0, 0, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr4[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr4[(i8 * charValue) + i9];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i10 = digitizedCardJson12.DigitizedCardProfile;
                        int i11 = digitizedCardJson12.RecordsJson;
                        int i12 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr4[(i10 * charValue) + i11];
                        cArr5[digitizedCardJson12.values + 1] = cArr4[(i12 * charValue) + i13];
                    } else {
                        int i14 = digitizedCardJson12.DigitizedCardProfile;
                        int i15 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i16 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i17 = digitizedCardJson12.RecordsJson;
                        cArr5[digitizedCardJson12.values] = cArr4[(i14 * charValue) + i15];
                        cArr5[digitizedCardJson12.values + 1] = cArr4[(i16 * charValue) + i17];
                    }
                }
                digitizedCardJson12.values += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr5[i18] = (char) (cArr5[i18] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void init$0() {
        $$a = new byte[]{3, -32, -117, 13};
        $$b = 114;
    }

    static void writeReplace() {
        getAid = new char[]{12295, 12342, 12409, 12302, 12292, 12291, 12289, 12314, 12394, 12313, 12297, 12301, 12296, 12408, 12303, 12388};
        getProfileVersion = (char) 1492;
    }
}
