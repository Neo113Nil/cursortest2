package com.payair.hce;

/* loaded from: classes10.dex */
public class setContextClickable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final byte[] AlternateContactlessPaymentDataJson = null;
    private static final int DigitizedCardProfile = 0;
    private static int[] valueOf;
    private static int values;
    private static int writeReplace;

    private static void c(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2 = 66 - (s * 3);
        byte[] bArr = $$a;
        int i3 = b * 4;
        int i4 = 3 - (i * 4);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = i3 + (-i4);
            i4 = i4;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i4 + 1;
            i2 += -bArr[i7];
            i4 = i7;
            i5 = i6;
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        int[] iArr3;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = valueOf;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i3 = 1;
        int i4 = 0;
        if (iArr4 != null) {
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            int i5 = 0;
            while (i5 < length2) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                    objArr2[i4] = java.lang.Integer.valueOf(iArr4[i5]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf("", c, i4, i4), android.view.KeyEvent.normalizeMetaState(i4) + 29, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr5[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i5++;
                    $10 = ($11 + 121) % 128;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    i3 = 1;
                    i4 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = valueOf;
        if (iArr7 != null) {
            int i6 = $11 + 115;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr7[i2])};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr3 = iArr7;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777243, 28 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr3 = iArr7;
                }
                iArr2[i2] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i2++;
                $11 = ($10 + 35) % 128;
                iArr7 = iArr3;
            }
            iArr7 = iArr2;
        }
        char c2 = 0;
        java.lang.System.arraycopy(iArr7, 0, iArr6, 0, length3);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[c2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr6);
            int i7 = 0;
            for (int i8 = 16; i7 < i8; i8 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr6[i7];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 5088, (char) android.graphics.Color.red(0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i7++;
            }
            int i9 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i9;
            istransitsupported.values ^= iArr6[16];
            istransitsupported.DigitizedCardProfile ^= iArr6[17];
            int i10 = istransitsupported.DigitizedCardProfile;
            int i11 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr6);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.View.resolveSize(0, 0), 2923 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (3037 - android.graphics.Color.blue(0)));
                byte b = $$a[2];
                byte b2 = b;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                c(b, b2, b2, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            c2 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04cf A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void AlternateContactlessPaymentDataJson(long j, long j2) {
        int i;
        int i2;
        java.lang.Object invoke;
        java.lang.Object obj;
        com.payair.hce.setTranslationY settranslationy = new com.payair.hce.setTranslationY(j, j2);
        int i3 = DigitizedCardProfile;
        byte[] bArr = AlternateContactlessPaymentDataJson;
        byte b = bArr[577];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((short) (i3 | 32), b, (short) (b - 4), objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (byte) 74, (short) 366, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c = '\r';
            byte b2 = bArr[13];
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b2, (short) (b2 | 339), objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) (i3 - 1), bArr[92], (short) 362, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            byte b3 = bArr[13];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b3, (short) (b3 | 339), objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i4 = 0;
            while (i4 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i4]};
                short s = (short) (DigitizedCardProfile + 3);
                byte[] bArr2 = AlternateContactlessPaymentDataJson;
                byte b4 = bArr2[c];
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(s, b4, (short) (b4 | 338), objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b5 = bArr2[5];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(157, b5, (short) (b5 | 360), objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                byte b6 = bArr2[c];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b6, (short) (b6 | 339), objArr11);
                java.lang.Object invoke2 = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                byte b7 = bArr2[13];
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(s, b7, (short) (b7 | 338), objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(163, bArr2[16], (short) 359, objArr13);
                iArr[i4] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke2, null)).intValue();
                i4++;
                c = '\r';
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                    i = 10;
                }
                switch (settranslationy.values(iArr[i5])) {
                    case -37:
                        i5 = 86;
                    case -36:
                        i = 10;
                        try {
                            settranslationy.values(16);
                            i5 = settranslationy.valueOf != 0 ? 72 : 1;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i6 < 21 && i6 <= 40) {
                                i2 = i;
                            } else {
                                if (i6 < 60 || i6 > 63) {
                                    throw th;
                                }
                                i2 = 58;
                            }
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = th;
                            settranslationy.values(19);
                            i5 = i2;
                        }
                        break;
                    case -35:
                        i5 = 81;
                    case -34:
                        settranslationy.values(16);
                        int i7 = settranslationy.valueOf;
                        i5 = (i7 == 0 || i7 != 1) ? 59 : 47;
                    case -33:
                        i5 = 87;
                    case -32:
                        i5 = 89;
                    case -31:
                        settranslationy.values(38);
                        if (settranslationy.valueOf == 0) {
                            i5 = 71;
                        }
                    case -30:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        i = 10;
                        try {
                            settranslationy.values(10);
                            values = settranslationy.valueOf;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            if (i6 < 21) {
                                break;
                            }
                            if (i6 < 60) {
                                break;
                            }
                            throw th;
                        }
                    case -29:
                        settranslationy.AlternateContactlessPaymentDataJson = writeReplace;
                        settranslationy.values(7);
                    case -28:
                        i5 = 82;
                    case -27:
                        i5 = 84;
                    case -26:
                        try {
                            settranslationy.values(13);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            i = 10;
                            if (i6 < 21) {
                            }
                            if (i6 < 60) {
                            }
                            throw th;
                        }
                        if (settranslationy.valueOf == 0) {
                            i5 = 57;
                        }
                        break;
                    case -25:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        writeReplace = settranslationy.valueOf;
                    case -24:
                        settranslationy.AlternateContactlessPaymentDataJson = values;
                        settranslationy.values(7);
                    case -23:
                        return;
                    case -22:
                        i5 = 63;
                    case -21:
                        i5 = 49;
                    case -20:
                        values(new java.lang.Object[0], 1552721455, -1552721455, (int) java.lang.System.currentTimeMillis());
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        settranslationy.AlternateContactlessPaymentDataJson = 3;
                        settranslationy.values(2);
                        settranslationy.values(3);
                        java.lang.Object obj2 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(3);
                        java.lang.Object obj3 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(3);
                        try {
                            java.lang.Object[] objArr14 = {obj3, settranslationy.IccPrivateKeyCrtComponentsJson};
                            byte[] bArr3 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            a(564, bArr3[13], (short) 343, objArr15);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            a(com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_UNEXPECTED_ERROR, bArr3[16], (short) 361, objArr16);
                            java.lang.String str4 = (java.lang.String) objArr16[0];
                            byte b8 = bArr3[13];
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            a(549, b8, (short) (b8 | 339), objArr17);
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            a(592, bArr3[849], (short) 348, objArr18);
                            invoke = cls4.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr17[0]), java.lang.Class.forName((java.lang.String) objArr18[0])).invoke(obj2, objArr14);
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                            settranslationy.values(1);
                        } catch (java.lang.Throwable th5) {
                            java.lang.Throwable cause = th5.getCause();
                            if (cause == null) {
                                throw th5;
                            }
                            throw cause;
                        }
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        settranslationy.AlternateContactlessPaymentDataJson = 3;
                        settranslationy.values(2);
                        settranslationy.values(3);
                        java.lang.Class cls5 = (java.lang.Class) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(3);
                        java.lang.String str5 = (java.lang.String) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(3);
                        invoke = cls5.getMethod(str5, (java.lang.Class[]) settranslationy.IccPrivateKeyCrtComponentsJson);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        settranslationy.values(1);
                    case -17:
                        try {
                            byte b9 = AlternateContactlessPaymentDataJson[13];
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b9, (short) (b9 | 339), objArr19);
                            invoke = java.lang.Class.forName((java.lang.String) objArr19[0]);
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                            settranslationy.values(1);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            i = 10;
                            if (i6 < 21) {
                            }
                            if (i6 < 60) {
                            }
                            throw th;
                        }
                        break;
                    case -16:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = new java.lang.Class[settranslationy.valueOf];
                        settranslationy.values(1);
                    case -15:
                        invoke = "writeReplace";
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        settranslationy.values(1);
                    case -14:
                        invoke = com.payair.hce.setLongClickable.class;
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        settranslationy.values(1);
                    case -13:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        int i8 = settranslationy.valueOf;
                        byte b10 = AlternateContactlessPaymentDataJson[13];
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        a(549, b10, (short) (b10 | 339), objArr20);
                        invoke = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr20[0]), i8);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        settranslationy.values(1);
                    case -12:
                        settranslationy.values(14);
                        throw ((java.lang.Throwable) settranslationy.IccPrivateKeyCrtComponentsJson);
                    case -11:
                        i5 = 19;
                    case -10:
                        i5 = 16;
                    case -9:
                        settranslationy.values(24);
                        i5 = settranslationy.valueOf == 0 ? 15 : i6;
                    case -8:
                        try {
                            settranslationy.AlternateContactlessPaymentDataJson = 1;
                            settranslationy.values(2);
                            settranslationy.values(3);
                            java.lang.Object obj4 = settranslationy.IccPrivateKeyCrtComponentsJson;
                            try {
                                byte b11 = AlternateContactlessPaymentDataJson[13];
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                a(524, b11, (short) (b11 | 336), objArr21);
                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                try {
                                    a(542, r5[22], (short) 359, objArr22);
                                    try {
                                        invoke = cls6.getMethod((java.lang.String) objArr22[0], null).invoke(obj4, null);
                                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                                        settranslationy.values(1);
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                        java.lang.Throwable cause2 = th.getCause();
                                        if (cause2 == null) {
                                            throw th;
                                        }
                                        throw cause2;
                                    }
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                }
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                            }
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                            i = 10;
                            if (i6 < 21) {
                            }
                            if (i6 < 60) {
                            }
                            throw th;
                        }
                        break;
                    case -7:
                        i5 = 21;
                    case -6:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(3);
                        java.lang.Object obj5 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        try {
                            byte b12 = AlternateContactlessPaymentDataJson[13];
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b12, (short) (b12 | 339), objArr23);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE, r5[16], (short) 361, objArr24);
                            invoke = cls7.getMethod((java.lang.String) objArr24[0], null).invoke(obj5, null);
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                            settranslationy.values(1);
                        } catch (java.lang.Throwable th11) {
                            java.lang.Throwable cause3 = th11.getCause();
                            if (cause3 == null) {
                                throw th11;
                            }
                            throw cause3;
                        }
                    case -5:
                        settranslationy.AlternateContactlessPaymentDataJson = 2;
                        settranslationy.values(2);
                        settranslationy.values(3);
                        int[] iArr2 = (int[]) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(10);
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        b(iArr2, settranslationy.valueOf, objArr25);
                        invoke = (java.lang.String) objArr25[0];
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        settranslationy.values(1);
                    case -4:
                        try {
                            settranslationy.AlternateContactlessPaymentDataJson = 3;
                            settranslationy.values(2);
                            settranslationy.values(3);
                            java.lang.Object obj6 = settranslationy.IccPrivateKeyCrtComponentsJson;
                            settranslationy.values(10);
                            int i9 = settranslationy.valueOf;
                            settranslationy.values(10);
                            try {
                                java.lang.Object[] objArr26 = {obj6, java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(settranslationy.valueOf)};
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                a(467, (byte) (AlternateContactlessPaymentDataJson[484] - 1), (short) 345, objArr27);
                                java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                a(488, r0[22], (short) 356, objArr28);
                                java.lang.String str6 = (java.lang.String) objArr28[0];
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                a(498, r0[13], (short) 345, objArr29);
                                settranslationy.AlternateContactlessPaymentDataJson = ((java.lang.Integer) cls8.getMethod(str6, java.lang.Class.forName((java.lang.String) objArr29[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr26)).intValue();
                                settranslationy.values(7);
                            } catch (java.lang.Throwable th12) {
                                java.lang.Throwable cause4 = th12.getCause();
                                if (cause4 == null) {
                                    throw th12;
                                }
                                throw cause4;
                            }
                        } catch (java.lang.Throwable th13) {
                            th = th13;
                            i = 10;
                            if (i6 < 21) {
                            }
                            if (i6 < 60) {
                            }
                            throw th;
                        }
                        break;
                    case -3:
                        obj = "";
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                        settranslationy.values(1);
                    case -2:
                        try {
                            obj = new int[]{-614633225, 1073238451};
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                            settranslationy.values(1);
                        } catch (java.lang.Throwable th14) {
                            th = th14;
                            i = 10;
                            if (i6 < 21) {
                            }
                            if (i6 < 60) {
                            }
                            throw th;
                        }
                        break;
                    case -1:
                        i5 = 42;
                    default:
                }
            }
            throw th;
        } catch (java.lang.Throwable th15) {
            java.lang.Throwable cause5 = th15.getCause();
            if (cause5 == null) {
                throw th15;
            }
            throw cause5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0420 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void writeReplace(long j, long j2) {
        int i;
        int values2;
        char c;
        java.lang.Object method;
        java.lang.Object invoke;
        java.lang.Object obj;
        com.payair.hce.setTranslationY settranslationy = new com.payair.hce.setTranslationY(j, j2);
        byte[] bArr = AlternateContactlessPaymentDataJson;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, bArr[577], (short) 162, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        int i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (byte) 74, (short) 366, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c2 = '\r';
            byte b = bArr[13];
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b, (short) (b | 339), objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) (DigitizedCardProfile - 1), bArr[92], (short) 362, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            byte b2 = bArr[13];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b2, (short) (b2 | 339), objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (true) {
                i = 3;
                if (i3 >= objArr7.length) {
                    break;
                }
                java.lang.Object[] objArr8 = {objArr7[i3]};
                short s = (short) (DigitizedCardProfile + 3);
                byte[] bArr2 = AlternateContactlessPaymentDataJson;
                byte b3 = bArr2[c2];
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(s, b3, (short) (b3 | 338), objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b4 = bArr2[5];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(157, b4, (short) (b4 | 360), objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                byte b5 = bArr2[c2];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b5, (short) (b5 | 339), objArr11);
                java.lang.Object invoke2 = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                byte b6 = bArr2[13];
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(s, b6, (short) (b6 | 338), objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(163, bArr2[16], (short) 359, objArr13);
                iArr[i3] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke2, null)).intValue();
                i3++;
                c2 = '\r';
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                    values2 = settranslationy.values(iArr[i4]);
                    c = kotlin.text.Typography.amp;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (i5 < 19) {
                    }
                    throw th;
                }
                switch (values2) {
                    case -30:
                        i4 = 19;
                    case -29:
                        i4 = 61;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -28:
                        settranslationy.values(38);
                        if (settranslationy.valueOf == 0) {
                            i4 = 60;
                            i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        }
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -27:
                        i4 = 1;
                    case -26:
                        i4 = 51;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -25:
                        try {
                            settranslationy.values(38);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i5 < 19) {
                            }
                            throw th;
                        }
                        if (settranslationy.valueOf == 0) {
                            i4 = 50;
                            i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        }
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                        break;
                    case -24:
                        c = 359;
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        values = settranslationy.valueOf;
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -23:
                        c = 359;
                        settranslationy.AlternateContactlessPaymentDataJson = writeReplace;
                        settranslationy.values(7);
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -22:
                        return;
                    case -21:
                        i4 = 42;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -20:
                        i4 = 40;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        c = 359;
                        values(new java.lang.Object[0], 1552721455, -1552721455, (int) java.lang.System.currentTimeMillis());
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        c = 359;
                        try {
                            settranslationy.AlternateContactlessPaymentDataJson = i;
                            settranslationy.values(2);
                            settranslationy.values(i);
                            java.lang.Object obj2 = settranslationy.IccPrivateKeyCrtComponentsJson;
                            settranslationy.values(i);
                            java.lang.Object obj3 = settranslationy.IccPrivateKeyCrtComponentsJson;
                            settranslationy.values(i);
                            try {
                                java.lang.Object[] objArr14 = {obj3, settranslationy.IccPrivateKeyCrtComponentsJson};
                                byte[] bArr3 = AlternateContactlessPaymentDataJson;
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a(564, bArr3[13], (short) 343, objArr15);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                a(com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_UNEXPECTED_ERROR, bArr3[16], (short) 361, objArr16);
                                java.lang.String str4 = (java.lang.String) objArr16[0];
                                byte b7 = bArr3[13];
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                a(549, b7, (short) (b7 | 339), objArr17);
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                a(592, bArr3[849], (short) 348, objArr18);
                                settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = cls4.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr17[0]), java.lang.Class.forName((java.lang.String) objArr18[0])).invoke(obj2, objArr14);
                                settranslationy.values(1);
                                i4 = i5;
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause = th3.getCause();
                                if (cause == null) {
                                    throw th3;
                                }
                                throw cause;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i5 < 19) {
                            }
                            throw th;
                        }
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                        break;
                    case -17:
                        c = 359;
                        settranslationy.AlternateContactlessPaymentDataJson = i;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        java.lang.Class cls5 = (java.lang.Class) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(i);
                        java.lang.String str5 = (java.lang.String) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(i);
                        method = cls5.getMethod(str5, (java.lang.Class[]) settranslationy.IccPrivateKeyCrtComponentsJson);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -16:
                        c = 359;
                        byte b8 = AlternateContactlessPaymentDataJson[13];
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        a(i2, b8, (short) (b8 | 339), objArr19);
                        method = java.lang.Class.forName((java.lang.String) objArr19[0]);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -15:
                        c = 359;
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = new java.lang.Class[settranslationy.valueOf];
                        settranslationy.values(1);
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -14:
                        c = 359;
                        method = "DigitizedCardProfile";
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -13:
                        c = 359;
                        method = com.payair.hce.setLongClickable.class;
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -12:
                        c = 359;
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        int i6 = settranslationy.valueOf;
                        byte b9 = AlternateContactlessPaymentDataJson[13];
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        a(549, b9, (short) (b9 | 339), objArr20);
                        method = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr20[0]), i6);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -11:
                        settranslationy.values(14);
                        throw ((java.lang.Throwable) settranslationy.IccPrivateKeyCrtComponentsJson);
                    case -10:
                        i4 = 17;
                    case -9:
                        i4 = 14;
                    case -8:
                        try {
                            c = 359;
                            settranslationy.values(24);
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            if (i5 < 19) {
                                break;
                            }
                            throw th;
                        }
                        if (settranslationy.valueOf == 0) {
                            i4 = 13;
                        } else {
                            i4 = i5;
                            i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        }
                    case -7:
                        try {
                            settranslationy.AlternateContactlessPaymentDataJson = 1;
                            settranslationy.values(2);
                            settranslationy.values(i);
                            obj = settranslationy.IccPrivateKeyCrtComponentsJson;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            c = 359;
                            if (i5 < 19 || i5 > 35) {
                                throw th;
                            }
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = th;
                            settranslationy.values(19);
                            i4 = 8;
                            i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        }
                        try {
                            byte b10 = AlternateContactlessPaymentDataJson[13];
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            a(524, b10, (short) (b10 | 336), objArr21);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            c = 359;
                            try {
                                a(542, r6[22], (short) 359, objArr22);
                                try {
                                    method = cls6.getMethod((java.lang.String) objArr22[0], null).invoke(obj, null);
                                    settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                                    settranslationy.values(1);
                                    i4 = i5;
                                    i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                                    i = 3;
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    java.lang.Throwable cause2 = th.getCause();
                                    if (cause2 == null) {
                                        throw th;
                                    }
                                    throw cause2;
                                }
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                            }
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                        }
                        break;
                    case -6:
                        i4 = 52;
                    case -5:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        java.lang.Object obj4 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        try {
                            byte b11 = AlternateContactlessPaymentDataJson[13];
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(i2, b11, (short) (b11 | 339), objArr23);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE, r6[16], (short) 361, objArr24);
                            invoke = cls7.getMethod((java.lang.String) objArr24[0], null).invoke(obj4, null);
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                            c = 359;
                            settranslationy.values(1);
                            i4 = i5;
                            i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        } catch (java.lang.Throwable th10) {
                            java.lang.Throwable cause3 = th10.getCause();
                            if (cause3 == null) {
                                throw th10;
                            }
                            throw cause3;
                        }
                    case -4:
                        settranslationy.AlternateContactlessPaymentDataJson = 2;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        int[] iArr2 = (int[]) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(10);
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        b(iArr2, settranslationy.valueOf, objArr25);
                        invoke = (java.lang.String) objArr25[0];
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        c = 359;
                        settranslationy.values(1);
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -3:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        try {
                            java.lang.Object[] objArr26 = {java.lang.Integer.valueOf(settranslationy.valueOf)};
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            a(814, (byte) (AlternateContactlessPaymentDataJson[484] - 1), (short) 338, objArr27);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            a(842, r0[22], (short) 360, objArr28);
                            settranslationy.AlternateContactlessPaymentDataJson = ((java.lang.Integer) cls8.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE).invoke(null, objArr26)).intValue();
                            settranslationy.values(7);
                            i4 = i5;
                            i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        } catch (java.lang.Throwable th11) {
                            java.lang.Throwable cause4 = th11.getCause();
                            if (cause4 == null) {
                                throw th11;
                            }
                            throw cause4;
                        }
                    case -2:
                        invoke = new int[]{2059383186, 1150496809};
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        c = 359;
                        settranslationy.values(1);
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -1:
                        i4 = 37;
                    default:
                        i4 = i5;
                        i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                }
            }
        } catch (java.lang.Throwable th12) {
            java.lang.Throwable cause5 = th12.getCause();
            if (cause5 == null) {
                throw th12;
            }
            throw cause5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04e6 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void DigitizedCardProfile(long j, long j2) {
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        int i5;
        char c2;
        java.lang.Object method;
        java.lang.Object invoke;
        com.payair.hce.setTranslationY settranslationy = new com.payair.hce.setTranslationY(j, j2);
        byte[] bArr = AlternateContactlessPaymentDataJson;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(848, bArr[577], bArr[1230], objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        int i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (byte) 74, (short) 366, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c3 = '\r';
            byte b = bArr[13];
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b, (short) (b | 339), objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) (DigitizedCardProfile - 1), bArr[92], (short) 362, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            byte b2 = bArr[13];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b2, (short) (b2 | 339), objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i7 = 0;
            while (true) {
                i = 3;
                if (i7 >= objArr7.length) {
                    break;
                }
                java.lang.Object[] objArr8 = {objArr7[i7]};
                short s = (short) (DigitizedCardProfile + 3);
                byte[] bArr2 = AlternateContactlessPaymentDataJson;
                byte b3 = bArr2[c3];
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(s, b3, (short) (b3 | 338), objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b4 = bArr2[5];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(157, b4, (short) (b4 | 360), objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                byte b5 = bArr2[c3];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b5, (short) (b5 | 339), objArr11);
                java.lang.Object invoke2 = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                byte b6 = bArr2[13];
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(s, b6, (short) (b6 | 338), objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(163, bArr2[16], (short) 359, objArr13);
                iArr[i7] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke2, null)).intValue();
                i7++;
                c3 = '\r';
            }
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                try {
                    c = 'N';
                } catch (java.lang.Throwable th) {
                    th = th;
                    i2 = 10;
                    i3 = i;
                }
                switch (settranslationy.values(iArr[i8])) {
                    case -41:
                        i8 = 97;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -40:
                        i2 = 10;
                        i3 = i;
                        try {
                            settranslationy.values(16);
                            i4 = settranslationy.valueOf;
                            i9 = 89;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i9 < 20) {
                            }
                            if (i9 < 64) {
                            }
                            throw th;
                        }
                        if (i4 != 78 && i4 == 95) {
                            i8 = 47;
                            i = i3;
                            i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        }
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        break;
                    case -39:
                        i8 = 92;
                    case -38:
                        i3 = i;
                        settranslationy.values(16);
                        i8 = settranslationy.valueOf != 0 ? 45 : 63;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -37:
                        i8 = 98;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -36:
                        i8 = 100;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -35:
                        i2 = 10;
                        i3 = i;
                        try {
                            settranslationy.values(13);
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            if (i9 < 20) {
                                break;
                            }
                            if (i9 < 64) {
                                break;
                            }
                            throw th;
                        }
                        if (settranslationy.valueOf == 0) {
                            i8 = 88;
                            i = i3;
                            i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        }
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -34:
                        i8 = 20;
                    case -33:
                        i8 = 79;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -32:
                        i2 = 10;
                        i3 = i;
                        try {
                            settranslationy.values(38);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i9 < 20 && i9 <= 39) {
                                i9 = i2;
                            } else {
                                if (i9 < 64 || i9 > 68) {
                                    throw th;
                                }
                                i9 = 62;
                            }
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = th;
                            settranslationy.values(19);
                            i8 = i9;
                            i = i3;
                            i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        }
                        if (settranslationy.valueOf == 0) {
                            i = i3;
                            i8 = 78;
                            i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        }
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        break;
                    case -31:
                        i3 = i;
                        try {
                            settranslationy.AlternateContactlessPaymentDataJson = 1;
                            settranslationy.values(2);
                            i2 = 10;
                            try {
                                settranslationy.values(10);
                                values = settranslationy.valueOf;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                if (i9 < 20) {
                                }
                                if (i9 < 64) {
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            i2 = 10;
                            if (i9 < 20) {
                            }
                            if (i9 < 64) {
                            }
                            throw th;
                        }
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        break;
                    case -30:
                        i3 = i;
                        i5 = writeReplace;
                        settranslationy.AlternateContactlessPaymentDataJson = i5;
                        settranslationy.values(7);
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -29:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        i3 = 3;
                        try {
                            settranslationy.values(3);
                            i5 = settranslationy.IccPrivateKeyCrtComponentsJson.hashCode();
                            settranslationy.AlternateContactlessPaymentDataJson = i5;
                            settranslationy.values(7);
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            i2 = 10;
                            if (i9 < 20) {
                            }
                            if (i9 < 64) {
                            }
                            throw th;
                        }
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        break;
                    case -28:
                        i8 = 93;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -27:
                        i8 = 95;
                    case -26:
                        try {
                            settranslationy.values(13);
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            i3 = 3;
                            i2 = 10;
                            if (i9 < 20) {
                            }
                            if (i9 < 64) {
                            }
                            throw th;
                        }
                        if (settranslationy.valueOf == 0) {
                            i8 = 61;
                            i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        } else {
                            i3 = 3;
                            i8 = i9;
                            i = i3;
                            i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        }
                        break;
                    case -25:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        writeReplace = settranslationy.valueOf;
                        i3 = 3;
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -24:
                        settranslationy.AlternateContactlessPaymentDataJson = values;
                        settranslationy.values(7);
                        i3 = 3;
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -23:
                        i8 = 68;
                    case -22:
                        return;
                    case -21:
                        i8 = 1;
                    case -20:
                        i8 = 52;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        values(new java.lang.Object[0], 1552721455, -1552721455, (int) java.lang.System.currentTimeMillis());
                        i3 = 3;
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        try {
                            settranslationy.AlternateContactlessPaymentDataJson = i;
                            settranslationy.values(2);
                            settranslationy.values(i);
                            java.lang.Object obj = settranslationy.IccPrivateKeyCrtComponentsJson;
                            settranslationy.values(i);
                            java.lang.Object obj2 = settranslationy.IccPrivateKeyCrtComponentsJson;
                            settranslationy.values(i);
                            try {
                                java.lang.Object[] objArr14 = {obj2, settranslationy.IccPrivateKeyCrtComponentsJson};
                                byte[] bArr3 = AlternateContactlessPaymentDataJson;
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a(564, bArr3[13], (short) 343, objArr15);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                a(com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_UNEXPECTED_ERROR, bArr3[16], (short) 361, objArr16);
                                java.lang.String str4 = (java.lang.String) objArr16[0];
                                byte b7 = bArr3[13];
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                a(549, b7, (short) (b7 | 339), objArr17);
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                a(592, bArr3[849], (short) 348, objArr18);
                                settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = cls4.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr17[0]), java.lang.Class.forName((java.lang.String) objArr18[0])).invoke(obj, objArr14);
                                settranslationy.values(1);
                                i3 = 3;
                            } catch (java.lang.Throwable th9) {
                                java.lang.Throwable cause = th9.getCause();
                                if (cause == null) {
                                    throw th9;
                                }
                                throw cause;
                            }
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                            i2 = 10;
                            i3 = 3;
                            if (i9 < 20) {
                            }
                            if (i9 < 64) {
                            }
                            throw th;
                        }
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        break;
                    case -17:
                        c2 = 359;
                        settranslationy.AlternateContactlessPaymentDataJson = i;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        java.lang.Class cls5 = (java.lang.Class) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(i);
                        java.lang.String str5 = (java.lang.String) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(i);
                        method = cls5.getMethod(str5, (java.lang.Class[]) settranslationy.IccPrivateKeyCrtComponentsJson);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i3 = i;
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -16:
                        c2 = 359;
                        byte b8 = AlternateContactlessPaymentDataJson[13];
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        a(i6, b8, (short) (b8 | 339), objArr19);
                        method = java.lang.Class.forName((java.lang.String) objArr19[0]);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i3 = i;
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -15:
                        c2 = 359;
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = new java.lang.Class[settranslationy.valueOf];
                        settranslationy.values(1);
                        i3 = i;
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -14:
                        c2 = 359;
                        method = "AlternateContactlessPaymentDataJson";
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i3 = i;
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -13:
                        c2 = 359;
                        method = com.payair.hce.setLongClickable.class;
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i3 = i;
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -12:
                        c2 = 359;
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        int i10 = settranslationy.valueOf;
                        byte b9 = AlternateContactlessPaymentDataJson[13];
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        a(549, b9, (short) (b9 | 339), objArr20);
                        method = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr20[0]), i10);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i3 = i;
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -11:
                        settranslationy.values(14);
                        throw ((java.lang.Throwable) settranslationy.IccPrivateKeyCrtComponentsJson);
                    case -10:
                        i8 = 18;
                    case -9:
                        i8 = 16;
                    case -8:
                        try {
                            settranslationy.values(24);
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                            i2 = 10;
                            i3 = i;
                            if (i9 < 20) {
                            }
                            if (i9 < 64) {
                            }
                            throw th;
                        }
                        if (settranslationy.valueOf == 0) {
                            i8 = 15;
                        } else {
                            i3 = i;
                            i8 = i9;
                            i = i3;
                            i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        }
                        break;
                    case -7:
                        try {
                            settranslationy.AlternateContactlessPaymentDataJson = 1;
                            settranslationy.values(2);
                            settranslationy.values(i);
                            java.lang.Object obj3 = settranslationy.IccPrivateKeyCrtComponentsJson;
                            try {
                                byte b10 = AlternateContactlessPaymentDataJson[13];
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                a(524, b10, (short) (b10 | 336), objArr21);
                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                c2 = 359;
                                try {
                                    a(542, r6[22], (short) 359, objArr22);
                                    try {
                                        method = cls6.getMethod((java.lang.String) objArr22[0], null).invoke(obj3, null);
                                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                                        settranslationy.values(1);
                                        i3 = i;
                                    } catch (java.lang.Throwable th12) {
                                        th = th12;
                                        java.lang.Throwable cause2 = th.getCause();
                                        if (cause2 == null) {
                                            throw th;
                                        }
                                        throw cause2;
                                    }
                                } catch (java.lang.Throwable th13) {
                                    th = th13;
                                }
                            } catch (java.lang.Throwable th14) {
                                th = th14;
                            }
                        } catch (java.lang.Throwable th15) {
                            th = th15;
                            c = 359;
                            i2 = 10;
                            i3 = i;
                            if (i9 < 20) {
                            }
                            if (i9 < 64) {
                            }
                            throw th;
                        }
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        break;
                    case -6:
                        i8 = 80;
                    case -5:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        java.lang.Object obj4 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        try {
                            byte b11 = AlternateContactlessPaymentDataJson[13];
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(i6, b11, (short) (b11 | 339), objArr23);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE, r6[16], (short) 361, objArr24);
                            invoke = cls7.getMethod((java.lang.String) objArr24[0], null).invoke(obj4, null);
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                            settranslationy.values(1);
                            i3 = i;
                            i8 = i9;
                            i = i3;
                            i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        } catch (java.lang.Throwable th16) {
                            java.lang.Throwable cause3 = th16.getCause();
                            if (cause3 == null) {
                                throw th16;
                            }
                            throw cause3;
                        }
                    case -4:
                        settranslationy.AlternateContactlessPaymentDataJson = 2;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        int[] iArr2 = (int[]) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(10);
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        b(iArr2, settranslationy.valueOf, objArr25);
                        invoke = (java.lang.String) objArr25[0];
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        settranslationy.values(1);
                        i3 = i;
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -3:
                        try {
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(1184, (byte) (AlternateContactlessPaymentDataJson[484] - 1), (short) 337, objArr26);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            a(1213, r0[22], (short) 348, objArr27);
                            settranslationy.AlternateContactlessPaymentDataJson = ((java.lang.Integer) cls8.getMethod((java.lang.String) objArr27[0], null).invoke(null, null)).intValue();
                            settranslationy.values(7);
                            i3 = i;
                            i8 = i9;
                            i = i3;
                            i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        } catch (java.lang.Throwable th17) {
                            java.lang.Throwable cause4 = th17.getCause();
                            if (cause4 == null) {
                                throw th17;
                            }
                            throw cause4;
                        }
                    case -2:
                        try {
                            invoke = new int[]{366529585, 594850375};
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                            settranslationy.values(1);
                            i3 = i;
                        } catch (java.lang.Throwable th18) {
                            th = th18;
                            i2 = 10;
                            i3 = i;
                            if (i9 < 20) {
                            }
                            if (i9 < 64) {
                            }
                            throw th;
                        }
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        break;
                    case -1:
                        i8 = 41;
                    default:
                        i3 = i;
                        i8 = i9;
                        i = i3;
                        i6 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                }
            }
        } catch (java.lang.Throwable th19) {
            java.lang.Throwable cause5 = th19.getCause();
            if (cause5 == null) {
                throw th19;
            }
            throw cause5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03fc A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void valueOf(long j, long j2) {
        int i;
        ?? r11;
        java.lang.Object invoke;
        java.lang.Object method;
        java.lang.Object obj;
        com.payair.hce.setTranslationY settranslationy = new com.payair.hce.setTranslationY(j, j2);
        int i2 = DigitizedCardProfile;
        byte[] bArr = AlternateContactlessPaymentDataJson;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((short) (i2 | 1093), bArr[577], (short) 129, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        int i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (byte) 74, (short) 366, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c = '\r';
            byte b = bArr[13];
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b, (short) (b | 339), objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) (i2 - 1), bArr[92], (short) 362, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            byte b2 = bArr[13];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b2, (short) (b2 | 339), objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i4 = 0;
            while (true) {
                i = 3;
                if (i4 >= objArr7.length) {
                    break;
                }
                java.lang.Object[] objArr8 = {objArr7[i4]};
                short s = (short) (DigitizedCardProfile + 3);
                byte[] bArr2 = AlternateContactlessPaymentDataJson;
                byte b3 = bArr2[c];
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(s, b3, (short) (b3 | 338), objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b4 = bArr2[5];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(157, b4, (short) (b4 | 360), objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                byte b5 = bArr2[c];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b5, (short) (b5 | 339), objArr11);
                java.lang.Object invoke2 = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                byte b6 = bArr2[13];
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(s, b6, (short) (b6 | 338), objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(163, bArr2[16], (short) 359, objArr13);
                iArr[i4] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke2, null)).intValue();
                i4++;
                c = '\r';
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                try {
                    r11 = 38;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (i6 >= 19) {
                    }
                    throw th;
                }
                switch (settranslationy.values(iArr[i5])) {
                    case -31:
                        i5 = 1;
                    case -30:
                        i5 = 71;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -29:
                        settranslationy.values(38);
                        if (settranslationy.valueOf == 0) {
                            i5 = 70;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        }
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -28:
                        i5 = 19;
                    case -27:
                        i5 = 58;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -26:
                        try {
                            settranslationy.values(38);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i6 >= 19) {
                            }
                            throw th;
                        }
                        if (settranslationy.valueOf == 0) {
                            i5 = 57;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        }
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                        break;
                    case -25:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        values = settranslationy.valueOf;
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -24:
                        settranslationy.AlternateContactlessPaymentDataJson = writeReplace;
                        settranslationy.values(7);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -23:
                        i5 = 48;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -22:
                        return;
                    case -21:
                        i5 = 59;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -20:
                        i5 = 43;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        values(new java.lang.Object[0], 1552721455, -1552721455, (int) java.lang.System.currentTimeMillis());
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        settranslationy.AlternateContactlessPaymentDataJson = i;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        java.lang.Object obj2 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(i);
                        java.lang.Object obj3 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(i);
                        try {
                            java.lang.Object[] objArr14 = {obj3, settranslationy.IccPrivateKeyCrtComponentsJson};
                            byte[] bArr3 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            a(564, bArr3[13], (short) 343, objArr15);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            a(com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_UNEXPECTED_ERROR, bArr3[16], (short) 361, objArr16);
                            java.lang.String str4 = (java.lang.String) objArr16[0];
                            byte b7 = bArr3[13];
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            a(549, b7, (short) (b7 | 339), objArr17);
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            a(592, bArr3[849], (short) 348, objArr18);
                            invoke = cls4.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr17[0]), java.lang.Class.forName((java.lang.String) objArr18[0])).invoke(obj2, objArr14);
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                            settranslationy.values(1);
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause = th3.getCause();
                            if (cause == null) {
                                throw th3;
                            }
                            throw cause;
                        }
                    case -17:
                        settranslationy.AlternateContactlessPaymentDataJson = i;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        java.lang.Class cls5 = (java.lang.Class) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(i);
                        java.lang.String str5 = (java.lang.String) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(i);
                        method = cls5.getMethod(str5, (java.lang.Class[]) settranslationy.IccPrivateKeyCrtComponentsJson);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -16:
                        byte b8 = AlternateContactlessPaymentDataJson[13];
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        a(i3, b8, (short) (b8 | 339), objArr19);
                        method = java.lang.Class.forName((java.lang.String) objArr19[0]);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -15:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = new java.lang.Class[settranslationy.valueOf];
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -14:
                        method = "getProfileVersion";
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -13:
                        method = com.payair.hce.setLongClickable.class;
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -12:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        int i7 = settranslationy.valueOf;
                        byte b9 = AlternateContactlessPaymentDataJson[13];
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        a(549, b9, (short) (b9 | 339), objArr20);
                        method = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr20[0]), i7);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -11:
                        settranslationy.values(14);
                        throw ((java.lang.Throwable) settranslationy.IccPrivateKeyCrtComponentsJson);
                    case -10:
                        i5 = 17;
                    case -9:
                        i5 = 15;
                    case -8:
                        try {
                            settranslationy.values(24);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i6 >= 19) {
                                break;
                            }
                            throw th;
                        }
                        if (settranslationy.valueOf == 0) {
                            i5 = 14;
                        } else {
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        }
                    case -7:
                        try {
                            settranslationy.AlternateContactlessPaymentDataJson = 1;
                            settranslationy.values(2);
                            settranslationy.values(i);
                            obj = settranslationy.IccPrivateKeyCrtComponentsJson;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            r11 = 0;
                            if (i6 >= 19 || i6 > 36) {
                                throw th;
                            }
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = th;
                            settranslationy.values(19);
                            i5 = 9;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        }
                        try {
                            byte b10 = AlternateContactlessPaymentDataJson[13];
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            a(524, b10, (short) (b10 | 336), objArr21);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            try {
                                a(542, r7[22], (short) 359, objArr22);
                                try {
                                    method = cls6.getMethod((java.lang.String) objArr22[0], null).invoke(obj, null);
                                    settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                                    settranslationy.values(1);
                                    i5 = i6;
                                    i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                                    i = 3;
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    java.lang.Throwable cause2 = th.getCause();
                                    if (cause2 == null) {
                                        throw th;
                                    }
                                    throw cause2;
                                }
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                        }
                        break;
                    case -6:
                        i5 = 45;
                    case -5:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        java.lang.Object obj4 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        try {
                            byte b11 = AlternateContactlessPaymentDataJson[13];
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(i3, b11, (short) (b11 | 339), objArr23);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE, r8[16], (short) 361, objArr24);
                            invoke = cls7.getMethod((java.lang.String) objArr24[0], null).invoke(obj4, null);
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                            settranslationy.values(1);
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        } catch (java.lang.Throwable th9) {
                            java.lang.Throwable cause3 = th9.getCause();
                            if (cause3 == null) {
                                throw th9;
                            }
                            throw cause3;
                        }
                    case -4:
                        settranslationy.AlternateContactlessPaymentDataJson = 2;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        int[] iArr2 = (int[]) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(10);
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        b(iArr2, settranslationy.valueOf, objArr25);
                        invoke = (java.lang.String) objArr25[0];
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -3:
                        try {
                            byte[] bArr4 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(1468, (byte) (bArr4[484] - 1), (short) 345, objArr26);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                            byte b12 = bArr4[37];
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            a(1489, b12, (short) (b12 | 354), objArr27);
                            settranslationy.DigitizedCardProfile = ((java.lang.Long) cls8.getMethod((java.lang.String) objArr27[0], null).invoke(null, null)).longValue();
                            settranslationy.values(61);
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        } catch (java.lang.Throwable th10) {
                            java.lang.Throwable cause4 = th10.getCause();
                            if (cause4 == null) {
                                throw th10;
                            }
                            throw cause4;
                        }
                    case -2:
                        invoke = new int[]{-733320650, 1856451661};
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -1:
                        i5 = 38;
                    default:
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                }
            }
            throw th;
        } catch (java.lang.Throwable th11) {
            java.lang.Throwable cause5 = th11.getCause();
            if (cause5 == null) {
                throw th11;
            }
            throw cause5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0482 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void values(long j, long j2) {
        int i;
        char c;
        int i2;
        java.lang.Object invoke;
        char c2;
        java.lang.Object method;
        java.lang.Object obj;
        com.payair.hce.setTranslationY settranslationy = new com.payair.hce.setTranslationY(j, j2);
        byte[] bArr = AlternateContactlessPaymentDataJson;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(1500, bArr[577], bArr[825], objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        int i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (byte) 74, (short) 366, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c3 = '\r';
            byte b = bArr[13];
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b, (short) (b | 339), objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) (DigitizedCardProfile - 1), bArr[92], (short) 362, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            byte b2 = bArr[13];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b2, (short) (b2 | 339), objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i4 = 0;
            while (true) {
                i = 3;
                if (i4 >= objArr7.length) {
                    break;
                }
                java.lang.Object[] objArr8 = {objArr7[i4]};
                short s = (short) (DigitizedCardProfile + 3);
                byte[] bArr2 = AlternateContactlessPaymentDataJson;
                byte b3 = bArr2[c3];
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(s, b3, (short) (b3 | 338), objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b4 = bArr2[5];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(157, b4, (short) (b4 | 360), objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                byte b5 = bArr2[c3];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b5, (short) (b5 | 339), objArr11);
                java.lang.Object invoke2 = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                byte b6 = bArr2[13];
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(s, b6, (short) (b6 | 338), objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(163, bArr2[16], (short) 359, objArr13);
                iArr[i4] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke2, null)).intValue();
                i4++;
                c3 = '\r';
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                try {
                    c = 7;
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                switch (settranslationy.values(iArr[i5])) {
                    case -36:
                        i5 = 84;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -35:
                        try {
                            settranslationy.values(16);
                            i5 = settranslationy.valueOf != 0 ? 44 : 57;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i6 < 20) {
                            }
                            if (i6 < 58) {
                            }
                            throw th;
                        }
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                        break;
                    case -34:
                        i5 = 79;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -33:
                        settranslationy.values(16);
                        i5 = settranslationy.valueOf != 0 ? 1 : 71;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -32:
                        i5 = 80;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -31:
                        i5 = 82;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -30:
                        try {
                            settranslationy.values(13);
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            if (i6 < 20) {
                            }
                            if (i6 < 58) {
                            }
                            throw th;
                        }
                        if (settranslationy.valueOf == 0) {
                            i5 = 70;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        }
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                        break;
                    case -29:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        writeReplace = settranslationy.valueOf;
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -28:
                        i2 = values;
                        settranslationy.AlternateContactlessPaymentDataJson = i2;
                        settranslationy.values(7);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -27:
                        i5 = 85;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -26:
                        i5 = 87;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -25:
                        settranslationy.values(38);
                        if (settranslationy.valueOf == 0) {
                            i5 = 55;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        }
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -24:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        values = settranslationy.valueOf;
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -23:
                        try {
                            i2 = writeReplace;
                            settranslationy.AlternateContactlessPaymentDataJson = i2;
                            settranslationy.values(7);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i6 < 20 && i6 <= 37) {
                                i6 = 9;
                            } else {
                                if (i6 < 58 || i6 > 61) {
                                    throw th;
                                }
                                i6 = 56;
                            }
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = th;
                            settranslationy.values(19);
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        }
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                        break;
                    case -22:
                        return;
                    case -21:
                        i5 = 61;
                    case -20:
                        i5 = 46;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        values(new java.lang.Object[0], 1552721455, -1552721455, (int) java.lang.System.currentTimeMillis());
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        settranslationy.AlternateContactlessPaymentDataJson = i;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        java.lang.Object obj2 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(i);
                        java.lang.Object obj3 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(i);
                        try {
                            java.lang.Object[] objArr14 = {obj3, settranslationy.IccPrivateKeyCrtComponentsJson};
                            byte[] bArr3 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            a(564, bArr3[13], (short) 343, objArr15);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            a(com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_UNEXPECTED_ERROR, bArr3[16], (short) 361, objArr16);
                            java.lang.String str4 = (java.lang.String) objArr16[0];
                            byte b7 = bArr3[13];
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            a(549, b7, (short) (b7 | 339), objArr17);
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            a(592, bArr3[849], (short) 348, objArr18);
                            invoke = cls4.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr17[0]), java.lang.Class.forName((java.lang.String) objArr18[0])).invoke(obj2, objArr14);
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                            settranslationy.values(1);
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        } catch (java.lang.Throwable th5) {
                            java.lang.Throwable cause = th5.getCause();
                            if (cause == null) {
                                throw th5;
                            }
                            throw cause;
                        }
                    case -17:
                        c2 = 359;
                        settranslationy.AlternateContactlessPaymentDataJson = i;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        java.lang.Class cls5 = (java.lang.Class) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(i);
                        java.lang.String str5 = (java.lang.String) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(i);
                        method = cls5.getMethod(str5, (java.lang.Class[]) settranslationy.IccPrivateKeyCrtComponentsJson);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -16:
                        c2 = 359;
                        byte b8 = AlternateContactlessPaymentDataJson[13];
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        a(i3, b8, (short) (b8 | 339), objArr19);
                        method = java.lang.Class.forName((java.lang.String) objArr19[0]);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -15:
                        c2 = 359;
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = new java.lang.Class[settranslationy.valueOf];
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -14:
                        c2 = 359;
                        method = "valueOf";
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -13:
                        c2 = 359;
                        method = com.payair.hce.setLongClickable.class;
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -12:
                        c2 = 359;
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        int i7 = settranslationy.valueOf;
                        byte b9 = AlternateContactlessPaymentDataJson[13];
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        a(549, b9, (short) (b9 | 339), objArr20);
                        method = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr20[0]), i7);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -11:
                        settranslationy.values(14);
                        throw ((java.lang.Throwable) settranslationy.IccPrivateKeyCrtComponentsJson);
                    case -10:
                        i5 = 18;
                    case -9:
                        i5 = 15;
                    case -8:
                        try {
                            settranslationy.values(24);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            if (i6 < 20) {
                                break;
                            }
                            if (i6 < 58) {
                                break;
                            }
                            throw th;
                        }
                        if (settranslationy.valueOf == 0) {
                            i5 = 14;
                        } else {
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        }
                    case -7:
                        try {
                            settranslationy.AlternateContactlessPaymentDataJson = 1;
                            settranslationy.values(2);
                            settranslationy.values(i);
                            obj = settranslationy.IccPrivateKeyCrtComponentsJson;
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            c = 359;
                            if (i6 < 20) {
                            }
                            if (i6 < 58) {
                            }
                            throw th;
                        }
                        try {
                            byte b10 = AlternateContactlessPaymentDataJson[13];
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            a(524, b10, (short) (b10 | 336), objArr21);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            c2 = 359;
                            try {
                                a(542, r6[22], (short) 359, objArr22);
                                try {
                                    method = cls6.getMethod((java.lang.String) objArr22[0], null).invoke(obj, null);
                                    settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = method;
                                    settranslationy.values(1);
                                    i5 = i6;
                                    i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                                    i = 3;
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                    java.lang.Throwable cause2 = th.getCause();
                                    if (cause2 == null) {
                                        throw th;
                                    }
                                    throw cause2;
                                }
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                            }
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                        }
                        break;
                    case -6:
                        i5 = 20;
                    case -5:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        java.lang.Object obj4 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        try {
                            byte b11 = AlternateContactlessPaymentDataJson[13];
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(i3, b11, (short) (b11 | 339), objArr23);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE, r6[16], (short) 361, objArr24);
                            invoke = cls7.getMethod((java.lang.String) objArr24[0], null).invoke(obj4, null);
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                            settranslationy.values(1);
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        } catch (java.lang.Throwable th11) {
                            java.lang.Throwable cause3 = th11.getCause();
                            if (cause3 == null) {
                                throw th11;
                            }
                            throw cause3;
                        }
                    case -4:
                        settranslationy.AlternateContactlessPaymentDataJson = 2;
                        settranslationy.values(2);
                        settranslationy.values(i);
                        int[] iArr2 = (int[]) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(10);
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        b(iArr2, settranslationy.valueOf, objArr25);
                        invoke = (java.lang.String) objArr25[0];
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -3:
                        try {
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(1184, (byte) (AlternateContactlessPaymentDataJson[484] - 1), (short) 337, objArr26);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            a(1789, r0[22], (short) 349, objArr27);
                            settranslationy.AlternateContactlessPaymentDataJson = ((java.lang.Integer) cls8.getMethod((java.lang.String) objArr27[0], null).invoke(null, null)).intValue();
                            settranslationy.values(7);
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i = 3;
                        } catch (java.lang.Throwable th12) {
                            java.lang.Throwable cause4 = th12.getCause();
                            if (cause4 == null) {
                                throw th12;
                            }
                            throw cause4;
                        }
                    case -2:
                        invoke = new int[]{-573028095, 1366878755};
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                    case -1:
                        i5 = 39;
                    default:
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        i = 3;
                }
            }
            throw th;
        } catch (java.lang.Throwable th13) {
            java.lang.Throwable cause5 = th13.getCause();
            if (cause5 == null) {
                throw th13;
            }
            throw cause5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04f3 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void RecordsJson(long j, long j2) {
        ?? r11;
        char c;
        int i;
        int i2;
        java.lang.Object invoke;
        java.lang.Object declaredMethod;
        java.lang.Object obj;
        java.lang.Class<?> cls;
        java.lang.Object[] objArr;
        com.payair.hce.setTranslationY settranslationy = new com.payair.hce.setTranslationY(j, j2);
        byte[] bArr = AlternateContactlessPaymentDataJson;
        char c2 = 5;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(1806, bArr[577], bArr[5], objArr2);
        java.lang.String str = (java.lang.String) objArr2[0];
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        int i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (byte) 74, (short) 366, objArr3);
        try {
            java.lang.Object[] objArr4 = {(java.lang.String) objArr3[0]};
            char c3 = '\r';
            byte b = bArr[13];
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b, (short) (b | 339), objArr5);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((short) (DigitizedCardProfile - 1), bArr[92], (short) 362, objArr6);
            java.lang.String str2 = (java.lang.String) objArr6[0];
            byte b2 = bArr[13];
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b2, (short) (b2 | 339), objArr7);
            java.lang.Object[] objArr8 = (java.lang.Object[]) cls2.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr7[0])).invoke(str, objArr4);
            int[] iArr = new int[objArr8.length];
            int i4 = 0;
            while (i4 < objArr8.length) {
                java.lang.Object[] objArr9 = {objArr8[i4]};
                short s = (short) (DigitizedCardProfile + 3);
                byte[] bArr2 = AlternateContactlessPaymentDataJson;
                byte b3 = bArr2[c3];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(s, b3, (short) (b3 | 338), objArr10);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                byte b4 = bArr2[c2];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(157, b4, (short) (b4 | 360), objArr11);
                java.lang.String str3 = (java.lang.String) objArr11[0];
                byte b5 = bArr2[c3];
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b5, (short) (b5 | 339), objArr12);
                java.lang.Object invoke2 = cls3.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr12[0])).invoke(null, objArr9);
                byte b6 = bArr2[13];
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(s, b6, (short) (b6 | 338), objArr13);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a(163, bArr2[16], (short) 359, objArr14);
                iArr[i4] = ((java.lang.Integer) cls4.getMethod((java.lang.String) objArr14[0], null).invoke(invoke2, null)).intValue();
                i4++;
                c2 = 5;
                c3 = '\r';
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                try {
                    r11 = 7;
                    c = 'A';
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (i6 < 19) {
                    }
                    if (i6 >= 95) {
                    }
                    throw th;
                }
                switch (settranslationy.values(iArr[i5])) {
                    case -44:
                        i5 = 104;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -43:
                        try {
                            settranslationy.values(16);
                            i = settranslationy.valueOf;
                            i6 = 94;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i6 < 19) {
                            }
                            if (i6 >= 95) {
                            }
                            throw th;
                        }
                        if (i != 65 && i == 90) {
                            i5 = 40;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        }
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        break;
                    case -42:
                        i5 = 99;
                    case -41:
                        settranslationy.values(16);
                        int i7 = settranslationy.valueOf;
                        i5 = (i7 == 0 || i7 != 1) ? 66 : 1;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -40:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(3);
                        settranslationy.AlternateContactlessPaymentDataJson = settranslationy.IccPrivateKeyCrtComponentsJson.hashCode();
                        settranslationy.values(7);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -39:
                        i5 = 105;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -38:
                        i5 = 107;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -37:
                        try {
                            settranslationy.values(13);
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            if (i6 < 19) {
                            }
                            if (i6 >= 95) {
                            }
                            throw th;
                        }
                        if (settranslationy.valueOf == 0) {
                            i5 = 92;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        }
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        break;
                    case -36:
                        i5 = 19;
                    case -35:
                        i5 = 83;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -34:
                        settranslationy.values(13);
                        if (settranslationy.valueOf == 0) {
                            i5 = 82;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        }
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -33:
                        i5 = 100;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -32:
                        i5 = 102;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -31:
                        try {
                            settranslationy.values(13);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i6 < 19) {
                            }
                            if (i6 >= 95) {
                            }
                            throw th;
                        }
                        if (settranslationy.valueOf == 0) {
                            i5 = 65;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        }
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        break;
                    case -30:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        writeReplace = settranslationy.valueOf;
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -29:
                        i2 = values;
                        settranslationy.AlternateContactlessPaymentDataJson = i2;
                        settranslationy.values(7);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -28:
                        i5 = 42;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -27:
                        i5 = 56;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -26:
                        settranslationy.values(38);
                        if (settranslationy.valueOf == 0) {
                            i5 = 55;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        } else {
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        }
                    case -25:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        values = settranslationy.valueOf;
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -24:
                        try {
                            i2 = writeReplace;
                            settranslationy.AlternateContactlessPaymentDataJson = i2;
                            settranslationy.values(7);
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            if (i6 < 19 && i6 <= 35) {
                                i6 = 9;
                            } else {
                                if (i6 >= 95 || i6 > 99) {
                                    throw th;
                                }
                                i6 = 93;
                            }
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = th;
                            settranslationy.values(19);
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        }
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        break;
                    case -23:
                        i5 = 73;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -22:
                        return;
                    case -21:
                        i5 = 57;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -20:
                        i5 = 84;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        try {
                            values(new java.lang.Object[0], 1552721455, -1552721455, (int) java.lang.System.currentTimeMillis());
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            if (i6 < 19) {
                            }
                            if (i6 >= 95) {
                            }
                            throw th;
                        }
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        settranslationy.AlternateContactlessPaymentDataJson = 3;
                        settranslationy.values(2);
                        settranslationy.values(3);
                        java.lang.Object obj2 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(3);
                        java.lang.Object obj3 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(3);
                        try {
                            java.lang.Object[] objArr15 = {obj3, settranslationy.IccPrivateKeyCrtComponentsJson};
                            byte[] bArr3 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            a(564, bArr3[13], (short) 343, objArr16);
                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            a(com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_UNEXPECTED_ERROR, bArr3[16], (short) 361, objArr17);
                            java.lang.String str4 = (java.lang.String) objArr17[0];
                            byte b7 = bArr3[13];
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            a(549, b7, (short) (b7 | 339), objArr18);
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            a(592, bArr3[849], (short) 348, objArr19);
                            invoke = cls5.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr18[0]), java.lang.Class.forName((java.lang.String) objArr19[0])).invoke(obj2, objArr15);
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                            settranslationy.values(1);
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        } catch (java.lang.Throwable th7) {
                            java.lang.Throwable cause = th7.getCause();
                            if (cause == null) {
                                throw th7;
                            }
                            throw cause;
                        }
                    case -17:
                        settranslationy.AlternateContactlessPaymentDataJson = 3;
                        settranslationy.values(2);
                        settranslationy.values(3);
                        java.lang.Class cls6 = (java.lang.Class) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(3);
                        java.lang.String str5 = (java.lang.String) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(3);
                        declaredMethod = cls6.getDeclaredMethod(str5, (java.lang.Class[]) settranslationy.IccPrivateKeyCrtComponentsJson);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = declaredMethod;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -16:
                        byte b8 = AlternateContactlessPaymentDataJson[13];
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        a(i3, b8, (short) (b8 | 339), objArr20);
                        declaredMethod = java.lang.Class.forName((java.lang.String) objArr20[0]);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = declaredMethod;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -15:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = new java.lang.Class[settranslationy.valueOf];
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -14:
                        declaredMethod = "values";
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = declaredMethod;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -13:
                        declaredMethod = com.payair.hce.setLongClickable.class;
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = declaredMethod;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -12:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        int i8 = settranslationy.valueOf;
                        byte b9 = AlternateContactlessPaymentDataJson[13];
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a(549, b9, (short) (b9 | 339), objArr21);
                        declaredMethod = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr21[0]), i8);
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = declaredMethod;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -11:
                        settranslationy.values(14);
                        throw ((java.lang.Throwable) settranslationy.IccPrivateKeyCrtComponentsJson);
                    case -10:
                        i5 = 17;
                    case -9:
                        i5 = 15;
                    case -8:
                        try {
                            settranslationy.values(24);
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            if (i6 < 19) {
                                break;
                            }
                            if (i6 >= 95) {
                                break;
                            }
                            throw th;
                        }
                        if (settranslationy.valueOf == 0) {
                            i5 = 14;
                        } else {
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        }
                    case -7:
                        try {
                            settranslationy.AlternateContactlessPaymentDataJson = 1;
                            settranslationy.values(2);
                            settranslationy.values(3);
                            obj = settranslationy.IccPrivateKeyCrtComponentsJson;
                            try {
                                byte b10 = AlternateContactlessPaymentDataJson[13];
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                a(524, b10, (short) (b10 | 336), objArr22);
                                cls = java.lang.Class.forName((java.lang.String) objArr22[0]);
                                objArr = new java.lang.Object[1];
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                            }
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                            r11 = 0;
                            c = 359;
                            if (i6 < 19) {
                            }
                            if (i6 >= 95) {
                            }
                            throw th;
                        }
                        try {
                            a(542, r6[22], (short) 359, objArr);
                            try {
                                declaredMethod = cls.getMethod((java.lang.String) objArr[0], null).invoke(obj, null);
                                settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = declaredMethod;
                                settranslationy.values(1);
                                i5 = i6;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
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
                    case -6:
                        i5 = 46;
                    case -5:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(3);
                        java.lang.Object obj4 = settranslationy.IccPrivateKeyCrtComponentsJson;
                        try {
                            byte b11 = AlternateContactlessPaymentDataJson[13];
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(i3, b11, (short) (b11 | 339), objArr23);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE, r6[16], (short) 361, objArr24);
                            invoke = cls7.getMethod((java.lang.String) objArr24[0], null).invoke(obj4, null);
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                            settranslationy.values(1);
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        } catch (java.lang.Throwable th13) {
                            java.lang.Throwable cause3 = th13.getCause();
                            if (cause3 == null) {
                                throw th13;
                            }
                            throw cause3;
                        }
                    case -4:
                        settranslationy.AlternateContactlessPaymentDataJson = 2;
                        settranslationy.values(2);
                        settranslationy.values(3);
                        int[] iArr2 = (int[]) settranslationy.IccPrivateKeyCrtComponentsJson;
                        settranslationy.values(10);
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        b(iArr2, settranslationy.valueOf, objArr25);
                        invoke = (java.lang.String) objArr25[0];
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -3:
                        try {
                            byte[] bArr4 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(1468, (byte) (bArr4[484] - 1), (short) 345, objArr26);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                            byte b12 = bArr4[30];
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            a(2172, b12, (short) (b12 | 330), objArr27);
                            settranslationy.DigitizedCardProfile = ((java.lang.Long) cls8.getMethod((java.lang.String) objArr27[0], null).invoke(null, null)).longValue();
                            settranslationy.values(61);
                            i5 = i6;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                        } catch (java.lang.Throwable th14) {
                            java.lang.Throwable cause4 = th14.getCause();
                            if (cause4 == null) {
                                throw th14;
                            }
                            throw cause4;
                        }
                    case -2:
                        invoke = new int[]{-752217190, -767347250};
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        settranslationy.values(1);
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                    case -1:
                        i5 = 37;
                    default:
                        i5 = i6;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                }
            }
            throw th;
        } catch (java.lang.Throwable th15) {
            java.lang.Throwable cause5 = th15.getCause();
            if (cause5 == null) {
                throw th15;
            }
            throw cause5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0248 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0255 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Object obj;
        com.payair.hce.setTranslationY settranslationy = new com.payair.hce.setTranslationY();
        byte[] bArr = AlternateContactlessPaymentDataJson;
        char c = 5;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(bArr[5], bArr[577], (short) 244, objArr2);
        java.lang.String str = (java.lang.String) objArr2[0];
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (byte) 74, (short) 366, objArr3);
        try {
            java.lang.Object[] objArr4 = {(java.lang.String) objArr3[0]};
            char c2 = '\r';
            byte b = bArr[13];
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b, (short) (b | 339), objArr5);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((short) (DigitizedCardProfile - 1), bArr[92], (short) 362, objArr6);
            java.lang.String str2 = (java.lang.String) objArr6[0];
            byte b2 = bArr[13];
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b2, (short) (b2 | 339), objArr7);
            java.lang.Object[] objArr8 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr7[0])).invoke(str, objArr4);
            int[] iArr = new int[objArr8.length];
            int i = 0;
            while (i < objArr8.length) {
                java.lang.Object[] objArr9 = {objArr8[i]};
                short s = (short) (DigitizedCardProfile + 3);
                byte[] bArr2 = AlternateContactlessPaymentDataJson;
                byte b3 = bArr2[c2];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(s, b3, (short) (b3 | 338), objArr10);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                byte b4 = bArr2[c];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(157, b4, (short) (b4 | 360), objArr11);
                java.lang.String str3 = (java.lang.String) objArr11[0];
                byte b5 = bArr2[c2];
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, b5, (short) (b5 | 339), objArr12);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr12[0])).invoke(null, objArr9);
                byte b6 = bArr2[13];
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(s, b6, (short) (b6 | 338), objArr13);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a(163, bArr2[16], (short) 359, objArr14);
                iArr[i] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr14[0], null).invoke(invoke, null)).intValue();
                i++;
                c = 5;
                c2 = '\r';
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                switch (settranslationy.values(iArr[i2])) {
                    case -23:
                        i2 = 34;
                    case -22:
                        try {
                            settranslationy.values(16);
                            int i4 = settranslationy.valueOf;
                            i2 = (i4 == 32 || i4 != 56) ? 30 : 18;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i3 >= 31) {
                            }
                            throw th;
                        }
                        break;
                    case -21:
                        settranslationy.values(14);
                        throw ((java.lang.Throwable) settranslationy.IccPrivateKeyCrtComponentsJson);
                        break;
                    case -20:
                        i2 = 35;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i2 = 37;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        try {
                            settranslationy.values(13);
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            if (i3 >= 31) {
                            }
                            throw th;
                        }
                        i2 = settranslationy.valueOf == 0 ? 28 : i3;
                        break;
                    case -17:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(10);
                        writeReplace = settranslationy.valueOf;
                    case -16:
                        try {
                            settranslationy.AlternateContactlessPaymentDataJson = values;
                            settranslationy.values(7);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i3 >= 31) {
                            }
                            throw th;
                        }
                        break;
                    case -15:
                        return null;
                    case -14:
                        i2 = 1;
                    case -13:
                        i2 = 20;
                    case -12:
                        try {
                            com.payair.hce.setLayoutAnimationListener.valueOf(new java.lang.Object[0], -442979919, 442979919, (int) java.lang.System.currentTimeMillis());
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            if (i3 >= 31 || i3 > 34) {
                                throw th;
                            }
                            settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = th;
                            settranslationy.values(19);
                            i2 = 29;
                        }
                        break;
                    case -11:
                        new com.payair.hce.setLayoutAnimationListener();
                    case -10:
                        com.payair.hce.setLayoutMode.values(new java.lang.Object[0], -1111619702, 1111619703, (int) java.lang.System.currentTimeMillis());
                    case -9:
                        obj = com.payair.hce.setLayoutMode.INSTANCE;
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                        settranslationy.values(1);
                    case -8:
                        com.payair.hce.setAnimationCacheEnabled.DigitizedCardProfile(new java.lang.Object[0], -2131569121, 2131569121, (int) java.lang.System.currentTimeMillis());
                    case -7:
                        obj = com.payair.hce.setAnimationCacheEnabled.INSTANCE;
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                        settranslationy.values(1);
                    case -6:
                        com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2112431470, -2112431463, (int) java.lang.System.currentTimeMillis());
                    case -5:
                        com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1891116219, 1891116251, (int) java.lang.System.currentTimeMillis());
                    case -4:
                        com.payair.hce.setLeft.values(new java.lang.Object[0], 1651510342, -1651510327, (int) java.lang.System.currentTimeMillis());
                    case -3:
                        settranslationy.AlternateContactlessPaymentDataJson = 1;
                        settranslationy.values(2);
                        settranslationy.values(3);
                        ((com.payair.hce.setIsCredential) settranslationy.IccPrivateKeyCrtComponentsJson).DigitizedCardProfile();
                    case -2:
                        settranslationy.SdkCoreAlternateContactlessPaymentDataImpl = new com.payair.hce.setIsCredential();
                        settranslationy.values(1);
                    case -1:
                        i2 = 15;
                    default:
                }
            }
            throw th;
        } catch (java.lang.Throwable th6) {
            java.lang.Throwable cause = th6.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = i + 4;
        byte[] bArr = AlternateContactlessPaymentDataJson;
        int i4 = 118 - b;
        byte[] bArr2 = new byte[367 - s];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            int i7 = i3;
            int i8 = (i5 + i3) - 5;
            int i9 = i7 + 1;
            i2 = i6;
            i4 = i8;
            i3 = i9;
            bArr2[i2] = (byte) i4;
            if (i2 == 366 - s) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i4;
            i7 = i3;
            i3 = bArr[i3];
            i6 = i2 + 1;
            i5 = i10;
            int i82 = (i5 + i3) - 5;
            int i92 = i7 + 1;
            i2 = i6;
            i4 = i82;
            i3 = i92;
            bArr2[i2] = (byte) i4;
            if (i2 == 366 - s) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == 366 - s) {
            }
        }
    }

    static void DigitizedCardProfile() {
        byte[] bArr = new byte[2195];
        java.lang.System.arraycopy("D\n#_\t\u0000\u0006\nÿ\u0006\u000bþ\u0006\fý\u0006\rü\u0006\u000eû\u0006\u000fú\rý\u0006\u0010ù\u0006\u0011ø\rý\u0006\t\u0004\u0001\u0006\t\u0005\u0000\u0006\t\u0006ÿ\u0006\t\u0007þ\u000eü\rý\u0006\t\bý\u000fû\u0006\t\tü\u0006\t\nû\u0011ù\u0012ø\n\u0005\u0000\u0006\t\u000bú\n\u0006ÿ\u0006\t\fù\u0006\t\rø\u0006\n\u0003\u0001\u0006\n\u0004\u0000\u000fû\n\tü\rý\u0006\t\tü\u0006\n\u0005ÿ\n\u000bú\u0006\n\u0006þ\n\fù\u0006\n\u0006ü\u001aðÒCú\u0012þÌ*&\u0003ü\nþ\u0002\u0001\u0002\u0010ü\u001aðÒCú\u0012þÌ *\u000bö\u0007\u0003\u0012ð\u0010\u000eõï\u001c\n\u000bç\u0010\u0010\u000eõ\t\u0000\u0006\nÿ\u000b\u0003\u0001\u0006\u000bþ\u000b\u0004\u0000\u0006\fý\u000b\u0005ÿ\u0006\rü\u0006\u000eû\u0006\u000fú\u000b\u0006þ\u0006\u0010ù\u000b\u0006þ\u0006\u0011ø\u0006\t\u0004\u0001\u0006\t\u0005\u0000\u000b\bü\rý\u0006\t\u0006ÿ\rý\u0006\t\u0006ÿ\u000b\tû\u0006\t\u0007þ\u000b\nú\u000b\bü\u000b\u000bù\u000b\fø\u0006\t\bý\u0006\t\tü\u000b\tû\u0006\t\nû\u000b\u0006þ\f\u0002\u0001\u0006\t\u000bú\u000b\fø\u0006\t\fù\f\u0003\u0000\u000b\bü\u0006\t\rø\rý\u0006\n\u0003\u0001\u0006\n\u0004\u0000\f\u0004ÿ\f\u0004ÿ\n\u0005\u0000\rý\u0006\n\u0005ÿ\u000fû\u0006\n\u0006þ\u0006\n\u0007ý\f\u0005þ\f\u0006ý\n\u0005\u0000\u0006\n\bü\n\u0006ÿ\u0006\n\tû\u0006\n\nú\u0006\n\u000bù\u0006\t\u0006ÿ\u000fû\f\u0007ü\rý\u0006\n\u0006þ\u0006\n\fø\f\bû\f\tú\u0006\u000b\u0002\u0001\f\u0004ÿ\n\u0005\u0000\u0006\u000b\u0003\u0000\u0006\u000b\u0004ÿ\u0006\u000b\u0005þ\u0006\nÿ\u000b\u0003\u0001\u0006\u000bþ\f\u000bø\u0006\fý\n\u0005\u0000\u0006\rü\u0006\u000eû\u0006\u000fú\u0006\u000b\u0006ý\u000b\tû\u0006\u000b\u0007ü\f\u0002\u0001\u0006\u000b\u0007ü\u0006\u000b\bû\f\u0002\u0001\u0006\u000b\tú\u000b\tû\u0006\u000b\t\u0012û\u0013\u0002ÿ\u0000ÏKö\u0018\u0001¿+\u0016\u0018\u0001æ$ú\b\f\u0003\u0014Ô#\u0014\bß'ú\u0006ü\u001aðÒCú\u0012þÌ\u001a*þ\u0016æ\u0017\u0011\tõ\u000eú\u0007\n\u000bö\u0012\u0001ü\u001aðÒCú\u0012þÌ+\u0019\u000f\u0002\rï\u0006\u000fþ\u0003\u0014Ô#\u0019\u0003÷ü\u001aðÒCú\u0012þÌ&\u0018\r\u0000\u0003\u0016ü\u001aðÒCú\u0012þÌIø\u0006\u000bþ\u0003\u0016¿$\u001d\u0014ù\fú\n\rþ\u0001ÿö#ü\u001aðÒCú\u0012þÌ&\u0018\r\u0000\u0003\u0016Ì\t\u0000\u0006\nÿ\r\u0001\u0001\u0006\u000bþ\r\u0002\u0000\u0006\fý\u0006\rü\u0006\u000eû\u000b\u0006þ\u0006\u000fú\u000b\u0006þ\u0006\u0010ù\u0006\u0011ø\u0006\t\u0004\u0001\u000b\bü\rý\u0006\t\u0005\u0000\rý\u0006\t\u0005\u0000\u000b\tû\u0006\t\u0006ÿ\r\u0003ÿ\r\u0004þ\u0006\t\u0007þ\u0006\t\bý\u000b\tû\u0006\t\tü\u000b\u0006þ\f\u0002\u0001\u0006\t\nû\u000b\fø\u0006\t\u000bú\r\u0005ý\u0006\t\fù\rý\u0006\t\rø\u0006\n\u0003\u0001\u000eü\rý\u0006\n\u0004\u0000\u000fû\u0006\n\u0005ÿ\u0006\n\u0006þ\r\u0006ü\r\u0007û\r\bú\u0006\n\u0007ý\n\u0006ÿ\u0006\n\bü\u0006\n\tû\u0006\n\nú\u0006\n\nú\u0006\n\u0006þ\r\tù\r\nø\n\u0005\u0000\u0006\n\u0007ý\n\u0006ÿ\u0006\n\u000bù\u0006\n\fø\u0006\u000b\u0002\u0001\u0006\u000b\u0002\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017².\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003\u0003\u0014ä\u001b\u0016ð\t\u0000\u0006\nÿ\u000b\u0003\u0001\u0006\u000bþ\u000e\u0000\u0001\u000e\u0001\u0000\r\u0002\u0000\u0006\fý\u0006\rü\u0006\u000eû\u000b\u0006þ\u0006\u000fú\u000b\u0006þ\u0006\u0010ù\u0006\u0011ø\u0006\t\u0004\u0001\u000e\u0002ÿ\u0006\t\u0005\u0000\rý\u0006\t\u0005\u0000\u000b\tû\u0006\t\u0006ÿ\u000e\u0003þ\u000b\u000bù\u000b\fø\u0006\t\u0007þ\u0006\t\bý\u000b\tû\u0006\t\tü\u000b\u0006þ\f\u0002\u0001\u0006\t\nû\u000b\fø\u0006\t\u000bú\u000b\bü\u000e\u0004ý\u000b\bü\u0006\t\fù\rý\u0006\t\rø\u0006\n\u0003\u0001\f\u0004ÿ\f\u0004ÿ\u000e\u0005ü\u0006\n\u0004\u0000\u000fû\u0006\n\u0005ÿ\f\u0004ÿ\f\u0004ÿ\n\u0005\u0000\rý\u0006\n\u0006þ\u0006\n\u0007ý\f\u0005þ\r\u0007û\r\bú\u0006\n\bü\f\u0004ÿ\n\u0005\u0000\u0006\n\tû\u0006\n\nú\u0006\n\u000bù\u0006\t\u0005\u0000\u000fû\u000e\u0004ý\u0006\n\fø\rý\u0006\n\u0005ÿ\u0006\u000b\u0002\u0001\u000e\u0006û\r\u0002\u0000\u0012ø\n\u0005\u0000\u0006\u000b\u0003\u0000\f\u0004ÿ\n\u0005\u0000\u0006\u000b\u0004ÿ\u0006\u000b\u0005þ\u0006\u000b\u0006ý\u0006\u000b\u0006ý\u0006\n\u0007ý\u000e\u0007ú\u0012ø\n\u0005\u0000\u0006\n\bü\n\u0006ÿ\u0006\u000b\u0007ü\u0006\u000b\bû\u0006\u000b\tú\u000e\bù\rý\u0006\n\u0006þ\u0006\u000b\nù\u000b\tû\u0006\u000b\u000bø\f\u0002\u0001\u0006\u000b\u000bø\u0006\f\u0001\u0001\u000e\tø\u0006\f\u0002\u0000\u000fÿ\u0001\u0006\f\u0002\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017Ñ1\u0004ý\b\u0003\u0013\u0002ô\u0018ú\u000b\u0004\u0003\u0014× \b\n\nþã$\b\u0003ì\u001e\u000eþ\u0012ù\t\u0000\u0006\nÿ\f\u0004ÿ\u0006\u000bþ\u000f\u0001ÿ\r\u0002\u0000\u0006\fý\u0006\rü\u0006\u000eû\u000b\u0006þ\u0006\u000fú\u000b\u0006þ\u0006\u0010ù\u0006\u0011ø\u0006\t\u0004\u0001\u000e\u0002ÿ\u0006\t\u0005\u0000\rý\u0006\t\u0005\u0000\u000b\tû\u0006\t\u0006ÿ\u000b\nú\u000b\bü\u000b\u000bù\u000b\fø\u0006\t\u0007þ\u0006\t\bý\u000b\tû\u0006\t\tü\u000f\u0002þ\u0006\t\nû\u000b\fø\u0006\t\u000bú\r\u0005ý\u0006\t\fù\rý\u0006\t\rø\u0006\n\u0003\u0001\f\u0004ÿ\f\u0004ÿ\n\u0005\u0000\rý\u0006\n\u0004\u0000\u000fû\u0006\n\u0005ÿ\u000f\u0003ý\u000e\u0005ü\u0006\n\u0006þ\u0006\n\u0007ý\u000f\u0004ü\f\u0006ý\n\u0005\u0000\u0006\n\bü\f\u0004ÿ\n\u0005\u0000\u0006\n\tû\u0006\n\nú\u0006\n\u000bù\u0006\n\u000bù\u0006\n\u0007ý\u000f\u0005û\r\u0002\u0000\u000f\u0006ú\r\nø\n\u0005\u0000\u0006\n\bü\f\u0004ÿ\n\u0005\u0000\u0006\n\fø\u0006\u000b\u0002\u0001\u0006\u000b\u0003\u0000\u0006\u000b\u0003\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ*+ÿ\u0006ö\rÛ.\bù\r\u0000\tú\týí!\b\u0005\u0002\u000f\t\u0000\u0006\nÿ\u000b\u0003\u0001\u0006\u000bþ\u000f\u0007ù\u000b\u0005ÿ\u0006\fý\u0006\rü\u0006\u000eû\u000b\u0006þ\u0006\u000fú\u000b\u0006þ\u0006\u0010ù\u0006\u0011ø\u0006\t\u0004\u0001\u000b\bü\rý\u0006\t\u0005\u0000\rý\u0006\t\u0005\u0000\u000b\tû\u0006\t\u0006ÿ\u000e\u0003þ\f\u0002\u0001\r\u0004þ\u0006\t\u0007þ\u0006\t\bý\u000b\tû\u0006\t\tü\u000f\u0002þ\u0006\t\nû\u000b\fø\u0006\t\u000bú\u000b\bü\u000f\bø\u0006\t\fù\rý\u0006\t\rø\u0006\n\u0003\u0001\f\u0004ÿ\f\u0004ÿ\n\u0005\u0000\rý\u0006\n\u0004\u0000\u000fû\u0006\n\u0005ÿ\u0006\n\u0006þ\u0010þ\u0001\r\u0002\u0000\u0012ø\n\u0005\u0000\u0006\n\u0007ý\n\u0006ÿ\u0006\n\bü\u0006\n\tû\u0006\n\nú\u0006\t\u0005\u0000\u000fû\u0010ÿ\u0000\rý\u0006\n\u0005ÿ\u0006\n\u000bù\u0010\u0000ÿ\r\nø\n\u0005\u0000\u0006\n\fø\f\u0004ÿ\n\u0005\u0000\u0006\u000b\u0002\u0001\u0006\u000b\u0003\u0000\u0006\u000b\u0004ÿ\u0006\nÿ\f\u0004ÿ\u0006\u000bþ\u0010\u0001þ\u0010\u0002ý\u0006\fý\u0006\rü\u0006\u000eû\u0006\u000b\u0005þ\u000b\tû\u0006\u000b\u0006ý\f\u0002\u0001\u0006\u000b\u0006ý\u0006\u000b\u0007ü\u000b\tû\u0006\u000b\bû\f\u0002\u0001\u0006\u000b\b\u0003\u0014è\u0017\nû\u0010\râ \u000bó\nð\u001e\b\u0006\t\u0000\u0006\nÿ\u0010\u0003ü\u0006\u000bþ\u0010\u0004û\u0010\u0005ú\u0006\fý\u0006\rü\u0006\u000eû\u000b\u0006þ\u0006\u000fú\u000b\u0006þ\u0006\u0010ù\u0006\u0011ø\u0006\t\u0004\u0001\u000e\u0002ÿ\u0006\t\u0005\u0000\rý\u0006\t\u0005\u0000\u000b\tû\u0006\t\u0006ÿ\r\u0003ÿ\r\u0004þ\u0006\t\u0007þ\u0006\t\bý\u000b\tû\u0006\t\tü\u000b\u0006þ\f\u0002\u0001\u0006\t\nû\u000b\fø\u0006\t\u000bú\r\u0005ý\u0006\t\fù\rý\u0006\t\rø\u0006\n\u0003\u0001\u000f\u0003ý\u000e\u0005ü\u0006\n\u0004\u0000\u000fû\u0006\n\u0005ÿ\f\u0004ÿ\f\u0004ÿ\u000e\u0005ü\u0006\n\u0006þ\u0006\n\u0007ý\u0010\u0006ù\r\nø\n\u0005\u0000\u0006\n\bü\f\u0004ÿ\n\u0005\u0000\u0006\n\tû\u0006\n\nú\u0006\n\u000bù\u0006\n\u000bù\u0006\n\fø\u0010\u0007ø\r\nø\n\u0005\u0000\u0006\u000b\u0002\u0001\n\u0006ÿ\u0006\u000b\u0003\u0000\u0006\u000b\u0004ÿ\u0006\u000b\u0005þ\u0006\nÿ\f\u0004ÿ\u0006\u000bþ\u0011ý\u0001\u0006\fý\u0006\rü\u0006\u000eû\u0006\n\fø\u0011þ\u0000\u000f\u0006ú\r\nø\n\u0005\u0000\u0006\u000b\u0002\u0001\n\u0006ÿ\u0006\u000b\u0006ý\u0006\u000b\u0007ü\u0006\u000b\bû\u0006\u000b\bû\u0006\n\fø\u0010\u0006ù\r\nø\n\u0005\u0000\u0006\u000b\u0002\u0001\n\u0006ÿ\u0006\u000b\tú\u0006\u000b\nù\u0006\u000b\u000bø\u0006\t\u0005\u0000\u000fû\u000e\u0004ý\u0006\f\u0001\u0001\rý\u0006\n\u0005ÿ\u0006\f\u0002\u0000\u000b\tû\u0006\f\u0003ÿ\f\u0002\u0001\u0006\f\u0003ÿ\u0006\f\u0004þ\u0011ÿÿ\u0006\f\u0005ý\u0011\u0000þ\u0006\f\u0005\fú\u0014\b÷\u0004ó\u0018\u0001\u0010\rú\týî\u0018\u0012\u0006\t".getBytes("ISO-8859-1"), 0, bArr, 0, 2195);
        AlternateContactlessPaymentDataJson = bArr;
        DigitizedCardProfile = 138;
    }

    static void AlternateContactlessPaymentDataJson() {
        valueOf = new int[]{-1929302060, -2119061577, -2116411169, 295033771, 1596025931, -125311670, 1722138509, -599908105, 118021625, -1713212441, 1895115847, -1565614889, -479083666, 1258757613, 1133539757, 203136564, -764134587, 810616967};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile();
        writeReplace = 0;
        values = 1;
        AlternateContactlessPaymentDataJson();
        android.os.Process.myPid();
        android.text.TextUtils.getTrimmedLength("");
        android.view.View.MeasureSpec.getMode(0);
        android.view.KeyEvent.normalizeMetaState(0);
        android.view.KeyEvent.getModifierMetaStateMask();
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int i = values + 15;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SYN, -105, 0, 34};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
    }

    public static void valueOf() {
        values(new java.lang.Object[0], 1552721455, -1552721455, (int) java.lang.System.currentTimeMillis());
    }
}
