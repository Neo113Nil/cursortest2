package com.payair.hce;

/* loaded from: classes4.dex */
final class setHandwritingBoundsOffsets {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int[] DigitizedCardProfile;
    private static int RecordsJson;
    private static int getProfileVersion;
    private static char[] valueOf;
    private static boolean values;
    private static boolean writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = (i * 4) + 4;
        int i4 = (s * 52) + 66;
        int i5 = (b * 3) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3++;
            i4 += -i6;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i3++;
            i4 += -i6;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        }
    }

    static java.security.cert.Certificate writeReplace(java.lang.String str) throws java.security.cert.CertificateException {
        RecordsJson = (getProfileVersion + 93) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 127, null, null, "\u0081\u0081\u0081\u0081\u0081\u0083\u008a\u008c\u0088\u0085\u008b\u0085\u008a\u0089\u0083\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u0081\u0081\u0081\u0081", objArr);
        java.lang.String replace = str.replace(((java.lang.String) objArr[0]).intern(), "");
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, null, null, "\u0081\u0081\u0081\u0081\u0081\u0083\u008a\u008c\u0088\u0085\u008b\u0085\u008a\u0089\u0083\u0088\u0087\u008d\u0086\u0083\u0081\u0081\u0081\u0081\u0081", objArr2);
        java.lang.String replace2 = replace.replace(((java.lang.String) objArr2[0]).intern(), "");
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, null, null, "\u008e", objArr3);
        java.security.cert.Certificate writeReplace2 = writeReplace(android.util.Base64.decode(replace2.replace(((java.lang.String) objArr3[0]).intern(), ""), 0));
        int i = RecordsJson + 69;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            return writeReplace2;
        }
        throw null;
    }

    private static java.security.cert.Certificate writeReplace(byte[] bArr) throws java.security.cert.CertificateException {
        try {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(android.widget.ExpandableListView.getPackedPositionType(0L) + 127, null, null, "\u0093\u0092\u0091\u0090\u008f", objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                RecordsJson = (getProfileVersion + 27) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    b(new int[]{520225026, 185503243, -717253817, -1498204980, -713909471, -2014579370, -7324376, -1261938150, 1360437993, -1449491528, 276755573, -1066425320, 766837655, 201859074, 1287442308, 492543355, -1731723564, 696849733, -1119917672, 1402384208}, 37 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(new int[]{-1023278177, -1400048703, 1383065500, -2089697036, -1410086753, -1920371952}, 11 - android.graphics.Color.red(0), objArr3);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, intern);
                    getProfileVersion = (RecordsJson + 21) % 128;
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        b(new int[]{520225026, 185503243, -717253817, -1498204980, -713909471, -2014579370, -7324376, -1261938150, 1360437993, -1449491528, 276755573, -1066425320, 766837655, 201859074, 1287442308, 492543355, -1731723564, 696849733, -1119917672, 1402384208}, 38 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(new int[]{1166427384, -1401925611, -123758725, 2039838720, 1901867187, 779203847, 1801601236, 431229006, -735487, 294310418}, 19 - android.graphics.Color.blue(0), objArr5);
                        java.security.cert.Certificate certificate = (java.security.cert.Certificate) cls2.getMethod((java.lang.String) objArr5[0], java.io.InputStream.class).invoke(invoke, byteArrayInputStream);
                        byteArrayInputStream.close();
                        return certificate;
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
            } finally {
            }
        } catch (java.lang.Exception e) {
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(127 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), null, null, "\u0097\u0099\u0094\u009b\u0095\u009d\u0095\u0099\u009c\u0097\u009b\u0087\u0098\u0094\u009a\u0096\u0087\u009a\u0099\u0087\u0098\u0097\u0096\u0095\u0094\u008b", objArr6);
            try {
                java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern(), e};
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(new int[]{520225026, 185503243, -717253817, -1498204980, -713909471, -2014579370, -7324376, -1261938150, 1360437993, -1449491528, 276755573, -1066425320, 766837655, 201859074, -273491662, -2019540902, -675328492, 237514581, 655970334, -1661753060}, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 39, objArr8);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr8[0]).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(objArr7));
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        }
    }

    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = DigitizedCardProfile;
        int i3 = 1;
        char c = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c] = java.lang.Integer.valueOf(iArr3[i4]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 29 - android.view.KeyEvent.keyCodeFromString(""), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i4++;
                    c = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = DigitizedCardProfile;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i5 = 0;
            while (i5 < length3) {
                java.lang.Object[] objArr3 = new java.lang.Object[i3];
                objArr3[0] = java.lang.Integer.valueOf(iArr6[i5]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    i2 = length3;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 27, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 29, (char) android.view.View.combineMeasuredStates(0, 0))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                    i2 = length3;
                }
                iArr7[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i5++;
                iArr6 = iArr2;
                length3 = i2;
                i3 = 1;
            }
            iArr6 = iArr7;
        }
        char c2 = 0;
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[c2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i6 = 0;
            for (int i7 = 16; i6 < i7; i7 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i6];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31, 5088 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i6++;
            }
            int i8 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i8;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i9 = istransitsupported.DigitizedCardProfile;
            int i10 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2923, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 3037));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                c((byte) 0, 0, (short) 0, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            c2 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        $11 = ($10 + 119) % 128;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            int i2 = $11 + 91;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = valueOf;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 46, 286 - android.graphics.Color.alpha(0), (char) (46337 - android.text.TextUtils.getOffsetBefore("", 0)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr4[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $11 = ($10 + 39) % 128;
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (values) {
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $11 = ($10 + 115) % 128;
                cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1629, (char) android.text.TextUtils.indexOf("", ""));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((byte) 0, 0, (short) 1, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!writeReplace) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr6[getumdgeneration.valueOf] = (char) (cArr3[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        $11 = ($10 + 49) % 128;
        getumdgeneration.values = cArr2.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1629 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                c((byte) 0, 0, (short) 1, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        java.lang.String str4 = new java.lang.String(cArr7);
        int i4 = $10 + 77;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str4;
    }

    static void writeReplace() {
        DigitizedCardProfile = new int[]{-735429849, 1464845243, -752169658, 413914546, -180952715, 1038596168, 1064092436, 1842607831, -1626292464, -1798384313, -1248304175, -54314466, 1832868602, -916710656, -1136127551, 305204494, 31526496, 1789728796};
    }

    static void AlternateContactlessPaymentDataJson() {
        valueOf = new char[]{11125, 11096, 11101, 11103, 11089, 11092, 11110, 11099, 11048, 11050, 11100, 11097, 11098, 10896, 11054, 11124, 11085, 11126, 11073, 11065, 11057, 11058, 11069, 11066, 11018, 11063, 11067, 11016, 11068};
        AlternateContactlessPaymentDataJson = -143185274;
        writeReplace = true;
        values = true;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getProfileVersion = 1;
        writeReplace();
        AlternateContactlessPaymentDataJson();
        android.view.ViewConfiguration.getKeyRepeatDelay();
        android.text.TextUtils.indexOf("", "");
        android.graphics.ImageFormat.getBitsPerPixel(0);
        int i = RecordsJson + 79;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void init$0() {
        $$a = new byte[]{98, -72, 105, -100};
        $$b = 71;
    }
}
