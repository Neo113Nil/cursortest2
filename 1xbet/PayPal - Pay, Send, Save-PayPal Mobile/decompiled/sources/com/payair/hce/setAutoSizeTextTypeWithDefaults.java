package com.payair.hce;

/* loaded from: classes4.dex */
public class setAutoSizeTextTypeWithDefaults implements com.payair.hce.setSelectedGroup {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static final byte[] IccPrivateKeyCrtComponentsJson = null;
    private static final int getProfileVersion = 0;
    private static int valueOf;
    private static long values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = s + 4;
        int i4 = s2 * 27;
        int i5 = (i * 19) + 99;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[34 - i4];
        int i6 = 33 - i4;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i5 += -i7;
            bArr2[i2] = (byte) i5;
            i3++;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i3];
            i5 += -i7;
            bArr2[i2] = (byte) i5;
            i3++;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i3++;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = i * 4;
        byte[] bArr = $$d;
        int i4 = 106 - s;
        int i5 = (s2 * 2) + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            i4 = i3;
            int i6 = i5;
            int i7 = 0;
            i4 += -i5;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i5;
            i5 = bArr[i5];
            i4 += -i5;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        }
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        if (!(obj instanceof java.lang.Number)) {
            try {
                return java.lang.Double.valueOf(java.lang.Double.parseDouble(obj.toString()));
            } catch (java.lang.Exception unused) {
                throw setongroupexpandlistener.DigitizedCardProfile(obj, java.lang.Double.class);
            }
        }
        AlternateContactlessPaymentDataJson = (writeReplace + 67) % 128;
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        AlternateContactlessPaymentDataJson = (writeReplace + 95) % 128;
        return java.lang.Double.valueOf(doubleValue);
    }

    private static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        int i2 = $10;
        $11 = (i2 + 23) % 128;
        java.lang.Object obj = null;
        if (str3 != null) {
            int i3 = i2 + 25;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            int i4 = $11 + 25;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            cArr2 = str.toCharArray();
            $11 = ($10 + 19) % 128;
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 1179, (char) android.view.View.getDefaultSize(0, 0));
                    byte length4 = (byte) $$d.length;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(0, length4, (byte) (length4 - 4), objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 30, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 3443, (char) (android.view.View.combineMeasuredStates(0, 0) + 3831))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 27, 1865 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (41775 - android.view.View.resolveSizeAndState(0, 0, 0)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d(0, (short) 1, (short) 0, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.GS, 3133 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d(0, (short) 0, (short) 0, objArr8);
                    c2 = 2;
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((int) (valueOf ^ 1263759066225628708L)) ^ ((cArr5[intValue2] ^ charArray[getwalletdata.writeReplace]) ^ (values ^ 1263759066225628708L))) ^ ((char) (DigitizedCardProfile ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                charArray = charArray;
                obj = null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str4 = new java.lang.String(cArr7);
        $10 = ($11 + 41) % 128;
        objArr[0] = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0520 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void DigitizedCardProfile(long j, long j2) {
        int i;
        int i2;
        ?? r13;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object method;
        java.lang.Object invoke;
        java.lang.String str;
        com.payair.hce.setFirstBaselineToTopHeight setfirstbaselinetotopheight = new com.payair.hce.setFirstBaselineToTopHeight(j, j2);
        byte[] bArr = IccPrivateKeyCrtComponentsJson;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(bArr[102], bArr[47], com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, objArr);
        java.lang.String str2 = (java.lang.String) objArr[0];
        byte b = bArr[34];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        int i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, b, b, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            byte b2 = (byte) (getProfileVersion + 3);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, b2, bArr[332], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, (short) 71, bArr[66], objArr5);
            java.lang.String str3 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, b2, bArr[332], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str2, objArr3);
            int[] iArr = new int[objArr7.length];
            int i4 = 0;
            while (true) {
                i = 7;
                if (i4 >= objArr7.length) {
                    break;
                }
                java.lang.Object[] objArr8 = {objArr7[i4]};
                int i5 = getProfileVersion;
                byte b3 = (byte) (i5 + 3);
                byte[] bArr2 = IccPrivateKeyCrtComponentsJson;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE, b3, bArr2[348], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(312, (short) 74, bArr2[7], objArr10);
                java.lang.String str4 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, b3, bArr2[332], objArr11);
                java.lang.Object invoke2 = cls2.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE, b3, bArr2[348], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(318, (byte) (i5 + 2), bArr2[10], objArr13);
                iArr[i4] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke2, null)).intValue();
                i4++;
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                try {
                    r13 = 23;
                } catch (java.lang.Throwable th) {
                    th = th;
                    i2 = i;
                }
                switch (setfirstbaselinetotopheight.values(iArr[i6])) {
                    case -38:
                        i6 = 26;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -37:
                        i2 = i;
                        i6 = 82;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -36:
                        i2 = i;
                        try {
                            setfirstbaselinetotopheight.values(34);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i7 >= 26) {
                            }
                            throw th;
                        }
                        if (setfirstbaselinetotopheight.DigitizedCardProfile == 0) {
                            i6 = 81;
                            i = i2;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                        }
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                        break;
                    case -35:
                        try {
                            setfirstbaselinetotopheight.values = 1;
                            i2 = 7;
                            try {
                                setfirstbaselinetotopheight.values(7);
                                setfirstbaselinetotopheight.values(9);
                                AlternateContactlessPaymentDataJson = setfirstbaselinetotopheight.DigitizedCardProfile;
                                i6 = i7;
                                i = i2;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                if (i7 >= 26) {
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            i2 = 7;
                        }
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                        break;
                    case -34:
                        setfirstbaselinetotopheight.values = writeReplace;
                        setfirstbaselinetotopheight.values(2);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -33:
                        i6 = 1;
                        i = 7;
                    case -32:
                        i6 = 71;
                        i = 7;
                    case -31:
                        setfirstbaselinetotopheight.values(30);
                        if (setfirstbaselinetotopheight.DigitizedCardProfile == 0) {
                            i6 = 70;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                            i = 7;
                        } else {
                            i2 = 7;
                            i6 = i7;
                            i = i2;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                        }
                    case -30:
                        try {
                            setfirstbaselinetotopheight.values = 1;
                            setfirstbaselinetotopheight.values(7);
                            setfirstbaselinetotopheight.values(9);
                            writeReplace = setfirstbaselinetotopheight.DigitizedCardProfile;
                            i2 = 7;
                            i6 = i7;
                            i = i2;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            i2 = 7;
                            if (i7 >= 26) {
                            }
                            throw th;
                        }
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                        break;
                    case -29:
                        setfirstbaselinetotopheight.values = AlternateContactlessPaymentDataJson;
                        setfirstbaselinetotopheight.values(2);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -28:
                        i6 = 72;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                        i = 7;
                    case -27:
                        i6 = 61;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                        i = 7;
                    case -26:
                        return;
                    case -25:
                        byte[] bArr3 = $$a;
                        byte b4 = bArr3[23];
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        c(b4, (byte) (-bArr3[1]), b4, objArr14);
                        obj = (java.lang.String) objArr14[0];
                        setfirstbaselinetotopheight.RecordsJson = obj;
                        setfirstbaselinetotopheight.values(1);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -24:
                        setfirstbaselinetotopheight.values = 1;
                        setfirstbaselinetotopheight.values(7);
                        setfirstbaselinetotopheight.values(8);
                        obj = java.lang.Class.forName((java.lang.String) setfirstbaselinetotopheight.SdkCoreAlternateContactlessPaymentDataImpl);
                        setfirstbaselinetotopheight.RecordsJson = obj;
                        setfirstbaselinetotopheight.values(1);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -23:
                        try {
                            byte[] bArr4 = $$a;
                            byte b5 = (byte) (bArr4[23] - 1);
                            byte b6 = bArr4[34];
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c(b5, b6, (byte) (b6 + 1), objArr15);
                            obj = (java.lang.String) objArr15[0];
                            setfirstbaselinetotopheight.RecordsJson = obj;
                            setfirstbaselinetotopheight.values(1);
                            i2 = 7;
                            i6 = i7;
                            i = i2;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            i2 = 7;
                            if (i7 >= 26) {
                            }
                            throw th;
                        }
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                        break;
                    case -22:
                        try {
                            setfirstbaselinetotopheight.values = 3;
                            setfirstbaselinetotopheight.values(i);
                            setfirstbaselinetotopheight.values(8);
                            java.lang.Object obj3 = setfirstbaselinetotopheight.SdkCoreAlternateContactlessPaymentDataImpl;
                            setfirstbaselinetotopheight.values(8);
                            java.lang.Object obj4 = setfirstbaselinetotopheight.SdkCoreAlternateContactlessPaymentDataImpl;
                            setfirstbaselinetotopheight.values(8);
                            try {
                                java.lang.Object[] objArr16 = {obj4, setfirstbaselinetotopheight.SdkCoreAlternateContactlessPaymentDataImpl};
                                int i8 = getProfileVersion;
                                byte b7 = (byte) (i8 + 3);
                                byte[] bArr5 = IccPrivateKeyCrtComponentsJson;
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                a(403, b7, (short) (bArr5[322] - 1), objArr17);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                a(426, (byte) (i8 + 2), bArr5[4], objArr18);
                                java.lang.String str5 = (java.lang.String) objArr18[0];
                                java.lang.Class<?>[] clsArr = new java.lang.Class[2];
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                a(388, b7, bArr5[332], objArr19);
                                clsArr[0] = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                try {
                                    a(431, (short) 47, bArr5[407], objArr20);
                                    clsArr[1] = java.lang.Class.forName((java.lang.String) objArr20[0]);
                                    try {
                                        setfirstbaselinetotopheight.RecordsJson = cls4.getMethod(str5, clsArr).invoke(obj3, objArr16);
                                        setfirstbaselinetotopheight.values(1);
                                        i2 = 7;
                                        i6 = i7;
                                        i = i2;
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                        i2 = 7;
                                        if (i7 >= 26) {
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                            }
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                        }
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                        break;
                    case -21:
                        obj2 = null;
                        setfirstbaselinetotopheight.values = 3;
                        setfirstbaselinetotopheight.values(i);
                        setfirstbaselinetotopheight.values(8);
                        java.lang.Class cls5 = (java.lang.Class) setfirstbaselinetotopheight.SdkCoreAlternateContactlessPaymentDataImpl;
                        setfirstbaselinetotopheight.values(8);
                        java.lang.String str6 = (java.lang.String) setfirstbaselinetotopheight.SdkCoreAlternateContactlessPaymentDataImpl;
                        setfirstbaselinetotopheight.values(8);
                        method = cls5.getMethod(str6, (java.lang.Class[]) setfirstbaselinetotopheight.SdkCoreAlternateContactlessPaymentDataImpl);
                        setfirstbaselinetotopheight.RecordsJson = method;
                        setfirstbaselinetotopheight.values(1);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -20:
                        obj2 = null;
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a(i3, (byte) (getProfileVersion + 3), IccPrivateKeyCrtComponentsJson[332], objArr21);
                        method = java.lang.Class.forName((java.lang.String) objArr21[0]);
                        setfirstbaselinetotopheight.RecordsJson = method;
                        setfirstbaselinetotopheight.values(1);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        obj2 = null;
                        setfirstbaselinetotopheight.values = 1;
                        setfirstbaselinetotopheight.values(i);
                        setfirstbaselinetotopheight.values(9);
                        setfirstbaselinetotopheight.RecordsJson = new java.lang.Class[setfirstbaselinetotopheight.DigitizedCardProfile];
                        setfirstbaselinetotopheight.values(1);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        obj2 = null;
                        method = "valueOf";
                        setfirstbaselinetotopheight.RecordsJson = method;
                        setfirstbaselinetotopheight.values(1);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -17:
                        obj2 = null;
                        method = com.payair.hce.setLongClickable.class;
                        setfirstbaselinetotopheight.RecordsJson = method;
                        setfirstbaselinetotopheight.values(1);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -16:
                        obj2 = null;
                        setfirstbaselinetotopheight.values = 1;
                        setfirstbaselinetotopheight.values(i);
                        setfirstbaselinetotopheight.values(9);
                        int i9 = setfirstbaselinetotopheight.DigitizedCardProfile;
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a(388, (byte) (getProfileVersion + 3), IccPrivateKeyCrtComponentsJson[332], objArr22);
                        method = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr22[0]), i9);
                        setfirstbaselinetotopheight.RecordsJson = method;
                        setfirstbaselinetotopheight.values(1);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -15:
                        setfirstbaselinetotopheight.values(15);
                        throw ((java.lang.Throwable) setfirstbaselinetotopheight.SdkCoreAlternateContactlessPaymentDataImpl);
                    case -14:
                        i6 = 24;
                    case -13:
                        i6 = 21;
                    case -12:
                        try {
                            setfirstbaselinetotopheight.values(12);
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                            i2 = i;
                            if ((i7 >= 26 || i7 > 44) && (i7 < 44 || i7 > 54)) {
                                throw th;
                            }
                            setfirstbaselinetotopheight.RecordsJson = th;
                            setfirstbaselinetotopheight.values(35);
                            i = i2;
                            i6 = 15;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                        }
                        if (setfirstbaselinetotopheight.DigitizedCardProfile == 0) {
                            i6 = 20;
                        } else {
                            i2 = i;
                            i6 = i7;
                            i = i2;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                        }
                    case -11:
                        try {
                            setfirstbaselinetotopheight.values = 1;
                            setfirstbaselinetotopheight.values(i);
                            setfirstbaselinetotopheight.values(8);
                            java.lang.Object obj5 = setfirstbaselinetotopheight.SdkCoreAlternateContactlessPaymentDataImpl;
                            try {
                                int i10 = getProfileVersion;
                                byte[] bArr6 = IccPrivateKeyCrtComponentsJson;
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                a(363, (byte) (i10 + 3), bArr6[407], objArr23);
                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                a(381, (byte) i10, bArr6[10], objArr24);
                                obj2 = null;
                                try {
                                    method = cls6.getMethod((java.lang.String) objArr24[0], null).invoke(obj5, null);
                                    setfirstbaselinetotopheight.RecordsJson = method;
                                    setfirstbaselinetotopheight.values(1);
                                    i2 = 7;
                                    i6 = i7;
                                    i = i2;
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
                            r13 = 0;
                            i2 = i;
                            if (i7 >= 26) {
                            }
                            throw th;
                        }
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                        break;
                    case -10:
                        i6 = 57;
                    case -9:
                        setfirstbaselinetotopheight.values = 1;
                        setfirstbaselinetotopheight.values(i);
                        setfirstbaselinetotopheight.values(8);
                        java.lang.Object obj6 = setfirstbaselinetotopheight.SdkCoreAlternateContactlessPaymentDataImpl;
                        try {
                            int i11 = getProfileVersion;
                            byte[] bArr7 = IccPrivateKeyCrtComponentsJson;
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            a(i3, (byte) (i11 + 3), bArr7[332], objArr25);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(358, (byte) (i11 + 2), bArr7[4], objArr26);
                            invoke = cls7.getMethod((java.lang.String) objArr26[0], null).invoke(obj6, null);
                            setfirstbaselinetotopheight.RecordsJson = invoke;
                            setfirstbaselinetotopheight.values(1);
                            i2 = 7;
                            i6 = i7;
                            i = i2;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                        } catch (java.lang.Throwable th15) {
                            java.lang.Throwable cause3 = th15.getCause();
                            if (cause3 == null) {
                                throw th15;
                            }
                            throw cause3;
                        }
                    case -8:
                        setfirstbaselinetotopheight.values = 5;
                        setfirstbaselinetotopheight.values(i);
                        setfirstbaselinetotopheight.values(8);
                        java.lang.String str7 = (java.lang.String) setfirstbaselinetotopheight.SdkCoreAlternateContactlessPaymentDataImpl;
                        setfirstbaselinetotopheight.values(8);
                        java.lang.String str8 = (java.lang.String) setfirstbaselinetotopheight.SdkCoreAlternateContactlessPaymentDataImpl;
                        setfirstbaselinetotopheight.values(8);
                        java.lang.String str9 = (java.lang.String) setfirstbaselinetotopheight.SdkCoreAlternateContactlessPaymentDataImpl;
                        setfirstbaselinetotopheight.values(9);
                        int i12 = setfirstbaselinetotopheight.DigitizedCardProfile;
                        setfirstbaselinetotopheight.values(9);
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        b(str7, str8, str9, i12, (char) setfirstbaselinetotopheight.DigitizedCardProfile, objArr27);
                        invoke = (java.lang.String) objArr27[0];
                        setfirstbaselinetotopheight.RecordsJson = invoke;
                        setfirstbaselinetotopheight.values(1);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -7:
                        setfirstbaselinetotopheight.values = 44547;
                        setfirstbaselinetotopheight.values(2);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -6:
                        try {
                            byte b8 = (byte) (-IccPrivateKeyCrtComponentsJson[336]);
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            a(325, b8, (short) (b8 & 91), objArr28);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                            try {
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                a(com.visa.cbp.getCertUsage.isReperso, (byte) getProfileVersion, r0[348], objArr29);
                                try {
                                    setfirstbaselinetotopheight.writeReplace = ((java.lang.Long) cls8.getMethod((java.lang.String) objArr29[0], null).invoke(null, null)).longValue();
                                    setfirstbaselinetotopheight.values(3);
                                    i2 = i;
                                    i6 = i7;
                                    i = i2;
                                } catch (java.lang.Throwable th16) {
                                    th = th16;
                                    i2 = i;
                                    if (i7 >= 26) {
                                    }
                                    throw th;
                                }
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                            } catch (java.lang.Throwable th17) {
                                th = th17;
                                java.lang.Throwable cause4 = th.getCause();
                                if (cause4 == null) {
                                    throw th;
                                }
                                throw cause4;
                            }
                        } catch (java.lang.Throwable th18) {
                            th = th18;
                        }
                        break;
                    case -5:
                        setfirstbaselinetotopheight.values = -117126994;
                        setfirstbaselinetotopheight.values(2);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -4:
                        str = "굼ӈ˹閮";
                        setfirstbaselinetotopheight.RecordsJson = str;
                        setfirstbaselinetotopheight.values(1);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -3:
                        str = "쫽㤇覞";
                        setfirstbaselinetotopheight.RecordsJson = str;
                        setfirstbaselinetotopheight.values(1);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -2:
                        str = "朾膬鈨몺";
                        setfirstbaselinetotopheight.RecordsJson = str;
                        setfirstbaselinetotopheight.values(1);
                        i2 = 7;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
                    case -1:
                        i6 = 54;
                    default:
                        i2 = i;
                        i6 = i7;
                        i = i2;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = s + 44;
        byte[] bArr = IccPrivateKeyCrtComponentsJson;
        int i5 = i + 4;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i2;
            int i8 = 0;
            int i9 = (i7 + i5) - 1;
            i3 = i8;
            int i10 = i6;
            i4 = i9;
            i5 = i10;
            int i11 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i4;
            i6 = i11;
            i5 = bArr[i11];
            i8 = i3 + 1;
            i7 = i12;
            int i92 = (i7 + i5) - 1;
            i3 = i8;
            int i102 = i6;
            i4 = i92;
            i5 = i102;
            int i112 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i2) {
            }
        } else {
            i3 = 0;
            int i1122 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i2) {
            }
        }
    }

    static void AlternateContactlessPaymentDataJson() {
        IccPrivateKeyCrtComponentsJson = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -107, com.google.common.base.Ascii.SUB, -98, 5, -4, 2, 6, -5, 2, 7, -6, 2, 8, -7, 2, 9, -8, 2, 10, -9, 9, -7, 10, -8, 2, com.google.common.base.Ascii.VT, -10, 2, 10, -9, com.google.common.base.Ascii.VT, -9, 6, 0, -3, 2, com.google.common.base.Ascii.FF, -11, 2, 13, -12, 2, 5, 0, -3, 6, 1, -4, 2, 5, 1, -4, 6, 1, -4, 2, 5, 2, -5, 2, 5, 3, -6, 2, 5, 4, -7, 6, 3, -6, 6, 4, -7, 2, 5, 5, -8, 6, 4, -7, 2, 5, 5, -8, 6, 6, -9, 2, 5, 6, -9, 6, 7, -10, 6, 8, -11, 6, 9, -12, 7, -1, -3, 2, 5, 7, -10, 2, 5, 8, -11, 6, 6, -9, 2, 5, 9, -12, 7, 0, -4, 2, 6, -1, -3, 7, -1, -3, 2, 6, 0, -4, 6, 3, -6, 7, 1, -5, 2, 6, 1, -5, 6, 4, -7, 2, 6, 2, -6, 2, 6, 3, -7, 2, 6, 4, -8, 7, 2, -6, 2, 6, 0, -4, 7, 2, -6, 7, 2, -6, 2, 6, 1, -5, 6, 4, -7, 2, 6, 5, -9, 7, 3, -7, 6, 4, -7, 2, 6, 6, -10, 7, 4, -8, 7, 4, -8, 7, 5, -9, 2, 6, 7, -11, 2, 6, 8, -12, 7, 6, -10, 7, 7, -11, 7, 8, -12, 2, 7, -2, -3, 7, 4, -8, 7, 8, -12, 2, 7, -1, -4, 2, 7, 0, -5, 2, 7, 1, -6, 2, 7, 1, -6, 2, 7, 2, -7, 8, -1, -4, 8, 0, -5, 8, 1, -6, 2, 7, 3, -8, 7, 4, -8, 7, 8, -12, 2, 7, 4, -9, 2, 7, 5, -10, 2, 7, 6, -11, 2, 7, 6, -8, com.google.common.base.Ascii.SYN, -20, -50, 63, -10, 14, -6, -56, 38, 34, -1, -8, 6, -6, -2, -3, -2, com.google.common.base.Ascii.FF, -8, com.google.common.base.Ascii.SYN, -20, -50, 63, -10, 14, -6, -56, com.google.common.base.Ascii.FS, 38, 7, -14, 3, -1, 14, -20, com.google.common.base.Ascii.FF, 10, -15, -21, com.google.common.base.Ascii.CAN, 6, 7, -29, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.FF, 10, -15, 14, -9, com.google.common.base.Ascii.SI, -2, -5, -4, -53, 66, 5, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 35, 35, -2, -11, 3, com.google.common.base.Ascii.SI, 1, -1, 16, -46, 40, -10, 16, 4, -13, 0, -32, 46, 6, -32, com.google.common.base.Ascii.SYN, 5, -7, 6, 7, -14, 14, -3, -8, com.google.common.base.Ascii.SYN, -20, -50, 63, -10, 14, -6, -56, 39, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.VT, -2, 9, -21, 2, com.google.common.base.Ascii.VT, -6, -1, 16, -48, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -1, -13, -8, com.google.common.base.Ascii.SYN, -20, -50, 63, -10, 14, -6, -56, 34, com.google.common.base.Ascii.DC4, 9, -4, -1, 18, -8, com.google.common.base.Ascii.SYN, -20, -50, 63, -10, 14, -6, -56, 69, -12, 2, 7, -6, -1, 18, -69, 32, com.google.common.base.Ascii.EM, 16, -11, 8, -10, 6, 9, -6, -3, -5, -14, com.google.common.base.Ascii.US, -8, com.google.common.base.Ascii.SYN, -20, -50, 63, -10, 14, -6, -56, 34, com.google.common.base.Ascii.DC4, 9, -4, -1, 18, -56};
        getProfileVersion = 59;
    }

    static void init$1() {
        $$d = new byte[]{107, -45, -30, com.google.common.base.Ascii.FS};
        $$e = 134;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        AlternateContactlessPaymentDataJson();
        AlternateContactlessPaymentDataJson = 0;
        writeReplace = 1;
        values = -6110447891885412070L;
        valueOf = -804334044;
        DigitizedCardProfile = (char) 54820;
    }

    static void init$0() {
        $$a = new byte[]{3, -32, -117, 13, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -44, 1, -6, com.google.common.base.Ascii.SI, -19, 4, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -41, 3, 6, -8, 10, -1, -10, 7, com.google.common.base.Ascii.NAK, -11, -9, 16, com.google.common.base.Ascii.SYN, -23};
        $$b = 43;
    }
}
