package com.payair.hce;

/* loaded from: classes10.dex */
public class setDsrpUmdSessionKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static boolean IccPrivateKeyCrtComponentsJson;
    private static boolean RecordsJson;
    private static int values;
    private static char[] writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "crmCountryCode")
    public java.lang.String DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "additionalCheckTable")
    public java.lang.String valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 65 - (b * 3);
        int i5 = (s * 3) + 4;
        byte[] bArr = $$a;
        int i6 = (i * 4) + 35;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i5++;
            i4 = (i4 + (-i7)) - 2;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i5++;
            i4 = (i4 + (-i7)) - 2;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = (s * 3) + 115;
        int i4 = (i * 4) + 4;
        byte[] bArr = $$d;
        int i5 = s2 * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i3;
            i3 = i6;
            i2 = 0;
            i4++;
            i3 += i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i4];
            i4++;
            i3 += i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    private static void b(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i4 = $11 + 69;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5]), java.lang.Integer.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2073, (char) (60037 - android.view.View.MeasureSpec.getSize(0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(0, (short) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 53, android.text.TextUtils.getCapsMode("", 0, 0) + 3543, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            $10 = ($11 + 57) % 128;
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr4 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr5 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.view.View.resolveSizeAndState(0, 0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3542, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        $11 = ($10 + 125) % 128;
        objArr[0] = str2;
    }

    private static void c(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = writeReplace;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 46, android.text.TextUtils.getOffsetBefore("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - android.graphics.Color.green(0)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 46, 286 - android.view.KeyEvent.normalizeMetaState(0), (char) (46337 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (IccPrivateKeyCrtComponentsJson) {
            $11 = ($10 + 111) % 128;
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 43, 1630 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d(0, (short) 1, (short) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!RecordsJson) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $10 = ($11 + 125) % 128;
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
                int i3 = $10 + 11;
                $11 = i3 % 128;
                int i4 = i3 % 2;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        $10 = ($11 + 31) % 128;
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.os.Process.myTid() >> 22), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1629, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d(0, (short) 1, (short) 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        values = 1889207116;
        writeReplace = new char[]{10909, 10902, 10887, 10907, 11126, 11132, 11082, 11081, 11123, 10936, 10908, 11135, 11130, 11087, 11121, 10932, 11113, 11119, 11117, 11131, 10934, 11133, 11084, 11072, 11080, 11127, 11112, 11125, 10903, 10899, 11085};
        AlternateContactlessPaymentDataJson = -143185192;
        RecordsJson = true;
        IccPrivateKeyCrtComponentsJson = true;
    }

    static void init$1() {
        $$d = new byte[]{16, 120, -82, 58};
        $$e = 106;
    }

    public static java.lang.Object[] DigitizedCardProfile(android.content.Context context, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 1;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[]{i}, new int[]{i}, null, new int[1]};
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(r2 | (-566333961))) | (~((-67109089) | i))) * 497) - 1235091360) + (((~(i | (-566333961))) | (~((~i) | (-371485937))) | 304376848) * 497))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2713, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                    byte b = (byte) ($$a[14] + 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b, b, b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                return objArr;
            }
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(true, "ￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕ", 136 - android.view.View.getDefaultSize(0, 0), 23 - android.view.View.combineMeasuredStates(0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 39, objArr4);
                java.lang.Object[] objArr5 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr4[0]).intern()), 2);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                c(null, null, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 127, "\u0093\u0092\u0083\u0081\u0090\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0091\u0090\u008f\u008e\u008d\u008c\u008b\u008a\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr6);
                try {
                    java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(true, "ￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕ", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 136, android.graphics.Color.blue(0) + 23, 37 - android.os.Process.getGidForName(""), objArr8);
                    objArr5[0] = java.lang.Class.forName(((java.lang.String) objArr8[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(false, "ￗ￮\ufff9￨￬\u0019\u000f\u001d\u001a\u0014\u000fￋ\uffef\u0010\r \u0012￮￨\u0000\ufffeￗ\ufffa￨￬\u0019\u000f\u001d\u001a\u0014\u000f", 130 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, 31 - android.graphics.Color.blue(0), objArr9);
                    try {
                        java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        b(true, "ￕￚ\u001dￓ\r\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕ", 135 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 25, 39 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr11);
                        objArr5[1] = java.lang.Class.forName(((java.lang.String) objArr11[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                        try {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            c(null, null, android.widget.ExpandableListView.getPackedPositionChild(0L) + 128, "\u0097\u0098\u008c\u0097\u0085\u0088\u0081\u0095\u0097\u0085\u008c\u0097\u0085\u0088\u0096\u0095\u0086\u0089\u0088\u0087\u0086\u0085\u0094", objArr12);
                            java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b(true, "\u0003�\n�￩\u0001\u0003�\u0007\uffff�￬\u0010\u0001\u0003\u000e\u0001", 145 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.graphics.Color.rgb(0, 0, 0) + 16777231, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 17, objArr13);
                            java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null);
                            try {
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                c(null, null, 127 - android.view.KeyEvent.keyCodeFromString(""), "\u0097\u0098\u008c\u0097\u0085\u0088\u0081\u0095\u0097\u0085\u008c\u0097\u0085\u0088\u0096\u0095\u0086\u0089\u0088\u0087\u0086\u0085\u0094", objArr14);
                                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr14[0]).intern());
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                b(true, "\u0004\u0002\n\ufffe￫\u0002\u0004\ufffe\b\u0000\ufffe￭\u0011\u0002", 192 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (-16777215) - android.graphics.Color.rgb(0, 0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 14, objArr15);
                                try {
                                    java.lang.Object[] objArr16 = {cls3.getMethod(((java.lang.String) objArr15[0]).intern(), null).invoke(context, null), 64};
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    c(null, null, android.view.View.combineMeasuredStates(0, 0) + 127, "\u0087\u008c\u008f\u0094\u0085\u0094\u009d\u008c\u008f\u0094\u009c\u0096\u0094\u009b\u0095\u009a\u0099\u0095\u0097\u0085\u008c\u0097\u0085\u0088\u0096\u0095\u0086\u0089\u0088\u0087\u0086\u0085\u0094", objArr17);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr17[0]).intern());
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    b(true, "\u0001\u0003�\u0007\uffff�￬\u0010\u0001\u0003\u000b\u0002\n￥", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 145, android.view.KeyEvent.getDeadChar(0, 0) + 10, 14 - android.text.TextUtils.indexOf("", "", 0, 0), objArr18);
                                    java.lang.Object invoke2 = cls4.getMethod(((java.lang.String) objArr18[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    b(false, "\r\u0013ￍ\u000f\fￍ\uffef\u0000\u0002\n\u0000\u0006\u0004￨\r\u0005\u000e\u0000\r\u0003\u0011\u000e\b\u0003ￍ\u0002\u000e\r\u0013\u0004", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 142, 17 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 31, objArr19);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    b(true, "\ufffa￼\u0006\u0006\ufff8\u0005\b\u0007\ufff4\u0001", 155 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 3 - android.view.KeyEvent.keyCodeFromString(""), 10 - android.text.TextUtils.getCapsMode("", 0, 0), objArr20);
                                    java.lang.Object[] objArr21 = (java.lang.Object[]) cls5.getField(((java.lang.String) objArr20[0]).intern()).get(invoke2);
                                    int length = objArr21.length;
                                    int i6 = 0;
                                    while (i6 < length) {
                                        java.lang.Object obj2 = objArr21[i6];
                                        java.lang.Object[] objArr22 = new java.lang.Object[i5];
                                        b(false, "\u001e\ufff4\ufffb\ufff6\uffff", android.text.TextUtils.getCapsMode("", i4, i4) + 103, android.graphics.Color.alpha(i4) + 5, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4, objArr22);
                                        try {
                                            java.lang.Object[] objArr23 = {((java.lang.String) objArr22[i4]).intern()};
                                            java.lang.Object[] objArr24 = new java.lang.Object[i5];
                                            b(false, "\u0015\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010\u0015ￊ\uffff\u0001\u000e\u0010ￊ\uffdf\u0001\u000e\u0010\u0005\u0002\u0005\uffff�\u0010\u0001￢�\uffff\u0010\u000b\u000e", 145 - android.text.TextUtils.getOffsetBefore("", i4), 1 - (android.os.Process.myTid() >> 22), 37 - android.text.TextUtils.indexOf("", ""), objArr24);
                                            java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr24[i4]).intern());
                                            java.lang.Object[] objArr25 = new java.lang.Object[i5];
                                            c(null, null, (android.os.Process.myTid() >> 22) + 127, "\u008c\u0096\u0085\u0094\u0097\u009f\u0085\u009e\u0097\u008c\u008f", objArr25);
                                            java.lang.String intern = ((java.lang.String) objArr25[i4]).intern();
                                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                                            clsArr[i4] = java.lang.String.class;
                                            java.lang.Object invoke3 = cls6.getMethod(intern, clsArr).invoke(null, objArr23);
                                            try {
                                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                c(null, null, android.view.View.combineMeasuredStates(i4, i4) + 127, "\u008c\u0087\u008e\u0097\u0094\u0085\u008f\u0089\u0093\u0095\u009a\u0099\u0095\u0097\u0085\u008c\u0097\u0085\u0088\u0096\u0095\u0086\u0089\u0088\u0087\u0086\u0085\u0094", objArr26);
                                                java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr26[i4]).intern());
                                                int green = android.graphics.Color.green(i4);
                                                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i4);
                                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                b(true, "\u000b\u000bￚ\ufffe\r\u0012ￛ\b\r\u0012\ufffa", 148 - green, 8 - indexOf, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 11, objArr27);
                                                try {
                                                    java.lang.Object[] objArr28 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod(((java.lang.String) objArr27[0]).intern(), null).invoke(obj2, null))};
                                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                    b(false, "\u0015\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010\u0015ￊ\uffff\u0001\u000e\u0010ￊ\uffdf\u0001\u000e\u0010\u0005\u0002\u0005\uffff�\u0010\u0001￢�\uffff\u0010\u000b\u000e", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 144, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 37, objArr29);
                                                    java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                    b(true, "￼\u0002\uffff\u0002\r\u000b\ufffeￜ\ufffe\r\ufffa\u000b\ufffe\u0007\ufffe\u0000\ufffe\r\ufffa", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 148, 16 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 18 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr30);
                                                    java.lang.Object invoke4 = cls8.getMethod(((java.lang.String) objArr30[0]).intern(), java.io.InputStream.class).invoke(invoke3, objArr28);
                                                    int length2 = objArr5.length;
                                                    int i7 = 0;
                                                    while (i7 < 2) {
                                                        java.lang.Object obj3 = objArr5[i7];
                                                        try {
                                                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                            b(true, "\u0013\u0016\u0004\u0006\u0014ￏ\u0002\u0017\u0002\u000b\u0006\u0015\u0002\u0004\n\u0007\n\u0015\u0013\u0006￤ￚ\uffd1ￖ\ufff9ￏ\u0015\u0013\u0006\u0004ￏ\u001a\u0015\n", 140 - android.text.TextUtils.getOffsetBefore("", 0), 10 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 34 - (android.os.Process.myTid() >> 22), objArr31);
                                                            java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr31[0]).intern());
                                                            java.lang.Object[] objArr32 = objArr21;
                                                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                            b(false, "\uffd1\uffd1\ufff1\u0013\n\u000f\u0004\n\u0011\u0002\r\b\u0006\u0015\ufff4\u0016\u0003\u000b\u0006\u0004\u0015\ufff9ￖ", 140 - android.view.View.resolveSizeAndState(0, 0, 0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, 23 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr33);
                                                            if (obj3.equals(cls9.getMethod(((java.lang.String) objArr33[0]).intern(), null).invoke(invoke4, null))) {
                                                                java.lang.Object[] objArr34 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                                int i8 = (~i) | 35940356;
                                                                try {
                                                                    java.lang.Object[] objArr35 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((i8 * 495) + 1004927499 + (((~i8) | 4) * 495))};
                                                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj4 == null) {
                                                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 50, 2713 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                                        byte b2 = (byte) ($$a[14] + 1);
                                                                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                        a(b2, b2, b2, objArr36);
                                                                        obj4 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                    }
                                                                    ((int[]) objArr34[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr35)).intValue();
                                                                    return objArr34;
                                                                } catch (java.lang.Throwable th) {
                                                                    java.lang.Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            i7++;
                                                            objArr21 = objArr32;
                                                        } catch (java.lang.Throwable th2) {
                                                            java.lang.Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    i6++;
                                                    i4 = 0;
                                                    i5 = 1;
                                                } catch (java.lang.Throwable th3) {
                                                    java.lang.Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    }
                                    i3 = i5;
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                java.lang.Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (java.lang.Throwable th9) {
                        java.lang.Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (java.lang.Throwable th10) {
                    java.lang.Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (java.lang.Throwable unused) {
                i3 = 1;
            }
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            iArr[0] = i;
            iArr2[0] = i;
            java.lang.Object[] objArr37 = {iArr, iArr2, null, new int[i3]};
            java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((~i) | 326817981)) | (-997982144)) * 529) + 36417874 + (((~(i | 326817981)) | (-678111004)) * 529))};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj5 == null) {
                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 50, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2713, (char) android.text.TextUtils.getOffsetAfter("", 0));
                byte b3 = (byte) ($$a[14] + 1);
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                a(b3, b3, b3, objArr39);
                obj5 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
            }
            ((int[]) objArr37[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr38)).intValue();
            return objArr37;
        } catch (java.lang.Throwable th11) {
            java.lang.Throwable cause11 = th11.getCause();
            if (cause11 != null) {
                throw cause11;
            }
            throw th11;
        }
    }

    static void init$0() {
        $$a = new byte[]{65, -108, -120, -80, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
    }
}
