package com.payair.hce;

/* loaded from: classes4.dex */
public final class setRecords extends java.lang.Enum<com.payair.hce.setRecords> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int valueOf;
    private static int values;
    private static java.util.Map<java.lang.Byte, java.lang.Class<? extends com.payair.hce.isMobilePinInitialConfiguration>> writeReplace;

    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = i * 3;
        int i3 = b + 4;
        int i4 = 99 - (s * 4);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i4 = (-i3) + i4;
            i3 = i3;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == 0 - i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = i6;
            i4 = (-bArr[i7]) + i4;
            i3 = i7;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        valueOf = 1;
        valueOf();
        writeReplace = new java.util.HashMap();
        int i = values + 63;
        valueOf = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static void values(byte b, java.lang.Class<? extends com.payair.hce.isMobilePinInitialConfiguration> cls) {
        int i = valueOf + 39;
        values = i % 128;
        if (i % 2 == 0) {
            if (writeReplace.containsKey(java.lang.Byte.valueOf(b))) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(android.graphics.Color.rgb(0, 0, 0) + 16777216, (char) android.graphics.Color.blue(0), 49 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr);
                throw new com.payair.hce.register(java.lang.String.format(((java.lang.String) objArr[0]).intern(), java.lang.Byte.valueOf(b)));
            }
            writeReplace.put(java.lang.Byte.valueOf(b), cls);
            int i2 = valueOf + 35;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        writeReplace.containsKey(java.lang.Byte.valueOf(b));
        throw new java.lang.ArithmeticException();
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $10 = ($11 + 11) % 128;
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 48, 380 - android.os.Process.getGidForName(""), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) -1, (short) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 3966 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 34, (android.view.ViewConfiguration.getTouchSlop() >> 8) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 34, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            $11 = ($10 + 11) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public static com.payair.hce.isMobilePinInitialConfiguration AlternateContactlessPaymentDataJson(byte[] bArr, com.payair.hce.setMaximumPinTry setmaximumpintry) throws com.payair.hce.getAtcCount {
        int i = values + 7;
        valueOf = i % 128;
        try {
            if (i % 2 != 0) {
                com.payair.hce.isMobilePinInitialConfiguration newInstance = writeReplace.get(java.lang.Byte.valueOf(bArr[com.payair.hce.setPpseFci.values])).newInstance();
                int i2 = values + 5;
                valueOf = i2 % 128;
                try {
                    if (i2 % 2 != 0) {
                        newInstance.values(bArr, setmaximumpintry);
                        return newInstance;
                    }
                    newInstance.values(bArr, setmaximumpintry);
                    throw new java.lang.ArithmeticException();
                } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                    throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getQ);
                }
            }
            writeReplace.get(java.lang.Byte.valueOf(bArr[com.payair.hce.setPpseFci.values])).newInstance();
            throw new java.lang.NullPointerException();
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.NullPointerException unused2) {
            throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getContent);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException unused3) {
            com.payair.hce.setMaximumPinTry.valueOf();
            android.view.ViewConfiguration.getJumpTapTimeout();
            android.graphics.Color.blue(0);
            android.view.ViewConfiguration.getScrollBarSize();
            throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl);
        }
    }

    static void init$0() {
        $$a = new byte[]{125, com.google.common.base.Ascii.SI, -77, -54};
        $$b = 171;
    }

    static void valueOf() {
        AlternateContactlessPaymentDataJson = new char[]{24294, 52699, 30856, 59169, 4706, 48829, 11713, 22625, 51039, 29636, 40583, 3491, 47218, 10044, 21479, 65200, 27951, 38919, 1246, 45958, 56910, 19742, 63527, 25852, 37805, 15968, 44335, 55697, 17566, 62291, 7747, 35546, 14780, 42144, 54123, 32305, 60136, 6591, 33863, 13084, 24539, 51878, 31044, 58492, 4922, 49148, 10925, 22893, 50236, 8586, 45707, 1994, 38931, 27995, 49560, 21155, 10045, 47200, 3317, 57850, 29394, 50964, 22596, 11412, 33239, 4703, 59249, 31651, 52468, 41335, 12894, 34636, 7044, 60610, 16660, 53845, 42661, 15271, 35845, 24946, 62903, 18171, 56265, 44046, 323, 38359, 26331, 64300, 19579, 8431, 46550, 1654, 39712, 27767, 49321, 21990};
        DigitizedCardProfile = 6376609950237642133L;
    }
}
