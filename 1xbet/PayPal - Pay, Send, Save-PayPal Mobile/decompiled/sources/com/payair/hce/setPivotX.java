package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setPivotX implements com.payair.hce.getDetailedMessage, com.payair.hce.getErrorName, com.payair.hce.lambdasendUpdateRNSInformation0, com.payair.hce.onNewToken, com.payair.hce.sendUpdateRNSInformation, com.payair.hce.setErrors {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int getAdditionalCheckTable;
    private static int getApplicationLifeCycleData;
    private static byte[] getCardLayoutDescription;
    private static int getCardholderValidators;
    private static char[] getCiacDecline;
    private static int getCvmResetTimeout;
    private static int getDualTapResetTimeout;
    private static long getPaymentFci;
    private static int getProfileVersion;
    private static short[] getSecurityWord;
    private com.payair.hce.isDataValid IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.isDataValid RecordsJson;
    private com.payair.hce.isDataValid SdkCoreBusinessLogicModuleImpl;
    private com.payair.hce.isDataValid getAid;
    private java.util.Random getCvrMaskAnd;
    private com.payair.hce.isDataValid getGpoResponse;
    final android.content.SharedPreferences valueOf;
    com.payair.hce.setVisibility writeReplace;
    private com.payair.hce.query SdkCoreAlternateContactlessPaymentDataImpl = null;
    java.util.Map<java.lang.String, com.payair.hce.setOnCapturedPointerListener> AlternateContactlessPaymentDataJson = new java.util.HashMap();
    java.util.Map<java.lang.String, com.payair.hce.setAlpha> DigitizedCardProfile = new java.util.HashMap();
    private final java.util.concurrent.ExecutorService values = java.util.concurrent.Executors.newFixedThreadPool(10);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        byte[] bArr = $$a;
        int i5 = i2 * 4;
        int i6 = (i * 5) + 99;
        int i7 = 3 - (i3 * 4);
        byte[] bArr2 = new byte[1 - i5];
        int i8 = 0 - i5;
        if (bArr == null) {
            int i9 = i7;
            int i10 = 0;
            int i11 = i8;
            i6 = (-i6) + i11;
            i7 = i9;
            i4 = i10;
            bArr2[i4] = (byte) i6;
            int i12 = i7 + 1;
            if (i4 == i8) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = bArr[i12];
            i11 = i6;
            i6 = i13;
            i10 = i4 + 1;
            i9 = i12;
            i6 = (-i6) + i11;
            i7 = i9;
            i4 = i10;
            bArr2[i4] = (byte) i6;
            int i122 = i7 + 1;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i6;
            int i1222 = i7 + 1;
            if (i4 == i8) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i;
        int i6 = ~i3;
        switch ((i * (-1965)) + (i2 * 984) + ((i | i4) * 983) + (((~(i4 | i6)) | i5) * (-983)) + (((~(i5 | i2)) | (~(i6 | i5))) * 983)) {
            case 1:
                return valueOf(objArr);
            case 2:
                byte[] bArr = (byte[]) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                com.payair.hce.internalEndTransaction internalendtransaction = new com.payair.hce.internalEndTransaction(new com.payair.hce.isMainThreadroom_runtime_release());
                internalendtransaction.DigitizedCardProfile(new com.payair.hce.getErrorDialog(bArr2));
                byte[] bArr3 = new byte[((java.lang.Integer) com.payair.hce.internalEndTransaction.writeReplace(new java.lang.Object[]{internalendtransaction}, -1727069471, 1727069471, java.lang.System.identityHashCode(internalendtransaction))).intValue()];
                internalendtransaction.AlternateContactlessPaymentDataJson(bArr, bArr.length);
                internalendtransaction.valueOf(bArr3);
                int i7 = getCardholderValidators;
                int i8 = i7 & 27;
                int i9 = (i7 ^ 27) | i8;
                getAdditionalCheckTable = ((i8 & i9) + (i9 | i8)) % 128;
                return bArr3;
            case 3:
                return AlternateContactlessPaymentDataJson(objArr);
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
                byte[] bArr4 = (byte[]) objArr[1];
                byte[] bArr5 = (byte[]) objArr[2];
                int i10 = getCardholderValidators;
                int i11 = i10 & 113;
                int i12 = ((i10 ^ 113) | i11) << 1;
                int i13 = -((i10 | 113) & (~i11));
                getAdditionalCheckTable = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                boolean equals = java.util.Arrays.equals(bArr5, setpivotx.valueOf(bArr4));
                int i14 = getAdditionalCheckTable;
                int i15 = i14 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                getCardholderValidators = (((((i14 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i15) << 1) - (~(-((i14 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i15))))) - 1) % 128;
                return java.lang.Boolean.valueOf(equals);
            case 6:
                return writeReplace(objArr);
            case 7:
                return getAid(objArr);
            case 8:
                com.payair.hce.setPivotX setpivotx2 = (com.payair.hce.setPivotX) objArr[0];
                final com.payair.hce.accessperformEnroll accessperformenroll = (com.payair.hce.accessperformEnroll) objArr[1];
                java.util.concurrent.Future submit = setpivotx2.values.submit(new java.util.concurrent.Callable<byte[]>() { // from class: com.payair.hce.setPivotX.7
                    private static int AlternateContactlessPaymentDataJson = 1;
                    private static int DigitizedCardProfile;

                    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2, int i16, int i17, int i18) {
                        int i19 = ~i17;
                        int i20 = ~i18;
                        return ((((i16 * 934) + (i17 * (-932))) + (((~((~i16) | i20)) | i19) * (-933))) + (((~(i20 | i19)) | (~(i19 | i16))) * 933)) + ((~(i16 | i17)) * 933) != 1 ? writeReplace(objArr2) : values(objArr2);
                    }

                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                        com.payair.hce.setPivotX.AnonymousClass7 anonymousClass7 = (com.payair.hce.setPivotX.AnonymousClass7) objArr2[0];
                        int i16 = AlternateContactlessPaymentDataJson;
                        int i17 = ((i16 ^ 43) | (i16 & 43)) << 1;
                        int i18 = -((i16 & (-44)) | ((~i16) & 43));
                        DigitizedCardProfile = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
                        byte[] bArr6 = (byte[]) writeReplace(new java.lang.Object[]{anonymousClass7}, 89094121, -89094121, java.lang.System.identityHashCode(anonymousClass7));
                        int i19 = DigitizedCardProfile;
                        int i20 = ((i19 & 10) + (i19 | 10)) - 1;
                        AlternateContactlessPaymentDataJson = i20 % 128;
                        if (i20 % 2 != 0) {
                            return bArr6;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2) {
                        com.payair.hce.setPivotX.AnonymousClass7 anonymousClass7 = (com.payair.hce.setPivotX.AnonymousClass7) objArr2[0];
                        int i16 = AlternateContactlessPaymentDataJson;
                        int i17 = ((i16 | 23) << 1) - (i16 ^ 23);
                        DigitizedCardProfile = i17 % 128;
                        if (i17 % 2 != 0) {
                            com.payair.hce.setPivotX setpivotx3 = com.payair.hce.setPivotX.this;
                            java.lang.String writeReplace = setpivotx3.writeReplace("CUR_W_DEK_KEY_ID");
                            com.payair.hce.accessperformEnroll accessperformenroll2 = accessperformenroll;
                            setpivotx3.values(writeReplace, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{accessperformenroll2}, -1877837077, 1877837077, java.lang.System.identityHashCode(accessperformenroll2)));
                            throw new java.lang.ArithmeticException();
                        }
                        com.payair.hce.setPivotX setpivotx4 = com.payair.hce.setPivotX.this;
                        java.lang.String writeReplace2 = setpivotx4.writeReplace("CUR_W_DEK_KEY_ID");
                        com.payair.hce.accessperformEnroll accessperformenroll3 = accessperformenroll;
                        byte[] values2 = setpivotx4.values(writeReplace2, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{accessperformenroll3}, -1877837077, 1877837077, java.lang.System.identityHashCode(accessperformenroll3)));
                        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 125) % 128;
                        return values2;
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.lang.Object] */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ byte[] call() throws java.lang.Exception {
                        ?? writeReplace = writeReplace(new java.lang.Object[]{this}, -796846296, 796846297, java.lang.System.identityHashCode(this));
                        return writeReplace;
                    }

                    private byte[] AlternateContactlessPaymentDataJson() throws java.lang.Exception {
                        return (byte[]) writeReplace(new java.lang.Object[]{this}, 89094121, -89094121, java.lang.System.identityHashCode(this));
                    }
                });
                int i16 = getAdditionalCheckTable;
                int i17 = i16 & 63;
                getCardholderValidators = (((((i16 ^ 63) | i17) << 1) - (~(-((i16 | 63) & (~i17))))) - 1) % 128;
                return submit;
            case 9:
                return getProfileVersion(objArr);
            case 10:
                return RecordsJson(objArr);
            case 11:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 12:
                byte[] bArr6 = (byte[]) objArr[1];
                byte[] bArr7 = (byte[]) objArr[2];
                int ceil = ((int) java.lang.Math.ceil((bArr6.length + 1.0d) / 8.0d)) << 3;
                byte[] bArr8 = new byte[ceil];
                java.lang.System.arraycopy(bArr6, 0, bArr8, 0, bArr6.length);
                bArr8[bArr6.length] = Byte.MIN_VALUE;
                byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr7, 0, bArr7.length / 2);
                byte[] copyOfRange2 = java.util.Arrays.copyOfRange(bArr7, bArr7.length / 2, bArr7.length);
                byte[] bArr9 = new byte[8];
                java.lang.System.arraycopy(getProfileVersion(bArr8, copyOfRange, com.payair.hce.setPivotX.values.DigitizedCardProfile), (-2) - (~((ceil & (-7)) + (ceil | (-7)))), bArr9, 0, 8);
                byte[] bArr10 = (byte[]) valueOf(new java.lang.Object[]{bArr9, copyOfRange2, com.payair.hce.setPivotX.values.values}, -616291904, 616291928, (int) java.lang.System.currentTimeMillis());
                byte[] bArr11 = (byte[]) valueOf(new java.lang.Object[]{bArr10, copyOfRange, com.payair.hce.setPivotX.values.DigitizedCardProfile}, -616291904, 616291928, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr10}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr8}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{copyOfRange}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{copyOfRange2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr9}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                int i18 = getCardholderValidators;
                int i19 = i18 & 9;
                getAdditionalCheckTable = (i19 + ((i18 ^ 9) | i19)) % 128;
                return bArr11;
            case 13:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 14:
                return getCvrMaskAnd(objArr);
            case 15:
                return SdkCoreBusinessLogicModuleImpl(objArr);
            case 16:
                return getCiacDecline(objArr);
            case 17:
                return getPaymentFci(objArr);
            case 18:
                return getGpoResponse(objArr);
            case 19:
                return getSecurityWord(objArr);
            case 20:
                return getDualTapResetTimeout(objArr);
            case 21:
                return getCvmResetTimeout(objArr);
            case 22:
                return getCardLayoutDescription(objArr);
            case 23:
                return getApplicationLifeCycleData(objArr);
            case 24:
                return getMagstripeCvmIssuerOptions(objArr);
            case 25:
                byte[] bArr12 = (byte[]) objArr[0];
                byte[] bArr13 = (byte[]) objArr[1];
                int i20 = getAdditionalCheckTable;
                getCardholderValidators = ((((i20 & (-40)) | ((~i20) & 39)) - (~(-(-((i20 & 39) << 1))))) - 1) % 128;
                byte[] bArr14 = (byte[]) valueOf(new java.lang.Object[]{bArr12, 0, bArr13, 16}, 1520612320, -1520612288, 0);
                int i21 = getCardholderValidators;
                getAdditionalCheckTable = (((i21 ^ 23) - (~(-(-((i21 & 23) << 1))))) - 1) % 128;
                return bArr14;
            case 26:
                return SdkCoreCardRiskManagementDataImpl(objArr);
            case 27:
                return getAdditionalCheckTable(objArr);
            case 28:
                return getCardholderValidators(objArr);
            case 29:
                return getMchipCvmIssuerOptions(objArr);
            case 30:
                return getCdol1RelatedDataLength(objArr);
            case 31:
                com.payair.hce.setPivotX setpivotx3 = (com.payair.hce.setPivotX) objArr[0];
                final com.payair.hce.Initializer initializer = (com.payair.hce.Initializer) objArr[1];
                java.util.concurrent.Future submit2 = setpivotx3.values.submit(new java.util.concurrent.Callable<byte[]>() { // from class: com.payair.hce.setPivotX.14
                    private static int AlternateContactlessPaymentDataJson = 1;
                    private static int values;

                    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2, int i22, int i23, int i24) {
                        int i25 = ~i22;
                        int i26 = ~i23;
                        int i27 = i25 | i26;
                        return ((((i22 * (-344)) + (i23 * (-344))) + (((~i27) | (~(i25 | i24))) * 345)) + (((~(i22 | i26)) | (~((~i24) | i25))) * 345)) + ((~(i27 | i24)) * 345) != 1 ? AlternateContactlessPaymentDataJson(objArr2) : valueOf(objArr2);
                    }

                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                        com.payair.hce.setPivotX.AnonymousClass14 anonymousClass14 = (com.payair.hce.setPivotX.AnonymousClass14) objArr2[0];
                        int i22 = AlternateContactlessPaymentDataJson + 23;
                        values = i22 % 128;
                        if (i22 % 2 == 0) {
                            return (byte[]) writeReplace(new java.lang.Object[]{anonymousClass14}, -3560079, 3560079, java.lang.System.identityHashCode(anonymousClass14));
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                        com.payair.hce.setPivotX.AnonymousClass14 anonymousClass14 = (com.payair.hce.setPivotX.AnonymousClass14) objArr2[0];
                        int i22 = AlternateContactlessPaymentDataJson;
                        int i23 = i22 & 107;
                        int i24 = ((i22 | 107) & (~i23)) + (i23 << 1);
                        values = i24 % 128;
                        if (i24 % 2 == 0) {
                            com.payair.hce.setPivotX setpivotx4 = com.payair.hce.setPivotX.this;
                            java.lang.String writeReplace = setpivotx4.writeReplace("CUR_DST_DEK_KEY_ID");
                            com.payair.hce.Initializer initializer2 = initializer;
                            return setpivotx4.values(writeReplace, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializer2}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializer2)));
                        }
                        com.payair.hce.setPivotX setpivotx5 = com.payair.hce.setPivotX.this;
                        java.lang.String writeReplace2 = setpivotx5.writeReplace("CUR_DST_DEK_KEY_ID");
                        com.payair.hce.Initializer initializer3 = initializer;
                        setpivotx5.values(writeReplace2, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializer3}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializer3)));
                        throw new java.lang.ArithmeticException();
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.lang.Object] */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ byte[] call() throws java.lang.Exception {
                        ?? writeReplace = writeReplace(new java.lang.Object[]{this}, -107673530, 107673531, java.lang.System.identityHashCode(this));
                        return writeReplace;
                    }

                    private byte[] valueOf() throws java.lang.Exception {
                        return (byte[]) writeReplace(new java.lang.Object[]{this}, -3560079, 3560079, java.lang.System.identityHashCode(this));
                    }
                });
                int i22 = getAdditionalCheckTable;
                getCardholderValidators = (((i22 & 11) - (~(i22 | 11))) - 1) % 128;
                return submit2;
            case 32:
                return getCrmCountryCode(objArr);
            case 33:
                return SdkCoreContactlessPaymentDataImpl(objArr);
            case 34:
                return buildRecords(objArr);
            case 35:
                return getPpseFci(objArr);
            case 36:
                byte[] bArr15 = (byte[]) objArr[1];
                byte[] bArr16 = (byte[]) objArr[2];
                com.payair.hce.setPivotX.values valuesVar = (com.payair.hce.setPivotX.values) objArr[3];
                int i23 = getAdditionalCheckTable;
                getCardholderValidators = (((i23 | 49) << 1) - (i23 ^ 49)) % 128;
                byte[] bArr17 = (byte[]) valueOf(new java.lang.Object[]{bArr15, bArr16, valuesVar, java.lang.Boolean.TRUE}, 717882300, -717882294, (int) java.lang.System.currentTimeMillis());
                getAdditionalCheckTable = (getCardholderValidators + 13) % 128;
                return bArr17;
            case 37:
                com.payair.hce.setPivotX setpivotx4 = (com.payair.hce.setPivotX) objArr[0];
                final com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) objArr[1];
                java.util.concurrent.Future submit3 = setpivotx4.values.submit(new java.util.concurrent.Callable<byte[]>() { // from class: com.payair.hce.setPivotX.6
                    private static int DigitizedCardProfile = 1;
                    private static int valueOf;

                    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2, int i24, int i25, int i26) {
                        int i27 = ~i24;
                        int i28 = i27 | i25;
                        int i29 = ~i26;
                        return ((((i24 * 755) + (i25 * (-753))) + ((((~i28) | (~(i27 | i26))) | (~(i25 | i26))) * (-754))) + (((~((i24 | i29) | i25)) | (~(i28 | i26))) * (-754))) + ((i27 | i29) * 754) != 1 ? values(objArr2) : valueOf(objArr2);
                    }

                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                        com.payair.hce.setPivotX.AnonymousClass6 anonymousClass6 = (com.payair.hce.setPivotX.AnonymousClass6) objArr2[0];
                        int i24 = DigitizedCardProfile;
                        int i25 = (((i24 | 4) << 1) - (i24 ^ 4)) - 1;
                        valueOf = i25 % 128;
                        if (i25 % 2 == 0) {
                            return (byte[]) valueOf(new java.lang.Object[]{anonymousClass6}, 833156274, -833156273, java.lang.System.identityHashCode(anonymousClass6));
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                        com.payair.hce.setPivotX.AnonymousClass6 anonymousClass6 = (com.payair.hce.setPivotX.AnonymousClass6) objArr2[0];
                        int i24 = DigitizedCardProfile;
                        int i25 = i24 ^ 125;
                        int i26 = ((i24 & 125) | i25) << 1;
                        int i27 = -i25;
                        int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                        valueOf = i28 % 128;
                        if (i28 % 2 == 0) {
                            com.payair.hce.setPivotX setpivotx5 = com.payair.hce.setPivotX.this;
                            java.lang.String writeReplace = setpivotx5.writeReplace("CUR_L_DEK_KEY_ID");
                            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2 = initializevisapaymentsdk;
                            return setpivotx5.values(writeReplace, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk2}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk2)));
                        }
                        com.payair.hce.setPivotX setpivotx6 = com.payair.hce.setPivotX.this;
                        java.lang.String writeReplace2 = setpivotx6.writeReplace("CUR_L_DEK_KEY_ID");
                        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk3 = initializevisapaymentsdk;
                        setpivotx6.values(writeReplace2, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk3}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk3)));
                        throw null;
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.lang.Object] */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ byte[] call() throws java.lang.Exception {
                        ?? valueOf2 = valueOf(new java.lang.Object[]{this}, -956562217, 956562217, java.lang.System.identityHashCode(this));
                        return valueOf2;
                    }

                    private byte[] AlternateContactlessPaymentDataJson() throws java.lang.Exception {
                        return (byte[]) valueOf(new java.lang.Object[]{this}, 833156274, -833156273, java.lang.System.identityHashCode(this));
                    }
                });
                int i24 = getCardholderValidators;
                int i25 = i24 ^ 83;
                int i26 = ((i24 & 83) | i25) << 1;
                int i27 = -i25;
                getAdditionalCheckTable = ((i26 & i27) + (i26 | i27)) % 128;
                return submit3;
            case 38:
                return getCiacDeclineOnPpms(objArr);
            case 39:
                return getAlternateContactlessPaymentData(objArr);
            case 40:
                return getIssuerApplicationData(objArr);
            case 41:
                return getIccPrivateKeyCrtComponents(objArr);
            case 42:
                byte[] bArr18 = (byte[]) objArr[1];
                byte[] bArr19 = (byte[]) objArr[2];
                int intValue = ((java.lang.Number) objArr[3]).intValue();
                int i28 = getCardholderValidators + 21;
                getAdditionalCheckTable = i28 % 128;
                return i28 % 2 == 0 ? DigitizedCardProfile(bArr18, writeReplace(intValue, true), bArr19, com.payair.hce.setPivotX.values.values) : DigitizedCardProfile(bArr18, writeReplace(intValue, false), bArr19, com.payair.hce.setPivotX.values.values);
            default:
                return values(objArr);
        }
    }

    abstract com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson(java.lang.String str) throws java.security.GeneralSecurityException;

    abstract boolean getAid();

    abstract void valueOf(java.lang.String str);

    abstract void valueOf(java.lang.String str, java.lang.String str2) throws java.security.GeneralSecurityException;

    abstract byte[] valueOf(java.lang.String str, byte[] bArr) throws java.security.GeneralSecurityException;

    abstract void values(java.lang.String str, java.lang.String str2) throws java.security.GeneralSecurityException;

    abstract byte[] values(java.lang.String str, byte[] bArr) throws java.security.GeneralSecurityException;

    abstract byte[] writeReplace(java.lang.String str, byte[] bArr) throws java.security.GeneralSecurityException;

    private static void a(int i, int i2, char c, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        int i3 = 0;
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i4 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                objArr2[i3] = java.lang.Integer.valueOf(getCiacDecline[i + getcvmmodel.valueOf]);
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48, 381 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.KeyEvent.keyCodeFromString("") + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(i3, i3, i3, objArr3);
                    java.lang.String str = (java.lang.String) objArr3[i3];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[i3] = java.lang.Integer.TYPE;
                    obj = cls.getMethod(str, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getPaymentFci), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 35, android.widget.ExpandableListView.getPackedPositionType(0L) + 3966, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 40224))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, android.graphics.Color.green(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                i3 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.KeyEvent.getDeadChar(0, 0), 212 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.graphics.Color.alpha(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$0();
        getCardholderValidators = 0;
        getAdditionalCheckTable = 1;
        SdkCoreAlternateContactlessPaymentDataImpl();
        getProfileVersion = 0;
        int i = getAdditionalCheckTable;
        int i2 = i & 13;
        int i3 = i2 + ((i ^ 13) | i2);
        getCardholderValidators = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    setPivotX(android.content.Context context) {
        this.valueOf = context.getSharedPreferences("SymmetricCryptoKeyIds", 0);
        com.payair.hce.setVisibility setvisibility = new com.payair.hce.setVisibility();
        this.writeReplace = setvisibility;
        setvisibility.valueOf();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        long j;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getCvmResetTimeout)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 27, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 30, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            int i4 = intValue == -1 ? 1 : 0;
            if (i4 != 0) {
                byte[] bArr = getCardLayoutDescription;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.graphics.Color.green(0) + 5088, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = getCardLayoutDescription;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getApplicationLifeCycleData)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myPid() >> 22), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 29, (char) android.text.TextUtils.getTrimmedLength(""))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (getCvmResetTimeout ^ (-4897270311952305750L))));
                } else {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (getSecurityWord[i + ((int) (getApplicationLifeCycleData ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (getCvmResetTimeout ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        gettrack2constructiondata.writeReplace = ((i + intValue) - 2) + ((int) (getApplicationLifeCycleData ^ j)) + i4;
                        java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(getDualTapResetTimeout), sb};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj4 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.Color.blue(0), 2364 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                            byte b2 = (byte) ($$b & 3);
                            byte b3 = (byte) (b2 - 1);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            c(b2, b3, b3, objArr6);
                            obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr4 = getCardLayoutDescription;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i6 = 0; i6 < length2; i6++) {
                                bArr5[i6] = (byte) (bArr4[i6] ^ (-4897270311952305750L));
                            }
                            bArr4 = bArr5;
                        }
                        boolean z = bArr4 != null;
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z) {
                                byte[] bArr6 = getCardLayoutDescription;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = getSecurityWord;
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

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        if (r12.AlternateContactlessPaymentDataJson(r12.writeReplace("CUR_DST_DEK_KEY_ID")) == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object getPpseFci(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        int i = getCardholderValidators;
        getAdditionalCheckTable = (((i | 109) << 1) - (i ^ 109)) % 128;
        try {
            if (setpivotx.writeReplace("CUR_DST_DEK_KEY_ID") != null) {
                int i2 = getAdditionalCheckTable;
                getCardholderValidators = ((-2) - (~((i2 ^ 62) + ((i2 & 62) << 1)))) % 128;
            }
            setpivotx.SdkCoreBusinessLogicModuleImpl();
            int i3 = getAdditionalCheckTable;
            int i4 = ((i3 | 70) << 1) - (i3 ^ 70);
            getCardholderValidators = ((~i4) + (i4 << 1)) % 128;
            setpivotx.values("CRYPTO_DST_DEK_KEK", setpivotx.writeReplace("CUR_DST_DEK_KEY_ID"));
            setpivotx.valueOf("CRYPTO_DST_MAC_KEK", setpivotx.writeReplace("CUR_DST_MAC_KEY_ID"));
            setpivotx.values("CRYPTO_RM_KEK_KEK", setpivotx.writeReplace("CUR_RM_KEK_KEY_ID"));
            setpivotx.values("CRYPTO_L_DEK_KEK", setpivotx.writeReplace("CUR_L_DEK_KEY_ID"));
            setpivotx.values("CRYPTO_W_DEK_KEK", setpivotx.writeReplace("CUR_W_DEK_KEY_ID"));
            com.payair.hce.setScaleY setscaley = new com.payair.hce.setScaleY() { // from class: com.payair.hce.setPivotX.1
                private static int DigitizedCardProfile = 0;
                private static int values = 1;

                public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2, int i5, int i6, int i7) {
                    int i8 = (i5 * 530) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO + (i6 * 530) + (((~((~i7) | i5)) | (~(i5 | i6))) * 529) + (((~(i5 | i7)) | (~i6)) * 529);
                    if (i8 == 1) {
                        return DigitizedCardProfile(objArr2);
                    }
                    if (i8 == 2) {
                        return AlternateContactlessPaymentDataJson(objArr2);
                    }
                    com.payair.hce.setPivotX.AnonymousClass1 anonymousClass1 = (com.payair.hce.setPivotX.AnonymousClass1) objArr2[0];
                    java.lang.String str = (java.lang.String) objArr2[1];
                    byte[] bArr = (byte[]) objArr2[2];
                    int i9 = values;
                    int i10 = i9 & 13;
                    int i11 = (i9 | 13) & (~i10);
                    int i12 = -(-(i10 << 1));
                    DigitizedCardProfile = (((i11 | i12) << 1) - (i11 ^ i12)) % 128;
                    byte[] writeReplace = com.payair.hce.setPivotX.this.writeReplace(str, bArr);
                    int i13 = DigitizedCardProfile;
                    values = (((i13 & (-8)) | ((~i13) & 7)) + ((i13 & 7) << 1)) % 128;
                    return writeReplace;
                }

                private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                    com.payair.hce.setPivotX.AnonymousClass1 anonymousClass1 = (com.payair.hce.setPivotX.AnonymousClass1) objArr2[0];
                    java.lang.String str = (java.lang.String) objArr2[1];
                    byte[] bArr = (byte[]) objArr2[2];
                    int i5 = values;
                    int i6 = (-2) - (~(((i5 | 126) << 1) - (i5 ^ 126)));
                    DigitizedCardProfile = i6 % 128;
                    com.payair.hce.setPivotX setpivotx2 = com.payair.hce.setPivotX.this;
                    if (i6 % 2 == 0) {
                        return setpivotx2.values(str, bArr);
                    }
                    setpivotx2.values(str, bArr);
                    throw null;
                }

                private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                    com.payair.hce.setPivotX.AnonymousClass1 anonymousClass1 = (com.payair.hce.setPivotX.AnonymousClass1) objArr2[0];
                    java.lang.String str = (java.lang.String) objArr2[1];
                    int i5 = DigitizedCardProfile;
                    values = ((((i5 & (-34)) | ((~i5) & 33)) - (~(-(-((i5 & 33) << 1))))) - 1) % 128;
                    com.payair.hce.setPivotX.this.valueOf(str);
                    int i6 = values;
                    int i7 = i6 & 85;
                    int i8 = (i6 | 85) & (~i7);
                    int i9 = -(-(i7 << 1));
                    int i10 = (i8 & i9) + (i8 | i9);
                    DigitizedCardProfile = i10 % 128;
                    if (i10 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }

                @Override // com.payair.hce.setScaleY
                public final void valueOf(java.lang.String str) {
                    AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -1890728434, 1890728436, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.setScaleY
                public final byte[] AlternateContactlessPaymentDataJson(java.lang.String str, byte[] bArr) throws java.security.GeneralSecurityException {
                    return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str, bArr}, 1080572599, -1080572598, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.setScaleY
                public final byte[] DigitizedCardProfile(java.lang.String str, byte[] bArr) throws java.security.GeneralSecurityException {
                    return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str, bArr}, 1495110065, -1495110065, java.lang.System.identityHashCode(this));
                }
            };
            com.payair.hce.setScaleY setscaley2 = new com.payair.hce.setScaleY() { // from class: com.payair.hce.setPivotX.2
                private static int values = 1;
                private static int writeReplace;

                public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2, int i5, int i6, int i7) {
                    int i8 = ~i5;
                    int i9 = ~i6;
                    int i10 = (i5 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE) + (i6 * (-282)) + (((~(i6 | i8)) | (~(i8 | i7))) * (-283)) + ((~(i5 | i9)) * 283) + ((~(i8 | i9 | i7)) * 283);
                    if (i10 == 1) {
                        com.payair.hce.setPivotX.AnonymousClass2 anonymousClass2 = (com.payair.hce.setPivotX.AnonymousClass2) objArr2[0];
                        java.lang.String str = (java.lang.String) objArr2[1];
                        byte[] bArr = (byte[]) objArr2[2];
                        values = (writeReplace + 13) % 128;
                        byte[] values2 = com.payair.hce.setPivotX.this.values(str, bArr);
                        values = ((-2) - (~(writeReplace + 112))) % 128;
                        return values2;
                    }
                    if (i10 == 2) {
                        return writeReplace(objArr2);
                    }
                    com.payair.hce.setPivotX.AnonymousClass2 anonymousClass22 = (com.payair.hce.setPivotX.AnonymousClass2) objArr2[0];
                    java.lang.String str2 = (java.lang.String) objArr2[1];
                    int i11 = writeReplace;
                    int i12 = i11 ^ 125;
                    int i13 = (i11 & 125) << 1;
                    values = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                    com.payair.hce.setPivotX.this.valueOf(str2);
                    values = (writeReplace + 37) % 128;
                    return null;
                }

                private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2) {
                    com.payair.hce.setPivotX.AnonymousClass2 anonymousClass2 = (com.payair.hce.setPivotX.AnonymousClass2) objArr2[0];
                    java.lang.String str = (java.lang.String) objArr2[1];
                    byte[] bArr = (byte[]) objArr2[2];
                    int i5 = writeReplace;
                    int i6 = i5 ^ 7;
                    values = (((((i5 & 7) | i6) << 1) - (~(-i6))) - 1) % 128;
                    byte[] writeReplace2 = com.payair.hce.setPivotX.this.writeReplace(str, bArr);
                    int i7 = writeReplace;
                    int i8 = i7 & 101;
                    int i9 = (i8 - (~(-(-((i7 ^ 101) | i8))))) - 1;
                    values = i9 % 128;
                    if (i9 % 2 != 0) {
                        return writeReplace2;
                    }
                    throw null;
                }

                @Override // com.payair.hce.setScaleY
                public final void valueOf(java.lang.String str) throws java.security.KeyStoreException {
                    values(new java.lang.Object[]{this, str}, -1790455064, 1790455064, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.setScaleY
                public final byte[] AlternateContactlessPaymentDataJson(java.lang.String str, byte[] bArr) throws java.security.GeneralSecurityException {
                    return (byte[]) values(new java.lang.Object[]{this, str, bArr}, -67100912, 67100913, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.setScaleY
                public final byte[] DigitizedCardProfile(java.lang.String str, byte[] bArr) throws java.security.GeneralSecurityException {
                    return (byte[]) values(new java.lang.Object[]{this, str, bArr}, 717345266, -717345264, java.lang.System.identityHashCode(this));
                }
            };
            setpivotx.IccPrivateKeyCrtComponentsJson = new com.payair.hce.setPivotY(setpivotx.valueOf, setscaley, "CUR_DST_DEK_KEY_ID", "CRYPTO_DST_DEK_KEK", "ALT_DST_DEK_KEY_ID");
            setpivotx.getGpoResponse = new com.payair.hce.setPivotY(setpivotx.valueOf, setscaley2, "CUR_DST_MAC_KEY_ID", "CRYPTO_DST_MAC_KEK", "ALT_DST_MAC_KEY_ID");
            setpivotx.getAid = new com.payair.hce.setPivotY(setpivotx.valueOf, setscaley, "CUR_RM_KEK_KEY_ID", "CRYPTO_RM_KEK_KEK", "ALT_RM_KEK_KEY_ID");
            setpivotx.RecordsJson = new com.payair.hce.setPivotY(setpivotx.valueOf, setscaley, "CUR_L_DEK_KEY_ID", "CRYPTO_L_DEK_KEK", "ALT_L_DEK_KEY_ID");
            setpivotx.SdkCoreBusinessLogicModuleImpl = new com.payair.hce.setPivotY(setpivotx.valueOf, setscaley, "CUR_W_DEK_KEY_ID", "CRYPTO_W_DEK_KEK", "ALT_W_DEK_KEY_ID");
            setpivotx.getPaymentFci();
            int i5 = getCardholderValidators;
            getAdditionalCheckTable = ((((i5 & (-60)) | ((~i5) & 59)) - (~((i5 & 59) << 1))) - 1) % 128;
            return null;
        } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.NoSuchProviderException | java.security.UnrecoverableKeyException e) {
            try {
                int i6 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                int identityHashCode = java.lang.System.identityHashCode(setpivotx);
                int i7 = i6 * 881;
                int i8 = ~i6;
                int i9 = i8 ^ (-2);
                int i10 = i8 & (-2);
                int i11 = (i9 ^ i10) | (i9 & i10);
                int i12 = ~i11;
                int i13 = (i11 | i12) & i12;
                int i14 = (i8 | i6) & i8;
                int i15 = i14 & identityHashCode;
                int i16 = ~(((i14 | identityHashCode) & (~i15)) | i15);
                int i17 = i13 & i16;
                int i18 = (i13 | i16) & (~i17);
                int i19 = (i18 ^ i17) | (i18 & i17);
                int i20 = identityHashCode & (-2);
                int i21 = (identityHashCode | (-2)) & (~i20);
                int i22 = ~((i20 ^ i21) | (i21 & i20));
                int i23 = i19 ^ i22;
                int i24 = i19 & i22;
                int i25 = (((-2) - (~((i7 ^ 882) + ((i7 & 882) << 1)))) - (~(((i24 ^ i23) | (i24 & i23)) * (-880)))) - 1;
                int i26 = ~identityHashCode;
                int i27 = ~((i26 & i8) | (i8 ^ i26));
                int i28 = ((~i27) & 1) | (i27 & (-2));
                int i29 = i27 & 1;
                int i30 = (i29 ^ i28) | (i29 & i28);
                int i31 = (i8 & identityHashCode) | (i26 & i6);
                int i32 = identityHashCode & i6;
                int i33 = ~(i31 | i32);
                int i34 = i30 & i33;
                int i35 = (i33 | i30) & (~i34);
                int i36 = -(-(((i35 ^ i34) | (i35 & i34)) * (-880)));
                int i37 = i25 & i36;
                int i38 = ((i36 | i25) & (~i37)) + (i37 << 1);
                int i39 = -(~(-(-((~((i32 ^ i31) | (i32 & i31))) * 880))));
                int i40 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i41 = ((i40 ^ 38) | (i40 & 38)) << 1;
                int i42 = -(((~i40) & 38) | (i40 & (-39)));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((((i38 | i39) << 1) - (i39 ^ i38)) - 1, ((i41 | i42) << 1) - (i42 ^ i41), (char) android.text.TextUtils.indexOf("", "", 0), objArr2);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.Throwable.class).newInstance(e));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private void getPaymentFci() throws java.security.GeneralSecurityException {
        try {
            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson("112233445566778899");
            valueOf(AlternateContactlessPaymentDataJson.DigitizedCardProfile());
            byte[] bArr = (byte[]) valueOf(new java.lang.Object[]{80}, 1285877597, -1285877579, 80);
            byte[] bArr2 = (byte[]) valueOf(new java.lang.Object[]{16}, 1285877597, -1285877579, 16);
            try {
                byte[] DigitizedCardProfile = DigitizedCardProfile((byte[]) valueOf(new java.lang.Object[]{this, bArr, bArr2}, 231582132, -231582120, java.lang.System.identityHashCode(this)), bArr2, com.payair.hce.setPivotX.values.DigitizedCardProfile);
                int i = getAdditionalCheckTable;
                int i2 = i ^ 55;
                int i3 = ((i & 55) | i2) << 1;
                int i4 = -i2;
                getCardholderValidators = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
                java.math.BigInteger bigInteger = new java.math.BigInteger(com.payair.hce.cancelAvailabilityErrorNotifications.DigitizedCardProfile("EQ=="));
                java.math.BigInteger bigInteger2 = new java.math.BigInteger(com.payair.hce.cancelAvailabilityErrorNotifications.DigitizedCardProfile("AIASoe2PQb1IP7bTyC9usjHP7FvnUMVpKW49iuFtrw/dMpYlsMMoIU2jupfifDpdFxIktSB4P+6Ymg5WjvHKTIrvQ7SR4zV4jaPTu56Ys0pZ9EDA6gb3HLjtU+8Bb1mfWM+yjKxcPDuFjwEtjGlPHg1Vq+CA9HNcMSKNn2+tW6qt"));
                com.payair.hce.setContentInsetsAbsolute setcontentinsetsabsolute = new com.payair.hce.setContentInsetsAbsolute(bigInteger2, bigInteger, new java.math.BigInteger(com.payair.hce.cancelAvailabilityErrorNotifications.DigitizedCardProfile("DxFAOhDajr00rBjqX+7nyZ/9sHWRCCp9WEN5wCsFiWVRPtdB+NeLcou7mWXwf1Y+8xNgmmh//fPV45G2dsyBeZbXeJwB7bzx9NMEAfedchyOwjR8PYdjK3NpTLKtZlEJ6Jkh4QihrXpZMO4fKZWUm9bid3+lmiq43FwW+Hof8/E=")), new java.math.BigInteger(com.payair.hce.cancelAvailabilityErrorNotifications.DigitizedCardProfile("AJ9StyTVW+AL/1s7RBtFwZGFBgd3zctBqzzwKPda6LbtIFDznmwDCqAlIQH9X14X7UPLokCDhuAa76OnDXb1OiE=")), new java.math.BigInteger(com.payair.hce.cancelAvailabilityErrorNotifications.DigitizedCardProfile("AM3JfD79dNJ5A3beScSzPtWxx/tSLi0QHFtkuhtSizeXdkv5FSba7lVzwEOGKHmW829bRoNxThDy4ds1IihW1w0=")), new java.math.BigInteger(com.payair.hce.cancelAvailabilityErrorNotifications.DigitizedCardProfile("JXzfzG5v+HtLJIZqYMUefJfFLu8DPuJGaLD6lI3cZ0babWZ/oPGoJa5iHpX4Ul/7l3s1PFsuy1GhzCdOdlfRcQ==")), new java.math.BigInteger(com.payair.hce.cancelAvailabilityErrorNotifications.DigitizedCardProfile("YNdJhw3cn0gBoVmMIFRZzflPDNthBiWy/dUMSRfJCxoZjSnr1gysZHK01HteV1YYNGcwPdr3j4FbOfri5c6DUQ==")), new java.math.BigInteger(com.payair.hce.cancelAvailabilityErrorNotifications.DigitizedCardProfile("Lt0g7wrsNsQxuDdB8q/rH8fSFeBXMGLtCIqfOec1j7FEIuYA/ACiRDgXkHa0WgN7nLXSjHoy630wC5Toq8vvUg==")));
                int bitLength = bigInteger2.bitLength() / 8;
                AlternateContactlessPaymentDataJson(setcontentinsetsabsolute, bigInteger2.bitLength() / 8);
                int i5 = getCardholderValidators + 31;
                getAdditionalCheckTable = i5 % 128;
                int i6 = i5 % 2;
                byte[] writeReplace = this.SdkCoreAlternateContactlessPaymentDataImpl.writeReplace(new byte[bitLength], 0, bitLength);
                int i7 = getCardholderValidators;
                int i8 = (i7 & (-102)) | ((~i7) & 101);
                int i9 = (i7 & 101) << 1;
                int i10 = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
                getAdditionalCheckTable = i10;
                int i11 = ((i10 ^ 107) | (i10 & 107)) << 1;
                int i12 = -(((~i10) & 107) | (i10 & (-108)));
                getCardholderValidators = ((i11 & i12) + (i11 | i12)) % 128;
                int length = writeReplace.length;
                int length2 = DigitizedCardProfile.length;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i13 = ((length2 * (-183)) - (~(-(~(-(-(length * (-183)))))))) - 1;
                int i14 = (~i13) + (i13 << 1);
                int i15 = ~length2;
                int i16 = ~identityHashCode;
                int i17 = i15 ^ i16;
                int i18 = i15 & i16;
                int i19 = (i17 ^ i18) | (i17 & i18);
                int i20 = (i19 ^ length) | (i19 & length);
                int i21 = ~i20;
                int i22 = (i20 | i21) & i21;
                int i23 = ~length;
                int i24 = (i23 & i16) | ((~i16) & i23) | ((~i23) & i16);
                int i25 = i24 & length2;
                int i26 = (i24 | length2) & (~i25);
                int i27 = ~((i26 & i25) | (i26 ^ i25));
                int i28 = -(-(((i22 & i27) | ((~i22) & i27) | ((~i27) & i22)) * (-184)));
                int i29 = i15 & i23;
                int i30 = (~i29) & (i15 | i23);
                int i31 = ~((i29 ^ i30) | (i29 & i30));
                int i32 = (i15 | i16) & (~i18);
                int i33 = ~((i32 ^ i18) | (i32 & i18));
                int i34 = ((~i33) & i31) | ((~i31) & i33);
                int i35 = i33 & i31;
                int i36 = (i35 ^ i34) | (i35 & i34);
                int i37 = ~(i16 | i23);
                int i38 = ((~i37) & i36) | ((~i36) & i37);
                int i39 = i37 & i36;
                int i40 = (((i14 & i28) + (i14 | i28)) - (~(-(~(((i39 ^ i38) | (i39 & i38)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))))) - 2;
                int i41 = -(-((length | length2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                byte[] bArr3 = new byte[((((i41 & i40) | (i40 ^ i41)) << 1) - (~(-(((~i40) & i41) | ((~i41) & i40))))) - 1];
                java.lang.System.arraycopy(DigitizedCardProfile, 0, bArr3, 0, DigitizedCardProfile.length);
                java.lang.System.arraycopy(writeReplace, 0, bArr3, DigitizedCardProfile.length, writeReplace.length);
                int i42 = getAdditionalCheckTable;
                int i43 = (i42 & (-24)) | ((~i42) & 23);
                int i44 = -(-((i42 & 23) << 1));
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                getCardholderValidators = i45 % 128;
                if (i45 % 2 != 0) {
                    throw null;
                }
            } catch (java.security.GeneralSecurityException | java.lang.Exception unused) {
            }
        } catch (java.lang.Exception e) {
            try {
                java.lang.Object[] objArr = {e.toString()};
                int i46 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int i47 = ~i46;
                int i48 = (i46 | i47) << 1;
                int i49 = -i47;
                int size = android.view.View.MeasureSpec.getSize(0);
                int identityHashCode2 = java.lang.System.identityHashCode(this);
                int i50 = size * (-520);
                int i51 = i50 & 19836;
                int i52 = (i50 | 19836) & (~i51);
                int i53 = i51 << 1;
                int i54 = (i52 & i53) + (i52 | i53);
                int i55 = ~size;
                int i56 = i55 & (-39);
                int i57 = ((~i55) & 38) | i56;
                int i58 = i55 & 38;
                int i59 = (i57 ^ i58) | (i58 & i57);
                int i60 = ~identityHashCode2;
                int i61 = (i59 & i60) | ((~i59) & identityHashCode2);
                int i62 = i59 & identityHashCode2;
                int i63 = (~((i62 ^ i61) | (i62 & i61))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                int i64 = i54 | i63;
                int i65 = (i64 << 1) - ((~(i54 & i63)) & i64);
                int i66 = i56 | (size & 38);
                int i67 = size & (-39);
                int i68 = (i66 & i67) | (i66 ^ i67);
                int i69 = ~i68;
                int i70 = -(-(((i68 | i69) & i69) * (-1042)));
                int i71 = ~(i66 | i67);
                int i72 = (size | i55) & i55;
                int i73 = (identityHashCode2 | i60) & i60;
                int i74 = (i72 ^ i73) | (i72 & i73);
                int i75 = ~(((~i74) & 38) | (i74 & (-39)) | (i74 & 38));
                int i76 = -(~(-(-(((i75 & (~i71)) | ((~i75) & i71) | (i75 & i71)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))));
                int i77 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int identityHashCode3 = java.lang.System.identityHashCode(this);
                int i78 = i77 * 758;
                int i79 = (i78 ^ (-756)) + ((i78 & (-756)) << 1);
                int i80 = ~identityHashCode3;
                int i81 = -(-(((i77 ^ i80) | (i77 & i80)) * (-757)));
                int i82 = i79 & i81;
                int i83 = i77 ^ (-2);
                int i84 = ~i77;
                int i85 = i77 & (-2);
                int i86 = (i83 & i85) | (i83 ^ i85);
                int i87 = i86 ^ identityHashCode3;
                int i88 = i86 & identityHashCode3;
                int i89 = (((i82 - (~((i79 ^ i81) | i82))) - 1) - (~(-(~((~((i88 & i87) | (i87 ^ i88))) * 1514))))) - 2;
                int i90 = (i84 ^ (-2)) | (i84 & (-2));
                int i91 = ~i90;
                int i92 = (i90 | i91) & i91;
                int i93 = ((~i80) & (-2)) | (i80 & 1);
                int i94 = i80 & (-2);
                int i95 = ~((i94 & i93) | (i93 ^ i94));
                int i96 = (i92 ^ i95) | (i95 & i92);
                int i97 = i85 | (i84 & 1);
                int i98 = i77 & 1;
                int i99 = (i97 ^ i98) | (i98 & i97);
                int i100 = ~(((~i99) & identityHashCode3) | (i80 & i99) | (i99 & identityHashCode3));
                int i101 = ((i100 ^ i96) | (i100 & i96)) * 757;
                int i102 = i89 & i101;
                char c = (char) (i102 + ((i101 ^ i89) | i102));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((i48 ^ i49) + ((i48 & i49) << 1), (((((~i70) & i65) | ((~i65) & i70)) + ((i70 & i65) << 1)) - (~i76)) - 2, c, objArr2);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private void SdkCoreBusinessLogicModuleImpl() {
        int i = getCardholderValidators;
        int i2 = i & 23;
        getAdditionalCheckTable = (i2 + ((i ^ 23) | i2)) % 128;
        DigitizedCardProfile("CUR_DST_DEK_KEY_ID", (java.lang.String) valueOf(new java.lang.Object[]{this}, 802533406, -802533378, java.lang.System.identityHashCode(this)));
        DigitizedCardProfile("CUR_L_DEK_KEY_ID", (java.lang.String) valueOf(new java.lang.Object[]{this}, 802533406, -802533378, java.lang.System.identityHashCode(this)));
        DigitizedCardProfile("CUR_RM_KEK_KEY_ID", (java.lang.String) valueOf(new java.lang.Object[]{this}, 802533406, -802533378, java.lang.System.identityHashCode(this)));
        DigitizedCardProfile("CUR_W_DEK_KEY_ID", (java.lang.String) valueOf(new java.lang.Object[]{this}, 802533406, -802533378, java.lang.System.identityHashCode(this)));
        DigitizedCardProfile("CUR_DST_MAC_KEY_ID", (java.lang.String) valueOf(new java.lang.Object[]{this}, 802533406, -802533378, java.lang.System.identityHashCode(this)));
        int i3 = getCardholderValidators;
        getAdditionalCheckTable = (((i3 | 1) << 1) - (i3 ^ 1)) % 128;
    }

    private void DigitizedCardProfile(java.lang.String str, java.lang.String str2) {
        int i = getAdditionalCheckTable;
        int i2 = (i | 117) << 1;
        int i3 = -((i & (-118)) | ((~i) & 117));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getCardholderValidators = i4 % 128;
        if (i4 % 2 == 0) {
            com.payair.hce.setLeft.values(new java.lang.Object[]{str, str2, this.valueOf}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
            int i5 = getAdditionalCheckTable;
            int i6 = ((i5 ^ 37) | (i5 & 37)) << 1;
            int i7 = -((i5 & (-38)) | ((~i5) & 37));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            getCardholderValidators = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            return;
        }
        com.payair.hce.setLeft.values(new java.lang.Object[]{str, str2, this.valueOf}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    final java.lang.String writeReplace(java.lang.String str) {
        int i = getAdditionalCheckTable;
        int i2 = i & 95;
        int i3 = ((i ^ 95) | i2) << 1;
        int i4 = -((i | 95) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        getCardholderValidators = i5 % 128;
        if (i5 % 2 == 0) {
            return (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{str, null, this.valueOf}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis());
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCardholderValidators(java.lang.Object[] objArr) {
        java.lang.String str;
        com.payair.hce.setVisibility setvisibility;
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        do {
            try {
                str = (java.lang.String) valueOf(new java.lang.Object[0], 1101484017, -1101483998, (int) java.lang.System.currentTimeMillis());
                setvisibility = setpivotx.writeReplace;
            } catch (java.lang.Exception unused) {
                return null;
            }
        } while (((java.lang.Boolean) com.payair.hce.setFitsSystemWindows.values(new java.lang.Object[]{setvisibility, str}, -1391855168, 1391855178, java.lang.System.identityHashCode(setvisibility))).booleanValue());
        int i = getAdditionalCheckTable;
        int i2 = i & 13;
        int i3 = -(-((i ^ 13) | i2));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        getCardholderValidators = i4;
        int i5 = i4 & 105;
        getAdditionalCheckTable = ((i5 - (~((i4 ^ 105) | i5))) - 1) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object getSecurityWord(java.lang.Object[] objArr) {
        int i = getCardholderValidators;
        int i2 = (((i | 91) << 1) - (i ^ 91)) % 128;
        getAdditionalCheckTable = i2;
        int i3 = (i2 & (-78)) | ((~i2) & 77);
        int i4 = (i2 & 77) << 1;
        getCardholderValidators = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        try {
            try {
                int i5 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i6 = i5 & 38;
                int i7 = (i5 ^ 38) | i6;
                int i8 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
                int i9 = i8 ^ 26;
                int i10 = ((i8 & 26) | i9) << 1;
                int i11 = -i9;
                int i12 = -(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((i6 & i7) + (i7 | i6), (i10 & i11) + (i10 | i11), (char) ((i12 & 28991) + (i12 | 28991)), objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i13 = capsMode * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
                int i14 = (2130153131 ^ i13) + ((i13 & 2130153131) << 1);
                int i15 = ~capsMode;
                int i16 = (i15 & 29496719) | ((~i15) & (-29496720));
                int i17 = i15 & (-29496720);
                int i18 = (i16 ^ i17) | (i16 & i17);
                int i19 = ~i18;
                int i20 = (i18 | i19) & i19;
                int i21 = ~currentTimeMillis;
                int i22 = i21 & capsMode;
                int i23 = (~i22) & (i21 | capsMode);
                int i24 = (i23 ^ i22) | (i22 & i23);
                int i25 = ((~i24) & 29496719) | (i24 & (-29496720));
                int i26 = i24 & 29496719;
                int i27 = ~((i25 ^ i26) | (i26 & i25));
                int i28 = -(~(((i20 ^ i27) | (i27 & i20)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                int i29 = i21 & (i21 | currentTimeMillis);
                int i30 = i29 & 29496719;
                int i31 = (i29 | 29496719) & (~i30);
                int i32 = (i31 ^ i30) | (i31 & i30);
                int i33 = ~i32;
                int i34 = (i32 | i33) & i33;
                int i35 = (i15 & i34) | ((~i34) & capsMode);
                int i36 = i34 & capsMode;
                int i37 = capsMode ^ 29496719;
                int i38 = capsMode & 29496719;
                int i39 = (i38 ^ i37) | (i37 & i38);
                int i40 = -(~(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                int i41 = -android.text.TextUtils.getTrimmedLength("");
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i42 = i41 * 165;
                int i43 = (i42 ^ 3912) + ((i42 & 3912) << 1);
                int i44 = ~currentTimeMillis2;
                int i45 = ~((i44 & (-24)) | (i44 ^ (-24)));
                int i46 = i41 & i45;
                int i47 = (~i46) & (i45 | i41);
                int i48 = -(-(((i47 ^ i46) | (i47 & i46)) * (-328)));
                int i49 = (i43 | i48) << 1;
                int i50 = -(((~i48) & i43) | ((~i43) & i48));
                int i51 = (i49 & i50) + (i50 | i49);
                int i52 = i41 & currentTimeMillis2;
                int i53 = (~i52) & (i41 | currentTimeMillis2);
                int i54 = ((i52 ^ i53) | (i52 & i53)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                int i55 = i51 & i54;
                int i56 = -(-((i54 ^ i51) | i55));
                int i57 = (i55 & i56) + (i56 | i55);
                int i58 = ~i41;
                int i59 = (i58 & (-24)) | ((~i58) & 23);
                int i60 = i58 & 23;
                int i61 = (i60 ^ i59) | (i60 & i59);
                int i62 = ~i61;
                int i63 = (i61 | i62) & i62;
                int i64 = currentTimeMillis2 ^ 23;
                int i65 = currentTimeMillis2 & 23;
                int i66 = ~((i64 ^ i65) | (i65 & i64));
                int i67 = (i63 ^ i66) | (i63 & i66);
                int i68 = ~((i41 & i44) | (i44 ^ i41) | (-24));
                int i69 = ((i67 ^ i68) | (i68 & i67)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                int i70 = -(android.os.Process.myTid() >> 22);
                byte b = (byte) (((i70 | (-98)) << 1) - (i70 ^ (-98)));
                int i71 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                int i72 = i71 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
                int i73 = i72 | (-12397);
                int i74 = i73 << 1;
                int i75 = -((~(i72 & (-12397))) & i73);
                int i76 = (i74 & i75) + (i75 | i74);
                int i77 = ~i71;
                int i78 = i77 & (i77 | i71);
                int i79 = i78 & 48;
                int i80 = (~i79) & (i78 | 48);
                int i81 = ~((i79 ^ i80) | (i80 & i79));
                int i82 = ~currentTimeMillis3;
                int i83 = i82 & 48;
                int i84 = (~i83) & (i82 | 48);
                int i85 = (i84 ^ i83) | (i84 & i83);
                int i86 = ~i85;
                int i87 = (i85 | i86) & i86;
                int i88 = i81 & i87;
                int i89 = (i81 | i87) & (~i88);
                int i90 = (i89 ^ i88) | (i89 & i88);
                int i91 = i71 ^ (-49);
                int i92 = i71 & (-49);
                int i93 = (i91 & i92) | (i91 ^ i92);
                int i94 = i93 & currentTimeMillis3;
                int i95 = (i93 | currentTimeMillis3) & (~i94);
                int i96 = ~((i94 ^ i95) | (i95 & i94));
                int i97 = ((~i96) & i90) | ((~i90) & i96);
                int i98 = i90 & i96;
                int i99 = -(~(((i98 ^ i97) | (i98 & i97)) * (-252)));
                int i100 = (i76 ^ i99) + ((i99 & i76) << 1);
                int i101 = (~i100) + (i100 << 1);
                int i102 = ((~i92) & (i71 | (-49))) | i92;
                int i103 = i102 * (-252);
                int i104 = ((~i103) & i101) | ((~i101) & i103);
                int i105 = -(-((i101 & i103) << 1));
                int i106 = ((i104 | i105) << 1) - (i105 ^ i104);
                int i107 = (i82 | currentTimeMillis3) & i82;
                int i108 = (i107 ^ 48) | (i107 & 48);
                int i109 = i108 ^ i71;
                int i110 = i108 & i71;
                int i111 = ~((i110 ^ i109) | (i110 & i109));
                int i112 = ~(i102 | currentTimeMillis3);
                int i113 = i111 & i112;
                int i114 = (i111 | i112) & (~i113);
                int i115 = -(~(-(-(((i114 ^ i113) | (i114 & i113)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))));
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b(((((((i14 | i28) << 1) - (i28 ^ i14)) - 1) + (((i36 & i35) | (i35 ^ i36)) * (-440))) - (~(((i39 & currentTimeMillis) | (i39 ^ currentTimeMillis)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) - 1, (((i40 | 976674647) << 1) - (i40 ^ 976674647)) - 1, (i57 ^ i69) + ((i69 & i57) << 1), b, (short) ((-2) - (~((i106 & i115) + (i115 | i106)))), objArr3);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, "SHA1PRNG");
                int i116 = getCardholderValidators;
                int i117 = i116 & 65;
                int i118 = (i116 ^ 65) | i117;
                int i119 = (((i117 | i118) << 1) - (i118 ^ i117)) % 128;
                getAdditionalCheckTable = i119;
                getCardholderValidators = (i119 + 7) % 128;
                try {
                    int i120 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                    int i121 = i120 * (-496);
                    int i122 = (-1745475696) & i121;
                    int i123 = (((-1745475696) ^ i121) | i122) << 1;
                    int i124 = -((i121 | (-1745475696)) & (~i122));
                    int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
                    int i126 = ~i120;
                    int i127 = (i126 | i120) & i126;
                    int i128 = (29496729 & i127) | ((~i127) & (-29496730));
                    int i129 = i127 & (-29496730);
                    int i130 = (i128 ^ i129) | (i128 & i129);
                    int i131 = ~i130;
                    int i132 = -(-(((i130 | i131) & i131) * 497));
                    int i133 = i125 & i132;
                    int i134 = ((i125 | i132) & (~i133)) + (i133 << 1);
                    int i135 = 29496729 & i126;
                    int i136 = ((~i126) & (-29496730)) | i135;
                    int i137 = i126 & (-29496730);
                    int i138 = (i136 ^ i137) | (i136 & i137);
                    int i139 = i138 & currentTimeMillis4;
                    int i140 = ~(((i138 | currentTimeMillis4) & (~i139)) | i139);
                    int i141 = ~currentTimeMillis4;
                    int i142 = (i141 | currentTimeMillis4) & i141;
                    int i143 = (i142 & (-29496730)) | ((~i142) & (-29496730)) | (29496729 & i142);
                    int i144 = ~((i143 ^ i120) | (i143 & i120));
                    int i145 = ((~i144) & i140) | ((~i140) & i144);
                    int i146 = i140 & i144;
                    int i147 = -(-(((i146 ^ i145) | (i146 & i145)) * 497));
                    int i148 = i134 & i147;
                    int i149 = i134 | i147;
                    int i150 = (i148 ^ i149) + ((i149 & i148) << 1);
                    int i151 = i127 ^ i141;
                    int i152 = i127 & i141;
                    int i153 = ~((i151 ^ i152) | (i152 & i151));
                    int i154 = ~(((i126 | 29496729) & (~i135)) | i135);
                    int i155 = ((~i154) & i153) | ((~i153) & i154);
                    int i156 = i154 & i153;
                    int i157 = (i156 ^ i155) | (i156 & i155);
                    int i158 = (i120 ^ (-29496730)) | (i120 & (-29496730));
                    int i159 = ~(((~i158) & currentTimeMillis4) | (i158 & i141) | (i158 & currentTimeMillis4));
                    int i160 = i157 & i159;
                    int i161 = (i159 | i157) & (~i160);
                    int i162 = -(-(((i161 ^ i160) | (i161 & i160)) * 497));
                    int myPid = android.os.Process.myPid() >> 22;
                    int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                    int i163 = ~currentTimeMillis5;
                    int i164 = (-976674655) ^ i163;
                    int i165 = (-976674655) & i163;
                    int i166 = ~((i164 ^ i165) | (i165 & i164));
                    int i167 = myPid & i163;
                    int i168 = ((~myPid) & currentTimeMillis5) | i167;
                    int i169 = i163 ^ myPid;
                    int i170 = myPid & currentTimeMillis5;
                    int i171 = ~((i168 ^ i170) | (i170 & i168));
                    int i172 = i166 & i171;
                    int i173 = (i166 | i171) & (~i172);
                    int i174 = (((-2) - (~((myPid * 960) + 320429339))) - (~(((i173 ^ i172) | (i173 & i172)) * 959))) - 1;
                    int i175 = 328123617 ^ i174;
                    int i176 = ((i174 & 328123617) | i175) << 1;
                    int i177 = -i175;
                    int i178 = ~(currentTimeMillis5 | (-976674655));
                    int i179 = (i169 & i167) | (i169 ^ i167);
                    int i180 = ~i179;
                    int i181 = (i179 | i180) & i180;
                    int i182 = -(~(-(-(((i178 ^ i181) | (i178 & i181)) * 959))));
                    int i183 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                    int i184 = i183 * 503;
                    int i185 = (i184 & (-11569)) + (i184 | (-11569));
                    int i186 = i183 ^ (-23);
                    int i187 = i183 & (-23);
                    int i188 = ((i186 ^ i187) | (i186 & i187)) * (-502);
                    int i189 = i185 & i188;
                    int i190 = ((i185 ^ i188) | i189) << 1;
                    int i191 = -((i188 | i185) & (~i189));
                    int i192 = (i190 & i191) + (i191 | i190);
                    int i193 = ~i183;
                    int i194 = i193 & (-23);
                    int i195 = ((~i193) & 22) | i194;
                    int i196 = i193 & 22;
                    int i197 = (i196 & i195) | (i195 ^ i196);
                    int i198 = ~i197;
                    int i199 = (i197 | i198) & i198;
                    int i200 = ~currentTimeMillis6;
                    int i201 = i193 ^ i200;
                    int i202 = i193 & i200;
                    int i203 = ~((i201 ^ i202) | (i201 & i202));
                    int i204 = (i199 ^ i203) | (i203 & i199);
                    int i205 = i194 | (i183 & 22) | i187;
                    int i206 = ~((i205 & currentTimeMillis6) | (i205 ^ currentTimeMillis6));
                    int i207 = i204 & i206;
                    int i208 = -(-((((~i207) & (i204 | i206)) | i207) * (-502)));
                    int i209 = (i192 & i208) + (i208 | i192);
                    int i210 = ((~i202) & (i193 | i200)) | i202;
                    int i211 = (i210 & 22) | ((~i210) & (-23));
                    int i212 = i210 & (-23);
                    int i213 = ~((i212 ^ i211) | (i212 & i211));
                    int i214 = ((i183 | (-23)) & (~i187)) | i187;
                    int i215 = i214 & currentTimeMillis6;
                    int i216 = (i214 | currentTimeMillis6) & (~i215);
                    int i217 = ~((i216 ^ i215) | (i216 & i215));
                    int i218 = i213 & i217;
                    int i219 = (i213 | i217) & (~i218);
                    int i220 = -(-(((i219 ^ i218) | (i219 & i218)) * 502));
                    int i221 = -(((~i209) & i220) | ((~i220) & i209));
                    int i222 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
                    int i223 = i222 * 165;
                    int i224 = (i223 & 20212) + (i223 | 20212);
                    int i225 = ~currentTimeMillis7;
                    int i226 = (i225 | currentTimeMillis7) & i225;
                    int i227 = i226 & (-124);
                    int i228 = (i226 | (-124)) & (~i227);
                    int i229 = ~((i228 ^ i227) | (i228 & i227));
                    int i230 = ~i222;
                    int i231 = ((~i229) & i222) | (i229 & i230);
                    int i232 = i229 & i222;
                    int i233 = ((i232 & i231) | (i232 ^ i231)) * (-328);
                    int i234 = i224 & i233;
                    int i235 = -(-((i224 ^ i233) | i234));
                    int i236 = (i234 & i235) + (i235 | i234);
                    int i237 = i222 & i225;
                    int i238 = (currentTimeMillis7 & i230) | i237;
                    int i239 = i222 & currentTimeMillis7;
                    int i240 = -(-(((i238 & i239) | (i238 ^ i239)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                    int i241 = i236 & i240;
                    int i242 = (i241 - (~(-(-((i236 ^ i240) | i241))))) - 1;
                    int i243 = ~((i230 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | (i230 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
                    int i244 = currentTimeMillis7 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    int i245 = (currentTimeMillis7 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i244);
                    int i246 = ~((i245 ^ i244) | (i245 & i244));
                    int i247 = (i246 ^ i243) | (i246 & i243);
                    int i248 = (i222 & (~i225)) | (i225 & i230);
                    int i249 = (i248 ^ i237) | (i237 & i248);
                    int i250 = (i249 ^ (-124)) | (i249 & (-124));
                    int i251 = ~i250;
                    int i252 = (i250 | i251) & i251;
                    int i253 = ((i252 ^ i247) | (i252 & i247)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                    int i254 = i242 & i253;
                    int i255 = (i253 | i242) & (~i254);
                    int i256 = -(-(i254 << 1));
                    byte b2 = (byte) ((i255 ^ i256) + ((i255 & i256) << 1));
                    int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                    int currentTimeMillis8 = (int) java.lang.System.currentTimeMillis();
                    int i257 = pressedStateDuration * (-496);
                    int i258 = (-53568) | i257;
                    int i259 = (i258 << 1) - ((~(i257 & (-53568))) & i258);
                    int i260 = ~pressedStateDuration;
                    int i261 = i260 & (-109);
                    int i262 = (~i261) & (i260 | (-109));
                    int i263 = -(-((~((i261 ^ i262) | (i261 & i262))) * 497));
                    int i264 = i259 & i263;
                    int i265 = -(-(i263 | i259));
                    int i266 = ((i264 | i265) << 1) - (i265 ^ i264);
                    int i267 = (i260 | pressedStateDuration) & i260;
                    int i268 = (i267 ^ (-109)) | (i267 & (-109));
                    int i269 = ~currentTimeMillis8;
                    int i270 = ((~i268) & currentTimeMillis8) | (i268 & i269);
                    int i271 = i268 & currentTimeMillis8;
                    int i272 = ~((i270 & i271) | (i270 ^ i271));
                    int i273 = i269 & (-109);
                    int i274 = (~i273) & (i269 | (-109));
                    int i275 = (i274 ^ i273) | (i273 & i274);
                    int i276 = ((~i275) & pressedStateDuration) | (i275 & i260);
                    int i277 = i275 & pressedStateDuration;
                    int i278 = ~((i277 & i276) | (i277 ^ i276));
                    int i279 = i272 ^ i278;
                    int i280 = i272 & i278;
                    int i281 = -(-(((i280 ^ i279) | (i280 & i279)) * 497));
                    int i282 = i266 & i281;
                    int i283 = -(-((i281 ^ i266) | i282));
                    int i284 = (i282 & i283) + (i283 | i282);
                    int i285 = (i269 | currentTimeMillis8) & i269;
                    int i286 = i260 ^ i285;
                    int i287 = i285 & i260;
                    int i288 = ~((i287 ^ i286) | (i287 & i286));
                    int i289 = i260 ^ 108;
                    int i290 = i260 & 108;
                    int i291 = ~((i290 ^ i289) | (i289 & i290));
                    int i292 = (i288 ^ i291) | (i288 & i291);
                    int i293 = (pressedStateDuration ^ (-109)) | (pressedStateDuration & (-109));
                    int i294 = i293 ^ currentTimeMillis8;
                    int i295 = i293 & currentTimeMillis8;
                    int i296 = ~((i295 ^ i294) | (i295 & i294));
                    int i297 = ((~i296) & i292) | ((~i292) & i296);
                    int i298 = i292 & i296;
                    int i299 = -(-(((i298 ^ i297) | (i298 & i297)) * 497));
                    int i300 = i284 ^ i299;
                    int i301 = ((i299 & i284) | i300) << 1;
                    int i302 = -i300;
                    short s = (short) ((i301 & i302) + (i301 | i302));
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b(((((~i162) & i150) | ((~i150) & i162)) - (~((i162 & i150) << 1))) - 1, (((i176 ^ i177) + ((i176 & i177) << 1)) - (~i182)) - 2, ((((i220 & i209) | (i209 ^ i220)) << 1) - (~i221)) - 1, b2, s, objArr4);
                    java.lang.String num = java.lang.Integer.toString(((java.lang.Integer) java.util.Random.class.getMethod((java.lang.String) objArr4[0], null).invoke(invoke, null)).intValue());
                    int i303 = getCardholderValidators;
                    int i304 = i303 & 89;
                    int i305 = (i303 | 89) & (~i304);
                    int i306 = i304 << 1;
                    int i307 = ((i305 ^ i306) + ((i305 & i306) << 1)) % 128;
                    getAdditionalCheckTable = i307;
                    int i308 = i307 + 104;
                    getCardholderValidators = ((~i308) + (i308 << 1)) % 128;
                    try {
                        int i309 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int currentTimeMillis9 = (int) java.lang.System.currentTimeMillis();
                        int i310 = i309 * 70;
                        int i311 = (((i310 & 4419) | ((~i310) & (-4420))) - (~(-(-((i310 & (-4420)) << 1))))) - 1;
                        int i312 = ~i309;
                        int i313 = (i312 | i309) & i312;
                        int i314 = ~i313;
                        int i315 = (i313 & 65) | (i314 & (-66));
                        int i316 = i313 & (-66);
                        int i317 = (i315 ^ i316) | (i316 & i315);
                        int i318 = ~currentTimeMillis9;
                        int i319 = (i317 & i318) | ((~i317) & currentTimeMillis9);
                        int i320 = i317 & currentTimeMillis9;
                        int i321 = ~((i320 ^ i319) | (i320 & i319));
                        int i322 = i309 & (-66);
                        int i323 = i312 & 65;
                        int i324 = ~(i322 | i323 | (i309 & 65) | currentTimeMillis9);
                        int i325 = i321 ^ i324;
                        int i326 = i321 & i324;
                        int i327 = ((i326 ^ i325) | (i326 & i325)) * 69;
                        int i328 = i311 & i327;
                        int i329 = i328 + ((i311 ^ i327) | i328);
                        int i330 = i312 ^ 65;
                        int i331 = (i330 ^ i323) | (i330 & i323);
                        int i332 = ~i331;
                        int i333 = (i331 | i332) & i332;
                        int i334 = (i313 & i318) | (i314 & currentTimeMillis9);
                        int i335 = i313 & currentTimeMillis9;
                        int i336 = (i334 ^ i335) | (i335 & i334);
                        int i337 = ~i336;
                        int i338 = (i336 | i337) & i337;
                        int i339 = (i333 ^ i338) | (i338 & i333);
                        int i340 = ~((currentTimeMillis9 ^ 65) | (currentTimeMillis9 & 65));
                        int i341 = i339 ^ i340;
                        int i342 = i340 & i339;
                        int i343 = ((i342 ^ i341) | (i342 & i341)) * (-69);
                        int i344 = (i329 ^ i343) + ((i343 & i329) << 1);
                        int i345 = (i309 | (-66)) & (~i322);
                        int i346 = (i345 ^ i322) | (i345 & i322);
                        int i347 = ~i346;
                        int i348 = -(~(-(-(((i346 | i347) & i347) * 69))));
                        int threadPriority = android.os.Process.getThreadPriority(0);
                        int i349 = (threadPriority & (-21)) | ((~threadPriority) & 20);
                        int i350 = -(-((threadPriority & 20) << 1));
                        int i351 = ((i349 & i350) + (i349 | i350)) >> 6;
                        int currentTimeMillis10 = (int) java.lang.System.currentTimeMillis();
                        int i352 = i351 * (-244);
                        int i353 = i352 & 6642;
                        int i354 = -(-(i352 | 6642));
                        int i355 = (i353 ^ i354) + ((i354 & i353) << 1);
                        int i356 = ~currentTimeMillis10;
                        int i357 = i356 & (-28);
                        int i358 = (i356 | (-28)) & (~i357);
                        int i359 = ~((i358 ^ i357) | (i358 & i357));
                        int i360 = (i351 ^ (-28)) | (i351 & (-28));
                        int i361 = ~i360;
                        int i362 = (i360 | i361) & i361;
                        int i363 = i359 & i362;
                        int i364 = (i359 | i362) & (~i363);
                        int i365 = ((i364 ^ i363) | (i364 & i363)) * (-245);
                        int i366 = i355 & i365;
                        int i367 = (((i355 ^ i365) | i366) << 1) - ((i365 | i355) & (~i366));
                        int i368 = (currentTimeMillis10 & 27) | i357;
                        int i369 = currentTimeMillis10 & (-28);
                        int i370 = (~(i368 | i369)) * (-245);
                        int i371 = (i369 ^ i368) | (i369 & i368);
                        int i372 = ~i371;
                        int i373 = (i371 | i372) & i372;
                        int i374 = ((~i373) & i351) | ((~i351) & i373);
                        int i375 = i351 & i373;
                        int i376 = -(~(-(-(((i375 ^ i374) | (i375 & i374)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))));
                        int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                        int currentTimeMillis11 = (int) java.lang.System.currentTimeMillis();
                        int i377 = resolveOpacity * 755;
                        int i378 = (((-22016214) ^ i377) | ((-22016214) & i377)) << 1;
                        int i379 = -((i377 & 22016213) | ((~i377) & (-22016214)));
                        int i380 = (i378 & i379) + (i379 | i378);
                        int i381 = ~resolveOpacity;
                        int i382 = ~i381;
                        int i383 = (i381 & (-29239)) | (i382 & 29238);
                        int i384 = i381 & 29238;
                        int i385 = (i383 ^ i384) | (i383 & i384);
                        int i386 = ~i385;
                        int i387 = (i381 | resolveOpacity) & i381;
                        int i388 = i387 & currentTimeMillis11;
                        int i389 = (~i388) & (i387 | currentTimeMillis11);
                        int i390 = ~currentTimeMillis11;
                        int i391 = ~((i389 & i388) | (i388 ^ i389));
                        int i392 = ((~i391) & i386) | ((~i386) & i391);
                        int i393 = i391 & i386;
                        int i394 = (i393 ^ i392) | (i393 & i392);
                        int i395 = currentTimeMillis11 ^ 29238;
                        int i396 = currentTimeMillis11 & 29238;
                        int i397 = ~((i395 & i396) | (i395 ^ i396));
                        int i398 = i394 & i397;
                        int i399 = (((i394 | i397) & (~i398)) | i398) * (-754);
                        int i400 = i380 & i399;
                        int i401 = (i400 - (~(-(-((i399 ^ i380) | i400))))) - 1;
                        int i402 = (i385 & i390) | (i386 & currentTimeMillis11);
                        int i403 = i385 & currentTimeMillis11;
                        int i404 = (i402 ^ i403) | (i403 & i402);
                        int i405 = ~i404;
                        int i406 = (i404 | i405) & i405;
                        int i407 = (i390 | currentTimeMillis11) & i390;
                        int i408 = i407 ^ resolveOpacity;
                        int i409 = resolveOpacity & i407;
                        int i410 = (i408 ^ i409) | (i409 & i408);
                        int i411 = (i410 & (-29239)) | ((~i410) & 29238);
                        int i412 = i410 & 29238;
                        int i413 = (i412 ^ i411) | (i412 & i411);
                        int i414 = ~i413;
                        int i415 = (i413 | i414) & i414;
                        int i416 = -(~(-(-(((i406 ^ i415) | (i415 & i406)) * (-754)))));
                        int i417 = ((i401 & i416) + (i416 | i401)) - 1;
                        int i418 = ((~i407) & i381) | (i382 & i407);
                        int i419 = i407 & i381;
                        int i420 = ((i418 ^ i419) | (i419 & i418)) * 754;
                        int i421 = i417 | i420;
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a((-2) - (~(((i344 | i348) << 1) - (i348 ^ i344))), ((((i367 & i370) - (~(-(-(i370 | i367))))) - 1) - (~i376)) - 2, (char) ((i421 << 1) - ((~(i420 & i417)) & i421)), objArr5);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                        int touchSlop = android.view.ViewConfiguration.getTouchSlop() >> 8;
                        int currentTimeMillis12 = (int) java.lang.System.currentTimeMillis();
                        int i422 = touchSlop * 829;
                        int i423 = (((-1317023724) ^ i422) + ((i422 & (-1317023724)) << 1)) - 1;
                        int i424 = ~touchSlop;
                        int i425 = i424 & (i424 | touchSlop);
                        int i426 = i425 & (-29496720);
                        int i427 = ~(((i425 | (-29496720)) & (~i426)) | i426);
                        int i428 = ~currentTimeMillis12;
                        int i429 = (i428 ^ touchSlop) | (i428 & touchSlop);
                        int i430 = ((-29496720) & i429) | ((~i429) & 29496719);
                        int i431 = i429 & 29496719;
                        int i432 = ~((i430 ^ i431) | (i431 & i430));
                        int i433 = i427 & i432;
                        int i434 = -(~((((i427 | i432) & (~i433)) | i433) * (-828)));
                        int i435 = ((i423 | i434) << 1) - (i434 ^ i423);
                        int i436 = (touchSlop ^ 29496719) | (touchSlop & 29496719);
                        int i437 = (currentTimeMillis12 | i428) & i428;
                        int argb = android.graphics.Color.argb(0, 0, 0, 0);
                        int currentTimeMillis13 = (int) java.lang.System.currentTimeMillis();
                        int i438 = argb * 85;
                        int i439 = 1412966371 & i438;
                        int i440 = (((1412966371 ^ i438) | i439) << 1) - ((i438 | 1412966371) & (~i439));
                        int i441 = ~argb;
                        int i442 = (i441 & (-976674648)) | (i441 ^ (-976674648));
                        int i443 = ~currentTimeMillis13;
                        int i444 = (i443 | currentTimeMillis13) & i443;
                        int i445 = ~i442;
                        int i446 = ((i442 | i445) & i445) | (~(i441 | i444));
                        int i447 = i444 & (-976674648);
                        int i448 = ~(i447 | ((i444 | (-976674648)) & (~i447)));
                        int i449 = i446 & i448;
                        int i450 = ((i446 | i448) & (~i449)) | i449;
                        int i451 = argb ^ 976674647;
                        int i452 = argb & 976674647;
                        int i453 = i451 | i452;
                        int i454 = ((~i453) & currentTimeMillis13) | (i453 & i443);
                        int i455 = i453 & currentTimeMillis13;
                        int i456 = ~((i454 & i455) | (i454 ^ i455));
                        int i457 = i450 & i456;
                        int i458 = -(-((((i456 | i450) & (~i457)) | i457) * (-84)));
                        int i459 = i440 & i458;
                        int i460 = i459 + ((i458 ^ i440) | i459);
                        int i461 = (currentTimeMillis13 & 976674647) | ((-976674648) & i443) | (currentTimeMillis13 & (-976674648));
                        int i462 = ~i461;
                        int i463 = (i461 | i462) & i462;
                        int i464 = (i441 & i463) | ((~i463) & argb);
                        int i465 = i463 & argb;
                        int i466 = (i465 ^ i464) | (i465 & i464);
                        int i467 = i444 & 976674647;
                        int i468 = ~(((~i467) & (i444 | 976674647)) | i467);
                        int i469 = -(-((((~i466) & i468) | ((~i468) & i466) | (i466 & i468)) * (-84)));
                        int i470 = ((~i469) & i460) | ((~i460) & i469);
                        int i471 = (i469 & i460) << 1;
                        int i472 = (i470 & i471) + (i471 | i470);
                        int i473 = 976674647 ^ i444;
                        int i474 = (i473 ^ i467) | (i467 & i473);
                        int i475 = ~i474;
                        int i476 = (i474 | i475) & i475;
                        int i477 = ~((i451 ^ i452) | (i451 & i452));
                        int i478 = i476 & i477;
                        int i479 = (i476 | i477) & (~i478);
                        int i480 = -(-(((i479 ^ i478) | (i479 & i478)) * 84));
                        int i481 = i472 & i480;
                        int i482 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int currentTimeMillis14 = (int) java.lang.System.currentTimeMillis();
                        int i483 = i482 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
                        int i484 = i483 & 5256;
                        int i485 = (i483 ^ 5256) | i484;
                        int i486 = (i484 ^ i485) + ((i485 & i484) << 1);
                        int i487 = ~i482;
                        int i488 = ~((i487 & 23) | (i487 ^ 23));
                        int i489 = ~currentTimeMillis14;
                        int i490 = (i489 | currentTimeMillis14) & i489;
                        int i491 = (i487 & i490) | ((~i490) & i482);
                        int i492 = i490 & i482;
                        int i493 = (i491 ^ i492) | (i492 & i491);
                        int i494 = i493 ^ (-24);
                        int i495 = i493 & (-24);
                        int i496 = ~((i495 ^ i494) | (i495 & i494));
                        int i497 = ((~i496) & i488) | ((~i488) & i496);
                        int i498 = i496 & i488;
                        int i499 = ((i498 ^ i497) | (i498 & i497)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                        int i500 = ((~i499) & i486) | ((~i486) & i499);
                        int i501 = (i499 & i486) << 1;
                        int i502 = i489 ^ (-24);
                        int i503 = i489 & (-24);
                        int i504 = ~((i502 ^ i503) | (i502 & i503));
                        int i505 = i482 & i504;
                        int i506 = (i504 | i482) & (~i505);
                        int i507 = (((i500 & i501) + (i501 | i500)) - (~(-(~(-(-(((i506 & i505) | (i506 ^ i505)) * (-440)))))))) - 2;
                        int i508 = i482 & (-24);
                        int i509 = (i482 | (-24)) & (~i508);
                        int i510 = (i509 ^ i508) | (i509 & i508);
                        int i511 = (i510 & i489) | ((~i510) & currentTimeMillis14);
                        int i512 = i510 & currentTimeMillis14;
                        int i513 = -(-(((i512 ^ i511) | (i512 & i511)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                        int i514 = i507 & i513;
                        int i515 = (i513 ^ i507) | i514;
                        int i516 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i517 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        int currentTimeMillis15 = (int) java.lang.System.currentTimeMillis();
                        int i518 = i517 * (-1335);
                        int i519 = ((33351 & i518) + (i518 | 33351)) - 1;
                        int i520 = i517 ^ currentTimeMillis15;
                        int i521 = i517 & currentTimeMillis15;
                        int i522 = ~((i520 ^ i521) | (i520 & i521));
                        int i523 = i522 ^ 49;
                        int i524 = i522 & 49;
                        int i525 = -(-(((i524 & i523) | (i523 ^ i524)) * (-668)));
                        int i526 = (((i519 ^ i525) | (i519 & i525)) << 1) - (((~i519) & i525) | (i519 & (~i525)));
                        int i527 = currentTimeMillis15 & 49;
                        int i528 = (currentTimeMillis15 | 49) & (~i527);
                        int i529 = (i527 ^ i528) | (i528 & i527);
                        int i530 = ~i529;
                        int i531 = (i529 | i530) & i530;
                        int i532 = ((i531 ^ i517) | (i517 & i531)) * 1336;
                        int i533 = i526 & i532;
                        int i534 = i533 + ((i532 ^ i526) | i533);
                        int i535 = i520 | i521;
                        int i536 = (i535 & (-50)) | ((~i535) & 49);
                        int i537 = i535 & 49;
                        int i538 = ((i537 ^ i536) | (i537 & i536)) * 668;
                        int i539 = i534 & i538;
                        int i540 = ((i534 ^ i538) | i539) << 1;
                        int i541 = -((i538 | i534) & (~i539));
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b((~i435) + (i435 << 1) + (((i437 ^ i436) | (i437 & i436)) * (-828)) + ((~i436) * 828), i481 + ((i480 ^ i472) | i481), (i514 & i515) + (i515 | i514), (byte) ((i516 & (-97)) + (i516 | (-97))), (short) ((i540 & i541) + (i541 | i540)), objArr6);
                        java.lang.Object invoke2 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.String.class).invoke(null, "SHA-256");
                        byte[] bytes = num.getBytes();
                        int i542 = getCardholderValidators;
                        getAdditionalCheckTable = ((i542 & 31) + (i542 | 31)) % 128;
                        try {
                            int i543 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
                            int currentTimeMillis16 = (int) java.lang.System.currentTimeMillis();
                            int i544 = jumpTapTimeout * 319;
                            int i545 = (i544 & (-8559)) + (i544 | (-8559));
                            int i546 = ~jumpTapTimeout;
                            int i547 = i546 & currentTimeMillis16;
                            int i548 = (i546 | currentTimeMillis16) & (~i547);
                            int i549 = (i548 ^ i547) | (i548 & i547);
                            int i550 = ~i549;
                            int i551 = (i549 | i550) & i550;
                            int i552 = i551 ^ (-28);
                            int i553 = i551 & (-28);
                            int i554 = -(~(-(-(((i553 ^ i552) | (i553 & i552)) * (-318)))));
                            int i555 = ((i545 ^ i554) + ((i554 & i545) << 1)) - 1;
                            int i556 = currentTimeMillis16 ^ (-28);
                            int i557 = currentTimeMillis16 & (-28);
                            int i558 = (i556 ^ i557) | (i556 & i557);
                            int i559 = ~i558;
                            int i560 = (i558 | i559) & i559;
                            int i561 = ~currentTimeMillis16;
                            int i562 = i561 & jumpTapTimeout;
                            int i563 = (~i562) & (i561 | jumpTapTimeout);
                            int i564 = (i562 ^ i563) | (i562 & i563);
                            int i565 = ~(((~i564) & 27) | (i564 & (-28)) | (i564 & 27));
                            int i566 = ((~i565) & i560) | ((~i560) & i565);
                            int i567 = i560 & i565;
                            int i568 = -(-(((i567 ^ i566) | (i567 & i566)) * 318));
                            int i569 = i555 & i568;
                            int i570 = (i568 ^ i555) | i569;
                            int i571 = (i569 & i570) + (i570 | i569);
                            int i572 = (i561 | currentTimeMillis16) & i561;
                            int i573 = ((~i572) & (-28)) | (i572 & 27);
                            int i574 = i572 & (-28);
                            int i575 = (i574 ^ i573) | (i574 & i573);
                            int i576 = i575 ^ jumpTapTimeout;
                            int i577 = i575 & jumpTapTimeout;
                            int i578 = ~((i577 ^ i576) | (i577 & i576));
                            int i579 = jumpTapTimeout | 27;
                            int i580 = i579 & currentTimeMillis16;
                            int i581 = (i579 | currentTimeMillis16) & (~i580);
                            int i582 = (i581 ^ i580) | (i581 & i580);
                            int i583 = ~i582;
                            int i584 = (i582 | i583) & i583;
                            int i585 = i578 & i584;
                            int i586 = -(-((((i584 | i578) & (~i585)) | i585) * 318));
                            int i587 = ((i571 ^ i586) | (i571 & i586)) << 1;
                            int i588 = -(((~i586) & i571) | ((~i571) & i586));
                            int i589 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int i590 = i589 & 29286;
                            int i591 = -(-((i589 ^ 29286) | i590));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            a(((i543 ^ 65) - (~(-(-((i543 & 65) << 1))))) - 1, (i587 & i588) + (i588 | i587), (char) ((i590 & i591) + (i591 | i590)), objArr7);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                            int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                            int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                            int currentTimeMillis17 = (int) java.lang.System.currentTimeMillis();
                            int i592 = normalizeMetaState * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd;
                            int i593 = (-1905199324) & i592;
                            int i594 = ((i592 | (-1905199324)) & (~i593)) + (i593 << 1);
                            int i595 = ~currentTimeMillis17;
                            int i596 = i595 & (-976674645);
                            int i597 = (i595 ^ (-976674645)) | i596;
                            int i598 = i597 & normalizeMetaState;
                            int i599 = (i597 | normalizeMetaState) & (~i598);
                            int i600 = ~((i599 ^ i598) | (i599 & i598));
                            int i601 = normalizeMetaState ^ (-976674645);
                            int i602 = (normalizeMetaState ^ 976674644) | (normalizeMetaState & 976674644);
                            int i603 = ~((i602 ^ currentTimeMillis17) | (i602 & currentTimeMillis17));
                            int i604 = ((~i603) & i600) | ((~i600) & i603);
                            int i605 = i600 & i603;
                            int i606 = ((i605 ^ i604) | (i605 & i604)) * 988;
                            int i607 = i594 & i606;
                            int i608 = (i594 | i606) & (~i607);
                            int i609 = -(-(i607 << 1));
                            int i610 = ((i608 | i609) << 1) - (i608 ^ i609);
                            int i611 = normalizeMetaState & (-976674645);
                            int i612 = ((i611 ^ i601) | (i611 & i601)) * (-988);
                            int i613 = (((i610 ^ i612) | (i610 & i612)) << 1) - (((~i612) & i610) | ((~i610) & i612));
                            int i614 = ~normalizeMetaState;
                            int i615 = ~(((~i614) & (-976674645)) | (i614 & 976674644) | (i614 & (-976674645)));
                            int i616 = (currentTimeMillis17 & 976674644) | i596 | ((-976674645) & currentTimeMillis17);
                            int i617 = ~i616;
                            int i618 = (i616 | i617) & i617;
                            int i619 = i615 & i618;
                            int i620 = (i618 | i615) & (~i619);
                            int i621 = i595 ^ normalizeMetaState;
                            int i622 = normalizeMetaState & i595;
                            int i623 = (i622 ^ i621) | (i622 & i621);
                            int i624 = i623 & 976674644;
                            int i625 = (i623 | 976674644) & (~i624);
                            int i626 = ((i620 ^ i619) | (i620 & i619) | (~((i625 ^ i624) | (i625 & i624)))) * 988;
                            int threadPriority2 = android.os.Process.getThreadPriority(0);
                            int i627 = (threadPriority2 & (-21)) | ((~threadPriority2) & 20);
                            int i628 = -(-((threadPriority2 & 20) << 1));
                            int i629 = -(((i627 & i628) + (i627 | i628)) >> 6);
                            int i630 = i629 & (-24);
                            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                            int currentTimeMillis18 = (int) java.lang.System.currentTimeMillis();
                            int i631 = doubleTapTimeout * 70;
                            int i632 = ((i631 & (-3399)) + (i631 | (-3399))) - 1;
                            int i633 = ~doubleTapTimeout;
                            int i634 = (i633 | doubleTapTimeout) & i633;
                            int i635 = i634 & (-51);
                            int i636 = ((i634 | (-51)) & (~i635)) | i635;
                            int i637 = i636 ^ currentTimeMillis18;
                            int i638 = i636 & currentTimeMillis18;
                            int i639 = (i638 ^ i637) | (i638 & i637);
                            int i640 = ~i639;
                            int i641 = (i639 | i640) & i640;
                            int i642 = doubleTapTimeout & 50;
                            int i643 = (doubleTapTimeout ^ 50) | i642;
                            int i644 = (i643 ^ currentTimeMillis18) | (i643 & currentTimeMillis18);
                            int i645 = ~i644;
                            int i646 = (i644 | i645) & i645;
                            int i647 = i641 & i646;
                            int i648 = (i641 | i646) & (~i647);
                            int i649 = -(-(((i648 ^ i647) | (i648 & i647)) * 69));
                            int i650 = i632 ^ i649;
                            int i651 = (((i632 & i649) | i650) << 1) - i650;
                            int i652 = i633 & (-51);
                            int i653 = ((~i633) & 50) | i652;
                            int i654 = i633 & 50;
                            int i655 = ~((i653 & i654) | (i653 ^ i654));
                            int i656 = i633 & currentTimeMillis18;
                            int i657 = (~i656) & (i633 | currentTimeMillis18);
                            int i658 = (i657 ^ i656) | (i657 & i656);
                            int i659 = ~i658;
                            int i660 = (i658 | i659) & i659;
                            int i661 = ((~i660) & i655) | ((~i655) & i660);
                            int i662 = i660 & i655;
                            int i663 = (i662 ^ i661) | (i662 & i661);
                            int i664 = currentTimeMillis18 & 50;
                            int i665 = ((currentTimeMillis18 | 50) & (~i664)) | i664;
                            int i666 = ~i665;
                            int i667 = (i665 | i666) & i666;
                            int i668 = -(-((((~i663) & i667) | ((~i667) & i663) | (i667 & i663)) * (-69)));
                            int i669 = i651 & i668;
                            int i670 = (i668 | i651) & (~i669);
                            int i671 = -(-(i669 << 1));
                            int i672 = (i670 & i671) + (i670 | i671);
                            int i673 = i652 | i642;
                            int i674 = doubleTapTimeout & (-51);
                            int i675 = -(~((~((i673 ^ i674) | (i674 & i673))) * 69));
                            byte b3 = (byte) ((((i672 | i675) << 1) - (i675 ^ i672)) - 1);
                            int i676 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int currentTimeMillis19 = (int) java.lang.System.currentTimeMillis();
                            int i677 = (-2) - (~((i676 * (-1335)) - 76037));
                            int i678 = i676 & currentTimeMillis19;
                            int i679 = (~i678) & (i676 | currentTimeMillis19);
                            int i680 = ~currentTimeMillis19;
                            int i681 = (i679 ^ i678) | (i679 & i678);
                            int i682 = ~i681;
                            int i683 = (i681 | i682) & i682;
                            int i684 = ((~i683) & (-115)) | (i683 & 114);
                            int i685 = i683 & (-115);
                            int i686 = ((i685 ^ i684) | (i685 & i684)) * (-668);
                            int i687 = i677 & i686;
                            int i688 = ((i677 | i686) & (~i687)) + (i687 << 1);
                            int i689 = (i680 & (-115)) | (currentTimeMillis19 & 114);
                            int i690 = currentTimeMillis19 & (-115);
                            int i691 = (i689 ^ i690) | (i690 & i689);
                            int i692 = ~i691;
                            int i693 = (i691 | i692) & i692;
                            int i694 = i676 & i693;
                            int i695 = (i693 | i676) & (~i694);
                            int i696 = -(-(((i695 ^ i694) | (i695 & i694)) * 1336));
                            int i697 = (i688 & i696) + (i688 | i696);
                            int i698 = (i676 & i680) | (currentTimeMillis19 & (~i676)) | i678;
                            int i699 = ((i698 ^ (-115)) | (i698 & (-115))) * 668;
                            int i700 = i697 & i699;
                            short s2 = (short) ((i700 - (~(-(-((i699 ^ i697) | i700))))) - 1);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(29496737 - (fadingEdgeLength >> 16), (i613 & i626) + (i626 | i613), ((i629 | (-24)) & (~i630)) + (i630 << 1), b3, s2, objArr8);
                            java.lang.String str = new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex((byte[]) cls3.getMethod((java.lang.String) objArr8[0], byte[].class).invoke(invoke2, bytes)));
                            int i701 = getCardholderValidators;
                            int i702 = ((i701 ^ 71) | (i701 & 71)) << 1;
                            int i703 = -((i701 & (-72)) | ((~i701) & 71));
                            int i704 = (i702 & i703) + (i703 | i702);
                            getAdditionalCheckTable = i704 % 128;
                            if (i704 % 2 != 0) {
                                return str;
                            }
                            throw new java.lang.ArithmeticException();
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static /* synthetic */ java.lang.Object getMchipCvmIssuerOptions(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        int i = getCardholderValidators;
        int i2 = (i ^ 2) + ((i & 2) << 1);
        int i3 = (~i2) + (i2 << 1);
        getAdditionalCheckTable = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = (((i | 15) << 1) - (~(-(i ^ 15)))) - 1;
        getAdditionalCheckTable = i4 % 128;
        if (i4 % 2 != 0) {
            return setpivotx;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getIccPrivateKeyCrtComponents(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        int i = getCardholderValidators;
        int i2 = i & 39;
        int i3 = ((((i ^ 39) | i2) << 1) - (~(-((i | 39) & (~i2))))) - 1;
        getAdditionalCheckTable = i3 % 128;
        if (i3 % 2 != 0) {
            return setpivotx;
        }
        throw null;
    }

    @Override // com.payair.hce.setErrors
    public final com.payair.hce.lambdasendUpdateRNSInformation0 writeReplace() {
        int i = getCardholderValidators + 125;
        getAdditionalCheckTable = i % 128;
        if (i % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // com.payair.hce.setErrors
    public final com.payair.hce.onNewToken values() {
        int i = getCardholderValidators;
        int i2 = i | 55;
        int i3 = i2 << 1;
        int i4 = -(i2 & (~(i & 55)));
        getAdditionalCheckTable = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        int i5 = (i ^ 15) + ((i & 15) << 1);
        getAdditionalCheckTable = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCardLayoutDescription(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        int i = getCardholderValidators;
        getAdditionalCheckTable = (((i ^ 74) + ((i & 74) << 1)) - 1) % 128;
        int i2 = i & 13;
        int i3 = -(-((i ^ 13) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getAdditionalCheckTable = i4 % 128;
        if (i4 % 2 != 0) {
            return setpivotx;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setErrors
    public final boolean IccPrivateKeyCrtComponentsJson() {
        this.AlternateContactlessPaymentDataJson = new java.util.HashMap();
        boolean AlternateContactlessPaymentDataJson = this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson();
        boolean AlternateContactlessPaymentDataJson2 = this.RecordsJson.AlternateContactlessPaymentDataJson();
        boolean AlternateContactlessPaymentDataJson3 = this.getAid.AlternateContactlessPaymentDataJson();
        boolean AlternateContactlessPaymentDataJson4 = this.SdkCoreBusinessLogicModuleImpl.AlternateContactlessPaymentDataJson();
        boolean AlternateContactlessPaymentDataJson5 = this.getGpoResponse.AlternateContactlessPaymentDataJson();
        getAid();
        if ((AlternateContactlessPaymentDataJson & AlternateContactlessPaymentDataJson2 & AlternateContactlessPaymentDataJson3 & AlternateContactlessPaymentDataJson4) && AlternateContactlessPaymentDataJson5) {
            int i = getAdditionalCheckTable;
            int i2 = i & 95;
            getCardholderValidators = ((((i ^ 95) | i2) << 1) - ((i | 95) & (~i2))) % 128;
            return true;
        }
        int i3 = getAdditionalCheckTable;
        int i4 = (i3 & (-108)) | ((~i3) & 107);
        int i5 = -(-((i3 & 107) << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        getCardholderValidators = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getDetailedMessage
    public final com.payair.hce.Initializer AlternateContactlessPaymentDataJson(byte[] bArr) throws java.security.GeneralSecurityException {
        try {
            com.payair.hce.Initializer initializer = new com.payair.hce.Initializer((byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, bArr}, 2064136125, -2064136085, java.lang.System.identityHashCode(this))).get());
            int i = getCardholderValidators;
            getAdditionalCheckTable = (i + 95) % 128;
            int i2 = i & 57;
            int i3 = -(-((i ^ 57) | i2));
            getAdditionalCheckTable = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
            return initializer;
        } catch (java.lang.Exception e) {
            try {
                java.lang.Object[] objArr = {e.toString()};
                long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                int i4 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i5 = i4 * 868;
                int i6 = (((i5 ^ 32984) | (i5 & 32984)) << 1) - ((i5 & (-32985)) | (32984 & (~i5)));
                int i7 = ~i4;
                int i8 = ~identityHashCode;
                int i9 = (~i8) & i7;
                int i10 = ~i7;
                int i11 = i9 | (i10 & i8);
                int i12 = i8 & i7;
                int i13 = ~((i11 ^ i12) | (i12 & i11));
                int i14 = i8 & (-39);
                int i15 = (~i14) & (i8 | (-39));
                int i16 = (i14 ^ i15) | (i14 & i15);
                int i17 = ~i16;
                int i18 = (i16 | i17) & i17;
                int i19 = i13 ^ i18;
                int i20 = i13 & i18;
                int i21 = -(~(((i20 ^ i19) | (i20 & i19)) * (-867)));
                int i22 = (-2) - (~(((i6 | i21) << 1) - (i6 ^ i21)));
                int i23 = i7 & 38;
                int i24 = (i10 & (-39)) | i23;
                int i25 = i7 & (-39);
                int i26 = ~((i24 ^ i25) | (i24 & i25));
                int i27 = ~((i7 ^ identityHashCode) | (i7 & identityHashCode));
                int i28 = (i26 ^ i27) | (i26 & i27);
                int i29 = identityHashCode & (-39);
                int i30 = i29 | ((~i29) & (identityHashCode | (-39)));
                int i31 = ~i30;
                int i32 = (i30 | i31) & i31;
                int i33 = i28 & i32;
                int i34 = (i28 | i32) & (~i33);
                int i35 = -(-(((i34 ^ i33) | (i34 & i33)) * (-1734)));
                int i36 = i22 & i35;
                int i37 = -(-((i22 ^ i35) | i36));
                int i38 = i7 ^ (-39);
                int i39 = (i38 ^ i25) | (i38 & i25);
                int i40 = i39 ^ i8;
                int i41 = i8 & i39;
                int i42 = (i41 ^ i40) | (i41 & i40);
                int i43 = ~i42;
                int i44 = (i42 | i43) & i43;
                int i45 = (i7 | 38) & (~i23);
                int i46 = (i45 ^ i23) | (i45 & i23);
                int i47 = i46 & identityHashCode;
                int i48 = (i46 | identityHashCode) & (~i47);
                int i49 = ~((i48 ^ i47) | (i48 & i47));
                int i50 = ((~i49) & i44) | ((~i44) & i49);
                int i51 = i49 & i44;
                int i52 = (i51 ^ i50) | (i51 & i50);
                int i53 = i4 ^ (-39);
                int i54 = i4 & (-39);
                int i55 = (i54 ^ i53) | (i54 & i53);
                int i56 = i55 ^ identityHashCode;
                int i57 = i55 & identityHashCode;
                int i58 = ~((i57 ^ i56) | (i57 & i56));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), (((i36 | i37) << 1) - (i37 ^ i36)) + (((i58 ^ i52) | (i58 & i52)) * 867), (char) android.text.TextUtils.getOffsetAfter("", 0), objArr2);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    @Override // com.payair.hce.getDetailedMessage
    public final byte[] DigitizedCardProfile(com.payair.hce.Initializer initializer) throws java.security.GeneralSecurityException {
        int i = getAdditionalCheckTable;
        int i2 = i | 45;
        int i3 = i2 << 1;
        int i4 = -((~(i & 45)) & i2);
        getCardholderValidators = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        try {
            byte[] bArr = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, initializer}, 694733650, -694733619, java.lang.System.identityHashCode(this))).get();
            int i5 = getCardholderValidators;
            int i6 = i5 & 89;
            int i7 = -(-(i5 | 89));
            int i8 = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
            getAdditionalCheckTable = i8;
            int i9 = ((i8 ^ 93) | (i8 & 93)) << 1;
            int i10 = -((i8 & (-94)) | ((~i8) & 93));
            getCardholderValidators = ((i9 & i10) + (i9 | i10)) % 128;
            int i11 = i8 ^ 85;
            getCardholderValidators = (((((i8 & 85) | i11) << 1) - (~(-i11))) - 1) % 128;
            return bArr;
        } catch (java.lang.Exception e) {
            try {
                java.lang.Object[] objArr = {e.toString()};
                int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i12 = fadingEdgeLength * 483;
                int i13 = ((i12 ^ 9196) | (i12 & 9196)) << 1;
                int i14 = -((i12 & (-9197)) | ((~i12) & 9196));
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                int i16 = ~fadingEdgeLength;
                int i17 = ~(i16 | (-39));
                int i18 = ~identityHashCode;
                int i19 = (i18 ^ i16) | (i16 & i18);
                int i20 = ~i19;
                int i21 = i17 & i20;
                int i22 = (((i20 | i17) & (~i21)) | i21) * (-241);
                int i23 = (i15 & i22) + (i22 | i15);
                int i24 = fadingEdgeLength ^ 38;
                int i25 = fadingEdgeLength & 38;
                int i26 = ((i24 ^ i25) | (i24 & i25)) * (-482);
                int i27 = fadingEdgeLength & (-39);
                int i28 = (fadingEdgeLength | (-39)) & (~i27);
                int i29 = ~((i28 ^ i27) | (i27 & i28));
                int i30 = i19 ^ 38;
                int i31 = i19 & 38;
                int i32 = ~((i31 ^ i30) | (i31 & i30));
                int i33 = ((~i32) & i29) | ((~i29) & i32);
                int i34 = i29 & i32;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(resolveSizeAndState, (i23 ^ i26) + ((i26 & i23) << 1) + (((i34 ^ i33) | (i34 & i33)) * 241), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    @Override // com.payair.hce.lambdasendUpdateRNSInformation0
    public final com.payair.hce.accessperformEnroll values(com.payair.hce.SdkCannotBeInitializedException sdkCannotBeInitializedException) {
        try {
            com.payair.hce.accessperformEnroll accessperformenroll = new com.payair.hce.accessperformEnroll(getAid((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sdkCannotBeInitializedException}, -1877837077, 1877837077, java.lang.System.identityHashCode(sdkCannotBeInitializedException))).get());
            int i = getAdditionalCheckTable;
            int i2 = i & 65;
            int i3 = ((i ^ 65) | i2) << 1;
            int i4 = -((i | 65) & (~i2));
            int i5 = (i3 & i4) + (i4 | i3);
            getCardholderValidators = i5 % 128;
            if (i5 % 2 == 0) {
                return accessperformenroll;
            }
            throw null;
        } catch (java.lang.Exception unused) {
            int i6 = getCardholderValidators;
            int i7 = i6 | 35;
            int i8 = i7 << 1;
            int i9 = -((~(i6 & 35)) & i7);
            getAdditionalCheckTable = ((i8 & i9) + (i9 | i8)) % 128;
            return null;
        }
    }

    private static /* synthetic */ java.lang.Object SdkCoreContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        try {
            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = new com.payair.hce.initializeVisaPaymentSdk((byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{setpivotx, (byte[]) objArr[1]}, -1260886295, 1260886321, java.lang.System.identityHashCode(setpivotx))).get());
            int i = getAdditionalCheckTable;
            getCardholderValidators = ((i & 29) + (i | 29)) % 128;
            return initializevisapaymentsdk;
        } catch (java.lang.InterruptedException | java.security.GeneralSecurityException | java.util.concurrent.ExecutionException unused) {
            java.lang.Thread.currentThread().interrupt();
            int i2 = getCardholderValidators;
            int i3 = i2 | 95;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 95)) & i3);
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            getAdditionalCheckTable = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object getCvrMaskAnd(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        try {
            com.payair.hce.isSessionAvailable issessionavailable = new com.payair.hce.isSessionAvailable((byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{setpivotx, (byte[]) objArr[1]}, -111572494, 111572524, java.lang.System.identityHashCode(setpivotx))).get());
            int i = getAdditionalCheckTable;
            int i2 = i & 3;
            int i3 = (i ^ 3) | i2;
            int i4 = (i2 & i3) + (i3 | i2);
            getCardholderValidators = i4 % 128;
            if (i4 % 2 == 0) {
                return issessionavailable;
            }
            throw null;
        } catch (java.lang.InterruptedException | java.security.GeneralSecurityException | java.util.concurrent.ExecutionException unused) {
            java.lang.Thread.currentThread().interrupt();
            int i5 = getCardholderValidators;
            getAdditionalCheckTable = (((i5 & 98) + (i5 | 98)) - 1) % 128;
            return null;
        }
    }

    @Override // com.payair.hce.onNewToken
    public final com.payair.hce.isSessionAvailable getProfileVersion() throws java.security.GeneralSecurityException {
        byte[] bArr = null;
        try {
            byte[] ciacDecline = getCiacDecline();
            try {
                byte[] bArr2 = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, ciacDecline}, -111572494, 111572524, java.lang.System.identityHashCode(this))).get();
                valueOf(new java.lang.Object[]{ciacDecline}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.isSessionAvailable issessionavailable = new com.payair.hce.isSessionAvailable(bArr2);
                valueOf(new java.lang.Object[]{ciacDecline}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                int i = getAdditionalCheckTable;
                int i2 = i ^ 33;
                int i3 = (i & 33) << 1;
                getCardholderValidators = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
                int i4 = i + 13;
                getCardholderValidators = i4 % 128;
                if (i4 % 2 == 0) {
                    return issessionavailable;
                }
                throw null;
            } catch (java.lang.Exception e) {
                e = e;
                bArr = ciacDecline;
                try {
                    try {
                        java.lang.Object[] objArr = {e.toString()};
                        int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
                        int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                        int identityHashCode = java.lang.System.identityHashCode(this);
                        int i5 = packedPositionType * (-949);
                        int i6 = ~identityHashCode;
                        int i7 = i6 & (-39);
                        int i8 = (i6 | (-39)) & (~i7);
                        int i9 = ~((i8 ^ i7) | (i8 & i7));
                        int i10 = ~packedPositionType;
                        int i11 = i10 ^ identityHashCode;
                        int i12 = i10 & identityHashCode;
                        int i13 = (i12 & i11) | (i11 ^ i12);
                        int i14 = ~i13;
                        int i15 = i14 & (i13 | i14);
                        int i16 = (((i5 | (-36062)) << 1) - (i5 ^ (-36062))) + (((i15 ^ i9) | (i9 & i15)) * 1900);
                        int i17 = ~i6;
                        int i18 = (i6 & i10) | (packedPositionType & i17);
                        int i19 = i6 & packedPositionType;
                        int i20 = ~((i18 ^ i19) | (i18 & i19));
                        int i21 = identityHashCode & 38;
                        int i22 = (~i21) & (identityHashCode | 38);
                        int i23 = ~((i22 ^ i21) | (i21 & i22));
                        int i24 = -(-(((i20 ^ i23) | (i20 & i23)) * (-950)));
                        int i25 = (i17 & 38) | i7;
                        int i26 = i6 & 38;
                        int i27 = ~((i25 ^ i26) | (i26 & i25));
                        int i28 = i19 | i12;
                        int i29 = packedPositionType & identityHashCode;
                        int i30 = ~((i29 ^ i28) | (i28 & i29));
                        int i31 = ((~i30) & i27) | ((~i27) & i30);
                        int i32 = i27 & i30;
                        int i33 = -(-(((i32 ^ i31) | (i32 & i31)) * 950));
                        int i34 = -android.graphics.Color.rgb(0, 0, 0);
                        int i35 = i34 ^ (-16777216);
                        int i36 = ((i34 & (-16777216)) | i35) << 1;
                        int i37 = -i35;
                        char c = (char) (((i36 | i37) << 1) - (i36 ^ i37));
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(scrollBarSize >> 8, (((i16 ^ i24) + ((i16 & i24) << 1)) - (~i33)) - 1, c, objArr2);
                        throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                bArr = ciacDecline;
                valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    private static /* synthetic */ java.lang.Object buildRecords(java.lang.Object[] objArr) {
        byte[] bArr;
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        com.payair.hce.isSessionAvailable issessionavailable = (com.payair.hce.isSessionAvailable) objArr[1];
        byte[] bArr2 = (byte[]) objArr[2];
        byte[] bArr3 = null;
        try {
            bArr = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{setpivotx, issessionavailable}, 937760869, -937760830, java.lang.System.identityHashCode(setpivotx))).get();
        } catch (java.lang.Exception unused) {
            bArr = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            byte[] bArr4 = (byte[]) valueOf(new java.lang.Object[]{bArr, bArr2}, -1016429340, 1016429361, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            com.payair.hce._sendUpdateRNSInformation _sendupdaternsinformation = new com.payair.hce._sendUpdateRNSInformation(bArr4);
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            int i = getCardholderValidators + 45;
            getAdditionalCheckTable = i % 128;
            if (i % 2 != 0) {
                return _sendupdaternsinformation;
            }
            throw null;
        } catch (java.lang.Exception unused2) {
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            getCardholderValidators = (getAdditionalCheckTable + 103) % 128;
            return null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr3 = bArr;
            valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.lang.Throwable th;
        byte[] bArr;
        byte[] bArr2;
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        com.payair.hce.isSessionAvailable issessionavailable = (com.payair.hce.isSessionAvailable) objArr[1];
        com.payair.hce.accessperformEnrollDas accessperformenrolldas = (com.payair.hce.accessperformEnrollDas) objArr[2];
        byte[] bArr3 = null;
        try {
            bArr2 = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{setpivotx, issessionavailable}, 937760869, -937760830, java.lang.System.identityHashCode(setpivotx))).get();
            try {
                bArr = (byte[]) valueOf(new java.lang.Object[]{setpivotx, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{accessperformenrolldas}, -1877837077, 1877837077, java.lang.System.identityHashCode(accessperformenrolldas)), bArr2, com.payair.hce.setPivotX.values.values}, -399686052, 399686088, java.lang.System.identityHashCode(setpivotx));
                try {
                    com.payair.hce.isSessionAvailable issessionavailable2 = new com.payair.hce.isSessionAvailable(setpivotx.getCvrMaskAnd(bArr).get());
                    valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    int i = getCardholderValidators;
                    int i2 = i ^ 31;
                    int i3 = ((((i & 31) | i2) << 1) - (~(-i2))) - 1;
                    getAdditionalCheckTable = i3 % 128;
                    if (i3 % 2 != 0) {
                        return issessionavailable2;
                    }
                    throw new java.lang.ArithmeticException();
                } catch (java.lang.Exception unused) {
                    valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    int i4 = getCardholderValidators;
                    int i5 = (-2) - (~((i4 ^ 24) + ((i4 & 24) << 1)));
                    getAdditionalCheckTable = i5 % 128;
                    if (i5 % 2 != 0) {
                        return null;
                    }
                    throw new java.lang.ArithmeticException();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    bArr3 = bArr2;
                    valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    throw th;
                }
            } catch (java.lang.Exception unused2) {
                bArr = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                bArr = null;
            }
        } catch (java.lang.Exception unused3) {
            bArr = null;
            bArr2 = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr = null;
        }
    }

    private static /* synthetic */ java.lang.Object getAdditionalCheckTable(java.lang.Object[] objArr) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        com.payair.hce.isSessionAvailable issessionavailable = (com.payair.hce.isSessionAvailable) objArr[1];
        com.payair.hce.isSessionAvailable issessionavailable2 = (com.payair.hce.isSessionAvailable) objArr[2];
        byte[] bArr5 = (byte[]) objArr[3];
        int i = getCardholderValidators;
        int i2 = i & 13;
        int i3 = -(-((i ^ 13) | i2));
        getAdditionalCheckTable = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        try {
            java.util.concurrent.Future future = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{setpivotx, issessionavailable}, 937760869, -937760830, java.lang.System.identityHashCode(setpivotx));
            java.util.concurrent.Future future2 = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{setpivotx, issessionavailable2}, 937760869, -937760830, java.lang.System.identityHashCode(setpivotx));
            int length = bArr5.length;
            int identityHashCode = java.lang.System.identityHashCode(setpivotx);
            int i4 = (-7841) - (~(-(-(length * (-978)))));
            int i5 = ~length;
            int i6 = ~identityHashCode;
            int i7 = i5 & i6;
            int i8 = (~((i5 ^ i6) | i7)) * 979;
            int i9 = (((i4 | i8) << 1) - (~(-(((~i8) & i4) | (i8 & (~i4)))))) - 1;
            int i10 = ((identityHashCode ^ (-8)) | (identityHashCode & (-8))) * (-979);
            int i11 = i9 & i10;
            int i12 = (i9 | i10) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = (i12 & i13) + (i12 | i13);
            int i15 = ~((i5 & identityHashCode) | i7 | ((~i5) & identityHashCode));
            int i16 = ~((i6 & (-8)) | (i6 ^ (-8)));
            int i17 = ((~i16) & i15) | ((~i15) & i16);
            int i18 = i15 & i16;
            int i19 = ((i18 ^ i17) | (i18 & i17)) * 979;
            int i20 = i14 & i19;
            int i21 = -(-((i19 ^ i14) | i20));
            int i22 = (i20 & i21) + (i21 | i20);
            if (i22 > 16) {
                try {
                    bArr2 = new byte[i22];
                    bArr3 = new byte[8];
                    java.lang.System.arraycopy(bArr5, 0, bArr2, 0, i22);
                    java.lang.System.arraycopy(bArr5, i22, bArr3, 0, 8);
                    bArr4 = (byte[]) valueOf(new java.lang.Object[]{bArr2, (byte[]) future2.get()}, 1852088232, -1852088222, (int) java.lang.System.currentTimeMillis());
                } catch (java.lang.Exception e) {
                    e = e;
                    bArr = null;
                } catch (java.lang.Throwable th) {
                    th = th;
                    bArr = null;
                    valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    throw th;
                }
                try {
                    if (!java.util.Arrays.equals(bArr3, bArr4)) {
                        int i23 = getAdditionalCheckTable;
                        int i24 = (((i23 & 26) + (i23 | 26)) - 1) % 128;
                        getCardholderValidators = i24;
                        int i25 = i24 & 21;
                        int i26 = ((i24 ^ 21) | i25) << 1;
                        int i27 = -((~i25) & (i24 | 21));
                        int i28 = ((i26 ^ i27) + ((i27 & i26) << 1)) % 128;
                        getAdditionalCheckTable = i28;
                        getCardholderValidators = (i28 + 25) % 128;
                        try {
                            java.lang.Object[] objArr2 = {"Calculated MAC does not match the received one"};
                            int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                            int i29 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int i30 = i29 & 39;
                            int i31 = (i29 | 39) & (~i30);
                            int i32 = i30 << 1;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a(capsMode, ((i31 | i32) << 1) - (i31 ^ i32), (char) ((-2) - (~((-2) - (~(-(~(-android.graphics.ImageFormat.getBitsPerPixel(0)))))))), objArr3);
                            throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr2));
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        }
                    }
                    byte[] values2 = setpivotx.values(bArr2, (byte[]) future.get(), com.payair.hce.setPivotX.values.values);
                    valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    int i33 = getAdditionalCheckTable;
                    getCardholderValidators = ((i33 ^ 49) + ((i33 & 49) << 1)) % 128;
                    int i34 = i33 + 27;
                    int i35 = i34 % 128;
                    getCardholderValidators = i35;
                    if (i34 % 2 != 0) {
                        throw null;
                    }
                    int i36 = i35 | 117;
                    getAdditionalCheckTable = ((i36 << 1) - (i36 & (~(i35 & 117)))) % 128;
                    return values2;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    bArr = bArr4;
                    try {
                        try {
                            java.lang.Object[] objArr4 = {e.toString()};
                            int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
                            int i37 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int identityHashCode2 = java.lang.System.identityHashCode(setpivotx);
                            int i38 = i37 * (-830);
                            int i39 = ((i38 & 30785) + (i38 | 30785)) - 1;
                            int i40 = ~identityHashCode2;
                            int i41 = (i40 ^ (-38)) | (i40 & (-38));
                            int i42 = i37 & 37;
                            int i43 = (~i42) & (i37 | 37);
                            int i44 = (i42 ^ i43) | (i42 & i43);
                            int i45 = i44 & identityHashCode2;
                            int i46 = (i44 | identityHashCode2) & (~i45);
                            int i47 = ~i41;
                            int i48 = -(-((((i41 | i47) & i47) | (~((i46 ^ i45) | (i46 & i45)))) * (-831)));
                            int i49 = i39 & i48;
                            int i50 = ((i39 ^ i48) | i49) << 1;
                            int i51 = -((i39 | i48) & (~i49));
                            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                            int i53 = (i37 & (-38)) | (i37 ^ (-38));
                            int i54 = i53 & identityHashCode2;
                            int i55 = (i53 | identityHashCode2) & (~i54);
                            int i56 = -(-((~((i55 ^ i54) | (i55 & i54))) * (-1662)));
                            int i57 = i52 & i56;
                            int i58 = ((i52 ^ i56) | i57) << 1;
                            int i59 = -((i56 | i52) & (~i57));
                            int i60 = (i58 & i59) + (i59 | i58);
                            int i61 = ~i37;
                            int i62 = (i61 | i37) & i61;
                            int i63 = ((~i40) & i62) | ((~i62) & i40);
                            int i64 = i62 & i40;
                            int i65 = ~((i64 ^ i63) | (i64 & i63));
                            int i66 = (i40 & i37) | (i61 & identityHashCode2);
                            int i67 = i37 & identityHashCode2;
                            int i68 = (i67 ^ i66) | (i67 & i66);
                            int i69 = ~i68;
                            int i70 = (i68 | i69) & i69;
                            int i71 = (i70 & (~i65)) | ((~i70) & i65) | (i70 & i65);
                            int i72 = identityHashCode2 & 37;
                            int i73 = ((identityHashCode2 | 37) & (~i72)) | i72;
                            int i74 = ~i73;
                            int i75 = (i73 | i74) & i74;
                            int i76 = i71 & i75;
                            int i77 = (i71 | i75) & (~i76);
                            int i78 = ((i77 ^ i76) | (i77 & i76)) * 831;
                            int i79 = (i60 | i78) << 1;
                            int i80 = -(((~i78) & i60) | ((~i60) & i78));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            a(keyCodeFromString, ((i79 | i80) << 1) - (i80 ^ i79), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr5);
                            throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr5[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr4));
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause2 = th3.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th3;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        throw th;
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    bArr = bArr4;
                    valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    throw th;
                }
            }
            int i81 = getCardholderValidators;
            int i82 = ((i81 ^ 59) | (i81 & 59)) << 1;
            int i83 = -((i81 & (-60)) | ((~i81) & 59));
            getAdditionalCheckTable = ((i82 ^ i83) + ((i82 & i83) << 1)) % 128;
            int i84 = i81 & 49;
            int i85 = ((i81 ^ 49) | i84) << 1;
            int i86 = -((i81 | 49) & (~i84));
            getAdditionalCheckTable = (((i85 | i86) << 1) - (i86 ^ i85)) % 128;
            try {
                java.lang.Object[] objArr6 = {"Invalid responseData message"};
                int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                int i87 = -(android.os.Process.myPid() >> 22);
                int identityHashCode3 = java.lang.System.identityHashCode(setpivotx);
                int i88 = i87 * (-112);
                int i89 = ((((i88 ^ (-4256)) | (i88 & (-4256))) << 1) - (~(-((i88 & 4255) | ((~i88) & (-4256)))))) - 1;
                int i90 = ~identityHashCode3;
                int i91 = i90 & (-39);
                int i92 = (~i91) & (i90 | (-39));
                int i93 = (i92 ^ i91) | (i92 & i91);
                int i94 = ~i93;
                int i95 = -(-((((i93 | i94) & i94) | i87) * 226));
                int i96 = (((i89 ^ i95) | (i89 & i95)) << 1) - (((~i95) & i89) | ((~i89) & i95));
                int i97 = ~i87;
                int i98 = (i97 & (-39)) | ((~i97) & 38);
                int i99 = i97 & 38;
                int i100 = ~((i99 & i98) | (i98 ^ i99));
                int i101 = i97 & identityHashCode3;
                int i102 = (~i101) & (i97 | identityHashCode3);
                int i103 = (i102 ^ i101) | (i102 & i101);
                int i104 = ~i103;
                int i105 = (i103 | i104) & i104;
                int i106 = (i100 ^ i105) | (i105 & i100);
                int i107 = ((~i90) & (-39)) | (i90 & 38);
                int i108 = (i107 ^ i91) | (i91 & i107);
                int i109 = ~((i97 & i108) | (i87 & (~i108)) | (i87 & i108));
                int i110 = -(~(((i109 ^ i106) | (i106 & i109)) * (-113)));
                int i111 = (i96 & i110) + (i110 | i96);
                int i112 = (~i111) + (i111 << 1);
                int i113 = identityHashCode3 ^ (-39);
                int i114 = identityHashCode3 & (-39);
                int i115 = (~((i113 ^ i114) | (i113 & i114))) * 113;
                int i116 = i112 & i115;
                int i117 = i112 | i115;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a(resolveSizeAndState, (i116 & i117) + (i117 | i116), (char) (android.os.Process.myTid() >> 22), objArr7);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr7[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr6));
            } catch (java.lang.Throwable th6) {
                java.lang.Throwable cause3 = th6.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th6;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            bArr = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        com.payair.hce.DeviceNotSecureException deviceNotSecureException = (com.payair.hce.DeviceNotSecureException) objArr[1];
        byte[] bArr8 = (byte[]) objArr[2];
        com.payair.hce.updateRNSInformation updaternsinformation = (com.payair.hce.updateRNSInformation) objArr[3];
        int i = getAdditionalCheckTable;
        int i2 = i & 37;
        int i3 = (i | 37) & (~i2);
        int i4 = i2 << 1;
        getCardholderValidators = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        try {
            bArr7 = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{setpivotx, updaternsinformation.values()}, -593266716, 593266724, java.lang.System.identityHashCode(setpivotx))).get();
        } catch (java.lang.Exception e) {
            e = e;
            bArr3 = null;
            bArr4 = null;
        } catch (java.lang.Throwable th) {
            th = th;
            bArr = null;
            bArr2 = null;
        }
        try {
            int length = bArr8.length;
            int length2 = deviceNotSecureException.getSessionCode().length;
            int identityHashCode = java.lang.System.identityHashCode(setpivotx);
            int i5 = length2 * 1773;
            int i6 = -(-(length * (-885)));
            int i7 = ((i5 | i6) << 1) - (((~i6) & i5) | ((~i5) & i6));
            int i8 = ~length2;
            int i9 = (i8 | length2) & i8;
            int i10 = ~length;
            int i11 = i9 ^ i10;
            int i12 = i9 & i10;
            int i13 = (i11 ^ i12) | (i11 & i12);
            int i14 = ~i13;
            int i15 = i14 & (i13 | i14);
            int i16 = (i10 | length) & i10;
            int i17 = ~identityHashCode;
            int i18 = ((~i16) & identityHashCode) | (i16 & i17);
            int i19 = i16 & identityHashCode;
            int i20 = (i18 & i19) | (i18 ^ i19);
            int i21 = ~i20;
            int i22 = (i20 | i21) & i21;
            int i23 = (i22 & (~i15)) | ((~i22) & i15) | (i22 & i15);
            int i24 = (i17 | identityHashCode) & i17;
            int i25 = ((~i24) & length2) | (i24 & i8) | (i24 & length2);
            int i26 = ~((i25 ^ length) | (i25 & length));
            int i27 = -(-(((i23 ^ i26) | (i23 & i26)) * 886));
            int i28 = i17 & length;
            int i29 = (i17 | length) & (~i28);
            int i30 = (i28 ^ i29) | (i29 & i28);
            int i31 = ~i30;
            int i32 = (i30 | i31) & i31;
            int i33 = length2 ^ i32;
            int i34 = i32 & length2;
            int i35 = (((i7 & i27) + (i7 | i27)) - (~(-(-(((i34 & i33) | (i34 ^ i33)) * (-1772)))))) - 1;
            int i36 = (i17 & i8) | ((~i17) & length2);
            int i37 = i17 & length2;
            int i38 = -(-((~((i36 ^ i37) | (i36 & i37))) * 886));
            int i39 = ((i35 | i38) << 1) - (i38 ^ i35);
            int length3 = bArr7.length;
            int identityHashCode2 = java.lang.System.identityHashCode(setpivotx);
            int i40 = length3 * (-830);
            int i41 = i39 * 832;
            int i42 = ~i39;
            int i43 = ~identityHashCode2;
            int i44 = ((~i43) & i42) | ((~i42) & i43);
            int i45 = i42 & i43;
            int i46 = ~((i44 & i45) | (i44 ^ i45));
            int i47 = length3 & i39;
            int i48 = (~i47) & (length3 | i39);
            int i49 = (i48 ^ i47) | (i48 & i47);
            int i50 = ((~i49) & identityHashCode2) | (i49 & i43) | (i49 & identityHashCode2);
            int i51 = ~i50;
            int i52 = (i50 | i51) & i51;
            int i53 = ((~i52) & i46) | ((~i46) & i52);
            int i54 = i52 & i46;
            int i55 = (-2) - (~((((i40 & i41) + (i40 | i41)) - (~(-(~(((i54 ^ i53) | (i54 & i53)) * (-831)))))) - 1));
            int i56 = (i42 | i39) & i42;
            int i57 = i56 & length3;
            int i58 = ((i56 | length3) & (~i57)) | i57;
            int i59 = (i58 & i43) | ((~i58) & identityHashCode2);
            int i60 = i58 & identityHashCode2;
            int i61 = -(-((~((i60 ^ i59) | (i60 & i59))) * (-1662)));
            int i62 = i55 ^ i61;
            int i63 = (i55 & i61) << 1;
            int i64 = (i62 & i63) + (i63 | i62);
            int i65 = ~length3;
            int i66 = (i43 | identityHashCode2) & i43;
            int i67 = ((~i66) & i65) | ((~i65) & i66);
            int i68 = i65 & i66;
            int i69 = (i68 ^ i67) | (i68 & i67);
            int i70 = ~i69;
            int i71 = (i69 | i70) & i70;
            int i72 = length3 & identityHashCode2;
            int i73 = (length3 | identityHashCode2) & (~i72);
            int i74 = ~((i73 ^ i72) | (i73 & i72));
            int i75 = (i71 ^ i74) | (i74 & i71);
            int i76 = i39 & identityHashCode2;
            int i77 = i76 | ((i39 | identityHashCode2) & (~i76));
            int i78 = ~i77;
            int i79 = (i77 | i78) & i78;
            int i80 = i75 ^ i79;
            int i81 = i75 & i79;
            int i82 = ((i81 ^ i80) | (i81 & i80)) * 831;
            bArr6 = new byte[(i64 ^ i82) + ((i82 & i64) << 1)];
        } catch (java.lang.Exception e2) {
            e = e2;
            bArr6 = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr2 = null;
            bArr = bArr7;
            valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            throw th;
        }
        try {
            java.lang.System.arraycopy(bArr8, 0, bArr6, 0, bArr8.length);
            int length4 = bArr8.length;
            int i83 = (length4 << 1) - length4;
            java.lang.System.arraycopy(deviceNotSecureException.getSessionCode(), 0, bArr6, i83, deviceNotSecureException.getSessionCode().length);
            int length5 = deviceNotSecureException.getSessionCode().length;
            int identityHashCode3 = java.lang.System.identityHashCode(setpivotx);
            int i84 = length5 * (-958);
            int i85 = i83 * (-958);
            int i86 = (i84 | i85) << 1;
            int i87 = -((i84 & (~i85)) | ((~i84) & i85));
            int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
            int i89 = ~i83;
            int i90 = ~identityHashCode3;
            int i91 = ((~i90) & i89) | ((~i89) & i90);
            int i92 = i89 & i90;
            int i93 = ~((i91 ^ i92) | (i91 & i92));
            int i94 = ~length5;
            int i95 = i94 & identityHashCode3;
            int i96 = ~(i95 | ((~i95) & (i94 | identityHashCode3)));
            int i97 = ((~i93) & i96) | ((~i96) & i93) | (i93 & i96);
            int i98 = i90 & (i90 | identityHashCode3);
            int i99 = i98 & length5;
            int i100 = (i98 | length5) & (~i99);
            int i101 = (i99 ^ i100) | (i100 & i99);
            int i102 = ~i101;
            int i103 = (i101 | i102) & i102;
            int i104 = i97 & i103;
            int i105 = (i97 | i103) & (~i104);
            int i106 = -(-(((i105 ^ i104) | (i105 & i104)) * 959));
            int i107 = (i88 & i106) + (i88 | i106);
            int i108 = (length5 & i89) | (i83 & i94);
            int i109 = length5 & i83;
            int i110 = -(~((~((i108 ^ i109) | (i108 & i109))) * (-959)));
            int i111 = ~((i98 ^ i94) | (i98 & i94));
            int i112 = (i83 | i89) & i89;
            int i113 = ~((i112 ^ identityHashCode3) | (i112 & identityHashCode3));
            int i114 = i111 & i113;
            int i115 = (i113 | i111) & (~i114);
            int i116 = (i115 ^ i114) | (i115 & i114);
            int i117 = (length5 ^ identityHashCode3) | (length5 & identityHashCode3);
            int i118 = ~i117;
            int i119 = (i117 | i118) & i118;
            java.lang.System.arraycopy(bArr7, 0, bArr6, ((-2) - (~((i107 ^ i110) + ((i110 & i107) << 1)))) + (((i119 & (~i116)) | ((~i119) & i116) | (i119 & i116)) * 959), bArr7.length);
            byte[] bArr9 = (byte[]) valueOf(new java.lang.Object[]{setpivotx, bArr6}, -2081622243, 2081622256, java.lang.System.identityHashCode(setpivotx));
            valueOf(new java.lang.Object[]{bArr6}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr7}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr6}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr7}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            int i120 = getAdditionalCheckTable;
            getCardholderValidators = (i120 + 11) % 128;
            int i121 = i120 & 85;
            int i122 = (((i120 ^ 85) | i121) << 1) - ((i120 | 85) & (~i121));
            int i123 = i122 % 128;
            getCardholderValidators = i123;
            if (i122 % 2 != 0) {
                throw null;
            }
            getAdditionalCheckTable = ((i123 ^ 3) + ((i123 & 3) << 1)) % 128;
            return bArr9;
        } catch (java.lang.Exception e3) {
            e = e3;
            bArr4 = bArr6;
            bArr3 = bArr7;
            try {
                try {
                    java.lang.Object[] objArr2 = {e.toString()};
                    int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                    int i124 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    int identityHashCode4 = java.lang.System.identityHashCode(setpivotx);
                    int i125 = i124 * (-317);
                    int i126 = ((i125 ^ 11803) | (i125 & 11803)) << 1;
                    int i127 = -((i125 & (-11804)) | ((~i125) & 11803));
                    int i128 = (i126 & i127) + (i127 | i126);
                    int i129 = ~i124;
                    int i130 = i129 ^ (-38);
                    int i131 = i129 & (-38);
                    int i132 = (i130 ^ i131) | (i130 & i131);
                    int i133 = ~((i132 ^ identityHashCode4) | (i132 & identityHashCode4));
                    int i134 = ~identityHashCode4;
                    int i135 = i134 ^ i124;
                    int i136 = i134 & i124;
                    int i137 = (i136 ^ i135) | (i136 & i135);
                    int i138 = ~((i137 ^ 37) | (i137 & 37));
                    int i139 = ((~i138) & i133) | ((~i133) & i138);
                    int i140 = i133 & i138;
                    int i141 = -(-(((i140 ^ i139) | (i140 & i139)) * (-318)));
                    int i142 = (i128 & i141) + (i141 | i128);
                    int i143 = ~((i124 ^ (-38)) | (i124 & (-38)));
                    int i144 = ~(i124 | identityHashCode4);
                    int i145 = ((~i144) & i143) | ((~i143) & i144);
                    int i146 = i144 & i143;
                    int i147 = ((i146 ^ i145) | (i146 & i145)) * (-318);
                    int i148 = ((i142 | i147) << 1) - (i147 ^ i142);
                    int i149 = i129 & identityHashCode4;
                    int i150 = (identityHashCode4 | i129) & (~i149);
                    int i151 = (i150 ^ i149) | (i150 & i149);
                    int i152 = ~i151;
                    int i153 = (i151 | i152) & i152;
                    int i154 = ((~i153) & (-38)) | (i153 & 37);
                    int i155 = i153 & (-38);
                    int i156 = -(~(-(-(((i155 ^ i154) | (i155 & i154)) * 318))));
                    int i157 = (i148 ^ i156) + ((i156 & i148) << 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(fadingEdgeLength >> 16, (~i157) + (i157 << 1), (char) android.graphics.Color.blue(0), objArr3);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr2));
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause = th3.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th3;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                byte[] bArr10 = bArr4;
                bArr5 = bArr3;
                bArr6 = bArr10;
                byte[] bArr11 = bArr5;
                bArr2 = bArr6;
                bArr = bArr11;
                valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                throw th;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            bArr5 = bArr7;
            byte[] bArr112 = bArr5;
            bArr2 = bArr6;
            bArr = bArr112;
            valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        byte[] bArr;
        byte[] bArr2;
        com.payair.hce.bindIsolatedService bindisolatedservice;
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings = (com.payair.hce.checkAutomaticTimeSettings) objArr[1];
        com.payair.hce.isSessionAvailable issessionavailable = (com.payair.hce.isSessionAvailable) objArr[2];
        com.payair.hce.performEnroll performenroll = (com.payair.hce.performEnroll) objArr[3];
        com.payair.hce.bindIsolatedService bindisolatedservice2 = null;
        bindisolatedservice2 = null;
        byte[] bArr3 = null;
        bindisolatedservice2 = null;
        bindisolatedservice2 = null;
        try {
            bArr2 = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{setpivotx, issessionavailable}, 937760869, -937760830, java.lang.System.identityHashCode(setpivotx))).get();
            try {
                byte[] values2 = setpivotx.values((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{checkautomatictimesettings}, -1877837077, 1877837077, java.lang.System.identityHashCode(checkautomatictimesettings)), bArr2);
                try {
                    com.payair.hce.inithce_sdk_release valueOf = performenroll.valueOf();
                    bindisolatedservice = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(setpivotx.values((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf}, -1877837077, 1877837077, java.lang.System.identityHashCode(valueOf)), values2));
                    try {
                        com.payair.hce.inithce_sdk_release DigitizedCardProfile = performenroll.DigitizedCardProfile();
                        bindisolatedservice.valueOf(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(setpivotx.values((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile)), values2)));
                        com.payair.hce.inithce_sdk_release values3 = performenroll.values();
                        bindisolatedservice.valueOf(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(setpivotx.values((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{values3}, -1877837077, 1877837077, java.lang.System.identityHashCode(values3)), values2)));
                        com.payair.hce.inithce_sdk_release writeReplace = performenroll.writeReplace();
                        bindisolatedservice.valueOf(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(setpivotx.values((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{writeReplace}, -1877837077, 1877837077, java.lang.System.identityHashCode(writeReplace)), values2)));
                        com.payair.hce.inithce_sdk_release AlternateContactlessPaymentDataJson = performenroll.AlternateContactlessPaymentDataJson();
                        bindisolatedservice.valueOf(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(setpivotx.values((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -1877837077, 1877837077, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson)), values2)));
                        byte[] bArr4 = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{setpivotx, bindisolatedservice.DigitizedCardProfile()}, -1260886295, 1260886321, java.lang.System.identityHashCode(setpivotx))).get();
                        valueOf(new java.lang.Object[]{bindisolatedservice.DigitizedCardProfile()}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{values2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = new com.payair.hce.initializeVisaPaymentSdk(bArr4);
                        valueOf(new java.lang.Object[]{bindisolatedservice.DigitizedCardProfile()}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{values2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        int i = getAdditionalCheckTable;
                        int i2 = i & 13;
                        int i3 = (i ^ 13) | i2;
                        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
                        getCardholderValidators = i4;
                        int i5 = i4 + 111;
                        int i6 = i5 % 128;
                        getAdditionalCheckTable = i6;
                        if (i5 % 2 == 0) {
                            throw null;
                        }
                        int i7 = i6 & 31;
                        getCardholderValidators = (i7 + ((i6 ^ 31) | i7)) % 128;
                        return initializevisapaymentsdk;
                    } catch (java.lang.Exception e) {
                        e = e;
                        bArr3 = values2;
                        bArr = bArr3;
                        bindisolatedservice2 = bindisolatedservice;
                        try {
                            try {
                                java.lang.Object[] objArr2 = {e.toString()};
                                int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                                int i8 = -android.text.TextUtils.indexOf("", "", 0);
                                int identityHashCode = java.lang.System.identityHashCode(setpivotx);
                                int i9 = ~identityHashCode;
                                int i10 = (i9 | identityHashCode) & i9;
                                int i11 = i10 & (-39);
                                int i12 = ~(((i10 | (-39)) & (~i11)) | i11);
                                int i13 = ~i8;
                                int i14 = ~((i13 ^ identityHashCode) | (i13 & identityHashCode));
                                int i15 = i12 & i14;
                                int i16 = (i12 | i14) & (~i15);
                                int i17 = (i16 ^ i15) | (i16 & i15);
                                int i18 = i9 ^ i8;
                                int i19 = i9 & i8;
                                int i20 = ~((i19 & i18) | (i18 ^ i19));
                                int i21 = i17 & i20;
                                int i22 = (i17 | i20) & (~i21);
                                int i23 = (((-2) - (~((i8 * (-958)) - 36403))) - (~(((i22 & i21) | (i22 ^ i21)) * 959))) - 1;
                                int i24 = (~((i8 ^ 38) | (i8 & 38))) * (-959);
                                int i25 = (i23 & i24) + (i24 | i23);
                                int i26 = (i13 | i8) & i13;
                                int i27 = (i9 ^ i26) | (i26 & i9);
                                int i28 = ~i27;
                                int i29 = (i27 | i28) & i28;
                                int i30 = identityHashCode ^ (-39);
                                int i31 = identityHashCode & (-39);
                                int i32 = ~((i30 ^ i31) | (i30 & i31));
                                int i33 = (i29 ^ i32) | (i29 & i32);
                                int i34 = i8 ^ identityHashCode;
                                int i35 = i8 & identityHashCode;
                                int i36 = ~((i35 ^ i34) | (i35 & i34));
                                int i37 = ((i36 & (~i33)) | ((~i36) & i33) | (i36 & i33)) * 959;
                                int i38 = i25 & i37;
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                a(keyRepeatTimeout >> 16, (i38 - (~(-(-((i37 ^ i25) | i38))))) - 1, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
                                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr2));
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            valueOf(new java.lang.Object[]{bindisolatedservice2.DigitizedCardProfile()}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                            valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        bArr = values2;
                        bindisolatedservice2 = bindisolatedservice;
                        valueOf(new java.lang.Object[]{bindisolatedservice2.DigitizedCardProfile()}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        throw th;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    bindisolatedservice = null;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    bArr = values2;
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                bindisolatedservice = null;
            } catch (java.lang.Throwable th5) {
                th = th5;
                bArr = null;
            }
        } catch (java.lang.Exception e4) {
            e = e4;
            bArr = null;
            bArr2 = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
            bArr = null;
            bArr2 = null;
        }
    }

    @Override // com.payair.hce.onNewToken
    public final com.payair.hce.initializeVisaPaymentSdk writeReplace(com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings, com.payair.hce.isSessionAvailable issessionavailable) throws java.security.GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = null;
        try {
            bArr2 = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, issessionavailable}, 937760869, -937760830, java.lang.System.identityHashCode(this))).get();
        } catch (java.lang.Exception e) {
            e = e;
            bArr = null;
        } catch (java.lang.Throwable th) {
            th = th;
            bArr = null;
        }
        try {
            bArr3 = DigitizedCardProfile((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{checkautomatictimesettings}, -1877837077, 1877837077, java.lang.System.identityHashCode(checkautomatictimesettings)), bArr2);
            byte[] bArr4 = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, bArr3}, -1260886295, 1260886321, java.lang.System.identityHashCode(this))).get();
            valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = new com.payair.hce.initializeVisaPaymentSdk(bArr4);
            valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            int i = getCardholderValidators;
            getAdditionalCheckTable = ((((i | 27) << 1) - (~(-((i & (-28)) | ((~i) & 27))))) - 1) % 128;
            getAdditionalCheckTable = ((i ^ 109) + ((i & 109) << 1)) % 128;
            return initializevisapaymentsdk;
        } catch (java.lang.Exception e2) {
            e = e2;
            bArr = bArr3;
            bArr3 = bArr2;
            try {
                try {
                    java.lang.Object[] objArr = {e.toString()};
                    int alpha = android.graphics.Color.alpha(0);
                    int i2 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int identityHashCode = java.lang.System.identityHashCode(this);
                    int i3 = i2 * 141;
                    int i4 = i3 & (-10323);
                    int i5 = -(-((i3 ^ (-10323)) | i4));
                    int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                    int i7 = identityHashCode & 37;
                    int i8 = (~i7) & (identityHashCode | 37);
                    int i9 = -(-(((i7 ^ i8) | (i7 & i8)) * 140));
                    int i10 = (i6 ^ i9) + ((i9 & i6) << 1);
                    int i11 = ~i2;
                    int i12 = i11 & 37;
                    int i13 = ~(((i11 | 37) & (~i12)) | i12);
                    int i14 = ~identityHashCode;
                    int i15 = (i14 & (-38)) | ((~i14) & 37);
                    int i16 = i14 & 37;
                    int i17 = (i16 & i15) | (i15 ^ i16);
                    int i18 = ~i17;
                    int i19 = (i17 | i18) & i18;
                    int i20 = ((~i19) & i13) | ((~i13) & i19);
                    int i21 = i19 & i13;
                    int i22 = ((i21 ^ i20) | (i21 & i20)) * (-280);
                    int i23 = i10 & i22;
                    int i24 = ((i22 | i10) & (~i23)) + (i23 << 1);
                    int i25 = i2 ^ (-38);
                    int i26 = i2 & (-38);
                    int i27 = (i25 ^ i26) | (i26 & i25);
                    int i28 = ~i27;
                    int i29 = (i27 | i28) & i28;
                    int i30 = ~((i2 & i14) | (i2 ^ i14));
                    int i31 = (i29 ^ i30) | (i30 & i29);
                    int i32 = (i11 ^ 37) | i12 | identityHashCode;
                    int i33 = ~i32;
                    int i34 = (i32 | i33) & i33;
                    int i35 = ((~i34) & i31) | ((~i31) & i34);
                    int i36 = i31 & i34;
                    int i37 = -(~(((i36 ^ i35) | (i36 & i35)) * 140));
                    int i38 = (i24 ^ i37) + ((i24 & i37) << 1);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(alpha, (~i38) + (i38 << 1), (char) android.graphics.Color.argb(0, 0, 0, 0), objArr2);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr = bArr3;
            bArr3 = bArr2;
            valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            throw th;
        }
    }

    @Override // com.payair.hce.onNewToken
    public final com.payair.hce.accessisAutomaticTimeEnabled valueOf(com.payair.hce.isSessionAvailable issessionavailable, com.payair.hce.isSessionAvailable issessionavailable2, byte[] bArr, com.payair.hce.DeviceNotSecureException deviceNotSecureException, int i) throws java.security.GeneralSecurityException {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        byte[] bArr10;
        byte[] bArr11;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArr12 = null;
        try {
            java.util.concurrent.Future future = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, issessionavailable2}, 937760869, -937760830, java.lang.System.identityHashCode(this));
            bArr7 = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, issessionavailable}, 937760869, -937760830, java.lang.System.identityHashCode(this))).get();
            try {
                bArr8 = getAid(bArr7, deviceNotSecureException.getSessionCode());
                try {
                    bArr5 = DigitizedCardProfile(bArr, bArr8, i);
                } catch (java.lang.Exception e) {
                    e = e;
                    bArr5 = null;
                    bArr2 = null;
                    bArr10 = null;
                    bArr6 = bArr10;
                    bArr4 = bArr10;
                    bArr3 = bArr8;
                    bArr12 = bArr5;
                    try {
                        try {
                            java.lang.Object[] objArr = {e.toString()};
                            int myPid = android.os.Process.myPid();
                            int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            int i6 = indexOf * 784;
                            int i7 = ((i6 & 30497) | ((~i6) & (-30498))) + ((i6 & (-30498)) << 1);
                            int i8 = i7 & 31320;
                            int i9 = -(-((i7 ^ 31320) | i8));
                            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
                            int i11 = ~indexOf;
                            int i12 = ~i;
                            int i13 = i11 & i12;
                            int i14 = (i11 | i12) & (~i13);
                            int i15 = (i13 ^ i14) | (i14 & i13);
                            int i16 = (~((i15 ^ 39) | (i15 & 39))) * (-783);
                            int i17 = (i16 ^ i10) | (i10 & i16);
                            int i18 = i12 & 39;
                            int i19 = (i12 | 39) & (~i18);
                            int i20 = ~((i19 ^ i18) | (i19 & i18));
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            a(myPid >> 22, (((r10 & i17) + (i17 | r10)) - (~(-(~(-(-(((i20 ^ i11) | (i20 & i11)) * 783))))))) - 2, (char) android.graphics.Color.argb(0, 0, 0, 0), objArr2);
                            throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        bArr5 = bArr12;
                        bArr12 = bArr7;
                        valueOf(new java.lang.Object[]{bArr12}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr6}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    bArr5 = null;
                    bArr9 = null;
                    bArr6 = null;
                    bArr4 = bArr9;
                    bArr2 = bArr12;
                    bArr12 = bArr7;
                    bArr3 = bArr8;
                    valueOf(new java.lang.Object[]{bArr12}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr6}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                bArr8 = null;
            } catch (java.lang.Throwable th4) {
                th = th4;
                bArr8 = null;
            }
            try {
                byte[] aid = getAid((byte[]) future.get(), deviceNotSecureException.getSessionCode());
                try {
                    bArr6 = (byte[]) valueOf(new java.lang.Object[]{bArr5, aid}, 1852088232, -1852088222, (int) java.lang.System.currentTimeMillis());
                    try {
                        bArr12 = writeReplace(i, true);
                        int length = bArr5.length;
                        int i21 = length * 471;
                        int i22 = ((~i21) & 1413) | (i21 & (-1414));
                        int i23 = -(-((i21 & 1413) << 1));
                        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                        int i25 = ~length;
                        int i26 = length & (-4);
                        int i27 = i26 | (i25 & 3);
                        int i28 = length & 3;
                        int i29 = -(-(((i27 ^ i28) | (i27 & i28)) * (-470)));
                        int i30 = ((~i29) & i24) | ((~i24) & i29);
                        int i31 = -(-((i29 & i24) << 1));
                        int i32 = (i30 & i31) + (i30 | i31);
                        int i33 = i25 & (-4);
                        int i34 = ~(i33 | ((i25 | (-4)) & (~i33)));
                        int i35 = i ^ (-4);
                        i2 = ~i;
                        int i36 = i & (-4);
                        int i37 = ~((i35 ^ i36) | (i35 & i36));
                        int i38 = (i34 ^ i37) | (i34 & i37);
                        i3 = (i2 | i) & i2;
                        int i39 = (i3 ^ length) | (i3 & length);
                        int i40 = i39 & 3;
                        bArr11 = aid;
                        int i41 = (~i40) & (i39 | 3);
                        int i42 = (i41 ^ i40) | (i41 & i40);
                        int i43 = ~i42;
                        int i44 = (i42 | i43) & i43;
                        int i45 = ((~i44) & i38) | ((~i38) & i44);
                        int i46 = i44 & i38;
                        int i47 = ((i46 ^ i45) | (i46 & i45)) * (-470);
                        int i48 = ((i32 | i47) << 1) - (i47 ^ i32);
                        int i49 = (length ^ (-4)) | i26;
                        int i50 = (i49 ^ i) | (i49 & i);
                        int i51 = ~i50;
                        int i52 = (i50 | i51) & i51;
                        i4 = ~i2;
                        int i53 = (i25 & i2) | (length & i4);
                        int i54 = length & i2;
                        int i55 = (i54 ^ i53) | (i53 & i54);
                        int i56 = i55 & 3;
                        int i57 = (i55 | 3) & (~i56);
                        int i58 = ~((i57 ^ i56) | (i57 & i56));
                        int i59 = i52 ^ i58;
                        int i60 = i58 & i52;
                        int i61 = ((i60 ^ i59) | (i60 & i59)) * 470;
                        int i62 = i48 & i61;
                        i5 = (i62 - (~((i61 ^ i48) | i62))) - 1;
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        bArr11 = aid;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        bArr11 = aid;
                    }
                } catch (java.lang.Exception e4) {
                    e = e4;
                    bArr2 = aid;
                    bArr10 = null;
                    bArr6 = bArr10;
                    bArr4 = bArr10;
                    bArr3 = bArr8;
                    bArr12 = bArr5;
                    java.lang.Object[] objArr3 = {e.toString()};
                    int myPid2 = android.os.Process.myPid();
                    int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    int i63 = indexOf2 * 784;
                    int i72 = ((i63 & 30497) | ((~i63) & (-30498))) + ((i63 & (-30498)) << 1);
                    int i82 = i72 & 31320;
                    int i92 = -(-((i72 ^ 31320) | i82));
                    int i102 = (i82 ^ i92) + ((i82 & i92) << 1);
                    int i112 = ~indexOf2;
                    int i122 = ~i;
                    int i132 = i112 & i122;
                    int i142 = (i112 | i122) & (~i132);
                    int i152 = (i132 ^ i142) | (i142 & i132);
                    int i162 = (~((i152 ^ 39) | (i152 & 39))) * (-783);
                    int i172 = (i162 ^ i102) | (i102 & i162);
                    int i182 = i122 & 39;
                    int i192 = (i122 | 39) & (~i182);
                    int i202 = ~((i192 ^ i182) | (i192 & i182));
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    a(myPid2 >> 22, (((r10 & i172) + (i172 | r10)) - (~(-(~(-(-(((i202 ^ i112) | (i202 & i112)) * 783))))))) - 2, (char) android.graphics.Color.argb(0, 0, 0, 0), objArr22);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr22[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr3));
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bArr11 = aid;
                    bArr9 = null;
                    bArr6 = null;
                }
                try {
                    int i64 = -(-bArr6.length);
                    int i65 = ((i5 ^ i64) | (i5 & i64)) << 1;
                    int i66 = -(((~i64) & i5) | ((~i5) & i64));
                    byte[] bArr13 = new byte[(i65 ^ i66) + ((i66 & i65) << 1)];
                    java.lang.System.arraycopy(bArr12, 1, bArr13, 0, 3);
                    java.lang.System.arraycopy(bArr5, 0, bArr13, 3, bArr5.length);
                    int length2 = bArr5.length;
                    int i67 = (length2 * 784) - 2346;
                    int i68 = i67 & 3132;
                    int i69 = -(-((i67 ^ 3132) | i68));
                    int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                    int i71 = ~length2;
                    int i73 = (length2 | i71) & i71;
                    int i74 = (i73 & i3) | (i73 ^ i3);
                    int i75 = i74 & 3;
                    int i76 = -(-((~(((i74 | 3) & (~i75)) | i75)) * (-783)));
                    int i77 = ((i70 ^ i76) | (i70 & i76)) << 1;
                    int i78 = -(((~i76) & i70) | ((~i70) & i76));
                    int i79 = (i77 & i78) + (i78 | i77);
                    int i80 = (i2 & (-4)) | (i4 & 3);
                    int i81 = 3 & i2;
                    int i83 = ~((i80 ^ i81) | (i80 & i81));
                    int i84 = -(-(((i73 ^ i83) | (i73 & i83)) * 783));
                    java.lang.System.arraycopy(bArr6, 0, bArr13, (i79 & i84) + (i84 | i79), bArr6.length);
                    valueOf(new java.lang.Object[]{bArr7}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr8}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr11}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr6}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr12}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    com.payair.hce.accessisAutomaticTimeEnabled accessisautomatictimeenabled = new com.payair.hce.accessisAutomaticTimeEnabled(bArr13);
                    valueOf(new java.lang.Object[]{bArr7}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr8}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr11}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr6}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr12}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    int i85 = getAdditionalCheckTable;
                    getCardholderValidators = (i85 + 13) % 128;
                    int i86 = i85 & 37;
                    int i87 = (i86 - (~((i85 ^ 37) | i86))) - 1;
                    getCardholderValidators = i87 % 128;
                    if (i87 % 2 == 0) {
                        return accessisautomatictimeenabled;
                    }
                    throw new java.lang.ArithmeticException();
                } catch (java.lang.Exception e5) {
                    e = e5;
                    bArr2 = bArr11;
                    bArr10 = bArr12;
                    bArr4 = bArr10;
                    bArr3 = bArr8;
                    bArr12 = bArr5;
                    java.lang.Object[] objArr32 = {e.toString()};
                    int myPid22 = android.os.Process.myPid();
                    int indexOf22 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    int i632 = indexOf22 * 784;
                    int i722 = ((i632 & 30497) | ((~i632) & (-30498))) + ((i632 & (-30498)) << 1);
                    int i822 = i722 & 31320;
                    int i922 = -(-((i722 ^ 31320) | i822));
                    int i1022 = (i822 ^ i922) + ((i822 & i922) << 1);
                    int i1122 = ~indexOf22;
                    int i1222 = ~i;
                    int i1322 = i1122 & i1222;
                    int i1422 = (i1122 | i1222) & (~i1322);
                    int i1522 = (i1322 ^ i1422) | (i1422 & i1322);
                    int i1622 = (~((i1522 ^ 39) | (i1522 & 39))) * (-783);
                    int i1722 = (i1622 ^ i1022) | (i1022 & i1622);
                    int i1822 = i1222 & 39;
                    int i1922 = (i1222 | 39) & (~i1822);
                    int i2022 = ~((i1922 ^ i1822) | (i1922 & i1822));
                    java.lang.Object[] objArr222 = new java.lang.Object[1];
                    a(myPid22 >> 22, (((r10 & i1722) + (i1722 | r10)) - (~(-(~(-(-(((i2022 ^ i1122) | (i2022 & i1122)) * 783))))))) - 2, (char) android.graphics.Color.argb(0, 0, 0, 0), objArr222);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr222[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr32));
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    bArr9 = bArr12;
                    bArr12 = bArr11;
                    bArr4 = bArr9;
                    bArr2 = bArr12;
                    bArr12 = bArr7;
                    bArr3 = bArr8;
                    valueOf(new java.lang.Object[]{bArr12}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr6}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    throw th;
                }
            } catch (java.lang.Exception e6) {
                e = e6;
                bArr2 = null;
                bArr10 = null;
                bArr6 = bArr10;
                bArr4 = bArr10;
                bArr3 = bArr8;
                bArr12 = bArr5;
                java.lang.Object[] objArr322 = {e.toString()};
                int myPid222 = android.os.Process.myPid();
                int indexOf222 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int i6322 = indexOf222 * 784;
                int i7222 = ((i6322 & 30497) | ((~i6322) & (-30498))) + ((i6322 & (-30498)) << 1);
                int i8222 = i7222 & 31320;
                int i9222 = -(-((i7222 ^ 31320) | i8222));
                int i10222 = (i8222 ^ i9222) + ((i8222 & i9222) << 1);
                int i11222 = ~indexOf222;
                int i12222 = ~i;
                int i13222 = i11222 & i12222;
                int i14222 = (i11222 | i12222) & (~i13222);
                int i15222 = (i13222 ^ i14222) | (i14222 & i13222);
                int i16222 = (~((i15222 ^ 39) | (i15222 & 39))) * (-783);
                int i17222 = (i16222 ^ i10222) | (i10222 & i16222);
                int i18222 = i12222 & 39;
                int i19222 = (i12222 | 39) & (~i18222);
                int i20222 = ~((i19222 ^ i18222) | (i19222 & i18222));
                java.lang.Object[] objArr2222 = new java.lang.Object[1];
                a(myPid222 >> 22, (((r10 & i17222) + (i17222 | r10)) - (~(-(~(-(-(((i20222 ^ i11222) | (i20222 & i11222)) * 783))))))) - 2, (char) android.graphics.Color.argb(0, 0, 0, 0), objArr2222);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2222[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr322));
            } catch (java.lang.Throwable th8) {
                th = th8;
                bArr9 = null;
                bArr6 = null;
                bArr4 = bArr9;
                bArr2 = bArr12;
                bArr12 = bArr7;
                bArr3 = bArr8;
                valueOf(new java.lang.Object[]{bArr12}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr6}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                throw th;
            }
        } catch (java.lang.Exception e7) {
            e = e7;
            bArr2 = null;
            bArr3 = null;
            bArr4 = null;
            bArr7 = null;
            bArr6 = null;
        } catch (java.lang.Throwable th9) {
            th = th9;
            bArr2 = null;
            bArr3 = null;
            bArr4 = null;
            bArr5 = null;
            bArr6 = null;
        }
    }

    @Override // com.payair.hce.onNewToken
    public final byte[] values(com.payair.hce.isSessionAvailable issessionavailable, com.payair.hce.isSessionAvailable issessionavailable2, com.payair.hce.accessisAutomaticTimeEnabled accessisautomatictimeenabled, com.payair.hce.DeviceNotSecureException deviceNotSecureException) throws java.security.GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2 = null;
        try {
            java.util.concurrent.Future future = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, issessionavailable}, 937760869, -937760830, java.lang.System.identityHashCode(this));
            java.util.concurrent.Future future2 = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, issessionavailable2}, 937760869, -937760830, java.lang.System.identityHashCode(this));
            byte[] aid = getAid((byte[]) future.get(), deviceNotSecureException.getSessionCode());
            try {
                bArr2 = getAid((byte[]) future2.get(), deviceNotSecureException.getSessionCode());
                byte[] writeReplace = writeReplace((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{accessisautomatictimeenabled}, -1877837077, 1877837077, java.lang.System.identityHashCode(accessisautomatictimeenabled)), bArr2, aid);
                valueOf(new java.lang.Object[]{aid}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{aid}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                int i = getAdditionalCheckTable;
                getCardholderValidators = ((-2) - (~(i + 44))) % 128;
                int i2 = ((i ^ 67) + ((i & 67) << 1)) % 128;
                getCardholderValidators = i2;
                getAdditionalCheckTable = ((i2 ^ 93) + ((i2 & 93) << 1)) % 128;
                return writeReplace;
            } catch (java.lang.Exception e) {
                e = e;
                bArr = bArr2;
                bArr2 = aid;
                try {
                    try {
                        java.lang.Object[] objArr = {e.toString()};
                        int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                        int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                        int i3 = minimumFlingVelocity & 38;
                        int i4 = ((minimumFlingVelocity ^ 38) | i3) << 1;
                        int i5 = -((minimumFlingVelocity | 38) & (~i3));
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(deadChar, ((i4 | i5) << 1) - (i5 ^ i4), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr2);
                        throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                bArr = bArr2;
                bArr2 = aid;
                valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            bArr = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr = null;
        }
    }

    @Override // com.payair.hce.getDetailedMessage
    public final byte[] valueOf(byte[] bArr) throws java.security.GeneralSecurityException {
        byte[] bArr2;
        int i = getAdditionalCheckTable & 109;
        getCardholderValidators = ((((r0 | 109) & (~i)) - (~(i << 1))) - 1) % 128;
        try {
            bArr2 = valueOf(writeReplace("CUR_DST_MAC_KEY_ID"), bArr);
            int i2 = getAdditionalCheckTable;
            int i3 = ((i2 ^ 87) | (i2 & 87)) << 1;
            int i4 = -((i2 & (-88)) | ((~i2) & 87));
            getCardholderValidators = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        } catch (java.lang.Exception unused) {
            bArr2 = null;
        }
        int i5 = getCardholderValidators;
        int i6 = (i5 & (-20)) | ((~i5) & 19);
        int i7 = -(-((i5 & 19) << 1));
        getAdditionalCheckTable = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
        return bArr2;
    }

    @Override // com.payair.hce.getDetailedMessage
    public final byte[] AlternateContactlessPaymentDataJson(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] valueOf = valueOf(new java.lang.String(bArr), bArr2);
        int i = getAdditionalCheckTable;
        int i2 = i & 45;
        int i3 = (i | 45) & (~i2);
        int i4 = -(-(i2 << 1));
        getCardholderValidators = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        return valueOf;
    }

    private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = (com.payair.hce.initializeVisaPaymentSdk) objArr[1];
        int i = getAdditionalCheckTable + 121;
        getCardholderValidators = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        try {
            if (initializevisapaymentsdk != null && ((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk))) != null) {
                int i2 = getAdditionalCheckTable;
                int i3 = i2 & 1;
                int i4 = -(-((i2 ^ 1) | i3));
                int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
                getCardholderValidators = i5 % 128;
                java.lang.Object[] objArr2 = {initializevisapaymentsdk};
                int identityHashCode = java.lang.System.identityHashCode(initializevisapaymentsdk);
                if (i5 % 2 != 0) {
                    int length = ((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(objArr2, -1877837077, 1877837077, identityHashCode)).length;
                    throw new java.lang.ArithmeticException();
                }
                if (((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(objArr2, -1877837077, 1877837077, identityHashCode)).length != 0) {
                    try {
                        com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{setpivotx, initializevisapaymentsdk}, 1893095039, -1893095002, java.lang.System.identityHashCode(setpivotx))).get());
                        int length2 = AlternateContactlessPaymentDataJson.DigitizedCardProfile().length / 5;
                        int i6 = length2 << 1;
                        int i7 = length2 * 3;
                        int i8 = length2 << 2;
                        int writeReplace = setpivotx.writeReplace(new java.math.BigInteger(new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(AlternateContactlessPaymentDataJson.DigitizedCardProfile(0, length2).DigitizedCardProfile())), 16), new java.math.BigInteger(new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(AlternateContactlessPaymentDataJson.DigitizedCardProfile(length2, i6).DigitizedCardProfile())), 16), new java.math.BigInteger(new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(AlternateContactlessPaymentDataJson.DigitizedCardProfile(i6, i7).DigitizedCardProfile())), 16), new java.math.BigInteger(new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(AlternateContactlessPaymentDataJson.DigitizedCardProfile(i7, i8).DigitizedCardProfile())), 16), new java.math.BigInteger(new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(AlternateContactlessPaymentDataJson.DigitizedCardProfile(i8, length2 * 5).DigitizedCardProfile())), 16));
                        int i9 = getAdditionalCheckTable;
                        int i10 = i9 ^ 5;
                        int i11 = ((i9 & 5) | i10) << 1;
                        int i12 = -i10;
                        int i13 = ((i11 & i12) + (i11 | i12)) % 128;
                        getCardholderValidators = i13;
                        int i14 = i13 & 111;
                        int i15 = ((i14 - (~((i13 ^ 111) | i14))) - 1) % 128;
                        getAdditionalCheckTable = i15;
                        int i16 = i15 & 37;
                        int i17 = i15 | 37;
                        int i18 = (i16 & i17) + (i17 | i16);
                        getCardholderValidators = i18 % 128;
                        if (i18 % 2 == 0) {
                            return java.lang.Integer.valueOf(writeReplace);
                        }
                        throw null;
                    } catch (java.lang.InterruptedException | java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException | java.util.concurrent.ExecutionException e) {
                        java.lang.Thread.currentThread().interrupt();
                        java.lang.Object[] objArr3 = {e.toString()};
                        int green = android.graphics.Color.green(0);
                        float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                        int i19 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int identityHashCode2 = java.lang.System.identityHashCode(setpivotx);
                        int i20 = ~i19;
                        int i21 = i20 & identityHashCode2;
                        int i22 = (~i21) & (i20 | identityHashCode2);
                        int i23 = ~identityHashCode2;
                        int i24 = (i21 ^ i22) | (i21 & i22);
                        int i25 = ~i24;
                        int i26 = (((i19 * 319) + 317) - (~(-(-(((i24 | i25) & i25) * (-318)))))) - 1;
                        int i27 = (i23 | identityHashCode2) & i23;
                        int i28 = i27 & i19;
                        int i29 = i28 | ((i27 | i19) & (~i28));
                        int i30 = ~i29;
                        int i31 = ~((i29 ^ i30) | (i29 & i30));
                        int i32 = ((~i31) & i27) | ((~i27) & i31);
                        int i33 = i27 & i31;
                        int i34 = -(-(((i33 ^ i32) | (i33 & i32)) * 318));
                        int i35 = (i26 ^ i34) + ((i34 & i26) << 1);
                        int i36 = (i20 & i23) | ((~i23) & i19);
                        int i37 = i19 & i23;
                        int i38 = ~((i37 ^ i36) | (i37 & i36));
                        int i39 = identityHashCode2 ^ (-1);
                        int i40 = ~((identityHashCode2 ^ i39) | (identityHashCode2 & i39));
                        int i41 = i38 ^ i40;
                        int i42 = i40 & i38;
                        int i43 = -(~(-(-(((i42 ^ i41) | (i42 & i41)) * 318))));
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        a(green, 36 - (~(scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1))), (char) (((i35 & i43) + (i43 | i35)) - 1), objArr4);
                        throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr4[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr3));
                    }
                }
            }
            int i44 = getAdditionalCheckTable;
            getCardholderValidators = (i44 + 1) % 128;
            int i45 = i44 & 29;
            int i46 = -(-((i44 ^ 29) | i45));
            getCardholderValidators = ((i45 ^ i46) + ((i46 & i45) << 1)) % 128;
            java.lang.Object[] objArr5 = {"Icc key components not present"};
            int i47 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int identityHashCode3 = java.lang.System.identityHashCode(setpivotx);
            int i48 = i47 * com.knotapi.knot.utilities.Constants.ID_KROGER;
            int i49 = i48 & (-370);
            int i50 = i48 | (-370);
            int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
            int i52 = ~identityHashCode3;
            int i53 = (i52 | identityHashCode3) & i52;
            int i54 = -(-(((~i53) | i53) * (-369)));
            int i55 = i51 & i54;
            int i56 = -(-((i51 ^ i54) | i55));
            int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
            int i58 = ~i47;
            int i59 = (i58 | i47) & i58;
            int i60 = ~((i52 ^ i59) | (i59 & i52));
            int i61 = -(-((i60 | (~i60)) * (-369)));
            int i62 = (i57 & i61) + (i61 | i57);
            int i63 = i47 & identityHashCode3;
            int i64 = (identityHashCode3 | i47) & (~i63);
            int i65 = (i64 ^ i63) | (i64 & i63);
            int i66 = ~i65;
            int i67 = (i65 | i66) & i66;
            int i68 = (i67 & (~i58)) | ((~i67) & i58) | (i67 & i58);
            int i69 = (i58 ^ i53) | (i53 & i58);
            int i70 = ~i69;
            int i71 = ~((i69 ^ i70) | (i69 & i70));
            int i72 = -(-((((~i68) & i71) | ((~i71) & i68) | (i68 & i71)) * 369));
            int i73 = i62 & i72;
            int i74 = ((i62 ^ i72) | i73) << 1;
            int i75 = -((i72 | i62) & (~i73));
            int i76 = -(-android.view.KeyEvent.getDeadChar(0, 0));
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(((i74 | i75) << 1) - (i75 ^ i74), ((i76 & 38) - (~(-(-(i76 | 38))))) - 1, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr6);
            throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr6[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr5));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private int writeReplace(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, java.math.BigInteger bigInteger5) throws java.security.GeneralSecurityException {
        java.math.BigInteger multiply = bigInteger2.multiply(bigInteger3);
        java.math.BigInteger modInverse = bigInteger4.modInverse(bigInteger2.subtract(java.math.BigInteger.ONE));
        AlternateContactlessPaymentDataJson(new com.payair.hce.setContentInsetsAbsolute(multiply, modInverse, modInverse.modInverse(bigInteger2.subtract(java.math.BigInteger.ONE).multiply(bigInteger3.subtract(java.math.BigInteger.ONE)).divide(bigInteger2.subtract(java.math.BigInteger.ONE).gcd(bigInteger3.subtract(java.math.BigInteger.ONE)))), bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger), multiply.bitLength() / 8);
        int bitLength = multiply.bitLength() / 8;
        int i = getCardholderValidators;
        int i2 = i ^ 101;
        int i3 = ((i & 101) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        getAdditionalCheckTable = i5 % 128;
        if (i5 % 2 != 0) {
            return bitLength;
        }
        throw null;
    }

    @Override // com.payair.hce.sendUpdateRNSInformation
    public final com.payair.hce.initializeVisaPaymentSdk valueOf(com.payair.hce.getErrors geterrors, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk) throws java.security.GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i;
        int i2 = getCardholderValidators;
        int i3 = i2 ^ 51;
        getAdditionalCheckTable = (((((i2 & 51) | i3) << 1) - (~(-i3))) - 1) % 128;
        byte[] bArr4 = null;
        try {
            java.util.concurrent.Future future = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, initializevisapaymentsdk}, 1893095039, -1893095002, java.lang.System.identityHashCode(this));
            bArr = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, geterrors.AlternateContactlessPaymentDataJson()}, -593266716, 593266724, java.lang.System.identityHashCode(this))).get();
            try {
                int length = bArr.length;
                bArr2 = new byte[length];
                int i4 = getAdditionalCheckTable;
                getCardholderValidators = (((i4 ^ 46) + ((i4 & 46) << 1)) - 1) % 128;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = getCardholderValidators;
                    int i7 = i6 & 29;
                    int i8 = -(-((i6 ^ 29) | i7));
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    int i10 = i9 % 128;
                    getAdditionalCheckTable = i10;
                    if (i9 % 2 == 0) {
                        byte b = bArr[i5];
                        throw new java.lang.ArithmeticException();
                    }
                    try {
                        bArr2[i5] = (byte) (bArr[i5] << 1);
                        int i11 = i5 & 101;
                        int i12 = -(-((i5 ^ 101) | i11));
                        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                        int i14 = i13 & (-100);
                        int i15 = ((i13 ^ (-100)) | i14) << 1;
                        int i16 = -((~i14) & (i13 | (-100)));
                        i5 = (i16 | i15) + (i15 & i16);
                        int i17 = i10 & 33;
                        int i18 = (i10 ^ 33) | i17;
                        getCardholderValidators = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
                    } catch (java.lang.Exception e) {
                        e = e;
                        try {
                            try {
                                java.lang.Object[] objArr = {e.toString()};
                                float length2 = android.graphics.PointF.length(0.0f, 0.0f);
                                int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                                int identityHashCode = java.lang.System.identityHashCode(this);
                                int i19 = keyRepeatDelay * 471;
                                int i20 = (i19 & (-17899)) | ((~i19) & 17898);
                                int i21 = -(-((i19 & 17898) << 1));
                                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                                int i23 = keyRepeatDelay & 38;
                                int i24 = -(-((i23 | ((~i23) & (keyRepeatDelay | 38))) * (-470)));
                                int i25 = i22 & i24;
                                int i26 = ~keyRepeatDelay;
                                int i27 = i26 & (-39);
                                int i28 = (~i27) & (i26 | (-39));
                                int i29 = (i27 ^ i28) | (i28 & i27);
                                int i30 = ~i29;
                                int i31 = (i29 | i30) & i30;
                                int i32 = (identityHashCode ^ (-39)) | (identityHashCode & (-39));
                                int i33 = ~i32;
                                int i34 = (i32 | i33) & i33;
                                int i35 = i31 & i34;
                                int i36 = (i31 | i34) & (~i35);
                                int i37 = (i36 ^ i35) | (i36 & i35);
                                int i38 = ~identityHashCode;
                                int i39 = (i38 | identityHashCode) & i38;
                                int i40 = i39 & keyRepeatDelay;
                                int i41 = (~i40) & (i39 | keyRepeatDelay);
                                int i42 = (i40 ^ i41) | (i40 & i41);
                                int i43 = i42 & 38;
                                int i44 = (i42 | 38) & (~i43);
                                int i45 = (i44 ^ i43) | (i44 & i43);
                                int i46 = ~i45;
                                int i47 = (i45 | i46) & i46;
                                int i48 = i37 & i47;
                                int i49 = (i47 | i37) & (~i48);
                                int i50 = ((i25 + ((i24 ^ i22) | i25)) - (~(((i49 ^ i48) | (i49 & i48)) * (-470)))) - 1;
                                int i51 = (keyRepeatDelay ^ (-39)) | (keyRepeatDelay & (-39));
                                int i52 = (i51 & i38) | ((~i51) & identityHashCode);
                                int i53 = i51 & identityHashCode;
                                int i54 = (i53 ^ i52) | (i53 & i52);
                                int i55 = ~i54;
                                int i56 = (i54 | i55) & i55;
                                int i57 = i38 & keyRepeatDelay;
                                int i58 = i57 | ((~i57) & (i38 | keyRepeatDelay));
                                int i59 = (i58 & (-39)) | ((~i58) & 38);
                                int i60 = i58 & 38;
                                int i61 = (i60 ^ i59) | (i60 & i59);
                                int i62 = ~i61;
                                int i63 = (i61 | i62) & i62;
                                int i64 = i56 & i63;
                                int i65 = (i56 | i63) & (~i64);
                                int i66 = ((i65 ^ i64) | (i65 & i64)) * 470;
                                int i67 = i50 & i66;
                                int i68 = -(-((i66 ^ i50) | i67));
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                a((length2 > 0.0f ? 1 : (length2 == 0.0f ? 0 : -1)), (i67 & i68) + (i68 | i67), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr2);
                                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            bArr3 = bArr4;
                            bArr2 = bArr2;
                            bArr4 = bArr3;
                            valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                            valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                            valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        throw th;
                    }
                }
                bArr3 = (byte[]) future.get();
            } catch (java.lang.Exception e2) {
                e = e2;
                bArr2 = null;
                java.lang.Object[] objArr3 = {e.toString()};
                float length22 = android.graphics.PointF.length(0.0f, 0.0f);
                int keyRepeatDelay2 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                int identityHashCode2 = java.lang.System.identityHashCode(this);
                int i192 = keyRepeatDelay2 * 471;
                int i202 = (i192 & (-17899)) | ((~i192) & 17898);
                int i212 = -(-((i192 & 17898) << 1));
                int i222 = ((i202 | i212) << 1) - (i212 ^ i202);
                int i232 = keyRepeatDelay2 & 38;
                int i242 = -(-((i232 | ((~i232) & (keyRepeatDelay2 | 38))) * (-470)));
                int i252 = i222 & i242;
                int i262 = ~keyRepeatDelay2;
                int i272 = i262 & (-39);
                int i282 = (~i272) & (i262 | (-39));
                int i292 = (i272 ^ i282) | (i282 & i272);
                int i302 = ~i292;
                int i312 = (i292 | i302) & i302;
                int i322 = (identityHashCode2 ^ (-39)) | (identityHashCode2 & (-39));
                int i332 = ~i322;
                int i342 = (i322 | i332) & i332;
                int i352 = i312 & i342;
                int i362 = (i312 | i342) & (~i352);
                int i372 = (i362 ^ i352) | (i362 & i352);
                int i382 = ~identityHashCode2;
                int i392 = (i382 | identityHashCode2) & i382;
                int i402 = i392 & keyRepeatDelay2;
                int i412 = (~i402) & (i392 | keyRepeatDelay2);
                int i422 = (i402 ^ i412) | (i402 & i412);
                int i432 = i422 & 38;
                int i442 = (i422 | 38) & (~i432);
                int i452 = (i442 ^ i432) | (i442 & i432);
                int i462 = ~i452;
                int i472 = (i452 | i462) & i462;
                int i482 = i372 & i472;
                int i492 = (i472 | i372) & (~i482);
                int i502 = ((i252 + ((i242 ^ i222) | i252)) - (~(((i492 ^ i482) | (i492 & i482)) * (-470)))) - 1;
                int i512 = (keyRepeatDelay2 ^ (-39)) | (keyRepeatDelay2 & (-39));
                int i522 = (i512 & i382) | ((~i512) & identityHashCode2);
                int i532 = i512 & identityHashCode2;
                int i542 = (i532 ^ i522) | (i532 & i522);
                int i552 = ~i542;
                int i562 = (i542 | i552) & i552;
                int i572 = i382 & keyRepeatDelay2;
                int i582 = i572 | ((~i572) & (i382 | keyRepeatDelay2));
                int i592 = (i582 & (-39)) | ((~i582) & 38);
                int i602 = i582 & 38;
                int i612 = (i602 ^ i592) | (i602 & i592);
                int i622 = ~i612;
                int i632 = (i612 | i622) & i622;
                int i642 = i562 & i632;
                int i652 = (i562 | i632) & (~i642);
                int i662 = ((i652 ^ i642) | (i652 & i642)) * 470;
                int i672 = i502 & i662;
                int i682 = -(-((i662 ^ i502) | i672));
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                a((length22 > 0.0f ? 1 : (length22 == 0.0f ? 0 : -1)), (i672 & i682) + (i682 | i672), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr22);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr22[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr3));
            } catch (java.lang.Throwable th4) {
                th = th4;
                bArr2 = null;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            bArr = null;
        } catch (java.lang.Throwable th5) {
            th = th5;
            bArr = null;
            bArr2 = null;
        }
        try {
            if (bArr.length < 8) {
                int i69 = getCardholderValidators;
                int i70 = (-2) - (~(((i69 | 2) << 1) - (i69 ^ 2)));
                int i71 = i70 % 128;
                getAdditionalCheckTable = i71;
                if (i70 % 2 == 0) {
                    int length3 = bArr.length;
                    throw new java.lang.ArithmeticException();
                }
                i = bArr.length;
                int i72 = i71 ^ 15;
                int i73 = ((i71 & 15) | i72) << 1;
                int i74 = -i72;
                getCardholderValidators = ((i73 & i74) + (i73 | i74)) % 128;
            } else {
                int i75 = getCardholderValidators;
                getAdditionalCheckTable = ((-2) - (~((i75 & 92) + (i75 | 92)))) % 128;
                i = 8;
            }
            int i76 = getCardholderValidators;
            int i77 = i76 & 117;
            int i78 = ((i76 ^ 117) | i77) << 1;
            int i79 = -((i76 | 117) & (~i77));
            int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
            getAdditionalCheckTable = i80 % 128;
            int i81 = i80 % 2;
            int i82 = 0;
            while (i82 < i) {
                getCardholderValidators = (getAdditionalCheckTable + 73) % 128;
                byte b2 = bArr3[i82];
                byte b3 = bArr2[i82];
                bArr3[i82] = (byte) ((~(b2 & b3)) & (b2 | b3));
                int identityHashCode3 = java.lang.System.identityHashCode(this);
                int i83 = -(~(i82 * 561));
                int i84 = ((i83 & (-4472)) + (i83 | (-4472))) - 1;
                int i85 = ~identityHashCode3;
                int i86 = i85 & (i85 | identityHashCode3);
                int i87 = i86 ^ 8;
                int i88 = i86 & 8;
                int i89 = -(~((~((i87 ^ i88) | (i87 & i88))) * (-560)));
                int i90 = (((i84 | i89) << 1) - (i84 ^ i89)) - 1;
                int i91 = ~i82;
                int i92 = (i91 & (-9)) | ((~i91) & 8);
                int i93 = i91 & 8;
                int i94 = (i92 ^ i93) | (i92 & i93);
                int i95 = i94 ^ identityHashCode3;
                int i96 = i94 & identityHashCode3;
                int i97 = (i96 ^ i95) | (i96 & i95);
                int i98 = ~i97;
                int i99 = ((i97 | i98) & i98) * (-560);
                int i100 = (((i90 ^ i99) | (i90 & i99)) << 1) - (((~i99) & i90) | ((~i90) & i99));
                int i101 = ~((i82 & (-9)) | (i82 ^ (-9)));
                int i102 = i86 & i82;
                int i103 = (i86 | i82) & (~i102);
                int i104 = (i103 ^ i102) | (i102 & i103);
                int i105 = ~i104;
                int i106 = (i104 | i105) & i105;
                int i107 = ((~i106) & i101) | ((~i101) & i106);
                int i108 = i101 & i106;
                int i109 = -(-(((i108 ^ i107) | (i108 & i107)) * 560));
                int i110 = i100 ^ i109;
                int i111 = (((i109 & i100) | i110) << 1) - i110;
                byte b4 = bArr3[i111];
                byte b5 = bArr2[i82];
                bArr3[i111] = (byte) ((~(b4 & b5)) & (b4 | b5));
                i82 = ((i82 ^ 2) + ((i82 & 2) << 1)) - 1;
                int i112 = getCardholderValidators;
                int i113 = i112 ^ 71;
                int i114 = (i112 & 71) << 1;
                getAdditionalCheckTable = (((i113 | i114) << 1) - (i114 ^ i113)) % 128;
            }
            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2 = new com.payair.hce.initializeVisaPaymentSdk((byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, bArr3}, -1260886295, 1260886321, java.lang.System.identityHashCode(this))).get());
            valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            int i115 = getAdditionalCheckTable;
            int i116 = i115 & 121;
            int i117 = i116 + ((i115 ^ 121) | i116);
            getCardholderValidators = i117 % 128;
            if (i117 % 2 == 0) {
                return initializevisapaymentsdk2;
            }
            throw null;
        } catch (java.lang.Exception e4) {
            e = e4;
            bArr4 = bArr3;
            java.lang.Object[] objArr32 = {e.toString()};
            float length222 = android.graphics.PointF.length(0.0f, 0.0f);
            int keyRepeatDelay22 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
            int identityHashCode22 = java.lang.System.identityHashCode(this);
            int i1922 = keyRepeatDelay22 * 471;
            int i2022 = (i1922 & (-17899)) | ((~i1922) & 17898);
            int i2122 = -(-((i1922 & 17898) << 1));
            int i2222 = ((i2022 | i2122) << 1) - (i2122 ^ i2022);
            int i2322 = keyRepeatDelay22 & 38;
            int i2422 = -(-((i2322 | ((~i2322) & (keyRepeatDelay22 | 38))) * (-470)));
            int i2522 = i2222 & i2422;
            int i2622 = ~keyRepeatDelay22;
            int i2722 = i2622 & (-39);
            int i2822 = (~i2722) & (i2622 | (-39));
            int i2922 = (i2722 ^ i2822) | (i2822 & i2722);
            int i3022 = ~i2922;
            int i3122 = (i2922 | i3022) & i3022;
            int i3222 = (identityHashCode22 ^ (-39)) | (identityHashCode22 & (-39));
            int i3322 = ~i3222;
            int i3422 = (i3222 | i3322) & i3322;
            int i3522 = i3122 & i3422;
            int i3622 = (i3122 | i3422) & (~i3522);
            int i3722 = (i3622 ^ i3522) | (i3622 & i3522);
            int i3822 = ~identityHashCode22;
            int i3922 = (i3822 | identityHashCode22) & i3822;
            int i4022 = i3922 & keyRepeatDelay22;
            int i4122 = (~i4022) & (i3922 | keyRepeatDelay22);
            int i4222 = (i4022 ^ i4122) | (i4022 & i4122);
            int i4322 = i4222 & 38;
            int i4422 = (i4222 | 38) & (~i4322);
            int i4522 = (i4422 ^ i4322) | (i4422 & i4322);
            int i4622 = ~i4522;
            int i4722 = (i4522 | i4622) & i4622;
            int i4822 = i3722 & i4722;
            int i4922 = (i4722 | i3722) & (~i4822);
            int i5022 = ((i2522 + ((i2422 ^ i2222) | i2522)) - (~(((i4922 ^ i4822) | (i4922 & i4822)) * (-470)))) - 1;
            int i5122 = (keyRepeatDelay22 ^ (-39)) | (keyRepeatDelay22 & (-39));
            int i5222 = (i5122 & i3822) | ((~i5122) & identityHashCode22);
            int i5322 = i5122 & identityHashCode22;
            int i5422 = (i5322 ^ i5222) | (i5322 & i5222);
            int i5522 = ~i5422;
            int i5622 = (i5422 | i5522) & i5522;
            int i5722 = i3822 & keyRepeatDelay22;
            int i5822 = i5722 | ((~i5722) & (i3822 | keyRepeatDelay22));
            int i5922 = (i5822 & (-39)) | ((~i5822) & 38);
            int i6022 = i5822 & 38;
            int i6122 = (i6022 ^ i5922) | (i6022 & i5922);
            int i6222 = ~i6122;
            int i6322 = (i6122 | i6222) & i6222;
            int i6422 = i5622 & i6322;
            int i6522 = (i5622 | i6322) & (~i6422);
            int i6622 = ((i6522 ^ i6422) | (i6522 & i6422)) * 470;
            int i6722 = i5022 & i6622;
            int i6822 = -(-((i6622 ^ i5022) | i6722));
            java.lang.Object[] objArr222 = new java.lang.Object[1];
            a((length222 > 0.0f ? 1 : (length222 == 0.0f ? 0 : -1)), (i6722 & i6822) + (i6822 | i6722), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr222);
            throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr222[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr32));
        } catch (java.lang.Throwable th6) {
            th = th6;
            bArr2 = bArr2;
            bArr4 = bArr3;
            valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            throw th;
        }
    }

    @Override // com.payair.hce.onNewToken
    public final com.payair.hce.accessperformEnrollDas AlternateContactlessPaymentDataJson(com.payair.hce.isSessionAvailable issessionavailable, com.payair.hce.updateRNSInformation updaternsinformation, com.payair.hce.accessperformEnroll accessperformenroll) throws java.security.GeneralSecurityException {
        byte[] bArr;
        java.util.concurrent.Future future;
        java.util.concurrent.Future future2;
        byte[] bArr2 = null;
        try {
            try {
                future = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, issessionavailable}, 937760869, -937760830, java.lang.System.identityHashCode(this));
                future2 = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, accessperformenroll}, -593266716, 593266724, java.lang.System.identityHashCode(this));
                bArr = updaternsinformation.AlternateContactlessPaymentDataJson();
            } catch (java.lang.Exception e) {
                e = e;
            }
        } catch (java.lang.Throwable th) {
            th = th;
            bArr = bArr2;
        }
        try {
            com.payair.hce.accessperformEnrollDas accessperformenrolldas = new com.payair.hce.accessperformEnrollDas((byte[]) valueOf(new java.lang.Object[]{this, (byte[]) future2.get(), new java.lang.String(bArr), (byte[]) future.get()}, -410923553, 410923591, java.lang.System.identityHashCode(this)));
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            int i = getAdditionalCheckTable;
            int i2 = ((i & 43) + (i | 43)) % 128;
            getCardholderValidators = i2;
            int i3 = (((i2 | 52) << 1) - (i2 ^ 52)) - 1;
            getAdditionalCheckTable = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 & 107;
            int i5 = i2 | 107;
            int i6 = (i4 & i5) + (i4 | i5);
            getAdditionalCheckTable = i6 % 128;
            if (i6 % 2 != 0) {
                return accessperformenrolldas;
            }
            throw null;
        } catch (java.lang.Exception e2) {
            e = e2;
            bArr2 = bArr;
            try {
                java.lang.Object[] objArr = {e.toString()};
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(android.view.KeyEvent.getMaxKeyCode() >> 16, 35 - (~(-(~(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), (char) android.text.TextUtils.indexOf("", "", 0), objArr2);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            throw th;
        }
    }

    @Override // com.payair.hce.onNewToken
    public final com.payair.hce.checkAutomaticTimeSettings DigitizedCardProfile(com.payair.hce.isSessionAvailable issessionavailable, com.payair.hce.updateRNSInformation updaternsinformation, com.payair.hce.accessperformEnroll accessperformenroll) throws java.security.GeneralSecurityException {
        byte[] bArr = null;
        try {
            try {
                java.util.concurrent.Future future = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, issessionavailable}, 937760869, -937760830, java.lang.System.identityHashCode(this));
                java.util.concurrent.Future future2 = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, accessperformenroll}, -593266716, 593266724, java.lang.System.identityHashCode(this));
                bArr = updaternsinformation.AlternateContactlessPaymentDataJson();
                com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings = new com.payair.hce.checkAutomaticTimeSettings((byte[]) valueOf(new java.lang.Object[]{this, (byte[]) future2.get(), new java.lang.String(bArr), (byte[]) future.get()}, -410923553, 410923591, java.lang.System.identityHashCode(this)));
                valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                int i = getCardholderValidators;
                int i2 = ((i ^ 7) + ((i & 7) << 1)) % 128;
                getAdditionalCheckTable = i2;
                int i3 = ((i2 | 23) << 1) - (i2 ^ 23);
                getCardholderValidators = i3 % 128;
                if (i3 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                int i4 = i2 + 1;
                getCardholderValidators = i4 % 128;
                if (i4 % 2 == 0) {
                    return checkautomatictimesettings;
                }
                throw new java.lang.ArithmeticException();
            } catch (java.lang.Exception e) {
                try {
                    java.lang.Object[] objArr = {e.toString()};
                    long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int identityHashCode = java.lang.System.identityHashCode(this);
                    int i5 = lastIndexOf * 829;
                    int i6 = i5 & 32331;
                    int i7 = (i5 | 32331) & (~i6);
                    int i8 = i6 << 1;
                    int i9 = ~lastIndexOf;
                    int i10 = i9 ^ (-40);
                    int i11 = i9 & (-40);
                    int i12 = ~((i11 & i10) | (i10 ^ i11));
                    int i13 = ~identityHashCode;
                    int i14 = (identityHashCode | i13) & i13;
                    int i15 = i14 & lastIndexOf;
                    int i16 = i15 | ((~i15) & (i14 | lastIndexOf));
                    int i17 = i16 ^ 39;
                    int i18 = i16 & 39;
                    int i19 = ~((i18 ^ i17) | (i18 & i17));
                    int i20 = ((~i19) & i12) | ((~i12) & i19);
                    int i21 = i19 & i12;
                    int i22 = (((i7 ^ i8) + ((i7 & i8) << 1)) - (~(((i21 ^ i20) | (i21 & i20)) * (-828)))) - 1;
                    int i23 = (lastIndexOf & (-40)) | (i9 & 39);
                    int i24 = lastIndexOf & 39;
                    int i25 = (i23 ^ i24) | (i23 & i24);
                    int i26 = i25 ^ i13;
                    int i27 = i25 & i13;
                    int i28 = ((i27 ^ i26) | (i27 & i26)) * (-828);
                    int i29 = -(-((~(i24 | (lastIndexOf ^ 39))) * 828));
                    byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                    int identityHashCode2 = java.lang.System.identityHashCode(this);
                    int i30 = modifierMetaStateMask * (-109);
                    int i31 = ~modifierMetaStateMask;
                    int i32 = identityHashCode2 ^ 1;
                    int i33 = identityHashCode2 & 1;
                    int i34 = (i33 ^ i32) | (i33 & i32);
                    int i35 = ~i34;
                    int i36 = (~i35) & i31;
                    int i37 = ~i31;
                    int i38 = ((((i30 ^ 112) + ((i30 & 112) << 1)) - 1) - (~(-(-(((i36 | (i37 & i35)) | (i31 & i35)) * (-220)))))) - 1;
                    int i39 = modifierMetaStateMask & (-2);
                    int i40 = i31 & 1;
                    int i41 = i39 | i40;
                    int i42 = modifierMetaStateMask & 1;
                    int i43 = ~((i41 & i42) | (i41 ^ i42));
                    int i44 = (i34 | i35) & i35;
                    int i45 = -(-(((i43 ^ i44) | (i44 & i43)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                    int i46 = ((~i45) & i38) | ((~i38) & i45);
                    int i47 = -(-((i45 & i38) << 1));
                    int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                    int i49 = (i31 & (-2)) | (i37 & 1);
                    int i50 = (i49 ^ i40) | (i49 & i40);
                    int i51 = ~i50;
                    int i52 = (i50 | i51) & i51;
                    int i53 = modifierMetaStateMask ^ (-2);
                    int i54 = (i53 ^ i39) | (i39 & i53);
                    int i55 = ~i54;
                    int i56 = (i54 | i55) & i55;
                    int i57 = i52 & i56;
                    int i58 = (((i52 | i56) & (~i57)) | i57) * 110;
                    int i59 = ((i48 ^ i58) | (i48 & i58)) << 1;
                    int i60 = -(((~i58) & i48) | ((~i48) & i58));
                    char c = (char) ((i59 ^ i60) + ((i60 & i59) << 1));
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a((packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), ((((i22 | i28) << 1) - (((~i28) & i22) | ((~i22) & i28))) - (~i29)) - 1, c, objArr2);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            throw th2;
        }
    }

    private static /* synthetic */ java.lang.Object getApplicationLifeCycleData(java.lang.Object[] objArr) {
        try {
            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = new com.payair.hce.initializeVisaPaymentSdk(((com.payair.hce.setPivotX) objArr[0]).IccPrivateKeyCrtComponentsJson((byte[]) objArr[1]).get());
            int i = getCardholderValidators + 26;
            getAdditionalCheckTable = ((~i) + (i << 1)) % 128;
            return initializevisapaymentsdk;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.payair.hce.setPivotX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // com.payair.hce.onNewToken
    public final com.payair.hce.initializeVisaPaymentSdk AlternateContactlessPaymentDataJson(com.payair.hce.isSessionAvailable issessionavailable, com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings) throws java.security.GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        int i = getCardholderValidators;
        int i2 = i & 49;
        int i3 = (i ^ 49) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getAdditionalCheckTable = i4 % 128;
        ?? r4 = i4 % 2;
        byte[] bArr3 = null;
        try {
            try {
                try {
                    if (r4 != 0) {
                        byte[] bArr4 = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, issessionavailable}, 937760869, -937760830, java.lang.System.identityHashCode(this))).get();
                        byte[] DigitizedCardProfile = DigitizedCardProfile((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{checkautomatictimesettings}, -1877837077, 1877837077, java.lang.System.identityHashCode(checkautomatictimesettings)), bArr4);
                        if (DigitizedCardProfile == null || DigitizedCardProfile.length != 16) {
                            if (DigitizedCardProfile != null) {
                                int i5 = getCardholderValidators;
                                getAdditionalCheckTable = ((i5 ^ 81) + ((i5 & 81) << 1)) % 128;
                                if (DigitizedCardProfile.length == 8) {
                                    int i6 = ((i5 ^ 43) | (i5 & 43)) << 1;
                                    int i7 = -((i5 & (-44)) | ((~i5) & 43));
                                    getAdditionalCheckTable = ((i6 & i7) + (i6 | i7)) % 128;
                                    bArr2 = DigitizedCardProfile;
                                }
                            }
                            throw new java.lang.IllegalArgumentException("Invalid IDN");
                        }
                        int i8 = getCardholderValidators;
                        getAdditionalCheckTable = (((i8 | 95) << 1) - (i8 ^ 95)) % 128;
                        bArr2 = new byte[8];
                        java.lang.System.arraycopy(DigitizedCardProfile, 8, bArr2, 0, 8);
                        int i9 = getCardholderValidators;
                        int i10 = i9 & 41;
                        getAdditionalCheckTable = ((((i9 | 41) & (~i10)) - (~(-(-(i10 << 1))))) - 1) % 128;
                        com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = new com.payair.hce.initializeVisaPaymentSdk((byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, bArr2}, -1260886295, 1260886321, java.lang.System.identityHashCode(this))).get());
                        valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{DigitizedCardProfile}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{DigitizedCardProfile}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        int i11 = getCardholderValidators;
                        int i12 = (i11 & 69) + (i11 | 69);
                        getAdditionalCheckTable = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 5 / 2;
                        }
                        getAdditionalCheckTable = ((i11 ^ 71) + ((i11 & 71) << 1)) % 128;
                        return initializevisapaymentsdk;
                    }
                    r4 = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, issessionavailable}, 937760869, -937760830, java.lang.System.identityHashCode(this))).get();
                    bArr = DigitizedCardProfile((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{checkautomatictimesettings}, -1877837077, 1877837077, java.lang.System.identityHashCode(checkautomatictimesettings)), r4);
                    try {
                        throw null;
                    } catch (java.lang.Exception e) {
                        e = e;
                        bArr3 = bArr;
                        try {
                            java.lang.Object[] objArr = {e.toString()};
                            int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                            int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                            int identityHashCode = java.lang.System.identityHashCode(this);
                            int i14 = combineMeasuredStates * 193;
                            int i15 = (i14 & 7334) + (i14 | 7334);
                            int i16 = ~identityHashCode;
                            int i17 = ~combineMeasuredStates;
                            int i18 = i17 & 38;
                            int i19 = (~i18) & (i17 | 38);
                            int i20 = ~((i19 ^ i18) | (i19 & i18));
                            int i21 = ~i16;
                            int i22 = (i21 & i20) | ((~i20) & i16);
                            int i23 = i20 & i16;
                            int i24 = -(~(-(-(((i23 & i22) | (i23 ^ i22)) * (-192)))));
                            int i25 = (i15 ^ i24) + ((i24 & i15) << 1);
                            int i26 = (~i25) + (i25 << 1);
                            int i27 = (i17 ^ (-39)) | (i17 & (-39));
                            int i28 = ~i27;
                            int i29 = (i27 | i28) & i28;
                            int i30 = (i21 & (-39)) | (i16 & 38);
                            int i31 = i16 & (-39);
                            int i32 = ~((i30 ^ i31) | (i30 & i31));
                            int i33 = ((~i32) & i29) | ((~i29) & i32);
                            int i34 = i29 & i32;
                            int i35 = ((i33 ^ i34) | (i33 & i34)) * (-384);
                            int i36 = i26 & i35;
                            int i37 = i35 | i26;
                            int i38 = (i36 & i37) + (i37 | i36);
                            int i39 = (i17 | combineMeasuredStates) & i17;
                            int i40 = (i39 ^ (-39)) | (i39 & (-39));
                            int i41 = (i40 & i16) | ((~i40) & identityHashCode);
                            int i42 = i40 & identityHashCode;
                            int i43 = (i42 ^ i41) | (i42 & i41);
                            int i44 = ~i43;
                            int i45 = (i43 | i44) & i44;
                            int i46 = (i16 | (-39)) & (~i31);
                            int i47 = (i46 ^ i31) | (i46 & i31);
                            int i48 = i47 & combineMeasuredStates;
                            int i49 = (i47 | combineMeasuredStates) & (~i48);
                            int i50 = (i49 ^ i48) | (i49 & i48);
                            int i51 = ~i50;
                            int i52 = (i50 | i51) & i51;
                            int i53 = (i45 ^ i52) | (i45 & i52);
                            int i54 = (combineMeasuredStates & (-39)) | i18;
                            int i55 = combineMeasuredStates & 38;
                            int i56 = (i54 ^ i55) | (i55 & i54);
                            int i57 = i56 & identityHashCode;
                            int i58 = ~(((i56 | identityHashCode) & (~i57)) | i57);
                            int i59 = ((~i58) & i53) | ((~i53) & i58);
                            int i60 = i53 & i58;
                            int i61 = ((i60 ^ i59) | (i60 & i59)) * 192;
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            a(normalizeMetaState, ((i38 | i61) << 1) - (i61 ^ i38), (char) android.text.TextUtils.indexOf("", "", 0), objArr2);
                            throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        bArr3 = r4;
                        valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                        throw th;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                bArr = bArr3;
                bArr3 = r4;
                valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                throw th;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            r4 = 0;
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr = null;
            valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object SdkCoreCardRiskManagementDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        final byte[] bArr = (byte[]) objArr[1];
        java.util.concurrent.Future submit = setpivotx.values.submit(new java.util.concurrent.Callable<byte[]>() { // from class: com.payair.hce.setPivotX.10
            private static int valueOf = 1;
            private static int values;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2, int i, int i2, int i3) {
                int i4 = ~i2;
                int i5 = (~i3) | i4;
                int i6 = ~i;
                if ((i * (-112)) + (i2 * (-112)) + (((~i5) | i) * 226) + (((~(i | i5)) | (~(i2 | i6)) | (~(i6 | i3))) * (-113)) + ((~(i4 | i3)) * 113) == 1) {
                    return AlternateContactlessPaymentDataJson(objArr2);
                }
                com.payair.hce.setPivotX.AnonymousClass10 anonymousClass10 = (com.payair.hce.setPivotX.AnonymousClass10) objArr2[0];
                int i7 = valueOf;
                int i8 = (i7 & (-66)) | ((~i7) & 65);
                int i9 = (i7 & 65) << 1;
                values = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
                com.payair.hce.setPivotX setpivotx2 = com.payair.hce.setPivotX.this;
                byte[] writeReplace = setpivotx2.writeReplace(setpivotx2.writeReplace("CUR_L_DEK_KEY_ID"), bArr);
                int i10 = values;
                int i11 = i10 & 69;
                valueOf = ((i11 - (~((i10 ^ 69) | i11))) - 1) % 128;
                return writeReplace;
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                com.payair.hce.setPivotX.AnonymousClass10 anonymousClass10 = (com.payair.hce.setPivotX.AnonymousClass10) objArr2[0];
                int i = valueOf;
                int i2 = (i & (-42)) | ((~i) & 41);
                int i3 = -(-((i & 41) << 1));
                values = ((i2 & i3) + (i3 | i2)) % 128;
                byte[] bArr2 = (byte[]) DigitizedCardProfile(new java.lang.Object[]{anonymousClass10}, 1646406880, -1646406880, java.lang.System.identityHashCode(anonymousClass10));
                int i4 = valueOf;
                int i5 = i4 & 115;
                int i6 = (((i4 ^ 115) | i5) << 1) - ((i4 | 115) & (~i5));
                values = i6 % 128;
                if (i6 % 2 == 0) {
                    return bArr2;
                }
                throw null;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ byte[] call() throws java.lang.Exception {
                ?? DigitizedCardProfile = DigitizedCardProfile(new java.lang.Object[]{this}, -535900572, 535900573, java.lang.System.identityHashCode(this));
                return DigitizedCardProfile;
            }

            private byte[] writeReplace() throws java.lang.Exception {
                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 1646406880, -1646406880, java.lang.System.identityHashCode(this));
            }
        });
        int i = getAdditionalCheckTable;
        int i2 = i & 27;
        int i3 = (i | 27) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        getCardholderValidators = i5 % 128;
        if (i5 % 2 == 0) {
            return submit;
        }
        throw new java.lang.ArithmeticException();
    }

    private java.util.concurrent.Future<byte[]> getAid(final byte[] bArr) throws java.security.GeneralSecurityException {
        java.util.concurrent.Future<byte[]> submit = this.values.submit(new java.util.concurrent.Callable<byte[]>() { // from class: com.payair.hce.setPivotX.8
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static int AlternateContactlessPaymentDataJson;
            private static int valueOf;
            private static int[] values;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                return AlternateContactlessPaymentDataJson(objArr);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(short s, int i, short s2, java.lang.Object[] objArr) {
                int i2;
                int i3;
                byte[] bArr2 = $$a;
                int i4 = 38 - (s2 * 34);
                int i5 = 35 - (i * 34);
                int i6 = (s * 653) + 65;
                char[] cArr = new char[i5];
                if (bArr2 == null) {
                    int i7 = i5;
                    i3 = 0;
                    i4++;
                    i6 = (i6 + (-i7)) - 2;
                    i2 = i3;
                    i3 = i2 + 1;
                    cArr[i2] = (char) i6;
                    if (i3 == i5) {
                        objArr[0] = new java.lang.String(cArr);
                        return;
                    }
                    i7 = bArr2[i4];
                    i4++;
                    i6 = (i6 + (-i7)) - 2;
                    i2 = i3;
                    i3 = i2 + 1;
                    cArr[i2] = (char) i6;
                    if (i3 == i5) {
                    }
                } else {
                    i2 = 0;
                    i3 = i2 + 1;
                    cArr[i2] = (char) i6;
                    if (i3 == i5) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(byte b, byte b2, short s, java.lang.Object[] objArr) {
                int i;
                byte[] bArr2 = $$d;
                int i2 = b2 + 4;
                int i3 = 66 - (s * 2);
                int i4 = b * 3;
                byte[] bArr3 = new byte[i4 + 1];
                if (bArr2 == null) {
                    int i5 = i4;
                    int i6 = i2;
                    int i7 = 0;
                    int i8 = (-i2) + i5;
                    i = i7;
                    int i9 = i6;
                    i3 = i8;
                    i2 = i9;
                    bArr3[i] = (byte) i3;
                    int i10 = i2 + 1;
                    if (i == i4) {
                        objArr[0] = new java.lang.String(bArr3, 0);
                        return;
                    }
                    int i11 = i3;
                    i6 = i10;
                    i2 = bArr2[i10];
                    i7 = i + 1;
                    i5 = i11;
                    int i82 = (-i2) + i5;
                    i = i7;
                    int i92 = i6;
                    i3 = i82;
                    i2 = i92;
                    bArr3[i] = (byte) i3;
                    int i102 = i2 + 1;
                    if (i == i4) {
                    }
                } else {
                    i = 0;
                    bArr3[i] = (byte) i3;
                    int i1022 = i2 + 1;
                    if (i == i4) {
                    }
                }
            }

            private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
                int length;
                int[] iArr2;
                int i2;
                int[] iArr3;
                int length2;
                int[] iArr4;
                com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr5 = values;
                float f = 0.0f;
                int i3 = 1;
                int i4 = 0;
                if (iArr5 != null) {
                    int i5 = $11 + 43;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        length2 = iArr5.length;
                        iArr4 = new int[length2];
                    } else {
                        length2 = iArr5.length;
                        iArr4 = new int[length2];
                    }
                    int i6 = 0;
                    while (i6 < length2) {
                        try {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            objArr2[i4] = java.lang.Integer.valueOf(iArr5[i6]);
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                            if (obj == null) {
                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 26, android.view.View.combineMeasuredStates(i4, i4) + 29, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                            }
                            iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                            i6++;
                            f = 0.0f;
                            i4 = 0;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr5 = iArr4;
                }
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int[] iArr7 = values;
                if (iArr7 != null) {
                    int i7 = $10 + 65;
                    int i8 = i7 % 128;
                    $11 = i8;
                    if (i7 % 2 == 0) {
                        length = iArr7.length;
                        iArr2 = new int[length];
                        i2 = 1;
                    } else {
                        length = iArr7.length;
                        iArr2 = new int[length];
                        i2 = 0;
                    }
                    $11 = i8;
                    while (i2 < length) {
                        $11 = ($10 + i3) % 128;
                        java.lang.Object[] objArr3 = new java.lang.Object[i3];
                        objArr3[0] = java.lang.Integer.valueOf(iArr7[i2]);
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj2 == null) {
                            iArr3 = iArr7;
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 28, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("z", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                        } else {
                            iArr3 = iArr7;
                        }
                        iArr2[i2] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                        i2++;
                        iArr7 = iArr3;
                        i3 = 1;
                    }
                    iArr7 = iArr2;
                }
                java.lang.System.arraycopy(iArr7, 0, iArr6, 0, length3);
                istransitsupported.valueOf = 0;
                $11 = ($10 + 47) % 128;
                while (istransitsupported.valueOf < iArr.length) {
                    cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
                    cArr[1] = (char) iArr[istransitsupported.valueOf];
                    cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
                    cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
                    istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
                    istransitsupported.values = (cArr[2] << 16) + cArr[3];
                    com.payair.hce.isTransitSupported.values(iArr6);
                    int i9 = 0;
                    for (int i10 = 16; i9 < i10; i10 = 16) {
                        $11 = ($10 + 63) % 128;
                        istransitsupported.DigitizedCardProfile ^= iArr6[i9];
                        java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, 5088 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                        istransitsupported.DigitizedCardProfile = istransitsupported.values;
                        istransitsupported.values = intValue;
                        i9++;
                    }
                    int i11 = istransitsupported.DigitizedCardProfile;
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = i11;
                    istransitsupported.values ^= iArr6[16];
                    istransitsupported.DigitizedCardProfile ^= iArr6[17];
                    int i12 = istransitsupported.DigitizedCardProfile;
                    int i13 = istransitsupported.values;
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
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.View.MeasureSpec.getSize(0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2923, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3037));
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        c((byte) 0, (byte) -1, (short) 0, objArr6);
                        obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                }
                objArr[0] = new java.lang.String(cArr2, 0, i);
            }

            @Override // java.util.concurrent.Callable
            public /* synthetic */ byte[] call() throws java.lang.Exception {
                int i = AlternateContactlessPaymentDataJson;
                valueOf = ((i & 13) + (i | 13)) % 128;
                byte[] bArr2 = (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 791488320, -791488320, java.lang.System.identityHashCode(this));
                int i2 = valueOf;
                int i3 = i2 & 109;
                int i4 = (i2 | 109) & (~i3);
                int i5 = i3 << 1;
                int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                AlternateContactlessPaymentDataJson = i6 % 128;
                if (i6 % 2 == 0) {
                    return bArr2;
                }
                throw new java.lang.ArithmeticException();
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                com.payair.hce.setPivotX.AnonymousClass8 anonymousClass8 = (com.payair.hce.setPivotX.AnonymousClass8) objArr[0];
                int i = valueOf;
                int i2 = ((i & 71) - (~(i | 71))) - 1;
                AlternateContactlessPaymentDataJson = i2 % 128;
                if (i2 % 2 != 0) {
                    com.payair.hce.setPivotX setpivotx = com.payair.hce.setPivotX.this;
                    setpivotx.writeReplace(setpivotx.writeReplace("CUR_W_DEK_KEY_ID"), bArr);
                    throw null;
                }
                com.payair.hce.setPivotX setpivotx2 = com.payair.hce.setPivotX.this;
                byte[] writeReplace = setpivotx2.writeReplace(setpivotx2.writeReplace("CUR_W_DEK_KEY_ID"), bArr);
                int i3 = AlternateContactlessPaymentDataJson + 79;
                valueOf = i3 % 128;
                if (i3 % 2 != 0) {
                    return writeReplace;
                }
                throw null;
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                AlternateContactlessPaymentDataJson = 0;
                valueOf = 1;
                values = new int[]{-1639010680, -863418147, 1874613052, 953170431, -891070455, -1985201223, 2017428352, -1457841725, 468412877, 79619062, 1650086986, -713879640, -1300745939, 1412388714, -475236405, 1862404024, 1269717820, 1407355835};
            }

            static void init$1() {
                $$d = new byte[]{108, -72, 46, 57};
                $$e = 78;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(12:(2:48|49)|(1:51)(4:96|97|98|(10:100|53|54|(1:56)(5:64|65|66|67|(2:69|(1:71)(6:72|73|74|75|76|(2:78|(6:80|81|(1:83)|84|85|86)))))|57|58|(1:60)|61|62|63)(1:101))|52|53|54|(0)(0)|57|58|(0)|61|62|63) */
            /* JADX WARN: Removed duplicated region for block: B:26:0x039d  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x03a6 A[Catch: all -> 0x09e8, TRY_ENTER, TryCatch #4 {all -> 0x09e8, blocks: (B:29:0x03a6, B:31:0x03b5, B:32:0x03ff, B:36:0x04c3, B:38:0x04f9, B:39:0x0543, B:81:0x0869, B:83:0x08a9, B:84:0x08f4, B:58:0x0932, B:60:0x0978, B:61:0x09ca, B:108:0x0571, B:110:0x05af, B:111:0x05fe, B:139:0x02fb, B:141:0x0332, B:142:0x037f, B:4:0x002b, B:6:0x0032, B:10:0x00a0, B:14:0x0122, B:22:0x01e2, B:115:0x01ec, B:117:0x01f2, B:118:0x01f3, B:121:0x020c, B:129:0x02ba, B:133:0x02d1, B:135:0x02d7, B:136:0x02d8, B:137:0x005e, B:124:0x0230, B:126:0x0263, B:127:0x02ac, B:17:0x0146, B:19:0x0187, B:20:0x01d4), top: B:2:0x0029, inners: #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x074f  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0978 A[Catch: all -> 0x09e8, TryCatch #4 {all -> 0x09e8, blocks: (B:29:0x03a6, B:31:0x03b5, B:32:0x03ff, B:36:0x04c3, B:38:0x04f9, B:39:0x0543, B:81:0x0869, B:83:0x08a9, B:84:0x08f4, B:58:0x0932, B:60:0x0978, B:61:0x09ca, B:108:0x0571, B:110:0x05af, B:111:0x05fe, B:139:0x02fb, B:141:0x0332, B:142:0x037f, B:4:0x002b, B:6:0x0032, B:10:0x00a0, B:14:0x0122, B:22:0x01e2, B:115:0x01ec, B:117:0x01f2, B:118:0x01f3, B:121:0x020c, B:129:0x02ba, B:133:0x02d1, B:135:0x02d7, B:136:0x02d8, B:137:0x005e, B:124:0x0230, B:126:0x0263, B:127:0x02ac, B:17:0x0146, B:19:0x0187, B:20:0x01d4), top: B:2:0x0029, inners: #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0751 A[Catch: Exception -> 0x091a, TRY_LEAVE, TryCatch #2 {Exception -> 0x091a, blocks: (B:54:0x06e7, B:64:0x0751, B:67:0x0783, B:69:0x078b, B:72:0x07be, B:75:0x082c, B:89:0x090b, B:90:0x0911, B:93:0x0913, B:94:0x0919, B:66:0x075b, B:74:0x07c8), top: B:53:0x06e7, inners: #1, #5 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] valueOf(int i, int i2) {
                char c;
                java.lang.Object[] objArr;
                java.lang.Object[] objArr2;
                char c2;
                java.lang.String str;
                java.lang.Object obj;
                java.io.File file;
                java.io.File file2;
                java.lang.String[] strArr;
                int i3;
                int i4;
                int i5 = valueOf;
                int i6 = ((i5 | 33) << 1) - (i5 ^ 33);
                AlternateContactlessPaymentDataJson = i6 % 128;
                int i7 = 2;
                float f = 0.0f;
                try {
                    try {
                        if (i6 % 2 != 0) {
                            strArr = new java.lang.String[3];
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a(new int[]{-1756180802, -1633750258, 1876477967, -1779910534, -696766127, -1378696262, 429895400, -372307255, -95955271, 1506276816}, 41 - (~(-android.text.TextUtils.getCapsMode("", 0, 0))), objArr3);
                            strArr[1] = (java.lang.String) objArr3[0];
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            a(new int[]{2144232934, -1350297522, -2128884029, -660619280, 622548818, -1604801949, 1876477967, -1779910534, -573207744, -1434485970}, 28 << android.text.TextUtils.getTrimmedLength(""), objArr4);
                            strArr[1] = (java.lang.String) objArr4[0];
                        } else {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            a(new int[]{-1756180802, -1633750258, 1876477967, -1779910534, -696766127, -1378696262, 429895400, -372307255, -95955271, 1506276816}, android.text.TextUtils.getCapsMode("", 0, 0) + 19, objArr5);
                            int i8 = -(-android.text.TextUtils.getTrimmedLength(""));
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            a(new int[]{2144232934, -1350297522, -2128884029, -660619280, 622548818, -1604801949, 1876477967, -1779910534, -573207744, -1434485970}, ((i8 | 18) << 1) - (i8 ^ 18), objArr6);
                            strArr = new java.lang.String[]{(java.lang.String) objArr5[0], (java.lang.String) objArr6[0]};
                        }
                        i3 = 0;
                    } catch (java.lang.Exception unused) {
                        int i9 = ~i;
                        java.lang.Object[] objArr7 = {new int[]{i}, new int[]{(i & (-3)) | (i9 & 2)}, null, new int[1]};
                        int i10 = ~(565088924 | i9);
                        java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((439840060 | i10) * 764) + 1175423816 + (((~(i9 | 439840060)) | 562598528) * (-1528)) + ((999948192 | i10) * 764))};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj2 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                            byte b = $$a[14];
                            byte b2 = (byte) (b + 1);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b(b2, b2, (byte) (-b), objArr9);
                            obj2 = cls.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                        }
                        c = 0;
                        ((int[]) objArr7[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr8)).intValue();
                        objArr = objArr7;
                    }
                    try {
                        while (i3 < i7) {
                            int i11 = valueOf;
                            AlternateContactlessPaymentDataJson = ((i11 & 77) + (i11 | 77)) % 128;
                            java.lang.String str2 = strArr[i3];
                            int i12 = (android.media.AudioTrack.getMaxVolume() > f ? 1 : (android.media.AudioTrack.getMaxVolume() == f ? 0 : -1));
                            int i13 = i12 * 51;
                            int i14 = (i13 ^ (-735)) + ((i13 & (-735)) << 1) + (((i12 ^ i) | (i12 & i)) * (-50));
                            int i15 = ~i12;
                            int i16 = ~((i15 ^ (-16)) | (i15 & (-16)) | i);
                            int i17 = ~i;
                            int i18 = (i17 ^ (-16)) | (i17 & (-16));
                            int i19 = ~((i18 ^ i12) | (i18 & i12));
                            int i20 = -(-(((i16 ^ i19) | (i19 & i16)) * 50));
                            int i21 = ~i18;
                            int i22 = ~((i12 & (-16)) | (i12 ^ (-16)));
                            int i23 = (i21 & i22) | (i21 ^ i22);
                            int i24 = ~((i17 ^ i12) | (i12 & i17));
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            a(new int[]{873498906, 1705466121, 1511539118, 985921691, 924518890, 163683122, 1814381781, 1555955985}, (i14 ^ i20) + ((i20 & i14) << 1) + (((i23 & i24) | (i23 ^ i24)) * 50), objArr10);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                            if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                                objArr = new java.lang.Object[]{new int[]{i}, new int[]{(i & (-2)) | (i17 & 1)}, null, new int[1]};
                                try {
                                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-432638227) | i17)) | 572290758) * (-235)) - 2010586398) + (((~((-432638227) | i)) | 572290758) * (-470)) + (((~((-432113937) | i)) | 571766468) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))};
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj3 == null) {
                                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myTid() >> 22), android.graphics.Color.alpha(0) + 2713, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                        byte b3 = $$a[14];
                                        byte b4 = (byte) (b3 + 1);
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        b(b4, b4, (byte) (-b3), objArr12);
                                        obj3 = cls3.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                                    }
                                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr11)).intValue();
                                    c = 0;
                                    if (i == ((int[]) objArr[1])[c]) {
                                        valueOf = (AlternateContactlessPaymentDataJson + 93) % 128;
                                        return objArr;
                                    }
                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                                    if (obj4 == null) {
                                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 28, (android.os.Process.myTid() >> 22) + 2391, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29420));
                                        byte b5 = (byte) (-$$a[14]);
                                        byte b6 = b5;
                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                        b(b5, b6, (byte) (b6 - 1), objArr13);
                                        obj4 = cls4.getMethod((java.lang.String) objArr13[0], null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                                    }
                                    long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                                    long j = ~i;
                                    long j2 = 197346624 | j;
                                    long j3 = ~longValue;
                                    long j4 = j | j3;
                                    long j5 = ((-183) * longValue) + 36114432375L + (((~(j2 | longValue)) | (~(j4 | (-197346625)))) * (-184)) + (((~(j3 | 197346624)) | (~j2) | (~j4)) * 184) + (((-197346625) | longValue) * 184) + 479430721;
                                    int i25 = ((int) (j5 >> 32)) & (((((~((-1505788493) | i)) | (~((-68562082) | i))) * 69) - 1263362844) + (((~((-1539363407) | i)) | 33574914 | (~((-102136996) | i))) * (-69)) + 722291024);
                                    int i26 = ~i;
                                    int i27 = ((int) j5) & ((((~(1856107439 | i26)) | (~(418881029 | i))) * com.visa.cbp.getCertUsage.getODAData) + 219690003 + (((~(1856107439 | i)) | (~(418881029 | i26))) * com.visa.cbp.getCertUsage.getODAData));
                                    if (((i25 ^ i27) | (i25 & i27)) == 1) {
                                        valueOf = (AlternateContactlessPaymentDataJson + 69) % 128;
                                        objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                                        java.lang.Object[] objArr14 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((((~((-428504306) | i)) | (-576424680)) * (-948)) - 1784632096) + ((~((-655586) | i26)) * (-948))) - 1873661684)};
                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj5 == null) {
                                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 50, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2713, (char) android.view.KeyEvent.keyCodeFromString(""));
                                            byte b7 = $$a[14];
                                            byte b8 = (byte) (b7 + 1);
                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                            b(b8, b8, (byte) (-b7), objArr15);
                                            obj5 = cls5.getMethod((java.lang.String) objArr15[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                        }
                                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr14)).intValue();
                                        c2 = 0;
                                        ((int[]) objArr2[3])[0] = intValue;
                                    } else {
                                        objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                        java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-876495066) | i)) | 69599449) * 345) - 2098186816) + (((~((-876495066) | i26)) | 58834470) * 345) + ((~((-69599450) | i)) * 345))};
                                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj6 == null) {
                                            java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2713 - android.view.View.getDefaultSize(0, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                            byte b9 = $$a[14];
                                            byte b10 = (byte) (b9 + 1);
                                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                                            b(b10, b10, (byte) (-b9), objArr17);
                                            obj6 = cls6.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                        }
                                        int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr16)).intValue();
                                        c2 = 0;
                                        ((int[]) objArr2[3])[0] = intValue2;
                                    }
                                    if (i != ((int[]) objArr2[1])[c2]) {
                                        int i28 = valueOf + 93;
                                        AlternateContactlessPaymentDataJson = i28 % 128;
                                        if (i28 % 2 == 0) {
                                            return objArr2;
                                        }
                                        throw new java.lang.ArithmeticException();
                                    }
                                    try {
                                        int i29 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                                        a(new int[]{1602569574, -1709003315, -1368526471, -484696257, 1411653518, 1547391743, -968624944, -583304392, -308155051, -1707640048, 1106937308, 2126908411, -1741072064, -1156628382, 1126217919, 1665708001, 1814755395, -1081325881, 2071426803, 1770299311}, (i29 ^ 39) + ((i29 & 39) << 1), objArr18);
                                        file2 = new java.io.File((java.lang.String) objArr18[0]);
                                    } catch (java.lang.Exception unused2) {
                                    }
                                    if (file2.canRead()) {
                                        java.io.FileReader fileReader = new java.io.FileReader(file2);
                                        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                        try {
                                            str = bufferedReader.readLine();
                                            int green = android.graphics.Color.green(0);
                                            int i30 = (green * 624) - 1866;
                                            int i31 = (~((green ^ (-4)) | (green & (-4)) | i)) * 623;
                                            int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                                            int i33 = ~((~green) | 3);
                                            int i34 = ((i33 ^ i26) | (i33 & i26)) * (-623);
                                            int i35 = ~(green | (-4));
                                            int i36 = ~(i | (-4));
                                            int i37 = (i35 & i36) | (i35 ^ i36);
                                            int i38 = ~((green ^ i) | (green & i));
                                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                                            a(new int[]{-898990520, -1973139576}, (i32 & i34) + (i34 | i32) + (((i38 & i37) | (i38 ^ i37)) * 623), objArr19);
                                            if (!str.equals((java.lang.String) objArr19[0])) {
                                                fileReader.close();
                                                bufferedReader.close();
                                                int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
                                                int i39 = jumpTapTimeout * (-391);
                                                int i40 = (i39 ^ (-6045)) + ((i39 & (-6045)) << 1);
                                                int i41 = ~((jumpTapTimeout ^ (-32)) | (jumpTapTimeout & (-32)));
                                                int i42 = ~(i | 31);
                                                int i43 = ((i41 ^ i42) | (i41 & i42)) * (-196);
                                                int i44 = (i40 ^ i43) + ((i43 & i40) << 1);
                                                int i45 = -(-(((jumpTapTimeout ^ 31) | (jumpTapTimeout & 31)) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY));
                                                int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                                                int i47 = ~jumpTapTimeout;
                                                int i48 = ~((i47 ^ (-32)) | (i47 & (-32)));
                                                int i49 = ~((i ^ 31) | (i & 31));
                                                int i50 = -(-(((i48 ^ i49) | (i48 & i49)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE));
                                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                a(new int[]{1399546426, -1904338631, -112551999, 867273138, 1643639376, 757997933, 696418017, -2059661261, -1244158362, -193243651, -607986829, -1571079789, 1471607655, 1021695459, 1329741216, -548685381}, (i46 & i50) + (i50 | i46), objArr20);
                                                file = new java.io.File((java.lang.String) objArr20[0]);
                                                if (!file.canRead()) {
                                                    try {
                                                        java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                                        a(new int[]{1312081164, 1254111018}, 0 - (~(-(android.view.ViewConfiguration.getTapTimeout() >> 16))), objArr21);
                                                        if (readLine.equals((java.lang.String) objArr21[0])) {
                                                            int i51 = -(-android.graphics.Color.alpha(0));
                                                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                            a(new int[]{1602569574, -1709003315, -1368526471, -484696257, 1411653518, 1547391743, -968624944, -583304392, -308155051, -1707640048, 1106937308, 2126908411, -308155051, -1707640048, 1106937308, 2126908411, -863837463, 55278789}, (i51 & 36) + (i51 | 36), objArr22);
                                                            java.io.File file3 = new java.io.File((java.lang.String) objArr22[0]);
                                                            if (file3.canRead()) {
                                                                try {
                                                                    java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                                    int i52 = -(android.os.Process.myPid() >> 22);
                                                                    int i53 = (i52 * (-159)) - 159;
                                                                    int i54 = ~i52;
                                                                    int i55 = -(-(((i54 ^ 1) | (i54 & 1)) * 160));
                                                                    int i56 = ~((i26 ^ i52) | (i26 & i52));
                                                                    int i57 = ~((i52 ^ 1) | (i52 & 1));
                                                                    int i58 = (i53 ^ i55) + ((i53 & i55) << 1) + (((i56 & i57) | (i57 ^ i56)) * (-160));
                                                                    int i59 = ~((i26 & (-2)) | (i26 ^ (-2)));
                                                                    int i60 = -(-(((i52 ^ i59) | (i52 & i59)) * 160));
                                                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                    a(new int[]{1312081164, 1254111018}, ((i58 | i60) << 1) - (i60 ^ i58), objArr23);
                                                                    boolean equals = readLine2.equals((java.lang.String) objArr23[0]);
                                                                    int i61 = (AlternateContactlessPaymentDataJson + 93) % 128;
                                                                    valueOf = i61;
                                                                    if (equals) {
                                                                        AlternateContactlessPaymentDataJson = (i61 + 19) % 128;
                                                                        if (str != null) {
                                                                            AlternateContactlessPaymentDataJson = ((i61 & 17) + (i61 | 17)) % 128;
                                                                            java.lang.Object[] objArr24 = {new int[]{i}, new int[]{(i26 & 20) | (i & (-21))}, str, new int[1]};
                                                                            java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-393434) | i)) | (~(1004535551 | i))) * 69) + 441006298 + (((~(i | 1004518111)) | (~((-410874) | i)) | 17440) * (-69)) + 565126046)};
                                                                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj7 == null) {
                                                                                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2, 2761 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.KeyEvent.normalizeMetaState(0));
                                                                                byte b11 = $$a[14];
                                                                                byte b12 = (byte) (b11 + 1);
                                                                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                                                b(b12, b12, (byte) (-b11), objArr26);
                                                                                obj7 = cls7.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                            }
                                                                            ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr25)).intValue();
                                                                            return objArr24;
                                                                        }
                                                                    }
                                                                } finally {
                                                                }
                                                            } else {
                                                                AlternateContactlessPaymentDataJson = (valueOf + 37) % 128;
                                                            }
                                                        }
                                                    } finally {
                                                    }
                                                }
                                                java.lang.Object[] objArr27 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                                java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-651896697) | i)) | (-353032289)) * (-318)) + 1554530216 + (((~((-353032289) | i)) | (~(937164664 | i26))) * 318) + (((~(i | 937164664)) | (~(i26 | (-285267969)))) * 318))};
                                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj == null) {
                                                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 51, 2713 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                    byte b13 = $$a[14];
                                                    byte b14 = (byte) (b13 + 1);
                                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                    b(b14, b14, (byte) (-b13), objArr29);
                                                    obj = cls8.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                                }
                                                ((int[]) objArr27[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr28)).intValue();
                                                AlternateContactlessPaymentDataJson = (valueOf + 85) % 128;
                                                return objArr27;
                                            }
                                            fileReader.close();
                                            bufferedReader.close();
                                        } finally {
                                        }
                                    } else {
                                        int i62 = valueOf;
                                        AlternateContactlessPaymentDataJson = (((i62 | 37) << 1) - (i62 ^ 37)) % 128;
                                    }
                                    str = null;
                                    int jumpTapTimeout2 = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
                                    int i392 = jumpTapTimeout2 * (-391);
                                    int i402 = (i392 ^ (-6045)) + ((i392 & (-6045)) << 1);
                                    int i412 = ~((jumpTapTimeout2 ^ (-32)) | (jumpTapTimeout2 & (-32)));
                                    int i422 = ~(i | 31);
                                    int i432 = ((i412 ^ i422) | (i412 & i422)) * (-196);
                                    int i442 = (i402 ^ i432) + ((i432 & i402) << 1);
                                    int i452 = -(-(((jumpTapTimeout2 ^ 31) | (jumpTapTimeout2 & 31)) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY));
                                    int i462 = (i442 ^ i452) + ((i452 & i442) << 1);
                                    int i472 = ~jumpTapTimeout2;
                                    int i482 = ~((i472 ^ (-32)) | (i472 & (-32)));
                                    int i492 = ~((i ^ 31) | (i & 31));
                                    int i502 = -(-(((i482 ^ i492) | (i482 & i492)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE));
                                    java.lang.Object[] objArr202 = new java.lang.Object[1];
                                    a(new int[]{1399546426, -1904338631, -112551999, 867273138, 1643639376, 757997933, 696418017, -2059661261, -1244158362, -193243651, -607986829, -1571079789, 1471607655, 1021695459, 1329741216, -548685381}, (i462 & i502) + (i502 | i462), objArr202);
                                    file = new java.io.File((java.lang.String) objArr202[0]);
                                    if (!file.canRead()) {
                                    }
                                    java.lang.Object[] objArr272 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                    java.lang.Object[] objArr282 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-651896697) | i)) | (-353032289)) * (-318)) + 1554530216 + (((~((-353032289) | i)) | (~(937164664 | i26))) * 318) + (((~(i | 937164664)) | (~(i26 | (-285267969)))) * 318))};
                                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj == null) {
                                    }
                                    ((int[]) objArr272[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr282)).intValue();
                                    AlternateContactlessPaymentDataJson = (valueOf + 85) % 128;
                                    return objArr272;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                            i3 = (i3 & 1) + (i3 | 1);
                            int i63 = AlternateContactlessPaymentDataJson;
                            valueOf = ((i63 ^ 93) + ((i63 & 93) << 1)) % 128;
                            i7 = 2;
                            f = 0.0f;
                        }
                        java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-949280751) | i)) | 1056746 | i4) * (-470)) + 1501599604 + ((i4 | (~((-948224005) | i))) * 470))};
                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj8 == null) {
                            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 50, 2713 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                            byte b15 = $$a[14];
                            byte b16 = (byte) (b15 + 1);
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            b(b16, b16, (byte) (-b15), objArr31);
                            obj8 = cls9.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                        }
                        ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr30)).intValue();
                        int i64 = valueOf;
                        AlternateContactlessPaymentDataJson = (((i64 | 55) << 1) - (i64 ^ 55)) % 128;
                        c = 0;
                        if (i == ((int[]) objArr[1])[c]) {
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    i4 = ~((~i) | 1003872238);
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            }

            static void init$0() {
                $$a = new byte[]{16, 120, -82, 58, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
                $$b = 132;
            }

            private byte[] writeReplace() throws java.lang.Exception {
                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 791488320, -791488320, java.lang.System.identityHashCode(this));
            }
        });
        int i = getAdditionalCheckTable & 89;
        getCardholderValidators = (((((r0 ^ 89) | i) << 1) - (~(-((r0 | 89) & (~i))))) - 1) % 128;
        return submit;
    }

    private static /* synthetic */ java.lang.Object getIssuerApplicationData(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        final byte[] bArr = (byte[]) objArr[1];
        java.util.concurrent.Future submit = setpivotx.values.submit(new java.util.concurrent.Callable<byte[]>() { // from class: com.payair.hce.setPivotX.9
            private static int values = 1;
            private static int writeReplace;

            public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2, int i, int i2, int i3) {
                int i4 = ~i;
                int i5 = ~i2;
                return ((((i * (-947)) + (i2 * 949)) + (((~(i5 | i3)) | i4) * (-948))) + ((~((~i3) | (i4 | i5))) * (-948))) + ((i | i5) * 948) != 1 ? DigitizedCardProfile(objArr2) : valueOf(objArr2);
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                com.payair.hce.setPivotX.AnonymousClass9 anonymousClass9 = (com.payair.hce.setPivotX.AnonymousClass9) objArr2[0];
                int i = writeReplace;
                int i2 = ((i ^ 65) | (i & 65)) << 1;
                int i3 = -((i & (-66)) | ((~i) & 65));
                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                values = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                byte[] bArr2 = (byte[]) values(new java.lang.Object[]{anonymousClass9}, -1020733150, 1020733150, java.lang.System.identityHashCode(anonymousClass9));
                int i5 = values;
                writeReplace = ((i5 ^ 109) + ((i5 & 109) << 1)) % 128;
                return bArr2;
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                com.payair.hce.setPivotX.AnonymousClass9 anonymousClass9 = (com.payair.hce.setPivotX.AnonymousClass9) objArr2[0];
                int i = values;
                int i2 = i & 81;
                int i3 = (((i ^ 81) | i2) << 1) - ((i | 81) & (~i2));
                writeReplace = i3 % 128;
                int i4 = i3 % 2;
                com.payair.hce.setPivotX setpivotx2 = com.payair.hce.setPivotX.this;
                java.lang.String writeReplace2 = setpivotx2.writeReplace("CUR_DST_DEK_KEY_ID");
                byte[] bArr2 = bArr;
                if (i4 != 0) {
                    setpivotx2.writeReplace(writeReplace2, bArr2);
                    throw null;
                }
                byte[] writeReplace3 = setpivotx2.writeReplace(writeReplace2, bArr2);
                int i5 = values;
                int i6 = i5 & 69;
                int i7 = (i5 ^ 69) | i6;
                writeReplace = ((i6 & i7) + (i7 | i6)) % 128;
                return writeReplace3;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ byte[] call() throws java.lang.Exception {
                ?? values2 = values(new java.lang.Object[]{this}, 542910024, -542910023, java.lang.System.identityHashCode(this));
                return values2;
            }

            private byte[] values() throws java.lang.Exception {
                return (byte[]) values(new java.lang.Object[]{this}, -1020733150, 1020733150, java.lang.System.identityHashCode(this));
            }
        });
        int i = getCardholderValidators;
        int i2 = ((i | 85) << 1) - (i ^ 85);
        getAdditionalCheckTable = i2 % 128;
        if (i2 % 2 != 0) {
            return submit;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCdol1RelatedDataLength(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        final byte[] bArr = (byte[]) objArr[1];
        java.util.concurrent.Future submit = setpivotx.values.submit(new java.util.concurrent.Callable<byte[]>() { // from class: com.payair.hce.setPivotX.13
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static int DigitizedCardProfile;
            private static final int getAid = 0;
            private static final byte[] getProfileVersion = null;
            private static int[] values;
            private static int writeReplace;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v11 */
            /* JADX WARN: Type inference failed for: r6v12 */
            /* JADX WARN: Type inference failed for: r6v3 */
            /* JADX WARN: Type inference failed for: r6v4 */
            /* JADX WARN: Type inference failed for: r6v8, types: [int] */
            private static void c(short s, byte b, byte b2, java.lang.Object[] objArr2) {
                int i = (s * 33) + 4;
                int i2 = 118 - (b * 19);
                int i3 = b2 * 27;
                byte[] bArr2 = $$a;
                byte[] bArr3 = new byte[34 - i3];
                int i4 = -1;
                ?? r6 = i2;
                if (bArr2 == null) {
                    i++;
                    r6 = i + i2;
                }
                while (true) {
                    byte b3 = r6;
                    int i5 = i;
                    i4++;
                    bArr3[i4] = b3;
                    if (i4 == 33 - i3) {
                        objArr2[0] = new java.lang.String(bArr3, 0);
                        return;
                    } else {
                        i = i5 + 1;
                        r6 = b3 + bArr2[i5];
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void d(short s, byte b, short s2, java.lang.Object[] objArr2) {
                int i;
                int i2;
                int i3 = 66 - (b * 3);
                int i4 = s2 + 4;
                int i5 = 1 - (s * 4);
                byte[] bArr2 = $$d;
                byte[] bArr3 = new byte[i5];
                if (bArr2 == null) {
                    int i6 = i4;
                    i2 = 0;
                    i3 += i4;
                    i4 = i6;
                    i = i2;
                    i2 = i + 1;
                    bArr3[i] = (byte) i3;
                    int i7 = i4 + 1;
                    if (i2 == i5) {
                        objArr2[0] = new java.lang.String(bArr3, 0);
                        return;
                    }
                    i6 = i7;
                    i4 = bArr2[i7];
                    i3 += i4;
                    i4 = i6;
                    i = i2;
                    i2 = i + 1;
                    bArr3[i] = (byte) i3;
                    int i72 = i4 + 1;
                    if (i2 == i5) {
                    }
                } else {
                    i = 0;
                    i2 = i + 1;
                    bArr3[i] = (byte) i3;
                    int i722 = i4 + 1;
                    if (i2 == i5) {
                    }
                }
            }

            private static void b(int[] iArr, int i, java.lang.Object[] objArr2) {
                int[] iArr2;
                int i2;
                com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = values;
                char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                int i3 = 1;
                int i4 = 0;
                if (iArr3 != null) {
                    int length = iArr3.length;
                    int[] iArr4 = new int[length];
                    int i5 = 0;
                    while (i5 < length) {
                        try {
                            java.lang.Object[] objArr3 = new java.lang.Object[i3];
                            objArr3[0] = java.lang.Integer.valueOf(iArr3[i5]);
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                            if (obj == null) {
                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.normalizeMetaState(0), 28 - android.view.MotionEvent.axisFromString(""), (char) ((-1) - android.text.TextUtils.lastIndexOf("", c, 0)))).getMethod("z", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                            }
                            iArr4[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                            i5++;
                            c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                            i3 = 1;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr3 = iArr4;
                }
                int length2 = iArr3.length;
                int[] iArr5 = new int[length2];
                int[] iArr6 = values;
                if (iArr6 != null) {
                    int length3 = iArr6.length;
                    int[] iArr7 = new int[length3];
                    int i6 = 0;
                    while (i6 < length3) {
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(iArr6[i6])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj2 == null) {
                            iArr2 = iArr6;
                            i2 = length3;
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.Color.blue(0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 29, (char) android.view.View.MeasureSpec.getMode(0))).getMethod("z", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                        } else {
                            iArr2 = iArr6;
                            i2 = length3;
                        }
                        iArr7[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                        i6++;
                        iArr6 = iArr2;
                        length3 = i2;
                        i4 = 0;
                    }
                    iArr6 = iArr7;
                }
                int i7 = i4;
                java.lang.System.arraycopy(iArr6, i7, iArr5, i7, length2);
                istransitsupported.valueOf = i7;
                while (istransitsupported.valueOf < iArr.length) {
                    cArr[i7] = (char) (iArr[istransitsupported.valueOf] >> 16);
                    cArr[1] = (char) iArr[istransitsupported.valueOf];
                    cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
                    cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
                    istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
                    istransitsupported.values = (cArr[2] << 16) + cArr[3];
                    com.payair.hce.isTransitSupported.values(iArr5);
                    $10 = ($11 + 69) % 128;
                    for (int i8 = 0; i8 < 16; i8++) {
                        istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                        java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 31, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 5089, (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).intValue();
                        istransitsupported.DigitizedCardProfile = istransitsupported.values;
                        istransitsupported.values = intValue;
                    }
                    int i9 = istransitsupported.DigitizedCardProfile;
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = i9;
                    istransitsupported.values ^= iArr5[16];
                    istransitsupported.DigitizedCardProfile ^= iArr5[17];
                    int i10 = istransitsupported.DigitizedCardProfile;
                    int i11 = istransitsupported.values;
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
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
                    if (obj4 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2922, (char) (3037 - android.view.KeyEvent.keyCodeFromString("")));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        d((short) 0, (byte) 0, (short) -1, objArr7);
                        obj4 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                    $10 = ($11 + 75) % 128;
                    i7 = 0;
                }
                objArr2[0] = new java.lang.String(cArr2, 0, i);
            }

            @Override // java.util.concurrent.Callable
            public /* synthetic */ byte[] call() throws java.lang.Exception {
                int i = DigitizedCardProfile + 1;
                writeReplace = i % 128;
                if (i % 2 == 0) {
                    AlternateContactlessPaymentDataJson();
                    throw null;
                }
                byte[] AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson();
                int i2 = writeReplace + 75;
                DigitizedCardProfile = i2 % 128;
                if (i2 % 2 == 0) {
                    return AlternateContactlessPaymentDataJson;
                }
                throw null;
            }

            private byte[] AlternateContactlessPaymentDataJson() throws java.lang.Exception {
                int i = DigitizedCardProfile + 69;
                writeReplace = i % 128;
                if (i % 2 == 0) {
                    com.payair.hce.setPivotX setpivotx2 = com.payair.hce.setPivotX.this;
                    setpivotx2.writeReplace(setpivotx2.writeReplace("CUR_RM_KEK_KEY_ID"), bArr);
                    throw new java.lang.ArithmeticException();
                }
                com.payair.hce.setPivotX setpivotx3 = com.payair.hce.setPivotX.this;
                byte[] writeReplace2 = setpivotx3.writeReplace(setpivotx3.writeReplace("CUR_RM_KEK_KEY_ID"), bArr);
                int i2 = DigitizedCardProfile + 69;
                writeReplace = i2 % 128;
                if (i2 % 2 != 0) {
                    return writeReplace2;
                }
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:33:0x047f A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0490  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x04a3 A[ADDED_TO_REGION, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r12v26 */
            /* JADX WARN: Type inference failed for: r12v30 */
            /* JADX WARN: Type inference failed for: r12v32 */
            /* JADX WARN: Type inference failed for: r12v33 */
            /* JADX WARN: Type inference failed for: r12v5 */
            /* JADX WARN: Type inference failed for: r12v50 */
            /* JADX WARN: Type inference failed for: r6v41 */
            /* JADX WARN: Type inference failed for: r6v48 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static void writeReplace(long j, long j2) {
                int i;
                int i2;
                char c;
                ?? r12;
                java.lang.Object obj;
                java.lang.Object cls;
                char c2;
                ?? r122;
                java.lang.Object obj2;
                com.payair.hce.setLayoutParams setlayoutparams = new com.payair.hce.setLayoutParams(j, j2);
                byte[] bArr2 = getProfileVersion;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, bArr2[348], bArr2[40], objArr2);
                java.lang.String str = (java.lang.String) objArr2[0];
                char c3 = 'x';
                short s = bArr2[120];
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                int i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                a(s, (byte) (s | 74), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, objArr3);
                try {
                    java.lang.Object[] objArr4 = {(java.lang.String) objArr3[0]};
                    char c4 = 373;
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(bArr2[373], bArr2[425], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, objArr5);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a(bArr2[8], bArr2[5], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, objArr6);
                    java.lang.String str2 = (java.lang.String) objArr6[0];
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(bArr2[373], bArr2[425], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, objArr7);
                    java.lang.Object[] objArr8 = (java.lang.Object[]) cls2.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr7[0])).invoke(str, objArr4);
                    int[] iArr = new int[objArr8.length];
                    int i4 = 0;
                    while (true) {
                        i = 18;
                        if (i4 >= objArr8.length) {
                            break;
                        }
                        java.lang.Object[] objArr9 = {objArr8[i4]};
                        byte[] bArr3 = getProfileVersion;
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        a((short) (-bArr3[334]), bArr3[425], com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, objArr10);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                        short s2 = bArr3[18];
                        byte b = bArr3[c3];
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        a(s2, b, (short) (b | 314), objArr11);
                        java.lang.String str3 = (java.lang.String) objArr11[0];
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(bArr3[373], bArr3[425], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, objArr12);
                        java.lang.Object invoke = cls3.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr12[0])).invoke(null, objArr9);
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a((short) (-bArr3[334]), bArr3[425], com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, objArr13);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(bArr3[10], bArr3[315], 320, objArr14);
                        iArr[i4] = ((java.lang.Integer) cls4.getMethod((java.lang.String) objArr14[0], null).invoke(invoke, null)).intValue();
                        i4++;
                        c3 = 'x';
                    }
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        try {
                            c = '\"';
                            r12 = 28;
                            r122 = 28;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (i6 < 18) {
                            }
                            if (i6 >= 63) {
                            }
                            throw th;
                        }
                        switch (setlayoutparams.values(iArr[i5])) {
                            case -34:
                                i5 = 79;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -33:
                                setlayoutparams.values(33);
                                int i7 = setlayoutparams.DigitizedCardProfile;
                                i5 = (i7 == 0 || i7 != 1) ? 48 : 62;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -32:
                                i5 = 1;
                                c4 = 373;
                            case -31:
                                i5 = 78;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -30:
                                setlayoutparams.values(28);
                                if (setlayoutparams.DigitizedCardProfile == 0) {
                                    i5 = 77;
                                    c4 = 373;
                                    i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                    i = 18;
                                }
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -29:
                                i5 = 80;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -28:
                                i5 = 82;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -27:
                                try {
                                    setlayoutparams.values(28);
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    if (i6 < 18) {
                                    }
                                    if (i6 >= 63) {
                                    }
                                    throw th;
                                }
                                if (setlayoutparams.DigitizedCardProfile == 0) {
                                    i5 = 60;
                                    c4 = 373;
                                    i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                    i = 18;
                                }
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                                break;
                            case -26:
                                setlayoutparams.AlternateContactlessPaymentDataJson = 1;
                                setlayoutparams.values(2);
                                setlayoutparams.values(3);
                                writeReplace = setlayoutparams.DigitizedCardProfile;
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -25:
                                setlayoutparams.AlternateContactlessPaymentDataJson = DigitizedCardProfile;
                                setlayoutparams.values(23);
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -24:
                                return;
                            case -23:
                                i5 = 66;
                                c4 = 373;
                            case -22:
                                i5 = 50;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -21:
                                byte b2 = $$a[34];
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                c(b2, (byte) (b2 - 1), b2, objArr15);
                                obj = objArr15[0];
                                cls = (java.lang.String) obj;
                                setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = cls;
                                setlayoutparams.values(1);
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -20:
                                setlayoutparams.AlternateContactlessPaymentDataJson = 1;
                                setlayoutparams.values(2);
                                setlayoutparams.values(7);
                                cls = java.lang.Class.forName((java.lang.String) setlayoutparams.getAid);
                                setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = cls;
                                setlayoutparams.values(1);
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                                try {
                                    byte b3 = $$a[34];
                                    byte b4 = (byte) (b3 - 1);
                                    byte b5 = b3;
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    c(b4, b5, (byte) (b5 - 1), objArr16);
                                    obj = objArr16[0];
                                    cls = (java.lang.String) obj;
                                    setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = cls;
                                    setlayoutparams.values(1);
                                    i5 = i6;
                                    c4 = 373;
                                    i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                    i = 18;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    if (i6 < 18) {
                                    }
                                    if (i6 >= 63) {
                                    }
                                    throw th;
                                }
                                break;
                            case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                                setlayoutparams.AlternateContactlessPaymentDataJson = 3;
                                setlayoutparams.values(2);
                                setlayoutparams.values(7);
                                java.lang.Object obj3 = setlayoutparams.getAid;
                                setlayoutparams.values(7);
                                java.lang.Object obj4 = setlayoutparams.getAid;
                                setlayoutparams.values(7);
                                try {
                                    java.lang.Object[] objArr17 = {obj4, setlayoutparams.getAid};
                                    byte[] bArr4 = getProfileVersion;
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    a((short) (-bArr4[285]), bArr4[425], 436, objArr18);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    a(bArr4[13], bArr4[315], 459, objArr19);
                                    java.lang.String str4 = (java.lang.String) objArr19[0];
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    a(bArr4[c4], bArr4[425], 421, objArr20);
                                    short s3 = bArr4[378];
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    a(s3, (byte) (s3 | 9), 464, objArr21);
                                    cls = cls5.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr20[0]), java.lang.Class.forName((java.lang.String) objArr21[0])).invoke(obj3, objArr17);
                                    setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = cls;
                                    setlayoutparams.values(1);
                                    i5 = i6;
                                    c4 = 373;
                                    i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                    i = 18;
                                } catch (java.lang.Throwable th4) {
                                    java.lang.Throwable cause = th4.getCause();
                                    if (cause == null) {
                                        throw th4;
                                    }
                                    throw cause;
                                }
                            case -17:
                                c2 = '\n';
                                setlayoutparams.AlternateContactlessPaymentDataJson = 3;
                                setlayoutparams.values(2);
                                setlayoutparams.values(7);
                                java.lang.Class cls6 = (java.lang.Class) setlayoutparams.getAid;
                                setlayoutparams.values(7);
                                java.lang.String str5 = (java.lang.String) setlayoutparams.getAid;
                                setlayoutparams.values(7);
                                cls = cls6.getMethod(str5, (java.lang.Class[]) setlayoutparams.getAid);
                                setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = cls;
                                setlayoutparams.values(1);
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -16:
                                c2 = '\n';
                                byte[] bArr5 = getProfileVersion;
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                a(bArr5[c4], bArr5[425], i3, objArr22);
                                cls = java.lang.Class.forName((java.lang.String) objArr22[0]);
                                setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = cls;
                                setlayoutparams.values(1);
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -15:
                                setlayoutparams.AlternateContactlessPaymentDataJson = 1;
                                setlayoutparams.values(2);
                                setlayoutparams.values(3);
                                setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = new java.lang.Class[setlayoutparams.DigitizedCardProfile];
                                setlayoutparams.values(1);
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -14:
                                c2 = '\n';
                                cls = "values";
                                setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = cls;
                                setlayoutparams.values(1);
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -13:
                                c2 = '\n';
                                cls = com.payair.hce.setLongClickable.class;
                                setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = cls;
                                setlayoutparams.values(1);
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -12:
                                try {
                                    c2 = '\n';
                                    setlayoutparams.AlternateContactlessPaymentDataJson = 1;
                                    setlayoutparams.values(2);
                                    setlayoutparams.values(3);
                                    int i8 = setlayoutparams.DigitizedCardProfile;
                                    byte[] bArr6 = getProfileVersion;
                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                    a(bArr6[c4], bArr6[425], 421, objArr23);
                                    cls = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr23[0]), i8);
                                    setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = cls;
                                    setlayoutparams.values(1);
                                    i5 = i6;
                                    c4 = 373;
                                    i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                    i = 18;
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    if (i6 < 18) {
                                    }
                                    if (i6 >= 63) {
                                        break;
                                    }
                                    throw th;
                                }
                                break;
                            case -11:
                                c = '\n';
                                r122 = 0;
                                setlayoutparams.values(10);
                                throw ((java.lang.Throwable) setlayoutparams.getAid);
                                break;
                            case -10:
                                i5 = 16;
                            case -9:
                                i5 = 14;
                            case -8:
                                try {
                                    setlayoutparams.values(9);
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    if (i6 < 18) {
                                    }
                                    if (i6 >= 63) {
                                    }
                                    throw th;
                                }
                                if (setlayoutparams.DigitizedCardProfile == 0) {
                                    i5 = 13;
                                } else {
                                    i5 = i6;
                                    c4 = 373;
                                    i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                    i = 18;
                                }
                                break;
                            case -7:
                                try {
                                    setlayoutparams.AlternateContactlessPaymentDataJson = 1;
                                    setlayoutparams.values(2);
                                    setlayoutparams.values(7);
                                    obj2 = setlayoutparams.getAid;
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    r12 = 0;
                                    if ((i6 < 18 && i6 <= 35) || (i6 >= 35 && i6 <= 45)) {
                                        i2 = 8;
                                    } else {
                                        if (i6 >= 63 || i6 > 66) {
                                            throw th;
                                        }
                                        i2 = 61;
                                    }
                                    setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = th;
                                    setlayoutparams.values(35);
                                    i5 = i2;
                                    i = 18;
                                    c4 = 373;
                                    i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                }
                                try {
                                    byte[] bArr7 = getProfileVersion;
                                    short s4 = bArr7[378];
                                    byte b6 = bArr7[425];
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    a(s4, b6, (short) (b6 | 384), objArr24);
                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr24[0]);
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    a(bArr7[10], bArr7[c4], 414, objArr25);
                                    try {
                                        cls = cls7.getMethod((java.lang.String) objArr25[0], null).invoke(obj2, null);
                                        setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = cls;
                                        setlayoutparams.values(1);
                                        i5 = i6;
                                        c4 = 373;
                                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                        i = 18;
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
                                break;
                            case -6:
                                i5 = i;
                            case -5:
                                setlayoutparams.AlternateContactlessPaymentDataJson = 1;
                                setlayoutparams.values(2);
                                setlayoutparams.values(7);
                                java.lang.Object obj5 = setlayoutparams.getAid;
                                try {
                                    byte[] bArr8 = getProfileVersion;
                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                    a(bArr8[c4], bArr8[425], i3, objArr26);
                                    java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                    a(bArr8[13], bArr8[315], 391, objArr27);
                                    cls = cls8.getMethod((java.lang.String) objArr27[0], null).invoke(obj5, null);
                                    setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = cls;
                                    setlayoutparams.values(1);
                                    i5 = i6;
                                    c4 = 373;
                                    i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                    i = 18;
                                } catch (java.lang.Throwable th10) {
                                    java.lang.Throwable cause3 = th10.getCause();
                                    if (cause3 == null) {
                                        throw th10;
                                    }
                                    throw cause3;
                                }
                            case -4:
                                setlayoutparams.AlternateContactlessPaymentDataJson = 2;
                                setlayoutparams.values(2);
                                setlayoutparams.values(7);
                                int[] iArr2 = (int[]) setlayoutparams.getAid;
                                setlayoutparams.values(3);
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                b(iArr2, setlayoutparams.DigitizedCardProfile, objArr28);
                                cls = (java.lang.String) objArr28[0];
                                setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = cls;
                                setlayoutparams.values(1);
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -3:
                                setlayoutparams.AlternateContactlessPaymentDataJson = 1;
                                setlayoutparams.values(2);
                                setlayoutparams.values(3);
                                try {
                                    java.lang.Object[] objArr29 = {java.lang.Integer.valueOf(setlayoutparams.DigitizedCardProfile)};
                                    byte[] bArr9 = getProfileVersion;
                                    short s5 = (short) (-bArr9[377]);
                                    byte b7 = (byte) (-bArr9[366]);
                                    int i9 = getAid;
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    a(s5, b7, (short) (i9 | 258), objArr30);
                                    java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                    a((short) (-bArr9[459]), bArr9[286], (short) (i9 | com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE), objArr31);
                                    setlayoutparams.RecordsJson = ((java.lang.Double) cls9.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE).invoke(null, objArr29)).doubleValue();
                                    setlayoutparams.values(4);
                                    i5 = i6;
                                    c4 = 373;
                                    i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                    i = 18;
                                } catch (java.lang.Throwable th11) {
                                    java.lang.Throwable cause4 = th11.getCause();
                                    if (cause4 == null) {
                                        throw th11;
                                    }
                                    throw cause4;
                                }
                            case -2:
                                cls = new int[]{706216371, -1568622933};
                                setlayoutparams.SdkCoreAlternateContactlessPaymentDataImpl = cls;
                                setlayoutparams.values(1);
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
                            case -1:
                                i5 = 45;
                            default:
                                i5 = i6;
                                c4 = 373;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                                i = 18;
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

            private static void a(int i, int i2, int i3, java.lang.Object[] objArr2) {
                int i4 = i3 + 4;
                int i5 = 118 - i2;
                byte[] bArr2 = getProfileVersion;
                byte[] bArr3 = new byte[i + 1];
                int i6 = -1;
                if (bArr2 == null) {
                    i5 = (i5 + (-i)) - 2;
                }
                while (true) {
                    i6++;
                    bArr3[i6] = (byte) i5;
                    if (i6 == i) {
                        objArr2[0] = new java.lang.String(bArr3, 0);
                        return;
                    } else {
                        i4++;
                        i5 = (i5 + (-bArr2[i4])) - 2;
                    }
                }
            }

            static void DigitizedCardProfile() {
                getProfileVersion = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 78, 75, -71, -6, 3, -3, -7, 4, -11, 7, -3, -8, 5, -12, 8, -3, -9, 6, -3, -10, 7, -3, -11, 8, -14, 10, -3, -12, 9, -14, 10, -3, -13, 10, -3, -14, com.google.common.base.Ascii.VT, -3, -6, -1, 2, -7, -2, 3, -3, -6, -2, 3, -7, -3, 4, -3, -6, -2, 3, -7, -4, 5, -3, -6, -3, 4, -7, -5, 6, -7, -6, 7, -3, -6, -4, 5, -3, -6, -5, 6, -7, -4, 5, -3, -6, -6, 7, -7, -7, 8, -3, -6, -7, 8, -7, -8, 9, -3, -6, -8, 9, -7, -9, 10, -7, -10, com.google.common.base.Ascii.VT, -7, -9, 10, -3, -6, -9, 10, -7, -3, 4, -3, -6, -10, com.google.common.base.Ascii.VT, -3, -7, 0, 2, -3, -7, -1, 3, -7, -10, com.google.common.base.Ascii.VT, -3, -6, -8, 9, -7, -10, com.google.common.base.Ascii.VT, -7, -10, com.google.common.base.Ascii.VT, -3, -6, -9, 10, -7, -3, 4, -3, -7, -2, 4, -8, 0, 2, -8, -1, 3, -3, -7, -3, 5, -8, -2, 4, -3, -7, -4, 6, -3, -7, -5, 7, -8, -4, 6, -8, -5, 7, -8, -6, 8, -8, -7, 9, -3, -7, -6, 8, -8, 0, 2, -8, -9, com.google.common.base.Ascii.VT, -3, -7, -7, 9, -3, -7, -8, 10, -3, -7, -9, com.google.common.base.Ascii.VT, -3, -6, -2, 3, -8, -2, 4, -9, 1, 2, -7, -3, 4, -3, -7, -4, 6, -3, -7, -5, 7, -9, 0, 3, -8, -5, 7, -8, -6, 8, -9, -1, 4, -8, -9, com.google.common.base.Ascii.VT, -3, -7, -6, 8, -8, 0, 2, -8, -9, com.google.common.base.Ascii.VT, -3, -8, 1, 2, -3, -8, 0, 3, -3, -8, -1, 4, -3, -8, -1, 4, -3, -8, -2, 5, -9, -3, 6, -3, -8, -3, 6, -7, -4, 5, -3, -8, -3, 7, -23, 19, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.visa.cbp.getEncExpo.startTransaction, 9, -15, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -39, -35, 0, 7, -7, 5, 1, 2, 1, -13, 7, -23, 19, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.visa.cbp.getEncExpo.startTransaction, 9, -15, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -29, -39, -8, 13, -4, 0, -15, 19, -13, -11, 14, com.google.common.base.Ascii.DC4, -25, -7, -8, com.google.common.base.Ascii.FS, -13, -13, -11, 14, -15, 8, com.visa.cbp.getEncExpo.onUnminimized, 1, 4, 3, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -72, 13, -9, 5, -13, 6, -9, -1, -13, 73, -55, -3, -11, 10, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -23, -35, -11, 10, com.google.common.base.Ascii.FS, -36, -9, -2, com.google.common.base.Ascii.RS, -37, 10, 0, -21, 9, -8, -1, -14, -1, -10, com.google.common.base.Ascii.SI, -15, -4, 33, -38, 18, -19, -4, com.google.common.base.Ascii.US, -20, 0, 13, -29, 41, -35, 0, com.google.common.base.Ascii.GS, -35, -4, -13, com.google.common.base.Ascii.VT, -2, com.visa.cbp.getEncExpo.onUnminimized, -7, -8, 13, -15, 2, 7, -23, 19, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.visa.cbp.getEncExpo.startTransaction, 9, -15, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -40, -22, -12, 1, -10, com.google.common.base.Ascii.DC4, -3, -12, 5, 0, -17, 47, -32, -22, 0, com.google.common.base.Ascii.FF, 7, -23, 19, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.visa.cbp.getEncExpo.startTransaction, 9, -15, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -35, -21, -10, 3, 0, -19, 7, -23, 19, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.visa.cbp.getEncExpo.startTransaction, 9, -15, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -70, com.google.common.base.Ascii.VT, -3, -8, 5, 0, -19, 68, -33, -26, -17, 10, -9, 9, -7, -10, 5, 2, 4, 13, -32, 7, -23, 19, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.visa.cbp.getEncExpo.startTransaction, 9, -15, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -35, -21, -10, 3, 0, -19, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE};
                getAid = 69;
            }

            static void init$1() {
                $$d = new byte[]{115, 113, -43, -44};
                $$e = 32;
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                DigitizedCardProfile();
                DigitizedCardProfile = 0;
                writeReplace = 1;
                values = new int[]{-1406332225, 836127695, -49283468, 680673407, -1405597137, -1884107311, -877396684, -160755406, -115883941, -2020396658, 441750086, -193625373, 1835678949, 1727167687, 959602601, -1887380103, 229567940, -944816291};
            }

            static void init$0() {
                $$a = new byte[]{88, -59, 41, 44, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, 69, -14, com.google.common.base.Ascii.SI, com.visa.cbp.getEncExpo.kernelVersion, 44, -1, 6, -15, 19, -4, com.visa.cbp.getEncExpo.kernelVersion, 41, -3, -6, 8, -10, 1, 10, -7, -21, com.google.common.base.Ascii.VT, 9, com.visa.cbp.getEncExpo.onUnminimized, -22, com.google.common.base.Ascii.ETB};
                $$b = 93;
            }
        });
        int i = getCardholderValidators + 95;
        getAdditionalCheckTable = i % 128;
        if (i % 2 != 0) {
            return submit;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getAlternateContactlessPaymentData(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        final com.payair.hce.isSessionAvailable issessionavailable = (com.payair.hce.isSessionAvailable) objArr[1];
        java.util.concurrent.Future submit = setpivotx.values.submit(new java.util.concurrent.Callable<byte[]>() { // from class: com.payair.hce.setPivotX.4
            private static int AlternateContactlessPaymentDataJson = 0;
            private static int values = 1;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2, int i, int i2, int i3) {
                int i4 = ~i;
                int i5 = ~i3;
                int i6 = i4 | i5;
                int i7 = ~i2;
                int i8 = i5 | i7;
                return ((((i * (-183)) + (i2 * (-183))) + (((~(i6 | i2)) | (~(i8 | i))) * (-184))) + (((~i8) | ((~(i4 | i7)) | (~i6))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) + ((i | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) != 1 ? valueOf(objArr2) : DigitizedCardProfile(objArr2);
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                com.payair.hce.setPivotX.AnonymousClass4 anonymousClass4 = (com.payair.hce.setPivotX.AnonymousClass4) objArr2[0];
                int i = ~java.lang.System.identityHashCode(anonymousClass4);
                int i2 = i & 347063864;
                int i3 = ((347063864 | i) & (~i2)) | i2;
                int i4 = ~i3;
                int i5 = (i3 | i4) & i4;
                int i6 = -(-(((i5 ^ 1038512970) | (i5 & 1038512970)) * (-933)));
                int i7 = i6 & (-508655338);
                int i8 = (i6 ^ (-508655338)) | i7;
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                int i10 = i ^ 1038512970;
                int i11 = i & 1038512970;
                int i12 = ~((i11 ^ i10) | (i11 & i10));
                int i13 = -(~(-(-(((i12 ^ 623664) | (i12 & 623664)) * 933))));
                int i14 = ((i9 ^ i13) + ((i13 & i9) << 1)) - 1;
                int identityHashCode = java.lang.System.identityHashCode(anonymousClass4);
                int i15 = ~identityHashCode;
                int i16 = (i15 | identityHashCode) & i15;
                int i17 = ((~i16) & 1560423090) | ((-1560423091) & i16) | (i16 & 1560423090);
                int i18 = ~i17;
                int i19 = (i17 | i18) & i18;
                int i20 = ((~i19) & (-1575414519)) | (1575414518 & i19);
                int i21 = i19 & (-1575414519);
                int i22 = -(-(((i21 ^ i20) | (i21 & i20)) * (-108)));
                int i23 = i22 & (-8664089);
                int i24 = (i23 - (~(-(-((i22 ^ (-8664089)) | i23))))) - 1;
                int i25 = ~((166128228 ^ identityHashCode) | (identityHashCode & 166128228));
                int i26 = i25 & 151136800;
                int i27 = ((i25 | 151136800) & (~i26)) | i26;
                int i28 = ~((-166128229) | i15);
                int i29 = -(-((((~i27) & i28) | ((~i28) & i27) | (i27 & i28)) * 54));
                int i30 = i24 & i29;
                int i31 = ((i24 ^ i29) | i30) << 1;
                int i32 = -((i29 | i24) & (~i30));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                int i34 = (i15 & 151136800) | ((-151136801) & identityHashCode);
                int i35 = identityHashCode & 151136800;
                int i36 = -(-(((i35 ^ i34) | (i35 & i34)) * 54));
                int i37 = ((~i36) & i33) | ((~i33) & i36);
                int i38 = -(-((i36 & i33) << 1));
                if (((((-1106159401) & i14) | ((~i14) & 1106159400)) - (~((i14 & 1106159400) << 1))) - 1 > ((i37 | i38) << 1) - (i38 ^ i37)) {
                    throw null;
                }
                byte[] bArr = (byte[]) DigitizedCardProfile(new java.lang.Object[]{anonymousClass4}, 75734850, -75734849, java.lang.System.identityHashCode(anonymousClass4));
                int i39 = values;
                int i40 = i39 & 119;
                int i41 = (i39 ^ 119) | i40;
                AlternateContactlessPaymentDataJson = (((i40 | i41) << 1) - (i41 ^ i40)) % 128;
                return bArr;
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                com.payair.hce.setPivotX.AnonymousClass4 anonymousClass4 = (com.payair.hce.setPivotX.AnonymousClass4) objArr2[0];
                int i = AlternateContactlessPaymentDataJson;
                int i2 = (i & (-62)) | ((~i) & 61);
                int i3 = -(-((i & 61) << 1));
                int i4 = (i2 & i3) + (i3 | i2);
                values = i4 % 128;
                if (i4 % 2 != 0) {
                    com.payair.hce.setPivotX setpivotx2 = com.payair.hce.setPivotX.this;
                    java.lang.String writeReplace = setpivotx2.writeReplace("CUR_RM_KEK_KEY_ID");
                    com.payair.hce.isSessionAvailable issessionavailable2 = issessionavailable;
                    return setpivotx2.values(writeReplace, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{issessionavailable2}, -1877837077, 1877837077, java.lang.System.identityHashCode(issessionavailable2)));
                }
                com.payair.hce.setPivotX setpivotx3 = com.payair.hce.setPivotX.this;
                java.lang.String writeReplace2 = setpivotx3.writeReplace("CUR_RM_KEK_KEY_ID");
                com.payair.hce.isSessionAvailable issessionavailable3 = issessionavailable;
                setpivotx3.values(writeReplace2, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{issessionavailable3}, -1877837077, 1877837077, java.lang.System.identityHashCode(issessionavailable3)));
                throw null;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ byte[] call() throws java.lang.Exception {
                ?? DigitizedCardProfile = DigitizedCardProfile(new java.lang.Object[]{this}, 1354509218, -1354509218, java.lang.System.identityHashCode(this));
                return DigitizedCardProfile;
            }

            private byte[] writeReplace() throws java.lang.Exception {
                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 75734850, -75734849, java.lang.System.identityHashCode(this));
            }
        });
        int i = getCardholderValidators + 20;
        int i2 = (~i) + (i << 1);
        getAdditionalCheckTable = i2 % 128;
        if (i2 % 2 != 0) {
            return submit;
        }
        throw new java.lang.ArithmeticException();
    }

    final byte[] values(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int i = getAdditionalCheckTable;
        int i2 = i & 7;
        getCardholderValidators = (i2 + ((i ^ 7) | i2)) % 128;
        byte[] bArr3 = (byte[]) valueOf(new java.lang.Object[]{this, bArr, bArr2, com.payair.hce.setPivotX.values.values}, 193698964, -193698960, java.lang.System.identityHashCode(this));
        int i3 = getAdditionalCheckTable;
        int i4 = ((i3 ^ 19) | (i3 & 19)) << 1;
        int i5 = -((i3 & (-20)) | ((~i3) & 19));
        int i6 = (i4 & i5) + (i5 | i4);
        getCardholderValidators = i6 % 128;
        if (i6 % 2 == 0) {
            return bArr3;
        }
        throw new java.lang.ArithmeticException();
    }

    final byte[] DigitizedCardProfile(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int i = getCardholderValidators;
        int i2 = i & 31;
        int i3 = (i | 31) & (~i2);
        int i4 = -(-(i2 << 1));
        getAdditionalCheckTable = ((i3 & i4) + (i3 | i4)) % 128;
        byte[] bArr3 = (byte[]) valueOf(new java.lang.Object[]{this, bArr, bArr2, com.payair.hce.setPivotX.values.values}, -399686052, 399686088, java.lang.System.identityHashCode(this));
        int i5 = getAdditionalCheckTable;
        int i6 = ((i5 & (-108)) | ((~i5) & 107)) + ((i5 & 107) << 1);
        getCardholderValidators = i6 % 128;
        if (i6 % 2 == 0) {
            return bArr3;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        byte[] bArr2 = (byte[]) objArr[2];
        com.payair.hce.setPivotX.values valuesVar = (com.payair.hce.setPivotX.values) objArr[3];
        int i = getAdditionalCheckTable;
        int i2 = (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
        getCardholderValidators = i2 % 128;
        if (i2 % 2 == 0) {
            if (valuesVar == com.payair.hce.setPivotX.values.DigitizedCardProfile) {
                int i3 = getAdditionalCheckTable;
                int i4 = i3 ^ 63;
                int i5 = (i3 & 63) << 1;
                getCardholderValidators = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
                byte[] bArr3 = (byte[]) valueOf(new java.lang.Object[]{setpivotx, getCiacDecline(bArr), bArr2, com.payair.hce.setPivotX.values.DigitizedCardProfile}, -399686052, 399686088, java.lang.System.identityHashCode(setpivotx));
                int i6 = getAdditionalCheckTable + 73;
                getCardholderValidators = i6 % 128;
                if (i6 % 2 == 0) {
                    return bArr3;
                }
                throw null;
            }
            byte[] bArr4 = (byte[]) valueOf(new java.lang.Object[]{(byte[]) valueOf(new java.lang.Object[]{setpivotx, bArr, bArr2, com.payair.hce.setPivotX.values.values}, -399686052, 399686088, java.lang.System.identityHashCode(setpivotx))}, -1959683382, 1959683398, (int) java.lang.System.currentTimeMillis());
            int i7 = getCardholderValidators;
            int i8 = (i7 ^ 15) + ((i7 & 15) << 1);
            getAdditionalCheckTable = i8 % 128;
            if (i8 % 2 != 0) {
                return bArr4;
            }
            throw null;
        }
        com.payair.hce.setPivotX.values valuesVar2 = com.payair.hce.setPivotX.values.DigitizedCardProfile;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[EDGE_INSN: B:48:0x00dd->B:27:0x00dd BREAK  A[LOOP:0: B:10:0x005a->B:18:0x00c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        byte[] bArr2 = (byte[]) objArr[0];
        int i7 = getCardholderValidators;
        int i8 = i7 ^ 31;
        int i9 = ((((i7 & 31) | i8) << 1) - (~(-i8))) - 1;
        getAdditionalCheckTable = i9 % 128;
        if (i9 % 2 == 0) {
            if (bArr2 != null) {
                z = true;
                i2 = (((i7 | 72) << 1) - (i7 ^ 72)) - 1;
                getAdditionalCheckTable = i2 % 128;
                if (i2 % 2 == 0 ? bArr2.length >= 16 : bArr2.length >= 90) {
                    int length = bArr2.length;
                    int i10 = ~length;
                    int i11 = -(-(length << 1));
                    i3 = ((i10 | i11) << 1) - (i11 ^ i10);
                    getAdditionalCheckTable = ((((i7 & (-104)) | ((~i7) & 103)) - (~(-(-((i7 & 103) << 1))))) - 1) % 128;
                    int i12 = 0;
                    while (true) {
                        int length2 = bArr2.length;
                        i4 = length2 & (-16);
                        i5 = (length2 ^ (-16)) | i4;
                        if (i3 < (i4 ^ i5) + ((i5 & i4) << 1)) {
                            break;
                        }
                        int i13 = getCardholderValidators;
                        int i14 = ((i13 ^ 48) + ((i13 & 48) << 1)) - 1;
                        i6 = i14 % 128;
                        getAdditionalCheckTable = i6;
                        if (i14 % 2 == 0) {
                            int i15 = (((i12 | 181) << 1) - (i12 ^ 181)) - 117;
                            if (bArr2[i3] == 0) {
                                i12 = i15;
                                int i16 = ((i3 & 71) + (i3 | 71)) - 1;
                                int i17 = i16 & (-71);
                                i3 = i17 + ((i16 ^ (-71)) | i17);
                                getCardholderValidators = (((i6 & 96) + (i6 | 96)) - 1) % 128;
                            } else {
                                i12 = i15;
                                if (bArr2[i3] != Byte.MIN_VALUE) {
                                    int i18 = (i13 & 7) + (i13 | 7);
                                    getAdditionalCheckTable = i18 % 128;
                                    z = i18 % 2 != 0;
                                    int i19 = ((i13 ^ 113) | (i13 & 113)) << 1;
                                    int i20 = -((i13 & (-114)) | ((~i13) & 113));
                                    getAdditionalCheckTable = (((i19 | i20) << 1) - (i20 ^ i19)) % 128;
                                } else {
                                    int i162 = ((i3 & 71) + (i3 | 71)) - 1;
                                    int i172 = i162 & (-71);
                                    i3 = i172 + ((i162 ^ (-71)) | i172);
                                    getCardholderValidators = (((i6 & 96) + (i6 | 96)) - 1) % 128;
                                }
                            }
                        } else {
                            int i21 = ((i12 | (-123)) << 1) - (i12 ^ (-123));
                            i12 = (i21 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + (i21 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            if (bArr2[i3] == 0) {
                                continue;
                                int i1622 = ((i3 & 71) + (i3 | 71)) - 1;
                                int i1722 = i1622 & (-71);
                                i3 = i1722 + ((i1622 ^ (-71)) | i1722);
                                getCardholderValidators = (((i6 & 96) + (i6 | 96)) - 1) % 128;
                            }
                            if (bArr2[i3] != Byte.MIN_VALUE) {
                            }
                        }
                    }
                    if (z) {
                        int i22 = getCardholderValidators;
                        int i23 = (((i22 | 72) << 1) - (i22 ^ 72)) - 1;
                        getAdditionalCheckTable = i23 % 128;
                        if (i23 % 2 == 0) {
                            int length3 = bArr2.length >>> i12;
                            bArr = new byte[length3];
                            java.lang.System.arraycopy(bArr2, 1, bArr, 1, length3);
                        } else {
                            int length4 = bArr2.length;
                            int i24 = -i12;
                            int i25 = length4 ^ i24;
                            int i26 = (i24 & length4) << 1;
                            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                            byte[] bArr3 = new byte[i27];
                            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, i27);
                            bArr = bArr3;
                        }
                        int i28 = getCardholderValidators;
                        int i29 = (-2) - (~((i28 ^ 8) + ((i28 & 8) << 1)));
                        getAdditionalCheckTable = i29 % 128;
                        if (i29 % 2 != 0) {
                            return bArr;
                        }
                        throw null;
                    }
                    int i30 = getCardholderValidators;
                    int i31 = (i30 | 113) << 1;
                    int i32 = -((i30 & (-114)) | ((~i30) & 113));
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    getAdditionalCheckTable = i33 % 128;
                    if (i33 % 2 != 0) {
                        return bArr2;
                    }
                    throw new java.lang.ArithmeticException();
                }
            }
            int i34 = getAdditionalCheckTable;
            i = ((i34 & 57) - (~(i34 | 57))) - 1;
            getCardholderValidators = i % 128;
            if (i % 2 != 0) {
                int i35 = 5 / 2;
            }
            try {
                java.lang.Object[] objArr2 = {"Invalid input size"};
                int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                int i36 = -(~(-android.text.TextUtils.getTrimmedLength("")));
                int i37 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i38 = -(-(i37 * (-963)));
                int i39 = ((~i38) & (-964)) | (i38 & 963);
                int i40 = -(-((i38 & (-964)) << 1));
                int i41 = (-2) - (~((((i39 | i40) << 1) - (i40 ^ i39)) - 964));
                int i42 = ~i37;
                int i43 = (i37 | i42) & i42;
                int i44 = ~currentTimeMillis;
                int i45 = (currentTimeMillis | i44) & i44;
                int i46 = i43 & i45;
                int i47 = (i45 | i43) & (~i46);
                int i48 = -(-(((i47 ^ i46) | (i47 & i46)) * (-964)));
                int i49 = -(((~i41) & i48) | ((~i48) & i41));
                int i50 = ~i44;
                int i51 = ((~i43) & i50) | ((~i50) & i43);
                int i52 = i43 & i50;
                char c = (char) ((((((i48 & i41) | (i41 ^ i48)) << 1) - (~i49)) - 1) + (((i52 ^ i51) | (i52 & i51)) * (-964)));
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(offsetBefore, 36 - (~i36), c, objArr3);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr2));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (bArr2 != null) {
            z = false;
            i2 = (((i7 | 72) << 1) - (i7 ^ 72)) - 1;
            getAdditionalCheckTable = i2 % 128;
            if (i2 % 2 == 0) {
                int length5 = bArr2.length;
                int i102 = ~length5;
                int i112 = -(-(length5 << 1));
                i3 = ((i102 | i112) << 1) - (i112 ^ i102);
                getAdditionalCheckTable = ((((i7 & (-104)) | ((~i7) & 103)) - (~(-(-((i7 & 103) << 1))))) - 1) % 128;
                int i122 = 0;
                while (true) {
                    int length22 = bArr2.length;
                    i4 = length22 & (-16);
                    i5 = (length22 ^ (-16)) | i4;
                    if (i3 < (i4 ^ i5) + ((i5 & i4) << 1)) {
                    }
                    int i16222 = ((i3 & 71) + (i3 | 71)) - 1;
                    int i17222 = i16222 & (-71);
                    i3 = i17222 + ((i16222 ^ (-71)) | i17222);
                    getCardholderValidators = (((i6 & 96) + (i6 | 96)) - 1) % 128;
                }
                if (z) {
                }
            } else {
                int length52 = bArr2.length;
                int i1022 = ~length52;
                int i1122 = -(-(length52 << 1));
                i3 = ((i1022 | i1122) << 1) - (i1122 ^ i1022);
                getAdditionalCheckTable = ((((i7 & (-104)) | ((~i7) & 103)) - (~(-(-((i7 & 103) << 1))))) - 1) % 128;
                int i1222 = 0;
                while (true) {
                    int length222 = bArr2.length;
                    i4 = length222 & (-16);
                    i5 = (length222 ^ (-16)) | i4;
                    if (i3 < (i4 ^ i5) + ((i5 & i4) << 1)) {
                    }
                    int i162222 = ((i3 & 71) + (i3 | 71)) - 1;
                    int i172222 = i162222 & (-71);
                    i3 = i172222 + ((i162222 ^ (-71)) | i172222);
                    getCardholderValidators = (((i6 & 96) + (i6 | 96)) - 1) % 128;
                }
                if (z) {
                }
            }
        }
        int i342 = getAdditionalCheckTable;
        i = ((i342 & 57) - (~(i342 | 57))) - 1;
        getCardholderValidators = i % 128;
        if (i % 2 != 0) {
        }
        java.lang.Object[] objArr22 = {"Invalid input size"};
        int offsetBefore2 = android.text.TextUtils.getOffsetBefore("", 0);
        int i362 = -(~(-android.text.TextUtils.getTrimmedLength("")));
        int i372 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i382 = -(-(i372 * (-963)));
        int i392 = ((~i382) & (-964)) | (i382 & 963);
        int i402 = -(-((i382 & (-964)) << 1));
        int i412 = (-2) - (~((((i392 | i402) << 1) - (i402 ^ i392)) - 964));
        int i422 = ~i372;
        int i432 = (i372 | i422) & i422;
        int i442 = ~currentTimeMillis2;
        int i452 = (currentTimeMillis2 | i442) & i442;
        int i462 = i432 & i452;
        int i472 = (i452 | i432) & (~i462);
        int i482 = -(-(((i472 ^ i462) | (i472 & i462)) * (-964)));
        int i492 = -(((~i412) & i482) | ((~i482) & i412));
        int i502 = ~i442;
        int i512 = ((~i432) & i502) | ((~i502) & i432);
        int i522 = i432 & i502;
        char c2 = (char) ((((((i482 & i412) | (i412 ^ i482)) << 1) - (~i492)) - 1) + (((i522 ^ i512) | (i522 & i512)) * (-964)));
        java.lang.Object[] objArr32 = new java.lang.Object[1];
        a(offsetBefore2, 36 - (~i362), c2, objArr32);
        throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr32[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr22));
    }

    private byte[] writeReplace(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        getCardholderValidators = (getAdditionalCheckTable + 51) % 128;
        int length = bArr.length;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = i & length;
        int i3 = ((~length) & identityHashCode) | i2;
        int i4 = identityHashCode & length;
        int i5 = ~((i4 ^ i3) | (i3 & i4));
        int i6 = ((~i5) & (-3)) | (i5 & 2);
        int i7 = i5 & (-3);
        int i8 = (760 - (~(length * 192))) - (~(((i7 ^ i6) | (i7 & i6)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
        int i9 = (~i8) + (i8 << 1);
        int i10 = ~(length | 2);
        int i11 = (length | i) & (~i2);
        int i12 = (i11 ^ i2) | (i11 & i2);
        int i13 = ~i12;
        int i14 = (i12 | i13) & i13;
        int i15 = i10 & i14;
        int i16 = -(-((((i14 | i10) & (~i15)) | i15) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
        int i17 = (i9 ^ i16) + ((i16 & i9) << 1);
        int i18 = i17 | (-8);
        int i19 = i18 << 1;
        int i20 = -(i18 & (~(i17 & (-8))));
        int i21 = (i19 & i20) + (i20 | i19);
        if (i21 <= 0) {
            int i22 = getAdditionalCheckTable;
            int i23 = ((((i22 ^ 91) | (i22 & 91)) << 1) - (~(-((i22 & (-92)) | ((~i22) & 91))))) - 1;
            getCardholderValidators = i23 % 128;
            if (i23 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            getCardholderValidators = (((i22 ^ 104) + ((i22 & 104) << 1)) - 1) % 128;
            try {
                java.lang.Object[] objArr = {"Invalid responseData message"};
                float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                int rgb = android.graphics.Color.rgb(0, 0, 0);
                int identityHashCode2 = java.lang.System.identityHashCode(this);
                int i24 = rgb * (-317);
                int i25 = (((1056976730 | i24) << 1) - (~(-((i24 & (-1056976731)) | ((~i24) & 1056976730))))) - 1;
                int i26 = ~rgb;
                int i27 = (i26 ^ (-16777255)) | (i26 & (-16777255));
                int i28 = ~((i27 ^ identityHashCode2) | (i27 & identityHashCode2));
                int i29 = ~identityHashCode2;
                int i30 = (i29 & i26) | ((~i29) & rgb);
                int i31 = i29 & rgb;
                int i32 = (i30 ^ i31) | (i31 & i30);
                int i33 = (i32 & (-16777255)) | ((~i32) & 16777254);
                int i34 = i32 & 16777254;
                int i35 = ~((i34 ^ i33) | (i34 & i33));
                int i36 = ((~i35) & i28) | ((~i28) & i35);
                int i37 = i28 & i35;
                int i38 = -(-(((i37 ^ i36) | (i37 & i36)) * (-318)));
                int i39 = (((i25 ^ i38) | (i25 & i38)) << 1) - ((i25 & (~i38)) | ((~i25) & i38));
                int i40 = ~((rgb ^ (-16777255)) | (rgb & (-16777255)));
                int i41 = (rgb ^ identityHashCode2) | (rgb & identityHashCode2);
                int i42 = ~i41;
                int i43 = (i41 | i42) & i42;
                int i44 = (((~i40) & i43) | ((~i43) & i40) | (i40 & i43)) * (-318);
                int i45 = (rgb | i26) & i26;
                int i46 = (i29 & i45) | ((~i45) & identityHashCode2);
                int i47 = i45 & identityHashCode2;
                int i48 = ~((i47 ^ i46) | (i47 & i46));
                int i49 = i48 ^ (-16777255);
                int i50 = i48 & (-16777255);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), ((((i39 ^ i44) - (~(-(-((i44 & i39) << 1))))) - 1) - (~(-(-(((i50 ^ i49) | (i50 & i49)) * 318))))) - 1, (char) android.text.TextUtils.getOffsetBefore("", 0), objArr2);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } else {
            byte[] bArr4 = new byte[3];
            byte[] bArr5 = new byte[i21];
            byte[] bArr6 = new byte[8];
            java.lang.System.arraycopy(bArr, 0, bArr4, 0, 3);
            java.lang.System.arraycopy(bArr, 3, bArr5, 0, i21);
            java.lang.System.arraycopy(bArr, (i21 & 3) + (i21 | 3), bArr6, 0, 8);
            int i51 = (bArr4[1] & 255) << 8;
            int i52 = bArr4[2] & 255;
            int identityHashCode3 = java.lang.System.identityHashCode(this);
            int i53 = i52 * 628;
            int i54 = -(-(i51 * 628));
            int i55 = ((i53 | i54) << 1) - ((i53 & (~i54)) | ((~i53) & i54));
            int i56 = (i51 ^ identityHashCode3) | (i51 & identityHashCode3);
            int i57 = ~i52;
            int i58 = ((~i57) & i56) | ((~i56) & i57);
            int i59 = i56 & i57;
            int i60 = -(-(((i59 ^ i58) | (i59 & i58)) * (-627)));
            int i61 = (((~i60) & i55) | ((~i55) & i60)) + ((i60 & i55) << 1);
            int i62 = ~i51;
            int i63 = i62 ^ identityHashCode3;
            int i64 = i62 & identityHashCode3;
            int i65 = (i64 ^ i63) | (i64 & i63);
            int i66 = ~i65;
            int i67 = (i65 | i66) & i66;
            int i68 = i52 & i67;
            int i69 = (i67 | i52) & (~i68);
            int i70 = ((i69 ^ i68) | (i69 & i68)) * (-627);
            int i71 = i61 & i70;
            int i72 = ((i61 ^ i70) | i71) << 1;
            int i73 = -((i70 | i61) & (~i71));
            int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
            int i75 = ~identityHashCode3;
            int i76 = i75 ^ i51;
            int i77 = i51 & i75;
            int i78 = ~((i77 ^ i76) | (i77 & i76));
            int i79 = i52 ^ identityHashCode3;
            int i80 = i52 & identityHashCode3;
            int i81 = (i80 ^ i79) | (i80 & i79);
            int i82 = ~i81;
            int i83 = (i81 | i82) & i82;
            int i84 = i78 & i83;
            int i85 = (((i78 | i83) & (~i84)) | i84) * 627;
            int i86 = i74 & i85;
            int i87 = ((i74 ^ i85) | i86) << 1;
            int i88 = -((i85 | i74) & (~i86));
            int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
            byte[] bArr7 = (byte[]) valueOf(new java.lang.Object[]{bArr5, bArr2}, 1852088232, -1852088222, (int) java.lang.System.currentTimeMillis());
            if (java.util.Arrays.equals(bArr6, bArr7)) {
                byte[] bArr8 = (byte[]) valueOf(new java.lang.Object[]{this, bArr5, bArr3, java.lang.Integer.valueOf(i89)}, 2063189812, -2063189770, i89);
                valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr6}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr7}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                int i90 = getAdditionalCheckTable;
                int i91 = (-2) - (~((i90 ^ 120) + ((i90 & 120) << 1)));
                getCardholderValidators = i91 % 128;
                if (i91 % 2 == 0) {
                    return bArr8;
                }
                throw null;
            }
            int i92 = getAdditionalCheckTable;
            int i93 = i92 & 67;
            getCardholderValidators = (i93 + ((i92 ^ 67) | i93)) % 128;
            int i94 = i92 & 95;
            int i95 = -(-((i92 ^ 95) | i94));
            getCardholderValidators = ((i94 & i95) + (i95 | i94)) % 128;
            try {
                java.lang.Object[] objArr3 = {"Calculated MAC does not match the received one"};
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                int i96 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                int i97 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int identityHashCode4 = java.lang.System.identityHashCode(this);
                int i98 = i97 * 303;
                int i99 = (((i98 & 300) | ((~i98) & (-301))) - (~(-(-((i98 & (-301)) << 1))))) - 1;
                int i100 = ~i97;
                int i101 = (i100 | i97) & i100;
                int i102 = ~identityHashCode4;
                int i103 = ((~i101) & i102) | ((~i102) & i101) | (i101 & i102);
                int i104 = ~(((~i103) & 1) | (i103 & (-2)) | (i103 & 1));
                int i105 = (i97 ^ 1) | (i97 & 1);
                int i106 = (i102 & i105) | ((~i105) & identityHashCode4) | (i105 & identityHashCode4);
                int i107 = ~i106;
                int i108 = (i106 | i107) & i107;
                int i109 = -(-(((i104 ^ i108) | (i104 & i108)) * (-302)));
                int i110 = ((i99 | i109) << 1) - (i99 ^ i109);
                int i111 = (i100 & (-2)) | ((~i100) & 1);
                int i112 = i100 & 1;
                int i113 = (i112 ^ i111) | (i112 & i111);
                int i114 = i113 & identityHashCode4;
                int i115 = (i113 | identityHashCode4) & (~i114);
                int i116 = (~((i115 ^ i114) | (i115 & i114))) * (-604);
                int i117 = i110 & i116;
                int i118 = (i116 | i110) & (~i117);
                int i119 = i117 << 1;
                int i120 = i97 & (-2);
                int i121 = ~(((i97 | (-2)) & (~i120)) | i120);
                int i122 = ~((identityHashCode4 ^ 1) | (identityHashCode4 & 1));
                int i123 = i121 & i122;
                int i124 = (i121 | i122) & (~i123);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(makeMeasureSpec, 36 - (~i96), (char) ((((i118 ^ i119) + ((i118 & i119) << 1)) - (~(-(-(((i124 ^ i123) | (i124 & i123)) * 302))))) - 1), objArr4);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr4[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr3));
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
        java.lang.Throwable cause = th.getCause();
        if (cause != null) {
            throw cause;
        }
        throw th;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = (byte[]) objArr[0];
        byte[] bArr4 = (byte[]) objArr[1];
        byte[] ciacDecline = getCiacDecline(bArr3);
        byte[] bArr5 = new byte[16];
        byte[] bArr6 = new byte[0];
        byte[] bArr7 = new byte[16];
        try {
            com.payair.hce.accessinternalBeginTransaction accessinternalbegintransaction = new com.payair.hce.accessinternalBeginTransaction(new com.payair.hce.runInTransaction(new com.payair.hce.isOpenInternalannotations()));
            accessinternalbegintransaction.DigitizedCardProfile(true, new com.payair.hce.inTransaction(new com.payair.hce.getErrorDialog(bArr4), bArr7, 16));
            int i = 0;
            while (i < ciacDecline.length / 16) {
                int i2 = getAdditionalCheckTable;
                int i3 = i2 & 5;
                int i4 = i2 | 5;
                getCardholderValidators = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
                int i5 = i << 4;
                bArr = (byte[]) valueOf(new java.lang.Object[]{ciacDecline, java.lang.Integer.valueOf(i5), bArr5, 16}, 1520612320, -1520612288, i5);
                try {
                    valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    bArr5 = new byte[accessinternalbegintransaction.valueOf(bArr.length)];
                    try {
                        accessinternalbegintransaction.values(bArr5, accessinternalbegintransaction.valueOf(bArr, 0, bArr.length, bArr5));
                        int i6 = getAdditionalCheckTable;
                        int i7 = i6 | 13;
                        int i8 = i7 << 1;
                        int i9 = -((~(i6 & 13)) & i7);
                        getCardholderValidators = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
                    } catch (com.payair.hce.getSuspendingTransactionId unused) {
                    }
                    valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    int i10 = (((i & 20) | ((~i) & (-21))) - (~(-(-((i & (-21)) << 1))))) - 1;
                    int i11 = i10 & 22;
                    int i12 = -(-((i10 ^ 22) | i11));
                    i = ((i11 | i12) << 1) - (i11 ^ i12);
                    getAdditionalCheckTable = (getCardholderValidators + 103) % 128;
                    bArr6 = bArr;
                } catch (com.payair.hce.getInvalidationTracker e) {
                    e = e;
                    bArr6 = bArr;
                    try {
                        try {
                            java.lang.Object[] objArr2 = {e.toString()};
                            int indexOf = android.text.TextUtils.indexOf("", "", 0);
                            int i13 = -(android.os.Process.myTid() >> 22);
                            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                            int i14 = i13 * 659;
                            int i15 = (i14 ^ (-24966)) + ((i14 & (-24966)) << 1);
                            int i16 = ~i13;
                            int i17 = (i16 & 38) | (i16 ^ 38);
                            int i18 = ~i17;
                            int i19 = i18 & (i17 | i18);
                            int i20 = i13 & (-39);
                            int i21 = (~i20) & (i13 | (-39));
                            int i22 = (i21 ^ i20) | (i21 & i20);
                            int i23 = ~i22;
                            int i24 = (i22 | i23) & i23;
                            bArr2 = bArr5;
                            int i25 = ((~i24) & i19) | ((~i19) & i24);
                            int i26 = i19 & i24;
                            int i27 = (i25 ^ i26) | (i26 & i25);
                            int i28 = (i16 & currentTimeMillis) | ((~currentTimeMillis) & i13);
                            int i29 = i13 & currentTimeMillis;
                            int i30 = ~((i28 ^ i29) | (i28 & i29));
                            int i31 = i27 & i30;
                            int i32 = (i27 | i30) & (~i31);
                            int i33 = ((i32 ^ i31) | (i32 & i31)) * (-658);
                            int i34 = ((((~i33) & i15) | ((~i15) & i33)) - (~((i33 & i15) << 1))) - 1;
                            int i35 = (~((i13 ^ (-39)) | i20)) * 658;
                            int i36 = (((i34 ^ i35) | (i34 & i35)) << 1) - (((~i35) & i34) | ((~i34) & i35));
                            int i37 = ~((i13 ^ currentTimeMillis) | i29);
                            int i38 = i23 & i37;
                            int i39 = (i23 | i37) & (~i38);
                            int i40 = -(-(((i39 ^ i38) | (i39 & i38)) * 658));
                            int i41 = -(((~i36) & i40) | ((~i40) & i36));
                            try {
                                int axisFromString = android.view.MotionEvent.axisFromString("");
                                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                                int i42 = axisFromString * (-109);
                                int i43 = (i42 & (-112)) | ((~i42) & 111);
                                int i44 = (i42 & 111) << 1;
                                int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                                int i46 = ~axisFromString;
                                int i47 = currentTimeMillis2 & 1;
                                int i48 = (~i47) & (currentTimeMillis2 | 1);
                                int i49 = ~((i48 ^ i47) | (i48 & i47));
                                int i50 = i46 & i49;
                                int i51 = (i49 | i46) & (~i50);
                                int i52 = -(~(-(-(((i51 ^ i50) | (i51 & i50)) * (-220)))));
                                int i53 = (-2) - (~((i45 & i52) + (i52 | i45)));
                                int i54 = axisFromString & 1;
                                int i55 = (~i54) & (axisFromString | 1);
                                int i56 = ~((i54 & i55) | (i55 ^ i54));
                                int i57 = ~(((~currentTimeMillis2) & 1) | (currentTimeMillis2 & (-2)) | i47);
                                int i58 = i56 & i57;
                                int i59 = (i57 | i56) & (~i58);
                                int i60 = -(~(((i59 ^ i58) | (i59 & i58)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                                int i61 = (((i53 | i60) << 1) - (i60 ^ i53)) - 1;
                                int i62 = (i46 ^ 1) | (i46 & 1);
                                int i63 = ~i62;
                                int i64 = (i62 | i63) & i63;
                                int i65 = axisFromString & (-2);
                                int i66 = (axisFromString | (-2)) & (~i65);
                                int i67 = (i66 ^ i65) | (i66 & i65);
                                int i68 = ~i67;
                                int i69 = (i67 | i68) & i68;
                                int i70 = -(-(((i69 ^ i64) | (i69 & i64)) * 110));
                                int i71 = i61 & i70;
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                a(indexOf, (((i40 | i36) << 1) - (~i41)) - 1, (char) ((i71 - (~(-(-((i70 ^ i61) | i71))))) - 1), objArr3);
                                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr2));
                            } catch (java.lang.Throwable th) {
                                th = th;
                                try {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    bArr5 = bArr2;
                                    bArr = bArr6;
                                    valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                                    valueOf(new java.lang.Object[]{ciacDecline}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                                    valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                                    valueOf(new java.lang.Object[]{bArr7}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                                    throw th;
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            bArr2 = bArr5;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                    }
                } catch (java.lang.IllegalArgumentException e2) {
                    e = e2;
                    bArr6 = bArr;
                    java.lang.Object[] objArr22 = {e.toString()};
                    int indexOf2 = android.text.TextUtils.indexOf("", "", 0);
                    int i132 = -(android.os.Process.myTid() >> 22);
                    int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                    int i142 = i132 * 659;
                    int i152 = (i142 ^ (-24966)) + ((i142 & (-24966)) << 1);
                    int i162 = ~i132;
                    int i172 = (i162 & 38) | (i162 ^ 38);
                    int i182 = ~i172;
                    int i192 = i182 & (i172 | i182);
                    int i202 = i132 & (-39);
                    int i212 = (~i202) & (i132 | (-39));
                    int i222 = (i212 ^ i202) | (i212 & i202);
                    int i232 = ~i222;
                    int i242 = (i222 | i232) & i232;
                    bArr2 = bArr5;
                    int i252 = ((~i242) & i192) | ((~i192) & i242);
                    int i262 = i192 & i242;
                    int i272 = (i252 ^ i262) | (i262 & i252);
                    int i282 = (i162 & currentTimeMillis3) | ((~currentTimeMillis3) & i132);
                    int i292 = i132 & currentTimeMillis3;
                    int i302 = ~((i282 ^ i292) | (i282 & i292));
                    int i312 = i272 & i302;
                    int i322 = (i272 | i302) & (~i312);
                    int i332 = ((i322 ^ i312) | (i322 & i312)) * (-658);
                    int i342 = ((((~i332) & i152) | ((~i152) & i332)) - (~((i332 & i152) << 1))) - 1;
                    int i352 = (~((i132 ^ (-39)) | i202)) * 658;
                    int i362 = (((i342 ^ i352) | (i342 & i352)) << 1) - (((~i352) & i342) | ((~i342) & i352));
                    int i372 = ~((i132 ^ currentTimeMillis3) | i292);
                    int i382 = i232 & i372;
                    int i392 = (i232 | i372) & (~i382);
                    int i402 = -(-(((i392 ^ i382) | (i392 & i382)) * 658));
                    int i412 = -(((~i362) & i402) | ((~i402) & i362));
                    int axisFromString2 = android.view.MotionEvent.axisFromString("");
                    int currentTimeMillis22 = (int) java.lang.System.currentTimeMillis();
                    int i422 = axisFromString2 * (-109);
                    int i432 = (i422 & (-112)) | ((~i422) & 111);
                    int i442 = (i422 & 111) << 1;
                    int i452 = (i432 ^ i442) + ((i442 & i432) << 1);
                    int i462 = ~axisFromString2;
                    int i472 = currentTimeMillis22 & 1;
                    int i482 = (~i472) & (currentTimeMillis22 | 1);
                    int i492 = ~((i482 ^ i472) | (i482 & i472));
                    int i502 = i462 & i492;
                    int i512 = (i492 | i462) & (~i502);
                    int i522 = -(~(-(-(((i512 ^ i502) | (i512 & i502)) * (-220)))));
                    int i532 = (-2) - (~((i452 & i522) + (i522 | i452)));
                    int i542 = axisFromString2 & 1;
                    int i552 = (~i542) & (axisFromString2 | 1);
                    int i562 = ~((i542 & i552) | (i552 ^ i542));
                    int i572 = ~(((~currentTimeMillis22) & 1) | (currentTimeMillis22 & (-2)) | i472);
                    int i582 = i562 & i572;
                    int i592 = (i572 | i562) & (~i582);
                    int i602 = -(~(((i592 ^ i582) | (i592 & i582)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                    int i612 = (((i532 | i602) << 1) - (i602 ^ i532)) - 1;
                    int i622 = (i462 ^ 1) | (i462 & 1);
                    int i632 = ~i622;
                    int i642 = (i622 | i632) & i632;
                    int i652 = axisFromString2 & (-2);
                    int i662 = (axisFromString2 | (-2)) & (~i652);
                    int i672 = (i662 ^ i652) | (i662 & i652);
                    int i682 = ~i672;
                    int i692 = (i672 | i682) & i682;
                    int i702 = -(-(((i692 ^ i642) | (i692 & i642)) * 110));
                    int i712 = i612 & i702;
                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                    a(indexOf2, (((i402 | i362) << 1) - (~i412)) - 1, (char) ((i712 - (~(-(-((i702 ^ i612) | i712))))) - 1), objArr32);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr32[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr22));
                } catch (java.lang.IllegalStateException e3) {
                    e = e3;
                    bArr6 = bArr;
                    java.lang.Object[] objArr222 = {e.toString()};
                    int indexOf22 = android.text.TextUtils.indexOf("", "", 0);
                    int i1322 = -(android.os.Process.myTid() >> 22);
                    int currentTimeMillis32 = (int) java.lang.System.currentTimeMillis();
                    int i1422 = i1322 * 659;
                    int i1522 = (i1422 ^ (-24966)) + ((i1422 & (-24966)) << 1);
                    int i1622 = ~i1322;
                    int i1722 = (i1622 & 38) | (i1622 ^ 38);
                    int i1822 = ~i1722;
                    int i1922 = i1822 & (i1722 | i1822);
                    int i2022 = i1322 & (-39);
                    int i2122 = (~i2022) & (i1322 | (-39));
                    int i2222 = (i2122 ^ i2022) | (i2122 & i2022);
                    int i2322 = ~i2222;
                    int i2422 = (i2222 | i2322) & i2322;
                    bArr2 = bArr5;
                    int i2522 = ((~i2422) & i1922) | ((~i1922) & i2422);
                    int i2622 = i1922 & i2422;
                    int i2722 = (i2522 ^ i2622) | (i2622 & i2522);
                    int i2822 = (i1622 & currentTimeMillis32) | ((~currentTimeMillis32) & i1322);
                    int i2922 = i1322 & currentTimeMillis32;
                    int i3022 = ~((i2822 ^ i2922) | (i2822 & i2922));
                    int i3122 = i2722 & i3022;
                    int i3222 = (i2722 | i3022) & (~i3122);
                    int i3322 = ((i3222 ^ i3122) | (i3222 & i3122)) * (-658);
                    int i3422 = ((((~i3322) & i1522) | ((~i1522) & i3322)) - (~((i3322 & i1522) << 1))) - 1;
                    int i3522 = (~((i1322 ^ (-39)) | i2022)) * 658;
                    int i3622 = (((i3422 ^ i3522) | (i3422 & i3522)) << 1) - (((~i3522) & i3422) | ((~i3422) & i3522));
                    int i3722 = ~((i1322 ^ currentTimeMillis32) | i2922);
                    int i3822 = i2322 & i3722;
                    int i3922 = (i2322 | i3722) & (~i3822);
                    int i4022 = -(-(((i3922 ^ i3822) | (i3922 & i3822)) * 658));
                    int i4122 = -(((~i3622) & i4022) | ((~i4022) & i3622));
                    int axisFromString22 = android.view.MotionEvent.axisFromString("");
                    int currentTimeMillis222 = (int) java.lang.System.currentTimeMillis();
                    int i4222 = axisFromString22 * (-109);
                    int i4322 = (i4222 & (-112)) | ((~i4222) & 111);
                    int i4422 = (i4222 & 111) << 1;
                    int i4522 = (i4322 ^ i4422) + ((i4422 & i4322) << 1);
                    int i4622 = ~axisFromString22;
                    int i4722 = currentTimeMillis222 & 1;
                    int i4822 = (~i4722) & (currentTimeMillis222 | 1);
                    int i4922 = ~((i4822 ^ i4722) | (i4822 & i4722));
                    int i5022 = i4622 & i4922;
                    int i5122 = (i4922 | i4622) & (~i5022);
                    int i5222 = -(~(-(-(((i5122 ^ i5022) | (i5122 & i5022)) * (-220)))));
                    int i5322 = (-2) - (~((i4522 & i5222) + (i5222 | i4522)));
                    int i5422 = axisFromString22 & 1;
                    int i5522 = (~i5422) & (axisFromString22 | 1);
                    int i5622 = ~((i5422 & i5522) | (i5522 ^ i5422));
                    int i5722 = ~(((~currentTimeMillis222) & 1) | (currentTimeMillis222 & (-2)) | i4722);
                    int i5822 = i5622 & i5722;
                    int i5922 = (i5722 | i5622) & (~i5822);
                    int i6022 = -(~(((i5922 ^ i5822) | (i5922 & i5822)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                    int i6122 = (((i5322 | i6022) << 1) - (i6022 ^ i5322)) - 1;
                    int i6222 = (i4622 ^ 1) | (i4622 & 1);
                    int i6322 = ~i6222;
                    int i6422 = (i6222 | i6322) & i6322;
                    int i6522 = axisFromString22 & (-2);
                    int i6622 = (axisFromString22 | (-2)) & (~i6522);
                    int i6722 = (i6622 ^ i6522) | (i6622 & i6522);
                    int i6822 = ~i6722;
                    int i6922 = (i6722 | i6822) & i6822;
                    int i7022 = -(-(((i6922 ^ i6422) | (i6922 & i6422)) * 110));
                    int i7122 = i6122 & i7022;
                    java.lang.Object[] objArr322 = new java.lang.Object[1];
                    a(indexOf22, (((i4022 | i3622) << 1) - (~i4122)) - 1, (char) ((i7122 - (~(-(-((i7022 ^ i6122) | i7122))))) - 1), objArr322);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr322[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr222));
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{ciacDecline}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    valueOf(new java.lang.Object[]{bArr7}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    throw th;
                }
            }
            byte[] bArr8 = new byte[8];
            java.lang.System.arraycopy(bArr5, 0, bArr8, 0, 8);
            valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{ciacDecline}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr6}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr7}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            int i72 = getAdditionalCheckTable;
            int i73 = (i72 ^ 95) + ((i72 & 95) << 1);
            getCardholderValidators = i73 % 128;
            if (i73 % 2 == 0) {
                return bArr8;
            }
            throw new java.lang.ArithmeticException();
        } catch (com.payair.hce.getInvalidationTracker e4) {
            e = e4;
        } catch (java.lang.IllegalArgumentException e5) {
            e = e5;
        } catch (java.lang.IllegalStateException e6) {
            e = e6;
        } catch (java.lang.Throwable th6) {
            th = th6;
            bArr = bArr6;
            valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{ciacDecline}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr7}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object getCrmCountryCode(java.lang.Object[] objArr) {
        int i = 0;
        byte[] bArr = (byte[]) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        byte[] bArr2 = (byte[]) objArr[2];
        int i2 = getAdditionalCheckTable;
        int i3 = ~i2;
        getCardholderValidators = (((((i2 ^ 45) | (i2 & 45)) << 1) - (~(-((i2 & (-46)) | (i3 & 45))))) - 1) % 128;
        byte[] bArr3 = new byte[16];
        getCardholderValidators = (((i3 & 57) | (i2 & (-58))) + ((i2 & 57) << 1)) % 128;
        for (int i4 = 16; i < i4; i4 = 16) {
            int i5 = getAdditionalCheckTable;
            int i6 = ((-2) - (~(((i5 | 22) << 1) - (i5 ^ 22)))) % 128;
            getCardholderValidators = i6;
            int i7 = (intValue * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE) + (i * (-271));
            int i8 = ~intValue;
            int i9 = (i8 | intValue) & i8;
            int i10 = ~i;
            int i11 = i9 ^ i10;
            int i12 = i9 & i10;
            int i13 = (i11 ^ i12) | (i11 & i12);
            int i14 = ~(((~i13) & i8) | ((~i8) & i13) | (i13 & i8));
            int i15 = i & i8;
            int i16 = (intValue & i10) | i15;
            int i17 = intValue & i;
            int i18 = (i16 ^ i17) | (i16 & i17);
            int i19 = ~(((~i18) & intValue) | (i18 & i8) | (i18 & intValue));
            int i20 = ((~i14) & i19) | ((~i19) & i14);
            int i21 = i19 & i14;
            int i22 = -(-(((i20 ^ i21) | (i21 & i20)) * (-272)));
            int i23 = (i7 & i22) + (i22 | i7);
            int i24 = i8 ^ i;
            int i25 = ~((i24 ^ i15) | (i15 & i24));
            int i26 = i9 & intValue;
            int i27 = ~(i26 | ((i9 | intValue) & (~i26)));
            int i28 = i25 ^ i27;
            int i29 = i25 & i27;
            int i30 = -(-(((i29 ^ i28) | (i29 & i28)) * (-272)));
            int i31 = (i23 | i30) << 1;
            int i32 = -(((~i30) & i23) | ((~i23) & i30));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            int i34 = ~((intValue & i8) | intValue);
            int i35 = ((i34 ^ i) | (i34 & i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE;
            byte b = bArr[((i33 | i35) << 1) - (i35 ^ i33)];
            byte b2 = bArr2[i];
            int i36 = b & b2;
            bArr3[i] = (byte) (((b ^ b2) | i36) & (~i36));
            int i37 = ((i ^ 70) | (i & 70)) << 1;
            int i38 = -((i & (-71)) | (i10 & 70));
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            int i40 = i39 & (-69);
            i = i40 + ((i39 ^ (-69)) | i40);
            int i41 = i6 & 113;
            int i42 = -(-(i6 | 113));
            int i43 = (i41 & i42) + (i41 | i42);
            getAdditionalCheckTable = i43 % 128;
            if (i43 % 2 == 0) {
                int i44 = 4 / 4;
            }
        }
        int i45 = getCardholderValidators;
        int i46 = (i45 ^ 31) + ((i45 & 31) << 1);
        getAdditionalCheckTable = i46 % 128;
        if (i46 % 2 != 0) {
            return bArr3;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        int length;
        int i;
        byte[] bArr = (byte[]) objArr[0];
        int i2 = getCardholderValidators;
        int i3 = ((-2) - (~((i2 & 12) + (i2 | 12)))) % 128;
        getAdditionalCheckTable = i3;
        if (bArr != null) {
            int i4 = (((i3 | 2) << 1) - (i3 ^ 2)) - 1;
            int i5 = i4 % 128;
            getCardholderValidators = i5;
            if (i4 % 2 != 0) {
                length = bArr.length;
                i = 1;
            } else {
                length = bArr.length;
                i = 0;
            }
            int i6 = ((i5 ^ 96) + ((i5 & 96) << 1)) - 1;
            while (true) {
                getAdditionalCheckTable = i6 % 128;
                if (i >= length) {
                    break;
                }
                int i7 = getAdditionalCheckTable;
                int i8 = i7 & 29;
                int i9 = -(-((i7 ^ 29) | i8));
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                int i11 = i10 % 128;
                getCardholderValidators = i11;
                if (i10 % 2 != 0) {
                    bArr[i] = 1;
                    i = ((i & (-44)) | ((~i) & 43)) + ((i & 43) << 1);
                } else {
                    bArr[i] = 0;
                    i++;
                }
                int i12 = i11 & 15;
                int i13 = ((i11 ^ 15) | i12) << 1;
                int i14 = -((i11 | 15) & (~i12));
                i6 = ((i13 | i14) << 1) - (i14 ^ i13);
            }
        }
        int i15 = getCardholderValidators;
        int i16 = ((i15 & 88) + (i15 | 88)) - 1;
        getAdditionalCheckTable = i16 % 128;
        if (i16 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static byte[] getAid(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int i = getCardholderValidators;
        getAdditionalCheckTable = ((i & 93) + (i | 93)) % 128;
        byte[] bArr3 = (byte[]) valueOf(new java.lang.Object[]{bArr2, bArr}, -2005776254, 2005776256, (int) java.lang.System.currentTimeMillis());
        byte[] bArr4 = new byte[16];
        java.lang.System.arraycopy(bArr3, 0, bArr4, 0, 16);
        valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
        int i2 = getCardholderValidators;
        getAdditionalCheckTable = ((i2 ^ 109) + ((i2 & 109) << 1)) % 128;
        return bArr4;
    }

    private static byte[] getCiacDecline(byte[] bArr) {
        int i = getCardholderValidators;
        int i2 = ((i | 21) << 1) - ((i & (-22)) | ((~i) & 21));
        getAdditionalCheckTable = i2 % 128;
        if (i2 % 2 != 0) {
            return getGpoResponse(bArr);
        }
        getGpoResponse(bArr);
        throw null;
    }

    private static byte[] getGpoResponse(byte[] bArr) {
        int i = getCardholderValidators;
        getAdditionalCheckTable = ((i & 35) + (i | 35)) % 128;
        int length = bArr.length;
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i2 = (-6081) - (~(-(-(length * 382))));
        int i3 = length ^ currentTimeMillis;
        int i4 = ~currentTimeMillis;
        int i5 = currentTimeMillis & length;
        int i6 = (i5 ^ i3) | (i5 & i3);
        int i7 = (i6 & 16) | ((~i6) & (-17));
        int i8 = i6 & (-17);
        int i9 = ((i8 ^ i7) | (i8 & i7)) * (-381);
        int i10 = (i2 ^ i9) + ((i9 & i2) << 1);
        int i11 = ~length;
        int i12 = i11 & (i11 | length);
        int i13 = ((~i12) & (-17)) | (i12 & 16);
        int i14 = i12 & (-17);
        int i15 = ~((i14 ^ i13) | (i14 & i13));
        int i16 = ~((i4 ^ length) | (i4 & length));
        int i17 = i15 & i16;
        int i18 = (i15 | i16) & (~i17);
        int i19 = (i18 ^ i17) | (i18 & i17);
        int i20 = length ^ 16;
        int i21 = length & 16;
        int i22 = (i20 ^ i21) | (i20 & i21);
        int i23 = ~i22;
        int i24 = (i22 | i23) & i23;
        int i25 = ((~i24) & i19) | ((~i19) & i24);
        int i26 = i19 & i24;
        int i27 = -(-(((i26 ^ i25) | (i26 & i25)) * 381));
        int i28 = i10 & i27;
        int i29 = (((i10 ^ i27) | i28) << 1) - ((i27 | i10) & (~i28));
        int i30 = length & (-17);
        int i31 = (length | (-17)) & (~i30);
        int i32 = (i31 ^ i30) | (i31 & i30);
        int i33 = ~i32;
        int i34 = ((i32 | i33) & i33) * 381;
        byte[] bArr2 = new byte[((((i29 | i34) << 1) - (i34 ^ i29)) - (~(-(~(-(bArr.length % 16)))))) - 2];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = Byte.MIN_VALUE;
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i35 = ~currentTimeMillis2;
        int i36 = (i35 & 1030324780) | (currentTimeMillis2 & (-1030324781));
        int i37 = currentTimeMillis2 & 1030324780;
        int i38 = -(-(((i36 ^ i37) | (i36 & i37)) * (-50)));
        int i39 = i38 & (-1205579510);
        int i40 = ((i38 ^ (-1205579510)) | i39) << 1;
        int i41 = -((i38 | (-1205579510)) & (~i39));
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        int i43 = ~((-470319113) | currentTimeMillis2);
        int i44 = (currentTimeMillis2 | i35) & i35;
        int i45 = ~i44;
        int i46 = (i45 & 568412965) | ((-568412966) & i44);
        int i47 = i44 & 568412965;
        int i48 = (i46 ^ i47) | (i47 & i46);
        int i49 = i48 & 1030324780;
        int i50 = (i48 | 1030324780) & (~i49);
        int i51 = (i50 ^ i49) | (i50 & i49);
        int i52 = ~i51;
        int i53 = (i51 | i52) & i52;
        int i54 = (((~i43) & i53) | ((~i53) & i43) | (i43 & i53)) * 50;
        int i55 = i42 & i54;
        int i56 = ((((i42 ^ i54) | i55) << 1) - (~(-((i54 | i42) & (~i55))))) - 1;
        int i57 = i44 ^ 568412965;
        int i58 = ~((i57 ^ i47) | (i57 & i47));
        int i59 = (1038732077 & i58) | ((~i58) & (-1038732078));
        int i60 = i58 & (-1038732078);
        int i61 = (i60 ^ i59) | (i60 & i59);
        int i62 = (i44 & (-1030324781)) | (i45 & 1030324780) | (i44 & 1030324780);
        int i63 = ~i62;
        int i64 = (i62 | i63) & i63;
        int i65 = -(~(-(-(((i64 ^ i61) | (i64 & i61)) * 50))));
        int i66 = (i56 ^ i65) + ((i65 & i56) << 1);
        int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
        int i67 = ~currentTimeMillis3;
        int i68 = ~((i67 ^ (-1863932703)) | (i67 & (-1863932703)));
        int i69 = i68 & (-80499551);
        int i70 = (i68 | (-80499551)) & (~i69);
        int i71 = -(~(-(-(((i70 ^ i69) | (i70 & i69)) * (-235)))));
        int i72 = (i71 ^ (-1754096673)) + ((i71 & (-1754096673)) << 1);
        int i73 = currentTimeMillis3 ^ (-1863932703);
        int i74 = (-1863932703) & currentTimeMillis3;
        int i75 = ((~i72) + (i72 << 1)) & (-(-(((~((i74 ^ i73) | (i74 & i73))) | (-80499551)) * (-470))));
        int i76 = ~(currentTimeMillis3 | (-67654431));
        int i77 = (i76 | (-1876777823)) & (~(i76 & (-1876777823)));
        if ((~i66) + (i66 << 1) <= (((((r2 | r3) & (~i75)) - (~(-(-(i75 << 1))))) - 1) - (~(-(-(((i77 ^ r7) | (i77 & r7)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))))) - 1) {
            return bArr2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0021, code lost:
    
        r1 = (r1 + 47) % 128;
        com.payair.hce.setPivotX.getAdditionalCheckTable = r1;
        r1 = r1 + 98;
        com.payair.hce.setPivotX.getCardholderValidators = ((~r1) + (r1 << 1)) % 128;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x001f, code lost:
    
        if (r8 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r8 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        r8 = r4 & 9;
        com.payair.hce.setPivotX.getCardholderValidators = ((r8 - (~(-(-((r4 ^ 9) | r8))))) - 1) % 128;
        r8 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] writeReplace(int i, boolean z) throws java.security.GeneralSecurityException {
        byte[] bArr;
        int i2;
        int i3 = getCardholderValidators;
        int i4 = ((i3 | 41) << 1) - (i3 ^ 41);
        int i5 = i4 % 128;
        getAdditionalCheckTable = i5;
        if (i4 % 2 == 0) {
            bArr = new byte[77];
        } else {
            bArr = new byte[16];
        }
        bArr[0] = (byte) i2;
        if (i <= 255) {
            int i6 = getCardholderValidators + 89;
            getAdditionalCheckTable = i6 % 128;
            if (i6 % 2 == 0) {
                bArr[5] = (byte) i;
            } else {
                bArr[3] = (byte) i;
            }
        } else {
            if (i > 65535) {
                int i7 = getAdditionalCheckTable;
                int i8 = i7 & 13;
                int i9 = (i8 - (~((i7 ^ 13) | i8))) - 1;
                int i10 = i9 % 128;
                getCardholderValidators = i10;
                if (i9 % 2 != 0) {
                    throw null;
                }
                int i11 = i10 & 3;
                int i12 = ((i10 ^ 3) | i11) << 1;
                int i13 = -((i10 | 3) & (~i11));
                getAdditionalCheckTable = ((i12 & i13) + (i13 | i12)) % 128;
                try {
                    java.lang.Object[] objArr = {"Invalid M2C"};
                    int i14 = -(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                    int i15 = ((~i14) & 1) | (i14 & (-2));
                    int i16 = (i14 & 1) << 1;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a((i15 & i16) + (i16 | i15), 36 - (~(-(~(-android.view.KeyEvent.keyCodeFromString(""))))), (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr2);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            bArr[2] = (byte) (i >> 8);
            bArr[3] = (byte) i;
            int i17 = getAdditionalCheckTable;
            int i18 = i17 & 117;
            int i19 = i17 | 117;
            getCardholderValidators = ((i18 ^ i19) + ((i19 & i18) << 1)) % 128;
        }
        getAdditionalCheckTable = (getCardholderValidators + 67) % 128;
        return bArr;
    }

    @Override // com.payair.hce.sendUpdateRNSInformation
    public final com.payair.hce.sendUpdateRNSInformation.AlternateContactlessPaymentDataJson AlternateContactlessPaymentDataJson(byte[] bArr, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2) throws java.security.GeneralSecurityException {
        try {
            java.util.concurrent.Future future = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, initializevisapaymentsdk}, 1893095039, -1893095002, java.lang.System.identityHashCode(this));
            java.util.concurrent.Future future2 = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, initializevisapaymentsdk2}, 1893095039, -1893095002, java.lang.System.identityHashCode(this));
            final byte[] bArr2 = (byte[]) valueOf(new java.lang.Object[]{this, bArr, (byte[]) future.get()}, 231582132, -231582120, java.lang.System.identityHashCode(this));
            final byte[] bArr3 = (byte[]) valueOf(new java.lang.Object[]{this, bArr, (byte[]) future2.get()}, 231582132, -231582120, java.lang.System.identityHashCode(this));
            com.payair.hce.sendUpdateRNSInformation.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = new com.payair.hce.sendUpdateRNSInformation.AlternateContactlessPaymentDataJson() { // from class: com.payair.hce.setPivotX.3
                private static int AlternateContactlessPaymentDataJson = 0;
                private static int DigitizedCardProfile = 1;

                public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
                    int i4 = ~((~i) | i2);
                    int i5 = ~i2;
                    int i6 = ~i3;
                    if ((i * (-1975)) + (i2 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) + ((i3 | i4) * 988) + (((~(i | i5)) | (~(i | i6))) * (-1976)) + (((~(i5 | i3)) | i4 | (~(i2 | i6))) * 988) == 1) {
                        return DigitizedCardProfile(objArr);
                    }
                    com.payair.hce.setPivotX.AnonymousClass3 anonymousClass3 = (com.payair.hce.setPivotX.AnonymousClass3) objArr[0];
                    int i7 = DigitizedCardProfile;
                    int i8 = i7 & 17;
                    int i9 = (i7 ^ 17) | i8;
                    AlternateContactlessPaymentDataJson = ((i8 ^ i9) + ((i8 & i9) << 1)) % 128;
                    byte[] bArr4 = bArr3;
                    AlternateContactlessPaymentDataJson = ((i7 ^ 75) + ((i7 & 75) << 1)) % 128;
                    return bArr4;
                }

                private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                    com.payair.hce.setPivotX.AnonymousClass3 anonymousClass3 = (com.payair.hce.setPivotX.AnonymousClass3) objArr[0];
                    int i = DigitizedCardProfile;
                    int i2 = i & 85;
                    int i3 = -(-(i | 85));
                    int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
                    AlternateContactlessPaymentDataJson = i4 % 128;
                    byte[] bArr4 = bArr2;
                    if (i4 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    int i5 = i | 99;
                    int i6 = (i5 << 1) - ((~(i & 99)) & i5);
                    AlternateContactlessPaymentDataJson = i6 % 128;
                    if (i6 % 2 == 0) {
                        return bArr4;
                    }
                    throw null;
                }

                @Override // com.payair.hce.sendUpdateRNSInformation.AlternateContactlessPaymentDataJson
                public final byte[] DigitizedCardProfile() {
                    return (byte[]) values(new java.lang.Object[]{this}, 687074081, -687074081, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.sendUpdateRNSInformation.AlternateContactlessPaymentDataJson
                public final byte[] writeReplace() {
                    return (byte[]) values(new java.lang.Object[]{this}, -1845388845, 1845388846, java.lang.System.identityHashCode(this));
                }
            };
            int i = getAdditionalCheckTable;
            getCardholderValidators = (((i & 98) + (i | 98)) - 1) % 128;
            int i2 = (((i & (-66)) | ((~i) & 65)) + ((i & 65) << 1)) % 128;
            getCardholderValidators = i2;
            int i3 = (i2 & 19) + (i2 | 19);
            getAdditionalCheckTable = i3 % 128;
            if (i3 % 2 != 0) {
                return alternateContactlessPaymentDataJson;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Exception e) {
            try {
                java.lang.Object[] objArr = {e.toString()};
                int argb = android.graphics.Color.argb(0, 0, 0, 0);
                int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i4 = keyRepeatDelay * (-947);
                int i5 = ((i4 ^ 36062) | (i4 & 36062)) << 1;
                int i6 = -((i4 & (-36063)) | (36062 & (~i4)));
                int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                int i8 = ~keyRepeatDelay;
                int i9 = (i8 | keyRepeatDelay) & i8;
                int i10 = identityHashCode ^ (-39);
                int i11 = identityHashCode & (-39);
                int i12 = ~((i10 ^ i11) | (i10 & i11));
                int i13 = -(-(((i9 ^ i12) | (i9 & i12)) * (-948)));
                int i14 = (i7 & i13) + (i7 | i13);
                int i15 = i8 & (-39);
                int i16 = ((i8 | (-39)) & (~i15)) | i15;
                int i17 = ~identityHashCode;
                int i18 = (identityHashCode | i17) & i17;
                int i19 = i16 ^ i18;
                int i20 = i18 & i16;
                int i21 = -(~(-(-((~((i20 ^ i19) | (i20 & i19))) * (-948)))));
                int i22 = (((i14 | i21) << 1) - (i21 ^ i14)) - 1;
                int i23 = -(-(((keyRepeatDelay ^ (-39)) | (keyRepeatDelay & (-39))) * 948));
                int i24 = i22 & i23;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(argb, (i24 - (~(-(-((i23 ^ i22) | i24))))) - 1, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    @Override // com.payair.hce.sendUpdateRNSInformation
    public final com.payair.hce.sendUpdateRNSInformation.AlternateContactlessPaymentDataJson valueOf(byte[] bArr, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2) throws java.security.GeneralSecurityException {
        try {
            java.util.concurrent.Future future = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, initializevisapaymentsdk}, 1893095039, -1893095002, java.lang.System.identityHashCode(this));
            java.util.concurrent.Future future2 = (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, initializevisapaymentsdk2}, 1893095039, -1893095002, java.lang.System.identityHashCode(this));
            final byte[] DigitizedCardProfile = DigitizedCardProfile(bArr, (byte[]) future.get(), com.payair.hce.setPivotX.values.DigitizedCardProfile);
            final byte[] DigitizedCardProfile2 = DigitizedCardProfile(bArr, (byte[]) future2.get(), com.payair.hce.setPivotX.values.DigitizedCardProfile);
            com.payair.hce.sendUpdateRNSInformation.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = new com.payair.hce.sendUpdateRNSInformation.AlternateContactlessPaymentDataJson() { // from class: com.payair.hce.setPivotX.5
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$d = null;
                private static final int $$e = 0;
                private static int $10;
                private static int $11;
                private static int AlternateContactlessPaymentDataJson;
                private static int IccPrivateKeyCrtComponentsJson;
                private static long RecordsJson;
                private static short[] SdkCoreAlternateContactlessPaymentDataImpl;
                private static int SdkCoreBusinessLogicModuleImpl;
                private static byte[] getAid;
                private static long getCvrMaskAnd;
                private static int getGpoResponse;
                private static char[] getProfileVersion;
                private static int values;

                private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
                    int i2 = 40 - (i * 2);
                    byte[] bArr2 = $$a;
                    int i3 = s + 65;
                    char[] cArr = new char[35 - b];
                    int i4 = 34 - b;
                    int i5 = -1;
                    if (bArr2 == null) {
                        i3 = (i3 + i4) - 2;
                        i2++;
                    }
                    while (true) {
                        i5++;
                        cArr[i5] = (char) i3;
                        if (i5 == i4) {
                            objArr[0] = new java.lang.String(cArr);
                            return;
                        } else {
                            i3 = (i3 + bArr2[i2]) - 2;
                            i2++;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void e(short s, byte b, byte b2, java.lang.Object[] objArr) {
                    int i;
                    int i2 = 3 - (s * 2);
                    byte[] bArr2 = $$d;
                    int i3 = 119 - b2;
                    int i4 = b * 2;
                    byte[] bArr3 = new byte[i4 + 1];
                    if (bArr2 == null) {
                        int i5 = i4;
                        int i6 = 0;
                        i3 = (-i3) + i5;
                        i = i6;
                        i2++;
                        bArr3[i] = (byte) i3;
                        if (i == i4) {
                            objArr[0] = new java.lang.String(bArr3, 0);
                            return;
                        }
                        int i7 = i + 1;
                        i5 = i3;
                        i3 = bArr2[i2];
                        i6 = i7;
                        i3 = (-i3) + i5;
                        i = i6;
                        i2++;
                        bArr3[i] = (byte) i3;
                        if (i == i4) {
                        }
                    } else {
                        i = 0;
                        i2++;
                        bArr3[i] = (byte) i3;
                        if (i == i4) {
                        }
                    }
                }

                private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
                    char[] cArr;
                    if (str != null) {
                        $10 = ($11 + 33) % 128;
                        cArr = str.toCharArray();
                    } else {
                        cArr = str;
                    }
                    com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
                    char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(getCvrMaskAnd ^ (-3824242241614154557L), cArr, i);
                    getcardholdervalidator.valueOf = 4;
                    while (getcardholdervalidator.valueOf < writeReplace.length) {
                        getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
                        int i2 = getcardholdervalidator.valueOf;
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getCvrMaskAnd)};
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                            if (obj == null) {
                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 40, 1921 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                e((short) 0, (byte) 0, (byte) 2, objArr3);
                                obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                            }
                            writeReplace[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                            java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                            if (obj2 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0) + 429, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31610));
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                e((short) 0, (byte) 0, (byte) 0, objArr5);
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
                    java.lang.String str2 = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
                    $11 = ($10 + 101) % 128;
                    objArr[0] = str2;
                }

                private static void a(char c, int i, int i2, java.lang.Object[] objArr) {
                    com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
                    long[] jArr = new long[i];
                    byte b = 0;
                    getcvmmodel.valueOf = 0;
                    $10 = ($11 + 101) % 128;
                    while (getcvmmodel.valueOf < i) {
                        int i3 = $10 + 69;
                        $11 = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = getcvmmodel.valueOf;
                            try {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                objArr2[b] = java.lang.Integer.valueOf(getProfileVersion[i2 + getcvmmodel.valueOf]);
                                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                                if (obj == null) {
                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.widget.ExpandableListView.getPackedPositionForGroup(b) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(b) == 0L ? 0 : -1)), android.graphics.Color.green((int) b) + 381, (char) (android.text.TextUtils.getTrimmedLength("") + 62388));
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    e(b, b, $$d[3], objArr3);
                                    java.lang.String str = (java.lang.String) objArr3[b];
                                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                                    clsArr[b] = java.lang.Integer.TYPE;
                                    obj = cls.getMethod(str, clsArr);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                                }
                                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(RecordsJson), java.lang.Integer.valueOf(c)};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 35, 3967 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (40223 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                                }
                                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                                if (obj3 == null) {
                                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 212 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                                }
                                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            int i5 = getcvmmodel.valueOf;
                            java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(getProfileVersion[i2 + getcvmmodel.valueOf])};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                            if (obj4 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 381, (char) (62388 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)));
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                e((short) 0, (byte) 0, $$d[3], objArr7);
                                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                            }
                            java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(RecordsJson), java.lang.Integer.valueOf(c)};
                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                            if (obj5 == null) {
                                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.getTrimmedLength(""), 3966 - android.view.View.getDefaultSize(0, 0), (char) (40223 - android.view.KeyEvent.normalizeMetaState(0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                            }
                            jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                            java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                            if (obj6 == null) {
                                obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 34, 211 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                            }
                            ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
                        }
                        b = 0;
                    }
                    char[] cArr = new char[i];
                    getcvmmodel.valueOf = 0;
                    while (getcvmmodel.valueOf < i) {
                        cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                        java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
                        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                        if (obj7 == null) {
                            obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 213 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) android.view.View.getDefaultSize(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
                        }
                        ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
                    }
                    java.lang.String str2 = new java.lang.String(cArr);
                    $11 = ($10 + 29) % 128;
                    objArr[0] = str2;
                }

                private static void d(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
                    int i4;
                    int length;
                    byte[] bArr2;
                    com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(values)};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 28, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                        int i5 = intValue == -1 ? 1 : 0;
                        if (i5 != 0) {
                            byte[] bArr3 = getAid;
                            if (bArr3 != null) {
                                int i6 = $10 + 55;
                                $11 = i6 % 128;
                                if (i6 % 2 == 0) {
                                    length = bArr3.length;
                                    bArr2 = new byte[length];
                                } else {
                                    length = bArr3.length;
                                    bArr2 = new byte[length];
                                }
                                for (int i7 = 0; i7 < length; i7++) {
                                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr3[i7])};
                                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                    if (obj2 == null) {
                                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 31, 5088 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) android.view.View.getDefaultSize(0, 0))).getMethod("e", java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                                    }
                                    bArr2[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                                }
                                bArr3 = bArr2;
                            }
                            if (bArr3 != null) {
                                int i8 = $10 + 9;
                                $11 = i8 % 128;
                                if (i8 % 2 == 0) {
                                    byte[] bArr4 = getAid;
                                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                                    if (obj3 == null) {
                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27, 30 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                                    }
                                    i4 = ((byte) (bArr4[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) % ((int) (values | (-4897270311952305750L)));
                                } else {
                                    byte[] bArr5 = getAid;
                                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                                    if (obj4 == null) {
                                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 27, (android.os.Process.myPid() >> 22) + 29, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                                    }
                                    i4 = ((byte) (bArr5[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue()] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L)));
                                }
                                intValue = (byte) i4;
                            } else {
                                intValue = (short) (((short) (SdkCoreAlternateContactlessPaymentDataImpl[i2 + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L))));
                            }
                        }
                        if (intValue > 0) {
                            $10 = ($11 + 119) % 128;
                            gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L))) + i5;
                            java.lang.Object[] objArr6 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson), sb};
                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                            if (obj5 == null) {
                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2364, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                e((short) 0, (byte) 0, com.google.common.base.Ascii.SI, objArr7);
                                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj5);
                            }
                            ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            byte[] bArr6 = getAid;
                            if (bArr6 != null) {
                                int length2 = bArr6.length;
                                byte[] bArr7 = new byte[length2];
                                int i9 = 0;
                                while (i9 < length2) {
                                    int i10 = $11 + 111;
                                    $10 = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        bArr7[i9] = (byte) (bArr6[i9] | (-4897270311952305750L));
                                        i9 >>= 1;
                                    } else {
                                        bArr7[i9] = (byte) (bArr6[i9] ^ (-4897270311952305750L));
                                        i9++;
                                    }
                                }
                                bArr6 = bArr7;
                            }
                            boolean z = bArr6 != null;
                            gettrack2constructiondata.DigitizedCardProfile = 1;
                            while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                                if (z) {
                                    byte[] bArr8 = getAid;
                                    gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                    gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr8[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                } else {
                                    short[] sArr = SdkCoreAlternateContactlessPaymentDataImpl;
                                    gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                    gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                }
                                sb.append(gettrack2constructiondata.values);
                                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                gettrack2constructiondata.DigitizedCardProfile++;
                            }
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

                @Override // com.payair.hce.sendUpdateRNSInformation.AlternateContactlessPaymentDataJson
                public final byte[] writeReplace() {
                    int i = (SdkCoreBusinessLogicModuleImpl + 77) % 128;
                    getGpoResponse = i;
                    byte[] bArr2 = DigitizedCardProfile;
                    SdkCoreBusinessLogicModuleImpl = (i + 109) % 128;
                    return bArr2;
                }

                @Override // com.payair.hce.sendUpdateRNSInformation.AlternateContactlessPaymentDataJson
                public final byte[] DigitizedCardProfile() {
                    int i = SdkCoreBusinessLogicModuleImpl + 45;
                    getGpoResponse = i % 128;
                    if (i % 2 == 0) {
                        return DigitizedCardProfile2;
                    }
                    throw null;
                }

                static void AlternateContactlessPaymentDataJson() {
                    getProfileVersion = new char[]{24192, 61009, 16360, 20225, 40120, 11302, 32118, 35539, 55854, 27552, 47923, 51283, 24192, 61010, 16380, 20240, 40106, 11389, 32093, 35553, 55827, 27567, 47994, 51295, 6636, 43271, 63199, 1595, 22355, 58601, 13315, 17809, 38261, 8771, 29671, 33652, 53381, 24625, 45388, 65256, 3645, 24478, 61236, 15433, 19939, 40248, 10894, 31284, 35658, 55505, 26748, 47567, 51505, 5699, 24270, 61016, 16377, 20246, 40100, 11323, 32093, 35502, 55812, 27553, 47931, 51272, 6630, 43268, 63109, 1654, 22396, 58601, 13315, 17792, 38206, 8794, 29693, 24264, 61011, 16361, 20276, 40106, 11313, 32082, 35553, 55808, 27563, 47899, 51293, 6638, 43279, 24264, 61011, 16361, 20261, 40123, 11298, 32085, 35561, 55812, 27567, 47905, 51285, 6636, 43268, 63160, 1590, 22361, 58601, 46847, 1641, 55240, 42791, 29845, 50186, 38252, 25247, 12853, 33680, 21258, 8313, 61911, 16693, 7860, 60999, 49022, 3290, 56434, 44420, 32026, 51811, 39892, 27464, 14501, 34830, 22880, 5844, 58957, 47013, 1849, 54391, 42456, 30024, 24267, 61015, 16361, 20229, 40079, 11323, 32075, 24287, 61019, 16317, 20232, 40098, 11297, 32077, 35488, 55831, 27567, 47926, 51287, 6626, 43277, 63124, 1579, 24261, 61015, 16363, 20229, 40165, 11326, 32088, 35566, 55808, 27616, 47873, 51284, 6641, 43279, 63120, 1596, 4994, 41754, 29347, 561, 53643, 24266, 61006, 16372, 20240, 40129, 24287, 61015, 16382, 20239, 40106, 11317, 32092, 35514, 55812, 27553, 47928, 51218, 6626, 43268, 63125, 1578, 22352, 58607, 13321, 17882, 46875, 1939, 54842, 42699, 30062, 50673, 38040, 25470, 24267, 61011, 16363, 20237, 40104, 11319, 32102, 35568, 55816, 27554, 47932, 51295, 6650, 24264, 61011, 16361, 20279, 40114, 11297, 32077, 35557, 55818, 27549, 47920, 51278, 6645, 43267, 63122, 1597, 37131, 8605, 61500, 32979, 21345, 58366, 45720, 17771, 5571, 42107, 29920, 2007, 54823, 26315, 14681, 51700, 39060, 11117, 64492, 35412, 23272, 60814, 48175, 19632, 8034, 45044, 32396, 12576, 49589, 36934, 8393, 62348, 33316, 21170, 58719, 46564, 17564, 28964, 49599, 4101, 24777, 45892, 970, 21180, 42266, 62958, 17507, 38109, 59325, 13830, 34536, 55662, 45667, 736, 54120, 41907, 28673, 49297, 37365, 26185, 13991, 34596, 22407, 9463, 62787, 17853, 6677, 60045, 48106};
                    RecordsJson = 3624938641726041654L;
                    getCvrMaskAnd = 4824876095871900143L;
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    init$0();
                    getGpoResponse = 0;
                    SdkCoreBusinessLogicModuleImpl = 1;
                    AlternateContactlessPaymentDataJson();
                    AlternateContactlessPaymentDataJson = -1253568119;
                    values = 520368560;
                    IccPrivateKeyCrtComponentsJson = 1133627914;
                    getAid = new byte[]{77};
                    SdkCoreBusinessLogicModuleImpl = (getGpoResponse + 19) % 128;
                }

                static void init$1() {
                    $$d = new byte[]{com.google.common.base.Ascii.EM, -31, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.DC4};
                    $$e = 75;
                }

                static void init$0() {
                    $$a = new byte[]{com.google.common.base.Ascii.US, -55, -84, 106, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5};
                    $$b = 18;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(7:(2:376|377)|378|379|380|(3:382|(2:384|(2:386|(2:388|(10:392|393|394|395|(1:397)|398|399|119|120|(0)(0)))(1:403))(1:404))(1:405)|401)|406|407) */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:122:0x17aa A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:123:0x17ab  */
                /* JADX WARN: Removed duplicated region for block: B:167:0x1cc3 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:550:0x1670 A[Catch: Exception -> 0x16a1, all -> 0x16bb, IOException -> 0x16c6, TryCatch #10 {all -> 0x16bb, blocks: (B:377:0x1312, B:379:0x131a, B:380:0x13ab, B:382:0x13fa, B:384:0x1416, B:386:0x143d, B:388:0x1468, B:390:0x1485, B:417:0x16a1, B:418:0x16ba, B:448:0x15e9, B:449:0x15ec, B:525:0x161c, B:527:0x162c, B:528:0x162d, B:532:0x1643, B:534:0x164a, B:535:0x164b, B:548:0x166a, B:550:0x1670, B:551:0x1671, B:569:0x1682, B:571:0x1688, B:572:0x1689), top: B:376:0x1312 }] */
                /* JADX WARN: Removed duplicated region for block: B:551:0x1671 A[Catch: Exception -> 0x16a1, all -> 0x16bb, IOException -> 0x16c6, TryCatch #10 {all -> 0x16bb, blocks: (B:377:0x1312, B:379:0x131a, B:380:0x13ab, B:382:0x13fa, B:384:0x1416, B:386:0x143d, B:388:0x1468, B:390:0x1485, B:417:0x16a1, B:418:0x16ba, B:448:0x15e9, B:449:0x15ec, B:525:0x161c, B:527:0x162c, B:528:0x162d, B:532:0x1643, B:534:0x164a, B:535:0x164b, B:548:0x166a, B:550:0x1670, B:551:0x1671, B:569:0x1682, B:571:0x1688, B:572:0x1689), top: B:376:0x1312 }] */
                /* JADX WARN: Removed duplicated region for block: B:571:0x1688 A[Catch: Exception -> 0x16a1, all -> 0x16bb, IOException -> 0x16c6, TryCatch #10 {all -> 0x16bb, blocks: (B:377:0x1312, B:379:0x131a, B:380:0x13ab, B:382:0x13fa, B:384:0x1416, B:386:0x143d, B:388:0x1468, B:390:0x1485, B:417:0x16a1, B:418:0x16ba, B:448:0x15e9, B:449:0x15ec, B:525:0x161c, B:527:0x162c, B:528:0x162d, B:532:0x1643, B:534:0x164a, B:535:0x164b, B:548:0x166a, B:550:0x1670, B:551:0x1671, B:569:0x1682, B:571:0x1688, B:572:0x1689), top: B:376:0x1312 }] */
                /* JADX WARN: Removed duplicated region for block: B:572:0x1689 A[Catch: Exception -> 0x16a1, all -> 0x16bb, IOException -> 0x16c6, TRY_LEAVE, TryCatch #10 {all -> 0x16bb, blocks: (B:377:0x1312, B:379:0x131a, B:380:0x13ab, B:382:0x13fa, B:384:0x1416, B:386:0x143d, B:388:0x1468, B:390:0x1485, B:417:0x16a1, B:418:0x16ba, B:448:0x15e9, B:449:0x15ec, B:525:0x161c, B:527:0x162c, B:528:0x162d, B:532:0x1643, B:534:0x164a, B:535:0x164b, B:548:0x166a, B:550:0x1670, B:551:0x1671, B:569:0x1682, B:571:0x1688, B:572:0x1689), top: B:376:0x1312 }] */
                /* JADX WARN: Type inference failed for: r10v48, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r15v10 */
                /* JADX WARN: Type inference failed for: r15v11 */
                /* JADX WARN: Type inference failed for: r15v12 */
                /* JADX WARN: Type inference failed for: r15v13, types: [int] */
                /* JADX WARN: Type inference failed for: r15v25 */
                /* JADX WARN: Type inference failed for: r15v26 */
                /* JADX WARN: Type inference failed for: r15v39 */
                /* JADX WARN: Type inference failed for: r15v52 */
                /* JADX WARN: Type inference failed for: r15v9 */
                /* JADX WARN: Type inference failed for: r1v124 */
                /* JADX WARN: Type inference failed for: r1v126 */
                /* JADX WARN: Type inference failed for: r1v499 */
                /* JADX WARN: Type inference failed for: r1v500 */
                /* JADX WARN: Type inference failed for: r1v56 */
                /* JADX WARN: Type inference failed for: r1v58 */
                /* JADX WARN: Type inference failed for: r1v59 */
                /* JADX WARN: Type inference failed for: r1v60 */
                /* JADX WARN: Type inference failed for: r1v61 */
                /* JADX WARN: Type inference failed for: r1v63 */
                /* JADX WARN: Type inference failed for: r1v74 */
                /* JADX WARN: Type inference failed for: r1v84 */
                /* JADX WARN: Type inference failed for: r1v85 */
                /* JADX WARN: Type inference failed for: r2v323 */
                /* JADX WARN: Type inference failed for: r2v324 */
                /* JADX WARN: Type inference failed for: r2v328, types: [java.lang.Class] */
                /* JADX WARN: Type inference failed for: r2v329 */
                /* JADX WARN: Type inference failed for: r2v330 */
                /* JADX WARN: Type inference failed for: r2v336 */
                /* JADX WARN: Type inference failed for: r2v340 */
                /* JADX WARN: Type inference failed for: r34v17 */
                /* JADX WARN: Type inference failed for: r34v26 */
                /* JADX WARN: Type inference failed for: r34v27 */
                /* JADX WARN: Type inference failed for: r34v28 */
                /* JADX WARN: Type inference failed for: r34v4 */
                /* JADX WARN: Type inference failed for: r36v1 */
                /* JADX WARN: Type inference failed for: r36v13 */
                /* JADX WARN: Type inference failed for: r36v2 */
                /* JADX WARN: Type inference failed for: r36v23 */
                /* JADX WARN: Type inference failed for: r36v24 */
                /* JADX WARN: Type inference failed for: r36v3 */
                /* JADX WARN: Type inference failed for: r36v4 */
                /* JADX WARN: Type inference failed for: r36v45 */
                /* JADX WARN: Type inference failed for: r36v46 */
                /* JADX WARN: Type inference failed for: r36v48 */
                /* JADX WARN: Type inference failed for: r36v49 */
                /* JADX WARN: Type inference failed for: r36v5 */
                /* JADX WARN: Type inference failed for: r36v50 */
                /* JADX WARN: Type inference failed for: r4v234, types: [java.lang.String[]] */
                /* JADX WARN: Type inference failed for: r4v235, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r6v250, types: [long] */
                /* JADX WARN: Type inference failed for: r6v251 */
                /* JADX WARN: Type inference failed for: r6v252 */
                /* JADX WARN: Type inference failed for: r6v254 */
                /* JADX WARN: Type inference failed for: r6v258 */
                /* JADX WARN: Type inference failed for: r6v408 */
                /* JADX WARN: Type inference failed for: r6v409 */
                /* JADX WARN: Type inference failed for: r6v410 */
                /* JADX WARN: Type inference failed for: r6v411 */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2, int i3) {
                    java.lang.Integer num;
                    int i4;
                    java.lang.Integer num2;
                    java.lang.Integer num3;
                    int i5;
                    java.lang.Object[] objArr;
                    char c;
                    int i6;
                    java.lang.Integer num4;
                    java.lang.Object[] objArr2;
                    int i7;
                    java.lang.Object[] objArr3;
                    int i8;
                    java.lang.Object[] objArr4;
                    int i9;
                    java.lang.Object[] objArr5;
                    char c2;
                    java.lang.Object obj;
                    java.util.Iterator it;
                    ?? r34;
                    ?? r36;
                    java.lang.Object obj2;
                    ?? r15;
                    ?? r2;
                    java.lang.String str;
                    java.lang.Process exec;
                    java.lang.Throwable th;
                    java.lang.Throwable cause;
                    java.lang.Object obj3;
                    java.lang.Object newInstance;
                    java.lang.Throwable th2;
                    java.lang.Throwable cause2;
                    java.lang.Integer num5;
                    java.lang.Object obj4;
                    java.lang.String str2;
                    int i10;
                    java.lang.InterruptedException interruptedException;
                    java.lang.Throwable th3;
                    java.lang.String str3;
                    java.lang.String str4;
                    java.lang.Object[] objArr6;
                    int i11;
                    java.lang.Integer num6;
                    java.lang.String str5;
                    java.lang.Object obj5;
                    java.lang.Integer num7;
                    long j;
                    java.lang.Integer num8;
                    java.lang.Object[] objArr7;
                    int i12;
                    int i13;
                    java.lang.Object[] objArr8;
                    int i14;
                    java.lang.Object[] objArr9;
                    int i15;
                    java.lang.Object obj6;
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a((char) (59441 - android.text.TextUtils.getTrimmedLength("")), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 34, 109 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr10);
                    java.lang.String str6 = (java.lang.String) objArr10[0];
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a((char) android.text.TextUtils.indexOf("", ""), 7 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.view.Gravity.getAbsoluteGravity(0, 0) + 143, objArr11);
                    java.lang.String str7 = (java.lang.String) objArr11[0];
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a((char) android.graphics.Color.green(0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, 166 - android.text.TextUtils.indexOf("", "", 0), objArr12);
                    java.lang.String str8 = (java.lang.String) objArr12[0];
                    int i16 = -1347122530;
                    java.lang.Integer num9 = -604620973;
                    try {
                        if (context == null) {
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            a((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.view.View.MeasureSpec.getMode(0) + 12, (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr13);
                            java.lang.Object[] objArr14 = {(java.lang.String) objArr13[0]};
                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num9);
                            java.lang.Object obj8 = obj7;
                            if (obj7 == null) {
                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36, 3161 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33098));
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                b((byte) $$b, (byte) 34, (short) 35, objArr15);
                                java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num9, method);
                                obj8 = method;
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, objArr14)).longValue();
                            long j2 = i;
                            long j3 = ~j2;
                            long j4 = ((628 * longValue) - 121296367496L) + ((longValue | j2 | 193147081) * (-627)) + (((~((~longValue) | j2)) | (-193147082)) * (-627)) + (((~(longValue | j3)) | (~((-193147082) | j2))) * 627) + 1100617820;
                            int i17 = (int) (j4 >> 32);
                            int i18 = ~i;
                            if (((i17 & ((((~((-18329467) | i18)) | 132384) * (-108)) + 412447580 + (((~((-1455555878) | i)) | (-1473752960) | (~(i18 | 1455555877))) * 54) + (((-1473752960) | i) * 54))) | (((int) j4) & (((~((-1497166483) | i)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 620451885 + (((~((-1497166483) | i18)) | 42077288) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING)))) != 0) {
                                objArr7 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 50}, null, null, new int[1]};
                                java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-336599041) | i18)) | (~((-679904769) | i18))) * (-184)) + 463683272) + ((((~((-686720837) | i18)) | 6816068) | (~((-343415109) | i18))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 687703840)};
                                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj9 == null) {
                                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('b' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2713 - android.graphics.Color.blue(0), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                    byte b = (byte) $$b;
                                    byte b2 = $$a[41];
                                    num8 = 269015277;
                                    num7 = 16;
                                    j = j3;
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    b(b, b2, b2, objArr17);
                                    java.lang.reflect.Method method2 = cls2.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                                    obj6 = method2;
                                } else {
                                    num7 = 16;
                                    j = j3;
                                    num8 = 269015277;
                                    obj6 = obj9;
                                }
                                i12 = 0;
                                ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr16)).intValue();
                            } else {
                                num7 = 16;
                                j = j3;
                                num8 = 269015277;
                                objArr7 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                                java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((i | (-8259)) * (-676)) + 944896912 + (((~(1004224573 | i18)) | 8258) * 676) + (((~((-25911372) | i18)) | 25903113 | (~(1004232831 | i))) * 676))};
                                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj11 = obj10;
                                if (obj10 == null) {
                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, (android.os.Process.myTid() >> 22) + 2713, (char) (android.os.Process.myTid() >> 22));
                                    byte b3 = (byte) $$b;
                                    byte b4 = $$a[41];
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    b(b3, b4, b4, objArr19);
                                    java.lang.reflect.Method method3 = cls3.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                                    obj11 = method3;
                                }
                                i12 = 0;
                                ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr18)).intValue();
                            }
                            if (((int[]) objArr7[1])[i12] != i) {
                                return objArr7;
                            }
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            c("\udc04ଲ\udc2bꙭ쏆駧荎蒹检檋첣㽕딒᷎\u0016\uf3c5쉺쁫믱ꚩິ璿\ueebd奯", (android.widget.ExpandableListView.getPackedPositionForGroup(i12) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i12) == 0L ? 0 : -1)), objArr20);
                            java.lang.Object[] objArr21 = {(java.lang.String) objArr20[i12]};
                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num9);
                            java.lang.Object obj13 = obj12;
                            if (obj12 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 36, 3161 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 33099));
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                b((byte) $$b, (byte) 34, (short) 35, objArr22);
                                java.lang.reflect.Method method4 = cls4.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num9, method4);
                                obj13 = method4;
                            }
                            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr21)).longValue();
                            long j5 = (-494468589) | longValue2;
                            long j6 = ((-753) * longValue2) + 373323783940L + (((~(j2 | (-494468589))) | (~j5) | (~(longValue2 | j2))) * (-754)) + (((~(j5 | j2)) | (~(longValue2 | j | 494468588))) * (-754)) + ((j | (-494468589)) * 754) + 413002150;
                            int i19 = ~((-448849305) | i18);
                            if (((((int) (j6 >> 32)) & (((1886075715 | i19) * 764) + 2113104166 + (((~(1886075715 | i18)) | (-2062286812)) * (-1528)) + ((i19 | (-1789648604)) * 764))) | (((int) j6) & (((((~(1179524057 | i18)) | (-1331575770)) * (-241)) - 1329895518) + (((~((-152051713) | i18)) | 1073873417) * 241)))) != 0) {
                                i13 = i;
                                objArr8 = new java.lang.Object[]{new int[]{i13}, new int[]{i13 ^ 60}, null, null, new int[1]};
                                java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i3), num7, java.lang.Integer.valueOf(((((~((-701264915) | i18)) | (-328871031)) * (-983)) - 1792562277) + (((~((-328871031) | i18)) | 303171684) * 983))};
                                java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj15 = obj14;
                                if (obj14 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getCapsMode("", 0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                                    byte b5 = (byte) $$b;
                                    byte b6 = $$a[41];
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    b(b5, b6, b6, objArr24);
                                    java.lang.reflect.Method method5 = cls5.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method5);
                                    obj15 = method5;
                                }
                                i14 = 0;
                                ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr23)).intValue();
                            } else {
                                i13 = i;
                                objArr8 = new java.lang.Object[]{new int[]{i13}, new int[]{i13}, null, null, new int[1]};
                                java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-332634831) | i13)) | (~(697501114 | i18))) * (-1808)) + 1903497000 + (((~((-26411147) | i13)) | (~(1003724798 | i18))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~((-697501115) | i13)) | 306223684 | (~(332634830 | i18))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                                java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj17 = obj16;
                                if (obj16 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2713 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                    byte b7 = (byte) $$b;
                                    byte b8 = $$a[41];
                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                    b(b7, b8, b8, objArr26);
                                    java.lang.reflect.Method method6 = cls6.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method6);
                                    obj17 = method6;
                                }
                                i14 = 0;
                                ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(null, objArr25)).intValue();
                            }
                            if (((int[]) objArr8[1])[i14] != i13) {
                                return objArr8;
                            }
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            c("짿䴥짐\ue06d⸝琤\uebe9\uec19紮Ⳗⅱ垼ꃫ寈\ued8a魮힀虴噛츚᭝㊦ͽㆃ仮秗쾱敯\uf5b0ꐀ렁ꡢ㥙킿敆Ꮲ氛Ῠ톱䚌", (android.util.TypedValue.complexToFraction(i14, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i14, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr27);
                            java.lang.Object[] objArr28 = {(java.lang.String) objArr27[i14]};
                            java.lang.Integer num10 = num8;
                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                            java.lang.Object obj19 = obj18;
                            if (obj18 == null) {
                                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 3161 - android.view.View.MeasureSpec.getMode(0), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 33099));
                                byte[] bArr2 = $$a;
                                byte b9 = bArr2[14];
                                byte b10 = bArr2[49];
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                b(b9, b10, (short) (b10 | 9), objArr29);
                                java.lang.reflect.Method method7 = cls7.getMethod((java.lang.String) objArr29[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, method7);
                                obj19 = method7;
                            }
                            long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr28)).longValue();
                            long j7 = ~longValue3;
                            long j8 = (185 * longValue3) + 145713110232L + ((796246503 | longValue3) * (-368)) + (((-796246504) | j7 | j) * 184) + (((~(longValue3 | (-796246504))) | (~(j7 | 796246503)) | (~(j | (-796246504)))) * 184) + 1791681407;
                            if (((((int) (j8 >> 32)) & ((((75563040 | r2) * (-814)) - 1428968041) + (((~(1227150213 | i13)) | (~((-210076198) | i18)) | 1092637056) * 407) + (((~((-1227150214) | i13)) | 1092637056 | (~(210076197 | i13))) * 407))) | (((int) j8) & (((~((-17408138) | i13)) * 623) + 1767142862 + ((1084228896 | i18) * (-623)) + (((~(1252023584 | i13)) | 17408137 | (~((-185202826) | i13))) * 623)))) != 0) {
                                objArr9 = new java.lang.Object[]{new int[]{i13}, new int[]{i13 ^ 80}, null, null, new int[1]};
                                int i20 = ~(115067337 | i18);
                                java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(i3), num7, java.lang.Integer.valueOf((((~((-115067338) | i13)) | (~(915068607 | i18)) | i20) * (-516)) + 546341040 + (((~((-109756554) | i13)) | (~((-805312055) | i18))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((i20 | 805312054) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))};
                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj21 = obj20;
                                if (obj20 == null) {
                                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) (android.view.MotionEvent.axisFromString("") + 1));
                                    byte b11 = (byte) $$b;
                                    byte b12 = $$a[41];
                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                    b(b11, b12, b12, objArr31);
                                    java.lang.reflect.Method method8 = cls8.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method8);
                                    obj21 = method8;
                                }
                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr30)).intValue();
                                i15 = 0;
                                ((int[]) objArr9[4])[0] = intValue;
                            } else {
                                objArr9 = new java.lang.Object[]{new int[]{i13}, new int[]{i13}, null, null, new int[1]};
                                java.lang.Object[] objArr32 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-674979376) | i13)) | 672144422) * (-283)) - 2026520950) + ((~((-2834954) | i13)) * 283))};
                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj23 = obj22;
                                if (obj22 == null) {
                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                    byte b13 = (byte) $$b;
                                    byte b14 = $$a[41];
                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                    b(b13, b14, b14, objArr33);
                                    java.lang.reflect.Method method9 = cls9.getMethod((java.lang.String) objArr33[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method9);
                                    obj23 = method9;
                                }
                                i15 = 0;
                                ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr32)).intValue();
                            }
                            if (((int[]) objArr9[1])[i15] != i13) {
                                return objArr9;
                            }
                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                            a((char) android.text.TextUtils.indexOf("", "", i15, i15), android.text.TextUtils.getCapsMode("", i15, i15) + 42, android.graphics.ImageFormat.getBitsPerPixel(i15) + 13, objArr34);
                            java.lang.Object[] objArr35 = {(java.lang.String) objArr34[i15]};
                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                            java.lang.Object obj25 = obj24;
                            if (obj24 == null) {
                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.KeyEvent.getDeadChar(i15, i15), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3161, (char) (android.view.MotionEvent.axisFromString("") + 33100));
                                byte[] bArr3 = $$a;
                                byte b15 = bArr3[14];
                                byte b16 = bArr3[49];
                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                b(b15, b16, (short) (b16 | 9), objArr36);
                                java.lang.reflect.Method method10 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, method10);
                                obj25 = method10;
                            }
                            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr35)).longValue();
                            long j9 = (382 * longValue4) + 397385914660L + ((j2 | longValue4 | 1045752406) * (-381)) + (((~(1045752406 | (~longValue4))) | (~(j | longValue4)) | (~((-1045752407) | longValue4))) * 381) + ((~(longValue4 | 1045752406)) * 381) + 2041187310;
                            if (((((int) (j9 >> 32)) & (((((~(2112596463 | i13)) | (~((-745144422) | i18))) * (-318)) - 672338402) + (((~((-1013614830) | i13)) | 268470408) * (-318)) + (((~(1013614829 | i13)) | 1844126055) * 318))) | (((int) j9) & ((((~((-964259875) | i18)) | 1893481011) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1453938690 + (((~((-153174017) | i18)) | (~(2046655027 | i13))) * (-519)) + (((~(1893481011 | i13)) | 964259874) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE)))) != 0) {
                                java.lang.Object[] objArr37 = {new int[]{i13}, new int[]{i13 ^ 90}, null, null, new int[1]};
                                java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i3), num7, java.lang.Integer.valueOf(((((~(1056091084 | i18)) | android.R.interpolator.decelerate_cubic) * (-160)) - 1925496088) + (((~(25955139 | i18)) | 1056091084) * 160))};
                                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj27 = obj26;
                                if (obj26 == null) {
                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2713 - android.text.TextUtils.getTrimmedLength(""), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                    byte b17 = (byte) $$b;
                                    byte b18 = $$a[41];
                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                    b(b17, b18, b18, objArr39);
                                    java.lang.reflect.Method method11 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method11);
                                    obj27 = method11;
                                }
                                ((int[]) objArr37[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr38)).intValue();
                                return objArr37;
                            }
                            java.lang.Object[] objArr40 = {new int[]{i13}, new int[]{i13}, null, null, new int[1]};
                            java.lang.Object[] objArr41 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((r1 * 495) - 873068231) + (((~(367505570 | i18)) | 90611874) * 495))};
                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj29 = obj28;
                            if (obj28 == null) {
                                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getCapsMode("", 0, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                byte b19 = (byte) $$b;
                                byte b20 = $$a[41];
                                java.lang.Object[] objArr42 = new java.lang.Object[1];
                                b(b19, b20, b20, objArr42);
                                java.lang.reflect.Method method12 = cls12.getMethod((java.lang.String) objArr42[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method12);
                                obj29 = method12;
                            }
                            ((int[]) objArr40[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr41)).intValue();
                            return objArr40;
                        }
                        int i21 = i;
                        java.lang.Integer num11 = 269015277;
                        try {
                            java.lang.Object[] objArr43 = new java.lang.Object[1];
                            a((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 23 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 53 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr43);
                            java.lang.Class<?> cls13 = java.lang.Class.forName((java.lang.String) objArr43[0]);
                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                            a((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 14, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 77, objArr44);
                            java.lang.String str9 = (java.lang.String) cls13.getMethod((java.lang.String) objArr44[0], null).invoke(context, null);
                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                            a((char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 23 - android.graphics.Color.alpha(0), 54 - android.text.TextUtils.getTrimmedLength(""), objArr45);
                            java.lang.Class<?> cls14 = java.lang.Class.forName((java.lang.String) objArr45[0]);
                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                            a((char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.getSize(0) + 18, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 91, objArr46);
                            java.lang.Object invoke = cls14.getMethod((java.lang.String) objArr46[0], null).invoke(context, null);
                            int indexOf = ((java.lang.String) java.lang.Class.forName(str6).getField(str7).get(invoke)).indexOf(str9);
                            if (indexOf > 0) {
                                java.lang.String str10 = (java.lang.String) java.lang.Class.forName(str6).getField(str7).get(invoke);
                                if (str10.length() >= 16) {
                                    int i22 = 0;
                                    for (int i23 = 16; i22 <= str10.length() - i23; i23 = 16) {
                                        java.lang.Object[] objArr47 = {str10.substring(i22, i22 + 16), 931995};
                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                        if (obj30 == null) {
                                            str5 = str10;
                                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 28, 2595 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                                            byte b21 = $$a[41];
                                            num = num11;
                                            num3 = num9;
                                            java.lang.Object[] objArr48 = new java.lang.Object[1];
                                            b(b21, (byte) (b21 | 34), (short) 653, objArr48);
                                            java.lang.reflect.Method method13 = cls15.getMethod((java.lang.String) objArr48[0], java.lang.String.class, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method13);
                                            obj5 = method13;
                                        } else {
                                            num = num11;
                                            str5 = str10;
                                            num3 = num9;
                                            obj5 = obj30;
                                        }
                                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr47)).longValue();
                                        long j10 = i21;
                                        int i24 = indexOf;
                                        r34 = -627;
                                        r34 = -627;
                                        long j11 = (628 * longValue5) + 601603068760L + ((longValue5 | j10 | (-957966671)) * (-627)) + (((~((~longValue5) | j10)) | 957966670) * (-627)) + (((~((~j10) | longValue5)) | (~(957966670 | j10))) * 627) + 299133854;
                                        int i25 = ~(1976342075 | i21);
                                        int i26 = ~i21;
                                        if (((((int) (j11 >> 32)) & (((536870928 | i25) * (-196)) + 621242622 + ((i25 | 1439471147) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))) | (((int) j11) & ((((277872640 | i21) * 988) - 23927783) + (((~(1559253034 | i26)) | 17107457) * (-1976)) + (((~(i26 | 1298487851)) | (~((-1298487852) | i21)) | 277872640) * 988)))) == -725904754) {
                                            objArr6 = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                            java.lang.String str11 = (java.lang.String) java.lang.Class.forName(str6).getField(str7).get(invoke);
                                            ((int[]) objArr6[0])[0] = i21;
                                            ((int[]) objArr6[1])[0] = i21 ^ 20;
                                            java.lang.Object[] objArr49 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-478488911) | i21)) | 551647034) * (-366)) - 167519020) + (((~((-470026309) | i21)) | 543184432) * 366))};
                                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            java.lang.Object obj32 = obj31;
                                            if (obj31 == null) {
                                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2713 - android.text.TextUtils.indexOf("", ""), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                byte b22 = (byte) $$b;
                                                byte b23 = $$a[41];
                                                java.lang.Object[] objArr50 = new java.lang.Object[1];
                                                b(b22, b23, b23, objArr50);
                                                java.lang.reflect.Method method14 = cls16.getMethod((java.lang.String) objArr50[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method14);
                                                obj32 = method14;
                                            }
                                            ((int[]) objArr6[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr49)).intValue();
                                            i11 = i21;
                                            num6 = -1347122530;
                                            objArr = objArr6;
                                            num2 = num6;
                                            i4 = i11;
                                            i6 = 1;
                                            c = 0;
                                            if (((int[]) objArr[i6])[c] == i4) {
                                                return objArr;
                                            }
                                            int[] iArr = new int[i6];
                                            int[] iArr2 = new int[i6];
                                            iArr[c] = i4;
                                            iArr2[c] = i4;
                                            java.lang.Object[] objArr51 = {iArr, iArr2, null, null, new int[i6]};
                                            int i27 = ~i4;
                                            int i28 = ~(294538971 | i27);
                                            java.lang.Object[] objArr52 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(735596973 | i27)) | 268832338) * (-1188)) - 2118217254) + (((~((-735596974) | i4)) | 268832338 | i28) * 594) + ((i28 | (~((-735596974) | i27)) | 709890340) * 594))};
                                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                            java.lang.Object obj34 = obj33;
                                            if (obj33 == null) {
                                                java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 2713 - android.view.View.resolveSize(0, 0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                byte b24 = (byte) $$b;
                                                byte b25 = $$a[41];
                                                java.lang.Object[] objArr53 = new java.lang.Object[1];
                                                b(b24, b25, b25, objArr53);
                                                java.lang.reflect.Method method15 = cls17.getMethod((java.lang.String) objArr53[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method15);
                                                obj34 = method15;
                                            }
                                            ((int[]) objArr51[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr52)).intValue();
                                            if (((int[]) objArr51[1])[0] != i4) {
                                                return objArr51;
                                            }
                                            if ((i2 & 1) == 0) {
                                                java.lang.Object[] objArr54 = new java.lang.Object[1];
                                                a((char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 13 - (android.os.Process.myPid() >> 22), 220 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr54);
                                                try {
                                                    java.lang.Object[] objArr55 = {(java.lang.String) objArr54[0]};
                                                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                                                    a((char) android.text.TextUtils.getOffsetBefore("", 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22, 54 - android.view.KeyEvent.getDeadChar(0, 0), objArr56);
                                                    java.lang.Class<?> cls18 = java.lang.Class.forName((java.lang.String) objArr56[0]);
                                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                    a((char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 16 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, objArr57);
                                                    java.lang.Object invoke2 = cls18.getMethod((java.lang.String) objArr57[0], java.lang.String.class).invoke(context, objArr55);
                                                    if (invoke2 != null) {
                                                        java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                        a((char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 53188), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 38, 249 - android.graphics.Color.argb(0, 0, 0, 0), objArr58);
                                                        java.lang.Class<?> cls19 = java.lang.Class.forName((java.lang.String) objArr58[0]);
                                                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                        a((char) (12268 - android.graphics.Color.red(0)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, 285 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr59);
                                                        java.util.List list = (java.util.List) cls19.getMethod((java.lang.String) objArr59[0], null).invoke(invoke2, null);
                                                        if (list != null) {
                                                            java.util.Iterator it2 = list.iterator();
                                                            while (it2.hasNext()) {
                                                                java.lang.Object next = it2.next();
                                                                java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                                c("ृƿढ곽㊁梽解踕붜怊㷭㗹恀\u175c\uf157拾᜶쫭䪝걙\udbc0縼ῴ受蹜㕍팬ݹ㔗\ue8bd꒘쨪臨", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr60);
                                                                java.lang.Class<?> cls20 = java.lang.Class.forName((java.lang.String) objArr60[0]);
                                                                java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                                a((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 14 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.view.KeyEvent.normalizeMetaState(0) + 77, objArr61);
                                                                java.lang.String str12 = (java.lang.String) cls20.getMethod((java.lang.String) objArr61[0], null).invoke(next, null);
                                                                java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                                a((char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 53188), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 37, android.graphics.Color.alpha(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, objArr62);
                                                                java.lang.Class<?> cls21 = java.lang.Class.forName((java.lang.String) objArr62[0]);
                                                                java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                                a((char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 60581), 16 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 301 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr63);
                                                                if (((java.lang.Boolean) cls21.getMethod((java.lang.String) objArr63[0], java.lang.String.class).invoke(invoke2, str12)).booleanValue()) {
                                                                    if (str12.length() >= 20) {
                                                                        int i29 = 0;
                                                                        while (i29 <= str12.length() - 20) {
                                                                            java.lang.Object[] objArr64 = {str12.substring(i29, i29 + 20), 931995};
                                                                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                            java.lang.Object obj36 = obj35;
                                                                            if (obj35 == null) {
                                                                                java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 28, android.text.TextUtils.indexOf("", "", 0, 0) + 2594, (char) android.view.KeyEvent.keyCodeFromString(""));
                                                                                byte b26 = $$a[41];
                                                                                java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                                                b(b26, (byte) (b26 | 34), (short) 653, objArr65);
                                                                                java.lang.reflect.Method method16 = cls22.getMethod((java.lang.String) objArr65[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method16);
                                                                                obj36 = method16;
                                                                            }
                                                                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj36).invoke(null, objArr64)).longValue();
                                                                            long j12 = i4;
                                                                            long j13 = ~j12;
                                                                            java.lang.Object obj37 = invoke2;
                                                                            java.util.Iterator it3 = it2;
                                                                            java.lang.String str13 = str12;
                                                                            int i30 = i29;
                                                                            long j14 = (603 * longValue6) + 221835940388L + (((~(j13 | (-734556095))) | longValue6) * (-602)) + (((~((-734556095) | (~longValue6))) | (~((-734556095) | j12)) | (~(734556094 | j13 | longValue6))) * (-301)) + ((~(j13 | longValue6)) * 301) + 522544430;
                                                                            if (((((int) j14) & (((((~(1870204541 | i4)) | (-432978132)) * (-964)) - 1207232115) + (((~(1870204541 | i27)) | (-2147467008)) * (-964)))) | (((int) (j14 >> 32)) & ((((((~((-383697598) | i27)) | 307675797) | (~((-1744902209) | i4))) * 717) - 1615658048) + (((~((-383697598) | i4)) | (~((-1744902209) | i27)) | 307675797) * 717)))) == 1245577864) {
                                                                                objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 70}, null, null, new int[1]};
                                                                                java.lang.Object[] objArr66 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((-16908728) | i27) * (-369)) - 1101790064) + (((~((-1048421953) | i27)) | (-18286008)) * (-369)) + (((~(1048421952 | i4)) | (-1065330680) | (~((-1377281) | i27))) * 369))};
                                                                                java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                                                java.lang.Object obj39 = obj38;
                                                                                if (obj38 == null) {
                                                                                    java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2713, (char) android.graphics.Color.green(0));
                                                                                    byte b27 = (byte) $$b;
                                                                                    byte b28 = $$a[41];
                                                                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                                                    b(b27, b28, b28, objArr67);
                                                                                    java.lang.reflect.Method method17 = cls23.getMethod((java.lang.String) objArr67[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method17);
                                                                                    obj39 = method17;
                                                                                }
                                                                                c2 = 0;
                                                                                ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr66)).intValue();
                                                                                if (((int[]) objArr5[1])[c2] != i4) {
                                                                                    return objArr5;
                                                                                }
                                                                            } else {
                                                                                i29 = i30 + 1;
                                                                                invoke2 = obj37;
                                                                                it2 = it3;
                                                                                str12 = str13;
                                                                            }
                                                                        }
                                                                    }
                                                                    obj = invoke2;
                                                                    it = it2;
                                                                } else {
                                                                    obj = invoke2;
                                                                    it = it2;
                                                                }
                                                                invoke2 = obj;
                                                                it2 = it;
                                                            }
                                                        }
                                                    }
                                                    objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                                    java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-794911596) | i27)) | (~((-235224350) | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1545865818 + (((~((-269333) | i27)) | (~((-559956579) | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                                                    java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                    java.lang.Object obj41 = obj40;
                                                    if (obj40 == null) {
                                                        java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, 2713 - (android.os.Process.myPid() >> 22), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                        byte b29 = (byte) $$b;
                                                        byte b30 = $$a[41];
                                                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                        b(b29, b30, b30, objArr69);
                                                        java.lang.reflect.Method method18 = cls24.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method18);
                                                        obj41 = method18;
                                                    }
                                                    c2 = 0;
                                                    ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr68)).intValue();
                                                    if (((int[]) objArr5[1])[c2] != i4) {
                                                    }
                                                } catch (java.lang.Throwable th4) {
                                                    java.lang.Throwable cause3 = th4.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th4;
                                                }
                                            }
                                            java.lang.Object[] objArr70 = new java.lang.Object[1];
                                            a((char) android.graphics.Color.red(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 13, android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr70);
                                            java.lang.Object[] objArr71 = {(java.lang.String) objArr70[0]};
                                            java.lang.Integer num12 = num3;
                                            java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num12);
                                            java.lang.Object obj43 = obj42;
                                            if (obj42 == null) {
                                                java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3161, (char) (33099 - android.text.TextUtils.indexOf("", "")));
                                                java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                b((byte) $$b, (byte) 34, (short) 35, objArr72);
                                                java.lang.reflect.Method method19 = cls25.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num12, method19);
                                                obj43 = method19;
                                            }
                                            long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj43).invoke(null, objArr71)).longValue();
                                            long j15 = ~longValue7;
                                            long j16 = i4;
                                            java.lang.Integer num13 = num2;
                                            long j17 = ((-68) * longValue7) + 30407879600L + (((~(longValue7 | 434398280 | j16)) | (~((-434398281) | j15 | j16))) * 69) + (((~((-434398281) | longValue7)) | (~((-434398281) | j16)) | (~(longValue7 | j16))) * (-69)) + ((~(434398280 | j15)) * 69) + 473072458;
                                            int i31 = ~((-1162414993) | i4);
                                            if (((((int) (j17 >> 32)) & ((((~(1977183181 | i4)) | 539956770) * (-668)) + 1239253798 + (((~(539956770 | i4)) | 1977183181) * 1336) + ((1979678703 | i4) * 668))) | (((int) j17) & ((((~(1162414992 | i4)) | (-1432963994) | (~(274811417 | i4))) * (-880)) + 818884229 + (((~(1162414992 | i27)) | (-274811418) | i31) * (-880)) + (i31 * 880)))) != 0) {
                                                objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 50}, null, null, new int[1]};
                                                java.lang.Object[] objArr73 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-411963009) | i27)) | 618172936) * (-90)) + 141613168 + (((~((-411963009) | i4)) | (-1021222537)) * (-45)) + (((~((-618172937) | i4)) | (-411963009) | (~(618172936 | i27))) * 45))};
                                                num4 = num13;
                                                java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                                java.lang.Object obj45 = obj44;
                                                if (obj44 == null) {
                                                    java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, 2713 - android.view.View.resolveSize(0, 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                                    byte b31 = (byte) $$b;
                                                    byte b32 = $$a[41];
                                                    java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                    b(b31, b32, b32, objArr74);
                                                    java.lang.reflect.Method method20 = cls26.getMethod((java.lang.String) objArr74[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, method20);
                                                    obj45 = method20;
                                                }
                                                i7 = 0;
                                                ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj45).invoke(null, objArr73)).intValue();
                                            } else {
                                                num4 = num13;
                                                objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                                int i32 = ~((-139482177) | i4);
                                                java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-881797928) | i27)) | 872942086 | i32) * (-713)) + 1041662 + (i32 * 1426) + ((~((-148338018) | i27)) * 713))};
                                                java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                                java.lang.Object obj47 = obj46;
                                                if (obj46 == null) {
                                                    java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2713, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                                    byte b33 = (byte) $$b;
                                                    byte b34 = $$a[41];
                                                    java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                    b(b33, b34, b34, objArr76);
                                                    java.lang.reflect.Method method21 = cls27.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, method21);
                                                    obj47 = method21;
                                                }
                                                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj47).invoke(null, objArr75)).intValue();
                                                i7 = 0;
                                                ((int[]) objArr2[4])[0] = intValue2;
                                            }
                                            if (((int[]) objArr2[1])[i7] != i4) {
                                                return objArr2;
                                            }
                                            java.lang.Object[] objArr77 = new java.lang.Object[1];
                                            c("\udc04ଲ\udc2bꙭ쏆駧荎蒹检檋첣㽕딒᷎\u0016\uf3c5쉺쁫믱ꚩິ璿\ueebd奯", (android.util.TypedValue.complexToFloat(i7) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(i7) == 0.0f ? 0 : -1)), objArr77);
                                            java.lang.Object[] objArr78 = {(java.lang.String) objArr77[i7]};
                                            java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num12);
                                            java.lang.Object obj49 = obj48;
                                            if (obj48 == null) {
                                                java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.blue(i7), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i7) + 3162, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i7) + 33100));
                                                java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                b((byte) $$b, (byte) 34, (short) 35, objArr79);
                                                java.lang.reflect.Method method22 = cls28.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num12, method22);
                                                obj49 = method22;
                                            }
                                            long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj49).invoke(null, objArr78)).longValue();
                                            long j18 = ~j16;
                                            long j19 = ~longValue8;
                                            long j20 = (-518439236) | j18;
                                            java.lang.Integer num14 = num4;
                                            long j21 = (((-903) * longValue8) - 469187508580L) + (((~(j16 | 518439235)) | (~(j18 | longValue8))) * (-1808)) + (((~(518439235 | j19 | j16)) | (~(j20 | longValue8))) * 904) + (((~(longValue8 | 518439235)) | (~(j19 | j16)) | (~j20)) * 904) + 1425909974;
                                            if (((((int) j21) & ((((~(344336577 | i27)) | (~((-272577) | i4))) * (-831)) + 2135237870 + ((~((-1092617257) | i4)) * (-1662)) + (((~(1092889832 | i27)) | (~((-1092889833) | i4)) | (~((-344336578) | i4))) * 831))) | (((int) (j21 >> 32)) & (((((~((-1184000457) | i27)) | 101870016) * (-241)) - 1898946200) + (((~((-1082130441) | i27)) | 151355938) * 241)))) != 0) {
                                                objArr3 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 60}, null, null, new int[1]};
                                                java.lang.Object[] objArr80 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((541482870 | i4) * 614) - 1696473460) + (((~((-785654976) | i27)) | 541328438 | (~(244480969 | i27))) * (-1228)) + (((~((-244326538) | i27)) | (~(785809407 | i27))) * 614))};
                                                java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num14);
                                                java.lang.Object obj51 = obj50;
                                                if (obj50 == null) {
                                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, android.view.KeyEvent.keyCodeFromString("") + 2713, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                    byte b35 = (byte) $$b;
                                                    byte b36 = $$a[41];
                                                    java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                    b(b35, b36, b36, objArr81);
                                                    java.lang.reflect.Method method23 = cls29.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num14, method23);
                                                    obj51 = method23;
                                                }
                                                i8 = 0;
                                                ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj51).invoke(null, objArr80)).intValue();
                                            } else {
                                                objArr3 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                                int i33 = (~((-553690538) | i4)) | 41097;
                                                java.lang.Object[] objArr82 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((i33 * 992) + 1183815944 + ((i33 | (~(1030094847 | i27))) * (-496)) + ((476445407 | i4) * 496))};
                                                java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num14);
                                                java.lang.Object obj53 = obj52;
                                                if (obj52 == null) {
                                                    java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2713, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                    byte b37 = (byte) $$b;
                                                    byte b38 = $$a[41];
                                                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                    b(b37, b38, b38, objArr83);
                                                    java.lang.reflect.Method method24 = cls30.getMethod((java.lang.String) objArr83[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num14, method24);
                                                    obj53 = method24;
                                                }
                                                int intValue3 = ((java.lang.Integer) ((java.lang.reflect.Method) obj53).invoke(null, objArr82)).intValue();
                                                i8 = 0;
                                                ((int[]) objArr3[4])[0] = intValue3;
                                            }
                                            if (((int[]) objArr3[1])[i8] != i4) {
                                                return objArr3;
                                            }
                                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                                            c("짿䴥짐\ue06d⸝琤\uebe9\uec19紮Ⳗⅱ垼ꃫ寈\ued8a魮힀虴噛츚᭝㊦ͽㆃ仮秗쾱敯\uf5b0ꐀ렁ꡢ㥙킿敆Ꮲ氛Ῠ톱䚌", android.view.ViewConfiguration.getPressedStateDuration() >> 16, objArr84);
                                            java.lang.Object[] objArr85 = {(java.lang.String) objArr84[i8]};
                                            java.lang.Integer num15 = num;
                                            java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num15);
                                            java.lang.Object obj55 = obj54;
                                            if (obj54 == null) {
                                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.graphics.ImageFormat.getBitsPerPixel(i8), android.text.TextUtils.getTrimmedLength("") + 3161, (char) (33099 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                                byte[] bArr4 = $$a;
                                                byte b39 = bArr4[14];
                                                byte b40 = bArr4[49];
                                                java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                b(b39, b40, (short) (b40 | 9), objArr86);
                                                java.lang.reflect.Method method25 = cls31.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num15, method25);
                                                obj55 = method25;
                                            }
                                            long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj55).invoke(null, objArr85)).longValue();
                                            long j22 = ~longValue9;
                                            long j23 = 47088277 | j22;
                                            long j24 = ((-496) * longValue9) + 23355785888L + ((~j23) * 497) + (((~(j23 | j16)) | (~(j22 | j18 | (-47088278)))) * 497) + (((~(longValue9 | 47088277)) | (~(47088277 | j18)) | (~((-47088278) | j22 | j16))) * 497) + 1042523181;
                                            if (((((int) j24) & (((((-2181634) | i4) * (-627)) - 635053948) + (((~(1646383029 | i4)) | 209156619) * (-627)) + (((~((-1646383030) | i27)) | (~(209156619 | i4))) * 627))) | (((int) (j24 >> 32)) & (((((~(376303253 | i27)) | (-2122182358)) * 98) - 1671120042) + (((~((-1813529665) | i27)) | 376303253 | (~(1813529664 | i4))) * (-49)) + (((~(376303253 | i4)) | 308652693) * 49)))) != 0) {
                                                objArr4 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 80}, null, null, new int[1]};
                                                java.lang.Object[] objArr87 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((971996736 | r2) * 764) - 948477592) + (((~(971996736 | i27)) | 34603016) * (-1528)) + (((~(58139208 | i27)) | 983063560) * 764))};
                                                java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num14);
                                                java.lang.Object obj57 = obj56;
                                                if (obj56 == null) {
                                                    java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49, android.text.TextUtils.indexOf("", "", 0, 0) + 2713, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                    byte b41 = (byte) $$b;
                                                    byte b42 = $$a[41];
                                                    java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                    b(b41, b42, b42, objArr88);
                                                    java.lang.reflect.Method method26 = cls32.getMethod((java.lang.String) objArr88[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num14, method26);
                                                    obj57 = method26;
                                                }
                                                int intValue4 = ((java.lang.Integer) ((java.lang.reflect.Method) obj57).invoke(null, objArr87)).intValue();
                                                i9 = 0;
                                                ((int[]) objArr4[4])[0] = intValue4;
                                            } else {
                                                objArr4 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                                java.lang.Object[] objArr89 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-305874476) | i4)) | 724261469) * (-366)) + 1463748966 + (((~((-269485091) | i4)) | 687872084) * 366))};
                                                java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num14);
                                                java.lang.Object obj59 = obj58;
                                                if (obj58 == null) {
                                                    java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2714 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                                    byte b43 = (byte) $$b;
                                                    byte b44 = $$a[41];
                                                    java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                    b(b43, b44, b44, objArr90);
                                                    java.lang.reflect.Method method27 = cls33.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num14, method27);
                                                    obj59 = method27;
                                                }
                                                i9 = 0;
                                                ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj59).invoke(null, objArr89)).intValue();
                                            }
                                            if (((int[]) objArr4[1])[i9] != i4) {
                                                return objArr4;
                                            }
                                            java.lang.Object[] objArr91 = new java.lang.Object[1];
                                            a((char) android.view.View.MeasureSpec.getMode(i9), 42 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 12 - android.text.TextUtils.getTrimmedLength(""), objArr91);
                                            java.lang.Object[] objArr92 = {(java.lang.String) objArr91[0]};
                                            java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num15);
                                            java.lang.Object obj61 = obj60;
                                            if (obj60 == null) {
                                                java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3161, (char) (android.view.KeyEvent.normalizeMetaState(0) + 33099));
                                                byte[] bArr5 = $$a;
                                                byte b45 = bArr5[14];
                                                byte b46 = bArr5[49];
                                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                b(b45, b46, (short) (b46 | 9), objArr93);
                                                java.lang.reflect.Method method28 = cls34.getMethod((java.lang.String) objArr93[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num15, method28);
                                                obj61 = method28;
                                            }
                                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj61).invoke(null, objArr92)).longValue();
                                            long j25 = (565 * longValue10) + 589752117166L + (((~((~longValue10) | j18)) | 1047517081 | (~(longValue10 | j16))) * (-564)) + ((~(j16 | 1047517081 | longValue10)) * 1128) + (((~(longValue10 | (-1047517082))) | (~(j18 | 1047517081))) * 564) + 2042951985;
                                            if (((((int) (j25 >> 32)) & ((((92284192 | r3) * (-476)) - 1976214230) + ((~((-1344634881) | i4)) * 952) + ((~((-1344634881) | i27)) * 476))) | (((int) j25) & (((((~((-702953255) | i27)) | (-2140179665)) * (-90)) - 1687905466) + (((~((-702953255) | i4)) | 1443924176) * (-45)) + (((~(2140179664 | i4)) | (-702953255) | (~((-2140179665) | i27))) * 45)))) != 0) {
                                                java.lang.Object[] objArr94 = {new int[]{i4}, new int[]{i4 ^ 90}, null, null, new int[1]};
                                                java.lang.Object[] objArr95 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-407068952) | i4)) | 406863878) * (-283)) + 208496426 + ((~(i4 | (-205074))) * 283))};
                                                java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num14);
                                                java.lang.Object obj63 = obj62;
                                                if (obj62 == null) {
                                                    java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2712, (char) (android.os.Process.myTid() >> 22));
                                                    byte b47 = (byte) $$b;
                                                    byte b48 = $$a[41];
                                                    java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                    b(b47, b48, b48, objArr96);
                                                    java.lang.reflect.Method method29 = cls35.getMethod((java.lang.String) objArr96[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num14, method29);
                                                    obj63 = method29;
                                                }
                                                ((int[]) objArr94[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj63).invoke(null, objArr95)).intValue();
                                                return objArr94;
                                            }
                                            java.lang.Object[] objArr97 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                            int i34 = ~(i4 | 154926475);
                                            java.lang.Object[] objArr98 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((152132866 | i34) * (-196)) + 235859244 + ((i34 | 2793609) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))};
                                            java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num14);
                                            java.lang.Object obj65 = obj64;
                                            if (obj64 == null) {
                                                java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, android.view.View.resolveSizeAndState(0, 0, 0) + 2713, (char) android.view.View.MeasureSpec.getSize(0));
                                                byte b49 = (byte) $$b;
                                                byte b50 = $$a[41];
                                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                b(b49, b50, b50, objArr99);
                                                java.lang.reflect.Method method30 = cls36.getMethod((java.lang.String) objArr99[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num14, method30);
                                                obj65 = method30;
                                            }
                                            ((int[]) objArr97[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj65).invoke(null, objArr98)).intValue();
                                            return objArr97;
                                        }
                                        i22++;
                                        str10 = str5;
                                        num11 = num;
                                        num9 = num3;
                                        indexOf = i24;
                                    }
                                }
                                int i35 = indexOf;
                                num = num11;
                                num3 = num9;
                                java.lang.String str14 = (java.lang.String) java.lang.Class.forName(str6).getField(str7).get(invoke);
                                if (str14.length() >= 6) {
                                    int i36 = 0;
                                    while (i36 <= str14.length() - 6) {
                                        java.lang.Object[] objArr100 = {str14.substring(i36, i36 + 6), 931995};
                                        java.lang.Object obj66 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                        java.lang.Object obj67 = obj66;
                                        if (obj66 == null) {
                                            java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2594 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                            byte b51 = $$a[41];
                                            java.lang.Object[] objArr101 = new java.lang.Object[1];
                                            b(b51, (byte) (b51 | 34), (short) 653, objArr101);
                                            java.lang.reflect.Method method31 = cls37.getMethod((java.lang.String) objArr101[0], java.lang.String.class, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method31);
                                            obj67 = method31;
                                        }
                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj67).invoke(null, objArr100)).longValue();
                                        long j26 = i21;
                                        long j27 = ~longValue11;
                                        r36 = 815718719;
                                        java.lang.String str15 = str14;
                                        int i37 = i36;
                                        long j28 = (((-565) * longValue11) - 462512514240L) + (((~(j26 | 815718719)) | (~(longValue11 | 815718719))) * (-566)) + ((~((-815718720) | j27)) * 566) + ((~(815718719 | j27 | j26)) * 566);
                                        long j29 = j28 + 2072819244;
                                        int i38 = (int) (j29 >> 32);
                                        int i39 = ~i21;
                                        int i40 = ~((-16779777) | i21);
                                        if (((((int) j29) & ((((~((-541081985) | i39)) | (~((-1479313411) | i21))) * 988) + 939633917 + (((~((-1479313411) | i39)) | (~((-583168985) | i21)) | 42087000) * 988))) | (((((~(329894410 | i39)) | (-2080235456) | i40) * (-713)) + 913985002 + (i40 * 1426) + ((~((-1767120822) | i39)) * 713)) & i38)) == -2096167706) {
                                            objArr6 = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                            java.lang.String str16 = (java.lang.String) java.lang.Class.forName(str6).getField(str7).get(invoke);
                                            ((int[]) objArr6[0])[0] = i21;
                                            ((int[]) objArr6[1])[0] = i21 ^ 20;
                                            int i41 = ~(12005258 | i39);
                                            java.lang.Object[] objArr102 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((1052416 | i41) * (-970)) + 16657316 + ((i41 | 10952842) * 970))};
                                            java.lang.Object obj68 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            java.lang.Object obj69 = obj68;
                                            if (obj68 == null) {
                                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 50, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                byte b52 = (byte) $$b;
                                                byte b53 = $$a[41];
                                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                b(b52, b53, b53, objArr103);
                                                java.lang.reflect.Method method32 = cls38.getMethod((java.lang.String) objArr103[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method32);
                                                obj69 = method32;
                                            }
                                            ((int[]) objArr6[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj69).invoke(null, objArr102)).intValue();
                                            i11 = i21;
                                            num6 = -1347122530;
                                            objArr = objArr6;
                                            num2 = num6;
                                            i4 = i11;
                                            i6 = 1;
                                            c = 0;
                                            if (((int[]) objArr[i6])[c] == i4) {
                                            }
                                        } else {
                                            i36 = i37 + 1;
                                            str14 = str15;
                                            r34 = j28;
                                        }
                                    }
                                }
                                int i42 = 0;
                                java.lang.String substring = ((java.lang.String) java.lang.Class.forName(str6).getField(str7).get(invoke)).substring(0, i35);
                                int i43 = 1;
                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                c("닸俐닗\uf585\ueb11", android.text.TextUtils.getTrimmedLength(""), objArr104);
                                java.lang.String[] split = substring.split((java.lang.String) objArr104[0]);
                                int length = split.length;
                                int i44 = 0;
                                ?? r1 = split;
                                int i45 = r34;
                                while (i44 < length) {
                                    ?? r10 = r1[i44];
                                    java.lang.Object[] objArr105 = new java.lang.Object[i43];
                                    c("氲㝁汩驃鑦칣᠏", android.view.View.combineMeasuredStates(i42, i42), objArr105);
                                    if (r10.split((java.lang.String) objArr105[i42]).length > i43) {
                                        r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 48, 1581 - android.graphics.Color.blue(i42), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                        synchronized (r2) {
                                            try {
                                                try {
                                                    char c3 = (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                                    r15 = android.graphics.Color.blue(0);
                                                    obj2 = r1;
                                                    try {
                                                        try {
                                                            java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                            a(c3, r15 + 16, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 150, objArr106);
                                                            str = (java.lang.String) objArr106[0];
                                                            try {
                                                                try {
                                                                    java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                                                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                    c("愤ۦ慗ꮢ˂쐩", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr107);
                                                                    exec = runtime.exec((java.lang.String) objArr107[0], (java.lang.String[]) null, (java.io.File) null);
                                                                    try {
                                                                        java.lang.Object[] objArr108 = {exec.getInputStream()};
                                                                        java.lang.Object obj70 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                                        if (obj70 == null) {
                                                                            try {
                                                                                i45 = length;
                                                                                try {
                                                                                    java.lang.reflect.Constructor declaredConstructor = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 44, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1507, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getDeclaredConstructor(java.io.InputStream.class);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor);
                                                                                    obj3 = declaredConstructor;
                                                                                } catch (java.lang.Throwable th5) {
                                                                                    th = th5;
                                                                                    th = th;
                                                                                    cause = th.getCause();
                                                                                    if (cause == null) {
                                                                                        throw cause;
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } catch (java.lang.Throwable th6) {
                                                                                th = th6;
                                                                            }
                                                                        } else {
                                                                            i45 = length;
                                                                            obj3 = obj70;
                                                                        }
                                                                        try {
                                                                            newInstance = ((java.lang.reflect.Constructor) obj3).newInstance(objArr108);
                                                                        } catch (java.lang.Throwable th7) {
                                                                            th = th7;
                                                                            th = th;
                                                                            cause = th.getCause();
                                                                            if (cause == null) {
                                                                            }
                                                                        }
                                                                    } catch (java.lang.Throwable th8) {
                                                                        th = th8;
                                                                    }
                                                                } catch (java.lang.Exception unused) {
                                                                }
                                                            } catch (java.lang.Exception unused2) {
                                                            }
                                                        } catch (java.io.IOException unused3) {
                                                            i45 = length;
                                                            r36 = str6;
                                                            r1 = i21;
                                                            r15 = invoke;
                                                            i35 = i44;
                                                            str6 = str7;
                                                            str7 = r2;
                                                            r2 = i16;
                                                            i44 = i35 + 1;
                                                            i21 = r1;
                                                            i16 = r2;
                                                            str7 = str6;
                                                            invoke = r15;
                                                            r1 = obj2;
                                                            length = i45;
                                                            str6 = r36;
                                                            i42 = 0;
                                                            i43 = 1;
                                                            i45 = i45;
                                                            r36 = r36;
                                                        }
                                                    } catch (java.io.IOException unused4) {
                                                    }
                                                } catch (java.lang.Throwable th9) {
                                                    th = th9;
                                                    str7 = r2;
                                                }
                                            } catch (java.io.IOException unused5) {
                                                obj2 = r1;
                                            }
                                            try {
                                                try {
                                                    java.lang.Object[] objArr109 = {exec.getErrorStream()};
                                                    java.lang.Object obj71 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                    if (obj71 == null) {
                                                        try {
                                                            i35 = i44;
                                                            num5 = i16;
                                                            try {
                                                                java.lang.reflect.Constructor declaredConstructor2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44, 1507 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getDeclaredConstructor(java.io.InputStream.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor2);
                                                                obj4 = declaredConstructor2;
                                                            } catch (java.lang.Throwable th10) {
                                                                th = th10;
                                                                th2 = th;
                                                                cause2 = th2.getCause();
                                                                if (cause2 == null) {
                                                                    throw cause2;
                                                                }
                                                                throw th2;
                                                            }
                                                        } catch (java.lang.Throwable th11) {
                                                            th = th11;
                                                            num5 = i16;
                                                        }
                                                    } else {
                                                        i35 = i44;
                                                        num5 = i16;
                                                        obj4 = obj71;
                                                    }
                                                    try {
                                                        java.lang.Object newInstance2 = ((java.lang.reflect.Constructor) obj4).newInstance(objArr109);
                                                        try {
                                                            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                                            try {
                                                                java.lang.Class<?> cls39 = java.lang.Class.forName(str8);
                                                                try {
                                                                    try {
                                                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                        c("簖澱籥싩ඕ垬閌鉺죒", android.view.KeyEvent.getDeadChar(0, 0), objArr110);
                                                                        cls39.getMethod((java.lang.String) objArr110[0], null).invoke(newInstance, null);
                                                                        try {
                                                                            java.lang.Class<?> cls40 = java.lang.Class.forName(str8);
                                                                            java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                            c("簖澱籥싩ඕ垬閌鉺죒", (-16777216) - android.graphics.Color.rgb(0, 0, 0), objArr111);
                                                                            cls40.getMethod((java.lang.String) objArr111[0], null).invoke(newInstance2, null);
                                                                            try {
                                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                                sb.append(str);
                                                                                java.lang.Object obj72 = invoke;
                                                                                java.lang.String str17 = str7;
                                                                                try {
                                                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                                    d(android.view.View.getDefaultSize(0, 0) - 1553333142, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1437851613, (-26) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) android.text.TextUtils.getCapsMode("", 0, 0), (short) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr112);
                                                                                    sb.append(((java.lang.String) objArr112[0]).intern());
                                                                                    java.lang.String obj73 = sb.toString();
                                                                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                                    a((char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 19832), 5 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.os.Process.myPid() >> 22) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, objArr113);
                                                                                    dataOutputStream.write(obj73.getBytes((java.lang.String) objArr113[0]));
                                                                                    dataOutputStream.flush();
                                                                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                                    a((char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), 6 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.graphics.Color.blue(0) + 187, objArr114);
                                                                                    java.lang.String str18 = (java.lang.String) objArr114[0];
                                                                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                                    a((char) (19832 - android.graphics.Color.alpha(0)), 4 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 183 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr115);
                                                                                    java.lang.String str19 = (java.lang.String) objArr115[0];
                                                                                    dataOutputStream.write(str18.getBytes(str19));
                                                                                    dataOutputStream.flush();
                                                                                    try {
                                                                                        ?? nanoTime = java.lang.System.nanoTime();
                                                                                        long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                        java.lang.String str20 = r2;
                                                                                        while (true) {
                                                                                            try {
                                                                                                exec.exitValue();
                                                                                                str7 = str20;
                                                                                                str4 = str6;
                                                                                                break;
                                                                                            } catch (java.lang.IllegalThreadStateException unused6) {
                                                                                                if (nanos > 0) {
                                                                                                    try {
                                                                                                        str7 = str20;
                                                                                                        try {
                                                                                                            try {
                                                                                                                java.lang.Object[] objArr116 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                java.lang.Class<?> cls41 = java.lang.Class.forName(str8);
                                                                                                                java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                                                                str3 = str6;
                                                                                                                try {
                                                                                                                    c("ﮖ뤎ﯥᑎᴈ䜵茔蓵佖", 1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr117);
                                                                                                                    cls41.getMethod((java.lang.String) objArr117[0], java.lang.Long.TYPE).invoke(null, objArr116);
                                                                                                                } catch (java.lang.Throwable th12) {
                                                                                                                    th = th12;
                                                                                                                    java.lang.Throwable th13 = th;
                                                                                                                    java.lang.Throwable cause4 = th13.getCause();
                                                                                                                    if (cause4 != null) {
                                                                                                                        throw cause4;
                                                                                                                    }
                                                                                                                    throw th13;
                                                                                                                }
                                                                                                            } catch (java.lang.Throwable th14) {
                                                                                                                th = th14;
                                                                                                            }
                                                                                                        } catch (java.lang.InterruptedException e) {
                                                                                                            e = e;
                                                                                                            interruptedException = e;
                                                                                                            try {
                                                                                                                throw interruptedException;
                                                                                                            } catch (java.lang.Throwable th15) {
                                                                                                                th = th15;
                                                                                                                th3 = th;
                                                                                                                try {
                                                                                                                    exec.destroy();
                                                                                                                    throw th3;
                                                                                                                } catch (java.lang.Exception unused7) {
                                                                                                                    throw th3;
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th16) {
                                                                                                            th = th16;
                                                                                                            th3 = th;
                                                                                                            exec.destroy();
                                                                                                            throw th3;
                                                                                                        }
                                                                                                    } catch (java.lang.InterruptedException e2) {
                                                                                                        e = e2;
                                                                                                    } catch (java.lang.Throwable th17) {
                                                                                                        th = th17;
                                                                                                    }
                                                                                                } else {
                                                                                                    str7 = str20;
                                                                                                    str3 = str6;
                                                                                                }
                                                                                                try {
                                                                                                    nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                                                    str4 = str3;
                                                                                                    if (nanos > 0) {
                                                                                                        str20 = str7;
                                                                                                        str6 = str3;
                                                                                                    }
                                                                                                } catch (java.lang.InterruptedException e3) {
                                                                                                    e = e3;
                                                                                                    interruptedException = e;
                                                                                                    throw interruptedException;
                                                                                                } catch (java.lang.Throwable th18) {
                                                                                                    th = th18;
                                                                                                    th3 = th;
                                                                                                    exec.destroy();
                                                                                                    throw th3;
                                                                                                }
                                                                                            } catch (java.lang.InterruptedException e4) {
                                                                                                interruptedException = e4;
                                                                                                throw interruptedException;
                                                                                            } catch (java.lang.Throwable th19) {
                                                                                                th3 = th19;
                                                                                                exec.destroy();
                                                                                                throw th3;
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                dataOutputStream.close();
                                                                                            } catch (java.io.IOException unused8) {
                                                                                            }
                                                                                            try {
                                                                                                nanoTime = 0;
                                                                                                nanoTime = 0;
                                                                                                nanoTime = 0;
                                                                                                nanoTime = 0;
                                                                                                java.lang.Class<?> cls42 = java.lang.Class.forName(str8);
                                                                                                java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                                                c("푃纷퐩폴噝౬䠜俶", android.graphics.Color.argb(0, 0, 0, 0), objArr118);
                                                                                                str19 = (java.lang.String) objArr118[0];
                                                                                                cls42.getMethod(str19, java.lang.Long.TYPE).invoke(newInstance, 100L);
                                                                                            } catch (java.lang.Throwable th20) {
                                                                                                java.lang.Throwable cause5 = th20.getCause();
                                                                                                if (cause5 != null) {
                                                                                                    throw cause5;
                                                                                                }
                                                                                                throw th20;
                                                                                            }
                                                                                        } catch (java.lang.InterruptedException e5) {
                                                                                            e = e5;
                                                                                            interruptedException = e;
                                                                                            throw interruptedException;
                                                                                        } catch (java.lang.Throwable th21) {
                                                                                            th = th21;
                                                                                            th3 = th;
                                                                                            exec.destroy();
                                                                                            throw th3;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                java.lang.Class<?> cls43 = java.lang.Class.forName(str8);
                                                                                                java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                                                c("푃纷퐩폴噝౬䠜俶", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr119);
                                                                                                nanoTime = 0;
                                                                                                nanoTime = 0;
                                                                                                str19 = (java.lang.String) objArr119[0];
                                                                                                cls43.getMethod(str19, java.lang.Long.TYPE).invoke(newInstance2, 10L);
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            exec.destroy();
                                                                                                        } catch (java.lang.Throwable th22) {
                                                                                                            th = th22;
                                                                                                            java.lang.Throwable th23 = th;
                                                                                                            throw th23;
                                                                                                        }
                                                                                                    } catch (java.io.IOException unused9) {
                                                                                                        r1 = i;
                                                                                                        r36 = str4;
                                                                                                        r2 = num5;
                                                                                                        r15 = obj72;
                                                                                                        str6 = str17;
                                                                                                        i44 = i35 + 1;
                                                                                                        i21 = r1;
                                                                                                        i16 = r2;
                                                                                                        str7 = str6;
                                                                                                        invoke = r15;
                                                                                                        r1 = obj2;
                                                                                                        length = i45;
                                                                                                        str6 = r36;
                                                                                                        i42 = 0;
                                                                                                        i43 = 1;
                                                                                                        i45 = i45;
                                                                                                        r36 = r36;
                                                                                                    } catch (java.lang.Exception unused10) {
                                                                                                    }
                                                                                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                                                                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 44, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1507, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                                                                    byte[] bArr6 = $$a;
                                                                                                    byte b54 = bArr6[41];
                                                                                                    byte b55 = bArr6[7];
                                                                                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                                                    b(b54, b55, (short) (b55 >>> 2), objArr120);
                                                                                                    sb2.append(cls44.getField((java.lang.String) objArr120[0]).get(newInstance).toString());
                                                                                                    java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43, 1507 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                                                    byte b56 = bArr6[41];
                                                                                                    byte b57 = bArr6[7];
                                                                                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                                                    b(b56, b57, (short) (b57 >>> 2), objArr121);
                                                                                                    sb2.append(cls45.getField((java.lang.String) objArr121[0]).get(newInstance2).toString());
                                                                                                    java.lang.String obj74 = sb2.toString();
                                                                                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                                                    d((-1553333142) - (android.os.Process.myTid() >> 22), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1437851613, (-27) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (byte) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (short) ((-1) - android.view.MotionEvent.axisFromString("")), objArr122);
                                                                                                    java.lang.String[] split2 = obj74.split(((java.lang.String) objArr122[0]).intern());
                                                                                                    int length2 = split2.length;
                                                                                                    int i46 = 0;
                                                                                                    while (i46 < length2) {
                                                                                                        java.lang.String str21 = split2[i46];
                                                                                                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                                                        c("ᕵƮᔅ곣Ꞙﶣソ㝒ꆤ怕ꣵ貳籶ᝍ摍䁷ଂ쫽\udf9fᕎ쟙縧誮", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr123);
                                                                                                        if (!str21.startsWith((java.lang.String) objArr123[0])) {
                                                                                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                                                            a((char) android.view.KeyEvent.getDeadChar(0, 0), android.text.TextUtils.getTrimmedLength("") + 20, 193 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr124);
                                                                                                            if (str21.startsWith((java.lang.String) objArr124[0])) {
                                                                                                                continue;
                                                                                                            } else {
                                                                                                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                                                                a((char) (android.view.View.MeasureSpec.getSize(0) + 59844), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, objArr125);
                                                                                                                if (str21.startsWith((java.lang.String) objArr125[0])) {
                                                                                                                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                                                                    c("魹ꋩ魃韒兕", (-1) - android.os.Process.getGidForName(""), objArr126);
                                                                                                                    ?? split3 = str21.split((java.lang.String) objArr126[0]);
                                                                                                                    if (split3.length > 1 && split3[1].equalsIgnoreCase(r10)) {
                                                                                                                        objArr6 = new java.lang.Object[]{new int[1], new int[1], null, r2, new int[1]};
                                                                                                                        java.lang.String str22 = (java.lang.String) java.lang.Class.forName(str4).getField(str17).get(obj72);
                                                                                                                        i11 = i;
                                                                                                                        ((int[]) objArr6[0])[0] = i11;
                                                                                                                        ((int[]) objArr6[1])[0] = i11 ^ 20;
                                                                                                                        int i47 = ~i11;
                                                                                                                        int i48 = ~(1004959870 | i11);
                                                                                                                        java.lang.Object[] objArr127 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-27670655) | i47)) | 25176074) | i48) * (-252)) - 1215428000) + (((~(i47 | (-2494581))) | i48) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                                                                                                                        num6 = num5;
                                                                                                                        java.lang.Object obj75 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                                                                                                                        java.lang.Object obj76 = obj75;
                                                                                                                        if (obj75 == null) {
                                                                                                                            java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", "", 0), 2714 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.getMode(0));
                                                                                                                            byte b58 = (byte) $$b;
                                                                                                                            byte b59 = $$a[41];
                                                                                                                            java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                                                                            b(b58, b59, b59, objArr128);
                                                                                                                            java.lang.reflect.Method method33 = cls46.getMethod((java.lang.String) objArr128[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method33);
                                                                                                                            obj76 = method33;
                                                                                                                        }
                                                                                                                        ((int[]) objArr6[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj76).invoke(null, objArr127)).intValue();
                                                                                                                        objArr = objArr6;
                                                                                                                        num2 = num6;
                                                                                                                        i4 = i11;
                                                                                                                        i6 = 1;
                                                                                                                        c = 0;
                                                                                                                        if (((int[]) objArr[i6])[c] == i4) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    continue;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        i46++;
                                                                                                        str17 = str17;
                                                                                                        num5 = num5;
                                                                                                        obj72 = obj72;
                                                                                                    }
                                                                                                    r15 = obj72;
                                                                                                    str6 = str17;
                                                                                                    r1 = i;
                                                                                                    r36 = str4;
                                                                                                } catch (java.lang.Exception unused11) {
                                                                                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                                                    c("伳㸸併鍵鋗죦\uee3d\ue9d5ﯦ往鷿剽☼⢔儌麫兆\uf565\ueacb쯌鷓䆵뿯㐉젱ો獼悬獠휇ҁ", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr129);
                                                                                                    throw new java.io.IOException((java.lang.String) objArr129[0]);
                                                                                                }
                                                                                            } catch (java.lang.Throwable th24) {
                                                                                                java.lang.Throwable cause6 = th24.getCause();
                                                                                                if (cause6 != null) {
                                                                                                    throw cause6;
                                                                                                }
                                                                                                throw th24;
                                                                                            }
                                                                                        } catch (java.lang.InterruptedException e6) {
                                                                                            interruptedException = e6;
                                                                                            throw interruptedException;
                                                                                        } catch (java.lang.Throwable th25) {
                                                                                            th3 = th25;
                                                                                            exec.destroy();
                                                                                            throw th3;
                                                                                        }
                                                                                    } catch (java.lang.InterruptedException e7) {
                                                                                        e = e7;
                                                                                    } catch (java.lang.Throwable th26) {
                                                                                        th = th26;
                                                                                    }
                                                                                } catch (java.io.IOException unused12) {
                                                                                    r1 = i;
                                                                                    str7 = r2;
                                                                                    r36 = str6;
                                                                                } catch (java.lang.Exception unused13) {
                                                                                    java.lang.Object[] objArr1292 = new java.lang.Object[1];
                                                                                    c("伳㸸併鍵鋗죦\uee3d\ue9d5ﯦ往鷿剽☼⢔儌麫兆\uf565\ueacb쯌鷓䆵뿯㐉젱ો獼悬獠휇ҁ", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr1292);
                                                                                    throw new java.io.IOException((java.lang.String) objArr1292[0]);
                                                                                }
                                                                            } catch (java.io.IOException unused14) {
                                                                                i10 = i;
                                                                                str2 = str6;
                                                                                r15 = invoke;
                                                                                str6 = str7;
                                                                                str7 = r2;
                                                                                r1 = i10;
                                                                                r36 = str2;
                                                                                r2 = num5;
                                                                                i44 = i35 + 1;
                                                                                i21 = r1;
                                                                                i16 = r2;
                                                                                str7 = str6;
                                                                                invoke = r15;
                                                                                r1 = obj2;
                                                                                length = i45;
                                                                                str6 = r36;
                                                                                i42 = 0;
                                                                                i43 = 1;
                                                                                i45 = i45;
                                                                                r36 = r36;
                                                                            } catch (java.lang.Exception unused15) {
                                                                                java.lang.Object[] objArr12922 = new java.lang.Object[1];
                                                                                c("伳㸸併鍵鋗죦\uee3d\ue9d5ﯦ往鷿剽☼⢔儌麫兆\uf565\ueacb쯌鷓䆵뿯㐉젱ો獼悬獠휇ҁ", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr12922);
                                                                                throw new java.io.IOException((java.lang.String) objArr12922[0]);
                                                                            }
                                                                        } catch (java.lang.Throwable th27) {
                                                                            java.lang.Throwable cause7 = th27.getCause();
                                                                            if (cause7 != null) {
                                                                                throw cause7;
                                                                            }
                                                                            throw th27;
                                                                        }
                                                                    } catch (java.lang.Throwable th28) {
                                                                        th = th28;
                                                                        java.lang.Throwable th29 = th;
                                                                        java.lang.Throwable cause8 = th29.getCause();
                                                                        if (cause8 != null) {
                                                                            throw cause8;
                                                                        }
                                                                        throw th29;
                                                                    }
                                                                } catch (java.lang.Throwable th30) {
                                                                    th = th30;
                                                                }
                                                            } catch (java.lang.Throwable th31) {
                                                                th = th31;
                                                            }
                                                        } catch (java.io.IOException unused16) {
                                                            str2 = str6;
                                                            i10 = i21;
                                                        } catch (java.lang.Exception unused17) {
                                                        }
                                                        r2 = num5;
                                                    } catch (java.lang.Throwable th32) {
                                                        th = th32;
                                                        th2 = th;
                                                        cause2 = th2.getCause();
                                                        if (cause2 == null) {
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th33) {
                                                    th = th33;
                                                }
                                            } catch (java.io.IOException unused18) {
                                                r36 = str6;
                                                r1 = i21;
                                                r15 = invoke;
                                                i35 = i44;
                                                str6 = str7;
                                                str7 = r2;
                                                r2 = i16;
                                                i44 = i35 + 1;
                                                i21 = r1;
                                                i16 = r2;
                                                str7 = str6;
                                                invoke = r15;
                                                r1 = obj2;
                                                length = i45;
                                                str6 = r36;
                                                i42 = 0;
                                                i43 = 1;
                                                i45 = i45;
                                                r36 = r36;
                                            } catch (java.lang.Exception unused19) {
                                                java.lang.Object[] objArr129222 = new java.lang.Object[1];
                                                c("伳㸸併鍵鋗죦\uee3d\ue9d5ﯦ往鷿剽☼⢔儌麫兆\uf565\ueacb쯌鷓䆵뿯㐉젱ો獼悬獠휇ҁ", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr129222);
                                                throw new java.io.IOException((java.lang.String) objArr129222[0]);
                                            }
                                        }
                                    } else {
                                        obj2 = r1;
                                        i45 = length;
                                        r36 = str6;
                                        r1 = i21;
                                        r15 = invoke;
                                        i35 = i44;
                                        str6 = str7;
                                        r2 = i16;
                                    }
                                    i44 = i35 + 1;
                                    i21 = r1;
                                    i16 = r2;
                                    str7 = str6;
                                    invoke = r15;
                                    r1 = obj2;
                                    length = i45;
                                    str6 = r36;
                                    i42 = 0;
                                    i43 = 1;
                                    i45 = i45;
                                    r36 = r36;
                                }
                                i4 = i21;
                                num2 = i16;
                                i5 = i43;
                            } else {
                                num = 269015277;
                                i4 = i21;
                                num2 = -1347122530;
                                num3 = num9;
                                i5 = 1;
                            }
                            int[] iArr3 = new int[i5];
                            int[] iArr4 = new int[i5];
                            iArr3[0] = i4;
                            iArr4[0] = i4;
                            objArr = new java.lang.Object[]{iArr3, iArr4, null, null, new int[i5]};
                            java.lang.Object[] objArr130 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(317335089 | i4)) | (-712800856)) * (-465)) + 1521330815 + (((~((-712800856) | i4)) | 317335089) * 930) + (((-672421959) | i4) * 465))};
                            java.lang.Object obj77 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                            java.lang.Object obj78 = obj77;
                            if (obj77 == null) {
                                java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getTrimmedLength(""), (android.os.Process.myPid() >> 22) + 2713, (char) android.view.View.getDefaultSize(0, 0));
                                byte b60 = (byte) $$b;
                                byte b61 = $$a[41];
                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                b(b60, b61, b61, objArr131);
                                java.lang.reflect.Method method34 = cls47.getMethod((java.lang.String) objArr131[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method34);
                                obj78 = method34;
                            }
                            c = 0;
                            ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj78).invoke(null, objArr130)).intValue();
                            i6 = 1;
                            if (((int[]) objArr[i6])[c] == i4) {
                            }
                        } catch (java.lang.Throwable th34) {
                            java.lang.Throwable cause9 = th34.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th34;
                        }
                    } catch (java.lang.Throwable th35) {
                        java.lang.Throwable cause10 = th35.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th35;
                    }
                }
            };
            int i = getCardholderValidators;
            getAdditionalCheckTable = (i + 93) % 128;
            int i2 = ((i | 54) << 1) - (i ^ 54);
            int i3 = ((~i2) + (i2 << 1)) % 128;
            getAdditionalCheckTable = i3;
            getCardholderValidators = (i3 + 119) % 128;
            return alternateContactlessPaymentDataJson;
        } catch (java.lang.Exception e) {
            try {
                java.lang.Object[] objArr = {e.toString()};
                int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i4 = minimumFlingVelocity * (-721);
                int i5 = ~identityHashCode;
                int i6 = i5 & (i5 | identityHashCode);
                int i7 = ~minimumFlingVelocity;
                int i8 = i7 & (-39);
                int i9 = ~((i7 ^ (-39)) | i8);
                int i10 = i6 ^ i9;
                int i11 = i6 & i9;
                int i12 = (i11 ^ i10) | (i11 & i10);
                int i13 = minimumFlingVelocity ^ 38;
                int i14 = minimumFlingVelocity & 38;
                int i15 = ~((i13 ^ i14) | (i13 & i14));
                int i16 = i12 ^ i15;
                int i17 = i12 & i15;
                int i18 = ((((i4 ^ (-27397)) + ((i4 & (-27397)) << 1)) - 1) - (~(-(~(-(-(((i17 & i16) | (i17 ^ i16)) * 1444))))))) - 2;
                int i19 = ~(i13 | i14);
                int i20 = minimumFlingVelocity ^ identityHashCode;
                int i21 = minimumFlingVelocity & identityHashCode;
                int i22 = ~((i20 ^ i21) | (i20 & i21));
                int i23 = ((~i19) & i22) | ((~i22) & i19) | (i19 & i22);
                int i24 = ~((identityHashCode ^ 38) | (identityHashCode & 38));
                int i25 = ((i24 & (~i23)) | ((~i24) & i23) | (i23 & i24)) * (-1444);
                int i26 = ((i18 | i25) << 1) - (i25 ^ i18);
                int i27 = ~((i7 & 38) | ((~i7) & 38) | i8);
                int i28 = i8 | i14;
                int i29 = minimumFlingVelocity & (-39);
                int i30 = ~((i29 ^ i28) | (i29 & i28));
                int i31 = ((i30 ^ i27) | (i27 & i30)) * 722;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(normalizeMetaState, (i26 & i31) + (i31 | i26), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private byte[] writeReplace(com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk) throws java.security.GeneralSecurityException {
        int i = getCardholderValidators;
        int i2 = i & 61;
        int i3 = (i | 61) & (~i2);
        int i4 = -(-(i2 << 1));
        getAdditionalCheckTable = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        try {
            byte[] bArr = (byte[]) ((java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, initializevisapaymentsdk}, 1893095039, -1893095002, java.lang.System.identityHashCode(this))).get();
            if (bArr.length != 16) {
                byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, 0, 8);
                int i5 = getAdditionalCheckTable;
                int i6 = i5 & 59;
                int i7 = i5 | 59;
                getCardholderValidators = ((i6 & i7) + (i7 | i6)) % 128;
                return copyOfRange;
            }
            int i8 = getAdditionalCheckTable;
            int i9 = i8 & 85;
            int i10 = ((((i8 ^ 85) | i9) << 1) - (~(-((i8 | 85) & (~i9))))) - 1;
            getCardholderValidators = i10 % 128;
            byte[] copyOfRange2 = i10 % 2 != 0 ? java.util.Arrays.copyOfRange(bArr, 120, 59) : java.util.Arrays.copyOfRange(bArr, 8, 16);
            int i11 = getAdditionalCheckTable;
            int i12 = ((i11 | 35) << 1) - (i11 ^ 35);
            getCardholderValidators = i12 % 128;
            if (i12 % 2 == 0) {
                return copyOfRange2;
            }
            throw null;
        } catch (java.lang.Exception e) {
            try {
                java.lang.Object[] objArr = {e.toString()};
                int i13 = -(~(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                int i14 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i15 = i14 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
                int i16 = ((i15 | (-19760)) << 1) - (i15 ^ (-19760));
                int i17 = ~identityHashCode;
                int i18 = i17 & 38;
                int i19 = (~i18) & (i17 | 38);
                int i20 = ~((i18 ^ i19) | (i18 & i19));
                int i21 = ~i14;
                int i22 = ((~i20) & i14) | (i20 & i21);
                int i23 = i20 & i14;
                int i24 = ((i23 ^ i22) | (i23 & i22)) * (-1042);
                int i25 = i16 & i24;
                int i26 = (i16 | i24) & (~i25);
                int i27 = -(-(i25 << 1));
                int i28 = identityHashCode & 38;
                int i29 = (-2) - (~(((i26 & i27) + (i26 | i27)) - (~((((~i28) & (identityHashCode | 38)) | i28) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))));
                int i30 = ~((i21 & (-39)) | (i21 ^ (-39)));
                int i31 = i21 & (i21 | i14);
                int i32 = i31 & identityHashCode;
                int i33 = (identityHashCode | i31) & (~i32);
                int i34 = ~((i33 ^ i32) | (i33 & i32));
                int i35 = (i34 ^ i30) | (i34 & i30);
                int i36 = (i14 ^ i17) | (i14 & i17);
                int i37 = ~(((~i36) & 38) | (i36 & (-39)) | (i36 & 38));
                int i38 = i35 ^ i37;
                int i39 = i37 & i35;
                int i40 = -(-(((i39 ^ i38) | (i39 & i38)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((-1) - (~i13), (i29 ^ i40) + ((i40 & i29) << 1), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    @Override // com.payair.hce.sendUpdateRNSInformation
    public final byte[] valueOf(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk) throws java.security.GeneralSecurityException {
        byte[] writeReplace = writeReplace(initializevisapaymentsdk);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(bArr3);
        linkedList.add(new byte[]{(byte) writeReplace.length});
        linkedList.add(writeReplace);
        linkedList.add(bArr4);
        byte[] bArr5 = (byte[]) valueOf(new java.lang.Object[]{linkedList}, -579574651, 579574671, (int) java.lang.System.currentTimeMillis());
        valueOf(new java.lang.Object[]{writeReplace}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
        writeReplace(linkedList);
        byte[] SdkCoreAlternateContactlessPaymentDataImpl = SdkCoreAlternateContactlessPaymentDataImpl(bArr5);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i = getProfileVersion;
        int i2 = -SdkCoreAlternateContactlessPaymentDataImpl.length;
        int i3 = i & i2;
        int i4 = i3 + ((i ^ i2) | i3);
        int i5 = i4 & (-2);
        int i6 = (i5 - (~((i4 ^ (-2)) | i5))) - 1;
        byte[] bArr6 = new byte[i6];
        java.lang.System.arraycopy(bArr5, 0, bArr6, 0, i6);
        linkedList2.add(bArr);
        linkedList2.add(bArr6);
        linkedList2.add(SdkCoreAlternateContactlessPaymentDataImpl);
        linkedList2.add(bArr2);
        byte[] bArr7 = (byte[]) valueOf(new java.lang.Object[]{linkedList2}, -579574651, 579574671, (int) java.lang.System.currentTimeMillis());
        try {
            byte[] writeReplace2 = this.SdkCoreAlternateContactlessPaymentDataImpl.writeReplace(bArr7, 0, bArr7.length);
            valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{SdkCoreAlternateContactlessPaymentDataImpl}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr7}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            writeReplace(linkedList2);
            int i7 = getAdditionalCheckTable;
            int i8 = i7 & 25;
            int i9 = -(-((i7 ^ 25) | i8));
            getCardholderValidators = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
            int i10 = ~java.lang.System.identityHashCode(this);
            int i11 = i10 ^ (-580952098);
            int i12 = (-580952098) & i10;
            int i13 = -(-(((i12 ^ i11) | (i12 & i11)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
            int i14 = i13 & 1942771205;
            int i15 = (i13 ^ 1942771205) | i14;
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            int i17 = (1655743649 & i10) | ((~i10) & (-1655743650));
            int i18 = i10 & (-1655743650);
            int i19 = ~((i18 ^ i17) | (i18 & i17));
            int i20 = ((~i19) & (-2012475042)) | (2012475041 & i19);
            int i21 = i19 & (-2012475042);
            int i22 = (i21 ^ i20) | (i21 & i20);
            int i23 = ((-1074791553) & i22) | ((~i22) & 1074791552);
            int i24 = i22 & 1074791552;
            int i25 = -(~(((i24 ^ i23) | (i24 & i23)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i26 = identityHashCode ^ 1128874552;
            int i27 = ~identityHashCode;
            int i28 = identityHashCode & 1128874552;
            int i29 = ~((i26 ^ i28) | (i26 & i28));
            int i30 = i29 & 1074282552;
            int i31 = (i29 | 1074282552) & (~i30);
            int i32 = -(~(((i31 ^ i30) | (i31 & i30)) * (-502)));
            int i33 = (-2) - (~((i32 ^ 2102746060) + ((i32 & 2102746060) << 1)));
            int i34 = (i27 ^ 1128874552) | (i27 & 1128874552);
            int i35 = (i34 ^ 191204161) | (i34 & 191204161);
            int i36 = ~i35;
            int i37 = -(-(((i35 | i36) & i36) * (-502)));
            int i38 = (i33 | i37) << 1;
            int i39 = -((i33 & (~i37)) | ((~i33) & i37));
            int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
            int i41 = identityHashCode & (-191204162);
            int i42 = (identityHashCode | (-191204162)) & (~i41);
            int i43 = ~((i42 ^ i41) | (i42 & i41));
            int i44 = ((i43 ^ 1128874552) | (i43 & 1128874552)) * 502;
            if ((-2) - (~((i16 & i25) + (i25 | i16))) > (((~i44) & i40) | ((~i40) & i44)) + ((i44 & i40) << 1)) {
                return writeReplace2;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            valueOf(new java.lang.Object[]{bArr5}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{SdkCoreAlternateContactlessPaymentDataImpl}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr7}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            writeReplace(linkedList2);
            throw th;
        }
    }

    private static byte[] getCiacDecline() {
        int i = getCardholderValidators;
        int i2 = i ^ 27;
        int i3 = ((((i & 27) | i2) << 1) - (~(-i2))) - 1;
        getAdditionalCheckTable = i3 % 128;
        byte[] bArr = (byte[]) (i3 % 2 == 0 ? valueOf(new java.lang.Object[]{121}, 1285877597, -1285877579, 121) : valueOf(new java.lang.Object[]{16}, 1285877597, -1285877579, 16));
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i4 = ~currentTimeMillis;
        int i5 = i4 ^ 1546892141;
        int i6 = i4 & 1546892141;
        int i7 = (i5 ^ i6) | (i5 & i6);
        int i8 = ~i7;
        int i9 = (i7 | i8) & i8;
        int i10 = i9 & 137605741;
        int i11 = ((i9 | 137605741) & (~i10)) | i10;
        int i12 = i4 & (-1546892142);
        int i13 = ((-1546892142) & currentTimeMillis) | (currentTimeMillis & 1546892141) | i12;
        int i14 = ~i13;
        int i15 = (i13 | i14) & i14;
        int i16 = i11 & i15;
        int i17 = (i11 | i15) & (~i16);
        int i18 = ((i17 ^ i16) | (i17 & i16)) * (-338);
        int i19 = i18 & (-163716187);
        int i20 = ((i18 ^ (-163716187)) | i19) << 1;
        int i21 = -((i18 | (-163716187)) & (~i19));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        int i23 = i22 & (-1970278460);
        int i24 = ((-1970278460) ^ i22) | i23;
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        int i26 = (1546892141 & (~i4)) | i12;
        int i27 = ~((i26 ^ i6) | (i6 & i26));
        int i28 = (i4 & (-1409286401)) | (1409286400 & currentTimeMillis);
        int i29 = currentTimeMillis & (-1409286401);
        int i30 = (i29 ^ i28) | (i29 & i28);
        int i31 = ~i30;
        int i32 = (i30 | i31) & i31;
        int i33 = ((i32 & (~i27)) | ((~i32) & i27) | (i32 & i27)) * 338;
        int i34 = -(((~i25) & i33) | ((~i33) & i25));
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i35 = ~currentTimeMillis2;
        int i36 = i35 & (-1279295747);
        int i37 = ((-1279295747) | i35) & (~i36);
        int i38 = (-2) - (~(492394018 - (~(-(-(((i37 ^ i36) | (i37 & i36)) * (-369)))))));
        int i39 = i35 & 1818270147;
        int i40 = (i35 | 1818270147) & (~i39);
        int i41 = (i40 ^ i39) | (i40 & i39);
        int i42 = ~i41;
        int i43 = (i41 | i42) & i42;
        int i44 = -(-(((i43 ^ (-1581548835)) | (i43 & (-1581548835))) * (-369)));
        int i45 = (i38 & i44) + (i38 | i44);
        int i46 = currentTimeMillis2 & (-1818270148);
        int i47 = ~(((currentTimeMillis2 | (-1818270148)) & (~i46)) | i46);
        int i48 = i47 & 538974401;
        int i49 = (i47 | 538974401) & (~i48);
        int i50 = (i49 ^ i48) | (i49 & i48);
        int i51 = ((~i35) & 1818270147) | ((-1818270148) & i35) | i39;
        int i52 = (1581548834 & i51) | ((~i51) & (-1581548835));
        int i53 = i51 & (-1581548835);
        int i54 = (i53 ^ i52) | (i53 & i52);
        int i55 = ~i54;
        int i56 = (i54 | i55) & i55;
        int i57 = ((i50 ^ i56) | (i56 & i50)) * 369;
        if (((((i33 & i25) | (i25 ^ i33)) << 1) - (~i34)) - 1 <= (i45 & i57) + (i57 | i45)) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getGpoResponse(java.lang.Object[] objArr) {
        byte[] bArr;
        java.lang.Class[] clsArr;
        byte[] bArr2;
        java.lang.Object[] objArr2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char c;
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        int i10 = getCardholderValidators;
        int i11 = (i10 & (-64)) | ((~i10) & 63);
        int i12 = (i10 & 63) << 1;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        getAdditionalCheckTable = i13 % 128;
        try {
            if (i13 % 2 != 0) {
                byte[] bArr3 = new byte[intValue];
                int i14 = i10 & 73;
                getAdditionalCheckTable = (((i10 | 73) & (~i14)) + (i14 << 1)) % 128;
                try {
                    try {
                        objArr2 = new java.lang.Object[]{"SHA1PRNG"};
                        int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
                        int i15 = windowTouchSlop * (-375);
                        i = (((i15 & (-14250)) | (i15 ^ (-14250))) << 1) - ((i15 & 14249) | ((~i15) & (-14250)));
                        int i16 = ~windowTouchSlop;
                        int i17 = i16 & (-39);
                        int i18 = (~i17) & (i16 | (-39));
                        int i19 = (i17 & i18) | (i18 ^ i17);
                        int i20 = ~i19;
                        int i21 = (i19 | i20) & i20;
                        int i22 = (i21 ^ intValue) | (i21 & intValue);
                        int i23 = ~((windowTouchSlop ^ 38) | (windowTouchSlop & 38));
                        i2 = ((i22 & (~i23)) | ((~i22) & i23) | (i22 & i23)) * 376;
                        i3 = ~intValue;
                        i4 = (i3 | intValue) & i3;
                        i5 = ~i4;
                        int i24 = (i4 & i16) | (i5 & windowTouchSlop);
                        int i25 = windowTouchSlop & i4;
                        int i26 = (i24 & i25) | (i25 ^ i24);
                        int i27 = ~i26;
                        int i28 = (i26 | i27) & i27;
                        int i29 = i28 ^ i23;
                        int i30 = i28 & i23;
                        i6 = -(-(((i30 ^ i29) | (i30 & i29)) * (-376)));
                        int i31 = i16 & intValue;
                        int i32 = ~(((i16 | intValue) & (~i31)) | i31);
                        int i33 = i32 ^ 38;
                        int i34 = i32 & 38;
                        i7 = -(-(((i34 ^ i33) | (i34 & i33)) * 376));
                        int i35 = -(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int i36 = i35 & 26;
                        i8 = ((i35 ^ 26) | i36) << 1;
                        i9 = -((i35 | 26) & (~i36));
                        int indexOf = android.text.TextUtils.indexOf("", "");
                        int i37 = indexOf * 69;
                        int i38 = i37 & (-1942397);
                        int i39 = ((i37 ^ (-1942397)) | i38) << 1;
                        int i40 = -((i37 | (-1942397)) & (~i38));
                        int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                        int i42 = ~indexOf;
                        int i43 = i42 & (-28992);
                        int i44 = i43 | ((i42 | (-28992)) & (~i43));
                        int i45 = i44 & i4;
                        int i46 = (i44 | i4) & (~i45);
                        int i47 = ~((i46 & i45) | (i46 ^ i45));
                        int i48 = indexOf & 28991;
                        int i49 = (~i48) & (indexOf | 28991);
                        int i50 = (i48 & i49) | (i49 ^ i48);
                        int i51 = ~i50;
                        int i52 = (i50 | i51) & i51;
                        int i53 = i47 & i52;
                        int i54 = ((i47 | i52) & (~i53)) | i53;
                        int i55 = intValue ^ 28991;
                        int i56 = intValue & 28991;
                        int i57 = ~((i55 ^ i56) | (i55 & i56));
                        int i58 = ((i54 ^ i57) | (i54 & i57)) * (-68);
                        int i59 = i41 ^ i58;
                        int i60 = ((((i58 & i41) | i59) << 1) - (~(-i59))) - 1;
                        int i61 = i42 ^ i3;
                        int i62 = i42 & i3;
                        int i63 = (i61 & i62) | (i61 ^ i62);
                        int i64 = ((~i63) & 28991) | (i63 & (-28992));
                        int i65 = i63 & 28991;
                        int i66 = (~((i65 ^ i64) | (i65 & i64))) * (-68);
                        int i67 = ((i60 ^ i66) | (i60 & i66)) << 1;
                        int i68 = -((i60 & (~i66)) | ((~i60) & i66));
                        int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                        int i70 = (indexOf | i42) & i42;
                        int i71 = i3 & (-28992);
                        int i72 = (i3 | (-28992)) & (~i71);
                        int i73 = ~((i71 ^ i72) | (i72 & i71));
                        int i74 = ((~i73) & i70) | ((~i70) & i73);
                        int i75 = i70 & i73;
                        int i76 = ((i75 ^ i74) | (i75 & i74)) * 68;
                        int i77 = i69 & i76;
                        int i78 = -(-((i76 ^ i69) | i77));
                        c = (char) (((i77 | i78) << 1) - (i78 ^ i77));
                    } catch (java.lang.Throwable th) {
                        th = th;
                    }
                } catch (java.security.NoSuchAlgorithmException unused) {
                    bArr = bArr3;
                    clsArr = null;
                }
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a((-2) - (~(((((i & i2) + (i | i2)) - (~i6)) - 1) - (~i7))), (i8 & i9) + (i9 | i8), c, objArr3);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                    int rgb = android.graphics.Color.rgb(0, 0, 0);
                    int i79 = rgb * 1773;
                    int i80 = 1997240485 & i79;
                    int i81 = ((1997240485 ^ i79) | i80) << 1;
                    int i82 = -((i79 | 1997240485) & (~i80));
                    int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                    int i84 = ~rgb;
                    int i85 = ~((i84 ^ (-46273936)) | (i84 & (-46273936)));
                    int i86 = intValue | (-46273936);
                    int i87 = ~i86;
                    int i88 = (i86 | i87) & i87;
                    int i89 = (i85 ^ i88) | (i85 & i88);
                    int i90 = i3 ^ rgb;
                    int i91 = i3 & rgb;
                    int i92 = ~(i90 | i91 | 46273935);
                    int i93 = -(-(((i89 ^ i92) | (i89 & i92)) * 886));
                    int i94 = ((~i93) & i83) | ((~i83) & i93);
                    int i95 = -(-((i93 & i83) << 1));
                    int i96 = (i94 & i95) + (i95 | i94);
                    int i97 = ~i3;
                    int i98 = (i3 & (-46273936)) | (46273935 & i97);
                    int i99 = 46273935 & i3;
                    int i100 = (i98 ^ i99) | (i98 & i99);
                    int i101 = ~i100;
                    int i102 = (i100 | i101) & i101;
                    int i103 = rgb ^ i102;
                    int i104 = i102 & rgb;
                    int i105 = -(-(((i104 ^ i103) | (i104 & i103)) * (-1772)));
                    int i106 = i96 & i105;
                    int i107 = ((i96 ^ i105) | i106) << 1;
                    int i108 = -((i105 | i96) & (~i106));
                    int i109 = ((i107 | i108) << 1) - (i108 ^ i107);
                    int i110 = -(-((~((i90 & i91) | (i90 ^ i91))) * 886));
                    int i111 = i109 & i110;
                    int i112 = (i110 ^ i109) | i111;
                    int i113 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                    int i114 = (-2) - (~((i113 * (-167)) + 104091200));
                    int i115 = ~i113;
                    int i116 = i115 | (-976674648);
                    int i117 = ~i116;
                    int i118 = (i116 | i117) & i117;
                    int i119 = (i97 & (-976674648)) | (976674647 & i3);
                    int i120 = i3 & (-976674648);
                    int i121 = ~((i119 ^ i120) | (i119 & i120));
                    int i122 = ((~i121) & i118) | ((~i118) & i121);
                    int i123 = i118 & i121;
                    int i124 = ((i122 ^ i123) | (i122 & i123)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                    int i125 = i114 & i124;
                    int i126 = (i114 ^ i124) | i125;
                    int i127 = ((i125 | i126) << 1) - (i126 ^ i125);
                    int i128 = (i115 | i113) & i115;
                    int i129 = i128 & (-976674648);
                    int i130 = (~i129) & (i128 | (-976674648));
                    int i131 = (i130 & i129) | (i130 ^ i129);
                    int i132 = (i131 ^ intValue) | (i131 & intValue);
                    int i133 = ~i132;
                    int i134 = ((i132 | i133) & i133) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                    int i135 = i127 & i134;
                    int i136 = (i134 ^ i127) | i135;
                    int i137 = i128 & i3;
                    int i138 = ~(i137 | ((i128 | i3) & (~i137)));
                    int i139 = ~((i128 ^ 976674647) | (976674647 & i128));
                    int i140 = (i139 ^ i138) | (i138 & i139);
                    int i141 = (i113 ^ (-976674648)) | (i113 & (-976674648));
                    int i142 = i141 & intValue;
                    int i143 = (i141 | intValue) & (~i142);
                    int i144 = ~((i143 ^ i142) | (i143 & i142));
                    int i145 = ((~i144) & i140) | ((~i140) & i144);
                    int i146 = i144 & i140;
                    int i147 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i148 = i147 * 592;
                    int i149 = ((i148 & 14160) | (i148 ^ 14160)) << 1;
                    int i150 = -((i148 & (-14161)) | ((~i148) & 14160));
                    int i151 = (i149 & i150) + (i149 | i150);
                    int i152 = ~i147;
                    int i153 = (i152 | i147) & i152;
                    int i154 = i153 & 23;
                    int i155 = (~((i153 & (-24)) | ((~i153) & (-24)) | i154)) * (-1182);
                    int i156 = i151 | i155;
                    int i157 = ((i156 << 1) - (~(-((~(i155 & i151)) & i156)))) - 1;
                    int i158 = i153 ^ 23;
                    int i159 = (i158 ^ i154) | (i154 & i158);
                    int i160 = i159 ^ i3;
                    int i161 = i159 & i3;
                    int i162 = (i161 & i160) | (i161 ^ i160);
                    int i163 = ~i162;
                    int i164 = (i162 | i163) & i163;
                    int i165 = (i147 & 23) | (i152 & (-24));
                    int i166 = i147 & (-24);
                    int i167 = ~((i166 & i165) | (i166 ^ i165));
                    int i168 = ((~i164) & i167) | ((~i167) & i164);
                    int i169 = i164 & i167;
                    int i170 = ((i169 ^ i168) | (i169 & i168)) * (-591);
                    int i171 = ((i157 ^ i170) | (i157 & i170)) << 1;
                    int i172 = -(((~i170) & i157) | ((~i157) & i170));
                    int i173 = (i171 & i172) + (i172 | i171);
                    int i174 = (i152 & intValue) | (intValue ^ i152);
                    int i175 = i174 & 23;
                    int i176 = (i174 | 23) & (~i175);
                    int i177 = ((i176 ^ i175) | (i176 & i175)) * 591;
                    int i178 = i173 & i177;
                    int i179 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i180 = i179 * (-337);
                    int i181 = ((-33222) & i180) + (i180 | (-33222));
                    int i182 = ~i179;
                    int i183 = (i182 | i179) & i182;
                    int i184 = i183 & i3;
                    int i185 = (i183 | i3) & (~i184);
                    int i186 = ~((i185 & i184) | (i185 ^ i184));
                    int i187 = i179 ^ 97;
                    int i188 = i179 & 97;
                    int i189 = (i187 ^ i188) | (i188 & i187);
                    int i190 = ~i189;
                    int i191 = (i189 | i190) & i190;
                    int i192 = ((~i186) & i191) | ((~i191) & i186) | (i191 & i186);
                    int i193 = i179 ^ intValue;
                    int i194 = i179 & intValue;
                    int i195 = ~((i193 ^ i194) | (i193 & i194));
                    int i196 = ((~i195) & i192) | ((~i192) & i195);
                    int i197 = i192 & i195;
                    int i198 = -(-(((i197 ^ i196) | (i197 & i196)) * (-338)));
                    int i199 = i181 & i198;
                    int i200 = i199 + ((i198 ^ i181) | i199);
                    int i201 = -(-((~((i182 ^ (-98)) | (i182 & (-98)))) * 338));
                    int i202 = i200 & i201;
                    int i203 = ((((i200 ^ i201) | i202) << 1) - (~(-((i201 | i200) & (~i202))))) - 1;
                    int i204 = i182 ^ i3;
                    int i205 = i182 & i3;
                    int i206 = ~((i204 ^ i205) | (i204 & i205));
                    int i207 = i179 & (-98);
                    int i208 = (i179 | (-98)) & (~i207);
                    int i209 = (i207 ^ i208) | (i207 & i208);
                    int i210 = ~((i209 ^ intValue) | (i209 & intValue));
                    int i211 = ((~i210) & i206) | ((~i206) & i210);
                    int i212 = i206 & i210;
                    int i213 = ((i212 ^ i211) | (i212 & i211)) * 338;
                    int i214 = i203 & i213;
                    int i215 = (i213 ^ i203) | i214;
                    byte b = (byte) (((i214 | i215) << 1) - (i215 ^ i214));
                    int i216 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int i217 = i216 * 765;
                    int i218 = 76350 & i217;
                    int i219 = (i218 - (~(-(-((i217 ^ 76350) | i218))))) - 1;
                    int i220 = ~i216;
                    int i221 = (i97 & i216) | (i3 & i220);
                    int i222 = i3 & i216;
                    int i223 = (i221 ^ i222) | (i221 & i222);
                    int i224 = ~i223;
                    int i225 = (i223 | i224) & i224;
                    int i226 = ((i225 ^ (-50)) | (i225 & (-50))) * 764;
                    int i227 = (i219 & i226) + (i226 | i219);
                    int i228 = i220 & (i220 | i216);
                    int i229 = i228 | (-50);
                    int i230 = ~i229;
                    int i231 = i3 & (-50);
                    int i232 = i231 | ((~i231) & (i3 | (-50)));
                    int i233 = ~i232;
                    int i234 = (i232 | i233) & i233;
                    int i235 = i230 ^ i234;
                    int i236 = i230 & i234;
                    int i237 = ((i236 ^ i235) | (i236 & i235)) * (-1528);
                    int i238 = i227 & i237;
                    int i239 = -(-((i237 ^ i227) | i238));
                    int i240 = (i238 & i239) + (i239 | i238);
                    int i241 = i228 & (-50);
                    int i242 = i229 & (~i241);
                    int i243 = ~((i241 ^ i242) | (i242 & i241));
                    int i244 = i216 & 49;
                    int i245 = ~(i244 | ((i216 | 49) & (~i244)));
                    int i246 = i243 & i245;
                    int i247 = ((i243 | i245) & (~i246)) | i246;
                    int i248 = ~(i216 | i4);
                    int i249 = ((~i248) & i247) | ((~i247) & i248);
                    int i250 = i248 & i247;
                    int i251 = ((i250 ^ i249) | (i250 & i249)) * 764;
                    int i252 = i240 & i251;
                    int i253 = (i251 | i240) & (~i252);
                    int i254 = -(-(i252 << 1));
                    short s = (short) (((i253 | i254) << 1) - (i253 ^ i254));
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b(((i111 | i112) << 1) - (i112 ^ i111), (((i135 | i136) << 1) - (i136 ^ i135)) + (((i146 & i145) | (i145 ^ i146)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE), ((i177 | i173) & (~i178)) + (i178 << 1), b, s, objArr4);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
                    byte[] bArr4 = new byte[1];
                    int i255 = getCardholderValidators + 61;
                    getAdditionalCheckTable = i255 % 128;
                    if (i255 % 2 == 0) {
                        int i256 = 5 / 2;
                    }
                    try {
                        int i257 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                        int i258 = -android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i259 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                        int i260 = i259 & (-24);
                        int i261 = (i259 ^ (-24)) | i260;
                        int i262 = -android.text.TextUtils.indexOf("", "", 0);
                        int i263 = ((i262 ^ 103) | (i262 & 103)) << 1;
                        int i264 = -(((~i262) & 103) | (i262 & (-104)));
                        byte b2 = (byte) ((i263 ^ i264) + ((i264 & i263) << 1));
                        int i265 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                        int i266 = i265 & 2;
                        short s2 = (short) (((((i265 ^ 2) | i266) << 1) - (~(-((i265 | 2) & (~i266))))) - 1);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(29496741 - (~i257), ((976674654 | i258) << 1) - (i258 ^ 976674654), (i260 ^ i261) + ((i261 & i260) << 1), b2, s2, objArr5);
                        java.util.Random.class.getMethod((java.lang.String) objArr5[0], byte[].class).invoke(invoke, bArr4);
                        int i267 = getAdditionalCheckTable;
                        int i268 = ((i267 | 106) << 1) - (i267 ^ 106);
                        getCardholderValidators = ((~i268) + (i268 << 1)) % 128;
                        try {
                            java.lang.Object[] objArr6 = {bArr3};
                            float complexToFloat = android.util.TypedValue.complexToFloat(0);
                            int i269 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i270 = (i269 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + 468346679;
                            int i271 = (i269 ^ intValue) | (i269 & intValue);
                            int i272 = ~i271;
                            int i273 = -(-(((i271 | i272) & i272) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                            int i274 = i270 & i273;
                            int i275 = ((i270 ^ i273) | i274) << 1;
                            int i276 = -((i270 | i273) & (~i274));
                            int i277 = ((i275 | i276) << 1) - (i276 ^ i275);
                            int i278 = (-976674656) & i269;
                            int i279 = ((-976674656) | i269) & (~i278);
                            int i280 = (i278 ^ i279) | (i279 & i278);
                            int i281 = (i280 & i5) | ((~i280) & i4);
                            int i282 = i280 & i4;
                            int i283 = -(-(((i282 ^ i281) | (i282 & i281)) * (-216)));
                            int i284 = ~((i269 ^ i4) | (i269 & i4));
                            int i285 = ((~i284) & 976674655) | ((-976674656) & i284);
                            int i286 = i284 & 976674655;
                            int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
                            int i287 = jumpTapTimeout * (-381);
                            int i288 = i287 & (-4608);
                            int i289 = ((i287 ^ (-4608)) | i288) << 1;
                            int i290 = -((i287 | (-4608)) & (~i288));
                            int i291 = ((i289 | i290) << 1) - (i290 ^ i289);
                            int i292 = ~jumpTapTimeout;
                            int i293 = i292 * (-191);
                            int i294 = (i291 & i293) + (i291 | i293);
                            int i295 = i3 & (-24);
                            int i296 = (intValue & 23) | i295;
                            int i297 = intValue & (-24);
                            int i298 = ~((i296 ^ i297) | (i296 & i297));
                            int i299 = jumpTapTimeout ^ i298;
                            int i300 = jumpTapTimeout & i298;
                            int i301 = -(~(-(-(((i300 ^ i299) | (i300 & i299)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))));
                            int i302 = (-2) - (~((i294 & i301) + (i301 | i294)));
                            int i303 = (i292 & 23) | ((~i292) & (-24));
                            int i304 = i292 & (-24);
                            int i305 = ~((i304 ^ i303) | (i304 & i303));
                            int i306 = (~i295) & (i3 | (-24));
                            int i307 = ~((i295 ^ i306) | (i295 & i306));
                            int i308 = ((~i307) & i305) | ((~i305) & i307);
                            int i309 = i305 & i307;
                            int i310 = -(-(((i309 ^ i308) | (i309 & i308)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                            int i311 = ((~i310) & i302) | ((~i302) & i310);
                            int i312 = -(-((i302 & i310) << 1));
                            int i313 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            int i314 = i313 & 103;
                            byte b3 = (byte) (i314 + ((i313 ^ 103) | i314));
                            int i315 = -(-android.view.View.combineMeasuredStates(0, 0));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b((complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 29496743, (((i277 | i283) << 1) - (i283 ^ i277)) + (((i286 ^ i285) | (i286 & i285)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE), ((i311 | i312) << 1) - (i312 ^ i311), b3, (short) (((i315 | 3) << 1) - (i315 ^ 3)), objArr7);
                            java.util.Random.class.getMethod((java.lang.String) objArr7[0], byte[].class).invoke(invoke, objArr6);
                            int i316 = getCardholderValidators;
                            int i317 = i316 & 85;
                            int i318 = -(-(i316 | 85));
                            getAdditionalCheckTable = (((i317 | i318) << 1) - (i318 ^ i317)) % 128;
                            bArr2 = bArr3;
                            int i319 = getAdditionalCheckTable;
                            int i320 = i319 & 79;
                            int i321 = ((i319 ^ 79) | i320) << 1;
                            int i322 = -((i319 | 79) & (~i320));
                            getCardholderValidators = ((i321 ^ i322) + ((i322 & i321) << 1)) % 128;
                            return bArr2;
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        }
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    java.lang.Throwable cause3 = th.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th;
                }
            }
            bArr = new byte[intValue];
            clsArr = null;
            try {
                throw null;
            } catch (java.security.NoSuchAlgorithmException unused2) {
            }
            java.lang.Object newInstance = java.util.Random.class.getDeclaredConstructor(clsArr).newInstance(clsArr);
            int i323 = getCardholderValidators;
            int i324 = i323 & 103;
            int i325 = ((i323 ^ 103) | i324) << 1;
            int i326 = -((~i324) & (i323 | 103));
            getAdditionalCheckTable = (((i325 | i326) << 1) - (i326 ^ i325)) % 128;
            getAdditionalCheckTable = ((((i323 | 100) << 1) - (i323 ^ 100)) - 1) % 128;
            java.lang.Object[] objArr8 = {bArr};
            int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
            int i327 = (packedPositionChild * 399) - 1115701032;
            int i328 = ~packedPositionChild;
            int i329 = ~((i328 & 29496744) | (i328 & (-29496745)) | ((~i328) & 29496744));
            int i330 = packedPositionChild & (-29496745);
            int i331 = (packedPositionChild ^ (-29496745)) | i330;
            int i332 = ~i331;
            int i333 = (i331 | i332) & i332;
            int i334 = ((~i329) & i333) | ((~i333) & i329) | (i329 & i333);
            int i335 = ~intValue;
            int i336 = (i335 & (-29496745)) | (intValue & 29496744);
            int i337 = intValue & (-29496745);
            int i338 = ~((i336 ^ i337) | (i336 & i337));
            int i339 = ((~i338) & i334) | ((~i334) & i338);
            int i340 = i334 & i338;
            int i341 = -(-(((i340 ^ i339) | (i340 & i339)) * 398));
            int i342 = i327 & i341;
            int i343 = (((i327 | i341) & (~i342)) - (~(-(-(i342 << 1))))) - 1;
            int i344 = -(-(((packedPositionChild ^ 29496744) | (packedPositionChild & 29496744)) * (-1194)));
            int i345 = i343 ^ i344;
            int i346 = (i343 & i344) << 1;
            int i347 = (i345 & i346) + (i346 | i345);
            int i348 = (i335 | intValue) & i335;
            int i349 = ~((i348 & (-29496745)) | (i348 ^ (-29496745)));
            int i350 = i328 & (i328 | packedPositionChild);
            int i351 = (i350 & (-29496745)) | ((~i350) & 29496744);
            int i352 = i350 & 29496744;
            int i353 = ~((i352 ^ i351) | (i352 & i351));
            int i354 = (i353 ^ i349) | (i353 & i349);
            int i355 = (packedPositionChild | (-29496745)) & (~i330);
            int i356 = ~((i355 ^ i330) | (i355 & i330));
            int i357 = -(-(((i356 & (~i354)) | ((~i356) & i354) | (i356 & i354)) * 398));
            int i358 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i359 = i358 * (-344);
            int i360 = (-968631888) & i359;
            int i361 = (i359 ^ (-968631888)) | i360;
            int i362 = ~i358;
            int i363 = i362 ^ (-976674655);
            int i364 = i362 & (-976674655);
            int i365 = ~((i363 ^ i364) | (i363 & i364));
            int i366 = ((~i362) & intValue) | (i362 & i335);
            int i367 = i362 & intValue;
            int i368 = ~((i366 ^ i367) | (i366 & i367));
            int i369 = i365 & i368;
            int i370 = ((((i360 | i361) << 1) - (i361 ^ i360)) - (~(-(~((((~i369) & (i365 | i368)) | i369) * 345))))) - 2;
            int i371 = (i362 | i358) & i362;
            int i372 = ~((i371 ^ i335) | (i371 & i335));
            int i373 = (976674654 & i358) | i364;
            int i374 = i358 & (-976674655);
            int i375 = (i374 ^ i373) | (i374 & i373);
            int i376 = ~i375;
            int i377 = (i375 | i376) & i376;
            int i378 = ((i377 & (~i372)) | ((~i377) & i372) | (i377 & i372)) * 345;
            int i379 = (~i364) & (i362 | (-976674655));
            int i380 = (i379 ^ i364) | (i364 & i379);
            int i381 = (i380 & i335) | ((~i380) & intValue);
            int i382 = i380 & intValue;
            int i383 = -(-((~((i382 ^ i381) | (i382 & i381))) * 345));
            int i384 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i385 = (i384 * (-958)) + 22034;
            int i386 = ((~i335) & 22) | (i335 & (-23));
            int i387 = i335 & 22;
            int i388 = ~((i386 ^ i387) | (i386 & i387));
            int i389 = ~i384;
            int i390 = (i389 | i384) & i389;
            byte[] bArr5 = bArr;
            int i391 = i390 & intValue;
            int i392 = (~i391) & (i390 | intValue);
            int i393 = ~((i392 ^ i391) | (i392 & i391));
            int i394 = i388 & i393;
            int i395 = (i393 | i388) & (~i394);
            int i396 = (i395 ^ i394) | (i395 & i394);
            int i397 = i348 & i384;
            int i398 = (i348 | i384) & (~i397);
            int i399 = ~((i398 ^ i397) | (i398 & i397));
            int i400 = ((i396 ^ i399) | (i396 & i399)) * 959;
            int i401 = i384 & (-23);
            int i402 = (~i401) & (i384 | (-23));
            int i403 = (((~i400) & i385) | ((~i385) & i400)) + ((i400 & i385) << 1) + ((~((i401 & i402) | (i401 ^ i402))) * (-959));
            int i404 = i389 ^ i335;
            int i405 = i389 & i335;
            int i406 = ~((i404 ^ i405) | (i404 & i405));
            int i407 = intValue & 22;
            int i408 = (intValue | 22) & (~i407);
            int i409 = ~((i407 ^ i408) | (i408 & i407));
            int i410 = i406 & i409;
            int i411 = (i406 | i409) & (~i410);
            int i412 = (i411 ^ i410) | (i411 & i410);
            int i413 = (i384 & intValue) | (i384 & i335) | (i389 & intValue);
            int i414 = ~i413;
            int i415 = (i413 | i414) & i414;
            int i416 = -(-(((i412 ^ i415) | (i415 & i412)) * 959));
            int i417 = i403 & i416;
            int i418 = -android.view.View.MeasureSpec.getMode(0);
            int i419 = i418 * (-244);
            int i420 = ((i419 | 25338) << 1) - (i419 ^ 25338);
            int i421 = i335 & (-104);
            int i422 = (i335 | (-104)) & (~i421);
            int i423 = (i422 ^ i421) | (i422 & i421);
            int i424 = ~i423;
            int i425 = (i423 | i424) & i424;
            int i426 = ~(i418 | (-104));
            int i427 = i425 & i426;
            int i428 = (i425 | i426) & (~i427);
            int i429 = -(-(((i428 ^ i427) | (i428 & i427)) * (-245)));
            int i430 = (i420 & i429) + (i429 | i420);
            int i431 = (intValue & 103) | i421;
            int i432 = intValue & (-104);
            int i433 = -(-((~((i431 ^ i432) | (i431 & i432))) * (-245)));
            int i434 = intValue ^ (-104);
            int i435 = ~((i434 ^ i432) | (i432 & i434));
            int i436 = ((~i435) & i418) | ((~i418) & i435);
            int i437 = i435 & i418;
            byte b4 = (byte) (((((i430 | i433) << 1) - (i433 ^ i430)) - (~(((i437 ^ i436) | (i437 & i436)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))) - 1);
            int i438 = -(~(-(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))));
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            b((i347 & i357) + (i357 | i347), (-2) - (~(((((i370 ^ i378) | (i370 & i378)) << 1) - (((~i378) & i370) | ((~i370) & i378))) - (~i383))), i417 + ((i416 ^ i403) | i417), b4, (short) (((i438 ^ 3) + ((i438 & 3) << 1)) - 1), objArr9);
            java.util.Random.class.getMethod((java.lang.String) objArr9[0], byte[].class).invoke(newInstance, objArr8);
            int i439 = getAdditionalCheckTable;
            int i440 = i439 & 1;
            int i441 = -(-(i439 | 1));
            getCardholderValidators = ((i440 & i441) + (i441 | i440)) % 128;
            bArr2 = bArr5;
            int i3192 = getAdditionalCheckTable;
            int i3202 = i3192 & 79;
            int i3212 = ((i3192 ^ 79) | i3202) << 1;
            int i3222 = -((i3192 | 79) & (~i3202));
            getCardholderValidators = ((i3212 ^ i3222) + ((i3222 & i3212) << 1)) % 128;
            return bArr2;
        } catch (java.lang.Throwable th5) {
            java.lang.Throwable cause4 = th5.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th5;
        }
    }

    private byte[] values(byte[] bArr, byte[] bArr2, com.payair.hce.setPivotX.values valuesVar) throws java.security.GeneralSecurityException {
        int i = getCardholderValidators;
        int i2 = i & 93;
        int i3 = ((i ^ 93) | i2) << 1;
        int i4 = -((i | 93) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        getAdditionalCheckTable = i5 % 128;
        if (i5 % 2 == 0) {
            com.payair.hce.setPivotX.values valuesVar2 = com.payair.hce.setPivotX.values.DigitizedCardProfile;
            throw new java.lang.ArithmeticException();
        }
        if (valuesVar == com.payair.hce.setPivotX.values.DigitizedCardProfile) {
            int i6 = getAdditionalCheckTable;
            getCardholderValidators = (((i6 | 27) << 1) - (i6 ^ 27)) % 128;
            byte[] AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(getCiacDecline(bArr), bArr2, com.payair.hce.setPivotX.values.DigitizedCardProfile);
            int i7 = getCardholderValidators;
            int i8 = (i7 ^ 29) + ((i7 & 29) << 1);
            getAdditionalCheckTable = i8 % 128;
            if (i8 % 2 != 0) {
                return AlternateContactlessPaymentDataJson;
            }
            throw null;
        }
        byte[] bArr3 = (byte[]) valueOf(new java.lang.Object[]{AlternateContactlessPaymentDataJson(bArr, bArr2, com.payair.hce.setPivotX.values.values)}, -1959683382, 1959683398, (int) java.lang.System.currentTimeMillis());
        int i9 = getCardholderValidators;
        int i10 = i9 & 17;
        int i11 = (i9 | 17) & (~i10);
        int i12 = i10 << 1;
        getAdditionalCheckTable = (((i11 | i12) << 1) - (i11 ^ i12)) % 128;
        return bArr3;
    }

    private byte[] AlternateContactlessPaymentDataJson(byte[] bArr, byte[] bArr2, com.payair.hce.setPivotX.values valuesVar) throws java.security.GeneralSecurityException {
        int i = getCardholderValidators;
        int i2 = ((i ^ 111) | (i & 111)) << 1;
        int i3 = -((i & (-112)) | ((~i) & 111));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getAdditionalCheckTable = i4 % 128;
        int i5 = i4 % 2;
        return (byte[]) valueOf(new java.lang.Object[]{bArr, bArr2, valuesVar, java.lang.Boolean.FALSE}, 717882300, -717882294, (int) java.lang.System.currentTimeMillis());
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = getAdditionalCheckTable;
        int i2 = (i + 41) % 128;
        getCardholderValidators = i2;
        if (bArr == null) {
            int i3 = (i2 ^ 3) + ((i2 & 3) << 1);
            getAdditionalCheckTable = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        int i4 = i + 108;
        getCardholderValidators = ((~i4) + (i4 << 1)) % 128;
        try {
            try {
                int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                int identityHashCode = java.lang.System.identityHashCode(setpivotx);
                int i5 = keyRepeatDelay * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                int i6 = i5 & (-17344);
                int i7 = -(-(i5 | (-17344)));
                int i8 = (i6 & i7) + (i7 | i6);
                int i9 = ~keyRepeatDelay;
                int i10 = (i9 | keyRepeatDelay) & i9;
                int i11 = i10 | (-65);
                int i12 = ~identityHashCode;
                int i13 = ~((i11 ^ i12) | (i11 & i12));
                int i14 = keyRepeatDelay | 64;
                int i15 = i14 & identityHashCode;
                int i16 = (i14 | identityHashCode) & (~i15);
                int i17 = ~((i16 ^ i15) | (i16 & i15));
                int i18 = ((~i17) & i13) | ((~i13) & i17);
                int i19 = i13 & i17;
                int i20 = -(-(((i19 ^ i18) | (i19 & i18)) * (-272)));
                int i21 = ((((~i20) & i8) | ((~i8) & i20)) - (~((i8 & i20) << 1))) - 1;
                int i22 = i10 ^ 64;
                int i23 = i10 & 64;
                int i24 = (i23 ^ i22) | (i23 & i22);
                int i25 = ~i24;
                int i26 = (i24 | i25) & i25;
                int i27 = (i12 & i9) | ((~i9) & identityHashCode);
                int i28 = i9 & identityHashCode;
                int i29 = ~((i28 ^ i27) | (i28 & i27));
                int i30 = i26 ^ i29;
                int i31 = i29 & i26;
                int i32 = ((i31 ^ i30) | (i31 & i30)) * (-272);
                int i33 = i21 & i32;
                int i34 = (i32 | i21) & (~i33);
                int i35 = i33 << 1;
                int i36 = (i34 & i35) + (i34 | i35);
                int i37 = keyRepeatDelay & identityHashCode;
                int i38 = -(-(((~(((keyRepeatDelay | identityHashCode) & (~i37)) | i37)) | 64) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
                int i39 = i36 ^ i38;
                int i40 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                int identityHashCode2 = java.lang.System.identityHashCode(setpivotx);
                int i41 = i40 * 51;
                int i42 = (i41 ^ (-1323)) + ((i41 & (-1323)) << 1);
                int i43 = i40 & identityHashCode2;
                int i44 = (~i43) & (i40 | identityHashCode2);
                int i45 = ~identityHashCode2;
                int i46 = -(-(((i44 ^ i43) | (i43 & i44)) * (-50)));
                int i47 = (i42 ^ i46) + ((i46 & i42) << 1);
                int i48 = ~i40;
                int i49 = (i48 | i40) & i48;
                int i50 = i49 ^ (-28);
                int i51 = i49 & (-28);
                int i52 = (i50 ^ i51) | (i50 & i51);
                int i53 = ~((i52 & i45) | ((~i52) & identityHashCode2) | (i52 & identityHashCode2));
                int i54 = (identityHashCode2 | i45) & i45;
                int i55 = i54 & (-28);
                int i56 = ((i54 | (-28)) & (~i55)) | i55;
                int i57 = (i56 & i48) | ((~i56) & i40);
                int i58 = i56 & i40;
                int i59 = ~((i58 ^ i57) | (i58 & i57));
                int i60 = i53 & i59;
                int i61 = (i53 | i59) & (~i60);
                int i62 = -(~(-(-(((i61 ^ i60) | (i61 & i60)) * 50))));
                int i63 = (((i47 | i62) << 1) - (i62 ^ i47)) - 1;
                int i64 = ~((i45 ^ (-28)) | (i45 & (-28)));
                int i65 = (i48 & (-28)) | (i40 & 27);
                int i66 = i40 & (-28);
                int i67 = ~((i65 ^ i66) | (i65 & i66));
                int i68 = i64 & i67;
                int i69 = (i64 | i67) & (~i68);
                int i70 = (i69 ^ i68) | (i69 & i68);
                int i71 = i45 & i40;
                int i72 = (i45 | i40) & (~i71);
                int i73 = ~((i72 ^ i71) | (i71 & i72));
                int i74 = ((i73 ^ i70) | (i70 & i73)) * 50;
                int i75 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int identityHashCode3 = java.lang.System.identityHashCode(setpivotx);
                int i76 = (i75 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION) - 26401914;
                int i77 = ~i75;
                int i78 = ~identityHashCode3;
                int i79 = ((~i77) & identityHashCode3) | (i77 & i78);
                int i80 = i77 & identityHashCode3;
                int i81 = (i79 & i80) | (i79 ^ i80);
                int i82 = ~i81;
                int i83 = (i81 | i82) & i82;
                int i84 = ((~i78) & 29238) | (i78 & (-29239));
                int i85 = i78 & 29238;
                int i86 = (i84 ^ i85) | (i84 & i85);
                int i87 = ~i86;
                int i88 = (i86 | i87) & i87;
                int i89 = i83 & i88;
                int i90 = (i83 | i88) & (~i89);
                int i91 = -(-(((i90 ^ i89) | (i90 & i89)) * (-1808)));
                int i92 = i76 & i91;
                int i93 = ((i76 ^ i91) | i92) << 1;
                int i94 = -((i91 | i76) & (~i92));
                int i95 = (i93 & i94) + (i94 | i93);
                int i96 = (i77 | i75) & i77;
                int i97 = i96 & (-29239);
                int i98 = (i96 | (-29239)) & (~i97);
                int i99 = (i98 ^ i97) | (i98 & i97);
                int i100 = (i78 | identityHashCode3) & i78;
                int i101 = i100 & i75;
                int i102 = i101 | (i100 ^ i75);
                int i103 = ((~((i102 & (-29239)) | ((~i102) & 29238) | (i102 & 29238))) | (~(((~i99) & identityHashCode3) | (i99 & i78) | (i99 & identityHashCode3)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN;
                int i104 = i95 & i103;
                int i105 = (i103 | i95) & (~i104);
                int i106 = -(-(i104 << 1));
                int i107 = (i105 ^ i106) + ((i105 & i106) << 1);
                int i108 = (i77 ^ 29238) | (i77 & 29238);
                int i109 = ~i108;
                int i110 = (i108 | i109) & i109;
                int i111 = ~((identityHashCode3 ^ (-29239)) | (identityHashCode3 & (-29239)));
                int i112 = (i110 ^ i111) | (i110 & i111);
                int i113 = (i100 & i77) | ((~i100) & i75);
                int i114 = ~((i113 ^ i101) | (i101 & i113));
                int i115 = -(-(((i112 ^ i114) | (i112 & i114)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                int i116 = ((~i115) & i107) | ((~i107) & i115);
                int i117 = -(-((i115 & i107) << 1));
                char c = (char) (((i116 | i117) << 1) - (i117 ^ i116));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((((i38 & i36) | i39) << 1) - i39, (((i63 ^ i74) | (i63 & i74)) << 1) - (((~i63) & i74) | ((~i74) & i63)), c, objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int identityHashCode4 = java.lang.System.identityHashCode(setpivotx);
                int i118 = lastIndexOf * (-589);
                int i119 = (252692336 & i118) + (i118 | 252692336);
                int i120 = ~identityHashCode4;
                int i121 = i120 ^ (-29496721);
                int i122 = i120 & (-29496721);
                int i123 = (i122 & i121) | (i121 ^ i122);
                int i124 = ~i123;
                int i125 = (i123 | i124) & i124;
                int i126 = lastIndexOf ^ (-29496721);
                int i127 = ~lastIndexOf;
                int i128 = lastIndexOf & (-29496721);
                int i129 = ~((i126 ^ i128) | (i126 & i128));
                int i130 = ((~i129) & i125) | ((~i125) & i129);
                int i131 = i125 & i129;
                int i132 = (i131 ^ i130) | (i131 & i130);
                int i133 = ~i120;
                int i134 = ~((i120 & i127) | (i133 & lastIndexOf) | (i120 & lastIndexOf));
                int i135 = ((~i132) & i134) | ((~i134) & i132);
                int i136 = i132 & i134;
                int i137 = (i136 ^ i135) | (i135 & i136);
                int i138 = (i127 | lastIndexOf) & i127;
                int i139 = (i138 & (-29496721)) | ((~i138) & 29496720);
                int i140 = i138 & 29496720;
                int i141 = (i140 ^ i139) | (i140 & i139);
                int i142 = (i141 & i120) | ((~i141) & identityHashCode4);
                int i143 = i141 & identityHashCode4;
                int i144 = (i143 ^ i142) | (i143 & i142);
                int i145 = ~i144;
                int i146 = (i144 | i145) & i145;
                int i147 = -(-(((i137 ^ i146) | (i137 & i146)) * 590));
                int i148 = i119 ^ i147;
                int i149 = ((((i119 & i147) | i148) << 1) - (~(-i148))) - 1;
                int i150 = i121 | i122;
                int i151 = ~i150;
                int i152 = (i150 | i151) & i151;
                int i153 = ~((((-29496721) | lastIndexOf) & (~i128)) | i128);
                int i154 = ((~i153) & i152) | ((~i152) & i153);
                int i155 = i153 & i152;
                int i156 = (i155 ^ i154) | (i155 & i154);
                int i157 = (identityHashCode4 | i120) & i120;
                int i158 = i157 & lastIndexOf;
                int i159 = (lastIndexOf | i157) & (~i158);
                int i160 = ~((i159 ^ i158) | (i159 & i158));
                int i161 = -(~(-(-(((i160 ^ i156) | (i160 & i156)) * (-1180)))));
                int i162 = ((i149 & i161) + (i161 | i149)) - 1;
                int i163 = i127 | i120;
                int i164 = ~i163;
                int i165 = (i163 | i164) & i164;
                int i166 = (i133 & 29496720) | i122;
                int i167 = i120 & 29496720;
                int i168 = (i167 ^ i166) | (i166 & i167);
                int i169 = ~i168;
                int i170 = (i168 | i169) & i169;
                int i171 = ((i165 ^ i170) | (i165 & i170)) * 590;
                int i172 = ((i162 ^ i171) | (i162 & i171)) << 1;
                int i173 = -(((~i171) & i162) | ((~i162) & i171));
                int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                int i174 = -(~(-((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                int i175 = -android.view.View.resolveSizeAndState(0, 0, 0);
                int identityHashCode5 = java.lang.System.identityHashCode(setpivotx);
                int i176 = i175 * 483;
                int i177 = i176 & (-23716);
                int i178 = ((i176 ^ (-23716)) | i177) << 1;
                int i179 = -((i176 | (-23716)) & (~i177));
                int i180 = (i178 & i179) + (i179 | i178);
                int i181 = ~i175;
                int i182 = (i181 | i175) & i181;
                int i183 = ~identityHashCode5;
                int i184 = i182 ^ i183;
                int i185 = i182 & i183;
                int i186 = ((~(((~i182) & 97) | (i182 & (-98)) | (i182 & 97))) | (~((i184 ^ i185) | (i185 & i184)))) * (-241);
                int i187 = i180 & i186;
                int i188 = (i180 ^ i186) | i187;
                int i189 = ((i187 | i188) << 1) - (i188 ^ i187);
                int i190 = i175 & (-98);
                int i191 = (~i190) & (i175 | (-98));
                int i192 = ((i190 ^ i191) | (i190 & i191)) * (-482);
                int i193 = i189 & i192;
                int i194 = (i192 | i189) & (~i193);
                int i195 = -(-(i193 << 1));
                int i196 = (i194 & i195) + (i194 | i195);
                int i197 = i175 & 97;
                int i198 = (i175 | 97) & (~i197);
                int i199 = ~((i198 ^ i197) | (i198 & i197));
                int i200 = i181 & i183;
                int i201 = ((i183 | i181) & (~i200)) | i200;
                int i202 = (i201 & 97) | ((~i201) & (-98));
                int i203 = i201 & (-98);
                int i204 = ~((i203 ^ i202) | (i203 & i202));
                int i205 = ((~i204) & i199) | ((~i199) & i204);
                int i206 = i199 & i204;
                int i207 = ((i206 ^ i205) | (i206 & i205)) * 241;
                int i208 = i196 & i207;
                byte b = (byte) (((((i196 ^ i207) | i208) << 1) - (~(-((i207 | i196) & (~i208))))) - 1);
                int i209 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                int i210 = i209 ^ (-49);
                short s = (short) (((((i209 & (-49)) | i210) << 1) - (~(-i210))) - 1);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b((i172 & i173) + (i173 | i172), bitsPerPixel + 976674648, (-2) - (~((i174 ^ (-25)) + ((i174 & (-25)) << 1))), b, s, objArr3);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, "SHA-256");
                int i211 = getAdditionalCheckTable;
                int i212 = (i211 & 48) + (i211 | 48);
                getCardholderValidators = ((~i212) + (i212 << 1)) % 128;
                try {
                    java.lang.Object[] objArr4 = {bArr};
                    int i213 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i214 = i213 & 64;
                    int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
                    int i215 = -(~(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                    int i216 = ((i215 | 29239) << 1) - (i215 ^ 29239);
                    char c2 = (char) ((~i216) + (i216 << 1));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a((i214 - (~((i213 ^ 64) | i214))) - 1, 27 - (jumpTapTimeout >> 16), c2, objArr5);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                    int red = android.graphics.Color.red(0);
                    int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                    int i217 = 976674644 ^ maxKeyCode;
                    int i218 = ((maxKeyCode & 976674644) | i217) << 1;
                    int i219 = -i217;
                    int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                    int identityHashCode6 = java.lang.System.identityHashCode(setpivotx);
                    int i220 = maximumDrawingCacheSize * (-344);
                    int i221 = (i220 & 8256) + (i220 | 8256);
                    int i222 = ~maximumDrawingCacheSize;
                    int i223 = (i222 ^ 23) | (i222 & 23);
                    int i224 = ~i223;
                    int i225 = i222 & identityHashCode6;
                    int i226 = (i222 | identityHashCode6) & (~i225);
                    int i227 = ~((i225 ^ i226) | (i226 & i225));
                    int i228 = i224 & i227;
                    int i229 = (((i224 | i227) & (~i228)) | i228) * 345;
                    int i230 = ((~i229) & i221) | ((~i221) & i229);
                    int i231 = -(-((i221 & i229) << 1));
                    int i232 = (i230 ^ i231) + ((i231 & i230) << 1);
                    int i233 = ~identityHashCode6;
                    int i234 = ((~i233) & i222) | ((~i222) & i233);
                    int i235 = i222 & i233;
                    int i236 = maximumDrawingCacheSize ^ 23;
                    int i237 = maximumDrawingCacheSize & 23;
                    int i238 = (i237 ^ i236) | (i237 & i236);
                    int i239 = ~i238;
                    int i240 = (((i238 | i239) & i239) | (~((i235 ^ i234) | (i235 & i234)))) * 345;
                    int i241 = i232 & i240;
                    int i242 = -(-((i240 ^ i232) | i241));
                    int i243 = (i241 & i242) + (i242 | i241);
                    int i244 = i223 & identityHashCode6;
                    int i245 = (identityHashCode6 | i223) & (~i244);
                    int i246 = (~((i244 ^ i245) | (i245 & i244))) * 345;
                    int i247 = ((~i246) & i243) | ((~i243) & i246);
                    int i248 = -(-((i246 & i243) << 1));
                    int i249 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int identityHashCode7 = java.lang.System.identityHashCode(setpivotx);
                    int i250 = (i249 * 319) - 16167;
                    int i251 = ~i249;
                    int i252 = (i251 | i249) & i251;
                    int i253 = ~identityHashCode7;
                    int i254 = ~(((~i252) & identityHashCode7) | (i252 & i253) | (i252 & identityHashCode7));
                    int i255 = i254 ^ (-52);
                    int i256 = i254 & (-52);
                    int i257 = ((i256 & i255) | (i255 ^ i256)) * (-318);
                    int i258 = ((((i250 ^ i257) | (i250 & i257)) << 1) - (~(-((i250 & (~i257)) | ((~i250) & i257))))) - 1;
                    int i259 = (identityHashCode7 ^ (-52)) | (identityHashCode7 & (-52));
                    int i260 = ~i259;
                    int i261 = (i259 | i260) & i260;
                    int i262 = i253 & i249;
                    int i263 = (~i262) & (i253 | i249);
                    int i264 = (i263 ^ i262) | (i262 & i263);
                    int i265 = ~((i264 ^ 51) | (i264 & 51));
                    int i266 = -(~(((i261 ^ i265) | (i261 & i265)) * 318));
                    int i267 = ((i258 ^ i266) + ((i266 & i258) << 1)) - 1;
                    int i268 = ((~i253) & (-52)) | (i253 & 51);
                    int i269 = i253 & (-52);
                    int i270 = (i268 ^ i269) | (i268 & i269);
                    int i271 = ~((i270 ^ i249) | (i270 & i249));
                    int i272 = (i251 & 51) | (i249 & (-52));
                    int i273 = i249 & 51;
                    int i274 = (i273 ^ i272) | (i273 & i272);
                    int i275 = (i274 ^ identityHashCode7) | (i274 & identityHashCode7);
                    int i276 = ~i275;
                    int i277 = (i275 | i276) & i276;
                    int i278 = ((~i277) & i271) | ((~i271) & i277);
                    int i279 = i277 & i271;
                    int i280 = ((i279 ^ i278) | (i279 & i278)) * 318;
                    byte b2 = (byte) ((i267 & i280) + (i280 | i267));
                    int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    int identityHashCode8 = java.lang.System.identityHashCode(setpivotx);
                    int i281 = packedPositionGroup * (-375);
                    int i282 = ((-43125) & i281) + (i281 | (-43125));
                    int i283 = ~packedPositionGroup;
                    int i284 = ~(i283 | (-116));
                    int i285 = (~i284) & identityHashCode8;
                    int i286 = ~identityHashCode8;
                    int i287 = i285 | (i286 & i284);
                    int i288 = i284 & identityHashCode8;
                    int i289 = (i288 & i287) | (i288 ^ i287);
                    int i290 = (packedPositionGroup & (-116)) | (i283 & 115);
                    int i291 = packedPositionGroup & 115;
                    int i292 = ~((i290 ^ i291) | (i290 & i291));
                    int i293 = i289 & i292;
                    int i294 = (i292 | i289) & (~i293);
                    int i295 = -(-(((i294 ^ i293) | (i293 & i294)) * 376));
                    int i296 = i282 & i295;
                    int i297 = (i296 - (~(-(-((i295 ^ i282) | i296))))) - 1;
                    int i298 = ~(i286 | packedPositionGroup);
                    int i299 = ~(i290 | i291);
                    int i300 = ((~i299) & i298) | ((~i298) & i299);
                    int i301 = i298 & i299;
                    int i302 = -(~(-(-(((i301 ^ i300) | (i301 & i300)) * (-376)))));
                    int i303 = ~(identityHashCode8 | i283);
                    int i304 = ((~i303) & 115) | (i303 & (-116));
                    int i305 = i303 & 115;
                    int i306 = ((((i297 & i302) + (i302 | i297)) - 1) - (~(-(~(((i305 & i304) | (i305 ^ i304)) * 376))))) - 1;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((29496737 ^ red) + ((red & 29496737) << 1), (i218 & i219) + (i218 | i219), (i247 ^ i248) + ((i248 & i247) << 1), b2, (short) ((~i306) + (i306 << 1)), objArr6);
                    byte[] bArr2 = (byte[]) cls2.getMethod((java.lang.String) objArr6[0], byte[].class).invoke(invoke, objArr4);
                    int i307 = getAdditionalCheckTable;
                    int i308 = i307 ^ 9;
                    int i309 = (i307 & 9) << 1;
                    getCardholderValidators = ((i308 ^ i309) + ((i308 & i309) << 1)) % 128;
                    int i310 = i307 & 47;
                    int i311 = (i307 ^ 47) | i310;
                    getCardholderValidators = (((i310 | i311) << 1) - (i310 ^ i311)) % 128;
                    int i312 = (i307 & 25) + (i307 | 25);
                    getCardholderValidators = i312 % 128;
                    if (i312 % 2 == 0) {
                        return bArr2;
                    }
                    throw null;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (java.security.NoSuchAlgorithmException e) {
            try {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e.toString()));
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        }
    }

    private byte[] DigitizedCardProfile(byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException {
        int i2 = getCardholderValidators;
        int i3 = (i2 & (-42)) | ((~i2) & 41);
        int i4 = -(-((i2 & 41) << 1));
        getAdditionalCheckTable = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        byte[] DigitizedCardProfile = DigitizedCardProfile(bArr, writeReplace(i, true), bArr2, com.payair.hce.setPivotX.values.DigitizedCardProfile);
        int i5 = getCardholderValidators;
        getAdditionalCheckTable = ((((i5 | 7) << 1) - (~(-((i5 & (-8)) | ((~i5) & 7))))) - 1) % 128;
        return DigitizedCardProfile;
    }

    private static /* synthetic */ java.lang.Object getCvmResetTimeout(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        com.payair.hce.getQueryExecutor getqueryexecutor = new com.payair.hce.getQueryExecutor(new com.payair.hce.close(new com.payair.hce.query(), new com.payair.hce.isMainThreadroom_runtime_release()));
        try {
            com.payair.hce.setContentInsetEndWithActions AlternateContactlessPaymentDataJson = com.payair.hce.setContentInsetEndWithActions.AlternateContactlessPaymentDataJson(com.payair.hce.setContentInsetsRelative.values(com.payair.hce.setEms.writeReplace(bArr2)).AlternateContactlessPaymentDataJson());
            getqueryexecutor.values(new com.payair.hce.showErrorNotification(false, AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(), AlternateContactlessPaymentDataJson.writeReplace()));
            getqueryexecutor.valueOf(bArr, bArr.length);
            byte[] values2 = getqueryexecutor.values();
            int i = getAdditionalCheckTable;
            int i2 = i | 39;
            int i3 = i2 << 1;
            int i4 = -((~(i & 39)) & i2);
            getCardholderValidators = ((i3 & i4) + (i4 | i3)) % 128;
            return values2;
        } catch (com.payair.hce.getSuspendingTransactionId | java.io.IOException e) {
            try {
                java.lang.Object[] objArr2 = {e.getMessage()};
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, (-2) - (~(38 - (~(-(-android.text.TextUtils.getTrimmedLength("")))))), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr2));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private static byte[] DigitizedCardProfile(byte[] bArr, byte[] bArr2, com.payair.hce.setPivotX.values valuesVar) throws java.security.GeneralSecurityException {
        int i;
        int i2 = getCardholderValidators;
        int i3 = i2 & 99;
        int i4 = ((i3 - (~(-(-((i2 ^ 99) | i3))))) - 1) % 128;
        getAdditionalCheckTable = i4;
        if (bArr2.length != 24) {
            int i5 = ((i4 & 74) + (i4 | 74)) - 1;
            getCardholderValidators = i5 % 128;
            if (i5 % 2 == 0 ? bArr2.length != 16 : bArr2.length != 93) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid 3DES key length: ");
                sb.append(bArr2.length);
                java.lang.String obj = sb.toString();
                int i6 = getAdditionalCheckTable;
                int i7 = i6 & 39;
                int i8 = (i6 ^ 39) | i7;
                getCardholderValidators = ((i7 ^ i8) + ((i7 & i8) << 1)) % 128;
                getCardholderValidators = (i6 + 49) % 128;
                try {
                    int i9 = -android.graphics.Color.rgb(0, 0, 0);
                    int i10 = i9 ^ (-16777216);
                    int i11 = -(-((i9 & (-16777216)) << 1));
                    int i12 = -(~(android.view.ViewConfiguration.getTouchSlop() >> 8));
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a((i10 & i11) + (i11 | i10), ((i12 & 38) + (i12 | 38)) - 1, (char) ((-2) - (~(-android.graphics.ImageFormat.getBitsPerPixel(0)))), objArr);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(java.lang.String.class).newInstance(obj));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        com.payair.hce.findFragmentByTag findfragmentbytag = new com.payair.hce.findFragmentByTag(new com.payair.hce.runInTransaction(new com.payair.hce.internalBeginTransaction()));
        byte[] bArr3 = new byte[24];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        if (bArr2.length == 16) {
            getCardholderValidators = (getAdditionalCheckTable + 97) % 128;
            java.lang.System.arraycopy(bArr2, 0, bArr3, 16, 8);
            int i13 = getAdditionalCheckTable;
            getCardholderValidators = ((((i13 | 96) << 1) - (i13 ^ 96)) - 1) % 128;
        }
        byte[] bArr4 = new byte[8];
        com.payair.hce.inTransaction intransaction = new com.payair.hce.inTransaction(new com.payair.hce.getErrorDialog(bArr3), bArr4, 8);
        if (valuesVar == com.payair.hce.setPivotX.values.DigitizedCardProfile) {
            int i14 = getCardholderValidators;
            getAdditionalCheckTable = (((i14 & 65) - (~(i14 | 65))) - 1) % 128;
            findfragmentbytag.DigitizedCardProfile(true, intransaction);
            int i15 = getCardholderValidators + 94;
            i = (~i15) + (i15 << 1);
        } else {
            findfragmentbytag.DigitizedCardProfile(false, intransaction);
            int i16 = getCardholderValidators;
            i = (((i16 | 66) << 1) - (i16 ^ 66)) - 1;
        }
        getAdditionalCheckTable = i % 128;
        byte[] bArr5 = new byte[findfragmentbytag.valueOf(bArr.length)];
        try {
            try {
                findfragmentbytag.values(bArr5, findfragmentbytag.valueOf(bArr, 0, bArr.length, bArr5));
                valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                int i17 = getCardholderValidators;
                int i18 = ((i17 ^ 107) - (~((i17 & 107) << 1))) - 1;
                getAdditionalCheckTable = i18 % 128;
                if (i18 % 2 != 0) {
                    return bArr5;
                }
                throw new java.lang.ArithmeticException();
            } catch (java.lang.Throwable th2) {
                valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr4}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                throw th2;
            }
        } catch (com.payair.hce.getSuspendingTransactionId e) {
            try {
                java.lang.Object[] objArr2 = {e.toString()};
                int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
                int i19 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(scrollDefaultDelay >> 16, (i19 & 38) + (i19 | 38), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr3);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr2));
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        }
    }

    private static byte[] DigitizedCardProfile(byte[] bArr, byte[] bArr2, byte[] bArr3, com.payair.hce.setPivotX.values valuesVar) throws java.security.GeneralSecurityException {
        com.payair.hce.findFragmentByTag findfragmentbytag = new com.payair.hce.findFragmentByTag(new com.payair.hce.setTransactionSuccessful(new com.payair.hce.isOpenInternalannotations()));
        com.payair.hce.inTransaction intransaction = new com.payair.hce.inTransaction(new com.payair.hce.getErrorDialog(bArr3), bArr2, bArr2.length);
        if (valuesVar != com.payair.hce.setPivotX.values.DigitizedCardProfile) {
            findfragmentbytag.DigitizedCardProfile(false, intransaction);
            int i = getCardholderValidators;
            int i2 = i & 49;
            int i3 = -(-((i ^ 49) | i2));
            getAdditionalCheckTable = ((i2 & i3) + (i3 | i2)) % 128;
        } else {
            int i4 = getAdditionalCheckTable;
            int i5 = (i4 | 49) << 1;
            int i6 = -(i4 ^ 49);
            getCardholderValidators = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
            findfragmentbytag.DigitizedCardProfile(true, intransaction);
        }
        byte[] bArr4 = new byte[findfragmentbytag.valueOf(bArr.length)];
        try {
            try {
                findfragmentbytag.values(bArr4, findfragmentbytag.valueOf(bArr, 0, bArr.length, bArr4));
                valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                int i7 = getAdditionalCheckTable;
                int i8 = (i7 ^ 117) + ((i7 & 117) << 1);
                getCardholderValidators = i8 % 128;
                if (i8 % 2 == 0) {
                    return bArr4;
                }
                throw null;
            } catch (com.payair.hce.getSuspendingTransactionId e) {
                try {
                    java.lang.Object[] objArr = {e.getMessage()};
                    int argb = android.graphics.Color.argb(0, 0, 0, 0);
                    int i9 = -(~(android.view.ViewConfiguration.getScrollBarSize() >> 8));
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(argb, ((i9 ^ 38) + ((i9 & 38) << 1)) - 1, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            valueOf(new java.lang.Object[]{bArr2}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            throw th2;
        }
    }

    private static /* synthetic */ java.lang.Object getCiacDecline(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int i = getCardholderValidators;
        int i2 = (((i & (-68)) | ((~i) & 67)) - (~(-(-((i & 67) << 1))))) - 1;
        getAdditionalCheckTable = i2 % 128;
        java.lang.Object[] objArr2 = {bArr};
        int i3 = i2 % 2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i3 == 0) {
            throw null;
        }
        byte[] bArr2 = (byte[]) valueOf(objArr2, 2143135889, -2143135886, (int) currentTimeMillis);
        int i4 = getAdditionalCheckTable;
        int i5 = (-2) - (~(((i4 | 110) << 1) - (i4 ^ 110)));
        getCardholderValidators = i5 % 128;
        if (i5 % 2 == 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.findFragmentByTag findfragmentbytag;
        com.payair.hce.getMCallbacksannotations intransaction;
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        com.payair.hce.setPivotX.values valuesVar = (com.payair.hce.setPivotX.values) objArr[2];
        boolean booleanValue = ((java.lang.Boolean) objArr[3]).booleanValue();
        com.payair.hce.isOpenInternalannotations isopeninternalannotations = new com.payair.hce.isOpenInternalannotations();
        if (booleanValue) {
            findfragmentbytag = new com.payair.hce.findFragmentByTag(isopeninternalannotations);
            getAdditionalCheckTable = (getCardholderValidators + 59) % 128;
        } else {
            com.payair.hce.findFragmentByTag findfragmentbytag2 = new com.payair.hce.findFragmentByTag(new com.payair.hce.runInTransaction(isopeninternalannotations));
            int i = getAdditionalCheckTable;
            int i2 = i & 33;
            getCardholderValidators = (i2 + ((i ^ 33) | i2)) % 128;
            findfragmentbytag = findfragmentbytag2;
        }
        byte[] bArr3 = new byte[16];
        if (booleanValue) {
            intransaction = new com.payair.hce.getErrorDialog(bArr2);
            getAdditionalCheckTable = (getCardholderValidators + 9) % 128;
        } else {
            intransaction = new com.payair.hce.inTransaction(new com.payair.hce.getErrorDialog(bArr2), bArr3, 16);
            int i3 = getCardholderValidators;
            getAdditionalCheckTable = ((i3 & 17) + (i3 | 17)) % 128;
        }
        if (valuesVar == com.payair.hce.setPivotX.values.DigitizedCardProfile) {
            int i4 = getCardholderValidators;
            int i5 = (i4 & 29) + (i4 | 29);
            getAdditionalCheckTable = i5 % 128;
            if (i5 % 2 == 0) {
                findfragmentbytag.DigitizedCardProfile(false, intransaction);
            } else {
                findfragmentbytag.DigitizedCardProfile(true, intransaction);
            }
            int i6 = getAdditionalCheckTable;
            int i7 = ((i6 ^ 64) + ((i6 & 64) << 1)) - 1;
            getCardholderValidators = i7 % 128;
            int i8 = i7 % 2;
        } else {
            findfragmentbytag.DigitizedCardProfile(false, intransaction);
            int i9 = getCardholderValidators;
            int i10 = (i9 & (-82)) | ((~i9) & 81);
            int i11 = -(-((i9 & 81) << 1));
            getAdditionalCheckTable = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
        }
        byte[] bArr4 = new byte[findfragmentbytag.valueOf(bArr.length)];
        try {
            try {
                findfragmentbytag.values(bArr4, findfragmentbytag.valueOf(bArr, 0, bArr.length, bArr4));
                valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                int i12 = getCardholderValidators;
                int i13 = i12 & 43;
                int i14 = -(-((i12 ^ 43) | i13));
                getAdditionalCheckTable = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
                return bArr4;
            } catch (com.payair.hce.getSuspendingTransactionId e) {
                try {
                    java.lang.Object[] objArr2 = {e.toString()};
                    int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                    int i15 = -(~(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(maxKeyCode >> 16, (-2) - (~(((i15 | 37) << 1) - (i15 ^ 37))), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr3);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr2));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            throw th2;
        }
    }

    private static byte[] getProfileVersion(byte[] bArr, byte[] bArr2, com.payair.hce.setPivotX.values valuesVar) throws java.security.GeneralSecurityException {
        com.payair.hce.findFragmentByTag findfragmentbytag = new com.payair.hce.findFragmentByTag(new com.payair.hce.runInTransaction(new com.payair.hce.querydefault()));
        byte[] bArr3 = new byte[8];
        com.payair.hce.inTransaction intransaction = new com.payair.hce.inTransaction(new com.payair.hce.getErrorDialog(bArr2), bArr3, 8);
        if (valuesVar == com.payair.hce.setPivotX.values.DigitizedCardProfile) {
            int i = getAdditionalCheckTable;
            int i2 = i & 21;
            int i3 = (i ^ 21) | i2;
            getCardholderValidators = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            findfragmentbytag.DigitizedCardProfile(true, intransaction);
            int i4 = getCardholderValidators + 92;
            getAdditionalCheckTable = ((~i4) + (i4 << 1)) % 128;
        } else {
            findfragmentbytag.DigitizedCardProfile(false, intransaction);
            getCardholderValidators = (getAdditionalCheckTable + 39) % 128;
        }
        byte[] bArr4 = new byte[findfragmentbytag.valueOf(bArr.length)];
        try {
            try {
                findfragmentbytag.values(bArr4, findfragmentbytag.valueOf(bArr, 0, bArr.length, bArr4));
                valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                int i5 = getAdditionalCheckTable;
                getCardholderValidators = ((-2) - (~((i5 & 114) + (i5 | 114)))) % 128;
                return bArr4;
            } catch (com.payair.hce.getSuspendingTransactionId e) {
                try {
                    java.lang.Object[] objArr = {e.toString()};
                    int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                    int i6 = -android.view.View.resolveSizeAndState(0, 0, 0);
                    int i7 = i6 * (-51);
                    int i8 = (i7 ^ 2014) + ((i7 & 2014) << 1);
                    int i9 = ~((int) java.lang.System.currentTimeMillis());
                    int i10 = i9 & i6;
                    int i11 = (~((i9 ^ i6) | i10 | 38)) * 52;
                    int i12 = i8 & i11;
                    int i13 = ((i11 | i8) & (~i12)) + (i12 << 1);
                    int i14 = ~((i9 ^ (-39)) | (i9 & (-39)));
                    int i15 = ~i6;
                    int i16 = (i15 & (-39)) | (i6 & 38) | (i6 & (-39));
                    int i17 = ~i16;
                    int i18 = (i16 | i17) & i17;
                    int i19 = i14 & i18;
                    int i20 = (i14 | i18) & (~i19);
                    int i21 = (i20 ^ i19) | (i20 & i19);
                    int i22 = (i9 | i6) & (~i10);
                    int i23 = ~((i10 ^ i22) | (i22 & i10));
                    int i24 = i21 & i23;
                    int i25 = (i21 | i23) & (~i24);
                    int i26 = -(-(((i25 ^ i24) | (i25 & i24)) * (-52)));
                    int i27 = i13 & i26;
                    int i28 = (i13 ^ i26) | i27;
                    int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                    int i30 = (i6 | i15) & i15;
                    int i31 = ((~i9) & i30) | ((~i30) & i9);
                    int i32 = i9 & i30;
                    int i33 = (i32 ^ i31) | (i31 & i32);
                    int i34 = ~i33;
                    int i35 = (i33 | i34) & i34;
                    int i36 = i30 & 38;
                    int i37 = (i30 | 38) & (~i36);
                    int i38 = (i37 ^ i36) | (i37 & i36);
                    int i39 = ~i38;
                    int i40 = (i38 | i39) & i39;
                    int i41 = i35 ^ i40;
                    int i42 = i40 & i35;
                    int i43 = -(-(((i42 ^ i41) | (i42 & i41)) * 52));
                    int i44 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                    int i45 = (i44 * 624) - 622;
                    int i46 = i44 & (-2);
                    int i47 = -(-((~((i44 ^ (-2)) | i46 | currentTimeMillis)) * 623));
                    int i48 = (i45 & i47) + (i45 | i47);
                    int i49 = ~currentTimeMillis;
                    int i50 = ~i44;
                    int i51 = ~((i50 & 1) | (i50 ^ 1));
                    int i52 = i49 ^ i51;
                    int i53 = i51 & i49;
                    int i54 = -(-(((i53 & i52) | (i52 ^ i53)) * (-623)));
                    int i55 = ((i48 | i54) << 1) - (((~i54) & i48) | ((~i48) & i54));
                    int i56 = (~i46) & (i44 | (-2));
                    int i57 = (i56 ^ i46) | (i46 & i56);
                    int i58 = ~i57;
                    int i59 = (i57 | i58) & i58;
                    int i60 = (i49 & (-2)) | (currentTimeMillis & 1);
                    int i61 = currentTimeMillis & (-2);
                    int i62 = (i60 & i61) | (i60 ^ i61);
                    int i63 = ~i62;
                    int i64 = (i62 | i63) & i63;
                    int i65 = ((~i64) & i59) | ((~i59) & i64);
                    int i66 = i59 & i64;
                    int i67 = (i66 ^ i65) | (i66 & i65);
                    int i68 = ~((i44 & currentTimeMillis) | (i44 & i49) | (currentTimeMillis & i50));
                    int i69 = -(~(((i67 ^ i68) | (i68 & i67)) * 623));
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(absoluteGravity, (i29 & i43) + (i43 | i29), (char) (((i55 & i69) + (i69 | i55)) - 1), objArr2);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            valueOf(new java.lang.Object[]{bArr3}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            throw th2;
        }
    }

    private static /* synthetic */ java.lang.Object getMagstripeCvmIssuerOptions(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        com.payair.hce.setPivotX.values valuesVar = (com.payair.hce.setPivotX.values) objArr[2];
        com.payair.hce.findFragmentByTag findfragmentbytag = new com.payair.hce.findFragmentByTag(new com.payair.hce.querydefault());
        if (valuesVar == com.payair.hce.setPivotX.values.DigitizedCardProfile) {
            findfragmentbytag.DigitizedCardProfile(true, new com.payair.hce.getErrorDialog(bArr2));
            int i = getCardholderValidators;
            int i2 = i & 73;
            int i3 = ((i ^ 73) | i2) << 1;
            int i4 = -((i | 73) & (~i2));
            getAdditionalCheckTable = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        } else {
            findfragmentbytag.DigitizedCardProfile(false, new com.payair.hce.getErrorDialog(bArr2));
            int i5 = getAdditionalCheckTable;
            getCardholderValidators = (((i5 | 85) << 1) - (i5 ^ 85)) % 128;
        }
        byte[] bArr3 = new byte[findfragmentbytag.valueOf(bArr.length)];
        try {
            try {
                findfragmentbytag.values(bArr3, findfragmentbytag.valueOf(bArr, 0, bArr.length, bArr3));
                valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                int i6 = getCardholderValidators;
                getAdditionalCheckTable = ((i6 & 101) + (i6 | 101)) % 128;
                return bArr3;
            } catch (com.payair.hce.getSuspendingTransactionId e) {
                try {
                    java.lang.Object[] objArr2 = {e.toString()};
                    int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                    int i7 = -(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    int i8 = i7 | 38;
                    int i9 = i8 << 1;
                    int i10 = -((~(i7 & 38)) & i8);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(keyRepeatTimeout >> 16, (i9 & i10) + (i10 | i9), (char) (android.os.Process.myTid() >> 22), objArr3);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr2));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
            throw th2;
        }
    }

    private void AlternateContactlessPaymentDataJson(com.payair.hce.setContentInsetsAbsolute setcontentinsetsabsolute, int i) throws java.security.GeneralSecurityException {
        try {
            this.SdkCoreAlternateContactlessPaymentDataImpl = new com.payair.hce.query();
            this.SdkCoreAlternateContactlessPaymentDataImpl.values(true, new com.payair.hce.showErrorNotification(true, (java.math.BigInteger) com.payair.hce.setContentInsetsAbsolute.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcontentinsetsabsolute}, -1663938761, 1663938761, java.lang.System.identityHashCode(setcontentinsetsabsolute)), (java.math.BigInteger) com.payair.hce.setContentInsetsAbsolute.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcontentinsetsabsolute}, 651586728, -651586720, java.lang.System.identityHashCode(setcontentinsetsabsolute))));
            getProfileVersion = i;
            int i2 = getAdditionalCheckTable + 95;
            getCardholderValidators = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (java.lang.Exception e) {
            try {
                java.lang.Object[] objArr = {e.toString()};
                int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                int i3 = doubleTapTimeout * (-1529);
                int i4 = (((i3 ^ (-29032)) | (i3 & (-29032))) << 1) - ((i3 & 29031) | ((~i3) & (-29032)));
                int i5 = ~doubleTapTimeout;
                int i6 = i5 & (-39);
                int i7 = (i5 ^ (-39)) | i6;
                int i8 = ~i;
                int i9 = ~((i7 ^ i8) | (i7 & i8));
                int i10 = i6 | ((~i5) & 38) | (i5 & 38);
                int i11 = (i10 ^ i) | (i10 & i);
                int i12 = ~i11;
                int i13 = (i11 | i12) & i12;
                int i14 = doubleTapTimeout & (-39);
                int i15 = (~i14) & (doubleTapTimeout | (-39));
                int i16 = (i14 ^ i15) | (i14 & i15);
                int i17 = -(-(((i9 ^ i13) | (i9 & i13) | (~((i16 & i) | (i16 ^ i)))) * 765));
                int i18 = i4 & i17;
                int i19 = i18 + ((i4 ^ i17) | i18);
                int i20 = (i5 | doubleTapTimeout) & i5;
                int i21 = i20 & (-39);
                int i22 = (i20 | (-39)) & (~i21);
                int i23 = (i22 ^ i21) | (i22 & i21);
                int i24 = ~i23;
                int i25 = (i23 | i24) & i24;
                int i26 = ~((i5 & i8) | (i5 ^ i8));
                int i27 = i25 ^ i26;
                int i28 = i25 & i26;
                int i29 = ((i28 ^ i27) | (i28 & i27)) * 1530;
                int i30 = i19 & i29;
                int i31 = (((i19 ^ i29) | i30) << 1) - ((i29 | i19) & (~i30));
                int i32 = i5 & i;
                int i33 = (i | i5) & (~i32);
                int i34 = (i33 ^ i32) | (i33 & i32);
                int i35 = ~i34;
                int i36 = (i34 | i35) & i35;
                int i37 = i8 ^ (-39);
                int i38 = i8 & (-39);
                int i39 = (i37 ^ i38) | (i37 & i38);
                int i40 = ~((doubleTapTimeout ^ i39) | (doubleTapTimeout & i39));
                int i41 = i36 ^ i40;
                int i42 = i36 & i40;
                int i43 = ((i42 ^ i41) | (i42 & i41)) * 765;
                int i44 = i31 & i43;
                int i45 = i43 | i31;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(offsetBefore, (i44 ^ i45) + ((i45 & i44) << 1), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private static /* synthetic */ java.lang.Object getCiacDeclineOnPpms(java.lang.Object[] objArr) {
        com.payair.hce.setPivotX setpivotx = (com.payair.hce.setPivotX) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        java.lang.String str = (java.lang.String) objArr[2];
        byte[] bArr2 = (byte[]) objArr[3];
        int i = getAdditionalCheckTable;
        int i2 = i & 43;
        int i3 = i | 43;
        int i4 = (i2 & i3) + (i3 | i2);
        getCardholderValidators = i4 % 128;
        if (i4 % 2 == 0) {
            byte[] bArr3 = (byte[]) valueOf(new java.lang.Object[]{setpivotx, str}, 869341976, -869341959, java.lang.System.identityHashCode(setpivotx));
            byte[] dualTapResetTimeout = setpivotx.getDualTapResetTimeout(bArr);
            byte[] bArr4 = (byte[]) valueOf(new java.lang.Object[]{setpivotx, (byte[]) valueOf(new java.lang.Object[]{(byte[]) valueOf(new java.lang.Object[]{setpivotx, dualTapResetTimeout, bArr2, com.payair.hce.setPivotX.values.DigitizedCardProfile}, -399686052, 399686088, java.lang.System.identityHashCode(setpivotx)), (byte[]) valueOf(new java.lang.Object[]{bArr3}, -1480239441, 1480239448, (int) java.lang.System.currentTimeMillis())}, -644104696, 644104721, (int) java.lang.System.currentTimeMillis()), bArr2, com.payair.hce.setPivotX.values.DigitizedCardProfile}, -399686052, 399686088, java.lang.System.identityHashCode(setpivotx));
            int i5 = getCardholderValidators;
            getAdditionalCheckTable = ((((i5 | 111) << 1) - (~(-((i5 & (-112)) | ((~i5) & 111))))) - 1) % 128;
            return bArr4;
        }
        byte[] bArr5 = (byte[]) valueOf(new java.lang.Object[]{setpivotx, str}, 869341976, -869341959, java.lang.System.identityHashCode(setpivotx));
        byte[] dualTapResetTimeout2 = setpivotx.getDualTapResetTimeout(bArr);
        throw null;
    }

    private static /* synthetic */ java.lang.Object getPaymentFci(java.lang.Object[] objArr) {
        byte[] SdkCoreAlternateContactlessPaymentDataImpl = ((com.payair.hce.setPivotX) objArr[0]).SdkCoreAlternateContactlessPaymentDataImpl(((java.lang.String) objArr[1]).getBytes(java.nio.charset.Charset.defaultCharset()));
        java.lang.String obj = new java.math.BigInteger(new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(SdkCoreAlternateContactlessPaymentDataImpl)), 16).toString();
        valueOf(new java.lang.Object[]{SdkCoreAlternateContactlessPaymentDataImpl}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (obj.length() < 16) {
            int i = getCardholderValidators;
            getAdditionalCheckTable = (((i & 63) - (~(i | 63))) - 1) % 128;
            int length = obj.length();
            int i2 = getAdditionalCheckTable;
            int i3 = (i2 & (-66)) | ((~i2) & 65);
            int i4 = (i2 & 65) << 1;
            getCardholderValidators = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
            while (length < 16) {
                int i5 = getAdditionalCheckTable;
                getCardholderValidators = ((i5 ^ 97) + ((i5 & 97) << 1)) % 128;
                sb.append("0");
                int i6 = length + 92;
                int i7 = (i6 & 90) | ((~i6) & (-91));
                int i8 = -(-((i6 & (-91)) << 1));
                length = (i8 ^ i7) + ((i8 & i7) << 1);
                int i9 = getCardholderValidators;
                getAdditionalCheckTable = ((i9 & 91) + (i9 | 91)) % 128;
            }
            sb.append(obj);
            int i10 = getAdditionalCheckTable;
            getCardholderValidators = ((((i10 & (-28)) | ((~i10) & 27)) - (~((i10 & 27) << 1))) - 1) % 128;
        } else {
            int length2 = obj.length();
            sb.append(obj.substring(((length2 & (-15)) + (length2 | (-15))) - 1, obj.length()));
            getAdditionalCheckTable = (getCardholderValidators + 89) % 128;
        }
        byte[] bytes = sb.toString().getBytes(java.nio.charset.Charset.defaultCharset());
        int i11 = getCardholderValidators + 67;
        getAdditionalCheckTable = i11 % 128;
        if (i11 % 2 != 0) {
            return bytes;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        byte b;
        boolean z;
        int i;
        byte[] bArr = (byte[]) objArr[0];
        int i2 = getCardholderValidators;
        int i3 = i2 & 119;
        int i4 = ((i2 ^ 119) | i3) << 1;
        int i5 = -((i2 | 119) & (~i3));
        int i6 = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
        getAdditionalCheckTable = i6;
        try {
            if (bArr != null) {
                int i7 = i6 & 13;
                int i8 = (i7 - (~(-(-((i6 ^ 13) | i7))))) - 1;
                getCardholderValidators = i8 % 128;
                if (i8 % 2 != 0) {
                    int length = bArr.length;
                    throw new java.lang.ArithmeticException();
                }
                if (bArr.length != 0) {
                    int i9 = i6 | 111;
                    int i10 = i9 << 1;
                    int i11 = -(i9 & (~(i6 & 111)));
                    int i12 = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
                    getCardholderValidators = i12;
                    if (bArr.length > 19) {
                        int i13 = i12 & 47;
                        int i14 = -(-((i12 ^ 47) | i13));
                        getAdditionalCheckTable = ((i13 ^ i14) + ((i13 & i14) << 1)) % 128;
                        int i15 = ((i12 ^ 3) | (i12 & 3)) << 1;
                        int i16 = -(((~i12) & 3) | (i12 & (-4)));
                        getAdditionalCheckTable = ((i15 ^ i16) + ((i15 & i16) << 1)) % 128;
                        int i17 = i12 & 93;
                        getAdditionalCheckTable = ((((i12 ^ 93) | i17) << 1) - ((~i17) & (i12 | 93))) % 128;
                        java.lang.Object[] objArr2 = {"Invalid length of input data"};
                        float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                        int i18 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                        int i19 = (i18 * (-337)) + 12882;
                        int i20 = ~i18;
                        int i21 = ~currentTimeMillis;
                        int i22 = (i21 & i20) | (i20 ^ i21);
                        int i23 = ~i22;
                        int i24 = (i22 | i23) & i23;
                        int i25 = ~((i18 & (-39)) | (i18 ^ (-39)));
                        int i26 = i24 & i25;
                        int i27 = (i24 | i25) & (~i26);
                        int i28 = (i27 ^ i26) | (i27 & i26);
                        int i29 = ~((i18 ^ currentTimeMillis) | (i18 & currentTimeMillis));
                        int i30 = ((~i29) & i28) | ((~i28) & i29);
                        int i31 = i28 & i29;
                        int i32 = -(-(((i31 ^ i30) | (i31 & i30)) * (-338)));
                        int i33 = (i19 | i32) << 1;
                        int i34 = -(i19 ^ i32);
                        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                        int i36 = (i20 | i18) & i20;
                        int i37 = (i36 & (-39)) | ((~i36) & 38);
                        int i38 = i36 & 38;
                        int i39 = (i37 ^ i38) | (i38 & i37);
                        int i40 = ~i39;
                        int i41 = -(-(((i39 | i40) & i40) * 338));
                        int i42 = i35 & i41;
                        int i43 = -(-((i41 ^ i35) | i42));
                        int i44 = i21 & (i21 | currentTimeMillis);
                        int i45 = i36 ^ i44;
                        int i46 = i36 & i44;
                        int i47 = (i46 ^ i45) | (i46 & i45);
                        int i48 = ~i47;
                        int i49 = (i47 | i48) & i48;
                        int i50 = i18 ^ 38;
                        int i51 = i18 & 38;
                        int i52 = (i51 ^ i50) | (i51 & i50);
                        int i53 = i52 ^ currentTimeMillis;
                        int i54 = i52 & currentTimeMillis;
                        int i55 = (i54 ^ i53) | (i54 & i53);
                        int i56 = ~i55;
                        int i57 = (i55 | i56) & i56;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a((complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), (((i42 ^ i43) + ((i43 & i42) << 1)) - (~(((i57 ^ i49) | (i57 & i49)) * 338))) - 1, (char) android.graphics.Color.green(0), objArr3);
                        throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr2));
                    }
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[16];
                    if (length2 < 12) {
                        getAdditionalCheckTable = (i12 + 47) % 128;
                        byte[] bArr3 = new byte[12];
                        int i58 = -length2;
                        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                        int i59 = i58 * 980;
                        int i60 = ~currentTimeMillis2;
                        int i61 = ((~i60) & (-13)) | (i60 & 12);
                        int i62 = i60 & (-13);
                        int i63 = ((((i59 ^ (-11736)) - (~((i59 & (-11736)) << 1))) - 1) - (~(-(-((~((i61 ^ i62) | (i61 & i62))) * 979))))) - 1;
                        int i64 = i58 & currentTimeMillis2;
                        int i65 = (i64 | ((~i64) & (i58 | currentTimeMillis2))) * (-979);
                        int i66 = i63 & i65;
                        int i67 = -(-((i65 ^ i63) | i66));
                        int i68 = i62 | (currentTimeMillis2 & 12);
                        int i69 = currentTimeMillis2 & (-13);
                        int i70 = (i68 ^ i69) | (i68 & i69);
                        int i71 = ~i70;
                        int i72 = (i70 | i71) & i71;
                        int i73 = (currentTimeMillis2 | i60) & i60;
                        int i74 = ((~i58) & i73) | ((~i73) & i58);
                        int i75 = i58 & i73;
                        int i76 = (i75 ^ i74) | (i75 & i74);
                        int i77 = ~i76;
                        int i78 = (i76 | i77) & i77;
                        int i79 = i72 ^ i78;
                        int i80 = i78 & i72;
                        java.lang.System.arraycopy(bArr, 0, bArr3, ((i66 - (~i67)) - 1) + (((i80 ^ i79) | (i80 & i79)) * 979), length2);
                        int i81 = getAdditionalCheckTable;
                        int i82 = i81 & 113;
                        int i83 = (i81 ^ 113) | i82;
                        getCardholderValidators = ((i82 & i83) + (i83 | i82)) % 128;
                        bArr = bArr3;
                        length2 = 12;
                        b = 0;
                    } else {
                        int length3 = bArr.length - 11;
                        b = (byte) ((~length3) + (length3 << 1));
                        getCardholderValidators = ((((i6 & (-4)) | ((~i6) & 3)) - (~((i6 & 3) << 1))) - 1) % 128;
                    }
                    if (length2 % 2 == 0) {
                        int i84 = (getAdditionalCheckTable + 91) % 128;
                        getCardholderValidators = i84;
                        int i85 = i84 & 47;
                        getAdditionalCheckTable = (((i84 | 47) & (~i85)) + (i85 << 1)) % 128;
                        z = true;
                    } else {
                        int i86 = getAdditionalCheckTable;
                        int i87 = i86 & 121;
                        int i88 = (i86 | 121) & (~i87);
                        int i89 = i87 << 1;
                        getCardholderValidators = ((i88 & i89) + (i88 | i89)) % 128;
                        z = false;
                    }
                    bArr2[0] = b;
                    byte b2 = (byte) (b << 4);
                    bArr2[0] = b2;
                    byte b3 = (byte) (bArr[0] & com.google.common.base.Ascii.SI);
                    int i90 = ((~b3) & b2) | ((~b2) & b3);
                    int i91 = b2 & b3;
                    bArr2[0] = (byte) ((i91 ^ i90) | (i91 & i90));
                    if (z) {
                        int i92 = getCardholderValidators;
                        getAdditionalCheckTable = (((i92 | 101) << 1) - (i92 ^ 101)) % 128;
                        int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                        int i93 = length2 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE;
                        int i94 = i93 ^ my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DUKPT_KEY_INVALID;
                        int i95 = ((i93 & my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DUKPT_KEY_INVALID) | i94) << 1;
                        int i96 = -i94;
                        int i97 = ~length2;
                        int i98 = i97 ^ currentTimeMillis3;
                        int i99 = i97 & currentTimeMillis3;
                        int i100 = ~((i98 ^ i99) | (i98 & i99));
                        int i101 = ~currentTimeMillis3;
                        int i102 = (i101 | currentTimeMillis3) & i101;
                        int i103 = i102 ^ length2;
                        int i104 = i102 & length2;
                        int i105 = ~((i103 ^ i104) | (i104 & i103));
                        int i106 = i100 ^ i105;
                        int i107 = i100 & i105;
                        int i108 = ((((i95 | i96) << 1) - (i95 ^ i96)) - (~(((i107 & i106) | (i106 ^ i107)) * (-516)))) - 1;
                        int i109 = (i97 | length2) & i97;
                        int i110 = i109 & currentTimeMillis3;
                        int i111 = (currentTimeMillis3 | i109) & (~i110);
                        int i112 = ~((i111 ^ i110) | (i111 & i110));
                        int i113 = ~(i104 | i103);
                        int i114 = -(-(((i112 ^ i113) | (i112 & i113)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
                        int i115 = (i101 & i97) | ((~i101) & length2);
                        int i116 = i101 & length2;
                        int i117 = (i115 ^ i116) | (i115 & i116);
                        int i118 = ~i117;
                        int i119 = (i117 | i118) & i118;
                        int i120 = i97 & i119;
                        int i121 = (i119 | i97) & (~i120);
                        int i122 = (((i114 ^ i108) - (~(-(-((i114 & i108) << 1))))) - 1) - (~(((i121 & i120) | (i121 ^ i120)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
                        i = (~i122) + (i122 << 1);
                        int i123 = getAdditionalCheckTable;
                        getCardholderValidators = ((i123 ^ 41) + ((i123 & 41) << 1)) % 128;
                    } else {
                        int i124 = getAdditionalCheckTable;
                        int i125 = i124 & 1;
                        int i126 = -(-((i124 ^ 1) | i125));
                        getCardholderValidators = (((i125 | i126) << 1) - (i126 ^ i125)) % 128;
                        i = length2;
                    }
                    int i127 = getAdditionalCheckTable;
                    int i128 = i127 & 57;
                    int i129 = (i127 | 57) & (~i128);
                    int i130 = -(-(i128 << 1));
                    getCardholderValidators = ((i129 & i130) + (i129 | i130)) % 128;
                    int i131 = 1;
                    int i132 = 1;
                    while (i131 < i) {
                        int i133 = getAdditionalCheckTable;
                        int i134 = i133 & 51;
                        int i135 = (((i133 ^ 51) | i134) << 1) - ((i133 | 51) & (~i134));
                        getCardholderValidators = i135 % 128;
                        if (i135 % 2 != 0) {
                            byte b4 = bArr[i131];
                            bArr2[i132] = b4;
                            int i136 = b4 & 4;
                            byte b5 = (byte) (((((b4 ^ 4) | i136) << 1) - ((b4 | 4) & (~i136))) & 24913);
                            bArr2[i132] = b5;
                            byte b6 = (byte) (bArr[i131 << 1] & 7);
                            bArr2[i132] = (byte) (((~b5) & b6) | ((~b6) & b5) | (b5 & b6));
                            int i137 = (i132 ^ 88) + ((i132 & 88) << 1);
                            int i138 = (~i137) + (i137 << 1);
                            int i139 = i138 ^ (-22);
                            int i140 = (i138 & (-22)) << 1;
                            int i141 = (i131 & 3) + (i131 | 3);
                            i131 = (i141 ^ 37) + ((i141 & 37) << 1);
                            i132 = (i140 | i139) + (i139 & i140);
                        } else {
                            byte b7 = bArr[i131];
                            bArr2[i132] = b7;
                            byte b8 = (byte) ((b7 << 4) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                            bArr2[i132] = b8;
                            i131 += 2;
                            byte b9 = (byte) (bArr[(~i131) + (i131 << 1)] & com.google.common.base.Ascii.SI);
                            int i142 = b8 ^ b9;
                            int i143 = b8 & b9;
                            bArr2[i132] = (byte) ((i143 ^ i142) | (i143 & i142));
                            i132++;
                        }
                    }
                    if (z) {
                        int i144 = getCardholderValidators;
                        int i145 = i144 & 65;
                        getAdditionalCheckTable = ((((i144 ^ 65) | i145) << 1) - ((i144 | 65) & (~i145))) % 128;
                        int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                        int i146 = (length2 * (-575)) + 575;
                        int i147 = ~length2;
                        int i148 = ~i147;
                        int i149 = (length2 | i147) & i147;
                        int i150 = i149 & currentTimeMillis4;
                        int i151 = (i149 | currentTimeMillis4) & (~i150);
                        int i152 = ~((i150 ^ i151) | (i151 & i150));
                        int i153 = ((~i152) & i148) | ((~i148) & i152);
                        int i154 = i148 & i152;
                        int i155 = ((i154 ^ i153) | (i154 & i153)) * 576;
                        int i156 = i146 & i155;
                        int i157 = ~currentTimeMillis4;
                        int i158 = (i157 ^ i147) | (i157 & i147);
                        int i159 = ~(i158 | (~i158));
                        int i160 = ((i156 + ((i146 ^ i155) | i156)) - (~(-(-(((i159 ^ i147) | (i159 & i147)) * 576))))) - 1;
                        int i161 = (~i149) * 576;
                        int i162 = i160 & i161;
                        int i163 = -(-((i161 ^ i160) | i162));
                        byte b10 = bArr[(i162 ^ i163) + ((i163 & i162) << 1)];
                        bArr2[i132] = b10;
                        bArr2[i132] = (byte) (b10 << 4);
                        getCardholderValidators = ((-2) - (~(getAdditionalCheckTable + 114))) % 128;
                    }
                    int i164 = getCardholderValidators;
                    int i165 = (i164 & 95) + (i164 | 95);
                    getAdditionalCheckTable = i165 % 128;
                    if (i165 % 2 != 0) {
                        return bArr2;
                    }
                    throw null;
                }
            }
            int i166 = i6 & 95;
            int i167 = -(-((i6 ^ 95) | i166));
            int i168 = (i166 & i167) + (i166 | i167);
            getCardholderValidators = i168 % 128;
            if (i168 % 2 != 0) {
                int i169 = 3 / 3;
            }
            java.lang.Object[] objArr4 = {"Input data is null"};
            int i170 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int i171 = -(-((~i170) | i170));
            int i172 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i173 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
            int i174 = i173 * (-1529);
            int i175 = ((((i174 ^ (-764)) | (i174 & (-764))) << 1) - (~(-((i174 & 763) | ((~i174) & (-764)))))) - 1;
            int i176 = ~i173;
            int i177 = ~i176;
            int i178 = (i176 & 1) | (i177 & (-2));
            int i179 = i176 & (-2);
            int i180 = i178 | i179;
            int i181 = ~currentTimeMillis5;
            int i182 = ~((i180 & i181) | (i180 ^ i181));
            int i183 = i176 & (i176 | i173);
            int i184 = (i183 ^ 1) | (i183 & 1);
            int i185 = i184 & currentTimeMillis5;
            int i186 = (~i185) & (i184 | currentTimeMillis5);
            int i187 = (i185 & i186) | (i185 ^ i186);
            int i188 = ~i187;
            int i189 = (i187 | i188) & i188;
            int i190 = ((~i182) & i189) | ((~i189) & i182);
            int i191 = i189 & i182;
            int i192 = (i191 ^ i190) | (i191 & i190);
            int i193 = i173 ^ (-2);
            int i194 = i173 & (-2);
            int i195 = (i193 ^ i194) | (i193 & i194);
            int i196 = ((~i195) & currentTimeMillis5) | (i195 & i181);
            int i197 = i195 & currentTimeMillis5;
            int i198 = ~((i197 ^ i196) | (i197 & i196));
            int i199 = i192 ^ i198;
            int i200 = i192 & i198;
            int i201 = ((i200 ^ i199) | (i200 & i199)) * 765;
            int i202 = i175 & i201;
            int i203 = ((i175 ^ i201) | i202) << 1;
            int i204 = -((i201 | i175) & (~i202));
            int i205 = (i203 & i204) + (i204 | i203);
            int i206 = ~((i178 & i179) | (i178 ^ i179));
            int i207 = i183 & i181;
            int i208 = ~(i207 | ((i183 | i181) & (~i207)));
            int i209 = ((~i208) & i206) | ((~i206) & i208);
            int i210 = i206 & i208;
            int i211 = -(-(((i210 ^ i209) | (i210 & i209)) * 1530));
            int i212 = (i176 & i181) | (i177 & currentTimeMillis5);
            int i213 = currentTimeMillis5 & i176;
            int i214 = ~((i212 ^ i213) | (i212 & i213));
            int i215 = i181 & (-2);
            int i216 = (~i215) & (i181 | (-2));
            int i217 = (i215 ^ i216) | (i215 & i216);
            int i218 = i217 ^ i173;
            int i219 = i173 & i217;
            int i220 = ~((i219 ^ i218) | (i219 & i218));
            char c = (char) ((((((i205 ^ i211) | (i205 & i211)) << 1) - (((~i211) & i205) | ((~i205) & i211))) - (~(-(~(((i214 & i220) | (((~i220) & i214) | ((~i214) & i220))) * 765))))) - 2);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(((i170 | i171) << 1) - (i170 ^ i171), ((i172 & 39) - (~(-(-(i172 | 39))))) - 1, c, objArr5);
            throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr5[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr4));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.payair.hce.sendUpdateRNSInformation
    public final byte[] SdkCoreAlternateContactlessPaymentDataImpl(byte[] bArr) {
        int i = getAdditionalCheckTable;
        int i2 = i & 71;
        int i3 = ((i2 - (~((i ^ 71) | i2))) - 1) % 128;
        getCardholderValidators = i3;
        if (bArr == null) {
            int i4 = (i + 31) % 128;
            getCardholderValidators = i4;
            int i5 = i4 & 63;
            getAdditionalCheckTable = (i5 + ((i4 ^ 63) | i5)) % 128;
            return null;
        }
        int i6 = (i3 & (-120)) | ((~i3) & 119);
        int i7 = (i3 & 119) << 1;
        getAdditionalCheckTable = ((i6 ^ i7) + ((i6 & i7) << 1)) % 128;
        int i8 = i3 & 111;
        int i9 = (i3 ^ 111) | i8;
        getAdditionalCheckTable = ((i8 & i9) + (i8 | i9)) % 128;
        try {
            try {
                int i10 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i11 = -(~(-(-(i10 * 530))));
                int i12 = (((i11 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO) << 1) - (i11 ^ org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO)) - 1;
                int i13 = 34450 & i12;
                int i14 = (i12 | 34450) & (~i13);
                int i15 = -(-(i13 << 1));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                int i17 = ~identityHashCode;
                int i18 = ~i10;
                int i19 = (i17 & i18) | ((~i17) & i10);
                int i20 = i17 & i10;
                int i21 = ~(i19 | i20);
                int i22 = i10 & 65;
                int i23 = (~i22) & (i10 | 65);
                int i24 = ~((i22 & i23) | (i23 ^ i22));
                int i25 = i21 & i24;
                int i26 = (i21 | i24) & (~i25);
                int i27 = ((i26 ^ i25) | (i26 & i25)) * 529;
                int i28 = i16 & i27;
                int i29 = ((i16 ^ i27) | i28) << 1;
                int i30 = -((i16 | i27) & (~i28));
                int i31 = i20 | (i18 & identityHashCode);
                int i32 = i10 & identityHashCode;
                int i33 = ~((i32 ^ i31) | (i31 & i32));
                int i34 = i33 & (-66);
                int i35 = (i33 | (-66)) & (~i34);
                int i36 = -(-(((i35 ^ i34) | (i35 & i34)) * 529));
                int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                int i37 = -android.text.TextUtils.getTrimmedLength("");
                int i38 = i37 & 29238;
                int i39 = -(-((i37 ^ 29238) | i38));
                char c = (char) (((i38 | i39) << 1) - (i39 ^ i38));
                java.lang.Object[] objArr = new java.lang.Object[1];
                a((-2) - (~((((i29 | i30) << 1) - (i30 ^ i29)) - (~i36))), 27 - (keyRepeatTimeout >> 16), c, objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                int identityHashCode2 = java.lang.System.identityHashCode(this);
                int i40 = makeMeasureSpec * 567;
                int i41 = ~makeMeasureSpec;
                int i42 = (i41 | makeMeasureSpec) & i41;
                int i43 = 29496719 ^ i42;
                int i44 = 29496719 & i42;
                int i45 = (i43 & i44) | (i43 ^ i44);
                int i46 = ~i45;
                int i47 = (i45 | i46) & i46;
                int i48 = i41 & identityHashCode2;
                int i49 = (~i48) & (i41 | identityHashCode2);
                int i50 = ~((i48 & i49) | (i48 ^ i49));
                int i51 = ((((514222949 | i40) << 1) - (i40 ^ 514222949)) - (~(-(-(((((~i50) & i47) | ((~i47) & i50)) | (i47 & i50)) * (-566)))))) - 1;
                int i52 = (i41 & (-29496720)) | (29496719 & makeMeasureSpec);
                int i53 = makeMeasureSpec & (-29496720);
                int i54 = (i53 ^ i52) | (i52 & i53);
                int i55 = ~i54;
                int i56 = -(-(((i54 | i55) & i55) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST));
                int i57 = i51 & i56;
                int i58 = -(-((i56 ^ i51) | i57));
                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                int i60 = -(-((~((i42 & (-29496720)) | ((-29496720) ^ i42) | identityHashCode2)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST));
                int i61 = -android.view.MotionEvent.axisFromString("");
                int identityHashCode3 = java.lang.System.identityHashCode(this);
                int i62 = i61 * (-337);
                int i63 = ((((380223202 ^ i62) | (380223202 & i62)) << 1) - (~(-((i62 & (-380223203)) | ((~i62) & 380223202))))) - 1;
                int i64 = ~i61;
                int i65 = (i64 | i61) & i64;
                int i66 = ~identityHashCode3;
                int i67 = (i65 ^ i66) | (i65 & i66);
                int i68 = ~i67;
                int i69 = (i67 | i68) & i68;
                int i70 = (-976674647) & i61;
                int i71 = (~i70) & (i61 | (-976674647));
                int i72 = ~((i71 ^ i70) | (i70 & i71));
                int i73 = i69 & i72;
                int i74 = (~i73) & (i69 | i72);
                int i75 = (i74 ^ i73) | (i74 & i73);
                int i76 = i61 ^ identityHashCode3;
                int i77 = i61 & identityHashCode3;
                int i78 = ~((i76 ^ i77) | (i76 & i77));
                int i79 = i75 & i78;
                int i80 = -(~(-(-((((i75 | i78) & (~i79)) | i79) * (-338)))));
                int i81 = (((i63 | i80) << 1) - (i80 ^ i63)) - 1;
                int i82 = (~((i64 & 976674646) | (i64 ^ 976674646))) * 338;
                int i83 = i81 & i82;
                int i84 = i66 & (i66 | identityHashCode3);
                int i85 = i64 & i84;
                int i86 = (i64 | i84) & (~i85);
                int i87 = ~((i86 ^ i85) | (i86 & i85));
                int i88 = (976674646 ^ i61) | (i61 & 976674646);
                int i89 = i88 & identityHashCode3;
                int i90 = (i88 | identityHashCode3) & (~i89);
                int i91 = ~((i90 ^ i89) | (i90 & i89));
                int i92 = -(-android.graphics.Color.blue(0));
                int i93 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                int i94 = i93 & (-99);
                byte b = (byte) (((~i94) & (i93 | (-99))) + (i94 << 1));
                int i95 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
                int identityHashCode4 = java.lang.System.identityHashCode(this);
                int i96 = i95 * 141;
                int i97 = ((~i96) & 6811) | (i96 & (-6812));
                int i98 = (i96 & 6811) << 1;
                int i99 = ((i97 | i98) << 1) - (i97 ^ i98);
                int i100 = ~i95;
                int i101 = (i100 ^ (-49)) | (i100 & (-49));
                int i102 = ~i101;
                int i103 = (i101 | i102) & i102;
                int i104 = (i100 | i95) & i100;
                int i105 = (i104 ^ identityHashCode4) | (i104 & identityHashCode4);
                int i106 = ~i105;
                int i107 = (i105 | i106) & i106;
                int i108 = ((~i103) & i107) | ((~i107) & i103);
                int i109 = i107 & i103;
                int i110 = -(-(((i108 ^ i109) | (i109 & i108)) * (-280)));
                int i111 = i99 & i110;
                int i112 = (i110 ^ i99) | i111;
                int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                int i114 = i100 & identityHashCode4;
                int i115 = (~i114) & (i100 | identityHashCode4);
                int i116 = (i114 ^ i115) | (i114 & i115);
                int i117 = ~i116;
                int i118 = (i116 | i117) & i117;
                int i119 = ~(identityHashCode4 | 48);
                int i120 = ((~i119) & i118) | ((~i118) & i119);
                int i121 = i118 & i119;
                int i122 = -(-(((i121 ^ i120) | (i121 & i120)) * 140));
                int i123 = i113 & i122;
                int i124 = i123 + ((i122 ^ i113) | i123);
                int i125 = i100 & 48;
                int i126 = (i100 | 48) & (~i125);
                int i127 = (i126 ^ i125) | (i125 & i126);
                int i128 = i127 ^ identityHashCode4;
                int i129 = ~identityHashCode4;
                int i130 = i127 & identityHashCode4;
                int i131 = (i130 ^ i128) | (i130 & i128);
                int i132 = ~i131;
                int i133 = (i131 | i132) & i132;
                int i134 = ((~i129) & i104) | ((~i104) & i129);
                int i135 = i104 & i129;
                int i136 = (i134 ^ i135) | (i135 & i134);
                int i137 = i136 & (-49);
                int i138 = (i136 | (-49)) & (~i137);
                int i139 = (i138 ^ i137) | (i138 & i137);
                int i140 = ~i139;
                int i141 = (i139 | i140) & i140;
                int i142 = ((~i141) & i133) | ((~i133) & i141);
                int i143 = i133 & i141;
                int i144 = (i143 ^ i142) | (i143 & i142);
                int i145 = i129 ^ 48;
                int i146 = i129 & 48;
                int i147 = (i145 ^ i146) | (i146 & i145);
                int i148 = ~((i147 ^ i95) | (i147 & i95));
                int i149 = i144 & i148;
                int i150 = (i144 | i148) & (~i149);
                int i151 = -(-(((i150 ^ i149) | (i150 & i149)) * 140));
                int i152 = i124 & i151;
                int i153 = (i151 | i124) & (~i152);
                int i154 = -(-(i152 << 1));
                short s = (short) (((i153 | i154) << 1) - (i153 ^ i154));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b((i59 ^ i60) + ((i60 & i59) << 1), ((((i82 | i81) & (~i83)) - (~(i83 << 1))) - 1) + (((i91 ^ i87) | (i91 & i87)) * 338), ((i92 | (-24)) << 1) - (i92 ^ (-24)), b, s, objArr2);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr2[0], java.lang.String.class).invoke(null, "SHA-1");
                int i155 = getAdditionalCheckTable;
                int i156 = (i155 ^ 66) + ((i155 & 66) << 1);
                int i157 = ((~i156) + (i156 << 1)) % 128;
                getCardholderValidators = i157;
                int i158 = i157 & 43;
                getAdditionalCheckTable = (((i157 | 43) & (~i158)) + (i158 << 1)) % 128;
                try {
                    int i159 = -android.text.TextUtils.getOffsetBefore("", 0);
                    int i160 = i159 ^ 64;
                    int i161 = -(-((i159 & 64) << 1));
                    int i162 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    int identityHashCode5 = java.lang.System.identityHashCode(this);
                    int i163 = (i162 * (-559)) + 15147;
                    int i164 = ~identityHashCode5;
                    int i165 = (i164 | identityHashCode5) & i164;
                    int i166 = i165 ^ i162;
                    int i167 = i165 & i162;
                    int i168 = (i167 ^ i166) | (i167 & i166);
                    int i169 = ~i168;
                    int i170 = ((i168 | i169) & i169) * (-560);
                    int i171 = ((i163 | i170) << 1) - (i163 ^ i170);
                    int i172 = identityHashCode5 | (i162 ^ (-28)) | (i162 & (-28));
                    int i173 = ~i172;
                    int i174 = ((i172 | i173) & i173) * (-560);
                    int i175 = i171 & i174;
                    int i176 = -(-(i174 | i171));
                    int i177 = (i175 & i176) + (i176 | i175);
                    int i178 = ~i162;
                    int i179 = (i162 | i178) & i178;
                    int i180 = (i179 & (-28)) | ((~i179) & 27);
                    int i181 = i179 & 27;
                    int i182 = ~((i181 ^ i180) | (i181 & i180));
                    int i183 = ~((i164 ^ 27) | (i164 & 27));
                    int i184 = ((~i183) & i182) | ((~i182) & i183);
                    int i185 = i182 & i183;
                    int i186 = -(-(((i185 ^ i184) | (i185 & i184)) * 560));
                    int i187 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    int identityHashCode6 = java.lang.System.identityHashCode(this);
                    int i188 = i187 * lib.android.paypal.com.magnessdk.g.e;
                    int i189 = identityHashCode6 & (-29239);
                    int i190 = (~i189) & (identityHashCode6 | (-29239));
                    int i191 = ~((i189 ^ i190) | (i189 & i190));
                    int i192 = ~identityHashCode6;
                    int i193 = (i192 | identityHashCode6) & i192;
                    int i194 = ~i187;
                    int i195 = (i193 & i194) | ((~i193) & i187);
                    int i196 = i193 & i187;
                    int i197 = ~((i196 ^ i195) | (i196 & i195) | 29238);
                    int i198 = (11899866 ^ i188) + ((i188 & 11899866) << 1) + (((i191 & i197) | (i191 ^ i197)) * (-406));
                    int i199 = ~i192;
                    int i200 = i192 & 29238;
                    int i201 = (i199 & (-29239)) | i200;
                    int i202 = i192 & (-29239);
                    int i203 = (i201 ^ i202) | (i202 & i201);
                    int i204 = ((~i203) & i187) | (i203 & i194);
                    int i205 = i203 & i187;
                    int i206 = -(-((~((i204 ^ i205) | (i205 & i204))) * (-406)));
                    int i207 = i198 & i206;
                    int i208 = ((i206 | i198) & (~i207)) + (i207 << 1);
                    int i209 = (i187 | i194) & i194;
                    int i210 = i209 & identityHashCode6;
                    int i211 = (i209 | identityHashCode6) & (~i210);
                    int i212 = ~((i211 ^ i210) | (i211 & i210));
                    int i213 = (i199 & 29238) | i202;
                    int i214 = ~((i213 ^ i200) | (i213 & i200));
                    int i215 = i212 ^ i214;
                    int i216 = i212 & i214;
                    int i217 = -(-(((i216 ^ i215) | (i216 & i215)) * 406));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(((i160 | i161) << 1) - (i161 ^ i160), (i177 & i186) + (i186 | i177), (char) ((((~i217) & i208) | ((~i208) & i217)) + ((i208 & i217) << 1)), objArr3);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
                    int i218 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
                    int i219 = -(((-29496754) & i218) | (29496753 & (~i218)));
                    int i220 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                    byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                    int identityHashCode7 = java.lang.System.identityHashCode(this);
                    int i221 = modifierMetaStateMask * (-1335);
                    int i222 = modifierMetaStateMask & identityHashCode7;
                    int i223 = (~i222) & (modifierMetaStateMask | identityHashCode7);
                    int i224 = (i222 ^ i223) | (i222 & i223);
                    int i225 = ~i224;
                    int i226 = i225 & (i225 | i224);
                    int i227 = ((~i226) & 22) | (i226 & (-23));
                    int i228 = i226 & 22;
                    int i229 = ((((((~i221) & 15341) | (i221 & (-15342))) - (~(-(-((i221 & 15341) << 1))))) - 1) - (~(((i228 ^ i227) | (i228 & i227)) * (-668)))) - 1;
                    int i230 = (identityHashCode7 ^ 22) | (identityHashCode7 & 22);
                    int i231 = ~i230;
                    int i232 = (i230 | i231) & i231;
                    int i233 = (((~modifierMetaStateMask) & i232) | ((~i232) & modifierMetaStateMask) | (modifierMetaStateMask & i232)) * 1336;
                    int i234 = i229 & i233;
                    int i235 = (i233 ^ i229) | i234;
                    int i236 = (i234 & i235) + (i235 | i234);
                    int i237 = -(-(((i224 ^ 22) | (i224 & 22)) * 668));
                    int i238 = i236 & i237;
                    int i239 = (i237 ^ i236) | i238;
                    int i240 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i241 = i240 ^ (-41);
                    int i242 = ((i240 & (-41)) | i241) << 1;
                    int i243 = -i241;
                    byte b2 = (byte) ((i242 ^ i243) + ((i242 & i243) << 1));
                    int i244 = -android.view.MotionEvent.axisFromString("");
                    int identityHashCode8 = java.lang.System.identityHashCode(this);
                    int i245 = i244 * 367;
                    int i246 = ((i245 | (-20919)) << 1) - (i245 ^ (-20919));
                    int i247 = i244 & (-57);
                    int i248 = (~i247) & (i244 | (-57));
                    int i249 = ((i247 ^ i248) | (i247 & i248)) * (-366);
                    int i250 = ((i246 ^ i249) | (i246 & i249)) << 1;
                    int i251 = -(((~i249) & i246) | ((~i246) & i249));
                    int i252 = (i250 ^ i251) + ((i251 & i250) << 1);
                    int i253 = ((~identityHashCode8) & 56) | (identityHashCode8 & (-57));
                    int i254 = identityHashCode8 & 56;
                    int i255 = ~((i253 ^ i254) | (i253 & i254));
                    int i256 = i244 & i255;
                    int i257 = (i255 | i244) & (~i256);
                    int i258 = ((i257 ^ i256) | (i257 & i256)) * (-366);
                    int i259 = ((i252 ^ i258) | (i252 & i258)) << 1;
                    int i260 = -(((~i258) & i252) | ((~i252) & i258));
                    int i261 = ~i244;
                    int i262 = (i261 & 56) | ((~i261) & (-57));
                    int i263 = i261 & (-57);
                    int i264 = ~((i263 ^ i262) | (i263 & i262));
                    int i265 = i244 & 56;
                    int i266 = ((i244 | 56) & (~i265)) | i265;
                    int i267 = i266 ^ identityHashCode8;
                    int i268 = i266 & identityHashCode8;
                    int i269 = ~((i268 ^ i267) | (i268 & i267));
                    int i270 = i264 & i269;
                    int i271 = (i269 | i264) & (~i270);
                    short s2 = (short) (((((i259 | i260) << 1) - (i260 ^ i259)) - (~(((i271 ^ i270) | (i271 & i270)) * 366))) - 1);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b(((((i218 & 29496753) | (29496753 ^ i218)) << 1) - (~i219)) - 1, 976674659 - (~i220), ((i238 | i239) << 1) - (i239 ^ i238), b2, s2, objArr4);
                    cls2.getMethod((java.lang.String) objArr4[0], byte[].class).invoke(invoke, bArr);
                    int i272 = getCardholderValidators;
                    int i273 = i272 ^ 77;
                    int i274 = -(-((i272 & 77) << 1));
                    getAdditionalCheckTable = ((i273 ^ i274) + ((i274 & i273) << 1)) % 128;
                    try {
                        int i275 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                        int i276 = i275 & 63;
                        int i277 = -(-(i275 | 63));
                        int i278 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int identityHashCode9 = java.lang.System.identityHashCode(this);
                        int i279 = i278 * (-112);
                        int i280 = (((i279 & 3023) | ((~i279) & (-3024))) - (~(-(-((i279 & (-3024)) << 1))))) - 1;
                        int i281 = ~identityHashCode9;
                        int i282 = ((~i281) & (-28)) | (i281 & 27);
                        int i283 = i281 & (-28);
                        int i284 = ~((i282 ^ i283) | (i282 & i283));
                        int i285 = i278 ^ i284;
                        int i286 = i284 & i278;
                        int i287 = -(~(-(-(((i286 ^ i285) | (i286 & i285)) * 226))));
                        int i288 = (i280 & i287) + (i280 | i287);
                        int i289 = (~i288) + (i288 << 1);
                        int i290 = ~i278;
                        int i291 = (i290 | i278) & i290;
                        int i292 = ~((i291 ^ 27) | (i291 & 27));
                        int i293 = i290 & identityHashCode9;
                        int i294 = (i290 | identityHashCode9) & (~i293);
                        int i295 = (i294 ^ i293) | (i294 & i293);
                        int i296 = ~i295;
                        int i297 = (i295 | i296) & i296;
                        int i298 = ((~i297) & i292) | ((~i292) & i297);
                        int i299 = i297 & i292;
                        int i300 = (i299 ^ i298) | (i299 & i298);
                        int i301 = i281 ^ (-28);
                        int i302 = (i301 ^ i283) | (i283 & i301);
                        int i303 = i302 & i278;
                        int i304 = (i278 | i302) & (~i303);
                        int i305 = ~((i304 ^ i303) | (i304 & i303));
                        int i306 = ((i305 ^ i300) | (i305 & i300)) * (-113);
                        int i307 = i289 ^ i306;
                        int i308 = (i306 & i289) << 1;
                        int i309 = (i307 & i308) + (i308 | i307);
                        int i310 = identityHashCode9 & (-28);
                        int i311 = (identityHashCode9 | (-28)) & (~i310);
                        int i312 = -(~(-(-((~((i310 ^ i311) | (i310 & i311))) * 113))));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a(((i276 | i277) << 1) - (i277 ^ i276), ((i309 & i312) + (i312 | i309)) - 1, (char) (29238 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr5);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                        float complexToFloat = android.util.TypedValue.complexToFloat(0);
                        int i313 = -(-android.graphics.Color.alpha(0));
                        int i314 = ((976674644 ^ i313) | (976674644 & i313)) << 1;
                        int i315 = -(((~i313) & 976674644) | ((-976674645) & i313));
                        int i316 = -android.text.TextUtils.indexOf("", "", 0, 0);
                        int identityHashCode10 = java.lang.System.identityHashCode(this);
                        int i317 = i316 * (-518);
                        int i318 = ((i317 | 12432) << 1) - (i317 ^ 12432);
                        int i319 = ~i316;
                        int i320 = ~identityHashCode10;
                        int i321 = (i320 | identityHashCode10) & i320;
                        int i322 = i319 & i321;
                        int i323 = ~(((i321 | i319) & (~i322)) | i322);
                        int i324 = ((~i323) & (-24)) | (i323 & 23);
                        int i325 = i323 & (-24);
                        int i326 = -(-(((i325 ^ i324) | (i325 & i324)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                        int i327 = (i318 | i326) << 1;
                        int i328 = -(i318 ^ i326);
                        int i329 = i319 & (i319 | i316);
                        int i330 = ((~i320) & i329) | ((~i329) & i320);
                        int i331 = i329 & i320;
                        int i332 = (i331 ^ i330) | (i331 & i330);
                        int i333 = i332 & (-24);
                        int i334 = (i332 | (-24)) & (~i333);
                        int i335 = ~((i334 ^ i333) | (i334 & i333));
                        int i336 = i316 & (-24);
                        int i337 = (~i336) & (i316 | (-24));
                        int i338 = (i336 ^ i337) | (i336 & i337);
                        int i339 = (i320 & i338) | ((~i338) & identityHashCode10);
                        int i340 = i338 & identityHashCode10;
                        int i341 = ~((i339 ^ i340) | (i340 & i339));
                        int i342 = (((i327 & i328) + (i328 | i327)) - (~(-(-(((i335 ^ i341) | (i335 & i341)) * (-519)))))) - 1;
                        int i343 = identityHashCode10 & (-24);
                        int i344 = (identityHashCode10 | (-24)) & (~i343);
                        int i345 = (i344 ^ i343) | (i344 & i343);
                        int i346 = ~i345;
                        int i347 = (i345 | i346) & i346;
                        int i348 = i316 & i347;
                        int i349 = -(-((((i316 | i347) & (~i348)) | i348) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                        int i350 = -(-((i349 ^ i342) | (i342 & i349)));
                        int i351 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte b3 = (byte) ((((~i351) & 50) | (i351 & (-51))) + ((i351 & 50) << 1));
                        int i352 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int identityHashCode11 = java.lang.System.identityHashCode(this);
                        int i353 = (i352 * 399) + 45885;
                        int i354 = ~i352;
                        int i355 = (i354 | i352) & i354;
                        int i356 = (i355 & (-116)) | ((~i355) & 115);
                        int i357 = i355 & 115;
                        int i358 = (i357 ^ i356) | (i357 & i356);
                        int i359 = ~i358;
                        int i360 = (i358 | i359) & i359;
                        int i361 = ~(i352 | (-116));
                        int i362 = i360 & i361;
                        int i363 = (i360 | i361) & (~i362);
                        int i364 = (i363 ^ i362) | (i363 & i362);
                        int i365 = identityHashCode11 | (-116);
                        int i366 = ~i365;
                        int i367 = (i365 | i366) & i366;
                        int i368 = i364 ^ i367;
                        int i369 = i364 & i367;
                        int i370 = ((i369 ^ i368) | (i369 & i368)) * 398;
                        int i371 = ((~i370) & i353) | ((~i353) & i370);
                        int i372 = -(-((i353 & i370) << 1));
                        int i373 = ((i371 | i372) << 1) - (i372 ^ i371);
                        int i374 = i352 & 115;
                        int i375 = -(-((((~i374) & (i352 | 115)) | i374) * (-1194)));
                        int i376 = i373 & i375;
                        int i377 = -(-((i375 ^ i373) | i376));
                        int i378 = (i376 & i377) + (i377 | i376);
                        int i379 = ~identityHashCode11;
                        int i380 = (identityHashCode11 | i379) & i379;
                        int i381 = i380 ^ (-116);
                        int i382 = i380 & (-116);
                        int i383 = ~((i382 ^ i381) | (i382 & i381));
                        int i384 = ~((i354 ^ 115) | (i354 & 115));
                        int i385 = ((~i383) & i384) | ((~i384) & i383);
                        int i386 = i383 & i384;
                        int i387 = (i385 ^ i386) | (i386 & i385);
                        int i388 = (i354 & (-116)) | i374;
                        int i389 = i352 & (-116);
                        int i390 = ~((i389 ^ i388) | (i389 & i388));
                        int i391 = -(-((((~i387) & i390) | ((~i390) & i387) | (i390 & i387)) * 398));
                        int i392 = i378 & i391;
                        short s3 = (short) ((i392 - (~(-(-((i391 ^ i378) | i392))))) - 1);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b((complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 29496737, (i314 & i315) + (i315 | i314), (r7 - (~i350)) - 1, b3, s3, objArr6);
                        byte[] bArr2 = (byte[]) cls3.getMethod((java.lang.String) objArr6[0], null).invoke(invoke, null);
                        int i393 = getAdditionalCheckTable;
                        int i394 = ((i393 | 68) << 1) - (i393 ^ 68);
                        getCardholderValidators = ((~i394) + (i394 << 1)) % 128;
                        return bArr2;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        } catch (java.security.NoSuchAlgorithmException e) {
            try {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e.toString()));
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        if (r3 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        r10 = (byte) (r30[((r6 & 1) - (~(-(-(r6 | 1))))) - 1] & com.google.common.base.Ascii.SI);
        r12 = r11 & r10;
        r10 = (r10 | r11) & (~r12);
        r11 = (byte) ((r10 ^ r12) | (r10 & r12));
        r10 = com.payair.hce.setPivotX.getCardholderValidators;
        com.payair.hce.setPivotX.getAdditionalCheckTable = ((r10 ^ 13) + ((r10 & 13) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0119, code lost:
    
        r8[r9] = r11;
        r10 = r9 & 21;
        r9 = (r9 ^ 21) | r10;
        r11 = (r10 & r9) + (r9 | r10);
        r9 = (r11 | (-20)) << 1;
        r10 = -(r11 ^ (-20));
        r9 = ((r9 | r10) << 1) - (r9 ^ r10);
        r6 = (r6 | 2) + (r6 & 2);
        r10 = com.payair.hce.setPivotX.getAdditionalCheckTable;
        com.payair.hce.setPivotX.getCardholderValidators = (((r10 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) + ((r10 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1)) - 1) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        r12 = r10 & 7;
        r13 = (~r12) & (r10 | 7);
        r12 = -(-(r12 << 1));
        r14 = ((r13 | r12) << 1) - (r12 ^ r13);
        com.payair.hce.setPivotX.getCardholderValidators = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        if ((r14 % 2) == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if ((r30.length << r6) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
    
        r12 = r11 & 10;
        r11 = (r11 | 10) & (~r12);
        r11 = (byte) ((r11 ^ r12) | (r11 & r12));
        com.payair.hce.setPivotX.getCardholderValidators = (((r10 | 51) << 1) - (r10 ^ 51)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
    
        r12 = r30.length;
        r13 = -r6;
        r14 = r12 ^ r13;
        r12 = (r12 & r13) << 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        if (((r14 & r12) + (r12 | r14)) != 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3 != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] getDualTapResetTimeout(byte[] bArr) throws java.security.GeneralSecurityException {
        boolean z;
        int length;
        byte b;
        com.payair.hce.setPivotX setpivotx = this;
        int i = getCardholderValidators;
        int i2 = 1;
        int i3 = (-2) - (~(((i | 92) << 1) - (i ^ 92)));
        int i4 = i3 % 128;
        getAdditionalCheckTable = i4;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i5 = 0;
        try {
            if (bArr != null) {
                int i6 = ((i4 | 79) << 1) - (i4 ^ 79);
                getCardholderValidators = i6 % 128;
                if (i6 % 2 != 0) {
                    int length2 = bArr.length;
                    throw new java.lang.ArithmeticException();
                }
                if (bArr.length != 0) {
                    java.lang.String str = "";
                    if (bArr.length >= 4) {
                        int i7 = i4 + 67;
                        int i8 = i7 % 128;
                        getCardholderValidators = i8;
                        if (i7 % 2 == 0 ? bArr.length <= 12 : bArr.length <= 66) {
                            int i9 = 16;
                            byte[] bArr2 = new byte[16];
                            int length3 = bArr.length;
                            int i10 = length3 & 64;
                            int i11 = (length3 | 64) & (~i10);
                            bArr2[0] = (byte) ((i11 ^ i10) | (i11 & i10));
                            if (bArr.length % 2 != 0) {
                                int i12 = i4 & 93;
                                getCardholderValidators = ((i12 - (~(-(-((i4 ^ 93) | i12))))) - 1) % 128;
                                z = true;
                            } else {
                                getAdditionalCheckTable = ((i8 & 57) + (i8 | 57)) % 128;
                                z = false;
                            }
                            int i13 = getAdditionalCheckTable;
                            int i14 = i13 ^ 111;
                            getCardholderValidators = ((((i13 & 111) | i14) << 1) - i14) % 128;
                            int i15 = 0;
                            int i16 = 1;
                            while (i15 < bArr.length) {
                                int i17 = getAdditionalCheckTable;
                                int i18 = ((i17 ^ 99) | (i17 & 99)) << 1;
                                int i19 = -((i17 & (-100)) | ((~i17) & 99));
                                int i20 = (i18 & i19) + (i18 | i19);
                                getCardholderValidators = i20 % 128;
                                if (i20 % 2 != 0) {
                                    b = (byte) ((bArr[i15] >>> 2) & 15053);
                                } else {
                                    b = (byte) ((bArr[i15] << 4) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                                }
                            }
                            if (z) {
                                getAdditionalCheckTable = (getCardholderValidators + 43) % 128;
                                int length4 = bArr.length;
                                int identityHashCode = java.lang.System.identityHashCode(this);
                                int i21 = (length4 * (-167)) - 167;
                                int i22 = ~length4;
                                int i23 = i22 & (-2);
                                int i24 = (~i23) & (i22 | (-2));
                                int i25 = (i23 ^ i24) | (i23 & i24);
                                int i26 = ~i25;
                                int i27 = (i25 | i26) & i26;
                                int i28 = (i22 | length4) & i22;
                                int i29 = ~identityHashCode;
                                int i30 = (i28 & i29) | ((~i28) & identityHashCode);
                                int i31 = i28 & identityHashCode;
                                int i32 = ~((i31 & i30) | (i30 ^ i31));
                                int i33 = (((~i27) & i32) | ((~i32) & i27) | (i27 & i32)) * 336;
                                int i34 = i21 & i33;
                                int i35 = -(-((i21 ^ i33) | i34));
                                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                                int i37 = length4 & 1;
                                int i38 = (length4 | 1) & (~i37);
                                int i39 = (i38 ^ i37) | (i38 & i37);
                                int i40 = ~i39;
                                int i41 = (i39 | i40) & i40;
                                int i42 = identityHashCode & 1;
                                int i43 = (identityHashCode | 1) & (~i42);
                                int i44 = ~((i43 ^ i42) | (i43 & i42));
                                int i45 = ((i41 ^ i44) | (i41 & i44)) * (-168);
                                int i46 = (((~i45) & i36) | ((~i36) & i45)) + ((i45 & i36) << 1);
                                int i47 = ~((i29 ^ 1) | (i29 & 1));
                                int i48 = ((~i47) & i22) | ((~i22) & i47);
                                int i49 = i47 & i22;
                                int i50 = ((i49 ^ i48) | (i49 & i48)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                                length = ((i46 | i50) << 1) - (i50 ^ i46);
                                int i51 = getCardholderValidators;
                                int i52 = i51 & 13;
                                int i53 = -(-((i51 ^ 13) | i52));
                                getAdditionalCheckTable = ((i52 ^ i53) + ((i53 & i52) << 1)) % 128;
                            } else {
                                length = bArr.length;
                                int i54 = getCardholderValidators;
                                int i55 = i54 ^ 111;
                                int i56 = ((i54 & 111) | i55) << 1;
                                int i57 = -i55;
                                getAdditionalCheckTable = ((i56 & i57) + (i56 | i57)) % 128;
                            }
                            int i58 = -length;
                            int i59 = getAdditionalCheckTable;
                            int i60 = (i59 | 99) << 1;
                            int i61 = -(i59 ^ 99);
                            getCardholderValidators = (((i60 | i61) << 1) - (i61 ^ i60)) % 128;
                            int i62 = 0;
                            while (i62 < ((i58 | 12) << 1) - (i58 ^ 12)) {
                                int i63 = getAdditionalCheckTable;
                                int i64 = (i63 ^ 33) + ((i63 & 33) << 1);
                                getCardholderValidators = i64 % 128;
                                if (i64 % 2 != 0) {
                                    bArr2[i16 * i62] = 73;
                                    int i65 = (i62 & 117) + (i62 | 117);
                                    i62 = (i65 & (-54)) + (i65 | (-54));
                                } else {
                                    int i66 = -(-i62);
                                    int i67 = i16 ^ i66;
                                    int i68 = ((i66 & i16) | i67) << 1;
                                    int i69 = -i67;
                                    bArr2[(i68 ^ i69) + ((i68 & i69) << 1)] = -86;
                                    i62 = (-2) - (~(i62 + 2));
                                }
                            }
                            bArr2[7] = -86;
                            java.lang.Throwable th = null;
                            if (setpivotx.getCvrMaskAnd == null) {
                                int i70 = getAdditionalCheckTable;
                                int i71 = ((i70 & 93) + (i70 | 93)) % 128;
                                getCardholderValidators = i71;
                                int i72 = i71 & 37;
                                getAdditionalCheckTable = (i72 + ((i71 ^ 37) | i72)) % 128;
                                int i73 = i71 ^ 57;
                                int i74 = -(-((i71 & 57) << 1));
                                getAdditionalCheckTable = (((i73 | i74) << 1) - (i73 ^ i74)) % 128;
                                setpivotx.getCvrMaskAnd = (java.util.Random) java.util.Random.class.getDeclaredConstructor(null).newInstance(null);
                                int i75 = getAdditionalCheckTable;
                                getCardholderValidators = (((i75 | 13) << 1) - (i75 ^ 13)) % 128;
                            }
                            int i76 = getAdditionalCheckTable;
                            getCardholderValidators = (((i76 & 106) + (i76 | 106)) - 1) % 128;
                            int i77 = 8;
                            while (i77 < i9) {
                                int identityHashCode2 = java.lang.System.identityHashCode(this);
                                int i78 = ~identityHashCode2;
                                int i79 = -(-((((-452993057) & i78) | ((-452993057) ^ i78)) * (-369)));
                                int i80 = (-208572238) & i79;
                                int i81 = (i79 | (-208572238)) & (~i80);
                                int i82 = -(-(i80 << i2));
                                int i83 = (i81 & i82) + (i81 | i82);
                                int i84 = 455893292 & i78;
                                int i85 = (455893292 | i78) & (~i84);
                                int i86 = ~((i85 ^ i84) | (i85 & i84));
                                int i87 = -(-(((i86 ^ 548193742) | (i86 & 548193742)) * (-369)));
                                int i88 = i83 & i87;
                                int i89 = (i88 - (~(-(-((i87 ^ i83) | i88))))) - i2;
                                int i90 = (-455893293) & identityHashCode2;
                                int i91 = (identityHashCode2 | (-455893293)) & (~i90);
                                int i92 = ~((i91 ^ i90) | (i91 & i90));
                                int i93 = 2900236 & i92;
                                int i94 = (i92 | 2900236) & (~i93);
                                int i95 = (i94 ^ i93) | (i94 & i93);
                                int i96 = (i78 ^ 455893292) | i84;
                                int i97 = i96 ^ 548193742;
                                int i98 = i96 & 548193742;
                                int i99 = ~((i98 ^ i97) | (i98 & i97));
                                int i100 = ((~i99) & i95) | ((~i95) & i99);
                                int i101 = i95 & i99;
                                int i102 = -(-(((i101 ^ i100) | (i101 & i100)) * 369));
                                int i103 = ((i89 ^ i102) | (i89 & i102)) << i2;
                                int i104 = -(((~i102) & i89) | ((~i89) & i102));
                                int identityHashCode3 = java.lang.System.identityHashCode(this);
                                int i105 = ~((94571075 & identityHashCode3) | (94571075 ^ identityHashCode3));
                                int i106 = ~identityHashCode3;
                                int i107 = (i106 | identityHashCode3) & i106;
                                int i108 = (-1205479876) & i107;
                                int i109 = (i107 | (-1205479876)) & (~i108);
                                int i110 = (i109 ^ i108) | (i109 & i108);
                                int i111 = ~((i110 ^ (-94571076)) | ((-94571076) & i110));
                                int i112 = ((i105 ^ i111) | (i105 & i111)) * (-406);
                                int i113 = ((((~i112) & (-1242644232)) | (1242644231 & i112)) - (~(-(-((i112 & (-1242644232)) << i2))))) - i2;
                                int i114 = (94571075 & i106) | (94571075 ^ i106);
                                int i115 = (-1205479876) ^ i114;
                                int i116 = i114 & (-1205479876);
                                int i117 = (~((i116 ^ i115) | (i116 & i115))) * (-406);
                                int i118 = i113 & i117;
                                int i119 = (i117 ^ i113) | i118;
                                int i120 = ((i118 | i119) << i2) - (i119 ^ i118);
                                int i121 = 1205479875 & identityHashCode3;
                                int i122 = (identityHashCode3 | 1205479875) & (~i121);
                                int i123 = (i122 ^ i121) | (i122 & i121);
                                int i124 = ~i123;
                                int i125 = (i123 | i124) & i124;
                                int i126 = (-94571076) & i106;
                                int i127 = (i106 | (-94571076)) & (~i126);
                                int i128 = ~((i126 ^ i127) | (i127 & i126));
                                int i129 = ((i125 ^ i128) | (i128 & i125)) * 406;
                                int i130 = i120 & i129;
                                if ((i103 ^ i104) + ((i104 & i103) << i2) <= i130 + ((i129 ^ i120) | i130)) {
                                    throw th;
                                }
                                java.util.Random random = setpivotx.getCvrMaskAnd;
                                int i131 = getCardholderValidators;
                                getAdditionalCheckTable = (((i131 ^ 88) + ((i131 & 88) << i2)) - i2) % 128;
                                int i132 = 29496729 & (-android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i5));
                                int i133 = -android.os.Process.getGidForName(str);
                                int i134 = -((976674653 | i133) & (~(976674653 & i133)));
                                int i135 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                int identityHashCode4 = java.lang.System.identityHashCode(this);
                                int i136 = i135 * 51;
                                int i137 = i136 & 1225;
                                int i138 = (i136 ^ 1225) | i137;
                                int i139 = (i137 & i138) + (i137 | i138);
                                int i140 = ~identityHashCode4;
                                int i141 = ~i135;
                                int i142 = i135 & i140;
                                int i143 = i142 | (identityHashCode4 & i141);
                                int i144 = i135 & identityHashCode4;
                                int i145 = -(-(((i143 ^ i144) | (i143 & i144)) * (-50)));
                                int i146 = (i139 & i145) - (~(-(-(i145 | i139))));
                                int i147 = i77;
                                int i148 = i146 - 1;
                                int i149 = (i141 | i135) & i141;
                                byte[] bArr3 = bArr2;
                                int i150 = (i149 & (-25)) | ((~i149) & 24);
                                int i151 = i149 & 24;
                                int i152 = (i150 ^ i151) | (i151 & i150);
                                int i153 = ((~i152) & identityHashCode4) | (i152 & i140);
                                int i154 = i152 & identityHashCode4;
                                int i155 = ~((i154 & i153) | (i154 ^ i153));
                                int i156 = (identityHashCode4 | i140) & i140;
                                int i157 = i156 & 24;
                                java.lang.String str2 = str;
                                int i158 = (i156 | 24) & (~i157);
                                int i159 = (i158 ^ i157) | (i158 & i157);
                                int i160 = (i141 & i159) | ((~i159) & i135);
                                int i161 = i159 & i135;
                                int i162 = (i160 ^ i161) | (i161 & i160);
                                int i163 = ~i162;
                                int i164 = (i162 | i163) & i163;
                                int i165 = i155 & i164;
                                int i166 = (((i164 | i155) & (~i165)) | i165) * 50;
                                int i167 = ((~i166) & i148) | ((~i148) & i166);
                                int i168 = (i148 & i166) << 1;
                                int i169 = ~(((~i140) & 24) | (i140 & (-25)) | (i140 & 24));
                                int i170 = ~((i135 ^ 24) | (i135 & 24));
                                int i171 = i169 ^ i170;
                                int i172 = i169 & i170;
                                int i173 = (i172 ^ i171) | (i172 & i171);
                                int i174 = ~((i140 ^ i135) | i142);
                                int i175 = ((~i174) & i173) | ((~i173) & i174);
                                int i176 = i174 & i173;
                                int i177 = -(~(-(-(((i176 ^ i175) | (i176 & i175)) * 50))));
                                int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                                int identityHashCode5 = java.lang.System.identityHashCode(this);
                                int i178 = (packedPositionChild * (-496)) + 61504;
                                int i179 = ~packedPositionChild;
                                int i180 = (i179 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | (i179 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                int i181 = (~i180) * 497;
                                int i182 = i178 & i181;
                                int i183 = (i181 ^ i178) | i182;
                                int i184 = (i182 ^ i183) + ((i183 & i182) << 1);
                                int i185 = i180 & identityHashCode5;
                                int i186 = (~i185) & (i180 | identityHashCode5);
                                int i187 = ~identityHashCode5;
                                int i188 = ~((i186 & i185) | (i185 ^ i186));
                                int i189 = i187 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                int i190 = i187 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                int i191 = (i189 & i190) | (i189 ^ i190);
                                int i192 = i191 & packedPositionChild;
                                int i193 = (~i192) & (i191 | packedPositionChild);
                                int i194 = ~((i193 ^ i192) | (i193 & i192));
                                int i195 = i188 ^ i194;
                                int i196 = i194 & i188;
                                int i197 = -(-(((i196 ^ i195) | (i196 & i195)) * 497));
                                int i198 = (i184 | i197) << 1;
                                int i199 = -(i197 ^ i184);
                                int i200 = ((i198 | i199) << 1) - (i199 ^ i198);
                                int i201 = i179 ^ i187;
                                int i202 = i179 & i187;
                                int i203 = (i201 ^ i202) | (i202 & i201);
                                int i204 = ~i203;
                                int i205 = (i203 | i204) & i204;
                                int i206 = i179 & (-124);
                                int i207 = (i179 | (-124)) & (~i206);
                                int i208 = ~((i206 ^ i207) | (i207 & i206));
                                int i209 = ((~i208) & i205) | ((~i205) & i208);
                                int i210 = i205 & i208;
                                int i211 = (i210 ^ i209) | (i210 & i209);
                                int i212 = packedPositionChild & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                int i213 = i212 | ((packedPositionChild | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i212));
                                int i214 = i213 & identityHashCode5;
                                int i215 = (i213 | identityHashCode5) & (~i214);
                                int i216 = (i215 ^ i214) | (i215 & i214);
                                int i217 = ~i216;
                                int i218 = (i216 | i217) & i217;
                                int i219 = -(-(((i211 ^ i218) | (i218 & i211)) * 497));
                                int i220 = i200 & i219;
                                int i221 = (i219 | i200) & (~i220);
                                int i222 = -(-(i220 << 1));
                                byte b2 = (byte) ((i221 ^ i222) + ((i221 & i222) << 1));
                                int i223 = -(-(android.os.Process.myPid() >> 22));
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                b((((29496729 | r9) & (~i132)) - (~(-(-(i132 << 1))))) - 1, ((((976674653 ^ i133) | r13) << 1) - (~i134)) - 1, (((i167 ^ i168) + ((i168 & i167) << 1)) - (~i177)) - 2, b2, (short) ((i223 ^ 108) + ((i223 & 108) << 1)), objArr);
                                byte intValue = (byte) (((byte) (((java.lang.Integer) java.util.Random.class.getMethod((java.lang.String) objArr[0], null).invoke(random, null)).intValue() % 15)) << 4);
                                java.util.Random random2 = this.getCvrMaskAnd;
                                getAdditionalCheckTable = (getCardholderValidators + 121) % 128;
                                int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                                int identityHashCode6 = java.lang.System.identityHashCode(this);
                                int i224 = (pressedStateDuration * (-494)) - 1686482732;
                                int i225 = ~pressedStateDuration;
                                int i226 = ((-29496731) & pressedStateDuration) | (29496730 & i225);
                                int i227 = 29496730 & pressedStateDuration;
                                int i228 = -(-((~((i226 ^ i227) | (i226 & i227))) * (-495)));
                                int i229 = i224 & i228;
                                int i230 = -(-(i224 | i228));
                                int i231 = ((i229 | i230) << 1) - (i230 ^ i229);
                                int i232 = ~identityHashCode6;
                                int i233 = pressedStateDuration & i232;
                                int i234 = (pressedStateDuration | i232) & (~i233);
                                int i235 = ((i233 & i234) | (i234 ^ i233)) * 495;
                                int i236 = i231 & i235;
                                int i237 = (i236 - (~(-(-((i235 ^ i231) | i236))))) - 1;
                                int i238 = ~(((-29496731) & i225) | (i225 ^ (-29496731)));
                                int i239 = ~(i234 | i233);
                                int i240 = i238 & i239;
                                int i241 = (i239 | i238) & (~i240);
                                int i242 = ((i241 ^ i240) | (i241 & i240)) * 495;
                                int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                                int i243 = 976674654 & combineMeasuredStates;
                                int i244 = combineMeasuredStates | 976674654;
                                int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                                int identityHashCode7 = java.lang.System.identityHashCode(this);
                                int i245 = (doubleTapTimeout * (-103)) + 2472;
                                int i246 = ~doubleTapTimeout;
                                int i247 = (i246 & (-24)) | ((~i246) & 23);
                                int i248 = i246 & 23;
                                int i249 = (i248 ^ i247) | (i248 & i247);
                                int i250 = ~i249;
                                int i251 = (i249 | i250) & i250;
                                int i252 = identityHashCode7 & 23;
                                int i253 = (identityHashCode7 | 23) & (~i252);
                                int i254 = (i252 ^ i253) | (i253 & i252);
                                int i255 = ~i254;
                                int i256 = (i254 | i255) & i255;
                                int i257 = i251 & i256;
                                int i258 = -(-((((i251 | i256) & (~i257)) | i257) * 104));
                                int i259 = i245 ^ i258;
                                int i260 = (((i245 & i258) | i259) << 1) - i259;
                                int i261 = ~identityHashCode7;
                                int i262 = (i261 ^ doubleTapTimeout) | (i261 & doubleTapTimeout);
                                int i263 = i262 & (-24);
                                int i264 = (i262 | (-24)) & (~i263);
                                int i265 = (i264 ^ i263) | (i264 & i263);
                                int i266 = ~i265;
                                int i267 = ((i265 | i266) & i266) * (-104);
                                int i268 = i260 & i267;
                                int i269 = (i268 - (~(-(-((i260 ^ i267) | i268))))) - 1;
                                int i270 = doubleTapTimeout ^ identityHashCode7;
                                int i271 = doubleTapTimeout & identityHashCode7;
                                int i272 = ((i271 ^ i270) | (i271 & i270)) * 104;
                                int i273 = i269 & i272;
                                int i274 = (i272 ^ i269) | i273;
                                int gidForName = android.os.Process.getGidForName(str2);
                                int identityHashCode8 = java.lang.System.identityHashCode(this);
                                int i275 = gidForName * (-949);
                                int i276 = 117676 & i275;
                                int i277 = ((117676 ^ i275) | i276) << 1;
                                int i278 = -((i275 | 117676) & (~i276));
                                int i279 = ~identityHashCode8;
                                int i280 = i279 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                int i281 = (~i280) & (i279 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                int i282 = ~((i281 ^ i280) | (i281 & i280));
                                int i283 = ~gidForName;
                                int i284 = ((~i283) & identityHashCode8) | (i283 & i279);
                                int i285 = i283 & identityHashCode8;
                                int i286 = (i284 & i285) | (i284 ^ i285);
                                int i287 = ~i286;
                                int i288 = i287 & (i286 | i287);
                                int i289 = (((i277 ^ i278) + ((i278 & i277) << 1)) - (~(((i288 ^ i282) | (i288 & i282)) * 1900))) - 1;
                                int i290 = i279 ^ gidForName;
                                int i291 = i279 & gidForName;
                                int i292 = ~((i290 ^ i291) | (i290 & i291));
                                int i293 = identityHashCode8 & (-124);
                                int i294 = (~i293) & (identityHashCode8 | (-124));
                                int i295 = ~((i293 & i294) | (i293 ^ i294));
                                int i296 = i292 & i295;
                                int i297 = (i292 | i295) & (~i296);
                                int i298 = -(-(((i297 ^ i296) | (i297 & i296)) * (-950)));
                                int i299 = i279 & (i279 | identityHashCode8);
                                int i300 = i299 & (-124);
                                int i301 = ~(((~i300) & (i299 | (-124))) | i300);
                                int i302 = i291 | i285;
                                int i303 = gidForName & identityHashCode8;
                                int i304 = (i302 ^ i303) | (i303 & i302);
                                int i305 = ~i304;
                                int i306 = (i304 | i305) & i305;
                                int i307 = i301 & i306;
                                int i308 = (i306 | i301) & (~i307);
                                byte b3 = (byte) (((((i298 & (~i289)) | ((~i298) & i289)) - (~(-(-((i298 & i289) << 1))))) - 1) + (((i308 ^ i307) | (i308 & i307)) * 950));
                                int i309 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                                int identityHashCode9 = java.lang.System.identityHashCode(this);
                                int i310 = i309 * 367;
                                int i311 = 39636 & i310;
                                int i312 = ((((39636 ^ i310) | i311) << 1) - (~(-((i310 | 39636) & (~i311))))) - 1;
                                int i313 = i309 & 108;
                                int i314 = (~i313) & (i309 | 108);
                                int i315 = ((i314 ^ i313) | (i313 & i314)) * (-366);
                                int i316 = i312 & i315;
                                int i317 = (i315 | i312) & (~i316);
                                int i318 = i316 << 1;
                                int i319 = ((i317 | i318) << 1) - (i317 ^ i318);
                                int i320 = ~(identityHashCode9 | (-109));
                                int i321 = i309 & i320;
                                int i322 = (i320 | i309) & (~i321);
                                int i323 = ((i322 ^ i321) | (i322 & i321)) * (-366);
                                int i324 = (i319 & i323) + (i323 | i319);
                                int i325 = ~i309;
                                int i326 = (i325 | i309) & i325;
                                int i327 = i326 & 108;
                                int i328 = (i326 | 108) & (~i327);
                                int i329 = ~((i328 ^ i327) | (i328 & i327));
                                int i330 = i313 | (i325 & (-109));
                                int i331 = i309 & (-109);
                                int i332 = ~((i331 ^ i330) | (i331 & i330) | identityHashCode9);
                                int i333 = i329 ^ i332;
                                int i334 = i332 & i329;
                                int i335 = -(-(((i334 ^ i333) | (i334 & i333)) * 366));
                                int i336 = i324 & i335;
                                int i337 = (i335 ^ i324) | i336;
                                short s = (short) (((i336 | i337) << 1) - (i337 ^ i336));
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                b(((i237 | i242) << 1) - (i242 ^ i237), (i243 ^ i244) + ((i244 & i243) << 1), (i273 ^ i274) + ((i274 & i273) << 1), b3, s, objArr2);
                                byte intValue2 = (byte) (((java.lang.Integer) java.util.Random.class.getMethod((java.lang.String) objArr2[0], null).invoke(random2, null)).intValue() % 15);
                                int i338 = intValue & intValue2;
                                int i339 = (intValue2 | intValue) & (~i338);
                                bArr3[i147] = (byte) ((i339 ^ i338) | (i339 & i338));
                                int i340 = ((i147 ^ (-29)) + ((i147 & (-29)) << 1)) - 1;
                                i77 = (((~i340) & 31) | (i340 & (-32))) + ((i340 & 31) << 1);
                                int i341 = getCardholderValidators;
                                getAdditionalCheckTable = ((i341 & 27) + (i341 | 27)) % 128;
                                i9 = 16;
                                str = str2;
                                bArr2 = bArr3;
                                i5 = 0;
                                th = null;
                                i2 = 1;
                                setpivotx = this;
                            }
                            byte[] bArr4 = bArr2;
                            int i342 = getCardholderValidators + 55;
                            getAdditionalCheckTable = i342 % 128;
                            if (i342 % 2 != 0) {
                                return bArr4;
                            }
                            throw new java.lang.ArithmeticException();
                        }
                    }
                    getCardholderValidators = (((i4 & 38) + (i4 | 38)) - 1) % 128;
                    getCardholderValidators = ((-2) - (~(i4 + 38))) % 128;
                    java.lang.Object[] objArr3 = {"Invalid pin length"};
                    int i343 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int identityHashCode10 = java.lang.System.identityHashCode(this);
                    int i344 = i343 * 495;
                    int i345 = i344 ^ (-493);
                    int i346 = ((i344 & (-493)) | i345) << 1;
                    int i347 = -i345;
                    int i348 = (i346 & i347) + (i346 | i347);
                    int i349 = -(-((i343 | (-2)) * (-988)));
                    int i350 = (i348 & i349) + (i349 | i348);
                    int i351 = ~i343;
                    int i352 = i351 & 1;
                    int i353 = (~i352) & (i351 | 1);
                    int i354 = (i353 ^ i352) | (i352 & i353);
                    int i355 = ~identityHashCode10;
                    int i356 = i354 & i355;
                    int i357 = (((i354 | i355) & (~i356)) | i356) * 494;
                    int i358 = ~(((~i351) & (-2)) | i352 | (i351 & (-2)));
                    int i359 = (identityHashCode10 | i355) & i355;
                    int i360 = i359 & 1;
                    int i361 = (i359 | 1) & (~i360);
                    int i362 = ~((i361 ^ i360) | (i361 & i360));
                    int i363 = i358 & i362;
                    int i364 = (i362 | i358) & (~i363);
                    int i365 = (i364 ^ i363) | (i364 & i363);
                    int i366 = ~((i343 & (-2)) | i352 | (i343 & 1));
                    int i367 = -(~(((i366 ^ i365) | (i366 & i365)) * 494));
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int identityHashCode11 = java.lang.System.identityHashCode(this);
                    int i368 = (lastIndexOf * 399) + 15561;
                    int i369 = ~lastIndexOf;
                    int i370 = i369 & 39;
                    int i371 = (~i370) & (i369 | 39);
                    int i372 = (i371 ^ i370) | (i370 & i371);
                    int i373 = ~i372;
                    int i374 = (i372 | i373) & i373;
                    int i375 = lastIndexOf & 39;
                    int i376 = (i369 & (-40)) | i375;
                    int i377 = lastIndexOf & (-40);
                    int i378 = ~((i376 ^ i377) | (i376 & i377));
                    int i379 = (i374 ^ i378) | (i378 & i374);
                    int i380 = identityHashCode11 ^ (-40);
                    int i381 = ~identityHashCode11;
                    int i382 = identityHashCode11 & (-40);
                    int i383 = ~((i382 ^ i380) | (i382 & i380));
                    int i384 = i379 & i383;
                    int i385 = -(~((((i383 | i379) & (~i384)) | i384) * 398));
                    int i386 = (((i368 | i385) << 1) - (i385 ^ i368)) - 1;
                    int i387 = lastIndexOf ^ 39;
                    int i388 = ((i387 ^ i375) | (i387 & i375)) * (-1194);
                    int i389 = i386 & i388;
                    int i390 = -((i388 | i386) & (~i389));
                    int i391 = i381 & (-40);
                    int i392 = (~((i369 ^ 39) | i370)) | (~(i391 | ((i381 | (-40)) & (~i391))));
                    int i393 = (lastIndexOf | (-40)) & (~i377);
                    int i394 = ~((i393 ^ i377) | (i393 & i377));
                    int i395 = ((((((i388 ^ i386) | i389) << 1) - (~i390)) - 1) - (~(-(~(((i394 ^ i392) | (i394 & i392)) * 398))))) - 1;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a((((((~i357) & i350) | ((~i350) & i357)) + ((i350 & i357) << 1)) - (~i367)) - 2, (~i395) + (i395 << 1), (char) android.view.View.getDefaultSize(0, 0), objArr4);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr4[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr3));
                }
            }
            int i396 = i4 & 13;
            int i397 = ((i4 ^ 13) | i396) << 1;
            int i398 = -((~i396) & (i4 | 13));
            getCardholderValidators = ((i397 ^ i398) + ((i398 & i397) << 1)) % 128;
            getCardholderValidators = ((((i4 | 70) << 1) - (i4 ^ 70)) - 1) % 128;
            java.lang.Object[] objArr5 = {"Pin is null"};
            int argb = android.graphics.Color.argb(0, 0, 0, 0);
            int i399 = -(android.os.Process.myPid() >> 22);
            int identityHashCode12 = java.lang.System.identityHashCode(this);
            int i400 = i399 * 960;
            int i401 = (-72846) & i400;
            int i402 = i401 + ((i400 ^ (-72846)) | i401);
            int i403 = ~identityHashCode12;
            int i404 = ((~i403) & (-39)) | (i403 & 38);
            int i405 = i403 & (-39);
            int i406 = ~((i404 ^ i405) | (i404 & i405));
            int i407 = i399 ^ identityHashCode12;
            int i408 = i399 & identityHashCode12;
            int i409 = ~((i407 ^ i408) | (i407 & i408));
            int i410 = i406 & i409;
            int i411 = (i406 | i409) & (~i410);
            int i412 = -(-(((i411 ^ i410) | (i411 & i410)) * 959));
            int i413 = ((i402 & i412) - (~(-(-(i402 | i412))))) - 1;
            int i414 = 37401 & i413;
            int i415 = (i413 ^ 37401) | i414;
            int i416 = ((i414 | i415) << 1) - (i415 ^ i414);
            int i417 = identityHashCode12 & (-39);
            int i418 = (~i417) & (identityHashCode12 | (-39));
            int i419 = ~((i417 ^ i418) | (i417 & i418));
            int i420 = (identityHashCode12 | i403) & i403;
            int i421 = (i399 & (~i420)) | ((~i399) & i420) | (i399 & i420);
            int i422 = ~i421;
            int i423 = (i421 | i422) & i422;
            int i424 = ((~i423) & i419) | ((~i419) & i423);
            int i425 = i423 & i419;
            int i426 = ((i425 ^ i424) | (i425 & i424)) * 959;
            int i427 = -(((~i416) & i426) | ((~i426) & i416));
            int i428 = -(-android.widget.ExpandableListView.getPackedPositionChild(0L));
            int i429 = i428 & 1;
            int i430 = ((i428 ^ 1) | i429) << 1;
            int i431 = -((i428 | 1) & (~i429));
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(argb, ((((i426 & i416) | (i416 ^ i426)) << 1) - (~i427)) - 1, (char) ((i430 ^ i431) + ((i431 & i430) << 1)), objArr6);
            throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr6[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr5));
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static /* synthetic */ java.lang.Object getDualTapResetTimeout(java.lang.Object[] objArr) {
        java.util.Iterator it;
        int i;
        java.util.List<byte[]> list = (java.util.List) objArr[0];
        int i2 = getCardholderValidators;
        int i3 = i2 ^ 15;
        int i4 = ((i2 & 15) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        getAdditionalCheckTable = i6 % 128;
        if (i6 % 2 == 0) {
            it = list.iterator();
            i = 1;
        } else {
            it = list.iterator();
            i = 0;
        }
        while (it.hasNext()) {
            int i7 = getAdditionalCheckTable;
            int i8 = i7 & 23;
            getCardholderValidators = (((((i7 ^ 23) | i8) << 1) - (~(-((i7 | 23) & (~i8))))) - 1) % 128;
            int length = ((byte[]) it.next()).length;
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i9 = (length * 141) + (i * (-279));
            int i10 = i & currentTimeMillis;
            int i11 = (~i10) & (i | currentTimeMillis);
            int i12 = -(-(((i10 ^ i11) | (i10 & i11)) * 140));
            int i13 = ((((i9 ^ i12) | (i9 & i12)) << 1) - (~(-((i9 & (~i12)) | ((~i9) & i12))))) - 1;
            int i14 = ~length;
            int i15 = (i14 | length) & i14;
            int i16 = i15 & i;
            int i17 = (i15 | i) & (~i16);
            int i18 = ~((i17 ^ i16) | (i17 & i16));
            int i19 = ~currentTimeMillis;
            int i20 = i19 & (i19 | currentTimeMillis);
            int i21 = i20 & i;
            int i22 = (i20 | i) & (~i21);
            int i23 = (i21 ^ i22) | (i22 & i21);
            int i24 = ~i23;
            int i25 = (i23 | i24) & i24;
            int i26 = ((i18 ^ i25) | (i18 & i25)) * (-280);
            int i27 = ((i13 | i26) << 1) - (i26 ^ i13);
            int i28 = ~i;
            int i29 = i28 ^ length;
            int i30 = i28 & length;
            int i31 = (i29 ^ i30) | (i30 & i29);
            int i32 = ~i31;
            int i33 = (i31 | i32) & i32;
            int i34 = i20 & length;
            int i35 = (length | i20) & (~i34);
            int i36 = (i35 ^ i34) | (i35 & i34);
            int i37 = ~i36;
            int i38 = (i36 | i37) & i37;
            int i39 = ((~i38) & i33) | ((~i33) & i38);
            int i40 = i38 & i33;
            int i41 = (i40 ^ i39) | (i40 & i39);
            int i42 = (i28 & i14) | ((~i14) & i);
            int i43 = i & i14;
            int i44 = (i43 ^ i42) | (i43 & i42);
            int i45 = i44 ^ currentTimeMillis;
            int i46 = i44 & currentTimeMillis;
            int i47 = ~((i46 ^ i45) | (i46 & i45));
            int i48 = ((~i47) & i41) | ((~i41) & i47);
            int i49 = i47 & i41;
            int i50 = ((i49 ^ i48) | (i49 & i48)) * 140;
            int i51 = ((~i50) & i27) | ((~i27) & i50);
            int i52 = (i50 & i27) << 1;
            i = (i52 ^ i51) + ((i52 & i51) << 1);
            int i53 = getCardholderValidators;
            int i54 = i53 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getAdditionalCheckTable = (i54 + ((i53 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i54)) % 128;
        }
        byte[] bArr = new byte[i];
        int i55 = getAdditionalCheckTable;
        int i56 = i55 & 93;
        int i57 = -(-(i55 | 93));
        getCardholderValidators = ((i56 & i57) + (i57 | i56)) % 128;
        int i58 = 0;
        for (byte[] bArr2 : list) {
            int i59 = getAdditionalCheckTable;
            getCardholderValidators = (((i59 & 113) - (~(i59 | 113))) - 1) % 128;
            java.lang.System.arraycopy(bArr2, 0, bArr, i58, bArr2.length);
            int length2 = bArr2.length;
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i60 = length2 * (-711);
            int i61 = -(-(i58 * 713));
            int i62 = i60 & i61;
            int i63 = -(-((i60 ^ i61) | i62));
            int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
            int i65 = ~i58;
            int i66 = ~length2;
            int i67 = (i65 & i66) | ((~i65) & length2);
            int i68 = i65 & length2;
            int i69 = ~((i67 ^ i68) | (i68 & i67));
            int i70 = ~currentTimeMillis2;
            int i71 = i70 & length2;
            int i72 = i71 | ((~i71) & (i70 | length2));
            int i73 = ~i72;
            int i74 = (i72 | i73) & i73;
            int i75 = i69 & i74;
            int i76 = (i69 | i74) & (~i75);
            int i77 = -(-(((i76 ^ i75) | (i76 & i75)) * (-712)));
            int i78 = (i64 & i77) + (i64 | i77);
            int i79 = (i65 ^ i70) | (i65 & i70);
            int i80 = i79 ^ length2;
            int i81 = i79 & length2;
            int i82 = ~((i81 ^ i80) | (i81 & i80));
            int i83 = (i58 & i66) | i68 | (i58 & length2);
            int i84 = (i83 ^ currentTimeMillis2) | (i83 & currentTimeMillis2);
            int i85 = ~i84;
            int i86 = (i84 | i85) & i85;
            int i87 = i82 & i86;
            int i88 = (i86 | i82) & (~i87);
            int i89 = ((i88 ^ i87) | (i88 & i87)) * (-712);
            int i90 = i78 & i89;
            int i91 = (currentTimeMillis2 | i70) & i70;
            int i92 = i91 & length2;
            int i93 = (length2 | i91) & (~i92);
            int i94 = (i93 ^ i92) | (i93 & i92);
            int i95 = (((i89 | i78) & (~i90)) - (~(i90 << 1))) - 1;
            int i96 = ~i94;
            i58 = i95 + ((((i94 | i96) & i96) | i65) * 712);
            int i97 = getAdditionalCheckTable;
            getCardholderValidators = ((-2) - (~(((i97 | 60) << 1) - (i97 ^ 60)))) % 128;
        }
        int i98 = getAdditionalCheckTable + 43;
        getCardholderValidators = i98 % 128;
        if (i98 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static void writeReplace(java.util.List<byte[]> list) {
        int i = getCardholderValidators;
        int i2 = i & 47;
        int i3 = -(-((i ^ 47) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        getAdditionalCheckTable = i4 % 128;
        if (i4 % 2 != 0) {
            java.util.Iterator<byte[]> it = list.iterator();
            int i5 = getAdditionalCheckTable;
            int i6 = i5 & 33;
            int i7 = (i5 ^ 33) | i6;
            getCardholderValidators = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
            while (it.hasNext()) {
                int i8 = getCardholderValidators;
                int i9 = i8 & 109;
                int i10 = ((i8 ^ 109) | i9) << 1;
                int i11 = -((i8 | 109) & (~i9));
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                getAdditionalCheckTable = i12 % 128;
                if (i12 % 2 != 0) {
                    valueOf(new java.lang.Object[]{it.next()}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                } else {
                    valueOf(new java.lang.Object[]{it.next()}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
                    throw new java.lang.ArithmeticException();
                }
            }
            int i13 = getCardholderValidators;
            int i14 = (i13 & (-86)) | ((~i13) & 85);
            int i15 = -(-((i13 & 85) << 1));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            getAdditionalCheckTable = i16 % 128;
            if (i16 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        list.iterator();
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class values {
        private static int AlternateContactlessPaymentDataJson = 0;
        private static int writeReplace = 1;
        public static final com.payair.hce.setPivotX.values DigitizedCardProfile = new com.payair.hce.setPivotX.values("ENCRYPT", 0);
        public static final com.payair.hce.setPivotX.values values = new com.payair.hce.setPivotX.values("DECRYPT", 1);
        private static final /* synthetic */ com.payair.hce.setPivotX.values[] valueOf = DigitizedCardProfile();

        private static /* synthetic */ com.payair.hce.setPivotX.values[] DigitizedCardProfile() {
            int i = AlternateContactlessPaymentDataJson;
            writeReplace = ((-2) - (~(i + 60))) % 128;
            com.payair.hce.setPivotX.values[] valuesVarArr = {DigitizedCardProfile, values};
            int i2 = i & 87;
            int i3 = ((i ^ 87) | i2) << 1;
            int i4 = -((i | 87) & (~i2));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            writeReplace = i5 % 128;
            if (i5 % 2 != 0) {
                return valuesVarArr;
            }
            throw null;
        }

        public static com.payair.hce.setPivotX.values valueOf(java.lang.String str) {
            int i = writeReplace;
            int i2 = ((i & 95) - (~(-(-(i | 95))))) - 1;
            AlternateContactlessPaymentDataJson = i2 % 128;
            com.payair.hce.setPivotX.values valuesVar = (com.payair.hce.setPivotX.values) java.lang.Enum.valueOf(com.payair.hce.setPivotX.values.class, str);
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = writeReplace;
            int i4 = i3 & 35;
            int i5 = -(-(i3 | 35));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            AlternateContactlessPaymentDataJson = i6 % 128;
            if (i6 % 2 == 0) {
                return valuesVar;
            }
            throw null;
        }

        public static com.payair.hce.setPivotX.values[] values() {
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i = currentTimeMillis & 1475364980;
            int i2 = (~i) & (currentTimeMillis | 1475364980);
            int i3 = ~((i ^ i2) | (i & i2));
            int i4 = ((i3 & 1475402740) | ((-1475402741) & (~i3)) | (i3 & (-1475402741))) * 345;
            int i5 = i4 & (-642591856);
            int i6 = i5 + ((i4 ^ (-642591856)) | i5);
            int i7 = ~currentTimeMillis;
            int i8 = i7 & (i7 | currentTimeMillis);
            int i9 = i8 & 1475364980;
            int i10 = (1475364980 | i8) & (~i9);
            int i11 = ~((i10 ^ i9) | (i10 & i9));
            int i12 = i11 ^ 380649492;
            int i13 = i11 & 380649492;
            int i14 = ((i13 ^ i12) | (i13 & i12)) * 345;
            int i15 = i6 & i14;
            int i16 = (i14 | i6) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 & i17) + (i16 | i17);
            int i19 = currentTimeMillis & 1475402740;
            int i20 = (currentTimeMillis | 1475402740) & (~i19);
            int i21 = -(-((~((i20 ^ i19) | (i20 & i19))) * 345));
            int i22 = -(-((i21 ^ i18) | (i18 & i21)));
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i23 = ~currentTimeMillis2;
            int i24 = (i23 | currentTimeMillis2) & i23;
            int i25 = i24 & 1296405331;
            int i26 = (i24 | 1296405331) & (~i25);
            int i27 = ~((i26 ^ i25) | (i26 & i25));
            int i28 = ((i27 ^ (-961615921)) | (i27 & (-961615921))) * (-90);
            int i29 = ((~i28) & (-789762534)) | (789762533 & i28);
            int i30 = (i28 & (-789762534)) << 1;
            int i31 = currentTimeMillis2 & 1296405331;
            int i32 = (~i31) & (currentTimeMillis2 | 1296405331);
            int i33 = (i31 ^ i32) | (i31 & i32);
            int i34 = ~i33;
            int i35 = (i33 | i34) & i34;
            int i36 = i35 & 155258896;
            int i37 = (i35 | 155258896) & (~i36);
            int i38 = ((((i29 | i30) << 1) - (i30 ^ i29)) - (~(-(-(((i37 & i36) | (i37 ^ i36)) * (-45)))))) - 1;
            int i39 = currentTimeMillis2 ^ 961615920;
            int i40 = currentTimeMillis2 & 961615920;
            int i41 = ~((i40 ^ i39) | (i40 & i39));
            int i42 = i41 & 1296405331;
            int i43 = ((i41 | 1296405331) & (~i42)) | i42;
            int i44 = (i23 ^ (-961615921)) | (i23 & (-961615921));
            int i45 = ~i44;
            int i46 = (i44 | i45) & i45;
            int i47 = (((~i43) & i46) | ((~i46) & i43) | (i43 & i46)) * 45;
            int i48 = i38 & i47;
            int i49 = i47 | i38;
            com.payair.hce.setPivotX.values[] valuesVarArr = valueOf;
            if ((r1 - (~i22)) - 1 <= (i48 & i49) + (i49 | i48)) {
                return (com.payair.hce.setPivotX.values[]) valuesVarArr.clone();
            }
            throw null;
        }

        static {
            int i = writeReplace;
            int i2 = i ^ 17;
            int i3 = (((i & 17) | i2) << 1) - i2;
            AlternateContactlessPaymentDataJson = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        private values(java.lang.String str, int i) {
        }
    }

    static void SdkCoreAlternateContactlessPaymentDataImpl() {
        getCiacDecline = new char[]{24261, 50407, 27275, 37045, 13861, 23569, 49724, 27091, 36754, 13740, 23388, 49432, 26426, 35476, 12502, 22189, 64593, 25203, 34879, 12229, 22007, 64417, 24908, 34659, 11522, 20700, 63212, 7304, 33450, 10319, 19993, 62523, 7146, 33174, 10153, 19805, 62212, 6444, 12282, 46552, 7092, 57738, 18202, 11566, 45827, 6380, 65197, 17555, 10851, 45095, 5637, 64427, 16893, 10130, 36195, 4956, 63744, 24318, 9462, 35500, 4216, 63067, 23591, 8700, 11507, 46801, 6333, 57987, 17427, 11815, 45066, 7141, 64932, 18330, 10602, 45870, 5388, 63650, 17130, 9371, 36474, 4179, 64026, 24053, 10184, 35200, 4982, 62801, 24356, 8939, 33991};
        getPaymentFci = 4454304251475969158L;
        getApplicationLifeCycleData = -516301861;
        getCvmResetTimeout = 520368573;
        getDualTapResetTimeout = -624095046;
        getCardLayoutDescription = new byte[]{94, 103, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 110, 14, 122, 102, 70, -42, 104, 59, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -77, -112, 64, -71, -114, -94, 69, 106, 99, -13, -13, 110, 88, -52, 57, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -25, com.google.common.base.Ascii.FF, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -37, 39, 69, -53, -87, -9, -50, -15};
    }

    private static byte[] valueOf(java.util.List<byte[]> list) {
        return (byte[]) valueOf(new java.lang.Object[]{list}, -579574651, 579574671, (int) java.lang.System.currentTimeMillis());
    }

    private static byte[] IccPrivateKeyCrtComponentsJson(byte[] bArr, byte[] bArr2) {
        return (byte[]) valueOf(new java.lang.Object[]{bArr, bArr2}, -644104696, 644104721, (int) java.lang.System.currentTimeMillis());
    }

    private static byte[] getCvmResetTimeout(byte[] bArr) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{bArr}, -1480239441, 1480239448, (int) java.lang.System.currentTimeMillis());
    }

    private byte[] DigitizedCardProfile(java.lang.String str) {
        return (byte[]) valueOf(new java.lang.Object[]{this, str}, 869341976, -869341959, java.lang.System.identityHashCode(this));
    }

    private byte[] writeReplace(byte[] bArr, java.lang.String str, byte[] bArr2) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{this, bArr, str, bArr2}, -410923553, 410923591, java.lang.System.identityHashCode(this));
    }

    private static byte[] getAid(byte[] bArr, byte[] bArr2, com.payair.hce.setPivotX.values valuesVar) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{bArr, bArr2, valuesVar}, -616291904, 616291928, (int) java.lang.System.currentTimeMillis());
    }

    private byte[] SdkCoreAlternateContactlessPaymentDataImpl(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{this, bArr, bArr2}, 231582132, -231582120, java.lang.System.identityHashCode(this));
    }

    private static byte[] writeReplace(byte[] bArr, byte[] bArr2, com.payair.hce.setPivotX.values valuesVar, boolean z) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{bArr, bArr2, valuesVar, java.lang.Boolean.valueOf(z)}, 717882300, -717882294, (int) java.lang.System.currentTimeMillis());
    }

    private byte[] writeReplace(byte[] bArr, byte[] bArr2, com.payair.hce.setPivotX.values valuesVar) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{this, bArr, bArr2, valuesVar}, -399686052, 399686088, java.lang.System.identityHashCode(this));
    }

    private static byte[] getApplicationLifeCycleData(byte[] bArr) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{bArr}, -1959683382, 1959683398, (int) java.lang.System.currentTimeMillis());
    }

    private byte[] values(byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{this, bArr, bArr2, java.lang.Integer.valueOf(i)}, 2063189812, -2063189770, i);
    }

    private static byte[] RecordsJson(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{bArr, bArr2}, -1016429340, 1016429361, (int) java.lang.System.currentTimeMillis());
    }

    @Override // com.payair.hce.sendUpdateRNSInformation
    public final byte[] getProfileVersion(byte[] bArr) {
        return (byte[]) valueOf(new java.lang.Object[]{this, bArr}, -2081622243, 2081622256, java.lang.System.identityHashCode(this));
    }

    private static byte[] AlternateContactlessPaymentDataJson(int i) {
        return (byte[]) valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, 1285877597, -1285877579, i);
    }

    private static byte[] getProfileVersion(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{bArr, bArr2}, -2005776254, 2005776256, (int) java.lang.System.currentTimeMillis());
    }

    private static void SdkCoreBusinessLogicModuleImpl(byte[] bArr) {
        valueOf(new java.lang.Object[]{bArr}, 987015570, -987015561, (int) java.lang.System.currentTimeMillis());
    }

    private static byte[] DigitizedCardProfile(byte[] bArr, int i, byte[] bArr2, int i2) {
        return (byte[]) valueOf(new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i), bArr2, java.lang.Integer.valueOf(i2)}, 1520612320, -1520612288, i);
    }

    private static byte[] writeReplace(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{bArr, bArr2}, 1852088232, -1852088222, (int) java.lang.System.currentTimeMillis());
    }

    private static byte[] getPaymentFci(byte[] bArr) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{bArr}, 2143135889, -2143135886, (int) java.lang.System.currentTimeMillis());
    }

    private byte[] valueOf(byte[] bArr, byte[] bArr2, com.payair.hce.setPivotX.values valuesVar) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{this, bArr, bArr2, valuesVar}, 193698964, -193698960, java.lang.System.identityHashCode(this));
    }

    private java.util.concurrent.Future<byte[]> valueOf(com.payair.hce.isSessionAvailable issessionavailable) throws java.security.GeneralSecurityException {
        return (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, issessionavailable}, 937760869, -937760830, java.lang.System.identityHashCode(this));
    }

    private java.util.concurrent.Future<byte[]> getCvrMaskAnd(byte[] bArr) throws java.security.GeneralSecurityException {
        return (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, bArr}, -111572494, 111572524, java.lang.System.identityHashCode(this));
    }

    private java.util.concurrent.Future<byte[]> AlternateContactlessPaymentDataJson(com.payair.hce.Initializer initializer) throws java.security.GeneralSecurityException {
        return (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, initializer}, 694733650, -694733619, java.lang.System.identityHashCode(this));
    }

    private java.util.concurrent.Future<byte[]> RecordsJson(byte[] bArr) throws java.security.GeneralSecurityException {
        return (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, bArr}, 2064136125, -2064136085, java.lang.System.identityHashCode(this));
    }

    private java.util.concurrent.Future<byte[]> DigitizedCardProfile(com.payair.hce.accessperformEnroll accessperformenroll) throws java.security.GeneralSecurityException {
        return (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, accessperformenroll}, -593266716, 593266724, java.lang.System.identityHashCode(this));
    }

    final java.util.concurrent.Future<byte[]> values(com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk) throws java.security.GeneralSecurityException {
        return (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, initializevisapaymentsdk}, 1893095039, -1893095002, java.lang.System.identityHashCode(this));
    }

    private java.util.concurrent.Future<byte[]> IccPrivateKeyCrtComponentsJson(byte[] bArr) throws java.security.GeneralSecurityException {
        return (java.util.concurrent.Future) valueOf(new java.lang.Object[]{this, bArr}, -1260886295, 1260886321, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.sendUpdateRNSInformation
    public final com.payair.hce.initializeVisaPaymentSdk values(byte[] bArr) {
        return (com.payair.hce.initializeVisaPaymentSdk) valueOf(new java.lang.Object[]{this, bArr}, 424105996, -424105973, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.sendUpdateRNSInformation
    public final int valueOf(com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk) throws java.security.GeneralSecurityException {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this, initializevisapaymentsdk}, -1204859455, 1204859470, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.getDetailedMessage
    public final boolean valueOf(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, bArr, bArr2}, 1413613151, -1413613146, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.onNewToken
    public final com.payair.hce.initializeVisaPaymentSdk AlternateContactlessPaymentDataJson(com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings, com.payair.hce.isSessionAvailable issessionavailable, com.payair.hce.performEnroll performenroll) throws java.security.GeneralSecurityException {
        return (com.payair.hce.initializeVisaPaymentSdk) valueOf(new java.lang.Object[]{this, checkautomatictimesettings, issessionavailable, performenroll}, 1853957745, -1853957744, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.onNewToken
    public final byte[] writeReplace(com.payair.hce.DeviceNotSecureException deviceNotSecureException, byte[] bArr, com.payair.hce.updateRNSInformation updaternsinformation) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{this, deviceNotSecureException, bArr, updaternsinformation}, -1707396745, 1707396756, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.onNewToken
    public final byte[] AlternateContactlessPaymentDataJson(com.payair.hce.isSessionAvailable issessionavailable, com.payair.hce.isSessionAvailable issessionavailable2, byte[] bArr) throws java.security.GeneralSecurityException {
        return (byte[]) valueOf(new java.lang.Object[]{this, issessionavailable, issessionavailable2, bArr}, 1851772382, -1851772355, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.onNewToken
    public final com.payair.hce.isSessionAvailable AlternateContactlessPaymentDataJson(com.payair.hce.isSessionAvailable issessionavailable, com.payair.hce.accessperformEnrollDas accessperformenrolldas) {
        return (com.payair.hce.isSessionAvailable) valueOf(new java.lang.Object[]{this, issessionavailable, accessperformenrolldas}, 810266075, -810266075, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.onNewToken
    public final com.payair.hce._sendUpdateRNSInformation AlternateContactlessPaymentDataJson(com.payair.hce.isSessionAvailable issessionavailable, byte[] bArr) throws java.security.GeneralSecurityException {
        return (com.payair.hce._sendUpdateRNSInformation) valueOf(new java.lang.Object[]{this, issessionavailable, bArr}, -387840477, 387840511, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.getErrorName
    public final com.payair.hce.isSessionAvailable DigitizedCardProfile(byte[] bArr) throws java.security.GeneralSecurityException {
        return (com.payair.hce.isSessionAvailable) valueOf(new java.lang.Object[]{this, bArr}, 2057362674, -2057362660, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.getErrorName
    public final com.payair.hce.initializeVisaPaymentSdk writeReplace(byte[] bArr) throws java.security.GeneralSecurityException {
        return (com.payair.hce.initializeVisaPaymentSdk) valueOf(new java.lang.Object[]{this, bArr}, 1386886246, -1386886213, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setErrors
    public final com.payair.hce.sendUpdateRNSInformation DigitizedCardProfile() {
        return (com.payair.hce.sendUpdateRNSInformation) valueOf(new java.lang.Object[]{this}, -1844614042, 1844614064, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setErrors
    public final com.payair.hce.getErrorName valueOf() {
        return (com.payair.hce.getErrorName) valueOf(new java.lang.Object[]{this}, -1987816929, 1987816970, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setErrors
    public final com.payair.hce.getDetailedMessage AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.getDetailedMessage) valueOf(new java.lang.Object[]{this}, 321174812, -321174783, java.lang.System.identityHashCode(this));
    }

    private static java.lang.String getGpoResponse() {
        return (java.lang.String) valueOf(new java.lang.Object[0], 1101484017, -1101483998, (int) java.lang.System.currentTimeMillis());
    }

    private java.lang.String getCvrMaskAnd() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 802533406, -802533378, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{89, 16, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -117};
        $$b = 45;
    }

    protected final void RecordsJson() throws java.security.GeneralSecurityException {
        valueOf(new java.lang.Object[]{this}, 305418831, -305418796, java.lang.System.identityHashCode(this));
    }
}
