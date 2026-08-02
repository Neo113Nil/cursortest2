package com.payair.hce;

/* loaded from: classes4.dex */
public final class ensurePlayServicesAvailable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static char valueOf;
    private static char[] values;
    static final java.lang.ThreadLocal writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 73 - (b * 8);
        int i4 = (s * 2) + 1;
        int i5 = 3 - (b2 * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            i3 = i4;
            int i7 = 0;
            i3 += -i5;
            i5 = i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i5 + 1;
            i6 = i8;
            i5 = bArr[i8];
            i7 = i2;
            i3 += -i5;
            i5 = i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i4) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        AlternateContactlessPaymentDataJson = 1;
        values();
        writeReplace = new java.lang.ThreadLocal();
        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 95) % 128;
    }

    public static boolean AlternateContactlessPaymentDataJson(java.lang.String str) {
        java.lang.Object obj;
        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 81) % 128;
        try {
            java.lang.String valueOf2 = valueOf(str);
            if (valueOf2 != null) {
                int i = AlternateContactlessPaymentDataJson + 15;
                DigitizedCardProfile = i % 128;
                if (i % 2 != 0) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a("\u0002\u0003\u0001\u0000", 5 >> (android.view.ViewConfiguration.getFadingEdgeLength() * 127), (byte) (120 % android.view.View.resolveSize(1, 1)), objArr);
                    obj = objArr[0];
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a("\u0002\u0003\u0001\u0000", 4 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (android.view.View.resolveSize(0, 0) + 44), objArr2);
                    obj = objArr2[0];
                }
                return ((java.lang.String) obj).intern().equals(com.payair.hce.isGooglePlayServicesUid.valueOf(valueOf2));
            }
        } catch (java.security.AccessControlException unused) {
        }
        return false;
    }

    private static java.lang.String valueOf(final java.lang.String str) {
        java.lang.String str2 = (java.lang.String) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: com.payair.hce.ensurePlayServicesAvailable.3
            private static int valueOf = 1;
            private static int values;

            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
                return DigitizedCardProfile(objArr);
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                com.payair.hce.ensurePlayServicesAvailable.AnonymousClass3 anonymousClass3 = (com.payair.hce.ensurePlayServicesAvailable.AnonymousClass3) objArr[0];
                int i = valueOf;
                int i2 = (i ^ 83) + ((i & 83) << 1);
                values = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                java.util.Map map = (java.util.Map) com.payair.hce.ensurePlayServicesAvailable.writeReplace.get();
                if (map == null) {
                    java.lang.String property = java.lang.System.getProperty(str);
                    int i3 = valueOf;
                    int i4 = i3 & 125;
                    values = (i4 + ((i3 ^ 125) | i4)) % 128;
                    return property;
                }
                int i5 = valueOf;
                int i6 = i5 ^ 37;
                int i7 = ((i5 & 37) | i6) << 1;
                int i8 = -i6;
                int i9 = (i7 & i8) + (i7 | i8);
                values = i9 % 128;
                if (i9 % 2 != 0) {
                    map.get(str);
                    throw null;
                }
                java.lang.Object obj = map.get(str);
                int i10 = valueOf;
                int i11 = (i10 | 67) << 1;
                int i12 = -(i10 ^ 67);
                values = ((i11 & i12) + (i12 | i11)) % 128;
                return obj;
            }

            @Override // java.security.PrivilegedAction
            public final java.lang.Object run() {
                return AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 97819967, -97819967, java.lang.System.identityHashCode(this));
            }
        });
        int i = DigitizedCardProfile + 31;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw null;
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int length;
        char[] cArr;
        int i3 = $11 + 1;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr2 = values;
        if (cArr2 != null) {
            int i4 = $10 + 45;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2508 - android.view.View.getDefaultSize(0, 0), (char) ((android.os.Process.myPid() >> 22) + 6802));
                        byte b2 = (byte) (-$$a[1]);
                        byte b3 = (byte) (b2 - 1);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b2, b3, b3, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(valueOf)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 49, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2508, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 6802));
            byte b4 = (byte) (-$$a[1]);
            byte b5 = (byte) (b4 - 1);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(b4, b5, b5, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i6 = $11 + 31;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                i2 = i + 8;
                cArr3[i2] = (char) (charArray[i2] << b);
            } else {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            $10 = ($11 + 115) % 128;
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
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 3596, (char) android.view.Gravity.getAbsoluteGravity(0, 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2666, (char) (18889 - android.text.TextUtils.indexOf("", "", 0)));
                            byte b6 = (byte) ($$a[1] + 1);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(b6, b6, b6, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i7 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i8 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr2[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr2[(i7 * charValue) + i8];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i9 = digitizedCardJson12.DigitizedCardProfile;
                        int i10 = digitizedCardJson12.RecordsJson;
                        int i11 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr2[(i9 * charValue) + i10];
                        cArr3[digitizedCardJson12.values + 1] = cArr2[(i11 * charValue) + i12];
                    } else {
                        int i13 = digitizedCardJson12.DigitizedCardProfile;
                        int i14 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i15 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i16 = digitizedCardJson12.RecordsJson;
                        cArr3[digitizedCardJson12.values] = cArr2[(i13 * charValue) + i14];
                        cArr3[digitizedCardJson12.values + 1] = cArr2[(i15 * charValue) + i16];
                    }
                }
                digitizedCardJson12.values += 2;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr3[i17] = (char) (cArr3[i17] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{126, -1, -74, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
    }

    static void values() {
        values = new char[]{12351, 12335, 12344, 12350};
        valueOf = (char) 1490;
    }
}
