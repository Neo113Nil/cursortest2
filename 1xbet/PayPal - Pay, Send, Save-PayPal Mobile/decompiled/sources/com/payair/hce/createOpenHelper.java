package com.payair.hce;

/* loaded from: classes4.dex */
public class createOpenHelper extends com.payair.hce.getReasonCode<java.lang.Short> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static short[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static byte[] getAid;
    private static int getProfileVersion;
    private static int valueOf;
    private static char[] values;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = (b * 2) + 35;
        int i6 = 3 - (i * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = i6;
            i4 = 0;
            i6 = (i6 + (-i7)) - 2;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i3++;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i6 = (i6 + (-i7)) - 2;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i3++;
            if (i4 == i5) {
            }
        } else {
            int i8 = 65 - (b2 * 2);
            i2 = 0;
            i3 = i6;
            i6 = i8;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i3++;
            if (i4 == i5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$d;
        int i4 = i * 3;
        ?? r8 = 104 - b;
        int i5 = 3 - (s * 4);
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            byte b2 = r8;
            i2 = 0;
            int i6 = i5;
            int i7 = i6;
            i3 = i5 + b2;
            i5 = i7;
            int i8 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b2 = bArr[i8];
            i2++;
            int i9 = i3;
            i6 = i8;
            i5 = i9;
            int i72 = i6;
            i3 = i5 + b2;
            i5 = i72;
            int i82 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == 0 - i4) {
            }
        } else {
            i2 = 0;
            i3 = r8;
            int i822 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == 0 - i4) {
            }
        }
    }

    /* synthetic */ createOpenHelper(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        java.lang.Object obj;
        int i = getProfileVersion + 71;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u000e&\u0017\"", 5 << android.text.TextUtils.getTrimmedLength(""), (byte) (75 >> (android.view.ViewConfiguration.getEdgeSlop() - 118)), objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("\u000e&\u0017\"", android.text.TextUtils.getTrimmedLength("") + 4, (byte) (97 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), objArr2);
            obj = objArr2[0];
        }
        com.payair.hce.transactionCanBeResumed values2 = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) obj).intern());
        int i2 = getProfileVersion + 51;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            return values2;
        }
        throw null;
    }

    private createOpenHelper() {
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setMobilePin<java.lang.Short> setmobilepin = new com.payair.hce.setMobilePin<java.lang.Short>() { // from class: com.payair.hce.createOpenHelper.1
            private static int AlternateContactlessPaymentDataJson = 0;
            private static int values = 1;

            public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2, int i, int i2, int i3) {
                com.payair.hce.createOpenHelper createopenhelper = new com.payair.hce.createOpenHelper((byte) 0);
                int i4 = AlternateContactlessPaymentDataJson;
                int i5 = (i4 | 27) << 1;
                int i6 = -((i4 & (-28)) | ((~i4) & 27));
                values = ((i5 & i6) + (i6 | i5)) % 128;
                return createopenhelper;
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<java.lang.Short> valueOf() {
                return (com.payair.hce.getReasonCode) writeReplace(new java.lang.Object[]{this}, 204022962, -204022962, java.lang.System.identityHashCode(this));
            }
        };
        int i = IccPrivateKeyCrtComponentsJson + 97;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            return setmobilepin;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        int i = IccPrivateKeyCrtComponentsJson + 61;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            super.valueOf(transactioncanberesumed);
            super.AlternateContactlessPaymentDataJson(java.lang.Short.valueOf((short) com.payair.hce.onRequestSessionCompleted.values(transactioncanberesumed.valueOf())));
            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 75) % 128;
        } else {
            super.valueOf(transactioncanberesumed);
            super.AlternateContactlessPaymentDataJson(java.lang.Short.valueOf((short) com.payair.hce.onRequestSessionCompleted.values(transactioncanberesumed.valueOf())));
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean writeReplace() {
        int i = getProfileVersion + 87;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            if (((java.lang.Short) this.writeReplace).shortValue() == 15756) {
                return true;
            }
        } else if (((java.lang.Short) this.writeReplace).shortValue() == 16657) {
            return true;
        }
        int i2 = getProfileVersion + 73;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            if (((java.lang.Short) this.writeReplace).shortValue() == 5689) {
                return true;
            }
        } else if (((java.lang.Short) this.writeReplace).shortValue() == 16689) {
            return true;
        }
        if (((java.lang.Short) this.writeReplace).shortValue() == 18308 || ((java.lang.Short) this.writeReplace).shortValue() == 29987) {
            return true;
        }
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 5) % 128;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, byte b, int i3, short s, java.lang.Object[] objArr) {
        boolean z;
        long j;
        int i4;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(DigitizedCardProfile)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $10 = ($11 + 33) % 128;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = getAid;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.KeyEvent.getDeadChar(0, 0) + 5088, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (SdkCoreAlternateContactlessPaymentDataImpl[i + ((int) (valueOf ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        int i6 = (int) (valueOf ^ j);
                        if (z) {
                            $10 = ($11 + 63) % 128;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        gettrack2constructiondata.writeReplace = ((i + intValue) - 2) + i6 + i4;
                        java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(RecordsJson), sb};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 28, 2364 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.view.View.getDefaultSize(0, 0));
                            byte b2 = (byte) ($$d[1] + 1);
                            byte b3 = b2;
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            d(b2, b3, b3, objArr5);
                            obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr3 = getAid;
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i7 = 0; i7 < length2; i7++) {
                                bArr4[i7] = (byte) (bArr3[i7] ^ (-4897270311952305750L));
                            }
                            bArr3 = bArr4;
                        }
                        boolean z2 = bArr3 != null;
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z2) {
                                $11 = ($10 + 37) % 128;
                                byte[] bArr5 = getAid;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = SdkCoreAlternateContactlessPaymentDataImpl;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                    objArr[0] = sb.toString();
                }
                $11 = ($10 + 39) % 128;
                byte[] bArr6 = getAid;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(valueOf)};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 27, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 29, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                }
                intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
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

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        char c;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = values;
        int i3 = -1497284274;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i3));
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.getTrimmedLength(""), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2508, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6801));
                        byte b2 = (byte) ($$d[1] + 1);
                        byte b3 = b2;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(b2, b3, (byte) (b3 | 39), objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = -1497284274;
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
        char c2 = 6;
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 49, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2508, (char) (6802 - android.graphics.Color.red(0)));
            byte b4 = (byte) ($$d[1] + 1);
            byte b5 = b4;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            d(b4, b5, (byte) (b5 | 39), objArr5);
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
            $10 = ($11 + 21) % 128;
            digitizedCardJson12.values = 0;
            $11 = ($10 + 81) % 128;
            while (digitizedCardJson12.values < i2) {
                int i5 = $11 + 45;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    int i6 = digitizedCardJson12.values;
                    throw new java.lang.ArithmeticException();
                }
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    c = c2;
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[13];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[8] = java.lang.Integer.valueOf(charValue);
                    objArr6[7] = digitizedCardJson12;
                    objArr6[c2] = digitizedCardJson12;
                    objArr6[5] = java.lang.Integer.valueOf(charValue);
                    objArr6[4] = digitizedCardJson12;
                    objArr6[3] = digitizedCardJson12;
                    objArr6[2] = java.lang.Integer.valueOf(charValue);
                    objArr6[1] = digitizedCardJson12;
                    objArr6[0] = digitizedCardJson12;
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 19, 3596 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2666, (char) (18889 - android.graphics.Color.alpha(0)));
                            byte b6 = (byte) ($$d[1] + 1);
                            byte b7 = b6;
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            d(b6, b7, (byte) (b7 | com.google.common.base.Ascii.US), objArr8);
                            c = 6;
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        } else {
                            c = 6;
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i7 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i8 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i7 * charValue) + i8];
                    } else {
                        c = 6;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i9 = digitizedCardJson12.DigitizedCardProfile;
                            int i10 = digitizedCardJson12.RecordsJson;
                            int i11 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr3[digitizedCardJson12.values] = cArr[(i9 * charValue) + i10];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i11 * charValue) + i12];
                        } else {
                            int i13 = digitizedCardJson12.DigitizedCardProfile;
                            int i14 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i15 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i16 = digitizedCardJson12.RecordsJson;
                            cArr3[digitizedCardJson12.values] = cArr[(i13 * charValue) + i14];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i15 * charValue) + i16];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                c2 = c;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr3[i17] = (char) (cArr3[i17] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        values = new char[]{12320, 12344, 13268, 12410, 12321, 12339, 12333, 12302, 12346, 12348, 12325, 12345, 12319, 12350, 12390, 12329, 12297, 12403, 12338, 12388, 12331, 12313, 12335, 12292, 13267, 12322, 13264, 12411, 13266, 12394, 12415, 12293, 12314, 12327, 12332, 12300, 12299, 12328, 12306, 12324, 12351, 12407, 12295, 12291, 12334, 13265, 12326, 12323, 12330};
        AlternateContactlessPaymentDataJson = (char) 1495;
        valueOf = -790907421;
        DigitizedCardProfile = 520368513;
        RecordsJson = 1464572551;
        getAid = new byte[]{-121, 125, -117, -118, 121, -119, 123, -82, -84, -116, com.visa.cbp.getEncExpo.IResultReceiver, 81, -90, 114, -116, com.visa.cbp.getEncExpo.IResultReceiver, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -58, 74, 120, 115, -104, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 57, -119, -121, 123, 113, -98, 114, 126, -55, 58, -101, 103, com.visa.cbp.getEncExpo.registerForActivityResult, 123, -50, 63, -30, 35, 57, -63, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.visa.cbp.getEncExpo.kernelVersion, -59, -42, -27, 6, 58, -123, 125, -63, -50, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -63, 56, -53, -14, 13, 60, kotlin.io.encoding.Base64.padSymbol, 58, -55, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -54, -121, -119, 117, 103, -121, 115, -118, 98, 81, -75, -119, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -50, 114, 125, -123, 114, -117, 120, 65, -66, -113, -114, -119, 122, -126, 121, -47, 38, -55, -8, com.google.common.base.Ascii.NAK, 56, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -2, com.google.common.base.Ascii.SUB, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -113, 109, Byte.MIN_VALUE, -124, 125, -125, -117, 124, 115, 92, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -113, 109, -111, 115, -119, com.visa.cbp.getEncExpo.IResultReceiver, Byte.MIN_VALUE, -74, 76, -70, -69, 72, -72, 74, -97, -99, -67, 70, com.visa.cbp.getEncExpo.IResultReceiver2, 89, -84, 67, 70, -75, 80, -97, 98, -78, 67, -86, -86, -86, -86, -86, -86};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x06f8 A[Catch: all -> 0x00ca, TryCatch #5 {all -> 0x00ca, blocks: (B:5:0x0034, B:7:0x0075, B:8:0x00b6, B:102:0x06c6, B:104:0x06f8, B:105:0x0740), top: B:2:0x001d }] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v15 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v17 */
    /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r24v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2) {
        ?? r24;
        int i3;
        java.lang.Integer num;
        java.lang.Object obj;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        java.lang.Object invoke;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        try {
            if (context == null) {
                java.lang.Object[] objArr3 = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i7 = ~i;
                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i7 | (-30455235))) | (-974473751) | (~(30455234 | i))) * (-564)) + 1154430664 + ((~(i | (-973425173))) * 1128) + (((~(i7 | (-974473751))) | (-1003880407)) * 564))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2714, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b = (byte) ($$a[14] + 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(b, b, b, objArr5);
                    obj2 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                return objArr3;
            }
            try {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                r24 = objArr6;
                c(807435192 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-6) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) ('V' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (-1213180611) - android.text.TextUtils.getOffsetBefore("", 0), (short) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), r24);
                objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr6[0]).intern()), 2);
                objArr2 = new java.lang.Object[1];
                a("\u0017\u001e#%%.\u0003\b0-\u001c\b\u0017$)\u0005\u0011\u001c#%%.\u0003\b0-\u000f\u0011(\r㘜", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30, (byte) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 83), objArr2);
            } catch (java.lang.Throwable unused) {
                r24 = i5;
            }
            try {
                try {
                    java.lang.Object[] objArr7 = {((java.lang.String) objArr2[0]).intern()};
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    c(807435191 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 6, (byte) (38 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), android.text.TextUtils.getOffsetBefore("", 0) - 1213180611, (short) android.graphics.Color.red(0), objArr8);
                    objArr[0] = java.lang.Class.forName(((java.lang.String) objArr8[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a("\u0014%\u0007\u001a\u0011\u001c#%%.\u0003\b0-\u000f\u0011\u001b%%(+\u0002\f-+\u001e\b\u0015&)㘗", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 32, (byte) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 26), objArr9);
                    try {
                        java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        c(807435191 - android.widget.ExpandableListView.getPackedPositionType(0L), (-5) - android.view.KeyEvent.normalizeMetaState(0), (byte) (38 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), (-1213180611) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (short) android.view.View.resolveSize(0, 0), objArr11);
                        objArr[1] = java.lang.Class.forName(((java.lang.String) objArr11[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                        try {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            a("\u0012)+\u0002\f-/\u0010\u0011\b)\u000b\u0019$\f\u0014\u0011\t)\u000b\u0019\u000f㙗", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23, (byte) (105 - android.graphics.Color.blue(0)), objArr12);
                            java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            a("\u0001\u001b\u000b\"\u000e\u0010\u0006\u0012\u0001\u001b0\u000e)\u0012\u0001\u001b㘴", android.graphics.Color.green(0) + 17, (byte) (77 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr13);
                            invoke = cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } catch (java.lang.Throwable unused2) {
                    i3 = 1;
                    num = r24;
                    int[] iArr = new int[i3];
                    int[] iArr2 = new int[i3];
                    iArr[0] = i;
                    iArr2[0] = i;
                    java.lang.Object[] objArr14 = {iArr, iArr2, null, new int[i3]};
                    int i8 = (~((-556508681) | i)) | 2752512;
                    java.lang.Object[] objArr15 = {java.lang.Integer.valueOf(i2), num, java.lang.Integer.valueOf((i8 * 992) + 776359256 + ((i8 | (~((~i) | 1002176472))) * (-496)) + ((i | 448420304) * 496))};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj == null) {
                    }
                    ((int[]) objArr14[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr15)).intValue();
                    return objArr14;
                }
                try {
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    a("\u0012)+\u0002\f-/\u0010\u0011\b)\u000b\u0019$\f\u0014\u0011\t)\u000b\u0019\u000f㙗", 23 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (105 - android.view.View.resolveSize(0, 0)), objArr16);
                    java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr16[0]).intern());
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    a("\u0001\u001b\u000b\"\u000e\u0010\u0006\u0012\u0001\u001b\u001b\u0010\u001d\u001a", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 15, (byte) (50 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr17);
                    try {
                        java.lang.Object[] objArr18 = {cls3.getMethod(((java.lang.String) objArr17[0]).intern(), null).invoke(context, null), 64};
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        a("\u0012)+\u0002\f-/\u0010\u0011\b)\u000b\u0019$\f\u0014\f\u001d\u0012!\u000e\u0010\u0006\u0012\u0001\u001b0\u000e)\u0012\u0001\u001b㙋", (android.os.Process.myPid() >> 22) + 33, (byte) (android.view.View.getDefaultSize(0, 0) + 99), objArr19);
                        java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        a("\u0001\u001b\u000b\"\u000e\u0010\u0006\u0012\u0001\u001b.$\u001f\r", 13 - android.view.MotionEvent.axisFromString(""), (byte) (42 - android.view.KeyEvent.normalizeMetaState(0)), objArr20);
                        java.lang.Object invoke2 = cls4.getMethod(((java.lang.String) objArr20[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr18);
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        c((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 807435228, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 12, (byte) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 109), android.graphics.Color.alpha(0) - 1213180620, (short) android.text.TextUtils.getTrimmedLength(""), objArr21);
                        java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr21[0]).intern());
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a("\f.\u0004)\u001b\u0014$\u0005\u0019\b", 9 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17), objArr22);
                        java.lang.Object[] objArr23 = (java.lang.Object[]) cls5.getField(((java.lang.String) objArr22[0]).intern()).get(invoke2);
                        int length = objArr23.length;
                        int i9 = 0;
                        r24 = r24;
                        while (i9 < length) {
                            java.lang.Object obj3 = objArr23[i9];
                            java.lang.Object[] objArr24 = new java.lang.Object[i6];
                            a("(\u0011\u001f\u0002㘙", 5 - android.widget.ExpandableListView.getPackedPositionType(0L), (byte) (118 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr24);
                            try {
                                java.lang.Object[] objArr25 = {((java.lang.String) objArr24[i4]).intern()};
                                java.lang.Object[] objArr26 = new java.lang.Object[i6];
                                a("\u0006\u000e\r\u0010\u0012\f\u001d\u0016$\u00050\f\f\u001a\u0016\u001d\u0006\b\u0014\u0011\u001d\b\f0!0\u0010\u000e\b\u001b)\u000e\u0014\b\b\u0003㙛", 37 - android.text.TextUtils.getCapsMode("", i4, i4), (byte) (android.graphics.Color.rgb(i4, i4, i4) + 16777336), objArr26);
                                java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr26[i4]).intern());
                                java.lang.Object[] objArr27 = new java.lang.Object[i6];
                                a("\u0001\u001b\b0.\u0012\u0014\u001b$\u0012㘶", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i4) + 12, (byte) ('g' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr27);
                                java.lang.String intern = ((java.lang.String) objArr27[i4]).intern();
                                java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                                clsArr[i4] = java.lang.String.class;
                                java.lang.Object invoke3 = cls6.getMethod(intern, clsArr).invoke(null, objArr25);
                                try {
                                    java.lang.Object[] objArr28 = objArr23;
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    c(807435258 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (-16) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i4), (byte) ((-33) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 1213180619, (short) android.text.TextUtils.indexOf("", ""), objArr29);
                                    java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                                    int i10 = length;
                                    r24 = i5;
                                    try {
                                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                                        c(807435283 - android.graphics.ImageFormat.getBitsPerPixel(0), 16 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 100), android.graphics.ImageFormat.getBitsPerPixel(0) - 1213180600, (short) ((-1) - android.os.Process.getGidForName("")), objArr30);
                                        try {
                                            java.lang.Object[] objArr31 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod(((java.lang.String) objArr30[0]).intern(), null).invoke(obj3, null))};
                                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                                            a("\u0006\u000e\r\u0010\u0012\f\u001d\u0016$\u00050\f\f\u001a\u0016\u001d\u0006\b\u0014\u0011\u001d\b\f0!0\u0010\u000e\b\u001b)\u000e\u0014\b\b\u0003㙛", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, (byte) (120 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr32);
                                            java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr32[0]).intern());
                                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                                            c(807435295 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-24) - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (byte) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 44), (-1213180614) - android.graphics.Color.red(0), (short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr33);
                                            java.lang.Object invoke4 = cls8.getMethod(((java.lang.String) objArr33[0]).intern(), java.io.InputStream.class).invoke(invoke3, objArr31);
                                            int length2 = objArr.length;
                                            int i11 = 0;
                                            for (int i12 = 2; i11 < i12; i12 = 2) {
                                                java.lang.Object obj4 = objArr[i11];
                                                try {
                                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                    a("\u0006\u000e\r\u0010\u0012\f\u001d\u0016$\u00050\f\f\u001a\u0016\u001d\u0006\b\u0011(\u001f\u0002\u0012\u0011\u001d\b\f0!0\u0010\u000e\b\u001b", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 34, (byte) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 68), objArr34);
                                                    java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr34[0]).intern());
                                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                    c((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 807435311, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 20, (byte) (23 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (-1213180615) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), objArr35);
                                                    if (obj4.equals(cls9.getMethod(((java.lang.String) objArr35[0]).intern(), null).invoke(invoke4, null))) {
                                                        java.lang.Object[] objArr36 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                        int i13 = ~i;
                                                        try {
                                                            java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((-12925441) | i13) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 154491528 + (((~(i13 | 790676856)) | (-602275609)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj5 == null) {
                                                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 50, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2714, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                                                byte b2 = (byte) ($$a[14] + 1);
                                                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                                b(b2, b2, b2, objArr38);
                                                                obj5 = cls10.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                                            }
                                                            ((int[]) objArr36[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr37)).intValue();
                                                            return objArr36;
                                                        } catch (java.lang.Throwable th3) {
                                                            java.lang.Throwable cause3 = th3.getCause();
                                                            if (cause3 != null) {
                                                                throw cause3;
                                                            }
                                                            throw th3;
                                                        }
                                                    }
                                                    i11++;
                                                } catch (java.lang.Throwable th4) {
                                                    java.lang.Throwable cause4 = th4.getCause();
                                                    if (cause4 != null) {
                                                        throw cause4;
                                                    }
                                                    throw th4;
                                                }
                                            }
                                            i9++;
                                            objArr23 = objArr28;
                                            length = i10;
                                            i5 = r24;
                                            i4 = 0;
                                            i6 = 1;
                                            r24 = r24;
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        java.lang.Throwable cause6 = th.getCause();
                                        if (cause6 != null) {
                                            throw cause6;
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                }
                            } catch (java.lang.Throwable th8) {
                                java.lang.Throwable cause7 = th8.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th8;
                            }
                        }
                        num = i5;
                        i3 = i6;
                        int[] iArr3 = new int[i3];
                        int[] iArr22 = new int[i3];
                        iArr3[0] = i;
                        iArr22[0] = i;
                        java.lang.Object[] objArr142 = {iArr3, iArr22, null, new int[i3]};
                        int i82 = (~((-556508681) | i)) | 2752512;
                        java.lang.Object[] objArr152 = {java.lang.Integer.valueOf(i2), num, java.lang.Integer.valueOf((i82 * 992) + 776359256 + ((i82 | (~((~i) | 1002176472))) * (-496)) + ((i | 448420304) * 496))};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj == null) {
                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 50, 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                            byte b3 = (byte) ($$a[14] + 1);
                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                            b(b3, b3, b3, objArr39);
                            obj = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                        }
                        ((int[]) objArr142[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr152)).intValue();
                        return objArr142;
                    } catch (java.lang.Throwable th9) {
                        java.lang.Throwable cause8 = th9.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th9;
                    }
                } catch (java.lang.Throwable th10) {
                    java.lang.Throwable cause9 = th10.getCause();
                    if (cause9 != null) {
                        throw cause9;
                    }
                    throw th10;
                }
            } catch (java.lang.Throwable th11) {
                java.lang.Throwable cause10 = th11.getCause();
                if (cause10 != null) {
                    throw cause10;
                }
                throw th11;
            }
        } catch (java.lang.Throwable th12) {
            java.lang.Throwable cause11 = th12.getCause();
            if (cause11 != null) {
                throw cause11;
            }
            throw th12;
        }
    }

    static void init$1() {
        $$d = new byte[]{126, -1, -74, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE};
        $$e = 250;
    }

    public static com.payair.hce.setMobilePin<java.lang.Short> DigitizedCardProfile() {
        return (com.payair.hce.setMobilePin) DigitizedCardProfile(new java.lang.Object[0], -470279881, 470279881, (int) java.lang.System.currentTimeMillis());
    }

    static void init$0() {
        $$a = new byte[]{73, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -116, -114, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = 193;
    }
}
