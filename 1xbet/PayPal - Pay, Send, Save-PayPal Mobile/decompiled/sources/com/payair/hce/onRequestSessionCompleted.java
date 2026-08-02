package com.payair.hce;

/* loaded from: classes4.dex */
public enum onRequestSessionCompleted {
    ;

    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static char[] values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = s + 66;
        int i4 = i + 4;
        byte[] bArr = $$a;
        int i5 = b * 4;
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i3 += i4;
            i4 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            int i8 = i4 + 1;
            if (i2 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i2 + 1;
            i6 = i8;
            i4 = bArr[i8];
            i7 = i9;
            i3 += i4;
            i4 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            int i82 = i4 + 1;
            if (i2 == 0 - i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i822 = i4 + 1;
            if (i2 == 0 - i5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        DigitizedCardProfile = 1;
        AlternateContactlessPaymentDataJson();
        int i = DigitizedCardProfile + 113;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static com.payair.hce.onRequestSessionCompleted valueOf(java.lang.String str) {
        DigitizedCardProfile = (writeReplace + 97) % 128;
        com.payair.hce.onRequestSessionCompleted onrequestsessioncompleted = (com.payair.hce.onRequestSessionCompleted) java.lang.Enum.valueOf(com.payair.hce.onRequestSessionCompleted.class, str);
        int i = DigitizedCardProfile + 109;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            return onrequestsessioncompleted;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.payair.hce.onRequestSessionCompleted[] valuesCustom() {
        int i = DigitizedCardProfile + 23;
        writeReplace = i % 128;
        com.payair.hce.onRequestSessionCompleted[] valuesCustom = values();
        if (i % 2 == 0) {
            return (com.payair.hce.onRequestSessionCompleted[]) valuesCustom.clone();
        }
        throw null;
    }

    public static boolean AlternateContactlessPaymentDataJson(byte b, int i) {
        int i2 = DigitizedCardProfile + 71;
        int i3 = i2 % 128;
        writeReplace = i3;
        if (i2 % 2 == 0 ? (b & (1 << i)) != 0 : (b & (0 - i)) != 0) {
            return true;
        }
        int i4 = i3 + 5;
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        int[] iArr2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AlternateContactlessPaymentDataJson;
        int i3 = 1;
        int i4 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            $11 = ($10 + 7) % 128;
            for (int i5 = 0; i5 < length; i5++) {
                $11 = ($10 + 35) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr3[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 27, 29 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("z", java.lang.Integer.TYPE);
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
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = AlternateContactlessPaymentDataJson;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                java.lang.Object[] objArr3 = new java.lang.Object[i3];
                objArr3[i4] = java.lang.Integer.valueOf(iArr6[i6]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 26, 29 - android.view.View.MeasureSpec.getSize(i4), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i6++;
                iArr6 = iArr2;
                i3 = 1;
                i4 = 0;
            }
            i2 = i4;
            iArr6 = iArr7;
        } else {
            i2 = 0;
        }
        java.lang.System.arraycopy(iArr6, i2, iArr5, i2, length2);
        istransitsupported.valueOf = i2;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[i2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            $10 = ($11 + 71) % 128;
            int i7 = 0;
            while (i7 < 16) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i7];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.text.TextUtils.getOffsetAfter("", 0), android.widget.ExpandableListView.getPackedPositionChild(0L) + 5089, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i7++;
                int i8 = $11 + 7;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 / 5;
                }
            }
            int i10 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i10;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i11 = istransitsupported.DigitizedCardProfile;
            int i12 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 49, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2924, (char) (android.view.View.combineMeasuredStates(0, 0) + 3037));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                c((short) 0, (byte) 0, -1, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public static long AlternateContactlessPaymentDataJson(byte[] bArr) throws com.payair.hce.postToastMessageOnUi {
        int i = (DigitizedCardProfile + 79) % 128;
        writeReplace = i;
        if (bArr == null || bArr.length <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{1839837784, 1218050891, -844937397, 648412102, 1905994523, 1589001003, -158640796, -616083105, 2130558691, 270485014}, 18 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr[0]).intern());
        }
        if (bArr.length < 5) {
            if (bArr.length == 4) {
                return ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            }
            if (bArr.length == 3) {
                byte b = bArr[0];
                return (bArr[2] & 255) | ((b & 255) << 16) | ((bArr[1] & 255) << 8);
            }
            if (bArr.length == 2) {
                return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
            }
            return bArr[0] & 255;
        }
        DigitizedCardProfile = (i + 107) % 128;
        return ((bArr[1] & 255) << 24) | ((bArr[0] & 255) << 32) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
    }

    public static int values(byte[] bArr) {
        int i = DigitizedCardProfile;
        writeReplace = (i + 35) % 128;
        byte b = bArr[0];
        byte b2 = bArr[1];
        writeReplace = (i + 25) % 128;
        return ((b2 & 255) | (b << 8)) & 65535;
    }

    private static void b(int[] iArr, boolean z, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            $11 = ($10 + 69) % 128;
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        char c = 0;
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = values;
        if (cArr2 != null) {
            $10 = ($11 + 53) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                $11 = ($10 + 27) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                    objArr2[c] = java.lang.Integer.valueOf(cArr2[i7]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 29, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2807, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[i3];
                        cArr = cArr2;
                        c((short) 43, (byte) 0, -1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr = cArr2;
                    }
                    cArr3[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    cArr2 = cArr;
                    c = 0;
                    i3 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        java.lang.System.arraycopy(cArr2, i2, cArr4, 0, i4);
        if (bArr2 != null) {
            char[] cArr5 = new char[i4];
            getaccounttype.writeReplace = 0;
            char c2 = 0;
            while (getaccounttype.writeReplace < i4) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    $10 = ($11 + 61) % 128;
                    int i8 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 44, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2835, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c($$a[0], (byte) 0, -1, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr5[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 43, 2880 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        c((byte) ($$b - 5), (byte) 0, -1, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr5[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 34, android.graphics.Color.argb(0, 0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i10 = i4 - i6;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i10, i6);
            java.lang.System.arraycopy(cArr6, i6, cArr4, 0, i10);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i4];
            getaccounttype.writeReplace = i;
            $11 = ($10 + 119) % 128;
            while (getaccounttype.writeReplace < i4) {
                cArr7[getaccounttype.writeReplace] = cArr4[(i4 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            cArr4 = cArr7;
        }
        if (i5 > 0) {
            int i11 = 0;
            while (true) {
                getaccounttype.writeReplace = i11;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                $11 = ($10 + 15) % 128;
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i11 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    public static com.payair.hce.transactionCanBeResumed values(long j) throws com.payair.hce.generateExpiryDate {
        if (j < 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(new int[]{0, 35, 0, 0}, true, "\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000", objArr);
            throw new com.payair.hce.generateExpiryDate(((java.lang.String) objArr[0]).intern());
        }
        if (j <= 127) {
            int i = writeReplace + 99;
            DigitizedCardProfile = i % 128;
            byte b = (byte) j;
            if (i % 2 != 0) {
                return com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(b);
            }
            com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(b);
            throw new java.lang.ArithmeticException();
        }
        if (j <= 255) {
            com.payair.hce.transactionCanBeResumed writeReplace2 = com.payair.hce.transactionCanBeResumed.writeReplace(2);
            writeReplace2.DigitizedCardProfile(0, (byte) -127);
            writeReplace2.DigitizedCardProfile(1, (byte) (j & 255));
            return writeReplace2;
        }
        if (j <= okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            DigitizedCardProfile = (writeReplace + 113) % 128;
            com.payair.hce.transactionCanBeResumed writeReplace3 = com.payair.hce.transactionCanBeResumed.writeReplace(3);
            writeReplace3.DigitizedCardProfile(0, (byte) -126);
            writeReplace3.DigitizedCardProfile(1, (byte) ((65280 & j) >> 8));
            writeReplace3.DigitizedCardProfile(2, (byte) (j & 255));
            return writeReplace3;
        }
        if (j <= com.datadog.android.sessionreplay.utils.ColorConstantsKt.MASK_RGB) {
            writeReplace = (DigitizedCardProfile + 63) % 128;
            com.payair.hce.transactionCanBeResumed writeReplace4 = com.payair.hce.transactionCanBeResumed.writeReplace(4);
            writeReplace4.DigitizedCardProfile(0, (byte) -125);
            writeReplace4.DigitizedCardProfile(1, (byte) ((16711680 & j) >> 16));
            writeReplace4.DigitizedCardProfile(2, (byte) ((j & 65280) >> 8));
            writeReplace4.DigitizedCardProfile(3, (byte) (j & 255));
            return writeReplace4;
        }
        if (j > 4294967295L) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{1491643595, 1840830912, 152427562, -57041740, -1931812529, -1755797075, 265501256, 1143315919, 1615726193, -1830379907, 135019526, 954770110, 1838032866, -2126903177, 550511908, -1312480267, -480816490, 536619754, 1103639604, -322018602, 869719906, -1231549347, -1494378687, 43545283}, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 47, objArr2);
            throw new com.payair.hce.generateExpiryDate(((java.lang.String) objArr2[0]).intern());
        }
        com.payair.hce.transactionCanBeResumed writeReplace5 = com.payair.hce.transactionCanBeResumed.writeReplace(5);
        writeReplace5.DigitizedCardProfile(0, (byte) -124);
        writeReplace5.DigitizedCardProfile(1, (byte) (((-16777216) & j) >> 24));
        writeReplace5.DigitizedCardProfile(2, (byte) ((j & 16711680) >> 16));
        writeReplace5.DigitizedCardProfile(3, (byte) ((j & 65280) >> 8));
        writeReplace5.DigitizedCardProfile(4, (byte) (j & 255));
        return writeReplace5;
    }

    public static long DigitizedCardProfile(byte[] bArr, int i) throws com.payair.hce.postToastMessageOnUi {
        if (bArr == null || bArr.length <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{1839837784, 1218050891, -844937397, 648412102, 1905994523, 1589001003, -158640796, -616083105, 2130558691, 270485014}, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 19, objArr);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr[0]).intern());
        }
        if (i >= bArr.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b(new int[]{35, 26, 0, 0}, false, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", objArr2);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr2[0]).intern());
        }
        byte b = bArr[i];
        int i2 = b & 255;
        if (i2 > 132) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b(new int[]{61, 46, 0, 0}, false, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000", objArr3);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr3[0]).intern());
        }
        if (i2 == 128) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b(new int[]{107, 46, 0, 19}, false, "\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001", objArr4);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr4[0]).intern());
        }
        switch (b) {
            case androidx.compose.runtime.ComposerKt.defaultsKey /* -127 */:
                int i3 = i + 1;
                if (i3 >= bArr.length) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(new int[]{-603426197, -757831948, 897471706, 576879260, -1938786974, 1427172214, 1065196255, -1511663167, 512117769, -1153885759, 1325953393, -1339708116, 1554044185, 1514847812, 1657340438, -241023437, -1458388199, 759239148, 719384289, 1608413954, 1836358188, 1406655545, -1962906718, -181674800, 832538291, 1520304888, 97165039, 466736279}, 54 - android.text.TextUtils.getOffsetAfter("", 0), objArr5);
                    throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr5[0]).intern());
                }
                long AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(new byte[]{bArr[i3]});
                int i4 = DigitizedCardProfile + 87;
                writeReplace = i4 % 128;
                if (i4 % 2 == 0) {
                    return AlternateContactlessPaymentDataJson2;
                }
                throw new java.lang.ArithmeticException();
            case -126:
                int i5 = i + 2;
                if (i5 < bArr.length) {
                    long AlternateContactlessPaymentDataJson3 = AlternateContactlessPaymentDataJson(new byte[]{bArr[i + 1], bArr[i5]});
                    DigitizedCardProfile = (writeReplace + 21) % 128;
                    return AlternateContactlessPaymentDataJson3;
                }
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a(new int[]{-603426197, -757831948, 897471706, 576879260, -1938786974, 1427172214, 1065196255, -1511663167, 512117769, -1153885759, 1325953393, -1339708116, 1554044185, 1514847812, 1657340438, -241023437, -1458388199, 759239148, 719384289, 1608413954, 1836358188, 1406655545, -1962906718, -181674800, 832538291, 1520304888, 97165039, 466736279}, 55 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr6);
                throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr6[0]).intern());
            case -125:
                int i6 = i + 3;
                if (i6 >= bArr.length) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(new int[]{-603426197, -757831948, 897471706, 576879260, -1938786974, 1427172214, 1065196255, -1511663167, 512117769, -1153885759, 1325953393, -1339708116, 1554044185, 1514847812, 1657340438, -241023437, -1458388199, 759239148, 719384289, 1608413954, 1836358188, 1406655545, -1962906718, -181674800, 832538291, 1520304888, 97165039, 466736279}, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 53, objArr7);
                    throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr7[0]).intern());
                }
                long AlternateContactlessPaymentDataJson4 = AlternateContactlessPaymentDataJson(new byte[]{bArr[i + 1], bArr[i + 2], bArr[i6]});
                int i7 = writeReplace + 79;
                DigitizedCardProfile = i7 % 128;
                if (i7 % 2 != 0) {
                    return AlternateContactlessPaymentDataJson4;
                }
                throw null;
            case -124:
                int i8 = i + 4;
                if (i8 < bArr.length) {
                    return AlternateContactlessPaymentDataJson(new byte[]{bArr[i + 1], bArr[i + 2], bArr[i + 3], bArr[i8]});
                }
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                a(new int[]{-603426197, -757831948, 897471706, 576879260, -1938786974, 1427172214, 1065196255, -1511663167, 512117769, -1153885759, 1325953393, -1339708116, 1554044185, 1514847812, 1657340438, -241023437, -1458388199, 759239148, 719384289, 1608413954, 1836358188, 1406655545, -1962906718, -181674800, 832538291, 1520304888, 97165039, 466736279}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 55, objArr8);
                throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr8[0]).intern());
            default:
                return AlternateContactlessPaymentDataJson(new byte[]{b});
        }
    }

    public static int writeReplace(byte b) throws com.payair.hce.generateExpiryDate {
        int i = writeReplace;
        DigitizedCardProfile = (i + 29) % 128;
        int i2 = b & 255;
        if (i2 > 132) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(new int[]{61, 46, 0, 0}, false, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000", objArr);
            throw new com.payair.hce.generateExpiryDate(((java.lang.String) objArr[0]).intern());
        }
        if (i2 == 128) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b(new int[]{107, 46, 0, 19}, false, "\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001", objArr2);
            throw new com.payair.hce.generateExpiryDate(((java.lang.String) objArr2[0]).intern());
        }
        switch (b) {
            case androidx.compose.runtime.ComposerKt.defaultsKey /* -127 */:
                DigitizedCardProfile = (i + 79) % 128;
                return 2;
            case -126:
                return 3;
            case -125:
                return 4;
            case -124:
                return 5;
            default:
                return 1;
        }
    }

    public static boolean DigitizedCardProfile(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.createDemoTransactionCredentials {
        int i = writeReplace + 21;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            if (transactioncanberesumed == null || transactioncanberesumed.getProfileVersion()) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                b(new int[]{153, 31, 23, 24}, true, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001", objArr);
                throw new com.payair.hce.createDemoTransactionCredentials(((java.lang.String) objArr[0]).intern());
            }
            byte[] valueOf2 = transactioncanberesumed.valueOf();
            if ((valueOf2[0] & com.google.common.base.Ascii.US) != 31) {
                return valueOf2.length <= 1;
            }
            if (valueOf2.length < 2) {
                return false;
            }
            int i2 = 1;
            while (i2 < valueOf2.length - 1) {
                int i3 = DigitizedCardProfile;
                int i4 = i3 + 99;
                writeReplace = i4 % 128;
                if (i4 % 2 != 0) {
                    if ((valueOf2[i2] & com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION) != 120) {
                        return false;
                    }
                    i2++;
                    int i5 = i3 + 65;
                    writeReplace = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    if ((valueOf2[i2] & Byte.MIN_VALUE) != -128) {
                        return false;
                    }
                    i2++;
                    int i52 = i3 + 65;
                    writeReplace = i52 % 128;
                    int i62 = i52 % 2;
                }
            }
            return (valueOf2[valueOf2.length - 1] & Byte.MIN_VALUE) != -128;
        }
        throw null;
    }

    public static com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson(byte[] bArr, int i) throws com.payair.hce.postToastMessageOnUi {
        if (bArr == null || bArr.length <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{1839837784, 1218050891, -844937397, 648412102, 1905994523, 1589001003, -158640796, -616083105, 2130558691, 270485014}, 18 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr[0]).intern());
        }
        if (i >= bArr.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b(new int[]{35, 26, 0, 0}, false, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", objArr2);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr2[0]).intern());
        }
        byte b = bArr[i];
        if ((b & com.google.common.base.Ascii.US) != 31) {
            return com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(b);
        }
        writeReplace = (DigitizedCardProfile + 113) % 128;
        com.payair.hce.transactionCanBeResumed DigitizedCardProfile2 = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(b);
        for (int i2 = i + 1; i2 < bArr.length; i2++) {
            int i3 = DigitizedCardProfile + 73;
            writeReplace = i3 % 128;
            if (i3 % 2 == 0) {
                if ((bArr[i2] & Byte.MIN_VALUE) != -128) {
                    break;
                }
            } else {
                if ((bArr[i2] & 48) != 86) {
                    break;
                }
            }
        }
        if (DigitizedCardProfile2.DigitizedCardProfile() == 1 && (DigitizedCardProfile2.AlternateContactlessPaymentDataJson(0) & com.google.common.base.Ascii.US) == 31) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(new int[]{535600419, -1027560070, 2136951277, 244630769, 230579874, -1751048530, -1817522473, 281825541}, 13 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr3);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr3[0]).intern());
        }
        if (DigitizedCardProfile2.DigitizedCardProfile() <= 1) {
            return DigitizedCardProfile2;
        }
        writeReplace = (DigitizedCardProfile + 57) % 128;
        if ((DigitizedCardProfile2.AlternateContactlessPaymentDataJson(DigitizedCardProfile2.DigitizedCardProfile() - 1) & Byte.MIN_VALUE) != -128) {
            return DigitizedCardProfile2;
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{535600419, -1027560070, 2136951277, 244630769, 230579874, -1751048530, -1817522473, 281825541}, android.text.TextUtils.indexOf("", "") + 13, objArr4);
        throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr4[0]).intern());
    }

    public static com.payair.hce.transactionCanBeResumed values(com.payair.hce.getWalletIdentificationDataProvider[] getwalletidentificationdataproviderArr) throws com.payair.hce.postToastMessageOnUi {
        DigitizedCardProfile = (writeReplace + 113) % 128;
        if (getwalletidentificationdataproviderArr == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{1839837784, 1218050891, 719384289, 1608413954, 1783553806, -1974819484, -954521766, -1693368296, 887360012, -141166428}, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 20, objArr);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr[0]).intern());
        }
        int i = 0;
        for (com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider : getwalletidentificationdataproviderArr) {
            i += ((java.lang.Integer) com.payair.hce.getWalletIdentificationDataProvider.values(new java.lang.Object[]{getwalletidentificationdataprovider}, -1698785018, 1698785019, java.lang.System.identityHashCode(getwalletidentificationdataprovider))).intValue();
        }
        com.payair.hce.transactionCanBeResumed writeReplace2 = com.payair.hce.transactionCanBeResumed.writeReplace(i);
        int i2 = 0;
        for (com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider2 : getwalletidentificationdataproviderArr) {
            writeReplace2.valueOf(i2, getwalletidentificationdataprovider2.DigitizedCardProfile().valueOf());
            i2 += ((java.lang.Integer) com.payair.hce.getWalletIdentificationDataProvider.values(new java.lang.Object[]{getwalletidentificationdataprovider2}, -1698785018, 1698785019, java.lang.System.identityHashCode(getwalletidentificationdataprovider2))).intValue();
        }
        int i3 = DigitizedCardProfile + 47;
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            return writeReplace2;
        }
        throw null;
    }

    public static com.payair.hce.transactionCanBeResumed writeReplace(java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) {
        com.payair.hce.transactionCanBeResumed writeReplace2 = com.payair.hce.transactionCanBeResumed.writeReplace(0);
        for (com.payair.hce.startDeviceAuthenticationForRegistration startdeviceauthenticationforregistration : list) {
            DigitizedCardProfile = (writeReplace + 5) % 128;
        }
        DigitizedCardProfile = (writeReplace + 27) % 128;
        return writeReplace2;
    }

    public static com.payair.hce.transactionCanBeResumed values(java.lang.Iterable<com.payair.hce.getWalletIdentificationDataProvider> iterable) throws com.payair.hce.postToastMessageOnUi {
        DigitizedCardProfile = (writeReplace + 41) % 128;
        int i = 0;
        if (iterable == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{1839837784, 1218050891, 719384289, 1608413954, 1783553806, -1974819484, -954521766, -1693368296, 887360012, -141166428}, 20 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr[0]).intern());
        }
        DigitizedCardProfile = (writeReplace + 15) % 128;
        int i2 = 0;
        for (com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider : iterable) {
            DigitizedCardProfile = (writeReplace + 57) % 128;
            i2 += ((java.lang.Integer) com.payair.hce.getWalletIdentificationDataProvider.values(new java.lang.Object[]{getwalletidentificationdataprovider}, -1698785018, 1698785019, java.lang.System.identityHashCode(getwalletidentificationdataprovider))).intValue();
        }
        com.payair.hce.transactionCanBeResumed writeReplace2 = com.payair.hce.transactionCanBeResumed.writeReplace(i2);
        for (com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider2 : iterable) {
            writeReplace = (DigitizedCardProfile + 99) % 128;
            writeReplace2.valueOf(i, getwalletidentificationdataprovider2.DigitizedCardProfile().valueOf());
            i += ((java.lang.Integer) com.payair.hce.getWalletIdentificationDataProvider.values(new java.lang.Object[]{getwalletidentificationdataprovider2}, -1698785018, 1698785019, java.lang.System.identityHashCode(getwalletidentificationdataprovider2))).intValue();
        }
        int i3 = writeReplace + 11;
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 != 0) {
            return writeReplace2;
        }
        throw null;
    }

    public static java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> writeReplace(byte[] bArr) throws com.payair.hce.postToastMessageOnUi, com.payair.hce.generateExpiryDate, com.payair.hce.updateSukFileName {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i < bArr.length) {
            DigitizedCardProfile = (writeReplace + 81) % 128;
            com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(bArr, i);
            if (bArr.length <= AlternateContactlessPaymentDataJson2.DigitizedCardProfile() + i) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(new int[]{1118028744, -1527987763, -1097365440, 636124805, 1775331349, 908553770, 216489122, -517907606, 877975608, -324580552, 1431019190, -1499680481, 1689919962, 453356724, -47624190, -1365198390, 1575933102, 87579072, 152427562, -57041740, -1705439565, 1049442602, 1610239822, -888390039, 387694352, -1356448953}, 50 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
                throw new com.payair.hce.generateExpiryDate(((java.lang.String) objArr[0]).intern());
            }
            int writeReplace2 = writeReplace(bArr[AlternateContactlessPaymentDataJson2.DigitizedCardProfile() + i]);
            if (writeReplace2 > 1) {
                throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getMppLiteModule);
            }
            arrayList.add(new com.payair.hce.startDeviceAuthenticationForRegistration(AlternateContactlessPaymentDataJson2.valueOf(), bArr[AlternateContactlessPaymentDataJson2.DigitizedCardProfile() + i]));
            i += AlternateContactlessPaymentDataJson2.DigitizedCardProfile() + writeReplace2;
            writeReplace = (DigitizedCardProfile + 49) % 128;
        }
        return arrayList;
    }

    public static com.payair.hce.transactionCanBeResumed valueOf(java.lang.Iterable<com.payair.hce.transactionCanBeResumed> iterable) {
        java.util.Iterator<com.payair.hce.transactionCanBeResumed> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().DigitizedCardProfile();
        }
        com.payair.hce.transactionCanBeResumed writeReplace2 = com.payair.hce.transactionCanBeResumed.writeReplace(i);
        try {
            int i2 = 0;
            for (com.payair.hce.transactionCanBeResumed transactioncanberesumed : iterable) {
                writeReplace2.valueOf(i2, transactioncanberesumed.valueOf());
                i2 += transactioncanberesumed.DigitizedCardProfile();
                DigitizedCardProfile = (writeReplace + 113) % 128;
            }
            writeReplace = (DigitizedCardProfile + 75) % 128;
            return writeReplace2;
        } catch (com.payair.hce.postToastMessageOnUi unused) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 20, 39, 0}, false, "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001", objArr);
            try {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(((java.lang.String) objArr[0]).intern()));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    public static long values(java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) {
        writeReplace = (DigitizedCardProfile + 87) % 128;
        java.util.Iterator<com.payair.hce.startDeviceAuthenticationForRegistration> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            int i = writeReplace + 77;
            DigitizedCardProfile = i % 128;
            j = i % 2 == 0 ? j % it.next().AlternateContactlessPaymentDataJson() : j + it.next().AlternateContactlessPaymentDataJson();
            writeReplace = (DigitizedCardProfile + 93) % 128;
        }
        int i2 = writeReplace + 97;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public static java.lang.String valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        char c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < transactioncanberesumed.DigitizedCardProfile(); i++) {
            byte AlternateContactlessPaymentDataJson2 = transactioncanberesumed.AlternateContactlessPaymentDataJson(i);
            for (int i2 = 7; i2 >= 0; i2--) {
                int i3 = (DigitizedCardProfile + 51) % 128;
                writeReplace = i3;
                if (((1 << i2) & AlternateContactlessPaymentDataJson2) != 0) {
                    c = '1';
                } else {
                    DigitizedCardProfile = (i3 + 9) % 128;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                }
                sb.append(c);
            }
        }
        java.lang.String obj = sb.toString();
        if (obj.length() <= 8) {
            return obj;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(obj);
        for (int length = sb2.length() - 8; length > 0; length -= 8) {
            sb2.insert(length, ' ');
        }
        return sb2.toString();
    }

    static void AlternateContactlessPaymentDataJson() {
        AlternateContactlessPaymentDataJson = new int[]{1763650973, 895156110, -1492853569, -1883734737, -2040308819, -1787734459, 638830825, 1410312013, 480338991, 1266200314, 248827807, 1244555247, 1115706102, 779961902, -46537816, -313044717, 61934161, 797005699};
        values = new char[]{16854, 16870, 16777, 16809, 16810, 16800, 16772, 16775, 16805, 16806, 16802, 16808, 16809, 16830, 16775, 16780, 16813, 16783, 16772, 16831, 16800, 16800, 16809, 16812, 16783, 16778, 16800, 16803, 16804, 16807, 16806, 16776, 16780, 16808, 16784, 16873, 16788, 16808, 16802, 16802, 16802, 16772, 16783, 16813, 16801, 16826, 16800, 16807, 16780, 16782, 16807, 16828, 16807, 16803, 16770, 16783, 16806, 16828, 16831, 16807, 16805, 16874, 16789, 16806, 16807, 16830, 16828, 16805, 16810, 16805, 16772, 16781, 16809, 16803, 16828, 16829, 16772, 16783, 16803, 16824, 16802, 16780, 16777, 16804, 16781, 16776, 16806, 16807, 16804, 16803, 16800, 16773, 16873, 16888, 16793, 16802, 16770, 16773, 16805, 16808, 16830, 16803, 16780, 16870, 16794, 16790, 16888, 16893, 16803, 16800, 16773, 16873, 16895, 16796, 16809, 16800, 16800, 16831, 16772, 16783, 16813, 16780, 16870, 16794, 16790, 16890, 16882, 16789, 16806, 16807, 16830, 16828, 16805, 16810, 16805, 16772, 16781, 16809, 16803, 16828, 16829, 16772, 16783, 16803, 16824, 16802, 16780, 16777, 16804, 16781, 16776, 16806, 16807, 16778, 16713, 16784, 16787, 16717, 16713, 16710, 16812, 16885, 16788, 16821, 16719, 16815, 16796, 16806, 16809, 16799, 16791, 16819, 16719, 16819, 16716, 16711, 16828, 16798, 16806, 16707, 16711, 16715, 16718, 16791, 16886, 16716, 16731, 16731, 16705, 16734, 16734, 16734, 16726, 16735, 16735, 16731, 16733, 16731, 16800, 16807, 16732, 16727, 16729, 16729};
    }

    static void init$0() {
        $$a = new byte[]{41, 86, 91, 57};
        $$b = 50;
    }
}
