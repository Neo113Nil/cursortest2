package com.payair.hce;

/* loaded from: classes10.dex */
public class setTransactionCredentials {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static final byte[] RecordsJson = null;
    private static final int SdkCoreAlternateContactlessPaymentDataImpl = 0;
    private static int getProfileVersion;
    private static int valueOf;
    private static long writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "CRM_CountryCode")
    public java.lang.String DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "additionalCheckTable")
    public java.lang.String values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 36 - (i * 33);
        int i5 = 34 - (s * 27);
        int i6 = 118 - (b * 19);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i6 = i5;
            int i7 = i4;
            int i8 = 0;
            i6 += i4;
            i4 = i7;
            i2 = i8;
            int i9 = i4 + 1;
            bArr2[i2] = (byte) i6;
            i3 = i2 + 1;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i9;
            i4 = bArr[i9];
            i8 = i3;
            i6 += i4;
            i4 = i7;
            i2 = i8;
            int i92 = i4 + 1;
            bArr2[i2] = (byte) i6;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            int i922 = i4 + 1;
            bArr2[i2] = (byte) i6;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = i + 4;
        int i5 = b * 4;
        byte[] bArr = $$d;
        int i6 = s + 102;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i4 += i6;
            i3 = i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            int i9 = i3 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i9;
            i6 = bArr[i9];
            i4 += i6;
            i3 = i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            int i92 = i3 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            i4 = i6;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            int i922 = i3 + 1;
            if (i2 == i5) {
            }
        }
    }

    private static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        $10 = ($11 + 31) % 128;
        if (str3 != null) {
            cArr = str3.toCharArray();
            $10 = ($11 + 37) % 128;
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $10 = ($11 + 53) % 128;
            cArr2 = str.toCharArray();
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
            $11 = ($10 + 83) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1179 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) 0, -1, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 30, 3443 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (3831 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 1864 - android.graphics.Color.alpha(0), (char) ((android.os.Process.myPid() >> 22) + 41775));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d((byte) 0, -1, (short) 3, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.View.MeasureSpec.getSize(0) + 3133, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d((byte) 0, -1, (byte) $$d.length, objArr8);
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((cArr5[intValue2] ^ charArray[getwalletdata.writeReplace]) ^ (writeReplace ^ 1263759066225628708L)) ^ ((int) (valueOf ^ 1263759066225628708L))) ^ ((char) (AlternateContactlessPaymentDataJson ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0557 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0575 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void DigitizedCardProfile(long j, long j2) {
        int i;
        int i2;
        ?? r9;
        java.lang.Object obj;
        java.lang.Object declaredMethod;
        java.lang.Object invoke;
        int intValue;
        com.payair.hce.getDsrpMdSessionKey getdsrpmdsessionkey = new com.payair.hce.getDsrpMdSessionKey(j, j2);
        byte[] bArr = RecordsJson;
        byte b = bArr[6];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(311, b, (short) (b | 522), objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        short s = bArr[46];
        byte b2 = (byte) s;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(s, b2, (short) (b2 | 212), objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c = 393;
            short s2 = bArr[393];
            char c2 = 319;
            byte b3 = bArr[319];
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            int i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
            a(s2, b3, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            short s3 = bArr[4];
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(s3, (byte) (s3 | 67), 197, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(bArr[393], bArr[319], com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i4 = 0;
            while (true) {
                i = 10;
                if (i4 >= objArr7.length) {
                    break;
                }
                java.lang.Object[] objArr8 = {objArr7[i4]};
                byte[] bArr2 = RecordsJson;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((short) (-bArr2[353]), bArr2[319], 193, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(bArr2[10], (short) 74, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(bArr2[c], bArr2[319], com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, objArr11);
                java.lang.Object invoke2 = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a((short) (-bArr2[353]), bArr2[319], 193, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(bArr2[13], (byte) (SdkCoreAlternateContactlessPaymentDataImpl | 49), 171, objArr13);
                iArr[i4] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke2, null)).intValue();
                i4++;
                c = 393;
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                try {
                    r9 = 30;
                } catch (java.lang.Throwable th) {
                    th = th;
                    i2 = i;
                }
                switch (getdsrpmdsessionkey.writeReplace(iArr[i5])) {
                    case -41:
                        i5 = 88;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -40:
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(35);
                        if (getdsrpmdsessionkey.values != 29) {
                            i5 = 61;
                            i = i2;
                            c2 = 319;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                        } else {
                            i = i2;
                            i5 = 74;
                            c2 = 319;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                        }
                    case -39:
                        i5 = 57;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -38:
                        i5 = 87;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -37:
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(30);
                        if (getdsrpmdsessionkey.values == 0) {
                            i5 = 86;
                            i = i2;
                            c2 = 319;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                        }
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -36:
                        i5 = 89;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -35:
                        i5 = 91;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -34:
                        i2 = i;
                        try {
                            getdsrpmdsessionkey.writeReplace(30);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i6 < 26) {
                            }
                            if (i6 >= 75) {
                            }
                            throw th;
                        }
                        if (getdsrpmdsessionkey.values == 0) {
                            i5 = 72;
                            i = i2;
                            c2 = 319;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                        }
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                        break;
                    case -33:
                        i2 = i;
                        getdsrpmdsessionkey.DigitizedCardProfile = 1;
                        getdsrpmdsessionkey.writeReplace(5);
                        try {
                            getdsrpmdsessionkey.writeReplace(6);
                            getProfileVersion = getdsrpmdsessionkey.values;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            if (i6 < 26) {
                            }
                            if (i6 >= 75) {
                            }
                            throw th;
                        }
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                        break;
                    case -32:
                        i2 = i;
                        getdsrpmdsessionkey.DigitizedCardProfile = IccPrivateKeyCrtComponentsJson;
                        getdsrpmdsessionkey.writeReplace(2);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -31:
                        return;
                    case -30:
                        i5 = 26;
                    case -29:
                        i5 = 1;
                    case -28:
                        i5 = 63;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -27:
                        try {
                            getdsrpmdsessionkey.DigitizedCardProfile = 3;
                            getdsrpmdsessionkey.writeReplace(5);
                            i2 = 10;
                            try {
                                getdsrpmdsessionkey.writeReplace(10);
                                java.lang.Class cls4 = (java.lang.Class) getdsrpmdsessionkey.RecordsJson;
                                getdsrpmdsessionkey.writeReplace(10);
                                java.lang.String str4 = (java.lang.String) getdsrpmdsessionkey.RecordsJson;
                                getdsrpmdsessionkey.writeReplace(10);
                                getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = cls4.getMethod(str4, (java.lang.Class[]) getdsrpmdsessionkey.RecordsJson);
                                getdsrpmdsessionkey.writeReplace(1);
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                if ((i6 < 26 && i6 <= 44) || (i6 >= 44 && i6 <= 53)) {
                                    i6 = 16;
                                } else {
                                    if (i6 >= 75 || i6 > 78) {
                                        throw th;
                                    }
                                    i6 = 73;
                                }
                                getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = th;
                                getdsrpmdsessionkey.writeReplace(38);
                                i5 = i6;
                                i = i2;
                                c2 = 319;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                            }
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            i2 = 10;
                            if (i6 < 26) {
                            }
                            if (i6 >= 75) {
                            }
                            throw th;
                        }
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -26:
                        byte b4 = $$a[2];
                        byte b5 = (byte) (b4 - 1);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        c(b4, b5, b5, objArr14);
                        obj = (java.lang.String) objArr14[0];
                        getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                        i2 = 10;
                        getdsrpmdsessionkey.writeReplace(1);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -25:
                        getdsrpmdsessionkey.DigitizedCardProfile = 1;
                        getdsrpmdsessionkey.writeReplace(5);
                        getdsrpmdsessionkey.writeReplace(10);
                        obj = java.lang.Class.forName((java.lang.String) getdsrpmdsessionkey.RecordsJson);
                        getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                        i2 = 10;
                        getdsrpmdsessionkey.writeReplace(1);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -24:
                        try {
                            byte b6 = $$a[2];
                            byte b7 = (byte) (b6 - 1);
                            byte b8 = b6;
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c(b7, b8, b8, objArr15);
                            obj = (java.lang.String) objArr15[0];
                            getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                            i2 = 10;
                            getdsrpmdsessionkey.writeReplace(1);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            i2 = 10;
                            if (i6 < 26) {
                            }
                            if (i6 >= 75) {
                            }
                            throw th;
                        }
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                        break;
                    case -23:
                        try {
                            getdsrpmdsessionkey.DigitizedCardProfile = 3;
                            getdsrpmdsessionkey.writeReplace(5);
                            getdsrpmdsessionkey.writeReplace(i);
                            java.lang.Object obj2 = getdsrpmdsessionkey.RecordsJson;
                            getdsrpmdsessionkey.writeReplace(i);
                            java.lang.Object obj3 = getdsrpmdsessionkey.RecordsJson;
                            getdsrpmdsessionkey.writeReplace(i);
                            try {
                                java.lang.Object[] objArr16 = {obj3, getdsrpmdsessionkey.RecordsJson};
                                byte[] bArr3 = RecordsJson;
                                short s4 = bArr3[355];
                                byte b9 = bArr3[c2];
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                a(s4, b9, (short) (b9 & 93), objArr17);
                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                short s5 = bArr3[7];
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                a(s5, (byte) (s5 | 56), s5, objArr18);
                                java.lang.String str5 = (java.lang.String) objArr18[0];
                                java.lang.Class<?>[] clsArr = new java.lang.Class[2];
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                a(bArr3[393], bArr3[c2], (short) (bArr3[380] - 1), objArr19);
                                clsArr[0] = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                short s6 = bArr3[373];
                                byte b10 = (byte) (SdkCoreAlternateContactlessPaymentDataImpl | 35);
                                try {
                                    short s7 = bArr3[46];
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    a(s6, b10, s7, objArr20);
                                    clsArr[1] = java.lang.Class.forName((java.lang.String) objArr20[0]);
                                    obj = cls5.getMethod(str5, clsArr).invoke(obj2, objArr16);
                                    getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                                    i2 = 10;
                                    getdsrpmdsessionkey.writeReplace(1);
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                            }
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                            i2 = 10;
                            if (i6 < 26) {
                            }
                            if (i6 >= 75) {
                            }
                            throw th;
                        }
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                        break;
                    case -22:
                        getdsrpmdsessionkey.DigitizedCardProfile = 3;
                        getdsrpmdsessionkey.writeReplace(5);
                        getdsrpmdsessionkey.writeReplace(i);
                        java.lang.Class cls6 = (java.lang.Class) getdsrpmdsessionkey.RecordsJson;
                        getdsrpmdsessionkey.writeReplace(i);
                        java.lang.String str6 = (java.lang.String) getdsrpmdsessionkey.RecordsJson;
                        getdsrpmdsessionkey.writeReplace(i);
                        declaredMethod = cls6.getDeclaredMethod(str6, (java.lang.Class[]) getdsrpmdsessionkey.RecordsJson);
                        getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = declaredMethod;
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(1);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -21:
                        byte[] bArr4 = RecordsJson;
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a(bArr4[393], bArr4[c2], i3, objArr21);
                        declaredMethod = java.lang.Class.forName((java.lang.String) objArr21[0]);
                        getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = declaredMethod;
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(1);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -20:
                        getdsrpmdsessionkey.DigitizedCardProfile = 1;
                        getdsrpmdsessionkey.writeReplace(5);
                        getdsrpmdsessionkey.writeReplace(6);
                        getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = new java.lang.Class[getdsrpmdsessionkey.values];
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(1);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        declaredMethod = "getProfileVersion";
                        getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = declaredMethod;
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(1);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        declaredMethod = com.payair.hce.setLongClickable.class;
                        getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = declaredMethod;
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(1);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -17:
                        getdsrpmdsessionkey.DigitizedCardProfile = 1;
                        getdsrpmdsessionkey.writeReplace(5);
                        getdsrpmdsessionkey.writeReplace(6);
                        int i7 = getdsrpmdsessionkey.values;
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a(r6[393], r6[c2], (short) (RecordsJson[380] - 1), objArr22);
                        declaredMethod = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr22[0]), i7);
                        getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = declaredMethod;
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(1);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -16:
                        getdsrpmdsessionkey.writeReplace(13);
                        throw ((java.lang.Throwable) getdsrpmdsessionkey.RecordsJson);
                    case -15:
                        i5 = 24;
                    case -14:
                        i5 = 22;
                    case -13:
                        try {
                            getdsrpmdsessionkey.writeReplace(12);
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                            i2 = i;
                            if (i6 < 26) {
                            }
                            if (i6 >= 75) {
                            }
                            throw th;
                        }
                        if (getdsrpmdsessionkey.values == 0) {
                            i5 = 21;
                        } else {
                            i2 = i;
                            i5 = i6;
                            i = i2;
                            c2 = 319;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                        }
                        break;
                    case -12:
                        try {
                            getdsrpmdsessionkey.DigitizedCardProfile = 1;
                            getdsrpmdsessionkey.writeReplace(5);
                            getdsrpmdsessionkey.writeReplace(i);
                            java.lang.Object obj4 = getdsrpmdsessionkey.RecordsJson;
                            try {
                                byte[] bArr5 = RecordsJson;
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                a(bArr5[373], bArr5[c2], bArr5[508], objArr23);
                                java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                a(bArr5[13], (short) 59, 50, objArr24);
                                try {
                                    declaredMethod = cls7.getMethod((java.lang.String) objArr24[0], null).invoke(obj4, null);
                                    getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = declaredMethod;
                                    i2 = i;
                                    getdsrpmdsessionkey.writeReplace(1);
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
                        } catch (java.lang.Throwable th13) {
                            th = th13;
                            r9 = 0;
                            i2 = i;
                            if (i6 < 26) {
                            }
                            if (i6 >= 75) {
                            }
                            throw th;
                        }
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                        break;
                    case -11:
                        i5 = 78;
                    case -10:
                        getdsrpmdsessionkey.DigitizedCardProfile = 1;
                        getdsrpmdsessionkey.writeReplace(5);
                        getdsrpmdsessionkey.writeReplace(i);
                        java.lang.Object obj5 = getdsrpmdsessionkey.RecordsJson;
                        try {
                            byte[] bArr6 = RecordsJson;
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            a(bArr6[393], bArr6[c2], i3, objArr25);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                            short s8 = bArr6[7];
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(s8, (byte) (s8 | 56), (short) (-bArr6[374]), objArr26);
                            invoke = cls8.getMethod((java.lang.String) objArr26[0], null).invoke(obj5, null);
                            getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                            i2 = i;
                            getdsrpmdsessionkey.writeReplace(1);
                            i5 = i6;
                            i = i2;
                            c2 = 319;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                        } catch (java.lang.Throwable th14) {
                            java.lang.Throwable cause3 = th14.getCause();
                            if (cause3 == null) {
                                throw th14;
                            }
                            throw cause3;
                        }
                    case -9:
                        getdsrpmdsessionkey.DigitizedCardProfile = 5;
                        getdsrpmdsessionkey.writeReplace(5);
                        getdsrpmdsessionkey.writeReplace(i);
                        java.lang.String str7 = (java.lang.String) getdsrpmdsessionkey.RecordsJson;
                        getdsrpmdsessionkey.writeReplace(i);
                        java.lang.String str8 = (java.lang.String) getdsrpmdsessionkey.RecordsJson;
                        getdsrpmdsessionkey.writeReplace(i);
                        java.lang.String str9 = (java.lang.String) getdsrpmdsessionkey.RecordsJson;
                        getdsrpmdsessionkey.writeReplace(6);
                        int i8 = getdsrpmdsessionkey.values;
                        getdsrpmdsessionkey.writeReplace(6);
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        b(str7, str8, str9, i8, (char) getdsrpmdsessionkey.values, objArr27);
                        invoke = (java.lang.String) objArr27[0];
                        getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(1);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -8:
                        getdsrpmdsessionkey.DigitizedCardProfile = 1;
                        getdsrpmdsessionkey.writeReplace(5);
                        getdsrpmdsessionkey.writeReplace(6);
                        try {
                            java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(getdsrpmdsessionkey.values)};
                            short s9 = RecordsJson[395];
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            a(s9, (byte) (s9 | 33), r0[2], objArr29);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            a(r0[415], (short) 66, 90, objArr30);
                            intValue = ((java.lang.Integer) cls9.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE).invoke(null, objArr28)).intValue();
                            getdsrpmdsessionkey.DigitizedCardProfile = intValue;
                            i2 = i;
                            getdsrpmdsessionkey.writeReplace(2);
                            i5 = i6;
                            i = i2;
                            c2 = 319;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                        } catch (java.lang.Throwable th15) {
                            java.lang.Throwable cause4 = th15.getCause();
                            if (cause4 == null) {
                                throw th15;
                            }
                            throw cause4;
                        }
                    case -7:
                        getdsrpmdsessionkey.DigitizedCardProfile = 38908;
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(2);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -6:
                        try {
                            byte[] bArr7 = RecordsJson;
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            a(bArr7[429], (short) 53, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, objArr31);
                            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr31[0]);
                            short s10 = (short) (bArr7[430] - 1);
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            a(s10, (byte) (s10 | 34), 135, objArr32);
                            intValue = ((java.lang.Integer) cls10.getMethod((java.lang.String) objArr32[0], null).invoke(null, null)).intValue();
                            getdsrpmdsessionkey.DigitizedCardProfile = intValue;
                            i2 = i;
                            getdsrpmdsessionkey.writeReplace(2);
                            i5 = i6;
                            i = i2;
                            c2 = 319;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                        } catch (java.lang.Throwable th16) {
                            java.lang.Throwable cause5 = th16.getCause();
                            if (cause5 == null) {
                                throw th16;
                            }
                            throw cause5;
                        }
                    case -5:
                        getdsrpmdsessionkey.DigitizedCardProfile = 784791685;
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(2);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -4:
                        invoke = "藒웸ﰮ튗";
                        getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(1);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -3:
                        invoke = "ਅ躗㭡";
                        getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(1);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -2:
                        invoke = "\u0000\u0000\u0000\u0000";
                        getdsrpmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = invoke;
                        i2 = i;
                        getdsrpmdsessionkey.writeReplace(1);
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                    case -1:
                        i5 = 53;
                    default:
                        i2 = i;
                        i5 = i6;
                        i = i2;
                        c2 = 319;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
                }
            }
            throw th;
        } catch (java.lang.Throwable th17) {
            java.lang.Throwable cause6 = th17.getCause();
            if (cause6 == null) {
                throw th17;
            }
            throw cause6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = RecordsJson;
        int i4 = 526 - i2;
        int i5 = s + 44;
        byte[] bArr2 = new byte[i + 1];
        if (bArr == null) {
            int i6 = i5;
            i3 = 0;
            i5 = i;
            i5 += i6;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i6 = bArr[i4];
            i5 += i6;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i) {
            }
        } else {
            i3 = 0;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i) {
            }
        }
    }

    static void init$1() {
        $$d = new byte[]{5, -66, -84, -78};
        $$e = 187;
    }

    static void writeReplace() {
        byte[] bArr = new byte[545];
        java.lang.System.arraycopy("(Nnu\u0004û\u0001\u0005ú\u0001\u0006ù\u0001\u0007ø\u0001\b÷\u0001\tö\u0007ù\bø\u0001\nõ\u000bõ\u0001\u000bô\fô\ró\u0001\fó\u0001\u0004ÿü\u0001\u0004\u0000û\u0005\u0000û\u0001\u0004\u0001ú\u0005\u0000û\u0001\u0004\u0002ù\u0001\u0004\u0003ø\u0001\u0004\u0004÷\u0005\u0003ø\u0001\u0004\u0005ö\u0005\u0004÷\u0001\u0004\u0005ö\u0005\u0005ö\u0001\u0004\u0006õ\u0005\u0006õ\u0005\u0007ô\u0005\bó\u0001\u0004\u0007ô\u0001\u0004\bó\u0005\u0005ö\u0001\u0005þü\u0005\u0000û\u000bõ\u0001\u0005ÿû\u0005\bó\u0001\u0005\u0000ú\u0006þü\u0006ÿû\u0001\u0005\u0001ù\u0005\u0004÷\u0001\u0005\u0002ø\u0001\u0005\u0003÷\u0001\u0005\u0004ö\u0006\u0000ú\u0001\u0005\u0005õ\u0006\u0001ù\u0001\u0005\u0001ù\u0005\u0004÷\u0001\u0005\u0006ô\u0006\u0002ø\u0006\u0003÷\u0005\u0004÷\u0001\u0005\u0007ó\u0006\u0002ø\u0006\u0003÷\u0005\u0004÷\u0001\u0006ýü\u0006\u0004ö\u0001\u0006þû\u0001\u0006ÿú\u0006\u0005õ\u0006\u0006ô\u0006\u0003÷\u0001\u0006\u0000ù\u0006\u0007ó\u0006\u0003÷\u0001\u0006\u0001ø\u0001\u0006\u0002÷\u0001\u0006\u0003ö\u0001\u0004\u0005ö\u0006\u0004ö\u0006\u0000ú\u0007þû\u0001\u0006þû\u0001\u0006ÿú\u0007ÿú\u0007\u0000ù\u0006\u0003÷\u0001\u0006\u0000ù\u0007\u0001ø\u0001\u0006\u0004õ\u0001\u0006\u0005ô\u0001\u0006\u0006ó\u0001\u0006\u0006ó\u0001\u0007üü\u0007\u0003ö\u0001\u0007ýû\u0007\u0004õ\u0001\u0007ý÷\u0015ëÍ>õ\rùÇ%!þ÷\u0005ùýüý\u000b÷\u0015ëÍ>õ\rùÇ\u001b%\u0006ñ\u0002þ\rë\u000b\tðê\u0017\u0005\u0006â\u000b\u000b\tð\rö\u000eýúûÊHóü\u0012·(\u0013ü\u0012Ì,ÿø\u0003þ\u000eýï\u0013õ\u0006ÿþ\u000fÙ\u0014\u0017ñ\u0004\bø×.ï\u0016ò\u0005ùÜ\u001e\u0002\u0005ýî\u0016\u0011ë\rö\u000eýúûÊHóü\u0012·\u001d\u001a\u0014Ì1ï\t\u0006\u0001\u0003ûô\u000bý\u0011ëè\u0018\u000fíò!í\u0013ñ\u0005\u0006ñ\rü÷\u0015ëÍ>õ\rùÇ&\u0014\ný\bê\u0001\nùþ\u000fÏ\u001e\u0014þò÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011÷\u0015ëÍ>õ\rùÇDó\u0001\u0006ùþ\u0011º\u001f\u0018\u000fô\u0007õ\u0005\bùüúñ\u001e÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011Ç".getBytes("ISO-8859-1"), 0, bArr, 0, 545);
        RecordsJson = bArr;
        SdkCoreAlternateContactlessPaymentDataImpl = 12;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        writeReplace();
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        writeReplace = 1263759066225628708L;
        valueOf = -804334044;
        AlternateContactlessPaymentDataJson = (char) 43145;
    }

    static void init$0() {
        $$a = new byte[]{8, -42, 1, 71, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, 69, -14, com.google.common.base.Ascii.SI, com.visa.cbp.getEncExpo.kernelVersion, 44, -1, 6, -15, 19, -4, com.visa.cbp.getEncExpo.kernelVersion, 41, -3, -6, 8, -10, 1, 10, -7, -21, com.google.common.base.Ascii.VT, 9, com.visa.cbp.getEncExpo.onUnminimized, -22, com.google.common.base.Ascii.ETB};
        $$b = 17;
    }
}
