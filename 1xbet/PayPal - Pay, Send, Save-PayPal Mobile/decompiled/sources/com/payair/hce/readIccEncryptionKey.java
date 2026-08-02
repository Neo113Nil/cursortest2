package com.payair.hce;

/* loaded from: classes4.dex */
public class readIccEncryptionKey extends com.payair.hce.getReasonCode<java.lang.Long> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static short[] getAid;
    private static int getProfileVersion;
    private static int valueOf;
    private static byte[] values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i * 4) + 4;
        byte[] bArr = $$a;
        int i6 = 1 - (s * 4);
        int i7 = (i2 * 2) + 104;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            int i9 = i6;
            i4 = 0;
            int i10 = (-i5) + i9;
            int i11 = i8 + 1;
            i3 = i4;
            i7 = i10;
            i5 = i11;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i7;
            i8 = i5;
            i5 = bArr[i5];
            i9 = i12;
            int i102 = (-i5) + i9;
            int i112 = i8 + 1;
            i3 = i4;
            i7 = i102;
            i5 = i112;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        }
    }

    /* synthetic */ readIccEncryptionKey(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 9) % 128;
        int axisFromString = android.view.MotionEvent.axisFromString("");
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(1229939334 - axisFromString, (-1053279141) - makeMeasureSpec, (-69) - (longPressTimeout >> 16), (byte) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 91), (short) ((-68) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr);
        com.payair.hce.transactionCanBeResumed values2 = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern());
        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 29) % 128;
        return values2;
    }

    private readIccEncryptionKey() {
        try {
            com.payair.hce.transactionCanBeResumed writeReplace = com.payair.hce.transactionCanBeResumed.writeReplace(6);
            super.valueOf(writeReplace);
            super.AlternateContactlessPaymentDataJson(java.lang.Long.valueOf(com.payair.hce.onSignUser.AlternateContactlessPaymentDataJson(writeReplace.valueOf())));
        } catch (com.payair.hce.postToastMessageOnUi unused) {
        }
    }

    public static com.payair.hce.setMobilePin<java.lang.Long> AlternateContactlessPaymentDataJson() {
        com.payair.hce.setMobilePin<java.lang.Long> setmobilepin = new com.payair.hce.setMobilePin<java.lang.Long>() { // from class: com.payair.hce.readIccEncryptionKey.4
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static int AlternateContactlessPaymentDataJson;
            private static char[] DigitizedCardProfile;
            private static int IccPrivateKeyCrtComponentsJson;
            private static int RecordsJson;
            private static int[] valueOf;
            private static boolean values;
            private static boolean writeReplace;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0024). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(byte b, int i, int i2, java.lang.Object[] objArr) {
                int i3;
                byte[] bArr = $$a;
                int i4 = (i2 * 2) + 4;
                int i5 = 718 - i;
                char[] cArr = new char[b + 1];
                if (bArr == null) {
                    byte b2 = b;
                    i3 = 0;
                    i5 = (i5 + b2) - 2;
                    i4++;
                    cArr[i3] = (char) i5;
                    if (i3 == b) {
                        objArr[0] = new java.lang.String(cArr);
                        return;
                    }
                    b2 = bArr[i4];
                    i3++;
                    i5 = (i5 + b2) - 2;
                    i4++;
                    cArr[i3] = (char) i5;
                    if (i3 == b) {
                    }
                } else {
                    i3 = 0;
                    cArr[i3] = (char) i5;
                    if (i3 == b) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void d(byte b, int i, byte b2, java.lang.Object[] objArr) {
                int i2;
                int i3 = (b2 * 52) + 66;
                int i4 = (i * 4) + 1;
                byte[] bArr = $$d;
                int i5 = 3 - (b * 4);
                byte[] bArr2 = new byte[i4];
                if (bArr == null) {
                    int i6 = i5;
                    int i7 = i4;
                    i2 = 0;
                    int i8 = i6;
                    i3 = i5 + i7;
                    i5 = i8;
                    int i9 = i5 + 1;
                    bArr2[i2] = (byte) i3;
                    i2++;
                    if (i2 == i4) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i7 = bArr[i9];
                    int i10 = i3;
                    i6 = i9;
                    i5 = i10;
                    int i82 = i6;
                    i3 = i5 + i7;
                    i5 = i82;
                    int i92 = i5 + 1;
                    bArr2[i2] = (byte) i3;
                    i2++;
                    if (i2 == i4) {
                    }
                } else {
                    i2 = 0;
                    int i922 = i5 + 1;
                    bArr2[i2] = (byte) i3;
                    i2++;
                    if (i2 == i4) {
                    }
                }
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<java.lang.Long> valueOf() {
                com.payair.hce.readIccEncryptionKey readiccencryptionkey = new com.payair.hce.readIccEncryptionKey((byte) 0);
                int i = IccPrivateKeyCrtComponentsJson + 47;
                RecordsJson = i % 128;
                if (i % 2 == 0) {
                    return readiccencryptionkey;
                }
                throw null;
            }

            private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
                com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
                char[] cArr = new char[4];
                int i2 = 2;
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = valueOf;
                int i3 = 1;
                char c = 0;
                if (iArr2 != null) {
                    $11 = ($10 + 97) % 128;
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i4 = 0;
                    while (i4 < length) {
                        int i5 = $10 + 25;
                        $11 = i5 % 128;
                        if (i5 % i2 == 0) {
                            try {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                objArr2[c] = java.lang.Integer.valueOf(iArr2[i4]);
                                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                                if (obj == null) {
                                    obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 27, 29 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("z", java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                                }
                                iArr3[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr2[i4])};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.getOffsetBefore("", 0), android.view.KeyEvent.keyCodeFromString("") + 29, (char) (android.view.MotionEvent.axisFromString("") + 1))).getMethod("z", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                            }
                            iArr3[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                            i4++;
                        }
                        i2 = 2;
                        c = 0;
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = valueOf;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    $11 = ($10 + 101) % 128;
                    int i6 = 0;
                    while (i6 < length3) {
                        java.lang.Object[] objArr4 = new java.lang.Object[i3];
                        objArr4[0] = java.lang.Integer.valueOf(iArr5[i6]);
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 27, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 29, (char) android.view.View.MeasureSpec.getMode(0))).getMethod("z", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                        }
                        iArr6[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                        i6++;
                        i3 = 1;
                    }
                    iArr5 = iArr6;
                }
                char c2 = 0;
                java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
                istransitsupported.valueOf = 0;
                while (istransitsupported.valueOf < iArr.length) {
                    cArr[c2] = (char) (iArr[istransitsupported.valueOf] >> 16);
                    cArr[1] = (char) iArr[istransitsupported.valueOf];
                    cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
                    cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
                    istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
                    istransitsupported.values = (cArr[2] << 16) + cArr[3];
                    com.payair.hce.isTransitSupported.values(iArr4);
                    int i7 = 0;
                    for (int i8 = 16; i7 < i8; i8 = 16) {
                        istransitsupported.DigitizedCardProfile ^= iArr4[i7];
                        java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                        if (obj4 == null) {
                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.os.Process.myPid() >> 22), android.view.View.combineMeasuredStates(0, 0) + 5088, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                        istransitsupported.DigitizedCardProfile = istransitsupported.values;
                        istransitsupported.values = intValue;
                        i7++;
                    }
                    int i9 = istransitsupported.DigitizedCardProfile;
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = i9;
                    istransitsupported.values ^= iArr4[16];
                    istransitsupported.DigitizedCardProfile ^= iArr4[17];
                    int i10 = istransitsupported.DigitizedCardProfile;
                    int i11 = istransitsupported.values;
                    cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
                    cArr[1] = (char) istransitsupported.DigitizedCardProfile;
                    cArr[2] = (char) (istransitsupported.values >>> 16);
                    cArr[3] = (char) istransitsupported.values;
                    com.payair.hce.isTransitSupported.values(iArr4);
                    cArr2[istransitsupported.valueOf * 2] = cArr[0];
                    cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
                    cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
                    cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
                    java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
                    if (obj5 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2923 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (3037 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        d((byte) 0, 0, (byte) 0, objArr7);
                        obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
                    }
                    ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
                    c2 = 0;
                }
                objArr[0] = new java.lang.String(cArr2, 0, i);
            }

            private static void b(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
                int i2;
                java.lang.String str3 = str2;
                int i3 = $10;
                int i4 = i3 + 85;
                $11 = i4 % 128;
                byte[] bArr = str3;
                if (i4 % 2 == 0) {
                    throw null;
                }
                if (str3 != null) {
                    $11 = (i3 + 101) % 128;
                    bArr = str3.getBytes("ISO-8859-1");
                }
                byte[] bArr2 = bArr;
                char[] charArray = str != null ? str.toCharArray() : str;
                com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
                char[] cArr = DigitizedCardProfile;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                            if (obj == null) {
                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 46, 286 - android.view.KeyEvent.keyCodeFromString(""), (char) (46337 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)))).getMethod("y", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                            }
                            cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 45, 287 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (46337 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))).getMethod("x", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                if (writeReplace) {
                    getumdgeneration.values = bArr2.length;
                    char[] cArr3 = new char[getumdgeneration.values];
                    getumdgeneration.valueOf = 0;
                    while (getumdgeneration.valueOf < getumdgeneration.values) {
                        int i6 = $10 + 47;
                        $11 = i6 % 128;
                        if (i6 % 2 == 0) {
                            cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[getumdgeneration.values % getumdgeneration.valueOf] * i] << intValue);
                            java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                            if (obj3 == null) {
                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1629, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                d((byte) 0, 0, (byte) 1, objArr5);
                                obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                            }
                            ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                        } else {
                            cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                            if (obj4 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.Gravity.getAbsoluteGravity(0, 0), android.graphics.Color.blue(0) + 1629, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                d((byte) 0, 0, (byte) 1, objArr7);
                                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                            }
                            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                        }
                    }
                    objArr[0] = new java.lang.String(cArr3);
                    return;
                }
                if (!values) {
                    getumdgeneration.values = iArr.length;
                    char[] cArr4 = new char[getumdgeneration.values];
                    getumdgeneration.valueOf = 0;
                    while (getumdgeneration.valueOf < getumdgeneration.values) {
                        int i7 = $11 + 71;
                        $10 = i7 % 128;
                        if (i7 % 2 != 0) {
                            cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[getumdgeneration.values % getumdgeneration.valueOf] * i] * intValue);
                            i2 = getumdgeneration.valueOf;
                        } else {
                            cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                            i2 = getumdgeneration.valueOf + 1;
                        }
                        getumdgeneration.valueOf = i2;
                    }
                    objArr[0] = new java.lang.String(cArr4);
                    return;
                }
                getumdgeneration.values = charArray.length;
                char[] cArr5 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
                while (getumdgeneration.valueOf < getumdgeneration.values) {
                    int i8 = $10 + 63;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values >>> 1) >>> getumdgeneration.valueOf] % i] >>> intValue);
                        java.lang.Object[] objArr8 = {getumdgeneration, getumdgeneration};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                        if (obj5 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 43, android.view.KeyEvent.getDeadChar(0, 0) + 1629, (char) android.view.KeyEvent.normalizeMetaState(0));
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            d((byte) 0, 0, (byte) 1, objArr9);
                            obj5 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
                        }
                        ((java.lang.reflect.Method) obj5).invoke(null, objArr8);
                    } else {
                        cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                        java.lang.Object[] objArr10 = {getumdgeneration, getumdgeneration};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                        if (obj6 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 43, android.text.TextUtils.getOffsetAfter("", 0) + 1629, (char) android.text.TextUtils.indexOf("", "", 0, 0));
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            d((byte) 0, 0, (byte) 1, objArr11);
                            obj6 = cls4.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj6);
                        }
                        ((java.lang.reflect.Method) obj6).invoke(null, objArr10);
                    }
                }
                objArr[0] = new java.lang.String(cArr5);
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                RecordsJson = 0;
                IccPrivateKeyCrtComponentsJson = 1;
                valueOf = new int[]{805269314, -340562962, -1491242202, 1114815172, 764639948, 667651018, 1324460725, -984596, -1876805776, 343171372, 276059594, -1442623498, -96728564, 1039501298, 34039872, 1494257898, 1523755029, 1910507292};
                DigitizedCardProfile = new char[]{11130, 11041, 11052, 11057, 11054, 11066, 11064, 11131, 11065, 11067, 11040, 11071, 11044, 11056, 11070, 11069, 11059, 11086, 11061, 11073, 11117, 11046, 11042, 11047, 11089, 11045, 11075, 11127, 11050, 11060, 11101, 11096, 11084, 11099};
                AlternateContactlessPaymentDataJson = -143185267;
                values = true;
                writeReplace = true;
            }

            static void init$1() {
                $$d = new byte[]{109, 99, -23, -23};
                $$e = 79;
            }

            /* JADX WARN: Code restructure failed: missing block: B:377:0x14b7, code lost:
            
                r1 = new java.lang.Object[]{new int[1], new int[1], null, r2, new int[1]};
                r2 = (java.lang.String) java.lang.Class.forName(r5).getField(r38).get(r35);
                r15 = r41;
                ((int[]) r1[0])[0] = r15;
                ((int[]) r1[1])[0] = r15 ^ 20;
                r2 = ~r15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:378:0x14f1, code lost:
            
                r4 = new java.lang.Object[]{java.lang.Integer.valueOf(r43), 16, java.lang.Integer.valueOf((((((~((-1058033063) | r2)) | (-27897118)) * (-602)) + 2056311850) + ((((~((-1058033063) | r15)) | 1041252514) | (~((-11116570) | r2))) * (-301))) + ((~(r2 | (-27897118))) * 301))};
                r9 = r33;
                r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r9);
                r2 = r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:379:0x1535, code lost:
            
                if (r2 != null) goto L246;
             */
            /* JADX WARN: Code restructure failed: missing block: B:380:0x1537, code lost:
            
                r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, 2714 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) - 1));
                r5 = new java.lang.Object[1];
                c((byte) 34, 653, com.payair.hce.readIccEncryptionKey.AnonymousClass4.$$a[41], r5);
                r2 = r2.getMethod((java.lang.String) r5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r9, r2);
                r2 = r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:382:0x1592, code lost:
            
                ((int[]) r1[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r4)).intValue();
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x179e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:122:0x179f  */
            /* JADX WARN: Removed duplicated region for block: B:166:0x1c72 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:515:0x167a A[Catch: Exception -> 0x1684, all -> 0x16a5, IOException -> 0x16b3, TryCatch #1 {, blocks: (B:302:0x0fc9, B:304:0x0fe4, B:307:0x0ffa, B:316:0x1080, B:326:0x165a, B:328:0x1660, B:329:0x1661, B:331:0x10dd, B:341:0x114e, B:358:0x1355, B:361:0x1358, B:363:0x13f3, B:365:0x1416, B:367:0x143c, B:369:0x145e, B:371:0x148b, B:373:0x14ae, B:396:0x1684, B:397:0x16a4, B:424:0x161a, B:425:0x161d, B:489:0x162f, B:491:0x163c, B:492:0x163d, B:496:0x164b, B:498:0x1652, B:499:0x1653, B:513:0x1674, B:515:0x167a, B:516:0x167b), top: B:301:0x0fc9 }] */
            /* JADX WARN: Removed duplicated region for block: B:516:0x167b A[Catch: Exception -> 0x1684, all -> 0x16a5, IOException -> 0x16b3, TRY_LEAVE, TryCatch #1 {, blocks: (B:302:0x0fc9, B:304:0x0fe4, B:307:0x0ffa, B:316:0x1080, B:326:0x165a, B:328:0x1660, B:329:0x1661, B:331:0x10dd, B:341:0x114e, B:358:0x1355, B:361:0x1358, B:363:0x13f3, B:365:0x1416, B:367:0x143c, B:369:0x145e, B:371:0x148b, B:373:0x14ae, B:396:0x1684, B:397:0x16a4, B:424:0x161a, B:425:0x161d, B:489:0x162f, B:491:0x163c, B:492:0x163d, B:496:0x164b, B:498:0x1652, B:499:0x1653, B:513:0x1674, B:515:0x167a, B:516:0x167b), top: B:301:0x0fc9 }] */
            /* JADX WARN: Type inference failed for: r11v21 */
            /* JADX WARN: Type inference failed for: r12v10 */
            /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Integer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r12v60 */
            /* JADX WARN: Type inference failed for: r12v61 */
            /* JADX WARN: Type inference failed for: r12v62 */
            /* JADX WARN: Type inference failed for: r15v10 */
            /* JADX WARN: Type inference failed for: r15v11 */
            /* JADX WARN: Type inference failed for: r15v29 */
            /* JADX WARN: Type inference failed for: r15v47 */
            /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r15v8 */
            /* JADX WARN: Type inference failed for: r15v9 */
            /* JADX WARN: Type inference failed for: r1v367, types: [java.lang.String[]] */
            /* JADX WARN: Type inference failed for: r1v368 */
            /* JADX WARN: Type inference failed for: r1v369 */
            /* JADX WARN: Type inference failed for: r1v457, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v513, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v562, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v611, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v641, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v670, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v697, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v727, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r28v19, types: [int] */
            /* JADX WARN: Type inference failed for: r32v18 */
            /* JADX WARN: Type inference failed for: r32v31, types: [long] */
            /* JADX WARN: Type inference failed for: r32v32 */
            /* JADX WARN: Type inference failed for: r32v33 */
            /* JADX WARN: Type inference failed for: r32v5 */
            /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v267 */
            /* JADX WARN: Type inference failed for: r3v276 */
            /* JADX WARN: Type inference failed for: r3v277 */
            /* JADX WARN: Type inference failed for: r3v383 */
            /* JADX WARN: Type inference failed for: r3v406 */
            /* JADX WARN: Type inference failed for: r3v564 */
            /* JADX WARN: Type inference failed for: r3v579 */
            /* JADX WARN: Type inference failed for: r5v422 */
            /* JADX WARN: Type inference failed for: r5v423 */
            /* JADX WARN: Type inference failed for: r5v424 */
            /* JADX WARN: Type inference failed for: r5v425 */
            /* JADX WARN: Type inference failed for: r5v426 */
            /* JADX WARN: Type inference failed for: r5v427 */
            /* JADX WARN: Type inference failed for: r5v443 */
            /* JADX WARN: Type inference failed for: r5v464, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v484 */
            /* JADX WARN: Type inference failed for: r5v527 */
            /* JADX WARN: Type inference failed for: r5v528 */
            /* JADX WARN: Type inference failed for: r6v119, types: [java.lang.reflect.Field] */
            /* JADX WARN: Type inference failed for: r6v123, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.reflect.Field] */
            /* JADX WARN: Type inference failed for: r7v286, types: [java.lang.String[]] */
            /* JADX WARN: Type inference failed for: r7v287, types: [java.lang.String] */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] DigitizedCardProfile(android.content.Context context, int i, int i2, int i3) {
                java.lang.Integer num;
                int i4;
                java.lang.String str;
                char c;
                java.lang.Object[] objArr;
                int i5;
                java.lang.String str2;
                java.lang.Object[] objArr2;
                char c2;
                java.lang.Object[] objArr3;
                int i6;
                java.lang.String str3;
                java.lang.Object[] objArr4;
                char c3;
                char c4;
                java.lang.Object[] objArr5;
                ?? r32;
                java.lang.String str4;
                java.lang.String str5;
                java.lang.String intern;
                java.lang.Runtime runtime;
                java.lang.Process exec;
                java.lang.Throwable th;
                java.lang.Throwable cause;
                java.lang.Object obj;
                java.lang.Object newInstance;
                java.lang.Throwable th2;
                java.lang.Throwable th3;
                java.lang.String str6;
                java.lang.String str7;
                java.lang.String str8;
                java.lang.String str9;
                java.lang.Object obj2;
                java.lang.Object[] objArr6;
                int i7;
                java.lang.Object[] objArr7;
                char c5;
                int i8;
                java.lang.Object[] objArr8;
                char c6;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(new int[]{-242452423, -1320741518, -192558680, -551068572, 1167539123, -1442912759, -701094996, -1093435049, -45085643, -1931284525, -1495059407, -754938798, 888835444, -2129657978, -1018128498, 1205621993, 1053245748, -2030911509}, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 34, objArr9);
                java.lang.String intern2 = ((java.lang.String) objArr9[0]).intern();
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                b(null, null, android.text.TextUtils.getOffsetBefore("", 0) + 127, "\u008c\u008d\u0094\u0083\u0084\u0083\u0082", objArr10);
                java.lang.String intern3 = ((java.lang.String) objArr10[0]).intern();
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(null, null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0082\u0083\u008b\u008c\u009a\u0099\u0088\u0097\u008a\u0083\u0089\u0088\u0083\u0091\u0083\u0098", objArr11);
                java.lang.String intern4 = ((java.lang.String) objArr11[0]).intern();
                ?? r12 = -1347122530;
                try {
                    if (context == null) {
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(new int[]{-942955041, 1955919128, -1116955957, 152831140, 50898810, -2108790204}, 12 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr12);
                        java.lang.Object[] objArr13 = {((java.lang.String) objArr12[0]).intern()};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                        java.lang.Object obj4 = obj3;
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36, 3162 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 33098));
                            byte b = $$a[41];
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            c(b, (short) (b | 618), b, objArr14);
                            java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr14[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, method);
                            obj4 = method;
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr13)).longValue();
                        long j = i;
                        long j2 = ~j;
                        long j3 = ~((~longValue) | j);
                        long j4 = ((-574) * longValue) + 373243409882L + (((~(j2 | 650249842)) | j3) * 1150) + ((j3 | (~(j2 | longValue))) * (-575)) + (((~((-650249843) | j2)) | (~(650249842 | j))) * 575) + 1557720581;
                        int i9 = (int) (j4 >> 32);
                        int i10 = ~i;
                        if (((i9 & ((((~(i | (-6726))) | (~((-1168638209) | i10))) * 497) + 103614101 + (((~((-268581478) | i10)) | 268574752 | (~((-1168638209) | i))) * 497))) | (((int) j4) & ((((~((-1668200216) | i10)) | (~(1743714111 | i))) * (-831)) + 1191864252 + ((~((-554173442) | i)) * (-1662)) + (((~((-1189540671) | i10)) | (~(1189540670 | i)) | (~(1668200215 | i))) * 831)))) != 0) {
                            objArr6 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 50}, null, null, new int[1]};
                            java.lang.Object[] objArr15 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-964600398) | i)) | (-65535548)) * (-964)) + 145256588 + (((~((-964600398) | i10)) | 941097028) * (-964)))};
                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r12);
                            java.lang.Object obj6 = obj5;
                            if (obj5 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49, 2713 - android.view.View.getDefaultSize(0, 0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                c((byte) 34, 653, $$a[41], objArr16);
                                java.lang.reflect.Method method2 = cls2.getMethod((java.lang.String) objArr16[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r12, method2);
                                obj6 = method2;
                            }
                            i7 = 0;
                            ((int[]) objArr6[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr15)).intValue();
                        } else {
                            objArr6 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                            int i11 = ~(989765628 | i);
                            java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((((~((-847158701) | i10)) | 40370316) | i11) * (-252)) - 1681446312) + ((i11 | (~((-806788385) | i10))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r12);
                            java.lang.Object obj8 = obj7;
                            if (obj7 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50, 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.text.TextUtils.getOffsetAfter("", 0));
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                c((byte) 34, 653, $$a[41], objArr18);
                                java.lang.reflect.Method method3 = cls3.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r12, method3);
                                obj8 = method3;
                            }
                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr17)).intValue();
                            i7 = 0;
                            ((int[]) objArr6[4])[0] = intValue;
                        }
                        if (((int[]) objArr6[1])[i7] != i) {
                            return objArr6;
                        }
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        a(new int[]{1318886922, 1038232776, -763876199, -1366629302, 208327035, 2092638068, 710590768, 1425279505, -900191095, -325254562}, 20 - android.text.TextUtils.getOffsetBefore("", i7), objArr19);
                        java.lang.Object[] objArr20 = {((java.lang.String) objArr19[i7]).intern()};
                        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                        java.lang.Object obj10 = obj9;
                        if (obj9 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35, 3161 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (33098 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                            byte b2 = $$a[41];
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            c(b2, (short) (b2 | 618), b2, objArr21);
                            java.lang.reflect.Method method4 = cls4.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, method4);
                            obj10 = method4;
                        }
                        long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr20)).longValue();
                        long j5 = (-688830896) | longValue2;
                        long j6 = ((-753) * longValue2) + 520067325725L + (((~(j | (-688830896))) | (~j5) | (~(longValue2 | j))) * (-754)) + (((~(j5 | j)) | (~(longValue2 | 688830895 | j2))) * (-754)) + (((-688830896) | j2) * 754) + 218639843;
                        if (((((int) j6) & (((((~(735320363 | i)) | 140372) * (-283)) - 1397501135) + ((~(735460735 | i)) * 283))) | (((int) (j6 >> 32)) & (((~(866647031 | i)) * (-301)) + 1664778166 + (((~((-847412148) | i)) | (~(589814263 | i10))) * (-301)) + (((~((-589814264) | i)) | (-847412148)) * 301)))) != 0) {
                            objArr7 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 60}, null, null, new int[1]};
                            int i12 = ~(130113392 | i10);
                            java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((37756512 | i12) * (-970)) - 392613464) + ((i12 | 92356880) * 970))};
                            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r12);
                            java.lang.Object obj12 = obj11;
                            if (obj11 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(""), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                c((byte) 34, 653, $$a[41], objArr23);
                                java.lang.reflect.Method method5 = cls5.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r12, method5);
                                obj12 = method5;
                            }
                            int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr22)).intValue();
                            c5 = 0;
                            ((int[]) objArr7[4])[0] = intValue2;
                        } else {
                            objArr7 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                            java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-1053365268) | i10)) | 23229322) * (-865)) + 276553062 + ((~(1053365267 | i)) * 865) + (((~(1053365267 | i10)) | (~(23229322 | i10))) * 865))};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r12);
                            java.lang.Object obj14 = obj13;
                            if (obj13 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) android.graphics.Color.argb(0, 0, 0, 0));
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                c((byte) 34, 653, $$a[41], objArr25);
                                java.lang.reflect.Method method6 = cls6.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r12, method6);
                                obj14 = method6;
                            }
                            c5 = 0;
                            ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr24)).intValue();
                        }
                        if (((int[]) objArr7[1])[c5] != i) {
                            return objArr7;
                        }
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        a(new int[]{-700476784, -25584781, 325245096, -1267439558, -1933489574, 1546509661, 2124796677, -1089595755, -919277047, -2107917099, -242452423, -1320741518, -1552984452, -1208837573, -928394196, -1453786290, -1124478949, -1318538710}, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\f', objArr26);
                        java.lang.Object[] objArr27 = {((java.lang.String) objArr26[c5]).intern()};
                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                        java.lang.Object obj16 = obj15;
                        if (obj15 == null) {
                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.os.Process.getGidForName(""), 3160 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 33099));
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            c(r3[22], androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, (byte) (-$$a[16]), objArr28);
                            java.lang.reflect.Method method7 = cls7.getMethod((java.lang.String) objArr28[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method7);
                            obj16 = method7;
                        }
                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr27)).longValue();
                        long j7 = ~longValue3;
                        long j8 = ((-67) * longValue3) + 33190281744L + (((~(longValue3 | 481018576)) | (~(j7 | (-481018577) | j2)) | (~(longValue3 | j))) * (-68)) + ((~(longValue3 | (-481018577) | j2)) * (-68)) + (((~(j7 | j2)) | (-481018577)) * 68) + 514416327;
                        int i13 = 805288874 | i10;
                        if (((((int) (j8 >> 32)) & ((((((~i13) | 631937536) * (-828)) + 1754752898) + (i13 * (-828))) - 1059257620)) | (((int) j8) & ((((-304089225) | i10) * 494) + 614715983 + (((~((-333778569) | i10)) | (-1377847722)) * 494)))) != 0) {
                            i8 = i;
                            objArr8 = new java.lang.Object[]{new int[]{i8}, new int[]{i8 ^ 80}, null, null, new int[1]};
                            java.lang.Object[] objArr29 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-505513488) | i10)) | (-524622458)) * (-983)) + 1318330370 + (((~((-524622458) | i10)) | 21239920) * 983))};
                            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r12);
                            java.lang.Object obj18 = obj17;
                            if (obj17 == null) {
                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                c((byte) 34, 653, $$a[41], objArr30);
                                java.lang.reflect.Method method8 = cls8.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r12, method8);
                                obj18 = method8;
                            }
                            c6 = 0;
                            ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr29)).intValue();
                        } else {
                            i8 = i;
                            objArr8 = new java.lang.Object[]{new int[]{i8}, new int[]{i8}, null, null, new int[1]};
                            java.lang.Object[] objArr31 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((~((-486542917) | i8)) * 623) + 814054620 + ((541348144 | i10) * (-623)) + (((~((-487665359) | i8)) | 486542916 | (~(542470586 | i8))) * 623))};
                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r12);
                            java.lang.Object obj20 = obj19;
                            if (obj19 == null) {
                                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777266, 2713 - (android.os.Process.myPid() >> 22), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                c((byte) 34, 653, $$a[41], objArr32);
                                java.lang.reflect.Method method9 = cls9.getMethod((java.lang.String) objArr32[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r12, method9);
                                obj20 = method9;
                            }
                            c6 = 0;
                            ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr31)).intValue();
                        }
                        if (((int[]) objArr8[1])[c6] != i8) {
                            return objArr8;
                        }
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        b(null, null, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 127, "\u0087\u0091\u0081\u008b\u0085\u0083\u0090\u008f\u0088\u0089\u0083\u008e\u0082\u0088\u0082\u008d\u0086\u008c\u0082\u008a\u0083\u0088\u008b\u008a\u0086\u0089\u0085\u0088\u0087\u0086\u0085\u0081\u0083\u0084\u0083\u0082\u0081\u0083\u0084\u0083\u0082\u0081", objArr33);
                        java.lang.Object[] objArr34 = {((java.lang.String) objArr33[c6]).intern()};
                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                        java.lang.Object obj22 = obj21;
                        if (obj21 == null) {
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.getCapsMode("", 0, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3160, (char) (33099 - android.view.View.combineMeasuredStates(0, 0)));
                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                            c(r3[22], androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, (byte) (-$$a[16]), objArr35);
                            java.lang.reflect.Method method10 = cls10.getMethod((java.lang.String) objArr35[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method10);
                            obj22 = method10;
                        }
                        long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr34)).longValue();
                        long j9 = ~longValue4;
                        long j10 = (((-317) * longValue4) - 192172331538L) + (((~(j | 602421101)) | j9) * (-318)) + (((~(j2 | (-602421102) | longValue4)) | (~(j9 | j))) * 318) + (((~(longValue4 | (-602421102) | j)) | (~(j9 | j2 | (-602421102)))) * 318) + 1597856005;
                        if (((((int) (j10 >> 32)) & (((((~((-107993282) | i)) | 103438529) * 345) - 484646000) + (((~((-107993282) | i10)) | 1225794600) * 345) + ((~((-103438530) | i)) * 345))) | (((int) j10) & (((655384 | i10) * 1324) + 818885255 + (((~(709599768 | i)) | (~((-2146826179) | i))) * (-1324)) + 1171127214))) != 0) {
                            java.lang.Object[] objArr36 = {new int[]{i}, new int[]{i ^ 90}, null, null, new int[1]};
                            java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-849441323) | i)) | 42017290) * 576) + 377319048) + (((~((-807424033) | i10)) | 138677332) * 576)) - 1567844736)};
                            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r12);
                            java.lang.Object obj24 = obj23;
                            if (obj23 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 50, 2713 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                c((byte) 34, 653, $$a[41], objArr38);
                                java.lang.reflect.Method method11 = cls11.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r12, method11);
                                obj24 = method11;
                            }
                            ((int[]) objArr36[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr37)).intValue();
                            return objArr36;
                        }
                        java.lang.Object[] objArr39 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                        java.lang.Object[] objArr40 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-737301357) | i)) | 24133900) * 104) + 1270180168 + ((~(1006002044 | i10)) * (-104)) + ((292834588 | i) * 104))};
                        java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r12);
                        java.lang.Object obj26 = obj25;
                        if (obj25 == null) {
                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49, 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) android.text.TextUtils.getOffsetAfter("", 0));
                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                            c((byte) 34, 653, $$a[41], objArr41);
                            java.lang.reflect.Method method12 = cls12.getMethod((java.lang.String) objArr41[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r12, method12);
                            obj26 = method12;
                        }
                        ((int[]) objArr39[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr40)).intValue();
                        return objArr39;
                    }
                    int i14 = i;
                    java.lang.Integer num2 = -604620973;
                    try {
                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                        b(null, null, 127 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\u0084\u0093\u008b\u0084\u008a\u0086\u0092\u0088\u0084\u008a\u008b\u0084\u008a\u0086\u0085\u0088\u0082\u008d\u0086\u008c\u0082\u008a\u0083", objArr42);
                        java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr42[0]).intern());
                        java.lang.Object[] objArr43 = new java.lang.Object[1];
                        a(new int[]{562896230, 2066826696, 718137416, -1349569149, -35989274, 2108814550, 1646951824, 558480296}, android.os.Process.getGidForName("") + 15, objArr43);
                        java.lang.String str10 = (java.lang.String) cls13.getMethod(((java.lang.String) objArr43[0]).intern(), null).invoke(context, null);
                        java.lang.Object[] objArr44 = new java.lang.Object[1];
                        b(null, null, android.view.KeyEvent.normalizeMetaState(0) + 127, "\u0084\u0093\u008b\u0084\u008a\u0086\u0092\u0088\u0084\u008a\u008b\u0084\u008a\u0086\u0085\u0088\u0082\u008d\u0086\u008c\u0082\u008a\u0083", objArr44);
                        java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr44[0]).intern());
                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                        a(new int[]{1941668085, 411331325, -1495059407, -754938798, 888835444, -2129657978, -1018128498, 1205621993, 1053245748, -2030911509}, android.view.KeyEvent.getDeadChar(0, 0) + 18, objArr45);
                        ?? invoke = cls14.getMethod(((java.lang.String) objArr45[0]).intern(), null).invoke(context, null);
                        int indexOf = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke)).indexOf(str10);
                        if (indexOf > 0) {
                            java.lang.String str11 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                            int i15 = 16;
                            if (str11.length() >= 16) {
                                int i16 = 0;
                                invoke = invoke;
                                r12 = r12;
                                while (i16 <= str11.length() - i15) {
                                    java.lang.Object[] objArr46 = {str11.substring(i16, i16 + 16), 931995};
                                    java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                    if (obj27 == null) {
                                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28, 2595 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                        byte[] bArr = $$a;
                                        byte b3 = bArr[41];
                                        str5 = str11;
                                        num = num2;
                                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                                        c(b3, b3, (byte) (-bArr[52]), objArr47);
                                        java.lang.reflect.Method method13 = cls15.getMethod((java.lang.String) objArr47[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method13);
                                        obj2 = method13;
                                    } else {
                                        num = num2;
                                        str5 = str11;
                                        obj2 = obj27;
                                    }
                                    long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr46)).longValue();
                                    int i17 = indexOf;
                                    long j11 = ~(i14 == true ? 1L : 0L);
                                    int i18 = i16;
                                    long j12 = j11 | 777115280;
                                    java.lang.String str12 = intern4;
                                    str4 = r12;
                                    long j13 = ~longValue5;
                                    long j14 = j11 | j13;
                                    java.lang.Object obj28 = invoke;
                                    java.lang.String str13 = intern3;
                                    r32 = ((-183) * longValue5) + 142212096423L + (((~(j12 | longValue5)) | (~(j14 | (-777115281)))) * (-184)) + (((~j14) | (~(777115280 | j13)) | (~j12)) * 184) + (((-777115281) | longValue5) * 184);
                                    long j15 = r32 + 2034215805;
                                    int i19 = ~(i14 == true ? 1 : 0);
                                    if (((((int) j15) & ((((~(3856165 | (i14 == true ? 1 : 0))) | 1430595712) * (-566)) + 826094933 + ((~(1434451877 | (i14 == true ? 1 : 0))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))) | (((int) (j15 >> 32)) & ((((~((-897305611) | (i14 == true ? 1 : 0))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 855000150) + (((-19005441) | i19) * (-216)) + (((~((-897305611) | i19)) | (-1960435275)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE)))) == -725904754) {
                                        objArr = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                        java.lang.String str14 = (java.lang.String) java.lang.Class.forName(intern2).getField(str13).get(obj28);
                                        ((int[]) objArr[0])[0] = i14 == true ? 1 : 0;
                                        ((int[]) objArr[1])[0] = (i14 == true ? 1 : 0) ^ 20;
                                        java.lang.Object[] objArr48 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-227090707) | i19)) | (~((-34882593) | (i14 == true ? 1 : 0))) | (~((-541071941) | (i14 == true ? 1 : 0)))) * 765) + 409043894 + (((~((-261973299) | i19)) | 227090706) * 1530) + (((~(i19 | (-541071941))) | (~((-261973299) | (i14 == true ? 1 : 0)))) * 765))};
                                        java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str4);
                                        java.lang.Object obj30 = obj29;
                                        if (obj29 == null) {
                                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2713, (char) ((-1) - android.os.Process.getGidForName("")));
                                            java.lang.Object[] objArr49 = new java.lang.Object[1];
                                            c((byte) 34, 653, $$a[41], objArr49);
                                            java.lang.reflect.Method method14 = cls16.getMethod((java.lang.String) objArr49[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str4, method14);
                                            obj30 = method14;
                                        }
                                        ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr48)).intValue();
                                        str9 = str4;
                                        i4 = i14 == true ? 1 : 0;
                                        str = str9;
                                        i5 = 1;
                                        c = 0;
                                        if (((int[]) objArr[i5])[c] != i4) {
                                            return objArr;
                                        }
                                        int[] iArr = new int[i5];
                                        int[] iArr2 = new int[i5];
                                        iArr[c] = i4;
                                        iArr2[c] = i4;
                                        java.lang.Object[] objArr50 = {iArr, iArr2, null, null, new int[i5]};
                                        int i20 = ~i4;
                                        java.lang.Object[] objArr51 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-677428029) | i4)) | 41228) * 336) - 234010808) + (((~(352707916 | i4)) | (-1030094717)) * (-168)) + (((~(352707916 | i20)) | (-677428029)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str);
                                        java.lang.Object obj32 = obj31;
                                        if (obj31 == null) {
                                            java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 50, android.view.View.getDefaultSize(0, 0) + 2713, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                            java.lang.Object[] objArr52 = new java.lang.Object[1];
                                            c((byte) 34, 653, $$a[41], objArr52);
                                            java.lang.reflect.Method method15 = cls17.getMethod((java.lang.String) objArr52[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str, method15);
                                            obj32 = method15;
                                        }
                                        ((int[]) objArr50[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr51)).intValue();
                                        if (((int[]) objArr50[1])[0] != i4) {
                                            return objArr50;
                                        }
                                        if ((i2 & 1) == 0) {
                                            java.lang.Object[] objArr53 = new java.lang.Object[1];
                                            b(null, null, 127 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), "\u009e\u0085\u008d\u0089\u0086\u0090\u009d\u008b\u0085\u008d\u0091\u008b\u0082", objArr53);
                                            try {
                                                java.lang.Object[] objArr54 = {((java.lang.String) objArr53[0]).intern()};
                                                java.lang.Object[] objArr55 = new java.lang.Object[1];
                                                b(null, null, 127 - android.text.TextUtils.indexOf("", "", 0, 0), "\u0084\u0093\u008b\u0084\u008a\u0086\u0092\u0088\u0084\u008a\u008b\u0084\u008a\u0086\u0085\u0088\u0082\u008d\u0086\u008c\u0082\u008a\u0083", objArr55);
                                                java.lang.Class<?> cls18 = java.lang.Class.forName(((java.lang.String) objArr55[0]).intern());
                                                java.lang.Object[] objArr56 = new java.lang.Object[1];
                                                a(new int[]{356327477, -1554725538, -114849159, 1635784077, -1876139934, -1065846564, -2100399428, -187371364}, android.text.TextUtils.getOffsetAfter("", 0) + 16, objArr56);
                                                java.lang.Object invoke2 = cls18.getMethod(((java.lang.String) objArr56[0]).intern(), java.lang.String.class).invoke(context, objArr54);
                                                if (invoke2 != null) {
                                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                    b(null, null, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u008c\u008b\u0097\u0083\u008a\u0083 \u009e\u0085\u008d\u0089\u0086\u009f\u008b\u0085\u008d\u0091\u008b\u0094\u0088\u008a\u008d\u0087\u0082\u0083\u0088\u0090\u0090\u0083\u0088\u0082\u008d\u0086\u008c\u0082\u008a\u0083", objArr57);
                                                    java.lang.Class<?> cls19 = java.lang.Class.forName(((java.lang.String) objArr57[0]).intern());
                                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                    b(null, null, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u008f\u008a\u008d\u0087\u0082¡\u008b\u0091\u008d\u0084\u0085¡\u0084\u008b\u0097", objArr58);
                                                    java.util.List list = (java.util.List) cls19.getMethod(((java.lang.String) objArr58[0]).intern(), null).invoke(invoke2, null);
                                                    if (list != null) {
                                                        java.util.Iterator it = list.iterator();
                                                        while (it.hasNext()) {
                                                            java.lang.Object next = it.next();
                                                            java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                            b(null, null, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, "\u008b\u0087\u0083¢\u0084\u008a\u008b\u008a\u0086\u0090\u0087\u0086\u0092\u0088\u0084\u008a\u008b\u0084\u008a\u0086\u0085\u0088\u0082\u008d\u0086\u008c\u0082\u008a\u0083", objArr59);
                                                            java.lang.Class<?> cls20 = java.lang.Class.forName(((java.lang.String) objArr59[0]).intern());
                                                            java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                            a(new int[]{562896230, 2066826696, 718137416, -1349569149, -35989274, 2108814550, 1646951824, 558480296}, 14 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr60);
                                                            java.lang.String str15 = (java.lang.String) cls20.getMethod(((java.lang.String) objArr60[0]).intern(), null).invoke(next, null);
                                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                            b(null, null, 126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u008c\u008b\u0097\u0083\u008a\u0083 \u009e\u0085\u008d\u0089\u0086\u009f\u008b\u0085\u008d\u0091\u008b\u0094\u0088\u008a\u008d\u0087\u0082\u0083\u0088\u0090\u0090\u0083\u0088\u0082\u008d\u0086\u008c\u0082\u008a\u0083", objArr61);
                                                            java.lang.Class<?> cls21 = java.lang.Class.forName(((java.lang.String) objArr61[0]).intern());
                                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                            a(new int[]{1028630969, -1183265902, -1092333255, -1441901106, 1823804361, -1936608188, -1623419839, 675139060, 1217018004, -620591619}, 17 - android.view.KeyEvent.getDeadChar(0, 0), objArr62);
                                                            if (((java.lang.Boolean) cls21.getMethod(((java.lang.String) objArr62[0]).intern(), java.lang.String.class).invoke(invoke2, str15)).booleanValue()) {
                                                                if (str15.length() >= 20) {
                                                                    int i21 = 0;
                                                                    for (int i22 = 20; i21 <= str15.length() - i22; i22 = 20) {
                                                                        java.lang.Object[] objArr63 = {str15.substring(i21, i21 + 20), 931995};
                                                                        java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                        java.lang.Object obj34 = obj33;
                                                                        if (obj33 == null) {
                                                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 2594 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                                                                            byte[] bArr2 = $$a;
                                                                            byte b4 = bArr2[41];
                                                                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                                            c(b4, b4, (byte) (-bArr2[52]), objArr64);
                                                                            java.lang.reflect.Method method16 = cls22.getMethod((java.lang.String) objArr64[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method16);
                                                                            obj34 = method16;
                                                                        }
                                                                        long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, objArr63)).longValue();
                                                                        long j16 = ~longValue6;
                                                                        long j17 = i4;
                                                                        java.util.Iterator it2 = it;
                                                                        java.lang.String str16 = str15;
                                                                        long j18 = ~j17;
                                                                        java.lang.String str17 = str;
                                                                        long j19 = (longValue6 * (-864)) + 689483034676L + (((~(j18 | (-796169787))) | j16) * (-865)) + ((~(796169786 | j17)) * 865) + (((~(j18 | 796169786)) | (~(j16 | j18))) * 865) + 460930738;
                                                                        if (((((int) (j19 >> 32)) & ((((((~(1509480340 | i20)) | 67502185) | (~((-1504728597) | i4))) * 717) - 605166110) + (((~(1509480340 | i4)) | (~((-1504728597) | i20)) | 67502185) * 717))) | (((int) j19) & ((((~((-1249204611) | i4)) | 1247826050) * 1504) + 1320243365 + ((~((-1378561) | i4)) * (-1504)) + 1707826672))) == 1245577864) {
                                                                            objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 70}, null, null, new int[1]};
                                                                            java.lang.Object[] objArr65 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1006768215) | i20)) * 433) - 527059662) + (((~((-12355626) | i4)) | (-1017780320)) * (-433)) + (((~((-1017780320) | i4)) | (-1019123840)) * 433))};
                                                                            str2 = str17;
                                                                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                                            java.lang.Object obj36 = obj35;
                                                                            if (obj35 == null) {
                                                                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 50, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2713, (char) android.graphics.Color.blue(0));
                                                                                java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                                                c((byte) 34, 653, $$a[41], objArr66);
                                                                                java.lang.reflect.Method method17 = cls23.getMethod((java.lang.String) objArr66[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method17);
                                                                                obj36 = method17;
                                                                            }
                                                                            c4 = 0;
                                                                            ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr65)).intValue();
                                                                            if (((int[]) objArr5[1])[c4] != i4) {
                                                                                return objArr5;
                                                                            }
                                                                        } else {
                                                                            i21++;
                                                                            it = it2;
                                                                            str15 = str16;
                                                                            str = str17;
                                                                        }
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                            }
                                                            it = it;
                                                            str = str;
                                                        }
                                                    }
                                                }
                                                str2 = str;
                                                java.lang.Object[] objArr67 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                                java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(310484907 | i4)) | 677642324) * (-140)) - 393006028) + ((~(988127231 | i4)) * 70) + (((~(719651037 | i4)) | 946118518) * 70))};
                                                java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                java.lang.Object obj38 = obj37;
                                                if (obj37 == null) {
                                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 50, 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                    java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                    c((byte) 34, 653, $$a[41], objArr69);
                                                    java.lang.reflect.Method method18 = cls24.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method18);
                                                    obj38 = method18;
                                                }
                                                c4 = 0;
                                                ((int[]) objArr67[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr68)).intValue();
                                                objArr5 = objArr67;
                                                if (((int[]) objArr5[1])[c4] != i4) {
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause2 = th4.getCause();
                                                if (cause2 != null) {
                                                    throw cause2;
                                                }
                                                throw th4;
                                            }
                                        } else {
                                            str2 = str;
                                        }
                                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                                        a(new int[]{-942955041, 1955919128, -1116955957, 152831140, 50898810, -2108790204}, 12 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr70);
                                        java.lang.Object[] objArr71 = {((java.lang.String) objArr70[0]).intern()};
                                        java.lang.Integer num3 = num;
                                        java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                        java.lang.Object obj40 = obj39;
                                        if (obj39 == null) {
                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35, 3160 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 33099));
                                            byte b5 = $$a[41];
                                            java.lang.Object[] objArr72 = new java.lang.Object[1];
                                            c(b5, (short) (b5 | 618), b5, objArr72);
                                            java.lang.reflect.Method method19 = cls25.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, method19);
                                            obj40 = method19;
                                        }
                                        long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj40).invoke(null, objArr71)).longValue();
                                        long j20 = ~longValue7;
                                        long j21 = i4;
                                        long j22 = ~j21;
                                        long j23 = (longValue7 * 949) + 202178311355L + (((~(j20 | j21)) | 213493464) * (-948)) + ((~(213493464 | j20 | j22)) * (-948)) + (((-213493465) | j20) * 948) + 1120964203;
                                        int i23 = (int) (j23 >> 32);
                                        int i24 = ~(2123790278 | i4);
                                        if (((i23 & ((((~(2123790278 | i20)) | 19464200) * (-245)) + 228923154 + (i24 * (-245)) + ((i24 | (-733950607)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))) | (((int) j23) & (((((~((-449003323) | i20)) | (~(1886229732 | i4))) * (-370)) - 635053777) + (((~((-449003323) | i4)) | (~(1886229732 | i20)) | 1613529284) * (-370)) + 5380936))) != 0) {
                                            objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 50}, null, null, new int[1]};
                                            java.lang.Object[] objArr73 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((~(i20 | (-5129))) * (-783)) + 839890703 + (((~(794512256 | i20)) | (-235623689)) * 783))};
                                            java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                            java.lang.Object obj42 = obj41;
                                            if (obj41 == null) {
                                                java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 50, 2713 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                c((byte) 34, 653, $$a[41], objArr74);
                                                java.lang.reflect.Method method20 = cls26.getMethod((java.lang.String) objArr74[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method20);
                                                obj42 = method20;
                                            }
                                            c2 = 0;
                                            ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr73)).intValue();
                                        } else {
                                            objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                            java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((~((-671481857) | i20)) * 130) + 940228600 + (((~((-671481857) | i4)) | 353394248) * 130))};
                                            java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                            java.lang.Object obj44 = obj43;
                                            if (obj43 == null) {
                                                java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                c((byte) 34, 653, $$a[41], objArr76);
                                                java.lang.reflect.Method method21 = cls27.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method21);
                                                obj44 = method21;
                                            }
                                            c2 = 0;
                                            ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr75)).intValue();
                                        }
                                        if (((int[]) objArr2[1])[c2] != i4) {
                                            return objArr2;
                                        }
                                        java.lang.Object[] objArr77 = new java.lang.Object[1];
                                        a(new int[]{1318886922, 1038232776, -763876199, -1366629302, 208327035, 2092638068, 710590768, 1425279505, -900191095, -325254562}, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 20, objArr77);
                                        java.lang.Object[] objArr78 = {((java.lang.String) objArr77[c2]).intern()};
                                        java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                        java.lang.Object obj46 = obj45;
                                        if (obj45 == null) {
                                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 36, 3161 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 33098));
                                            byte b6 = $$a[41];
                                            java.lang.Object[] objArr79 = new java.lang.Object[1];
                                            c(b6, (short) (b6 | 618), b6, objArr79);
                                            java.lang.reflect.Method method22 = cls28.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, method22);
                                            obj46 = method22;
                                        }
                                        long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj46).invoke(null, objArr78)).longValue();
                                        long j24 = ~longValue8;
                                        long j25 = (367 * longValue8) + 257650865852L + ((longValue8 | 702045956) * (-366)) + (((~(j24 | j21)) | 702045956) * (-366)) + (((~(longValue8 | (-702045957))) | (~(j24 | 702045956 | j21))) * 366) + 205424782;
                                        int i25 = 1109623732 | i20;
                                        if (((((int) (j25 >> 32)) & ((i25 * 495) + 1926335629 + (((~i25) | 33718708) * 495))) | (((int) j25) & (((631523733 | i4) * 614) + 204981683 + (((~(948112906 | i20)) | 86262165 | (~((-489113504) | i20))) * (-1228)) + (((~(1034375071 | i20)) | (~((-402851339) | i20))) * 614)))) != 0) {
                                            objArr3 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 60}, null, null, new int[1]};
                                            java.lang.Object[] objArr80 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-447619253) | i4)) | 44572820 | (~(985563124 | i20))) * 886) + 1003897088 + (((~(447619252 | i20)) | 582516692) * (-1772)) + ((~(582516692 | i20)) * 886))};
                                            java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                            java.lang.Object obj48 = obj47;
                                            if (obj47 == null) {
                                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 2713 - android.graphics.Color.alpha(0), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                c((byte) 34, 653, $$a[41], objArr81);
                                                java.lang.reflect.Method method23 = cls29.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method23);
                                                obj48 = method23;
                                            }
                                            i6 = 0;
                                            ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj48).invoke(null, objArr80)).intValue();
                                        } else {
                                            objArr3 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                            java.lang.Object[] objArr82 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((((~((-826296865) | i20)) | (-203839081)) | (~(826296864 | i4))) * (-564)) - 90992152) + ((~((-203822153) | i4)) * 1128) + (((~((-203839081) | i20)) | (-1030119017)) * 564))};
                                            java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                            java.lang.Object obj50 = obj49;
                                            if (obj49 == null) {
                                                java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 50, android.graphics.Color.blue(0) + 2713, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                c((byte) 34, 653, $$a[41], objArr83);
                                                java.lang.reflect.Method method24 = cls30.getMethod((java.lang.String) objArr83[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, method24);
                                                obj50 = method24;
                                            }
                                            i6 = 0;
                                            ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr82)).intValue();
                                        }
                                        if (((int[]) objArr3[1])[i6] != i4) {
                                            return objArr3;
                                        }
                                        java.lang.Object[] objArr84 = new java.lang.Object[1];
                                        a(new int[]{-700476784, -25584781, 325245096, -1267439558, -1933489574, 1546509661, 2124796677, -1089595755, -919277047, -2107917099, -242452423, -1320741518, -1552984452, -1208837573, -928394196, -1453786290, -1124478949, -1318538710}, 35 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i6, i6), objArr84);
                                        java.lang.Object[] objArr85 = {((java.lang.String) objArr84[i6]).intern()};
                                        java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                        java.lang.Object obj52 = obj51;
                                        if (obj51 == null) {
                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 3161, (char) (33100 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                            java.lang.Object[] objArr86 = new java.lang.Object[1];
                                            c(r4[22], androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, (byte) (-$$a[16]), objArr86);
                                            java.lang.reflect.Method method25 = cls31.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method25);
                                            obj52 = method25;
                                        }
                                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj52).invoke(null, objArr85)).longValue();
                                        long j26 = ~longValue9;
                                        java.lang.String str18 = str2;
                                        long j27 = (((-958) * longValue9) - 356230019960L) + (((~(j21 | (-371847621))) | (~(j26 | j22)) | (~(j22 | 371847620))) * 959) + ((~(longValue9 | 371847620)) * (-959)) + (((~(j22 | (-371847621))) | (~(j26 | j21)) | (~(371847620 | j21))) * 959) + 623587283;
                                        if (((((int) (j27 >> 32)) & ((((~((-470303114) | i20)) | (~((-966923298) | i20))) * (-867)) + 1972008040 + (((~((-470303114) | i4)) | 402653185 | (~((-966923298) | i4))) * (-1734)) + (((~((-402653186) | i20)) | (~((-67649929) | i4)) | (~((-564270113) | i4))) * 867))) | (((int) j27) & (((~((-195523376) | i20)) * (-560)) + 1112684101 + ((~((-27595014) | i4)) * (-560)) + (((~((-1241703035) | i20)) | 1073774672) * 560)))) != 0) {
                                            objArr4 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 80}, null, null, new int[1]};
                                            java.lang.Object[] objArr87 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((1027603582 | i20) * (-369)) - 1101790064) + (((~((-960427119) | i20)) | 69708826) * (-369)) + (((~(960427118 | i4)) | 67176464 | (~((-957894757) | i20))) * 369))};
                                            str3 = str18;
                                            java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str3);
                                            java.lang.Object obj54 = obj53;
                                            if (obj53 == null) {
                                                java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2712 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                c((byte) 34, 653, $$a[41], objArr88);
                                                java.lang.reflect.Method method26 = cls32.getMethod((java.lang.String) objArr88[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str3, method26);
                                                obj54 = method26;
                                            }
                                            c3 = 0;
                                            ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj54).invoke(null, objArr87)).intValue();
                                        } else {
                                            str3 = str18;
                                            objArr4 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                            java.lang.Object[] objArr89 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((542547568 | i4) * 614) - 317112408) + (((~((-248158557) | i20)) | 4364368 | (~(781977388 | i20))) * (-1228)) + (((~((-243794189) | i20)) | (~(786341756 | i20))) * 614))};
                                            java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str3);
                                            java.lang.Object obj56 = obj55;
                                            if (obj55 == null) {
                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 50, 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                                java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                c((byte) 34, 653, $$a[41], objArr90);
                                                java.lang.reflect.Method method27 = cls33.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str3, method27);
                                                obj56 = method27;
                                            }
                                            c3 = 0;
                                            ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr89)).intValue();
                                        }
                                        if (((int[]) objArr4[1])[c3] != i4) {
                                            return objArr4;
                                        }
                                        java.lang.Object[] objArr91 = new java.lang.Object[1];
                                        b(null, null, 127 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u0087\u0091\u0081\u008b\u0085\u0083\u0090\u008f\u0088\u0089\u0083\u008e\u0082\u0088\u0082\u008d\u0086\u008c\u0082\u008a\u0083\u0088\u008b\u008a\u0086\u0089\u0085\u0088\u0087\u0086\u0085\u0081\u0083\u0084\u0083\u0082\u0081\u0083\u0084\u0083\u0082\u0081", objArr91);
                                        java.lang.Object[] objArr92 = {((java.lang.String) objArr91[c3]).intern()};
                                        java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                        java.lang.Object obj58 = obj57;
                                        if (obj57 == null) {
                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.getTrimmedLength(""), 3161 - android.view.KeyEvent.keyCodeFromString(""), (char) (33099 - android.text.TextUtils.getOffsetBefore("", 0)));
                                            java.lang.Object[] objArr93 = new java.lang.Object[1];
                                            c(r4[22], androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, (byte) (-$$a[16]), objArr93);
                                            java.lang.reflect.Method method28 = cls34.getMethod((java.lang.String) objArr93[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method28);
                                            obj58 = method28;
                                        }
                                        long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj58).invoke(null, objArr92)).longValue();
                                        long j28 = (334 * longValue10) + 99658694945L + (((~(j22 | 300176790)) | (~(longValue10 | j21))) * 333) + (((~(j22 | longValue10)) | (~(300176790 | j21))) * 333) + 1295611694;
                                        if (((((int) (j28 >> 32)) & (((((~((-224203390) | i4)) | (-1661429801)) * (-668)) - 1408299302) + (((~((-1661429801) | i4)) | (-224203390)) * 1336) + (((-17104937) | i4) * 668))) | (((int) j28) & ((((-27328513) | i20) * 494) + 1457197911 + (((~((-195273395) | i20)) | (-1101336646)) * 494)))) != 0) {
                                            java.lang.Object[] objArr94 = {new int[]{i4}, new int[]{i4 ^ 90}, null, null, new int[1]};
                                            java.lang.Object[] objArr95 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-25206922) | i4)) | (~((-943789335) | i20))) * 497) - 203382151) + (((~(i20 | (-61139690))) | 35932768 | (~((-943789335) | i4))) * 497))};
                                            java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str3);
                                            java.lang.Object obj60 = obj59;
                                            if (obj59 == null) {
                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2712, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                c((byte) 34, 653, $$a[41], objArr96);
                                                java.lang.reflect.Method method29 = cls35.getMethod((java.lang.String) objArr96[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str3, method29);
                                                obj60 = method29;
                                            }
                                            ((int[]) objArr94[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj60).invoke(null, objArr95)).intValue();
                                            return objArr94;
                                        }
                                        java.lang.Object[] objArr97 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                        java.lang.Object[] objArr98 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-25167891) | i4)) | (~(i20 | 1004968054))) * (-318)) - 1025155648) + (((~(734398546 | i4)) | 270569508) * (-318)) + (((~((-734398547) | i4)) | (-295737399)) * 318))};
                                        java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str3);
                                        java.lang.Object obj62 = obj61;
                                        if (obj61 == null) {
                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                            java.lang.Object[] objArr99 = new java.lang.Object[1];
                                            c((byte) 34, 653, $$a[41], objArr99);
                                            java.lang.reflect.Method method30 = cls36.getMethod((java.lang.String) objArr99[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str3, method30);
                                            obj62 = method30;
                                        }
                                        ((int[]) objArr97[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj62).invoke(null, objArr98)).intValue();
                                        return objArr97;
                                    }
                                    int i26 = i18 + 1;
                                    r12 = str4;
                                    intern3 = str13;
                                    invoke = obj28;
                                    intern4 = str12;
                                    str11 = str5;
                                    num2 = num;
                                    indexOf = i17;
                                    i15 = 16;
                                    i16 = i26;
                                }
                            }
                            int i27 = indexOf;
                            java.lang.String str19 = invoke;
                            num = num2;
                            java.lang.String str20 = intern3;
                            java.lang.String str21 = intern4;
                            java.lang.String str22 = r12;
                            java.lang.String str23 = (java.lang.String) java.lang.Class.forName(intern2).getField(str20).get(str19);
                            int i28 = 6;
                            if (str23.length() >= 6) {
                                int i29 = 0;
                                str5 = str5;
                                r32 = r32;
                                while (i29 <= str23.length() - i28) {
                                    java.lang.Object[] objArr100 = {str23.substring(i29, i29 + 6), 931995};
                                    java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                    java.lang.Object obj64 = obj63;
                                    if (obj63 == null) {
                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 28, android.view.KeyEvent.normalizeMetaState(0) + 2594, (char) android.view.View.resolveSize(0, 0));
                                        byte[] bArr3 = $$a;
                                        byte b7 = bArr3[41];
                                        java.lang.Object[] objArr101 = new java.lang.Object[1];
                                        c(b7, b7, (byte) (-bArr3[52]), objArr101);
                                        java.lang.reflect.Method method31 = cls37.getMethod((java.lang.String) objArr101[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method31);
                                        obj64 = method31;
                                    }
                                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj64).invoke(null, objArr100)).longValue();
                                    long j29 = i14 == true ? 1L : 0L;
                                    java.lang.String str24 = str21;
                                    long j30 = ~j29;
                                    java.lang.String str25 = str23;
                                    ?? r28 = i29;
                                    str4 = str22;
                                    long j31 = ((334 * longValue11) - 191667938243L) + (((~(j30 | (-577313069))) | (~(longValue11 | j29))) * 333) + (((~((-577313069) | j29)) | (~(j30 | longValue11))) * 333);
                                    long j32 = j31 + 679787456;
                                    int i30 = ~(i14 == true ? 1 : 0);
                                    if (((((int) j32) & ((((~((-1411938934) | i30)) | (-1445801953)) * (-983)) + 25866974 + (((~((-1445801953) | i30)) | 33883520) * 983))) | (((int) (j32 >> 32)) & ((((~(834762982 | (i14 == true ? 1 : 0))) | 2022977902) * (-318)) + 1332448922 + (((~(2022977902 | (i14 == true ? 1 : 0))) | (~((-813707367) | i30))) * 318) + (((~((-21055617) | i30)) | (~((-813707367) | (i14 == true ? 1 : 0)))) * 318)))) == -2096167706) {
                                        objArr = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                        java.lang.String str26 = (java.lang.String) java.lang.Class.forName(intern2).getField(str20).get(str19);
                                        ((int[]) objArr[0])[0] = i14 == true ? 1 : 0;
                                        ((int[]) objArr[1])[0] = (i14 == true ? 1 : 0) ^ 20;
                                        java.lang.Object[] objArr102 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-338098958) | i30)) | 692036987) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1034474288) + (((~(i30 | (-335567365))) | (~(1027604351 | (i14 == true ? 1 : 0)))) * (-519)) + (((~(692036987 | (i14 == true ? 1 : 0))) | 338098957) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                                        str9 = str4;
                                        java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str9);
                                        java.lang.Object obj66 = obj65;
                                        if (obj65 == null) {
                                            java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 51, 2713 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                            java.lang.Object[] objArr103 = new java.lang.Object[1];
                                            c((byte) 34, 653, $$a[41], objArr103);
                                            java.lang.reflect.Method method32 = cls38.getMethod((java.lang.String) objArr103[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str9, method32);
                                            obj66 = method32;
                                        }
                                        ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj66).invoke(null, objArr102)).intValue();
                                        i4 = i14 == true ? 1 : 0;
                                        str = str9;
                                        i5 = 1;
                                        c = 0;
                                        if (((int[]) objArr[i5])[c] != i4) {
                                        }
                                    } else {
                                        i29 = r28 + 1;
                                        str23 = str25;
                                        str22 = str4;
                                        str21 = str24;
                                        i28 = 6;
                                        str5 = r28;
                                        r32 = j31;
                                    }
                                }
                            }
                            java.lang.String str27 = str22;
                            java.lang.String str28 = str21;
                            int i31 = 0;
                            java.lang.String substring = ((java.lang.String) java.lang.Class.forName(intern2).getField(str20).get(str19)).substring(0, i27);
                            java.lang.Object[] objArr104 = new java.lang.Object[1];
                            a(new int[]{1109560587, 1142632820}, 1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr104);
                            ?? split = substring.split(((java.lang.String) objArr104[0]).intern());
                            int i32 = 0;
                            ?? r3 = split.length;
                            ?? r5 = i14;
                            java.lang.String str29 = str5;
                            int i33 = r32;
                            while (i32 < r3) {
                                ?? r6 = split[i32];
                                ?? r15 = new java.lang.Object[1];
                                a(new int[]{42943639, -222131600}, (android.widget.ExpandableListView.getPackedPositionForGroup(i31) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i31) == 0L ? 0 : -1)) + 3, r15);
                                if (r6.split(((java.lang.String) r15[i31]).intern()).length > 1) {
                                    synchronized (((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1581, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6)))) {
                                        try {
                                            try {
                                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                b(null, null, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, "\u008f\u008b\u0097\u0083\u0096\u0085\u0083\u0090\u0095\u0084\u008f\u008d\u0089\u0095\u0087\u0090", objArr105);
                                                intern = ((java.lang.String) objArr105[0]).intern();
                                                try {
                                                    runtime = java.lang.Runtime.getRuntime();
                                                    str29 = split;
                                                } catch (java.lang.Exception unused) {
                                                }
                                            } catch (java.io.IOException unused2) {
                                            }
                                        } catch (java.io.IOException unused3) {
                                            str29 = split;
                                        }
                                        try {
                                            try {
                                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                a(new int[]{1397063569, 534754463}, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2, objArr106);
                                                exec = runtime.exec(((java.lang.String) objArr106[0]).intern(), (java.lang.String[]) null, (java.io.File) null);
                                                try {
                                                    java.lang.Object[] objArr107 = {exec.getInputStream()};
                                                    java.lang.Object obj67 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                    if (obj67 == null) {
                                                        try {
                                                            str4 = r3;
                                                            i33 = i32;
                                                            try {
                                                                java.lang.reflect.Constructor declaredConstructor = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 45, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1507, (char) android.text.TextUtils.indexOf("", "", 0, 0))).getDeclaredConstructor(java.io.InputStream.class);
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
                                                        str4 = r3;
                                                        i33 = i32;
                                                        obj = obj67;
                                                    }
                                                    try {
                                                        newInstance = ((java.lang.reflect.Constructor) obj).newInstance(objArr107);
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
                                            try {
                                                try {
                                                    java.lang.Object[] objArr108 = {exec.getErrorStream()};
                                                    java.lang.Object obj68 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                    java.lang.Object obj69 = obj68;
                                                    if (obj68 == null) {
                                                        try {
                                                            java.lang.reflect.Constructor declaredConstructor2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1506, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1))).getDeclaredConstructor(java.io.InputStream.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor2);
                                                            obj69 = declaredConstructor2;
                                                        } catch (java.lang.Throwable th9) {
                                                            th2 = th9;
                                                            java.lang.Throwable cause3 = th2.getCause();
                                                            if (cause3 != null) {
                                                                throw cause3;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    java.lang.Object newInstance2 = ((java.lang.reflect.Constructor) obj69).newInstance(objArr108);
                                                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                                    try {
                                                        java.lang.Class<?> cls39 = java.lang.Class.forName(str28);
                                                        java.lang.String str30 = str27;
                                                        try {
                                                            java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                            a(new int[]{251858497, 2126782087, 1987432575, 1098196396}, android.graphics.Color.argb(0, 0, 0, 0) + 5, objArr109);
                                                            cls39.getMethod(((java.lang.String) objArr109[0]).intern(), null).invoke(newInstance, null);
                                                            try {
                                                                java.lang.Class<?> cls40 = java.lang.Class.forName(str28);
                                                                java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                a(new int[]{251858497, 2126782087, 1987432575, 1098196396}, 5 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr110);
                                                                cls40.getMethod(((java.lang.String) objArr110[0]).intern(), null).invoke(newInstance2, null);
                                                                try {
                                                                    try {
                                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                        sb.append(intern);
                                                                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                        a(new int[]{232604734, 272089301}, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr111);
                                                                        sb.append(((java.lang.String) objArr111[0]).intern());
                                                                        java.lang.String obj70 = sb.toString();
                                                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                        a(new int[]{380358065, 343736346, -2116440258, 960814733}, 5 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr112);
                                                                        dataOutputStream.write(obj70.getBytes(((java.lang.String) objArr112[0]).intern()));
                                                                        dataOutputStream.flush();
                                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                        a(new int[]{-1813367960, -2099165302, 232604734, 272089301}, 6 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr113);
                                                                        java.lang.String intern5 = ((java.lang.String) objArr113[0]).intern();
                                                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                        a(new int[]{380358065, 343736346, -2116440258, 960814733}, 5 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr114);
                                                                        dataOutputStream.write(intern5.getBytes(((java.lang.String) objArr114[0]).intern()));
                                                                        dataOutputStream.flush();
                                                                        try {
                                                                            long nanoTime = java.lang.System.nanoTime();
                                                                            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                            while (true) {
                                                                                try {
                                                                                    exec.exitValue();
                                                                                    str6 = str20;
                                                                                    r5 = intern2;
                                                                                    str8 = str19;
                                                                                    break;
                                                                                } catch (java.lang.IllegalThreadStateException unused5) {
                                                                                    if (nanos > 0) {
                                                                                        try {
                                                                                            str6 = str20;
                                                                                            str7 = intern2;
                                                                                            try {
                                                                                                try {
                                                                                                    java.lang.Object[] objArr115 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                    java.lang.Class<?> cls41 = java.lang.Class.forName(str28);
                                                                                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                                                    str8 = str19;
                                                                                                    try {
                                                                                                        b(null, null, 127 - (android.view.KeyEvent.getMaxKeyCode() >> 16), "\u0090\u008b\u008b\u0089\u008f", objArr116);
                                                                                                        cls41.getMethod(((java.lang.String) objArr116[0]).intern(), java.lang.Long.TYPE).invoke(null, objArr115);
                                                                                                    } catch (java.lang.Throwable th10) {
                                                                                                        th = th10;
                                                                                                        java.lang.Throwable th11 = th;
                                                                                                        java.lang.Throwable cause4 = th11.getCause();
                                                                                                        if (cause4 != null) {
                                                                                                            throw cause4;
                                                                                                        }
                                                                                                        throw th11;
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th12) {
                                                                                                    th = th12;
                                                                                                }
                                                                                            } catch (java.lang.InterruptedException e) {
                                                                                                e = e;
                                                                                                str8 = str19;
                                                                                                throw e;
                                                                                            } catch (java.lang.Throwable th13) {
                                                                                                th = th13;
                                                                                                str8 = str19;
                                                                                                th3 = th;
                                                                                                try {
                                                                                                    exec.destroy();
                                                                                                    throw th3;
                                                                                                } catch (java.lang.Exception unused6) {
                                                                                                    throw th3;
                                                                                                }
                                                                                            }
                                                                                        } catch (java.lang.InterruptedException e2) {
                                                                                            throw e2;
                                                                                        } catch (java.lang.Throwable th14) {
                                                                                            th3 = th14;
                                                                                            exec.destroy();
                                                                                            throw th3;
                                                                                        }
                                                                                    } else {
                                                                                        str6 = str20;
                                                                                        str7 = intern2;
                                                                                        str8 = str19;
                                                                                    }
                                                                                    try {
                                                                                        nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                                        r5 = str7;
                                                                                        if (nanos > 0) {
                                                                                            intern2 = str7;
                                                                                            str19 = str8;
                                                                                            str20 = str6;
                                                                                        }
                                                                                    } catch (java.lang.InterruptedException e3) {
                                                                                        e = e3;
                                                                                        throw e;
                                                                                    } catch (java.lang.Throwable th15) {
                                                                                        th = th15;
                                                                                        th3 = th;
                                                                                        exec.destroy();
                                                                                        throw th3;
                                                                                    }
                                                                                } catch (java.lang.InterruptedException e4) {
                                                                                    throw e4;
                                                                                } catch (java.lang.Throwable th16) {
                                                                                    th3 = th16;
                                                                                    exec.destroy();
                                                                                    throw th3;
                                                                                }
                                                                            }
                                                                        } catch (java.lang.InterruptedException e5) {
                                                                            e = e5;
                                                                        } catch (java.lang.Throwable th17) {
                                                                            th = th17;
                                                                        }
                                                                    } catch (java.lang.Throwable th18) {
                                                                        th = th18;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            dataOutputStream.close();
                                                                        } catch (java.io.IOException unused7) {
                                                                        }
                                                                        try {
                                                                            try {
                                                                                java.lang.Class<?> cls42 = java.lang.Class.forName(str28);
                                                                                java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                                b(null, null, 127 - android.graphics.Color.argb(0, 0, 0, 0), "\u008a\u008d\u0086\u0098", objArr117);
                                                                                cls42.getMethod(((java.lang.String) objArr117[0]).intern(), java.lang.Long.TYPE).invoke(newInstance, 100L);
                                                                                try {
                                                                                    java.lang.Class<?> cls43 = java.lang.Class.forName(str28);
                                                                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                                    b(null, null, android.graphics.Color.alpha(0) + 127, "\u008a\u008d\u0086\u0098", objArr118);
                                                                                    cls43.getMethod(((java.lang.String) objArr118[0]).intern(), java.lang.Long.TYPE).invoke(newInstance2, 10L);
                                                                                    try {
                                                                                        try {
                                                                                            exec.destroy();
                                                                                        } catch (java.io.IOException unused8) {
                                                                                        }
                                                                                    } catch (java.lang.Exception unused9) {
                                                                                    }
                                                                                    try {
                                                                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                                                        java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, android.graphics.Color.alpha(0) + 1507, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                                                        byte[] bArr4 = $$a;
                                                                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                                        c(bArr4[18], androidx.compose.material3.ProgressIndicatorKt.SecondLineHeadDelay, (byte) (-bArr4[52]), objArr119);
                                                                                        sb2.append(cls44.getField((java.lang.String) objArr119[0]).get(newInstance).toString());
                                                                                        java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.text.TextUtils.indexOf("", "", 0, 0), android.graphics.Color.argb(0, 0, 0, 0) + 1507, (char) android.view.KeyEvent.getDeadChar(0, 0));
                                                                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                                        c(bArr4[18], androidx.compose.material3.ProgressIndicatorKt.SecondLineHeadDelay, (byte) (-bArr4[52]), objArr120);
                                                                                        sb2.append(cls45.getField((java.lang.String) objArr120[0]).get(newInstance2).toString());
                                                                                        java.lang.String obj71 = sb2.toString();
                                                                                        java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                                        a(new int[]{232604734, 272089301}, 1 - android.text.TextUtils.getOffsetAfter("", 0), objArr121);
                                                                                        java.lang.String[] split2 = obj71.split(((java.lang.String) objArr121[0]).intern());
                                                                                        int length = split2.length;
                                                                                        int i34 = 0;
                                                                                        while (i34 < length) {
                                                                                            java.lang.String str31 = split2[i34];
                                                                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                                            a(new int[]{-882249053, 1055372107, 1485094314, 1885713576, -739207780, 1042472910, -112294199, -1112927607, 1508478481, -1884094650}, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18, objArr122);
                                                                                            if (!str31.startsWith(((java.lang.String) objArr122[0]).intern())) {
                                                                                                java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                                                a(new int[]{-882249053, 1055372107, 1485094314, 1885713576, -739207780, 1042472910, -242452423, -1320741518, -192558680, -551068572}, android.graphics.ImageFormat.getBitsPerPixel(0) + 21, objArr123);
                                                                                                if (str31.startsWith(((java.lang.String) objArr123[0]).intern())) {
                                                                                                    continue;
                                                                                                } else {
                                                                                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                                                    a(new int[]{-882249053, 1055372107, 1485094314, 1885713576}, android.graphics.Color.rgb(0, 0, 0) + 16777224, objArr124);
                                                                                                    if (str31.startsWith(((java.lang.String) objArr124[0]).intern())) {
                                                                                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                                                        b(null, null, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u009c", objArr125);
                                                                                                        ?? split3 = str31.split(((java.lang.String) objArr125[0]).intern());
                                                                                                        if (split3.length > 1 && split3[1].equalsIgnoreCase(r6)) {
                                                                                                        }
                                                                                                    } else {
                                                                                                        continue;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            i34++;
                                                                                            str6 = str6;
                                                                                            str8 = str8;
                                                                                            str30 = str30;
                                                                                        }
                                                                                        r15 = i;
                                                                                        str19 = str30;
                                                                                        intern2 = str8;
                                                                                        str20 = str6;
                                                                                    } catch (java.lang.Exception unused10) {
                                                                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                                        b(null, null, 128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0088\u008f\u008f\u008b\u0085\u0086\u008c\u0090\u0095\u0083\u0095\u008b\u0084\u0083\u008b\u008c\u0085\u0095\u0086\u0084\u0095\u0082\u008b\u0089\u008d\u0083\u009b", objArr126);
                                                                                        throw new java.io.IOException(((java.lang.String) objArr126[0]).intern());
                                                                                    }
                                                                                } catch (java.lang.Throwable th19) {
                                                                                    java.lang.Throwable cause5 = th19.getCause();
                                                                                    if (cause5 != null) {
                                                                                        throw cause5;
                                                                                    }
                                                                                    throw th19;
                                                                                }
                                                                            } catch (java.lang.InterruptedException e6) {
                                                                                e = e6;
                                                                                throw e;
                                                                            }
                                                                        } catch (java.lang.Throwable th20) {
                                                                            java.lang.Throwable cause6 = th20.getCause();
                                                                            if (cause6 != null) {
                                                                                throw cause6;
                                                                            }
                                                                            throw th20;
                                                                        }
                                                                    } catch (java.lang.InterruptedException e7) {
                                                                        e = e7;
                                                                        throw e;
                                                                    } catch (java.lang.Throwable th21) {
                                                                        th = th21;
                                                                        th3 = th;
                                                                        exec.destroy();
                                                                        throw th3;
                                                                    }
                                                                } catch (java.io.IOException unused11) {
                                                                    r15 = i;
                                                                    r5 = intern2;
                                                                    intern2 = str19;
                                                                    str19 = str30;
                                                                } catch (java.lang.Exception unused12) {
                                                                }
                                                            } catch (java.lang.Throwable th22) {
                                                                java.lang.Throwable cause7 = th22.getCause();
                                                                if (cause7 != null) {
                                                                    throw cause7;
                                                                }
                                                                throw th22;
                                                            }
                                                        } catch (java.lang.Throwable th23) {
                                                            th = th23;
                                                            java.lang.Throwable th24 = th;
                                                            java.lang.Throwable cause8 = th24.getCause();
                                                            if (cause8 != null) {
                                                                throw cause8;
                                                            }
                                                            throw th24;
                                                        }
                                                    } catch (java.lang.Throwable th25) {
                                                        th = th25;
                                                    }
                                                } catch (java.lang.Throwable th26) {
                                                    th2 = th26;
                                                }
                                            } catch (java.io.IOException unused13) {
                                                r15 = r5;
                                                r5 = intern2;
                                                intern2 = str19;
                                                str19 = str27;
                                                i32 = i33 + 1;
                                                str27 = str19;
                                                split = str29;
                                                r3 = str4;
                                                i31 = 0;
                                                str19 = intern2;
                                                intern2 = r5;
                                                r5 = r15;
                                                str29 = str29;
                                                i33 = i33;
                                            } catch (java.lang.Exception unused14) {
                                                java.lang.Object[] objArr1262 = new java.lang.Object[1];
                                                b(null, null, 128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0088\u008f\u008f\u008b\u0085\u0086\u008c\u0090\u0095\u0083\u0095\u008b\u0084\u0083\u008b\u008c\u0085\u0095\u0086\u0084\u0095\u0082\u008b\u0089\u008d\u0083\u009b", objArr1262);
                                                throw new java.io.IOException(((java.lang.String) objArr1262[0]).intern());
                                            }
                                        } catch (java.io.IOException unused15) {
                                            str4 = r3;
                                            i33 = i32;
                                            r15 = r5;
                                            r5 = intern2;
                                            intern2 = str19;
                                            str19 = str27;
                                            i32 = i33 + 1;
                                            str27 = str19;
                                            split = str29;
                                            r3 = str4;
                                            i31 = 0;
                                            str19 = intern2;
                                            intern2 = r5;
                                            r5 = r15;
                                            str29 = str29;
                                            i33 = i33;
                                        } catch (java.lang.Exception unused16) {
                                            java.lang.Object[] objArr12622 = new java.lang.Object[1];
                                            b(null, null, 128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0088\u008f\u008f\u008b\u0085\u0086\u008c\u0090\u0095\u0083\u0095\u008b\u0084\u0083\u008b\u008c\u0085\u0095\u0086\u0084\u0095\u0082\u008b\u0089\u008d\u0083\u009b", objArr12622);
                                            throw new java.io.IOException(((java.lang.String) objArr12622[0]).intern());
                                        }
                                    }
                                } else {
                                    str29 = split;
                                    str4 = r3;
                                    i33 = i32;
                                    r15 = r5;
                                    r5 = intern2;
                                    intern2 = str19;
                                    str19 = str27;
                                }
                                i32 = i33 + 1;
                                str27 = str19;
                                split = str29;
                                r3 = str4;
                                i31 = 0;
                                str19 = intern2;
                                intern2 = r5;
                                r5 = r15;
                                str29 = str29;
                                i33 = i33;
                            }
                            i4 = r5;
                            str = str27;
                        } else {
                            num = -604620973;
                            i4 = i14 == true ? 1 : 0;
                            str = r12;
                        }
                        java.lang.Object[] objArr127 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                        int i35 = ~(174101365 | i4);
                        java.lang.Object[] objArr128 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-174101366) | i4)) | 33554705 | (~((-856034580) | i4))) * (-880)) + 1311667208 + (((~((-174101366) | (~i4))) | 856034579 | i35) * (-880)) + (i35 * 880))};
                        java.lang.Object obj72 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str);
                        java.lang.Object obj73 = obj72;
                        if (obj72 == null) {
                            java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2712, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                            java.lang.Object[] objArr129 = new java.lang.Object[1];
                            c((byte) 34, 653, $$a[41], objArr129);
                            java.lang.reflect.Method method33 = cls46.getMethod((java.lang.String) objArr129[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str, method33);
                            obj73 = method33;
                        }
                        int intValue3 = ((java.lang.Integer) ((java.lang.reflect.Method) obj73).invoke(null, objArr128)).intValue();
                        c = 0;
                        ((int[]) objArr127[4])[0] = intValue3;
                        objArr = objArr127;
                        i5 = 1;
                        if (((int[]) objArr[i5])[c] != i4) {
                        }
                    } catch (java.lang.Throwable th27) {
                        java.lang.Throwable cause9 = th27.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th27;
                    }
                } catch (java.lang.Throwable th28) {
                    java.lang.Throwable cause10 = th28.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th28;
                }
            }

            static void init$0() {
                $$a = new byte[]{65, -108, -120, -80, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5};
                $$b = 225;
            }
        };
        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 107) % 128;
        return setmobilepin;
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 13) % 128;
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(java.lang.Long.valueOf(com.payair.hce.onSignUser.AlternateContactlessPaymentDataJson(transactioncanberesumed.valueOf())));
        int i = getProfileVersion + 9;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0228, code lost:
    
        if (r4 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0247, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0248, code lost:
    
        r0.writeReplace = r3 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x024e, code lost:
    
        r7 = new java.lang.Object[]{r0, java.lang.Integer.valueOf(r17), java.lang.Integer.valueOf(com.payair.hce.readIccEncryptionKey.AlternateContactlessPaymentDataJson), r1};
        r3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x026f, code lost:
    
        if (r3 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0271, code lost:
    
        r3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2364 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.view.KeyEvent.getDeadChar(0, 0));
        r11 = new java.lang.Object[1];
        b(0, 0, 0, r11);
        r3 = r3.getMethod((java.lang.String) r11[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02bb, code lost:
    
        ((java.lang.StringBuilder) ((java.lang.reflect.Method) r3).invoke(null, r7)).append(r0.values);
        r0.AlternateContactlessPaymentDataJson = r0.values;
        r3 = com.payair.hce.readIccEncryptionKey.values;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02c8, code lost:
    
        if (r3 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02ca, code lost:
    
        r4 = r3.length;
        r7 = new byte[r4];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02ce, code lost:
    
        if (r8 >= r4) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02d0, code lost:
    
        r7[r8] = (byte) (r3[r8] ^ (-4897270311952305750L));
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02e0, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02e1, code lost:
    
        if (r3 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02e3, code lost:
    
        com.payair.hce.readIccEncryptionKey.$11 = (com.payair.hce.readIccEncryptionKey.$10 + 83) % 128;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02ee, code lost:
    
        r0.DigitizedCardProfile = 1;
        com.payair.hce.readIccEncryptionKey.$11 = (com.payair.hce.readIccEncryptionKey.$10 + 43) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02fa, code lost:
    
        if (r0.DigitizedCardProfile >= r2) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02fc, code lost:
    
        if (r3 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02fe, code lost:
    
        r4 = com.payair.hce.readIccEncryptionKey.values;
        r0.writeReplace = r0.writeReplace - 1;
        r0.values = (char) (r0.AlternateContactlessPaymentDataJson + (((byte) (((byte) (r4[r7] ^ (-4897270311952305750L))) + r21)) ^ r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0340, code lost:
    
        r1.append(r0.values);
        r0.AlternateContactlessPaymentDataJson = r0.values;
        r0.DigitizedCardProfile++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0322, code lost:
    
        r4 = com.payair.hce.readIccEncryptionKey.getAid;
        r0.writeReplace = r0.writeReplace - 1;
        r0.values = (char) (r0.AlternateContactlessPaymentDataJson + (((short) (((short) (r4[r7] ^ (-4897270311952305750L))) + r21)) ^ r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02ed, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x023b, code lost:
    
        r7 = r7 + 29;
        com.payair.hce.readIccEncryptionKey.$11 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0243, code lost:
    
        if ((r7 % 2) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0245, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0239, code lost:
    
        if (r4 != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(valueOf)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 28, 28 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.view.View.getDefaultSize(0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $10 = ($11 + 125) % 128;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i6 = $10 + 95;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                byte[] bArr = values;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i7])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 31, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 5088, (char) android.view.KeyEvent.normalizeMetaState(0))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i8 = $10 + 93;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        byte[] bArr3 = values;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(DigitizedCardProfile)};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.graphics.ImageFormat.getBitsPerPixel(0) + 30, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                        }
                        i5 = ((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] | (-4897270311952305750L))) << ((int) (valueOf * (-4897270311952305750L)));
                    } else {
                        byte[] bArr4 = values;
                        java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(DigitizedCardProfile)};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj4 == null) {
                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 28 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                        }
                        i5 = ((byte) (bArr4[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue()] ^ (-4897270311952305750L))) + ((int) (valueOf ^ (-4897270311952305750L)));
                    }
                    intValue = (byte) i5;
                } else {
                    intValue = (short) (((short) (getAid[i2 + ((int) (DigitizedCardProfile ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (valueOf ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                int i9 = $11 + 13;
                int i10 = i9 % 128;
                $10 = i10;
                if (i9 % 2 != 0) {
                    i4 = ((i2 / intValue) + 2) * ((int) (DigitizedCardProfile * (-4897270311952305750L)));
                } else {
                    i4 = ((i2 + intValue) - 2) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L)));
                }
            }
            java.lang.String obj5 = sb.toString();
            int i11 = $10 + 121;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            objArr[0] = obj5;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getProfileVersion = 1;
        DigitizedCardProfile = 566489615;
        valueOf = 520368622;
        AlternateContactlessPaymentDataJson = -1447777256;
        values = new byte[]{106, 9, 80, 63};
    }

    static void init$0() {
        $$a = new byte[]{117, -13, -118, com.google.common.base.Ascii.RS};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE;
    }
}
