package com.payair.hce;

/* loaded from: classes4.dex */
public class openOrCreateDatabase extends com.payair.hce.fileList {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static final byte[] RecordsJson = null;
    private static final int getAid = 0;
    private static int values;
    private java.lang.String valueOf;
    private int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = s + 4;
        int i4 = (i * 19) + 99;
        int i5 = b * 27;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 7];
        int i6 = i5 + 6;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i4 += i7;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i3];
            i4 += i7;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (s * 3) + 5;
        int i4 = 1 - (b2 * 2);
        byte[] bArr = $$d;
        int i5 = 73 - (b * 8);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            i5 = i4;
            i2 = 0;
            i5 += i6;
            i3++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i5 += i6;
            i3++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    public openOrCreateDatabase(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str, str2);
        this.valueOf = str3;
    }

    public openOrCreateDatabase(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4) {
        super(str, str2, str3, str4);
        this.writeReplace = i;
    }

    public final int values() {
        int i = IccPrivateKeyCrtComponentsJson;
        values = (i + 67) % 128;
        int i2 = this.writeReplace;
        int i3 = i + 9;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    public final java.lang.String RecordsJson() {
        int i = (IccPrivateKeyCrtComponentsJson + 65) % 128;
        values = i;
        java.lang.String str = this.valueOf;
        int i2 = i + 93;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.payair.hce.fileList
    public java.lang.String toString() {
        int i = IccPrivateKeyCrtComponentsJson;
        values = (i + 5) % 128;
        int i2 = i + 59;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return "openOrCreateDatabase";
        }
        throw null;
    }

    private static void b(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        long j;
        $11 = ($10 + 113) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = DigitizedCardProfile;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 49, 2508 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (6802 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                        byte b2 = (byte) ($$e & 1);
                        byte b3 = $$d[0];
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(b2, b3, b3, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        long j2 = 0;
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 2509 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (6801 - android.graphics.ImageFormat.getBitsPerPixel(0)));
            byte b4 = (byte) ($$e & 1);
            byte b5 = $$d[0];
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            d(b4, b5, b5, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    j = j2;
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('M' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 3596 - android.view.View.MeasureSpec.getSize(0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            j = 0;
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2665, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 18889));
                            byte b6 = $$d[0];
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            d(b6, b6, b6, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        } else {
                            j = 0;
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i4 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i5 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i4 * charValue) + i5];
                        $11 = ($10 + 105) % 128;
                    } else {
                        j = 0;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i6 = digitizedCardJson12.DigitizedCardProfile;
                            int i7 = digitizedCardJson12.RecordsJson;
                            int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr3[digitizedCardJson12.values] = cArr[(i6 * charValue) + i7];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i8 * charValue) + i9];
                        } else {
                            int i10 = digitizedCardJson12.DigitizedCardProfile;
                            int i11 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i12 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i13 = digitizedCardJson12.RecordsJson;
                            cArr3[digitizedCardJson12.values] = cArr[(i10 * charValue) + i11];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i12 * charValue) + i13];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                $10 = ($11 + 71) % 128;
                j2 = j;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            $10 = ($11 + 119) % 128;
            cArr3[i14] = (char) (cArr3[i14] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0507 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void AlternateContactlessPaymentDataJson(long j, long j2) {
        int i;
        int i2;
        java.lang.Object obj;
        java.lang.Object invoke;
        java.lang.Object method;
        java.lang.Object invoke2;
        java.lang.Object obj2;
        com.payair.hce.getExternalCacheDirs getexternalcachedirs = new com.payair.hce.getExternalCacheDirs(j, j2);
        byte[] bArr = RecordsJson;
        byte b = bArr[6];
        short s = bArr[27];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, s, (short) (s & 376), objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        byte b2 = bArr[58];
        byte b3 = b2;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(b3, (short) (b3 | com.visa.cbp.getEncExpo.IResultReceiver), b2, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c = 384;
            char c2 = 494;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            short s2 = 375;
            a(bArr[384], (short) 375, bArr[494], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((byte) (bArr[435] - 1), (short) 390, bArr[4], objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(bArr[384], (short) 375, bArr[494], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i3]};
                byte[] bArr2 = RecordsJson;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(bArr2[384], (short) 394, (short) (-bArr2[418]), objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a((byte) 74, (short) 410, bArr2[9], objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                byte b4 = bArr2[384];
                short s3 = bArr2[c2];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(b4, (short) 375, s3, objArr11);
                java.lang.Object invoke3 = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(bArr2[384], (short) 394, (short) (-bArr2[418]), objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a((byte) (bArr2[384] - 1), (short) 416, bArr2[15], objArr13);
                iArr[i3] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke3, null)).intValue();
                i3++;
                c2 = 494;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                    i2 = 21;
                } catch (java.lang.Throwable th) {
                    th = th;
                    i = 15;
                    if (i5 >= 25) {
                    }
                    throw th;
                }
                switch (getexternalcachedirs.DigitizedCardProfile(iArr[i4])) {
                    case -36:
                        i4 = 108;
                        c = 384;
                        s2 = 375;
                    case -35:
                        i = 15;
                        try {
                            getexternalcachedirs.DigitizedCardProfile(36);
                            int i6 = getexternalcachedirs.AlternateContactlessPaymentDataJson;
                            i4 = (i6 == 21 || i6 != 86) ? 71 : 25;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i5 >= 25) {
                            }
                            throw th;
                        }
                        c = 384;
                        s2 = 375;
                        break;
                    case -34:
                        i4 = 58;
                    case -33:
                        i4 = 107;
                        c = 384;
                        s2 = 375;
                    case -32:
                        getexternalcachedirs.DigitizedCardProfile(31);
                        if (getexternalcachedirs.AlternateContactlessPaymentDataJson == 0) {
                            i4 = 106;
                            c = 384;
                            s2 = 375;
                        }
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                    case -31:
                        i4 = 109;
                        c = 384;
                        s2 = 375;
                    case -30:
                        i4 = 111;
                        c = 384;
                        s2 = 375;
                    case -29:
                        getexternalcachedirs.DigitizedCardProfile(31);
                        if (getexternalcachedirs.AlternateContactlessPaymentDataJson == 0) {
                            i4 = 70;
                            c = 384;
                            s2 = 375;
                        }
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                    case -28:
                        getexternalcachedirs.valueOf = 1;
                        getexternalcachedirs.DigitizedCardProfile(3);
                        getexternalcachedirs.DigitizedCardProfile(11);
                        values = getexternalcachedirs.AlternateContactlessPaymentDataJson;
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                    case -27:
                        getexternalcachedirs.valueOf = IccPrivateKeyCrtComponentsJson;
                        getexternalcachedirs.DigitizedCardProfile(5);
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                    case -26:
                        i4 = 62;
                        c = 384;
                        s2 = 375;
                    case -25:
                        i4 = 1;
                    case -24:
                        return;
                    case -23:
                        byte b5 = $$a[34];
                        byte b6 = (byte) (b5 - 1);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        c(b6, (byte) (b6 | 32), b5, objArr14);
                        obj = (java.lang.String) objArr14[0];
                        getexternalcachedirs.RecordsJson = obj;
                        getexternalcachedirs.DigitizedCardProfile(1);
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                    case -22:
                        try {
                            getexternalcachedirs.valueOf = 1;
                            getexternalcachedirs.DigitizedCardProfile(3);
                            try {
                                getexternalcachedirs.DigitizedCardProfile(4);
                                obj = java.lang.Class.forName((java.lang.String) getexternalcachedirs.getProfileVersion);
                                getexternalcachedirs.RecordsJson = obj;
                                getexternalcachedirs.DigitizedCardProfile(1);
                                i4 = i5;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                i = 15;
                                if ((i5 >= 25 || i5 > 44) && ((i5 < 44 || i5 > 54) && ((i5 < 71 || i5 > 87) && (i5 < 87 || i5 > 97)))) {
                                    throw th;
                                }
                                getexternalcachedirs.RecordsJson = th;
                                getexternalcachedirs.DigitizedCardProfile(38);
                                i4 = i;
                                c = 384;
                                s2 = 375;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            i = 15;
                            if (i5 >= 25) {
                            }
                            throw th;
                        }
                        c = 384;
                        s2 = 375;
                    case -21:
                        try {
                            byte[] bArr3 = $$a;
                            byte b7 = bArr3[34];
                            byte b8 = bArr3[23];
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c(b7, b8, (byte) (b8 + 1), objArr15);
                            invoke = (java.lang.String) objArr15[0];
                            getexternalcachedirs.RecordsJson = invoke;
                            getexternalcachedirs.DigitizedCardProfile(1);
                            i4 = i5;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            i = 15;
                            if (i5 >= 25) {
                            }
                            throw th;
                        }
                        c = 384;
                        s2 = 375;
                        break;
                    case -20:
                        try {
                            getexternalcachedirs.valueOf = 3;
                            getexternalcachedirs.DigitizedCardProfile(3);
                            getexternalcachedirs.DigitizedCardProfile(4);
                            java.lang.Object obj3 = getexternalcachedirs.getProfileVersion;
                            getexternalcachedirs.DigitizedCardProfile(4);
                            java.lang.Object obj4 = getexternalcachedirs.getProfileVersion;
                            getexternalcachedirs.DigitizedCardProfile(4);
                            try {
                                java.lang.Object[] objArr16 = {obj4, getexternalcachedirs.getProfileVersion};
                                byte[] bArr4 = RecordsJson;
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                a(bArr4[c], (short) 554, bArr4[420], objArr17);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                a((byte) (bArr4[c] - 1), (short) 577, bArr4[7], objArr18);
                                java.lang.String str4 = (java.lang.String) objArr18[0];
                                java.lang.Class<?>[] clsArr = new java.lang.Class[2];
                                byte b9 = bArr4[c];
                                try {
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    a(b9, (short) 539, bArr4[494], objArr19);
                                    clsArr[0] = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                    short s4 = bArr4[438];
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    a((byte) 47, (short) 582, s4, objArr20);
                                    clsArr[1] = java.lang.Class.forName((java.lang.String) objArr20[0]);
                                    invoke = cls4.getMethod(str4, clsArr).invoke(obj3, objArr16);
                                    getexternalcachedirs.RecordsJson = invoke;
                                    getexternalcachedirs.DigitizedCardProfile(1);
                                    i4 = i5;
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            i = 15;
                            if (i5 >= 25) {
                            }
                            throw th;
                        }
                        c = 384;
                        s2 = 375;
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        getexternalcachedirs.valueOf = 3;
                        getexternalcachedirs.DigitizedCardProfile(3);
                        getexternalcachedirs.DigitizedCardProfile(4);
                        java.lang.Class cls5 = (java.lang.Class) getexternalcachedirs.getProfileVersion;
                        getexternalcachedirs.DigitizedCardProfile(4);
                        java.lang.String str5 = (java.lang.String) getexternalcachedirs.getProfileVersion;
                        getexternalcachedirs.DigitizedCardProfile(4);
                        method = cls5.getMethod(str5, (java.lang.Class[]) getexternalcachedirs.getProfileVersion);
                        getexternalcachedirs.RecordsJson = method;
                        getexternalcachedirs.DigitizedCardProfile(1);
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        byte[] bArr5 = RecordsJson;
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a(bArr5[c], s2, bArr5[494], objArr21);
                        method = java.lang.Class.forName((java.lang.String) objArr21[0]);
                        getexternalcachedirs.RecordsJson = method;
                        getexternalcachedirs.DigitizedCardProfile(1);
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                    case -17:
                        getexternalcachedirs.valueOf = 1;
                        getexternalcachedirs.DigitizedCardProfile(3);
                        getexternalcachedirs.DigitizedCardProfile(11);
                        getexternalcachedirs.RecordsJson = new java.lang.Class[getexternalcachedirs.AlternateContactlessPaymentDataJson];
                        getexternalcachedirs.DigitizedCardProfile(1);
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                    case -16:
                        method = "AlternateContactlessPaymentDataJson";
                        getexternalcachedirs.RecordsJson = method;
                        getexternalcachedirs.DigitizedCardProfile(1);
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                    case -15:
                        method = com.payair.hce.setLongClickable.class;
                        getexternalcachedirs.RecordsJson = method;
                        getexternalcachedirs.DigitizedCardProfile(1);
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                    case -14:
                        try {
                            getexternalcachedirs.valueOf = 1;
                            getexternalcachedirs.DigitizedCardProfile(3);
                            getexternalcachedirs.DigitizedCardProfile(11);
                            int i7 = getexternalcachedirs.AlternateContactlessPaymentDataJson;
                            byte[] bArr6 = RecordsJson;
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            a(bArr6[c], (short) 539, bArr6[494], objArr22);
                            method = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr22[0]), i7);
                            getexternalcachedirs.RecordsJson = method;
                            getexternalcachedirs.DigitizedCardProfile(1);
                            i4 = i5;
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                            i = i2;
                            if (i5 >= 25) {
                            }
                            throw th;
                        }
                        c = 384;
                        s2 = 375;
                        break;
                    case -13:
                        i2 = 15;
                        getexternalcachedirs.DigitizedCardProfile(15);
                        throw ((java.lang.Throwable) getexternalcachedirs.getProfileVersion);
                        break;
                    case -12:
                        i4 = 23;
                    case -11:
                        i4 = 21;
                    case -10:
                        getexternalcachedirs.DigitizedCardProfile(14);
                        if (getexternalcachedirs.AlternateContactlessPaymentDataJson == 0) {
                            i4 = 20;
                        } else {
                            i4 = i5;
                            c = 384;
                            s2 = 375;
                        }
                    case -9:
                        try {
                            getexternalcachedirs.valueOf = 1;
                            getexternalcachedirs.DigitizedCardProfile(3);
                            getexternalcachedirs.DigitizedCardProfile(4);
                            obj2 = getexternalcachedirs.getProfileVersion;
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                            i = 15;
                            if (i5 >= 25) {
                            }
                            throw th;
                        }
                        try {
                            byte[] bArr7 = RecordsJson;
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(bArr7[c], (short) 514, bArr7[438], objArr23);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a((byte) 59, (short) 532, bArr7[15], objArr24);
                            try {
                                invoke2 = cls6.getMethod((java.lang.String) objArr24[0], null).invoke(obj2, null);
                                getexternalcachedirs.RecordsJson = invoke2;
                                getexternalcachedirs.DigitizedCardProfile(1);
                                i4 = i5;
                                c = 384;
                                s2 = 375;
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                                java.lang.Throwable cause2 = th.getCause();
                                if (cause2 == null) {
                                    throw th;
                                }
                                throw cause2;
                            }
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                        }
                        break;
                    case -8:
                        i4 = 97;
                    case -7:
                        getexternalcachedirs.valueOf = 1;
                        getexternalcachedirs.DigitizedCardProfile(3);
                        getexternalcachedirs.DigitizedCardProfile(4);
                        java.lang.Object obj5 = getexternalcachedirs.getProfileVersion;
                        try {
                            byte[] bArr8 = RecordsJson;
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            a(bArr8[c], s2, bArr8[494], objArr25);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                            byte b10 = (byte) (bArr8[c] - 1);
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(b10, (short) (b10 | com.visa.cbp.getEncExpo.startTransaction), bArr8[7], objArr26);
                            invoke2 = cls7.getMethod((java.lang.String) objArr26[0], null).invoke(obj5, null);
                            getexternalcachedirs.RecordsJson = invoke2;
                            getexternalcachedirs.DigitizedCardProfile(1);
                            i4 = i5;
                            c = 384;
                            s2 = 375;
                        } catch (java.lang.Throwable th13) {
                            java.lang.Throwable cause3 = th13.getCause();
                            if (cause3 == null) {
                                throw th13;
                            }
                            throw cause3;
                        }
                    case -6:
                        getexternalcachedirs.valueOf = 3;
                        getexternalcachedirs.DigitizedCardProfile(3);
                        getexternalcachedirs.DigitizedCardProfile(4);
                        java.lang.String str6 = (java.lang.String) getexternalcachedirs.getProfileVersion;
                        getexternalcachedirs.DigitizedCardProfile(11);
                        int i8 = getexternalcachedirs.AlternateContactlessPaymentDataJson;
                        getexternalcachedirs.DigitizedCardProfile(11);
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        b(str6, i8, (byte) getexternalcachedirs.AlternateContactlessPaymentDataJson, objArr27);
                        invoke2 = (java.lang.String) objArr27[0];
                        getexternalcachedirs.RecordsJson = invoke2;
                        getexternalcachedirs.DigitizedCardProfile(1);
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                    case -5:
                        try {
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            a(org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, (short) 459, (short) (RecordsJson[540] - 1), objArr28);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            a((byte) 59, (short) 488, r0[381], objArr29);
                            getexternalcachedirs.DigitizedCardProfile = ((java.lang.Long) cls8.getMethod((java.lang.String) objArr29[0], null).invoke(null, null)).longValue();
                            getexternalcachedirs.DigitizedCardProfile(8);
                            i4 = i5;
                            c = 384;
                            s2 = 375;
                        } catch (java.lang.Throwable th14) {
                            java.lang.Throwable cause4 = th14.getCause();
                            if (cause4 == null) {
                                throw th14;
                            }
                            throw cause4;
                        }
                    case -4:
                        getexternalcachedirs.valueOf = 1;
                        getexternalcachedirs.DigitizedCardProfile(3);
                        getexternalcachedirs.DigitizedCardProfile(4);
                        try {
                            java.lang.Object[] objArr30 = {getexternalcachedirs.getProfileVersion};
                            short s5 = (short) (getAid | 256);
                            byte[] bArr9 = RecordsJson;
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            a(org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, s5, bArr9[420], objArr31);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr31[0]);
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            a(org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, (short) 446, bArr9[24], objArr32);
                            java.lang.String str7 = (java.lang.String) objArr32[0];
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            a(bArr9[c], s2, bArr9[494], objArr33);
                            getexternalcachedirs.valueOf = ((java.lang.Integer) cls9.getMethod(str7, java.lang.Class.forName((java.lang.String) objArr33[0])).invoke(null, objArr30)).intValue();
                            getexternalcachedirs.DigitizedCardProfile(5);
                            i4 = i5;
                            c = 384;
                            s2 = 375;
                        } catch (java.lang.Throwable th15) {
                            java.lang.Throwable cause5 = th15.getCause();
                            if (cause5 == null) {
                                throw th15;
                            }
                            throw cause5;
                        }
                    case -3:
                        invoke2 = "";
                        getexternalcachedirs.RecordsJson = invoke2;
                        getexternalcachedirs.DigitizedCardProfile(1);
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                    case -2:
                        invoke2 = "\u0001\u0000㘄";
                        getexternalcachedirs.RecordsJson = invoke2;
                        getexternalcachedirs.DigitizedCardProfile(1);
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                    case -1:
                        i4 = 54;
                    default:
                        i4 = i5;
                        c = 384;
                        s2 = 375;
                }
            }
        } catch (java.lang.Throwable th16) {
            java.lang.Throwable cause6 = th16.getCause();
            if (cause6 == null) {
                throw th16;
            }
            throw cause6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = b + 44;
        int i4 = s + 4;
        int i5 = s2 + 1;
        byte[] bArr = RecordsJson;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i3 += i4;
            i4 = i6;
            i = i7;
            int i8 = i4 + 1;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i8];
            i4 = i3;
            i3 = b2;
            i7 = i2;
            i6 = i8;
            i3 += i4;
            i4 = i6;
            i = i7;
            int i82 = i4 + 1;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            int i822 = i4 + 1;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
            }
        }
    }

    static void IccPrivateKeyCrtComponentsJson() {
        byte[] bArr = new byte[605];
        java.lang.System.arraycopy("{s\u008aV\u0004û\u0001\u0005ú\u0006ú\u0001\u0006ù\u0001\u0007ø\nö\u000bõ\u0001\b÷\ró\u0005ÿü\nö\u0005\u0001ú\u0001\tö\u0001\nõ\u0001\u000bô\u0005\u0002ù\u0001\fó\u0005\u0002ù\u0001\u0004ÿü\u0001\u0004\u0000û\u0001\u0004\u0001ú\u0005\u0005ö\u0001\u0004\u0002ù\u0005\u0006õ\u0001\u0004\u0002ù\u0005\u0007ô\u0001\u0004\u0003ø\u0005\bó\u0006þü\u0006ÿû\u0006\u0000ú\u0001\u0004\u0004÷\u0001\u0004\u0005ö\u0005\u0007ô\u0001\u0004\u0006õ\u0005\u0002ù\u0006ÿû\u0001\u0004\u0007ô\u0006\u0001ù\u0001\u0004\bó\u0006\u0002ø\u0006þü\u0001\u0005þü\u0005\u0006õ\u0001\u0005ÿû\u0001\u0005\u0000ú\u0001\u0005\u0001ù\u0006\u0003÷\u0001\u0004\bó\u0006\u0003÷\u0006\u0003÷\u0001\u0005þü\u0005\u0006õ\u0001\u0005\u0002ø\u0006\u0004ö\u0006\u0005õ\u0005\u0006õ\u0001\u0005\u0003÷\u0006ú\u0006\u0006ô\u0005\u0006õ\u0001\u0005\u0004ö\u0001\u0005\u0005õ\u0006\u0007ó\u0007ýü\u0006\u0005õ\u0001\u0005\u0006ô\u0006\u0006ô\u0001\u0005\u0007ó\u0001\u0006ýü\u0001\u0006þû\u0005\u0007ô\u0001\u0004\u0003ø\u0007ÿú\u0006\u0000ú\u0001\u0004\u0004÷\u0001\u0004\u0005ö\u0006ÿû\u0001\u0004\u0006õ\u0007\u0000ù\u0001\u0004\u0007ô\u0006\u0001ù\u0001\u0004\bó\u0006þü\u0007\u0001ø\u0001\u0005þü\u0005\u0006õ\u0001\u0005ÿû\u0001\u0005\u0000ú\u0001\u0005\u0001ù\u0006\u0003÷\u0001\u0004\bó\u0006\u0003÷\u0006\u0003÷\u0001\u0005þü\u0005\u0006õ\u0001\u0005\u0002ø\u0001\u0005\u0005õ\u0007\u0002÷\u0007ýü\u0006\u0005õ\u0001\u0005\u0006ô\u0006ú\u0006\u0005õ\u0001\u0006ÿú\u0001\u0006\u0000ù\u0001\u0006\u0001ø\u0001\u0006\u0001ø\u0001\u0006\u0002÷\u000bõ\u0001\u0006\u0003ö\u0007\u0004õ\u0001\u0006\u0003÷\u0015ëÍ>õ\rùÇ%!þ÷\u0005ùýüý\u000b÷\u0015ëÍ>õ\rùÇ\u001b%\u0006ñ\u0002þ\rë\u000b\tðê\u0017\u0005\u0006â\u000b\u000b\tð\rö\u000eýúûÊHóü\u0012·\u001f\"\u0005õ\u0006ÿ×1ï\t\u0006\u0017ñ\nÓ,ýþæ!þ÷\u0005ù\rö\u000eýúûÊHóü\u0012·(\u0013ü\u0012Ì,ÿø\u0003þ\u000eýï\u0013õ\u0006ÿþ\u000fæ\u0015\u0000þÖ,ÿ\u0006þýý\u0007á\u0015\u0004ø\n\u0006ÿ\u0005\u0006ñ\rü÷\u0015ëÍ>õ\rùÇ&\u0014\ný\bê\u0001\nùþ\u000fÏ\u001e\u0014þò÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011÷\u0015ëÍ>õ\rùÇDó\u0001\u0006ùþ\u0011º\u001f\u0018\u000fô\u0007õ\u0005\bùüúñ\u001e÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011Ç".getBytes("ISO-8859-1"), 0, bArr, 0, 605);
        RecordsJson = bArr;
        getAid = 167;
    }

    static void init$1() {
        $$d = new byte[]{0, Byte.MIN_VALUE, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE};
        $$e = 87;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        IccPrivateKeyCrtComponentsJson();
        values = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        DigitizedCardProfile = new char[]{12413, 12411, 12414, 12415};
        AlternateContactlessPaymentDataJson = (char) 1490;
    }

    static void init$0() {
        $$a = new byte[]{88, -59, 41, 44, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, 69, -14, com.google.common.base.Ascii.SI, com.visa.cbp.getEncExpo.kernelVersion, 44, -1, 6, -15, 19, -4, com.visa.cbp.getEncExpo.kernelVersion, 41, -3, -6, 8, -10, 1, 10, -7, -21, com.google.common.base.Ascii.VT, 9, com.visa.cbp.getEncExpo.onUnminimized, -22, com.google.common.base.Ascii.ETB};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
    }
}
