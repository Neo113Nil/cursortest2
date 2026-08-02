package com.payair.hce;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class setAccessibilityHeading {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static java.lang.String AlternateContactlessPaymentDataJson;
    private static java.lang.String DigitizedCardProfile;
    private static com.payair.hce.setTextDirection IccPrivateKeyCrtComponentsJson;
    private static com.payair.hce.setZ RecordsJson;
    private static android.content.Context SdkCoreAlternateContactlessPaymentDataImpl;
    private static java.lang.Integer SdkCoreBusinessLogicModuleImpl;
    private static java.lang.String SdkCoreCardRiskManagementDataImpl;
    private static com.payair.hce.setForceDarkAllowed SdkCoreContactlessPaymentDataImpl;
    private static char SdkCoreDigitizedCardProfileImpl;
    private static int build;
    private static boolean buildRecords;
    private static java.lang.String getAdditionalCheckTable;
    private static java.lang.Long getAid;
    private static char getAlternateContactlessPaymentData;
    private static long getApplicationLifeCycleData;
    private static boolean getCardLayoutDescription;
    private static boolean getCardholderValidators;
    private static char[] getCdol1RelatedDataLength;
    private static long getCiacDecline;
    private static char getCiacDeclineOnPpms;
    private static java.lang.Boolean getCrmCountryCode;
    private static boolean getCvmResetTimeout;
    private static java.util.ArrayList<com.payair.hce.setSystemGestureExclusionRects> getCvrMaskAnd;
    private static long getDualTapResetTimeout;
    private static boolean getGpoResponse;
    private static boolean getIccPrivateKeyCrtComponents;
    private static boolean getIssuerApplicationData;
    private static byte[] getMagstripeCvmIssuerOptions;
    private static int getMaximumPinTry;
    private static java.lang.String getMchipCvmIssuerOptions;
    private static java.lang.String getPaymentFci;
    private static int getPinIvCvc3Track2;
    private static java.lang.Object getPpseFci;
    private static java.lang.String getProfileVersion;
    private static char getRecords;
    private static long getSecurityWord;
    private static java.lang.String valueOf;
    private static com.payair.hce.HCEEventListener values;
    private static com.payair.hce.setSoundEffectsEnabled writeReplace;

    private static void a(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2 = 118 - (s * 8);
        int i3 = (i * 4) + 4;
        int i4 = s2 * 3;
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i2 += -i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                int i7 = bArr[i3];
                i3++;
                i2 += -i7;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 115 - i;
        byte[] bArr = $$a;
        int i4 = s + 65;
        byte[] bArr2 = new byte[42 - b];
        int i5 = 41 - b;
        if (bArr == null) {
            i4 = i5;
            int i6 = i3;
            i2 = 0;
            i3++;
            i4 = (i4 + i6) - 2;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i3];
            i3++;
            i4 = (i4 + i6) - 2;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$d;
        int i4 = i + 4;
        ?? r5 = 119 - s;
        byte[] bArr2 = new byte[s2 + 6];
        int i5 = s2 + 5;
        if (bArr == null) {
            byte b = r5;
            int i6 = i5;
            i2 = 0;
            i3 = (i6 + (-b)) - 4;
            i4++;
            bArr2[i2] = i3 == true ? (byte) 1 : (byte) 0;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b = bArr[i4];
            i2++;
            i6 = i3;
            i3 = (i6 + (-b)) - 4;
            i4++;
            bArr2[i2] = i3 == true ? (byte) 1 : (byte) 0;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3 = r5;
            i4++;
            bArr2[i2] = i3 == true ? (byte) 1 : (byte) 0;
            if (i2 == i5) {
            }
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        build = 0;
        getMaximumPinTry = 1;
        getPinAlwaysRequiredIfCurrencyNotProvided();
        SdkCoreIccPrivateKeyCrtComponentsImpl();
        getCvrMaskAnd = null;
        getGpoResponse = true;
        getSecurityWord = 0L;
        getApplicationLifeCycleData = 0L;
        getDualTapResetTimeout = 0L;
        getCardLayoutDescription = false;
        getCvmResetTimeout = false;
        buildRecords = false;
        getCrmCountryCode = null;
        getPpseFci = null;
        int i = build;
        int i2 = i ^ 101;
        int i3 = ((((i & 101) | i2) << 1) - (~(-i2))) - 1;
        getMaximumPinTry = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static com.payair.hce.setForceDarkAllowed getAckAlwaysRequiredIfCurrencyProvided() {
        if (SdkCoreContactlessPaymentDataImpl == null) {
            SdkCoreContactlessPaymentDataImpl = new com.payair.hce.setRight(SdkCoreAlternateContactlessPaymentDataImpl);
            getMaximumPinTry = (build + 77) % 128;
        }
        com.payair.hce.setForceDarkAllowed setforcedarkallowed = SdkCoreContactlessPaymentDataImpl;
        int i = build;
        getMaximumPinTry = (((i & 118) + (i | 118)) - 1) % 128;
        return setforcedarkallowed;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 61;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                $11 = ($10 + 63) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (SdkCoreDigitizedCardProfileImpl ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getRecords)};
                    int i5 = c2 + i3;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 62, android.text.TextUtils.getCapsMode("", 0, 0) + 1335, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a((short) 1, 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (getAlternateContactlessPaymentData ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getCiacDeclineOnPpms)};
                    int i6 = charValue + i3;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(61 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 1335 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a((short) 1, 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i3 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.widget.ExpandableListView.getPackedPositionType(0L), 3543 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            $11 = ($10 + 21) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static /* synthetic */ java.lang.Object getSecurityWord(java.lang.Object[] objArr) {
        int i = build;
        int i2 = i ^ 35;
        int i3 = (i & 35) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getMaximumPinTry = i4 % 128;
        if (i4 % 2 != 0) {
            return values;
        }
        throw null;
    }

    static void values(com.payair.hce.HCEEventListener hCEEventListener) {
        int i = getMaximumPinTry;
        build = ((i & 51) + (i | 51)) % 128;
        values = hCEEventListener;
        int i2 = ((i | 43) << 1) - (i ^ 43);
        build = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void e(java.lang.String str, int[] iArr, int i, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr2 = getCdol1RelatedDataLength;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i2 = 0;
            while (i2 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.view.KeyEvent.keyCodeFromString(""), 286 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (46337 - (android.graphics.PointF.length(f, f) > f ? 1 : (android.graphics.PointF.length(f, f) == f ? 0 : -1))))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr3[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i2++;
                    $10 = ($11 + 83) % 128;
                    f = 0.0f;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getPinIvCvc3Track2)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 46, 286 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (46337 - android.view.View.combineMeasuredStates(0, 0)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getIccPrivateKeyCrtComponents) {
            int i3 = $11 + 77;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                getumdgeneration.values = bArr2.length;
                cArr = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 1;
            } else {
                getumdgeneration.values = bArr2.length;
                cArr = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
            }
            $10 = ($11 + 27) % 128;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr[getumdgeneration.valueOf] = (char) (cArr2[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 1629 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a((short) 0, 0, (short) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr);
            return;
        }
        if (!getIssuerApplicationData) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                int i4 = $10 + 65;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = getumdgeneration.valueOf;
                    int i6 = getumdgeneration.values;
                    throw new java.lang.ArithmeticException();
                }
                cArr4[getumdgeneration.valueOf] = (char) (cArr2[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr2[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1628, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a((short) 0, 0, (short) 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        if (r3.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object getBusinessLogicModule(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i = build;
        int i2 = i | 73;
        int i3 = ((i2 << 1) - ((~(i & 73)) & i2)) % 128;
        getMaximumPinTry = i3;
        java.util.ArrayList<com.payair.hce.setSystemGestureExclusionRects> arrayList = getCvrMaskAnd;
        if (arrayList != null) {
            int i4 = i3 & 43;
            int i5 = (((i3 | 43) & (~i4)) - (~(i4 << 1))) - 1;
            int i6 = i5 % 128;
            build = i6;
            if (i5 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (!booleanValue) {
                getMaximumPinTry = (((i6 | 121) << 1) - (i6 ^ 121)) % 128;
            }
        }
        getCvrMaskAnd = (java.util.ArrayList) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 587851495, -587851469, (int) java.lang.System.currentTimeMillis());
        build = (getMaximumPinTry + 79) % 128;
        java.util.Iterator<com.payair.hce.setSystemGestureExclusionRects> it = getCvrMaskAnd.iterator();
        int i7 = getMaximumPinTry;
        int i8 = i7 & 17;
        build = (((i7 | 17) & (~i8)) + (i8 << 1)) % 128;
        com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = null;
        while (it.hasNext()) {
            int i9 = getMaximumPinTry;
            build = (((i9 | 99) << 1) - ((i9 & (-100)) | ((~i9) & 99))) % 128;
            com.payair.hce.setSystemGestureExclusionRects next = it.next();
            if (((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{next}, -667563269, 667563273, java.lang.System.identityHashCode(next))).AlternateContactlessPaymentDataJson().equals(str)) {
                int i10 = build;
                int i11 = ((i10 ^ 21) + ((i10 & 21) << 1)) % 128;
                getMaximumPinTry = i11;
                int i12 = (i11 & (-102)) | ((~i11) & 101);
                int i13 = -(-((i11 & 101) << 1));
                build = ((i12 & i13) + (i12 | i13)) % 128;
                setsystemgestureexclusionrects = next;
            }
            int i14 = build;
            getMaximumPinTry = (((i14 | 29) << 1) - (i14 ^ 29)) % 128;
        }
        int i15 = build;
        int i16 = ((i15 | 110) << 1) - (i15 ^ 110);
        int i17 = (~i16) + (i16 << 1);
        getMaximumPinTry = i17 % 128;
        if (i17 % 2 != 0) {
            return setsystemgestureexclusionrects;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getAckAlwaysRequiredIfCurrencyNotProvided(java.lang.Object[] objArr) {
        com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{new java.lang.String((byte[]) objArr[0]), java.lang.Boolean.FALSE}, -757430979, 757431035, (int) java.lang.System.currentTimeMillis());
        int i = build;
        int i2 = i & 75;
        int i3 = ((i ^ 75) | i2) << 1;
        int i4 = -((i | 75) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getMaximumPinTry = i5 % 128;
        if (i5 % 2 != 0) {
            return setsystemgestureexclusionrects;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getP(java.lang.Object[] objArr) {
        int i = build;
        int i2 = (-2) - (~(i + 120));
        int i3 = i2 % 128;
        getMaximumPinTry = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = AlternateContactlessPaymentDataJson;
        if (str != null) {
            getMaximumPinTry = ((-2) - (~(i + 100))) % 128;
            return str;
        }
        int i4 = i3 ^ 77;
        int i5 = ((i3 & 77) | i4) << 1;
        int i6 = -i4;
        build = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
        int i7 = (i3 & 106) + (i3 | 106);
        build = ((~i7) + (i7 << 1)) % 128;
        return "";
    }

    static void AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = getMaximumPinTry;
        int i2 = i & 5;
        int i3 = ((((i ^ 5) | i2) << 1) - (~(-((~i2) & (i | 5))))) - 1;
        build = i3 % 128;
        if (i3 % 2 == 0) {
            AlternateContactlessPaymentDataJson = str;
            int i4 = i & 97;
            int i5 = -(-((i ^ 97) | i4));
            build = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
            return;
        }
        AlternateContactlessPaymentDataJson = str;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getCardRiskManagementData(java.lang.Object[] objArr) {
        writeReplace = new com.payair.hce.setSoundEffectsEnabled();
        int i = getMaximumPinTry;
        int i2 = (((i ^ 17) | (i & 17)) << 1) - ((i & (-18)) | ((~i) & 17));
        build = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getSfi(java.lang.Object[] objArr) {
        int i = build;
        int i2 = (((i | 63) << 1) - (i ^ 63)) % 128;
        getMaximumPinTry = i2;
        if (IccPrivateKeyCrtComponentsJson == null) {
            int i3 = ((i2 ^ 29) | (i2 & 29)) << 1;
            int i4 = -((i2 & (-30)) | ((~i2) & 29));
            int i5 = (i3 & i4) + (i3 | i4);
            build = i5 % 128;
            if (i5 % 2 == 0) {
                valueOf(new java.lang.Object[0], -91409097, 91409142, (int) java.lang.System.currentTimeMillis());
            } else {
                valueOf(new java.lang.Object[0], -91409097, 91409142, (int) java.lang.System.currentTimeMillis());
                throw new java.lang.ArithmeticException();
            }
        }
        com.payair.hce.setTextDirection settextdirection = IccPrivateKeyCrtComponentsJson;
        int i6 = getMaximumPinTry + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        build = i6 % 128;
        if (i6 % 2 == 0) {
            return settextdirection;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setIsCredential setiscredential = new com.payair.hce.setIsCredential();
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson2 = setiscredential.AlternateContactlessPaymentDataJson(null, "KD", null);
        if (AlternateContactlessPaymentDataJson2 != null) {
            int i = getMaximumPinTry;
            int i2 = (((i | 54) << 1) - (i ^ 54)) - 1;
            build = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (((java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))) != null) {
                com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson3 = setiscredential.AlternateContactlessPaymentDataJson(null, "CRYPTO_KEY", null);
                java.lang.String str = (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{new com.payair.hce.setVisibility().DigitizedCardProfile((byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson3}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson3))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson3}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson3))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()))}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis());
                build = (getMaximumPinTry + 45) % 128;
                return str;
            }
        }
        int i3 = build;
        int i4 = i3 & 51;
        int i5 = (i3 ^ 51) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        getMaximumPinTry = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getRecordNumber(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length << 1);
        try {
            java.util.Formatter formatter = new java.util.Formatter(sb);
            try {
                int length = bArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = getMaximumPinTry;
                    int i3 = i2 & 125;
                    int i4 = -(-((i2 ^ 125) | i3));
                    int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
                    build = i5 % 128;
                    if (i5 % 2 != 0) {
                        java.lang.Object[] objArr2 = new java.lang.Object[0];
                        objArr2[1] = java.lang.Byte.valueOf(bArr[i]);
                        formatter.format("%02x", objArr2);
                        int i6 = ((i ^ 154) | (i & 154)) << 1;
                        int i7 = -((i & (-155)) | ((~i) & 154));
                        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                        i = (-2) - (~(((i8 | (-44)) << 1) - (i8 ^ (-44))));
                    } else {
                        formatter.format("%02x", java.lang.Byte.valueOf(bArr[i]));
                        i++;
                    }
                }
                java.lang.String obj = sb.toString();
                formatter.close();
                int i9 = getMaximumPinTry;
                int i10 = (((i9 & (-70)) | ((~i9) & 69)) - (~(-(-((i9 & 69) << 1))))) - 1;
                build = i10 % 128;
                if (i10 % 2 == 0) {
                    return obj;
                }
                throw null;
            } finally {
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static /* synthetic */ java.lang.Object getMagstripeCvmIssuerOptions(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection;
        int i = getMaximumPinTry;
        int i2 = (i & (-126)) | ((~i) & 125);
        int i3 = -(-((i & 125) << 1));
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        build = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (getAid == null && (settextdirection = IccPrivateKeyCrtComponentsJson) != null) {
            int i5 = i & 105;
            int i6 = -(-((i ^ 105) | i5));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            build = i7 % 128;
            if (i7 % 2 != 0) {
                getAid = java.lang.Long.valueOf(((java.lang.Long) com.payair.hce.setTextDirection.DigitizedCardProfile(new java.lang.Object[]{settextdirection}, 1234952462, -1234952433, java.lang.System.identityHashCode(settextdirection))).longValue());
                throw null;
            }
            getAid = java.lang.Long.valueOf(((java.lang.Long) com.payair.hce.setTextDirection.DigitizedCardProfile(new java.lang.Object[]{settextdirection}, 1234952462, -1234952433, java.lang.System.identityHashCode(settextdirection))).longValue());
        }
        if (getAid == null) {
            build = (getMaximumPinTry + 35) % 128;
            getAid = 0L;
            int i8 = build;
            int i9 = i8 | 99;
            getMaximumPinTry = ((i9 << 1) - ((~(i8 & 99)) & i9)) % 128;
        }
        long longValue = getAid.longValue();
        int i10 = build + 105;
        getMaximumPinTry = i10 % 128;
        if (i10 % 2 != 0) {
            return java.lang.Long.valueOf(longValue);
        }
        throw null;
    }

    static void valueOf(com.payair.hce.setPointerIcon setpointericon) {
        int i = getMaximumPinTry;
        build = (((i ^ 78) + ((i & 78) << 1)) - 1) % 128;
        valueOf(new java.lang.Object[]{setpointericon}, 1990767572, -1990767503, (int) java.lang.System.currentTimeMillis());
        valueOf(new java.lang.Object[0], -91409097, 91409142, (int) java.lang.System.currentTimeMillis());
        int i2 = build;
        int i3 = ((i2 | 17) << 1) - (i2 ^ 17);
        getMaximumPinTry = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static com.payair.hce.setZ getProfileVersion() {
        build = (getMaximumPinTry + 93) % 128;
        com.payair.hce.setZ setz = RecordsJson;
        if (setz == null) {
            build = (((((r0 ^ 75) | (r0 & 75)) << 1) - (~(-((r0 & (-76)) | ((~r0) & 75))))) - 1) % 128;
            if (writeReplace == null) {
                writeReplace = new com.payair.hce.setSoundEffectsEnabled();
                build = (getMaximumPinTry + 17) % 128;
            }
            valueOf(new java.lang.Object[0], -870824046, 870824136, (int) java.lang.System.currentTimeMillis());
            int i = getMaximumPinTry;
            build = ((((i | 54) << 1) - (i ^ 54)) - 1) % 128;
        }
        int i2 = build;
        getMaximumPinTry = (((i2 & 60) + (i2 | 60)) - 1) % 128;
        return setz;
    }

    private static /* synthetic */ java.lang.Object getContactlessPaymentData(java.lang.Object[] objArr) {
        com.payair.hce.setZ setz = (com.payair.hce.setZ) objArr[0];
        int i = build;
        int i2 = (((i & (-64)) | ((~i) & 63)) - (~(-(-((i & 63) << 1))))) - 1;
        getMaximumPinTry = i2 % 128;
        if (i2 % 2 == 0) {
            com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = writeReplace;
            com.payair.hce.setZ[] setzArr = new com.payair.hce.setZ[1];
            setzArr[1] = setz;
            com.payair.hce.setSoundEffectsEnabled.DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled, setzArr}, -1513871850, 1513871853, java.lang.System.identityHashCode(setsoundeffectsenabled));
            valueOf(new java.lang.Object[0], -870824046, 870824136, (int) java.lang.System.currentTimeMillis());
        } else {
            com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled2 = writeReplace;
            com.payair.hce.setSoundEffectsEnabled.DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled2, new com.payair.hce.setZ[]{setz}}, -1513871850, 1513871853, java.lang.System.identityHashCode(setsoundeffectsenabled2));
            valueOf(new java.lang.Object[0], -870824046, 870824136, (int) java.lang.System.currentTimeMillis());
        }
        int i3 = build;
        int i4 = i3 & 23;
        int i5 = (i3 ^ 23) | i4;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        getMaximumPinTry = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i = build;
        int i2 = (((i ^ 27) | (i & 27)) << 1) - ((i & (-28)) | ((~i) & 27));
        getMaximumPinTry = i2 % 128;
        java.lang.String str = DigitizedCardProfile;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object SdkCoreIccPrivateKeyCrtComponentsImpl(java.lang.Object[] objArr) {
        int i = getMaximumPinTry;
        int i2 = i & 99;
        int i3 = -(-((i ^ 99) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        build = i4 % 128;
        if (i4 % 2 == 0) {
            return getProfileVersion;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getPinPreEntryAllowed(java.lang.Object[] objArr) {
        int i = build;
        int i2 = (-2) - (~((i & 10) + (i | 10)));
        int i3 = i2 % 128;
        getMaximumPinTry = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = getCiacDecline;
        int i4 = i3 + 36;
        int i5 = (~i4) + (i4 << 1);
        build = i5 % 128;
        if (i5 % 2 == 0) {
            return java.lang.Long.valueOf(j);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object SdkCoreContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        long longValue = ((java.lang.Number) objArr[0]).longValue();
        int i = build;
        int i2 = ((i | 78) << 1) - (i ^ 78);
        int i3 = (~i2) + (i2 << 1);
        getMaximumPinTry = i3 % 128;
        if (i3 % 2 != 0) {
            getCiacDecline = longValue;
            int i4 = ((i & (-80)) | ((~i) & 79)) + ((i & 79) << 1);
            getMaximumPinTry = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        getCiacDecline = longValue;
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCardLayoutDescription(java.lang.Object[] objArr) {
        int i = build;
        int i2 = (i & 113) + (i | 113);
        getMaximumPinTry = i2 % 128;
        if (i2 % 2 != 0) {
            com.payair.hce.setFocusable.values(new java.lang.Object[0], 865996780, -865996771, (int) java.lang.System.currentTimeMillis());
            return null;
        }
        com.payair.hce.setFocusable.values(new java.lang.Object[0], 865996780, -865996771, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    private static /* synthetic */ java.lang.Object getPan(java.lang.Object[] objArr) {
        int i = build;
        int i2 = (((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)) - 1;
        int i3 = i2 % 128;
        getMaximumPinTry = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = getCardLayoutDescription;
        int i4 = i3 & 59;
        int i5 = -(-((i3 ^ 59) | i4));
        build = ((i4 & i5) + (i5 | i4)) % 128;
        return java.lang.Boolean.valueOf(z);
    }

    private static /* synthetic */ java.lang.Object getCvrMaskAnd(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.String str2 = (java.lang.String) objArr[1];
        java.lang.Integer num = (java.lang.Integer) objArr[2];
        java.lang.String str3 = (java.lang.String) objArr[3];
        int i = getMaximumPinTry;
        int i2 = i & 3;
        int i3 = (i2 - (~((3 ^ i) | i2))) - 1;
        build = i3 % 128;
        if (i3 % 2 == 0) {
            DigitizedCardProfile = str;
            getProfileVersion = str2;
            SdkCoreBusinessLogicModuleImpl = num;
            getPaymentFci = str3;
            return null;
        }
        DigitizedCardProfile = str;
        getProfileVersion = str2;
        SdkCoreBusinessLogicModuleImpl = num;
        getPaymentFci = str3;
        throw null;
    }

    private static /* synthetic */ java.lang.Object getDigitizedCardId(java.lang.Object[] objArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getSecurityWord());
        sb.append(java.lang.Integer.toString(com.payair.hce.setLongClickable.writeReplace()).replace(java.lang.Integer.toString(((java.lang.Integer) com.payair.hce.setLongClickable.DigitizedCardProfile(new java.lang.Object[0], -455230668, 455230668, (int) java.lang.System.currentTimeMillis())).intValue()), ""));
        java.lang.String obj = sb.toString();
        int i = getMaximumPinTry;
        int i2 = ((i ^ 93) | (i & 93)) << 1;
        int i3 = -((i & (-94)) | ((~i) & 93));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        build = i4 % 128;
        if (i4 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    static java.lang.String getSecurityWord() {
        int i = getMaximumPinTry;
        int i2 = i & 105;
        int i3 = -(-((i ^ 105) | i2));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        build = i4;
        java.lang.String str = SdkCoreCardRiskManagementDataImpl;
        int i5 = (((i4 ^ 21) | (i4 & 21)) << 1) - ((i4 & (-22)) | ((~i4) & 21));
        getMaximumPinTry = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        int i = build;
        getMaximumPinTry = (((i | 91) << 1) - (i ^ 91)) % 128;
        SdkCoreCardRiskManagementDataImpl = str;
        int i2 = i & 103;
        int i3 = -(-((i ^ 103) | i2));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        getMaximumPinTry = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x010f, code lost:
    
        if (((java.lang.String) valueOf(new java.lang.Object[0], 441749328, -441749325, (int) java.lang.System.currentTimeMillis())).isEmpty() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0179, code lost:
    
        if (((java.lang.String) valueOf(new java.lang.Object[0], -1015528636, 1015528697, (int) java.lang.System.currentTimeMillis())).isEmpty() != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object getMaximumPinTry(java.lang.Object[] objArr) {
        com.payair.hce.setPointerIcon setpointericon;
        int i = getMaximumPinTry + 101;
        build = i % 128;
        if (i % 2 != 0) {
            com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = writeReplace;
            ((java.util.List) com.payair.hce.setSoundEffectsEnabled.DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1003984198, 1003984205, java.lang.System.identityHashCode(setsoundeffectsenabled))).isEmpty();
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled2 = writeReplace;
        java.util.List list = (java.util.List) com.payair.hce.setSoundEffectsEnabled.DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled2}, -1003984198, 1003984205, java.lang.System.identityHashCode(setsoundeffectsenabled2));
        if (list.isEmpty()) {
            setpointericon = null;
        } else {
            int i2 = build;
            int i3 = (((i2 | 54) << 1) - (i2 ^ 54)) - 1;
            getMaximumPinTry = i3 % 128;
            setpointericon = (com.payair.hce.setPointerIcon) (i3 % 2 == 0 ? list.get(1) : list.get(0));
            int i4 = getMaximumPinTry;
            int i5 = i4 & 95;
            int i6 = (i4 | 95) & (~i5);
            int i7 = i5 << 1;
            build = ((i6 & i7) + (i6 | i7)) % 128;
        }
        com.payair.hce.setTextDirection settextdirection = new com.payair.hce.setTextDirection();
        if (setpointericon != null) {
            int i8 = build;
            int i9 = (i8 & (-42)) | ((~i8) & 41);
            int i10 = (i8 & 41) << 1;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            getMaximumPinTry = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (((java.lang.String) valueOf(new java.lang.Object[0], 1213004610, -1213004596, (int) java.lang.System.currentTimeMillis())) == null || ((java.lang.String) valueOf(new java.lang.Object[0], 1213004610, -1213004596, (int) java.lang.System.currentTimeMillis())).isEmpty()) {
                valueOf(new java.lang.Object[]{(java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 1170827164, -1170827126, java.lang.System.identityHashCode(setpointericon))}, 639674115, -639674063, (int) java.lang.System.currentTimeMillis());
                int i12 = getMaximumPinTry;
                build = ((((i12 ^ 117) | (i12 & 117)) << 1) - ((i12 & (-118)) | ((~i12) & 117))) % 128;
            }
            if (((java.lang.String) valueOf(new java.lang.Object[0], 441749328, -441749325, (int) java.lang.System.currentTimeMillis())) != null) {
                int i13 = build;
                int i14 = i13 & 107;
                getMaximumPinTry = ((i14 - (~(-(-((i13 ^ 107) | i14))))) - 1) % 128;
            }
            valueOf(new java.lang.Object[]{(java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 54879881, -54879877, java.lang.System.identityHashCode(setpointericon))}, 2132684781, -2132684734, (int) java.lang.System.currentTimeMillis());
            int i15 = getMaximumPinTry;
            build = ((i15 ^ 115) + ((i15 & 115) << 1)) % 128;
            if (((java.lang.String) valueOf(new java.lang.Object[0], -1015528636, 1015528697, (int) java.lang.System.currentTimeMillis())) != null) {
                int i16 = getMaximumPinTry;
                build = (((i16 & (-50)) | ((~i16) & 49)) + ((i16 & 49) << 1)) % 128;
            }
            valueOf(new java.lang.Object[]{(java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -2060421759, 2060421784, java.lang.System.identityHashCode(setpointericon))}, -124700999, 124701078, (int) java.lang.System.currentTimeMillis());
            int i17 = getMaximumPinTry;
            build = ((i17 & 91) + (i17 | 91)) % 128;
            if (((java.lang.Long) valueOf(new java.lang.Object[0], -191490049, 191490116, (int) java.lang.System.currentTimeMillis())).longValue() == 0) {
                int i18 = build;
                int i19 = i18 & 119;
                int i20 = ((i18 ^ 119) | i19) << 1;
                int i21 = -((i18 | 119) & (~i19));
                getMaximumPinTry = ((i20 & i21) + (i21 | i20)) % 128;
                valueOf(new java.lang.Object[]{java.lang.Long.valueOf(((java.lang.Long) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -222327993, 222328014, java.lang.System.identityHashCode(setpointericon))).longValue())}, 988495194, -988495161, (int) java.lang.System.currentTimeMillis());
                int i22 = build;
                getMaximumPinTry = ((((i22 ^ 87) | (i22 & 87)) << 1) - ((i22 & (-88)) | ((~i22) & 87))) % 128;
            }
            long longValue = ((java.lang.Long) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 1208058698, -1208058665, java.lang.System.identityHashCode(setpointericon))).longValue();
            int intValue = ((java.lang.Integer) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 516081132, -516081113, java.lang.System.identityHashCode(setpointericon))).intValue();
            int intValue2 = ((java.lang.Integer) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -603563677, 603563709, java.lang.System.identityHashCode(setpointericon))).intValue();
            java.lang.String str = (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 542017361, -542017332, java.lang.System.identityHashCode(setpointericon));
            java.lang.String str2 = (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 535536029, -535536005, java.lang.System.identityHashCode(setpointericon));
            com.payair.hce.setTextDirection.DigitizedCardProfile(new java.lang.Object[]{settextdirection, java.lang.Long.valueOf(longValue), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), str, str2, (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 566506569, -566506541, java.lang.System.identityHashCode(setpointericon)), (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 1375844396, -1375844369, java.lang.System.identityHashCode(setpointericon)), (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -833491071, 833491076, java.lang.System.identityHashCode(setpointericon)), (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -68969111, 68969137, java.lang.System.identityHashCode(setpointericon)), (java.lang.String) valueOf(new java.lang.Object[0], 1213004610, -1213004596, (int) java.lang.System.currentTimeMillis()), (java.lang.String) valueOf(new java.lang.Object[0], 441749328, -441749325, (int) java.lang.System.currentTimeMillis()), (java.lang.String) valueOf(new java.lang.Object[0], -1015528636, 1015528697, (int) java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(((java.lang.Long) valueOf(new java.lang.Object[0], -191490049, 191490116, (int) java.lang.System.currentTimeMillis())).longValue())}, -1191656224, 1191656230, intValue);
            int i23 = getMaximumPinTry;
            build = (((i23 & 101) - (~(-(-(i23 | 101))))) - 1) % 128;
        } else {
            com.payair.hce.setTextDirection.DigitizedCardProfile(new java.lang.Object[]{settextdirection}, 1552641023, -1552641013, java.lang.System.identityHashCode(settextdirection));
            int i24 = getMaximumPinTry;
            int i25 = (i24 & (-2)) | ((~i24) & 1);
            int i26 = -(-((i24 & 1) << 1));
            build = (((i25 | i26) << 1) - (i26 ^ i25)) % 128;
        }
        valueOf(new java.lang.Object[]{settextdirection}, -602765149, 602765149, (int) java.lang.System.currentTimeMillis());
        int i27 = getMaximumPinTry;
        int i28 = (i27 & 35) + (i27 | 35);
        build = i28 % 128;
        if (i28 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreRecordsImpl(java.lang.Object[] objArr) {
        com.payair.hce.setZ setz;
        int i = getMaximumPinTry;
        int i2 = (i & 3) + (i | 3);
        build = i2 % 128;
        if (i2 % 2 == 0) {
            com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = writeReplace;
            java.util.List list = (java.util.List) com.payair.hce.setSoundEffectsEnabled.DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1392515677, 1392515685, java.lang.System.identityHashCode(setsoundeffectsenabled));
            if (list.isEmpty()) {
                setz = null;
            } else {
                setz = (com.payair.hce.setZ) list.get(0);
                int i3 = getMaximumPinTry;
                int i4 = ((i3 ^ 43) | (i3 & 43)) << 1;
                int i5 = -((i3 & (-44)) | ((~i3) & 43));
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                build = i6 % 128;
                int i7 = i6 % 2;
            }
            writeReplace(setz);
            int i8 = getMaximumPinTry;
            int i9 = ((i8 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i8 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            build = i9 % 128;
            if (i9 % 2 == 0) {
                return null;
            }
            throw null;
        }
        com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled2 = writeReplace;
        ((java.util.List) com.payair.hce.setSoundEffectsEnabled.DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled2}, -1392515677, 1392515685, java.lang.System.identityHashCode(setsoundeffectsenabled2))).isEmpty();
        throw null;
    }

    static void getCvmResetTimeout() {
        writeReplace = new com.payair.hce.setSoundEffectsEnabled();
        valueOf(new java.lang.Object[0], -91409097, 91409142, (int) java.lang.System.currentTimeMillis());
        valueOf(new java.lang.Object[0], -870824046, 870824136, (int) java.lang.System.currentTimeMillis());
        int i = build;
        int i2 = ((i | 116) << 1) - (i ^ 116);
        int i3 = (~i2) + (i2 << 1);
        getMaximumPinTry = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object SdkCoreDigitizedCardProfileImpl(java.lang.Object[] objArr) {
        int i = getMaximumPinTry + 65;
        build = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (writeReplace == null) {
            valueOf(new java.lang.Object[0], -625970725, 625970807, (int) java.lang.System.currentTimeMillis());
            int i2 = getMaximumPinTry;
            int i3 = i2 & 99;
            build = ((((i2 ^ 99) | i3) << 1) - ((i2 | 99) & (~i3))) % 128;
        }
        valueOf(new java.lang.Object[0], 1206357920, -1206357856, (int) java.lang.System.currentTimeMillis());
        getPinAlwaysRequiredIfCurrencyProvided();
        build = (getMaximumPinTry + 71) % 128;
        return null;
    }

    private static void getPinAlwaysRequiredIfCurrencyProvided() {
        int i = getMaximumPinTry;
        int i2 = i & 41;
        int i3 = -(-((i ^ 41) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        build = i4 % 128;
        if (i4 % 2 != 0) {
            com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = writeReplace;
            ((java.util.List) com.payair.hce.setSoundEffectsEnabled.DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1392515677, 1392515685, java.lang.System.identityHashCode(setsoundeffectsenabled))).iterator();
            throw null;
        }
        com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled2 = writeReplace;
        int i5 = build;
        getMaximumPinTry = (((i5 | 115) << 1) - (i5 ^ 115)) % 128;
        for (com.payair.hce.setZ setz : (java.util.List) com.payair.hce.setSoundEffectsEnabled.DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled2}, -1392515677, 1392515685, java.lang.System.identityHashCode(setsoundeffectsenabled2))) {
            int i6 = build;
            int i7 = i6 & 37;
            getMaximumPinTry = ((((i6 ^ 37) | i7) << 1) - ((i6 | 37) & (~i7))) % 128;
            com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled3 = writeReplace;
            com.payair.hce.setSoundEffectsEnabled.DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled3, setz}, -1781100477, 1781100483, java.lang.System.identityHashCode(setsoundeffectsenabled3));
            int i8 = getMaximumPinTry;
            build = ((((i8 & (-4)) | ((~i8) & 3)) - (~(-(-((i8 & 3) << 1))))) - 1) % 128;
        }
        writeReplace((com.payair.hce.setZ) null);
    }

    private static /* synthetic */ java.lang.Object getContent(java.lang.Object[] objArr) {
        long longValue = ((java.lang.Number) objArr[0]).longValue();
        int i = build;
        int i2 = i & 75;
        int i3 = (i ^ 75) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        getMaximumPinTry = i5;
        if (i4 % 2 != 0) {
            getSecurityWord = longValue;
            int i6 = i5 & 79;
            int i7 = (i5 | 79) & (~i6);
            int i8 = -(-(i6 << 1));
            build = ((i7 ^ i8) + ((i7 & i8) << 1)) % 128;
            return null;
        }
        getSecurityWord = longValue;
        throw null;
    }

    private static /* synthetic */ java.lang.Object getIssuerApplicationData(java.lang.Object[] objArr) {
        long longValue = ((java.lang.Number) objArr[0]).longValue();
        int i = build;
        int i2 = (i & 31) + (i | 31);
        int i3 = i2 % 128;
        getMaximumPinTry = i3;
        if (i2 % 2 != 0) {
            getApplicationLifeCycleData = longValue;
            int i4 = (i3 & (-120)) | ((~i3) & 119);
            int i5 = -(-((i3 & 119) << 1));
            build = ((i4 & i5) + (i5 | i4)) % 128;
            return null;
        }
        getApplicationLifeCycleData = longValue;
        throw null;
    }

    private static /* synthetic */ java.lang.Object getAckAutomaticallyResetByApplication(java.lang.Object[] objArr) {
        long longValue = ((java.lang.Number) objArr[0]).longValue();
        int i = getMaximumPinTry & 25;
        int i2 = ((i - (~((r3 ^ 25) | i))) - 1) % 128;
        build = i2;
        getDualTapResetTimeout = longValue;
        int i3 = (i2 & 21) + (i2 | 21);
        getMaximumPinTry = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object SdkCoreMChipCvmIssuerOptionsImpl(java.lang.Object[] objArr) {
        int i = build;
        int i2 = i ^ 109;
        int i3 = ((((i & 109) | i2) << 1) - (~(-i2))) - 1;
        getMaximumPinTry = i3 % 128;
        if (i3 % 2 != 0) {
            return java.lang.Long.valueOf(getDualTapResetTimeout);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int i = getMaximumPinTry;
        int i2 = i & 35;
        int i3 = (i ^ 35) | i2;
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        build = i4;
        IccPrivateKeyCrtComponentsJson = settextdirection;
        int i5 = i4 + 31;
        getMaximumPinTry = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static void writeReplace(com.payair.hce.setZ setz) {
        int i = build;
        int i2 = i & 87;
        int i3 = (i2 - (~(-(-((i ^ 87) | i2))))) - 1;
        getMaximumPinTry = i3 % 128;
        if (i3 % 2 != 0) {
            RecordsJson = setz;
        } else {
            RecordsJson = setz;
            throw new java.lang.ArithmeticException();
        }
    }

    private static /* synthetic */ java.lang.Object getDp(java.lang.Object[] objArr) {
        int i = getMaximumPinTry + 75;
        build = i % 128;
        if (i % 2 == 0) {
            return java.lang.Boolean.valueOf(getGpoResponse);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0165, code lost:
    
        if (((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"NEED_TO_RENEW_KEYS", r2, ((android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 1)}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0190, code lost:
    
        valueOf(new java.lang.Object[]{r1}, 1492817192, -1492817118, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setAccessibilityHeading.getMaximumPinTry = (com.payair.hce.setAccessibilityHeading.build + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x018e, code lost:
    
        if (((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"NEED_TO_RENEW_KEYS", java.lang.Boolean.FALSE, ((android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0)}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue() == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object getIccPrivateKeyCrtComponents(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        java.lang.String str = new java.lang.String(bArr);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{str, bool}, -757430979, 757431035, (int) java.lang.System.currentTimeMillis());
        try {
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 5051, (char) (android.view.MotionEvent.axisFromString("") + 1))).getMethod("AlternateContactlessPaymentDataJson", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
            }
            valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -1899832564, 1899832593, (int) java.lang.System.currentTimeMillis());
            if (!((java.lang.Boolean) valueOf(new java.lang.Object[0], 1690481078, -1690481065, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                int i = build;
                int i2 = (i & (-84)) | ((~i) & 83);
                int i3 = (i & 83) << 1;
                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                getMaximumPinTry = i4 % 128;
                if (i4 % 2 != 0) {
                    ((com.payair.hce.HCEEventListener) valueOf(new java.lang.Object[0], 656433788, -656433763, (int) java.lang.System.currentTimeMillis())).onReplenishFailed(bArr, "DEVICE_KEYS_NOT_VALID".getBytes(), "Device unlock keys have been invalidated".getBytes(), null);
                    return null;
                }
                ((com.payair.hce.HCEEventListener) valueOf(new java.lang.Object[0], 656433788, -656433763, (int) java.lang.System.currentTimeMillis())).onReplenishFailed(bArr, "DEVICE_KEYS_NOT_VALID".getBytes(), "Device unlock keys have been invalidated".getBytes(), null);
                throw new java.lang.ArithmeticException();
            }
            if (setsystemgestureexclusionrects != null) {
                int i5 = build;
                getMaximumPinTry = ((((i5 ^ 17) | (i5 & 17)) << 1) - ((i5 & (-18)) | ((~i5) & 17))) % 128;
                if (((java.lang.Integer) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, 1748354353, -1748354346, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).intValue() < 10) {
                    int i6 = getMaximumPinTry;
                    int i7 = i6 & 89;
                    int i8 = -(-((i6 ^ 89) | i7));
                    int i9 = (i7 & i8) + (i8 | i7);
                    build = i9 % 128;
                    if (i9 % 2 == 0) {
                    }
                    int i10 = build;
                    int i11 = (-2) - (~(((i10 | 68) << 1) - (i10 ^ 68)));
                    getMaximumPinTry = i11 % 128;
                    if (i11 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
            } else if (((java.lang.Boolean) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], -1708934296, 1708934300, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                int i12 = build;
                int i13 = ((i12 | 59) << 1) - (i12 ^ 59);
                getMaximumPinTry = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 3 / 3;
                }
            }
            int i15 = getMaximumPinTry;
            build = (((i15 | 89) << 1) - (i15 ^ 89)) % 128;
            return null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object build(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        byte[] bArr = (byte[]) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        int i = getMaximumPinTry + 41;
        build = i % 128;
        try {
            if (i % 2 != 0) {
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                if (obj == null) {
                    obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 36, android.text.TextUtils.indexOf("", "", 0) + 5051, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("AlternateContactlessPaymentDataJson", null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
                }
                throw null;
            }
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 37, 5051 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())))).getMethod("AlternateContactlessPaymentDataJson", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj2);
            }
            if (((java.lang.Boolean) com.payair.hce.setScreenReaderFocusable.writeReplace(new java.lang.Object[]{context}, -71797868, 71797870, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                int i2 = getMaximumPinTry;
                build = (i2 + 17) % 128;
                int i3 = i2 & 69;
                int i4 = ((i2 ^ 69) | i3) << 1;
                int i5 = -((i2 | 69) & (~i3));
                int i6 = (i4 & i5) + (i5 | i4);
                build = i6 % 128;
                if (i6 % 2 == 0) {
                    return bool;
                }
                throw null;
            }
            com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{new java.lang.String(bArr)}, 1833928639, -1833928629, (int) java.lang.System.currentTimeMillis());
            if (setsystemgestureexclusionrects == null) {
                int i7 = getMaximumPinTry + 121;
                build = i7 % 128;
                if (i7 % 2 == 0) {
                    return bool;
                }
                throw null;
            }
            int i8 = getMaximumPinTry;
            build = (((i8 ^ 67) - (~((i8 & 67) << 1))) - 1) % 128;
            try {
                ((com.payair.hce.setTheme) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1016779127, 1016779151, (int) java.lang.System.currentTimeMillis())).writeReplace().values((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects)));
                int i9 = (-2) - (~(build + 48));
                getMaximumPinTry = i9 % 128;
                if (i9 % 2 != 0) {
                    return java.lang.Boolean.TRUE;
                }
                throw null;
            } catch (com.payair.hce.setSuccessful unused) {
                return bool;
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.lang.String valueOf(byte[] bArr) {
        java.lang.String str;
        int i;
        int i2 = build;
        int i3 = i2 & 87;
        int i4 = ((i2 ^ 87) | i3) << 1;
        int i5 = -((i2 | 87) & (~i3));
        getMaximumPinTry = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
        com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{bArr}, 1164786816, -1164786744, (int) java.lang.System.currentTimeMillis());
        if (setsystemgestureexclusionrects != null) {
            int i6 = getMaximumPinTry;
            int i7 = (i6 & 99) + (i6 | 99);
            build = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            if (((java.lang.String) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, 1508974894, -1508974894, java.lang.System.identityHashCode(setsystemgestureexclusionrects))) != null) {
                int i8 = getMaximumPinTry;
                int i9 = i8 ^ 77;
                int i10 = ((i8 & 77) | i9) << 1;
                int i11 = -i9;
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                build = i12 % 128;
                if (i12 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                str = (java.lang.String) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, 1508974894, -1508974894, java.lang.System.identityHashCode(setsystemgestureexclusionrects));
                int i13 = getMaximumPinTry;
                int i14 = i13 ^ 105;
                int i15 = ((i13 & 105) | i14) << 1;
                int i16 = -i14;
                i = (i15 & i16) + (i15 | i16);
                build = i % 128;
                if (i % 2 != 0) {
                    return str;
                }
                throw null;
            }
        }
        str = null;
        int i132 = getMaximumPinTry;
        int i142 = i132 ^ 105;
        int i152 = ((i132 & 105) | i142) << 1;
        int i162 = -i142;
        i = (i152 & i162) + (i152 | i162);
        build = i % 128;
        if (i % 2 != 0) {
        }
    }

    private static /* synthetic */ java.lang.Object getAckAlwaysRequiredIfCurrencyProvided(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.content.Context context = (android.content.Context) objArr[1];
        int i = build;
        int i2 = (i & (-34)) | ((~i) & 33);
        int i3 = -(-((i & 33) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getMaximumPinTry = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (((java.lang.Boolean) com.payair.hce.setScreenReaderFocusable.writeReplace(new java.lang.Object[]{context}, -71797868, 71797870, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i5 = build;
            int i6 = i5 & 65;
            int i7 = -(-((i5 ^ 65) | i6));
            int i8 = (i6 & i7) + (i7 | i6);
            getMaximumPinTry = i8 % 128;
            return java.lang.Boolean.valueOf(i8 % 2 == 0);
        }
        com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{new java.lang.String(bArr)}, 1833928639, -1833928629, (int) java.lang.System.currentTimeMillis());
        if (setsystemgestureexclusionrects == null) {
            com.payair.hce.setWebChromeClient.values(new java.lang.Object[]{context, new java.lang.String(bArr), com.visa.cbp.sdk.facade.data.TokenStatus.SUSPENDED}, -1894136898, 1894136898, (int) java.lang.System.currentTimeMillis());
            int i9 = getMaximumPinTry + 81;
            build = i9 % 128;
            if (i9 % 2 == 0) {
                return bool;
            }
            throw null;
        }
        int i10 = getMaximumPinTry;
        int i11 = i10 ^ 103;
        int i12 = ((i10 & 103) | i11) << 1;
        int i13 = -i11;
        build = ((i12 & i13) + (i12 | i13)) % 128;
        try {
            com.payair.hce.sendRequest sendrequest = (com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects));
            ((com.payair.hce.setTheme) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1016779127, 1016779151, (int) java.lang.System.currentTimeMillis())).writeReplace().DigitizedCardProfile(sendrequest);
            sendrequest.getProfileVersion();
            int i14 = build;
            int i15 = i14 & 23;
            int i16 = (i14 ^ 23) | i15;
            getMaximumPinTry = ((i15 ^ i16) + ((i16 & i15) << 1)) % 128;
            return bool;
        } catch (com.payair.hce.setSuccessful unused) {
            return java.lang.Boolean.FALSE;
        }
    }

    private static /* synthetic */ java.lang.Object getPinAutomaticallyResetByApplication(java.lang.Object[] objArr) {
        build = (getMaximumPinTry + 59) % 128;
        boolean booleanValue = ((java.lang.Boolean) valueOf(new java.lang.Object[]{(java.util.ArrayList) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 587851495, -587851469, (int) java.lang.System.currentTimeMillis())}, -1339096911, 1339096942, (int) java.lang.System.currentTimeMillis())).booleanValue();
        int i = build;
        int i2 = ((i | 97) << 1) - (i ^ 97);
        getMaximumPinTry = i2 % 128;
        if (i2 % 2 != 0) {
            return java.lang.Boolean.valueOf(booleanValue);
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object getCardMetadata(java.lang.Object[] objArr) {
        int i;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.util.List<com.payair.hce.setSystemGestureExclusionRects> list = (java.util.List) objArr[0];
        int i2 = getMaximumPinTry;
        int i3 = i2 & 105;
        int i4 = -(-(i2 | 105));
        build = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        if (!((java.lang.Boolean) valueOf(new java.lang.Object[0], 1690481078, -1690481065, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i5 = getMaximumPinTry;
            int i6 = i5 & 95;
            int i7 = ((i5 ^ 95) | i6) << 1;
            int i8 = -((i5 | 95) & (~i6));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            build = i9 % 128;
            if (i9 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i10 = getMaximumPinTry;
        build = ((i10 ^ 113) + ((i10 & 113) << 1)) % 128;
        for (com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects : list) {
            int i11 = getMaximumPinTry;
            build = ((((i11 ^ 71) | (i11 & 71)) << 1) - ((i11 & (-72)) | ((~i11) & 71))) % 128;
            com.payair.hce.sendRequest sendrequest = (com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects));
            int intValue = ((java.lang.Integer) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, 1748354353, -1748354346, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).intValue();
            sendrequest.AlternateContactlessPaymentDataJson();
            valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -1899832564, 1899832593, (int) java.lang.System.currentTimeMillis());
            if (intValue < 5) {
                int i12 = getMaximumPinTry;
                int i13 = (i12 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i12 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
                build = i13 % 128;
                if (i13 % 2 != 0) {
                    if (((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"NEED_TO_RENEW_KEYS", bool, ((android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 1)}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                    }
                    valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, 1492817192, -1492817118, (int) java.lang.System.currentTimeMillis());
                    int i14 = getMaximumPinTry;
                    int i15 = (i14 & (-86)) | ((~i14) & 85);
                    int i16 = -(-((i14 & 85) << 1));
                    i = ((i15 | i16) << 1) - (i16 ^ i15);
                    build = i % 128;
                    if (i % 2 == 0) {
                        int i17 = 4 / 4;
                    }
                } else {
                    if (((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"NEED_TO_RENEW_KEYS", bool, ((android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0)}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                    }
                    valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, 1492817192, -1492817118, (int) java.lang.System.currentTimeMillis());
                    int i142 = getMaximumPinTry;
                    int i152 = (i142 & (-86)) | ((~i142) & 85);
                    int i162 = -(-((i142 & 85) << 1));
                    i = ((i152 | i162) << 1) - (i162 ^ i152);
                    build = i % 128;
                    if (i % 2 == 0) {
                    }
                }
            }
            int i18 = build;
            int i19 = ((i18 ^ 45) | (i18 & 45)) << 1;
            int i20 = -((i18 & (-46)) | ((~i18) & 45));
            getMaximumPinTry = ((i19 ^ i20) + ((i20 & i19) << 1)) % 128;
        }
        int i21 = build;
        getMaximumPinTry = ((i21 & 95) + (i21 | 95)) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object getMchipCvmIssuerOptions(java.lang.Object[] objArr) {
        boolean z;
        final java.util.List list = (java.util.List) objArr[0];
        int i = build;
        int i2 = i & 13;
        int i3 = ((((i ^ 13) | i2) << 1) - (~(-((i | 13) & (~i2))))) - 1;
        getMaximumPinTry = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (!((java.lang.Boolean) valueOf(new java.lang.Object[0], 1690481078, -1690481065, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i4 = build;
            getMaximumPinTry = ((((i4 | 22) << 1) - (i4 ^ 22)) - 1) % 128;
            return java.lang.Boolean.FALSE;
        }
        if (list != null) {
            int i5 = getMaximumPinTry;
            int i6 = (i5 ^ 125) + ((i5 & 125) << 1);
            build = i6 % 128;
            try {
                try {
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                "AlternateContactlessPaymentDataJson".shutdownNow();
            }
            if (i6 % 2 != 0) {
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                if (obj == null) {
                    obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 37, 5052 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1))).getMethod("AlternateContactlessPaymentDataJson", null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
                }
                java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
                newSingleThreadExecutor.submit(new java.lang.Runnable() { // from class: com.payair.hce.setAccessibilityHeading$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.payair.hce.setAccessibilityHeading.DigitizedCardProfile(list);
                    }
                }).get();
                newSingleThreadExecutor.shutdown();
                throw null;
            }
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 37, android.text.TextUtils.getOffsetAfter("", 0) + 5051, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("AlternateContactlessPaymentDataJson", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj2);
            }
            java.util.concurrent.ExecutorService newSingleThreadExecutor2 = java.util.concurrent.Executors.newSingleThreadExecutor();
            newSingleThreadExecutor2.submit(new java.lang.Runnable() { // from class: com.payair.hce.setAccessibilityHeading$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.payair.hce.setAccessibilityHeading.DigitizedCardProfile(list);
                }
            }).get();
            newSingleThreadExecutor2.shutdown();
            int i7 = getMaximumPinTry;
            int i8 = i7 & 15;
            int i9 = (i7 | 15) & (~i8);
            int i10 = -(-(i8 << 1));
            build = ((i9 ^ i10) + ((i9 & i10) << 1)) % 128;
            int i11 = build;
            int i12 = i11 & 89;
            int i13 = (i11 ^ 89) | i12;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            getMaximumPinTry = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 3 / 5;
            }
            z = true;
        } else {
            z = false;
        }
        if (((java.lang.Boolean) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], -1708934296, 1708934300, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i16 = getMaximumPinTry;
            int i17 = i16 & 1;
            build = (((i16 | 1) & (~i17)) + (i17 << 1)) % 128;
            if (((java.lang.Boolean) com.payair.hce.setCacheColorHint.AlternateContactlessPaymentDataJson(new java.lang.Object[]{(android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())}, 1404943770, -1404943766, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                int i18 = build;
                int i19 = (i18 & (-48)) | ((~i18) & 47);
                int i20 = -(-((i18 & 47) << 1));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                getMaximumPinTry = i21 % 128;
                if (i21 % 2 == 0) {
                    com.payair.hce.setCacheColorHint.AlternateContactlessPaymentDataJson(new java.lang.Object[]{(android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())}, 765800420, -765800417, (int) java.lang.System.currentTimeMillis());
                } else {
                    com.payair.hce.setCacheColorHint.AlternateContactlessPaymentDataJson(new java.lang.Object[]{(android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())}, 765800420, -765800417, (int) java.lang.System.currentTimeMillis());
                }
                int i22 = getMaximumPinTry;
                build = (((i22 | 3) << 1) - ((i22 & (-4)) | (3 & (~i22)))) % 128;
                z = true;
            }
        }
        int i23 = getMaximumPinTry;
        build = ((i23 ^ 95) + ((i23 & 95) << 1)) % 128;
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01fc, code lost:
    
        if (r4 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006d, code lost:
    
        r2 = com.payair.hce.setAccessibilityHeading.build;
        r3 = ((r2 ^ 97) | (r2 & 97)) << 1;
        r2 = -((r2 & (-98)) | ((~r2) & 97));
        com.payair.hce.setAccessibilityHeading.getMaximumPinTry = ((r3 & r2) + (r2 | r3)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        if (((java.lang.Boolean) com.payair.hce.setFocusable.values(new java.lang.Object[0], 1150740079, -1150740075, (int) java.lang.System.currentTimeMillis())).booleanValue() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        r2 = com.payair.hce.setAccessibilityHeading.getMaximumPinTry;
        r3 = r2 & 3;
        r2 = (r2 | 3) & (~r3);
        r3 = -(-(r3 << 1));
        com.payair.hce.setAccessibilityHeading.build = (((r2 | r3) << 1) - (r2 ^ r3)) % 128;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0046, code lost:
    
        if (((java.lang.Boolean) com.payair.hce.setFocusable.values(new java.lang.Object[0], -1724744638, 1724744646, (int) java.lang.System.currentTimeMillis())).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006b, code lost:
    
        if (((java.lang.Boolean) com.payair.hce.setFocusable.values(new java.lang.Object[0], -1724744638, 1724744646, (int) java.lang.System.currentTimeMillis())).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00b3, code lost:
    
        r2 = com.payair.hce.setAccessibilityHeading.getMaximumPinTry;
        r3 = r2 & 113;
        r2 = (r2 ^ 113) | r3;
        com.payair.hce.setAccessibilityHeading.build = (((r3 | r2) << 1) - (r2 ^ r3)) % 128;
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr) {
        android.content.SharedPreferences sharedPreferences;
        boolean z;
        int i = getMaximumPinTry;
        int i2 = i & 77;
        int i3 = i2 + ((i ^ 77) | i2);
        build = i3 % 128;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (i3 % 2 != 0) {
            sharedPreferences = ((android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 1);
        } else {
            sharedPreferences = ((android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0);
        }
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"NEED_TO_RENEW_KEYS", bool, sharedPreferences}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue();
        try {
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5051, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getMethod("AlternateContactlessPaymentDataJson", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
            }
            if (!z) {
                int i4 = getMaximumPinTry;
                build = (i4 + 79) % 128;
                if (!booleanValue) {
                    int i5 = (-2) - (~(i4 + 100));
                    build = i5 % 128;
                    if (i5 % 2 == 0) {
                        return bool2;
                    }
                    throw null;
                }
            }
            com.payair.hce.setOnApplyWindowInsetsListener setonapplywindowinsetslistener = new com.payair.hce.setOnApplyWindowInsetsListener(com.payair.hce.setSaveFromParentEnabled.getAlternateContactlessPaymentData());
            if (((java.lang.Boolean) com.payair.hce.setOnApplyWindowInsetsListener.valueOf(new java.lang.Object[]{setonapplywindowinsetslistener}, 806546356, -806546355, java.lang.System.identityHashCode(setonapplywindowinsetslistener))).booleanValue()) {
                int i6 = getMaximumPinTry;
                int i7 = i6 & 7;
                int i8 = (i6 | 7) & (~i7);
                int i9 = -(-(i7 << 1));
                int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
                build = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                if (z) {
                    com.payair.hce.setFocusable.values(new java.lang.Object[0], 865996780, -865996771, (int) java.lang.System.currentTimeMillis());
                    com.payair.hce.setLeft.values(new java.lang.Object[]{"PUBLIC_UNLOCK_KEYS", sharedPreferences}, 589791992, -589791985, (int) java.lang.System.currentTimeMillis());
                    java.util.ArrayList arrayList = (java.util.ArrayList) com.payair.hce.setFocusable.values(new java.lang.Object[0], -1776140509, 1776140510, (int) java.lang.System.currentTimeMillis());
                    if (!arrayList.isEmpty()) {
                        com.payair.hce.setLeft.values(new java.lang.Object[]{"PUBLIC_UNLOCK_KEYS", new com.payair.hce.IccPrivateKeyCrtComponentsJson().values(arrayList), sharedPreferences}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
                        com.payair.hce.setLeft.values(new java.lang.Object[]{"NEED_TO_RENEW_KEYS", bool2, sharedPreferences}, 877494560, -877494557, (int) java.lang.System.currentTimeMillis());
                        int i11 = build;
                        getMaximumPinTry = ((i11 ^ 83) + ((i11 & 83) << 1)) % 128;
                        int i12 = build;
                        int i13 = (i12 ^ 55) + ((i12 & 55) << 1);
                        getMaximumPinTry = i13 % 128;
                        if (i13 % 2 == 0) {
                            ((com.payair.hce.HCEEventListener) valueOf(new java.lang.Object[0], 656433788, -656433763, (int) java.lang.System.currentTimeMillis())).onUploadUnlockKeys();
                            throw null;
                        }
                        ((com.payair.hce.HCEEventListener) valueOf(new java.lang.Object[0], 656433788, -656433763, (int) java.lang.System.currentTimeMillis())).onUploadUnlockKeys();
                    }
                }
            } else {
                ((com.payair.hce.HCEEventListener) valueOf(new java.lang.Object[0], 656433788, -656433763, (int) java.lang.System.currentTimeMillis())).onDeviceNotSecure();
                int i14 = getMaximumPinTry;
                build = ((((i14 ^ 79) | (i14 & 79)) << 1) - ((i14 & (-80)) | ((~i14) & 79))) % 128;
            }
            int i15 = build;
            int i16 = i15 & 77;
            int i17 = -(-((i15 ^ 77) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            getMaximumPinTry = i18 % 128;
            if (i18 % 2 != 0) {
                return bool;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object getAlternateContactlessPaymentData(java.lang.Object[] objArr) {
        com.payair.hce.setLeft.values(new java.lang.Object[0], 1651510342, -1651510327, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setAccessibilityLiveRegion.writeReplace(new java.lang.Object[0], 741099874, -741099873, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setDrawingCacheEnabled.values(new java.lang.Object[0], -1133094326, 1133094331, (int) java.lang.System.currentTimeMillis());
        valueOf(new java.lang.Object[0], -775815345, 775815391, (int) java.lang.System.currentTimeMillis());
        valueOf(new java.lang.Object[0], -1104573840, 1104573866, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setScreenReaderFocusable.writeReplace(new java.lang.Object[0], 565724162, -565724159, (int) java.lang.System.currentTimeMillis());
        valueOf(new java.lang.Object[0], 73241174, -73241163, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setNestedScrollingEnabled setnestedscrollingenabled = new com.payair.hce.setNestedScrollingEnabled();
        com.payair.hce.setNestedScrollingEnabled.writeReplace(new java.lang.Object[]{setnestedscrollingenabled}, -964452765, 964452765, java.lang.System.identityHashCode(setnestedscrollingenabled));
        int i = getMaximumPinTry;
        int i2 = i | 121;
        int i3 = i2 << 1;
        int i4 = -((~(i & 121)) & i2);
        int i5 = (i3 & i4) + (i4 | i3);
        build = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        new com.payair.hce.setIsCredential().DigitizedCardProfile();
        try {
            com.payair.hce.setScrollBarDefaultDelayBeforeFade.valueOf(new java.lang.Object[0], -361139453, 361139456, (int) java.lang.System.currentTimeMillis());
            int i = getMaximumPinTry;
            int i2 = i ^ 83;
            int i3 = (i & 83) << 1;
            build = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            return null;
        } catch (java.io.IOException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException unused) {
            return null;
        }
    }

    private static /* synthetic */ java.lang.Object getRemotePaymentData(java.lang.Object[] objArr) {
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = ~currentTimeMillis;
        int i2 = i & 1991624726;
        int i3 = ~(i2 | ((~i2) & (i | 1991624726)));
        int i4 = currentTimeMillis & 692791275;
        int i5 = (~i4) & (currentTimeMillis | 692791275);
        int i6 = (i5 ^ i4) | (i4 & i5);
        int i7 = ~i6;
        int i8 = (i6 | i7) & i7;
        int i9 = -(-(((i3 ^ i8) | (i3 & i8)) * 1150));
        int i10 = ((i9 ^ (-1038473542)) | (i9 & (-1038473542))) << 1;
        int i11 = -(((~i9) & (-1038473542)) | (1038473541 & i9));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        int i13 = currentTimeMillis ^ 692791275;
        int i14 = (i13 ^ i4) | (i13 & i4);
        int i15 = ~i14;
        int i16 = (((i14 | i15) & i15) | (~((692791275 & i) | ((~i) & (-692791276)) | (i & (-692791276))))) * (-575);
        int i17 = i12 & i16;
        int i18 = -(-((i16 ^ i12) | i17));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        int i20 = currentTimeMillis ^ 1991624726;
        int i21 = currentTimeMillis & 1991624726;
        int i22 = (i21 ^ i20) | (i21 & i20);
        int i23 = ~i22;
        int i24 = (i22 | i23) & i23;
        int i25 = ~((i ^ (-1991624727)) | (i & (-1991624727)));
        int i26 = ((~i25) & i24) | ((~i24) & i25);
        int i27 = i24 & i25;
        int i28 = -(~(-(-(((i27 ^ i26) | (i27 & i26)) * 575))));
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i29 = ~currentTimeMillis2;
        int i30 = i29 & (i29 | currentTimeMillis2);
        int i31 = ~((i30 ^ 496491102) | (i30 & 496491102) | (-170093485));
        int i32 = ~(((-134433293) ^ currentTimeMillis2) | (currentTimeMillis2 & (-134433293)));
        int i33 = i31 ^ i32;
        int i34 = i31 & i32;
        int i35 = -(~(((i34 ^ i33) | (i34 & i33)) * (-302)));
        int i36 = currentTimeMillis2 ^ (-35660193);
        int i37 = (-35660193) & currentTimeMillis2;
        int i38 = (currentTimeMillis2 ^ (-170093485)) | (currentTimeMillis2 & (-170093485));
        int i39 = ~i38;
        int i40 = (i38 | i39) & i39;
        int i41 = (i40 | 362057810) & (~(i40 & 362057810));
        if ((-2) - (~((i19 ^ i28) + ((i28 & i19) << 1))) <= ((((-2) - (~(((i35 | (-454417416)) << 1) - (i35 ^ (-454417416))))) + ((~((i37 & i36) | (i37 ^ i36))) * (-604))) - (~(-(~(-(-(((i41 ^ r6) | (i41 & r6)) * 302))))))) - 2) {
            throw new java.lang.ArithmeticException();
        }
        if (((com.payair.hce.setTheme) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1016779127, 1016779151, (int) java.lang.System.currentTimeMillis())) == null) {
            com.payair.hce.setImportantForAccessibility.writeReplace();
            int i42 = build;
            int i43 = i42 & 19;
            int i44 = -(-((i42 ^ 19) | i43));
            getMaximumPinTry = ((i43 & i44) + (i44 | i43)) % 128;
        }
        int i45 = (-2) - (~(build + 18));
        getMaximumPinTry = i45 % 128;
        if (i45 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getU(java.lang.Object[] objArr) {
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = (currentTimeMillis ^ 1868791376) | (currentTimeMillis & 1868791376);
        int i2 = ~i;
        int i3 = (i | i2) & i2;
        int i4 = ((~i3) & (-1162719983)) | (1162719982 & i3);
        int i5 = i3 & (-1162719983);
        int i6 = ((i5 ^ i4) | (i5 & i4)) * (-964);
        int i7 = i6 ^ 1789706141;
        int i8 = (i6 & 1789706141) << 1;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        int i10 = ~currentTimeMillis;
        int i11 = (currentTimeMillis | i10) & i10;
        int i12 = i11 & 1868791376;
        int i13 = (i11 | 1868791376) & (~i12);
        int i14 = ~((i13 ^ i12) | (i13 & i12));
        int i15 = i14 & (-1869610751);
        int i16 = (i14 | (-1869610751)) & (~i15);
        int i17 = -(-(((i16 ^ i15) | (i16 & i15)) * (-964)));
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i18 = ~currentTimeMillis2;
        int i19 = (-1109714028) - (~(-(-(((i18 ^ (-1360152745)) | (i18 & (-1360152745))) * (-490)))));
        int i20 = currentTimeMillis2 ^ (-2132461740);
        int i21 = currentTimeMillis2 & (-2132461740);
        int i22 = ~((i21 ^ i20) | (i21 & i20));
        int i23 = i22 & 772308995;
        int i24 = (i22 | 772308995) & (~i23);
        int i25 = -(-(((i24 ^ i23) | (i24 & i23)) * 490));
        int i26 = (i19 ^ i25) + ((i25 & i19) << 1);
        int i27 = i26 & (-921498490);
        int i28 = ((i26 ^ (-921498490)) | i27) << 1;
        int i29 = -(((-921498490) | i26) & (~i27));
        if ((((~i17) & i9) | ((~i9) & i17)) + ((i17 & i9) << 1) > (i28 ^ i29) + ((i29 & i28) << 1)) {
            RecordsJson((byte[]) null);
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1891116219, 1891116251, (int) java.lang.System.currentTimeMillis());
            int i30 = getMaximumPinTry;
            int i31 = i30 & 27;
            int i32 = i31 + ((i30 ^ 27) | i31);
            build = i32 % 128;
            if (i32 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        RecordsJson((byte[]) null);
        com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1891116219, 1891116251, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    private static /* synthetic */ java.lang.Object wipe(java.lang.Object[] objArr) {
        int i = getMaximumPinTry;
        int i2 = (i ^ 45) + ((i & 45) << 1);
        build = i2 % 128;
        if (i2 % 2 == 0) {
            byte[] bArr = (byte[]) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -707962006, 707962028, (int) java.lang.System.currentTimeMillis());
            if (bArr == null) {
                com.payair.hce.communication.JsonResponse jsonResponse = new com.payair.hce.communication.JsonResponse();
                int i3 = getMaximumPinTry;
                build = (((i3 | 69) << 1) - (i3 ^ 69)) % 128;
                return jsonResponse;
            }
            com.payair.hce.communication.JsonResponse jsonResponse2 = (com.payair.hce.communication.JsonResponse) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[]{new java.lang.String(bArr)}, -1452144630, 1452144646, (int) java.lang.System.currentTimeMillis());
            build = ((-2) - (~(getMaximumPinTry + 12))) % 128;
            return jsonResponse2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getPinAlwaysRequiredIfCurrencyProvided(java.lang.Object[] objArr) {
        int i = getMaximumPinTry;
        int i2 = i & 113;
        int i3 = (i | 113) & (~i2);
        int i4 = -(-(i2 << 1));
        build = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        com.payair.hce.setPreferKeepClear setpreferkeepclear = (com.payair.hce.setPreferKeepClear) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1657390037, 1657390053, (int) java.lang.System.currentTimeMillis());
        if (setpreferkeepclear != null) {
            int i5 = build;
            int i6 = ((i5 ^ 71) | (i5 & 71)) << 1;
            int i7 = -((i5 & (-72)) | ((~i5) & 71));
            int i8 = (i6 & i7) + (i7 | i6);
            getMaximumPinTry = i8 % 128;
            if (i8 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            java.lang.String str = (java.lang.String) com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear}, -1463023114, 1463023119, java.lang.System.identityHashCode(setpreferkeepclear));
            if (str != null) {
                int i9 = getMaximumPinTry;
                int i10 = ((i9 ^ 23) | (i9 & 23)) << 1;
                int i11 = -((i9 & (-24)) | ((~i9) & 23));
                build = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
                byte[] bytes = str.getBytes();
                int i12 = getMaximumPinTry;
                int i13 = i12 & 91;
                int i14 = (i12 | 91) & (~i13);
                int i15 = i13 << 1;
                build = ((i14 & i15) + (i14 | i15)) % 128;
                return bytes;
            }
        }
        java.lang.String DigitizedCardProfile2 = getAckAlwaysRequiredIfCurrencyProvided().DigitizedCardProfile();
        if (DigitizedCardProfile2 != null) {
            int i16 = getMaximumPinTry;
            int i17 = i16 ^ 121;
            int i18 = -(-((i16 & 121) << 1));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            build = i19 % 128;
            if (i19 % 2 == 0) {
                return DigitizedCardProfile2.getBytes();
            }
            throw new java.lang.ArithmeticException();
        }
        int i20 = getMaximumPinTry;
        int i21 = i20 & 15;
        int i22 = i20 | 15;
        int i23 = (i21 & i22) + (i22 | i21);
        build = i23 % 128;
        if (i23 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object buildRecords(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int i = build;
        int i2 = i & 35;
        int i3 = ((i ^ 35) | i2) << 1;
        int i4 = -((i | 35) & (~i2));
        getMaximumPinTry = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        try {
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 5051 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod("AlternateContactlessPaymentDataJson", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
            }
            com.payair.hce.setPreferKeepClear setpreferkeepclear = (com.payair.hce.setPreferKeepClear) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1657390037, 1657390053, (int) java.lang.System.currentTimeMillis());
            if (bArr != null) {
                int i5 = getMaximumPinTry;
                int i6 = i5 & 117;
                int i7 = i6 + ((i5 ^ 117) | i6);
                build = i7 % 128;
                if (i7 % 2 != 0) {
                    int length = bArr.length;
                    throw new java.lang.ArithmeticException();
                }
                if (bArr.length != 0) {
                    com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{bArr}, 1662817732, -1662817683, (int) java.lang.System.currentTimeMillis());
                    if (setsystemgestureexclusionrects != null) {
                        build = (getMaximumPinTry + 11) % 128;
                        if (((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))) != null) {
                            int i8 = build;
                            getMaximumPinTry = (((i8 ^ 16) + ((i8 & 16) << 1)) - 1) % 128;
                            if (((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).AlternateContactlessPaymentDataJson() != null) {
                                int i9 = build;
                                int i10 = i9 & 113;
                                int i11 = i9 | 113;
                                getMaximumPinTry = ((i10 & i11) + (i11 | i10)) % 128;
                                com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).AlternateContactlessPaymentDataJson()}, -159678133, 159678137, java.lang.System.identityHashCode(setpreferkeepclear));
                                getAckAlwaysRequiredIfCurrencyProvided().writeReplace(com.payair.hce.setHandwritingDelegatorCallback.writeReplace);
                                int i12 = build;
                                getMaximumPinTry = ((((i12 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1) - (i12 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)) - 1) % 128;
                                return null;
                            }
                        }
                    }
                    if (((java.lang.String) com.payair.hce.setWebChromeClient.values(new java.lang.Object[0], -650477225, 650477228, (int) java.lang.System.currentTimeMillis())) == null) {
                        int i13 = getMaximumPinTry;
                        build = ((i13 & 95) + (i13 | 95)) % 128;
                    }
                    com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, null}, -159678133, 159678137, java.lang.System.identityHashCode(setpreferkeepclear));
                    getAckAlwaysRequiredIfCurrencyProvided().valueOf(new java.lang.String(bArr));
                    getAckAlwaysRequiredIfCurrencyProvided().writeReplace(com.payair.hce.setHandwritingDelegatorCallback.values);
                    int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                    int i14 = (-887095297) | currentTimeMillis;
                    int i15 = ~i14;
                    int i16 = ((i14 | i15) & i15) * (-301);
                    int i17 = 1622755012 ^ i16;
                    int i18 = ((i16 & 1622755012) | i17) << 1;
                    int i19 = -i17;
                    int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                    int i21 = currentTimeMillis & (-1125635573);
                    int i22 = (~i21) & (currentTimeMillis | (-1125635573));
                    int i23 = ~currentTimeMillis;
                    int i24 = (i21 ^ i22) | (i21 & i22);
                    int i25 = ~i24;
                    int i26 = (i24 | i25) & i25;
                    int i27 = (i23 | currentTimeMillis) & i23;
                    int i28 = i27 & (-1978962385);
                    int i29 = (i27 | (-1978962385)) & (~i28);
                    int i30 = ~((i29 ^ i28) | (i29 & i28));
                    int i31 = ((~i30) & i26) | ((~i26) & i30);
                    int i32 = i26 & i30;
                    int i33 = i20 & (((i32 ^ i31) | (i32 & i31)) * (-301));
                    int i34 = (i23 & 1978962384) | ((-1978962385) & currentTimeMillis);
                    int i35 = currentTimeMillis & 1978962384;
                    int i36 = ~((i35 ^ i34) | (i35 & i34));
                    int i37 = -(-(((i36 ^ (-1125635573)) | (i36 & (-1125635573))) * 301));
                    int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                    int i38 = (-1074830337) & currentTimeMillis2;
                    int i39 = ((-1074830337) | currentTimeMillis2) & (~i38);
                    int i40 = ~currentTimeMillis2;
                    int i41 = ((~((i38 ^ i39) | (i39 & i38))) * (-301)) - 321095886;
                    int i42 = currentTimeMillis2 | 1276951568;
                    int i43 = ~i42;
                    int i44 = (i42 | i43) & i43;
                    int i45 = (i40 & 1112595567) | ((~i40) & (-1112595568));
                    int i46 = i40 & (-1112595568);
                    int i47 = ~((i46 ^ i45) | (i46 & i45));
                    int i48 = -(-(((i47 ^ i44) | (i47 & i44)) * (-301)));
                    int i49 = ((i41 | i48) << 1) - (i41 ^ i48);
                    int i50 = ~((currentTimeMillis2 ^ 1112595567) | (currentTimeMillis2 & 1112595567));
                    int i51 = i50 ^ 1276951568;
                    int i52 = i50 & 1276951568;
                    int i53 = -(-(((i52 ^ i51) | (i52 & i51)) * 301));
                    if ((((i33 - (~((r1 ^ i20) | i33))) - 1) - (~i37)) - 1 <= ((i49 | i53) << 1) - (((~i53) & i49) | ((~i49) & i53))) {
                        return null;
                    }
                    throw null;
                }
            }
            if (setpreferkeepclear != null) {
                int i54 = build;
                int i55 = i54 & 57;
                getMaximumPinTry = (((i54 | 57) & (~i55)) + (i55 << 1)) % 128;
                com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear, null}, -159678133, 159678137, java.lang.System.identityHashCode(setpreferkeepclear));
                int i56 = getMaximumPinTry;
                int i57 = ((i56 | 61) << 1) - (i56 ^ 61);
                build = i57 % 128;
                if (i57 % 2 != 0) {
                    int i58 = 3 / 5;
                }
            }
            if (((java.lang.String) com.payair.hce.setWebChromeClient.values(new java.lang.Object[0], -650477225, 650477228, (int) java.lang.System.currentTimeMillis())) == null) {
                int i59 = getMaximumPinTry;
                int i60 = i59 & 103;
                build = (((i59 | 103) & (~i60)) + (i60 << 1)) % 128;
                com.payair.hce.setWebChromeClient.values(new java.lang.Object[]{(android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())}, 1176974760, -1176974759, (int) java.lang.System.currentTimeMillis());
                int i61 = build;
                int i62 = ((i61 ^ 23) | (i61 & 23)) << 1;
                int i63 = -((i61 & (-24)) | ((~i61) & 23));
                getMaximumPinTry = ((i62 ^ i63) + ((i63 & i62) << 1)) % 128;
            }
            getAckAlwaysRequiredIfCurrencyProvided().AlternateContactlessPaymentDataJson();
            getAckAlwaysRequiredIfCurrencyProvided().RecordsJson();
            int i64 = getMaximumPinTry;
            int i65 = i64 & 73;
            int i66 = (i64 | 73) & (~i65);
            int i67 = -(-(i65 << 1));
            build = ((i66 ^ i67) + ((i66 & i67) << 1)) % 128;
            return null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object SdkCoreMagstripeCvmIssuerOptionsImpl(java.lang.Object[] objArr) {
        int i = getMaximumPinTry;
        int i2 = i ^ 99;
        int i3 = ((i & 99) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        build = i5;
        java.lang.String str = getPaymentFci;
        int i6 = i5 & 83;
        int i7 = (i5 ^ 83) | i6;
        int i8 = (i6 & i7) + (i6 | i7);
        getMaximumPinTry = i8 % 128;
        if (i8 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r2.intValue() == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.lang.Integer getAlternateContactlessPaymentData() {
        int i = build;
        int i2 = ((i | 118) << 1) - (i ^ 118);
        int i3 = (~i2) + (i2 << 1);
        getMaximumPinTry = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        java.lang.Integer num = SdkCoreBusinessLogicModuleImpl;
        if (num != null) {
            int i4 = i + 79;
            getMaximumPinTry = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
        SdkCoreBusinessLogicModuleImpl = java.lang.Integer.valueOf(((java.lang.Integer) com.payair.hce.setLeft.values(new java.lang.Object[]{"FlavourID", 0, ((android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0)}, 654732084, -654732078, 0)).intValue());
        int i5 = build;
        int i6 = i5 & 73;
        int i7 = (i5 ^ 73) | i6;
        getMaximumPinTry = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
        java.lang.Integer num2 = SdkCoreBusinessLogicModuleImpl;
        int i8 = getMaximumPinTry + 99;
        build = i8 % 128;
        if (i8 % 2 == 0) {
            return num2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getAdditionalCheckTable(java.lang.Object[] objArr) {
        int i = build;
        int i2 = ((i | 51) << 1) - ((i & (-52)) | ((~i) & 51));
        getMaximumPinTry = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getPpseFci(java.lang.Object[] objArr) {
        int i = getMaximumPinTry;
        int i2 = i & 109;
        int i3 = (i ^ 109) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        build = i4 % 128;
        byte[] bArr = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 685917425, -685917415, (int) java.lang.System.currentTimeMillis());
        if (setsystemgestureexclusionrects != null) {
            int i5 = build;
            int i6 = (((i5 & (-32)) | ((~i5) & 31)) - (~(-(-((i5 & 31) << 1))))) - 1;
            getMaximumPinTry = i6 % 128;
            if (i6 % 2 == 0) {
                ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).AlternateContactlessPaymentDataJson();
                throw null;
            }
            bArr = ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).AlternateContactlessPaymentDataJson().getBytes();
        } else {
            java.lang.String writeReplace2 = getAckAlwaysRequiredIfCurrencyProvided().writeReplace();
            if (writeReplace2 != null) {
                int i7 = build;
                getMaximumPinTry = (((i7 & (-6)) | ((~i7) & 5)) + ((i7 & 5) << 1)) % 128;
                if (getAckAlwaysRequiredIfCurrencyProvided().valueOf() == com.payair.hce.setHandwritingDelegatorCallback.values) {
                    int i8 = build;
                    int i9 = (((i8 & (-12)) | ((~i8) & 11)) - (~((i8 & 11) << 1))) - 1;
                    getMaximumPinTry = i9 % 128;
                    if (i9 % 2 == 0) {
                        throw null;
                    }
                    bArr = writeReplace2.getBytes();
                    int i10 = getMaximumPinTry;
                    build = ((i10 & 17) + (i10 | 17)) % 128;
                }
            }
        }
        int i11 = getMaximumPinTry;
        int i12 = i11 & 15;
        int i13 = (i11 | 15) & (~i12);
        int i14 = -(-(i12 << 1));
        int i15 = (i13 & i14) + (i13 | i14);
        build = i15 % 128;
        if (i15 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getPinIvCvc3Track2(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        getMaximumPinTry = (build + 35) % 128;
        try {
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 37, 5050 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getMethod("AlternateContactlessPaymentDataJson", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
            }
            if (bArr != null) {
                int i = build;
                int i2 = i ^ 65;
                int i3 = ((((i & 65) | i2) << 1) - (~(-i2))) - 1;
                getMaximumPinTry = i3 % 128;
                if (i3 % 2 == 0) {
                    int length = bArr.length;
                    throw new java.lang.ArithmeticException();
                }
                if (bArr.length != 0) {
                    com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{new java.lang.String(bArr)}, 1833928639, -1833928629, (int) java.lang.System.currentTimeMillis());
                    if (setsystemgestureexclusionrects != null) {
                        int i4 = getMaximumPinTry;
                        int i5 = (i4 ^ 65) + ((i4 & 65) << 1);
                        build = i5 % 128;
                        if (i5 % 2 == 0) {
                            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setsystemgestureexclusionrects}, 961714039, -961714037, (int) java.lang.System.currentTimeMillis());
                            getAckAlwaysRequiredIfCurrencyProvided().values(com.payair.hce.setHandwritingDelegatorCallback.writeReplace);
                            return null;
                        }
                        com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setsystemgestureexclusionrects}, 961714039, -961714037, (int) java.lang.System.currentTimeMillis());
                        getAckAlwaysRequiredIfCurrencyProvided().values(com.payair.hce.setHandwritingDelegatorCallback.writeReplace);
                        throw null;
                    }
                    com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{null}, 961714039, -961714037, (int) java.lang.System.currentTimeMillis());
                    getAckAlwaysRequiredIfCurrencyProvided().AlternateContactlessPaymentDataJson(new java.lang.String(bArr));
                    getAckAlwaysRequiredIfCurrencyProvided().values(com.payair.hce.setHandwritingDelegatorCallback.values);
                    int i6 = build + 74;
                    int i7 = (~i6) + (i6 << 1);
                    getMaximumPinTry = i7 % 128;
                    if (i7 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
            }
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{null}, 961714039, -961714037, (int) java.lang.System.currentTimeMillis());
            getAckAlwaysRequiredIfCurrencyProvided().getProfileVersion();
            getAckAlwaysRequiredIfCurrencyProvided().SdkCoreAlternateContactlessPaymentDataImpl();
            com.payair.hce.setHandwritingDelegatorCallback values2 = getAckAlwaysRequiredIfCurrencyProvided().values();
            java.lang.String DigitizedCardProfile2 = getAckAlwaysRequiredIfCurrencyProvided().DigitizedCardProfile();
            if (values2 == com.payair.hce.setHandwritingDelegatorCallback.values) {
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i8 = currentTimeMillis & (-2117705761);
                int i9 = (~i8) & (currentTimeMillis | (-2117705761));
                int i10 = ~((i9 ^ i8) | (i9 & i8));
                int i11 = 605035722 - (~(-(-(((i10 ^ (-528682149)) | (i10 & (-528682149))) * (-668)))));
                int i12 = currentTimeMillis & (-528682149);
                int i13 = ~(i12 | ((~i12) & (currentTimeMillis | (-528682149))));
                int i14 = ((~i13) & (-2117705761)) | (i13 & 2117705760);
                int i15 = i13 & (-2117705761);
                int i16 = -(~(((i15 & i14) | (i14 ^ i15)) * 1336));
                int i17 = (-2) - (~((i11 ^ i16) + ((i16 & i11) << 1)));
                int i18 = ((~currentTimeMillis) & (-2117705761)) | (currentTimeMillis & 2117705760);
                int i19 = (i18 ^ i8) | (i18 & i8);
                int i20 = (528682148 & i19) | ((~i19) & (-528682149));
                int i21 = i19 & (-528682149);
                int i22 = ((i21 ^ i20) | (i21 & i20)) * 668;
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i23 = currentTimeMillis2 ^ 1355912300;
                int i24 = 1355912300 & currentTimeMillis2;
                int i25 = ~((i24 ^ i23) | (i24 & i23));
                int i26 = i25 & (-1406375808);
                int i27 = (i25 | (-1406375808)) & (~i26);
                int i28 = ((i27 ^ i26) | (i27 & i26)) * 1504;
                int i29 = ((i28 ^ 1079828615) | (i28 & 1079828615)) << 1;
                int i30 = -(((~i28) & 1079828615) | ((-1079828616) & i28));
                int i31 = (i29 & i30) + (i30 | i29);
                int i32 = (~((currentTimeMillis2 ^ (-50463508)) | (currentTimeMillis2 & (-50463508)))) * (-1504);
                int i33 = ((~i32) & i31) | ((~i31) & i32);
                int i34 = (i32 & i31) << 1;
                int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                int i36 = i35 ^ (-703065200);
                int i37 = -(-(((-703065200) & i35) << 1));
                if ((i17 ^ i22) + ((i22 & i17) << 1) <= ((i36 | i37) << 1) - (i37 ^ i36)) {
                    throw null;
                }
                if (DigitizedCardProfile2 != null) {
                    int i38 = getMaximumPinTry;
                    build = ((-2) - (~((i38 & 12) + (i38 | 12)))) % 128;
                    int i39 = build;
                    getMaximumPinTry = ((((i39 ^ 23) | (i39 & 23)) << 1) - ((i39 & (-24)) | ((~i39) & 23))) % 128;
                    return null;
                }
            }
            com.payair.hce.setWebChromeClient.values(new java.lang.Object[]{(android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())}, 1176974760, -1176974759, (int) java.lang.System.currentTimeMillis());
            int i40 = build;
            getMaximumPinTry = ((i40 ^ 125) + ((i40 & 125) << 1)) % 128;
            return null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object getCiacDecline(java.lang.Object[] objArr) {
        int i = build;
        int i2 = i & 21;
        int i3 = (((i | 21) & (~i2)) - (~(i2 << 1))) - 1;
        int i4 = i3 % 128;
        getMaximumPinTry = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        android.content.Context context = SdkCoreAlternateContactlessPaymentDataImpl;
        int i5 = i4 ^ 25;
        int i6 = -(-((i4 & 25) << 1));
        build = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
        return context;
    }

    private static /* synthetic */ java.lang.Object getApplicationLifeCycleData(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{new java.lang.String(bArr)}, 1833928639, -1833928629, (int) java.lang.System.currentTimeMillis());
        if (setsystemgestureexclusionrects != null) {
            int i = build;
            int i2 = i ^ 89;
            int i3 = ((i & 89) | i2) << 1;
            int i4 = -i2;
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            getMaximumPinTry = i5 % 128;
            if (i5 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))) != null) {
                build = ((-2) - (~(getMaximumPinTry + 76))) % 128;
                if (((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).RecordsJson() != null) {
                    int i6 = build;
                    int i7 = ((i6 ^ 63) - (~(-(-((i6 & 63) << 1))))) - 1;
                    getMaximumPinTry = i7 % 128;
                    if (i7 % 2 == 0) {
                        ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).RecordsJson();
                        throw null;
                    }
                    java.util.Iterator<com.payair.hce.RequestCompleteTokenizeDtoPresentationType> RecordsJson2 = ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).RecordsJson();
                    int i8 = build;
                    getMaximumPinTry = (((i8 | 107) << 1) - (i8 ^ 107)) % 128;
                    while (RecordsJson2.hasNext()) {
                        int i9 = getMaximumPinTry;
                        int i10 = i9 & 121;
                        int i11 = -(-((i9 ^ 121) | i10));
                        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                        build = i12 % 128;
                        if (i12 % 2 != 0) {
                            arrayList.add(RecordsJson2.next());
                            throw null;
                        }
                        arrayList.add(RecordsJson2.next());
                        getMaximumPinTry = (build + 39) % 128;
                    }
                }
            }
        }
        int size = arrayList.size();
        int i13 = build;
        int i14 = (i13 & (-2)) | ((~i13) & 1);
        int i15 = (i13 & 1) << 1;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        getMaximumPinTry = i16 % 128;
        if (i16 % 2 != 0) {
            return java.lang.Integer.valueOf(size);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getGpoResponse(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        int i = getMaximumPinTry;
        int i2 = (i & 29) + (i | 29);
        build = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                throw null;
            }
            if (((java.lang.Boolean) com.payair.hce.setScreenReaderFocusable.writeReplace(new java.lang.Object[]{context}, -71797868, 71797870, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                int i3 = build;
                int i4 = (i3 & 98) + (i3 | 98);
                getMaximumPinTry = ((~i4) + (i4 << 1)) % 128;
                return null;
            }
            com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{new java.lang.String(bArr)}, 1833928639, -1833928629, (int) java.lang.System.currentTimeMillis());
            if (setsystemgestureexclusionrects != null) {
                build = (getMaximumPinTry + 13) % 128;
                if (((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))) != null) {
                    int i5 = getMaximumPinTry;
                    int i6 = i5 & 109;
                    int i7 = -(-((i5 ^ 109) | i6));
                    int i8 = (i6 & i7) + (i7 | i6);
                    build = i8 % 128;
                    if (i8 % 2 != 0) {
                        ((com.payair.hce.setTheme) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1016779127, 1016779151, (int) java.lang.System.currentTimeMillis())).writeReplace().valueOf((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects)));
                        throw new java.lang.NullPointerException();
                    }
                    ((com.payair.hce.setTheme) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1016779127, 1016779151, (int) java.lang.System.currentTimeMillis())).writeReplace().valueOf((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects)));
                    int i9 = getMaximumPinTry;
                    int i10 = (i9 & (-116)) | ((~i9) & 115);
                    int i11 = (i9 & 115) << 1;
                    build = ((i10 & i11) + (i11 | i10)) % 128;
                    return null;
                }
            }
            com.payair.hce.setWebChromeClient.values(new java.lang.Object[]{context, new java.lang.String(bArr), com.visa.cbp.sdk.facade.data.TokenStatus.DELETED}, -1894136898, 1894136898, (int) java.lang.System.currentTimeMillis());
            int i12 = getMaximumPinTry + 29;
            build = i12 % 128;
            if (i12 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        } catch (com.payair.hce.setSuccessful unused) {
            return null;
        }
    }

    private static /* synthetic */ java.lang.Object SdkCoreCardRiskManagementDataImpl(java.lang.Object[] objArr) {
        int i;
        byte[] bArr = (byte[]) objArr[0];
        com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{new java.lang.String(bArr)}, 1833928639, -1833928629, (int) java.lang.System.currentTimeMillis());
        if (setsystemgestureexclusionrects == null) {
            com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects2 = (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{new java.lang.String(bArr), java.lang.Boolean.TRUE}, -757430979, 757431035, (int) java.lang.System.currentTimeMillis());
            if (setsystemgestureexclusionrects2 != null) {
                int i2 = build;
                int i3 = i2 & 119;
                int i4 = ((i2 ^ 119) | i3) << 1;
                int i5 = -((i2 | 119) & (~i3));
                getMaximumPinTry = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
                i = ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects2}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects2))).SdkCoreAlternateContactlessPaymentDataImpl();
                int i6 = build;
                int i7 = i6 ^ 43;
                int i8 = (i6 & 43) << 1;
                getMaximumPinTry = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
            } else {
                int i9 = build;
                getMaximumPinTry = ((i9 & 23) + (i9 | 23)) % 128;
                i = -1;
            }
        } else {
            int i10 = getMaximumPinTry;
            int i11 = (i10 & (-40)) | ((~i10) & 39);
            int i12 = (i10 & 39) << 1;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            build = i13 % 128;
            if (i13 % 2 != 0) {
                ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).SdkCoreAlternateContactlessPaymentDataImpl();
                throw null;
            }
            i = ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).SdkCoreAlternateContactlessPaymentDataImpl();
        }
        getMaximumPinTry = (build + 3) % 128;
        return java.lang.Integer.valueOf(i);
    }

    private static /* synthetic */ java.lang.Object getRecordValue(java.lang.Object[] objArr) {
        long longValue = ((java.lang.Number) objArr[0]).longValue();
        int i = build;
        getMaximumPinTry = (((i | 113) << 1) - ((i & (-114)) | ((~i) & 113))) % 128;
        if (((com.payair.hce.setHovered) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2032457647, -2032457626, (int) java.lang.System.currentTimeMillis())) != null) {
            int i2 = build;
            int i3 = ((i2 | 111) << 1) - (i2 ^ 111);
            getMaximumPinTry = i3 % 128;
            if (i3 % 2 == 0) {
                ((com.payair.hce.setHovered) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2032457647, -2032457626, (int) java.lang.System.currentTimeMillis())).writeReplace(longValue);
                throw null;
            }
            ((com.payair.hce.setHovered) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2032457647, -2032457626, (int) java.lang.System.currentTimeMillis())).writeReplace(longValue);
            int i4 = build;
            getMaximumPinTry = (((i4 & (-68)) | ((~i4) & 67)) + ((i4 & 67) << 1)) % 128;
        }
        int i5 = build;
        getMaximumPinTry = (((i5 ^ 26) + ((i5 & 26) << 1)) - 1) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects;
        int i = build;
        int i2 = i & 41;
        int i3 = i | 41;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getMaximumPinTry = i4 % 128;
        if (i4 % 2 != 0) {
            com.payair.hce.setImportantForAccessibility.DigitizedCardProfile().DigitizedCardProfile();
            com.payair.hce.setHandwritingDelegatorCallback valueOf2 = SdkCoreContactlessPaymentDataImpl.valueOf();
            if (valueOf2 == null) {
                int i5 = getMaximumPinTry;
                int i6 = i5 & 39;
                int i7 = -(-((i5 ^ 39) | i6));
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                build = i8 % 128;
                if (i8 % 2 == 0) {
                    valueOf2 = SdkCoreContactlessPaymentDataImpl.values();
                } else {
                    SdkCoreContactlessPaymentDataImpl.values();
                    throw null;
                }
            }
            if (valueOf2 == com.payair.hce.setHandwritingDelegatorCallback.writeReplace) {
                int i9 = build;
                int i10 = i9 ^ 7;
                int i11 = (i9 & 7) << 1;
                getMaximumPinTry = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
                if (((byte[]) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -428114051, 428114062, (int) java.lang.System.currentTimeMillis())) != null && (setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{new java.lang.String(com.payair.hce.setSaveFromParentEnabled.getContent())}, 2012165714, -2012165692, (int) java.lang.System.currentTimeMillis())) != null) {
                    int i12 = getMaximumPinTry;
                    int i13 = (i12 & (-54)) | ((~i12) & 53);
                    int i14 = -(-((i12 & 53) << 1));
                    int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                    build = i15 % 128;
                    if (i15 % 2 == 0) {
                        com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -1562720689, 1562720690, java.lang.System.identityHashCode(setsystemgestureexclusionrects));
                    } else {
                        com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -1562720689, 1562720690, java.lang.System.identityHashCode(setsystemgestureexclusionrects));
                        throw new java.lang.ArithmeticException();
                    }
                }
                com.payair.hce.setImportantForAccessibility.DigitizedCardProfile().DigitizedCardProfile();
                com.payair.hce.HCEPayment.valueOf(new java.lang.Object[]{-1L}, -960893514, 960893514, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 526228066, -526228032, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{null}, -503494143, 503494150, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.FALSE}, -1511834785, 1511834800, (int) java.lang.System.currentTimeMillis());
                int i16 = getMaximumPinTry;
                build = ((i16 & 33) + (i16 | 33)) % 128;
                return null;
            }
            if (valueOf2 == com.payair.hce.setHandwritingDelegatorCallback.values) {
                int i17 = getMaximumPinTry;
                int i18 = i17 & 49;
                int i19 = (i17 | 49) & (~i18);
                int i20 = -(-(i18 << 1));
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                build = i21 % 128;
                if (i21 % 2 != 0) {
                    com.payair.hce.setSelector setselector = (com.payair.hce.setSelector) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], 1953461450, -1953461436, (int) java.lang.System.currentTimeMillis());
                    com.payair.hce.setSelector.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setselector, (android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis()), java.lang.Boolean.FALSE}, -1928806931, 1928806932, java.lang.System.identityHashCode(setselector));
                    com.payair.hce.setSelector.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setselector, (android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis()), null}, -27651894, 27651898, java.lang.System.identityHashCode(setselector));
                    com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.FALSE}, -1511834785, 1511834800, (int) java.lang.System.currentTimeMillis());
                } else {
                    com.payair.hce.setSelector setselector2 = (com.payair.hce.setSelector) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], 1953461450, -1953461436, (int) java.lang.System.currentTimeMillis());
                    com.payair.hce.setSelector.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setselector2, (android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis()), java.lang.Boolean.FALSE}, -1928806931, 1928806932, java.lang.System.identityHashCode(setselector2));
                    com.payair.hce.setSelector.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setselector2, (android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis()), null}, -27651894, 27651898, java.lang.System.identityHashCode(setselector2));
                    com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.FALSE}, -1511834785, 1511834800, (int) java.lang.System.currentTimeMillis());
                }
                int i22 = getMaximumPinTry;
                int i23 = (i22 & (-122)) | ((~i22) & 121);
                int i24 = -(-((i22 & 121) << 1));
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                build = i25 % 128;
                if (i25 % 2 != 0) {
                    int i26 = 3 / 3;
                }
            }
            getMaximumPinTry = (build + 93) % 128;
            return null;
        }
        com.payair.hce.setImportantForAccessibility.DigitizedCardProfile().DigitizedCardProfile();
        SdkCoreContactlessPaymentDataImpl.valueOf();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0eff A[Catch: all -> 0x1409, TryCatch #2 {all -> 0x1409, blocks: (B:8:0x03d5, B:10:0x03f7, B:11:0x044e, B:21:0x0524, B:23:0x0539, B:24:0x0572, B:26:0x0702, B:28:0x0711, B:29:0x0744, B:35:0x0824, B:37:0x0842, B:38:0x0885, B:48:0x0b23, B:50:0x0b3d, B:51:0x0b7b, B:57:0x0e4a, B:59:0x0e68, B:60:0x0ec0, B:62:0x100e, B:64:0x101d, B:65:0x1051, B:67:0x106d, B:68:0x10a5, B:72:0x10ce, B:74:0x10dd, B:75:0x1111, B:77:0x113a, B:78:0x1195, B:83:0x119d, B:85:0x11ac, B:86:0x11df, B:88:0x1208, B:89:0x1264, B:92:0x12d1, B:94:0x12e0, B:95:0x1313, B:97:0x133c, B:98:0x1393, B:109:0x0ee1, B:111:0x0eff, B:112:0x0f53, B:121:0x0b8c, B:123:0x0ba6, B:124:0x0be2, B:126:0x0bef, B:128:0x0c02, B:129:0x0c33, B:131:0x0c3d, B:133:0x0c50, B:134:0x0c89, B:138:0x0d05, B:140:0x0d1f, B:141:0x0d5b, B:167:0x0583, B:169:0x0599, B:170:0x05d1, B:175:0x06a2, B:177:0x06b8, B:178:0x06f0, B:187:0x02d9, B:189:0x02f3, B:190:0x0328, B:191:0x03c6, B:193:0x0370, B:195:0x038a, B:196:0x03bf), top: B:2:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0bea  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0711 A[Catch: all -> 0x1409, TryCatch #2 {all -> 0x1409, blocks: (B:8:0x03d5, B:10:0x03f7, B:11:0x044e, B:21:0x0524, B:23:0x0539, B:24:0x0572, B:26:0x0702, B:28:0x0711, B:29:0x0744, B:35:0x0824, B:37:0x0842, B:38:0x0885, B:48:0x0b23, B:50:0x0b3d, B:51:0x0b7b, B:57:0x0e4a, B:59:0x0e68, B:60:0x0ec0, B:62:0x100e, B:64:0x101d, B:65:0x1051, B:67:0x106d, B:68:0x10a5, B:72:0x10ce, B:74:0x10dd, B:75:0x1111, B:77:0x113a, B:78:0x1195, B:83:0x119d, B:85:0x11ac, B:86:0x11df, B:88:0x1208, B:89:0x1264, B:92:0x12d1, B:94:0x12e0, B:95:0x1313, B:97:0x133c, B:98:0x1393, B:109:0x0ee1, B:111:0x0eff, B:112:0x0f53, B:121:0x0b8c, B:123:0x0ba6, B:124:0x0be2, B:126:0x0bef, B:128:0x0c02, B:129:0x0c33, B:131:0x0c3d, B:133:0x0c50, B:134:0x0c89, B:138:0x0d05, B:140:0x0d1f, B:141:0x0d5b, B:167:0x0583, B:169:0x0599, B:170:0x05d1, B:175:0x06a2, B:177:0x06b8, B:178:0x06f0, B:187:0x02d9, B:189:0x02f3, B:190:0x0328, B:191:0x03c6, B:193:0x0370, B:195:0x038a, B:196:0x03bf), top: B:2:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0dca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x101d A[Catch: all -> 0x1409, TryCatch #2 {all -> 0x1409, blocks: (B:8:0x03d5, B:10:0x03f7, B:11:0x044e, B:21:0x0524, B:23:0x0539, B:24:0x0572, B:26:0x0702, B:28:0x0711, B:29:0x0744, B:35:0x0824, B:37:0x0842, B:38:0x0885, B:48:0x0b23, B:50:0x0b3d, B:51:0x0b7b, B:57:0x0e4a, B:59:0x0e68, B:60:0x0ec0, B:62:0x100e, B:64:0x101d, B:65:0x1051, B:67:0x106d, B:68:0x10a5, B:72:0x10ce, B:74:0x10dd, B:75:0x1111, B:77:0x113a, B:78:0x1195, B:83:0x119d, B:85:0x11ac, B:86:0x11df, B:88:0x1208, B:89:0x1264, B:92:0x12d1, B:94:0x12e0, B:95:0x1313, B:97:0x133c, B:98:0x1393, B:109:0x0ee1, B:111:0x0eff, B:112:0x0f53, B:121:0x0b8c, B:123:0x0ba6, B:124:0x0be2, B:126:0x0bef, B:128:0x0c02, B:129:0x0c33, B:131:0x0c3d, B:133:0x0c50, B:134:0x0c89, B:138:0x0d05, B:140:0x0d1f, B:141:0x0d5b, B:167:0x0583, B:169:0x0599, B:170:0x05d1, B:175:0x06a2, B:177:0x06b8, B:178:0x06f0, B:187:0x02d9, B:189:0x02f3, B:190:0x0328, B:191:0x03c6, B:193:0x0370, B:195:0x038a, B:196:0x03bf), top: B:2:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x106d A[Catch: all -> 0x1409, TryCatch #2 {all -> 0x1409, blocks: (B:8:0x03d5, B:10:0x03f7, B:11:0x044e, B:21:0x0524, B:23:0x0539, B:24:0x0572, B:26:0x0702, B:28:0x0711, B:29:0x0744, B:35:0x0824, B:37:0x0842, B:38:0x0885, B:48:0x0b23, B:50:0x0b3d, B:51:0x0b7b, B:57:0x0e4a, B:59:0x0e68, B:60:0x0ec0, B:62:0x100e, B:64:0x101d, B:65:0x1051, B:67:0x106d, B:68:0x10a5, B:72:0x10ce, B:74:0x10dd, B:75:0x1111, B:77:0x113a, B:78:0x1195, B:83:0x119d, B:85:0x11ac, B:86:0x11df, B:88:0x1208, B:89:0x1264, B:92:0x12d1, B:94:0x12e0, B:95:0x1313, B:97:0x133c, B:98:0x1393, B:109:0x0ee1, B:111:0x0eff, B:112:0x0f53, B:121:0x0b8c, B:123:0x0ba6, B:124:0x0be2, B:126:0x0bef, B:128:0x0c02, B:129:0x0c33, B:131:0x0c3d, B:133:0x0c50, B:134:0x0c89, B:138:0x0d05, B:140:0x0d1f, B:141:0x0d5b, B:167:0x0583, B:169:0x0599, B:170:0x05d1, B:175:0x06a2, B:177:0x06b8, B:178:0x06f0, B:187:0x02d9, B:189:0x02f3, B:190:0x0328, B:191:0x03c6, B:193:0x0370, B:195:0x038a, B:196:0x03bf), top: B:2:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x10b4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x126e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.google.firebase.messaging.RemoteMessage remoteMessage;
        java.lang.Integer num;
        android.content.Context context;
        byte b;
        char c;
        byte b2;
        java.lang.Object[] objArr2;
        int i;
        int i2;
        int i3;
        java.lang.Object obj;
        long j;
        android.content.Context context2;
        java.lang.Object[] objArr3;
        char c2;
        int i4;
        int i5;
        long j2;
        java.lang.Object obj2;
        java.lang.Object invoke;
        java.lang.Object obj3;
        int intValue;
        java.lang.Object obj4;
        java.lang.Object[] objArr4;
        java.lang.Object invoke2;
        com.google.firebase.messaging.RemoteMessage remoteMessage2 = (com.google.firebase.messaging.RemoteMessage) objArr[0];
        android.content.Context context3 = (android.content.Context) objArr[1];
        int i6 = getMaximumPinTry;
        int i7 = i6 ^ 91;
        int i8 = ((i6 & 91) | i7) << 1;
        int i9 = -i7;
        build = ((i8 & i9) + (i8 | i9)) % 128;
        int i10 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i11 = i10 * 399;
        int i12 = i11 & 9177;
        int i13 = (i11 | 9177) & (~i12);
        int i14 = i12 << 1;
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        int i16 = ~i10;
        int i17 = i16 & 23;
        int i18 = (~i17) & (i16 | 23);
        int i19 = (i17 ^ i18) | (i17 & i18);
        int i20 = ~i19;
        int i21 = (i19 | i20) & i20;
        int i22 = i10 & 23;
        int i23 = (i16 & (-24)) | i22;
        int i24 = i10 & (-24);
        int i25 = (i23 ^ i24) | (i23 & i24);
        int i26 = ~i25;
        int i27 = (i26 | i25) & i26;
        int i28 = (i27 ^ i21) | (i27 & i21);
        int i29 = ~currentTimeMillis;
        int i30 = i29 & (-24);
        int i31 = i30 | (currentTimeMillis & 23);
        int i32 = currentTimeMillis & (-24);
        int i33 = ~((i32 & i31) | (i31 ^ i32));
        int i34 = ((~i33) & i28) | ((~i28) & i33);
        int i35 = i33 & i28;
        int i36 = ((i34 ^ i35) | (i35 & i34)) * 398;
        int i37 = i15 & i36;
        int i38 = (i36 ^ i15) | i37;
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        int i40 = (~i22) & (i10 | 23);
        int i41 = ((i40 ^ i22) | (i22 & i40)) * (-1194);
        int i42 = i39 | i41;
        int i43 = (i42 << 1) - ((~(i41 & i39)) & i42);
        int i44 = (i29 ^ (-24)) | i30;
        int i45 = ~i44;
        int i46 = (i44 | i45) & i45;
        int i47 = ((~i20) & i46) | ((~i46) & i20);
        int i48 = i46 & i20;
        int i49 = (i48 ^ i47) | (i48 & i47);
        int i50 = -(-(((i49 ^ i26) | (i26 & i49)) * 398));
        int i51 = (i43 | i50) << 1;
        int i52 = -(((~i50) & i43) | ((~i43) & i50));
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b("ᜭ\uee81즞\ue272縌ঐ፮뀜큻쐎ꫮ⟝竞竁㵿屸\ufde6턩繾꠆쾦彳", (i51 ^ i52) + ((i52 & i51) << 1), objArr5);
        java.lang.String str = (java.lang.String) objArr5[0];
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b("庹뿀\ue1a9ླྀ냟씳ྰꈈㆇ勅\uf5f4娹\ud9d8∾濳\ueb76", (-2) - (~(15 - (~(-android.graphics.Color.blue(0))))), objArr6);
        java.lang.String str2 = (java.lang.String) objArr6[0];
        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47, 707 - (android.os.Process.myTid() >> 22), (char) (34284 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
        int i53 = $$b;
        byte b3 = (byte) (i53 & 125);
        byte[] bArr = $$a;
        byte b4 = bArr[2];
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        c(b3, b4, (byte) (b4 | 76), objArr7);
        long j3 = cls.getField((java.lang.String) objArr7[0]).getLong(null);
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                if (j3 != -1) {
                                    int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                                    int i54 = ~currentTimeMillis2;
                                    remoteMessage = remoteMessage2;
                                    int i55 = ~((i54 ^ (-921434046)) | (i54 & (-921434046)));
                                    context = context3;
                                    int i56 = ((i55 ^ 849406218) | (i55 & 849406218)) * 764;
                                    num = 1;
                                    int i57 = ((~i56) & (-485580140)) | (i56 & 485580139);
                                    int i58 = -(-((i56 & (-485580140)) << 1));
                                    int i59 = (currentTimeMillis2 | i54) & i54;
                                    int i60 = ~((i59 ^ 849406218) | (849406218 & i59));
                                    int i61 = (-921436096) ^ i60;
                                    int i62 = i60 & (-921436096);
                                    int i63 = (((i57 & i58) + (i57 | i58)) - (~(((i62 & i61) | (i61 ^ i62)) * (-1528)))) - 1;
                                    int i64 = -(-(((i55 ^ (-72031928)) | ((-72031928) & i55)) * 764));
                                    int i65 = i63 ^ i64;
                                    int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                                    int i66 = ~currentTimeMillis3;
                                    int i67 = i66 & (i66 | currentTimeMillis3);
                                    int i68 = 219364127 & i67;
                                    b = b3;
                                    int i69 = (i67 | 219364127) & (~i68);
                                    int i70 = -(-(((i68 & i69) | (i68 ^ i69)) * (-757)));
                                    int i71 = (-440668386) & i70;
                                    int i72 = ((i70 ^ (-440668386)) | i71) << 1;
                                    int i73 = -((i70 | (-440668386)) & (~i71));
                                    int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
                                    int i75 = (~((1301773183 & currentTimeMillis3) | (currentTimeMillis3 ^ 1301773183))) * 1514;
                                    int i76 = i74 ^ i75;
                                    int i77 = (((i75 & i74) | i76) << 1) - i76;
                                    int i78 = ((~i67) & 1284983672) | (i67 & (-1284983673));
                                    int i79 = i67 & 1284983672;
                                    int i80 = ~((i79 & i78) | (i79 ^ i78));
                                    int i81 = (i80 ^ 16789511) | (16789511 & i80);
                                    int i82 = (currentTimeMillis3 ^ (-1082409057)) | ((-1082409057) & currentTimeMillis3);
                                    int i83 = ~i82;
                                    int i84 = (i82 | i83) & i83;
                                    int i85 = i81 & i84;
                                    int i86 = (i84 | i81) & (~i85);
                                    int i87 = ((i86 ^ i85) | (i86 & i85)) * 757;
                                    int i88 = i77 & i87;
                                    if ((((i63 & i64) | i65) << 1) - i65 > i88 + ((i77 ^ i87) | i88) ? j3 + 1850 >= ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j3 - 1850 >= ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                        int i89 = getMaximumPinTry + 61;
                                        build = i89 % 128;
                                        if (i89 % 2 != 0) {
                                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.view.MotionEvent.axisFromString("") + 34285));
                                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                                            c((byte) (i53 & 126), (byte) (bArr[48] - 1), 105, objArr8);
                                            java.lang.Object[] objArr9 = {cls2.getField((java.lang.String) objArr8[0]).get(null), -2082940108, 0};
                                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                            if (obj5 == null) {
                                                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 4717 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.view.View.combineMeasuredStates(0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj5);
                                            }
                                            invoke2 = ((java.lang.reflect.Method) obj5).invoke(null, objArr9);
                                        } else {
                                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 47, 707 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (34284 - android.text.TextUtils.getCapsMode("", 0, 0)));
                                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                                            c((byte) (i53 & 126), (byte) (bArr[48] - 1), 105, objArr10);
                                            java.lang.Object[] objArr11 = {cls3.getField((java.lang.String) objArr10[0]).get(null), -2082940108, 0};
                                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                            if (obj6 == null) {
                                                obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 4717 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.view.View.getDefaultSize(0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj6);
                                            }
                                            invoke2 = ((java.lang.reflect.Method) obj6).invoke(null, objArr11);
                                        }
                                        objArr2 = (java.lang.Object[]) invoke2;
                                        b2 = b;
                                        c = 1;
                                        i = ((int[]) objArr2[c])[0];
                                        i2 = ((int[]) objArr2[0])[0];
                                        if (i2 != i) {
                                            int i90 = getMaximumPinTry + 43;
                                            build = i90 % 128;
                                            if (i90 % 2 != 0) {
                                                java.lang.Object[] objArr12 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[38])[1]), num};
                                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                if (obj7 == null) {
                                                    obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.text.TextUtils.indexOf("", "", 0, 0) + 4717, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj7);
                                                }
                                                ((java.lang.reflect.Method) obj7).invoke(null, objArr12);
                                            } else {
                                                java.lang.Object[] objArr13 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[9])[0]), 0};
                                                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                if (obj8 == null) {
                                                    obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4718, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj8);
                                                }
                                                ((java.lang.reflect.Method) obj8).invoke(null, objArr13);
                                            }
                                            i3 = i53;
                                        } else {
                                            java.util.ArrayList arrayList = new java.util.ArrayList();
                                            arrayList.add((java.lang.String) objArr2[2]);
                                            arrayList.add((java.lang.String) objArr2[3]);
                                            arrayList.add((java.lang.String) objArr2[4]);
                                            arrayList.add((java.lang.String) objArr2[5]);
                                            arrayList.add((java.lang.String) objArr2[6]);
                                            arrayList.add((java.lang.String) objArr2[7]);
                                            arrayList.add((java.lang.String) objArr2[8]);
                                            long j4 = i ^ i2;
                                            int i91 = getMaximumPinTry;
                                            int i92 = i91 & 13;
                                            int i93 = ((i91 ^ 13) | i92) << 1;
                                            int i94 = -((i91 | 13) & (~i92));
                                            build = ((i93 & i94) + (i94 | i93)) % 128;
                                            try {
                                                java.lang.Object[] objArr14 = {java.lang.Long.valueOf(j4 ^ 3201332003823681536L), 745368190L};
                                                byte[] bArr2 = $$d;
                                                i3 = i53;
                                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                                d(bArr2[10], bArr2[42], bArr2[48], objArr15);
                                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                                byte b5 = bArr2[17];
                                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                                d(b5, bArr2[108], (short) (b5 - 1), objArr16);
                                                cls4.getMethod((java.lang.String) objArr16[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr14);
                                                java.lang.Object[] objArr17 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[9])[0]), 0};
                                                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                if (obj9 == null) {
                                                    obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.graphics.ImageFormat.getBitsPerPixel(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4718, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj9);
                                                }
                                                ((java.lang.reflect.Method) obj9).invoke(null, objArr17);
                                                int i95 = build;
                                                int i96 = i95 & 1;
                                                getMaximumPinTry = (i96 + ((i95 ^ 1) | i96)) % 128;
                                            } catch (java.lang.Throwable th) {
                                                java.lang.Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                                        if (obj == null) {
                                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - android.view.KeyEvent.normalizeMetaState(0), 5052 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod("AlternateContactlessPaymentDataJson", null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
                                        }
                                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 667, (char) (40023 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr18);
                                        j = cls5.getField((java.lang.String) objArr18[0]).getLong(null);
                                        if (j != -1) {
                                            int i97 = getMaximumPinTry;
                                            int i98 = i97 & 15;
                                            int i99 = ((i97 ^ 15) | i98) << 1;
                                            int i100 = -((i97 | 15) & (~i98));
                                            build = ((i99 ^ i100) + ((i100 & i99) << 1)) % 128;
                                            if (j + 1922 >= ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                int i101 = getMaximumPinTry;
                                                int i102 = i101 ^ 29;
                                                int i103 = (i101 & 29) << 1;
                                                build = (((i102 | i103) << 1) - (i103 ^ i102)) % 128;
                                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 40, 667 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 40024));
                                                byte b6 = bArr[2];
                                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                c(b2, b6, (byte) (b6 | 76), objArr19);
                                                java.lang.Object[] objArr20 = {cls6.getField((java.lang.String) objArr19[0]).get(null), -1735469262, 0};
                                                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                if (obj10 == null) {
                                                    obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 33, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 4684, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj10);
                                                }
                                                objArr3 = (java.lang.Object[]) ((java.lang.reflect.Method) obj10).invoke(null, objArr20);
                                                int i104 = build;
                                                int i105 = ((i104 & 72) + (i104 | 72)) - 1;
                                                getMaximumPinTry = i105 % 128;
                                                if (i105 % 2 == 0) {
                                                    int i106 = 3 / 5;
                                                }
                                                c2 = 1;
                                                i4 = ((int[]) objArr3[c2])[0];
                                                i5 = ((int[]) objArr3[0])[0];
                                                if (i5 == i4) {
                                                    int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                                                    int i107 = 1315814455 & currentTimeMillis4;
                                                    int i108 = (1315814455 | currentTimeMillis4) & (~i107);
                                                    int i109 = ~((i107 ^ i108) | (i108 & i107));
                                                    int i110 = -(-(((i109 ^ 806355464) | (806355464 & i109)) * 1504));
                                                    int i111 = (-1587712) ^ i110;
                                                    int i112 = -(-((i110 & (-1587712)) << 1));
                                                    int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                                                    int i114 = 2122169919 ^ currentTimeMillis4;
                                                    int i115 = currentTimeMillis4 & 2122169919;
                                                    int i116 = (~((i115 ^ i114) | (i115 & i114))) * (-1504);
                                                    int i117 = i113 & i116;
                                                    int i118 = -(-((i116 ^ i113) | i117));
                                                    int i119 = ((i117 | i118) << 1) - (i118 ^ i117);
                                                    int i120 = (-1913671424) | i119;
                                                    int i121 = i120 << 1;
                                                    int i122 = -(i120 & (~(i119 & (-1913671424))));
                                                    int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                                                    int i123 = ~currentTimeMillis5;
                                                    int i124 = (i123 | currentTimeMillis5) & i123;
                                                    int i125 = (-1028863047) & i124;
                                                    int i126 = (i124 | (-1028863047)) & (~i125);
                                                    int i127 = (i126 ^ i125) | (i126 & i125);
                                                    int i128 = (-2071488005) ^ i127;
                                                    int i129 = i127 & (-2071488005);
                                                    int i130 = ~((i129 ^ i128) | (i129 & i128));
                                                    int i131 = ((-1109934593) & currentTimeMillis5) | ((-1109934593) ^ currentTimeMillis5);
                                                    int i132 = ~i131;
                                                    int i133 = (i131 | i132) & i132;
                                                    int i134 = ((-961553413) & currentTimeMillis5) | ((-961553413) ^ currentTimeMillis5);
                                                    int i135 = (i123 & (-2071488005)) | (2071488004 & currentTimeMillis5);
                                                    int i136 = currentTimeMillis5 & (-2071488005);
                                                    int i137 = ~((i136 ^ i135) | (i136 & i135));
                                                    int i138 = (-2138797639) & i137;
                                                    int i139 = (i137 | (-2138797639)) & (~i138);
                                                    int i140 = (i121 & i122) + (i122 | i121);
                                                    int i141 = (((i130 & i133) | (i130 ^ i133)) * (-302)) - 1039478085;
                                                    int i142 = ~i134;
                                                    if (i140 <= ((i141 + ((i142 & (i134 | i142)) * (-604))) - (~(((i139 & i138) | (i139 ^ i138)) * 302))) - 1) {
                                                        java.lang.Object[] objArr21 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[3])[1]), num};
                                                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                        if (obj11 == null) {
                                                            obj11 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4683, (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj11);
                                                        }
                                                        ((java.lang.reflect.Method) obj11).invoke(null, objArr21);
                                                    } else {
                                                        java.lang.Object[] objArr22 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[4])[0]), 0};
                                                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                        if (obj12 == null) {
                                                            obj12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.widget.ExpandableListView.getPackedPositionType(0L) + 4684, (char) android.view.View.MeasureSpec.getMode(0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj12);
                                                        }
                                                        ((java.lang.reflect.Method) obj12).invoke(null, objArr22);
                                                    }
                                                } else {
                                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                    java.lang.Object[] objArr23 = {objArr3};
                                                    java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                                                    if (obj13 == null) {
                                                        obj13 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 33, android.graphics.Color.alpha(0) + 4684, (char) android.graphics.Color.alpha(0))).getMethod("values", java.lang.Object[].class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj13);
                                                    }
                                                    arrayList2.add(((java.lang.reflect.Method) obj13).invoke(null, objArr23));
                                                    java.lang.Object[] objArr24 = {objArr3};
                                                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                                                    if (obj14 == null) {
                                                        obj14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4684, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod("writeReplace", java.lang.Object[].class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj14);
                                                    }
                                                    arrayList2.add(((java.lang.reflect.Method) obj14).invoke(null, objArr24));
                                                    int i143 = i4 & i5;
                                                    java.lang.Object[] objArr25 = {java.lang.Long.valueOf((((i4 ^ i5) | i143) & (~i143)) ^ 8824531130251214848L), 2054621255L};
                                                    byte[] bArr3 = $$d;
                                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                    d(bArr3[10], bArr3[548], 108, objArr26);
                                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                    d(bArr3[47], bArr3[180], 141, objArr27);
                                                    cls7.getMethod((java.lang.String) objArr27[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr25);
                                                    java.lang.Object[] objArr28 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[4])[0]), 0};
                                                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                    if (obj15 == null) {
                                                        obj15 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.getCapsMode("", 0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 4684, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj15);
                                                    }
                                                    ((java.lang.reflect.Method) obj15).invoke(null, objArr28);
                                                    int i144 = build;
                                                    int i145 = i144 & 3;
                                                    int i146 = -(-((i144 ^ 3) | i145));
                                                    getMaximumPinTry = (((i145 | i146) << 1) - (i146 ^ i145)) % 128;
                                                }
                                                com.payair.hce.McbpGcmListenerService mcbpGcmListenerService = new com.payair.hce.McbpGcmListenerService(context);
                                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 47, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 754, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 45560));
                                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr29);
                                                j2 = cls8.getField((java.lang.String) objArr29[0]).getLong(null);
                                                if (j2 != -1) {
                                                    build = (getMaximumPinTry + 111) % 128;
                                                    if (j2 + 2009 >= ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                        int i147 = build;
                                                        int i148 = ((i147 ^ 77) | (i147 & 77)) << 1;
                                                        int i149 = -((i147 & (-78)) | ((~i147) & 77));
                                                        getMaximumPinTry = ((i148 & i149) + (i149 | i148)) % 128;
                                                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 47, android.view.View.resolveSize(0, 0) + 754, (char) (45561 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                        c((byte) (i3 & 126), (byte) (bArr[48] - 1), 105, objArr30);
                                                        java.lang.Object[] objArr31 = {cls9.getField((java.lang.String) objArr30[0]).get(null), 905374101, 0};
                                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                        if (obj16 == null) {
                                                            obj16 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 40, 4790 - android.text.TextUtils.getCapsMode("", 0, 0), (char) ((android.os.Process.myPid() >> 22) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 40, android.graphics.Color.rgb(0, 0, 0) + 16781966, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj16);
                                                        }
                                                        invoke = ((java.lang.reflect.Method) obj16).invoke(null, objArr31);
                                                        int i150 = build;
                                                        int i151 = i150 & 125;
                                                        int i152 = ((i150 ^ 125) | i151) << 1;
                                                        int i153 = -((i150 | 125) & (~i151));
                                                        getMaximumPinTry = (((i152 | i153) << 1) - (i153 ^ i152)) % 128;
                                                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                                        if (obj3 == null) {
                                                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4749, (char) (android.view.KeyEvent.keyCodeFromString("") + 33701))).getMethod("values", null);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj3);
                                                        }
                                                        intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(invoke, null)).intValue();
                                                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                                        if (obj4 == null) {
                                                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 4750, (char) (33701 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)))).getMethod("DigitizedCardProfile", null);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj4);
                                                        }
                                                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(invoke, null)).intValue() != intValue) {
                                                            int i154 = build;
                                                            int i155 = (i154 | 11) << 1;
                                                            int i156 = -((i154 & (-12)) | ((~i154) & 11));
                                                            int i157 = ((i155 | i156) << 1) - (i156 ^ i155);
                                                            getMaximumPinTry = i157 % 128;
                                                            if (i157 % 2 == 0) {
                                                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                                                if (obj17 == null) {
                                                                    obj17 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 4750, (char) (33702 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))).getMethod("valueOf", null);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj17);
                                                                }
                                                                java.lang.Object[] objArr32 = {invoke, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(invoke, null)).intValue()), num};
                                                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                                if (obj18 == null) {
                                                                    obj18 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4791, (char) (31152 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 40, android.graphics.Color.green(0) + 4750, (char) (33702 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj18);
                                                                }
                                                                ((java.lang.reflect.Method) obj18).invoke(null, objArr32);
                                                            } else {
                                                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                                                if (obj19 == null) {
                                                                    obj19 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40, 4749 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33702))).getMethod("valueOf", null);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj19);
                                                                }
                                                                java.lang.Object[] objArr33 = {invoke, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(invoke, null)).intValue()), 0};
                                                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                                if (obj20 == null) {
                                                                    obj20 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 4790, (char) ((android.os.Process.myTid() >> 22) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 4750, (char) (android.view.View.resolveSize(0, 0) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj20);
                                                                }
                                                                ((java.lang.reflect.Method) obj20).invoke(null, objArr33);
                                                            }
                                                        } else {
                                                            java.lang.Object[] objArr34 = {java.lang.Long.valueOf(((~(intValue & r7)) & (intValue | r7)) ^ (-7611650872874893312L)), -1772227620L};
                                                            byte[] bArr4 = $$d;
                                                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                            d(bArr4[10], bArr4[37], 152, objArr35);
                                                            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr35[0]);
                                                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                            d((short) 54, (byte) $$e, 192, objArr36);
                                                            cls10.getMethod((java.lang.String) objArr36[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr34);
                                                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                                            if (obj21 == null) {
                                                                obj21 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 40, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4750, (char) (33701 - android.text.TextUtils.indexOf("", "", 0, 0)))).getMethod("valueOf", null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj21);
                                                            }
                                                            java.lang.Object[] objArr37 = {invoke, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(invoke, null)).intValue()), 0};
                                                            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                            if (obj22 == null) {
                                                                obj22 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41, 4790 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (31152 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 40, android.view.View.resolveSize(0, 0) + 4750, (char) (33701 - android.graphics.drawable.Drawable.resolveOpacity(0, 0))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj22);
                                                            }
                                                            ((java.lang.reflect.Method) obj22).invoke(null, objArr37);
                                                            int i158 = build;
                                                            int i159 = (i158 & 101) + (i158 | 101);
                                                            getMaximumPinTry = i159 % 128;
                                                            if (i159 % 2 == 0) {
                                                                int i160 = 4 / 2;
                                                            }
                                                        }
                                                        mcbpGcmListenerService.onMessageReceived(remoteMessage);
                                                        int i161 = getMaximumPinTry;
                                                        int i162 = i161 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                                        int i163 = (i161 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i162;
                                                        build = ((i162 & i163) + (i163 | i162)) % 128;
                                                        return null;
                                                    }
                                                }
                                                java.lang.Object[] objArr38 = {0, 905374101};
                                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                                if (obj2 == null) {
                                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 47, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 754, (char) (45560 - (android.view.ViewConfiguration.getTouchSlop() >> 8)));
                                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                    c((byte) (i3 & 126), (byte) (bArr[48] - 1), 105, objArr39);
                                                    obj2 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj2);
                                                }
                                                invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr38);
                                                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 47, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 755, (char) (45560 - (android.os.Process.myPid() >> 22)));
                                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                c((byte) (i3 & 126), (byte) (bArr[48] - 1), 105, objArr40);
                                                cls12.getField((java.lang.String) objArr40[0]).set(null, invoke);
                                                long longValue = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777169) - android.graphics.Color.rgb(0, 0, 0), 755 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 45560));
                                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr41);
                                                cls13.getField((java.lang.String) objArr41[0]).set(null, java.lang.Long.valueOf(longValue));
                                                int i164 = build;
                                                int i165 = i164 & 9;
                                                int i166 = (i164 | 9) & (~i165);
                                                int i167 = i165 << 1;
                                                getMaximumPinTry = ((i166 ^ i167) + ((i166 & i167) << 1)) % 128;
                                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                                if (obj3 == null) {
                                                }
                                                intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(invoke, null)).intValue();
                                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                                if (obj4 == null) {
                                                }
                                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(invoke, null)).intValue() != intValue) {
                                                }
                                                mcbpGcmListenerService.onMessageReceived(remoteMessage);
                                                int i1612 = getMaximumPinTry;
                                                int i1622 = i1612 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                                int i1632 = (i1612 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i1622;
                                                build = ((i1622 & i1632) + (i1632 | i1622)) % 128;
                                                return null;
                                            }
                                        }
                                        if (context == null) {
                                            int i168 = getMaximumPinTry;
                                            int i169 = (i168 ^ 63) + ((i168 & 63) << 1);
                                            build = i169 % 128;
                                            if (i169 % 2 != 0) {
                                                context.getApplicationContext();
                                                throw null;
                                            }
                                            context2 = context.getApplicationContext();
                                            int i170 = getMaximumPinTry;
                                            int i171 = (i170 & (-120)) | ((~i170) & 119);
                                            int i172 = -(-((i170 & 119) << 1));
                                            build = ((i171 ^ i172) + ((i172 & i171) << 1)) % 128;
                                        } else {
                                            context2 = context;
                                        }
                                        int i173 = build;
                                        int i174 = i173 & 89;
                                        int i175 = (i173 ^ 89) | i174;
                                        int i176 = (i174 ^ i175) + ((i175 & i174) << 1);
                                        int i177 = i176 % 128;
                                        getMaximumPinTry = i177;
                                        int i178 = i176 % 2;
                                        int i179 = i177 & 99;
                                        int i180 = (i177 | 99) & (~i179);
                                        int i181 = -(-(i179 << 1));
                                        build = ((i180 ^ i181) + ((i180 & i181) << 1)) % 128;
                                        java.lang.Object[] objArr42 = {context2, 0, 0, -1735469262};
                                        byte[] bArr5 = $$d;
                                        java.lang.Object[] objArr43 = new java.lang.Object[1];
                                        d(bArr5[10], bArr5[251], (short) (-bArr5[435]), objArr43);
                                        java.lang.Class<?> cls14 = java.lang.Class.forName((java.lang.String) objArr43[0]);
                                        byte b7 = bArr5[17];
                                        java.lang.Object[] objArr44 = new java.lang.Object[1];
                                        d(b7, bArr5[108], (short) (b7 - 1), objArr44);
                                        java.lang.String str3 = (java.lang.String) objArr44[0];
                                        int i182 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        int i183 = i182 ^ 126;
                                        int i184 = -(-((i182 & 126) << 1));
                                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                                        e(null, null, (i183 & i184) + (i184 | i183), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr45);
                                        objArr3 = (java.lang.Object[]) cls14.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr45[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr42);
                                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 40, android.text.TextUtils.getOffsetAfter("", 0) + 667, (char) (40024 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                                        byte b8 = bArr[2];
                                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                                        c(b2, b8, (byte) (b8 | 76), objArr46);
                                        cls15.getField((java.lang.String) objArr46[0]).set(null, objArr3);
                                        long longValue2 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.os.Process.getGidForName(""), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 667, (char) ((android.os.Process.myPid() >> 22) + 40024));
                                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr47);
                                        cls16.getField((java.lang.String) objArr47[0]).set(null, java.lang.Long.valueOf(longValue2));
                                        int i185 = getMaximumPinTry;
                                        c2 = 1;
                                        build = (((i185 & (-74)) | ((~i185) & 73)) + ((i185 & 73) << 1)) % 128;
                                        i4 = ((int[]) objArr3[c2])[0];
                                        i5 = ((int[]) objArr3[0])[0];
                                        if (i5 == i4) {
                                        }
                                        com.payair.hce.McbpGcmListenerService mcbpGcmListenerService2 = new com.payair.hce.McbpGcmListenerService(context);
                                        java.lang.Class cls82 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 47, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 754, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 45560));
                                        java.lang.Object[] objArr292 = new java.lang.Object[1];
                                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr292);
                                        j2 = cls82.getField((java.lang.String) objArr292[0]).getLong(null);
                                        if (j2 != -1) {
                                        }
                                        java.lang.Object[] objArr382 = {0, 905374101};
                                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                        if (obj2 == null) {
                                        }
                                        invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr382);
                                        java.lang.Class cls122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 47, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 755, (char) (45560 - (android.os.Process.myPid() >> 22)));
                                        java.lang.Object[] objArr402 = new java.lang.Object[1];
                                        c((byte) (i3 & 126), (byte) (bArr[48] - 1), 105, objArr402);
                                        cls122.getField((java.lang.String) objArr402[0]).set(null, invoke);
                                        long longValue3 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Class cls132 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777169) - android.graphics.Color.rgb(0, 0, 0), 755 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 45560));
                                        java.lang.Object[] objArr412 = new java.lang.Object[1];
                                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr412);
                                        cls132.getField((java.lang.String) objArr412[0]).set(null, java.lang.Long.valueOf(longValue3));
                                        int i1642 = build;
                                        int i1652 = i1642 & 9;
                                        int i1662 = (i1642 | 9) & (~i1652);
                                        int i1672 = i1652 << 1;
                                        getMaximumPinTry = ((i1662 ^ i1672) + ((i1662 & i1672) << 1)) % 128;
                                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                        if (obj3 == null) {
                                        }
                                        intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(invoke, null)).intValue();
                                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                        if (obj4 == null) {
                                        }
                                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(invoke, null)).intValue() != intValue) {
                                        }
                                        mcbpGcmListenerService2.onMessageReceived(remoteMessage);
                                        int i16122 = getMaximumPinTry;
                                        int i16222 = i16122 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                        int i16322 = (i16122 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i16222;
                                        build = ((i16222 & i16322) + (i16322 | i16222)) % 128;
                                        return null;
                                    }
                                } else {
                                    remoteMessage = remoteMessage2;
                                    num = 1;
                                    context = context3;
                                    b = b3;
                                }
                                long longValue32 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                java.lang.Class cls1322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777169) - android.graphics.Color.rgb(0, 0, 0), 755 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 45560));
                                java.lang.Object[] objArr4122 = new java.lang.Object[1];
                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr4122);
                                cls1322.getField((java.lang.String) objArr4122[0]).set(null, java.lang.Long.valueOf(longValue32));
                                int i16422 = build;
                                int i16522 = i16422 & 9;
                                int i16622 = (i16422 | 9) & (~i16522);
                                int i16722 = i16522 << 1;
                                getMaximumPinTry = ((i16622 ^ i16722) + ((i16622 & i16722) << 1)) % 128;
                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                if (obj3 == null) {
                                }
                                intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(invoke, null)).intValue();
                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                if (obj4 == null) {
                                }
                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(invoke, null)).intValue() != intValue) {
                                }
                                mcbpGcmListenerService2.onMessageReceived(remoteMessage);
                                int i161222 = getMaximumPinTry;
                                int i162222 = i161222 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                int i163222 = (i161222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i162222;
                                build = ((i162222 & i163222) + (i163222 | i162222)) % 128;
                                return null;
                            } catch (java.lang.Exception unused) {
                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                            }
                            long longValue22 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls162 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.os.Process.getGidForName(""), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 667, (char) ((android.os.Process.myPid() >> 22) + 40024));
                            java.lang.Object[] objArr472 = new java.lang.Object[1];
                            c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr472);
                            cls162.getField((java.lang.String) objArr472[0]).set(null, java.lang.Long.valueOf(longValue22));
                            int i1852 = getMaximumPinTry;
                            c2 = 1;
                            build = (((i1852 & (-74)) | ((~i1852) & 73)) + ((i1852 & 73) << 1)) % 128;
                            i4 = ((int[]) objArr3[c2])[0];
                            i5 = ((int[]) objArr3[0])[0];
                            if (i5 == i4) {
                            }
                            com.payair.hce.McbpGcmListenerService mcbpGcmListenerService22 = new com.payair.hce.McbpGcmListenerService(context);
                            java.lang.Class cls822 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 47, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 754, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 45560));
                            java.lang.Object[] objArr2922 = new java.lang.Object[1];
                            c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr2922);
                            j2 = cls822.getField((java.lang.String) objArr2922[0]).getLong(null);
                            if (j2 != -1) {
                            }
                            java.lang.Object[] objArr3822 = {0, 905374101};
                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                            if (obj2 == null) {
                            }
                            invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr3822);
                            java.lang.Class cls1222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 47, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 755, (char) (45560 - (android.os.Process.myPid() >> 22)));
                            java.lang.Object[] objArr4022 = new java.lang.Object[1];
                            c((byte) (i3 & 126), (byte) (bArr[48] - 1), 105, objArr4022);
                            cls1222.getField((java.lang.String) objArr4022[0]).set(null, invoke);
                        } catch (java.lang.Exception unused2) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                        java.lang.Object[] objArr422 = {context2, 0, 0, -1735469262};
                        byte[] bArr52 = $$d;
                        java.lang.Object[] objArr432 = new java.lang.Object[1];
                        d(bArr52[10], bArr52[251], (short) (-bArr52[435]), objArr432);
                        java.lang.Class<?> cls142 = java.lang.Class.forName((java.lang.String) objArr432[0]);
                        byte b72 = bArr52[17];
                        java.lang.Object[] objArr442 = new java.lang.Object[1];
                        d(b72, bArr52[108], (short) (b72 - 1), objArr442);
                        java.lang.String str32 = (java.lang.String) objArr442[0];
                        int i1822 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int i1832 = i1822 ^ 126;
                        int i1842 = -(-((i1822 & 126) << 1));
                        java.lang.Object[] objArr452 = new java.lang.Object[1];
                        e(null, null, (i1832 & i1842) + (i1842 | i1832), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr452);
                        objArr3 = (java.lang.Object[]) cls142.getMethod(str32, java.lang.Class.forName((java.lang.String) objArr452[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr422);
                        java.lang.Class cls152 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 40, android.text.TextUtils.getOffsetAfter("", 0) + 667, (char) (40024 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                        byte b82 = bArr[2];
                        java.lang.Object[] objArr462 = new java.lang.Object[1];
                        c(b2, b82, (byte) (b82 | 76), objArr462);
                        cls152.getField((java.lang.String) objArr462[0]).set(null, objArr3);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                    long longValue4 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 48, 707 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.text.TextUtils.indexOf("", "", 0) + 34284));
                    byte b9 = bArr[2];
                    c = 1;
                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                    c(b2, b9, (byte) (b9 | 76), objArr48);
                    cls17.getField((java.lang.String) objArr48[0]).set(null, java.lang.Long.valueOf(longValue4));
                    int i186 = getMaximumPinTry + 96;
                    build = ((~i186) + (i186 << 1)) % 128;
                    objArr2 = objArr4;
                    i = ((int[]) objArr2[c])[0];
                    i2 = ((int[]) objArr2[0])[0];
                    if (i2 != i) {
                    }
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                    if (obj == null) {
                    }
                    java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 667, (char) (40023 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr182 = new java.lang.Object[1];
                    c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr182);
                    j = cls52.getField((java.lang.String) objArr182[0]).getLong(null);
                    if (j != -1) {
                    }
                    if (context == null) {
                    }
                    int i1732 = build;
                    int i1742 = i1732 & 89;
                    int i1752 = (i1732 ^ 89) | i1742;
                    int i1762 = (i1742 ^ i1752) + ((i1752 & i1742) << 1);
                    int i1772 = i1762 % 128;
                    getMaximumPinTry = i1772;
                    int i1782 = i1762 % 2;
                    int i1792 = i1772 & 99;
                    int i1802 = (i1772 | 99) & (~i1792);
                    int i1812 = -(-(i1792 << 1));
                    build = ((i1802 ^ i1812) + ((i1802 & i1812) << 1)) % 128;
                } catch (java.lang.Exception unused3) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
                java.lang.Object[] objArr49 = {0, 0, -2082940108};
                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                if (obj23 == null) {
                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.getOffsetAfter("", 0), 707 - android.graphics.Color.alpha(0), (char) (34284 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                    byte b10 = bArr[2];
                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                    b2 = b;
                    c(b2, b10, (byte) (b10 | 76), objArr50);
                    obj23 = cls18.getMethod((java.lang.String) objArr50[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj23);
                } else {
                    b2 = b;
                }
                objArr4 = (java.lang.Object[]) ((java.lang.reflect.Method) obj23).invoke(null, objArr49);
                java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_STAGGERED, (char) (34284 - android.text.TextUtils.getOffsetAfter("", 0)));
                java.lang.Object[] objArr51 = new java.lang.Object[1];
                c((byte) (i53 & 126), (byte) (bArr[48] - 1), 105, objArr51);
                cls19.getField((java.lang.String) objArr51[0]).set(null, objArr4);
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
    }

    private static /* synthetic */ java.lang.Object getPinAlwaysRequiredIfCurrencyNotProvided(java.lang.Object[] objArr) {
        int i = build;
        int i2 = (((i & (-12)) | ((~i) & 11)) - (~(-(-((i & 11) << 1))))) - 1;
        getMaximumPinTry = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = getCvmResetTimeout;
        getMaximumPinTry = (i + 115) % 128;
        return java.lang.Boolean.valueOf(z);
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        boolean booleanValue = ((java.lang.Boolean) objArr[0]).booleanValue();
        int i = getMaximumPinTry;
        int i2 = i ^ 99;
        int i3 = ((i & 99) | i2) << 1;
        int i4 = -i2;
        build = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        getCvmResetTimeout = booleanValue;
        int i5 = i & 21;
        int i6 = -(-((i ^ 21) | i5));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        build = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static java.lang.String SdkCoreDigitizedCardProfileImpl() {
        int i = getMaximumPinTry;
        int i2 = i & 87;
        int i3 = i2 + ((i ^ 87) | i2);
        build = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (((java.lang.String) com.payair.hce.setScrollBarFadeDuration.writeReplace(new java.lang.Object[0], 1864191391, -1864191389, (int) java.lang.System.currentTimeMillis())) != null) {
            int i4 = build;
            int i5 = i4 & 23;
            int i6 = i4 | 23;
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            getMaximumPinTry = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            java.lang.String str = (java.lang.String) com.payair.hce.setScrollBarFadeDuration.writeReplace(new java.lang.Object[0], 1864191391, -1864191389, (int) java.lang.System.currentTimeMillis());
            int i8 = build;
            getMaximumPinTry = ((i8 ^ 81) + ((i8 & 81) << 1)) % 128;
            return str;
        }
        com.payair.hce.setIsCredential setiscredential = new com.payair.hce.setIsCredential();
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson2 = setiscredential.AlternateContactlessPaymentDataJson(null, "CRYPTO_JWT", null);
        if (AlternateContactlessPaymentDataJson2 != null) {
            int i9 = getMaximumPinTry;
            build = (((i9 | 87) << 1) - (i9 ^ 87)) % 128;
            if (((java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))) != null) {
                com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson3 = setiscredential.AlternateContactlessPaymentDataJson(null, "CRYPTO_KEY", null);
                java.lang.String replace = new java.lang.String(new com.payair.hce.setVisibility().valueOf((byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson3}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson3))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson3}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson3))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), true)).replace("\u0000", "");
                com.payair.hce.communication.Connection.valueOf(new java.lang.Object[]{replace}, 1818092431, -1818092431, (int) java.lang.System.currentTimeMillis());
                int i10 = getMaximumPinTry;
                int i11 = i10 ^ 95;
                int i12 = (i10 & 95) << 1;
                build = ((i11 & i12) + (i12 | i11)) % 128;
                return replace;
            }
        }
        int i13 = getMaximumPinTry;
        int i14 = i13 & 63;
        int i15 = -(-((i13 ^ 63) | i14));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        build = i16 % 128;
        if (i16 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCdol1RelatedDataLength(java.lang.Object[] objArr) {
        com.payair.hce.setPointerIcon setpointericon;
        long longValue = ((java.lang.Number) objArr[0]).longValue();
        int i = getMaximumPinTry;
        int i2 = i & 99;
        int i3 = i2 + ((i ^ 99) | i2);
        build = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) valueOf(new java.lang.Object[0], 1178521628, -1178521541, (int) java.lang.System.currentTimeMillis());
        if (settextdirection != null) {
            int i4 = getMaximumPinTry;
            int i5 = i4 & 5;
            int i6 = (i4 ^ 5) | i5;
            build = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
            setpointericon = (com.payair.hce.setPointerIcon) com.payair.hce.setTextDirection.DigitizedCardProfile(new java.lang.Object[]{settextdirection}, 841548075, -841548054, java.lang.System.identityHashCode(settextdirection));
            int i7 = getMaximumPinTry;
            build = ((i7 & 71) + (i7 | 71)) % 128;
        } else {
            setpointericon = null;
        }
        if (setpointericon == null) {
            setpointericon = new com.payair.hce.setPointerIcon();
            build = (getMaximumPinTry + 23) % 128;
        }
        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Long.valueOf(longValue)}, -1124132126, 1124132161, java.lang.System.identityHashCode(setpointericon));
        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, (java.lang.String) valueOf(new java.lang.Object[0], 1213004610, -1213004596, (int) java.lang.System.currentTimeMillis())}, -1972616230, 1972616243, java.lang.System.identityHashCode(setpointericon));
        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, (java.lang.String) valueOf(new java.lang.Object[0], 441749328, -441749325, (int) java.lang.System.currentTimeMillis())}, -363999224, 363999255, java.lang.System.identityHashCode(setpointericon));
        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, (java.lang.String) valueOf(new java.lang.Object[0], -1015528636, 1015528697, (int) java.lang.System.currentTimeMillis())}, 1261895947, -1261895935, java.lang.System.identityHashCode(setpointericon));
        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Long.valueOf(((java.lang.Long) valueOf(new java.lang.Object[0], -191490049, 191490116, (int) java.lang.System.currentTimeMillis())).longValue())}, -320800811, 320800831, java.lang.System.identityHashCode(setpointericon));
        valueOf(setpointericon);
        int i8 = build;
        int i9 = i8 & 93;
        getMaximumPinTry = ((((i8 ^ 93) | i9) << 1) - ((i8 | 93) & (~i9))) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object getDq(java.lang.Object[] objArr) {
        com.payair.hce.communication.JsonResponse updateRNSInformation = new com.payair.hce.communication.MDESInstanceIDListenerService().updateRNSInformation((java.lang.String) objArr[0], (com.payair.hce.TokenType) objArr[1]);
        int i = build;
        int i2 = i & 59;
        int i3 = (i | 59) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        getMaximumPinTry = i5 % 128;
        if (i5 % 2 != 0) {
            return updateRNSInformation;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCardholderValidators(java.lang.Object[] objArr) {
        com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) objArr[0];
        int i = getMaximumPinTry;
        int i2 = (((i & (-58)) | ((~i) & 57)) - (~(-(-((i & 57) << 1))))) - 1;
        build = i2 % 128;
        if (i2 % 2 == 0) {
            if (com.payair.hce.setLongClickable.writeReplace() != ((java.lang.Integer) com.payair.hce.setLongClickable.DigitizedCardProfile(new java.lang.Object[0], -455230668, 455230668, (int) java.lang.System.currentTimeMillis())).intValue() && java.lang.System.currentTimeMillis() - ((java.lang.Long) valueOf(new java.lang.Object[0], 2121701980, -2121701975, (int) java.lang.System.currentTimeMillis())).longValue() > 14000) {
                int i3 = build;
                int i4 = ((i3 ^ 59) | (i3 & 59)) << 1;
                int i5 = -((i3 & (-60)) | ((~i3) & 59));
                int i6 = (i4 & i5) + (i5 | i4);
                int i7 = i6 % 128;
                getMaximumPinTry = i7;
                if (i6 % 2 == 0) {
                    throw null;
                }
                if (setsystemgestureexclusionrects != null) {
                    int i8 = ((i7 ^ 39) | (i7 & 39)) << 1;
                    int i9 = -((i7 & (-40)) | ((~i7) & 39));
                    build = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
                    if (((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))) != null) {
                        int i10 = build;
                        int i11 = i10 & 73;
                        int i12 = i10 | 73;
                        int i13 = (i11 & i12) + (i12 | i11);
                        getMaximumPinTry = i13 % 128;
                        if (i13 % 2 != 0) {
                            ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).getProfileVersion();
                        } else {
                            ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).getProfileVersion();
                            throw null;
                        }
                    }
                }
                new com.payair.hce.setIsCredential().DigitizedCardProfile();
                com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1891116219, 1891116251, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2112431470, -2112431463, (int) java.lang.System.currentTimeMillis());
                int i14 = getMaximumPinTry;
                int i15 = (i14 ^ 16) + ((i14 & 16) << 1);
                build = ((~i15) + (i15 << 1)) % 128;
            }
            int i16 = build;
            int i17 = i16 & 17;
            int i18 = -(-(i16 | 17));
            int i19 = (i17 & i18) + (i18 | i17);
            getMaximumPinTry = i19 % 128;
            if (i19 % 2 != 0) {
                return null;
            }
            throw null;
        }
        com.payair.hce.setLongClickable.writeReplace();
        throw null;
    }

    private static /* synthetic */ java.lang.Object getQ(java.lang.Object[] objArr) {
        int i = getMaximumPinTry;
        int i2 = (i & (-118)) | ((~i) & 117);
        int i3 = (i & 117) << 1;
        build = ((i2 & i3) + (i2 | i3)) % 128;
        boolean z = getCardholderValidators;
        int i4 = (i ^ 43) + ((i & 43) << 1);
        build = i4 % 128;
        if (i4 % 2 == 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCvmResetTimeout(java.lang.Object[] objArr) {
        boolean booleanValue = ((java.lang.Boolean) objArr[0]).booleanValue();
        int i = getMaximumPinTry;
        int i2 = ((-2) - (~(((i | 110) << 1) - (i ^ 110)))) % 128;
        build = i2;
        getCardholderValidators = booleanValue;
        int i3 = (i2 & 15) + (i2 | 15);
        getMaximumPinTry = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    static com.payair.hce.communication.JsonResponse SdkCoreAlternateContactlessPaymentDataImpl(java.lang.String str) {
        java.util.List<com.payair.hce.setDuplicateParentStateEnabled.writeReplace> arrayList;
        com.payair.hce.communication.JsonResponse jsonResponse;
        int i = getMaximumPinTry;
        int i2 = i & 85;
        build = ((((i ^ 85) | i2) << 1) - ((i | 85) & (~i2))) % 128;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        android.content.SharedPreferences sharedPreferences = ((android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0);
        java.lang.String str2 = (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{"PUBLIC_UNLOCK_KEYS", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, sharedPreferences}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis());
        if (com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT.equals(str2)) {
            com.payair.hce.communication.JsonResponse jsonResponse2 = new com.payair.hce.communication.JsonResponse();
            jsonResponse2.setSuccessful(false);
            int i3 = build;
            int i4 = i3 & 57;
            int i5 = (i4 - (~(-(-((i3 ^ 57) | i4))))) - 1;
            getMaximumPinTry = i5 % 128;
            if (i5 % 2 != 0) {
                return jsonResponse2;
            }
            throw null;
        }
        com.payair.hce.setDuplicateParentStateEnabled.writeReplace[] writereplaceArr = (com.payair.hce.setDuplicateParentStateEnabled.writeReplace[]) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace(str2, com.payair.hce.setDuplicateParentStateEnabled.writeReplace[].class);
        if (writereplaceArr != null) {
            int i6 = build + 7;
            getMaximumPinTry = i6 % 128;
            if (i6 % 2 == 0) {
                java.util.Arrays.asList(writereplaceArr);
                throw null;
            }
            arrayList = java.util.Arrays.asList(writereplaceArr);
        } else {
            arrayList = new java.util.ArrayList();
            int i7 = build;
            int i8 = i7 & 21;
            getMaximumPinTry = (i8 + ((i7 ^ 21) | i8)) % 128;
        }
        if (((java.lang.Boolean) valueOf(new java.lang.Object[0], -1301663721, 1301663778, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i9 = getMaximumPinTry + 115;
            build = i9 % 128;
            if (i9 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            jsonResponse = (com.payair.hce.communication.JsonResponse) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[]{arrayList, str}, 311046041, -311046030, (int) java.lang.System.currentTimeMillis());
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            getMaximumPinTry = (build + 39) % 128;
            for (com.payair.hce.setDuplicateParentStateEnabled.writeReplace writereplace : arrayList) {
                arrayList2.add(new com.payair.hce.setY(((com.payair.hce.setDuplicateParentStateEnabled.values) com.payair.hce.setDuplicateParentStateEnabled.writeReplace.values(new java.lang.Object[]{writereplace}, -400308036, 400308038, java.lang.System.identityHashCode(writereplace))).toString(), (java.lang.String) com.payair.hce.setDuplicateParentStateEnabled.writeReplace.values(new java.lang.Object[]{writereplace}, -190932205, 190932208, java.lang.System.identityHashCode(writereplace))));
                int i10 = getMaximumPinTry;
                build = (((i10 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + (i10 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)) - 1) % 128;
            }
            jsonResponse = (com.payair.hce.communication.JsonResponse) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[]{new com.payair.hce.setLeftTopRightBottom(arrayList2)}, -771044565, 771044570, (int) java.lang.System.currentTimeMillis());
            int i11 = build;
            int i12 = i11 & 47;
            int i13 = i12 + ((i11 ^ 47) | i12);
            getMaximumPinTry = i13 % 128;
            int i14 = i13 % 2;
        }
        if (jsonResponse != null) {
            int i15 = build + 67;
            getMaximumPinTry = i15 % 128;
            if (i15 % 2 == 0) {
                jsonResponse.isSuccessful();
                throw null;
            }
            if (jsonResponse.isSuccessful()) {
                int i16 = getMaximumPinTry;
                int i17 = ((i16 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) + ((i16 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1)) - 1;
                build = i17 % 128;
                if (i17 % 2 != 0) {
                    com.payair.hce.setLeft.values(new java.lang.Object[]{"NEED_TO_RENEW_KEYS", bool, sharedPreferences}, 877494560, -877494557, (int) java.lang.System.currentTimeMillis());
                    com.payair.hce.setLeft.values(new java.lang.Object[]{"PUBLIC_UNLOCK_KEYS", sharedPreferences}, 589791992, -589791985, (int) java.lang.System.currentTimeMillis());
                } else {
                    com.payair.hce.setLeft.values(new java.lang.Object[]{"NEED_TO_RENEW_KEYS", bool, sharedPreferences}, 877494560, -877494557, (int) java.lang.System.currentTimeMillis());
                    com.payair.hce.setLeft.values(new java.lang.Object[]{"PUBLIC_UNLOCK_KEYS", sharedPreferences}, 589791992, -589791985, (int) java.lang.System.currentTimeMillis());
                }
            }
        }
        int i18 = build;
        int i19 = i18 & 55;
        int i20 = (i18 | 55) & (~i19);
        int i21 = -(-(i19 << 1));
        getMaximumPinTry = (((i20 | i21) << 1) - (i20 ^ i21)) % 128;
        return jsonResponse;
    }

    private static /* synthetic */ java.lang.Object getMppLiteModule(java.lang.Object[] objArr) {
        int i = getMaximumPinTry;
        int i2 = ((i ^ 103) | (i & 103)) << 1;
        int i3 = -((i & (-104)) | ((~i) & 103));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        build = i4 % 128;
        if (i4 % 2 == 0) {
            return getAdditionalCheckTable;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreMppLiteModuleImpl(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        int i = build;
        int i2 = i & 69;
        int i3 = (i2 - (~((i ^ 69) | i2))) - 1;
        int i4 = i3 % 128;
        getMaximumPinTry = i4;
        if (i3 % 2 != 0) {
            getAdditionalCheckTable = str;
            int i5 = i4 + 17;
            build = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }
        getAdditionalCheckTable = str;
        throw null;
    }

    private static /* synthetic */ java.lang.Object getAip(java.lang.Object[] objArr) {
        int i = build;
        int i2 = ((((i ^ 45) | (i & 45)) << 1) - (~(-((i & (-46)) | ((~i) & 45))))) - 1;
        getMaximumPinTry = i2 % 128;
        java.lang.String str = getMchipCvmIssuerOptions;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getCrmCountryCode(java.lang.Object[] objArr) {
        com.payair.hce.communication.JsonResponse jsonResponse = (com.payair.hce.communication.JsonResponse) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[]{(java.lang.String) objArr[0], (com.payair.hce.communication.JsonResponse) objArr[1]}, -421809518, 421809532, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setOverScrollMode setoverscrollmode = new com.payair.hce.setOverScrollMode(SdkCoreAlternateContactlessPaymentDataImpl);
        com.payair.hce.setOverScrollMode.writeReplace(new java.lang.Object[]{setoverscrollmode, jsonResponse}, -149956072, 149956072, java.lang.System.identityHashCode(setoverscrollmode));
        int i = getMaximumPinTry;
        int i2 = i & 55;
        int i3 = ((i | 55) & (~i2)) + (i2 << 1);
        build = i3 % 128;
        if (i3 % 2 == 0) {
            return jsonResponse;
        }
        throw null;
    }

    static void RecordsJson(byte[] bArr) {
        int i = getMaximumPinTry;
        int i2 = (i ^ 125) + ((i & 125) << 1);
        int i3 = i2 % 128;
        build = i3;
        if (i2 % 2 == 0) {
            getMagstripeCvmIssuerOptions = bArr;
            getMaximumPinTry = (((i3 | 77) << 1) - (i3 ^ 77)) % 128;
        } else {
            getMagstripeCvmIssuerOptions = bArr;
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object getPaymentFci(java.lang.Object[] objArr) {
        int i = getMaximumPinTry;
        int i2 = ((((i ^ 3) | (i & 3)) << 1) - (~(-((i & (-4)) | ((~i) & 3))))) - 1;
        int i3 = i2 % 128;
        build = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = getMagstripeCvmIssuerOptions;
        int i4 = i3 + 40;
        getMaximumPinTry = ((~i4) + (i4 << 1)) % 128;
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x220f, code lost:
    
        if ((r12 & 1850) >= ((java.lang.Long) java.lang.Class.forName(r8).getDeclaredMethod(r9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x2231, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(r6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, r4) + 49, android.text.TextUtils.lastIndexOf(r6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1582, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
        r12 = new java.lang.Object[1];
        c((byte) (-r11[10]), (byte) (-r11[92]), r11[35], r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x2270, code lost:
    
        r5 = new java.lang.Object[]{r1.getField((java.lang.String) r12[0]).get(null), -1773143076, 0};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x228f, code lost:
    
        if (r1 != null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x2291, code lost:
    
        r1 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 34, 4905 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.Color.blue(0))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x22d1, code lost:
    
        r1 = (java.lang.Object[]) ((java.lang.reflect.Method) r1).invoke(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x22da, code lost:
    
        com.payair.hce.setAccessibilityHeading.build = (com.payair.hce.setAccessibilityHeading.getMaximumPinTry + 101) % 128;
        r32 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x222f, code lost:
    
        if ((r12 + 1850) >= ((java.lang.Long) java.lang.Class.forName(r8).getDeclaredMethod(r9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L325;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x17b5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x1b38  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x1ce5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x1f56  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x2143  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x25b0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x260f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x2850 A[Catch: all -> 0x0247, TryCatch #5 {all -> 0x0247, blocks: (B:9:0x0135, B:11:0x0155, B:12:0x0192, B:13:0x0241, B:20:0x05a7, B:22:0x05c4, B:23:0x0605, B:30:0x08c8, B:32:0x08e9, B:33:0x092a, B:39:0x0af4, B:41:0x0b11, B:42:0x0b51, B:68:0x1168, B:70:0x1185, B:71:0x11c3, B:83:0x139d, B:85:0x13be, B:86:0x13fe, B:87:0x14af, B:94:0x15d9, B:96:0x15f5, B:97:0x162f, B:107:0x184a, B:109:0x186b, B:110:0x18ad, B:111:0x1959, B:117:0x1b4c, B:119:0x1b69, B:120:0x1bae, B:129:0x1df8, B:131:0x1e19, B:132:0x1e54, B:138:0x1f6a, B:140:0x1f86, B:141:0x1fbe, B:150:0x2270, B:152:0x2291, B:153:0x22d1, B:166:0x269a, B:168:0x26bb, B:169:0x271f, B:170:0x2841, B:172:0x2850, B:173:0x2881, B:175:0x289d, B:176:0x28d3, B:178:0x28e2, B:180:0x28f1, B:181:0x2920, B:183:0x294c, B:184:0x29a7, B:188:0x2afc, B:190:0x2b0b, B:191:0x2b3a, B:198:0x2a26, B:200:0x2a35, B:201:0x2a65, B:203:0x2a91, B:204:0x2ae9, B:215:0x2728, B:217:0x2749, B:218:0x2799, B:253:0x1fcd, B:255:0x1fea, B:256:0x2025, B:260:0x20a8, B:262:0x20c5, B:263:0x2102, B:266:0x1e61, B:268:0x1e7d, B:269:0x1eae, B:281:0x1c34, B:283:0x1c51, B:284:0x1c90, B:287:0x18f3, B:289:0x1914, B:290:0x1952, B:308:0x163f, B:310:0x165c, B:311:0x169b, B:315:0x1710, B:317:0x172d, B:318:0x176a, B:320:0x1447, B:322:0x1468, B:323:0x14a8, B:339:0x124b, B:341:0x1268, B:342:0x12a9, B:353:0x0e67, B:355:0x0e88, B:356:0x0ec9, B:362:0x0b62, B:364:0x0b7f, B:365:0x0bc2, B:369:0x0c76, B:371:0x0c93, B:372:0x0cd3, B:374:0x0937, B:376:0x0959, B:377:0x09af, B:386:0x0615, B:388:0x0632, B:389:0x0673, B:391:0x0682, B:393:0x0695, B:394:0x06cc, B:396:0x06d6, B:398:0x06e9, B:399:0x0725, B:404:0x079b, B:406:0x07b8, B:407:0x07f9, B:411:0x01d9, B:413:0x01f9, B:414:0x023b), top: B:2:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x289d A[Catch: all -> 0x0247, TryCatch #5 {all -> 0x0247, blocks: (B:9:0x0135, B:11:0x0155, B:12:0x0192, B:13:0x0241, B:20:0x05a7, B:22:0x05c4, B:23:0x0605, B:30:0x08c8, B:32:0x08e9, B:33:0x092a, B:39:0x0af4, B:41:0x0b11, B:42:0x0b51, B:68:0x1168, B:70:0x1185, B:71:0x11c3, B:83:0x139d, B:85:0x13be, B:86:0x13fe, B:87:0x14af, B:94:0x15d9, B:96:0x15f5, B:97:0x162f, B:107:0x184a, B:109:0x186b, B:110:0x18ad, B:111:0x1959, B:117:0x1b4c, B:119:0x1b69, B:120:0x1bae, B:129:0x1df8, B:131:0x1e19, B:132:0x1e54, B:138:0x1f6a, B:140:0x1f86, B:141:0x1fbe, B:150:0x2270, B:152:0x2291, B:153:0x22d1, B:166:0x269a, B:168:0x26bb, B:169:0x271f, B:170:0x2841, B:172:0x2850, B:173:0x2881, B:175:0x289d, B:176:0x28d3, B:178:0x28e2, B:180:0x28f1, B:181:0x2920, B:183:0x294c, B:184:0x29a7, B:188:0x2afc, B:190:0x2b0b, B:191:0x2b3a, B:198:0x2a26, B:200:0x2a35, B:201:0x2a65, B:203:0x2a91, B:204:0x2ae9, B:215:0x2728, B:217:0x2749, B:218:0x2799, B:253:0x1fcd, B:255:0x1fea, B:256:0x2025, B:260:0x20a8, B:262:0x20c5, B:263:0x2102, B:266:0x1e61, B:268:0x1e7d, B:269:0x1eae, B:281:0x1c34, B:283:0x1c51, B:284:0x1c90, B:287:0x18f3, B:289:0x1914, B:290:0x1952, B:308:0x163f, B:310:0x165c, B:311:0x169b, B:315:0x1710, B:317:0x172d, B:318:0x176a, B:320:0x1447, B:322:0x1468, B:323:0x14a8, B:339:0x124b, B:341:0x1268, B:342:0x12a9, B:353:0x0e67, B:355:0x0e88, B:356:0x0ec9, B:362:0x0b62, B:364:0x0b7f, B:365:0x0bc2, B:369:0x0c76, B:371:0x0c93, B:372:0x0cd3, B:374:0x0937, B:376:0x0959, B:377:0x09af, B:386:0x0615, B:388:0x0632, B:389:0x0673, B:391:0x0682, B:393:0x0695, B:394:0x06cc, B:396:0x06d6, B:398:0x06e9, B:399:0x0725, B:404:0x079b, B:406:0x07b8, B:407:0x07f9, B:411:0x01d9, B:413:0x01f9, B:414:0x023b), top: B:2:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x28e2 A[Catch: all -> 0x0247, TryCatch #5 {all -> 0x0247, blocks: (B:9:0x0135, B:11:0x0155, B:12:0x0192, B:13:0x0241, B:20:0x05a7, B:22:0x05c4, B:23:0x0605, B:30:0x08c8, B:32:0x08e9, B:33:0x092a, B:39:0x0af4, B:41:0x0b11, B:42:0x0b51, B:68:0x1168, B:70:0x1185, B:71:0x11c3, B:83:0x139d, B:85:0x13be, B:86:0x13fe, B:87:0x14af, B:94:0x15d9, B:96:0x15f5, B:97:0x162f, B:107:0x184a, B:109:0x186b, B:110:0x18ad, B:111:0x1959, B:117:0x1b4c, B:119:0x1b69, B:120:0x1bae, B:129:0x1df8, B:131:0x1e19, B:132:0x1e54, B:138:0x1f6a, B:140:0x1f86, B:141:0x1fbe, B:150:0x2270, B:152:0x2291, B:153:0x22d1, B:166:0x269a, B:168:0x26bb, B:169:0x271f, B:170:0x2841, B:172:0x2850, B:173:0x2881, B:175:0x289d, B:176:0x28d3, B:178:0x28e2, B:180:0x28f1, B:181:0x2920, B:183:0x294c, B:184:0x29a7, B:188:0x2afc, B:190:0x2b0b, B:191:0x2b3a, B:198:0x2a26, B:200:0x2a35, B:201:0x2a65, B:203:0x2a91, B:204:0x2ae9, B:215:0x2728, B:217:0x2749, B:218:0x2799, B:253:0x1fcd, B:255:0x1fea, B:256:0x2025, B:260:0x20a8, B:262:0x20c5, B:263:0x2102, B:266:0x1e61, B:268:0x1e7d, B:269:0x1eae, B:281:0x1c34, B:283:0x1c51, B:284:0x1c90, B:287:0x18f3, B:289:0x1914, B:290:0x1952, B:308:0x163f, B:310:0x165c, B:311:0x169b, B:315:0x1710, B:317:0x172d, B:318:0x176a, B:320:0x1447, B:322:0x1468, B:323:0x14a8, B:339:0x124b, B:341:0x1268, B:342:0x12a9, B:353:0x0e67, B:355:0x0e88, B:356:0x0ec9, B:362:0x0b62, B:364:0x0b7f, B:365:0x0bc2, B:369:0x0c76, B:371:0x0c93, B:372:0x0cd3, B:374:0x0937, B:376:0x0959, B:377:0x09af, B:386:0x0615, B:388:0x0632, B:389:0x0673, B:391:0x0682, B:393:0x0695, B:394:0x06cc, B:396:0x06d6, B:398:0x06e9, B:399:0x0725, B:404:0x079b, B:406:0x07b8, B:407:0x07f9, B:411:0x01d9, B:413:0x01f9, B:414:0x023b), top: B:2:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x2b0b A[Catch: all -> 0x0247, TryCatch #5 {all -> 0x0247, blocks: (B:9:0x0135, B:11:0x0155, B:12:0x0192, B:13:0x0241, B:20:0x05a7, B:22:0x05c4, B:23:0x0605, B:30:0x08c8, B:32:0x08e9, B:33:0x092a, B:39:0x0af4, B:41:0x0b11, B:42:0x0b51, B:68:0x1168, B:70:0x1185, B:71:0x11c3, B:83:0x139d, B:85:0x13be, B:86:0x13fe, B:87:0x14af, B:94:0x15d9, B:96:0x15f5, B:97:0x162f, B:107:0x184a, B:109:0x186b, B:110:0x18ad, B:111:0x1959, B:117:0x1b4c, B:119:0x1b69, B:120:0x1bae, B:129:0x1df8, B:131:0x1e19, B:132:0x1e54, B:138:0x1f6a, B:140:0x1f86, B:141:0x1fbe, B:150:0x2270, B:152:0x2291, B:153:0x22d1, B:166:0x269a, B:168:0x26bb, B:169:0x271f, B:170:0x2841, B:172:0x2850, B:173:0x2881, B:175:0x289d, B:176:0x28d3, B:178:0x28e2, B:180:0x28f1, B:181:0x2920, B:183:0x294c, B:184:0x29a7, B:188:0x2afc, B:190:0x2b0b, B:191:0x2b3a, B:198:0x2a26, B:200:0x2a35, B:201:0x2a65, B:203:0x2a91, B:204:0x2ae9, B:215:0x2728, B:217:0x2749, B:218:0x2799, B:253:0x1fcd, B:255:0x1fea, B:256:0x2025, B:260:0x20a8, B:262:0x20c5, B:263:0x2102, B:266:0x1e61, B:268:0x1e7d, B:269:0x1eae, B:281:0x1c34, B:283:0x1c51, B:284:0x1c90, B:287:0x18f3, B:289:0x1914, B:290:0x1952, B:308:0x163f, B:310:0x165c, B:311:0x169b, B:315:0x1710, B:317:0x172d, B:318:0x176a, B:320:0x1447, B:322:0x1468, B:323:0x14a8, B:339:0x124b, B:341:0x1268, B:342:0x12a9, B:353:0x0e67, B:355:0x0e88, B:356:0x0ec9, B:362:0x0b62, B:364:0x0b7f, B:365:0x0bc2, B:369:0x0c76, B:371:0x0c93, B:372:0x0cd3, B:374:0x0937, B:376:0x0959, B:377:0x09af, B:386:0x0615, B:388:0x0632, B:389:0x0673, B:391:0x0682, B:393:0x0695, B:394:0x06cc, B:396:0x06d6, B:398:0x06e9, B:399:0x0725, B:404:0x079b, B:406:0x07b8, B:407:0x07f9, B:411:0x01d9, B:413:0x01f9, B:414:0x023b), top: B:2:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x29c3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x2749 A[Catch: all -> 0x0247, TryCatch #5 {all -> 0x0247, blocks: (B:9:0x0135, B:11:0x0155, B:12:0x0192, B:13:0x0241, B:20:0x05a7, B:22:0x05c4, B:23:0x0605, B:30:0x08c8, B:32:0x08e9, B:33:0x092a, B:39:0x0af4, B:41:0x0b11, B:42:0x0b51, B:68:0x1168, B:70:0x1185, B:71:0x11c3, B:83:0x139d, B:85:0x13be, B:86:0x13fe, B:87:0x14af, B:94:0x15d9, B:96:0x15f5, B:97:0x162f, B:107:0x184a, B:109:0x186b, B:110:0x18ad, B:111:0x1959, B:117:0x1b4c, B:119:0x1b69, B:120:0x1bae, B:129:0x1df8, B:131:0x1e19, B:132:0x1e54, B:138:0x1f6a, B:140:0x1f86, B:141:0x1fbe, B:150:0x2270, B:152:0x2291, B:153:0x22d1, B:166:0x269a, B:168:0x26bb, B:169:0x271f, B:170:0x2841, B:172:0x2850, B:173:0x2881, B:175:0x289d, B:176:0x28d3, B:178:0x28e2, B:180:0x28f1, B:181:0x2920, B:183:0x294c, B:184:0x29a7, B:188:0x2afc, B:190:0x2b0b, B:191:0x2b3a, B:198:0x2a26, B:200:0x2a35, B:201:0x2a65, B:203:0x2a91, B:204:0x2ae9, B:215:0x2728, B:217:0x2749, B:218:0x2799, B:253:0x1fcd, B:255:0x1fea, B:256:0x2025, B:260:0x20a8, B:262:0x20c5, B:263:0x2102, B:266:0x1e61, B:268:0x1e7d, B:269:0x1eae, B:281:0x1c34, B:283:0x1c51, B:284:0x1c90, B:287:0x18f3, B:289:0x1914, B:290:0x1952, B:308:0x163f, B:310:0x165c, B:311:0x169b, B:315:0x1710, B:317:0x172d, B:318:0x176a, B:320:0x1447, B:322:0x1468, B:323:0x14a8, B:339:0x124b, B:341:0x1268, B:342:0x12a9, B:353:0x0e67, B:355:0x0e88, B:356:0x0ec9, B:362:0x0b62, B:364:0x0b7f, B:365:0x0bc2, B:369:0x0c76, B:371:0x0c93, B:372:0x0cd3, B:374:0x0937, B:376:0x0959, B:377:0x09af, B:386:0x0615, B:388:0x0632, B:389:0x0673, B:391:0x0682, B:393:0x0695, B:394:0x06cc, B:396:0x06d6, B:398:0x06e9, B:399:0x0725, B:404:0x079b, B:406:0x07b8, B:407:0x07f9, B:411:0x01d9, B:413:0x01f9, B:414:0x023b), top: B:2:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x23b2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x24f5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x202e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x1e7d A[Catch: all -> 0x0247, TryCatch #5 {all -> 0x0247, blocks: (B:9:0x0135, B:11:0x0155, B:12:0x0192, B:13:0x0241, B:20:0x05a7, B:22:0x05c4, B:23:0x0605, B:30:0x08c8, B:32:0x08e9, B:33:0x092a, B:39:0x0af4, B:41:0x0b11, B:42:0x0b51, B:68:0x1168, B:70:0x1185, B:71:0x11c3, B:83:0x139d, B:85:0x13be, B:86:0x13fe, B:87:0x14af, B:94:0x15d9, B:96:0x15f5, B:97:0x162f, B:107:0x184a, B:109:0x186b, B:110:0x18ad, B:111:0x1959, B:117:0x1b4c, B:119:0x1b69, B:120:0x1bae, B:129:0x1df8, B:131:0x1e19, B:132:0x1e54, B:138:0x1f6a, B:140:0x1f86, B:141:0x1fbe, B:150:0x2270, B:152:0x2291, B:153:0x22d1, B:166:0x269a, B:168:0x26bb, B:169:0x271f, B:170:0x2841, B:172:0x2850, B:173:0x2881, B:175:0x289d, B:176:0x28d3, B:178:0x28e2, B:180:0x28f1, B:181:0x2920, B:183:0x294c, B:184:0x29a7, B:188:0x2afc, B:190:0x2b0b, B:191:0x2b3a, B:198:0x2a26, B:200:0x2a35, B:201:0x2a65, B:203:0x2a91, B:204:0x2ae9, B:215:0x2728, B:217:0x2749, B:218:0x2799, B:253:0x1fcd, B:255:0x1fea, B:256:0x2025, B:260:0x20a8, B:262:0x20c5, B:263:0x2102, B:266:0x1e61, B:268:0x1e7d, B:269:0x1eae, B:281:0x1c34, B:283:0x1c51, B:284:0x1c90, B:287:0x18f3, B:289:0x1914, B:290:0x1952, B:308:0x163f, B:310:0x165c, B:311:0x169b, B:315:0x1710, B:317:0x172d, B:318:0x176a, B:320:0x1447, B:322:0x1468, B:323:0x14a8, B:339:0x124b, B:341:0x1268, B:342:0x12a9, B:353:0x0e67, B:355:0x0e88, B:356:0x0ec9, B:362:0x0b62, B:364:0x0b7f, B:365:0x0bc2, B:369:0x0c76, B:371:0x0c93, B:372:0x0cd3, B:374:0x0937, B:376:0x0959, B:377:0x09af, B:386:0x0615, B:388:0x0632, B:389:0x0673, B:391:0x0682, B:393:0x0695, B:394:0x06cc, B:396:0x06d6, B:398:0x06e9, B:399:0x0725, B:404:0x079b, B:406:0x07b8, B:407:0x07f9, B:411:0x01d9, B:413:0x01f9, B:414:0x023b), top: B:2:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x1bc3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x19f3  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x1a81  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x16a3  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x11db  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x113f  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0ee7  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0bcb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0959 A[Catch: all -> 0x0247, TryCatch #5 {all -> 0x0247, blocks: (B:9:0x0135, B:11:0x0155, B:12:0x0192, B:13:0x0241, B:20:0x05a7, B:22:0x05c4, B:23:0x0605, B:30:0x08c8, B:32:0x08e9, B:33:0x092a, B:39:0x0af4, B:41:0x0b11, B:42:0x0b51, B:68:0x1168, B:70:0x1185, B:71:0x11c3, B:83:0x139d, B:85:0x13be, B:86:0x13fe, B:87:0x14af, B:94:0x15d9, B:96:0x15f5, B:97:0x162f, B:107:0x184a, B:109:0x186b, B:110:0x18ad, B:111:0x1959, B:117:0x1b4c, B:119:0x1b69, B:120:0x1bae, B:129:0x1df8, B:131:0x1e19, B:132:0x1e54, B:138:0x1f6a, B:140:0x1f86, B:141:0x1fbe, B:150:0x2270, B:152:0x2291, B:153:0x22d1, B:166:0x269a, B:168:0x26bb, B:169:0x271f, B:170:0x2841, B:172:0x2850, B:173:0x2881, B:175:0x289d, B:176:0x28d3, B:178:0x28e2, B:180:0x28f1, B:181:0x2920, B:183:0x294c, B:184:0x29a7, B:188:0x2afc, B:190:0x2b0b, B:191:0x2b3a, B:198:0x2a26, B:200:0x2a35, B:201:0x2a65, B:203:0x2a91, B:204:0x2ae9, B:215:0x2728, B:217:0x2749, B:218:0x2799, B:253:0x1fcd, B:255:0x1fea, B:256:0x2025, B:260:0x20a8, B:262:0x20c5, B:263:0x2102, B:266:0x1e61, B:268:0x1e7d, B:269:0x1eae, B:281:0x1c34, B:283:0x1c51, B:284:0x1c90, B:287:0x18f3, B:289:0x1914, B:290:0x1952, B:308:0x163f, B:310:0x165c, B:311:0x169b, B:315:0x1710, B:317:0x172d, B:318:0x176a, B:320:0x1447, B:322:0x1468, B:323:0x14a8, B:339:0x124b, B:341:0x1268, B:342:0x12a9, B:353:0x0e67, B:355:0x0e88, B:356:0x0ec9, B:362:0x0b62, B:364:0x0b7f, B:365:0x0bc2, B:369:0x0c76, B:371:0x0c93, B:372:0x0cd3, B:374:0x0937, B:376:0x0959, B:377:0x09af, B:386:0x0615, B:388:0x0632, B:389:0x0673, B:391:0x0682, B:393:0x0695, B:394:0x06cc, B:396:0x06d6, B:398:0x06e9, B:399:0x0725, B:404:0x079b, B:406:0x07b8, B:407:0x07f9, B:411:0x01d9, B:413:0x01f9, B:414:0x023b), top: B:2:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0d26  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x1010  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x1153  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x12fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x15c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object getAckPreEntryAllowed(java.lang.Object[] objArr) {
        android.content.Context context;
        java.lang.Object[] objArr2;
        char c;
        char c2;
        java.lang.Object[] objArr3;
        int i;
        com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects;
        long j;
        java.lang.Object obj;
        char c3;
        char c4;
        java.lang.Object[] objArr4;
        int i2;
        long j2;
        byte b;
        java.lang.Integer num;
        java.lang.String str;
        java.lang.String str2;
        byte b2;
        java.lang.Object[] objArr5;
        int i3;
        java.lang.String str3;
        java.lang.String str4;
        long j3;
        char c5;
        int i4;
        int i5;
        java.lang.Object[] objArr6;
        int i6;
        long j4;
        android.content.Context context2;
        java.lang.String str5;
        java.lang.Object[] objArr7;
        int i7;
        java.lang.String str6;
        long j5;
        java.lang.Object obj2;
        char c6;
        char c7;
        java.lang.Object[] objArr8;
        int i8;
        long j6;
        android.content.Context context3;
        java.lang.Object[] objArr9;
        long j7;
        java.lang.String str7;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        int intValue;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object invoke;
        java.lang.Object invoke2;
        android.content.Context context4;
        java.lang.Long valueOf2;
        java.lang.Class cls;
        java.lang.Object obj8;
        java.lang.Object invoke3;
        com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects2 = (com.payair.hce.setSystemGestureExclusionRects) objArr[0];
        int i9 = build;
        getMaximumPinTry = ((i9 ^ 91) + ((i9 & 91) << 1)) % 128;
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i10 = ~(lastIndexOf | (-24));
        int i11 = ~lastIndexOf;
        int i12 = ~((i11 ^ 23) | (i11 & 23) | currentTimeMillis);
        int i13 = ((lastIndexOf * (-500)) - 11500) + (((i10 ^ i12) | (i10 & i12)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING);
        int i14 = (~((i11 & (-24)) | (i11 ^ (-24)))) * 1002;
        int i15 = ~currentTimeMillis;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        b("ᜭ\uee81즞\ue272縌ঐ፮뀜큻쐎ꫮ⟝竞竁㵿屸\ufde6턩繾꠆쾦彳", (i13 ^ i14) + ((i13 & i14) << 1) + ((~((i15 & i11) | (i15 ^ i11) | 23)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING), objArr10);
        java.lang.String str8 = (java.lang.String) objArr10[0];
        int i16 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        b("庹뿀\ue1a9ླྀ냟씳ྰꈈㆇ勅\uf5f4娹\ud9d8∾濳\ueb76", ((i16 | 15) << 1) - (i16 ^ 15), objArr11);
        java.lang.String str9 = (java.lang.String) objArr11[0];
        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40, android.text.TextUtils.getCapsMode("", 0, 0) + 667, (char) (40024 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
        byte[] bArr = $$a;
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr12);
        long j8 = cls2.getField((java.lang.String) objArr12[0]).getLong(null);
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (j8 != -1) {
                                            build = (getMaximumPinTry + 25) % 128;
                                            if (j8 + 1876 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                int i17 = build + 119;
                                                getMaximumPinTry = i17 % 128;
                                                if (i17 % 2 == 0) {
                                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777176) - android.graphics.Color.rgb(0, 0, 0), 667 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (40072 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                    byte b3 = (byte) ($$b & 125);
                                                    byte b4 = bArr[2];
                                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                    c(b3, b4, (byte) (b4 | 76), objArr13);
                                                    java.lang.Object[] objArr14 = {cls3.getField((java.lang.String) objArr13[0]).get(null), 447958037, 0};
                                                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                    if (obj9 == null) {
                                                        obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 33, android.view.View.MeasureSpec.getSize(0) + 4684, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj9);
                                                    }
                                                    invoke3 = ((java.lang.reflect.Method) obj9).invoke(null, objArr14);
                                                } else {
                                                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.combineMeasuredStates(0, 0), 667 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (40024 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)));
                                                    byte b5 = (byte) ($$b & 125);
                                                    byte b6 = bArr[2];
                                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                                    c(b5, b6, (byte) (b6 | 76), objArr15);
                                                    java.lang.Object[] objArr16 = {cls4.getField((java.lang.String) objArr15[0]).get(null), 447958037, 0};
                                                    java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                    if (obj10 == null) {
                                                        obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 4684 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj10);
                                                    }
                                                    invoke3 = ((java.lang.reflect.Method) obj10).invoke(null, objArr16);
                                                }
                                                objArr3 = (java.lang.Object[]) invoke3;
                                                c2 = 0;
                                                c = 1;
                                                i = ((int[]) objArr3[c])[c2];
                                                if (((int[]) objArr3[c2])[c2] != i) {
                                                    int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                                                    int i18 = ~currentTimeMillis2;
                                                    int i19 = ~(((-614702316) & i18) | ((-614702316) ^ i18));
                                                    int i20 = -(-(((i19 ^ (-167862561)) | ((-167862561) & i19) | (~((614702315 & currentTimeMillis2) | (614702315 ^ currentTimeMillis2)))) * (-564)));
                                                    int i21 = -(-((~((currentTimeMillis2 ^ (-167796993)) | ((-167796993) & currentTimeMillis2))) * 1128));
                                                    int i22 = -(-(((~((i18 ^ (-167862561)) | ((-167862561) & i18))) | (-782499308)) * 564));
                                                    int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                                                    int i23 = -(-((((-2013232064) & currentTimeMillis3) | ((-2013232064) ^ currentTimeMillis3) | 1357053960) * 614));
                                                    int i24 = ~currentTimeMillis3;
                                                    int i25 = ~((1895789467 & i24) | (1895789467 ^ i24));
                                                    int i26 = (i25 & (-2013232064)) | ((-2013232064) ^ i25);
                                                    int i27 = ~((1474496556 ^ i24) | (i24 & 1474496556));
                                                    int i28 = (397325023 - (~i23)) + (((i26 ^ i27) | (i26 & i27)) * (-1228));
                                                    int i29 = ~((-117442597) | i24);
                                                    int i30 = ~(i24 | (-538735508));
                                                    int i31 = ((i30 ^ i29) | (i30 & i29)) * 614;
                                                    if (((((((-602883769) & i20) + (i20 | (-602883769))) - (~i21)) - 1) - (~i22)) - 1 <= (i28 ^ i31) + ((i31 & i28) << 1)) {
                                                        java.lang.Object[] objArr17 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[3])[1]), 1};
                                                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                        if (obj11 == null) {
                                                            obj11 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4684, (char) android.text.TextUtils.indexOf("", ""))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj11);
                                                        }
                                                        ((java.lang.reflect.Method) obj11).invoke(null, objArr17);
                                                    } else {
                                                        java.lang.Object[] objArr18 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[4])[0]), 0};
                                                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                        if (obj12 == null) {
                                                            obj12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 33, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4685, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj12);
                                                        }
                                                        ((java.lang.reflect.Method) obj12).invoke(null, objArr18);
                                                    }
                                                    setsystemgestureexclusionrects = setsystemgestureexclusionrects2;
                                                } else {
                                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                                    java.lang.Object[] objArr19 = {objArr3};
                                                    java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                                                    if (obj13 == null) {
                                                        obj13 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777249, 4684 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("values", java.lang.Object[].class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj13);
                                                    }
                                                    arrayList.add(((java.lang.reflect.Method) obj13).invoke(null, objArr19));
                                                    java.lang.Object[] objArr20 = {objArr3};
                                                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                                                    if (obj14 == null) {
                                                        setsystemgestureexclusionrects = setsystemgestureexclusionrects2;
                                                        obj14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 4685 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.os.Process.getGidForName("") + 1))).getMethod("writeReplace", java.lang.Object[].class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj14);
                                                    } else {
                                                        setsystemgestureexclusionrects = setsystemgestureexclusionrects2;
                                                    }
                                                    arrayList.add(((java.lang.reflect.Method) obj14).invoke(null, objArr20));
                                                    try {
                                                        java.lang.Object[] objArr21 = {java.lang.Long.valueOf(((~(i & r10)) & (i | r10)) ^ (-6233558101388165120L)), -1451363353L};
                                                        byte[] bArr2 = $$d;
                                                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                        d(bArr2[10], bArr2[37], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, objArr22);
                                                        java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr22[0]);
                                                        byte b7 = bArr2[15];
                                                        byte b8 = b7;
                                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                        d(b7, b8, (short) (b8 | 314), objArr23);
                                                        cls5.getMethod((java.lang.String) objArr23[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr21);
                                                        java.lang.Object[] objArr24 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[4])[0]), 0};
                                                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                        if (obj15 == null) {
                                                            obj15 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 34, 4684 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj15);
                                                        }
                                                        ((java.lang.reflect.Method) obj15).invoke(null, objArr24);
                                                        int i32 = getMaximumPinTry;
                                                        build = ((i32 & 1) + (i32 | 1)) % 128;
                                                    } catch (java.lang.Throwable th) {
                                                        java.lang.Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 47, 707 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((-16742932) - android.graphics.Color.rgb(0, 0, 0)));
                                                int i33 = $$b;
                                                byte b9 = (byte) (i33 & 125);
                                                byte b10 = bArr[2];
                                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                c(b9, b10, (byte) (b10 | 76), objArr25);
                                                j = cls6.getField((java.lang.String) objArr25[0]).getLong(null);
                                                if (j != -1) {
                                                    int i34 = build;
                                                    getMaximumPinTry = ((i34 ^ 17) + ((i34 & 17) << 1)) % 128;
                                                    if (j + 1949 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                        int i35 = build;
                                                        getMaximumPinTry = (((i35 | 87) << 1) - (i35 ^ 87)) % 128;
                                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 47, 706 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 34284));
                                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                        c((byte) (i33 & 126), (byte) (bArr[48] - 1), 105, objArr26);
                                                        java.lang.Object[] objArr27 = {cls7.getField((java.lang.String) objArr26[0]).get(null), 1226359029, 0};
                                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                        if (obj16 == null) {
                                                            obj16 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 33, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4718, (char) ((-1) - android.view.MotionEvent.axisFromString("")))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj16);
                                                        }
                                                        objArr4 = (java.lang.Object[]) ((java.lang.reflect.Method) obj16).invoke(null, objArr27);
                                                        c3 = 1;
                                                        c4 = 0;
                                                        i2 = ((int[]) objArr4[c3])[c4];
                                                        if (((int[]) objArr4[c4])[c4] == i2) {
                                                            int i36 = ~((int) java.lang.System.currentTimeMillis());
                                                            int i37 = ~((-773354092) | i36);
                                                            int i38 = ((i37 ^ (-1046249468)) | ((-1046249468) & i37)) * (-970);
                                                            int i39 = ~((i36 ^ (-773354092)) | ((-773354092) & i36));
                                                            int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                                                            int i40 = ~(((-539125505) & currentTimeMillis4) | ((-539125505) ^ currentTimeMillis4));
                                                            int i41 = 1059617145 - (~(((i40 ^ 2228480) | (2228480 & i40)) * 336));
                                                            int i42 = -(-(((~((1203378442 ^ currentTimeMillis4) | (1203378442 & currentTimeMillis4))) | (-1740275467)) * (-168)));
                                                            int i43 = ~currentTimeMillis4;
                                                            if (((((1412758049 | i38) << 1) - (i38 ^ 1412758049)) - 1548837196) + (((i39 ^ 272895376) | (272895376 & i39)) * 970) > (i41 ^ i42) + ((i41 & i42) << 1) + (((~((1203378442 & i43) | (i43 ^ 1203378442))) | (-539125505)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) {
                                                                java.lang.Object[] objArr28 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[87])[1]), 1};
                                                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                if (obj17 == null) {
                                                                    obj17 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('Q' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.graphics.Color.red(0) + 4717, (char) (android.os.Process.myPid() >> 22))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj17);
                                                                }
                                                                ((java.lang.reflect.Method) obj17).invoke(null, objArr28);
                                                            } else {
                                                                java.lang.Object[] objArr29 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[9])[0]), 0};
                                                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                if (obj18 == null) {
                                                                    obj18 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 34, 4717 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj18);
                                                                }
                                                                ((java.lang.reflect.Method) obj18).invoke(null, objArr29);
                                                            }
                                                        } else {
                                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                            arrayList2.add((java.lang.String) objArr4[2]);
                                                            arrayList2.add((java.lang.String) objArr4[3]);
                                                            arrayList2.add((java.lang.String) objArr4[4]);
                                                            arrayList2.add((java.lang.String) objArr4[5]);
                                                            arrayList2.add((java.lang.String) objArr4[6]);
                                                            arrayList2.add((java.lang.String) objArr4[7]);
                                                            arrayList2.add((java.lang.String) objArr4[8]);
                                                            java.lang.Object[] objArr30 = {java.lang.Long.valueOf((i2 ^ r10) ^ 8570278296212733952L), 1995423413L};
                                                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                            d(r7[10], (byte) (-$$d[30]), 321, objArr31);
                                                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr31[0]);
                                                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                            d(r7[47], r7[180], 141, objArr32);
                                                            cls8.getMethod((java.lang.String) objArr32[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr30);
                                                            java.lang.Object[] objArr33 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[9])[0]), 0};
                                                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                            if (obj19 == null) {
                                                                obj19 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.Gravity.getAbsoluteGravity(0, 0), 4718 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj19);
                                                            }
                                                            ((java.lang.reflect.Method) obj19).invoke(null, objArr33);
                                                            int i44 = getMaximumPinTry;
                                                            build = ((i44 ^ 37) + ((i44 & 37) << 1)) % 128;
                                                        }
                                                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.indexOf("", "", 0, 0), 584 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 24292));
                                                        byte b11 = bArr[2];
                                                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                        c(b9, b11, (byte) (b11 | 76), objArr34);
                                                        j2 = cls9.getField((java.lang.String) objArr34[0]).getLong(null);
                                                        if (j2 != -1) {
                                                            int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                                                            int i45 = ~currentTimeMillis5;
                                                            int i46 = ~(((-1895531276) ^ i45) | (i45 & (-1895531276)));
                                                            int i47 = ~((currentTimeMillis5 ^ 871763646) | (currentTimeMillis5 & 871763646));
                                                            int i48 = ((i46 ^ i47) | (i47 & i46)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                                                            int i49 = (((-1235754810) | i48) << 1) - (i48 ^ (-1235754810));
                                                            int i50 = (871763646 ^ i45) | (i45 & 871763646);
                                                            int i51 = ~((i50 ^ 1895531275) | (1895531275 & i50));
                                                            int i52 = ~(currentTimeMillis5 | (-821166603));
                                                            int i53 = -(-(((i52 ^ i51) | (i52 & i51)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                                            b = b9;
                                                            int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                                                            int i54 = ~((464459475 & currentTimeMillis6) | (currentTimeMillis6 ^ 464459475));
                                                            int i55 = ((i54 ^ 1140899872) | (i54 & 1140899872)) * (-140);
                                                            int i56 = (((i55 ^ (-1732128383)) + ((i55 & (-1732128383)) << 1)) - (~(-(-((~((1605359347 & currentTimeMillis6) | (currentTimeMillis6 ^ 1605359347))) * 70))))) - 1;
                                                            int i57 = ~(currentTimeMillis6 | 1334367392);
                                                            int i58 = -(-(((i57 ^ 1411891827) | (1411891827 & i57)) * 70));
                                                            num = 1;
                                                            if (((i49 | i53) << 1) - (i53 ^ i49) <= (i56 ^ i58) + ((i56 & i58) << 1) ? j2 + 1918 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j2 % 1918 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[1]).invoke(null, new java.lang.Object[1])).longValue()) {
                                                                build = (getMaximumPinTry + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.indexOf("", "", 0, 0), 584 - android.graphics.Color.red(0), (char) (24291 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                                                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                c((byte) (i33 & 126), (byte) (bArr[48] - 1), 105, objArr35);
                                                                java.lang.Object[] objArr36 = {cls10.getField((java.lang.String) objArr35[0]).get(null), -2132116575, 0};
                                                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                if (obj20 == null) {
                                                                    obj20 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 31, 4829 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj20);
                                                                }
                                                                objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) obj20).invoke(null, objArr36);
                                                                int i59 = getMaximumPinTry;
                                                                build = (((i59 | 69) << 1) - (i59 ^ 69)) % 128;
                                                                str2 = "";
                                                                str = "valueOf";
                                                                b2 = b;
                                                                i3 = ((int[]) objArr5[1])[0];
                                                                if (((int[]) objArr5[0])[0] != i3) {
                                                                    int i60 = getMaximumPinTry;
                                                                    build = ((i60 ^ 31) + ((i60 & 31) << 1)) % 128;
                                                                    java.lang.Object[] objArr37 = {objArr5, java.lang.Integer.valueOf(((int[]) objArr5[3])[0]), 0};
                                                                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                    if (obj21 == null) {
                                                                        str3 = str;
                                                                        obj21 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 31, 4830 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.view.View.getDefaultSize(0, 0))).getMethod(str3, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj21);
                                                                    } else {
                                                                        str3 = str;
                                                                    }
                                                                    ((java.lang.reflect.Method) obj21).invoke(null, objArr37);
                                                                    int i61 = build;
                                                                    getMaximumPinTry = (((i61 | 27) << 1) - (i61 ^ 27)) % 128;
                                                                    str4 = str2;
                                                                } else {
                                                                    str3 = str;
                                                                    java.lang.Object[] objArr38 = {java.lang.Long.valueOf(((i3 & (~r6)) | ((~i3) & r6)) ^ (-5564162649165398016L)), -1295507575L};
                                                                    byte[] bArr3 = $$d;
                                                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                                    d(bArr3[10], bArr3[37], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, objArr39);
                                                                    java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr39[0]);
                                                                    byte b12 = bArr3[17];
                                                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                                    d(b12, bArr3[108], (short) (b12 - 1), objArr40);
                                                                    cls11.getMethod((java.lang.String) objArr40[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr38);
                                                                    java.lang.Object[] objArr41 = {objArr5, java.lang.Integer.valueOf(((int[]) objArr5[3])[0]), 0};
                                                                    java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                    if (obj22 == null) {
                                                                        str4 = str2;
                                                                        obj22 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 30, 4830 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.text.TextUtils.indexOf(str4, str4))).getMethod(str3, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj22);
                                                                    } else {
                                                                        str4 = str2;
                                                                    }
                                                                    ((java.lang.reflect.Method) obj22).invoke(null, objArr41);
                                                                    getMaximumPinTry = (build + 57) % 128;
                                                                }
                                                                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 584 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (24290 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                                java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr42);
                                                                j3 = cls12.getField((java.lang.String) objArr42[0]).getLong(null);
                                                                if (j3 != -1) {
                                                                    int i62 = build;
                                                                    int i63 = (i62 ^ 79) + ((i62 & 79) << 1);
                                                                    getMaximumPinTry = i63 % 128;
                                                                    if (i63 % 2 != 0 ? j3 + 1892 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : (j3 | 1892) >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[1]).invoke(null, new java.lang.Object[1])).longValue()) {
                                                                        int i64 = build;
                                                                        int i65 = ((i64 | 41) << 1) - (i64 ^ 41);
                                                                        getMaximumPinTry = i65 % 128;
                                                                        if (i65 % 2 == 0) {
                                                                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 51, 584 - android.view.KeyEvent.normalizeMetaState(0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24290));
                                                                            byte b13 = (byte) (-bArr[108]);
                                                                            byte b14 = bArr[97];
                                                                            java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                                            c(b13, b14, (byte) (b14 | 60), objArr43);
                                                                            java.lang.Object[] objArr44 = {cls13.getField((java.lang.String) objArr43[0]).get(null), -1571335336, num};
                                                                            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                            if (obj23 == null) {
                                                                                obj23 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 4830, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6))).getMethod(str3, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj23);
                                                                            }
                                                                            invoke2 = ((java.lang.reflect.Method) obj23).invoke(null, objArr44);
                                                                        } else {
                                                                            java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str4) + 51, android.graphics.Color.red(0) + 584, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24291));
                                                                            byte b15 = (byte) (-bArr[108]);
                                                                            byte b16 = bArr[97];
                                                                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                                                                            c(b15, b16, (byte) (b16 | 60), objArr45);
                                                                            java.lang.Object[] objArr46 = {cls14.getField((java.lang.String) objArr45[0]).get(null), -1571335336, 0};
                                                                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                            if (obj24 == null) {
                                                                                obj24 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 4830 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1))).getMethod(str3, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj24);
                                                                            }
                                                                            invoke2 = ((java.lang.reflect.Method) obj24).invoke(null, objArr46);
                                                                        }
                                                                        i4 = i33;
                                                                        c5 = 1;
                                                                        objArr6 = (java.lang.Object[]) invoke2;
                                                                        i5 = 0;
                                                                        i6 = ((int[]) objArr6[c5])[i5];
                                                                        if (((int[]) objArr6[i5])[i5] == i6) {
                                                                            int i66 = build + 97;
                                                                            getMaximumPinTry = i66 % 128;
                                                                            if (i66 % 2 == 0) {
                                                                                int i67 = ((int[]) objArr6[2])[i5];
                                                                                java.lang.Object[] objArr47 = new java.lang.Object[3];
                                                                                objArr47[2] = num;
                                                                                objArr47[1] = java.lang.Integer.valueOf(i67);
                                                                                objArr47[i5] = objArr6;
                                                                                java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                if (obj25 == null) {
                                                                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i5, i5) + 31, android.graphics.Color.argb(i5, i5, i5, i5) + 4830, (char) android.view.View.MeasureSpec.getMode(i5));
                                                                                    java.lang.Class<?>[] clsArr = new java.lang.Class[3];
                                                                                    clsArr[i5] = java.lang.Object[].class;
                                                                                    clsArr[1] = java.lang.Integer.TYPE;
                                                                                    clsArr[2] = java.lang.Integer.TYPE;
                                                                                    obj25 = cls15.getMethod(str3, clsArr);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj25);
                                                                                }
                                                                                ((java.lang.reflect.Method) obj25).invoke(null, objArr47);
                                                                            } else {
                                                                                java.lang.Object[] objArr48 = {objArr6, java.lang.Integer.valueOf(((int[]) objArr6[3])[0]), 0};
                                                                                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                if (obj26 == null) {
                                                                                    obj26 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 4830 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getMethod(str3, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj26);
                                                                                }
                                                                                ((java.lang.reflect.Method) obj26).invoke(null, objArr48);
                                                                            }
                                                                        } else {
                                                                            new java.util.ArrayList().add((java.lang.String) objArr6[2]);
                                                                            java.lang.Object[] objArr49 = {java.lang.Long.valueOf((i6 ^ r7) ^ 6603807646925455360L), 1537568769L};
                                                                            byte b17 = $$d[10];
                                                                            byte b18 = (byte) $$e;
                                                                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                                                                            d(b17, b18, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE, objArr50);
                                                                            java.lang.Class<?> cls16 = java.lang.Class.forName((java.lang.String) objArr50[0]);
                                                                            java.lang.Object[] objArr51 = new java.lang.Object[1];
                                                                            d((short) 54, b18, 192, objArr51);
                                                                            cls16.getMethod((java.lang.String) objArr51[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr49);
                                                                            java.lang.Object[] objArr52 = {objArr6, java.lang.Integer.valueOf(((int[]) objArr6[3])[0]), 0};
                                                                            java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                            if (obj27 == null) {
                                                                                obj27 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4831, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)))).getMethod(str3, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj27);
                                                                            }
                                                                            ((java.lang.reflect.Method) obj27).invoke(null, objArr52);
                                                                        }
                                                                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 50, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 584, (char) (24291 - android.text.TextUtils.getOffsetBefore(str4, 0)));
                                                                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                                                                        c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr53);
                                                                        j4 = cls17.getField((java.lang.String) objArr53[0]).getLong(null);
                                                                        if (j4 != -1) {
                                                                            int i68 = build;
                                                                            int i69 = (i68 & 17) + (i68 | 17);
                                                                            getMaximumPinTry = i69 % 128;
                                                                            if (i69 % 2 != 0 ? j4 + 1871 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j4 % 1871 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[1]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                                int i70 = build + 7;
                                                                                getMaximumPinTry = i70 % 128;
                                                                                if (i70 % 2 == 0) {
                                                                                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.indexOf(str4, str4, 0, 0), 584 - android.view.View.resolveSize(0, 0), (char) (android.text.TextUtils.indexOf(str4, str4, 0, 0) + 24291));
                                                                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                                                                    c(b2, bArr[109], bArr[97], objArr54);
                                                                                    java.lang.Object[] objArr55 = {cls18.getField((java.lang.String) objArr54[0]).get(null), 1890149111, 0};
                                                                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                    if (obj28 == null) {
                                                                                        obj28 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.os.Process.myTid() >> 22), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4830, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6))).getMethod(str3, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj28);
                                                                                    }
                                                                                    invoke = ((java.lang.reflect.Method) obj28).invoke(null, objArr55);
                                                                                } else {
                                                                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.Color.green(0) + 584, (char) (24291 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)));
                                                                                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                                                                                    c(b2, bArr[109], bArr[97], objArr56);
                                                                                    java.lang.Object[] objArr57 = {cls19.getField((java.lang.String) objArr56[0]).get(null), 1890149111, 0};
                                                                                    java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                    if (obj29 == null) {
                                                                                        obj29 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.os.Process.myTid() >> 22), 4830 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod(str3, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj29);
                                                                                    }
                                                                                    invoke = ((java.lang.reflect.Method) obj29).invoke(null, objArr57);
                                                                                }
                                                                                objArr7 = (java.lang.Object[]) invoke;
                                                                                str5 = str3;
                                                                                i7 = ((int[]) objArr7[1])[0];
                                                                                if (((int[]) objArr7[0])[0] != i7) {
                                                                                    int i71 = getMaximumPinTry;
                                                                                    build = (((i71 | 27) << 1) - (i71 ^ 27)) % 128;
                                                                                    java.lang.Object[] objArr58 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[3])[0]), 0};
                                                                                    java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                    if (obj30 == null) {
                                                                                        str6 = str5;
                                                                                        obj30 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 30, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4830, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj30);
                                                                                    } else {
                                                                                        str6 = str5;
                                                                                    }
                                                                                    ((java.lang.reflect.Method) obj30).invoke(null, objArr58);
                                                                                    int i72 = build;
                                                                                    getMaximumPinTry = ((i72 ^ 95) + ((i72 & 95) << 1)) % 128;
                                                                                } else {
                                                                                    str6 = str5;
                                                                                    java.lang.Object[] objArr59 = {java.lang.Long.valueOf(((~(i7 & r7)) & (i7 | r7)) ^ (-1356043792368533504L)), -315728037L};
                                                                                    byte[] bArr4 = $$d;
                                                                                    byte b19 = bArr4[10];
                                                                                    byte b20 = bArr4[61];
                                                                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                                                    d(b19, b20, (short) (b20 | 456), objArr60);
                                                                                    java.lang.Class<?> cls20 = java.lang.Class.forName((java.lang.String) objArr60[0]);
                                                                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                                                    d(bArr4[47], bArr4[180], 141, objArr61);
                                                                                    cls20.getMethod((java.lang.String) objArr61[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr59);
                                                                                    java.lang.Object[] objArr62 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[3])[0]), 0};
                                                                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                    if (obj31 == null) {
                                                                                        obj31 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 30, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4830, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj31);
                                                                                    }
                                                                                    ((java.lang.reflect.Method) obj31).invoke(null, objArr62);
                                                                                    build = (getMaximumPinTry + 59) % 128;
                                                                                }
                                                                                java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 922, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                                                java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                                                c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr63);
                                                                                j5 = cls21.getField((java.lang.String) objArr63[0]).getLong(null);
                                                                                if (j5 != -1) {
                                                                                    int currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
                                                                                    int i73 = ~(((-679483393) ^ currentTimeMillis7) | ((-679483393) & currentTimeMillis7));
                                                                                    int currentTimeMillis8 = (int) java.lang.System.currentTimeMillis();
                                                                                    int i74 = ~currentTimeMillis8;
                                                                                    int i75 = ~((1510600711 & i74) | (1510600711 ^ i74));
                                                                                    int i76 = (((i75 ^ (-444041253)) | ((-444041253) & i75)) * (-1042)) + 605345366;
                                                                                    int i77 = ((1510600711 ^ currentTimeMillis8) | (currentTimeMillis8 & 1510600711)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                                                    int i78 = ~((currentTimeMillis8 & 444041252) | (currentTimeMillis8 ^ 444041252));
                                                                                    int i79 = (i78 ^ 1074294787) | (i78 & 1074294787);
                                                                                    int i80 = (i74 & (-444041253)) | (i74 ^ (-444041253));
                                                                                    int i81 = ~((i80 & 1510600711) | (i80 ^ 1510600711));
                                                                                    if (((((i73 & 1124131393) | (i73 ^ 1124131393)) * (-756)) - 1822173912) + (((~currentTimeMillis7) | (-679483393)) * 756) <= (((i76 & i77) + (i76 | i77)) - (~(-(-(((i79 ^ i81) | (i81 & i79)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))))) - 1 ? j5 + 1944 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j5 / 1944 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[1])).longValue()) {
                                                                                        java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.view.View.resolveSize(0, 0) + 922, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                                        java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                                                        c(b2, bArr[109], bArr[97], objArr64);
                                                                                        java.lang.Object[] objArr65 = {cls22.getField((java.lang.String) objArr64[0]).get(null), 86904972, 0};
                                                                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                                                        if (obj32 == null) {
                                                                                            obj32 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 4860, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj32);
                                                                                        }
                                                                                        objArr8 = (java.lang.Object[]) ((java.lang.reflect.Method) obj32).invoke(null, objArr65);
                                                                                        c7 = 0;
                                                                                        c6 = 1;
                                                                                        i8 = ((int[]) objArr8[c6])[c7];
                                                                                        if (((int[]) objArr8[c7])[c7] == i8) {
                                                                                            int i82 = build + 51;
                                                                                            getMaximumPinTry = i82 % 128;
                                                                                            if (i82 % 2 == 0) {
                                                                                                java.lang.Object[] objArr66 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[2])[1]), num};
                                                                                                java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                                                                if (obj33 == null) {
                                                                                                    obj33 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 45, android.view.MotionEvent.axisFromString(str4) + 4861, (char) android.text.TextUtils.getCapsMode(str4, 0, 0))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj33);
                                                                                                }
                                                                                                ((java.lang.reflect.Method) obj33).invoke(null, objArr66);
                                                                                            } else {
                                                                                                java.lang.Object[] objArr67 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), 0};
                                                                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                                                                if (obj34 == null) {
                                                                                                    obj34 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 45, 4860 - android.view.View.MeasureSpec.getMode(0), (char) android.graphics.Color.red(0))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj34);
                                                                                                }
                                                                                                ((java.lang.reflect.Method) obj34).invoke(null, objArr67);
                                                                                            }
                                                                                        } else {
                                                                                            new java.util.ArrayList().add((java.lang.String) objArr8[2]);
                                                                                            java.lang.Object[] objArr68 = {java.lang.Long.valueOf(((i8 & (~r7)) | ((~i8) & r7)) ^ (-7589161217227227136L)), -1766989289L};
                                                                                            byte[] bArr5 = $$d;
                                                                                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                                                            d(bArr5[10], (byte) ($$e - 3), 495, objArr69);
                                                                                            java.lang.Class<?> cls23 = java.lang.Class.forName((java.lang.String) objArr69[0]);
                                                                                            java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                                                            d(bArr5[47], bArr5[180], 141, objArr70);
                                                                                            cls23.getMethod((java.lang.String) objArr70[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr68);
                                                                                            java.lang.Object[] objArr71 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), 0};
                                                                                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                                                            if (obj35 == null) {
                                                                                                obj35 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 45, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 4860, (char) android.graphics.Color.alpha(0))).getMethod(str6, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj35);
                                                                                            }
                                                                                            ((java.lang.reflect.Method) obj35).invoke(null, objArr71);
                                                                                        }
                                                                                        java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.red(0), (-16775635) - android.graphics.Color.rgb(0, 0, 0), (char) android.graphics.Color.alpha(0));
                                                                                        byte b21 = bArr[2];
                                                                                        java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                                                        c(b2, b21, (byte) (b21 | 76), objArr72);
                                                                                        j6 = cls24.getField((java.lang.String) objArr72[0]).getLong(null);
                                                                                        if (j6 != -1) {
                                                                                            int currentTimeMillis9 = (int) java.lang.System.currentTimeMillis();
                                                                                            int i83 = ~currentTimeMillis9;
                                                                                            int i84 = (~((i83 ^ 1610209119) | (1610209119 & i83) | 693085350)) * 130;
                                                                                            int i85 = ((302305850 | i84) << 1) - (i84 ^ 302305850);
                                                                                            int i86 = ~((currentTimeMillis9 ^ 2147481599) | (2147481599 & currentTimeMillis9));
                                                                                            int currentTimeMillis10 = (int) java.lang.System.currentTimeMillis();
                                                                                            int i87 = ~currentTimeMillis10;
                                                                                            int i88 = ~(((-1557580783) & i87) | ((-1557580783) ^ i87));
                                                                                            int i89 = ~((1610021887 & currentTimeMillis10) | (currentTimeMillis10 ^ 1610021887));
                                                                                            int i90 = -(-(((i88 & i89) | (i88 ^ i89)) * (-831)));
                                                                                            int i91 = (543166886 & i90) + (i90 | 543166886) + ((~(((-1073924877) & currentTimeMillis10) | (currentTimeMillis10 ^ (-1073924877)))) * (-1662));
                                                                                            int i92 = ~((i87 ^ (-536097012)) | ((-536097012) & i87));
                                                                                            int i93 = ~((536097011 & currentTimeMillis10) | (currentTimeMillis10 ^ 536097011));
                                                                                            int i94 = (i92 & i93) | (i92 ^ i93);
                                                                                            int i95 = ~(currentTimeMillis10 | 1557580782);
                                                                                            int i96 = ((i95 ^ i94) | (i95 & i94)) * 831;
                                                                                            int i97 = ((((-532480) | i85) << 1) - (i85 ^ (-532480))) + (((i86 ^ 155812870) | (155812870 & i86)) * 130) > (i91 ^ i96) + ((i96 & i91) << 1) ? 0 : 0;
                                                                                        }
                                                                                        int i98 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                                                        int currentTimeMillis11 = (int) java.lang.System.currentTimeMillis();
                                                                                        int i99 = i98 * (-947);
                                                                                        int i100 = ~i98;
                                                                                        int i101 = ~(currentTimeMillis11 | (-27));
                                                                                        int i102 = -(-(((i101 ^ i100) | (i100 & i101)) * (-948)));
                                                                                        int i103 = i100 | (-27);
                                                                                        int i104 = ~currentTimeMillis11;
                                                                                        int i105 = (((((i99 | 24674) << 1) - (i99 ^ 24674)) - (~i102)) - 1) + ((~((i104 ^ i103) | (i104 & i103))) * (-948));
                                                                                        int i106 = -(-(((i98 ^ (-27)) | (i98 & (-27))) * 948));
                                                                                        java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                                                        b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", ((i105 | i106) << 1) - (i106 ^ i105), objArr73);
                                                                                        java.lang.Class<?> cls25 = java.lang.Class.forName((java.lang.String) objArr73[0]);
                                                                                        int i107 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                        int currentTimeMillis12 = (int) java.lang.System.currentTimeMillis();
                                                                                        int i108 = i107 * (-496);
                                                                                        int i109 = ~i107;
                                                                                        int i110 = ((i108 | (-8432)) << 1) - (i108 ^ (-8432));
                                                                                        int i111 = i109 | (-18);
                                                                                        int i112 = (i110 - (~(-(-((~i111) * 497))))) - 1;
                                                                                        int i113 = ~currentTimeMillis12;
                                                                                        int i114 = (i113 ^ (-18)) | (i113 & (-18));
                                                                                        int i115 = -(-(((~((i111 & currentTimeMillis12) | (i111 ^ currentTimeMillis12))) | (~((i114 ^ i107) | (i114 & i107)))) * 497));
                                                                                        int i116 = ~(i113 | i109);
                                                                                        int i117 = ~((i109 ^ 17) | (i109 & 17));
                                                                                        int i118 = (i117 ^ i116) | (i117 & i116);
                                                                                        int i119 = (i107 ^ (-18)) | (i107 & (-18));
                                                                                        int i120 = ~((i119 ^ currentTimeMillis12) | (i119 & currentTimeMillis12));
                                                                                        int i121 = -(-(((i120 ^ i118) | (i120 & i118)) * 497));
                                                                                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                                                        b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", (((i112 ^ i115) + ((i115 & i112) << 1)) - (~i121)) - 1, objArr74);
                                                                                        context3 = (android.content.Context) cls25.getMethod((java.lang.String) objArr74[0], new java.lang.Class[0]).invoke(null, null);
                                                                                        if (context3 != null) {
                                                                                            int currentTimeMillis13 = (int) java.lang.System.currentTimeMillis();
                                                                                            int i122 = ~currentTimeMillis13;
                                                                                            int i123 = ((~(((-871391319) & i122) | ((-871391319) ^ i122))) | (~((683530185 & currentTimeMillis13) | (683530185 ^ currentTimeMillis13)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                                                                                            int i124 = ((-1504127040) & i123) + (i123 | (-1504127040));
                                                                                            int i125 = -(-(((~((currentTimeMillis13 ^ (-548421697)) | ((-548421697) & currentTimeMillis13))) | (~((i122 ^ 683530185) | (683530185 & i122) | 871391318))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                                                                            int currentTimeMillis14 = (int) java.lang.System.currentTimeMillis();
                                                                                            int i126 = ~currentTimeMillis14;
                                                                                            int i127 = (~((-1564161556) | i126)) | 1342845456;
                                                                                            int i128 = ~((758465899 & i126) | (758465899 ^ i126));
                                                                                            int i129 = (i127 ^ i128) | (i127 & i128);
                                                                                            int i130 = ~(((-537149801) & currentTimeMillis14) | ((-537149801) ^ currentTimeMillis14));
                                                                                            int i131 = ((i129 ^ i130) | (i129 & i130)) * (-84);
                                                                                            int i132 = ((-235346061) & i131) + (i131 | (-235346061));
                                                                                            int i133 = ~((currentTimeMillis14 ^ 758465899) | (758465899 & currentTimeMillis14));
                                                                                            int i134 = ~((i126 ^ (-758465900)) | ((-758465900) & i126));
                                                                                            int i135 = -(-(((i133 ^ 1564161555) | (1564161555 & i133) | i134) * (-84)));
                                                                                            int i136 = (i132 ^ i135) + ((i135 & i132) << 1);
                                                                                            int i137 = ((537149800 & i134) | (i134 ^ 537149800)) * 84;
                                                                                            if ((i124 ^ i125) + ((i125 & i124) << 1) > ((i136 | i137) << 1) - (i137 ^ i136)) {
                                                                                                context3.getApplicationContext();
                                                                                                throw null;
                                                                                            }
                                                                                            context3 = context3.getApplicationContext();
                                                                                        }
                                                                                        byte[] bArr6 = $$d;
                                                                                        java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                                                        d(bArr6[10], (byte) ($$e - 3), 526, objArr75);
                                                                                        java.lang.Class<?> cls26 = java.lang.Class.forName((java.lang.String) objArr75[0]);
                                                                                        byte b22 = bArr6[15];
                                                                                        byte b23 = b22;
                                                                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                                                        d(b22, b23, (short) (b23 | 314), objArr76);
                                                                                        java.lang.String str10 = (java.lang.String) objArr76[0];
                                                                                        java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                                                        java.lang.String str11 = str6;
                                                                                        e(null, null, 126 - (~android.text.TextUtils.getCapsMode(str4, 0, 0)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr77);
                                                                                        java.lang.Object[] objArr78 = (java.lang.Object[]) cls26.getMethod(str10, java.lang.Class.forName((java.lang.String) objArr77[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context3, 0, 0, -1773143076);
                                                                                        if (context3 != null) {
                                                                                            getMaximumPinTry = (build + 99) % 128;
                                                                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1581, (char) android.graphics.Color.alpha(0));
                                                                                            java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                                                            c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr79);
                                                                                            cls27.getField((java.lang.String) objArr79[0]).set(null, objArr78);
                                                                                            try {
                                                                                                long longValue = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                                java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 48, 1581 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                                                                                byte b24 = bArr[2];
                                                                                                java.lang.Object[] objArr80 = new java.lang.Object[1];
                                                                                                c(b2, b24, (byte) (b24 | 76), objArr80);
                                                                                                cls28.getField((java.lang.String) objArr80[0]).set(null, java.lang.Long.valueOf(longValue));
                                                                                            } catch (java.lang.Exception unused) {
                                                                                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                                            }
                                                                                        }
                                                                                        objArr9 = objArr78;
                                                                                        if (((int[]) objArr9[0])[0] != ((int[]) objArr9[1])[0]) {
                                                                                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                                                                            arrayList3.add((java.lang.String) objArr9[2]);
                                                                                            arrayList3.add((java.lang.String) objArr9[3]);
                                                                                        }
                                                                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 754 - android.view.KeyEvent.keyCodeFromString(str4), (char) ((android.os.Process.myTid() >> 22) + 45560));
                                                                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                                                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr81);
                                                                                        j7 = cls29.getField((java.lang.String) objArr81[0]).getLong(null);
                                                                                        if (j7 != -1) {
                                                                                            int i138 = build + 69;
                                                                                            getMaximumPinTry = i138 % 128;
                                                                                            if (i138 % 2 != 0 ? j7 + 2000 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j7 * 2000 >= ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[1])).longValue()) {
                                                                                                java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.os.Process.myTid() >> 22) + 754, (char) (45559 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                                                                java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                                                                c((byte) (i4 & 126), (byte) (bArr[48] - 1), 105, objArr82);
                                                                                                java.lang.Object[] objArr83 = {cls30.getField((java.lang.String) objArr82[0]).get(null), 1543262169, 0};
                                                                                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                                                                if (obj36 == null) {
                                                                                                    str7 = str11;
                                                                                                    obj36 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.graphics.ImageFormat.getBitsPerPixel(0) + 4791, (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 31152))).getMethod(str7, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 4751 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (33700 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj36);
                                                                                                } else {
                                                                                                    str7 = str11;
                                                                                                }
                                                                                                obj4 = ((java.lang.reflect.Method) obj36).invoke(null, objArr83);
                                                                                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                                                                                if (obj5 == null) {
                                                                                                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.view.MotionEvent.axisFromString(str4), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4749, (char) (33700 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())))).getMethod("values", null);
                                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj5);
                                                                                                }
                                                                                                intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(obj4, null)).intValue();
                                                                                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                                                                                if (obj6 == null) {
                                                                                                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 4750 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 33700))).getMethod("DigitizedCardProfile", null);
                                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj6);
                                                                                                }
                                                                                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(obj4, null)).intValue() != intValue) {
                                                                                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                                                                                    if (obj37 == null) {
                                                                                                        obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 4750 - android.view.View.MeasureSpec.getSize(0), (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 33701))).getMethod(str7, null);
                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj37);
                                                                                                    }
                                                                                                    java.lang.Object[] objArr84 = {obj4, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(obj4, null)).intValue()), 0};
                                                                                                    java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                                                                    if (obj38 == null) {
                                                                                                        obj38 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, 4790 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (31152 - android.text.TextUtils.getOffsetBefore(str4, 0)))).getMethod(str7, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str4, 0, 0) + 40, 4750 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (33701 - android.widget.ExpandableListView.getPackedPositionType(0L))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj38);
                                                                                                    }
                                                                                                    ((java.lang.reflect.Method) obj38).invoke(null, objArr84);
                                                                                                    int i139 = getMaximumPinTry;
                                                                                                    int i140 = ((i139 | 91) << 1) - (i139 ^ 91);
                                                                                                    build = i140 % 128;
                                                                                                    if (i140 % 2 != 0) {
                                                                                                        int i141 = 5 / 5;
                                                                                                    }
                                                                                                } else {
                                                                                                    java.lang.Object[] objArr85 = {java.lang.Long.valueOf((intValue ^ r5) ^ (-2845724607388844032L)), -662569844L};
                                                                                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                                                                    d(r4[10], (byte) (-$$d[60]), com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CHANGE_PIN_CANNOT_BE_SAME_AS_PREVIOUS_PINS, objArr86);
                                                                                                    java.lang.Class<?> cls31 = java.lang.Class.forName((java.lang.String) objArr86[0]);
                                                                                                    java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                                                                    d(r4[47], r4[180], 141, objArr87);
                                                                                                    cls31.getMethod((java.lang.String) objArr87[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr85);
                                                                                                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                                                                                    if (obj39 == null) {
                                                                                                        obj39 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.os.Process.myTid() >> 22) + 4750, (char) (android.text.TextUtils.indexOf(str4, str4) + 33701))).getMethod(str7, null);
                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj39);
                                                                                                    }
                                                                                                    java.lang.Object[] objArr88 = {obj4, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(obj4, null)).intValue()), 0};
                                                                                                    java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                                                                    if (obj40 == null) {
                                                                                                        obj40 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 40, (android.os.Process.myPid() >> 22) + 4790, (char) (android.text.TextUtils.indexOf(str4, str4, 0) + 31152))).getMethod(str7, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.Gravity.getAbsoluteGravity(0, 0), android.text.TextUtils.getOffsetAfter(str4, 0) + 4750, (char) (android.text.TextUtils.indexOf(str4, str4, 0, 0) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj40);
                                                                                                    }
                                                                                                    ((java.lang.reflect.Method) obj40).invoke(null, objArr88);
                                                                                                    int i142 = getMaximumPinTry;
                                                                                                    build = ((i142 ^ 21) + ((i142 & 21) << 1)) % 128;
                                                                                                }
                                                                                                obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                                                                                                if (obj7 == null) {
                                                                                                    obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 5051 - android.text.TextUtils.indexOf(str4, str4, 0, 0), (char) ((-1) - android.os.Process.getGidForName(str4)))).getMethod("AlternateContactlessPaymentDataJson", null);
                                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj7);
                                                                                                }
                                                                                                ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).IccPrivateKeyCrtComponentsJson();
                                                                                                return null;
                                                                                            }
                                                                                        }
                                                                                        str7 = str11;
                                                                                        java.lang.Object[] objArr89 = {0, 1543262169};
                                                                                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                                                                        if (obj3 == null) {
                                                                                            java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 47, 755 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.graphics.Color.blue(0) + 45560));
                                                                                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                                                            c((byte) (i4 & 126), (byte) (bArr[48] - 1), 105, objArr90);
                                                                                            obj3 = cls32.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj3);
                                                                                        }
                                                                                        java.lang.Object invoke4 = ((java.lang.reflect.Method) obj3).invoke(null, objArr89);
                                                                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 754, (char) (45560 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                                                                                        java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                                                        c((byte) (i4 & 126), (byte) (bArr[48] - 1), 105, objArr91);
                                                                                        cls33.getField((java.lang.String) objArr91[0]).set(null, invoke4);
                                                                                        long longValue2 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 754 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45561));
                                                                                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                                                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr92);
                                                                                        cls34.getField((java.lang.String) objArr92[0]).set(null, java.lang.Long.valueOf(longValue2));
                                                                                        obj4 = invoke4;
                                                                                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                                                                        if (obj5 == null) {
                                                                                        }
                                                                                        intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(obj4, null)).intValue();
                                                                                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                                                                        if (obj6 == null) {
                                                                                        }
                                                                                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(obj4, null)).intValue() != intValue) {
                                                                                        }
                                                                                        obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                                                                                        if (obj7 == null) {
                                                                                        }
                                                                                        ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).IccPrivateKeyCrtComponentsJson();
                                                                                        return null;
                                                                                    }
                                                                                }
                                                                                java.lang.Object[] objArr93 = {351743492};
                                                                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                                                if (obj2 == null) {
                                                                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str4, str4, 0) + 49, android.view.KeyEvent.normalizeMetaState(0) + 873, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 15955))).getDeclaredConstructor(java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj2);
                                                                                }
                                                                                java.lang.Object[] values$466995e3 = com.payair.hce.getCardMetadata.AnonymousClass5.values$466995e3(((java.lang.reflect.Constructor) obj2).newInstance(objArr93));
                                                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.MeasureSpec.getSize(0), 922 - android.text.TextUtils.indexOf(str4, str4), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                                                c(b2, bArr[109], bArr[97], objArr94);
                                                                                cls35.getField((java.lang.String) objArr94[0]).set(null, values$466995e3);
                                                                                long longValue3 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777172) - android.graphics.Color.rgb(0, 0, 0), 921 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                                                c6 = 1;
                                                                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                                                c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr95);
                                                                                c7 = 0;
                                                                                cls36.getField((java.lang.String) objArr95[0]).set(null, java.lang.Long.valueOf(longValue3));
                                                                                objArr8 = values$466995e3;
                                                                                i8 = ((int[]) objArr8[c6])[c7];
                                                                                if (((int[]) objArr8[c7])[c7] == i8) {
                                                                                }
                                                                                java.lang.Class cls242 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.red(0), (-16775635) - android.graphics.Color.rgb(0, 0, 0), (char) android.graphics.Color.alpha(0));
                                                                                byte b212 = bArr[2];
                                                                                java.lang.Object[] objArr722 = new java.lang.Object[1];
                                                                                c(b2, b212, (byte) (b212 | 76), objArr722);
                                                                                j6 = cls242.getField((java.lang.String) objArr722[0]).getLong(null);
                                                                                if (j6 != -1) {
                                                                                }
                                                                                int i982 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                                                int currentTimeMillis112 = (int) java.lang.System.currentTimeMillis();
                                                                                int i992 = i982 * (-947);
                                                                                int i1002 = ~i982;
                                                                                int i1012 = ~(currentTimeMillis112 | (-27));
                                                                                int i1022 = -(-(((i1012 ^ i1002) | (i1002 & i1012)) * (-948)));
                                                                                int i1032 = i1002 | (-27);
                                                                                int i1042 = ~currentTimeMillis112;
                                                                                int i1052 = (((((i992 | 24674) << 1) - (i992 ^ 24674)) - (~i1022)) - 1) + ((~((i1042 ^ i1032) | (i1042 & i1032))) * (-948));
                                                                                int i1062 = -(-(((i982 ^ (-27)) | (i982 & (-27))) * 948));
                                                                                java.lang.Object[] objArr732 = new java.lang.Object[1];
                                                                                b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", ((i1052 | i1062) << 1) - (i1062 ^ i1052), objArr732);
                                                                                java.lang.Class<?> cls252 = java.lang.Class.forName((java.lang.String) objArr732[0]);
                                                                                int i1072 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                int currentTimeMillis122 = (int) java.lang.System.currentTimeMillis();
                                                                                int i1082 = i1072 * (-496);
                                                                                int i1092 = ~i1072;
                                                                                int i1102 = ((i1082 | (-8432)) << 1) - (i1082 ^ (-8432));
                                                                                int i1112 = i1092 | (-18);
                                                                                int i1122 = (i1102 - (~(-(-((~i1112) * 497))))) - 1;
                                                                                int i1132 = ~currentTimeMillis122;
                                                                                int i1142 = (i1132 ^ (-18)) | (i1132 & (-18));
                                                                                int i1152 = -(-(((~((i1112 & currentTimeMillis122) | (i1112 ^ currentTimeMillis122))) | (~((i1142 ^ i1072) | (i1142 & i1072)))) * 497));
                                                                                int i1162 = ~(i1132 | i1092);
                                                                                int i1172 = ~((i1092 ^ 17) | (i1092 & 17));
                                                                                int i1182 = (i1172 ^ i1162) | (i1172 & i1162);
                                                                                int i1192 = (i1072 ^ (-18)) | (i1072 & (-18));
                                                                                int i1202 = ~((i1192 ^ currentTimeMillis122) | (i1192 & currentTimeMillis122));
                                                                                int i1212 = -(-(((i1202 ^ i1182) | (i1202 & i1182)) * 497));
                                                                                java.lang.Object[] objArr742 = new java.lang.Object[1];
                                                                                b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", (((i1122 ^ i1152) + ((i1152 & i1122) << 1)) - (~i1212)) - 1, objArr742);
                                                                                context3 = (android.content.Context) cls252.getMethod((java.lang.String) objArr742[0], new java.lang.Class[0]).invoke(null, null);
                                                                                if (context3 != null) {
                                                                                }
                                                                                byte[] bArr62 = $$d;
                                                                                java.lang.Object[] objArr752 = new java.lang.Object[1];
                                                                                d(bArr62[10], (byte) ($$e - 3), 526, objArr752);
                                                                                java.lang.Class<?> cls262 = java.lang.Class.forName((java.lang.String) objArr752[0]);
                                                                                byte b222 = bArr62[15];
                                                                                byte b232 = b222;
                                                                                java.lang.Object[] objArr762 = new java.lang.Object[1];
                                                                                d(b222, b232, (short) (b232 | 314), objArr762);
                                                                                java.lang.String str102 = (java.lang.String) objArr762[0];
                                                                                java.lang.Object[] objArr772 = new java.lang.Object[1];
                                                                                java.lang.String str112 = str6;
                                                                                e(null, null, 126 - (~android.text.TextUtils.getCapsMode(str4, 0, 0)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr772);
                                                                                java.lang.Object[] objArr782 = (java.lang.Object[]) cls262.getMethod(str102, java.lang.Class.forName((java.lang.String) objArr772[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context3, 0, 0, -1773143076);
                                                                                if (context3 != null) {
                                                                                }
                                                                                objArr9 = objArr782;
                                                                                if (((int[]) objArr9[0])[0] != ((int[]) objArr9[1])[0]) {
                                                                                }
                                                                                java.lang.Class cls292 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 754 - android.view.KeyEvent.keyCodeFromString(str4), (char) ((android.os.Process.myTid() >> 22) + 45560));
                                                                                java.lang.Object[] objArr812 = new java.lang.Object[1];
                                                                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr812);
                                                                                j7 = cls292.getField((java.lang.String) objArr812[0]).getLong(null);
                                                                                if (j7 != -1) {
                                                                                }
                                                                                str7 = str112;
                                                                                java.lang.Object[] objArr892 = {0, 1543262169};
                                                                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                                                                if (obj3 == null) {
                                                                                }
                                                                                java.lang.Object invoke42 = ((java.lang.reflect.Method) obj3).invoke(null, objArr892);
                                                                                java.lang.Class cls332 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 754, (char) (45560 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                                                                                java.lang.Object[] objArr912 = new java.lang.Object[1];
                                                                                c((byte) (i4 & 126), (byte) (bArr[48] - 1), 105, objArr912);
                                                                                cls332.getField((java.lang.String) objArr912[0]).set(null, invoke42);
                                                                                long longValue22 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                java.lang.Class cls342 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 754 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45561));
                                                                                java.lang.Object[] objArr922 = new java.lang.Object[1];
                                                                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr922);
                                                                                cls342.getField((java.lang.String) objArr922[0]).set(null, java.lang.Long.valueOf(longValue22));
                                                                                obj4 = invoke42;
                                                                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                                                                if (obj5 == null) {
                                                                                }
                                                                                intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(obj4, null)).intValue();
                                                                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                                                                if (obj6 == null) {
                                                                                }
                                                                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(obj4, null)).intValue() != intValue) {
                                                                                }
                                                                                obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                                                                                if (obj7 == null) {
                                                                                }
                                                                                ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).IccPrivateKeyCrtComponentsJson();
                                                                                return null;
                                                                            }
                                                                        }
                                                                        int i143 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                                        b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", (i143 & 25) + (i143 | 25), objArr96);
                                                                        java.lang.Class<?> cls37 = java.lang.Class.forName((java.lang.String) objArr96[0]);
                                                                        int i144 = -android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                        int i145 = i144 * (-51);
                                                                        int i146 = ((i145 | 901) << 1) - (i145 ^ 901);
                                                                        int i147 = ~((int) java.lang.System.currentTimeMillis());
                                                                        int i148 = (i147 ^ i144) | (i147 & i144);
                                                                        int i149 = -(-((~((i148 & 17) | (i148 ^ 17))) * 52));
                                                                        int i150 = ((i146 | i149) << 1) - (i146 ^ i149);
                                                                        int i151 = ~((i147 & (-18)) | (i147 ^ (-18)));
                                                                        int i152 = ~((i144 & (-18)) | (i144 ^ (-18)));
                                                                        int i153 = (i151 ^ i152) | (i151 & i152);
                                                                        int i154 = ~i148;
                                                                        int i155 = ((i154 ^ i153) | (i154 & i153)) * (-52);
                                                                        int i156 = ~i144;
                                                                        int i157 = ~(i147 | i156);
                                                                        int i158 = ~((i156 ^ 17) | (i156 & 17));
                                                                        java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                                        b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", (((i150 ^ i155) + ((i155 & i150) << 1)) - (~(((i158 ^ i157) | (i158 & i157)) * 52))) - 1, objArr97);
                                                                        context2 = (android.content.Context) cls37.getMethod((java.lang.String) objArr97[0], new java.lang.Class[0]).invoke(null, null);
                                                                        if (context2 != null) {
                                                                            int i159 = getMaximumPinTry;
                                                                            build = (((i159 | 91) << 1) - (i159 ^ 91)) % 128;
                                                                            context2 = context2.getApplicationContext();
                                                                        }
                                                                        byte[] bArr7 = $$d;
                                                                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                                        d(bArr7[10], bArr7[324], 450, objArr98);
                                                                        java.lang.Class<?> cls38 = java.lang.Class.forName((java.lang.String) objArr98[0]);
                                                                        java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                                        d(bArr7[47], bArr7[180], 141, objArr99);
                                                                        java.lang.String str12 = (java.lang.String) objArr99[0];
                                                                        str5 = str3;
                                                                        java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                                        e(null, null, 128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr100);
                                                                        java.lang.Object[] objArr101 = (java.lang.Object[]) cls38.getMethod(str12, java.lang.Class.forName((java.lang.String) objArr100[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context2, 0, 1890149111);
                                                                        if (context2 != null) {
                                                                            build = (getMaximumPinTry + 75) % 128;
                                                                            java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str4, str4, 0) + 51, 584 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 24291));
                                                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                                            c(b2, bArr[109], bArr[97], objArr102);
                                                                            cls39.getField((java.lang.String) objArr102[0]).set(null, objArr101);
                                                                            try {
                                                                                long longValue4 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str4, str4, 0, 0) + 51, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 583, (char) (24291 - android.text.TextUtils.getCapsMode(str4, 0, 0)));
                                                                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                                                c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr103);
                                                                                cls40.getField((java.lang.String) objArr103[0]).set(null, java.lang.Long.valueOf(longValue4));
                                                                            } catch (java.lang.Exception unused2) {
                                                                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                            }
                                                                        }
                                                                        objArr7 = objArr101;
                                                                        i7 = ((int[]) objArr7[1])[0];
                                                                        if (((int[]) objArr7[0])[0] != i7) {
                                                                        }
                                                                        java.lang.Class cls212 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 922, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                                        java.lang.Object[] objArr632 = new java.lang.Object[1];
                                                                        c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr632);
                                                                        j5 = cls212.getField((java.lang.String) objArr632[0]).getLong(null);
                                                                        if (j5 != -1) {
                                                                        }
                                                                        java.lang.Object[] objArr932 = {351743492};
                                                                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                                        if (obj2 == null) {
                                                                        }
                                                                        java.lang.Object[] values$466995e32 = com.payair.hce.getCardMetadata.AnonymousClass5.values$466995e3(((java.lang.reflect.Constructor) obj2).newInstance(objArr932));
                                                                        java.lang.Class cls352 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.MeasureSpec.getSize(0), 922 - android.text.TextUtils.indexOf(str4, str4), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                                        java.lang.Object[] objArr942 = new java.lang.Object[1];
                                                                        c(b2, bArr[109], bArr[97], objArr942);
                                                                        cls352.getField((java.lang.String) objArr942[0]).set(null, values$466995e32);
                                                                        long longValue32 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                        java.lang.Class cls362 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777172) - android.graphics.Color.rgb(0, 0, 0), 921 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                                        c6 = 1;
                                                                        java.lang.Object[] objArr952 = new java.lang.Object[1];
                                                                        c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr952);
                                                                        c7 = 0;
                                                                        cls362.getField((java.lang.String) objArr952[0]).set(null, java.lang.Long.valueOf(longValue32));
                                                                        objArr8 = values$466995e32;
                                                                        i8 = ((int[]) objArr8[c6])[c7];
                                                                        if (((int[]) objArr8[c7])[c7] == i8) {
                                                                        }
                                                                        java.lang.Class cls2422 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.red(0), (-16775635) - android.graphics.Color.rgb(0, 0, 0), (char) android.graphics.Color.alpha(0));
                                                                        byte b2122 = bArr[2];
                                                                        java.lang.Object[] objArr7222 = new java.lang.Object[1];
                                                                        c(b2, b2122, (byte) (b2122 | 76), objArr7222);
                                                                        j6 = cls2422.getField((java.lang.String) objArr7222[0]).getLong(null);
                                                                        if (j6 != -1) {
                                                                        }
                                                                        int i9822 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                                        int currentTimeMillis1122 = (int) java.lang.System.currentTimeMillis();
                                                                        int i9922 = i9822 * (-947);
                                                                        int i10022 = ~i9822;
                                                                        int i10122 = ~(currentTimeMillis1122 | (-27));
                                                                        int i10222 = -(-(((i10122 ^ i10022) | (i10022 & i10122)) * (-948)));
                                                                        int i10322 = i10022 | (-27);
                                                                        int i10422 = ~currentTimeMillis1122;
                                                                        int i10522 = (((((i9922 | 24674) << 1) - (i9922 ^ 24674)) - (~i10222)) - 1) + ((~((i10422 ^ i10322) | (i10422 & i10322))) * (-948));
                                                                        int i10622 = -(-(((i9822 ^ (-27)) | (i9822 & (-27))) * 948));
                                                                        java.lang.Object[] objArr7322 = new java.lang.Object[1];
                                                                        b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", ((i10522 | i10622) << 1) - (i10622 ^ i10522), objArr7322);
                                                                        java.lang.Class<?> cls2522 = java.lang.Class.forName((java.lang.String) objArr7322[0]);
                                                                        int i10722 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                        int currentTimeMillis1222 = (int) java.lang.System.currentTimeMillis();
                                                                        int i10822 = i10722 * (-496);
                                                                        int i10922 = ~i10722;
                                                                        int i11022 = ((i10822 | (-8432)) << 1) - (i10822 ^ (-8432));
                                                                        int i11122 = i10922 | (-18);
                                                                        int i11222 = (i11022 - (~(-(-((~i11122) * 497))))) - 1;
                                                                        int i11322 = ~currentTimeMillis1222;
                                                                        int i11422 = (i11322 ^ (-18)) | (i11322 & (-18));
                                                                        int i11522 = -(-(((~((i11122 & currentTimeMillis1222) | (i11122 ^ currentTimeMillis1222))) | (~((i11422 ^ i10722) | (i11422 & i10722)))) * 497));
                                                                        int i11622 = ~(i11322 | i10922);
                                                                        int i11722 = ~((i10922 ^ 17) | (i10922 & 17));
                                                                        int i11822 = (i11722 ^ i11622) | (i11722 & i11622);
                                                                        int i11922 = (i10722 ^ (-18)) | (i10722 & (-18));
                                                                        int i12022 = ~((i11922 ^ currentTimeMillis1222) | (i11922 & currentTimeMillis1222));
                                                                        int i12122 = -(-(((i12022 ^ i11822) | (i12022 & i11822)) * 497));
                                                                        java.lang.Object[] objArr7422 = new java.lang.Object[1];
                                                                        b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", (((i11222 ^ i11522) + ((i11522 & i11222) << 1)) - (~i12122)) - 1, objArr7422);
                                                                        context3 = (android.content.Context) cls2522.getMethod((java.lang.String) objArr7422[0], new java.lang.Class[0]).invoke(null, null);
                                                                        if (context3 != null) {
                                                                        }
                                                                        byte[] bArr622 = $$d;
                                                                        java.lang.Object[] objArr7522 = new java.lang.Object[1];
                                                                        d(bArr622[10], (byte) ($$e - 3), 526, objArr7522);
                                                                        java.lang.Class<?> cls2622 = java.lang.Class.forName((java.lang.String) objArr7522[0]);
                                                                        byte b2222 = bArr622[15];
                                                                        byte b2322 = b2222;
                                                                        java.lang.Object[] objArr7622 = new java.lang.Object[1];
                                                                        d(b2222, b2322, (short) (b2322 | 314), objArr7622);
                                                                        java.lang.String str1022 = (java.lang.String) objArr7622[0];
                                                                        java.lang.Object[] objArr7722 = new java.lang.Object[1];
                                                                        java.lang.String str1122 = str6;
                                                                        e(null, null, 126 - (~android.text.TextUtils.getCapsMode(str4, 0, 0)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr7722);
                                                                        java.lang.Object[] objArr7822 = (java.lang.Object[]) cls2622.getMethod(str1022, java.lang.Class.forName((java.lang.String) objArr7722[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context3, 0, 0, -1773143076);
                                                                        if (context3 != null) {
                                                                        }
                                                                        objArr9 = objArr7822;
                                                                        if (((int[]) objArr9[0])[0] != ((int[]) objArr9[1])[0]) {
                                                                        }
                                                                        java.lang.Class cls2922 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 754 - android.view.KeyEvent.keyCodeFromString(str4), (char) ((android.os.Process.myTid() >> 22) + 45560));
                                                                        java.lang.Object[] objArr8122 = new java.lang.Object[1];
                                                                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr8122);
                                                                        j7 = cls2922.getField((java.lang.String) objArr8122[0]).getLong(null);
                                                                        if (j7 != -1) {
                                                                        }
                                                                        str7 = str1122;
                                                                        java.lang.Object[] objArr8922 = {0, 1543262169};
                                                                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                                                        if (obj3 == null) {
                                                                        }
                                                                        java.lang.Object invoke422 = ((java.lang.reflect.Method) obj3).invoke(null, objArr8922);
                                                                        java.lang.Class cls3322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 754, (char) (45560 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                                                                        java.lang.Object[] objArr9122 = new java.lang.Object[1];
                                                                        c((byte) (i4 & 126), (byte) (bArr[48] - 1), 105, objArr9122);
                                                                        cls3322.getField((java.lang.String) objArr9122[0]).set(null, invoke422);
                                                                        long longValue222 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                        java.lang.Class cls3422 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 754 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45561));
                                                                        java.lang.Object[] objArr9222 = new java.lang.Object[1];
                                                                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr9222);
                                                                        cls3422.getField((java.lang.String) objArr9222[0]).set(null, java.lang.Long.valueOf(longValue222));
                                                                        obj4 = invoke422;
                                                                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                                                        if (obj5 == null) {
                                                                        }
                                                                        intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(obj4, null)).intValue();
                                                                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                                                        if (obj6 == null) {
                                                                        }
                                                                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(obj4, null)).intValue() != intValue) {
                                                                        }
                                                                        obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                                                                        if (obj7 == null) {
                                                                        }
                                                                        ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).IccPrivateKeyCrtComponentsJson();
                                                                        return null;
                                                                    }
                                                                }
                                                                byte[] bArr8 = $$d;
                                                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                                d(bArr8[10], bArr8[139], (short) ($$e | 352), objArr104);
                                                                java.lang.Class<?> cls41 = java.lang.Class.forName((java.lang.String) objArr104[0]);
                                                                byte b25 = bArr8[15];
                                                                byte b26 = bArr8[47];
                                                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                d(b25, b26, (short) (b26 | 270), objArr105);
                                                                java.lang.Object[] objArr106 = (java.lang.Object[]) cls41.getMethod((java.lang.String) objArr105[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, 0, -1571335336);
                                                                java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.myPid() >> 22), android.graphics.Color.alpha(0) + 584, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 24291));
                                                                byte b27 = (byte) (-bArr[108]);
                                                                byte b28 = bArr[97];
                                                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                c(b27, b28, (byte) (b28 | 60), objArr107);
                                                                cls42.getField((java.lang.String) objArr107[0]).set(null, objArr106);
                                                                long longValue5 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 51, 584 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((android.os.Process.myPid() >> 22) + 24291));
                                                                c5 = 1;
                                                                i4 = i33;
                                                                java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr108);
                                                                i5 = 0;
                                                                cls43.getField((java.lang.String) objArr108[0]).set(null, java.lang.Long.valueOf(longValue5));
                                                                objArr6 = objArr106;
                                                                i6 = ((int[]) objArr6[c5])[i5];
                                                                if (((int[]) objArr6[i5])[i5] == i6) {
                                                                }
                                                                java.lang.Class cls172 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 50, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 584, (char) (24291 - android.text.TextUtils.getOffsetBefore(str4, 0)));
                                                                java.lang.Object[] objArr532 = new java.lang.Object[1];
                                                                c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr532);
                                                                j4 = cls172.getField((java.lang.String) objArr532[0]).getLong(null);
                                                                if (j4 != -1) {
                                                                }
                                                                int i1432 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                java.lang.Object[] objArr962 = new java.lang.Object[1];
                                                                b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", (i1432 & 25) + (i1432 | 25), objArr962);
                                                                java.lang.Class<?> cls372 = java.lang.Class.forName((java.lang.String) objArr962[0]);
                                                                int i1442 = -android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                int i1452 = i1442 * (-51);
                                                                int i1462 = ((i1452 | 901) << 1) - (i1452 ^ 901);
                                                                int i1472 = ~((int) java.lang.System.currentTimeMillis());
                                                                int i1482 = (i1472 ^ i1442) | (i1472 & i1442);
                                                                int i1492 = -(-((~((i1482 & 17) | (i1482 ^ 17))) * 52));
                                                                int i1502 = ((i1462 | i1492) << 1) - (i1462 ^ i1492);
                                                                int i1512 = ~((i1472 & (-18)) | (i1472 ^ (-18)));
                                                                int i1522 = ~((i1442 & (-18)) | (i1442 ^ (-18)));
                                                                int i1532 = (i1512 ^ i1522) | (i1512 & i1522);
                                                                int i1542 = ~i1482;
                                                                int i1552 = ((i1542 ^ i1532) | (i1542 & i1532)) * (-52);
                                                                int i1562 = ~i1442;
                                                                int i1572 = ~(i1472 | i1562);
                                                                int i1582 = ~((i1562 ^ 17) | (i1562 & 17));
                                                                java.lang.Object[] objArr972 = new java.lang.Object[1];
                                                                b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", (((i1502 ^ i1552) + ((i1552 & i1502) << 1)) - (~(((i1582 ^ i1572) | (i1582 & i1572)) * 52))) - 1, objArr972);
                                                                context2 = (android.content.Context) cls372.getMethod((java.lang.String) objArr972[0], new java.lang.Class[0]).invoke(null, null);
                                                                if (context2 != null) {
                                                                }
                                                                byte[] bArr72 = $$d;
                                                                java.lang.Object[] objArr982 = new java.lang.Object[1];
                                                                d(bArr72[10], bArr72[324], 450, objArr982);
                                                                java.lang.Class<?> cls382 = java.lang.Class.forName((java.lang.String) objArr982[0]);
                                                                java.lang.Object[] objArr992 = new java.lang.Object[1];
                                                                d(bArr72[47], bArr72[180], 141, objArr992);
                                                                java.lang.String str122 = (java.lang.String) objArr992[0];
                                                                str5 = str3;
                                                                java.lang.Object[] objArr1002 = new java.lang.Object[1];
                                                                e(null, null, 128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr1002);
                                                                java.lang.Object[] objArr1012 = (java.lang.Object[]) cls382.getMethod(str122, java.lang.Class.forName((java.lang.String) objArr1002[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context2, 0, 1890149111);
                                                                if (context2 != null) {
                                                                }
                                                                objArr7 = objArr1012;
                                                                i7 = ((int[]) objArr7[1])[0];
                                                                if (((int[]) objArr7[0])[0] != i7) {
                                                                }
                                                                java.lang.Class cls2122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 922, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                                java.lang.Object[] objArr6322 = new java.lang.Object[1];
                                                                c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr6322);
                                                                j5 = cls2122.getField((java.lang.String) objArr6322[0]).getLong(null);
                                                                if (j5 != -1) {
                                                                }
                                                                java.lang.Object[] objArr9322 = {351743492};
                                                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                                if (obj2 == null) {
                                                                }
                                                                java.lang.Object[] values$466995e322 = com.payair.hce.getCardMetadata.AnonymousClass5.values$466995e3(((java.lang.reflect.Constructor) obj2).newInstance(objArr9322));
                                                                java.lang.Class cls3522 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.MeasureSpec.getSize(0), 922 - android.text.TextUtils.indexOf(str4, str4), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                                java.lang.Object[] objArr9422 = new java.lang.Object[1];
                                                                c(b2, bArr[109], bArr[97], objArr9422);
                                                                cls3522.getField((java.lang.String) objArr9422[0]).set(null, values$466995e322);
                                                                long longValue322 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                java.lang.Class cls3622 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777172) - android.graphics.Color.rgb(0, 0, 0), 921 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                                c6 = 1;
                                                                java.lang.Object[] objArr9522 = new java.lang.Object[1];
                                                                c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr9522);
                                                                c7 = 0;
                                                                cls3622.getField((java.lang.String) objArr9522[0]).set(null, java.lang.Long.valueOf(longValue322));
                                                                objArr8 = values$466995e322;
                                                                i8 = ((int[]) objArr8[c6])[c7];
                                                                if (((int[]) objArr8[c7])[c7] == i8) {
                                                                }
                                                                java.lang.Class cls24222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.red(0), (-16775635) - android.graphics.Color.rgb(0, 0, 0), (char) android.graphics.Color.alpha(0));
                                                                byte b21222 = bArr[2];
                                                                java.lang.Object[] objArr72222 = new java.lang.Object[1];
                                                                c(b2, b21222, (byte) (b21222 | 76), objArr72222);
                                                                j6 = cls24222.getField((java.lang.String) objArr72222[0]).getLong(null);
                                                                if (j6 != -1) {
                                                                }
                                                                int i98222 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                                int currentTimeMillis11222 = (int) java.lang.System.currentTimeMillis();
                                                                int i99222 = i98222 * (-947);
                                                                int i100222 = ~i98222;
                                                                int i101222 = ~(currentTimeMillis11222 | (-27));
                                                                int i102222 = -(-(((i101222 ^ i100222) | (i100222 & i101222)) * (-948)));
                                                                int i103222 = i100222 | (-27);
                                                                int i104222 = ~currentTimeMillis11222;
                                                                int i105222 = (((((i99222 | 24674) << 1) - (i99222 ^ 24674)) - (~i102222)) - 1) + ((~((i104222 ^ i103222) | (i104222 & i103222))) * (-948));
                                                                int i106222 = -(-(((i98222 ^ (-27)) | (i98222 & (-27))) * 948));
                                                                java.lang.Object[] objArr73222 = new java.lang.Object[1];
                                                                b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", ((i105222 | i106222) << 1) - (i106222 ^ i105222), objArr73222);
                                                                java.lang.Class<?> cls25222 = java.lang.Class.forName((java.lang.String) objArr73222[0]);
                                                                int i107222 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                int currentTimeMillis12222 = (int) java.lang.System.currentTimeMillis();
                                                                int i108222 = i107222 * (-496);
                                                                int i109222 = ~i107222;
                                                                int i110222 = ((i108222 | (-8432)) << 1) - (i108222 ^ (-8432));
                                                                int i111222 = i109222 | (-18);
                                                                int i112222 = (i110222 - (~(-(-((~i111222) * 497))))) - 1;
                                                                int i113222 = ~currentTimeMillis12222;
                                                                int i114222 = (i113222 ^ (-18)) | (i113222 & (-18));
                                                                int i115222 = -(-(((~((i111222 & currentTimeMillis12222) | (i111222 ^ currentTimeMillis12222))) | (~((i114222 ^ i107222) | (i114222 & i107222)))) * 497));
                                                                int i116222 = ~(i113222 | i109222);
                                                                int i117222 = ~((i109222 ^ 17) | (i109222 & 17));
                                                                int i118222 = (i117222 ^ i116222) | (i117222 & i116222);
                                                                int i119222 = (i107222 ^ (-18)) | (i107222 & (-18));
                                                                int i120222 = ~((i119222 ^ currentTimeMillis12222) | (i119222 & currentTimeMillis12222));
                                                                int i121222 = -(-(((i120222 ^ i118222) | (i120222 & i118222)) * 497));
                                                                java.lang.Object[] objArr74222 = new java.lang.Object[1];
                                                                b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", (((i112222 ^ i115222) + ((i115222 & i112222) << 1)) - (~i121222)) - 1, objArr74222);
                                                                context3 = (android.content.Context) cls25222.getMethod((java.lang.String) objArr74222[0], new java.lang.Class[0]).invoke(null, null);
                                                                if (context3 != null) {
                                                                }
                                                                byte[] bArr6222 = $$d;
                                                                java.lang.Object[] objArr75222 = new java.lang.Object[1];
                                                                d(bArr6222[10], (byte) ($$e - 3), 526, objArr75222);
                                                                java.lang.Class<?> cls26222 = java.lang.Class.forName((java.lang.String) objArr75222[0]);
                                                                byte b22222 = bArr6222[15];
                                                                byte b23222 = b22222;
                                                                java.lang.Object[] objArr76222 = new java.lang.Object[1];
                                                                d(b22222, b23222, (short) (b23222 | 314), objArr76222);
                                                                java.lang.String str10222 = (java.lang.String) objArr76222[0];
                                                                java.lang.Object[] objArr77222 = new java.lang.Object[1];
                                                                java.lang.String str11222 = str6;
                                                                e(null, null, 126 - (~android.text.TextUtils.getCapsMode(str4, 0, 0)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr77222);
                                                                java.lang.Object[] objArr78222 = (java.lang.Object[]) cls26222.getMethod(str10222, java.lang.Class.forName((java.lang.String) objArr77222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context3, 0, 0, -1773143076);
                                                                if (context3 != null) {
                                                                }
                                                                objArr9 = objArr78222;
                                                                if (((int[]) objArr9[0])[0] != ((int[]) objArr9[1])[0]) {
                                                                }
                                                                java.lang.Class cls29222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 754 - android.view.KeyEvent.keyCodeFromString(str4), (char) ((android.os.Process.myTid() >> 22) + 45560));
                                                                java.lang.Object[] objArr81222 = new java.lang.Object[1];
                                                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr81222);
                                                                j7 = cls29222.getField((java.lang.String) objArr81222[0]).getLong(null);
                                                                if (j7 != -1) {
                                                                }
                                                                str7 = str11222;
                                                                java.lang.Object[] objArr89222 = {0, 1543262169};
                                                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                                                if (obj3 == null) {
                                                                }
                                                                java.lang.Object invoke4222 = ((java.lang.reflect.Method) obj3).invoke(null, objArr89222);
                                                                java.lang.Class cls33222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 754, (char) (45560 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                                                                java.lang.Object[] objArr91222 = new java.lang.Object[1];
                                                                c((byte) (i4 & 126), (byte) (bArr[48] - 1), 105, objArr91222);
                                                                cls33222.getField((java.lang.String) objArr91222[0]).set(null, invoke4222);
                                                                long longValue2222 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                java.lang.Class cls34222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 754 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45561));
                                                                java.lang.Object[] objArr92222 = new java.lang.Object[1];
                                                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr92222);
                                                                cls34222.getField((java.lang.String) objArr92222[0]).set(null, java.lang.Long.valueOf(longValue2222));
                                                                obj4 = invoke4222;
                                                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                                                if (obj5 == null) {
                                                                }
                                                                intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(obj4, null)).intValue();
                                                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                                                if (obj6 == null) {
                                                                }
                                                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(obj4, null)).intValue() != intValue) {
                                                                }
                                                                obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                                                                if (obj7 == null) {
                                                                }
                                                                ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).IccPrivateKeyCrtComponentsJson();
                                                                return null;
                                                            }
                                                        } else {
                                                            b = b9;
                                                            num = 1;
                                                        }
                                                        int i160 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                        java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                        b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", (i160 ^ 27) + ((i160 & 27) << 1), objArr109);
                                                        java.lang.Class<?> cls44 = java.lang.Class.forName((java.lang.String) objArr109[0]);
                                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                        b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", 18 - android.text.TextUtils.getOffsetBefore("", 0), objArr110);
                                                        context4 = (android.content.Context) cls44.getMethod((java.lang.String) objArr110[0], new java.lang.Class[0]).invoke(null, null);
                                                        if (context4 != null) {
                                                            getMaximumPinTry = (build + 5) % 128;
                                                            context4 = context4.getApplicationContext();
                                                        }
                                                        byte[] bArr9 = $$d;
                                                        str2 = "";
                                                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                        d(bArr9[10], bArr9[439], (short) ($$e | 320), objArr111);
                                                        java.lang.Class<?> cls45 = java.lang.Class.forName((java.lang.String) objArr111[0]);
                                                        byte b29 = bArr9[17];
                                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                        d(b29, bArr9[108], (short) (b29 - 1), objArr112);
                                                        java.lang.String str13 = (java.lang.String) objArr112[0];
                                                        int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                        byte b30 = b;
                                                        int currentTimeMillis15 = (int) java.lang.System.currentTimeMillis();
                                                        int i161 = scrollDefaultDelay * 592;
                                                        int i162 = ((i161 | (-74930)) << 1) - (i161 ^ (-74930));
                                                        int i163 = ~scrollDefaultDelay;
                                                        int i164 = (~((i163 ^ 127) | (i163 & 127))) * (-1182);
                                                        int i165 = ((i162 | i164) << 1) - (i162 ^ i164);
                                                        int i166 = i163 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                                        str = "valueOf";
                                                        int i167 = ~currentTimeMillis15;
                                                        int i168 = ~((i166 ^ i167) | (i167 & i166));
                                                        int i169 = ~((scrollDefaultDelay ^ 127) | (scrollDefaultDelay & 127));
                                                        int i170 = -(-(((i169 ^ i168) | (i168 & i169)) * (-591)));
                                                        int i171 = ((i165 | i170) << 1) - (i165 ^ i170);
                                                        int i172 = (currentTimeMillis15 ^ i163) | (currentTimeMillis15 & i163);
                                                        int i173 = ((i172 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i172 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 591;
                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                        e(null, null, (i171 & i173) + (i173 | i171), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr113);
                                                        java.lang.Object[] objArr114 = (java.lang.Object[]) cls45.getMethod(str13, java.lang.Class.forName((java.lang.String) objArr113[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context4, 0, -2132116575);
                                                        if (context4 != null) {
                                                            int i174 = getMaximumPinTry + 91;
                                                            build = i174 % 128;
                                                            try {
                                                                if (i174 % 2 != 0) {
                                                                    java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.View.MeasureSpec.getMode(0), 584 - android.graphics.Color.red(0), (char) (24291 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                    c((byte) (i33 & 126), (byte) (bArr[48] - 1), 105, objArr115);
                                                                    cls46.getField((java.lang.String) objArr115[0]).set(null, objArr114);
                                                                    valueOf2 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[1]).invoke(null, new java.lang.Object[0])).longValue());
                                                                    cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 584 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 24290));
                                                                    byte b31 = bArr[2];
                                                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                    b2 = b30;
                                                                    c(b2, b31, (byte) (b31 | 76), objArr116);
                                                                    obj8 = objArr116[0];
                                                                } else {
                                                                    b2 = b30;
                                                                    java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 585 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((android.os.Process.myPid() >> 22) + 24291));
                                                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                    c((byte) (i33 & 126), (byte) (bArr[48] - 1), 105, objArr117);
                                                                    cls47.getField((java.lang.String) objArr117[0]).set(null, objArr114);
                                                                    valueOf2 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                                                                    cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.View.MeasureSpec.getSize(0), 584 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 24291));
                                                                    byte b32 = bArr[2];
                                                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                    c(b2, b32, (byte) (b32 | 76), objArr118);
                                                                    obj8 = objArr118[0];
                                                                }
                                                                cls.getField((java.lang.String) obj8).set(null, valueOf2);
                                                            } catch (java.lang.Exception unused3) {
                                                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                            }
                                                        } else {
                                                            b2 = b30;
                                                        }
                                                        objArr5 = objArr114;
                                                        i3 = ((int[]) objArr5[1])[0];
                                                        if (((int[]) objArr5[0])[0] != i3) {
                                                        }
                                                        java.lang.Class cls122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 584 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (24290 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                        java.lang.Object[] objArr422 = new java.lang.Object[1];
                                                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr422);
                                                        j3 = cls122.getField((java.lang.String) objArr422[0]).getLong(null);
                                                        if (j3 != -1) {
                                                        }
                                                        byte[] bArr82 = $$d;
                                                        java.lang.Object[] objArr1042 = new java.lang.Object[1];
                                                        d(bArr82[10], bArr82[139], (short) ($$e | 352), objArr1042);
                                                        java.lang.Class<?> cls412 = java.lang.Class.forName((java.lang.String) objArr1042[0]);
                                                        byte b252 = bArr82[15];
                                                        byte b262 = bArr82[47];
                                                        java.lang.Object[] objArr1052 = new java.lang.Object[1];
                                                        d(b252, b262, (short) (b262 | 270), objArr1052);
                                                        java.lang.Object[] objArr1062 = (java.lang.Object[]) cls412.getMethod((java.lang.String) objArr1052[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, 0, -1571335336);
                                                        java.lang.Class cls422 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.myPid() >> 22), android.graphics.Color.alpha(0) + 584, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 24291));
                                                        byte b272 = (byte) (-bArr[108]);
                                                        byte b282 = bArr[97];
                                                        java.lang.Object[] objArr1072 = new java.lang.Object[1];
                                                        c(b272, b282, (byte) (b282 | 60), objArr1072);
                                                        cls422.getField((java.lang.String) objArr1072[0]).set(null, objArr1062);
                                                        long longValue52 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                        java.lang.Class cls432 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 51, 584 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((android.os.Process.myPid() >> 22) + 24291));
                                                        c5 = 1;
                                                        i4 = i33;
                                                        java.lang.Object[] objArr1082 = new java.lang.Object[1];
                                                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr1082);
                                                        i5 = 0;
                                                        cls432.getField((java.lang.String) objArr1082[0]).set(null, java.lang.Long.valueOf(longValue52));
                                                        objArr6 = objArr1062;
                                                        i6 = ((int[]) objArr6[c5])[i5];
                                                        if (((int[]) objArr6[i5])[i5] == i6) {
                                                        }
                                                        java.lang.Class cls1722 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 50, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 584, (char) (24291 - android.text.TextUtils.getOffsetBefore(str4, 0)));
                                                        java.lang.Object[] objArr5322 = new java.lang.Object[1];
                                                        c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr5322);
                                                        j4 = cls1722.getField((java.lang.String) objArr5322[0]).getLong(null);
                                                        if (j4 != -1) {
                                                        }
                                                        int i14322 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                        java.lang.Object[] objArr9622 = new java.lang.Object[1];
                                                        b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", (i14322 & 25) + (i14322 | 25), objArr9622);
                                                        java.lang.Class<?> cls3722 = java.lang.Class.forName((java.lang.String) objArr9622[0]);
                                                        int i14422 = -android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                        int i14522 = i14422 * (-51);
                                                        int i14622 = ((i14522 | 901) << 1) - (i14522 ^ 901);
                                                        int i14722 = ~((int) java.lang.System.currentTimeMillis());
                                                        int i14822 = (i14722 ^ i14422) | (i14722 & i14422);
                                                        int i14922 = -(-((~((i14822 & 17) | (i14822 ^ 17))) * 52));
                                                        int i15022 = ((i14622 | i14922) << 1) - (i14622 ^ i14922);
                                                        int i15122 = ~((i14722 & (-18)) | (i14722 ^ (-18)));
                                                        int i15222 = ~((i14422 & (-18)) | (i14422 ^ (-18)));
                                                        int i15322 = (i15122 ^ i15222) | (i15122 & i15222);
                                                        int i15422 = ~i14822;
                                                        int i15522 = ((i15422 ^ i15322) | (i15422 & i15322)) * (-52);
                                                        int i15622 = ~i14422;
                                                        int i15722 = ~(i14722 | i15622);
                                                        int i15822 = ~((i15622 ^ 17) | (i15622 & 17));
                                                        java.lang.Object[] objArr9722 = new java.lang.Object[1];
                                                        b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", (((i15022 ^ i15522) + ((i15522 & i15022) << 1)) - (~(((i15822 ^ i15722) | (i15822 & i15722)) * 52))) - 1, objArr9722);
                                                        context2 = (android.content.Context) cls3722.getMethod((java.lang.String) objArr9722[0], new java.lang.Class[0]).invoke(null, null);
                                                        if (context2 != null) {
                                                        }
                                                        byte[] bArr722 = $$d;
                                                        java.lang.Object[] objArr9822 = new java.lang.Object[1];
                                                        d(bArr722[10], bArr722[324], 450, objArr9822);
                                                        java.lang.Class<?> cls3822 = java.lang.Class.forName((java.lang.String) objArr9822[0]);
                                                        java.lang.Object[] objArr9922 = new java.lang.Object[1];
                                                        d(bArr722[47], bArr722[180], 141, objArr9922);
                                                        java.lang.String str1222 = (java.lang.String) objArr9922[0];
                                                        str5 = str3;
                                                        java.lang.Object[] objArr10022 = new java.lang.Object[1];
                                                        e(null, null, 128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr10022);
                                                        java.lang.Object[] objArr10122 = (java.lang.Object[]) cls3822.getMethod(str1222, java.lang.Class.forName((java.lang.String) objArr10022[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context2, 0, 1890149111);
                                                        if (context2 != null) {
                                                        }
                                                        objArr7 = objArr10122;
                                                        i7 = ((int[]) objArr7[1])[0];
                                                        if (((int[]) objArr7[0])[0] != i7) {
                                                        }
                                                        java.lang.Class cls21222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 922, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                        java.lang.Object[] objArr63222 = new java.lang.Object[1];
                                                        c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr63222);
                                                        j5 = cls21222.getField((java.lang.String) objArr63222[0]).getLong(null);
                                                        if (j5 != -1) {
                                                        }
                                                        java.lang.Object[] objArr93222 = {351743492};
                                                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                        if (obj2 == null) {
                                                        }
                                                        java.lang.Object[] values$466995e3222 = com.payair.hce.getCardMetadata.AnonymousClass5.values$466995e3(((java.lang.reflect.Constructor) obj2).newInstance(objArr93222));
                                                        java.lang.Class cls35222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.MeasureSpec.getSize(0), 922 - android.text.TextUtils.indexOf(str4, str4), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                        java.lang.Object[] objArr94222 = new java.lang.Object[1];
                                                        c(b2, bArr[109], bArr[97], objArr94222);
                                                        cls35222.getField((java.lang.String) objArr94222[0]).set(null, values$466995e3222);
                                                        long longValue3222 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                        java.lang.Class cls36222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777172) - android.graphics.Color.rgb(0, 0, 0), 921 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                        c6 = 1;
                                                        java.lang.Object[] objArr95222 = new java.lang.Object[1];
                                                        c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr95222);
                                                        c7 = 0;
                                                        cls36222.getField((java.lang.String) objArr95222[0]).set(null, java.lang.Long.valueOf(longValue3222));
                                                        objArr8 = values$466995e3222;
                                                        i8 = ((int[]) objArr8[c6])[c7];
                                                        if (((int[]) objArr8[c7])[c7] == i8) {
                                                        }
                                                        java.lang.Class cls242222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.red(0), (-16775635) - android.graphics.Color.rgb(0, 0, 0), (char) android.graphics.Color.alpha(0));
                                                        byte b212222 = bArr[2];
                                                        java.lang.Object[] objArr722222 = new java.lang.Object[1];
                                                        c(b2, b212222, (byte) (b212222 | 76), objArr722222);
                                                        j6 = cls242222.getField((java.lang.String) objArr722222[0]).getLong(null);
                                                        if (j6 != -1) {
                                                        }
                                                        int i982222 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                        int currentTimeMillis112222 = (int) java.lang.System.currentTimeMillis();
                                                        int i992222 = i982222 * (-947);
                                                        int i1002222 = ~i982222;
                                                        int i1012222 = ~(currentTimeMillis112222 | (-27));
                                                        int i1022222 = -(-(((i1012222 ^ i1002222) | (i1002222 & i1012222)) * (-948)));
                                                        int i1032222 = i1002222 | (-27);
                                                        int i1042222 = ~currentTimeMillis112222;
                                                        int i1052222 = (((((i992222 | 24674) << 1) - (i992222 ^ 24674)) - (~i1022222)) - 1) + ((~((i1042222 ^ i1032222) | (i1042222 & i1032222))) * (-948));
                                                        int i1062222 = -(-(((i982222 ^ (-27)) | (i982222 & (-27))) * 948));
                                                        java.lang.Object[] objArr732222 = new java.lang.Object[1];
                                                        b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", ((i1052222 | i1062222) << 1) - (i1062222 ^ i1052222), objArr732222);
                                                        java.lang.Class<?> cls252222 = java.lang.Class.forName((java.lang.String) objArr732222[0]);
                                                        int i1072222 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                        int currentTimeMillis122222 = (int) java.lang.System.currentTimeMillis();
                                                        int i1082222 = i1072222 * (-496);
                                                        int i1092222 = ~i1072222;
                                                        int i1102222 = ((i1082222 | (-8432)) << 1) - (i1082222 ^ (-8432));
                                                        int i1112222 = i1092222 | (-18);
                                                        int i1122222 = (i1102222 - (~(-(-((~i1112222) * 497))))) - 1;
                                                        int i1132222 = ~currentTimeMillis122222;
                                                        int i1142222 = (i1132222 ^ (-18)) | (i1132222 & (-18));
                                                        int i1152222 = -(-(((~((i1112222 & currentTimeMillis122222) | (i1112222 ^ currentTimeMillis122222))) | (~((i1142222 ^ i1072222) | (i1142222 & i1072222)))) * 497));
                                                        int i1162222 = ~(i1132222 | i1092222);
                                                        int i1172222 = ~((i1092222 ^ 17) | (i1092222 & 17));
                                                        int i1182222 = (i1172222 ^ i1162222) | (i1172222 & i1162222);
                                                        int i1192222 = (i1072222 ^ (-18)) | (i1072222 & (-18));
                                                        int i1202222 = ~((i1192222 ^ currentTimeMillis122222) | (i1192222 & currentTimeMillis122222));
                                                        int i1212222 = -(-(((i1202222 ^ i1182222) | (i1202222 & i1182222)) * 497));
                                                        java.lang.Object[] objArr742222 = new java.lang.Object[1];
                                                        b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", (((i1122222 ^ i1152222) + ((i1152222 & i1122222) << 1)) - (~i1212222)) - 1, objArr742222);
                                                        context3 = (android.content.Context) cls252222.getMethod((java.lang.String) objArr742222[0], new java.lang.Class[0]).invoke(null, null);
                                                        if (context3 != null) {
                                                        }
                                                        byte[] bArr62222 = $$d;
                                                        java.lang.Object[] objArr752222 = new java.lang.Object[1];
                                                        d(bArr62222[10], (byte) ($$e - 3), 526, objArr752222);
                                                        java.lang.Class<?> cls262222 = java.lang.Class.forName((java.lang.String) objArr752222[0]);
                                                        byte b222222 = bArr62222[15];
                                                        byte b232222 = b222222;
                                                        java.lang.Object[] objArr762222 = new java.lang.Object[1];
                                                        d(b222222, b232222, (short) (b232222 | 314), objArr762222);
                                                        java.lang.String str102222 = (java.lang.String) objArr762222[0];
                                                        java.lang.Object[] objArr772222 = new java.lang.Object[1];
                                                        java.lang.String str112222 = str6;
                                                        e(null, null, 126 - (~android.text.TextUtils.getCapsMode(str4, 0, 0)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr772222);
                                                        java.lang.Object[] objArr782222 = (java.lang.Object[]) cls262222.getMethod(str102222, java.lang.Class.forName((java.lang.String) objArr772222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context3, 0, 0, -1773143076);
                                                        if (context3 != null) {
                                                        }
                                                        objArr9 = objArr782222;
                                                        if (((int[]) objArr9[0])[0] != ((int[]) objArr9[1])[0]) {
                                                        }
                                                        java.lang.Class cls292222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 754 - android.view.KeyEvent.keyCodeFromString(str4), (char) ((android.os.Process.myTid() >> 22) + 45560));
                                                        java.lang.Object[] objArr812222 = new java.lang.Object[1];
                                                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr812222);
                                                        j7 = cls292222.getField((java.lang.String) objArr812222[0]).getLong(null);
                                                        if (j7 != -1) {
                                                        }
                                                        str7 = str112222;
                                                        java.lang.Object[] objArr892222 = {0, 1543262169};
                                                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                                        if (obj3 == null) {
                                                        }
                                                        java.lang.Object invoke42222 = ((java.lang.reflect.Method) obj3).invoke(null, objArr892222);
                                                        java.lang.Class cls332222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 754, (char) (45560 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                                                        java.lang.Object[] objArr912222 = new java.lang.Object[1];
                                                        c((byte) (i4 & 126), (byte) (bArr[48] - 1), 105, objArr912222);
                                                        cls332222.getField((java.lang.String) objArr912222[0]).set(null, invoke42222);
                                                        long longValue22222 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                        java.lang.Class cls342222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 754 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45561));
                                                        java.lang.Object[] objArr922222 = new java.lang.Object[1];
                                                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr922222);
                                                        cls342222.getField((java.lang.String) objArr922222[0]).set(null, java.lang.Long.valueOf(longValue22222));
                                                        obj4 = invoke42222;
                                                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                                        if (obj5 == null) {
                                                        }
                                                        intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(obj4, null)).intValue();
                                                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                                        if (obj6 == null) {
                                                        }
                                                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(obj4, null)).intValue() != intValue) {
                                                        }
                                                        obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                                                        if (obj7 == null) {
                                                        }
                                                        ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).IccPrivateKeyCrtComponentsJson();
                                                        return null;
                                                    }
                                                }
                                                java.lang.Object[] objArr119 = {0, 0, 1226359029};
                                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                if (obj == null) {
                                                    java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 47, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_STAGGERED, (char) (34284 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                                                    byte b33 = bArr[2];
                                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                    c(b9, b33, (byte) (b33 | 76), objArr120);
                                                    obj = cls48.getMethod((java.lang.String) objArr120[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj);
                                                }
                                                java.lang.Object[] objArr121 = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr119);
                                                java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 707 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 34284));
                                                java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                c((byte) (i33 & 126), (byte) (bArr[48] - 1), 105, objArr122);
                                                cls49.getField((java.lang.String) objArr122[0]).set(null, objArr121);
                                                long longValue6 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.View.MeasureSpec.getSize(0), 707 - android.view.KeyEvent.keyCodeFromString(""), (char) (34284 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                                                byte b34 = bArr[2];
                                                c3 = 1;
                                                java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                c(b9, b34, (byte) (b34 | 76), objArr123);
                                                c4 = 0;
                                                cls50.getField((java.lang.String) objArr123[0]).set(null, java.lang.Long.valueOf(longValue6));
                                                objArr4 = objArr121;
                                                i2 = ((int[]) objArr4[c3])[c4];
                                                if (((int[]) objArr4[c4])[c4] == i2) {
                                                }
                                                java.lang.Class cls92 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.indexOf("", "", 0, 0), 584 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 24292));
                                                byte b112 = bArr[2];
                                                java.lang.Object[] objArr342 = new java.lang.Object[1];
                                                c(b9, b112, (byte) (b112 | 76), objArr342);
                                                j2 = cls92.getField((java.lang.String) objArr342[0]).getLong(null);
                                                if (j2 != -1) {
                                                }
                                                int i1602 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                java.lang.Object[] objArr1092 = new java.lang.Object[1];
                                                b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", (i1602 ^ 27) + ((i1602 & 27) << 1), objArr1092);
                                                java.lang.Class<?> cls442 = java.lang.Class.forName((java.lang.String) objArr1092[0]);
                                                java.lang.Object[] objArr1102 = new java.lang.Object[1];
                                                b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", 18 - android.text.TextUtils.getOffsetBefore("", 0), objArr1102);
                                                context4 = (android.content.Context) cls442.getMethod((java.lang.String) objArr1102[0], new java.lang.Class[0]).invoke(null, null);
                                                if (context4 != null) {
                                                }
                                                byte[] bArr92 = $$d;
                                                str2 = "";
                                                java.lang.Object[] objArr1112 = new java.lang.Object[1];
                                                d(bArr92[10], bArr92[439], (short) ($$e | 320), objArr1112);
                                                java.lang.Class<?> cls452 = java.lang.Class.forName((java.lang.String) objArr1112[0]);
                                                byte b292 = bArr92[17];
                                                java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                                d(b292, bArr92[108], (short) (b292 - 1), objArr1122);
                                                java.lang.String str132 = (java.lang.String) objArr1122[0];
                                                int scrollDefaultDelay2 = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                byte b302 = b;
                                                int currentTimeMillis152 = (int) java.lang.System.currentTimeMillis();
                                                int i1612 = scrollDefaultDelay2 * 592;
                                                int i1622 = ((i1612 | (-74930)) << 1) - (i1612 ^ (-74930));
                                                int i1632 = ~scrollDefaultDelay2;
                                                int i1642 = (~((i1632 ^ 127) | (i1632 & 127))) * (-1182);
                                                int i1652 = ((i1622 | i1642) << 1) - (i1622 ^ i1642);
                                                int i1662 = i1632 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                                str = "valueOf";
                                                int i1672 = ~currentTimeMillis152;
                                                int i1682 = ~((i1662 ^ i1672) | (i1672 & i1662));
                                                int i1692 = ~((scrollDefaultDelay2 ^ 127) | (scrollDefaultDelay2 & 127));
                                                int i1702 = -(-(((i1692 ^ i1682) | (i1682 & i1692)) * (-591)));
                                                int i1712 = ((i1652 | i1702) << 1) - (i1652 ^ i1702);
                                                int i1722 = (currentTimeMillis152 ^ i1632) | (currentTimeMillis152 & i1632);
                                                int i1732 = ((i1722 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i1722 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 591;
                                                java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                                e(null, null, (i1712 & i1732) + (i1732 | i1712), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr1132);
                                                java.lang.Object[] objArr1142 = (java.lang.Object[]) cls452.getMethod(str132, java.lang.Class.forName((java.lang.String) objArr1132[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context4, 0, -2132116575);
                                                if (context4 != null) {
                                                }
                                                objArr5 = objArr1142;
                                                i3 = ((int[]) objArr5[1])[0];
                                                if (((int[]) objArr5[0])[0] != i3) {
                                                }
                                                java.lang.Class cls1222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 584 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (24290 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                java.lang.Object[] objArr4222 = new java.lang.Object[1];
                                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr4222);
                                                j3 = cls1222.getField((java.lang.String) objArr4222[0]).getLong(null);
                                                if (j3 != -1) {
                                                }
                                                byte[] bArr822 = $$d;
                                                java.lang.Object[] objArr10422 = new java.lang.Object[1];
                                                d(bArr822[10], bArr822[139], (short) ($$e | 352), objArr10422);
                                                java.lang.Class<?> cls4122 = java.lang.Class.forName((java.lang.String) objArr10422[0]);
                                                byte b2522 = bArr822[15];
                                                byte b2622 = bArr822[47];
                                                java.lang.Object[] objArr10522 = new java.lang.Object[1];
                                                d(b2522, b2622, (short) (b2622 | 270), objArr10522);
                                                java.lang.Object[] objArr10622 = (java.lang.Object[]) cls4122.getMethod((java.lang.String) objArr10522[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, 0, -1571335336);
                                                java.lang.Class cls4222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.myPid() >> 22), android.graphics.Color.alpha(0) + 584, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 24291));
                                                byte b2722 = (byte) (-bArr[108]);
                                                byte b2822 = bArr[97];
                                                java.lang.Object[] objArr10722 = new java.lang.Object[1];
                                                c(b2722, b2822, (byte) (b2822 | 60), objArr10722);
                                                cls4222.getField((java.lang.String) objArr10722[0]).set(null, objArr10622);
                                                long longValue522 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                java.lang.Class cls4322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 51, 584 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((android.os.Process.myPid() >> 22) + 24291));
                                                c5 = 1;
                                                i4 = i33;
                                                java.lang.Object[] objArr10822 = new java.lang.Object[1];
                                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr10822);
                                                i5 = 0;
                                                cls4322.getField((java.lang.String) objArr10822[0]).set(null, java.lang.Long.valueOf(longValue522));
                                                objArr6 = objArr10622;
                                                i6 = ((int[]) objArr6[c5])[i5];
                                                if (((int[]) objArr6[i5])[i5] == i6) {
                                                }
                                                java.lang.Class cls17222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 50, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 584, (char) (24291 - android.text.TextUtils.getOffsetBefore(str4, 0)));
                                                java.lang.Object[] objArr53222 = new java.lang.Object[1];
                                                c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr53222);
                                                j4 = cls17222.getField((java.lang.String) objArr53222[0]).getLong(null);
                                                if (j4 != -1) {
                                                }
                                                int i143222 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                java.lang.Object[] objArr96222 = new java.lang.Object[1];
                                                b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", (i143222 & 25) + (i143222 | 25), objArr96222);
                                                java.lang.Class<?> cls37222 = java.lang.Class.forName((java.lang.String) objArr96222[0]);
                                                int i144222 = -android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                int i145222 = i144222 * (-51);
                                                int i146222 = ((i145222 | 901) << 1) - (i145222 ^ 901);
                                                int i147222 = ~((int) java.lang.System.currentTimeMillis());
                                                int i148222 = (i147222 ^ i144222) | (i147222 & i144222);
                                                int i149222 = -(-((~((i148222 & 17) | (i148222 ^ 17))) * 52));
                                                int i150222 = ((i146222 | i149222) << 1) - (i146222 ^ i149222);
                                                int i151222 = ~((i147222 & (-18)) | (i147222 ^ (-18)));
                                                int i152222 = ~((i144222 & (-18)) | (i144222 ^ (-18)));
                                                int i153222 = (i151222 ^ i152222) | (i151222 & i152222);
                                                int i154222 = ~i148222;
                                                int i155222 = ((i154222 ^ i153222) | (i154222 & i153222)) * (-52);
                                                int i156222 = ~i144222;
                                                int i157222 = ~(i147222 | i156222);
                                                int i158222 = ~((i156222 ^ 17) | (i156222 & 17));
                                                java.lang.Object[] objArr97222 = new java.lang.Object[1];
                                                b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", (((i150222 ^ i155222) + ((i155222 & i150222) << 1)) - (~(((i158222 ^ i157222) | (i158222 & i157222)) * 52))) - 1, objArr97222);
                                                context2 = (android.content.Context) cls37222.getMethod((java.lang.String) objArr97222[0], new java.lang.Class[0]).invoke(null, null);
                                                if (context2 != null) {
                                                }
                                                byte[] bArr7222 = $$d;
                                                java.lang.Object[] objArr98222 = new java.lang.Object[1];
                                                d(bArr7222[10], bArr7222[324], 450, objArr98222);
                                                java.lang.Class<?> cls38222 = java.lang.Class.forName((java.lang.String) objArr98222[0]);
                                                java.lang.Object[] objArr99222 = new java.lang.Object[1];
                                                d(bArr7222[47], bArr7222[180], 141, objArr99222);
                                                java.lang.String str12222 = (java.lang.String) objArr99222[0];
                                                str5 = str3;
                                                java.lang.Object[] objArr100222 = new java.lang.Object[1];
                                                e(null, null, 128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr100222);
                                                java.lang.Object[] objArr101222 = (java.lang.Object[]) cls38222.getMethod(str12222, java.lang.Class.forName((java.lang.String) objArr100222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context2, 0, 1890149111);
                                                if (context2 != null) {
                                                }
                                                objArr7 = objArr101222;
                                                i7 = ((int[]) objArr7[1])[0];
                                                if (((int[]) objArr7[0])[0] != i7) {
                                                }
                                                java.lang.Class cls212222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 922, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                java.lang.Object[] objArr632222 = new java.lang.Object[1];
                                                c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr632222);
                                                j5 = cls212222.getField((java.lang.String) objArr632222[0]).getLong(null);
                                                if (j5 != -1) {
                                                }
                                                java.lang.Object[] objArr932222 = {351743492};
                                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                if (obj2 == null) {
                                                }
                                                java.lang.Object[] values$466995e32222 = com.payair.hce.getCardMetadata.AnonymousClass5.values$466995e3(((java.lang.reflect.Constructor) obj2).newInstance(objArr932222));
                                                java.lang.Class cls352222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.MeasureSpec.getSize(0), 922 - android.text.TextUtils.indexOf(str4, str4), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                java.lang.Object[] objArr942222 = new java.lang.Object[1];
                                                c(b2, bArr[109], bArr[97], objArr942222);
                                                cls352222.getField((java.lang.String) objArr942222[0]).set(null, values$466995e32222);
                                                long longValue32222 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                java.lang.Class cls362222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777172) - android.graphics.Color.rgb(0, 0, 0), 921 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                c6 = 1;
                                                java.lang.Object[] objArr952222 = new java.lang.Object[1];
                                                c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr952222);
                                                c7 = 0;
                                                cls362222.getField((java.lang.String) objArr952222[0]).set(null, java.lang.Long.valueOf(longValue32222));
                                                objArr8 = values$466995e32222;
                                                i8 = ((int[]) objArr8[c6])[c7];
                                                if (((int[]) objArr8[c7])[c7] == i8) {
                                                }
                                                java.lang.Class cls2422222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.red(0), (-16775635) - android.graphics.Color.rgb(0, 0, 0), (char) android.graphics.Color.alpha(0));
                                                byte b2122222 = bArr[2];
                                                java.lang.Object[] objArr7222222 = new java.lang.Object[1];
                                                c(b2, b2122222, (byte) (b2122222 | 76), objArr7222222);
                                                j6 = cls2422222.getField((java.lang.String) objArr7222222[0]).getLong(null);
                                                if (j6 != -1) {
                                                }
                                                int i9822222 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                int currentTimeMillis1122222 = (int) java.lang.System.currentTimeMillis();
                                                int i9922222 = i9822222 * (-947);
                                                int i10022222 = ~i9822222;
                                                int i10122222 = ~(currentTimeMillis1122222 | (-27));
                                                int i10222222 = -(-(((i10122222 ^ i10022222) | (i10022222 & i10122222)) * (-948)));
                                                int i10322222 = i10022222 | (-27);
                                                int i10422222 = ~currentTimeMillis1122222;
                                                int i10522222 = (((((i9922222 | 24674) << 1) - (i9922222 ^ 24674)) - (~i10222222)) - 1) + ((~((i10422222 ^ i10322222) | (i10422222 & i10322222))) * (-948));
                                                int i10622222 = -(-(((i9822222 ^ (-27)) | (i9822222 & (-27))) * 948));
                                                java.lang.Object[] objArr7322222 = new java.lang.Object[1];
                                                b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", ((i10522222 | i10622222) << 1) - (i10622222 ^ i10522222), objArr7322222);
                                                java.lang.Class<?> cls2522222 = java.lang.Class.forName((java.lang.String) objArr7322222[0]);
                                                int i10722222 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                int currentTimeMillis1222222 = (int) java.lang.System.currentTimeMillis();
                                                int i10822222 = i10722222 * (-496);
                                                int i10922222 = ~i10722222;
                                                int i11022222 = ((i10822222 | (-8432)) << 1) - (i10822222 ^ (-8432));
                                                int i11122222 = i10922222 | (-18);
                                                int i11222222 = (i11022222 - (~(-(-((~i11122222) * 497))))) - 1;
                                                int i11322222 = ~currentTimeMillis1222222;
                                                int i11422222 = (i11322222 ^ (-18)) | (i11322222 & (-18));
                                                int i11522222 = -(-(((~((i11122222 & currentTimeMillis1222222) | (i11122222 ^ currentTimeMillis1222222))) | (~((i11422222 ^ i10722222) | (i11422222 & i10722222)))) * 497));
                                                int i11622222 = ~(i11322222 | i10922222);
                                                int i11722222 = ~((i10922222 ^ 17) | (i10922222 & 17));
                                                int i11822222 = (i11722222 ^ i11622222) | (i11722222 & i11622222);
                                                int i11922222 = (i10722222 ^ (-18)) | (i10722222 & (-18));
                                                int i12022222 = ~((i11922222 ^ currentTimeMillis1222222) | (i11922222 & currentTimeMillis1222222));
                                                int i12122222 = -(-(((i12022222 ^ i11822222) | (i12022222 & i11822222)) * 497));
                                                java.lang.Object[] objArr7422222 = new java.lang.Object[1];
                                                b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", (((i11222222 ^ i11522222) + ((i11522222 & i11222222) << 1)) - (~i12122222)) - 1, objArr7422222);
                                                context3 = (android.content.Context) cls2522222.getMethod((java.lang.String) objArr7422222[0], new java.lang.Class[0]).invoke(null, null);
                                                if (context3 != null) {
                                                }
                                                byte[] bArr622222 = $$d;
                                                java.lang.Object[] objArr7522222 = new java.lang.Object[1];
                                                d(bArr622222[10], (byte) ($$e - 3), 526, objArr7522222);
                                                java.lang.Class<?> cls2622222 = java.lang.Class.forName((java.lang.String) objArr7522222[0]);
                                                byte b2222222 = bArr622222[15];
                                                byte b2322222 = b2222222;
                                                java.lang.Object[] objArr7622222 = new java.lang.Object[1];
                                                d(b2222222, b2322222, (short) (b2322222 | 314), objArr7622222);
                                                java.lang.String str1022222 = (java.lang.String) objArr7622222[0];
                                                java.lang.Object[] objArr7722222 = new java.lang.Object[1];
                                                java.lang.String str1122222 = str6;
                                                e(null, null, 126 - (~android.text.TextUtils.getCapsMode(str4, 0, 0)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr7722222);
                                                java.lang.Object[] objArr7822222 = (java.lang.Object[]) cls2622222.getMethod(str1022222, java.lang.Class.forName((java.lang.String) objArr7722222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context3, 0, 0, -1773143076);
                                                if (context3 != null) {
                                                }
                                                objArr9 = objArr7822222;
                                                if (((int[]) objArr9[0])[0] != ((int[]) objArr9[1])[0]) {
                                                }
                                                java.lang.Class cls2922222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 754 - android.view.KeyEvent.keyCodeFromString(str4), (char) ((android.os.Process.myTid() >> 22) + 45560));
                                                java.lang.Object[] objArr8122222 = new java.lang.Object[1];
                                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr8122222);
                                                j7 = cls2922222.getField((java.lang.String) objArr8122222[0]).getLong(null);
                                                if (j7 != -1) {
                                                }
                                                str7 = str1122222;
                                                java.lang.Object[] objArr8922222 = {0, 1543262169};
                                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                                if (obj3 == null) {
                                                }
                                                java.lang.Object invoke422222 = ((java.lang.reflect.Method) obj3).invoke(null, objArr8922222);
                                                java.lang.Class cls3322222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 754, (char) (45560 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                                                java.lang.Object[] objArr9122222 = new java.lang.Object[1];
                                                c((byte) (i4 & 126), (byte) (bArr[48] - 1), 105, objArr9122222);
                                                cls3322222.getField((java.lang.String) objArr9122222[0]).set(null, invoke422222);
                                                long longValue222222 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                java.lang.Class cls3422222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 754 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45561));
                                                java.lang.Object[] objArr9222222 = new java.lang.Object[1];
                                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr9222222);
                                                cls3422222.getField((java.lang.String) objArr9222222[0]).set(null, java.lang.Long.valueOf(longValue222222));
                                                obj4 = invoke422222;
                                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                                if (obj5 == null) {
                                                }
                                                intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(obj4, null)).intValue();
                                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                                if (obj6 == null) {
                                                }
                                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(obj4, null)).intValue() != intValue) {
                                                }
                                                obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                                                if (obj7 == null) {
                                                }
                                                ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).IccPrivateKeyCrtComponentsJson();
                                                return null;
                                            }
                                        }
                                        long longValue2222222 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Class cls34222222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 754 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45561));
                                        java.lang.Object[] objArr92222222 = new java.lang.Object[1];
                                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr92222222);
                                        cls34222222.getField((java.lang.String) objArr92222222[0]).set(null, java.lang.Long.valueOf(longValue2222222));
                                        obj4 = invoke422222;
                                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                        if (obj5 == null) {
                                        }
                                        intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(obj4, null)).intValue();
                                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                        if (obj6 == null) {
                                        }
                                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(obj4, null)).intValue() != intValue) {
                                        }
                                        obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                                        if (obj7 == null) {
                                        }
                                        ((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects))).IccPrivateKeyCrtComponentsJson();
                                        return null;
                                    } catch (java.lang.Exception unused4) {
                                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                    }
                                    long longValue322222 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                    java.lang.Class cls3622222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777172) - android.graphics.Color.rgb(0, 0, 0), 921 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                    c6 = 1;
                                    java.lang.Object[] objArr9522222 = new java.lang.Object[1];
                                    c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr9522222);
                                    c7 = 0;
                                    cls3622222.getField((java.lang.String) objArr9522222[0]).set(null, java.lang.Long.valueOf(longValue322222));
                                    objArr8 = values$466995e32222;
                                    i8 = ((int[]) objArr8[c6])[c7];
                                    if (((int[]) objArr8[c7])[c7] == i8) {
                                    }
                                    java.lang.Class cls24222222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.red(0), (-16775635) - android.graphics.Color.rgb(0, 0, 0), (char) android.graphics.Color.alpha(0));
                                    byte b21222222 = bArr[2];
                                    java.lang.Object[] objArr72222222 = new java.lang.Object[1];
                                    c(b2, b21222222, (byte) (b21222222 | 76), objArr72222222);
                                    j6 = cls24222222.getField((java.lang.String) objArr72222222[0]).getLong(null);
                                    if (j6 != -1) {
                                    }
                                    int i98222222 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                    int currentTimeMillis11222222 = (int) java.lang.System.currentTimeMillis();
                                    int i99222222 = i98222222 * (-947);
                                    int i100222222 = ~i98222222;
                                    int i101222222 = ~(currentTimeMillis11222222 | (-27));
                                    int i102222222 = -(-(((i101222222 ^ i100222222) | (i100222222 & i101222222)) * (-948)));
                                    int i103222222 = i100222222 | (-27);
                                    int i104222222 = ~currentTimeMillis11222222;
                                    int i105222222 = (((((i99222222 | 24674) << 1) - (i99222222 ^ 24674)) - (~i102222222)) - 1) + ((~((i104222222 ^ i103222222) | (i104222222 & i103222222))) * (-948));
                                    int i106222222 = -(-(((i98222222 ^ (-27)) | (i98222222 & (-27))) * 948));
                                    java.lang.Object[] objArr73222222 = new java.lang.Object[1];
                                    b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", ((i105222222 | i106222222) << 1) - (i106222222 ^ i105222222), objArr73222222);
                                    java.lang.Class<?> cls25222222 = java.lang.Class.forName((java.lang.String) objArr73222222[0]);
                                    int i107222222 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    int currentTimeMillis12222222 = (int) java.lang.System.currentTimeMillis();
                                    int i108222222 = i107222222 * (-496);
                                    int i109222222 = ~i107222222;
                                    int i110222222 = ((i108222222 | (-8432)) << 1) - (i108222222 ^ (-8432));
                                    int i111222222 = i109222222 | (-18);
                                    int i112222222 = (i110222222 - (~(-(-((~i111222222) * 497))))) - 1;
                                    int i113222222 = ~currentTimeMillis12222222;
                                    int i114222222 = (i113222222 ^ (-18)) | (i113222222 & (-18));
                                    int i115222222 = -(-(((~((i111222222 & currentTimeMillis12222222) | (i111222222 ^ currentTimeMillis12222222))) | (~((i114222222 ^ i107222222) | (i114222222 & i107222222)))) * 497));
                                    int i116222222 = ~(i113222222 | i109222222);
                                    int i117222222 = ~((i109222222 ^ 17) | (i109222222 & 17));
                                    int i118222222 = (i117222222 ^ i116222222) | (i117222222 & i116222222);
                                    int i119222222 = (i107222222 ^ (-18)) | (i107222222 & (-18));
                                    int i120222222 = ~((i119222222 ^ currentTimeMillis12222222) | (i119222222 & currentTimeMillis12222222));
                                    int i121222222 = -(-(((i120222222 ^ i118222222) | (i120222222 & i118222222)) * 497));
                                    java.lang.Object[] objArr74222222 = new java.lang.Object[1];
                                    b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", (((i112222222 ^ i115222222) + ((i115222222 & i112222222) << 1)) - (~i121222222)) - 1, objArr74222222);
                                    context3 = (android.content.Context) cls25222222.getMethod((java.lang.String) objArr74222222[0], new java.lang.Class[0]).invoke(null, null);
                                    if (context3 != null) {
                                    }
                                    byte[] bArr6222222 = $$d;
                                    java.lang.Object[] objArr75222222 = new java.lang.Object[1];
                                    d(bArr6222222[10], (byte) ($$e - 3), 526, objArr75222222);
                                    java.lang.Class<?> cls26222222 = java.lang.Class.forName((java.lang.String) objArr75222222[0]);
                                    byte b22222222 = bArr6222222[15];
                                    byte b23222222 = b22222222;
                                    java.lang.Object[] objArr76222222 = new java.lang.Object[1];
                                    d(b22222222, b23222222, (short) (b23222222 | 314), objArr76222222);
                                    java.lang.String str10222222 = (java.lang.String) objArr76222222[0];
                                    java.lang.Object[] objArr77222222 = new java.lang.Object[1];
                                    java.lang.String str11222222 = str6;
                                    e(null, null, 126 - (~android.text.TextUtils.getCapsMode(str4, 0, 0)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr77222222);
                                    java.lang.Object[] objArr78222222 = (java.lang.Object[]) cls26222222.getMethod(str10222222, java.lang.Class.forName((java.lang.String) objArr77222222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context3, 0, 0, -1773143076);
                                    if (context3 != null) {
                                    }
                                    objArr9 = objArr78222222;
                                    if (((int[]) objArr9[0])[0] != ((int[]) objArr9[1])[0]) {
                                    }
                                    java.lang.Class cls29222222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 754 - android.view.KeyEvent.keyCodeFromString(str4), (char) ((android.os.Process.myTid() >> 22) + 45560));
                                    java.lang.Object[] objArr81222222 = new java.lang.Object[1];
                                    c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr81222222);
                                    j7 = cls29222222.getField((java.lang.String) objArr81222222[0]).getLong(null);
                                    if (j7 != -1) {
                                    }
                                    str7 = str11222222;
                                    java.lang.Object[] objArr89222222 = {0, 1543262169};
                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                    if (obj3 == null) {
                                    }
                                    java.lang.Object invoke4222222 = ((java.lang.reflect.Method) obj3).invoke(null, objArr89222222);
                                    java.lang.Class cls33222222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 754, (char) (45560 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                                    java.lang.Object[] objArr91222222 = new java.lang.Object[1];
                                    c((byte) (i4 & 126), (byte) (bArr[48] - 1), 105, objArr91222222);
                                    cls33222222.getField((java.lang.String) objArr91222222[0]).set(null, invoke4222222);
                                } catch (java.lang.Exception unused5) {
                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                }
                                long longValue5222 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                java.lang.Class cls43222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 51, 584 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((android.os.Process.myPid() >> 22) + 24291));
                                c5 = 1;
                                i4 = i33;
                                java.lang.Object[] objArr108222 = new java.lang.Object[1];
                                c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr108222);
                                i5 = 0;
                                cls43222.getField((java.lang.String) objArr108222[0]).set(null, java.lang.Long.valueOf(longValue5222));
                                objArr6 = objArr10622;
                                i6 = ((int[]) objArr6[c5])[i5];
                                if (((int[]) objArr6[i5])[i5] == i6) {
                                }
                                java.lang.Class cls172222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 50, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 584, (char) (24291 - android.text.TextUtils.getOffsetBefore(str4, 0)));
                                java.lang.Object[] objArr532222 = new java.lang.Object[1];
                                c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr532222);
                                j4 = cls172222.getField((java.lang.String) objArr532222[0]).getLong(null);
                                if (j4 != -1) {
                                }
                                int i1432222 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                java.lang.Object[] objArr962222 = new java.lang.Object[1];
                                b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", (i1432222 & 25) + (i1432222 | 25), objArr962222);
                                java.lang.Class<?> cls372222 = java.lang.Class.forName((java.lang.String) objArr962222[0]);
                                int i1442222 = -android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                int i1452222 = i1442222 * (-51);
                                int i1462222 = ((i1452222 | 901) << 1) - (i1452222 ^ 901);
                                int i1472222 = ~((int) java.lang.System.currentTimeMillis());
                                int i1482222 = (i1472222 ^ i1442222) | (i1472222 & i1442222);
                                int i1492222 = -(-((~((i1482222 & 17) | (i1482222 ^ 17))) * 52));
                                int i1502222 = ((i1462222 | i1492222) << 1) - (i1462222 ^ i1492222);
                                int i1512222 = ~((i1472222 & (-18)) | (i1472222 ^ (-18)));
                                int i1522222 = ~((i1442222 & (-18)) | (i1442222 ^ (-18)));
                                int i1532222 = (i1512222 ^ i1522222) | (i1512222 & i1522222);
                                int i1542222 = ~i1482222;
                                int i1552222 = ((i1542222 ^ i1532222) | (i1542222 & i1532222)) * (-52);
                                int i1562222 = ~i1442222;
                                int i1572222 = ~(i1472222 | i1562222);
                                int i1582222 = ~((i1562222 ^ 17) | (i1562222 & 17));
                                java.lang.Object[] objArr972222 = new java.lang.Object[1];
                                b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", (((i1502222 ^ i1552222) + ((i1552222 & i1502222) << 1)) - (~(((i1582222 ^ i1572222) | (i1582222 & i1572222)) * 52))) - 1, objArr972222);
                                context2 = (android.content.Context) cls372222.getMethod((java.lang.String) objArr972222[0], new java.lang.Class[0]).invoke(null, null);
                                if (context2 != null) {
                                }
                                byte[] bArr72222 = $$d;
                                java.lang.Object[] objArr982222 = new java.lang.Object[1];
                                d(bArr72222[10], bArr72222[324], 450, objArr982222);
                                java.lang.Class<?> cls382222 = java.lang.Class.forName((java.lang.String) objArr982222[0]);
                                java.lang.Object[] objArr992222 = new java.lang.Object[1];
                                d(bArr72222[47], bArr72222[180], 141, objArr992222);
                                java.lang.String str122222 = (java.lang.String) objArr992222[0];
                                str5 = str3;
                                java.lang.Object[] objArr1002222 = new java.lang.Object[1];
                                e(null, null, 128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr1002222);
                                java.lang.Object[] objArr1012222 = (java.lang.Object[]) cls382222.getMethod(str122222, java.lang.Class.forName((java.lang.String) objArr1002222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context2, 0, 1890149111);
                                if (context2 != null) {
                                }
                                objArr7 = objArr1012222;
                                i7 = ((int[]) objArr7[1])[0];
                                if (((int[]) objArr7[0])[0] != i7) {
                                }
                                java.lang.Class cls2122222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 922, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                java.lang.Object[] objArr6322222 = new java.lang.Object[1];
                                c((byte) (-bArr[10]), (byte) (-bArr[92]), bArr[35], objArr6322222);
                                j5 = cls2122222.getField((java.lang.String) objArr6322222[0]).getLong(null);
                                if (j5 != -1) {
                                }
                                java.lang.Object[] objArr9322222 = {351743492};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                if (obj2 == null) {
                                }
                                java.lang.Object[] values$466995e322222 = com.payair.hce.getCardMetadata.AnonymousClass5.values$466995e3(((java.lang.reflect.Constructor) obj2).newInstance(objArr9322222));
                                java.lang.Class cls3522222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.MeasureSpec.getSize(0), 922 - android.text.TextUtils.indexOf(str4, str4), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                java.lang.Object[] objArr9422222 = new java.lang.Object[1];
                                c(b2, bArr[109], bArr[97], objArr9422222);
                                cls3522222.getField((java.lang.String) objArr9422222[0]).set(null, values$466995e322222);
                            } catch (java.lang.Exception unused6) {
                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                            }
                            long longValue62 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls502 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.View.MeasureSpec.getSize(0), 707 - android.view.KeyEvent.keyCodeFromString(""), (char) (34284 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                            byte b342 = bArr[2];
                            c3 = 1;
                            java.lang.Object[] objArr1232 = new java.lang.Object[1];
                            c(b9, b342, (byte) (b342 | 76), objArr1232);
                            c4 = 0;
                            cls502.getField((java.lang.String) objArr1232[0]).set(null, java.lang.Long.valueOf(longValue62));
                            objArr4 = objArr121;
                            i2 = ((int[]) objArr4[c3])[c4];
                            if (((int[]) objArr4[c4])[c4] == i2) {
                            }
                            java.lang.Class cls922 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.indexOf("", "", 0, 0), 584 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 24292));
                            byte b1122 = bArr[2];
                            java.lang.Object[] objArr3422 = new java.lang.Object[1];
                            c(b9, b1122, (byte) (b1122 | 76), objArr3422);
                            j2 = cls922.getField((java.lang.String) objArr3422[0]).getLong(null);
                            if (j2 != -1) {
                            }
                            int i16022 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                            java.lang.Object[] objArr10922 = new java.lang.Object[1];
                            b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", (i16022 ^ 27) + ((i16022 & 27) << 1), objArr10922);
                            java.lang.Class<?> cls4422 = java.lang.Class.forName((java.lang.String) objArr10922[0]);
                            java.lang.Object[] objArr11022 = new java.lang.Object[1];
                            b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", 18 - android.text.TextUtils.getOffsetBefore("", 0), objArr11022);
                            context4 = (android.content.Context) cls4422.getMethod((java.lang.String) objArr11022[0], new java.lang.Class[0]).invoke(null, null);
                            if (context4 != null) {
                            }
                            byte[] bArr922 = $$d;
                            str2 = "";
                            java.lang.Object[] objArr11122 = new java.lang.Object[1];
                            d(bArr922[10], bArr922[439], (short) ($$e | 320), objArr11122);
                            java.lang.Class<?> cls4522 = java.lang.Class.forName((java.lang.String) objArr11122[0]);
                            byte b2922 = bArr922[17];
                            java.lang.Object[] objArr11222 = new java.lang.Object[1];
                            d(b2922, bArr922[108], (short) (b2922 - 1), objArr11222);
                            java.lang.String str1322 = (java.lang.String) objArr11222[0];
                            int scrollDefaultDelay22 = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
                            byte b3022 = b;
                            int currentTimeMillis1522 = (int) java.lang.System.currentTimeMillis();
                            int i16122 = scrollDefaultDelay22 * 592;
                            int i16222 = ((i16122 | (-74930)) << 1) - (i16122 ^ (-74930));
                            int i16322 = ~scrollDefaultDelay22;
                            int i16422 = (~((i16322 ^ 127) | (i16322 & 127))) * (-1182);
                            int i16522 = ((i16222 | i16422) << 1) - (i16222 ^ i16422);
                            int i16622 = i16322 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                            str = "valueOf";
                            int i16722 = ~currentTimeMillis1522;
                            int i16822 = ~((i16622 ^ i16722) | (i16722 & i16622));
                            int i16922 = ~((scrollDefaultDelay22 ^ 127) | (scrollDefaultDelay22 & 127));
                            int i17022 = -(-(((i16922 ^ i16822) | (i16822 & i16922)) * (-591)));
                            int i17122 = ((i16522 | i17022) << 1) - (i16522 ^ i17022);
                            int i17222 = (currentTimeMillis1522 ^ i16322) | (currentTimeMillis1522 & i16322);
                            int i17322 = ((i17222 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i17222 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 591;
                            java.lang.Object[] objArr11322 = new java.lang.Object[1];
                            e(null, null, (i17122 & i17322) + (i17322 | i17122), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr11322);
                            java.lang.Object[] objArr11422 = (java.lang.Object[]) cls4522.getMethod(str1322, java.lang.Class.forName((java.lang.String) objArr11322[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context4, 0, -2132116575);
                            if (context4 != null) {
                            }
                            objArr5 = objArr11422;
                            i3 = ((int[]) objArr5[1])[0];
                            if (((int[]) objArr5[0])[0] != i3) {
                            }
                            java.lang.Class cls12222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 584 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (24290 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                            java.lang.Object[] objArr42222 = new java.lang.Object[1];
                            c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr42222);
                            j3 = cls12222.getField((java.lang.String) objArr42222[0]).getLong(null);
                            if (j3 != -1) {
                            }
                            byte[] bArr8222 = $$d;
                            java.lang.Object[] objArr104222 = new java.lang.Object[1];
                            d(bArr8222[10], bArr8222[139], (short) ($$e | 352), objArr104222);
                            java.lang.Class<?> cls41222 = java.lang.Class.forName((java.lang.String) objArr104222[0]);
                            byte b25222 = bArr8222[15];
                            byte b26222 = bArr8222[47];
                            java.lang.Object[] objArr105222 = new java.lang.Object[1];
                            d(b25222, b26222, (short) (b26222 | 270), objArr105222);
                            java.lang.Object[] objArr106222 = (java.lang.Object[]) cls41222.getMethod((java.lang.String) objArr105222[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, 0, -1571335336);
                            java.lang.Class cls42222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.myPid() >> 22), android.graphics.Color.alpha(0) + 584, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 24291));
                            byte b27222 = (byte) (-bArr[108]);
                            byte b28222 = bArr[97];
                            java.lang.Object[] objArr107222 = new java.lang.Object[1];
                            c(b27222, b28222, (byte) (b28222 | 60), objArr107222);
                            cls42222.getField((java.lang.String) objArr107222[0]).set(null, objArr106222);
                        } catch (java.lang.Exception unused7) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                        long longValue7 = ((java.lang.Long) java.lang.Class.forName(str8).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 40, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 667, (char) (android.text.TextUtils.indexOf("", "") + 40024));
                        c = 1;
                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                        c(bArr[97], (byte) (-bArr[11]), (byte) (bArr[3] - 1), objArr124);
                        c2 = 0;
                        cls51.getField((java.lang.String) objArr124[0]).set(null, java.lang.Long.valueOf(longValue7));
                        objArr3 = objArr2;
                        i = ((int[]) objArr3[c])[c2];
                        if (((int[]) objArr3[c2])[c2] != i) {
                        }
                        java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 47, 707 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((-16742932) - android.graphics.Color.rgb(0, 0, 0)));
                        int i332 = $$b;
                        byte b92 = (byte) (i332 & 125);
                        byte b102 = bArr[2];
                        java.lang.Object[] objArr252 = new java.lang.Object[1];
                        c(b92, b102, (byte) (b102 | 76), objArr252);
                        j = cls62.getField((java.lang.String) objArr252[0]).getLong(null);
                        if (j != -1) {
                        }
                        java.lang.Object[] objArr1192 = {0, 0, 1226359029};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                        if (obj == null) {
                        }
                        java.lang.Object[] objArr1212 = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr1192);
                        java.lang.Class cls492 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 707 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 34284));
                        java.lang.Object[] objArr1222 = new java.lang.Object[1];
                        c((byte) (i332 & 126), (byte) (bArr[48] - 1), 105, objArr1222);
                        cls492.getField((java.lang.String) objArr1222[0]).set(null, objArr1212);
                    } catch (java.lang.Exception unused8) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                    java.lang.Object[] objArr125 = {context, 0, 0, 447958037};
                    byte[] bArr10 = $$d;
                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                    d(bArr10[10], bArr10[313], 226, objArr126);
                    java.lang.Class<?> cls52 = java.lang.Class.forName((java.lang.String) objArr126[0]);
                    byte b35 = bArr10[15];
                    byte b36 = bArr10[47];
                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                    d(b35, b36, (short) (b36 | 270), objArr127);
                    java.lang.String str14 = (java.lang.String) objArr127[0];
                    int i175 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                    e(null, null, ((i175 | 127) << 1) - (i175 ^ 127), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr128);
                    objArr2 = (java.lang.Object[]) cls52.getMethod(str14, java.lang.Class.forName((java.lang.String) objArr128[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr125);
                    java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 668, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 40023));
                    byte b37 = (byte) ($$b & 125);
                    byte b38 = bArr[2];
                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                    c(b37, b38, (byte) (b38 | 76), objArr129);
                    cls53.getField((java.lang.String) objArr129[0]).set(null, objArr2);
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
                int i176 = -(android.os.Process.myPid() >> 22);
                int currentTimeMillis16 = (int) java.lang.System.currentTimeMillis();
                int i177 = i176 * 866;
                int i178 = ~i176;
                int i179 = ~currentTimeMillis16;
                int i180 = ~((i178 & i179) | (i178 ^ i179));
                int i181 = ((((i177 | (-22464)) << 1) - (i177 ^ (-22464))) - (~(((i180 ^ (-27)) | (i180 & (-27))) * (-865)))) - 1;
                int i182 = -(-((~((currentTimeMillis16 & i176) | (i176 ^ currentTimeMillis16))) * 865));
                int i183 = ~((i179 & (-27)) | (i179 ^ (-27)));
                int i184 = ~((i176 ^ i179) | (i176 & i179));
                java.lang.Object[] objArr130 = new java.lang.Object[1];
                b("ᜭ\uee81즞\ue272縌ঐ፮뀜\ue1a9ླྀ硚廆摆畢肞曐늽\uf3f0ẽ뿡쩦㺮참\u0edbၕ㪍", (i181 ^ i182) + ((i182 & i181) << 1) + (((i184 ^ i183) | (i184 & i183)) * 865), objArr130);
                java.lang.Class<?> cls54 = java.lang.Class.forName((java.lang.String) objArr130[0]);
                int touchSlop = android.view.ViewConfiguration.getTouchSlop() >> 8;
                int currentTimeMillis17 = (int) java.lang.System.currentTimeMillis();
                int i185 = touchSlop * (-109);
                int i186 = ((i185 | 1998) << 1) - (i185 ^ 1998);
                int i187 = ~touchSlop;
                int i188 = ~(currentTimeMillis17 | 18);
                int i189 = (i188 | i187) * (-220);
                int i190 = (i186 ^ i189) + ((i186 & i189) << 1);
                int i191 = ~((touchSlop ^ 18) | (touchSlop & 18));
                int i192 = ((i188 ^ i191) | (i188 & i191)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                int i193 = ~((i187 & 18) | (i187 ^ 18));
                int i194 = ~((touchSlop ^ (-19)) | (touchSlop & (-19)));
                java.lang.Object[] objArr131 = new java.lang.Object[1];
                b("\uf541Ꞅ齨惄螧\uf8d8멹碈\ue4ef⾧캇鈅ᴸ뵶肞曐炫䧫", (i190 ^ i192) + ((i190 & i192) << 1) + (((i194 ^ i193) | (i194 & i193)) * 110), objArr131);
                context = (android.content.Context) cls54.getMethod((java.lang.String) objArr131[0], new java.lang.Class[0]).invoke(null, null);
                if (context != null) {
                    int currentTimeMillis18 = (int) java.lang.System.currentTimeMillis();
                    int i195 = ~currentTimeMillis18;
                    int i196 = ~(((-17976899) & i195) | ((-17976899) ^ i195));
                    int i197 = ((i196 ^ 16778816) | (16778816 & i196)) * (-1188);
                    int i198 = (1400774760 ^ i197) + ((i197 & 1400774760) << 1);
                    int i199 = ~(currentTimeMillis18 | 17976898);
                    int i200 = (i199 ^ 16778816) | (16778816 & i199);
                    int i201 = ~((-1780369563) | i195);
                    int i202 = -(-(((i200 ^ i201) | (i200 & i201)) * 594));
                    int i203 = (i198 & i202) + (i202 | i198);
                    int i204 = ~(17976898 | i195);
                    int i205 = ((i204 ^ 1779171480) | (1779171480 & i204) | i201) * 594;
                    int currentTimeMillis19 = (int) java.lang.System.currentTimeMillis();
                    int i206 = ~currentTimeMillis19;
                    int i207 = ~((i206 ^ 1615333916) | (1615333916 & i206));
                    int i208 = ((i207 & (-1785527903)) | ((-1785527903) ^ i207)) * 529;
                    int i209 = ~((currentTimeMillis19 ^ 1615333916) | (1615333916 & currentTimeMillis19));
                    if ((i203 & i205) + (i205 | i203) > ((-1430862882) & i208) + (i208 | (-1430862882)) + (((i209 ^ (-1785525331)) | ((-1785525331) & i209)) * 529)) {
                        context.getApplicationContext();
                        throw null;
                    }
                    context = context.getApplicationContext();
                }
                int i210 = getMaximumPinTry;
                build = (((i210 | 59) << 1) - (i210 ^ 59)) % 128;
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
    }

    private static /* synthetic */ java.lang.Object SdkCoreRemotePaymentDataImpl(java.lang.Object[] objArr) {
        boolean booleanValue = ((java.lang.Boolean) objArr[0]).booleanValue();
        int i = getMaximumPinTry;
        build = (i + 121) % 128;
        buildRecords = booleanValue;
        int i2 = ((i ^ 10) + ((i & 10) << 1)) - 1;
        build = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static boolean getCardMetadata() {
        int i = build;
        getMaximumPinTry = ((i ^ 33) + ((i & 33) << 1)) % 128;
        boolean z = buildRecords;
        getMaximumPinTry = (((i & 112) + (i | 112)) - 1) % 128;
        return z;
    }

    static void AlternateContactlessPaymentDataJson(boolean z) {
        int i = build & 21;
        getMaximumPinTry = ((i - (~(-(-((r0 ^ 21) | i))))) - 1) % 128;
        getCrmCountryCode = java.lang.Boolean.valueOf(z);
        com.payair.hce.setLeft.values(new java.lang.Object[]{"LVT", java.lang.Boolean.valueOf(z), SdkCoreAlternateContactlessPaymentDataImpl.getSharedPreferences("HCE_SHARED_PREFERENCES", 0)}, 877494560, -877494557, (int) java.lang.System.currentTimeMillis());
        int i2 = build;
        getMaximumPinTry = ((((i2 ^ 105) | (i2 & 105)) << 1) - ((i2 & (-106)) | ((~i2) & 105))) % 128;
    }

    private static /* synthetic */ java.lang.Object getDualTapResetTimeout(java.lang.Object[] objArr) {
        int i = getMaximumPinTry;
        int i2 = i ^ 53;
        int i3 = -(-((i & 53) << 1));
        build = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        if (getCrmCountryCode == null) {
            int i4 = i & 19;
            int i5 = ((i ^ 19) | i4) << 1;
            int i6 = -((i | 19) & (~i4));
            build = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
            getCrmCountryCode = java.lang.Boolean.valueOf(((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[]{"LVT", java.lang.Boolean.TRUE, SdkCoreAlternateContactlessPaymentDataImpl.getSharedPreferences("HCE_SHARED_PREFERENCES", 0)}, 1733150541, -1733150536, (int) java.lang.System.currentTimeMillis())).booleanValue());
            int i7 = getMaximumPinTry;
            int i8 = (i7 | 115) << 1;
            int i9 = -(i7 ^ 115);
            build = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
        }
        boolean booleanValue = getCrmCountryCode.booleanValue();
        int i10 = build;
        int i11 = i10 & 51;
        int i12 = (i11 - (~(-(-((i10 ^ 51) | i11))))) - 1;
        getMaximumPinTry = i12 % 128;
        if (i12 % 2 != 0) {
            return java.lang.Boolean.valueOf(booleanValue);
        }
        throw new java.lang.ArithmeticException();
    }

    static boolean getQ() {
        int i = getMaximumPinTry;
        int i2 = i & 29;
        int i3 = (i | 29) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        build = i5 % 128;
        if (i5 % 2 == 0) {
            com.payair.hce.setSelector setselector = (com.payair.hce.setSelector) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], 1953461450, -1953461436, (int) java.lang.System.currentTimeMillis());
            if (setselector != null) {
                boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setSelector.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setselector, SdkCoreAlternateContactlessPaymentDataImpl}, -543709406, 543709408, java.lang.System.identityHashCode(setselector))).booleanValue();
                build = (getMaximumPinTry + 33) % 128;
                return booleanValue;
            }
            int i6 = getMaximumPinTry + 88;
            int i7 = (~i6) + (i6 << 1);
            build = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCiacDeclineOnPpms(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        int i = build;
        int i2 = ((i & 32) + (i | 32)) - 1;
        getMaximumPinTry = i2 % 128;
        if (i2 % 2 != 0) {
            if (getPpseFci == null) {
                try {
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 37, android.text.TextUtils.indexOf("", "") + 5051, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("AlternateContactlessPaymentDataJson", null);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
                    }
                    java.lang.Object obj2 = com.payair.hce.setWillNotDraw.getMchipCvmIssuerOptions.get(-723478322);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.setWillNotDraw.valueOf((char) (13214 - android.graphics.Color.blue(0)), 39 - android.text.TextUtils.getTrimmedLength(""), android.os.Process.getGidForName("") + 46)).getDeclaredConstructor(null);
                        com.payair.hce.setWillNotDraw.getMchipCvmIssuerOptions.put(-723478322, obj2);
                    }
                    getPpseFci = ((java.lang.reflect.Constructor) obj2).newInstance(null);
                    int i3 = getMaximumPinTry;
                    int i4 = i3 | 7;
                    int i5 = i4 << 1;
                    int i6 = -((~(i3 & 7)) & i4);
                    build = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            java.lang.Object obj3 = getPpseFci;
            java.lang.Object[] objArr2 = {context};
            java.lang.Object obj4 = com.payair.hce.setWillNotDraw.getMchipCvmIssuerOptions.get(2103512852);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.setWillNotDraw.valueOf((char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 13215), 39 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.graphics.Color.red(0) + 45)).getMethod("DigitizedCardProfile", android.content.Context.class);
                com.payair.hce.setWillNotDraw.getMchipCvmIssuerOptions.put(2103512852, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(obj3, objArr2);
            int i7 = getMaximumPinTry;
            int i8 = i7 ^ 75;
            int i9 = (((i7 & 75) | i8) << 1) - i8;
            build = i9 % 128;
            if (i9 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getRecords(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        int i = getMaximumPinTry + 3;
        build = i % 128;
        if (i % 2 == 0) {
            if (getPpseFci == null) {
                try {
                    java.lang.Object obj = com.payair.hce.setWillNotDraw.getMchipCvmIssuerOptions.get(-723478322);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.setWillNotDraw.valueOf((char) (13214 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), android.view.View.MeasureSpec.getMode(0) + 39, android.text.TextUtils.getOffsetAfter("", 0) + 45)).getDeclaredConstructor(null);
                        com.payair.hce.setWillNotDraw.getMchipCvmIssuerOptions.put(-723478322, obj);
                    }
                    getPpseFci = ((java.lang.reflect.Constructor) obj).newInstance(null);
                    int i2 = getMaximumPinTry;
                    build = ((-2) - (~((i2 ^ 116) + ((i2 & 116) << 1)))) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            java.lang.Object obj2 = getPpseFci;
            java.lang.Object[] objArr2 = {context};
            java.lang.Object obj3 = com.payair.hce.setWillNotDraw.getMchipCvmIssuerOptions.get(-1859732274);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.setWillNotDraw.valueOf((char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 13214), android.os.Process.getGidForName("") + 40, 45 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod("values", android.content.Context.class);
                com.payair.hce.setWillNotDraw.getMchipCvmIssuerOptions.put(-1859732274, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(obj2, objArr2);
            getPpseFci = null;
            int i3 = getMaximumPinTry + 89;
            build = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        int i = build;
        int i2 = i & 95;
        getMaximumPinTry = ((((i ^ 95) | i2) << 1) - ((i | 95) & (~i2))) % 128;
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setLeft.values(new java.lang.Object[0], -1435836338, 1435836351, (int) java.lang.System.currentTimeMillis())).booleanValue();
        int i3 = build;
        int i4 = (i3 & 61) + (i3 | 61);
        getMaximumPinTry = i4 % 128;
        if (i4 % 2 != 0) {
            return java.lang.Boolean.valueOf(booleanValue);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        int i = build;
        int i2 = i & 37;
        int i3 = (i | 37) & (~i2);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i4 = -(-(i2 << 1));
        getMaximumPinTry = ((i3 & i4) + (i3 | i4)) % 128;
        if (android.os.Build.VERSION.SDK_INT > 29) {
            int i5 = build + 57;
            getMaximumPinTry = i5 % 128;
            if (i5 % 2 != 0) {
                return bool;
            }
            throw null;
        }
        int i6 = getMaximumPinTry;
        int i7 = i6 & 121;
        int i8 = (((i6 ^ 121) | i7) << 1) - ((i6 | 121) & (~i7));
        build = i8 % 128;
        boolean z = false;
        if (i8 % 2 != 0) {
            throw null;
        }
        if (((java.lang.Boolean) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], 1292272749, -1292272738, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i9 = getMaximumPinTry;
            int i10 = ((i9 | 39) << 1) - (i9 ^ 39);
            build = i10 % 128;
            if (i10 % 2 == 0) {
                return bool;
            }
            throw new java.lang.ArithmeticException();
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) ((android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())).getSystemService("connectivity");
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            int i11 = build;
            getMaximumPinTry = ((((i11 | 12) << 1) - (i11 ^ 12)) - 1) % 128;
            if (!networkCapabilities.hasTransport(1)) {
                int i12 = build;
                int i13 = i12 & 109;
                int i14 = (i13 - (~(-(-((i12 ^ 109) | i13))))) - 1;
                getMaximumPinTry = i14 % 128;
                if (i14 % 2 != 0 ? !networkCapabilities.hasTransport(0) : !networkCapabilities.hasTransport(1)) {
                    int i15 = build;
                    int i16 = i15 & 103;
                    int i17 = ((i15 ^ 103) | i16) << 1;
                    int i18 = -((i15 | 103) & (~i16));
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    getMaximumPinTry = i19 % 128;
                    if (i19 % 2 != 0 ? !networkCapabilities.hasTransport(3) : !networkCapabilities.hasTransport(5)) {
                        int i20 = getMaximumPinTry;
                        int i21 = ((i20 & (-38)) | ((~i20) & 37)) + ((i20 & 37) << 1);
                        build = i21 % 128;
                        if (i21 % 2 == 0) {
                        }
                        int i22 = build;
                        int i23 = i22 & 59;
                        int i24 = -(-((i22 ^ 59) | i23));
                        getMaximumPinTry = (((i23 | i24) << 1) - (i24 ^ i23)) % 128;
                        return java.lang.Boolean.valueOf(z);
                    }
                }
            }
            z = true;
            int i222 = build;
            int i232 = i222 & 59;
            int i242 = -(-((i222 ^ 59) | i232));
            getMaximumPinTry = (((i232 | i242) << 1) - (i242 ^ i232)) % 128;
            return java.lang.Boolean.valueOf(z);
        }
        int i25 = getMaximumPinTry;
        int i26 = i25 & 21;
        build = (((((i25 ^ 21) | i26) << 1) - (~(-((i25 | 21) & (~i26))))) - 1) % 128;
        int i2222 = build;
        int i2322 = i2222 & 59;
        int i2422 = -(-((i2222 ^ 59) | i2322));
        getMaximumPinTry = (((i2322 | i2422) << 1) - (i2422 ^ i2322)) % 128;
        return java.lang.Boolean.valueOf(z);
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        switch ((i * 303) + (i2 * (-301)) + (((~((~i3) | i4 | i2)) | (~(i | i2 | i3))) * (-302)) + ((~(i4 | i2 | i3)) * (-604)) + (((~(i | (~i2))) | (~(i2 | i3))) * 302)) {
            case 1:
                return valueOf(objArr);
            case 2:
                return values(objArr);
            case 3:
                return AlternateContactlessPaymentDataJson(objArr);
            case 4:
                return writeReplace(objArr);
            case 5:
                int i5 = getMaximumPinTry;
                build = (((i5 | 33) << 1) - ((i5 & (-34)) | ((~i5) & 33))) % 128;
                long j = getSecurityWord;
                build = (((i5 & 60) + (i5 | 60)) - 1) % 128;
                return java.lang.Long.valueOf(j);
            case 6:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 7:
                return RecordsJson(objArr);
            case 8:
                return getProfileVersion(objArr);
            case 9:
                java.lang.String str = (java.lang.String) objArr[0];
                getMaximumPinTry = (build + 45) % 128;
                com.payair.hce.communication.Connection.valueOf(new java.lang.Object[]{str}, 1818092431, -1818092431, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setDrawingCacheEnabled.values(new java.lang.Object[]{str}, -652834650, 652834650, (int) java.lang.System.currentTimeMillis());
                build = (getMaximumPinTry + 77) % 128;
                return null;
            case 10:
                java.lang.String str2 = (java.lang.String) objArr[0];
                int i6 = getMaximumPinTry;
                build = (((i6 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i6 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
                com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{str2, bool}, -757430979, 757431035, (int) java.lang.System.currentTimeMillis());
                getMaximumPinTry = (build + 109) % 128;
                return setsystemgestureexclusionrects;
            case 11:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 12:
                return getAid(objArr);
            case 13:
                return SdkCoreBusinessLogicModuleImpl(objArr);
            case 14:
                int i7 = (build + 49) % 128;
                getMaximumPinTry = i7;
                java.lang.String str3 = valueOf;
                build = (i7 + 19) % 128;
                return str3;
            case 15:
                int i8 = build;
                getMaximumPinTry = (((i8 & (-94)) | ((~i8) & 93)) + ((i8 & 93) << 1)) % 128;
                return null;
            case 16:
                return getGpoResponse(objArr);
            case 17:
                return getCiacDecline(objArr);
            case 18:
                return getCvrMaskAnd(objArr);
            case 19:
                return getPaymentFci(objArr);
            case 20:
                java.lang.String str4 = (java.lang.String) objArr[0];
                int i9 = getMaximumPinTry + 101;
                build = i9 % 128;
                if (i9 % 2 != 0) {
                    getPaymentFci = str4;
                    com.payair.hce.setLeft.values(new java.lang.Object[]{"PACKAGE_NAME", str4, ((android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0)}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
                } else {
                    getPaymentFci = str4;
                    com.payair.hce.setLeft.values(new java.lang.Object[]{"PACKAGE_NAME", str4, ((android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0)}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
                }
                return null;
            case 21:
                return getDualTapResetTimeout(objArr);
            case 22:
                java.lang.String str5 = (java.lang.String) objArr[0];
                int i10 = build;
                getMaximumPinTry = (i10 + 45) % 128;
                getMchipCvmIssuerOptions = str5;
                getMaximumPinTry = ((i10 & 63) + (i10 | 63)) % 128;
                return null;
            case 23:
                return getCvmResetTimeout(objArr);
            case 24:
                return getApplicationLifeCycleData(objArr);
            case 25:
                return getSecurityWord(objArr);
            case 26:
                return getCardLayoutDescription(objArr);
            case 27:
                return SdkCoreCardRiskManagementDataImpl(objArr);
            case 28:
                return getAdditionalCheckTable(objArr);
            case 29:
                return getCardholderValidators(objArr);
            case 30:
                return getMagstripeCvmIssuerOptions(objArr);
            case 31:
                return getMchipCvmIssuerOptions(objArr);
            case 32:
                return getCdol1RelatedDataLength(objArr);
            case 33:
                return SdkCoreContactlessPaymentDataImpl(objArr);
            case 34:
                return buildRecords(objArr);
            case 35:
                return getCrmCountryCode(objArr);
            case 36:
                return getPpseFci(objArr);
            case 37:
                return getAlternateContactlessPaymentData(objArr);
            case 38:
                return getIssuerApplicationData(objArr);
            case 39:
                return getPinIvCvc3Track2(objArr);
            case 40:
                return getIccPrivateKeyCrtComponents(objArr);
            case 41:
                return getCiacDeclineOnPpms(objArr);
            case 42:
                return getDigitizedCardId(objArr);
            case 43:
                com.payair.hce.DeviceAuthenticationDialogListener deviceAuthenticationDialogListener = (com.payair.hce.DeviceAuthenticationDialogListener) objArr[0];
                androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) objArr[1];
                getMaximumPinTry = (build + 63) % 128;
                com.payair.hce.setFocusable.values(new java.lang.Object[]{deviceAuthenticationDialogListener, fragmentActivity}, -1458667792, 1458667798, (int) java.lang.System.currentTimeMillis());
                int i11 = getMaximumPinTry;
                int i12 = i11 & 33;
                int i13 = ((i11 ^ 33) | i12) << 1;
                int i14 = -((i11 | 33) & (~i12));
                build = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
                return null;
            case 44:
                return getRecords(objArr);
            case 45:
                return getMaximumPinTry(objArr);
            case 46:
                return SdkCoreDigitizedCardProfileImpl(objArr);
            case 47:
                java.lang.String str6 = (java.lang.String) objArr[0];
                int i15 = build;
                int i16 = (((i15 | 7) << 1) - (i15 ^ 7)) % 128;
                getMaximumPinTry = i16;
                DigitizedCardProfile = str6;
                build = (((i16 ^ 86) + ((i16 & 86) << 1)) - 1) % 128;
                return null;
            case 48:
                return build(objArr);
            case 49:
                com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects2 = (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{new java.lang.String((byte[]) objArr[0]), bool}, -757430979, 757431035, (int) java.lang.System.currentTimeMillis());
                int i17 = getMaximumPinTry;
                int i18 = i17 ^ 51;
                int i19 = -(-((i17 & 51) << 1));
                build = ((i18 & i19) + (i19 | i18)) % 128;
                return setsystemgestureexclusionrects2;
            case 50:
                byte[] bArr = (byte[]) objArr[0];
                android.content.Context context = (android.content.Context) objArr[1];
                try {
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 38, 5051 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6))).getMethod("AlternateContactlessPaymentDataJson", null);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
                    }
                    com.payair.hce.setWebChromeClient.values(new java.lang.Object[]{context, new java.lang.String(bArr), com.visa.cbp.sdk.facade.data.TokenStatus.ACTIVE}, -1894136898, 1894136898, (int) java.lang.System.currentTimeMillis());
                    int i20 = getMaximumPinTry;
                    int i21 = i20 & 23;
                    build = (((i20 | 23) & (~i21)) + (i21 << 1)) % 128;
                    return java.lang.Boolean.TRUE;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            case 51:
                return getCardMetadata(objArr);
            case 52:
                java.lang.String str7 = (java.lang.String) objArr[0];
                int i22 = build;
                int i23 = ((i22 & 117) + (i22 | 117)) % 128;
                getMaximumPinTry = i23;
                valueOf = str7;
                int i24 = i23 | 121;
                int i25 = i24 << 1;
                int i26 = -(i24 & (~(i23 & 121)));
                build = ((i25 ^ i26) + ((i26 & i25) << 1)) % 128;
                return null;
            case 53:
                return wipe(objArr);
            case 54:
                return getMppLiteModule(objArr);
            case 55:
                return getContent(objArr);
            case 56:
                return getBusinessLogicModule(objArr);
            case 57:
                return getQ(objArr);
            case 58:
                android.content.Context context2 = (android.content.Context) objArr[0];
                int i27 = build;
                getMaximumPinTry = (((i27 | 89) << 1) - (i27 ^ 89)) % 128;
                SdkCoreAlternateContactlessPaymentDataImpl = context2;
                getMaximumPinTry = ((i27 & 101) + (i27 | 101)) % 128;
                return null;
            case 59:
                return getDq(objArr);
            case 60:
                return getP(objArr);
            case 61:
                return SdkCoreIccPrivateKeyCrtComponentsImpl(objArr);
            case 62:
                return getDp(objArr);
            case 63:
                return getU(objArr);
            case 64:
                int i28 = getMaximumPinTry;
                build = ((((i28 | 28) << 1) - (i28 ^ 28)) - 1) % 128;
                com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled = writeReplace;
                int i29 = getMaximumPinTry;
                int i30 = ((i29 ^ 71) | (i29 & 71)) << 1;
                int i31 = -((i29 & (-72)) | ((~i29) & 71));
                build = ((i30 ^ i31) + ((i31 & i30) << 1)) % 128;
                for (com.payair.hce.setPointerIcon setpointericon : (java.util.List) com.payair.hce.setSoundEffectsEnabled.DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled}, -1003984198, 1003984205, java.lang.System.identityHashCode(setsoundeffectsenabled))) {
                    int i32 = build;
                    int i33 = i32 & 125;
                    getMaximumPinTry = ((((i32 | 125) & (~i33)) - (~(i33 << 1))) - 1) % 128;
                    com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled2 = writeReplace;
                    com.payair.hce.setSoundEffectsEnabled.DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled2, setpointericon}, 1341743887, -1341743886, java.lang.System.identityHashCode(setsoundeffectsenabled2));
                    int i34 = build;
                    getMaximumPinTry = ((i34 ^ 47) + ((i34 & 47) << 1)) % 128;
                }
                valueOf(new java.lang.Object[]{null}, -602765149, 602765149, (int) java.lang.System.currentTimeMillis());
                int i35 = build;
                getMaximumPinTry = ((-2) - (~(((i35 | 98) << 1) - (i35 ^ 98)))) % 128;
                return null;
            case 65:
                return getAckAlwaysRequiredIfCurrencyProvided(objArr);
            case 66:
                return SdkCoreMChipCvmIssuerOptionsImpl(objArr);
            case 67:
                return getPinPreEntryAllowed(objArr);
            case 68:
                return getPinAlwaysRequiredIfCurrencyNotProvided(objArr);
            case 69:
                com.payair.hce.setPointerIcon setpointericon2 = (com.payair.hce.setPointerIcon) objArr[0];
                int i36 = getMaximumPinTry;
                int i37 = i36 ^ 99;
                int i38 = -(-((i36 & 99) << 1));
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                build = i39 % 128;
                if (i39 % 2 != 0) {
                    com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled3 = writeReplace;
                    com.payair.hce.setPointerIcon[] setpointericonArr = new com.payair.hce.setPointerIcon[0];
                    setpointericonArr[0] = setpointericon2;
                    com.payair.hce.setSoundEffectsEnabled.DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled3, setpointericonArr}, 646732337, -646732333, java.lang.System.identityHashCode(setsoundeffectsenabled3));
                    valueOf(new java.lang.Object[0], -91409097, 91409142, (int) java.lang.System.currentTimeMillis());
                } else {
                    com.payair.hce.setSoundEffectsEnabled setsoundeffectsenabled4 = writeReplace;
                    com.payair.hce.setSoundEffectsEnabled.DigitizedCardProfile(new java.lang.Object[]{setsoundeffectsenabled4, new com.payair.hce.setPointerIcon[]{setpointericon2}}, 646732337, -646732333, java.lang.System.identityHashCode(setsoundeffectsenabled4));
                    valueOf(new java.lang.Object[0], -91409097, 91409142, (int) java.lang.System.currentTimeMillis());
                }
                return null;
            case 70:
                int i40 = build;
                int i41 = (-2) - (~(((i40 | 6) << 1) - (i40 ^ 6)));
                getMaximumPinTry = i41 % 128;
                if (i41 % 2 == 0) {
                    getCardLayoutDescription = false;
                } else {
                    getCardLayoutDescription = true;
                }
                return null;
            case 71:
                return getAckAutomaticallyResetByApplication(objArr);
            case 72:
                return getAckAlwaysRequiredIfCurrencyNotProvided(objArr);
            case 73:
                int i42 = build;
                getMaximumPinTry = (((i42 ^ 26) + ((i42 & 26) << 1)) - 1) % 128;
                long j2 = getApplicationLifeCycleData;
                int i43 = i42 & 59;
                int i44 = (i42 | 59) & (~i43);
                int i45 = -(-(i43 << 1));
                getMaximumPinTry = ((i44 ^ i45) + ((i44 & i45) << 1)) % 128;
                return java.lang.Long.valueOf(j2);
            case 74:
                return getAckPreEntryAllowed(objArr);
            case 75:
                return getPinAlwaysRequiredIfCurrencyProvided(objArr);
            case 76:
                return getPinAutomaticallyResetByApplication(objArr);
            case 77:
                return getContactlessPaymentData(objArr);
            case 78:
                com.payair.hce.DeviceAuthenticationDialogListener deviceAuthenticationDialogListener2 = (com.payair.hce.DeviceAuthenticationDialogListener) objArr[0];
                androidx.fragment.app.FragmentActivity fragmentActivity2 = (androidx.fragment.app.FragmentActivity) objArr[1];
                int i46 = build;
                int i47 = i46 ^ 41;
                int i48 = -(-((i46 & 41) << 1));
                getMaximumPinTry = (((i47 | i48) << 1) - (i48 ^ i47)) % 128;
                com.payair.hce.setFocusable.values(new java.lang.Object[]{deviceAuthenticationDialogListener2, fragmentActivity2}, 1950555225, -1950555223, (int) java.lang.System.currentTimeMillis());
                int i49 = getMaximumPinTry;
                int i50 = i49 ^ 115;
                int i51 = (i49 & 115) << 1;
                build = (((i50 | i51) << 1) - (i51 ^ i50)) % 128;
                return null;
            case 79:
                java.lang.String str8 = (java.lang.String) objArr[0];
                int i52 = build;
                getMaximumPinTry = ((((i52 | 26) << 1) - (i52 ^ 26)) - 1) % 128;
                getProfileVersion = str8;
                int i53 = i52 & 29;
                int i54 = (i52 | 29) & (~i53);
                int i55 = -(-(i53 << 1));
                getMaximumPinTry = (((i54 | i55) << 1) - (i55 ^ i54)) % 128;
                return null;
            case 80:
                return getRemotePaymentData(objArr);
            case 81:
                return SdkCoreMagstripeCvmIssuerOptionsImpl(objArr);
            case 82:
                return getCardRiskManagementData(objArr);
            case 83:
                int i56 = getMaximumPinTry;
                build = ((i56 ^ 89) + ((i56 & 89) << 1)) % 128;
                return null;
            case 84:
                return SdkCoreMppLiteModuleImpl(objArr);
            case 85:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.ArrayList) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 587851495, -587851469, (int) java.lang.System.currentTimeMillis())).iterator();
                int i57 = build;
                int i58 = i57 & 111;
                int i59 = (i57 | 111) & (~i58);
                int i60 = -(-(i58 << 1));
                getMaximumPinTry = (((i59 | i60) << 1) - (i59 ^ i60)) % 128;
                while (it.hasNext()) {
                    int i61 = build;
                    int i62 = (i61 | 33) << 1;
                    int i63 = -(i61 ^ 33);
                    getMaximumPinTry = ((i62 & i63) + (i63 | i62)) % 128;
                    com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects3 = (com.payair.hce.setSystemGestureExclusionRects) it.next();
                    arrayList.add(((com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects3}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects3))).AlternateContactlessPaymentDataJson());
                    int i64 = getMaximumPinTry;
                    int i65 = ((i64 | 103) << 1) - (i64 ^ 103);
                    build = i65 % 128;
                    int i66 = i65 % 2;
                }
                int i67 = build;
                int i68 = ((i67 ^ 81) | (i67 & 81)) << 1;
                int i69 = -((i67 & (-82)) | ((~i67) & 81));
                getMaximumPinTry = ((i68 & i69) + (i69 | i68)) % 128;
                return arrayList;
            case 86:
                return getRecordNumber(objArr);
            case 87:
                return getSfi(objArr);
            case 88:
                return getRecordValue(objArr);
            case 89:
                return SdkCoreRemotePaymentDataImpl(objArr);
            case 90:
                return SdkCoreRecordsImpl(objArr);
            case 91:
                return getPan(objArr);
            case 92:
                java.lang.Integer num = (java.lang.Integer) objArr[0];
                int i70 = getMaximumPinTry;
                build = (((((i70 ^ 53) | (i70 & 53)) << 1) - (~(-((i70 & (-54)) | ((~i70) & 53))))) - 1) % 128;
                SdkCoreBusinessLogicModuleImpl = num;
                android.content.SharedPreferences sharedPreferences = ((android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0);
                int intValue = num.intValue();
                com.payair.hce.setLeft.values(new java.lang.Object[]{"FlavourID", java.lang.Integer.valueOf(intValue), sharedPreferences}, 987195454, -987195452, intValue);
                getMaximumPinTry = (build + 49) % 128;
                return null;
            case 93:
                return getAip(objArr);
            default:
                return DigitizedCardProfile(objArr);
        }
    }

    static void getPinAlwaysRequiredIfCurrencyNotProvided() {
        getAlternateContactlessPaymentData = (char) 2630;
        getCiacDeclineOnPpms = (char) 4264;
        SdkCoreDigitizedCardProfileImpl = (char) 20884;
        getRecords = (char) 47733;
    }

    static void SdkCoreIccPrivateKeyCrtComponentsImpl() {
        boolean z;
        int i = build + 65;
        getMaximumPinTry = i % 128;
        if (i % 2 == 0) {
            getCdol1RelatedDataLength = new char[]{10931, 10894, 10932, 10882, 10881, 10891, 10958, 10933, 10884, 10935, 10965, 10904};
            getPinIvCvc3Track2 = -143185392;
            z = false;
        } else {
            getCdol1RelatedDataLength = new char[]{10931, 10894, 10932, 10882, 10881, 10891, 10958, 10933, 10884, 10935, 10965, 10904};
            getPinIvCvc3Track2 = -143185392;
            z = true;
        }
        getIssuerApplicationData = z;
        getIccPrivateKeyCrtComponents = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void DigitizedCardProfile(java.util.List list) {
        valueOf(new java.lang.Object[]{list}, 1752326815, -1752326764, (int) java.lang.System.currentTimeMillis());
    }

    static boolean getDq() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[0], -1034948216, 1034948228, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static boolean getDp() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[0], -1820043916, 1820043922, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static void writeReplace(android.content.Context context) {
        valueOf(new java.lang.Object[]{context}, -621775686, 621775730, (int) java.lang.System.currentTimeMillis());
    }

    static void valueOf(android.content.Context context) {
        valueOf(new java.lang.Object[]{context}, -451453949, 451453990, (int) java.lang.System.currentTimeMillis());
    }

    static boolean getP() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[0], -1470273683, 1470273704, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static void DigitizedCardProfile(boolean z) {
        valueOf(new java.lang.Object[]{java.lang.Boolean.valueOf(z)}, -68925969, 68926058, (int) java.lang.System.currentTimeMillis());
    }

    private static void AlternateContactlessPaymentDataJson(com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects) {
        valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, 1492817192, -1492817118, (int) java.lang.System.currentTimeMillis());
    }

    static byte[] getContent() {
        return (byte[]) valueOf(new java.lang.Object[0], 2039767768, -2039767749, (int) java.lang.System.currentTimeMillis());
    }

    static com.payair.hce.communication.JsonResponse writeReplace(java.lang.String str, com.payair.hce.communication.JsonResponse jsonResponse) {
        return (com.payair.hce.communication.JsonResponse) valueOf(new java.lang.Object[]{str, jsonResponse}, 1662194271, -1662194236, (int) java.lang.System.currentTimeMillis());
    }

    static java.lang.String getMppLiteModule() {
        return (java.lang.String) valueOf(new java.lang.Object[0], -1877134633, 1877134726, (int) java.lang.System.currentTimeMillis());
    }

    static void RecordsJson(java.lang.String str) {
        valueOf(new java.lang.Object[]{str}, -2088994012, 2088994034, (int) java.lang.System.currentTimeMillis());
    }

    static void getAid(java.lang.String str) {
        valueOf(new java.lang.Object[]{str}, 1473690759, -1473690675, (int) java.lang.System.currentTimeMillis());
    }

    static java.lang.String getBusinessLogicModule() {
        return (java.lang.String) valueOf(new java.lang.Object[0], 1453778137, -1453778083, (int) java.lang.System.currentTimeMillis());
    }

    static void valueOf(boolean z) {
        valueOf(new java.lang.Object[]{java.lang.Boolean.valueOf(z)}, -1407729612, 1407729635, (int) java.lang.System.currentTimeMillis());
    }

    static boolean wipe() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[0], -1301663721, 1301663778, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    private static void writeReplace(com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects) {
        valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -1899832564, 1899832593, (int) java.lang.System.currentTimeMillis());
    }

    static com.payair.hce.communication.JsonResponse valueOf(java.lang.String str, com.payair.hce.TokenType tokenType) {
        return (com.payair.hce.communication.JsonResponse) valueOf(new java.lang.Object[]{str, tokenType}, 114930102, -114930043, (int) java.lang.System.currentTimeMillis());
    }

    static void RecordsJson(long j) {
        valueOf(new java.lang.Object[]{java.lang.Long.valueOf(j)}, 1332314406, -1332314374, (int) java.lang.System.currentTimeMillis());
    }

    static void IccPrivateKeyCrtComponentsJson(java.lang.String str) {
        valueOf(new java.lang.Object[]{str}, -542409647, 542409656, (int) java.lang.System.currentTimeMillis());
    }

    static void values(boolean z) {
        valueOf(new java.lang.Object[]{java.lang.Boolean.valueOf(z)}, 1494722417, -1494722409, (int) java.lang.System.currentTimeMillis());
    }

    static boolean getRecords() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[0], 1408612372, -1408612304, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static void DigitizedCardProfile(com.google.firebase.messaging.RemoteMessage remoteMessage, android.content.Context context) {
        valueOf(new java.lang.Object[]{remoteMessage, context}, -857584902, 857584909, (int) java.lang.System.currentTimeMillis());
    }

    static void getDigitizedCardId() {
        valueOf(new java.lang.Object[0], 366824650, -366824646, (int) java.lang.System.currentTimeMillis());
    }

    static void DigitizedCardProfile(long j) {
        valueOf(new java.lang.Object[]{java.lang.Long.valueOf(j)}, -1305041371, 1305041459, (int) java.lang.System.currentTimeMillis());
    }

    static int SdkCoreAlternateContactlessPaymentDataImpl(byte[] bArr) {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{bArr}, -665641852, 665641879, (int) java.lang.System.currentTimeMillis())).intValue();
    }

    static void DigitizedCardProfile(com.payair.hce.DeviceAuthenticationDialogListener deviceAuthenticationDialogListener, androidx.fragment.app.FragmentActivity fragmentActivity) {
        valueOf(new java.lang.Object[]{deviceAuthenticationDialogListener, fragmentActivity}, -633281285, 633281363, (int) java.lang.System.currentTimeMillis());
    }

    static void valueOf(com.payair.hce.DeviceAuthenticationDialogListener deviceAuthenticationDialogListener, androidx.fragment.app.FragmentActivity fragmentActivity) {
        valueOf(new java.lang.Object[]{deviceAuthenticationDialogListener, fragmentActivity}, 672621390, -672621347, (int) java.lang.System.currentTimeMillis());
    }

    static void AlternateContactlessPaymentDataJson(byte[] bArr, android.content.Context context) {
        valueOf(new java.lang.Object[]{bArr, context}, 1716558362, -1716558346, (int) java.lang.System.currentTimeMillis());
    }

    static int getAid(byte[] bArr) {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{bArr}, 2091972847, -2091972823, (int) java.lang.System.currentTimeMillis())).intValue();
    }

    static android.content.Context getMaximumPinTry() {
        return (android.content.Context) valueOf(new java.lang.Object[0], -639386097, 639386114, (int) java.lang.System.currentTimeMillis());
    }

    static void values(byte[] bArr) {
        valueOf(new java.lang.Object[]{bArr}, -1989036397, 1989036436, (int) java.lang.System.currentTimeMillis());
    }

    static byte[] build() {
        return (byte[]) valueOf(new java.lang.Object[0], -719646352, 719646388, (int) java.lang.System.currentTimeMillis());
    }

    static void getIssuerApplicationData() {
        valueOf(new java.lang.Object[0], 2069437343, -2069437315, (int) java.lang.System.currentTimeMillis());
    }

    static java.lang.String getPinIvCvc3Track2() {
        return (java.lang.String) valueOf(new java.lang.Object[0], 1598037674, -1598037593, (int) java.lang.System.currentTimeMillis());
    }

    static void getProfileVersion(java.lang.String str) {
        valueOf(new java.lang.Object[]{str}, -139482399, 139482419, (int) java.lang.System.currentTimeMillis());
    }

    static void DigitizedCardProfile(java.lang.Integer num) {
        valueOf(new java.lang.Object[]{num}, -1313010559, 1313010651, (int) java.lang.System.currentTimeMillis());
    }

    static void AlternateContactlessPaymentDataJson(byte[] bArr) {
        valueOf(new java.lang.Object[]{bArr}, 1279068805, -1279068771, (int) java.lang.System.currentTimeMillis());
    }

    static byte[] getIccPrivateKeyCrtComponents() {
        return (byte[]) valueOf(new java.lang.Object[0], 1367903072, -1367902997, (int) java.lang.System.currentTimeMillis());
    }

    static java.util.ArrayList<java.lang.String> getCiacDeclineOnPpms() {
        return (java.util.ArrayList) valueOf(new java.lang.Object[0], 231798747, -231798662, (int) java.lang.System.currentTimeMillis());
    }

    static com.payair.hce.communication.JsonResponse getCdol1RelatedDataLength() {
        return (com.payair.hce.communication.JsonResponse) valueOf(new java.lang.Object[0], 1302103589, -1302103536, (int) java.lang.System.currentTimeMillis());
    }

    static void getCrmCountryCode() {
        valueOf(new java.lang.Object[0], -801469539, 801469602, (int) java.lang.System.currentTimeMillis());
    }

    static void buildRecords() {
        valueOf(new java.lang.Object[0], 815298038, -815297958, (int) java.lang.System.currentTimeMillis());
    }

    static void getPpseFci() {
        valueOf(new java.lang.Object[0], 73241174, -73241163, (int) java.lang.System.currentTimeMillis());
    }

    static void SdkCoreContactlessPaymentDataImpl() {
        valueOf(new java.lang.Object[0], -818000211, 818000248, (int) java.lang.System.currentTimeMillis());
    }

    static boolean SdkCoreCardRiskManagementDataImpl() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[0], 1690481078, -1690481065, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static boolean writeReplace(java.util.List<com.payair.hce.setSystemGestureExclusionRects> list) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{list}, -1339096911, 1339096942, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static boolean getAdditionalCheckTable() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[0], 292270704, -292270628, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static boolean DigitizedCardProfile(byte[] bArr, android.content.Context context) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{bArr, context}, 555366493, -555366428, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static boolean writeReplace(byte[] bArr, android.content.Context context) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{bArr, context}, -2146458388, 2146458438, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static boolean values(byte[] bArr, android.content.Context context) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{bArr, context}, -971163378, 971163426, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static void writeReplace(byte[] bArr) {
        valueOf(new java.lang.Object[]{bArr}, 1897343409, -1897343369, (int) java.lang.System.currentTimeMillis());
    }

    static boolean getMchipCvmIssuerOptions() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[0], 581452567, -581452505, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    private static void writeReplace(com.payair.hce.setTextDirection settextdirection) {
        valueOf(new java.lang.Object[]{settextdirection}, -602765149, 602765149, (int) java.lang.System.currentTimeMillis());
    }

    static long getCardholderValidators() {
        return ((java.lang.Long) valueOf(new java.lang.Object[0], -983817065, 983817131, (int) java.lang.System.currentTimeMillis())).longValue();
    }

    static void AlternateContactlessPaymentDataJson(long j) {
        valueOf(new java.lang.Object[]{java.lang.Long.valueOf(j)}, 277169919, -277169848, (int) java.lang.System.currentTimeMillis());
    }

    static long getMagstripeCvmIssuerOptions() {
        return ((java.lang.Long) valueOf(new java.lang.Object[0], 1257029311, -1257029238, (int) java.lang.System.currentTimeMillis())).longValue();
    }

    static void writeReplace(long j) {
        valueOf(new java.lang.Object[]{java.lang.Long.valueOf(j)}, 916377195, -916377157, (int) java.lang.System.currentTimeMillis());
    }

    static long getCardLayoutDescription() {
        return ((java.lang.Long) valueOf(new java.lang.Object[0], 2121701980, -2121701975, (int) java.lang.System.currentTimeMillis())).longValue();
    }

    static void values(long j) {
        valueOf(new java.lang.Object[]{java.lang.Long.valueOf(j)}, -307356491, 307356546, (int) java.lang.System.currentTimeMillis());
    }

    static void valueOf(java.lang.String str) {
        valueOf(new java.lang.Object[]{str}, 639674115, -639674063, (int) java.lang.System.currentTimeMillis());
    }

    static java.lang.String getDualTapResetTimeout() {
        return (java.lang.String) valueOf(new java.lang.Object[0], 1213004610, -1213004596, (int) java.lang.System.currentTimeMillis());
    }

    private static void getAckAlwaysRequiredIfCurrencyNotProvided() {
        valueOf(new java.lang.Object[0], 1206357920, -1206357856, (int) java.lang.System.currentTimeMillis());
    }

    private static void SdkCoreMChipCvmIssuerOptionsImpl() {
        valueOf(new java.lang.Object[0], -775815345, 775815391, (int) java.lang.System.currentTimeMillis());
    }

    static void AlternateContactlessPaymentDataJson(android.content.Context context) {
        valueOf(new java.lang.Object[]{context}, -1152950622, 1152950680, (int) java.lang.System.currentTimeMillis());
    }

    private static void getPinPreEntryAllowed() {
        valueOf(new java.lang.Object[0], -870824046, 870824136, (int) java.lang.System.currentTimeMillis());
    }

    private static void writeReplace(com.payair.hce.setPointerIcon setpointericon) {
        valueOf(new java.lang.Object[]{setpointericon}, 1990767572, -1990767503, (int) java.lang.System.currentTimeMillis());
    }

    static void getApplicationLifeCycleData() {
        valueOf(new java.lang.Object[0], -91409097, 91409142, (int) java.lang.System.currentTimeMillis());
    }

    static void writeReplace(java.lang.String str) {
        valueOf(new java.lang.Object[]{str}, 1748746859, -1748746857, (int) java.lang.System.currentTimeMillis());
    }

    static java.lang.String getGpoResponse() {
        return (java.lang.String) valueOf(new java.lang.Object[0], 1435980136, -1435980094, (int) java.lang.System.currentTimeMillis());
    }

    static void valueOf(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3) {
        valueOf(new java.lang.Object[]{str, str2, num, str3}, 1243073562, -1243073544, (int) java.lang.System.currentTimeMillis());
    }

    static boolean getPaymentFci() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[0], -713805261, 713805352, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static void getCiacDecline() {
        valueOf(new java.lang.Object[0], 997196297, -997196227, (int) java.lang.System.currentTimeMillis());
    }

    private static void getU() {
        valueOf(new java.lang.Object[0], -1104573840, 1104573866, (int) java.lang.System.currentTimeMillis());
    }

    static void valueOf(long j) {
        valueOf(new java.lang.Object[]{java.lang.Long.valueOf(j)}, 988495194, -988495161, (int) java.lang.System.currentTimeMillis());
    }

    static long getCvrMaskAnd() {
        return ((java.lang.Long) valueOf(new java.lang.Object[0], -191490049, 191490116, (int) java.lang.System.currentTimeMillis())).longValue();
    }

    static java.lang.String SdkCoreBusinessLogicModuleImpl() {
        return (java.lang.String) valueOf(new java.lang.Object[0], -1015528636, 1015528697, (int) java.lang.System.currentTimeMillis());
    }

    static void DigitizedCardProfile(java.lang.String str) {
        valueOf(new java.lang.Object[]{str}, -124700999, 124701078, (int) java.lang.System.currentTimeMillis());
    }

    static java.lang.String RecordsJson() {
        return (java.lang.String) valueOf(new java.lang.Object[0], 441749328, -441749325, (int) java.lang.System.currentTimeMillis());
    }

    static void values(java.lang.String str) {
        valueOf(new java.lang.Object[]{str}, 2132684781, -2132684734, (int) java.lang.System.currentTimeMillis());
    }

    static void AlternateContactlessPaymentDataJson(com.payair.hce.setZ setz) {
        valueOf(new java.lang.Object[]{setz}, -596176346, 596176423, (int) java.lang.System.currentTimeMillis());
    }

    static long IccPrivateKeyCrtComponentsJson() {
        return ((java.lang.Long) valueOf(new java.lang.Object[0], 393526164, -393526134, (int) java.lang.System.currentTimeMillis())).longValue();
    }

    static java.lang.String DigitizedCardProfile(byte[] bArr) {
        return (java.lang.String) valueOf(new java.lang.Object[]{bArr}, -1697812067, 1697812153, (int) java.lang.System.currentTimeMillis());
    }

    static java.lang.String getAid() {
        return (java.lang.String) valueOf(new java.lang.Object[0], -760297827, 760297828, (int) java.lang.System.currentTimeMillis());
    }

    static com.payair.hce.setTextDirection SdkCoreAlternateContactlessPaymentDataImpl() {
        return (com.payair.hce.setTextDirection) valueOf(new java.lang.Object[0], 1178521628, -1178521541, (int) java.lang.System.currentTimeMillis());
    }

    static void writeReplace() {
        valueOf(new java.lang.Object[0], -625970725, 625970807, (int) java.lang.System.currentTimeMillis());
    }

    static void valueOf() {
        valueOf(new java.lang.Object[0], 925083221, -925083206, (int) java.lang.System.currentTimeMillis());
    }

    static java.lang.String DigitizedCardProfile() {
        return (java.lang.String) valueOf(new java.lang.Object[0], 1803266523, -1803266463, (int) java.lang.System.currentTimeMillis());
    }

    static void AlternateContactlessPaymentDataJson() {
        valueOf(new java.lang.Object[0], -124818510, 124818593, (int) java.lang.System.currentTimeMillis());
    }

    private static com.payair.hce.setSystemGestureExclusionRects IccPrivateKeyCrtComponentsJson(byte[] bArr) {
        return (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{bArr}, 1164786816, -1164786744, (int) java.lang.System.currentTimeMillis());
    }

    private static com.payair.hce.setSystemGestureExclusionRects getProfileVersion(byte[] bArr) {
        return (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{bArr}, 1662817732, -1662817683, (int) java.lang.System.currentTimeMillis());
    }

    static void init$2() {
        $$g = new byte[]{5, -77, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -4};
        $$h = 52;
    }

    private static com.payair.hce.setSystemGestureExclusionRects getCiacDecline(java.lang.String str) {
        return (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{str}, 1833928639, -1833928629, (int) java.lang.System.currentTimeMillis());
    }

    static void init$1() {
        byte[] bArr = new byte[com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR];
        java.lang.System.arraycopy("v(\u0016~ðþ;º\u000bä\u0014ôó@Â\u0001ú3·\ní ã÷)Èý\u0001þ\bé\u0007\u0002þñüï#éî\ní.Å4Íü\u0000ÿ\u0002þé\u0007öý×þúñ\u0007ë\u0011ý\u001dÞë\n\u0010Úÿ\u0005ùù\u0003ðþ;º\u000bä\u0014ôó@Â\u0001ú3·\ní/Ñüùô0Óÿ\u0002ô\u0010ëÿó&×ò\u000eûò\u0003ýðþ;º\u000bä\u0014ôó@Â\u0001ú3Çí\t\u0000é\u000b\u001dÛë\t\u0002ú\u001eÐýö\u000bé\u0000\u0001\u0005ñ\u000b\u000féñ\u0000\u0007úúðþ;º\u000bä\u0014ôó@Â\u0001ú3Ãþí\u001dÚþÿ\u0007ó\u0006÷÷\u0003\u000fÞ\rï÷\u000eúë\u0007öý!áÑô\u000bï\u0000\té\u000b\u001eÐýö\u000fúë\u0004\u0003îü\u001fëä\b\u0004óö,ßé\u000f\u0013Ó\u0000ýðþ;º\u000bä\u0014ôó@Â\u0001ú3Éêü\nïú\"Û÷\u001dÚþÿ\u0007ó\u0006÷÷\u0003\u000fÞ\rï÷\u000eúë\u0007öý\u0011ñó\fîðþ;º\u000bä\u0014ôó@Â\u0001ú3Çí\t\u0000é\u000b\u001eÐý\u0004ùþîÿ\ré\u0007öý'Ðýö\u000bé\u0000\u0011ñó\f\u0012åðþ;º\u000bä\u0014ôó@Â\u0001ú3·\ní-Úïú\u0007ÿù\u0002þé\u000bðþ;º\u000bä\u0014ôó@Â\u0001ú3·\ní ëùü÷÷\u0003\u0011éõ\u0007é\u0007ï\rðþ;º\u000bä\u0014ôó@Â\u0001ú3Öëôùýù\rëõ1ßé\u000f\u0019ßî\f\u0012Øù\u0000ðþ;º\u000bä\u0014ôó@Â\u0001ú3»û\u0007ó\u001bÙ+Í\t\u0000é\u000b\u001dßé\u000fûýê\nðþ;º\u000bä\u0014ôó@Â\u0001ú3Ãþí'âü\u0014âöðþ;º\u000bä\u0014ôó@Â\u0001ú3Á\u0001ûóö\u0007ÿéðþ;º\u000bä\u0014ôó@Â\u0001ú3Ãþí-Ð\u0007û\u001eÞú÷ÿ\u001d×óJìðþ;º\u000bä\u0014ôó@Â\u0001ú3·\ní\u001cÞ\rï÷\fí\u0005õø#Ú\u0007ûðþ;º\u000bä\u0014ôó@Â\u0001ú3·\ní ãï\u0003÷\u00180ïú".getBytes("ISO-8859-1"), 0, bArr, 0, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR);
        $$d = bArr;
        $$e = 29;
    }

    static void init$0() {
        $$a = new byte[]{68, 10, 35, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -19, 13, com.google.common.base.Ascii.VT, -14, -20, com.google.common.base.Ascii.EM, -3, -7, 13, -13, -17, com.google.common.base.Ascii.NAK, 13, -2, -9, 4, 4, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, 19, 9, -38, 46, 5, -11, -34, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -22, 38, 5, -2, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5, -19, 13, com.google.common.base.Ascii.VT, -14, 16};
        $$b = 183;
    }

    static com.payair.hce.setSystemGestureExclusionRects writeReplace(java.lang.String str, boolean z) {
        return (com.payair.hce.setSystemGestureExclusionRects) valueOf(new java.lang.Object[]{str, java.lang.Boolean.valueOf(z)}, -757430979, 757431035, (int) java.lang.System.currentTimeMillis());
    }

    static com.payair.hce.HCEEventListener values() {
        return (com.payair.hce.HCEEventListener) valueOf(new java.lang.Object[0], 656433788, -656433763, (int) java.lang.System.currentTimeMillis());
    }
}
