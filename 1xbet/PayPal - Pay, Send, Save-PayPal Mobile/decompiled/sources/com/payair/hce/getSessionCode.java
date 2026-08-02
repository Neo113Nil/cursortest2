package com.payair.hce;

/* loaded from: classes10.dex */
public final class getSessionCode {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean SdkCoreBusinessLogicModuleImpl;
    private static long getCardLayoutDescription;
    private static char[] getCiacDecline;
    private static /* synthetic */ boolean getCvrMaskAnd;
    private static int getDualTapResetTimeout;
    private static boolean getGpoResponse;
    private static int getPaymentFci;
    private static int getSecurityWord;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private int DigitizedCardProfile;
    private java.lang.String IccPrivateKeyCrtComponentsJson;
    private java.lang.String RecordsJson;
    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;
    private java.lang.String getAid;
    private java.lang.String getProfileVersion;
    private java.lang.String valueOf;
    private java.security.spec.RSAPrivateCrtKeySpec values;
    private java.security.interfaces.RSAPrivateKey writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = s3 + 4;
        int i4 = 119 - s;
        int i5 = (s2 * 4) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i4 = i5;
            int i6 = i3;
            i2 = 0;
            i4 += -i3;
            i3 = i6;
            i = i2;
            int i7 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i7;
            i3 = bArr[i7];
            i4 += -i3;
            i3 = i6;
            i = i2;
            int i72 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            int i722 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = ~(i5 | i);
        int i7 = (i * (-711)) + (i2 * 713) + (((~(i4 | i)) | i6) * (-712)) + (((~(i | i4 | i5)) | (~(i2 | i | i3))) * (-712)) + ((i4 | i6) * 712);
        if (i7 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i7 == 2) {
            return writeReplace(objArr);
        }
        com.payair.hce.getSessionCode getsessioncode = (com.payair.hce.getSessionCode) objArr[0];
        getDualTapResetTimeout = (getSecurityWord + 53) % 128;
        java.lang.String DigitizedCardProfile = DigitizedCardProfile(getsessioncode.writeReplace());
        getDualTapResetTimeout = (getSecurityWord + 89) % 128;
        return DigitizedCardProfile;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSecurityWord = 0;
        getDualTapResetTimeout = 1;
        getCiacDecline();
        getCvrMaskAnd();
        getDualTapResetTimeout = (getSecurityWord + 67) % 128;
        getCvrMaskAnd = true;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(getCardLayoutDescription ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getCardLayoutDescription)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 41, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1921, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                    byte b = (byte) ($$b & 2);
                    byte b2 = (byte) (b - 2);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(b, b2, (byte) (b2 - 1), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.keyCodeFromString(""), 428 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (31610 - android.graphics.Color.blue(0)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((short) 0, (short) 0, (short) -1, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
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
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    public getSessionCode(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.valueOf = str;
        this.getAid = str2;
        this.getProfileVersion = str3;
        this.RecordsJson = str4;
        this.IccPrivateKeyCrtComponentsJson = str5;
        SdkCoreBusinessLogicModuleImpl();
        writeReplace(new java.lang.Object[]{this}, -1624628201, 1624628202, java.lang.System.identityHashCode(this));
        this.AlternateContactlessPaymentDataJson = str6;
        this.SdkCoreAlternateContactlessPaymentDataImpl = str7;
    }

    public getSessionCode(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 127, null, null, "\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        this.valueOf = rSAPrivateCrtKey.getPrimeP().toString(16);
        this.getAid = rSAPrivateCrtKey.getPrimeQ().toString(16);
        this.getProfileVersion = rSAPrivateCrtKey.getPrimeExponentP().toString(16);
        this.RecordsJson = rSAPrivateCrtKey.getPrimeExponentQ().toString(16);
        this.IccPrivateKeyCrtComponentsJson = rSAPrivateCrtKey.getCrtCoefficient().toString(16);
        if (this.valueOf.length() % 2 == 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(intern);
            sb.append(this.valueOf);
            this.valueOf = sb.toString();
        }
        if (this.getAid.length() % 2 == 1) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(intern);
            sb2.append(this.getAid);
            this.getAid = sb2.toString();
        }
        if (this.getProfileVersion.length() % 2 == 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(intern);
            sb3.append(this.getProfileVersion);
            this.getProfileVersion = sb3.toString();
        }
        if (this.RecordsJson.length() % 2 == 1) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(intern);
            sb4.append(this.RecordsJson);
            this.RecordsJson = sb4.toString();
        }
        if (this.IccPrivateKeyCrtComponentsJson.length() % 2 == 1) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(intern);
            sb5.append(this.IccPrivateKeyCrtComponentsJson);
            this.IccPrivateKeyCrtComponentsJson = sb5.toString();
        }
        SdkCoreBusinessLogicModuleImpl();
        writeReplace(new java.lang.Object[]{this}, -1624628201, 1624628202, java.lang.System.identityHashCode(this));
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(127 - android.text.TextUtils.getOffsetAfter("", 0), null, null, "\u0082\u0081\u0081\u0081\u0081\u0081", objArr2);
        this.AlternateContactlessPaymentDataJson = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(127 - android.view.KeyEvent.getDeadChar(0, 0), null, null, "\u0089\u0084\u0088\u0087\u0086\u0084\u0085\u0084\u0083", objArr3);
        this.SdkCoreAlternateContactlessPaymentDataImpl = ((java.lang.String) objArr3[0]).intern();
    }

