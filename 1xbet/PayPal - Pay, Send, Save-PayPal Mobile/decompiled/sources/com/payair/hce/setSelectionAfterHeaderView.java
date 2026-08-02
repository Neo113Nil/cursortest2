package com.payair.hce;

/* loaded from: classes4.dex */
public final class setSelectionAfterHeaderView implements com.payair.hce.setSelectedGroup {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char DigitizedCardProfile;
    private static char[] valueOf;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (s * 8) + 65;
        byte[] bArr = $$a;
        int i5 = (i * 3) + 1;
        int i6 = 4 - (s2 * 3);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 += i6;
            i6 = i7;
            i2 = i3;
            int i8 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i8;
            i6 = bArr[i8];
            i4 += i6;
            i6 = i7;
            i2 = i3;
            int i82 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            int i822 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        java.lang.Class<?> AlternateContactlessPaymentDataJson;
        java.util.List list = (java.util.List) obj;
        com.payair.hce.setChildIndicator AlternateContactlessPaymentDataJson2 = setongroupexpandlistener.AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("#\f\f\u0003\u001d\u000b", 6 - android.view.KeyEvent.getDeadChar(0, 0), (byte) (113 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr);
        AlternateContactlessPaymentDataJson2.AlternateContactlessPaymentDataJson(((java.lang.String) objArr[0]).intern());
        try {
            try {
                if (cls.getComponentType() != null) {
                    int i = values + 85;
                    writeReplace = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                    AlternateContactlessPaymentDataJson = cls.getComponentType();
                } else {
                    AlternateContactlessPaymentDataJson = setongroupexpandlistener.AlternateContactlessPaymentDataJson(setongroupexpandlistener.AlternateContactlessPaymentDataJson());
                    int i2 = values + 113;
                    writeReplace = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 5 / 4;
                    }
                }
                if (AlternateContactlessPaymentDataJson == null) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(" \u000b㘧㘧\u000e\u001a\u0000\u001c\u0007\u0005\u0017\b\u000b\u0012\u0011\u0014\u001d\u0006\u0010\f㘧㘧\u001c\f\u0000\u0007\u001d\f㘦㘦\f\u000e\u001e\u001b\u001c\u001e\u0002\u0001\u001e\u0012\n\u0002\b\r\u001e\f\u0015\u001d\u0002\u0006\u000b\u0012\u001d\f\u001e\u0006\u000b\u001d\u001b\u0014\u001e\u0012\u0014\u0011\r\u0007\u0003 ", 68 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 61), objArr2);
                    throw new com.payair.hce.setOnGroupCollapseListener(((java.lang.String) objArr2[0]).intern());
                }
                java.lang.Object newInstance = java.lang.reflect.Array.newInstance(AlternateContactlessPaymentDataJson, list.size());
                int i4 = 0;
                while (i4 < list.size()) {
                    java.lang.reflect.Array.set(newInstance, i4, setongroupexpandlistener.writeReplace(list.get(i4), AlternateContactlessPaymentDataJson));
                    i4++;
                    values = (writeReplace + 63) % 128;
                }
                return newInstance;
            } catch (java.lang.ClassNotFoundException e) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a("\u001d\u0001\u001e\u001a\u0007\u0003\u0003\f\u0000\u001a\u0013\u0002\f\u001a\u000e\n\u001a\b\u001d\u0006\u0010\f㘐㘐\u0019\u001a㘐", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28, (byte) (38 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr3);
                throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr3[0]).intern(), setongroupexpandlistener.AlternateContactlessPaymentDataJson(), e.getMessage()), e);
            }
        } finally {
            setongroupexpandlistener.AlternateContactlessPaymentDataJson().writeReplace();
        }
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        char c;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = valueOf;
        long j = 0;
        int i3 = 8;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2508 - (android.view.ViewConfiguration.getScrollBarSize() >> i3), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 6803));
                        byte b2 = $$a[0];
                        byte b3 = b2;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b2, b3, b3, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
                    i3 = 8;
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
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 49, 2508 - android.view.View.getDefaultSize(0, 0), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 6802));
            byte b4 = $$a[0];
            byte b5 = b4;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(b4, b5, b5, objArr5);
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
            char c2 = 5;
            $10 = ($11 + 5) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    $10 = ($11 + 45) % 128;
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    c = c2;
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[13];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[8] = java.lang.Integer.valueOf(charValue);
                    objArr6[7] = digitizedCardJson12;
                    objArr6[6] = digitizedCardJson12;
                    objArr6[c2] = java.lang.Integer.valueOf(charValue);
                    objArr6[4] = digitizedCardJson12;
                    objArr6[3] = digitizedCardJson12;
                    objArr6[2] = java.lang.Integer.valueOf(charValue);
                    objArr6[1] = digitizedCardJson12;
                    objArr6[0] = digitizedCardJson12;
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.text.TextUtils.indexOf("", "", 0, 0), 3596 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $10 = ($11 + 83) % 128;
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 2665 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18888));
                            byte b6 = (byte) ($$b & 1);
                            byte b7 = $$a[0];
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(b6, b7, b7, objArr8);
                            java.lang.String str2 = (java.lang.String) objArr8[0];
                            c = 5;
                            obj4 = cls3.getMethod(str2, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        } else {
                            c = 5;
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i5 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i6 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i5 * charValue) + i6];
                    } else {
                        c = 5;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
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
                }
                digitizedCardJson12.values += 2;
                c2 = c;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr3[i15] = (char) (cArr3[i15] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        values = 1;
        valueOf = new char[]{12351, 12325, 12334, 12321, 12333, 12345, 12344, 12322, 12323, 12297, 13265, 12329, 12327, 12339, 12350, 12326, 12332, 12331, 13266, 13267, 12324, 12387, 12330, 12335, 12394, 12399, 12386, 12347, 12320, 13264, 12348, 12328, 12400, 12388, 12307, 12295};
        DigitizedCardProfile = (char) 1494;
    }

    static void init$0() {
        $$a = new byte[]{0, Byte.MIN_VALUE, -48, 115, 10};
        $$b = 199;
    }
}
