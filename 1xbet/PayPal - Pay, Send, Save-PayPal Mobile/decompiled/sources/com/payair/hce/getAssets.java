package com.payair.hce;

/* loaded from: classes4.dex */
public class getAssets implements com.payair.hce.isNetworkError {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int getCardLayoutDescription;
    private static char[] getCvrMaskAnd;
    private static char[] getGpoResponse;
    private static long getPaymentFci;
    private static int getSecurityWord;
    private final byte[] AlternateContactlessPaymentDataJson;
    private final byte[] DigitizedCardProfile;
    private final byte[] IccPrivateKeyCrtComponentsJson;
    private final byte[] RecordsJson;
    private final byte[] SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.checkPermission SdkCoreBusinessLogicModuleImpl;
    private final int getAid;
    private final byte[] getCiacDecline;
    private final byte[] getProfileVersion;
    private final java.lang.String valueOf;
    private final byte[] values;
    private final byte[] writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ((i * (-963)) - 964) + (i2 * 965) + (((~i) | (~(i4 | i3))) * (-964)) + (((~(i | i4)) | (~((~i3) | i4))) * (-964));
        if (i5 != 1) {
            return i5 != 2 ? DigitizedCardProfile(objArr) : writeReplace(objArr);
        }
        com.payair.hce.getAssets getassets = (com.payair.hce.getAssets) objArr[0];
        getCardLayoutDescription = (getSecurityWord + 23) % 128;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(getassets.getCiacDecline);
        byte[] bArr = getassets.getCiacDecline;
        getSecurityWord = (getCardLayoutDescription + 53) % 128;
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = 65 - (b * 2);
        int i4 = i * 3;
        byte[] bArr = $$a;
        int i5 = 4 - (s * 2);
        byte[] bArr2 = new byte[35 - i4];
        int i6 = 34 - i4;
        if (bArr == null) {
            i3 = i5;
            int i7 = i6;
            int i8 = 0;
            i5++;
            i3 = (i3 + (-i7)) - 2;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i5++;
            i3 = (i3 + (-i7)) - 2;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (b2 * 2) + 99;
        byte[] bArr = $$d;
        int i5 = 1 - (i * 2);
        int i6 = b + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            i3 = 0;
            int i9 = i6 + i8;
            i2 = i3;
            int i10 = i7;
            i4 = i9;
            i6 = i10;
            i3 = i2 + 1;
            int i11 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i11];
            int i12 = i4;
            i7 = i11;
            i6 = i12;
            int i92 = i6 + i8;
            i2 = i3;
            int i102 = i7;
            i4 = i92;
            i6 = i102;
            i3 = i2 + 1;
            int i112 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            int i1122 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    private static void c(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        int i3 = $10 + 75;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (getcvmmodel.valueOf < i2) {
            int i5 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(getGpoResponse[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 48, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 382, (char) (android.view.View.MeasureSpec.getMode(0) + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) -1, (byte) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getPaymentFci), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 35, (android.os.Process.myPid() >> 22) + 3966, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 34, 212 - android.view.KeyEvent.getDeadChar(0, 0), (char) android.text.TextUtils.getOffsetBefore("", 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
        $11 = ($10 + 67) % 128;
        while (getcvmmodel.valueOf < i2) {
            $11 = ($10 + 77) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        java.lang.String str = new java.lang.String(cArr);
        int i6 = $10 + 111;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public getAssets(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, int i, byte[] bArr9) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 6, 9, 0}, "\u0000\u0001\u0001\u0001\u0000\u0000", false, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.getAssets.class.getName());
        this.SdkCoreBusinessLogicModuleImpl = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.valueOf = str;
        this.DigitizedCardProfile = com.payair.hce.startService.writeReplace(bArr);
        this.AlternateContactlessPaymentDataJson = com.payair.hce.startService.writeReplace(bArr2);
        this.writeReplace = com.payair.hce.startService.writeReplace(bArr3);
        this.values = com.payair.hce.startService.writeReplace(bArr4);
        this.IccPrivateKeyCrtComponentsJson = com.payair.hce.startService.writeReplace(bArr5);
        this.getProfileVersion = com.payair.hce.startService.writeReplace(bArr6);
        this.RecordsJson = com.payair.hce.startService.writeReplace(bArr7);
        this.SdkCoreAlternateContactlessPaymentDataImpl = com.payair.hce.startService.writeReplace(bArr8);
        this.getAid = i;
        this.getCiacDecline = com.payair.hce.startService.writeReplace(bArr9);
    }

    @Override // com.payair.hce.isNetworkError
    public final java.lang.String writeReplace() {
        int i = getSecurityWord + 117;
        getCardLayoutDescription = i % 128;
        if (i % 2 != 0) {
            return this.valueOf;
        }
        throw null;
    }

    @Override // com.payair.hce.isNetworkError
    public final byte[] valueOf() {
        getSecurityWord = (getCardLayoutDescription + 107) % 128;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.DigitizedCardProfile);
        byte[] bArr = this.DigitizedCardProfile;
        getSecurityWord = (getCardLayoutDescription + 57) % 128;
        return bArr;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.getAssets getassets = (com.payair.hce.getAssets) objArr[0];
        int i = getCardLayoutDescription + 125;
        getSecurityWord = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(getassets.AlternateContactlessPaymentDataJson);
            byte[] bArr = getassets.AlternateContactlessPaymentDataJson;
            getSecurityWord = (getCardLayoutDescription + 53) % 128;
            return bArr;
        }
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(getassets.AlternateContactlessPaymentDataJson);
        byte[] bArr2 = getassets.AlternateContactlessPaymentDataJson;
        throw null;
    }

