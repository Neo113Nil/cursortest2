package com.payair.hce;

/* loaded from: classes10.dex */
final class setIssuerApplicationData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreCardRiskManagementDataImpl;
    private static char getAdditionalCheckTable;
    private static char[] getApplicationLifeCycleData;
    private static char getCardLayoutDescription;
    private static int getCardholderValidators;
    private static char getCvmResetTimeout;
    private static char getDualTapResetTimeout;
    private static int[] getSecurityWord;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String IccPrivateKeyCrtComponentsJson;
    private java.lang.String RecordsJson;
    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.getSessionCode SdkCoreBusinessLogicModuleImpl;
    private java.lang.String getAid;
    private com.payair.hce.getSessionCode getCiacDecline;
    private java.lang.String getCvrMaskAnd;
    private java.lang.String getGpoResponse;
    private com.payair.hce.getSessionCode getPaymentFci;
    private java.lang.String getProfileVersion;
    private java.lang.String valueOf;
    private java.lang.String values;
    private java.lang.String writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i2 + 66;
        int i5 = 4 - (i * 3);
        byte[] bArr = $$a;
        int i6 = (s * 4) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i4 = i6;
            i4 += i7;
            i5++;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i4 += i7;
            i5++;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = i4 | i;
        if ((i * 624) + (i2 * (-622)) + ((~(i5 | i3)) * 623) + (((~(i2 | (~i))) | (~i3)) * (-623)) + (((~(i | i3)) | (~i5) | (~(i3 | i4))) * 623) != 1) {
            return values(objArr);
        }
        com.payair.hce.setIssuerApplicationData setissuerapplicationdata = (com.payair.hce.setIssuerApplicationData) objArr[0];
        java.lang.StringBuilder sb = new java.lang.StringBuilder(setissuerapplicationdata.DigitizedCardProfile);
        while (sb.length() < 20) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{52, 1, 80, 0}, "\u0000", false, objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
        }
        java.lang.String values = setissuerapplicationdata.getPaymentFci.values();
        int valueOf = setissuerapplicationdata.SdkCoreBusinessLogicModuleImpl.valueOf() - 42;
        int valueOf2 = setissuerapplicationdata.getPaymentFci.valueOf();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        if (valueOf > valueOf2) {
            getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 79) % 128;
            sb2.append(values);
            while (sb2.length() < valueOf * 2) {
                getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 89) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b(new int[]{1254743954, 1441614989}, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr3);
                sb2.append(((java.lang.String) objArr3[0]).intern());
            }
            getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 31) % 128;
        } else {
            sb2.append(values.substring(0, valueOf * 2));
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b(new int[]{-543210643, -854236542}, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1, objArr4);
        sb3.append(((java.lang.String) objArr4[0]).intern());
        sb3.append((java.lang.Object) sb);
        sb3.append(setissuerapplicationdata.getGpoResponse);
        sb3.append(setissuerapplicationdata.getPaymentFci.AlternateContactlessPaymentDataJson());
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(new int[]{9, 2, 0, 2}, "\u0000\u0001", false, objArr5);
        sb3.append(((java.lang.String) objArr5[0]).intern());
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(new int[]{9, 2, 0, 2}, "\u0000\u0001", false, objArr6);
        sb3.append(((java.lang.String) objArr6[0]).intern());
        sb3.append(java.lang.Integer.toHexString(setissuerapplicationdata.getPaymentFci.valueOf()));
        com.payair.hce.getSessionCode getsessioncode = setissuerapplicationdata.getPaymentFci;
        sb3.append((java.lang.String) com.payair.hce.getSessionCode.writeReplace(new java.lang.Object[]{getsessioncode}, 668305579, -668305579, java.lang.System.identityHashCode(getsessioncode)));
        sb3.append((java.lang.Object) sb2);
        java.lang.String obj = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(obj);
        sb4.append(setissuerapplicationdata.valueOf());
        sb4.append(setissuerapplicationdata.getPaymentFci.writeReplace());
        sb4.append(setissuerapplicationdata.values());
        sb4.append(setissuerapplicationdata.IccPrivateKeyCrtComponentsJson);
        java.lang.String obj2 = sb4.toString();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        b(new int[]{-2078819357, -1177147269}, 2 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr7);
        sb5.append(((java.lang.String) objArr7[0]).intern());
        sb5.append(obj);
        sb5.append(values(obj2));
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(new int[]{53, 2, 0, 1}, "\u0000\u0001", true, objArr8);
        sb5.append(((java.lang.String) objArr8[0]).intern());
        java.lang.String obj3 = sb5.toString();
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        b(new int[]{-2003566151, 1967667268}, android.view.View.getDefaultSize(0, 0) + 4, objArr9);
        return (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr9[0]).intern(), setissuerapplicationdata.SdkCoreBusinessLogicModuleImpl.valueOf(obj3)}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
    }

    setIssuerApplicationData() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 3, 88, 2}, "\u0000\u0000\u0000", true, objArr);
        this.valueOf = ((java.lang.String) objArr[0]).intern();
        this.DigitizedCardProfile = "";
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{3, 6, 79, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000", true, objArr2);
        this.AlternateContactlessPaymentDataJson = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b(new int[]{-387469291, 294657463}, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 4, objArr3);
        this.writeReplace = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{9, 2, 0, 2}, "\u0000\u0001", false, objArr4);
        this.values = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(new int[]{11, 10, 0, 5}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001", false, objArr5);
        this.RecordsJson = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(new int[]{21, 4, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 0}, "\u0001\u0001\u0000\u0001", false, objArr6);
        this.SdkCoreAlternateContactlessPaymentDataImpl = ((java.lang.String) objArr6[0]).intern();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(new int[]{25, 4, 62, 1}, null, true, objArr7);
        this.IccPrivateKeyCrtComponentsJson = ((java.lang.String) objArr7[0]).intern();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(new int[]{29, 13, 0, 0}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", true, objArr8);
        this.getCvrMaskAnd = ((java.lang.String) objArr8[0]).intern();
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i2) ^ ((c2 << 4) + ((char) (getCardLayoutDescription ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getAdditionalCheckTable)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 1335 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((short) 0, 0, 44, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (getCvmResetTimeout ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getDualTapResetTimeout)};
                    int i4 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(61 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.widget.ExpandableListView.getPackedPositionChild(0L) + 1336, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((short) 0, 0, 44, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 54, 3542 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        int i2 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getSecurityWord;
        int i3 = 1;
        int i4 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 47;
                $10 = i6 % 128;
                if (i6 % i2 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[i4] = java.lang.Integer.valueOf(iArr3[i5]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.MotionEvent.axisFromString(""), 29 - android.view.KeyEvent.normalizeMetaState(i4), (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("z", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                        }
                        iArr4[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr3[i5])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 29 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                    }
                    iArr4[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                }
                i5++;
                i4 = 0;
                i2 = 2;
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getSecurityWord;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                $10 = ($11 + 29) % 128;
                java.lang.Object[] objArr4 = new java.lang.Object[i3];
                objArr4[0] = java.lang.Integer.valueOf(iArr6[i7]);
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj3 == null) {
                    iArr2 = iArr6;
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.text.TextUtils.getCapsMode("", 0, 0) + 29, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                i7++;
                $11 = ($10 + 111) % 128;
                iArr6 = iArr2;
                i3 = 1;
            }
            iArr6 = iArr7;
        }
        char c = 0;
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[c] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i8 = 0;
            for (int i9 = 16; i8 < i9; i9 = 16) {
                int i10 = $11 + 53;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                    java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 5089 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue;
                    i8 += 24;
                } else {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                    java.lang.Object[] objArr6 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj5 == null) {
                        obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5087, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj5);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue2;
                    i8++;
                }
            }
            int i11 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i11;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i12 = istransitsupported.DigitizedCardProfile;
            int i13 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr7 = {istransitsupported, istransitsupported};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj6 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.KeyEvent.normalizeMetaState(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 2924, (char) (3037 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                d((short) 0, 0, 0, objArr8);
                obj6 = cls.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj6);
            }
            ((java.lang.reflect.Method) obj6).invoke(null, objArr7);
            $10 = ($11 + 71) % 128;
            c = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static java.lang.String values(java.lang.String str) {
        try {
            byte[] decodeHex = org.apache.commons.codec.binary.Hex.decodeHex(str.toCharArray());
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                b(new int[]{-1616540724, -2044910558, 838359359, 1595249536}, android.view.View.resolveSize(0, 0) + 5, objArr);
                try {
                    java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern()};
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c("吺ુ繷䱙⎾訌룿᭒ꬱ緔￤뻛\uf06e쐗ᙥ䬩\ue094씄\uf5e4㡊㺳ꭰ堌ᾎ楧軹⚾\udf9f", 27 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    c("큦╹◢କꛦ㘹ȏ섳൜₱\uf15b漣", 12 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
                    try {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c("吺ુ繷䱙⎾訌룿᭒ꬱ緔￤뻛\uf06e쐗ᙥ䬩\ue094씄\uf5e4㡊㺳ꭰ堌ᾎ楧軹⚾\udf9f", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 27, objArr5);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        c("侚ᩂ\udbcaᚏ㗱䥰", 6 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr6);
                        cls2.getMethod((java.lang.String) objArr6[0], byte[].class).invoke(invoke, decodeHex);
                        try {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            c("吺ુ繷䱙⎾訌룿᭒ꬱ緔￤뻛\uf06e쐗ᙥ䬩\ue094씄\uf5e4㡊㺳ꭰ堌ᾎ楧軹⚾\udf9f", 28 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr7);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            c("\ue3a9\ue452큦╹\uf57b恥", android.graphics.Color.rgb(0, 0, 0) + 16777222, objArr8);
                            return new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex((byte[]) cls3.getMethod((java.lang.String) objArr8[0], null).invoke(invoke, null)));
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
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            } catch (java.security.NoSuchAlgorithmException e) {
                e.printStackTrace();
                return null;
            }
        } catch (org.apache.commons.codec.DecoderException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final com.payair.hce.setIssuerApplicationData values(com.payair.hce.getSessionCode getsessioncode) {
        int i = SdkCoreCardRiskManagementDataImpl + 41;
        int i2 = i % 128;
        getCardholderValidators = i2;
        if (i % 2 != 0) {
            this.SdkCoreBusinessLogicModuleImpl = getsessioncode;
            SdkCoreCardRiskManagementDataImpl = (i2 + 93) % 128;
            return this;
        }
        this.SdkCoreBusinessLogicModuleImpl = getsessioncode;
        throw null;
    }

    public final com.payair.hce.setIssuerApplicationData DigitizedCardProfile(com.payair.hce.getSessionCode getsessioncode) {
        int i = getCardholderValidators + 21;
        SdkCoreCardRiskManagementDataImpl = i % 128;
        if (i % 2 == 0) {
            this.getCiacDecline = getsessioncode;
            this.getAid = getsessioncode.SdkCoreAlternateContactlessPaymentDataImpl();
            return this;
        }
        this.getCiacDecline = getsessioncode;
        this.getAid = getsessioncode.SdkCoreAlternateContactlessPaymentDataImpl();
        throw null;
    }

    public final com.payair.hce.setIssuerApplicationData AlternateContactlessPaymentDataJson(com.payair.hce.getSessionCode getsessioncode) {
        int i = (SdkCoreCardRiskManagementDataImpl + 117) % 128;
        getCardholderValidators = i;
        this.getPaymentFci = getsessioncode;
        int i2 = i + 81;
        SdkCoreCardRiskManagementDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setIssuerApplicationData setissuerapplicationdata = (com.payair.hce.setIssuerApplicationData) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getCardholderValidators;
        SdkCoreCardRiskManagementDataImpl = (i + 95) % 128;
        setissuerapplicationdata.DigitizedCardProfile = str;
        int i2 = i + 75;
        SdkCoreCardRiskManagementDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            return setissuerapplicationdata;
        }
        throw null;
    }

    public final com.payair.hce.setIssuerApplicationData AlternateContactlessPaymentDataJson(java.lang.String str) {
        this.AlternateContactlessPaymentDataJson = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str.substring(2, 4));
        sb.append(str.substring(0, 2));
        java.lang.String obj = sb.toString();
        this.getGpoResponse = obj;
        this.getProfileVersion = obj;
        int i = getCardholderValidators + 97;
        SdkCoreCardRiskManagementDataImpl = i % 128;
        if (i % 2 == 0) {
            return this;
        }
        throw null;
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        int length;
        char[] cArr;
        java.lang.String str2 = str;
        int i2 = $11 + 5;
        $10 = i2 % 128;
        byte[] bArr = str2;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = getApplicationLifeCycleData;
        if (cArr2 != null) {
            int i9 = $10 + 25;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i10 = 0;
            while (i10 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i5];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr2[i10]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, android.view.KeyEvent.normalizeMetaState(i3) + 2807, (char) android.text.TextUtils.indexOf("", ""));
                        java.lang.Object[] objArr3 = new java.lang.Object[i5];
                        d((short) 0, 0, 43, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i10++;
                    i3 = 0;
                    i5 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i6];
        java.lang.System.arraycopy(cArr2, i4, cArr3, 0, i6);
        if (bArr2 != null) {
            char[] cArr4 = new char[i6];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i6) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    $11 = ($10 + 83) % 128;
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2836 - android.view.View.resolveSizeAndState(0, 0, 0), (char) android.graphics.Color.argb(0, 0, 0, 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((short) 0, 0, 41, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i12 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2880 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        d((short) 0, 0, 45, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr4[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            $11 = ($10 + 125) % 128;
            char[] cArr5 = new char[i6];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i13 = i6 - i8;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i13, i8);
            java.lang.System.arraycopy(cArr5, i8, cArr3, 0, i13);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i6];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                cArr6[getaccounttype.writeReplace] = cArr3[(i6 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            $11 = ($10 + 61) % 128;
            int i14 = 0;
            while (true) {
                getaccounttype.writeReplace = i14;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                i14 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public final com.payair.hce.setIssuerApplicationData writeReplace(java.lang.String str) {
        int i = (getCardholderValidators + 7) % 128;
        SdkCoreCardRiskManagementDataImpl = i;
        this.values = str;
        int i2 = i + 51;
        getCardholderValidators = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.setIssuerApplicationData DigitizedCardProfile(java.lang.String str) {
        int i = SdkCoreCardRiskManagementDataImpl;
        getCardholderValidators = (i + 49) % 128;
        this.IccPrivateKeyCrtComponentsJson = str;
        int i2 = i + 25;
        getCardholderValidators = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final java.lang.String valueOf(int i) {
        getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 115) % 128;
        if (i == 1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{42, 2, 187, 0}, "\u0000\u0001", false, objArr);
            return (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), values()}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        }
        if (i != 2) {
            return null;
        }
        java.lang.String valueOf = valueOf();
        if (!valueOf.equals("")) {
            getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 97) % 128;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{44, 4, 87, 0}, "\u0001\u0000\u0000\u0001", true, objArr2);
            valueOf = (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr2[0]).intern(), valueOf}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(new int[]{48, 4, 17, 4}, "\u0000\u0001\u0000\u0001", false, objArr3);
        sb.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr3[0]).intern(), this.getPaymentFci.writeReplace()}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        sb.append(valueOf);
        sb.append((java.lang.String) valueOf(new java.lang.Object[]{this}, -860265060, 860265061, java.lang.System.identityHashCode(this)));
        java.lang.String obj = sb.toString();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{42, 2, 187, 0}, "\u0000\u0001", false, objArr4);
        return (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr4[0]).intern(), obj}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
    }

    private java.lang.String DigitizedCardProfile() {
        getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 27) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(new int[]{894282897, -1002838587}, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2, objArr);
        java.lang.String str = (java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), com.payair.hce.setCdol1RelatedDataLength.writeReplace(this.DigitizedCardProfile, this.AlternateContactlessPaymentDataJson, this.valueOf, this.getCvrMaskAnd)}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis());
        int i = getCardholderValidators + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        SdkCoreCardRiskManagementDataImpl = i % 128;
        if (i % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v15 int, still in use, count: 2, list:
          (r0v15 int) from 0x0018: ARITH (r0v15 int) + (-107 int) A[WRAPPED]
          (r0v15 int) from 0x0038: PHI (r0v9 int) = (r0v4 int), (r0v15 int) binds: [B:11:0x002b, B:4:0x001a] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private java.lang.String valueOf() {
        /*
            r4 = this;
            int r0 = com.payair.hce.setIssuerApplicationData.getCardholderValidators
            int r0 = r0 + 77
            int r1 = r0 % 128
            com.payair.hce.setIssuerApplicationData.SdkCoreCardRiskManagementDataImpl = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L1d
            com.payair.hce.getSessionCode r0 = r4.SdkCoreBusinessLogicModuleImpl
            int r0 = r0.valueOf()
            com.payair.hce.getSessionCode r1 = r4.getPaymentFci
            int r1 = r1.valueOf()
            int r2 = r0 + (-107)
            if (r1 > r2) goto L38
            goto L2d
        L1d:
            com.payair.hce.getSessionCode r0 = r4.SdkCoreBusinessLogicModuleImpl
            int r0 = r0.valueOf()
            com.payair.hce.getSessionCode r1 = r4.getPaymentFci
            int r1 = r1.valueOf()
            int r2 = r0 + (-42)
            if (r1 > r2) goto L38
        L2d:
            int r0 = com.payair.hce.setIssuerApplicationData.SdkCoreCardRiskManagementDataImpl
            int r0 = r0 + 107
            int r0 = r0 % 128
            com.payair.hce.setIssuerApplicationData.getCardholderValidators = r0
            java.lang.String r0 = ""
            return r0
        L38:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.payair.hce.getSessionCode r2 = r4.getPaymentFci
            java.lang.String r2 = r2.values()
            int r2 = r2.length()
            com.payair.hce.getSessionCode r3 = r4.getPaymentFci
            java.lang.String r3 = r3.values()
            int r0 = r0 + (-42)
            int r0 = r0 * 2
            java.lang.String r0 = r3.substring(r0, r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.payair.hce.setIssuerApplicationData.valueOf():java.lang.String");
    }

    private java.lang.String values() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(new int[]{657014643, -157567442}, 2 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        sb.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr[0]).intern(), com.payair.hce.setCdol1RelatedDataLength.AlternateContactlessPaymentDataJson(this.DigitizedCardProfile)}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b(new int[]{-1369987846, -589832557}, 5 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
        sb.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr2[0]).intern(), this.AlternateContactlessPaymentDataJson}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b(new int[]{-76183589, 612388029, 1393985555, -1986879313, -872927419, -1186008886}, 12 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b(new int[]{2010745223, -2134727260}, 4 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
        sb.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr4[0]).intern(), this.writeReplace}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(new int[]{55, 4, 117, 1}, null, true, objArr5);
        sb.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr5[0]).intern(), this.values}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b(new int[]{-2142778019, -314847965, -1721409830, -373446842, 17487475, 1564005436, -671683113, -60022697, -1892518109, 1885365010, -693757844, 1890362118, -1708291788, -1041088283, -2029603384, 1774988114, -432675799, -1641182584, -1045836723, -335724726, -1181098409, -587247091, -432675799, -1641182584, -1603755113, 1341137480, 1449065413, -1739679126, -401255109, -450875823, -1986784887, 423555399, 658700062, 1733714112, -365069261, -1133442094, 1984938486, -553303794}, 75 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr6);
        sb.append(((java.lang.String) objArr6[0]).intern());
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(new int[]{59, 28, 0, 26}, "\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000", true, objArr7);
        sb.append(((java.lang.String) objArr7[0]).intern());
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(new int[]{87, 28, 0, 0}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001", true, objArr8);
        sb.append(((java.lang.String) objArr8[0]).intern());
        sb.append(this.RecordsJson);
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        a(new int[]{115, 10, 0, 7}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000", true, objArr9);
        sb.append(((java.lang.String) objArr9[0]).intern());
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        b(new int[]{601234053, 567755253, -895402587, -1134758022, -1446149000, -1940283152, 1820189473, -256530096}, 16 - android.view.KeyEvent.getDeadChar(0, 0), objArr10);
        sb.append(((java.lang.String) objArr10[0]).intern());
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a(new int[]{125, 16, 0, 5}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000", false, objArr11);
        sb.append(((java.lang.String) objArr11[0]).intern());
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b(new int[]{-637342833, 1528801361, -895402587, -1134758022, -1446149000, -1940283152, 1820189473, -256530096}, android.text.TextUtils.indexOf("", "", 0) + 16, objArr12);
        sb.append(((java.lang.String) objArr12[0]).intern());
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        b(new int[]{-373492786, -503018959}, 4 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr13);
        sb.append((java.lang.String) com.payair.hce.CardholderValidators.DigitizedCardProfile(new java.lang.Object[]{((java.lang.String) objArr13[0]).intern(), this.SdkCoreAlternateContactlessPaymentDataImpl}, 558484294, -558484293, (int) java.lang.System.currentTimeMillis()));
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        b(new int[]{311717018, 165463329, -106934094, 1945825971}, android.view.View.resolveSizeAndState(0, 0, 0) + 8, objArr14);
        sb.append(((java.lang.String) objArr14[0]).intern());
        sb.append(DigitizedCardProfile());
        java.lang.String obj = sb.toString();
        getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 9) % 128;
        return obj;
    }

    static void AlternateContactlessPaymentDataJson() {
        getCvmResetTimeout = (char) 46547;
        getDualTapResetTimeout = (char) 14148;
        getCardLayoutDescription = (char) 13871;
        getAdditionalCheckTable = (char) 49382;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreCardRiskManagementDataImpl = 0;
        getCardholderValidators = 1;
        AlternateContactlessPaymentDataJson();
        getApplicationLifeCycleData = new char[]{16779, 16708, 16706, 16782, 16719, 16719, 16718, 16817, 16718, 16854, 16894, 16855, 16882, 16776, 16885, 16894, 16890, 16881, 16885, 16893, 16893, 16787, 16753, 16653, 16652, 16801, 16800, 16824, 16825, 16854, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16823, 16672, 16777, 16707, 16730, 16728, 16875, 16798, 16768, 16776, 16773, 16879, 16780, 16740, 16743, 16742, 16757, 16878, 16882, 16886, 16890, 16887, 16885, 16883, 16881, 16888, 16892, 16893, 16891, 16882, 16881, 16889, 16892, 16892, 16889, 16883, 16886, 16894, 16891, 16880, 16887, 16884, 16880, 16891, 16895, 16855, 16895, 16885, 16885, 16892, 16895, 16895, 16895, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16894, 16887, 16887, 16884, 16880, 16854, 16895, 16895, 16890, 16890, 16885, 16881, 16891, 16895, 16894, 16854, 16894, 16894, 16894, 16894, 16890, 16881, 16885, 16884, 16884, 16892, 16892, 16894, 16894, 16894, 16894};
        getSecurityWord = new int[]{457544193, -1026014564, 1244934977, 1918614038, 2108152666, 890903734, 809600827, 1511896684, 1449542359, -539360880, 1258321405, -106994370, -136390002, 1716474294, -232241424, -1319280300, 544147902, 952129577};
    }

    private java.lang.String writeReplace() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, -860265060, 860265061, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.EM, -31, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.DC4};
        $$b = 22;
    }

    public final com.payair.hce.setIssuerApplicationData valueOf(java.lang.String str) {
        return (com.payair.hce.setIssuerApplicationData) valueOf(new java.lang.Object[]{this, str}, 1158783977, -1158783977, java.lang.System.identityHashCode(this));
    }
}
