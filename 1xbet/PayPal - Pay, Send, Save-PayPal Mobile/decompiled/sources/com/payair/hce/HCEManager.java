package com.payair.hce;

/* loaded from: classes4.dex */
public class HCEManager {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int[] DigitizedCardProfile;
    private static int valueOf;
    private static int values;
    private static char writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = i + 4;
        int i6 = 119 - i2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[42 - b];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 = i5;
            i5 = (i5 + i7) - 2;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == 41 - b) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i4];
            i5 = (i5 + i7) - 2;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == 41 - b) {
            }
        } else {
            i3 = 0;
            i4 = i5;
            i5 = i6;
            bArr2[i3] = (byte) i5;
            if (i3 == 41 - b) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = b + 65;
        int i4 = i + 5;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[66 - s];
        int i5 = 65 - s;
        if (bArr == null) {
            int i6 = i5;
            i3 = i4;
            i2 = 0;
            i4++;
            i3 = (i3 + i6) - 6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i2++;
            i4++;
            i3 = (i3 + i6) - 6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i2 + 65;
        int i5 = s * 2;
        int i6 = 3 - (i * 4);
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            int i10 = i6 + i7;
            i3 = i9;
            int i11 = i8;
            i4 = i10;
            i6 = i11;
            int i12 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = i4;
            i8 = i12;
            i6 = bArr[i12];
            i9 = i3 + 1;
            i7 = i13;
            int i102 = i6 + i7;
            i3 = i9;
            int i112 = i8;
            i4 = i102;
            i6 = i112;
            int i122 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            int i1222 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    private HCEManager() {
    }

    public static boolean isLocallyVerified() {
        int i = values & 35;
        valueOf = (((((r0 ^ 35) | i) << 1) - (~(-((r0 | 35) & (~i))))) - 1) % 128;
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1438091063, 1438091080, (int) java.lang.System.currentTimeMillis())).booleanValue();
        int i2 = values;
        int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return booleanValue;
        }
        throw null;
    }

    public static void replenishToken(byte[] bArr) {
        values = (valueOf + 69) % 128;
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{bArr}, 593682826, -593682746, (int) java.lang.System.currentTimeMillis());
        int i = values;
        int i2 = ((i | 31) << 1) - (i ^ 31);
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static boolean activateCardForToken(byte[] bArr, android.content.Context context) {
        int i = valueOf;
        int i2 = (i & 47) + (i | 47);
        values = i2 % 128;
        java.lang.Object[] objArr = {bArr, context};
        if (i2 % 2 != 0) {
            return ((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(objArr, -57741215, 57741286, (int) java.lang.System.currentTimeMillis())).booleanValue();
        }
        throw null;
    }

    public static boolean activateVisaCardForToken(byte[] bArr, android.content.Context context) {
        valueOf = (values + 109) % 128;
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{bArr, context}, -1388377929, 1388377995, (int) java.lang.System.currentTimeMillis())).booleanValue();
        int i = values;
        int i2 = i & 85;
        int i3 = (i | 85) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            return booleanValue;
        }
        throw null;
    }

    public static java.lang.String getTokenPan(byte[] bArr) {
        int i = values;
        int i2 = i & 73;
        int i3 = (i ^ 73) | i2;
        valueOf = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        java.lang.String str = (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{bArr}, 1890291188, -1890291187, (int) java.lang.System.currentTimeMillis());
        valueOf = (values + 55) % 128;
        return str;
    }

    public static boolean suspendCardForToken(byte[] bArr, android.content.Context context) {
        int i = values;
        int i2 = i & 77;
        int i3 = ((i ^ 77) | i2) << 1;
        int i4 = -((i | 77) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        valueOf = i5 % 128;
        java.lang.Object[] objArr = {bArr, context};
        if (i5 % 2 != 0) {
            throw null;
        }
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(objArr, -471406465, 471406484, (int) java.lang.System.currentTimeMillis())).booleanValue();
        int i6 = values;
        int i7 = (i6 ^ 26) + ((i6 & 26) << 1);
        int i8 = (~i7) + (i7 << 1);
        valueOf = i8 % 128;
        if (i8 % 2 == 0) {
            return booleanValue;
        }
        throw new java.lang.ArithmeticException();
    }

    public static boolean replenishAllCards() {
        int i = values;
        int i2 = i & 87;
        int i3 = (i | 87) & (~i2);
        int i4 = i2 << 1;
        valueOf = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        boolean replenishAllCards = replenishAllCards((java.util.ArrayList) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 587851495, -587851469, (int) java.lang.System.currentTimeMillis()));
        valueOf = (values + 45) % 128;
        return replenishAllCards;
    }

    public static boolean replenishAllCards(java.util.List<com.payair.hce.setSystemGestureExclusionRects> list) {
        int i = valueOf & 5;
        values = (((((r0 ^ 5) | i) << 1) - (~(-((r0 | 5) & (~i))))) - 1) % 128;
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{list}, -869455681, 869455726, (int) java.lang.System.currentTimeMillis())).booleanValue();
        valueOf = (values + 47) % 128;
        return booleanValue;
    }

    public static java.lang.String getUrl() {
        int i = valueOf;
        int i2 = i & 21;
        int i3 = -(-((i ^ 21) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = (java.lang.String) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[0], 896454030, -896454018, (int) java.lang.System.currentTimeMillis());
        int i5 = values;
        valueOf = ((i5 & 5) + (i5 | 5)) % 128;
        return str;
    }

    public static java.lang.String getAppVersion() {
        int i = values;
        int i2 = i ^ 97;
        int i3 = -(-((i & 97) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        valueOf = i4 % 128;
        java.lang.Object[] objArr = new java.lang.Object[0];
        int i5 = i4 % 2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i5 == 0) {
            return (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(objArr, -722536750, 722536792, (int) currentTimeMillis);
        }
        throw null;
    }

    public static boolean checkDeviceUnlockKeys() {
        int i = valueOf;
        int i2 = ((i & 84) + (i | 84)) - 1;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1026483474, 1026483510, (int) java.lang.System.currentTimeMillis())).booleanValue();
        int i3 = valueOf;
        int i4 = i3 | 121;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 121)) & i4);
        int i7 = (i5 & i6) + (i6 | i5);
        values = i7 % 128;
        if (i7 % 2 != 0) {
            return booleanValue;
        }
        throw null;
    }

    public static void clearHCEData() {
        int i = valueOf;
        int i2 = (i & (-8)) | ((~i) & 7);
        int i3 = (i & 7) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 314972855, -314972806, (int) java.lang.System.currentTimeMillis());
            int i5 = values;
            valueOf = (((i5 | 119) << 1) - (i5 ^ 119)) % 128;
            return;
        }
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 314972855, -314972806, (int) java.lang.System.currentTimeMillis());
        throw new java.lang.ArithmeticException();
    }

    public static void clearInternalStorage() {
        int i = valueOf;
        values = ((i ^ 95) + ((i & 95) << 1)) % 128;
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 2081139498, -2081139472, (int) java.lang.System.currentTimeMillis());
        int i2 = values;
        int i3 = i2 & 87;
        int i4 = -(-((i2 ^ 87) | i3));
        valueOf = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
    }

    public static void resetAuthenticationReferences() {
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = ~currentTimeMillis;
        int i2 = i & (-1550378843);
        int i3 = ((-1550378843) | i) & (~i2);
        int i4 = ~((i3 ^ i2) | (i3 & i2));
        int i5 = i4 ^ 1145045058;
        int i6 = i4 & 1145045058;
        int i7 = (i6 ^ i5) | (i6 & i5);
        int i8 = i & 977071932;
        int i9 = (i | 977071932) & (~i8);
        int i10 = (i9 ^ i8) | (i9 & i8);
        int i11 = ~i10;
        int i12 = (i10 | i11) & i11;
        int i13 = (i7 ^ i12) | (i7 & i12);
        int i14 = currentTimeMillis & (-571738149);
        int i15 = ((-571738149) | currentTimeMillis) & (~i14);
        int i16 = ~((i15 ^ i14) | (i15 & i14));
        int i17 = ((~i16) & i13) | ((~i13) & i16);
        int i18 = i13 & i16;
        int i19 = -(-(((i18 ^ i17) | (i18 & i17)) * (-84)));
        int i20 = ((i19 ^ 1486447009) | (i19 & 1486447009)) << 1;
        int i21 = -(((~i19) & 1486447009) | ((-1486447010) & i19));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        int i23 = ~((currentTimeMillis & (-977071933)) | i8 | (currentTimeMillis & 977071932));
        int i24 = (i23 ^ 1550378842) | (i23 & 1550378842);
        int i25 = i ^ (-977071933);
        int i26 = i & (-977071933);
        int i27 = ~((i25 & i26) | (i25 ^ i26));
        int i28 = i24 & i27;
        int i29 = (i24 | i27) & (~i28);
        int i30 = -(-(((i29 ^ i28) | (i29 & i28)) * (-84)));
        int i31 = i22 | i30;
        int i32 = i31 << 1;
        int i33 = -((~(i30 & i22)) & i31);
        int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
        int i35 = ~(i25 | i26);
        int i36 = ((i35 ^ 571738148) | (i35 & 571738148)) * 84;
        int i37 = i34 ^ i36;
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i38 = ~currentTimeMillis2;
        int i39 = ~((i38 ^ 1720335510) | (i38 & 1720335510));
        int i40 = i39 & 409305896;
        int i41 = (i39 | 409305896) & (~i40);
        int i42 = (((i41 ^ i40) | (i41 & i40)) * (-245)) - 1549008974;
        int i43 = -(-((~((currentTimeMillis2 ^ 1720335510) | (currentTimeMillis2 & 1720335510))) * (-245)));
        int i44 = i42 & i43;
        int i45 = ((i42 | i43) & (~i44)) + (i44 << 1);
        int i46 = currentTimeMillis2 | 1720335510;
        int i47 = ~i46;
        int i48 = (i46 | i47) & i47;
        int i49 = ((~i48) & (-988790575)) | (988790574 & i48);
        int i50 = i48 & (-988790575);
        int i51 = ((i50 ^ i49) | (i50 & i49)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE;
        int i52 = i45 & i51;
        if ((((i36 & i34) | i37) << 1) - i37 <= i52 + ((i51 ^ i45) | i52)) {
            com.payair.hce.setDrawingCacheEnabled.values(new java.lang.Object[0], -1133094326, 1133094331, (int) java.lang.System.currentTimeMillis());
            int i53 = values;
            int i54 = i53 ^ 33;
            int i55 = ((i53 & 33) | i54) << 1;
            int i56 = -i54;
            valueOf = (((i55 | i56) << 1) - (i55 ^ i56)) % 128;
            return;
        }
        com.payair.hce.setDrawingCacheEnabled.values(new java.lang.Object[0], -1133094326, 1133094331, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    public static void createMCBP() {
        valueOf = (values + 65) % 128;
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 509371493, -509371414, (int) java.lang.System.currentTimeMillis());
        int i = valueOf + 13;
        values = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        int i3 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = DigitizedCardProfile;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 81;
                $11 = i7 % 128;
                if (i7 % i3 == 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i4];
                        objArr2[0] = java.lang.Integer.valueOf(iArr3[i6]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.getOffsetBefore("", 0) + 29, (char) android.view.Gravity.getAbsoluteGravity(0, 0))).getMethod("z", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                        }
                        iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr3[i6])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 27, (android.os.Process.myPid() >> 22) + 29, (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                    }
                    iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                    i6++;
                }
                i3 = 2;
                i4 = 1;
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = DigitizedCardProfile;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                $10 = ($11 + 65) % 128;
                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(iArr6[i8])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj3 == null) {
                    iArr2 = iArr6;
                    i2 = length3;
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 27, 29 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                } else {
                    iArr2 = iArr6;
                    i2 = length3;
                }
                iArr7[i8] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                i8++;
                iArr6 = iArr2;
                length3 = i2;
                i5 = 0;
            }
            iArr6 = iArr7;
        }
        int i9 = i5;
        java.lang.System.arraycopy(iArr6, i9, iArr5, i9, length2);
        istransitsupported.valueOf = i9;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[i9] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i10];
                java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31, 5088 - (android.os.Process.myPid() >> 22), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i10++;
                $10 = ($11 + 25) % 128;
            }
            int i12 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i12;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i13 = istransitsupported.DigitizedCardProfile;
            int i14 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 49, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2923, (char) (android.view.View.combineMeasuredStates(0, 0) + 3037));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                e((short) 0, 0, 1, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
            i9 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public static void clearAllWalletAppData() {
        int i = values;
        int i2 = ((i & 32) + (i | 32)) - 1;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -142205556, 142205628, (int) java.lang.System.currentTimeMillis());
        } else {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -142205556, 142205628, (int) java.lang.System.currentTimeMillis());
            throw new java.lang.ArithmeticException();
        }
    }

    public static com.payair.hce.communication.JsonResponse unRegisterDevice() {
        int i = values + 3;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return (com.payair.hce.communication.JsonResponse) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -334465408, 334465446, (int) java.lang.System.currentTimeMillis());
        }
        throw new java.lang.ArithmeticException();
    }

    public static java.util.ArrayList<java.lang.String> getMDESCardsUniqueTokenReferences() {
        int i = values;
        int i2 = i & 17;
        int i3 = (i | 17) & (~i2);
        int i4 = -(-(i2 << 1));
        valueOf = ((i3 & i4) + (i3 | i4)) % 128;
        java.util.ArrayList<java.lang.String> arrayList = (java.util.ArrayList) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -543923078, 543923161, (int) java.lang.System.currentTimeMillis());
        int i5 = values;
        int i6 = i5 & 59;
        int i7 = (i5 | 59) & (~i6);
        int i8 = i6 << 1;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        valueOf = i9 % 128;
        if (i9 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public static byte[] getDefaultCardForContactlessPayments() {
        int i = values;
        int i2 = (((i & (-74)) | ((~i) & 73)) - (~(-(-((i & 73) << 1))))) - 1;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return (byte[]) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1995726912, 1995726986, (int) java.lang.System.currentTimeMillis());
        }
        throw null;
    }

    public static void setNewDefaultCardForContactlessPayments(byte[] bArr) {
        int i = valueOf;
        int i2 = (i | 89) << 1;
        int i3 = -((i & (-90)) | ((~i) & 89));
        values = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{bArr}, 1159278324, -1159278319, (int) java.lang.System.currentTimeMillis());
        int i4 = valueOf + 75;
        values = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static byte[] getSelectedCard() {
        int i = valueOf;
        int i2 = i & 43;
        int i3 = (i | 43) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        values = i5 % 128;
        java.lang.Object[] objArr = new java.lang.Object[0];
        int i6 = i5 % 2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i6 != 0) {
            return (byte[]) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(objArr, 1260569594, -1260569524, (int) currentTimeMillis);
        }
        throw null;
    }

    public static void setSelectedCard(byte[] bArr) {
        int i = values;
        int i2 = (i & 91) + (i | 91);
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{bArr}, 1870113701, -1870113672, (int) java.lang.System.currentTimeMillis());
        } else {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{bArr}, 1870113701, -1870113672, (int) java.lang.System.currentTimeMillis());
            throw null;
        }
    }

    public static int getNumberOfTransactionLogEntries(byte[] bArr) {
        int i = valueOf + 53;
        values = i % 128;
        java.lang.Object[] objArr = {bArr};
        int i2 = i % 2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i2 == 0) {
            throw null;
        }
        int intValue = ((java.lang.Integer) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(objArr, 109670903, -109670871, (int) currentTimeMillis)).intValue();
        int i3 = values;
        int i4 = (i3 ^ 69) + ((i3 & 69) << 1);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return intValue;
        }
        throw null;
    }

    public static void removeCard(byte[] bArr, android.content.Context context) {
        int i = valueOf;
        int i2 = (((i | 60) << 1) - (i ^ 60)) - 1;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{bArr, context}, 1017622299, -1017622251, (int) java.lang.System.currentTimeMillis());
            int i3 = values;
            int i4 = ((i3 ^ 7) | (i3 & 7)) << 1;
            int i5 = -((i3 & (-8)) | ((~i3) & 7));
            valueOf = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
            return;
        }
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{bArr, context}, 1017622299, -1017622251, (int) java.lang.System.currentTimeMillis());
        throw new java.lang.ArithmeticException();
    }

    public static void startDeviceAuthenticationForRegistration(com.payair.hce.DeviceAuthenticationDialogListener deviceAuthenticationDialogListener, androidx.fragment.app.FragmentActivity fragmentActivity) {
        int i = valueOf;
        int i2 = i & 7;
        int i3 = (i2 - (~((i ^ 7) | i2))) - 1;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{deviceAuthenticationDialogListener, fragmentActivity}, 1169268083, -1169268065, (int) java.lang.System.currentTimeMillis());
        } else {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{deviceAuthenticationDialogListener, fragmentActivity}, 1169268083, -1169268065, (int) java.lang.System.currentTimeMillis());
            throw new java.lang.ArithmeticException();
        }
    }

    public static void startDeviceAuthenticationForPurchase(com.payair.hce.DeviceAuthenticationDialogListener deviceAuthenticationDialogListener, androidx.fragment.app.FragmentActivity fragmentActivity) {
        int i = valueOf;
        int i2 = ((i ^ 20) + ((i & 20) << 1)) - 1;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{deviceAuthenticationDialogListener, fragmentActivity}, -1222433199, 1222433277, (int) java.lang.System.currentTimeMillis());
            int i3 = valueOf;
            int i4 = (i3 ^ 1) + ((i3 & 1) << 1);
            values = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{deviceAuthenticationDialogListener, fragmentActivity}, -1222433199, 1222433277, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    public static int getNumberOfAvailableCredentialsForToken(byte[] bArr) {
        int i = values;
        int i2 = i & 65;
        int i3 = -(-((i ^ 65) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        valueOf = i4 % 128;
        java.lang.Object[] objArr = {bArr};
        if (i4 % 2 != 0) {
            throw null;
        }
        int intValue = ((java.lang.Integer) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(objArr, -1647464928, 1647464932, (int) java.lang.System.currentTimeMillis())).intValue();
        int i5 = values;
        int i6 = (i5 & (-108)) | ((~i5) & 107);
        int i7 = (i5 & 107) << 1;
        valueOf = ((i6 & i7) + (i7 | i6)) % 128;
        return intValue;
    }

    public static void removeCardManagerListener(long j) {
        int i = valueOf + 34;
        int i2 = (~i) + (i << 1);
        values = i2 % 128;
        if (i2 % 2 != 0) {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Long.valueOf(j)}, -1005521230, 1005521261, (int) java.lang.System.currentTimeMillis());
            int i3 = values;
            int i4 = ((i3 ^ 67) | (i3 & 67)) << 1;
            int i5 = -((i3 & (-68)) | ((~i3) & 67));
            valueOf = ((i4 & i5) + (i5 | i4)) % 128;
            return;
        }
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Long.valueOf(j)}, -1005521230, 1005521261, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    public static void stopTransaction() {
        int i = valueOf;
        int i2 = i & 33;
        int i3 = i | 33;
        values = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -854851703, 854851744, (int) java.lang.System.currentTimeMillis());
        int i4 = values & 69;
        valueOf = ((i4 - (~(-(-((r0 ^ 69) | i4))))) - 1) % 128;
    }

    private static void d(java.lang.String str, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = AlternateContactlessPaymentDataJson;
        long j = 0;
        int i4 = 1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.Gravity.getAbsoluteGravity(0, 0) + 2508, (char) (6803 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        e((short) 0, 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(writeReplace)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 50, android.text.TextUtils.indexOf("", "") + 2508, (char) (6802 - android.text.TextUtils.getTrimmedLength("")));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            e((short) 0, 0, 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
            $11 = ($10 + 21) % 128;
        } else {
            i2 = i;
        }
        char c = 2;
        if (i2 > 1) {
            $10 = ($11 + 17) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                $11 = ($10 + i4) % 128;
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + i4];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + i4] = (char) (digitizedCardJson12.writeReplace - b);
                    i3 = i4;
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
                    objArr6[i4] = digitizedCardJson12;
                    objArr6[0] = digitizedCardJson12;
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 28, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 3596, (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 2665 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 18890));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            e((short) 0, 0, 8, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i6 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i7 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i6 * charValue) + i7];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i8 = digitizedCardJson12.DigitizedCardProfile;
                        int i9 = digitizedCardJson12.RecordsJson;
                        int i10 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i11 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[(i8 * charValue) + i9];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i10 * charValue) + i11];
                    } else {
                        int i12 = digitizedCardJson12.DigitizedCardProfile;
                        int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i14 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i15 = digitizedCardJson12.RecordsJson;
                        cArr3[digitizedCardJson12.values] = cArr[(i12 * charValue) + i13];
                        i3 = 1;
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i14 * charValue) + i15];
                    }
                    i3 = 1;
                }
                digitizedCardJson12.values += 2;
                i4 = i3;
                j = 0;
                c = 2;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            int i17 = $11 + 101;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                cArr3[i16] = (char) (cArr3[i16] ^ 8696);
                i16 += 28;
            } else {
                cArr3[i16] = (char) (cArr3[i16] ^ 13722);
                i16++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0f91  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x1118  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x11da  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0fc3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0d48  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0c2d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0e6b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x11ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x127b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void handleMDESPushPayload(com.google.firebase.messaging.RemoteMessage remoteMessage, android.content.Context context) {
        java.lang.Object[] AlternateContactlessPaymentDataJson$466995e3;
        int i;
        int i2;
        long j;
        java.lang.Object[] objArr;
        int i3;
        int i4;
        long j2;
        android.content.Context context2;
        java.lang.String str;
        java.lang.Integer num;
        java.lang.String str2;
        byte[] bArr;
        java.lang.String str3;
        java.lang.Object[] objArr2;
        char c;
        int i5;
        java.lang.String str4;
        long j3;
        android.content.Context context3;
        java.lang.String str5;
        android.content.Context context4;
        java.lang.Object[] objArr3;
        java.lang.CharSequence charSequence;
        int i6;
        int i7 = values;
        valueOf = ((((i7 ^ 27) | (i7 & 27)) << 1) - ((i7 & (-28)) | ((~i7) & 27))) % 128;
        int i8 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i9 = ((i8 ^ 22) | (i8 & 22)) << 1;
        int i10 = -(((~i8) & 22) | (i8 & (-23)));
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{219609268, 1803870193, -1595768926, 23637909, -1525020423, -752667267, -2070146318, -550576111, 215064525, -2035023633, -1714446589, -813852397}, ((i9 | i10) << 1) - (i10 ^ i9), objArr4);
        java.lang.String str6 = (java.lang.String) objArr4[0];
        int resolveSize = android.view.View.resolveSize(0, 0);
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i11 = resolveSize * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION;
        int i12 = (i11 & (-13545)) + (i11 | (-13545));
        int i13 = ~resolveSize;
        int i14 = (i13 | resolveSize) & i13;
        int i15 = (i14 ^ currentTimeMillis) | (i14 & currentTimeMillis);
        int i16 = ~i15;
        int i17 = (i15 | i16) & i16;
        int i18 = ~currentTimeMillis;
        int i19 = (i18 | currentTimeMillis) & i18;
        int i20 = i19 & 15;
        int i21 = ~(((i19 | 15) & (~i20)) | i20);
        int i22 = ((~i21) & i17) | ((~i17) & i21);
        int i23 = i17 & i21;
        int i24 = -(~(((i23 ^ i22) | (i23 & i22)) * (-1808)));
        int i25 = ((i12 ^ i24) + ((i12 & i24) << 1)) - 1;
        int i26 = ~i13;
        int i27 = i13 & 15;
        int i28 = (i26 & (-16)) | i27;
        int i29 = i13 & (-16);
        int i30 = (i28 ^ i29) | (i28 & i29);
        int i31 = i30 & currentTimeMillis;
        int i32 = (i30 | currentTimeMillis) & (~i31);
        int i33 = ~((i32 ^ i31) | (i32 & i31));
        int i34 = i18 ^ resolveSize;
        int i35 = resolveSize & i18;
        int i36 = (i34 & i35) | (i34 ^ i35);
        int i37 = i36 ^ 15;
        int i38 = i36 & 15;
        int i39 = ~((i38 & i37) | (i37 ^ i38));
        int i40 = i33 & i39;
        int i41 = (i33 | i39) & (~i40);
        int i42 = ((i40 ^ i41) | (i41 & i40)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN;
        int i43 = (i25 ^ i42) + ((i42 & i25) << 1);
        int i44 = (i26 & 15) | i29;
        int i45 = (i44 ^ i27) | (i27 & i44);
        int i46 = ~i45;
        int i47 = (i45 | i46) & i46;
        int i48 = (i18 & (-16)) | (currentTimeMillis & 15);
        int i49 = currentTimeMillis & (-16);
        int i50 = (i49 ^ i48) | (i49 & i48);
        int i51 = ~i50;
        int i52 = (i50 | i51) & i51;
        int i53 = i47 & i52;
        int i54 = ((i47 | i52) & (~i53)) | i53;
        int i55 = ~(i35 | i34);
        int i56 = i54 & i55;
        int i57 = (i54 | i55) & (~i56);
        int i58 = ((i57 ^ i56) | (i57 & i56)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN;
        int i59 = i43 & i58;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(new int[]{927225990, -355879322, 1171081820, -822419396, -1318763473, -1925790590, 1289723848, 2030003069}, i59 + ((i58 ^ i43) | i59), objArr5);
        java.lang.String str7 = (java.lang.String) objArr5[0];
        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 922, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
        byte[] bArr2 = $$a;
        byte b = (byte) (-bArr2[99]);
        byte b2 = bArr2[5];
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b(b, b2, (byte) (b2 | org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE), objArr6);
        long j4 = cls.getField((java.lang.String) objArr6[0]).getLong(null);
        try {
            try {
                try {
                    try {
                        try {
                            if (j4 != -1) {
                                int i60 = valueOf;
                                int i61 = i60 & 49;
                                values = (((i60 | 49) & (~i61)) + (i61 << 1)) % 128;
                                if (j4 + coil3.svg.internal.UtilsKt.SVG_SIZE_BYTES >= ((java.lang.Long) java.lang.Class.forName(str6).getDeclaredMethod(str7, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                    int i62 = valueOf;
                                    int i63 = i62 & 43;
                                    values = ((((i62 | 43) & (~i63)) - (~(i63 << 1))) - 1) % 128;
                                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 923, (char) android.text.TextUtils.getOffsetAfter("", 0));
                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                    b(bArr2[17], bArr2[9], bArr2[11], objArr7);
                                    java.lang.Object[] objArr8 = {cls2.getField((java.lang.String) objArr7[0]).get(null), 562270524, 0};
                                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                    if (obj == null) {
                                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.text.TextUtils.getOffsetBefore("", 0), android.view.MotionEvent.axisFromString("") + 4861, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj);
                                    }
                                    AlternateContactlessPaymentDataJson$466995e3 = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr8);
                                    int i64 = valueOf;
                                    int i65 = i64 & 35;
                                    values = ((i65 - (~(-(-((i64 ^ 35) | i65))))) - 1) % 128;
                                    i = ((int[]) AlternateContactlessPaymentDataJson$466995e3[1])[0];
                                    i2 = ((int[]) AlternateContactlessPaymentDataJson$466995e3[0])[0];
                                    if (i2 != i) {
                                        int i66 = values;
                                        valueOf = ((((i66 | 30) << 1) - (i66 ^ 30)) - 1) % 128;
                                        java.lang.Object[] objArr9 = {AlternateContactlessPaymentDataJson$466995e3, java.lang.Integer.valueOf(((int[]) AlternateContactlessPaymentDataJson$466995e3[3])[0]), 0};
                                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                        if (obj2 == null) {
                                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 4861 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.view.View.resolveSize(0, 0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj2);
                                        }
                                        ((java.lang.reflect.Method) obj2).invoke(null, objArr9);
                                        int i67 = valueOf;
                                        values = (((i67 | 71) << 1) - (i67 ^ 71)) % 128;
                                    } else {
                                        new java.util.ArrayList().add((java.lang.String) AlternateContactlessPaymentDataJson$466995e3[2]);
                                        int i68 = i & i2;
                                        long j5 = ((i ^ i2) | i68) & (~i68);
                                        int i69 = valueOf;
                                        int i70 = i69 & 21;
                                        int i71 = -(-((i69 ^ 21) | i70));
                                        values = (((i70 | i71) << 1) - (i71 ^ i70)) % 128;
                                        try {
                                            java.lang.Object[] objArr10 = {java.lang.Long.valueOf(j5 ^ 9107282270594531328L), 2120454395L};
                                            byte[] bArr3 = $$d;
                                            byte b3 = (byte) (-bArr3[83]);
                                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                                            c(b3, bArr3[0], b3, objArr11);
                                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                            byte b4 = bArr3[4];
                                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                                            c(b4, (short) (bArr3[10] + 1), b4, objArr12);
                                            cls3.getMethod((java.lang.String) objArr12[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr10);
                                            java.lang.Object[] objArr13 = {AlternateContactlessPaymentDataJson$466995e3, java.lang.Integer.valueOf(((int[]) AlternateContactlessPaymentDataJson$466995e3[3])[0]), 0};
                                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                            if (obj3 == null) {
                                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.graphics.ImageFormat.getBitsPerPixel(0), 4860 - android.graphics.Color.red(0), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj3);
                                            }
                                            ((java.lang.reflect.Method) obj3).invoke(null, objArr13);
                                            int i72 = values;
                                            int i73 = i72 & 23;
                                            valueOf = (((i72 | 23) & (~i73)) + (i73 << 1)) % 128;
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    }
                                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 50, android.view.View.combineMeasuredStates(0, 0) + 584, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24291));
                                    byte b5 = (byte) (-bArr2[19]);
                                    byte b6 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b(b5, b6, 54, objArr14);
                                    j = cls4.getField((java.lang.String) objArr14[0]).getLong(null);
                                    if (j != -1) {
                                        int i74 = values;
                                        int i75 = (i74 & 72) + (i74 | 72);
                                        valueOf = ((~i75) + (i75 << 1)) % 128;
                                        if (j + 1972 >= ((java.lang.Long) java.lang.Class.forName(str6).getDeclaredMethod(str7, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                            int i76 = values;
                                            valueOf = ((i76 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i76 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
                                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 584 - android.text.TextUtils.getOffsetBefore("", 0), (char) (24291 - android.view.Gravity.getAbsoluteGravity(0, 0)));
                                            byte b7 = bArr2[5];
                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                            b(b7, (byte) (b7 | 58), bArr2[17], objArr15);
                                            java.lang.Object[] objArr16 = {cls5.getField((java.lang.String) objArr15[0]).get(null), -46521309, 0};
                                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                            if (obj4 == null) {
                                                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 31, android.text.TextUtils.indexOf("", "") + 4830, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj4);
                                            }
                                            objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj4).invoke(null, objArr16);
                                            i3 = ((int[]) objArr[1])[0];
                                            i4 = ((int[]) objArr[0])[0];
                                            if (i4 == i3) {
                                                values = (valueOf + 33) % 128;
                                                java.lang.Object[] objArr17 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[3])[0]), 0};
                                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                if (obj5 == null) {
                                                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 30, 4830 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.graphics.Color.green(0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj5);
                                                }
                                                ((java.lang.reflect.Method) obj5).invoke(null, objArr17);
                                                int i77 = valueOf;
                                                values = (((i77 ^ 17) - (~((i77 & 17) << 1))) - 1) % 128;
                                            } else {
                                                new java.util.ArrayList().add((java.lang.String) objArr[2]);
                                                int i78 = (~i4) & i3;
                                                int i79 = (~i3) & i4;
                                                java.lang.Object[] objArr18 = {java.lang.Long.valueOf(((i79 ^ i78) | (i79 & i78)) ^ 2284489728898105344L), 531899230L};
                                                byte[] bArr4 = $$d;
                                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                c(bArr4[41], 112, (byte) (-bArr4[83]), objArr19);
                                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                c((byte) (bArr4[234] - 1), 152, bArr4[30], objArr20);
                                                cls6.getMethod((java.lang.String) objArr20[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr18);
                                                java.lang.Object[] objArr21 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[3])[0]), 0};
                                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                if (obj6 == null) {
                                                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.view.View.resolveSize(0, 0), 4830 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj6);
                                                }
                                                ((java.lang.reflect.Method) obj6).invoke(null, objArr21);
                                                values = (valueOf + 69) % 128;
                                            }
                                            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{remoteMessage, context}, -309498623, 309498636, (int) java.lang.System.currentTimeMillis());
                                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 51, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 584, (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 24291));
                                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                                            b((byte) (bArr2[17] - 1), bArr2[1], bArr2[11], objArr22);
                                            j2 = cls7.getField((java.lang.String) objArr22[0]).getLong(null);
                                            if (j2 != -1) {
                                                int i80 = valueOf;
                                                int i81 = ((i80 ^ 3) | (i80 & 3)) << 1;
                                                int i82 = -((i80 & (-4)) | ((~i80) & 3));
                                                values = (((i81 | i82) << 1) - (i82 ^ i81)) % 128;
                                                if (j2 + 1869 >= ((java.lang.Long) java.lang.Class.forName(str6).getDeclaredMethod(str7, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                    int i83 = valueOf;
                                                    int i84 = i83 ^ 57;
                                                    values = ((((i83 & 57) | i84) << 1) - i84) % 128;
                                                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 51, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 583, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 24291));
                                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                    b((byte) (bArr2[55] - 1), 105, bArr2[5], objArr23);
                                                    java.lang.Object[] objArr24 = {cls8.getField((java.lang.String) objArr23[0]).get(null), 314494135, 0};
                                                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                    if (obj7 == null) {
                                                        obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 4830, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj7);
                                                    }
                                                    objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) obj7).invoke(null, objArr24);
                                                    int i85 = valueOf;
                                                    int i86 = i85 ^ 85;
                                                    int i87 = ((i85 & 85) | i86) << 1;
                                                    int i88 = -i86;
                                                    values = ((i87 ^ i88) + ((i87 & i88) << 1)) % 128;
                                                    str2 = str6;
                                                    c = 1;
                                                    num = 0;
                                                    bArr = bArr2;
                                                    str = "valueOf";
                                                    str3 = str7;
                                                    i5 = ((int[]) objArr2[c])[0];
                                                    if (((int[]) objArr2[0])[0] != i5) {
                                                        int i89 = valueOf;
                                                        int i90 = i89 & 109;
                                                        int i91 = (i90 - (~((i89 ^ 109) | i90))) - 1;
                                                        values = i91 % 128;
                                                        if (i91 % 2 == 0) {
                                                            java.lang.Object[] objArr25 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[2])[1]), num};
                                                            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                            if (obj8 == null) {
                                                                str4 = str;
                                                                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.KeyEvent.keyCodeFromString("") + 4830, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod(str4, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj8);
                                                            } else {
                                                                str4 = str;
                                                            }
                                                            ((java.lang.reflect.Method) obj8).invoke(null, objArr25);
                                                        } else {
                                                            str4 = str;
                                                            java.lang.Object[] objArr26 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[3])[0]), num};
                                                            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                            if (obj9 == null) {
                                                                obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.widget.ExpandableListView.getPackedPositionChild(0L), 4830 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-1) - android.view.MotionEvent.axisFromString("")))).getMethod(str4, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj9);
                                                            }
                                                            ((java.lang.reflect.Method) obj9).invoke(null, objArr26);
                                                        }
                                                        int i92 = valueOf;
                                                        int i93 = ((i92 ^ 89) | (i92 & 89)) << 1;
                                                        int i94 = -((i92 & (-90)) | ((~i92) & 89));
                                                        values = ((i93 ^ i94) + ((i94 & i93) << 1)) % 128;
                                                    } else {
                                                        str4 = str;
                                                        java.lang.Object[] objArr27 = {java.lang.Long.valueOf((((~i5) & r4) | (i5 & (~r4))) ^ 1361756519779008512L), 317058643L};
                                                        byte[] bArr5 = $$d;
                                                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                        c(bArr5[41], 112, (byte) (-bArr5[83]), objArr28);
                                                        java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                                                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                        c((byte) (bArr5[234] - 1), 152, bArr5[30], objArr29);
                                                        cls9.getMethod((java.lang.String) objArr29[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr27);
                                                        java.lang.Object[] objArr30 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[3])[0]), num};
                                                        java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                        if (obj10 == null) {
                                                            obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 30, android.view.KeyEvent.getDeadChar(0, 0) + 4830, (char) android.view.View.combineMeasuredStates(0, 0))).getMethod(str4, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj10);
                                                        }
                                                        ((java.lang.reflect.Method) obj10).invoke(null, objArr30);
                                                        int i95 = values;
                                                        valueOf = ((i95 ^ 1) + ((i95 & 1) << 1)) % 128;
                                                    }
                                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 584, (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 24291));
                                                    byte b8 = (byte) (-bArr[99]);
                                                    byte b9 = bArr[5];
                                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                    b(b8, b9, (byte) (b9 | org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE), objArr31);
                                                    j3 = cls10.getField((java.lang.String) objArr31[0]).getLong(null);
                                                    if (j3 != -1) {
                                                        int i96 = valueOf + 57;
                                                        values = i96 % 128;
                                                        if (i96 % 2 != 0 ? j3 + 1967 >= ((java.lang.Long) java.lang.Class.forName(str2).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j3 / 1967 >= ((java.lang.Long) java.lang.Class.forName(str2).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                            int i97 = values;
                                                            int i98 = i97 & 33;
                                                            int i99 = -(-((i97 ^ 33) | i98));
                                                            valueOf = (((i98 | i99) << 1) - (i99 ^ i98)) % 128;
                                                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 51, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 584, (char) (24290 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                            b(bArr[17], bArr[9], bArr[11], objArr32);
                                                            java.lang.Object[] objArr33 = {cls11.getField((java.lang.String) objArr32[0]).get(null), 1430540743, num};
                                                            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                            if (obj11 == null) {
                                                                obj11 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 30, 4830 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod(str4, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj11);
                                                            }
                                                            objArr3 = (java.lang.Object[]) ((java.lang.reflect.Method) obj11).invoke(null, objArr33);
                                                            int i100 = values;
                                                            int i101 = (((i100 & (-120)) | ((~i100) & 119)) - (~((i100 & 119) << 1))) - 1;
                                                            valueOf = i101 % 128;
                                                            int i102 = i101 % 2;
                                                            str5 = str4;
                                                            charSequence = "";
                                                            i6 = ((int[]) objArr3[1])[0];
                                                            if (((int[]) objArr3[0])[0] == i6) {
                                                                int i103 = values;
                                                                valueOf = ((i103 ^ 57) + ((i103 & 57) << 1)) % 128;
                                                                java.lang.Object[] objArr34 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[3])[0]), num};
                                                                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                if (obj12 == null) {
                                                                    obj12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 4831 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod(str5, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj12);
                                                                }
                                                                ((java.lang.reflect.Method) obj12).invoke(null, objArr34);
                                                                int i104 = values;
                                                                int i105 = (i104 & 31) + (i104 | 31);
                                                                valueOf = i105 % 128;
                                                                if (i105 % 2 != 0) {
                                                                    throw null;
                                                                }
                                                                return;
                                                            }
                                                            java.lang.String str8 = str5;
                                                            java.lang.Object[] objArr35 = {java.lang.Long.valueOf((((~i6) & r4) | (i6 & (~r4))) ^ 5692650826368024576L), 1325423044L};
                                                            byte[] bArr6 = $$d;
                                                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                            c(bArr6[41], 112, (byte) (-bArr6[83]), objArr36);
                                                            java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr36[0]);
                                                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                            c((byte) (bArr6[234] - 1), 152, bArr6[30], objArr37);
                                                            cls12.getMethod((java.lang.String) objArr37[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr35);
                                                            java.lang.Object[] objArr38 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[3])[0]), num};
                                                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                            if (obj13 == null) {
                                                                obj13 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.text.TextUtils.lastIndexOf(charSequence, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 4829 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod(str8, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj13);
                                                            }
                                                            ((java.lang.reflect.Method) obj13).invoke(null, objArr38);
                                                            int i106 = valueOf;
                                                            values = (((i106 | 115) << 1) - (i106 ^ 115)) % 128;
                                                            return;
                                                        }
                                                    }
                                                    if (context == null) {
                                                        int i107 = values;
                                                        int i108 = (((i107 | 70) << 1) - (i107 ^ 70)) - 1;
                                                        valueOf = i108 % 128;
                                                        if (i108 % 2 != 0) {
                                                            context.getApplicationContext();
                                                            throw null;
                                                        }
                                                        context3 = context.getApplicationContext();
                                                        int i109 = valueOf;
                                                        int i110 = (i109 & (-20)) | ((~i109) & 19);
                                                        int i111 = -(-((i109 & 19) << 1));
                                                        values = ((i110 & i111) + (i111 | i110)) % 128;
                                                    } else {
                                                        context3 = context;
                                                    }
                                                    java.lang.Object[] objArr39 = {context3, num, 1430540743};
                                                    byte[] bArr7 = $$d;
                                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                    c(bArr7[191], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (byte) (-bArr7[83]), objArr40);
                                                    java.lang.Class<?> cls13 = java.lang.Class.forName((java.lang.String) objArr40[0]);
                                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                    c((byte) (bArr7[10] + 1), com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, bArr7[0], objArr41);
                                                    java.lang.String str9 = (java.lang.String) objArr41[0];
                                                    byte maxKeyCode = (byte) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 33);
                                                    int i112 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                    int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                                                    int i113 = (i112 * (-589)) + 13593;
                                                    int i114 = ~currentTimeMillis2;
                                                    int i115 = ~i114;
                                                    int i116 = i114 & 23;
                                                    int i117 = (i115 & (-24)) | i116;
                                                    int i118 = i114 & (-24);
                                                    str5 = str4;
                                                    int i119 = i112 & (-24);
                                                    java.lang.String str10 = str3;
                                                    int i120 = (~i119) & (i112 | (-24));
                                                    int i121 = ~i112;
                                                    int i122 = (~((i120 ^ i119) | (i120 & i119))) | (~((i117 ^ i118) | (i117 & i118)));
                                                    int i123 = (i115 & i112) | (i114 & i121);
                                                    int i124 = i114 & i112;
                                                    int i125 = (i123 ^ i124) | (i123 & i124);
                                                    int i126 = ~i125;
                                                    int i127 = (i125 | i126) & i126;
                                                    context4 = context3;
                                                    int i128 = ((~i127) & i122) | ((~i122) & i127);
                                                    int i129 = i122 & i127;
                                                    int i130 = (i128 ^ i129) | (i128 & i129);
                                                    int i131 = i121 & 23;
                                                    int i132 = (~i131) & (i121 | 23);
                                                    int i133 = (i131 & i132) | (i132 ^ i131);
                                                    int i134 = ~((i133 ^ currentTimeMillis2) | (i133 & currentTimeMillis2));
                                                    int i135 = i130 & i134;
                                                    int i136 = (((i130 | i134) & (~i135)) | i135) * 590;
                                                    int i137 = i113 ^ i136;
                                                    int i138 = ((i136 & i113) | i137) << 1;
                                                    int i139 = -i137;
                                                    int i140 = (i138 & i139) + (i138 | i139);
                                                    int i141 = (i114 ^ (-24)) | i118;
                                                    int i142 = ~i141;
                                                    int i143 = (i141 | i142) & i142;
                                                    int i144 = ~(i119 | (i112 ^ (-24)));
                                                    int i145 = (i143 & (~i144)) | ((~i143) & i144) | (i143 & i144);
                                                    int i146 = (i114 | currentTimeMillis2) & i114;
                                                    int i147 = ~i146;
                                                    int i148 = (i146 & i121) | (i112 & i147);
                                                    int i149 = i146 & i112;
                                                    int i150 = (i148 & i149) | (i148 ^ i149);
                                                    int i151 = ~i150;
                                                    int i152 = (i150 | i151) & i151;
                                                    int i153 = ((~i152) & i145) | ((~i145) & i152);
                                                    int i154 = i145 & i152;
                                                    int i155 = -(-(((i154 ^ i153) | (i154 & i153)) * (-1180)));
                                                    int i156 = ((((i140 ^ i155) | (i140 & i155)) << 1) - (~(-(((~i155) & i140) | ((~i140) & i155))))) - 1;
                                                    int i157 = (i121 | i112) & i121;
                                                    int i158 = ~(((~i157) & i146) | (i147 & i157) | (i157 & i146));
                                                    int i159 = i114 ^ 23;
                                                    int i160 = ~((i159 ^ i116) | (i159 & i116));
                                                    int i161 = i158 ^ i160;
                                                    int i162 = i158 & i160;
                                                    int i163 = ((i162 ^ i161) | (i162 & i161)) * 590;
                                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                    d("\u0005\u0001\n\u0006\f\u000b\u0007\n\u000b\u000e\u000f\u0001\u000f\u000e\u0007\u000f\u0007\r\u000f\u0001\u000f\u0006㘏", maxKeyCode, (i156 ^ i163) + ((i163 & i156) << 1), objArr42);
                                                    objArr3 = (java.lang.Object[]) cls13.getMethod(str9, java.lang.Class.forName((java.lang.String) objArr42[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr39);
                                                    if (context4 == null) {
                                                        int i164 = valueOf;
                                                        values = ((i164 ^ 105) + ((i164 & 105) << 1)) % 128;
                                                        charSequence = "";
                                                        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.graphics.Color.alpha(0), 583 - android.text.TextUtils.lastIndexOf(charSequence, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.text.TextUtils.indexOf(charSequence, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 24292));
                                                        java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                        b(bArr[17], bArr[9], bArr[11], objArr43);
                                                        cls14.getField((java.lang.String) objArr43[0]).set(null, objArr3);
                                                        try {
                                                            long longValue = ((java.lang.Long) java.lang.Class.forName(str2).getDeclaredMethod(str10, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.graphics.Color.alpha(0), 584 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 24291));
                                                            byte b10 = (byte) (-bArr[99]);
                                                            byte b11 = bArr[5];
                                                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                            b(b10, b11, (byte) (b11 | org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE), objArr44);
                                                            cls15.getField((java.lang.String) objArr44[0]).set(null, java.lang.Long.valueOf(longValue));
                                                            int i165 = valueOf;
                                                            int i166 = (i165 ^ 53) + ((i165 & 53) << 1);
                                                            values = i166 % 128;
                                                            int i167 = i166 % 2;
                                                        } catch (java.lang.Exception unused) {
                                                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                        }
                                                    } else {
                                                        charSequence = "";
                                                    }
                                                    i6 = ((int[]) objArr3[1])[0];
                                                    if (((int[]) objArr3[0])[0] == i6) {
                                                    }
                                                }
                                            }
                                            if (context != null) {
                                                int i168 = values;
                                                int i169 = (((i168 | 116) << 1) - (i168 ^ 116)) - 1;
                                                valueOf = i169 % 128;
                                                if (i169 % 2 != 0) {
                                                    context.getApplicationContext();
                                                    throw null;
                                                }
                                                context2 = context.getApplicationContext();
                                            } else {
                                                context2 = context;
                                            }
                                            byte[] bArr8 = $$d;
                                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                                            c((byte) (bArr8[102] - 1), 171, (byte) (-bArr8[83]), objArr45);
                                            java.lang.Class<?> cls16 = java.lang.Class.forName((java.lang.String) objArr45[0]);
                                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                                            c((byte) (bArr8[10] + 1), com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, bArr8[0], objArr46);
                                            java.lang.String str11 = (java.lang.String) objArr46[0];
                                            int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                                            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                                            int i170 = pressedStateDuration * (-183);
                                            int i171 = i170 & 6105;
                                            int i172 = -(-((i170 ^ 6105) | i171));
                                            int i173 = (i171 ^ i172) + ((i171 & i172) << 1);
                                            int i174 = ~pressedStateDuration;
                                            int i175 = i174 & 33;
                                            str = "valueOf";
                                            int i176 = (~i175) & (i174 | 33);
                                            int i177 = -(~(-(-(((i176 ^ i175) | (i175 & i176)) * (-368)))));
                                            int i178 = (((i173 | i177) << 1) - (i173 ^ i177)) - 1;
                                            int i179 = pressedStateDuration & 33;
                                            int i180 = i179 | (i174 & (-34));
                                            int i181 = pressedStateDuration & (-34);
                                            int i182 = (i180 ^ i181) | (i180 & i181);
                                            num = 0;
                                            int i183 = ~currentTimeMillis3;
                                            int i184 = i182 ^ i183;
                                            int i185 = i182 & i183;
                                            int i186 = ((i184 ^ i185) | (i184 & i185)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                                            int i187 = i178 & i186;
                                            int i188 = -(-((i186 ^ i178) | i187));
                                            int i189 = (i187 & i188) + (i187 | i188);
                                            int i190 = i174 & (i174 | pressedStateDuration);
                                            int i191 = ~((i190 ^ (-34)) | (i190 & (-34)));
                                            int i192 = i183 & (i183 | currentTimeMillis3);
                                            int i193 = (i192 ^ pressedStateDuration) | (i192 & pressedStateDuration);
                                            int i194 = ~i193;
                                            int i195 = (i193 | i194) & i194;
                                            int i196 = i191 & i195;
                                            int i197 = (i191 | i195) & (~i196);
                                            int i198 = (i197 ^ i196) | (i197 & i196);
                                            int i199 = pressedStateDuration ^ 33;
                                            int i200 = ~((i199 ^ i179) | (i199 & i179));
                                            int i201 = ((~i200) & i198) | ((~i198) & i200);
                                            int i202 = i198 & i200;
                                            int i203 = ((i202 ^ i201) | (i202 & i201)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                                            int i204 = ((i189 ^ i203) | (i189 & i203)) << 1;
                                            int i205 = -(((~i203) & i189) | ((~i189) & i203));
                                            byte b12 = (byte) ((i204 & i205) + (i205 | i204));
                                            int i206 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                                            int i207 = (-2) - (~((i206 * (-755)) - 16609));
                                            int i208 = ~i206;
                                            int i209 = i208 & (i208 | i206);
                                            int i210 = i209 & (-23);
                                            int i211 = (~i210) & (i209 | (-23));
                                            int i212 = (~((i210 & i211) | (i211 ^ i210))) * 1512;
                                            str2 = str6;
                                            int i213 = i207 & i212;
                                            int i214 = (i207 | i212) & (~i213);
                                            int i215 = i213 << 1;
                                            int i216 = (i214 ^ i215) + ((i215 & i214) << 1);
                                            int i217 = i209 ^ (-23);
                                            int i218 = ~((i217 ^ i210) | (i210 & i217));
                                            int i219 = i206 & 22;
                                            int i220 = (~i219) & (i206 | 22);
                                            int i221 = (i220 ^ i219) | (i220 & i219);
                                            int i222 = ~currentTimeMillis4;
                                            bArr = bArr2;
                                            int i223 = ((~i221) & currentTimeMillis4) | (i221 & i222);
                                            int i224 = currentTimeMillis4 & i221;
                                            int i225 = ~((i224 ^ i223) | (i223 & i224));
                                            int i226 = i218 & i225;
                                            int i227 = (i218 | i225) & (~i226);
                                            int i228 = -(~(-(-(((i227 ^ i226) | (i227 & i226)) * (-756)))));
                                            int i229 = (-2) - (~(((i216 | i228) << 1) - (i228 ^ i216)));
                                            int i230 = (i206 ^ 22) | i219;
                                            int i231 = -(-(((i230 ^ i222) | (i230 & i222)) * 756));
                                            int i232 = i229 & i231;
                                            int i233 = -(-(i229 | i231));
                                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                                            d("\u0005\u0001\n\u0006\f\u000b\u0007\n\u000b\u000e\u000f\u0001\u000f\u000e\u0007\u000f\u0007\r\u000f\u0001\u000f\u0006㘏", b12, ((i232 | i233) << 1) - (i233 ^ i232), objArr47);
                                            java.lang.Object[] objArr48 = (java.lang.Object[]) cls16.getMethod(str11, java.lang.Class.forName((java.lang.String) objArr47[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context2, 0, 314494135);
                                            if (context2 != null) {
                                                int i234 = values;
                                                int i235 = i234 & 37;
                                                int i236 = (i234 | 37) & (~i235);
                                                int i237 = i235 << 1;
                                                valueOf = ((i236 & i237) + (i236 | i237)) % 128;
                                                java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 51, android.graphics.Color.red(0) + 584, (char) (24291 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                                                java.lang.Object[] objArr49 = new java.lang.Object[1];
                                                b((byte) (bArr[55] - 1), 105, bArr[5], objArr49);
                                                cls17.getField((java.lang.String) objArr49[0]).set(null, objArr48);
                                                try {
                                                    str3 = str7;
                                                    long longValue2 = ((java.lang.Long) java.lang.Class.forName(str2).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 51, 585 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 24291));
                                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                                    b((byte) (bArr[17] - 1), bArr[1], bArr[11], objArr50);
                                                    cls18.getField((java.lang.String) objArr50[0]).set(null, java.lang.Long.valueOf(longValue2));
                                                    values = (valueOf + 95) % 128;
                                                } catch (java.lang.Exception unused2) {
                                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                }
                                            } else {
                                                str3 = str7;
                                            }
                                            objArr2 = objArr48;
                                            c = 1;
                                            i5 = ((int[]) objArr2[c])[0];
                                            if (((int[]) objArr2[0])[0] != i5) {
                                            }
                                            java.lang.Class cls102 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 584, (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 24291));
                                            byte b82 = (byte) (-bArr[99]);
                                            byte b92 = bArr[5];
                                            java.lang.Object[] objArr312 = new java.lang.Object[1];
                                            b(b82, b92, (byte) (b92 | org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE), objArr312);
                                            j3 = cls102.getField((java.lang.String) objArr312[0]).getLong(null);
                                            if (j3 != -1) {
                                            }
                                            if (context == null) {
                                            }
                                            java.lang.Object[] objArr392 = {context3, num, 1430540743};
                                            byte[] bArr72 = $$d;
                                            java.lang.Object[] objArr402 = new java.lang.Object[1];
                                            c(bArr72[191], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (byte) (-bArr72[83]), objArr402);
                                            java.lang.Class<?> cls132 = java.lang.Class.forName((java.lang.String) objArr402[0]);
                                            java.lang.Object[] objArr412 = new java.lang.Object[1];
                                            c((byte) (bArr72[10] + 1), com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, bArr72[0], objArr412);
                                            java.lang.String str92 = (java.lang.String) objArr412[0];
                                            byte maxKeyCode2 = (byte) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 33);
                                            int i1122 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                            int currentTimeMillis22 = (int) java.lang.System.currentTimeMillis();
                                            int i1132 = (i1122 * (-589)) + 13593;
                                            int i1142 = ~currentTimeMillis22;
                                            int i1152 = ~i1142;
                                            int i1162 = i1142 & 23;
                                            int i1172 = (i1152 & (-24)) | i1162;
                                            int i1182 = i1142 & (-24);
                                            str5 = str4;
                                            int i1192 = i1122 & (-24);
                                            java.lang.String str102 = str3;
                                            int i1202 = (~i1192) & (i1122 | (-24));
                                            int i1212 = ~i1122;
                                            int i1222 = (~((i1202 ^ i1192) | (i1202 & i1192))) | (~((i1172 ^ i1182) | (i1172 & i1182)));
                                            int i1232 = (i1152 & i1122) | (i1142 & i1212);
                                            int i1242 = i1142 & i1122;
                                            int i1252 = (i1232 ^ i1242) | (i1232 & i1242);
                                            int i1262 = ~i1252;
                                            int i1272 = (i1252 | i1262) & i1262;
                                            context4 = context3;
                                            int i1282 = ((~i1272) & i1222) | ((~i1222) & i1272);
                                            int i1292 = i1222 & i1272;
                                            int i1302 = (i1282 ^ i1292) | (i1282 & i1292);
                                            int i1312 = i1212 & 23;
                                            int i1322 = (~i1312) & (i1212 | 23);
                                            int i1332 = (i1312 & i1322) | (i1322 ^ i1312);
                                            int i1342 = ~((i1332 ^ currentTimeMillis22) | (i1332 & currentTimeMillis22));
                                            int i1352 = i1302 & i1342;
                                            int i1362 = (((i1302 | i1342) & (~i1352)) | i1352) * 590;
                                            int i1372 = i1132 ^ i1362;
                                            int i1382 = ((i1362 & i1132) | i1372) << 1;
                                            int i1392 = -i1372;
                                            int i1402 = (i1382 & i1392) + (i1382 | i1392);
                                            int i1412 = (i1142 ^ (-24)) | i1182;
                                            int i1422 = ~i1412;
                                            int i1432 = (i1412 | i1422) & i1422;
                                            int i1442 = ~(i1192 | (i1122 ^ (-24)));
                                            int i1452 = (i1432 & (~i1442)) | ((~i1432) & i1442) | (i1432 & i1442);
                                            int i1462 = (i1142 | currentTimeMillis22) & i1142;
                                            int i1472 = ~i1462;
                                            int i1482 = (i1462 & i1212) | (i1122 & i1472);
                                            int i1492 = i1462 & i1122;
                                            int i1502 = (i1482 & i1492) | (i1482 ^ i1492);
                                            int i1512 = ~i1502;
                                            int i1522 = (i1502 | i1512) & i1512;
                                            int i1532 = ((~i1522) & i1452) | ((~i1452) & i1522);
                                            int i1542 = i1452 & i1522;
                                            int i1552 = -(-(((i1542 ^ i1532) | (i1542 & i1532)) * (-1180)));
                                            int i1562 = ((((i1402 ^ i1552) | (i1402 & i1552)) << 1) - (~(-(((~i1552) & i1402) | ((~i1402) & i1552))))) - 1;
                                            int i1572 = (i1212 | i1122) & i1212;
                                            int i1582 = ~(((~i1572) & i1462) | (i1472 & i1572) | (i1572 & i1462));
                                            int i1592 = i1142 ^ 23;
                                            int i1602 = ~((i1592 ^ i1162) | (i1592 & i1162));
                                            int i1612 = i1582 ^ i1602;
                                            int i1622 = i1582 & i1602;
                                            int i1632 = ((i1622 ^ i1612) | (i1622 & i1612)) * 590;
                                            java.lang.Object[] objArr422 = new java.lang.Object[1];
                                            d("\u0005\u0001\n\u0006\f\u000b\u0007\n\u000b\u000e\u000f\u0001\u000f\u000e\u0007\u000f\u0007\r\u000f\u0001\u000f\u0006㘏", maxKeyCode2, (i1562 ^ i1632) + ((i1632 & i1562) << 1), objArr422);
                                            objArr3 = (java.lang.Object[]) cls132.getMethod(str92, java.lang.Class.forName((java.lang.String) objArr422[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr392);
                                            if (context4 == null) {
                                            }
                                            i6 = ((int[]) objArr3[1])[0];
                                            if (((int[]) objArr3[0])[0] == i6) {
                                            }
                                        }
                                    }
                                    int i238 = values;
                                    int i239 = i238 & 21;
                                    int i240 = (i238 ^ 21) | i239;
                                    int i241 = ((i239 & i240) + (i240 | i239)) % 128;
                                    valueOf = i241;
                                    int i242 = i241 & 71;
                                    int i243 = (i241 | 71) & (~i242);
                                    int i244 = -(-(i242 << 1));
                                    values = (((i243 | i244) << 1) - (i244 ^ i243)) % 128;
                                    byte[] bArr9 = $$d;
                                    java.lang.Object[] objArr51 = new java.lang.Object[1];
                                    c(bArr9[0], bArr9[109], (byte) (-bArr9[83]), objArr51);
                                    java.lang.Class<?> cls19 = java.lang.Class.forName((java.lang.String) objArr51[0]);
                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                    c((byte) (bArr9[67] + 1), 107, bArr9[3], objArr52);
                                    objArr = (java.lang.Object[]) cls19.getMethod((java.lang.String) objArr52[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, 0, -46521309);
                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 51, 584 - android.text.TextUtils.getTrimmedLength(""), (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24291));
                                    byte b13 = bArr2[5];
                                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                                    b(b13, (byte) (b13 | 58), bArr2[17], objArr53);
                                    cls20.getField((java.lang.String) objArr53[0]).set(null, objArr);
                                    long longValue3 = ((java.lang.Long) java.lang.Class.forName(str6).getDeclaredMethod(str7, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                    java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.widget.ExpandableListView.getPackedPositionType(0L), 583 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24291));
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    b((byte) (-bArr2[19]), b6, 54, objArr54);
                                    cls21.getField((java.lang.String) objArr54[0]).set(null, java.lang.Long.valueOf(longValue3));
                                    int i245 = valueOf;
                                    values = (((i245 | 113) << 1) - (i245 ^ 113)) % 128;
                                    i3 = ((int[]) objArr[1])[0];
                                    i4 = ((int[]) objArr[0])[0];
                                    if (i4 == i3) {
                                    }
                                    com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{remoteMessage, context}, -309498623, 309498636, (int) java.lang.System.currentTimeMillis());
                                    java.lang.Class cls72 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 51, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 584, (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 24291));
                                    java.lang.Object[] objArr222 = new java.lang.Object[1];
                                    b((byte) (bArr2[17] - 1), bArr2[1], bArr2[11], objArr222);
                                    j2 = cls72.getField((java.lang.String) objArr222[0]).getLong(null);
                                    if (j2 != -1) {
                                    }
                                    if (context != null) {
                                    }
                                    byte[] bArr82 = $$d;
                                    java.lang.Object[] objArr452 = new java.lang.Object[1];
                                    c((byte) (bArr82[102] - 1), 171, (byte) (-bArr82[83]), objArr452);
                                    java.lang.Class<?> cls162 = java.lang.Class.forName((java.lang.String) objArr452[0]);
                                    java.lang.Object[] objArr462 = new java.lang.Object[1];
                                    c((byte) (bArr82[10] + 1), com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, bArr82[0], objArr462);
                                    java.lang.String str112 = (java.lang.String) objArr462[0];
                                    int pressedStateDuration2 = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                                    int currentTimeMillis32 = (int) java.lang.System.currentTimeMillis();
                                    int i1702 = pressedStateDuration2 * (-183);
                                    int i1712 = i1702 & 6105;
                                    int i1722 = -(-((i1702 ^ 6105) | i1712));
                                    int i1732 = (i1712 ^ i1722) + ((i1712 & i1722) << 1);
                                    int i1742 = ~pressedStateDuration2;
                                    int i1752 = i1742 & 33;
                                    str = "valueOf";
                                    int i1762 = (~i1752) & (i1742 | 33);
                                    int i1772 = -(~(-(-(((i1762 ^ i1752) | (i1752 & i1762)) * (-368)))));
                                    int i1782 = (((i1732 | i1772) << 1) - (i1732 ^ i1772)) - 1;
                                    int i1792 = pressedStateDuration2 & 33;
                                    int i1802 = i1792 | (i1742 & (-34));
                                    int i1812 = pressedStateDuration2 & (-34);
                                    int i1822 = (i1802 ^ i1812) | (i1802 & i1812);
                                    num = 0;
                                    int i1832 = ~currentTimeMillis32;
                                    int i1842 = i1822 ^ i1832;
                                    int i1852 = i1822 & i1832;
                                    int i1862 = ((i1842 ^ i1852) | (i1842 & i1852)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                                    int i1872 = i1782 & i1862;
                                    int i1882 = -(-((i1862 ^ i1782) | i1872));
                                    int i1892 = (i1872 & i1882) + (i1872 | i1882);
                                    int i1902 = i1742 & (i1742 | pressedStateDuration2);
                                    int i1912 = ~((i1902 ^ (-34)) | (i1902 & (-34)));
                                    int i1922 = i1832 & (i1832 | currentTimeMillis32);
                                    int i1932 = (i1922 ^ pressedStateDuration2) | (i1922 & pressedStateDuration2);
                                    int i1942 = ~i1932;
                                    int i1952 = (i1932 | i1942) & i1942;
                                    int i1962 = i1912 & i1952;
                                    int i1972 = (i1912 | i1952) & (~i1962);
                                    int i1982 = (i1972 ^ i1962) | (i1972 & i1962);
                                    int i1992 = pressedStateDuration2 ^ 33;
                                    int i2002 = ~((i1992 ^ i1792) | (i1992 & i1792));
                                    int i2012 = ((~i2002) & i1982) | ((~i1982) & i2002);
                                    int i2022 = i1982 & i2002;
                                    int i2032 = ((i2022 ^ i2012) | (i2022 & i2012)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                                    int i2042 = ((i1892 ^ i2032) | (i1892 & i2032)) << 1;
                                    int i2052 = -(((~i2032) & i1892) | ((~i1892) & i2032));
                                    byte b122 = (byte) ((i2042 & i2052) + (i2052 | i2042));
                                    int i2062 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                    int currentTimeMillis42 = (int) java.lang.System.currentTimeMillis();
                                    int i2072 = (-2) - (~((i2062 * (-755)) - 16609));
                                    int i2082 = ~i2062;
                                    int i2092 = i2082 & (i2082 | i2062);
                                    int i2102 = i2092 & (-23);
                                    int i2112 = (~i2102) & (i2092 | (-23));
                                    int i2122 = (~((i2102 & i2112) | (i2112 ^ i2102))) * 1512;
                                    str2 = str6;
                                    int i2132 = i2072 & i2122;
                                    int i2142 = (i2072 | i2122) & (~i2132);
                                    int i2152 = i2132 << 1;
                                    int i2162 = (i2142 ^ i2152) + ((i2152 & i2142) << 1);
                                    int i2172 = i2092 ^ (-23);
                                    int i2182 = ~((i2172 ^ i2102) | (i2102 & i2172));
                                    int i2192 = i2062 & 22;
                                    int i2202 = (~i2192) & (i2062 | 22);
                                    int i2212 = (i2202 ^ i2192) | (i2202 & i2192);
                                    int i2222 = ~currentTimeMillis42;
                                    bArr = bArr2;
                                    int i2232 = ((~i2212) & currentTimeMillis42) | (i2212 & i2222);
                                    int i2242 = currentTimeMillis42 & i2212;
                                    int i2252 = ~((i2242 ^ i2232) | (i2232 & i2242));
                                    int i2262 = i2182 & i2252;
                                    int i2272 = (i2182 | i2252) & (~i2262);
                                    int i2282 = -(~(-(-(((i2272 ^ i2262) | (i2272 & i2262)) * (-756)))));
                                    int i2292 = (-2) - (~(((i2162 | i2282) << 1) - (i2282 ^ i2162)));
                                    int i2302 = (i2062 ^ 22) | i2192;
                                    int i2312 = -(-(((i2302 ^ i2222) | (i2302 & i2222)) * 756));
                                    int i2322 = i2292 & i2312;
                                    int i2332 = -(-(i2292 | i2312));
                                    java.lang.Object[] objArr472 = new java.lang.Object[1];
                                    d("\u0005\u0001\n\u0006\f\u000b\u0007\n\u000b\u000e\u000f\u0001\u000f\u000e\u0007\u000f\u0007\r\u000f\u0001\u000f\u0006㘏", b122, ((i2322 | i2332) << 1) - (i2332 ^ i2322), objArr472);
                                    java.lang.Object[] objArr482 = (java.lang.Object[]) cls162.getMethod(str112, java.lang.Class.forName((java.lang.String) objArr472[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context2, 0, 314494135);
                                    if (context2 != null) {
                                    }
                                    objArr2 = objArr482;
                                    c = 1;
                                    i5 = ((int[]) objArr2[c])[0];
                                    if (((int[]) objArr2[0])[0] != i5) {
                                    }
                                    java.lang.Class cls1022 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 584, (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 24291));
                                    byte b822 = (byte) (-bArr[99]);
                                    byte b922 = bArr[5];
                                    java.lang.Object[] objArr3122 = new java.lang.Object[1];
                                    b(b822, b922, (byte) (b922 | org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE), objArr3122);
                                    j3 = cls1022.getField((java.lang.String) objArr3122[0]).getLong(null);
                                    if (j3 != -1) {
                                    }
                                    if (context == null) {
                                    }
                                    java.lang.Object[] objArr3922 = {context3, num, 1430540743};
                                    byte[] bArr722 = $$d;
                                    java.lang.Object[] objArr4022 = new java.lang.Object[1];
                                    c(bArr722[191], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (byte) (-bArr722[83]), objArr4022);
                                    java.lang.Class<?> cls1322 = java.lang.Class.forName((java.lang.String) objArr4022[0]);
                                    java.lang.Object[] objArr4122 = new java.lang.Object[1];
                                    c((byte) (bArr722[10] + 1), com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, bArr722[0], objArr4122);
                                    java.lang.String str922 = (java.lang.String) objArr4122[0];
                                    byte maxKeyCode22 = (byte) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 33);
                                    int i11222 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                    int currentTimeMillis222 = (int) java.lang.System.currentTimeMillis();
                                    int i11322 = (i11222 * (-589)) + 13593;
                                    int i11422 = ~currentTimeMillis222;
                                    int i11522 = ~i11422;
                                    int i11622 = i11422 & 23;
                                    int i11722 = (i11522 & (-24)) | i11622;
                                    int i11822 = i11422 & (-24);
                                    str5 = str4;
                                    int i11922 = i11222 & (-24);
                                    java.lang.String str1022 = str3;
                                    int i12022 = (~i11922) & (i11222 | (-24));
                                    int i12122 = ~i11222;
                                    int i12222 = (~((i12022 ^ i11922) | (i12022 & i11922))) | (~((i11722 ^ i11822) | (i11722 & i11822)));
                                    int i12322 = (i11522 & i11222) | (i11422 & i12122);
                                    int i12422 = i11422 & i11222;
                                    int i12522 = (i12322 ^ i12422) | (i12322 & i12422);
                                    int i12622 = ~i12522;
                                    int i12722 = (i12522 | i12622) & i12622;
                                    context4 = context3;
                                    int i12822 = ((~i12722) & i12222) | ((~i12222) & i12722);
                                    int i12922 = i12222 & i12722;
                                    int i13022 = (i12822 ^ i12922) | (i12822 & i12922);
                                    int i13122 = i12122 & 23;
                                    int i13222 = (~i13122) & (i12122 | 23);
                                    int i13322 = (i13122 & i13222) | (i13222 ^ i13122);
                                    int i13422 = ~((i13322 ^ currentTimeMillis222) | (i13322 & currentTimeMillis222));
                                    int i13522 = i13022 & i13422;
                                    int i13622 = (((i13022 | i13422) & (~i13522)) | i13522) * 590;
                                    int i13722 = i11322 ^ i13622;
                                    int i13822 = ((i13622 & i11322) | i13722) << 1;
                                    int i13922 = -i13722;
                                    int i14022 = (i13822 & i13922) + (i13822 | i13922);
                                    int i14122 = (i11422 ^ (-24)) | i11822;
                                    int i14222 = ~i14122;
                                    int i14322 = (i14122 | i14222) & i14222;
                                    int i14422 = ~(i11922 | (i11222 ^ (-24)));
                                    int i14522 = (i14322 & (~i14422)) | ((~i14322) & i14422) | (i14322 & i14422);
                                    int i14622 = (i11422 | currentTimeMillis222) & i11422;
                                    int i14722 = ~i14622;
                                    int i14822 = (i14622 & i12122) | (i11222 & i14722);
                                    int i14922 = i14622 & i11222;
                                    int i15022 = (i14822 & i14922) | (i14822 ^ i14922);
                                    int i15122 = ~i15022;
                                    int i15222 = (i15022 | i15122) & i15122;
                                    int i15322 = ((~i15222) & i14522) | ((~i14522) & i15222);
                                    int i15422 = i14522 & i15222;
                                    int i15522 = -(-(((i15422 ^ i15322) | (i15422 & i15322)) * (-1180)));
                                    int i15622 = ((((i14022 ^ i15522) | (i14022 & i15522)) << 1) - (~(-(((~i15522) & i14022) | ((~i14022) & i15522))))) - 1;
                                    int i15722 = (i12122 | i11222) & i12122;
                                    int i15822 = ~(((~i15722) & i14622) | (i14722 & i15722) | (i15722 & i14622));
                                    int i15922 = i11422 ^ 23;
                                    int i16022 = ~((i15922 ^ i11622) | (i15922 & i11622));
                                    int i16122 = i15822 ^ i16022;
                                    int i16222 = i15822 & i16022;
                                    int i16322 = ((i16222 ^ i16122) | (i16222 & i16122)) * 590;
                                    java.lang.Object[] objArr4222 = new java.lang.Object[1];
                                    d("\u0005\u0001\n\u0006\f\u000b\u0007\n\u000b\u000e\u000f\u0001\u000f\u000e\u0007\u000f\u0007\r\u000f\u0001\u000f\u0006㘏", maxKeyCode22, (i15622 ^ i16322) + ((i16322 & i15622) << 1), objArr4222);
                                    objArr3 = (java.lang.Object[]) cls1322.getMethod(str922, java.lang.Class.forName((java.lang.String) objArr4222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr3922);
                                    if (context4 == null) {
                                    }
                                    i6 = ((int[]) objArr3[1])[0];
                                    if (((int[]) objArr3[0])[0] == i6) {
                                    }
                                }
                            }
                            long longValue32 = ((java.lang.Long) java.lang.Class.forName(str6).getDeclaredMethod(str7, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls212 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.widget.ExpandableListView.getPackedPositionType(0L), 583 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24291));
                            java.lang.Object[] objArr542 = new java.lang.Object[1];
                            b((byte) (-bArr2[19]), b6, 54, objArr542);
                            cls212.getField((java.lang.String) objArr542[0]).set(null, java.lang.Long.valueOf(longValue32));
                            int i2452 = valueOf;
                            values = (((i2452 | 113) << 1) - (i2452 ^ 113)) % 128;
                            i3 = ((int[]) objArr[1])[0];
                            i4 = ((int[]) objArr[0])[0];
                            if (i4 == i3) {
                            }
                            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{remoteMessage, context}, -309498623, 309498636, (int) java.lang.System.currentTimeMillis());
                            java.lang.Class cls722 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 51, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 584, (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 24291));
                            java.lang.Object[] objArr2222 = new java.lang.Object[1];
                            b((byte) (bArr2[17] - 1), bArr2[1], bArr2[11], objArr2222);
                            j2 = cls722.getField((java.lang.String) objArr2222[0]).getLong(null);
                            if (j2 != -1) {
                            }
                            if (context != null) {
                            }
                            byte[] bArr822 = $$d;
                            java.lang.Object[] objArr4522 = new java.lang.Object[1];
                            c((byte) (bArr822[102] - 1), 171, (byte) (-bArr822[83]), objArr4522);
                            java.lang.Class<?> cls1622 = java.lang.Class.forName((java.lang.String) objArr4522[0]);
                            java.lang.Object[] objArr4622 = new java.lang.Object[1];
                            c((byte) (bArr822[10] + 1), com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, bArr822[0], objArr4622);
                            java.lang.String str1122 = (java.lang.String) objArr4622[0];
                            int pressedStateDuration22 = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                            int currentTimeMillis322 = (int) java.lang.System.currentTimeMillis();
                            int i17022 = pressedStateDuration22 * (-183);
                            int i17122 = i17022 & 6105;
                            int i17222 = -(-((i17022 ^ 6105) | i17122));
                            int i17322 = (i17122 ^ i17222) + ((i17122 & i17222) << 1);
                            int i17422 = ~pressedStateDuration22;
                            int i17522 = i17422 & 33;
                            str = "valueOf";
                            int i17622 = (~i17522) & (i17422 | 33);
                            int i17722 = -(~(-(-(((i17622 ^ i17522) | (i17522 & i17622)) * (-368)))));
                            int i17822 = (((i17322 | i17722) << 1) - (i17322 ^ i17722)) - 1;
                            int i17922 = pressedStateDuration22 & 33;
                            int i18022 = i17922 | (i17422 & (-34));
                            int i18122 = pressedStateDuration22 & (-34);
                            int i18222 = (i18022 ^ i18122) | (i18022 & i18122);
                            num = 0;
                            int i18322 = ~currentTimeMillis322;
                            int i18422 = i18222 ^ i18322;
                            int i18522 = i18222 & i18322;
                            int i18622 = ((i18422 ^ i18522) | (i18422 & i18522)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                            int i18722 = i17822 & i18622;
                            int i18822 = -(-((i18622 ^ i17822) | i18722));
                            int i18922 = (i18722 & i18822) + (i18722 | i18822);
                            int i19022 = i17422 & (i17422 | pressedStateDuration22);
                            int i19122 = ~((i19022 ^ (-34)) | (i19022 & (-34)));
                            int i19222 = i18322 & (i18322 | currentTimeMillis322);
                            int i19322 = (i19222 ^ pressedStateDuration22) | (i19222 & pressedStateDuration22);
                            int i19422 = ~i19322;
                            int i19522 = (i19322 | i19422) & i19422;
                            int i19622 = i19122 & i19522;
                            int i19722 = (i19122 | i19522) & (~i19622);
                            int i19822 = (i19722 ^ i19622) | (i19722 & i19622);
                            int i19922 = pressedStateDuration22 ^ 33;
                            int i20022 = ~((i19922 ^ i17922) | (i19922 & i17922));
                            int i20122 = ((~i20022) & i19822) | ((~i19822) & i20022);
                            int i20222 = i19822 & i20022;
                            int i20322 = ((i20222 ^ i20122) | (i20222 & i20122)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                            int i20422 = ((i18922 ^ i20322) | (i18922 & i20322)) << 1;
                            int i20522 = -(((~i20322) & i18922) | ((~i18922) & i20322));
                            byte b1222 = (byte) ((i20422 & i20522) + (i20522 | i20422));
                            int i20622 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            int currentTimeMillis422 = (int) java.lang.System.currentTimeMillis();
                            int i20722 = (-2) - (~((i20622 * (-755)) - 16609));
                            int i20822 = ~i20622;
                            int i20922 = i20822 & (i20822 | i20622);
                            int i21022 = i20922 & (-23);
                            int i21122 = (~i21022) & (i20922 | (-23));
                            int i21222 = (~((i21022 & i21122) | (i21122 ^ i21022))) * 1512;
                            str2 = str6;
                            int i21322 = i20722 & i21222;
                            int i21422 = (i20722 | i21222) & (~i21322);
                            int i21522 = i21322 << 1;
                            int i21622 = (i21422 ^ i21522) + ((i21522 & i21422) << 1);
                            int i21722 = i20922 ^ (-23);
                            int i21822 = ~((i21722 ^ i21022) | (i21022 & i21722));
                            int i21922 = i20622 & 22;
                            int i22022 = (~i21922) & (i20622 | 22);
                            int i22122 = (i22022 ^ i21922) | (i22022 & i21922);
                            int i22222 = ~currentTimeMillis422;
                            bArr = bArr2;
                            int i22322 = ((~i22122) & currentTimeMillis422) | (i22122 & i22222);
                            int i22422 = currentTimeMillis422 & i22122;
                            int i22522 = ~((i22422 ^ i22322) | (i22322 & i22422));
                            int i22622 = i21822 & i22522;
                            int i22722 = (i21822 | i22522) & (~i22622);
                            int i22822 = -(~(-(-(((i22722 ^ i22622) | (i22722 & i22622)) * (-756)))));
                            int i22922 = (-2) - (~(((i21622 | i22822) << 1) - (i22822 ^ i21622)));
                            int i23022 = (i20622 ^ 22) | i21922;
                            int i23122 = -(-(((i23022 ^ i22222) | (i23022 & i22222)) * 756));
                            int i23222 = i22922 & i23122;
                            int i23322 = -(-(i22922 | i23122));
                            java.lang.Object[] objArr4722 = new java.lang.Object[1];
                            d("\u0005\u0001\n\u0006\f\u000b\u0007\n\u000b\u000e\u000f\u0001\u000f\u000e\u0007\u000f\u0007\r\u000f\u0001\u000f\u0006㘏", b1222, ((i23222 | i23322) << 1) - (i23322 ^ i23222), objArr4722);
                            java.lang.Object[] objArr4822 = (java.lang.Object[]) cls1622.getMethod(str1122, java.lang.Class.forName((java.lang.String) objArr4722[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context2, 0, 314494135);
                            if (context2 != null) {
                            }
                            objArr2 = objArr4822;
                            c = 1;
                            i5 = ((int[]) objArr2[c])[0];
                            if (((int[]) objArr2[0])[0] != i5) {
                            }
                            java.lang.Class cls10222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 584, (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 24291));
                            byte b8222 = (byte) (-bArr[99]);
                            byte b9222 = bArr[5];
                            java.lang.Object[] objArr31222 = new java.lang.Object[1];
                            b(b8222, b9222, (byte) (b9222 | org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE), objArr31222);
                            j3 = cls10222.getField((java.lang.String) objArr31222[0]).getLong(null);
                            if (j3 != -1) {
                            }
                            if (context == null) {
                            }
                            java.lang.Object[] objArr39222 = {context3, num, 1430540743};
                            byte[] bArr7222 = $$d;
                            java.lang.Object[] objArr40222 = new java.lang.Object[1];
                            c(bArr7222[191], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (byte) (-bArr7222[83]), objArr40222);
                            java.lang.Class<?> cls13222 = java.lang.Class.forName((java.lang.String) objArr40222[0]);
                            java.lang.Object[] objArr41222 = new java.lang.Object[1];
                            c((byte) (bArr7222[10] + 1), com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, bArr7222[0], objArr41222);
                            java.lang.String str9222 = (java.lang.String) objArr41222[0];
                            byte maxKeyCode222 = (byte) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 33);
                            int i112222 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                            int currentTimeMillis2222 = (int) java.lang.System.currentTimeMillis();
                            int i113222 = (i112222 * (-589)) + 13593;
                            int i114222 = ~currentTimeMillis2222;
                            int i115222 = ~i114222;
                            int i116222 = i114222 & 23;
                            int i117222 = (i115222 & (-24)) | i116222;
                            int i118222 = i114222 & (-24);
                            str5 = str4;
                            int i119222 = i112222 & (-24);
                            java.lang.String str10222 = str3;
                            int i120222 = (~i119222) & (i112222 | (-24));
                            int i121222 = ~i112222;
                            int i122222 = (~((i120222 ^ i119222) | (i120222 & i119222))) | (~((i117222 ^ i118222) | (i117222 & i118222)));
                            int i123222 = (i115222 & i112222) | (i114222 & i121222);
                            int i124222 = i114222 & i112222;
                            int i125222 = (i123222 ^ i124222) | (i123222 & i124222);
                            int i126222 = ~i125222;
                            int i127222 = (i125222 | i126222) & i126222;
                            context4 = context3;
                            int i128222 = ((~i127222) & i122222) | ((~i122222) & i127222);
                            int i129222 = i122222 & i127222;
                            int i130222 = (i128222 ^ i129222) | (i128222 & i129222);
                            int i131222 = i121222 & 23;
                            int i132222 = (~i131222) & (i121222 | 23);
                            int i133222 = (i131222 & i132222) | (i132222 ^ i131222);
                            int i134222 = ~((i133222 ^ currentTimeMillis2222) | (i133222 & currentTimeMillis2222));
                            int i135222 = i130222 & i134222;
                            int i136222 = (((i130222 | i134222) & (~i135222)) | i135222) * 590;
                            int i137222 = i113222 ^ i136222;
                            int i138222 = ((i136222 & i113222) | i137222) << 1;
                            int i139222 = -i137222;
                            int i140222 = (i138222 & i139222) + (i138222 | i139222);
                            int i141222 = (i114222 ^ (-24)) | i118222;
                            int i142222 = ~i141222;
                            int i143222 = (i141222 | i142222) & i142222;
                            int i144222 = ~(i119222 | (i112222 ^ (-24)));
                            int i145222 = (i143222 & (~i144222)) | ((~i143222) & i144222) | (i143222 & i144222);
                            int i146222 = (i114222 | currentTimeMillis2222) & i114222;
                            int i147222 = ~i146222;
                            int i148222 = (i146222 & i121222) | (i112222 & i147222);
                            int i149222 = i146222 & i112222;
                            int i150222 = (i148222 & i149222) | (i148222 ^ i149222);
                            int i151222 = ~i150222;
                            int i152222 = (i150222 | i151222) & i151222;
                            int i153222 = ((~i152222) & i145222) | ((~i145222) & i152222);
                            int i154222 = i145222 & i152222;
                            int i155222 = -(-(((i154222 ^ i153222) | (i154222 & i153222)) * (-1180)));
                            int i156222 = ((((i140222 ^ i155222) | (i140222 & i155222)) << 1) - (~(-(((~i155222) & i140222) | ((~i140222) & i155222))))) - 1;
                            int i157222 = (i121222 | i112222) & i121222;
                            int i158222 = ~(((~i157222) & i146222) | (i147222 & i157222) | (i157222 & i146222));
                            int i159222 = i114222 ^ 23;
                            int i160222 = ~((i159222 ^ i116222) | (i159222 & i116222));
                            int i161222 = i158222 ^ i160222;
                            int i162222 = i158222 & i160222;
                            int i163222 = ((i162222 ^ i161222) | (i162222 & i161222)) * 590;
                            java.lang.Object[] objArr42222 = new java.lang.Object[1];
                            d("\u0005\u0001\n\u0006\f\u000b\u0007\n\u000b\u000e\u000f\u0001\u000f\u000e\u0007\u000f\u0007\r\u000f\u0001\u000f\u0006㘏", maxKeyCode222, (i156222 ^ i163222) + ((i163222 & i156222) << 1), objArr42222);
                            objArr3 = (java.lang.Object[]) cls13222.getMethod(str9222, java.lang.Class.forName((java.lang.String) objArr42222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr39222);
                            if (context4 == null) {
                            }
                            i6 = ((int[]) objArr3[1])[0];
                            if (((int[]) objArr3[0])[0] == i6) {
                            }
                        } catch (java.lang.Exception unused3) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                        byte[] bArr92 = $$d;
                        java.lang.Object[] objArr512 = new java.lang.Object[1];
                        c(bArr92[0], bArr92[109], (byte) (-bArr92[83]), objArr512);
                        java.lang.Class<?> cls192 = java.lang.Class.forName((java.lang.String) objArr512[0]);
                        java.lang.Object[] objArr522 = new java.lang.Object[1];
                        c((byte) (bArr92[67] + 1), 107, bArr92[3], objArr522);
                        objArr = (java.lang.Object[]) cls192.getMethod((java.lang.String) objArr522[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, 0, -46521309);
                        java.lang.Class cls202 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 51, 584 - android.text.TextUtils.getTrimmedLength(""), (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24291));
                        byte b132 = bArr2[5];
                        java.lang.Object[] objArr532 = new java.lang.Object[1];
                        b(b132, (byte) (b132 | 58), bArr2[17], objArr532);
                        cls202.getField((java.lang.String) objArr532[0]).set(null, objArr);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                    long longValue4 = ((java.lang.Long) java.lang.Class.forName(str6).getDeclaredMethod(str7, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, 921 - android.view.MotionEvent.axisFromString(""), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                    byte b14 = (byte) (-bArr2[99]);
                    byte b15 = bArr2[5];
                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                    b(b14, b15, (byte) (b15 | org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE), objArr55);
                    cls22.getField((java.lang.String) objArr55[0]).set(null, java.lang.Long.valueOf(longValue4));
                    int i246 = values;
                    valueOf = ((i246 ^ 115) + ((i246 & 115) << 1)) % 128;
                    i = ((int[]) AlternateContactlessPaymentDataJson$466995e3[1])[0];
                    i2 = ((int[]) AlternateContactlessPaymentDataJson$466995e3[0])[0];
                    if (i2 != i) {
                    }
                    java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 50, android.view.View.combineMeasuredStates(0, 0) + 584, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24291));
                    byte b52 = (byte) (-bArr2[19]);
                    byte b62 = (byte) ($$b & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    java.lang.Object[] objArr142 = new java.lang.Object[1];
                    b(b52, b62, 54, objArr142);
                    j = cls42.getField((java.lang.String) objArr142[0]).getLong(null);
                    if (j != -1) {
                    }
                    int i2382 = values;
                    int i2392 = i2382 & 21;
                    int i2402 = (i2382 ^ 21) | i2392;
                    int i2412 = ((i2392 & i2402) + (i2402 | i2392)) % 128;
                    valueOf = i2412;
                    int i2422 = i2412 & 71;
                    int i2432 = (i2412 | 71) & (~i2422);
                    int i2442 = -(-(i2422 << 1));
                    values = (((i2432 | i2442) << 1) - (i2442 ^ i2432)) % 128;
                } catch (java.lang.Exception unused4) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
                java.lang.Object[] objArr56 = {475351451};
                java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                if (obj14 == null) {
                    obj14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 49, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 873, (char) (android.view.View.resolveSize(0, 0) + 15955))).getDeclaredConstructor(java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj14);
                }
                AlternateContactlessPaymentDataJson$466995e3 = com.payair.hce.setScrollIndicators.AlternateContactlessPaymentDataJson$466995e3(((java.lang.reflect.Constructor) obj14).newInstance(objArr56));
                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43, 922 - android.graphics.Color.blue(0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                java.lang.Object[] objArr57 = new java.lang.Object[1];
                b(bArr2[17], bArr2[9], bArr2[11], objArr57);
                cls23.getField((java.lang.String) objArr57[0]).set(null, AlternateContactlessPaymentDataJson$466995e3);
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    public static void setJWTToken(java.lang.String str) {
        int i = values;
        int i2 = i & 31;
        int i3 = ((i ^ 31) | i2) << 1;
        int i4 = -((i | 31) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str}, -1700798823, 1700798888, (int) java.lang.System.currentTimeMillis());
            int i6 = values;
            int i7 = i6 & 71;
            int i8 = ((i6 ^ 71) | i7) << 1;
            int i9 = -((i6 | 71) & (~i7));
            valueOf = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
            return;
        }
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str}, -1700798823, 1700798888, (int) java.lang.System.currentTimeMillis());
        throw new java.lang.ArithmeticException();
    }

    public static java.lang.String getJWTToken() {
        int i = values;
        int i2 = (i ^ 76) + ((i & 76) << 1);
        int i3 = (~i2) + (i2 << 1);
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1354005599, 1354005623, (int) java.lang.System.currentTimeMillis());
        }
        throw null;
    }

    public static void setUserID(long j) {
        int i = valueOf;
        int i2 = (((i | 110) << 1) - (i ^ 110)) - 1;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Long.valueOf(j)}, -1243085001, 1243085021, (int) java.lang.System.currentTimeMillis());
        } else {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Long.valueOf(j)}, -1243085001, 1243085021, (int) java.lang.System.currentTimeMillis());
            throw null;
        }
    }

    public static void updatePushToken(java.lang.String str) {
        int i = values;
        int i2 = ((((i ^ 119) | (i & 119)) << 1) - (~(-((i & (-120)) | ((~i) & 119))))) - 1;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            updatePushToken(str, com.payair.hce.TokenType.MDES);
        } else {
            updatePushToken(str, com.payair.hce.TokenType.MDES);
            throw null;
        }
    }

    public static com.payair.hce.communication.JsonResponse updatePushToken(java.lang.String str, com.payair.hce.TokenType tokenType) {
        int i = valueOf;
        int i2 = (i & 85) + (i | 85);
        values = i2 % 128;
        java.lang.Object[] objArr = {str, tokenType};
        if (i2 % 2 != 0) {
            return (com.payair.hce.communication.JsonResponse) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(objArr, 1468422935, -1468422838, (int) java.lang.System.currentTimeMillis());
        }
        throw null;
    }

    public static com.payair.hce.communication.JsonResponse updateUnlockKeys(java.lang.String str) {
        int i = values;
        int i2 = i ^ 115;
        int i3 = ((i & 115) | i2) << 1;
        int i4 = -i2;
        valueOf = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        com.payair.hce.communication.JsonResponse jsonResponse = (com.payair.hce.communication.JsonResponse) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{str}, -1677639557, 1677639653, (int) java.lang.System.currentTimeMillis());
        int i5 = values;
        int i6 = (i5 & (-24)) | ((~i5) & 23);
        int i7 = -(-((i5 & 23) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        valueOf = i8 % 128;
        if (i8 % 2 == 0) {
            return jsonResponse;
        }
        throw new java.lang.ArithmeticException();
    }

    public static void setHCEEventListener(com.payair.hce.HCEEventListener hCEEventListener) {
        int i = valueOf;
        values = ((i ^ 119) + ((i & 119) << 1)) % 128;
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{hCEEventListener}, -1148933970, 1148933995, (int) java.lang.System.currentTimeMillis());
        int i2 = values;
        int i3 = (i2 & 91) + (i2 | 91);
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public static boolean hasVersionCheckFailed() {
        com.payair.hce.setOverScrollMode setoverscrollmode = new com.payair.hce.setOverScrollMode((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis()));
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setOverScrollMode.writeReplace(new java.lang.Object[]{setoverscrollmode}, 713463943, -713463942, java.lang.System.identityHashCode(setoverscrollmode))).booleanValue();
        int i = values;
        int i2 = i & 13;
        int i3 = i | 13;
        int i4 = (i2 & i3) + (i3 | i2);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return booleanValue;
        }
        throw null;
    }

    public static com.payair.hce.communication.JsonResponse unsuspendTokens(java.lang.String str, com.payair.hce.communication.JsonResponse jsonResponse) {
        int i = valueOf;
        int i2 = (i & 41) + (i | 41);
        values = i2 % 128;
        java.lang.Object[] objArr = {str, jsonResponse};
        if (i2 % 2 != 0) {
            return (com.payair.hce.communication.JsonResponse) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(objArr, -742515545, 742515621, (int) java.lang.System.currentTimeMillis());
        }
        throw null;
    }

    public static void setLvtAllowed(boolean z, java.util.Set<java.lang.String> set) {
        int i = valueOf;
        int i2 = i & 107;
        int i3 = (i | 107) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        values = i5 % 128;
        if (i5 % 2 != 0) {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.valueOf(z)}, 1899501408, -1899501358, (int) java.lang.System.currentTimeMillis());
            if (set.contains(com.payair.hce.setHandwritingDelegatorCallback.values.writeReplace().toLowerCase())) {
                int i6 = valueOf + 15;
                values = i6 % 128;
                if (i6 % 2 != 0) {
                    android.content.Context context = (android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis());
                    com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
                    com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context, java.lang.Boolean.valueOf(z)}, -1676824979, 1676824992, (int) java.lang.System.currentTimeMillis());
                } else {
                    android.content.Context context2 = (android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis());
                    com.payair.hce.setNetworkAvailable setnetworkavailable2 = com.payair.hce.setNetworkAvailable.values;
                    com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context2, java.lang.Boolean.valueOf(z)}, -1676824979, 1676824992, (int) java.lang.System.currentTimeMillis());
                    throw null;
                }
            }
            int i7 = valueOf + 57;
            values = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            return;
        }
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.valueOf(z)}, 1899501408, -1899501358, (int) java.lang.System.currentTimeMillis());
        set.contains(com.payair.hce.setHandwritingDelegatorCallback.values.writeReplace().toLowerCase());
        throw null;
    }

    public static boolean isLvtAllowed() {
        values = (valueOf + 91) % 128;
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -118543716, 118543797, (int) java.lang.System.currentTimeMillis())).booleanValue();
        int i = valueOf + 2;
        int i2 = (~i) + (i << 1);
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return booleanValue;
        }
        throw null;
    }

    public static long getKeyCreationTimestamp() {
        int i = valueOf & 49;
        int i2 = ((((r0 | 49) & (~i)) - (~(i << 1))) - 1) % 128;
        values = i2;
        int i3 = i2 & 29;
        int i4 = i3 + ((i2 ^ 29) | i3);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i5 = values;
        int i6 = i5 & 71;
        int i7 = (i5 | 71) & (~i6);
        int i8 = i6 << 1;
        int i9 = ((i7 & i8) + (i7 | i8)) % 128;
        valueOf = i9;
        int i10 = ((i9 & (-80)) | ((~i9) & 79)) + ((i9 & 79) << 1);
        values = i10 % 128;
        if (i10 % 2 != 0) {
            return currentTimeMillis;
        }
        throw null;
    }

    public static boolean isVisaOfflinePaymentsSupported() {
        int i = values + 89;
        valueOf = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 924893086, -924893026, (int) java.lang.System.currentTimeMillis())).booleanValue();
        int i2 = valueOf;
        int i3 = (((i2 ^ 111) | (i2 & 111)) << 1) - ((i2 & (-112)) | ((~i2) & 111));
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return booleanValue;
        }
        throw new java.lang.ArithmeticException();
    }

    public static void enableScreenShotProtection(android.content.Context context) {
        int i = values;
        int i2 = (i | 35) << 1;
        int i3 = -((i & (-36)) | ((~i) & 35));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{context}, 405020615, -405020568, (int) java.lang.System.currentTimeMillis());
            int i5 = values;
            valueOf = ((-2) - (~(((i5 | 30) << 1) - (i5 ^ 30)))) % 128;
            return;
        }
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{context}, 405020615, -405020568, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    public static void disableScreenShotProtection(android.content.Context context) {
        int i = values;
        valueOf = ((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{context}, -648026999, 648027042, (int) java.lang.System.currentTimeMillis());
        int i2 = valueOf;
        int i3 = i2 & 119;
        int i4 = (i2 ^ 119) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        values = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static boolean checkSdkState() {
        int i = values;
        int i2 = (((i & (-96)) | ((~i) & 95)) - (~(-(-((i & 95) << 1))))) - 1;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return ((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1898861589, 1898861617, (int) java.lang.System.currentTimeMillis())).booleanValue();
        }
        throw null;
    }

    static void init$2() {
        $$g = new byte[]{106, 94, -55, -52};
        $$h = 79;
    }

    static void init$1() {
        $$d = new byte[]{0, Byte.MIN_VALUE, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 18, 4, -57, 72, -9, com.google.common.base.Ascii.RS, -18, 14, com.google.common.base.Ascii.SI, -62, 64, 1, 8, com.visa.cbp.getEncExpo.kernelVersion, 63, 4, com.google.common.base.Ascii.NAK, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -5, 7, -28, 36, 8, com.google.common.base.Ascii.VT, 3, -27, 43, com.google.common.base.Ascii.SI, -72, com.google.common.base.Ascii.SYN, 1, -3, 17, -9, -13, com.google.common.base.Ascii.EM, 17, 2, -5, 8, 8, 18, 4, -57, 69, -6, com.google.common.base.Ascii.CAN, 7, -9, 19, -9, 4, com.google.common.base.Ascii.ETB, -8, -48, 69, 9, 9, -9, 13, -55, 59, 4, com.google.common.base.Ascii.ETB, -8, -48, 72, 8, 3, -3, 9, 9, -1, com.visa.cbp.getEncExpo.kernelVersion, 43, com.google.common.base.Ascii.ETB, 13, -34, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 9, -7, -18, -4, 43, 7, 13, -39, 57, -3, -30, 48, 6, 8, -10, 19, -29, 39, 10, -5, com.google.common.base.Ascii.FF, 5, com.google.common.base.Ascii.VT, -36, 42, 9, 2, -15, 17, com.google.common.base.Ascii.SI, -10, com.google.common.base.Ascii.DC4, 18, 4, -57, 72, -9, com.google.common.base.Ascii.RS, -18, 14, com.google.common.base.Ascii.SI, -62, 64, 1, 8, com.visa.cbp.getEncExpo.kernelVersion, 59, com.google.common.base.Ascii.NAK, -7, 2, com.google.common.base.Ascii.EM, -9, -28, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 5, -2, 9, 4, com.google.common.base.Ascii.DC4, 3, -11, com.google.common.base.Ascii.EM, -5, com.google.common.base.Ascii.FF, 5, -37, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 5, com.google.common.base.Ascii.FF, -9, com.google.common.base.Ascii.EM, 2, 43, 4, 8, 17, -5, com.google.common.base.Ascii.ETB, -15, 5, -27, 36, com.google.common.base.Ascii.ETB, -8, -14, 40, 3, -3, 9, 9, -1, 18, 4, -57, 72, -9, com.google.common.base.Ascii.RS, -18, 14, com.google.common.base.Ascii.SI, -62, 64, 1, 8, com.visa.cbp.getEncExpo.kernelVersion, 65, 16, -26, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, -4, -22, 35, 2, 9, 7, 19, 7, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 14, -9, 19, 2, -7, com.google.common.base.Ascii.EM, -9, -28, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 5, com.google.common.base.Ascii.FF, -13, 8, com.google.common.base.Ascii.ETB, -2, -1, com.google.common.base.Ascii.DC4, 6, -29, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.RS, -6, -2, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, -42, 35, com.google.common.base.Ascii.EM, -13, -17, 47, 2, 5, 18, 4, -57, 72, -9, com.google.common.base.Ascii.RS, -18, 14, com.google.common.base.Ascii.SI, -62, 64, 1, 8, com.visa.cbp.getEncExpo.kernelVersion, 43, com.google.common.base.Ascii.ETB, 13, -34, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 9, -7, -18, -4, 43, 7, 13, -39, 57, -3, -30, 48, 6, 8, -10, 19, -29, 39, 10, -5, com.google.common.base.Ascii.FF, 5, com.google.common.base.Ascii.VT, -36, 42, 9, 2, -66, com.google.common.base.Ascii.NAK, 7};
        $$e = 211;
    }

    static void values() {
        DigitizedCardProfile = new int[]{-1229095547, 431101512, -317751093, -189247748, 88442455, 546358166, -1397899277, -1137925172, 1685975393, 721934033, -547973062, 1742425795, -1382249694, 1870140597, 1015715333, 536692879, -63543116, 1436821415};
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        valueOf = 0;
        values = 1;
        values();
        AlternateContactlessPaymentDataJson = new char[]{1491, 12331, 12344, 12350, 1489, 12297, 12334, 12338, 12323, 1492, 12329, 12388, 1490, 12324, 12335, 12325};
        writeReplace = (char) 1492;
        int i = values + 31;
        valueOf = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void init$0() {
        $$a = new byte[]{109, 99, -23, -23, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5, -19, 13, com.google.common.base.Ascii.VT, -14, 16, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, 19, 9, -38, 46, 5, -11, -34, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -22, 38, 5, -2, -19, 13, com.google.common.base.Ascii.VT, -14, -20, com.google.common.base.Ascii.EM, -3, -7, 13, -13, -17, com.google.common.base.Ascii.NAK, 13, -2, -9, 4, 4};
        $$b = 154;
    }
}