    @Override // com.payair.hce.isNetworkError
    public final byte[] AlternateContactlessPaymentDataJson() {
        getSecurityWord = (getCardLayoutDescription + 91) % 128;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.writeReplace);
        byte[] bArr = this.writeReplace;
        getSecurityWord = (getCardLayoutDescription + 11) % 128;
        return bArr;
    }

    @Override // com.payair.hce.isNetworkError
    public final byte[] DigitizedCardProfile() {
        int i = getSecurityWord + 111;
        getCardLayoutDescription = i % 128;
        if (i % 2 != 0) {
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.values);
            byte[] bArr = this.values;
            int i2 = getSecurityWord + 3;
            getCardLayoutDescription = i2 % 128;
            if (i2 % 2 != 0) {
                return bArr;
            }
            throw null;
        }
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.values);
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.isNetworkError
    public final byte[] getAid() {
        getCardLayoutDescription = (getSecurityWord + 73) % 128;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.IccPrivateKeyCrtComponentsJson);
        byte[] bArr = this.IccPrivateKeyCrtComponentsJson;
        int i = getSecurityWord + 35;
        getCardLayoutDescription = i % 128;
        if (i % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    @Override // com.payair.hce.isNetworkError
    public final byte[] RecordsJson() {
        int i = getSecurityWord + 89;
        getCardLayoutDescription = i % 128;
        if (i % 2 != 0) {
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.getProfileVersion);
            return this.getProfileVersion;
        }
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.getProfileVersion);
        throw null;
    }

    @Override // com.payair.hce.isNetworkError
    public final byte[] SdkCoreAlternateContactlessPaymentDataImpl() {
        getCardLayoutDescription = (getSecurityWord + 77) % 128;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.RecordsJson);
        byte[] bArr = this.RecordsJson;
        getSecurityWord = (getCardLayoutDescription + 5) % 128;
        return bArr;
    }

    @Override // com.payair.hce.isNetworkError
    public final byte[] IccPrivateKeyCrtComponentsJson() {
        int i = getCardLayoutDescription + 51;
        getSecurityWord = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.SdkCoreAlternateContactlessPaymentDataImpl);
            byte[] bArr = this.SdkCoreAlternateContactlessPaymentDataImpl;
            getCardLayoutDescription = (getSecurityWord + 117) % 128;
            return bArr;
        }
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(this.SdkCoreAlternateContactlessPaymentDataImpl);
        throw null;
    }

    @Override // com.payair.hce.isNetworkError
    public final int getProfileVersion() {
        int i = (getSecurityWord + 107) % 128;
        getCardLayoutDescription = i;
        int i2 = this.getAid;
        getSecurityWord = (i + 75) % 128;
        return i2;
    }

    @Override // com.payair.hce.isNetworkError
    public final void getGpoResponse() {
        getCardLayoutDescription = (getSecurityWord + 3) % 128;
        com.payair.hce.stopService.writeReplace(this.DigitizedCardProfile);
        com.payair.hce.stopService.writeReplace(this.AlternateContactlessPaymentDataJson);
        com.payair.hce.stopService.writeReplace(this.writeReplace);
        com.payair.hce.stopService.writeReplace(this.values);
        com.payair.hce.stopService.writeReplace(this.IccPrivateKeyCrtComponentsJson);
        com.payair.hce.stopService.writeReplace(this.SdkCoreAlternateContactlessPaymentDataImpl);
        com.payair.hce.stopService.writeReplace(this.getCiacDecline);
        int i = getSecurityWord + 29;
        getCardLayoutDescription = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            byte[] bytes = str2.getBytes("ISO-8859-1");
            $11 = ($10 + 101) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = 2;
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = getCvrMaskAnd;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 5;
                $10 = i10 % 128;
                if (i10 % i6 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i4];
                        objArr2[i2] = java.lang.Integer.valueOf(cArr[i9]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.drawable.Drawable.resolveOpacity(i2, i2), android.view.KeyEvent.getDeadChar(i2, i2) + 2807, (char) android.view.KeyEvent.keyCodeFromString(""));
                            java.lang.Object[] objArr3 = new java.lang.Object[i4];
                            d((byte) -1, (byte) 5, i2, objArr3);
                            java.lang.String str3 = (java.lang.String) objArr3[i2];
                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                            clsArr[i2] = java.lang.Integer.TYPE;
                            obj = cls.getMethod(str3, clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                        }
                        cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    objArr4[i2] = java.lang.Integer.valueOf(cArr[i9]);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29, android.view.View.combineMeasuredStates(i2, i2) + 2807, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((byte) -1, (byte) 5, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj2);
                    }
                    cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i9++;
                    i2 = 0;
                }
                i4 = 1;
                i6 = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr2 != null) {
            char[] cArr4 = new char[i5];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i5) {
                $11 = ($10 + 51) % 128;
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2836, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        byte length2 = (byte) $$d.length;
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        d((byte) -1, length2, (byte) (length2 - 4), objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i12 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 43, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2880, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        d((byte) -1, (byte) 6, 0, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr4[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                    $11 = ($10 + 27) % 128;
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777182) - android.graphics.Color.rgb(0, 0, 0), 213 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.graphics.Color.alpha(0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i13 = i5 - i8;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i13, i8);
            java.lang.System.arraycopy(cArr5, i8, cArr3, 0, i13);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            getaccounttype.writeReplace = i;
            $11 = ($10 + 33) % 128;
            while (getaccounttype.writeReplace < i5) {
                $10 = ($11 + 117) % 128;
                cArr6[getaccounttype.writeReplace] = cArr3[(i5 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            $11 = ($10 + 45) % 128;
            int i14 = 0;
            while (true) {
                getaccounttype.writeReplace = i14;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                i14 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public static com.payair.hce.isNetworkError writeReplace(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        java.lang.String str = new java.lang.String(bArr);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.mastercard.mpsdk.implementation.SingleUseKeyJson singleUseKeyJson = (com.mastercard.mpsdk.implementation.SingleUseKeyJson) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, str, com.mastercard.mpsdk.implementation.SingleUseKeyJson.class}, -982165709, 982165716, java.lang.System.identityHashCode(setonitemselectedlistener));
        byte[] bArr5 = null;
        if (singleUseKeyJson.getSessionKeyContactlessMd() != null) {
            int i = getSecurityWord + 101;
            getCardLayoutDescription = i % 128;
            if (i % 2 == 0) {
                com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(singleUseKeyJson.getSessionKeyContactlessMd()).DigitizedCardProfile();
                throw new java.lang.ArithmeticException();
            }
            bArr2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(singleUseKeyJson.getSessionKeyContactlessMd()).DigitizedCardProfile();
        } else {
            bArr2 = null;
        }
        byte[] DigitizedCardProfile = singleUseKeyJson.getSessionKeyRemotePaymentMd() != null ? com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(singleUseKeyJson.getSessionKeyRemotePaymentMd()).DigitizedCardProfile() : null;
        byte[] DigitizedCardProfile2 = singleUseKeyJson.getSukContactlessUmd() != null ? com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(singleUseKeyJson.getSukContactlessUmd()).DigitizedCardProfile() : null;
        if (singleUseKeyJson.getSukRemotePaymentUmd() != null) {
            getCardLayoutDescription = (getSecurityWord + 65) % 128;
            bArr3 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(singleUseKeyJson.getSukRemotePaymentUmd()).DigitizedCardProfile();
        } else {
            bArr3 = null;
        }
        if (singleUseKeyJson.getSessionKeyContactlessUmd() != null) {
            byte[] DigitizedCardProfile3 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(singleUseKeyJson.getSessionKeyContactlessUmd()).DigitizedCardProfile();
            getCardLayoutDescription = (getSecurityWord + 107) % 128;
            bArr4 = DigitizedCardProfile3;
        } else {
            bArr4 = null;
        }
        if (singleUseKeyJson.getSessionKeyRemotePaymentUmd() != null) {
            getCardLayoutDescription = (getSecurityWord + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            bArr5 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(singleUseKeyJson.getSessionKeyRemotePaymentUmd()).DigitizedCardProfile();
            getCardLayoutDescription = (getSecurityWord + 85) % 128;
        }
        return new com.payair.hce.getAssets(singleUseKeyJson.getId(), com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(singleUseKeyJson.getSukInfo()).DigitizedCardProfile(), DigitizedCardProfile2, bArr3, bArr2, DigitizedCardProfile, bArr4, bArr5, com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(singleUseKeyJson.getIdn()).DigitizedCardProfile(), singleUseKeyJson.getAtc(), com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(singleUseKeyJson.getHash()).DigitizedCardProfile());
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.isNetworkError isnetworkerror = (com.payair.hce.isNetworkError) objArr[0];
        com.mastercard.mpsdk.implementation.SingleUseKeyJson singleUseKeyJson = new com.mastercard.mpsdk.implementation.SingleUseKeyJson(isnetworkerror.writeReplace(), isnetworkerror.valueOf(), isnetworkerror.values(), isnetworkerror.AlternateContactlessPaymentDataJson(), isnetworkerror.DigitizedCardProfile(), isnetworkerror.getAid(), isnetworkerror.RecordsJson(), isnetworkerror.SdkCoreAlternateContactlessPaymentDataImpl(), isnetworkerror.IccPrivateKeyCrtComponentsJson(), isnetworkerror.getProfileVersion(), isnetworkerror.SdkCoreBusinessLogicModuleImpl());
        new com.payair.hce.unbindService(com.mastercard.mpsdk.implementation.SingleUseKeyJson.class);
        byte[] bytes = com.payair.hce.unbindService.writeReplace(singleUseKeyJson).getBytes();
        int i = getSecurityWord + 99;
        getCardLayoutDescription = i % 128;
        if (i % 2 != 0) {
            return bytes;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getSecurityWord = 0;
        getCardLayoutDescription = 1;
        getCvrMaskAnd = new char[]{16864, 16794, 16798, 16880, 16793, 16793, 16879, 16782, 16775, 16794, 16881, 16883, 16776, 16881, 16793, 16807, 16805, 16830, 16802, 16808, 16774, 16889, 16774, 16779, 16881, 16793, 16807, 16805, 16830, 16802, 16808, 16780, 16892, 16794, 16813, 16805, 16800, 16781, 16706, 16704, 16734, 16731, 16735, 16709, 16800, 16803, 16704, 16733, 16728, 16735, 16704, 16728, 16824, 16787, 16816, 16733, 16728, 16735, 16733, 16725, 16894, 16790, 16812, 16802, 16808, 16808, 16807, 16809, 16793, 16791, 16808, 16810, 16808, 16809, 16822, 16674, 16676, 16674, 16659, 16687, 16702, 16702, 16703, 16674, 16700, 16678, 16656, 16678, 16888, 16793, 16779, 16776, 16774, 16805, 16669, 16640, 16641, 16647, 16654, 16767, 16765, 16644, 16646, 16654, 16650, 16651, 16651, 16642, 16671, 16647, 16764, 16728, 16737, 16671, 16647, 16652, 16744, 16767, 16666, 16642, 16645, 16671, 16644, 16652, 16644, 16736, 16747, 16647, 16647, 16653, 16782, 16823, 16829, 16829, 16831, 16827, 16826, 16825, 16718, 16819, 16806};
        getGpoResponse = new char[]{24261, 30011, 2355, 56593, 61699, 34120, 22882, 28025, 356, 54599, 59727, 48449, 20903, 26023, 14823, 52629, 57738, 46494, 18941, 7598, 12787, 50563, 39313, 44444, 16505, 5146, 10360, 64584, 36947, 42046, 30827, 3181, 8289, 62553, 34892, 23712, 28858, 1194, 23099, 29123, 3503, 55782, 62914, 33237, 23988, 27044, 1465, 53633, 60874, 47547, 21857, 24939, 15723, 51524, 58628, 45426, 19839, 6422, 13618, 49413, 40196, 43284, 17641, 4337, 11446, 63724, 38025, 41196, 31901, 470, 10785, 22063, 33342, 44548, 55835, 1636, 12899, 24190, 35401, 46702, 57943, 3747, 15009, 26288, 37519, 48787, 24270, 30004, 2337, 56578, 61716, 34063, 22901, 27954, 356, 54621, 59731, 48476, 20918, 26032, 14781, 52698, 57743, 46471, 18875, 7632, 12778, 50645, 39370, 44493, 16432, 5159, 10240, 64537, 36877, 41999, 30846, 3169, 8317, 3471, 9845, 23136, 36419, 41557, 54862, 2612, 15987, 21029, 34332, 47634, 60957, 759, 14065, 27388, 40603, 45774, 59078, 6906, 20113, 25259, 38548, 51851, 65164, 4977, 18278, 31557, 44887, 49988, 63296, 24284, 30003, 2338, 56606, 61722, 34066, 22884, 28014, 354, 54593, 22071, 32205, 472, 54779, 63981, 36342, 20876, 26059, 2461, 56740, 57770, 46501, 22863, 27977, 12612, 50467, 59766, 48510, 16706, 5418, 14619, 52520, 37174, 42292, 18650, 7374, 8390, 62692, 24283, 30005, 2311, 56585, 61711, 34051, 22864, 28014, 373, 54611, 59716, 9974, 3329, 28949, 42283, 35127, 64825, 8539, 5447, 31098, 44393, 37233, 50530, 10628, 7558, 16798, 46505, 39328, 52640, 12750, 24261, 30011, 2355, 56593, 61781, 34069, 22900, 28031, 370, 54592, 59732, 48476, 20906, 26096, 14762, 52625, 57741, 46494, 18875, 7640, 12734, 50566, 39320, 44527, 16434, 5168, 10297, 64529, 36869, 41991, 30842, 3173, 8315, 62559, 24264, 30015, 2353, 56611, 61710, 34052, 22907, 28025, 356, 54598, 59749, 48413, 20963, 26094, 14745, 52614, 57750, 46468, 18934, 7657, 12795, 50647, 39373};
        getPaymentFci = 483591723717915994L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v22 */
    public static java.lang.Object[] values(android.content.Context context, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 1;
        i5 = 1;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i6 = ~i;
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(40207998 | i)) | (~((-2359337) | i6))) * (-406)) - 1558469516) + ((~(1047496319 | i6)) * (-406)) + (((~(i | (-1045136984))) | (~(i6 | (-40207999)))) * 406))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                java.lang.Object obj2 = obj;
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 50, 2713 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                    byte b = (byte) ($$a[1] + 1);
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method);
                    obj2 = method;
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).intValue();
                return objArr;
            }
            try {
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    c(android.view.MotionEvent.axisFromString("") + 1, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), android.view.View.getDefaultSize(0, 0) + 38, objArr4);
                    java.lang.Object[] objArr5 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr4[0]).intern()), 2);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c((android.view.KeyEvent.getMaxKeyCode() >> 16) + 38, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 1239), 31 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr6);
                    try {
                        java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        c(android.view.View.MeasureSpec.getSize(0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 38 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr8);
                        objArr5[0] = java.lang.Class.forName(((java.lang.String) objArr8[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        a(new int[]{6, 31, 0, 0}, "\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000", false, objArr9);
                        try {
                            java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            int i7 = 37;
                            c(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, (char) android.graphics.Color.blue(0), 37 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr11);
                            objArr5[1] = java.lang.Class.forName(((java.lang.String) objArr11[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                            try {
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                a(new int[]{37, 23, 37, 0}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", false, objArr12);
                                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                c((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 69, (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 24350), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 17, objArr13);
                                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null);
                                try {
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    a(new int[]{37, 23, 37, 0}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", false, objArr14);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr14[0]).intern());
                                    int i8 = 5;
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    a(new int[]{60, 14, 0, 5}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000", true, objArr15);
                                    try {
                                        java.lang.Object[] objArr16 = {cls3.getMethod(((java.lang.String) objArr15[0]).intern(), null).invoke(context, null), 64};
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        c((android.os.Process.myTid() >> 22) + 86, (char) android.view.KeyEvent.normalizeMetaState(0), 'Q' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr17);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr17[0]).intern());
                                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                                        a(new int[]{74, 14, 134, 8}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000", false, objArr18);
                                        java.lang.Object invoke2 = cls4.getMethod(((java.lang.String) objArr18[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                        c(119 - android.text.TextUtils.indexOf("", ""), (char) (21312 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.text.TextUtils.indexOf("", "", 0) + 30, objArr19);
                                        java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                                        c(149 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), android.text.TextUtils.indexOf("", "", 0, 0) + 10, objArr20);
                                        java.lang.Object[] objArr21 = (java.lang.Object[]) cls5.getField(((java.lang.String) objArr20[0]).intern()).get(invoke2);
                                        int length = objArr21.length;
                                        int i9 = 0;
                                        while (i9 < length) {
                                            java.lang.Object obj3 = objArr21[i9];
                                            java.lang.Object[] objArr22 = new java.lang.Object[i5];
                                            a(new int[]{88, i8, 20, i8}, "\u0000\u0000\u0001\u0001\u0001", i4, objArr22);
                                            try {
                                                java.lang.Object[] objArr23 = {((java.lang.String) objArr22[i4]).intern()};
                                                java.lang.Object[] objArr24 = new java.lang.Object[i5];
                                                a(new int[]{93, i7, 94, i4}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", i5, objArr24);
                                                java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr24[i4]).intern());
                                                java.lang.Object[] objArr25 = new java.lang.Object[i5];
                                                a(new int[]{130, 11, 13, 3}, "\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", i5, objArr25);
                                                java.lang.String intern = ((java.lang.String) objArr25[0]).intern();
                                                java.lang.Class<?>[] clsArr = new java.lang.Class[i5];
                                                clsArr[0] = java.lang.String.class;
                                                java.lang.Object invoke3 = cls6.getMethod(intern, clsArr).invoke(null, objArr23);
                                                try {
                                                    java.lang.Object[] objArr26 = new java.lang.Object[i5];
                                                    c(android.widget.ExpandableListView.getPackedPositionChild(0L) + 160, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2296), android.graphics.Color.blue(0) + 28, objArr26);
                                                    java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr26[0]).intern());
                                                    java.lang.Object[] objArr27 = objArr21;
                                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                    c((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 187, (char) android.text.TextUtils.getOffsetBefore("", 0), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, objArr28);
                                                    try {
                                                        java.lang.Object[] objArr29 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod(((java.lang.String) objArr28[0]).intern(), null).invoke(obj3, null))};
                                                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                        a(new int[]{93, 37, 94, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", true, objArr30);
                                                        java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr30[0]).intern());
                                                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                        c(android.view.View.MeasureSpec.getMode(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30782), 19 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr31);
                                                        java.lang.Object invoke4 = cls8.getMethod(((java.lang.String) objArr31[0]).intern(), java.io.InputStream.class).invoke(invoke3, objArr29);
                                                        int length2 = objArr5.length;
                                                        int i10 = 0;
                                                        for (int i11 = 2; i10 < i11; i11 = 2) {
                                                            java.lang.Object obj4 = objArr5[i10];
                                                            try {
                                                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                                c(217 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), android.view.View.getDefaultSize(0, 0) + 34, objArr32);
                                                                java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr32[0]).intern());
                                                                int i12 = length;
                                                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                                c(251 - android.text.TextUtils.indexOf("", "", 0, 0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22, objArr33);
                                                                if (obj4.equals(cls9.getMethod(((java.lang.String) objArr33[0]).intern(), null).invoke(invoke4, null))) {
                                                                    java.lang.Object[] objArr34 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                                    int i13 = ~i;
                                                                    try {
                                                                        java.lang.Object[] objArr35 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-26212701) | i13)) | 1031141685) * (-1042)) + 2130750202 + (((-26212701) | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(i13 | (-9044041))) | (~((-1031141686) | i)) | 1013973025) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                                                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        java.lang.Object obj6 = obj5;
                                                                        if (obj5 == null) {
                                                                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                            byte b3 = (byte) ($$a[1] + 1);
                                                                            byte b4 = b3;
                                                                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                            b(b3, b4, b4, objArr36);
                                                                            java.lang.reflect.Method method2 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                                                                            obj6 = method2;
                                                                        }
                                                                        ((int[]) objArr34[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr35)).intValue();
                                                                        return objArr34;
                                                                    } catch (java.lang.Throwable th) {
                                                                        java.lang.Throwable cause = th.getCause();
                                                                        if (cause != null) {
                                                                            throw cause;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                i10++;
                                                                length = i12;
                                                            } catch (java.lang.Throwable th2) {
                                                                java.lang.Throwable cause2 = th2.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th2;
                                                            }
                                                        }
                                                        i9++;
                                                        objArr21 = objArr27;
                                                        i4 = 0;
                                                        i8 = 5;
                                                        i5 = 1;
                                                        i7 = 37;
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
                }
                i3 = i5;
            } catch (java.lang.Throwable unused2) {
                i3 = 1;
            }
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            iArr[0] = i;
            iArr2[0] = i;
            java.lang.Object[] objArr37 = {iArr, iArr2, null, new int[i3]};
            java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(r2 | (-176664086))) | 828264899) * 226) - 882896512) + (((~((~i) | (-176270869))) | (~((-828264900) | i)) | 827871682) * (-113)) + ((~(i | (-176664086))) * 113))};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            java.lang.Object obj8 = obj7;
            if (obj7 == null) {
                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2713 - android.text.TextUtils.indexOf("", "", 0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                byte b5 = (byte) ($$a[1] + 1);
                byte b6 = b5;
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                b(b5, b6, b6, objArr39);
                java.lang.reflect.Method method3 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                obj8 = method3;
            }
            ((int[]) objArr37[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr38)).intValue();
            return objArr37;
        } catch (java.lang.Throwable th11) {
            java.lang.Throwable cause11 = th11.getCause();
            if (cause11 != null) {
                throw cause11;
            }
            throw th11;
        }
    }

    public static byte[] values(com.payair.hce.isNetworkError isnetworkerror) {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{isnetworkerror}, 145909445, -145909443, (int) java.lang.System.currentTimeMillis());
    }

    static void init$1() {
        $$d = new byte[]{63, kotlin.io.encoding.Base64.padSymbol, -101, com.google.common.base.Ascii.SI};
        $$e = 247;
    }

    @Override // com.payair.hce.isNetworkError
    public final byte[] SdkCoreBusinessLogicModuleImpl() {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 1916083250, -1916083249, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{18, -1, 36, -56, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = 128;
    }

    @Override // com.payair.hce.isNetworkError
    public final byte[] values() {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -2138907186, 2138907186, java.lang.System.identityHashCode(this));
    }
}
