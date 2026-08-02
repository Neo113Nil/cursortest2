package com.payair.hce;

/* loaded from: classes4.dex */
public class setIccPrivateKeyCrtComponents extends com.payair.hce.isPrimaryAidMchipDataValid<com.payair.hce.getMpaObject> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static char SdkCoreBusinessLogicModuleImpl;
    private static int getApplicationLifeCycleData;
    private static char getCiacDecline;
    private static char getCvrMaskAnd;
    private static int getGpoResponse;
    private static char getPaymentFci;
    private com.payair.hce.access000 DigitizedCardProfile;
    private com.payair.hce.startDeviceAuthenticationForPurchase IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.access400 RecordsJson;
    private com.payair.hce.transactionCanBeResumed getAid;
    private com.payair.hce.access300 getProfileVersion;
    private com.payair.hce.requestChangePin writeReplace;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 1 - (s2 * 3);
        ?? r8 = 111 - b;
        int i4 = 3 - (s * 2);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            byte b2 = r8;
            i = 0;
            int i5 = i4;
            int i6 = i5;
            i2 = i4 + b2;
            i4 = i6;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i4 + 1;
            b2 = bArr[i7];
            int i8 = i2;
            i5 = i7;
            i4 = i8;
            int i62 = i5;
            i2 = i4 + b2;
            i4 = i62;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i3) {
            }
        } else {
            i = 0;
            i2 = r8;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i3) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            int i3 = $11 + 55;
            $10 = i3 % 128;
            int i4 = 58224;
            if (i3 % 2 != 0) {
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson >> 1];
                i2 = 1;
            } else {
                cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                $11 = ($10 + 105) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i4) ^ ((c2 << 4) + ((char) (getCiacDecline ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(SdkCoreBusinessLogicModuleImpl)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 62, 1336 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((short) 0, (short) 0, (byte) 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (getPaymentFci ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getCvrMaskAnd)};
                    int i5 = charValue + i4;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 62, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1335, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c((short) 0, (short) 0, (byte) 1, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i4 -= 40503;
                    i2++;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 53, android.view.View.MeasureSpec.getSize(0) + 3543, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        int i6 = $10 + 29;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getGpoResponse = 0;
        getApplicationLifeCycleData = 1;
        writeReplace();
        com.payair.hce.setRecords.values((byte) 42, com.payair.hce.setIccPrivateKeyCrtComponents.class);
        getGpoResponse = (getApplicationLifeCycleData + 113) % 128;
    }

    public setIccPrivateKeyCrtComponents() {
        DigitizedCardProfile(Byte.MIN_VALUE);
        writeReplace((byte) -114);
        AlternateContactlessPaymentDataJson(Byte.MIN_VALUE);
        DigitizedCardProfile();
        DigitizedCardProfile(com.payair.hce.onDeleteCardCompleted.valueOf.values);
    }

    @Override // com.payair.hce.isPrimaryAidMchipDataValid
    protected final com.payair.hce.getContactlessSupported valueOf() throws com.payair.hce.getAtcCount {
        getApplicationLifeCycleData = (getGpoResponse + 121) % 128;
        com.payair.hce.access000 access000Var = (com.payair.hce.access000) this.values.AlternateContactlessPaymentDataJson();
        this.DigitizedCardProfile = access000Var;
        this.writeReplace = (com.payair.hce.requestChangePin) ((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, 857149142, -857149112, java.lang.System.identityHashCode(access000Var)));
        com.payair.hce.access000 access000Var2 = this.DigitizedCardProfile;
        com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var2}, -1529917445, 1529917464, java.lang.System.identityHashCode(access000Var2));
        com.payair.hce.access000 access000Var3 = this.DigitizedCardProfile;
        com.payair.hce.useDemoMode usedemomode = (com.payair.hce.useDemoMode) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var3}, -1433364550, 1433364556, java.lang.System.identityHashCode(access000Var3));
        com.payair.hce.access000 access000Var4 = this.DigitizedCardProfile;
        com.payair.hce.setDigitizedCardId setdigitizedcardid = (com.payair.hce.setDigitizedCardId) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var4}, -725902463, 725902486, java.lang.System.identityHashCode(access000Var4));
        this.getAid = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) 0);
        com.payair.hce.access000 access000Var5 = this.DigitizedCardProfile;
        this.RecordsJson = (com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var5}, -2078363504, 2078363507, java.lang.System.identityHashCode(access000Var5));
        com.payair.hce.access000 access000Var6 = this.DigitizedCardProfile;
        this.getProfileVersion = (com.payair.hce.access300) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var6}, 490902825, -490902823, java.lang.System.identityHashCode(access000Var6));
        com.payair.hce.access000 access000Var7 = this.DigitizedCardProfile;
        com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var7}, 1677078065, -1677078051, java.lang.System.identityHashCode(access000Var7));
        this.DigitizedCardProfile.getCrmCountryCode();
        byte[] cvrMaskAnd = ((com.payair.hce.getMpaObject) this.valueOf).getCvrMaskAnd();
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        new java.lang.Object[]{com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(cvrMaskAnd)};
        com.payair.hce.setPanSequenceNumber setpansequencenumber = (com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir));
        java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list = (java.util.List) com.payair.hce.setPanSequenceNumber.DigitizedCardProfile(new java.lang.Object[]{setpansequencenumber}, -1172440258, 1172440258, java.lang.System.identityHashCode(setpansequencenumber));
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track22 = this.AlternateContactlessPaymentDataJson;
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{11, 1, 0, 1}, "\u0000", false, objArr);
        new java.lang.Object[]{com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(list, ((java.lang.String) objArr[0]).intern())};
        if (list != null) {
            int i = getGpoResponse + 119;
            getApplicationLifeCycleData = i % 128;
            if (i % 2 == 0) {
                com.payair.hce.onRequestSessionCompleted.values((java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration>) list);
                int length = cvrMaskAnd.length;
                throw null;
            }
            if (com.payair.hce.onRequestSessionCompleted.values((java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration>) list) != cvrMaskAnd.length) {
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track23 = this.AlternateContactlessPaymentDataJson;
                android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getMppLiteModule);
            }
            com.payair.hce.access400 access400Var = this.RecordsJson;
            try {
                getGpoResponse = (getApplicationLifeCycleData + 61) % 128;
                int i2 = 0;
                for (com.payair.hce.startDeviceAuthenticationForRegistration startdeviceauthenticationforregistration : list) {
                    com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider = new com.payair.hce.getWalletIdentificationDataProvider(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(startdeviceauthenticationforregistration.valueOf()), com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(java.util.Arrays.copyOfRange(cvrMaskAnd, i2, startdeviceauthenticationforregistration.AlternateContactlessPaymentDataJson() + i2)));
                    com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track24 = this.AlternateContactlessPaymentDataJson;
                    android.util.TypedValue.complexToFloat(0);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(getwalletidentificationdataprovider.valueOf().writeReplace());
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    b("ᓽ\u0557", 1 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr2);
                    sb.append(((java.lang.String) objArr2[0]).intern());
                    sb.append(getwalletidentificationdataprovider.RecordsJson());
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b("ᓽ\u0557", android.view.KeyEvent.normalizeMetaState(0) + 1, objArr3);
                    sb.append(((java.lang.String) objArr3[0]).intern());
                    sb.append(getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson());
                    new java.lang.Object[]{sb.toString()};
                    access400Var.DigitizedCardProfile(getwalletidentificationdataprovider);
                    i2 += startdeviceauthenticationforregistration.AlternateContactlessPaymentDataJson();
                }
            } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi | java.lang.RuntimeException unused) {
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track25 = this.AlternateContactlessPaymentDataJson;
                android.graphics.ImageFormat.getBitsPerPixel(0);
                throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getPinAlwaysRequiredIfCurrencyNotProvided);
            }
        }
        this.getProfileVersion.DigitizedCardProfile();
        if (!((com.payair.hce.createConfigurationContext) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -775162360, 775162363, java.lang.System.identityHashCode(getcodecachedir))).SdkCoreAlternateContactlessPaymentDataImpl()) {
            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track26 = this.AlternateContactlessPaymentDataJson;
            throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getBusinessLogicModule);
        }
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track27 = this.AlternateContactlessPaymentDataJson;
        java.util.List list2 = (java.util.List) com.payair.hce.setDigitizedCardId.DigitizedCardProfile(new java.lang.Object[]{setdigitizedcardid, this.DigitizedCardProfile}, -376858347, 376858351, java.lang.System.identityHashCode(setdigitizedcardid));
        com.payair.hce.setMppLiteModule setmpplitemodule = new com.payair.hce.setMppLiteModule((com.payair.hce.reInitialize) com.payair.hce.isPrimaryAidMchipDataValid.valueOf(new java.lang.Object[]{list2}, -153455829, 153455830, (int) java.lang.System.currentTimeMillis()), list2);
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track28 = this.AlternateContactlessPaymentDataJson;
        com.payair.hce.removeCard profileVersion = this.writeReplace.getProfileVersion();
        this.writeReplace.AlternateContactlessPaymentDataJson();
        com.payair.hce.getContactlessSupported DigitizedCardProfile = DigitizedCardProfile(usedemomode.values(setmpplitemodule, profileVersion), setmpplitemodule);
        getApplicationLifeCycleData = (getGpoResponse + 33) % 128;
        return DigitizedCardProfile;
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        int i2 = $10 + 21;
        $11 = i2 % 128;
        byte[] bArr = str2;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = SdkCoreAlternateContactlessPaymentDataImpl;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i7])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 29, 2807 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((short) 0, (short) 0, (byte) 2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    $11 = ($10 + 101) % 128;
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
        char[] cArr3 = new char[i4];
        java.lang.System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr2 != null) {
            char[] cArr4 = new char[i4];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i4) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i8 = $10 + 29;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, android.view.View.MeasureSpec.getSize(0) + 2836, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            c((short) 0, (short) 0, (byte) $$a.length, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                        }
                        cArr4[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2836, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        c((short) 0, (short) 0, (byte) $$a.length, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2880, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        c((short) 0, (short) 0, (byte) 0, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 34, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.os.Process.myTid() >> 22))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            $11 = ($10 + 19) % 128;
            char[] cArr5 = new char[i4];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i12, i6);
            java.lang.System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i4) {
                cArr6[getaccounttype.writeReplace] = cArr3[(i4 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            $10 = ($11 + 27) % 128;
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i4) {
                int i13 = $10 + 99;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] >> iArr[5]);
                    i = getaccounttype.writeReplace << 1;
                } else {
                    cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                    i = getaccounttype.writeReplace + 1;
                }
                getaccounttype.writeReplace = i;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private com.payair.hce.getContactlessSupported DigitizedCardProfile(com.payair.hce.reInitialize reinitialize, com.payair.hce.setMppLiteModule setmpplitemodule) throws com.payair.hce.getAtcCount {
        com.payair.hce.getContactlessSupported aid;
        com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences;
        if (reinitialize != com.payair.hce.reInitialize.writeReplace) {
            getApplicationLifeCycleData = (getGpoResponse + 115) % 128;
            com.payair.hce.access000.SdkCoreCardRiskManagementDataImpl();
        }
        com.payair.hce.access000 access000Var = this.DigitizedCardProfile;
        com.payair.hce.onSdkUnregistered onsdkunregistered = (com.payair.hce.onSdkUnregistered) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, -487406649, 487406674, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.access000 access000Var2 = this.DigitizedCardProfile;
        com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var2}, -1529917445, 1529917464, java.lang.System.identityHashCode(access000Var2));
        com.payair.hce.setPanSequenceNumber setpansequencenumber = (com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir));
        com.payair.hce.requestChangePin requestchangepin = this.writeReplace;
        int intValue = ((java.lang.Integer) com.payair.hce.requestSetWalletPin.writeReplace(new java.lang.Object[]{requestchangepin, reinitialize, setmpplitemodule, (com.payair.hce.suspendCardForToken) com.payair.hce.initialize.valueOf(new java.lang.Object[]{setpansequencenumber}, -566547452, 566547452, java.lang.System.identityHashCode(setpansequencenumber)), setpansequencenumber.getCvmResetTimeout(), com.payair.hce.activateCardForToken.writeReplace}, 1973476689, -1973476689, java.lang.System.identityHashCode(requestchangepin))).intValue();
        com.payair.hce.clearInternalStorage DigitizedCardProfile = com.payair.hce.requestChangePin.DigitizedCardProfile(intValue, setpansequencenumber.getCvmResetTimeout());
        try {
            if (this.RecordsJson.RecordsJson().DigitizedCardProfile()) {
                this.getProfileVersion.DigitizedCardProfile(intValue, reinitialize, setmpplitemodule);
            } else {
                com.payair.hce.access300 access300Var = this.getProfileVersion;
                com.payair.hce.access300.values(new java.lang.Object[]{access300Var}, -208460597, 208460598, java.lang.System.identityHashCode(access300Var));
            }
        } catch (com.payair.hce.getSetPinRequestData unused) {
            com.payair.hce.access300 access300Var2 = this.getProfileVersion;
            com.payair.hce.access300.values(new java.lang.Object[]{access300Var2}, -208460597, 208460598, java.lang.System.identityHashCode(access300Var2));
        }
        int i = com.payair.hce.setIccPrivateKeyCrtComponents.AnonymousClass3.AlternateContactlessPaymentDataJson[reinitialize.ordinal()];
        if (i == 1) {
            try {
                com.payair.hce.startDeviceAuthenticationForPurchase valueOf = onsdkunregistered.valueOf(com.payair.hce.getUrl.values, com.payair.hce.activateCardForToken.writeReplace);
                this.IccPrivateKeyCrtComponentsJson = valueOf;
                writeReplace(new java.lang.Object[]{this, valueOf}, 358723528, -358723528, java.lang.System.identityHashCode(this));
                aid = getAid();
                getmdescardsuniquetokenreferences = com.payair.hce.getMDESCardsUniqueTokenReferences.writeReplace;
                getGpoResponse = (getApplicationLifeCycleData + 33) % 128;
            } catch (com.payair.hce.setUserID unused2) {
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
                android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRemotePaymentDataImpl);
            }
        } else if (i == 2) {
            try {
                com.payair.hce.startDeviceAuthenticationForPurchase valueOf2 = onsdkunregistered.valueOf(com.payair.hce.getUrl.values, com.payair.hce.activateCardForToken.writeReplace);
                this.IccPrivateKeyCrtComponentsJson = valueOf2;
                writeReplace(new java.lang.Object[]{this, valueOf2}, 358723528, -358723528, java.lang.System.identityHashCode(this));
                aid = getAid();
                getmdescardsuniquetokenreferences = com.payair.hce.getMDESCardsUniqueTokenReferences.values;
                try {
                    com.payair.hce.access400 access400Var = this.RecordsJson;
                    com.payair.hce.access000.AlternateContactlessPaymentDataJson(new com.payair.hce.onReplenishFailed((com.payair.hce.provisionFromLocalStorage) com.payair.hce.access400.writeReplace(new java.lang.Object[]{access400Var}, 1737569389, -1737569387, java.lang.System.identityHashCode(access400Var)), this.RecordsJson.valueOf(), this.writeReplace.valueOf()));
                } catch (com.payair.hce.getSetPinRequestData unused3) {
                    throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getAckAlwaysRequiredIfCurrencyNotProvided);
                }
            } catch (com.payair.hce.setUserID unused4) {
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track22 = this.AlternateContactlessPaymentDataJson;
                android.view.ViewConfiguration.getFadingEdgeLength();
                throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRemotePaymentDataImpl);
            }
        } else if (i == 3) {
            try {
                com.payair.hce.startDeviceAuthenticationForPurchase valueOf3 = onsdkunregistered.valueOf(com.payair.hce.getUrl.writeReplace, com.payair.hce.activateCardForToken.writeReplace);
                this.IccPrivateKeyCrtComponentsJson = valueOf3;
                writeReplace(new java.lang.Object[]{this, valueOf3}, 358723528, -358723528, java.lang.System.identityHashCode(this));
                com.payair.hce.access000 access000Var3 = this.DigitizedCardProfile;
                ((com.payair.hce.processNotificationData) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var3}, -1684199295, 1684199305, java.lang.System.identityHashCode(access000Var3))).AlternateContactlessPaymentDataJson();
                aid = AlternateContactlessPaymentDataJson(DigitizedCardProfile, intValue);
                getmdescardsuniquetokenreferences = com.payair.hce.getMDESCardsUniqueTokenReferences.valueOf;
            } catch (com.payair.hce.setUserID unused5) {
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track23 = this.AlternateContactlessPaymentDataJson;
                android.view.ViewConfiguration.getJumpTapTimeout();
                throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRemotePaymentDataImpl);
            }
        } else {
            throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl);
        }
        com.payair.hce.onReplenishCompleted onreplenishcompleted = new com.payair.hce.onReplenishCompleted(getmdescardsuniquetokenreferences, this.writeReplace.AlternateContactlessPaymentDataJson(), this.writeReplace.getProfileVersion(), this.getAid);
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track24 = this.AlternateContactlessPaymentDataJson;
        new java.lang.Object[]{onreplenishcompleted};
        com.payair.hce.access000 access000Var4 = this.DigitizedCardProfile;
        ((com.payair.hce.onShowAuthenticateScreen) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var4}, 1571618569, -1571618562, java.lang.System.identityHashCode(access000Var4))).DigitizedCardProfile(onreplenishcompleted);
        return aid;
    }

    /* renamed from: com.payair.hce.setIccPrivateKeyCrtComponents$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] AlternateContactlessPaymentDataJson;
        private static int values = 0;
        private static int writeReplace = 1;

        static {
            int[] iArr = new int[com.payair.hce.reInitialize.values().length];
            AlternateContactlessPaymentDataJson = iArr;
            try {
                iArr[com.payair.hce.reInitialize.DigitizedCardProfile.ordinal()] = 1;
                int i = values;
                writeReplace = ((i & 51) + (i | 51)) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.reInitialize.writeReplace.ordinal()] = 2;
                int i2 = writeReplace;
                int i3 = i2 ^ 33;
                int i4 = ((i2 & 33) | i3) << 1;
                int i5 = -i3;
                values = ((i4 & i5) + (i4 | i5)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.reInitialize.valueOf.ordinal()] = 3;
                int i6 = values;
                int i7 = i6 & 13;
                int i8 = (i6 ^ 13) | i7;
                writeReplace = ((i7 & i8) + (i8 | i7)) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private com.payair.hce.getContactlessSupported getAid() throws com.payair.hce.getAtcCount {
        int i = getGpoResponse + 83;
        getApplicationLifeCycleData = i % 128;
        try {
            if (i % 2 != 0) {
                if (!this.RecordsJson.RecordsJson().DigitizedCardProfile()) {
                    throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getRecordValue);
                }
                com.payair.hce.setBit setbit = new com.payair.hce.setBit();
                setbit.valueOf(this.getProfileVersion.getAid().valueOf(), this.getProfileVersion.RecordsJson());
                int i2 = getGpoResponse + 109;
                getApplicationLifeCycleData = i2 % 128;
                if (i2 % 2 != 0) {
                    return setbit;
                }
                throw null;
            }
            this.RecordsJson.RecordsJson().DigitizedCardProfile();
            throw new java.lang.NullPointerException();
        } catch (com.payair.hce.getSetPinRequestData unused) {
            throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getRecordValue);
        }
    }

    private com.payair.hce.getContactlessSupported AlternateContactlessPaymentDataJson(com.payair.hce.clearInternalStorage clearinternalstorage, int i) throws com.payair.hce.getAtcCount {
        getApplicationLifeCycleData = (getGpoResponse + 83) % 128;
        try {
            try {
                this.getProfileVersion.valueOf().valueOf();
                com.payair.hce.clearAllTables aid = this.getProfileVersion.getAid();
                com.payair.hce.getAllCmsCFormattedTransactionCredentials aid2 = this.RecordsJson.getAid();
                com.payair.hce.transactionCanBeResumed writeReplace = com.payair.hce.transactionCanBeResumed.writeReplace(8);
                com.payair.hce.access000 access000Var = this.DigitizedCardProfile;
                com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access000Var));
                com.payair.hce.setPanSequenceNumber setpansequencenumber = (com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir));
                com.payair.hce.transactionCanBeResumed transactioncanberesumed = (com.payair.hce.transactionCanBeResumed) com.payair.hce.setPanSequenceNumber.DigitizedCardProfile(new java.lang.Object[]{setpansequencenumber}, 873389637, -873389636, java.lang.System.identityHashCode(setpansequencenumber));
                writeReplace.valueOf(0, transactioncanberesumed.valueOf());
                writeReplace.valueOf(transactioncanberesumed.DigitizedCardProfile(), aid2.SdkCoreAlternateContactlessPaymentDataImpl().valueOf());
                writeReplace.valueOf(transactioncanberesumed.DigitizedCardProfile() + aid2.SdkCoreAlternateContactlessPaymentDataImpl().valueOf().length, aid.valueOf().valueOf());
                com.payair.hce.access000 access000Var2 = this.DigitizedCardProfile;
                byte[] values = ((com.payair.hce.onSdkUnregistered) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var2}, -487406649, 487406674, java.lang.System.identityHashCode(access000Var2))).values(writeReplace.valueOf(), com.payair.hce.clearInternalStorage.writeReplace);
                com.payair.hce.access000 access000Var3 = this.DigitizedCardProfile;
                byte[] values2 = ((com.payair.hce.onSdkUnregistered) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var3}, -487406649, 487406674, java.lang.System.identityHashCode(access000Var3))).values(writeReplace.valueOf(), clearinternalstorage);
                if (values != null) {
                    int i2 = getGpoResponse + 105;
                    getApplicationLifeCycleData = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    if (values2 != null) {
                        com.payair.hce.clearAllTables aid3 = this.getProfileVersion.getAid();
                        int AlternateContactlessPaymentDataJson = (int) (com.payair.hce.onRequestSessionCompleted.AlternateContactlessPaymentDataJson(new byte[]{values[0], values[1]}) % 1000);
                        int AlternateContactlessPaymentDataJson2 = (int) (com.payair.hce.onRequestSessionCompleted.AlternateContactlessPaymentDataJson(new byte[]{values2[6], values2[7]}) % 1000);
                        com.payair.hce.transactionCanBeResumed valueOf = aid3.valueOf();
                        int AlternateContactlessPaymentDataJson3 = (int) (com.payair.hce.onRequestSessionCompleted.AlternateContactlessPaymentDataJson(new byte[]{valueOf.AlternateContactlessPaymentDataJson(0), valueOf.AlternateContactlessPaymentDataJson(1)}) % 100);
                        byte[] array = java.nio.ByteBuffer.allocate(4).order(java.nio.ByteOrder.BIG_ENDIAN).putInt(AlternateContactlessPaymentDataJson + ((AlternateContactlessPaymentDataJson3 / 10) * 1000)).array();
                        byte[] array2 = java.nio.ByteBuffer.allocate(4).order(java.nio.ByteOrder.BIG_ENDIAN).putInt(AlternateContactlessPaymentDataJson2 + ((AlternateContactlessPaymentDataJson3 % 10) * 1000)).array();
                        byte[] bArr = {array2[2], array2[3], array[2], array[3], 0, 0, 0, 0};
                        com.payair.hce.onAuthenticationFailed.writeReplace(array);
                        com.payair.hce.onAuthenticationFailed.writeReplace(array2);
                        com.payair.hce.onAuthenticationFailed.writeReplace(values2);
                        com.payair.hce.onAuthenticationFailed.writeReplace(values);
                        com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson4 = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(java.util.Arrays.copyOfRange(bArr, 0, 2));
                        com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson5 = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(java.util.Arrays.copyOfRange(bArr, 2, 4));
                        com.payair.hce.access000 access000Var4 = this.DigitizedCardProfile;
                        com.payair.hce.onUserValidationObtained onuservalidationobtained = (com.payair.hce.onUserValidationObtained) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var4}, 706360202, -706360174, java.lang.System.identityHashCode(access000Var4));
                        com.payair.hce.access000 access000Var5 = this.DigitizedCardProfile;
                        com.payair.hce.getCodeCacheDir getcodecachedir2 = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var5}, -1529917445, 1529917464, java.lang.System.identityHashCode(access000Var5));
                        com.payair.hce.access000 access000Var6 = this.DigitizedCardProfile;
                        this.getAid = onuservalidationobtained.DigitizedCardProfile(getcodecachedir2, (com.payair.hce.onSdkUnregistered) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var6}, -487406649, 487406674, java.lang.System.identityHashCode(access000Var6)), ((com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir2}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir2))).DigitizedCardProfile(), ((com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir2}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir2))).IccPrivateKeyCrtComponentsJson(), AlternateContactlessPaymentDataJson4, AlternateContactlessPaymentDataJson5, this.RecordsJson.getAid().SdkCoreAlternateContactlessPaymentDataImpl(), this.writeReplace.AlternateContactlessPaymentDataJson().DigitizedCardProfile() == com.payair.hce.getAppVersion.writeReplace && i == com.payair.hce.setApplicationExpiryDate.values);
                        com.payair.hce.setBit setbit = new com.payair.hce.setBit();
                        setbit.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson4, AlternateContactlessPaymentDataJson4, AlternateContactlessPaymentDataJson5, this.getProfileVersion.RecordsJson());
                        getGpoResponse = (getApplicationLifeCycleData + 47) % 128;
                        return setbit;
                    }
                }
                com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate = com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(new int[]{106, 29, 29, 16}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr);
                throw new com.payair.hce.getCurrentRequestId(requesttaskstatusupdate, ((java.lang.String) objArr[0]).intern());
            } catch (com.payair.hce.getSetPinRequestData unused) {
                throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getAckAlwaysRequiredIfCurrencyNotProvided);
            }
        } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused2) {
            throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl);
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setIccPrivateKeyCrtComponents seticcprivatekeycrtcomponents = (com.payair.hce.setIccPrivateKeyCrtComponents) objArr[0];
        try {
            seticcprivatekeycrtcomponents.getProfileVersion.writeReplace(new com.payair.hce.clearAllTables(((com.payair.hce.startDeviceAuthenticationForPurchase) objArr[1]).writeReplace()));
            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = seticcprivatekeycrtcomponents.AlternateContactlessPaymentDataJson;
            android.os.Process.getThreadPriority(0);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{135, 31, 35, 7}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001", true, objArr2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr2[0]).intern());
            sb.append(seticcprivatekeycrtcomponents.getProfileVersion.getAid().writeReplace());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b("\ue0e1＂\udfe6밠↮꠩齰\ue661苈䀥酭죆", 12 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(seticcprivatekeycrtcomponents.getProfileVersion.getAid().valueOf());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(new int[]{166, 2, 7, 0}, "\u0000\u0000", true, objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            new java.lang.Object[]{sb.toString()};
            getGpoResponse = (getApplicationLifeCycleData + 23) % 128;
            return null;
        } catch (com.payair.hce.postToastMessageOnUi unused) {
            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track22 = seticcprivatekeycrtcomponents.AlternateContactlessPaymentDataJson;
            android.view.ViewConfiguration.getMaximumDrawingCacheSize();
            throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl);
        }
    }

    @Override // com.payair.hce.isPrimaryAidMchipDataValid
    protected final /* synthetic */ com.payair.hce.getMpaObject DigitizedCardProfile(byte[] bArr) throws com.payair.hce.digitize {
        com.payair.hce.getMpaObject getmpaobject = new com.payair.hce.getMpaObject(bArr);
        int i = getApplicationLifeCycleData + 15;
        getGpoResponse = i % 128;
        if (i % 2 == 0) {
            return getmpaobject;
        }
        throw null;
    }

    static void writeReplace() {
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{16886, 16801, 16788, 16794, 16802, 16802, 16799, 16893, 16768, 16824, 16800, 16856, 16893, 16809, 16804, 16806, 16786, 16784, 16808, 16780, 16888, 16793, 16810, 16803, 16829, 16829, 16803, 16802, 16804, 16780, 16780, 16812, 16804, 16804, 16782, 16777, 16800, 16831, 16772, 16781, 16804, 16828, 16831, 16807, 16780, 16778, 16805, 16777, 16774, 16831, 16830, 16887, 16802, 16802, 16829, 16788, 16894, 16781, 16804, 16805, 16805, 16801, 16830, 16804, 16802, 16805, 16788, 16812, 16831, 16807, 16807, 16830, 16895, 16812, 16804, 16830, 16809, 16807, 16813, 16815, 16800, 16831, 16770, 16876, 16780, 16810, 16808, 16803, 16800, 16805, 16805, 16793, 16792, 16804, 16805, 16800, 16829, 16802, 16810, 16807, 16830, 16815, 16785, 16800, 16802, 16800, 16894, 16807, 16807, 16790, 16776, 16784, 16712, 16709, 16709, 16705, 16735, 16713, 16713, 16709, 16711, 16709, 16824, 16822, 16705, 16707, 16707, 16808, 16785, 16711, 16734, 16708, 16710, 16713, 16814, 16781, 16711, 16707, 16735, 16733, 16821, 16831, 16801, 16820, 16704, 16705, 16730, 16730, 16731, 16818, 16821, 16735, 16705, 16735, 16704, 16715, 16707, 16733, 16708, 16706, 16712, 16714, 16735, 16705, 16735, 16707, 16892, 16772};
        getPaymentFci = (char) 1394;
        getCvrMaskAnd = (char) 27658;
        getCiacDecline = (char) 50085;
        SdkCoreBusinessLogicModuleImpl = (char) 61950;
    }

    static void init$0() {
        $$a = new byte[]{37, 88, 64, 59};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
    }

    private void writeReplace(com.payair.hce.startDeviceAuthenticationForPurchase startdeviceauthenticationforpurchase) throws com.payair.hce.getAtcCount {
        writeReplace(new java.lang.Object[]{this, startdeviceauthenticationforpurchase}, 358723528, -358723528, java.lang.System.identityHashCode(this));
    }
}
