package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCardManager {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson;
    private static final byte[] DigitizedCardProfile;
    private static char[] SdkCoreBusinessLogicModuleImpl;
    private static int getCiacDecline;
    private static int[] getCvrMaskAnd;
    private static int getGpoResponse;
    private static char getPaymentFci;
    private static final com.payair.hce.transactionCanBeResumed valueOf;
    private static final com.payair.hce.transactionCanBeResumed writeReplace;
    private java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> IccPrivateKeyCrtComponentsJson;
    private boolean RecordsJson;
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.setPinIvCvc3Track2 getAid = com.payair.hce.setMaximumPinTry.valueOf();
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> getProfileVersion;
    private java.lang.Integer values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 66 - (b2 * 4);
        byte[] bArr = $$a;
        int i4 = i * 3;
        int i5 = 4 - (b * 2);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            i3 = i5;
            int i6 = i4;
            int i7 = 0;
            i5++;
            i3 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i5++;
            i3 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCiacDecline = 0;
        getGpoResponse = 1;
        RecordsJson();
        valueOf = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        AlternateContactlessPaymentDataJson = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(new byte[]{-97, 105});
        writeReplace = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) -116);
        DigitizedCardProfile = new byte[]{-97, 106};
        int i = getCiacDecline + 13;
        getGpoResponse = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public setCardManager(com.payair.hce.setPanSequenceNumber setpansequencenumber, com.payair.hce.updateUnlockKeys updateunlockkeys, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) throws com.payair.hce.updateSukFileName {
        if (updateunlockkeys.valueOf() == 1 && updateunlockkeys.writeReplace() == 1) {
            this.RecordsJson = true;
        }
        this.values = java.lang.Integer.valueOf((updateunlockkeys.valueOf() << 8) + updateunlockkeys.writeReplace());
        try {
            android.view.KeyEvent.getModifierMetaStateMask();
            byte valueOf2 = updateunlockkeys.valueOf();
            byte writeReplace2 = updateunlockkeys.writeReplace();
            java.lang.Byte.valueOf(valueOf2);
            java.lang.Byte.valueOf(writeReplace2);
            AlternateContactlessPaymentDataJson(setpansequencenumber, updateunlockkeys.values(), list);
        } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi e) {
            android.view.ViewConfiguration.getEdgeSlop();
            android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.SdkCoreDigitizedCardProfileImpl, e.getMessage());
        }
    }

    public static java.lang.Integer AlternateContactlessPaymentDataJson(byte b, byte b2) {
        int i = getGpoResponse + 107;
        getCiacDecline = i % 128;
        return java.lang.Integer.valueOf(i % 2 != 0 ? (b % 107) >> b2 : (b << 8) + b2);
    }

    private void AlternateContactlessPaymentDataJson(com.payair.hce.setPanSequenceNumber setpansequencenumber, byte[] bArr, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) throws com.payair.hce.updateSukFileName, com.payair.hce.postToastMessageOnUi, com.payair.hce.generateExpiryDate, com.payair.hce.createDemoTransactionCredentials {
        com.payair.hce.getWalletIdentificationDataProvider writeReplace2 = com.payair.hce.getWalletIdentificationDataProvider.writeReplace(bArr);
        if (!writeReplace2.valueOf().valueOf(valueOf)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{-1024972075, 1060801269, -672529381, -914014083, 148856978, 344526678, -1759725261, 1085527466, -1395769234, 54836262, 1003492601, 262235407, 96062329, -294940964}, android.view.KeyEvent.keyCodeFromString("") + 27, objArr);
            throw new com.payair.hce.createDemoTransactionCredentials(((java.lang.String) objArr[0]).intern());
        }
        java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson2 = com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(writeReplace2.AlternateContactlessPaymentDataJson(), 0);
        this.IccPrivateKeyCrtComponentsJson = AlternateContactlessPaymentDataJson2;
        if (!this.RecordsJson) {
            com.payair.hce.transactionCanBeResumed transactioncanberesumed = writeReplace;
            if (AlternateContactlessPaymentDataJson2.containsKey(transactioncanberesumed)) {
                this.SdkCoreAlternateContactlessPaymentDataImpl = com.payair.hce.onRequestSessionCompleted.writeReplace(this.IccPrivateKeyCrtComponentsJson.get(transactioncanberesumed).AlternateContactlessPaymentDataJson().valueOf());
                android.view.ViewConfiguration.getKeyRepeatTimeout();
                java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list2 = this.SdkCoreAlternateContactlessPaymentDataImpl;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(new int[]{-1848985572, 2104955160}, 1 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr2);
                new java.lang.Object[]{com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(list2, ((java.lang.String) objArr2[0]).intern())};
                java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list3 = this.SdkCoreAlternateContactlessPaymentDataImpl;
                if (list3 != null) {
                    setpansequencenumber.valueOf(list3);
                }
            }
        } else {
            int i = getCiacDecline + 67;
            getGpoResponse = i % 128;
            if (i % 2 != 0) {
                com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = AlternateContactlessPaymentDataJson;
                if (!AlternateContactlessPaymentDataJson2.containsKey(transactioncanberesumed2)) {
                    this.getProfileVersion = new java.util.ArrayList();
                    android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                    this.getProfileVersion.add(new com.payair.hce.startDeviceAuthenticationForRegistration(DigitizedCardProfile, (byte) 4));
                } else {
                    getGpoResponse = (getCiacDecline + 121) % 128;
                    this.getProfileVersion = com.payair.hce.onRequestSessionCompleted.writeReplace(this.IccPrivateKeyCrtComponentsJson.get(transactioncanberesumed2).AlternateContactlessPaymentDataJson().valueOf());
                    for (com.payair.hce.startDeviceAuthenticationForRegistration startdeviceauthenticationforregistration : list) {
                        if (!this.getProfileVersion.contains(startdeviceauthenticationforregistration)) {
                            this.getProfileVersion.add(startdeviceauthenticationforregistration);
                            int i2 = getCiacDecline + 79;
                            getGpoResponse = i2 % 128;
                            int i3 = i2 % 2;
                        }
                    }
                }
                setpansequencenumber.values(this.getProfileVersion);
                android.view.ViewConfiguration.getKeyRepeatTimeout();
                java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list4 = this.getProfileVersion;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(new int[]{-1848985572, 2104955160}, 1 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
                new java.lang.Object[]{com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(list4, ((java.lang.String) objArr3[0]).intern())};
                getCiacDecline = (getGpoResponse + 69) % 128;
            } else {
                AlternateContactlessPaymentDataJson2.containsKey(AlternateContactlessPaymentDataJson);
                throw null;
            }
        }
        android.view.View.resolveSizeAndState(0, 0, 0);
        android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        java.util.Collection<com.payair.hce.getWalletIdentificationDataProvider> values = this.IccPrivateKeyCrtComponentsJson.values();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{-1848985572, 2104955160}, -android.view.MotionEvent.axisFromString(""), objArr4);
        new java.lang.Object[]{com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(values, ((java.lang.String) objArr4[0]).intern())};
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        int[] iArr3;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = getCvrMaskAnd;
        long j = 0;
        int i3 = 1;
        int i4 = 0;
        if (iArr4 != null) {
            $11 = ($10 + 59) % 128;
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            int i5 = 0;
            while (i5 < length2) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                    objArr2[0] = java.lang.Integer.valueOf(iArr4[i5]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(j) + 27, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 29, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr5[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i5++;
                    j = 0;
                    i3 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = getCvrMaskAnd;
        if (iArr7 != null) {
            int i6 = $11 + 29;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr7.length;
                iArr2 = new int[length];
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                $10 = ($11 + 81) % 128;
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr7[i7])};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr3 = iArr7;
                    i2 = length;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 27, 28 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr3 = iArr7;
                    i2 = length;
                }
                iArr2[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i7++;
                $10 = ($11 + 95) % 128;
                iArr7 = iArr3;
                length = i2;
                i4 = 0;
            }
            iArr7 = iArr2;
        }
        int i8 = i4;
        java.lang.System.arraycopy(iArr7, i8, iArr6, i8, length3);
        istransitsupported.valueOf = i8;
        while (istransitsupported.valueOf < iArr.length) {
            $10 = ($11 + 61) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr6);
            int i9 = 0;
            for (int i10 = 16; i9 < i10; i10 = 16) {
                int i11 = $10 + 87;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    istransitsupported.DigitizedCardProfile ^= iArr6[i9];
                    java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 5088, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue;
                    i9 += 114;
                } else {
                    istransitsupported.DigitizedCardProfile ^= iArr6[i9];
                    java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 32, 5088 - android.view.View.combineMeasuredStates(0, 0), (char) android.view.View.MeasureSpec.getMode(0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue2;
                    i9++;
                }
            }
            int i12 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i12;
            istransitsupported.values ^= iArr6[16];
            istransitsupported.DigitizedCardProfile ^= iArr6[17];
            int i13 = istransitsupported.DigitizedCardProfile;
            int i14 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr6);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('a' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2923 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (3037 - android.text.TextUtils.getTrimmedLength("")));
                byte b = $$a[3];
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(b, b, b, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public final java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> valueOf() {
        int i = getCiacDecline;
        getGpoResponse = (i + 101) % 128;
        java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list = this.SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i + 11;
        getGpoResponse = i2 % 128;
        if (i2 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> writeReplace() {
        int i = getCiacDecline;
        getGpoResponse = (i + 83) % 128;
        java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list = this.getProfileVersion;
        int i2 = i + 27;
        getGpoResponse = i2 % 128;
        if (i2 % 2 != 0) {
            return list;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> values() {
        int i = getGpoResponse + 23;
        int i2 = i % 128;
        getCiacDecline = i2;
        if (i % 2 != 0) {
            throw null;
        }
        java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> linkedHashMap = this.IccPrivateKeyCrtComponentsJson;
        getGpoResponse = (i2 + 93) % 128;
        return linkedHashMap;
    }

    public final java.lang.Integer AlternateContactlessPaymentDataJson() {
        int i = getCiacDecline;
        getGpoResponse = (i + 99) % 128;
        java.lang.Integer num = this.values;
        int i2 = i + 21;
        getGpoResponse = i2 % 128;
        if (i2 % 2 != 0) {
            return num;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setCardManager setcardmanager = (com.payair.hce.setCardManager) objArr[0];
        int i = (getGpoResponse + 71) % 128;
        getCiacDecline = i;
        boolean z = setcardmanager.RecordsJson;
        int i2 = i + 7;
        getGpoResponse = i2 % 128;
        if (i2 % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String intern;
        getGpoResponse = (getCiacDecline + 41) % 128;
        com.payair.hce.setMaximumPinTry.valueOf();
        android.graphics.Color.argb(0, 0, 0, 0);
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        new java.lang.Object[]{this.values};
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        android.os.Process.getElapsedCpuTime();
        new java.lang.Object[]{java.lang.Boolean.valueOf(this.RecordsJson)};
        android.view.View.resolveSizeAndState(0, 0, 0);
        android.view.KeyEvent.keyCodeFromString("");
        java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list = this.getProfileVersion;
        if (list != null) {
            getCiacDecline = (getGpoResponse + 71) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{-1848985572, 2104955160}, 1 - (android.os.Process.myPid() >> 22), objArr);
            str = com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(list, ((java.lang.String) objArr[0]).intern());
        } else {
            str = "";
        }
        new java.lang.Object[]{str};
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.view.ViewConfiguration.getDoubleTapTimeout();
        java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list2 = this.SdkCoreAlternateContactlessPaymentDataImpl;
        if (list2 != null) {
            int i = getCiacDecline + 43;
            getGpoResponse = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(new int[]{-1848985572, 2104955160}, 1 - (android.util.TypedValue.complexToFloat(1) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(1) == 0.0f ? 0 : -1)), objArr2);
                intern = ((java.lang.String) objArr2[0]).intern();
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(new int[]{-1848985572, 2104955160}, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, objArr3);
                intern = ((java.lang.String) objArr3[0]).intern();
            }
            str2 = com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(list2, intern);
        } else {
            str2 = "";
        }
        new java.lang.Object[]{str2};
        android.view.KeyEvent.getDeadChar(0, 0);
        android.graphics.Color.alpha(0);
        java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> linkedHashMap = this.IccPrivateKeyCrtComponentsJson;
        if (linkedHashMap != null) {
            java.util.Collection<com.payair.hce.getWalletIdentificationDataProvider> values = linkedHashMap.values();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(new int[]{-1848985572, 2104955160}, android.view.View.combineMeasuredStates(0, 0) + 1, objArr4);
            str3 = com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(values, ((java.lang.String) objArr4[0]).intern());
        } else {
            str3 = "";
        }
        new java.lang.Object[]{str3};
        android.view.View.getDefaultSize(0, 0);
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(new int[]{-222431648, 1170797842, 2034925980, 934562442, 523200191, -624127957}, 11 - android.view.View.getDefaultSize(0, 0), objArr5);
        return ((java.lang.String) objArr5[0]).intern();
    }

    static void RecordsJson() {
        getCvrMaskAnd = new int[]{15704671, -9263276, 417052017, -352153731, 1903439636, 1867341519, 996201447, -158881614, -308094063, 266371606, 1774066247, 775694160, 1257062859, 57617267, -1901060369, -2094679926, -622202206, 1076856523};
        SdkCoreBusinessLogicModuleImpl = new char[]{12297, 12324, 12299, 12301, 12293, 12303, 12334, 12327, 12291, 12305, 12345, 12331, 12329, 12332, 12346, 12298, 12300, 12335, 12394, 12325, 12319, 12407, 12294, 12399, 12318, 12344, 12350, 12400, 12323, 12322, 12333, 12311, 12326, 12312, 12314, 12302};
        getPaymentFci = (char) 1494;
    }

    static void init$0() {
        $$a = new byte[]{125, 17, -56, 0};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE;
    }

    public final boolean DigitizedCardProfile() {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, -302605525, 302605525, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
