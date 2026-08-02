package com.payair.hce;

/* loaded from: classes4.dex */
public final class getYear implements javax.net.ssl.X509TrustManager {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static boolean RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static byte[] SdkCoreBusinessLogicModuleImpl;
    private static int getAid;
    private static int getCiacDecline;
    private static short[] getCvrMaskAnd;
    private static int getGpoResponse;
    private static int getProfileVersion;
    private static boolean values;
    private static char[] writeReplace;
    private final javax.net.ssl.X509TrustManager DigitizedCardProfile;
    private final java.security.KeyStore valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = s2 + 65;
        int i4 = 39 - (s * 2);
        byte[] bArr = $$a;
        int i5 = b + 1;
        char[] cArr = new char[i5];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i5;
            i2 = 0;
            int i8 = (i4 + (-i7)) - 2;
            i = i2;
            int i9 = i6;
            i3 = i8;
            i4 = i9;
            int i10 = i4 + 1;
            i2 = i + 1;
            cArr[i] = (char) i3;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = bArr[i10];
            int i11 = i3;
            i6 = i10;
            i4 = i11;
            int i82 = (i4 + (-i7)) - 2;
            i = i2;
            int i92 = i6;
            i3 = i82;
            i4 = i92;
            int i102 = i4 + 1;
            i2 = i + 1;
            cArr[i] = (char) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            int i1022 = i4 + 1;
            i2 = i + 1;
            cArr[i] = (char) i3;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$d;
        int i4 = i2 * 4;
        int i5 = (i * 4) + 4;
        int i6 = 118 - s;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i5++;
            i6 += i8;
            i3 = i9;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i5];
            i5++;
            i6 += i8;
            i3 = i9;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public getYear(java.security.KeyStore keyStore) throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
        this.valueOf = keyStore;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.view.View.resolveSizeAndState(0, 0, 0) + 127, null, null, "\u0084\u0083\u0082\u0081", objArr);
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(((java.lang.String) objArr[0]).intern());
        trustManagerFactory.init(keyStore);
        this.DigitizedCardProfile = (javax.net.ssl.X509TrustManager) trustManagerFactory.getTrustManagers()[0];
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
        java.security.cert.X509Certificate x509Certificate;
        java.security.cert.X509Certificate x509Certificate2;
        try {
            this.DigitizedCardProfile.checkServerTrusted(x509CertificateArr, str);
        } catch (java.security.cert.CertificateException e) {
            e.printStackTrace();
            try {
                java.security.cert.X509Certificate[] x509CertificateArr2 = new java.security.cert.X509Certificate[x509CertificateArr.length];
                java.util.List asList = java.util.Arrays.asList(x509CertificateArr);
                int length = x509CertificateArr.length - 1;
                java.util.Iterator it = asList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        x509Certificate = null;
                        break;
                    }
                    getCiacDecline = (getGpoResponse + 81) % 128;
                    x509Certificate = (java.security.cert.X509Certificate) it.next();
                    java.util.Iterator it2 = asList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            x509Certificate2 = null;
                            break;
                        }
                        int i = getCiacDecline + 21;
                        getGpoResponse = i % 128;
                        if (i % 2 == 0) {
                            ((java.security.cert.X509Certificate) it2.next()).getSubjectDN().equals(x509Certificate.getIssuerDN());
                            throw new java.lang.NullPointerException();
                        }
                        x509Certificate2 = (java.security.cert.X509Certificate) it2.next();
                        if (x509Certificate2.getSubjectDN().equals(x509Certificate.getIssuerDN())) {
                            break;
                        }
                    }
                    if (x509Certificate2 == null || x509Certificate2.equals(x509Certificate)) {
                        break;
                    }
                }
                x509CertificateArr2[length] = x509Certificate;
                while (true) {
                    java.util.Iterator it3 = asList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            x509Certificate = null;
                            break;
                        }
                        java.security.cert.X509Certificate x509Certificate3 = (java.security.cert.X509Certificate) it3.next();
                        if (x509Certificate3.getIssuerDN().equals(x509Certificate.getSubjectDN()) && !x509Certificate3.equals(x509Certificate)) {
                            x509Certificate = x509Certificate3;
                            break;
                        }
                    }
                    if (x509Certificate == null || length <= 0) {
                        break;
                    }
                    length--;
                    x509CertificateArr2[length] = x509Certificate;
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 127, null, null, "\u0081\u0087\u0086\u0085", objArr);
                java.security.cert.CertPathValidator certPathValidator = java.security.cert.CertPathValidator.getInstance(((java.lang.String) objArr[0]).intern());
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(126 - android.view.MotionEvent.axisFromString(""), null, null, "\u0084\u0083\u0082\u0081", objArr2);
                try {
                    java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b(android.text.TextUtils.getOffsetAfter("", 0) - 156756509, android.graphics.Color.green(0) - 15354769, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 63, (short) ((-66) - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), (byte) ((-54) - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), objArr4);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((-156756512) - android.view.KeyEvent.normalizeMetaState(0), (-15354731) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-62) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) (27 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) (93 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr5);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, objArr3);
                    try {
                        java.lang.Object[] objArr6 = {java.util.Arrays.asList(x509CertificateArr2)};
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((-156756509) - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 15354770, (-62) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) ((android.view.KeyEvent.getMaxKeyCode() >> 16) - 66), (byte) ((-54) - android.view.View.resolveSizeAndState(0, 0, 0)), objArr7);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b((-156756512) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-15354722) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 62, (short) (android.view.View.resolveSize(0, 0) - 40), (byte) (113 - android.text.TextUtils.indexOf("", "")), objArr8);
                        java.security.cert.CertPath certPath = (java.security.cert.CertPath) cls2.getMethod((java.lang.String) objArr8[0], java.util.List.class).invoke(invoke, objArr6);
                        java.security.cert.PKIXParameters pKIXParameters = new java.security.cert.PKIXParameters(this.valueOf);
                        pKIXParameters.setRevocationEnabled(false);
                        certPathValidator.validate(certPath, pKIXParameters);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
                throw e;
            }
        }
    }

    private static void c(java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 93) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $10 = ($11 + 121) % 128;
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(getProfileVersion)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 43, 2072 - android.view.MotionEvent.axisFromString(""), (char) (60037 - android.graphics.Color.alpha(0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    e((short) 3, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 3543 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
                $11 = ($10 + 115) % 128;
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.graphics.Color.alpha(0), 3543 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        int i2 = $11 + 45;
        $10 = i2 % 128;
        byte[] bArr = str3;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            $10 = ($11 + 1) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = writeReplace;
        float f = 0.0f;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 46, (android.util.TypedValue.complexToFraction(0, f, f) > f ? 1 : (android.util.TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr4[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    $11 = ($10 + 29) % 128;
                    f = 0.0f;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (RecordsJson) {
            $11 = ($10 + 31) % 128;
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 44, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1629, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    e((short) 0, 0, 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!values) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr6[getumdgeneration.valueOf] = (char) (cArr3[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            java.lang.String str4 = new java.lang.String(cArr6);
            $10 = ($11 + 15) % 128;
            objArr[0] = str4;
            return;
        }
        getumdgeneration.values = cArr2.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 43, (-16775587) - android.graphics.Color.rgb(0, 0, 0), (char) android.view.KeyEvent.normalizeMetaState(0));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                e((short) 0, 0, 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, short s, byte b, java.lang.Object[] objArr) {
        long j;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            long j2 = 0;
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 27, 30 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            int i4 = intValue == -1 ? 1 : 0;
            if (i4 != 0) {
                byte[] bArr = SdkCoreBusinessLogicModuleImpl;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i5 = 0;
                    while (i5 < length) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.graphics.Color.blue(0) + 5088, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)) - 1))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i5++;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = SdkCoreBusinessLogicModuleImpl;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(getAid)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 27, android.text.TextUtils.getCapsMode("", 0, 0) + 29, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (IccPrivateKeyCrtComponentsJson ^ (-4897270311952305750L))));
                } else {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (getCvrMaskAnd[i2 + ((int) (getAid ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (IccPrivateKeyCrtComponentsJson ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (getAid ^ j)) + i4;
                        java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl), sb};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj4 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.combineMeasuredStates(0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2363, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            e((short) 14, 0, 0, objArr6);
                            obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr4 = SdkCoreBusinessLogicModuleImpl;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i6 = 0; i6 < length2; i6++) {
                                bArr5[i6] = (byte) (bArr4[i6] ^ (-4897270311952305750L));
                            }
                            bArr4 = bArr5;
                        }
                        boolean z = bArr4 != null;
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z) {
                                byte[] bArr6 = SdkCoreBusinessLogicModuleImpl;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r5] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = getCvrMaskAnd;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r5] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                    objArr[0] = sb.toString();
                }
            }
            j = -4897270311952305750L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final java.security.cert.X509Certificate[] getAcceptedIssuers() {
        int i = getGpoResponse;
        int i2 = i + 125;
        getCiacDecline = i2 % 128;
        java.security.cert.X509Certificate[] x509CertificateArr = new java.security.cert.X509Certificate[i2 % 2 != 0 ? 1 : 0];
        int i3 = i + 81;
        getCiacDecline = i3 % 128;
        if (i3 % 2 == 0) {
            return x509CertificateArr;
        }
        throw null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
        int i = getGpoResponse + 85;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            this.DigitizedCardProfile.checkClientTrusted(x509CertificateArr, str);
        } else {
            this.DigitizedCardProfile.checkClientTrusted(x509CertificateArr, str);
            throw new java.lang.ArithmeticException();
        }
    }

    static void writeReplace() {
        getAid = 535722555;
        IccPrivateKeyCrtComponentsJson = 520368535;
        SdkCoreAlternateContactlessPaymentDataImpl = 374594349;
        SdkCoreBusinessLogicModuleImpl = new byte[]{66, -91, -95, -39, -73, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -71, -57, -41, -79, -36, -40, -95, -45, 43, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -93, Byte.MIN_VALUE, -117, com.google.common.base.Ascii.CAN, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -93, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -21, 107, -69, -87, -43, -45, -80, -36, -48, 123, -29, -55, -117, -43, 100, -17, 36, -100, 60, -24, -108, -12, -60, -110, 35, 121, 7, 32, 34, Byte.MAX_VALUE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 14, -47, 125, 2, 32, 108, 14, 4, 10, com.google.common.base.Ascii.GS};
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getCiacDecline = 0;
        getGpoResponse = 1;
        writeReplace();
        writeReplace = new char[]{11026, 11057, 11066, 11061, 11034, 11015, 11013, 11067, 11235, 11249, 11233, 11263, 11262, 11035, 11039, 11256, 11232, 11259, 11253, 11257, 11248, 11258, 11234, 11243, 11245, 11247, 11246, 11064, 11238, 11260, 11237, 11031, 11241, 11050, 11239, 11076, 11025, 11038, 11008, 11065, 11058, 11236, 11060, 11022, 11033, 11023, 11032, 11251, 11021};
        AlternateContactlessPaymentDataJson = -143185078;
        values = true;
        RecordsJson = true;
        getProfileVersion = 1889207155;
    }

    static void init$1() {
        $$d = new byte[]{76, 91, 9, -2};
        $$e = 97;
    }

    /* JADX WARN: Code restructure failed: missing block: B:373:0x1580, code lost:
    
        r3 = new java.lang.Object[]{new int[1], new int[1], null, r1, new int[1]};
        r1 = (java.lang.String) java.lang.Class.forName(r5).getField(r43).get(r39);
        ((int[]) r3[0])[0] = r51;
        ((int[]) r3[1])[0] = r51 ^ 20;
        r1 = ~r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x15ba, code lost:
    
        r4 = new java.lang.Object[]{java.lang.Integer.valueOf(r53), 16, java.lang.Integer.valueOf(((((~(747014697 | r51)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1848093960) + (((-274732119) | r1) * (-216))) + (((~(r1 | 747014697)) | 283121247) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
        r7 = r41;
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x15f3, code lost:
    
        if (r1 != null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x15f5, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) android.view.View.resolveSizeAndState(0, 0, 0));
        r2 = com.payair.hce.getYear.$$a;
        r5 = r2[52];
        r2 = r2[41];
        r10 = new java.lang.Object[1];
        d(r5, r2, (byte) (r2 | 34), r10);
        r1 = r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x1650, code lost:
    
        ((int[]) r3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r4)).intValue();
        r5 = 0;
        r12 = r51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x1878 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x1879  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x1d98 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x1d99  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x173e A[Catch: Exception -> 0x1755, all -> 0x1789, IOException -> 0x178d, TryCatch #31 {, blocks: (B:305:0x10cd, B:307:0x10e8, B:310:0x10fa, B:319:0x1172, B:324:0x11d1, B:337:0x1226, B:355:0x13ef, B:357:0x13fd, B:359:0x1490, B:361:0x14b2, B:363:0x14e7, B:365:0x151b, B:367:0x1555, B:369:0x1577, B:394:0x1755, B:395:0x1788, B:420:0x16df, B:421:0x16e2, B:478:0x16f1, B:480:0x16fe, B:481:0x16ff, B:487:0x1714, B:489:0x171a, B:490:0x171b, B:502:0x1724, B:504:0x172a, B:505:0x172b, B:517:0x1738, B:519:0x173e, B:520:0x173f), top: B:304:0x10cd }] */
    /* JADX WARN: Removed duplicated region for block: B:520:0x173f A[Catch: Exception -> 0x1755, all -> 0x1789, IOException -> 0x178d, TRY_LEAVE, TryCatch #31 {, blocks: (B:305:0x10cd, B:307:0x10e8, B:310:0x10fa, B:319:0x1172, B:324:0x11d1, B:337:0x1226, B:355:0x13ef, B:357:0x13fd, B:359:0x1490, B:361:0x14b2, B:363:0x14e7, B:365:0x151b, B:367:0x1555, B:369:0x1577, B:394:0x1755, B:395:0x1788, B:420:0x16df, B:421:0x16e2, B:478:0x16f1, B:480:0x16fe, B:481:0x16ff, B:487:0x1714, B:489:0x171a, B:490:0x171b, B:502:0x1724, B:504:0x172a, B:505:0x172b, B:517:0x1738, B:519:0x173e, B:520:0x173f), top: B:304:0x10cd }] */
    /* JADX WARN: Type inference failed for: r13v102 */
    /* JADX WARN: Type inference failed for: r13v104 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v65, types: [char] */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v81 */
    /* JADX WARN: Type inference failed for: r13v82 */
    /* JADX WARN: Type inference failed for: r34v11 */
    /* JADX WARN: Type inference failed for: r34v12 */
    /* JADX WARN: Type inference failed for: r34v13 */
    /* JADX WARN: Type inference failed for: r34v14 */
    /* JADX WARN: Type inference failed for: r34v15 */
    /* JADX WARN: Type inference failed for: r34v16 */
    /* JADX WARN: Type inference failed for: r34v17 */
    /* JADX WARN: Type inference failed for: r34v19 */
    /* JADX WARN: Type inference failed for: r34v21 */
    /* JADX WARN: Type inference failed for: r34v23 */
    /* JADX WARN: Type inference failed for: r34v24 */
    /* JADX WARN: Type inference failed for: r34v25 */
    /* JADX WARN: Type inference failed for: r34v30 */
    /* JADX WARN: Type inference failed for: r34v31 */
    /* JADX WARN: Type inference failed for: r36v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v424 */
    /* JADX WARN: Type inference failed for: r4v425 */
    /* JADX WARN: Type inference failed for: r4v426 */
    /* JADX WARN: Type inference failed for: r4v427 */
    /* JADX WARN: Type inference failed for: r4v428 */
    /* JADX WARN: Type inference failed for: r4v429 */
    /* JADX WARN: Type inference failed for: r4v430 */
    /* JADX WARN: Type inference failed for: r4v441 */
    /* JADX WARN: Type inference failed for: r4v442 */
    /* JADX WARN: Type inference failed for: r4v477, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v478 */
    /* JADX WARN: Type inference failed for: r4v480 */
    /* JADX WARN: Type inference failed for: r6v332, types: [long] */
    /* JADX WARN: Type inference failed for: r6v333 */
    /* JADX WARN: Type inference failed for: r6v334 */
    /* JADX WARN: Type inference failed for: r6v336, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v338, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v219, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v220 */
    /* JADX WARN: Type inference failed for: r7v221 */
    /* JADX WARN: Type inference failed for: r7v226, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v230, types: [java.lang.Class] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2, int i3) {
        int i4;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Object[] objArr;
        char c;
        int i5;
        long j;
        java.lang.Object[] objArr2;
        int i6;
        java.lang.Object[] objArr3;
        int i7;
        java.lang.Object[] objArr4;
        char c2;
        java.lang.Object[] objArr5;
        char c3;
        int i8;
        ?? r13;
        java.lang.String intern;
        java.lang.Runtime runtime;
        int size;
        java.lang.Object[] objArr6;
        java.lang.Process exec;
        java.lang.Throwable th;
        java.lang.Throwable cause;
        java.lang.Object newInstance;
        java.lang.Throwable th2;
        java.lang.InterruptedException interruptedException;
        java.lang.Throwable th3;
        ?? nanoTime;
        ?? r34;
        java.lang.Integer num3;
        java.lang.Object[] objArr7;
        int i9;
        java.lang.Object[] objArr8;
        int i10;
        java.lang.Integer num4;
        java.lang.Object[] objArr9;
        int i11;
        int i12 = i;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        c("\u0011\ufffe\u0000\u0006\t\r\r\uffdeￋ\n\rￋ\u0011\u000b\u0002\u0011\u000b\f\u0000ￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\f\u0003\u000b￦\u000b\f\u0006", android.view.View.MeasureSpec.getSize(0) + 117, 27 - android.graphics.Color.argb(0, 0, 0, 0), true, android.view.KeyEvent.keyCodeFromString("") + 34, objArr10);
        java.lang.String intern2 = ((java.lang.String) objArr10[0]).intern();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        c("\ufffe\u0011\ufffe\u0001\u000f\u0006￡", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 117, 3 - android.view.MotionEvent.axisFromString(""), true, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 8, objArr11);
        java.lang.String intern3 = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        c("\ufff5ￏ\b\u000f\u0002\rￏ\u0002\u0017\u0002\u000b\u0005\u0002\u0006\u0013\t", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 112, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, true, 16 - android.graphics.Color.blue(0), objArr12);
        java.lang.String intern4 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Integer num5 = -604620973;
        try {
            if (context == null) {
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(127 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), null, null, "\u0092\u0091\u0090\u0087\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088", objArr13);
                java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).intern()};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.View.resolveSize(0, 0), 3161 - android.view.KeyEvent.normalizeMetaState(0), (char) (33099 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)));
                    byte[] bArr = $$a;
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    d(bArr[52], (short) 35, bArr[41], objArr15);
                    obj = cls.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr14)).longValue();
                long j2 = ~longValue;
                long j3 = i12;
                long j4 = ~j3;
                long j5 = ~(j2 | j3);
                long j6 = (longValue * 246) + 72964784 + (((~(j2 | (-299036))) | (~(j2 | j4))) * (-245)) + ((-245) * j5) + (((-299036) | j5) * 245) + 907769774;
                int i13 = (int) (j6 >> 32);
                int i14 = ~i12;
                if (((i13 & (((((2119630591 | i12) * (-381)) - 245736758) + (((~(2080423077 | i14)) | 1515641439) * 381)) - 125403904)) | (((int) j6) & ((((~(1646890284 | i14)) * 979) - 641870958) + ((209663874 | i12) * (-979)) + (((~(1646890284 | i12)) | (~(209663874 | i14))) * 979)))) != 0) {
                    objArr7 = new java.lang.Object[]{new int[]{i12}, new int[]{i12 ^ 50}, null, null, new int[1]};
                    java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-41993283) | i12)) | (~(988142662 | i12))) * 69) + 1274378652 + (((~((-983682119) | i12)) | 941688836 | (~(46453826 | i12))) * (-69)) + 307777536)};
                    num3 = -1347122530;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2713, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                        byte[] bArr2 = $$a;
                        byte b = bArr2[52];
                        short s = bArr2[41];
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        d(b, s, (byte) (s | 34), objArr17);
                        obj2 = cls2.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                    }
                    i9 = 0;
                    ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr16)).intValue();
                } else {
                    num3 = -1347122530;
                    objArr7 = new java.lang.Object[]{new int[]{i12}, new int[]{i12}, null, null, new int[1]};
                    java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-279106836) | i12)) | (-751029110)) * (-948)) + 324418976 + ((~((-8569106) | i14)) * (-948)) + 1228268772)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2714 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                        byte[] bArr3 = $$a;
                        byte b2 = bArr3[52];
                        short s2 = bArr3[41];
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        d(b2, s2, (byte) (s2 | 34), objArr19);
                        obj3 = cls3.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                    }
                    i9 = 0;
                    ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr18)).intValue();
                }
                if (((int[]) objArr7[1])[i9] != i12) {
                    return objArr7;
                }
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                a(127 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), null, null, "\u008b\u009a\u0099\u0096\u008c\u0098\u008b\u0090\u0092\u0097\u0096\u0095\u0088\u0094\u008b\u008d\u008c\u0093\u008c\u0088", objArr20);
                java.lang.Object[] objArr21 = {((java.lang.String) objArr20[i9]).intern()};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(i9, i9) + 36, 3161 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (33098 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                    byte[] bArr4 = $$a;
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    d(bArr4[52], (short) 35, bArr4[41], objArr22);
                    obj4 = cls4.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj4);
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr21)).longValue();
                long j7 = ~(j3 | (-28008669));
                long j8 = ~longValue2;
                long j9 = ((-139) * longValue2) + 3949222188L + (((~(longValue2 | (-28008669))) | j7) * (-280)) + ((j7 | (~(j8 | j3))) * 140) + (((~(longValue2 | (-28008669) | j4)) | (~((-28008669) | j8 | j3)) | (~(j8 | j4 | 28008668))) * 140) + 879462070;
                if (((((int) j9) & (((((-576899640) | i12) * (-50)) - 150771749) + (((~(862440311 | i12)) | (~((-2113542) | i14))) * 50) + (((~((-576899640) | i14)) | (~(860326770 | i14)) | 2113541) * 50))) | (((int) (j9 >> 32)) & ((((((~((-1476991788) | i14)) | 1342704425) | (~(1515036459 | i12))) * 717) - 1995912542) + (((~((-1476991788) | i12)) | (~(1515036459 | i14)) | 1342704425) * 717)))) != 0) {
                    objArr8 = new java.lang.Object[]{new int[]{i12}, new int[]{i12 ^ 60}, null, null, new int[1]};
                    int i15 = ~(485018545 | i14);
                    java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-485018546) | i12)) | (~(545117399 | i14)) | i15) * (-516)) + 83898352 + (((~((-6865042) | i12)) | (~((-538252359) | i14))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((i15 | 538252358) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                    if (obj5 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 2713 - android.text.TextUtils.indexOf("", "", 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                        byte[] bArr5 = $$a;
                        byte b3 = bArr5[52];
                        short s3 = bArr5[41];
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        d(b3, s3, (byte) (s3 | 34), objArr24);
                        obj5 = cls5.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj5);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr23)).intValue();
                    i10 = 0;
                    ((int[]) objArr8[4])[0] = intValue;
                } else {
                    objArr8 = new java.lang.Object[]{new int[]{i12}, new int[]{i12}, null, null, new int[1]};
                    java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(522405451 | i14)) | (-526605952)) * 529) + 511204786 + (((~(522405451 | i12)) | (-507730494)) * 529))};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                    if (obj6 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2712, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                        byte[] bArr6 = $$a;
                        byte b4 = bArr6[52];
                        short s4 = bArr6[41];
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        d(b4, s4, (byte) (s4 | 34), objArr26);
                        obj6 = cls6.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj6);
                    }
                    i10 = 0;
                    ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr25)).intValue();
                }
                if (((int[]) objArr8[1])[i10] != i12) {
                    return objArr8;
                }
                float length = android.graphics.PointF.length(0.0f, 0.0f);
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i10);
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                c("\u0002ￏ\u0019\u0010\u0003\bￏ\u000e\u0010\u0004\uffd0\u0002\u0015\u0002\u0005\uffd0\u0002\u0015\u0002\u0005\uffd0\u0002\u0015\u0002\u0005\u0000\u0014\u0007\u0017\uffd0\u0005\n\u0010\u0013\u0005\u000f", (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)) + 113, 22 - (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)), true, 35 - lastIndexOf, objArr27);
                java.lang.Object[] objArr28 = {((java.lang.String) objArr27[0]).intern()};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                if (obj7 == null) {
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36, 3161 - (android.os.Process.myTid() >> 22), (char) (33099 - android.text.TextUtils.getOffsetBefore("", 0)));
                    byte b5 = $$a[54];
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    d(b5, (short) (b5 | 40), r9[8], objArr29);
                    obj7 = cls7.getMethod((java.lang.String) objArr29[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj7);
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, objArr28)).longValue();
                java.lang.Integer num6 = num3;
                long j10 = (((-520) * longValue3) - 52934120442L) + (((~(j4 | longValue3)) | (-101406361)) * (-1042)) + ((longValue3 | j3) * 521) + (((~(j3 | 101406360)) | (~((~longValue3) | 101406360)) | (~((-101406361) | j4 | longValue3))) * 521) + 1096841264;
                if (((((int) (j10 >> 32)) & (((((~((-286261321) | i14)) | (~(895299322 | i12))) * 988) - 976666306) + (((~((-828188409) | i12)) | 541927088 | (~(895299322 | i14))) * 988))) | (((int) j10) & ((((~((-640450731) | i14)) * 52) - 859895015) + (((~((-641568944) | i14)) | (~(795657466 | i14)) | 1118213) * (-52)) + (((~(641568943 | i14)) | 155206736) * 52)))) != 0) {
                    objArr9 = new java.lang.Object[]{new int[]{i12}, new int[]{i12 ^ 80}, null, null, new int[1]};
                    java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-918769167) | i14)) | 809503748 | (~(111366778 | i14))) * (-397)) + 195896024 + ((811605108 | i12) * 397))};
                    num4 = num6;
                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                    if (obj8 == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                        byte[] bArr7 = $$a;
                        byte b6 = bArr7[52];
                        short s5 = bArr7[41];
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        d(b6, s5, (byte) (s5 | 34), objArr31);
                        obj8 = cls8.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj8);
                    }
                    i11 = 0;
                    ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr30)).intValue();
                } else {
                    num4 = num6;
                    objArr9 = new java.lang.Object[]{new int[]{i12}, new int[]{i12}, null, null, new int[1]};
                    int i16 = ~(541541244 | i14);
                    java.lang.Object[] objArr32 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(488594700 | i14)) | 541065840) * (-1188)) - 46830960) + (((~((-488594701) | i12)) | 541065840 | i16) * 594) + ((i16 | (~((-488594701) | i14)) | 488119296) * 594))};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                    if (obj9 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                        byte[] bArr8 = $$a;
                        byte b7 = bArr8[52];
                        short s6 = bArr8[41];
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        d(b7, s6, (byte) (s6 | 34), objArr33);
                        obj9 = cls9.getMethod((java.lang.String) objArr33[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj9);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr32)).intValue();
                    i11 = 0;
                    ((int[]) objArr9[4])[0] = intValue2;
                }
                if (((int[]) objArr9[1])[i11] != i12) {
                    return objArr9;
                }
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                a(android.text.TextUtils.indexOf("", "", i11, i11) + 127, null, null, "\u0094\u0095\u0088\u008b\u009a\u0099\u0096\u008c\u009c\u009d\u0099\u008a\u009b\u009c\u009b\u009f\u0092\u009e\u009b\u0090\u0099\u009c\u008b\u0090\u0092\u009d\u009a\u009c\u0094\u0092\u009a\u0088\u0099\u008d\u0099\u009b\u0088\u0099\u008d\u0099\u009b\u0088", objArr34);
                java.lang.Object[] objArr35 = {((java.lang.String) objArr34[i11]).intern()};
                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                if (obj10 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 36, 3161 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 33099));
                    byte b8 = $$a[54];
                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                    d(b8, (short) (b8 | 40), r7[8], objArr36);
                    obj10 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj10);
                }
                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr35)).longValue();
                long j11 = (((-271) * longValue4) - 140909088684L) + (((~(j4 | 516150507 | (~longValue4))) | (~((-516150508) | longValue4 | j3))) * (-272)) + (((~(516150507 | longValue4)) | (~(j3 | 516150507))) * (-272)) + (((~(j3 | (-516150508))) | longValue4) * 272) + 1511585411;
                int i17 = (int) (j11 >> 32);
                int i18 = ~(1056192541 | i14);
                if (((i17 & (((~((-687871017) | i14)) * (-783)) + 1505381728 + (((~((-696631103) | i14)) | (-2133857514)) * 783))) | (((int) j11) & (((((((~((-1801548345) | i14)) | 710946840) | (~((-1056192542) | i14))) | (~(2146794045 | i12))) * (-84)) - 1905160647) + (((~((-1056192542) | i12)) | 1801548344 | i18) * (-84)) + ((i18 | (-2146794046)) * 84)))) != 0) {
                    java.lang.Object[] objArr37 = {new int[]{i12}, new int[]{i12 ^ 90}, null, null, new int[1]};
                    java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-636850493) | i14)) | 545558576) | r1) * (-713)) - 1401649672) + ((~((-301993537) | i12)) * 1426) + ((~((-393285453) | i14)) * 713))};
                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                    if (obj11 == null) {
                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", ""), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2713, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte[] bArr9 = $$a;
                        byte b9 = bArr9[52];
                        short s7 = bArr9[41];
                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                        d(b9, s7, (byte) (s7 | 34), objArr39);
                        obj11 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj11);
                    }
                    ((int[]) objArr37[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr38)).intValue();
                    return objArr37;
                }
                java.lang.Object[] objArr40 = {new int[]{i12}, new int[]{i12}, null, null, new int[1]};
                java.lang.Object[] objArr41 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((419695618 | r1) * (-712)) - 282385672) + (((~(i12 | 996007879)) | (~(i14 | (-419695619)))) * (-712)) + (((~(576312261 | i14)) | (-453823684)) * 712))};
                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                if (obj12 == null) {
                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getMode(0), android.text.TextUtils.indexOf("", "", 0, 0) + 2713, (char) android.view.View.MeasureSpec.getSize(0));
                    byte[] bArr10 = $$a;
                    byte b10 = bArr10[52];
                    short s8 = bArr10[41];
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    d(b10, s8, (byte) (s8 | 34), objArr42);
                    obj12 = cls12.getMethod((java.lang.String) objArr42[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj12);
                }
                ((int[]) objArr40[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr41)).intValue();
                return objArr40;
            }
            java.lang.Integer num7 = -1347122530;
            try {
                java.lang.Object[] objArr43 = new java.lang.Object[1];
                c("\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff", android.view.View.MeasureSpec.getSize(0) + 119, 21 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), false, (android.os.Process.myPid() >> 22) + 23, objArr43);
                java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr43[0]).intern());
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                c("\u0004\u0002\n\ufffe￫\u0002\u0004\ufffe\b\u0000\ufffe￭\u0011\u0002", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 117, 1 - android.text.TextUtils.getCapsMode("", 0, 0), true, android.text.TextUtils.indexOf("", "", 0, 0) + 14, objArr44);
                java.lang.String str = (java.lang.String) cls13.getMethod(((java.lang.String) objArr44[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                c("\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff", 119 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.graphics.Color.blue(0) + 20, false, android.view.View.MeasureSpec.getSize(0) + 23, objArr45);
                java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr45[0]).intern());
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                int alpha = 121 - android.graphics.Color.alpha(0);
                c("\u0007\b\u0002\r\ufffa￼\u0002\u0005\t\tￚ\r\ufffe\u0000\b\uffff\u0007￢", alpha, (android.os.Process.myPid() >> 22) + 14, true, 18 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr46);
                java.lang.Object invoke = cls14.getMethod(((java.lang.String) objArr46[0]).intern(), null).invoke(context, null);
                int indexOf = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke)).indexOf(str);
                if (indexOf > 0) {
                    java.lang.String str2 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                    if (str2.length() >= 16) {
                        int i19 = 0;
                        alpha = alpha;
                        while (i19 <= str2.length() - 16) {
                            java.lang.Object[] objArr47 = {str2.substring(i19, i19 + 16), 931995};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj13 == null) {
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.Process.myPid() >> 22), 2595 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                byte b11 = $$a[41];
                                r34 = str2;
                                num2 = num5;
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                d(b11, (short) (b11 | 653), b11, objArr48);
                                obj13 = cls15.getMethod((java.lang.String) objArr48[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj13);
                            } else {
                                r34 = str2;
                                num2 = num5;
                            }
                            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr47)).longValue();
                            long j12 = i12;
                            java.lang.Integer num8 = num7;
                            long j13 = longValue5 | j12;
                            int i20 = indexOf;
                            long j14 = ((-929) * longValue5) + 396225256752L + (((~j13) | 853933742) * (-465)) + (((~(853933742 | j12)) | longValue5) * 930) + ((853933742 | j13) * 465) + 2111034267;
                            int i21 = ~i12;
                            int i22 = ~((-1131671712) | i12);
                            if (((((int) j14) & ((((((~(1973259145 | i21)) | (~((-536032736) | i12))) * (-370)) - 635053777) + ((((~((-536032736) | i21)) | (~(1973259145 | i12))) | 1611434496) * (-370))) - 769690624)) | (((int) (j14 >> 32)) & ((((((~(1131671711 | i12)) | (-1744042432)) | (~(1726069173 | i12))) * (-880)) - 818885110) + (((~(1131671711 | i21)) | (-1726069174) | i22) * (-880)) + (i22 * 880)))) == -725904754) {
                                objArr = new java.lang.Object[]{new int[1], new int[1], null, r5, new int[1]};
                                java.lang.String str3 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                                ((int[]) objArr[0])[0] = i12;
                                ((int[]) objArr[1])[0] = i12 ^ 20;
                                java.lang.Object[] objArr49 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((-17172071) | i21) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 2052508856) + (((~(909678993 | i21)) | (-823566183)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                java.lang.Integer num9 = num8;
                                java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num9);
                                if (obj14 == null) {
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 50, 2713 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                    byte[] bArr11 = $$a;
                                    byte b12 = bArr11[52];
                                    short s9 = bArr11[41];
                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                    d(b12, s9, (byte) (s9 | 34), objArr50);
                                    obj14 = cls16.getMethod((java.lang.String) objArr50[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num9, obj14);
                                }
                                ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr49)).intValue();
                                i4 = i12;
                                c = 0;
                                num = num9;
                                if (((int[]) objArr[1])[c] != i4) {
                                    return objArr;
                                }
                                int[] iArr = new int[1];
                                int[] iArr2 = new int[1];
                                iArr[c] = i4;
                                iArr2[c] = i4;
                                java.lang.Object[] objArr51 = {iArr, iArr2, null, null, new int[1]};
                                int i23 = ~i4;
                                java.lang.Object[] objArr52 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-357447426) | i4)) | (~(1029603207 | i23))) * (-406)) + 1891270660 + ((~((-356914689) | i23)) * (-406)) + (((~((-672688520) | i4)) | (~(357447425 | i23))) * 406))};
                                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                if (obj15 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), android.widget.ExpandableListView.getPackedPositionChild(0L) + 2714, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                    byte[] bArr12 = $$a;
                                    byte b13 = bArr12[52];
                                    short s10 = bArr12[41];
                                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                                    d(b13, s10, (byte) (s10 | 34), objArr53);
                                    obj15 = cls17.getMethod((java.lang.String) objArr53[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj15);
                                }
                                ((int[]) objArr51[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr52)).intValue();
                                if (((int[]) objArr51[1])[0] != i4) {
                                    return objArr51;
                                }
                                if ((i2 & 1) == 0) {
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, null, null, "\u0093\u009a\u009f\u009d\u0092\u0096\u0098\u008b\u009a\u009f\u0095\u008b\u009b", objArr54);
                                    try {
                                        java.lang.Object[] objArr55 = {((java.lang.String) objArr54[0]).intern()};
                                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                                        c("\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff", 119 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.graphics.ImageFormat.getBitsPerPixel(0) + 21, false, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.CAN, objArr56);
                                        java.lang.Class<?> cls18 = java.lang.Class.forName(((java.lang.String) objArr56[0]).intern());
                                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                                        c("￼\u000b￪\u0010\n\u000b￼\u0004￪￼\t\r\u0000\ufffa￼\ufffe", 123 - (android.os.Process.myTid() >> 22), '?' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), false, android.text.TextUtils.indexOf("", "") + 16, objArr57);
                                        java.lang.Object invoke2 = cls18.getMethod(((java.lang.String) objArr57[0]).intern(), java.lang.String.class).invoke(context, objArr55);
                                        if (invoke2 != null) {
                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                            a(127 - android.graphics.Color.red(0), null, null, "\u009e\u008b\u0089\u0099\u0090\u0099\u00ad\u0093\u009a\u009f\u009d\u0092\u0085\u008b\u009a\u009f\u0095\u008b¬\u009c\u0090\u009f\u0094\u009b\u0099\u009c\u0096\u0096\u0099\u009c\u009b\u009f\u0092\u009e\u009b\u0090\u0099", objArr58);
                                            java.lang.Class<?> cls19 = java.lang.Class.forName(((java.lang.String) objArr58[0]).intern());
                                            java.lang.Object[] objArr59 = new java.lang.Object[1];
                                            c("\u000fￜ\ufffe\u000f\u0004\u0011\u0000ￜ\uffff\b\u0004\t\u000e\u0002\u0000", android.view.KeyEvent.keyCodeFromString("") + 119, 13 - android.graphics.Color.green(0), false, 15 - (android.os.Process.myTid() >> 22), objArr59);
                                            java.util.List list = (java.util.List) cls19.getMethod(((java.lang.String) objArr59[0]).intern(), null).invoke(invoke2, null);
                                            if (list != null) {
                                                for (java.lang.Object obj16 : list) {
                                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                    a((android.os.Process.myPid() >> 22) + 127, null, null, "\u008b\u0094\u0099¯\u008d\u0090\u008b\u0090\u0092\u0096\u0094\u0092®\u009c\u008d\u0090\u008b\u008d\u0090\u0092\u009a\u009c\u009b\u009f\u0092\u009e\u009b\u0090\u0099", objArr60);
                                                    java.lang.Class<?> cls20 = java.lang.Class.forName(((java.lang.String) objArr60[0]).intern());
                                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                    c("\u0004\u0002\n\ufffe￫\u0002\u0004\ufffe\b\u0000\ufffe￭\u0011\u0002", 117 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.view.View.combineMeasuredStates(0, 0) + 1, true, 14 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr61);
                                                    java.lang.String str4 = (java.lang.String) cls20.getMethod(((java.lang.String) objArr61[0]).intern(), null).invoke(obj16, null);
                                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                    a(128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, null, "\u009e\u008b\u0089\u0099\u0090\u0099\u00ad\u0093\u009a\u009f\u009d\u0092\u0085\u008b\u009a\u009f\u0095\u008b¬\u009c\u0090\u009f\u0094\u009b\u0099\u009c\u0096\u0096\u0099\u009c\u009b\u009f\u0092\u009e\u009b\u0090\u0099", objArr62);
                                                    java.lang.Class<?> cls21 = java.lang.Class.forName(((java.lang.String) objArr62[0]).intern());
                                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                    a(128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, null, "\u0096\u0096±\u009e\u008b\u0090°\u008e\u008b\u009d\u009f\u0091\u0092\u009e\u0085\u008c\u009f", objArr63);
                                                    if (((java.lang.Boolean) cls21.getMethod(((java.lang.String) objArr63[0]).intern(), java.lang.String.class).invoke(invoke2, str4)).booleanValue()) {
                                                        if (str4.length() >= 20) {
                                                            int i24 = 0;
                                                            for (int i25 = 20; i24 <= str4.length() - i25; i25 = 20) {
                                                                java.lang.Object[] objArr64 = {str4.substring(i24, i24 + 20), 931995};
                                                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                if (obj17 == null) {
                                                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2595, (char) (android.os.Process.myPid() >> 22));
                                                                    byte b14 = $$a[41];
                                                                    java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                                    d(b14, (short) (b14 | 653), b14, objArr65);
                                                                    obj17 = cls22.getMethod((java.lang.String) objArr65[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj17);
                                                                }
                                                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr64)).longValue();
                                                                long j15 = i4;
                                                                java.lang.Object obj18 = invoke2;
                                                                long j16 = ~((~longValue6) | 1012297352);
                                                                java.lang.String str5 = str4;
                                                                long j17 = ((522 * longValue6) - 526394623040L) + ((~(longValue6 | (-1012297353) | j15)) * 521) + ((-1042) * j16) + ((j16 | (~((-1012297353) | (~j15) | longValue6))) * 521) + 244803172;
                                                                int i26 = ~(61768796 | i23);
                                                                if (((((int) j17) & ((((~((-61768797) | i4)) | (~((-1498995207) | i23)) | i26) * (-516)) + 758114785 + (((~((-44434521) | i4)) | (~(1543429726 | i23))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((i26 | (-1543429727)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))) | (((int) (j17 >> 32)) & ((((-1265970227) | i4) * (-859)) + 2126923258 + (((~((-1265970227) | i23)) | (~(1609924146 | i4))) * 859) + (((~(1591770658 | i23)) | android.R.plurals.duration_years_shortest) * 859)))) == 1245577864) {
                                                                    objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 70}, null, null, new int[1]};
                                                                    java.lang.Object[] objArr66 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-801714230) | i23)) | 227094545 | (~((-228421716) | i23))) * (-1136)) + 2031799880 + (((~((-801714230) | i4)) | (~((-228421716) | i4)) | (~(803041399 | i23))) * (-568)) + (((~(801714229 | i23)) | (~(228421715 | i23)) | (~((-227094546) | i4))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                                                                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                                                    if (obj19 == null) {
                                                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, android.widget.ExpandableListView.getPackedPositionChild(0L) + 2714, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                        byte[] bArr13 = $$a;
                                                                        byte b15 = bArr13[52];
                                                                        short s11 = bArr13[41];
                                                                        java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                                        d(b15, s11, (byte) (s11 | 34), objArr67);
                                                                        obj19 = cls23.getMethod((java.lang.String) objArr67[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj19);
                                                                    }
                                                                    c3 = 0;
                                                                    ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr66)).intValue();
                                                                    if (((int[]) objArr5[1])[c3] == i4) {
                                                                        return objArr5;
                                                                    }
                                                                    i5 = 0;
                                                                } else {
                                                                    i24++;
                                                                    invoke2 = obj18;
                                                                    str4 = str5;
                                                                }
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                    invoke2 = invoke2;
                                                }
                                            }
                                        }
                                        objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                        java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-185827424) | i4)) | 844308521) * (-366)) + 881896806 + (((~((-151027799) | i4)) | 809508896) * 366))};
                                        java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                        if (obj20 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 50, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2713, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                            byte[] bArr14 = $$a;
                                            byte b16 = bArr14[52];
                                            short s12 = bArr14[41];
                                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                                            d(b16, s12, (byte) (s12 | 34), objArr69);
                                            obj20 = cls24.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj20);
                                        }
                                        c3 = 0;
                                        ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr68)).intValue();
                                        if (((int[]) objArr5[1])[c3] == i4) {
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        java.lang.Throwable cause2 = th4.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th4;
                                    }
                                } else {
                                    i5 = 0;
                                }
                                java.lang.Object[] objArr70 = new java.lang.Object[1];
                                a(android.view.Gravity.getAbsoluteGravity(i5, i5) + 127, null, null, "\u0092\u0091\u0090\u0087\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088", objArr70);
                                java.lang.Object[] objArr71 = {((java.lang.String) objArr70[i5]).intern()};
                                java.lang.Integer num10 = num2;
                                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                                if (obj21 == null) {
                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.argb(i5, i5, i5, i5), 3161 - android.graphics.drawable.Drawable.resolveOpacity(i5, i5), (char) (33099 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                                    byte[] bArr15 = $$a;
                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                    d(bArr15[52], (short) 35, bArr15[41], objArr72);
                                    obj21 = cls25.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, obj21);
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr71)).longValue();
                                long j18 = i4;
                                long j19 = ~j18;
                                long j20 = (434 * longValue7) + 118211606496L + ((~(j19 | 273637977 | longValue7)) * 433) + (((~((~longValue7) | j18)) | 273637977) * (-433)) + (((~(273637977 | j18)) | (~(longValue7 | (-273637978)))) * 433) + 1181108716;
                                if (((((int) (j20 >> 32)) & (((((~((-23947822) | i4)) | 1431404880) * 398) - 953209100) + (((~((-23947822) | i23)) | 1431404880) * 398))) | (((int) j20) & ((((-1180033649) | i23) * (-757)) + 51891378 + ((~((-1073840193) | i4)) * 1514) + (((~(257192761 | i23)) | (-1331032954) | (~((-106193457) | i4))) * 757)))) != 0) {
                                    objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 50}, null, null, new int[1]};
                                    java.lang.Object[] objArr73 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((140579192 | i4) * (-859)) + 1903506304 + (((~(140579192 | i23)) | (~((-65809) | i4))) * 859) + (((~((-889556753) | i23)) | 889490944) * 859))};
                                    java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj22 == null) {
                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49, 2713 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                        byte[] bArr16 = $$a;
                                        byte b17 = bArr16[52];
                                        short s13 = bArr16[41];
                                        j = j18;
                                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                                        d(b17, s13, (byte) (s13 | 34), objArr74);
                                        obj22 = cls26.getMethod((java.lang.String) objArr74[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj22);
                                    } else {
                                        j = j18;
                                    }
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr73)).intValue();
                                    i6 = 0;
                                } else {
                                    j = j18;
                                    objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                    java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((r4 | 6144) * (-814)) - 2140726404) + (((~(989693044 | i4)) | (~((-40442901) | i23)) | 949256288) * 407) + (((~((-989693045) | i4)) | 949256288 | (~(40442900 | i4))) * 407))};
                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj23 == null) {
                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 50, 2713 - (android.os.Process.myPid() >> 22), (char) (android.os.Process.myTid() >> 22));
                                        byte[] bArr17 = $$a;
                                        byte b18 = bArr17[52];
                                        short s14 = bArr17[41];
                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                        d(b18, s14, (byte) (s14 | 34), objArr76);
                                        obj23 = cls27.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj23);
                                    }
                                    i6 = 0;
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr75)).intValue();
                                }
                                if (((int[]) objArr2[1])[i6] != i4) {
                                    return objArr2;
                                }
                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                a((android.os.Process.myTid() >> 22) + 127, null, null, "\u008b\u009a\u0099\u0096\u008c\u0098\u008b\u0090\u0092\u0097\u0096\u0095\u0088\u0094\u008b\u008d\u008c\u0093\u008c\u0088", objArr77);
                                java.lang.Object[] objArr78 = {((java.lang.String) objArr77[i6]).intern()};
                                java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                                if (obj24 == null) {
                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.util.TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 3161 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (33100 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                    byte[] bArr18 = $$a;
                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                    d(bArr18[52], (short) 35, bArr18[41], objArr79);
                                    obj24 = cls28.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, obj24);
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr78)).longValue();
                                long j21 = ~longValue8;
                                long j22 = ~(j19 | (-231773083));
                                long j23 = (713 * longValue8) + 164790662013L + (((~(j21 | (-231773083))) | j22) * (-712)) + (((~(j21 | j19 | (-231773083))) | (~(longValue8 | (-231773083) | j))) * (-712)) + ((j22 | j21) * 712) + 1139243821;
                                if (((((int) j23) & (((((~((-20666035) | i23)) | (~(1457892444 | i23))) * (-867)) - 1972008908) + (((~((-20666035) | i4)) | 18502306 | (~(1457892444 | i4))) * (-1734)) + (((~((-18502307) | i23)) | (~((-2163729) | i4)) | (~(1476394750 | i4))) * 867))) | (((int) (j23 >> 32)) & (((((~(2080423536 | i4)) | (-2119499765)) * 104) - 2005432166) + ((~((-738241121) | i23)) * (-104)) + (((-777317349) | i4) * 104)))) != 0) {
                                    objArr3 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 60}, null, null, new int[1]};
                                    java.lang.Object[] objArr80 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((-826711927) | i23) * 1444) + 301326584) + ((((~(924223711 | i4)) | (-928423936)) | (~(105912233 | i4))) * (-1444))) - 114443572)};
                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj25 == null) {
                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                        byte[] bArr19 = $$a;
                                        byte b19 = bArr19[52];
                                        short s15 = bArr19[41];
                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                        d(b19, s15, (byte) (s15 | 34), objArr81);
                                        obj25 = cls29.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj25);
                                    }
                                    i7 = 0;
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr80)).intValue();
                                } else {
                                    objArr3 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                    int i27 = ~(25354669 | i4);
                                    java.lang.Object[] objArr82 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-25354670) | i4)) | 25337993 | (~((-1004781276) | i4))) * (-880)) + 1311667208 + (((~((-25354670) | i23)) | 1004781275 | i27) * (-880)) + (i27 * 880))};
                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj26 == null) {
                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 2713 - android.graphics.Color.red(0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                        byte[] bArr20 = $$a;
                                        byte b20 = bArr20[52];
                                        short s16 = bArr20[41];
                                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                                        d(b20, s16, (byte) (s16 | 34), objArr83);
                                        obj26 = cls30.getMethod((java.lang.String) objArr83[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj26);
                                    }
                                    int intValue3 = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr82)).intValue();
                                    i7 = 0;
                                    ((int[]) objArr3[4])[0] = intValue3;
                                }
                                if (((int[]) objArr3[1])[i7] != i4) {
                                    return objArr3;
                                }
                                int green = android.graphics.Color.green(i7);
                                long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                                int resolveSize = android.view.View.resolveSize(i7, i7);
                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                c("\u0002ￏ\u0019\u0010\u0003\bￏ\u000e\u0010\u0004\uffd0\u0002\u0015\u0002\u0005\uffd0\u0002\u0015\u0002\u0005\uffd0\u0002\u0015\u0002\u0005\u0000\u0014\u0007\u0017\uffd0\u0005\n\u0010\u0013\u0005\u000f", 113 - green, (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)) + 20, true, 36 - resolveSize, objArr84);
                                java.lang.Object[] objArr85 = {((java.lang.String) objArr84[0]).intern()};
                                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                if (obj27 == null) {
                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-16774055) - android.graphics.Color.rgb(0, 0, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 33100));
                                    byte b21 = $$a[54];
                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                    d(b21, (short) (b21 | 40), r5[8], objArr86);
                                    obj27 = cls31.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj27);
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr85)).longValue();
                                long j24 = ((561 * longValue9) - 15672525362L) + ((~(j19 | 28036718)) * (-560)) + ((~((~longValue9) | 28036718 | j)) * (-560)) + (((~((-28036719) | longValue9)) | (~(longValue9 | j19))) * 560) + 967398185;
                                if (((((int) (j24 >> 32)) & (((~((-33554473) | i23)) * (-783)) + 1187279904 + (((~((-1376398463) | i23)) | 1481342422) * 783))) | (((int) j24) & ((((2080333431 | i4) * (-627)) - 635053948) + (((~((-334825576) | i4)) | (-1772051986)) * (-627)) + (((~(334825575 | i23)) | (~((-1772051986) | i4))) * 627)))) != 0) {
                                    objArr4 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 80}, null, null, new int[1]};
                                    java.lang.Object[] objArr87 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-19736797) | i23)) | 1049872741) * (-328)) + 352441040 + ((1049872741 | i4) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(19736796 | i4)) | 1049805089 | (~((-19669145) | i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))};
                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj28 == null) {
                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49, 2713 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                        byte[] bArr21 = $$a;
                                        byte b22 = bArr21[52];
                                        short s17 = bArr21[41];
                                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                                        d(b22, s17, (byte) (s17 | 34), objArr88);
                                        obj28 = cls32.getMethod((java.lang.String) objArr88[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj28);
                                    }
                                    c2 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr87)).intValue();
                                } else {
                                    objArr4 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                    java.lang.Object[] objArr89 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-347431086) | i23)) | 682704859) * (-90)) + 141613168 + (((~((-347431086) | i4)) | (-1018527744)) * (-45)) + (((~((-682704860) | i4)) | (-347431086) | (~(682704859 | i23))) * 45))};
                                    java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj29 == null) {
                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.os.Process.myTid() >> 22));
                                        byte[] bArr22 = $$a;
                                        byte b23 = bArr22[52];
                                        short s18 = bArr22[41];
                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                        d(b23, s18, (byte) (s18 | 34), objArr90);
                                        obj29 = cls33.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj29);
                                    }
                                    c2 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr89)).intValue();
                                }
                                if (((int[]) objArr4[1])[c2] != i4) {
                                    return objArr4;
                                }
                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, null, null, "\u0094\u0095\u0088\u008b\u009a\u0099\u0096\u008c\u009c\u009d\u0099\u008a\u009b\u009c\u009b\u009f\u0092\u009e\u009b\u0090\u0099\u009c\u008b\u0090\u0092\u009d\u009a\u009c\u0094\u0092\u009a\u0088\u0099\u008d\u0099\u009b\u0088\u0099\u008d\u0099\u009b\u0088", objArr91);
                                java.lang.Object[] objArr92 = {((java.lang.String) objArr91[c2]).intern()};
                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                if (obj30 == null) {
                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 36, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3161, (char) (33099 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                                    byte b24 = $$a[54];
                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                    d(b24, (short) (b24 | 40), r5[8], objArr93);
                                    obj30 = cls34.getMethod((java.lang.String) objArr93[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj30);
                                }
                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr92)).longValue();
                                long j25 = ~longValue10;
                                long j26 = (-438844343) | j19;
                                long j27 = (((-885) * longValue10) - 778071020139L) + (((~(j25 | 438844342)) | (~(j25 | j)) | (~(j26 | longValue10))) * 886) + (((~(j19 | longValue10)) | (-438844343)) * (-1772)) + ((~j26) * 886) + 1434279246;
                                int i28 = ~((-2034128817) | i23);
                                int i29 = ~(578353699 | i4);
                                if (((((int) j27) & (((2015580109 | i29) * (-220)) + 427651043 + ((i29 | 1476593100) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 748147534)) | (((int) (j27 >> 32)) & ((((((-2076071862) | i28) | (~(2034128816 | i4))) * (-338)) - 195393698) + ((i28 | (~((-41943046) | i4))) * 338)))) != 0) {
                                    java.lang.Object[] objArr94 = {new int[]{i4}, new int[]{i4 ^ 90}, null, null, new int[1]};
                                    int i30 = ~((-945193377) | i4);
                                    java.lang.Object[] objArr95 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i23 | (-945193377))) | 944144640) * (-245)) + 1338186400 + (i30 * (-245)) + ((i30 | 84942568) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))};
                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    if (obj31 == null) {
                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getTrimmedLength(""), android.view.View.resolveSize(0, 0) + 2713, (char) android.graphics.Color.green(0));
                                        byte[] bArr23 = $$a;
                                        byte b25 = bArr23[52];
                                        short s19 = bArr23[41];
                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                        d(b25, s19, (byte) (s19 | 34), objArr96);
                                        obj31 = cls35.getMethod((java.lang.String) objArr96[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj31);
                                    }
                                    ((int[]) objArr94[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr95)).intValue();
                                    return objArr94;
                                }
                                java.lang.Object[] objArr97 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                int i31 = ~(i23 | (-264731480));
                                java.lang.Object[] objArr98 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((538444832 | i31) | (~(264731479 | i4))) * (-338)) - 1659104568) + ((i31 | (~(803176311 | i4))) * 338))};
                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                if (obj32 == null) {
                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 50, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                    byte[] bArr24 = $$a;
                                    byte b26 = bArr24[52];
                                    short s20 = bArr24[41];
                                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                                    d(b26, s20, (byte) (s20 | 34), objArr99);
                                    obj32 = cls36.getMethod((java.lang.String) objArr99[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj32);
                                }
                                ((int[]) objArr97[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr98)).intValue();
                                return objArr97;
                            }
                            i19++;
                            num7 = num8;
                            str2 = r34;
                            num5 = num2;
                            indexOf = i20;
                            alpha = r34;
                        }
                    }
                    int i32 = indexOf;
                    java.lang.Integer num11 = num7;
                    num2 = num5;
                    java.lang.String str6 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                    int i33 = 6;
                    if (str6.length() >= 6) {
                        int i34 = 0;
                        alpha = alpha;
                        while (i34 <= str6.length() - i33) {
                            java.lang.Object[] objArr100 = {str6.substring(i34, i34 + 6), 931995};
                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj33 == null) {
                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 28, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2594, (char) android.view.View.combineMeasuredStates(0, 0));
                                byte b27 = $$a[41];
                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                d(b27, (short) (b27 | 653), b27, objArr101);
                                obj33 = cls37.getMethod((java.lang.String) objArr101[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj33);
                            }
                            long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr100)).longValue();
                            long j28 = i12;
                            long j29 = ~j28;
                            ?? r342 = str6;
                            int i35 = i34;
                            long j30 = ~(longValue11 | (-232140471));
                            java.lang.Object obj34 = invoke;
                            java.lang.Integer num12 = num11;
                            long j31 = (~longValue11) | 232140470;
                            java.lang.String str7 = intern3;
                            java.lang.String str8 = intern4;
                            long j32 = (1435 * longValue11) + 166212577236L + ((longValue11 | 232140470) * (-1434)) + (((~(j31 | j28)) | (~(j29 | longValue11)) | j30) * 717) + (((~(longValue11 | j28)) | j30 | (~(j31 | j29))) * 717) + 1489240995;
                            int i36 = ~i;
                            if (((((int) j32) & (((((~((-2135818786) | i)) | 698592375) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 1643878675) + (((~((-2135818786) | i36)) | 687996961) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))) | (((int) (j32 >> 32)) & ((((~(365056286 | i36)) | (~(1802282697 | i))) * 959) + 1151141761 + (((~(365056286 | i)) | (~(1802282697 | i36))) * 959)))) == -2096167706) {
                                objArr = new java.lang.Object[]{new int[1], new int[1], null, r2, new int[1]};
                                java.lang.String str9 = (java.lang.String) java.lang.Class.forName(intern2).getField(str7).get(obj34);
                                ((int[]) objArr[0])[0] = i;
                                ((int[]) objArr[1])[0] = i ^ 20;
                                int i37 = ~(64815404 | i36);
                                java.lang.Object[] objArr102 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(965320540 | i36)) | 39059488) * (-1188)) + 831246768 + (((~((-965320541) | i)) | 39059488 | i37) * 594) + ((i37 | (~(i36 | (-965320541))) | 939564624) * 594))};
                                java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num12);
                                if (obj35 == null) {
                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50, 2713 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                    byte[] bArr25 = $$a;
                                    byte b28 = bArr25[52];
                                    short s21 = bArr25[41];
                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                    d(b28, s21, (byte) (s21 | 34), objArr103);
                                    obj35 = cls38.getMethod((java.lang.String) objArr103[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num12, obj35);
                                }
                                int intValue4 = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr102)).intValue();
                                c = 0;
                                ((int[]) objArr[4])[0] = intValue4;
                                i4 = i;
                                num = num12;
                                if (((int[]) objArr[1])[c] != i4) {
                                }
                            } else {
                                i12 = i;
                                num11 = num12;
                                intern3 = str7;
                                invoke = obj34;
                                str6 = r342;
                                intern4 = str8;
                                i33 = 6;
                                i34 = i35 + 1;
                                alpha = r342;
                            }
                        }
                    }
                    ?? r4 = i12;
                    java.lang.Object obj36 = invoke;
                    java.lang.Integer num13 = num11;
                    java.lang.String str10 = intern3;
                    java.lang.String str11 = intern4;
                    java.lang.String substring = ((java.lang.String) java.lang.Class.forName(intern2).getField(str10).get(obj36)).substring(0, i32);
                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                    int red = 65 - android.graphics.Color.red(0);
                    java.lang.Object obj37 = null;
                    c("\u0000", red, 1 - android.view.View.getDefaultSize(0, 0), false, android.graphics.Color.red(0) + 1, objArr104);
                    int i38 = 0;
                    java.lang.String[] split = substring.split(((java.lang.String) objArr104[0]).intern());
                    int length2 = split.length;
                    int i39 = 0;
                    ?? r343 = alpha;
                    int i40 = "\u0000";
                    while (i39 < length2) {
                        java.lang.String str12 = split[i39];
                        java.lang.Object[] objArr105 = new java.lang.Object[1];
                        java.lang.Integer num14 = null;
                        a(127 - ((android.os.Process.getThreadPriority(i38) + 20) >> 6), null, null, "¡\u009c ", objArr105);
                        if (str12.split(((java.lang.String) objArr105[i38]).intern()).length > 1) {
                            int deadChar = 48 - android.view.KeyEvent.getDeadChar(i38, i38);
                            i8 = android.view.ViewConfiguration.getDoubleTapTimeout();
                            r13 = (char) android.graphics.drawable.Drawable.resolveOpacity(i38, i38);
                            synchronized (((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(deadChar, (i8 >> 16) + 1581, r13))) {
                                try {
                                    try {
                                        java.lang.Object[] objArr106 = new java.lang.Object[1];
                                        a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i38) + 128, null, null, "\u008c\u008b\u0089\u0099£\u009a\u0099\u0096¢\u008d\u008c\u009f\u009d¢\u0094\u0096", objArr106);
                                        intern = ((java.lang.String) objArr106[i38]).intern();
                                        try {
                                            runtime = java.lang.Runtime.getRuntime();
                                            size = android.view.View.MeasureSpec.getSize(i38);
                                            objArr6 = new java.lang.Object[1];
                                            r343 = split;
                                        } catch (java.lang.Exception unused) {
                                        }
                                    } catch (java.io.IOException unused2) {
                                        r343 = split;
                                    }
                                } catch (java.io.IOException unused3) {
                                }
                                try {
                                    try {
                                        a(127 - size, null, null, "\u0097\u008c", objArr6);
                                        exec = runtime.exec(((java.lang.String) objArr6[0]).intern(), (java.lang.String[]) null, (java.io.File) null);
                                        try {
                                            java.lang.Object[] objArr107 = {exec.getInputStream()};
                                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                            if (obj38 == null) {
                                                try {
                                                    i40 = length2;
                                                    try {
                                                        obj38 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44, 1507 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16))).getDeclaredConstructor(java.io.InputStream.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, obj38);
                                                    } catch (java.lang.Throwable th5) {
                                                        th = th5;
                                                        th = th;
                                                        cause = th.getCause();
                                                        if (cause == null) {
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th6) {
                                                    th = th6;
                                                }
                                            } else {
                                                i40 = length2;
                                            }
                                            try {
                                                newInstance = ((java.lang.reflect.Constructor) obj38).newInstance(objArr107);
                                            } catch (java.lang.Throwable th7) {
                                                th = th7;
                                                th = th;
                                                cause = th.getCause();
                                                if (cause == null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        } catch (java.lang.Throwable th8) {
                                            th = th8;
                                        }
                                    } catch (java.lang.Exception unused4) {
                                    }
                                    try {
                                        try {
                                            java.lang.Object[] objArr108 = {exec.getErrorStream()};
                                            java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                            if (obj39 == null) {
                                                try {
                                                    obj39 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 1507 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getDeclaredConstructor(java.io.InputStream.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, obj39);
                                                } catch (java.lang.Throwable th9) {
                                                    th2 = th9;
                                                    java.lang.Throwable cause3 = th2.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th2;
                                                }
                                            }
                                            java.lang.Object newInstance2 = ((java.lang.reflect.Constructor) obj39).newInstance(objArr108);
                                            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                            try {
                                                java.lang.Class<?> cls39 = java.lang.Class.forName(str11);
                                                java.lang.Integer num15 = num13;
                                                red = i39;
                                                try {
                                                    java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                    try {
                                                        a(127 - (android.os.Process.myTid() >> 22), null, null, "\u008d\u009e\u0099\u008d\u008c", objArr109);
                                                        cls39.getMethod(((java.lang.String) objArr109[0]).intern(), null).invoke(newInstance, null);
                                                        try {
                                                            java.lang.Class<?> cls40 = java.lang.Class.forName(str11);
                                                            java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                            a(127 - android.view.KeyEvent.normalizeMetaState(0), null, null, "\u008d\u009e\u0099\u008d\u008c", objArr110);
                                                            cls40.getMethod(((java.lang.String) objArr110[0]).intern(), null).invoke(newInstance2, null);
                                                            try {
                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                sb.append(intern);
                                                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                a(android.text.TextUtils.indexOf("", "", 0) + 127, null, null, "¤", objArr111);
                                                                sb.append(((java.lang.String) objArr111[0]).intern());
                                                                java.lang.String obj40 = sb.toString();
                                                                java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                a(127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), null, null, "©¨§¦¥", objArr112);
                                                                dataOutputStream.write(obj40.getBytes(((java.lang.String) objArr112[0]).intern()));
                                                                dataOutputStream.flush();
                                                                java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                java.lang.String str13 = "\u001e\u000f\u001aﾰ\u000b";
                                                                c("\u001e\u000f\u001aﾰ\u000b", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 108, 4 - android.graphics.Color.blue(0), false, 5 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr113);
                                                                ?? intern5 = ((java.lang.String) objArr113[0]).intern();
                                                                java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                a(android.graphics.Color.rgb(0, 0, 0) + 16777343, null, null, "©¨§¦¥", objArr114);
                                                                dataOutputStream.write(intern5.getBytes(((java.lang.String) objArr114[0]).intern()));
                                                                dataOutputStream.flush();
                                                                try {
                                                                    nanoTime = java.lang.System.nanoTime();
                                                                    long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                    while (true) {
                                                                        try {
                                                                            exec.exitValue();
                                                                            str13 = str10;
                                                                            obj37 = obj36;
                                                                            break;
                                                                        } catch (java.lang.IllegalThreadStateException unused5) {
                                                                            if (nanos > 0) {
                                                                                try {
                                                                                    str13 = str10;
                                                                                    obj37 = obj36;
                                                                                    try {
                                                                                        java.lang.Object[] objArr115 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                        java.lang.Class<?> cls41 = java.lang.Class.forName(str11);
                                                                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                                        a(127 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), null, null, "\u0096\u008b\u008b\u009d\u008c", objArr116);
                                                                                        cls41.getMethod(((java.lang.String) objArr116[0]).intern(), java.lang.Long.TYPE).invoke(null, objArr115);
                                                                                    } catch (java.lang.Throwable th10) {
                                                                                        java.lang.Throwable cause4 = th10.getCause();
                                                                                        if (cause4 != null) {
                                                                                            throw cause4;
                                                                                        }
                                                                                        throw th10;
                                                                                    }
                                                                                } catch (java.lang.InterruptedException e) {
                                                                                    e = e;
                                                                                    str13 = str10;
                                                                                    obj37 = obj36;
                                                                                    interruptedException = e;
                                                                                    try {
                                                                                        throw interruptedException;
                                                                                    } catch (java.lang.Throwable th11) {
                                                                                        th = th11;
                                                                                        th3 = th;
                                                                                        try {
                                                                                            exec.destroy();
                                                                                            throw th3;
                                                                                        } catch (java.lang.Exception unused6) {
                                                                                            throw th3;
                                                                                        }
                                                                                    }
                                                                                } catch (java.lang.Throwable th12) {
                                                                                    th = th12;
                                                                                    str13 = str10;
                                                                                    obj37 = obj36;
                                                                                    th3 = th;
                                                                                    exec.destroy();
                                                                                    throw th3;
                                                                                }
                                                                            } else {
                                                                                str13 = str10;
                                                                                obj37 = obj36;
                                                                            }
                                                                            try {
                                                                                long nanos2 = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                                if (nanos2 > 0) {
                                                                                    nanos = nanos2;
                                                                                    obj36 = obj37;
                                                                                    str10 = str13;
                                                                                }
                                                                            } catch (java.lang.InterruptedException e2) {
                                                                                e = e2;
                                                                                interruptedException = e;
                                                                                throw interruptedException;
                                                                            } catch (java.lang.Throwable th13) {
                                                                                th = th13;
                                                                                th3 = th;
                                                                                exec.destroy();
                                                                                throw th3;
                                                                            }
                                                                        } catch (java.lang.InterruptedException e3) {
                                                                            interruptedException = e3;
                                                                            throw interruptedException;
                                                                        } catch (java.lang.Throwable th14) {
                                                                            th3 = th14;
                                                                            exec.destroy();
                                                                            throw th3;
                                                                        }
                                                                    }
                                                                } catch (java.lang.InterruptedException e4) {
                                                                    e = e4;
                                                                } catch (java.lang.Throwable th15) {
                                                                    th = th15;
                                                                }
                                                                try {
                                                                    try {
                                                                        dataOutputStream.close();
                                                                    } catch (java.io.IOException unused7) {
                                                                    }
                                                                    try {
                                                                        nanoTime = new java.lang.Object[]{100L};
                                                                        java.lang.Class<?> cls42 = java.lang.Class.forName(str11);
                                                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                        a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, null, null, "\u0090\u009f\u0092ª", objArr117);
                                                                        intern5 = cls42.getMethod(((java.lang.String) objArr117[0]).intern(), java.lang.Long.TYPE);
                                                                        intern5.invoke(newInstance, nanoTime);
                                                                        try {
                                                                            try {
                                                                                nanoTime = new java.lang.Object[]{10L};
                                                                                intern5 = java.lang.Class.forName(str11);
                                                                                java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                                a(android.view.View.resolveSizeAndState(0, 0, 0) + 127, null, null, "\u0090\u009f\u0092ª", objArr118);
                                                                                intern5.getMethod(((java.lang.String) objArr118[0]).intern(), java.lang.Long.TYPE).invoke(newInstance2, nanoTime);
                                                                                try {
                                                                                    exec.destroy();
                                                                                } catch (java.io.IOException unused8) {
                                                                                    i8 = i;
                                                                                    r13 = obj37;
                                                                                    num14 = num15;
                                                                                    r4 = str13;
                                                                                } catch (java.lang.Exception unused9) {
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                                                        java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getMode(0) + 1507, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                                        byte[] bArr26 = $$a;
                                                                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                                        d(bArr26[41], bArr26[3], bArr26[46], objArr119);
                                                                                        sb2.append(cls43.getField((java.lang.String) objArr119[0]).get(newInstance).toString());
                                                                                        java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1506 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                                        d(bArr26[41], bArr26[3], bArr26[46], objArr120);
                                                                                        sb2.append(cls44.getField((java.lang.String) objArr120[0]).get(newInstance2).toString());
                                                                                        java.lang.String obj41 = sb2.toString();
                                                                                        java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                                        a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, null, null, "¤", objArr121);
                                                                                        java.lang.String[] split2 = obj41.split(((java.lang.String) objArr121[0]).intern());
                                                                                        int length3 = split2.length;
                                                                                        int i41 = 0;
                                                                                        while (i41 < length3) {
                                                                                            java.lang.String str14 = split2[i41];
                                                                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                                            c("\u0004ￛ\u0006\b\u0002\f\u0004\u0002\u0011ￏ\u0006\r\b\u0010\u0010\bￏ\u000e\u0010", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 114, 9 - android.graphics.Color.red(0), true, 19 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr122);
                                                                                            if (!str14.startsWith(((java.lang.String) objArr122[0]).intern())) {
                                                                                                java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                                                c("\u0003\u0001\u0010ￎ\u0004\t\u000f\u0012\u0004\u000e\u0001ￎ\r\u000f\u0003ￚ\u0005\u0007\u0001\u000b", 113 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 3 - (android.view.ViewConfiguration.getTapTimeout() >> 16), true, 19 - android.os.Process.getGidForName(""), objArr123);
                                                                                                if (str14.startsWith(((java.lang.String) objArr123[0]).intern())) {
                                                                                                    continue;
                                                                                                } else {
                                                                                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                                                    c("ￚ\u0005\u0007\u0001\u000b\u0003\u0001\u0010", 115 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 7 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), true, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 8, objArr124);
                                                                                                    if (str14.startsWith(((java.lang.String) objArr124[0]).intern())) {
                                                                                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                                                        a(128 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), null, null, "«", objArr125);
                                                                                                        java.lang.String[] split3 = str14.split(((java.lang.String) objArr125[0]).intern());
                                                                                                        if (split3.length > 1 && split3[1].equalsIgnoreCase(str12)) {
                                                                                                        }
                                                                                                    } else {
                                                                                                        continue;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            i41++;
                                                                                            str13 = str13;
                                                                                            num15 = num15;
                                                                                            obj37 = obj37;
                                                                                        }
                                                                                    } catch (java.lang.Exception unused10) {
                                                                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                                        c("\n\u0011\u000e\u0006￫ￓ\u0018\u0018\n\b\u0014\u0017\u0015ￅ\u0006ￅ\n\u0019\u0006\n\u0017\bￅ\u0014\u0019ￅ\t", android.view.KeyEvent.normalizeMetaState(0) + 109, 6 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, 28 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr126);
                                                                                        throw new java.io.IOException(((java.lang.String) objArr126[0]).intern());
                                                                                    }
                                                                                } catch (java.io.IOException unused11) {
                                                                                }
                                                                                r13 = obj37;
                                                                                r4 = str13;
                                                                                i8 = i;
                                                                            } catch (java.lang.Throwable th16) {
                                                                                java.lang.Throwable cause5 = th16.getCause();
                                                                                if (cause5 != null) {
                                                                                    throw cause5;
                                                                                }
                                                                                throw th16;
                                                                            }
                                                                        } catch (java.lang.InterruptedException e5) {
                                                                            interruptedException = e5;
                                                                            throw interruptedException;
                                                                        } catch (java.lang.Throwable th17) {
                                                                            th3 = th17;
                                                                            exec.destroy();
                                                                            throw th3;
                                                                        }
                                                                    } catch (java.lang.Throwable th18) {
                                                                        java.lang.Throwable cause6 = th18.getCause();
                                                                        if (cause6 != null) {
                                                                            throw cause6;
                                                                        }
                                                                        throw th18;
                                                                    }
                                                                } catch (java.lang.InterruptedException e6) {
                                                                    e = e6;
                                                                    interruptedException = e;
                                                                    throw interruptedException;
                                                                } catch (java.lang.Throwable th19) {
                                                                    th = th19;
                                                                    th3 = th;
                                                                    exec.destroy();
                                                                    throw th3;
                                                                }
                                                            } catch (java.io.IOException unused12) {
                                                                i8 = i;
                                                                r4 = str10;
                                                                r13 = obj36;
                                                            } catch (java.lang.Exception unused13) {
                                                            }
                                                            num14 = num15;
                                                        } catch (java.lang.Throwable th20) {
                                                            java.lang.Throwable cause7 = th20.getCause();
                                                            if (cause7 != null) {
                                                                throw cause7;
                                                            }
                                                            throw th20;
                                                        }
                                                    } catch (java.lang.Throwable th21) {
                                                        th = th21;
                                                        java.lang.Throwable th22 = th;
                                                        java.lang.Throwable cause8 = th22.getCause();
                                                        if (cause8 != null) {
                                                            throw cause8;
                                                        }
                                                        throw th22;
                                                    }
                                                } catch (java.lang.Throwable th23) {
                                                    th = th23;
                                                }
                                            } catch (java.lang.Throwable th24) {
                                                th = th24;
                                            }
                                        } catch (java.lang.Throwable th25) {
                                            th2 = th25;
                                        }
                                    } catch (java.io.IOException unused14) {
                                        i8 = r4;
                                        num14 = num13;
                                        red = i39;
                                        r4 = str10;
                                        r13 = obj36;
                                        i39 = red + 1;
                                        str10 = r4;
                                        r4 = i8;
                                        obj36 = r13;
                                        num13 = num14;
                                        split = r343;
                                        length2 = i40;
                                        i38 = 0;
                                        r343 = r343;
                                        i40 = i40;
                                    } catch (java.lang.Exception unused15) {
                                        java.lang.Object[] objArr1262 = new java.lang.Object[1];
                                        c("\n\u0011\u000e\u0006￫ￓ\u0018\u0018\n\b\u0014\u0017\u0015ￅ\u0006ￅ\n\u0019\u0006\n\u0017\bￅ\u0014\u0019ￅ\t", android.view.KeyEvent.normalizeMetaState(0) + 109, 6 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, 28 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr1262);
                                        throw new java.io.IOException(((java.lang.String) objArr1262[0]).intern());
                                    }
                                } catch (java.io.IOException unused16) {
                                    i40 = length2;
                                    i8 = r4;
                                    num14 = num13;
                                    red = i39;
                                    r4 = str10;
                                    r13 = obj36;
                                    i39 = red + 1;
                                    str10 = r4;
                                    r4 = i8;
                                    obj36 = r13;
                                    num13 = num14;
                                    split = r343;
                                    length2 = i40;
                                    i38 = 0;
                                    r343 = r343;
                                    i40 = i40;
                                } catch (java.lang.Exception unused17) {
                                    java.lang.Object[] objArr12622 = new java.lang.Object[1];
                                    c("\n\u0011\u000e\u0006￫ￓ\u0018\u0018\n\b\u0014\u0017\u0015ￅ\u0006ￅ\n\u0019\u0006\n\u0017\bￅ\u0014\u0019ￅ\t", android.view.KeyEvent.normalizeMetaState(0) + 109, 6 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, 28 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr12622);
                                    throw new java.io.IOException(((java.lang.String) objArr12622[0]).intern());
                                }
                            }
                        } else {
                            r343 = split;
                            i40 = length2;
                            i8 = r4;
                            num14 = num13;
                            red = i39;
                            r4 = str10;
                            r13 = obj36;
                        }
                        i39 = red + 1;
                        str10 = r4;
                        r4 = i8;
                        obj36 = r13;
                        num13 = num14;
                        split = r343;
                        length2 = i40;
                        i38 = 0;
                        r343 = r343;
                        i40 = i40;
                    }
                    i4 = r4;
                    num = num13;
                } else {
                    i4 = i12;
                    num = -1347122530;
                    num2 = num5;
                }
                objArr = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                java.lang.Object[] objArr127 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((488642560 | r2) * (-814)) - 89409886) + (((~(541280134 | i4)) | (~((~i4) | (-488855811))) | 541066884) * 407) + (((~((-541280135) | i4)) | 541066884 | (~(488855810 | i4))) * 407))};
                java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                if (obj42 == null) {
                    java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.argb(0, 0, 0, 0), 2713 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte[] bArr27 = $$a;
                    byte b29 = bArr27[52];
                    short s22 = bArr27[41];
                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                    d(b29, s22, (byte) (s22 | 34), objArr128);
                    obj42 = cls45.getMethod((java.lang.String) objArr128[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj42);
                }
                int intValue5 = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr127)).intValue();
                c = 0;
                ((int[]) objArr[4])[0] = intValue5;
                if (((int[]) objArr[1])[c] != i4) {
                }
            } catch (java.lang.Throwable th26) {
                java.lang.Throwable cause9 = th26.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th26;
            }
        } catch (java.lang.Throwable th27) {
            java.lang.Throwable cause10 = th27.getCause();
            if (cause10 != null) {
                throw cause10;
            }
            throw th27;
        }
    }

    static void init$0() {
        $$a = new byte[]{107, 115, 84, 3, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10, -39, 0, -4, -13, 9, -19, 19, -1, com.google.common.base.Ascii.US, -32, -19, com.google.common.base.Ascii.FF, 18, -36, 1, 7, -5, -5, 5};
        $$b = 6;
    }
}
