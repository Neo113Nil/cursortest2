package com.payair.hce;

/* loaded from: classes4.dex */
public class setAckAlwaysRequiredIfCurrencyNotProvided extends com.payair.hce.isPrimaryAidMchipDataValid<com.payair.hce.setAckAlwaysRequiredIfCurrencyProvided> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char DigitizedCardProfile;
    private static long IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char SdkCoreBusinessLogicModuleImpl;
    private static char getAid;
    private static int getCiacDecline;
    private static int getCvrMaskAnd;
    private static char getProfileVersion;
    private static final com.payair.hce.transactionCanBeResumed writeReplace;

    private static void b(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2 = s * 2;
        int i3 = 110 - (i * 4);
        int i4 = b + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + (-i3);
            i4 = i4;
        }
        while (true) {
            i5++;
            int i6 = i4 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 += -bArr[i6];
                i4 = i6;
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCiacDecline = 0;
        getCvrMaskAnd = 1;
        writeReplace();
        writeReplace = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) -125);
        com.payair.hce.setRecords.values((byte) -88, com.payair.hce.setAckAlwaysRequiredIfCurrencyNotProvided.class);
        getCvrMaskAnd = (getCiacDecline + 29) % 128;
    }

    public setAckAlwaysRequiredIfCurrencyNotProvided() {
        DigitizedCardProfile(Byte.MIN_VALUE);
        writeReplace((byte) 0);
        AlternateContactlessPaymentDataJson((byte) 0);
        DigitizedCardProfile();
        DigitizedCardProfile(com.payair.hce.onDeleteCardCompleted.valueOf.writeReplace);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0262 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0263  */
    @Override // com.payair.hce.isPrimaryAidMchipDataValid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final com.payair.hce.getContactlessSupported valueOf() throws com.payair.hce.getAtcCount {
        com.payair.hce.RemotePaymentData writeReplace2;
        int i;
        try {
            com.payair.hce.getWalletIdentificationDataProvider writeReplace3 = com.payair.hce.getWalletIdentificationDataProvider.writeReplace(((com.payair.hce.setAckAlwaysRequiredIfCurrencyProvided) this.valueOf).getCvrMaskAnd());
            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
            android.view.ViewConfiguration.getPressedStateDuration();
            new java.lang.Object[]{writeReplace3};
            int i2 = getCiacDecline + 47;
            getCvrMaskAnd = i2 % 128;
            if (i2 % 2 == 0) {
                writeReplace3.valueOf().valueOf(writeReplace);
                throw null;
            }
            com.payair.hce.transactionCanBeResumed valueOf = writeReplace3.valueOf();
            com.payair.hce.transactionCanBeResumed transactioncanberesumed = writeReplace;
            if (!valueOf.valueOf(transactioncanberesumed)) {
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track22 = this.AlternateContactlessPaymentDataJson;
                android.view.ViewConfiguration.getScrollFriction();
                android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                new java.lang.Object[]{transactioncanberesumed};
                throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getPinAlwaysRequiredIfCurrencyNotProvided);
            }
            if (((java.lang.Integer) com.payair.hce.getWalletIdentificationDataProvider.values(new java.lang.Object[]{writeReplace3}, -1698785018, 1698785019, java.lang.System.identityHashCode(writeReplace3))).intValue() != ((com.payair.hce.setAckAlwaysRequiredIfCurrencyProvided) this.valueOf).getCvrMaskAnd().length) {
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track23 = this.AlternateContactlessPaymentDataJson;
                android.widget.ExpandableListView.getPackedPositionGroup(0L);
                throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getMppLiteModule);
            }
            com.payair.hce.access000 access000Var = (com.payair.hce.access000) this.values.AlternateContactlessPaymentDataJson();
            com.payair.hce.requestChangePin requestchangepin = (com.payair.hce.requestChangePin) ((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, 857149142, -857149112, java.lang.System.identityHashCode(access000Var)));
            com.payair.hce.access400 access400Var = (com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, -2078363504, 2078363507, java.lang.System.identityHashCode(access000Var));
            java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> valueOf2 = access000Var.valueOf();
            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track24 = this.AlternateContactlessPaymentDataJson;
            android.os.SystemClock.elapsedRealtimeNanos();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("喩쇉", 1 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            new java.lang.Object[]{com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(valueOf2, ((java.lang.String) objArr[0]).intern())};
            com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson = writeReplace3.AlternateContactlessPaymentDataJson();
            if (com.payair.hce.onRequestSessionCompleted.values(valueOf2) != AlternateContactlessPaymentDataJson.DigitizedCardProfile()) {
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track25 = this.AlternateContactlessPaymentDataJson;
                android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getMppLiteModule);
            }
            try {
                int i3 = 0;
                for (com.payair.hce.startDeviceAuthenticationForRegistration startdeviceauthenticationforregistration : valueOf2) {
                    com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider = new com.payair.hce.getWalletIdentificationDataProvider(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(startdeviceauthenticationforregistration.valueOf()), AlternateContactlessPaymentDataJson.values(i3, startdeviceauthenticationforregistration.AlternateContactlessPaymentDataJson() + i3));
                    com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track26 = this.AlternateContactlessPaymentDataJson;
                    android.os.Process.myTid();
                    android.text.TextUtils.getTrimmedLength("");
                    access400Var.DigitizedCardProfile(getwalletidentificationdataprovider);
                    i3 += startdeviceauthenticationforregistration.AlternateContactlessPaymentDataJson();
                }
                access000Var.values(AlternateContactlessPaymentDataJson);
                if (requestchangepin.valueOf()) {
                    com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access000Var));
                    writeReplace2 = ((com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir))).AlternateContactlessPaymentDataJson();
                } else {
                    com.payair.hce.getCodeCacheDir getcodecachedir2 = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access000Var));
                    writeReplace2 = ((com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir2}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir2))).writeReplace();
                }
                com.payair.hce.getDigitizedCard getdigitizedcard = (com.payair.hce.getDigitizedCard) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{writeReplace2}, 1072178576, -1072178573, java.lang.System.identityHashCode(writeReplace2));
                if (!((com.payair.hce.requestChangePin) ((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, 857149142, -857149112, java.lang.System.identityHashCode(access000Var)))).valueOf()) {
                    try {
                        if (access400Var.values().values() || access400Var.values().DigitizedCardProfile()) {
                            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track27 = this.AlternateContactlessPaymentDataJson;
                            android.os.SystemClock.elapsedRealtime();
                            android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                            com.payair.hce.getCodeCacheDir getcodecachedir3 = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access000Var));
                            if (((com.payair.hce.createConfigurationContext) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir3}, -775162360, 775162363, java.lang.System.identityHashCode(getcodecachedir3))).getProfileVersion()) {
                                getCvrMaskAnd = (getCiacDecline + 83) % 128;
                                com.payair.hce.getCodeCacheDir getcodecachedir4 = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access000Var));
                                if (((com.payair.hce.createConfigurationContext) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir4}, -775162360, 775162363, java.lang.System.identityHashCode(getcodecachedir4))).SdkCoreAlternateContactlessPaymentDataImpl()) {
                                    com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track28 = this.AlternateContactlessPaymentDataJson;
                                    android.os.SystemClock.elapsedRealtimeNanos();
                                    try {
                                        if (access400Var.DigitizedCardProfile().writeReplace()) {
                                            getCiacDecline = (getCvrMaskAnd + 23) % 128;
                                            com.payair.hce.getDigitizedCard getdigitizedcard2 = (com.payair.hce.getDigitizedCard) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{writeReplace2}, 1080004933, -1080004931, java.lang.System.identityHashCode(writeReplace2));
                                            try {
                                                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track29 = this.AlternateContactlessPaymentDataJson;
                                                android.view.View.resolveSize(0, 0);
                                                android.view.MotionEvent.axisFromString("");
                                                getdigitizedcard = getdigitizedcard2;
                                            } catch (com.payair.hce.getSetPinRequestData unused) {
                                                getdigitizedcard = getdigitizedcard2;
                                                com.payair.hce.getDigitizedCard getdigitizedcard3 = (com.payair.hce.getDigitizedCard) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{writeReplace2}, 1080004933, -1080004931, java.lang.System.identityHashCode(writeReplace2));
                                                try {
                                                    com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track210 = this.AlternateContactlessPaymentDataJson;
                                                    android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                                                    android.os.Process.myTid();
                                                    getdigitizedcard = getdigitizedcard3;
                                                } catch (com.payair.hce.getSetPinRequestData unused2) {
                                                    getdigitizedcard = getdigitizedcard3;
                                                    com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track211 = this.AlternateContactlessPaymentDataJson;
                                                    android.view.MotionEvent.axisFromString("");
                                                    com.payair.hce.setPinAlwaysRequiredIfCurrencyNotProvided setpinalwaysrequiredifcurrencynotprovided = new com.payair.hce.setPinAlwaysRequiredIfCurrencyNotProvided();
                                                    setpinalwaysrequiredifcurrencynotprovided.AlternateContactlessPaymentDataJson(getdigitizedcard.writeReplace(), getdigitizedcard.AlternateContactlessPaymentDataJson());
                                                    this.values.writeReplace().writeReplace(com.payair.hce.onDeleteCardCompleted.valueOf.values);
                                                    i = getCvrMaskAnd + 53;
                                                    getCiacDecline = i % 128;
                                                    if (i % 2 == 0) {
                                                    }
                                                }
                                                com.payair.hce.setPinAlwaysRequiredIfCurrencyNotProvided setpinalwaysrequiredifcurrencynotprovided2 = new com.payair.hce.setPinAlwaysRequiredIfCurrencyNotProvided();
                                                setpinalwaysrequiredifcurrencynotprovided2.AlternateContactlessPaymentDataJson(getdigitizedcard.writeReplace(), getdigitizedcard.AlternateContactlessPaymentDataJson());
                                                this.values.writeReplace().writeReplace(com.payair.hce.onDeleteCardCompleted.valueOf.values);
                                                i = getCvrMaskAnd + 53;
                                                getCiacDecline = i % 128;
                                                if (i % 2 == 0) {
                                                }
                                            }
                                        }
                                    } catch (com.payair.hce.getSetPinRequestData unused3) {
                                    }
                                }
                            }
                        }
                    } catch (com.payair.hce.getSetPinRequestData unused4) {
                    }
                }
                com.payair.hce.setPinAlwaysRequiredIfCurrencyNotProvided setpinalwaysrequiredifcurrencynotprovided22 = new com.payair.hce.setPinAlwaysRequiredIfCurrencyNotProvided();
                setpinalwaysrequiredifcurrencynotprovided22.AlternateContactlessPaymentDataJson(getdigitizedcard.writeReplace(), getdigitizedcard.AlternateContactlessPaymentDataJson());
                this.values.writeReplace().writeReplace(com.payair.hce.onDeleteCardCompleted.valueOf.values);
                i = getCvrMaskAnd + 53;
                getCiacDecline = i % 128;
                if (i % 2 == 0) {
                    return setpinalwaysrequiredifcurrencynotprovided22;
                }
                throw null;
            } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi | java.lang.RuntimeException unused5) {
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track212 = this.AlternateContactlessPaymentDataJson;
                android.graphics.PointF.length(0.0f, 0.0f);
                android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getPinAlwaysRequiredIfCurrencyNotProvided);
            }
        } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.postToastMessageOnUi unused6) {
            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track213 = this.AlternateContactlessPaymentDataJson;
            android.view.ViewConfiguration.getScrollFriction();
            android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getAckAlwaysRequiredIfCurrencyNotProvided);
        } catch (com.payair.hce.generateExpiryDate unused7) {
            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track214 = this.AlternateContactlessPaymentDataJson;
            android.view.ViewConfiguration.getTapTimeout();
            throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getMppLiteModule);
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $11 + 87;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                $10 = ($11 + 107) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (getAid ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getProfileVersion)};
                    int i5 = c2 + i3;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 62, 1335 - android.view.KeyEvent.keyCodeFromString(""), (char) android.text.TextUtils.getTrimmedLength(""));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) -1, 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (DigitizedCardProfile ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(RecordsJson)};
                    int i6 = charValue + i3;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 62, 1336 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) -1, 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i3 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.view.KeyEvent.keyCodeFromString(""), 3542 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            $10 = ($11 + 93) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    @Override // com.payair.hce.isPrimaryAidMchipDataValid
    protected final /* synthetic */ com.payair.hce.setAckAlwaysRequiredIfCurrencyProvided DigitizedCardProfile(byte[] bArr) throws com.payair.hce.digitize {
        com.payair.hce.setAckAlwaysRequiredIfCurrencyProvided setackalwaysrequiredifcurrencyprovided = new com.payair.hce.setAckAlwaysRequiredIfCurrencyProvided(bArr);
        getCvrMaskAnd = (getCiacDecline + 27) % 128;
        return setackalwaysrequiredifcurrencyprovided;
    }

    static void init$0() {
        $$a = new byte[]{92, -25, 4, -11};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
    }

    static void writeReplace() {
        DigitizedCardProfile = (char) 51474;
        RecordsJson = (char) 1757;
        getAid = (char) 13895;
        getProfileVersion = (char) 18415;
        IccPrivateKeyCrtComponentsJson = 1263759066225628708L;
        SdkCoreAlternateContactlessPaymentDataImpl = 1586609335;
        SdkCoreBusinessLogicModuleImpl = (char) 54820;
    }
}
