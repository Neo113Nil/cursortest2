package com.payair.hce;

/* loaded from: classes4.dex */
public class setOnGroupClickListener extends java.lang.Number {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getProfileVersion;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String valueOf;
    private java.lang.String values;
    private java.lang.String writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2 = 111 - (s * 2);
        byte[] bArr = $$a;
        int i3 = 4 - (b2 * 4);
        int i4 = b * 3;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i2;
            int i6 = 0;
            i2 = i4;
            i2 += i5;
            i3++;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = bArr[i3];
            i2 += i5;
            i3++;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    public setOnGroupClickListener(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 12, 0, 5}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000", true, objArr);
        this.writeReplace = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{12, 13, 115, 0}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000", false, objArr2);
        this.values = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(new int[]{25, 21, 0, 0}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", false, objArr3);
        this.AlternateContactlessPaymentDataJson = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{46, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 0, 95}, "\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000", true, objArr4);
        this.DigitizedCardProfile = ((java.lang.String) objArr4[0]).intern();
        this.valueOf = str;
    }

    @Override // java.lang.Number
    public int intValue() {
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 73) % 128;
        int intValue = valueOf().intValue();
        int i = getProfileVersion + 65;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return intValue;
        }
        throw null;
    }

    @Override // java.lang.Number
    public long longValue() {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 33) % 128;
        long longValue = ((java.lang.Long) values(new java.lang.Object[]{this}, -1880090854, 1880090854, java.lang.System.identityHashCode(this))).longValue();
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 23) % 128;
        return longValue;
    }

    @Override // java.lang.Number
    public float floatValue() {
        int i = getProfileVersion + 57;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            getProfileVersion();
            throw new java.lang.ArithmeticException();
        }
        float floatValue = getProfileVersion().floatValue();
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 15) % 128;
        return floatValue;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 35) % 128;
        double doubleValue = writeReplace().doubleValue();
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 75) % 128;
        return doubleValue;
    }

    public final java.math.BigInteger DigitizedCardProfile() {
        int i = getProfileVersion + 7;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            SdkCoreAlternateContactlessPaymentDataImpl();
            throw new java.lang.ArithmeticException();
        }
        if (SdkCoreAlternateContactlessPaymentDataImpl()) {
            return new java.math.BigInteger(this.valueOf.substring(2), 16);
        }
        if (IccPrivateKeyCrtComponentsJson()) {
            return new java.math.BigInteger(this.valueOf.substring(1), 8);
        }
        java.math.BigInteger bigInteger = new java.math.BigInteger(this.valueOf);
        int i2 = getProfileVersion + 17;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    private java.lang.Double writeReplace() {
        int i = IccPrivateKeyCrtComponentsJson + 1;
        getProfileVersion = i % 128;
        java.lang.String str = this.valueOf;
        if (i % 2 != 0) {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
        }
        java.lang.Double.parseDouble(str);
        throw null;
    }

    private java.lang.Integer valueOf() {
        if (!SdkCoreAlternateContactlessPaymentDataImpl()) {
            if (!IccPrivateKeyCrtComponentsJson()) {
                return java.lang.Integer.valueOf(java.lang.Integer.parseInt(this.valueOf));
            }
            int parseInt = java.lang.Integer.parseInt(this.valueOf.substring(1), 8);
            int i = IccPrivateKeyCrtComponentsJson + 13;
            getProfileVersion = i % 128;
            if (i % 2 != 0) {
                return java.lang.Integer.valueOf(parseInt);
            }
            throw null;
        }
        int i2 = IccPrivateKeyCrtComponentsJson + 55;
        getProfileVersion = i2 % 128;
        return i2 % 2 == 0 ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(this.valueOf.substring(5), 29)) : java.lang.Integer.valueOf(java.lang.Integer.parseInt(this.valueOf.substring(2), 16));
    }

    private java.lang.Float getProfileVersion() {
        int i = getProfileVersion + 125;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            java.lang.Float.parseFloat(this.valueOf);
            throw null;
        }
        float parseFloat = java.lang.Float.parseFloat(this.valueOf);
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 63) % 128;
        return java.lang.Float.valueOf(parseFloat);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setOnGroupClickListener setongroupclicklistener = (com.payair.hce.setOnGroupClickListener) objArr[0];
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 35) % 128;
        if (!setongroupclicklistener.SdkCoreAlternateContactlessPaymentDataImpl()) {
            if (setongroupclicklistener.IccPrivateKeyCrtComponentsJson()) {
                return java.lang.Long.valueOf(java.lang.Long.parseLong(setongroupclicklistener.valueOf.substring(1), 8));
            }
            long parseLong = java.lang.Long.parseLong(setongroupclicklistener.valueOf);
            int i = getProfileVersion + 5;
            IccPrivateKeyCrtComponentsJson = i % 128;
            if (i % 2 == 0) {
                return java.lang.Long.valueOf(parseLong);
            }
            throw new java.lang.ArithmeticException();
        }
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 29) % 128;
        return java.lang.Long.valueOf(java.lang.Long.parseLong(setongroupclicklistener.valueOf.substring(2), 16));
    }

    public final java.math.BigDecimal AlternateContactlessPaymentDataJson() {
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(this.valueOf);
        int i = IccPrivateKeyCrtComponentsJson + 57;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            return bigDecimal;
        }
        throw new java.lang.ArithmeticException();
    }

    private boolean SdkCoreAlternateContactlessPaymentDataImpl() {
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 59) % 128;
        java.lang.String str = this.valueOf;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, 2, 40, 2}, "\u0000\u0000", false, objArr);
        boolean startsWith = str.startsWith(((java.lang.String) objArr[0]).intern());
        int i = getProfileVersion + 51;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return startsWith;
        }
        throw null;
    }

    private boolean IccPrivateKeyCrtComponentsJson() {
        if (this.valueOf.length() > 1) {
            int i = IccPrivateKeyCrtComponentsJson + 23;
            getProfileVersion = i % 128;
            if (i % 2 != 0 ? this.valueOf.charAt(0) == '0' : this.valueOf.charAt(0) == '{') {
                getProfileVersion = (IccPrivateKeyCrtComponentsJson + 115) % 128;
                if (java.lang.Character.isDigit(this.valueOf.charAt(1))) {
                    int i2 = getProfileVersion + 51;
                    IccPrivateKeyCrtComponentsJson = i2 % 128;
                    return i2 % 2 == 0;
                }
            }
        }
        return false;
    }

    public final boolean values() {
        int i = getProfileVersion + 67;
        IccPrivateKeyCrtComponentsJson = i % 128;
        int i2 = i % 2;
        java.lang.String str = this.valueOf;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, 6, 0, 0}, "\u0001\u0001\u0000\u0001\u0000\u0001", true, objArr);
        boolean matches = str.matches(((java.lang.String) objArr[0]).intern());
        int i3 = IccPrivateKeyCrtComponentsJson + 39;
        getProfileVersion = i3 % 128;
        if (i3 % 2 != 0) {
            return matches;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0162, code lost:
    
        if (r0[r1.writeReplace] == 1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0266 A[Catch: all -> 0x011b, TryCatch #0 {all -> 0x011b, blocks: (B:12:0x0043, B:14:0x0057, B:15:0x0098, B:26:0x00ab, B:28:0x00c3, B:29:0x0105, B:48:0x016b, B:50:0x0189, B:51:0x01cb, B:54:0x0253, B:56:0x0266, B:58:0x02a3, B:63:0x01e2, B:65:0x0201, B:66:0x0240), top: B:11:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        char[] cArr;
        int i;
        char c;
        java.lang.Object obj;
        java.lang.String str2 = str;
        int i2 = ($11 + 39) % 128;
        $10 = i2;
        byte[] bArr = str2;
        if (str2 != null) {
            $10 = i2;
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        byte b = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = 2;
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = SdkCoreAlternateContactlessPaymentDataImpl;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 1;
                $11 = i10 % 128;
                if (i10 % i6 == 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i4];
                        objArr2[b] = java.lang.Integer.valueOf(cArr2[i9]);
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj2 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, b) + 2808, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b(b, (short) 1, b, objArr3);
                            obj2 = cls.getMethod((java.lang.String) objArr3[b], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj2);
                        }
                        cArr3[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[i9])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj3 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28, 2807 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, (short) 1, (byte) 0, objArr5);
                        obj3 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj3);
                    }
                    cArr3[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).charValue();
                }
                i9++;
                b = 0;
                i4 = 1;
                i6 = 2;
            }
            $10 = ($11 + 121) % 128;
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i5];
        java.lang.System.arraycopy(cArr2, i3, cArr4, 0, i5);
        if (bArr2 != null) {
            int i11 = $11 + 113;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr = new char[i5];
                i = 1;
            } else {
                cArr = new char[i5];
                i = 0;
            }
            getaccounttype.writeReplace = i;
            char c2 = 0;
            while (getaccounttype.writeReplace < i5) {
                int i12 = $10 + 75;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    if (bArr2[getaccounttype.writeReplace] == 0) {
                        c = 1;
                        int i13 = getaccounttype.writeReplace;
                        char c3 = cArr4[getaccounttype.writeReplace];
                        java.lang.Object[] objArr6 = new java.lang.Object[2];
                        objArr6[c] = java.lang.Integer.valueOf(c2);
                        objArr6[0] = java.lang.Integer.valueOf(c3);
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2836, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b((byte) 0, (short) 2, (byte) 0, objArr7);
                            obj4 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj4);
                        }
                        cArr[i13] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).charValue();
                        c2 = cArr[getaccounttype.writeReplace];
                        java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                        if (obj != null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33, android.view.Gravity.getAbsoluteGravity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.text.TextUtils.indexOf("", ""))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj);
                        }
                        ((java.lang.reflect.Method) obj).invoke(null, objArr8);
                    }
                    int i14 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj5 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.getTrimmedLength(""), 2881 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.view.KeyEvent.getDeadChar(0, 0));
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        b((byte) 0, (short) 0, (byte) 0, objArr10);
                        obj5 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj5);
                    }
                    cArr[i14] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr9)).charValue();
                    c2 = cArr[getaccounttype.writeReplace];
                    java.lang.Object[] objArr82 = {getaccounttype, getaccounttype};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                    if (obj != null) {
                    }
                    ((java.lang.reflect.Method) obj).invoke(null, objArr82);
                } else {
                    c = 1;
                }
            }
            cArr4 = cArr;
        }
        if (i8 > 0) {
            int i15 = $10 + 97;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                char[] cArr5 = new char[i5];
                java.lang.System.arraycopy(cArr4, 1, cArr5, 0, i5);
                java.lang.System.arraycopy(cArr5, 0, cArr4, i5 >>> i8, i8);
                java.lang.System.arraycopy(cArr5, i8, cArr4, 0, i5 - i8);
            } else {
                char[] cArr6 = new char[i5];
                java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i5);
                int i16 = i5 - i8;
                java.lang.System.arraycopy(cArr6, 0, cArr4, i16, i8);
                java.lang.System.arraycopy(cArr6, i8, cArr4, 0, i16);
            }
        }
        if (z) {
            $10 = ($11 + 83) % 128;
            char[] cArr7 = new char[i5];
            int i17 = 0;
            while (true) {
                getaccounttype.writeReplace = i17;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                cArr7[getaccounttype.writeReplace] = cArr4[(i5 - getaccounttype.writeReplace) - 1];
                i17 = getaccounttype.writeReplace + 1;
            }
            cArr4 = cArr7;
        }
        if (i7 > 0) {
            int i18 = 0;
            while (true) {
                getaccounttype.writeReplace = i18;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                $10 = ($11 + 19) % 128;
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i18 = getaccounttype.writeReplace + 1;
            }
        }
        java.lang.String str3 = new java.lang.String(cArr4);
        $10 = ($11 + 67) % 128;
        objArr[0] = str3;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{16876, 16785, 16827, 16808, 16780, 16870, 16868, 16794, 16822, 16800, 16806, 16806, 16771, 16763, 16663, 16678, 16658, 16655, 16647, 16661, 16661, 16687, 16677, 16649, 16723, 16867, 16814, 16795, 16799, 16786, 16781, 16866, 16779, 16768, 16893, 16780, 16808, 16827, 16785, 16792, 16806, 16806, 16800, 16822, 16794, 16868, 16857, 16779, 16780, 16796, 16796, 16890, 16890, 16871, 16868, 16794, 16822, 16800, 16806, 16806, 16792, 16785, 16827, 16808, 16780, 16893, 16768, 16779, 16866, 16781, 16786, 16799, 16795, 16814, 16783, 16870, 16890, 16890, 16868, 16794, 16822, 16800, 16806, 16806, 16792, 16785, 16827, 16808, 16780, 16870, 16893, 16890, 16869, 16779, 16780, 16870, 16868, 16794, 16822, 16800, 16806, 16806, 16792, 16785, 16827, 16808, 16780, 16870, 16870, 16870, 16796, 16820, 16824, 16800, 16805, 16805, 16809, 16804, 16789, 16812, 16811, 16793, 16793, 16885, 16893, 16768, 16779, 16866, 16781, 16780, 16781, 16776, 16895, 16795, 16804, 16778, 16864, 16894, 16794, 16804, 16789, 16780, 16781, 16776, 16895, 16795, 16804, 16778, 16864, 16894, 16794, 16804, 16789, 16780, 16871, 16890, 16768, 16798, 16794, 16795, 16792, 16814, 16780, 16871, 16871, 16868, 16794, 16822, 16800, 16806, 16806, 16792, 16785, 16827, 16808, 16780, 16893, 16768, 16779, 16866, 16781, 16786, 16792, 16814, 16811, 16780, 16871, 16871, 16868, 16794, 16822, 16800, 16806, 16806, 16792, 16768, 16807, 16827, 16808, 16780, 16870, 16869, 16779, 16780, 16893, 16890, 16868, 16794, 16822, 16800, 16806, 16806, 16792, 16768, 16807, 16827, 16808, 16780, 16780, 16788, 16806, 16807, 16779, 16866, 16796, 16796, 16890, 16890, 16869, 16779, 16780, 16870, 16868, 16794, 16822, 16800, 16806, 16806, 16792, 16768, 16807, 16827, 16808, 16780, 16780, 16788, 16806, 16807, 16779, 16866, 16870, 16870, 16796, 16796, 16890, 16890, 16871, 16868, 16794, 16822, 16800, 16806, 16806, 16792, 16785, 16827, 16808, 16780, 16893, 16768, 16779, 16866, 16781, 16786, 16799, 16795, 16814, 16783, 16870, 16871, 16868, 16794, 16822, 16800, 16806, 16806, 16792, 16785, 16827, 16808, 16780, 16870, 16866, 16818, 16859, 16777, 16814, 16771, 16888, 16778};
    }

    private java.lang.Long RecordsJson() {
        return (java.lang.Long) values(new java.lang.Object[]{this}, -1880090854, 1880090854, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{Byte.MAX_VALUE, -61, 58, -113};
        $$b = 147;
    }
}
