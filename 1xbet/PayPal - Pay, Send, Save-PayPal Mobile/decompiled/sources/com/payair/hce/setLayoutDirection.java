package com.payair.hce;

/* loaded from: classes4.dex */
class setLayoutDirection {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int IccPrivateKeyCrtComponentsJson;
    private static boolean SdkCoreBusinessLogicModuleImpl;
    private static boolean getAid;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static char[] getProfileVersion;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "imei")
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "serialNumber")
    private java.lang.String DigitizedCardProfile;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "msisdn")
    private java.lang.String RecordsJson;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "nfcCapable")
    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "osName")
    private java.lang.String valueOf;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "deviceType")
    private java.lang.String values;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "deviceName")
    private java.lang.String writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = 4 - (s * 4);
        int i5 = i2 * 2;
        int i6 = 118 - (i * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i6 = i5;
            int i7 = i4;
            int i8 = 0;
            i6 += -i4;
            i4 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i3 + 1;
            i7 = i4;
            i4 = bArr[i4];
            i8 = i9;
            i6 += -i4;
            i4 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        switch ((i * 69) + (i2 * (-67)) + (((~(i | i2)) | (~(i4 | i5 | i6)) | (~(i3 | i2))) * (-68)) + ((~(i4 | i6 | i2)) * (-68)) + (((~(i5 | i6)) | i4) * 68)) {
            case 1:
                return valueOf(objArr);
            case 2:
                return DigitizedCardProfile(objArr);
            case 3:
                return writeReplace(objArr);
            case 4:
                return AlternateContactlessPaymentDataJson(objArr);
            case 5:
                return getProfileVersion(objArr);
            case 6:
                com.payair.hce.setLayoutDirection setlayoutdirection = (com.payair.hce.setLayoutDirection) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                int i7 = getCvrMaskAnd;
                getGpoResponse = (((i7 ^ 89) - (~(-(-((i7 & 89) << 1))))) - 1) % 128;
                setlayoutdirection.values = str;
                getGpoResponse = (i7 + 61) % 128;
                return null;
            case 7:
                return RecordsJson(objArr);
            default:
                return values(objArr);
        }
    }

    setLayoutDirection() {
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setLayoutDirection setlayoutdirection = (com.payair.hce.setLayoutDirection) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getCvrMaskAnd + 113;
        int i2 = i % 128;
        getGpoResponse = i2;
        if (i % 2 != 0) {
            setlayoutdirection.writeReplace = str;
            int i3 = (i2 | 49) << 1;
            int i4 = -(i2 ^ 49);
            getCvrMaskAnd = ((i3 & i4) + (i3 | i4)) % 128;
            return null;
        }
        setlayoutdirection.writeReplace = str;
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setLayoutDirection setlayoutdirection = (com.payair.hce.setLayoutDirection) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int identityHashCode = java.lang.System.identityHashCode(setlayoutdirection);
        int i = ~identityHashCode;
        int i2 = (i & (-53361)) | (53360 & identityHashCode);
        int i3 = (-53361) & identityHashCode;
        int i4 = (i3 ^ i2) | (i3 & i2);
        int i5 = ~i4;
        int i6 = ((i4 | i5) & i5) * (-301);
        int i7 = i6 & 223670776;
        int i8 = ((i6 ^ 223670776) | i7) << 1;
        int i9 = -((i6 | 223670776) & (~i7));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        int i11 = identityHashCode ^ (-2146774287);
        int i12 = identityHashCode & (-2146774287);
        int i13 = (i11 ^ i12) | (i11 & i12);
        int i14 = ~i13;
        int i15 = (i13 | i14) & i14;
        int i16 = (i | identityHashCode) & i;
        int i17 = i16 ^ (-717287543);
        int i18 = i16 & (-717287543);
        int i19 = (i18 ^ i17) | (i18 & i17);
        int i20 = ~i19;
        int i21 = (i19 | i20) & i20;
        int i22 = ((i15 ^ i21) | (i15 & i21)) * (-301);
        int i23 = ((i10 | i22) << 1) - (i10 ^ i22);
        int i24 = ~((identityHashCode & (-717287543)) | (i & 717287542) | (identityHashCode & 717287542));
        int i25 = i24 & (-2146774287);
        int i26 = (i24 | (-2146774287)) & (~i25);
        int i27 = -(-(((i26 ^ i25) | (i26 & i25)) * 301));
        int identityHashCode2 = java.lang.System.identityHashCode(setlayoutdirection);
        int i28 = ~(((-2143298449) ^ identityHashCode2) | (identityHashCode2 & (-2143298449)));
        int i29 = (i28 ^ 222306560) | (i28 & 222306560);
        int i30 = ~identityHashCode2;
        int i31 = (identityHashCode2 | i30) & i30;
        int i32 = (i31 ^ 225327375) | (i31 & 225327375);
        int i33 = i32 & 2143298448;
        int i34 = (i32 | 2143298448) & (~i33);
        int i35 = ~((i34 ^ i33) | (i34 & i33));
        int i36 = i29 ^ i35;
        int i37 = i35 & i29;
        int i38 = -(-(((i37 ^ i36) | (i37 & i36)) * 886));
        int i39 = i38 & 1629895699;
        int i40 = (i38 | 1629895699) & (~i39);
        int i41 = -(-(i39 << 1));
        int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
        int i43 = i30 ^ 2143298448;
        int i44 = i30 & 2143298448;
        int i45 = ~((i43 ^ i44) | (i43 & i44));
        int i46 = ((~i45) & 225327375) | ((-225327376) & i45);
        int i47 = i45 & 225327375;
        int i48 = -(~(-(-(((i47 ^ i46) | (i47 & i46)) * (-1772)))));
        int i49 = (i42 & i48) + (i48 | i42);
        int i50 = (~i49) + (i49 << 1);
        int i51 = (i30 ^ 225327375) | (i30 & 225327375);
        int i52 = ~i51;
        int i53 = ((i51 | i52) & i52) * 886;
        int i54 = i50 & i53;
        if (((i23 & i27) - (~(i27 | i23))) - 1 > (((i50 ^ i53) | i54) << 1) - ((i50 | i53) & (~i54))) {
            setlayoutdirection.DigitizedCardProfile = str;
            int i55 = getCvrMaskAnd;
            getGpoResponse = ((((i55 | 54) << 1) - (i55 ^ 54)) - 1) % 128;
            return null;
        }
        setlayoutdirection.DigitizedCardProfile = str;
        throw null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.setLayoutDirection setlayoutdirection = (com.payair.hce.setLayoutDirection) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = (getCvrMaskAnd + 119) % 128;
        getGpoResponse = i;
        setlayoutdirection.valueOf = str;
        int i2 = i + 91;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setLayoutDirection setlayoutdirection = (com.payair.hce.setLayoutDirection) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getGpoResponse;
        int i2 = i & 117;
        int i3 = ((i ^ 117) | i2) << 1;
        int i4 = -((i | 117) & (~i2));
        int i5 = ((i3 & i4) + (i4 | i3)) % 128;
        getCvrMaskAnd = i5;
        setlayoutdirection.AlternateContactlessPaymentDataJson = str;
        int i6 = i5 & 39;
        int i7 = (i5 ^ 39) | i6;
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        getGpoResponse = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setLayoutDirection setlayoutdirection = (com.payair.hce.setLayoutDirection) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getCvrMaskAnd;
        int i2 = ((((i | 82) << 1) - (i ^ 82)) - 1) % 128;
        getGpoResponse = i2;
        setlayoutdirection.RecordsJson = str;
        int i3 = i2 & 115;
        int i4 = ((i2 ^ 115) | i3) << 1;
        int i5 = -((~i3) & (i2 | 115));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        getCvrMaskAnd = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setLayoutDirection setlayoutdirection = (com.payair.hce.setLayoutDirection) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getGpoResponse;
        int i2 = i & 81;
        int i3 = (i ^ 81) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        getCvrMaskAnd = i4 % 128;
        if (i4 % 2 == 0) {
            setlayoutdirection.SdkCoreAlternateContactlessPaymentDataImpl = str;
            return null;
        }
        setlayoutdirection.SdkCoreAlternateContactlessPaymentDataImpl = str;
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setLayoutDirection setlayoutdirection = (com.payair.hce.setLayoutDirection) objArr[0];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(setlayoutdirection.writeReplace);
        sb.append(setlayoutdirection.values);
        sb.append(setlayoutdirection.AlternateContactlessPaymentDataJson);
        sb.append(setlayoutdirection.RecordsJson);
        sb.append(setlayoutdirection.SdkCoreAlternateContactlessPaymentDataImpl);
        sb.append(setlayoutdirection.valueOf);
        byte[] bytes = sb.toString().getBytes();
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[bytes.length]);
        wrap.put(bytes);
        int i = getCvrMaskAnd;
        int i2 = i & 89;
        int i3 = -(-((i ^ 89) | i2));
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        getGpoResponse = i4;
        getCvrMaskAnd = ((((i4 & (-6)) | ((~i4) & 5)) - (~((i4 & 5) << 1))) - 1) % 128;
        try {
            int i5 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
            int identityHashCode = java.lang.System.identityHashCode(setlayoutdirection);
            int i6 = i5 * (-445);
            int i7 = ((i6 ^ (-56515)) | (i6 & (-56515))) << 1;
            int i8 = -((i6 & 56514) | ((-56515) & (~i6)));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            int i10 = ~i5;
            int i11 = (i10 | i5) & i10;
            int i12 = i11 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            int i13 = i11 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            int i14 = (i13 ^ i12) | (i13 & i12);
            int i15 = ~i14;
            int i16 = (i14 | i15) & i15;
            int i17 = ~identityHashCode;
            int i18 = i17 & (i17 | identityHashCode);
            int i19 = ~((i18 & 127) | ((~i18) & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i18 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
            int i20 = -(-(((i16 ^ i19) | (i16 & i19)) * 446));
            int i21 = (i9 ^ i20) + ((i9 & i20) << 1);
            int i22 = ~((i10 & 127) | (i10 ^ 127));
            int i23 = i5 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            int i24 = (i5 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) & (~i23);
            int i25 = (i24 ^ i23) | (i24 & i23);
            int i26 = ~((i25 ^ identityHashCode) | (i25 & identityHashCode));
            int i27 = i22 & i26;
            int i28 = -(-((((i26 | i22) & (~i27)) | i27) * 446));
            int i29 = (i21 ^ i28) + ((i28 & i21) << 1);
            int i30 = -(-((~((i10 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i10 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))) * 446));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b(null, null, ((i30 ^ i29) - (~(-(-((i30 & i29) << 1))))) - 1, "\u008b\u0085\u0086\u008e\u008a\u008f\u0086\u008e\u0082\u0085\u0085\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            int alpha = android.graphics.Color.alpha(0);
            int i31 = alpha & 127;
            int i32 = (alpha ^ 127) | i31;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b(null, null, (i31 & i32) + (i32 | i31), "\u0086\u0087\u0091\u0082\u008b\u0085\u0091\u0090\u008b\u0086\u008e", objArr3);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, "SHA-256");
            int i33 = getGpoResponse;
            int i34 = i33 & 103;
            int i35 = ((i33 ^ 103) | i34) << 1;
            int i36 = -((~i34) & (i33 | 103));
            getCvrMaskAnd = ((i35 ^ i36) + ((i36 & i35) << 1)) % 128;
            int i37 = ((i33 & (-34)) | ((~i33) & 33)) + ((i33 & 33) << 1);
            getCvrMaskAnd = i37 % 128;
            if (i37 % 2 != 0) {
                wrap.array();
                throw null;
            }
            try {
                java.lang.Object[] objArr4 = {wrap.array()};
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b(null, null, (-16777090) - (~(-android.graphics.Color.rgb(0, 0, 0))), "\u008b\u0085\u0086\u008e\u008a\u008f\u0086\u008e\u0082\u0085\u0085\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                int i38 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int identityHashCode2 = java.lang.System.identityHashCode(setlayoutdirection);
                int i39 = i38 * 495;
                int i40 = (62610 & i39) | ((~i39) & (-62611));
                int i41 = -(-((i39 & (-62611)) << 1));
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                int i43 = -(-((i38 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) * (-988)));
                int i44 = i42 & i43;
                int i45 = (i43 ^ i42) | i44;
                int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                int i47 = ~i38;
                int i48 = (i47 | i38) & i47;
                int i49 = (i48 ^ 127) | (i48 & 127);
                int i50 = ~identityHashCode2;
                int i51 = (((~i49) & i50) | ((~i50) & i49) | (i49 & i50)) * 494;
                int i52 = i46 & i51;
                int i53 = ((i46 ^ i51) | i52) << 1;
                int i54 = -((i51 | i46) & (~i52));
                int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                int i56 = i47 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                int i57 = i47 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                int i58 = (i57 ^ i56) | (i56 & i57);
                int i59 = ~i58;
                int i60 = (i58 | i59) & i59;
                int i61 = i50 | 127;
                int i62 = ~i61;
                int i63 = (i61 | i62) & i62;
                int i64 = (i63 ^ i60) | (i63 & i60);
                int i65 = ~((i38 ^ 127) | (i38 & 127));
                int i66 = i64 ^ i65;
                int i67 = i64 & i65;
                int i68 = ((i67 ^ i66) | (i67 & i66)) * 494;
                int i69 = i55 & i68;
                int i70 = -(-((i68 ^ i55) | i69));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(null, null, ((i69 | i70) << 1) - (i70 ^ i69), "\u008b\u0085\u0086\u008e\u008a\u0092", objArr6);
                return new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex((byte[]) cls2.getMethod((java.lang.String) objArr6[0], byte[].class).invoke(invoke, objArr4)));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            } catch (java.security.NoSuchAlgorithmException unused) {
                return null;
            }
        }
    }

    private static void b(java.lang.String str, int[] iArr, int i, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = getProfileVersion;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 46, 286 - (android.os.Process.myTid() >> 22), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 46337))).getMethod("y", java.lang.Integer.TYPE);
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.text.TextUtils.getTrimmedLength(""), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (SdkCoreBusinessLogicModuleImpl) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42, 1629 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(0, 0, (short) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (getAid) {
            getumdgeneration.values = charArray.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 43, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1629, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(0, 0, (short) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = iArr.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            getumdgeneration.valueOf++;
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$0();
        getCvrMaskAnd = 0;
        getGpoResponse = 1;
        getProfileVersion = new char[]{10943, 10916, 10891, 10995, 10934, 10936, 10918, 10888, 10935, 10940, 10889, 10892, 10960, 10938, 10969, 10972, 10931, 10937};
        IccPrivateKeyCrtComponentsJson = -143185403;
        getAid = true;
        SdkCoreBusinessLogicModuleImpl = true;
    }

    final java.lang.String values() {
        return (java.lang.String) values(new java.lang.Object[]{this}, 1219225147, -1219225147, java.lang.System.identityHashCode(this));
    }

    final void getAid(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, 1826131751, -1826131749, java.lang.System.identityHashCode(this));
    }

    final void RecordsJson(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, 1867236259, -1867236255, java.lang.System.identityHashCode(this));
    }

    final void DigitizedCardProfile(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -1366007243, 1366007250, java.lang.System.identityHashCode(this));
    }

    final void values(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -923287419, 923287424, java.lang.System.identityHashCode(this));
    }

    final void valueOf(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -961881943, 961881949, java.lang.System.identityHashCode(this));
    }

    final void writeReplace(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -851881150, 851881153, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{124, -43, -124, -86};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE;
    }

    final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -392310814, 392310815, java.lang.System.identityHashCode(this));
    }
}
