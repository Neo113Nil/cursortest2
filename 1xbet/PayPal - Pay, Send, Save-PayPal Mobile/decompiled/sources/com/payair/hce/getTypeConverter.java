package com.payair.hce;

/* loaded from: classes4.dex */
public class getTypeConverter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char DigitizedCardProfile;
    private static short[] IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static byte[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getGpoResponse;
    private static int getProfileVersion;
    private static char[] valueOf;
    private static int writeReplace;
    private java.security.SecureRandom AlternateContactlessPaymentDataJson;
    private int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 718 - i;
        byte[] bArr = $$a;
        int i5 = (b * 2) + 4;
        int i6 = s + 1;
        char[] cArr = new char[i6];
        if (bArr == null) {
            int i7 = i6;
            i4 = i5;
            i3 = 0;
            i5++;
            i4 = (i4 + (-i7)) - 2;
            i2 = i3;
            i3 = i2 + 1;
            cArr[i2] = (char) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = bArr[i5];
            i5++;
            i4 = (i4 + (-i7)) - 2;
            i2 = i3;
            i3 = i2 + 1;
            cArr[i2] = (char) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            cArr[i2] = (char) i4;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = i * 3;
        int i4 = s + 65;
        byte[] bArr = $$d;
        int i5 = b + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i3;
            i2 = 0;
            int i8 = i6;
            i4 = i5 + (-i7);
            i5 = i8;
            int i9 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i9];
            int i10 = i4;
            i6 = i9;
            i5 = i10;
            int i82 = i6;
            i4 = i5 + (-i7);
            i5 = i82;
            int i92 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            int i922 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public getTypeConverter(java.security.SecureRandom secureRandom, int i) {
        this.AlternateContactlessPaymentDataJson = secureRandom;
        this.values = i;
    }

    public final java.security.SecureRandom values() {
        int i = getProfileVersion;
        getGpoResponse = (i + 5) % 128;
        java.security.SecureRandom secureRandom = this.AlternateContactlessPaymentDataJson;
        getGpoResponse = (i + 85) % 128;
        return secureRandom;
    }

    public final int valueOf() {
        int i = (getProfileVersion + 59) % 128;
        getGpoResponse = i;
        int i2 = this.values;
        getProfileVersion = (i + 43) % 128;
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, int i3, short s, java.lang.Object[] objArr) {
        int i4;
        long j;
        int length;
        byte[] bArr;
        int i5;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(RecordsJson)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 21, android.text.TextUtils.indexOf("", "") + 29, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $11 = ($10 + 83) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr2 = SdkCoreAlternateContactlessPaymentDataImpl;
                if (bArr2 != null) {
                    int i6 = $11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    for (int i7 = i5; i7 < length; i7++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i7])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.os.Process.myPid() >> 22), 5088 - (android.os.Process.myPid() >> 22), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr;
                }
                if (bArr2 == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (IccPrivateKeyCrtComponentsJson[i + ((int) (writeReplace ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (RecordsJson ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        gettrack2constructiondata.writeReplace = ((i + intValue) - 2) + ((int) (writeReplace ^ j)) + i4;
                        java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getAid), sb};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2365, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            d((byte) -1, 0, (short) 39, objArr5);
                            obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr3 = SdkCoreAlternateContactlessPaymentDataImpl;
                        if (bArr3 != null) {
                            $10 = ($11 + 81) % 128;
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i8 = 0; i8 < length2; i8++) {
                                bArr4[i8] = (byte) (bArr3[i8] ^ (-4897270311952305750L));
                            }
                            bArr3 = bArr4;
                        }
                        boolean z = bArr3 != null;
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z) {
                                byte[] bArr5 = SdkCoreAlternateContactlessPaymentDataImpl;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                $10 = ($11 + 19) % 128;
                            } else {
                                short[] sArr = IccPrivateKeyCrtComponentsJson;
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
                byte[] bArr6 = SdkCoreAlternateContactlessPaymentDataImpl;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(writeReplace)};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.Color.green(0), android.graphics.Color.rgb(0, 0, 0) + 16777245, (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                }
                intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] ^ (-4897270311952305750L))) + ((int) (RecordsJson ^ (-4897270311952305750L))));
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
        $10 = ($11 + 27) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = valueOf;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), 2508 - (android.os.Process.myPid() >> 22), (char) (android.view.KeyEvent.normalizeMetaState(0) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((byte) -1, 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
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
            $10 = ($11 + 97) % 128;
            cArr = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(DigitizedCardProfile)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 49, android.graphics.Color.argb(0, 0, 0, 0) + 2508, (char) (android.view.MotionEvent.axisFromString("") + 6803));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            d((byte) -1, 0, (short) 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
            $10 = ($11 + 21) % 128;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $11 = ($10 + 85) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    int i4 = $10 + 85;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf % b);
                        cArr3[digitizedCardJson12.values << 1] = (char) (digitizedCardJson12.writeReplace + b);
                    } else {
                        cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                        cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    }
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.KeyEvent.normalizeMetaState(0), 3597 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49, 2665 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 18890));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            d((byte) -1, 0, (short) 8, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i5 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i6 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i5 * charValue) + i6];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i7 = digitizedCardJson12.DigitizedCardProfile;
                        int i8 = digitizedCardJson12.RecordsJson;
                        int i9 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i10 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[(i7 * charValue) + i8];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i9 * charValue) + i10];
                    } else {
                        int i11 = digitizedCardJson12.DigitizedCardProfile;
                        int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i13 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i14 = digitizedCardJson12.RecordsJson;
                        cArr3[digitizedCardJson12.values] = cArr[(i11 * charValue) + i12];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i13 * charValue) + i14];
                    }
                }
                digitizedCardJson12.values += 2;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr3[i15] = (char) (cArr3[i15] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getProfileVersion = 0;
        getGpoResponse = 1;
        valueOf = new char[]{12327, 12350, 12321, 13270, 12338, 12388, 12295, 12311, 12332, 13267, 12328, 12302, 12334, 12329, 12389, 13269, 12339, 12313, 12324, 12345, 12346, 13265, 12297, 12291, 13266, 12400, 12344, 12323, 12309, 13271, 12293, 12351, 13272, 12299, 12330, 12394, 12326, 12305, 12322, 13264, 12325, 12348, 12314, 12292, 12300, 12333, 13268, 12331, 12335};
        DigitizedCardProfile = (char) 1495;
        writeReplace = -1016487840;
        RecordsJson = 520368551;
        getAid = 2043342911;
        SdkCoreAlternateContactlessPaymentDataImpl = new byte[]{-83, 58, 58, -55, -59, 44, -62, com.visa.cbp.getEncExpo.kernelVersion, -57, 63, com.visa.cbp.getEncExpo.startTransaction, -62, Byte.MAX_VALUE, -6, 48, -55, 57, -62, 62, 124, -67, 37, -37, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -51, 36, -59, 56, -113, 3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -58, 62, -59, -5, 126, -63, -59, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -15, 9, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -60, -4, 6, 37, -37, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -3, 6, 37, -37, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -3, -85, -58, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 45, -41, com.visa.cbp.getEncExpo.startTransaction, 56, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 60, 47, -30, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.visa.cbp.getEncExpo.startTransaction, -81, 86, -89, 122, -124, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 89, -86, 76, -95, -91, -94, -93, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -110, 80, -95, 94, -87, kotlin.io.encoding.Base64.padSymbol, -51, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -59, 59, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -62, 99, -97, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 57, -50, Byte.MAX_VALUE, Byte.MIN_VALUE, -50, -87, -51, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, kotlin.io.encoding.Base64.padSymbol, -60, -38, -24, 9, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -61, 59, com.visa.cbp.getEncExpo.onUnminimized, 3, 37, -37, 57, 82, -28, -9, com.google.common.base.Ascii.VT, -25, 94, 82, -76, 88, 77, 64, 82, 84, -55, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -47, 93, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 67, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -88, 89, 89, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 85, Byte.MAX_VALUE, Byte.MIN_VALUE, -77, 81, -87, 77, 126, -111, 83, -94, -82, com.google.common.base.Ascii.ETB, 56, -40, com.google.common.base.Ascii.SUB, -32, -32, 63, -3, -18, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC4, -32, -22, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -54, com.google.common.base.Ascii.GS};
    }

    static void init$1() {
        $$d = new byte[]{37, 88, 64, 59};
        $$e = 199;
    }

    /* JADX WARN: Code restructure failed: missing block: B:350:0x1509, code lost:
    
        r12.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x1a4b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x1a4c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x1fe6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x16b6 A[Catch: IOException -> 0x1862, all -> 0x1968, TryCatch #4 {, blocks: (B:302:0x114d, B:305:0x116d, B:307:0x1190, B:313:0x121b, B:323:0x1916, B:325:0x191c, B:326:0x191d, B:328:0x127b, B:343:0x133b, B:358:0x15da, B:360:0x15dd, B:361:0x166c, B:363:0x16b6, B:365:0x16e1, B:367:0x170b, B:369:0x1734, B:371:0x175e, B:395:0x193e, B:396:0x1967, B:421:0x18bf, B:422:0x18c2, B:462:0x18e8, B:464:0x18ef, B:465:0x18f0, B:473:0x1905, B:475:0x190b, B:476:0x190c, B:492:0x1927, B:494:0x192d, B:495:0x192e), top: B:301:0x114d }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x17e2 A[Catch: all -> 0x0b40, TryCatch #21 {all -> 0x0b40, blocks: (B:5:0x00d0, B:7:0x00dc, B:8:0x011a, B:12:0x01d7, B:14:0x0218, B:15:0x0264, B:22:0x0389, B:24:0x0397, B:25:0x03db, B:29:0x0498, B:31:0x04e0, B:32:0x0531, B:38:0x0662, B:40:0x0670, B:41:0x06b8, B:45:0x0753, B:47:0x0798, B:48:0x07e8, B:54:0x08f0, B:56:0x08fc, B:57:0x0945, B:61:0x09f7, B:63:0x0a2f, B:64:0x0a7f, B:68:0x0ab2, B:70:0x0ade, B:71:0x0b2b, B:75:0x0816, B:77:0x085d, B:78:0x08b3, B:81:0x055f, B:83:0x05a8, B:84:0x05fc, B:87:0x0292, B:89:0x02cf, B:90:0x0325, B:103:0x0c71, B:105:0x0c8f, B:106:0x0ce4, B:112:0x0dbc, B:114:0x0e08, B:115:0x0e58, B:123:0x1a63, B:125:0x1a95, B:126:0x1ae6, B:150:0x1d2e, B:152:0x1d4c, B:153:0x1d9f, B:159:0x1e6d, B:161:0x1ead, B:162:0x1eff, B:174:0x1f42, B:176:0x1f78, B:177:0x1fc9, B:185:0x2011, B:187:0x201f, B:188:0x205f, B:192:0x2113, B:194:0x2157, B:195:0x21a5, B:201:0x22c9, B:203:0x22d7, B:204:0x231e, B:208:0x23e0, B:210:0x2426, B:211:0x2471, B:217:0x2592, B:219:0x25a0, B:220:0x25e8, B:224:0x268d, B:226:0x26ca, B:227:0x271d, B:233:0x281e, B:235:0x282a, B:236:0x2874, B:240:0x2923, B:242:0x2963, B:243:0x29b3, B:247:0x29e0, B:249:0x2a25, B:250:0x2a79, B:254:0x274b, B:256:0x2792, B:257:0x27e2, B:260:0x24a1, B:262:0x24dd, B:263:0x252d, B:266:0x21d5, B:268:0x2213, B:269:0x2266, B:279:0x0ea6, B:281:0x0ec4, B:282:0x0f0e, B:288:0x0fec, B:290:0x1029, B:291:0x1075, B:376:0x17a0, B:378:0x17e2, B:379:0x1836, B:514:0x19a0, B:516:0x19da, B:517:0x1a2e), top: B:2:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x190b A[Catch: Exception -> 0x193e, all -> 0x1968, IOException -> 0x196f, TryCatch #4 {, blocks: (B:302:0x114d, B:305:0x116d, B:307:0x1190, B:313:0x121b, B:323:0x1916, B:325:0x191c, B:326:0x191d, B:328:0x127b, B:343:0x133b, B:358:0x15da, B:360:0x15dd, B:361:0x166c, B:363:0x16b6, B:365:0x16e1, B:367:0x170b, B:369:0x1734, B:371:0x175e, B:395:0x193e, B:396:0x1967, B:421:0x18bf, B:422:0x18c2, B:462:0x18e8, B:464:0x18ef, B:465:0x18f0, B:473:0x1905, B:475:0x190b, B:476:0x190c, B:492:0x1927, B:494:0x192d, B:495:0x192e), top: B:301:0x114d }] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x190c A[Catch: Exception -> 0x193e, all -> 0x1968, IOException -> 0x196f, TryCatch #4 {, blocks: (B:302:0x114d, B:305:0x116d, B:307:0x1190, B:313:0x121b, B:323:0x1916, B:325:0x191c, B:326:0x191d, B:328:0x127b, B:343:0x133b, B:358:0x15da, B:360:0x15dd, B:361:0x166c, B:363:0x16b6, B:365:0x16e1, B:367:0x170b, B:369:0x1734, B:371:0x175e, B:395:0x193e, B:396:0x1967, B:421:0x18bf, B:422:0x18c2, B:462:0x18e8, B:464:0x18ef, B:465:0x18f0, B:473:0x1905, B:475:0x190b, B:476:0x190c, B:492:0x1927, B:494:0x192d, B:495:0x192e), top: B:301:0x114d }] */
    /* JADX WARN: Type inference failed for: r13v122 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v55, types: [int] */
    /* JADX WARN: Type inference failed for: r13v81 */
    /* JADX WARN: Type inference failed for: r1v467, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v525, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v576, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v622, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v652, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v683, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v712, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v194, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v216, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r37v25, types: [long] */
    /* JADX WARN: Type inference failed for: r38v10 */
    /* JADX WARN: Type inference failed for: r38v11 */
    /* JADX WARN: Type inference failed for: r38v17 */
    /* JADX WARN: Type inference failed for: r38v19 */
    /* JADX WARN: Type inference failed for: r38v20 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r38v8 */
    /* JADX WARN: Type inference failed for: r38v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v201, types: [int] */
    /* JADX WARN: Type inference failed for: r3v202 */
    /* JADX WARN: Type inference failed for: r3v203 */
    /* JADX WARN: Type inference failed for: r3v433, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v365 */
    /* JADX WARN: Type inference failed for: r5v720 */
    /* JADX WARN: Type inference failed for: r5v721 */
    /* JADX WARN: Type inference failed for: r9v122 */
    /* JADX WARN: Type inference failed for: r9v139 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v77 */
    /* JADX WARN: Type inference failed for: r9v78 */
    /* JADX WARN: Type inference failed for: r9v79 */
    /* JADX WARN: Type inference failed for: r9v80 */
    /* JADX WARN: Type inference failed for: r9v81 */
    /* JADX WARN: Type inference failed for: r9v82 */
    /* JADX WARN: Type inference failed for: r9v96 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2, int i3) {
        int i4;
        java.lang.String[] strArr;
        java.lang.Object[] objArr;
        char c;
        int i5;
        java.lang.String[] strArr2;
        java.lang.Object[] objArr2;
        int i6;
        java.lang.String[] strArr3;
        java.lang.Object[] objArr3;
        int i7;
        java.lang.Object[] objArr4;
        int i8;
        java.lang.Object[] objArr5;
        char c2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object obj;
        int i9;
        java.lang.String[] split;
        ?? length;
        int i10;
        ?? r38;
        short s;
        java.lang.String str4;
        java.lang.String[] strArr4;
        ?? r13;
        java.lang.Process exec;
        java.lang.Throwable th;
        java.lang.Object newInstance;
        java.lang.Throwable th2;
        java.lang.Object newInstance2;
        java.lang.Throwable cause;
        java.lang.String[] strArr5;
        java.lang.Class<?> cls;
        java.lang.String str5;
        java.lang.Object obj2;
        java.lang.InterruptedException interruptedException;
        java.lang.Throwable th3;
        ?? r5;
        int length2;
        int i11;
        java.lang.Object obj3;
        java.lang.Object[] objArr6;
        char c3;
        java.lang.String str6;
        java.lang.Object obj4;
        int i12;
        java.lang.Object[] objArr7;
        java.lang.Object[] objArr8;
        int i13;
        java.lang.Object[] objArr9;
        int i14;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a(".\u0013\u0013!)\u001a\u0013\f\f)\u000f\u0004.\u0014\u0002\u0006\u000e\u0006\f(㘨㘨)\u0016\f0\u0006\u0016'\u0013\u0019\u0010\f$", 34 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 61), objArr10);
        java.lang.String intern = ((java.lang.String) objArr10[0]).intern();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a("\u0013\u0005\u0005+\r\u0019㘫", android.graphics.Color.blue(0) + 7, (byte) ('s' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr11);
        java.lang.String intern2 = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b(596799135 - android.view.View.combineMeasuredStates(0, 0), (-14) - android.text.TextUtils.indexOf("", ""), (byte) (100 - android.view.KeyEvent.normalizeMetaState(0)), (-1724825899) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr12);
        java.lang.String intern3 = ((java.lang.String) objArr12[0]).intern();
        ?? r9 = -1347122530;
        try {
            if (context == null) {
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a("\u0011*\"-\u000f\u0005\u001f\u0010\u0019\u0010\f$", 13 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr13);
                java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).intern()};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                java.lang.Object obj6 = obj5;
                if (obj5 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 36, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3162, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33099));
                    byte b = $$a[41];
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    c(b, (short) (b | 618), b, objArr15);
                    java.lang.reflect.Method method = cls2.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, method);
                    obj6 = method;
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr14)).longValue();
                long j = i;
                long j2 = ~j;
                long j3 = ((471 * longValue) - 56884812948L) + (((~(j2 | 241037342)) | longValue) * (-235)) + (((~(241037342 | j)) | longValue) * (-470)) + (((~(longValue | 241037342 | j)) | (~((~longValue) | (-241037343)))) * 235) + 1148508081;
                int i15 = ~i;
                if (((((int) (j3 >> 32)) & (((((671391924 | i15) * 1324) - 818884594) + (((~(i | 681947380)) | (~(755279030 | i))) * (-1324))) - 1903533396)) | (((int) j3) & (((((~(1965606424 | i)) | 173420646) * 336) - 501357939) + (((~(528380014 | i)) | 1610647056) * (-168)) + (((~(528380014 | i15)) | 1965606424) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)))) != 0) {
                    objArr7 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 50}, null, null, new int[1]};
                    int i16 = ~(790731770 | i);
                    java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-234946699) | i15)) | (~(239404174 | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 2102594856 + (((~((-239404175) | i15)) | i16) * (-1040)) + ((i16 | (~((-790731771) | i15)) | 4457476) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r9);
                    java.lang.Object obj8 = obj7;
                    if (obj7 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 50, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2713, (char) android.text.TextUtils.getOffsetAfter("", 0));
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        c((byte) ($$b & 50), 653, $$a[41], objArr17);
                        java.lang.reflect.Method method2 = cls3.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r9, method2);
                        obj8 = method2;
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr16)).intValue();
                    i12 = 0;
                    ((int[]) objArr7[4])[0] = intValue;
                } else {
                    java.lang.Object[] objArr18 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr19 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(996106215 | i15)) | 34029729) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 288898368 + (((~(995055779 | i15)) | 35080165) * (-440)) + ((996106215 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r9);
                    java.lang.Object obj10 = obj9;
                    if (obj9 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.text.TextUtils.indexOf("", "") + 2713, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        c((byte) ($$b & 50), 653, $$a[41], objArr20);
                        java.lang.reflect.Method method3 = cls4.getMethod((java.lang.String) objArr20[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r9, method3);
                        obj10 = method3;
                    }
                    i12 = 0;
                    ((int[]) objArr18[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr19)).intValue();
                    objArr7 = objArr18;
                }
                if (((int[]) objArr7[1])[i12] != i) {
                    return objArr7;
                }
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                b(596799030 - android.view.Gravity.getAbsoluteGravity(i12, i12), (-13) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) ((-110) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), ((android.os.Process.getThreadPriority(i12) + 20) >> 6) - 1724825958, (short) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr21);
                java.lang.Object[] objArr22 = {((java.lang.String) objArr21[0]).intern()};
                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                java.lang.Object obj12 = obj11;
                if (obj11 == null) {
                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36, 3161 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (33147 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    byte b2 = $$a[41];
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    c(b2, (short) (b2 | 618), b2, objArr23);
                    java.lang.reflect.Method method4 = cls5.getMethod((java.lang.String) objArr23[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, method4);
                    obj12 = method4;
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj12).invoke(null, objArr22)).longValue();
                long j4 = ~longValue2;
                long j5 = j4 | 1076703730;
                long j6 = ((868 * longValue2) - 934578838508L) + (((~(j2 | 1076703730)) | (~(j4 | j2))) * (-867)) + (((~j5) | (~(1076703730 | j)) | (~(j4 | j))) * (-1734)) + (((~(j5 | j2)) | (~(1076703730 | longValue2 | j)) | (~((-1076703731) | j4 | j))) * 867) + 1984174469;
                if (((((int) j6) & (((((~(i15 | (-581508905))) | 2018735314) * (-983)) - 293361280) + (((~(i15 | 2018735314)) | (-2063302651)) * 983))) | (((((i15 | 1477072907) * 1324) - 818884594) + (((~(1477402011 | i)) | (~((-40175601) | i))) * (-1324)) + 821701816) & ((int) (j6 >> 32)))) != 0) {
                    objArr8 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 60}, null, null, new int[1]};
                    java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((i15 | 2363456) * (-192)) + 1247741576 + (((~(i15 | 12464331)) | 1040236820) * (-384)) + (((~((-1040236821) | i)) | (~(i15 | 1052701151)) | (~((-10100876) | i))) * 192))};
                    java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r9);
                    java.lang.Object obj14 = obj13;
                    if (obj13 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, android.graphics.Color.argb(0, 0, 0, 0) + 2713, (char) android.text.TextUtils.indexOf("", "", 0));
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        c((byte) ($$b & 50), 653, $$a[41], objArr25);
                        java.lang.reflect.Method method5 = cls6.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r9, method5);
                        obj14 = method5;
                    }
                    i13 = 0;
                    ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr24)).intValue();
                } else {
                    objArr8 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr26 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((1016470630 | i) * 614) + 1512559532 + (((~(i15 | (-476987992))) | 470155334 | (~(i15 | 553147953))) * (-1228)) + (((~(i15 | (-6832658))) | (~(i15 | 1023303287))) * 614))};
                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r9);
                    java.lang.Object obj16 = obj15;
                    if (obj15 == null) {
                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 2714 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        c((byte) ($$b & 50), 653, $$a[41], objArr27);
                        java.lang.reflect.Method method6 = cls7.getMethod((java.lang.String) objArr27[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r9, method6);
                        obj16 = method6;
                    }
                    i13 = 0;
                    ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr26)).intValue();
                }
                if (((int[]) objArr8[1])[i13] != i) {
                    return objArr8;
                }
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                b((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 596799050, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i13, i13) - 13, (byte) (android.view.KeyEvent.normalizeMetaState(i13) + 98), (-1724825958) - android.text.TextUtils.indexOf("", ""), (short) android.text.TextUtils.indexOf("", "", i13), objArr28);
                java.lang.Object[] objArr29 = {((java.lang.String) objArr28[0]).intern()};
                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                java.lang.Object obj18 = obj17;
                if (obj17 == null) {
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 3161 - android.graphics.Color.blue(0), (char) (33099 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    byte[] bArr = $$a;
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    c(bArr[8], androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, bArr[16], objArr30);
                    java.lang.reflect.Method method7 = cls8.getMethod((java.lang.String) objArr30[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method7);
                    obj18 = method7;
                }
                long j7 = ~((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, objArr29)).longValue();
                long j8 = 276177298 | j;
                long j9 = ((r1 * (-667)) - 368696692830L) + (((~j8) | j7) * (-668)) + (((~(j7 | j)) | 276177298) * 1336) + ((j7 | j8) * 668) + 719257605;
                if (((((int) j9) & ((((~(i15 | (-1744708170))) | 1705779776) * (-160)) + 885031061 + (((~(i15 | (-307481760))) | (-1744708170)) * 160))) | (((int) (j9 >> 32)) & (((((i15 | 181078192) * 1324) - 818884594) + (((~(181095602 | i)) | (~(1256130808 | i))) * (-1324))) - 1268213924))) != 0) {
                    objArr9 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 80}, null, null, new int[1]};
                    java.lang.Object[] objArr31 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i15 | 339111148)) | 687870736) * (-108)) + 1721470944 + (((~((-691024797) | i)) | 335957088 | (~(i15 | 691024796))) * 54) + ((335957088 | i) * 54))};
                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r9);
                    java.lang.Object obj20 = obj19;
                    if (obj19 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myTid() >> 22), 2713 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                        c((byte) ($$b & 50), 653, $$a[41], objArr32);
                        java.lang.reflect.Method method8 = cls9.getMethod((java.lang.String) objArr32[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r9, method8);
                        obj20 = method8;
                    }
                    i14 = 0;
                    ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr31)).intValue();
                } else {
                    objArr9 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr33 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(i15 | (-798466525))) | 231669420) * (-602)) - 1418538836) + (((~((-798466525) | i)) | 226926732 | (~(i15 | 803209212))) * (-301)) + ((~(i15 | 231669420)) * 301))};
                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r9);
                    java.lang.Object obj22 = obj21;
                    if (obj21 == null) {
                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 50, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2713, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        c((byte) ($$b & 50), 653, $$a[41], objArr34);
                        java.lang.reflect.Method method9 = cls10.getMethod((java.lang.String) objArr34[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r9, method9);
                        obj22 = method9;
                    }
                    i14 = 0;
                    ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr33)).intValue();
                }
                if (((int[]) objArr9[1])[i14] != i) {
                    return objArr9;
                }
                java.lang.Object[] objArr35 = new java.lang.Object[1];
                a("\u0013\u0007+\u0005*\u0013\u0013\u0005\u0005+\u0014\u0007#\u0005\u0006\f%)\u0014.\f\u0005\u0013\u000b!/\u001a\r\f\u0013!-(\u0001\u0014\u000e0\f*\u0014#\u0006", 42 - android.view.View.combineMeasuredStates(i14, i14), (byte) (54 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr35);
                java.lang.Object[] objArr36 = {((java.lang.String) objArr35[i14]).intern()};
                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                java.lang.Object obj24 = obj23;
                if (obj23 == null) {
                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 37, 3161 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33099));
                    byte[] bArr2 = $$a;
                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                    c(bArr2[8], androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, bArr2[16], objArr37);
                    java.lang.reflect.Method method10 = cls11.getMethod((java.lang.String) objArr37[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method10);
                    obj24 = method10;
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr36)).longValue();
                long j10 = ((471 * longValue3) - 192488582296L) + (((~(j2 | 815629585)) | longValue3) * (-235)) + (((~(815629585 | j)) | longValue3) * (-470)) + (((~((~longValue3) | (-815629586))) | (~(815629585 | longValue3 | j))) * 235) + 1811064489;
                if (((((int) (j10 >> 32)) & (((((i15 | 1523964589) * 1444) - 1153123274) + ((((~(1548369196 | i)) | 43369089) | (~((-111142786) | i))) * (-1444))) - 790806204)) | (((int) j10) & ((((((~((-1857033032) | i)) | 1141899329) | (~(1000707854 | i))) * (-754)) - 13137353) + (((~((-1141899330) | i)) | (~(i15 | 2142607183))) * (-754)) + ((i15 | (-1857033032)) * 754)))) != 0) {
                    java.lang.Object[] objArr38 = {new int[]{i}, new int[]{i ^ 90}, null, null, new int[1]};
                    java.lang.Object[] objArr39 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i15 | (-774009423))) | (-256126523)) * (-983)) - 1035055189) + (((~(i15 | (-256126523))) | 21236784) * 983))};
                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r9);
                    java.lang.Object obj26 = obj25;
                    if (obj25 == null) {
                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2713, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        java.lang.Object[] objArr40 = new java.lang.Object[1];
                        c((byte) ($$b & 50), 653, $$a[41], objArr40);
                        java.lang.reflect.Method method11 = cls12.getMethod((java.lang.String) objArr40[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r9, method11);
                        obj26 = method11;
                    }
                    ((int[]) objArr38[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr39)).intValue();
                    return objArr38;
                }
                java.lang.Object[] objArr41 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                int i17 = ~(i15 | (-25787361));
                java.lang.Object[] objArr42 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((-1073315818) | i17) * (-970)) + 1100523978 + ((i17 | 1047528457) * 970))};
                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r9);
                java.lang.Object obj28 = obj27;
                if (obj27 == null) {
                    java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 50, android.view.View.MeasureSpec.getMode(0) + 2713, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                    c((byte) ($$b & 50), 653, $$a[41], objArr43);
                    java.lang.reflect.Method method12 = cls13.getMethod((java.lang.String) objArr43[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r9, method12);
                    obj28 = method12;
                }
                ((int[]) objArr41[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr42)).intValue();
                return objArr41;
            }
            i4 = i;
            try {
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                a(".\u0013\u0013!)\u001a\u0013\f\f)\u000f\u0004.\u0014\u0002\u0006\u001a$\u000f\u0004.\u0006㘺", android.os.Process.getGidForName("") + 24, (byte) (android.graphics.Color.alpha(0) + 76), objArr44);
                java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr44[0]).intern());
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                b(android.graphics.Color.argb(0, 0, 0, 0) + 596799086, ((android.os.Process.getThreadPriority(0) + 20) >> 6) - 14, (byte) ((-16777324) - android.graphics.Color.rgb(0, 0, 0)), (-1724825902) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (short) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr45);
                java.lang.String str7 = (java.lang.String) cls14.getMethod(((java.lang.String) objArr45[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                a(".\u0013\u0013!)\u001a\u0013\f\f)\u000f\u0004.\u0014\u0002\u0006\u001a$\u000f\u0004.\u0006㘺", 24 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) (76 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr46);
                java.lang.Class<?> cls15 = java.lang.Class.forName(((java.lang.String) objArr46[0]).intern());
                float complexToFloat = android.util.TypedValue.complexToFloat(0);
                float complexToFloat2 = android.util.TypedValue.complexToFloat(0);
                byte maximumFlingVelocity = (byte) ((-11) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int size = android.view.View.MeasureSpec.getSize(0);
                java.lang.Object[] objArr47 = new java.lang.Object[1];
                short scrollDefaultDelay = (short) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                java.lang.Object[] objArr48 = objArr47;
                b((complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 596799100, (complexToFloat2 > 0.0f ? 1 : (complexToFloat2 == 0.0f ? 0 : -1)) - 14, maximumFlingVelocity, (-1724825902) - size, scrollDefaultDelay, objArr48);
                java.lang.Object invoke = cls15.getMethod(((java.lang.String) objArr47[0]).intern(), null).invoke(context, null);
                int indexOf = ((java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(invoke)).indexOf(str7);
                if (indexOf > 0) {
                    java.lang.String str8 = (java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(invoke);
                    if (str8.length() >= 16) {
                        int i18 = 0;
                        for (int i19 = 16; i18 <= str8.length() - i19; i19 = 16) {
                            java.lang.Object[] objArr49 = {str8.substring(i18, i18 + 16), 931995};
                            java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj29 == null) {
                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28, 2595 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.getSize(0));
                                byte b3 = $$a[41];
                                str6 = str8;
                                java.lang.Object[] objArr50 = new java.lang.Object[1];
                                c(b3, b3, r11[52], objArr50);
                                java.lang.reflect.Method method13 = cls16.getMethod((java.lang.String) objArr50[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method13);
                                obj4 = method13;
                            } else {
                                str6 = str8;
                                obj4 = obj29;
                            }
                            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr49)).longValue();
                            long j11 = ~longValue4;
                            int i20 = indexOf;
                            long j12 = i4;
                            int i21 = i18;
                            java.lang.String str9 = intern3;
                            long j13 = (longValue4 * 949) + 168772789761L + (((~(j11 | j12)) | 178218362) * (-948)) + ((~((~j12) | 178218362 | j11)) * (-948)) + (((-178218363) | j11) * 948) + 1435318887;
                            int i22 = ~i4;
                            if (((((int) (j13 >> 32)) & ((((((~((-1871787210) | i4)) | (~(434560798 | i22))) | (~(1871787209 | i22))) * 959) - 75454870) + (((~((-1871787210) | i22)) | (~(434560798 | i4)) | (~(1871787209 | i4))) * 959))) | (((int) j13) & (((88187137 | i4) * 988) + 2130240237 + (((~((-1212046439) | i22)) | 1075053604) * (-1976)) + (((~((-225179972) | i22)) | (~(225179971 | i4)) | 88187137) * 988)))) == -725904754) {
                                objArr6 = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                java.lang.String str10 = (java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(invoke);
                                ((int[]) objArr6[0])[0] = i4;
                                ((int[]) objArr6[1])[0] = i4 ^ 20;
                                java.lang.Object[] objArr51 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-969184819) | i4)) | (~(60951126 | i22))) * (-1808)) + 1734639976 + (((~((-25166355) | i4)) | (~(1004969590 | i22))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(i22 | 969184818)) | (~((-60951127) | i4)) | 944018464) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r9);
                                java.lang.Object obj31 = obj30;
                                if (obj30 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 50, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) android.view.KeyEvent.keyCodeFromString(""));
                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                    c((byte) ($$b & 50), 653, $$a[41], objArr52);
                                    java.lang.reflect.Method method14 = cls17.getMethod((java.lang.String) objArr52[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r9, method14);
                                    obj31 = method14;
                                }
                                c3 = 0;
                                ((int[]) objArr6[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr51)).intValue();
                                objArr = objArr6;
                                c = c3;
                                strArr = r9;
                                i5 = 1;
                                if (((int[]) objArr[i5])[c] != i4) {
                                    return objArr;
                                }
                                int[] iArr = new int[i5];
                                int[] iArr2 = new int[i5];
                                iArr[c] = i4;
                                iArr2[c] = i4;
                                java.lang.Object[] objArr53 = {iArr, iArr2, null, null, new int[i5]};
                                int i23 = ~i4;
                                java.lang.Object[] objArr54 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((~((-536893735) | i23)) * 130) + 1879715516 + (((~((-536893735) | i4)) | 18220608) * 130))};
                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr);
                                java.lang.Object obj33 = obj32;
                                if (obj32 == null) {
                                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2712, (char) android.view.View.resolveSize(0, 0));
                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                    c((byte) ($$b & 50), 653, $$a[41], objArr55);
                                    java.lang.reflect.Method method15 = cls18.getMethod((java.lang.String) objArr55[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr, method15);
                                    obj33 = method15;
                                }
                                ((int[]) objArr53[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr54)).intValue();
                                if (((int[]) objArr53[1])[0] != i4) {
                                    return objArr53;
                                }
                                if ((i2 & 1) == 0) {
                                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                                    a("\r/0\"\u0014\u0006\"\u000e)%\"\u0014㘾", 14 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (91 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr56);
                                    try {
                                        java.lang.Object[] objArr57 = {((java.lang.String) objArr56[0]).intern()};
                                        java.lang.Object[] objArr58 = new java.lang.Object[1];
                                        a(".\u0013\u0013!)\u001a\u0013\f\f)\u000f\u0004.\u0014\u0002\u0006\u001a$\u000f\u0004.\u0006㘺", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 23, (byte) (76 - android.view.KeyEvent.getDeadChar(0, 0)), objArr58);
                                        java.lang.Class<?> cls19 = java.lang.Class.forName(((java.lang.String) objArr58[0]).intern());
                                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                                        a(".*\u0003\u000f\u0011\u0014\u0006+\u0003\u000e/\u001b0\"\u0014\u0006", 16 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (43 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr59);
                                        java.lang.Object invoke2 = cls19.getMethod(((java.lang.String) objArr59[0]).intern(), java.lang.String.class).invoke(context, objArr57);
                                        if (invoke2 != null) {
                                            java.lang.Object[] objArr60 = new java.lang.Object[1];
                                            a(".\u0013\u0013!)\u001a\u0013\f0\u0013\u0013\u0006\u0005\u0013\u0006\u0015\u0013\u0004\r.0\"\u0014\u0006/#)\u0016\t\u0014\u00050\u0013..*㘤", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36, (byte) (android.text.TextUtils.getOffsetAfter("", 0) + 60), objArr60);
                                            java.lang.Class<?> cls20 = java.lang.Class.forName(((java.lang.String) objArr60[0]).intern());
                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                            b(596799171 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (-14) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 9), android.os.Process.getGidForName("") - 1724825901, (short) android.widget.ExpandableListView.getPackedPositionType(0L), objArr61);
                                            java.util.List list = (java.util.List) cls20.getMethod(((java.lang.String) objArr61[0]).intern(), null).invoke(invoke2, null);
                                            if (list != null) {
                                                java.util.Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    java.lang.Object next = it.next();
                                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                    a(".\u0013\u0013!)\u001a\u0013\f\f)\u000f\u0004.\u0014\u0002\u0006\u001a$\u0006\u000e'\u0013.\u0014\b\u0001*\u0005㙤", 29 - android.text.TextUtils.indexOf("", "", 0), (byte) (101 - android.view.KeyEvent.keyCodeFromString("")), objArr62);
                                                    java.lang.Class<?> cls21 = java.lang.Class.forName(((java.lang.String) objArr62[0]).intern());
                                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                    b(596799086 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 15, (byte) ((-108) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), (-1724825902) - (android.view.ViewConfiguration.getTouchSlop() >> 8), (short) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr63);
                                                    java.lang.String str11 = (java.lang.String) cls21.getMethod(((java.lang.String) objArr63[0]).intern(), null).invoke(next, null);
                                                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                    a(".\u0013\u0013!)\u001a\u0013\f0\u0013\u0013\u0006\u0005\u0013\u0006\u0015\u0013\u0004\r.0\"\u0014\u0006/#)\u0016\t\u0014\u00050\u0013..*㘤", android.os.Process.getGidForName("") + 38, (byte) (60 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr64);
                                                    java.lang.Class<?> cls22 = java.lang.Class.forName(((java.lang.String) objArr64[0]).intern());
                                                    java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                    b(android.view.View.resolveSize(0, 0) + 596799186, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 14, (byte) ((-68) - android.os.Process.getGidForName("")), (-1724825900) - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (short) android.graphics.Color.red(0), objArr65);
                                                    if (((java.lang.Boolean) cls22.getMethod(((java.lang.String) objArr65[0]).intern(), java.lang.String.class).invoke(invoke2, str11)).booleanValue()) {
                                                        if (str11.length() >= 20) {
                                                            int i24 = 0;
                                                            for (int i25 = 20; i24 <= str11.length() - i25; i25 = 20) {
                                                                java.lang.Object[] objArr66 = {str11.substring(i24, i24 + 20), 931995};
                                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                java.lang.Object obj35 = obj34;
                                                                if (obj34 == null) {
                                                                    java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2594 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                                                    byte b4 = $$a[41];
                                                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                                    c(b4, b4, r9[52], objArr67);
                                                                    java.lang.reflect.Method method16 = cls23.getMethod((java.lang.String) objArr67[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method16);
                                                                    obj35 = method16;
                                                                }
                                                                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr66)).longValue();
                                                                long j14 = ~longValue5;
                                                                long j15 = i4;
                                                                java.lang.Object obj36 = invoke2;
                                                                java.util.Iterator it2 = it;
                                                                long j16 = ~j15;
                                                                java.lang.String str12 = str11;
                                                                int i26 = i24;
                                                                long j17 = (((-317) * longValue5) - 248339607692L) + (((~(j15 | 778494067)) | j14) * (-318)) + (((~(j16 | (-778494068) | longValue5)) | (~(j14 | j15))) * 318) + (((~(j16 | j14 | (-778494068))) | (~(longValue5 | (-778494068) | j15))) * 318) + 2035594592;
                                                                if (((((int) j17) & (((((-1090552401) | i23) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 840427299) + (((~((-1259001851) | i23)) | (-1100327510)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) | (((int) (j17 >> 32)) & (((((~(479749262 | i4)) | (~(1916975673 | i23))) * (-1808)) - 538598550) + (((~((-1648532018) | i4)) | (~((-211305607) | i23))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~((-1916975674) | i4)) | (-2128281280) | (~((-479749263) | i23))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)))) == 1245577864) {
                                                                    objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 70}, null, null, new int[1]};
                                                                    int i27 = ~(591780808 | i4);
                                                                    java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-591780809) | i4)) | 33603776 | (~((-438355137) | i4))) * (-880)) + 1311667208 + (((~((-591780809) | i23)) | 438355136 | i27) * (-880)) + (i27 * 880))};
                                                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr);
                                                                    java.lang.Object obj38 = obj37;
                                                                    if (obj37 == null) {
                                                                        java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myTid() >> 22), 2713 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                                        c((byte) ($$b & 50), 653, $$a[41], objArr69);
                                                                        java.lang.reflect.Method method17 = cls24.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr, method17);
                                                                        obj38 = method17;
                                                                    }
                                                                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr68)).intValue();
                                                                    c2 = 0;
                                                                    ((int[]) objArr5[4])[0] = intValue2;
                                                                    if (((int[]) objArr5[1])[c2] != i4) {
                                                                        return objArr5;
                                                                    }
                                                                } else {
                                                                    i24 = i26 + 1;
                                                                    invoke2 = obj36;
                                                                    str11 = str12;
                                                                    it = it2;
                                                                }
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                    invoke2 = invoke2;
                                                    it = it;
                                                }
                                            }
                                        }
                                        objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                        java.lang.Object[] objArr70 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-744485840) | i4)) | 285650105) * (-366)) + 1189094502 + (((~((-744051527) | i4)) | 285215792) * 366))};
                                        java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr);
                                        java.lang.Object obj40 = obj39;
                                        if (obj39 == null) {
                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, 2713 - android.graphics.Color.green(0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                            java.lang.Object[] objArr71 = new java.lang.Object[1];
                                            c((byte) ($$b & 50), 653, $$a[41], objArr71);
                                            java.lang.reflect.Method method18 = cls25.getMethod((java.lang.String) objArr71[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr, method18);
                                            obj40 = method18;
                                        }
                                        c2 = 0;
                                        ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr70)).intValue();
                                        if (((int[]) objArr5[1])[c2] != i4) {
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        java.lang.Throwable cause2 = th4.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th4;
                                    }
                                }
                                java.lang.Object[] objArr72 = new java.lang.Object[1];
                                a("\u0011*\"-\u000f\u0005\u001f\u0010\u0019\u0010\f$", android.text.TextUtils.indexOf("", "") + 12, (byte) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr72);
                                java.lang.Object[] objArr73 = {((java.lang.String) objArr72[0]).intern()};
                                java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                java.lang.Object obj42 = obj41;
                                if (obj41 == null) {
                                    java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 36, 3161 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.view.View.resolveSize(0, 0) + 33099));
                                    byte b5 = $$a[41];
                                    java.lang.Object[] objArr74 = new java.lang.Object[1];
                                    c(b5, (short) (b5 | 618), b5, objArr74);
                                    java.lang.reflect.Method method19 = cls26.getMethod((java.lang.String) objArr74[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, method19);
                                    obj42 = method19;
                                }
                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj42).invoke(null, objArr73)).longValue();
                                long j18 = ~longValue6;
                                long j19 = i4;
                                long j20 = ~j19;
                                java.lang.String[] strArr6 = strArr;
                                long j21 = ((832 * longValue6) - 344046887260L) + (((~(longValue6 | 414514322 | j19)) | (~(j18 | j20))) * (-831)) + ((~(414514322 | j18 | j19)) * (-1662)) + (((~(longValue6 | j19)) | (~((-414514323) | j20)) | (~(414514322 | j19))) * 831) + 492956416;
                                if (((((int) j21) & ((((~(1061617361 | i23)) | 2162696 | (~((-375609049) | i23))) * (-397)) + 236789960 + ((690333705 | i4) * 397))) | (((int) (j21 >> 32)) & ((((((~(572927278 | i23)) | 1439728337) | r4) * (-502)) - 1668621440) + (((~((-2501927) | i4)) | (~(2012655615 | i23))) * 502)))) != 0) {
                                    objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 50}, null, null, new int[1]};
                                    java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-218384481) | i23)) | (~((-805310465) | i23))) * (-184)) + 463683272) + ((((~((-221604981) | i23)) | 3220500) | (~((-808530965) | i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 26119328)};
                                    strArr2 = strArr6;
                                    java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr2);
                                    java.lang.Object obj44 = obj43;
                                    if (obj43 == null) {
                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) (android.os.Process.myTid() >> 22));
                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                        c((byte) ($$b & 50), 653, $$a[41], objArr76);
                                        java.lang.reflect.Method method20 = cls27.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr2, method20);
                                        obj44 = method20;
                                    }
                                    i6 = 0;
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr75)).intValue();
                                } else {
                                    strArr2 = strArr6;
                                    objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                    java.lang.Object[] objArr77 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(494899678 | i4)) | 41946656) * (-140)) - 441270192) + ((~(536846334 | i4)) * 70) + (((~(535236266 | i4)) | 43556724) * 70))};
                                    java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr2);
                                    java.lang.Object obj46 = obj45;
                                    if (obj45 == null) {
                                        java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.os.Process.getGidForName(""), 2713 - android.text.TextUtils.indexOf("", "", 0), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                        java.lang.Object[] objArr78 = new java.lang.Object[1];
                                        c((byte) ($$b & 50), 653, $$a[41], objArr78);
                                        java.lang.reflect.Method method21 = cls28.getMethod((java.lang.String) objArr78[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr2, method21);
                                        obj46 = method21;
                                    }
                                    i6 = 0;
                                    ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj46).invoke(null, objArr77)).intValue();
                                }
                                if (((int[]) objArr2[1])[i6] != i4) {
                                    return objArr2;
                                }
                                java.lang.Object[] objArr79 = new java.lang.Object[1];
                                b(596799030 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.graphics.Color.red(i6) - 14, (byte) ((-110) - android.view.View.combineMeasuredStates(i6, i6)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 1724825958, (short) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr79);
                                java.lang.Object[] objArr80 = {((java.lang.String) objArr79[0]).intern()};
                                java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                java.lang.Object obj48 = obj47;
                                if (obj47 == null) {
                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 37, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3161, (char) (33099 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                                    byte b6 = $$a[41];
                                    java.lang.Object[] objArr81 = new java.lang.Object[1];
                                    c(b6, (short) (b6 | 618), b6, objArr81);
                                    java.lang.reflect.Method method22 = cls29.getMethod((java.lang.String) objArr81[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, method22);
                                    obj48 = method22;
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj48).invoke(null, objArr80)).longValue();
                                long j22 = ~longValue7;
                                java.lang.String[] strArr7 = strArr2;
                                long j23 = (((-500) * longValue7) - 372434858000L) + (((~(j22 | 744869716)) | (~(longValue7 | (-744869717) | j19))) * 501) + ((~((-744869717) | j22)) * 1002) + ((~(longValue7 | (-744869717) | j20)) * 501) + 162601022;
                                int i28 = (int) (j23 >> 32);
                                int i29 = ~(1446652133 | i);
                                if (((i28 & ((((~(i23 | (-1445996742))) | (~((-9425723) | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 190985386 + (((~(i23 | 9425722)) | i29) * (-1040)) + ((i29 | (~(i23 | (-1446652134))) | (-1455422464)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))) | (((int) j23) & (((~(2133825357 | i)) * (-301)) + 254515446 + (((~((-2066650894) | i)) | (~(i23 | 791089992))) * (-301)) + (((~((-791089993) | i)) | (-2066650894)) * 301)))) != 0) {
                                    objArr3 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 60}, null, null, new int[1]};
                                    java.lang.Object[] objArr82 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~(i23 | (-29240887))) | (~((-1000895059) | i))) * (-370)) - 71654120) + ((((~((-29240887) | i)) | (~(i23 | (-1000895059)))) | (-1002339959)) * (-370))) - 1498597374)};
                                    strArr3 = strArr7;
                                    java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr3);
                                    java.lang.Object obj50 = obj49;
                                    if (obj49 == null) {
                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 50, 2713 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                                        c((byte) ($$b & 50), 653, $$a[41], objArr83);
                                        java.lang.reflect.Method method23 = cls30.getMethod((java.lang.String) objArr83[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr3, method23);
                                        obj50 = method23;
                                    }
                                    i7 = 0;
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr82)).intValue();
                                } else {
                                    strArr3 = strArr7;
                                    objArr3 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                                    java.lang.Object[] objArr84 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(i23 | 187472211)) * (-560)) - 1429799192) + ((~((-806487589) | i)) * (-560)) + (((~(i23 | 842663733)) | 151296066) * 560))};
                                    java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr3);
                                    java.lang.Object obj52 = obj51;
                                    if (obj51 == null) {
                                        java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2713 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                        java.lang.Object[] objArr85 = new java.lang.Object[1];
                                        c((byte) ($$b & 50), 653, $$a[41], objArr85);
                                        java.lang.reflect.Method method24 = cls31.getMethod((java.lang.String) objArr85[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr3, method24);
                                        obj52 = method24;
                                    }
                                    i7 = 0;
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj52).invoke(null, objArr84)).intValue();
                                }
                                if (((int[]) objArr3[1])[i7] != i) {
                                    return objArr3;
                                }
                                java.lang.Object[] objArr86 = new java.lang.Object[1];
                                b(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 596799051, (-15) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i7), (byte) (98 - android.view.Gravity.getAbsoluteGravity(i7, i7)), (android.view.KeyEvent.getMaxKeyCode() >> 16) - 1724825958, (short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i7)), objArr86);
                                java.lang.Object[] objArr87 = {((java.lang.String) objArr86[0]).intern()};
                                java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                java.lang.Object obj54 = obj53;
                                if (obj53 == null) {
                                    java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 3160 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 33099));
                                    byte[] bArr3 = $$a;
                                    java.lang.Object[] objArr88 = new java.lang.Object[1];
                                    c(bArr3[8], androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, bArr3[16], objArr88);
                                    java.lang.reflect.Method method25 = cls32.getMethod((java.lang.String) objArr88[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method25);
                                    obj54 = method25;
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj54).invoke(null, objArr87)).longValue();
                                long j24 = ~longValue8;
                                long j25 = (((-932) * longValue8) - 1020217872504L) + (((~(j20 | 1092310355)) | j24) * (-933)) + (((~(j24 | (-1092310356))) | (~(j24 | j20))) * 933) + ((~(longValue8 | (-1092310356))) * 933) + 2087745259;
                                int i30 = ~(i23 | (-856216201));
                                if (((((int) (j25 >> 32)) & ((((~(1934414472 | i)) | (-2001524685) | i30) * (-470)) + 1318462284 + ((i30 | (~((-67110213) | i))) * 470))) | (((int) j25) & ((((~((-633576378) | i)) | 75631256) * 576) + 1771465493 + (((~(i23 | (-557945122))) | (-2146434044)) * 576) + 613930496))) != 0) {
                                    objArr4 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 80}, null, null, new int[1]};
                                    java.lang.Object[] objArr89 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((~(i23 | (-288570287))) * 979) + 2130973644 + ((741565658 | i) * (-979)) + (((~((-288570287) | i)) | (~(i23 | 741565658))) * 979))};
                                    java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr3);
                                    java.lang.Object obj56 = obj55;
                                    if (obj55 == null) {
                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.text.TextUtils.indexOf("", "", 0, 0) + 2713, (char) android.text.TextUtils.indexOf("", "", 0, 0));
                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                        c((byte) ($$b & 50), 653, $$a[41], objArr90);
                                        java.lang.reflect.Method method26 = cls33.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr3, method26);
                                        obj56 = method26;
                                    }
                                    i8 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr89)).intValue();
                                } else {
                                    objArr4 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                                    java.lang.Object[] objArr91 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(i23 | (-309015313))) | 721120632) * (-602)) - 122612088) + (((~((-309015313) | i)) | 40575248 | (~(i23 | 989560696))) * (-301)) + ((~(i23 | 721120632)) * 301))};
                                    java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr3);
                                    java.lang.Object obj58 = obj57;
                                    if (obj57 == null) {
                                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 51, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                                        c((byte) ($$b & 50), 653, $$a[41], objArr92);
                                        java.lang.reflect.Method method27 = cls34.getMethod((java.lang.String) objArr92[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr3, method27);
                                        obj58 = method27;
                                    }
                                    i8 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj58).invoke(null, objArr91)).intValue();
                                }
                                if (((int[]) objArr4[1])[i8] != i) {
                                    return objArr4;
                                }
                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                a("\u0013\u0007+\u0005*\u0013\u0013\u0005\u0005+\u0014\u0007#\u0005\u0006\f%)\u0014.\f\u0005\u0013\u000b!/\u001a\r\f\u0013!-(\u0001\u0014\u000e0\f*\u0014#\u0006", 42 - android.view.Gravity.getAbsoluteGravity(i8, i8), (byte) ((-16777162) - android.graphics.Color.rgb(i8, i8, i8)), objArr93);
                                java.lang.Object[] objArr94 = {((java.lang.String) objArr93[i8]).intern()};
                                java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                java.lang.Object obj60 = obj59;
                                if (obj59 == null) {
                                    java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.util.TypedValue.complexToFloat(i8) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(i8) == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 3162, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33100));
                                    byte[] bArr4 = $$a;
                                    java.lang.Object[] objArr95 = new java.lang.Object[1];
                                    c(bArr4[8], androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, bArr4[16], objArr95);
                                    java.lang.reflect.Method method28 = cls35.getMethod((java.lang.String) objArr95[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method28);
                                    obj60 = method28;
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj60).invoke(null, objArr94)).longValue();
                                long j26 = ~(j19 | 253258170);
                                long j27 = ~longValue9;
                                long j28 = (((-139) * longValue9) - 35709402111L) + (((~(253258170 | longValue9)) | j26) * (-280)) + ((j26 | (~(j27 | j19))) * 140) + (((~(longValue9 | 253258170 | j20)) | (~(253258170 | j27 | j19)) | (~((-253258171) | j27 | j20))) * 140) + 1248693074;
                                if (((((int) (j28 >> 32)) & ((((1515576791 | i) * 376) - 2088991750) + (((~(i23 | 1478638025)) | 39175190) * (-376)) + (((~((-1478638026) | i)) | (-41411615)) * 376))) | (((int) j28) & ((((~(1035570219 | i)) | (-401656191)) * (-366)) + 858905941 + (((~((-37765461) | i)) | 671679489) * 366)))) != 0) {
                                    java.lang.Object[] objArr96 = {new int[]{i}, new int[]{i ^ 90}, null, null, new int[1]};
                                    java.lang.Object[] objArr97 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-2637827) | i)) | (~(i23 | (-940974085)))) * 497) + 1464679522 + (((~(i | (-940974085))) | (~(i23 | (-86524035))) | 83886208) * 497))};
                                    java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr3);
                                    java.lang.Object obj62 = obj61;
                                    if (obj61 == null) {
                                        java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, android.view.View.combineMeasuredStates(0, 0) + 2713, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                                        c((byte) ($$b & 50), 653, $$a[41], objArr98);
                                        java.lang.reflect.Method method29 = cls36.getMethod((java.lang.String) objArr98[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr3, method29);
                                        obj62 = method29;
                                    }
                                    ((int[]) objArr96[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj62).invoke(null, objArr97)).intValue();
                                    return objArr96;
                                }
                                java.lang.Object[] objArr99 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                java.lang.Object[] objArr100 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((940578304 | i) * 988) + 1252148184 + (((~(i23 | 943208084)) | 84298080) * (-1976)) + (((~(i | (-86927861))) | 940578304 | (~(i23 | 86927860))) * 988))};
                                java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr3);
                                java.lang.Object obj64 = obj63;
                                if (obj63 == null) {
                                    java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0) + 2713, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                    java.lang.Object[] objArr101 = new java.lang.Object[1];
                                    c((byte) ($$b & 50), 653, $$a[41], objArr101);
                                    java.lang.reflect.Method method30 = cls37.getMethod((java.lang.String) objArr101[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr3, method30);
                                    obj64 = method30;
                                }
                                ((int[]) objArr99[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj64).invoke(null, objArr100)).intValue();
                                return objArr99;
                            }
                            i18 = i21 + 1;
                            indexOf = i20;
                            str8 = str6;
                            intern3 = str9;
                        }
                    }
                    int i31 = indexOf;
                    str = intern3;
                    java.lang.String str13 = (java.lang.String) java.lang.Class.forName(intern).getField(intern2).get(invoke);
                    if (str13.length() >= 6) {
                        int i32 = 0;
                        scrollDefaultDelay = scrollDefaultDelay;
                        while (i32 <= str13.length() - 6) {
                            java.lang.Object[] objArr102 = {str13.substring(i32, i32 + 6), 931995};
                            java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            java.lang.Object obj66 = obj65;
                            if (obj65 == null) {
                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 28, android.graphics.Color.blue(0) + 2594, (char) (android.os.Process.myPid() >> 22));
                                byte b7 = $$a[41];
                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                c(b7, b7, r8[52], objArr103);
                                java.lang.reflect.Method method31 = cls38.getMethod((java.lang.String) objArr103[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method31);
                                obj66 = method31;
                            }
                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj66).invoke(null, objArr102)).longValue();
                            long j29 = ~longValue10;
                            long j30 = i4;
                            java.lang.String str14 = str13;
                            int i33 = i32;
                            long j31 = ~j30;
                            java.lang.Object obj67 = invoke;
                            int i34 = i31;
                            ?? r37 = longValue10 | 555797009;
                            java.lang.String str15 = intern;
                            java.lang.String str16 = intern2;
                            long j32 = ((-987) * longValue10) + 549683241901L + (((~(j29 | j31 | 555797009)) | (~(r37 | j30))) * 988) + ((555797009 | j29) * (-988)) + (((~(j31 | 555797009 | longValue10)) | (~((-555797010) | j29)) | (~(j29 | j30))) * 988) + 701303515;
                            int i35 = ~i4;
                            int i36 = ~((-1030215253) | i35);
                            if (((((int) j32) & ((((~((-1280835849) | i4)) | (~((-285515846) | i35))) * 497) + 819985368 + (((~(i35 | (-1291389193))) | 10553344 | (~((-285515846) | i4))) * 497))) | (((int) (j32 >> 32)) & (((1082654720 | i36) * (-970)) + 129790908 + ((i36 | (-2112869973)) * 970)))) == -2096167706) {
                                objArr6 = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                java.lang.String str17 = (java.lang.String) java.lang.Class.forName(str15).getField(str16).get(obj67);
                                ((int[]) objArr6[0])[0] = i4;
                                ((int[]) objArr6[1])[0] = i4 ^ 20;
                                java.lang.Object[] objArr104 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(383407560 | i4)) | (-646728385)) * (-668)) + 1675880392 + (((~((-646728385) | i4)) | 383407560) * 1336) + (((-537135617) | i4) * 668))};
                                java.lang.Object obj68 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r9);
                                java.lang.Object obj69 = obj68;
                                if (obj68 == null) {
                                    java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionType(0L), 2713 - android.view.View.MeasureSpec.getMode(0), (char) android.text.TextUtils.getCapsMode("", 0, 0));
                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                    c((byte) ($$b & 50), 653, $$a[41], objArr105);
                                    java.lang.reflect.Method method32 = cls39.getMethod((java.lang.String) objArr105[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r9, method32);
                                    obj69 = method32;
                                }
                                c3 = 0;
                                ((int[]) objArr6[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj69).invoke(null, objArr104)).intValue();
                                objArr = objArr6;
                                c = c3;
                                strArr = r9;
                                i5 = 1;
                                if (((int[]) objArr[i5])[c] != i4) {
                                }
                            } else {
                                i32 = i33 + 1;
                                invoke = obj67;
                                str13 = str14;
                                i31 = i34;
                                intern2 = str16;
                                intern = str15;
                                scrollDefaultDelay = r37;
                            }
                        }
                    }
                    str2 = intern;
                    str3 = intern2;
                    obj = invoke;
                    java.lang.String substring = ((java.lang.String) java.lang.Class.forName(str2).getField(str3).get(obj)).substring(0, i31);
                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                    b(596799118 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (-14) - android.text.TextUtils.indexOf("", "", 0, 0), (byte) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 105), (-1724825957) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (short) android.graphics.Color.alpha(0), objArr106);
                    i9 = 0;
                    split = substring.split(((java.lang.String) objArr106[0]).intern());
                    length = split.length;
                    i10 = 0;
                    r9 = r9;
                    s = scrollDefaultDelay;
                    r38 = objArr48;
                    while (i10 < length) {
                        str4 = split[i10];
                        java.lang.Object[] objArr107 = new java.lang.Object[1];
                        a("(\u0002㗸", android.view.View.MeasureSpec.getMode(i9) + 3, (byte) (android.text.TextUtils.getTrimmedLength("") + 49), objArr107);
                        if (str4.split(((java.lang.String) objArr107[i9]).intern()).length > 1) {
                            synchronized (((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.resolveSizeAndState(i9, i9, i9), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1582, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))))) {
                                try {
                                    float complexToFloat3 = android.util.TypedValue.complexToFloat(0);
                                    int red = android.graphics.Color.red(0);
                                    byte tapTimeout = (byte) ((-103) - (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                    r13 = android.view.View.resolveSizeAndState(0, 0, 0);
                                    strArr4 = split;
                                    try {
                                        try {
                                            java.lang.Object[] objArr108 = new java.lang.Object[1];
                                            b((complexToFloat3 > 0.0f ? 1 : (complexToFloat3 == 0.0f ? 0 : -1)) + 596799119, red - 14, tapTimeout, (-1724825893) - r13, (short) android.text.TextUtils.getTrimmedLength(""), objArr108);
                                            java.lang.String intern4 = ((java.lang.String) objArr108[0]).intern();
                                            try {
                                                try {
                                                    java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                                                    java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                    a("\u0011(", 2 - android.text.TextUtils.getCapsMode("", 0, 0), (byte) (19 - android.view.View.combineMeasuredStates(0, 0)), objArr109);
                                                    exec = runtime.exec(((java.lang.String) objArr109[0]).intern(), (java.lang.String[]) null, (java.io.File) null);
                                                    try {
                                                        java.lang.Object[] objArr110 = {exec.getInputStream()};
                                                        java.lang.Object obj70 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                        java.lang.Object obj71 = obj70;
                                                        if (obj70 == null) {
                                                            try {
                                                                java.lang.reflect.Constructor declaredConstructor = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, 1507 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getDeclaredConstructor(java.io.InputStream.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor);
                                                                obj71 = declaredConstructor;
                                                            } catch (java.lang.Throwable th5) {
                                                                th = th5;
                                                                java.lang.Throwable cause3 = th.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        newInstance = ((java.lang.reflect.Constructor) obj71).newInstance(objArr110);
                                                        try {
                                                            java.lang.Object[] objArr111 = {exec.getErrorStream()};
                                                            java.lang.Object obj72 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                            java.lang.Object obj73 = obj72;
                                                            if (obj72 == null) {
                                                                try {
                                                                    java.lang.reflect.Constructor declaredConstructor2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.graphics.Color.green(0), android.widget.ExpandableListView.getPackedPositionType(0L) + 1507, (char) ((-1) - android.os.Process.getGidForName("")))).getDeclaredConstructor(java.io.InputStream.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor2);
                                                                    obj73 = declaredConstructor2;
                                                                } catch (java.lang.Throwable th6) {
                                                                    th2 = th6;
                                                                    java.lang.Throwable cause4 = th2.getCause();
                                                                    if (cause4 != null) {
                                                                        throw cause4;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            }
                                                            newInstance2 = ((java.lang.reflect.Constructor) obj73).newInstance(objArr111);
                                                            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                                            try {
                                                                java.lang.Class<?> cls40 = java.lang.Class.forName(str);
                                                                s = length;
                                                                try {
                                                                    r38 = i10;
                                                                    strArr5 = r9;
                                                                    try {
                                                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                        b(596799151 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (-14) - android.widget.ExpandableListView.getPackedPositionGroup(0L), (byte) ((android.os.Process.myPid() >> 22) + 76), (-1724825889) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (short) (android.view.MotionEvent.axisFromString("") + 1), objArr112);
                                                                        cls40.getMethod(((java.lang.String) objArr112[0]).intern(), null).invoke(newInstance, null);
                                                                        try {
                                                                            cls = java.lang.Class.forName(str);
                                                                            str5 = str3;
                                                                            obj2 = obj;
                                                                        } catch (java.lang.Throwable th7) {
                                                                            th = th7;
                                                                        }
                                                                        try {
                                                                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                            b((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 596799151, (-14) - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (76 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), (-1724825890) - android.view.View.getDefaultSize(0, 0), (short) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr113);
                                                                            cls.getMethod(((java.lang.String) objArr113[0]).intern(), null).invoke(newInstance2, null);
                                                                            try {
                                                                                try {
                                                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                                    sb.append(intern4);
                                                                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                                    b(596799156 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.os.Process.myTid() >> 22) - 14, (byte) ((-51) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (-1724825996) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (short) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr114);
                                                                                    sb.append(((java.lang.String) objArr114[0]).intern());
                                                                                    java.lang.String obj74 = sb.toString();
                                                                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                                    b(android.graphics.Color.alpha(0) + 596799157, android.text.TextUtils.indexOf("", "") - 14, (byte) (android.text.TextUtils.getOffsetAfter("", 0) + 21), (-1724825920) - android.text.TextUtils.indexOf("", "", 0, 0), (short) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr115);
                                                                                    dataOutputStream.write(obj74.getBytes(((java.lang.String) objArr115[0]).intern()));
                                                                                    dataOutputStream.flush();
                                                                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                                    b(596799162 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-14) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (android.text.TextUtils.indexOf("", "", 0) + 104), (-1724825904) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr116);
                                                                                    java.lang.String intern5 = ((java.lang.String) objArr116[0]).intern();
                                                                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                                    b((android.os.Process.myTid() >> 22) + 596799157, (android.view.KeyEvent.getMaxKeyCode() >> 16) - 14, (byte) (21 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), (-1724825920) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (short) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr117);
                                                                                    dataOutputStream.write(intern5.getBytes(((java.lang.String) objArr117[0]).intern()));
                                                                                    dataOutputStream.flush();
                                                                                    try {
                                                                                        long nanoTime = java.lang.System.nanoTime();
                                                                                        long j33 = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                        while (true) {
                                                                                            try {
                                                                                                try {
                                                                                                    exec.exitValue();
                                                                                                    r5 = j33;
                                                                                                } catch (java.lang.IllegalThreadStateException unused) {
                                                                                                    if (j33 > 0) {
                                                                                                        try {
                                                                                                            java.lang.Object[] objArr118 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j33) + 1, 3L))};
                                                                                                            java.lang.Class<?> cls41 = java.lang.Class.forName(str);
                                                                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                                                            a("\u000f(㘃㘃㗮", 4 - android.view.MotionEvent.axisFromString(""), (byte) (android.text.TextUtils.getCapsMode("", 0, 0) + 4), objArr119);
                                                                                                            cls41.getMethod(((java.lang.String) objArr119[0]).intern(), java.lang.Long.TYPE).invoke(null, objArr118);
                                                                                                        } catch (java.lang.Throwable th8) {
                                                                                                            java.lang.Throwable cause5 = th8.getCause();
                                                                                                            if (cause5 != null) {
                                                                                                                throw cause5;
                                                                                                            }
                                                                                                            throw th8;
                                                                                                        }
                                                                                                    }
                                                                                                    long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                                                    r5 = nanos;
                                                                                                    if (nanos > 0) {
                                                                                                        j33 = nanos;
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    break;
                                                                                                } catch (java.io.IOException unused2) {
                                                                                                }
                                                                                            } catch (java.lang.InterruptedException e) {
                                                                                                interruptedException = e;
                                                                                                try {
                                                                                                    throw interruptedException;
                                                                                                } catch (java.lang.Throwable th9) {
                                                                                                    th = th9;
                                                                                                    th3 = th;
                                                                                                    try {
                                                                                                        exec.destroy();
                                                                                                        throw th3;
                                                                                                    } catch (java.lang.Exception unused3) {
                                                                                                        throw th3;
                                                                                                    }
                                                                                                }
                                                                                            } catch (java.lang.Throwable th10) {
                                                                                                th3 = th10;
                                                                                                exec.destroy();
                                                                                                throw th3;
                                                                                            }
                                                                                        }
                                                                                    } catch (java.lang.InterruptedException e2) {
                                                                                        interruptedException = e2;
                                                                                    } catch (java.lang.Throwable th11) {
                                                                                        th = th11;
                                                                                        th3 = th;
                                                                                        exec.destroy();
                                                                                        throw th3;
                                                                                    }
                                                                                } catch (java.io.IOException unused4) {
                                                                                    i4 = i;
                                                                                    r13 = obj2;
                                                                                    split = strArr5;
                                                                                    r9 = str5;
                                                                                }
                                                                            } catch (java.lang.Exception unused5) {
                                                                            }
                                                                        } catch (java.lang.Throwable th12) {
                                                                            th = th12;
                                                                            java.lang.Throwable th13 = th;
                                                                            java.lang.Throwable cause6 = th13.getCause();
                                                                            if (cause6 != null) {
                                                                                throw cause6;
                                                                            }
                                                                            throw th13;
                                                                        }
                                                                    } catch (java.lang.Throwable th14) {
                                                                        th = th14;
                                                                        java.lang.Throwable th15 = th;
                                                                        cause = th15.getCause();
                                                                        if (cause == null) {
                                                                            throw cause;
                                                                        }
                                                                        throw th15;
                                                                    }
                                                                } catch (java.lang.Throwable th16) {
                                                                    th = th16;
                                                                    java.lang.Throwable th152 = th;
                                                                    cause = th152.getCause();
                                                                    if (cause == null) {
                                                                    }
                                                                }
                                                            } catch (java.lang.Throwable th17) {
                                                                th = th17;
                                                            }
                                                        } catch (java.lang.Throwable th18) {
                                                            th2 = th18;
                                                        }
                                                    } catch (java.lang.Throwable th19) {
                                                        th = th19;
                                                    }
                                                } catch (java.lang.Exception unused6) {
                                                }
                                            } catch (java.lang.Exception unused7) {
                                            }
                                        } catch (java.io.IOException unused8) {
                                        }
                                    } catch (java.io.IOException unused9) {
                                        s = length;
                                        r38 = i10;
                                        r13 = obj;
                                        split = r9;
                                        r9 = str3;
                                        i10 = r38 + 1;
                                        str3 = r9;
                                        obj = r13;
                                        length = s == true ? 1 : 0;
                                        i9 = 0;
                                        r9 = split;
                                        split = strArr4;
                                        s = s;
                                        r38 = r38;
                                    }
                                } catch (java.io.IOException unused10) {
                                    strArr4 = split;
                                }
                            }
                            java.lang.Object[] objArr120 = {new int[1], new int[1], null, r2, new int[1]};
                            java.lang.String str18 = (java.lang.String) java.lang.Class.forName(str2).getField(str5).get(obj2);
                            i4 = i;
                            ((int[]) objArr120[0])[0] = i4;
                            ((int[]) objArr120[1])[0] = i4 ^ 20;
                            java.lang.Object[] objArr121 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((-608180233) | i4) * (-627)) - 1614688864) + (((~((-421513057) | i4)) | 608622888) * (-627)) + (((~((~i4) | 421513056)) | (~(608622888 | i4))) * 627))};
                            java.lang.String[] strArr8 = strArr5;
                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr8);
                            java.lang.Object obj75 = obj3;
                            if (obj3 == null) {
                                java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50, 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                java.lang.Object[] objArr122 = new java.lang.Object[1];
                                c((byte) ($$b & 50), 653, $$a[41], objArr122);
                                java.lang.reflect.Method method33 = cls42.getMethod((java.lang.String) objArr122[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr8, method33);
                                obj75 = method33;
                            }
                            ((int[]) objArr120[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj75).invoke(null, objArr121)).intValue();
                            objArr = objArr120;
                            strArr = strArr8;
                            i5 = 1;
                            c = 0;
                            if (((int[]) objArr[i5])[c] != i4) {
                            }
                        } else {
                            strArr4 = split;
                            s = length;
                            r38 = i10;
                            r13 = obj;
                            split = r9;
                            r9 = str3;
                        }
                        i10 = r38 + 1;
                        str3 = r9;
                        obj = r13;
                        length = s == true ? 1 : 0;
                        i9 = 0;
                        r9 = split;
                        split = strArr4;
                        s = s;
                        r38 = r38;
                    }
                }
                strArr = r9;
                objArr = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                int i37 = ~i4;
                java.lang.Object[] objArr123 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-551543343) | i37)) | (-478592603)) * (-933)) + 373699628 + (((~(i37 | (-478592603))) | 469769296) * 933) + 598047525)};
                java.lang.Object obj76 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr);
                java.lang.Object obj77 = obj76;
                if (obj76 == null) {
                    java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50, android.text.TextUtils.getOffsetBefore("", 0) + 2713, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                    c((byte) ($$b & 50), 653, $$a[41], objArr124);
                    java.lang.reflect.Method method34 = cls43.getMethod((java.lang.String) objArr124[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr, method34);
                    obj77 = method34;
                }
                int intValue3 = ((java.lang.Integer) ((java.lang.reflect.Method) obj77).invoke(null, objArr123)).intValue();
                c = 0;
                ((int[]) objArr[4])[0] = intValue3;
                i5 = 1;
                if (((int[]) objArr[i5])[c] != i4) {
                }
            } catch (java.lang.Throwable th20) {
                java.lang.Throwable cause7 = th20.getCause();
                if (cause7 != null) {
                    throw cause7;
                }
                throw th20;
            }
            i4 = i;
            r13 = obj2;
            r9 = str5;
            split = strArr5;
            i10 = r38 + 1;
            str3 = r9;
            obj = r13;
            length = s == true ? 1 : 0;
            i9 = 0;
            r9 = split;
            split = strArr4;
            s = s;
            r38 = r38;
            try {
                try {
                    java.lang.Class<?> cls44 = java.lang.Class.forName(str);
                    java.lang.Object[] objArr125 = new java.lang.Object[1];
                    b(596799167 - android.text.TextUtils.indexOf("", "", 0, 0), (-14) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (byte) (19 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), (-1724825899) - android.view.KeyEvent.getDeadChar(0, 0), (short) android.text.TextUtils.getOffsetAfter("", 0), objArr125);
                    cls44.getMethod(((java.lang.String) objArr125[0]).intern(), java.lang.Long.TYPE).invoke(newInstance, 100L);
                    try {
                        java.lang.Class<?> cls45 = java.lang.Class.forName(str);
                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                        b(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28303, android.view.KeyEvent.keyCodeFromString("") - 14, (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18), (-1724825900) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr126);
                        cls45.getMethod(((java.lang.String) objArr126[0]).intern(), java.lang.Long.TYPE).invoke(newInstance2, 10L);
                        try {
                            exec.destroy();
                        } catch (java.lang.Exception unused11) {
                        }
                        try {
                            try {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777172) - android.graphics.Color.rgb(0, 0, 0), android.view.KeyEvent.normalizeMetaState(0) + 1507, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                byte[] bArr5 = $$a;
                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                c(bArr5[46], androidx.compose.material3.ProgressIndicatorKt.SecondLineHeadDelay, bArr5[52], objArr127);
                                sb2.append(cls46.getField((java.lang.String) objArr127[0]).get(newInstance).toString());
                                java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 44, 1507 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                c(bArr5[46], androidx.compose.material3.ProgressIndicatorKt.SecondLineHeadDelay, bArr5[52], objArr128);
                                sb2.append(cls47.getField((java.lang.String) objArr128[0]).get(newInstance2).toString());
                                java.lang.String obj78 = sb2.toString();
                                java.lang.Object[] objArr129 = new java.lang.Object[1];
                                b(android.view.MotionEvent.axisFromString("") + 596799157, (-14) - android.text.TextUtils.indexOf("", "", 0), (byte) ((-50) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1724825995, (short) android.graphics.Color.alpha(0), objArr129);
                                java.lang.String[] split2 = obj78.split(((java.lang.String) objArr129[0]).intern());
                                length2 = split2.length;
                                i11 = 0;
                                while (i11 < length2) {
                                    java.lang.String str19 = split2[i11];
                                    java.lang.Object[] objArr130 = new java.lang.Object[1];
                                    a("\u00130\t\u00060..\u001b\f)\u0001\u0006/&&/)+㗽", 19 - (android.os.Process.myPid() >> 22), (byte) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 73), objArr130);
                                    if (!str19.startsWith(((java.lang.String) objArr130[0]).intern())) {
                                        java.lang.Object[] objArr131 = new java.lang.Object[1];
                                        a("\u00130\t\u00060..\u001b\f)\u0001\u0006.\u0013\u0013!)\u001a\u0013\f", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 20, (byte) (76 - android.text.TextUtils.getCapsMode("", 0, 0)), objArr131);
                                        if (str19.startsWith(((java.lang.String) objArr131[0]).intern())) {
                                            continue;
                                        } else {
                                            java.lang.Object[] objArr132 = new java.lang.Object[1];
                                            a("\u00130\t\u00060..\u001b", android.text.TextUtils.getTrimmedLength("") + 8, (byte) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 90), objArr132);
                                            if (str19.startsWith(((java.lang.String) objArr132[0]).intern())) {
                                                java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                a("㘒", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, (byte) (113 - android.view.MotionEvent.axisFromString("")), objArr133);
                                                java.lang.String[] split3 = str19.split(((java.lang.String) objArr133[0]).intern());
                                                if (split3.length > 1 && split3[1].equalsIgnoreCase(str4)) {
                                                    java.lang.Object[] objArr1202 = {new int[1], new int[1], null, str18, new int[1]};
                                                    java.lang.String str182 = (java.lang.String) java.lang.Class.forName(str2).getField(str5).get(obj2);
                                                    i4 = i;
                                                    ((int[]) objArr1202[0])[0] = i4;
                                                    ((int[]) objArr1202[1])[0] = i4 ^ 20;
                                                    java.lang.Object[] objArr1212 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((-608180233) | i4) * (-627)) - 1614688864) + (((~((-421513057) | i4)) | 608622888) * (-627)) + (((~((~i4) | 421513056)) | (~(608622888 | i4))) * 627))};
                                                    java.lang.String[] strArr82 = strArr5;
                                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr82);
                                                    java.lang.Object obj752 = obj3;
                                                    if (obj3 == null) {
                                                    }
                                                    ((int[]) objArr1202[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj752).invoke(null, objArr1212)).intValue();
                                                    objArr = objArr1202;
                                                    strArr = strArr82;
                                                    i5 = 1;
                                                    c = 0;
                                                    if (((int[]) objArr[i5])[c] != i4) {
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    i11++;
                                    strArr5 = strArr5;
                                    str5 = str5;
                                    obj2 = obj2;
                                }
                            } catch (java.lang.Exception unused12) {
                                java.lang.Object[] objArr134 = new java.lang.Object[1];
                                a("-0\u0016)/\r$\u0000)$\f\u001b*0\u0006+(*)\u000e!/\u0014\u0006㘱㘱㗼", 27 - (android.os.Process.myPid() >> 22), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 73), objArr134);
                                throw new java.io.IOException(((java.lang.String) objArr134[0]).intern());
                            }
                        } catch (java.io.IOException unused13) {
                        }
                        i4 = i;
                        r13 = obj2;
                        r9 = str5;
                        split = strArr5;
                        i10 = r38 + 1;
                        str3 = r9;
                        obj = r13;
                        length = s == true ? 1 : 0;
                        i9 = 0;
                        r9 = split;
                        split = strArr4;
                        s = s;
                        r38 = r38;
                    } catch (java.lang.Throwable th21) {
                        java.lang.Throwable cause8 = th21.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th21;
                    }
                } catch (java.lang.Throwable th22) {
                    java.lang.Throwable cause9 = th22.getCause();
                    if (cause9 != null) {
                        throw cause9;
                    }
                    throw th22;
                }
            } catch (java.lang.InterruptedException e3) {
                interruptedException = e3;
                throw interruptedException;
            } catch (java.lang.Throwable th23) {
                th3 = th23;
                exec.destroy();
                throw th3;
            }
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            java.lang.Class cls462 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777172) - android.graphics.Color.rgb(0, 0, 0), android.view.KeyEvent.normalizeMetaState(0) + 1507, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
            byte[] bArr52 = $$a;
            java.lang.Object[] objArr1272 = new java.lang.Object[1];
            c(bArr52[46], androidx.compose.material3.ProgressIndicatorKt.SecondLineHeadDelay, bArr52[52], objArr1272);
            sb22.append(cls462.getField((java.lang.String) objArr1272[0]).get(newInstance).toString());
            java.lang.Class cls472 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 44, 1507 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
            java.lang.Object[] objArr1282 = new java.lang.Object[1];
            c(bArr52[46], androidx.compose.material3.ProgressIndicatorKt.SecondLineHeadDelay, bArr52[52], objArr1282);
            sb22.append(cls472.getField((java.lang.String) objArr1282[0]).get(newInstance2).toString());
            java.lang.String obj782 = sb22.toString();
            java.lang.Object[] objArr1292 = new java.lang.Object[1];
            b(android.view.MotionEvent.axisFromString("") + 596799157, (-14) - android.text.TextUtils.indexOf("", "", 0), (byte) ((-50) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1724825995, (short) android.graphics.Color.alpha(0), objArr1292);
            java.lang.String[] split22 = obj782.split(((java.lang.String) objArr1292[0]).intern());
            length2 = split22.length;
            i11 = 0;
            while (i11 < length2) {
            }
            i4 = i;
            r13 = obj2;
            r9 = str5;
            split = strArr5;
            i10 = r38 + 1;
            str3 = r9;
            obj = r13;
            length = s == true ? 1 : 0;
            i9 = 0;
            r9 = split;
            split = strArr4;
            s = s;
            r38 = r38;
        } catch (java.lang.Throwable th24) {
            java.lang.Throwable cause10 = th24.getCause();
            if (cause10 != null) {
                throw cause10;
            }
            throw th24;
        }
    }

    static void init$0() {
        $$a = new byte[]{92, 60, com.visa.cbp.getEncExpo.IResultReceiver2, com.visa.cbp.getEncExpo.IResultReceiver, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10, -39, 0, -4, -13, 9, -19, 19, -1, com.google.common.base.Ascii.US, -32, -19, com.google.common.base.Ascii.FF, 18, -36, 1, 7, -5, -5, 5};
        $$b = 239;
    }
}
