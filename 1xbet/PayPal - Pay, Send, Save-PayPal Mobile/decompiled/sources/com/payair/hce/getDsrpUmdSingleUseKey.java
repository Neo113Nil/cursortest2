package com.payair.hce;

/* loaded from: classes10.dex */
public class getDsrpUmdSingleUseKey implements com.payair.hce.getTransactionCredentials {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static boolean DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static char[] getProfileVersion;
    private static int valueOf;
    private static char[] values;
    private static boolean writeReplace;
    private java.lang.String AlternateContactlessPaymentDataJson;

    private static void c(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2 = 718 - (s2 * 653);
        int i3 = (s * 34) + 4;
        int i4 = i * 34;
        byte[] bArr = $$a;
        char[] cArr = new char[35 - i4];
        int i5 = 34 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i2 = (i5 + (-i2)) - 2;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            cArr[i7] = (char) i2;
            if (i7 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i3++;
            i2 = (i2 + (-bArr[i3])) - 2;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$d;
        int i2 = 4 - (s * 3);
        int i3 = s2 * 2;
        int i4 = 118 - b;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i5;
            i = 0;
            i2++;
            i4 += -i6;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i2];
            i2++;
            i4 += -i6;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    private getDsrpUmdSingleUseKey() {
    }

    private getDsrpUmdSingleUseKey(java.lang.String str) {
        this.AlternateContactlessPaymentDataJson = str;
    }

    public static com.payair.hce.getDsrpUmdSingleUseKey writeReplace(java.lang.String str) {
        com.payair.hce.getDsrpUmdSingleUseKey getdsrpumdsingleusekey = new com.payair.hce.getDsrpUmdSingleUseKey(str);
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 19) % 128;
        return getdsrpumdsingleusekey;
    }

