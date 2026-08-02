package com.payair.hce;

/* loaded from: classes4.dex */
public final class setSingleLine implements com.payair.hce.setMinEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int valueOf;
    private static char writeReplace;
    private com.payair.hce.setNavigationContentDescription values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = (i * 8) + 65;
        int i4 = b + 4;
        int i5 = (s * 4) + 1;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i4;
            i2 = 0;
            int i8 = i4 + (-i6);
            i4 = i7;
            i3 = i8;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i4 + 1;
            i6 = bArr[i9];
            i4 = i3;
            i7 = i9;
            int i82 = i4 + (-i6);
            i4 = i7;
            i3 = i82;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i5) {
            }
        }
    }

    setSingleLine(com.payair.hce.setNavigationContentDescription setnavigationcontentdescription) {
        this.values = setnavigationcontentdescription;
    }

    @Override // com.payair.hce.setMinEms
    public final java.io.InputStream values() {
        int i = (AlternateContactlessPaymentDataJson + 3) % 128;
        valueOf = i;
        com.payair.hce.setNavigationContentDescription setnavigationcontentdescription = this.values;
        int i2 = i + 109;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            return setnavigationcontentdescription;
        }
        throw null;
    }

    @Override // com.payair.hce.setTitleTextAppearance
    public final com.payair.hce.setEms RecordsJson() throws java.io.IOException {
        com.payair.hce.setEllipsize setellipsize = new com.payair.hce.setEllipsize(this.values.DigitizedCardProfile());
        valueOf = (AlternateContactlessPaymentDataJson + 73) % 128;
        return setellipsize;
    }

    @Override // com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        int i = AlternateContactlessPaymentDataJson + 81;
        valueOf = i % 128;
        try {
            if (i % 2 == 0) {
                return RecordsJson();
            }
            RecordsJson();
            throw new java.lang.NullPointerException();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\f\u0007\u0006\u0004\u0003\u0005\u0010\u000b\n\r\u0017\n\u0002\n\u0016\u000f\t\u0003\t\u000b\u0000\u000f\u0012\b\t\u0001\r\u0017\u0003\u0012\u0007\u000b\f\u0017\u0010\t\r\u0012\u0013\u0003\u0003\u0013\u0018\u0004㗪", 45 - android.text.TextUtils.getCapsMode("", 0, 0), (byte) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new com.payair.hce.setLines(sb.toString(), e);
        }
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        char c;
        if (str != null) {
            int i3 = $11 + 55;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = DigitizedCardProfile;
        char c2 = 65535;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", "", 0, 0), android.text.TextUtils.getCapsMode("", 0, 0) + 2508, (char) (android.view.View.MeasureSpec.getMode(0) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, 0, (byte) -1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(writeReplace)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        char c3 = 6;
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.KeyEvent.keyCodeFromString(""), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2508, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 6802));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((short) 0, 0, (byte) -1, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = 13;
            $10 = ($11 + 13) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    c = c2;
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[i5];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[8] = java.lang.Integer.valueOf(charValue);
                    objArr6[7] = digitizedCardJson12;
                    objArr6[c3] = digitizedCardJson12;
                    objArr6[5] = java.lang.Integer.valueOf(charValue);
                    objArr6[4] = digitizedCardJson12;
                    objArr6[3] = digitizedCardJson12;
                    objArr6[2] = java.lang.Integer.valueOf(charValue);
                    objArr6[1] = digitizedCardJson12;
                    objArr6[0] = digitizedCardJson12;
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.Process.myPid() >> 22), 3596 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                        java.lang.Class<?>[] clsArr = new java.lang.Class[i5];
                        clsArr[0] = java.lang.Object.class;
                        clsArr[1] = java.lang.Object.class;
                        clsArr[2] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Object.class;
                        clsArr[4] = java.lang.Object.class;
                        clsArr[5] = java.lang.Integer.TYPE;
                        clsArr[c3] = java.lang.Object.class;
                        clsArr[7] = java.lang.Object.class;
                        clsArr[8] = java.lang.Integer.TYPE;
                        clsArr[9] = java.lang.Object.class;
                        clsArr[10] = java.lang.Object.class;
                        clsArr[11] = java.lang.Integer.TYPE;
                        clsArr[12] = java.lang.Object.class;
                        obj3 = cls3.getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = new java.lang.Object[11];
                        objArr7[10] = digitizedCardJson12;
                        objArr7[9] = java.lang.Integer.valueOf(charValue);
                        objArr7[8] = digitizedCardJson12;
                        objArr7[7] = java.lang.Integer.valueOf(charValue);
                        objArr7[c3] = java.lang.Integer.valueOf(charValue);
                        objArr7[5] = digitizedCardJson12;
                        objArr7[4] = digitizedCardJson12;
                        objArr7[3] = java.lang.Integer.valueOf(charValue);
                        objArr7[2] = java.lang.Integer.valueOf(charValue);
                        objArr7[1] = digitizedCardJson12;
                        objArr7[0] = digitizedCardJson12;
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.getOffsetAfter("", 0), 2666 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.KeyEvent.keyCodeFromString("") + 18889));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            c = 65535;
                            b((short) 0, 1, (byte) -1, objArr8);
                            java.lang.String str2 = (java.lang.String) objArr8[0];
                            java.lang.Class<?>[] clsArr2 = new java.lang.Class[11];
                            clsArr2[0] = java.lang.Object.class;
                            clsArr2[1] = java.lang.Object.class;
                            clsArr2[2] = java.lang.Integer.TYPE;
                            clsArr2[3] = java.lang.Integer.TYPE;
                            clsArr2[4] = java.lang.Object.class;
                            clsArr2[5] = java.lang.Object.class;
                            clsArr2[c3] = java.lang.Integer.TYPE;
                            clsArr2[7] = java.lang.Integer.TYPE;
                            clsArr2[8] = java.lang.Object.class;
                            clsArr2[9] = java.lang.Integer.TYPE;
                            clsArr2[10] = java.lang.Object.class;
                            obj4 = cls4.getMethod(str2, clsArr2);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        } else {
                            c = 65535;
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i6 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i7 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i6 * charValue) + i7];
                    } else {
                        c = 65535;
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
                c2 = c;
                c3 = 6;
                i5 = 13;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr5[i16] = (char) (cArr5[i16] ^ 13722);
        }
        java.lang.String str3 = new java.lang.String(cArr5);
        $11 = ($10 + 103) % 128;
        objArr[0] = str3;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        AlternateContactlessPaymentDataJson = 1;
        DigitizedCardProfile = new char[]{12329, 12338, 12293, 12345, 12344, 12334, 12350, 12291, 12335, 12303, 12333, 12346, 12325, 12394, 12323, 13264, 12332, 12348, 12331, 12339, 12324, 12330, 12328, 12327, 12400};
        writeReplace = (char) 1493;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.ETB, -2, 101, 6};
        $$b = 58;
    }
}
