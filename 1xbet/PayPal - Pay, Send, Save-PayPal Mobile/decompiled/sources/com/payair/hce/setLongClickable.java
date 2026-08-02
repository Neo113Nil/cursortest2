package com.payair.hce;

/* loaded from: classes4.dex */
public class setLongClickable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static java.lang.String AlternateContactlessPaymentDataJson;
    private static java.lang.String DigitizedCardProfile;
    private static final byte[] IccPrivateKeyCrtComponentsJson = null;
    private static int RecordsJson;
    private static java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static final int getCvrMaskAnd = 0;
    private static long getProfileVersion;
    private static java.lang.String valueOf;
    private static java.lang.String values;
    private static java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = s + 4;
        int i5 = (b * 3) + 1;
        int i6 = 119 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i4;
            i3 = 0;
            int i9 = (-i4) + i7;
            i2 = i3;
            int i10 = i8;
            i6 = i9;
            i4 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4 + 1;
            int i12 = i6;
            i8 = i11;
            i4 = bArr[i11];
            i7 = i12;
            int i92 = (-i4) + i7;
            i2 = i3;
            int i102 = i8;
            i6 = i92;
            i4 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf();
        getAid = 0;
        RecordsJson = 1;
        values();
        android.graphics.Color.red(0);
        android.view.ViewConfiguration.getTapTimeout();
        android.text.TextUtils.indexOf("", "", 0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        b("ᱩ잁\udaa8ᙝᱚ嗂ﹿ", android.graphics.Color.green(0), objArr);
        values = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b("卣斖蟘鴱卛\uf7d4ꌁ", android.view.KeyEvent.getMaxKeyCode() >> 16, objArr2);
        valueOf = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b("䭲મⅱ蝅䭅飯֤", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, objArr3);
        writeReplace = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b("즩ⱁၫᥩ증븅㒼", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr4);
        AlternateContactlessPaymentDataJson = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b("\uedfeኵও产\uedcc胰ⵋ", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr5);
        DigitizedCardProfile = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b("\u2efb\uf3bb沓ʟ⻂懸䡅", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr6);
        SdkCoreAlternateContactlessPaymentDataImpl = ((java.lang.String) objArr6[0]).intern();
        getAid = (RecordsJson + 21) % 128;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = ($11 + 61) % 128;
        $10 = i2;
        if (str != null) {
            int i3 = i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(getProfileVersion ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i4 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getProfileVersion)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1920, (char) android.graphics.Color.green(0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((byte) 0, (short) -1, 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 429, (char) (31610 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((byte) 0, (short) -1, 0, objArr5);
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
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03b2 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int intValue;
        java.lang.String str;
        com.payair.hce.setOutlineSpotShadowColor setoutlinespotshadowcolor = new com.payair.hce.setOutlineSpotShadowColor();
        byte[] bArr = IccPrivateKeyCrtComponentsJson;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(bArr[36], (short) 206, bArr[59], objArr2);
        java.lang.String str2 = (java.lang.String) objArr2[0];
        byte b = bArr[59];
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(b, (short) (b | 1021), 174, objArr3);
        try {
            java.lang.Object[] objArr4 = {(java.lang.String) objArr3[0]};
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr5);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
            short s = (short) (getCvrMaskAnd | 896);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((short) 71, s, (short) (s & 187), objArr6);
            java.lang.String str3 = (java.lang.String) objArr6[0];
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr7);
            java.lang.Object[] objArr8 = (java.lang.Object[]) cls.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr7[0])).invoke(str2, objArr4);
            int[] iArr = new int[objArr8.length];
            for (int i = 0; i < objArr8.length; i++) {
                java.lang.Object[] objArr9 = {objArr8[i]};
                byte[] bArr2 = IccPrivateKeyCrtComponentsJson;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr10);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                byte b2 = (byte) (getCvrMaskAnd & 475);
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(b2, (short) (b2 | 912), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, objArr11);
                java.lang.String str4 = (java.lang.String) objArr11[0];
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1021, 159, objArr12);
                java.lang.Object invoke = cls2.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr12[0])).invoke(null, objArr9);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr13);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a((short) 61, (short) 980, 167, objArr14);
                iArr[i] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr14[0], null).invoke(invoke, null)).intValue();
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (i3 >= 25) {
                    }
                    throw th;
                }
                switch (setoutlinespotshadowcolor.values(iArr[i2])) {
                    case -23:
                        i2 = 50;
                    case -22:
                        setoutlinespotshadowcolor.values(22);
                        i2 = setoutlinespotshadowcolor.DigitizedCardProfile != 0 ? 1 : 38;
                    case -21:
                        i2 = 45;
                    case -20:
                        setoutlinespotshadowcolor.values(22);
                        i3 = 24;
                        i2 = setoutlinespotshadowcolor.DigitizedCardProfile != 24 ? 11 : i3;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i2 = 51;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i2 = 53;
                    case -17:
                        setoutlinespotshadowcolor.values(21);
                        if (setoutlinespotshadowcolor.DigitizedCardProfile == 0) {
                            i2 = 37;
                        }
                    case -16:
                        try {
                            setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                            setoutlinespotshadowcolor.values(1);
                            setoutlinespotshadowcolor.values(2);
                            setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = setoutlinespotshadowcolor.getAid.hashCode();
                            setoutlinespotshadowcolor.values(8);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i3 >= 25 || i3 > 29) {
                                throw th;
                            }
                            setoutlinespotshadowcolor.getProfileVersion = th;
                            setoutlinespotshadowcolor.values(25);
                            i2 = 23;
                        }
                        break;
                    case -15:
                        try {
                            setoutlinespotshadowcolor.values(15);
                            throw ((java.lang.Throwable) setoutlinespotshadowcolor.getAid);
                            break;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            if (i3 >= 25) {
                                break;
                            }
                            throw th;
                        }
                    case -14:
                        i2 = 46;
                    case -13:
                        i2 = 48;
                    case -12:
                        setoutlinespotshadowcolor.values(21);
                        if (setoutlinespotshadowcolor.DigitizedCardProfile == 0) {
                            i2 = 22;
                        }
                    case -11:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(11);
                        RecordsJson = setoutlinespotshadowcolor.DigitizedCardProfile;
                    case -10:
                        try {
                            intValue = getAid;
                            setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = intValue;
                            setoutlinespotshadowcolor.values(8);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i3 >= 25) {
                            }
                            throw th;
                        }
                        break;
                    case -9:
                        setoutlinespotshadowcolor.values(48);
                        return java.lang.Integer.valueOf(setoutlinespotshadowcolor.DigitizedCardProfile);
                    case -8:
                        i2 = 29;
                    case -7:
                        i2 = 13;
                    case -6:
                        try {
                            setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                            setoutlinespotshadowcolor.values(1);
                            setoutlinespotshadowcolor.values(2);
                            try {
                                java.lang.Object[] objArr15 = {setoutlinespotshadowcolor.getAid};
                                byte[] bArr3 = IccPrivateKeyCrtComponentsJson;
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                a((byte) (-bArr3[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr16);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                                byte b3 = (byte) (getCvrMaskAnd & 469);
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                try {
                                    a(b3, (short) (b3 | 145), 167, objArr17);
                                    java.lang.String str5 = (java.lang.String) objArr17[0];
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    a((byte) (-bArr3[130]), (short) 1021, 159, objArr18);
                                    intValue = ((java.lang.Integer) cls4.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr18[0])).invoke(null, objArr15)).intValue();
                                    setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = intValue;
                                    setoutlinespotshadowcolor.values(8);
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            if (i3 >= 25) {
                            }
                            throw th;
                        }
                        break;
                    case -5:
                        try {
                            setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                            setoutlinespotshadowcolor.values(1);
                            setoutlinespotshadowcolor.values(2);
                            java.lang.Object obj = setoutlinespotshadowcolor.getAid;
                            try {
                                byte[] bArr4 = IccPrivateKeyCrtComponentsJson;
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                a((byte) (-bArr4[130]), (short) 1021, 159, objArr19);
                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                try {
                                    short s2 = bArr4[59];
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    try {
                                        a((short) 61, s2, (short) (s2 | 169), objArr20);
                                        try {
                                            setoutlinespotshadowcolor.getProfileVersion = cls5.getMethod((java.lang.String) objArr20[0], null).invoke(obj, null);
                                            setoutlinespotshadowcolor.values(46);
                                        } catch (java.lang.Throwable th8) {
                                            th = th8;
                                            if (i3 >= 25) {
                                            }
                                            throw th;
                                        }
                                    } catch (java.lang.Throwable th9) {
                                        th = th9;
                                        java.lang.Throwable cause2 = th.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                }
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                            }
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                        }
                        break;
                    case -4:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 2;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(2);
                        java.lang.String str6 = (java.lang.String) setoutlinespotshadowcolor.getAid;
                        setoutlinespotshadowcolor.values(11);
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        b(str6, setoutlinespotshadowcolor.DigitizedCardProfile, objArr21);
                        str = (java.lang.String) objArr21[0];
                        setoutlinespotshadowcolor.getProfileVersion = str;
                        setoutlinespotshadowcolor.values(46);
                    case -3:
                        try {
                            byte[] bArr5 = IccPrivateKeyCrtComponentsJson;
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            a((byte) (bArr5[1121] - 1), (short) (-bArr5[1]), 154, objArr22);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr22[0]);
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a((short) 59, bArr5[49], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, objArr23);
                            setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = ((java.lang.Integer) cls6.getMethod((java.lang.String) objArr23[0], null).invoke(null, null)).intValue();
                            setoutlinespotshadowcolor.values(8);
                        } catch (java.lang.Throwable th13) {
                            java.lang.Throwable cause3 = th13.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th13;
                        }
                    case -2:
                        str = "灴扽霖贈灇\uf038도䶣";
                        setoutlinespotshadowcolor.getProfileVersion = str;
                        setoutlinespotshadowcolor.values(46);
                    case -1:
                        i2 = 8;
                    default:
                }
            }
        } catch (java.lang.Throwable th14) {
            java.lang.Throwable cause4 = th14.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = s + 44;
        byte[] bArr = IccPrivateKeyCrtComponentsJson;
        int i5 = 175 - i;
        int i6 = 1147 - s2;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6++;
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i6++;
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    static void valueOf() {
        byte[] bArr = new byte[1152];
        java.lang.System.arraycopy("\u0003à\u008b\rü\u0005ù\u0007ÿû\u0006ÿú\u0007ø\bø\b÷\tö\nÿù\bõ\u000bÿø\tÿ÷\nó\rû\u0001\u0004ûÿ\u0006ÿö\u000bûý\bÿõ\fÿô\rÿü\u0001\u0004ÿü\u0000\u0005õ\u000bûû\nûú\u000bÿø\tÿüÿ\u0006ûù\fûø\rú\u0002\u0004ÿüþ\u0007ø\b÷\tÿüý\bÿüü\tÿüû\nÿüû\nÿüú\u000búÿ\u0007ÿüù\fúþ\bÿüù\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007\u0003\u0004\u0003õ\të\u00153Â\u000bó\u00079åÛú\u000fþ\u0002ó\u0015õ÷\u0010\u0016éûú\u001eõõ÷\u0010ü\u0005ù\u0007ÿû\u0006ÿú\u0007ø\bø\b÷\tö\nÿù\bõ\u000bÿø\tÿ÷\núü\núû\u000búú\f÷\tÿö\u000bø\b÷\tÿõ\fÿô\rÿü\u0001\u0004ÿü\u0000\u0005ù\u0007ÿû\u0006ûû\nûú\u000bÿú\u0007ÿüÿ\u0006úù\rÿüþ\u0007ù\u0003\u0004ÿüþü\u0005ù\u0007ÿû\u0006ÿú\u0007ø\bø\bù\u0002\u0005ÿù\bõ\u000bÿø\tÿ÷\nù\u0001\u0006ûø\rúû\u000búú\f÷\tÿö\u000bûý\bÿõ\fÿô\rÿü\u0001\u0004ÿü\u0001\u0004ÿ÷\nù\u0000\u0007úû\u000búú\f÷\tÿö\u000bûý\bÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ÿüý\bù\u0007ÿû\u0006ùÿ\bö\nÿú\u0007ÿüü\túù\rÿüû\nù\u0003\u0004ÿüûü\u0005ù\u0007ÿû\u0006ÿú\u0007ø\bø\b÷\tö\nÿù\bõ\u000bÿø\tÿ÷\nùþ\tùý\n÷\tÿö\u000bûý\bÿõ\fÿô\rÿü\u0001\u0004ÿü\u0000\u0005õ\u000bùü\u000bÿø\tÿüÿ\u0006ùû\fûÿ\u0006ÿüþ\u0007ø\b÷\tÿüý\bÿüü\tÿüû\nÿü\u0000\u0005ù\u0007ÿû\u0006ùú\rö\nÿú\u0007ÿüú\u000búù\rÿüù\fù\u0003\u0004ÿüù\fÿüø\rúù\rÿû\u0002\u0004ù\u0003\u0004ÿû\u0002ü\u0005ù\u0007ÿû\u0006ÿú\u0007ø\bûý\bö\nÿù\bõ\u000bÿø\tÿ÷\nø\u0004\u0004û\u0001\u0004úú\f÷\tÿö\u000bûý\bÿõ\fÿô\rÿü\u0001\u0004ÿü\u0001\u0004ÿü\u0000\u0005ø\u0003\u0005ûÿ\u0006ÿüÿ\u0006ø\b÷\tÿüþ\u0007ÿüý\bÿüü\tÿüû\nù\u0007ÿû\u0006ûû\nø\u0002\u0006ö\nÿú\u0007ÿüú\u000búù\rÿüù\fù\u0003\u0004ÿüùü\u0005ù\u0007ÿû\u0006ÿú\u0007ø\u0001\u0007ö\nÿù\bõ\u000bÿø\tÿ÷\nø\u0000\bûø\rúû\u000bûÿ\u0006ÿö\u000bûý\bÿõ\fÿô\rÿü\u0001\u0004ÿü\u0000\u0005õ\u000bûû\nÿüÿ\u0006ö\nÿø\tÿ÷\nøÿ\tùý\n÷\tÿö\u000bûý\bÿüþ\u0007ÿüý\bÿüü\tÿüü\tÿüû\nù\u0003\u0004ÿüú\u000búù\rÿüúü\u0005ÿû\u0006ÿú\u0007ÿù\bÿú\u0007ûø\rÿø\tÿú\u0007ûø\rÿ÷\nÿú\u0007ûø\rÿö\u000bÿú\u0007ûø\rÿõ\fÿú\u0007ûø\rÿô\røý\u000b÷\tö\nÿü\u0001\u0004õ\u000bÿü\u0000\u0005ÿüÿ\u0006ùþ\tùý\n÷\tÿüþ\u0007ûý\bÿüý\bÿüü\tÿüû\nÿüû\nÿüú\u000bøû\rúû\u000búú\f÷\tÿüù\fûý\bÿüø\rÿû\u0002\u0004ÿû\u0001\u0005ÿû\u0001\u000fïÿ\u000e\u001cÛúü\u0005ÿû\u0006ÿú\u0007÷\u0005\u0004ÿù\bÿø\tÿ÷\nÿö\u000bø\u0001\u0007ö\nÿõ\fõ\u000bÿô\rÿü\u0001\u0004÷\u0004\u0005÷\u0003\u0006÷\tÿü\u0000\u0005ø\b÷\tÿüÿ\u0006ÿüþ\u0007ÿüý\bÿüü\tõ\u000bûû\nÿüû\nö\nÿô\rÿü\u0001\u0004÷\u0002\u0007ûø\rú\u0002\u0004ÿü\u0000\u0005ûý\bÿüú\u000bÿüù\fÿüø\rÿû\u0006ÿú\u0007÷\u0001\bÿù\bÿø\tÿ÷\nÿö\u000bÿû\u0002\u0004÷\u0000\tÿû\u0001\u0005÷ÿ\nÿû\u0001\u0005ÿû\u0000\u0006úù\rÿûÿ\u0007ù\u0003\u0004ÿûÿó\nò\u0003\u0006\u00056¸\r\u0004îIãæì4Ï\u0011÷ú\u0002ñ'ìé-æì6Ô\u000bÿûú\u000fó\u0004".getBytes("ISO-8859-1"), 0, bArr, 0, 1152);
        IccPrivateKeyCrtComponentsJson = bArr;
        getCvrMaskAnd = 110;
    }

    static void values() {
        getProfileVersion = -7810194791765317965L;
    }

    static int DigitizedCardProfile() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[0], -455230668, 455230668, (int) java.lang.System.currentTimeMillis())).intValue();
    }

    public static int writeReplace() {
        int i;
        java.lang.String str;
        com.payair.hce.setOutlineSpotShadowColor setoutlinespotshadowcolor = new com.payair.hce.setOutlineSpotShadowColor();
        byte[] bArr = IccPrivateKeyCrtComponentsJson;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(bArr[36], (short) 358, (short) (-bArr[1127]), objArr);
        java.lang.String str2 = (java.lang.String) objArr[0];
        byte b = bArr[59];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(b, (short) (b | 1021), 174, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            short s = (short) (getCvrMaskAnd | 896);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) 71, s, (short) (s & 187), objArr5);
            java.lang.String str3 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str2, objArr3);
            int[] iArr = new int[objArr7.length];
            for (int i2 = 0; i2 < objArr7.length; i2++) {
                java.lang.Object[] objArr8 = {objArr7[i2]};
                byte[] bArr2 = IccPrivateKeyCrtComponentsJson;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b2 = (byte) (getCvrMaskAnd & 475);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(b2, (short) (b2 | 912), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, objArr10);
                java.lang.String str4 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1021, 159, objArr11);
                java.lang.Object invoke = cls2.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a((short) 61, (short) 980, 167, objArr13);
                iArr[i2] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
            }
            int i3 = 0;
            while (true) {
                switch (setoutlinespotshadowcolor.values(iArr[i3])) {
                    case -21:
                        i3 = 23;
                    case -20:
                        i3 = 45;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        setoutlinespotshadowcolor.values(13);
                        i3 = setoutlinespotshadowcolor.DigitizedCardProfile == 0 ? 44 : i3 + 1;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(11);
                        getAid = setoutlinespotshadowcolor.DigitizedCardProfile;
                    case -17:
                        i = RecordsJson;
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = i;
                        setoutlinespotshadowcolor.values(8);
                    case -16:
                        i3 = 1;
                    case -15:
                        i3 = 34;
                    case -14:
                        setoutlinespotshadowcolor.values(21);
                        if (setoutlinespotshadowcolor.DigitizedCardProfile == 0) {
                            i3 = 33;
                        }
                    case -13:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(11);
                        RecordsJson = setoutlinespotshadowcolor.DigitizedCardProfile;
                    case -12:
                        i = getAid;
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = i;
                        setoutlinespotshadowcolor.values(8);
                    case -11:
                        setoutlinespotshadowcolor.values(48);
                        return setoutlinespotshadowcolor.DigitizedCardProfile;
                    case -10:
                        i3 = 25;
                    case -9:
                        i3 = 35;
                    case -8:
                        str = SdkCoreAlternateContactlessPaymentDataImpl;
                        setoutlinespotshadowcolor.getProfileVersion = str;
                        setoutlinespotshadowcolor.values(46);
                    case -7:
                        str = DigitizedCardProfile;
                        setoutlinespotshadowcolor.getProfileVersion = str;
                        setoutlinespotshadowcolor.values(46);
                    case -6:
                        str = AlternateContactlessPaymentDataJson;
                        setoutlinespotshadowcolor.getProfileVersion = str;
                        setoutlinespotshadowcolor.values(46);
                    case -5:
                        str = writeReplace;
                        setoutlinespotshadowcolor.getProfileVersion = str;
                        setoutlinespotshadowcolor.values(46);
                    case -4:
                        str = valueOf;
                        setoutlinespotshadowcolor.getProfileVersion = str;
                        setoutlinespotshadowcolor.values(46);
                    case -3:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(2);
                        java.lang.Object[] objArr14 = {setoutlinespotshadowcolor.getAid};
                        byte[] bArr3 = IccPrivateKeyCrtComponentsJson;
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        a((byte) (-bArr3[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr15);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                        byte b3 = (byte) (getCvrMaskAnd & 469);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        a(b3, (short) (b3 | 145), 167, objArr16);
                        java.lang.String str5 = (java.lang.String) objArr16[0];
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        a((byte) (-bArr3[130]), (short) 1021, 159, objArr17);
                        i = ((java.lang.Integer) cls4.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr17[0])).invoke(null, objArr14)).intValue();
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = i;
                        setoutlinespotshadowcolor.values(8);
                    case -2:
                        setoutlinespotshadowcolor.getProfileVersion = values;
                        setoutlinespotshadowcolor.values(46);
                    case -1:
                        i3 = 19;
                    default:
                }
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void getProfileVersion(java.lang.String str) {
        int hashCode;
        com.payair.hce.setOutlineSpotShadowColor setoutlinespotshadowcolor = new com.payair.hce.setOutlineSpotShadowColor(str);
        byte[] bArr = IccPrivateKeyCrtComponentsJson;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(bArr[36], (short) 480, bArr[1130], objArr);
        int i = 0;
        java.lang.String str2 = (java.lang.String) objArr[0];
        byte b = bArr[59];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(b, (short) (b | 1021), 174, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            short s = (short) (getCvrMaskAnd | 896);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) 71, s, (short) (s & 187), objArr5);
            java.lang.String str3 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str2, objArr3);
            int[] iArr = new int[objArr7.length];
            for (int i2 = 0; i2 < objArr7.length; i2++) {
                java.lang.Object[] objArr8 = {objArr7[i2]};
                byte[] bArr2 = IccPrivateKeyCrtComponentsJson;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b2 = (byte) (getCvrMaskAnd & 475);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(b2, (short) (b2 | 912), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, objArr10);
                java.lang.String str4 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1021, 159, objArr11);
                java.lang.Object invoke = cls2.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                byte b3 = (byte) (-bArr2[130]);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(b3, (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a((short) 61, (short) 980, 167, objArr13);
                iArr[i2] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
            }
            while (true) {
                int i3 = i + 1;
                try {
                } catch (java.lang.Throwable th) {
                    if (i3 < 21 || i3 > 25) {
                        throw th;
                    }
                    setoutlinespotshadowcolor.getProfileVersion = th;
                    setoutlinespotshadowcolor.values(25);
                    i = 19;
                }
                switch (setoutlinespotshadowcolor.values(iArr[i])) {
                    case -17:
                        i = 35;
                    case -16:
                        setoutlinespotshadowcolor.values(22);
                        i = setoutlinespotshadowcolor.DigitizedCardProfile != 0 ? 20 : 7;
                    case -15:
                        i = 1;
                    case -14:
                        i = 34;
                    case -13:
                        setoutlinespotshadowcolor.values(21);
                        i = setoutlinespotshadowcolor.DigitizedCardProfile == 0 ? 33 : i3;
                    case -12:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(2);
                        hashCode = setoutlinespotshadowcolor.getAid.hashCode();
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = hashCode;
                        setoutlinespotshadowcolor.values(8);
                    case -11:
                        setoutlinespotshadowcolor.values(15);
                        throw ((java.lang.Throwable) setoutlinespotshadowcolor.getAid);
                        break;
                    case -10:
                        i = 36;
                    case -9:
                        i = 38;
                    case -8:
                        setoutlinespotshadowcolor.values(21);
                        if (setoutlinespotshadowcolor.DigitizedCardProfile == 0) {
                            i = 18;
                        }
                    case -7:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(11);
                        RecordsJson = setoutlinespotshadowcolor.DigitizedCardProfile;
                    case -6:
                        hashCode = getAid;
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = hashCode;
                        setoutlinespotshadowcolor.values(8);
                    case -5:
                        return;
                    case -4:
                        i = 25;
                    case -3:
                        i = 9;
                    case -2:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(2);
                        SdkCoreAlternateContactlessPaymentDataImpl = (java.lang.String) setoutlinespotshadowcolor.getAid;
                    case -1:
                        i = 4;
                    default:
                }
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void valueOf(java.lang.String str) {
        int i;
        com.payair.hce.setOutlineSpotShadowColor setoutlinespotshadowcolor = new com.payair.hce.setOutlineSpotShadowColor(str);
        byte[] bArr = IccPrivateKeyCrtComponentsJson;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(bArr[36], (short) 606, 48, objArr);
        int i2 = 0;
        java.lang.String str2 = (java.lang.String) objArr[0];
        byte b = bArr[59];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(b, (short) (b | 1021), 174, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            short s = (short) (getCvrMaskAnd | 896);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) 71, s, (short) (s & 187), objArr5);
            java.lang.String str3 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str2, objArr3);
            int[] iArr = new int[objArr7.length];
            for (int i3 = 0; i3 < objArr7.length; i3++) {
                java.lang.Object[] objArr8 = {objArr7[i3]};
                byte[] bArr2 = IccPrivateKeyCrtComponentsJson;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b2 = (byte) (getCvrMaskAnd & 475);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(b2, (short) (b2 | 912), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, objArr10);
                java.lang.String str4 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1021, 159, objArr11);
                java.lang.Object invoke = cls2.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a((short) 61, (short) 980, 167, objArr13);
                iArr[i3] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
            }
            while (true) {
                int i4 = i2 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    if (i4 < 33 || i4 > 37) {
                        throw th;
                    }
                    setoutlinespotshadowcolor.getProfileVersion = th;
                    setoutlinespotshadowcolor.values(25);
                    i2 = 30;
                }
                switch (setoutlinespotshadowcolor.values(iArr[i2])) {
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i2 = 37;
                    case -17:
                        setoutlinespotshadowcolor.values(22);
                        int i5 = setoutlinespotshadowcolor.DigitizedCardProfile;
                        i2 = 31;
                        if (i5 != 0 && i5 == 1) {
                            i2 = 1;
                        }
                        break;
                    case -16:
                        setoutlinespotshadowcolor.values(15);
                        throw ((java.lang.Throwable) setoutlinespotshadowcolor.getAid);
                        break;
                    case -15:
                        i2 = 38;
                    case -14:
                        i2 = 40;
                    case -13:
                        setoutlinespotshadowcolor.values(21);
                        i2 = setoutlinespotshadowcolor.DigitizedCardProfile == 0 ? 29 : i4;
                    case -12:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(11);
                        RecordsJson = setoutlinespotshadowcolor.DigitizedCardProfile;
                    case -11:
                        i = getAid;
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = i;
                        setoutlinespotshadowcolor.values(8);
                    case -10:
                        i2 = 8;
                    case -9:
                        i2 = 20;
                    case -8:
                        setoutlinespotshadowcolor.values(13);
                        if (setoutlinespotshadowcolor.DigitizedCardProfile == 0) {
                            i2 = 19;
                        }
                    case -7:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(11);
                        getAid = setoutlinespotshadowcolor.DigitizedCardProfile;
                    case -6:
                        i = RecordsJson;
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = i;
                        setoutlinespotshadowcolor.values(8);
                    case -5:
                        return;
                    case -4:
                        i2 = 21;
                    case -3:
                        i2 = 10;
                    case -2:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(2);
                        DigitizedCardProfile = (java.lang.String) setoutlinespotshadowcolor.getAid;
                    case -1:
                        i2 = 4;
                    default:
                }
            }
            throw th;
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void writeReplace(java.lang.String str) {
        int values2;
        int i;
        com.payair.hce.setOutlineSpotShadowColor setoutlinespotshadowcolor = new com.payair.hce.setOutlineSpotShadowColor(str);
        byte[] bArr = IccPrivateKeyCrtComponentsJson;
        byte b = bArr[36];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, (short) (b | com.visa.cbp.getEncExpo.onUnminimized), (short) (-bArr[154]), objArr);
        int i2 = 0;
        java.lang.String str2 = (java.lang.String) objArr[0];
        byte b2 = bArr[59];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(b2, (short) (b2 | 1021), 174, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            short s = (short) (getCvrMaskAnd | 896);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) 71, s, (short) (s & 187), objArr5);
            java.lang.String str3 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str2, objArr3);
            int[] iArr = new int[objArr7.length];
            for (int i3 = 0; i3 < objArr7.length; i3++) {
                java.lang.Object[] objArr8 = {objArr7[i3]};
                byte[] bArr2 = IccPrivateKeyCrtComponentsJson;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b3 = (byte) (getCvrMaskAnd & 475);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(b3, (short) (b3 | 912), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, objArr10);
                java.lang.String str4 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1021, 159, objArr11);
                java.lang.Object invoke = cls2.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                byte b4 = (byte) (-bArr2[130]);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(b4, (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a((short) 61, (short) 980, 167, objArr13);
                iArr[i3] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
            }
            while (true) {
                int i4 = i2 + 1;
                try {
                    values2 = setoutlinespotshadowcolor.values(iArr[i2]);
                    i2 = 21;
                } catch (java.lang.Throwable th) {
                    if (i4 >= 22 && i4 <= 24) {
                        i4 = 20;
                    } else {
                        if (i4 < 36 || i4 > 39) {
                            throw th;
                        }
                        i4 = 33;
                    }
                    setoutlinespotshadowcolor.getProfileVersion = th;
                    setoutlinespotshadowcolor.values(25);
                }
                switch (values2) {
                    case -20:
                        i2 = 44;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        setoutlinespotshadowcolor.values(22);
                        i2 = setoutlinespotshadowcolor.DigitizedCardProfile != 0 ? 1 : 34;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i2 = 39;
                    case -17:
                        setoutlinespotshadowcolor.values(22);
                        if (setoutlinespotshadowcolor.DigitizedCardProfile != 0) {
                            i2 = 9;
                        }
                    case -16:
                        i2 = 45;
                    case -15:
                        i2 = 47;
                    case -14:
                        setoutlinespotshadowcolor.values(21);
                        i2 = setoutlinespotshadowcolor.DigitizedCardProfile == 0 ? 32 : i4;
                    case -13:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(11);
                        RecordsJson = setoutlinespotshadowcolor.DigitizedCardProfile;
                    case -12:
                        i = getAid;
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = i;
                        setoutlinespotshadowcolor.values(8);
                    case -11:
                        setoutlinespotshadowcolor.values(15);
                        throw ((java.lang.Throwable) setoutlinespotshadowcolor.getAid);
                        break;
                    case -10:
                        i2 = 40;
                    case -9:
                        i2 = 42;
                    case -8:
                        setoutlinespotshadowcolor.values(13);
                        if (setoutlinespotshadowcolor.DigitizedCardProfile == 0) {
                            i2 = 19;
                        }
                    case -7:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(11);
                        getAid = setoutlinespotshadowcolor.DigitizedCardProfile;
                    case -6:
                        i = RecordsJson;
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = i;
                        setoutlinespotshadowcolor.values(8);
                    case -5:
                        return;
                    case -4:
                        i2 = 24;
                    case -3:
                        i2 = 11;
                    case -2:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(2);
                        AlternateContactlessPaymentDataJson = (java.lang.String) setoutlinespotshadowcolor.getAid;
                    case -1:
                        i2 = 4;
                    default:
                }
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void values(java.lang.String str) {
        int values2;
        com.payair.hce.setOutlineSpotShadowColor setoutlinespotshadowcolor = new com.payair.hce.setOutlineSpotShadowColor(str);
        byte[] bArr = IccPrivateKeyCrtComponentsJson;
        byte b = bArr[36];
        short s = (short) (b | com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        int i = getCvrMaskAnd;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, s, (short) (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE), objArr);
        int i2 = 0;
        java.lang.String str2 = (java.lang.String) objArr[0];
        byte b2 = bArr[59];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(b2, (short) (b2 | 1021), 174, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            short s2 = (short) (i | 896);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) 71, s2, (short) (s2 & 187), objArr5);
            java.lang.String str3 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str2, objArr3);
            int[] iArr = new int[objArr7.length];
            for (int i3 = 0; i3 < objArr7.length; i3++) {
                java.lang.Object[] objArr8 = {objArr7[i3]};
                byte[] bArr2 = IccPrivateKeyCrtComponentsJson;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b3 = (byte) (getCvrMaskAnd & 475);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(b3, (short) (b3 | 912), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, objArr10);
                java.lang.String str4 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1021, 159, objArr11);
                java.lang.Object invoke = cls2.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a((short) 61, (short) 980, 167, objArr13);
                iArr[i3] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
            }
            while (true) {
                int i4 = i2 + 1;
                try {
                    values2 = setoutlinespotshadowcolor.values(iArr[i2]);
                    i2 = 22;
                } catch (java.lang.Throwable th) {
                    if (i4 < 35 || i4 > 38) {
                        throw th;
                    }
                    setoutlinespotshadowcolor.getProfileVersion = th;
                    setoutlinespotshadowcolor.values(25);
                    i2 = 32;
                }
                switch (values2) {
                    case -16:
                        i2 = 38;
                    case -15:
                        setoutlinespotshadowcolor.values(22);
                        i2 = setoutlinespotshadowcolor.DigitizedCardProfile != 0 ? 1 : 33;
                    case -14:
                        setoutlinespotshadowcolor.values(15);
                        throw ((java.lang.Throwable) setoutlinespotshadowcolor.getAid);
                        break;
                    case -13:
                        i2 = 39;
                    case -12:
                        i2 = 41;
                    case -11:
                        setoutlinespotshadowcolor.values(21);
                        i2 = setoutlinespotshadowcolor.DigitizedCardProfile == 0 ? 31 : i4;
                    case -10:
                        i2 = 8;
                    case -9:
                        i2 = 21;
                    case -8:
                        setoutlinespotshadowcolor.values(21);
                        if (setoutlinespotshadowcolor.DigitizedCardProfile == 0) {
                            i2 = 20;
                        }
                    case -7:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(11);
                        RecordsJson = setoutlinespotshadowcolor.DigitizedCardProfile;
                    case -6:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = getAid;
                        setoutlinespotshadowcolor.values(8);
                    case -5:
                        return;
                    case -4:
                    case -3:
                        i2 = 10;
                    case -2:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(2);
                        writeReplace = (java.lang.String) setoutlinespotshadowcolor.getAid;
                    case -1:
                        i2 = 4;
                    default:
                }
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void DigitizedCardProfile(java.lang.String str) {
        int values2;
        com.payair.hce.setOutlineSpotShadowColor setoutlinespotshadowcolor = new com.payair.hce.setOutlineSpotShadowColor(str);
        byte[] bArr = IccPrivateKeyCrtComponentsJson;
        byte b = bArr[36];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, (short) (b | 972), 82, objArr);
        int i = 0;
        java.lang.String str2 = (java.lang.String) objArr[0];
        byte b2 = bArr[59];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(b2, (short) (b2 | 1021), 174, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            short s = (short) (getCvrMaskAnd | 896);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) 71, s, (short) (s & 187), objArr5);
            java.lang.String str3 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str2, objArr3);
            int[] iArr = new int[objArr7.length];
            for (int i2 = 0; i2 < objArr7.length; i2++) {
                java.lang.Object[] objArr8 = {objArr7[i2]};
                byte[] bArr2 = IccPrivateKeyCrtComponentsJson;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b3 = (byte) (getCvrMaskAnd & 475);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(b3, (short) (b3 | 912), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, objArr10);
                java.lang.String str4 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1021, 159, objArr11);
                java.lang.Object invoke = cls2.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a((short) 61, (short) 980, 167, objArr13);
                iArr[i2] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
            }
            while (true) {
                int i3 = i + 1;
                try {
                    values2 = setoutlinespotshadowcolor.values(iArr[i]);
                    i = 11;
                } catch (java.lang.Throwable th) {
                    if (i3 < 25 || i3 > 28) {
                        throw th;
                    }
                    setoutlinespotshadowcolor.getProfileVersion = th;
                    setoutlinespotshadowcolor.values(25);
                    i = 22;
                }
                switch (values2) {
                    case -13:
                        i = 28;
                    case -12:
                        setoutlinespotshadowcolor.values(22);
                        int i4 = setoutlinespotshadowcolor.DigitizedCardProfile;
                        i = 23;
                        if (i4 != 0 && i4 == 1) {
                            i = 1;
                        }
                        break;
                    case -11:
                        setoutlinespotshadowcolor.values(15);
                        throw ((java.lang.Throwable) setoutlinespotshadowcolor.getAid);
                        break;
                    case -10:
                        i = 29;
                    case -9:
                        i = 31;
                    case -8:
                        i = 21;
                        setoutlinespotshadowcolor.values(21);
                        if (setoutlinespotshadowcolor.DigitizedCardProfile != 0) {
                            i = i3;
                        }
                    case -7:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(11);
                        RecordsJson = setoutlinespotshadowcolor.DigitizedCardProfile;
                        i = i3;
                    case -6:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = getAid;
                        setoutlinespotshadowcolor.values(8);
                        i = i3;
                    case -5:
                        return;
                    case -4:
                    case -3:
                        i = 9;
                    case -2:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(2);
                        valueOf = (java.lang.String) setoutlinespotshadowcolor.getAid;
                        i = i3;
                    case -1:
                        i = 4;
                    default:
                        i = i3;
                }
            }
            throw th;
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void AlternateContactlessPaymentDataJson(java.lang.String str) {
        int values2;
        int i;
        com.payair.hce.setOutlineSpotShadowColor setoutlinespotshadowcolor = new com.payair.hce.setOutlineSpotShadowColor(str);
        byte[] bArr = IccPrivateKeyCrtComponentsJson;
        byte b = bArr[36];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, (short) (b | 1142), bArr[1130], objArr);
        int i2 = 0;
        java.lang.String str2 = (java.lang.String) objArr[0];
        byte b2 = bArr[59];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(b2, (short) (b2 | 1021), 174, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            short s = (short) (getCvrMaskAnd | 896);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) 71, s, (short) (s & 187), objArr5);
            java.lang.String str3 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((byte) (-bArr[130]), (short) 1021, 159, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str2, objArr3);
            int[] iArr = new int[objArr7.length];
            for (int i3 = 0; i3 < objArr7.length; i3++) {
                java.lang.Object[] objArr8 = {objArr7[i3]};
                byte[] bArr2 = IccPrivateKeyCrtComponentsJson;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b3 = (byte) (getCvrMaskAnd & 475);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(b3, (short) (b3 | 912), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, objArr10);
                java.lang.String str4 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a((byte) (-bArr2[130]), (short) 1021, 159, objArr11);
                java.lang.Object invoke = cls2.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                byte b4 = (byte) (-bArr2[130]);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(b4, (short) 1002, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a((short) 61, (short) 980, 167, objArr13);
                iArr[i3] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
            }
            while (true) {
                int i4 = i2 + 1;
                try {
                    values2 = setoutlinespotshadowcolor.values(iArr[i2]);
                    i2 = 21;
                } catch (java.lang.Throwable th) {
                    if (i4 < 22 || i4 > 25) {
                        throw th;
                    }
                    setoutlinespotshadowcolor.getProfileVersion = th;
                    setoutlinespotshadowcolor.values(25);
                    i2 = 20;
                }
                switch (values2) {
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i2 = 36;
                    case -17:
                        setoutlinespotshadowcolor.values(22);
                        if (setoutlinespotshadowcolor.DigitizedCardProfile == 62) {
                            i2 = 9;
                        }
                    case -16:
                        i2 = 1;
                    case -15:
                        i2 = 35;
                    case -14:
                        setoutlinespotshadowcolor.values(21);
                        i2 = setoutlinespotshadowcolor.DigitizedCardProfile == 0 ? 34 : i4;
                    case -13:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(11);
                        RecordsJson = setoutlinespotshadowcolor.DigitizedCardProfile;
                    case -12:
                        i = getAid;
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = i;
                        setoutlinespotshadowcolor.values(8);
                    case -11:
                        setoutlinespotshadowcolor.values(15);
                        throw ((java.lang.Throwable) setoutlinespotshadowcolor.getAid);
                        break;
                    case -10:
                        i2 = 37;
                    case -9:
                        i2 = 39;
                    case -8:
                        setoutlinespotshadowcolor.values(13);
                        if (setoutlinespotshadowcolor.DigitizedCardProfile == 0) {
                            i2 = 19;
                        }
                    case -7:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(11);
                        getAid = setoutlinespotshadowcolor.DigitizedCardProfile;
                    case -6:
                        i = RecordsJson;
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = i;
                        setoutlinespotshadowcolor.values(8);
                    case -5:
                        return;
                    case -4:
                        i2 = 25;
                    case -3:
                        i2 = 11;
                    case -2:
                        setoutlinespotshadowcolor.AlternateContactlessPaymentDataJson = 1;
                        setoutlinespotshadowcolor.values(1);
                        setoutlinespotshadowcolor.values(2);
                        values = (java.lang.String) setoutlinespotshadowcolor.getAid;
                    case -1:
                        i2 = 4;
                    default:
                }
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    static void init$0() {
        $$a = new byte[]{88, -59, 41, 44};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
    }
}
