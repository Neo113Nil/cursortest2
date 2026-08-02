package com.payair.hce;

/* loaded from: classes4.dex */
public final class moveSharedPreferencesFrom implements com.payair.hce.deleteSharedPreferences, java.lang.Runnable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreCardRiskManagementDataImpl;
    private static char[] getApplicationLifeCycleData;
    private static int getCardLayoutDescription;
    private static int getCardholderValidators;
    private static boolean getCvmResetTimeout;
    private static boolean getDualTapResetTimeout;
    private com.payair.hce.sendStickyOrderedBroadcastAsUser AlternateContactlessPaymentDataJson;
    private com.payair.hce.sendOrderedBroadcast DigitizedCardProfile;
    private com.payair.hce.getDatabasePath IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.deleteDatabase RecordsJson;
    private com.payair.hce.getPackageCodePath SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.sendStickyBroadcast SdkCoreBusinessLogicModuleImpl;
    private com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData getAid;
    private com.payair.hce.getExternalFilesDirs getCiacDecline;
    private android.os.HandlerThread getGpoResponse;
    private java.lang.String getProfileVersion;
    private boolean getSecurityWord;
    private com.payair.hce.getPackageResourcePath values;
    private java.lang.String writeReplace;
    private final com.payair.hce.checkPermission getPaymentFci = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
    private int valueOf = com.payair.hce.moveSharedPreferencesFrom.valueOf.writeReplace;
    private int getCvrMaskAnd = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class valueOf {
        private static int AlternateContactlessPaymentDataJson = 0;
        private static int valueOf = 61;
        public static final int values = 1;
        public static final int writeReplace = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 118 - (b * 3);
        int i4 = b2 * 4;
        byte[] bArr = $$a;
        int i5 = 4 - (i * 4);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i3 += i7;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i5];
            i3 += i7;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        return ((((i * 960) + (i2 * (-1917))) + (((~(i4 | i5)) | (~(i | i3))) * 959)) + (i4 * (-959))) + (((~(i | i5)) | (~(i4 | i3))) * 959) != 1 ? values(objArr) : writeReplace(objArr);
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class values {
        private static int AlternateContactlessPaymentDataJson = 19;
        private static int DigitizedCardProfile = 0;
        public static final int valueOf = 1;
        public static final int writeReplace = 2;

        static {
            int i = 19 % 2;
        }
    }

    public moveSharedPreferencesFrom(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast, java.lang.String str, com.payair.hce.sendStickyOrderedBroadcastAsUser sendstickyorderedbroadcastasuser, com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData cmsDSessionData) {
        this.DigitizedCardProfile = sendorderedbroadcast;
        this.writeReplace = str;
        this.AlternateContactlessPaymentDataJson = sendstickyorderedbroadcastasuser;
        this.getAid = cmsDSessionData;
        this.values = new com.payair.hce.getPackageResourcePath(str, cmsDSessionData);
        this.SdkCoreAlternateContactlessPaymentDataImpl = new com.payair.hce.getPackageCodePath(this.DigitizedCardProfile, this.values);
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        int i2 = $10 + 105;
        $11 = i2 % 128;
        byte[] bArr = str3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            byte[] bytes = str3.getBytes("ISO-8859-1");
            $11 = ($10 + 67) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = getApplicationLifeCycleData;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                $10 = ($11 + 97) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 46, android.text.TextUtils.getOffsetBefore("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getCardLayoutDescription)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.graphics.Color.green(0), 287 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (46337 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getCvmResetTimeout) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $11 = ($10 + 37) % 128;
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.graphics.Color.green(0), android.view.KeyEvent.keyCodeFromString("") + 1629, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, 0, (byte) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!getDualTapResetTimeout) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            $10 = ($11 + 89) % 128;
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.KeyEvent.normalizeMetaState(0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1629, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((byte) 0, 0, (byte) 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            $11 = ($10 + 79) % 128;
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        int i = SdkCoreCardRiskManagementDataImpl + 97;
        int i2 = i % 128;
        getCardholderValidators = i2;
        if (i % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.writeReplace;
        int i3 = i2 + 9;
        SdkCoreCardRiskManagementDataImpl = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void writeReplace(java.lang.String str) {
        int i = SdkCoreCardRiskManagementDataImpl + 99;
        int i2 = i % 128;
        getCardholderValidators = i2;
        if (i % 2 != 0) {
            this.writeReplace = str;
            int i3 = i2 + 27;
            SdkCoreCardRiskManagementDataImpl = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.writeReplace = str;
        throw null;
    }

    public final int values() {
        SdkCoreCardRiskManagementDataImpl = (getCardholderValidators + 19) % 128;
        if (this.getSecurityWord) {
            return com.payair.hce.moveSharedPreferencesFrom.values.writeReplace;
        }
        if (!this.values.values()) {
            return com.payair.hce.moveSharedPreferencesFrom.values.writeReplace;
        }
        int i = getCardholderValidators + 59;
        SdkCoreCardRiskManagementDataImpl = i % 128;
        int i2 = com.payair.hce.moveSharedPreferencesFrom.values.valueOf;
        if (i % 2 == 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final int DigitizedCardProfile() {
        int i = SdkCoreCardRiskManagementDataImpl;
        getCardholderValidators = (i + 37) % 128;
        int i2 = this.valueOf;
        int i3 = i + 43;
        getCardholderValidators = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.moveSharedPreferencesFrom movesharedpreferencesfrom = (com.payair.hce.moveSharedPreferencesFrom) objArr[0];
        int i = (SdkCoreCardRiskManagementDataImpl + 51) % 128;
        getCardholderValidators = i;
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData cmsDSessionData = movesharedpreferencesfrom.getAid;
        int i2 = i + 33;
        SdkCoreCardRiskManagementDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            return cmsDSessionData;
        }
        throw null;
    }

    public final void values(com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData cmsDSessionData) {
        SdkCoreCardRiskManagementDataImpl = (getCardholderValidators + 69) % 128;
        if (cmsDSessionData != null) {
            this.getAid = cmsDSessionData;
            com.payair.hce.getPackageResourcePath getpackageresourcepath = new com.payair.hce.getPackageResourcePath(this.writeReplace, this.getAid);
            this.values = getpackageresourcepath;
            this.SdkCoreAlternateContactlessPaymentDataImpl.valueOf(getpackageresourcepath);
        }
        int i = getCardholderValidators + 47;
        SdkCoreCardRiskManagementDataImpl = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final void valueOf() {
        int i = (getCardholderValidators + 65) % 128;
        SdkCoreCardRiskManagementDataImpl = i;
        this.getSecurityWord = true;
        getCardholderValidators = (i + 91) % 128;
    }

    @Override // com.payair.hce.deleteSharedPreferences
    public final void valueOf(com.payair.hce.getDatabasePath getdatabasepath) {
        int i = getCardholderValidators + 49;
        SdkCoreCardRiskManagementDataImpl = i % 128;
        if (i % 2 == 0) {
            this.AlternateContactlessPaymentDataJson.values(getdatabasepath);
        } else {
            this.AlternateContactlessPaymentDataJson.values(getdatabasepath);
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: com.payair.hce.moveSharedPreferencesFrom$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AlternateContactlessPaymentDataJson;
        private static int valueOf = 0;
        static final /* synthetic */ int[] values;
        private static int writeReplace = 1;

        static {
            int[] iArr = new int[((int[]) com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 1427773450, -1427773450, (int) java.lang.System.currentTimeMillis())).length];
            AlternateContactlessPaymentDataJson = iArr;
            try {
                int i = com.payair.hce.sendOrderedBroadcastAsUser.writeReplace;
                iArr[0] = 1;
                int i2 = valueOf;
                writeReplace = ((i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = AlternateContactlessPaymentDataJson;
                int i3 = com.payair.hce.sendOrderedBroadcastAsUser.valueOf;
                iArr2[2] = 2;
                int i4 = valueOf;
                int i5 = i4 & 27;
                int i6 = (i5 - (~(-(-((i4 ^ 27) | i5))))) - 1;
                writeReplace = i6 % 128;
                int i7 = i6 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = AlternateContactlessPaymentDataJson;
                int i8 = com.payair.hce.sendOrderedBroadcastAsUser.values;
                iArr3[1] = 3;
                writeReplace = (valueOf + 109) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = AlternateContactlessPaymentDataJson;
                int i9 = com.payair.hce.sendOrderedBroadcastAsUser.DigitizedCardProfile;
                iArr4[3] = 4;
                int i10 = valueOf;
                int i11 = ((i10 ^ 121) | (i10 & 121)) << 1;
                int i12 = -((i10 & (-122)) | ((~i10) & 121));
                writeReplace = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = AlternateContactlessPaymentDataJson;
                int i13 = com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson;
                iArr5[4] = 5;
                valueOf = (writeReplace + 35) % 128;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = AlternateContactlessPaymentDataJson;
                int i14 = com.payair.hce.sendOrderedBroadcastAsUser.getAid;
                iArr6[5] = 6;
                int i15 = valueOf;
                int i16 = ((i15 & (-82)) | ((~i15) & 81)) + ((i15 & 81) << 1);
                writeReplace = i16 % 128;
                int i17 = i16 % 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = AlternateContactlessPaymentDataJson;
                int i18 = com.payair.hce.sendOrderedBroadcastAsUser.getProfileVersion;
                iArr7[6] = 7;
                int i19 = writeReplace;
                int i20 = i19 & 105;
                valueOf = (i20 + ((i19 ^ 105) | i20)) % 128;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = AlternateContactlessPaymentDataJson;
                int i21 = com.payair.hce.sendOrderedBroadcastAsUser.IccPrivateKeyCrtComponentsJson;
                iArr8[7] = 8;
                int i22 = valueOf + 81;
                writeReplace = i22 % 128;
                int i23 = i22 % 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = AlternateContactlessPaymentDataJson;
                int i24 = com.payair.hce.sendOrderedBroadcastAsUser.RecordsJson;
                iArr9[8] = 9;
                int i25 = writeReplace;
                int i26 = (((i25 | 92) << 1) - (i25 ^ 92)) - 1;
                valueOf = i26 % 128;
                int i27 = i26 % 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = AlternateContactlessPaymentDataJson;
                int i28 = com.payair.hce.sendOrderedBroadcastAsUser.SdkCoreAlternateContactlessPaymentDataImpl;
                iArr10[9] = 10;
                int i29 = valueOf;
                writeReplace = ((i29 ^ 83) + ((i29 & 83) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = AlternateContactlessPaymentDataJson;
                int i30 = com.payair.hce.sendOrderedBroadcastAsUser.getPaymentFci;
                iArr11[10] = 11;
                int i31 = writeReplace;
                int i32 = ((i31 ^ 121) | (i31 & 121)) << 1;
                int i33 = -((i31 & (-122)) | ((~i31) & 121));
                valueOf = ((i32 ^ i33) + ((i33 & i32) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = AlternateContactlessPaymentDataJson;
                int i34 = com.payair.hce.sendOrderedBroadcastAsUser.getCvrMaskAnd;
                iArr12[11] = 12;
                int i35 = valueOf;
                writeReplace = ((-2) - (~((i35 & 78) + (i35 | 78)))) % 128;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                int[] iArr13 = AlternateContactlessPaymentDataJson;
                int i36 = com.payair.hce.sendOrderedBroadcastAsUser.getGpoResponse;
                iArr13[12] = 13;
                int i37 = writeReplace;
                int i38 = (i37 & (-16)) | ((~i37) & 15);
                int i39 = (i37 & 15) << 1;
                int i40 = (i38 & i39) + (i39 | i38);
                valueOf = i40 % 128;
                int i41 = i40 % 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            int[] iArr14 = new int[com.payair.hce.sendStickyBroadcast.values().length];
            values = iArr14;
            try {
                iArr14[com.payair.hce.sendStickyBroadcast.DigitizedCardProfile.ordinal()] = 1;
                int i42 = writeReplace;
                int i43 = i42 & 9;
                int i44 = -(-((9 ^ i42) | i43));
                valueOf = (((i43 | i44) << 1) - (i44 ^ i43)) % 128;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                values[com.payair.hce.sendStickyBroadcast.values.ordinal()] = 2;
                int i45 = valueOf;
                int i46 = i45 & 87;
                int i47 = (i45 | 87) & (~i46);
                int i48 = -(-(i46 << 1));
                writeReplace = (((i47 | i48) << 1) - (i47 ^ i48)) % 128;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.moveSharedPreferencesFrom movesharedpreferencesfrom = (com.payair.hce.moveSharedPreferencesFrom) objArr[0];
        com.payair.hce.getDatabasePath getdatabasepath = (com.payair.hce.getDatabasePath) objArr[1];
        int i = getCardholderValidators + 89;
        SdkCoreCardRiskManagementDataImpl = i % 128;
        if (i % 2 == 0) {
            android.os.HandlerThread handlerThread = movesharedpreferencesfrom.getGpoResponse;
            if (handlerThread != null && handlerThread.isAlive()) {
                int i2 = SdkCoreCardRiskManagementDataImpl + 81;
                getCardholderValidators = i2 % 128;
                if (i2 % 2 != 0) {
                    movesharedpreferencesfrom.getGpoResponse.quitSafely();
                    movesharedpreferencesfrom.getGpoResponse = null;
                } else {
                    movesharedpreferencesfrom.getGpoResponse.quitSafely();
                    movesharedpreferencesfrom.getGpoResponse = null;
                    throw null;
                }
            }
            movesharedpreferencesfrom.getCvrMaskAnd = -1;
            movesharedpreferencesfrom.RecordsJson = null;
            int i3 = com.payair.hce.moveSharedPreferencesFrom.AnonymousClass2.AlternateContactlessPaymentDataJson[((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() - 1];
            if (i3 == 1 || i3 == 2) {
                movesharedpreferencesfrom.valueOf(getdatabasepath, true);
                return null;
            }
            if (i3 == 3 || i3 == 4) {
                movesharedpreferencesfrom.valueOf = com.payair.hce.moveSharedPreferencesFrom.valueOf.writeReplace;
                int i4 = com.payair.hce.moveSharedPreferencesFrom.AnonymousClass2.values[movesharedpreferencesfrom.SdkCoreBusinessLogicModuleImpl.ordinal()];
                if (i4 == 1) {
                    movesharedpreferencesfrom.AlternateContactlessPaymentDataJson.DigitizedCardProfile(movesharedpreferencesfrom.IccPrivateKeyCrtComponentsJson);
                } else if (i4 == 2) {
                    movesharedpreferencesfrom.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(movesharedpreferencesfrom.IccPrivateKeyCrtComponentsJson);
                }
                movesharedpreferencesfrom.SdkCoreBusinessLogicModuleImpl = null;
                movesharedpreferencesfrom.IccPrivateKeyCrtComponentsJson = null;
                return null;
            }
            movesharedpreferencesfrom.valueOf = com.payair.hce.moveSharedPreferencesFrom.valueOf.writeReplace;
            movesharedpreferencesfrom.AlternateContactlessPaymentDataJson.DigitizedCardProfile(getdatabasepath);
            return null;
        }
        android.os.HandlerThread handlerThread2 = movesharedpreferencesfrom.getGpoResponse;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02b7  */
    @Override // com.payair.hce.deleteSharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeReplace(com.payair.hce.getDatabasePath getdatabasepath, int i) {
        boolean z;
        getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 37) % 128;
        android.os.HandlerThread handlerThread = this.getGpoResponse;
        if (handlerThread != null && handlerThread.isAlive()) {
            int i2 = getCardholderValidators + 75;
            SdkCoreCardRiskManagementDataImpl = i2 % 128;
            if (i2 % 2 == 0) {
                this.getGpoResponse.quitSafely();
                this.getGpoResponse = null;
                getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 11) % 128;
            } else {
                this.getGpoResponse.quitSafely();
                this.getGpoResponse = null;
                throw null;
            }
        }
        if (((java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath))) != null && (((java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath))) instanceof com.payair.hce.VisaReperso)) {
            int i3 = SdkCoreCardRiskManagementDataImpl + 9;
            getCardholderValidators = i3 % 128;
            if (i3 % 2 != 0) {
                java.lang.String writeReplace = ((com.payair.hce.VisaReperso) ((java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath)))).writeReplace();
                int hashCode = writeReplace.hashCode();
                if (hashCode != -262388298) {
                    if (hashCode == 1141576252) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        a(127 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), null, null, "\u008a\u0082\u0089\u0083\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0081\u0081\u0082\u0081", objArr);
                        if (writeReplace.equals(((java.lang.String) objArr[0]).intern())) {
                            z = false;
                            if (z) {
                                this.valueOf = com.payair.hce.moveSharedPreferencesFrom.valueOf.writeReplace;
                                this.AlternateContactlessPaymentDataJson.writeReplace(getdatabasepath);
                                this.getCvrMaskAnd = -1;
                                this.RecordsJson = null;
                                this.getSecurityWord = true;
                                return;
                            }
                            if (z) {
                                this.getCvrMaskAnd++;
                                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.DigitizedCardProfile;
                                int i4 = this.getCvrMaskAnd;
                                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.DigitizedCardProfile;
                                if (i4 < ((com.payair.hce.copydefault) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, -291991814, 291991815, java.lang.System.identityHashCode(sendorderedbroadcast2))).writeReplace()) {
                                    int i5 = SdkCoreCardRiskManagementDataImpl + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                    getCardholderValidators = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        throw null;
                                    }
                                    int i6 = i;
                                    if (i6 == -1) {
                                        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = this.DigitizedCardProfile;
                                        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast4 = this.DigitizedCardProfile;
                                        i6 = ((com.payair.hce.copydefault) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast4}, -291991814, 291991815, java.lang.System.identityHashCode(sendorderedbroadcast4))).DigitizedCardProfile()[this.getCvrMaskAnd] * 1000;
                                    }
                                    if (this.getCiacDecline.values() == com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson) {
                                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                                        a(127 - android.view.Gravity.getAbsoluteGravity(0, 0), null, null, "\u009a\u0096\u0091\u009c\u009d\u008b\u009c\u0091\u009b\u009a\u0097\u0096\u0099\u0094\u0097\u0091\u0092\u0091\u0098\u0096\u0097\u0096\u0095\u0091\u0094\u0093\u0092\u0091\u0089", objArr2);
                                        android.os.HandlerThread handlerThread2 = new android.os.HandlerThread(((java.lang.String) objArr2[0]).intern());
                                        this.getGpoResponse = handlerThread2;
                                        handlerThread2.start();
                                        new android.os.Handler(this.getGpoResponse.getLooper()).postDelayed(this, i6);
                                        return;
                                    }
                                    DigitizedCardProfile(this.RecordsJson, i6);
                                    this.getProfileVersion = this.RecordsJson.valueOf();
                                    return;
                                }
                                this.getProfileVersion = null;
                                this.getCvrMaskAnd = -1;
                                this.RecordsJson = null;
                                this.getCiacDecline = null;
                                int i7 = com.payair.hce.moveSharedPreferencesFrom.AnonymousClass2.AlternateContactlessPaymentDataJson[((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() - 1];
                                if (i7 == 1 || i7 == 2) {
                                    valueOf(getdatabasepath, false);
                                    return;
                                }
                                if (i7 == 3 || i7 == 4) {
                                    this.valueOf = com.payair.hce.moveSharedPreferencesFrom.valueOf.writeReplace;
                                    com.payair.hce.getDatabasePath getdatabasepath2 = this.IccPrivateKeyCrtComponentsJson;
                                    com.payair.hce.fileList filelist = (com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath2}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath2));
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    a(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, null, null, "\u008a\u0082\u008e\u0082\u008f\u0085\u008d\u008f", objArr3);
                                    com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist, ((java.lang.String) objArr3[0]).intern()}, -149929902, 149929905, java.lang.System.identityHashCode(filelist));
                                    com.payair.hce.getDatabasePath getdatabasepath3 = this.IccPrivateKeyCrtComponentsJson;
                                    com.payair.hce.fileList filelist2 = (com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath3}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath3));
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    a(127 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), null, null, "¥\u009a\u0091\u009b\u009b\u0091 \u0097\u0096 \u009e\u0097\u0091\u0091¤\u009e£\u0096\u009d\u009e\u0097\u0093¢\u0094¡ \u0091\u009f\u0091\u009e\u0083\u0088\u008d", objArr4);
                                    com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist2, ((java.lang.String) objArr4[0]).intern()}, -403792301, 403792301, java.lang.System.identityHashCode(filelist2));
                                    this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(this.IccPrivateKeyCrtComponentsJson);
                                    return;
                                }
                                this.valueOf = com.payair.hce.moveSharedPreferencesFrom.valueOf.writeReplace;
                                com.payair.hce.fileList filelist3 = (com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath));
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                a(127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), null, null, "\u008a\u0082\u008e\u0082\u008f\u0085\u008d\u008f", objArr5);
                                com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist3, ((java.lang.String) objArr5[0]).intern()}, -149929902, 149929905, java.lang.System.identityHashCode(filelist3));
                                com.payair.hce.fileList filelist4 = (com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath));
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                a(android.text.TextUtils.indexOf("", "") + 127, null, null, "¥\u009a\u0091\u009b\u009b\u0091 \u0097\u0096 \u009e\u0097\u0091\u0091¤\u009e£\u0096\u009d\u009e\u0097\u0093¢\u0094¡ \u0091\u009f\u0091\u009e\u0083\u0088\u008d", objArr6);
                                com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist4, ((java.lang.String) objArr6[0]).intern()}, -403792301, 403792301, java.lang.System.identityHashCode(filelist4));
                                this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(getdatabasepath);
                                return;
                            }
                        }
                    }
                    z = -1;
                    if (z) {
                    }
                } else {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(127 - android.view.Gravity.getAbsoluteGravity(0, 0), null, null, "\u0082\u008e\u0090\u008d\u008f\u0083\u008e\u0088\u0088\u008d\u0086\u008c\u0089\u008b\u0082\u0089", objArr7);
                    if (writeReplace.equals(((java.lang.String) objArr7[0]).intern())) {
                        getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 11) % 128;
                        z = true;
                        if (z) {
                        }
                    }
                    z = -1;
                    if (z) {
                    }
                }
            } else {
                ((com.payair.hce.VisaReperso) ((java.lang.Exception) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 1534705211, -1534705209, java.lang.System.identityHashCode(getdatabasepath)))).writeReplace().hashCode();
                throw null;
            }
        }
        int i8 = com.payair.hce.moveSharedPreferencesFrom.AnonymousClass2.AlternateContactlessPaymentDataJson[((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() - 1];
        if (i8 == 1 || i8 == 2) {
            valueOf(getdatabasepath, false);
            return;
        }
        if (i8 == 3 || i8 == 4) {
            this.valueOf = com.payair.hce.moveSharedPreferencesFrom.valueOf.writeReplace;
            this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(this.IccPrivateKeyCrtComponentsJson);
        } else {
            this.valueOf = com.payair.hce.moveSharedPreferencesFrom.valueOf.writeReplace;
            this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(getdatabasepath);
        }
    }

    public final java.lang.String DigitizedCardProfile(com.payair.hce.getExternalFilesDirs getexternalfilesdirs) {
        com.payair.hce.deleteDatabase valueOf2;
        this.getCiacDecline = getexternalfilesdirs;
        switch (com.payair.hce.moveSharedPreferencesFrom.AnonymousClass2.AlternateContactlessPaymentDataJson[getexternalfilesdirs.values() - 1]) {
            case 1:
                valueOf2 = this.SdkCoreAlternateContactlessPaymentDataImpl.valueOf((com.payair.hce.getFilesDir) getexternalfilesdirs.DigitizedCardProfile(), this);
                break;
            case 2:
                valueOf2 = this.SdkCoreAlternateContactlessPaymentDataImpl.writeReplace((com.payair.hce.getFilesDir) getexternalfilesdirs.DigitizedCardProfile(), this);
                break;
            case 3:
                valueOf2 = this.SdkCoreAlternateContactlessPaymentDataImpl.DigitizedCardProfile((com.payair.hce.getExternalFilesDir) getexternalfilesdirs.DigitizedCardProfile(), this);
                break;
            case 4:
                valueOf2 = this.SdkCoreAlternateContactlessPaymentDataImpl.AlternateContactlessPaymentDataJson((com.payair.hce.getExternalFilesDir) getexternalfilesdirs.DigitizedCardProfile(), this);
                getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 105) % 128;
                break;
            case 5:
                com.payair.hce.getPackageCodePath getpackagecodepath = this.SdkCoreAlternateContactlessPaymentDataImpl;
                valueOf2 = (com.payair.hce.getWallpaperDesiredMinimumHeight) com.payair.hce.getPackageCodePath.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getpackagecodepath, this}, 147849031, -147849030, java.lang.System.identityHashCode(getpackagecodepath));
                break;
            case 6:
                com.payair.hce.getNoBackupFilesDir getnobackupfilesdir = (com.payair.hce.getNoBackupFilesDir) getexternalfilesdirs.DigitizedCardProfile();
                com.payair.hce.getPackageCodePath getpackagecodepath2 = this.SdkCoreAlternateContactlessPaymentDataImpl;
                valueOf2 = (com.payair.hce.setWallpaper) com.payair.hce.getPackageCodePath.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getpackagecodepath2, getnobackupfilesdir, this}, 1362094210, -1362094210, java.lang.System.identityHashCode(getpackagecodepath2));
                break;
            case 7:
            case 8:
                valueOf2 = this.SdkCoreAlternateContactlessPaymentDataImpl.DigitizedCardProfile((com.payair.hce.getFileStreamPath) getexternalfilesdirs.DigitizedCardProfile(), this);
                break;
            case 9:
            case 10:
                valueOf2 = this.SdkCoreAlternateContactlessPaymentDataImpl.valueOf((com.payair.hce.getDataDir) getexternalfilesdirs.DigitizedCardProfile(), this);
                break;
            case 11:
                valueOf2 = this.SdkCoreAlternateContactlessPaymentDataImpl.writeReplace((com.payair.hce.openFileOutput) getexternalfilesdirs.DigitizedCardProfile(), this);
                break;
            case 12:
                valueOf2 = this.SdkCoreAlternateContactlessPaymentDataImpl.DigitizedCardProfile((com.payair.hce.openFileInput) getexternalfilesdirs.DigitizedCardProfile(), this);
                break;
            case 13:
                valueOf2 = this.SdkCoreAlternateContactlessPaymentDataImpl.DigitizedCardProfile(this);
                break;
            default:
                valueOf2 = null;
                break;
        }
        if (valueOf2 == null) {
            return null;
        }
        SdkCoreCardRiskManagementDataImpl = (getCardholderValidators + 113) % 128;
        this.RecordsJson = valueOf2;
        this.valueOf = com.payair.hce.moveSharedPreferencesFrom.valueOf.values;
        DigitizedCardProfile(valueOf2, 0);
        return valueOf2.valueOf();
    }

    private void DigitizedCardProfile(final com.payair.hce.deleteDatabase deletedatabase, int i) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, null, null, "\u009a\u0096\u0091\u009c\u009d\u008b\u009c\u0091\u009b\u009a\u0097\u0096\u0099\u0094\u0097\u0091\u0092\u0091\u0098\u0096\u0097\u0096\u0095\u0091\u0094\u0093\u0092\u0091\u0089", objArr);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(((java.lang.String) objArr[0]).intern());
        this.getGpoResponse = handlerThread;
        handlerThread.start();
        new android.os.Handler(this.getGpoResponse.getLooper()).postDelayed(new java.lang.Runnable() { // from class: com.payair.hce.moveSharedPreferencesFrom.1
            private static int DigitizedCardProfile = 0;
            private static int valueOf = 1;

            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2, int i2, int i3, int i4) {
                return valueOf(objArr2);
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                com.payair.hce.moveSharedPreferencesFrom.AnonymousClass1 anonymousClass1 = (com.payair.hce.moveSharedPreferencesFrom.AnonymousClass1) objArr2[0];
                int i2 = DigitizedCardProfile;
                int i3 = i2 ^ 29;
                int i4 = ((i2 & 29) | i3) << 1;
                int i5 = -i3;
                int i6 = (i4 & i5) + (i4 | i5);
                valueOf = i6 % 128;
                if (i6 % 2 != 0) {
                    deletedatabase.writeReplace();
                    int i7 = valueOf + 79;
                    DigitizedCardProfile = i7 % 128;
                    if (i7 % 2 == 0) {
                        return null;
                    }
                    throw new java.lang.ArithmeticException();
                }
                deletedatabase.writeReplace();
                throw null;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1987788497, -1987788497, java.lang.System.identityHashCode(this));
            }
        }, i);
        getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 125) % 128;
    }

    private void valueOf(com.payair.hce.getDatabasePath getdatabasepath, boolean z) {
        com.payair.hce.getExternalFilesDirs getexternalfilesdirs;
        getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 71) % 128;
        this.IccPrivateKeyCrtComponentsJson = getdatabasepath;
        if (z) {
            this.SdkCoreBusinessLogicModuleImpl = com.payair.hce.sendStickyBroadcast.DigitizedCardProfile;
        } else {
            this.SdkCoreBusinessLogicModuleImpl = com.payair.hce.sendStickyBroadcast.values;
            getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 65) % 128;
        }
        com.payair.hce.fileList filelist = (com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath));
        java.lang.String str = (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist}, -1279268571, 1279268573, java.lang.System.identityHashCode(filelist));
        java.lang.String obj = this.SdkCoreBusinessLogicModuleImpl.toString();
        com.payair.hce.fileList filelist2 = (com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath));
        java.lang.String str2 = (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist2}, 1373679103, -1373679102, java.lang.System.identityHashCode(filelist2));
        com.payair.hce.fileList filelist3 = (com.payair.hce.fileList) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 281012404, -281012403, java.lang.System.identityHashCode(getdatabasepath));
        com.payair.hce.getExternalFilesDir getexternalfilesdir = new com.payair.hce.getExternalFilesDir(str, obj, str2, (java.lang.String) com.payair.hce.fileList.DigitizedCardProfile(new java.lang.Object[]{filelist3}, -1777947608, 1777947612, java.lang.System.identityHashCode(filelist3)));
        if (((java.lang.Integer) com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath}, 2063970108, -2063970105, java.lang.System.identityHashCode(getdatabasepath))).intValue() == com.payair.hce.sendOrderedBroadcastAsUser.writeReplace) {
            getexternalfilesdirs = new com.payair.hce.getExternalFilesDirs(com.payair.hce.sendOrderedBroadcastAsUser.values, getexternalfilesdir);
        } else {
            getexternalfilesdirs = new com.payair.hce.getExternalFilesDirs(com.payair.hce.sendOrderedBroadcastAsUser.DigitizedCardProfile, getexternalfilesdir);
        }
        DigitizedCardProfile(getexternalfilesdirs);
    }

    @Override // java.lang.Runnable
    public final void run() {
        getCardholderValidators = (SdkCoreCardRiskManagementDataImpl + 29) % 128;
        DigitizedCardProfile(this.getCiacDecline);
        int i = getCardholderValidators + 65;
        SdkCoreCardRiskManagementDataImpl = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreCardRiskManagementDataImpl = 0;
        getCardholderValidators = 1;
        getApplicationLifeCycleData = new char[]{10899, 10885, 10905, 10911, 10908, 11119, 10902, 10910, 10896, 10882, 10898, 11113, 10881, 10906, 10883, 10880, 11109, 11133, 11135, 11122, 10909, 11105, 11132, 11111, 10886, 11106, 11130, 11120, 11110, 10926, 11126, 11107, 11125, 11129, 11123, 11104, 10940};
        getCardLayoutDescription = -143185202;
        getDualTapResetTimeout = true;
        getCvmResetTimeout = true;
    }

    @Override // com.payair.hce.deleteSharedPreferences
    public final void DigitizedCardProfile(com.payair.hce.getDatabasePath getdatabasepath) {
        valueOf(new java.lang.Object[]{this, getdatabasepath}, 812852892, -812852892, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{63, 105, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.SUB};
        $$b = 84;
    }

    public final com.payair.hce.DeviceNotSecureException writeReplace() {
        return (com.payair.hce.DeviceNotSecureException) valueOf(new java.lang.Object[]{this}, 176217998, -176217997, java.lang.System.identityHashCode(this));
    }
}
