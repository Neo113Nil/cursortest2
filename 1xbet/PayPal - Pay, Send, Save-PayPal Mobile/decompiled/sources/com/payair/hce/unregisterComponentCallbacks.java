package com.payair.hce;

/* loaded from: classes4.dex */
public final class unregisterComponentCallbacks implements com.payair.hce.setPinIvCvc3Track2 {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int valueOf;
    private static char[] values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = i + 4;
        int i5 = s * 2;
        int i6 = (i2 * 2) + 107;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i6 = i5;
            i6 += i7;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i4];
            i6 += i7;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        valueOf = 1;
        values();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 5, 69, 1}, null, true, objArr);
        com.payair.hce.checkPermission.DigitizedCardProfile(((java.lang.String) objArr[0]).intern());
        valueOf = (writeReplace + 105) % 128;
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = 2;
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = values;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 51;
                $11 = i8 % 128;
                if (i8 % i4 == 0) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i7])};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 29, 2807 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.MotionEvent.axisFromString("") + 1));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b(-1, (short) 0, 1, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                        }
                        cArr2[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i7 %= 1;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr[i7])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2808, (char) (android.os.Process.myPid() >> 22));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(-1, (short) 0, 1, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj2);
                    }
                    cArr2[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i7++;
                }
                i4 = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr2 != null) {
            char[] cArr4 = new char[i3];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i3) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43, 2835 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.view.View.MeasureSpec.getMode(0));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b(-1, (short) 0, 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 44, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2880, (char) android.graphics.Color.alpha(0));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b(-1, (short) 0, 2, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 34, android.view.View.resolveSizeAndState(0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i11 = $10 + 23;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                char[] cArr5 = new char[i3];
                java.lang.System.arraycopy(cArr3, 1, cArr5, 1, i3);
                java.lang.System.arraycopy(cArr5, 1, cArr3, i3 >> i6, i6);
                java.lang.System.arraycopy(cArr5, i6, cArr3, 1, i3 % i6);
            } else {
                char[] cArr6 = new char[i3];
                java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i12 = i3 - i6;
                java.lang.System.arraycopy(cArr6, 0, cArr3, i12, i6);
                java.lang.System.arraycopy(cArr6, i6, cArr3, 0, i12);
            }
        }
        if (z) {
            char[] cArr7 = new char[i3];
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i3) {
                int i13 = $10 + 37;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr7[getaccounttype.writeReplace] = cArr3[(i3 % getaccounttype.writeReplace) - 1];
                    i = getaccounttype.writeReplace;
                } else {
                    cArr7[getaccounttype.writeReplace] = cArr3[(i3 - getaccounttype.writeReplace) - 1];
                    i = getaccounttype.writeReplace + 1;
                }
                getaccounttype.writeReplace = i;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            $11 = ($10 + 77) % 128;
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i3) {
                $11 = ($10 + 39) % 128;
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{40, 78, 110, 117};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE;
    }

    static void values() {
        values = new char[]{16732, 16763, 16736, 16739, 16710};
    }
}
