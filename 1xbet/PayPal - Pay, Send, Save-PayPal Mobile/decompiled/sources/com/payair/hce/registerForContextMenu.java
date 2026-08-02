package com.payair.hce;

/* loaded from: classes4.dex */
public final class registerForContextMenu extends com.payair.hce.onOptionsItemSelected {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static long getAid;
    private final byte[] valueOf;
    private final java.lang.String[] values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = s * 2;
        int i4 = (b2 * 4) + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i3;
            i2 = i4;
            int i6 = 0;
            i4 += i5;
            i2++;
            i = i6;
            bArr2[i] = (byte) i4;
            i6 = i + 1;
            if (i == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = bArr[i2];
            i4 += i5;
            i2++;
            i = i6;
            bArr2[i] = (byte) i4;
            i6 = i + 1;
            if (i == i3) {
            }
        } else {
            i = 0;
            i4 = 115 - b;
            i2 = i4;
            bArr2[i] = (byte) i4;
            i6 = i + 1;
            if (i == i3) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    private static void d(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i2 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1890 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (3601 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 2, (short) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (getAid ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 64, 1443 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (29682 - android.text.TextUtils.indexOf("", "")));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 3, (short) 0, (byte) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
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
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 64, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1443, (char) (29682 - android.view.View.resolveSizeAndState(0, 0, 0)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((byte) 3, (short) 0, (byte) 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static /* synthetic */ boolean writeReplace(com.payair.hce.registerForContextMenu registerforcontextmenu, javax.net.ssl.SSLSession sSLSession) {
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 47) % 128;
        boolean valueOf = registerforcontextmenu.valueOf(sSLSession);
        int i = IccPrivateKeyCrtComponentsJson + 103;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return valueOf;
        }
        throw null;
    }

    @Override // com.payair.hce.onOptionsItemSelected
    final /* synthetic */ java.net.HttpURLConnection DigitizedCardProfile(java.net.URL url) throws com.payair.hce.component5 {
        int i = RecordsJson + 7;
        IccPrivateKeyCrtComponentsJson = i % 128;
        javax.net.ssl.HttpsURLConnection AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(url);
        if (i % 2 == 0) {
            return AlternateContactlessPaymentDataJson2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        $10 = ($11 + 97) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i2 = $11 + 25;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = getdsrpdata.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31, 1890 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.view.View.combineMeasuredStates(0, 0) + 3600));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 2, (short) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                    }
                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() - (AlternateContactlessPaymentDataJson / (-4761752123935132024L));
                    java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('p' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1443 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (29682 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 3, (short) 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i4 = getdsrpdata.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1890, (char) (android.graphics.Color.green(0) + 3600));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((byte) 2, (short) 0, (byte) 0, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj3);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).longValue() ^ (AlternateContactlessPaymentDataJson ^ (-4761752123935132024L));
                java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 65, 1442 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (29682 - android.graphics.Color.green(0)));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b((byte) 3, (short) 0, (byte) 0, objArr9);
                    obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            $10 = ($11 + 71) % 128;
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr10 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj5 == null) {
                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777280, 1442 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 29683));
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b((byte) 3, (short) 0, (byte) 0, objArr11);
                obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public registerForContextMenu(java.net.URL url, com.payair.hce.component6 component6Var, int i, byte[] bArr, java.util.List<java.lang.String> list, java.lang.String[] strArr, java.util.HashMap<java.lang.String, java.lang.String> hashMap) throws com.payair.hce.component5 {
        super(url, component6Var, i, list, hashMap);
        this.valueOf = bArr;
        this.values = strArr;
        this.writeReplace = AlternateContactlessPaymentDataJson(url);
    }

    private static void c(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i2];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i2) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 2121 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.graphics.Color.red(0), 3543 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            char[] cArr2 = new char[i2];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i2);
            java.lang.System.arraycopy(cArr2, 0, cArr, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr3 = new char[i2];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i2) {
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i2 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 53, 3542 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.view.View.MeasureSpec.getSize(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private javax.net.ssl.HttpsURLConnection AlternateContactlessPaymentDataJson(java.net.URL url) throws com.payair.hce.component5 {
        try {
            javax.net.ssl.SSLContext sSLContext = (javax.net.ssl.SSLContext) writeReplace(new java.lang.Object[]{this}, 956783604, -956783604, java.lang.System.identityHashCode(this));
            javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) url.openConnection();
            java.lang.String[] strArr = this.values;
            if (strArr != null) {
                RecordsJson = (IccPrivateKeyCrtComponentsJson + 1) % 128;
                if (strArr.length != 0) {
                    java.util.Arrays.toString(strArr);
                    httpsURLConnection.setSSLSocketFactory(new com.payair.hce.getMonth(sSLContext.getSocketFactory(), this.values));
                    if (this.DigitizedCardProfile != null) {
                        int i = IccPrivateKeyCrtComponentsJson + 5;
                        RecordsJson = i % 128;
                        if (i % 2 == 0) {
                            this.DigitizedCardProfile.size();
                            throw null;
                        }
                        if (this.DigitizedCardProfile.size() != 0) {
                            httpsURLConnection.setHostnameVerifier(new javax.net.ssl.HostnameVerifier() { // from class: com.payair.hce.registerForContextMenu.4
                                private static int values = 0;
                                private static int writeReplace = 1;

                                public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i2, int i3, int i4) {
                                    return values(objArr);
                                }

                                private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                                    com.payair.hce.registerForContextMenu.AnonymousClass4 anonymousClass4 = (com.payair.hce.registerForContextMenu.AnonymousClass4) objArr[0];
                                    javax.net.ssl.SSLSession sSLSession = (javax.net.ssl.SSLSession) objArr[2];
                                    int i2 = writeReplace;
                                    int i3 = (((i2 & (-6)) | ((~i2) & 5)) - (~(-(-((i2 & 5) << 1))))) - 1;
                                    values = i3 % 128;
                                    com.payair.hce.registerForContextMenu registerforcontextmenu = com.payair.hce.registerForContextMenu.this;
                                    if (i3 % 2 == 0) {
                                        return java.lang.Boolean.valueOf(com.payair.hce.registerForContextMenu.writeReplace(registerforcontextmenu, sSLSession));
                                    }
                                    com.payair.hce.registerForContextMenu.writeReplace(registerforcontextmenu, sSLSession);
                                    throw null;
                                }

                                @Override // javax.net.ssl.HostnameVerifier
                                public final boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
                                    return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this, str, sSLSession}, -964963864, 964963864, java.lang.System.identityHashCode(this))).booleanValue();
                                }
                            });
                            return (javax.net.ssl.HttpsURLConnection) AlternateContactlessPaymentDataJson(httpsURLConnection);
                        }
                    }
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a("ೲ䮮舦\udae3ᆇ栾ꃆ７㘚躸앓ᰆ哀鍃\uebe5⊚礢뇕", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18269, objArr);
                    throw new com.payair.hce.component5(((java.lang.String) objArr[0]).intern());
                }
            }
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            if (this.DigitizedCardProfile != null) {
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("ೲ䮮舦\udae3ᆇ栾ꃆ７㘚躸앓ᰆ哀鍃\uebe5⊚礢뇕", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18269, objArr2);
            throw new com.payair.hce.component5(((java.lang.String) objArr2[0]).intern());
        } catch (java.io.IOException | java.security.KeyManagementException | java.security.NoSuchAlgorithmException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(e.getMessage());
            sb.append(e);
            throw new com.payair.hce.component5(sb.toString());
        }
    }

    private boolean valueOf(javax.net.ssl.SSLSession sSLSession) {
        java.lang.String substring;
        try {
            java.security.cert.X509Certificate[] x509CertificateArr = (java.security.cert.X509Certificate[]) sSLSession.getPeerCertificates();
            if (x509CertificateArr != null) {
                RecordsJson = (IccPrivateKeyCrtComponentsJson + 121) % 128;
                for (java.security.cert.X509Certificate x509Certificate : x509CertificateArr) {
                    try {
                        x509Certificate.checkValidity();
                    } catch (java.security.cert.CertificateExpiredException | java.security.cert.CertificateNotYetValidException unused) {
                        return false;
                    }
                }
                java.lang.String name2 = x509CertificateArr[0].getSubjectDN().getName();
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("\u0cff㚣砣", 14929 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
                int indexOf = name2.indexOf(((java.lang.String) objArr[0]).intern());
                if (indexOf < 0) {
                    return false;
                }
                int indexOf2 = name2.indexOf(44, indexOf);
                if (indexOf2 != -1) {
                    substring = name2.substring(indexOf, indexOf2);
                } else {
                    int i = IccPrivateKeyCrtComponentsJson + 93;
                    RecordsJson = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    substring = name2.substring(indexOf);
                }
                java.lang.String substring2 = substring.substring(3);
                java.util.Iterator<java.lang.String> it = this.DigitizedCardProfile.iterator();
                while (it.hasNext()) {
                    if (substring2.equals(it.next().trim())) {
                        int i2 = RecordsJson + 91;
                        IccPrivateKeyCrtComponentsJson = i2 % 128;
                        return i2 % 2 == 0;
                    }
                }
            }
            RecordsJson = (IccPrivateKeyCrtComponentsJson + 17) % 128;
        } catch (javax.net.ssl.SSLPeerUnverifiedException unused2) {
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        r4 = com.payair.hce.registerForContextMenu.IccPrivateKeyCrtComponentsJson + 41;
        com.payair.hce.registerForContextMenu.RecordsJson = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        if ((r4 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
    
        r4 = new java.lang.Object[1];
        a("\u0ce4蛀\u181e鉞", 35401 / (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 2.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 2.0f ? 0 : -1)), r4);
        r4 = javax.net.ssl.KeyManagerFactory.getInstance(((java.lang.String) r4[0]).intern());
        r13 = new java.lang.Object[1];
        a("\u0ce4鄅㞧푉站", (android.util.TypedValue.complexToFraction(1, 1.0f, 2.0f) > 2.0f ? 1 : (android.util.TypedValue.complexToFraction(1, 1.0f, 2.0f) == 2.0f ? 0 : -1)) + 40343, r13);
        r10 = r13[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c9, code lost:
    
        r10 = new java.lang.Object[]{((java.lang.String) r10).intern()};
        r15 = new java.lang.Object[1];
        c(false, "�\u0010\u0001￢�\uffff\u0010\u000b\u000e\u0015\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010\u0015ￊ\uffff\u0001\u000e\u0010ￊ\uffdf\u0001\u000e\u0010\u0005\u0002\u0005\uffff", 219 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 38, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 10, r15);
        r11 = java.lang.Class.forName((java.lang.String) r15[0]);
        r14 = new java.lang.Object[1];
        d("嬪捯⮷\uf3d1먿䉝ઓ틝餛ꅑ槮", 14407 - android.view.View.getDefaultSize(0, 0), r14);
        r10 = r11.getMethod((java.lang.String) r14[0], java.lang.String.class).invoke(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0122, code lost:
    
        r0 = new java.lang.Object[]{new java.io.ByteArrayInputStream(r0.valueOf)};
        r15 = new java.lang.Object[1];
        c(false, "�\u0010\u0001￢�\uffff\u0010\u000b\u000e\u0015\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010\u0015ￊ\uffff\u0001\u000e\u0010ￊ\uffdf\u0001\u000e\u0010\u0005\u0002\u0005\uffff", 220 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.text.TextUtils.getOffsetAfter("", 0) + 37, (android.os.Process.myPid() >> 22) + 10, r15);
        r11 = java.lang.Class.forName((java.lang.String) r15[0]);
        r14 = new java.lang.Object[1];
        d("嬪౯\uf5ad廽أ\uef4f傓㧙\ue136䩗㏹鬴䱰㖰黆䘇⽜邎秖", android.view.View.MeasureSpec.getSize(0) + 22343, r14);
        r0 = r11.getMethod((java.lang.String) r14[0], java.io.InputStream.class).invoke(r10, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0175, code lost:
    
        r15 = new java.lang.Object[1];
        c(false, "\u0015ￊ\uffe7\u0001\u0015\uffef\u0010\u000b\u000e\u0001\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010", android.widget.ExpandableListView.getPackedPositionGroup(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, android.graphics.Color.green(0) + 22, 11 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), r15);
        r10 = java.lang.Class.forName((java.lang.String) r15[0]);
        r13 = new java.lang.Object[1];
        d("嬪坟䏗繬櫴數ᇦ౹㢙⬖➿툩캩藍", android.view.KeyEvent.keyCodeFromString("") + 3191, r13);
        r10 = r10.getMethod((java.lang.String) r13[0], null).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01bc, code lost:
    
        com.payair.hce.registerForContextMenu.IccPrivateKeyCrtComponentsJson = (com.payair.hce.registerForContextMenu.RecordsJson + 103) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01c4, code lost:
    
        r3 = new java.lang.Object[1];
        c(false, "\u0015ￊ\uffe7\u0001\u0015\uffef\u0010\u000b\u000e\u0001\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010", 220 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), 22 - (android.os.Process.myPid() >> 22), 9 - android.os.Process.getGidForName(""), r3);
        r3 = java.lang.Class.forName((java.lang.String) r3[0]);
        r13 = new java.lang.Object[1];
        d("嬪捯⮷\uf3d1먿䉝ઓ틝餛ꅑ槮", 14407 - android.text.TextUtils.indexOf("", "", 0, 0), r13);
        r3 = (java.security.KeyStore) r3.getMethod((java.lang.String) r13[0], java.lang.String.class).invoke(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0214, code lost:
    
        com.payair.hce.registerForContextMenu.IccPrivateKeyCrtComponentsJson = (com.payair.hce.registerForContextMenu.RecordsJson + 83) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x021c, code lost:
    
        r5 = new java.lang.Object[1];
        c(false, "\u0015ￊ\uffe7\u0001\u0015\uffef\u0010\u000b\u000e\u0001\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010", 219 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 21, 10 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), r5);
        r5 = java.lang.Class.forName((java.lang.String) r5[0]);
        r15 = new java.lang.Object[1];
        c(false, "￼\u0004\u0007\ufff9", 223 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 4, 1 - (android.view.ViewConfiguration.getTapTimeout() >> 16), r15);
        r5.getMethod((java.lang.String) r15[0], java.io.InputStream.class, char[].class).invoke(r3, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0289, code lost:
    
        r10 = new java.lang.Object[1];
        a("\u0cdf숊", 52951 - android.view.KeyEvent.normalizeMetaState(0), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02a0, code lost:
    
        r0 = new java.lang.Object[]{((java.lang.String) r10[0]).intern(), r0};
        r15 = new java.lang.Object[1];
        c(false, "\u0015ￊ\uffe7\u0001\u0015\uffef\u0010\u000b\u000e\u0001\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010", 220 - android.text.TextUtils.getTrimmedLength(""), 22 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), 11 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), r15);
        r5 = java.lang.Class.forName((java.lang.String) r15[0]);
        r15 = new java.lang.Object[1];
        c(false, "\u0001\ufffe\u0001\ufffb\ufff9\f�\uffdd\u0006\f\n\u0011\u000b�\fￛ�\n\f", android.view.KeyEvent.getDeadChar(0, 0) + 224, (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 18, 12 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), r15);
        r10 = (java.lang.String) r15[0];
        r15 = new java.lang.Object[1];
        c(true, "\u0003\u0006\u0011\u000f\u0002￠ￋ\u0011\u000f\u0002\u0000ￋ\u0016\u0011\u0006\u000f\u0012\u0000\u0002\u0010ￋ\ufffe\u0013\ufffe\u0007\u0002\u0011\ufffe\u0000\u0006", android.graphics.Color.alpha(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE, android.widget.ExpandableListView.getPackedPositionType(0) + 30, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 26, r15);
        r5.getMethod(r10, java.lang.String.class, java.lang.Class.forName((java.lang.String) r15[0])).invoke(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x033a, code lost:
    
        r0 = new javax.net.ssl.TrustManager[]{new com.payair.hce.getYear(r3)};
        r4.init(r3, null);
        r5 = r4.getKeyManagers();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0384, code lost:
    
        r8 = new java.lang.Object[1];
        c(true, "\u0006\t\u000b\u0000\n�￮\u0001\u000e\u0011\uffff\u0001\uffefￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�\u0012�", android.widget.ExpandableListView.getPackedPositionGroup(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26, -android.view.MotionEvent.axisFromString(""), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x03b3, code lost:
    
        r2.init(r5, r0, (java.security.SecureRandom) java.lang.Class.forName((java.lang.String) r8[0]).getDeclaredConstructor(null).newInstance(null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x03b6, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x03b7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x03b8, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03bc, code lost:
    
        if (r2 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x03be, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x03bf, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x034c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x034d, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0351, code lost:
    
        if (r2 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0353, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0354, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0355, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0356, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x035a, code lost:
    
        if (r2 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x035c, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x035d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x035e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x035f, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0363, code lost:
    
        if (r2 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0365, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0366, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0367, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0368, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x036c, code lost:
    
        if (r2 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x036e, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x036f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0370, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0371, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0375, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (r0.valueOf != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0377, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0378, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0379, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x037a, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x037e, code lost:
    
        if (r2 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0380, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0381, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x009d, code lost:
    
        r15 = new java.lang.Object[1];
        a("\u0ce4蛀\u181e鉞", 35401 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), r15);
        r4 = javax.net.ssl.KeyManagerFactory.getInstance(((java.lang.String) r15[0]).intern());
        r13 = new java.lang.Object[1];
        a("\u0ce4鄅㞧푉站", 40343 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), r13);
        r10 = r13[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0382, code lost:
    
        r0 = null;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0054, code lost:
    
        if (r0.valueOf.length <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0056, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x004f, code lost:
    
        if (r0.valueOf != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if (r4 == false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        javax.net.ssl.SSLContext sSLContext;
        com.payair.hce.registerForContextMenu registerforcontextmenu = (com.payair.hce.registerForContextMenu) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson + 33;
        RecordsJson = i % 128;
        try {
            if (i % 2 == 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("೨늫灙", 48731 >> android.text.TextUtils.getOffsetBefore("", 1), objArr2);
                sSLContext = javax.net.ssl.SSLContext.getInstance(((java.lang.String) objArr2[0]).intern());
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a("೨늫灙", 48731 - android.text.TextUtils.getOffsetBefore("", 0), objArr3);
                sSLContext = javax.net.ssl.SSLContext.getInstance(((java.lang.String) objArr3[0]).intern());
            }
        } catch (java.security.cert.CertificateException unused) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a("\u0cf9⤗䝼絘鮪놡\uefc3н≔塞皣겝쫤\ue0d0ᴄ㭢兏辴ꖊ쏂", android.view.View.resolveSize(0, 0) + 9689, objArr4);
            throw new com.payair.hce.component5(((java.lang.String) objArr4[0]).intern());
        } catch (java.lang.Exception e) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a("\u0cf9䠗蔜수Ἂ呁鄣\uee3d⭔怮뵕暑㜰豚쥭٥䍸顰핦ና濨ꒁ\ue188㺦箴났ඤ䪾蟔\udcc0\u19dd囕", 17658 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr5);
            throw new com.payair.hce.component5(((java.lang.String) objArr5[0]).intern().concat(java.lang.String.valueOf(e)));
        }
    }

    static void valueOf() {
        SdkCoreAlternateContactlessPaymentDataImpl = 1889207065;
        getAid = 4008286253977644485L;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        RecordsJson = 1;
        valueOf();
        AlternateContactlessPaymentDataJson = 950173996489603636L;
    }

    private javax.net.ssl.SSLContext AlternateContactlessPaymentDataJson() throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.io.IOException, com.payair.hce.component5 {
        return (javax.net.ssl.SSLContext) writeReplace(new java.lang.Object[]{this}, 956783604, -956783604, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{34, -19, 77, -23};
        $$b = 96;
    }
}
