package com.payair.hce;

/* loaded from: classes4.dex */
final class setHasTransientState implements com.payair.hce.HCEEventListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int RecordsJson;
    private static int getAid;
    private static char valueOf;
    private static char values;
    private static char writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~((~i3) | i2);
        int i6 = ~i;
        switch ((i * (-1939)) + (i2 * 971) + (((~(i | i4)) | i5) * (-970)) + ((~(i2 | i6)) * 1940) + (((~(i6 | i4)) | i5) * 970)) {
            case 1:
                return DigitizedCardProfile(objArr);
            case 2:
                int i7 = RecordsJson;
                int i8 = i7 & 39;
                getAid = (((((i7 ^ 39) | i8) << 1) - (~(-((i7 | 39) & (~i8))))) - 1) % 128;
                return null;
            case 3:
                getAid = ((-2) - (~(RecordsJson + 82))) % 128;
                return null;
            case 4:
                int i9 = RecordsJson;
                int i10 = i9 & 61;
                int i11 = -(-(i9 | 61));
                getAid = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
                return null;
            case 5:
                int i12 = RecordsJson;
                int i13 = i12 & 101;
                getAid = (i13 + ((i12 ^ 101) | i13)) % 128;
                return null;
            case 6:
                int i14 = RecordsJson;
                int i15 = i14 & 5;
                getAid = (i15 + ((i14 ^ 5) | i15)) % 128;
                return null;
            case 7:
                return values(objArr);
            case 8:
                return writeReplace(objArr);
            case 9:
                return AlternateContactlessPaymentDataJson(objArr);
            case 10:
                int i16 = getAid + 20;
                RecordsJson = ((~i16) + (i16 << 1)) % 128;
                return null;
            case 11:
                return getProfileVersion(objArr);
            case 12:
                int i17 = RecordsJson;
                getAid = (((i17 & (-86)) | ((~i17) & 85)) + ((i17 & 85) << 1)) % 128;
                return null;
            case 13:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 14:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 15:
                int i18 = RecordsJson;
                getAid = ((((i18 ^ 25) | (i18 & 25)) << 1) - ((i18 & (-26)) | ((~i18) & 25))) % 128;
                return null;
            case 16:
                return null;
            case 17:
                getAid = (RecordsJson + 117) % 128;
                return null;
            case 18:
                int i19 = RecordsJson;
                int i20 = i19 & 7;
                int i21 = (i19 ^ 7) | i20;
                getAid = ((i20 & i21) + (i21 | i20)) % 128;
                return null;
            case 19:
                int i22 = RecordsJson;
                getAid = ((i22 ^ 11) + ((i22 & 11) << 1)) % 128;
                return null;
            case 20:
                int i23 = getAid;
                int i24 = (i23 | 93) << 1;
                int i25 = -(i23 ^ 93);
                RecordsJson = ((i24 & i25) + (i25 | i24)) % 128;
                return null;
            case 21:
                return getAid(objArr);
            case 22:
                return RecordsJson(objArr);
            case 23:
                getAid = (RecordsJson + 61) % 128;
                return null;
            case 24:
                RecordsJson = (getAid + 57) % 128;
                return null;
            case 25:
                int i26 = getAid + 74;
                RecordsJson = ((~i26) + (i26 << 1)) % 128;
                return null;
            case 26:
                int i27 = RecordsJson;
                int i28 = i27 & 97;
                getAid = (((i27 | 97) & (~i28)) + (i28 << 1)) % 128;
                return null;
            case 27:
                return getCiacDecline(objArr);
            case 28:
                int i29 = RecordsJson;
                int i30 = (i29 & 73) + (i29 | 73);
                getAid = i30 % 128;
                return java.lang.Boolean.valueOf(i30 % 2 == 0);
            default:
                return valueOf(objArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = b2 * 2;
        int i4 = (s * 5) + 110;
        byte[] bArr = $$g;
        ?? r5 = 4 - (b * 2);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            byte b3 = r5;
            i = 0;
            int i5 = r5;
            i4 += b3;
            i2 = i5 + 1;
            bArr2[i] = (byte) i4;
            if (i == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b3 = bArr[i2];
            i++;
            i5 = i2;
            i4 += b3;
            i2 = i5 + 1;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        } else {
            i = 0;
            i2 = r5;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        }
    }

    private static void b(short s, byte b, int i, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = 118 - (i * 50);
        int i3 = 23 - (b * 19);
        int i4 = s * 14;
        byte[] bArr2 = new byte[i4 + 6];
        int i5 = i4 + 5;
        int i6 = -1;
        if (bArr == null) {
            i2 = i2 + (-i5) + 2;
            i3++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i2 = i2 + (-bArr[i3]) + 2;
                i3++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = i + 65;
        int i5 = 66 - b2;
        int i6 = 35 - b;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            i3 = 0;
            int i9 = (i5 + (-i7)) - 1;
            i2 = i3;
            int i10 = i8;
            i4 = i9;
            i5 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i5 + 1;
            i7 = bArr[i11];
            int i12 = i4;
            i8 = i11;
            i5 = i12;
            int i92 = (i5 + (-i7)) - 1;
            i2 = i3;
            int i102 = i8;
            i4 = i92;
            i5 = i102;
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

    setHasTransientState() {
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i = RecordsJson;
        int i2 = ((i ^ 6) + ((i & 6) << 1)) - 1;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i = getAid + 105;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int i = RecordsJson;
        int i2 = i ^ 59;
        int i3 = ((i & 59) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i3 | i4);
        getAid = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCiacDecline(java.lang.Object[] objArr) {
        int i = getAid;
        int i2 = (i & (-54)) | ((~i) & 53);
        int i3 = (i & 53) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        RecordsJson = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 109) % 128;
            cArr = str.toCharArray();
            $10 = ($11 + 69) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        $10 = ($11 + 107) % 128;
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(writeReplace)};
                    int i4 = c2 + i2;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 62, android.text.TextUtils.getTrimmedLength("") + 1335, (char) (android.os.Process.myTid() >> 22));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a((byte) 0, (byte) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(values)};
                    int i5 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1336 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a((byte) 0, (byte) 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.text.TextUtils.indexOf("", "", 0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 3543, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr3, 0, i);
        $10 = ($11 + 119) % 128;
        objArr[0] = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0965  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        android.content.Context context;
        java.lang.String str;
        int intValue;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.String str2;
        java.lang.Object[] objArr2;
        int i;
        int i2;
        java.lang.Object invoke;
        int i3 = 0;
        com.payair.hce.setHasTransientState sethastransientstate = (com.payair.hce.setHasTransientState) objArr[0];
        int i4 = RecordsJson + 116;
        int i5 = (~i4) + (i4 << 1);
        getAid = i5 % 128;
        if (i5 % 2 == 0) {
            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 51, android.view.KeyEvent.normalizeMetaState(0) + 584, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 24292));
            byte b = (byte) (-$$a[20]);
            byte b2 = b;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b(b, b2, b2, objArr3);
            cls.getField((java.lang.String) objArr3[0]).getLong(null);
            throw new java.lang.ArithmeticException();
        }
        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 51, android.graphics.Color.argb(0, 0, 0, 0) + 584, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24291));
        byte[] bArr = $$a;
        byte b3 = (byte) (-bArr[20]);
        byte b4 = b3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b(b3, b4, b4, objArr4);
        long j = cls2.getField((java.lang.String) objArr4[0]).getLong(null);
        try {
            try {
                if (j != -1) {
                    int i6 = RecordsJson;
                    int i7 = (i6 | 121) << 1;
                    int i8 = -((i6 & (-122)) | ((~i6) & 121));
                    getAid = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
                    int i9 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int identityHashCode = java.lang.System.identityHashCode(sethastransientstate);
                    int i10 = i9 * (-518);
                    int i11 = i10 ^ (-11396);
                    int i12 = ((((i10 & (-11396)) | i11) << 1) - (~(-i11))) - 1;
                    int i13 = ~i9;
                    int i14 = i13 & (i13 | i9);
                    int i15 = ~identityHashCode;
                    int i16 = ~((i14 ^ i15) | (i14 & i15));
                    int i17 = ((~i16) & 22) | (i16 & (-23));
                    int i18 = i16 & 22;
                    int i19 = -(-(((i17 ^ i18) | (i17 & i18)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                    int i20 = (((~i19) & i12) | ((~i12) & i19)) + ((i19 & i12) << 1);
                    int i21 = (i15 | identityHashCode) & i15;
                    int i22 = ((~i21) & i13) | ((~i13) & i21);
                    int i23 = i21 & i13;
                    int i24 = (i23 ^ i22) | (i23 & i22);
                    int i25 = i24 & 22;
                    int i26 = (i24 | 22) & (~i25);
                    int i27 = ~((i26 ^ i25) | (i26 & i25));
                    int i28 = (i9 & (-23)) | (i13 & 22);
                    int i29 = i9 & 22;
                    int i30 = (i28 ^ i29) | (i28 & i29);
                    int i31 = (i30 ^ identityHashCode) | (i30 & identityHashCode);
                    int i32 = ~i31;
                    int i33 = (i31 | i32) & i32;
                    int i34 = ((i27 ^ i33) | (i27 & i33)) * (-519);
                    int i35 = i20 & i34;
                    int i36 = ((i20 ^ i34) | i35) << 1;
                    int i37 = -((i34 | i20) & (~i35));
                    int i38 = (i36 & i37) + (i37 | i36);
                    int i39 = identityHashCode & 22;
                    int i40 = (~i39) & (identityHashCode | 22);
                    int i41 = (i39 ^ i40) | (i39 & i40);
                    int i42 = ~i41;
                    int i43 = (i41 | i42) & i42;
                    int i44 = i9 & i43;
                    int i45 = (i43 | i9) & (~i44);
                    int i46 = -(-(((i45 ^ i44) | (i45 & i44)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                    int i47 = i38 & i46;
                    int i48 = -(-(i46 | i38));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c("짿痝瓊劍掷锁㲊鲯딜湜ﶊ覕濩耫様⹍쫼詒ꖜ\ue1ec\udacc魎", (i47 ^ i48) + ((i48 & i47) << 1), objArr5);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                    int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c("쳸\u09ff㢯ᣆ\uf693샴럈\uea33諮㜗Ꞗ㛌\u0d97\uf488韈捗", ((fadingEdgeLength | 15) << 1) - (fadingEdgeLength ^ 15), objArr6);
                    if (j + 1855 >= ((java.lang.Long) cls3.getDeclaredMethod((java.lang.String) objArr6[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                        int i49 = getAid;
                        int i50 = (i49 ^ 115) + ((i49 & 115) << 1);
                        RecordsJson = i50 % 128;
                        if (i50 % 2 != 0) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 584, (char) ((android.os.Process.myPid() >> 22) + 24291));
                            byte b5 = bArr[6];
                            byte b6 = b5;
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b(b5, b6, b6, objArr7);
                            java.lang.Object[] objArr8 = {cls4.getField((java.lang.String) objArr7[0]).get(null), -641939211, 1};
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                            if (obj == null) {
                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.view.KeyEvent.getDeadChar(0, 0), android.text.TextUtils.indexOf("", "", 0, 0) + 4830, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj);
                            }
                            invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr8);
                        } else {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 583 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (24291 - (android.os.Process.myPid() >> 22)));
                            byte b7 = bArr[6];
                            byte b8 = b7;
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b(b7, b8, b8, objArr9);
                            java.lang.Object[] objArr10 = {cls5.getField((java.lang.String) objArr9[0]).get(null), -641939211, 0};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 30, 4829 - android.view.MotionEvent.axisFromString(""), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj2);
                            }
                            invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr10);
                        }
                        objArr2 = (java.lang.Object[]) invoke;
                        int i51 = getAid + 24;
                        RecordsJson = ((~i51) + (i51 << 1)) % 128;
                        num2 = 0;
                        num = 994792440;
                        str = "valueOf";
                        str2 = "";
                        i = ((int[]) objArr2[1])[0];
                        i2 = ((int[]) objArr2[0])[0];
                        if (i2 != i) {
                            int i52 = getAid;
                            int i53 = i52 & 27;
                            int i54 = (i53 - (~((i52 ^ 27) | i53))) - 1;
                            RecordsJson = i54 % 128;
                            if (i54 % 2 != 0) {
                                java.lang.Object[] objArr11 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[4])[0]), num2};
                                java.lang.Integer num3 = num;
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                if (obj3 == null) {
                                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29, 4830 - android.text.TextUtils.indexOf(str2, str2, 0), (char) android.text.TextUtils.getOffsetAfter(str2, 0))).getMethod(str, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj3);
                                }
                                ((java.lang.reflect.Method) obj3).invoke(null, objArr11);
                            } else {
                                java.lang.String str3 = str;
                                java.lang.Integer num4 = num;
                                java.lang.Object[] objArr12 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[3])[0]), num2};
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                if (obj4 == null) {
                                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 30, 4829 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.view.KeyEvent.keyCodeFromString(str2))).getMethod(str3, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj4);
                                }
                                ((java.lang.reflect.Method) obj4).invoke(null, objArr12);
                            }
                            int i55 = RecordsJson;
                            int i56 = i55 & 113;
                            int i57 = (((i55 | 113) & (~i56)) - (~(-(-(i56 << 1))))) - 1;
                            getAid = i57 % 128;
                            if (i57 % 2 != 0) {
                                return null;
                            }
                            throw new java.lang.ArithmeticException();
                        }
                        java.lang.String str4 = str;
                        java.lang.Integer num5 = num;
                        long j2 = (i & (~i2)) | ((~i) & i2);
                        int i58 = getAid;
                        int i59 = i58 ^ 11;
                        int i60 = ((i58 & 11) | i59) << 1;
                        int i61 = -i59;
                        int i62 = ((i60 ^ i61) + ((i60 & i61) << 1)) % 128;
                        RecordsJson = i62;
                        getAid = ((i62 ^ 29) + ((i62 & 29) << 1)) % 128;
                        try {
                            java.lang.Object[] objArr13 = {java.lang.Long.valueOf(j2 ^ 122740785111105536L), 28578328L};
                            byte[] bArr2 = $$d;
                            byte b9 = bArr2[25];
                            byte b10 = bArr2[86];
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            d(b9, b10, b10, objArr14);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                            byte b11 = bArr2[25];
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            d(b11, b11, b11, objArr15);
                            cls6.getMethod((java.lang.String) objArr15[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr13);
                            java.lang.Object[] objArr16 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[3])[0]), num2};
                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                            if (obj5 == null) {
                                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4829, (char) ((-1) - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod(str4, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj5);
                            }
                            ((java.lang.reflect.Method) obj5).invoke(null, objArr16);
                            int i63 = getAid;
                            RecordsJson = ((-2) - (~(((i63 | 48) << 1) - (i63 ^ 48)))) % 128;
                            return null;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    i3 = 0;
                }
                java.lang.Object[] objArr17 = {context, java.lang.Integer.valueOf(intValue), -641939211};
                byte[] bArr3 = $$d;
                byte b12 = bArr3[89];
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                d(b12, (byte) (b12 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE), bArr3[86], objArr18);
                java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                d(com.google.common.base.Ascii.FS, (byte) 40, (byte) (bArr3[2] - 1), objArr19);
                java.lang.String str5 = (java.lang.String) objArr19[0];
                int i64 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int identityHashCode2 = java.lang.System.identityHashCode(sethastransientstate);
                int i65 = i64 * 465;
                int i66 = (72690 & i65) | ((-72691) & (~i65));
                int i67 = -(-((i65 & (-72691)) << 1));
                int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                int i69 = ~identityHashCode2;
                int i70 = ~i69;
                num = 994792440;
                int i71 = (i70 & (-158)) | (i69 & 157);
                int i72 = i69 & (-158);
                int i73 = ~((i71 ^ i72) | (i71 & i72));
                int i74 = i64 & (-158);
                num2 = 0;
                int i75 = (~i74) & (i64 | (-158));
                int i76 = (i75 & i74) | (i75 ^ i74);
                int i77 = ~i76;
                int i78 = (i76 | i77) & i77;
                int i79 = i73 & i78;
                int i80 = (i78 | i73) & (~i79);
                int i81 = (i80 & i79) | (i80 ^ i79);
                int i82 = ~i64;
                int i83 = (i69 & i82) | (i70 & i64);
                int i84 = i69 & i64;
                int i85 = ~((i84 ^ i83) | (i83 & i84));
                int i86 = -(-(((i81 ^ i85) | (i81 & i85)) * 464));
                int i87 = (i68 ^ i86) + ((i86 & i68) << 1);
                int i88 = -(~(((i82 & identityHashCode2) | (i82 ^ identityHashCode2) | (-158)) * (-464)));
                int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                int i90 = i64 ^ (-158);
                int i91 = ~((i90 ^ i74) | (i90 & i74));
                int i92 = i64 ^ identityHashCode2;
                int i93 = i64 & identityHashCode2;
                int i94 = ~((i93 ^ i92) | (i93 & i92));
                int i95 = i91 & i94;
                int i96 = (i91 | i94) & (~i95);
                int i97 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int identityHashCode3 = java.lang.System.identityHashCode(sethastransientstate);
                int i98 = (i97 * (-381)) + 4608;
                int i99 = ~i97;
                int i100 = -(-(i99 * (-191)));
                int i101 = i98 | i100;
                int i102 = i101 << 1;
                int i103 = -((~(i98 & i100)) & i101);
                int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
                int i105 = identityHashCode3 & 24;
                int i106 = (~i105) & (identityHashCode3 | 24);
                int i107 = ~((i105 ^ i106) | (i105 & i106));
                int i108 = (i99 & i107) | ((~i107) & i97);
                int i109 = i97 & i107;
                int i110 = -(-(((i109 ^ i108) | (i109 & i108)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                int i111 = i104 & i110;
                int i112 = ((i104 ^ i110) | i111) << 1;
                int i113 = -((i110 | i104) & (~i111));
                int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                int i115 = i99 ^ 24;
                int i116 = i99 & 24;
                int i117 = ~((i115 ^ i116) | (i116 & i115));
                int i118 = ~identityHashCode3;
                int i119 = (identityHashCode3 | i118) & i118;
                int i120 = ~((i119 ^ 24) | (i119 & 24));
                int i121 = i117 & i120;
                int i122 = (i117 | i120) & (~i121);
                int i123 = ((i122 ^ i121) | (i122 & i121)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                int i124 = ((~i123) & i114) | ((~i114) & i123);
                int i125 = (i123 & i114) << 1;
                int i126 = (-(-(android.view.KeyEvent.getMaxKeyCode() >> 16))) & 19;
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                e((~i89) + (i89 << 1) + (((i96 ^ i95) | (i96 & i95)) * 464), (i124 ^ i125) + ((i125 & i124) << 1), "\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r", false, (i126 - (~((r12 ^ 19) | i126))) - 1, objArr20);
                java.lang.Object[] objArr21 = (java.lang.Object[]) cls7.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr20[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr17);
                if (context != null) {
                    RecordsJson = (getAid + 81) % 128;
                    str2 = "";
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 51, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 584, (char) (android.text.TextUtils.indexOf(str2, str2, 0, 0) + 24291));
                    byte b13 = bArr[6];
                    byte b14 = b13;
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    b(b13, b14, b14, objArr22);
                    cls8.getField((java.lang.String) objArr22[0]).set(null, objArr21);
                    try {
                        try {
                            int i127 = -(android.os.Process.myPid() >> 22);
                            int identityHashCode4 = java.lang.System.identityHashCode(sethastransientstate);
                            int i128 = i127 * (-167);
                            int i129 = ~i127;
                            int i130 = (i129 & (-23)) | (i129 ^ (-23));
                            int i131 = ~i130;
                            int i132 = (i130 | i131) & i131;
                            int i133 = ~((identityHashCode4 ^ (-23)) | (identityHashCode4 & (-23)));
                            int i134 = i132 & i133;
                            int i135 = (i132 | i133) & (~i134);
                            int i136 = ((((i128 & (-3674)) - (~(i128 | (-3674)))) - 1) - (~(((i135 ^ i134) | (i135 & i134)) * 336))) - 1;
                            int i137 = (i127 & (-23)) | (i129 & 22);
                            int i138 = i127 & 22;
                            int i139 = (i137 ^ i138) | (i137 & i138);
                            int i140 = ~i139;
                            int i141 = (i139 | i140) & i140;
                            int i142 = ~identityHashCode4;
                            int i143 = (i129 & identityHashCode4) | (i127 & i142);
                            int i144 = i127 & identityHashCode4;
                            int i145 = ~((i143 & i144) | (i143 ^ i144));
                            int i146 = -(-(((i141 ^ i145) | (i141 & i145)) * (-168)));
                            int i147 = i136 & i146;
                            int i148 = i147 + ((i146 ^ i136) | i147);
                            int i149 = (identityHashCode4 | i142) & i142;
                            int i150 = i149 ^ i127;
                            int i151 = i127 & i149;
                            int i152 = ~((i151 ^ i150) | (i151 & i150));
                            int i153 = i152 ^ (-23);
                            int i154 = i152 & (-23);
                            int i155 = -(-(((i154 ^ i153) | (i154 & i153)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            c("짿痝瓊劍掷锁㲊鲯딜湜ﶊ覕濩耫様⹍쫼詒ꖜ\ue1ec\udacc魎", (i148 & i155) + (i155 | i148), objArr23);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            int indexOf = android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int identityHashCode5 = java.lang.System.identityHashCode(sethastransientstate);
                            int i156 = indexOf * (-244);
                            int i157 = (i156 & 3937) + (i156 | 3937);
                            int i158 = (~i157) + (i157 << 1);
                            int i159 = ~identityHashCode5;
                            int i160 = i159 ^ (-17);
                            int i161 = i159 & (-17);
                            int i162 = ~(i160 | i161);
                            int i163 = indexOf & (-17);
                            int i164 = (~i163) & (indexOf | (-17));
                            int i165 = (i163 ^ i164) | (i163 & i164);
                            int i166 = ~i165;
                            int i167 = (i165 | i166) & i166;
                            int i168 = i162 ^ i167;
                            int i169 = i162 & i167;
                            int i170 = ((i169 ^ i168) | (i169 & i168)) * (-245);
                            int i171 = (i158 ^ i170) + ((i158 & i170) << 1);
                            int i172 = (identityHashCode5 & 16) | i161;
                            int i173 = identityHashCode5 & (-17);
                            int i174 = ~((i173 ^ i172) | (i172 & i173));
                            int i175 = -(~(-(-(i174 * (-245)))));
                            int i176 = ((i171 & i175) + (i175 | i171)) - 1;
                            int i177 = indexOf & i174;
                            int i178 = (i174 | indexOf) & (~i177);
                            int i179 = ((i178 ^ i177) | (i178 & i177)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE;
                            int i180 = (i176 | i179) << 1;
                            int i181 = -(((~i179) & i176) | ((~i176) & i179));
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            c("쳸\u09ff㢯ᣆ\uf693샴럈\uea33諮㜗Ꞗ㛌\u0d97\uf488韈捗", (i180 & i181) + (i181 | i180), objArr24);
                            long longValue = ((java.lang.Long) cls9.getDeclaredMethod((java.lang.String) objArr24[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 51, 584 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (24291 - android.text.TextUtils.getOffsetAfter(str2, 0)));
                            byte b15 = (byte) (-bArr[20]);
                            byte b16 = b15;
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            b(b15, b16, b16, objArr25);
                            cls10.getField((java.lang.String) objArr25[0]).set(null, java.lang.Long.valueOf(longValue));
                            int i182 = getAid;
                            int i183 = i182 & 95;
                            int i184 = (i182 | 95) & (~i183);
                            int i185 = -(-(i183 << 1));
                            RecordsJson = (((i184 | i185) << 1) - (i184 ^ i185)) % 128;
                        } catch (java.lang.Exception unused) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } else {
                    str2 = "";
                }
                objArr2 = objArr21;
                i = ((int[]) objArr2[1])[0];
                i2 = ((int[]) objArr2[0])[0];
                if (i2 != i) {
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
            int i186 = -android.view.Gravity.getAbsoluteGravity(i3, i3);
            int identityHashCode6 = java.lang.System.identityHashCode(sethastransientstate);
            int i187 = i186 * 659;
            int i188 = ((i187 ^ (-17082)) - (~(-(-((i187 & (-17082)) << 1))))) - 1;
            int i189 = ~i186;
            int i190 = ~((i189 ^ 26) | (i189 & 26));
            int i191 = i186 & (-27);
            int i192 = (i186 | (-27)) & (~i191);
            int i193 = ~((i192 ^ i191) | (i192 & i191));
            int i194 = ((~i193) & i190) | ((~i190) & i193);
            int i195 = i190 & i193;
            int i196 = (i195 ^ i194) | (i195 & i194);
            int i197 = ((~identityHashCode6) & i186) | (identityHashCode6 & i189);
            int i198 = i186 & identityHashCode6;
            int i199 = (i197 ^ i198) | (i197 & i198);
            int i200 = ~i199;
            int i201 = (i199 | i200) & i200;
            int i202 = i196 ^ i201;
            int i203 = i196 & i201;
            int i204 = -(-(((i203 ^ i202) | (i203 & i202)) * (-658)));
            int i205 = i188 & i204;
            int i206 = (i189 & (-27)) | (i186 & 26);
            int i207 = i205 + ((i188 ^ i204) | i205) + ((~((i206 ^ i191) | (i206 & i191))) * 658);
            int i208 = ~((i186 ^ (-27)) | i191);
            int i209 = ~((i186 ^ identityHashCode6) | i198);
            int i210 = ((~i209) & i208) | ((~i208) & i209);
            int i211 = i209 & i208;
            int i212 = -(-(((i211 ^ i210) | (i211 & i210)) * 658));
            int i213 = ((i207 ^ i212) | (i207 & i212)) << 1;
            int i214 = -(((~i212) & i207) | ((~i207) & i212));
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            c("짿痝瓊劍掷锁㲊鲯㢯ᣆ낦㇚陵奰꧇飴찤䩻陿\u0adf\udb74\ue071饞\udc29෪섊", (i213 ^ i214) + ((i214 & i213) << 1), objArr26);
            java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr26[0]);
            int i215 = -android.widget.ExpandableListView.getPackedPositionType(0L);
            int i216 = ((~i215) & 18) | (i215 & (-19));
            int i217 = (i215 & 18) << 1;
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            c("\ue20c࣯ᜮᒉ\ue02f㤪媌럊㼛ȁ伯ąྼ햻꧇飴\uf8b8\uf870", ((i216 | i217) << 1) - (i217 ^ i216), objArr27);
            context = (android.content.Context) cls11.getMethod((java.lang.String) objArr27[0], new java.lang.Class[0]).invoke(null, null);
            if (context != null) {
                int i218 = RecordsJson;
                int i219 = i218 & 23;
                int i220 = (i218 ^ 23) | i219;
                getAid = ((i219 ^ i220) + ((i220 & i219) << 1)) % 128;
                context = context.getApplicationContext();
                int i221 = RecordsJson;
                int i222 = ((i221 | 17) << 1) - (i221 ^ 17);
                getAid = i222 % 128;
                if (i222 % 2 == 0) {
                    int i223 = 2 / 2;
                }
            }
            int i224 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            int identityHashCode7 = java.lang.System.identityHashCode(sethastransientstate);
            int i225 = i224 * (-496);
            int i226 = (i225 & (-7440)) + (i225 | (-7440));
            int i227 = ~i224;
            int i228 = i227 ^ (-16);
            int i229 = i227 & (-16);
            int i230 = (i228 ^ i229) | (i228 & i229);
            int i231 = ~i230;
            int i232 = -(-(((i230 | i231) & i231) * 497));
            int i233 = i226 ^ i232;
            int i234 = -(-((i226 & i232) << 1));
            int i235 = (i227 & 15) | ((~i227) & (-16));
            int i236 = (i235 ^ i229) | (i229 & i235);
            int i237 = i236 & identityHashCode7;
            int i238 = (i236 | identityHashCode7) & (~i237);
            int i239 = ~((i238 ^ i237) | (i238 & i237));
            int i240 = ~identityHashCode7;
            int i241 = i240 & (-16);
            str = "valueOf";
            int i242 = (i240 | (-16)) & (~i241);
            int i243 = (i241 ^ i242) | (i242 & i241);
            int i244 = (i243 & i227) | ((~i243) & i224);
            int i245 = i243 & i224;
            int i246 = (i245 ^ i244) | (i245 & i244);
            int i247 = ~i246;
            int i248 = (i246 | i247) & i247;
            int i249 = i239 & i248;
            int i250 = ((i233 & i234) + (i234 | i233)) - (~(-(-((((i239 | i248) & (~i249)) | i249) * 497))));
            int i251 = (~i250) + (i250 << 1);
            int i252 = i227 & i240;
            int i253 = i252 | ((i240 | i227) & (~i252));
            int i254 = ~i253;
            int i255 = (i253 | i254) & i254;
            int i256 = i227 & (i227 | i224);
            int i257 = i256 & 15;
            int i258 = (i256 | 15) & (~i257);
            int i259 = (i258 ^ i257) | (i258 & i257);
            int i260 = ~i259;
            int i261 = (i259 | i260) & i260;
            int i262 = ((~i261) & i255) | ((~i255) & i261);
            int i263 = i261 & i255;
            int i264 = (i263 ^ i262) | (i263 & i262);
            int i265 = (i224 ^ (-16)) | (i224 & (-16));
            int i266 = ~((i265 ^ identityHashCode7) | (i265 & identityHashCode7));
            int i267 = i264 & i266;
            int i268 = -(-((((i266 | i264) & (~i267)) | i267) * 497));
            int i269 = ((~i268) & i251) | ((~i251) & i268);
            int i270 = -(-((i268 & i251) << 1));
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            c("微埧炖\uf29e섺뢿짿痝壖淣핆歿㤵盷캉턺", (i269 ^ i270) + ((i270 & i269) << 1), objArr28);
            java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr28[0]);
            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
            int identityHashCode8 = java.lang.System.identityHashCode(sethastransientstate);
            int i271 = doubleTapTimeout * (-494);
            int i272 = i271 ^ (-7904);
            int i273 = ((((i271 & (-7904)) | i272) << 1) - (~(-i272))) - 1;
            int i274 = ~doubleTapTimeout;
            int i275 = (doubleTapTimeout & (-17)) | (i274 & 16);
            int i276 = doubleTapTimeout & 16;
            int i277 = -(-((~((i275 ^ i276) | (i275 & i276))) * (-495)));
            int i278 = i273 & i277;
            int i279 = (i273 ^ i277) | i278;
            int i280 = ((i278 | i279) << 1) - (i279 ^ i278);
            int i281 = ~identityHashCode8;
            int i282 = -(-((doubleTapTimeout | i281) * 495));
            int i283 = i274 & (i274 | doubleTapTimeout);
            int i284 = (i283 & 16) | ((~i283) & (-17));
            int i285 = i283 & (-17);
            int i286 = ~((i285 ^ i284) | (i285 & i284));
            int i287 = (identityHashCode8 | i281) & i281;
            int i288 = (doubleTapTimeout ^ i287) | (doubleTapTimeout & i287);
            int i289 = ~i288;
            int i290 = (i288 | i289) & i289;
            int i291 = ((~i290) & i286) | ((~i286) & i290);
            int i292 = i290 & i286;
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            c("儑襒\ue02f㤪꧇飴陿\u0adf\uefbf\ud92eꯨ\ue017\uf672䚆趾奘", (((i280 ^ i282) + ((i280 & i282) << 1)) - (~(-(-(((i292 ^ i291) | (i292 & i291)) * 495))))) - 1, objArr29);
            intValue = ((java.lang.Integer) cls12.getMethod((java.lang.String) objArr29[0], java.lang.Object.class).invoke(null, sethastransientstate)).intValue();
            int i293 = getAid;
            int i294 = i293 & 103;
            int i295 = (i293 ^ 103) | i294;
            RecordsJson = ((i294 & i295) + (i294 | i295)) % 128;
            RecordsJson = (((i293 & 66) + (i293 | 66)) - 1) % 128;
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    private static void e(int i, int i2, java.lang.String str, boolean z, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        int i4 = $10 + 97;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr2 = new char[i2];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i2) {
            $10 = ($11 + 125) % 128;
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr2[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i5]), java.lang.Integer.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 43, 2073 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (60038 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a((byte) 0, (byte) 0, (short) 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 53, 3543 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
        if (i3 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
            char[] cArr3 = new char[i2];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i2);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr3, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr2, 0, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            int i6 = $10 + 59;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr = new char[i2];
                digitizedCardJson11.DigitizedCardProfile = 1;
            } else {
                cArr = new char[i2];
                digitizedCardJson11.DigitizedCardProfile = 0;
            }
            while (digitizedCardJson11.DigitizedCardProfile < i2) {
                $11 = ($10 + 101) % 128;
                cArr[digitizedCardJson11.DigitizedCardProfile] = cArr2[(i2 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 52, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 3543, (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            $10 = ($11 + 61) % 128;
            cArr2 = cArr;
        }
        java.lang.String str2 = new java.lang.String(cArr2);
        int i7 = $11 + 51;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        int i = RecordsJson;
        int i2 = i & 29;
        int i3 = i | 29;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getAid = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        int i = getAid;
        int i2 = i & 63;
        int i3 = (i | 63) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        RecordsJson = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        int i = RecordsJson;
        int i2 = i & 107;
        int i3 = (i2 - (~((i ^ 107) | i2))) - 1;
        getAid = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        int i = getAid;
        int i2 = (i & (-6)) | ((~i) & 5);
        int i3 = (i & 5) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        RecordsJson = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i = getAid;
        int i2 = i & 39;
        int i3 = -(-((i ^ 39) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        RecordsJson = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = RecordsJson;
        int i2 = i & 3;
        int i3 = i | 3;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getAid = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static void AlternateContactlessPaymentDataJson() {
        valueOf = (char) 41340;
        values = (char) 28311;
        AlternateContactlessPaymentDataJson = (char) 36350;
        writeReplace = (char) 42272;
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        RecordsJson = 0;
        getAid = 1;
        AlternateContactlessPaymentDataJson();
        DigitizedCardProfile = 1889207128;
        int i = getAid + 29;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.HCEEventListener
    public final boolean ignoreFailedTransaction() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -422558371, 422558399, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onSdkUnregistered() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1902790115, -1902790108, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onUploadUnlockKeys() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -89753284, 89753307, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onDeviceNotSecure() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1181722205, -1181722181, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void sdkTooOldNeedReset() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1281974517, 1281974543, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void transactionCanBeResumed() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1354076712, 1354076712, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onIdentify(boolean z, int i, java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i), str}, -732112147, 732112160, i);
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onSignUser(boolean z, int i, java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i), str}, 1470987006, -1470986992, i);
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onAuthenticateUser(boolean z, int i, java.util.List<java.lang.String> list) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i), list}, 1077039368, -1077039347, i);
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onAuthenticationFailed() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -375422488, 375422505, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onAuthenticationError(int i, java.lang.CharSequence charSequence) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Integer.valueOf(i), charSequence}, -161645290, 161645310, i);
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onShowAuthenticateScreen(boolean z) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, -2134549288, 2134549304, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onUserValidationObtained(androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, authenticationResult}, -1350517200, 1350517222, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onRequestSessionFailed(byte[] bArr, byte[] bArr2, java.lang.Exception exc) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, bArr2, exc}, 535055264, -535055258, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onRequestSessionCompleted() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1069085276, -1069085251, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onTaskStatusFailed(byte[] bArr, byte[] bArr2, java.lang.Exception exc) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, bArr2, exc}, -1181223834, 1181223845, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onTaskStatusCompleted(byte[] bArr) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr}, -301794549, 301794564, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onSystemHealthFailure(byte[] bArr, byte[] bArr2, java.lang.Exception exc) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, bArr2, exc}, -1060328057, 1060328062, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onSystemHealthCompleted() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1856407069, 1856407096, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onDeleteCardFailed(byte[] bArr, byte[] bArr2, byte[] bArr3, java.lang.Exception exc) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, bArr2, bArr3, exc}, 977486589, -977486571, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onDeleteCardCompleted(byte[] bArr) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr}, -1685645029, 1685645037, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onReplenishFailed(byte[] bArr, byte[] bArr2, byte[] bArr3, java.lang.Exception exc) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, bArr2, bArr3, exc}, 1855113179, -1855113177, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onReplenishCompleted(byte[] bArr, int i) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, java.lang.Integer.valueOf(i)}, -1587398964, 1587398973, i);
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onCardProvisionFailure(byte[] bArr, byte[] bArr2, java.lang.Exception exc) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, bArr2, exc}, -1007796487, 1007796488, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onCardProvisionCompleted(byte[] bArr) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr}, -353715935, 353715954, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onTransactionStopped() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 518478326, -518478314, java.lang.System.identityHashCode(this));
    }

    static void init$2() {
        $$g = new byte[]{107, 13, -60, -69};
        $$h = 120;
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onContactlessPaymentAborted(byte[] bArr, com.payair.hce.ContactlessAbortResaon contactlessAbortResaon, java.lang.Exception exc) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, contactlessAbortResaon, exc}, 1930944006, -1930943996, java.lang.System.identityHashCode(this));
    }

    static void init$1() {
        $$d = new byte[]{73, 117, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 43, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -52, -3, -1, -3, -15, -1, 65, 0, -1, com.google.common.base.Ascii.DC4, -12, -10, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.NAK, -24, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -66, -2, 10, -10, com.google.common.base.Ascii.RS, -36, 46, -48, com.google.common.base.Ascii.FF, 3, -20, 14, 32, -30, -20, 18, -2, 0, -19, 13, -44, -9, 14, -14, 3, com.google.common.base.Ascii.FF, -20, 14, 33, -45, 0, -7, 18, -3, -18, 7, 6, -15, -1, 34, -18, -25, com.google.common.base.Ascii.VT, 7, -10, -7, 47, -30, -20, 18, com.google.common.base.Ascii.SYN, -42, 3, 0};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE;
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onContactlessPaymentIncident(byte[] bArr, java.lang.Exception exc) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, exc}, 523981612, -523981608, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{6, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -80, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -35, 4, 0, -9, 13, -15, com.google.common.base.Ascii.ETB, 3, 35, -28, -15, 16, com.google.common.base.Ascii.SYN, -32, 5, com.google.common.base.Ascii.VT, -1, -1, 9, com.google.common.base.Ascii.ETB, -9, -7, 18, -12};
        $$b = 154;
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onContactlessPaymentCompleted(byte[] bArr, boolean z, java.lang.Long l, java.util.Currency currency, byte[] bArr2) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, java.lang.Boolean.valueOf(z), l, currency, bArr2}, -945679775, 945679778, java.lang.System.identityHashCode(this));
    }
}
