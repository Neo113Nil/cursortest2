package com.payair.hce;

/* loaded from: classes4.dex */
final class setKeyboardNavigationCluster {
    private static int valueOf = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (i * (-381)) + (i2 * 192) + (i4 * (-191)) + ((i | (~(i2 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + (((~(i4 | i2)) | (~(i2 | (~i3)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
        if (i5 == 1) {
            return writeReplace(objArr);
        }
        if (i5 != 2) {
            return i5 != 3 ? DigitizedCardProfile(objArr) : values(objArr);
        }
        int i6 = writeReplace;
        valueOf = (((i6 | 31) << 1) - (i6 ^ 31)) % 128;
        java.lang.String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        int i7 = i6 & 99;
        int i8 = -(-((i6 ^ 99) | i7));
        valueOf = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
        boolean z = false;
        int i9 = 0;
        while (true) {
            if (i9 >= 8) {
                break;
            }
            java.lang.String str = strArr[i9];
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append("su");
            if (new java.io.File(sb.toString()).exists()) {
                int i10 = (valueOf + 93) % 128;
                writeReplace = i10;
                int i11 = i10 & 65;
                valueOf = ((((i10 ^ 65) | i11) << 1) - ((i10 | 65) & (~i11))) % 128;
                z = true;
                break;
            }
            int i12 = i9 - 33;
            int i13 = i12 & 34;
            i9 = ((i12 | 34) & (~i13)) + (i13 << 1);
            int i14 = writeReplace;
            int i15 = i14 & 99;
            int i16 = (i14 | 99) & (~i15);
            int i17 = -(-(i15 << 1));
            valueOf = ((i16 & i17) + (i16 | i17)) % 128;
        }
        int i18 = valueOf;
        writeReplace = (((i18 ^ 22) + ((i18 & 22) << 1)) - 1) % 128;
        return java.lang.Boolean.valueOf(z);
    }

    setKeyboardNavigationCluster() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0056, code lost:
    
        if (r2 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i = valueOf;
        writeReplace = ((((i ^ 49) | (i & 49)) << 1) - ((i & (-50)) | ((~i) & 49))) % 128;
        boolean booleanValue = ((java.lang.Boolean) values(new java.lang.Object[0], 750346361, -750346359, (int) java.lang.System.currentTimeMillis())).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) values(new java.lang.Object[0], -2082304091, 2082304094, (int) java.lang.System.currentTimeMillis())).booleanValue();
        if (!booleanValue) {
            int i2 = writeReplace;
            int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
            valueOf = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
        try {
            android.content.Intent parseUri = android.content.Intent.parseUri((java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 843987938, -843987922, (int) java.lang.System.currentTimeMillis()), 1);
            parseUri.addFlags(805306368);
            ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).startActivity(parseUri);
            int i4 = valueOf;
            int i5 = i4 & 41;
            int i6 = -(-(i4 | 41));
            writeReplace = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
            return null;
        } catch (java.lang.Exception unused) {
            int i7 = writeReplace;
            int i8 = i7 & 39;
            int i9 = i8 + ((i7 ^ 39) | i8);
            valueOf = i9 % 128;
            if (i9 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = valueOf;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i2 = ((i & (-72)) | ((~i) & 71)) + ((i & 71) << 1);
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = android.os.Build.TAGS;
        if (str != null) {
            int i3 = writeReplace + 61;
            valueOf = i3 % 128;
            if (i3 % 2 != 0) {
                str.contains("test-keys");
                throw null;
            }
            if (str.contains("test-keys")) {
                int i4 = valueOf;
                int i5 = i4 & 35;
                int i6 = -(-((i4 ^ 35) | i5));
                int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                writeReplace = i7 % 128;
                if (i7 % 2 != 0) {
                    return bool;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        if (new java.io.File("/system/app/Superuser.apk").exists()) {
            int i8 = writeReplace;
            int i9 = (i8 & (-118)) | ((~i8) & 117);
            int i10 = -(-((i8 & 117) << 1));
            int i11 = ((i9 & i10) + (i10 | i9)) % 128;
            valueOf = i11;
            writeReplace = (i11 + 99) % 128;
            return bool;
        }
        int i12 = writeReplace;
        valueOf = ((i12 & 95) + (i12 | 95)) % 128;
        if (!((java.lang.Boolean) values(new java.lang.Object[]{"/system/xbin/which su"}, 1300787652, -1300787651, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i13 = valueOf;
            int i14 = i13 ^ 13;
            int i15 = ((i13 & 13) | i14) << 1;
            int i16 = -i14;
            writeReplace = ((i15 & i16) + (i15 | i16)) % 128;
            if (!((java.lang.Boolean) values(new java.lang.Object[]{"/system/bin/which su"}, 1300787652, -1300787651, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                int i17 = writeReplace;
                valueOf = ((((i17 & (-90)) | ((~i17) & 89)) - (~(-(-((i17 & 89) << 1))))) - 1) % 128;
                if (!((java.lang.Boolean) values(new java.lang.Object[]{"which su"}, 1300787652, -1300787651, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                    int i18 = writeReplace;
                    int i19 = ((i18 | 79) << 1) - ((i18 & (-80)) | ((~i18) & 79));
                    valueOf = i19 % 128;
                    if (i19 % 2 == 0) {
                        return java.lang.Boolean.FALSE;
                    }
                    throw null;
                }
            }
        }
        int i20 = valueOf;
        int i21 = i20 & 23;
        writeReplace = (i21 + ((i20 ^ 23) | i21)) % 128;
        return bool;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        try {
            if (new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.Runtime.getRuntime().exec((java.lang.String) objArr[0]).getInputStream())).readLine() != null) {
                int i = valueOf;
                int i2 = (i ^ 75) + ((i & 75) << 1);
                int i3 = i2 % 128;
                writeReplace = i3;
                r0 = i2 % 2 != 0;
                valueOf = ((i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
            }
            valueOf = (writeReplace + 5) % 128;
        } catch (java.lang.Exception unused) {
        }
        int i4 = writeReplace;
        int i5 = i4 & 27;
        valueOf = (i5 + ((i4 ^ 27) | i5)) % 128;
        return java.lang.Boolean.valueOf(r0);
    }

    private static boolean AlternateContactlessPaymentDataJson(java.lang.String str) {
        return ((java.lang.Boolean) values(new java.lang.Object[]{str}, 1300787652, -1300787651, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    private static boolean values() {
        return ((java.lang.Boolean) values(new java.lang.Object[0], -2082304091, 2082304094, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    private static boolean DigitizedCardProfile() {
        return ((java.lang.Boolean) values(new java.lang.Object[0], 750346361, -750346359, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static void writeReplace() {
        values(new java.lang.Object[0], -1490299157, 1490299157, (int) java.lang.System.currentTimeMillis());
    }
}