    @Override // com.payair.hce.getTransactionCredentials
    public final java.lang.String DigitizedCardProfile(com.payair.hce.ReplenishResponseEncrypted[] replenishResponseEncryptedArr) {
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 49) % 128;
        com.payair.hce.setContactlessUmdSingleUseKey[] setcontactlessumdsingleusekeyArr = new com.payair.hce.setContactlessUmdSingleUseKey[replenishResponseEncryptedArr.length];
        for (int i = 0; i < replenishResponseEncryptedArr.length; i++) {
            com.payair.hce.setContactlessUmdSingleUseKey setcontactlessumdsingleusekey = new com.payair.hce.setContactlessUmdSingleUseKey();
            com.payair.hce.ReplenishResponseEncrypted replenishResponseEncrypted = replenishResponseEncryptedArr[i];
            com.payair.hce.getIccKek geticckek = (com.payair.hce.getIccKek) com.payair.hce.ReplenishResponseEncrypted.writeReplace(new java.lang.Object[]{replenishResponseEncrypted}, 1219330914, -1219330912, java.lang.System.identityHashCode(replenishResponseEncrypted));
            setcontactlessumdsingleusekey.writeReplace = java.lang.Integer.parseInt(geticckek.values(), 16);
            setcontactlessumdsingleusekey.AlternateContactlessPaymentDataJson = DigitizedCardProfile(geticckek.RecordsJson());
            setcontactlessumdsingleusekey.values = DigitizedCardProfile(geticckek.DigitizedCardProfile());
            setcontactlessumdsingleusekey.RecordsJson = DigitizedCardProfile(geticckek.getProfileVersion());
            setcontactlessumdsingleusekey.getAid = DigitizedCardProfile(geticckek.writeReplace());
            setcontactlessumdsingleusekey.DigitizedCardProfile = DigitizedCardProfile(geticckek.valueOf());
            setcontactlessumdsingleusekeyArr[i] = setcontactlessumdsingleusekey;
        }
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.view.View.combineMeasuredStates(0, 0) + 127, null, null, "\u0086\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b(new int[]{0, 17, 143, 13}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", false, objArr2);
        setchilddivider.valueOf(((java.lang.String) objArr2[0]).intern());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b(new int[]{17, 24, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000", false, objArr3);
        setchilddivider.valueOf(((java.lang.String) objArr3[0]).intern());
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(setcontactlessumdsingleusekeyArr);
        int i2 = RecordsJson + 125;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            return DigitizedCardProfile2;
        }
        throw null;
    }

    private java.lang.String DigitizedCardProfile(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson + 33;
        RecordsJson = i % 128;
        try {
            if (i % 2 != 0) {
                java.lang.String values2 = com.payair.hce.getPendingAction.writeReplace().values(str, this.AlternateContactlessPaymentDataJson);
                int i2 = RecordsJson + 27;
                IccPrivateKeyCrtComponentsJson = i2 % 128;
                java.lang.String upperCase = values2.toUpperCase();
                if (i2 % 2 == 0) {
                    return upperCase;
                }
                throw new java.lang.ArithmeticException();
            }
            com.payair.hce.getPendingAction.writeReplace().values(str, this.AlternateContactlessPaymentDataJson);
            throw new java.lang.NullPointerException();
        } catch (com.payair.hce.setVersion e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            int i2 = $10 + 39;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = values;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > j ? 1 : (android.os.Process.getElapsedCpuTime() == j ? 0 : -1)) + 45, 285 - android.os.Process.getGidForName(""), (char) (android.graphics.Color.red(0) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
            cArr = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(valueOf)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (android.view.View.resolveSize(0, 0) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (DigitizedCardProfile) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 43, 1630 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((short) 0, (byte) 0, (short) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            java.lang.String str4 = new java.lang.String(cArr3);
            $10 = ($11 + 97) % 128;
            objArr[0] = str4;
            return;
        }
        if (!writeReplace) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            int i4 = $11 + 97;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[getumdgeneration.values % getumdgeneration.valueOf] >> i] * intValue);
                java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 43, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1629, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d((short) 0, (byte) 0, (short) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            } else {
                cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                java.lang.Object[] objArr8 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 1629 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    d((short) 0, (byte) 0, (short) 0, objArr9);
                    obj5 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr8);
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    private static void b(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getProfileVersion;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getScrollFriction() > f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == f ? 0 : -1)), 2806 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((short) 0, (byte) 9, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i5++;
                    f = 0.0f;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 121) % 128;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr2 != null) {
            char[] cArr4 = new char[i2];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i2) {
                int i6 = $11 + 39;
                $10 = i6 % 128;
                if (i6 % 2 == 0 ? bArr2[getaccounttype.writeReplace] != 1 : bArr2[getaccounttype.writeReplace] != 1) {
                    int i7 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.combineMeasuredStates(0, 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2880, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((short) 0, (byte) 7, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj2);
                    }
                    cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i8 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2835, (char) android.text.TextUtils.getCapsMode("", 0, 0));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        d((short) 0, com.google.common.base.Ascii.VT, (short) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 35, 212 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.os.Process.myPid() >> 22))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                $11 = ($10 + 87) % 128;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i9 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i9, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i9);
        }
        if (z) {
            $11 = ($10 + 109) % 128;
            char[] cArr6 = new char[i2];
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i2) {
                cArr6[getaccounttype.writeReplace] = cArr3[(i2 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i2) {
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        RecordsJson = 1;
        values = new char[]{11122, 11126, 11069, 11060, 11067, 11021, 11057, 11071, 11020, 11048, 11061, 11094, 11063, 11062, 11068, 11018, 11017, 11059, 11016, 11095, 11053, 11088, 11099, 11127, 11082, 11087, 11086, 11100, 11058, 11022, 11023, 11011, 11091, 11098};
        valueOf = -143185256;
        writeReplace = true;
        DigitizedCardProfile = true;
        getProfileVersion = new char[]{16828, 16702, 16697, 16676, 16677, 16693, 16588, 16691, 16693, 16691, 16677, 16681, 16688, 16691, 16692, 16591, 16590, 16895, 16807, 16800, 16831, 16804, 16812, 16805, 16830, 16806, 16802, 16829, 16810, 16815, 16806, 16789, 16786, 16802, 16829, 16800, 16802, 16800, 16786, 16790, 16801, 16883, 16884, 16831, 16800, 16791, 16886, 16799, 16831, 16807, 16802, 16831, 16800, 16807, 16774, 16775, 16808, 16802, 16830, 16805, 16807, 16809, 16804, 16824, 16800, 16894, 16812, 16809, 16808, 16810, 16808, 16791, 16793, 16809, 16809, 16810, 16808, 16805, 16802, 16808, 16802, 16812, 16717, 16584, 16578, 16588, 16694, 16588, 16585, 16584, 16586, 16584, 16697, 16693, 16580, 16580, 16885, 16735, 16764, 16761, 16756, 16763, 16764, 16756, 16724, 16726, 16761, 16728, 16710, 16751, 16741, 16766, 16737, 16739, 16737, 16750, 16746, 16765, 16765, 16767, 16766, 16764, 16762, 16759, 16763, 16737, 16726, 16615, 16614, 16638, 16639, 16617, 16618, 16617, 16619, 16613, 16892, 16805, 16829, 16826, 16804, 16809, 16804, 16806, 16784, 16782, 16771, 16800, 16769, 16799, 16831, 16807, 16802, 16831, 16800, 16807, 16774, 16775, 16808, 16802, 16830, 16805, 16807, 16809};
    }

    static void init$1() {
        $$d = new byte[]{108, -72, 46, 57};
        $$e = 54;
    }

    static void init$0() {
        $$a = new byte[]{84, 108, com.google.common.base.Ascii.CAN, -19, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = 125;
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x08ac, code lost:
    
        if (r6.capacity() == 4) goto L156;
     */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v141 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(android.content.Context context, java.lang.String[] strArr, int i, int i2, int i3) {
        java.nio.LongBuffer longBuffer;
        boolean z;
        java.lang.Object obj;
        int i4;
        java.lang.Integer num;
        int i5 = 0;
        java.lang.Integer num2 = 0;
        int i6 = 1;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[1], new int[1], new int[1]};
                ((int[]) objArr[0])[0] = i;
                ((int[]) objArr[1])[0] = i;
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~(i | 1761160191)) | (~((~i) | (-543163233)))) * (-302)) - 2119248804) + ((~(i | (-543163233))) * (-604)) + (((~(i | 1217996959)) | 1082664990) * 302))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 2713 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                    byte b = $$a[14];
                    byte b2 = (byte) (b + 1);
                    byte b3 = (byte) (-b);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(b2, b3, (byte) (b3 - 1), objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).intValue();
                return objArr;
            }
            int i7 = 16;
            if (strArr.length == 0) {
                java.lang.Object[] objArr4 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr4[0])[0] = i;
                ((int[]) objArr4[1])[0] = i ^ 4;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(1064069033 | r1)) | (-1073604608)) * (-160)) - 828874016) + (((~((~i) | (-832423128))) | 1064069033) * 160))};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2713, (char) android.graphics.Color.green(0));
                    byte b4 = $$a[14];
                    byte b5 = (byte) (b4 + 1);
                    byte b6 = (byte) (-b4);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c(b5, b6, (byte) (b6 - 1), objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                }
                ((int[]) objArr4[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).intValue();
                return objArr4;
            }
            int length = strArr.length;
            java.nio.LongBuffer[] longBufferArr = new java.nio.LongBuffer[length];
            int i8 = 0;
            while (i8 < strArr.length) {
                java.lang.String lowerCase = strArr[i8].toLowerCase();
                java.lang.Object[] objArr7 = new java.lang.Object[i6];
                b(new int[]{41, i6, 65, i5}, "\u0001", i5, objArr7);
                java.lang.String replaceAll = lowerCase.replaceAll(((java.lang.String) objArr7[i5]).intern(), "");
                long longValue = new java.math.BigInteger(replaceAll.substring(i7, 32), i7).longValue();
                java.nio.LongBuffer[] longBufferArr2 = longBufferArr;
                long longValue2 = new java.math.BigInteger(replaceAll.substring(i5, i7), i7).longValue();
                int length2 = replaceAll.length();
                if (length2 == 32) {
                    num = num2;
                    longBufferArr2[i8] = java.nio.LongBuffer.allocate(2).put(longValue2).put(longValue);
                } else {
                    if (length2 != 64) {
                        java.lang.Object[] objArr8 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr8[i5])[i5] = i;
                        ((int[]) objArr8[1])[i5] = i ^ 3;
                        int i9 = ~i;
                        java.lang.Object[] objArr9 = new java.lang.Object[3];
                        objArr9[2] = java.lang.Integer.valueOf(((((~((-1238598354) | i9)) | (~((-657893808) | i))) * 1900) - 179762816) + (((~(657893807 | i9)) | (~(1238598353 | i))) * (-950)) + (((~(i9 | 1238598353)) | (~(i | 657893807))) * 950));
                        objArr9[1] = 16;
                        objArr9[i5] = java.lang.Integer.valueOf(i3);
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(i5, i5) + 50, 2713 - android.graphics.Color.argb(i5, i5, i5, i5), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            byte b7 = $$a[14];
                            byte b8 = (byte) (b7 + 1);
                            byte b9 = (byte) (-b7);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            c(b8, b9, (byte) (b9 - 1), objArr10);
                            java.lang.String str = (java.lang.String) objArr10[i5];
                            java.lang.Class<?>[] clsArr = new java.lang.Class[3];
                            clsArr[i5] = java.lang.Integer.TYPE;
                            clsArr[1] = java.lang.Integer.TYPE;
                            clsArr[2] = java.lang.Integer.TYPE;
                            obj4 = cls3.getMethod(str, clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                        }
                        ((int[]) objArr8[2])[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr9)).intValue();
                        return objArr8;
                    }
                    num = num2;
                    longBufferArr2[i8] = java.nio.LongBuffer.allocate(4).put(longValue2).put(longValue).put(new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue()).put(new java.math.BigInteger(replaceAll.substring(48), 16).longValue());
                }
                i8++;
                longBufferArr = longBufferArr2;
                num2 = num;
                i5 = 0;
                i6 = 1;
                i7 = 16;
            }
            java.lang.Integer num3 = num2;
            java.nio.LongBuffer[] longBufferArr3 = longBufferArr;
            try {
                if (context == null) {
                    java.lang.Object[] objArr11 = {new int[1], new int[1], new int[1]};
                    ((int[]) objArr11[0])[0] = i;
                    ((int[]) objArr11[1])[0] = i;
                    int i10 = ~i;
                    try {
                        java.lang.Object[] objArr12 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf((((~((-1087638343) | i10)) | (~(1761586175 | i))) * 988) + 1893894268 + (((~(i10 | 1761586175)) | (~((-1222544328) | i)) | 134905985) * 988))};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj5 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getCapsMode("", 0, 0), 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                            byte b10 = $$a[14];
                            byte b11 = (byte) (b10 + 1);
                            byte b12 = (byte) (-b10);
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            c(b11, b12, (byte) (b12 - 1), objArr13);
                            obj5 = cls4.getMethod((java.lang.String) objArr13[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                        }
                        ((int[]) objArr11[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr12)).intValue();
                        return objArr11;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                byte[][] bArr = new byte[length][];
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    IccPrivateKeyCrtComponentsJson = (RecordsJson + 105) % 128;
                    java.nio.LongBuffer longBuffer2 = longBufferArr3[i11];
                    if (longBuffer2.capacity() == 4) {
                        RecordsJson = (IccPrivateKeyCrtComponentsJson + 11) % 128;
                        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(32);
                        java.nio.LongBuffer asLongBuffer = allocate.asLongBuffer();
                        long[] array = longBuffer2.array();
                        int length3 = array.length;
                        int i13 = 0;
                        while (true) {
                            i4 = length;
                            if (i13 >= length3) {
                                break;
                            }
                            asLongBuffer.put(array[i13]);
                            i13++;
                            length = i4;
                        }
                        bArr[i12] = allocate.array();
                        i12++;
                    } else {
                        i4 = length;
                    }
                    i11++;
                    length = i4;
                }
                int i14 = length;
                if (i12 > 0) {
                    int currentTimeMillis = ((int) java.lang.System.currentTimeMillis()) ^ 343337308;
                    try {
                        java.lang.Object[] objArr14 = {java.lang.Integer.valueOf(i ^ currentTimeMillis), bArr, java.lang.Integer.valueOf(i12)};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                        if (obj6 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-16776787) - android.graphics.Color.rgb(0, 0, 0), (char) (31610 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)));
                            byte b13 = (byte) (-$$a[14]);
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c(b13, (byte) (b13 - 1), b13, objArr15);
                            obj6 = cls5.getMethod((java.lang.String) objArr15[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, obj6);
                        }
                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr14)).longValue();
                        long j = i;
                        long j2 = (530 * longValue3) + 111331212758L + (((~(longValue3 | 210058890)) | (~((~j) | 210058890))) * 529) + (((~longValue3) | ((-1) ^ (j | 210058890))) * 529) + 723841817;
                        int i15 = ~i;
                        int i16 = ~((-1521316692) | i15);
                        int i17 = currentTimeMillis ^ ((((int) j2) & ((((((~((-1640467563) | i)) | 328768) * (-140)) - 1226635241) + ((~((-1640138795) | i)) * 70)) + (((~(203241152 | i)) | (-1843051179)) * 70))) | (((int) (j2 >> 32)) & (((((((~(1521316691 | i)) | (~((-1336424194) | i15))) | i16) * (-516)) + 521977954) + (((~(1605203795 | i)) | (~((-268779603) | i15))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)) + ((i16 | 268779602) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))));
                        if ((i2 & 1) == 1 && (i17 ^ i) == 15) {
                            java.lang.Object[] objArr16 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr16[0])[0] = i;
                            ((int[]) objArr16[1])[0] = i17;
                            try {
                                int i18 = 1895169020 | i15;
                                java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~i18) | 1323140) * (-828)) + 233970304) + (i18 * (-828))) - 1536886348)};
                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj7 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.argb(0, 0, 0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) android.view.KeyEvent.keyCodeFromString(""));
                                    byte b14 = $$a[14];
                                    byte b15 = (byte) (b14 + 1);
                                    byte b16 = (byte) (-b14);
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    c(b15, b16, (byte) (b16 - 1), objArr18);
                                    obj7 = cls6.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                }
                                ((int[]) objArr16[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr17)).intValue();
                                return objArr16;
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        }
                        int i19 = i17 ^ i;
                        if (i19 == 0) {
                            java.lang.Object[] objArr19 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr19[0])[0] = i;
                            ((int[]) objArr19[1])[0] = i17;
                            try {
                                java.lang.Object[] objArr20 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf((((~((-1081221665) | i)) * 623) - 758512286) + ((8388702 | i15) * (-623)) + (((~((-1484662562) | i)) | 1081221664 | (~(411829599 | i))) * 623))};
                                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj8 == null) {
                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 2713 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                                    byte b17 = $$a[14];
                                    byte b18 = (byte) (b17 + 1);
                                    byte b19 = (byte) (-b17);
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    c(b18, b19, (byte) (b19 - 1), objArr21);
                                    obj8 = cls7.getMethod((java.lang.String) objArr21[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                                }
                                ((int[]) objArr19[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr20)).intValue();
                                IccPrivateKeyCrtComponentsJson = (RecordsJson + 3) % 128;
                                return objArr19;
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause3 = th3.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th3;
                            }
                        }
                        if (i19 == 11) {
                            java.lang.Object[] objArr22 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr22[0])[0] = i;
                            ((int[]) objArr22[1])[0] = i17;
                            try {
                                java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-1212416121) | i)) | 545262086) * 449) - 1331547908) + (((~((-1212416121) | i15)) | 545262086) * 449))};
                                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj9 == null) {
                                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2713, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                    byte b20 = $$a[14];
                                    byte b21 = (byte) (b20 + 1);
                                    byte b22 = (byte) (-b20);
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    c(b21, b22, (byte) (b22 - 1), objArr24);
                                    obj9 = cls8.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                                }
                                ((int[]) objArr22[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr23)).intValue();
                                int i20 = RecordsJson + 67;
                                IccPrivateKeyCrtComponentsJson = i20 % 128;
                                if (i20 % 2 == 0) {
                                    return objArr22;
                                }
                                throw new java.lang.ArithmeticException();
                            } catch (java.lang.Throwable th4) {
                                java.lang.Throwable cause4 = th4.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th4;
                            }
                        }
                    } catch (java.lang.Throwable th5) {
                        java.lang.Throwable cause5 = th5.getCause();
                        if (cause5 != null) {
                            throw cause5;
                        }
                        throw th5;
                    }
                }
                int i21 = 23;
                try {
                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                    b(new int[]{42, 23, 0, 20}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001", true, objArr25);
                    java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr25[0]).intern());
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    b(new int[]{65, 17, 0, 13}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000", false, objArr26);
                    java.lang.Object invoke = cls9.getMethod(((java.lang.String) objArr26[0]).intern(), null).invoke(context, null);
                    try {
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        b(new int[]{42, 23, 0, 20}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001", true, objArr27);
                        java.lang.Class<?> cls10 = java.lang.Class.forName(((java.lang.String) objArr27[0]).intern());
                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, null, "\u0088\u008d\u0085\u008c\u0088\u0087\u0085\u008b\u0083\u0085\u008a\u0089\u0088\u0087", objArr28);
                        java.lang.Object invoke2 = cls10.getMethod(((java.lang.String) objArr28[0]).intern(), null).invoke(context, null);
                        RecordsJson = (IccPrivateKeyCrtComponentsJson + 65) % 128;
                        try {
                            java.lang.Object[] objArr29 = {invoke2, 64};
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            a(127 - android.text.TextUtils.getTrimmedLength(""), null, null, "\u0090\u0088\u0087\u0085\u008e\u0085\u0094\u0088\u0087\u0085\u008b\u0083\u0085\u008a\u0082\u008d\u0093\u0082\u0089\u008e\u0088\u0089\u008e\u0091\u0083\u0082\u008f\u0092\u0091\u0090\u008f\u008e\u0085", objArr30);
                            java.lang.Class<?> cls11 = java.lang.Class.forName(((java.lang.String) objArr30[0]).intern());
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            b(new int[]{82, 14, 160, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001", false, objArr31);
                            java.lang.Object invoke3 = cls11.getMethod(((java.lang.String) objArr31[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr29);
                            int i22 = i14;
                            int i23 = 0;
                            while (i23 < i22) {
                                int i24 = IccPrivateKeyCrtComponentsJson + 25;
                                RecordsJson = i24 % 128;
                                if (i24 % 2 == 0) {
                                    longBuffer = longBufferArr3[i23];
                                    z = longBuffer.capacity() == 5;
                                } else {
                                    longBuffer = longBufferArr3[i23];
                                }
                                if (z) {
                                    int i25 = RecordsJson + 115;
                                    IccPrivateKeyCrtComponentsJson = i25 % 128;
                                    if (i25 % 2 != 0) {
                                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                                        a(90 % (android.os.Process.getElapsedCpuTime() > 1L ? 1 : (android.os.Process.getElapsedCpuTime() == 1L ? 0 : -1)), null, null, "\u009b\u009a\u0099\u0098\u0097\u0096\u0095", objArr32);
                                        obj = objArr32[0];
                                    } else {
                                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                                        a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, null, null, "\u009b\u009a\u0099\u0098\u0097\u0096\u0095", objArr33);
                                        obj = objArr33[0];
                                    }
                                } else {
                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                    a(android.view.MotionEvent.axisFromString("") + 128, null, null, "\u009a\u009c\u0094", objArr34);
                                    obj = objArr34[0];
                                }
                                java.lang.String intern = ((java.lang.String) obj).intern();
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                b(new int[]{96, 30, 73, i21}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001", false, objArr35);
                                java.lang.Class<?> cls12 = java.lang.Class.forName(((java.lang.String) objArr35[0]).intern());
                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                b(new int[]{126, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", true, objArr36);
                                java.lang.Object[] objArr37 = (java.lang.Object[]) cls12.getField(((java.lang.String) objArr36[0]).intern()).get(invoke3);
                                int length4 = objArr37.length;
                                int i26 = 0;
                                while (i26 < length4) {
                                    java.lang.Object obj10 = objArr37[i26];
                                    try {
                                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                                        java.lang.Object[] objArr39 = objArr37;
                                        a(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), null, null, "\u0089\u0086\u0088\u0087\u0092\u009c\u0088\u0087\u0085\u0086\u0086\u0088\u0094\u0082 \u0089\u0092\u0090\u009f\u0083\u0088\u0086\u0082\u0085\u009e\u0085\u009d", objArr38);
                                        java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr38[0]).intern());
                                        java.lang.Object[] objArr40 = new java.lang.Object[1];
                                        int i27 = i22;
                                        a((android.os.Process.myPid() >> 22) + 127, null, null, "\u0088\u0083\u008e\u0085\u0089\u0086\u008e¡\u0089\u0088\u0087", objArr40);
                                        java.lang.Object invoke4 = cls13.getMethod(((java.lang.String) objArr40[0]).intern(), java.lang.String.class).invoke(null, intern);
                                        IccPrivateKeyCrtComponentsJson = (RecordsJson + 3) % 128;
                                        try {
                                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                                            b(new int[]{136, 28, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, objArr41);
                                            java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr41[0]).intern());
                                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                                            a(128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, null, " \u0085\u0090\u0090\u0097\u0088\u0089 ¢\u0091\u0089", objArr42);
                                            java.lang.Object invoke5 = cls14.getMethod(((java.lang.String) objArr42[0]).intern(), null).invoke(obj10, null);
                                            RecordsJson = (IccPrivateKeyCrtComponentsJson + 81) % 128;
                                            try {
                                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                a(android.view.KeyEvent.keyCodeFromString("") + 127, null, null, "\u0089\u0086\u0088\u0087\u0092\u009c\u0088\u0087\u0085\u0086\u0086\u0088\u0094\u0082 \u0089\u0092\u0090\u009f\u0083\u0088\u0086\u0082\u0085\u009e\u0085\u009d", objArr43);
                                                java.lang.Class<?> cls15 = java.lang.Class.forName(((java.lang.String) objArr43[0]).intern());
                                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                a(127 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), null, null, "\u0089\u0086\u0088\u0087\u0092\u008f", objArr44);
                                                if (java.nio.ByteBuffer.wrap((byte[]) cls15.getMethod(((java.lang.String) objArr44[0]).intern(), byte[].class).invoke(invoke4, invoke5)).asLongBuffer().equals(longBuffer.rewind())) {
                                                    java.lang.Object[] objArr45 = {new int[1], new int[1], new int[1]};
                                                    ((int[]) objArr45[0])[0] = i;
                                                    ((int[]) objArr45[1])[0] = i;
                                                    int i28 = ~i;
                                                    try {
                                                        java.lang.Object[] objArr46 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf((((1476531790 | r4) * 764) - 659077080) + (((~(i28 | 1476531790)) | android.R.drawable.ic_lock_power_off) * (-1528)) + ((1091174524 | (~(419960370 | i28))) * 764))};
                                                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj11 == null) {
                                                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), android.text.TextUtils.indexOf("", "", 0, 0) + 2713, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                            byte b23 = $$a[14];
                                                            byte b24 = (byte) (b23 + 1);
                                                            byte b25 = (byte) (-b23);
                                                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                                                            c(b24, b25, (byte) (b25 - 1), objArr47);
                                                            obj11 = cls16.getMethod((java.lang.String) objArr47[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
                                                        }
                                                        ((int[]) objArr45[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr46)).intValue();
                                                        return objArr45;
                                                    } catch (java.lang.Throwable th6) {
                                                        java.lang.Throwable cause6 = th6.getCause();
                                                        if (cause6 != null) {
                                                            throw cause6;
                                                        }
                                                        throw th6;
                                                    }
                                                }
                                                i26++;
                                                i22 = i27;
                                                objArr37 = objArr39;
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
                                }
                                i23++;
                                i21 = 23;
                            }
                            java.lang.Object[] objArr48 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr48[0])[0] = i;
                            ((int[]) objArr48[1])[0] = i ^ 1;
                            int i29 = ~i;
                            try {
                                java.lang.Object[] objArr49 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-1479789014) | i29)) | (~((-416703148) | i))) * 1900) - 179762816) + (((~(416703147 | i29)) | (~(1479789013 | i))) * (-950)) + (((~(i29 | 1479789013)) | (~(416703147 | i))) * 950))};
                                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj12 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('b' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2712 - android.view.MotionEvent.axisFromString(""), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                    byte b26 = $$a[14];
                                    byte b27 = (byte) (b26 + 1);
                                    byte b28 = (byte) (-b26);
                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                    c(b27, b28, (byte) (b28 - 1), objArr50);
                                    obj12 = cls17.getMethod((java.lang.String) objArr50[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                                }
                                ((int[]) objArr48[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr49)).intValue();
                                return objArr48;
                            } catch (java.lang.Throwable th10) {
                                java.lang.Throwable cause10 = th10.getCause();
                                if (cause10 != null) {
                                    throw cause10;
                                }
                                throw th10;
                            }
                        } catch (java.lang.Throwable th11) {
                            java.lang.Throwable cause11 = th11.getCause();
                            if (cause11 != null) {
                                throw cause11;
                            }
                            throw th11;
                        }
                    } catch (java.lang.Throwable th12) {
                        java.lang.Throwable cause12 = th12.getCause();
                        if (cause12 != null) {
                            throw cause12;
                        }
                        throw th12;
                    }
                } catch (java.lang.Throwable th13) {
                    java.lang.Throwable cause13 = th13.getCause();
                    if (cause13 != null) {
                        throw cause13;
                    }
                    throw th13;
                }
            } catch (java.lang.Throwable unused) {
                java.lang.Object[] objArr51 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr51[0])[0] = i;
                ((int[]) objArr51[1])[0] = i ^ 2;
                int i30 = ~i;
                java.lang.Object[] objArr52 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(1273430933 | i30)) | (-1877421056) | (~((-19071106) | i))) * 717) + 1115490897 + (((~(i30 | (-19071106))) | (-1877421056) | (~(i | 1273430933))) * 717))};
                java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj13 == null) {
                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2713, (char) android.text.TextUtils.getTrimmedLength(""));
                    byte b29 = $$a[14];
                    byte b30 = (byte) (b29 + 1);
                    byte b31 = (byte) (-b29);
                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                    c(b30, b31, (byte) (b31 - 1), objArr53);
                    obj13 = cls18.getMethod((java.lang.String) objArr53[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj13);
                }
                ((int[]) objArr51[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr52)).intValue();
                return objArr51;
            }
        } catch (java.lang.Throwable th14) {
            java.lang.Throwable cause14 = th14.getCause();
            if (cause14 != null) {
                throw cause14;
            }
            throw th14;
        }
    }
}