    private static java.lang.String DigitizedCardProfile(java.lang.String str) {
        getDualTapResetTimeout = (getSecurityWord + 81) % 128;
        java.lang.String hexString = java.lang.Integer.toHexString(str.length() / 2);
        if (hexString.length() % 2 != 1) {
            int i = getDualTapResetTimeout + 83;
            getSecurityWord = i % 128;
            if (i % 2 == 0) {
                return hexString;
            }
            throw null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(127 - android.graphics.Color.red(0), null, null, "\u0081", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(hexString);
        return sb.toString();
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            $10 = ($11 + 61) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = getCiacDecline;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 287 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (46337 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr4[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getPaymentFci)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777262, 286 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getGpoResponse) {
            $10 = ($11 + 15) % 128;
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 44, android.graphics.Color.red(0) + 1629, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                    byte b = (byte) ($$b & 1);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c(b, b2, (byte) (b2 - 1), objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!SdkCoreBusinessLogicModuleImpl) {
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
            int i3 = $10 + 89;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getumdgeneration.valueOf;
                int i5 = getumdgeneration.values;
                throw new java.lang.ArithmeticException();
            }
            cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.combineMeasuredStates(0, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1629, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                byte b3 = (byte) ($$b & 1);
                byte b4 = (byte) (b3 - 1);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                c(b3, b4, (byte) (b4 - 1), objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    private void SdkCoreBusinessLogicModuleImpl() {
        java.math.BigInteger bigInteger = new java.math.BigInteger(this.valueOf, 16);
        java.math.BigInteger bigInteger2 = new java.math.BigInteger(this.getAid, 16);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(this.getProfileVersion, 16);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger(this.RecordsJson, 16);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(this.IccPrivateKeyCrtComponentsJson, 16);
        java.math.BigInteger multiply = bigInteger.multiply(bigInteger2);
        this.DigitizedCardProfile = multiply.bitLength() / 8;
        java.math.BigInteger modInverse = bigInteger3.modInverse(bigInteger.subtract(java.math.BigInteger.ONE));
        this.values = new java.security.spec.RSAPrivateCrtKeySpec(multiply, modInverse, modInverse.modInverse(bigInteger.subtract(java.math.BigInteger.ONE).multiply(bigInteger2.subtract(java.math.BigInteger.ONE)).divide(bigInteger.subtract(java.math.BigInteger.ONE).gcd(bigInteger2.subtract(java.math.BigInteger.ONE)))), bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5);
        int i = getSecurityWord + 1;
        getDualTapResetTimeout = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.security.KeyFactory keyFactory;
        com.payair.hce.getSessionCode getsessioncode = (com.payair.hce.getSessionCode) objArr[0];
        getSecurityWord = (getDualTapResetTimeout + 101) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, null, null, "\u0087\u008a\u0086", objArr2);
            keyFactory = java.security.KeyFactory.getInstance(((java.lang.String) objArr2[0]).intern());
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
            keyFactory = null;
        }
        try {
            if (!getCvrMaskAnd) {
                getSecurityWord = (getDualTapResetTimeout + 43) % 128;
                if (keyFactory == null) {
                    throw new java.lang.AssertionError();
                }
            }
            getsessioncode.writeReplace = (java.security.interfaces.RSAPrivateKey) keyFactory.generatePrivate(getsessioncode.values);
            return null;
        } catch (java.security.spec.InvalidKeySpecException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final int valueOf() {
        int i = (getDualTapResetTimeout + 69) % 128;
        getSecurityWord = i;
        int i2 = this.DigitizedCardProfile;
        int i3 = i + 115;
        getDualTapResetTimeout = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        int i = (getDualTapResetTimeout + 71) % 128;
        getSecurityWord = i;
        java.lang.String str = this.AlternateContactlessPaymentDataJson;
        getDualTapResetTimeout = (i + 115) % 128;
        return str;
    }

    public final java.lang.String values() {
        getDualTapResetTimeout = (getSecurityWord + 113) % 128;
        java.lang.String upperCase = this.values.getModulus().toString(16).toUpperCase();
        if (upperCase.length() % 2 != 1) {
            return upperCase;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), null, null, "\u0081", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(upperCase);
        java.lang.String obj = sb.toString();
        int i = getSecurityWord + 43;
        getDualTapResetTimeout = i % 128;
        if (i % 2 != 0) {
            return obj;
        }
        throw null;
    }

    public final java.lang.String writeReplace() {
        getDualTapResetTimeout = (getSecurityWord + 95) % 128;
        java.lang.String upperCase = this.values.getPublicExponent().toString(16).toUpperCase();
        if (upperCase.length() % 2 != 1) {
            return upperCase;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), null, null, "\u0081", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(upperCase);
        java.lang.String obj = sb.toString();
        int i = getSecurityWord + 87;
        getDualTapResetTimeout = i % 128;
        if (i % 2 != 0) {
            return obj;
        }
        throw null;
    }

    public final java.lang.String SdkCoreAlternateContactlessPaymentDataImpl() {
        int i = getDualTapResetTimeout + 31;
        getSecurityWord = i % 128;
        if (i % 2 == 0) {
            return this.SdkCoreAlternateContactlessPaymentDataImpl;
        }
        throw null;
    }

    public final java.lang.String getProfileVersion() {
        int i = (getDualTapResetTimeout + 27) % 128;
        getSecurityWord = i;
        java.lang.String str = this.valueOf;
        int i2 = i + 113;
        getDualTapResetTimeout = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String RecordsJson() {
        int i = getDualTapResetTimeout + 19;
        int i2 = i % 128;
        getSecurityWord = i2;
        if (i % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.getAid;
        getDualTapResetTimeout = (i2 + 3) % 128;
        return str;
    }

    public final java.lang.String getAid() {
        int i = getDualTapResetTimeout;
        getSecurityWord = (i + 91) % 128;
        java.lang.String str = this.getProfileVersion;
        int i2 = i + 77;
        getSecurityWord = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final java.lang.String IccPrivateKeyCrtComponentsJson() {
        int i = getSecurityWord + 37;
        getDualTapResetTimeout = i % 128;
        if (i % 2 != 0) {
            return this.RecordsJson;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.getSessionCode getsessioncode = (com.payair.hce.getSessionCode) objArr[0];
        int i = (getSecurityWord + 97) % 128;
        getDualTapResetTimeout = i;
        java.lang.String str = getsessioncode.IccPrivateKeyCrtComponentsJson;
        int i2 = i + 97;
        getSecurityWord = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final java.lang.String valueOf(java.lang.String str) {
        java.lang.Object obj;
        try {
            byte[] decodeHex = org.apache.commons.codec.binary.Hex.decodeHex(str.toCharArray());
            int i = getSecurityWord + 57;
            getDualTapResetTimeout = i % 128;
            try {
                if (i % 2 == 0) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(32209 << android.view.MotionEvent.axisFromString(""), null, null, "\u0094\u0093\u0092\u0091\u0091\u0090\u008f\u008e\u0085\u008b\u008d\u008c\u0084\u008b\u0087\u008a\u0086", objArr);
                    obj = objArr[0];
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(android.view.MotionEvent.axisFromString("") + 128, null, null, "\u0094\u0093\u0092\u0091\u0091\u0090\u008f\u008e\u0085\u008b\u008d\u008c\u0084\u008b\u0087\u008a\u0086", objArr2);
                    obj = objArr2[0];
                }
                java.lang.String intern = ((java.lang.String) obj).intern();
                getDualTapResetTimeout = (getSecurityWord + 51) % 128;
                try {
                    try {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b("\uf07e\uf014銁ꇊ\ufe1c頾셟塀㲮浽첃꜋楗庋ǌ\uf3fe閨\u0be0㈹㹙슶\uf72e暚", android.view.View.resolveSize(0, 0), objArr3);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        b("藜薻\u0018㍗곊쫪叇쫰䤚ﾹ鹂㖀᳢찁匋", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, objArr4);
                        java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, intern);
                        java.security.interfaces.RSAPrivateKey rSAPrivateKey = this.writeReplace;
                        getSecurityWord = (getDualTapResetTimeout + 79) % 128;
                        try {
                            java.lang.Object[] objArr5 = {1, rSAPrivateKey};
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            b("\uf07e\uf014銁ꇊ\ufe1c頾셟塀㲮浽첃꜋楗庋ǌ\uf3fe閨\u0be0㈹㹙슶\uf72e暚", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b("ﵹﴐᒳ⟷\ue5fe菃觭ყ", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, objArr7);
                            cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.security.Key.class).invoke(invoke, objArr5);
                            try {
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                b("\uf07e\uf014銁ꇊ\ufe1c頾셟塀㲮浽첃꜋楗庋ǌ\uf3fe閨\u0be0㈹㹙슶\uf72e暚", android.view.KeyEvent.getDeadChar(0, 0), objArr8);
                                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                b("퉮툊\uf291쇔젣긱㹶ꝡẨഢ荒", (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr9);
                                return new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex((byte[]) cls3.getMethod((java.lang.String) objArr9[0], byte[].class).invoke(invoke, decodeHex)));
                            } catch (java.lang.Throwable th) {
                                try {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                } catch (javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException e) {
                                    e.printStackTrace();
                                    return null;
                                }
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
                } catch (java.security.InvalidKeyException e2) {
                    e = e2;
                    e.printStackTrace();
                    return null;
                } catch (java.security.NoSuchAlgorithmException e3) {
                    e = e3;
                    e.printStackTrace();
                    return null;
                } catch (javax.crypto.NoSuchPaddingException e4) {
                    e = e4;
                    e.printStackTrace();
                    return null;
                }
            } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e5) {
                e = e5;
            }
        } catch (org.apache.commons.codec.DecoderException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    static void getCiacDecline() {
        getCardLayoutDescription = 1468976012519098345L;
    }

    static void getCvrMaskAnd() {
        getCiacDecline = new char[]{10986, 10989, 10995, 10993, 10952, 10956, 11005, 10958, 11006, 10959, 10987, 11007, 11004, 10923, 10954, 10973, 10974, 10965, 10920, 10963};
        getPaymentFci = -143185350;
        SdkCoreBusinessLogicModuleImpl = true;
        getGpoResponse = true;
    }

    public final java.lang.String getGpoResponse() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -1578676701, 1578676703, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 668305579, -668305579, java.lang.System.identityHashCode(this));
    }

    private void getPaymentFci() {
        writeReplace(new java.lang.Object[]{this}, -1624628201, 1624628202, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{69, -73, 121, 3};
        $$b = 111;
    }
}
