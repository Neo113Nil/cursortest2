package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'writeReplace' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class setSendAuthenticationHeader {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.payair.hce.setSendAuthenticationHeader[] AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.setSendAuthenticationHeader DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static char[] valueOf;
    public static final com.payair.hce.setSendAuthenticationHeader values;
    public static final com.payair.hce.setSendAuthenticationHeader writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 3 - (s2 * 3);
        int i4 = (i * 8) + 65;
        byte[] bArr = $$a;
        int i5 = s * 3;
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i4 += -i3;
            i3 = i6;
            i2 = i7;
            int i8 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i2 + 1;
            i6 = i8;
            i3 = bArr[i8];
            i7 = i9;
            i4 += -i3;
            i3 = i6;
            i2 = i7;
            int i82 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i5) {
            }
        } else {
            i2 = 0;
            int i822 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i5) {
            }
        }
    }

    private setSendAuthenticationHeader(java.lang.String str, int i) {
    }

    public static com.payair.hce.setSendAuthenticationHeader valueOf(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson + 91;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        com.payair.hce.setSendAuthenticationHeader setsendauthenticationheader = (com.payair.hce.setSendAuthenticationHeader) java.lang.Enum.valueOf(com.payair.hce.setSendAuthenticationHeader.class, str);
        if (i % 2 != 0) {
            return setsendauthenticationheader;
        }
        throw null;
    }

    public static com.payair.hce.setSendAuthenticationHeader[] values() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 85;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        com.payair.hce.setSendAuthenticationHeader[] setsendauthenticationheaderArr = (com.payair.hce.setSendAuthenticationHeader[]) AlternateContactlessPaymentDataJson.clone();
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 117) % 128;
        return setsendauthenticationheaderArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 80), "\u0015\u0018\u000f\u0017\u0011\u000b\u0002\u0013\u0017\u000e\u0014\u0016\u0000\u0014\u0004\t\n\u0000\u0015\b\u000e\u0000\u0005\u0002㘮", 25 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        com.payair.hce.setSendAuthenticationHeader setsendauthenticationheader = new com.payair.hce.setSendAuthenticationHeader(((java.lang.String) objArr[0]).intern(), 0);
        writeReplace = setsendauthenticationheader;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((byte) (android.view.MotionEvent.axisFromString("") + 32), "\u0015\u0018\u000f\u0017\u0011\u000b\u0002\u0013\u0017\u000e\u0014\u0016\u0000\u0014\u0004\t\u0016\u0015\u000e\u000b\u0014\u0002\u0002\t\u0005\u000f", 26 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr2);
        com.payair.hce.setSendAuthenticationHeader setsendauthenticationheader2 = new com.payair.hce.setSendAuthenticationHeader(((java.lang.String) objArr2[0]).intern(), 1);
        DigitizedCardProfile = setsendauthenticationheader2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((byte) (60 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), "\u0013\u0016\u000e\u0017\u0016\u0015\u0013\u0014\u0000\t\u0015\u0018\u0005\u000b\u0002\t\u0005\u000f\u0002\u0018\u000e\u0003\u0005\r\t\u0006㘓", 26 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr3);
        com.payair.hce.setSendAuthenticationHeader setsendauthenticationheader3 = new com.payair.hce.setSendAuthenticationHeader(((java.lang.String) objArr3[0]).intern(), 2);
        values = setsendauthenticationheader3;
        AlternateContactlessPaymentDataJson = new com.payair.hce.setSendAuthenticationHeader[]{setsendauthenticationheader, setsendauthenticationheader2, setsendauthenticationheader3};
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 1) % 128;
    }

    private static void a(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        int i3 = $10;
        $11 = (i3 + 75) % 128;
        char c = 2;
        if (str != null) {
            $11 = (i3 + 39) % 128;
            cArr = str.toCharArray();
            int i4 = $11 + 11;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 5;
            }
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = valueOf;
        int i6 = 8;
        if (cArr3 != null) {
            $10 = ($11 + 69) % 128;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i7])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> i6) + 49, android.graphics.Color.alpha(0) + 2508, (char) (6802 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, (short) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    i6 = 8;
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getAid)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49, android.text.TextUtils.getOffsetBefore("", 0) + 2508, (char) (6802 - android.view.KeyEvent.getDeadChar(0, 0)));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(0, (short) 0, (short) 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            int i8 = $10 + 21;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                i2 = i + 127;
                cArr5[i2] = (char) (cArr2[i2] << b);
            } else {
                i2 = i - 1;
                cArr5[i2] = (char) (cArr2[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[13];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[8] = java.lang.Integer.valueOf(charValue);
                    objArr6[7] = digitizedCardJson12;
                    objArr6[6] = digitizedCardJson12;
                    objArr6[5] = java.lang.Integer.valueOf(charValue);
                    objArr6[4] = digitizedCardJson12;
                    objArr6[3] = digitizedCardJson12;
                    objArr6[c] = java.lang.Integer.valueOf(charValue);
                    objArr6[1] = digitizedCardJson12;
                    objArr6[0] = digitizedCardJson12;
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.Process.myTid() >> 22), 3596 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        java.lang.Class<?>[] clsArr = new java.lang.Class[13];
                        clsArr[0] = java.lang.Object.class;
                        clsArr[1] = java.lang.Object.class;
                        clsArr[c] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Object.class;
                        clsArr[4] = java.lang.Object.class;
                        clsArr[5] = java.lang.Integer.TYPE;
                        clsArr[6] = java.lang.Object.class;
                        clsArr[7] = java.lang.Object.class;
                        clsArr[8] = java.lang.Integer.TYPE;
                        clsArr[9] = java.lang.Object.class;
                        clsArr[10] = java.lang.Object.class;
                        clsArr[11] = java.lang.Integer.TYPE;
                        clsArr[12] = java.lang.Object.class;
                        obj3 = cls3.getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = new java.lang.Object[11];
                        objArr7[10] = digitizedCardJson12;
                        objArr7[9] = java.lang.Integer.valueOf(charValue);
                        objArr7[8] = digitizedCardJson12;
                        objArr7[7] = java.lang.Integer.valueOf(charValue);
                        objArr7[6] = java.lang.Integer.valueOf(charValue);
                        objArr7[5] = digitizedCardJson12;
                        objArr7[4] = digitizedCardJson12;
                        objArr7[3] = java.lang.Integer.valueOf(charValue);
                        objArr7[c] = java.lang.Integer.valueOf(charValue);
                        objArr7[1] = digitizedCardJson12;
                        objArr7[0] = digitizedCardJson12;
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2666 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (18889 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                            byte b2 = (byte) ($$b & 3);
                            byte b3 = (byte) (b2 - 1);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(b2, b3, b3, objArr8);
                            obj4 = cls4.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i9 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i10 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i9 * charValue) + i10];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i11 = digitizedCardJson12.DigitizedCardProfile;
                        int i12 = digitizedCardJson12.RecordsJson;
                        int i13 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i14 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[(i11 * charValue) + i12];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i13 * charValue) + i14];
                    } else {
                        int i15 = digitizedCardJson12.DigitizedCardProfile;
                        int i16 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i17 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i18 = digitizedCardJson12.RecordsJson;
                        cArr5[digitizedCardJson12.values] = cArr3[(i15 * charValue) + i16];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i17 * charValue) + i18];
                        $10 = ($11 + 79) % 128;
                    }
                }
                digitizedCardJson12.values += 2;
                c = 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr5[i19] = (char) (cArr5[i19] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void DigitizedCardProfile() {
        valueOf = new char[]{12295, 12337, 12336, 12300, 12309, 12316, 12291, 12319, 12297, 12339, 12302, 12296, 12313, 12292, 12298, 12318, 12307, 12301, 12317, 12338, 12299, 12312, 12293, 12294, 12303};
        getAid = (char) 1493;
    }

    static void init$0() {
        $$a = new byte[]{64, -23, -58, -30};
        $$b = 149;
    }
}
