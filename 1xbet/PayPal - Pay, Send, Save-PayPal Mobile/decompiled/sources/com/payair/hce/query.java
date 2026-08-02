package com.payair.hce;

/* loaded from: classes4.dex */
public final class query implements com.payair.hce.findFragmentById {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static char valueOf;
    private static int values;
    private static char[] writeReplace;
    private com.payair.hce.compileStatement AlternateContactlessPaymentDataJson;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 1 - (s * 4);
        int i4 = (b * 8) + 65;
        byte[] bArr = $$a;
        int i5 = 4 - (b2 * 3);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            i4 = i5;
            i2 = 0;
            i5++;
            i4 += -i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i5++;
            i4 += -i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    @Override // com.payair.hce.findFragmentById
    public final void values(boolean z, com.payair.hce.getMCallbacksannotations getmcallbacksannotations) {
        int i = DigitizedCardProfile + 99;
        values = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (this.AlternateContactlessPaymentDataJson == null) {
            this.AlternateContactlessPaymentDataJson = new com.payair.hce.compileStatement();
        }
        this.AlternateContactlessPaymentDataJson.values(z, getmcallbacksannotations);
        DigitizedCardProfile = (values + 117) % 128;
    }

    @Override // com.payair.hce.findFragmentById
    public final int DigitizedCardProfile() {
        values = (DigitizedCardProfile + 43) % 128;
        int writeReplace2 = this.AlternateContactlessPaymentDataJson.writeReplace();
        DigitizedCardProfile = (values + 85) % 128;
        return writeReplace2;
    }

    @Override // com.payair.hce.findFragmentById
    public final int values() {
        int i = values + 101;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson();
            throw null;
        }
        int AlternateContactlessPaymentDataJson = this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson();
        int i2 = values + 63;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            return AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    @Override // com.payair.hce.findFragmentById
    public final byte[] writeReplace(byte[] bArr, int i, int i2) {
        DigitizedCardProfile = (values + 53) % 128;
        com.payair.hce.compileStatement compilestatement = this.AlternateContactlessPaymentDataJson;
        if (compilestatement == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u000e\u000b\u0006\f\u000b\u0004\u0007\u000f\u0004\u000b\u000f\u0006\u0005\u000e\u000f\n\u000b\u000f\u000f\t\u0004\u0000\t\u0003\t\u0004", 27 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        byte[] DigitizedCardProfile2 = compilestatement.DigitizedCardProfile((java.math.BigInteger) com.payair.hce.compileStatement.writeReplace(new java.lang.Object[]{compilestatement, compilestatement.writeReplace(bArr, i, i2)}, -1511920445, 1511920445, java.lang.System.identityHashCode(compilestatement)));
        DigitizedCardProfile = (values + 49) % 128;
        return DigitizedCardProfile2;
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        if (str != null) {
            $11 = ($10 + 41) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = writeReplace;
        int i3 = 8;
        int i4 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 50, (android.view.ViewConfiguration.getScrollBarSize() >> i3) + 2508, (char) (android.text.TextUtils.indexOf("", "") + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, (short) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr4[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = 8;
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
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        long j = 0;
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 2509 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (6801 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((byte) 0, (short) 0, (byte) 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        char c = 2;
        if (i % 2 != 0) {
            int i6 = $10 + 73;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                i2 = i + 63;
                cArr5[i2] = (char) (cArr2[i2] * b);
            } else {
                i2 = i - 1;
                cArr5[i2] = (char) (cArr2[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                $10 = ($11 + 99) % 128;
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[13];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[8] = java.lang.Integer.valueOf(charValue);
                    objArr6[7] = digitizedCardJson12;
                    objArr6[6] = digitizedCardJson12;
                    objArr6[5] = java.lang.Integer.valueOf(charValue);
                    objArr6[4] = digitizedCardJson12;
                    objArr6[3] = digitizedCardJson12;
                    objArr6[c] = java.lang.Integer.valueOf(charValue);
                    objArr6[1] = digitizedCardJson12;
                    objArr6[i4] = digitizedCardJson12;
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(i4) + 29, 3596 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((android.os.Process.getElapsedCpuTime() > j ? 1 : (android.os.Process.getElapsedCpuTime() == j ? 0 : -1)) - 1))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $11 = ($10 + 71) % 128;
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2666, (char) (18889 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                            byte b2 = (byte) ($$b & 5);
                            byte b3 = (byte) (b2 - 1);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(b2, b3, b3, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i7 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i8 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i7 * charValue) + i8];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i9 = digitizedCardJson12.DigitizedCardProfile;
                        int i10 = digitizedCardJson12.RecordsJson;
                        int i11 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[(i9 * charValue) + i10];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i11 * charValue) + i12];
                    } else {
                        int i13 = digitizedCardJson12.DigitizedCardProfile;
                        int i14 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i15 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i16 = digitizedCardJson12.RecordsJson;
                        cArr5[digitizedCardJson12.values] = cArr3[(i13 * charValue) + i14];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i15 * charValue) + i16];
                    }
                }
                digitizedCardJson12.values += 2;
                $10 = ($11 + 77) % 128;
                c = 2;
                i4 = 0;
                j = 0;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr5[i17] = (char) (cArr5[i17] ^ 13722);
        }
        java.lang.String str2 = new java.lang.String(cArr5);
        $10 = ($11 + 13) % 128;
        objArr[0] = str2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        DigitizedCardProfile = 1;
        writeReplace = new char[]{12331, 12345, 12332, 12333, 12299, 12334, 12325, 12324, 12335, 13264, 12313, 12323, 12326, 12350, 12394, 12312};
        valueOf = (char) 1492;
    }

    static void init$0() {
        $$a = new byte[]{46, -52, 83, 98};
        $$b = 155;
    }
}
