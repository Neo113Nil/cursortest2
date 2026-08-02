package com.payair.hce;

/* loaded from: classes4.dex */
public final class createConfigurationContext {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static final byte[] SdkCoreBusinessLogicModuleImpl = null;
    private static int getCvrMaskAnd;
    private static final int getGpoResponse = 0;
    private static int getPaymentFci;
    private boolean AlternateContactlessPaymentDataJson;
    private boolean DigitizedCardProfile;
    private boolean RecordsJson;
    private boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private boolean getAid;
    private boolean getProfileVersion;
    private boolean valueOf;
    private boolean values;
    private boolean writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 34 - (b2 * 27);
        byte[] bArr = $$a;
        int i4 = 118 - (b * 19);
        int i5 = 37 - (i * 33);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i4 += -i6;
            i5++;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i4 += -i6;
            i5++;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (s2 * 4) + 115;
        int i4 = 1 - (s * 3);
        int i5 = (b * 3) + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            i3 = i4;
            i = 0;
            int i7 = i5;
            i3 += i6;
            i2 = i7 + 1;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i2];
            i7 = i2;
            i3 += i6;
            i2 = i7 + 1;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        } else {
            i = 0;
            i2 = i5;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = (~i) | i2;
        int i5 = ~i3;
        int i6 = (i * 141) + (i2 * (-279)) + ((i2 | i3) * 140) + (((~i4) | (~(i5 | i2))) * (-280)) + (((~(i | (~i2))) | (~(i5 | i)) | (~(i4 | i3))) * 140);
        return i6 != 1 ? i6 != 2 ? values(objArr) : valueOf(objArr) : AlternateContactlessPaymentDataJson(objArr);
    }

    public createConfigurationContext() {
    }

    static /* synthetic */ com.payair.hce.initializeVisaPaymentSdk valueOf(com.payair.hce.createDisplayContext createdisplaycontext, com.payair.hce.getErrorName geterrorname) {
        getCvrMaskAnd = (getPaymentFci + 59) % 128;
        com.payair.hce.initializeVisaPaymentSdk values = values(createdisplaycontext, geterrorname);
        int i = getPaymentFci + 81;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            return values;
        }
        throw null;
    }

    public static com.payair.hce.checkForSuccess AlternateContactlessPaymentDataJson(final com.payair.hce.setImportantForAutofill setimportantforautofill, final com.payair.hce.getErrorName geterrorname) {
        com.payair.hce.checkForSuccess checkforsuccess = new com.payair.hce.checkForSuccess() { // from class: com.payair.hce.createConfigurationContext.2
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static int DigitizedCardProfile;
            private static short[] IccPrivateKeyCrtComponentsJson;
            private static int RecordsJson;
            private static byte[] SdkCoreAlternateContactlessPaymentDataImpl;
            private static int getAid;
            private static int valueOf;
            private static int values;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
                int i3;
                int i4;
                int i5 = 104 - (i * 4);
                byte[] bArr = $$a;
                int i6 = b + 4;
                int i7 = 1 - (i2 * 2);
                byte[] bArr2 = new byte[i7];
                if (bArr == null) {
                    i5 = i7;
                    int i8 = i6;
                    i4 = 0;
                    i5 += -i6;
                    i6 = i8;
                    i3 = i4;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i5;
                    if (i4 == i7) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    int i9 = i6 + 1;
                    i8 = i9;
                    i6 = bArr[i9];
                    i5 += -i6;
                    i6 = i8;
                    i3 = i4;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i5;
                    if (i4 == i7) {
                    }
                } else {
                    i3 = 0;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i5;
                    if (i4 == i7) {
                    }
                }
            }

            public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
                return AlternateContactlessPaymentDataJson(objArr);
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                RecordsJson = (getAid + 49) % 128;
                com.payair.hce.getStatusCodeFromServer getstatuscodefromserver = com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson;
                int i = getAid + 95;
                RecordsJson = i % 128;
                if (i % 2 == 0) {
                    return getstatuscodefromserver;
                }
                throw null;
            }

            @Override // com.payair.hce.checkForSuccess
            public final byte[] getDigitizedCardId() {
                int i = RecordsJson + 111;
                getAid = i % 128;
                if (i % 2 == 0) {
                    com.payair.hce.setVerticalScrollbarThumbDrawable.valueOf(com.payair.hce.setImportantForAutofill.this.getDigitizedCardId());
                    throw null;
                }
                byte[] valueOf2 = com.payair.hce.setVerticalScrollbarThumbDrawable.valueOf(com.payair.hce.setImportantForAutofill.this.getDigitizedCardId());
                int i2 = RecordsJson + 83;
                getAid = i2 % 128;
                if (i2 % 2 != 0) {
                    return valueOf2;
                }
                throw null;
            }

            @Override // com.payair.hce.checkForSuccess
            public final byte[] getCardCountryCode() {
                int i = getAid + 43;
                RecordsJson = i % 128;
                if (i % 2 == 0) {
                    byte[] crmCountryCode = com.payair.hce.setImportantForAutofill.this.getMppLiteModule().getCardRiskManagementData().getCrmCountryCode();
                    getAid = (RecordsJson + 69) % 128;
                    return crmCountryCode;
                }
                com.payair.hce.setImportantForAutofill.this.getMppLiteModule().getCardRiskManagementData().getCrmCountryCode();
                throw null;
            }

            @Override // com.payair.hce.checkForSuccess
            public final byte[] getPan() {
                RecordsJson = (getAid + 75) % 128;
                java.lang.String substring = com.payair.hce.setImportantForAutofill.this.getDigitizedCardId().substring(0, 19);
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(277148887 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.graphics.Color.red(0) + 646199716, android.text.TextUtils.getCapsMode("", 0, 0) - 112, (byte) android.view.View.resolveSizeAndState(0, 0, 0), (short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr);
                java.lang.String replaceAll = substring.replaceAll(((java.lang.String) objArr[0]).intern(), "");
                if (replaceAll.length() % 2 != 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(replaceAll);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(277148885 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 646199715, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 113, (byte) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (short) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr2);
                    sb.append(((java.lang.String) objArr2[0]).intern());
                    replaceAll = sb.toString();
                    getAid = (RecordsJson + 117) % 128;
                }
                return com.payair.hce.setVerticalScrollbarThumbDrawable.valueOf(replaceAll);
            }

            @Override // com.payair.hce.checkForSuccess
            public final boolean isTransactionIdRequired() {
                int i = (RecordsJson + 69) % 128;
                getAid = i;
                int i2 = i + 95;
                RecordsJson = i2 % 128;
                if (i2 % 2 == 0) {
                    return true;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // com.payair.hce.checkForSuccess
            public final com.payair.hce.setDetailedMessage getWalletData() {
                com.payair.hce.setDetailedMessage setdetailedmessage = new com.payair.hce.setDetailedMessage() { // from class: com.payair.hce.createConfigurationContext.2.3
                    private static int DigitizedCardProfile = 0;
                    private static int writeReplace = 1;

                    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
                        int i4 = ~((~i) | (~i2));
                        int i5 = i | i2;
                        int i6 = (i * (-755)) + (i2 * (-755)) + (i4 * 1512) + (((~(i5 | i3)) | i4) * (-756)) + (((~i3) | i5) * 756);
                        if (i6 == 1) {
                            return DigitizedCardProfile(objArr);
                        }
                        if (i6 == 2) {
                            return valueOf(objArr);
                        }
                        if (i6 != 3) {
                            if (i6 == 4) {
                                return AlternateContactlessPaymentDataJson(objArr);
                            }
                            com.payair.hce.createConfigurationContext.AnonymousClass2.AnonymousClass3 anonymousClass3 = (com.payair.hce.createConfigurationContext.AnonymousClass2.AnonymousClass3) objArr[0];
                            int i7 = DigitizedCardProfile;
                            int i8 = i7 & 25;
                            int i9 = (i7 ^ 25) | i8;
                            writeReplace = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
                            return java.lang.Integer.valueOf(com.payair.hce.setImportantForAutofill.this.getBusinessLogicModule().getCvmResetTimeout());
                        }
                        int i10 = writeReplace;
                        int i11 = i10 ^ 57;
                        int i12 = -(-((i10 & 57) << 1));
                        DigitizedCardProfile = ((i11 & i12) + (i12 | i11)) % 128;
                        com.payair.hce.setjSONObject setjsonobject = com.payair.hce.setjSONObject.values;
                        DigitizedCardProfile = (writeReplace + 75) % 128;
                        return setjsonobject;
                    }

                    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                        int i = DigitizedCardProfile;
                        int i2 = i & 111;
                        writeReplace = ((((i ^ 111) | i2) << 1) - ((i | 111) & (~i2))) % 128;
                        com.payair.hce.setOrderRef setorderref = com.payair.hce.setOrderRef.AlternateContactlessPaymentDataJson;
                        int i3 = (-2) - (~(writeReplace + 86));
                        DigitizedCardProfile = i3 % 128;
                        if (i3 % 2 == 0) {
                            return setorderref;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                        com.payair.hce.createConfigurationContext.AnonymousClass2.AnonymousClass3 anonymousClass3 = (com.payair.hce.createConfigurationContext.AnonymousClass2.AnonymousClass3) objArr[0];
                        int i = writeReplace;
                        DigitizedCardProfile = (((i & (-62)) | ((~i) & 61)) + ((i & 61) << 1)) % 128;
                        int dualTapResetTimeout = com.payair.hce.setImportantForAutofill.this.getBusinessLogicModule().getDualTapResetTimeout();
                        int i2 = DigitizedCardProfile;
                        int i3 = (i2 & 100) + (i2 | 100);
                        int i4 = (~i3) + (i3 << 1);
                        writeReplace = i4 % 128;
                        if (i4 % 2 != 0) {
                            return java.lang.Integer.valueOf(dualTapResetTimeout);
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                        int i = DigitizedCardProfile;
                        int i2 = ((i | 107) << 1) - (i ^ 107);
                        writeReplace = i2 % 128;
                        com.payair.hce.getjSONObject getjsonobject = com.payair.hce.getjSONObject.valueOf;
                        if (i2 % 2 != 0) {
                            return getjsonobject;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public final com.payair.hce.setjSONObject getProductType() {
                        return (com.payair.hce.setjSONObject) valueOf(new java.lang.Object[]{this}, -622357138, 622357141, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public final com.payair.hce.getjSONObject getAccountType() {
                        return (com.payair.hce.getjSONObject) valueOf(new java.lang.Object[]{this}, -1377514537, 1377514539, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public final int getDualTapResetTimeout() {
                        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, -628239197, 628239198, java.lang.System.identityHashCode(this))).intValue();
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public final int getCvmResetTimeout() {
                        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 962625178, -962625178, java.lang.System.identityHashCode(this))).intValue();
                    }

                    @Override // com.payair.hce.setDetailedMessage
                    public final com.payair.hce.setOrderRef getCardholderValidator() {
                        return (com.payair.hce.setOrderRef) valueOf(new java.lang.Object[]{this}, 1119015448, -1119015444, java.lang.System.identityHashCode(this));
                    }
                };
                RecordsJson = (getAid + 75) % 128;
                return setdetailedmessage;
            }

            @Override // com.payair.hce.checkForSuccess
            public final com.payair.hce.JsonResponse getContactlessPaymentData() {
                final com.payair.hce.checkCallingUriPermission contactlessPaymentData = com.payair.hce.setImportantForAutofill.this.getMppLiteModule().getContactlessPaymentData();
                final com.payair.hce.getErrorName geterrorname2 = geterrorname;
                com.payair.hce.JsonResponse jsonResponse = new com.payair.hce.JsonResponse() { // from class: com.payair.hce.createConfigurationContext.4
                    private static int AlternateContactlessPaymentDataJson = 0;
                    private static int DigitizedCardProfile = 1;

                    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                        int i4 = ~i2;
                        int i5 = (~i3) | i4;
                        int i6 = i2 | i;
                        int i7 = ~(i3 | i6);
                        int i8 = (i * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) + (i2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) + (((~((~i) | i4)) | (~i5) | i7) * (-252)) + (i6 * (-252)) + (((~(i | i5)) | i7) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        int i9 = 0;
                        switch (i8) {
                            case 1:
                                return values(objArr);
                            case 2:
                                return DigitizedCardProfile(objArr);
                            case 3:
                                return valueOf(objArr);
                            case 4:
                                return AlternateContactlessPaymentDataJson(objArr);
                            case 5:
                                com.payair.hce.createConfigurationContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createConfigurationContext.AnonymousClass4) objArr[0];
                                int i10 = AlternateContactlessPaymentDataJson;
                                DigitizedCardProfile = ((((i10 & (-44)) | ((~i10) & 43)) - (~((i10 & 43) << 1))) - 1) % 128;
                                byte[] issuerApplicationData = com.payair.hce.checkCallingUriPermission.this.getIssuerApplicationData();
                                AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 97) % 128;
                                return issuerApplicationData;
                            case 6:
                                return getProfileVersion(objArr);
                            case 7:
                                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
                            case 8:
                                int i11 = DigitizedCardProfile;
                                int i12 = i11 & 53;
                                AlternateContactlessPaymentDataJson = (i12 + ((i11 ^ 53) | i12)) % 128;
                                int i13 = i11 & 121;
                                int i14 = ((i11 ^ 121) | i13) << 1;
                                int i15 = -((i11 | 121) & (~i13));
                                AlternateContactlessPaymentDataJson = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
                                return null;
                            case 9:
                                return IccPrivateKeyCrtComponentsJson(objArr);
                            case 10:
                                return RecordsJson(objArr);
                            case 11:
                                int i16 = DigitizedCardProfile;
                                int i17 = i16 & 83;
                                int i18 = (~i17) & (i16 | 83);
                                int i19 = i17 << 1;
                                AlternateContactlessPaymentDataJson = ((i18 & i19) + (i19 | i18)) % 128;
                                AlternateContactlessPaymentDataJson = (((i16 | 111) << 1) - ((i16 & (-112)) | ((~i16) & 111))) % 128;
                                return java.lang.Boolean.TRUE;
                            case 12:
                                int i20 = DigitizedCardProfile;
                                int i21 = i20 ^ 1;
                                int i22 = (i20 & 1) << 1;
                                int i23 = ((i21 ^ i22) + ((i22 & i21) << 1)) % 128;
                                AlternateContactlessPaymentDataJson = i23;
                                DigitizedCardProfile = (i23 + 37) % 128;
                                return null;
                            case 13:
                                return getAid(objArr);
                            case 14:
                                return getPaymentFci(objArr);
                            case 15:
                                return getCiacDecline(objArr);
                            case 16:
                                int i24 = DigitizedCardProfile;
                                int i25 = ((i24 & (-100)) | ((~i24) & 99)) + ((i24 & 99) << 1);
                                AlternateContactlessPaymentDataJson = i25 % 128;
                                return java.lang.Boolean.valueOf(i25 % 2 == 0);
                            case 17:
                                com.payair.hce.checkCallingOrSelfUriPermissions[] records = com.payair.hce.checkCallingUriPermission.this.getRecords();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                int length = records.length;
                                int i26 = AlternateContactlessPaymentDataJson + 21;
                                while (true) {
                                    int i27 = i26 % 128;
                                    DigitizedCardProfile = i27;
                                    if (i9 >= length) {
                                        AlternateContactlessPaymentDataJson = (((i27 | 45) << 1) - (i27 ^ 45)) % 128;
                                        return arrayList;
                                    }
                                    final com.payair.hce.checkCallingOrSelfUriPermissions checkcallingorselfuripermissions = records[i9];
                                    arrayList.add(new com.payair.hce.setNetworkError() { // from class: com.payair.hce.createConfigurationContext.1
                                        private static int AlternateContactlessPaymentDataJson = 1;
                                        private static int writeReplace;

                                        public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2, int i28, int i29, int i30) {
                                            int i31 = i28 | i29;
                                            int i32 = ~i28;
                                            int i33 = (~i30) | i32;
                                            int i34 = ~(i30 | i31);
                                            int i35 = (i28 * 503) + (i29 * 503) + (i31 * (-502)) + (((~((~i29) | i32)) | (~i33) | i34) * (-502)) + (((~(i29 | i33)) | i34) * 502);
                                            if (i35 == 1) {
                                                return DigitizedCardProfile(objArr2);
                                            }
                                            if (i35 == 2) {
                                                return valueOf(objArr2);
                                            }
                                            com.payair.hce.createConfigurationContext.AnonymousClass1 anonymousClass1 = (com.payair.hce.createConfigurationContext.AnonymousClass1) objArr2[0];
                                            int i36 = AlternateContactlessPaymentDataJson;
                                            int i37 = i36 ^ 77;
                                            int i38 = ((i36 & 77) | i37) << 1;
                                            int i39 = -i37;
                                            writeReplace = (((i38 | i39) << 1) - (i38 ^ i39)) % 128;
                                            byte recordNumber = com.payair.hce.checkCallingOrSelfUriPermissions.this.getRecordNumber();
                                            int i40 = writeReplace;
                                            int i41 = i40 & 35;
                                            int i42 = i40 | 35;
                                            AlternateContactlessPaymentDataJson = ((i41 & i42) + (i42 | i41)) % 128;
                                            return java.lang.Byte.valueOf(recordNumber);
                                        }

                                        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                                            com.payair.hce.createConfigurationContext.AnonymousClass1 anonymousClass1 = (com.payair.hce.createConfigurationContext.AnonymousClass1) objArr2[0];
                                            AlternateContactlessPaymentDataJson = (writeReplace + 69) % 128;
                                            int sfi = com.payair.hce.checkCallingOrSelfUriPermissions.this.getSfi() << 3;
                                            int identityHashCode = java.lang.System.identityHashCode(anonymousClass1);
                                            int i28 = (-2006) - (~(-(~(sfi * 503))));
                                            int i29 = ~sfi;
                                            int i30 = i29 ^ identityHashCode;
                                            int i31 = i29 & identityHashCode;
                                            int i32 = ~((i30 ^ i31) | (i30 & i31));
                                            int i33 = ~((sfi & (-5)) | (i29 & 4) | (sfi & 4));
                                            int i34 = -(-(((i33 ^ i32) | (i33 & i32)) * (-502)));
                                            int i35 = ((i28 | i34) << 1) - (i34 ^ i28);
                                            int i36 = ~identityHashCode;
                                            int i37 = (i36 | identityHashCode) & i36;
                                            int i38 = (i37 ^ i29) | (i37 & i29);
                                            int i39 = (i38 & (-5)) | ((~i38) & 4);
                                            int i40 = i38 & 4;
                                            int i41 = (i40 ^ i39) | (i40 & i39);
                                            int i42 = ~i41;
                                            int i43 = -(~(((i41 | i42) & i42) * (-502)));
                                            int i44 = ((i35 | i43) << 1) - (i43 ^ i35);
                                            int i45 = (~i44) + (i44 << 1);
                                            int i46 = (i36 & (-5)) | (identityHashCode & 4);
                                            int i47 = identityHashCode & (-5);
                                            int i48 = (i47 ^ i46) | (i47 & i46);
                                            int i49 = ~i48;
                                            int i50 = (i48 | i49) & i49;
                                            int i51 = -(~(-(-(((i50 & (~i29)) | ((~i50) & i29) | (i50 & i29)) * 502))));
                                            int i52 = (i45 & i51) + (i51 | i45);
                                            com.payair.hce.isUiContext isuicontext = (com.payair.hce.isUiContext) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.toHexString((~i52) + (i52 << 1)).toUpperCase(java.util.Locale.ENGLISH)}, -720074735, 720074736, (int) java.lang.System.currentTimeMillis());
                                            byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext}, 942400464, -942400461, java.lang.System.identityHashCode(isuicontext));
                                            int i53 = writeReplace;
                                            int i54 = i53 & 55;
                                            int i55 = (i54 - (~(-(-((i53 ^ 55) | i54))))) - 1;
                                            AlternateContactlessPaymentDataJson = i55 % 128;
                                            if (i55 % 2 != 0) {
                                                return bArr;
                                            }
                                            throw new java.lang.ArithmeticException();
                                        }

                                        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                                            com.payair.hce.createConfigurationContext.AnonymousClass1 anonymousClass1 = (com.payair.hce.createConfigurationContext.AnonymousClass1) objArr2[0];
                                            int i28 = AlternateContactlessPaymentDataJson;
                                            int i29 = (i28 | 117) << 1;
                                            int i30 = -((i28 & (-118)) | ((~i28) & 117));
                                            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                                            writeReplace = i31 % 128;
                                            if (i31 % 2 == 0) {
                                                com.payair.hce.isUiContext isuicontext = (com.payair.hce.isUiContext) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.checkCallingOrSelfUriPermissions.this.getRecordValue()}, -1034745021, 1034745025, (int) java.lang.System.currentTimeMillis());
                                                byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext}, 942400464, -942400461, java.lang.System.identityHashCode(isuicontext));
                                                if (bArr != null) {
                                                    AlternateContactlessPaymentDataJson = (writeReplace + 65) % 128;
                                                    return bArr;
                                                }
                                                com.payair.hce.isUiContext isuicontext2 = (com.payair.hce.isUiContext) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{""}, -720074735, 720074736, (int) java.lang.System.currentTimeMillis());
                                                byte[] bArr2 = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext2}, 942400464, -942400461, java.lang.System.identityHashCode(isuicontext2));
                                                int i32 = AlternateContactlessPaymentDataJson + 27;
                                                writeReplace = i32 % 128;
                                                if (i32 % 2 == 0) {
                                                    return bArr2;
                                                }
                                                throw null;
                                            }
                                            com.payair.hce.isUiContext isuicontext3 = (com.payair.hce.isUiContext) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.checkCallingOrSelfUriPermissions.this.getRecordValue()}, -1034745021, 1034745025, (int) java.lang.System.currentTimeMillis());
                                            throw null;
                                        }

                                        @Override // com.payair.hce.setNetworkError
                                        public final byte[] getRecordValue() {
                                            return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1353760317, 1353760319, java.lang.System.identityHashCode(this));
                                        }

                                        @Override // com.payair.hce.setNetworkError
                                        public final byte[] getSfi() {
                                            return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -898462224, 898462225, java.lang.System.identityHashCode(this));
                                        }

                                        @Override // com.payair.hce.setNetworkError
                                        public final byte getRecordNumber() {
                                            return ((java.lang.Byte) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -408883795, 408883795, java.lang.System.identityHashCode(this))).byteValue();
                                        }
                                    });
                                    i9++;
                                    i26 = AlternateContactlessPaymentDataJson + 83;
                                }
                            case 18:
                                com.payair.hce.createConfigurationContext.AnonymousClass4 anonymousClass42 = (com.payair.hce.createConfigurationContext.AnonymousClass4) objArr[0];
                                AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 125) % 128;
                                byte[] gpoResponse = com.payair.hce.checkCallingUriPermission.this.getGpoResponse();
                                AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 45) % 128;
                                return gpoResponse;
                            default:
                                return writeReplace(objArr);
                        }
                    }

                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                        com.payair.hce.createConfigurationContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createConfigurationContext.AnonymousClass4) objArr[0];
                        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 51) % 128;
                        byte[] aid = com.payair.hce.checkCallingUriPermission.this.getAid();
                        int i = AlternateContactlessPaymentDataJson;
                        int i2 = i & 119;
                        int i3 = (i2 - (~(-(-((i ^ 119) | i2))))) - 1;
                        DigitizedCardProfile = i3 % 128;
                        if (i3 % 2 != 0) {
                            return aid;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
                        com.payair.hce.createConfigurationContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createConfigurationContext.AnonymousClass4) objArr[0];
                        int i = DigitizedCardProfile;
                        int i2 = i ^ 117;
                        int i3 = -(-((i & 117) << 1));
                        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                        AlternateContactlessPaymentDataJson = i4 % 128;
                        com.payair.hce.checkCallingUriPermission checkcallinguripermission = com.payair.hce.checkCallingUriPermission.this;
                        if (i4 % 2 == 0) {
                            return checkcallinguripermission.getPpseFci();
                        }
                        checkcallinguripermission.getPpseFci();
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
                        com.payair.hce.createConfigurationContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createConfigurationContext.AnonymousClass4) objArr[0];
                        int i = AlternateContactlessPaymentDataJson;
                        int i2 = i & 25;
                        int i3 = -(-((i ^ 25) | i2));
                        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                        DigitizedCardProfile = i4 % 128;
                        com.payair.hce.checkCallingUriPermission checkcallinguripermission = com.payair.hce.checkCallingUriPermission.this;
                        if (i4 % 2 != 0) {
                            return checkcallinguripermission.getPaymentFci();
                        }
                        checkcallinguripermission.getPaymentFci();
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                        com.payair.hce.createConfigurationContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createConfigurationContext.AnonymousClass4) objArr[0];
                        int i = AlternateContactlessPaymentDataJson + 62;
                        DigitizedCardProfile = ((~i) + (i << 1)) % 128;
                        int parseInt = java.lang.Integer.parseInt(com.payair.hce.setVerticalScrollbarThumbDrawable.DigitizedCardProfile(com.payair.hce.checkCallingUriPermission.this.getCdol1RelatedDataLength()), 16);
                        int i2 = AlternateContactlessPaymentDataJson;
                        int i3 = (i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i2 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                        DigitizedCardProfile = i3 % 128;
                        if (i3 % 2 != 0) {
                            return java.lang.Integer.valueOf(parseInt);
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                        com.payair.hce.createConfigurationContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createConfigurationContext.AnonymousClass4) objArr[0];
                        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 107) % 128;
                        byte[] ciacDecline = com.payair.hce.checkCallingUriPermission.this.getCiacDecline();
                        int i = DigitizedCardProfile;
                        int i2 = i ^ 29;
                        int i3 = (((i & 29) | i2) << 1) - i2;
                        AlternateContactlessPaymentDataJson = i3 % 128;
                        if (i3 % 2 == 0) {
                            return ciacDecline;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                        com.payair.hce.createConfigurationContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createConfigurationContext.AnonymousClass4) objArr[0];
                        int i = AlternateContactlessPaymentDataJson + 25;
                        DigitizedCardProfile = i % 128;
                        com.payair.hce.checkCallingUriPermission checkcallinguripermission = com.payair.hce.checkCallingUriPermission.this;
                        if (i % 2 != 0) {
                            return checkcallinguripermission.getCvrMaskAnd();
                        }
                        checkcallinguripermission.getCvrMaskAnd();
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                        int i = AlternateContactlessPaymentDataJson;
                        int i2 = i ^ 75;
                        int i3 = ((i & 75) | i2) << 1;
                        int i4 = -i2;
                        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
                        DigitizedCardProfile = i5 % 128;
                        if (i5 % 2 == 0) {
                            throw null;
                        }
                        int i6 = ((i & (-6)) | ((~i) & 5)) + ((i & 5) << 1);
                        DigitizedCardProfile = i6 % 128;
                        if (i6 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
                        int i = AlternateContactlessPaymentDataJson;
                        DigitizedCardProfile = ((i ^ 119) + ((i & 119) << 1)) % 128;
                        int i2 = (i | 115) << 1;
                        int i3 = -((i & (-116)) | ((~i) & 115));
                        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                        DigitizedCardProfile = i4 % 128;
                        if (i4 % 2 != 0) {
                            return null;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object getPaymentFci(java.lang.Object[] objArr) {
                        com.payair.hce.createConfigurationContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createConfigurationContext.AnonymousClass4) objArr[0];
                        int i = AlternateContactlessPaymentDataJson;
                        int i2 = i ^ 119;
                        int i3 = -(-((i & 119) << 1));
                        DigitizedCardProfile = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
                        com.payair.hce.initializeVisaPaymentSdk valueOf2 = com.payair.hce.createConfigurationContext.valueOf(com.payair.hce.checkCallingUriPermission.this.getIccPrivateKeyCrtComponents(), geterrorname2);
                        int i4 = DigitizedCardProfile;
                        int i5 = i4 & 81;
                        int i6 = -(-((i4 ^ 81) | i5));
                        int i7 = (i5 & i6) + (i6 | i5);
                        AlternateContactlessPaymentDataJson = i7 % 128;
                        if (i7 % 2 == 0) {
                            return valueOf2;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
                        com.payair.hce.createConfigurationContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createConfigurationContext.AnonymousClass4) objArr[0];
                        int i = DigitizedCardProfile;
                        int i2 = i | 73;
                        int i3 = ((i2 << 1) - (~(-((~(i & 73)) & i2)))) - 1;
                        AlternateContactlessPaymentDataJson = i3 % 128;
                        com.payair.hce.checkCallingUriPermission checkcallinguripermission = com.payair.hce.checkCallingUriPermission.this;
                        if (i3 % 2 != 0) {
                            checkcallinguripermission.getPinIvCvc3Track2();
                            throw null;
                        }
                        byte[] pinIvCvc3Track2 = checkcallinguripermission.getPinIvCvc3Track2();
                        int i4 = AlternateContactlessPaymentDataJson;
                        int i5 = i4 & 105;
                        DigitizedCardProfile = (((i4 | 105) & (~i5)) + (i5 << 1)) % 128;
                        return pinIvCvc3Track2;
                    }

                    private static /* synthetic */ java.lang.Object getCiacDecline(java.lang.Object[] objArr) {
                        com.payair.hce.createConfigurationContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createConfigurationContext.AnonymousClass4) objArr[0];
                        int i = DigitizedCardProfile;
                        AlternateContactlessPaymentDataJson = ((((i | 70) << 1) - (i ^ 70)) - 1) % 128;
                        byte[] ciacDeclineOnPpms = com.payair.hce.checkCallingUriPermission.this.getCiacDeclineOnPpms();
                        int i2 = AlternateContactlessPaymentDataJson;
                        int i3 = i2 & 69;
                        int i4 = i3 + ((i2 ^ 69) | i3);
                        DigitizedCardProfile = i4 % 128;
                        if (i4 % 2 != 0) {
                            return ciacDeclineOnPpms;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
                        com.payair.hce.createConfigurationContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createConfigurationContext.AnonymousClass4) objArr[0];
                        int i = AlternateContactlessPaymentDataJson + 49;
                        DigitizedCardProfile = i % 128;
                        com.payair.hce.checkCallingUriPermission checkcallinguripermission = com.payair.hce.checkCallingUriPermission.this;
                        if (i % 2 != 0) {
                            final com.payair.hce.enforceCallingOrSelfUriPermission alternateContactlessPaymentData = checkcallinguripermission.getAlternateContactlessPaymentData();
                            if (alternateContactlessPaymentData == null) {
                                int i2 = AlternateContactlessPaymentDataJson;
                                int i3 = i2 & 65;
                                int i4 = i3 + ((i2 ^ 65) | i3);
                                DigitizedCardProfile = i4 % 128;
                                if (i4 % 2 != 0) {
                                    return null;
                                }
                                throw null;
                            }
                            com.payair.hce.JsonRequest jsonRequest = new com.payair.hce.JsonRequest() { // from class: com.payair.hce.createConfigurationContext.3
                                private static int valueOf = 0;
                                private static int writeReplace = 1;

                                public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2, int i5, int i6, int i7) {
                                    int i8 = ~i7;
                                    int i9 = (i5 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + (i6 * (-215)) + ((~(i7 | i5)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + (((~i6) | i5 | i8) * (-216)) + (((~(i5 | i8)) | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                                    if (i9 == 1) {
                                        return AlternateContactlessPaymentDataJson(objArr2);
                                    }
                                    if (i9 != 2) {
                                        return i9 != 3 ? i9 != 4 ? valueOf(objArr2) : DigitizedCardProfile(objArr2) : values(objArr2);
                                    }
                                    com.payair.hce.createConfigurationContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createConfigurationContext.AnonymousClass3) objArr2[0];
                                    int i10 = writeReplace;
                                    valueOf = (((i10 | 107) << 1) - (i10 ^ 107)) % 128;
                                    byte[] ciacDecline = com.payair.hce.enforceCallingOrSelfUriPermission.this.getCiacDecline();
                                    int i11 = valueOf;
                                    writeReplace = (((i11 | 111) << 1) - (i11 ^ 111)) % 128;
                                    return ciacDecline;
                                }

                                private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                                    com.payair.hce.createConfigurationContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createConfigurationContext.AnonymousClass3) objArr2[0];
                                    int i5 = writeReplace;
                                    int i6 = ((i5 | 39) << 1) - ((i5 & (-40)) | ((~i5) & 39));
                                    valueOf = i6 % 128;
                                    byte[] aid = com.payair.hce.enforceCallingOrSelfUriPermission.this.getAid();
                                    if (i6 % 2 == 0) {
                                        return aid;
                                    }
                                    throw new java.lang.ArithmeticException();
                                }

                                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                                    com.payair.hce.createConfigurationContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createConfigurationContext.AnonymousClass3) objArr2[0];
                                    int i5 = writeReplace;
                                    valueOf = ((i5 & 11) + (i5 | 11)) % 128;
                                    byte[] paymentFci = com.payair.hce.enforceCallingOrSelfUriPermission.this.getPaymentFci();
                                    int i6 = valueOf;
                                    int i7 = i6 & 125;
                                    int i8 = (i6 | 125) & (~i7);
                                    int i9 = i7 << 1;
                                    int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
                                    writeReplace = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        return paymentFci;
                                    }
                                    throw new java.lang.ArithmeticException();
                                }

                                private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                                    com.payair.hce.createConfigurationContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createConfigurationContext.AnonymousClass3) objArr2[0];
                                    int i5 = valueOf;
                                    int i6 = i5 | 39;
                                    int i7 = i6 << 1;
                                    int i8 = -((~(i5 & 39)) & i6);
                                    writeReplace = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
                                    byte[] gpoResponse = com.payair.hce.enforceCallingOrSelfUriPermission.this.getGpoResponse();
                                    int i9 = valueOf + 81;
                                    writeReplace = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        return gpoResponse;
                                    }
                                    throw new java.lang.ArithmeticException();
                                }

                                private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                                    com.payair.hce.createConfigurationContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createConfigurationContext.AnonymousClass3) objArr2[0];
                                    valueOf = (writeReplace + 117) % 128;
                                    byte[] cvrMaskAnd = com.payair.hce.enforceCallingOrSelfUriPermission.this.getCvrMaskAnd();
                                    int i5 = valueOf;
                                    int i6 = (i5 & 37) + (i5 | 37);
                                    writeReplace = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        return cvrMaskAnd;
                                    }
                                    throw null;
                                }

                                @Override // com.payair.hce.JsonRequest
                                public final byte[] getCvrMaskAnd() {
                                    return (byte[]) values(new java.lang.Object[]{this}, 709884117, -709884114, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.JsonRequest
                                public final byte[] getCiacDecline() {
                                    return (byte[]) values(new java.lang.Object[]{this}, 1534633610, -1534633608, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.JsonRequest
                                public final byte[] getgpoResponse() {
                                    return (byte[]) values(new java.lang.Object[]{this}, 155117561, -155117560, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.JsonRequest
                                public final byte[] getPaymentFci() {
                                    return (byte[]) values(new java.lang.Object[]{this}, -1251689436, 1251689436, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.JsonRequest
                                public final byte[] getAid() {
                                    return (byte[]) values(new java.lang.Object[]{this}, 322955397, -322955393, java.lang.System.identityHashCode(this));
                                }
                            };
                            int i5 = DigitizedCardProfile;
                            int i6 = (-2) - (~((i5 & 126) + (i5 | 126)));
                            AlternateContactlessPaymentDataJson = i6 % 128;
                            if (i6 % 2 == 0) {
                                return jsonRequest;
                            }
                            throw null;
                        }
                        checkcallinguripermission.getAlternateContactlessPaymentData();
                        throw null;
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.setErrorName getTrack2ConstructionData() {
                        return (com.payair.hce.setErrorName) DigitizedCardProfile(new java.lang.Object[]{this}, -1925567845, 1925567857, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.setErrorName getTrack1ConstructionData() {
                        return (com.payair.hce.setErrorName) DigitizedCardProfile(new java.lang.Object[]{this}, 31012343, -31012335, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final java.util.List<com.payair.hce.setNetworkError> getRecords() {
                        return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{this}, 1451023291, -1451023274, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.JsonRequest getAlternateContactlessPaymentData() {
                        return (com.payair.hce.JsonRequest) DigitizedCardProfile(new java.lang.Object[]{this}, -1303196293, 1303196300, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getCiacDeclineOnPpms() {
                        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 1372301545, -1372301530, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final boolean isUsAipMaskingSupported() {
                        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -780333634, 780333650, java.lang.System.identityHashCode(this))).booleanValue();
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final boolean isTransitSupported() {
                        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -1152066016, 1152066027, java.lang.System.identityHashCode(this))).booleanValue();
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getPinIvCvc3Track2() {
                        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 1345727270, -1345727261, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.initializeVisaPaymentSdk getIccPrivateKeyCrtComponents() {
                        return (com.payair.hce.initializeVisaPaymentSdk) DigitizedCardProfile(new java.lang.Object[]{this}, -1662155639, 1662155653, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.setSendAuthenticationHeader getUmdGeneration() {
                        return (com.payair.hce.setSendAuthenticationHeader) DigitizedCardProfile(new java.lang.Object[]{this}, -161049529, 161049539, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final com.payair.hce.gotDeleteData getCvmModel() {
                        return (com.payair.hce.gotDeleteData) DigitizedCardProfile(new java.lang.Object[]{this}, -1693133374, 1693133374, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getIssuerApplicationData() {
                        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 536370682, -536370677, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getCvrMaskAnd() {
                        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -1429163848, 1429163849, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getCiacDecline() {
                        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -1385023105, 1385023107, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final int getCdol1RelatedDataLength() {
                        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 1660779330, -1660779326, java.lang.System.identityHashCode(this))).intValue();
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getGpoResponse() {
                        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 602208669, -602208651, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getPaymentFci() {
                        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 2086838047, -2086838041, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getPpseFci() {
                        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -748009790, 748009803, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.JsonResponse
                    public final byte[] getAid() {
                        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 1463333422, -1463333419, java.lang.System.identityHashCode(this));
                    }
                };
                int i = getAid + 5;
                RecordsJson = i % 128;
                if (i % 2 == 0) {
                    return jsonResponse;
                }
                throw null;
            }

            private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
                int i4;
                boolean z;
                int i5;
                com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i6 = 2;
                try {
                    int i7 = 1;
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(DigitizedCardProfile)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 29 - (android.os.Process.myPid() >> 22), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    boolean z2 = intValue == -1;
                    if (z2) {
                        int i8 = $11 + 63;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                        byte[] bArr = SdkCoreAlternateContactlessPaymentDataImpl;
                        long j = 0;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i9 = 0;
                            while (i9 < length) {
                                int i10 = $10 + 41;
                                $11 = i10 % 128;
                                if (i10 % i6 == 0) {
                                    java.lang.Object[] objArr3 = new java.lang.Object[i7];
                                    objArr3[0] = java.lang.Integer.valueOf(bArr[i9]);
                                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                    if (obj2 == null) {
                                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.widget.ExpandableListView.getPackedPositionType(j), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5088, (char) android.widget.ExpandableListView.getPackedPositionType(j));
                                        java.lang.Class<?>[] clsArr = new java.lang.Class[i7];
                                        clsArr[0] = java.lang.Integer.TYPE;
                                        obj2 = cls.getMethod("e", clsArr);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                                    }
                                    bArr2[i9] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                                    throw new java.lang.ArithmeticException();
                                }
                                java.lang.Object[] objArr4 = new java.lang.Object[i7];
                                objArr4[0] = java.lang.Integer.valueOf(bArr[i9]);
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                if (obj3 == null) {
                                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 5088, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 1))).getMethod("e", java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj3);
                                }
                                bArr2[i9] = ((java.lang.Byte) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).byteValue();
                                i9++;
                                i6 = 2;
                                i7 = 1;
                                j = 0;
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = SdkCoreAlternateContactlessPaymentDataImpl;
                            java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(values)};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                            if (obj4 == null) {
                                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 30, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                            }
                            intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue()] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                        } else {
                            intValue = (short) (((short) (IccPrivateKeyCrtComponentsJson[i2 + ((int) (values ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                            $11 = ($10 + 47) % 128;
                        }
                    }
                    if (intValue > 0) {
                        int i11 = (int) (values ^ (-4897270311952305750L));
                        if (z2) {
                            $11 = ($10 + 51) % 128;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i11 + i4;
                        java.lang.Object[] objArr6 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(valueOf), sb};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj5 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2364 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                            byte b2 = $$a[2];
                            byte b3 = (byte) (b2 - 1);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b(b3, b3, (byte) (-b2), objArr7);
                            obj5 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj5);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr4 = SdkCoreAlternateContactlessPaymentDataImpl;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            int i12 = 0;
                            while (i12 < length2) {
                                bArr5[i12] = (byte) (bArr4[i12] ^ (-4897270311952305750L));
                                i12++;
                                $11 = ($10 + 13) % 128;
                            }
                            bArr4 = bArr5;
                        }
                        if (bArr4 != null) {
                            i5 = 1;
                            z = true;
                        } else {
                            z = false;
                            i5 = 1;
                        }
                        while (true) {
                            gettrack2constructiondata.DigitizedCardProfile = i5;
                            if (gettrack2constructiondata.DigitizedCardProfile >= intValue) {
                                break;
                            }
                            if (z) {
                                byte[] bArr6 = SdkCoreAlternateContactlessPaymentDataImpl;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r4] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = IccPrivateKeyCrtComponentsJson;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r4] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            i5 = gettrack2constructiondata.DigitizedCardProfile + 1;
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

            @Override // com.payair.hce.checkForSuccess
            public final com.payair.hce.getStatusCode getDsrpData() {
                int i = RecordsJson + 33;
                getAid = i % 128;
                if (i % 2 != 0) {
                    final com.payair.hce.revokeSelfPermissionOnKill remotePaymentData = com.payair.hce.setImportantForAutofill.this.getMppLiteModule().getRemotePaymentData();
                    if (remotePaymentData == null) {
                        int i2 = getAid + 21;
                        RecordsJson = i2 % 128;
                        if (i2 % 2 == 0) {
                            return null;
                        }
                        throw null;
                    }
                    com.payair.hce.getStatusCode getstatuscode = new com.payair.hce.getStatusCode() { // from class: com.payair.hce.createConfigurationContext.5
                        private static int DigitizedCardProfile = 0;
                        private static int writeReplace = 1;

                        public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i3, int i4, int i5) {
                            int i6 = ~i5;
                            int i7 = i6 | i3;
                            int i8 = ~i4;
                            int i9 = ~i3;
                            switch ((i3 * (-51)) + (i4 * 53) + ((~(i7 | i4)) * 52) + (((~(i3 | i8)) | (~(i8 | i6)) | (~i7)) * (-52)) + (((~(i9 | i4)) | (~(i6 | i9))) * 52)) {
                                case 1:
                                    return valueOf(objArr);
                                case 2:
                                    return values(objArr);
                                case 3:
                                    return writeReplace(objArr);
                                case 4:
                                    return DigitizedCardProfile(objArr);
                                case 5:
                                    return IccPrivateKeyCrtComponentsJson(objArr);
                                case 6:
                                    return RecordsJson(objArr);
                                case 7:
                                    com.payair.hce.createConfigurationContext.AnonymousClass5 anonymousClass5 = (com.payair.hce.createConfigurationContext.AnonymousClass5) objArr[0];
                                    int i10 = DigitizedCardProfile;
                                    int i11 = i10 & 91;
                                    int i12 = -(-((i10 ^ 91) | i11));
                                    writeReplace = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
                                    byte[] track2Equivalent = com.payair.hce.revokeSelfPermissionOnKill.this.getTrack2Equivalent();
                                    writeReplace = (DigitizedCardProfile + 59) % 128;
                                    return track2Equivalent;
                                case 8:
                                    return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
                                case 9:
                                    return getAid(objArr);
                                case 10:
                                    return getProfileVersion(objArr);
                                default:
                                    return AlternateContactlessPaymentDataJson(objArr);
                            }
                        }

                        private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
                            com.payair.hce.createConfigurationContext.AnonymousClass5 anonymousClass5 = (com.payair.hce.createConfigurationContext.AnonymousClass5) objArr[0];
                            int i3 = DigitizedCardProfile;
                            int i4 = i3 & 51;
                            int i5 = (i3 | 51) & (~i4);
                            int i6 = -(-(i4 << 1));
                            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                            writeReplace = i7 % 128;
                            com.payair.hce.revokeSelfPermissionOnKill revokeselfpermissiononkill = com.payair.hce.revokeSelfPermissionOnKill.this;
                            if (i7 % 2 != 0) {
                                return revokeselfpermissiononkill.getPanSequenceNumber();
                            }
                            revokeselfpermissiononkill.getPanSequenceNumber();
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
                            com.payair.hce.createConfigurationContext.AnonymousClass5 anonymousClass5 = (com.payair.hce.createConfigurationContext.AnonymousClass5) objArr[0];
                            int i3 = DigitizedCardProfile;
                            int i4 = i3 & 81;
                            writeReplace = (i4 + ((i3 ^ 81) | i4)) % 128;
                            byte[] aip = com.payair.hce.revokeSelfPermissionOnKill.this.getAip();
                            int i5 = DigitizedCardProfile;
                            int i6 = i5 & 57;
                            int i7 = (i5 | 57) & (~i6);
                            int i8 = -(-(i6 << 1));
                            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
                            writeReplace = i9 % 128;
                            if (i9 % 2 != 0) {
                                return aip;
                            }
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
                            com.payair.hce.createConfigurationContext.AnonymousClass5 anonymousClass5 = (com.payair.hce.createConfigurationContext.AnonymousClass5) objArr[0];
                            int i3 = DigitizedCardProfile;
                            int i4 = i3 ^ 13;
                            int i5 = (i3 & 13) << 1;
                            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                            writeReplace = i6 % 128;
                            byte[] applicationExpiryDate = com.payair.hce.revokeSelfPermissionOnKill.this.getApplicationExpiryDate();
                            if (i6 % 2 != 0) {
                                return applicationExpiryDate;
                            }
                            throw new java.lang.ArithmeticException();
                        }

                        private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
                            com.payair.hce.createConfigurationContext.AnonymousClass5 anonymousClass5 = (com.payair.hce.createConfigurationContext.AnonymousClass5) objArr[0];
                            int i3 = writeReplace;
                            DigitizedCardProfile = (((i3 & 64) + (i3 | 64)) - 1) % 128;
                            byte[] ciacDecline = com.payair.hce.revokeSelfPermissionOnKill.this.getCiacDecline();
                            int i4 = DigitizedCardProfile;
                            int i5 = ((i4 ^ 77) | (i4 & 77)) << 1;
                            int i6 = -((i4 & (-78)) | ((~i4) & 77));
                            int i7 = (i5 & i6) + (i6 | i5);
                            writeReplace = i7 % 128;
                            if (i7 % 2 != 0) {
                                return ciacDecline;
                            }
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                            com.payair.hce.createConfigurationContext.AnonymousClass5 anonymousClass5 = (com.payair.hce.createConfigurationContext.AnonymousClass5) objArr[0];
                            int i3 = writeReplace;
                            int i4 = ((i3 ^ 72) + ((i3 & 72) << 1)) - 1;
                            DigitizedCardProfile = i4 % 128;
                            com.payair.hce.revokeSelfPermissionOnKill revokeselfpermissiononkill = com.payair.hce.revokeSelfPermissionOnKill.this;
                            if (i4 % 2 != 0) {
                                revokeselfpermissiononkill.getCvrMaskAnd();
                                throw null;
                            }
                            byte[] cvrMaskAnd = revokeselfpermissiononkill.getCvrMaskAnd();
                            int i5 = DigitizedCardProfile;
                            writeReplace = ((i5 ^ 55) + ((i5 & 55) << 1)) % 128;
                            return cvrMaskAnd;
                        }

                        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                            com.payair.hce.createConfigurationContext.AnonymousClass5 anonymousClass5 = (com.payair.hce.createConfigurationContext.AnonymousClass5) objArr[0];
                            int i3 = DigitizedCardProfile;
                            int i4 = i3 & 69;
                            int i5 = (i3 ^ 69) | i4;
                            writeReplace = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
                            byte[] issuerApplicationData = com.payair.hce.revokeSelfPermissionOnKill.this.getIssuerApplicationData();
                            int i6 = writeReplace;
                            int i7 = ((i6 | 111) << 1) - (i6 ^ 111);
                            DigitizedCardProfile = i7 % 128;
                            if (i7 % 2 == 0) {
                                return issuerApplicationData;
                            }
                            throw new java.lang.ArithmeticException();
                        }

                        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                            int i3 = DigitizedCardProfile;
                            int i4 = ((i3 ^ 72) + ((i3 & 72) << 1)) - 1;
                            writeReplace = i4 % 128;
                            if (i4 % 2 == 0) {
                                throw null;
                            }
                            int i5 = i3 & 27;
                            int i6 = (i3 ^ 27) | i5;
                            writeReplace = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
                            return null;
                        }

                        private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
                            int i3 = DigitizedCardProfile;
                            int i4 = ~i3;
                            writeReplace = ((((i3 ^ 63) | (i3 & 63)) << 1) - ((i3 & (-64)) | (i4 & 63))) % 128;
                            int i5 = ((i3 & (-26)) | (i4 & 25)) + ((i3 & 25) << 1);
                            writeReplace = i5 % 128;
                            if (i5 % 2 != 0) {
                                return null;
                            }
                            throw new java.lang.ArithmeticException();
                        }

                        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                            int i3 = DigitizedCardProfile;
                            int i4 = ((i3 ^ 121) | (i3 & 121)) << 1;
                            int i5 = -((i3 & (-122)) | ((~i3) & 121));
                            writeReplace = ((i4 & i5) + (i5 | i4)) % 128;
                            com.payair.hce.gotPutData gotputdata = com.payair.hce.gotPutData.valueOf;
                            int i6 = DigitizedCardProfile + 113;
                            writeReplace = i6 % 128;
                            if (i6 % 2 != 0) {
                                return gotputdata;
                            }
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                            int i3 = writeReplace;
                            int i4 = ((i3 ^ 22) + ((i3 & 22) << 1)) - 1;
                            DigitizedCardProfile = i4 % 128;
                            if (i4 % 2 == 0) {
                                return null;
                            }
                            throw new java.lang.ArithmeticException();
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getPar() {
                            return (byte[]) writeReplace(new java.lang.Object[]{this}, 1822515731, -1822515730, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final com.payair.hce.gotPutData getUcafVersion() {
                            return (com.payair.hce.gotPutData) writeReplace(new java.lang.Object[]{this}, -553311477, 553311477, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final com.payair.hce.setSendAuthenticationHeader getUmdGeneration() {
                            return (com.payair.hce.setSendAuthenticationHeader) writeReplace(new java.lang.Object[]{this}, 1494523810, -1494523801, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final com.payair.hce.gotDeleteData getCvmModel() {
                            return (com.payair.hce.gotDeleteData) writeReplace(new java.lang.Object[]{this}, -1026147476, 1026147479, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getIssuerApplicationData() {
                            return (byte[]) writeReplace(new java.lang.Object[]{this}, 607439795, -607439791, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getCvrMaskAnd() {
                            return (byte[]) writeReplace(new java.lang.Object[]{this}, 504368140, -504368138, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getCiacDecline() {
                            return (byte[]) writeReplace(new java.lang.Object[]{this}, 2030596929, -2030596923, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getExpiryDate() {
                            return (byte[]) writeReplace(new java.lang.Object[]{this}, 1688247481, -1688247473, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getAip() {
                            return (byte[]) writeReplace(new java.lang.Object[]{this}, -910516463, 910516468, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getTrack2EquivalentData() {
                            return (byte[]) writeReplace(new java.lang.Object[]{this}, 684314577, -684314570, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.getStatusCode
                        public final byte[] getPanSequenceNumber() {
                            return (byte[]) writeReplace(new java.lang.Object[]{this}, 681244006, -681243996, java.lang.System.identityHashCode(this));
                        }
                    };
                    int i3 = getAid + 39;
                    RecordsJson = i3 % 128;
                    if (i3 % 2 == 0) {
                        return getstatuscode;
                    }
                    throw null;
                }
                com.payair.hce.setImportantForAutofill.this.getMppLiteModule().getRemotePaymentData();
                throw new java.lang.ArithmeticException();
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                RecordsJson = 0;
                getAid = 1;
                values = -964691978;
                DigitizedCardProfile = 520368581;
                valueOf = -260097318;
                SdkCoreAlternateContactlessPaymentDataImpl = new byte[]{56};
            }

            static void init$0() {
                $$a = new byte[]{8, -42, 1, 71};
                $$b = 87;
            }

            @Override // com.payair.hce.checkForSuccess
            public final com.payair.hce.getStatusCodeFromServer getVersion() {
                return (com.payair.hce.getStatusCodeFromServer) valueOf(new java.lang.Object[]{this}, -1606120962, 1606120962, java.lang.System.identityHashCode(this));
            }
        };
        int i = getCvrMaskAnd + 117;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            return checkforsuccess;
        }
        throw null;
    }

    private static void b(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 91) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 43, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2073, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) 0, (short) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 52, 3543 - android.text.TextUtils.indexOf("", ""), (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr4 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
            int i5 = $10 + 87;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 4;
            }
        }
        if (z) {
            char[] cArr5 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                $11 = ($10 + 39) % 128;
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 3543 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.view.View.MeasureSpec.getSize(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static com.payair.hce.initializeVisaPaymentSdk values(com.payair.hce.createDisplayContext createdisplaycontext, com.payair.hce.getErrorName geterrorname) {
        getCvrMaskAnd = (getPaymentFci + 101) % 128;
        com.payair.hce.isUiContext isuicontext = (com.payair.hce.isUiContext) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{createdisplaycontext.getU()}, -1034745021, 1034745025, (int) java.lang.System.currentTimeMillis());
        try {
            com.payair.hce.initializeVisaPaymentSdk writeReplace = geterrorname.writeReplace((byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext}, 942400464, -942400461, java.lang.System.identityHashCode(isuicontext)));
            getCvrMaskAnd = (getPaymentFci + 121) % 128;
            return writeReplace;
        } catch (java.security.GeneralSecurityException unused) {
            com.payair.hce.isUiContext isuicontext2 = (com.payair.hce.isUiContext) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{""}, -720074735, 720074736, (int) java.lang.System.currentTimeMillis());
            return new com.payair.hce.initializeVisaPaymentSdk((byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{isuicontext2}, 942400464, -942400461, java.lang.System.identityHashCode(isuicontext2)));
        }
    }

    public createConfigurationContext(com.payair.hce.hasVersionCheckFailed hasversioncheckfailed) {
        if (hasversioncheckfailed.valueOf() != null) {
            com.payair.hce.stopTransaction valueOf = hasversioncheckfailed.valueOf();
            this.DigitizedCardProfile = true;
            this.writeReplace = valueOf.getApplicationLifeCycleData();
            this.AlternateContactlessPaymentDataJson = valueOf.getCvmResetTimeout();
            this.getProfileVersion = valueOf.getGpoResponse();
            this.RecordsJson = valueOf.getCvrMaskAnd();
            this.SdkCoreAlternateContactlessPaymentDataImpl = valueOf.getCiacDecline();
        }
        if (hasversioncheckfailed.values() != null) {
            this.valueOf = true;
        }
        if (hasversioncheckfailed.writeReplace() != null) {
            this.values = true;
        }
        this.getAid = hasversioncheckfailed.DigitizedCardProfile().valueOf();
    }

    public final boolean valueOf() {
        int i = getPaymentFci + 119;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            return this.writeReplace;
        }
        throw null;
    }

    public final boolean AlternateContactlessPaymentDataJson() {
        int i = (getCvrMaskAnd + 43) % 128;
        getPaymentFci = i;
        boolean z = this.AlternateContactlessPaymentDataJson;
        int i2 = i + 45;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.createConfigurationContext createconfigurationcontext = (com.payair.hce.createConfigurationContext) objArr[0];
        int i = getCvrMaskAnd + 125;
        getPaymentFci = i % 128;
        boolean z = createconfigurationcontext.DigitizedCardProfile;
        if (i % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw new java.lang.ArithmeticException();
    }

    public final boolean writeReplace() {
        int i = getPaymentFci;
        getCvrMaskAnd = (i + 51) % 128;
        boolean z = this.valueOf;
        getCvrMaskAnd = (i + 91) % 128;
        return z;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.createConfigurationContext createconfigurationcontext = (com.payair.hce.createConfigurationContext) objArr[0];
        int i = getPaymentFci;
        getCvrMaskAnd = (i + 11) % 128;
        boolean z = createconfigurationcontext.values;
        int i2 = i + 17;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw new java.lang.ArithmeticException();
    }

    public final void getAid() {
        int i = (getPaymentFci + 103) % 128;
        getCvrMaskAnd = i;
        this.values = false;
        getPaymentFci = (i + 71) % 128;
    }

    public final boolean SdkCoreAlternateContactlessPaymentDataImpl() {
        int i = (getCvrMaskAnd + 1) % 128;
        getPaymentFci = i;
        boolean z = this.getProfileVersion;
        int i2 = i + 67;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.createConfigurationContext createconfigurationcontext = (com.payair.hce.createConfigurationContext) objArr[0];
        int i = getPaymentFci + 75;
        int i2 = i % 128;
        getCvrMaskAnd = i2;
        boolean z = createconfigurationcontext.getAid;
        if (i % 2 != 0) {
            throw null;
        }
        getPaymentFci = (i2 + 107) % 128;
        return java.lang.Boolean.valueOf(z);
    }

    public final boolean IccPrivateKeyCrtComponentsJson() {
        int i = getCvrMaskAnd + 67;
        getPaymentFci = i % 128;
        boolean z = this.RecordsJson;
        if (i % 2 != 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    public final boolean getProfileVersion() {
        int i = getPaymentFci;
        getCvrMaskAnd = (i + 83) % 128;
        boolean z = this.SdkCoreAlternateContactlessPaymentDataImpl;
        getCvrMaskAnd = (i + 111) % 128;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0684, code lost:
    
        if (r3 > 44) goto L184;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04d9 A[Catch: all -> 0x055a, TryCatch #13 {all -> 0x055a, blocks: (B:41:0x04c7, B:42:0x0526, B:176:0x04d3, B:178:0x04d9, B:179:0x04da, B:40:0x04e2, B:191:0x04f8, B:193:0x0510, B:195:0x052e), top: B:39:0x04e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04da A[Catch: all -> 0x055a, TryCatch #13 {all -> 0x055a, blocks: (B:41:0x04c7, B:42:0x0526, B:176:0x04d3, B:178:0x04d9, B:179:0x04da, B:40:0x04e2, B:191:0x04f8, B:193:0x0510, B:195:0x052e), top: B:39:0x04e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0699 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0687  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void valueOf(long j, long j2) {
        java.lang.Class<?>[] clsArr;
        int i;
        int i2;
        int i3;
        java.lang.Object obj;
        java.lang.Throwable cause;
        java.lang.Object declaredMethod;
        java.lang.Object obj2;
        java.lang.Object obj3;
        com.payair.hce.revokeSelfPermissionsOnKill revokeselfpermissionsonkill = new com.payair.hce.revokeSelfPermissionsOnKill(j, j2);
        byte[] bArr = SdkCoreBusinessLogicModuleImpl;
        char c = ';';
        java.lang.Object[] objArr = new java.lang.Object[1];
        char c2 = 392;
        a(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, (byte) (-bArr[455]), bArr[59], objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        short s = bArr[59];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(s, (byte) (s | 74), my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c3 = 461;
            char c4 = 16;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(bArr[461], bArr[16], my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            short s2 = bArr[4];
            byte b = bArr[48];
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(s2, b, (short) (b | 404), objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(bArr[461], bArr[16], my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i4 = 0;
            while (true) {
                clsArr = null;
                if (i4 >= objArr7.length) {
                    break;
                }
                java.lang.Object[] objArr8 = {objArr7[i4]};
                byte[] bArr2 = SdkCoreBusinessLogicModuleImpl;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((short) (-bArr2[434]), bArr2[16], 411, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                short s3 = bArr2[14];
                byte b2 = bArr2[c];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(s3, b2, (short) (b2 | 427), objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(bArr2[c3], bArr2[16], my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, objArr11);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a((short) (-bArr2[434]), bArr2[16], 411, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(bArr2[11], bArr2[21], 433, objArr13);
                iArr[i4] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i4++;
                c = ';';
                c3 = 461;
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                switch (revokeselfpermissionsonkill.writeReplace(iArr[i5])) {
                    case -45:
                        i5 = 115;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -44:
                        revokeselfpermissionsonkill.writeReplace(44);
                        int i7 = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson;
                        i5 = (i7 == 22 || i7 != 47) ? 1 : 93;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                        break;
                    case -43:
                        i5 = 110;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -42:
                        revokeselfpermissionsonkill.writeReplace(44);
                        int i8 = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson;
                        i5 = (i8 == 0 || i8 != 1) ? 80 : 56;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -41:
                        i5 = 116;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -40:
                        i5 = 118;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -39:
                        revokeselfpermissionsonkill.writeReplace(41);
                        if (revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson == 0) {
                            i5 = 92;
                            c2 = 392;
                            c4 = 16;
                            clsArr = null;
                        }
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -38:
                        try {
                            revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                            try {
                                revokeselfpermissionsonkill.writeReplace(4);
                                revokeselfpermissionsonkill.writeReplace(5);
                                getCvrMaskAnd = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson;
                                i5 = i6;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                i = 27;
                                if (i6 >= i) {
                                    i2 = 44;
                                    break;
                                } else {
                                    i2 = 44;
                                }
                                if (i6 < i2 || i6 > 53) {
                                    throw th;
                                }
                                revokeselfpermissionsonkill.getProfileVersion = th;
                                revokeselfpermissionsonkill.writeReplace(47);
                                i5 = 16;
                                c2 = 392;
                                c4 = 16;
                                clsArr = null;
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            i = 27;
                            if (i6 >= i) {
                            }
                            if (i6 < i2) {
                            }
                            throw th;
                        }
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                        break;
                    case -37:
                        i3 = getPaymentFci;
                        revokeselfpermissionsonkill.DigitizedCardProfile = i3;
                        revokeselfpermissionsonkill.writeReplace(6);
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -36:
                        i5 = 111;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -35:
                        i5 = 113;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -34:
                        revokeselfpermissionsonkill.writeReplace(34);
                        if (revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson == 0) {
                            i5 = 79;
                            c2 = 392;
                            c4 = 16;
                            clsArr = null;
                        }
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -33:
                        i5 = 27;
                    case -32:
                        i5 = 69;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -31:
                        revokeselfpermissionsonkill.writeReplace(34);
                        if (revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson == 0) {
                            i5 = 68;
                            c2 = 392;
                            c4 = 16;
                            clsArr = null;
                        }
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -30:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(5);
                        getPaymentFci = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson;
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -29:
                        i3 = getCvrMaskAnd;
                        revokeselfpermissionsonkill.DigitizedCardProfile = i3;
                        revokeselfpermissionsonkill.writeReplace(6);
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -28:
                        i5 = 59;
                    case -27:
                        i5 = 84;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -26:
                        return;
                    case -25:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 3;
                        revokeselfpermissionsonkill.writeReplace(4);
                        try {
                            revokeselfpermissionsonkill.writeReplace(11);
                            java.lang.Class cls4 = (java.lang.Class) revokeselfpermissionsonkill.RecordsJson;
                            revokeselfpermissionsonkill.writeReplace(11);
                            java.lang.String str4 = (java.lang.String) revokeselfpermissionsonkill.RecordsJson;
                            revokeselfpermissionsonkill.writeReplace(11);
                            revokeselfpermissionsonkill.getProfileVersion = cls4.getMethod(str4, (java.lang.Class[]) revokeselfpermissionsonkill.RecordsJson);
                            revokeselfpermissionsonkill.writeReplace(2);
                            i5 = i6;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            i = 27;
                            if (i6 >= i) {
                            }
                            if (i6 < i2) {
                                break;
                            }
                            throw th;
                        }
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                        break;
                    case -24:
                        byte b3 = $$a[23];
                        byte b4 = (byte) (b3 - 1);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        c(b4, b4, b3, objArr14);
                        obj = (java.lang.String) objArr14[0];
                        revokeselfpermissionsonkill.getProfileVersion = obj;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -23:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(11);
                        obj = java.lang.Class.forName((java.lang.String) revokeselfpermissionsonkill.RecordsJson);
                        revokeselfpermissionsonkill.getProfileVersion = obj;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -22:
                        try {
                            byte b5 = $$a[23];
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c(b5, b5, (byte) (b5 - 1), objArr15);
                            obj = (java.lang.String) objArr15[0];
                            revokeselfpermissionsonkill.getProfileVersion = obj;
                            revokeselfpermissionsonkill.writeReplace(2);
                            i5 = i6;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            i = 27;
                            if (i6 >= i) {
                            }
                            if (i6 < i2) {
                            }
                            throw th;
                        }
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                        break;
                    case -21:
                        try {
                            revokeselfpermissionsonkill.DigitizedCardProfile = 3;
                            revokeselfpermissionsonkill.writeReplace(4);
                            revokeselfpermissionsonkill.writeReplace(11);
                            java.lang.Object obj4 = revokeselfpermissionsonkill.RecordsJson;
                            revokeselfpermissionsonkill.writeReplace(11);
                            java.lang.Object obj5 = revokeselfpermissionsonkill.RecordsJson;
                            revokeselfpermissionsonkill.writeReplace(11);
                            try {
                                java.lang.Object[] objArr16 = {obj5, revokeselfpermissionsonkill.RecordsJson};
                                byte[] bArr3 = SdkCoreBusinessLogicModuleImpl;
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                a(bArr3[436], bArr3[c4], 602, objArr17);
                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                try {
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    a(bArr3[6], bArr3[21], 625, objArr18);
                                    java.lang.String str5 = (java.lang.String) objArr18[0];
                                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[2];
                                    try {
                                        short s4 = bArr3[461];
                                        byte b6 = bArr3[c4];
                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                        a(s4, b6, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_UNEXPECTED_ERROR, objArr19);
                                        clsArr2[0] = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                                        a(bArr3[454], bArr3[424], 630, objArr20);
                                        clsArr2[1] = java.lang.Class.forName((java.lang.String) objArr20[0]);
                                        obj = cls5.getMethod(str5, clsArr2).invoke(obj4, objArr16);
                                        revokeselfpermissionsonkill.getProfileVersion = obj;
                                        revokeselfpermissionsonkill.writeReplace(2);
                                        i5 = i6;
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        cause = th.getCause();
                                        if (cause != null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    cause = th.getCause();
                                    if (cause != null) {
                                    }
                                }
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                            }
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                            i = 27;
                            if (i6 >= i) {
                            }
                            if (i6 < i2) {
                            }
                            throw th;
                        }
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                        break;
                    case -20:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 3;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(11);
                        java.lang.Class cls6 = (java.lang.Class) revokeselfpermissionsonkill.RecordsJson;
                        revokeselfpermissionsonkill.writeReplace(11);
                        java.lang.String str6 = (java.lang.String) revokeselfpermissionsonkill.RecordsJson;
                        revokeselfpermissionsonkill.writeReplace(11);
                        declaredMethod = cls6.getDeclaredMethod(str6, (java.lang.Class[]) revokeselfpermissionsonkill.RecordsJson);
                        revokeselfpermissionsonkill.getProfileVersion = declaredMethod;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        byte[] bArr4 = SdkCoreBusinessLogicModuleImpl;
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        try {
                            a(bArr4[461], bArr4[c4], my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, objArr21);
                            declaredMethod = java.lang.Class.forName((java.lang.String) objArr21[0]);
                            revokeselfpermissionsonkill.getProfileVersion = declaredMethod;
                            revokeselfpermissionsonkill.writeReplace(2);
                            i5 = i6;
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                            i = 27;
                            if (i6 >= i) {
                            }
                            if (i6 < i2) {
                            }
                            throw th;
                        }
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(5);
                        revokeselfpermissionsonkill.getProfileVersion = new java.lang.Class[revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson];
                        revokeselfpermissionsonkill.writeReplace(2);
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -17:
                        obj2 = "writeReplace";
                        revokeselfpermissionsonkill.getProfileVersion = obj2;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -16:
                        obj2 = com.payair.hce.setLongClickable.class;
                        revokeselfpermissionsonkill.getProfileVersion = obj2;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -15:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(5);
                        int i9 = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson;
                        byte[] bArr5 = SdkCoreBusinessLogicModuleImpl;
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a(bArr5[461], bArr5[c4], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_UNEXPECTED_ERROR, objArr22);
                        obj2 = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr22[0]), i9);
                        revokeselfpermissionsonkill.getProfileVersion = obj2;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -14:
                        revokeselfpermissionsonkill.writeReplace(17);
                        throw ((java.lang.Throwable) revokeselfpermissionsonkill.RecordsJson);
                    case -13:
                        i5 = 25;
                        c2 = 392;
                    case -12:
                        i5 = 22;
                    case -11:
                        revokeselfpermissionsonkill.writeReplace(15);
                        if (revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson == 0) {
                            i5 = 21;
                            c2 = 392;
                        } else {
                            i5 = i6;
                            c2 = 392;
                            c4 = 16;
                            clsArr = null;
                        }
                    case -10:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(11);
                        java.lang.Object obj6 = revokeselfpermissionsonkill.RecordsJson;
                        try {
                            byte[] bArr6 = SdkCoreBusinessLogicModuleImpl;
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(bArr6[454], bArr6[c4], 562, objArr23);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a(bArr6[11], bArr6[461], 580, objArr24);
                            obj2 = cls7.getMethod((java.lang.String) objArr24[0], clsArr).invoke(obj6, clsArr);
                            revokeselfpermissionsonkill.getProfileVersion = obj2;
                            revokeselfpermissionsonkill.writeReplace(2);
                            i5 = i6;
                            c2 = 392;
                            c4 = 16;
                            clsArr = null;
                        } catch (java.lang.Throwable th11) {
                            java.lang.Throwable cause2 = th11.getCause();
                            if (cause2 == null) {
                                throw th11;
                            }
                            throw cause2;
                        }
                    case -9:
                        i5 = 70;
                        c2 = 392;
                    case -8:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(11);
                        java.lang.Object obj7 = revokeselfpermissionsonkill.RecordsJson;
                        try {
                            byte[] bArr7 = SdkCoreBusinessLogicModuleImpl;
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            a(bArr7[461], bArr7[c4], my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, objArr25);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                            short s5 = bArr7[6];
                            byte b7 = bArr7[21];
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(s5, b7, (short) (b7 | 544), objArr26);
                            obj2 = cls8.getMethod((java.lang.String) objArr26[0], clsArr).invoke(obj7, clsArr);
                            revokeselfpermissionsonkill.getProfileVersion = obj2;
                            revokeselfpermissionsonkill.writeReplace(2);
                            i5 = i6;
                            c2 = 392;
                            c4 = 16;
                            clsArr = null;
                        } catch (java.lang.Throwable th12) {
                            java.lang.Throwable cause3 = th12.getCause();
                            if (cause3 == null) {
                                throw th12;
                            }
                            throw cause3;
                        }
                    case -7:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 5;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(5);
                        boolean z = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson != 0;
                        revokeselfpermissionsonkill.writeReplace(11);
                        java.lang.String str7 = (java.lang.String) revokeselfpermissionsonkill.RecordsJson;
                        revokeselfpermissionsonkill.writeReplace(5);
                        int i10 = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson;
                        revokeselfpermissionsonkill.writeReplace(5);
                        int i11 = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson;
                        revokeselfpermissionsonkill.writeReplace(5);
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        b(z, str7, i10, i11, revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson, objArr27);
                        obj2 = (java.lang.String) objArr27[0];
                        revokeselfpermissionsonkill.getProfileVersion = obj2;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -6:
                        try {
                            revokeselfpermissionsonkill.DigitizedCardProfile = 2;
                            revokeselfpermissionsonkill.writeReplace(4);
                            revokeselfpermissionsonkill.writeReplace(11);
                            obj3 = revokeselfpermissionsonkill.RecordsJson;
                            revokeselfpermissionsonkill.writeReplace(5);
                        } catch (java.lang.Throwable th13) {
                            th = th13;
                            i = 27;
                            if (i6 >= i) {
                            }
                            if (i6 < i2) {
                            }
                            throw th;
                        }
                        try {
                            java.lang.Object[] objArr28 = {obj3, java.lang.Integer.valueOf(revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson)};
                            short s6 = SdkCoreBusinessLogicModuleImpl[397];
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            a(s6, (byte) s6, 502, objArr29);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            a(r0[21], r0[461], 523, objArr30);
                            java.lang.String str8 = (java.lang.String) objArr30[0];
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            a(r0[397], r0[c4], 536, objArr31);
                            revokeselfpermissionsonkill.DigitizedCardProfile = ((java.lang.Integer) cls9.getMethod(str8, java.lang.Class.forName((java.lang.String) objArr31[0]), java.lang.Integer.TYPE).invoke(clsArr, objArr28)).intValue();
                            revokeselfpermissionsonkill.writeReplace(6);
                            i5 = i6;
                            c2 = 392;
                            c4 = 16;
                            clsArr = null;
                        } catch (java.lang.Throwable th14) {
                            java.lang.Throwable cause4 = th14.getCause();
                            if (cause4 == null) {
                                throw th14;
                            }
                            throw cause4;
                        }
                        break;
                    case -5:
                        revokeselfpermissionsonkill.getProfileVersion = "";
                        revokeselfpermissionsonkill.writeReplace(2);
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -4:
                        try {
                            byte[] bArr8 = SdkCoreBusinessLogicModuleImpl;
                            short s7 = bArr8[471];
                            byte b8 = bArr8[397];
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            a(s7, b8, (short) (b8 | com.visa.cbp.getEncExpo.startTransaction), objArr32);
                            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr32[0]);
                            try {
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                a((short) (-bArr8[434]), bArr8[461], 486, objArr33);
                                revokeselfpermissionsonkill.writeReplace = ((java.lang.Long) cls10.getMethod((java.lang.String) objArr33[0], clsArr).invoke(clsArr, clsArr)).longValue();
                                revokeselfpermissionsonkill.writeReplace(7);
                                i5 = i6;
                                c2 = 392;
                                c4 = 16;
                                clsArr = null;
                            } catch (java.lang.Throwable th15) {
                                th = th15;
                                java.lang.Throwable cause5 = th.getCause();
                                if (cause5 == null) {
                                    throw th;
                                }
                                throw cause5;
                            }
                        } catch (java.lang.Throwable th16) {
                            th = th16;
                        }
                    case -3:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 2;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(5);
                        int i12 = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson;
                        revokeselfpermissionsonkill.writeReplace(5);
                        try {
                            java.lang.Object[] objArr34 = {java.lang.Integer.valueOf(i12), java.lang.Integer.valueOf(revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson)};
                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                            a((short) (-SdkCoreBusinessLogicModuleImpl[434]), r0[397], 440, objArr35);
                            java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr35[0]);
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            a(r0[21], r0[461], 456, objArr36);
                            revokeselfpermissionsonkill.DigitizedCardProfile = ((java.lang.Integer) cls11.getMethod((java.lang.String) objArr36[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(clsArr, objArr34)).intValue();
                            revokeselfpermissionsonkill.writeReplace(6);
                            i5 = i6;
                            c2 = 392;
                            c4 = 16;
                            clsArr = null;
                        } catch (java.lang.Throwable th17) {
                            java.lang.Throwable cause6 = th17.getCause();
                            if (cause6 == null) {
                                throw th17;
                            }
                            throw cause6;
                        }
                    case -2:
                        revokeselfpermissionsonkill.getProfileVersion = "\u0003\u0000�";
                        revokeselfpermissionsonkill.writeReplace(2);
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                    case -1:
                        i5 = 53;
                    default:
                        i5 = i6;
                        c2 = 392;
                        c4 = 16;
                        clsArr = null;
                }
            }
        } catch (java.lang.Throwable th18) {
            java.lang.Throwable cause7 = th18.getCause();
            if (cause7 == null) {
                throw th18;
            }
            throw cause7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x057f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void DigitizedCardProfile(long j, long j2) {
        int i;
        java.lang.Object obj;
        int intValue;
        java.lang.Object obj2;
        com.payair.hce.revokeSelfPermissionsOnKill revokeselfpermissionsonkill = new com.payair.hce.revokeSelfPermissionsOnKill(j, j2);
        byte[] bArr = SdkCoreBusinessLogicModuleImpl;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(355, (byte) (-bArr[455]), 648, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        char c = ';';
        short s = bArr[59];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        int i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
        a(s, (byte) (s | 74), my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c2 = 461;
            char c3 = 16;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(bArr[461], bArr[16], my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            short s2 = bArr[4];
            byte b = bArr[48];
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(s2, b, (short) (b | 404), objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(bArr[461], bArr[16], my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i3]};
                byte[] bArr2 = SdkCoreBusinessLogicModuleImpl;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((short) (-bArr2[434]), bArr2[16], 411, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                short s3 = bArr2[14];
                byte b2 = bArr2[c];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(s3, b2, (short) (b2 | 427), objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(bArr2[c2], bArr2[16], my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, objArr11);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a((short) (-bArr2[434]), bArr2[16], 411, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(bArr2[11], bArr2[21], 433, objArr13);
                iArr[i3] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i3++;
                c = ';';
                c2 = 461;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                    if ((i5 < 26 && i5 <= 43) || (i5 >= 43 && i5 <= 52)) {
                        i5 = 16;
                    } else {
                        if (i5 >= 68 || i5 > 72) {
                            throw th;
                        }
                        i5 = 66;
                    }
                    revokeselfpermissionsonkill.getProfileVersion = th;
                    revokeselfpermissionsonkill.writeReplace(47);
                    i4 = i5;
                    i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                    c3 = 16;
                }
                switch (revokeselfpermissionsonkill.writeReplace(iArr[i4])) {
                    case -41:
                        i4 = 103;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -40:
                        revokeselfpermissionsonkill.writeReplace(44);
                        i4 = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson != 4 ? 81 : 1;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -39:
                        i4 = 98;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -38:
                        revokeselfpermissionsonkill.writeReplace(44);
                        i4 = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson != 0 ? 55 : 67;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -37:
                        i4 = 104;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -36:
                        i4 = 106;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -35:
                        revokeselfpermissionsonkill.writeReplace(41);
                        if (revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson == 0) {
                            i4 = 80;
                            i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                            c3 = 16;
                        }
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -34:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(5);
                        getCvrMaskAnd = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson;
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -33:
                        i = getPaymentFci;
                        revokeselfpermissionsonkill.DigitizedCardProfile = i;
                        revokeselfpermissionsonkill.writeReplace(6);
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -32:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        try {
                            revokeselfpermissionsonkill.writeReplace(11);
                            i = revokeselfpermissionsonkill.RecordsJson.hashCode();
                            revokeselfpermissionsonkill.DigitizedCardProfile = i;
                            revokeselfpermissionsonkill.writeReplace(6);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i5 < 26) {
                            }
                            if (i5 >= 68) {
                            }
                            throw th;
                        }
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                        break;
                    case -31:
                        i5 = 99;
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -30:
                        i5 = 101;
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -29:
                        revokeselfpermissionsonkill.writeReplace(34);
                        if (revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson == 0) {
                            i5 = 65;
                        }
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -28:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(5);
                        getPaymentFci = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson;
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -27:
                        revokeselfpermissionsonkill.DigitizedCardProfile = getCvrMaskAnd;
                        revokeselfpermissionsonkill.writeReplace(6);
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -26:
                        return;
                    case -25:
                        i4 = 72;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -24:
                        i5 = 57;
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -23:
                        byte b3 = $$a[23];
                        byte b4 = (byte) (b3 - 1);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        c(b4, b4, b3, objArr14);
                        obj = (java.lang.String) objArr14[0];
                        revokeselfpermissionsonkill.getProfileVersion = obj;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -22:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(11);
                        obj = java.lang.Class.forName((java.lang.String) revokeselfpermissionsonkill.RecordsJson);
                        revokeselfpermissionsonkill.getProfileVersion = obj;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -21:
                        byte b5 = $$a[23];
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        c(b5, b5, (byte) (b5 - 1), objArr15);
                        obj = (java.lang.String) objArr15[0];
                        revokeselfpermissionsonkill.getProfileVersion = obj;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -20:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 3;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(11);
                        java.lang.Object obj3 = revokeselfpermissionsonkill.RecordsJson;
                        revokeselfpermissionsonkill.writeReplace(11);
                        java.lang.Object obj4 = revokeselfpermissionsonkill.RecordsJson;
                        revokeselfpermissionsonkill.writeReplace(11);
                        try {
                            java.lang.Object[] objArr16 = {obj4, revokeselfpermissionsonkill.RecordsJson};
                            byte[] bArr3 = SdkCoreBusinessLogicModuleImpl;
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            a(bArr3[436], bArr3[c3], 602, objArr17);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            a(bArr3[6], bArr3[21], 625, objArr18);
                            java.lang.String str4 = (java.lang.String) objArr18[0];
                            short s4 = bArr3[461];
                            byte b6 = bArr3[c3];
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            a(s4, b6, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_UNEXPECTED_ERROR, objArr19);
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            a(bArr3[454], bArr3[424], 630, objArr20);
                            obj = cls4.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr19[0]), java.lang.Class.forName((java.lang.String) objArr20[0])).invoke(obj3, objArr16);
                            revokeselfpermissionsonkill.getProfileVersion = obj;
                            revokeselfpermissionsonkill.writeReplace(2);
                            i4 = i5;
                            i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                            c3 = 16;
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause = th3.getCause();
                            if (cause == null) {
                                throw th3;
                            }
                            throw cause;
                        }
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 3;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(11);
                        java.lang.Class cls5 = (java.lang.Class) revokeselfpermissionsonkill.RecordsJson;
                        revokeselfpermissionsonkill.writeReplace(11);
                        java.lang.String str5 = (java.lang.String) revokeselfpermissionsonkill.RecordsJson;
                        revokeselfpermissionsonkill.writeReplace(11);
                        obj = cls5.getMethod(str5, (java.lang.Class[]) revokeselfpermissionsonkill.RecordsJson);
                        revokeselfpermissionsonkill.getProfileVersion = obj;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        byte[] bArr4 = SdkCoreBusinessLogicModuleImpl;
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a(bArr4[461], bArr4[c3], i2, objArr21);
                        obj = java.lang.Class.forName((java.lang.String) objArr21[0]);
                        revokeselfpermissionsonkill.getProfileVersion = obj;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -17:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(5);
                        revokeselfpermissionsonkill.getProfileVersion = new java.lang.Class[revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson];
                        revokeselfpermissionsonkill.writeReplace(2);
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -16:
                        obj = "AlternateContactlessPaymentDataJson";
                        revokeselfpermissionsonkill.getProfileVersion = obj;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -15:
                        obj = com.payair.hce.setLongClickable.class;
                        revokeselfpermissionsonkill.getProfileVersion = obj;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -14:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(5);
                        int i6 = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson;
                        byte[] bArr5 = SdkCoreBusinessLogicModuleImpl;
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a(bArr5[461], bArr5[c3], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_UNEXPECTED_ERROR, objArr22);
                        obj = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr22[0]), i6);
                        revokeselfpermissionsonkill.getProfileVersion = obj;
                        revokeselfpermissionsonkill.writeReplace(2);
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -13:
                        revokeselfpermissionsonkill.writeReplace(17);
                        throw ((java.lang.Throwable) revokeselfpermissionsonkill.RecordsJson);
                    case -12:
                        i5 = 24;
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -11:
                        i5 = 22;
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -10:
                        revokeselfpermissionsonkill.writeReplace(15);
                        if (revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson == 0) {
                            i4 = 21;
                            i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                            c3 = 16;
                        }
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -9:
                        try {
                            revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                            revokeselfpermissionsonkill.writeReplace(4);
                            revokeselfpermissionsonkill.writeReplace(11);
                            obj2 = revokeselfpermissionsonkill.RecordsJson;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i5 < 26) {
                            }
                            if (i5 >= 68) {
                                break;
                            }
                            throw th;
                        }
                        try {
                            byte[] bArr6 = SdkCoreBusinessLogicModuleImpl;
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(bArr6[454], bArr6[c3], 562, objArr23);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a(bArr6[11], bArr6[461], 580, objArr24);
                            try {
                                obj = cls6.getMethod((java.lang.String) objArr24[0], null).invoke(obj2, null);
                                revokeselfpermissionsonkill.getProfileVersion = obj;
                                revokeselfpermissionsonkill.writeReplace(2);
                                i4 = i5;
                                i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                                c3 = 16;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                java.lang.Throwable cause2 = th.getCause();
                                if (cause2 == null) {
                                    throw th;
                                }
                                throw cause2;
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                        }
                        break;
                    case -8:
                        i4 = 26;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -7:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(11);
                        java.lang.Object obj5 = revokeselfpermissionsonkill.RecordsJson;
                        try {
                            byte[] bArr7 = SdkCoreBusinessLogicModuleImpl;
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            a(bArr7[461], bArr7[c3], i2, objArr25);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                            short s5 = bArr7[6];
                            byte b7 = bArr7[21];
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(s5, b7, (short) (b7 | 544), objArr26);
                            obj = cls7.getMethod((java.lang.String) objArr26[0], null).invoke(obj5, null);
                            revokeselfpermissionsonkill.getProfileVersion = obj;
                            revokeselfpermissionsonkill.writeReplace(2);
                            i4 = i5;
                            i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                            c3 = 16;
                        } catch (java.lang.Throwable th7) {
                            java.lang.Throwable cause3 = th7.getCause();
                            if (cause3 == null) {
                                throw th7;
                            }
                            throw cause3;
                        }
                    case -6:
                        try {
                            revokeselfpermissionsonkill.DigitizedCardProfile = 5;
                            revokeselfpermissionsonkill.writeReplace(4);
                            revokeselfpermissionsonkill.writeReplace(5);
                            boolean z = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson != 0;
                            revokeselfpermissionsonkill.writeReplace(11);
                            java.lang.String str6 = (java.lang.String) revokeselfpermissionsonkill.RecordsJson;
                            revokeselfpermissionsonkill.writeReplace(5);
                            int i7 = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson;
                            revokeselfpermissionsonkill.writeReplace(5);
                            int i8 = revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson;
                            revokeselfpermissionsonkill.writeReplace(5);
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            b(z, str6, i7, i8, revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson, objArr27);
                            obj = (java.lang.String) objArr27[0];
                            revokeselfpermissionsonkill.getProfileVersion = obj;
                            revokeselfpermissionsonkill.writeReplace(2);
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            if (i5 < 26) {
                            }
                            if (i5 >= 68) {
                            }
                            throw th;
                        }
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                        break;
                    case -5:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(5);
                        try {
                            java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson)};
                            byte[] bArr8 = SdkCoreBusinessLogicModuleImpl;
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            a(bArr8[466], bArr8[397], 1092, objArr29);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                            short s6 = bArr8[471];
                            byte b8 = bArr8[27];
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            a(s6, b8, (short) (b8 | 1104), objArr30);
                            intValue = ((java.lang.Integer) cls8.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE).invoke(null, objArr28)).intValue();
                            revokeselfpermissionsonkill.DigitizedCardProfile = intValue;
                            revokeselfpermissionsonkill.writeReplace(6);
                            i4 = i5;
                            i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                            c3 = 16;
                        } catch (java.lang.Throwable th9) {
                            java.lang.Throwable cause4 = th9.getCause();
                            if (cause4 == null) {
                                throw th9;
                            }
                            throw cause4;
                        }
                    case -4:
                        revokeselfpermissionsonkill.DigitizedCardProfile = 1;
                        revokeselfpermissionsonkill.writeReplace(4);
                        revokeselfpermissionsonkill.writeReplace(5);
                        try {
                            java.lang.Object[] objArr31 = {java.lang.Integer.valueOf(revokeselfpermissionsonkill.AlternateContactlessPaymentDataJson)};
                            byte[] bArr9 = SdkCoreBusinessLogicModuleImpl;
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            a(bArr9[470], bArr9[397], org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_VERSION_INFO, objArr32);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr32[0]);
                            short s7 = bArr9[21];
                            byte b9 = bArr9[457];
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            a(s7, b9, (short) (b9 | 1060), objArr33);
                            revokeselfpermissionsonkill.values = ((java.lang.Float) cls9.getMethod((java.lang.String) objArr33[0], java.lang.Integer.TYPE).invoke(null, objArr31)).floatValue();
                            revokeselfpermissionsonkill.writeReplace(50);
                            i4 = i5;
                            i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                            c3 = 16;
                        } catch (java.lang.Throwable th10) {
                            java.lang.Throwable cause5 = th10.getCause();
                            if (cause5 == null) {
                                throw th10;
                            }
                            throw cause5;
                        }
                    case -3:
                        try {
                            byte[] bArr10 = SdkCoreBusinessLogicModuleImpl;
                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                            a(bArr10[1108], bArr10[397], 1003, objArr34);
                            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr34[0]);
                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                            a((short) (bArr10[1109] - 1), bArr10[461], org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO, objArr35);
                            intValue = ((java.lang.Integer) cls10.getMethod((java.lang.String) objArr35[0], null).invoke(null, null)).intValue();
                            revokeselfpermissionsonkill.DigitizedCardProfile = intValue;
                            revokeselfpermissionsonkill.writeReplace(6);
                            i4 = i5;
                            i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                            c3 = 16;
                        } catch (java.lang.Throwable th11) {
                            java.lang.Throwable cause6 = th11.getCause();
                            if (cause6 == null) {
                                throw th11;
                            }
                            throw cause6;
                        }
                    case -2:
                        revokeselfpermissionsonkill.getProfileVersion = "\u0001�\u0003";
                        revokeselfpermissionsonkill.writeReplace(2);
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                    case -1:
                        i4 = 52;
                    default:
                        i4 = i5;
                        i2 = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        c3 = 16;
                }
            }
            throw th;
        } catch (java.lang.Throwable th12) {
            java.lang.Throwable cause7 = th12.getCause();
            if (cause7 == null) {
                throw th12;
            }
            throw cause7;
        }
    }

    private static void a(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3 = 118 - s;
        int i4 = i2 + 4;
        byte[] bArr = SdkCoreBusinessLogicModuleImpl;
        byte[] bArr2 = new byte[i + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 += i4;
            i4++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i4;
            i3 = bArr[i4] + i3;
            i4 = i7 + 1;
            i5 = i6;
        }
    }

    static void getPaymentFci() {
        byte[] bArr = new byte[1133];
        java.lang.System.arraycopy("nr \u008e\u0004û\u0005û\u0001\u0005ú\u0007ù\u0001\u0006ù\fô\u0001\u0007ø\ró\u0005ÿü\u0001\b÷\u0005\u0001ú\u0001\tö\u0005\u0002ù\u0001\nõ\u0001\u000bô\u0001\fó\u0005\u0003ø\u0001\u0004ÿü\u0005\u0003ø\u0001\u0004\u0000û\u0001\u0004\u0001ú\u0001\u0004\u0002ù\u0005\u0005ö\u0005\u0007ô\u0001\u0004\u0003ø\u0005\u0007ô\u0001\u0004\u0003ø\u0005û\u0001\u0004\u0004÷\u0005\bó\u0005\u0001ú\u0006þü\u0001\u0004\u0005ö\u0001\u0004\u0006õ\u0005û\u0001\u0004\u0007ô\u0006ÿû\u0001\u0004\bó\u0006\u0000ú\u0001\u0005þü\u0006\u0001ù\u0005\u0005ö\u0001\u0005ÿû\u0005\u0007ô\u0001\u0005\u0000ú\u0001\u0005\u0001ù\u0001\u0005\u0002ø\u0006\u0002ø\u0001\u0005\u0003÷\u0006\u0003÷\u0001\u0005ÿû\u0005\u0007ô\u0001\u0005\u0004ö\u0006\u0004ö\u0006\u0005õ\u0001\u0005\u0005õ\u0006\u0006ô\u0006\u0007ó\u0001\u0005\u0006ô\u0001\u0005\u0007ó\u0007ýü\u0007þû\u0007ÿú\u0001\u0006ýü\u0006\u0006ô\u0007\u0000ù\u0001\u0006þû\u0001\u0006ÿú\u0001\u0006\u0000ù\u0001\u0006\u0000ù\u0001\u0005\u0007ó\u0007\u0002÷\u0007\u0003ö\u0007\u0000ù\u0001\u0006ýü\u0006\u0006ô\u0007\u0000ù\u0001\u0006\u0001ø\u0001\u0006\u0002÷\u0001\u0006\u0003ö\u0006\u0006ô\u0007\u0004õ\u0007\u0005ô\u0001\u0005\u0006ô\u0001\u0006\u0004õ\u0007\u0006ó\büü\u0001\u0006\u0005ô\u0006\u0006ô\u0007\u0000ù\u0001\u0006\u0006ó\u0001\u0007üü\u0001\u0007ýû\u0005\u0001ú\u0001\u0005ú\bþú\u0005û\u0001\u0006ù\u0007þû\u0006\u0006ô\u0001\u0007ø\ró\bÿù\u0001\b÷\u0005û\u0001\tö\u0007\u0000ù\u0001\nõ\u0001\u000bô\u0001\fó\u0001\u0007þú\u0005û\u0001\u0007ÿù\u0005\u0001ú\u0001\u0007ÿù\u0001\u0007\u0000ø\b\u0001÷\u0001\u0007\u0001÷\b\u0002ö\u0001\u0007\u0001÷\u0015ëÍ>õ\rùÇ%!þ÷\u0005ùýüý\u000b÷\u0015ëÍ>õ\rùÇ\u001b%\u0006ñ\u0002þ\rë\u000b\tðê\u0017\u0005\u0006â\u000b\u000b\tð\rö\u000eýúûÊHóü\u0012·(\u0013ü\u0012þ\u000fÐ!\u0001û\u0014÷\bß\u0016\u0011ë\rö\u000eýúûÊA\u0004»\"\"ýô\u0002\u000e\u0000þ\u000fÑ'õ\u000f\u0003òÿß-\u0005ß\u0015\u0004ø\rö\u000eýúûÊFñ\u0013üº&\u0011\u0013üá\u001fõ\u0003\u0007þ\u000fÛ\u0017\u0000\rò\u000fÍ%\u000eñ\r÷\u0015ëÍ>õ\rùÇ\u0015%ù\u0011á\u0012\f\u0004ð\tõ\u0002\u0005\u0006ñ\rü÷\u0015ëÍ>õ\rùÇ&\u0014\ný\bê\u0001\nùþ\u000fÏ\u001e\u0014þò÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011÷\u0015ëÍ>õ\rùÇDó\u0001\u0006ùþ\u0011º\u001f\u0018\u000fô\u0007õ\u0005\bùüúñ\u001e÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011Ç\u0004û\u0005û\u0001\u0005ú\b\u0004ô\u0001\u0006ù\b\u0005ó\tüû\u0001\u0007ø\týú\tþù\u0005\u0001ú\u0001\b÷\u0005\u0002ù\u0001\tö\u0001\nõ\u0001\u000bô\u0005\u0003ø\u0001\fó\u0005\u0003ø\u0001\u0004ÿü\u0001\u0004\u0000û\u0001\u0004\u0001ú\tÿø\u0001\u0004\u0002ù\u0005\u0007ô\u0001\u0004\u0002ù\u0005û\u0001\u0004\u0003ø\t\u0000÷\u0005\u0005ö\t\u0001ö\u0001\u0004\u0004÷\u0001\u0004\u0005ö\u0005û\u0001\u0004\u0006õ\u0006ÿû\u0001\u0004\u0007ô\u0006\u0000ú\u0001\u0004\bó\u0005\u0005ö\t\u0002õ\u0001\u0005þü\u0005\u0007ô\u0001\u0005ÿû\u0001\u0005\u0000ú\u0001\u0005\u0001ù\u0006\u0002ø\u0001\u0004\bó\u0006\u0003÷\u0001\u0005þü\u0005\u0007ô\u0001\u0005\u0002ø\u0006\u0004ö\u0006\u0005õ\u0001\u0005\u0003÷\t\u0003ô\u0001\u0005\u0004ö\u0001\u0005\u0005õ\t\u0004ó\núü\u0007\u0000ù\u0001\u0005\u0006ô\nûû\u0001\u0005\u0007ó\u0001\u0006ýü\u0001\u0006þû\u0001\u0004\u0002ù\t\u0003ô\u0006\u0002ø\u0001\u0006ÿú\u0005\u0007ô\u0001\u0005\u0004ö\u0001\u0006\u0000ù\nüú\u0007þû\u0007ÿú\u0001\u0006\u0001ø\nûû\u0001\u0006\u0002÷\u0001\u0006\u0003ö\u0001\u0006\u0004õ\u0005\u0001ú\u0001\u0005ú\nýù\u0001\u0006ù\nþø\nÿ÷\u0005û\u0001\u0007ø\n\u0000ö\n\u0001õ\u0006\u0006ô\u0005û\u0001\b÷\n\u0002ô\u0001\tö\u0001\nõ\u0001\u000bô\u0001\u0006\u0005ô\u0005û\u0001\u0006\u0006ó\u0005\u0001ú\u0001\u0006\u0006ó\u0001\u0007üü\n\u0003ó\u0001\u0007ýû\u000bùü\u0001\u0007ý\rö\u000eýúûÊHóü\u0012·(\u0013ü\u0012Ì,ÿø\u0003þ\u000eýï\u0013õ\u0006ÿþ\u000fÙ\u0014\u0017ñ\u0004\bø×.ï\u0016ò\u0005ùÜ\u001e\u0002\u0005ýî\u0016\u0011ë\rö\u000eýúûÊGÿõ\u0003Â&%÷õÿò\u000b\u000b\tð\fþ\u0003üù\u0013Ü\u001b×&\u0003ò\u0013\rö\u000eýúûÊHóü\u0012·\u001d\u001a\u0014Ì1ï\t\u0006\u0001\u0003ûô\u000bý\u0011ëè\u0018\u000fíò!í\u0013ñ".getBytes("ISO-8859-1"), 0, bArr, 0, 1133);
        SdkCoreBusinessLogicModuleImpl = bArr;
        getGpoResponse = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getPaymentFci();
        getCvrMaskAnd = 0;
        getPaymentFci = 1;
        IccPrivateKeyCrtComponentsJson = 1889207149;
    }

    public final boolean RecordsJson() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -1434712803, 1434712804, java.lang.System.identityHashCode(this))).booleanValue();
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.SI, -31, 80, -73};
        $$e = 165;
    }

    public final boolean values() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, 727813202, -727813200, java.lang.System.identityHashCode(this))).booleanValue();
    }

    static void init$0() {
        $$a = new byte[]{98, 74, -39, 82, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -44, 1, -6, com.google.common.base.Ascii.SI, -19, 4, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -41, 3, 6, -8, 10, -1, -10, 7, com.google.common.base.Ascii.NAK, -11, -9, 16, com.google.common.base.Ascii.SYN, -23};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE;
    }

    public final boolean DigitizedCardProfile() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -1089688552, 1089688552, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
