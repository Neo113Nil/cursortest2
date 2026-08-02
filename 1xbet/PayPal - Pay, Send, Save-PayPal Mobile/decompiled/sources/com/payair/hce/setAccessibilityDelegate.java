package com.payair.hce;

/* loaded from: classes4.dex */
public final class setAccessibilityDelegate extends java.io.ObjectInputStream {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int valueOf;
    private static char[] values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = s2 * 2;
        int i3 = 111 - (s * 2);
        int i4 = (b * 4) + 4;
        byte[] bArr2 = new byte[1 - i2];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            i3 += -i4;
            i4 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i3;
            if (i == 0 - i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i + 1;
            i5 = i4;
            i4 = bArr[i4];
            i6 = i7;
            i3 += -i4;
            i4 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i3;
            if (i == 0 - i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == 0 - i2) {
            }
        }
    }

    public setAccessibilityDelegate(java.io.InputStream inputStream) throws java.io.IOException {
        super(inputStream);
    }

    @Override // java.io.ObjectInputStream
    protected final java.lang.Class<?> resolveClass(java.io.ObjectStreamClass objectStreamClass) throws java.io.IOException, java.lang.ClassNotFoundException {
        if (!objectStreamClass.getName().equals(com.payair.hce.setImportantForAutofill.class.getName()) && !objectStreamClass.getName().equals(com.payair.hce.setOnHoverListener.class.getName())) {
            valueOf = (writeReplace + 59) % 128;
            if (!objectStreamClass.getName().equals(com.payair.hce.setAccessibilityPaneTitle.class.getName())) {
                writeReplace = (valueOf + 75) % 128;
                if (!objectStreamClass.getName().equals(com.payair.hce.setOnKeyListener.class.getName()) && !objectStreamClass.getName().equals(com.payair.hce.setAutofillId.class.getName()) && !objectStreamClass.getName().equals(com.payair.hce.setContentCaptureSession.class.getName())) {
                    writeReplace = (valueOf + 9) % 128;
                    if (!objectStreamClass.getName().equals(com.payair.hce.setOnReceiveContentListener.class.getName()) && !objectStreamClass.getName().equals(com.payair.hce.setImportantForContentCapture.class.getName())) {
                        int i = valueOf + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        writeReplace = i % 128;
                        if (i % 2 != 0) {
                            objectStreamClass.getName().equals(com.payair.hce.setStateDescription.class.getName());
                            throw null;
                        }
                        if (!objectStreamClass.getName().equals(com.payair.hce.setStateDescription.class.getName()) && !objectStreamClass.getName().equals(com.payair.hce.setOnDragListener.class.getName()) && !objectStreamClass.getName().equals(com.payair.hce.setRevealOnFocusHint.class.getName()) && !objectStreamClass.getName().equals(java.lang.String[].class.getName())) {
                            int i2 = valueOf + 71;
                            writeReplace = i2 % 128;
                            if (i2 % 2 != 0) {
                                objectStreamClass.getName().equals(byte[].class.getName());
                                throw new java.lang.ArithmeticException();
                            }
                            if (!objectStreamClass.getName().equals(byte[].class.getName()) && !objectStreamClass.getName().equals(com.payair.hce.setOnDragListener[].class.getName())) {
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                a(new int[]{0, 36, 65, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001", true, objArr);
                                throw new java.io.InvalidClassException(((java.lang.String) objArr[0]).intern(), objectStreamClass.getName());
                            }
                        }
                    }
                }
            }
        }
        java.lang.Class<?> resolveClass = super.resolveClass(objectStreamClass);
        valueOf = (writeReplace + 43) % 128;
        return resolveClass;
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = 1;
        int i8 = iArr[1];
        int i9 = 2;
        int i10 = iArr[2];
        int i11 = iArr[3];
        char[] cArr = values;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                int i13 = $10 + 51;
                $11 = i13 % 128;
                if (i13 % i9 == 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i7];
                        objArr2[i5] = java.lang.Integer.valueOf(cArr[i12]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)) + 2807, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i5, i5)));
                            byte b = (byte) ($$b & 3);
                            byte b2 = (byte) (b - 1);
                            i3 = i10;
                            i4 = length;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b(b, b2, b2, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                        } else {
                            i3 = i10;
                            i4 = length;
                        }
                        cArr2[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i12--;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    i3 = i10;
                    i4 = length;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr[i12])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2807 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.text.TextUtils.getTrimmedLength(""));
                        byte b3 = (byte) ($$b & 3);
                        byte b4 = (byte) (b3 - 1);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(b3, b4, b4, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj2);
                    }
                    cArr2[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i12++;
                }
                length = i4;
                i10 = i3;
                i5 = 0;
                i7 = 1;
                i9 = 2;
            }
            i = i10;
            cArr = cArr2;
        } else {
            i = i10;
        }
        char[] cArr3 = new char[i8];
        java.lang.System.arraycopy(cArr, i6, cArr3, 0, i8);
        if (bArr2 != null) {
            $10 = ($11 + 91) % 128;
            char[] cArr4 = new char[i8];
            getaccounttype.writeReplace = 0;
            $10 = ($11 + 31) % 128;
            char c = 0;
            while (getaccounttype.writeReplace < i8) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i14 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 44, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2836, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((short) 2, (short) 0, (byte) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i14] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i15 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2880 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b((short) 0, (short) 0, (byte) 0, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr4[i15] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 34, 212 - android.text.TextUtils.indexOf("", "", 0, 0), (char) android.view.Gravity.getAbsoluteGravity(0, 0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
                $11 = ($10 + 73) % 128;
            }
            cArr3 = cArr4;
        }
        if (i11 > 0) {
            char[] cArr5 = new char[i8];
            i2 = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i8);
            int i16 = i8 - i11;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i16, i11);
            java.lang.System.arraycopy(cArr5, i11, cArr3, 0, i16);
        } else {
            i2 = 0;
        }
        if (z) {
            char[] cArr6 = new char[i8];
            while (true) {
                getaccounttype.writeReplace = i2;
                if (getaccounttype.writeReplace >= i8) {
                    break;
                }
                cArr6[getaccounttype.writeReplace] = cArr3[(i8 - getaccounttype.writeReplace) - 1];
                i2 = getaccounttype.writeReplace + 1;
            }
            cArr3 = cArr6;
        }
        if (i > 0) {
            getaccounttype.writeReplace = 0;
            $11 = ($10 + 125) % 128;
            while (getaccounttype.writeReplace < i8) {
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        valueOf = 1;
        values = new char[]{16788, 16765, 16737, 16740, 16739, 16763, 16741, 16719, 16710, 16737, 16739, 16737, 16741, 16736, 16764, 16741, 16745, 16744, 16736, 16738, 16739, 16739, 16747, 16717, 16717, 16747, 16766, 16764, 16736, 16767, 16738, 16737, 16763, 16738, 16742, 16748};
    }

    static void init$0() {
        $$a = new byte[]{120, 91, -87, 14};
        $$b = 93;
    }
}
