package com.payair.hce;

/* loaded from: classes4.dex */
public class onLowMemory implements com.payair.hce.hasVersionCheckFailed {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static long values;
    private com.payair.hce.checkPermission AlternateContactlessPaymentDataJson;
    private boolean DigitizedCardProfile;
    private com.payair.hce.checkForSuccess valueOf;
    private com.payair.hce.getOpPackageName writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.onLowMemory onlowmemory = (com.payair.hce.onLowMemory) objArr[0];
        int i4 = getAid;
        SdkCoreAlternateContactlessPaymentDataImpl = (i4 + 61) % 128;
        com.payair.hce.checkForSuccess checkforsuccess = onlowmemory.valueOf;
        SdkCoreAlternateContactlessPaymentDataImpl = (i4 + 69) % 128;
        return checkforsuccess;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 113 - s2;
        byte[] bArr = $$a;
        int i5 = 4 - (s * 4);
        int i6 = 1 - (i * 4);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i3 = 0;
            int i9 = i5 + i8;
            int i10 = i7 + 1;
            i2 = i3;
            i4 = i9;
            i5 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i5];
            int i11 = i4;
            i7 = i5;
            i5 = i11;
            int i92 = i5 + i8;
            int i102 = i7 + 1;
            i2 = i3;
            i4 = i92;
            i5 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    static /* synthetic */ com.payair.hce.getOpPackageName values(com.payair.hce.onLowMemory onlowmemory) {
        int i = (getAid + 13) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i;
        com.payair.hce.getOpPackageName getoppackagename = onlowmemory.writeReplace;
        int i2 = i + 31;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            return getoppackagename;
        }
        throw null;
    }

    public onLowMemory(com.payair.hce.checkForSuccess checkforsuccess, com.payair.hce.getOpPackageName getoppackagename, boolean z) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("麴ﻼ帒뿚ῧ缜", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24671, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.onLowMemory.class.getName());
        this.AlternateContactlessPaymentDataJson = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.valueOf = checkforsuccess;
        this.writeReplace = getoppackagename;
        this.DigitizedCardProfile = z;
    }

    @Override // com.payair.hce.hasVersionCheckFailed
    public final com.payair.hce.stopTransaction valueOf() {
        if (this.valueOf.getVersion() != com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson) {
            com.payair.hce.stopTransaction DigitizedCardProfile = com.payair.hce.getString.DigitizedCardProfile(this.valueOf.getContactlessPaymentData(), this.DigitizedCardProfile);
            SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 25) % 128;
            return DigitizedCardProfile;
        }
        int i = getAid + 81;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return com.payair.hce.getString.valueOf(this.valueOf.getContactlessPaymentData(), com.payair.hce.getNumberOfTransactionLogEntries.values, com.payair.hce.suspendCardForToken.DigitizedCardProfile, this.writeReplace.values(), this.DigitizedCardProfile);
        }
        com.payair.hce.getString.valueOf(this.valueOf.getContactlessPaymentData(), com.payair.hce.getNumberOfTransactionLogEntries.values, com.payair.hce.suspendCardForToken.DigitizedCardProfile, this.writeReplace.values(), this.DigitizedCardProfile);
        throw null;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 55) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        int i2 = $11 + 61;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 3;
        }
        while (getdsrpdata.valueOf < cArr2.length) {
            $11 = ($10 + 91) % 128;
            int i4 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, 1890 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (3600 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (values ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 64, android.text.TextUtils.indexOf("", "", 0) + 1443, (char) (29682 - android.graphics.Color.red(0)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((short) 0, 0, (short) 1, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
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
        char[] cArr3 = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            int i5 = $10 + 53;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.view.MotionEvent.axisFromString("") + 1444, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29682));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((short) 0, 0, (short) 1, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                throw null;
            }
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj4 == null) {
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.view.View.getDefaultSize(0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1443, (char) (android.view.View.MeasureSpec.getMode(0) + 29682));
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b((short) 0, 0, (short) 1, objArr9);
                obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.payair.hce.hasVersionCheckFailed
    public final com.payair.hce.unsuspendTokens values() {
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 117) % 128;
        if (this.valueOf.getVersion() != com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson) {
            return com.payair.hce.getForegroundServiceType.values(this.valueOf.getDsrpData());
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 31) % 128;
        return com.payair.hce.getForegroundServiceType.DigitizedCardProfile(this.valueOf.getDsrpData(), com.payair.hce.getNumberOfTransactionLogEntries.values, com.payair.hce.suspendCardForToken.DigitizedCardProfile, this.writeReplace.DigitizedCardProfile());
    }

    @Override // com.payair.hce.hasVersionCheckFailed
    public final com.payair.hce.updatePushToken writeReplace() {
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 7) % 128;
        com.payair.hce.updatePushToken valueOf = com.payair.hce.attachBaseContext.valueOf(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.valueOf.getDigitizedCardId()).writeReplace(), this.valueOf.getContactlessPaymentData(), this.valueOf.getVersion(), com.payair.hce.suspendCardForToken.DigitizedCardProfile);
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 99;
        getAid = i % 128;
        if (i % 2 != 0) {
            return valueOf;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.hasVersionCheckFailed
    public final com.payair.hce.setJWTToken DigitizedCardProfile() {
        com.payair.hce.setJWTToken setjwttoken = new com.payair.hce.setJWTToken() { // from class: com.payair.hce.onLowMemory.3
            private static int valueOf = 0;
            private static int values = 1;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i2;
                int i5 = ~i3;
                int i6 = i5 | i;
                int i7 = (i * 1773) + (i2 * (-885)) + (((~(i3 | i4)) | (~((~i) | i4)) | (~(i6 | i2))) * 886) + ((i | (~(i2 | i5))) * (-1772)) + ((~i6) * 886);
                if (i7 == 1) {
                    return values(objArr);
                }
                if (i7 == 2) {
                    return AlternateContactlessPaymentDataJson(objArr);
                }
                if (i7 != 3) {
                    return i7 != 4 ? DigitizedCardProfile(objArr) : valueOf(objArr);
                }
                com.payair.hce.onLowMemory.AnonymousClass3 anonymousClass3 = (com.payair.hce.onLowMemory.AnonymousClass3) objArr[0];
                int i8 = valueOf;
                values = ((((i8 & (-114)) | ((~i8) & 113)) - (~(-(-((i8 & 113) << 1))))) - 1) % 128;
                byte[] cardCountryCode = ((com.payair.hce.checkForSuccess) com.payair.hce.onLowMemory.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.onLowMemory.this}, -1959366047, 1959366047, (int) java.lang.System.currentTimeMillis())).getCardCountryCode();
                int i9 = valueOf;
                values = ((((i9 & (-120)) | ((~i9) & 119)) - (~((i9 & 119) << 1))) - 1) % 128;
                return cardCountryCode;
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                com.payair.hce.onLowMemory.AnonymousClass3 anonymousClass3 = (com.payair.hce.onLowMemory.AnonymousClass3) objArr[0];
                int i = values;
                int i2 = i & 37;
                valueOf = (((i | 37) & (~i2)) + (i2 << 1)) % 128;
                byte[] pan = ((com.payair.hce.checkForSuccess) com.payair.hce.onLowMemory.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.onLowMemory.this}, -1959366047, 1959366047, (int) java.lang.System.currentTimeMillis())).getPan();
                int i3 = values;
                int i4 = (i3 & 115) + (i3 | 115);
                valueOf = i4 % 128;
                if (i4 % 2 == 0) {
                    return pan;
                }
                throw null;
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                com.payair.hce.onLowMemory.AnonymousClass3 anonymousClass3 = (com.payair.hce.onLowMemory.AnonymousClass3) objArr[0];
                int i = values;
                int i2 = i & 37;
                int i3 = -(-((i ^ 37) | i2));
                int i4 = (i2 & i3) + (i3 | i2);
                valueOf = i4 % 128;
                if (i4 % 2 != 0) {
                    ((com.payair.hce.checkForSuccess) com.payair.hce.onLowMemory.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.onLowMemory.this}, -1959366047, 1959366047, (int) java.lang.System.currentTimeMillis())).getVersion();
                    com.payair.hce.getStatusCodeFromServer getstatuscodefromserver = com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson;
                    throw null;
                }
                if (((com.payair.hce.checkForSuccess) com.payair.hce.onLowMemory.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.onLowMemory.this}, -1959366047, 1959366047, (int) java.lang.System.currentTimeMillis())).getVersion() == com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson) {
                    int i5 = valueOf;
                    int i6 = i5 & 79;
                    int i7 = (((i5 | 79) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
                    values = i7 % 128;
                    if (i7 % 2 != 0) {
                        return com.payair.hce.onLowMemory.values(com.payair.hce.onLowMemory.this).AlternateContactlessPaymentDataJson();
                    }
                    com.payair.hce.onLowMemory.values(com.payair.hce.onLowMemory.this).AlternateContactlessPaymentDataJson();
                    throw null;
                }
                int i8 = com.payair.hce.onLowMemory.AnonymousClass2.AlternateContactlessPaymentDataJson[((com.payair.hce.checkForSuccess) com.payair.hce.onLowMemory.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.onLowMemory.this}, -1959366047, 1959366047, (int) java.lang.System.currentTimeMillis())).getWalletData().getAccountType().ordinal()];
                if (i8 == 1) {
                    com.payair.hce.isLocallyVerified islocallyverified = com.payair.hce.isLocallyVerified.AlternateContactlessPaymentDataJson;
                    int i9 = valueOf;
                    int i10 = ((i9 ^ 113) | (i9 & 113)) << 1;
                    int i11 = -((i9 & (-114)) | ((~i9) & 113));
                    values = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
                    return islocallyverified;
                }
                if (i8 == 2) {
                    com.payair.hce.isLocallyVerified islocallyverified2 = com.payair.hce.isLocallyVerified.valueOf;
                    int i12 = valueOf;
                    values = (((i12 ^ 68) + ((i12 & 68) << 1)) - 1) % 128;
                    return islocallyverified2;
                }
                com.payair.hce.isLocallyVerified islocallyverified3 = com.payair.hce.isLocallyVerified.writeReplace;
                int i13 = values;
                int i14 = ((i13 ^ 7) | (i13 & 7)) << 1;
                int i15 = -((i13 & (-8)) | ((~i13) & 7));
                valueOf = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
                return islocallyverified3;
            }

            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                com.payair.hce.onLowMemory.AnonymousClass3 anonymousClass3 = (com.payair.hce.onLowMemory.AnonymousClass3) objArr[0];
                int i = valueOf;
                int i2 = i & 93;
                int i3 = -(-((i ^ 93) | i2));
                int i4 = (i2 & i3) + (i3 | i2);
                values = i4 % 128;
                if (i4 % 2 == 0) {
                    ((com.payair.hce.checkForSuccess) com.payair.hce.onLowMemory.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.onLowMemory.this}, -1959366047, 1959366047, (int) java.lang.System.currentTimeMillis())).getVersion();
                    com.payair.hce.getStatusCodeFromServer getstatuscodefromserver = com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson;
                    throw new java.lang.ArithmeticException();
                }
                if (((com.payair.hce.checkForSuccess) com.payair.hce.onLowMemory.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.onLowMemory.this}, -1959366047, 1959366047, (int) java.lang.System.currentTimeMillis())).getVersion() == com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson) {
                    com.payair.hce.checkDeviceUnlockKeys valueOf2 = com.payair.hce.onLowMemory.values(com.payair.hce.onLowMemory.this).valueOf();
                    int i5 = values;
                    int i6 = i5 & 49;
                    int i7 = (i6 - (~(-(-((i5 ^ 49) | i6))))) - 1;
                    valueOf = i7 % 128;
                    if (i7 % 2 == 0) {
                        return valueOf2;
                    }
                    throw null;
                }
                int i8 = com.payair.hce.onLowMemory.AnonymousClass2.DigitizedCardProfile[((com.payair.hce.checkForSuccess) com.payair.hce.onLowMemory.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.onLowMemory.this}, -1959366047, 1959366047, (int) java.lang.System.currentTimeMillis())).getWalletData().getProductType().ordinal()];
                if (i8 == 1) {
                    com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys = com.payair.hce.checkDeviceUnlockKeys.valueOf;
                    int i9 = valueOf;
                    int i10 = (i9 & (-40)) | ((~i9) & 39);
                    int i11 = -(-((i9 & 39) << 1));
                    values = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
                    return checkdeviceunlockkeys;
                }
                if (i8 == 2) {
                    com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys2 = com.payair.hce.checkDeviceUnlockKeys.DigitizedCardProfile;
                    int i12 = values;
                    int i13 = i12 & 29;
                    int i14 = (i12 ^ 29) | i13;
                    int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                    valueOf = i15 % 128;
                    if (i15 % 2 == 0) {
                        return checkdeviceunlockkeys2;
                    }
                    throw null;
                }
                if (i8 == 3) {
                    com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys3 = com.payair.hce.checkDeviceUnlockKeys.writeReplace;
                    int i16 = values;
                    int i17 = i16 ^ 125;
                    int i18 = ((i16 & 125) | i17) << 1;
                    int i19 = -i17;
                    valueOf = ((i18 & i19) + (i18 | i19)) % 128;
                    return checkdeviceunlockkeys3;
                }
                if (i8 != 4) {
                    com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys4 = com.payair.hce.checkDeviceUnlockKeys.values;
                    int i20 = values;
                    int i21 = (i20 & (-90)) | ((~i20) & 89);
                    int i22 = -(-((i20 & 89) << 1));
                    valueOf = ((i21 & i22) + (i22 | i21)) % 128;
                    return checkdeviceunlockkeys4;
                }
                com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys5 = com.payair.hce.checkDeviceUnlockKeys.AlternateContactlessPaymentDataJson;
                int i23 = values;
                int i24 = ((i23 ^ 101) | (i23 & 101)) << 1;
                int i25 = -((i23 & (-102)) | ((~i23) & 101));
                valueOf = ((i24 & i25) + (i25 | i24)) % 128;
                return checkdeviceunlockkeys5;
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                com.payair.hce.onLowMemory.AnonymousClass3 anonymousClass3 = (com.payair.hce.onLowMemory.AnonymousClass3) objArr[0];
                int i = valueOf + 9;
                values = i % 128;
                if (i % 2 != 0) {
                    if (((com.payair.hce.checkForSuccess) com.payair.hce.onLowMemory.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.onLowMemory.this}, -1959366047, 1959366047, (int) java.lang.System.currentTimeMillis())).getVersion() != com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson) {
                        boolean isTransactionIdRequired = ((com.payair.hce.checkForSuccess) com.payair.hce.onLowMemory.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.onLowMemory.this}, -1959366047, 1959366047, (int) java.lang.System.currentTimeMillis())).isTransactionIdRequired();
                        int i2 = values;
                        int i3 = i2 ^ 19;
                        int i4 = -(-((i2 & 19) << 1));
                        valueOf = ((i3 & i4) + (i4 | i3)) % 128;
                        return java.lang.Boolean.valueOf(isTransactionIdRequired);
                    }
                    int i5 = valueOf;
                    values = ((i5 ^ 15) + ((i5 & 15) << 1)) % 128;
                    int i6 = i5 & 69;
                    int i7 = ((i5 | 69) & (~i6)) + (i6 << 1);
                    values = i7 % 128;
                    if (i7 % 2 != 0) {
                        return java.lang.Boolean.TRUE;
                    }
                    throw null;
                }
                ((com.payair.hce.checkForSuccess) com.payair.hce.onLowMemory.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.onLowMemory.this}, -1959366047, 1959366047, (int) java.lang.System.currentTimeMillis())).getVersion();
                com.payair.hce.getStatusCodeFromServer getstatuscodefromserver = com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson;
                throw null;
            }

            @Override // com.payair.hce.setJWTToken
            public final boolean valueOf() {
                return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -1039623174, 1039623178, java.lang.System.identityHashCode(this))).booleanValue();
            }

            @Override // com.payair.hce.setJWTToken
            public final com.payair.hce.checkDeviceUnlockKeys values() {
                return (com.payair.hce.checkDeviceUnlockKeys) DigitizedCardProfile(new java.lang.Object[]{this}, 1422929823, -1422929822, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.setJWTToken
            public final com.payair.hce.isLocallyVerified AlternateContactlessPaymentDataJson() {
                return (com.payair.hce.isLocallyVerified) DigitizedCardProfile(new java.lang.Object[]{this}, -1101250, 1101250, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.setJWTToken
            public final byte[] writeReplace() {
                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -538058657, 538058659, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.setJWTToken
            public final byte[] DigitizedCardProfile() {
                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 1651592873, -1651592870, java.lang.System.identityHashCode(this));
            }
        };
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 1) % 128;
        return setjwttoken;
    }

    /* renamed from: com.payair.hce.onLowMemory$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AlternateContactlessPaymentDataJson;
        static final /* synthetic */ int[] DigitizedCardProfile;
        private static int valueOf = 1;
        private static int values;

        static {
            int[] iArr = new int[com.payair.hce.setjSONObject.values().length];
            DigitizedCardProfile = iArr;
            try {
                iArr[com.payair.hce.setjSONObject.valueOf.ordinal()] = 1;
                int i = values;
                int i2 = ((i & 121) - (~(-(-(i | 121))))) - 1;
                valueOf = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.setjSONObject.writeReplace.ordinal()] = 2;
                int i4 = valueOf;
                int i5 = i4 & 97;
                int i6 = (((i4 | 97) & (~i5)) - (~(-(-(i5 << 1))))) - 1;
                values = i6 % 128;
                int i7 = i6 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.setjSONObject.DigitizedCardProfile.ordinal()] = 3;
                int i8 = values;
                int i9 = (i8 & 31) + (i8 | 31);
                valueOf = i9 % 128;
                int i10 = i9 % 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.setjSONObject.AlternateContactlessPaymentDataJson.ordinal()] = 4;
                int i11 = valueOf + 51;
                values = i11 % 128;
                int i12 = i11 % 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.payair.hce.getjSONObject.values().length];
            AlternateContactlessPaymentDataJson = iArr2;
            try {
                iArr2[com.payair.hce.getjSONObject.values.ordinal()] = 1;
                int i13 = valueOf;
                int i14 = (i13 & (-32)) | ((~i13) & 31);
                int i15 = -(-((i13 & 31) << 1));
                values = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.getjSONObject.AlternateContactlessPaymentDataJson.ordinal()] = 2;
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i16 = ~currentTimeMillis;
                int i17 = (currentTimeMillis | i16) & i16;
                int i18 = i17 & (-1397980150);
                int i19 = ((i17 | (-1397980150)) & (~i18)) | i18;
                int i20 = ~i19;
                int i21 = (i19 | i20) & i20;
                int i22 = i21 ^ (-2004352000);
                int i23 = i21 & (-2004352000);
                int i24 = ((i23 ^ i22) | (i23 & i22)) * (-970);
                int i25 = (i24 ^ (-390224259)) + ((i24 & (-390224259)) << 1);
                int i26 = i25 & (-1992852716);
                int i27 = (((-1992852716) | i25) & (~i26)) + (i26 << 1);
                int i28 = i16 ^ (-1397980150);
                int i29 = i16 & (-1397980150);
                int i30 = ~((i29 ^ i28) | (i29 & i28));
                int i31 = i30 & 606371850;
                int i32 = (i30 | 606371850) & (~i31);
                int i33 = ((i32 ^ i31) | (i32 & i31)) * 970;
                int i34 = ((~i33) & i27) | ((~i27) & i33);
                int i35 = (i27 & i33) << 1;
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i36 = currentTimeMillis2 & (-657965741);
                int i37 = ((-657965741) | currentTimeMillis2) & (~i36);
                int i38 = -(~((~((i37 ^ i36) | (i37 & i36))) * (-301)));
                int i39 = (-2) - (~((i38 & 834261904) + (i38 | 834261904)));
                int i40 = currentTimeMillis2 & 926402477;
                int i41 = (~i40) & (currentTimeMillis2 | 926402477);
                int i42 = ~currentTimeMillis2;
                int i43 = ~((i40 ^ i41) | (i40 & i41));
                int i44 = i42 & 1355289857;
                int i45 = (1355289857 | i42) & (~i44);
                int i46 = (i45 ^ i44) | (i45 & i44);
                int i47 = ~i46;
                int i48 = (i46 | i47) & i47;
                int i49 = i43 ^ i48;
                int i50 = i43 & i48;
                int i51 = -(~(((i50 ^ i49) | (i50 & i49)) * (-301)));
                int i52 = (((i39 | i51) << 1) - (i39 ^ i51)) - 1;
                int i53 = currentTimeMillis2 & (-1355289858);
                int i54 = (currentTimeMillis2 | (-1355289858)) & (~i53);
                int i55 = (i54 ^ i53) | (i54 & i53);
                int i56 = ~i55;
                int i57 = -(~((((i55 | i56) & i56) | 926402477) * 301));
                if (((i34 | i35) << 1) - (i35 ^ i34) > (((i52 | i57) << 1) - (i57 ^ i52)) - 1) {
                    throw new java.lang.ArithmeticException();
                }
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getAid = 1;
        values = 8288075734477957231L;
    }

    static void init$0() {
        $$a = new byte[]{88, -59, 41, 44};
        $$b = 49;
    }

    static /* synthetic */ com.payair.hce.checkForSuccess valueOf(com.payair.hce.onLowMemory onlowmemory) {
        return (com.payair.hce.checkForSuccess) DigitizedCardProfile(new java.lang.Object[]{onlowmemory}, -1959366047, 1959366047, (int) java.lang.System.currentTimeMillis());
    }
}
