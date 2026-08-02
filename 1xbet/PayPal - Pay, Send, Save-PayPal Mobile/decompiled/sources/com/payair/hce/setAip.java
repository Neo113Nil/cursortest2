package com.payair.hce;

/* loaded from: classes4.dex */
public final class setAip {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson;
    private static final byte[] DigitizedCardProfile;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static final byte[] getAid;
    private static int[] getCiacDecline;
    private static char[] getGpoResponse;
    private static int getPaymentFci;
    private static final com.payair.hce.transactionCanBeResumed valueOf;
    private static final com.payair.hce.transactionCanBeResumed values;
    private static final com.payair.hce.transactionCanBeResumed writeReplace;
    private com.payair.hce.setPinIvCvc3Track2 IccPrivateKeyCrtComponentsJson = com.payair.hce.setMaximumPinTry.valueOf();
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> RecordsJson;
    private java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.transactionCanBeResumed getProfileVersion;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.setAip setaip = (com.payair.hce.setAip) objArr[0];
        int i4 = SdkCoreBusinessLogicModuleImpl;
        getPaymentFci = (i4 + 115) % 128;
        java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> linkedHashMap = setaip.SdkCoreAlternateContactlessPaymentDataImpl;
        getPaymentFci = (i4 + 43) % 128;
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = s + 4;
        int i5 = (i * 2) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i3 = i4;
            int i6 = i5;
            i2 = 0;
            i4 += -i6;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i6 = bArr[i3];
            i4 += -i6;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        } else {
            int i7 = 111 - b;
            i2 = 0;
            i3 = i4;
            i4 = i7;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getPaymentFci = 0;
        SdkCoreBusinessLogicModuleImpl = 1;
        DigitizedCardProfile();
        values = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) 111);
        valueOf = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) -124);
        AlternateContactlessPaymentDataJson = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) -91);
        writeReplace = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(new byte[]{-97, 56});
        DigitizedCardProfile = new byte[]{-97, com.google.common.base.Ascii.GS};
        getAid = new byte[]{-97, com.google.common.base.Ascii.SUB};
        getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 119) % 128;
    }

    public setAip(byte[] bArr, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) throws com.payair.hce.updateSukFileName {
        try {
            com.payair.hce.getWalletIdentificationDataProvider writeReplace2 = com.payair.hce.getWalletIdentificationDataProvider.writeReplace(bArr);
            com.payair.hce.transactionCanBeResumed valueOf2 = writeReplace2.valueOf();
            com.payair.hce.transactionCanBeResumed transactioncanberesumed = values;
            if (!valueOf2.valueOf(transactioncanberesumed)) {
                com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate = com.payair.hce.requestTaskStatusUpdate.getCardLayoutDescription;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(new int[]{-1957616681, -835169768, 1049281204, 816738255, -152460862, 855568047, -712187507, -138431694, 58628953, 15030523, -1357252327, -1843414310, -283164368, -614471533, 916141279, 337379389}, 33 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
                sb.append(transactioncanberesumed);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(new int[]{138484415, 1065818595, 1389986072, -1067978132}, 6 - android.view.KeyEvent.getDeadChar(0, 0), objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sb.append(writeReplace2.valueOf());
                throw new com.payair.hce.updateSukFileName(requesttaskstatusupdate, sb.toString());
            }
            java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson2 = com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(writeReplace2.AlternateContactlessPaymentDataJson(), 0);
            com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = valueOf;
            if (AlternateContactlessPaymentDataJson2.containsKey(transactioncanberesumed2)) {
                this.getProfileVersion = AlternateContactlessPaymentDataJson2.get(transactioncanberesumed2).AlternateContactlessPaymentDataJson();
            }
            com.payair.hce.transactionCanBeResumed transactioncanberesumed3 = AlternateContactlessPaymentDataJson;
            if (!AlternateContactlessPaymentDataJson2.containsKey(transactioncanberesumed3)) {
                com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate2 = com.payair.hce.requestTaskStatusUpdate.getCardLayoutDescription;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(new int[]{-124152278, -1387429037, 1438870243, 496798223, -298646295, -1120200208}, android.graphics.Color.red(0) + 12, objArr3);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(((java.lang.String) objArr3[0]).intern());
                sb2.append(transactioncanberesumed3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(new int[]{-479798672, 1066303749, -1354058030, -615229076, 59140318, -1652330075, -500329269, -19800322, -1586308186, -1216767554, -1559907388, -1017684326, -1216719973, -33062841}, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27, objArr4);
                sb2.append(((java.lang.String) objArr4[0]).intern());
                throw new com.payair.hce.updateSukFileName(requesttaskstatusupdate2, sb2.toString());
            }
            this.SdkCoreAlternateContactlessPaymentDataImpl = com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2.get(transactioncanberesumed3).AlternateContactlessPaymentDataJson(), 0);
            this.RecordsJson = new java.util.ArrayList();
            writeReplace(list);
        } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused) {
            android.view.ViewConfiguration.getZoomControlsTimeout();
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getProfileVersion);
        }
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getCiacDecline;
        int i3 = 16;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                $10 = ($11 + 61) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr3[i6])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> i3), 29 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = 16;
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
        int[] iArr6 = getCiacDecline;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                $10 = ($11 + 67) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[i4];
                objArr3[0] = java.lang.Integer.valueOf(iArr6[i7]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    i2 = length3;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26, 29 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                    i2 = length3;
                }
                iArr7[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i7++;
                iArr6 = iArr2;
                length3 = i2;
                i4 = 1;
                i5 = 0;
            }
            iArr6 = iArr7;
        }
        int i8 = i5;
        java.lang.System.arraycopy(iArr6, i8, iArr5, i8, length2);
        istransitsupported.valueOf = i8;
        $10 = ($11 + 33) % 128;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i9 = 0;
            for (int i10 = 16; i9 < i10; i10 = 16) {
                $11 = ($10 + 53) % 128;
                istransitsupported.DigitizedCardProfile ^= iArr5[i9];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 31, android.graphics.Color.rgb(0, 0, 0) + 16782304, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
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
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i12 = istransitsupported.DigitizedCardProfile;
            int i13 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.KeyEvent.normalizeMetaState(0), android.text.TextUtils.getOffsetBefore("", 0) + 2923, (char) (3038 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                c((short) -1, 0, (byte) 45, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private void writeReplace(java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) throws com.payair.hce.updateSukFileName {
        if (list != null) {
            SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 15) % 128;
            if (list.isEmpty()) {
                return;
            }
            int i = SdkCoreBusinessLogicModuleImpl + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getPaymentFci = i % 128;
            if (i % 2 == 0) {
                com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider = this.SdkCoreAlternateContactlessPaymentDataImpl.get(writeReplace);
                if (getwalletidentificationdataprovider != null) {
                    try {
                        java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> writeReplace2 = com.payair.hce.onRequestSessionCompleted.writeReplace(getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson().valueOf());
                        for (com.payair.hce.startDeviceAuthenticationForRegistration startdeviceauthenticationforregistration : list) {
                            if (!writeReplace2.contains(startdeviceauthenticationforregistration)) {
                                writeReplace2.add(startdeviceauthenticationforregistration);
                            }
                        }
                        this.RecordsJson.addAll(writeReplace2);
                    } catch (com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused) {
                        android.view.ViewConfiguration.getScrollFriction();
                        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate = com.payair.hce.requestTaskStatusUpdate.getAckAlwaysRequiredIfCurrencyProvided;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        b(new int[]{49, 44, 0, 28}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000", true, objArr);
                        throw new com.payair.hce.updateSukFileName(requesttaskstatusupdate, ((java.lang.String) objArr[0]).intern());
                    }
                } else {
                    this.RecordsJson.add(new com.payair.hce.startDeviceAuthenticationForRegistration(DigitizedCardProfile, (byte) 8));
                    this.RecordsJson.add(new com.payair.hce.startDeviceAuthenticationForRegistration(getAid, (byte) 2));
                }
                android.text.TextUtils.getOffsetAfter("", 0);
                java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list2 = this.RecordsJson;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(new int[]{1435896187, 236818360}, (android.os.Process.myTid() >> 22) + 1, objArr2);
                new java.lang.Object[]{com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(list2, ((java.lang.String) objArr2[0]).intern())};
                try {
                    com.payair.hce.transactionCanBeResumed transactioncanberesumed = writeReplace;
                    this.SdkCoreAlternateContactlessPaymentDataImpl.put(transactioncanberesumed, new com.payair.hce.getWalletIdentificationDataProvider(transactioncanberesumed, com.payair.hce.onRequestSessionCompleted.writeReplace(this.RecordsJson)));
                    return;
                } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused2) {
                    android.view.ViewConfiguration.getLongPressTimeout();
                    com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate2 = com.payair.hce.requestTaskStatusUpdate.getAckAlwaysRequiredIfCurrencyProvided;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 52, 0, 13}, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001", false, objArr3);
                    throw new com.payair.hce.updateSukFileName(requesttaskstatusupdate2, ((java.lang.String) objArr3[0]).intern());
                }
            }
            this.SdkCoreAlternateContactlessPaymentDataImpl.get(writeReplace);
            throw new java.lang.ArithmeticException();
        }
    }

    public final com.payair.hce.transactionCanBeResumed values() {
        int i = getPaymentFci + 101;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 != 0) {
            return this.getProfileVersion;
        }
        throw null;
    }

    public final java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> writeReplace() {
        int i = SdkCoreBusinessLogicModuleImpl + 67;
        getPaymentFci = i % 128;
        if (i % 2 == 0) {
            return this.RecordsJson;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        r3 = r10.getProfileVersion.writeReplace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (r10.getProfileVersion != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r10.getProfileVersion != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r3 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String toString() {
        java.lang.Object[] objArr;
        java.lang.String writeReplace2;
        java.lang.String str;
        int i = getPaymentFci + 117;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.setMaximumPinTry.valueOf();
            android.view.ViewConfiguration.getScrollBarFadeDuration();
            objArr = new java.lang.Object[1];
        } else {
            com.payair.hce.setMaximumPinTry.valueOf();
            android.view.ViewConfiguration.getScrollBarFadeDuration();
            objArr = new java.lang.Object[1];
        }
        objArr[0] = writeReplace2;
        android.widget.ExpandableListView.getPackedPositionForGroup(0);
        java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> linkedHashMap = this.SdkCoreAlternateContactlessPaymentDataImpl;
        if (linkedHashMap != null) {
            java.util.Collection<com.payair.hce.getWalletIdentificationDataProvider> values2 = linkedHashMap.values();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{1435896187, 236818360}, -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
            str = com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(values2, ((java.lang.String) objArr2[0]).intern());
            getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 3) % 128;
        } else {
            int i2 = SdkCoreBusinessLogicModuleImpl + 91;
            getPaymentFci = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 2;
            }
            str = "";
        }
        new java.lang.Object[]{str};
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, 10, 0, 0}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000", false, objArr3);
        return ((java.lang.String) objArr3[0]).intern();
    }

    private static void b(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        int i;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = iArr[1];
        int i5 = 2;
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = getGpoResponse;
        if (cArr2 != null) {
            int i8 = $10 + 63;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 91;
                $10 = i10 % 128;
                if (i10 % i5 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i3];
                        objArr2[0] = java.lang.Integer.valueOf(cArr2[i9]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, 2808 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            i = length;
                            c((short) -1, 0, (byte) 2, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                        } else {
                            i = length;
                        }
                        cArr[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    i = length;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[i9])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.getTrimmedLength("") + 2807, (char) android.text.TextUtils.getTrimmedLength(""));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c((short) -1, 0, (byte) 2, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj2);
                    }
                    cArr[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i9++;
                }
                length = i;
                i3 = 1;
                i5 = 2;
            }
            $11 = ($10 + 33) % 128;
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        java.lang.System.arraycopy(cArr2, i2, cArr3, 0, i4);
        if (bArr2 != null) {
            char[] cArr4 = new char[i4];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i4) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 44, android.graphics.Color.argb(0, 0, 0, 0) + 2836, (char) android.text.TextUtils.getTrimmedLength(""));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        c((short) -1, 0, (byte) $$a.length, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i12 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 43, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2880, (char) android.text.TextUtils.getOffsetAfter("", 0));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        c((short) -1, 0, (byte) 0, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr4[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777182) - android.graphics.Color.rgb(0, 0, 0), 212 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.view.View.combineMeasuredStates(0, 0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            $11 = ($10 + 11) % 128;
            char[] cArr5 = new char[i4];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i13 = i4 - i7;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i13, i7);
            java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i4) {
                $11 = ($10 + 43) % 128;
                cArr6[getaccounttype.writeReplace] = cArr3[(i4 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
                $11 = ($10 + 51) % 128;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i4) {
                $11 = ($10 + 93) % 128;
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void DigitizedCardProfile() {
        getCiacDecline = new int[]{1721817941, -1355375667, -2037319440, -402209582, 922075875, 748834531, -1662915690, -1035593197, 1249852066, 992908647, -1454739786, -2079717072, -1100687716, 1919513736, -893075258, 963344513, 1179940986, -2134710549};
        getGpoResponse = new char[]{16867, 16816, 16721, 16747, 16715, 16803, 16714, 16716, 16716, 16735, 16707, 16718, 16803, 16716, 16744, 16750, 16747, 16738, 16743, 16746, 16818, 16715, 16738, 16743, 16716, 16714, 16745, 16747, 16746, 16819, 16801, 16719, 16817, 16800, 16715, 16738, 16746, 16746, 16736, 16742, 16733, 16829, 16819, 16749, 16747, 16748, 16747, 16741, 16722, 16870, 16886, 16780, 16806, 16804, 16809, 16804, 16830, 16831, 16774, 16781, 16804, 16805, 16800, 16828, 16807, 16806, 16774, 16777, 16807, 16808, 16801, 16773, 16775, 16830, 16830, 16828, 16789, 16786, 16785, 16771, 16775, 16772, 16886, 16890, 16776, 16778, 16893, 16772, 16831, 16807, 16807, 16829, 16803, 16879, 16799, 16786, 16795, 16797, 16799, 16799, 16796, 16775, 16799, 16795, 16776, 16777, 16773, 16773, 16769, 16773, 16770, 16884, 16780, 16807, 16809, 16782, 16894, 16772, 16772, 16780, 16799, 16791, 16799, 16775, 16775, 16775, 16776, 16778, 16777, 16777, 16777, 16792, 16795, 16769, 16768, 16771, 16790, 16795, 16776, 16777, 16773, 16773, 16769, 16773, 16770, 16884, 16781, 16804, 16777, 16772, 16829, 16800, 16788, 16888, 16888, 16771, 16775, 16772, 16886, 16772, 16830, 16830, 16805, 16813, 16811, 16810, 16780, 16781, 16804, 16805, 16808, 16810, 16796, 16894, 16873, 16799, 16831, 16807, 16802, 16802, 16805, 16831, 16774, 16772, 16831, 16800, 16777, 16775, 16800, 16778, 16772, 16829, 16800, 16804, 16776, 16775, 16785, 16771, 16775, 16772, 16886, 16890, 16776, 16778, 16893, 16772, 16831, 16807, 16807, 16829, 16803, 16790, 16886, 16780, 16806, 16804, 16809, 16804, 16830, 16815, 16772, 16778, 16775, 16887, 16802, 16805, 16803, 16811, 16808, 16804, 16831, 16803, 16804, 16800, 16802, 16800, 16791, 16789, 16828, 16830, 16830, 16775, 16780, 16802, 16829, 16803, 16805, 16804, 16781, 16774, 16831, 16830, 16804, 16809, 16804, 16806, 16780, 16886, 16790, 16803, 16829, 16807, 16807, 16831, 16772, 16893, 16778, 16776, 16890, 16886, 16772, 16775, 16771, 16785, 16775, 16870, 16790, 16803, 16829, 16807, 16807, 16831, 16787, 16794, 16808};
    }

    static void init$0() {
        $$a = new byte[]{82, -59, -67, 97};
        $$b = 68;
    }

    public final java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> valueOf() {
        return (java.util.LinkedHashMap) DigitizedCardProfile(new java.lang.Object[]{this}, 749433121, -749433121, java.lang.System.identityHashCode(this));
    }
}
