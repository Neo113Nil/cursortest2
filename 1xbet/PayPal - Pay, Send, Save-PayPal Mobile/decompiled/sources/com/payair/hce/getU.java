package com.payair.hce;

/* loaded from: classes4.dex */
public final class getU<T> extends com.payair.hce.getMagstripeCvmIssuerOptions<T> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean SdkCoreBusinessLogicModuleImpl;
    private static char[] getAid;
    private static int getCiacDecline;
    private static int getCvrMaskAnd;
    private static boolean getGpoResponse;
    private static char getProfileVersion;
    private final com.payair.hce.getMagstripeCvmIssuerOptions<T> valueOf;
    private final java.lang.reflect.Type values;
    private final com.payair.hce.IccPrivateKeyCrtComponentsJson writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i2 + 65;
        byte[] bArr = $$a;
        int i5 = 40 - (i * 2);
        char[] cArr = new char[35 - b];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i5++;
            i4 = (i4 + i6) - 2;
            i3 = i7;
            cArr[i3] = (char) i4;
            i7 = i3 + 1;
            if (i3 == 34 - b) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i6 = bArr[i5];
            i5++;
            i4 = (i4 + i6) - 2;
            i3 = i7;
            cArr[i3] = (char) i4;
            i7 = i3 + 1;
            if (i3 == 34 - b) {
            }
        } else {
            i3 = 0;
            cArr[i3] = (char) i4;
            i7 = i3 + 1;
            if (i3 == 34 - b) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4 = b + 4;
        byte[] bArr = $$d;
        int i5 = i2 + 107;
        int i6 = i * 4;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i5 += i8;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4++;
            i8 = bArr[i4];
            i5 += i8;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    getU(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getMagstripeCvmIssuerOptions<T> getmagstripecvmissueroptions, java.lang.reflect.Type type) {
        this.writeReplace = iccPrivateKeyCrtComponentsJson;
        this.valueOf = getmagstripecvmissueroptions;
        this.values = type;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final T AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        getCvrMaskAnd = (getCiacDecline + 55) % 128;
        T AlternateContactlessPaymentDataJson2 = this.valueOf.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
        getCiacDecline = (getCvrMaskAnd + 45) % 128;
        return AlternateContactlessPaymentDataJson2;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, T t) throws java.io.IOException {
        com.payair.hce.getMagstripeCvmIssuerOptions<T> getmagstripecvmissueroptions = this.valueOf;
        java.lang.reflect.Type values = values(this.values, t);
        if (values != this.values) {
            getmagstripecvmissueroptions = this.writeReplace.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<>(values));
            if (getmagstripecvmissueroptions instanceof com.payair.hce.getDq.DigitizedCardProfile) {
                int i = (getCvrMaskAnd + 107) % 128;
                getCiacDecline = i;
                com.payair.hce.getMagstripeCvmIssuerOptions<T> getmagstripecvmissueroptions2 = this.valueOf;
                if (!(getmagstripecvmissueroptions2 instanceof com.payair.hce.getDq.DigitizedCardProfile)) {
                    getCvrMaskAnd = (i + 75) % 128;
                    getmagstripecvmissueroptions = getmagstripecvmissueroptions2;
                }
            }
        }
        getmagstripecvmissueroptions.writeReplace(getremotepaymentdata, t);
    }

    private static java.lang.reflect.Type values(java.lang.reflect.Type type, java.lang.Object obj) {
        int i = getCvrMaskAnd + 105;
        getCiacDecline = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (obj == null) {
            return type;
        }
        if (type != java.lang.Object.class && !(type instanceof java.lang.reflect.TypeVariable) && !(type instanceof java.lang.Class)) {
            return type;
        }
        java.lang.Class<?> cls = obj.getClass();
        getCvrMaskAnd = (getCiacDecline + 31) % 128;
        return cls;
    }

    private static void d(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 29) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                $11 = ($10 + 103) % 128;
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (RecordsJson ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getProfileVersion)};
                    int i4 = c2 + i2;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1335 - android.text.TextUtils.getCapsMode("", 0, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        e(0, 3, (byte) -1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (DigitizedCardProfile ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                    int i5 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 62, android.view.View.resolveSize(0, 0) + 1335, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        e(0, 3, (byte) -1, objArr5);
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 54, 3543 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getOffsetBefore("", 0))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    private static void a(int i, java.lang.String str, int[] iArr, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        $10 = ($11 + 103) % 128;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            int i2 = $11 + 93;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = getAid;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                $11 = ($10 + 119) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > j ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, (char) (android.view.MotionEvent.axisFromString("") + 46338))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr4[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 286 - android.text.TextUtils.getTrimmedLength(""), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (SdkCoreBusinessLogicModuleImpl) {
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 44, 1629 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    e(0, 11, (byte) -1, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!getGpoResponse) {
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
        getumdgeneration.values = cArr2.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            int i4 = $11 + 105;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = getumdgeneration.valueOf;
                int i6 = getumdgeneration.values;
                throw new java.lang.ArithmeticException();
            }
            cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1629, (char) android.text.TextUtils.indexOf("", "", 0, 0));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                e(0, 11, (byte) -1, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    private static void b(java.lang.String str, boolean z, int[] iArr, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        int i2 = $11 + 97;
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
        char[] cArr = IccPrivateKeyCrtComponentsJson;
        byte b = -1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i5];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr[i9]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 29, android.graphics.ImageFormat.getBitsPerPixel(i3) + 2808, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                        java.lang.Object[] objArr3 = new java.lang.Object[i5];
                        e(0, 2, b, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 0;
                    i5 = 1;
                    b = -1;
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
        char[] cArr3 = new char[i6];
        java.lang.System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr2 != null) {
            $10 = ($11 + 83) % 128;
            char[] cArr4 = new char[i6];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i6) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = $11 + 115;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 2836 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            e(0, 0, (byte) -1, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                        }
                        cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i12 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.MeasureSpec.getMode(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2837, (char) android.graphics.Color.alpha(0));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        e(0, 0, (byte) -1, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i13 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43, 2880 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                        byte length2 = (byte) $$d.length;
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        e(0, length2, (byte) (length2 - 5), objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr4[i13] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.getOffsetAfter("", 0), android.graphics.ImageFormat.getBitsPerPixel(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i14 = i6 - i8;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i14, i8);
            java.lang.System.arraycopy(cArr5, i8, cArr3, 0, i14);
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
                $11 = ($10 + 77) % 128;
                cArr6[getaccounttype.writeReplace] = cArr3[(i6 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i15 = 0;
            while (true) {
                getaccounttype.writeReplace = i15;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                i15 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void valueOf() {
        IccPrivateKeyCrtComponentsJson = new char[]{16857, 16773, 16800, 16803, 16802, 16829, 16815, 16799, 16768, 16789, 16804, 16804, 16774, 16740, 16653, 16645, 16645, 16743, 16740, 16653, 16645, 16645, 16743, 16740, 16644, 16641, 16736, 16741, 16651, 16647, 16666, 16762, 16742, 16646, 16644, 16642, 16671, 16643, 16649, 16740, 16765, 16641, 16643, 16644, 16652, 16653, 16645, 16645, 16891, 16715, 16720, 16744, 16744, 16714, 16715, 16720, 16744, 16744, 16714, 16715, 16747, 16740, 16711, 16714, 16749, 16743, 16740, 16747, 16715, 16717, 16749, 16747, 16745, 16738, 16742, 16748, 16715, 16715, 16742, 16745, 16748, 16711, 16706, 16739, 16746, 16720, 16750, 16712, 16704, 16739, 16813, 16757, 16759, 16647, 16645, 16646, 16646, 16640, 16650, 16756, 16650, 16647, 16646, 16648, 16886, 16800, 16804, 16808, 16812, 16804, 16800, 16802, 16800, 16789, 16789, 16804, 16804, 16805, 16808, 16802, 16788, 16790, 16781, 16716, 16805, 16809, 16817, 16817, 16825, 16772, 16793, 16736, 16728, 16803, 16662, 16766, 16766, 16666, 16662, 16659, 16762, 16764, 16668, 16642, 16671, 16670, 16640, 16670, 16664, 16887, 16803, 16774, 16705, 16715, 16712, 16705, 16884, 16802, 16780, 16782, 16782, 16774, 16831, 16830, 16807, 16810, 16802, 16829, 16798, 16884, 16797, 16811, 16804, 16806, 16810, 16780, 16772, 16831, 16777, 16783, 16804, 16805, 16813, 16851, 16795, 16806, 16812, 16809, 16808, 16810, 16808, 16851, 16890, 16808, 16810, 16812, 16809, 16801, 16803, 16804, 16808, 16800, 16800, 16810, 16803, 16884, 16831, 16800, 16807, 16774, 16775, 16808, 16802, 16830, 16805, 16807, 16809, 16813, 16807, 16809, 16793, 16815, 16831, 16807, 16807, 16800, 16801, 16800, 16800, 16791, 16886, 16799, 16831, 16807, 16890, 16800, 16815, 16815, 16830, 16804, 16809, 16804, 16806, 16788, 16813, 16828, 16807, 16805, 16791, 16790, 16830};
        getAid = new char[]{10844, 10768, 10774, 10771, 10754, 10778, 10773, 10783, 10759, 10780, 10781, 10764, 10766, 10752, 10755, 10769, 10758, 10845, 10784, 10775, 10798, 10779, 10790, 10757, 10777, 10756, 10803, 10802, 10789, 10842, 10839, 10873, 10776, 10793, 10800, 10787, 10815, 10810};
        SdkCoreAlternateContactlessPaymentDataImpl = -143185297;
        getGpoResponse = true;
        SdkCoreBusinessLogicModuleImpl = true;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getCiacDecline = 0;
        getCvrMaskAnd = 1;
        valueOf();
        DigitizedCardProfile = (char) 9703;
        AlternateContactlessPaymentDataJson = (char) 50834;
        RecordsJson = (char) 35301;
        getProfileVersion = (char) 51828;
        getCvrMaskAnd = (getCiacDecline + 13) % 128;
    }

    static void init$1() {
        $$d = new byte[]{85, 6, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -50};
        $$e = 15;
    }

    static void init$0() {
        $$a = new byte[]{13, com.visa.cbp.getEncExpo.kernelVersion, 116, -36, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5};
        $$b = 98;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:361|362|363|364|365|(2:367|368)|369|370|371|372|(3:374|(2:376|(2:378|(2:380|(10:384|385|386|387|(0)|390|391|118|119|(0)(0)))(1:395))(1:396))(1:397)|393)|398|399|400|401|402|403) */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x1201, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x1210, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x1206, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x167c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x167d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x1b07 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x1336 A[Catch: IOException -> 0x14a9, all -> 0x1591, TryCatch #34 {IOException -> 0x14a9, blocks: (B:370:0x1284, B:372:0x1319, B:374:0x1336, B:376:0x1354, B:378:0x1371, B:380:0x138b, B:382:0x13a5), top: B:369:0x1284 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x143a A[Catch: all -> 0x0a5b, TryCatch #43 {all -> 0x0a5b, blocks: (B:5:0x007f, B:7:0x008b, B:8:0x00ce, B:12:0x018e, B:14:0x01d1, B:15:0x0219, B:22:0x0309, B:24:0x0317, B:25:0x0360, B:29:0x0403, B:31:0x044b, B:32:0x049a, B:38:0x0575, B:40:0x0583, B:41:0x05cc, B:45:0x0690, B:47:0x06cf, B:48:0x071c, B:54:0x07ff, B:56:0x080d, B:57:0x0858, B:61:0x0902, B:63:0x0942, B:64:0x098e, B:68:0x09bb, B:70:0x09f9, B:71:0x0a46, B:75:0x074a, B:77:0x0780, B:78:0x07cc, B:81:0x04c8, B:83:0x04f9, B:84:0x0542, B:87:0x0247, B:89:0x028a, B:90:0x02d9, B:103:0x0b0e, B:105:0x0b2d, B:106:0x0b8e, B:112:0x0c71, B:114:0x0cb7, B:115:0x0d02, B:123:0x1699, B:125:0x16cd, B:126:0x171c, B:150:0x187d, B:152:0x189b, B:153:0x18eb, B:159:0x19a5, B:161:0x19e3, B:162:0x1a2e, B:174:0x1a6e, B:176:0x1aa4, B:177:0x1aea, B:185:0x1b25, B:187:0x1b33, B:188:0x1b7b, B:192:0x1c4c, B:194:0x1c8a, B:195:0x1cdb, B:201:0x1dcf, B:203:0x1ddd, B:204:0x1e29, B:208:0x1ee7, B:210:0x1f1f, B:211:0x1f6d, B:217:0x205e, B:219:0x206c, B:220:0x20b2, B:224:0x215c, B:226:0x2198, B:227:0x21e6, B:233:0x22e5, B:235:0x22f1, B:236:0x2337, B:240:0x23f6, B:242:0x243b, B:243:0x2485, B:247:0x24b4, B:249:0x24f1, B:250:0x253b, B:254:0x2217, B:256:0x2269, B:257:0x22b2, B:260:0x1f9b, B:262:0x1fdd, B:263:0x202b, B:266:0x1d0a, B:268:0x1d50, B:269:0x1d9d, B:279:0x0d5a, B:281:0x0d78, B:282:0x0dca, B:288:0x0e93, B:290:0x0ec7, B:291:0x0f14, B:387:0x13e6, B:389:0x143a, B:390:0x1482, B:546:0x15d2, B:548:0x1614, B:549:0x165f), top: B:2:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x155b A[Catch: Exception -> 0x1574, all -> 0x1591, IOException -> 0x1595, TryCatch #8 {Exception -> 0x1574, blocks: (B:332:0x153d, B:334:0x1543, B:335:0x1544, B:434:0x1509, B:490:0x1514, B:492:0x151f, B:493:0x1520, B:496:0x152d, B:498:0x1534, B:499:0x1535, B:514:0x1555, B:516:0x155b, B:517:0x155c), top: B:306:0x0fd2 }] */
    /* JADX WARN: Removed duplicated region for block: B:517:0x155c A[Catch: Exception -> 0x1574, all -> 0x1591, IOException -> 0x1595, TRY_LEAVE, TryCatch #8 {Exception -> 0x1574, blocks: (B:332:0x153d, B:334:0x1543, B:335:0x1544, B:434:0x1509, B:490:0x1514, B:492:0x151f, B:493:0x1520, B:496:0x152d, B:498:0x1534, B:499:0x1535, B:514:0x1555, B:516:0x155b, B:517:0x155c), top: B:306:0x0fd2 }] */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v274 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r31v10 */
    /* JADX WARN: Type inference failed for: r31v12 */
    /* JADX WARN: Type inference failed for: r31v15 */
    /* JADX WARN: Type inference failed for: r31v16 */
    /* JADX WARN: Type inference failed for: r31v17 */
    /* JADX WARN: Type inference failed for: r31v18 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r4v128 */
    /* JADX WARN: Type inference failed for: r4v241 */
    /* JADX WARN: Type inference failed for: r4v343 */
    /* JADX WARN: Type inference failed for: r4v344 */
    /* JADX WARN: Type inference failed for: r4v563 */
    /* JADX WARN: Type inference failed for: r5v158 */
    /* JADX WARN: Type inference failed for: r5v159 */
    /* JADX WARN: Type inference failed for: r5v160 */
    /* JADX WARN: Type inference failed for: r5v161 */
    /* JADX WARN: Type inference failed for: r5v162 */
    /* JADX WARN: Type inference failed for: r5v163 */
    /* JADX WARN: Type inference failed for: r5v164 */
    /* JADX WARN: Type inference failed for: r5v178 */
    /* JADX WARN: Type inference failed for: r5v179 */
    /* JADX WARN: Type inference failed for: r5v204 */
    /* JADX WARN: Type inference failed for: r5v206 */
    /* JADX WARN: Type inference failed for: r6v389 */
    /* JADX WARN: Type inference failed for: r6v434 */
    /* JADX WARN: Type inference failed for: r6v503 */
    /* JADX WARN: Type inference failed for: r6v532 */
    /* JADX WARN: Type inference failed for: r8v106 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Type inference failed for: r9v121, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(android.content.Context context, int i, int i2, int i3) {
        java.lang.Object invoke;
        int i4;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Integer num3;
        int i5;
        java.lang.Object[] objArr;
        char c;
        int i6;
        java.lang.Integer num4;
        java.lang.Object[] objArr2;
        char c2;
        java.lang.Object[] objArr3;
        int i7;
        java.lang.Object[] objArr4;
        int i8;
        int i9;
        java.lang.Object[] objArr5;
        char c3;
        java.lang.String str;
        java.lang.String str2;
        int i10;
        java.lang.String[] split;
        ?? r5;
        ?? r31;
        java.lang.String str3;
        ?? r4;
        ?? r2;
        java.lang.String str4;
        int i11;
        int i12;
        java.lang.String[] strArr;
        java.lang.String str5;
        java.lang.Runtime runtime;
        java.lang.Object[] objArr6;
        java.lang.Process exec;
        java.lang.Throwable th;
        java.lang.Throwable cause;
        java.lang.Object obj;
        java.lang.Object newInstance;
        java.lang.Throwable th2;
        java.lang.Object newInstance2;
        java.lang.Integer num5;
        java.lang.InterruptedException interruptedException;
        java.lang.Throwable th3;
        java.lang.String str6;
        java.lang.String str7;
        int length;
        int i13;
        java.lang.Integer num6;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object[] objArr7;
        int i14;
        java.lang.Object[] objArr8;
        int i15;
        java.lang.Object[] objArr9;
        int i16;
        int i17 = i;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a(127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), null, null, "\u008a\u0098\u008b\u0097\u008b\u008a\u0091\u0084\u008d\u008e\u0091\u0096\u0088\u0088\u0095\u0092\u0086\u0088\u0092\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0092\u008f\u0091\u008a\u0090\u008f\u008b\u008d", objArr10);
        java.lang.String str8 = (java.lang.String) objArr10[0];
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        b("\u0001\u0001\u0001\u0001\u0001\u0001\u0001", true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 7, 21, 0}, objArr11);
        java.lang.String str9 = (java.lang.String) objArr11[0];
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a(127 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), null, null, "\u008f\u008d\u0085\u0090\u0089\u009b\u0092\u009a\u008b\u008d\u0096\u0092\u008d\u0087\u008d\u0099", objArr12);
        java.lang.String str10 = (java.lang.String) objArr12[0];
        int i18 = -1347122530;
        try {
            if (context == null) {
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                b("\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001", false, new int[]{0, 12, 0, 0}, objArr13);
                java.lang.Object[] objArr14 = {(java.lang.String) objArr13[0]};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                java.lang.Object obj5 = obj4;
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.argb(0, 0, 0, 0), 3161 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.View.resolveSize(0, 0) + 33099));
                    byte b = (byte) (-$$a[52]);
                    byte b2 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    c(b, b2, (short) (b2 + 1), objArr15);
                    java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, method);
                    obj5 = method;
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr14)).longValue();
                long j = longValue | (-1073787320);
                long j2 = i17 == true ? 1L : 0L;
                long j3 = ~j2;
                long j4 = j3 | 1073787319;
                long j5 = ~(j | j2);
                long j6 = ((503 * longValue) - 540115021960L) + (j * (-502)) + (((~((~longValue) | 1073787319)) | (~j4) | j5) * (-502)) + (((~(longValue | j4)) | j5) * 502) + 1981258058;
                int i19 = (int) (j6 >> 32);
                int i20 = ~((-2629697) | (i17 == true ? 1 : 0));
                int i21 = ~(i17 == true ? 1 : 0);
                if (((i19 & (((92406290 | i20) * (-476)) + 1221212194 + (i20 * 952) + ((~((-2629697) | i21)) * 476))) | (((int) j6) & ((((~(1544281445 | i21)) | (-1584128000)) * 98) + 529229356 + (((~((-107055036) | i21)) | 1544281445 | (~(107055035 | (i17 == true ? 1 : 0)))) * (-49)) + (((~(1544281445 | (i17 == true ? 1 : 0))) | 1477072964) * 49)))) != 0) {
                    objArr7 = new java.lang.Object[]{new int[]{i17 == true ? 1 : 0}, new int[]{(i17 == true ? 1 : 0) ^ 50}, null, null, new int[1]};
                    java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-657189976) | i21)) | 553732166) | (~(372945969 | i21))) * 464) - 2010063960) + (((-103457810) | (i17 == true ? 1 : 0)) * (-464)) + (((~(372945969 | (i17 == true ? 1 : 0))) | 553732166) * 464))};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj7 = obj6;
                    if (obj6 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.widget.ExpandableListView.getPackedPositionChild(0L), (-16774503) - android.graphics.Color.rgb(0, 0, 0), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                        byte[] bArr = $$a;
                        byte b3 = (byte) (-bArr[52]);
                        byte b4 = bArr[41];
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        c(b3, b4, b4, objArr17);
                        java.lang.reflect.Method method2 = cls2.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                        obj7 = method2;
                    }
                    i14 = 0;
                    ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr16)).intValue();
                } else {
                    objArr7 = new java.lang.Object[]{new int[]{i17 == true ? 1 : 0}, new int[]{i17 == true ? 1 : 0}, null, null, new int[1]};
                    java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(314992026 | i21)) | 715143918) * (-328)) - 2064430504) + ((715143918 | (i17 == true ? 1 : 0)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-314992027) | (i17 == true ? 1 : 0))) | 41951370 | (~(988184574 | i21))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))};
                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj9 = obj8;
                    if (obj8 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte[] bArr2 = $$a;
                        byte b5 = (byte) (-bArr2[52]);
                        byte b6 = bArr2[41];
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        c(b5, b6, b6, objArr19);
                        java.lang.reflect.Method method3 = cls3.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                        obj9 = method3;
                    }
                    i14 = 0;
                    ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr18)).intValue();
                }
                if (((int[]) objArr7[1])[i14] != i17) {
                    return objArr7;
                }
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                a(127 - android.view.View.MeasureSpec.getMode(i14), null, null, "\u0085\u008e\u008d\u0088\u0082\u008c\u0085\u008b\u008a\u0089\u0088\u0087\u0081\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr20);
                java.lang.Object[] objArr21 = {(java.lang.String) objArr20[i14]};
                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                java.lang.Object obj11 = obj10;
                if (obj10 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.View.MeasureSpec.makeMeasureSpec(i14, i14), 3162 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.text.TextUtils.getCapsMode("", i14, i14) + 33099));
                    byte b7 = (byte) (-$$a[52]);
                    byte b8 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    c(b7, b8, (short) (b8 + 1), objArr22);
                    java.lang.reflect.Method method4 = cls4.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, method4);
                    obj11 = method4;
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr21)).longValue();
                long j7 = j3 | (-1196529869);
                long j8 = ((-494) * longValue2) + 591085755286L + ((~(longValue2 | (-1196529869))) * (-495)) + (495 * j7) + (((~((~longValue2) | 1196529868)) | (~j7)) * 495) + 2104000607;
                int i22 = (int) (j8 >> 32);
                int i23 = ~(1529689848 | (i17 == true ? 1 : 0));
                if (((i22 & ((((~(182104492 | i21)) | 1610942035) * (-241)) + 1105483017 + (((~(1793046527 | i21)) | 8388868) * 241))) | (((int) j8) & ((((~((-1529689849) | (i17 == true ? 1 : 0))) | 1260925528 | (~((-1328051038) | (i17 == true ? 1 : 0)))) * (-880)) + 818884229 + (((~((-1529689849) | i21)) | 1328051037 | i23) * (-880)) + (i23 * 880)))) != 0) {
                    objArr8 = new java.lang.Object[]{new int[]{i17 == true ? 1 : 0}, new int[]{(i17 == true ? 1 : 0) ^ 60}, null, null, new int[1]};
                    java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-238929074) | i21)) | (~((-791206872) | (i17 == true ? 1 : 0)))) * 1900) + 1653532632 + (((~(791206871 | i21)) | (~(238929073 | (i17 == true ? 1 : 0)))) * (-950)) + (((~(791206871 | (i17 == true ? 1 : 0))) | (~(238929073 | i21))) * 950))};
                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj13 = obj12;
                    if (obj12 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 50, 2713 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                        byte[] bArr3 = $$a;
                        byte b9 = (byte) (-bArr3[52]);
                        byte b10 = bArr3[41];
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        c(b9, b10, b10, objArr24);
                        java.lang.reflect.Method method5 = cls5.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method5);
                        obj13 = method5;
                    }
                    i15 = 0;
                    ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr23)).intValue();
                } else {
                    objArr8 = new java.lang.Object[]{new int[]{i17 == true ? 1 : 0}, new int[]{i17 == true ? 1 : 0}, null, null, new int[1]};
                    java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(928374655 | (i17 == true ? 1 : 0))) | 101761289) * (-756)) - 1119310832) + ((928374655 | i21) * 756))};
                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj15 = obj14;
                    if (obj14 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 50, 2713 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        byte[] bArr4 = $$a;
                        byte b11 = (byte) (-bArr4[52]);
                        byte b12 = bArr4[41];
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        c(b11, b12, b12, objArr26);
                        java.lang.reflect.Method method6 = cls6.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method6);
                        obj15 = method6;
                    }
                    i15 = 0;
                    ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr25)).intValue();
                }
                if (((int[]) objArr8[1])[i15] != i17) {
                    return objArr8;
                }
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                b("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", i15, new int[]{12, 36, 97, i15}, objArr27);
                java.lang.Object[] objArr28 = {(java.lang.String) objArr27[i15]};
                java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                java.lang.Object obj17 = obj16;
                if (obj16 == null) {
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.getOffsetAfter("", 0), 3209 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 33099));
                    byte[] bArr5 = $$a;
                    byte b13 = bArr5[14];
                    byte b14 = bArr5[49];
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    c(b13, b14, (short) (b14 | 9), objArr29);
                    java.lang.reflect.Method method7 = cls7.getMethod((java.lang.String) objArr29[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method7);
                    obj17 = method7;
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr28)).longValue();
                long j9 = ~longValue3;
                long j10 = (-29229205) | longValue3;
                long j11 = ~(j3 | longValue3);
                long j12 = ((longValue3 * 85) - 2484482425L) + (((~(j9 | 29229204)) | (~(j3 | 29229204)) | (~(j9 | j3)) | (~(j10 | j2))) * (-84)) + (((~(j9 | j2)) | (-29229205) | j11) * (-84)) + (((~j10) | j11) * 84) + 1024664108;
                if (((((int) j12) & ((((~((-352338054) | (i17 == true ? 1 : 0))) * 623) - 699215446) + (((-2142108416) | i21) * (-623)) + (((~((-528610030) | (i17 == true ? 1 : 0))) | 352338053 | (~((-1965836440) | (i17 == true ? 1 : 0)))) * 623))) | (((((~(1357850879 | (i17 == true ? 1 : 0))) | 151027968 | (~((-1499890006) | (i17 == true ? 1 : 0)))) * (-754)) + 1160545014 + (((~((-151027969) | (i17 == true ? 1 : 0))) | (~((-1348862038) | i21))) * (-754)) + ((1357850879 | i21) * 754)) & ((int) (j12 >> 32)))) != 0) {
                    objArr9 = new java.lang.Object[]{new int[]{i17 == true ? 1 : 0}, new int[]{(i17 == true ? 1 : 0) ^ 80}, null, null, new int[1]};
                    java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((709470253 | i21) * (-757)) - 997554046) + ((~((-286543955) | (i17 == true ? 1 : 0))) * 1514) + (((~((-320665692) | i21)) | 34121737 | (~(996014207 | (i17 == true ? 1 : 0)))) * 757))};
                    java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj19 = obj18;
                    if (obj18 == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50, android.text.TextUtils.getOffsetBefore("", 0) + 2713, (char) android.text.TextUtils.getCapsMode("", 0, 0));
                        byte[] bArr6 = $$a;
                        byte b15 = (byte) (-bArr6[52]);
                        byte b16 = bArr6[41];
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        c(b15, b16, b16, objArr31);
                        java.lang.reflect.Method method8 = cls8.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method8);
                        obj19 = method8;
                    }
                    i16 = 0;
                    ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr30)).intValue();
                } else {
                    objArr9 = new java.lang.Object[]{new int[]{i17 == true ? 1 : 0}, new int[]{i17 == true ? 1 : 0}, null, null, new int[1]};
                    java.lang.Object[] objArr32 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-401289270) | (i17 == true ? 1 : 0))) | (-628846676)) * (-964)) + 708127692 + (((~((-401289270) | i21)) | 310378532) * (-964)))};
                    java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj21 = obj20;
                    if (obj20 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, 2713 - android.view.View.MeasureSpec.getSize(0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                        byte[] bArr7 = $$a;
                        byte b17 = (byte) (-bArr7[52]);
                        byte b18 = bArr7[41];
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        c(b17, b18, b18, objArr33);
                        java.lang.reflect.Method method9 = cls9.getMethod((java.lang.String) objArr33[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method9);
                        obj21 = method9;
                    }
                    i16 = 0;
                    ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr32)).intValue();
                }
                if (((int[]) objArr9[1])[i16] != i17) {
                    return objArr9;
                }
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                b("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", i16, new int[]{48, 42, 60, i16}, objArr34);
                java.lang.Object[] objArr35 = {(java.lang.String) objArr34[i16]};
                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                java.lang.Object obj23 = obj22;
                if (obj22 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3161, (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 33099));
                    byte[] bArr8 = $$a;
                    byte b19 = bArr8[14];
                    byte b20 = bArr8[49];
                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                    c(b19, b20, (short) (b20 | 9), objArr36);
                    java.lang.reflect.Method method10 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method10);
                    obj23 = method10;
                }
                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr35)).longValue();
                long j13 = ~longValue4;
                long j14 = ((984 * longValue4) - 1841038662750L) + ((936915350 | j13) * 983) + (((~(j13 | j3)) | (-936915351)) * (-983)) + (((~(longValue4 | (-936915351))) | (~(j3 | (-936915351)))) * 983) + 58519553;
                if (((((int) (j14 >> 32)) & ((((~(1774850613 | (i17 == true ? 1 : 0))) | (-1774950976)) * 336) + 501358106 + (((~((-1082890272) | (i17 == true ? 1 : 0))) | 1082789909) * (-168)) + (((~((-1082890272) | i21)) | 1774850613) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) | (((int) j14) & (((((~((-582250708) | i21)) | 2019477117) * (-865)) - 1505520890) + ((~(582250707 | (i17 == true ? 1 : 0))) * 865) + (((~(582250707 | i21)) | (~(2019477117 | i21))) * 865)))) != 0) {
                    java.lang.Object[] objArr37 = {new int[]{i17 == true ? 1 : 0}, new int[]{(i17 == true ? 1 : 0) ^ 90}, null, null, new int[1]};
                    java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1027071292) | i21)) | (-3064654)) * (-865)) + 2032614838 + ((~((i17 == true ? 1 : 0) | 1027071291)) * 865) + (((~(i21 | (-3064654))) | (~(1027071291 | i21))) * 865))};
                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj25 = obj24;
                    if (obj24 == null) {
                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51, 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                        byte[] bArr9 = $$a;
                        byte b21 = (byte) (-bArr9[52]);
                        byte b22 = bArr9[41];
                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                        c(b21, b22, b22, objArr39);
                        java.lang.reflect.Method method11 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method11);
                        obj25 = method11;
                    }
                    ((int[]) objArr37[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr38)).intValue();
                    return objArr37;
                }
                java.lang.Object[] objArr40 = {new int[]{i17 == true ? 1 : 0}, new int[]{i17 == true ? 1 : 0}, null, null, new int[1]};
                java.lang.Object[] objArr41 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-553684785) | i21)) | (~(792698878 | (i17 == true ? 1 : 0)))) * 988) - 1706726700) + (((~(i21 | 792698878)) | (~((i17 == true ? 1 : 0) | (-791121851))) | 237437066) * 988))};
                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                java.lang.Object obj27 = obj26;
                if (obj26 == null) {
                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                    byte[] bArr10 = $$a;
                    byte b23 = (byte) (-bArr10[52]);
                    byte b24 = bArr10[41];
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    c(b23, b24, b24, objArr42);
                    java.lang.reflect.Method method12 = cls12.getMethod((java.lang.String) objArr42[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method12);
                    obj27 = method12;
                }
                ((int[]) objArr40[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr41)).intValue();
                return objArr40;
            }
            java.lang.Integer num7 = -604620973;
            java.lang.Integer num8 = 269015277;
            try {
                java.lang.Object[] objArr43 = new java.lang.Object[1];
                a(android.graphics.Color.red(0) + 127, null, null, "\u0084\u0094\u0085\u0084\u008b\u008a\u0093\u0092\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0092\u008f\u0091\u008a\u0090\u008f\u008b\u008d", objArr43);
                java.lang.Class<?> cls13 = java.lang.Class.forName((java.lang.String) objArr43[0]);
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                b("\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000", false, new int[]{90, 14, 98, 5}, objArr44);
                java.lang.String str11 = (java.lang.String) cls13.getMethod((java.lang.String) objArr44[0], null).invoke(context, null);
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                a(127 - android.view.View.resolveSize(0, 0), null, null, "\u0084\u0094\u0085\u0084\u008b\u008a\u0093\u0092\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0092\u008f\u0091\u008a\u0090\u008f\u008b\u008d", objArr45);
                java.lang.Class<?> cls14 = java.lang.Class.forName((java.lang.String) objArr45[0]);
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                b("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001", false, new int[]{104, 18, 0, 13}, objArr46);
                invoke = cls14.getMethod((java.lang.String) objArr46[0], null).invoke(context, null);
                int indexOf = ((java.lang.String) java.lang.Class.forName(str8).getField(str9).get(invoke)).indexOf(str11);
                if (indexOf > 0) {
                    java.lang.String str12 = (java.lang.String) java.lang.Class.forName(str8).getField(str9).get(invoke);
                    if (str12.length() >= 16) {
                        int i24 = 0;
                        while (i24 <= str12.length() - 16) {
                            java.lang.Object[] objArr47 = {str12.substring(i24, i24 + 16), 931995};
                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj28 == null) {
                                str3 = str12;
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28, 2594 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                byte b25 = $$a[41];
                                num = num7;
                                num2 = num8;
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                c(b25, (byte) (b25 | 34), 653, objArr48);
                                java.lang.reflect.Method method13 = cls15.getMethod((java.lang.String) objArr48[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method13);
                                obj3 = method13;
                            } else {
                                num = num7;
                                num2 = num8;
                                str3 = str12;
                                obj3 = obj28;
                            }
                            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr47)).longValue();
                            long j15 = i17 == true ? 1L : 0L;
                            java.lang.String str13 = str9;
                            long j16 = ~j15;
                            java.lang.String str14 = str10;
                            int i25 = i24;
                            java.lang.String str15 = str8;
                            long j17 = (603 * longValue5) + 320937976664L + (((~(j16 | (-1062708533))) | longValue5) * (-602)) + (((~((~longValue5) | (-1062708533))) | (~((-1062708533) | j15)) | (~(1062708532 | j16 | longValue5))) * (-301)) + ((~(longValue5 | j16)) * 301) + 194391992;
                            int i26 = ~(i17 == true ? 1 : 0);
                            if (((((int) j17) & ((((~((-845687811) | (i17 == true ? 1 : 0))) | (~(2012053075 | (i17 == true ? 1 : 0)))) * 69) + 2012816160 + (((~((-862534675) | (i17 == true ? 1 : 0))) | 16846864 | (~(1995206211 | (i17 == true ? 1 : 0)))) * (-69)) + 2007358341)) | (((int) (j17 >> 32)) & (((((~((-652196349) | i26)) | r9) * 1150) - 334238508) + (((~((-785030063) | (i17 == true ? 1 : 0))) | (~(785030062 | i26))) * (-575)) + (((~(652196348 | i26)) | (~((-652196349) | (i17 == true ? 1 : 0)))) * 575)))) == -725904754) {
                                objArr = new java.lang.Object[]{new int[1], new int[1], null, r5, new int[1]};
                                java.lang.String str16 = (java.lang.String) java.lang.Class.forName(str15).getField(str13).get(invoke);
                                ((int[]) objArr[0])[0] = i17 == true ? 1 : 0;
                                ((int[]) objArr[1])[0] = (i17 == true ? 1 : 0) ^ 20;
                                java.lang.Object[] objArr49 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-473568581) | i26)) | (~((-556567365) | (i17 == true ? 1 : 0)))) | (~(556567364 | i26))) * 959) - 1484134773) + (((~((-556567365) | i26)) | (~((-473568581) | (i17 == true ? 1 : 0))) | (~(556567364 | (i17 == true ? 1 : 0)))) * 959))};
                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj30 = obj29;
                                if (obj29 == null) {
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 50, 2713 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    byte[] bArr11 = $$a;
                                    byte b26 = (byte) (-bArr11[52]);
                                    byte b27 = bArr11[41];
                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                    c(b26, b27, b27, objArr50);
                                    java.lang.reflect.Method method14 = cls16.getMethod((java.lang.String) objArr50[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method14);
                                    obj30 = method14;
                                }
                                ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr49)).intValue();
                                i4 = i17 == true ? 1 : 0;
                                num6 = -1347122530;
                                num3 = num6;
                                i6 = 1;
                                c = 0;
                                if (((int[]) objArr[i6])[c] != i4) {
                                    return objArr;
                                }
                                int[] iArr = new int[i6];
                                int[] iArr2 = new int[i6];
                                iArr[c] = i4;
                                iArr2[c] = i4;
                                java.lang.Object[] objArr51 = {iArr, iArr2, null, null, new int[i6]};
                                int i27 = ~i4;
                                int i28 = ~((-367040087) | i4);
                                java.lang.Object[] objArr52 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-367040087) | i27)) | 274764868) * (-245)) + 1510915836 + (i28 * (-245)) + ((i28 | 663095858) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))};
                                java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                java.lang.Object obj32 = obj31;
                                if (obj31 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.View.resolveSize(0, 0) + 2713, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                    byte[] bArr12 = $$a;
                                    byte b28 = (byte) (-bArr12[52]);
                                    byte b29 = bArr12[41];
                                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                                    c(b28, b29, b29, objArr53);
                                    java.lang.reflect.Method method15 = cls17.getMethod((java.lang.String) objArr53[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, method15);
                                    obj32 = method15;
                                }
                                ((int[]) objArr51[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr52)).intValue();
                                if (((int[]) objArr51[1])[0] != i4) {
                                    return objArr51;
                                }
                                if ((i2 & 1) == 0) {
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    b("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001", false, new int[]{192, 13, 0, 10}, objArr54);
                                    try {
                                        java.lang.Object[] objArr55 = {(java.lang.String) objArr54[0]};
                                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, null, null, "\u0084\u0094\u0085\u0084\u008b\u008a\u0093\u0092\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0092\u008f\u0091\u008a\u0090\u008f\u008b\u008d", objArr56);
                                        java.lang.Class<?> cls18 = java.lang.Class.forName((java.lang.String) objArr56[0]);
                                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                                        a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, null, null, "\u0085\u008e\u0091\u0087\u0090\u0085£\u0086\u0085\u0084\u0082\u0083£\u0084\u0085\u009a", objArr57);
                                        java.lang.Object invoke2 = cls18.getMethod((java.lang.String) objArr57[0], java.lang.String.class).invoke(context, objArr55);
                                        if (invoke2 != null) {
                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                            a(128 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, null, "\u0090\u0085\u009a\u008d\u008b\u008d¦\u0083\u008e\u0091\u0096\u008a¥\u0085\u008e\u0091\u0087\u0085¤\u0092\u008b\u0091\u0086\u008f\u008d\u0092\u0088\u0088\u008d\u0092\u008f\u0091\u008a\u0090\u008f\u008b\u008d", objArr58);
                                            java.lang.Class<?> cls19 = java.lang.Class.forName((java.lang.String) objArr58[0]);
                                            java.lang.Object[] objArr59 = new java.lang.Object[1];
                                            a(127 - (android.os.Process.myTid() >> 22), null, null, "\u0082\u008b\u0091\u0086\u008f\u0095\u0085\u0087\u0091\u0084\u008e\u0095\u0084\u0085\u009a", objArr59);
                                            java.util.List list = (java.util.List) cls19.getMethod((java.lang.String) objArr59[0], null).invoke(invoke2, null);
                                            if (list != null) {
                                                java.util.Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    java.lang.Object next = it.next();
                                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                    b("\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", true, new int[]{205, 29, 0, 12}, objArr60);
                                                    java.lang.Class<?> cls20 = java.lang.Class.forName((java.lang.String) objArr60[0]);
                                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                    b("\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000", false, new int[]{90, 14, 98, 5}, objArr61);
                                                    java.lang.String str17 = (java.lang.String) cls20.getMethod((java.lang.String) objArr61[0], null).invoke(next, null);
                                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.getCapsMode("", 0, 0) + 127, null, null, "\u0090\u0085\u009a\u008d\u008b\u008d¦\u0083\u008e\u0091\u0096\u008a¥\u0085\u008e\u0091\u0087\u0085¤\u0092\u008b\u0091\u0086\u008f\u008d\u0092\u0088\u0088\u008d\u0092\u008f\u0091\u008a\u0090\u008f\u008b\u008d", objArr62);
                                                    java.lang.Class<?> cls21 = java.lang.Class.forName((java.lang.String) objArr62[0]);
                                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                    b("\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 17, 0, 0}, objArr63);
                                                    if (((java.lang.Boolean) cls21.getMethod((java.lang.String) objArr63[0], java.lang.String.class).invoke(invoke2, str17)).booleanValue() && str17.length() >= 20) {
                                                        int i29 = 0;
                                                        while (i29 <= str17.length() - 20) {
                                                            java.lang.Object[] objArr64 = {str17.substring(i29, i29 + 20), 931995};
                                                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                            java.lang.Object obj34 = obj33;
                                                            if (obj33 == null) {
                                                                java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 28, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2595, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                                                                byte b30 = $$a[41];
                                                                java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                                c(b30, (byte) (b30 | 34), 653, objArr65);
                                                                java.lang.reflect.Method method16 = cls22.getMethod((java.lang.String) objArr65[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method16);
                                                                obj34 = method16;
                                                            }
                                                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, objArr64)).longValue();
                                                            long j18 = ~(i4 | longValue6);
                                                            java.lang.Object obj35 = invoke2;
                                                            java.util.Iterator it2 = it;
                                                            long j19 = ((111 * longValue6) - 83512756938L) + ((j18 | (-766172083)) * (-220)) + (((~(longValue6 | 766172082)) | j18) * 220) + (((~((~longValue6) | 766172082)) | (~(longValue6 | (-766172083)))) * 110) + 490928442;
                                                            int i30 = ~((-1074004043) | i4);
                                                            if (((((int) j19) & (((((~(1436532137 | i27)) | (~((-694273) | i4))) * (-272)) - 833857595) + (((~(85891233 | i4)) | 1350640904) * (-272)) + (((~((-85891234) | i4)) | (-1351335177)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((int) (j19 >> 32)) & (((171976960 | i30) * (-476)) + 1569064978 + (i30 * 952) + ((~((-1074004043) | i27)) * 476)))) == 1245577864) {
                                                                objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 70}, null, null, new int[1]};
                                                                int i31 = ~((-25769006) | i4);
                                                                java.lang.Object[] objArr66 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1004366940) | i27)) | i31) * 1150) + 1407454992 + ((i31 | (~(25769005 | i27))) * (-575)) + (((~((-1004366940) | i4)) | (~(1004366939 | i27))) * 575))};
                                                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                                                java.lang.Object obj37 = obj36;
                                                                if (obj36 == null) {
                                                                    java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 50, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2713, (char) android.view.KeyEvent.keyCodeFromString(""));
                                                                    byte[] bArr13 = $$a;
                                                                    byte b31 = (byte) (-bArr13[52]);
                                                                    byte b32 = bArr13[41];
                                                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                                    c(b31, b32, b32, objArr67);
                                                                    java.lang.reflect.Method method17 = cls23.getMethod((java.lang.String) objArr67[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, method17);
                                                                    obj37 = method17;
                                                                }
                                                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr66)).intValue();
                                                                c3 = 0;
                                                                ((int[]) objArr5[4])[0] = intValue;
                                                                if (((int[]) objArr5[1])[c3] != i4) {
                                                                    return objArr5;
                                                                }
                                                            } else {
                                                                i29++;
                                                                invoke2 = obj35;
                                                                it = it2;
                                                            }
                                                        }
                                                    }
                                                    invoke2 = invoke2;
                                                    it = it;
                                                }
                                            }
                                        }
                                        objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                        java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(1018627471 | i4)) | (-1019191296)) * 305) + 1688986866 + (((~(1018627471 | i27)) | (-11508474)) * 305))};
                                        java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                        java.lang.Object obj39 = obj38;
                                        if (obj38 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.ImageFormat.getBitsPerPixel(0), android.graphics.Color.green(0) + 2713, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                            byte[] bArr14 = $$a;
                                            byte b33 = (byte) (-bArr14[52]);
                                            byte b34 = bArr14[41];
                                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                                            c(b33, b34, b34, objArr69);
                                            java.lang.reflect.Method method18 = cls24.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, method18);
                                            obj39 = method18;
                                        }
                                        c3 = 0;
                                        ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr68)).intValue();
                                        if (((int[]) objArr5[1])[c3] != i4) {
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        java.lang.Throwable cause2 = th4.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th4;
                                    }
                                }
                                java.lang.Object[] objArr70 = new java.lang.Object[1];
                                b("\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001", false, new int[]{0, 12, 0, 0}, objArr70);
                                java.lang.Object[] objArr71 = {(java.lang.String) objArr70[0]};
                                java.lang.Integer num9 = num;
                                java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num9);
                                java.lang.Object obj41 = obj40;
                                if (obj40 == null) {
                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.view.Gravity.getAbsoluteGravity(0, 0) + 3161, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 33099));
                                    byte b35 = (byte) (-$$a[52]);
                                    byte b36 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                    c(b35, b36, (short) (b36 + 1), objArr72);
                                    java.lang.reflect.Method method19 = cls25.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num9, method19);
                                    obj41 = method19;
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, objArr71)).longValue();
                                long j20 = ~longValue7;
                                long j21 = i4;
                                long j22 = ~j21;
                                java.lang.Integer num10 = num3;
                                long j23 = (((-958) * longValue7) - 605889153952L) + (((~(j21 | (-632452145))) | (~(j20 | j22)) | (~(632452144 | j22))) * 959) + ((~(632452144 | longValue7)) * (-959)) + (((~((-632452145) | j22)) | (~(j20 | j21)) | (~(632452144 | j21))) * 959) + 275018594;
                                if (((((int) j23) & (((((~((-121646612) | i4)) | (~(i27 | (-1487569325)))) * (-406)) - 2046055477) + ((~(i27 | (-71303698))) * (-406)) + (((~(1558873021 | i4)) | (~(i27 | 121646611))) * 406))) | (((int) (j23 >> 32)) & ((((~((-1376822622) | i4)) | 34644045 | (~(i27 | 1402582365))) * 886) + 1004427976 + (((~(i27 | 1376822621)) | 60403789) * (-1772)) + ((~(i27 | 60403789)) * 886)))) != 0) {
                                    objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 50}, null, null, new int[1]};
                                    java.lang.Object[] objArr73 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i27 | (-316280450))) * 979) - 585917958) + ((713855495 | i4) * (-979)) + (((~((-316280450) | i4)) | (~(i27 | 713855495))) * 979))};
                                    num4 = num10;
                                    java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                    java.lang.Object obj43 = obj42;
                                    if (obj42 == null) {
                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 50, android.text.TextUtils.indexOf("", "", 0, 0) + 2713, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                        byte[] bArr15 = $$a;
                                        byte b37 = (byte) (-bArr15[52]);
                                        byte b38 = bArr15[41];
                                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                                        c(b37, b38, b38, objArr74);
                                        java.lang.reflect.Method method20 = cls26.getMethod((java.lang.String) objArr74[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, method20);
                                        obj43 = method20;
                                    }
                                    c2 = 0;
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj43).invoke(null, objArr73)).intValue();
                                } else {
                                    num4 = num10;
                                    objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                    java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(i27 | (-4461569))) | (~(i27 | (-940607601)))) * (-184)) + 463683272 + (((~(i27 | (-46994957))) | 42533388 | (~(i27 | (-983140989)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1330243872)};
                                    java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                    java.lang.Object obj45 = obj44;
                                    if (obj44 == null) {
                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 50, 2713 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                        byte[] bArr16 = $$a;
                                        byte b39 = (byte) (-bArr16[52]);
                                        byte b40 = bArr16[41];
                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                        c(b39, b40, b40, objArr76);
                                        java.lang.reflect.Method method21 = cls27.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, method21);
                                        obj45 = method21;
                                    }
                                    c2 = 0;
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj45).invoke(null, objArr75)).intValue();
                                }
                                if (((int[]) objArr2[1])[c2] != i4) {
                                    return objArr2;
                                }
                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                a(128 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, null, "\u0085\u008e\u008d\u0088\u0082\u008c\u0085\u008b\u008a\u0089\u0088\u0087\u0081\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr77);
                                java.lang.Object[] objArr78 = {(java.lang.String) objArr77[c2]};
                                java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num9);
                                java.lang.Object obj47 = obj46;
                                if (obj46 == null) {
                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 3161 - android.view.KeyEvent.keyCodeFromString(""), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 33098));
                                    byte b41 = (byte) (-$$a[52]);
                                    byte b42 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                    c(b41, b42, (short) (b42 + 1), objArr79);
                                    java.lang.reflect.Method method22 = cls28.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num9, method22);
                                    obj47 = method22;
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj47).invoke(null, objArr78)).longValue();
                                long j24 = ~(961285985 | longValue8);
                                long j25 = ~longValue8;
                                long j26 = (989 * longValue8) + 1898539822350L + ((j21 | j24) * 988) + (((~(j22 | (-961285986))) | (~(j25 | (-961285986)))) * (-1976)) + (((~(j25 | j21)) | j24 | (~(j22 | longValue8))) * 988) + 1868756724;
                                if (((((int) j26) & ((((~(i27 | 303812271)) | (~(1133414138 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1459102363 + (((~(i27 | (-269568006))) | (~((-1099169873) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) (j26 >> 32)) & ((((~(i27 | 1394528558)) | (-1463212327)) * (-90)) + 1687905420 + (((~(1394528558 | i)) | 1394004262) * (-45)) + (((~(1463212326 | i)) | 1394528558 | (~(i27 | (-1463212327)))) * 45)))) != 0) {
                                    objArr3 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 60}, null, null, new int[1]};
                                    java.lang.Object[] objArr80 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i27 | (-593091289))) | (-437044657)) * (-983)) - 18098175) + (((~(i27 | (-437044657))) | 402916640) * 983))};
                                    java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                    java.lang.Object obj49 = obj48;
                                    if (obj48 == null) {
                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 50, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) android.text.TextUtils.getOffsetBefore("", 0));
                                        byte[] bArr17 = $$a;
                                        byte b43 = (byte) (-bArr17[52]);
                                        byte b44 = bArr17[41];
                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                        c(b43, b44, b44, objArr81);
                                        java.lang.reflect.Method method23 = cls29.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, method23);
                                        obj49 = method23;
                                    }
                                    i7 = 0;
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj49).invoke(null, objArr80)).intValue();
                                } else {
                                    objArr3 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                                    java.lang.Object[] objArr82 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(i27 | (-256401400))) | 773734545) * (-235)) - 262061445) + (((~((-256401400) | i)) | 773734545) * (-470)) + (((~((-20979559) | i)) | 538312704) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))};
                                    java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                    java.lang.Object obj51 = obj50;
                                    if (obj50 == null) {
                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                        byte[] bArr18 = $$a;
                                        byte b45 = (byte) (-bArr18[52]);
                                        byte b46 = bArr18[41];
                                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                                        c(b45, b46, b46, objArr83);
                                        java.lang.reflect.Method method24 = cls30.getMethod((java.lang.String) objArr83[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, method24);
                                        obj51 = method24;
                                    }
                                    i7 = 0;
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj51).invoke(null, objArr82)).intValue();
                                }
                                if (((int[]) objArr3[1])[i7] != i) {
                                    return objArr3;
                                }
                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                b("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", i7, new int[]{12, 36, 97, i7}, objArr84);
                                java.lang.Object[] objArr85 = {(java.lang.String) objArr84[i7]};
                                java.lang.Integer num11 = num2;
                                java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num11);
                                java.lang.Object obj53 = obj52;
                                if (obj52 == null) {
                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3161, (char) (33098 - android.view.MotionEvent.axisFromString("")));
                                    byte[] bArr19 = $$a;
                                    byte b47 = bArr19[14];
                                    byte b48 = bArr19[49];
                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                    c(b47, b48, (short) (b48 | 9), objArr86);
                                    java.lang.reflect.Method method25 = cls31.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num11, method25);
                                    obj53 = method25;
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj53).invoke(null, objArr85)).longValue();
                                long j27 = ((-782) * longValue9) + 234807241872L + ((~longValue9) * (-783)) + ((~((-299499034) | j22 | longValue9)) * (-783)) + (((~(longValue9 | j22)) | (-299499034)) * 783) + 695935870;
                                if (((((int) (j27 >> 32)) & ((((~((-1540833606) | i)) | 1316907279) * (-668)) + 1927356602 + (((~(1316907279 | i)) | (-1540833606)) * 1336) + (((-293666881) | i) * 668))) | (((int) j27) & ((((((~(1030804097 | i)) | (~(i27 | (-406422313)))) | r4) * (-516)) - 1495680271) + (((~(1031394217 | i)) | (~(i27 | (-624971906)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((~(i27 | (-1030804098))) | 624971905) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)))) != 0) {
                                    objArr4 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 80}, null, null, new int[1]};
                                    java.lang.Object[] objArr87 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i27 | (-161666817))) | (~(868469128 | i))) * com.visa.cbp.getCertUsage.getODAData) + 172104893 + (((~((-161666817) | i)) | (~(i27 | 868469128))) * com.visa.cbp.getCertUsage.getODAData))};
                                    java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                    java.lang.Object obj55 = obj54;
                                    if (obj54 == null) {
                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777166) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                        byte[] bArr20 = $$a;
                                        byte b49 = (byte) (-bArr20[52]);
                                        byte b50 = bArr20[41];
                                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                                        c(b49, b50, b50, objArr88);
                                        java.lang.reflect.Method method26 = cls32.getMethod((java.lang.String) objArr88[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, method26);
                                        obj55 = method26;
                                    }
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj55).invoke(null, objArr87)).intValue();
                                    i9 = 0;
                                    i8 = i27;
                                } else {
                                    objArr4 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                                    i8 = i27;
                                    java.lang.Object[] objArr89 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(i27 | (-157420970))) | (~(i27 | (-872714976)))) * (-867)) + 804801824 + (((~((-157420970) | i)) | 137 | (~((-872714976) | i))) * (-1734)) + (((~(i8 | (-138))) | (~((-157420833) | i)) | (~((-872714839) | i))) * 867))};
                                    java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                    java.lang.Object obj57 = obj56;
                                    if (obj56 == null) {
                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.normalizeMetaState(0), android.view.KeyEvent.getDeadChar(0, 0) + 2713, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                        byte[] bArr21 = $$a;
                                        byte b51 = (byte) (-bArr21[52]);
                                        byte b52 = bArr21[41];
                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                        c(b51, b52, b52, objArr90);
                                        java.lang.reflect.Method method27 = cls33.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, method27);
                                        obj57 = method27;
                                    }
                                    i9 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj57).invoke(null, objArr89)).intValue();
                                }
                                if (((int[]) objArr4[1])[i9] != i) {
                                    return objArr4;
                                }
                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                b("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", i9, new int[]{48, 42, 60, i9}, objArr91);
                                java.lang.Object[] objArr92 = {(java.lang.String) objArr91[i9]};
                                java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num11);
                                java.lang.Object obj59 = obj58;
                                if (obj58 == null) {
                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.Gravity.getAbsoluteGravity(i9, i9), 3161 - android.view.Gravity.getAbsoluteGravity(i9, i9), (char) (33099 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                    byte[] bArr22 = $$a;
                                    byte b53 = bArr22[14];
                                    byte b54 = bArr22[49];
                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                    c(b53, b54, (short) (b54 | 9), objArr93);
                                    java.lang.reflect.Method method28 = cls34.getMethod((java.lang.String) objArr93[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num11, method28);
                                    obj59 = method28;
                                }
                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj59).invoke(null, objArr92)).longValue();
                                long j28 = ~longValue10;
                                long j29 = (-195466251) | j28;
                                java.lang.Integer num12 = num4;
                                int i32 = i8;
                                long j30 = (((-764) * longValue10) - 298867896250L) + (((~(longValue10 | (-195466251) | j21)) | (~(j29 | j22)) | (~(195466250 | j28 | j21))) * 765) + (((~j29) | (~((-195466251) | j22))) * 1530) + (((~(j21 | (-195466251))) | (~(j28 | j22 | 195466250))) * 765) + 799968653;
                                if (((((int) (j30 >> 32)) & ((((((~((-865567801) | i)) | (~(i32 | 571658610))) | r2) * (-516)) - 1524454206) + (((~((-571637809) | i)) | (~(i32 | (-20803)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((~(i32 | 865567800)) | 20802) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))) | (((((r4 | 64) * (-476)) - 833348023) + ((~((-16777494) | i)) * 952) + ((~((-16777494) | i32)) * 476)) & ((int) j30))) != 0) {
                                    java.lang.Object[] objArr94 = {new int[]{i}, new int[]{i ^ 90}, null, null, new int[1]};
                                    java.lang.Object[] objArr95 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(84948960 | i32)) | 945186984) * (-1042)) - 1757419632) + ((84948960 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(1029079016 | i32)) | (~((-945186985) | i)) | 1056928) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                                    java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num12);
                                    java.lang.Object obj61 = obj60;
                                    if (obj60 == null) {
                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2712, (char) android.text.TextUtils.getOffsetBefore("", 0));
                                        byte[] bArr23 = $$a;
                                        byte b55 = (byte) (-bArr23[52]);
                                        byte b56 = bArr23[41];
                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                        c(b55, b56, b56, objArr96);
                                        java.lang.reflect.Method method29 = cls35.getMethod((java.lang.String) objArr96[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num12, method29);
                                        obj61 = method29;
                                    }
                                    ((int[]) objArr94[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj61).invoke(null, objArr95)).intValue();
                                    return objArr94;
                                }
                                java.lang.Object[] objArr97 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                java.lang.Object[] objArr98 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-698743246) | i)) | (-1004929024)) * (-502)) + 756516308 + ((~((-673536325) | i32)) * (-502)) + (((~((-331392700) | i)) | (-698743246)) * 502))};
                                java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num12);
                                java.lang.Object obj63 = obj62;
                                if (obj62 == null) {
                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getSize(0), 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.KeyEvent.getDeadChar(0, 0));
                                    byte[] bArr24 = $$a;
                                    byte b57 = (byte) (-bArr24[52]);
                                    byte b58 = bArr24[41];
                                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                                    c(b57, b58, b58, objArr99);
                                    java.lang.reflect.Method method30 = cls36.getMethod((java.lang.String) objArr99[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num12, method30);
                                    obj63 = method30;
                                }
                                ((int[]) objArr97[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj63).invoke(null, objArr98)).intValue();
                                return objArr97;
                            }
                            str9 = str13;
                            i24 = i25 + 1;
                            str12 = str3;
                            num8 = num2;
                            num7 = num;
                            str8 = str15;
                            str10 = str14;
                        }
                    }
                    num = num7;
                    num2 = num8;
                    str = str8;
                    str2 = str10;
                    java.lang.String str18 = (java.lang.String) java.lang.Class.forName(str).getField(str9).get(invoke);
                    if (str18.length() >= 6) {
                        int i33 = 0;
                        while (i33 <= str18.length() - 6) {
                            java.lang.Object[] objArr100 = {str18.substring(i33, i33 + 6), 931995};
                            java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            java.lang.Object obj65 = obj64;
                            if (obj64 == null) {
                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2595 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf("", ""));
                                byte b59 = $$a[41];
                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                c(b59, (byte) (b59 | 34), 653, objArr101);
                                java.lang.reflect.Method method31 = cls37.getMethod((java.lang.String) objArr101[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method31);
                                obj65 = method31;
                            }
                            long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj65).invoke(null, objArr100)).longValue();
                            long j31 = i17 == true ? 1L : 0L;
                            long j32 = ~j31;
                            java.lang.String str19 = str9;
                            long j33 = ~((~longValue11) | (-714234281));
                            int i34 = indexOf;
                            java.lang.String str20 = str18;
                            long j34 = (((-107) * longValue11) - 39282885455L) + (((~(longValue11 | 714234280)) | (~(longValue11 | j32))) * (-108)) + (((~(714234280 | j31)) | j33 | (~((-714234281) | j32))) * 54) + ((j31 | j33) * 54) + 1971334805;
                            int i35 = ~(i17 == true ? 1 : 0);
                            if (((((int) j34) & (((((~((-847394524) | (i17 == true ? 1 : 0))) | (-2010346363)) * (-964)) - 1536335915) + (((~((-847394524) | i35)) | 1153) * (-964)))) | (((int) (j34 >> 32)) & ((((~((-1093153890) | (i17 == true ? 1 : 0))) | (-1764586996)) * (-756)) + 639939202 + (((-1093153890) | i35) * 756)))) == -2096167706) {
                                java.lang.Object[] objArr102 = {new int[1], new int[1], null, r5, new int[1]};
                                java.lang.String str21 = (java.lang.String) java.lang.Class.forName(str).getField(str19).get(invoke);
                                ((int[]) objArr102[0])[0] = i17 == true ? 1 : 0;
                                ((int[]) objArr102[1])[0] = (i17 == true ? 1 : 0) ^ 20;
                                int i36 = ~(996401023 | (i17 == true ? 1 : 0));
                                java.lang.Object[] objArr103 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-990042896) | i35)) | 33734921 | i36) * (-502)) + 785197102 + ((i36 | (~(i35 | (-956307975)))) * 502))};
                                java.lang.Object obj66 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj67 = obj66;
                                if (obj66 == null) {
                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 50, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2713, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                    byte[] bArr25 = $$a;
                                    byte b60 = (byte) (-bArr25[52]);
                                    byte b61 = bArr25[41];
                                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                                    c(b60, b61, b61, objArr104);
                                    java.lang.reflect.Method method32 = cls38.getMethod((java.lang.String) objArr104[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method32);
                                    obj67 = method32;
                                }
                                ((int[]) objArr102[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj67).invoke(null, objArr103)).intValue();
                                i4 = i17 == true ? 1 : 0;
                                objArr = objArr102;
                                num6 = -1347122530;
                                num3 = num6;
                                i6 = 1;
                                c = 0;
                                if (((int[]) objArr[i6])[c] != i4) {
                                }
                            } else {
                                str9 = str19;
                                i33++;
                                indexOf = i34;
                                str18 = str20;
                            }
                        }
                    }
                    int i37 = indexOf;
                    java.lang.String substring = ((java.lang.String) java.lang.Class.forName(str).getField(str9).get(invoke)).substring(0, i37);
                    i10 = 1;
                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                    b("\u0000", true, new int[]{129, 1, 101, 0}, objArr105);
                    split = substring.split((java.lang.String) objArr105[0]);
                    r5 = 0;
                    r2 = i17;
                    r4 = split.length;
                    r31 = i37;
                    while (r5 < r4) {
                        str4 = split[r5];
                        java.lang.Object[] objArr106 = new java.lang.Object[i10];
                        b("\u0001\u0000\u0001", false, new int[]{130, 3, 82, i10}, objArr106);
                        if (str4.split((java.lang.String) objArr106[0]).length > i10) {
                            synchronized (((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 48, 1581 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.view.KeyEvent.keyCodeFromString("")))) {
                                i11 = 0;
                                try {
                                    try {
                                        java.lang.Object[] objArr107 = new java.lang.Object[1];
                                        b("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 16, 106, 0}, objArr107);
                                        str5 = (java.lang.String) objArr107[0];
                                        try {
                                            runtime = java.lang.Runtime.getRuntime();
                                            objArr6 = new java.lang.Object[1];
                                            r31 = split;
                                        } catch (java.lang.Exception unused) {
                                        }
                                    } catch (java.io.IOException unused2) {
                                    }
                                } catch (java.io.IOException unused3) {
                                    i11 = r2;
                                    strArr = split;
                                }
                                try {
                                    try {
                                        b("\u0001\u0001", false, new int[]{149, 2, 0, 2}, objArr6);
                                        exec = runtime.exec((java.lang.String) objArr6[0], (java.lang.String[]) null, (java.io.File) null);
                                        try {
                                            java.lang.Object[] objArr108 = {exec.getInputStream()};
                                            java.lang.Object obj68 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                            if (obj68 == null) {
                                                try {
                                                    str3 = r4;
                                                    try {
                                                        java.lang.reflect.Constructor<T> declaredConstructor = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 44, 1507 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.view.View.resolveSize(0, 0))).getDeclaredConstructor(java.io.InputStream.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor);
                                                        obj = declaredConstructor;
                                                    } catch (java.lang.Throwable th5) {
                                                        th = th5;
                                                        th = th;
                                                        cause = th.getCause();
                                                        if (cause == null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                } catch (java.lang.Throwable th6) {
                                                    th = th6;
                                                }
                                            } else {
                                                str3 = r4;
                                                obj = obj68;
                                            }
                                            try {
                                                newInstance = ((java.lang.reflect.Constructor) obj).newInstance(objArr108);
                                            } catch (java.lang.Throwable th7) {
                                                th = th7;
                                                th = th;
                                                cause = th.getCause();
                                                if (cause == null) {
                                                }
                                            }
                                        } catch (java.lang.Throwable th8) {
                                            th = th8;
                                        }
                                    } catch (java.lang.Exception unused4) {
                                    }
                                } catch (java.io.IOException unused5) {
                                    i11 = r2;
                                    strArr = r31;
                                    str3 = r4;
                                    r31 = strArr;
                                    i12 = r5;
                                    r5 = str9;
                                    r2 = i18;
                                    i18 = r2;
                                    str9 = r5;
                                    r2 = i11;
                                    r4 = str3;
                                    split = r31;
                                    i10 = 1;
                                    r5 = i12 + 1;
                                    r31 = r31;
                                } catch (java.lang.Exception unused6) {
                                    java.lang.Object[] objArr109 = new java.lang.Object[1];
                                    b("\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{156, 27, 0, 13}, objArr109);
                                    throw new java.io.IOException((java.lang.String) objArr109[0]);
                                }
                                try {
                                    try {
                                        java.lang.Object[] objArr110 = {exec.getErrorStream()};
                                        java.lang.Object obj69 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                        java.lang.Object obj70 = obj69;
                                        if (obj69 == null) {
                                            try {
                                                java.lang.reflect.Constructor<T> declaredConstructor2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 44, android.graphics.Color.rgb(0, 0, 0) + 16778723, (char) android.view.View.combineMeasuredStates(0, 0))).getDeclaredConstructor(java.io.InputStream.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor2);
                                                obj70 = declaredConstructor2;
                                            } catch (java.lang.Throwable th9) {
                                                th2 = th9;
                                                java.lang.Throwable cause3 = th2.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th2;
                                            }
                                        }
                                        newInstance2 = ((java.lang.reflect.Constructor) obj70).newInstance(objArr110);
                                        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                        try {
                                            java.lang.Class<?> cls39 = java.lang.Class.forName(str2);
                                            i12 = r5;
                                            num5 = i18;
                                            try {
                                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                b("\u0000\u0000\u0001\u0001\u0001", true, new int[]{151, 5, 28, 0}, objArr111);
                                                cls39.getMethod((java.lang.String) objArr111[0], null).invoke(newInstance, null);
                                                try {
                                                    java.lang.Class<?> cls40 = java.lang.Class.forName(str2);
                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                    b("\u0000\u0000\u0001\u0001\u0001", true, new int[]{151, 5, 28, 0}, objArr112);
                                                    cls40.getMethod((java.lang.String) objArr112[0], null).invoke(newInstance2, null);
                                                    try {
                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                        sb.append(str5);
                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                        d("縻\ud8f7", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr113);
                                                        sb.append(((java.lang.String) objArr113[0]).intern());
                                                        java.lang.String obj71 = sb.toString();
                                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                        a(126 - android.os.Process.getGidForName(""), null, null, "\u009f\u009e\u009d\u009b\u009c", objArr114);
                                                        dataOutputStream.write(obj71.getBytes((java.lang.String) objArr114[0]));
                                                        dataOutputStream.flush();
                                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                        a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'O', null, null, " \u0084\u0091\u0094\u0085", objArr115);
                                                        java.lang.String str22 = (java.lang.String) objArr115[0];
                                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                        a(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), null, null, "\u009f\u009e\u009d\u009b\u009c", objArr116);
                                                        dataOutputStream.write(str22.getBytes((java.lang.String) objArr116[0]));
                                                        dataOutputStream.flush();
                                                        try {
                                                            long nanoTime = java.lang.System.nanoTime();
                                                            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                            int i38 = r2;
                                                            java.lang.String str23 = str22;
                                                            while (true) {
                                                                try {
                                                                    exec.exitValue();
                                                                    str6 = str9;
                                                                    str7 = str23;
                                                                    break;
                                                                } catch (java.lang.IllegalThreadStateException unused7) {
                                                                    if (nanos > 0) {
                                                                        try {
                                                                            str6 = str9;
                                                                            try {
                                                                                java.lang.Object[] objArr117 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                java.lang.Class<?> cls41 = java.lang.Class.forName(str2);
                                                                                java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                                a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, null, "\u0088\u0085\u0085\u0096\u0082", objArr118);
                                                                                cls41.getMethod((java.lang.String) objArr118[0], java.lang.Long.TYPE).invoke(null, objArr117);
                                                                            } catch (java.lang.Throwable th10) {
                                                                                java.lang.Throwable cause4 = th10.getCause();
                                                                                if (cause4 != null) {
                                                                                    throw cause4;
                                                                                }
                                                                                throw th10;
                                                                            }
                                                                        } catch (java.lang.InterruptedException e) {
                                                                            e = e;
                                                                            str6 = str9;
                                                                            interruptedException = e;
                                                                            try {
                                                                                throw interruptedException;
                                                                            } catch (java.lang.Throwable th11) {
                                                                                th = th11;
                                                                                th3 = th;
                                                                                try {
                                                                                    exec.destroy();
                                                                                    throw th3;
                                                                                } catch (java.lang.Exception unused8) {
                                                                                    throw th3;
                                                                                }
                                                                            }
                                                                        } catch (java.lang.Throwable th12) {
                                                                            th = th12;
                                                                            str6 = str9;
                                                                            th3 = th;
                                                                            exec.destroy();
                                                                            throw th3;
                                                                        }
                                                                    } else {
                                                                        str6 = str9;
                                                                    }
                                                                    try {
                                                                        ?? nanos2 = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                        str7 = nanos2;
                                                                        if (nanos2 > 0) {
                                                                            i38 = i;
                                                                            nanos = nanos2;
                                                                            str9 = str6;
                                                                            str23 = nanos2;
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
                                                    } catch (java.io.IOException unused9) {
                                                        i11 = r2;
                                                        r5 = str9;
                                                    } catch (java.lang.Exception unused10) {
                                                    }
                                                } catch (java.lang.Throwable th16) {
                                                    java.lang.Throwable cause5 = th16.getCause();
                                                    if (cause5 != null) {
                                                        throw cause5;
                                                    }
                                                    throw th16;
                                                }
                                            } catch (java.lang.Throwable th17) {
                                                th = th17;
                                                java.lang.Throwable th18 = th;
                                                java.lang.Throwable cause6 = th18.getCause();
                                                if (cause6 != null) {
                                                    throw cause6;
                                                }
                                                throw th18;
                                            }
                                        } catch (java.lang.Throwable th19) {
                                            th = th19;
                                        }
                                    } catch (java.lang.Throwable th20) {
                                        th2 = th20;
                                    }
                                } catch (java.io.IOException unused11) {
                                    i11 = r2;
                                    r31 = r31;
                                    i12 = r5;
                                    r5 = str9;
                                    r2 = i18;
                                    i18 = r2;
                                    str9 = r5;
                                    r2 = i11;
                                    r4 = str3;
                                    split = r31;
                                    i10 = 1;
                                    r5 = i12 + 1;
                                    r31 = r31;
                                } catch (java.lang.Exception unused12) {
                                    java.lang.Object[] objArr1092 = new java.lang.Object[1];
                                    b("\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{156, 27, 0, 13}, objArr1092);
                                    throw new java.io.IOException((java.lang.String) objArr1092[0]);
                                }
                            }
                            objArr = new java.lang.Object[]{new int[1], new int[1], null, r1, new int[1]};
                            java.lang.String str24 = (java.lang.String) java.lang.Class.forName(str).getField(str6).get(invoke);
                            i4 = i;
                            ((int[]) objArr[0])[0] = i4;
                            ((int[]) objArr[1])[0] = i4 ^ 20;
                            int i39 = ~i4;
                            java.lang.Object[] objArr119 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-775661448) | i39)) | (~((-254474498) | i39))) * (-867)) + 804801824 + (((~((-775661448) | i4)) | 237674753 | (~((-254474498) | i4))) * (-1734)) + (((~(i39 | (-237674754))) | (~((-537986695) | i4)) | (~((-16799745) | i4))) * 867))};
                            num6 = num5;
                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                            java.lang.Object obj72 = obj2;
                            if (obj2 == null) {
                                java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 50, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2712, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                byte[] bArr26 = $$a;
                                byte b62 = (byte) (-bArr26[52]);
                                byte b63 = bArr26[41];
                                java.lang.Object[] objArr120 = new java.lang.Object[1];
                                c(b62, b63, b63, objArr120);
                                java.lang.reflect.Method method33 = cls42.getMethod((java.lang.String) objArr120[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method33);
                                obj72 = method33;
                            }
                            ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj72).invoke(null, objArr119)).intValue();
                            num3 = num6;
                            i6 = 1;
                            c = 0;
                            if (((int[]) objArr[i6])[c] != i4) {
                            }
                        } else {
                            i11 = r2;
                            r31 = split;
                            str3 = r4;
                            i12 = r5;
                            r5 = str9;
                            r2 = i18;
                        }
                        i18 = r2;
                        str9 = r5;
                        r2 = i11;
                        r4 = str3;
                        split = r31;
                        i10 = 1;
                        r5 = i12 + 1;
                        r31 = r31;
                    }
                    i4 = r2;
                    num3 = i18;
                    i5 = i10;
                } else {
                    i4 = i17 == true ? 1 : 0;
                    num = -604620973;
                    num2 = 269015277;
                    num3 = -1347122530;
                    i5 = 1;
                }
                int[] iArr3 = new int[i5];
                int[] iArr4 = new int[i5];
                iArr3[0] = i4;
                iArr4[0] = i4;
                objArr = new java.lang.Object[]{iArr3, iArr4, null, null, new int[i5]};
                java.lang.Object[] objArr121 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((((~((-369565352) | r1)) | (~((-660570594) | i4))) * (-370)) - 71654120) + ((((~((~i4) | (-660570594))) | (~((-369565352) | i4))) | (-929013736)) * (-370))) - 137698640)};
                java.lang.Object obj73 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                java.lang.Object obj74 = obj73;
                if (obj73 == null) {
                    java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetBefore("", 0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                    byte[] bArr27 = $$a;
                    byte b64 = (byte) (-bArr27[52]);
                    byte b65 = bArr27[41];
                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                    c(b64, b65, b65, objArr122);
                    java.lang.reflect.Method method34 = cls43.getMethod((java.lang.String) objArr122[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, method34);
                    obj74 = method34;
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj74).invoke(null, objArr121)).intValue();
                c = 0;
                ((int[]) objArr[4])[0] = intValue2;
                i6 = 1;
                if (((int[]) objArr[i6])[c] != i4) {
                }
            } catch (java.lang.Throwable th21) {
                java.lang.Throwable cause7 = th21.getCause();
                if (cause7 != null) {
                    throw cause7;
                }
                throw th21;
            }
            try {
                try {
                    java.lang.Class<?> cls44 = java.lang.Class.forName(str2);
                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                    a(127 - android.text.TextUtils.getCapsMode("", 0, 0), null, null, "\u008b\u0091\u008a\u0099", objArr123);
                    cls44.getMethod((java.lang.String) objArr123[0], java.lang.Long.TYPE).invoke(newInstance, 100L);
                    try {
                        java.lang.Class<?> cls45 = java.lang.Class.forName(str2);
                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                        a(127 - android.view.View.MeasureSpec.getMode(0), null, null, "\u008b\u0091\u008a\u0099", objArr124);
                        cls45.getMethod((java.lang.String) objArr124[0], java.lang.Long.TYPE).invoke(newInstance2, 10L);
                        try {
                            try {
                                exec.destroy();
                            } catch (java.io.IOException unused13) {
                                i11 = i;
                                r2 = num5;
                                r5 = str6;
                                i18 = r2;
                                str9 = r5;
                                r2 = i11;
                                r4 = str3;
                                split = r31;
                                i10 = 1;
                                r5 = i12 + 1;
                                r31 = r31;
                            } catch (java.lang.Exception unused14) {
                            }
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, 1506 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                            byte[] bArr28 = $$a;
                            byte b66 = bArr28[41];
                            byte b67 = bArr28[7];
                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                            c(b66, b67, (short) (b67 >>> 2), objArr125);
                            sb2.append(cls46.getField((java.lang.String) objArr125[0]).get(newInstance).toString());
                            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.text.TextUtils.indexOf("", "", 0, 0), 1507 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) android.text.TextUtils.getOffsetBefore("", 0));
                            byte b68 = bArr28[41];
                            byte b69 = bArr28[7];
                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                            c(b68, b69, (short) (b69 >>> 2), objArr126);
                            sb2.append(cls47.getField((java.lang.String) objArr126[0]).get(newInstance2).toString());
                            java.lang.String obj75 = sb2.toString();
                            java.lang.Object[] objArr127 = new java.lang.Object[1];
                            d("縻\ud8f7", -android.graphics.ImageFormat.getBitsPerPixel(0), objArr127);
                            java.lang.String[] split2 = obj75.split(((java.lang.String) objArr127[0]).intern());
                            length = split2.length;
                            i13 = 0;
                            while (i13 < length) {
                                java.lang.String str25 = split2[i13];
                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                a(android.view.KeyEvent.keyCodeFromString("") + 127, null, null, "\u0092\u0085\u0096\u009a\u008a\u008a\u009a\u0092\u0086\u008a\u008e¢\u0085\u009a\u008d¡\u008e\u008d\u0088", objArr128);
                                if (!str25.startsWith((java.lang.String) objArr128[0])) {
                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                    a(127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), null, null, "\u0092\u008f\u0091\u008a\u0090\u008f\u008b\u008d\u0092\u0086\u008a\u008e¢\u0085\u009a\u008d¡\u008e\u008d\u0088", objArr129);
                                    if (str25.startsWith((java.lang.String) objArr129[0])) {
                                        continue;
                                    } else {
                                        java.lang.Object[] objArr130 = new java.lang.Object[1];
                                        b("\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000", false, new int[]{183, 8, 0, 1}, objArr130);
                                        if (str25.startsWith((java.lang.String) objArr130[0])) {
                                            java.lang.Object[] objArr131 = new java.lang.Object[1];
                                            b("\u0000", false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 1, 0, 1}, objArr131);
                                            java.lang.String[] split3 = str25.split((java.lang.String) objArr131[0]);
                                            if (split3.length > 1 && split3[1].equalsIgnoreCase(str4)) {
                                                objArr = new java.lang.Object[]{new int[1], new int[1], null, str24, new int[1]};
                                                java.lang.String str242 = (java.lang.String) java.lang.Class.forName(str).getField(str6).get(invoke);
                                                i4 = i;
                                                ((int[]) objArr[0])[0] = i4;
                                                ((int[]) objArr[1])[0] = i4 ^ 20;
                                                int i392 = ~i4;
                                                java.lang.Object[] objArr1192 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-775661448) | i392)) | (~((-254474498) | i392))) * (-867)) + 804801824 + (((~((-775661448) | i4)) | 237674753 | (~((-254474498) | i4))) * (-1734)) + (((~(i392 | (-237674754))) | (~((-537986695) | i4)) | (~((-16799745) | i4))) * 867))};
                                                num6 = num5;
                                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                                                java.lang.Object obj722 = obj2;
                                                if (obj2 == null) {
                                                }
                                                ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj722).invoke(null, objArr1192)).intValue();
                                                num3 = num6;
                                                i6 = 1;
                                                c = 0;
                                                if (((int[]) objArr[i6])[c] != i4) {
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                i13++;
                                str6 = str6;
                                num5 = num5;
                            }
                            i11 = i;
                            r5 = str6;
                            r2 = num5;
                            i18 = r2;
                            str9 = r5;
                            r2 = i11;
                            r4 = str3;
                            split = r31;
                            i10 = 1;
                            r5 = i12 + 1;
                            r31 = r31;
                        } catch (java.lang.Exception unused15) {
                            java.lang.Object[] objArr10922 = new java.lang.Object[1];
                            b("\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{156, 27, 0, 13}, objArr10922);
                            throw new java.io.IOException((java.lang.String) objArr10922[0]);
                        }
                    } catch (java.lang.Throwable th22) {
                        java.lang.Throwable cause8 = th22.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th22;
                    }
                } catch (java.lang.Throwable th23) {
                    java.lang.Throwable cause9 = th23.getCause();
                    if (cause9 != null) {
                        throw cause9;
                    }
                    throw th23;
                }
            } catch (java.lang.InterruptedException e5) {
                interruptedException = e5;
                throw interruptedException;
            } catch (java.lang.Throwable th24) {
                th3 = th24;
                exec.destroy();
                throw th3;
            }
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            java.lang.Class cls462 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, 1506 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf("", "", 0, 0));
            byte[] bArr282 = $$a;
            byte b662 = bArr282[41];
            byte b672 = bArr282[7];
            java.lang.Object[] objArr1252 = new java.lang.Object[1];
            c(b662, b672, (short) (b672 >>> 2), objArr1252);
            sb22.append(cls462.getField((java.lang.String) objArr1252[0]).get(newInstance).toString());
            java.lang.Class cls472 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.text.TextUtils.indexOf("", "", 0, 0), 1507 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) android.text.TextUtils.getOffsetBefore("", 0));
            byte b682 = bArr282[41];
            byte b692 = bArr282[7];
            java.lang.Object[] objArr1262 = new java.lang.Object[1];
            c(b682, b692, (short) (b692 >>> 2), objArr1262);
            sb22.append(cls472.getField((java.lang.String) objArr1262[0]).get(newInstance2).toString());
            java.lang.String obj752 = sb22.toString();
            java.lang.Object[] objArr1272 = new java.lang.Object[1];
            d("縻\ud8f7", -android.graphics.ImageFormat.getBitsPerPixel(0), objArr1272);
            java.lang.String[] split22 = obj752.split(((java.lang.String) objArr1272[0]).intern());
            length = split22.length;
            i13 = 0;
            while (i13 < length) {
            }
            i11 = i;
            r5 = str6;
            r2 = num5;
            i18 = r2;
            str9 = r5;
            r2 = i11;
            r4 = str3;
            split = r31;
            i10 = 1;
            r5 = i12 + 1;
            r31 = r31;
            i11 = i;
            r5 = str6;
            r2 = num5;
            i18 = r2;
            str9 = r5;
            r2 = i11;
            r4 = str3;
            split = r31;
            i10 = 1;
            r5 = i12 + 1;
            r31 = r31;
            r2 = num5;
            i18 = r2;
            str9 = r5;
            r2 = i11;
            r4 = str3;
            split = r31;
            i10 = 1;
            r5 = i12 + 1;
            r31 = r31;
        } catch (java.lang.Throwable th25) {
            java.lang.Throwable cause10 = th25.getCause();
            if (cause10 != null) {
                throw cause10;
            }
            throw th25;
        }
    }
}
